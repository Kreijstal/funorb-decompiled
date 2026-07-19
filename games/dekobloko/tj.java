/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends w {
    long field_Nb;
    static String field_ac;
    boolean field_ec;
    int field_dc;
    w field_Ob;
    boolean field_fc;
    static boolean field_Vb;
    static int[][] field_jc;
    String field_Rb;
    w field_Tb;
    int field_Ub;
    int field_Sb;
    static int field_Pb;
    boolean field_bc;
    w field_Zb;
    long field_cc;
    int field_Xb;
    int field_Qb;
    w field_gc;
    w field_Wb;
    static String field_ic;
    String field_Yb;
    int field_hc;

    final static int a(int param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            stackOut_2_0 = pe.a(param2, param0, -112, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(int param0, tj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_12_1 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_11_1 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_10_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_fc) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            if (stackIn_3_0 == (this.field_fc ? 1 : 0)) {
              stackOut_5_0 = this.field_fc;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              L2: {
                if (param0 == -985) {
                  break L2;
                } else {
                  this.field_fc = false;
                  break L2;
                }
              }
              L3: {
                stackOut_9_0 = param1.field_bc;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (this.field_bc) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L3;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L3;
                }
              }
              if ((stackIn_12_0 ? 1 : 0) != stackIn_12_1) {
                L4: {
                  if (~this.field_Nb <= ~param1.field_Nb) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                break L0;
              } else {
                stackOut_13_0 = this.field_bc;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("tj.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final static void a(boolean param0, int param1) {
        sc.field_n = 0;
        rb.field_b = 0;
        ac.field_F = dk.field_i;
        wh.field_a = 0;
        rg.field_a = new sk(2);
        rg.field_a.a(-1, 0, ak.a(bh.field_g, pm.field_f, (byte) 7), param0);
    }

    final boolean g(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 29) {
          L0: {
            this.field_Xb = 50;
            if (this.d((byte) -68)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.d((byte) -68)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            rf.a(12, (java.awt.Component) ((Object) param1));
            L1: {
              qf.a((byte) -35, (java.awt.Component) ((Object) param1));
              if (uc.field_e == null) {
                break L1;
              } else {
                uc.field_e.a(68, (java.awt.Component) ((Object) param1));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("tj.C(").append(false).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public static void e(int param0) {
        field_jc = (int[][]) null;
        field_ic = null;
        field_ac = null;
    }

    final static void h(byte param0) {
        if (param0 <= -22) {
          aj.field_a = new w(0L, (w) null);
          if (pd.field_a) {
            aj.field_a.a(fn.field_g, -16834);
            aj.field_a.a(gg.field_y, -16834);
            dc.field_e = new ak(uc.field_b, aj.field_a);
            g.field_R = new w(0L, (w) null);
            g.field_R.a(dc.field_e.field_h, -16834);
            g.field_R.a(uh.field_c, -16834);
            mf.h(5);
            return;
          } else {
            aj.field_a.a(gg.field_y, -16834);
            dc.field_e = new ak(uc.field_b, aj.field_a);
            g.field_R = new w(0L, (w) null);
            g.field_R.a(dc.field_e.field_h, -16834);
            g.field_R.a(uh.field_c, -16834);
            mf.h(5);
            return;
          }
        } else {
          return;
        }
    }

    tj(String param0, String param1, long param2) {
        super(0L, (w) null);
        CharSequence var6 = null;
        String discarded$0 = null;
        try {
            this.field_Rb = param0;
            this.field_Yb = param1;
            this.field_cc = param2;
            var6 = (CharSequence) ((Object) this.field_Rb);
            discarded$0 = kf.a(var6, (byte) 2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, String param1, String param2) {
        CharSequence var5 = null;
        String discarded$0 = null;
        try {
            this.field_Rb = param2;
            if (param0 < 10) {
                this.field_Wb = (w) null;
            }
            this.field_Yb = param1;
            var5 = (CharSequence) ((Object) this.field_Rb);
            discarded$0 = kf.a(var5, (byte) 2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "tj.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ac = "Show chat";
        field_ic = "Unfortunately we are unable to create an account for you at this time.";
    }
}
