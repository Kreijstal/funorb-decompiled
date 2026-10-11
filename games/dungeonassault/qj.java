/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static ai[] field_c;
    static String field_a;
    static String field_b;
    static String[] field_f;
    static String[] field_e;
    static String field_d;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != -2418) {
          int[] var2 = (int[]) null;
          qj.a(68, -99, 85, 14, (int[]) null, 57, 16, 52, 84, 64, 97, 118, (int[]) null, 57, -36, -28);
        }
        field_e = null;
        field_f = null;
    }

    final static void a(byte param0) {
        int var1 = -31 / ((param0 + 45) / 35);
        hl.field_a = ea.b(120);
        lg.field_w = new ji();
        na.a(true, 2591221, true);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 89) {
            field_e = (String[]) null;
          }
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (ci.a(var3, param1 ^ 91) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("qj.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int[] param12, int param13, int param14, int param15) {
        int incrementValue$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var16_int = 0;
        RuntimeException var16 = null;
        int var17 = 0;
        int var18 = 0;
        var18 = DungeonAssault.field_K;
        try {
          var16_int = param0 & 16711935;
          var17 = 65280 & param0;
          for (param10 = -param15; param10 < 0; param10++) {
            for (param8 = -param13; param8 < 0; param8++) {
              param2 = param4[param3++];
              if (0 == param2) {
                param14++;
              } else {
                param2 = param2 >> 16;
                param2 = (var16_int * param2 & -16711936 | 16711680 & var17 * param2) >>> 8;
                param9 = (param2 & 16711935) * param6;
                param2 = (-param9 + param2 * param6 & 16711680) + (-16711936 & param9) >>> 8;
                param9 = param12[param14];
                param1 = param2 + param9;
                param2 = (16711935 & param2) + (16711935 & param9);
                param9 = (65536 & -param2 + param1) + (16777472 & param2);
                incrementValue$1 = param14;
                param14++;
                param12[incrementValue$1] = mp.a(param9 - (param9 >>> 8), -param9 + param1);
              }
            }
            param14 = param14 + param5;
            param3 = param3 + param7;
          }
          if (param11 <= 68) {
            qj.a(-102);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_15_0 = var16;
          stackIn_15_1 = new StringBuilder().append("qj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(')').toString());
        }
    }

    static {
        field_a = "Confirm Password: ";
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_f = new String[]{"Thievery", "Drawing on a lifetime of experience, the <%0> can coordinate great acts of larceny. With his skills to assist, the likelihood of waking the dungeon's master when stealing its gold is reduced."};
        field_d = "Your party sneaks past the monster.";
        field_e = new String[16];
    }
}
