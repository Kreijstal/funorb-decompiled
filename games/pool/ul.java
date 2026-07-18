/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ul extends tm {
    static cg field_m;
    static String field_l;

    public static void a(byte param0) {
        field_m = null;
        if (param0 >= -5) {
            return;
        }
        field_l = null;
    }

    final static void i(int param0) {
        ea.field_z = false;
        hr.field_y = 0 == kn.field_e.g(-83) ? true : false;
    }

    final int a(int param0, boolean param1) {
        if (0 == param0) {
            return 16777215;
        }
        if (param0 == 8) {
            return 3355443;
        }
        if (!param1) {
            String discarded$0 = ((ul) this).a((byte) -72, -37);
        }
        return 7824981;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (td.a(param0, (byte) 123)) {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                var5 = pd.field_d;
                var2 = var5;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var5.length) {
                    var6 = g.field_o;
                    var2 = var6;
                    var7 = 0;
                    var3 = var7;
                    L2: while (true) {
                      if (var7 >= var6.length) {
                        if (param1 > 123) {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          boolean discarded$2 = ul.a('￉', (byte) 82);
                          return false;
                        }
                      } else {
                        var4 = var6[var7];
                        if (param0 == var4) {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        } else {
                          var7++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var5[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2_ref, "ul.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
            return null;
        }
        return ae.field_b;
    }

    final void a(int param0, byte param1, pq[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        eg var6 = null;
        eg stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_6_0 = null;
        eg stackOut_5_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -37) {
                break L1;
              } else {
                ul.a((byte) 26);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (var4_int >= 14) {
                break L0;
              } else {
                L3: {
                  var5 = 1 - (-var4_int - var4_int / 7);
                  if (param0 == var5) {
                    stackOut_6_0 = sf.field_E;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = jp.field_P;
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                L4: {
                  var6 = stackIn_7_0;
                  if (((ul) this).field_a[var5] != var6) {
                    ((ul) this).field_a[var5] = var6;
                    ((ul) this).a(false, param2[var5].field_G, var5);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ul.H(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        eo var7 = null;
        eo var8 = null;
        oq var9 = null;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_14_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var10 = (CharSequence) (Object) param1;
            if (!gj.a(-25908, var10)) {
              stackOut_2_0 = p.field_g;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (2 == th.field_a) {
                var8 = gf.a(-83, param1);
                if (var8 == null) {
                  stackOut_9_0 = nr.a(new String[1], -1, aa.field_f);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  ma discarded$1 = cf.field_k.a((ma) (Object) var8, 0);
                  L1: while (true) {
                    var7 = (eo) (Object) cf.field_k.f((byte) -5);
                    if (var7 == null) {
                      var8.a((byte) -117);
                      var8.a(false);
                      nr.field_S = nr.field_S - 1;
                      var9 = ej.field_j;
                      var9.b(false, param2);
                      var9.field_v = var9.field_v + 1;
                      var6 = -10 % ((param0 - 20) / 53);
                      var5 = var9.field_v;
                      var9.a(1, false);
                      var9.a(-9946, param1);
                      var9.b(var9.field_v + -var5, true);
                      stackOut_14_0 = null;
                      stackIn_15_0 = stackOut_14_0;
                      break L0;
                    } else {
                      var7.field_Mb = var7.field_Mb - 1;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_5_0 = qe.field_K;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ul.J(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_15_0;
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            return true;
        }
        return false;
    }

    final void a(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 198123656) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ul.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(di param0, byte param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
        try {
          L0: {
            L1: {
              if (param1 == 117) {
                break L1;
              } else {
                var4 = null;
                ((ul) this).a(-110, (byte) 38, (pq[]) null);
                break L1;
              }
            }
            if (((ul) this).field_a == null) {
              jp.field_P = eg.a(param0, "", "balls/TIKI/tiki_ball_halloween");
              sf.field_E = eg.a(param0, "", "balls/TIKI/tiki_ball_halloween_lit");
              jp.field_P.a(8, 8, 8, 8);
              sf.field_E.a(8, 8, 8, 8);
              ((ul) this).field_a = new eg[16];
              ((ul) this).field_a[0] = al.field_B[2].field_a[0];
              ((ul) this).field_a[15] = jp.field_P;
              ((ul) this).field_a[14] = jp.field_P;
              ((ul) this).field_a[13] = jp.field_P;
              ((ul) this).field_a[12] = jp.field_P;
              ((ul) this).field_a[11] = jp.field_P;
              ((ul) this).field_a[10] = jp.field_P;
              ((ul) this).field_a[9] = jp.field_P;
              ((ul) this).field_a[7] = jp.field_P;
              ((ul) this).field_a[6] = jp.field_P;
              ((ul) this).field_a[5] = jp.field_P;
              ((ul) this).field_a[4] = jp.field_P;
              ((ul) this).field_a[3] = jp.field_P;
              ((ul) this).field_a[2] = jp.field_P;
              ((ul) this).field_a[1] = jp.field_P;
              ((ul) this).field_a[8] = al.field_B[2].field_a[8];
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ul.C(");
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    ul() {
        ((ul) this).field_g = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "FULL ACCESS";
    }
}
