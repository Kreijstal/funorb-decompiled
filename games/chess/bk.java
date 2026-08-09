/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends o {
    static int field_n;
    static String[] field_l;
    boolean field_m;
    int field_j;
    static int field_k;
    int[] field_o;

    final static ln a(int param0, int param1) {
        String var3;
        l stackIn_4_0 = null;
        l stackIn_8_0 = null;
        if (param0 > -115) {
          L0: {
            var3 = (String) null;
            bk.a((byte) -107, true, (String) null, (ol) null, (String) null, 55, (String) null);
            if (null == ae.field_f) {
              stackIn_8_0 = null;
              break L0;
            } else {
              stackIn_8_0 = ae.field_f.a((long)param1, 3000);
              break L0;
            }
          }
          return (ln) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null == ae.field_f) {
              stackIn_4_0 = null;
              break L1;
            } else {
              stackIn_4_0 = ae.field_f.a((long)param1, 3000);
              break L1;
            }
          }
          return (ln) ((Object) stackIn_4_0);
        }
    }

    final static void a(int param0) {
        if (param0 != 16777215) {
            field_k = 78;
            me.field_a = null;
            return;
        }
        me.field_a = null;
    }

    final static boolean a(byte param0, boolean param1, String param2, ol param3, String param4, int param5, String param6) {
        vd var7 = null;
        RuntimeException var7_ref = null;
        vd var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ji.field_T == g.field_a) {
              L1: {
                var8 = new vd(jh.field_e, param3);
                var7 = var8;
                jh.field_e.b(var8, (byte) -93);
                if (jn.a(32359)) {
                  var8.o(-10896);
                  break L1;
                } else {
                  L2: {
                    lg.field_a = null;
                    ih.field_Q = param6;
                    g.field_a = ci.field_ub;
                    cn.field_f = param5;
                    jd.field_d = param2;
                    oc.field_o = param4;
                    if (!param1) {
                      stackIn_7_0 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                  wc.field_E = stackIn_7_0 != 0;
                  break L1;
                }
              }
              if (param0 > 71) {
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_k = 107;
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("bk.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        if (!param0) {
            field_k = 115;
        }
    }

    bk() {
        this.field_m = false;
    }

    static {
        field_l = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_k = 16777215;
    }
}
