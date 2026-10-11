/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ih {
    int field_mb;
    static boolean field_nb;
    static wi field_jb;
    String field_kb;
    static gi field_lb;
    String field_ob;
    static eh field_pb;

    final static boolean e(byte param0) {
        int var2 = 0;
        hh var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        hh var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Bounce.field_N;
        try {
          if (param0 != 102) {
            return false;
          }
          var4 = (hh) (ob.field_c.a((byte) -46));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_j; var2++) {
            if (null != var4.field_n[var2] &&
              var4.field_n[var2].field_f == 0) {
              return false;
            }
            if (null != var4.field_s[var2] &&
              var4.field_s[var2].field_f == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1_ref), "fb.K(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        field_jb = null;
        if (param0 != 4) {
          java.awt.Component var2 = (java.awt.Component) null;
          fb.a((java.awt.Component) null, (byte) 105);
        }
        field_pb = null;
        field_lb = null;
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          if (param1 >= -26) {
            fb.d(35);
          }
          param0.addMouseListener(nj.field_o);
          param0.addMouseMotionListener(nj.field_o);
          param0.addFocusListener(nj.field_o);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "fb.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fb() {
        super(0L, (ih) null);
    }

    final static String a(byte param0, String param1, String param2, gk param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -7) {
            fb.d(2);
          }
          if (!param3.c(102)) {
            stackIn_5_0 = (String) (param1);
            return stackIn_5_0;
          }
          stackIn_7_0 = param2 + " - " + param3.b(param4, (byte) -100) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fb.H(").append(param0).append(',');
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
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_nb = false;
        field_pb = new eh(2, 4, 4, 0);
    }
}
