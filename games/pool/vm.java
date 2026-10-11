/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vm {
    static String field_n;
    private float field_j;
    static String field_b;
    static int field_f;
    static String field_m;
    private float field_a;
    private hm field_e;
    private float field_i;
    private float field_o;
    private int[][] field_k;
    private float field_c;
    private int field_l;
    static dd[] field_d;
    private so field_h;
    static String field_g;

    final void a(vf param0, int param1) {
        int var5 = 0;
        float stackIn_20_1 = 0.0f;
        float stackIn_21_2 = 0.0f;
        float stackIn_23_1 = 0.0f;
        float stackIn_24_2 = 0.0f;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        int var4 = 0;
        hm var4_ref_hm = null;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        var6 = Pool.field_O;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_float = this.field_j * this.field_j + this.field_o * this.field_o;
          if (!(10000000.0f < var3_float)) {
            if (0.0f != this.field_i ||
              this.field_a != 0.0f) {
              this.field_j = this.field_j + this.field_i;
              this.field_o = this.field_o + this.field_a;
              for (var4 = 0; var4 < this.field_h.field_b.length; var4++) {
                this.field_h.field_b[var4].field_d[0] = (int)(this.field_j + (float)this.field_k[var4][0]);
                this.field_h.field_b[var4].field_d[1] = (int)((float)this.field_k[var4][1] + this.field_o);
              }
            }
            if (this.field_c != 0.0f) {
              var4_ref_hm = new hm();
              var4_ref_hm.a(66, 0, 0, 1, (int)this.field_c);
              this.field_e.a(param1 ^ 9, var4_ref_hm);
              this.field_e.a(ek.field_b, -96);
              for (var5 = 0; var5 < this.field_h.field_b.length; var5++) {
                this.field_h.field_b[var5].field_d[3] = ek.field_b[3];
                this.field_h.field_b[var5].field_d[4] = ek.field_b[4];
                this.field_h.field_b[var5].field_d[5] = ek.field_b[5];
                this.field_h.field_b[var5].field_d[6] = ek.field_b[6];
                this.field_h.field_b[var5].field_d[7] = ek.field_b[7];
                this.field_h.field_b[var5].field_d[8] = ek.field_b[8];
                this.field_h.field_b[var5].field_d[9] = ek.field_b[9];
                this.field_h.field_b[var5].field_d[10] = ek.field_b[10];
                this.field_h.field_b[var5].field_d[11] = ek.field_b[11];
              }
            }
            if (0.0f == this.field_i &&
              this.field_a == 0.0f &&
              this.field_c == 0.0f) {
              if ((0 == ga.a(1500, true, ea.field_r))) {
                stackIn_20_1 = this.field_i;
                if (this.field_k[0][0] <= 0) {
                  stackIn_21_2 = (float)(-ga.a(256, true, ea.field_r)) / 256.0f;
                } else {
                  stackIn_21_2 = (float)ga.a(256, true, ea.field_r) / 256.0f;
                }
                this.field_i = stackIn_20_1 + stackIn_21_2;
                stackIn_23_1 = this.field_a;
                if (0 < this.field_k[0][1]) {
                  stackIn_24_2 = (float)ga.a(256, true, ea.field_r) / 256.0f;
                } else {
                  stackIn_24_2 = (float)(-ga.a(256, true, ea.field_r)) / 256.0f;
                }
                this.field_a = stackIn_23_1 + stackIn_24_2;
                this.field_c = this.field_c + ((float)ga.a(256, true, ea.field_r) / 32.0f - 0.5f);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_h.a(param0.field_q, param0.field_e, param0.field_F, (byte) -88, param0.field_u, param0.field_C);
              this.field_i = (float)((double)this.field_i * 0.99);
              this.field_a = (float)((double)this.field_a * 0.99);
              this.field_c = (float)((double)this.field_c * 0.99);
              if (this.field_i > 0.0f &&
                0.001 > (double)this.field_i) {
                this.field_i = 0.0f;
              }
              if (this.field_a > 0.0f &&
                0.001 > (double)this.field_a) {
                this.field_a = 0.0f;
              }
              if (this.field_i < 0.0f &&
                -0.001 < (double)this.field_i) {
                this.field_i = 0.0f;
              }
              if (0.0f > this.field_a &&
                (double)this.field_a > -0.001) {
                this.field_a = 0.0f;
              }
              if (0.0f < this.field_c &&
                (double)this.field_c < 0.001) {
                this.field_c = 0.0f;
              }
              if (this.field_c < 0.0f &&
                -0.001 < (double)this.field_c) {
                this.field_c = 0.0f;
              }
            }
          } else {
            this.field_i = 0.0f;
            this.field_c = 0.0f;
            this.field_a = 0.0f;
          }
          var7 = 0;
          var4Lifetime1 = var7;
          while (this.field_h.field_b.length > var7) {
            this.field_h.field_b[var7].field_d[2] = this.field_k[var7][2] + (o.a(ci.field_f * this.field_l, (byte) 82) >> 13);
            var7++;
          }
          if (param1 != 10) {
            this.a(-110);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_55_0 = var3;
          stackIn_55_1 = new StringBuilder().append("vm.A(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int[] var5;
        int var7;
        int[] var8;
        int[] var10;
        int[] var13;
        var7 = Pool.field_O;
        var2 = -82 % ((param0 - 62) / 60);
        for (var3 = 0; this.field_h.field_b.length > var3; var3++) {
          var10 = this.field_h.field_b[var3].field_d;
          var8 = var10;
          var5 = var8;
          var13 = this.field_k[var3];
          for (var4 = 0; var4 < var10.length; var4++) {
            if (var4 < var13.length) {
              var5[var4] = var13[var4];
              continue;
            }
            break;
          }
          if (var4 < 4) {
            var10[4] = 0;
          }
          if (var4 < 9) {
            var10[9] = 0;
          }
          if (var4 < 10) {
            var10[10] = 0;
          }
          if (var4 < 3) {
            var10[3] = 65536;
          }
          if (var4 < 11) {
            var10[11] = 65536;
          }
          if (var4 < 7) {
            var10[7] = 65536;
          }
          if (var4 < 6) {
            var10[6] = 0;
          }
          if (8 > var4) {
            var10[8] = 0;
          }
          if (var4 < 5) {
            var10[5] = 0;
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        field_n = null;
        if (param0) {
          field_g = (String) null;
        }
        field_m = null;
    }

    vm(so param0) {
        int var2_int = 0;
        try {
          this.field_h = param0;
          this.field_e = new hm();
          this.field_k = new int[param0.field_b.length][];
          for (var2_int = 0; param0.field_b.length > var2_int; var2_int++) {
            this.field_k[var2_int] = new int[]{param0.field_b[var2_int].field_d[0], param0.field_b[var2_int].field_d[1], param0.field_b[var2_int].field_d[2]};
          }
          this.field_l = 32 + ga.a(32, true, ea.field_r);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "vm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "<%0> secs";
        field_n = "You must play <%1> more rated games before playing with the current options.";
        field_f = 0;
        field_m = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_g = null;
    }
}
