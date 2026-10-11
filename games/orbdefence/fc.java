/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends ll {
    static boolean field_d;
    private java.nio.ByteBuffer field_c;

    final void a(int param0, byte[] param1) {
        try {
          this.field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
          int var3_int = 38 % ((param0 - 55) / 53);
          this.field_c.position(0);
          this.field_c.put(param1);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "fc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] a(byte param0) {
        byte[] var4 = new byte[this.field_c.capacity()];
        byte[] var2 = var4;
        this.field_c.position(0);
        if (param0 == 99) {
          this.field_c.get(var4);
          return var4;
        }
        byte[] var3 = (byte[]) null;
        fc.a((byte[]) null, -5);
        this.field_c.get(var4);
        return var4;
    }

    final static sc a(byte[] param0, int param1) {
        sc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        sc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (sc) (stackIn_2_0);
          }
          var2 = new sc(param0, jd.field_g, wc.field_a, wh.field_b, m.field_a, fl.field_a);
          if (param1 >= -19) {
            field_d = false;
          }
          md.$cfr$intArgs$a$6121ff5511c4(-115);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("fc.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -115 / ((-91 - param0) / 34);
          var3 = (CharSequence) ((Object) param1);
          stackIn_1_0 = sg.field_E.equals(ua.a(122, var3));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("fc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    fc() {
    }

    static {
        field_d = false;
    }
}
