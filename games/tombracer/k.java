/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends qr {
    static String field_z;
    private static String[] field_y;
    static int field_A;

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        vp var7 = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          var7 = ava.field_f;
          if (var7 != null &&
            this.a(param5, param3, 17, param2, param4)) {
            if (this.field_h instanceof kja) {
              ((kja) (this.field_h)).a(var7, (byte) 59, this);
              ava.field_f = null;
              return;
            }
            if (!(var7.field_h instanceof kja)) {
              return;
            }
            ((kja) (var7.field_h)).a(var7, (byte) 59, this);
            ava.field_f = null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "k.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private k(int param0, int param1, int param2, int param3, isa param4, qc param5, ae param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_x = param6;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "k.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, gqa param1) {
        int var2_int = 0;
        RuntimeException runtimeException = null;
        gqa var3 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == param1.field_f) {
            return;
          }
          if (param1.field_c != 0 ||
            param1.field_o != 0) {
            for (var2_int = 0; ara.field_xb > var2_int; var2_int++) {
              var3 = wea.field_d[var2_int];
              if (2 == var3.field_d &&
                param1.field_c == var3.field_c &&
                param1.field_o == var3.field_o) {
                return;
              }
            }
          }
          if (null != param1.field_h) {
            tba.field_g = param1.field_j;
            fp.field_d = param1.field_h;
            uba.field_f = param1.field_d;
            bla.field_I = param1.field_i;
          }
          if (param0 < 103) {
            return;
          }
          tna.a(16599, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_24_0 = runtimeException;
          stackIn_24_1 = new StringBuilder().append("k.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_z = null;
        if (param0 != 0) {
          gqa var2 = (gqa) null;
          k.a((byte) -103, (gqa) null);
          field_y = null;
          return;
        }
        field_y = null;
    }

    static {
        field_z = "Match by...";
        field_y = new String[5];
        field_y[0] = "Simple";
        field_y[3] = "Falling";
        field_y[2] = "Kit";
        field_y[4] = "Maze";
        field_y[1] = "Portal";
    }
}
