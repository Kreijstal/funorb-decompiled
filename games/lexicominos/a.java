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
            ng var2 = (ng) null;
            a.a((byte) 42, (ng) null);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            if (!(param0 > ig.field_a.field_h)) {
                return true;
            }
            if (null == jc.field_b) {
                return false;
            }
            int var2_int = jc.field_b.d(param1 + -16791);
            if (param1 != 10343) {
                return false;
            }
            if (!((var2_int ^ -1) >= -1)) {
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
            try {
                if (false) throw (IOException) null;
                if ((var2_int ^ -1) <= -1 && vl.b(-91) <= 30000L) {
                    return false;
                }
                ck.b((byte) -120);
            } catch (IOException iOException) {
                ck.b((byte) -86);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return (String) null;
        }
        if (null == og.field_c) {
            return "";
        }
        return og.field_c;
    }

    final bj a(byte param0) {
        if (param0 != 45) {
            return (bj) null;
        }
        return jf.field_M;
    }

    final static int c(boolean param0) {
        if (!param0) {
            field_c = -69;
            return cg.field_l;
        }
        return cg.field_l;
    }

    final static void a(byte param0, ng param1) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int[] var2 = null;
        int var3 = 0;
        bd var4 = null;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
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
            var4 = (bd) ((Object) param1.a(true));
            L2: while (true) {
              if (var4 == null) {
                var3 = 0;
                dd.a(var2, -23588);
                var4 = (bd) ((Object) param1.a(true));
                L3: while (true) {
                  if (var4 == null) {
                    break L0;
                  } else {
                    incrementValue$3 = var3;
                    var3++;
                    var4.field_h = var2[incrementValue$3];
                    var4 = (bd) ((Object) param1.f(2));
                    continue L3;
                  }
                }
              } else {
                incrementValue$4 = var3;
                var3++;
                var6[incrementValue$4] = var4.field_h;
                var4 = (bd) ((Object) param1.f(2));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2_ref);

            stackIn_12_1 = new StringBuilder().append("a.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    a(String param0, String param1) {
        try {
            this.field_d = param0;
            this.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(wf param0, int param1) {
        try {
            param0.a((byte) -38, this.field_d);
            param0.a(0, this.field_g);
            if (param1 != 7895) {
                field_f = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "a.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = "Back";
        field_f = "Just play";
    }
}
