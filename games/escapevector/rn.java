/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rn extends RuntimeException {
    Throwable field_a;
    static int[] field_f;
    static int[] field_b;
    String field_g;
    static hf field_c;
    static int[] field_d;
    static int field_e;

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static boolean a() {
        if (pg.field_c == null) {
            return false;
        }
        if (!al.field_d.a((byte) 63)) {
            return false;
        }
        return true;
    }

    rn(Throwable param0, String param1) {
        ((rn) this).field_g = param1;
        ((rn) this).field_a = param0;
    }

    final static tk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        tk var7 = null;
        int var8 = 0;
        tk stackIn_4_0 = null;
        tk stackIn_7_0 = null;
        tk stackIn_10_0 = null;
        tk stackIn_15_0 = null;
        tk stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_3_0 = null;
        tk stackOut_17_0 = null;
        tk stackOut_14_0 = null;
        tk stackOut_9_0 = null;
        tk stackOut_6_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = mf.field_d;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int <= 255) {
                var3 = bb.a(-128, param0, '.');
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = param1;
                  L1: while (true) {
                    if (~var4.length >= ~var5) {
                      int discarded$2 = 0;
                      stackOut_17_0 = co.a(var3[var3.length - 1]);
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = vk.a(var6, param1 + -116);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackOut_14_0 = (tk) var7;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = mf.field_d;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = d.field_c;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("rn.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (pg.field_c == null) {
                break L0;
              } else {
                L1: {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (al.field_d != ck.field_t) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (om.field_c.field_m != 0) {
                    break L2;
                  } else {
                    if (~(10000L + le.field_c) > ~td.b(128)) {
                      om.field_c.a(param0, true);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 >= om.field_c.field_m) {
                    break L3;
                  } else {
                    {
                      L4: {
                        pg.field_c.a(om.field_c.field_m, 0, om.field_c.field_g, 5000);
                        le.field_c = td.b(128);
                        break L4;
                      }
                    }
                    om.field_c.field_m = 0;
                    break L3;
                  }
                }
                return;
              }
            }
            om.field_c.field_m = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{29, 0, 0, -3, -3};
        field_f = new int[]{19, 0, -10, -5, -5};
        field_b = new int[17];
        int[] var1 = new int[]{29, 0, 0, -3, -3};
        int[] var0 = var1;
        qg.a(var0, 0, field_b, 0, var1.length);
        field_f = new int[17];
        int[] var2 = new int[]{19, 0, -10, -5, -5};
        var0 = var2;
        qg.a(var0, 0, field_f, 0, var2.length);
        field_c = new hf();
        field_d = new int[8192];
    }
}
