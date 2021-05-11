package com.tchokoapps.lotto.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LottoGeneratorApp {
    private static final Integer[] ALL_NUMBERS = {15, 16, 17, 18, 19, 25, 26, 27, 28, 29, 35, 36, 37, 38, 39, 45, 46, 47, 48, 49};


    public static void main(String[] args) {
        getNumbers(24, ALL_NUMBERS);
    }

    private static void getNumbers(final int lines, final Integer[] numArr) {
        if (lines <= 0) {
            System.out.println(String.format("Lines %s is not allowed. Lines must be greater than 0.", lines));
        }

        if (numArr.length == 0) {
            System.out.println("Array numbers must not be empty.");
        }

        final List<Integer> numList = Arrays.asList(ALL_NUMBERS);
        List<Integer> tmpList = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            tmpList.clear();
            Collections.shuffle(numList);
            for (int j = 0; j < 6; j++) {
                tmpList.add(numList.get(j));
            }
            System.out.println(tmpList);
        }

    }
}
