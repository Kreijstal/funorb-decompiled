/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends SpellAreaEffect {
    static RgbSprite[] field_s;
    static String[] field_t;

    final static String b(int param0, int param1) {
        String var2 = null;
        if (param0 < param1) {
          return "Please use a value from 0 to 256, inclusive.";
        }
        if (param1 >= 0) {
          var2 = "old volume: " + gi.field_b;
          gi.field_b = param1;
          return var2;
        }
        return "Please use a value from 0 to 256, inclusive.";
    }

    public static void e(int param0) {
        field_s = null;
        field_t = null;
        if (param0 != 1223) {
          il.e(41);
        }
    }

    final void applyEffect(int obfuscationGuard, Battlefield battlefield) {
        try {
          if (obfuscationGuard != 64) {
            field_s = (RgbSprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "il.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    final static wd a(int param0, int param1, String param2) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        wd stackIn_2_0 = null;
        wd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            stackIn_2_0 = (wd) null;
            return stackIn_2_0;
          }
          var3 = new wd(false);
          var3.field_d = param1;
          var3.field_i = param2;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("il.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    il(int param0, int param1, Unit param2, MapTile param3) {
        try {
          if (null != param3.occupant) {
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "il.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          int var2_int = -78 / ((param1 + 46) / 57);
          param0.addMouseListener(lf.field_q);
          param0.addMouseMotionListener(lf.field_q);
          param0.addFocusListener(lf.field_q);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "il.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
