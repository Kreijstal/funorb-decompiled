/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends i {
    static int field_F;
    static hd field_I;
    private int field_N;
    private int field_J;
    static int field_L;
    static int[][] field_K;
    static boolean field_G;
    private long field_M;

    public static void g(int param0) {
        field_I = null;
        field_K = null;
    }

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
            stackOut_2_0 = ma.a((byte) -119, param0, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("hk.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 41);
        }
        return stackIn_3_0;
    }

    hk(vc param0, int param1) {
        super(param1, (lv) (Object) param0.field_m);
        RuntimeException var3 = null;
        String var3_ref = null;
        String var5 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        ((hk) this).field_M = -1L;
        try {
          L0: {
            L1: {
              L2: {
                ((hk) this).field_M = param0.field_a;
                if (!jd.f(-1)) {
                  break L2;
                } else {
                  if (param0.field_m.field_h.length > 0) {
                    stackOut_4_0 = "<br><br>" + mp.field_n;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = "";
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            L3: {
              var5 = stackIn_5_0;
              var3_ref = var5;
              if (param1 == 19) {
                ((hk) this).field_N = param0.field_i;
                ((hk) this).field_v = vo.a((byte) -18, ((hk) this).field_v, new String[2]);
                ((hk) this).field_J = 52;
                break L3;
              } else {
                if (param1 == 32) {
                  ((hk) this).field_N = param0.field_t;
                  ((hk) this).field_v = vo.a((byte) -18, ((hk) this).field_v, new String[2]);
                  ((hk) this).field_J = 66;
                  break L3;
                } else {
                  if (param1 != 37) {
                    break L3;
                  } else {
                    ((hk) this).field_N = param0.field_t;
                    ((hk) this).field_v = vo.a((byte) -18, ((hk) this).field_v, new String[3]);
                    ((hk) this).field_J = 66;
                    break L3;
                  }
                }
              }
            }
            ((hk) this).a(((hk) this).field_v, ((hk) this).field_t, ((hk) this).field_D, -90, ((hk) this).field_u);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("hk.<init>(");
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
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1) {
        super.a(82, param1);
        if (!la.a(100)) {
          if (!dg.field_e) {
            if (ds.field_g) {
              return;
            } else {
              if (0 != param1) {
                if (param0 < 60) {
                  field_L = -50;
                  return;
                } else {
                  return;
                }
              } else {
                or.field_d.b(((hk) this).field_J, (byte) 124);
                or.field_d.a(((hk) this).field_M, -1781890008);
                or.field_d.b(-74, ((hk) this).field_N);
                wh discarded$2 = gt.a(true, 128, (byte) 118, 49);
                ((hk) this).field_M = -1L;
                ((wf) (Object) rn.a(-108, 16)).field_H = -1L;
                if (param0 < 60) {
                  field_L = -50;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 2;
        field_K = new int[4][];
        field_K[3] = new int[1];
        field_K[3][0] = 29129;
        field_K[2] = new int[1];
        field_K[0] = new int[1];
        field_K[2][0] = 5356;
        field_K[0][0] = 21033;
        field_K[1] = new int[1];
        field_K[1][0] = 5542;
    }
}
