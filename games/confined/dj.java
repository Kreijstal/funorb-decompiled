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
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_47_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        h var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            if (param0 <= -84) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= 5) {
                      break L3;
                    } else {
                      stackIn_21_0 = var2_int;

                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_21_0 != 0) {
                            break L4;
                          } else {
                            if (this.field_Nb[var4] == null) {
                              var5 = new h(this.field_A, (dj) (this), var4);
                              ri.a((rk) (this), 0, var5);
                              this.field_Nb[var4] = var5;
                              var2_int = 1;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (null == this.field_Nb[var4]) {
                            break L5;
                          } else {
                            var3++;
                            break L5;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_21_0 = var2_int;
                  break L2;
                }
                L6: {
                  if (stackIn_21_0 == 0) {
                    break L6;
                  } else {
                    if (var3 != 5) {
                      break L6;
                    } else {
                      L7: {
                        var4 = this.field_A.field_J.field_o;
                        if (-1 <= (this.field_A.field_x.field_t ^ -1)) {
                          break L7;
                        } else {
                          if (this.field_A.field_B.field_D >= this.field_A.field_x.field_r[this.field_A.field_x.field_t]) {
                            break L7;
                          } else {
                            var4--;
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (var4 > 8) {
                          break L8;
                        } else {
                          di.a(-30867, 246, 9);
                          if (var6 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (12 >= var4) {
                          break L9;
                        } else {
                          if (-17 <= (var4 ^ -1)) {
                            di.a(-30867, 248, 7);
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      di.a(-30867, 247, 8);
                      break L6;
                    }
                  }
                }
                stackIn_47_0 = var2_int;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_47_0 != 0;
        }
    }

    dj(hn param0) {
        super(param0, 0.0, 0.0, 5.0, 0.3, 0.1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
          L0: {
            this.field_db = new gk((pm) (this), se.field_a);
            this.field_db.field_m = 0;
            this.field_V = new gk((pm) (this), nm.field_F);
            this.field_V.field_m = 0;
            this.field_Cb = new gk((pm) (this), di.field_a);
            this.field_Cb.field_m = 12;
            this.field_Bb.field_d = 0;
            this.field_L = 0.0;
            this.field_Lb.b(118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("dj.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != -1) {
            return;
        }
        try {
            field_W = null;
            field_Ib = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dj.J(" + param0 + ')');
        }
    }

    final static Boolean i(byte param0) {
        Boolean var1 = null;
        RuntimeException var1_ref = null;
        Boolean stackIn_2_0 = null;
        Boolean stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var1 = ca.field_o;
            ca.field_o = null;
            if (param0 >= 106) {
              stackIn_4_0 = (Boolean) (var1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (Boolean) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "dj.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1) {
        Object stackIn_148_0;
        Object stackIn_148_5;
        Object stackIn_150_0;
        int stackIn_150_1;
        cf stackIn_150_2;
        cf stackIn_150_3;
        hn stackIn_150_4;
        Object stackIn_150_5;
        double[] stackIn_150_6;
        double[] stackIn_150_7;
        double stackIn_150_8;
        double stackIn_150_9;
        Object stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        cf stackIn_151_2 = null;
        cf stackIn_151_3 = null;
        hn stackIn_151_4 = null;
        Object stackIn_151_5 = null;
        double[] stackIn_151_6 = null;
        double[] stackIn_151_7 = null;
        double stackIn_151_8 = 0.0;
        double stackIn_151_9 = 0.0;
        int stackIn_151_10 = 0;
        Object stackIn_153_0;
        Object stackIn_153_5;
        boolean stackIn_153_11;
        Object stackIn_154_0 = null;
        Object stackIn_154_5 = null;
        boolean stackIn_154_11 = false;
        int stackIn_154_12 = 0;
        Object stackIn_156_0 = null;
        Object stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        Object stackIn_163_0;
        int stackIn_163_1;
        cf stackIn_163_2;
        cf stackIn_163_3;
        hn stackIn_163_4;
        Object stackIn_163_5;
        double[] stackIn_163_6;
        double[] stackIn_163_7;
        double stackIn_163_8;
        double stackIn_163_9;
        Object stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        cf stackIn_164_2 = null;
        cf stackIn_164_3 = null;
        hn stackIn_164_4 = null;
        Object stackIn_164_5 = null;
        double[] stackIn_164_6 = null;
        double[] stackIn_164_7 = null;
        double stackIn_164_8 = 0.0;
        double stackIn_164_9 = 0.0;
        int stackIn_164_10 = 0;
        Object stackIn_166_0;
        Object stackIn_166_5;
        int stackIn_166_11;
        Object stackIn_167_0 = null;
        Object stackIn_167_5 = null;
        int stackIn_167_11 = 0;
        int stackIn_167_12 = 0;
        Object stackIn_169_0;
        int stackIn_169_1;
        cf stackIn_169_2;
        cf stackIn_169_3;
        hn stackIn_169_4;
        Object stackIn_169_5;
        double[] stackIn_169_6;
        double[] stackIn_169_7;
        double stackIn_169_8;
        double stackIn_169_9;
        Object stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        cf stackIn_170_2 = null;
        cf stackIn_170_3 = null;
        hn stackIn_170_4 = null;
        Object stackIn_170_5 = null;
        double[] stackIn_170_6 = null;
        double[] stackIn_170_7 = null;
        double stackIn_170_8 = 0.0;
        double stackIn_170_9 = 0.0;
        int stackIn_170_10 = 0;
        Object stackIn_172_0;
        Object stackIn_172_5;
        int stackIn_172_11;
        Object stackIn_173_0 = null;
        Object stackIn_173_5 = null;
        int stackIn_173_11 = 0;
        int stackIn_173_12 = 0;
        Object stackIn_175_0;
        int stackIn_175_1;
        cf stackIn_175_2;
        cf stackIn_175_3;
        hn stackIn_175_4;
        Object stackIn_175_5;
        double[] stackIn_175_6;
        double[] stackIn_175_7;
        double stackIn_175_8;
        double stackIn_175_9;
        Object stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        cf stackIn_176_2 = null;
        cf stackIn_176_3 = null;
        hn stackIn_176_4 = null;
        Object stackIn_176_5 = null;
        double[] stackIn_176_6 = null;
        double[] stackIn_176_7 = null;
        double stackIn_176_8 = 0.0;
        double stackIn_176_9 = 0.0;
        int stackIn_176_10 = 0;
        Object stackIn_178_0;
        Object stackIn_178_5;
        int stackIn_178_11;
        Object stackIn_179_0 = null;
        Object stackIn_179_5 = null;
        int stackIn_179_11 = 0;
        int stackIn_179_12 = 0;
        Object stackIn_181_0;
        int stackIn_181_1;
        cf stackIn_181_2;
        cf stackIn_181_3;
        hn stackIn_181_4;
        Object stackIn_181_5;
        double[] stackIn_181_6;
        double[] stackIn_181_7;
        double stackIn_181_8;
        double stackIn_181_9;
        Object stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        cf stackIn_182_2 = null;
        cf stackIn_182_3 = null;
        hn stackIn_182_4 = null;
        Object stackIn_182_5 = null;
        double[] stackIn_182_6 = null;
        double[] stackIn_182_7 = null;
        double stackIn_182_8 = 0.0;
        double stackIn_182_9 = 0.0;
        int stackIn_182_10 = 0;
        Object stackIn_184_0;
        Object stackIn_184_5;
        int stackIn_184_11;
        Object stackIn_185_0;
        Object stackIn_185_5;
        int stackIn_185_11;
        int stackIn_185_12;
        h stackIn_189_0 = null;
        Object stackIn_196_0;
        int stackIn_196_1;
        cf stackIn_196_2;
        cf stackIn_196_3;
        hn stackIn_196_4;
        h stackIn_196_5;
        double[] stackIn_196_6;
        double[] stackIn_196_7;
        double stackIn_196_8;
        double stackIn_196_9;
        Object stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        cf stackIn_197_2 = null;
        cf stackIn_197_3 = null;
        hn stackIn_197_4 = null;
        h stackIn_197_5 = null;
        double[] stackIn_197_6 = null;
        double[] stackIn_197_7 = null;
        double stackIn_197_8 = 0.0;
        double stackIn_197_9 = 0.0;
        int stackIn_197_10 = 0;
        Object stackIn_199_0;
        int stackIn_199_11;
        Object stackIn_200_0;
        int stackIn_200_11;
        int stackIn_200_12;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_206_0 = 0;
        int stackIn_206_1 = 0;
        bi stackIn_206_2 = null;
        int stackIn_222_0 = 0;
        Object stackIn_239_0;
        Object stackIn_239_5;
        Object stackIn_241_0;
        int stackIn_241_1;
        wm stackIn_241_2;
        wm stackIn_241_3;
        hn stackIn_241_4;
        Object stackIn_241_5;
        double[] stackIn_241_6;
        double stackIn_241_7;
        Object stackIn_242_0 = null;
        int stackIn_242_1 = 0;
        wm stackIn_242_2 = null;
        wm stackIn_242_3 = null;
        hn stackIn_242_4 = null;
        Object stackIn_242_5 = null;
        double[] stackIn_242_6 = null;
        double stackIn_242_7 = 0.0;
        int stackIn_242_8 = 0;
        int stackIn_273_0 = 0;
        Object stackIn_296_0;
        Object stackIn_296_5;
        Object stackIn_298_0;
        int stackIn_298_1;
        il stackIn_298_2;
        il stackIn_298_3;
        hn stackIn_298_4;
        Object stackIn_298_5;
        double[] stackIn_298_6;
        double stackIn_298_7;
        Object stackIn_299_0 = null;
        int stackIn_299_1 = 0;
        il stackIn_299_2 = null;
        il stackIn_299_3 = null;
        hn stackIn_299_4 = null;
        Object stackIn_299_5 = null;
        double[] stackIn_299_6 = null;
        double stackIn_299_7 = 0.0;
        int stackIn_299_8 = 0;
        Object stackIn_340_0 = null;
        Object stackIn_524_0 = null;
        h stackIn_524_1 = null;
        h stackIn_527_0 = null;
        Throwable caughtException = null;
        Throwable decompiledCaughtException = null;
        h stackOut_188_0;
        double[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
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
        var32 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((this.field_Qb ^ -1) >= -1) {
                break L1;
              } else {
                this.field_Qb = this.field_Qb - 1;
                break L1;
              }
            }
            L2: {
              this.field_Bb.a(this.field_Lb, 3);
              this.field_Hb = this.field_Hb + 1024;
              if (this.field_Hb > 65536) {
                this.field_Hb = 65536;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((this.field_kb ^ -1) < -1) {
                this.field_kb = this.field_kb - 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_Hb < 32768) {
                break L4;
              } else {
                this.field_Mb = false;
                break L4;
              }
            }
            L5: {
              var3 = new double[12];
              this.field_jb.a((byte) 68, var3);
              var4 = 0;
              if (!mc.field_e[96]) {
                break L5;
              } else {
                var4--;
                break L5;
              }
            }
            L6: {
              var5 = 0;
              if (!mc.field_e[98]) {
                break L6;
              } else {
                var5--;
                break L6;
              }
            }
            L7: {
              if (mc.field_e[97]) {
                var4++;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (mc.field_e[99]) {
                var5++;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (!mk.field_l) {
                break L9;
              } else {
                var5 = -var5;
                break L9;
              }
            }
            L10: {
              var6 = (double)var4;
              var8 = (double)var5;
              if (this.field_A.field_M) {
                L11: {
                  L12: {
                    if (this.field_A.field_y) {
                      break L12;
                    } else {
                      if (null != this.field_A.field_K) {
                        break L12;
                      } else {
                        if (0 != (var5 | var4)) {
                          break L11;
                        } else {
                          if (rh.field_X != 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (-3 >= (this.field_A.field_x.field_a ^ -1)) {
                      break L13;
                    } else {
                      var8 = 0.0;
                      var6 = 0.0;
                      if (var32 == 0) {
                        break L10;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    this.field_A.field_x.b(3, param1, this.field_D + 2.0);
                    var10_double = -this.field_A.field_x.field_B + this.field_E;
                    var12_double = this.field_t - this.field_A.field_x.field_G;
                    var14 = Math.sqrt(-(var3[5] * var3[5]) + 1.0);
                    var16 = var3[3] / var14;
                    var18_double = var3[4] / var14;
                    var20 = Math.sqrt(1.0 - var3[8] * var3[8]);
                    var22 = var3[6] / var20;
                    var24 = var3[7] / var20;
                    var26 = var12_double * var18_double + var10_double * var16;
                    var28 = var12_double * var24 + var10_double * var22;
                    var6 = -var26;
                    var8 = -var28;
                    if (-1.0 <= var6) {
                      break L14;
                    } else {
                      var6 = -1.0;
                      break L14;
                    }
                  }
                  L15: {
                    if (var6 <= 1.0) {
                      break L15;
                    } else {
                      var6 = 1.0;
                      break L15;
                    }
                  }
                  L16: {
                    if (var8 < -1.0) {
                      var8 = -1.0;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var8 > 1.0) {
                      var8 = 1.0;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  if (var32 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
                this.field_A.field_M = false;
                break L10;
              } else {
                break L10;
              }
            }
            L18: {
              if (!this.field_A.field_M) {
                L19: {
                  if (0 == rh.field_X) {
                    break L19;
                  } else {
                    L20: {
                      if (!this.field_vb) {
                        break L20;
                      } else {
                        this.field_Fb = true;
                        if (var32 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    this.field_vb = true;
                    break L19;
                  }
                }
                L21: {
                  L22: {
                    if (0 != var4) {
                      break L22;
                    } else {
                      if ((var5 ^ -1) != -1) {
                        break L22;
                      } else {
                        break L21;
                      }
                    }
                  }
                  this.field_vb = false;
                  break L21;
                }
                if (!this.field_vb) {
                  break L18;
                } else {
                  L23: {
                    if (-1 != ld.field_l) {
                      break L23;
                    } else {
                      if (b.field_f != 0) {
                        break L23;
                      } else {
                        break L18;
                      }
                    }
                  }
                  L24: {
                    L25: {
                      var10_double = 320.0;
                      var12_double = 188.0;
                      if (qc.field_n) {
                        break L25;
                      } else {
                        L26: {
                          var14 = -this.field_A.field_m.field_T + this.field_E;
                          var16 = -this.field_A.field_m.field_L + this.field_t;
                          var18_double = this.field_D - this.field_A.field_m.field_O;
                          var20 = this.field_A.field_m.field_M * var18_double + (this.field_A.field_m.field_R * var14 + this.field_A.field_m.field_ab * var16);
                          var22 = var16 * this.field_A.field_m.field_U + this.field_A.field_m.field_V * var14 + this.field_A.field_m.field_F * var18_double;
                          var24 = this.field_A.field_m.field_P * var14 + this.field_A.field_m.field_H * var16 + this.field_A.field_m.field_N * var18_double;
                          if (var24 < 0.01) {
                            break L26;
                          } else {
                            var10_double = 320.0 + 640.0 * (var20 / var24);
                            var12_double = 188.0 + 640.0 * (var22 / var24);
                            break L26;
                          }
                        }
                        if (var32 == 0) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    var10_double = var10_double + (this.field_L * var3[5] + (var3[4] * this.field_G + var3[3] * this.field_K)) * 1280.0;
                    var12_double = var12_double + (this.field_L * var3[8] + (this.field_G * var3[7] + var3[6] * this.field_K)) * 1280.0;
                    break L24;
                  }
                  L27: {
                    var6 = ((double)ld.field_l - var10_double) * 0.02127659574468085;
                    var8 = 0.02127659574468085 * ((double)jh.field_R - var12_double);
                    if (var6 < -1.0) {
                      var8 = var8 / -var6;
                      var6 = -1.0;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (1.0 < var6) {
                      var8 = var8 / var6;
                      var6 = 1.0;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (var8 < -1.0) {
                      var6 = var6 / -var8;
                      var8 = -1.0;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  if (var8 > 1.0) {
                    var6 = var6 / var8;
                    var8 = 1.0;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              } else {
                break L18;
              }
            }
            L30: {
              if (var6 != 0.0) {
                this.field_G = this.field_G + var6 * 0.005 * var3[4];
                this.field_L = this.field_L + var3[5] * (0.005 * var6);
                this.field_K = this.field_K + var3[3] * (var6 * 0.005);
                hd.field_e.a(var6 * 0.001, var3[8], var3[6], var3[7], 7);
                this.field_Jb.a(-117, hd.field_e);
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (var8 == 0.0) {
                break L31;
              } else {
                this.field_L = this.field_L + var3[8] * (0.005 * var8);
                this.field_G = this.field_G + var8 * 0.005 * var3[7];
                this.field_K = this.field_K + 0.005 * var8 * var3[6];
                hd.field_e.a(-0.001 * var8, var3[5], var3[3], var3[4], 7);
                this.field_Jb.a(param0 + -11895, hd.field_e);
                break L31;
              }
            }
            L32: {
              this.field_Jb.a(0.9, (byte) -65);
              this.field_jb.a(-84, this.field_Jb);
              this.field_jb.a((byte) 27, var3);
              if (var3[11] < 0.8660254037844386) {
                var10_double = Math.sqrt(-(var3[11] * var3[11]) + 1.0);
                var12_double = var3[10] / var10_double;
                var14 = -var3[9] / var10_double;
                var16 = -Math.asin(var3[11]) + 1.0471975511965976;
                hd.field_e.a(var16, 0.0, var12_double, var14, 7);
                this.field_jb.a(-33, hd.field_e);
                this.field_jb.a((byte) 75, var3);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              L34: {
                L35: {
                  this.field_G = (this.field_G + 0.01 * var3[10]) * 0.95;
                  this.field_L = (this.field_L + var3[11] * 0.01) * 0.95;
                  this.field_K = (this.field_K + var3[9] * 0.01) * 0.95;
                  super.a(param0, param1);
                  this.field_Lb.c(16777215);
                  var10 = mc.field_e[82] ? 1 : 0;
                  if (!this.field_vb) {
                    break L35;
                  } else {
                    if (!this.field_Fb) {
                      break L35;
                    } else {
                      if ((b.field_f ^ -1) != -1) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                }
                this.field_Fb = false;
                if (var32 == 0) {
                  break L33;
                } else {
                  break L34;
                }
              }
              var10 = 1;
              break L33;
            }
            L36: {
              L37: {
                if (this.field_A.field_M) {
                  break L37;
                } else {
                  if (this.field_Mb) {
                    break L37;
                  } else {
                    if (var10 == 0) {
                      break L37;
                    } else {
                      if (0 != this.field_kb) {
                        break L37;
                      } else {
                        L38: {
                          var11 = 5120;
                          if ((this.field_Hb ^ -1) > (var11 ^ -1)) {
                            break L38;
                          } else {
                            L39: {
                              this.field_A.field_v = true;
                              this.field_A.field_t = true;
                              this.field_Lb.b(118);
                              stackIn_150_0 = this;

                              stackIn_150_1 = 0;

                              stackIn_150_2 = null;

                              stackIn_150_3 = null;

                              stackIn_150_4 = this.field_A;

                              stackIn_150_5 = this;

                              stackIn_150_6 = (double[]) (var3);

                              stackIn_150_7 = me.field_J;

                              stackIn_150_8 = 0.0;

                              stackIn_150_9 = 0.0;

                              if (0 >= this.field_Pb) {
                                stackIn_151_0 = this;
                                stackIn_151_1 = stackIn_150_1;
                                stackIn_151_2 = null;
                                stackIn_151_3 = null;
                                stackIn_151_4 = (hn) ((Object) stackIn_150_4);
                                stackIn_151_5 = this;
                                stackIn_151_6 = (double[]) ((Object) stackIn_150_6);
                                stackIn_151_7 = (double[]) ((Object) stackIn_150_7);
                                stackIn_151_8 = stackIn_150_8;
                                stackIn_151_9 = stackIn_150_9;
                                stackIn_151_10 = 0;
                                break L39;
                              } else {
                                stackIn_148_0 = this;




                                stackIn_148_5 = this;




                                stackIn_151_0 = this;
                                stackIn_151_1 = stackIn_150_1;
                                stackIn_151_2 = null;
                                stackIn_151_3 = null;
                                stackIn_151_4 = (hn) ((Object) stackIn_150_4);
                                stackIn_151_5 = this;
                                stackIn_151_6 = (double[]) ((Object) stackIn_150_6);
                                stackIn_151_7 = (double[]) ((Object) stackIn_150_7);
                                stackIn_151_8 = stackIn_150_8;
                                stackIn_151_9 = stackIn_150_9;
                                stackIn_151_10 = 1;
                                break L39;
                              }
                            }
                            L40: {
                              stackIn_153_0 = this;

                              stackIn_153_5 = this;

                              stackIn_153_11 = this.field_Eb;

                              if (this.field_U <= 0) {
                                stackIn_154_0 = this;

                                stackIn_151_2 = null;
                                stackIn_151_3 = null;
                                stackIn_151_4 = (hn) ((Object) stackIn_151_4);
                                stackIn_154_5 = this;
                                stackIn_151_6 = (double[]) ((Object) stackIn_151_6);
                                stackIn_151_7 = (double[]) ((Object) stackIn_151_7);



                                stackIn_154_11 = stackIn_153_11;
                                stackIn_154_12 = 0;
                                break L40;
                              } else {
                                stackIn_154_0 = this;

                                stackIn_151_2 = null;
                                stackIn_151_3 = null;
                                stackIn_151_4 = (hn) ((Object) stackIn_151_4);
                                stackIn_154_5 = this;
                                stackIn_151_6 = (double[]) ((Object) stackIn_151_6);
                                stackIn_151_7 = (double[]) ((Object) stackIn_151_7);



                                stackIn_154_11 = stackIn_153_11;
                                stackIn_154_12 = 1;
                                break L40;
                              }
                            }
                            L41: {
                              ri.a((rk) (this), stackIn_151_1, new cf(stackIn_151_4, (ee) (this), stackIn_151_6, stackIn_151_7, stackIn_151_8, stackIn_151_9, stackIn_151_10 != 0, stackIn_154_11, stackIn_154_12 != 0));
                              stackIn_156_0 = this;

                              if (this.field_mb) {
                                stackIn_157_0 = this;
                                stackIn_157_1 = 3;
                                break L41;
                              } else {
                                stackIn_157_0 = this;
                                stackIn_157_1 = 12;
                                break L41;
                              }
                            }
                            L42: {
                              ((dj) (this)).field_kb = stackIn_157_1;
                              var12 = 4;
                              if (this.field_Eb) {
                                L43: {
                                  var13_double = (double)this.field_Z * 0.09817477042468103;
                                  var15 = Math.sin(var13_double);
                                  var17 = Math.cos(var13_double);
                                  stackIn_163_0 = this;

                                  stackIn_163_1 = param0 ^ 11878;

                                  stackIn_163_2 = null;

                                  stackIn_163_3 = null;

                                  stackIn_163_4 = this.field_A;

                                  stackIn_163_5 = this;

                                  stackIn_163_6 = (double[]) (var3);

                                  stackIn_163_7 = me.field_J;

                                  stackIn_163_8 = -0.04 * var17;

                                  stackIn_163_9 = -0.04 * var15;

                                  if (0 >= this.field_Pb) {
                                    stackIn_164_0 = this;
                                    stackIn_164_1 = stackIn_163_1;
                                    stackIn_164_2 = null;
                                    stackIn_164_3 = null;
                                    stackIn_164_4 = (hn) ((Object) stackIn_163_4);
                                    stackIn_164_5 = this;
                                    stackIn_164_6 = (double[]) ((Object) stackIn_163_6);
                                    stackIn_164_7 = (double[]) ((Object) stackIn_163_7);
                                    stackIn_164_8 = stackIn_163_8;
                                    stackIn_164_9 = stackIn_163_9;
                                    stackIn_164_10 = 0;
                                    break L43;
                                  } else {
                                    stackIn_164_0 = this;
                                    stackIn_164_1 = stackIn_163_1;
                                    stackIn_164_2 = null;
                                    stackIn_164_3 = null;
                                    stackIn_164_4 = (hn) ((Object) stackIn_163_4);
                                    stackIn_164_5 = this;
                                    stackIn_164_6 = (double[]) ((Object) stackIn_163_6);
                                    stackIn_164_7 = (double[]) ((Object) stackIn_163_7);
                                    stackIn_164_8 = stackIn_163_8;
                                    stackIn_164_9 = stackIn_163_9;
                                    stackIn_164_10 = 1;
                                    break L43;
                                  }
                                }
                                L44: {
                                  stackIn_166_0 = this;

                                  stackIn_166_5 = this;

                                  stackIn_166_11 = 1;

                                  if (-1 <= (this.field_U ^ -1)) {
                                    stackIn_167_0 = this;

                                    stackIn_164_2 = null;
                                    stackIn_164_3 = null;
                                    stackIn_164_4 = (hn) ((Object) stackIn_164_4);
                                    stackIn_167_5 = this;
                                    stackIn_164_6 = (double[]) ((Object) stackIn_164_6);
                                    stackIn_164_7 = (double[]) ((Object) stackIn_164_7);



                                    stackIn_167_11 = stackIn_166_11;
                                    stackIn_167_12 = 0;
                                    break L44;
                                  } else {
                                    stackIn_167_0 = this;

                                    stackIn_164_2 = null;
                                    stackIn_164_3 = null;
                                    stackIn_164_4 = (hn) ((Object) stackIn_164_4);
                                    stackIn_167_5 = this;
                                    stackIn_164_6 = (double[]) ((Object) stackIn_164_6);
                                    stackIn_164_7 = (double[]) ((Object) stackIn_164_7);



                                    stackIn_167_11 = stackIn_166_11;
                                    stackIn_167_12 = 1;
                                    break L44;
                                  }
                                }
                                L45: {
                                  ri.a((rk) (this), stackIn_164_1, new cf(stackIn_164_4, (ee) (this), stackIn_164_6, stackIn_164_7, stackIn_164_8, stackIn_164_9, stackIn_164_10 != 0, stackIn_167_11 != 0, stackIn_167_12 != 0));
                                  stackIn_169_0 = this;

                                  stackIn_169_1 = 0;

                                  stackIn_169_2 = null;

                                  stackIn_169_3 = null;

                                  stackIn_169_4 = this.field_A;

                                  stackIn_169_5 = this;

                                  stackIn_169_6 = (double[]) (var3);

                                  stackIn_169_7 = me.field_J;

                                  stackIn_169_8 = -0.02 * var17;

                                  stackIn_169_9 = var15 * -0.02;

                                  if ((this.field_Pb ^ -1) >= -1) {
                                    stackIn_170_0 = this;
                                    stackIn_170_1 = stackIn_169_1;
                                    stackIn_170_2 = null;
                                    stackIn_170_3 = null;
                                    stackIn_170_4 = (hn) ((Object) stackIn_169_4);
                                    stackIn_170_5 = this;
                                    stackIn_170_6 = (double[]) ((Object) stackIn_169_6);
                                    stackIn_170_7 = (double[]) ((Object) stackIn_169_7);
                                    stackIn_170_8 = stackIn_169_8;
                                    stackIn_170_9 = stackIn_169_9;
                                    stackIn_170_10 = 0;
                                    break L45;
                                  } else {
                                    stackIn_170_0 = this;
                                    stackIn_170_1 = stackIn_169_1;
                                    stackIn_170_2 = null;
                                    stackIn_170_3 = null;
                                    stackIn_170_4 = (hn) ((Object) stackIn_169_4);
                                    stackIn_170_5 = this;
                                    stackIn_170_6 = (double[]) ((Object) stackIn_169_6);
                                    stackIn_170_7 = (double[]) ((Object) stackIn_169_7);
                                    stackIn_170_8 = stackIn_169_8;
                                    stackIn_170_9 = stackIn_169_9;
                                    stackIn_170_10 = 1;
                                    break L45;
                                  }
                                }
                                L46: {
                                  stackIn_172_0 = this;

                                  stackIn_172_5 = this;

                                  stackIn_172_11 = 1;

                                  if (this.field_U <= 0) {
                                    stackIn_173_0 = this;

                                    stackIn_170_2 = null;
                                    stackIn_170_3 = null;
                                    stackIn_170_4 = (hn) ((Object) stackIn_170_4);
                                    stackIn_173_5 = this;
                                    stackIn_170_6 = (double[]) ((Object) stackIn_170_6);
                                    stackIn_170_7 = (double[]) ((Object) stackIn_170_7);



                                    stackIn_173_11 = stackIn_172_11;
                                    stackIn_173_12 = 0;
                                    break L46;
                                  } else {
                                    stackIn_173_0 = this;

                                    stackIn_170_2 = null;
                                    stackIn_170_3 = null;
                                    stackIn_170_4 = (hn) ((Object) stackIn_170_4);
                                    stackIn_173_5 = this;
                                    stackIn_170_6 = (double[]) ((Object) stackIn_170_6);
                                    stackIn_170_7 = (double[]) ((Object) stackIn_170_7);



                                    stackIn_173_11 = stackIn_172_11;
                                    stackIn_173_12 = 1;
                                    break L46;
                                  }
                                }
                                L47: {
                                  ri.a((rk) (this), stackIn_170_1, new cf(stackIn_170_4, (ee) (this), stackIn_170_6, stackIn_170_7, stackIn_170_8, stackIn_170_9, stackIn_170_10 != 0, stackIn_173_11 != 0, stackIn_173_12 != 0));
                                  stackIn_175_0 = this;

                                  stackIn_175_1 = 0;

                                  stackIn_175_2 = null;

                                  stackIn_175_3 = null;

                                  stackIn_175_4 = this.field_A;

                                  stackIn_175_5 = this;

                                  stackIn_175_6 = (double[]) (var3);

                                  stackIn_175_7 = me.field_J;

                                  stackIn_175_8 = 0.02 * var17;

                                  stackIn_175_9 = 0.02 * var15;

                                  if (-1 <= (this.field_Pb ^ -1)) {
                                    stackIn_176_0 = this;
                                    stackIn_176_1 = stackIn_175_1;
                                    stackIn_176_2 = null;
                                    stackIn_176_3 = null;
                                    stackIn_176_4 = (hn) ((Object) stackIn_175_4);
                                    stackIn_176_5 = this;
                                    stackIn_176_6 = (double[]) ((Object) stackIn_175_6);
                                    stackIn_176_7 = (double[]) ((Object) stackIn_175_7);
                                    stackIn_176_8 = stackIn_175_8;
                                    stackIn_176_9 = stackIn_175_9;
                                    stackIn_176_10 = 0;
                                    break L47;
                                  } else {
                                    stackIn_176_0 = this;
                                    stackIn_176_1 = stackIn_175_1;
                                    stackIn_176_2 = null;
                                    stackIn_176_3 = null;
                                    stackIn_176_4 = (hn) ((Object) stackIn_175_4);
                                    stackIn_176_5 = this;
                                    stackIn_176_6 = (double[]) ((Object) stackIn_175_6);
                                    stackIn_176_7 = (double[]) ((Object) stackIn_175_7);
                                    stackIn_176_8 = stackIn_175_8;
                                    stackIn_176_9 = stackIn_175_9;
                                    stackIn_176_10 = 1;
                                    break L47;
                                  }
                                }
                                L48: {
                                  stackIn_178_0 = this;

                                  stackIn_178_5 = this;

                                  stackIn_178_11 = 1;

                                  if (-1 <= (this.field_U ^ -1)) {
                                    stackIn_179_0 = this;

                                    stackIn_176_2 = null;
                                    stackIn_176_3 = null;
                                    stackIn_176_4 = (hn) ((Object) stackIn_176_4);
                                    stackIn_179_5 = this;
                                    stackIn_176_6 = (double[]) ((Object) stackIn_176_6);
                                    stackIn_176_7 = (double[]) ((Object) stackIn_176_7);



                                    stackIn_179_11 = stackIn_178_11;
                                    stackIn_179_12 = 0;
                                    break L48;
                                  } else {
                                    stackIn_179_0 = this;

                                    stackIn_176_2 = null;
                                    stackIn_176_3 = null;
                                    stackIn_176_4 = (hn) ((Object) stackIn_176_4);
                                    stackIn_179_5 = this;
                                    stackIn_176_6 = (double[]) ((Object) stackIn_176_6);
                                    stackIn_176_7 = (double[]) ((Object) stackIn_176_7);



                                    stackIn_179_11 = stackIn_178_11;
                                    stackIn_179_12 = 1;
                                    break L48;
                                  }
                                }
                                L49: {
                                  ri.a((rk) (this), stackIn_176_1, new cf(stackIn_176_4, (ee) (this), stackIn_176_6, stackIn_176_7, stackIn_176_8, stackIn_176_9, stackIn_176_10 != 0, stackIn_179_11 != 0, stackIn_179_12 != 0));
                                  stackIn_181_0 = this;

                                  stackIn_181_1 = 0;

                                  stackIn_181_2 = null;

                                  stackIn_181_3 = null;

                                  stackIn_181_4 = this.field_A;

                                  stackIn_181_5 = this;

                                  stackIn_181_6 = (double[]) (var3);

                                  stackIn_181_7 = me.field_J;

                                  stackIn_181_8 = var17 * 0.04;

                                  stackIn_181_9 = 0.04 * var15;

                                  if (0 >= this.field_Pb) {
                                    stackIn_182_0 = this;
                                    stackIn_182_1 = stackIn_181_1;
                                    stackIn_182_2 = null;
                                    stackIn_182_3 = null;
                                    stackIn_182_4 = (hn) ((Object) stackIn_181_4);
                                    stackIn_182_5 = this;
                                    stackIn_182_6 = (double[]) ((Object) stackIn_181_6);
                                    stackIn_182_7 = (double[]) ((Object) stackIn_181_7);
                                    stackIn_182_8 = stackIn_181_8;
                                    stackIn_182_9 = stackIn_181_9;
                                    stackIn_182_10 = 0;
                                    break L49;
                                  } else {
                                    stackIn_182_0 = this;
                                    stackIn_182_1 = stackIn_181_1;
                                    stackIn_182_2 = null;
                                    stackIn_182_3 = null;
                                    stackIn_182_4 = (hn) ((Object) stackIn_181_4);
                                    stackIn_182_5 = this;
                                    stackIn_182_6 = (double[]) ((Object) stackIn_181_6);
                                    stackIn_182_7 = (double[]) ((Object) stackIn_181_7);
                                    stackIn_182_8 = stackIn_181_8;
                                    stackIn_182_9 = stackIn_181_9;
                                    stackIn_182_10 = 1;
                                    break L49;
                                  }
                                }
                                L50: {
                                  stackIn_184_0 = this;

                                  stackIn_184_5 = this;

                                  stackIn_184_11 = 1;

                                  if (-1 <= (this.field_U ^ -1)) {
                                    stackIn_185_0 = this;

                                    stackIn_182_2 = null;
                                    stackIn_182_3 = null;
                                    stackIn_182_4 = (hn) ((Object) stackIn_182_4);
                                    stackIn_185_5 = this;
                                    stackIn_182_6 = (double[]) ((Object) stackIn_182_6);
                                    stackIn_182_7 = (double[]) ((Object) stackIn_182_7);



                                    stackIn_185_11 = stackIn_184_11;
                                    stackIn_185_12 = 0;
                                    break L50;
                                  } else {
                                    stackIn_185_0 = this;

                                    stackIn_182_2 = null;
                                    stackIn_182_3 = null;
                                    stackIn_182_4 = (hn) ((Object) stackIn_182_4);
                                    stackIn_185_5 = this;
                                    stackIn_182_6 = (double[]) ((Object) stackIn_182_6);
                                    stackIn_182_7 = (double[]) ((Object) stackIn_182_7);



                                    stackIn_185_11 = stackIn_184_11;
                                    stackIn_185_12 = 1;
                                    break L50;
                                  }
                                }
                                ri.a((rk) (this), stackIn_182_1, new cf(stackIn_182_4, (ee) (this), stackIn_182_6, stackIn_182_7, stackIn_182_8, stackIn_182_9, stackIn_182_10 != 0, stackIn_185_11 != 0, stackIn_185_12 != 0));
                                this.field_Z = 63 & this.field_Z + this.field_kb;
                                var12 += 4;
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                            var13_int = 0;
                            L51: while (true) {
                              L52: {
                                if (5 <= var13_int) {
                                  break L52;
                                } else {
                                  var14_ref_h = this.field_Nb[var13_int];
                                  stackOut_188_0 = (h) (var14_ref_h);
                                  stackIn_340_0 = stackOut_188_0;
                                  stackIn_189_0 = stackOut_188_0;
                                  if (var32 != 0) {
                                    break L36;
                                  } else {
                                    L53: {
                                      if (stackIn_189_0 != null) {
                                        L54: {
                                          var14_ref_h.field_Z.b(118);
                                          var12++;
                                          stackIn_196_0 = this;

                                          stackIn_196_1 = 0;

                                          stackIn_196_2 = null;

                                          stackIn_196_3 = null;

                                          stackIn_196_4 = this.field_A;

                                          stackIn_196_5 = (h) (var14_ref_h);

                                          stackIn_196_6 = (double[]) (var3);

                                          stackIn_196_7 = og.field_g;

                                          stackIn_196_8 = 0.0;

                                          stackIn_196_9 = 0.0;

                                          if (-1 <= (this.field_Pb ^ -1)) {
                                            stackIn_197_0 = this;
                                            stackIn_197_1 = stackIn_196_1;
                                            stackIn_197_2 = null;
                                            stackIn_197_3 = null;
                                            stackIn_197_4 = (hn) ((Object) stackIn_196_4);
                                            stackIn_197_5 = (h) ((Object) stackIn_196_5);
                                            stackIn_197_6 = (double[]) ((Object) stackIn_196_6);
                                            stackIn_197_7 = (double[]) ((Object) stackIn_196_7);
                                            stackIn_197_8 = stackIn_196_8;
                                            stackIn_197_9 = stackIn_196_9;
                                            stackIn_197_10 = 0;
                                            break L54;
                                          } else {
                                            stackIn_197_0 = this;
                                            stackIn_197_1 = stackIn_196_1;
                                            stackIn_197_2 = null;
                                            stackIn_197_3 = null;
                                            stackIn_197_4 = (hn) ((Object) stackIn_196_4);
                                            stackIn_197_5 = (h) ((Object) stackIn_196_5);
                                            stackIn_197_6 = (double[]) ((Object) stackIn_196_6);
                                            stackIn_197_7 = (double[]) ((Object) stackIn_196_7);
                                            stackIn_197_8 = stackIn_196_8;
                                            stackIn_197_9 = stackIn_196_9;
                                            stackIn_197_10 = 1;
                                            break L54;
                                          }
                                        }
                                        L55: {
                                          stackIn_199_0 = this;

                                          stackIn_199_11 = 0;

                                          if (0 >= this.field_U) {
                                            stackIn_200_0 = this;

                                            stackIn_197_2 = null;
                                            stackIn_197_3 = null;
                                            stackIn_197_4 = (hn) ((Object) stackIn_197_4);
                                            stackIn_197_5 = (h) ((Object) stackIn_197_5);
                                            stackIn_197_6 = (double[]) ((Object) stackIn_197_6);
                                            stackIn_197_7 = (double[]) ((Object) stackIn_197_7);



                                            stackIn_200_11 = stackIn_199_11;
                                            stackIn_200_12 = 0;
                                            break L55;
                                          } else {
                                            stackIn_200_0 = this;

                                            stackIn_197_2 = null;
                                            stackIn_197_3 = null;
                                            stackIn_197_4 = (hn) ((Object) stackIn_197_4);
                                            stackIn_197_5 = (h) ((Object) stackIn_197_5);
                                            stackIn_197_6 = (double[]) ((Object) stackIn_197_6);
                                            stackIn_197_7 = (double[]) ((Object) stackIn_197_7);



                                            stackIn_200_11 = stackIn_199_11;
                                            stackIn_200_12 = 1;
                                            break L55;
                                          }
                                        }
                                        ri.a((rk) (this), stackIn_197_1, new cf(stackIn_197_4, stackIn_197_5, stackIn_197_6, stackIn_197_7, stackIn_197_8, stackIn_197_9, stackIn_197_10 != 0, stackIn_200_11 != 0, stackIn_200_12 != 0));
                                        break L53;
                                      } else {
                                        break L53;
                                      }
                                    }
                                    var13_int++;
                                    if (var32 == 0) {
                                      continue L51;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                              L56: {
                                this.field_Hb = this.field_Hb - var11;
                                stackIn_205_0 = (int)(24.0 * Math.sqrt((double)var12));

                                stackIn_205_1 = 0;

                                if (-1 <= (this.field_U ^ -1)) {
                                  stackIn_206_0 = stackIn_205_0;
                                  stackIn_206_1 = stackIn_205_1;
                                  stackIn_206_2 = d.field_g;
                                  break L56;
                                } else {
                                  stackIn_206_0 = stackIn_205_0;
                                  stackIn_206_1 = stackIn_205_1;
                                  stackIn_206_2 = qj.field_b;
                                  break L56;
                                }
                              }
                              da.a(stackIn_206_0, stackIn_206_1, stackIn_206_2, true, (pm) (this));
                              if (var32 == 0) {
                                break L37;
                              } else {
                                break L38;
                              }
                            }
                          }
                        }
                        this.field_Mb = true;
                        break L37;
                      }
                    }
                  }
                }
              }
              L57: {
                L58: {
                  if (!this.field_cb) {
                    break L58;
                  } else {
                    if (this.field_A.field_M) {
                      break L58;
                    } else {
                      if (this.field_Mb) {
                        break L58;
                      } else {
                        if (!mc.field_e[ql.field_u]) {
                          break L58;
                        } else {
                          stackIn_222_0 = 1;
                          break L57;
                        }
                      }
                    }
                  }
                }
                stackIn_222_0 = 0;
                break L57;
              }
              L59: {
                L60: {
                  L61: {
                    var11 = stackIn_222_0;
                    if (var11 == 0) {
                      break L61;
                    } else {
                      if ((this.field_Hb ^ -1) <= -2049) {
                        break L60;
                      } else {
                        break L61;
                      }
                    }
                  }
                  L62: {
                    if (var11 != 0) {
                      this.field_Mb = true;
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L63: {
                    L64: {
                      if (!this.field_cb) {
                        break L64;
                      } else {
                        if (16 > this.field_fb) {
                          break L64;
                        } else {
                          L65: {
                            this.field_A.field_t = true;
                            this.field_A.field_v = true;
                            this.field_Lb.b(118);
                            stackIn_241_0 = this;

                            stackIn_241_1 = 0;

                            stackIn_241_2 = null;

                            stackIn_241_3 = null;

                            stackIn_241_4 = this.field_A;

                            stackIn_241_5 = this;

                            stackIn_241_6 = (double[]) (var3);

                            stackIn_241_7 = 0.015625 * (double)this.field_fb;

                            if (0 >= this.field_Pb) {
                              stackIn_242_0 = this;
                              stackIn_242_1 = stackIn_241_1;
                              stackIn_242_2 = null;
                              stackIn_242_3 = null;
                              stackIn_242_4 = (hn) ((Object) stackIn_241_4);
                              stackIn_242_5 = this;
                              stackIn_242_6 = (double[]) ((Object) stackIn_241_6);
                              stackIn_242_7 = stackIn_241_7;
                              stackIn_242_8 = 0;
                              break L65;
                            } else {
                              stackIn_239_0 = this;




                              stackIn_239_5 = this;


                              stackIn_242_0 = this;
                              stackIn_242_1 = stackIn_241_1;
                              stackIn_242_2 = null;
                              stackIn_242_3 = null;
                              stackIn_242_4 = (hn) ((Object) stackIn_241_4);
                              stackIn_242_5 = this;
                              stackIn_242_6 = (double[]) ((Object) stackIn_241_6);
                              stackIn_242_7 = stackIn_241_7;
                              stackIn_242_8 = 1;
                              break L65;
                            }
                          }
                          ri.a((rk) (this), stackIn_242_1, new wm(stackIn_242_4, (dj) (this), stackIn_242_6, stackIn_242_7, stackIn_242_8 != 0));
                          this.field_fb = 0;
                          if (var32 == 0) {
                            break L63;
                          } else {
                            break L64;
                          }
                        }
                      }
                    }
                    if (0 >= this.field_fb) {
                      break L63;
                    } else {
                      this.field_fb = this.field_fb - 1;
                      break L63;
                    }
                  }
                  if (null != this.field_wb) {
                    var12_ref_Object = cb.field_a;
                    synchronized (var12_ref_Object) {
                      L66: {
                        this.field_wb.field_n.b(true);
                        this.field_wb.field_n.c(0);
                        break L66;
                      }
                    }
                    this.field_wb = null;
                    if (var32 == 0) {
                      break L59;
                    } else {
                      break L60;
                    }
                  } else {
                    break L59;
                  }
                }
                this.field_fb = this.field_fb + 1;
                this.field_Hb = this.field_Hb - 2048;
                if (null != this.field_wb) {
                  break L59;
                } else {
                  this.field_wb = new gk((pm) (this), sf.field_p, 1, true);
                  break L59;
                }
              }
              L67: {
                L68: {
                  if (!this.field_eb) {
                    break L68;
                  } else {
                    if (this.field_A.field_M) {
                      break L68;
                    } else {
                      if (this.field_Mb) {
                        break L68;
                      } else {
                        if (!mc.field_e[nl.field_b]) {
                          break L68;
                        } else {
                          stackIn_273_0 = 1;
                          break L67;
                        }
                      }
                    }
                  }
                }
                stackIn_273_0 = 0;
                break L67;
              }
              L69: {
                L70: {
                  var11 = stackIn_273_0;
                  if (var11 == 0) {
                    break L70;
                  } else {
                    if (this.field_Hb < 2048) {
                      break L70;
                    } else {
                      this.field_Hb = this.field_Hb - 2048;
                      this.field_lb = this.field_lb + 1;
                      if (null != this.field_Y) {
                        break L69;
                      } else {
                        this.field_Y = new gk((pm) (this), th.field_bb, 1, true);
                        if (var32 == 0) {
                          break L69;
                        } else {
                          break L70;
                        }
                      }
                    }
                  }
                }
                L71: {
                  if (var11 != 0) {
                    this.field_Mb = true;
                    break L71;
                  } else {
                    break L71;
                  }
                }
                L72: {
                  L73: {
                    if (!this.field_eb) {
                      break L73;
                    } else {
                      if ((this.field_lb ^ -1) > -17) {
                        break L73;
                      } else {
                        L74: {
                          this.field_A.field_v = true;
                          this.field_A.field_t = true;
                          this.field_Lb.b(118);
                          stackIn_298_0 = this;

                          stackIn_298_1 = 0;

                          stackIn_298_2 = null;

                          stackIn_298_3 = null;

                          stackIn_298_4 = this.field_A;

                          stackIn_298_5 = this;

                          stackIn_298_6 = (double[]) (var3);

                          stackIn_298_7 = (double)this.field_lb * 0.015625;

                          if (-1 <= (this.field_Pb ^ -1)) {
                            stackIn_299_0 = this;
                            stackIn_299_1 = stackIn_298_1;
                            stackIn_299_2 = null;
                            stackIn_299_3 = null;
                            stackIn_299_4 = (hn) ((Object) stackIn_298_4);
                            stackIn_299_5 = this;
                            stackIn_299_6 = (double[]) ((Object) stackIn_298_6);
                            stackIn_299_7 = stackIn_298_7;
                            stackIn_299_8 = 0;
                            break L74;
                          } else {
                            stackIn_296_0 = this;




                            stackIn_296_5 = this;


                            stackIn_299_0 = this;
                            stackIn_299_1 = stackIn_298_1;
                            stackIn_299_2 = null;
                            stackIn_299_3 = null;
                            stackIn_299_4 = (hn) ((Object) stackIn_298_4);
                            stackIn_299_5 = this;
                            stackIn_299_6 = (double[]) ((Object) stackIn_298_6);
                            stackIn_299_7 = stackIn_298_7;
                            stackIn_299_8 = 1;
                            break L74;
                          }
                        }
                        ri.a((rk) (this), stackIn_299_1, new il(stackIn_299_4, (dj) (this), stackIn_299_6, stackIn_299_7, stackIn_299_8 != 0));
                        this.field_lb = 0;
                        if (var32 == 0) {
                          break L72;
                        } else {
                          break L73;
                        }
                      }
                    }
                  }
                  if (-1 <= (this.field_lb ^ -1)) {
                    break L72;
                  } else {
                    this.field_lb = this.field_lb - 1;
                    break L72;
                  }
                }
                if (null != this.field_Y) {
                  var12_ref_Object = cb.field_a;
                  synchronized (var12_ref_Object) {
                    L75: {
                      this.field_Y.field_n.b(true);
                      this.field_Y.field_n.c(0);
                      break L75;
                    }
                  }
                  this.field_Y = null;
                  break L69;
                } else {
                  break L69;
                }
              }
              L76: {
                L77: {
                  L78: {
                    if (!this.field_Sb) {
                      break L78;
                    } else {
                      if (this.field_A.field_M) {
                        break L78;
                      } else {
                        if (this.field_Mb) {
                          break L78;
                        } else {
                          if (mc.field_e[ln.field_b]) {
                            break L77;
                          } else {
                            break L78;
                          }
                        }
                      }
                    }
                  }
                  if ((this.field_Q ^ -1) >= -1) {
                    break L76;
                  } else {
                    this.field_Q = this.field_Q - 1;
                    if (var32 == 0) {
                      break L76;
                    } else {
                      break L77;
                    }
                  }
                }
                L79: {
                  if ((this.field_Hb ^ -1) <= -2049) {
                    break L79;
                  } else {
                    this.field_Q = this.field_Q - 1;
                    this.field_Mb = true;
                    if (var32 == 0) {
                      break L76;
                    } else {
                      break L79;
                    }
                  }
                }
                this.field_A.field_v = true;
                this.field_A.field_t = true;
                this.field_Q = 8;
                break L76;
              }
              if (this.field_Pb <= 0) {
                stackIn_340_0 = null;
                break L36;
              } else {
                stackIn_340_0 = this.a(var3[9], var3[10], var3[11], false);
                break L36;
              }
            }
            L80: {
              L81: {
                L82: {
                  L83: {
                    L84: {
                      L85: {
                        var11_ref = stackIn_340_0;
                        if (null == var11_ref) {
                          break L85;
                        } else {
                          this.a(this.field_bb, (pm) (var11_ref), 0.2, this.field_jb, ac.field_c, -115);
                          var12 = 0;
                          L86: while (true) {
                            L87: {
                              if (-6 >= (var12 ^ -1)) {
                                break L87;
                              } else {
                                var13 = this.field_Nb[var12];
                                if (var32 != 0) {
                                  break L84;
                                } else {
                                  L88: {
                                    if (var13 == null) {
                                      break L88;
                                    } else {
                                      this.a(var13.field_T, (pm) (var11_ref), 0.2, this.field_jb, og.field_g, param0 ^ 11780);
                                      break L88;
                                    }
                                  }
                                  var12++;
                                  if (var32 == 0) {
                                    continue L86;
                                  } else {
                                    break L87;
                                  }
                                }
                              }
                            }
                            if (var32 == 0) {
                              break L84;
                            } else {
                              break L85;
                            }
                          }
                        }
                      }
                      var12 = 0;
                      L89: while (true) {
                        L90: {
                          L91: {
                            if (this.field_bb.length <= var12) {
                              break L91;
                            } else {
                              this.field_bb[var12] = var3[9];
                              this.field_bb[1 + var12] = var3[10];
                              this.field_bb[var12 + 2] = var3[11];
                              var12 += 3;
                              if (var32 != 0) {
                                break L90;
                              } else {
                                if (var32 == 0) {
                                  continue L89;
                                } else {
                                  break L91;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          break L90;
                        }
                        L92: while (true) {
                          if ((var12 ^ -1) <= -6) {
                            break L84;
                          } else {
                            var13 = this.field_Nb[var12];
                            if (var32 != 0) {
                              break L83;
                            } else {
                              L93: {
                                if (null != var13) {
                                  var13.field_T[2] = var3[11];
                                  var13.field_T[0] = var3[9];
                                  var13.field_T[1] = var3[10];
                                  break L93;
                                } else {
                                  break L93;
                                }
                              }
                              var12++;
                              if (var32 == 0) {
                                continue L92;
                              } else {
                                break L84;
                              }
                            }
                          }
                        }
                      }
                    }
                    L94: {
                      if (this.field_Q <= 0) {
                        break L94;
                      } else {
                        L95: {
                          this.field_Lb.b(118);
                          this.field_Hb = this.field_Hb - 256 * this.field_Q;
                          if (-1 >= (this.field_Hb ^ -1)) {
                            break L95;
                          } else {
                            this.field_Hb = 0;
                            this.field_Mb = true;
                            break L95;
                          }
                        }
                        var11 = -1610547456 & 32768 * this.field_Q >>> -470250813 | (this.field_Q * 4194559 & 133695480) >>> -79965821;
                        var12_double = (double)(this.field_Q / 8);
                        var14 = 1.0 * var12_double;
                        var16 = var12_double;
                        var18 = 0;
                        L96: while (true) {
                          L97: {
                            L98: {
                              if (-5 >= (var18 ^ -1)) {
                                break L98;
                              } else {
                                this.a(false, var3, var18 * 3, ac.field_c);
                                this.field_Ab[var18].a(ud.field_o, var11, this.field_bb[2 + var18 * 3], var14, var16, dh.field_sb, rn.field_c, this.field_bb[var18 * 3], false, this.field_bb[1 + 3 * var18]);
                                this.field_Ab[var18].field_Q.field_m = this.field_Q * 96 >> 676998531;
                                this.field_A.field_b.a((rk) (this.field_Ab[var18]), (byte) -64);
                                var18++;
                                if (var32 != 0) {
                                  break L97;
                                } else {
                                  if (var32 == 0) {
                                    continue L96;
                                  } else {
                                    break L98;
                                  }
                                }
                              }
                            }
                            var18 = 0;
                            break L97;
                          }
                          L99: while (true) {
                            if (var18 >= 5) {
                              break L94;
                            } else {
                              var19 = this.field_Nb[var18];
                              stackIn_527_0 = (h) (var19);

                              if (var32 != 0) {
                                break L82;
                              } else {
                                L100: {
                                  if (stackIn_527_0 == null) {
                                    break L100;
                                  } else {
                                    L101: {
                                      var19.field_Z.b(param0 ^ 11792);
                                      var19.a(false, var3, 0, og.field_g);
                                      var19.field_Q.a(ud.field_o, var11, var19.field_T[2], var14, var12_double, dh.field_sb, rn.field_c, var19.field_T[0], false, var19.field_T[1]);
                                      if (null == var19.field_Q.field_Q) {
                                        break L101;
                                      } else {
                                        var19.field_Q.field_Q.field_m = this.field_Q * 96 >> 1341575747;
                                        break L101;
                                      }
                                    }
                                    this.field_A.field_b.a((rk) (var19.field_Q), (byte) 79);
                                    break L100;
                                  }
                                }
                                var18++;
                                if (var32 == 0) {
                                  continue L99;
                                } else {
                                  break L94;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    this.field_Db = this.field_Db * 0.92;
                    this.field_db.field_m = 0;
                    break L83;
                  }
                  L102: {
                    if (!this.field_rb) {
                      break L102;
                    } else {
                      if (this.field_A.field_M) {
                        break L102;
                      } else {
                        if (this.field_Mb) {
                          break L102;
                        } else {
                          if (!mc.field_e[oc.field_e]) {
                            break L102;
                          } else {
                            L103: {
                              this.field_Hb = this.field_Hb - 2048;
                              if (0 <= this.field_Hb) {
                                break L103;
                              } else {
                                this.field_Mb = true;
                                this.field_Hb = 0;
                                if (var32 == 0) {
                                  break L102;
                                } else {
                                  break L103;
                                }
                              }
                            }
                            L104: {
                              this.field_db.field_m = 48;
                              var11 = 0;
                              this.field_S.a(12607743, 0, 50.0, 8.0);
                              if (!this.field_S.a((hm[]) null, false, 10.0)) {
                                break L104;
                              } else {
                                this.field_A.field_t = true;
                                var11 += 4;
                                this.field_Lb.b(118);
                                this.field_S.field_Q.field_m = 48;
                                this.field_A.field_F.a((rk) (this.field_S), (byte) 116);
                                break L104;
                              }
                            }
                            var12 = 0;
                            L105: while (true) {
                              L106: {
                                if (-6 >= (var12 ^ -1)) {
                                  break L106;
                                } else {
                                  var13 = this.field_Nb[var12];
                                  stackIn_527_0 = (h) (var13);

                                  if (var32 != 0) {
                                    break L82;
                                  } else {
                                    L107: {
                                      if (stackIn_527_0 == null) {
                                        break L107;
                                      } else {
                                        var13.field_X.a(12607743, param0 ^ 11878, 50.0, 8.0);
                                        if (!var13.field_X.a((hm[]) null, false, 3.0)) {
                                          break L107;
                                        } else {
                                          var13.field_X.field_Q.field_m = 32;
                                          this.field_A.field_t = true;
                                          this.field_A.field_F.a((rk) (var13.field_X), (byte) -95);
                                          var13.field_Z.b(118);
                                          var11++;
                                          break L107;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (var32 == 0) {
                                      continue L105;
                                    } else {
                                      break L106;
                                    }
                                  }
                                }
                              }
                              this.field_Db = this.field_Db + (double)var11;
                              break L102;
                            }
                          }
                        }
                      }
                    }
                  }
                  L108: {
                    L109: {
                      this.field_V.field_m = (int)(8.0 * Math.sqrt(this.field_Db));
                      if ((this.field_ob ^ -1) != -1) {
                        break L109;
                      } else {
                        L110: {
                          L111: {
                            if ((this.field_ub ^ -1) >= -1) {
                              break L111;
                            } else {
                              if (this.field_A.field_M) {
                                break L111;
                              } else {
                                if (mc.field_e[ja.field_d]) {
                                  break L110;
                                } else {
                                  break L111;
                                }
                              }
                            }
                          }
                          L112: {
                            L113: {
                              if (0 >= this.field_tb) {
                                break L113;
                              } else {
                                if (this.field_A.field_M) {
                                  break L113;
                                } else {
                                  if (mc.field_e[ib.field_W]) {
                                    break L112;
                                  } else {
                                    break L113;
                                  }
                                }
                              }
                            }
                            L114: {
                              L115: {
                                if (this.field_zb <= 0) {
                                  break L115;
                                } else {
                                  if (this.field_A.field_M) {
                                    break L115;
                                  } else {
                                    if (mc.field_e[vf.field_l]) {
                                      break L114;
                                    } else {
                                      break L115;
                                    }
                                  }
                                }
                              }
                              if (this.field_ab <= 0) {
                                break L108;
                              } else {
                                if (this.field_A.field_M) {
                                  break L108;
                                } else {
                                  if (!mc.field_e[sb.field_f]) {
                                    break L108;
                                  } else {
                                    if (this.field_A.field_P) {
                                      break L108;
                                    } else {
                                      if (0 == this.field_A.field_L) {
                                        this.field_Lb.b(118);
                                        ri.a((rk) (this), 0, new gi(this.field_A, (dj) (this)));
                                        this.field_ob = 16;
                                        this.field_A.field_P = true;
                                        this.field_ab = this.field_ab - 1;
                                        if (var32 == 0) {
                                          break L108;
                                        } else {
                                          break L114;
                                        }
                                      } else {
                                        break L108;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.field_Lb.b(118);
                            ri.a((rk) (this), 0, new ik(this.field_A, (dj) (this)));
                            this.field_zb = this.field_zb - 1;
                            this.field_ob = 16;
                            if (var32 == 0) {
                              break L108;
                            } else {
                              break L112;
                            }
                          }
                          this.field_Lb.b(118);
                          ri.a((rk) (this), 0, new gm(this.field_A, (dj) (this)));
                          this.field_tb = this.field_tb - 1;
                          this.field_ob = 16;
                          if (var32 == 0) {
                            break L108;
                          } else {
                            break L110;
                          }
                        }
                        this.field_Lb.b(118);
                        ri.a((rk) (this), 0, new th(this.field_A, (dj) (this)));
                        this.field_ob = 16;
                        this.field_ub = this.field_ub - 1;
                        if (var32 == 0) {
                          break L108;
                        } else {
                          break L109;
                        }
                      }
                    }
                    this.field_ob = this.field_ob - 1;
                    break L108;
                  }
                  L116: {
                    if (0 >= this.field_U) {
                      break L116;
                    } else {
                      this.field_U = this.field_U - 1;
                      break L116;
                    }
                  }
                  L117: {
                    if (0 >= this.field_Pb) {
                      break L117;
                    } else {
                      this.field_Pb = this.field_Pb - 1;
                      break L117;
                    }
                  }
                  L118: {
                    if (0 >= this.field_ib) {
                      break L118;
                    } else {
                      this.field_ib = this.field_ib - 1;
                      if (-1 != (this.field_ib ^ -1)) {
                        break L118;
                      } else {
                        this.field_Bb.field_l = false;
                        var11 = 0;
                        L119: while (true) {
                          if (-6 >= (var11 ^ -1)) {
                            break L118;
                          } else {
                            stackIn_524_0 = null;

                            stackIn_524_1 = this.field_Nb[var11];

                            if (var32 != 0) {
                              L120: while (true) {
                                L121: {
                                  if (stackIn_524_0 != stackIn_524_1) {
                                    stackIn_527_0 = this.field_Nb[var11];
                                    ((tf) (Object) stackIn_527_0.field_Z).b(118);
                                    break L121;
                                  } else {
                                    break L121;
                                  }
                                }
                                var11++;
                                if (var32 == 0) {
                                  if (var11 >= 5) {
                                    break L81;
                                  } else {
                                    if (var32 != 0) {
                                      break L80;
                                    } else {
                                      stackIn_524_0 = null;
                                      stackIn_524_1 = this.field_Nb[var11];
                                      continue L120;
                                    }
                                  }
                                } else {
                                  break L81;
                                }
                              }
                            } else {
                              L122: {
                                if (stackIn_524_0 != stackIn_524_1) {
                                  this.field_Nb[var11].field_ab.field_l = false;
                                  break L122;
                                } else {
                                  break L122;
                                }
                              }
                              var11++;
                              if (var32 == 0) {
                                continue L119;
                              } else {
                                break L118;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L123: {
                    if (this.field_Gb > 0) {
                      this.field_Gb = this.field_Gb - 1;
                      break L123;
                    } else {
                      break L123;
                    }
                  }
                  L124: {
                    L125: {
                      if (this.field_Gb <= 0) {
                        break L125;
                      } else {
                        if (256 > this.field_Kb) {
                          this.field_Kb = this.field_Kb + 16;
                          if (var32 == 0) {
                            break L124;
                          } else {
                            break L125;
                          }
                        } else {
                          break L124;
                        }
                      }
                    }
                    if (-1 > (this.field_Kb ^ -1)) {
                      this.field_Kb = this.field_Kb - 16;
                      break L124;
                    } else {
                      break L124;
                    }
                  }
                  if (128 <= this.field_Kb) {
                    break L81;
                  } else {
                    this.field_Lb.b(param0 ^ 11792);
                    var11 = 0;
                    L126: while (true) {
                      if (var11 >= 5) {
                        break L81;
                      } else {
                        if (var32 != 0) {
                          break L80;
                        } else {
                          stackIn_524_0 = null;
                          stackIn_524_1 = this.field_Nb[var11];
                          L127: {
                            if (stackIn_524_0 != stackIn_524_1) {
                              stackIn_527_0 = this.field_Nb[var11];
                              ((tf) (Object) stackIn_527_0.field_Z).b(118);
                              break L127;
                            } else {
                              break L127;
                            }
                          }
                          var11++;
                          if (var32 == 0) {
                            continue L126;
                          } else {
                            break L81;
                          }
                        }
                      }
                    }
                  }
                }
                L128: while (true) {
                  ((tf) (Object) stackIn_527_0.field_Z).b(118);
                  L129: while (true) {
                    var11++;
                    if (var32 == 0) {
                      if (var11 >= 5) {
                        break L81;
                      } else {
                        if (var32 != 0) {
                          break L80;
                        } else {
                          stackIn_524_0 = null;
                          stackIn_524_1 = this.field_Nb[var11];
                          if (stackIn_524_0 != stackIn_524_1) {
                            stackIn_527_0 = this.field_Nb[var11];
                            continue L128;
                          } else {
                            continue L129;
                          }
                        }
                      }
                    } else {
                      break L81;
                    }
                  }
                }
              }
              if ((this.field_R ^ -1) >= -1) {
                break L80;
              } else {
                this.field_R = this.field_R - 1;
                break L80;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3_ref), "dj.S(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean i(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                this.a(-87, -78);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_A.field_K == null) {
                  break L3;
                } else {
                  if (this.field_A.field_x.field_r[-1 + this.field_A.field_x.field_a] < this.field_D) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_10_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.JA(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void g(int param0) {
        RuntimeException runtimeException = null;
        ka var2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        try {
          L0: {
            L1: {
              this.field_A.field_m.m(10959);
              this.field_A.field_m.field_D = this.field_A.field_m.field_O;
              this.field_A.field_m.field_E = this.field_A.field_m.field_T;
              this.field_A.field_m.field_t = this.field_A.field_m.field_L;
              this.field_A.field_m.field_X = new da(this.field_A.field_m.field_W);
              var2 = this.a((byte) 107, ri.field_b, 2.0);
              var2.field_M.field_w = this.field_C * 2.0;
              this.m(-1);
              this.h((byte) 94);
              this.d(false);
              if (this.field_A.field_L > 0) {
                var3 = this.field_A.field_A * this.field_A.field_A;
                var5 = this.field_E - this.field_A.field_s;
                var7 = this.field_t - this.field_A.field_r;
                var9 = -this.field_A.field_E + this.field_D;
                var11 = var7 * var7 + var5 * var5 + var9 * var9;
                if (var11 > var3) {
                  break L1;
                } else {
                  di.a(-30867, 245, 10);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 26402) {
                break L2;
              } else {
                this.field_Sb = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "dj.PA(" + param0 + ')');
        }
    }

    final void a(double param0, byte param1, double param2, double param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_Lb.a(param0, param3, param2, 47);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dj.MB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(mn param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (this.field_fb >= 16) {
                var3 = new double[12];
                this.field_jb.a((byte) 47, var3);
                ak.a((double)this.field_fb * 0.015625, var3, (dj) (this), 4825, this.field_qb, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-17 >= (this.field_lb ^ -1)) {
                var3 = new double[12];
                this.field_jb.a((byte) 34, var3);
                rf.a(param0, 0.015625 * (double)this.field_lb, this.field_pb, (dj) (this), var3, false);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_Bb.a(-96, param0);
            var3_int = 81 % ((param1 - -2) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("dj.OA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final boolean l(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = 29 / ((60 - param0) / 61);
            var3 = 0;
            L1: while (true) {
              L2: {
                if (-6 >= (var3 ^ -1)) {
                  break L2;
                } else {
                  if (null != this.field_Nb[var3]) {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  } else {
                    stackIn_5_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final double a(int param0, boolean param1, double param2) {
        RuntimeException var5 = null;
        double stackIn_13_0 = 0.0;
        double stackIn_15_0 = 0.0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 14170) {
                break L1;
              } else {
                this.a((pm) null, 126);
                break L1;
              }
            }
            L2: {
              if (this.field_A.field_y) {
                break L2;
              } else {
                if (this.field_A.field_i) {
                  break L2;
                } else {
                  if (this.field_Qb == 0) {
                    stackIn_13_0 = this.field_Bb.a(0, true, param1, param2);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_15_0 = 0.0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var5), "dj.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_15_0;
        }
    }

    final void c(boolean param0) {
        int fieldTemp$0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_40_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Confined.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_X = true;
                        if (this.field_A.field_y) {
                            statePc = 26;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != this.field_A.field_K) {
                            statePc = 26;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-1 <= (this.field_yb ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        fieldTemp$0 = this.field_xb - 1;
                        this.field_xb = this.field_xb - 1;
                        if (fieldTemp$0 <= 0) {
                            statePc = 26;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((this.field_yb ^ -1) < -1) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((this.field_A.field_x.field_a - 2 ^ -1) >= (var2_int ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_40_0 = (this.field_A.field_x.field_r[1 + var2_int] < this.field_D ? -1 : (this.field_A.field_x.field_r[1 + var2_int] == this.field_D ? 0 : 1));
                        stackIn_19_0 = stackIn_40_0;
                        if (var9 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 > 0) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var2_int++;
                        if (var9 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_A.field_x.b(3, var2_int, this.field_D);
                        var3 = 0.5 * (-Math.cos(0.026399938265460447 * (double)this.field_xb) + 1.0);
                        var5 = 0.5 * (1.0 - Math.cos(0.026399938265460447 * (double)(-1 + this.field_xb)));
                        var7 = var5 / var3;
                        this.field_E = this.field_A.field_x.field_B + (this.field_E - this.field_A.field_x.field_B) * var7;
                        this.field_t = this.field_A.field_x.field_G + var7 * (-this.field_A.field_x.field_G + this.field_t);
                        if (var9 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (this.field_Bb.field_b <= 8) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_Bb.field_d = 65536;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.field_Jb.a(0);
                        this.field_G = 0.0;
                        this.field_K = 0.0;
                        this.field_L = 0.0;
                        this.field_z = false;
                        this.field_Bb.field_i.d(209);
                        this.field_Bb.field_g.d(209);
                        var2_int = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (4 <= var2_int) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        this.field_Ab[var2_int].field_Q.d(209);
                        var2_int++;
                        if (var9 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var9 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_S.field_Q.d(209);
                        this.field_V.d(209);
                        this.field_db.d(209);
                        this.field_Cb.d(209);
                        this.field_yb = this.field_yb - 1;
                        rc.field_i = rc.field_i + 1;
                        this.field_Qb = 400;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_A.field_g.a((rk) (this), -1);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = param0 ? 1 : 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.a(-73, false, 0.5439863261272376);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw sd.a((Throwable) ((Object) var2), "dj.RA(" + param0 + ')');
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5) {
              stackIn_4_0 = 1;
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
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.TA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(cl param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -66 / ((param1 - -35) / 60);
            param0.a((dj) (this), (byte) 80);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("dj.I(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void d(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_X = true;
              if (!param0) {
                break L1;
              } else {
                this.field_Pb = 71;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((this.field_yb ^ -1) >= -1) {
                  break L3;
                } else {
                  this.field_xb = 120;
                  if (!Confined.field_J) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              hc.field_u = null;
              we.field_a = 0;
              of.field_a = true;
              sg.f((byte) 99);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.N(" + param0 + ')');
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 72) {
              L1: {
                if (param0.f(-96)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
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
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("dj.WA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
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
        try {
            this.field_kb = 0;
            this.field_ob = 0;
            this.field_Hb = 65536;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dj.NA(" + param0 + ')');
        }
    }

    final void a(boolean param0, ee param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (param1 instanceof wc) {
                  this.field_A.field_B.field_X = true;
                  break L1;
                } else {
                  break L1;
                }
              }
              super.a(param0, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("dj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        try {
            this.field_X = true;
            super.a(param0, param1, param2, param3, param4, param5, param6);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "dj.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -54) {
                break L1;
              } else {
                this.f(10);
                break L1;
              }
            }
            stackIn_4_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.EB(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
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
        int stackIn_82_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_130_0 = 0;
        Object stackIn_148_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (this.field_mb) {
                var2_int++;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.field_Eb) {
                break L2;
              } else {
                var2_int++;
                break L2;
              }
            }
            L3: {
              if (!this.field_Sb) {
                break L3;
              } else {
                var2_int++;
                break L3;
              }
            }
            L4: {
              if (!this.field_cb) {
                break L4;
              } else {
                var2_int++;
                break L4;
              }
            }
            L5: {
              if (this.field_eb) {
                var2_int++;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (this.field_rb) {
                var2_int++;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var2_int = var2_int + (this.field_ub + 3 >> -1394289502);
              var2_int = var2_int + (3 + this.field_tb >> 910997186);
              var2_int = var2_int + (3 + this.field_zb >> -439798910);
              var2_int = var2_int + this.field_ab;
              var2_int = var2_int + (this.field_Bb.field_b + -8);
              var3 = 3;
              if (!this.field_mb) {
                break L7;
              } else {
                incrementValue$0 = var2_int;
                var2_int--;
                if ((double)var3 > Math.random() * (double)incrementValue$0) {
                  this.field_mb = false;
                  var3--;
                  ri.a((rk) (this), param0 + 1, new cl(this.field_A, (dj) (this), 0));
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (!this.field_Eb) {
                break L8;
              } else {
                incrementValue$1 = var2_int;
                var2_int--;
                if ((double)var3 > Math.random() * (double)incrementValue$1) {
                  this.field_Eb = false;
                  var3--;
                  ri.a((rk) (this), param0 + 1, new cl(this.field_A, (dj) (this), 1));
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (!this.field_Sb) {
                break L9;
              } else {
                incrementValue$2 = var2_int;
                var2_int--;
                if (Math.random() * (double)incrementValue$2 < (double)var3) {
                  var3--;
                  this.field_Sb = false;
                  ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 2));
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (!this.field_cb) {
                break L10;
              } else {
                incrementValue$3 = var2_int;
                var2_int--;
                if ((double)incrementValue$3 * Math.random() >= (double)var3) {
                  break L10;
                } else {
                  var3--;
                  this.field_cb = false;
                  ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 3));
                  break L10;
                }
              }
            }
            L11: {
              if (!this.field_eb) {
                break L11;
              } else {
                incrementValue$4 = var2_int;
                var2_int--;
                if ((double)incrementValue$4 * Math.random() >= (double)var3) {
                  break L11;
                } else {
                  this.field_eb = false;
                  var3--;
                  ri.a((rk) (this), param0 + 1, new cl(this.field_A, (dj) (this), 5));
                  break L11;
                }
              }
            }
            L12: {
              if (!this.field_rb) {
                break L12;
              } else {
                incrementValue$5 = var2_int;
                var2_int--;
                if ((double)var3 > (double)incrementValue$5 * Math.random()) {
                  var3--;
                  this.field_rb = false;
                  ri.a((rk) (this), param0 ^ -1, new cl(this.field_A, (dj) (this), 4));
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if ((this.field_U ^ -1) >= -1) {
                break L13;
              } else {
                this.field_U = 0;
                ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 8));
                break L13;
              }
            }
            L14: {
              if (0 < this.field_Pb) {
                this.field_Pb = 0;
                ri.a((rk) (this), param0 + 1, new cl(this.field_A, (dj) (this), 7));
                break L14;
              } else {
                break L14;
              }
            }
            var4 = this.field_ub;
            L15: while (true) {
              L16: {
                L17: {
                  if ((var4 ^ -1) >= -1) {
                    break L17;
                  } else {
                    incrementValue$6 = var2_int;
                    var2_int--;
                    stackIn_82_0 = (Math.random() * (double)incrementValue$6 < (double)var3 ? -1 : (Math.random() * (double)incrementValue$6 == (double)var3 ? 0 : 1));

                    if (var5 != 0) {
                      break L16;
                    } else {
                      L18: {
                        if (stackIn_82_0 < 0) {
                          L19: {
                            this.field_ub = this.field_ub - 4;
                            var3--;
                            if (-1 >= (this.field_ub ^ -1)) {
                              break L19;
                            } else {
                              this.field_ub = 0;
                              break L19;
                            }
                          }
                          ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 10));
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      var4 -= 4;
                      if (var5 == 0) {
                        continue L15;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                stackIn_82_0 = this.field_tb;
                break L16;
              }
              var4 = stackIn_82_0;
              L20: while (true) {
                L21: {
                  L22: {
                    if (0 >= var4) {
                      break L22;
                    } else {
                      incrementValue$7 = var2_int;
                      var2_int--;
                      stackIn_97_0 = ((double)var3 < (double)incrementValue$7 * Math.random() ? -1 : ((double)var3 == (double)incrementValue$7 * Math.random() ? 0 : 1));

                      if (var5 != 0) {
                        break L21;
                      } else {
                        L23: {
                          if (stackIn_97_0 <= 0) {
                            break L23;
                          } else {
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
                            break L23;
                          }
                        }
                        var4 -= 4;
                        if (var5 == 0) {
                          continue L20;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  stackIn_97_0 = this.field_zb;
                  break L21;
                }
                var4 = stackIn_97_0;
                L25: while (true) {
                  L26: {
                    L27: {
                      if (0 >= var4) {
                        break L27;
                      } else {
                        incrementValue$8 = var2_int;
                        var2_int--;
                        stackIn_110_0 = ((double)var3 < Math.random() * (double)incrementValue$8 ? -1 : ((double)var3 == Math.random() * (double)incrementValue$8 ? 0 : 1));

                        if (var5 != 0) {
                          break L26;
                        } else {
                          L28: {
                            if (stackIn_110_0 > 0) {
                              L29: {
                                this.field_zb = this.field_zb - 4;
                                var3--;
                                if (0 <= this.field_zb) {
                                  break L29;
                                } else {
                                  this.field_zb = 0;
                                  break L29;
                                }
                              }
                              ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 12));
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          var4 -= 4;
                          if (var5 == 0) {
                            continue L25;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    stackIn_110_0 = this.field_ab;
                    break L26;
                  }
                  var4 = stackIn_110_0;
                  L30: while (true) {
                    L31: {
                      L32: {
                        if (var4 <= 0) {
                          break L32;
                        } else {
                          incrementValue$9 = var2_int;
                          var2_int--;
                          stackIn_120_0 = (Math.random() * (double)incrementValue$9 < (double)var3 ? -1 : (Math.random() * (double)incrementValue$9 == (double)var3 ? 0 : 1));

                          if (var5 != 0) {
                            break L31;
                          } else {
                            L33: {
                              if (stackIn_120_0 >= 0) {
                                break L33;
                              } else {
                                this.field_ab = this.field_ab - 1;
                                var3--;
                                ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 13));
                                break L33;
                              }
                            }
                            var4--;
                            if (var5 == 0) {
                              continue L30;
                            } else {
                              break L32;
                            }
                          }
                        }
                      }
                      stackIn_120_0 = this.field_Bb.field_b;
                      break L31;
                    }
                    var4 = stackIn_120_0;
                    L34: while (true) {
                      L35: {
                        L36: {
                          if ((var4 ^ -1) >= -9) {
                            break L36;
                          } else {
                            incrementValue$10 = var2_int;
                            var2_int--;
                            stackIn_130_0 = ((double)var3 < (double)incrementValue$10 * Math.random() ? -1 : ((double)var3 == (double)incrementValue$10 * Math.random() ? 0 : 1));

                            if (var5 != 0) {
                              break L35;
                            } else {
                              L37: {
                                if (stackIn_130_0 <= 0) {
                                  break L37;
                                } else {
                                  this.field_Bb.field_b = this.field_Bb.field_b - 1;
                                  var3--;
                                  ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 14));
                                  break L37;
                                }
                              }
                              var4--;
                              if (var5 == 0) {
                                continue L34;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                        stackIn_130_0 = -9;
                        break L35;
                      }
                      L38: {
                        if (stackIn_130_0 == (this.field_Bb.field_b ^ -1)) {
                          this.field_Bb.field_d = 0;
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      L39: {
                        if (this.field_ib > 0) {
                          this.field_ib = 0;
                          this.field_Bb.field_l = false;
                          var4 = 0;
                          L40: while (true) {
                            L41: {
                              L42: {
                                if (-6 >= (var4 ^ -1)) {
                                  break L42;
                                } else {
                                  stackIn_148_0 = this;

                                  if (var5 != 0) {
                                    break L41;
                                  } else {
                                    L43: {
                                      if (((dj) (this)).field_Nb[var4] != null) {
                                        this.field_Nb[var4].field_ab.field_l = false;
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                    var4++;
                                    if (var5 == 0) {
                                      continue L40;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                              }
                              stackIn_148_0 = this;
                              break L41;
                            }
                            ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 15));
                            break L39;
                          }
                        } else {
                          break L39;
                        }
                      }
                      L44: {
                        if ((this.field_Gb ^ -1) >= -1) {
                          break L44;
                        } else {
                          this.field_Gb = 0;
                          this.field_Kb = 0;
                          ri.a((rk) (this), param0 ^ -1, new cl(this.field_A, (dj) (this), 16));
                          break L44;
                        }
                      }
                      L45: {
                        if (param0 <= (this.field_R ^ -1)) {
                          break L45;
                        } else {
                          this.field_R = 0;
                          ri.a((rk) (this), 0, new cl(this.field_A, (dj) (this), 9));
                          break L45;
                        }
                      }
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.MA(" + param0 + ')');
        }
    }

    final double[] e(int param0) {
        RuntimeException var2 = null;
        double[] stackIn_2_0 = null;
        double[] stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 3008) {
              stackIn_4_0 = this.field_Lb.a(16777215);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (double[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(pm param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -81) {
                break L1;
              } else {
                this.a((mn) null, (byte) 65);
                break L1;
              }
            }
            param0.a((dj) (this), (byte) 80);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("dj.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("dj.CB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double[] var7 = null;
        int var7_int = 0;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double[] var14 = null;
        try {
          L0: {
            L1: {
              if (16 > this.field_fb) {
                break L1;
              } else {
                var7 = new double[12];
                this.field_jb.a((byte) 37, var7);
                qg.a(param1, this.field_fb, var7, (double)this.field_fb * 0.015625, param3, (dj) (this), 64);
                break L1;
              }
            }
            L2: {
              if ((this.field_lb ^ -1) > -17) {
                break L2;
              } else {
                var7 = new double[12];
                this.field_jb.a((byte) 114, var7);
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
                  var14 = new double[12];
                  this.field_jb.a((byte) 90, var14);
                  this.field_A.field_a.field_t = this.field_t + this.field_C * var14[10] * 2.0;
                  this.field_A.field_a.field_D = (this.field_D + 2.0 * (this.field_C * var14[11])) * 0.9 + var12 * 0.1;
                  this.field_A.field_a.field_E = this.field_E + 2.0 * (this.field_C * var14[9]);
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
              if ((4 & this.field_Qb ^ -1) != -1) {
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
            stackIn_35_0 = (RuntimeException) (var7_ref);

            stackIn_35_1 = new StringBuilder().append("dj.QA(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L10;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param4 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L11;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_36_0), stackIn_44_2 + ')');
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
