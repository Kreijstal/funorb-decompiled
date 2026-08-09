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
        nf[] var1;
        int var2;
        int var3;
        int var4;
        byte[] var6;
        int var7;
        int[] var7_ref_int__;
        int var8;
        int var9;
        byte[] var10;
        int[] var11;
        byte[] var12;
        int[] var14;
        byte[] var16;
        int[] var18;
        byte[] var22;
        int[] var23;
        var9 = Confined.field_J ? 1 : 0;
        var1 = new nf[wc.field_hc];
        var3 = 76 / ((param0 - -87) / 32);
        var2 = 0;
        L0: while (true) {
          if (var2 >= wc.field_hc) {
            ql.a(false);
            return var1;
          } else {
            var4 = rg.field_I[var2] * sd.field_f[var2];
            var22 = rj.field_f[var2];
            if (!pa.field_e[var2]) {
              var11 = new int[var4];
              var23 = var11;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var4) {
                  var1[var2] = new nf(kb.field_a, em.field_e, jl.field_p[var2], ij.field_r[var2], rg.field_I[var2], sd.field_f[var2], var23);
                  var2++;
                  continue L0;
                } else {
                  var11[var7] = an.field_p[va.a(255, (int) var22[var7])];
                  var7++;
                  continue L1;
                }
              }
            } else {
              var16 = un.field_i[var2];
              var12 = var16;
              var10 = var12;
              var6 = var10;
              var18 = new int[var4];
              var14 = var18;
              var7_ref_int__ = var14;
              var8 = 0;
              L2: while (true) {
                if (var4 <= var8) {
                  var1[var2] = (nf) ((Object) new pd(kb.field_a, em.field_e, jl.field_p[var2], ij.field_r[var2], rg.field_I[var2], sd.field_f[var2], var18));
                  var2++;
                  continue L0;
                } else {
                  var7_ref_int__[var8] = nl.a(va.a((int) var16[var8], 255) << -2105943976, an.field_p[va.a((int) var22[var8], 255)]);
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
        return -6145 >= (param0 ^ -1) ? vj.field_e[-6144 + param0] : -vj.field_e[-param0 + 6144];
    }

    public static void a(boolean param0) {
        field_a = null;
        field_g = null;
        if (param0) {
            field_b = false;
        }
        field_e = null;
        field_f = null;
        field_d = null;
    }

    final static void a(java.awt.Frame param0, df param1, boolean param2) {
        bc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              var3 = param1.a(param0, -89);
              L3: while (true) {
                if (0 != var3.field_g) {
                  if (var3.field_g != 1) {
                    jd.a(1, 100L);
                    continue L2;
                  } else {
                    param0.setVisible(false);
                    param0.dispose();
                    break L0;
                  }
                } else {
                  jd.a(1, 10L);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("si.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, rd param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0 > 60) {
                break L5;
              } else {
                si.a((byte) 115);
                break L5;
              }
            }
            L6: {
              if (0 == param1.field_wb) {
                break L6;
              } else {
                var2_int = var2_int * 2;
                break L6;
              }
            }
            L7: {
              if (param1.field_Qb == 3) {
                var2_int = var2_int >> 1;
                break L7;
              } else {
                break L7;
              }
            }
            stackIn_19_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("si.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    si(int param0) {
        this.field_c = param0;
    }

    static {
        field_b = false;
        field_a = "Ctrl";
        field_e = new String[]{"bosses/sphere/", "bosses/cube/", "bosses/bird/", "bosses/humanoid/"};
        field_f = "Password is valid";
        field_g = new ej();
        field_d = "Email is valid";
    }
}
