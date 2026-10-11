/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    int field_f;
    static String[] field_d;
    String field_j;
    static byte[] field_i;
    private int field_l;
    int[] field_k;
    int field_b;
    private String field_g;
    int field_a;
    private boolean field_e;
    static String field_h;
    private long field_c;

    final int a(int param0) {
        if (param0 != 0) {
          this.field_a = -18;
        }
        if (this.field_e) {
          return 2;
        }
        if (2 == this.field_f &&
          this.field_l > 0) {
          return 2;
        }
        if (~this.field_c == ~lr.field_v) {
          return 1;
        }
        if (eo.field_a != 2) {
          return 0;
        }
        if (vc.a(param0 - 8759, this.field_g)) {
          return 1;
        }
        return 0;
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -86 % ((param0 - 49) / 51);
        field_h = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param0 != 118) {
            field_d = (String[]) null;
          }
          while (true) {
            param6--;
            if (0 > param6) {
              return;
            }
            var17 = param3;
            var10 = var17;
            var11 = param7;
            var12 = param1;
            var13 = param9;
            var14 = param2;
            var15 = (var17[var11] & 16711422) >> 1;
            var10[var11] = var15 + (pg.a(33423360, var12) >> 1) + ((pg.a(33423495, var13) >> 9) + pg.a(var14 >> 17, 255));
            param1 = param1 + param8;
            param9 = param9 + param5;
            param2 = param2 + param4;
            param7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("s.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, String param2) {
        try {
          tn.a(1, param1, param0, param2);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "s.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    s(boolean param0) {
        this.field_c = pe.field_g;
        this.field_j = ep.field_x;
        this.field_g = tn.field_t;
        this.field_a = jt.field_t;
        this.field_f = m.field_f;
        this.field_e = sj.field_b;
        this.field_l = km.field_b;
        if (param0) {
          this.field_k = ku.field_e;
        } else {
          this.field_k = null;
        }
        this.field_b = ot.field_a;
    }

    static {
        field_d = new String[]{"explosion1", "explosion2", "explosion3", "big plane explosion", "ufo explosion_fall", "ufo explosion_impact"};
        field_i = new byte[520];
        field_h = "Resume Game";
    }
}
