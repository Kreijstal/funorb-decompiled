/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends bf {
    private int field_i;
    int field_l;
    int field_m;
    boolean field_E;
    int field_C;
    private int field_k;
    int field_p;
    pj field_t;
    ki[] field_o;
    int field_w;
    int field_G;
    static int field_s;
    private int field_z;
    float field_v;
    int field_u;
    int field_y;
    boolean field_A;
    static le field_H;
    int field_F;
    float field_q;
    le field_I;
    int field_n;
    boolean field_x;
    static String[] field_r;
    boolean field_j;
    float field_B;
    float field_D;

    final void f(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -7) {
          this.field_G = -86;
        }
        boolean decompiledFrameRemainder0 = true;
        this.field_z = this.field_z + 1;
        if (this.field_w == 0) {
          if (this.field_n != 0) {
            if (1 == this.field_n &&
              (this.field_z & 7) == 0) {
              fieldTemp$0 = this.field_C + 1;
              this.field_C = this.field_C + 1;
              if (fieldTemp$0 == 4) {
                this.field_C = 0;
              }
              this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
            }
          } else {
            if (this.field_z % 100 < 32 &&
              (this.field_z & 7) == 0) {
              fieldTemp$1 = this.field_C + 1;
              this.field_C = this.field_C + 1;
              if (fieldTemp$1 == 4) {
                this.field_C = 0;
              }
              this.field_I = nh.field_f[this.field_n][this.field_i][this.field_C];
            }
          }
        } else {
          if (this.field_w == 3) {
            if (((this.field_n == 1)) &&
              (((3 & this.field_z) == 0))) {
              fieldTemp$2 = this.field_C + 1;
              this.field_C = this.field_C + 1;
              if (!(fieldTemp$2 >= 4)) {
                this.field_I = qi.field_K[this.field_C];
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (5 == this.field_w &&
              this.field_z % 100 < 32 &&
              0 == (7 & this.field_z)) {
              fieldTemp$3 = this.field_C + 1;
              this.field_C = this.field_C + 1;
              if (fieldTemp$3 == 4) {
                this.field_C = 0;
              }
              this.field_I = hb.field_m[this.field_l][this.field_C];
            }
          }
        }

    }

    final static String a(byte param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param0 < 20) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-1 + (var2_int - var4)] = param1.charAt(var4);
          }
          stackIn_8_0 = new String(var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ki.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void b(byte param0) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int var2;
        int var2Lifetime1;
        this.field_q = this.field_q + this.field_D;
        this.field_B = this.field_B + this.field_v;
        int fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        if (fieldTemp$0 > 250) {
          this.field_D = this.field_D + 1.0f;
        }
        if (param0 > -87) {
          return;
        }
        if ((float)this.field_G + this.field_B <= 80.0f ||
          560.0f <= this.field_B - (float)this.field_G) {
          var2 = 0;
          if (!(80.0f >= (float)this.field_G + this.field_B)) {
            stackIn_17_0 = (!nh.a(560, 0, (int)this.field_q, (int)(this.field_D + this.field_q), -5425, 560, (int)(this.field_B + this.field_v), (int)this.field_B, 480)) ? 0 : 1;
            var2Lifetime1 = stackIn_17_0;
            if (var2Lifetime1 != 0) {
              this.field_B = (float)(ll.field_a + this.field_G);
            }
          } else {
            stackIn_11_0 = (!nh.a(80, 0, (int)this.field_q, (int)(this.field_q + this.field_D), -5425, 80, (int)(this.field_v + this.field_B), (int)this.field_B, 480)) ? 0 : 1;
            var2Lifetime1 = stackIn_11_0;
            if (var2Lifetime1 != 0) {
              this.field_B = (float)(ll.field_a - this.field_G);
            }
          }
          if (var2Lifetime1 != 0 &&
            Math.abs(-this.field_q + (float)ok.field_b) < 10.0f) {
            this.field_q = (float)ok.field_b;
          }
          ib.c(100);
          this.field_v = this.field_v * -1.0f;
        }
    }

    final void a(byte param0, gk param1) {
        try {
          this.a(param1, true);
          this.a(false);
          this.field_x = true;
          if (param0 < 112) {
            this.f(113);
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ki.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1) {
        try {
          int var2_int = 11 % ((-86 - param0) / 39);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ki.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, kc param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          e.field_b[0] = pi.field_l.nextInt();
          e.field_b[1] = pi.field_l.nextInt();
          e.field_b[3] = (int)ld.field_a;
          e.field_b[2] = (int)(ld.field_a >> 32);
          uc.field_a.field_h = 0;
          uc.field_a.a(-803539344, e.field_b[0]);
          uc.field_a.a(-803539344, e.field_b[1]);
          uc.field_a.a(-803539344, e.field_b[2]);
          uc.field_a.a(-803539344, e.field_b[3]);
          df.a(uc.field_a, false);
          uc.field_a.c(param0, 80);
          if (!param2) {
            return;
          }
          param1.a(121, uc.field_a);
          gf.field_c.field_h = 0;
          if (param3) {
            gf.field_c.b(18, -49152);
          } else {
            gf.field_c.b(16, -49152);
          }
          gf.field_c.field_h = gf.field_c.field_h + 2;
          var5_int = gf.field_c.field_h;
          gf.field_c.a(-803539344, mk.field_h);
          gf.field_c.a(od.field_l, (byte) -102);
          var6 = 0;
          if (mb.field_c) {
            var6 = var6 | 1;
          }
          if (me.field_e) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (null != df.field_o) {
            var6 = var6 | 16;
          }
          gf.field_c.b(var6, -49152);
          var7 = lc.a(ii.a(false), (byte) -89);
          if (var7 == null) {
            var7 = "";
          }
          gf.field_c.a(-119, var7);
          if (df.field_o != null) {
            gf.field_c.a(df.field_o, -57);
          }
          e.a(sd.field_a, fj.field_F, (byte) 92, gf.field_c, uc.field_a);
          gf.field_c.d(6903, gf.field_c.field_h - var5_int);
          al.a((byte) -71, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ki.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void d(byte param0) {
        if (2 == this.field_w ||
          this.field_w == 3) {
          sb.field_m.e();
          this.field_I.e(-80 + (int)((float)this.field_G + this.field_B) - 1, (int)(this.field_q + (float)this.field_y), 16777213);
          this.field_I.e((int)(this.field_B + (float)this.field_G) - 79, (int)((float)this.field_y + this.field_q), 16777212);
          this.field_I.e((int)((float)this.field_G + this.field_B) - 80, (int)((float)this.field_y + this.field_q - 1.0f), 16777215);
          this.field_I.e(-80 + (int)((float)this.field_G + this.field_B), (int)(1.0f + ((float)this.field_y + this.field_q)), 16777214);
          ac.field_a.a((byte) 117);
        }
        int var2 = -89 % ((param0 - 59) / 54);
    }

    final void a(byte param0) {
        if (this.field_w != 4) {
          if (0 == this.field_w &&
            this.field_m > 0 ||
            this.field_w == 5 &&
            1 < this.field_m) {
            ge.c((int)this.field_B, (int)this.field_q, 16, 16777215, 100);
            ge.e((int)this.field_B, (int)this.field_q, 16, 1);
          }
          if (this.field_I != null) {
            this.field_I.c((int)((float)this.field_G + this.field_B), (int)((float)this.field_y + this.field_q));
          }
        } else {
          this.field_I.b((int)((float)this.field_G + this.field_B), (int)(this.field_q + (float)this.field_y), 180);
        }
        if (param0 > -10) {
          this.c((byte) 35);
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_l = param1;
        if (param2 != -1) {
          this.field_t = (pj) null;
        }
        this.field_w = param0;
        this.a(false);
    }

    private final void a(gk param0, boolean param1) {
        try {
          this.field_B = (float)param0.e(-46);
          this.field_q = (float)param0.e(127);
          this.field_l = param0.a((byte) 114);
          if (!param1) {
            this.field_y = 45;
          }
          this.field_w = param0.a((byte) 114);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ki.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        sb.field_m.e();
        if (param0 >= -83) {
          this.field_y = -51;
        }
        this.field_I.e((int)((float)this.field_G + this.field_B) - 80, (int)((float)this.field_y + this.field_q), this.field_k + 1);
        ac.field_a.a((byte) 124);
    }

    private final void a(boolean param0) {
        boolean stackIn_3_1 = false;
        boolean stackIn_8_1 = false;
        this.field_A = false;
        stackIn_3_1 = (param0);
        this.field_E = stackIn_3_1;
        this.field_F = 0;
        this.field_i = this.field_l;
        this.field_m = 0;
        this.field_p = -this.field_k;
        this.field_z = 0;
        stackIn_8_1 = (this.field_w == 2) || (this.field_w == 3);
        this.field_x = stackIn_8_1;
        this.field_n = 0;
        this.field_t = null;
        this.field_j = false;
        this.field_C = 0;
        if (6 == this.field_w ||
          this.field_w == 4 ||
          this.field_w == 2 ||
          3 == this.field_w) {
          this.field_l = -this.field_k;
        }
        this.e(123);
    }

    public static void h(int param0) {
        if (param0 != 12950) {
          field_H = (le) null;
        }
        field_H = null;
        field_r = null;
    }

    final void g(int param0) {
        int incrementValue$0 = 0;
        int var9 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var10;
        int[] var14;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = -84 + ((int)this.field_B + this.field_G);
        var3 = (int)this.field_q + this.field_y - 4;
        var4 = 8 + this.field_I.field_m;
        if (var2 < 0) {
          var4 = var4 + var2;
          var2 = 0;
        }
        var5 = 8 + this.field_I.field_n;
        if (var3 < 0) {
          var5 = var5 + var3;
          var3 = 0;
        }
        if (sb.field_m.field_k < var4 + var2) {
          var4 = sb.field_m.field_k - var2;
        }
        if (sb.field_m.field_j < var3 + var5) {
          var5 = sb.field_m.field_j - var3;
        }
        if (param0 < 104) {
          return;
        }
        var6 = var3 * sb.field_m.field_k + var2;
        var7 = -var4 + sb.field_m.field_k;
        var14 = sb.field_m.field_s;
        while (true) {
          incrementValue$0 = var5;
          var5--;
          if (incrementValue$0 <= 0) {
            return;
          }
          for (var9 = -var4; var9 < 0; var9++) {
            if (~(this.field_k + 1) == ~var14[var6]) {
              var14[var6] = 0;
            }
            if (this.field_w == 3 &&
              16777212 <= var14[var6]) {
              var14[var6] = 0;
            }
            var6++;
          }
          var6 = var6 + var7;
        }
    }

    final void a(boolean param0, ki param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var3_int = 0;
          if (!param0) {
            this.field_v = -0.48507803678512573f;
          }
          while (var3_int < this.field_m) {
            if (this.field_o[var3_int] != param1) {
              var3_int++;
              continue;
            }
            this.field_o[var3_int] = null;
            if (this.field_l == param1.field_l ||
              this.field_p == param1.field_l ||
              this.field_l == param1.field_p ||
              param1.field_p == this.field_p) {
              this.field_F = this.field_F - 1;
            }
            this.field_m = this.field_m - 1;
            if (var3_int < 5 ||
              this.field_w == 4) {
              gl.a(this.field_o, var3_int + 1, this.field_o, var3_int, -var3_int + this.field_m);
            }
            this.field_o[this.field_m] = null;
            break;
          }
          if (this.field_m < this.field_F) {
            throw new IllegalStateException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("ki.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_w != 0) {
          if (this.field_w == 1) {
            this.field_I = ak.field_t[this.field_i];
          } else {
            if (this.field_w == 2) {
              this.field_I = qi.field_K[0];
            } else {
              if (this.field_w != 3) {
                if (this.field_w != 4) {
                  if (5 == this.field_w) {
                    this.field_I = hb.field_m[this.field_l][0];
                    this.field_z = pf.a((byte) -92, 2000);
                  } else {
                    if (this.field_w == 6) {
                      this.field_I = tl.field_b;
                    }
                  }
                } else {
                  this.field_I = wc.field_h;
                }
              } else {
                this.field_I = qi.field_K[1];
              }
            }
          }
        } else {
          this.field_I = nh.field_f[this.field_n][this.field_i][0];
          this.field_z = pf.a((byte) 51, 65) + 35;
        }
        var2 = -92 % ((76 - param0) / 41);
        if (this.field_I != null) {
          this.field_G = -(this.field_I.field_m / 2);
          this.field_y = -(this.field_I.field_n / 2);
        }
    }

    ki(int param0, int param1, int param2) {
        this.field_t = null;
        this.field_o = new ki[6];
        this.field_m = 0;
        this.field_F = 0;
        this.field_k = param2;
        this.field_l = param1;
        this.field_w = param0;
        this.a(false);
    }

    static {
        field_r = new String[]{"Fire 300 nuts on one level", "Complete the game", "Dislodge 30 nuts at once", "Dislodge 4 monkeys in a row without interruption", "Dislodge 5 monkeys in a row without interruption", "Dislodge 6 monkeys in a row without interruption", "Dislodge any set of non-monkey objects 50 times, without clearing a monkey", "Dislodge a monkey with 10 or more nuts attatched", "Dislodge a monkey with 15 or more nuts attatched", "Dislodge a monkey with 20 or more nuts attatched"};
    }
}
