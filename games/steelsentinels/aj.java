/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends IntrusiveNode {
    int field_o;
    static int[] field_v;
    static cm field_x;
    int field_z;
    int field_t;
    int field_w;
    static RgbSprite[] field_r;
    int field_y;
    int[] field_q;
    static int field_u;
    int field_p;
    static int field_s;

    final static boolean a(int[] param0, byte param1, int[] param2, int param3, boolean param4) {
        int var6 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var17 = null;
        var10 = SteelSentinels.obfuscationControl;
        try {
          if (49 == param3) {
            stackIn_7_0 = (param4) && (ve.a(param0, 1, 25));
            return stackIn_7_0;
          }
          var14 = FunOrbClient.field_z;
          var12 = var14;
          var11 = var12;
          var5 = var11;
          for (var6 = 0; var6 < var14.length; var6++) {
            var7 = var14[var6];
            if (t.a(param2, var7, -20370) ||
              bj.a(param2, var7, param4, (byte) 86)) {
              var17 = nl.a(var7, (byte) 124);
              var9 = 0;
              while (var9 < -8 + var17.length) {
                if (~var17[var9] != ~param3) {
                  var9++;
                  continue;
                }
                return true;
              }
            }
          }
          var5_int = -62 / ((76 - param1) / 47);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_24_0 = var5_ref;
          stackIn_24_1 = new StringBuilder().append("aj.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_v = null;
        field_r = null;
        field_x = null;
        if (param0 != -1) {
          field_s = -23;
        }
    }

    final static Boolean a(boolean param0) {
        if (!param0) {
          aj.a(true);
        }
        Boolean var1 = ma.field_bb;
        ma.field_bb = null;
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, byte param7) {
        try {
          this.field_w = param6;
          this.field_z = param2;
          if (param7 > -53) {
            this.field_q = (int[]) null;
          }
          this.field_p = param1;
          this.field_q = param4;
          this.field_o = param3;
          this.field_t = param5;
          this.field_y = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "aj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    aj() {
    }

    static {
        field_v = new int[4];
        field_r = new RgbSprite[3];
        field_u = -1;
    }
}
