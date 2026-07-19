/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static u field_c;
    static int field_e;
    static String field_b;
    static int field_d;
    static int field_a;

    public static void c(int param0) {
        field_c = null;
        field_b = null;
        if (param0 >= -10) {
            lc.b(-1);
        }
    }

    final static void b(int param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 != null) {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2_ref), (Object[]) null));
                        jk.field_f = (int)(var3.longValue() / 1048576L) - -1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L4: {
                  if (param0 == 24536) {
                    break L4;
                  } else {
                    field_e = 76;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            var1_int = 18;
            L1: while (true) {
              if (var1_int >= 32) {
                L2: {
                  if (param0 == -1) {
                    break L2;
                  } else {
                    field_b = (String) null;
                    break L2;
                  }
                }
                var1_int = 0;
                L3: while (true) {
                  if (var1_int >= ma.field_n.length) {
                    var1_int = 0;
                    L4: while (true) {
                      if (ma.field_n.length <= var1_int) {
                        break L0;
                      } else {
                        fo.field_m[var1_int] = fo.field_m[var1_int] - 1;
                        var1_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var5 = 0;
                    var2 = var5;
                    L5: while (true) {
                      if ((var5 ^ -1) <= -10) {
                        var1_int++;
                        continue L3;
                      } else {
                        kk.field_a[32][var5 + m.field_l[var1_int]] = bm.field_g;
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var2 = 0;
                L6: while (true) {
                  if (var2 >= ma.field_n.length) {
                    var1_int++;
                    continue L1;
                  } else {
                    var3 = 0;
                    L7: while (true) {
                      if ((var3 ^ -1) <= -10) {
                        var2++;
                        continue L6;
                      } else {
                        kk.field_a[var1_int][m.field_l[var2] + var3] = kk.field_a[var1_int - -1][var3 + m.field_l[var2]];
                        var3++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "lc.D(" + param0 + ')');
        }
    }

    final static e a(String param0, byte param1) {
        RuntimeException var2 = null;
        e stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_2_0 = null;
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
            L1: {
              if (param1 == 51) {
                break L1;
              } else {
                field_d = 49;
                break L1;
              }
            }
            stackOut_2_0 = new e(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("lc.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_b = "Orb coins: ";
        field_e = 10;
    }
}
