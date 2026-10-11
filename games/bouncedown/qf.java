/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static uf field_a;
    static int field_c;
    static int field_b;

    final static byte[] a(int param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ah var4 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (param0 != 0) {
            stackIn_5_0 = (byte[]) null;
            return stackIn_5_0;
          }
          if (!(param2 instanceof byte[])) {
            if (!(param2 instanceof ah)) {
              throw new IllegalArgumentException();
            }
            var4 = (ah) (param2);
            stackIn_15_0 = var4.a(0);
            return stackIn_15_0;
          }
          var3 = (byte[]) (param2);
          if (param1) {
            stackIn_12_0 = rd.a((byte) -82, var3);
            return stackIn_12_0;
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("qf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 >= -94) {
          qf.b(88);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (nk.field_a != null) {
          nk.field_a.a(true);
          il.field_b = new q();
          ed.field_c.a(10768, il.field_b);
          if (param0 != 0) {
            field_b = 53;
            return;
          }
          return;
        }
        il.field_b = new q();
        ed.field_c.a(10768, il.field_b);
        if (param0 == 0) {
          return;
        }
        field_b = 53;
    }

    static {
        field_a = new uf();
        field_b = 0;
    }
}
