/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class di implements Iterator {
    private ug field_c;
    static int[] field_b;
    static String field_a;
    private ug field_d;
    private wh field_e;

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, oh param3) {
        cf.field_g = param3;
        gh.field_H = 0;
        try {
            td.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "di.B(" + 0 + ',' + 0 + ',' + 0 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final Object next() {
        ug var1 = ((di) this).field_d;
        if (((di) this).field_e.field_a == var1) {
            var1 = null;
            ((di) this).field_d = null;
        } else {
            ((di) this).field_d = var1.field_l;
        }
        ((di) this).field_c = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((di) this).field_d != ((di) this).field_e.field_a;
    }

    di(wh param0) {
        ((di) this).field_c = null;
        try {
            ((di) this).field_e = param0;
            ((di) this).field_d = ((di) this).field_e.field_a.field_l;
            ((di) this).field_c = null;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "di.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = Bounce.field_N;
        try {
          L0: {
            var10 = (CharSequence) (Object) param2;
            var3_int = pj.a(false, param1, var10);
            var4 = new String[var3_int - -1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var3_int <= var7) {
                L2: {
                  if (param0 < -107) {
                    break L2;
                  } else {
                    field_a = null;
                    break L2;
                  }
                }
                var4[var3_int] = param2.substring(var6);
                stackOut_9_0 = (String[]) var4;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param1 == param2.charAt(var8)) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param2.substring(var6, var8);
                    var6 = 1 + var8;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("di.C(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    public final void remove() {
        if (!(((di) this).field_c != null)) {
            throw new IllegalStateException();
        }
        ((di) this).field_c.a(10);
        ((di) this).field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[128];
        field_a = "Unpacking sound effects";
    }
}
