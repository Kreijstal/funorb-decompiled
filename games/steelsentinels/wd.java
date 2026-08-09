/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static wk[] field_a;

    final static int a(String param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 52) {
                break L1;
              } else {
                var4 = (String) null;
                wd.a((String) null, (byte) -23, true);
                break L1;
              }
            }
            if (!param2) {
              stackIn_6_0 = pa.field_k.c(param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = wb.field_a.c(param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("wd.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            String var2 = (String) null;
            wd.a((String) null, (byte) -121, true);
        }
    }

    final static void a(gi param0, boolean param1, hk param2, byte param3) {
        hk stackIn_5_0 = null;
        hk stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        hk stackIn_8_0 = null;
        hk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        hk stackIn_11_0 = null;
        hk stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        hk stackIn_14_0 = null;
        hk stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        hk stackIn_17_0 = null;
        hk stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        hk stackIn_21_0 = null;
        hk stackIn_22_0 = null;
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
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                param2.field_wc = param0.f((byte) -124);
                break L1;
              }
            }
            L2: {
              var4_int = 99 / ((-4 - param3) / 58);
              param2.field_Ub = param0.f((byte) -67);
              param2.field_Nc = param0.f((byte) -113);
              var5 = param0.f((byte) -66);
              stackIn_5_0 = (hk) (param2);

              if ((128 & var5) == 0) {
                stackIn_6_0 = (hk) ((Object) stackIn_5_0);
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = (hk) ((Object) stackIn_5_0);
                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_6_0.field_nc = stackIn_6_1 != 0;
              stackIn_8_0 = (hk) (param2);

              if ((64 & var5) == 0) {
                stackIn_9_0 = (hk) ((Object) stackIn_8_0);
                stackIn_9_1 = 0;
                break L3;
              } else {
                stackIn_9_0 = (hk) ((Object) stackIn_8_0);
                stackIn_9_1 = 1;
                break L3;
              }
            }
            L4: {
              stackIn_9_0.field_rc = stackIn_9_1 != 0;
              stackIn_11_0 = (hk) (param2);

              if ((var5 & 8) == 0) {
                stackIn_12_0 = (hk) ((Object) stackIn_11_0);
                stackIn_12_1 = 0;
                break L4;
              } else {
                stackIn_12_0 = (hk) ((Object) stackIn_11_0);
                stackIn_12_1 = 1;
                break L4;
              }
            }
            L5: {
              stackIn_12_0.field_dc = stackIn_12_1 != 0;
              stackIn_14_0 = (hk) (param2);

              if (0 == (var5 & 32)) {
                stackIn_15_0 = (hk) ((Object) stackIn_14_0);
                stackIn_15_1 = 0;
                break L5;
              } else {
                stackIn_15_0 = (hk) ((Object) stackIn_14_0);
                stackIn_15_1 = 1;
                break L5;
              }
            }
            L6: {
              stackIn_15_0.field_ec = stackIn_15_1 != 0;
              stackIn_17_0 = (hk) (param2);

              if ((var5 & 16) != 0) {
                stackIn_18_0 = (hk) ((Object) stackIn_17_0);
                stackIn_18_1 = 2;
                break L6;
              } else {
                stackIn_18_0 = (hk) ((Object) stackIn_17_0);
                stackIn_18_1 = 1;
                break L6;
              }
            }
            L7: {
              L8: {
                stackIn_18_0.field_sc = stackIn_18_1;
                stackIn_21_0 = (hk) (param2);

                if (!param2.field_nc) {
                  break L8;
                } else {
                  stackIn_21_0 = (hk) ((Object) stackIn_21_0);

                  if (param2.field_Ub <= param2.field_wc) {
                    break L8;
                  } else {
                    stackIn_22_0 = (hk) ((Object) stackIn_21_0);
                    stackIn_22_1 = 1;
                    break L7;
                  }
                }
              }
              stackIn_22_0 = (hk) ((Object) stackIn_21_0);
              stackIn_22_1 = 0;
              break L7;
            }
            L9: {
              stackIn_22_0.field_cc = stackIn_22_1 != 0;
              if ((4 & var5) == 0) {
                stackIn_25_0 = 0;
                break L9;
              } else {
                stackIn_25_0 = 1;
                break L9;
              }
            }
            L10: {
              var6 = stackIn_25_0;
              param0.a(0, param2.field_Sb, 28, param2.field_Sb.length);
              if ((2 & var5) == 0) {
                stackIn_28_0 = 0;
                break L10;
              } else {
                stackIn_28_0 = 1;
                break L10;
              }
            }
            L11: {
              var7 = stackIn_28_0;
              param2.field_yc = param0.c((byte) -60);
              param2.field_Hc = mm.a(-93) + -(long)param0.i(0);
              if (var6 != 0) {
                param2.field_Mc = param0.i(0);
                break L11;
              } else {
                param2.field_Mc = -1;
                break L11;
              }
            }
            L12: {
              param2.field_fc = param0.g((byte) -104);
              var8 = param0.field_p;
              param2.field_Xb = param0.h(1);
              if (var7 != 0) {
                param2.field_hc = new String[param2.field_wc];
                param0.field_p = var8;
                var9 = 0;
                L13: while (true) {
                  if (var9 >= param2.field_wc) {
                    break L12;
                  } else {
                    param2.field_hc[var9] = param0.h(1);
                    var9++;
                    continue L13;
                  }
                }
              } else {
                param2.field_hc = null;
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

            stackIn_39_1 = new StringBuilder().append("wd.D(");

            if (param0 == null) {
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


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_40_0), stackIn_43_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            if (param1 == -31) {
              try {
                L0: {
                  hn.a("resizing", (byte) -41, wl.d((byte) -21), new Object[]{new Integer(param0)});
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2 = decompiledCaughtException;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
