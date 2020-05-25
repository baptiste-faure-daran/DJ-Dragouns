package com.company.events;

import com.company.characters.Hero;
import com.company.engine.Case;

public class EmptyCase implements Case {

    @Override
    public void interract(Hero h) {
        System.out.println("Case vide, comme le reflet de ton âme");
    }
}
