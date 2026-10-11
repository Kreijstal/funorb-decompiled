/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends vd implements nk, qk {
    static se field_E;
    static bd[] field_G;
    private wg field_H;
    private cj field_L;
    static ij field_M;
    static gb field_J;
    static int field_K;
    private ph field_I;
    static int[] field_F;

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeMouseListener(jc.field_b);
          param0.removeMouseMotionListener(jc.field_b);
          int var2_int = -15 / ((31 - param1) / 48);
          param0.removeFocusListener(jc.field_b);
          mk.field_I = 0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "te.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          te.j(-69);
          ri.field_p.c(0, 0);
          return;
        }
        ri.field_p.c(0, 0);
    }

    private final String k(int param0) {
        if (param0 != 4897) {
          field_E = (se) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -3 % ((param4 + 63) / 52);
          if (this.field_I != param3) {
            return;
          }
          ul.e((byte) -25);
          this.field_H.g((byte) -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("te.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_G = null;
        field_F = null;
        if (param0 == 0) {
          field_M = null;
          field_J = null;
          return;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        te.a((java.awt.Component) null, -11);
        field_M = null;
        field_J = null;
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.a(param1, (byte) -74);
            return stackIn_7_0;
          }
          if (99 != param2) {
            return false;
          }
          stackIn_11_0 = this.b((byte) -78, param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("te.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, cj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0 != -2) {
            field_E = (se) null;
          }
          if (param1 == 0) {
            l.a("terms.ws", (byte) 127);
            return;
          }
          if (param1 == 1) {
            l.a("privacy.ws", (byte) 114);
            return;
          }
          if (param1 != 2) {
            return;
          }
          l.a("conduct.ws", (byte) -123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("te.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    te(wg param0) {
        super(0, 0, 288, 0, (nn) null);
        String var7 = null;
        int var3 = 0;
        cn var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_H = param0;
          this.field_I = new ph(jf.field_e, (mh) null);
          this.field_I.field_h = (nn) ((Object) new ke());
          var7 = vg.a(new String[]{this.e((byte) -61), this.k(4897)}, 89, s.field_a);
          var3 = 20;
          var4 = new cn(jd.field_s, 0, 0, 0, 0, 16777215, -1, 3, 0, jd.field_s.field_y, -1, 2147483647, true);
          this.field_L = new cj(var7, var4);
          this.field_L.field_i = "";
          this.field_L.a(-1, jg.field_e, 0);
          this.field_L.a(-1, jg.field_e, 1);
          this.field_L.field_p = (mh) (this);
          this.field_L.field_s = this.field_s - 40;
          this.field_L.a(true, this.field_s - 40, 26, var3);
          var3 = var3 + (15 + this.field_L.field_x);
          this.a(51448, this.field_L);
          var5 = 4;
          var6 = 200;
          this.field_I.a(var6, var3, 0, -var6 + 300 >> 1, 40);
          this.field_I.field_p = (mh) (this);
          this.a(51448, this.field_I);
          this.a(300, 0, 0, 0, var3 - (-55 - var5));
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String e(byte param0) {
        String discarded$0 = null;
        if (param0 > -24) {
          discarded$0 = this.e((byte) 48);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_E = null;
        field_K = 0;
        field_F = new int[4];
        field_F[2] = 100;
        field_F[1] = 200;
        field_F[0] = 200;
        field_F[3] = 2;
    }
}
