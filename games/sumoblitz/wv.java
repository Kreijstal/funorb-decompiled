/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wv {
    static int[] field_a;

    final static boolean a(byte param0, char param1) {
        if (param0 > -71) {
          wv.a(false);
          if (param1 == 160) {
            return true;
          }
          if (param1 == 32) {
            return true;
          }
          if (95 == param1) {
            return true;
          }
          if (45 != param1) {
            return false;
          }
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (95 == param1) {
          return true;
        }
        if (45 != param1) {
          return false;
        }
        return true;
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = gf.a('_', param2, param0, "");
          if (param0) {
            var4 = (String) null;
            wv.a(true, (String) null, (String) null);
          }
          var3 = ji.a(param2, (byte) 81);
          stackIn_7_0 = (-1 != param1.indexOf(param2)) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("wv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 24238) {
          field_a = (int[]) null;
          lf.a(0, 0);
          return;
        }
        lf.a(0, 0);
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          wv.a((byte) 57, 'U');
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
          if (hc.field_c != null) {
            hc.field_c.n(-7);
          }
          no.field_a = new cv(param1, param2, false, true, true);
          if (param0 < 73) {
            String var4 = (String) null;
            wv.a(false, (String) null, (String) null);
          }
          vi.field_y.b((byte) -119, no.field_a);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wv.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
