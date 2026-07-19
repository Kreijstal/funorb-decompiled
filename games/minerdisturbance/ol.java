/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static ea field_a;
    static String[][] field_b;
    static ea field_c;
    static String field_d;

    final static void a(byte param0) {
        int var1 = 0;
        if (param0 != -94) {
          L0: {
            field_d = (String) null;
            if (ee.field_J < 224) {
              var1 = ee.field_J % 32;
              fc.a(-var1 + (ee.field_J - -32), (byte) 52);
              break L0;
            } else {
              fc.a(256, (byte) 72);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (ee.field_J < 224) {
              var1 = ee.field_J % 32;
              fc.a(-var1 + (ee.field_J - -32), (byte) 52);
              break L1;
            } else {
              fc.a(256, (byte) 72);
              break L1;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
          field_b = (String[][]) null;
          field_a = null;
          field_d = null;
          field_b = (String[][]) null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = (String[][]) null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param2 >= 31) {
                break L1;
              } else {
                field_b = (String[][]) null;
                break L1;
              }
            }
            var3_int = 1;
            L2: while (true) {
              if ((param1 ^ -1) >= -2) {
                if (param1 != 1) {
                  stackOut_12_0 = var3_int;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_10_0 = var3_int * param0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if (0 != (param1 & 1)) {
                    var3_int = var3_int * param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "ol.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 != param0) {
          if (0 >= param0) {
            L0: {
              var2 = 2;
              if (65535 < (param0 ^ -1)) {
                param0 = param0 >> 16;
                var2 += 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param0 >= -256) {
                break L1;
              } else {
                var2 += 8;
                param0 = param0 >> 8;
                break L1;
              }
            }
            L2: {
              if (-16 <= param0) {
                break L2;
              } else {
                param0 = param0 >> 4;
                var2 += 4;
                break L2;
              }
            }
            L3: {
              if (3 >= (param0 ^ -1)) {
                break L3;
              } else {
                param0 = param0 >> 2;
                var2 += 2;
                break L3;
              }
            }
            if (param1 != 8) {
              L4: {
                field_c = (ea) null;
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              return var2;
            } else {
              L5: {
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              return var2;
            }
          } else {
            L6: {
              var2 = 1;
              if (param0 <= 65535) {
                break L6;
              } else {
                var2 += 16;
                param0 = param0 >> 16;
                break L6;
              }
            }
            L7: {
              if (-256 <= (param0 ^ -1)) {
                break L7;
              } else {
                var2 += 8;
                param0 = param0 >> 8;
                break L7;
              }
            }
            L8: {
              if (-16 > (param0 ^ -1)) {
                var2 += 4;
                param0 = param0 >> 4;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((param0 ^ -1) < -4) {
                var2 += 2;
                param0 = param0 >> 2;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if ((param0 ^ -1) < -2) {
                var2++;
                param0 = param0 >> 1;
                break L10;
              } else {
                break L10;
              }
            }
            return var2;
          }
        } else {
          return 0;
        }
    }

    static {
        field_d = "Grandma's Finest Dwarven Woolly Jumper. You'll make her very proud wearing this; what's more, it will keep you safe from the cold.";
        field_b = new String[][]{new String[]{"Moin the miner has been chosen from all the dwarves in his clan to confront the mighty volcano, Magros, before its fateful eruption. The clan is out of money - down to its last 500 gold coins. Moin must, therefore, delve deep into the bowels of the mountain in order to retrieve enough silver, gold and other precious ores to keep his clan rich and prosperous for many years to come.", "<br>", "Mount Magros is a fickle volcano; the further a miner proceeds into its depths, the more violent and dangerous the mountain becomes. Some even tell tales of mythical creatures lurking in its depths. ", "<br>", "You must guide Moin down into the heart of the volcano to excavate the valuable ores found there. Keep an eye on your seismograph, though, as the volcano is guaranteed to erupt sooner or later."}, new String[]{"<img=13><br><img=15><img=14><br><img=17><br><img=16>", "- Pause the game and open the Options Menu.<br>- Move around.<br>- Jump or swim up.<br>- Swim down.<br>", "Hold <img=18> + <img=14><img=15><img=16><img=17> - Mine rock.", "<br><shad=AAAAAA>Advanced Controls:</shad><br>For more advanced controls, use the letter keys indicated on the grid to the left.<br>Press <img=22> and Moin will mine upwards. Press <img=24> and Moin mines to the right and beneath him. If something is in the way he'll mine right first (as if you had pressed <img=23>)"}, new String[]{"<br><img=19><br><img=21>", "<br>- Drop explosives.<br>- Fire rock blaster.", "<b><col=ff0000>WARNING: 5<nbsp>second<nbsp>fuse.</b></col><br><b><col=ff0000>WARNING: Fatal at close range.</b></col><br>", "To use items you must have bought them in the shop before entering the volcano, or have collected them from the bones of dead miners.<br><br>These items are only available in the Super Volcano:", "<br><img=25> + <img=17><br><img=26>", "<br>- Use Jetpack.<br>- Drop Ice bomb.", "<b><col=ff0000>WARNING: Beware<nbsp>oil.</b></col><br><b><col=ff0000>WARNING: 5<nbsp>second<nbsp>fuse.</b></col>"}, new String[]{"This is Moin's oxygen meter. It appears when he is in water or gas. He will die if it empties.<br><br>Moin can swim through water, but can only mine if his feet are on the floor.<br><br>Gas is poisonous and Moin will choke if he stays in it too long. It is also highly explosive, so be careful! <br><br>Ore such as this can be mined to release the gems within.<br><br>Collect the released gems to score points and help Moin become a master miner.<br>"}, new String[]{"Tough boulders like these can only be destroyed by explosions.", "Sometimes you may come across the bodies of former miners. Pick them up to retrieve bonus items of equipment. Watch out for what killed them...", "Once you have a good haul of gems, leave the mine to double your score!<br><br>Earning more points will improve your miner ranking and secure Moin a place in the annals of the mightiest miners."}, new String[]{"The Super Volcano contains everything that the standard Volcano contains, but also includes extra hazards:", "Snow: Can be damaged by thumping into it. Only takes one tap to mine. Melted by explosions.", "Oil: Sticks to Moin and makes him skid. Harder to swim through than water. Set on fire by explosions.", "Ice: As hard as rock, but slippery. Melted by explosions.", "Freezing Water: Without a wooly jumper you will start to freeze in this cold water. Cold enough to freeze nearby rock to ice too."}, new String[]{"You will be provided with tips as you venture into the volcano. If at any point you want a recap of these tips, click the 'Reset Tips' button below.<br><br>To remind yourself of the equipment Moin is using, look to the top-left corner of the screen. Moving your mouse over an icon here will provide more detail about it."}};
    }
}
