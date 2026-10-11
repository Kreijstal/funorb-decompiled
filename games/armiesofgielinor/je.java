/*
 * Decompiled by CFR-JS 0.4.0.
 */
class je extends im {
    private boolean field_Db;
    int field_gb;
    int field_L;
    private int field_ib;
    static je field_Q;
    boolean field_ub;
    RgbSprite[] field_A;
    NodeDeque field_fb;
    RgbSprite[] field_mb;
    int field_R;
    int field_N;
    boolean field_M;
    int field_hb;
    RgbSprite[] field_G;
    boolean field_eb;
    int field_O;
    int field_W;
    private int field_E;
    private boolean field_Cb;
    String field_X;
    RgbSprite field_cb;
    int field_tb;
    static String field_zb;
    String field_I;
    int field_V;
    int field_Eb;
    boolean field_Gb;
    int field_Bb;
    int field_pb;
    RgbSprite[] field_H;
    int field_nb;
    int field_F;
    private int field_J;
    int field_C;
    boolean field_xb;
    boolean field_rb;
    int field_bb;
    int field_B;
    int field_T;
    int field_yb;
    int field_S;
    int field_ob;
    RgbSprite field_P;
    int field_z;
    int field_db;
    static String field_lb;
    private int field_Hb;
    int field_D;
    boolean field_jb;
    int field_wb;
    boolean field_Y;
    int field_Fb;
    private int field_Ab;
    RgbSprite[] field_U;
    static int[][] field_K;
    RgbSprite field_sb;
    private int field_kb;
    RgbSprite field_vb;
    int field_ab;
    RgbSprite field_qb;
    BitmapFont field_Z;

    final void b(boolean param0, int param1) {
        this.a((byte) -26, SoftwareRaster.field_g, param0, SoftwareRaster.field_l, 0, false, false, false, 0, true, false);
        if (param1 != 20) {
          je var4 = (je) null;
          this.a((je) null, false, 64, (je) null);
        }
    }

