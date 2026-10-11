/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends pi {
    int field_p;
    static we field_q;
    int field_o;
    int field_n;
    int field_r;
    static String[][] field_u;
    int field_t;
    int field_s;
    static String field_v;

    final static void a(int param0, int param1, int param2, int param3, pb param4, int param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        ud stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ud var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        pb var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = MinerDisturbance.field_ab;
        try {
          var44 = param4;
          if (var44.field_x != null &&
            1 < var44.field_E) {
            var60 = var44.field_x;
            re.a(0, var60, di.field_V, 0, 0);
          } else {
            wc.c((byte) -29);
          }
          var54 = new int[param4.field_g];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param4.field_g];
          var62 = fb.field_b;
          if (param0 != -1) {
            sl.e(-76);
          }
          var63 = sf.field_a;
          var61 = h.field_a;
          for (var13 = 0; param4.field_g > var13; var13++) {
            var14 = param6 * var61[var13] + param3 * var62[var13] + param1 * var63[var13] >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 >= 128) {
                stackIn_18_0 = 256;
              } else {
                stackIn_18_0 = var14 + 128;
              }
            } else {
              stackIn_18_0 = 128;
            }
            var14Lifetime2 = stackIn_18_0;
            var15 = param5 * var63[var13] + param2 * var62[var13] + var61[var13] * param7 >> 8;
            stackIn_20_0 = w.field_R;
            if (var15 >= 0) {
              stackIn_21_1 = var15;
            } else {
              stackIn_21_1 = -var15;
            }
            var15Lifetime2 = stackIn_20_0[stackIn_21_1];
            var14Lifetime2 = var14Lifetime2 * (-var15Lifetime2 + 256) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; ik.field_T > var13Lifetime1; var13Lifetime1++) {
            var14Lifetime1 = ta.field_d[var13Lifetime1];
            var15Lifetime1 = param4.field_e[var14Lifetime1];
            var16 = param4.field_O[var14Lifetime1];
            var17 = param4.field_F[var14Lifetime1];
            if (param4.field_f[var14Lifetime1] >= fb.field_b.length) {
              stackIn_27_0 = -1;
            } else {
              stackIn_27_0 = param4.field_f[var14Lifetime1];
            }
            var18 = stackIn_27_0;
            if (param4.field_w[var14Lifetime1] >= fb.field_b.length) {
              stackIn_30_0 = -1;
            } else {
              stackIn_30_0 = param4.field_w[var14Lifetime1];
            }
            var19 = stackIn_30_0;
            if (fb.field_b.length <= param4.field_d[var14Lifetime1]) {
              stackIn_33_0 = -1;
            } else {
              stackIn_33_0 = param4.field_d[var14Lifetime1];
            }
            var20 = stackIn_33_0;
            if (bl.field_v != null &&
              null != param4.field_G &&
              var14Lifetime1 < param4.field_G.length &&
              param4.field_G[var14Lifetime1] != -1 &&
              param4.field_G[var14Lifetime1] < bl.field_v.length) {
              stackIn_40_0 = bl.field_v[param4.field_G[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = wa.field_d[var15Lifetime1];
            var23 = ti.field_O[var15Lifetime1];
            var24 = wa.field_d[var16];
            var25 = ti.field_O[var16];
            var26 = wa.field_d[var17];
            var27 = ti.field_O[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_45_0 = 8355711;
              } else {
                stackIn_45_0 = var21.field_d;
              }
              var30 = stackIn_45_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = (var28 * var31 & -16711816) >>> 8 | (var28 * var32 & 16711867) >>> 8;
              var33 = var33 + var29 * 65793;
              cn.a(var27, ~param0, var22, var25, var26, var23, var24, (16711422 & var33) >> 1);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_49_0 = var21.field_d;
              } else {
                stackIn_49_0 = 8355711;
              }
              var34 = stackIn_49_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = (var28 * var35 & -16711787) >>> 8 | 2013331200 & var28 * var36 >>> 8;
              var38 = var29 * var35 >>> 8 & -2113994497 | (16711884 & var36 * var29) >>> 8;
              var39 = -234815744 & var36 * var30 >>> 8 | 402587903 & var35 * var30 >>> 8;
              var38 = var38 + 65793 * var32;
              var37 = var37 + 65793 * var31;
              var39 = var39 + 65793 * var33;
              pd.a(var38 >> 16, var27, var38 & 255, (var37 & 65456) >> 8, var39 >> 8 & 255, var37 >> 16, var24, var22, var23, (byte) -60, var39 & 255, 255 & var37, var26, var25, var39 >> 16, (var38 & 65441) >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("sl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_u = (String[][]) null;
        field_q = null;
        field_v = null;
        if (param0 != -3035) {
          field_v = (String) null;
        }
    }

    final static vi e(int param0) {
        if (cn.field_v == null) {
          cn.field_v = new vi();
          cn.field_v.a(65793, bn.field_d);
          cn.field_v.field_n = 14;
          cn.field_v.field_i = 0;
          cn.field_v.field_l = 4;
          cn.field_v.field_r = 6;
          cn.field_v.field_g = 7697781;
          cn.field_v.field_k = 2763306;
          cn.field_v.field_p = field_q;
          cn.field_v.field_d = 5;
        }
        if (param0 <= 91) {
          pb var2 = (pb) null;
          sl.a(24, -111, 101, 55, (pb) null, -25, -121, -35);
        }
        return cn.field_v;
    }

    final static hn a(byte param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        hn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          if (param0 != 86) {
            sl.e(78);
          }
          var6 = null;
          if (param1.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param1);
            var4_long = ah.a(-97, var7);
          } else {
            var6 = param1;
          }
          stackIn_6_0 = qg.a(var4_long, param2, 0, (String) (var6), param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("sl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    sl(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_t = param2;
        this.field_s = param3;
        this.field_p = param1;
        this.field_o = param5;
        this.field_n = param0;
        this.field_r = param4;
    }

    static {
        field_u = new String[][]{new String[]{"|_| |2 1337", "Now to spend all this GOLD.", "GOLD GOLD GOLD.", "\"I like Miner Disturbance, it has depth\" - Mod Korpz.", "A gentleman, too!", "Full of good dwarven traits.", "*Sample certificate - do not copy*", "The toast of all dwarves.", "Made his momma proud.", "Stood the test of time, this time."}, new String[]{"Bloated and blue.", "Believed they were a fish.", "Dwarven lungs aren't designed to breathe water.", "Take an aqualung next time and remember to refill it.", "Breathing is good; not breathing is bad.", "Darn water pressure.", "Yay! Food for the little fishies.", "Splosh.", "Wasn't a natural diver."}, new String[]{"Invest in a gas mask.", "Oooh, green stuff.", "Dynamite removes gas...", "The curse of the green glowing rocks strikes again.", "Gas is bad - very, very bad.", "This gas is about as good for you as a sausage in a bun.", "Gas! Put on the mask! Didn't study Wilfred Owen..."}, new String[]{"The light at the end of the tunnel wasn't the way out, then.", "Lava is hot.", "Burninated.", "Final words: I'm MEELLTTINGGG.", "Run away faster next time.", "That seismograph is there for a reason, you know.", "Who would have thought that lava is bad?", "Unfortunately, dwarves are not related to the TzHaar.", "Lava melts rock and dwarf alike.", "Dwarves are as hard as iron. Iron melts in lava. QED."}, new String[]{"Ah, so rocks are heavy.", "A harder hard hat would have saved a lot of pain.", "Fancy life as a vein of coal?", "Has a small carbon footprint.", "When you apply great pressure to carbon you get diamonds; when the same is done to miners, you get dead miners.", "Kleine Miner!", "Headaches are caused by rocks on the brain."}, new String[]{"Playing with fire is bad.", "Reduced to ash.", "Chose to paint the walls.", "Remember to throw the grenade next time, not the pin.", "Remember kids: don't try this at home.", "'Tis only a flesh wound!", "Must have spontaneously combusted.", "Marks of an explosion found near body - death remains a mystery.", "They never read the instructions."}, new String[]{"Was really lame.", "Bravely ran away in fear.", "This little piggy went 'Wee, wee, wee' all the way to the title screen.", "Ooh, a clean hanky.", "When I were young, dwarves was dwarves not cowards.", "A dwarf or a rat? History will decide.", "They are only myths, don't run away.", "All flight and no profit.", "Couldn't stand the heat.", "Fame and infamy eluded them.", "Nobody knows why this gravestone is here.", "If you know this person, please put something interesting here."}, new String[]{"So, they aren't myths after all, then.", "Got mythed.", "Later miners will loot from this corpse.", "You are likely to be eaten by a myth.", "Myth busted.", "Just think of the stories they could have told...if they had got away.", "A Fatal Encounter of the Third Kind.", "What big teeth!", "Only their boots were recovered."}, new String[]{"One miner on the rocks, coming up!", "Became a popsicle.", "Was touched by Jack Frost.", "Impersonated a snowman.", "Was nicely preserved for archeologists.", "Is as cold as ice!", "The coolest miner in town!", "Is comfortably numb.", "Became part of the big freeze.", "'Snow way to die!", "Cryogenically frozen."}, new String[]{"Left to his own devices.", "Used dangerous technology at close proximity.", "Frozen in time.", "Ignored the manufacturer's warnings.", "Is a lesson to all those who ignore the instructions page!", "'I'm invincible!'", "Has freezer burn."}, new String[]{"Had a wildlife experience.", "Was pierced by a pinniped.", "Was mauled by a mammal.", "Made lunch.", "Is part of the circle of life.", "The teeth are over a foot long! Surely that's warning enough?", "Crushed by a ton of blubber!", "Became fat for the winter.", "Was bullrushed."}, new String[]{"Coated in oil.", "Greasy and gone.", "Oil of you lay here.", "Was pumped out in a barrel.", "Is unleaded.", "Seasoned in petroleum.", "Tanked in oil.", "Is fuming.", "Will be cremated, at a distance."}, new String[]{"Deep fried.", "What a crispy twit!", "Burnt to a crisp.", "Not even Crazy Arthur is impressed.", "This bodes poorly for the afterlife.", "There will be cinder!", "Firestarter - miner ender."}, new String[]{"Covered themselves in oil and then used a jetpack.", "Before using jetpack, check whether you are covered in flammable substance.", "Probably did it on purpose.", "Well that was spectacular wasn't it?", "Isn't going to do that again.", "Has no one to blame but themselves.", "When coated in oil, don't use jetpacks."}, new String[]{"Surprise!", "Happy Halloween", "Composted", "Trick or Torn to Pieces!", "Boo!", "Gobbled by a Giant Worm!"}};
        field_v = "Type your password again to make sure it's correct";
    }
}
