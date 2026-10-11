/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends og implements im, vd {
    static dd field_E;
    private sa field_z;
    private rf field_B;
    private pc field_C;

    public final void a(int param0, int param1, rf param2, byte param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (param0 != 0) {
            if (1 == param0) {
              fq.a(-121, "privacy.ws");
            } else {
              if (param0 == 2) {
                fq.a(30, "conduct.ws");
              }
            }
          } else {
            fq.a(96, "terms.ws");
          }
          if (param3 < -127) {
            return;
          }
          this.field_C = (pc) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ph.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final String a(int param0) {
        if (param0 <= 104) {
          field_E = (dd) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a((byte) -89, param2);
            return stackIn_6_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.a(param2, -25911);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ph.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    ph(sa param0) {
        super(0, 0, 288, 0, (wo) null);
        String var7 = null;
        int var3 = 0;
        lb var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_z = param0;
          this.field_C = new pc(go.field_j, (bi) null);
          this.field_C.field_i = (wo) ((Object) new ve());
          var7 = ci.a(new String[]{this.a(106), this.i(64)}, cc.field_d, 3);
          var3 = 20;
          var4 = new lb(ai.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, ai.field_h.field_o, -1, 2147483647, true);
          this.field_B = new rf(var7, var4);
          this.field_B.field_t = "";
          this.field_B.a(47, hp.field_r, 0);
          this.field_B.a(47, hp.field_r, 1);
          this.field_B.field_l = (bi) (this);
          this.field_B.field_g = this.field_g - 40;
          this.field_B.b(var3, 47, 26, -40 + this.field_g);
          var3 = var3 + (this.field_B.field_f + 15);
          this.b(this.field_B, -119);
          var5 = 4;
          var6 = 200;
          this.field_C.a(40, -var6 + 300 >> 1, var3, var6, (byte) -52);
          this.field_C.field_l = (bi) (this);
          this.b(this.field_C, 94);
          this.a(var3 + (55 + var5), 0, 0, 300, (byte) -52);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ph.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 2 / ((83 - param0) / 36);
          if (param4 != this.field_C) {
            return;
          }
          ro.g(-53);
          this.field_z.i((byte) -46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_5_0 = var6;
          stackIn_5_1 = new StringBuilder().append("ph.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, ta param3) {
        try {
          pd.field_g[param2] = pd.field_g[param2] + param0;
          bp.field_b.addElement(new kk(param3.field_j * 15 + (-30 + m.field_l[param2] * 15), -15 + 15 * param3.field_g, Integer.toString(param0)));
          if (param1 != 107) {
            ta var5 = (ta) null;
            ph.a(67, (byte) 78, -61, (ta) null);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ph.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(boolean param0) {
        field_E = null;
        if (!param0) {
          field_E = (dd) null;
        }
    }

    private final String i(int param0) {
        int var2 = 101 % ((param0 + 27) / 56);
        return "</col></u>";
    }

    static {
    }
}
