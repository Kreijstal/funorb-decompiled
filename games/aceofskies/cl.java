/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends di {
    static IntrusiveDeque field_eb;
    int field_cb;
    String field_bb;
    String field_I;
    static String field_db;
    static pj field_fb;

    public static void a(byte param0) {
        if (param0 >= -93) {
          cl.a((byte) 36);
        }
        field_fb = null;
        field_db = null;
        field_eb = null;
    }

    final static int a(int param0, byte[] param1, int param2, byte param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param0; var5 < param2; var5++) {
            var4_int = var4_int >>> 8 ^ vg.field_e[(param1[var5] ^ var4_int) & 255];
          }
          var4_int = ~var4_int;
          if (param3 != -105) {
            cl.a((byte) -28);
          }
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    cl() {
        super(0L, (di) null);
    }

    static {
        field_db = "Create your own free Jagex account";
        field_eb = new IntrusiveDeque();
    }
}
