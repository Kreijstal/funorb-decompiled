/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nd implements Iterator {
    private int field_b;
    private vg field_d;
    private vg field_a;
    private sk field_c;

    final static boolean b() {
        return !gva.field_b.b(52);
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        if (((nd) this).field_c.field_e[-1 + ((nd) this).field_b] == ((nd) this).field_a) {
          L0: while (true) {
            if (((nd) this).field_c.field_g > ((nd) this).field_b) {
              int fieldTemp$1 = ((nd) this).field_b;
              ((nd) this).field_b = ((nd) this).field_b + 1;
              if (((nd) this).field_c.field_e[fieldTemp$1].field_a == ((nd) this).field_c.field_e[((nd) this).field_b - 1]) {
                ((nd) this).field_a = ((nd) this).field_c.field_e[-1 + ((nd) this).field_b];
                continue L0;
              } else {
                ((nd) this).field_a = ((nd) this).field_c.field_e[-1 + ((nd) this).field_b].field_a;
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

    private final void a() {
        ((nd) this).field_d = null;
        ((nd) this).field_a = ((nd) this).field_c.field_e[0].field_a;
        ((nd) this).field_b = 1;
    }

    final static void a(byte param0) {
        if (param0 != 55) {
            nd.a((byte) -67);
            int discarded$0 = 46;
            gt.a();
            return;
        }
        int discarded$1 = 46;
        gt.a();
    }

    final static void a(String param0) {
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
          L0: {
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("nd.B(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -1 + 41);
        }
    }

    public final void remove() {
        if (!(((nd) this).field_d != null)) {
            throw new IllegalStateException();
        }
        ((nd) this).field_d.p(105);
        ((nd) this).field_d = null;
    }

    final static void a(int param0, boolean param1) {
        qha.a(0, param1);
        jo.a(true, param1);
    }

    public final Object next() {
        int var2 = 0;
        vg var3 = null;
        vg var4 = null;
        var2 = TombRacer.field_G ? 1 : 0;
        if (((nd) this).field_a == ((nd) this).field_c.field_e[((nd) this).field_b - 1]) {
          L0: while (true) {
            if (((nd) this).field_b < ((nd) this).field_c.field_g) {
              int fieldTemp$2 = ((nd) this).field_b;
              ((nd) this).field_b = ((nd) this).field_b + 1;
              var3 = ((nd) this).field_c.field_e[fieldTemp$2].field_a;
              if (var3 != ((nd) this).field_c.field_e[-1 + ((nd) this).field_b]) {
                ((nd) this).field_a = var3.field_a;
                ((nd) this).field_d = var3;
                return (Object) (Object) var3;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((nd) this).field_a;
          ((nd) this).field_d = var4;
          ((nd) this).field_a = var4.field_a;
          return (Object) (Object) var4;
        }
    }

    nd(sk param0) {
        ((nd) this).field_d = null;
        try {
            ((nd) this).field_c = param0;
            int discarded$0 = 1;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nd.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
