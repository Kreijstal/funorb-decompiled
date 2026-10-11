/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hk extends fb {
    private int field_I;
    static vo field_F;
    static vn field_H;
    private int field_O;
    private boolean field_D;
    private int field_E;
    private boolean field_K;
    private boolean field_M;
    private int field_N;
    private int field_G;
    static String field_P;
    static String[] field_J;

    final void g(int param0) {
        le var2;
        int var3;
        int var4;
        int var5;
        wk var6;
        var5 = ZombieDawn.field_J;
        if (param0 < 95) {
          var6 = (wk) null;
          this.a((byte) -28, (wk) null);
        }
        int fieldTemp$0 = this.field_N;
        this.field_N = this.field_N - 1;
        if (fieldTemp$0 < 0 &&
          !this.field_D) {
          this.field_D = true;
          if (!this.field_K) {
            kh.a(7, false);
          } else {
            kh.a(6, false);
          }
        }
        this.field_O = this.field_O + this.field_I;
        if (fp.field_H >= this.field_O) {
          if (ac.field_t <= this.field_O) {
            var2 = dj.field_e.field_R.b((byte) 26);
            while (var2 instanceof fb) {
              if (var2 instanceof kd) {
                var3 = ((kd) (var2)).a(true);
                var4 = ((kd) (var2)).f(237239984);
                if (5 + this.field_E > var4 &&
                  -50 + this.field_E < var4 && (this.field_M &&
                  var3 > this.field_O &&
                  120 + this.field_O > var3 ||
                  !this.field_M &&
                  this.field_O > var3 &&
                  -120 + this.field_O < var3)) {
                  ((kd) (var2)).z(0);
                  ((kd) (var2)).q((byte) -108);
                  ((kd) (var2)).field_Gb = this.field_I * 7 >> 2;
                }
              }
              var2 = var2.field_b;
            }
          } else {
            this.b(-27598);
          }
        } else {
          this.b(-27598);
        }
    }

    hk() {
        super(0, 0, 0);
        int stackIn_3_0 = 0;
        boolean stackIn_6_1 = false;
        int stackIn_12_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        boolean stackIn_31_1 = false;
        int var1;
        Object stackIn_29_0Lifetime1;
        stackIn_3_0 = (pb.a(so.field_a, 2, 1) != 1) ? 0 : 1;
        var1 = stackIn_3_0;
        stackIn_6_1 = (pb.a(so.field_a, 2, 1) == 1);
        this.field_M = stackIn_6_1;
        if (pb.a(so.field_a, 15, 1) == 1) {
          this.field_G = 7 + pb.a(so.field_a, 2, 1);
        } else {
          this.field_G = pb.a(so.field_a, 7, 1);
        }
        if (var1 == 0) {
          stackIn_12_1 = 6;
        } else {
          stackIn_12_1 = 10;
        }
        this.field_I = stackIn_12_1;
        if (this.field_M) {
          this.field_I = -this.field_I;
          this.field_O = fp.field_H;
        } else {
          this.field_O = ac.field_t;
        }
        this.field_E = 0;
        if (var1 == 0 &&
          this.field_M) {
          this.field_E = 0;
        }
        if (var1 != 0 &&
          this.field_M) {
          this.field_E = 1;
        }
        if (var1 != 0 &&
          !this.field_M) {
          this.field_E = 2;
        }
        if (var1 == 0 &&
          !this.field_M) {
          this.field_E = 3;
        }
        boolean decompiledFrameRemainder0 = true;
        this.field_E = this.field_E * 72;
        this.field_E = this.field_E + 254;
        this.field_y = this.field_O << 16;
        this.field_t = this.field_G;
        this.field_x = this.field_E << 16;
        stackIn_29_0 = this;
        if (this.field_G != 7) {
          stackIn_30_0 = this;
          stackIn_29_0Lifetime1 = stackIn_30_0;
          if (this.field_G != 1) {
            stackIn_31_1 = false;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_31_1 = true;
        }
        this.field_K = stackIn_31_1;
        if (var1 == 0) {
          if (this.field_K) {
            kh.a(5, false);
          } else {
            kh.a(4, false);
          }
        } else {
          if (!this.field_K) {
            kh.a(1, false);
          } else {
            kh.a(3, false);
          }
        }
        this.field_D = false;
        if (pb.a(so.field_a, 5, 1) != 0) {
          this.field_N = 2147483647;
        } else {
          this.field_N = pb.a(so.field_a, 100, 1);
        }
    }

    final void a(byte param0, wk param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var12 = ZombieDawn.field_J;
        try {
          var3_int = param1.a(this.field_O, (byte) -75);
          var4 = param1.a(this.field_E, 0);
          if (param0 > -76) {
            field_J = (String[]) null;
          }
          var5 = -12 + tm.field_l[this.field_G] * 24;
          var6 = 24 * tm.field_i[this.field_G];
          if (this.field_M) {
            jc.field_t[0].b(var3_int - 280, -60 + (-tm.field_k[this.field_G] + var4), 128);
            jc.field_t[1].b(-280 + var3_int, var4 - tm.field_k[this.field_G], 128);
            for (var7 = 0; tm.field_i[this.field_G] > var7; var7++) {
              var13 = 0;
              var8 = var13;
              while (tm.field_l[this.field_G] > var13) {
                tm.field_h[8 * var13 + (tm.field_n[this.field_G] + var7)].b(var3_int + var7 * 24, var13 * 24 + var4 - var5);
                var13++;
              }
            }
            return;
          }
          jc.field_t[2].b(var3_int - 20, -60 + (-tm.field_k[this.field_G] + var4), 128);
          jc.field_t[3].b(var3_int - 20, -tm.field_k[this.field_G] + var4, 128);
          for (var7Lifetime1 = 0; var7Lifetime1 < tm.field_i[this.field_G]; var7Lifetime1++) {
            for (var8Lifetime1 = 0; var8Lifetime1 < tm.field_l[this.field_G]; var8Lifetime1++) {
              var9 = tm.field_n[this.field_G];
              var10 = tm.field_i[this.field_G];
              var11 = 8 * var8Lifetime1 - var7Lifetime1 + (var10 + (var9 - 1));
              tm.field_h[var11].c(-var6 + (var3_int + 24 * var7Lifetime1), var4 - (var5 - 24 * var8Lifetime1));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("hk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        va[] var10 = null;
        va[] var7 = null;
        int var8 = 0;
        int var9 = ZombieDawn.field_J;
        try {
          var10 = new va[pa.field_x.length + 1];
          var7 = var10;
          for (var8 = 0; pa.field_x.length > var8; var8++) {
            var10[var8] = pa.field_x[var8];
          }
          if (param1 != -23) {
            hk.b(false);
          }
          var7[var7.length - 1] = new va(param6, param0, param4, param2, param3, param5);
          pa.field_x = var7;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hk.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          field_P = (String) null;
        }
        field_P = null;
        field_J = null;
        field_H = null;
        field_F = null;
    }

    final static void i(int param0) {
        uf var1 = (uf) (ad.field_h.a(param0 - 1584));
        if (var1 == null) {
          var1 = new uf();
        }
        var1.a(bi.field_l, (byte) -29, bi.field_f, bi.field_b, bi.field_d, bi.field_c, bi.field_g, bi.field_a);
        rm.field_d.a(param0 ^ param0, var1);
    }

    static {
        field_F = new vo();
        field_J = new String[]{"Legless", "Mostly Armless", "Braaaains", "American Consumer", "Undead End", "Re-Animator", "Bullet Catcher", "Soul Collector", "Plague Spreader", "Generation Z", "Assault on Precinct 15", "The Stench of Corruption", "Pumpkin Eater", "No Heart, No Foul", "There and Back Again", "My Feet are Killing Me", "Stamp Collecting", "The Blanks of Their Eyes", "Into the Barn", "I Know a Shortcut", "Fat Alien", "Alien Revenge", "Running Zombie", "Insider Information", "Long Live the Queen", "Zombie Plane", "Zombie Pigs", "Zombie Helix", "Zombie Throne", "London Calling", "In Through the Back Door", "They're Hiding Under the Stairs"};
        field_P = "Create a free Account";
    }
}
