/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends bj implements qb {
    private hc field_J;
    static int field_H;
    private hc field_G;
    private hc field_I;

    public l() {
        super(0, 0, 476, 225, (db) null);
        this.field_I = new hc(pc.field_g, (wn) null);
        this.field_G = new hc(c.field_p, (wn) null);
        this.field_J = new hc(cj.field_c, (wn) null);
        ck var1 = new ck();
        this.field_I.field_s = (db) ((Object) var1);
        this.field_G.field_s = (db) ((Object) var1);
        this.field_J.field_s = (db) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_G.a(var4, this.field_x - (48 + var2), -var3 + this.field_g >> 1, true, 30);
        this.field_J.a(var4, -48 + (this.field_x - var2), (this.field_g - var3 >> 1) + (var4 + var2), true, 30);
        this.field_I.a(var3, -78 + (this.field_x - 2 * var2), -var3 + this.field_g >> 1, true, 30);
        this.field_G.field_q = (wn) (this);
        this.field_I.field_q = (wn) (this);
        this.field_J.field_q = (wn) (this);
        this.field_I.field_i = mm.field_c;
        this.field_J.field_i = lf.field_G;
        this.b(this.field_G, false);
        this.b(this.field_I, false);
        this.b(this.field_J, false);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 > 85) {
          int var5 = this.field_k + param3;
          int var6 = param0 + this.field_j;
          sb.field_a.a(q.field_F, var5 + 20, var6 + 20, this.field_g - 40, this.field_x - 50, 16777215, -1, 1, 0, sb.field_a.field_r);
          super.a(param0, (byte) 99, param2, param3);
          return;
        }
        this.field_J = (hc) null;
        int var5Lifetime1 = this.field_k + param3;
        int var6Lifetime1 = param0 + this.field_j;
        sb.field_a.a(q.field_F, var5Lifetime1 + 20, var6Lifetime1 + 20, this.field_g - 40, this.field_x - 50, 16777215, -1, 1, 0, sb.field_a.field_r);
        super.a(param0, (byte) 99, param2, param3);
    }

    final static boolean a(byte param0) {
        if (param0 >= -30) {
          field_H = -87;
          if (aj.b(-127)) {
            return false;
          }
          if (mg.field_b >= 2) {
            return true;
          }
          return false;
        }
        if (aj.b(-127)) {
          return false;
        }
        if (mg.field_b >= 2) {
          return true;
        }
        return false;
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        String stackIn_14_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (this.field_G == param0) {
            GameAppletShell.b(-74);
          } else if (this.field_I == param0) {
            fe.a((byte) -83);
          } else if (this.field_J == param0) {
            bm.a(4);
          }
          if (param3 == 1) {
            return;
          }
          l.a((byte) -64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var6;
          StringBuilder stackIn_13_1 = new StringBuilder().append("l.K(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        String stackIn_17_2 = null;
        try {
          if (super.a(param0, param1, param2, 71)) {
            return true;
          }
          if (param2 == 98) {
            boolean stackIn_6_0 = this.a((byte) 22, param0);
            return stackIn_6_0;
          }
          if (param3 < 0) {
            return true;
          }
          if (param2 != 99) {
            return false;
          }
          boolean stackIn_13_0 = this.a(param0, true);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("l.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != -8462) {
          return -107;
        }
        if (!qd.a(param1, -99)) {
          return -1;
        }
        return param1;
    }

    static {
        field_H = 4;
    }
}
