/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uw extends uj {
    static String field_d;

    final int b(int param0) {
        if (param0 != -25131) {
          field_d = (String) null;
          return oq.field_p;
        }
        return oq.field_p;
    }

    uw() {
    }

    final int b(byte param0) {
        if (param0 <= 79) {
          uw.d(-2);
          return 106;
        }
        return 106;
    }

    final static void a(byte param0, faa param1, tv param2) {
        param1.p(-23497);
        if (param0 >= -31) {
          return;
        }
        try {
          param2.a(param1, false);
          param1.f((byte) -59);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uw.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
          return 2;
        }
        return pk.field_p;
    }

    final int d(byte param0) {
        if (param0 != 64) {
          return -9;
        }
        return oq.field_g;
    }

    final boolean a(boolean param0) {
        if (param0) {
          this.b(-80);
          return false;
        }
        return false;
    }

    final static im a(qfa param0, int param1, int param2, int param3, int[] param4, int param5, boolean param6, byte param7) {
        RuntimeException var8 = null;
        im stackIn_2_0 = null;
        im stackIn_9_0 = null;
        im stackIn_11_0 = null;
        im stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param7 != 60) {
            stackIn_2_0 = (im) null;
            return stackIn_2_0;
          }
          if (!param0.field_n && (!bd.a(param5, (byte) -95) ||
            !bd.a(param3, (byte) -95))) {
            if (!param0.field_g) {
              stackIn_11_0 = new im(param0, param5, param3, hj.a(param5, (byte) -110), hj.a(param3, (byte) -109), param4);
              return stackIn_11_0;
            }
            stackIn_9_0 = new im(param0, 34037, param5, param3, param6, param4, param2, param1);
            return stackIn_9_0;
          }
          stackIn_13_0 = new im(param0, 3553, param5, param3, param6, param4, param2, param1);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("uw.K(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 != 34037) {
          return;
        }
        field_d = null;
    }

    static {
        field_d = "WHL";
    }
}
