/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ml {
    static oh[] field_qb;
    static String field_ob;
    static hl field_rb;
    static String field_pb;
    static kd field_nb;

    final void e(na param0, int param1) {
        try {
          super.e(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "sd.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    sd(pk param0, na param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static int c(int param0, int param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param2 < -70) {
          var3 = param0 >>> 31;
          return -var3 + (var3 + param0) / param1;
        }
        field_rb = (hl) null;
        var3Lifetime1 = param0 >>> 31;
        return -var3Lifetime1 + (var3Lifetime1 + param0) / param1;
    }

    final static mh a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        mh stackIn_3_0 = null;
        mh stackIn_6_0 = null;
        mh stackIn_16_0 = null;
        mh stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = TetraLink.field_J;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = c.field_o;
            return stackIn_3_0;
          }
          if (var2_int > 63) {
            stackIn_6_0 = nb.field_V;
            return stackIn_6_0;
          }
          var3 = 0;
          if (param0 != 30) {
            field_nb = (kd) null;
          }
          while (var2_int > var3) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                -1 + var2_int == var3) {
                stackIn_16_0 = jg.field_h;
                return stackIn_16_0;
              }
            } else {
              if (fi.field_xb.indexOf(var4) == -1) {
                stackIn_19_0 = jg.field_h;
                return stackIn_19_0;
              }
            }
            var3++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("sd.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, ah param1) {
        RuntimeException var2 = null;
        String var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -28) {
            var3 = (String) null;
            sd.a(121, (String) null);
          }
          stackIn_3_0 = param1.a(false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("sd.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void p(int param0) {
        field_pb = null;
        field_qb = null;
        if (param0 == -32527) {
          field_rb = null;
          field_nb = null;
          field_ob = null;
          return;
        }
        sd.q(68);
        field_rb = null;
        field_nb = null;
        field_ob = null;
    }

    final static void r(int param0) {
        if (!pj.b((byte) 106)) {
          return;
        }
        if (param0 != -11) {
          return;
        }
        om.a(false, 10, 4);
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.addMouseListener(kd.field_g);
          if (param1 != 33) {
            java.awt.Component var3 = (java.awt.Component) null;
            sd.a((java.awt.Component) null, -26);
          }
          param0.addMouseMotionListener(kd.field_g);
          param0.addFocusListener(kd.field_g);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "sd.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void q(int param0) {
        if (fn.field_R == 10) {
          cc.c(param0 - 9216);
          fn.field_R = 11;
        } else {
          if (!wm.b(param0 - 27112)) {
            cc.c(param0 - 9216);
            fn.field_R = 11;
          }
        }
        n.field_Q = true;
        if (param0 == 27112) {
          return;
        }
        sd.r(-30);
    }

    static {
        field_ob = "Return to lobby";
        field_pb = "Create unrated game";
    }
}
