/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends kb {
    private String field_g;
    static String field_e;
    static String field_f;
    private String field_d;
    static int field_c;

    public static void b(boolean param0) {
        field_e = null;
        field_f = null;
        if (!param0) {
            Object var2 = null;
            a.a((byte) 42, (ng) null);
        }
    }

    final static boolean b(int param0) {
        try {
            if (!(param0 > ig.field_a.field_h)) {
                return true;
            }
            if (null == jc.field_b) {
                return false;
            }
            int var2_int = jc.field_b.d(-6448);
            if (!(var2_int <= 0)) {
                if (param0 - ig.field_a.field_h < var2_int) {
                    var2_int = param0 + -ig.field_a.field_h;
                }
                jc.field_b.a(ig.field_a.field_j, (byte) -109, var2_int, ig.field_a.field_h);
                ta.field_e = rf.c(0);
                ig.field_a.field_h = ig.field_a.field_h + var2_int;
                if (param0 > ig.field_a.field_h) {
                    return false;
                }
                ig.field_a.field_h = 0;
                return true;
            }
            {
                if (var2_int >= 0) {
                    if (vl.b(-91) <= 30000L) {
                        return false;
                    }
                }
                ck.b((byte) -120);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a() {
        if (null == og.field_c) {
            return "";
        }
        return og.field_c;
    }

    final bj a(byte param0) {
        if (param0 != 45) {
            return null;
        }
        return jf.field_M;
    }

    final static int c() {
        return cg.field_l;
    }

    final static void a(byte param0, ng param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        bd var4 = null;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = new int[param1.b(2)];
              var2 = var6;
              var3 = 0;
              if (param0 <= -88) {
                break L1;
              } else {
                a.b(false);
                break L1;
              }
            }
            var4 = (bd) (Object) param1.a(true);
            L2: while (true) {
              if (var4 == null) {
                var3 = 0;
                int discarded$8 = -23588;
                dd.a(var2);
                var4 = (bd) (Object) param1.a(true);
                L3: while (true) {
                  if (var4 == null) {
                    break L0;
                  } else {
                    int incrementValue$9 = var3;
                    var3++;
                    var4.field_h = var2[incrementValue$9];
                    var4 = (bd) (Object) param1.f(2);
                    continue L3;
                  }
                }
              } else {
                int incrementValue$10 = var3;
                var3++;
                var6[incrementValue$10] = var4.field_h;
                var4 = (bd) (Object) param1.f(2);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("a.A(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    a(String param0, String param1) {
        try {
            ((a) this).field_d = param0;
            ((a) this).field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "a.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(wf param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a((byte) -38, ((a) this).field_d);
              param0.a(0, ((a) this).field_g);
              if (param1 == 7895) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("a.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Back";
        field_f = "Just play";
    }
}
