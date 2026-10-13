/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends mh {
    static String field_Pb;
    private mh field_Qb;
    static oh field_Rb;
    static String field_Tb;
    static RgbSprite field_Ub;
    static boolean field_Sb;
    static TextFont field_Wb;
    private mh field_Vb;

    final int a(byte param0, int param1) {
        if (param0 != 11) {
          field_Tb = (String) null;
        }
        return this.field_Vb.g(param0 + 90) + (param1 + this.field_Qb.g(91));
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = 0;
          if (param0 > -103) {
            field_Ub = (RgbSprite) null;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = (var3 << 5) - var3 + na.a(-8250, param1.charAt(var4));
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ni.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean b(boolean param0, char param1) {
        boolean stackIn_10_0 = false;
        if (!param0) {
          field_Pb = (String) null;
        }
        stackIn_10_0 = ((!(param1 < 65) &&
          !(90 < param1)) ||
          (!(param1 < 97) &&
          !(122 < param1)));
        return stackIn_10_0;
    }

    ni(long param0, RgbSprite param1, RgbSprite param2, int param3, mh param4, String param5) {
        this(param0, (mh) null, param4, param5);
        try {
          this.field_Vb.field_K = param1;
          this.field_Vb.field_Q = param3;
          this.field_Vb.field_wb = param2;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ni.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private ni(long param0, mh param1, mh param2, String param3) {
        super(param0, (mh) null);
        try {
          this.field_Vb = new mh(0L, param1);
          this.field_Qb = new mh(0L, param2);
          this.field_Qb.field_Mb = param3;
          this.a(this.field_Vb, 0);
          this.a(this.field_Qb, 0);
          this.c(true);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ni.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static AudioMixer h(int param0) {
        if (param0 < 91) {
          field_Pb = (String) null;
        }
        return ob.soundMixer;
    }

    public static void d(boolean param0) {
        field_Ub = null;
        field_Pb = null;
        field_Tb = null;
        field_Wb = null;
        field_Rb = null;
        if (!param0) {
          field_Rb = (oh) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        this.a(param2, param3, param5, param0, (byte) 64);
        this.b(-32434, param1);
        if (!param4) {
          ni.d(false);
        }
    }

    ni(long param0, ni param1, String param2) {
        this(param0, param1.field_Vb, param1.field_Qb, param2);
    }

    private final void b(int param0, int param1) {
        this.field_Vb.a(this.field_cb, 0, 0, this.field_Vb.g(118), (byte) 64);
        int var3 = this.field_Vb.field_Ib + param1;
        if (param0 != -32434) {
          field_Ub = (RgbSprite) null;
        }
        this.field_Qb.a(this.field_cb, 0, var3, this.field_Ib - var3, (byte) 64);
    }

    static {
        field_Pb = "Don't mind";
        field_Tb = "This password contains your email address, and would be easy to guess";
    }
}
