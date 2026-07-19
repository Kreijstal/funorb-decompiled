/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fja extends rqa {
    static int field_o;
    static String field_r;
    static caa[] field_q;
    static rq field_p;

    fja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        field_r = null;
        int var1 = 42 / ((param0 - 0) / 43);
        field_q = null;
    }

    final static fs[] a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fs[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        fs[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        fs[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0[-1 + param0.length] != 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_4_0;
              if (var2_int != 0) {
                stackOut_6_0 = param0.length;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1 + param0.length;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var3 = new fs[stackIn_7_0];
              var4 = 0;
              if (param1 == 2) {
                break L3;
              } else {
                field_q = (caa[]) null;
                break L3;
              }
            }
            var4 = 0;
            L4: while (true) {
              if (param0.length <= var4) {
                L5: {
                  if (var4 >= var3.length) {
                    break L5;
                  } else {
                    var3[var4] = new fs(0, 2);
                    break L5;
                  }
                }
                stackOut_14_0 = (fs[]) (var3);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                var3[var4] = new fs(param0[var4], 2);
                var4++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("fja.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final static void a(int param0) {
        pca.field_i = new uj[13];
        pca.field_i[0] = (uj) ((Object) new nfa());
        pca.field_i[1] = (uj) ((Object) new rea());
        pca.field_i[2] = (uj) ((Object) new mcb());
        if (param0 != 11) {
          fja.a(-61);
          pca.field_i[3] = (uj) ((Object) new qsb());
          pca.field_i[4] = (uj) ((Object) new gb());
          pca.field_i[5] = (uj) ((Object) new uw());
          pca.field_i[6] = (uj) ((Object) new vdb());
          pca.field_i[7] = (uj) ((Object) new lg());
          pca.field_i[8] = (uj) ((Object) new nnb());
          pca.field_i[9] = (uj) ((Object) new kib());
          pca.field_i[10] = (uj) ((Object) new pva());
          pca.field_i[11] = (uj) ((Object) new fpa());
          pca.field_i[12] = (uj) ((Object) new hka());
          return;
        } else {
          pca.field_i[3] = (uj) ((Object) new qsb());
          pca.field_i[4] = (uj) ((Object) new gb());
          pca.field_i[5] = (uj) ((Object) new uw());
          pca.field_i[6] = (uj) ((Object) new vdb());
          pca.field_i[7] = (uj) ((Object) new lg());
          pca.field_i[8] = (uj) ((Object) new nnb());
          pca.field_i[9] = (uj) ((Object) new kib());
          pca.field_i[10] = (uj) ((Object) new pva());
          pca.field_i[11] = (uj) ((Object) new fpa());
          pca.field_i[12] = (uj) ((Object) new hka());
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
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
            if (param1 <= -119) {
              stackOut_3_0 = new nc(frb.a(231, 107));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("fja.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_r = "Cancel";
        field_o = 50;
    }
}
