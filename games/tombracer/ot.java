/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ot extends lba {
    static String field_t;
    static int field_v;
    private byte[] field_u;
    static String field_w;

    ot() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    public static void b(byte param0) {
        field_w = null;
        field_t = null;
        if (param0 > -66) {
          field_w = (String) null;
        }
    }

    final byte[] a(int param0, boolean param1, int param2, int param3) {
        this.field_u = new byte[param3 * (param0 * (param2 * 2))];
        this.a(param0, param2, param3, (byte) -93);
        if (param1) {
          return this.field_u;
        }
        cn var6 = (cn) null;
        ot.a(13, 72, (cn) null, false);
        return this.field_u;
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4 = param2 * 2;
        int incrementValue$0 = var4;
        var4++;
        this.field_u[incrementValue$0] = (byte)-1;
        int var5 = 255 & param1;
        this.field_u[var4] = (byte)(var5 * 3 >> 5);
        if (!param0) {
          return;
        }
        ot.b((byte) 20);
    }

    final static iu a(int param0, int param1, cn param2, boolean param3) {
        RuntimeException var4 = null;
        iu stackIn_5_0 = null;
        iu stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!jna.a(false, param1, param0, param2)) {
            return null;
          }
          if (param3) {
            stackIn_7_0 = je.a((byte) 69);
            return stackIn_7_0;
          }
          stackIn_5_0 = (iu) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ot.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_t = "Accept rematch";
        field_v = 256;
        field_w = "Hide game chat";
    }
}
