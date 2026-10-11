/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    private int[] field_c;
    private int field_g;
    private int field_f;
    private int[] field_d;
    static boolean field_b;
    private long field_e;
    static rk field_a;

    final void a(boolean param0, vu param1) {
        ha var4 = param1.field_c;
        ha var3 = var4;
        var4.KA(this.field_c[0], this.field_c[1], this.field_c[2], this.field_c[3]);
        var4.DA(this.field_d[0], this.field_d[1], this.field_d[2], this.field_d[3]);
        var3.f(this.field_f, this.field_g);
        if (!param0) {
          return;
        }
        try {
          param1.field_a = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "mj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(vu param0, boolean param1) {
        ha var3 = param0.field_c;
        var3.K(this.field_c);
        this.field_d = var3.Y();
        if (param1) {
          return;
        }
        try {
          this.field_f = var3.i();
          this.field_g = var3.XA();
          this.field_e = param0.field_a;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "mj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(String param0, int param1, int param2, String param3, boolean param4, String param5, int param6) {
        cd var7 = null;
        RuntimeException var7_ref = null;
        cd var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new cd(param0);
          if (param1 != 3) {
            stackIn_2_0 = 39;
            return stackIn_2_0;
          }
          var8 = new cd(param3);
          stackIn_4_0 = u.a(var8, param2, param5, param4, param1 ^ -120, param6, var7);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("mj.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    mj() {
        this.field_c = new int[4];
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 == 3) {
          return;
        }
        mj.a(26);
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        String var4 = null;
        ht var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          var5 = (ht) (an.field_b.d(268435455));
          if (param0 != 84) {
            var4 = (String) null;
            mj.a((String) null, 4, -49, (String) null, false, (String) null, 101);
          }
          while (var5 != null) {
            sg.a(param1, (byte) -92, var5);
            var5 = (ht) (an.field_b.b((byte) 103));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "mj.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = false;
    }
}
