/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gfb implements dja {
    static llb field_a;

    final static Object a(boolean param0, byte[] param1, int param2) {
        se var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        se stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -12445) {
            stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            stackIn_5_0 = null;
            return stackIn_5_0;
          }
          if (param1.length > 136) {
            var3 = new se();
            ((ps) ((Object) var3)).a((byte) -28, param1);
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          if (!param0) {
            stackIn_14_0 = (byte[]) (param1);
            return stackIn_14_0;
          }
          stackIn_12_0 = nia.a(param1, (byte) -100);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("gfb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public final tv a(byte param0) {
        int var2 = 37 % ((param0 + 64) / 50);
        return (tv) ((Object) new it());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          this.a((byte) -124);
          return (tv[]) ((Object) new it[param1]);
        }
        return (tv[]) ((Object) new it[param1]);
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = ppa.a(nfa.field_d, go.field_p, false);
          if (param0 == var2_int) {
            param1 = "<img=0>" + param1;
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          stackIn_5_0 = (String) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("gfb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        int var1 = 12 / ((param0 - 15) / 40);
        field_a = null;
    }

    static {
    }
}
