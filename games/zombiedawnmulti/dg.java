/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends se implements in {
    static th field_K;
    private gn field_N;
    private gn field_H;
    static int field_M;
    private gn field_P;
    static boolean field_J;
    static String field_L;
    static String[] field_G;
    static String field_O;
    static String field_I;

    final static void i(int param0) {
        ra.field_o = rg.g(-18799);
        nb.field_a = new vk();
        if (param0 == 4) {
          io.a(-21113, true, true);
          return;
        }
        dg.h(-109);
        io.a(-21113, true, true);
    }

    final static vp a(int param0) {
        if (param0 != 30) {
          field_I = (String) null;
          return bh.field_a;
        }
        return bh.field_a;
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_N != param2) {
            if (param2 != this.field_P) {
              if (param2 == this.field_H) {
                bo.b(4);
              }
            } else {
              hb.a(0);
            }
          } else {
            qe.c((byte) 106);
          }
          if (param3 < -83) {
            return;
          }
          field_G = (String[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(eh param0, int param1) {
        try {
          r.field_a = param0;
          if (param1 != -40) {
            field_J = false;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_K = null;
        field_O = null;
        field_I = null;
        field_G = null;
        int var1 = 18 / ((31 - param0) / 43);
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_y + param3;
        int var6 = this.field_i + param1;
        ke.field_h.a(ti.field_H, 20 + var5, var6 + 20, this.field_n - 40, this.field_w - 50, 16777215, -1, 1, 0, ke.field_h.field_C);
        super.a(param0, param1, param2, param3);
    }

    final static void h(int param0) {
        if (rm.field_b != null) {
          rm.field_b.h();
        }
        if (ga.field_u != null) {
          ga.field_u.h();
        }
        if (param0 > -50) {
          dg.i(87);
          return;
        }
    }

    public dg() {
        super(0, 0, 476, 225, (nl) null);
        this.field_P = new gn(en.field_a, (bj) null);
        this.field_N = new gn(oq.field_v, (bj) null);
        this.field_H = new gn(gf.field_a, (bj) null);
        oq var1 = new oq();
        this.field_P.field_h = (nl) ((Object) var1);
        this.field_N.field_h = (nl) ((Object) var1);
        this.field_H.field_h = (nl) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_N.b(-var3 + this.field_n >> 1, -var2 + (-48 + this.field_w), 28972, var4, 30);
        this.field_H.b((this.field_n - var3 >> 1) + (var4 + var2), -48 + (this.field_w - var2), 28972, var4, 30);
        this.field_P.b(this.field_n - var3 >> 1, -(var2 * 2) + (-78 + this.field_w), 28972, var3, 30);
        this.field_N.field_A = (bj) (this);
        this.field_P.field_A = (bj) (this);
        this.field_P.field_x = qm.field_I;
        this.field_H.field_A = (bj) (this);
        this.field_H.field_x = de.field_a;
        this.b((byte) 45, this.field_N);
        this.b((byte) 70, this.field_P);
        this.b((byte) 60, this.field_H);
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_6_0 = this.a((byte) -1, param2);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(78, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("dg.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_K = new th();
        field_L = "The '<%0>' setting needs to be changed.";
        field_G = new String[]{"Pupil", "Neophyte", "Battle Master", "Conqueror", "Single-minded", "Bare Limbs", "Human-lover", "Gene Therapy", "Magic Fingers", "Lord of the Castle", "My Precious...", "Gotcha!", "Skin and Bones", "Mutant Strain", "Unattached", "Sire of the Realm", "Pumpkin Studies", "Slaughterer", "Unforgiving", "Behind Enemy Lines", "Barren Ally", "Laborious Student", "Gas Mask", "Journeyman"};
        field_J = false;
        field_O = "Determined";
        field_I = "Remove friend";
    }
}
