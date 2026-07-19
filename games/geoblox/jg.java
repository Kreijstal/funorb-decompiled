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
    int field_b;
    static String field_d;

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
        RuntimeException var2_ref = null;
        j var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        j stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        j stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        j stackOut_19_0 = null;
        Object stackOut_12_0 = null;
        j stackOut_9_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
                            stackOut_19_0 = (j) (var3);
                            stackIn_20_0 = stackOut_19_0;
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
                      stackOut_12_0 = null;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    stackOut_9_0 = (j) null;
                    stackIn_10_0 = stackOut_9_0;
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
            stackOut_23_0 = (RuntimeException) (var2_ref);
            stackOut_23_1 = new StringBuilder().append("jg.B(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        na stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            stackOut_2_0 = vh.a(var5, param0, var4_int, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("jg.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(int param0) {
        boolean discarded$0 = false;
        field_d = null;
        field_c = null;
        if (param0 != 16712207) {
            discarded$0 = jg.d(56);
        }
        field_f = (int[][]) null;
        field_h = (int[][]) null;
    }

    final static void a(rh param0, byte param1, rh param2, rh param3, rh param4) {
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        j discarded$9 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        gd var6 = null;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
              discarded$5 = uh.field_y.a(te.field_c, 0, -1, hf.field_d, sl.field_l);
              ag.field_j[1] = true;
              discarded$6 = uh.field_y.a(te.field_c, 0, -1, qf.field_bb, sl.field_l);
              discarded$7 = uh.field_y.a(te.field_c, 0, -1, pi.field_S, sl.field_l);
              discarded$8 = uh.field_y.a(te.field_c, 0, -1, ll.field_d, sl.field_l);
              var5_int = 0;
              if (param1 >= 69) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$9 = jg.a((byte) 74, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              if (-34 >= (var5_int ^ -1)) {
                break L0;
              } else {
                L3: {
                  if (-1 <= (ck.field_c[var5_int] ^ -1)) {
                    break L3;
                  } else {
                    if ((ck.field_c[var5_int] ^ -1) == -2) {
                      break L3;
                    } else {
                      var5_int++;
                      continue L2;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (-11 < (var5_int ^ -1)) {
                      break L5;
                    } else {
                      if (26 >= var5_int) {
                        var6 = te.field_c.c(-1879044097, w.field_b[var5_int]);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var6 = te.field_c.b(1, w.field_b[var5_int]);
                  break L4;
                }
                fl.field_c[var5_int] = var6.a(p.field_i);
                vg.field_j[var5_int] = true;
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("jg.E(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    static {
        $cfr$clinit: {
            int var0_int = 0;
            int[] var0 = null;
            int var1 = 0;
            int var2 = 0;
            float var3_float = 0.0f;
            int var3 = 0;
            float var4_float = 0.0f;
            int var4 = 0;
            float var5_float = 0.0f;
            int var5 = 0;
            float var6 = 0.0f;
            float var7 = 0.0f;
            float var8 = 0.0f;
            int var9 = 0;
            float var10 = 0.0f;
            float var11 = 0.0f;
            float var12 = 0.0f;
            float var13 = 0.0f;
            float var14 = 0.0f;
            float var15 = 0.0f;
            float var16 = 0.0f;
            int[] var17 = null;
            int[] var18 = null;
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
