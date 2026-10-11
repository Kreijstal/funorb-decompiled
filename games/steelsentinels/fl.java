/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int field_a;
    static SceneWidget field_b;
    static int field_d;
    static SceneWidget field_c;
    static SceneWidget field_e;

    final static void a(int param0, Sentinel param1, byte param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Sentinel var13 = null;
        var12 = SteelSentinels.obfuscationControl;
        try {
          var6_int = sb.field_bb.field_c * param5;
          if (param2 >= -90) {
            var13 = (Sentinel) null;
            fl.a(48, (Sentinel) null, (byte) -79, 76, -55, -81);
          }
          for (var7 = param5; var7 < param5 + param3; var7++) {
            for (var8 = param4; var8 < param4 + param0; var8++) {
              var9 = sb.field_bb.field_a[var6_int + var8];
              if (var9 >> 8 == (65535 & var9)) {
                var10 = param1.getTeamColour((byte) 25);
                var11 = 255 & var9;
                if (var11 > 64) {
                  sb.field_bb.field_a[var8 + var6_int] = ec.a(16711935, var11 * ec.a(16711935, var10) >> 8) + ec.a(65280, var11 * ec.a(var10, 65280) >> 8);
                }
              } else {
                var10 = 255 & var9;
                var10 = var10 / 2;
                if (var10 > 32) {
                  sb.field_bb.field_a[var8 + var6_int] = param1.field_ic * var10;
                }
              }
            }
            var6_int = var6_int + sb.field_bb.field_c;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("fl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 < 75) {
          return;
        }
        gf.field_a.a(200, param1);
    }

    final static pc a(byte param0, sk param1, int param2) {
        RuntimeException var3 = null;
        pc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 27) {
            fl.a((byte) -76, true);
          }
          stackIn_3_0 = on.a(em.a(param1, 100, param2), -48);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 60) {
          field_e = (SceneWidget) null;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_a = -1;
    }
}
