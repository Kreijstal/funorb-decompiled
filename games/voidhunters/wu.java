/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wu extends uda {
    private float field_f;
    static phb field_h;
    static String field_e;
    private rga field_g;

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
          return;
        }
        this.field_d.a(et.field_c, true, asa.field_a);
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        ura var6;
        int var4Lifetime1;
        var5 = VoidHunters.field_G;
        this.field_d.g(1, -124);
        if (param2 == 5) {
          if ((128 & param1) != 0) {
            this.field_d.a((ura) null, -123);
            this.field_d.g(0, -64);
            return;
          }
          if ((1 & param0) != 1) {
            if (!this.field_g.field_b) {
              this.field_d.a(this.field_g.field_a[0], -128);
            } else {
              this.field_d.a(this.field_g.field_d, -122);
            }
            this.field_d.g(0, -64);
            return;
          }
          if (this.field_g.field_b) {
            this.field_f = (float)(this.field_d.field_pc % 4000) / 4000.0f;
            this.field_d.a(this.field_g.field_d, -118);
            this.field_d.g(0, -64);
            return;
          }
          var4 = this.field_d.field_pc % 4000 * 16 / 4000;
          this.field_d.a(this.field_g.field_a[var4], param2 - 126);
          this.field_d.g(0, -64);
          return;
        }
        var6 = (ura) null;
        this.a((byte) -1, -12, (ura) null);
        if ((128 & param1) != 0) {
          this.field_d.a((ura) null, -123);
        } else {
          if ((1 & param0) != 1) {
            if (!this.field_g.field_b) {
              this.field_d.a(this.field_g.field_a[0], -128);
            } else {
              this.field_d.a(this.field_g.field_d, -122);
            }
          } else {
            if (this.field_g.field_b) {
              this.field_f = (float)(this.field_d.field_pc % 4000) / 4000.0f;
              this.field_d.a(this.field_g.field_d, -118);
            } else {
              var4Lifetime1 = this.field_d.field_pc % 4000 * 16 / 4000;
              this.field_d.a(this.field_g.field_a[var4Lifetime1], param2 - 126);
            }
          }
        }
        this.field_d.g(0, -64);
        return;
    }

    public static void d(byte param0) {
        int var1 = 93 % ((-34 - param0) / 63);
        field_h = null;
        field_e = null;
    }

    wu(pf param0, rga param1) {
        super(param0);
        this.field_f = 0.0f;
        try {
          this.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        this.field_d.g(1, param0 ^ -72);
        this.field_d.a(et.field_c, true, je.field_c);
        this.field_d.a(true, param0 ^ -21120, false, qcb.field_q, 0);
        this.field_d.a(0, (byte) -101, pja.field_l);
        this.field_d.d(-34, 0);
        this.field_d.g(0, -79);
        this.field_d.e(-128, -16777216);
        this.field_d.a(0, (byte) -111, pea.field_d);
        if (param0 == 5) {
          this.d(param0 + 3);
          return;
        }
        this.d(-88);
        this.d(param0 + 3);
    }

    final boolean a(byte param0) {
        int var2 = -105 % ((param0 - 34) / 63);
        return this.field_g.c((byte) 85);
    }

    final void a(int param0) {
        this.field_d.g(1, -59);
        this.field_d.a(asa.field_a, true, asa.field_a);
        this.field_d.a(0, qcb.field_q, param0 ^ 2536);
        this.field_d.a(0, (byte) -101, qcb.field_q);
        this.field_d.d(-70, 1);
        this.field_d.a((ura) null, -124);
        this.field_d.g(0, -62);
        this.field_d.a(0, (byte) -76, qcb.field_q);
        if (param0 != 2543) {
          field_h = (phb) null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        int stackIn_22_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_77_0 = 0;
        String var2;
        String[] var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        int var6Lifetime1;
        int var5Lifetime2;
        int var6Lifetime2;
        var2 = kca.field_a;
        if (var2 == null) {
          var2 = "You";
        }
        var3 = new String[]{var2};
        if (foa.field_p == 1) {
          var3 = new String[]{var2, null, null, null, null, null};
        }
        var4 = 2;
        if (ssa.b(2)) {
          if (!si.field_o[81]) {
            if (ssa.b(2) &&
              si.field_o[82]) {
              var4 = 1;
            }
            if (!ssa.b(2)) {
              var5 = hob.a(new Random(), 2147483647, 117);
              if (param0) {
                var4 = 3;
                qqa.a(true, (byte) -41);
              }
              vqa.field_g = new uca(false, var3, 0, false, var4, var5, param0);
              mjb.field_e = param1;
              di.field_l.a(false, -13027);
              var6 = mnb.field_d ? 1 : 0;
              stackIn_34_0 = (bqa.a(false)) ? 7 : 0;
              lha.a(stackIn_34_0, var6 != 0, (byte) -85, -1);
              dua.field_o = false;
              aka.field_p = false;
              bg.field_o = true;
              idb.field_o = true;
              if (wh.g(-120)) {
                dpa.field_p.h(24335, 71);
                vga.field_b = ldb.field_o;
              }
              return;
            }
            if (si.field_o[86]) {
              param0 = true;
            }
            var5Lifetime2 = hob.a(new Random(), 2147483647, 117);
            if (param0) {
              var4 = 3;
              qqa.a(true, (byte) -41);
            }
            vqa.field_g = new uca(false, var3, 0, false, var4, var5Lifetime2, param0);
            mjb.field_e = param1;
            di.field_l.a(false, -13027);
            var6Lifetime2 = mnb.field_d ? 1 : 0;
            stackIn_22_0 = (bqa.a(false)) ? 7 : 0;
            lha.a(stackIn_22_0, var6Lifetime2 != 0, (byte) -85, -1);
            dua.field_o = false;
            aka.field_p = false;
            bg.field_o = true;
            idb.field_o = true;
            if (wh.g(-120)) {
              dpa.field_p.h(24335, 71);
              vga.field_b = ldb.field_o;
            }
            return;
          }
          var4 = 0;
        }
        if (ssa.b(2) &&
          si.field_o[82]) {
          var4 = 1;
        }
        if (!ssa.b(2)) {
          var5Lifetime1 = hob.a(new Random(), 2147483647, 117);
          if (param0) {
            var4 = 3;
            qqa.a(true, (byte) -41);
          }
          vqa.field_g = new uca(false, var3, 0, false, var4, var5Lifetime1, param0);
          mjb.field_e = param1;
          di.field_l.a(false, -13027);
          var6Lifetime1 = mnb.field_d ? 1 : 0;
          stackIn_52_0 = (bqa.a(false)) ? 7 : 0;
          lha.a(stackIn_52_0, var6Lifetime1 != 0, (byte) -85, -1);
        } else {
          if (!si.field_o[86]) {
            var5Lifetime1 = hob.a(new Random(), 2147483647, 117);
            if (param0) {
              var4 = 3;
              qqa.a(true, (byte) -41);
            }
            vqa.field_g = new uca(false, var3, 0, false, var4, var5Lifetime1, param0);
            mjb.field_e = param1;
            di.field_l.a(false, -13027);
            var6Lifetime1 = mnb.field_d ? 1 : 0;
            stackIn_77_0 = (bqa.a(false)) ? 7 : 0;
            lha.a(stackIn_77_0, var6Lifetime1 != 0, (byte) -85, -1);
          } else {
            param0 = true;
            var5Lifetime1 = hob.a(new Random(), 2147483647, 117);
            if (param0) {
              var4 = 3;
              qqa.a(true, (byte) -41);
            }
            vqa.field_g = new uca(false, var3, 0, false, var4, var5Lifetime1, param0);
            mjb.field_e = param1;
            di.field_l.a(false, -13027);
            var6Lifetime1 = mnb.field_d ? 1 : 0;
            stackIn_65_0 = (bqa.a(false)) ? 7 : 0;
            lha.a(stackIn_65_0, var6Lifetime1 != 0, (byte) -85, -1);
          }
        }
        dua.field_o = false;
        aka.field_p = false;
        bg.field_o = true;
        idb.field_o = true;
        if (wh.g(-120)) {
          dpa.field_p.h(24335, 71);
          vga.field_b = ldb.field_o;
        }
    }

    final void d(int param0) {
        oj var2 = null;
        oj var3 = null;
        if (0 == this.field_d.t((byte) 9)) {
          var2 = this.field_d.p(0);
          this.field_d.g(1, -90);
          var3 = this.field_d.H((byte) 82);
          var3.a(var2, 16383);
          var3.b(-3286, 0.125f, 0.125f, 1.0f);
          var3.a(this.field_f, 0.0f, 0.0f, (byte) 13);
          this.field_d.a(wda.field_o, true);
          this.field_d.g(0, -52);
        }
        if (param0 == 8) {
          return;
        }
        ura var4 = (ura) null;
        this.a((byte) -37, 101, (ura) null);
    }

    final void a(byte param0, int param1, ura param2) {
        try {
          this.field_d.a(param2, -124);
          if (param0 <= 42) {
            field_h = (phb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wu.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "<%0> has entered another game.";
    }
}
