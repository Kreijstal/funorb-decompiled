/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static String field_c;
    int field_d;
    static String field_b;
    static ri field_f;
    static String field_h;
    static String field_e;
    static int field_i;
    static String field_g;
    static ip field_a;

    pi(int param0) {
        this.field_d = param0;
    }

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        if (param0 != -19162) {
          field_b = (String) null;
        }
        field_f = null;
        field_g = null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int[] param4, int param5, int param6, int param7) {
        if (!param3) {
          return;
        }
        try {
          int[] var9 = (int[]) null;
          vk.a((int[]) null, param1, param6, param2, (byte) -117, param4, param5, param7, param0);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "pi.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2, ic param3, int param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          mj.field_Fb[0] = c.field_c.nextInt();
          mj.field_Fb[1] = c.field_c.nextInt();
          mj.field_Fb[2] = (int)(nm.field_c >> 32);
          mj.field_Fb[3] = (int)nm.field_c;
          pm.field_R.field_j = 0;
          pm.field_R.b(33, mj.field_Fb[0]);
          pm.field_R.b(param0 ^ 84, mj.field_Fb[1]);
          pm.field_R.b(-111, mj.field_Fb[2]);
          pm.field_R.b(param0 ^ 88, mj.field_Fb[3]);
          jq.a(pm.field_R, 13746);
          pm.field_R.a(param4, (byte) -54);
          if (param0 != -59) {
            field_c = (String) null;
          }
          param3.a(pm.field_R, -1);
          ma.field_a.field_j = 0;
          if (!param2) {
            ma.field_a.a(param0 ^ -68, 16);
          } else {
            ma.field_a.a(-102, 18);
          }
          ma.field_a.field_j = ma.field_a.field_j + 2;
          var5_int = ma.field_a.field_j;
          ma.field_a.b(95, v.field_f);
          ma.field_a.a(qa.field_i, true);
          var6 = 0;
          if (cm.field_e) {
            var6 = var6 | 1;
          }
          if (gj.field_e) {
            var6 = var6 | 4;
          }
          if (param1) {
            var6 = var6 | 8;
          }
          if (null != oe.field_f) {
            var6 = var6 | 16;
          }
          ma.field_a.a(-81, var6);
          var7 = wg.a(0, jl.b(0));
          if (var7 == null) {
            var7 = "";
          }
          ma.field_a.a(var7, (byte) 105);
          if (null != oe.field_f) {
            ma.field_a.b(-16171, oe.field_f);
          }
          hd.a(gn.field_L, (byte) -122, tp.field_v, pm.field_R, ma.field_a);
          ma.field_a.b(false, -var5_int + ma.field_a.field_j);
          cb.a(-1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("pi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 < oo.field_f) {
            param3 = param3 - (oo.field_f - param1);
            param1 = oo.field_f;
          }
          if (oo.field_e > param5) {
            param4 = param4 - (-param5 + oo.field_e);
            param5 = oo.field_e;
          }
          if (oo.field_g < param1 + param3) {
            param3 = oo.field_g - param1;
          }
          if (param0 > -88) {
            return;
          }
          if (oo.field_d < param4 + param5) {
            param4 = oo.field_d - param5;
          }
          if (param3 > 0 &&
            param4 > 0) {
            var6_int = oo.field_b * param5 + param1;
            var7 = oo.field_b - param3;
            for (param5 = -param4; param5 < 0; param5++) {
              for (param1 = -param3; param1 < 0; param1++) {
                var8 = oo.field_i[var6_int];
                if ((255 & var8 >> 8) > param2 &&
                  (255 & var8 >> 16) <= (var8 & 65280) >> 8) {
                  var9 = ((16711680 & var8) >> 15) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = 65280 & var8;
                  var10 = -(var10 >> 5) + (var10 >> 1) & 65280;
                  var11 = 31 & var8 >> 3;
                  oo.field_i[var6_int] = cr.b(cr.b(var9 << 16, var10), var11);
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6), "pi.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_c = "Offline";
        field_h = "Traits affect your zombies for the entire match. Drag GREEN (square) research here to apply it.";
        field_b = "Return to lobby";
        field_g = "Suggested names: ";
        field_e = "Message game";
        field_a = new ip();
    }
}
