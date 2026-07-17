/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii implements Iterator {
    private int field_d;
    private ug field_c;
    private jb field_b;
    static String field_e;
    private jb field_a;

    public final void remove() {
        if (!(null != ((ii) this).field_a)) {
            throw new IllegalStateException();
        }
        ((ii) this).field_a.a(false);
        ((ii) this).field_a = null;
    }

    private final void a(byte param0) {
        ((ii) this).field_a = null;
        ((ii) this).field_b = ((ii) this).field_c.field_c[0].field_b;
        ((ii) this).field_d = 1;
    }

    public static void a(int param0) {
        if (param0 > -53) {
            return;
        }
        field_e = null;
    }

    final static void a(int[] param0, fq param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 48 * param1.field_m / param1.field_p;
              var4 = param1.field_o * var3_int + 48 * param1.field_A + 24;
              if (vh.field_a) {
                var4 = tm.field_d[0].length * 24;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = 24 + param1.field_t * 48 - -(var3_int * param1.field_s);
              if (var4 >= param0[0]) {
                break L2;
              } else {
                param0[0] = var4;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ii.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 118 + 41);
        }
    }

    ii(ug param0) {
        ((ii) this).field_a = null;
        try {
            ((ii) this).field_c = param0;
            this.a((byte) -112);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ii.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        if (((ii) this).field_b == ((ii) this).field_c.field_c[((ii) this).field_d + -1]) {
          L0: while (true) {
            if (((ii) this).field_d < ((ii) this).field_c.field_e) {
              int fieldTemp$1 = ((ii) this).field_d;
              ((ii) this).field_d = ((ii) this).field_d + 1;
              if (((ii) this).field_c.field_c[fieldTemp$1].field_b != ((ii) this).field_c.field_c[((ii) this).field_d + -1]) {
                ((ii) this).field_b = ((ii) this).field_c.field_c[((ii) this).field_d - 1].field_b;
                return true;
              } else {
                ((ii) this).field_b = ((ii) this).field_c.field_c[-1 + ((ii) this).field_d];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        jb var1 = null;
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        if (((ii) this).field_b == ((ii) this).field_c.field_c[-1 + ((ii) this).field_d]) {
          L0: while (true) {
            if (((ii) this).field_d < ((ii) this).field_c.field_e) {
              int fieldTemp$2 = ((ii) this).field_d;
              ((ii) this).field_d = ((ii) this).field_d + 1;
              var1 = ((ii) this).field_c.field_c[fieldTemp$2].field_b;
              if (var1 == ((ii) this).field_c.field_c[-1 + ((ii) this).field_d]) {
                continue L0;
              } else {
                ((ii) this).field_b = var1.field_b;
                ((ii) this).field_a = var1;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((ii) this).field_b;
          ((ii) this).field_a = var1;
          ((ii) this).field_b = var1.field_b;
          return (Object) (Object) var1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Rock";
    }
}
