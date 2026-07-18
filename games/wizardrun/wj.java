/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends pe implements qd {
    static long field_E;
    private ha field_H;
    static String field_G;
    private pl[] field_I;
    private String[] field_F;

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var6_int = 0;
              if (param0 == -18905) {
                break L1;
              } else {
                field_G = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var6_int >= ((wj) this).field_F.length) {
                L3: {
                  if (((wj) this).field_I[((wj) this).field_F.length] == param1) {
                    ((wj) this).field_H.a(2147483647);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param1 != ((wj) this).field_I[var6_int]) {
                    break L4;
                  } else {
                    ((wj) this).field_H.a(((wj) this).field_F[var6_int], (byte) 88);
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("wj.DA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                L2: {
                  if (param1 == 2148) {
                    break L2;
                  } else {
                    String discarded$2 = wj.g(-126);
                    break L2;
                  }
                }
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = nf.a(26614, param0.charAt(var4)) + (var3 << 5) - var3;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("wj.CA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_13_0 = 0;
        boolean stackOut_9_0 = false;
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
            if (super.a(param0, param1, (byte) -97, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (98 == param1) {
                stackOut_6_0 = ((wj) this).a((byte) -117, param3);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 != 99) {
                  if (param2 < -96) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    o[] discarded$2 = wj.b(35, 113, -120, 21);
                    return false;
                  }
                } else {
                  stackOut_9_0 = ((wj) this).b(param3, 1);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("wj.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final static String g(int param0) {
        if (!(ri.field_a >= 2)) {
            return jf.field_f;
        }
        if (!(qh.field_c == null)) {
            if (!qh.field_c.b(param0 + 495)) {
                return bl.field_c;
            }
            return td.field_e;
        }
        if (!ub.field_x.b(17820)) {
            return qb.field_q;
        }
        if (!(ub.field_x.a((byte) 29, "commonui"))) {
            return tk.field_e + " - " + ub.field_x.a(0, "commonui") + "%";
        }
        if (!vj.field_b.b(param0 ^ 1585)) {
            return hj.field_d;
        }
        if (!vj.field_b.a((byte) 29, "commonui")) {
            return mj.field_d + " - " + vj.field_b.a(0, "commonui") + "%";
        }
        if (!(cc.field_a.b(17820))) {
            return nh.field_o;
        }
        if (param0 != 17325) {
            boolean discarded$0 = wj.a(113);
        }
        if (!(cc.field_a.d(-97))) {
            return od.field_s + " - " + cc.field_a.a((byte) 75) + "%";
        }
        return u.field_u;
    }

    final static boolean a(int param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var2 = null;
            int discarded$2 = wj.a((CharSequence) null, -18);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == jc.field_H) {
              break L2;
            } else {
              if (wh.field_j != hi.field_l) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static o[] b(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
            return null;
        }
        return ei.a(param2, param0, param1, 1, 20230);
    }

    public static void d(boolean param0) {
        field_G = null;
    }

    final static boolean g(byte param0) {
        return !we.field_c.a(true);
    }

    wj(ha param0) {
        super(0, 0, 0, 0, (bf) null);
        try {
            ((wj) this).field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
            return;
        }
        vd var5 = gh.field_b;
        if (null != ((wj) this).field_F) {
            int discarded$0 = var5.a(ml.field_p, param0 - -((wj) this).field_o, param3 - -((wj) this).field_l, ((wj) this).field_r, 20, 16777215, -1, 0, 0, var5.field_B + var5.field_M);
        }
    }

    final void a(byte param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        tk var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              ((wj) this).field_A.a(false);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == 0) {
                  break L1;
                } else {
                  L2: {
                    var3_int = param1.length;
                    ((wj) this).field_F = new String[var3_int];
                    if (param0 == 87) {
                      break L2;
                    } else {
                      ((wj) this).a(-86, 120, 101, 56);
                      break L2;
                    }
                  }
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new tk(gh.field_b, 0, 1);
                      ((wj) this).field_I = new pl[var3_int - -1];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          ((wj) this).field_I[var3_int] = new pl(eg.field_t, (ce) this);
                          ((wj) this).field_I[var3_int].field_w = (bf) (Object) var4;
                          ((wj) this).field_I[var3_int].a(param0 ^ 44, 16 * var3_int - -36, 15, 100, 0);
                          ((wj) this).a((ub) (Object) ((wj) this).field_I[var3_int], (byte) 71);
                          break L0;
                        } else {
                          ((wj) this).field_I[var5] = new pl(((wj) this).field_F[var5], (ce) this);
                          ((wj) this).field_I[var5].field_w = (bf) (Object) var4;
                          ((wj) this).field_I[var5].field_p = ni.field_a;
                          ((wj) this).field_I[var5].a(109, 20 - -(var5 * 16), 15, 80, 0);
                          ((wj) this).a((ub) (Object) ((wj) this).field_I[var5], (byte) 64);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      ((wj) this).field_F[var4_int] = oe.a((byte) 27, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            ((wj) this).field_F = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("wj.EA(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Loading...";
        field_E = 20000000L;
    }
}
