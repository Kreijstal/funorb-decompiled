/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class awa extends rqa {
    static StringBuilder field_p;
    static String[][] field_o;
    static int field_q;

    final static void a(int param0, mm param1, boolean param2, ds param3) {
        mm stackIn_5_0 = null;
        mm stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        mm stackIn_8_0 = null;
        mm stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        mm stackIn_11_0 = null;
        mm stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        mm stackIn_15_0 = null;
        mm stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        mm stackIn_18_0 = null;
        mm stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        mm stackIn_21_0 = null;
        mm stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                param1.field_zb = param3.e((byte) -114);
                break L1;
              }
            }
            L2: {
              param1.field_Fb = param3.e((byte) -109);
              param1.field_Cb = param3.e((byte) -120);
              var4_int = param3.e((byte) -113);
              stackIn_5_0 = (mm) (param1);

              if ((var4_int & 128) == 0) {
                stackIn_6_0 = (mm) ((Object) stackIn_5_0);
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = (mm) ((Object) stackIn_5_0);
                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_6_0.field_Xb = stackIn_6_1 != 0;
              stackIn_8_0 = (mm) (param1);

              if (0 == (var4_int & 8)) {
                stackIn_9_0 = (mm) ((Object) stackIn_8_0);
                stackIn_9_1 = 0;
                break L3;
              } else {
                stackIn_9_0 = (mm) ((Object) stackIn_8_0);
                stackIn_9_1 = 1;
                break L3;
              }
            }
            L4: {
              stackIn_9_0.field_Gb = stackIn_9_1 != 0;
              stackIn_11_0 = (mm) (param1);

              if ((var4_int & 16) == 0) {
                stackIn_12_0 = (mm) ((Object) stackIn_11_0);
                stackIn_12_1 = 1;
                break L4;
              } else {
                stackIn_12_0 = (mm) ((Object) stackIn_11_0);
                stackIn_12_1 = 2;
                break L4;
              }
            }
            L5: {
              L6: {
                stackIn_12_0.field_Bb = stackIn_12_1;
                stackIn_15_0 = (mm) (param1);

                if (!param1.field_Xb) {
                  break L6;
                } else {
                  stackIn_15_0 = (mm) ((Object) stackIn_15_0);

                  if (param1.field_zb >= param1.field_Fb) {
                    break L6;
                  } else {
                    stackIn_16_0 = (mm) ((Object) stackIn_15_0);
                    stackIn_16_1 = 1;
                    break L5;
                  }
                }
              }
              stackIn_16_0 = (mm) ((Object) stackIn_15_0);
              stackIn_16_1 = 0;
              break L5;
            }
            L7: {
              stackIn_16_0.field_cc = stackIn_16_1 != 0;
              stackIn_18_0 = (mm) (param1);

              if (-1 == (64 & var4_int ^ -1)) {
                stackIn_19_0 = (mm) ((Object) stackIn_18_0);
                stackIn_19_1 = 0;
                break L7;
              } else {
                stackIn_19_0 = (mm) ((Object) stackIn_18_0);
                stackIn_19_1 = 1;
                break L7;
              }
            }
            L8: {
              stackIn_19_0.field_fc = stackIn_19_1 != 0;
              stackIn_21_0 = (mm) (param1);

              if (-1 == (var4_int & 32 ^ -1)) {
                stackIn_22_0 = (mm) ((Object) stackIn_21_0);
                stackIn_22_1 = 0;
                break L8;
              } else {
                stackIn_22_0 = (mm) ((Object) stackIn_21_0);
                stackIn_22_1 = 1;
                break L8;
              }
            }
            L9: {
              stackIn_22_0.field_xb = stackIn_22_1 != 0;
              if ((4 & var4_int) == 0) {
                stackIn_25_0 = 0;
                break L9;
              } else {
                stackIn_25_0 = 1;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_25_0;
              param3.a(0, param1.field_Pb, (byte) -59, param1.field_Pb.length);
              if (0 == (2 & var4_int)) {
                stackIn_28_0 = 0;
                break L10;
              } else {
                stackIn_28_0 = 1;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_28_0;
              param1.field_Kb = param3.e(1869);
              param1.field_Ob = wt.a(false) + -(long)param3.h(106);
              var7 = -124 % ((param0 - 42) / 44);
              if (var5 == 0) {
                param1.field_Ub = -1;
                break L11;
              } else {
                param1.field_Ub = param3.h(53);
                break L11;
              }
            }
            L12: {
              param1.field_Nb = param3.k(255);
              var8 = param3.field_e;
              param1.field_Vb = param3.a(-1);
              if (var6 != 0) {
                param3.field_e = var8;
                param1.field_Ib = new String[param1.field_zb];
                var9 = 0;
                L13: while (true) {
                  if (var9 >= param1.field_zb) {
                    break L12;
                  } else {
                    param1.field_Ib[var9] = param3.a(-1);
                    var9++;
                    continue L13;
                  }
                }
              } else {
                param1.field_Ib = null;
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var4);

            stackIn_39_1 = new StringBuilder().append("awa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L14;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L15;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L15;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_40_0), stackIn_43_2 + ')');
        }
    }

    final static ha a(byte param0, int param1, java.awt.Canvas param2, d param3, int param4) {
        RuntimeException var5 = null;
        oa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 110) {
                break L1;
              } else {
                field_o = (String[][]) null;
                break L1;
              }
            }
            stackIn_3_0 = new oa(param2, param3, param1, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("awa.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param4 + ')');
        }
        return (ha) ((Object) stackIn_3_0);
    }

    public static void a(int param0) {
        field_p = null;
        field_o = (String[][]) null;
        if (param0 != -1) {
            field_p = (StringBuilder) null;
        }
    }

    awa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              sn.field_Y = param0[0].a(false);
              if (param1 <= -119) {
                break L1;
              } else {
                field_p = (StringBuilder) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("awa.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_p = new StringBuilder(80);
        field_q = 2;
    }
}
