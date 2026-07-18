/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class da extends hb {
    static byte[][] field_L;
    wq field_D;
    static int field_G;
    static jp[] field_E;
    static int[] field_C;
    static int[] field_M;
    int field_K;
    byte field_F;
    static String field_H;
    static String field_J;

    final byte[] c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              var2_int = -99 % ((4 - param0) / 52);
              if (((da) this).field_u) {
                break L1;
              } else {
                if (~((da) this).field_D.field_l > ~(((da) this).field_D.field_k.length - ((da) this).field_F)) {
                  break L1;
                } else {
                  stackOut_7_0 = ((da) this).field_D.field_k;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "da.D(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    final static void f(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (pe.field_o.c(95)) {
                  break L2;
                } else {
                  vg.a(o.field_e.e((byte) 31), false, 11);
                  ed.field_d = true;
                  if (!BrickABrac.field_J) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              dn.b(0, -108, 11);
              break L1;
            }
            L3: {
              if (param0 == 122) {
                break L3;
              } else {
                field_E = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "da.C(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                sk.field_G = param0;
                try {
                  L1: {
                    var3 = param2.getParameter("cookieprefix");
                    var4 = param2.getParameter("cookiehost");
                    if (param1 > 44) {
                      L2: {
                        var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                        if (param0.length() == 0) {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ne.a(param2, "document.cookie=\"" + var5 + "\"", 5797);
                      break L1;
                    } else {
                      return;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = decompiledCaughtException;
                    break L3;
                  }
                }
                td.a(false, param2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) var3_ref2;
                stackOut_12_1 = new StringBuilder().append("da.A(");
                stackIn_15_0 = stackOut_12_0;
                stackIn_15_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param0 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L4;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_16_2 = stackOut_13_2;
                  break L4;
                }
              }
              L5: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
                stackIn_19_0 = stackOut_16_0;
                stackIn_19_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L5;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_20_1 = stackOut_17_1;
                  stackIn_20_2 = stackOut_17_2;
                  break L5;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        try {
            field_M = null;
            field_J = null;
            field_C = null;
            int var1_int = -85 / ((4 - param0) / 55);
            field_H = null;
            field_E = null;
            field_L = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "da.B(" + param0 + ')');
        }
    }

    final static String d(byte param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        String stackIn_38_0 = null;
        String stackIn_43_0 = null;
        String stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_13_0 = null;
        String stackOut_21_0 = null;
        String stackOut_32_0 = null;
        String stackOut_37_0 = null;
        String stackOut_42_0 = null;
        String stackOut_44_0 = null;
        String stackOut_27_0 = null;
        String stackOut_24_0 = null;
        Object stackOut_16_0 = null;
        try {
          L0: {
            if (2 > qg.field_A) {
              stackOut_3_0 = kd.field_c;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (null != wl.field_K) {
                if (!wl.field_K.a((byte) -127)) {
                  stackOut_11_0 = wn.field_a;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = d.field_C;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                if (param0 == 103) {
                  if (!ma.field_P.a((byte) -127)) {
                    stackOut_21_0 = tm.field_e;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  } else {
                    if (ma.field_P.a("commonui", -28138)) {
                      if (vh.field_S.a((byte) -127)) {
                        if (!vh.field_S.a("commonui", -28138)) {
                          stackOut_32_0 = m.field_k + " - " + vh.field_S.b(0, "commonui") + "%";
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0;
                        } else {
                          if (!ja.field_c.a((byte) -127)) {
                            stackOut_37_0 = hp.field_k;
                            stackIn_38_0 = stackOut_37_0;
                            return stackIn_38_0;
                          } else {
                            if (!ja.field_c.a(param0 ^ 12)) {
                              stackOut_42_0 = qm.field_e + " - " + ja.field_c.b(-4126) + "%";
                              stackIn_43_0 = stackOut_42_0;
                              return stackIn_43_0;
                            } else {
                              stackOut_44_0 = kd.field_a;
                              stackIn_45_0 = stackOut_44_0;
                              break L0;
                            }
                          }
                        }
                      } else {
                        stackOut_27_0 = vh.field_P;
                        stackIn_28_0 = stackOut_27_0;
                        return stackIn_28_0;
                      }
                    } else {
                      stackOut_24_0 = ib.field_F + " - " + ma.field_P.b(0, "commonui") + "%";
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0;
                    }
                  }
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  return (String) (Object) stackIn_17_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "da.E(" + param0 + ')');
        }
        return stackIn_45_0;
    }

    da() {
    }

    final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -21546) {
                break L1;
              } else {
                byte[] discarded$2 = ((da) this).c((byte) 12);
                break L1;
              }
            }
            if (null == ((da) this).field_D) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((da) this).field_D.field_l * 100 / (-((da) this).field_F + ((da) this).field_D.field_k.length);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "da.F(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new byte[250][];
        field_M = new int[8192];
        field_H = "Enter multiplayer lobby";
        field_J = "No highscores";
    }
}
