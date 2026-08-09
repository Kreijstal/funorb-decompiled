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
        cn var6;
        this.field_u = new byte[param3 * (param0 * (param2 * 2))];
        this.a(param0, param2, param3, (byte) -93);
        if (!param1) {
          var6 = (cn) null;
          ot.a(13, 72, (cn) null, false);
          return this.field_u;
        } else {
          return this.field_u;
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        int var4;
        int var5;
        var4 = param2 * 2;
        int incrementValue$1 = var4;
        var4++;
        this.field_u[incrementValue$1] = (byte)-1;
        var5 = 255 & param1;
        this.field_u[var4] = (byte)(var5 * 3 >> -1328451387);
        if (param0) {
          ot.b((byte) 20);
          return;
        } else {
          return;
        }
    }

    final static iu a(int param0, int param1, cn param2, boolean param3) {
        RuntimeException var4 = null;
        iu stackIn_5_0 = null;
        iu stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (jna.a(false, param1, param0, param2)) {
              if (param3) {
                stackIn_7_0 = je.a((byte) 69);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (iu) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ot.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_t = "Accept rematch";
        field_v = 256;
        field_w = "Hide game chat";
    }
}
