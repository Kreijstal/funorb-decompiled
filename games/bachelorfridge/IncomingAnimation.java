/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IncomingAnimation extends EventAnimation {
    private int field_C;
    private taa field_y;
    private qn field_x;
    static MusicTrack field_z;
    private Sprite field_D;
    private ws field_w;
    static IndexedSprite[] field_v;
    private int field_B;
    private IncomingEvent field_E;
    private int field_A;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, String param7, int param8) {
        try {
          ur.field_e[pe.field_m] = (oha) ((Object) new a(param1, param4, param0, param6, param7, param3, param5, param8));
          if (param2 != 12635) {
            IncomingAnimation.f(-58);
          }
          pe.field_m = pe.field_m + 1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    IncomingAnimation(gj param0, IncomingEvent param1) {
        super(param0, param1);
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        try {
          this.field_E = param1;
          this.field_w = dba.field_a;
          this.field_l = 75;
          this.field_D = de.field_F.toRgbSprite();
          var3_int = this.screen.field_h.width;
          var4 = this.screen.field_h.height;
          var5 = DiveBomberAnimation.a(4, m.field_a, -2147483648);
          if (var5 != 0) {
            if (var5 != 1) {
              if (var5 == 2) {
                this.field_B = var3_int + 3;
                this.field_C = -3 + DiveBomberAnimation.a(6 + var4 - 2, m.field_a, -2147483648) + 1;
              } else {
                this.field_B = DiveBomberAnimation.a(4 + var3_int, m.field_a, -2147483648) - 3 + 1;
                this.field_C = -3;
              }
            } else {
              this.field_B = DiveBomberAnimation.a(5 + var3_int, m.field_a, -2147483648) - 2;
              this.field_C = 3 + var4;
            }
          } else {
            this.field_B = -3;
            this.field_C = DiveBomberAnimation.a(-1 + var4 + 6, m.field_a, -2147483648) - 3;
          }
          this.field_y = this.field_m;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pm.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        if (this.field_y.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_w == dba.field_a) {
          this.field_x = new qn(this.screen, this.field_E.field_s, this.field_E.field_r);
          this.field_x.a(0);
          this.field_y = new taa(this.screen, this.field_E.field_s, this.field_E.field_r);
          this.a(27799, this.field_y);
          this.field_w = bia.field_i;
          return false;
        }
        if (bia.field_i == this.field_w) {
          this.field_y = new taa(this.screen, this.field_B, this.field_C);
          this.field_y.field_p = false;
          this.a(27799, this.field_y);
          this.field_w = hba.field_x;
          return false;
        }
        if (this.field_l == 65 &&
          hba.field_x == this.field_w) {
          MartyrAnimation.a(30, (byte) 127);
        }
        fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 <= fieldTemp$0) {
          return false;
        }
        if (hba.field_x == this.field_w) {
          this.field_y = new taa(this.screen, this.field_E.field_s, this.field_E.field_r);
          this.a(27799, this.field_y);
          this.field_l = 30;
          this.field_w = lw.field_g;
          return false;
        }
        if (lw.field_g == this.field_w) {
          this.field_x.c(-26450);
          this.field_w = SplitAnimation.field_w;
          jja.a(256, -1, 29);
        }
        if (ov.field_e.length <= this.field_A) {
          this.d(-73);
          return true;
        }
        fieldTemp$1 = this.field_A;
        this.field_A = this.field_A + 1;
        this.a(fieldTemp$1, true);
        this.field_l = this.field_l + 30;
        var2 = 89 % ((param0 - 71) / 47);
        return false;
    }

    public static void e(int param0) {
        if (param0 >= -25) {
          return;
        }
        field_v = null;
        field_z = null;
    }

    private final void d(int param0) {
        this.field_E.a(this.screen.field_h, false);
        if (param0 >= -22) {
          String var3 = (String) null;
          IncomingAnimation.a(20, 100, 70, 26, 13, -84, (String) null, (String) null, -119);
        }
    }

    private final void a(int param0, boolean param1) {
        int var8 = 0;
        int var9 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_1 = 0;
        int var4;
        int var5;
        ad var6;
        int var7;
        int var10;
        int var11;
        int var12;
        Object var13;
        int var14;
        BattleState var15;
        var14 = BachelorFridge.field_y;
        var15 = this.screen.field_h;
        var4 = var15.width;
        if (!param1) {
          this.field_D = (Sprite) null;
        }
        var5 = var15.height;
        var6 = this.field_E.creature.a(-27449, this.screen);
        var7 = vn.field_M[param0];
        for (var8 = -3; var8 <= 3; var8++) {
          for (var9 = -3; var9 <= 3; var9++) {
            var10 = this.field_E.field_t + var8;
            var11 = this.field_E.field_q + var9;
            if (0 <= var10 &&
              var4 > var10 &&
              0 <= var11 &&
              var5 > var11) {
              if (var9 < 0) {
                stackIn_21_0 = -var9;
              } else {
                stackIn_21_0 = var9;
              }
              if (var8 >= 0) {
                stackIn_24_1 = var8;
              } else {
                stackIn_24_1 = -var8;
              }
              var12 = stackIn_21_0 + stackIn_24_1;
              if (param0 == var12) {
                if (var12 != 0) {
                  var13 = new uea(this.screen, var10, var11, var7);
                } else {
                  var13 = new dw(this.screen, var10, var11);
                }
                ((kj) (var13)).a(0);
                this.a(var10, var11, var6, 0);
              }
            }
          }
        }
    }

    final void c(int param0) {
        aj var7 = null;
        aj var5 = null;
        aj var6 = null;
        int var2 = 0;
        int var4 = BachelorFridge.field_y;
        if (param0 > -10) {
          this.field_C = 66;
        }
        if (bia.field_i == this.field_w) {
          var5 = this.screen.field_s.a(this.field_C, (byte) -117, this.field_B);
          this.field_D.drawVerticalFlip(var5.field_c, var5.field_a);
        } else {
          if (hba.field_x == this.field_w) {
            var6 = this.screen.field_s.a(this.field_C, (byte) 80, this.field_B);
            var2 = (-this.field_l + 75) * (-this.field_l + 75) * 400 / 5625;
            this.field_D.drawVerticalFlip(var6.field_c, var6.field_a - var2);
          } else {
            if (lw.field_g == this.field_w) {
              var7 = this.screen.field_s.a(this.field_E.field_q, (byte) -126, this.field_E.field_t);
              var2 = this.field_l * 400 / 30;
              this.field_D.draw(var7.field_c, var7.field_a - (var2 + this.field_D.field_o) + 60);
            }
          }
        }
    }

    final static void f(int param0) {
        int var1 = (FullscreenFocusCanvas.field_b - 640) / 2;
        int var2 = saa.field_b * saa.field_b;
        int var3 = var2 - lfa.field_q * lfa.field_q;
        ng.field_e.a(-94 + (-120 + SoftwareRasterizer.field_c), param0 ^ 31336, 199, -(param0 * var3 / var2) + var1, 90);
        FullHealSpecial.field_r.a(-4 + (SoftwareRasterizer.field_c - 120), 31407, 438, 438 * var3 / var2 + 202 + var1, 0);
    }

    static {
    }
}
