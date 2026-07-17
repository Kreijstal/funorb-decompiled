/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ag implements Iterator {
    private ii field_f;
    static f[] field_a;
    static int[] field_b;
    static vn field_h;
    private nb field_d;
    private nb field_g;
    static String field_c;
    static String field_e;

    final static byte[] a(Object param0, byte param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        rf var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_14_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          if (param0 != null) {
            if (param0 instanceof byte[]) {
              var3 = (byte[]) param0;
              if (!param2) {
                stackOut_8_0 = (byte[]) var3;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                stackOut_6_0 = jl.a(var3, (byte) 45);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              if (param1 >= 80) {
                if (!(param0 instanceof rf)) {
                  throw new IllegalArgumentException();
                } else {
                  var4 = (rf) param0;
                  stackOut_14_0 = var4.a((byte) -116);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              } else {
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (byte[]) (Object) stackIn_12_0;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("ag.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L0;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L0;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final boolean hasNext() {
        return ((ag) this).field_g != ((ag) this).field_f.field_c;
    }

    public static void a() {
        field_a = null;
        field_h = null;
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, boolean param1) {
        Object var2 = null;
        if (param1) {
            var2 = (Object) (Object) new cl();
        } else {
            var2 = (Object) (Object) new wh();
        }
        int discarded$0 = -121;
        nl.a(new lg((wa) var2));
    }

    final static void a(int param0, boolean param1, bo param2) {
        am var5 = dp.field_e;
        var5.j(11, param0);
        var5.field_j = var5.field_j + 1;
        int var4 = var5.field_j;
        var5.i(1, -111);
        var5.i(param2.field_q, -101);
        var5.i(param2.field_h, 40);
        var5.h(-109, param2.field_j);
        var5.h(-105, param2.field_k);
        var5.h(98, param2.field_m);
        var5.h(-118, param2.field_l);
        try {
            int discarded$0 = var5.e(-69, var4);
            var5.d(-60, -var4 + var5.field_j);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ag.C(" + param0 + 44 + 1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final Object next() {
        nb var1 = ((ag) this).field_g;
        if (((ag) this).field_f.field_c != var1) {
            ((ag) this).field_g = var1.field_i;
        } else {
            ((ag) this).field_g = null;
            var1 = null;
        }
        ((ag) this).field_d = var1;
        return (Object) (Object) var1;
    }

    ag(ii param0) {
        ((ag) this).field_d = null;
        try {
            ((ag) this).field_f = param0;
            ((ag) this).field_d = null;
            ((ag) this).field_g = ((ag) this).field_f.field_c.field_i;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ag.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void remove() {
        if (null == ((ag) this).field_d) {
            throw new IllegalStateException();
        }
        ((ag) this).field_d.c((byte) -9);
        ((ag) this).field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{303, 60, 257, 63};
        field_e = "Become a member to get this expansion and...";
    }
}
