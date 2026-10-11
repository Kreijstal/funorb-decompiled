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
        byte[] stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param0 instanceof byte[]) {
            var3 = (byte[]) (param0);
            if (!param2) {
              stackIn_9_0 = var3;
              return stackIn_9_0;
            }
            stackIn_7_0 = jl.a(var3, (byte) 45);
            return stackIn_7_0;
          }
          if (param1 < 80) {
            stackIn_12_0 = (byte[]) null;
            return stackIn_12_0;
          }
          if (!(param0 instanceof rf)) {
            throw new IllegalArgumentException();
          }
          var4 = (rf) (param0);
          stackIn_15_0 = var4.a((byte) -116);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ag.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final boolean hasNext() {
        return this.field_g != this.field_f.field_c;
    }

    public static void a(byte param0) {
        if (param0 != 48) {
          return;
        }
        field_a = null;
        field_h = null;
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, boolean param1) {
        Object var2 = null;
        if (param1) {
          var2 = new cl();
        } else {
          var2 = new wh();
        }
        nl.a(new lg((wa) (var2)), (byte) -121);
        if (param0 <= -105) {
          return;
        }
        field_e = (String) null;
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
        if (!param1) {
          return;
        }
        try {
          var5.e(-69, var4);
          var5.d(-60, -var4 + var5.field_j);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ag.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final Object next() {
        Object var1 = this.field_g;
        if (this.field_f.field_c != var1) {
          this.field_g = ((nb) (var1)).field_i;
        } else {
          this.field_g = null;
          var1 = null;
        }
        this.field_d = (nb) (var1);
        return var1;
    }

    ag(ii param0) {
        this.field_d = null;
        try {
          this.field_f = param0;
          this.field_d = null;
          this.field_g = this.field_f.field_c.field_i;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ag.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.field_d) {
          throw new IllegalStateException();
        }
        this.field_d.c((byte) -9);
        this.field_d = null;
    }

    static {
        field_b = new int[]{303, 60, 257, 63};
        field_e = "Become a member to get this expansion and...";
    }
}
