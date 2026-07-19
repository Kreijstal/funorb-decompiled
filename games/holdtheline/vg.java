/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends v implements ed, pi {
    private rm field_Q;
    private boolean field_S;
    static int field_G;
    static String field_L;
    private nk field_M;
    private rm field_F;
    private boolean field_O;
    private boolean field_I;
    static int field_J;
    static String field_K;
    static int field_P;
    private nk field_H;
    private rm field_N;
    static int field_T;
    private String field_R;

    public static void i(int param0) {
        if (param0 <= 0) {
            return;
        }
        field_L = null;
        field_K = null;
    }

    public final void a(nk param0, int param1) {
        try {
            int var3_int = -48 / ((-61 - param1) / 38);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "vg.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        String discarded$2 = null;
        L0: {
          L1: {
            if (rd.b(-106)) {
              break L1;
            } else {
              if (0 >= this.field_M.field_q.length()) {
                break L0;
              } else {
                if (0 >= this.field_H.field_q.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          mi.a(this.field_H.field_q, (byte) -60, this.field_M.field_q);
          break L0;
        }
        L2: {
          if (param0 == -23) {
            break L2;
          } else {
            discarded$2 = this.a(true);
            break L2;
          }
        }
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        kk var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ee var8 = null;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == -1542826527) {
                break L1;
              } else {
                field_K = (String) null;
                break L1;
              }
            }
            var4 = (kk) ((Object) rl.field_J.b((byte) 95));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                L3: {
                  if (null == var4.field_p) {
                    break L3;
                  } else {
                    if (!var4.field_p.b(89)) {
                      var4.d(0);
                      var4 = (kk) ((Object) rl.field_J.c((byte) -112));
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  var8 = var4.field_q;
                  if (null != ch.field_i) {
                    var6 = -ch.field_i.field_A.field_f + var8.field_A.field_f;
                    var5 = var8.field_A.field_h - ch.field_i.field_A.field_h;
                    var7 = var6 * var6 + var5 * var5;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-1 <= (var7 ^ -1)) {
                    var3 = 256;
                    var1_int = 2048;
                    var2 = 8192;
                    break L5;
                  } else {
                    L6: {
                      var9 = (float)Math.sqrt((double)var7);
                      var10 = -ch.field_i.field_t + var8.field_t;
                      var11 = -ch.field_i.field_x + var8.field_x;
                      var12 = (var11 * (float)var6 + (float)var5 * var10) / var9;
                      var12 = 160.0f / (160.0f + var12);
                      if (0.75f <= var12) {
                        break L6;
                      } else {
                        var12 = 0.75f;
                        break L6;
                      }
                    }
                    L7: {
                      if (var12 <= 1.25f) {
                        break L7;
                      } else {
                        var12 = 1.25f;
                        break L7;
                      }
                    }
                    L8: {
                      var3 = (int)(256.0f * var12);
                      var1_int = 128000 / (int)var9;
                      if (-1537 <= (var1_int ^ -1)) {
                        break L8;
                      } else {
                        var1_int = 1536;
                        break L8;
                      }
                    }
                    L9: {
                      if (192 <= var1_int) {
                        break L9;
                      } else {
                        var1_int = 192;
                        break L9;
                      }
                    }
                    var13 = (float)var5 / var9;
                    var2 = (int)(8192.0f * (1.0f + var13));
                    break L5;
                  }
                }
                L10: {
                  if (null == var4.field_p) {
                    var4.field_p = lg.a(var4.field_o, (byte) -68);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var4.field_p.b(pc.field_h * var4.field_n * var1_int >> -1212446192, true);
                var4.field_p.a(var2, -64);
                var4.field_p.a(var3, false);
                var4 = (kk) ((Object) rl.field_J.c((byte) 125));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "vg.L(" + param0 + ')');
        }
    }

    final void a(int param0, String param1) {
        boolean discarded$0 = false;
        nk var3 = null;
        String var4 = null;
        try {
            if (param0 >= -86) {
                discarded$0 = vg.b(false);
            }
            var3 = this.field_M;
            var4 = param1;
            var3.a(false, var4, 1471);
            this.field_H.o(1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "vg.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    vg(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (dh) null);
        dj dupTemp$2 = null;
        dj dupTemp$3 = null;
        RuntimeException var6 = null;
        mo var6_ref = null;
        qi var7 = null;
        String var8 = null;
        mf var9 = null;
        dj var12 = null;
        dj var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        rm stackIn_17_1 = null;
        rm stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        rm stackIn_18_1 = null;
        rm stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        rm stackIn_19_1 = null;
        rm stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_16_0 = null;
        rm stackOut_16_1 = null;
        rm stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        rm stackOut_18_1 = null;
        rm stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        rm stackOut_17_1 = null;
        rm stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              this.field_R = param1;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((vg) (this)).field_O = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((vg) (this)).field_I = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param4) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((vg) (this)).field_S = stackIn_10_1 != 0;
              if (!this.field_I) {
                break L4;
              } else {
                L5: {
                  if (this.field_O) {
                    break L5;
                  } else {
                    if (!this.field_S) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              this.field_M = (nk) ((Object) new jb(param0, (tb) (this), 100));
              this.field_H = (nk) ((Object) new jb("", (tb) (this), 20));
              if (!this.field_I) {
                L7: {
                  this.field_F = new rm(qh.field_c, (tb) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (this.field_S) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = ue.field_a;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = kn.field_i;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((vg) (this)).field_Q = new rm(stackIn_19_3, (tb) null);
                if (!this.field_O) {
                  break L6;
                } else {
                  this.field_N = new rm(fo.field_m, (tb) (this));
                  break L6;
                }
              } else {
                this.field_F = new rm(lg.field_p, (tb) null);
                this.field_Q = new rm(dl.field_n, (tb) null);
                this.field_M.field_D = false;
                break L6;
              }
            }
            L8: {
              this.field_M.field_l = (dh) ((Object) new kl(10000536));
              this.field_H.field_l = (dh) ((Object) new tl(10000536));
              var6_ref = new mo();
              this.field_F.field_l = (dh) ((Object) var6_ref);
              if (this.field_Q == null) {
                break L8;
              } else {
                this.field_Q.field_l = (dh) ((Object) var6_ref);
                break L8;
              }
            }
            L9: {
              this.field_M.field_z = gb.field_a;
              if (null == this.field_N) {
                break L9;
              } else {
                this.field_N.field_l = (dh) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              if (null == this.field_N) {
                break L10;
              } else {
                this.field_N.field_z = ml.field_b;
                break L10;
              }
            }
            L11: {
              if (this.field_I) {
                this.field_Q.field_z = fd.field_b;
                break L11;
              } else {
                if (this.field_S) {
                  this.field_Q.field_z = wc.field_j;
                  this.field_Q.field_l = (dh) ((Object) new am());
                  break L11;
                } else {
                  this.field_Q.field_l = (dh) ((Object) new am());
                  break L11;
                }
              }
            }
            L12: {
              this.field_o = 15;
              var7 = hl.field_g;
              if (this.field_R == null) {
                break L12;
              } else {
                this.field_o = this.field_o + (var7.b(this.field_R, this.field_x + -40, var7.field_G) - -5);
                break L12;
              }
            }
            L13: {
              var8 = rf.field_bb;
              var9 = jj.a(en.a(110), (byte) 124);
              if (var9 == ja.field_Wb) {
                var8 = rc.field_d;
                break L13;
              } else {
                if (var9 != gj.field_s) {
                  break L13;
                } else {
                  var8 = co.field_c;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$2 = new dj(10, this.field_o, -20 + this.field_x, 25, this.field_M, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.a(true, dupTemp$2);
              this.field_o = this.field_o + (((n) ((Object) var12)).field_u + 5);
              dupTemp$3 = new dj(10, this.field_o, this.field_x + -20, 25, this.field_H, false, 80, 3, var7, 16777215, lc.field_f);
              var13 = dupTemp$3;
              this.a(true, dupTemp$3);
              this.field_F.field_t = (tb) (this);
              this.field_o = this.field_o + (((n) ((Object) var13)).field_u - -5);
              if (this.field_N == null) {
                break L14;
              } else {
                this.field_N.field_t = (tb) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_Q) {
                break L15;
              } else {
                this.field_Q.field_t = (tb) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_N == null) {
                this.field_F.a(8, (byte) 122, this.field_o, 30, this.field_x + -6 + -10);
                this.field_o = this.field_o + 35;
                break L16;
              } else {
                this.field_F.a(85, (byte) 122, this.field_o, 30, this.field_x + -95);
                this.field_o = this.field_o + 60;
                break L16;
              }
            }
            L17: {
              if (this.field_N == null) {
                break L17;
              } else {
                this.field_N.a(8, (byte) 122, this.field_o, 30, -6 + this.field_x - 10);
                this.field_o = this.field_o + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_Q == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_I) {
                    break L19;
                  } else {
                    if (!this.field_S) {
                      this.field_Q.a(8, (byte) 122, this.field_o, 20, 40);
                      this.field_o = this.field_o + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_Q.a(8, (byte) 122, this.field_o, 30, this.field_x - 16);
                this.field_o = this.field_o + 35;
                break L18;
              }
            }
            L20: {
              this.a(0, (byte) 122, 0, this.field_o - -3, this.field_x);
              this.a(true, this.field_F);
              if (this.field_N == null) {
                break L20;
              } else {
                this.a(true, this.field_N);
                break L20;
              }
            }
            L21: {
              if (this.field_Q == null) {
                break L21;
              } else {
                this.a(true, this.field_Q);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("vg.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static hj a(int param0, int param1, vk param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        hj var6 = null;
        hj var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9_int = 0;
        wm var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        hj var16 = null;
        hj var17 = null;
        hj var18 = null;
        hj var19 = null;
        hj stackIn_10_0 = null;
        hj stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hj stackOut_26_0 = null;
        hj stackOut_9_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var15 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = param0;
            var5 = param0 * 3 / 4;
            var19 = new hj(var4_int, var5);
            var6 = var19;
            if ((param2.field_l ^ -1) == 0) {
              L1: {
                var7 = new hj(640, 480);
                vb.a(param3 ^ 12341, var7);
                dj.a(param1, param2, false);
                l.a(param3 ^ -17640, param2);
                if (param3 == -12392) {
                  break L1;
                } else {
                  vg.h(0);
                  break L1;
                }
              }
              var8 = -1;
              L2: while (true) {
                if (var8 > 3) {
                  var19.f();
                  var7.c(0, 0, var4_int, var5);
                  ug.b(-1);
                  stackOut_26_0 = (hj) (var6);
                  stackIn_27_0 = stackOut_26_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var9 = (wm) ((Object) param2.field_m.b((byte) 97));
                  L3: while (true) {
                    if (var9 == null) {
                      var9 = (wm) ((Object) param2.field_k.b((byte) 123));
                      L4: while (true) {
                        if (var9 == null) {
                          var8++;
                          continue L2;
                        } else {
                          L5: {
                            if (var9.field_q != var8) {
                              break L5;
                            } else {
                              var18 = var9.a((byte) -121);
                              var18.a(var9.field_A.field_h + -(var18.field_s >> -1542826527), var9.field_A.field_f - (var18.field_y >> -2093008095));
                              break L5;
                            }
                          }
                          var9 = (wm) ((Object) param2.field_k.c((byte) 96));
                          continue L4;
                        }
                      }
                    } else {
                      L6: {
                        if (var8 != var9.field_q) {
                          break L6;
                        } else {
                          var17 = var9.a((byte) -124);
                          var17.a(-(var17.field_s >> -464967903) + var9.field_A.field_h, var9.field_A.field_f + -(var17.field_y >> -916041663));
                          break L6;
                        }
                      }
                      var9 = (wm) ((Object) param2.field_m.c((byte) -122));
                      continue L3;
                    }
                  }
                }
              }
            } else {
              L7: {
                var16 = new hj(var4_int, var5);
                var6 = var16;
                vb.a(-55, var16);
                var7_int = var5 * 3 / 4;
                var8 = var7_int * 3 / 4;
                if (param2.field_r) {
                  if (-129 <= (var5 ^ -1)) {
                    kj.field_q.d(-var5 + var4_int >> -9931359, 0, var5, var5);
                    break L7;
                  } else {
                    kj.field_q.a(-128 + var4_int >> -2095396511, var5 + -128 >> -849248351);
                    break L7;
                  }
                } else {
                  ra.field_hb.a((var4_int - var8) / 2, 3 * var5 / 16, var8, var7_int);
                  var9_int = var5 / 16;
                  var10 = var4_int / 2;
                  var11 = -(var9_int / 4) + var4_int / 2 - var10 / 2;
                  var12 = 3 * var5 / 16 + -(var9_int / 2);
                  var13 = 0;
                  L8: while (true) {
                    if (var13 >= var9_int) {
                      break L7;
                    } else {
                      var14 = var10 * param2.field_l >> 2008908776;
                      tc.b(var13 / 2 + var11, -var13 + var12, var14, 12517567);
                      tc.b(var14 + var13 / 2 + var11, var12 + -var13, -var14 + var10, 7274607);
                      var13++;
                      continue L8;
                    }
                  }
                }
              }
              ug.b(-1);
              stackOut_9_0 = (hj) (var16);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("vg.S(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_27_0;
        }
    }

    final void j(int param0) {
        this.field_M.o(1);
        if (param0 != 10) {
            this.field_M = (nk) null;
        }
        this.field_H.o(1);
    }

    final static boolean b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_L = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == hh.field_c) {
              break L2;
            } else {
              if (!hh.field_c.a(true)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param1 ^ -1)) {
                stackOut_6_0 = this.c(param0, param2 + 77);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 != (param1 ^ -1)) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_9_0 = this.b(param0, 116);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("vg.T(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    final String a(boolean param0) {
        if (param0) {
            return (String) null;
        }
        if (!(null != this.field_M.field_q)) {
            return "";
        }
        return this.field_M.field_q;
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param2 == -4) {
                break L1;
              } else {
                this.a((byte) -70);
                break L1;
              }
            }
            L2: {
              if (param1 != this.field_F) {
                if (param1 != this.field_N) {
                  if (param1 != this.field_Q) {
                    break L2;
                  } else {
                    if (this.field_I) {
                      cf.h(-110);
                      break L2;
                    } else {
                      if (this.field_S) {
                        og.a((byte) 44);
                        break L2;
                      } else {
                        hk.a(-30500);
                        break L2;
                      }
                    }
                  }
                } else {
                  qj.h((byte) 124);
                  break L2;
                }
              } else {
                this.a((byte) -23);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("vg.M(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(byte param0, nk param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 19) {
                break L1;
              } else {
                field_K = (String) null;
                break L1;
              }
            }
            L2: {
              if (this.field_M != param1) {
                break L2;
              } else {
                discarded$2 = this.field_H.a((n) (this), -25823);
                break L2;
              }
            }
            L3: {
              if (this.field_H != param1) {
                break L3;
              } else {
                this.a((byte) -23);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("vg.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        if (!(null == this.field_R)) {
            discarded$0 = hl.field_g.a(this.field_R, 20 + param2 - -this.field_k, 15 + (param1 - -this.field_o), this.field_x - 40, this.field_u, 16777215, -1, 1, 0, hl.field_g.field_G);
        }
        if (!(null == this.field_N)) {
            tc.b(10 + param2, 134 + param1, -20 + this.field_x, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    static {
        field_L = "Placing first in a race earns you <col=1>5</col> championship points; placing second, <col=1>3</col> points; third, <col=1>1</col> point.<br><br>You must finish in <col=1>first or second</col> place to qualify for the next race, otherwise you must retry the course. You can only retry <col=1>3</col> times during a championship. After completing all four races, you have finished the championship and can attempt the next one!<br><br>After playing all <col=1>four courses</col> in each championship, your total time will be added to the highscores table.";
        field_K = "Machine gun";
    }
}
