/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends se implements in {
    private gn[] field_I;
    static String field_K;
    static hh field_H;
    private String[] field_G;
    static cd field_L;
    private jn field_J;

    final static void b(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        hp var4 = null;
        u var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4 = (hp) (Object) mh.field_l.c(108);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    gl.c(false);
                    break L2;
                  }
                }
                var5 = (u) (Object) cp.field_T.c(59);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    o.a(var5, param1, -85);
                    var5 = (u) (Object) cp.field_T.b(6);
                    continue L3;
                  }
                }
              } else {
                tk.a(var4, 58, param1);
                var4 = (hp) (Object) mh.field_l.b(6);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "gl.D(" + param0 + 44 + param1 + 41);
        }
    }

    gl(jn param0) {
        super(0, 0, 0, 0, (nl) null);
        try {
            ((gl) this).field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "gl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        he var4 = null;
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -112) {
                break L1;
              } else {
                ((gl) this).field_G = null;
                break L1;
              }
            }
            L2: {
              ((gl) this).field_B.e(-30986);
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length != 0) {
                  var3_int = param1.length;
                  ((gl) this).field_G = new String[var3_int];
                  var4_int = 0;
                  L3: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new he(ke.field_h, 0, 1);
                      ((gl) this).field_I = new gn[var3_int - -1];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          ((gl) this).field_I[var3_int] = new gn(al.field_ab, (bj) this);
                          ((gl) this).field_I[var3_int].field_h = (nl) (Object) var4;
                          ((gl) this).field_I[var3_int].b(0, 16 * var3_int + 36, 28972, 100, 15);
                          ((gl) this).b((byte) 55, (cf) (Object) ((gl) this).field_I[var3_int]);
                          break L0;
                        } else {
                          ((gl) this).field_I[var5] = new gn(((gl) this).field_G[var5], (bj) this);
                          ((gl) this).field_I[var5].field_h = (nl) (Object) var4;
                          ((gl) this).field_I[var5].field_x = wd.field_I;
                          ((gl) this).field_I[var5].b(0, 20 - -(var5 * 16), 28972, 80, 15);
                          ((gl) this).b((byte) 94, (cf) (Object) ((gl) this).field_I[var5]);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      ((gl) this).field_G[var4_int] = ld.a((byte) 0, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                      var4_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            ((gl) this).field_G = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("gl.B(").append(param0).append(44);
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
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != param2) {
            return;
        }
        if (param0 != -2) {
            return;
        }
        fm var5 = ke.field_h;
        if (null != ((gl) this).field_G) {
            int discarded$0 = var5.a(pi.field_g, param3 - -((gl) this).field_y, param1 + ((gl) this).field_i, ((gl) this).field_n, 20, 16777215, -1, 0, 0, var5.field_r + var5.field_C);
        }
    }

    final static ja a(int param0) {
        int var4_int = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var1 = oq.field_w[0] * vj.field_p[0];
        byte[] var2 = qp.field_t[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = tp.field_t[tq.b(255, (int) var2[var4_int])];
        }
        ja var4 = new ja(ie.field_nb, hj.field_a, k.field_i[0], qj.field_o[0], oq.field_w[0], vj.field_p[0], var3);
        fd.h((byte) 126);
        return var4;
    }

    public static void c(boolean param0) {
        if (!param0) {
            gl.b(true, -119);
        }
        field_H = null;
        field_L = null;
        field_K = null;
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param0 == 98) {
                stackOut_6_0 = ((gl) this).a((byte) -1, param2);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0 != 99) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((gl) this).a(99, param2);
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
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("gl.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
        return stackIn_12_0 != 0;
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= -83) {
                break L1;
              } else {
                var8 = null;
                boolean discarded$3 = ((gl) this).a(-106, '￘', (cf) null, 49);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (((gl) this).field_G.length <= var6_int) {
                L3: {
                  if (((gl) this).field_I[((gl) this).field_G.length] == param2) {
                    ((gl) this).field_J.a(496);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param2 == ((gl) this).field_I[var6_int]) {
                    ((gl) this).field_J.a(((gl) this).field_G[var6_int], 1);
                    break L4;
                  } else {
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
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("gl.E(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "All players have left <%0>'s game.";
    }
}
