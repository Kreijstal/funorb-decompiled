/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qm implements Iterable {
    private hg field_e;
    static gi[] field_d;
    static int field_c;
    int field_g;
    static String[] field_f;
    hg[] field_b;
    static String field_a;

    final hg a(int param0, long param1) {
        hg var5 = null;
        int var6 = EscapeVector.field_A;
        if (param0 != -2678) {
            ((qm) this).field_g = -103;
        }
        hg var4 = ((qm) this).field_b[(int)((long)(-1 + ((qm) this).field_g) & param1)];
        ((qm) this).field_e = var4.field_b;
        while (var4 != ((qm) this).field_e) {
            if (!(~param1 != ~((qm) this).field_e.field_e)) {
                var5 = ((qm) this).field_e;
                ((qm) this).field_e = ((qm) this).field_e.field_b;
                return var5;
            }
            ((qm) this).field_e = ((qm) this).field_e.field_b;
        }
        ((qm) this).field_e = null;
        return null;
    }

    final static int a(dk[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        Object var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = 2147483647;
            var3 = param0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                L2: {
                  if (param1 > 9) {
                    break L2;
                  } else {
                    var7 = null;
                    int discarded$1 = qm.a((dk[]) null, (byte) 66);
                    break L2;
                  }
                }
                if (var2_int != 2147483647) {
                  stackOut_11_0 = var2_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5.field_f >= var2_int) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("qm.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new hb((qm) this);
    }

    final void a(long param0, byte param1, hg param2) {
        hg var5 = null;
        if (param2.field_d != null) {
            param2.c((byte) -51);
        }
        if (param1 != -106) {
            return;
        }
        try {
            var5 = ((qm) this).field_b[(int)(param0 & (long)(-1 + ((qm) this).field_g))];
            param2.field_d = var5.field_d;
            param2.field_b = var5;
            param2.field_d.field_b = param2;
            param2.field_b.field_d = param2;
            param2.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qm.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_a = null;
        field_f = null;
    }

    private qm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 64;
        field_a = "Age:";
    }
}
