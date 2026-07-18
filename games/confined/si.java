/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    static boolean field_b;
    static String field_a;
    static String[] field_e;
    static int field_h;
    static ej field_g;
    static String field_f;
    int field_c;
    static String field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static nf[] a(byte param0) {
        nf[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var6 = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        byte[] var12 = null;
        int[] var14 = null;
        byte[] var16 = null;
        int[] var18 = null;
        byte[] var20 = null;
        int[] var22 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        var9 = Confined.field_J ? 1 : 0;
        var1 = new nf[wc.field_hc];
        var3 = 38;
        var2 = 0;
        L0: while (true) {
          if (var2 >= wc.field_hc) {
            ql.a(false);
            return var1;
          } else {
            var4 = rg.field_I[var2] * sd.field_f[var2];
            var25 = rj.field_f[var2];
            if (!pa.field_e[var2]) {
              var11 = new int[var4];
              var27 = var11;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var4) {
                  var1[var2] = new nf(kb.field_a, em.field_e, jl.field_p[var2], ij.field_r[var2], rg.field_I[var2], sd.field_f[var2], var27);
                  var2++;
                  continue L0;
                } else {
                  var11[var7] = an.field_p[va.a(255, (int) var25[var7])];
                  var7++;
                  continue L1;
                }
              }
            } else {
              var24 = un.field_i[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var10 = var12;
              var6 = var10;
              var26 = new int[var4];
              var22 = var26;
              var18 = var22;
              var14 = var18;
              var7_ref_int__ = var14;
              var8 = 0;
              L2: while (true) {
                if (var4 <= var8) {
                  var1[var2] = (nf) (Object) new pd(kb.field_a, em.field_e, jl.field_p[var2], ij.field_r[var2], rg.field_I[var2], sd.field_f[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var7_ref_int__[var8] = nl.a(va.a((int) var24[var8], 255) << 24, an.field_p[va.a((int) var25[var8], 255)]);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        param0 = param0 & 8191;
        if (param1 > -121) {
            return 80;
        }
        if (4096 > param0) {
            return param0 >= 2048 ? -vj.field_e[param0 - 2048] : vj.field_e[-param0 + 2048];
        }
        return param0 >= 6144 ? vj.field_e[-6144 + param0] : -vj.field_e[-param0 + 6144];
    }

    public static void a(boolean param0) {
        field_a = null;
        field_g = null;
        field_e = null;
        field_f = null;
        field_d = null;
    }

    final static void a(java.awt.Frame param0, df param1, boolean param2) {
        bc var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param0, -89);
              L2: while (true) {
                if (0 != var3.field_g) {
                  if (var3.field_g != 1) {
                    jd.a(1, 100L);
                    continue L1;
                  } else {
                    param0.setVisible(false);
                    param0.dispose();
                    break L0;
                  }
                } else {
                  jd.a(1, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("si.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + true + ')');
        }
    }

    final static int a(int param0, rd param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 25;
              if (param1.field_vb) {
                var2_int = var2_int * 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 == param1.field_Qb) {
                  break L3;
                } else {
                  if (1 != param1.field_Qb) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (null != param1.field_Tb) {
                break L2;
              } else {
                if (null != param1.field_eb) {
                  break L2;
                } else {
                  var2_int = var2_int * 4;
                  break L2;
                }
              }
            }
            L4: {
              if (!param1.field_Ob) {
                break L4;
              } else {
                var2_int = var2_int * 2;
                break L4;
              }
            }
            L5: {
              if (0 == param1.field_wb) {
                break L5;
              } else {
                var2_int = var2_int * 2;
                break L5;
              }
            }
            L6: {
              if (param1.field_Qb == 3) {
                var2_int = var2_int >> 1;
                break L6;
              } else {
                break L6;
              }
            }
            stackOut_16_0 = var2_int;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("si.E(").append(107).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    si(int param0) {
        ((si) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "Ctrl";
        field_e = new String[]{"bosses/sphere/", "bosses/cube/", "bosses/bird/", "bosses/humanoid/"};
        field_f = "Password is valid";
        field_g = new ej();
        field_d = "Email is valid";
    }
}
