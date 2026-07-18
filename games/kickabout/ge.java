/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ge extends jd {
    static ff field_j;
    static String[] field_o;
    private ga field_l;
    static ut field_k;
    static int[] field_m;
    static hd field_n;

    final static void a(int param0, int param1, byte param2, int param3) {
        hn var4 = null;
        var4 = new hn(2, new int[3]);
        ii.a(var4, 73);
        if (25 == cq.field_h.field_c) {
          ((b) (Object) cq.field_h).h((byte) 84);
          return;
        } else {
          return;
        }
    }

    ge(ga param0, ga param1) {
        super(param0);
        try {
            ((ge) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c() {
        field_o = null;
        field_m = null;
        field_n = null;
        field_j = null;
        field_k = null;
    }

    final String a(byte param0, String param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (!(((ge) this).field_l instanceof cw)) {
                break L1;
              } else {
                var3 = ((cw) (Object) ((ge) this).field_l).a((byte) -115);
                if (var3 != null) {
                  L2: {
                    if (var3.c(-24407) != he.field_yb) {
                      break L2;
                    } else {
                      if (param1.equals((Object) (Object) ((ge) this).field_l.field_q)) {
                        break L2;
                      } else {
                        stackOut_5_0 = rl.field_p;
                        stackIn_6_0 = stackOut_5_0;
                        return stackIn_6_0;
                      }
                    }
                  }
                  stackOut_7_0 = var3.b(-67);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == 25) {
                break L3;
              } else {
                var4 = null;
                String discarded$2 = ((ge) this).a((byte) -109, (String) null);
                break L3;
              }
            }
            if (!param1.equals((Object) (Object) ((ge) this).field_l.field_q)) {
              stackOut_13_0 = rl.field_p;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ge.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(gv param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var2_int = bk.field_c.length - 1;
            L1: while (true) {
              if (1 > var2_int) {
                break L0;
              } else {
                bk.field_c[var2_int] = bk.field_c[var2_int + -1];
                var2_int--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ge.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + false + ')');
        }
    }

    final rv a(String param0, int param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        rv stackIn_8_0 = null;
        rv stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        rv stackOut_7_0 = null;
        rv stackOut_11_0 = null;
        rv stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -5) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            L2: {
              if (((ge) this).field_l instanceof cw) {
                var3 = ((cw) (Object) ((ge) this).field_l).a((byte) -113);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.c(-24407) != he.field_yb) {
                    stackOut_7_0 = jt.field_Bb;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param0.equals((Object) (Object) ((ge) this).field_l.field_q)) {
                stackOut_11_0 = he.field_yb;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = jt.field_Bb;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("ge.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final static byte[] a(int param0, ut param1) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var9 = new byte[param1.field_v * (param1.field_o >> 3)];
            var2_array = var9;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (param1.field_v <= var5) {
                stackOut_31_0 = (byte[]) var9;
                stackIn_32_0 = stackOut_31_0;
                break L0;
              } else {
                var6 = 0;
                L2: while (true) {
                  if (param1.field_o <= var6) {
                    var5++;
                    continue L1;
                  } else {
                    L3: {
                      var7 = 0;
                      int incrementValue$9 = var4;
                      var4++;
                      if (param1.field_y[incrementValue$9] != 0) {
                        var7 = (byte)(var7 | 1);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      int incrementValue$10 = var4;
                      var4++;
                      if (0 == param1.field_y[incrementValue$10]) {
                        break L4;
                      } else {
                        var7 = (byte)(var7 | 2);
                        break L4;
                      }
                    }
                    L5: {
                      int incrementValue$11 = var4;
                      var4++;
                      if (param1.field_y[incrementValue$11] != 0) {
                        var7 = (byte)(var7 | 4);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      int incrementValue$12 = var4;
                      var4++;
                      if (param1.field_y[incrementValue$12] != 0) {
                        var7 = (byte)(var7 | 8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      int incrementValue$13 = var4;
                      var4++;
                      if (param1.field_y[incrementValue$13] != 0) {
                        var7 = (byte)(var7 | 16);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      int incrementValue$14 = var4;
                      var4++;
                      if (param1.field_y[incrementValue$14] != 0) {
                        var7 = (byte)(var7 | 32);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      int incrementValue$15 = var4;
                      var4++;
                      if (param1.field_y[incrementValue$15] == 0) {
                        break L9;
                      } else {
                        var7 = (byte)(var7 | 64);
                        break L9;
                      }
                    }
                    L10: {
                      int incrementValue$16 = var4;
                      var4++;
                      if (param1.field_y[incrementValue$16] != 0) {
                        var7 = (byte)(var7 | 128);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    int incrementValue$17 = var3;
                    var3++;
                    var9[incrementValue$17] = (byte)var7;
                    var6 += 8;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("ge.G(").append(16).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_32_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ff(9, 0, 4, 1);
        field_m = new int[2];
    }
}
