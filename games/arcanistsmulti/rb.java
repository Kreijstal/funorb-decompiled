/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends pg {
    static dl field_k;
    String field_j;
    static qb[] field_o;
    static String field_l;
    static String[] field_p;
    boolean field_i;
    static String[] field_n;
    static String field_m;
    int field_g;
    int field_h;

    final static void a(String param0, boolean param1, float param2) {
        kl.field_C = param0;
        if (param1) {
            return;
        }
        try {
            af.field_Hb = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        if (param0 < 25) {
          rb.c(-120);
          field_l = null;
          field_n = null;
          field_p = null;
          field_k = null;
          return;
        } else {
          field_l = null;
          field_n = null;
          field_p = null;
          field_k = null;
          return;
        }
    }

    final static qb[] a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        int[] var6;
        int var7;
        int var8;
        qb var9;
        Object var10;
        Object var11;
        int[] var12;
        int[] var15;
        int[] var16;
        qb var17;
        qb var18;
        qb var19;
        qb var20;
        var16 = de.field_l;
        var15 = var16;
        var12 = var15;
        var6 = var12;
        var7 = de.field_e;
        var8 = de.field_j;
        var9 = new qb(16, param5);
        var9.a();
        de.c(0, 0, 16, param5, param4, param3);
        if (param2 != 652) {
          L0: {
            field_n = (String[]) null;
            var10 = null;
            var11 = null;
            if (!param0) {
              break L0;
            } else {
              var17 = var9.g();
              var10 = var17;
              var17.a();
              de.f(0, 0, 5, 0);
              de.f(0, 1, 3, 0);
              de.f(0, 2, 2, 0);
              de.f(0, 3, 1, 0);
              de.f(0, 4, 1, 0);
              break L0;
            }
          }
          L1: {
            if (param1) {
              var18 = var9.g();
              var11 = var18;
              var18.a();
              de.f(11, 0, 5, 0);
              de.f(13, 1, 3, 0);
              de.f(14, 2, 2, 0);
              de.f(15, 3, 1, 0);
              de.f(15, 4, 1, 0);
              break L1;
            } else {
              break L1;
            }
          }
          de.a(var16, var7, var8);
          return new qb[]{null, null, null, (qb) (var10), var9, (qb) (var11), null, null, null};
        } else {
          L2: {
            var10 = null;
            var11 = null;
            if (!param0) {
              break L2;
            } else {
              var19 = var9.g();
              var10 = var19;
              var19.a();
              de.f(0, 0, 5, 0);
              de.f(0, 1, 3, 0);
              de.f(0, 2, 2, 0);
              de.f(0, 3, 1, 0);
              de.f(0, 4, 1, 0);
              break L2;
            }
          }
          L3: {
            if (param1) {
              var20 = var9.g();
              var11 = var20;
              var20.a();
              de.f(11, 0, 5, 0);
              de.f(13, 1, 3, 0);
              de.f(14, 2, 2, 0);
              de.f(15, 3, 1, 0);
              de.f(15, 4, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          de.a(var16, var7, var8);
          return new qb[]{null, null, null, (qb) (var10), var9, (qb) (var11), null, null, null};
        }
    }

    final static void a(byte[] param0, eg param1, ll[] param2, qb[][] param3, boolean param4, String[][] param5, String[][] param6, int param7, eg param8, int[] param9, qb[][] param10, byte[] param11, byte param12, int[] param13, int param14, String[] param15, eg param16) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          L0: {
            var18 = (String[]) null;
            gf.a(param2, param4, (byte) 74, param16, param0, param6, param11, param8, param7, param1, param9, 1, param14, param10, param3, param15, (String[]) null, param13, param5);
            var17_int = 85 / ((param12 - -27) / 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var17 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var17);

            stackIn_4_1 = new StringBuilder().append("rb.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param9 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param10 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param11 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param14).append(',');

            if (param15 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param16 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L13;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L13;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_41_2 + ')');
        }
    }

    final static void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        f var4_ref_f = null;
        Object var5 = null;
        int var6 = 0;
        String var7 = null;
        byte[] var8 = null;
        pb var9 = null;
        ab var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = df.field_z;
              var2 = var10.e((byte) 81);
              if (param0 <= -22) {
                break L1;
              } else {
                var7 = (String) null;
                rb.a(-32, (String) null, 120, (String) null, -69);
                break L1;
              }
            }
            if (var2 == 0) {
              var9 = (pb) ((Object) hn.field_q.b(12623));
              if (var9 != null) {
                L2: {
                  var4 = var10.e((byte) -100);
                  if (0 == var4) {
                    var5 = null;
                    break L2;
                  } else {
                    var12 = new byte[var4];
                    var11 = var12;
                    var8 = var11;
                    var5 = var8;
                    var10.a((byte) 100, 0, var12, var4);
                    break L2;
                  }
                }
                var10.field_g = var10.field_g + 4;
                if (var10.c(true)) {
                  var9.field_k = true;
                  var9.field_j = (byte[]) (var5);
                  var9.a(true);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  ka.b(false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                ka.b(false);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              if ((var2 ^ -1) != -2) {
                jh.a((Throwable) null, "A1: " + nn.g((byte) -25), (byte) 20);
                ka.b(false);
                return;
              } else {
                var3 = var10.d(-10674);
                var4_ref_f = (f) ((Object) cm.field_l.b(12623));
                L3: while (true) {
                  L4: {
                    if (var4_ref_f == null) {
                      break L4;
                    } else {
                      if (var4_ref_f.field_j != var3) {
                        var4_ref_f = (f) ((Object) cm.field_l.a(0));
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4_ref_f != null) {
                    var4_ref_f.a(true);
                    return;
                  } else {
                    ka.b(false);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "rb.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, String param1, int param2, String param3, int param4) {
        try {
            wn.field_D.field_x = wn.field_D.field_x + sa.field_Cb.field_x;
            wn.field_D.field_ob = param0;
            wn.field_D.field_L = param3;
            wn.field_D.field_rb = param1;
            sa.field_Cb.field_T = sa.field_Cb.field_T + sa.field_Cb.field_x;
            int var5_int = 76 % ((-4 - param4) / 63);
            sa.field_Cb.field_x = param2;
            wn.field_D.field_x = wn.field_D.field_x - sa.field_Cb.field_x;
            sa.field_Cb.field_T = sa.field_Cb.field_T - sa.field_Cb.field_x;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    rb(String param0, int param1) {
        try {
            this.field_g = param1;
            this.field_j = param0;
            this.field_h = 150;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "Receiving game";
        field_p = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_n = new String[]{"Enchanter", "Apprentice", "Acolyte", "Mage", "High Mage", "Arch Mage", "Master of Flame", "Master of Frost", "Master of Storm", "Master of Stone", "Master of Light", "Master of Darkness", "Master of Minions", "Winning Streak", "Winning Storm", "Critical Hit", "Master of Nature", "Master of Seas", "Flame Arcanist", "Frost Arcanist", "Storm Arcanist", "Stone Arcanist", "Underdark Arcanist", "Overlight Arcanist", "Nature Arcanist", "Seas Arcanist", "Trainee Team Leader", "Master Team Leader", "Diplomat", "Master Diplomat", "Champion of Magic", "Lord of Wands", "Master of Cogs", "Cogs Arcanist", "Sniper", "Paper Bag", "Just a flesh wound", "Cursed Earth", "With the Fishies", "You got the Touch", "Team Worker", "Fear Me!", "Block out the sun", "Hangin' with my friends", "It's Alive!", "Claustrophobia", "Master of Arcanists", "Wand Hoarder", "Mark of Fame", "Wrath Wreaker", "Storm Seeker", "Comet Chucker", "Volcanic Volleyer", "Fissure Finisher", "Master of Imps", "Master of Monkeys", "Panoramic View", "Divided World", "Celestial Lord", "Ice Hot", "An Average Summer's Day", "Page Turner", "Cyclone of Pain", "Lord of the Castle", "Cruelty", "Blade Master", "Come With Me", "Subversion", "Lord of Dragons", "Guardian of Souls", "Sanctify Yourself", "Icarus", "Indirect", "Crazy", "Throwing Arm", "Carry on Casting", "Ultimate Power", "The Bell Tolls", "Circle of Death", "Soul Drain", "Master of Familiars", "3rd Dimension", "Dust to Dust", "Skimmer", "Drop Shot", "SMASH!", "Axing for Trouble", "Finally Did It", "Miasma", "Shake n' Quake", "Big Bad Wolf", "Up Up and Up some more", "Didn't see that coming", "Whiter than White", "Multi dunk!"};
        field_m = "Set up new game";
    }
}
