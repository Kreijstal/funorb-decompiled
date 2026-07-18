/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class re implements Iterator {
    static String field_j;
    static he field_d;
    private gi field_a;
    private gi field_f;
    static he[] field_h;
    static int field_g;
    static he[] field_i;
    static int field_e;
    private tc field_b;
    static String field_c;
    private int field_k;

    private final void a(int param0) {
        int var2 = -2;
        ((re) this).field_f = null;
        ((re) this).field_k = 1;
        ((re) this).field_a = ((re) this).field_b.field_h[0].field_e;
    }

    public static void b(int param0) {
        field_j = null;
        field_h = null;
        field_i = null;
        field_c = null;
        field_d = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((re) this).field_b.field_h[((re) this).field_k + -1] == ((re) this).field_a) {
          L0: while (true) {
            if (((re) this).field_b.field_c > ((re) this).field_k) {
              int fieldTemp$1 = ((re) this).field_k;
              ((re) this).field_k = ((re) this).field_k + 1;
              if (((re) this).field_b.field_h[fieldTemp$1].field_e != ((re) this).field_b.field_h[-1 + ((re) this).field_k]) {
                ((re) this).field_a = ((re) this).field_b.field_h[-1 + ((re) this).field_k].field_e;
                return true;
              } else {
                ((re) this).field_a = ((re) this).field_b.field_h[-1 + ((re) this).field_k];
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
        int var2 = 0;
        Object var3 = null;
        gi var3_ref = null;
        gi var4 = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((re) this).field_b.field_h[-1 + ((re) this).field_k] == ((re) this).field_a) {
          L0: while (true) {
            if (((re) this).field_b.field_c > ((re) this).field_k) {
              int fieldTemp$2 = ((re) this).field_k;
              ((re) this).field_k = ((re) this).field_k + 1;
              var3_ref = ((re) this).field_b.field_h[fieldTemp$2].field_e;
              if (((re) this).field_b.field_h[((re) this).field_k - 1] == var3_ref) {
                continue L0;
              } else {
                ((re) this).field_f = var3_ref;
                ((re) this).field_a = var3_ref.field_e;
                return (Object) (Object) var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((re) this).field_a;
          ((re) this).field_f = var4;
          ((re) this).field_a = var4.field_e;
          return (Object) (Object) var4;
        }
    }

    final static void a(boolean param0) {
        cf.a((byte) -107);
        sg.field_a = true;
        pj.field_F = true;
        ng.field_c.j(300);
        nc.a(field_c, false, (byte) 79);
    }

    public final void remove() {
        if (!(null != ((re) this).field_f)) {
            throw new IllegalStateException();
        }
        ((re) this).field_f.a(-16175);
        ((re) this).field_f = null;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
              if (param1 >= 121) {
                break L1;
              } else {
                re.a(true);
                break L1;
              }
            }
            stackOut_2_0 = o.field_l.a("", param0, 24874);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("re.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    re(tc param0) {
        ((re) this).field_f = null;
        try {
            ((re) this).field_b = param0;
            this.a(-116);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "re.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Mouse over an icon for details";
        field_c = "Connection lost - attempting to reconnect";
    }
}
