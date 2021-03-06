package io.zipcoder;
import java.util.ArrayList;
import java.util.List;

public class Music {

    private ArrayList<String> playList = new ArrayList<String>();

    public Music(String[] playList){
        for(int i=0;i<playList.length;i++){
            this.playList.add(playList[i]);
        }
    }

    public Integer selection(Integer startIndex, String selection){
        int clicksUp = 0;
        int clicksDown = 0;

        for(int i=startIndex;i<playList.size();i++){
            if(playList.get(i) == selection){
                break;
            }
            if(i==playList.size()-1){
                i=0;
            }
            clicksUp++;
        }

        for(int i=startIndex;i>-1;i--){
            if(playList.get(i) == selection){
                break;
            }
            if(i==0){
                i= playList.size();
            }
            clicksDown++;
        }

        if(clicksUp < clicksDown){
            return clicksUp;
        }
        else{
            return clicksDown;
        }

    }
}
