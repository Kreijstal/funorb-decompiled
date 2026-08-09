/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends ee {
    static String field_W;
    static int field_gb;
    static String field_Ib;
    da field_jb;
    private da field_Jb;
    int field_yb;
    ek field_Bb;
    tf field_Lb;
    int field_R;
    int field_Hb;
    int field_ib;
    boolean field_mb;
    private int field_Qb;
    boolean field_eb;
    boolean field_Eb;
    boolean field_Sb;
    boolean field_Rb;
    int field_tb;
    int field_ub;
    private kh[] field_Ab;
    h[] field_Nb;
    private double[] field_bb;
    boolean field_cb;
    boolean field_hb;
    int field_Pb;
    boolean field_T;
    private int field_kb;
    private int field_Kb;
    private gk field_wb;
    private gk field_Y;
    boolean field_Ob;
    int field_ab;
    private int field_Z;
    boolean field_rb;
    private gk field_Cb;
    int field_zb;
    private boolean field_Mb;
    boolean field_nb;
    boolean field_sb;
    int field_U;
    boolean field_X;
    int field_Gb;
    double field_Db;
    private gk field_V;
    private int field_Q;
    private hm field_S;
    private gk field_db;
    private int field_fb;
    private int field_lb;
    private oi field_qb;
    private oi field_pb;
    private int field_ob;
    private int field_xb;
    private boolean field_Fb;
    private boolean field_vb;

    final boolean o(int param0) {
        int var2;
        int var3;
        int var4;
        h var5;
        int var6;
        var6 = Confined.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        if (param0 <= -84) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= 5) {
              L1: {
                if (var2 == 0) {
                  break L1;
                } else {
                  if (var3 != 5) {
                    break L1;
                  } else {
                    L2: {
                      var4 = this.field_A.field_J.field_o;
                      if (-1 <= (this.field_A.field_x.field_t ^ -1)) {
                        break L2;
                      } else {
                        if (this.field_A.field_B.field_D >= this.field_A.field_x.field_r[this.field_A.field_x.field_t]) {
                          break L2;
                        } else {
                          var4--;
                          break L2;
                        }
                      }
                    }
                    if (var4 > 8) {
                      if (12 >= var4) {
                        di.a(-30867, 247, 8);
                        break L1;
                      } else {
                        if (-17 <= (var4 ^ -1)) {
                          di.a(-30867, 248, 7);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      di.a(-30867, 246, 9);
                      break L1;
                    }
                  }
                }
              }
              return var2 != 0;
            } else {
              L3: {
                if (var2 != 0) {
                  break L3;
                } else {
                  if (this.field_Nb[var4] == null) {
                    var5 = new h(this.field_A, (dj) (this), var4);
                    ri.a((rk) (this), 0, var5);
                    this.field_Nb[var4] = var5;
                    var2 = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (null != this.field_Nb[var4]) {
                var3++;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    dj(hn param0) {
        super(param0, 0.0, 0.0, 5.0, 0.3, 0.1);
        this.field_jb = new da();
        this.field_Jb = new da();
        this.field_yb = 2;
        this.field_Bb = new ek((ee) (this), true, false, 8);
        this.field_Lb = new tf((ee) (this));
        this.field_Hb = 65536;
        this.field_Rb = true;
        this.field_R = 0;
        this.field_T = true;
        this.field_cb = false;
        this.field_Kb = 0;
        this.field_ub = -1;
        this.field_Sb = false;
        this.field_Z = 0;
        this.field_bb = new double[12];
        this.field_ib = 0;
        this.field_Pb = 0;
        this.field_Eb = false;
        this.field_rb = false;
        this.field_mb = false;
        this.field_ab = -1;
        this.field_kb = 0;
        this.field_tb = -1;
        this.field_hb = true;
        this.field_Y = null;
        this.field_Qb = 0;
        this.field_eb = false;
        this.field_wb = null;
        this.field_zb = -1;
        this.field_Ob = true;
        this.field_Nb = new h[5];
        this.field_sb = true;
        this.field_nb = true;
        this.field_Mb = false;
        this.field_Gb = 0;
        this.field_U = 0;
        this.field_Ab = new kh[]{new kh((pm) (this), hf.field_T, 0), new kh((pm) (this), hf.field_T, 53), new kh((pm) (this), hf.field_T, 134), new kh((pm) (this), hf.field_T, 231)};
        this.field_Db = 0.0;
        this.field_Q = 0;
        this.field_S = new hm((pm) (this), ki.field_a);
        this.field_fb = 0;
        this.field_lb = 0;
        this.field_qb = new oi((pm) (this));
        this.field_pb = new oi((pm) (this));
        this.field_ob = 0;
        this.field_vb = false;
        this.field_Fb = false;
        try {
            this.field_db = new gk((pm) (this), se.field_a);
            this.field_db.field_m = 0;
            this.field_V = new gk((pm) (this), nm.field_F);
            this.field_V.field_m = 0;
            this.field_Cb = new gk((pm) (this), di.field_a);
            this.field_Cb.field_m = 12;
            this.field_Bb.field_d = 0;
            this.field_L = 0.0;
            this.field_Lb.b(118);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != -1) {
            return;
        }
        field_W = null;
        field_Ib = null;
    }

    final static Boolean i(byte param0) {
        Boolean var1 = ca.field_o;
        ca.field_o = null;
        if (param0 < 106) {
            return (Boolean) null;
        }
        return var1;
    }

    final void a(int param0, int param1) {
        Object stackIn_93_0;
        int stackIn_93_1;
        cf stackIn_93_2;
        cf stackIn_93_3;
        hn stackIn_93_4;
        Object stackIn_93_5;
        double[] stackIn_93_6;
        double[] stackIn_93_7;
        double stackIn_93_8;
        double stackIn_93_9;
        Object stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        cf stackIn_94_2 = null;
        cf stackIn_94_3 = null;
        hn stackIn_94_4 = null;
        Object stackIn_94_5 = null;
        double[] stackIn_94_6 = null;
        double[] stackIn_94_7 = null;
        double stackIn_94_8 = 0.0;
        double stackIn_94_9 = 0.0;
        int stackIn_94_10 = 0;
        Object stackIn_96_0;
        Object stackIn_96_5;
        boolean stackIn_96_11;
        Object stackIn_97_0 = null;
        Object stackIn_97_5 = null;
        boolean stackIn_97_11 = false;
        int stackIn_97_12 = 0;
        Object stackIn_99_0 = null;
        Object stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        Object stackIn_104_0;
        int stackIn_104_1;
        cf stackIn_104_2;
        cf stackIn_104_3;
        hn stackIn_104_4;
        Object stackIn_104_5;
        double[] stackIn_104_6;
        double[] stackIn_104_7;
        double stackIn_104_8;
        double stackIn_104_9;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        cf stackIn_105_2 = null;
        cf stackIn_105_3 = null;
        hn stackIn_105_4 = null;
        Object stackIn_105_5 = null;
        double[] stackIn_105_6 = null;
        double[] stackIn_105_7 = null;
        double stackIn_105_8 = 0.0;
        double stackIn_105_9 = 0.0;
        int stackIn_105_10 = 0;
        Object stackIn_107_0;
        Object stackIn_107_5;
        int stackIn_107_11;
        Object stackIn_108_0 = null;
        Object stackIn_108_5 = null;
        int stackIn_108_11 = 0;
        int stackIn_108_12 = 0;
        Object stackIn_110_0;
        int stackIn_110_1;
        cf stackIn_110_2;
        cf stackIn_110_3;
        hn stackIn_110_4;
        Object stackIn_110_5;
        double[] stackIn_110_6;
        double[] stackIn_110_7;
        double stackIn_110_8;
        double stackIn_110_9;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        cf stackIn_111_2 = null;
        cf stackIn_111_3 = null;
        hn stackIn_111_4 = null;
        Object stackIn_111_5 = null;
        double[] stackIn_111_6 = null;
        double[] stackIn_111_7 = null;
        double stackIn_111_8 = 0.0;
        double stackIn_111_9 = 0.0;
        int stackIn_111_10 = 0;
        Object stackIn_113_0;
        Object stackIn_113_5;
        int stackIn_113_11;
        Object stackIn_114_0 = null;
        Object stackIn_114_5 = null;
        int stackIn_114_11 = 0;
        int stackIn_114_12 = 0;
        Object stackIn_116_0;
        int stackIn_116_1;
        cf stackIn_116_2;
        cf stackIn_116_3;
        hn stackIn_116_4;
        Object stackIn_116_5;
        double[] stackIn_116_6;
        double[] stackIn_116_7;
        double stackIn_116_8;
        double stackIn_116_9;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        cf stackIn_117_2 = null;
        cf stackIn_117_3 = null;
        hn stackIn_117_4 = null;
        Object stackIn_117_5 = null;
        double[] stackIn_117_6 = null;
        double[] stackIn_117_7 = null;
        double stackIn_117_8 = 0.0;
        double stackIn_117_9 = 0.0;
        int stackIn_117_10 = 0;
        Object stackIn_119_0;
        Object stackIn_119_5;
        int stackIn_119_11;
        Object stackIn_120_0 = null;
        Object stackIn_120_5 = null;
        int stackIn_120_11 = 0;
        int stackIn_120_12 = 0;
        Object stackIn_122_0;
        int stackIn_122_1;
        cf stackIn_122_2;
        cf stackIn_122_3;
        hn stackIn_122_4;
        Object stackIn_122_5;
        double[] stackIn_122_6;
        double[] stackIn_122_7;
        double stackIn_122_8;
        double stackIn_122_9;
        Object stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        cf stackIn_123_2 = null;
        cf stackIn_123_3 = null;
        hn stackIn_123_4 = null;
        Object stackIn_123_5 = null;
        double[] stackIn_123_6 = null;
        double[] stackIn_123_7 = null;
        double stackIn_123_8 = 0.0;
        double stackIn_123_9 = 0.0;
        int stackIn_123_10 = 0;
        Object stackIn_125_0;
        Object stackIn_125_5;
        int stackIn_125_11;
        Object stackIn_126_0;
        Object stackIn_126_5;
        int stackIn_126_11;
        int stackIn_126_12;
        Object stackIn_133_0;
        int stackIn_133_1;
        cf stackIn_133_2;
        cf stackIn_133_3;
        hn stackIn_133_4;
        h stackIn_133_5;
        double[] stackIn_133_6;
        double[] stackIn_133_7;
        double stackIn_133_8;
        double stackIn_133_9;
        Object stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        cf stackIn_134_2 = null;
        cf stackIn_134_3 = null;
        hn stackIn_134_4 = null;
        h stackIn_134_5 = null;
        double[] stackIn_134_6 = null;
        double[] stackIn_134_7 = null;
        double stackIn_134_8 = 0.0;
        double stackIn_134_9 = 0.0;
        int stackIn_134_10 = 0;
        Object stackIn_136_0;
        int stackIn_136_11;
        Object stackIn_137_0;
        int stackIn_137_11;
        int stackIn_137_12;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        bi stackIn_141_2 = null;
        int stackIn_153_0 = 0;
        Object stackIn_163_0;
        int stackIn_163_1;
        wm stackIn_163_2;
        wm stackIn_163_3;
        hn stackIn_163_4;
        Object stackIn_163_5;
        double[] stackIn_163_6;
        double stackIn_163_7;
        Object stackIn_164_0;
        int stackIn_164_1;
        wm stackIn_164_2;
        wm stackIn_164_3;
        hn stackIn_164_4;
        Object stackIn_164_5;
        double[] stackIn_164_6;
        double stackIn_164_7;
        int stackIn_164_8;
        int stackIn_187_0 = 0;
        Object stackIn_198_0;
        int stackIn_198_1;
        il stackIn_198_2;
        il stackIn_198_3;
        hn stackIn_198_4;
        Object stackIn_198_5;
        double[] stackIn_198_6;
        double stackIn_198_7;
        Object stackIn_199_0;
        int stackIn_199_1;
        il stackIn_199_2;
        il stackIn_199_3;
        hn stackIn_199_4;
        Object stackIn_199_5;
        double[] stackIn_199_6;
        double stackIn_199_7;
        int stackIn_199_8;
        pm stackIn_223_0 = null;
        Object stackIn_317_0 = null;
        h stackIn_317_1 = null;
        Throwable caughtException = null;
        Throwable decompiledCaughtException = null;
        double[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        pm var11_ref_pm = null;
        double var12_double = 0.0;
        int var12 = 0;
        Object var12_ref_Object = null;
        double var13_double = 0.0;
        int var13_int = 0;
        h var13 = null;
        double var14 = 0.0;
        h var14_ref_h = null;
        double var15 = 0.0;
        double var16 = 0.0;
        double var17 = 0.0;
        double var18_double = 0.0;
        int var18 = 0;
        h var19 = null;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        int var32 = 0;
        double[] var33 = null;
        h var34 = null;
        int var35 = 0;
        double[] var36 = null;
        double[] var37 = null;
        h var38 = null;
        h var39 = null;
        double[] var40 = null;
        double[] var41 = null;
        L0: {
          var32 = Confined.field_J ? 1 : 0;
          if ((this.field_Qb ^ -1) >= -1) {
            break L0;
          } else {
            this.field_Qb = this.field_Qb - 1;
            break L0;
          }
        }
        L1: {
          this.field_Bb.a(this.field_Lb, 3);
          this.field_Hb = this.field_Hb + 1024;
          if (this.field_Hb > 65536) {
            this.field_Hb = 65536;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((this.field_kb ^ -1) < -1) {
            this.field_kb = this.field_kb - 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (this.field_Hb < 32768) {
            break L3;
          } else {
            this.field_Mb = false;
            break L3;
          }
        }
        L4: {
          var40 = new double[12];
          var36 = var40;
          var33 = var36;
          var41 = var33;
          var37 = var41;
          var3 = var37;
          this.field_jb.a((byte) 68, var40);
          var4 = 0;
          if (!mc.field_e[96]) {
            break L4;
          } else {
            var4--;
            break L4;
          }
        }
        L5: {
          var5 = 0;
          if (!mc.field_e[98]) {
            break L5;
          } else {
            var5--;
            break L5;
          }
        }
        L6: {
          if (mc.field_e[97]) {
            var4++;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (mc.field_e[99]) {
            var5++;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (!mk.field_l) {
            break L8;
          } else {
            var5 = -var5;
            break L8;
          }
        }
        L9: {
          var6 = (double)var4;
          var8 = (double)var5;
          if (this.field_A.field_M) {
            L10: {
              if (this.field_A.field_y) {
                break L10;
              } else {
                if (null != this.field_A.field_K) {
                  break L10;
                } else {
                  L11: {
                    if (0 != (var5 | var4)) {
                      break L11;
                    } else {
                      if (rh.field_X != 0) {
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                  this.field_A.field_M = false;
                  break L9;
                }
              }
            }
            if (-3 >= (this.field_A.field_x.field_a ^ -1)) {
              L12: {
                this.field_A.field_x.b(3, param1, this.field_D + 2.0);
                var10_double = -this.field_A.field_x.field_B + this.field_E;
                var12_double = this.field_t - this.field_A.field_x.field_G;
                var14 = Math.sqrt(-(var40[5] * var40[5]) + 1.0);
                var16 = var40[3] / var14;
                var18_double = var40[4] / var14;
                var20 = Math.sqrt(1.0 - var40[8] * var40[8]);
                var22 = var40[6] / var20;
                var24 = var40[7] / var20;
                var26 = var12_double * var18_double + var10_double * var16;
                var28 = var12_double * var24 + var10_double * var22;
                var6 = -var26;
                var8 = -var28;
                if (-1.0 <= var6) {
                  break L12;
                } else {
                  var6 = -1.0;
                  break L12;
                }
              }
              L13: {
                if (var6 <= 1.0) {
                  break L13;
                } else {
                  var6 = 1.0;
                  break L13;
                }
              }
              L14: {
                if (var8 < -1.0) {
                  var8 = -1.0;
                  break L14;
                } else {
                  break L14;
                }
              }
              if (var8 > 1.0) {
                var8 = 1.0;
                break L9;
              } else {
                break L9;
              }
            } else {
              var8 = 0.0;
              var6 = 0.0;
              break L9;
            }
          } else {
            break L9;
          }
        }
        L15: {
          if (!this.field_A.field_M) {
            L16: {
              if (0 == rh.field_X) {
                break L16;
              } else {
                if (!this.field_vb) {
                  this.field_vb = true;
                  break L16;
                } else {
                  this.field_Fb = true;
                  break L16;
                }
              }
            }
            L17: {
              L18: {
                if (0 != var4) {
                  break L18;
                } else {
                  if (var5 != 0) {
                    break L18;
                  } else {
                    break L17;
                  }
                }
              }
              this.field_vb = false;
              break L17;
            }
            if (!this.field_vb) {
              break L15;
            } else {
              L19: {
                if (-1 != ld.field_l) {
                  break L19;
                } else {
                  if (b.field_f != 0) {
                    break L19;
                  } else {
                    break L15;
                  }
                }
              }
              L20: {
                var10_double = 320.0;
                var12_double = 188.0;
                if (qc.field_n) {
                  var10_double = var10_double + (this.field_L * var41[5] + (var41[4] * this.field_G + var41[3] * this.field_K)) * 1280.0;
                  var12_double = var12_double + (this.field_L * var41[8] + (this.field_G * var41[7] + var41[6] * this.field_K)) * 1280.0;
                  break L20;
                } else {
                  var14 = -this.field_A.field_m.field_T + this.field_E;
                  var16 = -this.field_A.field_m.field_L + this.field_t;
                  var18_double = this.field_D - this.field_A.field_m.field_O;
                  var20 = this.field_A.field_m.field_M * var18_double + (this.field_A.field_m.field_R * var14 + this.field_A.field_m.field_ab * var16);
                  var22 = var16 * this.field_A.field_m.field_U + this.field_A.field_m.field_V * var14 + this.field_A.field_m.field_F * var18_double;
                  var24 = this.field_A.field_m.field_P * var14 + this.field_A.field_m.field_H * var16 + this.field_A.field_m.field_N * var18_double;
                  if (var24 < 0.01) {
                    break L20;
                  } else {
                    var10_double = 320.0 + 640.0 * (var20 / var24);
                    var12_double = 188.0 + 640.0 * (var22 / var24);
                    break L20;
                  }
                }
              }
              L21: {
                var6 = ((double)ld.field_l - var10_double) * 0.02127659574468085;
                var8 = 0.02127659574468085 * ((double)jh.field_R - var12_double);
                if (var6 < -1.0) {
                  var8 = var8 / -var6;
                  var6 = -1.0;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (1.0 < var6) {
                  var8 = var8 / var6;
                  var6 = 1.0;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                if (var8 < -1.0) {
                  var6 = var6 / -var8;
                  var8 = -1.0;
                  break L23;
                } else {
                  break L23;
                }
              }
              if (var8 > 1.0) {
                var6 = var6 / var8;
                var8 = 1.0;
                break L15;
              } else {
                break L15;
              }
            }
          } else {
            break L15;
          }
        }
        L24: {
          if (var6 != 0.0) {
            this.field_G = this.field_G + var6 * 0.005 * var41[4];
            this.field_L = this.field_L + var41[5] * (0.005 * var6);
            this.field_K = this.field_K + var41[3] * (var6 * 0.005);
            hd.field_e.a(var6 * 0.001, var41[8], var41[6], var41[7], 7);
            this.field_Jb.a(-117, hd.field_e);
            break L24;
          } else {
            break L24;
          }
        }
        L25: {
          if (var8 == 0.0) {
            break L25;
          } else {
            this.field_L = this.field_L + var41[8] * (0.005 * var8);
            this.field_G = this.field_G + var8 * 0.005 * var41[7];
            this.field_K = this.field_K + 0.005 * var8 * var41[6];
            hd.field_e.a(-0.001 * var8, var41[5], var41[3], var41[4], 7);
            this.field_Jb.a(param0 + -11895, hd.field_e);
            break L25;
          }
        }
        L26: {
          this.field_Jb.a(0.9, (byte) -65);
          this.field_jb.a(-84, this.field_Jb);
          this.field_jb.a((byte) 27, var41);
          if (var41[11] < 0.8660254037844386) {
            var10_double = Math.sqrt(-(var41[11] * var41[11]) + 1.0);
            var12_double = var41[10] / var10_double;
            var14 = -var41[9] / var10_double;
            var16 = -Math.asin(var41[11]) + 1.0471975511965976;
            hd.field_e.a(var16, 0.0, var12_double, var14, 7);
            this.field_jb.a(-33, hd.field_e);
            this.field_jb.a((byte) 75, var41);
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          L28: {
            this.field_G = (this.field_G + 0.01 * var41[10]) * 0.95;
            this.field_L = (this.field_L + var41[11] * 0.01) * 0.95;
            this.field_K = (this.field_K + var41[9] * 0.01) * 0.95;
            super.a(param0, param1);
            this.field_Lb.c(16777215);
            var10 = mc.field_e[82] ? 1 : 0;
            if (!this.field_vb) {
              break L28;
            } else {
              if (!this.field_Fb) {
                break L28;
              } else {
                if (b.field_f != 0) {
                  var10 = 1;
                  break L27;
                } else {
                  break L28;
                }
              }
            }
          }
          this.field_Fb = false;
          break L27;
        }
        L29: {
          if (this.field_A.field_M) {
            break L29;
          } else {
            if (this.field_Mb) {
              break L29;
            } else {
              if (var10 == 0) {
                break L29;
              } else {
                if (0 != this.field_kb) {
                  break L29;
                } else {
                  var11 = 5120;
                  if (this.field_Hb < var11) {
                    this.field_Mb = true;
                    break L29;
                  } else {
                    L30: {
                      this.field_A.field_v = true;
                      this.field_A.field_t = true;
                      this.field_Lb.b(118);
                      stackIn_93_0 = this;

                      stackIn_93_1 = 0;

                      stackIn_93_2 = null;

                      stackIn_93_3 = null;

                      stackIn_93_4 = this.field_A;

                      stackIn_93_5 = this;

                      stackIn_93_6 = (double[]) (var3);

                      stackIn_93_7 = me.field_J;

                      stackIn_93_8 = 0.0;

                      stackIn_93_9 = 0.0;

                      if (0 >= this.field_Pb) {
                        stackIn_94_0 = this;
                        stackIn_94_1 = stackIn_93_1;
                        stackIn_94_2 = null;
                        stackIn_94_3 = null;
                        stackIn_94_4 = (hn) ((Object) stackIn_93_4);
                        stackIn_94_5 = this;
                        stackIn_94_6 = (double[]) ((Object) stackIn_93_6);
                        stackIn_94_7 = (double[]) ((Object) stackIn_93_7);
                        stackIn_94_8 = stackIn_93_8;
                        stackIn_94_9 = stackIn_93_9;
                        stackIn_94_10 = 0;
                        break L30;
                      } else {
                        stackIn_94_0 = this;
                        stackIn_94_1 = stackIn_93_1;
                        stackIn_94_2 = null;
                        stackIn_94_3 = null;
                        stackIn_94_4 = (hn) ((Object) stackIn_93_4);
                        stackIn_94_5 = this;
                        stackIn_94_6 = (double[]) ((Object) stackIn_93_6);
                        stackIn_94_7 = (double[]) ((Object) stackIn_93_7);
                        stackIn_94_8 = stackIn_93_8;
                        stackIn_94_9 = stackIn_93_9;
                        stackIn_94_10 = 1;
                        break L30;
                      }
                    }
                    L31: {
                      stackIn_96_0 = this;

                      stackIn_96_5 = this;

                      stackIn_96_11 = this.field_Eb;

                      if (this.field_U <= 0) {
                        stackIn_97_0 = this;

                        stackIn_94_2 = null;
                        stackIn_94_3 = null;
                        stackIn_94_4 = (hn) ((Object) stackIn_94_4);
                        stackIn_97_5 = this;
                        stackIn_94_6 = (double[]) ((Object) stackIn_94_6);
                        stackIn_94_7 = (double[]) ((Object) stackIn_94_7);



                        stackIn_97_11 = stackIn_96_11;
                        stackIn_97_12 = 0;
                        break L31;
                      } else {
                        stackIn_97_0 = this;

                        stackIn_94_2 = null;
                        stackIn_94_3 = null;
                        stackIn_94_4 = (hn) ((Object) stackIn_94_4);
                        stackIn_97_5 = this;
                        stackIn_94_6 = (double[]) ((Object) stackIn_94_6);
                        stackIn_94_7 = (double[]) ((Object) stackIn_94_7);



                        stackIn_97_11 = stackIn_96_11;
                        stackIn_97_12 = 1;
                        break L31;
                      }
                    }
                    L32: {
                      ri.a((rk) (this), stackIn_94_1, new cf(stackIn_94_4, (ee) (this), stackIn_94_6, stackIn_94_7, stackIn_94_8, stackIn_94_9, stackIn_94_10 != 0, stackIn_97_11, stackIn_97_12 != 0));
                      stackIn_99_0 = this;

                      if (this.field_mb) {
                        stackIn_100_0 = this;
                        stackIn_100_1 = 3;
                        break L32;
                      } else {
                        stackIn_100_0 = this;
                        stackIn_100_1 = 12;
                        break L32;
                      }
                    }
                    L33: {
                      ((dj) (this)).field_kb = stackIn_100_1;
                      var12 = 4;
                      if (this.field_Eb) {
                        L34: {
                          var13_double = (double)this.field_Z * 0.09817477042468103;
                          var15 = Math.sin(var13_double);
                          var17 = Math.cos(var13_double);
                          stackIn_104_0 = this;

                          stackIn_104_1 = param0 ^ 11878;

                          stackIn_104_2 = null;

                          stackIn_104_3 = null;

                          stackIn_104_4 = this.field_A;

                          stackIn_104_5 = this;

                          stackIn_104_6 = (double[]) (var3);

                          stackIn_104_7 = me.field_J;

                          stackIn_104_8 = -0.04 * var17;

                          stackIn_104_9 = -0.04 * var15;

                          if (0 >= this.field_Pb) {
                            stackIn_105_0 = this;
                            stackIn_105_1 = stackIn_104_1;
                            stackIn_105_2 = null;
                            stackIn_105_3 = null;
                            stackIn_105_4 = (hn) ((Object) stackIn_104_4);
                            stackIn_105_5 = this;
                            stackIn_105_6 = (double[]) ((Object) stackIn_104_6);
                            stackIn_105_7 = (double[]) ((Object) stackIn_104_7);
                            stackIn_105_8 = stackIn_104_8;
                            stackIn_105_9 = stackIn_104_9;
                            stackIn_105_10 = 0;
                            break L34;
                          } else {
                            stackIn_105_0 = this;
                            stackIn_105_1 = stackIn_104_1;
                            stackIn_105_2 = null;
                            stackIn_105_3 = null;
                            stackIn_105_4 = (hn) ((Object) stackIn_104_4);
                            stackIn_105_5 = this;
                            stackIn_105_6 = (double[]) ((Object) stackIn_104_6);
                            stackIn_105_7 = (double[]) ((Object) stackIn_104_7);
                            stackIn_105_8 = stackIn_104_8;
                            stackIn_105_9 = stackIn_104_9;
                            stackIn_105_10 = 1;
                            break L34;
                          }
                        }
                        L35: {
                          stackIn_107_0 = this;

                          stackIn_107_5 = this;

                          stackIn_107_11 = 1;

                          if (-1 <= (this.field_U ^ -1)) {
                            stackIn_108_0 = this;

                            stackIn_105_2 = null;
                            stackIn_105_3 = null;
                            stackIn_105_4 = (hn) ((Object) stackIn_105_4);
                            stackIn_108_5 = this;
                            stackIn_105_6 = (double[]) ((Object) stackIn_105_6);
                            stackIn_105_7 = (double[]) ((Object) stackIn_105_7);



                            stackIn_108_11 = stackIn_107_11;
                            stackIn_108_12 = 0;
                            break L35;
                          } else {
                            stackIn_108_0 = this;

                            stackIn_105_2 = null;
                            stackIn_105_3 = null;
                            stackIn_105_4 = (hn) ((Object) stackIn_105_4);
                            stackIn_108_5 = this;
                            stackIn_105_6 = (double[]) ((Object) stackIn_105_6);
                            stackIn_105_7 = (double[]) ((Object) stackIn_105_7);



                            stackIn_108_11 = stackIn_107_11;
                            stackIn_108_12 = 1;
                            break L35;
                          }
                        }
                        L36: {
                          ri.a((rk) (this), stackIn_105_1, new cf(stackIn_105_4, (ee) (this), stackIn_105_6, stackIn_105_7, stackIn_105_8, stackIn_105_9, stackIn_105_10 != 0, stackIn_108_11 != 0, stackIn_108_12 != 0));
                          stackIn_110_0 = this;

                          stackIn_110_1 = 0;

                          stackIn_110_2 = null;

                          stackIn_110_3 = null;

                          stackIn_110_4 = this.field_A;

                          stackIn_110_5 = this;

                          stackIn_110_6 = (double[]) (var3);

                          stackIn_110_7 = me.field_J;

                          stackIn_110_8 = -0.02 * var17;

                          stackIn_110_9 = var15 * -0.02;

                          if ((this.field_Pb ^ -1) >= -1) {
                            stackIn_111_0 = this;
                            stackIn_111_1 = stackIn_110_1;
                            stackIn_111_2 = null;
                            stackIn_111_3 = null;
                            stackIn_111_4 = (hn) ((Object) stackIn_110_4);
                            stackIn_111_5 = this;
                            stackIn_111_6 = (double[]) ((Object) stackIn_110_6);
                            stackIn_111_7 = (double[]) ((Object) stackIn_110_7);
                            stackIn_111_8 = stackIn_110_8;
                            stackIn_111_9 = stackIn_110_9;
                            stackIn_111_10 = 0;
                            break L36;
                          } else {
                            stackIn_111_0 = this;
                            stackIn_111_1 = stackIn_110_1;
                            stackIn_111_2 = null;
                            stackIn_111_3 = null;
                            stackIn_111_4 = (hn) ((Object) stackIn_110_4);
                            stackIn_111_5 = this;
                            stackIn_111_6 = (double[]) ((Object) stackIn_110_6);
                            stackIn_111_7 = (double[]) ((Object) stackIn_110_7);
                            stackIn_111_8 = stackIn_110_8;
                            stackIn_111_9 = stackIn_110_9;
                            stackIn_111_10 = 1;
                            break L36;
                          }
                        }
                        L37: {
                          stackIn_113_0 = this;

                          stackIn_113_5 = this;

                          stackIn_113_11 = 1;

                          if (this.field_U <= 0) {
                            stackIn_114_0 = this;

                            stackIn_111_2 = null;
                            stackIn_111_3 = null;
                            stackIn_111_4 = (hn) ((Object) stackIn_111_4);
                            stackIn_114_5 = this;
                            stackIn_111_6 = (double[]) ((Object) stackIn_111_6);
                            stackIn_111_7 = (double[]) ((Object) stackIn_111_7);



                            stackIn_114_11 = stackIn_113_11;
                            stackIn_114_12 = 0;
                            break L37;
                          } else {
                            stackIn_114_0 = this;

                            stackIn_111_2 = null;
                            stackIn_111_3 = null;
                            stackIn_111_4 = (hn) ((Object) stackIn_111_4);
                            stackIn_114_5 = this;
                            stackIn_111_6 = (double[]) ((Object) stackIn_111_6);
                            stackIn_111_7 = (double[]) ((Object) stackIn_111_7);



                            stackIn_114_11 = stackIn_113_11;
                            stackIn_114_12 = 1;
                            break L37;
                          }
                        }
                        L38: {
                          ri.a((rk) (this), stackIn_111_1, new cf(stackIn_111_4, (ee) (this), stackIn_111_6, stackIn_111_7, stackIn_111_8, stackIn_111_9, stackIn_111_10 != 0, stackIn_114_11 != 0, stackIn_114_12 != 0));
                          stackIn_116_0 = this;

                          stackIn_116_1 = 0;

                          stackIn_116_2 = null;

                          stackIn_116_3 = null;

                          stackIn_116_4 = this.field_A;

                          stackIn_116_5 = this;

                          stackIn_116_6 = (double[]) (var3);

                          stackIn_116_7 = me.field_J;

                          stackIn_116_8 = 0.02 * var17;

                          stackIn_116_9 = 0.02 * var15;

                          if (-1 <= (this.field_Pb ^ -1)) {
                            stackIn_117_0 = this;
                            stackIn_117_1 = stackIn_116_1;
                            stackIn_117_2 = null;
                            stackIn_117_3 = null;
                            stackIn_117_4 = (hn) ((Object) stackIn_116_4);
                            stackIn_117_5 = this;
                            stackIn_117_6 = (double[]) ((Object) stackIn_116_6);
                            stackIn_117_7 = (double[]) ((Object) stackIn_116_7);
                            stackIn_117_8 = stackIn_116_8;
                            stackIn_117_9 = stackIn_116_9;
                            stackIn_117_10 = 0;
                            break L38;
                          } else {
                            stackIn_117_0 = this;
                            stackIn_117_1 = stackIn_116_1;
                            stackIn_117_2 = null;
                            stackIn_117_3 = null;
                            stackIn_117_4 = (hn) ((Object) stackIn_116_4);
                            stackIn_117_5 = this;
                            stackIn_117_6 = (double[]) ((Object) stackIn_116_6);
                            stackIn_117_7 = (double[]) ((Object) stackIn_116_7);
                            stackIn_117_8 = stackIn_116_8;
                            stackIn_117_9 = stackIn_116_9;
                            stackIn_117_10 = 1;
                            break L38;
                          }
                        }
                        L39: {
                          stackIn_119_0 = this;

                          stackIn_119_5 = this;

                          stackIn_119_11 = 1;

                          if (-1 <= (this.field_U ^ -1)) {
                            stackIn_120_0 = this;

                            stackIn_117_2 = null;
                            stackIn_117_3 = null;
                            stackIn_117_4 = (hn) ((Object) stackIn_117_4);
                            stackIn_120_5 = this;
                            stackIn_117_6 = (double[]) ((Object) stackIn_117_6);
                            stackIn_117_7 = (double[]) ((Object) stackIn_117_7);



                            stackIn_120_11 = stackIn_119_11;
                            stackIn_120_12 = 0;
                            break L39;
                          } else {
                            stackIn_120_0 = this;

                            stackIn_117_2 = null;
                            stackIn_117_3 = null;
                            stackIn_117_4 = (hn) ((Object) stackIn_117_4);
                            stackIn_120_5 = this;
                            stackIn_117_6 = (double[]) ((Object) stackIn_117_6);
                            stackIn_117_7 = (double[]) ((Object) stackIn_117_7);



                            stackIn_120_11 = stackIn_119_11;
                            stackIn_120_12 = 1;
                            break L39;
                          }
                        }
                        L40: {
                          ri.a((rk) (this), stackIn_117_1, new cf(stackIn_117_4, (ee) (this), stackIn_117_6, stackIn_117_7, stackIn_117_8, stackIn_117_9, stackIn_117_10 != 0, stackIn_120_11 != 0, stackIn_120_12 != 0));
                          stackIn_122_0 = this;

                          stackIn_122_1 = 0;

                          stackIn_122_2 = null;

                          stackIn_122_3 = null;

                          stackIn_122_4 = this.field_A;

                          stackIn_122_5 = this;

                          stackIn_122_6 = (double[]) (var3);

                          stackIn_122_7 = me.field_J;

                          stackIn_122_8 = var17 * 0.04;

                          stackIn_122_9 = 0.04 * var15;

                          if (0 >= this.field_Pb) {
                            stackIn_123_0 = this;
                            stackIn_123_1 = stackIn_122_1;
                            stackIn_123_2 = null;
                            stackIn_123_3 = null;
                            stackIn_123_4 = (hn) ((Object) stackIn_122_4);
                            stackIn_123_5 = this;
                            stackIn_123_6 = (double[]) ((Object) stackIn_122_6);
                            stackIn_123_7 = (double[]) ((Object) stackIn_122_7);
                            stackIn_123_8 = stackIn_122_8;
                            stackIn_123_9 = stackIn_122_9;
                            stackIn_123_10 = 0;
                            break L40;
                          } else {
                            stackIn_123_0 = this;
                            stackIn_123_1 = stackIn_122_1;
                            stackIn_123_2 = null;
                            stackIn_123_3 = null;
                            stackIn_123_4 = (hn) ((Object) stackIn_122_4);
                            stackIn_123_5 = this;
                            stackIn_123_6 = (double[]) ((Object) stackIn_122_6);
                            stackIn_123_7 = (double[]) ((Object) stackIn_122_7);
                            stackIn_123_8 = stackIn_122_8;
                            stackIn_123_9 = stackIn_122_9;
                            stackIn_123_10 = 1;
                            break L40;
                          }
                        }
                        L41: {
                          stackIn_125_0 = this;

                          stackIn_125_5 = this;

                          stackIn_125_11 = 1;

                          if (-1 <= (this.field_U ^ -1)) {
                            stackIn_126_0 = this;

                            stackIn_123_2 = null;
                            stackIn_123_3 = null;
                            stackIn_123_4 = (hn) ((Object) stackIn_123_4);
                            stackIn_126_5 = this;
                            stackIn_123_6 = (double[]) ((Object) stackIn_123_6);
                            stackIn_123_7 = (double[]) ((Object) stackIn_123_7);



                            stackIn_126_11 = stackIn_125_11;
                            stackIn_126_12 = 0;
                            break L41;
                          } else {
                            stackIn_126_0 = this;

                            stackIn_123_2 = null;
                            stackIn_123_3 = null;
                            stackIn_123_4 = (hn) ((Object) stackIn_123_4);
                            stackIn_126_5 = this;
                            stackIn_123_6 = (double[]) ((Object) stackIn_123_6);
                            stackIn_123_7 = (double[]) ((Object) stackIn_123_7);



                            stackIn_126_11 = stackIn_125_11;
                            stackIn_126_12 = 1;
                            break L41;
                          }
                        }
                        ri.a((rk) (this), stackIn_123_1, new cf(stackIn_123_4, (ee) (this), stackIn_123_6, stackIn_123_7, stackIn_123_8, stackIn_123_9, stackIn_123_10 != 0, stackIn_126_11 != 0, stackIn_126_12 != 0));
                        this.field_Z = 63 & this.field_Z + this.field_kb;
                        var12 += 4;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    var13_int = 0;
                    L42: while (true) {
                      if (5 <= var13_int) {
                        L43: {
                          this.field_Hb = this.field_Hb - var11;
                          stackIn_140_0 = (int)(24.0 * Math.sqrt((double)var12));

                          stackIn_140_1 = 0;

                          if (-1 <= (this.field_U ^ -1)) {
                            stackIn_141_0 = stackIn_140_0;
                            stackIn_141_1 = stackIn_140_1;
                            stackIn_141_2 = d.field_g;
                            break L43;
                          } else {
                            stackIn_141_0 = stackIn_140_0;
                            stackIn_141_1 = stackIn_140_1;
                            stackIn_141_2 = qj.field_b;
                            break L43;
                          }
                        }
                        da.a(stackIn_141_0, stackIn_141_1, stackIn_141_2, true, (pm) (this));
                        break L29;
                      } else {
                        var14_ref_h = this.field_Nb[var13_int];
                        if (var14_ref_h != null) {
                          L44: {
                            var14_ref_h.field_Z.b(118);
                            var12++;
                            stackIn_133_0 = this;

                            stackIn_133_1 = 0;

                            stackIn_133_2 = null;

                            stackIn_133_3 = null;

                            stackIn_133_4 = this.field_A;

                            stackIn_133_5 = (h) (var14_ref_h);

                            stackIn_133_6 = (double[]) (var3);

                            stackIn_133_7 = og.field_g;

                            stackIn_133_8 = 0.0;

                            stackIn_133_9 = 0.0;

                            if (-1 <= (this.field_Pb ^ -1)) {
                              stackIn_134_0 = this;
                              stackIn_134_1 = stackIn_133_1;
                              stackIn_134_2 = null;
                              stackIn_134_3 = null;
                              stackIn_134_4 = (hn) ((Object) stackIn_133_4);
                              stackIn_134_5 = (h) ((Object) stackIn_133_5);
                              stackIn_134_6 = (double[]) ((Object) stackIn_133_6);
                              stackIn_134_7 = (double[]) ((Object) stackIn_133_7);
                              stackIn_134_8 = stackIn_133_8;
                              stackIn_134_9 = stackIn_133_9;
                              stackIn_134_10 = 0;
                              break L44;
                            } else {
                              stackIn_134_0 = this;
                              stackIn_134_1 = stackIn_133_1;
                              stackIn_134_2 = null;
                              stackIn_134_3 = null;
                              stackIn_134_4 = (hn) ((Object) stackIn_133_4);
                              stackIn_134_5 = (h) ((Object) stackIn_133_5);
                              stackIn_134_6 = (double[]) ((Object) stackIn_133_6);
                              stackIn_134_7 = (double[]) ((Object) stackIn_133_7);
                              stackIn_134_8 = stackIn_133_8;
                              stackIn_134_9 = stackIn_133_9;
                              stackIn_134_10 = 1;
                              break L44;
                            }
                          }
                          L45: {
                            stackIn_136_0 = this;

                            stackIn_136_11 = 0;

                            if (0 >= this.field_U) {
                              stackIn_137_0 = this;

                              stackIn_134_2 = null;
                              stackIn_134_3 = null;
                              stackIn_134_4 = (hn) ((Object) stackIn_134_4);
                              stackIn_134_5 = (h) ((Object) stackIn_134_5);
                              stackIn_134_6 = (double[]) ((Object) stackIn_134_6);
                              stackIn_134_7 = (double[]) ((Object) stackIn_134_7);



                              stackIn_137_11 = stackIn_136_11;
                              stackIn_137_12 = 0;
                              break L45;
                            } else {
                              stackIn_137_0 = this;

                              stackIn_134_2 = null;
                              stackIn_134_3 = null;
                              stackIn_134_4 = (hn) ((Object) stackIn_134_4);
                              stackIn_134_5 = (h) ((Object) stackIn_134_5);
                              stackIn_134_6 = (double[]) ((Object) stackIn_134_6);
                              stackIn_134_7 = (double[]) ((Object) stackIn_134_7);



                              stackIn_137_11 = stackIn_136_11;
                              stackIn_137_12 = 1;
                              break L45;
                            }
                          }
                          ri.a((rk) (this), stackIn_134_1, new cf(stackIn_134_4, stackIn_134_5, stackIn_134_6, stackIn_134_7, stackIn_134_8, stackIn_134_9, stackIn_134_10 != 0, stackIn_137_11 != 0, stackIn_137_12 != 0));
                          var13_int++;
                          continue L42;
                        } else {
                          var13_int++;
                          continue L42;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L46: {
          if (this.field_cb) {
            if (!this.field_A.field_M) {
              if (!this.field_Mb) {
                if (mc.field_e[ql.field_u]) {
                  stackIn_153_0 = 1;
                  break L46;
                } else {
                  stackIn_153_0 = 0;
                  break L46;
                }
              } else {
                stackIn_153_0 = 0;
                break L46;
              }
            } else {
              stackIn_153_0 = 0;
              break L46;
            }
          } else {
            stackIn_153_0 = 0;
            break L46;
          }
        }
        L47: {
          L48: {
            var11 = stackIn_153_0;
            if (var11 == 0) {
              break L48;
            } else {
              if ((this.field_Hb ^ -1) <= -2049) {
                this.field_fb = this.field_fb + 1;
                this.field_Hb = this.field_Hb - 2048;
                if (null != this.field_wb) {
                  break L47;
                } else {
                  this.field_wb = new gk((pm) (this), sf.field_p, 1, true);
                  break L47;
                }
              } else {
                break L48;
              }
            }
          }
          L49: {
            if (var11 != 0) {
              this.field_Mb = true;
              break L49;
            } else {
              break L49;
            }
          }
          L50: {
            L51: {
              if (!this.field_cb) {
                break L51;
              } else {
                if (16 > this.field_fb) {
                  break L51;
                } else {
                  L52: {
                    this.field_A.field_t = true;
                    this.field_A.field_v = true;
                    this.field_Lb.b(118);
                    stackIn_163_0 = this;

                    stackIn_163_1 = 0;

                    stackIn_163_2 = null;

                    stackIn_163_3 = null;

                    stackIn_163_4 = this.field_A;

                    stackIn_163_5 = this;

                    stackIn_163_6 = (double[]) (var3);

                    stackIn_163_7 = 0.015625 * (double)this.field_fb;

                    if (0 >= this.field_Pb) {
                      stackIn_164_0 = this;
                      stackIn_164_1 = stackIn_163_1;
                      stackIn_164_2 = null;
                      stackIn_164_3 = null;
                      stackIn_164_4 = (hn) ((Object) stackIn_163_4);
                      stackIn_164_5 = this;
                      stackIn_164_6 = (double[]) ((Object) stackIn_163_6);
                      stackIn_164_7 = stackIn_163_7;
                      stackIn_164_8 = 0;
                      break L52;
                    } else {
                      stackIn_164_0 = this;
                      stackIn_164_1 = stackIn_163_1;
                      stackIn_164_2 = null;
                      stackIn_164_3 = null;
                      stackIn_164_4 = (hn) ((Object) stackIn_163_4);
                      stackIn_164_5 = this;
                      stackIn_164_6 = (double[]) ((Object) stackIn_163_6);
                      stackIn_164_7 = stackIn_163_7;
                      stackIn_164_8 = 1;
                      break L52;
                    }
                  }
                  ri.a((rk) (this), stackIn_164_1, new wm(stackIn_164_4, (dj) (this), stackIn_164_6, stackIn_164_7, stackIn_164_8 != 0));
                  this.field_fb = 0;
                  break L50;
                }
              }
            }
            if (0 >= this.field_fb) {
              break L50;
            } else {
              this.field_fb = this.field_fb - 1;
              break L50;
            }
          }
          if (null != this.field_wb) {
            var12_ref_Object = cb.field_a;
            synchronized (var12_ref_Object) {
              L53: {
                this.field_wb.field_n.b(true);
                this.field_wb.field_n.c(0);
                break L53;
              }
            }
            this.field_wb = null;
            break L47;
          } else {
            break L47;
          }
        }
        L54: {
          if (this.field_eb) {
            if (!this.field_A.field_M) {
              if (!this.field_Mb) {
                if (mc.field_e[nl.field_b]) {
                  stackIn_187_0 = 1;
                  break L54;
                } else {
                  stackIn_187_0 = 0;
                  break L54;
                }
              } else {
                stackIn_187_0 = 0;
                break L54;
              }
            } else {
              stackIn_187_0 = 0;
              break L54;
            }
          } else {
            stackIn_187_0 = 0;
            break L54;
          }
        }
        L55: {
          L56: {
            var11 = stackIn_187_0;
            if (var11 == 0) {
              break L56;
            } else {
              if (this.field_Hb < 2048) {
                break L56;
              } else {
                this.field_Hb = this.field_Hb - 2048;
                this.field_lb = this.field_lb + 1;
                if (null != this.field_Y) {
                  break L55;
                } else {
                  this.field_Y = new gk((pm) (this), th.field_bb, 1, true);
                  break L55;
                }
              }
            }
          }
          L57: {
            if (var11 != 0) {
              this.field_Mb = true;
              break L57;
            } else {
              break L57;
            }
          }
          L58: {
            L59: {
              if (!this.field_eb) {
                break L59;
              } else {
                if ((this.field_lb ^ -1) > -17) {
                  break L59;
                } else {
                  L60: {
                    this.field_A.field_v = true;
                    this.field_A.field_t = true;
                    this.field_Lb.b(118);
                    stackIn_198_0 = this;

                    stackIn_198_1 = 0;

                    stackIn_198_2 = null;

                    stackIn_198_3 = null;

                    stackIn_198_4 = this.field_A;

                    stackIn_198_5 = this;

                    stackIn_198_6 = (double[]) (var3);

                    stackIn_198_7 = (double)this.field_lb * 0.015625;

                    if (-1 <= (this.field_Pb ^ -1)) {
                      stackIn_199_0 = this;
                      stackIn_199_1 = stackIn_198_1;
                      stackIn_199_2 = null;
                      stackIn_199_3 = null;
                      stackIn_199_4 = (hn) ((Object) stackIn_198_4);
                      stackIn_199_5 = this;
                      stackIn_199_6 = (double[]) ((Object) stackIn_198_6);
                      stackIn_199_7 = stackIn_198_7;
                      stackIn_199_8 = 0;
                      break L60;
                    } else {
                      stackIn_199_0 = this;
                      stackIn_199_1 = stackIn_198_1;
                      stackIn_199_2 = null;
                      stackIn_199_3 = null;
                      stackIn_199_4 = (hn) ((Object) stackIn_198_4);
                      stackIn_199_5 = this;
                      stackIn_199_6 = (double[]) ((Object) stackIn_198_6);
                      stackIn_199_7 = stackIn_198_7;
                      stackIn_199_8 = 1;
                      break L60;
                    }
                  }
                  ri.a((rk) (this), stackIn_199_1, new il(stackIn_199_4, (dj) (this), stackIn_199_6, stackIn_199_7, stackIn_199_8 != 0));
                  this.field_lb = 0;
                  break L58;
                }
              }
            }
            if (-1 <= (this.field_lb ^ -1)) {
              break L58;
            } else {
              this.field_lb = this.field_lb - 1;
              break L58;
            }
          }
          if (null != this.field_Y) {
            var12_ref_Object = cb.field_a;
            synchronized (var12_ref_Object) {
              L61: {
                this.field_Y.field_n.b(true);
                this.field_Y.field_n.c(0);
                break L61;
              }
            }
            this.field_Y = null;
            break L55;
          } else {
            break L55;
          }
        }
        L62: {
          L63: {
            if (!this.field_Sb) {
              break L63;
            } else {
              if (this.field_A.field_M) {
                break L63;
              } else {
                if (this.field_Mb) {
                  break L63;
                } else {
                  if (mc.field_e[ln.field_b]) {
                    if ((this.field_Hb ^ -1) <= -2049) {
                      this.field_A.field_v = true;
                      this.field_A.field_t = true;
                      this.field_Q = 8;
                      break L62;
                    } else {
                      this.field_Q = this.field_Q - 1;
                      this.field_Mb = true;
                      break L62;
                    }
                  } else {
                    break L63;
                  }
                }
              }
            }
          }
          if ((this.field_Q ^ -1) >= -1) {
            break L62;
          } else {
            this.field_Q = this.field_Q - 1;
            break L62;
          }
        }
        L64: {
          if (this.field_Pb <= 0) {
            stackIn_223_0 = null;
            break L64;
          } else {
            stackIn_223_0 = this.a(var41[9], var41[10], var41[11], false);
            break L64;
          }
        }
        L65: {
          var11_ref_pm = stackIn_223_0;
          if (var11_ref_pm == null) {
            var12 = 0;
            L66: while (true) {
              if (this.field_bb.length <= var12) {
                var12 = 0;
                L67: while (true) {
                  if ((var12 ^ -1) <= -6) {
                    break L65;
                  } else {
                    var34 = this.field_Nb[var12];
                    var19 = var34;
                    var19 = var34;
                    var13 = var34;
                    if (var13 != null) {
                      var34.field_T[2] = var41[11];
                      var34.field_T[0] = var41[9];
                      var34.field_T[1] = var41[10];
                      var12++;
                      continue L67;
                    } else {
                      var12++;
                      continue L67;
                    }
                  }
                }
              } else {
                this.field_bb[var12] = var41[9];
                this.field_bb[1 + var12] = var41[10];
                this.field_bb[var12 + 2] = var41[11];
                var12 += 3;
                continue L66;
              }
            }
          } else {
            this.a(this.field_bb, var11_ref_pm, 0.2, this.field_jb, ac.field_c, -115);
            var12 = 0;
            L68: while (true) {
              if (-6 >= (var12 ^ -1)) {
                break L65;
              } else {
                var38 = this.field_Nb[var12];
                var19 = var38;
                var19 = var38;
                if (var38 != null) {
                  this.a(var38.field_T, var11_ref_pm, 0.2, this.field_jb, og.field_g, param0 ^ 11780);
                  var12++;
                  continue L68;
                } else {
                  var12++;
                  continue L68;
                }
              }
            }
          }
        }
        L69: {
          if (this.field_Q <= 0) {
            break L69;
          } else {
            L70: {
              this.field_Lb.b(118);
              this.field_Hb = this.field_Hb - 256 * this.field_Q;
              if (-1 >= (this.field_Hb ^ -1)) {
                break L70;
              } else {
                this.field_Hb = 0;
                this.field_Mb = true;
                break L70;
              }
            }
            var11 = -1610547456 & 32768 * this.field_Q >>> -470250813 | (this.field_Q * 4194559 & 133695480) >>> -79965821;
            var12_double = (double)(this.field_Q / 8);
            var14 = 1.0 * var12_double;
            var16 = var12_double;
            var18 = 0;
            L71: while (true) {
              if (-5 >= (var18 ^ -1)) {
                var35 = 0;
                var18 = var35;
                L72: while (true) {
                  if (var35 >= 5) {
                    break L69;
                  } else {
                    var19 = this.field_Nb[var35];
                    if (var19 != null) {
                      L73: {
                        var19.field_Z.b(param0 ^ 11792);
                        var19.a(false, var41, 0, og.field_g);
                        var19.field_Q.a(ud.field_o, var11, var19.field_T[2], var14, var12_double, dh.field_sb, rn.field_c, var19.field_T[0], false, var19.field_T[1]);
                        if (null == var19.field_Q.field_Q) {
                          break L73;
                        } else {
                          var19.field_Q.field_Q.field_m = this.field_Q * 96 >> 1341575747;
                          break L73;
                        }
                      }
                      this.field_A.field_b.a((rk) (var19.field_Q), (byte) 79);
                      var35++;
                      continue L72;
                    } else {
                      var35++;
                      continue L72;
                    }
                  }
                }
              } else {
                this.a(false, var41, var18 * 3, ac.field_c);
                this.field_Ab[var18].a(ud.field_o, var11, this.field_bb[2 + var18 * 3], var14, var16, dh.field_sb, rn.field_c, this.field_bb[var18 * 3], false, this.field_bb[1 + 3 * var18]);
                this.field_Ab[var18].field_Q.field_m = this.field_Q * 96 >> 676998531;
                this.field_A.field_b.a((rk) (this.field_Ab[var18]), (byte) -64);
                var18++;
                continue L71;
              }
            }
          }
        }
        L74: {
          this.field_Db = this.field_Db * 0.92;
          this.field_db.field_m = 0;
          if (!this.field_rb) {
            break L74;
          } else {
            if (this.field_A.field_M) {
              break L74;
            } else {
              if (this.field_Mb) {
                break L74;
              } else {
                if (!mc.field_e[oc.field_e]) {
                  break L74;
                } else {
                  this.field_Hb = this.field_Hb - 2048;
                  if (0 <= this.field_Hb) {
                    L75: {
                      this.field_db.field_m = 48;
                      var11 = 0;
                      this.field_S.a(12607743, 0, 50.0, 8.0);
                      if (!this.field_S.a((hm[]) null, false, 10.0)) {
                        break L75;
                      } else {
                        this.field_A.field_t = true;
                        var11 += 4;
                        this.field_Lb.b(118);
                        this.field_S.field_Q.field_m = 48;
                        this.field_A.field_F.a((rk) (this.field_S), (byte) 116);
                        break L75;
                      }
                    }
                    var12 = 0;
                    L76: while (true) {
                      if (-6 >= (var12 ^ -1)) {
                        this.field_Db = this.field_Db + (double)var11;
                        break L74;
                      } else {
                        var39 = this.field_Nb[var12];
                        if (var39 != null) {
                          var39.field_X.a(12607743, param0 ^ 11878, 50.0, 8.0);
                          if (var39.field_X.a((hm[]) null, false, 3.0)) {
                            var39.field_X.field_Q.field_m = 32;
                            this.field_A.field_t = true;
                            this.field_A.field_F.a((rk) (var39.field_X), (byte) -95);
                            var39.field_Z.b(118);
                            var11++;
                            var12++;
                            continue L76;
                          } else {
                            var12++;
                            continue L76;
                          }
                        } else {
                          var12++;
                          continue L76;
                        }
                      }
                    }
                  } else {
                    this.field_Mb = true;
                    this.field_Hb = 0;
                    break L74;
                  }
                }
              }
            }
          }
        }
        L77: {
          this.field_V.field_m = (int)(8.0 * Math.sqrt(this.field_Db));
          if (this.field_ob != 0) {
            this.field_ob = this.field_ob - 1;
            break L77;
          } else {
            L78: {
              if ((this.field_ub ^ -1) >= -1) {
                break L78;
              } else {
                if (this.field_A.field_M) {
                  break L78;
                } else {
                  if (mc.field_e[ja.field_d]) {
                    this.field_Lb.b(118);
                    ri.a((rk) (this), 0, new th(this.field_A, (dj) (this)));
                    this.field_ob = 16;
                    this.field_ub = this.field_ub - 1;
                    break L77;
                  } else {
                    break L78;
                  }
                }
              }
            }
            L79: {
              if (0 >= this.field_tb) {
                break L79;
              } else {
                if (this.field_A.field_M) {
                  break L79;
                } else {
                  if (mc.field_e[ib.field_W]) {
                    this.field_Lb.b(118);
                    ri.a((rk) (this), 0, new gm(this.field_A, (dj) (this)));
                    this.field_tb = this.field_tb - 1;
                    this.field_ob = 16;
                    break L77;
                  } else {
                    break L79;
                  }
                }
              }
            }
            L80: {
              if (this.field_zb <= 0) {
                break L80;
              } else {
                if (this.field_A.field_M) {
                  break L80;
                } else {
                  if (mc.field_e[vf.field_l]) {
                    this.field_Lb.b(118);
                    ri.a((rk) (this), 0, new ik(this.field_A, (dj) (this)));
                    this.field_zb = this.field_zb - 1;
                    this.field_ob = 16;
                    break L77;
                  } else {
                    break L80;
                  }
                }
              }
            }
            if (this.field_ab <= 0) {
              break L77;
            } else {
              if (this.field_A.field_M) {
                break L77;
              } else {
                if (!mc.field_e[sb.field_f]) {
                  break L77;
                } else {
                  if (this.field_A.field_P) {
                    break L77;
                  } else {
                    if (0 == this.field_A.field_L) {
                      this.field_Lb.b(118);
                      ri.a((rk) (this), 0, new gi(this.field_A, (dj) (this)));
                      this.field_ob = 16;
                      this.field_A.field_P = true;
                      this.field_ab = this.field_ab - 1;
                      break L77;
                    } else {
                      break L77;
                    }
                  }
                }
              }
            }
          }
        }
        L81: {
          if (0 >= this.field_U) {
            break L81;
          } else {
            this.field_U = this.field_U - 1;
            break L81;
          }
        }
        L82: {
          if (0 >= this.field_Pb) {
            break L82;
          } else {
            this.field_Pb = this.field_Pb - 1;
            break L82;
          }
        }
        L83: {
          if (0 >= this.field_ib) {
            break L83;
          } else {
            this.field_ib = this.field_ib - 1;
            if (-1 != (this.field_ib ^ -1)) {
              break L83;
            } else {
              this.field_Bb.field_l = false;
              var11 = 0;
              L84: while (true) {
                if (-6 >= (var11 ^ -1)) {
                  break L83;
                } else {
                  if (null != this.field_Nb[var11]) {
                    this.field_Nb[var11].field_ab.field_l = false;
                    var11++;
                    continue L84;
                  } else {
                    var11++;
                    continue L84;
                  }
                }
              }
            }
          }
        }
        L85: {
          if (this.field_Gb > 0) {
            this.field_Gb = this.field_Gb - 1;
            break L85;
          } else {
            break L85;
          }
        }
        L86: {
          if (this.field_Gb <= 0) {
            if (-1 > (this.field_Kb ^ -1)) {
              this.field_Kb = this.field_Kb - 16;
              break L86;
            } else {
              break L86;
            }
          } else {
            if (256 > this.field_Kb) {
              this.field_Kb = this.field_Kb + 16;
              break L86;
            } else {
              break L86;
            }
          }
        }
        L87: {
          if (128 <= this.field_Kb) {
            break L87;
          } else {
            this.field_Lb.b(param0 ^ 11792);
            var11 = 0;
            L88: while (true) {
              if (var11 >= 5) {
                break L87;
              } else {
                stackIn_317_0 = null;
                stackIn_317_1 = this.field_Nb[var11];
                if (stackIn_317_0 != stackIn_317_1) {
                  this.field_Nb[var11].field_Z.b(118);
                  var11++;
                  continue L88;
                } else {
                  var11++;
                  continue L88;
                }
              }
            }
          }
        }
        L89: {
          if ((this.field_R ^ -1) >= -1) {
            break L89;
          } else {
            this.field_R = this.field_R - 1;
            break L89;
          }
        }
    }

    final boolean i(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 8) {
            break L0;
          } else {
            this.a(-87, -78);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_A.field_K == null) {
              break L2;
            } else {
              if (this.field_A.field_x.field_r[-1 + this.field_A.field_x.field_a] < this.field_D) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void g(int param0) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        this.field_A.field_m.m(10959);
        this.field_A.field_m.field_D = this.field_A.field_m.field_O;
        this.field_A.field_m.field_E = this.field_A.field_m.field_T;
        this.field_A.field_m.field_t = this.field_A.field_m.field_L;
        this.field_A.field_m.field_X = new da(this.field_A.field_m.field_W);
        ka var13 = this.a((byte) 107, ri.field_b, 2.0);
        var13.field_M.field_w = this.field_C * 2.0;
        this.m(-1);
        this.h((byte) 94);
        this.d(false);
        if (!(this.field_A.field_L <= 0)) {
            var3 = this.field_A.field_A * this.field_A.field_A;
            var5 = this.field_E - this.field_A.field_s;
            var7 = this.field_t - this.field_A.field_r;
            var9 = -this.field_A.field_E + this.field_D;
            var11 = var7 * var7 + var5 * var5 + var9 * var9;
            if (var11 <= var3) {
                di.a(-30867, 245, 10);
            }
        }
        if (param0 != 26402) {
            this.field_Sb = false;
        }
    }

    final void a(double param0, byte param1, double param2, double param3) {
        super.a(param0, param1, param2, param3);
        this.field_Lb.a(param0, param3, param2, 47);
    }

    final void a(mn param0, byte param1) {
        double[] var3 = null;
        try {
            if (!(this.field_fb < 16)) {
                var3 = new double[12];
                this.field_jb.a((byte) 47, var3);
                ak.a((double)this.field_fb * 0.015625, var3, (dj) (this), 4825, this.field_qb, param0);
            }
            if (!(-17 < (this.field_lb ^ -1))) {
                var3 = new double[12];
                this.field_jb.a((byte) 34, var3);
                rf.a(param0, 0.015625 * (double)this.field_lb, this.field_pb, (dj) (this), var3, false);
            }
            this.field_Bb.a(-96, param0);
            int var3_int = 81 % ((param1 - -2) / 62);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dj.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean l(int param0) {
        int var3 = 0;
        int var4 = Confined.field_J ? 1 : 0;
        int var2 = 29 / ((60 - param0) / 61);
        for (var3 = 0; -6 < (var3 ^ -1); var3++) {
            if (null == this.field_Nb[var3]) {
                return true;
            }
        }
        return false;
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
            pm var6 = (pm) null;
            this.a((pm) null, 126);
        }
        if (!this.field_A.field_y && !this.field_A.field_i) {
            if (!(this.field_Qb != 0)) {
                return this.field_Bb.a(0, true, param1, param2);
            }
        }
        return 0.0;
    }

    final void c(boolean param0) {
        int fieldTemp$0 = 0;
        int var2;
        double var3;
        double var5;
        double var7;
        int var9;
        int var10;
        L0: {
          L1: {
            var9 = Confined.field_J ? 1 : 0;
            this.field_X = true;
            if (this.field_A.field_y) {
              break L1;
            } else {
              if (null != this.field_A.field_K) {
                break L1;
              } else {
                L2: {
                  if (-1 <= (this.field_yb ^ -1)) {
                    break L2;
                  } else {
                    fieldTemp$0 = this.field_xb - 1;
                    this.field_xb = this.field_xb - 1;
                    if (fieldTemp$0 <= 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if ((this.field_yb ^ -1) < -1) {
                  var2 = 0;
                  L3: while (true) {
                    L4: {
                      if (this.field_A.field_x.field_a - 2 <= var2) {
                        break L4;
                      } else {
                        if (this.field_A.field_x.field_r[1 + var2] > this.field_D) {
                          break L4;
                        } else {
                          var2++;
                          continue L3;
                        }
                      }
                    }
                    this.field_A.field_x.b(3, var2, this.field_D);
                    var3 = 0.5 * (-Math.cos(0.026399938265460447 * (double)this.field_xb) + 1.0);
                    var5 = 0.5 * (1.0 - Math.cos(0.026399938265460447 * (double)(-1 + this.field_xb)));
                    var7 = var5 / var3;
                    this.field_E = this.field_A.field_x.field_B + (this.field_E - this.field_A.field_x.field_B) * var7;
                    this.field_t = this.field_A.field_x.field_G + var7 * (-this.field_A.field_x.field_G + this.field_t);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          L5: {
            if (this.field_Bb.field_b <= 8) {
              break L5;
            } else {
              this.field_Bb.field_d = 65536;
              break L5;
            }
          }
          this.field_Jb.a(0);
          this.field_G = 0.0;
          this.field_K = 0.0;
          this.field_L = 0.0;
          this.field_z = false;
          this.field_Bb.field_i.d(209);
          this.field_Bb.field_g.d(209);
          var10 = 0;
          var2 = var10;
          L6: while (true) {
            if (4 <= var10) {
              this.field_S.field_Q.d(209);
              this.field_V.d(209);
              this.field_db.d(209);
              this.field_Cb.d(209);
              this.field_yb = this.field_yb - 1;
              rc.field_i = rc.field_i + 1;
              this.field_Qb = 400;
              this.field_A.field_g.a((rk) (this), -1);
              break L0;
            } else {
              this.field_Ab[var10].field_Q.d(209);
              var10++;
              continue L6;
            }
          }
        }
        L7: {
          if (!param0) {
            break L7;
          } else {
            this.a(-73, false, 0.5439863261272376);
            break L7;
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return false;
        }
        return true;
    }

    final void a(cl param0, byte param1) {
        try {
            int var3_int = -66 / ((param1 - -35) / 60);
            param0.a((dj) (this), (byte) 80);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void d(boolean param0) {
        this.field_X = true;
        if (param0) {
            this.field_Pb = 71;
        }
        if ((this.field_yb ^ -1) < -1) {
            this.field_xb = 120;
        } else {
            hc.field_u = null;
            we.field_a = 0;
            of.field_a = true;
            sg.f((byte) 99);
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 72) {
              L1: {
                if (param0.f(-96)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("dj.WA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    private final void h(byte param0) {
        this.field_Bb.b(-790952351);
        this.field_Z = 0;
        this.field_lb = 0;
        this.field_fb = 0;
        this.field_Mb = false;
        this.field_Q = 0;
        if (param0 < 44) {
            return;
        }
        this.field_kb = 0;
        this.field_ob = 0;
        this.field_Hb = 65536;
    }

    final void a(boolean param0, ee param1) {
        if (!param0) {
            return;
        }
        try {
            if (!(!(param1 instanceof wc))) {
                this.field_A.field_B.field_X = true;
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        this.field_X = true;
        super.a(param0, param1, param2, param3, param4, param5, param6);
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
            this.f(10);
            return true;
        }
        return true;
    }

    private final void m(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = Confined.field_J ? 1 : 0;
          var2 = 0;
          if (this.field_mb) {
            var2++;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!this.field_Eb) {
            break L1;
          } else {
            var2++;
            break L1;
          }
        }
        L2: {
          if (!this.field_Sb) {
            break L2;
          } else {
            var2++;
            break L2;
          }
        }
        L3: {
          if (!this.field_cb) {
            break L3;
          } else {
            var2++;
            break L3;
          }
        }
        L4: {
          if (this.field_eb) {
            var2++;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (this.field_rb) {
            var2++;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var2 = var2 + (this.field_ub + 3 >> -1394289502);
          var2 = var2 + (3 + this.field_tb >> 910997186);
          var2 = var2 + (3 + this.field_zb >> -439798910);
          var2 = var2 + this.field_ab;
          var2 = var2 + (this.field_Bb.field_b + -8);
          var3 = 3;
          if (!this.field_mb) {
            break L6;
          } else {
            incrementValue$0 = var2;
            var2--;
            if ((double)var3 > Math.random() * (double)incrementValue$0) {
              this.field_mb = false;
              var3--;
              ri.a((rk) (this), param0 + 1, new cl(this.field_A, (dj) (this), 0));
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (!this.field_Eb) {
            break L7;
          } else {
            incrementValue$1 = var2;
            var2--;
            if ((double)var3 > Math.random() * (double)incrementValue$1) {
              this.field_Eb = false;
              var3--;
              ri.a((rk) (this), param0 + 1, new cl(this.field_A, (dj) (this), 1));
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          if (!this.field_Sb) {
            if (!this.field_cb) {
              break L8;
            } else {
              incrementValue$2 = var2;
              var2--;
              if ((double)incrementValue$2 * Math.random() >= (double)var3) {
                break L8;
              } else {
                var3--;
                this.field_cb = false;
                ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 3));
                break L8;
              }
            }
          } else {
            if (!this.field_cb) {
              break L8;
            } else {
              incrementValue$3 = var2;
              var2--;
              if ((double)incrementValue$3 * Math.random() >= (double)var3) {
                break L8;
              } else {
                var3--;
                this.field_cb = false;
                ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 3));
                break L8;
              }
            }
          }
        }
        L9: {
          if (!this.field_eb) {
            break L9;
          } else {
            incrementValue$4 = var2;
            var2--;
            if ((double)incrementValue$4 * Math.random() >= (double)var3) {
              break L9;
            } else {
              this.field_eb = false;
              var3--;
              ri.a((rk) (this), param0 + 1, new cl(this.field_A, (dj) (this), 5));
              break L9;
            }
          }
        }
        L10: {
          if (!this.field_rb) {
            break L10;
          } else {
            incrementValue$5 = var2;
            var2--;
            if ((double)var3 > (double)incrementValue$5 * Math.random()) {
              var3--;
              this.field_rb = false;
              ri.a((rk) (this), param0 ^ -1, new cl(this.field_A, (dj) (this), 4));
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if ((this.field_U ^ -1) >= -1) {
            break L11;
          } else {
            this.field_U = 0;
            ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 8));
            break L11;
          }
        }
        L12: {
          if (0 < this.field_Pb) {
            this.field_Pb = 0;
            ri.a((rk) (this), param0 + 1, new cl(this.field_A, (dj) (this), 7));
            break L12;
          } else {
            break L12;
          }
        }
        var4 = this.field_ub;
        L13: while (true) {
          if ((var4 ^ -1) >= -1) {
            var4 = this.field_tb;
            L14: while (true) {
              if (0 >= var4) {
                var4 = this.field_zb;
                L15: while (true) {
                  if (0 >= var4) {
                    var4 = this.field_ab;
                    L16: while (true) {
                      if (var4 <= 0) {
                        var4 = this.field_Bb.field_b;
                        L17: while (true) {
                          if ((var4 ^ -1) >= -9) {
                            L18: {
                              if (-9 == (this.field_Bb.field_b ^ -1)) {
                                this.field_Bb.field_d = 0;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (this.field_ib > 0) {
                                this.field_ib = 0;
                                this.field_Bb.field_l = false;
                                var4 = 0;
                                L20: while (true) {
                                  if (-6 >= (var4 ^ -1)) {
                                    ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 15));
                                    break L19;
                                  } else {
                                    if (this.field_Nb[var4] != null) {
                                      this.field_Nb[var4].field_ab.field_l = false;
                                      var4++;
                                      continue L20;
                                    } else {
                                      var4++;
                                      continue L20;
                                    }
                                  }
                                }
                              } else {
                                break L19;
                              }
                            }
                            L21: {
                              if ((this.field_Gb ^ -1) >= -1) {
                                break L21;
                              } else {
                                this.field_Gb = 0;
                                this.field_Kb = 0;
                                ri.a((rk) (this), param0 ^ -1, new cl(this.field_A, (dj) (this), 16));
                                break L21;
                              }
                            }
                            L22: {
                              if (param0 <= (this.field_R ^ -1)) {
                                break L22;
                              } else {
                                this.field_R = 0;
                                ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 9));
                                break L22;
                              }
                            }
                            return;
                          } else {
                            incrementValue$6 = var2;
                            var2--;
                            if ((double)var3 > (double)incrementValue$6 * Math.random()) {
                              this.field_Bb.field_b = this.field_Bb.field_b - 1;
                              var3--;
                              ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 14));
                              var4--;
                              continue L17;
                            } else {
                              var4--;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        incrementValue$7 = var2;
                        var2--;
                        if (Math.random() * (double)incrementValue$7 < (double)var3) {
                          this.field_ab = this.field_ab - 1;
                          var3--;
                          ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 13));
                          var4--;
                          continue L16;
                        } else {
                          var4--;
                          continue L16;
                        }
                      }
                    }
                  } else {
                    incrementValue$8 = var2;
                    var2--;
                    if ((double)var3 > Math.random() * (double)incrementValue$8) {
                      L23: {
                        this.field_zb = this.field_zb - 4;
                        var3--;
                        if (0 <= this.field_zb) {
                          break L23;
                        } else {
                          this.field_zb = 0;
                          break L23;
                        }
                      }
                      ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 12));
                      var4 -= 4;
                      continue L15;
                    } else {
                      var4 -= 4;
                      continue L15;
                    }
                  }
                }
              } else {
                incrementValue$9 = var2;
                var2--;
                if ((double)var3 > (double)incrementValue$9 * Math.random()) {
                  L24: {
                    var3--;
                    this.field_tb = this.field_tb - 4;
                    if ((this.field_tb ^ -1) > -1) {
                      this.field_tb = 0;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  ri.a((rk) (this), param0 ^ -1, new cl(this.field_A, (dj) (this), 11));
                  var4 -= 4;
                  continue L14;
                } else {
                  var4 -= 4;
                  continue L14;
                }
              }
            }
          } else {
            incrementValue$10 = var2;
            var2--;
            if (Math.random() * (double)incrementValue$10 < (double)var3) {
              L25: {
                this.field_ub = this.field_ub - 4;
                var3--;
                if (-1 >= (this.field_ub ^ -1)) {
                  break L25;
                } else {
                  this.field_ub = 0;
                  break L25;
                }
              }
              ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 10));
              var4 -= 4;
              continue L13;
            } else {
              var4 -= 4;
              continue L13;
            }
          }
        }
    }

    final double[] e(int param0) {
        if (param0 != 3008) {
            return (double[]) null;
        }
        return this.field_Lb.a(16777215);
    }

    final void a(pm param0, int param1) {
        try {
            if (param1 > -81) {
                mn var4 = (mn) null;
                this.a((mn) null, (byte) 65);
            }
            param0.a((dj) (this), (byte) 80);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_Gb = 61;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1.f(-91)) {
                  break L3;
                } else {
                  if (this.field_Kb >= 128) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("dj.CB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double[] var7 = null;
        int var7_int = 0;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        mn var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        double[] var19 = null;
        double[] var20 = null;
        double[] var23 = null;
        try {
          L0: {
            L1: {
              if (16 > this.field_fb) {
                break L1;
              } else {
                var19 = new double[12];
                var16 = var19;
                var7 = var16;
                this.field_jb.a((byte) 37, var19);
                qg.a(param1, this.field_fb, var7, (double)this.field_fb * 0.015625, param3, (dj) (this), 64);
                break L1;
              }
            }
            L2: {
              if ((this.field_lb ^ -1) > -17) {
                break L2;
              } else {
                var20 = new double[12];
                var17 = var20;
                var7 = var17;
                this.field_jb.a((byte) 114, var20);
                se.a(param3, false, var7, true, 0.015625 * (double)this.field_lb, param1, (dj) (this));
                break L2;
              }
            }
            L3: {
              var7_int = md.a(-123) ? 1 : 0;
              if (!this.field_N) {
                break L3;
              } else {
                if (var7_int == 0) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var7_int != 0) {
                this.field_Bb.a(-96);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == this.field_A.field_a) {
                break L5;
              } else {
                if (var7_int != 0) {
                  var8 = this.field_A.field_a.field_E;
                  var10 = this.field_A.field_a.field_t;
                  var12 = this.field_A.field_a.field_D;
                  var23 = new double[12];
                  this.field_jb.a((byte) 90, var23);
                  this.field_A.field_a.field_t = this.field_t + this.field_C * var23[10] * 2.0;
                  this.field_A.field_a.field_D = (this.field_D + 2.0 * (this.field_C * var23[11])) * 0.9 + var12 * 0.1;
                  this.field_A.field_a.field_E = this.field_E + 2.0 * (this.field_C * var23[9]);
                  this.field_A.field_a.a(param0, param1, -33, param3, param4);
                  this.field_A.field_a.field_D = var12;
                  this.field_A.field_a.field_t = var10;
                  this.field_A.field_a.field_E = var8;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if ((4 & this.field_Qb) != 0) {
                break L6;
              } else {
                this.a(512, true, param1, (byte) 44, fc.field_d, this.field_jb, param3, param4, param0, this.field_Kb);
                break L6;
              }
            }
            L7: {
              if (var7_int != 0) {
                break L7;
              } else {
                this.field_Bb.a(param3, param1, (byte) 125);
                break L7;
              }
            }
            L8: {
              if (param2 < -5) {
                break L8;
              } else {
                var15 = (mn) null;
                this.a((mn) null, (byte) -40);
                break L8;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7_ref);

            stackIn_24_1 = new StringBuilder().append("dj.QA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_W = "Power-up attractor";
        field_Ib = "Shield";
    }
}
