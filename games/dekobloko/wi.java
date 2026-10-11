/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_a;
    static int field_b;

    final static void a(byte param0, ji param1) {
        va var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          va.b(param1.a(param0 ^ -51, "", "headers.packvorbis"));
          var2 = va.a(param1, "jagex logo2.packvorbis", "");
          var2.a();
          if (param0 == -51) {
            return;
          }
          field_b = -123;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = var2_ref;
          stackIn_5_1 = new StringBuilder().append("wi.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static cd a(String[] args, int param1) {
        cd var2 = null;
        RuntimeException var2_ref = null;
        cd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -3) {
            field_b = 29;
          }
          var2 = new cd(false);
          var2.field_d = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("wi.B(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!jg.field_i) {
            return false;
          }
          if (pk.field_r == 2 &&
            cf.field_c != null) {
            var3 = (CharSequence) ((Object) param1);
            if (cf.field_c.equals(kf.a(var3, (byte) 2))) {
              var2_int = 82 / ((-50 - param0) / 34);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("wi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          String[] var2 = (String[]) null;
          wi.a((String[]) null, 103);
        }
    }

    final static void a(boolean param0, int param1, String param2) {
        try {
          dc.field_d = param0;
          mg.field_Nb = true;
          cl.field_r = new gk(ah.field_c, ec.field_p, param2, vb.field_Z, dc.field_d);
          ah.field_c.a((byte) -115, cl.field_r);
          if (param1 > -20) {
            field_b = -117;
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wi.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "to keep fullscreen or";
        field_b = 0;
    }
}
