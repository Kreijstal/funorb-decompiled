/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends vd implements qk {
    private ph field_H;
    private ph field_G;
    static bd field_J;
    private ph field_K;
    static java.math.BigInteger field_L;
    static bd field_E;
    static int field_I;
    static gg field_F;

    final static int j(int param0) {
        if (param0 > 13) {
          if (pb.field_Kb < 2) {
            return 0;
          }
          if (nl.field_c == 0) {
            if (!im.field_c.a(-15879)) {
              return 20;
            }
            if (!im.field_c.a(-8088, "commonui")) {
              return 40;
            }
            if (!mb.field_m.a(-15879)) {
              return 50;
            }
            if (!mb.field_m.a(-8088, "commonui")) {
              return 60;
            }
            if (!ll.field_b.a(-15879)) {
              return 70;
            }
            if (ll.field_b.e(0)) {
              return 100;
            }
            return 80;
          }
          if (vc.field_d != null) {
            if (!vc.field_d.a(-15879)) {
              return 14;
            }
            if (!vc.field_d.a("", (byte) 115)) {
              return 29;
            }
            if (!vc.field_d.a(-8088, "")) {
              return 29;
            }
          }
        } else {
          field_F = (gg) null;
          if (pb.field_Kb < 2) {
            return 0;
          }
          if (nl.field_c == 0) {
            if (!im.field_c.a(-15879)) {
              return 20;
            }
            if (!im.field_c.a(-8088, "commonui")) {
              return 40;
            }
            if (!mb.field_m.a(-15879)) {
              return 50;
            }
            if (!mb.field_m.a(-8088, "commonui")) {
              return 60;
            }
            if (!ll.field_b.a(-15879)) {
              return 70;
            }
            if (!ll.field_b.e(0)) {
              return 80;
            }
            return 100;
          }
          if (vc.field_d == null) {
            if (!im.field_c.a(-15879)) {
              return 43;
            }
            if (!im.field_c.a(-8088, "commonui")) {
              return 57;
            }
            if (!mb.field_m.a(-15879)) {
              return 71;
            }
            if (!mb.field_m.a(-8088, "commonui")) {
              return 80;
            }
            if (!ll.field_b.a(-15879)) {
              return 82;
            }
            if (ll.field_b.e(0)) {
              return 100;
            }
            return 86;
          }
          if (!vc.field_d.a(-15879)) {
            return 14;
          }
          if (!vc.field_d.a("", (byte) 115)) {
            return 29;
          }
          if (!vc.field_d.a(-8088, "")) {
            return 29;
          }
        }
        if (!im.field_c.a(-15879)) {
          return 43;
        }
        if (!im.field_c.a(-8088, "commonui")) {
          return 57;
        }
        if (!mb.field_m.a(-15879)) {
          return 71;
        }
        if (!mb.field_m.a(-8088, "commonui")) {
          return 80;
        }
        if (!ll.field_b.a(-15879)) {
          return 82;
        }
        if (!ll.field_b.e(0)) {
          return 86;
        }
        return 100;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param1 + this.field_v;
        int var6 = param0 + this.field_m;
        jd.field_s.a(jn.field_K, var5 + 20, 20 + var6, this.field_s - 40, -50 + this.field_x, 16777215, -1, 1, 0, jd.field_s.field_y);
        super.a(param0, param1, (byte) 106, param3);
        if (param2 >= 42) {
          return;
        }
        ph var7 = (ph) null;
        this.a(4, -115, 34, (ph) null, (byte) 88);
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_5_0 = this.a(param1, (byte) -124);
            return stackIn_5_0;
          }
          if (99 != param2) {
            return false;
          }
          stackIn_9_0 = this.b((byte) 122, param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("nb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public nb() {
        super(0, 0, 476, 225, (nn) null);
        this.field_G = new ph(kc.field_f, (mh) null);
        this.field_H = new ph(dk.field_l, (mh) null);
        this.field_K = new ph(ej.field_n, (mh) null);
        ke var1 = new ke();
        this.field_G.field_h = (nn) ((Object) var1);
        this.field_H.field_h = (nn) ((Object) var1);
        this.field_K.field_h = (nn) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_H.a(var4, -var2 + (-48 + this.field_x), 0, -var3 + this.field_s >> 1, 30);
        this.field_K.a(var4, -var2 + (this.field_x - 48), 0, var4 + ((-var3 + this.field_s >> 1) + var2), 30);
        this.field_G.a(var3, -(2 * var2) + (this.field_x - 78), 0, -var3 + this.field_s >> 1, 30);
        this.field_H.field_p = (mh) (this);
        this.field_G.field_p = (mh) (this);
        this.field_G.field_i = e.field_x;
        this.field_K.field_p = (mh) (this);
        this.field_K.field_i = hk.field_l;
        this.a(51448, this.field_H);
        this.a(51448, this.field_G);
        this.a(51448, this.field_K);
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          var6_int = 17 / ((param4 + 63) / 52);
          if (param3 != this.field_H) {
            if (this.field_G != param3) {
              if (param3 == this.field_K) {
                ci.a(-1);
              }
            } else {
              gb.d(62);
            }
          } else {
            fa.a(5109);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("nb.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void k(int param0) {
        if (param0 == 82) {
          field_F = null;
          field_J = null;
          field_L = null;
          field_E = null;
          return;
        }
        field_E = (bd) null;
        field_F = null;
        field_J = null;
        field_L = null;
        field_E = null;
    }

    static {
        field_L = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
