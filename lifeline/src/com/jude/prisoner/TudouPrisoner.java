package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;
public class TudouPrisoner implements Prisoner{
    private int totalCount;
    private int totalPerson;

    public String getName() {
        return "赵倩2018211369";
    }


    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }


    public int take(int index, int last) {
        if (index == 0) {
            return totalCount / totalPerson * 9 / 10;
        }
        else {
            if (index < totalPerson / 2) {
                return ((totalCount - last) / index + last / (totalPerson - index)) / 2;
            } else {
                return ((totalCount - last) / index + totalCount / totalPerson) / 2;
            }
        }
    }

    public void result(boolean survived) {
    }
}