    final static void c(boolean param0, int param1) {
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 > -101) {
          field_K = (int[][]) null;
        }
        if (param0 ||
          null == vu.field_M) {
          vk.field_f = false;
        }
        if (!param0) {
          if (null != vu.field_M) {
            if (gk.field_J <= 0) {
              if (PreparedAction.field_r <= 0) {
                if (mj.field_c > rk.field_D) {
                  if (rk.field_D == 0) {
                    ub.a(false, false);
                  }
                  rk.field_D = rk.field_D + 1;
                }
              } else {
                PreparedAction.field_r = PreparedAction.field_r - 1;
              }
            } else {
              gk.field_J = gk.field_J - 1;
            }
          } else {
            if (null == no.field_K) {
              vk.field_f = false;
              if (PreparedAction.field_r > 0) {
                PreparedAction.field_r = PreparedAction.field_r - 1;
              } else {
                if (rk.field_D > 0) {
                  rk.field_D = rk.field_D - 1;
                } else {
                  if (mj.field_c > gk.field_J) {
                    if (gk.field_J == 0) {
                      DeployEvent.h(14570);
                    }
                    gk.field_J = gk.field_J + 1;
                  }
                }
              }
            } else {
              if (gk.field_J > 0) {
                gk.field_J = gk.field_J - 1;
              } else {
                if (rk.field_D <= 0) {
                  if (mj.field_c > PreparedAction.field_r) {
                    if (0 == PreparedAction.field_r) {
                      ub.a(false, true);
                    }
                    PreparedAction.field_r = PreparedAction.field_r + 1;
                  }
                } else {
                  rk.field_D = rk.field_D - 1;
                }
              }
            }
          }
        } else {
          if (0 < gk.field_J) {
            gk.field_J = gk.field_J - 1;
          } else {
            if (PreparedAction.field_r <= 0) {
              if (0 < rk.field_D) {
                rk.field_D = rk.field_D - 1;
              }
            } else {
              PreparedAction.field_r = PreparedAction.field_r - 1;
            }
          }
        }
    }

    final void a(int param0, je param1) {
        boolean stackIn_72_1 = false;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_qb != null) {
              this.field_qb = param1.field_qb;
            }
            if (param1.field_N != 0) {
              this.field_N = param1.field_N;
            }
            if (param1.field_ub) {
              this.field_ub = param1.field_ub;
            }
            if (param1.field_sb != null) {
              this.field_sb = param1.field_sb;
            }
            if (param1.field_O != 0) {
              this.field_O = param1.field_O;
            }
            if (param1.field_Cb) {
              this.field_Cb = param1.field_Cb;
            }
            if (null != param1.field_mb) {
              this.field_mb = param1.field_mb;
            }
            if (param1.field_rb) {
              this.field_rb = param1.field_rb;
            }
            if (param1.field_A != null) {
              this.field_A = param1.field_A;
            }
            if (param1.field_C != 256) {
              this.field_C = param1.field_C;
            }
            if (param1.field_M) {
              this.field_M = param1.field_M;
            }
            if (0 != param1.field_pb) {
              this.field_pb = param1.field_pb;
            }
            if (null != param1.field_G) {
              this.field_G = param1.field_G;
            }
            if (param1.field_I != null) {
              this.field_I = param1.field_I;
            }
            if (param1.field_P != null) {
              this.field_P = param1.field_P;
            }
            if (null != param1.field_Z) {
              this.field_Z = param1.field_Z;
            }
            if (null != param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (param1.field_T >= 0) {
              this.field_T = param1.field_T;
            }
            if (param1.field_wb >= 0) {
              this.field_wb = param1.field_wb;
            }
            if (!param1.field_xb) {
              this.field_xb = param1.field_xb;
            }
            if (null != param1.field_X) {
              this.field_X = param1.field_X;
            }
            if (param1.field_W >= 0) {
              this.field_W = param1.field_W;
            }
            if (0 <= param1.field_L) {
              this.field_L = param1.field_L;
            }
            if (param1.field_H != null) {
              this.field_H = param1.field_H;
            }
            if (param1.field_U != null) {
              this.field_U = param1.field_U;
            }
            if (null != param1.field_vb) {
              this.field_vb = param1.field_vb;
            }
            if (-2147483648 != param1.field_B) {
              this.field_B = param1.field_B;
            }
            stackIn_72_1 = (this.field_M) && (param1.field_Y);
            this.field_Y = stackIn_72_1;
            if (param1.field_R != -2147483648) {
              this.field_R = param1.field_R;
            }
            if (param1.field_Gb) {
              this.field_Gb = param1.field_Gb;
            }
            if (param1.field_ib != -2147483648) {
              this.field_ib = param1.field_ib;
            }
            this.field_Db = param1.field_Db;
            if (param1.field_z != 0) {
              this.field_z = param1.field_z;
            }
            if (0 != param1.field_Fb) {
              this.field_Fb = param1.field_Fb;
            }
            if (param1.field_E != -2147483648) {
              this.field_E = param1.field_E;
            }
            if (param1.field_Bb != -2147483648) {
              this.field_Bb = param1.field_Bb;
            }
            if (param1.field_Eb != 0) {
              this.field_Eb = param1.field_Eb;
            }
            if (param1.field_tb != -2147483648) {
              this.field_tb = param1.field_tb;
            }
            if (param1.field_F != 0) {
              this.field_F = param1.field_F;
            }
          }
          if (param0 != 0) {
            this.field_M = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("je.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
        }
    }

    final void a(je param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null == this.field_fb) {
            this.field_fb = new NodeDeque();
          }
          this.field_fb.addLast((byte) -119, (IntrusiveNode) (param0));
          if (param1 < 36) {
            this.field_M = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("je.MA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        je var10_ref_je = null;
        int var9 = 0;
        int var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var9Lifetime1;
        if (param3 != -1379) {
          return;
        }
        int var5 = -this.field_ab;
        int var6 = -this.field_db + var5;
        int var7 = this.field_ob;
        int var8 = this.field_nb + var7;
        if (!param0) {
          var9 = 0;
          var10_ref_je = (je) (this.field_fb.first((byte) 124));
          while (var10_ref_je != null) {
            var10_ref_je.field_db = -var10_ref_je.field_ab + var9;
            var9 = var9 + (param2 + (var10_ref_je.field_nb + var10_ref_je.field_ob));
            var10_ref_je = (je) (this.field_fb.next((byte) 123));
          }
          var8 = var9 - param2;
        }
        var9Lifetime1 = -param1 + var8;
        if (var9Lifetime1 < var6) {
          var6 = var9Lifetime1;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = var7 - param1;
        if (var10 < var5) {
          var5 = var10;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        this.field_ob = var7;
        this.field_db = -var6 + var5;
        this.field_nb = -var7 + var8;
        this.field_ab = -var5;
    }

    je(long param0, je param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        boolean stackIn_30_1 = false;
        boolean stackIn_38_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        je var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_J > 0) {
          var7 = -(-this.field_J >> 2);
        } else {
          var7 = this.field_J >> 2;
        }
        this.field_J = this.field_J - var7;
        this.field_S = this.field_S + var7;
        if (0 < this.field_db) {
          var7Lifetime1 = -(-this.field_db >> 2);
        } else {
          var7Lifetime1 = this.field_db >> 2;
        }
        this.field_ab = this.field_ab + var7Lifetime1;
        this.field_db = this.field_db - var7Lifetime1;
        if (this.field_Hb > 0) {
          var7Lifetime2 = -(-this.field_Hb >> 2);
        } else {
          var7Lifetime2 = this.field_Hb >> 2;
        }
        this.field_gb = this.field_gb + var7Lifetime2;
        this.field_Hb = this.field_Hb - var7Lifetime2;
        if (this.field_nb > 0) {
          var7Lifetime3 = -(-this.field_nb >> 2);
        } else {
          var7Lifetime3 = this.field_nb >> 2;
        }
        this.field_V = param5 + this.field_S;
        param0 = param0 & this.field_xb;
        this.field_ob = this.field_ob + var7Lifetime3;
        this.field_nb = this.field_nb - var7Lifetime3;
        this.field_D = this.field_ab + param2;
        var8 = SoftwareRaster.field_j;
        var9 = SoftwareRaster.field_a;
        var10 = SoftwareRaster.field_e;
        var11 = SoftwareRaster.field_f;
        SoftwareRaster.b(this.field_V, this.field_D, this.field_V + this.field_gb, this.field_D + this.field_ob);
        var12 = param1 ? 1 : 0;
        if (!bc.field_e &&
          param0 &&
          DeployEvent.field_A != 0 &&
          SoftwareRaster.field_j <= iu.field_t &&
          iu.field_t < SoftwareRaster.field_e &&
          TeleportAction.field_z >= SoftwareRaster.field_a &&
          TeleportAction.field_z < SoftwareRaster.field_f) {
          this.field_yb = DeployEvent.field_A;
          this.field_hb = DeployEvent.field_A;
          this.field_bb = -this.field_V + iu.field_t;
          var12 = 1;
          this.field_Ab = -this.field_D + TeleportAction.field_z;
        } else {
          this.field_yb = 0;
          if (DeployEvent.field_A != 0) {
            this.field_hb = 0;
          }
        }
        stackIn_30_1 = (!bl.field_f) && (SoftwareRaster.field_j <= AiPlanningStrategy.field_d) && (SoftwareRaster.field_e > AiPlanningStrategy.field_d) && (SoftwareRaster.field_a <= ko.field_b) && (SoftwareRaster.field_f > ko.field_b);
        this.field_jb = stackIn_30_1;
        if (ro.field_ub == 0) {
          this.field_hb = 0;
        }
        stackIn_38_1 = (this.field_jb) && (ro.field_ub == this.field_hb) && (param0);
        this.field_eb = stackIn_38_1;
        if (null != this.field_fb) {
          var13 = (je) (this.field_fb.d((byte) -82));
          while (var13 != null) {
            var13.a(param0, param1, this.field_D, this.field_ob, this.field_gb, this.field_V);
            var13 = (je) (this.field_fb.b((byte) 88));
          }
        }
        if (var12 != 0) {
          bc.field_e = true;
        }
        if (this.field_jb) {
          bl.field_f = true;
        }
        SoftwareRaster.f(var8, var9, var10, var11);
        if (this.field_hb != 0 &&
          this.field_Gb) {
          this.field_S = -this.field_bb + AiPlanningStrategy.field_d - param5;
          this.field_ab = -this.field_Ab + ko.field_b - param2;
          if (0 > this.field_S) {
            this.field_S = 0;
          }
          if (this.field_ab < 0) {
            this.field_ab = 0;
          }
          if (this.field_S > param4 - this.field_gb) {
            this.field_S = -this.field_gb + param4;
          }
          this.field_db = 0;
          if (this.field_ab > param3 - this.field_ob) {
            this.field_ab = param3 - this.field_ob;
          }
          this.field_V = this.field_S + param5;
          this.field_J = 0;
          this.field_D = param2 + this.field_ab;
        }
    }

    final void b(int param0, je param1) {
        bb var3 = null;
        je var4 = null;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 3) {
            this.a(true, 119, -41, -35);
          }
          if (null != this.field_fb) {
            var3 = new bb(this.field_fb);
            var4 = (je) (var3.c(param0 + 47));
            while (var4 != null) {
              var4.b(param0 ^ 0, param1);
              var4 = (je) (var3.b(param0 + 47));
            }
          }
          stackIn_11_1 = (param1 == this);
          this.field_Y = stackIn_11_1;
          if (this.field_Db) {
            this.field_rb = this.field_Y;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("je.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        je stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_7_4 = 0;
        int stackIn_43_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        je var7 = null;
        int var7_int = 0;
        int var8 = 0;
        je var8_ref_je = null;
        nf var9 = null;
        int var9_int = 0;
        int var10 = 0;
        nf var10_ref_nf = null;
        int var12 = 0;
        int var13 = 0;
        je var14 = null;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          tq.field_c = SoftwareRaster.field_l;
          bm.field_p = SoftwareRaster.field_g;
          if (param1) {
            stackIn_4_0 = PreparedAction.field_r;
          } else {
            stackIn_4_0 = rk.field_D;
          }
          qb.a(stackIn_4_0, -106);
          ij.field_w.a(-40 + lk.field_a.field_ob - 2, (byte) -125, 0, lk.field_a.field_gb, 0);
          gg.field_E.a(jn.field_d, -20500, eb.field_c.field_gb, 0, 0);
          stackIn_6_0 = di.field_l;
          stackIn_6_1 = 18;
          stackIn_6_2 = -20500;
          stackIn_6_3 = eb.field_c.field_gb;
          if (fh.field_c) {
            stackIn_7_4 = 2 + jn.field_c + 42;
          } else {
            stackIn_7_4 = 0;
          }
          ((je) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3 - stackIn_7_4, 2 + jn.field_d, 0);
          SpellCastEvent.field_D.a(18, -20500, 42 + jn.field_c, 2 + jn.field_d, -40 + (eb.field_c.field_gb - jn.field_c - 2));
          bu.field_a.a(0, false, eb.field_c.field_gb, 2, jn.field_c, 20 + (2 + jn.field_d), -20 + (-2 + (-jn.field_d + eb.field_c.field_ob)));
          mp.field_Lb.a(40, -20500, lk.field_a.field_gb, lk.field_a.field_ob - 40, 0);
          kd.field_F.a(30, -20500, pd.field_c.field_gb, 0, 0);
          if (param0 < 13) {
            return;
          }
          vc.field_l.a(-2 + pd.field_c.field_ob - 70, -20500, pd.field_c.field_gb, 30, 0);
          var2_int = 3 + tq.field_b;
          if (2 > lm.field_e.length) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = -2 + (-15 + (-5 + vc.field_l.field_ob + (2 + (1 + var2_int) / 2))) / (var2_int + 1);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + (vc.field_l.field_ob - (5 + (var3 + 2) * var2_int));
          if (var4 > 40) {
            var4 = 40;
          }
          iu.field_d.a(var4, -20500, vc.field_l.field_gb - 5 - 5, 5, 5);
          var5 = 5 + var4 + 2;
          for (var6 = 0; 4 + tq.field_b > var6; var6++) {
            if ((var6 != 1 ||
              !(lm.field_e.length < 2)) && (3 != var6 ||
              !(1 >= ei.field_h))) {
              if (!param1 &&
                var6 == 3) {
                var7 = KingBlackDragonEvent.field_z[var6];
                KingBlackDragonEvent.field_z[var6].field_ob = 0;
                var7.field_gb = 0;
                for (var8 = 0; var8 < pu.field_k[var6].length; var8++) {
                  if (null != pu.field_k[var6][var8]) {
                    var9 = pu.field_k[var6][var8];
                    pu.field_k[var6][var8].field_ob = 0;
                    var9.field_gb = 0;
                  }
                }
              } else if (param1 &&
                var6 == 0) {
                var14 = KingBlackDragonEvent.field_z[var6];
                var7 = var14;
                KingBlackDragonEvent.field_z[var6].field_ob = 0;
                var14.field_gb = 0;
                for (var8 = 0; pu.field_k[var6].length > var8; var8++) {
                  if (null != pu.field_k[var6][var8]) {
                    var9 = pu.field_k[var6][var8];
                    pu.field_k[var6][var8].field_ob = 0;
                    var9.field_gb = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (EventPresenter.field_o != null) {
                      stackIn_43_0 = (EventPresenter.field_o[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_43_0 = 0;
                    }
                  } else {
                    stackIn_43_0 = 0;
                  }
                } else {
                  stackIn_43_0 = 0;
                }
                var7_int = stackIn_43_0;
                if (var7_int != 0) {
                  var8_ref_je = KingBlackDragonEvent.field_z[var6];
                  KingBlackDragonEvent.field_z[var6].field_ob = 0;
                  var8_ref_je.field_gb = 0;
                  for (var9_int = 0; var9_int < pu.field_k[var6].length; var9_int++) {
                    if (pu.field_k[var6][var9_int] != null) {
                      var10_ref_nf = pu.field_k[var6][var9_int];
                      pu.field_k[var6][var9_int].field_ob = 0;
                      var10_ref_nf.field_gb = 0;
                    }
                  }
                } else {
                  KingBlackDragonEvent.field_z[var6].a(var3, -20500, 103, var5, 5);
                  var8 = 110;
                  if (param1) {
                    pu.field_k[var6][0].a(var3, 2, -30061, 38, var5, var8, io.field_n);
                    var8 += 40;
                  } else {
                    if (pu.field_k[var6][0] != null) {
                      var9 = pu.field_k[var6][0];
                      pu.field_k[var6][0].field_ob = 0;
                      var9.field_gb = 0;
                    }
                  }
                  var9_int = -5 + (pd.field_c.field_gb + (-var8 + 2));
                  var10 = pu.field_k[var6].length - 1;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    pu.field_k[var6][var11 + 1].a(var3, 2, -30061, var9_int * (1 + var11) / var10 - 2 - var12, var5, var8 + var12, io.field_n);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          ta.field_R.a(-134 + (SoftwareRaster.field_g - 10), -20500, 360, 10, SoftwareRaster.field_l - 360 >> 1);
          bk.field_f.a(24, -20500, ta.field_R.field_gb, 0, 0);
          df.field_K.a(-24 + ta.field_R.field_ob, -20500, ta.field_R.field_gb, 24, 0);
          df.field_K.field_G = tq.a(11579568, false, df.field_K.field_ob, 1, 3, 8421504);
          nf.field_Kb.a(df.field_K.field_ob - 36, -20500, df.field_K.field_gb - 10, 5, 5);
          dv.field_m.a(24, -20500, 80, -24 + df.field_K.field_ob - 5, (df.field_K.field_gb - 80) / 2);
          mj.a((byte) 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "je.CB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        bc.field_e = !param1 ? true : false;
        bl.field_f = !param1 ? true : false;
        this.a(param0, false, 0, SoftwareRaster.field_g, SoftwareRaster.field_l, 0);
    }

    je(long param0, je param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void i(int param0) {
        je var4 = null;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != this.field_fb) {
          var4 = (je) (this.field_fb.d((byte) -112));
          while (var4 != null) {
            var4.field_Cb = true;
            var4.i(-10027);
            var4 = (je) (this.field_fb.b((byte) -104));
          }
        }
        if (param0 != -10027) {
          this.field_fb = (NodeDeque) null;
        }
    }

    final void a(je param0, boolean param1, int param2, je param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!param1) {
            je.a(-53, false);
          }
          if (param3 == null) {
            param0.field_db = 0;
            param0.field_ab = 0;
          } else {
            param0.field_db = param3.field_nb + param3.field_db;
            param0.field_ab = param3.field_ab - (-param3.field_ob - param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("je.PA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9, boolean param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        RgbSprite[] var16;
        RgbSprite var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        je var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_V = this.field_S + param8;
        this.field_D = this.field_ab + param4;
        var12 = SoftwareRaster.field_j;
        var13 = SoftwareRaster.field_a;
        var14 = SoftwareRaster.field_e;
        var15 = SoftwareRaster.field_f;
        SoftwareRaster.b(this.field_V, this.field_D, this.field_gb + this.field_V, this.field_ob + this.field_D);
        param9 = param9 & this.field_xb;
        if (!this.field_Cb) {
          param7 = this.field_rb;
          param10 = this.field_eb;
          stackIn_5_0 = (0 != this.field_hb);
          param5 = stackIn_5_0;
        }
        if (param0 != -26) {
          return;
        }
        var16 = this.field_G;
        var17 = this.field_cb;
        var18 = this.field_N;
        var19 = 0;
        if (!param9) {
          if (this.field_L >= 0) {
            var18 = this.field_L;
          }
          if (this.field_sb != null) {
            var17 = this.field_sb;
          }
          if (null != this.field_A) {
            var16 = this.field_A;
          }
        }
        var20 = 0;
        if (param10) {
          if (null != this.field_mb) {
            var16 = this.field_mb;
          }
          if (null != this.field_vb) {
            var17 = this.field_vb;
          }
          if (-2147483648 != this.field_ib) {
            var19 = this.field_ib;
          }
          if (-2147483648 != this.field_E) {
            var20 = this.field_E;
          }
          if (this.field_W >= 0) {
            var18 = this.field_W;
          }
        }
        if (param5) {
          if (null != this.field_qb) {
            var17 = this.field_qb;
          }
          if (this.field_R != -2147483648) {
            var20 = this.field_R;
          }
          if (null != this.field_U) {
            var16 = this.field_U;
          }
          if (this.field_Bb != -2147483648) {
            var19 = this.field_Bb;
          }
          if (this.field_T >= 0) {
            var18 = this.field_T;
          }
        }
        if (param7) {
          if (this.field_H != null) {
            var16 = this.field_H;
          }
          if (this.field_B != -2147483648) {
            var19 = this.field_B;
          }
          if (-2147483648 != this.field_tb) {
            var20 = this.field_tb;
          }
          if (null != this.field_P) {
            var17 = this.field_P;
          }
          if (this.field_wb >= 0) {
            var18 = this.field_wb;
          }
        }
        var21 = this.field_F + var19;
        var22 = var20 + this.field_z;
        if (this.field_ub) {
          i.a(var16, param1, param8, (byte) -47, param4, param3);
        } else {
          i.a(var16, this.field_ob, this.field_V, (byte) -47, this.field_D, this.field_gb);
        }
        if (var17 != null) {
          var23_int = var21 + this.field_V;
          if (1 == this.field_Eb) {
            var23_int = var23_int + (this.field_gb - var17.field_A) / 2;
          }
          var24 = this.field_D + var22;
          if (this.field_Fb == 1) {
            var24 = var24 + (-var17.field_x + this.field_ob) / 2;
          }
          if (2 == this.field_Eb) {
            var23_int = var23_int + (this.field_gb - var17.field_A);
          }
          if (2 == this.field_Fb) {
            var24 = var24 + (this.field_ob - var17.field_x);
          }
          if (256 <= this.field_kb) {
            var17.g(var23_int, var24);
          } else {
            var17.e(var23_int, var24, this.field_kb);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_X &&
          this.field_Z != null) {
          var26 = this.field_X;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param2 &&
            null != this.field_I) {
            var23Lifetime2 = var26 + this.field_I;
          }
          if (this.field_Z.a(var23Lifetime2) <= this.field_gb - 2 * this.field_O &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_Fb != 1) {
              if (this.field_Fb == 2) {
                var22 = var22 + (-this.field_Z.field_H + (-this.field_Z.field_L + this.field_ob));
              }
            } else {
              var22 = var22 + (-this.field_Z.field_L + this.field_ob - this.field_Z.field_H) / 2;
            }
            if (this.field_Eb == 0) {
              this.field_Z.b(var23Lifetime2, this.field_O + this.field_V + var21, this.field_Z.field_H + (this.field_D + var22), var18, -1, this.field_C);
            } else {
              if (this.field_Eb == 1) {
                this.field_Z.a(var23Lifetime2, var21 + (this.field_V + this.field_O + (this.field_gb - 2 * this.field_O) / 2), var22 + (this.field_D + this.field_Z.field_H), var18, -1, this.field_C);
              } else {
                if (2 != this.field_Eb) {
                  this.field_Z.a(var23Lifetime2, this.field_V + this.field_O + var21, var22 + this.field_D, -(2 * this.field_O) + this.field_gb, this.field_ob, var18, -1, this.field_C, this.field_Eb, this.field_Fb, this.field_pb);
                } else {
                  this.field_Z.c(var23Lifetime2, this.field_V + this.field_O + var21 - (-this.field_gb + this.field_O * 2), var22 + this.field_D + this.field_Z.field_H, var18, -1, this.field_C);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_Z.a(var23Lifetime2, this.field_O + this.field_V + var21, var22 + this.field_D, -(2 * this.field_O) + this.field_gb, this.field_ob, var18, -1, this.field_C, this.field_Eb, this.field_Fb, this.field_pb);
          }
        }
        if (this.field_fb != null) {
          var23_ref = (je) (this.field_fb.first((byte) 118));
          while (var23_ref != null) {
            var23_ref.a((byte) -26, this.field_ob, param2, this.field_gb, var20 + this.field_D, param5, this.field_Y, param7, this.field_V + var19, param9, param10);
            var23_ref = (je) (this.field_fb.next((byte) 123));
          }
        }
        SoftwareRaster.f(var12, var13, var14, var15);
        return;
    }

    final int j(int param0) {
        int var2 = -17 % ((30 - param0) / 58);
        return this.a(true, 2147483647);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_ab = param3;
        this.field_nb = 0;
        this.field_gb = param2;
        this.field_J = 0;
        if (param1 != -20500) {
          return;
        }
        this.field_db = 0;
        this.field_Hb = 0;
        this.field_S = param4;
        this.field_ob = param0;
    }

    final int a(boolean param0, int param1) {
        je var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4_intLifetime1;
        if (!param0) {
          this.field_ab = -10;
        }
        int var3 = 0;
        if (null != this.field_X &&
          null != this.field_Z) {
          var4_int = this.field_Z.a(this.field_X, param1);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (this.field_cb != null) {
          var4_intLifetime1 = this.field_cb.field_A;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (this.field_fb != null) {
          var4 = (je) (this.field_fb.first((byte) 93));
          while (var4 != null) {
            var5 = var4.field_S + var4.field_gb;
            if (var5 > var3) {
              var3 = var5;
            }
            var4 = (je) (this.field_fb.next((byte) 123));
          }
        }
        return var3;
    }

    public static void h(int param0) {
        field_Q = null;
        int var1 = 52 / ((param0 + 55) / 44);
        field_K = (int[][]) null;
        field_zb = null;
        field_lb = null;
    }

    public je() {
        this.field_L = -1;
        this.field_Db = false;
        this.field_C = 256;
        this.field_ib = -2147483648;
        this.field_W = -1;
        this.field_B = -2147483648;
        this.field_Bb = -2147483648;
        this.field_M = false;
        this.field_T = -1;
        this.field_E = -2147483648;
        this.field_R = -2147483648;
        this.field_xb = true;
        this.field_Y = false;
        this.field_kb = 256;
        this.field_wb = -1;
        this.field_tb = -2147483648;
    }

    je(long param0, je param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_L = -1;
        this.field_Db = false;
        this.field_C = 256;
        this.field_ib = -2147483648;
        this.field_W = -1;
        this.field_B = -2147483648;
        this.field_Bb = -2147483648;
        this.field_M = false;
        this.field_T = -1;
        this.field_E = -2147483648;
        this.field_R = -2147483648;
        this.field_xb = true;
        this.field_Y = false;
        this.field_kb = 256;
        this.field_wb = -1;
        this.field_tb = -2147483648;
        try {
          this.field_ob = param5;
          this.field_S = param2;
          this.field_ab = param3;
          this.field_gb = param4;
          this.key = param0;
          this.a(0, param1);
          if (param6 != null) {
            this.field_X = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "je.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_lb = "Wizards and warriors, foul demons and brutal orks, vicious goblins and fearless dwarves: all are yours to summon and command.";
        field_zb = "Private";
        field_K = new int[][]{new int[]{35, 0}, new int[]{42, 42}, new int[]{35, 0}, new int[]{13, 40}, new int[]{33, 48}, new int[]{25, 0}, new int[]{28, 0}, new int[]{50, 41}, new int[]{43, 0}, new int[]{30, 0}, new int[]{50, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{32, 0}, new int[]{36, 36}, new int[]{30, 0}, new int[]{24, 39}, new int[]{50, 41}, new int[]{38, 38}, new int[]{35, 0}, new int[]{20, 0}, new int[]{35, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{45, 0}, new int[]{25, 38}, new int[]{49, 0}, new int[]{30, 0}, new int[]{24, 0}, new int[]{25, 0}, new int[]{37, 0}, new int[]{58, 0}, new int[]{50, 41}, new int[]{35, 0}, new int[]{35, 0}, new int[]{51, 0}, new int[]{50, 0}, new int[]{11, 11}, new int[]{20, 20}, new int[]{35, 0}, new int[]{38, 0}, new int[]{30, 0}, new int[]{75, 0}, new int[]{24, 0}, new int[]{24, 0}, new int[]{20, 0}, new int[]{58, 0}, new int[]{37, 0}, new int[]{25, 38}, new int[]{37, 0}, new int[]{50, 0}, new int[]{40, 35}, new int[]{31, 0}, new int[]{28, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{44, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{41, 0}, new int[]{53, 0}, new int[]{30, 0}, new int[]{38, 0}, new int[]{47, 0}, new int[]{63, 0}, new int[]{32, 0}, new int[]{22, 0}, new int[]{43, 0}, new int[]{36, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{50, 41}, new int[]{33, 48}, new int[]{18, 18}, new int[]{1, 0}, new int[]{24, 0}, new int[]{24, 39}, new int[]{25, 38}, new int[]{25, 38}, new int[]{33, 48}, new int[]{50, 41}, new int[]{34, 4}, new int[]{25, 3}, new int[]{35, 21}, new int[]{19, 3}, new int[]{18, 2}, new int[]{25, 6}, new int[]{35, 21}};
    }
}
