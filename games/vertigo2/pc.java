/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static cr field_b;
    static int[] field_a;
    static er field_c;
    static String field_d;

    final static byte[] a(byte param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        dh var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (param2 instanceof byte[]) {
            var3 = (byte[]) (param2);
            if (param1) {
              stackIn_9_0 = kk.a(var3, (byte) 103);
              return stackIn_9_0;
            }
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          if (param0 != 6) {
            field_c = (er) null;
          }
          if (!(param2 instanceof dh)) {
            throw new IllegalArgumentException();
          }
          var4 = (dh) (param2);
          stackIn_15_0 = var4.b(117);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("pc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0) {
        Object var2 = null;
        Object var2Lifetime1;
        if (df.field_l != null) {
          df.field_l.h((byte) 125);
          lj.field_m = new ne();
          if (param0 < 50) {
            var2 = (Object) null;
            pc.a((byte) 93, true, (Object) null);
            n.field_b.a(false, lj.field_m);
            return;
          }
          n.field_b.a(false, lj.field_m);
          return;
        }
        lj.field_m = new ne();
        if (param0 >= 50) {
          n.field_b.a(false, lj.field_m);
          return;
        }
        var2Lifetime1 = (Object) null;
        pc.a((byte) 93, true, (Object) null);
        n.field_b.a(false, lj.field_m);
    }

    final static void b(byte param0) {
        if (param0 != -111) {
          field_c = (er) null;
        }
    }

    final static u a(u param0, int[] param1, int param2) {
        u var3 = null;
        RuntimeException var3_ref = null;
        u stackIn_2_0 = null;
        u stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -8) {
            stackIn_2_0 = (u) null;
            return stackIn_2_0;
          }
          var3 = new u(0, 0, 0);
          var3.field_l = param0.field_l;
          var3.field_k = param0.field_k;
          var3.field_h = param0.field_h;
          var3.field_m = param1;
          var3.field_e = param0.field_e;
          var3.field_c = param0.field_c;
          var3.field_n = param0.field_n;
          var3.field_d = param0.field_d;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("pc.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = "<%0> has entered a game.";
    }
}
