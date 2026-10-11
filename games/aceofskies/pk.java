/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    private kc field_D;
    private int field_a;
    private int field_k;
    private int field_bb;
    private int field_l;
    private boolean field_yb;
    private int field_pb;
    private int field_zb;
    private int field_c;
    private int field_K;
    private md[] field_A;
    private int field_eb;
    private boolean field_j;
    int field_b;
    private int field_lb;
    private int field_ub;
    private qf[] field_n;
    private int field_O;
    private int field_sb;
    private int field_db;
    private int field_Ab;
    private int field_fb;
    private wm[] field_i;
    private int field_w;
    static l field_wb;
    private eu[] field_S;
    private int field_Bb;
    private int field_o;
    private o[] field_E;
    private md field_X;
    private boolean field_m;
    int field_q;
    private int field_L;
    private ok[] field_C;
    private int field_ab;
    static hc field_e;
    private int field_qb;
    private int[] field_r;
    private vc[] field_z;
    private int field_gb;
    private int field_v;
    private int field_p;
    private int field_d;
    private int field_T;
    private hk field_vb;
    private int field_xb;
    private int[] field_Z;
    private double field_kb;
    private int field_H;
    private int field_cb;
    private boolean field_rb;
    private int field_tb;
    private boolean field_Eb;
    private boolean field_ob;
    private boolean field_Cb;
    private int field_P;
    private boolean field_B;
    private int field_jb;
    private boolean field_U;
    private boolean field_g;
    private int field_N;
    private int field_s;
    private int field_mb;
    private int field_G;
    private boolean field_W;
    private int field_M;
    private int field_h;
    private int field_F;
    private int field_J;
    private double field_hb;
    private double field_u;
    private int field_x;
    private int field_nb;
    private int field_ib;
    private int field_Db;
    private int field_Q;
    private double field_Y;
    private int field_y;
    private int field_V;
    private int field_R;
    private int field_f;
    private double field_t;

    private final void a(ha param0, int param1) {
        int stackIn_55_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_104_0 = 0;
        bo stackIn_135_0;
        int stackIn_135_1;
        int stackIn_135_2;
        int stackIn_135_3;
        int stackIn_135_4;
        int stackIn_136_5 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_173_0 = 0;
        RuntimeException stackIn_183_0 = null;
        StringBuilder stackIn_183_1 = null;
        String stackIn_184_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ok var4 = null;
        int var5 = 0;
        bo var5_ref_bo = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        md[] var10_ref_md__ = null;
        int var10 = 0;
        int var11 = 0;
        md var12 = null;
        int var13 = 0;
        int var11Lifetime1;
        var13 = AceOfSkies.field_G ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (this.field_R < 200) {
            var3_int = 128 + (int)(128.0 * -Math.cos((double)this.field_R * 3.141592653589793 / 200.0));
            var4_int = var3_int * 140 >> 8;
            if (!this.field_Cb) {
              var5 = -var4_int + 5;
              var6 = 5;
              var7 = 0;
              while (var7 < 7) {
                var8 = 0;
                stackIn_141_0 = -1;
                stackIn_141_1 = ~var7;
                if (var13 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_141_0 == stackIn_141_1) {
                  var8 = this.field_d;
                }
                if (1 == var7) {
                  var8 = this.field_J;
                }
                if (var7 == 2) {
                  var8 = this.field_x;
                }
                if (var7 == 3) {
                  var8 = this.field_H;
                }
                if (4 == var7) {
                  var8 = this.field_F;
                }
                if (var7 == 5) {
                  var9 = 0;
                  var10_ref_md__ = this.field_A;
                  var11 = 0;
                  while (var10_ref_md__.length > var11) {
                    var12 = var10_ref_md__[var11];
                    if (var12 != null &&
                      var12.field_k > 0 && (this.field_X != var12 ||
                      var13 != 0) && gh.field_j == var12.field_r) {
                      var9++;
                    }
                    var11++;
                  }
                  var8 = var9;
                }
                var9 = (int)((1.0 + Math.sin((double)this.field_c * 3.141592653589793 / 20.0)) * 127.0);
                if (var9 == 0) {
                  this.field_y = this.field_p;
                }
                stackIn_55_0 = ((1 + var7) > this.field_y) ? 0 : 1;
                var10 = stackIn_55_0;
                if (var7 == 6) {
                  var8 = 20;
                } else if (var7 == 4 ||
                  5 == var7) {
                  if (6 < var8) {
                    var8 = 6;
                  }
                  stackIn_72_0 = var10;
                  if (var8 >= 6) {
                    stackIn_73_1 = 0;
                  } else {
                    stackIn_73_1 = 1;
                  }
                  var10 = stackIn_72_0 & stackIn_73_1;
                  var8 += 13;
                } else {
                  if (var8 > 12) {
                    var8 = 12;
                  }
                  stackIn_81_0 = var10;
                  if (12 <= var8) {
                    stackIn_82_1 = 0;
                  } else {
                    stackIn_82_1 = 1;
                  }
                  var10 = stackIn_81_0 & stackIn_82_1;
                }
                jm.field_a[var8].a(var5, var6);
                if (var7 == 6) {
                  if (this.field_V <= 50) {
                    stackIn_90_0 = 16777215 | 255 * this.field_V / 50 << 24;
                  } else {
                    stackIn_90_0 = -1;
                  }
                  var11Lifetime1 = stackIn_90_0;
                  jm.field_a[1 + var8].a(var5, var6, 0, var11Lifetime1, 1);
                }
                bs.field_b[var7].a(var5, var6);
                if (var10 != 0) {
                  uc.field_o[1].a(var5 - 9, -12 + var6, 0, var9 * 16843009, 2);
                }
                if (this.field_r[var7] > 0) {
                  var9 = this.field_r[var7];
                  if (64 <= var9) {
                    if (var9 > 448) {
                      stackIn_104_0 = -(var9 - 512 << 2);
                    } else {
                      stackIn_104_0 = 255;
                    }
                  } else {
                    stackIn_104_0 = var9 << 2;
                  }
                  var9 = stackIn_104_0;
                  var9 = (-var3_int + 256) * var9 >> 8;
                  if (var9 > 0) {
                    rb.field_j.a(16777215 | var9 << 24, -1, var5 + 55, ii.field_e[var7], param1 ^ -1573, 24 + var6);
                  }
                }
                var6 += 38;
                var7++;
              }
            }
            if (decompiledFrameCompleted0) {
              var5_ref_bo = fa.a(param0, true);
              var6 = 0;
              if (this.field_G > 0) {
                var6 = 40 * (int)(-Math.cos((double)this.field_G * 3.141592653589793 / 200.0) * 128.0) + 5120 >> 8;
              }
              if (this.field_Eb &&
                this.field_j) {
                var4_int = (var3_int * 40 >> 8) + var6;
                param0.d(33, 70, 0 - var4_int, -5782, -65281, sh.field_u - 211);
                var4_int = var3_int * 146 >> 8;
                param0.d(33, 213, 0, -5782, -65281, -149 + sh.field_u + var4_int);
              }
              var4_int = var6 + (40 * var3_int >> 8);
              ua.field_g[1].a(-208 + sh.field_u, -var4_int);
              this.a(this.field_P, 3, -var4_int + 4, true, this.field_Q, this.field_tb, -167 + sh.field_u, true, 10);
              var4_int = 146 * var3_int >> 8;
              ua.field_g[0].a(sh.field_u - 146 + var4_int, 0);
              this.a(this.field_N, 8, 4, false, this.field_cb, this.field_nb, -21 + (sh.field_u + var4_int), false, 10);
              var4_int = 130 * var3_int >> 8;
              this.a(param0, var4_int, param1 ^ -16732145);
              var4_int = 35 * var3_int >> 8;
              var7 = sh.field_u - 30;
              var8 = var4_int + gp.field_w - 30;
              var9 = 0;
              do {
                if (var9 >= this.field_F) {
                  var4_int = var3_int * 80 >> 8;
                  var8 = gp.field_w - 150;
                  var7 = -25 + (sh.field_u + var4_int);
                  ii.field_k[1][2].a(var7, var8);
                  var5_ref_bo.a(var7 + 20, var7, 124 + var8, -this.field_a + var8 + 104, 82);
                  ii.field_k[1][1].a(var7, var8);
                  var5_ref_bo.a(true);
                  ii.field_k[1][0].a(var7, var8);
                  var7 = var4_int + (sh.field_u - 50);
                  var8 = -150 + gp.field_w;
                  ii.field_k[0][2].a(var7, var8);
                  var5_ref_bo.a(var7 + 20, var7, var8 + 124, -this.field_eb + var8 + 101, -92);
                  ii.field_k[0][1].a(var7, var8);
                  var5_ref_bo.a(true);
                  ii.field_k[0][0].a(var7, var8);
                  break;
                }
                this.field_X.field_r.b(-32275)[4].b(var7, var8, 20, 20);
                var7 -= 20;
                var9++;
              } while (var13 == 0);
              var9 = 0;
              do {
                if (!(var9 < gh.field_j.field_e)) {
                  var7 = var4_int + (-80 + sh.field_u);
                  var8 = -151 + gp.field_w;
                  ii.field_k[2][3].a(var7, var8, 0, 16777215 | this.field_bb << 24, 1);
                  var5_ref_bo.a(30 + var7, var7, 135 + var8, -this.field_qb + (103 + var8), param1 + 20115);
                  ii.field_k[2][2].a(var7, var8, 0, 16777215 | this.field_bb << 24, 1);
                  var5_ref_bo.a(true);
                  ii.field_k[2][1].a(var7, var8, 0, this.field_bb << 24 | 16777215, 1);
                  var9 = (int)((1.0 + Math.sin((double)this.field_c * 3.141592653589793 / 20.0)) * (double)this.field_bb / 2.0);
                  break;
                }
                var10 = -(var9 * 100 / gh.field_j.field_e) + (var8 + 100);
                param0.b(var10, var7 + 5, var7 + 10, 1879048192, var10, 1);
                param0.b(var10 + 1, var7 + 5, var7 + 10, 1073741824, var10 + 1, 1);
                var9++;
              } while (var13 == 0);
              stackIn_135_0 = var5_ref_bo;
              stackIn_135_1 = 30 + var7;
              stackIn_135_2 = var7;
              stackIn_135_3 = var8 + 135;
              stackIn_135_4 = 103 + var8 - this.field_qb;
              if (this.field_qb >= 99) {
                stackIn_136_5 = 50;
              } else {
                stackIn_136_5 = 0;
              }
              ((bo) (Object) stackIn_135_0).a(stackIn_135_1, stackIn_135_2, stackIn_135_3, stackIn_135_4 - stackIn_136_5, 100);
              ii.field_k[2][0].a(var7, var8, 0, 16843009 * var9, 2);
              var5_ref_bo.a(true);
              if (this.field_gb > 0) {
                po.field_e[-1 + this.field_gb].a(var7 + 7, 104 + var8, 0, this.field_bb << 24 | 16777215, 1);
              }
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_141_0 = param1;
            stackIn_141_1 = -20240;
          }
          if (stackIn_141_0 != stackIn_141_1) {
            this.field_G = -51;
          }
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3_int >= this.field_K))) {
            var4 = this.field_C[var3_int];
            stackIn_173_0 = -1;
            if (var13 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_173_0 > ~var4.field_d) {
                var5 = var4.field_k >> 8;
                var6 = var4.field_n >> 8;
                var7 = var4.field_m >> 8;
                var8 = (var4.field_d - Math.abs(var4.field_h)) * var4.field_p / var4.field_d;
                if (var4.field_e != 0 ||
                  !(var4.field_h < var4.field_d)) {
                  if ((var4.field_e == 1)) {
                    es.field_b[(var4.field_d + var4.field_p) % es.field_b.length].a(-var7 + var5, var6 - var7, var7 << 1, var7 << 1, 0, var8 << 24 | 16777215, 1);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var8 <= 64) {
                    stackIn_170_0 = var8 << 26 | 16711680;
                  } else {
                    if (var8 <= 192) {
                      stackIn_170_0 = (-64 + var8 | -1107296384) << 9;
                    } else {
                      stackIn_170_0 = var8 - 192 << 2 | -256;
                    }
                  }
                  var9 = stackIn_170_0;
                  param0.b(var6, var5, var4.field_c >> 8, var9, var4.field_g >> 8, param1 ^ -20239);
                }
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_173_0 = this.field_j ? 1 : 0;
          }
          if (stackIn_173_0 != 0 &&
            this.field_W) {
            rb.field_j.a(119, -16711936, -16777216, 50, sh.field_u - 20, Integer.toString(this.field_h));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_183_0 = var3;
          stackIn_183_1 = new StringBuilder().append("pk.V(");
          if (param0 == null) {
            stackIn_184_2 = "null";
          } else {
            stackIn_184_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_183_0), ((StringBuilder) (Object) stackIn_183_1).append(stackIn_184_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, kc param1) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        o[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        o var7 = null;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (this.field_db > 0) {
            this.field_db = this.field_db - 1;
            this.field_sb = this.b(this.field_db, this.field_o, -570490625, this.field_k);
          }
          if (0 < this.field_zb) {
            this.field_zb = this.field_zb - 1;
          }
          if (10 == this.field_zb) {
            lq.a(hp.field_i, -28);
          }
          if (this.field_zb == 0) {
            if (this.field_L <= 0) {
              this.field_zb = -1;
              if (var8 != 0) {
                if (qq.a(20, this.field_L) >= 10) {
                  this.field_zb = 10 + qq.a(20, this.field_L) + (this.field_L >> 1);
                  this.field_zb = qq.a(20, 20) + 10;
                } else {
                  this.field_zb = qq.a(20, 20) + 10;
                }
              }
            } else {
              if (qq.a(20, this.field_L) >= 10) {
                this.field_zb = 10 + qq.a(20, this.field_L) + (this.field_L >> 1);
                if (var8 != 0) {
                  this.field_zb = qq.a(20, 20) + 10;
                }
              } else {
                this.field_zb = qq.a(20, 20) + 10;
              }
            }
          }
          var3_int = np.a(-5, 5, (byte) 75);
          var5 = 125 / ((-14 - param0) / 43);
          var4 = this.field_E;
          var6 = 0;
          while (var6 < var4.length) {
            var7 = var4[var6];
            var7.field_f = var7.field_f + var3_int;
            var7.field_d.a(param1, -30507);
            var7.a(2);
            var7.a(1300000.0 / this.field_kb, -87);
            var6++;
            if (var8 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("pk.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final int a(kc param0, int param1, kc param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          var4_int = param1;
          if (!(600.0 >= this.field_kb)) {
            if (this.field_kb < 1000.0) {
              var4_int = (int)((double)var4_int * (400.0 - (1000.0 - this.field_kb)) / 400.0);
              if (var6 != 0) {
                var4_int = 0;
              }
            }
          } else {
            var4_int = 0;
          }
          if (param0 == param2) {
            stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          var5 = (int)sb.a(param1 ^ 157, param0, param2);
          if (var5 > 1000) {
            var4_int = 0;
          }
          if ((var5 <= 1000 ||
            var6 != 0) &&
            var5 > 10) {
            var4_int = var4_int * (-var5 + 10 + 990) / 990;
          }
          stackIn_17_0 = var4_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("pk.EA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void a(int param0, kc param1, byte param2, int param3) {
        qf dupTemp$1 = null;
        RuntimeException runtimeException = null;
        qf var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n.length <= this.field_w) {
            return;
          }
          var5 = this.field_n[this.field_w];
          if (param2 != -74) {
            this.field_W = false;
          }
          if (var5 == null) {
            dupTemp$1 = new qf();
            this.field_n[this.field_w] = dupTemp$1;
            var5 = dupTemp$1;
          }
          var5.a(-32, param1, param3, param0);
          this.field_w = this.field_w + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("pk.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (this.field_vb != null &&
            !this.field_ob) {
            if (param0 != 11154) {
              this.field_hb = 0.030616966813019907;
            }
            var2_int = 0;
            while (16 > var2_int) {
              if (var3 != 0) {
                return;
              }
              stackIn_19_0 = this.field_Z;
              stackIn_19_1 = var2_int;
              if (sd.field_d[this.field_h][var2_int]) {
                stackIn_20_2 = 255;
              } else {
                stackIn_20_2 = 0;
              }
              stackIn_19_0[stackIn_19_1] = stackIn_20_2;
              this.field_vb.a((byte) -120, this.field_Z[var2_int], var2_int);
              var2_int++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.IA(" + param0 + ')');
        }
    }

    private final void b(md param0, int param1) {
        int stackIn_19_0 = 0;
        int stackIn_23_1 = 0;
        md stackIn_88_0 = null;
        Object stackIn_153_0 = null;
        md stackIn_153_1 = null;
        md stackIn_178_0 = null;
        md stackIn_178_1 = null;
        RuntimeException stackIn_183_0 = null;
        StringBuilder stackIn_183_1 = null;
        String stackIn_184_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        md[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        md var5 = null;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (this.field_yb) {
            boolean decompiledFrameRemainder0 = true;
            if (null != param0.field_n) {
              if (param0.field_n.field_t <= 2) {
                param0.field_n = null;
                decompiledFrameRemainder0 = (var6 != 0);
              }
              if (decompiledFrameRemainder0) {
                return;
              }
            }
            var3_int = qq.a(20, this.field_A.length);
            if (null != this.field_A[var3_int]) {
              stackIn_19_0 = (gh.field_j != param0.field_r) ? 0 : 1;
              if (this.field_A[var3_int].field_r != gh.field_j) {
                stackIn_23_1 = 0;
              } else {
                stackIn_23_1 = 1;
              }
              if ((stackIn_19_0 ^ stackIn_23_1) != 0) {
                param0.field_n = this.field_A[var3_int];
              }
            }
          }
          if (this.field_Cb) {
            param0.field_n = this.field_X;
            return;
          }
          if (param1 > -69) {
            this.field_Eb = true;
          }
          boolean decompiledFrameCompleted0 = true;
          L8: {
            boolean decompiledFrameCompleted1 = true;
            L9: {
              if (ro.field_u == param0.field_r) {
                if (param0.field_n != null) {
                  return;
                }
                var3 = this.field_A;
                var4 = 0;
                while (var4 < var3.length) {
                  var5 = var3[var4];
                  stackIn_153_0 = null;
                  stackIn_153_1 = var5;
                  if (var6 != 0) {
                    while (true) {
                      if (stackIn_153_0 != stackIn_153_1 && (!(2 >= var5.field_t) ||
                        var6 != 0) && (var5.field_r == gh.field_j &&
                        var5.field_n != param0 &&
                        var5.field_g == null)) {
                        break L9;
                      }
                      do {
                        var4++;
                        if (var6 != 0) {
                          break L8;
                        }
                        if (var3.length <= var4) {
                          break L8;
                        }
                        var5 = var3[var4];
                        stackIn_178_0 = this.field_X;
                        stackIn_178_1 = var5;
                      } while (stackIn_178_0 == stackIn_178_1);
                      stackIn_153_0 = null;
                      stackIn_153_1 = var5;
                    }
                  }
                  if (stackIn_153_0 != stackIn_153_1 &&
                    var5.field_t > 2 &&
                    this.field_X != var5 &&
                    var5.field_r != ro.field_u &&
                    var5.field_r != gh.field_j) {
                    if (param0.field_n != null) {
                      param0.field_n.field_g = null;
                    }
                    param0.field_n = var5;
                    return;
                  }
                  var4++;
                  if (var6 == 0) {
                    continue;
                  }
                  break;
                }
                var3 = this.field_A;
                var4 = 0;
                while (true) {
                  if (var3.length > var4) {
                    var5 = var3[var4];
                    stackIn_88_0 = var5;
                    if (var6 == 0) {
                      if (stackIn_88_0 != null &&
                        2 < var5.field_t &&
                        this.field_X != var5 &&
                        ro.field_u != var5.field_r) {
                        if (param0.field_n != null) {
                          param0.field_n.field_g = null;
                        }
                        param0.field_n = var5;
                        return;
                      }
                      var4++;
                      continue;
                    }
                  } else {
                    param0.field_n = this.field_X;
                    stackIn_88_0 = this.field_X;
                  }
                  break;
                }
                stackIn_88_0.field_g = param0;
              }
              if (gh.field_j == param0.field_r) {
                if (null != param0.field_n) {
                  return;
                }
                var3 = this.field_A;
                var4 = 0;
                while (var4 < var3.length) {
                  var5 = var3[var4];
                  if (var6 != 0) {
                    return;
                  }
                  if (var5 != null &&
                    var5.field_t > 2 && (gh.field_j != var5.field_r ||
                    var6 != 0) && (param0 != var5.field_n &&
                    var5.field_g == null)) {
                    if (param0.field_n != null) {
                      param0.field_n.field_g = null;
                    }
                    param0.field_n = var5;
                    var5.field_g = param0;
                    return;
                  }
                  var4++;
                }
                if (var6 == 0) {
                  return;
                }
              }
              if (param0 == this.field_X.field_g) {
                return;
              }
              if (this.field_X.field_g == null) {
                if (param0.field_n != null) {
                  param0.field_n.field_g = null;
                }
                this.field_X.field_g = param0;
                param0.field_n = this.field_X;
                return;
              }
              if (param0.field_n != this.field_X &&
                null != param0.field_n) {
                return;
              }
              var3 = this.field_A;
              var4 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var3.length <= var4))) {
                var5 = var3[var4];
                stackIn_178_0 = this.field_X;
                stackIn_178_1 = var5;
                if (var6 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_178_0 != stackIn_178_1) {
                  stackIn_153_0 = null;
                  stackIn_153_1 = var5;
                  if (stackIn_153_0 != stackIn_153_1 && (!(2 >= var5.field_t) ||
                    var6 != 0) && (var5.field_r == gh.field_j &&
                    var5.field_n != param0 &&
                    var5.field_g == null)) {
                    break;
                  }
                }
                var4++;
              }
              if (decompiledNaturalLoopExit0) {
                decompiledFrameCompleted1 = false;
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              if (param0.field_n != null) {
                param0.field_n.field_g = null;
              }
              var5.field_g = param0;
              param0.field_n = var5;
              return;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_178_0 = (md) (param0);
            stackIn_178_1 = this.field_X;
          }
          stackIn_178_0.field_n = stackIn_178_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_183_0 = var3_ref;
          stackIn_183_1 = new StringBuilder().append("pk.O(");
          if (param0 == null) {
            stackIn_184_2 = "null";
          } else {
            stackIn_184_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_183_0), ((StringBuilder) (Object) stackIn_183_1).append(stackIn_184_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        int discarded$0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_29_0Lifetime1;
        int stackIn_29_1Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          this.field_db = 255;
          this.field_o = this.field_sb;
          var3_int = qq.a(param0 - 8, 220);
          var4 = qq.a(20, 200);
          var4Lifetime1 = 152;
          var5 = qq.a(param0 ^ 8, 128);
          if (param0 != 28) {
            this.a(true, (md) null);
          }
          var5Lifetime1 = 127;
          var3_intLifetime1 = 192;
          this.field_k = var3_intLifetime1 << 24 | this.b(var4Lifetime1, 0, param0 ^ -570490653, this.b(var5Lifetime1, 255, param0 ^ -570490653, 16777215));
          if (var3_intLifetime1 > 190 &&
            var4Lifetime1 > 150) {
            this.field_L = qq.a(param0 ^ 8, 255) + 100;
            if (this.field_zb == -1) {
              this.field_zb = this.field_L;
              if (var9 != 0) {
                this.field_L = -1;
              }
            }
          } else {
            this.field_L = -1;
          }
          var6 = new int[]{1, 3, 4, 6, 8, 20};
          param1 = param1 << 1;
          var7 = 2;
          while (param1 > 0) {
            if (var9 != 0) {
              return;
            }
            var8 = 0;
            while (var6.length > var8) {
              stackIn_29_0 = param1 >> 1;
              stackIn_29_1 = var6[var8];
              if (stackIn_29_0 >= stackIn_29_1) {
                var8++;
                continue;
              }
              break;
            }
            stackIn_29_0Lifetime1 = 0;
            stackIn_29_1Lifetime1 = var8;
            if (stackIn_29_0Lifetime1 < stackIn_29_1Lifetime1) {
              var8--;
            }
            param1 = param1 - var6[var8];
            discarded$0 = this.a((byte) -120, this.b((byte) 108, var8), 1, var7);
            if (var7 > 0) {
              var7--;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.S(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        md var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          this.field_ob = false;
          lm.a(40, tg.field_a[1], true, (byte) -58);
          this.field_vb = wt.field_e.field_s;
          this.field_h = 0;
          this.b(11154);
          this.a(true);
          this.field_Cb = param1;
          to.field_r = null;
          this.field_c = 0;
          wd.field_t.c(268435455);
          if (param0 <= 59) {
            return;
          }
          bo.field_h = 0;
          gh.field_j.field_i = ub.field_h.field_i;
          this.field_J = 0;
          this.field_f = 0;
          this.field_G = 200;
          ei.field_a = 0;
          this.field_nb = 0;
          this.field_x = 0;
          this.field_p = 0;
          this.field_V = 1;
          this.field_Eb = false;
          this.field_tb = 1;
          gh.field_j.field_g = ub.field_h.field_g;
          or.field_a = 0;
          se.field_b = 0;
          this.field_H = 0;
          this.field_v = 0;
          ct.field_x = 0;
          gh.field_j.field_e = ub.field_h.field_e;
          this.field_N = 0;
          gh.field_j.field_d = ub.field_h.field_d;
          r.field_n = 0;
          this.field_d = 0;
          this.field_P = 1;
          gh.field_j.field_f = ub.field_h.field_f;
          var3 = this.field_X;
          this.field_X = new md(new kc(), gh.field_j);
          this.field_X.field_h = po.a(this.a(this.field_X.field_d, 200, this.field_X.field_d), 0, this.field_X.field_r.a((byte) -88));
          this.field_A = new md[16];
          this.field_S = new eu[1000];
          this.field_w = 0;
          this.field_ab = 0;
          this.field_i = new wm[16];
          this.field_Bb = 0;
          this.field_n = new qf[1000];
          this.field_m = true;
          if (null != var3) {
            this.field_X.field_e = var3.field_e;
          }
          this.field_A[0] = this.field_X;
          var4 = 0;
          do {
            if (var4 >= this.field_r.length) {
              this.field_xb = 0;
              this.field_jb = 120;
              this.field_Ab = 0;
              this.field_ub = 80;
              this.field_s = 0;
              this.field_pb = 0;
              tt.field_a = false;
              this.field_F = 3;
              break;
            }
            this.field_r[var4] = -1;
            var4++;
          } while (var5 == 0);
          if (!this.field_Cb) {
            this.f(-20416);
            if (var5 != 0) {
              this.a((byte) 28, 1);
            }
          } else {
            this.a((byte) 28, 1);
          }
          this.field_yb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(kc param0, byte param1) {
        Object stackIn_11_0 = null;
        md stackIn_11_1 = null;
        int stackIn_82_1 = 0;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_173_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        eu var4 = null;
        int var5 = 0;
        md[] var6_ref_md__ = null;
        int var6 = 0;
        int var7 = 0;
        md var8 = null;
        int var9 = 0;
        Object stackIn_11_0Lifetime1;
        Object stackIn_11_0Lifetime2;
        md stackIn_11_1Lifetime1;
        md stackIn_11_1Lifetime2;
        md[] var6_ref_md__Lifetime1;
        md var8Lifetime1;
        md[] var6_ref_md__Lifetime2;
        md var8Lifetime2;
        Object stackIn_11_0Lifetime1Lifetime1;
        md stackIn_11_1Lifetime1Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param1 != -93) {
            return;
          }
          var3_int = 0;
          while (var3_int < this.field_ab) {
            var4 = this.field_S[var3_int];
            if (var9 != 0) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted1 = true;
            if (null != var4) {
              stackIn_11_0 = null;
              stackIn_11_1 = var4.field_i;
              if (stackIn_11_0 == stackIn_11_1 ||
                !uh.a(98, var4.field_i.field_d, 600.0, var4.field_d)) {
                this.d(73, var3_int);
                var3_int--;
                decompiledFrameRemainder0 = false;
              }
              else {
                var4.field_d.a(param0, -30507);
                var4.a(param1 + 95);
                var5 = 0;
                if (null != var4.field_i) {
                  if (ro.field_u != var4.field_i.field_r) {
                    if (var4.field_i.field_r != gh.field_j) {
                      var6_ref_md__ = this.field_A;
                      var7 = 0;
                      L42: while (true) {
                        if (var6_ref_md__.length > var7) {
                          var8 = var6_ref_md__[var7];
                          stackIn_11_0Lifetime1 = null;
                          stackIn_11_1Lifetime1 = var8;
                          if (stackIn_11_0Lifetime1 != stackIn_11_1Lifetime1 &&
                            var8.field_k > 0 && ((var8.field_r == gh.field_j ||
                            var9 != 0) &&
                            (this.field_X != var8 ||
                            this.field_jb <= 0) &&
                            (uh.a(param1 + 217, var8.field_d, (double)(2 * var8.field_r.field_a), var4.field_d) ||
                            var9 != 0))) {
                            var8.field_q = 256;
                            var8.field_k = var8.field_k - 1;
                            var5 = 1;
                            break L42;
                          }
                          var7++;
                          continue;
                        }
                        break;
                      }
                    } else {
                      var6_ref_md__ = this.field_A;
                      var7 = 0;
                      L48: while (true) {
                        if (var7 < var6_ref_md__.length) {
                          var8 = var6_ref_md__[var7];
                          stackIn_11_0Lifetime1 = null;
                          stackIn_11_1Lifetime1 = var8;
                          if (stackIn_11_0Lifetime1 != stackIn_11_1Lifetime1 && (!(var8.field_k <= 0) ||
                            var9 != 0) && var8.field_r != gh.field_j && (uh.a(param1 + 185, var8.field_d, (double)(var8.field_r.field_a * 2), var4.field_d) ||
                            var9 != 0)) {
                            if (var4.field_i == this.field_X) {
                              this.field_pb = this.field_pb + 1;
                            }
                            var8.field_k = var8.field_k - 1;
                            var5 = 1;
                            var8.field_q = 256;
                            if (this.field_X == var4.field_i) {
                              stackIn_82_1 = 50;
                            } else {
                              stackIn_82_1 = 25;
                            }
                            this.e(stackIn_82_1 * this.field_V, -54);
                            if (var8.field_k != 0) {
                              break L48;
                            }
                            if (var8.field_v <= -1) {
                              break L48;
                            }
                            this.a(var8.field_d, param1 + 32690, var8.field_v);
                            var8.field_v = -1;
                            break L48;
                          }
                          var7++;
                          continue;
                        }
                        break;
                      }
                    }
                  } else {
                    var6_ref_md__Lifetime2 = this.field_A;
                    var7Lifetime2 = 0;
                    L55: while (true) {
                      if (var6_ref_md__Lifetime2.length > var7Lifetime2) {
                        var8Lifetime2 = var6_ref_md__Lifetime2[var7Lifetime2];
                        stackIn_11_0Lifetime1Lifetime1 = null;
                        stackIn_11_1Lifetime1Lifetime1 = var8Lifetime2;
                        if (stackIn_11_0Lifetime1Lifetime1 != stackIn_11_1Lifetime1Lifetime1 &&
                          0 < var8Lifetime2.field_k && ((ro.field_u != var8Lifetime2.field_r ||
                          var9 != 0) &&
                          (this.field_X != var8Lifetime2 ||
                          this.field_jb <= 0 ||
                          var9 != 0)) && uh.a(param1 + 199, var8Lifetime2.field_d, (double)(2 * var8Lifetime2.field_r.field_a), var4.field_d)) {
                          var8Lifetime2.field_k = var8Lifetime2.field_k - 1;
                          var5 = 1;
                          var8Lifetime2.field_q = 256;
                          if (var8Lifetime2.field_k != 0) {
                            break L55;
                          }
                          if (var8Lifetime2.field_v <= -1) {
                            break L55;
                          }
                          this.a(var8Lifetime2.field_d, 32597, var8Lifetime2.field_v);
                          var8Lifetime2.field_v = -1;
                          break L55;
                        }
                        var7Lifetime2++;
                        continue;
                      }
                      break;
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var6_ref_md__Lifetime1 = this.field_A;
                  var7Lifetime1 = 0;
                  while (var7Lifetime1 < var6_ref_md__Lifetime1.length) {
                    var8Lifetime1 = var6_ref_md__Lifetime1[var7Lifetime1];
                    stackIn_11_0Lifetime2 = null;
                    stackIn_11_1Lifetime2 = var8Lifetime1;
                    if (stackIn_11_0Lifetime2 != stackIn_11_1Lifetime2 && (!(0 >= var8Lifetime1.field_k) ||
                      var9 != 0) && gh.field_j != var8Lifetime1.field_r && (this.field_X != var8Lifetime1 ||
                      0 >= this.field_jb ||
                      var9 != 0) && (uh.a(122, var8Lifetime1.field_d, (double)(var8Lifetime1.field_r.field_a * 2), var4.field_d) ||
                      var9 != 0)) {
                      var8Lifetime1.field_k = var8Lifetime1.field_k - 1;
                      var8Lifetime1.field_q = 256;
                      var5 = 1;
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    var7Lifetime1++;
                  }
                  decompiledFrameRemainder1 = !(decompiledFrameCompleted1);
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1)) {
              while (true) {
                this.d(73, var3_int);
                var3_int--;
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (var5 != 0)) {
              var4.a(2);
              this.a(80, var4.field_d, (byte) -74, -20);
              var6 = this.a(this.field_X.field_d, param1 + 293, var4.field_d);
              if (var6 < 1) {
                return;
              }
              bo.a(lp.field_g, var6, 23187);
              this.d(42, var3_int);
              var3_int--;
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_172_0 = var3;
          stackIn_172_1 = new StringBuilder().append("pk.C(");
          if (param0 == null) {
            stackIn_173_2 = "null";
          } else {
            stackIn_173_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_172_0), ((StringBuilder) (Object) stackIn_172_1).append(stackIn_173_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void f(int param0, int param1) {
        RuntimeException runtimeException = null;
        vc var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l = this.field_l - 1;
          if (~param0 == ~this.field_l) {
            return;
          }
          var3 = this.field_z[param0];
          this.field_z[param0] = this.field_z[this.field_l];
          if (param1 != 10355) {
            this.field_Eb = false;
          }
          this.field_z[this.field_l] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.M(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, md param1) {
        eu dupTemp$0 = null;
        eu dupTemp$1 = null;
        eu dupTemp$2 = null;
        eu stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_32_3 = 0;
        eu stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_40_3 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        eu var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        eu var4Lifetime1;
        eu var4Lifetime1Lifetime1;
        double var6Lifetime1;
        double var6Lifetime1Lifetime1;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          var3_int = param1.field_r.field_b;
          if (1 == param1.field_m) {
            var3_int = 1;
          }
          if (param1.field_m == 2) {
            var3_int = 2;
          }
          if (this.field_ab >= -var3_int + this.field_S.length) {
            return;
          }
          var4 = this.field_S[this.field_ab];
          var5 = param1.field_r.field_c;
          var6 = (double)np.a(-var5, var5, (byte) 83) / 300.0;
          if (var3_int != 1) {
            if (var4 == null) {
              dupTemp$0 = new eu();
              this.field_S[this.field_ab] = dupTemp$0;
              var4 = dupTemp$0;
            }
            var4.a(0, 0, var6, param1);
            this.field_ab = this.field_ab + 1;
            if (param1 == this.field_X) {
              this.field_Ab = this.field_Ab + 1;
            }
          }
          if (param0 < 9) {
            this.field_rb = true;
          }
          if (0 < var3_int) {
            var6Lifetime1 = (double)np.a(-var5, var5, (byte) 83) / 100.0;
            var4Lifetime1 = this.field_S[this.field_ab];
            if (var4Lifetime1 == null) {
              dupTemp$1 = new eu();
              this.field_S[this.field_ab] = dupTemp$1;
              var4Lifetime1 = dupTemp$1;
            }
            stackIn_31_0 = var4Lifetime1;
            stackIn_31_1 = param1.field_r.field_a;
            stackIn_31_2 = 0;
            if (2 != var3_int) {
              stackIn_32_3 = 0;
            } else {
              stackIn_32_3 = 10;
            }
            ((eu) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, (double)stackIn_32_3 + var6Lifetime1, param1);
            this.field_ab = this.field_ab + 1;
            var4Lifetime1Lifetime1 = this.field_S[this.field_ab];
            var6Lifetime1Lifetime1 = (double)np.a(-var5, var5, (byte) -67) / 100.0;
            if (var4Lifetime1Lifetime1 == null) {
              dupTemp$2 = new eu();
              this.field_S[this.field_ab] = dupTemp$2;
              var4Lifetime1Lifetime1 = dupTemp$2;
            }
            stackIn_39_0 = var4Lifetime1Lifetime1;
            stackIn_39_1 = -param1.field_r.field_a;
            stackIn_39_2 = 0;
            if (var3_int == 2) {
              stackIn_40_3 = -10;
            } else {
              stackIn_40_3 = 0;
            }
            ((eu) (Object) stackIn_39_0).a(stackIn_39_1, stackIn_39_2, (double)stackIn_40_3 + var6Lifetime1Lifetime1, param1);
            if (param1 == this.field_X) {
              this.field_Ab = this.field_Ab + 2;
            }
            this.field_ab = this.field_ab + 1;
          }
          var8 = this.a(this.field_X.field_d, 200, param1.field_d);
          if (var8 < 1) {
            return;
          }
          if (ro.field_u != param1.field_r) {
            if (param1.field_m == 3) {
              bo.a(fd.field_b[3], var8, 23187);
              if (var9 == 0) {
                return;
              }
            }
            if (var3_int == 2) {
              bo.a(fd.field_b[2], var8, 23187);
              if (var9 == 0) {
                return;
              }
            }
            if (1 != var3_int) {
              bo.a(fd.field_b[0], var8, 23187);
              if (var9 == 0) {
                return;
              }
            }
            bo.a(fd.field_b[1], var8, 23187);
            if (var9 == 0) {
              return;
            }
          }
          bo.a(fd.field_b[4], var8, 23187);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_74_0 = var3;
          stackIn_74_1 = new StringBuilder().append("pk.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    private final void a(md param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = (int)(param0.field_d.field_a / 3.0);
          var4 = (int)(param0.field_d.field_b / 3.0);
          var5 = (int)(this.field_t - (double)(1720 * this.field_fb));
          var6 = (int)(this.field_Y - (double)(1280 * this.field_O));
          this.a(-var6 + var4, param1 - 22703, -var5 + var3_int, param0.field_r.field_a << 2);
          if (param1 != 8073) {
            this.a((ha) null, -110);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("pk.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, boolean param7, int param8) {
        int stackIn_8_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        ha var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = (int)(Math.cos(3.141592653589793 * (double)param4 / 20.0) * 10.0);
                        var11 = (int)(100.0 * Math.sin(3.141592653589793 * (double)param4 / 20.0));
                        var12 = field_wb.a((byte) 95);
                        var13 = param7 ? 1 : 0;
                        var14 = param7 ? 1 : 0;
                        if (param8 == 10) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.f(94);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        statePc = ((Object) stateCaught_2 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_2);
                        }
                        caughtException = stateCaught_2;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param7) {
                            /* Inlined CFG state: 7. */
                            {
                                stackIn_8_0 = 0;
                                statePc = 8;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 5. */
                            {
                                stackIn_8_0 = 1;
                                statePc = 8;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_4) {
                        statePc = ((Object) stateCaught_4 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_4);
                        }
                        caughtException = stateCaught_4;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var15 = stackIn_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        statePc = ((Object) stateCaught_8 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_8);
                        }
                        caughtException = stateCaught_8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var16 = param0 % 10;
                        var17 = param5 % 10;
                        if (!param3) {
                            statePc = 35;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        statePc = ((Object) stateCaught_9 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_9);
                        }
                        caughtException = stateCaught_9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var15 == 0) {
                            /* Inlined CFG state: 13. */
                            {
                                if (0 != param5) {
                                    statePc = 19;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 14. */
                                    {
                                        var17 = 10;
                                        if (var14 != 0) {
                                            /* Inlined CFG state: 17. */
                                            {
                                                var17 += 22;
                                                statePc = 18;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 15. */
                                            {
                                                statePc = 18;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 11. */
                            {
                                statePc = 35;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14 = 0;
                        if (var18 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        statePc = ((Object) stateCaught_18 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_18);
                        }
                        caughtException = stateCaught_18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!param7) {
                            statePc = 24;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 20. */
                            {
                                /* Sequential CFG blocks: 20, 22. */
                                {
                                }
                                {
                                    var17 += 22;
                                    statePc = 24;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_19) {
                        statePc = ((Object) stateCaught_19 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_19);
                        }
                        caughtException = stateCaught_19;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (0 != param0) {
                            statePc = 29;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 25. */
                            {
                                var16 = 10;
                                if (var13 == 0) {
                                    statePc = 28;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 26. */
                                    {
                                        var16 += 22;
                                        statePc = 28;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_24) {
                        statePc = ((Object) stateCaught_24 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_24);
                        }
                        caughtException = stateCaught_24;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var13 = 0;
                        if (var18 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        statePc = ((Object) stateCaught_28 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_28);
                        }
                        caughtException = stateCaught_28;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param7) {
                            /* Inlined CFG state: 34. */
                            {
                                var16 += 22;
                                statePc = 35;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 30. */
                            {
                                /* Sequential CFG blocks: 30, 32. */
                                {
                                }
                                {
                                    statePc = 35;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_29) {
                        statePc = ((Object) stateCaught_29 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_29);
                        }
                        caughtException = stateCaught_29;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var15 = 0;
                        in.field_c[var17].a(param6, param2);
                        in.field_c[var16 + 11].a(param6, 10 + param2);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        statePc = ((Object) stateCaught_35 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_35);
                        }
                        caughtException = stateCaught_35;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (~var17 != ~var16) {
                            /* Inlined CFG state: 38. */
                            {
                                if (var10_int < 0) {
                                    statePc = 42;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 39. */
                                    {
                                        in.field_c[11 + var17].b(param6, 10 + param2, 16, var10_int);
                                        var12.d(var10_int, 16, param2 + 10, -5782, var11 << 24 | 16777215, param6);
                                        if (var18 == 0) {
                                            statePc = 44;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 40. */
                                            {
                                                statePc = 42;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 37. */
                            {
                                statePc = 44;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        in.field_c[var16].b(param6, var10_int + 10 + param2, 16, -var10_int);
                        var12.d(-var10_int, 16, param2 + 10 + var10_int, -5782, (var11 | -739482368) << 24, param6);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        statePc = ((Object) stateCaught_42 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_42);
                        }
                        caughtException = stateCaught_42;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        param0 = param0 / 10;
                        param5 = param5 / 10;
                        param1--;
                        param6 -= 17;
                        if (param1 > 0) {
                            statePc = 9;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        statePc = ((Object) stateCaught_44 instanceof RuntimeException ? 47 : -1);
                        if (statePc == -1) {
                            throw pk.<RuntimeException>$cfr$sneakyThrow(stateCaught_44);
                        }
                        caughtException = stateCaught_44;
                        continue stateLoop;
                    }
                }
                case 45: {
                    if (var18 != 0) {
                        statePc = 36;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 48. */
                        {
                            return;
                        }
                    }
                }
                case 47: {
                    var10 = (RuntimeException) ((Object) caughtException);
                    throw pn.a((Throwable) ((Object) var10), "pk.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0, int param1) {
        qf var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_w = this.field_w - 1;
          if (param0 == this.field_w) {
            return;
          }
          if (param1 != -690800984) {
            this.field_ub = -99;
          }
          var3 = this.field_n[param0];
          this.field_n[param0] = this.field_n[this.field_w];
          this.field_n[this.field_w] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(byte param0, int param1) {
        RuntimeException runtimeException = null;
        ok var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_K = this.field_K - 1;
          if (param1 == this.field_K) {
            return;
          }
          var3 = this.field_C[param1];
          this.field_C[param1] = this.field_C[this.field_K];
          this.field_C[this.field_K] = var3;
          if (param0 != -94) {
            this.b((byte) -55);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        ga stackIn_12_0 = null;
        ga stackIn_12_1 = null;
        ga stackIn_13_0 = null;
        ga stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_15_3;
        int stackIn_16_4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ga stackIn_13_0Lifetime1;
        ga stackIn_13_1Lifetime1;
        try {
          if (to.field_r == null &&
            this.field_q > 0 &&
            !tt.field_a) {
            stackIn_12_0 = null;
            stackIn_12_1 = null;
            if (this.field_Cb) {
              stackIn_13_0 = null;
              stackIn_13_1 = null;
              stackIn_13_2 = 1;
            } else {
              stackIn_13_0 = null;
              stackIn_13_1 = null;
              stackIn_13_2 = 0;
            }
            stackIn_15_3 = 65535;
            if (!this.field_Cb) {
              stackIn_13_0Lifetime1 = null;
              stackIn_13_1Lifetime1 = null;
              stackIn_16_4 = 0;
            } else {
              stackIn_13_0Lifetime1 = null;
              stackIn_13_1Lifetime1 = null;
              stackIn_16_4 = 1;
            }
            to.field_r = new ga(stackIn_13_2, stackIn_15_3 ^ stackIn_16_4, ct.field_x, bo.field_h, se.field_b, ei.field_a, new int[]{100 * this.field_q + this.field_b});
            if (!cn.b(true)) {
              ak.a(to.field_r, true, 3);
            }
          }
          if (param0 != -8) {
            this.field_Z = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.GA(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        md[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        md var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          se.field_b = se.field_b + 8;
          ei.field_a = ei.field_a - 3;
          bo.field_h = bo.field_h - 5;
          ct.field_x = ct.field_x + 10;
          if (!this.field_yb) {
            if (!this.field_Cb &&
              bk.field_f >= 16 &&
              22 >= bk.field_f) {
              this.a(1, bk.field_f - 16);
              return;
            }
            if (bk.field_f == 13 &&
              !this.field_g) {
              this.field_g = true;
              eu.a((byte) 111, 1, false);
              return;
            }
            if (this.field_j &&
              lp.field_a[81]) {
              if (bk.field_f == 5) {
                tt.field_a = true;
                this.field_W = false;
              }
              if (bk.field_f == 7) {
                this.field_W = true;
                if (this.field_h < -1 + sd.field_d.length) {
                  this.field_h = this.field_h + 1;
                }
                tt.field_a = true;
              }
              if (bk.field_f == 6) {
                this.field_W = true;
                if (this.field_h > 0) {
                  this.field_h = this.field_h - 1;
                }
                tt.field_a = true;
              }
              if (bk.field_f == 1) {
                this.field_gb = 1;
                tt.field_a = true;
                this.field_X.field_x = 100;
                this.field_X.field_m = 1;
              }
              if (bk.field_f == 2) {
                tt.field_a = true;
                this.field_gb = 2;
                this.field_X.field_m = 2;
                this.field_X.field_x = 100;
              }
              if (bk.field_f == 3) {
                tt.field_a = true;
                this.field_X.field_x = 100;
                this.field_gb = 3;
                this.field_X.field_m = 3;
              }
              if (8 == bk.field_f) {
                this.field_F = this.field_F + 1;
                tt.field_a = true;
                this.field_X.field_k = 0;
              }
              if (bk.field_f == 4) {
                this.field_X.field_x = 100;
                this.field_gb = 4;
                tt.field_a = true;
                this.field_X.field_m = 4;
              }
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameCompleted1 = true;
              if (70 == bk.field_f) {
                this.field_p = 400;
                tt.field_a = true;
                wd.field_t.c(268435455);
                var2_int = -1;
                while (var2_int < 8) {
                  nk.field_g.a(95, new iq(var2_int));
                  var2_int++;
                  if (var5 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameRemainder1 = (bk.field_f == 38))) {
                tt.field_a = true;
              }
              if (decompiledFrameRemainder1) {
                discarded$0 = this.a((byte) 108, ro.field_u, 1, 0);
              }
              if (bk.field_f == 51) {
                tt.field_a = true;
                or.field_a = or.field_a + 13;
              }
              if (bk.field_f == 65) {
                tt.field_a = true;
                this.field_V = this.field_V + 1;
              }
              if (bk.field_f == 49) {
                tt.field_a = true;
                discarded$1 = this.a((byte) -123, ju.field_k, 1, 0);
              }
              if (bk.field_f == 41) {
                tt.field_a = true;
                this.a(new kc(100.0, 100.0), 32597, 2);
              }
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted0 = true;
              if (bk.field_f == 33) {
                tt.field_a = true;
                var2 = this.field_A;
                var3 = 0;
                while (var3 < var2.length) {
                  var4 = var2[var3];
                  if (var5 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if ((var4 != null ||
                    var5 != 0) &&
                    var4.field_r != gh.field_j) {
                    var4.field_k = 0;
                  }
                  var3++;
                }
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder0 = (56 == bk.field_f);
              }
              if ((decompiledFrameRemainder0) &&
                (this.field_db > 1)) {
                this.field_db = 1;
              }
              if (bk.field_f == 52) {
                this.field_Eb = this.field_Eb ^ true;
                tt.field_a = true;
              }
              if (bk.field_f == 50) {
                mj.field_b = mj.field_b ^ true;
              }
              if (bk.field_f == 65) {
                this.a(0, -14630, 0, 64);
                tt.field_a = true;
              }
            }
          }
          if (param0 < 31) {
            this.field_eb = -94;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.NA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        ok var8 = null;
        ok dupTemp$0 = null;
        if (this.field_C.length <= this.field_K) {
          return;
        }
        try {
          int var9 = 23 % ((24 - param6) / 62);
          var8 = this.field_C[this.field_K];
          if (null == var8) {
            dupTemp$0 = new ok();
            this.field_C[this.field_K] = dupTemp$0;
            var8 = dupTemp$0;
          }
          var8.a(param3, param1, param5, param2, param4, param0, -1588713311);
          this.field_K = this.field_K + 1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pk.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 32458) {
            field_e = (hc) null;
          }
          field_wb = null;
          field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "pk.BA(" + param0 + ')');
        }
    }

    private final void a(kc param0, int param1, int param2, int param3, int param4) {
        qf dupTemp$1 = null;
        RuntimeException runtimeException = null;
        qf var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            return;
          }
          if (this.field_n.length <= this.field_w) {
            return;
          }
          var6 = this.field_n[this.field_w];
          if (var6 == null) {
            dupTemp$1 = new qf();
            this.field_n[this.field_w] = dupTemp$1;
            var6 = dupTemp$1;
          }
          var6.a(param2, 122, param1, param4, param0);
          this.field_w = this.field_w + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("pk.DB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(kc param0, boolean param1) {
        int incrementValue$0 = 0;
        boolean discarded$1 = false;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        wm var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param1) {
            this.field_Y = -0.6422101977961518;
          }
          var3_int = 0;
          while (var3_int < this.field_Bb) {
            var4 = this.field_i[var3_int];
            var4.field_d.a(param0, -30507);
            var4.field_g = var4.field_g - 1;
            if (var5 != 0) {
              return;
            }
            if (var4.field_g <= 0) {
              if (!(var4.field_g > -184)) {
                incrementValue$0 = var3_int;
                var3_int--;
                this.a(false, incrementValue$0);
              }
            } else {
              if (uh.a(99, var4.field_d, (double)(this.field_X.field_r.field_a + 16), this.field_X.field_d)) {
                if (var4.field_k >= 4) {
                  discarded$1 = this.c((byte) -95, var4.field_k - 4);
                  incrementValue$2 = var3_int;
                  var3_int--;
                  this.a(false, incrementValue$2);
                } else {
                  this.field_gb = var4.field_k + 1;
                  this.field_X.field_x = 100;
                  this.field_X.field_m = 1 + var4.field_k;
                  bm.a((byte) -70, uh.field_g[1]);
                  this.a(50, (byte) -127, -16711681, ke.field_c[var4.field_k]);
                  incrementValue$3 = var3_int;
                  var3_int--;
                  this.a(false, incrementValue$3);
                }
              }
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("pk.U(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, String param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wd.field_t.a(82, new tb(param3, param2, param0));
          if (param1 > -34) {
            this.a(-63, -32, -115, -32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        ok dupTemp$1 = null;
        RuntimeException runtimeException = null;
        ok var8 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_C.length <= this.field_K) {
            return;
          }
          var8 = this.field_C[this.field_K];
          if (null == var8) {
            dupTemp$1 = new ok();
            this.field_C[this.field_K] = dupTemp$1;
            var8 = dupTemp$1;
          }
          if (param3 > -35) {
            field_wb = (l) null;
          }
          var8.a(param1, false, param4, param0, param2, param6, param5);
          this.field_K = this.field_K + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void b(byte param0, md param1) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        md var4 = null;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          var3_int = 0;
          while (this.field_A.length > var3_int) {
            var4 = this.field_A[var3_int];
            if (var5 != 0) {
              return;
            }
            if (null == var4 ||
              var4 != this.field_X &&
              !(var4.field_t > 2)) {
              this.field_A[var3_int] = param1;
            } else {
              var3_int++;
              continue;
            }
            break;
          }
          if (param0 < 111) {
            this.e(-75, 118);
          }
          discarded$2 = this.a(this.field_X.field_d, 200, param1.field_d);
          param1.field_h = po.a(this.a(this.field_X.field_d, 200, param1.field_d), 0, param1.field_r.a((byte) -66));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_27_0 = runtimeException;
          stackIn_27_1 = new StringBuilder().append("pk.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final void e(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_int = or.field_a;
          or.field_a = or.field_a + param0;
          if (qq.a(20, 10) < 5) {
            if (5 > qq.a(20, 10)) {
              se.field_b = se.field_b + param0;
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              ei.field_a = ei.field_a + param0;
              if (var5 != 0) {
                if (qq.a(20, 10) >= 5) {
                  ct.field_x = ct.field_x - param0;
                  bo.field_h = bo.field_h - param0;
                } else {
                  bo.field_h = bo.field_h - param0;
                }
              }
            }
          } else {
            if (qq.a(20, 10) >= 5) {
              ct.field_x = ct.field_x - param0;
              if (var5 != 0) {
                bo.field_h = bo.field_h - param0;
              }
            } else {
              bo.field_h = bo.field_h - param0;
            }
          }
          if (!this.field_yb &&
            !this.field_Cb) {
            if (var3_int < 5000 &&
              or.field_a >= 5000) {
              fm.a(255, (byte) 111, 0);
            }
            if (var3_int < 30000 &&
              or.field_a >= 30000) {
              fm.a(254, (byte) 111, 1);
            }
            if (var3_int < 80000 &&
              or.field_a >= 80000) {
              fm.a(253, (byte) 111, 2);
            }
          }
          var4 = -30 / ((26 - param1) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.LA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_r[param1] > 0) {
            if (this.field_r[param1] > 448) {
              this.field_r[param1] = 512 - this.field_r[param1];
              if ((AceOfSkies.field_G) &&
                (this.field_r[param1] > 64)) {
                this.field_r[param1] = 64;
              }
            } else {
              if (this.field_r[param1] > 64) {
                this.field_r[param1] = 64;
              }
            }
          }
          var3_int = param1 + param0;
          if (this.field_p >= var3_int &&
            this.c((byte) -14, param1)) {
            this.field_p = this.field_p - var3_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 0) {
            stackIn_2_0 = param3;
            return stackIn_2_0;
          }
          if (256 <= param0) {
            stackIn_5_0 = param1;
            return stackIn_5_0;
          }
          var5_int = 256 - param0;
          var6 = (16711935 & param1) * param0 + (param3 & 16711935) * var5_int >>> 8 & param2;
          var7 = (16711890 & (65280 & param1) * param0 + var5_int * (65280 & param3)) >>> 8;
          var8 = param0 * (16711680 & param1 >>> 8) + var5_int * ((-16777216 & param3) >>> 8) & -16777216;
          stackIn_7_0 = var6 | var8 | var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var5), "pk.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0) {
        int discarded$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -19054) {
            this.c(-82, -76);
          }
          discarded$1 = this.a((byte) -8, gh.field_j, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.TA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        wm var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_Bb = this.field_Bb - 1;
          if (~param1 == ~this.field_Bb) {
            return;
          }
          if (param0) {
            this.a((byte) -109);
          }
          var3 = this.field_i[param1];
          this.field_i[param1] = this.field_i[this.field_Bb];
          this.field_i[this.field_Bb] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0, int param1) {
        eu var3 = null;
        this.field_ab = this.field_ab - 1;
        if (~this.field_ab == ~param1) {
          return;
        }
        try {
          var3 = this.field_S[param1];
          this.field_S[param1] = this.field_S[this.field_ab];
          this.field_S[this.field_ab] = var3;
          int var4 = -12 / ((-3 - param0) / 40);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pk.UA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        int discarded$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        kc stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        md stackIn_169_0 = null;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        md stackIn_265_0 = null;
        md stackIn_297_0 = null;
        int stackIn_371_0 = 0;
        int stackIn_371_1 = 0;
        double stackIn_381_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        kc var3 = null;
        RuntimeException var3_ref = null;
        md[] var4_ref_md__ = null;
        int var4 = 0;
        int var5 = 0;
        md var6_ref_md = null;
        int var6_int = 0;
        md[] var6_ref_md__ = null;
        o[] var6_ref_o__ = null;
        wm[] var6_ref_wm__ = null;
        eu[] var6_ref_eu__ = null;
        qf[] var6_ref_qf__ = null;
        double var6 = 0.0;
        int var7 = 0;
        int var8_int = 0;
        md var8_ref_md = null;
        md[] var8_ref_md__ = null;
        o var8_ref_o = null;
        wm var8_ref_wm = null;
        eu var8_ref_eu = null;
        qf var8_ref_qf = null;
        double var8 = 0.0;
        int var9 = 0;
        md[] var10_ref_md__ = null;
        int var10_int = 0;
        md var10_ref_md = null;
        double var10 = 0.0;
        int var11 = 0;
        md var12_ref_md = null;
        double var12 = 0.0;
        kc var14 = null;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        md[] var4_ref_md__Lifetime1;
        md var6_ref_mdLifetime1;
        md[] var6_ref_md__Lifetime1;
        md var8_ref_mdLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var7Lifetime2;
        int var5Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        var19 = AceOfSkies.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameCompleted6 = true;
          this.b(24260, 10);
          if (param1) {
            while (ek.a((byte) -126)) {
              this.a((byte) 73);
              if (var19 != 0) {
                decompiledFrameCompleted6 = false;
                break;
              }
            }
          }
          if (((decompiledFrameCompleted6) && (!this.field_g &&
            !this.field_yb)) &&
            (decompiledFrameRemainder2 = !(this.field_R <= 0))) {
            this.field_R = this.field_R - 5;
            decompiledFrameRemainder2 = (var19 != 0);
          }
          if ((decompiledFrameRemainder2) &&
            (this.field_R < 200)) {
            this.field_R = this.field_R + 5;
          }
          this.c(-115);
          if (this.field_g) {
            return;
          }
          this.field_c = this.field_c + 1;
          var3 = new kc(this.field_X.field_d);
          this.field_Y = this.field_Y - this.field_X.field_d.field_b / 3.0;
          this.field_t = this.field_t - this.field_X.field_d.field_a / 3.0;
          this.a((byte) 76, var3);
          var4_ref_md__ = this.field_A;
          var5 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var5 >= var4_ref_md__.length))) {
            var6_ref_md = var4_ref_md__[var5];
            if (var19 == 0) {
              if (null != var6_ref_md) {
                this.a(-106, var6_ref_md, var3);
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_38_1 = var3;
            stackIn_39_2 = !(param0);
            this.a(stackIn_38_1, stackIn_39_2);
            this.a(var3, (byte) -93);
            this.a(var3, 4473924);
          }
          var4 = 0;
          L10: while (true) {
            if (var4 < 7) {
              stackIn_261_0 = -1;
              stackIn_261_1 = ~this.field_r[var4];
              if (var19 == 0) {
                if (stackIn_261_0 >= stackIn_261_1 ||
                  this.field_p <= var4) {
                  if (this.field_r[var4] > 0) {
                    this.field_r[var4] = this.field_r[var4] - 1;
                  }
                } else {
                  this.field_r[var4] = 512;
                }
                var4++;
                continue;
              }
            } else {
              boolean decompiledFrameRemainder1 = true;
              if (!this.field_yb) {
                if (this.field_lb < 0) {
                  var4 = 0;
                  var5Lifetime1 = 0;
                  var6_int = 0;
                  var7 = 0;
                  var8_int = 0;
                  var9 = 0;
                  var10_ref_md__ = this.field_A;
                  var11 = 0;
                  L20: while (true) {
                    if (var10_ref_md__.length > var11) {
                      var12_ref_md = var10_ref_md__[var11];
                      stackIn_169_0 = var12_ref_md;
                      if (var19 == 0) {
                        if (stackIn_169_0 != null &&
                          gh.field_j != var12_ref_md.field_r &&
                          var12_ref_md.field_t > 2) {
                          if (var12_ref_md.field_r == sl.field_p) {
                            var8_int++;
                          }
                          if (var12_ref_md.field_r == qq.field_g) {
                            var7++;
                          }
                          if (gm.field_y == var12_ref_md.field_r) {
                            var6_int++;
                          }
                          if (ro.field_u == var12_ref_md.field_r) {
                            var9++;
                          }
                          if (ju.field_k == var12_ref_md.field_r) {
                            var5Lifetime1++;
                          }
                          var4++;
                        }
                        var11++;
                        continue;
                      }
                    } else {
                      if (0 < var4 &&
                        !this.field_W) {
                        boolean decompiledFrameRemainder0 = true;
                        boolean decompiledFrameCompleted5 = true;
                        if (var9 > 0 &&
                          !this.field_ob) {
                          this.field_ob = true;
                          lm.a(20, tg.field_a[2], true, (byte) -106);
                          var10_int = 0;
                          while (var10_int < 16) {
                            wt.field_e.field_s.a((byte) -119, 256, var10_int);
                            var10_int++;
                            if (var19 != 0) {
                              decompiledFrameCompleted5 = false;
                              break;
                            }
                          }
                          decompiledFrameRemainder0 = !(decompiledFrameCompleted5);
                        }
                        if ((decompiledFrameRemainder0) && (decompiledFrameCompleted5) && (var9 == 0 &&
                          this.field_ob)) {
                          this.field_ob = false;
                          lm.a(20, tg.field_a[1], true, (byte) 115);
                          this.b(11154);
                        }
                        if (~var4 != ~var5Lifetime1) {
                          if (var5Lifetime1 > 0 ||
                            var7 > 0) {
                            this.field_h = 3;
                          }
                          if (!(var5Lifetime1 > 0) &&
                            !(var7 > 0) || var19 != 0) {
                            if (var6_int <= 0 &&
                              var8_int <= 4) {
                              if (var8_int > 0) {
                                this.field_h = 1;
                                if (var19 != 0) {
                                  this.field_h = 0;
                                  this.field_h = 2;
                                  this.field_h = 4;
                                }
                              } else {
                                this.field_h = 0;
                                if (var19 != 0) {
                                  this.field_h = 2;
                                  this.field_h = 4;
                                }
                              }
                            } else {
                              this.field_h = 2;
                              if (var19 != 0) {
                                this.field_h = 4;
                              }
                            }
                          }} else {
                          this.field_h = 4;
                        }
                      }
                      if (this.field_Cb) {
                        if (0 < var4) {
                          break L20;
                        }
                        this.field_xb = this.field_xb + 1;
                        this.a((byte) 28, this.field_xb + 1);
                        if (var19 == 0) {
                          break L20;
                        }
                      }
                      if (var4 > (this.field_s / 5)) {
                        break L20;
                      }
                      if (this.field_s >= (oe.field_f.length - 1)) {
                        if (0 < var4) {
                          break L20;
                        }
                        this.a(-16711936, (byte) -32, "Congratulations!");
                        this.field_lb = 100;
                        if (var19 == 0) {
                          break L20;
                        }
                      }
                      this.field_xb = this.field_xb + 1;
                      this.field_s = this.field_s + 1;
                      stackIn_169_0 = this.field_X;
                    }
                    if (stackIn_169_0.field_k > 0) {
                      this.field_X.field_k = this.field_X.field_k + (this.field_X.field_r.field_e >> 1);
                    }
                    if (this.field_X.field_r.field_e < this.field_X.field_k) {
                      this.field_X.field_k = this.field_X.field_r.field_e;
                    }
                    this.f(-20416);
                    break;
                  }
                  decompiledFrameRemainder1 = (var19 != 0);
                }
                if (decompiledFrameRemainder1) {
                  fieldTemp$0 = this.field_lb - 1;
                  this.field_lb = this.field_lb - 1;
                  decompiledFrameRemainder1 = (fieldTemp$0 == 0);
                  if (decompiledFrameRemainder1) {
                    if (!this.field_yb &&
                      this.field_m) {
                      fm.a(250, (byte) 111, 5);
                    }
                    this.a(false, true, 100);
                    decompiledFrameRemainder1 = (var19 != 0);
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                var4 = 0;
                var5Lifetime1Lifetime1 = 0;
                var6_ref_md__ = this.field_A;
                var7Lifetime2 = 0;
                while (var6_ref_md__.length > var7Lifetime2) {
                  var8_ref_md = var6_ref_md__[var7Lifetime2];
                  stackIn_265_0 = var8_ref_md;
                  if (var19 != 0) {
                    break L10;
                  }
                  if ((stackIn_265_0 != null ||
                    var19 != 0) && (!(var8_ref_md.field_t <= 2) ||
                    var19 != 0)) {
                    if (gh.field_j != var8_ref_md.field_r) {
                      var4++;
                    } else {
                      var5Lifetime1Lifetime1++;
                    }
                  }
                  var7Lifetime2++;
                }
                if (var5Lifetime1Lifetime1 < 7) {
                  discarded$1 = this.a((byte) -1, gh.field_j, 1, 0);
                }
                if (var4 < 7) {
                  var4 = qq.a(20, 100);
                  if (var4 == 0 &&
                    (hg.field_D & 64) != 0) {
                    discarded$2 = this.a((byte) 54, ro.field_u, 1, 0);
                    decompiledFrameRemainder1 = (var19 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (5 > var4 &&
                      (2 & hg.field_D) != 0) {
                      discarded$3 = this.a((byte) 116, ju.field_k, 1, 0);
                      decompiledFrameRemainder1 = (var19 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      if (15 <= var4 ||
                        (hg.field_D & 1) == 0) {
                        if (var4 < 25) {
                          discarded$4 = this.a((byte) 38, gm.field_y, 1, 0);
                        }
                        if (!(var4 < 25) ||
                          var19 != 0) {
                          if (40 > var4) {
                            discarded$5 = this.a((byte) 56, sl.field_p, 1, 0);
                            if (var19 != 0) {
                              discarded$6 = this.a((byte) 85, kk.field_N, 1, 0);
                              discarded$7 = this.a((byte) 13, qq.field_g, 1, 0);
                            }
                          } else {
                            discarded$6 = this.a((byte) 85, kk.field_N, 1, 0);
                            if (var19 != 0) {
                              discarded$7 = this.a((byte) 13, qq.field_g, 1, 0);
                            }
                          }
                        }} else {
                        discarded$7 = this.a((byte) 13, qq.field_g, 1, 0);
                      }
                    }
                  }
                }
              }
              stackIn_261_0 = -1;
              stackIn_261_1 = ~this.field_jb;
            }
            if (stackIn_261_0 > stackIn_261_1) {
              this.field_jb = this.field_jb - 1;
            }
            stackIn_265_0 = this.field_X;
            break;
          }
          L58: {
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (stackIn_265_0.field_k <= 0 &&
              this.field_X.field_t <= 2) {
              if (this.field_yb) {
                var4_ref_md__Lifetime1 = this.field_A;
                var5Lifetime2 = 0;
                while (var5Lifetime2 < var4_ref_md__Lifetime1.length) {
                  var6_ref_mdLifetime1 = var4_ref_md__Lifetime1[var5Lifetime2];
                  if (var19 != 0) {
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                  if (var6_ref_mdLifetime1 != null &&
                    var6_ref_mdLifetime1.field_r == gh.field_j &&
                    var6_ref_mdLifetime1.field_k > 0) {
                    this.field_X = var6_ref_mdLifetime1;
                  }
                  var5Lifetime2++;
                }
              } else {
                this.field_m = false;
                if (this.field_ub <= 0) {
                  this.field_ub = 80;
                  var4Lifetime1 = 0;
                  var5Lifetime2 = 0;
                  L62: while (var4Lifetime1 == 0) {
                    var5Lifetime2++;
                    stackIn_371_0 = -51;
                    stackIn_371_1 = ~var5Lifetime2;
                    if (var19 != 0) {
                      break L58;
                    }
                    if (stackIn_371_0 < stackIn_371_1) {
                      var6_intLifetime1 = qq.a(20, 3200);
                      var7Lifetime1 = qq.a(20, 2400);
                      this.field_X.field_d.a((double)var6_intLifetime1, (double)var7Lifetime1, true);
                      jp.a(50, this.field_X.field_h);
                      stackIn_297_0 = this.field_X;
                      while (true) {
                        stackIn_297_0.field_h = po.a(256, 0, this.field_X.field_r.a((byte) 104));
                        var4Lifetime1 = 1;
                        var8_ref_md__ = this.field_A;
                        var9Lifetime1 = 0;
                        while (var9Lifetime1 < var8_ref_md__.length) {
                          var10_ref_md = var8_ref_md__[var9Lifetime1];
                          stackIn_297_0 = var10_ref_md;
                          if (stackIn_297_0 != null &&
                            var10_ref_md != this.field_X &&
                            var10_ref_md.field_t > 2 &&
                            uh.a(97, var10_ref_md.field_d, 500.0, this.field_X.field_d)) {
                            var4Lifetime1 = 0;
                          } else {
                            var9Lifetime1++;
                            continue;
                          }
                          break;
                        }
                        continue L62;
                      }
                    }
                    break;
                  }
                  this.field_t = this.field_t - this.field_X.field_d.field_a / 3.0;
                  this.field_Y = this.field_Y - this.field_X.field_d.field_b / 3.0;
                  var3.a(this.field_X.field_d, true);
                  var6_ref_o__ = this.field_E;
                  var7Lifetime1Lifetime1 = 0;
                  while (var7Lifetime1Lifetime1 < var6_ref_o__.length) {
                    var8_ref_o = var6_ref_o__[var7Lifetime1Lifetime1];
                    if (var19 != 0) {
                      decompiledFrameCompleted3 = false;
                      break;
                    }
                    if (var8_ref_o != null) {
                      var8_ref_o.field_d.a(var3, -30507);
                    }
                    var7Lifetime1Lifetime1++;
                  }
                  if (decompiledFrameCompleted3) {
                    var6_ref_md__Lifetime1 = this.field_A;
                    var7Lifetime1Lifetime2 = 0;
                    while (var6_ref_md__Lifetime1.length > var7Lifetime1Lifetime2) {
                      var8_ref_mdLifetime1 = var6_ref_md__Lifetime1[var7Lifetime1Lifetime2];
                      if (var19 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                      if (var8_ref_mdLifetime1 != null) {
                        var8_ref_mdLifetime1.field_d.a(var3, -30507);
                      }
                      var7Lifetime1Lifetime2++;
                    }
                    if (decompiledFrameCompleted2) {
                      var6_ref_wm__ = this.field_i;
                      var7Lifetime1Lifetime2 = 0;
                      while (var6_ref_wm__.length > var7Lifetime1Lifetime2) {
                        var8_ref_wm = var6_ref_wm__[var7Lifetime1Lifetime2];
                        if (var19 != 0) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                        if (var8_ref_wm != null) {
                          var8_ref_wm.field_d.a(var3, -30507);
                        }
                        var7Lifetime1Lifetime2++;
                      }
                      if (decompiledFrameCompleted1) {
                        var6_ref_eu__ = this.field_S;
                        var7Lifetime1Lifetime2 = 0;
                        while (var7Lifetime1Lifetime2 < var6_ref_eu__.length) {
                          var8_ref_eu = var6_ref_eu__[var7Lifetime1Lifetime2];
                          if (var19 != 0) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          if (var8_ref_eu != null) {
                            var8_ref_eu.field_d.a(var3, -30507);
                          }
                          var7Lifetime1Lifetime2++;
                        }
                        if (decompiledFrameCompleted0) {
                          var6_ref_qf__ = this.field_n;
                          var7Lifetime1Lifetime2 = 0;
                          boolean decompiledNaturalLoopExit0 = false;
                          while (!(decompiledNaturalLoopExit0 = (var6_ref_qf__.length <= var7Lifetime1Lifetime2))) {
                            var8_ref_qf = var6_ref_qf__[var7Lifetime1Lifetime2];
                            if (var19 == 0) {
                              if (null != var8_ref_qf) {
                                var8_ref_qf.field_d.a(var3, -30507);
                              }
                              var7Lifetime1Lifetime2++;
                              continue;
                            }
                            break;
                          }
                          if (decompiledNaturalLoopExit0) {
                            this.field_jb = 120;
                            this.field_X.field_t = 3;
                            this.field_X.field_k = this.field_X.field_r.field_e;
                            this.field_F = this.field_F - 1;
                          }
                          if (var19 != 0) {
                            this.field_ub = this.field_ub - 1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.field_ub = this.field_ub - 1;
                }
              }
            }
            if ((decompiledFrameCompleted4) &&
              (decompiledFrameCompleted3) &&
              (decompiledFrameCompleted2) &&
              (decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              this.b((byte) -13);
            }
            stackIn_371_0 = ~this.field_F;
            stackIn_371_1 = -1;
          }
          if (stackIn_371_0 > stackIn_371_1) {
            this.a(false, false, 100);
          }
          var4Lifetime2 = 0;
          if (!param0) {
            this.f(-8);
          }
          var5Lifetime3 = 0;
          if (sh.field_u < gp.field_w) {
            stackIn_381_0 = (double)sh.field_u;
          } else {
            stackIn_381_0 = (double)gp.field_w;
          }
          var6 = stackIn_381_0;
          var8 = var6 * 100.0 / 480.0;
          var10 = var6 * 600.0 / 480.0;
          var12 = var6 * 1000.0 / 480.0;
          if (this.field_yb) {
            if (var10 < this.field_kb) {
              this.field_kb = this.field_kb * 0.99;
            }
            if (!(this.field_kb < var10)) {
              return;
            }
            this.field_kb = var10;
            if (var19 == 0) {
              return;
            }
          }
          var14 = this.field_X.field_d;
          var15 = Math.abs(this.field_kb * var14.field_a / 1000.0);
          var17 = Math.abs(var14.field_b * this.field_kb / 1000.0);
          if (1.01 * var15 < (double)(gp.field_w / 4) &&
            (double)(sh.field_u / 4) > var17 * 1.01) {
            var5Lifetime3 = 1;
          }
          if (0.99 * var15 > (double)(sh.field_u / 4) ||
            var17 * 0.99 > (double)(gp.field_w / 4)) {
            var4Lifetime2 = 1;
          }
          if (this.field_kb > var12) {
            var4Lifetime2 = 1;
          }
          if (var4Lifetime2 != 0) {
            this.field_kb = this.field_kb * 0.99;
            if (!(this.field_kb < var8)) {
              return;
            }
            this.field_kb = var8;
            if (var19 == 0) {
              return;
            }
          }
          if (var5Lifetime3 != 0) {
            this.field_kb = this.field_kb * 1.01;
            if (var12 < this.field_kb) {
              this.field_kb = var12;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.SA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        vc dupTemp$2 = null;
        int discarded$3 = 0;
        RuntimeException runtimeException = null;
        vc var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_z.length <= this.field_l) {
            return;
          }
          var5 = this.field_z[this.field_l];
          if (var5 == null) {
            dupTemp$2 = new vc();
            this.field_z[this.field_l] = dupTemp$2;
            var5 = dupTemp$2;
          }
          var5.a(param3, param2, param0, (byte) 127);
          if (param1 != -14630) {
            discarded$3 = this.a((md) null, 100, (md) null);
          }
          this.field_l = this.field_l + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.WA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        md[] var2 = null;
        int var3 = 0;
        md var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (!param0) {
            return;
          }
          if (null == this.field_A) {
            return;
          }
          var2 = this.field_A;
          var3 = 0;
          while (var2.length > var3) {
            var4 = var2[var3];
            if (var5 != 0) {
              return;
            }
            if (var4 != null &&
              null != var4.field_h) {
              jp.a(50, var4.field_h);
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.QA(" + param0 + ')');
        }
    }

    private final void a(int param0, md param1, kc param2) {
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        String stackIn_147_2 = null;
        StringBuilder stackIn_150_1 = null;
        String stackIn_151_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          param1.field_d.a(param2, -30507);
          if (param1.field_g != null && (!(param1.field_g.field_k > 0) ||
            param1.field_g.field_n != param1)) {
            param1.field_g = null;
          }
          if (0 < param1.field_q) {
            param1.field_q = param1.field_q - 2;
            if (param1.field_k > 0) {
              this.a(qq.a(20, 10) + (param1.field_q >> 1), param1.field_d, (byte) -74, 4473924);
            }
          }
          if (this.field_Eb &&
            this.field_j &&
            param1 == this.field_X) {
            param1.field_k = param1.field_r.field_e;
          }
          if (param1.field_k <= 0) {
            this.a(true, param1);
            return;
          }
          rg.a(this.a(param1, 5000, this.field_X), false, param1.field_h, this.a(this.field_X.field_d, 200, param1.field_d));
          if (!param1.field_p) {
            if (param1.field_r.field_i > param1.field_b) {
              param1.field_b = param1.field_b + 0.2;
            }
            if (param1.field_r.field_i < param1.field_b) {
              param1.field_b = param1.field_r.field_i;
              if (var5 != 0) {
                if (param1.field_b > param1.field_r.field_h) {
                  param1.field_b = param1.field_b - 0.2;
                }
                if (param1.field_r.field_h > param1.field_b) {
                  param1.field_b = param1.field_r.field_h;
                }
              }
            }
          } else {
            if (param1.field_b > param1.field_r.field_h) {
              param1.field_b = param1.field_b - 0.2;
            }
            if (param1.field_r.field_h > param1.field_b) {
              param1.field_b = param1.field_r.field_h;
            }
          }
          if (param1.field_t < 92) {
            param1.field_t = param1.field_t + 1;
          }
          if (param1.field_j > 100) {
            param1.b(24.0, 128);
            this.field_D.a(param1.field_d, true);
            param1.b(-24.0, 128);
            this.field_D.a((byte) 103, oh.a(3.0, (byte) 28));
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1.field_l &&
            param1.field_t == 92 &&
            param1.field_y <= 0) {
            if (param1.field_m != 3) {
              if (param1.field_m == 4) {
                this.a((byte) 55, param1);
                param1.field_x = param1.field_x - 2;
                param1.field_y = param1.field_y + param1.field_r.field_d;
                param1.field_j = param1.field_j + param1.field_r.field_d;
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (!(param1.field_j >= 100))) {
                this.a((byte) 115, param1);
                param1.field_j = param1.field_j + (-param1.field_r.field_f + param1.field_r.field_d + 22);
                param1.field_y = param1.field_y + param1.field_r.field_d;
                if (0 < param1.field_m) {
                  param1.field_x = param1.field_x - 5;
                }
                if (!(param1.field_j < 100)) {
                  param1.field_j = 200;
                  if ((this.field_X == param1) &&
                    (!this.field_yb)) {
                    bm.a((byte) -70, mh.field_o);
                    if (var5 != 0) {
                      this.a((byte) 60, param1);
                      param1.field_y = param1.field_y + 2;
                      param1.field_x = param1.field_x - 2;
                    }
                  }
                }
              }
            } else {
              this.a((byte) 60, param1);
              param1.field_y = param1.field_y + 2;
              param1.field_x = param1.field_x - 2;
            }
          }
          if (0 >= param1.field_x &&
            0 < param1.field_m) {
            if (param1.field_m == 3) {
              param1.field_j = 200;
              bm.a((byte) -70, mh.field_o);
            }
            param1.field_m = 0;
            param1.field_x = 0;
          }
          if (0 < param1.field_y) {
            param1.field_y = param1.field_y - 1;
          }
          var4_int = -31 % ((7 - param0) / 35);
          if (param1.field_j > 0) {
            param1.field_j = param1.field_j - 1;
            if (param1.field_j == 100) {
              param1.field_j = 0;
            }
          }
          param1.field_l = false;
          param1.a(2);
          param1.a(3200.0, (byte) 49, 2400.0);
          if (ro.field_u != param1.field_r) {
            if (0 < param1.field_i) {
              param1.field_i = param1.field_i - 1;
            }
            if (!(param1.field_i >= 0)) {
              param1.field_i = param1.field_i + 1;
              if (var5 != 0) {
                param1.field_i = param1.field_i + 1;
              }
            }
          } else {
            param1.field_i = param1.field_i + 1;
          }
          if (this.field_X == param1 &&
            !this.field_yb) {
            return;
          }
          if (qo.field_e == param1.field_u &&
            uh.a(93, this.field_X.field_d, 1000.0, param1.field_d)) {
            param1.field_u = ht.field_i;
          }
          if (param1.field_n != null &&
            param1.field_n.field_k <= 0) {
            param1.field_n = null;
          }
          param1.field_b = param1.field_r.field_i;
          this.b(param1, -111);
          param1.a(this.field_xb, (byte) 75, param1.field_n);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_146_0 = var4;
          stackIn_146_1 = new StringBuilder().append("pk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_147_2 = "null";
          } else {
            stackIn_147_2 = "{...}";
          }
          stackIn_150_1 = ((StringBuilder) (Object) stackIn_146_1).append(stackIn_147_2).append(',');
          if (param2 == null) {
            stackIn_151_2 = "null";
          } else {
            stackIn_151_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_146_0), ((StringBuilder) (Object) stackIn_150_1).append(stackIn_151_2).append(')').toString());
        }
    }

    private final void a(kc param0, int param1, int param2) {
        wm dupTemp$0 = null;
        RuntimeException runtimeException = null;
        wm var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32597) {
            return;
          }
          if (this.field_i.length <= this.field_Bb) {
            return;
          }
          var4 = this.field_i[this.field_Bb];
          if (var4 == null) {
            dupTemp$0 = new wm();
            this.field_i[this.field_Bb] = dupTemp$0;
            var4 = dupTemp$0;
          }
          var4.a(param2, -111, param0);
          this.field_Bb = this.field_Bb + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("pk.KA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(md param0, int param1, md param2) {
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var4_doubleLifetime1;
        try {
          if (param0 == param2) {
            stackIn_4_0 = 256;
            return stackIn_4_0;
          }
          if (param1 != 5000) {
            this.field_Db = 84;
          }
          ek.field_u.a(param2.field_d, true);
          ek.field_u.a(param0.field_d, -30507);
          var4_double = 3.141592653589793 * param0.field_e / 128.0;
          kp.field_d.a(param0.field_b * Math.sin(var4_double), param0.field_b * Math.cos(var4_double), true);
          var4_doubleLifetime1 = param2.field_e * 3.141592653589793 / 128.0;
          kp.field_d.field_a = kp.field_d.field_a - param2.field_b * Math.sin(var4_doubleLifetime1);
          kp.field_d.field_b = kp.field_d.field_b - param2.field_b * Math.cos(var4_doubleLifetime1);
          var6 = kp.field_d.a(ek.field_u, (byte) -67);
          var8 = 500;
          var8 = (int)(var6 * (double)var8 / ek.field_u.b(127));
          if (var8 < -100) {
            var8 = -100;
          }
          if (100 < var8) {
            var8 = 100;
          }
          var9 = -var8 + 256;
          stackIn_15_0 = var9;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("pk.W(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void a(boolean param0, md param1) {
        int stackIn_23_0 = 0;
        boolean stackIn_27_1 = false;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (2 >= param1.field_t) {
            param1.field_b = 0.0;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (param1.field_r == ro.field_u) {
              param1.field_i = param1.field_i + 1;
            }
            if (92 <= param1.field_t) {
              if (ro.field_u == param1.field_r) {
                jp.a(50, param1.field_h);
                param1.field_h = po.a(this.a(this.field_X.field_d, 200, param1.field_d), 0, kn.field_c[4]);
                if (var4 != 0) {
                  if (param1.field_r != ro.field_u) {
                    stackIn_23_0 = param1.field_t + 164;
                  } else {
                    stackIn_23_0 = 256;
                  }
                  stackIn_27_1 = !(param0);
                  rg.a(stackIn_23_0, stackIn_27_1, param1.field_h, this.a(this.field_X.field_d, 200, param1.field_d));
                  this.field_D.a(param1.field_d, true);
                  this.field_D.a((byte) 103, oh.a(5.0, (byte) 28));
                  this.a(this.field_D, 16777215, qq.a(20, 64) + 64, 0, param1.field_t);
                }
              }
            } else {
              if (param1.field_r != ro.field_u) {
                stackIn_23_0 = param1.field_t + 164;
              } else {
                stackIn_23_0 = 256;
              }
              stackIn_27_1 = !(param0);
              rg.a(stackIn_23_0, stackIn_27_1, param1.field_h, this.a(this.field_X.field_d, 200, param1.field_d));
              this.field_D.a(param1.field_d, true);
              this.field_D.a((byte) 103, oh.a(5.0, (byte) 28));
              this.a(this.field_D, 16777215, qq.a(20, 64) + 64, 0, param1.field_t);
            }
            param1.field_t = param1.field_t - 1;
            if (param1.field_t == 2) {
              if (this.field_X != param1) {
                this.field_p = this.field_p + 1;
              }
              jp.a(50, param1.field_h);
              param1.field_h = null;
              this.a(param1, 8073);
              this.a(this.field_D, -param1.field_r.field_a * 4, 240, 0, 0);
              if (param1.field_r == ro.field_u &&
                !this.field_yb &&
                !this.field_Cb) {
                fm.a(249, (byte) 111, 6);
              }
              var3_int = this.a(this.field_X.field_d, 200, param1.field_d);
              if (var3_int > 0) {
                if (ro.field_u == param1.field_r) {
                  gg.a(kn.field_c[5], var3_int, -27227);
                  if (var4 != 0) {
                    if (gm.field_y == param1.field_r) {
                      gg.a(kn.field_c[3], var3_int, -27227);
                      gg.a(kn.field_c[qq.a(20, 3)], var3_int, -27227);
                    } else {
                      gg.a(kn.field_c[qq.a(20, 3)], var3_int, -27227);
                    }
                  }
                } else {
                  boolean decompiledSharedTail0 = (gm.field_y != param1.field_r);
                  if (!decompiledSharedTail0) {
                    gg.a(kn.field_c[3], var3_int, -27227);
                    decompiledSharedTail0 = (var4 != 0);
                  }
                  if (decompiledSharedTail0) {
                    gg.a(kn.field_c[qq.a(20, 3)], var3_int, -27227);
                  }
                }
              }
            }
            if (param1.field_b > 0.0) {
              param1.field_b = param1.field_b - 0.1;
            }
            param1.field_m = 0;
            if (0 < param1.field_x) {
              param1.field_x = param1.field_x - 1;
            }
            param1.a(2.0, (byte) 25);
            param1.a(2);
            param1.a(3200.0, (byte) 49, 2400.0);
          }
          if (!param0) {
            this.c(110, -27);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_73_0 = var3;
          stackIn_73_1 = new StringBuilder().append("pk.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int stackIn_5_1 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          this.field_q = or.field_a;
          if (this.field_Ab > 0) {
            stackIn_5_1 = this.field_pb * 100 / this.field_Ab;
          } else {
            stackIn_5_1 = 0;
          }
          this.field_b = stackIn_5_1;
          if (param2 == this.field_b &&
            param1) {
            fm.a(248, (byte) 111, 7);
          }
          boolean decompiledFrameRemainder0 = true;
          if (!cn.b(true)) {
            sg.field_c.g(-8);
            ql.field_r = null;
            stackIn_19_0 = (!this.field_Cb) ? 0 : 1;
            cs.field_a = stackIn_19_0;
            if (0 == r.field_n) {
              eu.a((byte) -105, 2, param0);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              eu.a((byte) -102, 5, param0);
              if (var5 != 0) {
                if (0 < or.field_a) {
                  eu.a((byte) -81, 6, param0);
                  eu.a((byte) -86, 0, param0);
                } else {
                  eu.a((byte) -86, 0, param0);
                }
              }
            }
          } else {
            if (0 < or.field_a) {
              eu.a((byte) -81, 6, param0);
              if (var5 != 0) {
                eu.a((byte) -86, 0, param0);
              }
            } else {
              eu.a((byte) -86, 0, param0);
            }
          }
          lm.a(40, tg.field_a[0], true, (byte) -84);
          var4_int = 0;
          while (var4_int < 16) {
            wt.field_e.field_s.a((byte) -126, 256, var4_int);
            var4_int++;
            if (var5 != 0) {
              return;
            }
          }
          sg.field_c.c((byte) 50);
          co.field_b = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var4), "pk.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(ha param0, int param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_84_1 = 0;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        md[] var7_ref_md__ = null;
        int var7 = 0;
        int var8_int = 0;
        wm var8 = null;
        md var9_ref_md = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        double var12_double = 0.0;
        int var13 = 0;
        double var14_double = 0.0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var12Lifetime1Lifetime1;
        var18 = AceOfSkies.field_G ? 1 : 0;
        try {
          var4_int = -param1 + 64;
          var5 = -64 + gp.field_w + param1;
          ec.field_e[0].a(3 - param1, param1 + (-126 + gp.field_w));
          var6 = 7 * -this.field_c & 511;
          ec.field_e[1].a((float)var4_int, (float)var5, 4096, 65536 * var6 / 511);
          if (param2 != 16711935) {
            return;
          }
          var7_ref_md__ = this.field_A;
          var8_int = 0;
          while (var8_int < var7_ref_md__.length) {
            boolean decompiledFrameRemainder1 = true;
            var9_ref_md = var7_ref_md__[var8_int];
            if (null != var9_ref_md &&
              var9_ref_md.field_t > 2) {
              var10 = (int)(60.0 * var9_ref_md.field_d.field_a / 2400.0);
              var11 = (int)(var9_ref_md.field_d.field_b * 60.0 / 2400.0);
              if (this.field_X == var9_ref_md) {
                stackIn_13_0 = 255;
              } else {
                stackIn_13_0 = 511 & var9_ref_md.field_d.c(-113) + var6;
              }
              var12 = stackIn_13_0;
              if (var12 > 255) {
                var12 = 0;
              }
              if (gh.field_j == var9_ref_md.field_r) {
                var12 = 127 + (var12 >> 1);
              }
              var13 = var11 * var11 + var10 * var10;
              if (var13 > 3600) {
                var14_double = 60.0 / Math.sqrt((double)var13);
                var10 = (int)((double)var10 * var14_double);
                var11 = (int)((double)var11 * var14_double);
              }
              boolean decompiledFrameRemainder0 = true;
              var10 = var10 + var4_int;
              var11 = var11 + var5;
              var14 = 2;
              if (var9_ref_md != this.field_X) {
                if (gh.field_j == var9_ref_md.field_r) {
                  var15 = 65280 | var12 << 24;
                  decompiledFrameRemainder0 = (var18 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (kk.field_N != var9_ref_md.field_r) {
                    if (var9_ref_md.field_r != sl.field_p) {
                      if (var9_ref_md.field_r != gm.field_y) {
                        if (var9_ref_md.field_r == id.field_f) {
                          var15 = var12 << 24 | 16777088;
                          decompiledFrameRemainder0 = (var18 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (qq.field_g == var9_ref_md.field_r) {
                            var15 = var12 << 24 | 224694;
                            decompiledFrameRemainder0 = (var18 != 0);
                          }
                          if (decompiledFrameRemainder0) {
                            if (var9_ref_md.field_r != ju.field_k) {
                              if (var9_ref_md.field_r == ro.field_u) {
                                var14 = 5;
                                var15 = var12 << 24 | 65535;
                                decompiledFrameRemainder0 = (var18 != 0);
                              }
                              if (decompiledFrameRemainder0) {
                                throw new IllegalStateException();
                              }
                            }
                            if (decompiledFrameRemainder0) {
                              var16 = (int)sb.a(63, var9_ref_md.field_d, this.field_X.field_d);
                              decompiledFrameRemainder1 = !(var16 >= 600);
                              if (decompiledFrameRemainder1) {
                                var15 = 16742144;
                                if (var16 > 500) {
                                  var17 = (-var16 + 600) * 255 / 100;
                                  var15 = var15 | var17 * var12 >> 8 << 24;
                                }
                                if (var16 <= 500 ||
                                  var18 != 0) {
                                  var15 = var15 | -16777216;
                                }
                                decompiledFrameRemainder0 = (var18 != 0);
                              }
                            }
                          }
                        }
                      }
                      if ((decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder0)) {
                        var15 = 16777215 | var12 << 24;
                        if (var18 != 0) {
                          var15 = var12 << 24 | 16711935;
                          var15 = 16711680 | var12 << 24;
                          var15 = -16711936;
                          var14 = 3;
                        }
                      }
                    } else {
                      var15 = var12 << 24 | 16711935;
                      if (var18 != 0) {
                        var15 = 16711680 | var12 << 24;
                        var15 = -16711936;
                        var14 = 3;
                      }
                    }
                  } else {
                    var15 = 16711680 | var12 << 24;
                    if (var18 != 0) {
                      var15 = -16711936;
                      var14 = 3;
                    }
                  }
                }
              } else {
                var15 = -16711936;
                var14 = 3;
              }
              if (decompiledFrameRemainder1) {
                param0.d(var14, var14, -(var14 >> 1) + var11, -5782, var15, var10 - (var14 >> 1));
              }
            }
            var8_int++;
            if (var18 == 0) {
              continue;
            }
            break;
          }
          var7 = 0;
          while (this.field_Bb > var7) {
            var8 = this.field_i[var7];
            if (var18 != 0) {
              return;
            }
            if ((null != var8 ||
              var18 != 0) &&
              (!(var8.field_g < 0) ||
              var18 != 0)) {
              var9 = (int)(var8.field_d.field_a * 60.0 / 2400.0);
              var10Lifetime1 = (int)(60.0 * var8.field_d.field_b / 2400.0);
              var11Lifetime1 = var9 * var9 + var10Lifetime1 * var10Lifetime1;
              if (3600 < var11Lifetime1) {
                var12_double = 60.0 / Math.sqrt((double)var11Lifetime1);
                var9 = (int)((double)var9 * var12_double);
                var10Lifetime1 = (int)((double)var10Lifetime1 * var12_double);
              }
              var10Lifetime1 = var10Lifetime1 + var5;
              var9 = var9 + var4_int;
              var12Lifetime1 = 2;
              var14Lifetime1 = (var8.field_g & 15) >> 1;
              var12Lifetime1Lifetime1 = 8 - var14Lifetime1;
              stackIn_83_0 = var14Lifetime1 << 29;
              if (var8.field_k < 4) {
                stackIn_84_1 = 65280;
              } else {
                stackIn_84_1 = 16776960;
              }
              var13Lifetime1 = stackIn_83_0 | stackIn_84_1;
              param0.e(var13Lifetime1, var12Lifetime1Lifetime1, -(var12Lifetime1Lifetime1 >> 1) + var10Lifetime1, var12Lifetime1Lifetime1, -(var12Lifetime1Lifetime1 >> 1) + var9, 3105);
            }
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_90_0 = var4;
          stackIn_90_1 = new StringBuilder().append("pk.EB(");
          if (param0 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(kc param0, int param1) {
        int fieldTemp$0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        qf var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_w <= var3_int))) {
            var4 = this.field_n[var3_int];
            var4.field_d.a(param0, -30507);
            fieldTemp$0 = var4.field_i + 5;
            var4.field_i = var4.field_i + 5;
            stackIn_18_0 = ~fieldTemp$0;
            stackIn_18_1 = ~var4.field_g;
            if (var5 == 0) {
              if (stackIn_18_0 <= stackIn_18_1) {
                this.c(var3_int, -690800984);
                var3_int--;
              }
              if (var4.field_l < 0 &&
                var4.field_i < var4.field_g) {
                this.a(var4.field_d, 10066329, 2 * qq.a(param1 ^ 4473936, -var4.field_i + var4.field_g), 0, var4.field_j);
                this.a(var4.field_d, 6710886, 2 * qq.a(20, -var4.field_i + var4.field_g), param1 - 4473924, var4.field_j);
                this.a(var4.field_d, 4473924, 2 * qq.a(20, -var4.field_i + var4.field_g), 0, var4.field_j);
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_18_0 = param1;
            stackIn_18_1 = 4473924;
          }
          if (stackIn_18_0 != stackIn_18_1) {
            this.a(-112, (kc) null, (byte) 98, -76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("pk.L(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean c(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        md[] var5 = null;
        int var6 = 0;
        md var7 = null;
        int var8 = 0;
        int var4Lifetime1;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param1 == 0) {
            if (this.field_d == 12) {
              return false;
            }
            this.field_d = this.field_d + 1;
            this.field_X.field_r.field_i = this.field_X.field_r.field_i + 0.4;
          }
          if (1 == param1) {
            if (12 == this.field_J) {
              return false;
            }
            this.field_J = this.field_J + 1;
            if (1 >= this.field_X.field_r.field_d) {
              return false;
            }
            this.field_X.field_r.field_d = this.field_X.field_r.field_d - 1;
            this.field_X.field_r.field_f = this.field_X.field_r.field_f + 1;
          }
          if (param1 == 2) {
            if (12 == this.field_x) {
              return false;
            }
            this.field_x = this.field_x + 1;
            this.field_X.field_r.field_g = this.field_X.field_r.field_g + 0.1;
          }
          if (param1 == 3) {
            if (this.field_H == 12) {
              return false;
            }
            this.field_X.field_r.field_e = this.field_X.field_r.field_e + 1;
            this.field_H = this.field_H + 1;
            if (this.field_X.field_k > 0) {
              this.field_X.field_k = this.field_X.field_k + 1;
            }
          }
          if (param1 == 4) {
            if (5 < this.field_F) {
              return false;
            }
            this.field_F = this.field_F + 1;
          }
          var3_int = -31 / ((50 - param0) / 59);
          if (5 == param1) {
            var4 = 0;
            var5 = this.field_A;
            var6 = 0;
            while (true) {
              if (var5.length > var6) {
                var7 = var5[var6];
                if (var8 == 0) {
                  if (null != var7 &&
                    this.field_X != var7 &&
                    var7.field_r == gh.field_j) {
                    var4++;
                  }
                  var6++;
                  continue;
                }
              } else {
                if (6 <= var4) {
                  return false;
                }
              }
              break;
            }
            if (var4 == 5) {
              fm.a(252, (byte) 111, 3);
            }
            this.a(-19054);
          }
          if (param1 == 6) {
            if (this.field_V == 99) {
              return false;
            }
            this.field_V = this.field_V + 1;
          }
          if (param1 < 4 &&
            this.field_H == 12 &&
            12 == this.field_x &&
            this.field_J == 12 &&
            this.field_d == 12) {
            fm.a(251, (byte) 111, 4);
          }
          boolean decompiledFrameCompleted0 = true;
          this.a(50, (byte) -86, 65280, ae.field_h[param1]);
          if (!this.field_Cb) {
            var4Lifetime1 = 0;
            while (var4Lifetime1 < 80) {
              this.a(2560, 5888, np.a(25, 80, (byte) -65) >> 1, 80, 23 + param1 * 38 << 8, 800, (byte) -108);
              var4Lifetime1++;
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            bm.a((byte) -70, uh.field_g[param1]);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.DA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0) {
        boolean stackIn_67_1 = false;
        boolean stackIn_68_2 = false;
        md stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        md stackIn_76_0 = null;
        boolean stackIn_77_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param0 != -13) {
            return;
          }
          this.field_M = this.field_M + 1;
          if (!this.field_yb) {
            if (lp.field_a[96] &&
              !lp.field_a[97]) {
              this.field_X.a(this.field_X.field_r.field_g, (byte) 25);
              this.field_X.field_i = this.field_X.field_i + 2;
              if (16 < this.field_X.field_i) {
                this.field_X.field_i = 16;
              }
              if (!this.field_U) {
                if (50 > -this.field_T + this.field_M) {
                  this.field_mb = -1;
                }
                this.field_T = this.field_M;
              }
              this.field_U = true;
              if (var3 != 0) {
                if (this.field_mb == -1) {
                  this.field_mb = 0;
                }
                this.field_U = false;
              }
            } else {
              if (this.field_mb == -1) {
                this.field_mb = 0;
              }
              this.field_U = false;
            }
            if (lp.field_a[97] &&
              !lp.field_a[96]) {
              this.field_X.a(-this.field_X.field_r.field_g, (byte) 25);
              this.field_X.field_i = this.field_X.field_i - 2;
              if (this.field_X.field_i < -16) {
                this.field_X.field_i = -16;
              }
              if (!this.field_rb) {
                if (this.field_M - this.field_ib < 50) {
                  this.field_mb = 1;
                }
                this.field_ib = this.field_M;
              }
              this.field_rb = true;
              if (var3 != 0) {
                if (this.field_mb == 1) {
                  this.field_mb = 0;
                }
                this.field_rb = false;
              }
            } else {
              if (this.field_mb == 1) {
                this.field_mb = 0;
              }
              this.field_rb = false;
            }
            boolean decompiledSharedTail0 = (lp.field_a[83] ||
              lp.field_a[82]);
            if (!decompiledSharedTail0) {
              this.field_B = false;
              decompiledSharedTail0 = (var3 != 0);
            }
            if (decompiledSharedTail0) {
              stackIn_67_1 = this.field_B;
              stackIn_68_2 = !(this.field_X.field_j <= 100);
              this.field_B = stackIn_67_1 | stackIn_68_2;
              stackIn_71_0 = this.field_X;
              stackIn_72_1 = !(this.field_B);
              stackIn_71_0.field_l = stackIn_72_1;
            }
            stackIn_76_0 = this.field_X;
            stackIn_77_1 = (this.field_mb != 0);
            stackIn_76_0.field_p = stackIn_77_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.FA(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        int incrementValue$0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_144_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        md[] var21_ref_md__ = null;
        int var22_int = 0;
        vc var22 = null;
        qf var22_ref = null;
        o var22_ref2 = null;
        wm var22_ref3 = null;
        eu var22_ref4 = null;
        int var23 = 0;
        md var23_ref_md = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        qf var22_refLifetime1;
        o var22_ref2Lifetime1;
        o var22_ref2Lifetime2;
        eu var22_ref4Lifetime1;
        o var22_ref2Lifetime3;
        int stackIn_91_0Lifetime1;
        int stackIn_91_1Lifetime1;
        int stackIn_118_0Lifetime1;
        int stackIn_118_1Lifetime1;
        int stackIn_169_0Lifetime1;
        int stackIn_169_1Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var22_intLifetime1;
        int var23Lifetime1;
        int var23Lifetime2;
        int var23Lifetime3;
        int var23Lifetime4;
        int var23Lifetime5;
        int var24Lifetime1;
        int var24Lifetime2;
        int var24Lifetime3;
        int var24Lifetime4;
        int var25Lifetime1;
        int var25Lifetime2;
        int var25Lifetime3;
        int var25Lifetime4;
        int var26Lifetime1;
        int var26Lifetime2;
        int var26Lifetime3;
        int var27Lifetime1;
        int var27Lifetime2;
        int var26Lifetime4;
        int var23Lifetime2Lifetime1;
        int var23Lifetime3Lifetime1;
        int var23Lifetime4Lifetime1;
        int var24Lifetime1Lifetime1;
        int var24Lifetime2Lifetime1;
        int var24Lifetime3Lifetime1;
        int var25Lifetime1Lifetime1;
        int var25Lifetime2Lifetime1;
        int var25Lifetime3Lifetime1;
        int var26Lifetime1Lifetime1;
        int var26Lifetime2Lifetime1;
        int var27Lifetime1Lifetime1;
        var28 = AceOfSkies.field_G ? 1 : 0;
        try {
          field_wb.a((byte) 121);
          var2_int = 1;
          L1: while (true) {
            boolean decompiledFrameCompleted0 = true;
            if (-1720.0 > this.field_t + this.field_hb) {
              this.field_fb = this.field_fb + 1;
              this.field_t = this.field_t + 1720.0;
              if (var28 == 0) {
                continue;
              }
            } else {
              while (true) {
                if (!(-1280.0 > this.field_u + this.field_Y)) {
                  break;
                }
                this.field_Y = this.field_Y + 1280.0;
                this.field_O = this.field_O + 1;
                if (var28 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              while (true) {
                if (!(this.field_hb + this.field_t > 0.0)) {
                  break;
                }
                this.field_fb = this.field_fb - 1;
                this.field_t = this.field_t - 1720.0;
                if (var28 != 0) {
                  break L1;
                }
              }
            }
            if (param0 != -132670633) {
              this.field_J = -125;
            }
            break;
          }
          while (true) {
            if (this.field_Y + this.field_u > 0.0) {
              this.field_Y = this.field_Y - 1280.0;
              if (var28 == 0) {
                this.field_O = this.field_O - 1;
                continue;
              }
            }
            break;
          }
          var3 = this.field_kb / 1000.0;
          var5 = 3.141592653589793 * this.field_X.field_e / 128.0;
          var7 = Math.sin(var5) * 192.0 * this.field_kb / 1000.0;
          var9 = 192.0 * Math.cos(var5) * this.field_kb / 1000.0;
          this.field_u = this.field_u + (-this.field_u + var9) * 0.05;
          this.field_hb = this.field_hb + 0.05 * (-this.field_hb + var7);
          var11 = (int)(this.field_t - this.field_hb * 2.0 / 3.0);
          var12 = (int)(this.field_Y - this.field_u * 2.0 / 3.0);
          var13 = (double)(sh.field_u / 2);
          var15 = (double)(gp.field_w / 2);
          var17 = this.field_sb;
          if (this.field_zb <= 10) {
            boolean decompiledSharedTail0 = !(this.field_zb <= 5);
            if (!decompiledSharedTail0) {
              var17 = this.b(this.field_zb * 51, -1, param0 - 437819992, this.field_sb);
              decompiledSharedTail0 = (var28 != 0);
            }
            if (decompiledSharedTail0) {
              var17 = this.b((10 - this.field_zb) * 51, -1, param0 - 437819992, this.field_sb);
            }
          }
          var18 = this.field_O;
          var19 = (int)(this.field_hb + var13);
          var20 = (int)(this.field_u + var15);
          var21 = -1280 + var12;
          L12: while (true) {
            if (var21 <= gp.field_w) {
              var22_int = this.field_fb;
              stackIn_48_0 = var11 - 1720;
              if (var28 != 0) {
                break L12;
              }
              var23 = stackIn_48_0;
              while (var23 <= sh.field_u) {
                is.field_a[qg.a((byte) 110, is.field_a.length, var22_int * 23 + 7 * var18)].a((int)(var13 + this.field_hb) + var23, var21 + (int)(var15 + this.field_u), 1, 0, 0);
                var22_int++;
                var23 += 1720;
              }
              var18++;
              var21 += 1280;
              continue L12;
            }
            stackIn_48_0 = 0;
            break;
          }
          var21Lifetime1 = stackIn_48_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var21Lifetime1 >= this.field_l))) {
            var22 = this.field_z[var21Lifetime1];
            var23Lifetime1 = var19 + var22.field_b - this.field_fb * 1720 + var11;
            var24 = var20 + (var22.field_d - 1280 * this.field_O) + var12;
            var25 = var22.field_e;
            stackIn_70_0 = var23Lifetime1;
            stackIn_70_1 = -500 - var25;
            if (var28 == 0) {
              if (stackIn_70_0 >= stackIn_70_1 &&
                -var25 - 500 <= var24 &&
                (500 + var25 + sh.field_u) >= var23Lifetime1 &&
                var24 <= var25 + gp.field_w + 500) {
                co.field_i[var22.field_c].b(-(var25 >> 1) + var23Lifetime1, var24 - (var25 >> 1), var25, var25);
              } else {
                incrementValue$0 = var21Lifetime1;
                var21Lifetime1--;
                this.f(incrementValue$0, 10355);
              }
              var21Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_70_0 = -1;
            stackIn_70_1 = this.field_w;
          }
          var21Lifetime2 = stackIn_70_0 + stackIn_70_1;
          L24: while (true) {
            boolean decompiledFrameRemainder1 = true;
            if (var21Lifetime2 >= 0) {
              var22_ref = this.field_n[var21Lifetime2];
              stackIn_91_0 = var22_ref.field_j;
              stackIn_91_1 = 30;
              if (var28 != 0) {
                if (stackIn_91_0 > stackIn_91_1) {
                  var22_ref2 = this.field_E[var21Lifetime2];
                  var23Lifetime2 = (int)((var22_ref2.field_d.field_a + this.field_hb) * var3 * 0.9 + var13);
                  var24Lifetime1 = (int)((var22_ref2.field_d.field_b + this.field_u) * var3 * 0.9 + var15);
                  var25Lifetime1 = (int)((double)sd.field_k[var21Lifetime2 % sd.field_k.length].a() * var3 * 0.9);
                  var26 = (int)(0.9 * ((double)sd.field_k[var21Lifetime2 % sd.field_k.length].b() * var3));
                  sd.field_k[var21Lifetime2 % sd.field_k.length].a(-(var25Lifetime1 >> 1) + var23Lifetime2, -(var26 >> 1) + var24Lifetime1, var25Lifetime1, var26, 0, var17, 1);
                  var21Lifetime2 += 2;
                  break L24;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (stackIn_91_0 <= stackIn_91_1 ||
                  var28 != 0) {
                  var23Lifetime2 = (int)(var13 + (var22_ref.field_d.field_a + this.field_hb) * this.a((byte) -125, var22_ref.field_j, var3));
                  var24Lifetime1 = (int)(var15 + (var22_ref.field_d.field_b + this.field_u) * this.a((byte) -123, var22_ref.field_j, var3));
                  if (var22_ref.field_g < 512) {
                    if (var22_ref.field_l < 0) {
                      var25Lifetime1 = (int)(var3 * (double)(2 * -var22_ref.field_l));
                      var26 = var22_ref.field_i * bl.field_b.length / var22_ref.field_g;
                      bl.field_b[var26].b(-(var25Lifetime1 >> 1) + var23Lifetime2, -(var25Lifetime1 >> 1) + var24Lifetime1, var25Lifetime1, var25Lifetime1);
                    } else {
                      var25Lifetime1 = var22_ref.field_h;
                      var26 = (int)(var3 * (double)(50 * var22_ref.field_i) / (double)var22_ref.field_g + 10.0);
                      var27 = -(var22_ref.field_i * 256 / var22_ref.field_g) + 256;
                      es.field_b[var25Lifetime1].a(-(var26 >> 1) + var23Lifetime2, -(var26 >> 1) + var24Lifetime1, var26, var26, 0, var27 << 23 & -14870727 | var22_ref.field_l & 16777215, 1);
                    }
                  }
                }
                var21Lifetime2--;
                continue;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (var2_int != 0)) {
              var21Lifetime2 = 0;
              while (true) {
                stackIn_91_0Lifetime1 = ~var21Lifetime2;
                stackIn_91_1Lifetime1 = ~this.field_E.length;
                if (stackIn_91_0Lifetime1 <= stackIn_91_1Lifetime1) {
                  break;
                }
                var22_ref2Lifetime3 = this.field_E[var21Lifetime2];
                var23Lifetime2Lifetime1 = (int)((var22_ref2Lifetime3.field_d.field_a + this.field_hb) * var3 * 0.9 + var13);
                var24Lifetime1Lifetime1 = (int)((var22_ref2Lifetime3.field_d.field_b + this.field_u) * var3 * 0.9 + var15);
                var25Lifetime1Lifetime1 = (int)((double)sd.field_k[var21Lifetime2 % sd.field_k.length].a() * var3 * 0.9);
                var26Lifetime4 = (int)(0.9 * ((double)sd.field_k[var21Lifetime2 % sd.field_k.length].b() * var3));
                sd.field_k[var21Lifetime2 % sd.field_k.length].a(-(var25Lifetime1Lifetime1 >> 1) + var23Lifetime2Lifetime1, -(var26Lifetime4 >> 1) + var24Lifetime1Lifetime1, var25Lifetime1Lifetime1, var26Lifetime4, 0, var17, 1);
                var21Lifetime2 += 2;
                if (var28 != 0) {
                  break L24;
                }
              }
            }
            var21Lifetime2 = 0;
            break;
          }
          L34: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (this.field_Bb > var21Lifetime2) {
              var22_ref3 = this.field_i[var21Lifetime2];
              stackIn_118_0 = -1;
              stackIn_118_1 = ~var22_ref3.field_g;
              if (var28 != 0) {
                if (stackIn_118_0 > stackIn_118_1) {
                  var22_ref4 = this.field_S[var21Lifetime2];
                  var23Lifetime3 = (int)(var13 + (var22_ref4.field_d.field_a + this.field_hb) * var3);
                  var24Lifetime2 = (int)(var3 * (var22_ref4.field_d.field_b + this.field_u) + var15);
                  dc.field_g.a((float)var23Lifetime3, (float)var24Lifetime2, (int)((double)(var22_ref4.field_h * 42) * var3), (int)(256.0 * var22_ref4.field_e));
                  var21Lifetime2++;
                  break L34;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_118_0 < stackIn_118_1) {
                  stackIn_105_0 = (var22_ref3.field_g >> 1) + 92;
                } else {
                  stackIn_105_0 = 92;
                }
                var23Lifetime3 = stackIn_105_0;
                var24Lifetime2 = (int)((this.field_hb + var22_ref3.field_d.field_a) * this.a((byte) -124, var23Lifetime3, var3) + var13);
                var25Lifetime2 = (int)((this.field_u + var22_ref3.field_d.field_b) * this.a((byte) -122, var23Lifetime3, var3) + var15);
                var26Lifetime1 = (int)(var3 * (double)(42 * var23Lifetime3));
                if (400 - var22_ref3.field_g < 15) {
                  var26Lifetime1 = var26Lifetime1 * (-var22_ref3.field_g + 400) / 15;
                }
                if (0 > var22_ref3.field_g) {
                  wm.field_i[var22_ref3.field_k].a((float)var24Lifetime2, (float)var25Lifetime2, var26Lifetime1, var22_ref3.field_g * 20, 0, -16777216 | 190 * var23Lifetime3 / 92 * 65793, 1);
                } else {
                  wm.field_i[var22_ref3.field_k].a((float)var24Lifetime2, (float)var25Lifetime2, var26Lifetime1, 20 * var22_ref3.field_g);
                }
                var21Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var21Lifetime2 = 0;
              while (true) {
                stackIn_118_0Lifetime1 = ~var21Lifetime2;
                stackIn_118_1Lifetime1 = ~this.field_ab;
                if (stackIn_118_0Lifetime1 <= stackIn_118_1Lifetime1) {
                  break;
                }
                var22_ref4Lifetime1 = this.field_S[var21Lifetime2];
                var23Lifetime3Lifetime1 = (int)(var13 + (var22_ref4Lifetime1.field_d.field_a + this.field_hb) * var3);
                var24Lifetime2 = (int)(var3 * (var22_ref4Lifetime1.field_d.field_b + this.field_u) + var15);
                dc.field_g.a((float)var23Lifetime3Lifetime1, (float)var24Lifetime2, (int)((double)(var22_ref4Lifetime1.field_h * 42) * var3), (int)(256.0 * var22_ref4Lifetime1.field_e));
                var21Lifetime2++;
                if (var28 != 0) {
                  break L34;
                }
              }
            }
            var21_ref_md__ = this.field_A;
            var22_intLifetime1 = 0;
            while (var22_intLifetime1 < var21_ref_md__.length) {
              boolean decompiledFrameRemainder2 = true;
              var23_ref_md = var21_ref_md__[var22_intLifetime1];
              if ((var23_ref_md != null ||
                var28 != 0) && var23_ref_md.field_t > 2) {
                var24Lifetime2Lifetime1 = (int)((var23_ref_md.field_d.field_a + this.field_hb) * this.a((byte) -126, var23_ref_md.field_t, var3) + var13);
                var25Lifetime2Lifetime1 = (int)((var23_ref_md.field_d.field_b + this.field_u) * this.a((byte) -126, var23_ref_md.field_t, var3) + var15);
                var26Lifetime1Lifetime1 = 4 * var23_ref_md.field_i / 16 + 4;
                if (var23_ref_md == this.field_X &&
                  this.field_jb > 0) {
                  var27Lifetime1 = -16777216;
                  var27Lifetime1 = var27Lifetime1 | 65793 * (int)(-Math.cos((double)this.field_jb * 3.141592653589793 / 5.0) * (double)this.field_jb + (double)this.field_jb);
                  var23_ref_md.field_r.b(-32275)[var26Lifetime1Lifetime1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)(var3 * (double)(32 * var23_ref_md.field_t)), (int)(256.0 * var23_ref_md.field_e), 3, var27Lifetime1, 1);
                  decompiledFrameRemainder2 = (var28 != 0);
                }
                if (decompiledFrameRemainder2) {
                  if (ro.field_u == var23_ref_md.field_r) {
                    var23_ref_md.field_r.b(-32275)[0].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(var23_ref_md.field_t * 32) * var3), 0);
                    var23_ref_md.field_r.b(-32275)[1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(32 * var23_ref_md.field_t) * var3), var23_ref_md.field_i << 10);
                    var27Lifetime1Lifetime1 = (var23_ref_md.field_i & 536870975) << 3;
                    if (var27Lifetime1Lifetime1 <= 255) {
                      stackIn_144_0 = var27Lifetime1Lifetime1;
                    } else {
                      stackIn_144_0 = 511 - var27Lifetime1Lifetime1;
                    }
                    var27Lifetime1Lifetime1 = stackIn_144_0;
                    var23_ref_md.field_r.b(-32275)[2].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(var23_ref_md.field_t * 32) * var3), var23_ref_md.field_i << 10, 0, var27Lifetime1Lifetime1 * -16711423, 2);
                    var23_ref_md.field_r.b(param0 ^ 132651706)[2].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(32 * var23_ref_md.field_t) * var3), var23_ref_md.field_i << 10, 0, var27Lifetime1Lifetime1 * -16711423, 2);
                    if (var28 != 0) {
                      var23_ref_md.field_r.b(-32275)[var26Lifetime1Lifetime1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)(var3 * (double)(32 * var23_ref_md.field_t)), (int)(256.0 * var23_ref_md.field_e));
                    }
                  } else {
                    var23_ref_md.field_r.b(-32275)[var26Lifetime1Lifetime1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)(var3 * (double)(32 * var23_ref_md.field_t)), (int)(256.0 * var23_ref_md.field_e));
                  }
                }
              }
              var22_intLifetime1++;
              if (var28 == 0) {
                continue;
              }
              break;
            }
            var21Lifetime2 = -1 + this.field_w;
            break;
          }
          while (var21Lifetime2 >= 0) {
            var22_refLifetime1 = this.field_n[var21Lifetime2];
            stackIn_169_0 = ~var22_refLifetime1.field_j;
            stackIn_169_1 = -31;
            if (var28 != 0) {
              if (stackIn_169_0 < stackIn_169_1) {
                var22_ref2Lifetime1 = this.field_E[var21Lifetime2];
                var23Lifetime4 = (int)(var3 * (this.field_hb + var22_ref2Lifetime1.field_d.field_a) + var13);
                var24Lifetime3 = (int)(var15 + (this.field_u + var22_ref2Lifetime1.field_d.field_b) * var3);
                var25Lifetime3 = (int)(var3 * (double)sd.field_k[var21Lifetime2 % sd.field_k.length].a());
                var26Lifetime2 = (int)((double)sd.field_k[var21Lifetime2 % sd.field_k.length].b() * var3);
                sd.field_k[var21Lifetime2 % sd.field_k.length].a(-(var25Lifetime3 >> 1) + var23Lifetime4, var24Lifetime3 - (var26Lifetime2 >> 1), var25Lifetime3, var26Lifetime2, 0, var17, 1);
                var21Lifetime2 += 2;
                return;
              }
              return;
            }
            if (stackIn_169_0 < stackIn_169_1 ||
              var28 != 0) {
              var23Lifetime4Lifetime1 = (int)(var13 + (this.field_hb + var22_refLifetime1.field_d.field_a) * this.a((byte) -124, var22_refLifetime1.field_j, var3));
              var24Lifetime3Lifetime1 = (int)(var15 + (var22_refLifetime1.field_d.field_b + this.field_u) * this.a((byte) -119, var22_refLifetime1.field_j, var3));
              if (512 > var22_refLifetime1.field_g) {
                if (var22_refLifetime1.field_l >= 0) {
                  var25Lifetime3Lifetime1 = var22_refLifetime1.field_h;
                  var26Lifetime2Lifetime1 = (int)(10.0 + var3 * (double)(var22_refLifetime1.field_i * 50) / (double)var22_refLifetime1.field_g);
                  var27Lifetime2 = 256 - var22_refLifetime1.field_i * 256 / var22_refLifetime1.field_g;
                  es.field_b[var25Lifetime3Lifetime1].a(-(var26Lifetime2Lifetime1 >> 1) + var23Lifetime4Lifetime1, -(var26Lifetime2Lifetime1 >> 1) + var24Lifetime3Lifetime1, var26Lifetime2Lifetime1, var26Lifetime2Lifetime1, 0, 16777215 & var22_refLifetime1.field_l | -9633548 & var27Lifetime2 << 23, 1);
                } else {
                  var25Lifetime3Lifetime1 = (int)(var3 * (double)(2 * -var22_refLifetime1.field_l));
                  var26Lifetime2Lifetime1 = bl.field_b.length * var22_refLifetime1.field_i / var22_refLifetime1.field_g;
                  bl.field_b[var26Lifetime2Lifetime1].b(-(var25Lifetime3Lifetime1 >> 1) + var23Lifetime4Lifetime1, var24Lifetime3Lifetime1 - (var25Lifetime3Lifetime1 >> 1), var25Lifetime3Lifetime1, var25Lifetime3Lifetime1);
                }
              }
            }
            var21Lifetime2--;
          }
          if (var2_int == 0) {
            return;
          }
          var21Lifetime3 = 1;
          while (true) {
            stackIn_169_0Lifetime1 = ~this.field_E.length;
            stackIn_169_1Lifetime1 = ~var21Lifetime3;
            if (stackIn_169_0Lifetime1 >= stackIn_169_1Lifetime1) {
              break;
            }
            var22_ref2Lifetime2 = this.field_E[var21Lifetime3];
            var23Lifetime5 = (int)(var3 * (this.field_hb + var22_ref2Lifetime2.field_d.field_a) + var13);
            var24Lifetime4 = (int)(var15 + (this.field_u + var22_ref2Lifetime2.field_d.field_b) * var3);
            var25Lifetime4 = (int)(var3 * (double)sd.field_k[var21Lifetime3 % sd.field_k.length].a());
            var26Lifetime3 = (int)((double)sd.field_k[var21Lifetime3 % sd.field_k.length].b() * var3);
            sd.field_k[var21Lifetime3 % sd.field_k.length].a(-(var25Lifetime4 >> 1) + var23Lifetime5, var24Lifetime4 - (var26Lifetime3 >> 1), var25Lifetime4, var26Lifetime3, 0, var17, 1);
            var21Lifetime3 += 2;
            if (var28 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.N(" + param0 + ')');
        }
    }

    final void e(int param0) {
        try {
          int var2_int = -5 % ((param0 + 73) / 34);
          this.field_g = false;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pk.Q(" + param0 + ')');
        }
    }

    final static boolean d(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -56) {
            stackIn_7_0 = (nb.field_c == jq.field_fb);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "pk.RA(" + param0 + ')');
        }
    }

    private final gb b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        gb stackIn_32_0 = null;
        gb stackIn_34_0 = null;
        gb stackIn_36_0 = null;
        gb stackIn_38_0 = null;
        gb stackIn_40_0 = null;
        gb stackIn_42_0 = null;
        gb stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param0 <= 99) {
            this.field_t = -1.7731094820794981;
          }
          var3_int = param1;
          if (var3_int == 0 &&
            var4 == 0) {
            stackIn_32_0 = kk.field_N;
            return stackIn_32_0;
          }
          if (var3_int == 1) {
            stackIn_34_0 = sl.field_p;
            return stackIn_34_0;
          }
          if (var3_int == 3) {
            stackIn_36_0 = gm.field_y;
            return stackIn_36_0;
          }
          if (var3_int == 2 &&
            var4 == 0) {
            stackIn_38_0 = qq.field_g;
            return stackIn_38_0;
          }
          if (var3_int == 4 &&
            var4 == 0) {
            stackIn_40_0 = ju.field_k;
            return stackIn_40_0;
          }
          if (var3_int == 5) {
            stackIn_42_0 = ro.field_u;
            return stackIn_42_0;
          }
          stackIn_44_0 = kk.field_N;
          return stackIn_44_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, ha param2) {
        RuntimeException runtimeException = null;
        tb var4 = null;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          this.h(-132670633);
          this.a(param2, -20240);
          if (!this.field_yb) {
            var4 = (tb) (wd.field_t.d(param0 ^ -251723521));
            while (var4 != null) {
              if (var5 != 0) {
                return;
              }
              if (var4 != null) {
                var4.d(param0 ^ 16711886);
              }
              var4 = (tb) (wd.field_t.b((byte) 103));
            }
          }
          if (param0 != -16711936) {
            this.c(8, 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("pk.CB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        boolean stackIn_11_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (this.field_vb != null &&
            !this.field_ob) {
            var3_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (16 <= var3_int))) {
              stackOut_10_0 = sd.field_d[this.field_h][var3_int];
              stackIn_33_0 = stackOut_10_0 ? 1 : 0;
              stackIn_11_0 = stackOut_10_0;
              if (var5 == 0) {
                stackIn_17_0 = (!stackIn_11_0) ? 0 : 255;
                var4 = stackIn_17_0;
                if (var4 > this.field_Z[var3_int]) {
                  this.field_Z[var3_int] = this.field_Z[var3_int] + param1;
                  if (this.field_Z[var3_int] > var4) {
                    this.field_Z[var3_int] = var4;
                  }
                }
                if (var4 < this.field_Z[var3_int]) {
                  this.field_Z[var3_int] = this.field_Z[var3_int] - param1;
                  if (var4 > this.field_Z[var3_int]) {
                    this.field_Z[var3_int] = var4;
                  }
                }
                this.field_vb.a((byte) -126, this.field_Z[var3_int], var3_int);
                var3_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_33_0 = param0;
            }
            if (stackIn_33_0 != 24260) {
              this.field_V = 9;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wd.field_t.a(120, new tb(param2, param0));
          var4_int = 105 % ((param1 - 70) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("pk.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        md var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wd.field_t.c(268435455);
          gh.field_j.field_d = ub.field_h.field_d;
          this.field_g = false;
          gh.field_j.field_e = ub.field_h.field_e;
          gh.field_j.field_f = ub.field_h.field_f;
          gh.field_j.field_i = ub.field_h.field_i;
          gh.field_j.field_g = ub.field_h.field_g;
          this.field_Eb = false;
          var2 = this.field_X;
          this.a(true);
          this.field_X = new md(new kc(), gh.field_j);
          this.field_A = new md[16];
          this.field_A[0] = this.field_X;
          this.field_X.field_h = po.a(this.a(this.field_X.field_d, 200, this.field_X.field_d), 0, this.field_X.field_r.a((byte) 93));
          this.field_n = new qf[1000];
          this.field_F = 3;
          this.field_S = new eu[1000];
          this.field_xb = 20;
          this.field_jb = 120;
          this.field_ab = 0;
          if (null != var2) {
            this.field_X.field_e = var2.field_e;
          }
          if (param0 <= 34) {
            this.field_vb = (hk) null;
          }
          this.field_i = new wm[16];
          this.field_Bb = 0;
          this.field_p = 0;
          this.field_yb = true;
          this.field_w = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.HA(" + param0 + ')');
        }
    }

    private final double a(byte param0, int param1, double param2) {
        double var5_double = 0.0;
        RuntimeException var5 = null;
        double stackIn_2_0 = 0.0;
        double stackIn_5_0 = 0.0;
        double stackIn_7_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 92) {
            stackIn_2_0 = param2;
            return stackIn_2_0;
          }
          if (param0 >= -118) {
            stackIn_5_0 = -0.6152644756512422;
            return stackIn_5_0;
          }
          var5_double = 3.0 - (-(1.0 / param2) + 3.0) * (double)param1 / 92.0;
          stackIn_7_0 = 1.0 / var5_double;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var5), "pk.FB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void f(int param0) {
        int stackIn_20_1 = 0;
        gb stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        try {
          this.field_db = 255;
          this.field_o = this.field_sb;
          this.field_k = mr.field_b[this.field_s];
          this.field_L = gi.field_e[this.field_s];
          if (this.field_zb == -1) {
            this.field_zb = this.field_L;
          }
          this.a(16744448, (byte) -44, oe.field_f[this.field_s]);
          var2 = ip.field_a[this.field_s];
          if (param0 != -20416) {
            this.field_jb = -42;
          }
          var3 = var2[6];
          if (var2[5] > 0) {
            var3 = this.a((byte) -128, ro.field_u, var2[5], var3);
          }
          if (var2[4] > 0) {
            var3 = this.a((byte) -118, ju.field_k, var2[4], var3);
          }
          if (var2[3] > 0) {
            stackIn_20_1 = -127;
            if (this.field_s <= 10) {
              stackIn_21_2 = id.field_f;
            } else {
              stackIn_21_2 = qq.field_g;
            }
            var3 = this.a((byte) stackIn_20_1, stackIn_21_2, var2[3], var3);
          }
          if (var2[2] > 0) {
            var3 = this.a((byte) -128, gm.field_y, var2[2], var3);
          }
          if (0 < var2[1]) {
            var3 = this.a((byte) -125, sl.field_p, var2[1], var3);
          }
          if (var2[0] > 0) {
            var3 = this.a((byte) 127, kk.field_N, var2[0], var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.OA(" + param0 + ')');
        }
    }

    private final int a(byte param0, gb param1, int param2, int param3) {
        int incrementValue$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        md var8 = null;
        int var9 = 0;
        md stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          var5_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5_int >= param2))) {
            var6 = 3200 + (int)this.field_X.field_d.field_a + np.a(-1600, 1600, (byte) -42);
            var7 = (int)this.field_X.field_d.field_b + (2400 + np.a(-1200, 1200, (byte) -46));
            var8 = new md(new kc((double)var6, (double)var7), param1);
            incrementValue$1 = param3;
            param3--;
            stackIn_16_0 = incrementValue$1;
            if (var9 == 0) {
              if (stackIn_16_0 > 0) {
                stackIn_12_0 = var8;
                stackIn_12_1 = 20;
                if (!this.field_Cb) {
                  stackIn_13_2 = 4;
                } else {
                  stackIn_13_2 = 9;
                }
                stackIn_12_0.field_v = qq.a(stackIn_12_1, stackIn_13_2);
              }
              this.b((byte) 112, var8);
              var5_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var5_int = 18 / ((param0 + 74) / 36);
            stackIn_16_0 = param3;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("pk.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(int param0) {
        int fieldTemp$0 = 0;
        int incrementValue$1 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_27_0;
        int var2_int = 0;
        tb var2 = null;
        RuntimeException var2_ref = null;
        ok var3_ref_ok = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          var2_int = 0;
          if (param0 > -79) {
            this.field_vb = (hk) null;
          }
          L2: while (true) {
            if (var2_int < this.field_K) {
              var3_ref_ok = this.field_C[var2_int];
              if (var7 == 0) {
                if (var3_ref_ok != null) {
                  fieldTemp$0 = var3_ref_ok.field_h + 1;
                  var3_ref_ok.field_h = var3_ref_ok.field_h + 1;
                  if (!(var3_ref_ok.field_d >= fieldTemp$0)) {
                    incrementValue$1 = var2_int;
                    var2_int--;
                    this.d((byte) -94, incrementValue$1);
                  }
                } else {
                  incrementValue$1 = var2_int;
                  var2_int--;
                  this.d((byte) -94, incrementValue$1);
                }
                var3_ref_ok.field_c = var3_ref_ok.field_k;
                var3_ref_ok.field_g = var3_ref_ok.field_n;
                var3_ref_ok.field_m = var3_ref_ok.field_m + var3_ref_ok.field_l;
                var3_ref_ok.field_n = var3_ref_ok.field_n + var3_ref_ok.field_i;
                var3_ref_ok.field_k = var3_ref_ok.field_k + var3_ref_ok.field_b;
                var3_ref_ok.field_i = var3_ref_ok.field_i + var3_ref_ok.field_f;
                var3_ref_ok.field_l = var3_ref_ok.field_l + var3_ref_ok.field_j;
                var3_ref_ok.field_b = var3_ref_ok.field_b + var3_ref_ok.field_a;
                var2_int++;
                continue;
              }
            } else {
              if (this.field_X.field_j <= 100) {
                break L2;
              }
            }
            if (this.field_R < 200) {
              var2_int = (int)(-Math.cos((double)this.field_R * 3.141592653589793 / 200.0) * 128.0) + 128;
              var3 = var2_int * 80 >> 8;
              var4 = var3 + 623;
              this.a(80, var4 << 8, 2560, (byte) -115, np.a(20, 40, (byte) 99) * (this.field_X.field_j - 100) / 100, 117760, (-12800 + 128 * this.field_X.field_j) / 100);
            }
            break;
          }
          if (this.field_c % 40 == 0) {
            this.field_y = this.field_p;
          }
          var2 = (tb) (wd.field_t.d(268435455));
          L9: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var2 != null) {
              stackOut_27_0 = var2.a(-122);
              stackIn_41_0 = stackOut_27_0 ? 1 : 0;
              stackIn_28_0 = stackOut_27_0;
              if (var7 != 0) {
                break L9;
              }
              if (!stackIn_28_0) {
                decompiledFrameRemainder0 = !(var2.c((byte) 47));
              } else {
                var2.c(-127);
              }
              if (decompiledFrameRemainder0) {
                var2 = (tb) (wd.field_t.b((byte) 103));
                continue;
              }
            }
            stackIn_41_0 = ~this.field_cb;
            break;
          }
          if (stackIn_41_0 == -1) {
            if (~this.field_N != ~or.field_a) {
              this.field_cb = 20;
              this.field_nb = or.field_a;
              if (var7 != 0) {
                this.field_cb = this.field_cb - 1;
                if (this.field_cb == 0) {
                  this.field_N = this.field_nb;
                }
              }
            }
          } else {
            this.field_cb = this.field_cb - 1;
            if (this.field_cb == 0) {
              this.field_N = this.field_nb;
            }
          }
          if (this.field_Db == 0) {
            if (~this.field_p != ~this.field_v) {
              this.field_f = this.field_p;
              this.field_Db = 20;
              if (var7 != 0) {
                this.field_Db = this.field_Db - 1;
                if (this.field_Db == 0) {
                  this.field_v = this.field_f;
                }
              }
            }
          } else {
            this.field_Db = this.field_Db - 1;
            if (this.field_Db == 0) {
              this.field_v = this.field_f;
            }
          }
          if (this.field_G > 0 &&
            this.field_V > 1) {
            this.field_G = this.field_G - 5;
          }
          if (this.field_Q != 0) {
            this.field_Q = this.field_Q - 1;
            if (this.field_Q == 0) {
              this.field_P = this.field_tb;
              if (var7 != 0 &&
                this.field_V != this.field_P) {
                this.field_tb = this.field_V;
                this.field_Q = 20;
              }
            }
          } else {
            if (this.field_V != this.field_P) {
              this.field_tb = this.field_V;
              this.field_Q = 20;
            }
          }
          var3Lifetime1 = this.field_eb - this.field_X.field_k * 100 / gh.field_j.field_e;
          this.field_qb = this.field_X.field_x + this.field_qb >> 1;
          if (var3Lifetime1 > 0) {
            this.field_eb = this.field_eb - (1 + (var3Lifetime1 >> 4));
          }
          if ((var3Lifetime1 <= 0 ||
            var7 != 0) &&
            var3Lifetime1 < 0) {
            this.field_eb = this.field_eb - ((var3Lifetime1 >> 4) - 1);
          }
          if (this.field_X.field_j >= 100) {
            this.field_a = this.field_X.field_j + this.field_a - 100 >> 1;
            if (var7 != 0) {
              this.field_a = this.field_a + this.field_X.field_j >> 1;
            }
          } else {
            this.field_a = this.field_a + this.field_X.field_j >> 1;
          }
          if (this.field_X.field_m > 0 &&
            this.field_bb < 255) {
            this.field_bb = this.field_bb + 8;
            if (this.field_bb > 255) {
              this.field_bb = 255;
            }
          }
          if (this.field_X.field_m == 0 &&
            this.field_bb > 0) {
            this.field_bb = this.field_bb - 8;
            if (this.field_bb < 0) {
              this.field_bb = 0;
            }
          }
          if (!this.field_yb &&
            !this.field_Cb &&
            !this.field_g &&
            1 == vj.field_d) {
            var4Lifetime1 = -22 + ln.field_c;
            var5 = -22 + lq.field_a;
            var6 = 0;
            while (var6 < 7) {
              if (var7 != 0) {
                return;
              }
              if (var4Lifetime1 * var4Lifetime1 + var5 * var5 < 289) {
                this.a(1, var6);
              }
              var5 -= 38;
              var6++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.I(" + param0 + ')');
        }
    }

    pk() {
        RuntimeException runtimeException = null;
        kc var1 = null;
        int var2 = 0;
        int var3 = 0;
        o var4 = null;
        int var5 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        this.field_k = 0;
        this.field_bb = 0;
        this.field_yb = true;
        this.field_c = 0;
        this.field_a = 0;
        this.field_sb = 0;
        this.field_db = 0;
        this.field_Ab = 0;
        this.field_lb = -1;
        this.field_eb = 100;
        this.field_o = 0;
        this.field_zb = -1;
        this.field_m = true;
        this.field_L = -1;
        this.field_pb = 0;
        this.field_C = new ok[1000];
        this.field_qb = 0;
        this.field_r = new int[7];
        this.field_z = new vc[200];
        this.field_D = new kc(0.0, 0.0);
        this.field_T = -100;
        this.field_Z = new int[16];
        this.field_cb = 0;
        this.field_G = 200;
        this.field_H = 0;
        this.field_W = false;
        this.field_rb = false;
        this.field_B = false;
        this.field_M = 0;
        this.field_ob = false;
        this.field_kb = 600.0;
        this.field_d = 0;
        this.field_mb = 0;
        this.field_P = 1;
        this.field_nb = 0;
        this.field_Db = 0;
        this.field_tb = 1;
        this.field_Eb = false;
        this.field_N = 0;
        this.field_ib = -100;
        this.field_Q = 0;
        this.field_x = 0;
        this.field_U = false;
        this.field_J = 0;
        this.field_R = 200;
        this.field_V = 1;
        try {
          stackIn_4_1 = !(2 > ln.field_d);
          this.field_j = stackIn_4_1;
          var1 = new kc();
          var2 = qq.a(20, 128);
          this.field_E = new o[30];
          var3 = 0;
          while (30 > var3) {
            var1.a((double)qq.a(20, 3200), (double)qq.a(20, 2400), true);
            var4 = new o(var1);
            var4.field_b = 0.5;
            var4.field_e = (double)(qq.a(20, 128) + var2);
            this.field_E[var3] = var4;
            var3++;
            if (var5 != 0) {
              return;
            }
          }
          this.c((byte) 56);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.<init>()");
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
