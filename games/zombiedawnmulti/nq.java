/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nq extends qa {
    int field_x;
    static th field_s;
    int field_u;
    int field_y;
    static String field_A;
    int field_z;
    static cj field_v;
    int field_w;
    static cj field_t;
    int field_r;
    static int[] field_q;

    final static void f(int param0) {
        og.a(0, jl.b(0));
        int var1 = -5 % ((33 - param0) / 60);
    }

    public static void e(int param0) {
        field_s = null;
        if (param0 >= -92) {
          return;
        }
        field_t = null;
        field_q = null;
        field_A = null;
        field_v = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          eq.a((java.awt.Component) ((Object) param1), (byte) 127);
          of.a(-1693, (java.awt.Component) ((Object) param1));
          if (param0 != 95) {
            field_s = (th) null;
          }
          if (ll.field_a == null) {
            return;
          }
          ll.field_a.a((java.awt.Component) ((Object) param1), (byte) 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("nq.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static ae a(int param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 22272) {
            field_t = (cj) null;
          }
          var2_int = param1.d((byte) 69);
          var3 = param1.d((byte) 69);
          var4 = param1.d((byte) 69);
          stackIn_3_0 = aq.a(var2_int, false, var4, var3);
          return (ae) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("nq.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        ga var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param1.length();
          if (param0 > -21) {
            var7 = (ga) null;
            nq.a(-8, (ga) null);
          }
          if (var2_int > 20) {
            var2_int = 20;
          }
          var9 = new char[var2_int];
          var8 = var9;
          var3 = var8;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + var5 - 65);
            } else if ((var5 < 97 ||
              122 < var5) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_22_0 = new String(var9);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("nq.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    nq() {
    }

    static {
        field_A = "Get the humans into your portal!";
        field_q = new int[]{100, 267, 374, 460, 520, 580};
        field_s = new th();
    }
}
