/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends li {
    byte[] field_n;

    ph(byte[] param0) {
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ph.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(uh param0, boolean param1, ed param2, boolean param3) {
        uh stackIn_8_0 = null;
        uh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        uh stackIn_11_0 = null;
        uh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        uh stackIn_14_0 = null;
        uh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        uh stackIn_18_0 = null;
        uh stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        uh stackIn_21_0 = null;
        uh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        uh stackIn_24_0 = null;
        uh stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3) {
                param0.field_Qb = param2.h(-11);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_uc = param2.h(-11);
            param0.field_Ub = param2.h(-11);
            if (param1) {
              L2: {
                var4_int = param2.h(-11);
                stackIn_8_0 = (uh) (param0);

                if ((var4_int & 128) == 0) {
                  stackIn_9_0 = (uh) ((Object) stackIn_8_0);
                  stackIn_9_1 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = (uh) ((Object) stackIn_8_0);
                  stackIn_9_1 = 1;
                  break L2;
                }
              }
              L3: {
                stackIn_9_0.field_Mb = stackIn_9_1 != 0;
                stackIn_11_0 = (uh) (param0);

                if ((var4_int & 16) != 0) {
                  stackIn_12_0 = (uh) ((Object) stackIn_11_0);
                  stackIn_12_1 = 2;
                  break L3;
                } else {
                  stackIn_12_0 = (uh) ((Object) stackIn_11_0);
                  stackIn_12_1 = 1;
                  break L3;
                }
              }
              L4: {
                stackIn_12_0.field_xc = stackIn_12_1;
                stackIn_14_0 = (uh) (param0);

                if ((var4_int & 32) == 0) {
                  stackIn_15_0 = (uh) ((Object) stackIn_14_0);
                  stackIn_15_1 = 0;
                  break L4;
                } else {
                  stackIn_15_0 = (uh) ((Object) stackIn_14_0);
                  stackIn_15_1 = 1;
                  break L4;
                }
              }
              L5: {
                L6: {
                  stackIn_15_0.field_Tb = stackIn_15_1 != 0;
                  stackIn_18_0 = (uh) (param0);

                  if (!param0.field_Mb) {
                    break L6;
                  } else {
                    stackIn_18_0 = (uh) ((Object) stackIn_18_0);

                    if (param0.field_uc <= param0.field_Qb) {
                      break L6;
                    } else {
                      stackIn_19_0 = (uh) ((Object) stackIn_18_0);
                      stackIn_19_1 = 1;
                      break L5;
                    }
                  }
                }
                stackIn_19_0 = (uh) ((Object) stackIn_18_0);
                stackIn_19_1 = 0;
                break L5;
              }
              L7: {
                stackIn_19_0.field_dc = stackIn_19_1 != 0;
                stackIn_21_0 = (uh) (param0);

                if (-1 == (var4_int & 8 ^ -1)) {
                  stackIn_22_0 = (uh) ((Object) stackIn_21_0);
                  stackIn_22_1 = 0;
                  break L7;
                } else {
                  stackIn_22_0 = (uh) ((Object) stackIn_21_0);
                  stackIn_22_1 = 1;
                  break L7;
                }
              }
              L8: {
                stackIn_22_0.field_vc = stackIn_22_1 != 0;
                stackIn_24_0 = (uh) (param0);

                if (0 == (var4_int & 64)) {
                  stackIn_25_0 = (uh) ((Object) stackIn_24_0);
                  stackIn_25_1 = 0;
                  break L8;
                } else {
                  stackIn_25_0 = (uh) ((Object) stackIn_24_0);
                  stackIn_25_1 = 1;
                  break L8;
                }
              }
              L9: {
                stackIn_25_0.field_kc = stackIn_25_1 != 0;
                if (-1 == (4 & var4_int ^ -1)) {
                  stackIn_28_0 = 0;
                  break L9;
                } else {
                  stackIn_28_0 = 1;
                  break L9;
                }
              }
              L10: {
                var5 = stackIn_28_0;
                param2.a(0, param0.field_fc, param0.field_fc.length, 61);
                if ((2 & var4_int) == 0) {
                  stackIn_31_0 = 0;
                  break L10;
                } else {
                  stackIn_31_0 = 1;
                  break L10;
                }
              }
              L11: {
                var6 = stackIn_31_0;
                param0.field_tc = param2.a((byte) -11);
                param0.field_Pb = gk.a(94) + -(long)param2.b(param1);
                if (var5 != 0) {
                  param0.field_Yb = param2.b(true);
                  break L11;
                } else {
                  param0.field_Yb = -1;
                  break L11;
                }
              }
              param0.field_hc = param2.i(-31016);
              var7 = param2.field_u;
              param0.field_Nb = param2.f(128);
              if (var6 != 0) {
                param0.field_Hb = new String[param0.field_Qb];
                param2.field_u = var7;
                var8 = 0;
                L12: while (true) {
                  if (param0.field_Qb <= var8) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    param0.field_Hb[var8] = param2.f(128);
                    var8++;
                    continue L12;
                  }
                }
              } else {
                param0.field_Hb = null;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var4);

            stackIn_42_1 = new StringBuilder().append("ph.A(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L13;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L14;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L14;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_43_0), stackIn_46_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
