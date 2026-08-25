/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class jg {
    static String field_c;
    String field_e;
    static int field_a;
    static int field_g;
    static int[][] field_f;
    static int[][] field_h;
    private static boolean field_i;
    int field_b;
    static String field_d;

    final static void e() {
        if (field_i || te.field_c == null) {
            return;
        }
        field_i = true;
        uh.field_y.a(te.field_c, 0, -1, hf.field_d, sl.field_l);
        ag.field_j[1] = true;
        uh.field_y.a(te.field_c, 0, -1, qf.field_bb, sl.field_l);
        uh.field_y.a(te.field_c, 0, -1, pi.field_S, sl.field_l);
        uh.field_y.a(te.field_c, 0, -1, ll.field_d, sl.field_l);
    }

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 1) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_e, this.field_b);
    }

    abstract java.net.Socket b(int param0) throws IOException;

    final static boolean d(int param0) {
        if (param0 != 7) {
            return true;
        }
        return !ih.field_c.a(-95) ? true : false;
    }

    final static j a(byte param0, String param1) {
        String var2 = null;
        j var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        j stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        j stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            if (nh.field_a != null) {
              if (param1 != null) {
                if (param1.length() != 0) {
                  if (param0 == -62) {
                    var6 = (CharSequence) ((Object) param1);
                    var2 = oe.a(var6, 12);
                    if (var2 != null) {
                      var3 = (j) ((Object) nh.field_a.a((long)var2.hashCode(), -1));
                      L1: while (true) {
                        if (var3 != null) {
                          var7 = (CharSequence) ((Object) var3.field_hb);
                          var4 = oe.a(var7, 12);
                          if (var4.equals(var2)) {
                            stackIn_20_0 = (j) (var3);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var3 = (j) ((Object) nh.field_a.a(-29925));
                            continue L1;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackIn_13_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    stackIn_10_0 = (j) null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref);

            stackIn_25_1 = new StringBuilder().append("jg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L2;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (j) ((Object) stackIn_13_0);
          } else {
            return stackIn_20_0;
          }
        }
    }

    final static na a(rh param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        na stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.a((byte) 127, param2);
              if (param1 == 1) {
                break L1;
              } else {
                field_a = 100;
                break L1;
              }
            }
            var5 = param0.a(param3, -110, var4_int);
            stackIn_3_0 = vh.a(var5, param0, var4_int, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("jg.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 16712207) {
            jg.d(56);
        }
        field_f = (int[][]) null;
        field_h = (int[][]) null;
    }

    final static void a(rh param0, byte param1, rh param2, rh param3, rh param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        gd var6 = null;
        int var7 = 0;
        String var8 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              kf.field_c = param3;
              sl.field_l = param4;
              p.field_i = new ue(22050, qk.field_j);
              ll.field_d = rf.a(kf.field_c, "", "title_music_loop");
              pi.field_S = rf.a(kf.field_c, "", "game_over");
              hf.field_d = rf.a(kf.field_c, "", "sun");
              qf.field_bb = rf.a(kf.field_c, "", "bonus_bubble_jingle");
              te.field_c = new ci(param0, param2);
              var5_int = 0;
              if (param1 >= 69) {
                break L1;
              } else {
                var8 = (String) null;
                jg.a((byte) 74, (String) null);
                break L1;
              }
            }
            // Sound effects are decoded by pk.h when their category is first
            // used. Eagerly decoding all 33 effects here blocks the applet's
            // loading thread for several seconds and prevents the Jagex splash
            // from repainting in browser JVMs.
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("jg.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_27_2 + ')');
        }
    }

    static {
        $cfr$clinit: {
            int var0_int;
            int[] var0;
            int var1;
            int var2;
            int var3;
            float var3_float;
            int var4;
            float var4_float;
            int var5;
            float var5_float;
            float var6;
            float var7;
            float var8;
            int var9;
            float var10;
            float var11;
            float var12;
            float var13;
            float var14;
            float var15;
            float var16;
            int[] var17;
            int[] var18;
            field_a = 9;
            field_c = "This game has been updated! Please reload this page.";
            field_g = 35;
            field_h = new int[7][7];
            field_f = new int[][]{new int[]{16646130, 4383370, 7784169, 16732531, 16569656, 16756645, 14022770}, new int[]{16099865, 16720435, 16770049, 42709, 16733161, 11078398, 3658269}, new int[]{16229425, 5957352, 16122070, 15595784, 10216240, 2706395, 11226077}, new int[]{52224, 39372, 16751631, 16751052, 16777011, 16724736, 10040217}, new int[]{16507819, 14654025, 14129125, 13953361, 14512505, 12506866, 12632256}, new int[]{15815889, 1289446, 16363563, 16116238, 9126089, 16730432, 5088306}, new int[]{16716239, 22986, 7461652, 16514820, 16712207, 16744452, 6438761}};
            var0_int = 0;
            L0: while (true) {
              if (var0_int >= 7) {
                var18 = new int[7];
                var17 = var18;
                var0 = var17;
                var1 = 0;
                L1: while (true) {
                  if (var1 >= 7) {
                    break $cfr$clinit;
                  } else {
                    var2 = 0;
                    L2: while (true) {
                      if (7 <= var2) {
                        var2 = 1;
                        L3: while (true) {
                          if (7 <= var2) {
                            var1++;
                            continue L1;
                          } else {
                            var3 = -1 + var2;
                            var4 = var18[var2];
                            var5 = field_h[var1][var2];
                            L4: while (true) {
                              L5: {
                                if (var3 < 0) {
                                  break L5;
                                } else {
                                  if (var18[var3] <= var4) {
                                    break L5;
                                  } else {
                                    var0[var3 + 1] = var18[var3];
                                    field_h[var1][1 + var3] = field_h[var1][var3];
                                    var3--;
                                    continue L4;
                                  }
                                }
                              }
                              var0[var3 + 1] = var4;
                              field_h[var1][var3 - -1] = var5;
                              var2++;
                              continue L3;
                            }
                          }
                        }
                      } else {
                        L6: {
                          L7: {
                            var3_float = (float)((field_f[var1][var2] & 16776188) >> -1813215184) / 255.0f;
                            var4_float = (float)((field_f[var1][var2] & 65454) >> 358527304) / 255.0f;
                            var5_float = (float)(255 & field_f[var1][var2]) / 255.0f;
                            var9 = 0;
                            if (var3_float <= var4_float) {
                              break L7;
                            } else {
                              if (var3_float > var5_float) {
                                var7 = var3_float;
                                if (var4_float <= var5_float) {
                                  var6 = var4_float;
                                  break L6;
                                } else {
                                  var6 = var5_float;
                                  break L6;
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var4_float <= var3_float) {
                              break L8;
                            } else {
                              if (var4_float <= var5_float) {
                                break L8;
                              } else {
                                L9: {
                                  if (var3_float <= var5_float) {
                                    var6 = var3_float;
                                    break L9;
                                  } else {
                                    var6 = var5_float;
                                    break L9;
                                  }
                                }
                                var9 = 1;
                                var7 = var4_float;
                                break L6;
                              }
                            }
                          }
                          var7 = var5_float;
                          var9 = 2;
                          if (var4_float >= var3_float) {
                            var6 = var3_float;
                            break L6;
                          } else {
                            var6 = var4_float;
                            break L6;
                          }
                        }
                        L10: {
                          var8 = var7 - var6;
                          var10 = (var7 + var6) / 2.0f;
                          if (var10 >= 0.5f) {
                            var11 = var8 / (-var6 + (-var7 + 2.0f));
                            break L10;
                          } else {
                            var11 = var8 / (var7 + var6);
                            break L10;
                          }
                        }
                        L11: {
                          var13 = 0.1666666716337204f;
                          var14 = ((-var3_float + var7) * var13 + 0.5f * var8) / var8;
                          var15 = ((-var4_float + var7) * var13 + 0.5f * var8) / var8;
                          var16 = (var13 * (var7 - var5_float) + var8 * 0.5f) / var8;
                          if (var9 == 0) {
                            var12 = -var15 + var16;
                            break L11;
                          } else {
                            if ((var9 ^ -1) == -2) {
                              var12 = -var16 + (0.3333333432674408f + var14);
                              break L11;
                            } else {
                              var12 = -var14 + (0.6666666865348816f + var15);
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (var12 >= 0.0f) {
                            if (var12 <= 1.0f) {
                              break L12;
                            } else {
                              var12 = var12 - 1.0f;
                              break L12;
                            }
                          } else {
                            var12 = var12 + 1.0f;
                            break L12;
                          }
                        }
                        var0[var2] = (int)(var12 * 255.0f) << (int)(var11 * 255.0f) + 16 << 8 + (int)(255.0f * var10);
                        var2++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                sf.a(field_f[var0_int], 0, field_h[var0_int], 0, 7);
                var0_int++;
                continue L0;
              }
            }
        }
    }
}
