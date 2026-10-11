/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends al {
    private ba field_l;
    private ba field_n;
    static boolean field_k;
    static eh field_p;
    static String[] field_m;
    static int[] field_j;
    static tg field_o;

    public static void d(int param0) {
        field_j = null;
        field_o = null;
        field_p = null;
        field_m = null;
        if (param0 != 0) {
          field_m = (String[]) null;
        }
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        try {
          var3 = this.field_n.field_h.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < -1 + var3.length()) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          var5Lifetime1 = -116 / ((param0 - 29) / 40);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("bf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_l.field_h.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            return null;
          }
          var5 = var4;
          if (hc.b(var5, param1 ^ -114)) {
            stackIn_5_0 = ve.field_b;
            return stackIn_5_0;
          }
          if (nd.a(var5, param1 + 183)) {
            stackIn_8_0 = ef.field_d;
            return stackIn_8_0;
          }
          if (param1 != -114) {
            stackIn_11_0 = (String) null;
            return stackIn_11_0;
          }
          if (ab.a(var5, (byte) -12)) {
            stackIn_14_0 = mb.field_k;
            return stackIn_14_0;
          }
          if (this.a(param1 ^ 65, param0)) {
            stackIn_18_0 = bd.field_m;
            return stackIn_18_0;
          }
          if (var6.length() <= 0) {
            stackIn_21_0 = lk.field_s;
            return stackIn_21_0;
          }
          if (pf.a(128, var5, var6)) {
            stackIn_24_0 = ll.field_J;
            return stackIn_24_0;
          }
          if (ee.a(-1, var6, var5)) {
            stackIn_28_0 = kk.field_t;
            return stackIn_28_0;
          }
          if (!ah.a(var5, var6, (byte) 8)) {
            stackIn_33_0 = ve.field_b;
            return stackIn_33_0;
          }
          stackIn_31_0 = ll.field_J;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("bf.C(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    bf(ba param0, ba param1, ba param2) {
        super(param0);
        try {
          this.field_l = param1;
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final vf b(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        vf stackIn_2_0 = null;
        vf stackIn_5_0 = null;
        vf stackIn_8_0 = null;
        vf stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 54) {
            stackIn_2_0 = (vf) null;
            return stackIn_2_0;
          }
          var3 = this.field_l.field_h.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_5_0 = a.field_e;
            return stackIn_5_0;
          }
          if (!qb.a(param1 - 177, var4, var3)) {
            stackIn_8_0 = a.field_e;
            return stackIn_8_0;
          }
          if (!this.a(77, param0)) {
            return mc.field_a;
          }
          stackIn_12_0 = a.field_e;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("bf.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_p = new eh(13, 0, 1, 0);
        field_j = new int[]{100, 200, 500, 100, 100, 200, 200, 200, 500, 1000};
    }
}
