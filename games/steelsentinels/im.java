/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static cm field_h;
    static hm field_a;
    static String field_e;
    static String field_d;
    static String field_c;
    static String field_g;
    static String field_i;
    static SceneWidget field_f;
    static boolean field_b;

    final static RgbSprite a(cm param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RgbSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wa.a((byte) 30, param1, param2, param0)) {
            stackIn_2_0 = null;
            return (RgbSprite) (stackIn_2_0);
          }
          if (param3 != 1048576) {
            im.b((byte) 103);
          }
          stackIn_6_0 = ij.j(-100);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("im.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        cm var3 = null;
        cc var4 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = SteelSentinels.obfuscationControl;
        try {
          ad.field_f = false;
          nf.field_b = null;
          ni.field_a = null;
          if (q.field_m != null) {
            q.field_m.clear(6);
            q.field_m = null;
          }
          t.field_c = null;
          if (ci.field_e != null) {
            ci.field_e.clear(6);
            ci.field_e = null;
          }
          fm.field_a = null;
          if (null != o.field_d) {
            o.field_d.clear(6);
            o.field_d = null;
          }
          me.field_b = null;
          if (null != t.field_c) {
            var4 = (cc) (t.field_c.a(90));
            while (var4 != null) {
              var4.unlinkDual(480);
              var4 = (cc) (t.field_c.a((byte) -66));
            }
            t.field_c = null;
          }
          if (param0) {
            return;
          }
          var3 = (cm) null;
          im.a((cm) null, 29, -92, 49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "im.C(" + param0 + ')');
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (!param1) {
          if (dn.a(param0, -91)) {
            return true;
          }
          if (param0 != 45 &&
            param0 != 160 &&
            32 != param0 &&
            95 != param0) {
            return false;
          }
          return true;
        }
        im.a('M', true);
        if (dn.a(param0, -91)) {
          return true;
        }
        if (param0 == 45) {
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (32 == param0) {
          return true;
        }
        if (95 == param0) {
          return true;
        }
        return false;
    }

    final static void a(RgbSprite[] param0, int param1, int param2, int param3, RgbSprite[] param4, int param5, int param6, int param7, int param8, int param9, BitmapFont param10, int param11, RgbSprite[] param12, int param13, int param14) {
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var15_int = param10.field_F + param10.field_U;
          var16 = param10.field_U;
          va.a(param14, param6, param10, param5, var16, param13, param12, param0, param9, param11, var15_int, -1, var15_int, param8, param1, var16, param4, param2, param10, param7);
          if (param3 == -13782) {
            return;
          }
          field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_5_0 = var15;
          stackIn_5_1 = new StringBuilder().append("im.E(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    final static void b(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (param0 != 98) {
              field_b = false;
            }
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                ed.field_a = (int)(var3.longValue() / 1048576L) + 1;
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        if (param0 == -88) {
          field_a = null;
          field_g = null;
          field_i = null;
          field_h = null;
          field_e = null;
          return;
        }
    }

    static {
        field_c = "Class: <col=ffffff><%0></col>";
        field_e = "Head slot";
        field_i = "No options available";
        field_d = "No highscores";
        field_a = new hm();
    }
}
