/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ina extends bi {
    private boolean field_k;
    private Sprite field_l;
    static String field_r;
    private String field_m;
    static int[] field_o;
    static String field_s;
    private int field_t;
    private Sprite[] field_q;
    static UiComponent field_n;
    private int field_p;

    final void j(int param0) {
        this.field_q = null;
        super.j(param0);
    }

    private final boolean f(int param0, int param1) {
        if (param1 < 71) {
          return true;
        }
        if (!this.field_k) {
          if (this.b(param0, true)) {
            return true;
          }
          if (MoveInfoPanel.a((byte) -24) &&
            bia.field_f[param0]) {
            return false;
          }
          return !hp.a(param0, (byte) -99, lv.field_l) ? true : false;
        }
        return hp.a(param0, (byte) -102, nga.field_i);
    }

    public static void releaseStatics(byte param0) {
        field_n = null;
        if (param0 >= -70) {
          return;
        }
        field_o = null;
        field_s = null;
        field_r = null;
    }

    final int a(int param0, int param1) {
        int var3 = -41 % ((param0 + 64) / 38);
        return 40;
    }

    final void l(int param0) {
        this.i(-12988);
        InsanoSauceEvent.a(rc.field_k, 40, 16760896, true, 320, false);
        SoftwareRasterizer.a(40, 60, 342, 335, 20, 0, 80);
        SoftwareRasterizer.a(390, 60, 210, 335, 20, 0, 80);
        SoftwareRasterizer.a(399, 69, 192, 136, 11, 0, 80);
        this.e(true);
        this.p(param0 - 2);
        this.c(true);
        fn.field_n.drawParagraph(kw.field_m, 89, 340, 250, 100, 10, -1, 1, 0, 12);
        if (param0 != 9) {
          this.field_m = (String) null;
        }
    }

    private final Sprite g(int param0, int param1) {
        if (this.b(param1, true)) {
          return og.field_a[param1];
        }
        if (param0 < 95) {
          return (Sprite) null;
        }
        return ona.field_yb;
    }

    final Sprite b(int param0, byte param1) {
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param1 <= 62) {
          return (Sprite) null;
        }
        var3 = param0;
        if (var3 == 0) {
          return FoodShopPanel.field_g;
        }
        if (var3 != 1) {
          throw new IllegalStateException();
        }
        return BattleScreen.field_F;
    }

    private final void e(boolean param0) {
        int stackIn_10_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var8Lifetime1;
        var9 = BachelorFridge.field_y;
        var2 = this.e((byte) 126);
        var3 = -1;
        var4 = 0;
        var5 = -1;
        var6 = -1;
        if (!param0) {
          this.e(false);
        }
        var7 = 0;
        while (var2 > 0) {
          if (var3 == -1 ||
            var4 == 8) {
            var4 = 0;
            var3++;
            stackIn_10_0 = (var2 < 8) ? var2 : 8;
            var8 = stackIn_10_0;
            var5 = 51 + (8 - var8 >> 1) * 40;
            var6 = 71 + 44 * var3;
          }
          if (this.f(var7, 78)) {
            var8Lifetime1 = 0;
            if (var7 == this.field_t) {
              var8Lifetime1 = 96 + (via.a(vr.field_b << 6, (byte) 103) >> 11);
            } else {
              if (var7 == this.field_p) {
                var8Lifetime1 = (via.a(vr.field_b << 6, (byte) 83) >> 12) + 32;
              }
            }
            if (0 != var8Lifetime1) {
              this.e(18958, var7).drawAdditive(var5 + 4, var6 + 4, var8Lifetime1);
            }
            this.g(97, var7).drawQuarterSize(var5 + 4, var6 + 4);
            var5 += 40;
            var4++;
            var2--;
          }
          var7++;
        }
    }

    final int a(int param0, boolean param1) {
        int var3;
        if (!param1) {
          this.field_t = 105;
        }
        var3 = param0;
        if (var3 == 0) {
          return 260;
        }
        if (var3 != 1) {
          throw new IllegalArgumentException();
        }
        return 475;
    }

    final void a(boolean param0, int param1) {
        super.a(param0, param1);
        this.field_p = -1;
        this.field_t = -1;
        this.field_q = new Sprite[rm.field_a];
    }

    final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param1 != 40) {
          this.field_t = -3;
        }
        var3 = param0;
        if (var3 == 0) {
          return 450;
        }
        if (1 != var3) {
          throw new IllegalArgumentException();
        }
        return 600;
    }

    private final void p(int param0) {
        int stackIn_3_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        Sprite var8;
        AntialiasedBitmapFont var9;
        int var10_int;
        String var10;
        int var11;
        int var12;
        var12 = BachelorFridge.field_y;
        if (this.field_t == -1) {
          stackIn_3_0 = this.field_p;
        } else {
          stackIn_3_0 = this.field_t;
        }
        var2 = stackIn_3_0;
        if (var2 == -1) {
          return;
        }
        var3 = 41;
        var4 = var3 + 390;
        var5 = 73;
        this.g(125, var2).draw(var4, var5);
        var6 = EventEffect.field_g[var2];
        var7 = DiveBomberAnimation.field_y[var2];
        var8 = this.a(872364388, var6);
        var8.a((210 - var8.field_n >> 1) + 390, -(var8.field_o >> 1) + 235, 160);
        if (this.b(var2, true)) {
          fn.field_n.a(DualLinkNode.field_g, 495, 265, 10, -1);
        } else {
          fn.field_n.a(ed.field_e, 495, 265, 10, -1);
        }
        var9 = wt.field_k;
        ((BitmapFont) ((Object) var9)).drawParagraph(var7, 400, 275, 190, 100, 16777215, -1, 3, 0, ((BitmapFont) ((Object) var9)).field_u);
        var10_int = 0;
        if (param0 != 7) {
          this.c(8, -78);
        }
        var11 = 405;
        while (on.field_u[var2] > var10_int) {
          SleepSpecial.field_p.draw(var11, 330);
          var11 += 20;
          var10_int++;
        }
        var10 = vl.field_a + Integer.toString(vi.field_d[var2]);
        jha.field_g.drawText(var10, 405, 380, 16777215, -1);
        return;
    }

    private final int a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int stackIn_10_0 = 0;
        var11 = BachelorFridge.field_y;
        var4 = this.e((byte) 125);
        var5 = -1;
        if (param0 > -114) {
          return 93;
        }
        var6 = 0;
        var7 = -1;
        var8 = -1;
        var9 = 0;
        while (var4 > 0) {
          if (var5 == -1 ||
            8 == var6) {
            var6 = 0;
            var5++;
            stackIn_10_0 = (8 > var4) ? var4 : 8;
            var10 = stackIn_10_0;
            var7 = (-var10 + 8 >> 1) * 40 + 51;
            var8 = var5 * 44 + 71;
          }
          if (this.f(var9, 110)) {
            if (param1 >= var7 &&
              param2 >= var8 &&
              40 + var7 > param1 &&
              param2 < 44 + var8) {
              return var9;
            }
            var4--;
            var7 += 40;
            var6++;
          }
          var9++;
        }
        return -1;
    }

    final int a(int param0, byte param1) {
        if (param1 >= -38) {
          this.a(113, (byte) -5);
        }
        return 418;
    }

    private final Sprite e(int param0, int param1) {
        int[] var6 = null;
        int[] var3 = null;
        int var4_int = 0;
        Sprite var4 = null;
        int var5 = BachelorFridge.field_y;
        if (null == this.field_q[param1]) {
          var6 = new int[256];
          var3 = var6;
          for (var4_int = 0; var4_int < 256; var4_int++) {
            var6[var4_int] = MassPoisonSpecial.a(var4_int << 7, dda.a(4128768, var4_int << 14));
          }
          var4 = new Sprite(32, 32);
          bu.a(param0 ^ 18958, var4);
          this.g(121, param1).drawQuarterSize(0, 0);
          db.b(109);
          this.field_q[param1] = SlowAllSpecial.a(var4, var3, false, 255, 91, 8);
        }
        if (param0 != 18958) {
          this.field_q = (Sprite[]) null;
        }
        return this.field_q[param1];
    }

    private final boolean b(int param0, boolean param1) {
        if (!param1) {
          this.l(-29);
        }
        return hp.a(param0, (byte) -121, ZombiesSpecial.field_q);
    }

    final void e(int param0) {
        int var2;
        this.field_p = this.a((byte) -117, mk.field_p, gd.field_m);
        if (1 == lf.field_c) {
          ol.a(AirstrikeSpecial.field_r[0], true);
          var2 = this.a((byte) -123, nfa.field_a, jc.field_r);
          if (this.field_t == var2) {
            this.field_t = -1;
          } else {
            if (var2 != -1) {
              this.field_t = var2;
            }
          }
        }
        super.e(param0);
    }

    private final Sprite a(int param0, String param1) {
        Sprite stackIn_3_0 = null;
        Sprite stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        BinaryBitmapFont var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Sprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        var9 = BachelorFridge.field_y;
        try {
          if (param0 != 872364388) {
            stackIn_3_0 = (Sprite) null;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_m)) {
            var3 = jha.field_g;
            var4 = ((BitmapFont) ((Object) var3)).a(param1);
            var5 = 30 + var4;
            var6 = ((BitmapFont) ((Object) var3)).field_u << 1;
            var7 = new Sprite(var5, var6);
            bu.a(0, var7);
            hp.a(var5, 0, (byte) 108, var6, de.field_A, 0);
            for (var8 = 0; var7.field_v.length > var8; var8++) {
              if (0 != var7.field_v[var8]) {
                var7.field_v[var8] = MassPoisonSpecial.a(var7.field_v[var8], -16777216);
              }
            }
            this.field_l = (Sprite) ((Object) new ArgbSprite(var5 << 1, var6 << 1));
            this.field_l.b();
            var8Lifetime1 = DiveBomberAnimation.a(768, m.field_a, -2147483648) - 384;
            MassPoisonEvent.a(false, var6 << 3, var5 << 4, 4096, 4096, var6 << 4, var5 << 3, var8Lifetime1, var7);
            ((BitmapFont) ((Object) var3)).a(param1, var5, (9 * var6 >> 3) - 2, -16711423, -1);
            db.b(104);
            this.field_l.trimTransparentBorders();
            this.field_m = param1;
          }
          stackIn_13_0 = this.field_l;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ina.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final int e(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 < 108) {
          return 72;
        }
        for (var3 = 0; var3 < rm.field_a; var3++) {
          if (this.f(var3, 94)) {
            var2++;
          }
        }
        return var2;
    }

    final boolean c(int param0, int param1) {
        if (!AttackUpAllAnimation.e(-29919)) {
          return param0 != 0 ? true : false;
        }
        if (param1 != 19950) {
          return true;
        }
        return true;
    }

    ina(boolean param0) {
        super(param0 ? 8 : 7);
        this.field_k = param0 ? true : false;
    }

    static {
        field_o = new int[]{55, 75, 75, 55, 65, 75};
        field_s = "Back";
        field_r = null;
    }
}
