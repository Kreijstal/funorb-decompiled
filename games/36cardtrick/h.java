/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class h extends hl {
    int field_J;
    private fl field_H;
    private int field_G;
    int field_K;
    static fe field_I;
    static int field_F;
    static boolean[] field_E;

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            jf.field_l = param2;
            try {
                if (param1 <= 34) {
                    h.a(81, 58);
                }
                var3 = param0.getParameter("cookieprefix");
                var4 = param0.getParameter("cookiehost");
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (param2.length() == 0) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                vh.a(param0, "document.cookie=\"" + var5 + "\"", -12300);
            } catch (Throwable throwable) {
            }
            tj.a(true, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, long param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            sj.field_b.setTime(new Date(param1));
            var3_int = sj.field_b.get(7);
            var4 = sj.field_b.get(5);
            var5 = sj.field_b.get(2);
            if (param0 <= -8) {
              var6 = sj.field_b.get(1);
              var7 = sj.field_b.get(11);
              var8 = sj.field_b.get(12);
              var9 = sj.field_b.get(13);
              stackOut_3_0 = qf.field_I[var3_int - 1] + ", " + var4 / 10 + var4 % 10 + "-" + nf.field_b[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "h.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void e(byte param0) {
        gi var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Main.field_T;
        try {
          L0: {
            L1: {
              wd.field_e.f();
              if (param0 == -84) {
                break L1;
              } else {
                field_F = -57;
                break L1;
              }
            }
            L2: {
              L3: {
                cb.field_g.f();
                bi.field_d = bi.field_d - 1;
                if (bi.field_d != 0) {
                  break L3;
                } else {
                  bi.field_d = 200;
                  var1 = (gi) (Object) aj.field_s.a((byte) 74);
                  L4: while (true) {
                    if (var1 == null) {
                      break L3;
                    } else {
                      if (var2 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (var1.field_i.b(125)) {
                            break L5;
                          } else {
                            var1.c(84);
                            break L5;
                          }
                        }
                        var1 = (gi) (Object) aj.field_s.b((byte) -92);
                        if (var2 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "h.HA(" + param0 + ')');
        }
    }

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (~((h) this).field_H.a((byte) 109) < ~param1) {
                  L2: {
                    if (param0 == -63) {
                      break L2;
                    } else {
                      field_F = 122;
                      break L2;
                    }
                  }
                  stackOut_9_0 = ((h) this).field_H.c(param1, 102);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = -1;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "h.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_F = -122;
                break L1;
              }
            }
            stackOut_3_0 = ((h) this).field_H.a((byte) 123);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "h.H(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static kc[] b(int param0, int param1, int param2, int param3, int param4) {
        kc[] var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_5_0 = null;
        kc[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        kc[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              var5 = new kc[9];
              kc dupTemp$4 = te.a(param0, -127, param1);
              var5[6] = dupTemp$4;
              var5[3] = dupTemp$4;
              var5[2] = dupTemp$4;
              var5[1] = dupTemp$4;
              var5[0] = dupTemp$4;
              kc dupTemp$5 = te.a(param0, -126, param4);
              var5[8] = dupTemp$5;
              var5[7] = dupTemp$5;
              var5[5] = dupTemp$5;
              if (param3 == 0) {
                break L1;
              } else {
                var5[4] = te.a(64, -126, param3);
                break L1;
              }
            }
            if (param2 == 15762) {
              stackOut_6_0 = (kc[]) var5;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (kc[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var5_ref, "h.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var14 = Main.field_T;
        try {
          L0: {
            if (!super.a(param0, param1, param2, -96, param4, param5, param6)) {
              if (param3 <= -14) {
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                break L0;
              } else {
                stackOut_30_0 = 1;
                stackIn_31_0 = stackOut_30_0;
                return stackIn_31_0 != 0;
              }
            } else {
              L1: {
                var8_int = -((h) this).field_K + -param0 + param2;
                var9 = ((h) this).field_h + -(2 * ((h) this).field_K);
                if (var8_int <= var9) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if (var8_int >= 0) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var8_int = ((h) this).field_G * var8_int / var9;
                  if (param5 != 1) {
                    break L4;
                  } else {
                    ((h) this).field_H.a(var8_int, 1);
                    if (var14 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (param5 == 2) {
                  var10 = 2147483647;
                  var11 = -1;
                  var12 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (~var12 <= ~((h) this).field_H.a((byte) 99)) {
                          break L7;
                        } else {
                          var13 = ((h) this).field_H.c(var12, -94) + -var8_int;
                          var13 = var13 * var13;
                          stackOut_17_0 = var10;
                          stackOut_17_1 = var13;
                          stackIn_24_0 = stackOut_17_0;
                          stackIn_24_1 = stackOut_17_1;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          if (var14 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_18_0 <= stackIn_18_1) {
                                break L8;
                              } else {
                                var10 = var13;
                                var11 = var12;
                                break L8;
                              }
                            }
                            var12++;
                            if (var14 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackOut_23_0 = ~var11;
                      stackOut_23_1 = -1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L6;
                    }
                    if (stackIn_24_0 > stackIn_24_1) {
                      break L3;
                    } else {
                      ((h) this).field_H.e(0, var11);
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_27_0 = 1;
              stackIn_28_0 = stackOut_27_0;
              return stackIn_28_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var8 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var8;
            stackOut_34_1 = new StringBuilder().append("h.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param4 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L9;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_33_0 != 0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_E = null;
              if (param0 == -26526) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            field_I = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "h.GA(" + param0 + ')');
        }
    }

    private h() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "h.<init>()");
        }
    }

    final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -31) {
                break L1;
              } else {
                h.a(53, -35);
                break L1;
              }
            }
            stackOut_3_0 = ((h) this).field_G;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "h.IA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1) {
        try {
            qb.field_f = 1000000000L / (long)param1;
            if (param0 != -17685) {
                h.a(-3, 103);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "h.D(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new fe(0);
        field_E = new boolean[]{false, false, false, false, false, true, true, true, true, true, true};
    }
}
