/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wc implements Iterator {
    static String field_g;
    private ug field_i;
    private int field_c;
    static le[] field_e;
    static le field_h;
    static ad field_d;
    private dc field_b;
    static String field_a;
    private ug field_f;

    private final void a(boolean param0) {
        ((wc) this).field_f = ((wc) this).field_b.field_f[0].field_d;
        ((wc) this).field_i = null;
        ((wc) this).field_c = 1;
    }

    public final void remove() {
        if (!(null != ((wc) this).field_i)) {
            throw new IllegalStateException();
        }
        ((wc) this).field_i.c(-19822);
        ((wc) this).field_i = null;
    }

    final static aj a(byte param0) {
        String var1 = lb.d((byte) -56);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        return new aj(lb.d((byte) -56), uk.f(20));
    }

    final static void a(String param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          hf.field_b = param0;
          qh.a(12, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("wc.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw la.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + false + ')');
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_e = null;
        field_g = null;
        field_a = null;
        field_h = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((wc) this).field_b.field_f[-1 + ((wc) this).field_c] == ((wc) this).field_f) {
          L0: while (true) {
            if (((wc) this).field_c < ((wc) this).field_b.field_d) {
              int fieldTemp$1 = ((wc) this).field_c;
              ((wc) this).field_c = ((wc) this).field_c + 1;
              if (((wc) this).field_b.field_f[fieldTemp$1].field_d == ((wc) this).field_b.field_f[-1 + ((wc) this).field_c]) {
                ((wc) this).field_f = ((wc) this).field_b.field_f[-1 + ((wc) this).field_c];
                continue L0;
              } else {
                ((wc) this).field_f = ((wc) this).field_b.field_f[-1 + ((wc) this).field_c].field_d;
                return true;
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
        int var2 = 0;
        Object var3 = null;
        ug var3_ref = null;
        ug var4 = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((wc) this).field_f == ((wc) this).field_b.field_f[((wc) this).field_c + -1]) {
          L0: while (true) {
            if (((wc) this).field_c < ((wc) this).field_b.field_d) {
              int fieldTemp$2 = ((wc) this).field_c;
              ((wc) this).field_c = ((wc) this).field_c + 1;
              var3_ref = ((wc) this).field_b.field_f[fieldTemp$2].field_d;
              if (var3_ref == ((wc) this).field_b.field_f[-1 + ((wc) this).field_c]) {
                continue L0;
              } else {
                ((wc) this).field_f = var3_ref.field_d;
                ((wc) this).field_i = var3_ref;
                return (Object) (Object) var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((wc) this).field_f;
          ((wc) this).field_i = var4;
          ((wc) this).field_f = var4.field_d;
          return (Object) (Object) var4;
        }
    }

    final static void a(int param0) {
        if (224 > re.field_e) {
            qb.a(256, re.field_e + 32);
        } else {
            qb.a(256, 256);
            return;
        }
    }

    wc(dc param0) {
        ((wc) this).field_i = null;
        try {
            ((wc) this).field_b = param0;
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "wc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Reload game";
        field_a = "Waiting for music";
    }
}
