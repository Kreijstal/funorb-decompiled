/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends am {
    static ce field_s;
    static String field_u;
    static String field_t;

    final static void a(int param0, int param1, int param2, t[] param3, int param4, t[] param5, int param6, int param7, uc param8, t[] param9, int param10, uc param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          var21_int = 26 / ((param20 - 15) / 46);
          bg.a(param4, param0, new fn(param5), param12, param13, param18, param6, param17, param8, param11, param16, (byte) 120, new fn(param3), new fn(param9), param7, param14, param1, param10, param2, param15, param19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("pl.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param9 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_u = null;
        field_s = null;
        if (param0 > -26) {
          return;
        }
        field_t = null;
    }

    final int[] a(byte param0, int param1) {
        int[][] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = Torquing.field_u;
        if (param0 < 86) {
          this.a((byte) 30, 51);
        }
        int[] var10 = this.field_l.a(param1, 25657);
        int[] var3 = var10;
        if (this.field_l.field_b) {
          var4 = this.c(24066, param1, 0);
          var5 = var4[0];
          var6 = var4[1];
          var7 = var4[2];
          for (var8 = 0; var8 < ci.field_c; var8++) {
            var10[var8] = (var7[var8] + (var5[var8] + var6[var8])) / 3;
          }
        }
        return var3;
    }

    final static void b(int param0, int param1) {
        if (vc.field_a == null ||
          vc.field_a.length < param0) {
          vc.field_a = new int[param0];
        }
        if (param1 < 27) {
          pl.c(25);
        }
    }

    final static void a(byte param0, boolean param1) {
        da.field_a = 0;
        vp.field_E = 0;
        ke.field_c = 0;
        mf.field_t = op.field_j;
        sd.field_s = new db(2);
        sd.field_s.a(n.a(n.field_t, false, k.field_e), (byte) 75, param1, -1);
        int var2 = 38 % ((-34 - param0) / 60);
    }

    final static boolean b(int param0) {
        if (param0 > -107) {
          return true;
        }
        return jh.field_z > 250 ? true : false;
    }

    public pl() {
        super(1, true);
    }

    static {
        field_t = "Please check if address is correct";
        field_s = new ce();
    }
}
