/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends gb implements n {
    private eb[] field_L;
    private rg field_G;
    static String field_H;
    static jj field_F;
    static int field_J;
    static nb field_K;
    private String[] field_I;

    am(rg param0) {
        super(0, 0, 0, 0, (cj) null);
        try {
            ((am) this).field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "am.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void f(byte param0) {
        field_F = null;
        int var1 = 25;
        field_H = null;
        field_K = null;
    }

    final static void a(fa param0, boolean param1, fa param2, fa param3, byte param4) {
        try {
            vc.field_a = gl.b("", 20);
            vc.field_a.a(false, param4 + 87);
            if (param4 != -22) {
                Object var6 = null;
                am.a((byte) 119, (java.awt.Canvas) null);
            }
            gi.a(param3, param2, param0, param4 + -2018);
            nd.c((byte) -11);
            qe.field_f = og.field_a;
            pe.field_a = og.field_a;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "am.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = Terraphoenix.field_V;
        try {
            for (var6_int = 0; var6_int < ((am) this).field_I.length; var6_int++) {
                if (!(((am) this).field_L[var6_int] != param0)) {
                    ((am) this).field_G.a(((am) this).field_I[var6_int], 72);
                }
            }
            if (((am) this).field_L[((am) this).field_I.length] == param0) {
                ((am) this).field_G.a(50);
            }
            var6_int = 35 % ((-5 - param4) / 57);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "am.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void g(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            var5 = fc.field_e;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1_ref, "am.A(" + -3 + 41);
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              hk.a((java.awt.Component) (Object) param1, (byte) 93);
              ei.a((java.awt.Component) (Object) param1, -24289);
              var2_int = -55 / ((param0 - -23) / 48);
              if (null != lk.field_d) {
                lk.field_d.a(0, (java.awt.Component) (Object) param1);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("am.J(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final void a(int param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        qh var4 = null;
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
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              ((am) this).field_C.c(21480);
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length) {
                  var3_int = param1.length;
                  ((am) this).field_I = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      L3: {
                        if (param0 == -11678) {
                          break L3;
                        } else {
                          field_F = null;
                          break L3;
                        }
                      }
                      var4 = new qh(qk.field_e, 0, 1);
                      ((am) this).field_L = new eb[var3_int + 1];
                      var5 = 0;
                      L4: while (true) {
                        if (var3_int <= var5) {
                          ((am) this).field_L[var3_int] = new eb(re.field_d, (sc) this);
                          ((am) this).field_L[var3_int].field_l = (cj) (Object) var4;
                          ((am) this).field_L[var3_int].a(var3_int * 16 + 36, (byte) 127, 100, 0, 15);
                          ((am) this).b((byte) 95, (gl) (Object) ((am) this).field_L[var3_int]);
                          break L0;
                        } else {
                          ((am) this).field_L[var5] = new eb(((am) this).field_I[var5], (sc) this);
                          ((am) this).field_L[var5].field_l = (cj) (Object) var4;
                          ((am) this).field_L[var5].field_x = g.field_ab;
                          ((am) this).field_L[var5].a(16 * var5 + 20, (byte) 117, 80, 0, 15);
                          ((am) this).b((byte) 95, (gl) (Object) ((am) this).field_L[var5]);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      ((am) this).field_I[var4_int] = tj.a((CharSequence) (Object) param1[var4_int], sl.a(param0, -11664)).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            ((am) this).field_I = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("am.G(").append(param0).append(44);
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
          throw qk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        int stackOut_14_0 = 0;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param3 == 98) {
                stackOut_6_0 = ((am) this).a(48, param1);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param3 == 99) {
                  stackOut_10_0 = ((am) this).a(param1, (byte) 86);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (param2 == 30) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    field_K = null;
                    return false;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("am.K(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_15_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 > -106) {
            field_J = -26;
        }
        super.a(param0, -116, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        pk var5 = qk.field_e;
        if (null != ((am) this).field_I) {
            int discarded$0 = var5.a(tb.field_l, ((am) this).field_w + param0, ((am) this).field_u + param3, ((am) this).field_p, 20, 16777215, -1, 0, 0, var5.field_p + var5.field_s);
        }
    }

    final static boolean a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param0.length() <= var2_int) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (nd.a((char) var3, 127)) {
                    break L2;
                  } else {
                    if (!gb.a((byte) 41, (char) var3)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("am.L(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 1 + 41);
        }
        return stackIn_10_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "    Blocking Terrain";
        field_K = null;
    }
}
