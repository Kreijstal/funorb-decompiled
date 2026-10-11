/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oh extends pb {
    static qk field_d;
    static int field_e;

    abstract f a(boolean param0, int param1, int param2, int param3, ta param4);

    oh() {
    }

    final void a(boolean param0, ta param1, boolean param2) {
        RuntimeException var4 = null;
        ta var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1.field_j = param1.field_j + 1;
          if (!(param1.field_j < 9) ||
            param2) {
            param1.field_g = param1.field_g + 1;
            param1.field_j = 0;
          }
          if (!param0) {
            return;
          }
          var5 = (ta) null;
          this.a(false, (ta) null, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("oh.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 32) {
          field_d = (qk) null;
        }
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (ja.a(param0, (byte) 15)) {
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
        if (param0 == 95) {
          return true;
        }
        if (param1 == 108) {
          return false;
        }
        oh.b(102);
        return false;
    }

    final static mg a(boolean param0, String param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        mg stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param3.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param3);
            var4_long = ck.a((byte) -119, var7);
          } else {
            var6 = param3;
          }
          if (param2) {
            field_e = -111;
          }
          stackIn_6_0 = rn.a(0, param0, var4_long, param1, (String) (var6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("oh.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, ta param2) {
        int var4_int = 0;
        try {
          var4_int = m.field_l[param0] + param2.field_j;
          if (param1 != 23041505) {
            field_d = (qk) null;
          }
          kk.field_a[param2.field_g][var4_int] = this.a(false, param0, param2.field_f, (18 + var4_int * 16384) / 37, param2);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "oh.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
