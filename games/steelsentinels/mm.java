/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_c;
    static gh field_a;
    static ul field_b;
    static String[] field_d;
    static String field_f;
    static ml field_e;
    static kj field_g;

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (!(co.field_f <= var1)) {
            be.field_d = be.field_d + (-var1 + co.field_f);
        }
        co.field_f = var1;
        int var3 = 23 / ((-10 - param0) / 47);
        return be.field_d + var1;
    }

    final static boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return cf.c((byte) 89);
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 9) {
                break L1;
              } else {
                mm.a((byte) 11, -108);
                break L1;
              }
            }
            stackIn_3_0 = ok.field_e.a(param1, -742, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("mm.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(byte param0, int param1) {
        param1 = (1431655765 & param1) + ((param1 & -1431655766) >>> 2096884577);
        param1 = (858993459 & param1) - -((param1 & -858993459) >>> -423750110);
        param1 = (param1 >>> -235892316) + param1 & 252645135;
        if (param0 < 100) {
            return -11;
        }
        param1 = param1 + (param1 >>> 1863617800);
        param1 = param1 + (param1 >>> 569464720);
        return 255 & param1;
    }

    final static void a(String param0, byte param1, String param2, java.applet.Applet param3, long param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = param3.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      if (param1 >= 88) {
                        break L2;
                      } else {
                        mm.a(true);
                        break L2;
                      }
                    }
                    L3: {
                      var9 = param0 + "=" + param2 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (0L > param4) {
                        var7 = var9 + "; Discard;";
                        break L3;
                      } else {
                        var7 = var9 + "; Expires=" + mj.b(param4 * 1000L + mm.a(-75), 0) + "; Max-Age=" + param4;
                        break L3;
                      }
                    }
                    hn.a(param3, 27781, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("mm.G(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L7;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L7;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, nk param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (nk.f((byte) -23)) {
                break L1;
              } else {
                if (oc.a(param1.field_N, param0 + 16155, false)) {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!t.a(rn.field_D, param1.field_N, -20370)) {
              if ((param1.field_Q ^ -1) != -2) {
                var7 = nl.a(uc.field_b[0], (byte) 125);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var7.length + -8) {
                    if (param0 == -16242) {
                      stackIn_23_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      stackIn_21_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    if (var7[var3] != param1.field_N) {
                      var3++;
                      continue L2;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2_ref);

            stackIn_26_1 = new StringBuilder().append("mm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_g = null;
        int var1 = 54 % ((param0 - 28) / 55);
        field_c = null;
    }

    static {
        field_c = "% engineered";
        field_d = new String[]{"PURPLE TEAM", "ORANGE TEAM", "GREEN TEAM"};
        field_b = new ul();
        field_f = "Cubes needed: ";
        field_e = new ml();
    }
}
