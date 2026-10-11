/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static cn field_a;
    static boolean field_b;
    static String field_c;

    final static int a(String param0, int param1, int[] param2, se param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (null == wk.field_a) {
            wk.field_a = new String[32];
          }
          if (param1 != -1) {
            field_c = (String) null;
          }
          while (true) {
            try {
              var4_int = param3.a(param0, param2, wk.field_a);
              stackIn_11_0 = var4_int;
              return stackIn_11_0;
            } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
              if (wk.field_a.length >= 1024) {
                stackIn_8_0 = -1;
                return stackIn_8_0;
              }
              wk.field_a = new String[wk.field_a.length << 1];
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("oj.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        param0 = param0 & 8191;
        if (param1 != 51) {
          return -20;
        }
        if (param0 >= 4096) {
          return 6144 > param0 ? -jb.field_Tb[-4096 + param0] : -jb.field_Tb[8192 - param0];
        }
        return param0 < 2048 ? jb.field_Tb[param0] : jb.field_Tb[-param0 + 4096];
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -29) {
          oj.a((byte) 67);
        }
        field_c = null;
    }

    final static void a(int param0, mm param1, boolean param2) {
        wj var5 = null;
        int var4 = 0;
        try {
          var5 = ac.field_B;
          var5.d((byte) -112, param0);
          var5.field_o = var5.field_o + 1;
          var4 = var5.field_o;
          var5.a(6, 1);
          if (!param2) {
            field_b = true;
          }
          var5.a(6, param1.field_p);
          var5.f(-65, param1.field_r);
          var5.a((byte) 63, param1.field_i);
          var5.a((byte) 63, param1.field_l);
          var5.a((byte) 63, param1.field_n);
          var5.a((byte) 63, param1.field_o);
          var5.c((byte) -106, var4);
          var5.c(-var4 + var5.field_o, -1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "oj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
          int var7 = 0;
          String var3 = null;
          int var4 = 0;
          String var5 = null;
          String[] var6 = null;
          int var8 = 0;
          int var9 = 0;
          String var10 = null;
          String stackIn_6_0 = null;
          String stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var9 = DungeonAssault.field_K;
          try {
            try {
              var10 = param0.getParameter("cookieprefix");
              var4 = -122 / ((param1 - 40) / 53);
              var3 = var10 + "settings";
              var5 = (String) (ee.a((byte) -21, param0, "getcookies"));
              var6 = ih.a(115, ';', var5);
              for (var7 = 0; var7 < var6.length; var7++) {
                var8 = var6[var7].indexOf('=');
                if (var8 >= 0 &&
                  var6[var7].substring(0, var8).trim().equals(var3)) {
                  stackIn_6_0 = var6[var7].substring(1 + var8).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (ql.field_a == null) {
              return param0.getParameter("settings");
            }
            stackIn_13_0 = ql.field_a;
            return stackIn_13_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var2_ref;
            stackIn_16_1 = new StringBuilder().append("oj.A(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "An Orb of Mastery takes one week to charge. When finished, its effects will apply to you permanently, but the backlash of power will destroy your dungeon and stable - you must rebuild them!<br><br> Some of your Treasure will survive the blast and can help you shape your new dungeon faster.<br><br>Are you sure you wish to construct an Orb of Mastery now?";
    }
}
