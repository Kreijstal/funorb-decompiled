/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gj extends dfa {
    int field_L;
    int field_db;
    fs field_e;
    jo field_s;
    sfa field_Z;
    private int[] field_v;
    private boolean field_eb;
    int field_u;
    private ng field_W;
    int[] field_T;
    eaa field_fb;
    private int field_B;
    eaa field_j;
    private int field_t;
    static kv field_F;
    int field_U;
    private boolean field_d;
    private sna field_bb;
    private eaa field_X;
    int field_p;
    ad field_P;
    sfa[] field_Y;
    private boolean field_Q;
    private int field_f;
    private pfa field_A;
    boolean field_l;
    ad[][] field_o;
    private int field_H;
    boolean field_m;
    private int field_I;
    boolean field_w;
    int field_g;
    int field_k;
    private int field_R;
    private sna field_C;
    private kv field_x;
    private int field_q;
    ad[] field_G;
    boolean field_J;
    boolean field_r;
    int field_M;
    kj[][] field_D;
    private sna field_z;
    int field_n;
    op field_h;
    boolean field_ab;
    private int field_K;
    int field_V;
    boolean field_cb;
    private int field_N;
    private sna field_O;
    private eaa field_S;
    private int field_i;
    private up field_y;
    private int field_E;

    final void a(ad param0, byte param1) {
        if (param0 == null) {
            return;
        }
        try {
            if (param1 != -52) {
                ad var4 = (ad) null;
                this.a(-9, (ad) null, -49);
            }
            this.a(param1 + 8007);
            if (this.field_A == null) {
                this.field_A = new pfa((gj) (this), this.field_z, param0);
            }
            this.field_A.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gj.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void s(int param0) {
        int var2 = 0;
        int var3 = 0;
        kj var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (this.field_h.field_z <= var2) {
            L1: {
              if (param0 == 32307) {
                break L1;
              } else {
                this.field_K = -53;
                break L1;
              }
            }
            return;
          } else {
            var3 = 0;
            L2: while (true) {
              if (var3 >= this.field_h.field_B) {
                var2++;
                continue L0;
              } else {
                var4 = this.field_D[var2][var3];
                if (var4 != null) {
                  if (var4.b(74)) {
                    this.field_D[var2][var3] = var4.field_b;
                    var3++;
                    continue L2;
                  } else {
                    var3++;
                    continue L2;
                  }
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void m(int param0) {
        qm.a(param0, 7758);
        this.field_l = false;
        lf.field_c = 1;
        this.field_J = false;
        this.field_ab = false;
        this.field_P = null;
        this.field_w = false;
        this.field_Z = null;
    }

    final int a(int param0, int param1, int param2) {
        if (param0 != -18254) {
            this.b(-102, 39);
        }
        return this.field_h.field_a[param2][param1].field_n;
    }

    private final void q(int param0) {
        at var3 = null;
        vca var4 = null;
        ad[][] var5 = null;
        int var6 = 0;
        ad[] var7 = null;
        ad[] var8 = null;
        int var9 = 0;
        ad var10 = null;
        int var11 = 0;
        int var12 = 0;
        tia var13 = null;
        var12 = BachelorFridge.field_y;
        this.s(32307);
        var13 = (tia) ((Object) this.field_fb.b((byte) 90));
        L0: while (true) {
          if (var13 == null) {
            L1: {
              var3 = (at) ((Object) this.field_j.b((byte) 90));
              if (var3 != null) {
                if (!var3.b(21807)) {
                  break L1;
                } else {
                  var3.a(false);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var4 = (vca) ((Object) this.field_S.b((byte) 90));
            L2: while (true) {
              if (var4 == null) {
                if (null != this.field_o) {
                  var5 = this.field_o;
                  if (param0 == 17) {
                    var6 = 0;
                    L3: while (true) {
                      if (var5.length <= var6) {
                        return;
                      } else {
                        var7 = var5[var6];
                        if (var7 != null) {
                          var8 = var7;
                          var9 = 0;
                          L4: while (true) {
                            if (var9 < var8.length) {
                              var10 = var8[var9];
                              if (var10 != null) {
                                L5: {
                                  var10.a(104);
                                  var11 = 1;
                                  if (39 != var10.field_s.field_y) {
                                    break L5;
                                  } else {
                                    var11 = 0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (17 == var10.field_s.field_y) {
                                    var11 = 2;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                L7: {
                                  if (28 != var10.field_s.field_y) {
                                    break L7;
                                  } else {
                                    var11 = 3;
                                    break L7;
                                  }
                                }
                                L8: while (true) {
                                  var11--;
                                  if (0 <= var11) {
                                    var10.field_f.c(11);
                                    if (var10.field_f.field_u.field_e) {
                                      var10.b(false);
                                      continue L8;
                                    } else {
                                      continue L8;
                                    }
                                  } else {
                                    var9++;
                                    continue L4;
                                  }
                                }
                              } else {
                                var9++;
                                continue L4;
                              }
                            } else {
                              var6++;
                              continue L3;
                            }
                          }
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L9: {
                  if (!var4.b(false)) {
                    break L9;
                  } else {
                    var4.a(false);
                    break L9;
                  }
                }
                var4 = (vca) ((Object) this.field_S.c(0));
                continue L2;
              }
            }
          } else {
            L10: {
              if (var13.a(-59)) {
                break L10;
              } else {
                var13.a(false);
                break L10;
              }
            }
            var13 = (tia) ((Object) this.field_fb.c(0));
            continue L0;
          }
        }
    }

    private final void a(boolean param0, ad param1) {
        RuntimeException runtimeException = null;
        op var4 = null;
        aj var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              this.m(10);
              if (!param0) {
                break L1;
              } else {
                var4 = (op) null;
                this.a((rk[]) null, (op) null, -93, 119);
                break L1;
              }
            }
            L2: {
              this.field_P = param1;
              if (this.field_P == null) {
                break L2;
              } else {
                qm.a(33, 7758);
                this.field_q = param1.field_s.field_x;
                this.field_E = param1.field_s.field_J;
                this.field_s.a((byte) -57, param1.field_s.field_J, param1.field_s.field_x);
                var5 = this.field_s.a(param1.field_s.field_J, (byte) -91, param1.field_s.field_x);
                this.field_W.c(-80 + var5.field_a, -40 + var5.field_c, -40);
                this.field_J = true;
                this.field_f = 5;
                uca.a(20, (byte) -63);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("gj.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final void a(int param0, ad param1, int param2, int param3, ad param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ema var10 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = param4.field_s.field_x;
              var7 = param4.field_s.field_J;
              if (-44 == (param4.field_s.field_y ^ -1)) {
                var8 = 0;
                L2: while (true) {
                  if (param2 <= var8) {
                    break L1;
                  } else {
                    L3: {
                      if (2 != param3) {
                        if (param3 != 4) {
                          if (1 != param3) {
                            if (3 == param3) {
                              this.field_h.b((byte) -72, 29, param4.field_s.field_x, param4.field_s.field_J - -var8);
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            this.field_h.b((byte) -122, 29, param4.field_s.field_x, param4.field_s.field_J + -var8);
                            break L3;
                          }
                        } else {
                          this.field_h.b((byte) 66, 29, param4.field_s.field_x + var8, param4.field_s.field_J);
                          break L3;
                        }
                      } else {
                        this.field_h.b((byte) -76, 29, param4.field_s.field_x - var8, param4.field_s.field_J);
                        break L3;
                      }
                    }
                    var8++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (2 == param3) {
                var6_int = var6_int - param2;
                break L4;
              } else {
                if ((param3 ^ -1) == -5) {
                  var6_int = var6_int + param2;
                  break L4;
                } else {
                  if ((param3 ^ -1) == -2) {
                    var7 = var7 - param2;
                    break L4;
                  } else {
                    if (-4 != (param3 ^ -1)) {
                      break L4;
                    } else {
                      var7 = var7 + param2;
                      break L4;
                    }
                  }
                }
              }
            }
            L5: {
              if (param0 == 132) {
                break L5;
              } else {
                var10 = (ema) null;
                gj.a((byte) 117, (ema) null);
                break L5;
              }
            }
            L6: {
              if ((param4.field_s.field_y ^ -1) != -41) {
                break L6;
              } else {
                param4.field_s.field_y = 0;
                break L6;
              }
            }
            this.a(param4, var7, param1, var6_int, (byte) -97);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var6);
            stackOut_29_1 = new StringBuilder().append("gj.PB(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          L8: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
    }

    private final void a(int param0, kv param1) {
        try {
            if (param0 != 3) {
                this.field_K = 121;
            }
            this.field_S.a(new vca(param1, 20, 30, 50), true);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gj.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ad b(aga param0, int param1) {
        ad var3 = null;
        RuntimeException var3_ref = null;
        ad stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ad stackOut_5_0 = null;
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
            if (param0 != null) {
              L1: {
                var3 = this.field_o[param0.field_D][param0.field_u];
                if (param1 == -23990) {
                  break L1;
                } else {
                  this.field_m = true;
                  break L1;
                }
              }
              stackOut_5_0 = (ad) (var3);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("gj.LB(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void b(int param0, boolean param1) {
        boolean discarded$3 = false;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        vca var8 = null;
        fea stackIn_56_0 = null;
        String stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        fea stackIn_57_0 = null;
        String stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        fea stackIn_58_0 = null;
        String stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        int stackIn_58_4 = 0;
        fea stackOut_55_0 = null;
        String stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        fea stackOut_57_0 = null;
        String stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        fea stackOut_56_0 = null;
        String stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        int stackOut_56_4 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          dg.d();
          dg.a(0, 0, 640, i.field_a.field_rb);
          if (param0 >= 29) {
            break L0;
          } else {
            var7 = (aga) null;
            discarded$3 = this.a((aga) null, -122);
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != this.field_h.field_A) {
              break L2;
            } else {
              if (0 == this.field_K) {
                L3: {
                  if ((this.field_n ^ -1) <= -1) {
                    this.field_y.a(65793);
                    break L3;
                  } else {
                    ew.field_r.e(120, 100);
                    discarded$4 = jha.field_g.a(cba.field_b, 230, 160, 200, 200, 16777215, -1, 1, 0, 14);
                    break L3;
                  }
                }
                if (null == this.field_A) {
                  break L1;
                } else {
                  this.field_A.a(false);
                  break L1;
                }
              } else {
                break L2;
              }
            }
          }
          L4: {
            if (null == this.field_s) {
              break L4;
            } else {
              this.field_s.c(-32095);
              break L4;
            }
          }
          L5: {
            this.g((byte) -86);
            if (this.field_M == 0) {
              break L5;
            } else {
              L6: {
                qn.field_g.e(-qn.field_g.field_q + 640, 0);
                if (-1 < (this.field_n ^ -1)) {
                  break L6;
                } else {
                  if (this.field_cb) {
                    break L6;
                  } else {
                    var3 = (int)(Math.sin((double)dj.field_c.field_L / 10.0 * 0.5) * 5.0);
                    var4 = 1;
                    var5 = 0;
                    L7: while (true) {
                      if (var5 >= this.field_G.length) {
                        L8: {
                          if (var4 == 0) {
                            break L8;
                          } else {
                            this.field_x.e(-8 + (this.field_C.field_kb + -(var3 >> -925336095)), -(var3 >> 851710049) + this.field_C.field_rb - 7, var3 + 16 + this.field_C.field_sb, this.field_C.field_p + (16 + var3), 256);
                            break L8;
                          }
                        }
                        L9: {
                          ica.field_t.e(574, 64);
                          if (this.field_C.field_T) {
                            fla.field_s.e(574, 64);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        discarded$5 = b.field_t.a(ms.field_q, 580, 41, 40, 30, 0, -1, 1, 0, 10);
                        break L6;
                      } else {
                        if (null != this.field_G[var5]) {
                          if (!this.field_G[var5].field_l) {
                            var4 = 0;
                            var5++;
                            continue L7;
                          } else {
                            var5++;
                            continue L7;
                          }
                        } else {
                          var5++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
              L10: {
                if (null == this.field_G) {
                  break L10;
                } else {
                  this.g(-1);
                  break L10;
                }
              }
              L11: {
                if ((this.field_n ^ -1) > -1) {
                  fb.field_r.e(-fb.field_r.field_q + b.field_t.a(pj.field_a) - -20, 5);
                  b.field_t.c(pj.field_a, 5, -8 + b.field_t.field_u, 0, -1);
                  break L11;
                } else {
                  break L11;
                }
              }
              if (this.field_Y == null) {
                break L5;
              } else {
                if (this.field_Y[0] != null) {
                  this.e((byte) 93);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
          }
          L12: {
            if (-1 == (this.field_M ^ -1)) {
              break L12;
            } else {
              this.b(-92);
              break L12;
            }
          }
          L13: {
            this.g((byte) -63);
            dg.a(0, 0, 640, i.field_a.field_rb);
            if (!this.field_eb) {
              break L13;
            } else {
              this.field_O.a(true, 7802);
              break L13;
            }
          }
          L14: {
            if (null == this.field_P) {
              break L14;
            } else {
              if (!this.field_J) {
                break L14;
              } else {
                if ((this.field_P.field_s.field_I ^ -1) >= -1) {
                  break L14;
                } else {
                  this.field_W.a(0, -98, -10);
                  break L14;
                }
              }
            }
          }
          var8 = (vca) ((Object) this.field_S.b((byte) 90));
          L15: while (true) {
            if (var8 == null) {
              if (!this.field_e.field_a) {
                break L1;
              } else {
                L16: {
                  nna.field_w.e(0, -nna.field_w.field_p + i.field_a.field_rb);
                  var4 = 16776960;
                  if (wma.field_b <= 0) {
                    break L16;
                  } else {
                    if ((this.field_L % 40 ^ -1) >= -21) {
                      break L16;
                    } else {
                      var4 = 16711680;
                      break L16;
                    }
                  }
                }
                ej.a(38, var4, pn.field_e, true, 12 + (-nna.field_w.field_p + i.field_a.field_rb - -jha.field_g.field_u), -100);
                break L1;
              }
            } else {
              var8.a(240, 320, false);
              var8 = (vca) ((Object) this.field_S.c(0));
              continue L15;
            }
          }
        }
        L17: {
          if (hea.field_r >= 2) {
            L18: {
              var3 = this.field_h.c((byte) -10);
              jha.field_g.a("Client: " + Integer.toHexString(var3), 320, 20, 8421631, -1);
              jha.field_g.a("Server: " + Integer.toHexString(this.field_g), 320, 40, 8421504, -1);
              var4 = var3 ^ this.field_g;
              stackOut_55_0 = jha.field_g;
              stackOut_55_1 = "Diff: " + Integer.toHexString(var4);
              stackOut_55_2 = 320;
              stackOut_55_3 = 60;
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              stackIn_57_3 = stackOut_55_3;
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              stackIn_56_3 = stackOut_55_3;
              if (var4 == 0) {
                stackOut_57_0 = (fea) ((Object) stackIn_57_0);
                stackOut_57_1 = (String) ((Object) stackIn_57_1);
                stackOut_57_2 = stackIn_57_2;
                stackOut_57_3 = stackIn_57_3;
                stackOut_57_4 = 8421504;
                stackIn_58_0 = stackOut_57_0;
                stackIn_58_1 = stackOut_57_1;
                stackIn_58_2 = stackOut_57_2;
                stackIn_58_3 = stackOut_57_3;
                stackIn_58_4 = stackOut_57_4;
                break L18;
              } else {
                stackOut_56_0 = (fea) ((Object) stackIn_56_0);
                stackOut_56_1 = (String) ((Object) stackIn_56_1);
                stackOut_56_2 = stackIn_56_2;
                stackOut_56_3 = stackIn_56_3;
                stackOut_56_4 = 16711680;
                stackIn_58_0 = stackOut_56_0;
                stackIn_58_1 = stackOut_56_1;
                stackIn_58_2 = stackOut_56_2;
                stackIn_58_3 = stackOut_56_3;
                stackIn_58_4 = stackOut_56_4;
                break L18;
              }
            }
            ((fea) (Object) stackIn_58_0).a(stackIn_58_1, stackIn_58_2, stackIn_58_3, stackIn_58_4, -1);
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          dg.c();
          if (this.field_d) {
            this.f(8910);
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          if (null != this.field_A) {
            this.field_A.a(false);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (af.field_a) {
            kla.b(true);
            break L21;
          } else {
            break L21;
          }
        }
    }

    final void c(boolean param0) {
        sfa discarded$0 = null;
        this.field_M = !this.field_h.field_N ? 1 : 2;
        uca.a(23, (byte) -54);
        if (!(this.field_h.field_e > 0)) {
            uca.a(29, (byte) 111);
        }
        this.d((byte) 52);
        if (param0) {
            ad var3 = (ad) null;
            discarded$0 = this.b((ad) null, false);
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 30996) {
            return;
        }
        this.field_h.field_a[param1][param2].field_m = true;
        uea var4 = new uea((gj) (this), param1, param2, 16711680);
        ((kj) ((Object) var4)).a(0);
    }

    private final boolean a(ad param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (this.field_h.field_o == 3) {
              if (this.field_h.a((byte) -124, param0.field_s.field_D, param0.field_s.field_x, param0.field_s.field_J)) {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    this.n(-89);
                    break L1;
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("gj.EB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    private final void d(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        t var8 = null;
        int var9 = 0;
        ad var10 = null;
        var9 = BachelorFridge.field_y;
        var10 = this.field_G[this.field_Z.field_h.field_f];
        this.field_H = this.field_s.field_h;
        this.field_N = this.field_s.field_s;
        if (0 > this.field_N) {
          return;
        } else {
          L0: {
            if (this.field_h.field_z <= this.field_N) {
              break L0;
            } else {
              if (-1 < (this.field_H ^ -1)) {
                break L0;
              } else {
                if (this.field_h.field_B <= this.field_H) {
                  break L0;
                } else {
                  L1: {
                    var3 = 124 % ((-58 - param0) / 54);
                    var4 = var10.field_s.field_x;
                    var5 = var10.field_s.field_J;
                    var6 = un.a(126, this.field_H + -var5, this.field_N - var4);
                    var7 = 0;
                    if (-1 == (this.field_N - var4 ^ -1)) {
                      var7 = Math.abs(-var5 + this.field_H);
                      break L1;
                    } else {
                      if (0 != -var5 + this.field_H) {
                        var7 = 255;
                        break L1;
                      } else {
                        var7 = Math.abs(this.field_N - var4);
                        break L1;
                      }
                    }
                  }
                  L2: {
                    var8 = (t) ((Object) al.a(-98, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]));
                    if (var7 >= var8.field_w) {
                      if (var10.field_s.c(87, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]) < var7) {
                        this.m(10);
                        break L2;
                      } else {
                        L3: {
                          L4: {
                            if ((var8.field_j ^ -1) == -81) {
                              break L4;
                            } else {
                              if (var8.field_j != 81) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (this.field_h.field_a[this.field_N][this.field_H].field_l == null) {
                            break L3;
                          } else {
                            this.m(10);
                            lf.field_c = 0;
                            this.field_f = 5;
                            return;
                          }
                        }
                        L5: {
                          if (var8.field_p == 2) {
                            var7++;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (var8.field_p == 3) {
                            var7++;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (0 == var6) {
                            break L7;
                          } else {
                            this.field_P.field_s.field_s = var6;
                            break L7;
                          }
                        }
                        ((hia) ((Object) this.field_Z)).field_j = var6;
                        ((hia) ((Object) this.field_Z)).field_k = var7 - 1;
                        this.k(-1);
                        this.field_ab = false;
                        uca.a(25, (byte) 114);
                        break L2;
                      }
                    } else {
                      this.m(10);
                      break L2;
                    }
                  }
                  lf.field_c = 0;
                  this.field_f = 5;
                  return;
                }
              }
            }
          }
          return;
        }
    }

    private final boolean i(int param0) {
        ad discarded$0 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        if (param0 <= 76) {
            ad var5 = (ad) null;
            discarded$0 = this.a(28, (ad) null);
        }
        for (var2 = 0; this.field_h.field_z > var2; var2++) {
            for (var3 = 0; var3 < this.field_h.field_B; var3++) {
                if (null != this.field_D[var2][var3]) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void e(byte param0) {
        int var2 = 0;
        sfa var3 = null;
        oha var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        if (param0 > 90) {
          L0: {
            if (this.field_K <= 0) {
              break L0;
            } else {
              if (this.field_Y[0] != null) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= this.field_Y.length) {
                    break L0;
                  } else {
                    var3 = this.field_Y[var2];
                    if (var3 != null) {
                      var4 = al.a(-110, var3.field_g);
                      hh.field_b[var4.field_h].e(var3.field_h.field_f * 39 + 16, 28);
                      if (hh.field_b[var4.field_h].a(39 * var3.field_h.field_f + 16, 28, mk.field_p, gd.field_m)) {
                        var5 = 640;
                        var6 = 480;
                        var7 = 4 + mk.field_p;
                        var8 = gd.field_m + 4;
                        sd.a(this.field_G[var3.field_h.field_f].field_s.a(var4, -5313), var7, var4, (byte) 74, var8, var5, var6);
                        var2++;
                        continue L1;
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        sfa discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ad var8 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          var2 = 0;
          if (this.field_h.field_J > this.field_h.field_A) {
            var2 = ad.field_h.a(cd.field_o[this.field_h.field_o + -1]);
            break L0;
          } else {
            var2 = Math.max(ad.field_h.a(cd.field_o[this.field_h.field_o + -1]), ad.field_h.a(tw.field_b));
            break L0;
          }
        }
        L1: {
          dg.a(635 + (-var2 - 10), -eja.field_w.field_p + i.field_a.field_rb - 26, var2 - -20, 32, 7, 65793, 128);
          if (this.field_h.field_J <= this.field_h.field_A) {
            ad.field_h.b(tw.field_b, 630, i.field_a.field_rb + -eja.field_w.field_p + -12, 0, -1);
            break L1;
          } else {
            ad.field_h.b(lga.a(true, new String[]{Integer.toString((this.field_h.field_A - 1) / 2 - -1), Integer.toString(this.field_h.field_J / 2)}, eb.field_q), 630, -12 + i.field_a.field_rb - eja.field_w.field_p, 0, -1);
            break L1;
          }
        }
        L2: {
          if (param0 <= -61) {
            break L2;
          } else {
            var8 = (ad) null;
            discarded$1 = this.b((ad) null, true);
            break L2;
          }
        }
        ad.field_h.b(cd.field_o[-1 + this.field_h.field_o], 630, -eja.field_w.field_p + i.field_a.field_rb, 0, -1);
        var3 = -(this.field_h.field_d * 132) + 592;
        eja.field_w.e(var3, 4 + -eja.field_w.field_p + i.field_a.field_rb);
        var4 = 0;
        L3: while (true) {
          if (var4 >= this.field_h.field_d) {
            return;
          } else {
            L4: {
              var5 = var4 * 132 + 40;
              b.field_t.a(this.field_h.field_y[var4], var3 + (var5 + 67), 10 + -eja.field_w.field_p + (i.field_a.field_rb - -12), var4 + 2, -1);
              dg.a(7 + (var3 + var5), 14 + -eja.field_w.field_p + i.field_a.field_rb + 10, 130, 16, 7, 65793, 128);
              if ((this.field_h.field_o ^ -1) != -2) {
                if (this.field_h.field_o != 2) {
                  if (3 != this.field_h.field_o) {
                    break L4;
                  } else {
                    var6 = 0;
                    L5: while (true) {
                      if (var6 >= this.field_h.field_C[var4]) {
                        break L4;
                      } else {
                        ela.field_j[0].a(var6 * 14 + var3 + (var5 + 10), 12 + i.field_a.field_rb + (-eja.field_w.field_p + 10));
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  var6 = 0;
                  L6: while (true) {
                    if (var6 >= this.field_T[var4]) {
                      break L4;
                    } else {
                      sj.field_k[0].a(10 + var5 + var3 - -(var6 * 14), -eja.field_w.field_p + i.field_a.field_rb + 22);
                      var6++;
                      continue L6;
                    }
                  }
                }
              } else {
                var6 = 0;
                L7: while (true) {
                  if (7 <= var6) {
                    break L4;
                  } else {
                    if (this.field_h.field_S[var4].field_b[var6] != null) {
                      if (this.field_h.field_S[var4].field_b[var6].i(-124)) {
                        kn.field_g.c(18 * var6 + (var3 + var5 - -12), 27 + -eja.field_w.field_p + i.field_a.field_rb, kn.field_g.field_q >> -1849158335, kn.field_g.field_p >> -1649755039, 192);
                        var6++;
                        continue L7;
                      } else {
                        this.field_o[var4][var6].field_f.a(1024, 10 + (-eja.field_w.field_p + i.field_a.field_rb + -12), 256, 8, 1024, 18 * var6 + var3 + var5 - 20);
                        var6++;
                        continue L7;
                      }
                    } else {
                      var6++;
                      continue L7;
                    }
                  }
                }
              }
            }
            if (this.field_h.a((byte) -60, var4)) {
              b.field_t.a(lga.a(true, new String[]{this.field_h.field_y[var4]}, ts.field_p), 72 + var3 + (var5 - 5), 50 + i.field_a.field_rb - eja.field_w.field_p, 0, -1);
              var4++;
              continue L3;
            } else {
              if (this.field_h.b((byte) 106, var4)) {
                b.field_t.a(cka.field_w, 72 + (-5 + var5 - -var3), 26 + (-eja.field_w.field_p + (i.field_a.field_rb + 24)), 0, -1);
                var4++;
                continue L3;
              } else {
                if (this.field_h.field_S[var4].field_c) {
                  b.field_t.a(cf.field_a, 72 + (-5 + var3 + var5), 50 + (i.field_a.field_rb + -eja.field_w.field_p), 0, -1);
                  var4++;
                  continue L3;
                } else {
                  var4++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, rk[] param1) {
        try {
            this.field_z = mka.a(13558251, param0, 13558251, (byte) -128, jha.field_g, 13558251, 16777215, 13558251);
            this.field_z.field_db = op.field_I;
            this.field_z.field_eb = wd.field_w;
            this.field_z.field_A = bla.field_p;
            this.field_z.field_N = 1;
            this.field_z.field_B = 12;
            this.field_W = new ng((gj) (this), this.field_z);
            if (param1 != null) {
                this.field_y = new up((gj) (this), this.field_z, param1);
            }
            this.field_C = new sna("endturn", this.field_z, 574, 64, 50, 24, ms.field_q);
            this.field_O = new sna("cancelorder", (sna) null, 15, 125, 32, 32, "");
            this.field_O.field_v = hh.field_b[2];
            this.field_bb = new sna("abortorder", (sna) null, 15, 125, 16, 16, "");
            this.field_bb.field_v = fe.field_j;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gj.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, byte param1, gm param2, int param3) {
        if (param1 != -88) {
            return;
        }
        try {
            if (param0) {
                param2.field_i = (param3 ^ -1) < -1 ? 3 : 1;
            } else {
                param2.field_i = -1 > (param3 ^ -1) ? 4 : 2;
            }
            param2.field_l = Math.abs(param3);
            this.field_P.field_s.field_s = param2.field_i;
            this.k(-1);
            this.field_l = false;
            uca.a(21, (byte) 122);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gj.TA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        boolean discarded$1 = false;
        int var3 = 0;
        at var4_ref_at = null;
        int var4 = 0;
        int var5 = 0;
        cj var6 = null;
        eaa stackIn_24_0 = null;
        at stackIn_24_1 = null;
        eaa stackIn_25_0 = null;
        at stackIn_25_1 = null;
        eaa stackIn_26_0 = null;
        at stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        eaa stackOut_23_0 = null;
        at stackOut_23_1 = null;
        eaa stackOut_25_0 = null;
        at stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        eaa stackOut_24_0 = null;
        at stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        Object stackOut_57_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        var5 = BachelorFridge.field_y;
        if (3 == kaa.field_m) {
          return;
        } else {
          if (4 == (kaa.field_m ^ -1)) {
            return;
          } else {
            L0: {
              if (af.field_a) {
                ic.a(69);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (this.field_e.field_a) {
                this.field_p = this.field_p - 1;
                this.field_u = this.field_u - 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != this.field_s) {
                this.field_s.b((byte) 81);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                discarded$1 = this.h((byte) 126);
                break L3;
              }
            }
            L4: {
              this.q(17);
              if (this.field_h.field_A == 0) {
                L5: {
                  if (this.field_A != null) {
                    if (this.field_A.a(-214844415)) {
                      break L5;
                    } else {
                      this.field_A = null;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (-1 >= (this.field_n ^ -1)) {
                  this.field_y.a((byte) 108);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                L6: {
                  if (!this.field_h.field_r) {
                    break L6;
                  } else {
                    if (null == this.field_h.field_p) {
                      break L6;
                    } else {
                      if (this.field_Q) {
                        break L6;
                      } else {
                        this.field_X.a(this.field_h.field_p, true);
                        this.field_Q = true;
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  if (!this.field_j.e(12917)) {
                    break L7;
                  } else {
                    if (!this.field_fb.e(12917)) {
                      break L7;
                    } else {
                      if (this.field_X.e(12917)) {
                        if (!this.i(108)) {
                          L8: {
                            if (!this.field_h.field_r) {
                              break L8;
                            } else {
                              this.e(-122);
                              break L8;
                            }
                          }
                          this.field_e.d((byte) -16);
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        L9: {
                          var6 = (cj) ((Object) this.field_X.a(false));
                          var4_ref_at = var6.a(5, (gj) (this));
                          stackOut_23_0 = this.field_j;
                          stackOut_23_1 = (at) (var4_ref_at);
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          if (param1) {
                            stackOut_25_0 = (eaa) ((Object) stackIn_25_0);
                            stackOut_25_1 = (at) ((Object) stackIn_25_1);
                            stackOut_25_2 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            stackIn_26_2 = stackOut_25_2;
                            break L9;
                          } else {
                            stackOut_24_0 = (eaa) ((Object) stackIn_24_0);
                            stackOut_24_1 = (at) ((Object) stackIn_24_1);
                            stackOut_24_2 = 1;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_26_1 = stackOut_24_1;
                            stackIn_26_2 = stackOut_24_2;
                            break L9;
                          }
                        }
                        ((eaa) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2 != 0);
                        break L7;
                      }
                    }
                  }
                }
                this.field_L = this.field_L + 1;
                if (!param0) {
                  return;
                } else {
                  L10: {
                    var3 = 1;
                    if (!this.field_e.field_a) {
                      break L10;
                    } else {
                      L11: {
                        L12: {
                          L13: {
                            if (!vs.field_d) {
                              break L13;
                            } else {
                              if (lna.field_q) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (!lb.g((byte) -59)) {
                            if ((mk.field_p ^ -1) >= -1) {
                              break L11;
                            } else {
                              if (mk.field_p >= nna.field_w.field_q) {
                                break L11;
                              } else {
                                if (i.field_a.field_rb + -nna.field_w.field_p >= gd.field_m) {
                                  break L11;
                                } else {
                                  if (i.field_a.field_rb <= gd.field_m) {
                                    break L11;
                                  } else {
                                    if (-2 == (lf.field_c ^ -1)) {
                                      L14: {
                                        if (wj.field_g) {
                                          stackOut_50_0 = 0;
                                          stackIn_51_0 = stackOut_50_0;
                                          break L14;
                                        } else {
                                          stackOut_49_0 = 1;
                                          stackIn_51_0 = stackOut_49_0;
                                          break L14;
                                        }
                                      }
                                      wj.field_g = stackIn_51_0 != 0;
                                      lf.field_c = 0;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L12;
                          }
                        }
                        var3 = 0;
                        break L11;
                      }
                      if (!wj.field_g) {
                        break L10;
                      } else {
                        var3 = 0;
                        break L10;
                      }
                    }
                  }
                  L15: {
                    L16: {
                      if (this.field_M == 1) {
                        break L16;
                      } else {
                        if (-3 != (this.field_M ^ -1)) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      stackOut_57_0 = this;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_58_0 = stackOut_57_0;
                      if (param1) {
                        stackOut_59_0 = this;
                        stackOut_59_1 = 0;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        break L17;
                      } else {
                        stackOut_58_0 = this;
                        stackOut_58_1 = 1;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        break L17;
                      }
                    }
                    this.d(stackIn_60_1 != 0);
                    break L15;
                  }
                  L18: {
                    if (0 != this.field_M) {
                      break L18;
                    } else {
                      this.field_P = null;
                      break L18;
                    }
                  }
                  L19: {
                    if (this.field_s == null) {
                      break L19;
                    } else {
                      if (!this.field_fb.e(12917)) {
                        break L19;
                      } else {
                        if (!this.field_j.e(12917)) {
                          break L19;
                        } else {
                          L20: {
                            var4 = 0;
                            if (var3 == 0) {
                              break L20;
                            } else {
                              L21: {
                                L22: {
                                  if (wga.field_q[98]) {
                                    break L22;
                                  } else {
                                    if (wga.field_q[sm.field_r]) {
                                      break L22;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                this.field_s.a(0, 8, 2962);
                                var4 = 1;
                                break L21;
                              }
                              L23: {
                                L24: {
                                  if (wga.field_q[99]) {
                                    break L24;
                                  } else {
                                    if (wga.field_q[rq.field_g]) {
                                      break L24;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                var4 = 1;
                                this.field_s.a(0, -8, 2962);
                                break L23;
                              }
                              L25: {
                                L26: {
                                  if (wga.field_q[96]) {
                                    break L26;
                                  } else {
                                    if (wga.field_q[oq.field_a]) {
                                      break L26;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                var4 = 1;
                                this.field_s.a(8, 0, 2962);
                                break L25;
                              }
                              L27: {
                                if (wga.field_q[97]) {
                                  break L27;
                                } else {
                                  if (wga.field_q[vk.field_s]) {
                                    break L27;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              this.field_s.a(-8, 0, 2962);
                              var4 = 1;
                              break L20;
                            }
                          }
                          L28: {
                            if ((nd.field_h ^ -1) != -5) {
                              break L28;
                            } else {
                              this.field_s.a(mk.field_p + -this.field_R, gd.field_m - this.field_t, 2962);
                              this.field_t = gd.field_m;
                              var4 = 1;
                              this.field_R = mk.field_p;
                              break L28;
                            }
                          }
                          if (var4 != 0) {
                            uca.a(40, (byte) -126);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                  }
                  if (-1 > (this.field_f ^ -1)) {
                    this.field_f = this.field_f - 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0, ad param1, int param2) {
        boolean discarded$19 = false;
        int var4_int = 0;
        RuntimeException var4 = null;
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
              var4_int = param1.field_s.a(32, (byte) 109) ? 1 : 0;
              discarded$19 = param1.field_s.k(-2049, param2);
              param1.a(24831, 45, kna.field_g[param2]);
              if (param0 == -16007) {
                break L1;
              } else {
                this.field_g = -44;
                break L1;
              }
            }
            L2: {
              if (var4_int == 0) {
                break L2;
              } else {
                if (!param1.field_s.a(32, (byte) -110)) {
                  this.b(param1, (ad) null, true);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("gj.V(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        int[] var2 = null;
        int var3 = 0;
        sfa var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        var5 = BachelorFridge.field_y;
        qm.a(10, 7758);
        int fieldTemp$2 = this.field_U;
        this.field_U = this.field_U + 1;
        this.field_Y[fieldTemp$2] = this.field_Z;
        this.field_G[this.field_Z.field_h.field_f].field_l = true;
        this.field_w = false;
        this.field_P = null;
        this.field_ab = false;
        this.field_l = false;
        this.field_Z = null;
        this.field_J = false;
        var7 = new int[7];
        var6 = var7;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if ((var3 ^ -1) <= -8) {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.field_x = (kv) null;
                break L1;
              }
            }
            dk.a(this.field_Y, (byte) 94, var7);
            this.field_f = 5;
            return;
          } else {
            var4 = this.field_Y[var3];
            if (var4 != null) {
              var2[var3] = -this.field_G[var4.field_h.field_f].field_s.field_v;
              var3++;
              continue L0;
            } else {
              var2[var3] = 2147483646;
              var3++;
              continue L0;
            }
          }
        }
    }

    private final boolean r(int param0) {
        rk[] var3 = null;
        hd var4 = null;
        int stackIn_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          if (param0 == 2) {
            break L0;
          } else {
            var3 = (rk[]) null;
            this.a(28, (rk[]) null);
            break L0;
          }
        }
        var4 = (hd) ((Object) ur.field_e[this.field_Z.field_g]);
        if (-1 == (var4.c(0) ^ -1)) {
          if ((var4.field_j ^ -1) != -131) {
            return true;
          } else {
            L1: {
              L2: {
                if (this.field_h.field_a[this.field_N][this.field_H].field_l != null) {
                  break L2;
                } else {
                  if (!this.field_h.field_a[this.field_N][this.field_H].e(-123)) {
                    break L2;
                  } else {
                    stackOut_30_0 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    break L1;
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L1;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          L3: {
            if (-2 == (var4.c(0) ^ -1)) {
              break L3;
            } else {
              if (-4 != (var4.c(0) ^ -1)) {
                L4: {
                  if (var4.c(0) != 2) {
                    break L4;
                  } else {
                    L5: {
                      if (this.field_N != this.field_P.field_s.field_x - -1) {
                        break L5;
                      } else {
                        if (this.field_P.field_s.field_J != this.field_H) {
                          break L5;
                        } else {
                          return true;
                        }
                      }
                    }
                    L6: {
                      if (this.field_N != -1 + this.field_P.field_s.field_x) {
                        break L6;
                      } else {
                        if (this.field_P.field_s.field_J != this.field_H) {
                          break L6;
                        } else {
                          return true;
                        }
                      }
                    }
                    L7: {
                      if (this.field_P.field_s.field_x != this.field_N) {
                        break L7;
                      } else {
                        if (1 + this.field_P.field_s.field_J == this.field_H) {
                          break L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (this.field_P.field_s.field_x != this.field_N) {
                      break L4;
                    } else {
                      if (this.field_H != this.field_P.field_s.field_J - 1) {
                        break L4;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                return false;
              } else {
                L8: {
                  if (93 != var4.field_j) {
                    break L8;
                  } else {
                    if (this.field_h.c(this.field_N, this.field_H, -123) == null) {
                      break L8;
                    } else {
                      if (this.field_h.c(this.field_N, this.field_H, 127).field_A) {
                        return true;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                if (this.field_h.field_a[this.field_N][this.field_H].field_l != null) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          }
          return true;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        ad[] var4 = null;
        int var5 = 0;
        ad var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = BachelorFridge.field_y;
          var2 = 14;
          var3 = this.field_h.field_S[this.field_n].a((byte) -43);
          fb.field_r.e(var3 * 39 + -fb.field_r.field_q, 5);
          if (param0 == -1) {
            break L0;
          } else {
            this.field_n = 83;
            break L0;
          }
        }
        var4 = this.field_G;
        var5 = 0;
        L1: while (true) {
          if (var4.length <= var5) {
            return;
          } else {
            var6 = var4[var5];
            if (var6 != null) {
              L2: {
                var7 = var6.field_s;
                uga.field_C.e(-17 + var2, 6);
                if (null == this.field_P) {
                  break L2;
                } else {
                  if (this.field_P.field_s.field_u != var7.field_u) {
                    break L2;
                  } else {
                    if (this.field_P.field_s.field_D != var7.field_D) {
                      break L2;
                    } else {
                      this.field_x.d(var2 + -17, 1, 128);
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (!var6.field_s.i(100)) {
                  var6.field_f.a(2048, -43, 255, 8, 2048, var2 + -66);
                  break L3;
                } else {
                  kn.field_g.a(var2, 15, 192);
                  break L3;
                }
              }
              var8 = -7 + var2;
              var9 = 11;
              if (!var6.field_s.i(param0 ^ -111)) {
                b.field_t.c("" + var7.field_v, var8 - 4, 6 + var9, 2 + this.field_n, -1);
                var2 += 40;
                var5++;
                continue L1;
              } else {
                var2 += 40;
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$1 = 0;
        sfa var3 = null;
        int var4 = 0;
        ad var5 = null;
        int var5_int = 0;
        sfa[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        gm var10 = null;
        aga var11 = null;
        sfa var12 = null;
        gm var13 = null;
        aga var14 = null;
        sfa[] var15 = null;
        L0: {
          var9 = BachelorFridge.field_y;
          fieldTemp$1 = this.field_U - 1;
          this.field_U = this.field_U - 1;
          var3 = this.field_Y[fieldTemp$1];
          var4 = this.field_U;
          if (0 == (param0 ^ -1)) {
            break L0;
          } else {
            var5_int = 0;
            L1: while (true) {
              if (this.field_Y.length <= var5_int) {
                break L0;
              } else {
                var12 = this.field_Y[var5_int];
                if (var12 != null) {
                  if (param0 == var12.field_h.field_f) {
                    var3 = var12;
                    var4 = var5_int;
                    var5_int++;
                    continue L1;
                  } else {
                    var5_int++;
                    continue L1;
                  }
                } else {
                  var5_int++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          var5 = this.field_G[var3.field_h.field_f];
          var5.field_l = false;
          var11 = var5.field_s;
          var14 = var11;
          if (var3 instanceof gm) {
            var10 = (gm) ((Object) var3);
            var13 = var10;
            if ((var13.field_i ^ -1) == -3) {
              this.field_h.field_a[-var13.field_l + var14.field_x][var14.field_J].field_g = false;
              break L2;
            } else {
              if (-5 != (var13.field_i ^ -1)) {
                if ((var13.field_i ^ -1) == -4) {
                  this.field_h.field_a[var14.field_x][var14.field_J + var13.field_l].field_g = false;
                  break L2;
                } else {
                  if (1 == var13.field_i) {
                    this.field_h.field_a[var14.field_x][-var13.field_l + var14.field_J].field_g = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                this.field_h.field_a[var10.field_l + var11.field_x][var11.field_J].field_g = false;
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L3: {
          var8 = 25 / ((param1 - 70) / 54);
          var4++;
          var15 = new sfa[this.field_Y.length];
          var7 = var15;
          if (-1 > (var4 ^ -1)) {
            bl.a(this.field_Y, 0, var15, 0, -1 + var4);
            bl.a(this.field_Y, var4, var7, var4 + -1, -var4 + this.field_Y.length + -1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          this.field_Y = var7;
          if (this.field_P != var5) {
            break L4;
          } else {
            this.field_W.a(-95);
            break L4;
          }
        }
        this.field_ab = false;
        this.field_w = false;
        this.field_l = false;
    }

    private final void f(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (this.field_s == null) {
            break L0;
          } else {
            if (this.field_s.field_q < 0) {
              break L0;
            } else {
              if (this.field_s.field_q >= this.field_h.field_z) {
                break L0;
              } else {
                if (this.field_s.field_r < 0) {
                  break L0;
                } else {
                  if (this.field_h.field_B > this.field_s.field_r) {
                    L1: {
                      var2 = mk.field_p;
                      var3 = gd.field_m;
                      var4 = this.a(-18254, this.field_s.field_r, this.field_s.field_q);
                      var5 = ad.field_h.c(od.field_w[this.a(-18254, this.field_s.field_r, this.field_s.field_q)].field_d, 100) - -20;
                      var6 = 20 + ad.field_h.c(od.field_w[this.a(-18254, this.field_s.field_r, this.field_s.field_q)].field_a, 100);
                      var5 = Math.max(var5, var6);
                      if (640 >= var2 + var5) {
                        break L1;
                      } else {
                        var2 = var2 + (640 - var2 + -var5);
                        break L1;
                      }
                    }
                    L2: {
                      var7 = 20 + ad.field_h.a(od.field_w[this.a(-18254, this.field_s.field_r, this.field_s.field_q)].field_d, 100, 12) - -ad.field_h.a(od.field_w[this.a(-18254, this.field_s.field_r, this.field_s.field_q)].field_a, 100, 12);
                      if (i.field_a.field_rb >= var7 + var3) {
                        break L2;
                      } else {
                        var3 = var3 + (i.field_a.field_rb + -var3 - var7);
                        break L2;
                      }
                    }
                    dg.a(var2, var3, var5, var7, 5, 65793, 192);
                    ad.field_h.a(od.field_w[var4].field_a, var2 + (var5 >> 26126817), var3 - -15, 0, -1);
                    discarded$1 = ad.field_h.a(od.field_w[var4].field_d, 10 + var2, var3 + 20, -20 + var5, 80, 0, -1, 1, 0, 12);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        L3: {
          if (param0 == 8910) {
            break L3;
          } else {
            this.field_q = 34;
            break L3;
          }
        }
    }

    final ad a(int param0, ad param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        ad var4 = null;
        aga var5 = null;
        aga var6 = null;
        aga var7 = null;
        Object stackIn_4_0 = null;
        ad stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ad stackOut_8_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var6 = this.field_h.a((byte) -120, param1.field_s);
              var7 = var6;
              if (param0 == 21915) {
                break L1;
              } else {
                var5 = (aga) null;
                discarded$2 = this.a((aga) null, (byte) 21);
                break L1;
              }
            }
            if (var7 != null) {
              L2: {
                var4 = new ad(var7);
                param1.c((byte) -73);
                var4.c((byte) -102);
                if (var7.field_D != this.field_n) {
                  break L2;
                } else {
                  this.field_G[var6.field_u] = var4;
                  if (this.field_K >= var7.field_u + 1) {
                    break L2;
                  } else {
                    this.field_K = var7.field_u - -1;
                    break L2;
                  }
                }
              }
              this.field_o[var6.field_D][var6.field_u] = var4;
              stackOut_8_0 = (ad) (var4);
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("gj.P(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ad) ((Object) stackIn_4_0);
        } else {
          return stackIn_9_0;
        }
    }

    private final boolean a(aga param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 101 % ((param1 - -59) / 36);
              if (this.field_n != param0.field_D) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("gj.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final sfa b(ad param0, boolean param1) {
        sfa[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sfa var5 = null;
        int var6 = 0;
        sfa stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        sfa stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_bb = (sna) null;
                break L1;
              }
            }
            var3 = this.field_Y;
            var4 = 0;
            L2: while (true) {
              if (var4 < var3.length) {
                L3: {
                  var5 = var3[var4];
                  if (var5 != null) {
                    if (param0.field_s.field_u != var5.field_h.field_f) {
                      break L3;
                    } else {
                      stackOut_9_0 = (sfa) (var5);
                      stackIn_10_0 = stackOut_9_0;
                      break L0;
                    }
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("gj.JA(");
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final void a(ad param0, ad param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        if (!param0.field_s.a(this.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_n, param2)) {
            return;
        }
        if (!(param1.field_s.a(this.field_h.field_a[param0.field_s.field_x][param0.field_s.field_J].field_n, false))) {
            return;
        }
        try {
            var4_int = param0.field_s.field_x;
            var5 = param0.field_s.field_J;
            param0.field_s.field_x = param1.field_s.field_x;
            param0.field_s.field_J = param1.field_s.field_J;
            param1.field_s.field_x = var4_int;
            param1.field_s.field_J = var5;
            this.b(param0, param1, true);
            this.b(param1, param0, !param2 ? true : false);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gj.PA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        int var2 = 62 / ((param0 - -16) / 44);
        eaa var3 = this.field_h.field_U;
        var3.a(this.field_X, 12632256);
    }

    final void b(ad param0, ad param1, boolean param2) {
        RuntimeException var4 = null;
        wia var4_ref = null;
        int var5 = 0;
        nj var5_ref_nj = null;
        jha var5_ref_jha = null;
        int var6 = 0;
        Object var7 = null;
        int var7_int = 0;
        int var8 = 0;
        ek var8_ref_ek = null;
        jha var10 = null;
        int var11 = 0;
        wia var13 = null;
        eda var14 = null;
        wia var15 = null;
        int[][] var22 = null;
        int[] var23 = null;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            var13 = param0.field_s.field_w.field_a[param0.field_s.field_x][param0.field_s.field_J];
            var15 = var13;
            var4_ref = var15;
            var4_ref.field_l = param0.field_s;
            if (!param0.field_s.a(32, (byte) 61)) {
              L1: {
                if (param2) {
                  break L1;
                } else {
                  this.field_x = (kv) null;
                  break L1;
                }
              }
              L2: {
                if (21 == var15.field_n) {
                  var14 = new eda((gj) (this), param0.field_s.field_x, param0.field_s.field_J, param0.field_f, this.field_s.field_k.field_b[93]);
                  var14 = var14;
                  ((kj) ((Object) var14)).a(0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!od.field_w[var13.field_n].field_b) {
                  break L3;
                } else {
                  if (!var15.field_m) {
                    break L3;
                  } else {
                    if (!this.a(param0, param2)) {
                      break L3;
                    } else {
                      if (33 != param0.field_s.field_y) {
                        L4: {
                          L5: {
                            if (-17 == (var15.a(-36) ^ -1)) {
                              break L5;
                            } else {
                              if (-19 == (var15.a(-36) ^ -1)) {
                                break L5;
                              } else {
                                if (17 == var15.a(-36)) {
                                  break L5;
                                } else {
                                  if (19 != var15.a(-36)) {
                                    L6: {
                                      if ((var15.a(-36) ^ -1) == -5) {
                                        break L6;
                                      } else {
                                        if ((var15.a(-36) ^ -1) == -7) {
                                          break L6;
                                        } else {
                                          if (5 == var15.a(-36)) {
                                            break L6;
                                          } else {
                                            if (var15.a(-36) != 7) {
                                              var5_ref_jha = new jha((gj) (this), param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
                                              ((kj) ((Object) var5_ref_jha)).a(0);
                                              break L4;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    aba.a((byte) -52, 15);
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          aba.a((byte) -53, 16);
                          var5_ref_nj = new nj((gj) (this), param0.field_s.field_x, param0.field_s.field_J, od.field_w[var13.field_n].field_f);
                          ((kj) ((Object) var5_ref_nj)).a(0);
                          break L4;
                        }
                        param0.a(24831, 11, kna.field_g[var15.a(-36)]);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L7: {
                if (-39 != (var15.field_n ^ -1)) {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L7;
                } else {
                  stackOut_28_0 = 1;
                  stackIn_30_0 = stackOut_28_0;
                  break L7;
                }
              }
              L8: {
                var5 = stackIn_30_0;
                if (-1 != (var15.field_j ^ -1)) {
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  break L8;
                } else {
                  stackOut_31_0 = 1;
                  stackIn_33_0 = stackOut_31_0;
                  break L8;
                }
              }
              L9: {
                var6 = stackIn_33_0;
                param0.field_s.a(var15, -122);
                if (var5 == 0) {
                  break L9;
                } else {
                  L10: {
                    if (var6 != 0) {
                      var7 = new bn((gj) (this), param0.field_s.field_x, param0.field_s.field_J);
                      var8_ref_ek = new ek((gj) (this), param0, -30);
                      this.field_j.a(var8_ref_ek, true);
                      break L10;
                    } else {
                      var7 = new oia((gj) (this), param0.field_s.field_x, param0.field_s.field_J);
                      var8_ref_ek = new ek((gj) (this), param0, 75);
                      this.field_j.a(var8_ref_ek, param2);
                      break L10;
                    }
                  }
                  ((kj) (var7)).a(0);
                  break L9;
                }
              }
              var22 = param0.field_s.field_w.field_i;
              var8 = 0;
              L11: while (true) {
                if (var8 >= var22.length) {
                  L12: {
                    if (3 == this.field_h.field_o) {
                      L13: {
                        if (param0.field_s.g((byte) 85)) {
                          var7_int = this.field_h.b((byte) 99, param0.field_s);
                          this.field_h.field_c[var7_int] = new int[]{param0.field_s.field_x, param0.field_s.field_J};
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      if (!this.a((byte) -87, param0)) {
                        break L12;
                      } else {
                        var7 = new bu((gj) (this), param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
                        ((kj) (var7)).a(0);
                        this.field_h.a(this.field_h.b((byte) 121, param0.field_s), (byte) 97);
                        this.field_h.field_C[param0.field_s.field_D] = this.field_h.field_C[param0.field_s.field_D] + 1;
                        param0.field_s.field_y = 0;
                        param0.a(this.c(param0.field_s.field_D, 2271), 46, gka.field_r);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L14: {
                    var23 = var22[var8];
                    if (param0.field_s.field_x != var23[0]) {
                      break L14;
                    } else {
                      if (var23[1] == param0.field_s.field_J) {
                        var10 = new jha((gj) (this), param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
                        ((kj) ((Object) var10)).a(0);
                        if (param0.field_s.field_D != this.field_n) {
                          aba.a((byte) -117, 18);
                          break L14;
                        } else {
                          aba.a((byte) 43, 17);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  var8++;
                  continue L11;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var4);
            stackOut_55_1 = new StringBuilder().append("gj.F(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L15;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L15;
            }
          }
          L16: {
            stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L16;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L16;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        sfa var5 = null;
        ad var6 = null;
        aga var7 = null;
        gm var8 = null;
        int var9 = 0;
        sfa[] var10 = null;
        var9 = BachelorFridge.field_y;
        var10 = this.field_Y;
        var3 = -17 % ((-79 - param0) / 47);
        var4 = 0;
        L0: while (true) {
          if (var4 >= var10.length) {
            return;
          } else {
            var5 = var10[var4];
            if (var5 != null) {
              var6 = this.field_G[var5.field_h.field_f];
              var7 = var6.field_s;
              var6.field_l = false;
              if (var5 instanceof gm) {
                var8 = (gm) ((Object) var5);
                if (-3 != (var8.field_i ^ -1)) {
                  if (4 == var8.field_i) {
                    this.field_h.field_a[var7.field_x - -var8.field_l][var7.field_J].field_g = false;
                    var4++;
                    continue L0;
                  } else {
                    if (3 != var8.field_i) {
                      if (-2 == (var8.field_i ^ -1)) {
                        this.field_h.field_a[var7.field_x][var7.field_J + -var8.field_l].field_g = false;
                        var4++;
                        continue L0;
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      this.field_h.field_a[var7.field_x][var8.field_l + var7.field_J].field_g = false;
                      var4++;
                      continue L0;
                    }
                  }
                } else {
                  this.field_h.field_a[-var8.field_l + var7.field_x][var7.field_J].field_g = false;
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(ad param0, int param1, ad param2, int param3, byte param4) {
        ad discarded$0 = null;
        try {
            param0.field_s.field_w.field_a[param0.field_s.field_x][param0.field_s.field_J].field_l = null;
            if (param4 > -35) {
                ad var7 = (ad) null;
                discarded$0 = this.a(-101, (ad) null);
            }
            param0.field_s.field_J = param1;
            param0.field_s.field_x = param3;
            this.b(param0, param2, true);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gj.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void f(byte param0) {
        if (param0 != 50) {
            this.field_L = 11;
        }
    }

    private final void a(int param0, String param1, int param2) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        ad var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_S.a(new vca(taa.field_u, param1, param0, 8192, 20, 30, 50, 80), true);
              if (param2 == -22468) {
                break L1;
              } else {
                var5 = (ad) null;
                discarded$2 = this.a((byte) -101, (ad) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("gj.LA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final void e(int param0) {
        dg.g(0, 0, 640, 480);
        if (param0 >= -54) {
            return;
        }
        kv var2 = new kv(640, 480);
        fc.a(480, 640, var2, 0, (byte) 124, 0);
        eq.a(var2, (gj) (this), (byte) -111);
        sia.field_h = false;
        lg.a(true, 3, false);
    }

    final void b(int param0, int param1) {
        ad var4 = null;
        t var5 = null;
        if (null == this.field_P) {
          return;
        } else {
          L0: {
            if (!this.a(this.field_P.field_s, (byte) -107)) {
              break L0;
            } else {
              if (!this.field_P.field_s.a(9, (byte) -110)) {
                L1: {
                  this.field_l = false;
                  this.field_w = false;
                  if (param1 == -1) {
                    break L1;
                  } else {
                    var4 = (ad) null;
                    this.a((ad) null, (byte) -47);
                    break L1;
                  }
                }
                qm.a(10, param1 ^ -7759);
                this.field_db = param0;
                var5 = (t) ((Object) al.a(116, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]));
                this.field_P.a(16776960, 41, var5.field_f);
                this.field_Z = (sfa) ((Object) new hia(al.a(94, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]).field_j, this.field_P.field_s));
                this.field_ab = true;
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    private final boolean a(byte param0, ad param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (-4 == (this.field_h.field_o ^ -1)) {
              L1: {
                var3_int = -37 % ((param0 - 30) / 32);
                if (!this.field_h.b(param1.field_s, (byte) 114)) {
                  break L1;
                } else {
                  if (!param1.field_s.g((byte) 85)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("gj.VA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0 != 0;
          }
        }
    }

    final static void a(byte param0, eaa param1, Random param2, int param3) {
        boolean discarded$4 = false;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        cia var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var5 = -16 / ((param0 - 55) / 40);
            var7 = (cia) ((Object) param1.b((byte) 90));
            L1: while (true) {
              if (var7 == null) {
                break L0;
              } else {
                discarded$4 = var7.b(true);
                var7 = (cia) ((Object) param1.c(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("gj.RA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final void d(byte param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (param0 > 2) {
          if (!this.field_h.field_r) {
            L0: {
              this.field_s.a(-22048);
              if (this.field_h.field_J - 1 != this.field_h.field_A) {
                if ((this.field_M ^ -1) != -2) {
                  if (-3 != (this.field_M ^ -1)) {
                    break L0;
                  } else {
                    this.a(3, fv.field_y);
                    break L0;
                  }
                } else {
                  this.a(3, ph.field_C);
                  break L0;
                }
              } else {
                this.a(3, wga.field_r);
                break L0;
              }
            }
            L1: {
              if (this.field_G != null) {
                var2 = null;
                var3 = 0;
                L2: while (true) {
                  L3: {
                    if (-8 >= (var3 ^ -1)) {
                      break L3;
                    } else {
                      if (null != this.field_G[var3]) {
                        if (!this.field_G[var3].field_s.i(-102)) {
                          var2 = this.field_G[var3];
                          break L3;
                        } else {
                          var3++;
                          continue L2;
                        }
                      } else {
                        var3++;
                        continue L2;
                      }
                    }
                  }
                  if (0 < this.field_h.field_S[this.field_n].b((byte) 97)) {
                    var3 = -(128 * (((ad) (var2)).field_s.field_x - ((ad) (var2)).field_s.field_J) >> 1150498337) + 256;
                    var4 = 208 - ((((ad) (var2)).field_s.field_J + ((ad) (var2)).field_s.field_x) * 64 >> 1063327873);
                    this.field_j.a(new fu((gj) (this), this.field_s.field_b, this.field_s.field_B, var3, var4), true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            this.field_h.j(-1);
            this.field_h.field_j = new sfa[this.field_h.field_d][7];
            this.j(-15503);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, ema param1) {
        RuntimeException runtimeException = null;
        ema var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            param1.a(false);
            var2 = (ema) ((Object) aa.field_l.b((byte) 90));
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(0, param1)) {
                    break L2;
                  } else {
                    var2 = (ema) ((Object) aa.field_l.c(0));
                    continue L1;
                  }
                }
              }
              L3: {
                if (var2 != null) {
                  nr.a((byte) -106, var2, param1);
                  break L3;
                } else {
                  aa.field_l.a(param1, true);
                  break L3;
                }
              }
              var3 = 113 % ((param0 - -10) / 47);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("gj.OB(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(int param0, int param1, ad param2, int param3) {
        try {
            if (param0 >= -118) {
                this.b((byte) -56);
            }
            this.a(132, (ad) null, param1, param3, param2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gj.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1) {
        hd var6 = null;
        hd var3 = null;
        int var4 = 0;
        int var5 = 0;
        hd var7 = null;
        if (null != this.field_P) {
            if (!(this.a(this.field_P.field_s, (byte) -124))) {
                return;
            }
            this.field_l = false;
            this.field_ab = false;
            qm.a(10, 7758);
            this.field_db = param1;
            var6 = (hd) ((Object) al.a(-103, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]));
            var3 = var6;
            if (param0 != 16776960) {
                return;
            }
            var4 = 0;
            if (119 == var6.field_j) {
                var5 = this.field_h.field_O;
                var4 = 1;
                if (var5 >= 31) {
                    var5++;
                }
                var7 = (hd) ((Object) al.a(94, var5 + 88));
                var3 = var7;
                this.field_P.a(16776960, param0 ^ 16777086, var7.field_f);
            }
            this.field_Z = (sfa) ((Object) new td(var3.field_j, this.field_P.field_s, var4 != 0));
            if (var3.e(-2)) {
                this.field_w = true;
            } else {
                this.k(-1);
            }
            return;
        }
    }

    final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        aga var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        this.field_y = null;
        this.field_K = 0;
        if (param0 <= -56) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_h.field_d) {
              L1: {
                this.field_h.j(-1);
                this.field_s = new jo((gj) (this));
                this.j(-15503);
                if (af.field_a) {
                  this.field_h.field_a[3][6].field_h = 20;
                  this.field_h.field_a[3][6].field_n = 39;
                  this.field_h.field_a[4][5].field_n = 39;
                  this.field_h.field_a[4][5].field_h = 20;
                  this.field_h.field_a[0][2].field_n = 39;
                  this.field_h.field_a[0][2].field_h = 20;
                  this.field_h.field_e = 3;
                  break L1;
                } else {
                  break L1;
                }
              }
              aq.a(1 + this.field_h.field_E, -1);
              return;
            } else {
              var3 = 0;
              L2: while (true) {
                if (-8 >= (var3 ^ -1)) {
                  var2++;
                  continue L0;
                } else {
                  var4 = this.field_h.field_S[var2].field_b[var3];
                  if (var4 != null) {
                    L3: {
                      this.field_o[var2][var3] = new ad(var4);
                      if (var2 == this.field_n) {
                        this.field_K = this.field_K + 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (0 >= var4.field_I) {
                      this.field_o[var2][var3].b(-1, 5);
                      this.field_o[var2][var3].field_f.field_u.a((byte) -84);
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1, int param2) {
        String var4 = null;
        if (!(0 != (param1 ^ -1))) {
            return;
        }
        if (2 != this.field_M) {
            return;
        }
        if (this.field_n != param1) {
            var4 = lga.a(true, new String[]{this.field_h.field_y[param1], Integer.toString(param2)}, pja.field_c);
            this.a(16711680, var4, -22468);
        } else {
            var4 = lga.a(true, new String[]{Integer.toString(param2)}, nu.field_g);
            this.a(65280, var4, -22468);
        }
        if (param0 != 640) {
            this.field_P = (ad) null;
        }
    }

    private final void o(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        hd var7 = null;
        td var8 = null;
        ad var9 = null;
        var9 = this.field_G[this.field_Z.field_h.field_f];
        this.field_H = this.field_s.field_h;
        this.field_N = this.field_s.field_s;
        if ((this.field_N ^ -1) > -1) {
          return;
        } else {
          L0: {
            if (this.field_N >= this.field_h.field_z) {
              break L0;
            } else {
              if (-1 < (this.field_H ^ -1)) {
                break L0;
              } else {
                if (this.field_H >= this.field_h.field_B) {
                  break L0;
                } else {
                  L1: {
                    var3 = var9.field_s.field_x;
                    if (param0 == -17) {
                      break L1;
                    } else {
                      this.field_K = -53;
                      break L1;
                    }
                  }
                  L2: {
                    var4 = var9.field_s.field_J;
                    var5 = un.a(param0 + 105, -var4 + this.field_H, -var3 + this.field_N);
                    if (this.r(param0 + 19)) {
                      L3: {
                        var6 = null;
                        var7 = (hd) ((Object) ur.field_e[this.field_Z.field_g]);
                        if (-4 == (var7.c(0) ^ -1)) {
                          var6 = this.field_h.field_a[this.field_N][this.field_H].field_l;
                          if ((var7.field_j ^ -1) != -94) {
                            break L3;
                          } else {
                            var6 = this.field_h.c(this.field_N, this.field_H, param0 + 19);
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (var5 != 0) {
                          this.field_P.field_s.field_s = var5;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var8 = (td) ((Object) this.field_Z);
                        var8.field_i = var5;
                        var8.field_k = this.field_N;
                        var8.field_n = this.field_H;
                        if (var6 == null) {
                          break L5;
                        } else {
                          var8.field_j = new nq((aga) (var6));
                          break L5;
                        }
                      }
                      this.k(-1);
                      this.field_w = false;
                      break L2;
                    } else {
                      this.m(param0 + 27);
                      break L2;
                    }
                  }
                  this.field_f = 5;
                  lf.field_c = 0;
                  return;
                }
              }
            }
          }
          return;
        }
    }

    final void a(int param0, ad param1, byte param2, int param3) {
        try {
            this.a(param1, param3, (ad) null, param0, (byte) -126);
            int var5_int = 108 % ((-45 - param2) / 42);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gj.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, ad[] param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int[][] var4_array = null;
        int var5 = 0;
        ad var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var13 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= param1.length) {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    this.field_v = (int[]) null;
                    break L2;
                  }
                }
                var13 = this.field_h.field_L.b(this.field_n, -73);
                var12 = var13;
                var11 = var12;
                var4_array = var11;
                var5 = 0;
                L3: while (true) {
                  if (7 <= var5) {
                    this.field_h.g(127);
                    this.j(-15503);
                    this.field_e.a(0, param0);
                    break L0;
                  } else {
                    var6 = this.field_G[var5];
                    if (var6 != null) {
                      L4: {
                        if (var13.length > var5) {
                          var7 = var6.field_s;
                          var8 = var13[var5][0];
                          var9 = var13[var5][1];
                          var7.field_J = var9;
                          var7.field_x = var8;
                          var7.field_u = var5;
                          this.field_h.a(var7, 1, this.field_n, var5);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var5++;
                      continue L3;
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                this.field_G[var4_int] = param1[var4_int];
                this.field_G[var4_int].field_s.field_u = var4_int;
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("gj.K(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
    }

    final boolean a(aga param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                this.h(-33);
                break L1;
              }
            }
            L2: {
              if (param0.field_D != this.field_n) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("gj.S(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private final void a(rk[] param0, op param1, int param2, int param3) {
        try {
            this.field_h = param1;
            this.field_n = param3;
            this.a(13558251, param0);
            this.field_o = new ad[this.field_h.field_d][7];
            if ((this.field_n ^ -1) <= -1) {
                this.field_G = this.field_o[this.field_n];
            }
            this.field_K = 0;
            if (!(0 == this.field_h.field_A)) {
                this.l(param2 ^ -19211);
            }
            if (param2 != 19273) {
                this.e(-67);
            }
            this.field_D = new kj[this.field_h.field_z][this.field_h.field_B];
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gj.MA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean c(int param0) {
        ad discarded$0 = null;
        int var2 = this.field_B + -mk.field_p;
        if (param0 != -3985) {
            ad var4 = (ad) null;
            discarded$0 = this.a(117, (ad) null);
        }
        int var3 = -gd.field_m + this.field_I;
        return -65 > (var2 * var2 - -(var3 * var3) ^ -1) ? true : false;
    }

    private final void b(boolean param0) {
        int var3 = 0;
        int var2 = 4;
        if (this.field_cb) {
            return;
        }
        if (null != this.field_A) {
            return;
        }
        if ((jc.field_r ^ -1) < -4) {
            if (jc.field_r < 50) {
                if (nfa.field_a > var2) {
                    if (!(8 + this.field_h.field_k * 39 <= nfa.field_a)) {
                        var3 = -1;
                        var3 = (nfa.field_a - 4) / 39;
                        if (-1 != (lf.field_c ^ -1)) {
                            if (!(this.field_h.field_k <= var3)) {
                                if (null == this.field_G[var3]) {
                                    return;
                                }
                                this.field_q = this.field_G[var3].field_s.field_x;
                                this.field_E = this.field_G[var3].field_s.field_J;
                                this.a(false, this.a(this.field_E, false, this.field_q));
                                if (!(nd.field_h != 4)) {
                                    this.a(this.field_P, (byte) -52);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!param0) {
            this.field_g = 103;
        }
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        aj var4 = null;
        aj var5 = null;
        int stackIn_77_0 = 0;
        Object stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        Object stackIn_116_2 = null;
        int stackIn_116_3 = 0;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        Object stackIn_117_2 = null;
        int stackIn_117_3 = 0;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        Object stackIn_118_2 = null;
        int stackIn_118_3 = 0;
        int stackIn_118_4 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        Object stackOut_115_2 = null;
        int stackOut_115_3 = 0;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        Object stackOut_117_2 = null;
        int stackOut_117_3 = 0;
        int stackOut_117_4 = 0;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        Object stackOut_116_2 = null;
        int stackOut_116_3 = 0;
        int stackOut_116_4 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if ((this.field_n ^ -1) <= -1) {
            this.field_C.a(19842, true);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          this.field_W.a(param0);
          if (this.field_P == null) {
            break L1;
          } else {
            if (!this.field_J) {
              break L1;
            } else {
              var4 = this.field_s.a(this.field_P.field_s.field_J, (byte) 56, this.field_P.field_s.field_x);
              this.field_W.b(-3, var4.field_c + -40, -90 + var4.field_a);
              break L1;
            }
          }
        }
        L2: {
          if (-2 != (lf.field_c ^ -1)) {
            break L2;
          } else {
            if (this.field_C.field_T) {
              break L2;
            } else {
              if (!this.field_O.field_T) {
                L3: {
                  if (-2 != (this.field_M ^ -1)) {
                    if (this.field_M == 2) {
                      if (!this.field_ab) {
                        break L3;
                      } else {
                        this.d(18);
                        break L3;
                      }
                    } else {
                      if (this.field_M != 2) {
                        break L3;
                      } else {
                        if (!this.field_ab) {
                          break L3;
                        } else {
                          this.d(18);
                          break L3;
                        }
                      }
                    }
                  } else {
                    if (this.field_M == 2) {
                      if (!this.field_ab) {
                        break L3;
                      } else {
                        this.d(18);
                        break L3;
                      }
                    } else {
                      if (this.field_M != 2) {
                        break L3;
                      } else {
                        if (!this.field_ab) {
                          break L3;
                        } else {
                          this.d(18);
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (!this.field_w) {
                  break L2;
                } else {
                  this.o(-17);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (-3 == (lf.field_c ^ -1)) {
            this.field_R = mk.field_p;
            this.field_B = mk.field_p;
            this.field_t = gd.field_m;
            this.field_I = gd.field_m;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (this.field_cb) {
            break L5;
          } else {
            if (null != this.field_A) {
              break L5;
            } else {
              if (this.field_s == null) {
                break L5;
              } else {
                if (this.field_l) {
                  break L5;
                } else {
                  if (this.field_ab) {
                    break L5;
                  } else {
                    if (this.field_O.field_T) {
                      break L5;
                    } else {
                      if (this.field_f <= 0) {
                        if (-1 != (nd.field_h & 4 ^ -1)) {
                          break L5;
                        } else {
                          if (-1 == this.field_B) {
                            break L5;
                          } else {
                            if (this.field_J) {
                              break L5;
                            } else {
                              L6: {
                                if (this.c(-3985)) {
                                  break L6;
                                } else {
                                  L7: {
                                    var5 = this.field_s.b(mk.field_p, 9, gd.field_m);
                                    if (var5 != null) {
                                      this.field_q = var5.field_c;
                                      this.field_E = var5.field_a;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    if (-1 < (this.field_q ^ -1)) {
                                      break L8;
                                    } else {
                                      if (this.field_q >= this.field_h.field_z) {
                                        break L8;
                                      } else {
                                        if (-1 < (this.field_E ^ -1)) {
                                          break L8;
                                        } else {
                                          if (this.field_E >= this.field_h.field_B) {
                                            break L8;
                                          } else {
                                            if (this.field_h.field_a[this.field_q][this.field_E].field_l == null) {
                                              break L8;
                                            } else {
                                              if (this.field_h.field_a[this.field_q][this.field_E].field_l.field_D != this.field_n) {
                                                break L8;
                                              } else {
                                                this.a(this.a(this.field_E, false, this.field_q), (byte) -52);
                                                break L6;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.field_d = true;
                                  this.field_i = 150;
                                  break L6;
                                }
                              }
                              this.field_B = -1;
                              break L5;
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L9: {
          if (null == this.field_P) {
            break L9;
          } else {
            if (0 != (4 & nd.field_h)) {
              break L9;
            } else {
              if (this.field_B == -1) {
                break L9;
              } else {
                if (this.field_J) {
                  L10: {
                    if (this.c(-3985)) {
                      break L10;
                    } else {
                      this.m(10);
                      qm.a(34, 7758);
                      this.field_f = 5;
                      break L10;
                    }
                  }
                  this.field_B = -1;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
          }
        }
        L11: {
          if (null == this.field_A) {
            break L11;
          } else {
            if (!this.field_A.a(-214844415)) {
              this.field_A = null;
              break L11;
            } else {
              break L11;
            }
          }
        }
        L12: {
          if (null != this.field_Y[0]) {
            L13: {
              if (this.field_eb) {
                this.field_O.a(19842, true);
                break L13;
              } else {
                break L13;
              }
            }
            if (!this.field_eb) {
              break L12;
            } else {
              if (this.field_O.field_R != 1) {
                break L12;
              } else {
                L14: {
                  L15: {
                    if (null == this.field_P) {
                      break L15;
                    } else {
                      if (this.field_P.field_s.field_D == this.field_n) {
                        stackOut_76_0 = this.field_P.field_s.field_u;
                        stackIn_77_0 = stackOut_76_0;
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  stackOut_75_0 = -1;
                  stackIn_77_0 = stackOut_75_0;
                  break L14;
                }
                var2 = stackIn_77_0;
                this.a(var2, (byte) 127);
                break L12;
              }
            }
          } else {
            this.field_O.field_T = false;
            break L12;
          }
        }
        L16: {
          if (this.field_cb) {
            break L16;
          } else {
            if (!this.field_m) {
              break L16;
            } else {
              if (this.field_A != null) {
                break L16;
              } else {
                L17: {
                  if (this.field_J) {
                    L18: {
                      if (this.field_P == null) {
                        break L18;
                      } else {
                        if (this.field_P.field_s.a(10, (byte) -82)) {
                          break L18;
                        } else {
                          if (!this.field_P.field_s.a(2, (byte) 122)) {
                            this.field_W.b((byte) 118);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    if (-2 != (this.field_W.field_l.field_R ^ -1)) {
                      break L17;
                    } else {
                      this.a(this.field_P, (byte) -52);
                      this.field_J = false;
                      lf.field_c = 0;
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                }
                L19: {
                  if (this.field_C.field_R != 1) {
                    break L19;
                  } else {
                    if (this.field_l) {
                      break L19;
                    } else {
                      if (this.field_ab) {
                        break L19;
                      } else {
                        if (this.field_w) {
                          break L19;
                        } else {
                          if (this.field_cb) {
                            break L19;
                          } else {
                            if (!cm.field_v) {
                              break L19;
                            } else {
                              this.a((byte) -126);
                              this.field_cb = true;
                              this.field_J = false;
                              this.field_e.a(false, this.field_Y, this.field_h.field_A);
                              uca.a(22, (byte) 103);
                              qm.a(35, 7758);
                              break L19;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                this.field_k = this.field_k - 1;
                break L16;
              }
            }
          }
        }
        L20: {
          if (1 < this.field_k) {
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (this.field_cb) {
            break L21;
          } else {
            if (this.field_A != null) {
              break L21;
            } else {
              if (this.field_s == null) {
                break L21;
              } else {
                if (this.field_l) {
                  break L21;
                } else {
                  if (this.field_ab) {
                    break L21;
                  } else {
                    if (this.field_O.field_T) {
                      break L21;
                    } else {
                      if ((this.field_f ^ -1) < -1) {
                        break L21;
                      } else {
                        if (this.field_J) {
                          break L21;
                        } else {
                          if (1 != lf.field_c) {
                            break L21;
                          } else {
                            this.field_E = this.field_s.field_h;
                            this.field_q = this.field_s.field_s;
                            if ((nd.field_h ^ -1) != -2) {
                              break L21;
                            } else {
                              if (0 > this.field_q) {
                                break L21;
                              } else {
                                if (this.field_h.field_z <= this.field_q) {
                                  break L21;
                                } else {
                                  if (this.field_E < 0) {
                                    break L21;
                                  } else {
                                    if (this.field_E >= this.field_h.field_B) {
                                      break L21;
                                    } else {
                                      if (null == this.field_h.field_a[this.field_q][this.field_E].field_l) {
                                        break L21;
                                      } else {
                                        if (this.field_n != this.field_h.field_a[this.field_q][this.field_E].field_l.field_D) {
                                          break L21;
                                        } else {
                                          L22: {
                                            stackOut_115_0 = this;
                                            stackOut_115_1 = 0;
                                            stackOut_115_2 = this;
                                            stackOut_115_3 = this.field_E;
                                            stackIn_117_0 = stackOut_115_0;
                                            stackIn_117_1 = stackOut_115_1;
                                            stackIn_117_2 = stackOut_115_2;
                                            stackIn_117_3 = stackOut_115_3;
                                            stackIn_116_0 = stackOut_115_0;
                                            stackIn_116_1 = stackOut_115_1;
                                            stackIn_116_2 = stackOut_115_2;
                                            stackIn_116_3 = stackOut_115_3;
                                            if (param0) {
                                              stackOut_117_0 = this;
                                              stackOut_117_1 = stackIn_117_1;
                                              stackOut_117_2 = this;
                                              stackOut_117_3 = stackIn_117_3;
                                              stackOut_117_4 = 0;
                                              stackIn_118_0 = stackOut_117_0;
                                              stackIn_118_1 = stackOut_117_1;
                                              stackIn_118_2 = stackOut_117_2;
                                              stackIn_118_3 = stackOut_117_3;
                                              stackIn_118_4 = stackOut_117_4;
                                              break L22;
                                            } else {
                                              stackOut_116_0 = this;
                                              stackOut_116_1 = stackIn_116_1;
                                              stackOut_116_2 = this;
                                              stackOut_116_3 = stackIn_116_3;
                                              stackOut_116_4 = 1;
                                              stackIn_118_0 = stackOut_116_0;
                                              stackIn_118_1 = stackOut_116_1;
                                              stackIn_118_2 = stackOut_116_2;
                                              stackIn_118_3 = stackOut_116_3;
                                              stackIn_118_4 = stackOut_116_4;
                                              break L22;
                                            }
                                          }
                                          this.a(stackIn_118_1 != 0, this.a(stackIn_118_3, stackIn_118_4 != 0, this.field_q));
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L23: {
          if (!this.field_d) {
            break L23;
          } else {
            this.field_i = this.field_i - 1;
            if ((this.field_i ^ -1) < -1) {
              break L23;
            } else {
              this.field_d = false;
              break L23;
            }
          }
        }
        L24: {
          if ((this.field_n ^ -1) <= -1) {
            this.b(true);
            break L24;
          } else {
            break L24;
          }
        }
        L25: {
          if (!this.field_e.field_a) {
            break L25;
          } else {
            if (this.field_cb) {
              break L25;
            } else {
              if ((this.field_u ^ -1) < -501) {
                break L25;
              } else {
                L26: {
                  if (null != this.field_Z) {
                    this.m(10);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                this.a((byte) 126);
                this.field_cb = true;
                this.field_J = false;
                this.field_e.a(false, this.field_Y, this.field_h.field_A);
                break L25;
              }
            }
          }
        }
        L27: {
          if (this.field_p == 250) {
            qm.a(36, 7758);
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          if (-1 < (this.field_n ^ -1)) {
            break L28;
          } else {
            L29: {
              if (this.field_h.field_S[this.field_n].field_c) {
                break L29;
              } else {
                if (!this.field_h.b((byte) 61, this.field_n)) {
                  break L28;
                } else {
                  break L29;
                }
              }
            }
            if (this.field_cb) {
              break L28;
            } else {
              this.a((byte) 54);
              this.field_cb = true;
              this.field_J = false;
              break L28;
            }
          }
        }
    }

    public static void p(int param0) {
        field_F = null;
        if (param0 != -1) {
            field_F = (kv) null;
        }
    }

    private final void c(byte param0) {
        ad var3 = null;
        int var4 = 0;
        tv var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        gm var10 = null;
        var8 = BachelorFridge.field_y;
        var9 = (gm) ((Object) this.field_Z);
        var10 = var9;
        var3 = this.field_G[this.field_Z.field_h.field_f];
        this.field_N = this.field_s.field_s;
        this.field_H = this.field_s.field_h;
        if (-1 < (this.field_N ^ -1)) {
          return;
        } else {
          L0: {
            if (this.field_h.field_z <= this.field_N) {
              break L0;
            } else {
              if (this.field_H < 0) {
                break L0;
              } else {
                if (this.field_h.field_B <= this.field_H) {
                  break L0;
                } else {
                  L1: {
                    var4 = var3.field_s.f((byte) 127);
                    var5 = (tv) ((Object) ur.field_e[var9.field_g]);
                    if (param0 > 103) {
                      break L1;
                    } else {
                      this.b(102, -121);
                      break L1;
                    }
                  }
                  L2: {
                    if (32 == var3.field_s.field_y) {
                      break L2;
                    } else {
                      if (this.field_h.field_E != 0) {
                        break L2;
                      } else {
                        if (this.field_h.field_a[var3.field_s.field_x][var3.field_s.field_J].field_i) {
                          break L2;
                        } else {
                          var4 = var4 >> 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (hl.a((byte) 100, var10.field_g)) {
                      var4 = var4 << 1;
                      var4 = var4 + var5.field_l;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var3.field_s.field_x != this.field_N) {
                        break L5;
                      } else {
                        if (!this.field_h.field_a[this.field_N][this.field_H].field_g) {
                          this.field_h.field_a[this.field_N][this.field_H].field_g = true;
                          var6 = this.field_H + -var3.field_s.field_J;
                          var7 = Math.abs(var6);
                          L6: while (true) {
                            L7: {
                              if (var7 <= 0) {
                                break L7;
                              } else {
                                if (-1 > (var6 ^ -1)) {
                                  L8: {
                                    L9: {
                                      if (this.field_h.field_B <= var3.field_s.field_J - -var7) {
                                        break L9;
                                      } else {
                                        if (var3.field_s.a(this.field_h.field_a[var3.field_s.field_x][var7 + var3.field_s.field_J].field_n, false)) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var6 = -1 + var7;
                                    if (this.field_h.field_B > var3.field_s.field_J + var7) {
                                      break L8;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var7--;
                                  continue L6;
                                } else {
                                  if (var6 < 0) {
                                    L10: {
                                      if (var3.field_s.field_J + -var7 < 0) {
                                        break L10;
                                      } else {
                                        if (!var3.field_s.a(this.field_h.field_a[var3.field_s.field_x][-var7 + var3.field_s.field_J].field_n, false)) {
                                          break L10;
                                        } else {
                                          var7--;
                                          continue L6;
                                        }
                                      }
                                    }
                                    var6 = -(-1 + var7);
                                    if (var3.field_s.field_J - var7 <= 0) {
                                      break L7;
                                    } else {
                                      var7--;
                                      continue L6;
                                    }
                                  } else {
                                    continue L6;
                                  }
                                }
                              }
                            }
                            L11: {
                              if (-1 == (var6 ^ -1)) {
                                break L11;
                              } else {
                                if (Math.abs(var6) <= var4) {
                                  this.a(true, (byte) -88, var10, var6);
                                  break L4;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            this.m(10);
                            this.field_h.field_a[this.field_N][this.field_H].field_g = false;
                            break L4;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L12: {
                      if (this.field_H != var3.field_s.field_J) {
                        break L12;
                      } else {
                        if (this.field_h.field_a[this.field_N][this.field_H].field_g) {
                          break L12;
                        } else {
                          var6 = -var3.field_s.field_x + this.field_N;
                          this.field_h.field_a[this.field_N][this.field_H].field_g = true;
                          var7 = Math.abs(var6);
                          L13: while (true) {
                            L14: {
                              if (-1 <= (var7 ^ -1)) {
                                break L14;
                              } else {
                                if (var6 > 0) {
                                  L15: {
                                    L16: {
                                      if (var3.field_s.field_x - -var7 >= this.field_h.field_z) {
                                        break L16;
                                      } else {
                                        if (!var3.field_s.a(this.field_h.field_a[var7 + var3.field_s.field_x][var3.field_s.field_J].field_n, false)) {
                                          break L16;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var6 = var7 - 1;
                                    if (this.field_q + var7 < -1 + this.field_h.field_z) {
                                      break L15;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  var7--;
                                  continue L13;
                                } else {
                                  if (var6 < 0) {
                                    L17: {
                                      if (0 > -var7 + var3.field_s.field_x) {
                                        break L17;
                                      } else {
                                        if (!var3.field_s.a(this.field_h.field_a[-var7 + var3.field_s.field_x][var3.field_s.field_J].field_n, false)) {
                                          break L17;
                                        } else {
                                          var7--;
                                          continue L13;
                                        }
                                      }
                                    }
                                    var6 = -(var7 + -1);
                                    if (-1 <= (-var7 + this.field_q ^ -1)) {
                                      break L14;
                                    } else {
                                      var7--;
                                      continue L13;
                                    }
                                  } else {
                                    continue L13;
                                  }
                                }
                              }
                            }
                            L18: {
                              if (0 == var6) {
                                break L18;
                              } else {
                                if (Math.abs(var6) <= var4) {
                                  this.a(false, (byte) -88, var10, var6);
                                  break L4;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            this.m(10);
                            this.field_h.field_a[this.field_N][this.field_H].field_g = false;
                            break L4;
                          }
                        }
                      }
                    }
                    this.m(10);
                    this.field_h.field_a[this.field_N][this.field_H].field_g = false;
                    break L4;
                  }
                  this.field_N = -1;
                  this.field_H = -1;
                  return;
                }
              }
            }
          }
          return;
        }
    }

    private final void b(int param0) {
        ej.a(592, 16776960, fha.field_j[-1 + this.field_M][0], true, 16, 86);
        ej.a(592, 16776960, fha.field_j[-1 + this.field_M][1], true, 30, -66);
        if (!(!this.field_e.field_a)) {
            ika.a(3, 2, 563, 16777215, -54, 52, this.field_p / 50, 256);
            ika.a(3, 1, 597, 16777215, -120, 52, this.field_p / 50, 256);
        }
        int var2 = 63 / ((param0 - 66) / 46);
    }

    final void a(int param0) {
        if (param0 != 7955) {
            return;
        }
        if (this.field_A != null) {
            this.field_A.d(15204352);
        }
    }

    final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = -90 % ((47 - param0) / 50);
        if ((this.field_h.field_o ^ -1) != -3) {
          return;
        } else {
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_h.field_i.length) {
              return;
            } else {
              if (-1 != this.field_h.field_i[var3][2]) {
                this.field_T[this.field_h.field_i[var3][2]] = this.field_T[this.field_h.field_i[var3][2]] + 1;
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    gj(op param0, int param1, rk[] param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var16 = null;
        int[] var17 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        this.field_B = -1;
        this.field_I = -1;
        this.field_r = true;
        this.field_d = false;
        try {
          L0: {
            this.a(param2, param0, 19273, param1);
            this.field_e = new fs((gj) (this), param3);
            this.field_j = new eaa();
            this.field_X = new eaa();
            this.j(-15503);
            this.field_S = new eaa();
            this.field_fb = new eaa();
            this.field_v = new int[255];
            var5_int = 0;
            L1: while (true) {
              if (-256 >= (var5_int ^ -1)) {
                L2: {
                  this.field_T = new int[param0.field_d];
                  if (0 != param0.field_A) {
                    break L2;
                  } else {
                    lna.field_q = false;
                    break L2;
                  }
                }
                wj.field_g = lna.field_q;
                var9 = new int[256];
                var16 = var9;
                var6 = 0;
                L3: while (true) {
                  if ((var6 ^ -1) <= -257) {
                    this.field_x = new kv(45, 45);
                    this.field_x.b();
                    dg.a(352, 352, 352, 255, var16);
                    hga.field_U.a((byte) 120);
                    var17 = nga.field_i;
                    var7 = 0;
                    L4: while (true) {
                      if (-9 >= (var7 ^ -1)) {
                        break L0;
                      } else {
                        var17[var7] = 0;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var9[var6] = 65793 * var6;
                    var6++;
                    continue L3;
                  }
                }
              } else {
                this.field_v[var5_int] = 256 * var5_int;
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("gj.<init>(");
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final boolean h(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 115) {
          L0: {
            L1: {
              if (null == this.field_A) {
                break L1;
              } else {
                if (!this.field_A.field_b) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final void h(int param0) {
        int var2 = 0;
        kv var3 = null;
        int var4 = 0;
        ad var5 = null;
        var4 = BachelorFridge.field_y;
        if (13 == gf.field_k) {
          L0: {
            var2 = 1;
            if (!this.field_e.field_a) {
              break L0;
            } else {
              L1: {
                if ((this.field_n ^ -1) > -1) {
                  break L1;
                } else {
                  if ((1 << this.field_n & this.field_h.field_s) != 0) {
                    break L1;
                  } else {
                    if (this.field_h.field_r) {
                      dg.g(0, 0, 640, 480);
                      var3 = new kv(640, 480);
                      fc.a(480, 640, var3, 0, (byte) -90, 0);
                      eq.a(var3, (gj) (this), (byte) -111);
                      sia.field_h = false;
                      var2 = 3;
                      break L0;
                    } else {
                      var2 = 2;
                      break L0;
                    }
                  }
                }
              }
              var2 = 4;
              break L0;
            }
          }
          lg.a(true, var2, false);
          return;
        } else {
          L2: {
            if (param0 == 480) {
              break L2;
            } else {
              var5 = (ad) null;
              this.a(96, (ad) null, -66);
              break L2;
            }
          }
          L3: {
            if (-103 == (gf.field_k ^ -1)) {
              this.field_s.a((byte) -57, this.field_E, this.field_q);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (hea.field_r < 2) {
              break L4;
            } else {
              if ((gf.field_k ^ -1) != -51) {
                break L4;
              } else {
                if (!wga.field_q[82]) {
                  break L4;
                } else {
                  sja.field_fb.c(93, (byte) 113);
                  System.out.println("--- STATE DUMP REQUESTED ---");
                  System.out.println(this.field_h.k((byte) -72));
                  System.out.println("--- STATE DUMP ENDS ---");
                  break L4;
                }
              }
            }
          }
          return;
        }
    }

    final ad a(int param0, boolean param1, int param2) {
        if (param1) {
            this.field_X = (eaa) null;
        }
        return this.b(this.field_h.field_a[param2][param0].field_l, -23990);
    }

    final void a(byte param0, int param1) {
        boolean discarded$2 = false;
        tv var4 = null;
        if (this.field_P == null) {
          return;
        } else {
          L0: {
            if (!this.a(this.field_P.field_s, (byte) 19)) {
              break L0;
            } else {
              if (!this.field_P.field_s.a(8, (byte) 55)) {
                L1: {
                  qm.a(10, 7758);
                  this.field_ab = false;
                  this.field_w = false;
                  this.field_l = true;
                  if (param0 <= -28) {
                    break L1;
                  } else {
                    discarded$2 = this.c(107);
                    break L1;
                  }
                }
                this.field_db = param1;
                var4 = (tv) ((Object) al.a(-113, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]));
                this.field_P.a(16776960, 89, var4.field_f);
                this.field_Z = (sfa) ((Object) new gm(this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]], this.field_P.field_s));
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    private final void j(int param0) {
        ad[][] var2 = null;
        int var3 = 0;
        ad[] var4 = null;
        ad[] var5 = null;
        int var6 = 0;
        ad var7 = null;
        int var8 = 0;
        ad var9 = null;
        ad[][] var10 = null;
        L0: {
          var8 = BachelorFridge.field_y;
          this.field_U = 0;
          this.field_Y = new sfa[7];
          if (null == this.field_o) {
            break L0;
          } else {
            var10 = this.field_o;
            var2 = var10;
            var3 = 0;
            L1: while (true) {
              if (var10.length <= var3) {
                break L0;
              } else {
                var4 = var10[var3];
                var5 = var4;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var5.length) {
                    var3++;
                    continue L1;
                  } else {
                    var7 = var5[var6];
                    if (var7 != null) {
                      var7.field_l = false;
                      if ((var7.field_s.field_I ^ -1) < -1) {
                        var7.b(false);
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
        L3: {
          if (param0 == -15503) {
            break L3;
          } else {
            var9 = (ad) null;
            this.a((ad) null, -22, (ad) null, -20, (byte) -100);
            break L3;
          }
        }
    }

    final int c(int param0, int param1) {
        int var4 = BachelorFridge.field_y;
        int var3 = 8421504;
        if (param1 != 2271) {
            this.field_I = 87;
        }
        if (param0 != -1) {
            if (param0 == 0) {
                var3 = 16711680;
            } else {
                if (param0 == 1) {
                    var3 = 6735384;
                } else {
                    if (param0 == 2) {
                        var3 = 16776960;
                    } else {
                        if (!((param0 ^ -1) != -4)) {
                            var3 = 33243;
                        }
                    }
                }
            }
        }
        return var3;
    }

    static {
    }
}
