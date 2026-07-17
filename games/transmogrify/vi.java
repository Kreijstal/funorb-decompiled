/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vi implements Iterable {
    int field_c;
    private wf field_f;
    wf[] field_d;
    static StringBuilder[] field_g;
    static int[] field_a;
    static String field_i;
    static String field_b;
    static boolean field_h;
    static vd field_e;

    final wf a(int param0, long param1) {
        wf var5 = null;
        int var6 = Transmogrify.field_A ? 1 : 0;
        wf var4 = ((vi) this).field_d[(int)((long)(param0 + ((vi) this).field_c) & param1)];
        ((vi) this).field_f = var4.field_b;
        while (var4 != ((vi) this).field_f) {
            if (!(((vi) this).field_f.field_c != param1)) {
                var5 = ((vi) this).field_f;
                ((vi) this).field_f = ((vi) this).field_f.field_b;
                return var5;
            }
            ((vi) this).field_f = ((vi) this).field_f.field_b;
        }
        ((vi) this).field_f = null;
        return null;
    }

    final void a(wf param0, byte param1, long param2) {
        wf var5 = null;
        try {
            if (param0.field_f != null) {
                param0.c(5);
            }
            var5 = ((vi) this).field_d[(int)((long)(-1 + ((vi) this).field_c) & param2)];
            param0.field_f = var5.field_f;
            param0.field_b = var5;
            param0.field_f.field_b = param0;
            if (param1 < 60) {
                Object var6 = null;
                String[] discarded$0 = vi.a('X', (String) null, -67);
            }
            param0.field_b.field_f = param0;
            param0.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "vi.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static String[] a(char param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param1;
            var3_int = lj.a(param2 ^ 126, param0, var10);
            var4 = new String[1 + var3_int];
            var5 = param2;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param1.substring(var6);
                stackOut_7_0 = (String[]) var4;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param0 == param1.charAt(var8)) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param1.substring(var6, var8);
                    var6 = var8 + 1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("vi.D(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
        }
        return stackIn_8_0;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new w((vi) this);
    }

    private vi() throws Throwable {
        throw new Error();
    }

    final static void a() {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = 102;
        var2 = (Object) (Object) hi.field_e;
        synchronized (var2) {
          L0: {
            b.field_k = cg.field_k;
            gj.field_l = gj.field_l + 1;
            oa.field_j = fc.field_g;
            bk.field_a = uj.field_i;
            tl.field_a = li.field_j;
            li.field_j = false;
            tg.field_d = ad.field_b;
            ol.field_b = dh.field_w;
            nk.field_c = ga.field_b;
            ad.field_b = 0;
            break L0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_i = null;
        field_a = null;
        if (param0 < 33) {
            vi.a(103);
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_g = new StringBuilder[10];
        for (var0 = 0; field_g.length > var0; var0++) {
            field_g[var0] = new StringBuilder(12);
        }
        field_a = new int[field_g.length];
        field_i = "Creating your account";
        field_b = "Visit the Account Management section on the main site to view.";
    }
}
