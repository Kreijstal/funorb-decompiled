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
            String var5 = null;
            String var4 = null;
            try {
                jf.field_l = param2;
                try {
                    if (param1 <= 34) {
                        h.a(81, 58);
                    }
                    var3 = param0.getParameter("cookieprefix");
                    var5 = var3;
                    var5 = var3;
                    var4 = param0.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                    if (param2.length() == 0) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    vh.a(param0, "document.cookie=\"" + var5 + "\"", -12300);
                } catch (Throwable throwable) {
                }
                tj.a(true, param0);
            } catch (RuntimeException runtimeException) {
                throw ma.a((Throwable) (Object) runtimeException, "h.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, long param1) {
        sj.field_b.setTime(new Date(param1));
        int var3 = sj.field_b.get(7);
        int var4 = sj.field_b.get(5);
        int var5 = sj.field_b.get(2);
        if (param0 > -8) {
            return null;
        }
        int var6 = sj.field_b.get(1);
        int var7 = sj.field_b.get(11);
        int var8 = sj.field_b.get(12);
        int var9 = sj.field_b.get(13);
        return qf.field_I[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + nf.field_b[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static void e() {
        gi var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Main.field_T;
        try {
          L0: {
            L1: {
              wd.field_e.f();
              cb.field_g.f();
              bi.field_d = bi.field_d - 1;
              if (bi.field_d != 0) {
                break L1;
              } else {
                bi.field_d = 200;
                var1 = (gi) (Object) aj.field_s.a((byte) 74);
                L2: while (true) {
                  if (var1 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var1.field_i.b(125)) {
                        break L3;
                      } else {
                        var1.c(84);
                        break L3;
                      }
                    }
                    var1 = (gi) (Object) aj.field_s.b((byte) -92);
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "h.HA(" + -84 + ')');
        }
    }

    final int a(byte param0, int param1) {
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (((h) this).field_H.a((byte) 109) > param1) {
              L1: {
                if (param0 == -63) {
                  break L1;
                } else {
                  field_F = 122;
                  break L1;
                }
              }
              return ((h) this).field_H.c(param1, 102);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final int a(boolean param0) {
        if (!param0) {
            field_F = -122;
        }
        return ((h) this).field_H.a((byte) 123);
    }

    final static kc[] b(int param0, int param1, int param2, int param3, int param4) {
        kc[] var6 = new kc[9];
        kc[] var5 = var6;
        kc dupTemp$0 = te.a(1, -127, param1);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        kc dupTemp$1 = te.a(1, -126, param4);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 != 0) {
            var6[4] = te.a(64, -126, param3);
        }
        return var5;
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
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var14 = Main.field_T;
        try {
          L0: {
            if (!super.a(param0, param1, param2, -96, param4, param5, param6)) {
              if (param3 <= -14) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                stackOut_20_0 = 1;
                stackIn_21_0 = stackOut_20_0;
                return stackIn_21_0 != 0;
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
                var8_int = ((h) this).field_G * var8_int / var9;
                if (param5 != 1) {
                  if (param5 == 2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= ((h) this).field_H.a((byte) 99)) {
                        if (var11 < 0) {
                          break L3;
                        } else {
                          ((h) this).field_H.e(0, var11);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = ((h) this).field_H.c(var12, -94) + -var8_int;
                          var13 = var13 * var13;
                          if (var10 <= var13) {
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  ((h) this).field_H.a(var8_int, 1);
                  break L3;
                }
              }
              stackOut_17_0 = 1;
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var8;
            stackOut_24_1 = new StringBuilder().append("h.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_23_0 != 0;
    }

    public static void a() {
        field_E = null;
        field_I = null;
    }

    private h() throws Throwable {
        throw new Error();
    }

    final int f(byte param0) {
        if (param0 >= -31) {
            h.a(53, -35);
        }
        return ((h) this).field_G;
    }

    final static void a(int param0, int param1) {
        qb.field_f = 1000000000L / (long)param1;
        if (param0 != -17685) {
            h.a(-3, 103);
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
