/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static gk field_j;
    int field_k;
    static String field_h;
    static int field_d;
    int field_c;
    static String field_g;
    static dk field_a;
    static int[] field_l;
    static String field_i;
    static int[] field_f;
    static gh field_b;
    static int[] field_e;

    public static void a(int param0) {
        if (param0 != 4314) {
          mi var2 = (mi) null;
          fm.a(-42, true, 120, 16, -64, 89, -116, -30, -115, 59, 77, (mi) null, -85);
        }
        field_j = null;
        field_b = null;
        field_a = null;
        field_l = null;
        field_i = null;
        field_g = null;
        field_e = null;
        field_f = null;
        field_h = null;
    }

    final static gh a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, mi param11, int param12) {
        gh var13 = null;
        RuntimeException var13_ref = null;
        gh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new gh(0L, (gh) null);
          var13.field_I = ul.a((byte) 0, param12, param8);
          var13.field_Ab = ul.a((byte) 0, param6, param10);
          var13.field_mb = ul.a((byte) 0, param3, param2);
          if (param1) {
            fm.a(-102);
          }
          var13.field_bb = ul.a((byte) 0, param5, param9);
          var13.field_H = ul.a((byte) 0, param4, param0);
          var13.field_nb = param7;
          var13.field_L = param11;
          stackIn_3_0 = var13;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_6_0 = var13_ref;
          stackIn_6_1 = new StringBuilder().append("fm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param12).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    fm(int param0, int param1, int param2, int param3) {
        this.field_c = param0;
        this.field_k = param3;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (0 < param0) {
          var2 = 1;
          if (param0 > 65535) {
            param0 = param0 >> 16;
            var2 += 16;
          }
          if (param0 > 255) {
            var2 += 8;
            param0 = param0 >> 8;
          }
          if (param0 > 15) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param0 < -256) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (param1 < 13) {
          field_d = -36;
        }
        if (param0 < -16) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (-4 > param0) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (-2 > param0) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        int incrementValue$0 = 0;
        int var0;
        int var1;
        field_d = 33;
        field_h = "Camera follows sentinel: Off";
        field_j = new gk(192, 192, 256);
        var0 = 0;
        for (var2 = -96; var2 < 96; var2++) {
          for (var3 = -96; var3 < 96; var3++) {
            var1 = (int)(64.0 * Math.atan2((double)Math.abs(var3), (double)var2) / 3.141592653589793);
            if (1 > var1) {
              var1 = 1;
            }
            if (var1 > 127) {
              var1 = 127;
            }
            incrementValue$0 = var0;
            var0++;
            field_j.field_p[incrementValue$0] = (byte)var1;
            if (var3 * var3 + var2 * var2 < 6724) {
              field_j.field_p[-1 + var0] = (byte)(field_j.field_p[-1 + var0] + 127);
            }
            if (8100 < var3 * var3 + var2 * var2) {
              field_j.field_p[-1 + var0] = (byte) 0;
            }
            if (var2 * var2 + var3 * var3 < 4900) {
              field_j.field_p[-1 + var0] = (byte) 0;
            }
          }
        }
        field_g = "Open";
        field_l = new int[8192];
        field_i = "Z";
        field_e = new int[8192];
        field_f = new int[3];
    }
}
