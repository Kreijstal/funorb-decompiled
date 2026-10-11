/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static long field_a;
    static String field_b;

    final static void a(String param0, byte param1) {
        try {
          df.field_o = param0;
          if (param1 != -13) {
            String var3 = (String) null;
            ld.a((String) null, (byte) -41);
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ld.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        hk var1 = null;
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          vh.field_B.c();
          fc.field_k.c();
          vg.field_J = vg.field_J - 1;
          if (param0) {
            ld.a(126);
          }
          if (vg.field_J == 0) {
            vg.field_J = 200;
            var1 = (hk) (bd.field_c.a((byte) -117));
            while (var1 != null) {
              if (!var1.field_h.d(-3548)) {
                var1.c(-19822);
              }
              var1 = (hk) (bd.field_c.d((byte) 63));
            }
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ld.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -66) {
          ld.a(73);
        }
    }

    final static boolean a(rb param0, int param1, rb param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var3_int = param2.field_gb - param0.field_gb;
          if (param1 != -24612) {
            return false;
          }
          if (cm.field_G == param2.field_bb) {
            var3_int -= 200;
          } else {
            if (null == param2.field_bb) {
              var3_int += 200;
            }
          }
          if (cm.field_G != param0.field_bb) {
            if (null == param0.field_bb) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ld.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          field_a = 113L;
          if (10 > k.field_g) {
            return false;
          }
          if (!ha.field_db) {
            return !cb.a(false) ? true : false;
          }
          return false;
        }
        if (10 > k.field_g) {
          return false;
        }
        if (!ha.field_db) {
          return !cb.a(false) ? true : false;
        }
        return false;
    }

    static {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
