/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    private boolean field_r;
    private int field_b;
    static int field_e;
    private int field_a;
    static boolean[] field_m;
    private int field_t;
    static int field_q;
    static bd field_l;
    private int field_v;
    private boolean[][] field_n;
    private int[][] field_h;
    static int field_s;
    private int field_i;
    static int field_u;
    private int[][] field_o;
    static String field_x;
    private int field_p;
    static int field_k;
    private int[][] field_w;
    static bd field_g;
    private int field_f;
    static String field_c;
    private boolean[][] field_d;
    private int field_j;

    private final byte[] c(int param0) {
        int var6 = 0;
        int var2 = 0;
        int var3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        int var4 = param0;
        byte[] var5 = new byte[60000];
        for (var6 = 0; var6 < 10000; var6++) {
          var2 = var6 % 100;
          var3 = var6 / 100;
          incrementValue$0 = var4;
          var4++;
          var5[incrementValue$0] = (byte)(this.field_o[var2][var3] % 64);
          incrementValue$1 = var4;
          var4++;
          var5[incrementValue$1] = (byte)(this.field_o[var2][var3] / 64);
          incrementValue$2 = var4;
          var4++;
          var5[incrementValue$2] = (byte)(!this.field_n[var2][var3] ? 0 : 1);
          incrementValue$3 = var4;
          var4++;
          var5[incrementValue$3] = (byte)(this.field_h[var2][var3] + 5);
          incrementValue$4 = var4;
          var4++;
          var5[incrementValue$4] = (byte)this.field_w[var2][var3];
          incrementValue$5 = var4;
          var4++;
          var5[incrementValue$5] = (byte)(!this.field_d[var2][var3] ? 0 : 1);
        }
        return var5;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var2Lifetime6Lifetime1;
        int var3Lifetime6Lifetime1;
        var9 = HostileSpawn.field_I ? 1 : 0;
        var4 = 1;
        var5 = 1;
        if (0 == this.field_i) {
          var4 = 1;
          var5 = 1;
        }
        if (this.field_i == 1) {
          var5 = 2;
          var4 = 2;
        }
        if (this.field_i == 2) {
          var5 = 2;
          var4 = 3;
        }
        if (3 == this.field_i) {
          var5 = 3;
          var4 = 3;
        }
        if (this.field_i == 4) {
          var5 = 4;
          var4 = 4;
        }
        if (param0 != -99) {
          this.b((byte) 53);
        }
        if (5 == this.field_i) {
          var4 = 5;
          var5 = 5;
        }
        if (0 <= this.field_a) {
          for (var6 = 0; 100 > var6; var6++) {
            for (var7 = 0; 100 > var7; var7++) {
              var2 = 16 * var6 - this.field_t;
              var3 = 16 * var7 - this.field_f;
              pk.field_d[this.field_o[var6][var7] % 320].e(var2, var3);
              if (0 == this.field_a &&
                this.field_w[var6][var7] == 0 ||
                this.field_w[var6][var7] == 3 &&
                this.field_n[var6][var7]) {
                si.c(var2, var3, 16, 16, 0);
              }
            }
          }
        }
        for (var6Lifetime1 = 0; var6Lifetime1 < 100; var6Lifetime1++) {
          for (var7Lifetime1 = 0; 100 > var7Lifetime1; var7Lifetime1++) {
            var2Lifetime1 = (int)((double)(var6Lifetime1 * 16 - this.field_t) + Math.random() * 3.0 - 1.0);
            var3Lifetime1 = (int)((double)(-this.field_f + 16 * var7Lifetime1) + Math.random() * 3.0 - 1.0);
            var8 = -1;
            if (this.field_h[var6Lifetime1][var7Lifetime1] >= 1 &&
              this.field_h[var6Lifetime1][var7Lifetime1] <= 6) {
              var8 = -1 + (this.field_h[var6Lifetime1][var7Lifetime1] + 128);
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 7) {
              var8 = 134;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 8) {
              var8 = 135;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 9) {
              var8 = 142;
            }
            if (10 == this.field_h[var6Lifetime1][var7Lifetime1]) {
              var8 = 143;
            }
            if (13 == this.field_h[var6Lifetime1][var7Lifetime1]) {
              var8 = 121;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 14) {
              var8 = 154;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 15) {
              var8 = 138;
            }
            if (19 == this.field_h[var6Lifetime1][var7Lifetime1]) {
              var8 = 98;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 20) {
              var8 = 106;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 21) {
              var8 = 158;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] < 0) {
              var8 = 29;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 22) {
              var8 = 150;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 11) {
              var8 = 114;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 12) {
              var8 = 120;
            }
            if (16 == this.field_h[var6Lifetime1][var7Lifetime1]) {
              var8 = 137;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 17) {
              var8 = 136;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 18) {
              var8 = 122;
            }
            if (23 == this.field_h[var6Lifetime1][var7Lifetime1]) {
              var8 = 151;
            }
            if (this.field_h[var6Lifetime1][var7Lifetime1] == 24) {
              var8 = 159;
            }
            if (var8 != -1) {
              pk.field_d[var8].b(var2Lifetime1, var3Lifetime1, 128);
            }
          }
        }
        if (this.field_a == 1) {
          for (var6Lifetime2 = 0; 100 > var6Lifetime2; var6Lifetime2++) {
            for (var7Lifetime2 = 0; var7Lifetime2 < 100; var7Lifetime2++) {
              var2Lifetime2 = -this.field_t + var6Lifetime2 * 16;
              var3Lifetime2 = -this.field_f + var7Lifetime2 * 16;
              if (this.field_w[var6Lifetime2][var7Lifetime2] == 0 ||
                this.field_w[var6Lifetime2][var7Lifetime2] == 3 &&
                this.field_n[var6Lifetime2][var7Lifetime2]) {
                si.c(var2Lifetime2, var3Lifetime2, 16, 16, 0);
              }
              if (this.field_n[var6Lifetime2][var7Lifetime2]) {
                si.a(var2Lifetime2, var3Lifetime2, 16, 16, 16711680, 128);
              }
            }
          }
        }
        if (this.field_a == 2) {
          for (var6Lifetime3 = 0; var6Lifetime3 < 100; var6Lifetime3++) {
            for (var7Lifetime3 = 0; var7Lifetime3 < 100; var7Lifetime3++) {
              var3Lifetime3 = 16 * var7Lifetime3 - this.field_f;
              var2Lifetime3 = 16 * var6Lifetime3 - this.field_t;
              if (this.field_w[var6Lifetime3][var7Lifetime3] == 0) {
                si.a(var2Lifetime3, var3Lifetime3, 16, 16, 16711680, 128);
              }
              if (this.field_w[var6Lifetime3][var7Lifetime3] == 1) {
                si.a(var2Lifetime3, var3Lifetime3, 16, 16, 16776960, 128);
              }
              if (this.field_w[var6Lifetime3][var7Lifetime3] == 2) {
                si.a(var2Lifetime3, var3Lifetime3, 16, 16, 65280, 128);
              }
              if (this.field_w[var6Lifetime3][var7Lifetime3] == 3) {
                si.a(var2Lifetime3, var3Lifetime3, 16, 16, 255, 128);
              }
            }
          }
        }
        if (3 == this.field_a) {
          for (var6Lifetime4 = 0; var6Lifetime4 < 100; var6Lifetime4++) {
            for (var7Lifetime4 = 0; var7Lifetime4 < 100; var7Lifetime4++) {
              var2Lifetime4 = -this.field_t + 16 * var6Lifetime4;
              var3Lifetime4 = 16 * var7Lifetime4 - this.field_f;
              if (this.field_w[var6Lifetime4][var7Lifetime4] == 0) {
                si.c(var2Lifetime4, var3Lifetime4, 16, 16, 0);
              }
              if (this.field_w[var6Lifetime4][var7Lifetime4] == 0 ||
                this.field_w[var6Lifetime4][var7Lifetime4] == 3 &&
                this.field_n[var6Lifetime4][var7Lifetime4]) {
                si.c(var2Lifetime4, var3Lifetime4, 16, 16, 0);
              }
              if (this.field_d[var6Lifetime4][var7Lifetime4]) {
                si.a(var2Lifetime4, var3Lifetime4, 16, 16, 65535, 128);
              }
            }
          }
        }
        var3Lifetime5 = this.field_p * 16 - this.field_f;
        var2Lifetime5 = -this.field_t + this.field_j * 16;
        si.a(var2Lifetime5, var3Lifetime5, 16 * var4, var5 * 16, 16777215);
        if (this.field_r) {
          si.a(0, 0, 640, 480, 0, 128);
          for (var6Lifetime5 = 0; var6Lifetime5 < 8; var6Lifetime5++) {
            for (var7Lifetime5 = 0; var7Lifetime5 < 20; var7Lifetime5++) {
              var2Lifetime6 = 16 * var6Lifetime5;
              var3Lifetime6 = var7Lifetime5 * 16;
              if (var7Lifetime5 * 8 + var6Lifetime5 < 160) {
                pk.field_d[var6Lifetime5 + 8 * var7Lifetime5].e(var2Lifetime6, var3Lifetime6);
              }
              var2Lifetime6 += 144;
              if (var7Lifetime5 * 8 + var6Lifetime5 < 160) {
                pk.field_d[160 + 8 * var7Lifetime5 + var6Lifetime5].e(var2Lifetime6, var3Lifetime6);
              }
            }
          }
          var2Lifetime6Lifetime1 = 16 * this.field_j;
          var3Lifetime6Lifetime1 = this.field_p * 16;
          si.a(var2Lifetime6Lifetime1, var3Lifetime6Lifetime1, var4 * 16, var5 * 16, 16777215);
        }
    }

    private final int a(int param0) {
        int var2;
        if (param0 != 28222) {
          qh.a('(', -94);
        }
        var2 = -1;
        if (this.field_b == 128) {
          var2 = 1;
        }
        if (this.field_b == 129) {
          var2 = 2;
        }
        if (130 == this.field_b) {
          var2 = 3;
        }
        if (131 == this.field_b) {
          var2 = 4;
        }
        if (this.field_b == 132) {
          var2 = 5;
        }
        if (this.field_b == 133) {
          var2 = 6;
        }
        if (this.field_b == 134) {
          var2 = 7;
        }
        if (this.field_b == 135) {
          var2 = 8;
        }
        if (this.field_b == 142) {
          var2 = 9;
        }
        if (this.field_b == 143) {
          var2 = 10;
        }
        if (this.field_b == 121) {
          var2 = 13;
        }
        if (154 == this.field_b) {
          var2 = 14;
        }
        if (this.field_b == 138) {
          var2 = 15;
        }
        if (this.field_b == 98) {
          var2 = 19;
        }
        if (106 == this.field_b) {
          var2 = 20;
        }
        if (this.field_b == 158) {
          var2 = 21;
        }
        if (this.field_b == 150) {
          var2 = 22;
        }
        if (114 == this.field_b) {
          var2 = 11;
        }
        if (this.field_b == 120) {
          var2 = 12;
        }
        if (this.field_b == 137) {
          var2 = 16;
        }
        if (136 == this.field_b) {
          var2 = 17;
        }
        if (this.field_b == 122) {
          var2 = 18;
        }
        if (this.field_b == 151) {
          var2 = 23;
        }
        if (this.field_b == 159) {
          var2 = 24;
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        if (rg.field_d == null ||
          !(param0 <= rg.field_d.length)) {
          rg.field_d = new int[2 * param0];
        }
        var3 = -43 % ((54 - param2) / 39);
        if (qa.field_d == null ||
          !(qa.field_d.length >= param0)) {
          qa.field_d = new int[param0 * 2];
        }
        if (null == ta.field_mb ||
          !(ta.field_mb.length >= param0)) {
          ta.field_mb = new int[param0 * 2];
        }
        if (og.field_b == null ||
          !(param0 <= og.field_b.length)) {
          og.field_b = new int[param0 * 2];
        }
        if (null == db.field_t ||
          !(db.field_t.length >= param0)) {
          db.field_t = new int[param0 * 2];
        }
        if (hi.field_n == null ||
          !(param0 <= hi.field_n.length)) {
          hi.field_n = new int[param0 * 2];
        }
        if (null == db.field_s ||
          !(db.field_s.length >= param1 + param0)) {
          db.field_s = new int[2 * (param0 + param1)];
        }
        if (null == ve.field_c ||
          !(param0 <= ve.field_c.length)) {
          ve.field_c = new boolean[2 * param0];
        }
        i.field_f = 2147483647;
        rf.field_c = -2147483648;
        bh.field_e = 2147483647;
        kl.field_a = -2147483648;
        fc.field_z = 0;
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param1 != -49) {
          return false;
        }
        stackIn_6_0 = (param0 >= 48) && (57 >= param0);
        return stackIn_6_0;
    }

    public static void a(byte param0) {
        field_x = null;
        field_l = null;
        field_g = null;
        if (param0 > -43) {
          qh.a('h', -28);
        }
        field_m = null;
        field_c = null;
    }

    private final void a(byte[] param0, int param1) {
        int var7 = 0;
        int incrementValue$0 = 0;
        int[] dupTemp$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_int = 0;
          var6 = 1;
          if (param1 != 256) {
            field_x = (String) null;
          }
          for (var7 = 0; var7 < 10000; var7++) {
            var5 = var7 / 100;
            var4 = var7 % 100;
            incrementValue$0 = var3_int;
            var3_int++;
            this.field_o[var4][var5] = param0[incrementValue$0];
            if (0 > this.field_o[var4][var5]) {
              this.field_o[var4][var5] = 256 + this.field_o[var4][var5];
            }
            dupTemp$1 = this.field_o[var4];
            incrementValue$2 = var3_int;
            var3_int++;
            dupTemp$1[var5] = dupTemp$1[var5] + param0[incrementValue$2] * 64;
            incrementValue$3 = var3_int;
            var3_int++;
            stackIn_10_0 = this.field_n[var4];
            stackIn_10_1 = var5;
            stackIn_11_2 = (0 != param0[incrementValue$3]);
            stackIn_10_0[stackIn_10_1] = stackIn_11_2;
            incrementValue$4 = var3_int;
            var3_int++;
            this.field_h[var4][var5] = param0[incrementValue$4] - 5;
            incrementValue$5 = var3_int;
            var3_int++;
            this.field_w[var4][var5] = param0[incrementValue$5];
            if (var6 != 0) {
              incrementValue$6 = var3_int;
              var3_int++;
              stackIn_16_0 = this.field_d[var4];
              stackIn_16_1 = var5;
              stackIn_17_2 = (param0[incrementValue$6] == 1);
              stackIn_16_0[stackIn_16_1] = stackIn_17_2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("qh.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0) {
        try {
          int var7_int = 0;
          boolean stackIn_35_1 = false;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          int var3 = 0;
          int var4 = 0;
          int var5 = 0;
          int var6_int = 0;
          bd var6 = null;
          byte[] var6_array = null;
          byte[] var7 = null;
          Exception var7_ref = null;
          int var8_int = 0;
          Exception var8 = null;
          int var9 = 0;
          byte[] var10 = null;
          int var11 = 0;
          byte[] var12 = null;
          byte[] var13 = null;
          byte[] var14 = null;
          byte[] var15 = null;
          int var6_intLifetime1;
          var9 = HostileSpawn.field_I ? 1 : 0;
          this.field_p = (rb.field_m + this.field_f) / 16;
          this.field_j = (this.field_t + j.field_c) / 16;
          if (this.field_r) {
            this.field_p = rb.field_m / 16;
            this.field_j = j.field_c / 16;
          }
          var2 = 1;
          if (param0 != 32) {
            this.field_b = 33;
          }
          var3 = 1;
          if (this.field_i == 0) {
            var2 = 1;
            var3 = 1;
          }
          if (this.field_i == 1) {
            var3 = 2;
            var2 = 2;
          }
          if (this.field_i == 2) {
            var3 = 2;
            var2 = 3;
          }
          if (this.field_i == 3) {
            var3 = 3;
            var2 = 3;
          }
          if (this.field_i == 4) {
            var2 = 4;
            var3 = 4;
          }
          if (this.field_i == 5) {
            var3 = 5;
            var2 = 5;
          }
          if (this.field_j < 0) {
            this.field_j = 0;
          }
          if (0 > this.field_p) {
            this.field_p = 0;
          }
          if (99 - var2 < this.field_j) {
            this.field_j = 99 - var2;
          }
          if (this.field_p > 99 - var3) {
            this.field_p = -var3 + 99;
          }
          boolean decompiledFrameRemainder0 = true;
          if (pf.field_o != 2 && (pf.field_o != 1 ||
            !this.field_r)) {
            if ((pf.field_o == 1)) {
              var4 = this.a(28222);
              if (var4 != -1) {
                this.field_h[this.field_j][this.field_p] = var4;
              } else {
                for (var5 = 0; var5 < var2; var5++) {
                  for (var6_int = 0; var3 > var6_int; var6_int++) {
                    this.field_o[var5 + this.field_j][this.field_p + var6_int] = var6_int * 8 + (var5 + this.field_b);
                    if (this.field_w[this.field_j + var5][this.field_p + var6_int] == 0) {
                      this.field_w[var5 + this.field_j][var6_int + this.field_p] = 2;
                    }
                    this.field_h[this.field_j + var5][this.field_p + var6_int] = 0;
                  }
                }
                this.field_a = 0;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_35_1 = !(this.field_r);
            this.field_r = stackIn_35_1;
            if (!this.field_r) {
              if (8 > j.field_c / 16) {
                this.field_b = j.field_c / 16 + 8 * (rb.field_m / 16);
              } else {
                this.field_b = 8 * (20 + rb.field_m / 16) - 9 + j.field_c / 16;
              }
            }
          }
          if (field_m[96]) {
            this.field_t = this.field_t - 32;
          }
          if (field_m[98]) {
            this.field_f = this.field_f - 32;
          }
          if (field_m[97]) {
            this.field_t = this.field_t + 32;
          }
          if (field_m[99]) {
            this.field_f = this.field_f + 32;
          }
          if (field_m[83]) {
            var4 = this.a(param0 ^ 28190);
            if (var4 == -1) {
              for (var5 = 0; var5 < var2; var5++) {
                var11 = 0;
                var6_intLifetime1 = var11;
                while (var11 < var3) {
                  this.field_o[this.field_j + var5][var11 + this.field_p] = this.field_b + var5 + 8 * var11;
                  if (this.field_w[this.field_j + var5][this.field_p + var11] == 0) {
                    this.field_w[var5 + this.field_j][this.field_p + var11] = 2;
                  }
                  this.field_h[this.field_j + var5][this.field_p + var11] = 0;
                  var11++;
                }
              }
              this.field_a = 0;
            } else {
              this.field_h[this.field_j][this.field_p] = var4;
            }
          }
          if (field_m[64]) {
            for (var4 = 0; var2 > var4; var4++) {
              for (var5 = 0; var5 < var3; var5++) {
                this.field_n[var4 + this.field_j][var5 + this.field_p] = true;
              }
            }
            this.field_a = 1;
          }
          if (field_m[65]) {
            for (var4 = 0; var4 < var2; var4++) {
              for (var5 = 0; var5 < var3; var5++) {
                this.field_n[var4 + this.field_j][var5 + this.field_p] = false;
              }
            }
            this.field_a = 1;
          }
          if (field_m[48]) {
            for (var4 = 0; var4 < var2; var4++) {
              for (var5 = 0; var3 > var5; var5++) {
                this.field_n[var4 + this.field_j][this.field_p + var5] = true;
                this.field_w[var4 + this.field_j][var5 + this.field_p] = 0;
              }
            }
            this.field_a = 2;
          }
          if (field_m[49]) {
            for (var4 = 0; var4 < var2; var4++) {
              for (var5 = 0; var3 > var5; var5++) {
                this.field_w[this.field_j + var4][this.field_p + var5] = 1;
              }
            }
            this.field_a = 2;
          }
          if (field_m[50]) {
            for (var4 = 0; var2 > var4; var4++) {
              for (var5 = 0; var5 < var3; var5++) {
                this.field_w[var4 + this.field_j][this.field_p + var5] = 2;
              }
            }
            this.field_a = 2;
          }
          if (field_m[51]) {
            for (var4 = 0; var4 < var2; var4++) {
              for (var5 = 0; var3 > var5; var5++) {
                this.field_w[var4 + this.field_j][this.field_p + var5] = 3;
              }
            }
            this.field_a = 2;
          }
          if (field_m[67]) {
            for (var4 = 0; var4 < var2; var4++) {
              for (var5 = 0; var5 < var3; var5++) {
                this.field_d[this.field_j + var4][var5 + this.field_p] = false;
              }
            }
            this.field_a = 3;
          }
          if (field_m[68]) {
            for (var4 = 0; var2 > var4; var4++) {
              for (var5 = 0; var3 > var5; var5++) {
                this.field_d[this.field_j + var4][this.field_p + var5] = true;
              }
            }
            this.field_a = 3;
          }
          while (true) {
            if (!jn.e((byte) 75)) {
              return;
            }
            if (32 == pj.field_e) {
              if (0 < this.field_a) {
                this.field_a = this.field_a - 1;
                if (33 == pj.field_e &&
                  this.field_a < 3) {
                  this.field_a = this.field_a + 1;
                }
              } else {
                if (33 == pj.field_e &&
                  this.field_a < 3) {
                  this.field_a = this.field_a + 1;
                }
              }
            } else {
              if (33 == pj.field_e &&
                this.field_a < 3) {
                this.field_a = this.field_a + 1;
              }
            }
            if (pj.field_e == 34 &&
              this.field_i > 0) {
              this.field_i = this.field_i - 1;
            }
            if (pj.field_e == 35 &&
              this.field_i < 5) {
              this.field_i = this.field_i + 1;
            }
            var4 = 0;
            if (pj.field_e == 16) {
              var4 = 1;
              this.field_v = 1;
            }
            var5 = 0;
            if (17 == pj.field_e) {
              this.field_v = 2;
              var4 = 1;
            }
            if (18 == pj.field_e) {
              this.field_v = 3;
              var4 = 1;
            }
            if (pj.field_e == 19) {
              var4 = 1;
              this.field_v = 4;
            }
            if (20 == pj.field_e) {
              this.field_v = 5;
              var4 = 1;
            }
            if (pj.field_e == 21) {
              this.field_v = 6;
              var4 = 1;
            }
            if (pj.field_e == 22) {
              var4 = 1;
              this.field_v = 7;
            }
            if (pj.field_e == 23) {
              var4 = 1;
              this.field_v = 9;
            }
            if (24 == pj.field_e) {
              this.field_v = 10;
              var4 = 1;
            }
            if (pj.field_e == 41) {
              var5 = 1;
            }
            if (25 == pj.field_e) {
              this.field_v = 11;
              var4 = 1;
            }
            if (var4 != 0) {
              var6 = ci.field_e[13];
              if (this.field_v >= 8) {
                var6 = ci.field_e[14];
              }
              if (1 == this.field_v) {
                var6 = ci.field_e[15];
              }
              for (var7_int = 0; 5 > var7_int; var7_int++) {
                for (var8_int = 0; var8_int < 5; var8_int++) {
                  pk.field_d[var7_int + (var8_int + 24) * 8].a();
                  var6.c(16 * -var7_int, 16 * -var8_int);
                }
              }
              o.field_n.b((byte) 113);
              var14 = new byte[60000];
              var12 = var14;
              var7 = var12;
              try {
                var8_int = 60000;
                d.a((byte) -115, var7, new File(uk.a(param0 + 9362, this.field_v)), var8_int);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8 = (Exception) (Object) decompiledCaughtException;
                System.out.println(var8);
              }
              this.a(var14, (byte) -80);
            }
            if (var5 == 0) {
              continue;
            }
            var15 = this.c(param0 ^ 32);
            var13 = var15;
            var10 = var13;
            var6_array = var10;
            oc.field_h[0][this.field_v] = var15;
            try {
              fj.a(var6_array, 15445, var15.length, new File(uk.a(9394, this.field_v)));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var7_ref = (Exception) (Object) decompiledCaughtException;
              System.out.println(var7_ref);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte[] param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -80) {
            return;
          }
          this.a(param0, 256);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qh.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private qh() throws Throwable {
        throw new Error();
    }

    static {
        field_q = -1;
        field_s = -1;
        field_m = new boolean[112];
        field_x = "Password: ";
        field_c = "What an unusual place to park.";
        field_k = 0;
        field_u = 0;
    }
}
