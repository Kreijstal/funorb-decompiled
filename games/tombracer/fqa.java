/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fqa extends kna {
    private f field_G;
    private jma field_H;
    private boolean field_I;
    static String[] field_F;

    final void w(int param0) {
        super.w(-126);
        this.field_G.a(this.o((byte) -57), false);
        if (param0 >= -122) {
          this.field_G = (f) null;
        }
    }

    abstract boolean r(byte param0);

    void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          this.field_G.a(param1, 115, this.o((byte) -39));
          if (this.r((byte) 93)) {
            param1.a((byte) -19, !this.field_I ? 0 : 1, 1);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fqa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void x(int param0) {
        super.x(param0);
        if (null != this.field_H) {
          this.field_H.h(1).a(9, this.field_G.a((byte) -103));
          return;
        }
    }

    public static void A(int param0) {
        field_F = null;
        if (param0 != 1) {
          fqa.a(false, 'ￆ');
        }
    }

    abstract int B(int param0);

    final static int[] e(boolean param0) {
        if (!param0) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static boolean a(boolean param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (q.a(param1, 11955)) {
          return true;
        }
        if (param0) {
          return false;
        }
        if (param1 == 45) {
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (32 == param1) {
          return true;
        }
        if (param1 != 95) {
          return false;
        }
        return true;
    }

    fqa(la param0, int param1) {
        super(param0, param1);
        try {
          this.field_G = new f(this.B(31609), 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fqa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        try {
          this.field_G = new f(this.B(31609), 0, param0.field_E, param2);
          if (this.r((byte) 93)) {
            this.field_I = param2.b((byte) 44, 1) == 1 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ut param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_H = param0.k((byte) -77);
          if (param1 >= -51) {
            return;
          }
          if (!this.r((byte) 93)) {
            return;
          }
          if (this.field_I) {
            this.field_H.b(1, 52);
            return;
          }
          this.field_H.a(-2, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fqa.BC(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_F = new String[]{"<%0> was burnt", "<%0> was flamed", "<%0> was immolated", "<%0> was barbecued", "<%0> was carbonised", "<%0> was toasted", "<%0> was roasted", "<%0> was fired", "<%0> was slightly more than well-done", "<%0> felt the burn", "<%0> got a little hot under the collar", "<%0> couldn't take the heat", "<%0> should stay out of the kitchen", "<%0> smelled the napalm"};
    }
}
