/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends nv {
    private boolean field_r;
    private boolean field_v;
    private boolean field_t;
    private boolean field_p;
    static String field_n;
    static int[] field_u;
    static String field_q;
    private boolean field_o;
    static String field_s;

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          field_q = (String) null;
          return param0;
        }
        return param0;
    }

    public static void b(int param0) {
        field_n = null;
        field_q = null;
        if (param0 != -2) {
          return;
        }
        field_s = null;
        field_u = null;
    }

    sg(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_r = false;
        try {
          this.field_p = 1 != param1.b((byte) 44, 1) ? false : true;
          this.field_t = param1.b((byte) 44, 1) != 1 ? false : true;
          this.field_v = param1.b((byte) 44, 1) != 1 ? false : true;
          this.field_o = param1.b((byte) 44, 1) == 1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param0.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param0.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param0.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param0.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param0.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param0.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (param1 != 1) {
            sg.b(-10);
          }
          if (!param0.equals("C")) {
            return Class.forName(param0);
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("sg.H(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final void k(int param0) {
        hca var2 = null;
        if (param0 != 5418) {
          return;
        }
        if (this.d(8031)) {
          this.field_r = true;
          var2 = this.m((byte) 19);
          if (this.field_t) {
            var2.i(true);
          }
          if (this.field_o) {
            var2.l((byte) 28);
            if (this.field_v) {
              var2.n(21120);
              return;
            }
            return;
          }
          if (this.field_v) {
            var2.n(21120);
            return;
          }
          return;
        }
        if (!this.field_r) {
          return;
        }
        if (this.field_p) {
          this.c(false);
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_v = true;
          return 10;
        }
        return 10;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) -125, this.field_p ? 1 : 0, 1);
          param1.a((byte) -25, !this.field_t ? 0 : 1, 1);
          param1.a((byte) 12, !this.field_v ? 0 : 1, 1);
          param1.a((byte) -125, this.field_o ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "You ran out of time";
        field_q = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_s = "Quick Chat game";
    }
}
