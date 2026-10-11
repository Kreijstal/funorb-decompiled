/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static String field_a;
    static volatile boolean field_c;
    static di field_b;
    static String[] field_d;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          em.a((java.awt.Component) ((Object) param0), (byte) -39);
          hj.a((java.awt.Component) ((Object) param0), false);
          if (param1 != 0) {
            return;
          }
          if (oa.field_a == null) {
            return;
          }
          oa.field_a.a((java.awt.Component) ((Object) param0), 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        java.awt.Canvas var6;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param3 != 0) {
          var6 = (java.awt.Canvas) null;
          he.a((java.awt.Canvas) null, -1);
        }
        if (!param1) {
          if (ah.field_c[param0] < ah.field_c[param2]) {
            return true;
          }
          if (ah.field_c[param2] < ah.field_c[param0]) {
            return false;
          }
          if (kb.field_g[param2] > kb.field_g[param0]) {
            return true;
          }
          if (kb.field_g[param2] < kb.field_g[param0]) {
            return false;
          }
          var4 = gd.field_d[param0] + (ob.field_y[param0] + om.field_s[param0]);
          var5 = gd.field_d[param2] + (ob.field_y[param2] + om.field_s[param2]);
          if (var5 > var4) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(param0 >= param2);
        }
        if (kb.field_g[param2] > kb.field_g[param0]) {
          return true;
        }
        if (kb.field_g[param2] < kb.field_g[param0]) {
          return false;
        }
        if (ah.field_c[param2] > ah.field_c[param0]) {
          return true;
        }
        if (ah.field_c[param2] < ah.field_c[param0]) {
          return false;
        }
        var4Lifetime1 = gd.field_d[param0] + (ob.field_y[param0] + om.field_s[param0]);
        var5Lifetime1 = gd.field_d[param2] + (ob.field_y[param2] + om.field_s[param2]);
        if (var5Lifetime1 > var4Lifetime1) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime1) {
          return false;
        }
        return !(param0 >= param2);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != -13) {
          field_c = false;
        }
    }

    final static boolean a(char param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ul.a(param0, (byte) 125)) {
            return false;
          }
          if (param1 == null) {
            return false;
          }
          if (param2 != 15692) {
            he.a(-56);
          }
          var3_int = param1.length();
          if (var3_int >= 12) {
            return false;
          }
          if (!qd.a(0, param0)) {
            return true;
          }
          if (0 != var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("he.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final static an a(di param0, String param1, int param2, di param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        an stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.b(param4, -1);
          var6 = param0.a(var5_int, param2, param1);
          stackIn_1_0 = wc.a(param0, 43, var5_int, param3, var6);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("he.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_c = true;
        field_a = "This game option is not available in rated games.";
        field_d = new String[]{"Terrible!", "Awful!", "Egad!"};
    }
}
