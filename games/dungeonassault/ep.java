/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends un {
    static String field_i;
    static String field_j;
    static cn field_g;
    static String[] field_f;
    private java.nio.ByteBuffer field_h;

    final void a(byte[] param0, int param1) {
        try {
          if (param1 < 30) {
            ep.a((byte) -76, 4);
          }
          this.field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_h.position(0);
          this.field_h.put(param0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ep.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        int var1 = 82 % ((75 - param0) / 44);
        field_i = null;
        field_f = null;
    }

    final byte[] b(byte param0) {
        int var3 = 23 % ((-67 - param0) / 39);
        byte[] var4 = new byte[this.field_h.capacity()];
        byte[] var2 = var4;
        this.field_h.position(0);
        this.field_h.get(var4);
        return var4;
    }

    final static hb a(int param0, int param1, ec param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        hb var4 = null;
        Object stackIn_3_0 = null;
        hb stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param2.c(true);
          if (param1 == ~var3_int) {
            param2.b((byte) 80);
            stackIn_3_0 = null;
            return (hb) (stackIn_3_0);
          }
          var4 = new hb(param0, var3_int);
          var4.field_e = param2.c(true);
          var4.field_g = param2.c(true);
          var4.field_f = param2.c(true);
          var4.field_k = param2.c(true);
          var4.field_o = param2.c(true);
          var4.field_d = param2.c(true);
          var4.field_p = param2.c(true);
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ep.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        ne var2 = null;
        int var3 = 0;
        int var4 = 0;
        ak var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = DungeonAssault.field_K;
        try {
          var5 = (ak) (oh.field_j.e(-24172));
          while (var5 != null) {
            g.a(param1, var5, (byte) 50);
            var5 = (ak) (oh.field_j.a(4));
          }
          var3 = 97 % ((param0 - 67) / 59);
          var2 = sf.field_c.e(-24172);
          while (var2 != null) {
            bd.a(param1, (byte) 113);
            var2 = sf.field_c.a(4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2_ref), "ep.H(" + param0 + ',' + param1 + ')');
        }
    }

    ep() {
    }

    static {
        field_i = "Your raiders flee in terror from the <%0>!";
        field_j = "This entry doesn't match";
        field_f = new String[]{"By rating", "By win percentage"};
    }
}
