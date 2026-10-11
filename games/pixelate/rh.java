/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends fa {
    int field_l;
    int field_s;
    static gi[] field_u;
    int field_n;
    long field_q;
    int[] field_k;
    int field_p;
    int field_t;
    int field_o;
    int field_v;
    static long[] field_x;
    static String field_m;
    static ak field_y;
    static String field_w;
    static String field_r;

    final static void a(boolean param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          tm.field_X = h.field_N;
          if (!param0) {
            return;
          }
          if (param3 == 255) {
            stackIn_12_0 = !(um.field_r >= 13);
            v.field_b = pk.a(stackIn_12_0, 5731);
          } else {
            if (param3 >= 100 &&
              param3 <= 105) {
              v.field_b = fk.a((byte) 117, param2);
              return;
            }
            v.field_b = pa.a(param3, param1, (byte) -120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("rh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(byte param0) {
        int var1 = -5 % ((param0 - 16) / 63);
        te.b(false, 93);
    }

    public static void a(byte param0) {
        field_r = null;
        field_u = null;
        if (param0 != 64) {
          field_x = (long[]) null;
        }
        field_y = null;
        field_m = null;
        field_x = null;
        field_w = null;
    }

    rh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          fieldTemp$0 = dm.field_Bb;
          dm.field_Bb = dm.field_Bb + 1;
          this.field_o = fieldTemp$0 & 65535;
          this.field_v = param3;
          this.field_n = param5;
          this.field_l = param4;
          this.field_t = param0;
          this.field_p = param1;
          this.field_k = param6;
          this.field_s = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "rh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_u = new gi[255];
        field_x = new long[32];
        for (var0 = 0; var0 < field_u.length; var0++) {
          field_u[var0] = new gi();
        }
        field_m = "Rating";
        field_r = "Unpacking sound effects";
        field_w = "<%0> is not a member, and cannot play with the current options.";
    }
}
