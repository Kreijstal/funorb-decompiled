/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends id {
    static wj field_kb;
    private int[] field_Y;
    private int field_ib;
    static int field_eb;
    static int field_db;
    private int field_U;
    static int field_bb;
    private int field_cb;
    static String field_R;
    private int[] field_W;
    static String[] field_Q;
    private int field_fb;
    private int field_Z;
    private int[] field_jb;
    private int field_ab;
    private int field_gb;
    static String field_S;
    private g field_hb;
    private int[] field_V;
    private int[] field_X;
    private int field_H;
    static int[] field_T;

    public static void f(byte param0) {
        if (param0 != 105) {
          return;
        }
        field_Q = null;
        field_kb = null;
        field_T = null;
        field_S = null;
        field_R = null;
    }

    final void a(byte param0, wk param1) {
        wk stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_28_2;
        int stackIn_28_3;
        int stackIn_29_4;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vn var9_ref_vn = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vn var13 = null;
        int var14 = 0;
        String var15 = null;
        vn var16 = null;
        vn var17 = null;
        vn var13Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        int var9Lifetime1Lifetime1;
        var14 = ZombieDawn.field_J;
        try {
          var3_int = param1.a(this.a(true), (byte) -125);
          var4 = param1.a(this.f(237239984), 0);
          var5 = param1.a(this.field_Z, (byte) -123);
          var6 = param1.a(this.field_gb, 0);
          var7 = -1;
          var8 = 0;
          if (this.field_hb != null) {
            stackIn_4_0 = (wk) (param1);
            stackIn_4_1 = this.field_hb.a(true);
            if (this.field_P) {
              stackIn_5_2 = 17;
            } else {
              stackIn_5_2 = 77;
            }
            var3_int = ((wk) (Object) stackIn_4_0).a(stackIn_4_1 - stackIn_5_2, (byte) -59);
            var4 = param1.a(-40 + this.field_hb.f(237239984), 0);
          }
          var9 = this.field_fb;
          if (var9 != 0 &&
            var9 != 4) {
            if (var9 == 1) {
              var7Lifetime1 = 0;
            } else {
              if (var9 != 2) {
                if (var9 == 3) {
                  if (null != this.field_hb &&
                    this.field_hb instanceof ah) {
                    var7Lifetime1 = 2;
                  } else {
                    var7Lifetime1 = 0;
                  }
                }
              } else {
                var7Lifetime1 = 1;
              }
            }
          }
          if (param0 >= -76) {
            var15 = (String) null;
            te.a((String) null, -53, 120);
          }
          if (this.field_fb != 0 &&
            dk.field_Tb[this.field_ab].length > this.field_H) {
            stackIn_25_0 = var6 - 256;
            stackIn_25_1 = 99;
            stackIn_25_2 = var5;
            if (!this.field_P) {
              stackIn_26_3 = this.field_cb + 99;
            } else {
              stackIn_26_3 = 0;
            }
            stackIn_28_2 = stackIn_25_2 + stackIn_26_3;
            stackIn_28_3 = var6 + 256;
            if (!this.field_P) {
              stackIn_29_4 = 0;
            } else {
              stackIn_29_4 = -99 - this.field_cb;
            }
            g.$cfr$intArgs$a$3aedf8649552(stackIn_25_0, stackIn_25_1, stackIn_28_2, stackIn_28_3, stackIn_29_4 + var5);
            for (var9Lifetime1 = 0; 3 > var9Lifetime1; var9Lifetime1 += 2) {
              var10 = this.field_jb[var9Lifetime1];
              if (var10 != 0) {
                var11 = this.field_X[var9Lifetime1];
                if (dk.field_Tb[var10].length > var11) {
                  var8Lifetime1 = dk.field_Tb[var10][var11][1];
                  var12 = dk.field_Tb[var10][var11][2];
                  var16 = wh.field_a[var8Lifetime1][-1 + var12];
                  var13 = var16;
                  if (this.field_P) {
                    var13.c(-100 + (var5 - this.field_Y[var9Lifetime1]), var6 + this.field_W[var9Lifetime1]);
                  } else {
                    var16.b(var5 + this.field_Y[var9Lifetime1], var6 + this.field_W[var9Lifetime1]);
                  }
                }
              }
            }
            if (this.field_hb != null &&
              this.field_hb.field_J) {
              this.field_hb.field_J = false;
              this.field_hb.a((byte) -124, param1);
              this.field_hb.field_J = true;
            }
            if (this.field_fb != 4) {
              var7Lifetime2 = dk.field_Tb[this.field_ab][this.field_H][2];
              var8Lifetime1Lifetime1 = dk.field_Tb[this.field_ab][this.field_H][1];
              var9_ref_vn = wh.field_a[var8Lifetime1Lifetime1][var7Lifetime2 - 1];
              if (!this.field_P) {
                var9_ref_vn.b(var3_int, var4);
              } else {
                var9_ref_vn.c(var3_int, var4);
              }
            }
            for (var9Lifetime1Lifetime1 = 1; 3 > var9Lifetime1Lifetime1; var9Lifetime1Lifetime1 += 2) {
              var10Lifetime1 = this.field_jb[var9Lifetime1Lifetime1];
              if (var10Lifetime1 != 0) {
                var11Lifetime1 = this.field_X[var9Lifetime1Lifetime1];
                if (dk.field_Tb[var10Lifetime1].length > var11Lifetime1) {
                  var8Lifetime1Lifetime2 = dk.field_Tb[var10Lifetime1][var11Lifetime1][1];
                  var12Lifetime1 = dk.field_Tb[var10Lifetime1][var11Lifetime1][2];
                  var17 = wh.field_a[var8Lifetime1Lifetime2][-1 + var12Lifetime1];
                  var13Lifetime1 = var17;
                  if (this.field_P) {
                    var13Lifetime1.c(var5 - this.field_Y[var9Lifetime1Lifetime1] - 100, this.field_W[var9Lifetime1Lifetime1] + var6);
                  } else {
                    var17.b(this.field_Y[var9Lifetime1Lifetime1] + var5, var6 + this.field_W[var9Lifetime1Lifetime1]);
                  }
                }
              }
            }
            pa.a(-21189);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_61_0 = var3;
          stackIn_61_1 = new StringBuilder().append("te.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    private final void c(int param0, int param1) {
        this.field_U = param0;
        this.field_H = 0;
        this.field_ab = param1;
    }

    final static eo a(String param0, int param1, int param2) {
        eo var3 = null;
        RuntimeException var3_ref = null;
        eo stackIn_2_0 = null;
        eo stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new eo(false);
          var3.field_a = param2;
          var3.field_e = param0;
          if (param1 == -13466) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          stackIn_2_0 = (eo) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("te.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void g(int param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int fieldTemp$0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_74_1 = 0;
        int stackIn_75_2 = 0;
        g stackIn_77_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_83_1 = 0;
        int stackIn_84_2 = 0;
        g stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int var2;
        int var3;
        g var3_ref_g;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[][] var12;
        int var3Lifetime1;
        int var4Lifetime1;
        int var6Lifetime1;
        var7 = ZombieDawn.field_J;
        var2 = 0;
        if (this.field_fb != 0 &&
          this.field_fb != 4) {
          this.field_U = this.field_U + 1;
          if (2 + this.field_U > dk.field_Tb[this.field_ab][this.field_H][0]) {
            this.field_H = this.field_H + 1;
            this.field_U = 0;
            stackIn_7_0 = (this.field_H < dk.field_Tb[this.field_ab].length) ? 0 : 1;
            var2 = stackIn_7_0;
            if (var2 != 0) {
              this.field_H = 0;
            }
          }
        }
        if (param0 <= 95) {
          return;
        }
        for (var3 = 0; var3 < 3; var3++) {
          var4 = this.field_jb[var3];
          if (0 != var4) {
            if (8 == var4) {
              this.field_Y[var3] = this.field_Y[var3] - 1;
              if (this.field_Y[var3] <= -66) {
                this.field_jb[var3] = 0;
              }
            } else {
              if (6 == var4) {
                this.field_Y[var3] = this.field_Y[var3] + 1;
              }
            }
            var12 = dk.field_Tb[var4];
            var6 = this.field_X[var3];
            dupTemp$1 = this.field_V[var3] + 1;
            this.field_V[var3] = dupTemp$1;
            if (dupTemp$1 > var12[var6][0]) {
              this.field_V[var3] = 0;
              dupTemp$2 = this.field_X[var3] + 1;
              this.field_X[var3] = dupTemp$2;
              if (dupTemp$2 >= var12.length - 1) {
                this.field_X[var3] = 0;
                if (this.field_jb[var3] == 6) {
                  this.field_jb[var3] = 7;
                  this.field_X[var3] = 0;
                }
              }
            }
          }
        }
        var3Lifetime1 = this.field_fb;
        if (0 == var3Lifetime1) {
          var3_ref_g = (g) (this.a((byte) -74, 96, 3));
          while (var3_ref_g != null) {
            boolean decompiledFrameRemainder0 = true;
            if (!var3_ref_g.field_V &&
              var3_ref_g.field_F != 9 &&
              var3_ref_g.field_F != 18) {
              var4Lifetime1 = this.f(237239984) - var3_ref_g.f(237239984);
              var5 = this.a(true) - var3_ref_g.a(true);
              if (var4Lifetime1 > 0) {
                if (var4Lifetime1 >= 58) {
                  var3_ref_g = (g) (this.e((byte) 32));
                  continue;
                }
                if (this.field_P) {
                  decompiledFrameRemainder0 = !(var5 > 76);
                  if (decompiledFrameRemainder0) {
                    decompiledFrameRemainder0 = !(18 > var5);
                  }
                } else {
                  decompiledFrameRemainder0 = !(-85 > var5);
                  if (decompiledFrameRemainder0) {
                    decompiledFrameRemainder0 = !(var5 > -26);
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.field_gb = var3_ref_g.f(237239984) - 60;
                  this.field_hb = var3_ref_g;
                  this.field_hb.j(81);
                  this.field_fb = 1;
                  this.field_cb = Math.abs(var5);
                  kh.a(126, false);
                  stackIn_59_1 = 0;
                  if (!(this.field_hb instanceof kd)) {
                    stackIn_60_2 = 1;
                  } else {
                    stackIn_60_2 = 0;
                  }
                  this.c(stackIn_59_1, stackIn_60_2);
                  var8 = 0;
                  var6Lifetime1 = var8;
                  while (var8 < 3) {
                    if (this.field_jb[var8] == 0) {
                      this.field_jb[var8] = 6;
                      this.field_Y[var8] = -so.c(30) - 50;
                      this.field_W[var8] = so.c(6);
                      if (var8 % 2 == 0) {
                        this.field_W[var8] = -this.field_W[var8];
                      }
                      this.field_W[var8] = this.field_W[var8] + 10;
                      this.field_X[var8] = so.c(10);
                      this.field_V[var8] = so.c(10);
                    }
                    var8++;
                  }
                  return;
                }
              }
            }
            var3_ref_g = (g) (this.e((byte) 32));
          }
          return;
        }
        if (1 == var3Lifetime1) {
          if (var2 != 0) {
            stackIn_74_1 = 0;
            if (!(this.field_hb instanceof kd)) {
              stackIn_75_2 = 3;
            } else {
              stackIn_75_2 = 2;
            }
            this.c(stackIn_74_1, stackIn_75_2);
            this.field_hb.f((byte) -85);
            stackIn_77_0 = this.field_hb;
            if (!(this.field_hb instanceof ah ^ this.field_P)) {
              stackIn_78_1 = 1;
            } else {
              stackIn_78_1 = 3;
            }
            stackIn_77_0.field_S = stackIn_78_1;
            this.field_fb = 2;
            kh.a(124, false);
          }
        } else {
          if (var3Lifetime1 != 2) {
            if (var3Lifetime1 == 3) {
              for (var3Lifetime1 = 0; var3Lifetime1 < 3; var3Lifetime1++) {
                if (this.field_X[var3Lifetime1] == 0) {
                  this.field_jb[var3Lifetime1] = 8;
                  this.field_X[var3Lifetime1] = 0;
                }
              }
              if (var2 != 0) {
                this.field_H = 0;
                this.field_U = 0;
              }
              if (null != this.field_hb) {
                stackIn_98_0 = this.field_hb;
                stackIn_98_1 = this.field_hb.field_y;
                if (!this.field_P) {
                  stackIn_99_2 = -2;
                } else {
                  stackIn_99_2 = 2;
                }
                stackIn_98_0.field_y = stackIn_98_1 + (stackIn_99_2 << 16);
              }
              this.field_cb = this.field_cb - 2;
              if (this.field_cb > -24) {
                return;
              }
              for (var3Lifetime1 = 0; 3 > var3Lifetime1; var3Lifetime1++) {
                if (this.field_jb[var3Lifetime1] != 8) {
                  this.field_jb[var3Lifetime1] = 8;
                  this.field_X[var3Lifetime1] = 0;
                }
              }
              this.field_ib = 70;
              this.field_hb.k(0);
              if (!(this.field_hb instanceof kd) ||
                ((kd) (this.field_hb)).i((byte) -126)) {
                stackIn_113_0 = uc.field_c;
                stackIn_113_1 = 1;
                uc.field_c = stackIn_113_0 + stackIn_113_1;
              }
              if (16 == this.field_hb.field_t) {
                dj.field_e.a(234, 21, (byte) -23);
              }
              if (uc.field_c == 20) {
                dj.field_e.a(235, 20, (byte) -23);
              }
              ck.a(-10, 6836);
              kh.a(151, false);
              this.field_fb = 4;
              return;
            }
            if (var3Lifetime1 == 4) {
              fieldTemp$0 = this.field_ib - 1;
              this.field_ib = this.field_ib - 1;
              if (0 >= fieldTemp$0) {
                kh.a(125, false);
                this.field_fb = 0;
              }
            }
          } else {
            if (var2 != 0) {
              stackIn_83_1 = 0;
              if (this.field_hb instanceof kd) {
                stackIn_84_2 = 4;
              } else {
                stackIn_84_2 = 5;
              }
              this.c(stackIn_83_1, stackIn_84_2);
              this.field_fb = 3;
            }
          }
        }
        return;
    }

    te(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, param2);
        this.field_W = new int[3];
        this.field_jb = new int[3];
        this.field_Y = new int[3];
        this.field_X = new int[3];
        this.field_V = new int[3];
        this.field_fb = 0;
        this.field_P = param3 ? true : false;
        this.field_Z = this.a(true);
        this.field_gb = -48 + this.f(237239984);
        this.field_cb = 90;
        uc.field_c = 0;
        int var5 = 0;
        this.field_jb[var5] = 7;
        this.field_Y[var5] = -50;
        this.field_W[var5] = 10;
        this.field_V[var5] = 0;
        this.field_X[var5] = 0;
    }

    static {
        field_Q = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_R = "Reload game";
        field_S = "BONUS LEVEL";
        field_db = 0;
        field_T = new int[]{171, 197, 410, 443};
    }
}
