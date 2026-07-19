/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha {
    int field_db;
    int field_O;
    private int[] field_M;
    int[] field_zb;
    int field_ib;
    static String field_nb;
    int[][] field_a;
    private int field_Db;
    boolean field_X;
    private int field_ab;
    boolean field_kb;
    private int[] field_yb;
    boolean field_eb;
    float field_bb;
    int field_R;
    int[] field_h;
    int field_D;
    int field_gb;
    om field_K;
    int field_Q;
    int[] field_m;
    ln[] field_T;
    private boolean field_Fb;
    static String field_q;
    at field_l;
    go[] field_w;
    private int field_A;
    boolean field_L;
    int[] field_H;
    int field_xb;
    int[] field_fb;
    int field_e;
    private int[] field_Y;
    int field_Gb;
    boolean field_qb;
    boolean field_Cb;
    private int[] field_N;
    ne[] field_Eb;
    at field_k;
    vh field_Z;
    int[] field_S;
    boolean field_Ab;
    int field_cb;
    int field_hb;
    int field_W;
    int field_tb;
    at[] field_t;
    private int[] field_d;
    int field_C;
    int field_sb;
    private int[] field_n;
    int field_i;
    boolean field_o;
    int[] field_ub;
    boolean field_J;
    int field_u;
    boolean field_x;
    private int[] field_g;
    private int[] field_U;
    int[] field_rb;
    boolean field_b;
    int[] field_G;
    int[] field_p;
    String[] field_lb;
    boolean field_V;
    int field_v;
    boolean field_wb;
    int[][] field_z;
    int[][] field_B;
    boolean field_Bb;
    boolean field_f;
    ul field_j;
    private int field_I;
    int[][] field_c;
    private tt field_P;
    private int field_vb;
    int[][] field_E;
    int field_jb;
    int[] field_s;
    int[] field_ob;
    private int[] field_y;
    static String field_pb;
    boolean field_r;
    int[] field_mb;
    boolean field_F;

    final go d(int param0, int param1) {
        if ((param0 ^ -1) > param1) {
            return null;
        }
        if (param0 > this.field_yb.length) {
            return null;
        }
        return this.field_w[this.field_yb[param0]];
    }

    final void a(int param0, jd param1) {
        RuntimeException runtimeException = null;
        tc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_t.length <= param1.field_O) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_t[param1.field_O].a((byte) -119, (tc) (param1));
                if (param0 == 8288) {
                  break L1;
                } else {
                  this.l(-73, -26);
                  break L1;
                }
              }
              var3 = this.field_k.e((byte) 96);
              L2: while (true) {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L4: {
                        if (!(var3 instanceof mm)) {
                          break L4;
                        } else {
                          ((mm) ((Object) var3)).a(param1, (byte) -2);
                          break L4;
                        }
                      }
                      var3 = this.field_k.a((byte) 123);
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("ha.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(jd param0, int param1) {
        int var3_int = 0;
        try {
            if (param1 >= -87) {
                this.field_cb = -63;
            }
            if (param0 != null) {
                var3_int = this.b(31, param0.field_w, param0.field_J, param0.field_O);
                param0.field_v = -1 != (16 & var3_int ^ -1) ? true : false;
                param0.field_Z = (4 & var3_int) != 0 ? true : false;
                param0.field_eb = (var3_int & 8) != 0 ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, jd param4, boolean param5) {
        RuntimeException var7 = null;
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
              if (param1 == -16) {
                break L1;
              } else {
                this.field_w = (go[]) null;
                break L1;
              }
            }
            stackOut_2_0 = pj.a(this.field_v, this.field_Eb, param5, param2, param3, this.field_db, this.o(param3, param1 ^ 15), param4, param0, false, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("ha.VD(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, byte[] param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (-7 < (param1.length ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var3_int = param0 * 12 + 6;
                    if (-1 == (128 & param1[var3_int] ^ -1)) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L2;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var5 = stackIn_8_0;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        var3_int++;
                        var3_int++;
                        var4 = param1[var3_int] & 255;
                        if (!ArmiesOfGielinor.field_M) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3_int++;
                    var4 = 255 & param1[var3_int];
                    break L3;
                  }
                  L5: {
                    if (!param2) {
                      break L5;
                    } else {
                      field_nb = (String) null;
                      break L5;
                    }
                  }
                  stackOut_13_0 = var4 / param0 - -1;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("ha.GC(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_14_0;
        }
    }

    final void b(byte param0, int param1, int param2, int param3) {
        this.field_Eb[param2 - -(param3 * this.field_v)].field_h = param1;
        this.field_Eb[param3 * this.field_v + param2].field_b = true;
        int var5 = 96 % ((59 - param0) / 34);
    }

    final at a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        jd var5_ref_jd = null;
        int var5 = 0;
        int var6_int = 0;
        jd var6 = null;
        ne var7 = null;
        int var8 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_42_0 = false;
        boolean stackIn_60_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_35_0 = false;
        boolean stackOut_41_0 = false;
        boolean stackOut_59_0 = false;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = null;
          if (!this.field_b) {
            break L0;
          } else {
            var4 = new at();
            break L0;
          }
        }
        this.g((byte) -15);
        if (param0) {
          return (at) (var4);
        } else {
          L1: {
            var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].e((byte) 116));
            if (param2 == 0) {
              break L1;
            } else {
              this.field_o = false;
              break L1;
            }
          }
          L2: while (true) {
            L3: {
              L4: {
                L5: {
                  L6: {
                    if (var5_ref_jd == null) {
                      break L6;
                    } else {
                      stackOut_8_0 = var5_ref_jd.i(-21428);
                      stackIn_36_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var8 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (!stackIn_9_0) {
                            break L7;
                          } else {
                            if (!var5_ref_jd.t(param2 + 26440)) {
                              var6_int = var5_ref_jd.field_J - -(var5_ref_jd.field_w * this.field_v);
                              if ((var5_ref_jd.field_J ^ -1) > -1) {
                                break L7;
                              } else {
                                if ((this.field_Eb.length ^ -1) >= (var5_ref_jd.field_J ^ -1)) {
                                  break L7;
                                } else {
                                  if ((var5_ref_jd.field_w ^ -1) > -1) {
                                    break L7;
                                  } else {
                                    if (var5_ref_jd.field_w < this.field_Eb.length) {
                                      var7 = this.field_Eb[var6_int];
                                      if (!var7.a(false)) {
                                        break L7;
                                      } else {
                                        L8: {
                                          if (var7.field_a < 0) {
                                            break L8;
                                          } else {
                                            if (!this.c(var7.field_a, -16985, this.field_gb)) {
                                              break L8;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        var7.field_m = var7.field_m - var5_ref_jd.g((byte) 122);
                                        if ((var7.field_m ^ -1) >= -1) {
                                          if (this.field_b) {
                                            L9: {
                                              if (param1) {
                                                break L9;
                                              } else {
                                                this.field_l.a((byte) -119, (tc) (new qq(0, var5_ref_jd.field_J, var5_ref_jd.field_w, var5_ref_jd.field_O)));
                                                if (var8 == 0) {
                                                  break L7;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            ((at) (var4)).a((byte) -119, (tc) (new ss(var5_ref_jd.field_J, var5_ref_jd.field_w, 0, this.field_gb)));
                                            break L7;
                                          } else {
                                            break L7;
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].e((byte) 102));
                  L10: while (true) {
                    L11: {
                      if (var5_ref_jd == null) {
                        break L11;
                      } else {
                        var5_ref_jd.n((byte) -42);
                        var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                        if (var8 != 0) {
                          break L4;
                        } else {
                          if (var8 == 0) {
                            continue L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_35_0 = param1;
                    stackIn_36_0 = stackOut_35_0;
                    break L5;
                  }
                }
                if (stackIn_36_0) {
                  break L4;
                } else {
                  break L3;
                }
              }
              this.h((byte) 108);
              break L3;
            }
            var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].d((byte) -81));
            L12: while (true) {
              L13: {
                L14: {
                  if (var5_ref_jd == null) {
                    break L14;
                  } else {
                    stackOut_41_0 = var5_ref_jd.field_S;
                    stackIn_60_0 = stackOut_41_0;
                    stackIn_42_0 = stackOut_41_0;
                    if (var8 != 0) {
                      break L13;
                    } else {
                      L15: {
                        L16: {
                          if (!stackIn_42_0) {
                            break L16;
                          } else {
                            if (var8 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        L17: {
                          if (!param1) {
                            break L17;
                          } else {
                            L18: {
                              if (!var5_ref_jd.t(26440)) {
                                break L18;
                              } else {
                                ((at) (var4)).a((byte) -119, (tc) (new il(var5_ref_jd.field_J, var5_ref_jd.field_w, var5_ref_jd, this.field_Eb[var5_ref_jd.field_w * this.field_v + var5_ref_jd.field_J])));
                                break L18;
                              }
                            }
                            L19: {
                              if (!var5_ref_jd.e((byte) 79)) {
                                break L19;
                              } else {
                                if ((this.field_H[var5_ref_jd.field_O] ^ -1) > -11) {
                                  ((at) (var4)).a((byte) -119, (tc) (new pl(var5_ref_jd.field_O, var5_ref_jd, 0)));
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            if ((var5_ref_jd.field_N ^ -1) != -11) {
                              break L17;
                            } else {
                              if (!this.field_Eb[var5_ref_jd.field_J + var5_ref_jd.field_w * this.field_v].c(93)) {
                                break L17;
                              } else {
                                if (-20 != (var5_ref_jd.field_t ^ -1)) {
                                  break L17;
                                } else {
                                  ((at) (var4)).a((byte) -119, (tc) (new dk(var5_ref_jd.field_O, this.field_W)));
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                        var5_ref_jd.k(-1);
                        if (!param1) {
                          break L15;
                        } else {
                          this.h((byte) 108);
                          this.d(this.field_gb, this.field_t[this.field_gb].b(false), 91, 13);
                          this.d(this.field_gb, this.field_ob[this.field_gb], param2 ^ 82, 12);
                          break L15;
                        }
                      }
                      var5_ref_jd = (jd) ((Object) this.field_t[this.field_gb].b((byte) 100));
                      if (var8 == 0) {
                        continue L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                stackOut_59_0 = param1;
                stackIn_60_0 = stackOut_59_0;
                break L13;
              }
              L20: {
                if (!stackIn_60_0) {
                  break L20;
                } else {
                  var5 = 0;
                  var6 = (jd) ((Object) this.field_t[this.field_gb].e((byte) 102));
                  L21: while (true) {
                    L22: {
                      L23: {
                        if (var6 == null) {
                          break L23;
                        } else {
                          stackOut_63_0 = var6.field_N ^ -1;
                          stackOut_63_1 = -21;
                          stackIn_69_0 = stackOut_63_0;
                          stackIn_69_1 = stackOut_63_1;
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          if (var8 != 0) {
                            break L22;
                          } else {
                            L24: {
                              if (stackIn_64_0 == stackIn_64_1) {
                                var5++;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            var6 = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                            if (var8 == 0) {
                              continue L21;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      stackOut_68_0 = var5 ^ -1;
                      stackOut_68_1 = -26;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      break L22;
                    }
                    if (stackIn_69_0 <= stackIn_69_1) {
                      ((at) (var4)).a((byte) -119, (tc) (new kj(this.field_gb, this.field_W)));
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
              return (at) (var4);
            }
          }
        }
    }

    final void b(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        int[] var10 = null;
        jd var11 = null;
        jd var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        Object stackIn_65_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        Object stackOut_64_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.field_M ? 1 : 0;
                    this.field_e = this.field_e | 1 << param1;
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 >= this.field_W) {
                        statePc = 60;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = this.field_n[var4];
                    stackOut_2_1 = param1;
                    stackIn_61_0 = stackOut_2_0;
                    stackIn_61_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (var9 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var9 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_n[var4] < 0) {
                        statePc = 8;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_n[var4] = param1;
                    if (!this.field_wb) {
                        statePc = 44;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = 0;
                    var6 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((var6 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = param1 ^ -1;
                    stackOut_11_1 = var6 ^ -1;
                    stackIn_18_0 = stackOut_11_0;
                    stackIn_18_1 = stackOut_11_1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (var9 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 == stackIn_12_1) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!this.c(var6, -16985, param1)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (0 != (this.field_e & 1 << var6)) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var6++;
                    if (var9 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = var5 ^ -1;
                    stackOut_17_1 = -1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 >= stackIn_18_1) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (!param2) {
                        statePc = 26;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var11 = (jd) ((Object) this.field_t[param1].e((byte) 87));
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var11 == null) {
                        statePc = 43;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_l.a((byte) -119, (tc) (new hp(var11, true)));
                    var11 = (jd) ((Object) this.field_t[param1].a((byte) 123));
                    if (var9 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var9 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var10 = new int[var5];
                    var5 = 0;
                    var7 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((this.field_W ^ -1) >= (var7 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = var7 ^ -1;
                    stackOut_28_1 = param1 ^ -1;
                    stackIn_36_0 = stackOut_28_0;
                    stackIn_36_1 = stackOut_28_1;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    if (var9 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 == stackIn_29_1) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (!this.c(var7, param0 + -26986, param1)) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((1 << var7 & this.field_e ^ -1) != -1) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var10[var5] = var7;
                    var5++;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var5 = 0;
                    var7 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = this.field_Eb.length ^ -1;
                    stackOut_35_1 = var7 ^ -1;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (stackIn_36_0 >= stackIn_36_1) {
                        statePc = 43;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var8 = this.field_Eb[var7].field_c;
                    stackOut_37_0 = null;
                    stackIn_65_0 = stackOut_37_0;
                    stackIn_38_0 = stackOut_37_0;
                    if (var9 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (stackIn_38_0 == var8) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (param1 == var8.field_O) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_l.a((byte) -119, (tc) (new as(var8, var10[var5 % var10.length], false)));
                    var5++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var9 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var5 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_db * this.field_v <= var5) {
                        statePc = 51;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackOut_46_0 = param1;
                    stackOut_46_1 = this.field_Eb[var5].field_a;
                    stackIn_61_0 = stackOut_46_0;
                    stackIn_61_1 = stackOut_46_1;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    if (var9 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 != stackIn_47_1) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    this.field_Eb[var5].field_a = -1;
                    if (11 != this.field_Eb[var5].field_h) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_Eb[var5].field_h = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (null == this.field_K) {
                        statePc = 60;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var12 = (jd) ((Object) this.field_t[param1].e((byte) 87));
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var12 == null) {
                        statePc = 57;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_l.a((byte) -119, (tc) (new hp(var12, true)));
                    var12 = (jd) ((Object) this.field_t[param1].a((byte) 123));
                    if (var9 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var9 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var9 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackOut_60_0 = param0;
                    stackOut_60_1 = 10001;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 == stackIn_61_1) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    return;
                }
                case 63: {
                    if (this.e((byte) -42)) {
                        statePc = 68;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackOut_64_0 = null;
                    stackIn_65_0 = stackOut_64_0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 == this.field_K) {
                        statePc = 70;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if ((this.field_K.field_w ^ -1) == (param1 ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (!this.field_b) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    this.field_qb = true;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final at b(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        at var5 = null;
        jd var6 = null;
        int var7 = 0;
        jd var8 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        at stackIn_21_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        at stackIn_50_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        at stackOut_20_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        Object stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        at stackOut_49_0 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_X) {
          throw new IllegalStateException();
        } else {
          if (param2 == 30156) {
            var4 = this.field_gb;
            var8 = (jd) ((Object) this.field_t[this.field_gb].e((byte) 94));
            L0: while (true) {
              L1: {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    var8.m((byte) -36);
                    var8 = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                    if (var7 != 0) {
                      break L1;
                    } else {
                      if (var7 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_mb[this.field_gb] = this.field_mb[this.field_gb] + 1;
                break L1;
              }
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        if (!param0) {
                          break L7;
                        } else {
                          this.a(true);
                          this.field_gb = (this.field_gb - -1) % this.field_W;
                          L8: while (true) {
                            if ((this.field_gb ^ -1) == (var4 ^ -1)) {
                              break L6;
                            } else {
                              stackOut_14_0 = -1;
                              stackOut_14_1 = 1 << this.field_gb & this.field_e ^ -1;
                              stackIn_42_0 = stackOut_14_0;
                              stackIn_42_1 = stackOut_14_1;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              if (var7 != 0) {
                                break L5;
                              } else {
                                if (stackIn_15_0 == stackIn_15_1) {
                                  break L6;
                                } else {
                                  this.field_gb = (this.field_gb + 1) % this.field_W;
                                  if (var7 == 0) {
                                    continue L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var5_int = this.field_gb - -1;
                      L9: while (true) {
                        if (var5_int == this.field_gb) {
                          break L6;
                        } else {
                          stackOut_20_0 = this.field_t[(this.field_gb + 1) % this.field_W];
                          stackIn_50_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var7 != 0) {
                            break L3;
                          } else {
                            var6 = (jd) ((Object) ((at) (Object) stackIn_21_0).e((byte) 119));
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (var6 == null) {
                                    break L12;
                                  } else {
                                    var6.n((byte) -42);
                                    var6 = (jd) ((Object) this.field_t[(1 + this.field_gb) % this.field_W].a((byte) 123));
                                    if (var7 != 0) {
                                      break L11;
                                    } else {
                                      if (var7 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                var6 = (jd) ((Object) this.field_t[(this.field_gb - -1) % this.field_W].e((byte) 95));
                                break L11;
                              }
                              L13: while (true) {
                                L14: {
                                  L15: {
                                    if (var6 == null) {
                                      break L15;
                                    } else {
                                      var6.m((byte) -36);
                                      var6 = (jd) ((Object) this.field_t[(1 + this.field_gb) % this.field_W].a((byte) 123));
                                      if (var7 != 0) {
                                        break L14;
                                      } else {
                                        if (var7 == 0) {
                                          continue L13;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  var5_int = (1 + var5_int) % this.field_W;
                                  break L14;
                                }
                                if (var7 == 0) {
                                  continue L9;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      this.field_Gb = this.field_Gb + 1;
                      this.a(this.field_gb, (byte) -102);
                      if (!param0) {
                        break L16;
                      } else {
                        L17: {
                          if (var4 == this.field_gb) {
                            break L17;
                          } else {
                            if (!this.e((byte) -42)) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        this.field_qb = true;
                        return null;
                      }
                    }
                    if (!param0) {
                      break L4;
                    } else {
                      if (!this.i(0)) {
                        break L4;
                      } else {
                        stackOut_41_0 = var4 ^ -1;
                        stackOut_41_1 = this.field_gb ^ -1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        break L5;
                      }
                    }
                  }
                  L18: {
                    if (stackIn_42_0 < stackIn_42_1) {
                      break L18;
                    } else {
                      if (!this.c((byte) 103)) {
                        break L4;
                      } else {
                        break L18;
                      }
                    }
                  }
                  this.field_qb = true;
                  return null;
                }
                L19: {
                  stackOut_46_0 = this;
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_47_0 = stackOut_46_0;
                  if (-1 >= (var4 ^ -1)) {
                    stackOut_48_0 = this;
                    stackOut_48_1 = 0;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    break L19;
                  } else {
                    stackOut_47_0 = this;
                    stackOut_47_1 = 1;
                    stackIn_49_0 = stackOut_47_0;
                    stackIn_49_1 = stackOut_47_1;
                    break L19;
                  }
                }
                stackOut_49_0 = this.a(stackIn_49_1 != 0, param1, param2 + -30156);
                stackIn_50_0 = stackOut_49_0;
                break L3;
              }
              var5 = stackIn_50_0;
              return var5;
            }
          } else {
            return (at) null;
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = 124 % ((37 - param1) / 34);
              if ((this.field_sb ^ -1) > -1) {
                break L2;
              } else {
                if ((this.field_sb ^ -1) == (param0 ^ -1)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (this.field_sb < 0) {
              break L1;
            } else {
              this.field_Fb = false;
              if (!ArmiesOfGielinor.field_M) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_Fb = true;
          break L0;
        }
        L3: {
          if (0 < this.field_Gb) {
            break L3;
          } else {
            break L3;
          }
        }
    }

    final jd c(int param0, boolean param1, int param2) {
        boolean discarded$0 = false;
        if (param2 < 0) {
            return null;
        }
        if ((param0 ^ -1) > -1) {
            return null;
        }
        if ((param2 ^ -1) <= (this.field_v ^ -1)) {
            return null;
        }
        if (this.field_db <= param0) {
            return null;
        }
        ne var4 = this.field_Eb[param2 + param0 * this.field_v];
        if (!param1) {
            discarded$0 = this.a((int[]) null, -58, 5, -34);
        }
        return var4.field_c;
    }

    private final boolean a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param0[param3];
              if (param2 == -24107) {
                break L1;
              } else {
                this.field_E = (int[][]) null;
                break L1;
              }
            }
            var6 = param0[param1];
            if ((var6 ^ -1) <= (var5_int ^ -1)) {
              L2: {
                if ((var6 ^ -1) != (var5_int ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    var7 = this.i(param3, -12710);
                    var8 = this.i(param1, param2 + 11397);
                    if (var8 < var7) {
                      break L3;
                    } else {
                      if ((var8 ^ -1) == (var7 ^ -1)) {
                        var9 = this.b((byte) 31, param3);
                        var10 = this.b((byte) 31, param1);
                        if ((var10 ^ -1) <= (var9 ^ -1)) {
                          L4: {
                            if ((var9 ^ -1) == (var10 ^ -1)) {
                              var11 = this.field_H[param3];
                              var12 = this.field_H[param1];
                              if ((var11 ^ -1) < (var12 ^ -1)) {
                                stackOut_21_0 = 1;
                                stackIn_22_0 = stackOut_21_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var11 == var12) {
                                  if (param1 > param3) {
                                    stackOut_19_0 = 1;
                                    stackIn_20_0 = stackOut_19_0;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                          if (!ArmiesOfGielinor.field_M) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                  stackOut_24_0 = 1;
                  stackIn_25_0 = stackOut_24_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              decompiledRegionSelector0 = 5;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("ha.BD(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0 != 0;
                } else {
                  return stackIn_27_0 != 0;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        jd var11 = null;
        int var12 = 0;
        jd var13_ref_jd = null;
        int var13 = 0;
        ne var14 = null;
        int var15 = 0;
        int var16 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        L0: {
          var16 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-75 != (param2 ^ -1)) {
            break L0;
          } else {
            this.field_Bb = true;
            if (!this.field_b) {
              break L0;
            } else {
              if (this.field_N[9] >= 0) {
                break L0;
              } else {
                this.field_N[9] = param5;
                break L0;
              }
            }
          }
        }
        L1: {
          var8 = 0;
          var9 = bw.field_m[param2][4] + param6;
          if (this.c(param3, true, param1) != null) {
            this.c(param3, true, param1).d(param4 ^ 91);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var10 = param4;
          if (param2 != 74) {
            break L2;
          } else {
            var10 = 2;
            break L2;
          }
        }
        L3: {
          var11 = new jd(param1, param3, param2, param5, var9, var9, var10, 0, 0, (ha) (this), 0, 0, -1, false, 0);
          this.a(8288, var11);
          if ((var11.g(0) ^ -1) != -5) {
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!re.a(0, (byte) -98)) {
            break L4;
          } else {
            if (this.field_b) {
              L5: {
                if (param2 == 19) {
                  break L5;
                } else {
                  if (-22 == (param2 ^ -1)) {
                    break L5;
                  } else {
                    if (param2 == 20) {
                      break L5;
                    } else {
                      if (0 == param2) {
                        break L5;
                      } else {
                        this.field_Db = this.field_Db | 1 << param5;
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              if ((1 << param5 & this.field_Db) != 0) {
                break L4;
              } else {
                if (0 == (1 << param5 & this.field_I)) {
                  L6: {
                    L7: {
                      var12 = 0;
                      if (param2 != 19) {
                        break L7;
                      } else {
                        var12 = var12 | 1;
                        if (var16 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (-22 == (param2 ^ -1)) {
                        break L8;
                      } else {
                        if (20 != param2) {
                          break L6;
                        } else {
                          var12 = var12 | 4;
                          if (var16 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    var12 = var12 | 2;
                    break L6;
                  }
                  var13_ref_jd = (jd) ((Object) this.field_t[param5].e((byte) 89));
                  L9: while (true) {
                    L10: {
                      L11: {
                        if (var13_ref_jd == null) {
                          break L11;
                        } else {
                          stackOut_30_0 = 19;
                          stackOut_30_1 = var13_ref_jd.field_N;
                          stackIn_40_0 = stackOut_30_0;
                          stackIn_40_1 = stackOut_30_1;
                          stackIn_31_0 = stackOut_30_0;
                          stackIn_31_1 = stackOut_30_1;
                          if (var16 != 0) {
                            break L10;
                          } else {
                            L12: {
                              L13: {
                                if (stackIn_31_0 == stackIn_31_1) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (var13_ref_jd.field_N == 21) {
                                      break L14;
                                    } else {
                                      if (var13_ref_jd.field_N == 20) {
                                        var12 = var12 | 4;
                                        if (var16 == 0) {
                                          break L12;
                                        } else {
                                          break L14;
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var12 = var12 | 2;
                                  if (var16 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var12 = var12 | 1;
                              break L12;
                            }
                            var13_ref_jd = (jd) ((Object) this.field_t[param5].a((byte) 123));
                            if (var16 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      stackOut_39_0 = -8;
                      stackOut_39_1 = var12 ^ -1;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      break L10;
                    }
                    if (stackIn_40_0 != stackIn_40_1) {
                      break L4;
                    } else {
                      this.field_I = this.field_I | 1 << param5;
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            } else {
              break L4;
            }
          }
        }
        L15: {
          if (-59 == (param2 ^ -1)) {
            var8 = ps.field_C[1];
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (-64 == (param2 ^ -1)) {
            var8 = ps.field_C[0];
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          L18: {
            if ((param2 ^ -1) == -60) {
              break L18;
            } else {
              if (param2 == 53) {
                break L18;
              } else {
                if (param2 == 43) {
                  break L18;
                } else {
                  break L17;
                }
              }
            }
          }
          var8 = 1;
          break L17;
        }
        L19: {
          if ((var8 ^ -1) < -1) {
            this.a(param3, param1, 0, 3);
            break L19;
          } else {
            break L19;
          }
        }
        if (!param0) {
          L20: {
            this.field_H[param5] = this.field_H[param5] - bw.field_m[param2][8];
            if (!this.field_b) {
              break L20;
            } else {
              this.field_ub[param5] = this.field_ub[param5] + bw.field_m[param2][8];
              this.d(param5, this.field_ub[param5], 106, 10);
              break L20;
            }
          }
          L21: {
            L22: {
              var12 = bw.field_m[param2][2];
              var13 = bw.field_m[param2][1];
              var14 = this.field_Eb[this.field_v * param3 + param1];
              if (var13 != -1) {
                break L22;
              } else {
                if (var12 != this.field_E[param5][6]) {
                  break L21;
                } else {
                  if ((this.field_E[param5][6] ^ -1) > -6) {
                    this.b(6, param5, 1, (byte) 92);
                    if (var16 == 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  } else {
                    break L21;
                  }
                }
              }
            }
            L23: {
              L24: {
                this.field_U[param5] = oe.c(this.field_U[param5], 1 << var13);
                if (7 != var14.field_h) {
                  break L24;
                } else {
                  if (var12 != this.field_E[param5][var13]) {
                    break L24;
                  } else {
                    var15 = 0;
                    L25: while (true) {
                      if (6 <= var15) {
                        break L24;
                      } else {
                        stackOut_69_0 = var15 ^ -1;
                        stackOut_69_1 = var13 ^ -1;
                        stackIn_76_0 = stackOut_69_0;
                        stackIn_76_1 = stackOut_69_1;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        if (var16 != 0) {
                          break L23;
                        } else {
                          L26: {
                            if (stackIn_70_0 != stackIn_70_1) {
                              break L26;
                            } else {
                              if (5 > this.field_E[param5][var15]) {
                                this.b(var15, param5, 1, (byte) 92);
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                          }
                          var15++;
                          if (var16 == 0) {
                            continue L25;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_75_0 = 11;
              stackOut_75_1 = var14.field_h;
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              break L23;
            }
            if (stackIn_76_0 != stackIn_76_1) {
              break L21;
            } else {
              if ((var13 ^ -1) != (var14.field_g ^ -1)) {
                break L21;
              } else {
                if ((var12 ^ -1) != (var14.field_j ^ -1)) {
                  break L21;
                } else {
                  if (-6 < (var14.field_j ^ -1)) {
                    var14.field_j = var14.field_j + 1;
                    break L21;
                  } else {
                    break L21;
                  }
                }
              }
            }
          }
          L27: {
            if (this.field_b) {
              this.field_Y[param5] = this.field_Y[param5] + 1;
              this.d(param5, this.field_t[param5].b(false), param4 ^ 104, 13);
              this.d(param5, this.field_Y[param5], 119, 5);
              break L27;
            } else {
              break L27;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_V) {
          var2 = param0;
          L0: while (true) {
            L1: {
              if (var2 >= this.field_tb) {
                break L1;
              } else {
                stackOut_4_0 = var2;
                stackIn_14_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var3 != 0) {
                  return stackIn_14_0 != 0;
                } else {
                  if (stackIn_5_0 < 0) {
                    return false;
                  } else {
                    if (var2 < this.field_fb.length) {
                      if ((this.i(var2, param0 + -12710) ^ -1) <= (this.field_xb ^ -1)) {
                        return true;
                      } else {
                        var2++;
                        if (var3 == 0) {
                          continue L0;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            return this.c((byte) 51);
          }
        } else {
          return false;
        }
    }

    private final int f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (this.field_s == null) {
            break L0;
          } else {
            if ((this.field_s.length ^ -1) != -4) {
              break L0;
            } else {
              if (param0 <= -65) {
                var2 = 2 * this.field_O / 3;
                var3 = 50 * this.field_s[0] * var2;
                var3 = var3 + 75 * var2 * this.field_s[1];
                var3 = var3 + this.field_s[2] * var2 * 25;
                if (-2 > (this.field_O ^ -1)) {
                  var4 = var3 / this.field_tb;
                  var4 = var4 / 500 * 500 + 500;
                  return var4;
                } else {
                  return 0;
                }
              } else {
                return 72;
              }
            }
          }
        }
        return 0;
    }

    final boolean a(int param0, int param1, int param2, jd param3) {
        ne var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (-1 < (param2 ^ -1)) {
                break L1;
              } else {
                if (param0 < 0) {
                  break L1;
                } else {
                  if ((param2 ^ -1) <= (this.field_v ^ -1)) {
                    break L1;
                  } else {
                    if ((this.field_db ^ -1) <= (param0 ^ -1)) {
                      L2: {
                        if (param1 == -26633) {
                          break L2;
                        } else {
                          this.field_N = (int[]) null;
                          break L2;
                        }
                      }
                      var5 = this.field_Eb[param2 + this.field_v * param0];
                      if (null == var5.field_c) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        if (!this.c(var5.field_c.field_O, -16985, param3.field_O)) {
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5_ref);
            stackOut_18_1 = new StringBuilder().append("ha.JD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final void a(int param0, ne param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (null == param1.field_c) {
                break L1;
              } else {
                if (param1.c(-32)) {
                  param1.i(param0 + 114);
                  if (-100 < (param1.field_c.field_t ^ -1)) {
                    this.field_l.a((byte) -119, (tc) (new st(param1.field_c, 4)));
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -100) {
                break L2;
              } else {
                this.field_t = (at[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ha.AE(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2 ^ -1) <= (this.field_S.length ^ -1)) {
                break L2;
              } else {
                this.field_S[var2] = this.field_fb[var2];
                var2++;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = -74 % ((39 - param0) / 49);
            break L1;
          }
          L3: {
            if ((this.field_gb ^ -1) <= -1) {
              var3 = 0;
              L4: while (true) {
                if ((var3 ^ -1) <= (this.field_v ^ -1)) {
                  break L3;
                } else {
                  if (var5 != 0) {
                    break L3;
                  } else {
                    var4 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if ((var4 ^ -1) <= (this.field_db ^ -1)) {
                            break L7;
                          } else {
                            this.field_Eb[var3 + this.field_v * var4].a(var4, var3, this.field_gb, 0);
                            var4++;
                            if (var5 != 0) {
                              break L6;
                            } else {
                              if (var5 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var3++;
                        break L6;
                      }
                      if (var5 == 0) {
                        continue L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final static int b(int param0, int param1, int param2) {
        if (param2 != -4) {
            field_q = (String) null;
        }
        int var3 = param0;
        if (nv.c(0, param1)) {
            if (-4 == (param0 ^ -1)) {
                var3 = 3;
            }
        }
        return var3;
    }

    final void b(int param0, boolean param1, int param2, int param3, int param4) {
        ne var6 = null;
        int var7 = 0;
        int var8 = 0;
        ne var9 = null;
        ne stackIn_7_0 = null;
        ne stackIn_8_0 = null;
        ne stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ne stackOut_6_0 = null;
        ne stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ne stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if ((param4 ^ -1) > -1) {
          return;
        } else {
          L0: {
            if ((param4 ^ -1) <= (this.field_db ^ -1)) {
              break L0;
            } else {
              if (-1 < (param0 ^ -1)) {
                break L0;
              } else {
                if ((this.field_v ^ -1) < (param0 ^ -1)) {
                  L1: {
                    var9 = this.field_Eb[param0 - -(this.field_v * param4)];
                    var6 = var9;
                    stackOut_6_0 = (ne) (var6);
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (!param1) {
                      stackOut_8_0 = (ne) ((Object) stackIn_8_0);
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L1;
                    } else {
                      stackOut_7_0 = (ne) ((Object) stackIn_7_0);
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              L8: {
                                L9: {
                                  L10: {
                                    L11: {
                                      stackIn_9_0.field_b = stackIn_9_1 != 0;
                                      var7 = param2;
                                      if (14 != var7) {
                                        break L11;
                                      } else {
                                        if (var8 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (var7 != 9) {
                                        break L12;
                                      } else {
                                        if (var8 == 0) {
                                          break L10;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if ((var7 ^ -1) == -5) {
                                      break L9;
                                    } else {
                                      L13: {
                                        if (3 != var7) {
                                          break L13;
                                        } else {
                                          if (var8 == 0) {
                                            break L8;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      if ((var7 ^ -1) == -6) {
                                        break L7;
                                      } else {
                                        if (-1 == (var7 ^ -1)) {
                                          break L6;
                                        } else {
                                          if (1 == var7) {
                                            break L5;
                                          } else {
                                            if (var7 == 10) {
                                              break L4;
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (8 != var9.field_h) {
                                    break L2;
                                  } else {
                                    if (this.c(var9.field_a, -16985, param3)) {
                                      var7 = var9.e(10);
                                      var6.field_h = param2;
                                      var9.field_m = var9.field_m + (-var7 + var9.e(10));
                                      this.f(-2);
                                      this.b(2);
                                      if (var8 == 0) {
                                        break L3;
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                L14: {
                                  if (-2 == (var9.field_h ^ -1)) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if ((var9.field_h ^ -1) == -1) {
                                        break L15;
                                      } else {
                                        if (-4 == (var9.field_h ^ -1)) {
                                          break L15;
                                        } else {
                                          if (5 != var9.field_h) {
                                            break L3;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    var6.field_h = 4;
                                    if (var8 == 0) {
                                      break L3;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var6.field_h = 10;
                                if (var8 == 0) {
                                  break L3;
                                } else {
                                  break L8;
                                }
                              }
                              if (var9.field_h != 0) {
                                break L3;
                              } else {
                                var6.field_h = 3;
                                if (var8 == 0) {
                                  break L3;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L16: {
                              if (-1 == (var9.field_h ^ -1)) {
                                break L16;
                              } else {
                                if (var9.field_h == 3) {
                                  break L16;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            var6.field_h = 5;
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                          L17: {
                            if (-3 != (var9.field_h ^ -1)) {
                              break L17;
                            } else {
                              var6.field_h = 0;
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (12 == var9.field_h) {
                            var6.field_h = 13;
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          } else {
                            break L2;
                          }
                        }
                        L18: {
                          if (-1 == (var9.field_h ^ -1)) {
                            break L18;
                          } else {
                            if (var9.field_h == 3) {
                              break L18;
                            } else {
                              if ((var9.field_h ^ -1) == -6) {
                                break L18;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        var6.field_h = 1;
                        if (var8 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L19: {
                        L20: {
                          if (-7 == (var9.field_h ^ -1)) {
                            break L20;
                          } else {
                            if (4 != var9.field_h) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var6.field_h = 10;
                        break L19;
                      }
                      if (-6 == (var9.field_h ^ -1)) {
                        var6.field_h = 1;
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                    break L2;
                  }
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final boolean b(int param0, boolean param1) {
        if (!(!this.field_f)) {
            return false;
        }
        if (!(this.field_P.a((byte) -88, param0))) {
            return false;
        }
        if (!param1) {
            this.field_vb = 102;
        }
        this.b(10001, param0, false);
        return true;
    }

    final at f(int param0, int param1) {
        if (null == this.field_t) {
            return null;
        }
        if (0 > param0) {
            return null;
        }
        if ((param0 ^ -1) <= (this.field_t.length ^ -1)) {
            return null;
        }
        if (param1 != 0) {
            this.field_fb = (int[]) null;
        }
        return this.field_t[param0];
    }

    private final void b(int[] param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        jd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param1 == 12534) {
                break L1;
              } else {
                this.a((vh) null, (byte) -4);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if ((this.field_tb ^ -1) >= (var5_int ^ -1)) {
                    break L4;
                  } else {
                    param0[var5_int] = 0;
                    var5_int++;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var5_int = -3;
                break L3;
              }
              L5: while (true) {
                stackOut_9_0 = var5_int ^ -1;
                stackOut_9_1 = -4;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                L6: while (true) {
                  L7: {
                    if (stackIn_10_0 < stackIn_10_1) {
                      break L7;
                    } else {
                      if (var10 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var6 = -3;
                        L8: while (true) {
                          L9: {
                            if (3 < var6) {
                              break L9;
                            } else {
                              var7 = Math.abs(var5_int) - -Math.abs(var6);
                              stackOut_14_0 = -1;
                              stackOut_14_1 = param3 + var5_int ^ -1;
                              stackIn_10_0 = stackOut_14_0;
                              stackIn_10_1 = stackOut_14_1;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              if (var10 != 0) {
                                continue L6;
                              } else {
                                L10: {
                                  if (stackIn_15_0 < stackIn_15_1) {
                                    break L10;
                                  } else {
                                    if ((param3 + var5_int ^ -1) <= (this.field_v ^ -1)) {
                                      break L10;
                                    } else {
                                      if ((var6 - -param2 ^ -1) > -1) {
                                        break L10;
                                      } else {
                                        if ((var6 + param2 ^ -1) <= (this.field_db ^ -1)) {
                                          break L10;
                                        } else {
                                          L11: {
                                            var8 = this.field_Eb[this.field_v * (param2 + var6) + param3 + var5_int].field_c;
                                            if (var8 != null) {
                                              break L11;
                                            } else {
                                              if (var10 == 0) {
                                                break L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          L12: {
                                            var9 = this.o(var8.field_O, param1 + -12535);
                                            if ((var8.field_N ^ -1) != -60) {
                                              break L12;
                                            } else {
                                              L13: {
                                                if (!var8.field_F) {
                                                  stackOut_25_0 = 0;
                                                  stackIn_26_0 = stackOut_25_0;
                                                  break L13;
                                                } else {
                                                  stackOut_24_0 = 1;
                                                  stackIn_26_0 = stackOut_24_0;
                                                  break L13;
                                                }
                                              }
                                              if (stackIn_26_0 + ps.field_C[2] < var7) {
                                                break L12;
                                              } else {
                                                param0[var9] = oe.c(param0[var9], 4);
                                                break L12;
                                              }
                                            }
                                          }
                                          L14: {
                                            if (var8.field_N != 53) {
                                              break L14;
                                            } else {
                                              L15: {
                                                stackOut_29_0 = var7 ^ -1;
                                                stackIn_31_0 = stackOut_29_0;
                                                stackIn_30_0 = stackOut_29_0;
                                                if (var8.field_F) {
                                                  stackOut_31_0 = stackIn_31_0;
                                                  stackOut_31_1 = 1;
                                                  stackIn_32_0 = stackOut_31_0;
                                                  stackIn_32_1 = stackOut_31_1;
                                                  break L15;
                                                } else {
                                                  stackOut_30_0 = stackIn_30_0;
                                                  stackOut_30_1 = 0;
                                                  stackIn_32_0 = stackOut_30_0;
                                                  stackIn_32_1 = stackOut_30_1;
                                                  break L15;
                                                }
                                              }
                                              if (stackIn_32_0 >= (stackIn_32_1 + ps.field_C[3] ^ -1)) {
                                                param0[var9] = oe.c(param0[var9], 8);
                                                break L14;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var8.field_N != 43) {
                                              break L16;
                                            } else {
                                              L17: {
                                                stackOut_36_0 = var7;
                                                stackIn_38_0 = stackOut_36_0;
                                                stackIn_37_0 = stackOut_36_0;
                                                if (!var8.field_F) {
                                                  stackOut_38_0 = stackIn_38_0;
                                                  stackOut_38_1 = 0;
                                                  stackIn_39_0 = stackOut_38_0;
                                                  stackIn_39_1 = stackOut_38_1;
                                                  break L17;
                                                } else {
                                                  stackOut_37_0 = stackIn_37_0;
                                                  stackOut_37_1 = 1;
                                                  stackIn_39_0 = stackOut_37_0;
                                                  stackIn_39_1 = stackOut_37_1;
                                                  break L17;
                                                }
                                              }
                                              if (stackIn_39_0 > stackIn_39_1 + ps.field_C[4]) {
                                                break L16;
                                              } else {
                                                if (0 >= var7) {
                                                  break L16;
                                                } else {
                                                  param0[var9] = oe.c(param0[var9], 16);
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                          L18: {
                                            if (var8.field_N != 63) {
                                              break L18;
                                            } else {
                                              L19: {
                                                stackOut_43_0 = ps.field_C[0];
                                                stackIn_45_0 = stackOut_43_0;
                                                stackIn_44_0 = stackOut_43_0;
                                                if (var8.field_F) {
                                                  stackOut_45_0 = stackIn_45_0;
                                                  stackOut_45_1 = 1;
                                                  stackIn_46_0 = stackOut_45_0;
                                                  stackIn_46_1 = stackOut_45_1;
                                                  break L19;
                                                } else {
                                                  stackOut_44_0 = stackIn_44_0;
                                                  stackOut_44_1 = 0;
                                                  stackIn_46_0 = stackOut_44_0;
                                                  stackIn_46_1 = stackOut_44_1;
                                                  break L19;
                                                }
                                              }
                                              if ((stackIn_46_0 - -stackIn_46_1 ^ -1) > (var7 ^ -1)) {
                                                break L18;
                                              } else {
                                                param0[var9] = oe.c(param0[var9], 1);
                                                break L18;
                                              }
                                            }
                                          }
                                          if (58 != var8.field_N) {
                                            break L10;
                                          } else {
                                            L20: {
                                              stackOut_49_0 = ps.field_C[1];
                                              stackIn_51_0 = stackOut_49_0;
                                              stackIn_50_0 = stackOut_49_0;
                                              if (!var8.field_F) {
                                                stackOut_51_0 = stackIn_51_0;
                                                stackOut_51_1 = 0;
                                                stackIn_52_0 = stackOut_51_0;
                                                stackIn_52_1 = stackOut_51_1;
                                                break L20;
                                              } else {
                                                stackOut_50_0 = stackIn_50_0;
                                                stackOut_50_1 = 1;
                                                stackIn_52_0 = stackOut_50_0;
                                                stackIn_52_1 = stackOut_50_1;
                                                break L20;
                                              }
                                            }
                                            if ((stackIn_52_0 - -stackIn_52_1 ^ -1) > (var7 ^ -1)) {
                                              break L10;
                                            } else {
                                              param0[var9] = oe.c(param0[var9], 2);
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var6++;
                                if (var10 == 0) {
                                  continue L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          var5_int++;
                          if (var10 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var5 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var5);
            stackOut_57_1 = new StringBuilder().append("ha.LA(");
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
              break L21;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L21;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        jd var8 = null;
        L0: {
          var8 = this.c(param3, true, param2);
          if (param0 < -117) {
            break L0;
          } else {
            this.field_mb = (int[]) null;
            break L0;
          }
        }
        L1: {
          if (var8 == null) {
            break L1;
          } else {
            if (this.c(var8.field_O, -16985, param4)) {
              L2: {
                if (!var8.a(23072)) {
                  break L2;
                } else {
                  if (param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var8.field_Y = var8.field_Y + param5;
                if (!this.field_b) {
                  break L3;
                } else {
                  this.field_ob[param4] = this.field_ob[param4] + param5;
                  break L3;
                }
              }
              if (var8.field_t >= var8.field_Y) {
                break L1;
              } else {
                var8.field_Y = var8.field_t;
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
    }

    final void a(byte param0, ik param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              L2: {
                if (this.field_f) {
                  break L2;
                } else {
                  if ((param2 ^ -1) >= 0) {
                    break L2;
                  } else {
                    stackOut_2_0 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    break L1;
                  }
                }
              }
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            }
            L3: {
              var5_int = stackIn_4_0;
              if (this.field_K == null) {
                break L3;
              } else {
                if ((param3 ^ -1) == (this.field_K.field_w ^ -1)) {
                  break L3;
                } else {
                  var5_int = 0;
                  break L3;
                }
              }
            }
            L4: {
              if (param0 == -49) {
                break L4;
              } else {
                this.b(-42, true, -106, -92, 114);
                break L4;
              }
            }
            L5: {
              if (var5_int == 0) {
                break L5;
              } else {
                this.field_B[param3][param2] = -1;
                this.field_m[param3] = this.field_m[param3] - uc.field_d[param1.field_c][0];
                break L5;
              }
            }
            this.field_J = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("ha.TA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean h(int param0) {
        int var2 = this.field_Fb ? 1 : 0;
        this.field_Fb = false;
        if (param0 != -293) {
            this.field_ib = 1;
        }
        return var2 != 0;
    }

    final void b(int param0, int param1, int param2, byte param3) {
        L0: {
          if ((param1 ^ -1) > -1) {
            break L0;
          } else {
            if (param1 >= this.field_E.length) {
              return;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if ((param0 ^ -1) > (this.field_E[param1].length ^ -1)) {
                  L1: {
                    this.field_E[param1][param0] = this.field_E[param1][param0] + param2;
                    if (this.field_E[param1][param0] > 5) {
                      this.field_E[param1][param0] = 5;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (param3 == 92) {
                    if (param0 == -1) {
                      return;
                    } else {
                      L2: {
                        if (this.field_E[param1][param0] > this.field_E[param1][6]) {
                          this.field_E[param1][6] = this.field_E[param1][param0];
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final String[] e(int param0) {
        if (param0 != 26524) {
            this.field_qb = true;
        }
        return this.field_P.a(param0 ^ 26524);
    }

    private final void a(int param0, vh param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            var3_int = param1.k(param0 + 30531);
            var4 = param1.k(0);
            var5 = param1.k(0);
            var6 = 7 & var3_int;
            if (param0 != -30531) {
                this.a(103, false, (int[]) null);
            }
            var7 = (var3_int & 31) >> -1570697245;
            this.field_l.a((byte) -119, (tc) (new qq(var7, var4, var5, var6)));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.GD(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, gn param1, int param2) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param1.a(new String[]{this.e(param0, param2 + 3395), ": "}, (byte) -124);
            param1.a(0, 2);
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int >= this.field_c[param0].length) {
                    break L3;
                  } else {
                    var5 = this.field_c[param0][var4_int];
                    stackOut_3_0 = var5;
                    stackIn_9_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 >= 0) {
                          param1.a(new String[]{"god: ", wf.field_q[var5 + 1], " level: ", Integer.toString(this.field_E[param0][var5])}, (byte) -57);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                param1.a(new String[]{"mana: ", Integer.toString(this.field_H[param0]), ", collected: ", Integer.toString(this.field_fb[this.field_yb[param0]])}, (byte) -49);
                param1.a(new String[]{"turns: ", Integer.toString(this.field_mb[param0])}, (byte) -102);
                stackOut_8_0 = lf.field_i[this.field_Q] ^ -1;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
              L5: {
                if (stackIn_9_0 != -1) {
                  param1.a(new String[]{"rune cap remaining: ", Integer.toString(this.field_m[param0])}, (byte) -62);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                param1.a(0, -2);
                if (param2 == -3396) {
                  break L6;
                } else {
                  discarded$1 = this.a(91, true);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("ha.G(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    final int a(jd param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
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
              var5_int = this.a(param0.field_J - -(param0.field_w * this.field_v), -4, param0);
              if (((param2 | hh.field_e[param0.field_P]) ^ -1) != (hh.field_e[param0.field_P] ^ -1)) {
                break L1;
              } else {
                var5_int = var5_int - param0.field_o * 10;
                break L1;
              }
            }
            L2: {
              if (param1 <= -111) {
                break L2;
              } else {
                this.field_eb = false;
                break L2;
              }
            }
            stackOut_4_0 = var5_int * param3 / 100;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("ha.L(");
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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final boolean b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_4_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -26) {
          var3 = 0;
          L0: while (true) {
            L1: {
              if ((this.field_v * this.field_db ^ -1) >= (var3 ^ -1)) {
                break L1;
              } else {
                stackOut_4_0 = this.field_Eb[var3].field_a ^ -1;
                stackIn_17_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4 != 0) {
                  return stackIn_17_0 != 0;
                } else {
                  L2: {
                    L3: {
                      if (stackIn_5_0 == (param0 ^ -1)) {
                        break L3;
                      } else {
                        if (null != this.field_K) {
                          break L2;
                        } else {
                          if (!this.c(this.field_Eb[var3].field_a, -16985, param0)) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (this.field_Eb[var3].field_h != 7) {
                      if ((this.field_Eb[var3].field_h ^ -1) != -12) {
                        break L2;
                      } else {
                        if ((this.field_E[param0][this.field_Eb[var3].field_g] ^ -1) < -1) {
                          return true;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      return true;
                    }
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, boolean param1) {
        jd var3_ref_jd = null;
        int var3 = 0;
        jd var4 = null;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_34_0 = 0;
        boolean stackOut_4_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_24_0 = false;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1) {
          var3_ref_jd = (jd) ((Object) this.field_t[param0].e((byte) 116));
          L0: while (true) {
            L1: {
              L2: {
                if (var3_ref_jd == null) {
                  break L2;
                } else {
                  stackOut_4_0 = var3_ref_jd.i(-21428);
                  stackIn_13_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_5_0) {
                          break L4;
                        } else {
                          if (!var3_ref_jd.k((byte) 116)) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (!var3_ref_jd.field_S) {
                        return true;
                      } else {
                        break L3;
                      }
                    }
                    var3_ref_jd = (jd) ((Object) this.field_t[param0].a((byte) 123));
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_12_0 = this.field_wb;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            L5: {
              if (!stackIn_13_0) {
                break L5;
              } else {
                if (null == this.field_K) {
                  var3 = 0;
                  L6: while (true) {
                    stackOut_17_0 = this.field_W;
                    stackIn_18_0 = stackOut_17_0;
                    L7: while (true) {
                      if (stackIn_18_0 <= var3) {
                        break L5;
                      } else {
                        stackOut_19_0 = var3;
                        stackIn_34_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var5 != 0) {
                          return stackIn_34_0 != 0;
                        } else {
                          L8: {
                            if (stackIn_20_0 == param0) {
                              break L8;
                            } else {
                              if (!this.c(var3, -16985, param0)) {
                                break L8;
                              } else {
                                var4 = (jd) ((Object) this.field_t[var3].e((byte) 99));
                                L9: while (true) {
                                  if (var4 == null) {
                                    break L8;
                                  } else {
                                    stackOut_24_0 = var4.i(-21428);
                                    stackIn_18_0 = stackOut_24_0 ? 1 : 0;
                                    stackIn_25_0 = stackOut_24_0;
                                    if (var5 != 0) {
                                      continue L7;
                                    } else {
                                      L10: {
                                        L11: {
                                          if (stackIn_25_0) {
                                            break L11;
                                          } else {
                                            if (!var4.k((byte) 90)) {
                                              break L10;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        if (!var4.field_S) {
                                          return true;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      var4 = (jd) ((Object) this.field_t[var3].a((byte) 123));
                                      if (var5 == 0) {
                                        continue L9;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4) {
        ne var6 = null;
        L0: {
          if (0 > param2) {
            break L0;
          } else {
            if (0 > param3) {
              break L0;
            } else {
              if ((this.field_v ^ -1) >= (param2 ^ -1)) {
                break L0;
              } else {
                if (this.field_db <= param3) {
                  break L0;
                } else {
                  var6 = this.field_Eb[param2 + this.field_v * param3];
                  if (null == var6.field_c) {
                    return false;
                  } else {
                    if (param0 >= (param4 ^ -1)) {
                      if (this.c(var6.field_c.field_O, -16985, param4)) {
                        return true;
                      } else {
                        return param1;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final int[] a(int param0, byte param1, int param2, int param3) {
        int[] var5 = null;
        ne var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        L0: {
          L1: {
            var8 = ArmiesOfGielinor.field_M ? 1 : 0;
            var9 = new int[7];
            var5 = var9;
            var6 = this.field_Eb[param2 + param0 * this.field_v];
            if (7 != var6.field_h) {
              break L1;
            } else {
              if (!this.c(var6.field_a, -16985, param3)) {
                break L1;
              } else {
                var7 = 0;
                L2: while (true) {
                  if (-8 >= (var7 ^ -1)) {
                    break L1;
                  } else {
                    var9[var7] = this.field_E[param3][var7];
                    var7++;
                    if (var8 != 0) {
                      break L0;
                    } else {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          if (-12 != (var6.field_h ^ -1)) {
            break L0;
          } else {
            if (!this.c(var6.field_a, -16985, param3)) {
              break L0;
            } else {
              if ((var9[var6.field_g] ^ -1) > (var6.field_j ^ -1)) {
                var9[var6.field_g] = var6.field_j;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        if (param1 >= 8) {
          return var9;
        } else {
          return (int[]) null;
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        jd var6 = null;
        int var7 = 0;
        ne var8_ref_ne = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = this.field_jb;
          if (this.field_Bb) {
            var3 = var3 ^ 313485252;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = var3 ^ this.field_cb * 137;
          var3 = var3 ^ 783246 * this.field_hb;
          var3 = var3 ^ this.field_Q * 545542;
          if (param1 >= 0) {
            var3 = var3 ^ this.n(param1, -111) * (7 * param1 - -11);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var4 = param1;
          if (0 <= var4) {
            break L2;
          } else {
            var4 = 0;
            break L2;
          }
        }
        L3: {
          if (param0) {
            break L3;
          } else {
            this.field_ib = -38;
            break L3;
          }
        }
        var5 = 0;
        L4: while (true) {
          L5: {
            L6: {
              if (this.field_v <= var5) {
                break L6;
              } else {
                stackOut_12_0 = 0;
                stackIn_21_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (var9 != 0) {
                  break L5;
                } else {
                  var6_int = stackIn_13_0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if ((this.field_db ^ -1) >= (var6_int ^ -1)) {
                          break L9;
                        } else {
                          var7 = this.field_v * var6_int + var5;
                          var8_ref_ne = this.field_Eb[var7];
                          var3 = var3 ^ this.a((byte) 103, var4, var8_ref_ne) * (var7 * 3 + 351);
                          var6_int++;
                          if (var9 != 0) {
                            break L8;
                          } else {
                            if (var9 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      var5++;
                      break L8;
                    }
                    if (var9 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            break L5;
          }
          var5 = stackIn_21_0;
          L10: while (true) {
            L11: {
              if ((var5 ^ -1) <= (this.field_W ^ -1)) {
                break L11;
              } else {
                var6 = (jd) ((Object) this.field_t[var5].e((byte) 101));
                L12: while (true) {
                  L13: {
                    L14: {
                      if (var6 == null) {
                        break L14;
                      } else {
                        var7 = var6.field_J;
                        var8 = var6.field_w;
                        var3 = var3 ^ this.b(-125, var6) * (var7 + 372) * (var8 + 723);
                        var6 = (jd) ((Object) this.field_t[var5].a((byte) 123));
                        if (var9 != 0) {
                          break L13;
                        } else {
                          if (var9 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    var5++;
                    break L13;
                  }
                  if (var9 == 0) {
                    continue L10;
                  } else {
                    break L11;
                  }
                }
              }
            }
            return var3;
          }
        }
    }

    final void g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_7_0 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -36 % ((-50 - param1) / 62);
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_W <= var4) {
                break L2;
              } else {
                stackOut_2_0 = this;
                stackIn_8_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    if ((((ha) (this)).field_e & 1 << var4) != (1 << var4 & param0)) {
                      this.b(10001, var4, false);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_7_0 = this;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          ((ha) (this)).field_e = param0;
          return;
        }
    }

    final void c(int param0, int param1, int param2, byte param3) {
        boolean discarded$1 = false;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jd var10 = null;
        ne var11 = null;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-1 >= param2) {
            break L0;
          } else {
            var10 = this.c(param0, true, param1);
            if (var10 == null) {
              break L0;
            } else {
              if (1 != var10.field_ab) {
                break L0;
              } else {
                var10.field_ab = 0;
                break L0;
              }
            }
          }
        }
        L1: {
          var11 = this.field_Eb[param1 + param0 * this.field_v];
          var6 = var11.field_a;
          if (var6 <= -1) {
            break L1;
          } else {
            L2: {
              L3: {
                L4: {
                  var7 = var11.field_h;
                  if (-8 != (var7 ^ -1)) {
                    break L4;
                  } else {
                    if (var9 == 0) {
                      this.field_z[this.field_yb[var6]][0] = this.field_z[this.field_yb[var6]][0] - 1;
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                if (-15 == (var7 ^ -1)) {
                  break L3;
                } else {
                  L5: {
                    if (var7 != 9) {
                      break L5;
                    } else {
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if ((var7 ^ -1) == -9) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_z[this.field_yb[var6]][1] = this.field_z[this.field_yb[var6]][1] - 1;
              if (var9 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
            this.field_z[this.field_yb[var6]][2] = this.field_z[this.field_yb[var6]][2] - 1;
            break L1;
          }
        }
        L6: {
          L7: {
            L8: {
              L9: {
                var11.a(-104, param2);
                var7 = var11.field_h;
                if (var7 == 7) {
                  break L9;
                } else {
                  if (-15 == (var7 ^ -1)) {
                    break L8;
                  } else {
                    L10: {
                      if ((var7 ^ -1) != -10) {
                        break L10;
                      } else {
                        if (var9 == 0) {
                          break L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if ((var7 ^ -1) != -9) {
                      break L6;
                    } else {
                      if (var9 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              this.field_z[this.field_yb[param2]][0] = this.field_z[this.field_yb[param2]][0] + 1;
              if (var9 == 0) {
                break L6;
              } else {
                break L8;
              }
            }
            this.field_z[this.field_yb[param2]][1] = this.field_z[this.field_yb[param2]][1] + 1;
            if (var9 == 0) {
              break L6;
            } else {
              break L7;
            }
          }
          this.field_z[this.field_yb[param2]][2] = this.field_z[this.field_yb[param2]][2] + 1;
          break L6;
        }
        L11: {
          if (param3 == -115) {
            break L11;
          } else {
            this.field_U = (int[]) null;
            break L11;
          }
        }
        L12: {
          if (!this.field_b) {
            break L12;
          } else {
            if (!this.field_wb) {
              this.d(param2, this.field_z[this.field_yb[param2]][1] + (this.field_z[this.field_yb[param2]][0] + this.field_z[this.field_yb[param2]][2]), 102, 0);
              var7 = -1 + this.field_W;
              var8 = 0;
              L13: while (true) {
                L14: {
                  L15: {
                    if (0 <= (this.field_n[var8] ^ -1)) {
                      break L15;
                    } else {
                      stackOut_38_0 = this.field_W ^ -1;
                      stackOut_38_1 = var8 ^ -1;
                      stackIn_43_0 = stackOut_38_0;
                      stackIn_43_1 = stackOut_38_1;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      if (var9 != 0) {
                        break L14;
                      } else {
                        if (stackIn_39_0 >= stackIn_39_1) {
                          break L15;
                        } else {
                          var7--;
                          var8++;
                          if (var9 == 0) {
                            continue L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                  }
                  stackOut_42_0 = var7;
                  stackOut_42_1 = -1;
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  break L14;
                }
                L16: {
                  if (stackIn_43_0 <= stackIn_43_1) {
                    break L16;
                  } else {
                    if ((this.field_p[var7] ^ -1) != (var6 ^ -1)) {
                      break L16;
                    } else {
                      this.field_y[param2] = this.field_y[param2] + 1;
                      this.d(param2, this.field_y[param2], 104, 15);
                      break L16;
                    }
                  }
                }
                if ((this.field_p[0] ^ -1) != (var6 ^ -1)) {
                  break L12;
                } else {
                  this.field_M[param2] = this.field_M[param2] + 1;
                  this.d(param2, this.field_M[param2], param3 ^ -18, 14);
                  break L12;
                }
              }
            } else {
              break L12;
            }
          }
        }
        L17: {
          if (!var11.k(12)) {
            break L17;
          } else {
            this.b(param3 + 10116, var6, false);
            var11.d((byte) 61);
            break L17;
          }
        }
        L18: {
          if (this.field_K == null) {
            break L18;
          } else {
            if (0 == (var6 ^ -1)) {
              break L18;
            } else {
              discarded$1 = this.b(var6, true);
              break L18;
            }
          }
        }
        this.a(1);
    }

    final void g(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param3 == -9513) {
            break L0;
          } else {
            this.b(-46, 97, true);
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          L2: {
            if ((var5 ^ -1) <= (this.field_W ^ -1)) {
              break L2;
            } else {
              if (var7 != 0) {
                break L2;
              } else {
                var6 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var6 >= 6) {
                        break L5;
                      } else {
                        this.field_E[var5][param1] = 1;
                        this.field_E[var5][param2] = 1;
                        this.field_E[var5][param0] = 1;
                        this.field_c[var5][0] = param1;
                        this.field_c[var5][1] = param2;
                        this.field_c[var5][2] = param0;
                        var6++;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          if (var7 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var5++;
                    break L4;
                  }
                  if (var7 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void j(int param0) {
        if (param0 != 7) {
            this.field_Bb = true;
            return;
        }
    }

    final int[] a(jd param0, int param1, byte param2, int param3, jd param4, int param5, int param6) {
        RuntimeException var8 = null;
        jd var8_ref = null;
        jd var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        jd var23 = null;
        int[] stackIn_7_0 = null;
        int[] stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        int[] stackIn_80_0 = null;
        int[] stackIn_97_0 = null;
        int[] stackIn_108_0 = null;
        int[] stackIn_133_0 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_15_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int[] stackOut_107_0 = null;
        int[] stackOut_132_0 = null;
        int[] stackOut_96_0 = null;
        int[] stackOut_79_0 = null;
        int[] stackOut_6_0 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        String stackOut_138_2 = null;
        var22 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var23 = param4;
              var8_ref = var23;
              if (param2 <= -119) {
                break L1;
              } else {
                this.field_u = 42;
                break L1;
              }
            }
            L2: {
              var9 = param0;
              var10 = new int[]{0, 0, 0};
              if (var8_ref == null) {
                break L2;
              } else {
                if (var9 == null) {
                  break L2;
                } else {
                  L3: {
                    var11 = var23.field_N;
                    if (-35 != (var11 ^ -1)) {
                      break L3;
                    } else {
                      if (var23.field_W) {
                        var11 = 75;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var23.j((byte) 80)) {
                      break L4;
                    } else {
                      if (var9.x(-96)) {
                        stackOut_15_0 = (int[]) (var10);
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var12 = Math.abs(param5) + Math.abs(param3);
                    var13 = 32;
                    var14 = 32;
                    var15 = 0;
                    var16 = 0;
                    if ((var12 ^ -1) != -2) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L5;
                    } else {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      var17 = stackIn_20_0;
                      if (var17 != 0) {
                        break L7;
                      } else {
                        L8: {
                          L9: {
                            if (34 != var23.field_N) {
                              break L9;
                            } else {
                              if (var23.field_W) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var23.field_N == 81) {
                              break L10;
                            } else {
                              if (-5 == (var23.field_N ^ -1)) {
                                break L10;
                              } else {
                                if ((var23.field_N ^ -1) == -75) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var23.g(0) == 3) {
                                      break L11;
                                    } else {
                                      var13 = 2;
                                      if (-2 != (var23.j(20640) ^ -1)) {
                                        break L6;
                                      } else {
                                        var15 = var23.d(0, 80);
                                        if (var22 == 0) {
                                          break L6;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (-3 == (var23.j(20640) ^ -1)) {
                                      var15 = var23.d(0, 58);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  var13 = 4;
                                  if (var22 == 0) {
                                    break L6;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                          var13 = 8;
                          if ((var23.j(20640) ^ -1) != -4) {
                            break L6;
                          } else {
                            var15 = var23.d(0, 106);
                            if (var22 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var13 = 8;
                        if (var23.j(20640) == 3) {
                          var15 = var23.d(0, 118);
                          if (var22 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    L13: {
                      if ((var23.field_N ^ -1) != -35) {
                        break L13;
                      } else {
                        if (!var23.field_W) {
                          break L13;
                        } else {
                          var13 = 8;
                          if ((var23.j(20640) ^ -1) == -4) {
                            var15 = var23.d(0, 55);
                            if (var22 == 0) {
                              break L6;
                            } else {
                              break L13;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L14: {
                      if (!var23.x(-126)) {
                        break L14;
                      } else {
                        L15: {
                          if ((var23.j(20640) ^ -1) != -5) {
                            break L15;
                          } else {
                            var15 = var23.d(0, -95);
                            break L15;
                          }
                        }
                        var13 = 16;
                        if (var22 == 0) {
                          break L6;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (-4 != (var23.g(0) ^ -1)) {
                        break L16;
                      } else {
                        var13 = 4;
                        if ((var23.j(20640) ^ -1) == -3) {
                          var15 = var23.d(0, -102);
                          if (var22 == 0) {
                            break L6;
                          } else {
                            break L16;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    var13 = 1;
                    if (0 == var23.j(20640)) {
                      var15 = var23.d(0, -93);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L17: {
                    if (var17 == 0) {
                      break L17;
                    } else {
                      L18: {
                        L19: {
                          if ((var9.field_N ^ -1) != -35) {
                            break L19;
                          } else {
                            if (var9.field_W) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          if (!var9.x(-109)) {
                            break L20;
                          } else {
                            var14 = 16;
                            if (-5 == (var9.j(20640) ^ -1)) {
                              var16 = var9.d(0, 122);
                              if (var22 == 0) {
                                break L17;
                              } else {
                                break L20;
                              }
                            } else {
                              break L17;
                            }
                          }
                        }
                        L21: {
                          if (3 != var9.g(0)) {
                            break L21;
                          } else {
                            L22: {
                              if (-3 == (var9.j(20640) ^ -1)) {
                                var16 = var9.d(0, 69);
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            var14 = 4;
                            if (var22 == 0) {
                              break L17;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L23: {
                          if (-1 == (var9.j(20640) ^ -1)) {
                            var16 = var9.d(0, -123);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        var14 = 1;
                        if (var22 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                      L24: {
                        if (var9.j(20640) == 3) {
                          var16 = var9.d(0, 116);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      var14 = 8;
                      break L17;
                    }
                  }
                  L25: {
                    if ((var11 ^ -1) > -1) {
                      break L25;
                    } else {
                      if ((bw.field_m.length ^ -1) >= (var11 ^ -1)) {
                        break L25;
                      } else {
                        L26: {
                          L27: {
                            L28: {
                              L29: {
                                var18 = param4.B(3257);
                                var19 = param4.l((byte) -79);
                                if (-82 == (param4.field_N ^ -1)) {
                                  break L29;
                                } else {
                                  if (4 == param4.field_N) {
                                    break L29;
                                  } else {
                                    if (-75 != (param4.field_N ^ -1)) {
                                      break L28;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                              if (-4 == (param4.j(20640) ^ -1)) {
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                            L30: {
                              L31: {
                                if (param4.g(0) != 3) {
                                  break L31;
                                } else {
                                  if (param4.j(20640) == 2) {
                                    break L30;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              if (param4.g(0) != 2) {
                                break L26;
                              } else {
                                if (1 != param4.j(20640)) {
                                  break L26;
                                } else {
                                  var18 = var18 + param4.d(1, 117);
                                  if (var22 == 0) {
                                    break L26;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                            var18 = var18 + param4.d(1, -124);
                            if (var22 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                          var18 = var18 + param4.d(1, -87);
                          break L26;
                        }
                        if ((var12 ^ -1) >= (var18 ^ -1)) {
                          L32: {
                            L33: {
                              var20 = 0;
                              var21 = 0;
                              if (var12 < var19) {
                                break L33;
                              } else {
                                L34: {
                                  var20 = this.a(var9, (byte) -123, var13, this.a(param1, 0, param6, var9, var23, (byte) -128) - -var15);
                                  if (var20 == 0) {
                                    var20 = 1;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                L35: {
                                  if (255 >= var20) {
                                    break L35;
                                  } else {
                                    var20 = 255;
                                    break L35;
                                  }
                                }
                                var10[0] = var20;
                                if (var22 == 0) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            if (var12 > 1) {
                              stackOut_107_0 = (int[]) (var10);
                              stackIn_108_0 = stackOut_107_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              break L32;
                            }
                          }
                          L36: {
                            if (var17 == 0) {
                              break L36;
                            } else {
                              L37: {
                                if (var20 < var9.field_A + var9.field_Y) {
                                  break L37;
                                } else {
                                  if ((param0.field_P ^ -1) == -8) {
                                    break L37;
                                  } else {
                                    if (8 != param0.field_P) {
                                      break L36;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                              }
                              L38: {
                                L39: {
                                  var19 = bw.field_m[var9.field_N][6];
                                  if ((var19 ^ -1) >= -2) {
                                    break L39;
                                  } else {
                                    var21 = this.a(var8_ref, (byte) -123, var14, this.a(param1 - -param3, var20, param6 - -param5, var23, var9, (byte) -128) * 3 / 20 + var16);
                                    if (var22 == 0) {
                                      break L38;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                                var21 = this.a(var8_ref, (byte) -125, var14, this.a(param1 - -param3, var20, param5 + param6, var23, var9, (byte) -128) + var16);
                                if ((var21 ^ -1) != -1) {
                                  break L38;
                                } else {
                                  var21 = 1;
                                  break L38;
                                }
                              }
                              L40: {
                                if (-256 > (var21 ^ -1)) {
                                  var21 = 255;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              var10[1] = var21;
                              break L36;
                            }
                          }
                          L41: {
                            if (var23.field_A + var23.field_Y > var21) {
                              break L41;
                            } else {
                              if (param4.field_P == 7) {
                                break L41;
                              } else {
                                if (-9 != (param4.field_P ^ -1)) {
                                  var10[2] = oe.c(var10[2], 1);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                          L42: {
                            if (var20 < var9.field_Y + var9.field_A) {
                              break L42;
                            } else {
                              if (7 == param0.field_P) {
                                break L42;
                              } else {
                                if ((param0.field_P ^ -1) != -9) {
                                  var10[2] = oe.c(var10[2], 2);
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            }
                          }
                          stackOut_132_0 = (int[]) (var10);
                          stackIn_133_0 = stackOut_132_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackOut_96_0 = (int[]) (var10);
                          stackIn_97_0 = stackOut_96_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_79_0 = (int[]) (var10);
                  stackIn_80_0 = stackOut_79_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
            stackOut_6_0 = (int[]) (var10);
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L43: {
            var8 = decompiledCaughtException;
            stackOut_134_0 = (RuntimeException) (var8);
            stackOut_134_1 = new StringBuilder().append("ha.EC(");
            stackIn_136_0 = stackOut_134_0;
            stackIn_136_1 = stackOut_134_1;
            stackIn_135_0 = stackOut_134_0;
            stackIn_135_1 = stackOut_134_1;
            if (param0 == null) {
              stackOut_136_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackOut_136_1 = (StringBuilder) ((Object) stackIn_136_1);
              stackOut_136_2 = "null";
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              stackIn_137_2 = stackOut_136_2;
              break L43;
            } else {
              stackOut_135_0 = (RuntimeException) ((Object) stackIn_135_0);
              stackOut_135_1 = (StringBuilder) ((Object) stackIn_135_1);
              stackOut_135_2 = "{...}";
              stackIn_137_0 = stackOut_135_0;
              stackIn_137_1 = stackOut_135_1;
              stackIn_137_2 = stackOut_135_2;
              break L43;
            }
          }
          L44: {
            stackOut_137_0 = (RuntimeException) ((Object) stackIn_137_0);
            stackOut_137_1 = ((StringBuilder) (Object) stackIn_137_1).append(stackIn_137_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_139_0 = stackOut_137_0;
            stackIn_139_1 = stackOut_137_1;
            stackIn_138_0 = stackOut_137_0;
            stackIn_138_1 = stackOut_137_1;
            if (param4 == null) {
              stackOut_139_0 = (RuntimeException) ((Object) stackIn_139_0);
              stackOut_139_1 = (StringBuilder) ((Object) stackIn_139_1);
              stackOut_139_2 = "null";
              stackIn_140_0 = stackOut_139_0;
              stackIn_140_1 = stackOut_139_1;
              stackIn_140_2 = stackOut_139_2;
              break L44;
            } else {
              stackOut_138_0 = (RuntimeException) ((Object) stackIn_138_0);
              stackOut_138_1 = (StringBuilder) ((Object) stackIn_138_1);
              stackOut_138_2 = "{...}";
              stackIn_140_0 = stackOut_138_0;
              stackIn_140_1 = stackOut_138_1;
              stackIn_140_2 = stackOut_138_2;
              break L44;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_140_0), stackIn_140_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_80_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_97_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_108_0;
                } else {
                  return stackIn_133_0;
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, jd param1, gn param2) {
        int[] discarded$1 = null;
        RuntimeException var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              param2.a(new String[]{"unit type: ", dn.field_Pb[param1.field_N].toLowerCase(), " at ", ci.c(param1.field_J, 0, param1.field_w)}, (byte) -120);
              param2.a(0, 2);
              param2.a(new String[]{"owner: ", this.e(param1.field_O, -1)}, (byte) -120);
              if (param1.field_I) {
                param2.a((byte) 19, "poisoned");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param1.field_W) {
                break L2;
              } else {
                param2.a((byte) 19, "deployed");
                break L2;
              }
            }
            L3: {
              if (!param1.field_s) {
                break L3;
              } else {
                param2.a((byte) 19, "moved");
                break L3;
              }
            }
            L4: {
              if (!param1.field_D) {
                break L4;
              } else {
                param2.a((byte) 19, "trinket used");
                break L4;
              }
            }
            L5: {
              param2.a((byte) 19, "attacksleft: " + param1.field_B);
              if (-1 == (param1.field_A ^ -1)) {
                break L5;
              } else {
                param2.a(new String[]{"bonus: ", Integer.toString(param1.field_A)}, (byte) -54);
                break L5;
              }
            }
            L6: {
              param2.a(new String[]{"strength: ", Integer.toString(param1.field_Y), "/", Integer.toString(param1.field_t)}, (byte) -105);
              param2.a(0, -2);
              if (!param0) {
                break L6;
              } else {
                discarded$1 = this.a(-59, (byte) 114, 16, 49);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("ha.T(").append(param0).append(',');
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
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          L8: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    final boolean b(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            this.a(56, (String) null, (oj) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_e & 1 << param1) != 0) {
              break L2;
            } else {
              if (-1 == (this.field_u & 1 << param1 ^ -1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final int a(int param0, int param1, boolean param2) {
        int var4 = -1;
        if (!((param1 ^ -1) > -1)) {
            var4 = this.o(param1, -1);
        }
        if (!param2) {
            this.field_hb = -93;
        }
        return this.field_Eb[param0].a((byte) 97, param1, var4);
    }

    private final int a(int param0, int param1, int param2, jd param3, jd param4, byte param5) {
        int discarded$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (-8 == (param3.field_P ^ -1)) {
                  break L2;
                } else {
                  if (-9 == (param3.field_P ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              param1 = 0;
              break L1;
            }
            L3: {
              var7_int = fk.field_d[param4.g(0)][param3.g(0)];
              if (param5 <= -127) {
                break L3;
              } else {
                discarded$1 = this.a((byte) -69, -60, (ne) null);
                break L3;
              }
            }
            L4: {
              if ((this.b(31, param0, param2, param4.field_O) & 16 ^ -1) == -1) {
                break L4;
              } else {
                var7_int = 90;
                break L4;
              }
            }
            L5: {
              if (!param4.n(116)) {
                break L5;
              } else {
                if (param3.x(-121)) {
                  var7_int = 90;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              var8 = var7_int * (param4.field_A + (param4.field_Y + -param1)) / 100;
              if ((var8 ^ -1) >= -1) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L6;
              } else {
                stackOut_13_0 = var8;
                stackIn_15_0 = stackOut_13_0;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var7);
            stackOut_16_1 = new StringBuilder().append("ha.VC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param5 + ')');
        }
        return stackIn_15_0;
    }

    private final void a(int param0, int param1, vh param2, int param3) {
        int var5_int = 0;
        jd var6 = null;
        if (param1 >= -22) {
            return;
        }
        try {
            var5_int = param2.k(0);
            var6 = mb.a(var5_int, 0, param3, param0, param2, (ha) (this), -102, true);
            this.field_t[var6.field_O].a((byte) -119, (tc) (var6));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.WD(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String j(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ne var8 = null;
        int var9 = 0;
        gn var10 = null;
        jd var11 = null;
        gn var12 = null;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          var10 = new gn();
          var12 = var10;
          var10.a(new String[]{"seed: ", Integer.toString(this.field_jb, 16)}, (byte) -116);
          var10.a(new String[]{"size: ", Integer.toString(this.field_cb), ", theme: ", Integer.toString(this.field_hb)}, (byte) -103);
          if (this.field_Bb) {
            var12.a((byte) 19, "kbd summoned");
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((param0 ^ -1) <= -1) {
            this.a(param0, var12, param1 + -3148);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var4 = param0;
          if (-1 < (var4 ^ -1)) {
            var4 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        var5 = 0;
        if (param1 == -248) {
          L3: while (true) {
            L4: {
              L5: {
                if (var5 >= this.field_v) {
                  break L5;
                } else {
                  stackOut_12_0 = 0;
                  stackIn_21_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (var9 != 0) {
                    break L4;
                  } else {
                    var6 = stackIn_13_0;
                    L6: while (true) {
                      L7: {
                        L8: {
                          if (this.field_db <= var6) {
                            break L8;
                          } else {
                            var7 = var6 * this.field_v - -var5;
                            var8 = this.field_Eb[var7];
                            this.a(var4, var8, (byte) -40, var6, var12, var5);
                            var6++;
                            if (var9 != 0) {
                              break L7;
                            } else {
                              if (var9 == 0) {
                                continue L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        var5++;
                        break L7;
                      }
                      if (var9 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              break L4;
            }
            var5 = stackIn_21_0;
            L9: while (true) {
              L10: {
                if (this.field_W <= var5) {
                  break L10;
                } else {
                  var11 = (jd) ((Object) this.field_t[var5].e((byte) 124));
                  L11: while (true) {
                    L12: {
                      L13: {
                        if (var11 == null) {
                          break L13;
                        } else {
                          this.a(false, var11, var10);
                          var11 = (jd) ((Object) this.field_t[var5].a((byte) 123));
                          if (var9 != 0) {
                            break L12;
                          } else {
                            if (var9 == 0) {
                              continue L11;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var5++;
                      break L12;
                    }
                    if (var9 == 0) {
                      continue L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              return var12.c(1024);
            }
          }
        } else {
          return (String) null;
        }
    }

    private final void b(vh param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = param0.k(param1 ^ -84) & 31;
            if (var3_int != 13) {
              if (var3_int != 14) {
                L1: {
                  if (param1 == -84) {
                    break L1;
                  } else {
                    this.a(-22, (jd) null);
                    break L1;
                  }
                }
                L2: {
                  if (var3_int != 5) {
                    break L2;
                  } else {
                    L3: {
                      var4 = param0.k(0);
                      var5 = 15 & var4;
                      if ((var5 ^ -1) != -16) {
                        break L3;
                      } else {
                        var5 = -1;
                        break L3;
                      }
                    }
                    this.field_l.a((byte) -119, (tc) (new pj(bo.a(-1, param0, 4368051), var5, var4 >> 1831678276)));
                    break L2;
                  }
                }
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    var4 = param0.k(0);
                                    var5 = param0.k(param1 ^ -84);
                                    var6 = var3_int;
                                    if ((var6 ^ -1) == -2) {
                                      break L13;
                                    } else {
                                      if ((var6 ^ -1) == -12) {
                                        break L12;
                                      } else {
                                        L14: {
                                          if (17 != var6) {
                                            break L14;
                                          } else {
                                            if (var7 == 0) {
                                              break L11;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        if (-17 == (var6 ^ -1)) {
                                          break L10;
                                        } else {
                                          L15: {
                                            if (2 != var6) {
                                              break L15;
                                            } else {
                                              if (var7 == 0) {
                                                break L9;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (-8 != (var6 ^ -1)) {
                                              break L16;
                                            } else {
                                              if (var7 == 0) {
                                                break L8;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (-9 != (var6 ^ -1)) {
                                              break L17;
                                            } else {
                                              if (var7 == 0) {
                                                break L7;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          if (15 != var6) {
                                            break L5;
                                          } else {
                                            if (var7 == 0) {
                                              break L6;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.field_l.a((byte) -119, (tc) (new q(var4, var5)));
                                  if (var7 == 0) {
                                    break L5;
                                  } else {
                                    break L12;
                                  }
                                }
                                this.field_l.a((byte) -119, (tc) (new ec(var4, var5, param0.e((byte) -104), true)));
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  break L11;
                                }
                              }
                              this.field_l.a((byte) -119, (tc) (new ec(var4, var5, param0.e((byte) -104), false)));
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L10;
                              }
                            }
                            this.a(var4, -47, param0, var5);
                            if (var7 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                          this.field_l.a((byte) -119, (tc) (new hp(var4, var5)));
                          if (var7 == 0) {
                            break L5;
                          } else {
                            break L8;
                          }
                        }
                        this.field_l.a((byte) -119, (tc) (new tr(var4, var5, 0)));
                        if (var7 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                      this.field_l.a((byte) -119, (tc) (new tr(var4, var5, param0.k(0))));
                      if (var7 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                    this.field_l.a((byte) -119, (tc) (new kf(var4, var5, param0.k(0), param0.k(param1 ^ -84), param0.k(0), param0.k(0))));
                    break L4;
                  }
                  break L4;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_l.a((byte) -119, (tc) (new vp(3, param0.k(0), this.field_sb)));
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_l.a((byte) -119, (tc) (new rl(param0.k(0))));
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var3);
            stackOut_47_1 = new StringBuilder().append("ha.LC(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L18;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L18;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int h(int param0, int param1) {
        if (param1 != 0) {
            return -38;
        }
        if (!(this.field_wb)) {
            return -1;
        }
        return this.field_w[this.field_yb[param0]].c(16648);
    }

    final void a(int param0, String param1, oj param2) {
        String var4 = null;
        try {
            var4 = param2.a((byte) -8, false);
            if (param0 != 0) {
                this.field_D = -23;
            }
            this.j(7);
            var4 = param1 + "\n" + var4;
            this.field_l.b(param0 ^ 98);
            ik.a("Dropping conection: turn: " + this.field_Gb + ", player: " + this.field_gb + "\n" + var4, (byte) 40);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.JC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0, int param1) {
        if (!(this.field_wb)) {
            return -1;
        }
        if (param0 != -9650) {
            return 126;
        }
        return this.field_w[param1].c(16648);
    }

    private final void a(vh param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        at stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ag stackIn_4_2 = null;
        ag stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        int stackIn_4_6 = 0;
        int stackIn_4_7 = 0;
        int stackIn_4_8 = 0;
        int stackIn_4_9 = 0;
        int stackIn_4_10 = 0;
        at stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        ag stackIn_5_2 = null;
        ag stackIn_5_3 = null;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        int stackIn_5_8 = 0;
        int stackIn_5_9 = 0;
        int stackIn_5_10 = 0;
        at stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ag stackIn_6_2 = null;
        ag stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        int stackIn_6_8 = 0;
        int stackIn_6_9 = 0;
        int stackIn_6_10 = 0;
        int stackIn_6_11 = 0;
        at stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ag stackIn_7_2 = null;
        ag stackIn_7_3 = null;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        int stackIn_7_9 = 0;
        int stackIn_7_10 = 0;
        int stackIn_7_11 = 0;
        at stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ag stackIn_8_2 = null;
        ag stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_8_8 = 0;
        int stackIn_8_9 = 0;
        int stackIn_8_10 = 0;
        int stackIn_8_11 = 0;
        at stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ag stackIn_9_2 = null;
        ag stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        int stackIn_9_9 = 0;
        int stackIn_9_10 = 0;
        int stackIn_9_11 = 0;
        int stackIn_9_12 = 0;
        at stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ag stackIn_10_2 = null;
        ag stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackIn_10_9 = 0;
        int stackIn_10_10 = 0;
        int stackIn_10_11 = 0;
        int stackIn_10_12 = 0;
        int stackIn_10_13 = 0;
        int stackIn_10_14 = 0;
        at stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ag stackIn_11_2 = null;
        ag stackIn_11_3 = null;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        int stackIn_11_9 = 0;
        int stackIn_11_10 = 0;
        int stackIn_11_11 = 0;
        int stackIn_11_12 = 0;
        int stackIn_11_13 = 0;
        int stackIn_11_14 = 0;
        at stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ag stackIn_12_2 = null;
        ag stackIn_12_3 = null;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_12_8 = 0;
        int stackIn_12_9 = 0;
        int stackIn_12_10 = 0;
        int stackIn_12_11 = 0;
        int stackIn_12_12 = 0;
        int stackIn_12_13 = 0;
        int stackIn_12_14 = 0;
        int stackIn_12_15 = 0;
        at stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ag stackIn_13_2 = null;
        ag stackIn_13_3 = null;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        int stackIn_13_9 = 0;
        int stackIn_13_10 = 0;
        int stackIn_13_11 = 0;
        int stackIn_13_12 = 0;
        int stackIn_13_13 = 0;
        int stackIn_13_14 = 0;
        int stackIn_13_15 = 0;
        at stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ag stackIn_14_2 = null;
        ag stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        int stackIn_14_11 = 0;
        int stackIn_14_12 = 0;
        int stackIn_14_13 = 0;
        int stackIn_14_14 = 0;
        int stackIn_14_15 = 0;
        at stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ag stackIn_15_2 = null;
        ag stackIn_15_3 = null;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        int stackIn_15_8 = 0;
        int stackIn_15_9 = 0;
        int stackIn_15_10 = 0;
        int stackIn_15_11 = 0;
        int stackIn_15_12 = 0;
        int stackIn_15_13 = 0;
        int stackIn_15_14 = 0;
        int stackIn_15_15 = 0;
        int stackIn_15_16 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        at stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ag stackOut_3_2 = null;
        ag stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        int stackOut_3_6 = 0;
        int stackOut_3_7 = 0;
        int stackOut_3_8 = 0;
        int stackOut_3_9 = 0;
        int stackOut_3_10 = 0;
        at stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ag stackOut_5_2 = null;
        ag stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        int stackOut_5_9 = 0;
        int stackOut_5_10 = 0;
        int stackOut_5_11 = 0;
        at stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        ag stackOut_4_2 = null;
        ag stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        int stackOut_4_8 = 0;
        int stackOut_4_9 = 0;
        int stackOut_4_10 = 0;
        int stackOut_4_11 = 0;
        at stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ag stackOut_6_2 = null;
        ag stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        int stackOut_6_9 = 0;
        int stackOut_6_10 = 0;
        int stackOut_6_11 = 0;
        at stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ag stackOut_8_2 = null;
        ag stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        int stackOut_8_9 = 0;
        int stackOut_8_10 = 0;
        int stackOut_8_11 = 0;
        int stackOut_8_12 = 0;
        at stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ag stackOut_7_2 = null;
        ag stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        int stackOut_7_9 = 0;
        int stackOut_7_10 = 0;
        int stackOut_7_11 = 0;
        int stackOut_7_12 = 0;
        at stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ag stackOut_9_2 = null;
        ag stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        int stackOut_9_9 = 0;
        int stackOut_9_10 = 0;
        int stackOut_9_11 = 0;
        int stackOut_9_12 = 0;
        int stackOut_9_13 = 0;
        int stackOut_9_14 = 0;
        at stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ag stackOut_11_2 = null;
        ag stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_11_9 = 0;
        int stackOut_11_10 = 0;
        int stackOut_11_11 = 0;
        int stackOut_11_12 = 0;
        int stackOut_11_13 = 0;
        int stackOut_11_14 = 0;
        int stackOut_11_15 = 0;
        at stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ag stackOut_10_2 = null;
        ag stackOut_10_3 = null;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        int stackOut_10_9 = 0;
        int stackOut_10_10 = 0;
        int stackOut_10_11 = 0;
        int stackOut_10_12 = 0;
        int stackOut_10_13 = 0;
        int stackOut_10_14 = 0;
        int stackOut_10_15 = 0;
        at stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ag stackOut_12_2 = null;
        ag stackOut_12_3 = null;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        int stackOut_12_9 = 0;
        int stackOut_12_10 = 0;
        int stackOut_12_11 = 0;
        int stackOut_12_12 = 0;
        int stackOut_12_13 = 0;
        int stackOut_12_14 = 0;
        int stackOut_12_15 = 0;
        at stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ag stackOut_14_2 = null;
        ag stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        int stackOut_14_7 = 0;
        int stackOut_14_8 = 0;
        int stackOut_14_9 = 0;
        int stackOut_14_10 = 0;
        int stackOut_14_11 = 0;
        int stackOut_14_12 = 0;
        int stackOut_14_13 = 0;
        int stackOut_14_14 = 0;
        int stackOut_14_15 = 0;
        int stackOut_14_16 = 0;
        at stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ag stackOut_13_2 = null;
        ag stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        int stackOut_13_9 = 0;
        int stackOut_13_10 = 0;
        int stackOut_13_11 = 0;
        int stackOut_13_12 = 0;
        int stackOut_13_13 = 0;
        int stackOut_13_14 = 0;
        int stackOut_13_15 = 0;
        int stackOut_13_16 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = param0.k(0);
                var4 = param0.k(0);
                var5 = param0.k(0);
                var6 = param0.k(param1 ^ -1);
                var7 = param0.e((byte) -104);
                var8 = var7 >> 2074827752;
                var9 = 255 & var7;
                var8 = (var8 ^ 128) - 128;
                var9 = (var9 ^ 128) + -128;
                var10 = param0.k(0);
                var11 = param0.k(0);
                var12 = param0.k(0);
                var13 = param0.k(0);
                if (param1 <= (4 & var3_int ^ -1)) {
                  break L2;
                } else {
                  this.field_l.a((byte) -119, (tc) (new md(var5, var6, var8, var9, var10)));
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                stackOut_3_0 = this.field_l;
                stackOut_3_1 = -119;
                stackOut_3_2 = null;
                stackOut_3_3 = null;
                stackOut_3_4 = var4;
                stackOut_3_5 = var5;
                stackOut_3_6 = var6;
                stackOut_3_7 = var8;
                stackOut_3_8 = var9;
                stackOut_3_9 = var10;
                stackOut_3_10 = var11;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                stackIn_5_4 = stackOut_3_4;
                stackIn_5_5 = stackOut_3_5;
                stackIn_5_6 = stackOut_3_6;
                stackIn_5_7 = stackOut_3_7;
                stackIn_5_8 = stackOut_3_8;
                stackIn_5_9 = stackOut_3_9;
                stackIn_5_10 = stackOut_3_10;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                stackIn_4_5 = stackOut_3_5;
                stackIn_4_6 = stackOut_3_6;
                stackIn_4_7 = stackOut_3_7;
                stackIn_4_8 = stackOut_3_8;
                stackIn_4_9 = stackOut_3_9;
                stackIn_4_10 = stackOut_3_10;
                if ((var3_int & 1 ^ -1) >= -1) {
                  stackOut_5_0 = (at) ((Object) stackIn_5_0);
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = null;
                  stackOut_5_3 = null;
                  stackOut_5_4 = stackIn_5_4;
                  stackOut_5_5 = stackIn_5_5;
                  stackOut_5_6 = stackIn_5_6;
                  stackOut_5_7 = stackIn_5_7;
                  stackOut_5_8 = stackIn_5_8;
                  stackOut_5_9 = stackIn_5_9;
                  stackOut_5_10 = stackIn_5_10;
                  stackOut_5_11 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  stackIn_6_4 = stackOut_5_4;
                  stackIn_6_5 = stackOut_5_5;
                  stackIn_6_6 = stackOut_5_6;
                  stackIn_6_7 = stackOut_5_7;
                  stackIn_6_8 = stackOut_5_8;
                  stackIn_6_9 = stackOut_5_9;
                  stackIn_6_10 = stackOut_5_10;
                  stackIn_6_11 = stackOut_5_11;
                  break L3;
                } else {
                  stackOut_4_0 = (at) ((Object) stackIn_4_0);
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = null;
                  stackOut_4_3 = null;
                  stackOut_4_4 = stackIn_4_4;
                  stackOut_4_5 = stackIn_4_5;
                  stackOut_4_6 = stackIn_4_6;
                  stackOut_4_7 = stackIn_4_7;
                  stackOut_4_8 = stackIn_4_8;
                  stackOut_4_9 = stackIn_4_9;
                  stackOut_4_10 = stackIn_4_10;
                  stackOut_4_11 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  stackIn_6_4 = stackOut_4_4;
                  stackIn_6_5 = stackOut_4_5;
                  stackIn_6_6 = stackOut_4_6;
                  stackIn_6_7 = stackOut_4_7;
                  stackIn_6_8 = stackOut_4_8;
                  stackIn_6_9 = stackOut_4_9;
                  stackIn_6_10 = stackOut_4_10;
                  stackIn_6_11 = stackOut_4_11;
                  break L3;
                }
              }
              L4: {
                stackOut_6_0 = (at) ((Object) stackIn_6_0);
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = null;
                stackOut_6_3 = null;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = stackIn_6_5;
                stackOut_6_6 = stackIn_6_6;
                stackOut_6_7 = stackIn_6_7;
                stackOut_6_8 = stackIn_6_8;
                stackOut_6_9 = stackIn_6_9;
                stackOut_6_10 = stackIn_6_10;
                stackOut_6_11 = stackIn_6_11;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                stackIn_8_5 = stackOut_6_5;
                stackIn_8_6 = stackOut_6_6;
                stackIn_8_7 = stackOut_6_7;
                stackIn_8_8 = stackOut_6_8;
                stackIn_8_9 = stackOut_6_9;
                stackIn_8_10 = stackOut_6_10;
                stackIn_8_11 = stackOut_6_11;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                stackIn_7_6 = stackOut_6_6;
                stackIn_7_7 = stackOut_6_7;
                stackIn_7_8 = stackOut_6_8;
                stackIn_7_9 = stackOut_6_9;
                stackIn_7_10 = stackOut_6_10;
                stackIn_7_11 = stackOut_6_11;
                if (-1 <= (var3_int & 2 ^ -1)) {
                  stackOut_8_0 = (at) ((Object) stackIn_8_0);
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = null;
                  stackOut_8_3 = null;
                  stackOut_8_4 = stackIn_8_4;
                  stackOut_8_5 = stackIn_8_5;
                  stackOut_8_6 = stackIn_8_6;
                  stackOut_8_7 = stackIn_8_7;
                  stackOut_8_8 = stackIn_8_8;
                  stackOut_8_9 = stackIn_8_9;
                  stackOut_8_10 = stackIn_8_10;
                  stackOut_8_11 = stackIn_8_11;
                  stackOut_8_12 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  stackIn_9_5 = stackOut_8_5;
                  stackIn_9_6 = stackOut_8_6;
                  stackIn_9_7 = stackOut_8_7;
                  stackIn_9_8 = stackOut_8_8;
                  stackIn_9_9 = stackOut_8_9;
                  stackIn_9_10 = stackOut_8_10;
                  stackIn_9_11 = stackOut_8_11;
                  stackIn_9_12 = stackOut_8_12;
                  break L4;
                } else {
                  stackOut_7_0 = (at) ((Object) stackIn_7_0);
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = null;
                  stackOut_7_3 = null;
                  stackOut_7_4 = stackIn_7_4;
                  stackOut_7_5 = stackIn_7_5;
                  stackOut_7_6 = stackIn_7_6;
                  stackOut_7_7 = stackIn_7_7;
                  stackOut_7_8 = stackIn_7_8;
                  stackOut_7_9 = stackIn_7_9;
                  stackOut_7_10 = stackIn_7_10;
                  stackOut_7_11 = stackIn_7_11;
                  stackOut_7_12 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_9_4 = stackOut_7_4;
                  stackIn_9_5 = stackOut_7_5;
                  stackIn_9_6 = stackOut_7_6;
                  stackIn_9_7 = stackOut_7_7;
                  stackIn_9_8 = stackOut_7_8;
                  stackIn_9_9 = stackOut_7_9;
                  stackIn_9_10 = stackOut_7_10;
                  stackIn_9_11 = stackOut_7_11;
                  stackIn_9_12 = stackOut_7_12;
                  break L4;
                }
              }
              L5: {
                stackOut_9_0 = (at) ((Object) stackIn_9_0);
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = null;
                stackOut_9_3 = null;
                stackOut_9_4 = stackIn_9_4;
                stackOut_9_5 = stackIn_9_5;
                stackOut_9_6 = stackIn_9_6;
                stackOut_9_7 = stackIn_9_7;
                stackOut_9_8 = stackIn_9_8;
                stackOut_9_9 = stackIn_9_9;
                stackOut_9_10 = stackIn_9_10;
                stackOut_9_11 = stackIn_9_11;
                stackOut_9_12 = stackIn_9_12;
                stackOut_9_13 = 7 & var12;
                stackOut_9_14 = (var12 & 127) >> 911823460;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_11_3 = stackOut_9_3;
                stackIn_11_4 = stackOut_9_4;
                stackIn_11_5 = stackOut_9_5;
                stackIn_11_6 = stackOut_9_6;
                stackIn_11_7 = stackOut_9_7;
                stackIn_11_8 = stackOut_9_8;
                stackIn_11_9 = stackOut_9_9;
                stackIn_11_10 = stackOut_9_10;
                stackIn_11_11 = stackOut_9_11;
                stackIn_11_12 = stackOut_9_12;
                stackIn_11_13 = stackOut_9_13;
                stackIn_11_14 = stackOut_9_14;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                stackIn_10_5 = stackOut_9_5;
                stackIn_10_6 = stackOut_9_6;
                stackIn_10_7 = stackOut_9_7;
                stackIn_10_8 = stackOut_9_8;
                stackIn_10_9 = stackOut_9_9;
                stackIn_10_10 = stackOut_9_10;
                stackIn_10_11 = stackOut_9_11;
                stackIn_10_12 = stackOut_9_12;
                stackIn_10_13 = stackOut_9_13;
                stackIn_10_14 = stackOut_9_14;
                if ((8 & var12 ^ -1) == -1) {
                  stackOut_11_0 = (at) ((Object) stackIn_11_0);
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = null;
                  stackOut_11_3 = null;
                  stackOut_11_4 = stackIn_11_4;
                  stackOut_11_5 = stackIn_11_5;
                  stackOut_11_6 = stackIn_11_6;
                  stackOut_11_7 = stackIn_11_7;
                  stackOut_11_8 = stackIn_11_8;
                  stackOut_11_9 = stackIn_11_9;
                  stackOut_11_10 = stackIn_11_10;
                  stackOut_11_11 = stackIn_11_11;
                  stackOut_11_12 = stackIn_11_12;
                  stackOut_11_13 = stackIn_11_13;
                  stackOut_11_14 = stackIn_11_14;
                  stackOut_11_15 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  stackIn_12_3 = stackOut_11_3;
                  stackIn_12_4 = stackOut_11_4;
                  stackIn_12_5 = stackOut_11_5;
                  stackIn_12_6 = stackOut_11_6;
                  stackIn_12_7 = stackOut_11_7;
                  stackIn_12_8 = stackOut_11_8;
                  stackIn_12_9 = stackOut_11_9;
                  stackIn_12_10 = stackOut_11_10;
                  stackIn_12_11 = stackOut_11_11;
                  stackIn_12_12 = stackOut_11_12;
                  stackIn_12_13 = stackOut_11_13;
                  stackIn_12_14 = stackOut_11_14;
                  stackIn_12_15 = stackOut_11_15;
                  break L5;
                } else {
                  stackOut_10_0 = (at) ((Object) stackIn_10_0);
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = null;
                  stackOut_10_3 = null;
                  stackOut_10_4 = stackIn_10_4;
                  stackOut_10_5 = stackIn_10_5;
                  stackOut_10_6 = stackIn_10_6;
                  stackOut_10_7 = stackIn_10_7;
                  stackOut_10_8 = stackIn_10_8;
                  stackOut_10_9 = stackIn_10_9;
                  stackOut_10_10 = stackIn_10_10;
                  stackOut_10_11 = stackIn_10_11;
                  stackOut_10_12 = stackIn_10_12;
                  stackOut_10_13 = stackIn_10_13;
                  stackOut_10_14 = stackIn_10_14;
                  stackOut_10_15 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  stackIn_12_4 = stackOut_10_4;
                  stackIn_12_5 = stackOut_10_5;
                  stackIn_12_6 = stackOut_10_6;
                  stackIn_12_7 = stackOut_10_7;
                  stackIn_12_8 = stackOut_10_8;
                  stackIn_12_9 = stackOut_10_9;
                  stackIn_12_10 = stackOut_10_10;
                  stackIn_12_11 = stackOut_10_11;
                  stackIn_12_12 = stackOut_10_12;
                  stackIn_12_13 = stackOut_10_13;
                  stackIn_12_14 = stackOut_10_14;
                  stackIn_12_15 = stackOut_10_15;
                  break L5;
                }
              }
              L6: {
                stackOut_12_0 = (at) ((Object) stackIn_12_0);
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = null;
                stackOut_12_3 = null;
                stackOut_12_4 = stackIn_12_4;
                stackOut_12_5 = stackIn_12_5;
                stackOut_12_6 = stackIn_12_6;
                stackOut_12_7 = stackIn_12_7;
                stackOut_12_8 = stackIn_12_8;
                stackOut_12_9 = stackIn_12_9;
                stackOut_12_10 = stackIn_12_10;
                stackOut_12_11 = stackIn_12_11;
                stackOut_12_12 = stackIn_12_12;
                stackOut_12_13 = stackIn_12_13;
                stackOut_12_14 = stackIn_12_14;
                stackOut_12_15 = stackIn_12_15;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                stackIn_14_4 = stackOut_12_4;
                stackIn_14_5 = stackOut_12_5;
                stackIn_14_6 = stackOut_12_6;
                stackIn_14_7 = stackOut_12_7;
                stackIn_14_8 = stackOut_12_8;
                stackIn_14_9 = stackOut_12_9;
                stackIn_14_10 = stackOut_12_10;
                stackIn_14_11 = stackOut_12_11;
                stackIn_14_12 = stackOut_12_12;
                stackIn_14_13 = stackOut_12_13;
                stackIn_14_14 = stackOut_12_14;
                stackIn_14_15 = stackOut_12_15;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                stackIn_13_4 = stackOut_12_4;
                stackIn_13_5 = stackOut_12_5;
                stackIn_13_6 = stackOut_12_6;
                stackIn_13_7 = stackOut_12_7;
                stackIn_13_8 = stackOut_12_8;
                stackIn_13_9 = stackOut_12_9;
                stackIn_13_10 = stackOut_12_10;
                stackIn_13_11 = stackOut_12_11;
                stackIn_13_12 = stackOut_12_12;
                stackIn_13_13 = stackOut_12_13;
                stackIn_13_14 = stackOut_12_14;
                stackIn_13_15 = stackOut_12_15;
                if (-1 == (var12 & 128 ^ -1)) {
                  stackOut_14_0 = (at) ((Object) stackIn_14_0);
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = null;
                  stackOut_14_3 = null;
                  stackOut_14_4 = stackIn_14_4;
                  stackOut_14_5 = stackIn_14_5;
                  stackOut_14_6 = stackIn_14_6;
                  stackOut_14_7 = stackIn_14_7;
                  stackOut_14_8 = stackIn_14_8;
                  stackOut_14_9 = stackIn_14_9;
                  stackOut_14_10 = stackIn_14_10;
                  stackOut_14_11 = stackIn_14_11;
                  stackOut_14_12 = stackIn_14_12;
                  stackOut_14_13 = stackIn_14_13;
                  stackOut_14_14 = stackIn_14_14;
                  stackOut_14_15 = stackIn_14_15;
                  stackOut_14_16 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  stackIn_15_4 = stackOut_14_4;
                  stackIn_15_5 = stackOut_14_5;
                  stackIn_15_6 = stackOut_14_6;
                  stackIn_15_7 = stackOut_14_7;
                  stackIn_15_8 = stackOut_14_8;
                  stackIn_15_9 = stackOut_14_9;
                  stackIn_15_10 = stackOut_14_10;
                  stackIn_15_11 = stackOut_14_11;
                  stackIn_15_12 = stackOut_14_12;
                  stackIn_15_13 = stackOut_14_13;
                  stackIn_15_14 = stackOut_14_14;
                  stackIn_15_15 = stackOut_14_15;
                  stackIn_15_16 = stackOut_14_16;
                  break L6;
                } else {
                  stackOut_13_0 = (at) ((Object) stackIn_13_0);
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = null;
                  stackOut_13_3 = null;
                  stackOut_13_4 = stackIn_13_4;
                  stackOut_13_5 = stackIn_13_5;
                  stackOut_13_6 = stackIn_13_6;
                  stackOut_13_7 = stackIn_13_7;
                  stackOut_13_8 = stackIn_13_8;
                  stackOut_13_9 = stackIn_13_9;
                  stackOut_13_10 = stackIn_13_10;
                  stackOut_13_11 = stackIn_13_11;
                  stackOut_13_12 = stackIn_13_12;
                  stackOut_13_13 = stackIn_13_13;
                  stackOut_13_14 = stackIn_13_14;
                  stackOut_13_15 = stackIn_13_15;
                  stackOut_13_16 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_15_4 = stackOut_13_4;
                  stackIn_15_5 = stackOut_13_5;
                  stackIn_15_6 = stackOut_13_6;
                  stackIn_15_7 = stackOut_13_7;
                  stackIn_15_8 = stackOut_13_8;
                  stackIn_15_9 = stackOut_13_9;
                  stackIn_15_10 = stackOut_13_10;
                  stackIn_15_11 = stackOut_13_11;
                  stackIn_15_12 = stackOut_13_12;
                  stackIn_15_13 = stackOut_13_13;
                  stackIn_15_14 = stackOut_13_14;
                  stackIn_15_15 = stackOut_13_15;
                  stackIn_15_16 = stackOut_13_16;
                  break L6;
                }
              }
              ((at) (Object) stackIn_15_0).a((byte) stackIn_15_1, (tc) (new ag(stackIn_15_4, stackIn_15_5, stackIn_15_6, stackIn_15_7, stackIn_15_8, stackIn_15_9, stackIn_15_10, stackIn_15_11 != 0, stackIn_15_12 != 0, stackIn_15_13, stackIn_15_14, stackIn_15_15 != 0, stackIn_15_16 != 0, var13)));
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("ha.ND(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final boolean d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if ((eb.a((byte) -95, 85 & this.field_e) ^ -1) == (this.field_W / this.field_tb ^ -1)) {
          return false;
        } else {
          if ((eb.a((byte) -97, this.field_e & 170) ^ -1) == (this.field_W / this.field_tb ^ -1)) {
            return true;
          } else {
            L0: {
              var2 = this.i(0, -12710);
              if (param0 > 68) {
                break L0;
              } else {
                this.field_t = (at[]) null;
                break L0;
              }
            }
            L1: {
              var3 = this.i(1, -12710);
              if (var2 > var3) {
                break L1;
              } else {
                L2: {
                  if (var3 != var2) {
                    break L2;
                  } else {
                    L3: {
                      var4 = this.b((byte) 31, 0);
                      var5 = this.b((byte) 31, 1);
                      if (var5 < var4) {
                        break L3;
                      } else {
                        L4: {
                          if ((var4 ^ -1) == (var5 ^ -1)) {
                            var6 = 0;
                            var7 = 0;
                            var8 = 0;
                            L5: while (true) {
                              L6: {
                                L7: {
                                  if ((this.field_W ^ -1) >= (var8 ^ -1)) {
                                    break L7;
                                  } else {
                                    var7 = var7 + this.field_H[var8 + 1];
                                    var6 = var6 + this.field_H[var8];
                                    var8 += 2;
                                    if (var9 != 0) {
                                      break L6;
                                    } else {
                                      if (var9 == 0) {
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                if (var7 >= var6) {
                                  break L6;
                                } else {
                                  return true;
                                }
                              }
                              if (var6 != var7) {
                                if (var9 == 0) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              } else {
                                return true;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return true;
                  }
                }
                return false;
              }
            }
            return true;
          }
        }
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 < -126) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((this.field_W ^ -1) >= (var3_int ^ -1)) {
                      break L3;
                    } else {
                      stackOut_6_0 = vr.a(11987, this.field_lb[var3_int], param0);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0) {
                          stackOut_9_0 = var3_int;
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = -1;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = -8;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("ha.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final int d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_10_0 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        var5 = 0;
        if (param2 == 6) {
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var6 >= this.field_W) {
                  break L2;
                } else {
                  stackOut_4_0 = this.c(var6, param2 ^ -16991, param0);
                  stackIn_11_0 = stackOut_4_0 ? 1 : 0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (!stackIn_5_0) {
                        break L3;
                      } else {
                        var4++;
                        if (0 == (this.field_e & 1 << var6)) {
                          var5++;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6++;
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
            if (stackIn_11_0 == var5) {
              return 0;
            } else {
              if (this.field_K != null) {
                L4: {
                  if ((this.field_K.field_w ^ -1) == (param0 ^ -1)) {
                    param1 = (int)((float)param1 * this.field_bb);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return param1;
              } else {
                return param1 * var4 / var5;
              }
            }
          }
        } else {
          return 58;
        }
    }

    final void b(int param0, vh param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ne var10_ref_ne = null;
        int var11 = 0;
        jd var12 = null;
        int var13 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        vh stackIn_97_4 = null;
        Object stackIn_97_5 = null;
        int stackIn_97_6 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        vh stackIn_98_4 = null;
        Object stackIn_98_5 = null;
        int stackIn_98_6 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        vh stackIn_99_4 = null;
        Object stackIn_99_5 = null;
        int stackIn_99_6 = 0;
        int stackIn_99_7 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        vh stackOut_96_4 = null;
        Object stackOut_96_5 = null;
        int stackOut_96_6 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        vh stackOut_98_4 = null;
        Object stackOut_98_5 = null;
        int stackOut_98_6 = 0;
        int stackOut_98_7 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        vh stackOut_97_4 = null;
        Object stackOut_97_5 = null;
        int stackOut_97_6 = 0;
        int stackOut_97_7 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_jb = param1.i(param0 + 1);
            this.field_O = param1.e((byte) -104);
            this.field_T = new ln[this.field_W];
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3_int ^ -1) <= (this.field_W ^ -1)) {
                    break L3;
                  } else {
                    this.field_T[var3_int] = new ln();
                    tb.a(this.field_T[var3_int].field_a, param1, false, this.field_T[var3_int].field_b);
                    var3_int++;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3_int = param1.k(param0 ^ 0);
                break L2;
              }
              L4: {
                stackOut_7_0 = this;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if ((var3_int & 1) <= 0) {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L4;
                } else {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L4;
                }
              }
              L5: {
                ((ha) (this)).field_Bb = stackIn_10_1 != 0;
                this.field_hb = (56 & var3_int) >> -1197789053;
                this.field_cb = (6 & var3_int) >> 609155105;
                if (-1 == (var3_int & 128 ^ -1)) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L5;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L5;
                }
              }
              L6: {
                var4 = stackIn_13_0;
                var5 = 0;
                if (var4 == 0) {
                  break L6;
                } else {
                  var5 = param1.k(0);
                  break L6;
                }
              }
              this.field_Gb = param1.k(param0 ^ 0);
              this.field_gb = param1.k(param0 + 0);
              this.l(param0 + 0, 0);
              var6 = this.field_Eb.length + -1;
              L7: while (true) {
                L8: {
                  L9: {
                    L10: {
                      if (-1 < (var6 ^ -1)) {
                        break L10;
                      } else {
                        this.field_Eb[var6].i(14);
                        var6--;
                        if (var13 != 0) {
                          break L9;
                        } else {
                          if (var13 == 0) {
                            continue L7;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    L11: {
                      if (0 > (this.field_sb ^ -1)) {
                        break L11;
                      } else {
                        var6 = 0;
                        L12: while (true) {
                          L13: {
                            if ((this.field_W ^ -1) >= (var6 ^ -1)) {
                              break L13;
                            } else {
                              this.field_mb[var6] = param1.e((byte) -104);
                              var6++;
                              if (var13 != 0) {
                                break L8;
                              } else {
                                if (var13 == 0) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          if (var13 == 0) {
                            break L8;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    this.field_E[this.field_sb][6] = param1.k(0);
                    break L9;
                  }
                  var6 = 0;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (this.field_c[this.field_sb].length <= var6) {
                          break L16;
                        } else {
                          var7 = param1.k(param0 ^ 0);
                          this.field_c[this.field_sb][var6] = var7 >> 332258660;
                          stackOut_30_0 = this.field_c[this.field_sb][var6] ^ -1;
                          stackOut_30_1 = -8;
                          stackIn_38_0 = stackOut_30_0;
                          stackIn_38_1 = stackOut_30_1;
                          stackIn_31_0 = stackOut_30_0;
                          stackIn_31_1 = stackOut_30_1;
                          if (var13 != 0) {
                            break L15;
                          } else {
                            L17: {
                              L18: {
                                if (stackIn_31_0 > stackIn_31_1) {
                                  break L18;
                                } else {
                                  this.field_c[this.field_sb][var6] = -1;
                                  if (var13 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              this.field_E[this.field_sb][this.field_c[this.field_sb][var6]] = rn.a(15, var7);
                              this.field_D = this.field_D + 1;
                              if ((var6 ^ -1) != -3) {
                                break L17;
                              } else {
                                this.field_Cb = true;
                                break L17;
                              }
                            }
                            var6++;
                            if (var13 == 0) {
                              continue L14;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      this.field_H[this.field_sb] = param1.i(1);
                      this.field_mb[this.field_sb] = param1.e((byte) -104);
                      this.field_Q = param1.k(0);
                      stackOut_37_0 = -1;
                      stackOut_37_1 = this.field_Q ^ -1;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L15;
                    }
                    L19: {
                      L20: {
                        if (stackIn_38_0 != stackIn_38_1) {
                          L21: {
                            if (this.field_B != null) {
                              break L21;
                            } else {
                              this.field_B = new int[this.field_W][5];
                              break L21;
                            }
                          }
                          var6 = 0;
                          L22: while (true) {
                            if (-6 >= (var6 ^ -1)) {
                              break L20;
                            } else {
                              var7 = param1.e((byte) -104);
                              stackOut_44_0 = 65535;
                              stackOut_44_1 = var7;
                              stackIn_50_0 = stackOut_44_0;
                              stackIn_50_1 = stackOut_44_1;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              if (var13 != 0) {
                                break L19;
                              } else {
                                L23: {
                                  if (stackIn_45_0 == stackIn_45_1) {
                                    var7 = -1;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                this.field_B[this.field_sb][var6] = var7;
                                var6++;
                                if (var13 == 0) {
                                  continue L22;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                        } else {
                          break L20;
                        }
                      }
                      stackOut_49_0 = -1;
                      stackOut_49_1 = lf.field_i[this.field_Q] ^ -1;
                      stackIn_50_0 = stackOut_49_0;
                      stackIn_50_1 = stackOut_49_1;
                      break L19;
                    }
                    if (stackIn_50_0 != stackIn_50_1) {
                      this.field_m[this.field_sb] = param1.e((byte) -104);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                var6 = 0;
                L24: while (true) {
                  L25: {
                    L26: {
                      if (var6 >= this.field_tb) {
                        break L26;
                      } else {
                        this.field_fb[var6] = param1.e((byte) -104);
                        var6++;
                        if (var13 != 0) {
                          break L25;
                        } else {
                          if (var13 == 0) {
                            continue L24;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    var6 = 0;
                    break L25;
                  }
                  L27: while (true) {
                    L28: {
                      L29: {
                        if (var6 >= this.field_W) {
                          break L29;
                        } else {
                          L30: while (true) {
                            stackOut_61_0 = this.field_t[var6].b(false) ^ -1;
                            stackIn_69_0 = stackOut_61_0;
                            stackIn_62_0 = stackOut_61_0;
                            if (var13 != 0) {
                              break L28;
                            } else {
                              L31: {
                                L32: {
                                  if (stackIn_62_0 >= -1) {
                                    break L32;
                                  } else {
                                    ((jd) ((Object) this.field_t[var6].e((byte) 121))).e(-98);
                                    if (var13 != 0) {
                                      break L31;
                                    } else {
                                      if (var13 == 0) {
                                        continue L30;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                var6++;
                                break L31;
                              }
                              if (var13 == 0) {
                                continue L27;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                      }
                      var6 = param1.e((byte) -104);
                      stackOut_68_0 = 0;
                      stackIn_69_0 = stackOut_68_0;
                      break L28;
                    }
                    var7 = stackIn_69_0;
                    var8 = 0;
                    L33: while (true) {
                      L34: {
                        L35: {
                          L36: {
                            if ((var6 ^ -1) >= (var8 ^ -1)) {
                              break L36;
                            } else {
                              stackOut_71_0 = this.field_v * this.field_db ^ -1;
                              stackOut_71_1 = var7 ^ -1;
                              stackIn_94_0 = stackOut_71_0;
                              stackIn_94_1 = stackOut_71_1;
                              stackIn_72_0 = stackOut_71_0;
                              stackIn_72_1 = stackOut_71_1;
                              if (var13 != 0) {
                                L37: while (true) {
                                  if (stackIn_94_0 <= stackIn_94_1) {
                                    break L35;
                                  } else {
                                    var9 = param1.k(0);
                                    var10 = param1.k(0);
                                    var11 = param1.k(0);
                                    if (var13 != 0) {
                                      break L34;
                                    } else {
                                      L38: {
                                        stackOut_96_0 = var11 & 127;
                                        stackOut_96_1 = var5;
                                        stackOut_96_2 = var10;
                                        stackOut_96_3 = var9;
                                        stackOut_96_4 = (vh) (param1);
                                        stackOut_96_5 = this;
                                        stackOut_96_6 = -94;
                                        stackIn_98_0 = stackOut_96_0;
                                        stackIn_98_1 = stackOut_96_1;
                                        stackIn_98_2 = stackOut_96_2;
                                        stackIn_98_3 = stackOut_96_3;
                                        stackIn_98_4 = stackOut_96_4;
                                        stackIn_98_5 = stackOut_96_5;
                                        stackIn_98_6 = stackOut_96_6;
                                        stackIn_97_0 = stackOut_96_0;
                                        stackIn_97_1 = stackOut_96_1;
                                        stackIn_97_2 = stackOut_96_2;
                                        stackIn_97_3 = stackOut_96_3;
                                        stackIn_97_4 = stackOut_96_4;
                                        stackIn_97_5 = stackOut_96_5;
                                        stackIn_97_6 = stackOut_96_6;
                                        if (-1 == (128 & var11 ^ -1)) {
                                          stackOut_98_0 = stackIn_98_0;
                                          stackOut_98_1 = stackIn_98_1;
                                          stackOut_98_2 = stackIn_98_2;
                                          stackOut_98_3 = stackIn_98_3;
                                          stackOut_98_4 = (vh) ((Object) stackIn_98_4);
                                          stackOut_98_5 = this;
                                          stackOut_98_6 = stackIn_98_6;
                                          stackOut_98_7 = 0;
                                          stackIn_99_0 = stackOut_98_0;
                                          stackIn_99_1 = stackOut_98_1;
                                          stackIn_99_2 = stackOut_98_2;
                                          stackIn_99_3 = stackOut_98_3;
                                          stackIn_99_4 = stackOut_98_4;
                                          stackIn_99_5 = stackOut_98_5;
                                          stackIn_99_6 = stackOut_98_6;
                                          stackIn_99_7 = stackOut_98_7;
                                          break L38;
                                        } else {
                                          stackOut_97_0 = stackIn_97_0;
                                          stackOut_97_1 = stackIn_97_1;
                                          stackOut_97_2 = stackIn_97_2;
                                          stackOut_97_3 = stackIn_97_3;
                                          stackOut_97_4 = (vh) ((Object) stackIn_97_4);
                                          stackOut_97_5 = this;
                                          stackOut_97_6 = stackIn_97_6;
                                          stackOut_97_7 = 1;
                                          stackIn_99_0 = stackOut_97_0;
                                          stackIn_99_1 = stackOut_97_1;
                                          stackIn_99_2 = stackOut_97_2;
                                          stackIn_99_3 = stackOut_97_3;
                                          stackIn_99_4 = stackOut_97_4;
                                          stackIn_99_5 = stackOut_97_5;
                                          stackIn_99_6 = stackOut_97_6;
                                          stackIn_99_7 = stackOut_97_7;
                                          break L38;
                                        }
                                      }
                                      var12 = mb.a(stackIn_99_0, stackIn_99_1, stackIn_99_2, stackIn_99_3, stackIn_99_4, (ha) (this), stackIn_99_6, stackIn_99_7 != 0);
                                      this.field_t[var12.field_O].a((byte) -119, (tc) (var12));
                                      var8++;
                                      if (var13 == 0) {
                                        stackOut_93_0 = var8 ^ -1;
                                        stackOut_93_1 = var6 ^ -1;
                                        stackIn_94_0 = stackOut_93_0;
                                        stackIn_94_1 = stackOut_93_1;
                                        continue L37;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (stackIn_72_0 >= stackIn_72_1) {
                                  break L36;
                                } else {
                                  L39: {
                                    var9 = param1.k(0);
                                    if ((var9 & 128) == 0) {
                                      break L39;
                                    } else {
                                      var7 = var7 + (127 & var9);
                                      if (var13 == 0) {
                                        continue L33;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                  L40: {
                                    L41: {
                                      var10_ref_ne = this.field_Eb[var7];
                                      if (0 < (1 & var9)) {
                                        break L41;
                                      } else {
                                        var10_ref_ne.i(14);
                                        if (var13 == 0) {
                                          break L40;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                    var10_ref_ne.a(param0 + 63);
                                    break L40;
                                  }
                                  L42: {
                                    if ((var9 & 2) > 0) {
                                      var10_ref_ne.field_h = param1.k(0);
                                      var10_ref_ne.field_b = true;
                                      if (-12 != (var10_ref_ne.field_h ^ -1)) {
                                        break L42;
                                      } else {
                                        var11 = param1.k(0);
                                        var10_ref_ne.field_g = var11 >> 1881889764 & 15;
                                        var10_ref_ne.field_j = var11 & 15;
                                        break L42;
                                      }
                                    } else {
                                      break L42;
                                    }
                                  }
                                  L43: {
                                    if ((16 & var9 ^ -1) >= -1) {
                                      break L43;
                                    } else {
                                      var10_ref_ne.field_a = param1.k(0);
                                      break L43;
                                    }
                                  }
                                  L44: {
                                    if ((var9 & 4) > 0) {
                                      var10_ref_ne.field_m = param1.k(0);
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                  L45: {
                                    if (-1 > (64 & var9 ^ -1)) {
                                      var11 = param1.k(0);
                                      var10_ref_ne.b(true, var11);
                                      break L45;
                                    } else {
                                      break L45;
                                    }
                                  }
                                  var7++;
                                  var8++;
                                  if (var13 == 0) {
                                    continue L33;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                            }
                          }
                          var6 = param1.e((byte) -104);
                          var8 = param0;
                          L46: while (true) {
                            stackOut_93_0 = var8 ^ -1;
                            stackOut_93_1 = var6 ^ -1;
                            stackIn_94_0 = stackOut_93_0;
                            stackIn_94_1 = stackOut_93_1;
                            if (stackIn_94_0 <= stackIn_94_1) {
                              break L35;
                            } else {
                              var9 = param1.k(0);
                              var10 = param1.k(0);
                              var11 = param1.k(0);
                              if (var13 != 0) {
                                break L34;
                              } else {
                                L47: {
                                  stackOut_96_0 = var11 & 127;
                                  stackOut_96_1 = var5;
                                  stackOut_96_2 = var10;
                                  stackOut_96_3 = var9;
                                  stackOut_96_4 = (vh) (param1);
                                  stackOut_96_5 = this;
                                  stackOut_96_6 = -94;
                                  stackIn_98_0 = stackOut_96_0;
                                  stackIn_98_1 = stackOut_96_1;
                                  stackIn_98_2 = stackOut_96_2;
                                  stackIn_98_3 = stackOut_96_3;
                                  stackIn_98_4 = stackOut_96_4;
                                  stackIn_98_5 = stackOut_96_5;
                                  stackIn_98_6 = stackOut_96_6;
                                  stackIn_97_0 = stackOut_96_0;
                                  stackIn_97_1 = stackOut_96_1;
                                  stackIn_97_2 = stackOut_96_2;
                                  stackIn_97_3 = stackOut_96_3;
                                  stackIn_97_4 = stackOut_96_4;
                                  stackIn_97_5 = stackOut_96_5;
                                  stackIn_97_6 = stackOut_96_6;
                                  if (-1 == (128 & var11 ^ -1)) {
                                    stackOut_98_0 = stackIn_98_0;
                                    stackOut_98_1 = stackIn_98_1;
                                    stackOut_98_2 = stackIn_98_2;
                                    stackOut_98_3 = stackIn_98_3;
                                    stackOut_98_4 = (vh) ((Object) stackIn_98_4);
                                    stackOut_98_5 = this;
                                    stackOut_98_6 = stackIn_98_6;
                                    stackOut_98_7 = 0;
                                    stackIn_99_0 = stackOut_98_0;
                                    stackIn_99_1 = stackOut_98_1;
                                    stackIn_99_2 = stackOut_98_2;
                                    stackIn_99_3 = stackOut_98_3;
                                    stackIn_99_4 = stackOut_98_4;
                                    stackIn_99_5 = stackOut_98_5;
                                    stackIn_99_6 = stackOut_98_6;
                                    stackIn_99_7 = stackOut_98_7;
                                    break L47;
                                  } else {
                                    stackOut_97_0 = stackIn_97_0;
                                    stackOut_97_1 = stackIn_97_1;
                                    stackOut_97_2 = stackIn_97_2;
                                    stackOut_97_3 = stackIn_97_3;
                                    stackOut_97_4 = (vh) ((Object) stackIn_97_4);
                                    stackOut_97_5 = this;
                                    stackOut_97_6 = stackIn_97_6;
                                    stackOut_97_7 = 1;
                                    stackIn_99_0 = stackOut_97_0;
                                    stackIn_99_1 = stackOut_97_1;
                                    stackIn_99_2 = stackOut_97_2;
                                    stackIn_99_3 = stackOut_97_3;
                                    stackIn_99_4 = stackOut_97_4;
                                    stackIn_99_5 = stackOut_97_5;
                                    stackIn_99_6 = stackOut_97_6;
                                    stackIn_99_7 = stackOut_97_7;
                                    break L47;
                                  }
                                }
                                var12 = mb.a(stackIn_99_0, stackIn_99_1, stackIn_99_2, stackIn_99_3, stackIn_99_4, (ha) (this), stackIn_99_6, stackIn_99_7 != 0);
                                this.field_t[var12.field_O].a((byte) -119, (tc) (var12));
                                var8++;
                                if (var13 == 0) {
                                  continue L46;
                                } else {
                                  break L35;
                                }
                              }
                            }
                          }
                        }
                        this.k(-29673);
                        this.f(-2);
                        this.field_xb = this.f((byte) -82);
                        this.b(param0 ^ 2);
                        this.a(0, 0, param0 + 0, -1);
                        fl.a((ha) (this), -118);
                        break L34;
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
          L48: {
            var3 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) (var3);
            stackOut_102_1 = new StringBuilder().append("ha.UA(").append(param0).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param1 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L48;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L48;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ')');
        }
    }

    private final void a(boolean param0) {
        boolean discarded$2 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_6_1 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.a((byte) 78);
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var3 >= this.field_W) {
                break L2;
              } else {
                stackOut_2_0 = 0;
                stackOut_2_1 = var2 & 1 << var3;
                stackIn_7_0 = stackOut_2_0;
                stackIn_7_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 == stackIn_3_1) {
                      break L3;
                    } else {
                      discarded$2 = this.b(var3, param0);
                      break L3;
                    }
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_6_0 = param0;
            stackOut_6_1 = 1;
            stackIn_7_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          }
          L4: {
            if (stackIn_7_0 == stackIn_7_1) {
              break L4;
            } else {
              this.field_R = 57;
              break L4;
            }
          }
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        if (0 > (param0 ^ -1)) {
            if (-1 < param2) {
                if (param0 < this.field_v) {
                    if (!((this.field_db ^ -1) >= (param2 ^ -1))) {
                        this.field_Eb[param0 - -(param2 * this.field_v)].b(true, param3);
                    }
                }
            }
        }
        if (param1) {
            this.field_kb = true;
        }
    }

    final void f(int param0, int param1, int param2, int param3) {
        jd var5 = this.c(param3, true, param0);
        if (var5 != null) {
            if (!(!this.c(var5.field_O, -16985, param1))) {
                var5.field_A = 5;
            }
        }
        if (param2 < 117) {
            this.field_Cb = true;
        }
    }

    final int g(int param0) {
        if (!(param0 != (this.field_A ^ -1))) {
            return -1;
        }
        return 3 - this.field_A;
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        L0: {
          if (param1 == 255) {
            break L0;
          } else {
            this.a(30, (gn) null, -50);
            break L0;
          }
        }
        L1: {
          var6 = 0;
          var12 = this.a(param3, (byte) 118, param4, param0);
          var11 = var12;
          var7 = var11;
          var8 = bw.field_m[param2][1];
          var9 = b.a(false, param2);
          if (-75 == (param2 ^ -1)) {
            break L1;
          } else {
            if (param2 < 8) {
              break L1;
            } else {
              if (0 == (1 << var9 & this.field_a[param0][var8 - -1])) {
                return 4;
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (this.f(bw.field_m[param2][8], this.field_H[param0], 0)) {
            break L2;
          } else {
            var6 = var6 | 1;
            break L2;
          }
        }
        L3: {
          L4: {
            if (0 != (bw.field_m[param2][1] ^ -1)) {
              break L4;
            } else {
              var10 = var12[6];
              if (!ArmiesOfGielinor.field_M) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          var10 = var7[bw.field_m[param2][1]];
          break L3;
        }
        L5: {
          if (!this.a(var10, true, bw.field_m[param2][2])) {
            var6 = var6 | 2;
            break L5;
          } else {
            break L5;
          }
        }
        return var6;
    }

    final int e(int param0, int param1, int param2) {
        if (this.field_K != null) {
            if (uc.field_d[param2][4] == 4) {
                if (0 != uc.field_d[param2][3]) {
                    return -this.field_mb[param1] + 1;
                }
            }
            return 0;
        }
        int var4 = -66 % ((param0 - -19) / 35);
        if (this.field_mb[param1] < uc.field_d[param2][1]) {
            return uc.field_d[param2][1] - this.field_mb[param1];
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          L1: {
            L2: {
              var11 = ArmiesOfGielinor.field_M ? 1 : 0;
              if (param2 <= param3) {
                break L2;
              } else {
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (this.field_v <= var5) {
                      break L4;
                    } else {
                      if (var11 != 0) {
                        break L0;
                      } else {
                        var6 = 0;
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (var6 >= this.field_db) {
                                break L7;
                              } else {
                                this.b(this.field_Eb[var6 * this.field_v + var5].field_k, 12534, var6, var5);
                                if (var11 != 0) {
                                  break L6;
                                } else {
                                  L8: {
                                    if (null == this.field_Eb[var5 + var6 * this.field_v].field_c) {
                                      break L8;
                                    } else {
                                      this.field_Eb[var5 + var6 * this.field_v].field_c.a((byte) -17);
                                      break L8;
                                    }
                                  }
                                  var6++;
                                  if (var11 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            var5++;
                            break L6;
                          }
                          if (var11 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (var11 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L9: {
              var5 = param1 + -param3;
              var6 = param3 + param1;
              var7 = param0 - param3;
              var8 = param0 + param3;
              if (var5 >= 0) {
                break L9;
              } else {
                var5 = 0;
                break L9;
              }
            }
            L10: {
              if (0 <= var7) {
                break L10;
              } else {
                var7 = 0;
                break L10;
              }
            }
            L11: {
              if (this.field_v <= var6) {
                var6 = -1 + this.field_v;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if ((this.field_db ^ -1) >= (var8 ^ -1)) {
                var8 = this.field_db + -1;
                break L12;
              } else {
                break L12;
              }
            }
            var9 = var5;
            L13: while (true) {
              if (var6 < var9) {
                break L1;
              } else {
                if (var11 != 0) {
                  break L0;
                } else {
                  var10 = var7;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (var10 > var8) {
                          break L16;
                        } else {
                          this.b(this.field_Eb[var10 * this.field_v + var9].field_k, 12534, var10, var9);
                          if (var11 != 0) {
                            break L15;
                          } else {
                            L17: {
                              if (this.field_Eb[var9 + var10 * this.field_v].field_c == null) {
                                break L17;
                              } else {
                                this.field_Eb[this.field_v * var10 + var9].field_c.a((byte) 55);
                                break L17;
                              }
                            }
                            var10++;
                            if (var11 == 0) {
                              continue L14;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      var9++;
                      break L15;
                    }
                    if (var11 == 0) {
                      continue L13;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          break L0;
        }
    }

    private final void h(byte param0) {
        oj var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        L0: while (true) {
          L1: {
            if (-1 <= (this.field_l.b(false) ^ -1)) {
              break L1;
            } else {
              var2 = (oj) ((Object) this.field_l.a(0));
              var2.a((ha) (this), -26661);
              if (var3 != 0) {
                return;
              } else {
                if (var3 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (param0 == 108) {
            return;
          } else {
            return;
          }
        }
    }

    private final int[] d(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_10_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackOut_9_0 = null;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = new int[this.field_W];
          var3 = 0;
          if (param0 == 10326) {
            break L0;
          } else {
            this.field_Ab = false;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if ((var3 ^ -1) <= (this.field_W ^ -1)) {
                break L3;
              } else {
                var2[var3] = this.field_W;
                var3++;
                if (var5 != 0) {
                  break L2;
                } else {
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var3 = 0;
            break L2;
          }
          L4: while (true) {
            L5: {
              if (this.field_W <= var3) {
                break L5;
              } else {
                stackOut_9_0 = this.field_n;
                stackIn_16_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (var5 != 0) {
                  return stackIn_16_0;
                } else {
                  L6: {
                    var4 = stackIn_10_0[var3];
                    if (0 != (var4 ^ -1)) {
                      break L6;
                    } else {
                      if (var5 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2[var4] = var3;
                  var3++;
                  if (var5 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return var2;
          }
        }
    }

    final int a(int param0, int param1, int param2, byte param3) {
        int discarded$1 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        ne var11 = null;
        ne var12 = null;
        ne var13 = null;
        ne var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_51_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param3 <= -32) {
            break L0;
          } else {
            discarded$1 = this.a((String) null, 89);
            break L0;
          }
        }
        var5 = 1;
        L1: while (true) {
          L2: {
            if (var5 == 0) {
              break L2;
            } else {
              var5 = 0;
              stackOut_4_0 = -this.field_ab;
              stackIn_51_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var10 != 0) {
                return stackIn_51_0;
              } else {
                var6 = stackIn_5_0;
                L3: while (true) {
                  stackOut_6_0 = var6;
                  stackOut_6_1 = this.field_ab;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  L4: while (true) {
                    L5: {
                      if (stackIn_7_0 >= stackIn_7_1) {
                        break L5;
                      } else {
                        var7 = param2 - -var6;
                        var8 = param0 + this.field_ab;
                        stackOut_8_0 = var7;
                        stackOut_8_1 = -1;
                        stackIn_7_0 = stackOut_8_0;
                        stackIn_7_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var10 != 0) {
                          continue L4;
                        } else {
                          L6: {
                            if (stackIn_9_0 <= stackIn_9_1) {
                              break L6;
                            } else {
                              if ((this.field_v ^ -1) >= (var7 ^ -1)) {
                                break L6;
                              } else {
                                if (var8 <= -1) {
                                  break L6;
                                } else {
                                  if ((this.field_db ^ -1) >= (var8 ^ -1)) {
                                    break L6;
                                  } else {
                                    var5 = 1;
                                    var11 = this.field_Eb[var7 + this.field_v * var8];
                                    if (!this.c(var11.field_a, -16985, param1)) {
                                      break L6;
                                    } else {
                                      if (var11.field_c != null) {
                                        break L6;
                                      } else {
                                        if (var11.field_l) {
                                          break L6;
                                        } else {
                                          if (!var11.a(false)) {
                                            break L6;
                                          } else {
                                            return var7 + var8 * this.field_v;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L7: {
                            var7 = this.field_ab + param2;
                            var8 = var6 + param0;
                            if (var7 <= -1) {
                              break L7;
                            } else {
                              if (this.field_v <= var7) {
                                break L7;
                              } else {
                                if (-1 >= var8) {
                                  break L7;
                                } else {
                                  if ((var8 ^ -1) <= (this.field_db ^ -1)) {
                                    break L7;
                                  } else {
                                    var5 = 1;
                                    var12 = this.field_Eb[var8 * this.field_v + var7];
                                    if (!this.c(var12.field_a, -16985, param1)) {
                                      break L7;
                                    } else {
                                      if (var12.field_c != null) {
                                        break L7;
                                      } else {
                                        if (var12.field_l) {
                                          break L7;
                                        } else {
                                          if (var12.a(false)) {
                                            return this.field_v * var8 + var7;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L8: {
                            var7 = -var6 + param2;
                            var8 = param0 + -this.field_ab;
                            if (0 <= (var7 ^ -1)) {
                              break L8;
                            } else {
                              if (this.field_v <= var7) {
                                break L8;
                              } else {
                                if ((var8 ^ -1) >= 0) {
                                  break L8;
                                } else {
                                  if ((var8 ^ -1) > (this.field_db ^ -1)) {
                                    var5 = 1;
                                    var13 = this.field_Eb[var8 * this.field_v + var7];
                                    if (!this.c(var13.field_a, -16985, param1)) {
                                      break L8;
                                    } else {
                                      if (null != var13.field_c) {
                                        break L8;
                                      } else {
                                        if (var13.field_l) {
                                          break L8;
                                        } else {
                                          if (!var13.a(false)) {
                                            break L8;
                                          } else {
                                            return var7 - -(var8 * this.field_v);
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          L9: {
                            var7 = param2 - this.field_ab;
                            var8 = -var6 + param0;
                            if (0 <= (var7 ^ -1)) {
                              break L9;
                            } else {
                              if ((this.field_v ^ -1) >= (var7 ^ -1)) {
                                break L9;
                              } else {
                                if ((var8 ^ -1) >= 0) {
                                  break L9;
                                } else {
                                  if ((var8 ^ -1) > (this.field_db ^ -1)) {
                                    var5 = 1;
                                    var14 = this.field_Eb[var7 + this.field_v * var8];
                                    if (!this.c(var14.field_a, -16985, param1)) {
                                      break L9;
                                    } else {
                                      if (var14.field_c != null) {
                                        break L9;
                                      } else {
                                        if (var14.field_l) {
                                          break L9;
                                        } else {
                                          if (!var14.a(false)) {
                                            break L9;
                                          } else {
                                            return var8 * this.field_v + var7;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                          var6++;
                          if (var10 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    this.field_ab = this.field_ab + 1;
                    if (var10 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          return -1;
        }
    }

    final void a(vh param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ne var9_ref_ne = null;
        int var9 = 0;
        jd var10 = null;
        int var11 = 0;
        int var12 = 0;
        ne var13 = null;
        int stackIn_9_0 = 0;
        vh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        vh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        vh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        vh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        vh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_113_0 = 0;
        jd stackIn_116_0 = null;
        jd stackIn_119_0 = null;
        jd stackIn_119_1 = null;
        Object stackIn_128_0 = null;
        jd stackIn_129_0 = null;
        jd stackIn_130_0 = null;
        jd stackIn_133_0 = null;
        jd stackIn_134_0 = null;
        jd stackIn_134_1 = null;
        vh stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        vh stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        vh stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        int stackIn_140_2 = 0;
        Object stackIn_144_0 = null;
        RuntimeException stackIn_147_0 = null;
        StringBuilder stackIn_147_1 = null;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_149_2 = null;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        vh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        vh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        vh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        vh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        vh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_41_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_112_0 = 0;
        jd stackOut_115_0 = null;
        jd stackOut_118_0 = null;
        jd stackOut_118_1 = null;
        Object stackOut_127_0 = null;
        jd stackOut_128_0 = null;
        jd stackOut_132_0 = null;
        jd stackOut_133_0 = null;
        jd stackOut_133_1 = null;
        vh stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        vh stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        int stackOut_138_2 = 0;
        vh stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        int stackOut_139_2 = 0;
        Object stackOut_143_0 = null;
        RuntimeException stackOut_146_0 = null;
        StringBuilder stackOut_146_1 = null;
        RuntimeException stackOut_147_0 = null;
        StringBuilder stackOut_147_1 = null;
        String stackOut_147_2 = null;
        RuntimeException stackOut_148_0 = null;
        StringBuilder stackOut_148_1 = null;
        String stackOut_148_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 0;
                        param0.a((byte) -58, this.field_jb);
                        param0.b(true, this.field_O);
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 >= this.field_W) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ir.a(this.field_T[var5].field_a, (byte) 100, param0, this.field_T[var5].field_b);
                        var5++;
                        if (var12 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var12 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.field_Bb) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_9_0 = stackOut_7_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = stackIn_9_0 | this.field_cb << 2103035265 | this.field_hb << 1557648387 | 128;
                        param0.b(1, var5);
                        param0.b(param1 + 25772, 1);
                        param0.b(1, this.field_Gb);
                        param0.b(1, this.field_gb);
                        if ((param2 ^ -1) >= 0) {
                            statePc = 33;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param0.b(1, this.field_E[param2][6]);
                        var6 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var6 ^ -1) <= (this.field_c[param2].length ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (vh) (param0);
                        stackOut_12_1 = param1 + 25772;
                        stackOut_12_2 = 0;
                        stackIn_21_0 = stackOut_12_0;
                        stackIn_21_1 = stackOut_12_1;
                        stackIn_21_2 = stackOut_12_2;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        if (var12 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (vh) ((Object) stackIn_13_0);
                        stackOut_13_1 = stackIn_13_1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (stackIn_13_2 <= this.field_c[param2][var6]) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (vh) ((Object) stackIn_14_0);
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = 0;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = (vh) ((Object) stackIn_15_0);
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = this.field_E[param2][this.field_c[param2][var6]];
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((vh) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_16_2 | this.field_c[param2][var6] << -139163644);
                        var6++;
                        if (var12 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (this.field_H[param2] >= 1) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param0.a((byte) -104, 0);
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (vh) (param0);
                        stackOut_20_1 = -107;
                        stackOut_20_2 = this.field_H[param2];
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((vh) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_21_2);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param0.b(true, this.field_mb[param2]);
                        param0.b(1, this.field_Q);
                        if ((this.field_Q ^ -1) != -1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var6 >= 5) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param0.b(true, this.field_B[param2][var6]);
                        var6++;
                        if (var12 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var12 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((lf.field_i[this.field_Q] ^ -1) != -1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param0.b(true, this.field_m[param2]);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var12 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var6 ^ -1) <= (this.field_W ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param0.b(true, this.field_mb[var6]);
                        var6++;
                        if (var12 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var12 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var6 >= this.field_tb) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = -2;
                        stackIn_48_0 = stackOut_41_0;
                        stackIn_42_0 = stackOut_41_0;
                        if (var12 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 >= (this.field_fb[var6] ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        param0.b(true, 0);
                        if (var12 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        param0.b(true, this.field_fb[var6]);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var6++;
                        if (var12 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6 = 0;
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7 = stackIn_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = this.field_v;
                        stackOut_49_1 = var7;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 <= stackIn_50_1) {
                            statePc = 66;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = 0;
                        stackIn_67_0 = stackOut_51_0;
                        stackIn_52_0 = stackOut_51_0;
                        if (var12 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var8 = stackIn_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (this.field_v <= var8) {
                            statePc = 65;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var9_ref_ne = this.field_Eb[var7 - -(this.field_v * var8)];
                        stackOut_54_0 = 0;
                        stackOut_54_1 = var9_ref_ne.field_a ^ -1;
                        stackIn_50_0 = stackOut_54_0;
                        stackIn_50_1 = stackOut_54_1;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        if (var12 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 > stackIn_55_1) {
                            statePc = 63;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var9_ref_ne.field_b) {
                            statePc = 63;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (null == var9_ref_ne.field_c) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var9_ref_ne.l(param1 ^ 25770)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var9_ref_ne.c(67)) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var9_ref_ne.c((byte) -79)) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var6++;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var7++;
                        if (var12 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = param1;
                        stackIn_67_0 = stackOut_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 == -25771) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        this.a(89, (String) null, (oj) null);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var4_int != 0) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var6 = this.field_db * this.field_v;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        param0.b(true, var6);
                        var7 = 0;
                        var6 = 0;
                        var8 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var8 >= this.field_db * this.field_v) {
                            statePc = 112;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = var4_int;
                        stackIn_113_0 = stackOut_74_0;
                        stackIn_75_0 = stackOut_74_0;
                        if (var12 != 0) {
                            statePc = 113;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (stackIn_75_0 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = 2;
                        stackIn_78_0 = stackOut_76_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = 0;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var9 = stackIn_78_0;
                        var13 = this.field_Eb[var8];
                        if (!var13.c(param1 ^ 25807)) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var9 = var9 | 1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var13.field_b) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var9 = var9 | 2;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if ((var13.field_a ^ -1) >= 0) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var9 = var9 | 16;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (null == var13.field_c) {
                            statePc = 89;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var13.l(-1)) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var9 = var9 | 4;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (!var13.c((byte) -79)) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var9 = var9 | 64;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var9 <= 0) {
                            statePc = 111;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if ((var8 ^ -1) >= (var7 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = var8 - var7;
                        stackOut_93_1 = 127;
                        stackIn_99_0 = stackOut_93_0;
                        stackIn_99_1 = stackOut_93_1;
                        stackIn_94_0 = stackOut_93_0;
                        stackIn_94_1 = stackOut_93_1;
                        if (var12 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 <= stackIn_94_1) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackOut_95_0 = 127;
                        stackIn_97_0 = stackOut_95_0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = -var7 + var8;
                        stackIn_97_0 = stackOut_96_0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var11 = stackIn_97_0;
                        var7 = var7 + var11;
                        param0.b(1, var11 | 128);
                        if (var12 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        param0.b(1, var9);
                        stackOut_98_0 = 0;
                        stackOut_98_1 = var9 & 2;
                        stackIn_99_0 = stackOut_98_0;
                        stackIn_99_1 = stackOut_98_1;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (stackIn_99_0 >= stackIn_99_1) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        param0.b(1, var13.field_h);
                        if ((var13.field_h ^ -1) != -12) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        param0.b(1, var13.field_g << 1536654212 | var13.field_j);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if ((var9 & 16) <= 0) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        param0.b(1, var13.field_a);
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if ((var9 & 8) <= 0) {
                            statePc = 105;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (-1 > (4 & var9 ^ -1)) {
                            statePc = 107;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        param0.b(1, var13.field_m);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var7++;
                        if (0 < (var9 & 64)) {
                            statePc = 110;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        param0.b(param1 + 25772, var13.field_a);
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var8 = param2;
                        stackOut_112_0 = 0;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var9 = stackIn_113_0;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if ((var9 ^ -1) <= (this.field_W ^ -1)) {
                            statePc = 125;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = (jd) ((Object) this.field_t[var9].e((byte) 119));
                        stackIn_129_0 = stackOut_115_0;
                        stackIn_116_0 = stackOut_115_0;
                        if (var12 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var10 = stackIn_116_0;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var10 == null) {
                            statePc = 124;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = (jd) (var10);
                        stackOut_118_1 = this.field_Eb[var10.field_J - -(var10.field_w * this.field_v)].field_c;
                        stackIn_134_0 = stackOut_118_0;
                        stackIn_134_1 = stackOut_118_1;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        if (var12 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (stackIn_119_0 == stackIn_119_1) {
                            statePc = 122;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if ((var8 ^ -1) != (var9 ^ -1)) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var6++;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var10 = (jd) ((Object) this.field_t[var9].a((byte) 123));
                        if (var12 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        param0.b(true, var6);
                        var9 = 0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var9 >= this.field_W) {
                            statePc = 143;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = this;
                        stackIn_144_0 = stackOut_127_0;
                        stackIn_128_0 = stackOut_127_0;
                        if (var12 != 0) {
                            statePc = 144;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        stackOut_128_0 = (jd) ((Object) ((ha) (this)).field_t[var9].e((byte) 114));
                        stackIn_129_0 = stackOut_128_0;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var10 = stackIn_129_0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var10 = stackIn_130_0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var10 == null) {
                            statePc = 142;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = this.field_Eb[var10.field_J + this.field_v * var10.field_w].field_c;
                        stackIn_130_0 = stackOut_132_0;
                        stackIn_133_0 = stackOut_132_0;
                        if (var12 != 0) {
                            statePc = 130;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackOut_133_0 = (jd) ((Object) stackIn_133_0);
                        stackOut_133_1 = (jd) (var10);
                        stackIn_134_0 = stackOut_133_0;
                        stackIn_134_1 = stackOut_133_1;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (stackIn_134_0 == stackIn_134_1) {
                            statePc = 137;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if ((var8 ^ -1) != (var9 ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        param0.b(1, var10.field_J);
                        param0.b(1, var10.field_w);
                        stackOut_137_0 = (vh) (param0);
                        stackOut_137_1 = param1 + 25772;
                        stackIn_139_0 = stackOut_137_0;
                        stackIn_139_1 = stackOut_137_1;
                        stackIn_138_0 = stackOut_137_0;
                        stackIn_138_1 = stackOut_137_1;
                        if (var10 == this.field_Eb[this.field_v * var10.field_w + var10.field_J].field_c) {
                            statePc = 139;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackOut_138_0 = (vh) ((Object) stackIn_138_0);
                        stackOut_138_1 = stackIn_138_1;
                        stackOut_138_2 = 128;
                        stackIn_140_0 = stackOut_138_0;
                        stackIn_140_1 = stackOut_138_1;
                        stackIn_140_2 = stackOut_138_2;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackOut_139_0 = (vh) ((Object) stackIn_139_0);
                        stackOut_139_1 = stackIn_139_1;
                        stackOut_139_2 = 0;
                        stackIn_140_0 = stackOut_139_0;
                        stackIn_140_1 = stackOut_139_1;
                        stackIn_140_2 = stackOut_139_2;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        ((vh) (Object) stackIn_140_0).b(stackIn_140_1, stackIn_140_2 | var10.field_N);
                        fu.a(29712, var10, param0);
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var10 = (jd) ((Object) this.field_t[var9].a((byte) 123));
                        if (var12 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackOut_143_0 = this;
                        stackIn_144_0 = stackOut_143_0;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        this.b(param1 + 25773);
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 146: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackOut_146_0 = (RuntimeException) (var4);
                    stackOut_146_1 = new StringBuilder().append("ha.TD(");
                    stackIn_148_0 = stackOut_146_0;
                    stackIn_148_1 = stackOut_146_1;
                    stackIn_147_0 = stackOut_146_0;
                    stackIn_147_1 = stackOut_146_1;
                    if (param0 == null) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackOut_147_0 = (RuntimeException) ((Object) stackIn_147_0);
                    stackOut_147_1 = (StringBuilder) ((Object) stackIn_147_1);
                    stackOut_147_2 = "{...}";
                    stackIn_149_0 = stackOut_147_0;
                    stackIn_149_1 = stackOut_147_1;
                    stackIn_149_2 = stackOut_147_2;
                    statePc = 149;
                    continue stateLoop;
                }
                case 148: {
                    stackOut_148_0 = (RuntimeException) ((Object) stackIn_148_0);
                    stackOut_148_1 = (StringBuilder) ((Object) stackIn_148_1);
                    stackOut_148_2 = "null";
                    stackIn_149_0 = stackOut_148_0;
                    stackIn_149_1 = stackOut_148_1;
                    stackIn_149_2 = stackOut_148_2;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    throw ig.a((Throwable) ((Object) stackIn_149_0), stackIn_149_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 150: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int[] param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
            L1: {
              L2: {
                this.field_R = param0;
                if ((param0 ^ -1) != -2) {
                  break L2;
                } else {
                  this.field_gb = param2[0];
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_gb = -1;
              break L1;
            }
            L3: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param1) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            ((ha) (this)).field_X = stackIn_7_1 != 0;
            this.field_p = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ha.HB(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final oj b(boolean param0) {
        if (0 == this.field_l.b(param0)) {
            return null;
        }
        oj var2 = (oj) ((Object) this.field_l.e((byte) 118));
        if (var2 == null) {
            return null;
        }
        return var2;
    }

    final void a(byte param0, int param1, int param2, ne[] param3) {
        int discarded$4 = 0;
        int[] dupTemp$5 = null;
        int[] dupTemp$6 = null;
        int[] dupTemp$7 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        jd var9_ref_jd = null;
        int var9 = 0;
        jd var10_ref_jd = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jd var17 = null;
        vh var18 = null;
        ik var19 = null;
        int var20 = 0;
        ne var21 = null;
        jd var22 = null;
        at var23 = null;
        bb var24 = null;
        ne var25 = null;
        jd var26 = null;
        int[] var30 = null;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        jd stackIn_52_0 = null;
        jd stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        int stackIn_52_5 = 0;
        int stackIn_52_6 = 0;
        int stackIn_52_7 = 0;
        jd stackIn_53_0 = null;
        jd stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        int stackIn_53_5 = 0;
        int stackIn_53_6 = 0;
        int stackIn_53_7 = 0;
        jd stackIn_54_0 = null;
        jd stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        int stackIn_54_5 = 0;
        int stackIn_54_6 = 0;
        int stackIn_54_7 = 0;
        int stackIn_54_8 = 0;
        int stackIn_91_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        jd stackOut_51_0 = null;
        jd stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        int stackOut_51_5 = 0;
        int stackOut_51_6 = 0;
        int stackOut_51_7 = 0;
        jd stackOut_53_0 = null;
        jd stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_53_5 = 0;
        int stackOut_53_6 = 0;
        int stackOut_53_7 = 0;
        int stackOut_53_8 = 0;
        jd stackOut_52_0 = null;
        jd stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
        int stackOut_52_5 = 0;
        int stackOut_52_6 = 0;
        int stackOut_52_7 = 0;
        int stackOut_52_8 = 0;
        int stackOut_89_0 = 0;
        int stackOut_90_0 = 0;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = param1 * param2;
              if (param3.length == var5_int) {
                this.field_j = new ul((ha) (this), param3, param1, param2);
                this.field_Eb = param3;
                this.field_db = param2;
                this.field_v = param1;
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if ((this.field_t.length ^ -1) >= (var6 ^ -1)) {
                        break L3;
                      } else {
                        var23 = this.field_t[var6];
                        if (var20 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (var23 != null) {
                                  break L6;
                                } else {
                                  if (var20 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                if ((var23.b(false) ^ -1) != -1) {
                                  break L7;
                                } else {
                                  if (var20 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var24 = new bb(var23);
                              var9_ref_jd = (jd) ((Object) var24.c(50));
                              L8: while (true) {
                                if (var9_ref_jd == null) {
                                  break L5;
                                } else {
                                  var10_ref_jd = (jd) ((Object) var24.b(50));
                                  var9_ref_jd.d(70);
                                  var9_ref_jd = var10_ref_jd;
                                  if (var20 != 0) {
                                    break L4;
                                  } else {
                                    if (var20 == 0) {
                                      continue L8;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            var6++;
                            break L4;
                          }
                          if (var20 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (param0 < -69) {
                      break L2;
                    } else {
                      discarded$4 = this.a(83, -46, -45, (byte) -10);
                      break L2;
                    }
                  }
                  var6 = 0;
                  L9: while (true) {
                    L10: {
                      L11: {
                        if ((var6 ^ -1) <= (this.field_Eb.length ^ -1)) {
                          break L11;
                        } else {
                          var21 = this.field_Eb[var6];
                          var25 = var21;
                          if (var20 != 0) {
                            break L10;
                          } else {
                            L12: {
                              if (var25 == null) {
                                break L12;
                              } else {
                                L13: {
                                  var22 = var25.field_c;
                                  var26 = var22;
                                  if (var26 == null) {
                                    break L13;
                                  } else {
                                    var9 = var26.field_O;
                                    var10 = var26.field_J;
                                    var11 = var26.field_w;
                                    var12 = var26.field_N;
                                    var21.field_c = null;
                                    var30 = bw.field_m[var12];
                                    if ((var9 ^ -1) > -1) {
                                      break L12;
                                    } else {
                                      if (this.field_W <= var9) {
                                        break L12;
                                      } else {
                                        L14: {
                                          if (0 != var12) {
                                            stackOut_33_0 = var30[4];
                                            stackIn_34_0 = stackOut_33_0;
                                            break L14;
                                          } else {
                                            stackOut_32_0 = 10;
                                            stackIn_34_0 = stackOut_32_0;
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          var14 = stackIn_34_0;
                                          if (0 != var12) {
                                            stackOut_36_0 = var30[4];
                                            stackIn_37_0 = stackOut_36_0;
                                            break L15;
                                          } else {
                                            stackOut_35_0 = 10;
                                            stackIn_37_0 = stackOut_35_0;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          var15 = stackIn_37_0;
                                          if (-1 != (16 & var26.field_V ^ -1)) {
                                            var15 = var26.field_Y;
                                            if (var14 < var15) {
                                              var14 = var15;
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          } else {
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (75 != var12) {
                                            stackOut_44_0 = 0;
                                            stackIn_45_0 = stackOut_44_0;
                                            break L17;
                                          } else {
                                            stackOut_43_0 = 1;
                                            stackIn_45_0 = stackOut_43_0;
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          var16 = stackIn_45_0;
                                          if (var16 != 0) {
                                            var12 = 34;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          if (var12 != 4) {
                                            break L19;
                                          } else {
                                            if ((this.field_hb ^ -1) != -3) {
                                              break L19;
                                            } else {
                                              var12 = 81;
                                              break L19;
                                            }
                                          }
                                        }
                                        L20: {
                                          stackOut_51_0 = null;
                                          stackOut_51_1 = null;
                                          stackOut_51_2 = var10;
                                          stackOut_51_3 = var11;
                                          stackOut_51_4 = var12;
                                          stackOut_51_5 = var9;
                                          stackOut_51_6 = var14;
                                          stackOut_51_7 = var15;
                                          stackIn_53_0 = stackOut_51_0;
                                          stackIn_53_1 = stackOut_51_1;
                                          stackIn_53_2 = stackOut_51_2;
                                          stackIn_53_3 = stackOut_51_3;
                                          stackIn_53_4 = stackOut_51_4;
                                          stackIn_53_5 = stackOut_51_5;
                                          stackIn_53_6 = stackOut_51_6;
                                          stackIn_53_7 = stackOut_51_7;
                                          stackIn_52_0 = stackOut_51_0;
                                          stackIn_52_1 = stackOut_51_1;
                                          stackIn_52_2 = stackOut_51_2;
                                          stackIn_52_3 = stackOut_51_3;
                                          stackIn_52_4 = stackOut_51_4;
                                          stackIn_52_5 = stackOut_51_5;
                                          stackIn_52_6 = stackOut_51_6;
                                          stackIn_52_7 = stackOut_51_7;
                                          if (var12 != 0) {
                                            stackOut_53_0 = null;
                                            stackOut_53_1 = null;
                                            stackOut_53_2 = stackIn_53_2;
                                            stackOut_53_3 = stackIn_53_3;
                                            stackOut_53_4 = stackIn_53_4;
                                            stackOut_53_5 = stackIn_53_5;
                                            stackOut_53_6 = stackIn_53_6;
                                            stackOut_53_7 = stackIn_53_7;
                                            stackOut_53_8 = 0;
                                            stackIn_54_0 = stackOut_53_0;
                                            stackIn_54_1 = stackOut_53_1;
                                            stackIn_54_2 = stackOut_53_2;
                                            stackIn_54_3 = stackOut_53_3;
                                            stackIn_54_4 = stackOut_53_4;
                                            stackIn_54_5 = stackOut_53_5;
                                            stackIn_54_6 = stackOut_53_6;
                                            stackIn_54_7 = stackOut_53_7;
                                            stackIn_54_8 = stackOut_53_8;
                                            break L20;
                                          } else {
                                            stackOut_52_0 = null;
                                            stackOut_52_1 = null;
                                            stackOut_52_2 = stackIn_52_2;
                                            stackOut_52_3 = stackIn_52_3;
                                            stackOut_52_4 = stackIn_52_4;
                                            stackOut_52_5 = stackIn_52_5;
                                            stackOut_52_6 = stackIn_52_6;
                                            stackOut_52_7 = stackIn_52_7;
                                            stackOut_52_8 = 8;
                                            stackIn_54_0 = stackOut_52_0;
                                            stackIn_54_1 = stackOut_52_1;
                                            stackIn_54_2 = stackOut_52_2;
                                            stackIn_54_3 = stackOut_52_3;
                                            stackIn_54_4 = stackOut_52_4;
                                            stackIn_54_5 = stackOut_52_5;
                                            stackIn_54_6 = stackOut_52_6;
                                            stackIn_54_7 = stackOut_52_7;
                                            stackIn_54_8 = stackOut_52_8;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          var17 = new jd(stackIn_54_2, stackIn_54_3, stackIn_54_4, stackIn_54_5, stackIn_54_6, stackIn_54_7, stackIn_54_8 | 1, 0, 0, (ha) (this), 0, 0, -1, false, 0);
                                          if (var17.p(-43)) {
                                            this.a(var11, var10, 0, 3);
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          if (var16 == 0) {
                                            break L22;
                                          } else {
                                            var17.z(10);
                                            var17.field_W = true;
                                            break L22;
                                          }
                                        }
                                        L23: {
                                          var17.field_H = var26.field_H;
                                          var17.field_V = var26.field_V;
                                          var17.field_E = var26.field_E;
                                          if (var26.field_K != null) {
                                            var17.field_K = var26.field_K;
                                            break L23;
                                          } else {
                                            break L23;
                                          }
                                        }
                                        L24: {
                                          if (!var26.c(false)) {
                                            break L24;
                                          } else {
                                            if (this.field_K == null) {
                                              break L24;
                                            } else {
                                              this.field_V = false;
                                              break L24;
                                            }
                                          }
                                        }
                                        L25: {
                                          if (-1 < (var26.field_q ^ -1)) {
                                            break L25;
                                          } else {
                                            if ((uc.field_d[var22.field_q][4] ^ -1) == -6) {
                                              throw new IllegalStateException("");
                                            } else {
                                              var18 = new vh(4);
                                              var18.b(true, var26.field_q);
                                              var18.b(1, var26.field_J);
                                              var18.b(1, var26.field_w);
                                              var18.field_q = 0;
                                              var19 = bo.a(var26.field_O, var18, 4368051);
                                              if (var19 == null) {
                                                break L25;
                                              } else {
                                                var19.a(var26.field_O, (ha) (this), 26123);
                                                break L25;
                                              }
                                            }
                                          }
                                        }
                                        var21.field_c = var17;
                                        this.field_t[var9].a((byte) -119, (tc) (var17));
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                if ((var25.field_a ^ -1) < 0) {
                                  L26: {
                                    L27: {
                                      L28: {
                                        L29: {
                                          L30: {
                                            L31: {
                                              var10 = var25.field_h;
                                              if (var10 != 11) {
                                                break L31;
                                              } else {
                                                if (var20 == 0) {
                                                  break L30;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                            }
                                            if (7 == var10) {
                                              break L29;
                                            } else {
                                              L32: {
                                                if ((var10 ^ -1) != -15) {
                                                  break L32;
                                                } else {
                                                  if (var20 == 0) {
                                                    break L28;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                              L33: {
                                                if (-10 != (var10 ^ -1)) {
                                                  break L33;
                                                } else {
                                                  if (var20 == 0) {
                                                    break L28;
                                                  } else {
                                                    break L33;
                                                  }
                                                }
                                              }
                                              if (var10 != 8) {
                                                break L26;
                                              } else {
                                                if (var20 == 0) {
                                                  break L27;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                            }
                                          }
                                          L34: {
                                            L35: {
                                              if (this.field_K == null) {
                                                break L35;
                                              } else {
                                                if ((this.field_K.field_w ^ -1) == (var25.field_a ^ -1)) {
                                                  break L35;
                                                } else {
                                                  stackOut_89_0 = 1;
                                                  stackIn_91_0 = stackOut_89_0;
                                                  break L34;
                                                }
                                              }
                                            }
                                            stackOut_90_0 = 0;
                                            stackIn_91_0 = stackOut_90_0;
                                            break L34;
                                          }
                                          var9 = stackIn_91_0;
                                          if (var9 != 0) {
                                            var21.field_j = this.field_E[var21.field_a][var21.field_g];
                                            break L29;
                                          } else {
                                            break L29;
                                          }
                                        }
                                        dupTemp$5 = this.field_z[this.o(var21.field_a, -1)];
                                        dupTemp$5[0] = dupTemp$5[0] + 1;
                                        if (var20 == 0) {
                                          break L12;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      dupTemp$6 = this.field_z[this.o(var21.field_a, -1)];
                                      dupTemp$6[1] = dupTemp$6[1] + 1;
                                      if (var20 == 0) {
                                        break L12;
                                      } else {
                                        break L27;
                                      }
                                    }
                                    dupTemp$7 = this.field_z[this.o(var21.field_a, -1)];
                                    dupTemp$7[2] = dupTemp$7[2] + 1;
                                    if (var20 == 0) {
                                      break L12;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  if (var25.e((byte) -122)) {
                                    break L12;
                                  } else {
                                    var25.field_a = -1;
                                    break L12;
                                  }
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var6++;
                            if (var20 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      this.k(-29673);
                      this.f(-2);
                      break L10;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var5 = decompiledCaughtException;
            stackOut_104_0 = (RuntimeException) (var5);
            stackOut_104_1 = new StringBuilder().append("ha.OB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_106_0 = stackOut_104_0;
            stackIn_106_1 = stackOut_104_1;
            stackIn_105_0 = stackOut_104_0;
            stackIn_105_1 = stackOut_104_1;
            if (param3 == null) {
              stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L36;
            } else {
              stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackOut_105_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackOut_105_2 = "{...}";
              stackIn_107_0 = stackOut_105_0;
              stackIn_107_1 = stackOut_105_1;
              stackIn_107_2 = stackOut_105_2;
              break L36;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_107_0), stackIn_107_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, ne param1, byte param2, int param3, gn param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (this.a(param0, param1, param2 ^ -88)) {
              L1: {
                if (param1.field_b) {
                  break L1;
                } else {
                  if (param1.c(param2 + -35)) {
                    break L1;
                  } else {
                    if (param1.c((byte) -79)) {
                      break L1;
                    } else {
                      if (-1 == param1.field_a) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L2: {
                param4.a(new String[]{"cell at ", ci.c(param5, 0, param3), ": "}, (byte) -95);
                param4.a(0, 2);
                if (param1.field_b) {
                  param4.a(new String[]{"changed type: ", Integer.toString(param1.field_h)}, (byte) -106);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (!param1.c(125)) {
                  break L3;
                } else {
                  param4.a((byte) 19, "bones");
                  break L3;
                }
              }
              L4: {
                if (!param1.c((byte) -79)) {
                  break L4;
                } else {
                  param4.a(new String[]{"fort: owner: ", this.e(param1.b((byte) -54), -1)}, (byte) -57);
                  break L4;
                }
              }
              L5: {
                if (0 == (param1.field_a ^ -1)) {
                  break L5;
                } else {
                  param4.a(new String[]{"owner: ", this.e(param1.field_a, param2 ^ 39)}, (byte) -93);
                  break L5;
                }
              }
              L6: {
                param4.a(0, -2);
                if (param2 == -40) {
                  break L6;
                } else {
                  this.a((byte) -3, (vh) null);
                  break L6;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var7);
            stackOut_20_1 = new StringBuilder().append("ha.FC(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == -2) {
            break L0;
          } else {
            this.field_d = (int[]) null;
            break L0;
          }
        }
        this.field_s[1] = 0;
        this.field_s[2] = 0;
        this.field_s[0] = 0;
        if (null != this.field_Eb) {
          var2 = 0;
          L1: while (true) {
            L2: {
              if (var2 >= this.field_Eb.length) {
                break L2;
              } else {
                var3 = this.field_Eb[var2].field_h;
                if (var4 != 0) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      L5: {
                        if (var3 == 7) {
                          this.field_s[0] = this.field_s[0] + 1;
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        } else {
                          L6: {
                            if (14 != var3) {
                              break L6;
                            } else {
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if ((var3 ^ -1) != -10) {
                              break L7;
                            } else {
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if ((var3 ^ -1) == -9) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_s[1] = this.field_s[1] + 1;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    this.field_s[2] = this.field_s[2] + 1;
                    break L3;
                  }
                  var2++;
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        L0: {
          var12 = this.a(param0, (byte) 37, param3, param4);
          var11 = var12;
          var10 = var11;
          var6 = var10;
          var7 = bw.field_m[param2][1];
          var8 = b.a(false, param2);
          if ((param2 ^ -1) == -75) {
            break L0;
          } else {
            if ((param2 ^ -1) > -9) {
              break L0;
            } else {
              if (0 != (this.field_a[param4][1 + var7] & 1 << var8)) {
                break L0;
              } else {
                return false;
              }
            }
          }
        }
        L1: {
          if (this.f(bw.field_m[param2][8], this.field_H[param4], 0)) {
            L2: {
              L3: {
                var10 = var6;
                if (-1 != bw.field_m[param2][1]) {
                  break L3;
                } else {
                  var9 = var12[6];
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var10 = var6;
              var9 = var10[bw.field_m[param2][1]];
              break L2;
            }
            if (this.a(var9, true, bw.field_m[param2][2])) {
              return true;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        if (param1 == -26813) {
          return false;
        } else {
          this.field_xb = 58;
          return false;
        }
    }

    private final int b(byte param0, int param1) {
        if (param0 != 31) {
            return -126;
        }
        return this.field_z[param1][0] * 10 - (-(5 * this.field_z[param1][1]) + -(2 * this.field_z[param1][2]));
    }

    private final boolean a(int param0, ne param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4_int = 94 % ((-56 - param2) / 50);
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("ha.TB(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final int a(jd param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param2 == 14336) {
              stackOut_3_0 = pj.a(this.field_v, this.field_Eb, param3, param4, param6, this.field_db, this.o(param6, -1), param0, param5, param1, true);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 112;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("ha.HC(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, vh param1, byte param2) {
        try {
            if (param2 > -71) {
                this.field_W = 26;
            }
            if (!(this.field_Z != null)) {
                param0 -= 2;
                this.field_Z = new vh(param1.e((byte) -104));
            }
            param1.a(0, param0, this.field_Z.field_q, this.field_Z.field_o);
            this.field_Z.field_q = this.field_Z.field_q + param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.AC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        int var5 = -1;
        if (!(param3 < 0)) {
            var5 = this.o(param3, param0 ^ -32);
        }
        if (param0 != 31) {
            discarded$0 = this.c(-23, -102);
        }
        return this.field_Eb[param2 + this.field_v * param1].a((byte) 97, param3, var5);
    }

    private final void a(vh param0, boolean param1) {
        int discarded$5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            discarded$5 = param0.k(0);
            if (!param1) {
                this.f(-120);
            }
            var3_int = param0.k(0);
            var4 = param0.k(0);
            var5 = param0.k(0);
            var6 = param0.k(0);
            var7 = 31 & var4;
            var7 = (16 ^ var7) - 16;
            this.field_l.a((byte) -119, (tc) (new mb(var3_int, var5, var6, var7, var4 >> 605517893)));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ha.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int b(int param0, jd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
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
            L1: {
              var3_int = param1.field_O;
              if (!param1.field_I) {
                break L1;
              } else {
                var3_int = var3_int ^ 5637;
                break L1;
              }
            }
            L2: {
              if (!param1.field_W) {
                break L2;
              } else {
                var3_int = var3_int ^ 757314;
                break L2;
              }
            }
            L3: {
              var3_int = var3_int ^ 12643 * param1.field_B;
              if (!param1.field_s) {
                break L3;
              } else {
                var3_int = var3_int ^ 76756163;
                break L3;
              }
            }
            L4: {
              if (param1.field_D) {
                var3_int = var3_int ^ 847523;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var3_int = var3_int ^ 38 * param1.field_J;
              var3_int = var3_int ^ param1.field_w * 391;
              var3_int = var3_int ^ param1.field_A * 874;
              var3_int = var3_int ^ 23874 * param1.field_N;
              var3_int = var3_int ^ param1.field_Y * 584668;
              var3_int = var3_int ^ 445235 * param1.field_t;
              if (param0 < -6) {
                break L5;
              } else {
                this.field_rb = (int[]) null;
                break L5;
              }
            }
            stackOut_11_0 = var3_int;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ha.TC(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final void e(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (param0 != 14) {
            discarded$0 = this.a(-18, (ne) null, 8);
        }
        jd var5 = this.c(param3, true, param1);
        if (var5 != null) {
            if (this.c(var5.field_O, -16985, param2)) {
                var5.field_I = false;
            }
        }
    }

    final int a(byte param0, int param1, int param2) {
        if (param0 != 11) {
            this.a((byte) 47, 3, 37, -46);
        }
        return 0;
    }

    final void d(int param0, int param1, int param2, int param3) {
        if (!(this.field_b)) {
            return;
        }
        if (param2 < 68) {
            return;
        }
        if (this.field_d[param3] < param1) {
            this.field_d[param3] = param1;
            this.field_N[param3] = param0;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        at discarded$3 = null;
        int var5 = 0;
        jd var6 = null;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (this.field_gb <= -1) {
              break L1;
            } else {
              var6 = (jd) ((Object) this.field_t[this.field_gb].e((byte) 91));
              L2: while (true) {
                L3: {
                  L4: {
                    if (var6 == null) {
                      break L4;
                    } else {
                      var6.m((byte) -36);
                      var6 = (jd) ((Object) this.field_t[this.field_gb].a((byte) 123));
                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  this.field_mb[this.field_gb] = this.field_mb[this.field_gb] + 1;
                  this.field_gb = param1;
                  this.field_Gb = param2;
                  discarded$3 = this.a(false, false, 0);
                  this.a(1);
                  break L3;
                }
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_gb = param1;
          this.field_Gb = param2;
          break L0;
        }
        this.a(param1, (byte) 111);
        if (param0) {
          return;
        } else {
          this.field_n = (int[]) null;
          return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, int param8, int param9) {
        jd var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        jd var20 = null;
        jd var21 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_84_0 = 0;
        at stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        nw stackIn_110_2 = null;
        nw stackIn_110_3 = null;
        jd stackIn_110_4 = null;
        int stackIn_110_5 = 0;
        at stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        nw stackIn_111_2 = null;
        nw stackIn_111_3 = null;
        jd stackIn_111_4 = null;
        int stackIn_111_5 = 0;
        at stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        nw stackIn_112_2 = null;
        nw stackIn_112_3 = null;
        jd stackIn_112_4 = null;
        int stackIn_112_5 = 0;
        at stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        nw stackIn_113_2 = null;
        nw stackIn_113_3 = null;
        jd stackIn_113_4 = null;
        int stackIn_113_5 = 0;
        at stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        nw stackIn_114_2 = null;
        nw stackIn_114_3 = null;
        jd stackIn_114_4 = null;
        int stackIn_114_5 = 0;
        at stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        nw stackIn_115_2 = null;
        nw stackIn_115_3 = null;
        jd stackIn_115_4 = null;
        int stackIn_115_5 = 0;
        int stackIn_115_6 = 0;
        at stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        nw stackIn_117_2 = null;
        nw stackIn_117_3 = null;
        jd stackIn_117_4 = null;
        int stackIn_117_5 = 0;
        at stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        nw stackIn_118_2 = null;
        nw stackIn_118_3 = null;
        jd stackIn_118_4 = null;
        int stackIn_118_5 = 0;
        at stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        nw stackIn_119_2 = null;
        nw stackIn_119_3 = null;
        jd stackIn_119_4 = null;
        int stackIn_119_5 = 0;
        at stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        nw stackIn_120_2 = null;
        nw stackIn_120_3 = null;
        jd stackIn_120_4 = null;
        int stackIn_120_5 = 0;
        at stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        nw stackIn_121_2 = null;
        nw stackIn_121_3 = null;
        jd stackIn_121_4 = null;
        int stackIn_121_5 = 0;
        at stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        nw stackIn_122_2 = null;
        nw stackIn_122_3 = null;
        jd stackIn_122_4 = null;
        int stackIn_122_5 = 0;
        int stackIn_122_6 = 0;
        int stackIn_130_0 = 0;
        int stackIn_136_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_83_0 = 0;
        at stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        nw stackOut_109_2 = null;
        nw stackOut_109_3 = null;
        jd stackOut_109_4 = null;
        int stackOut_109_5 = 0;
        at stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        nw stackOut_110_2 = null;
        nw stackOut_110_3 = null;
        jd stackOut_110_4 = null;
        int stackOut_110_5 = 0;
        at stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        nw stackOut_111_2 = null;
        nw stackOut_111_3 = null;
        jd stackOut_111_4 = null;
        int stackOut_111_5 = 0;
        at stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        nw stackOut_112_2 = null;
        nw stackOut_112_3 = null;
        jd stackOut_112_4 = null;
        int stackOut_112_5 = 0;
        at stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        nw stackOut_113_2 = null;
        nw stackOut_113_3 = null;
        jd stackOut_113_4 = null;
        int stackOut_113_5 = 0;
        int stackOut_113_6 = 0;
        at stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        nw stackOut_114_2 = null;
        nw stackOut_114_3 = null;
        jd stackOut_114_4 = null;
        int stackOut_114_5 = 0;
        int stackOut_114_6 = 0;
        at stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        nw stackOut_116_2 = null;
        nw stackOut_116_3 = null;
        jd stackOut_116_4 = null;
        int stackOut_116_5 = 0;
        at stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        nw stackOut_117_2 = null;
        nw stackOut_117_3 = null;
        jd stackOut_117_4 = null;
        int stackOut_117_5 = 0;
        at stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        nw stackOut_118_2 = null;
        nw stackOut_118_3 = null;
        jd stackOut_118_4 = null;
        int stackOut_118_5 = 0;
        at stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        nw stackOut_119_2 = null;
        nw stackOut_119_3 = null;
        jd stackOut_119_4 = null;
        int stackOut_119_5 = 0;
        at stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        nw stackOut_120_2 = null;
        nw stackOut_120_3 = null;
        jd stackOut_120_4 = null;
        int stackOut_120_5 = 0;
        int stackOut_120_6 = 0;
        at stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        nw stackOut_121_2 = null;
        nw stackOut_121_3 = null;
        jd stackOut_121_4 = null;
        int stackOut_121_5 = 0;
        int stackOut_121_6 = 0;
        int stackOut_128_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_135_0 = 0;
        L0: {
          var19 = ArmiesOfGielinor.field_M ? 1 : 0;
          var20 = this.c(param0, true, param3);
          var21 = var20;
          var12 = this.c(param0 + param4, true, param1 + param3);
          var13 = Math.abs(param1) + Math.abs(param4);
          if (var12 == null) {
            break L0;
          } else {
            if (var21 != null) {
              L1: {
                var14 = 0;
                var15 = 0;
                if (var13 != 1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var16 = stackIn_7_0;
                  if (var16 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (-5 != (var21.g(0) ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          L6: {
                            if ((var21.j(20640) ^ -1) != -5) {
                              break L6;
                            } else {
                              if (-2 != (var21.d(2, 122) & 1 ^ -1)) {
                                break L6;
                              } else {
                                stackOut_11_0 = 1;
                                stackIn_13_0 = stackOut_11_0;
                                break L5;
                              }
                            }
                          }
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L5;
                        }
                        var14 = stackIn_13_0;
                        if (var19 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var21.g(0) != 3) {
                        break L7;
                      } else {
                        L8: {
                          L9: {
                            if (2 != var21.j(20640)) {
                              break L9;
                            } else {
                              if ((var21.d(2, -90) & 1 ^ -1) != -2) {
                                break L9;
                              } else {
                                stackOut_17_0 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                break L8;
                              }
                            }
                          }
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L8;
                        }
                        var14 = stackIn_19_0;
                        if (var19 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L10: {
                      if (-35 != (var21.field_N ^ -1)) {
                        break L10;
                      } else {
                        if (!var21.field_W) {
                          break L10;
                        } else {
                          L11: {
                            L12: {
                              if (-4 != (var21.j(20640) ^ -1)) {
                                break L12;
                              } else {
                                if (-2 != (1 & var21.d(2, -97) ^ -1)) {
                                  break L12;
                                } else {
                                  stackOut_24_0 = 1;
                                  stackIn_26_0 = stackOut_24_0;
                                  break L11;
                                }
                              }
                            }
                            stackOut_25_0 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            break L11;
                          }
                          var14 = stackIn_26_0;
                          if (var19 == 0) {
                            break L2;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if (var21.j(20640) != 0) {
                          break L14;
                        } else {
                          if (-2 != (1 & var21.d(2, 121) ^ -1)) {
                            break L14;
                          } else {
                            stackOut_29_0 = 1;
                            stackIn_31_0 = stackOut_29_0;
                            break L13;
                          }
                        }
                      }
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      break L13;
                    }
                    var14 = stackIn_31_0;
                    if (var19 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L15: {
                  if (34 != var21.field_N) {
                    break L15;
                  } else {
                    if (!var21.field_W) {
                      break L15;
                    } else {
                      L16: {
                        L17: {
                          if (var21.j(20640) != 3) {
                            break L17;
                          } else {
                            if (1 != (1 & var21.d(2, 99))) {
                              break L17;
                            } else {
                              stackOut_36_0 = 1;
                              stackIn_38_0 = stackOut_36_0;
                              break L16;
                            }
                          }
                        }
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        break L16;
                      }
                      var14 = stackIn_38_0;
                      if (var19 == 0) {
                        break L2;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
                L18: {
                  L19: {
                    if (var21.field_N == 81) {
                      break L19;
                    } else {
                      if (-5 == (var21.field_N ^ -1)) {
                        break L19;
                      } else {
                        if (74 != var21.field_N) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  L20: {
                    L21: {
                      if (3 != var21.j(20640)) {
                        break L21;
                      } else {
                        if (1 != (var21.d(2, -112) & 1)) {
                          break L21;
                        } else {
                          stackOut_45_0 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          break L20;
                        }
                      }
                    }
                    stackOut_46_0 = 0;
                    stackIn_47_0 = stackOut_46_0;
                    break L20;
                  }
                  var14 = stackIn_47_0;
                  if (var19 == 0) {
                    break L2;
                  } else {
                    break L18;
                  }
                }
                L22: {
                  if (3 != var21.g(0)) {
                    break L22;
                  } else {
                    L23: {
                      L24: {
                        if (var21.j(20640) != 2) {
                          break L24;
                        } else {
                          if ((var21.d(2, -123) & 1) != 1) {
                            break L24;
                          } else {
                            stackOut_51_0 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            break L23;
                          }
                        }
                      }
                      stackOut_52_0 = 0;
                      stackIn_53_0 = stackOut_52_0;
                      break L23;
                    }
                    var14 = stackIn_53_0;
                    if (var19 == 0) {
                      break L2;
                    } else {
                      break L22;
                    }
                  }
                }
                L25: {
                  L26: {
                    if (1 != var21.j(20640)) {
                      break L26;
                    } else {
                      if ((1 & var21.d(2, 116)) != 1) {
                        break L26;
                      } else {
                        stackOut_56_0 = 1;
                        stackIn_58_0 = stackOut_56_0;
                        break L25;
                      }
                    }
                  }
                  stackOut_57_0 = 0;
                  stackIn_58_0 = stackOut_57_0;
                  break L25;
                }
                var14 = stackIn_58_0;
                break L2;
              }
              L27: {
                var17 = -37 / ((35 - param5) / 34);
                if (var16 == 0) {
                  break L27;
                } else {
                  L28: {
                    if (4 != var12.g(0)) {
                      break L28;
                    } else {
                      L29: {
                        L30: {
                          if (4 != var12.j(20640)) {
                            break L30;
                          } else {
                            if (1 != (var12.d(2, -117) & 1)) {
                              break L30;
                            } else {
                              stackOut_63_0 = 1;
                              stackIn_65_0 = stackOut_63_0;
                              break L29;
                            }
                          }
                        }
                        stackOut_64_0 = 0;
                        stackIn_65_0 = stackOut_64_0;
                        break L29;
                      }
                      var15 = stackIn_65_0;
                      if (var19 == 0) {
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L31: {
                    if (-4 == (var12.g(0) ^ -1)) {
                      break L31;
                    } else {
                      L32: {
                        L33: {
                          if ((var12.field_N ^ -1) != -35) {
                            break L33;
                          } else {
                            if (var12.field_W) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                        L34: {
                          L35: {
                            if (-1 != (var12.j(20640) ^ -1)) {
                              break L35;
                            } else {
                              if ((1 & var12.d(2, -94)) != 1) {
                                break L35;
                              } else {
                                stackOut_72_0 = 1;
                                stackIn_74_0 = stackOut_72_0;
                                break L34;
                              }
                            }
                          }
                          stackOut_73_0 = 0;
                          stackIn_74_0 = stackOut_73_0;
                          break L34;
                        }
                        var15 = stackIn_74_0;
                        if (var19 == 0) {
                          break L27;
                        } else {
                          break L32;
                        }
                      }
                      L36: {
                        L37: {
                          if (var12.j(20640) != 3) {
                            break L37;
                          } else {
                            if (1 != (var12.d(2, -114) & 1)) {
                              break L37;
                            } else {
                              stackOut_77_0 = 1;
                              stackIn_79_0 = stackOut_77_0;
                              break L36;
                            }
                          }
                        }
                        stackOut_78_0 = 0;
                        stackIn_79_0 = stackOut_78_0;
                        break L36;
                      }
                      var15 = stackIn_79_0;
                      if (var19 == 0) {
                        break L27;
                      } else {
                        break L31;
                      }
                    }
                  }
                  L38: {
                    L39: {
                      if ((var12.j(20640) ^ -1) != -3) {
                        break L39;
                      } else {
                        if (1 != (1 & var12.d(2, 117))) {
                          break L39;
                        } else {
                          stackOut_82_0 = 1;
                          stackIn_84_0 = stackOut_82_0;
                          break L38;
                        }
                      }
                    }
                    stackOut_83_0 = 0;
                    stackIn_84_0 = stackOut_83_0;
                    break L38;
                  }
                  var15 = stackIn_84_0;
                  break L27;
                }
              }
              L40: {
                if (!param2) {
                  break L40;
                } else {
                  if (var12.field_t >= 99) {
                    break L40;
                  } else {
                    if (!var21.r(-40)) {
                      break L40;
                    } else {
                      this.field_l.a(750, new st(var12, 4));
                      break L40;
                    }
                  }
                }
              }
              L41: {
                if (!param6) {
                  break L41;
                } else {
                  if (-100 >= (var21.field_t ^ -1)) {
                    break L41;
                  } else {
                    if (var12.r(-40)) {
                      this.field_l.a(750, new st(var21, 4));
                      break L41;
                    } else {
                      break L41;
                    }
                  }
                }
              }
              L42: {
                L43: {
                  L44: {
                    if (var16 == 0) {
                      break L44;
                    } else {
                      if (var12.field_C) {
                        var18 = 0;
                        L45: while (true) {
                          if (var18 >= param8) {
                            break L44;
                          } else {
                            this.field_l.a(750, new st(var12, 1));
                            var18++;
                            if (var19 != 0) {
                              break L43;
                            } else {
                              if (var19 == 0) {
                                continue L45;
                              } else {
                                break L44;
                              }
                            }
                          }
                        }
                      } else {
                        break L44;
                      }
                    }
                  }
                  if (var16 == 0) {
                    break L43;
                  } else {
                    if (!var21.field_C) {
                      break L43;
                    } else {
                      var18 = 0;
                      L46: while (true) {
                        if (var18 >= param7) {
                          break L43;
                        } else {
                          this.field_l.a(750, new st(var21, 1));
                          var18++;
                          if (var19 != 0) {
                            break L42;
                          } else {
                            if (var19 == 0) {
                              continue L46;
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L47: {
                  L48: {
                    L49: {
                      stackOut_109_0 = this.field_l;
                      stackOut_109_1 = 750;
                      stackOut_109_2 = null;
                      stackOut_109_3 = null;
                      stackOut_109_4 = (jd) (var21);
                      stackOut_109_5 = param8;
                      stackIn_112_0 = stackOut_109_0;
                      stackIn_112_1 = stackOut_109_1;
                      stackIn_112_2 = stackOut_109_2;
                      stackIn_112_3 = stackOut_109_3;
                      stackIn_112_4 = stackOut_109_4;
                      stackIn_112_5 = stackOut_109_5;
                      stackIn_110_0 = stackOut_109_0;
                      stackIn_110_1 = stackOut_109_1;
                      stackIn_110_2 = stackOut_109_2;
                      stackIn_110_3 = stackOut_109_3;
                      stackIn_110_4 = stackOut_109_4;
                      stackIn_110_5 = stackOut_109_5;
                      if (var12.y(-113)) {
                        break L49;
                      } else {
                        stackOut_110_0 = (at) ((Object) stackIn_110_0);
                        stackOut_110_1 = stackIn_110_1;
                        stackOut_110_2 = null;
                        stackOut_110_3 = null;
                        stackOut_110_4 = (jd) ((Object) stackIn_110_4);
                        stackOut_110_5 = stackIn_110_5;
                        stackIn_114_0 = stackOut_110_0;
                        stackIn_114_1 = stackOut_110_1;
                        stackIn_114_2 = stackOut_110_2;
                        stackIn_114_3 = stackOut_110_3;
                        stackIn_114_4 = stackOut_110_4;
                        stackIn_114_5 = stackOut_110_5;
                        stackIn_111_0 = stackOut_110_0;
                        stackIn_111_1 = stackOut_110_1;
                        stackIn_111_2 = stackOut_110_2;
                        stackIn_111_3 = stackOut_110_3;
                        stackIn_111_4 = stackOut_110_4;
                        stackIn_111_5 = stackOut_110_5;
                        if (var15 == 0) {
                          break L48;
                        } else {
                          stackOut_111_0 = (at) ((Object) stackIn_111_0);
                          stackOut_111_1 = stackIn_111_1;
                          stackOut_111_2 = null;
                          stackOut_111_3 = null;
                          stackOut_111_4 = (jd) ((Object) stackIn_111_4);
                          stackOut_111_5 = stackIn_111_5;
                          stackIn_112_0 = stackOut_111_0;
                          stackIn_112_1 = stackOut_111_1;
                          stackIn_112_2 = stackOut_111_2;
                          stackIn_112_3 = stackOut_111_3;
                          stackIn_112_4 = stackOut_111_4;
                          stackIn_112_5 = stackOut_111_5;
                          break L49;
                        }
                      }
                    }
                    stackOut_112_0 = (at) ((Object) stackIn_112_0);
                    stackOut_112_1 = stackIn_112_1;
                    stackOut_112_2 = null;
                    stackOut_112_3 = null;
                    stackOut_112_4 = (jd) ((Object) stackIn_112_4);
                    stackOut_112_5 = stackIn_112_5;
                    stackIn_114_0 = stackOut_112_0;
                    stackIn_114_1 = stackOut_112_1;
                    stackIn_114_2 = stackOut_112_2;
                    stackIn_114_3 = stackOut_112_3;
                    stackIn_114_4 = stackOut_112_4;
                    stackIn_114_5 = stackOut_112_5;
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    stackIn_113_2 = stackOut_112_2;
                    stackIn_113_3 = stackOut_112_3;
                    stackIn_113_4 = stackOut_112_4;
                    stackIn_113_5 = stackOut_112_5;
                    if ((param8 ^ -1) >= -1) {
                      break L48;
                    } else {
                      stackOut_113_0 = (at) ((Object) stackIn_113_0);
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = null;
                      stackOut_113_3 = null;
                      stackOut_113_4 = (jd) ((Object) stackIn_113_4);
                      stackOut_113_5 = stackIn_113_5;
                      stackOut_113_6 = 1;
                      stackIn_115_0 = stackOut_113_0;
                      stackIn_115_1 = stackOut_113_1;
                      stackIn_115_2 = stackOut_113_2;
                      stackIn_115_3 = stackOut_113_3;
                      stackIn_115_4 = stackOut_113_4;
                      stackIn_115_5 = stackOut_113_5;
                      stackIn_115_6 = stackOut_113_6;
                      break L47;
                    }
                  }
                  stackOut_114_0 = (at) ((Object) stackIn_114_0);
                  stackOut_114_1 = stackIn_114_1;
                  stackOut_114_2 = null;
                  stackOut_114_3 = null;
                  stackOut_114_4 = (jd) ((Object) stackIn_114_4);
                  stackOut_114_5 = stackIn_114_5;
                  stackOut_114_6 = 0;
                  stackIn_115_0 = stackOut_114_0;
                  stackIn_115_1 = stackOut_114_1;
                  stackIn_115_2 = stackOut_114_2;
                  stackIn_115_3 = stackOut_114_3;
                  stackIn_115_4 = stackOut_114_4;
                  stackIn_115_5 = stackOut_114_5;
                  stackIn_115_6 = stackOut_114_6;
                  break L47;
                }
                ((at) (Object) stackIn_115_0).a(stackIn_115_1, new nw(stackIn_115_4, stackIn_115_5, stackIn_115_6 != 0));
                break L42;
              }
              L50: {
                L51: {
                  L52: {
                    stackOut_116_0 = this.field_l;
                    stackOut_116_1 = 750;
                    stackOut_116_2 = null;
                    stackOut_116_3 = null;
                    stackOut_116_4 = (jd) (var12);
                    stackOut_116_5 = param7;
                    stackIn_119_0 = stackOut_116_0;
                    stackIn_119_1 = stackOut_116_1;
                    stackIn_119_2 = stackOut_116_2;
                    stackIn_119_3 = stackOut_116_3;
                    stackIn_119_4 = stackOut_116_4;
                    stackIn_119_5 = stackOut_116_5;
                    stackIn_117_0 = stackOut_116_0;
                    stackIn_117_1 = stackOut_116_1;
                    stackIn_117_2 = stackOut_116_2;
                    stackIn_117_3 = stackOut_116_3;
                    stackIn_117_4 = stackOut_116_4;
                    stackIn_117_5 = stackOut_116_5;
                    if (var21.y(-119)) {
                      break L52;
                    } else {
                      stackOut_117_0 = (at) ((Object) stackIn_117_0);
                      stackOut_117_1 = stackIn_117_1;
                      stackOut_117_2 = null;
                      stackOut_117_3 = null;
                      stackOut_117_4 = (jd) ((Object) stackIn_117_4);
                      stackOut_117_5 = stackIn_117_5;
                      stackIn_121_0 = stackOut_117_0;
                      stackIn_121_1 = stackOut_117_1;
                      stackIn_121_2 = stackOut_117_2;
                      stackIn_121_3 = stackOut_117_3;
                      stackIn_121_4 = stackOut_117_4;
                      stackIn_121_5 = stackOut_117_5;
                      stackIn_118_0 = stackOut_117_0;
                      stackIn_118_1 = stackOut_117_1;
                      stackIn_118_2 = stackOut_117_2;
                      stackIn_118_3 = stackOut_117_3;
                      stackIn_118_4 = stackOut_117_4;
                      stackIn_118_5 = stackOut_117_5;
                      if (var14 == 0) {
                        break L51;
                      } else {
                        stackOut_118_0 = (at) ((Object) stackIn_118_0);
                        stackOut_118_1 = stackIn_118_1;
                        stackOut_118_2 = null;
                        stackOut_118_3 = null;
                        stackOut_118_4 = (jd) ((Object) stackIn_118_4);
                        stackOut_118_5 = stackIn_118_5;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        stackIn_119_2 = stackOut_118_2;
                        stackIn_119_3 = stackOut_118_3;
                        stackIn_119_4 = stackOut_118_4;
                        stackIn_119_5 = stackOut_118_5;
                        break L52;
                      }
                    }
                  }
                  stackOut_119_0 = (at) ((Object) stackIn_119_0);
                  stackOut_119_1 = stackIn_119_1;
                  stackOut_119_2 = null;
                  stackOut_119_3 = null;
                  stackOut_119_4 = (jd) ((Object) stackIn_119_4);
                  stackOut_119_5 = stackIn_119_5;
                  stackIn_121_0 = stackOut_119_0;
                  stackIn_121_1 = stackOut_119_1;
                  stackIn_121_2 = stackOut_119_2;
                  stackIn_121_3 = stackOut_119_3;
                  stackIn_121_4 = stackOut_119_4;
                  stackIn_121_5 = stackOut_119_5;
                  stackIn_120_0 = stackOut_119_0;
                  stackIn_120_1 = stackOut_119_1;
                  stackIn_120_2 = stackOut_119_2;
                  stackIn_120_3 = stackOut_119_3;
                  stackIn_120_4 = stackOut_119_4;
                  stackIn_120_5 = stackOut_119_5;
                  if ((param7 ^ -1) >= -1) {
                    break L51;
                  } else {
                    stackOut_120_0 = (at) ((Object) stackIn_120_0);
                    stackOut_120_1 = stackIn_120_1;
                    stackOut_120_2 = null;
                    stackOut_120_3 = null;
                    stackOut_120_4 = (jd) ((Object) stackIn_120_4);
                    stackOut_120_5 = stackIn_120_5;
                    stackOut_120_6 = 1;
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_122_1 = stackOut_120_1;
                    stackIn_122_2 = stackOut_120_2;
                    stackIn_122_3 = stackOut_120_3;
                    stackIn_122_4 = stackOut_120_4;
                    stackIn_122_5 = stackOut_120_5;
                    stackIn_122_6 = stackOut_120_6;
                    break L50;
                  }
                }
                stackOut_121_0 = (at) ((Object) stackIn_121_0);
                stackOut_121_1 = stackIn_121_1;
                stackOut_121_2 = null;
                stackOut_121_3 = null;
                stackOut_121_4 = (jd) ((Object) stackIn_121_4);
                stackOut_121_5 = stackIn_121_5;
                stackOut_121_6 = 0;
                stackIn_122_0 = stackOut_121_0;
                stackIn_122_1 = stackOut_121_1;
                stackIn_122_2 = stackOut_121_2;
                stackIn_122_3 = stackOut_121_3;
                stackIn_122_4 = stackOut_121_4;
                stackIn_122_5 = stackOut_121_5;
                stackIn_122_6 = stackOut_121_6;
                break L50;
              }
              L53: {
                ((at) (Object) stackIn_122_0).a(stackIn_122_1, new nw(stackIn_122_4, stackIn_122_5, stackIn_122_6 != 0));
                var21.field_B = var21.field_B - 1;
                if (this.field_b) {
                  L54: {
                    var12.field_M = var12.field_M + 1;
                    var21.field_m = var21.field_m + 1;
                    this.d(var21.field_O, var21.field_m, 112, 7);
                    this.d(var12.field_O, var12.field_M, 79, 6);
                    var18 = 0;
                    if (param2) {
                      L55: {
                        L56: {
                          this.field_g[var12.field_O] = this.field_g[var12.field_O] + 1;
                          this.d(var12.field_O, this.field_g[var12.field_O], 120, 4);
                          if (var21.field_E != 10) {
                            break L56;
                          } else {
                            if (11 != var12.field_E) {
                              break L56;
                            } else {
                              stackOut_128_0 = 1;
                              stackIn_130_0 = stackOut_128_0;
                              break L55;
                            }
                          }
                        }
                        stackOut_129_0 = 0;
                        stackIn_130_0 = stackOut_129_0;
                        break L55;
                      }
                      var18 = stackIn_130_0;
                      break L54;
                    } else {
                      break L54;
                    }
                  }
                  L57: {
                    if (!param6) {
                      break L57;
                    } else {
                      L58: {
                        L59: {
                          this.field_g[var20.field_O] = this.field_g[var20.field_O] + 1;
                          this.d(var21.field_O, this.field_g[var20.field_O], 91, 4);
                          if ((var12.field_E ^ -1) != -11) {
                            break L59;
                          } else {
                            if ((var21.field_E ^ -1) != -12) {
                              break L59;
                            } else {
                              stackOut_134_0 = 1;
                              stackIn_136_0 = stackOut_134_0;
                              break L58;
                            }
                          }
                        }
                        stackOut_135_0 = 0;
                        stackIn_136_0 = stackOut_135_0;
                        break L58;
                      }
                      var18 = stackIn_136_0;
                      break L57;
                    }
                  }
                  if (var18 == 0) {
                    break L53;
                  } else {
                    L60: {
                      if (this.field_K == null) {
                        break L60;
                      } else {
                        if (-3 != (this.field_K.field_G.field_r ^ -1)) {
                          break L60;
                        } else {
                          if ((this.field_K.field_v ^ -1) == -6) {
                            rd.field_j.a(50, (byte) 30, 205);
                            break L60;
                          } else {
                            break L53;
                          }
                        }
                      }
                    }
                    break L53;
                  }
                } else {
                  break L53;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        boolean discarded$1 = this.a(var21, param1, param7, param2, param0, -1, param4, var12, param3, param8, param9, param6, 0);
    }

    final void l(int param0, int param1) {
        lo var3 = null;
        int var4_int = 0;
        ne[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        RuntimeException stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        RuntimeException stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        RuntimeException stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_5_0 = null;
        RuntimeException stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        RuntimeException stackOut_7_1 = null;
        Object stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        RuntimeException stackOut_6_1 = null;
        String stackOut_6_2 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == param1) {
            break L0;
          } else {
            this.field_cb = 0;
            break L0;
          }
        }
        L1: {
          if (-1 < (this.field_cb ^ -1)) {
            break L1;
          } else {
            if ((hs.field_G.length ^ -1) >= (this.field_cb ^ -1)) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    this.field_v = hs.field_G[this.field_cb];
                    this.field_db = hs.field_G[this.field_cb];
                    if (0 > this.field_cb) {
                      break L4;
                    } else {
                      if (2 >= this.field_cb) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if ((param1 ^ -1) != -1) {
                    break L3;
                  } else {
                    rn.a(-118, (ha) (this));
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (-1 == (param1 ^ -1)) {
                      break L6;
                    } else {
                      var3 = ew.field_e.a((byte) 59, param1 + -1);
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (null != this.field_K) {
                      break L7;
                    } else {
                      var4_int = ew.field_e.a(param0 + 0, this.field_cb, this.field_hb, this.field_W);
                      if (-1 > (var4_int ^ -1)) {
                        var5 = this.field_jb % var4_int;
                        var3 = ew.field_e.a(this.field_W, 4136, this.field_cb, this.field_hb, var5);
                        if (var3 == null) {
                          throw new RuntimeException((String) null);
                        } else {
                          if (var6 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        throw new RuntimeException((String) null);
                      }
                    }
                  }
                  var3 = this.field_K.a(-114);
                  break L5;
                }
                var4 = var3.a(param0 + -95, (ha) (this));
                this.a((byte) -104, var3.field_l, var3.field_n, var4);
                break L2;
              }
              return;
            }
          }
        }
        L8: {
          stackOut_5_0 = null;
          stackOut_5_1 = null;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          stackIn_6_0 = stackOut_5_0;
          stackIn_6_1 = stackOut_5_1;
          if (!this.field_x) {
            stackOut_7_0 = null;
            stackOut_7_1 = null;
            stackOut_7_2 = null;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = (String) ((Object) stackOut_7_2);
            break L8;
          } else {
            stackOut_6_0 = null;
            stackOut_6_1 = null;
            stackOut_6_2 = "That's not a valid map size: " + this.field_cb;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            break L8;
          }
        }
        throw new RuntimeException(stackIn_8_2);
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
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
            if (param1 == -64) {
              L1: {
                var3_int = this.o(this.field_sb, param1 ^ 63);
                if (var3_int < 0) {
                  var4 = this.a(param0, -128);
                  var3_int = this.o(var4, -1);
                  if (-1 < (var3_int ^ -1)) {
                    var3_int = 2;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              stackOut_8_0 = op.field_c[0][var3_int];
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -101;
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
            stackOut_10_1 = new StringBuilder().append("ha.OC(");
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
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.a(127, (jd) null);
        }
        int var4 = (param2 ^ -1) >= (param0 ^ -1) ? 1 : 0;
        return var4 != 0;
    }

    private final boolean a(jd param0, int param1, int param2, boolean param3, int param4, int param5, int param6, jd param7, int param8, int param9, int param10, boolean param11, int param12) {
        RuntimeException var14 = null;
        String var15 = null;
        String var16 = null;
        StringBuilder stackIn_1_0 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_0_0 = null;
        StringBuilder stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        StringBuilder stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        StringBuilder stackOut_3_0 = null;
        StringBuilder stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        StringBuilder stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = new StringBuilder().append("applycombat: ").append(param12).append(", player: ").append(this.field_gb).append(", turn: ").append(this.field_Gb).append(", att: ");
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param0 == null) {
                stackOut_2_0 = (StringBuilder) ((Object) stackIn_2_0);
                stackOut_2_1 = -1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (StringBuilder) ((Object) stackIn_1_0);
                stackOut_1_1 = param0.field_N;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = ((StringBuilder) (Object) stackIn_3_0).append(stackIn_3_1).append(", def: ");
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param7 != null) {
                stackOut_5_0 = (StringBuilder) ((Object) stackIn_5_0);
                stackOut_5_1 = param7.field_N;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = (StringBuilder) ((Object) stackIn_4_0);
                stackOut_4_1 = -1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            var16 = String.valueOf(stackIn_6_1);
            if (param5 == -1) {
              var15 = "\ncx: " + param8 + ", cy: " + param4 + ", ax: " + param1 + ", ay: " + param6 + ", adam: " + param2 + ", ddam: " + param9 + ", creature: " + param10 + ", attdie: " + param3 + ", defdie: " + param11;
              if (!this.field_F) {
                this.field_o = true;
                System.out.println(var16 + var15);
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                af.a((Throwable) null, 115, var16 + var15);
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var14 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var14);
            stackOut_14_1 = new StringBuilder().append("ha.JA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param7 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final int k(int param0, int param1) {
        float var3 = 0.0f;
        int var4 = 0;
        float stackIn_5_0 = 0.0f;
        float stackOut_4_0 = 0.0f;
        float stackOut_3_0 = 0.0f;
        L0: {
          L1: {
            if (this.field_K == null) {
              break L1;
            } else {
              if (this.field_K.field_w == param1) {
                stackOut_4_0 = this.field_bb;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1.0f;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        var3 = stackIn_5_0;
        var4 = (int)((float)(this.field_z[this.field_yb[param1]][2] * 25) * var3) + ((int)(var3 * (float)(this.field_z[this.field_yb[param1]][1] * 75)) + (int)(var3 * (float)(50 * this.field_z[this.field_yb[param1]][0])));
        if (param0 <= -95) {
          return var4;
        } else {
          return 115;
        }
    }

    final int g(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (param2 >= this.field_v) {
                break L0;
              } else {
                if (this.field_v <= param0) {
                  break L0;
                } else {
                  L1: {
                    if (param1 <= -28) {
                      break L1;
                    } else {
                      this.field_Fb = false;
                      break L1;
                    }
                  }
                  L2: {
                    var4 = this.field_Eb[param2 + this.field_v * param0].field_h;
                    if (6 == var4) {
                      var4 = 4;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return var4;
                }
              }
            }
          }
        }
        return -1;
    }

    final boolean c(int param0, int param1, int param2) {
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param1 == -16985) {
            break L0;
          } else {
            this.field_o = false;
            break L0;
          }
        }
        L1: {
          if (0 == (param0 ^ -1)) {
            break L1;
          } else {
            if ((param2 ^ -1) == 0) {
              break L1;
            } else {
              if (-256 == (param0 ^ -1)) {
                break L1;
              } else {
                if ((param2 ^ -1) != -256) {
                  L2: {
                    if (this.field_yb[param2] != this.field_yb[param0]) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  return stackIn_11_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    private final void a(byte param0, vh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = -72 % ((-9 - param0) / 57);
            var3_int = param1.e((byte) -104) & 8191;
            var5 = param1.k(0);
            var6 = param1.k(0);
            var13 = new int[var3_int];
            var12 = var13;
            var7 = var12;
            var8 = 0;
            L1: while (true) {
              stackOut_2_0 = var3_int;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= 0) {
                      break L4;
                    } else {
                      var9 = param1.k(0);
                      if (var11 != 0) {
                        break L3;
                      } else {
                        var10 = 0;
                        L5: while (true) {
                          L6: {
                            if (-5 >= (var10 ^ -1)) {
                              break L6;
                            } else {
                              stackOut_7_0 = var3_int;
                              stackIn_3_0 = stackOut_7_0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var11 != 0) {
                                continue L2;
                              } else {
                                if (stackIn_8_0 <= 0) {
                                  break L6;
                                } else {
                                  var7[var8] = rn.a(3, var9);
                                  var9 = var9 >> 2;
                                  var8++;
                                  var3_int--;
                                  var10++;
                                  if (var11 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  this.field_l.a((byte) -119, (tc) (new kr(var5, var6, var13)));
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("ha.MD(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    private final boolean f(int param0, int param1, int param2) {
        int discarded$0 = 0;
        int var4 = (param1 ^ -1) <= (param0 ^ -1) ? 1 : 0;
        if (param2 != 0) {
            discarded$0 = this.e(73, 49, -89);
        }
        return var4 != 0;
    }

    private final int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 1 + this.field_vb;
          if (this.field_cb < 0) {
            break L0;
          } else {
            if (hs.field_G.length > this.field_cb) {
              L1: {
                var3 = nr.field_a[this.field_cb] * var2;
                if (this.field_K != null) {
                  var3 = 9999;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == 32) {
                  break L2;
                } else {
                  this.field_Db = -41;
                  break L2;
                }
              }
              return var3;
            } else {
              break L0;
            }
          }
        }
        return var2 * nr.field_a[0];
    }

    final String e(int param0, int param1) {
        if (-1 > param0) {
            return "id: " + param0;
        }
        if (param1 < (param0 ^ -1)) {
            return "none";
        }
        return this.field_lb[param0];
    }

    final void a(vh param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        var3_int = param0.field_o[param0.field_q];
                        var4 = (var3_int & 237) >> 1448727269;
                        if (-1 != (var4 ^ -1)) {
                          break L6;
                        } else {
                          if (var5 == 0) {
                            this.a((byte) 91, param0);
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L5;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (1 != var4) {
                          break L7;
                        } else {
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (3 == var4) {
                        break L4;
                      } else {
                        if (5 == var4) {
                          break L3;
                        } else {
                          if (var4 == 6) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    this.a(param0, true);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  this.a(param0, -1);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.a(-30531, param0);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.b(param0, (byte) -84);
              break L1;
            }
            L8: {
              if (param1 < -50) {
                break L8;
              } else {
                this.a(true, 103, -100, 43, -48, -87, -117);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("ha.SA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param3 != 0) {
            return -22;
        }
        return 0;
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_6_0 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_V) {
          L0: {
            if (param0 >= 45) {
              break L0;
            } else {
              this.a(-102, (jd) null);
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            L2: {
              if (this.field_W <= var2) {
                break L2;
              } else {
                stackOut_6_0 = 0;
                stackIn_22_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (var3 != 0) {
                  return stackIn_22_0 != 0;
                } else {
                  if (stackIn_7_0 > var2) {
                    return false;
                  } else {
                    if (var2 < this.field_mb.length) {
                      L3: {
                        L4: {
                          if (0 == (1 << var2 & this.field_e)) {
                            break L4;
                          } else {
                            if (var3 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if ((this.field_mb[var2] ^ -1) < (this.field_O ^ -1)) {
                          return true;
                        } else {
                          if ((this.field_mb[var2] ^ -1) > (this.field_O ^ -1)) {
                            return false;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final int a(int param0, int param1, jd param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_Eb[param0].c((byte) -79)) {
                break L1;
              } else {
                if (this.c(this.field_Eb[param0].b((byte) -88), -16985, param2.field_O)) {
                  stackOut_3_0 = 60;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (0 == (8 & this.b(31, param2.field_w, param2.field_J, param2.field_O))) {
              L2: {
                if (-3 != (bw.field_m[param2.field_N][1] ^ -1)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var4_int = stackIn_11_0;
                  if (var4_int == 0) {
                    break L4;
                  } else {
                    if (-4 != (this.field_Eb[param0].field_h ^ -1)) {
                      break L4;
                    } else {
                      param0 = 70;
                      if (!ArmiesOfGielinor.field_M) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                param0 = ri.field_c[this.field_Eb[param0].field_h];
                break L3;
              }
              L5: {
                if (param1 == -4) {
                  break L5;
                } else {
                  this.field_Bb = false;
                  break L5;
                }
              }
              stackOut_17_0 = param0;
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_6_0 = 100;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("ha.U(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        boolean[] var4 = null;
        boolean[] var5 = null;
        Vector[] var6 = null;
        int var7_int = 0;
        boolean[] var7 = null;
        ne var8_ref_ne = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        jd var12 = null;
        jd[] var13 = null;
        jd var14 = null;
        jd[] var15 = null;
        boolean stackIn_39_0 = false;
        int stackIn_46_0 = 0;
        boolean stackIn_49_0 = false;
        int stackIn_66_0 = 0;
        int stackIn_76_0 = 0;
        boolean stackIn_88_0 = false;
        boolean stackOut_38_0 = false;
        int stackOut_45_0 = 0;
        boolean stackOut_48_0 = false;
        int stackOut_65_0 = 0;
        int stackOut_75_0 = 0;
        boolean stackOut_87_0 = false;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_P = new tt(this.field_W);
        var2 = 0;
        var3 = 0;
        var4 = new boolean[this.field_W];
        var5 = new boolean[this.field_W];
        var6 = new Vector[this.field_W];
        var7_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var7_int >= this.field_Eb.length) {
                break L2;
              } else {
                var8_ref_ne = this.field_Eb[var7_int];
                if (var11 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (var8_ref_ne != null) {
                        break L4;
                      } else {
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      var12 = var8_ref_ne.field_c;
                      var14 = var12;
                      if (var14 != null) {
                        L6: {
                          if (!var14.c(false)) {
                            break L6;
                          } else {
                            if (var14.field_O != -1) {
                              L7: {
                                if (null == var6[var12.field_O]) {
                                  var6[var12.field_O] = new Vector();
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var6[var12.field_O].addElement(var14);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L8: {
                          if (-8 == (var14.field_N ^ -1)) {
                            if (0 > var14.field_O) {
                              break L8;
                            } else {
                              var3 = 1;
                              var4[var12.field_O] = true;
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (var14.i(-21428)) {
                            break L9;
                          } else {
                            if (!var14.k((byte) 93)) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (var14.field_O >= 0) {
                          var5[var12.field_O] = true;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L10: {
                      if (var8_ref_ne.d(-58)) {
                        L11: {
                          if ((var8_ref_ne.field_a ^ -1) > -1) {
                            break L11;
                          } else {
                            var4[var8_ref_ne.field_a] = true;
                            break L11;
                          }
                        }
                        var3 = 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    if (!var8_ref_ne.e((byte) -128)) {
                      break L3;
                    } else {
                      var2 = 1;
                      break L3;
                    }
                  }
                  var7_int++;
                  if (var11 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == -29673) {
              break L1;
            } else {
              this.a(23, (gn) null, 119);
              break L1;
            }
          }
          L12: {
            L13: {
              L14: {
                L15: {
                  L16: {
                    var7 = new boolean[this.field_W];
                    if (var3 == 0) {
                      var8 = 0;
                      L17: while (true) {
                        if ((this.field_W ^ -1) >= (var8 ^ -1)) {
                          break L16;
                        } else {
                          var7[var8] = true;
                          var8++;
                          if (var11 != 0) {
                            break L14;
                          } else {
                            if (var11 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    } else {
                      var8 = 0;
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (this.field_W <= var8) {
                              break L20;
                            } else {
                              stackOut_38_0 = var5[var8];
                              stackIn_46_0 = stackOut_38_0 ? 1 : 0;
                              stackIn_39_0 = stackOut_38_0;
                              if (var11 != 0) {
                                break L19;
                              } else {
                                L21: {
                                  L22: {
                                    if (stackIn_39_0) {
                                      break L22;
                                    } else {
                                      if (!var4[var8]) {
                                        var7[var8] = true;
                                        if (var11 == 0) {
                                          break L21;
                                        } else {
                                          break L22;
                                        }
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  var4[var8] = true;
                                  break L21;
                                }
                                var8++;
                                if (var11 == 0) {
                                  continue L18;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          stackOut_45_0 = 0;
                          stackIn_46_0 = stackOut_45_0;
                          break L19;
                        }
                        var8 = stackIn_46_0;
                        L23: while (true) {
                          L24: {
                            if ((var8 ^ -1) <= (this.field_W ^ -1)) {
                              break L24;
                            } else {
                              stackOut_48_0 = var4[var8];
                              stackIn_66_0 = stackOut_48_0 ? 1 : 0;
                              stackIn_49_0 = stackOut_48_0;
                              if (var11 != 0) {
                                break L15;
                              } else {
                                L25: {
                                  if (stackIn_49_0) {
                                    this.field_P.a(new up(var8, (ha) (this)), (byte) 91, var8);
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                var8++;
                                if (var11 == 0) {
                                  continue L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                          this.field_eb = true;
                          if (var11 == 0) {
                            break L16;
                          } else {
                            var8 = 0;
                            L26: while (true) {
                              if ((this.field_W ^ -1) >= (var8 ^ -1)) {
                                break L16;
                              } else {
                                var7[var8] = true;
                                var8++;
                                if (var11 != 0) {
                                  break L14;
                                } else {
                                  if (var11 == 0) {
                                    continue L26;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_65_0 = var2;
                  stackIn_66_0 = stackOut_65_0;
                  break L15;
                }
                if (stackIn_66_0 != 0) {
                  break L14;
                } else {
                  var8 = 0;
                  L27: while (true) {
                    L28: {
                      if (this.field_W <= var8) {
                        break L28;
                      } else {
                        if (var11 != 0) {
                          break L13;
                        } else {
                          L29: {
                            if (null == var6[var8]) {
                              break L29;
                            } else {
                              var7[var8] = true;
                              this.field_P.b(244, var8);
                              break L29;
                            }
                          }
                          var8++;
                          if (var11 == 0) {
                            continue L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    if (var11 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              var8 = 0;
              L30: while (true) {
                stackOut_75_0 = var8 ^ -1;
                stackIn_76_0 = stackOut_75_0;
                L31: while (true) {
                  if (stackIn_76_0 <= (this.field_W ^ -1)) {
                    break L13;
                  } else {
                    if (var11 != 0) {
                      break L12;
                    } else {
                      L32: {
                        if (null == var6[var8]) {
                          break L32;
                        } else {
                          var13 = new jd[var6[var8].size()];
                          var15 = var13;
                          var10 = 0;
                          L33: while (true) {
                            L34: {
                              L35: {
                                if (var10 >= var6[var8].size()) {
                                  break L35;
                                } else {
                                  var13[var10] = (jd) (var6[var8].elementAt(var10));
                                  var10++;
                                  if (var11 != 0) {
                                    break L34;
                                  } else {
                                    if (var11 == 0) {
                                      continue L33;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                              }
                              this.field_P.a(new gm(var8, var15), (byte) 85, var8);
                              var7[var8] = true;
                              this.field_P.a((byte) 43);
                              break L34;
                            }
                            var10 = 0;
                            L36: while (true) {
                              if ((this.field_W ^ -1) >= (var10 ^ -1)) {
                                break L32;
                              } else {
                                stackOut_87_0 = this.c(var8, -16985, var10);
                                stackIn_76_0 = stackOut_87_0 ? 1 : 0;
                                stackIn_88_0 = stackOut_87_0;
                                if (var11 != 0) {
                                  continue L31;
                                } else {
                                  L37: {
                                    if (!stackIn_88_0) {
                                      break L37;
                                    } else {
                                      if ((var10 ^ -1) != (var8 ^ -1)) {
                                        var7[var10] = true;
                                        break L37;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  var10++;
                                  if (var11 == 0) {
                                    continue L36;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var8++;
                      if (var11 == 0) {
                        continue L30;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
            }
            var8 = 0;
            break L12;
          }
          L38: while (true) {
            L39: {
              if ((var8 ^ -1) <= (this.field_W ^ -1)) {
                break L39;
              } else {
                if (var11 != 0) {
                  break L39;
                } else {
                  L40: {
                    if (var7[var8]) {
                      this.field_P.a(new mc(var8, (ha) (this)), (byte) 99, var8);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  var8++;
                  if (var11 == 0) {
                    continue L38;
                  } else {
                    break L39;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final int n(int param0, int param1) {
        int[] discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = 0;
          if (param1 < -60) {
            break L0;
          } else {
            discarded$1 = this.a(53, (byte) 105, 32, 124);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var4 ^ -1) <= (this.field_c[param0].length ^ -1)) {
                break L3;
              } else {
                var5 = this.field_c[param0][var4];
                stackOut_4_0 = var5 ^ -1;
                stackOut_4_1 = -1;
                stackIn_10_0 = stackOut_4_0;
                stackIn_10_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (var6 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_5_0 <= stackIn_5_1) {
                      var3 = var3 ^ (17232 - -(312 * var5)) * this.field_E[param0][var5];
                      break L4;
                    } else {
                      break L4;
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
            stackOut_9_0 = this.field_H[param0] ^ -1;
            stackOut_9_1 = -2;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            break L2;
          }
          L5: {
            if (stackIn_10_0 > stackIn_10_1) {
              break L5;
            } else {
              var3 = var3 ^ this.field_H[param0] * 88357;
              break L5;
            }
          }
          L6: {
            if ((this.field_fb[this.field_yb[param0]] ^ -1) <= -2) {
              var3 = var3 ^ this.field_fb[this.field_yb[param0]] * 12473;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var3 = var3 ^ 7563 * this.field_mb[param0];
            if (lf.field_i[this.field_Q] == 0) {
              break L7;
            } else {
              var3 = var3 ^ 7317 * this.field_m[param0];
              break L7;
            }
          }
          return var3;
        }
    }

    final int o(int param0, int param1) {
        if (param1 < (param0 ^ -1)) {
            return -1;
        }
        return this.field_yb[param0];
    }

    final int i(int param0, int param1) {
        int var3 = 0;
        if (null != this.field_fb) {
          if (-1 < (param0 ^ -1)) {
            return 0;
          } else {
            if ((param0 ^ -1) > (this.field_W ^ -1)) {
              L0: {
                var3 = 25 * param0;
                var3 = var3 + this.field_fb[this.field_yb[param0]];
                if ((var3 ^ -1) < (this.field_xb ^ -1)) {
                  var3 = this.field_xb;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param1 == -12710) {
                  break L1;
                } else {
                  this.field_A = -76;
                  break L1;
                }
              }
              return var3;
            } else {
              return 0;
            }
          }
        } else {
          return 0;
        }
    }

    public static void c(int param0) {
        field_pb = null;
        field_nb = null;
        field_q = null;
        if (param0 != -1) {
            field_nb = (String) null;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2 ^ -1) <= (this.field_z.length ^ -1)) {
                break L2;
              } else {
                this.field_z[var2][0] = 0;
                this.field_z[var2][1] = 0;
                this.field_z[var2][2] = 0;
                var2++;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == 2) {
              break L1;
            } else {
              this.a(-11, (String) null, (oj) null);
              break L1;
            }
          }
          if (null == this.field_Eb) {
            return;
          } else {
            var6 = 0;
            var2 = var6;
            L3: while (true) {
              L4: {
                L5: {
                  if (this.field_Eb.length <= var6) {
                    break L5;
                  } else {
                    var3 = this.o(this.field_Eb[var6].field_a, -1);
                    if (var5 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (var3 <= -1) {
                          break L6;
                        } else {
                          L7: {
                            L8: {
                              var4 = this.field_Eb[var6].field_h;
                              if (7 == var4) {
                                this.field_z[var3][0] = this.field_z[var3][0] + 1;
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              } else {
                                L9: {
                                  if (var4 != 14) {
                                    break L9;
                                  } else {
                                    if (var5 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  if (9 != var4) {
                                    break L10;
                                  } else {
                                    if (var5 == 0) {
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (var4 == 8) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            this.field_z[var3][1] = this.field_z[var3][1] + 1;
                            if (var5 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                          this.field_z[var3][2] = this.field_z[var3][2] + 1;
                          break L6;
                        }
                      }
                      var6++;
                      if (var5 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                this.a(1);
                break L4;
              }
              return;
            }
          }
        }
    }

    final int a(byte param0) {
        at discarded$0 = null;
        if (param0 != 78) {
            discarded$0 = this.f(84, -63);
        }
        return (this.field_e ^ -1) & (1 << this.field_W) + -1;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var4 = 0;
            var5 = this.g(param0, param1 + -2101, param2);
            if (var5 == 4) {
              break L1;
            } else {
              if (5 != var5) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if ((this.g(param0 + -1, param1 + -2139, param2) ^ -1) == (var5 ^ -1)) {
              break L2;
            } else {
              var4 = var4 | 2;
              break L2;
            }
          }
          L3: {
            if ((var5 ^ -1) != (this.g(param0, -37, param2 + 1) ^ -1)) {
              var4 = var4 | 1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if ((var5 ^ -1) != (this.g(param0, -43, -1 + param2) ^ -1)) {
              var4 = var4 | 8;
              break L4;
            } else {
              break L4;
            }
          }
          if ((var5 ^ -1) == (this.g(1 + param0, -63, param2) ^ -1)) {
            break L0;
          } else {
            var4 = var4 | 4;
            break L0;
          }
        }
        if (-7 != (var4 ^ -1)) {
          if (-10 != (var4 ^ -1)) {
            if (-3 != (var4 ^ -1)) {
              if (param1 == 2056) {
                if ((var4 ^ -1) != -5) {
                  if (-2 == (var4 ^ -1)) {
                    return 3;
                  } else {
                    if ((var4 ^ -1) != -9) {
                      return -1;
                    } else {
                      return 0;
                    }
                  }
                } else {
                  return 1;
                }
              } else {
                return -23;
              }
            } else {
              return 2;
            }
          } else {
            return 0;
          }
        } else {
          return 1;
        }
    }

    private final boolean e(byte param0) {
        int var2 = 0;
        go[] var3 = null;
        int var4 = 0;
        go var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -42) {
          if (!this.field_wb) {
            L0: {
              if (eb.a((byte) -125, this.a((byte) 78)) != 1) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                stackOut_22_0 = 1;
                stackIn_24_0 = stackOut_22_0;
                break L0;
              }
            }
            return stackIn_24_0 != 0;
          } else {
            var2 = 0;
            var3 = this.field_w;
            var4 = 0;
            L1: while (true) {
              stackOut_4_0 = var4;
              stackOut_4_1 = var3.length;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_5_0 >= stackIn_5_1) {
                      break L4;
                    } else {
                      var5 = var3[var4];
                      var6 = var5.field_a;
                      stackOut_6_0 = 0;
                      stackIn_17_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L3;
                      } else {
                        var7 = stackIn_7_0;
                        L5: while (true) {
                          L6: {
                            if (var6.length <= var7) {
                              break L6;
                            } else {
                              var8 = var6[var7];
                              stackOut_9_0 = this.field_e & 1 << var8 ^ -1;
                              stackOut_9_1 = -1;
                              stackIn_5_0 = stackOut_9_0;
                              stackIn_5_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var9 != 0) {
                                continue L2;
                              } else {
                                L7: {
                                  if (stackIn_10_0 != stackIn_10_1) {
                                    break L7;
                                  } else {
                                    var2++;
                                    if (var9 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var7++;
                                if (var9 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var4++;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                }
                L8: {
                  if (stackIn_17_0 != var2) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L8;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L8;
                  }
                }
                return stackIn_20_0 != 0;
              }
            }
          }
        } else {
          return true;
        }
    }

    final void a(byte param0, int param1) {
        int var4 = -71 % ((param0 - -15) / 37);
        go var3 = this.d(param1, -1);
        if (!(var3 == null)) {
            var3.a(3, (ha) (this));
        }
    }

    private final int a(byte param0, int param1, ne param2) {
        int discarded$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
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
            var4_int = 0;
            if (this.a(param1, param2, 115)) {
              L1: {
                var4_int = var4_int ^ param2.field_h * 47;
                if (param2.c(-120)) {
                  var4_int = var4_int ^ 234;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param2.c((byte) -79)) {
                  var4_int = var4_int ^ 2823;
                  var4_int = var4_int ^ param2.b((byte) -71) * 75;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0 == 103) {
                  break L3;
                } else {
                  discarded$2 = this.c(-105, 88);
                  break L3;
                }
              }
              var4_int = var4_int ^ 7657 * param2.field_a;
              stackOut_11_0 = var4_int;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var4_int = var4_int ^ param2.field_h;
              stackOut_1_0 = var4_int;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("ha.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_12_0;
        }
    }

    final boolean m(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackOut_4_0 = false;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_P.a(param1, -96)) {
          var3 = param0;
          L0: while (true) {
            L1: {
              if (var3 >= this.field_W) {
                break L1;
              } else {
                stackOut_4_0 = this.c(var3, param0 ^ -16985, param1);
                stackIn_11_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4 != 0) {
                  return stackIn_11_0;
                } else {
                  L2: {
                    L3: {
                      if (!stackIn_5_0) {
                        break L3;
                      } else {
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.b(10001, var3, true);
                    break L2;
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final int c(int param0, int param1, int param2, int param3) {
        int discarded$2 = 0;
        int var6 = 0;
        ne var7 = null;
        if (0 > param3) {
          return 0;
        } else {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (0 > param2) {
                break L0;
              } else {
                if ((param0 ^ -1) <= (this.field_v ^ -1)) {
                  break L0;
                } else {
                  if ((param2 ^ -1) > (this.field_db ^ -1)) {
                    var7 = this.field_Eb[this.field_v * param2 + param0];
                    if (var7.field_c == null) {
                      L1: {
                        var6 = this.c(param3, -16985, var7.field_a) ? 1 : 0;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          if (7 != var7.field_h) {
                            break L1;
                          } else {
                            return 65535;
                          }
                        }
                      }
                      L2: {
                        if (param1 == -27300) {
                          break L2;
                        } else {
                          discarded$2 = this.a(41, 1, 42, (byte) 14);
                          break L2;
                        }
                      }
                      L3: {
                        if (var6 == 0) {
                          break L3;
                        } else {
                          if (-12 != (var7.field_h ^ -1)) {
                            break L3;
                          } else {
                            return 1 << var7.field_g;
                          }
                        }
                      }
                      return 0;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                }
              }
            }
          }
          return 0;
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_7_0 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if ((this.field_W ^ -1) >= (var3 ^ -1)) {
                break L2;
              } else {
                stackOut_2_0 = this;
                stackIn_8_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if ((((ha) (this)).field_u & 1 << var3 ^ -1) != (1 << var3 & param1 ^ -1)) {
                      this.b(10001, var3, false);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3++;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_7_0 = this;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          ((ha) (this)).field_u = param1;
          return;
        }
    }

    final boolean a(jd param0, int param1, int param2, int param3) {
        ne var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (param2 < 0) {
                  break L1;
                } else {
                  if ((param1 ^ -1) <= (this.field_v ^ -1)) {
                    break L1;
                  } else {
                    if ((param2 ^ -1) < (this.field_db ^ -1)) {
                      break L1;
                    } else {
                      if (param3 < -117) {
                        var5 = this.field_Eb[param2 * this.field_v + param1];
                        if (null == var5.field_c) {
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          if (param0.field_N != 51) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5_ref);
            stackOut_17_1 = new StringBuilder().append("ha.W(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final boolean b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ne[] var6 = null;
        int var7 = 0;
        ne var8 = null;
        jd var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == this.field_K) {
          return false;
        } else {
          if (!param1) {
            var4 = 0;
            var5 = 0;
            if (param2 == -1) {
              var6 = this.field_Eb;
              var7 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var6.length <= var7) {
                      break L2;
                    } else {
                      var8 = var6[var7];
                      stackOut_9_0 = var8.field_a;
                      stackOut_9_1 = param0;
                      stackIn_24_0 = stackOut_9_0;
                      stackIn_24_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var10 != 0) {
                        break L1;
                      } else {
                        L3: {
                          if (stackIn_10_0 != stackIn_10_1) {
                            break L3;
                          } else {
                            L4: {
                              if (7 == var8.field_h) {
                                break L4;
                              } else {
                                if (11 != var8.field_h) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              var4 = 1;
                              var9 = var8.field_c;
                              if (var9 == null) {
                                break L5;
                              } else {
                                if (!this.c(var9.field_O, -16985, param0)) {
                                  break L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var5 = 1;
                            break L3;
                          }
                        }
                        var7++;
                        if (var10 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L6: {
                    if (var5 != 0) {
                      break L6;
                    } else {
                      if (var4 != 0) {
                        this.field_A = this.field_A + 1;
                        stackOut_23_0 = -4;
                        stackOut_23_1 = this.field_A ^ -1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                  this.field_A = 0;
                  return false;
                }
                if (stackIn_24_0 >= stackIn_24_1) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            this.field_A = 0;
            return false;
          }
        }
    }

    final void a(int param0) {
        int discarded$1 = 0;
        int var2_int = 0;
        int[] var2 = null;
        go[] var3_ref_go__ = null;
        int var3 = 0;
        int var4 = 0;
        go var5_ref_go = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_64_0 = 0;
        boolean stackIn_67_0 = false;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_63_0 = 0;
        boolean stackOut_66_0 = false;
        int stackOut_70_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_wb) {
          L0: {
            L1: {
              if (this.field_K == null) {
                break L1;
              } else {
                if (!this.field_qb) {
                  break L1;
                } else {
                  var2_int = 0;
                  var3_ref_go__ = this.field_w;
                  var4 = 0;
                  L2: while (true) {
                    stackOut_5_0 = var4;
                    stackOut_5_1 = var3_ref_go__.length;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (stackIn_6_0 >= stackIn_6_1) {
                            break L5;
                          } else {
                            var5_ref_go = var3_ref_go__[var4];
                            stackOut_7_0 = var5_ref_go.a(this.field_K.field_w, (byte) -100);
                            stackIn_19_0 = stackOut_7_0 ? 1 : 0;
                            stackIn_8_0 = stackOut_7_0;
                            if (var9 != 0) {
                              break L4;
                            } else {
                              L6: {
                                if (stackIn_8_0) {
                                  break L6;
                                } else {
                                  var16 = var5_ref_go.field_a;
                                  var7 = 0;
                                  L7: while (true) {
                                    if (var7 >= var16.length) {
                                      break L6;
                                    } else {
                                      var8 = var16[var7];
                                      stackOut_11_0 = -1;
                                      stackOut_11_1 = this.field_e & 1 << var8 ^ -1;
                                      stackIn_6_0 = stackOut_11_0;
                                      stackIn_6_1 = stackOut_11_1;
                                      stackIn_12_0 = stackOut_11_0;
                                      stackIn_12_1 = stackOut_11_1;
                                      if (var9 != 0) {
                                        continue L3;
                                      } else {
                                        L8: {
                                          if (stackIn_12_0 == stackIn_12_1) {
                                            var2_int = 1;
                                            if (var9 == 0) {
                                              break L5;
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            break L8;
                                          }
                                        }
                                        var7++;
                                        if (var9 == 0) {
                                          continue L7;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var4++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        this.field_R = 1;
                        stackOut_18_0 = var2_int;
                        stackIn_19_0 = stackOut_18_0;
                        break L4;
                      }
                      L9: {
                        if (stackIn_19_0 != 0) {
                          break L9;
                        } else {
                          this.field_p[0] = 0;
                          this.field_p[1] = 1;
                          if (var9 == 0) {
                            break L0;
                          } else {
                            break L9;
                          }
                        }
                      }
                      this.field_p[0] = 1;
                      this.field_p[1] = 0;
                      return;
                    }
                  }
                }
              }
            }
            L10: {
              L11: {
                if (this.d((byte) 125)) {
                  break L11;
                } else {
                  this.field_p[1] = 0;
                  this.field_p[0] = 1;
                  if (var9 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              this.field_p[1] = 1;
              this.field_p[0] = 0;
              break L10;
            }
            var2_int = 0;
            var4 = 0;
            L12: while (true) {
              L13: {
                L14: {
                  if ((var4 ^ -1) <= (this.field_tb ^ -1)) {
                    break L14;
                  } else {
                    stackOut_29_0 = this.field_xb ^ -1;
                    stackIn_34_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (var9 != 0) {
                      break L13;
                    } else {
                      L15: {
                        if (stackIn_30_0 < (this.field_fb[var4] ^ -1)) {
                          break L15;
                        } else {
                          var2_int++;
                          break L15;
                        }
                      }
                      var4++;
                      if (var9 == 0) {
                        continue L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L13;
              }
              var3 = stackIn_34_0;
              var4 = 0;
              L16: while (true) {
                L17: {
                  L18: {
                    if (var4 >= this.field_W) {
                      break L18;
                    } else {
                      stackOut_36_0 = this.field_mb[var4];
                      stackOut_36_1 = this.field_O;
                      stackIn_42_0 = stackOut_36_0;
                      stackIn_42_1 = stackOut_36_1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      if (var9 != 0) {
                        break L17;
                      } else {
                        L19: {
                          if (stackIn_37_0 >= stackIn_37_1) {
                            var3 = 1;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        var4++;
                        if (var9 == 0) {
                          continue L16;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  this.field_R = var2_int;
                  stackOut_41_0 = -1;
                  stackOut_41_1 = this.field_R ^ -1;
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  break L17;
                }
                L20: {
                  if (stackIn_42_0 != stackIn_42_1) {
                    break L20;
                  } else {
                    if (var3 != 0) {
                      this.field_R = 1;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                if (0 != this.field_R) {
                  break L0;
                } else {
                  L21: {
                    if (this.e((byte) -42)) {
                      this.field_R = 1;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                }
              }
            }
          }
          return;
        } else {
          L22: {
            if (!this.field_X) {
              break L22;
            } else {
              if (!this.field_b) {
                return;
              } else {
                break L22;
              }
            }
          }
          var14 = this.d(10326);
          var12 = var14;
          var10 = var12;
          var2 = var10;
          var3 = 0;
          L23: while (true) {
            L24: {
              L25: {
                if (this.field_W <= var3) {
                  break L25;
                } else {
                  this.field_p[var3] = var3;
                  var3++;
                  if (var9 != 0) {
                    break L24;
                  } else {
                    if (var9 == 0) {
                      continue L23;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              var3 = 0;
              break L24;
            }
            L26: while (true) {
              L27: {
                L28: {
                  if (-1 + this.field_W <= var3) {
                    break L28;
                  } else {
                    var4 = var3;
                    stackOut_63_0 = 1 + var3;
                    stackIn_73_0 = stackOut_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    if (var9 != 0) {
                      break L27;
                    } else {
                      var5 = stackIn_64_0;
                      L29: while (true) {
                        L30: {
                          L31: {
                            if (this.field_W <= var5) {
                              break L31;
                            } else {
                              stackOut_66_0 = this.a(var14, this.field_p[var4], -24107, this.field_p[var5]);
                              stackIn_71_0 = stackOut_66_0 ? 1 : 0;
                              stackIn_67_0 = stackOut_66_0;
                              if (var9 != 0) {
                                break L30;
                              } else {
                                L32: {
                                  if (!stackIn_67_0) {
                                    break L32;
                                  } else {
                                    var4 = var5;
                                    break L32;
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L29;
                                } else {
                                  break L31;
                                }
                              }
                            }
                          }
                          stackOut_70_0 = this.field_p[var3];
                          stackIn_71_0 = stackOut_70_0;
                          break L30;
                        }
                        var5 = stackIn_71_0;
                        this.field_p[var3] = this.field_p[var4];
                        this.field_p[var4] = var5;
                        var3++;
                        if (var9 == 0) {
                          continue L26;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                }
                var3 = 0;
                var4 = 0;
                stackOut_72_0 = 0;
                stackIn_73_0 = stackOut_72_0;
                break L27;
              }
              var5 = stackIn_73_0;
              L33: while (true) {
                L34: {
                  L35: {
                    if (this.field_W <= var5) {
                      break L35;
                    } else {
                      stackOut_75_0 = 1 << var5 & this.field_e ^ -1;
                      stackOut_75_1 = -1;
                      stackIn_85_0 = stackOut_75_0;
                      stackIn_85_1 = stackOut_75_1;
                      stackIn_76_0 = stackOut_75_0;
                      stackIn_76_1 = stackOut_75_1;
                      if (var9 != 0) {
                        break L34;
                      } else {
                        L36: {
                          L37: {
                            if (stackIn_76_0 == stackIn_76_1) {
                              break L37;
                            } else {
                              if (var9 == 0) {
                                break L36;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L38: {
                            if (this.field_fb[var5] < this.field_xb) {
                              break L38;
                            } else {
                              var3++;
                              break L38;
                            }
                          }
                          if (this.field_mb[var5] < this.field_O) {
                            break L36;
                          } else {
                            var4 = 1;
                            break L36;
                          }
                        }
                        var5++;
                        if (var9 == 0) {
                          continue L33;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                  stackOut_84_0 = param0;
                  stackOut_84_1 = 1;
                  stackIn_85_0 = stackOut_84_0;
                  stackIn_85_1 = stackOut_84_1;
                  break L34;
                }
                L39: {
                  if (stackIn_85_0 == stackIn_85_1) {
                    break L39;
                  } else {
                    discarded$1 = this.f((byte) 28);
                    break L39;
                  }
                }
                L40: {
                  L41: {
                    this.field_R = var3;
                    if (this.field_R != 0) {
                      break L41;
                    } else {
                      if (var4 != 0) {
                        var5 = -1;
                        var6 = 0;
                        L42: while (true) {
                          if ((var6 ^ -1) <= (this.field_W ^ -1)) {
                            break L41;
                          } else {
                            stackOut_92_0 = this.field_fb[var6] ^ -1;
                            stackOut_92_1 = var5 ^ -1;
                            stackIn_100_0 = stackOut_92_0;
                            stackIn_100_1 = stackOut_92_1;
                            stackIn_93_0 = stackOut_92_0;
                            stackIn_93_1 = stackOut_92_1;
                            if (var9 != 0) {
                              break L40;
                            } else {
                              L43: {
                                L44: {
                                  if (stackIn_93_0 == stackIn_93_1) {
                                    break L44;
                                  } else {
                                    if ((var5 ^ -1) > (this.field_fb[var6] ^ -1)) {
                                      this.field_R = 1;
                                      var5 = this.field_fb[var6];
                                      if (var9 == 0) {
                                        break L43;
                                      } else {
                                        break L44;
                                      }
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                this.field_R = this.field_R + 1;
                                break L43;
                              }
                              var6++;
                              if (var9 == 0) {
                                continue L42;
                              } else {
                                break L41;
                              }
                            }
                          }
                        }
                      } else {
                        break L41;
                      }
                    }
                  }
                  stackOut_99_0 = 0;
                  stackOut_99_1 = this.field_R;
                  stackIn_100_0 = stackOut_99_0;
                  stackIn_100_1 = stackOut_99_1;
                  break L40;
                }
                L45: {
                  L46: {
                    L47: {
                      if (stackIn_100_0 != stackIn_100_1) {
                        break L47;
                      } else {
                        if (this.e((byte) -42)) {
                          break L46;
                        } else {
                          break L47;
                        }
                      }
                    }
                    if (this.field_K != null) {
                      break L46;
                    } else {
                      break L45;
                    }
                  }
                  this.field_R = 1;
                  break L45;
                }
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.a(param1, false, param0, param3);
        this.a(param1, false, 1 + param0, param3);
        this.a(1 + param1, false, param0, param3);
        if (param2 != -13) {
            return;
        }
        this.a(1 + param1, false, 1 + param0, param3);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ne var5 = null;
        ne var6 = null;
        if (param0 > 19) {
          if (0 > param3) {
            return;
          } else {
            L0: {
              if (-1 < (param2 ^ -1)) {
                break L0;
              } else {
                if (param3 >= this.field_v) {
                  break L0;
                } else {
                  if (this.field_db <= param2) {
                    break L0;
                  } else {
                    L1: {
                      L2: {
                        L3: {
                          var6 = this.field_Eb[this.field_v * param2 + param3];
                          var5 = var6;
                          if (null == var6.field_c) {
                            break L3;
                          } else {
                            if (var6.field_c.field_N != 20) {
                              break L1;
                            } else {
                              if (!this.c(var6.field_c.field_O, -16985, param1)) {
                                break L2;
                              } else {
                                var6.field_c.field_Y = var6.field_c.field_t;
                                if (!ArmiesOfGielinor.field_M) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        if (var6.c(89)) {
                          var5.field_c = new jd(param3, param2, 20, param1, 15, 15, 1, 0, 0, (ha) (this), 0, 0, -1, false, 0);
                          var6.i(14);
                          this.a(8288, var6.field_c);
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                      break L1;
                    }
                    return;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    ha(int param0, String[] param1, int param2, int[][] param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, boolean param10, int[][] param11, int param12, int param13, int param14, om param15) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int[] array$10 = null;
        int[] array$11 = null;
        int incrementValue$12 = 0;
        int[] array$14 = null;
        int incrementValue$15 = 0;
        int incrementValue$13 = 0;
        RuntimeException var17 = null;
        int var17_int = 0;
        int[] var17_array = null;
        int var18 = 0;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var21_ref_int__ = null;
        int var22 = 0;
        int var23 = 0;
        String var23_ref_String = null;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        sd var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
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
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        Object stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        Object stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_179_0 = 0;
        int stackIn_179_1 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_207_0 = 0;
        int stackIn_207_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_220_0 = 0;
        RuntimeException stackIn_225_0 = null;
        StringBuilder stackIn_225_1 = null;
        RuntimeException stackIn_226_0 = null;
        StringBuilder stackIn_226_1 = null;
        RuntimeException stackIn_227_0 = null;
        StringBuilder stackIn_227_1 = null;
        String stackIn_227_2 = null;
        RuntimeException stackIn_228_0 = null;
        StringBuilder stackIn_228_1 = null;
        RuntimeException stackIn_229_0 = null;
        StringBuilder stackIn_229_1 = null;
        RuntimeException stackIn_230_0 = null;
        StringBuilder stackIn_230_1 = null;
        String stackIn_230_2 = null;
        RuntimeException stackIn_231_0 = null;
        StringBuilder stackIn_231_1 = null;
        RuntimeException stackIn_232_0 = null;
        StringBuilder stackIn_232_1 = null;
        RuntimeException stackIn_233_0 = null;
        StringBuilder stackIn_233_1 = null;
        String stackIn_233_2 = null;
        RuntimeException stackIn_234_0 = null;
        StringBuilder stackIn_234_1 = null;
        RuntimeException stackIn_235_0 = null;
        StringBuilder stackIn_235_1 = null;
        RuntimeException stackIn_236_0 = null;
        StringBuilder stackIn_236_1 = null;
        String stackIn_236_2 = null;
        Throwable caughtException = null;
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
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        Object stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_57_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        int stackOut_162_0 = 0;
        int stackOut_162_1 = 0;
        int stackOut_169_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_172_1 = 0;
        int stackOut_178_0 = 0;
        int stackOut_178_1 = 0;
        int stackOut_183_0 = 0;
        int stackOut_183_1 = 0;
        int stackOut_167_0 = 0;
        int stackOut_167_1 = 0;
        int stackOut_191_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_206_1 = 0;
        int stackOut_214_0 = 0;
        int stackOut_214_1 = 0;
        boolean stackOut_219_0 = false;
        RuntimeException stackOut_224_0 = null;
        StringBuilder stackOut_224_1 = null;
        RuntimeException stackOut_226_0 = null;
        StringBuilder stackOut_226_1 = null;
        String stackOut_226_2 = null;
        RuntimeException stackOut_225_0 = null;
        StringBuilder stackOut_225_1 = null;
        String stackOut_225_2 = null;
        RuntimeException stackOut_227_0 = null;
        StringBuilder stackOut_227_1 = null;
        RuntimeException stackOut_229_0 = null;
        StringBuilder stackOut_229_1 = null;
        String stackOut_229_2 = null;
        RuntimeException stackOut_228_0 = null;
        StringBuilder stackOut_228_1 = null;
        String stackOut_228_2 = null;
        RuntimeException stackOut_230_0 = null;
        StringBuilder stackOut_230_1 = null;
        RuntimeException stackOut_232_0 = null;
        StringBuilder stackOut_232_1 = null;
        String stackOut_232_2 = null;
        RuntimeException stackOut_231_0 = null;
        StringBuilder stackOut_231_1 = null;
        String stackOut_231_2 = null;
        RuntimeException stackOut_233_0 = null;
        StringBuilder stackOut_233_1 = null;
        RuntimeException stackOut_235_0 = null;
        StringBuilder stackOut_235_1 = null;
        String stackOut_235_2 = null;
        RuntimeException stackOut_234_0 = null;
        StringBuilder stackOut_234_1 = null;
        String stackOut_234_2 = null;
        var25 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_ab = 1;
        this.field_R = 0;
        this.field_eb = false;
        this.field_bb = 1.0f;
        this.field_Z = null;
        this.field_Cb = false;
        this.field_D = 0;
        this.field_J = false;
        this.field_o = false;
        this.field_V = true;
        this.field_Bb = false;
        this.field_T = null;
        this.field_A = 0;
        this.field_r = true;
        this.field_qb = false;
        try {
          L0: {
            L1: {
              this.field_k = new at();
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
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
              ((ha) (this)).field_Ab = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param10) {
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
              ((ha) (this)).field_wb = stackIn_7_1 != 0;
              this.field_W = param1.length;
              this.field_K = param15;
              this.field_cb = param7;
              this.field_vb = param8;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (this.field_wb) {
                stackOut_9_0 = this;
                stackOut_9_1 = 2;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = this.field_W;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ha) (this)).field_tb = stackIn_10_1;
              this.field_hb = param9;
              this.field_Q = param12;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (-1 <= (param13 ^ -1)) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              ((ha) (this)).field_L = stackIn_13_1 != 0;
              stackOut_13_0 = this;
              stackOut_13_1 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if (this.field_K != null) {
                stackOut_15_0 = this;
                stackOut_15_1 = this;
                stackOut_15_2 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                break L5;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = this;
                stackOut_14_2 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                break L5;
              }
            }
            L6: {
              ((ha) (this)).field_V = stackIn_16_2 != 0;
              ((ha) (this)).field_r = stackIn_16_2 != 0;
              this.field_P = new tt(this.field_W);
              if (-1 >= (this.field_cb ^ -1)) {
                break L6;
              } else {
                this.field_cb = 0;
                break L6;
              }
            }
            L7: {
              L8: {
                if (this.field_K != null) {
                  break L8;
                } else {
                  L9: {
                    if (2 >= this.field_W) {
                      break L9;
                    } else {
                      if (1 <= this.field_cb) {
                        break L9;
                      } else {
                        this.field_cb = 1;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-5 <= (this.field_W ^ -1)) {
                      break L10;
                    } else {
                      if (2 <= this.field_cb) {
                        break L10;
                      } else {
                        this.field_cb = 2;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (-7 <= (this.field_W ^ -1)) {
                      break L11;
                    } else {
                      if (-4 >= (this.field_cb ^ -1)) {
                        break L11;
                      } else {
                        this.field_cb = 3;
                        break L11;
                      }
                    }
                  }
                  this.field_kb = false;
                  if ((this.field_W ^ -1) <= -5) {
                    break L7;
                  } else {
                    if (this.field_cb <= 2) {
                      break L7;
                    } else {
                      if ((this.field_cb ^ -1) == -5) {
                        break L7;
                      } else {
                        this.field_cb = 2;
                        if (var25 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
              }
              L12: {
                stackOut_32_0 = this;
                stackIn_34_0 = stackOut_32_0;
                stackIn_33_0 = stackOut_32_0;
                if ((mh.a(this.field_K.field_G.field_r, -126, this.field_K.field_v) ^ -1) != -1) {
                  stackOut_34_0 = this;
                  stackOut_34_1 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L12;
                } else {
                  stackOut_33_0 = this;
                  stackOut_33_1 = 1;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  break L12;
                }
              }
              ((ha) (this)).field_kb = stackIn_35_1 != 0;
              break L7;
            }
            L13: {
              L14: {
                L15: {
                  L16: {
                    this.field_jb = ns.a(false, 2147483647, li.field_n);
                    this.field_w = new go[this.field_tb];
                    this.field_yb = new int[this.field_W];
                    this.field_ib = param0;
                    if (!this.field_wb) {
                      break L16;
                    } else {
                      if (null == this.field_K) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  var17_int = 0;
                  L17: while (true) {
                    L18: {
                      if (var17_int >= this.field_W) {
                        break L18;
                      } else {
                        this.field_w[var17_int] = new go(param1[var17_int], new int[]{var17_int});
                        this.field_yb[var17_int] = var17_int;
                        var17_int++;
                        if (var25 != 0) {
                          break L13;
                        } else {
                          if (var25 == 0) {
                            continue L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    if (var25 == 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                var31 = new int[this.field_W / 2];
                var26 = var31;
                var17_array = var26;
                var18 = 0;
                var32 = new int[this.field_W / 2];
                var27 = var32;
                var19_ref_int__ = var27;
                var20 = 0;
                var21 = 0;
                L19: while (true) {
                  L20: {
                    L21: {
                      if (var21 >= this.field_W) {
                        break L21;
                      } else {
                        stackOut_45_0 = var21 & 1 ^ -1;
                        stackOut_45_1 = -1;
                        stackIn_51_0 = stackOut_45_0;
                        stackIn_51_1 = stackOut_45_1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        if (var25 != 0) {
                          break L20;
                        } else {
                          L22: {
                            L23: {
                              if (stackIn_46_0 != stackIn_46_1) {
                                break L23;
                              } else {
                                incrementValue$8 = var18;
                                var18++;
                                var17_array[incrementValue$8] = var21;
                                this.field_yb[var21] = 0;
                                if (var25 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            incrementValue$9 = var20;
                            var20++;
                            var19_ref_int__[incrementValue$9] = var21;
                            this.field_yb[var21] = 1;
                            break L22;
                          }
                          var21++;
                          if (var25 == 0) {
                            continue L19;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                    stackOut_50_0 = var20;
                    stackOut_50_1 = var18;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    break L20;
                  }
                  if (stackIn_51_0 == stackIn_51_1) {
                    this.field_w[0] = new go(om.field_p, var31);
                    this.field_w[1] = new go(vj.field_n, var32);
                    break L14;
                  } else {
                    throw new IllegalStateException("");
                  }
                }
              }
              L24: {
                this.field_l = new at();
                this.field_c = new int[this.field_W][3];
                this.field_E = new int[this.field_W][7];
                this.field_lb = param1;
                this.field_gb = param2;
                this.field_n = new int[this.field_W];
                this.field_H = new int[this.field_W];
                this.field_db = 0;
                stackOut_54_0 = this;
                stackIn_56_0 = stackOut_54_0;
                stackIn_55_0 = stackOut_54_0;
                if (!param6) {
                  stackOut_56_0 = this;
                  stackOut_56_1 = 0;
                  stackIn_57_0 = stackOut_56_0;
                  stackIn_57_1 = stackOut_56_1;
                  break L24;
                } else {
                  stackOut_55_0 = this;
                  stackOut_55_1 = 1;
                  stackIn_57_0 = stackOut_55_0;
                  stackIn_57_1 = stackOut_55_1;
                  break L24;
                }
              }
              L25: {
                ((ha) (this)).field_x = stackIn_57_1 != 0;
                this.field_fb = new int[this.field_tb];
                this.field_m = new int[this.field_W];
                this.field_p = new int[this.field_tb];
                this.field_t = new at[this.field_W];
                this.field_sb = param4;
                this.field_a = param3;
                this.field_v = 0;
                stackOut_57_0 = this;
                stackIn_59_0 = stackOut_57_0;
                stackIn_58_0 = stackOut_57_0;
                if (!param5) {
                  stackOut_59_0 = this;
                  stackOut_59_1 = 0;
                  stackIn_60_0 = stackOut_59_0;
                  stackIn_60_1 = stackOut_59_1;
                  break L25;
                } else {
                  stackOut_58_0 = this;
                  stackOut_58_1 = 1;
                  stackIn_60_0 = stackOut_58_0;
                  stackIn_60_1 = stackOut_58_1;
                  break L25;
                }
              }
              ((ha) (this)).field_b = stackIn_60_1 != 0;
              this.field_S = new int[this.field_tb];
              this.field_z = new int[this.field_tb][3];
              this.field_mb = new int[this.field_W];
              this.field_s = new int[3];
              this.field_U = new int[this.field_W];
              break L13;
            }
            L26: {
              L27: {
                if (!this.field_b) {
                  break L27;
                } else {
                  L28: {
                    L29: {
                      L30: {
                        L31: {
                          if (param11 != null) {
                            break L31;
                          } else {
                            this.field_B = (int[][]) null;
                            if (var25 == 0) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L32: {
                          if ((param11.length ^ -1) == -2) {
                            break L32;
                          } else {
                            this.field_B = new int[this.field_W][];
                            var17_int = 0;
                            L33: while (true) {
                              L34: {
                                if (var17_int >= this.field_W) {
                                  break L34;
                                } else {
                                  var18 = param11[var17_int].length;
                                  stackOut_67_0 = var18;
                                  stackOut_67_1 = 5;
                                  stackIn_92_0 = stackOut_67_0;
                                  stackIn_92_1 = stackOut_67_1;
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  if (var25 != 0) {
                                    break L28;
                                  } else {
                                    L35: {
                                      if (stackIn_68_0 >= stackIn_68_1) {
                                        break L35;
                                      } else {
                                        var18 = 5;
                                        break L35;
                                      }
                                    }
                                    array$10 = new int[var18];
                                    this.field_B[var17_int] = array$10;
                                    var19 = 0;
                                    L36: while (true) {
                                      L37: {
                                        L38: {
                                          if ((param11[var17_int].length ^ -1) >= (var19 ^ -1)) {
                                            break L38;
                                          } else {
                                            this.field_B[var17_int][var19] = param11[var17_int][var19];
                                            var19++;
                                            if (var25 != 0) {
                                              break L37;
                                            } else {
                                              if (var25 == 0) {
                                                continue L36;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                        }
                                        var19 = param11[var17_int].length;
                                        break L37;
                                      }
                                      L39: while (true) {
                                        L40: {
                                          L41: {
                                            if (var18 <= var19) {
                                              break L41;
                                            } else {
                                              this.field_B[var17_int][var19] = -1;
                                              var19++;
                                              if (var25 != 0) {
                                                break L40;
                                              } else {
                                                if (var25 == 0) {
                                                  continue L39;
                                                } else {
                                                  break L41;
                                                }
                                              }
                                            }
                                          }
                                          var17_int++;
                                          break L40;
                                        }
                                        if (var25 == 0) {
                                          continue L33;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (var25 == 0) {
                                break L30;
                              } else {
                                break L32;
                              }
                            }
                          }
                        }
                        this.field_B = new int[this.field_W][5];
                        var17_int = 0;
                        L42: while (true) {
                          if ((this.field_W ^ -1) >= (var17_int ^ -1)) {
                            break L30;
                          } else {
                            stackOut_83_0 = 0;
                            stackIn_91_0 = stackOut_83_0;
                            stackIn_84_0 = stackOut_83_0;
                            if (var25 != 0) {
                              break L29;
                            } else {
                              var18 = stackIn_84_0;
                              L43: while (true) {
                                L44: {
                                  L45: {
                                    if (var18 >= 5) {
                                      break L45;
                                    } else {
                                      this.field_B[var17_int][var18] = param11[0][var18];
                                      var18++;
                                      if (var25 != 0) {
                                        break L44;
                                      } else {
                                        if (var25 == 0) {
                                          continue L43;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  var17_int++;
                                  break L44;
                                }
                                if (var25 == 0) {
                                  continue L42;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_90_0 = param3.length ^ -1;
                      stackIn_91_0 = stackOut_90_0;
                      break L29;
                    }
                    stackOut_91_0 = stackIn_91_0;
                    stackOut_91_1 = -2;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    break L28;
                  }
                  L46: {
                    L47: {
                      L48: {
                        if (stackIn_92_0 == stackIn_92_1) {
                          break L48;
                        } else {
                          this.field_a = param3;
                          if (var25 == 0) {
                            break L47;
                          } else {
                            break L48;
                          }
                        }
                      }
                      this.field_a = new int[this.field_W][];
                      var17_int = 0;
                      L49: while (true) {
                        if (var17_int >= this.field_W) {
                          break L47;
                        } else {
                          this.field_a[var17_int] = param3[0];
                          var17_int++;
                          if (var25 != 0) {
                            break L46;
                          } else {
                            if (var25 == 0) {
                              continue L49;
                            } else {
                              break L47;
                            }
                          }
                        }
                      }
                    }
                    this.field_d = new int[16];
                    this.field_N = new int[16];
                    break L46;
                  }
                  var17_int = 0;
                  L50: while (true) {
                    L51: {
                      L52: {
                        if (var17_int >= 16) {
                          break L52;
                        } else {
                          this.field_N[var17_int] = -1;
                          var17_int++;
                          if (var25 != 0) {
                            break L51;
                          } else {
                            if (var25 == 0) {
                              continue L50;
                            } else {
                              break L52;
                            }
                          }
                        }
                      }
                      this.field_d[15] = 2;
                      this.field_d[12] = 30;
                      this.field_d[4] = 5;
                      this.field_d[10] = 500;
                      this.field_Y = new int[this.field_W];
                      this.field_M = new int[this.field_W];
                      this.field_g = new int[this.field_W];
                      this.field_h = new int[this.field_W];
                      this.field_d[14] = 2;
                      this.field_d[5] = 5;
                      this.field_d[8] = 5;
                      this.field_ob = new int[this.field_W];
                      this.field_d[7] = 3;
                      this.field_d[6] = 3;
                      this.field_d[11] = 30;
                      this.field_ub = new int[this.field_W];
                      this.field_d[0] = 1;
                      this.field_zb = new int[this.field_W];
                      this.field_y = new int[this.field_W];
                      this.field_d[13] = 10;
                      break L51;
                    }
                    var17_int = 0;
                    L53: while (true) {
                      L54: {
                        if ((var17_int ^ -1) <= (this.field_W ^ -1)) {
                          break L54;
                        } else {
                          this.field_ub[var17_int] = 0;
                          this.field_g[var17_int] = 0;
                          this.field_h[var17_int] = 0;
                          this.field_Y[var17_int] = 0;
                          this.field_zb[var17_int] = 0;
                          this.field_ob[var17_int] = 0;
                          this.field_M[var17_int] = 0;
                          this.field_y[var17_int] = 0;
                          var17_int++;
                          if (var25 != 0) {
                            break L26;
                          } else {
                            if (var25 == 0) {
                              continue L53;
                            } else {
                              break L54;
                            }
                          }
                        }
                      }
                      if (var25 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                }
              }
              this.field_a = new int[this.field_W][];
              if (0 > param4) {
                break L26;
              } else {
                if (param4 >= this.field_a.length) {
                  break L26;
                } else {
                  this.field_a[param4] = param3[0];
                  break L26;
                }
              }
            }
            var17_int = 0;
            L55: while (true) {
              L56: {
                L57: {
                  if ((var17_int ^ -1) <= (this.field_tb ^ -1)) {
                    break L57;
                  } else {
                    this.field_z[var17_int][0] = 0;
                    this.field_z[var17_int][1] = 0;
                    this.field_z[var17_int][2] = 0;
                    this.field_p[var17_int] = var17_int;
                    this.field_fb[var17_int] = 0;
                    var17_int++;
                    if (var25 != 0) {
                      break L56;
                    } else {
                      if (var25 == 0) {
                        continue L55;
                      } else {
                        break L57;
                      }
                    }
                  }
                }
                var17_int = 0;
                break L56;
              }
              L58: while (true) {
                stackOut_117_0 = this.field_W;
                stackOut_117_1 = var17_int;
                stackIn_118_0 = stackOut_117_0;
                stackIn_118_1 = stackOut_117_1;
                L59: while (true) {
                  L60: {
                    L61: {
                      if (stackIn_118_0 <= stackIn_118_1) {
                        break L61;
                      } else {
                        this.field_n[var17_int] = -1;
                        this.field_t[var17_int] = new at();
                        stackOut_119_0 = 0;
                        stackIn_220_0 = stackOut_119_0;
                        stackIn_120_0 = stackOut_119_0;
                        if (var25 != 0) {
                          break L60;
                        } else {
                          L62: {
                            L63: {
                              if (stackIn_120_0 == var17_int) {
                                break L63;
                              } else {
                                this.field_H[var17_int] = 200;
                                if (var25 == 0) {
                                  break L62;
                                } else {
                                  break L63;
                                }
                              }
                            }
                            this.field_H[var17_int] = 150;
                            break L62;
                          }
                          this.field_mb[var17_int] = 0;
                          var18 = 0;
                          L64: while (true) {
                            L65: {
                              L66: {
                                L67: {
                                  L68: {
                                    L69: {
                                      L70: {
                                        if ((var18 ^ -1) <= (this.field_E[var17_int].length ^ -1)) {
                                          break L70;
                                        } else {
                                          this.field_E[var17_int][var18] = 0;
                                          var18++;
                                          if (var25 != 0) {
                                            break L69;
                                          } else {
                                            if (var25 == 0) {
                                              continue L64;
                                            } else {
                                              break L70;
                                            }
                                          }
                                        }
                                      }
                                      if (this.field_b) {
                                        break L69;
                                      } else {
                                        if (var17_int != this.field_sb) {
                                          break L68;
                                        } else {
                                          break L69;
                                        }
                                      }
                                    }
                                    if (this.field_a[var17_int][4] != 0) {
                                      break L68;
                                    } else {
                                      if (0 != this.field_a[var17_int][5]) {
                                        break L68;
                                      } else {
                                        if (0 == this.field_a[var17_int][6]) {
                                          break L67;
                                        } else {
                                          break L68;
                                        }
                                      }
                                    }
                                  }
                                  L71: {
                                    if (this.field_L) {
                                      break L71;
                                    } else {
                                      var18 = 0;
                                      L72: while (true) {
                                        L73: {
                                          if ((var18 ^ -1) <= -4) {
                                            break L73;
                                          } else {
                                            this.field_c[var17_int][var18] = -1;
                                            var18++;
                                            if (var25 != 0) {
                                              break L65;
                                            } else {
                                              if (var25 == 0) {
                                                continue L72;
                                              } else {
                                                break L73;
                                              }
                                            }
                                          }
                                        }
                                        if (var25 == 0) {
                                          break L66;
                                        } else {
                                          break L71;
                                        }
                                      }
                                    }
                                  }
                                  var18 = 4;
                                  var19 = 4;
                                  L74: while (true) {
                                    L75: {
                                      L76: {
                                        if ((this.field_a[var17_int].length ^ -1) >= (var19 ^ -1)) {
                                          break L76;
                                        } else {
                                          stackOut_140_0 = this.field_a[var17_int][var19];
                                          stackIn_145_0 = stackOut_140_0;
                                          stackIn_141_0 = stackOut_140_0;
                                          if (var25 != 0) {
                                            break L75;
                                          } else {
                                            L77: {
                                              if (stackIn_141_0 == 0) {
                                                break L77;
                                              } else {
                                                var18++;
                                                break L77;
                                              }
                                            }
                                            var19++;
                                            if (var25 == 0) {
                                              continue L74;
                                            } else {
                                              break L76;
                                            }
                                          }
                                        }
                                      }
                                      array$11 = new int[var18];
                                      this.field_c[var17_int] = array$11;
                                      var19 = 0;
                                      stackOut_144_0 = 0;
                                      stackIn_145_0 = stackOut_144_0;
                                      break L75;
                                    }
                                    var20 = stackIn_145_0;
                                    L78: while (true) {
                                      L79: {
                                        if ((this.field_a[var17_int].length ^ -1) >= (var20 ^ -1)) {
                                          break L79;
                                        } else {
                                          stackOut_147_0 = 0;
                                          stackOut_147_1 = this.field_a[var17_int][var20];
                                          stackIn_118_0 = stackOut_147_0;
                                          stackIn_118_1 = stackOut_147_1;
                                          stackIn_148_0 = stackOut_147_0;
                                          stackIn_148_1 = stackOut_147_1;
                                          if (var25 != 0) {
                                            continue L59;
                                          } else {
                                            L80: {
                                              if (stackIn_148_0 == stackIn_148_1) {
                                                break L80;
                                              } else {
                                                incrementValue$12 = var19;
                                                var19++;
                                                this.field_c[var17_int][incrementValue$12] = var20;
                                                break L80;
                                              }
                                            }
                                            var20++;
                                            if (var25 == 0) {
                                              continue L78;
                                            } else {
                                              break L79;
                                            }
                                          }
                                        }
                                      }
                                      if (var25 == 0) {
                                        break L66;
                                      } else {
                                        break L67;
                                      }
                                    }
                                  }
                                }
                                var18 = 0;
                                L81: while (true) {
                                  if (-4 >= (var18 ^ -1)) {
                                    break L66;
                                  } else {
                                    this.field_c[var17_int][var18] = var18;
                                    this.field_E[var17_int][this.field_c[var17_int][var18]] = 1;
                                    var18++;
                                    if (var25 != 0) {
                                      break L65;
                                    } else {
                                      if (var25 == 0) {
                                        continue L81;
                                      } else {
                                        break L66;
                                      }
                                    }
                                  }
                                }
                              }
                              this.field_E[var17_int][6] = 1;
                              this.field_m[var17_int] = lf.field_i[this.field_Q];
                              var17_int++;
                              break L65;
                            }
                            if (var25 == 0) {
                              continue L58;
                            } else {
                              break L61;
                            }
                          }
                        }
                      }
                    }
                    L82: {
                      if (null == this.field_K) {
                        break L82;
                      } else {
                        L83: {
                          L84: {
                            var33 = this.field_K.a((byte) -46);
                            var28 = var33;
                            var17_array = var28;
                            if (var17_array == null) {
                              break L84;
                            } else {
                              this.field_tb = 0;
                              this.field_wb = true;
                              var18 = 0;
                              L85: while (true) {
                                L86: {
                                  L87: {
                                    if ((var18 ^ -1) <= (var33.length ^ -1)) {
                                      break L87;
                                    } else {
                                      stackOut_162_0 = var33[var18];
                                      stackOut_162_1 = this.field_tb;
                                      stackIn_168_0 = stackOut_162_0;
                                      stackIn_168_1 = stackOut_162_1;
                                      stackIn_163_0 = stackOut_162_0;
                                      stackIn_163_1 = stackOut_162_1;
                                      if (var25 != 0) {
                                        L88: while (true) {
                                          if (stackIn_168_0 <= stackIn_168_1) {
                                            break L84;
                                          } else {
                                            var19 = 0;
                                            var20 = 0;
                                            stackOut_169_0 = 0;
                                            stackIn_192_0 = stackOut_169_0;
                                            stackIn_170_0 = stackOut_169_0;
                                            if (var25 != 0) {
                                              break L83;
                                            } else {
                                              var21 = stackIn_170_0;
                                              L89: while (true) {
                                                L90: {
                                                  L91: {
                                                    if ((var21 ^ -1) <= (var33.length ^ -1)) {
                                                      break L91;
                                                    } else {
                                                      stackOut_172_0 = var33[var21];
                                                      stackOut_172_1 = var18;
                                                      stackIn_179_0 = stackOut_172_0;
                                                      stackIn_179_1 = stackOut_172_1;
                                                      stackIn_173_0 = stackOut_172_0;
                                                      stackIn_173_1 = stackOut_172_1;
                                                      if (var25 != 0) {
                                                        break L90;
                                                      } else {
                                                        L92: {
                                                          if (stackIn_173_0 != stackIn_173_1) {
                                                            break L92;
                                                          } else {
                                                            L93: {
                                                              if ((var21 ^ -1) != (this.field_K.field_w ^ -1)) {
                                                                break L93;
                                                              } else {
                                                                var19 = 1;
                                                                break L93;
                                                              }
                                                            }
                                                            var20++;
                                                            break L92;
                                                          }
                                                        }
                                                        var21++;
                                                        if (var25 == 0) {
                                                          continue L89;
                                                        } else {
                                                          break L91;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_178_0 = var20 ^ -1;
                                                  stackOut_178_1 = -1;
                                                  stackIn_179_0 = stackOut_178_0;
                                                  stackIn_179_1 = stackOut_178_1;
                                                  break L90;
                                                }
                                                if (stackIn_179_0 != stackIn_179_1) {
                                                  var34 = new int[var20];
                                                  var29 = var34;
                                                  var21_ref_int__ = var29;
                                                  var22 = 0;
                                                  var23 = 0;
                                                  L94: while (true) {
                                                    L95: {
                                                      if (var23 >= var33.length) {
                                                        break L95;
                                                      } else {
                                                        stackOut_183_0 = var33[var23];
                                                        stackOut_183_1 = var18;
                                                        stackIn_168_0 = stackOut_183_0;
                                                        stackIn_168_1 = stackOut_183_1;
                                                        stackIn_184_0 = stackOut_183_0;
                                                        stackIn_184_1 = stackOut_183_1;
                                                        if (var25 != 0) {
                                                          continue L88;
                                                        } else {
                                                          L96: {
                                                            if (stackIn_184_0 != stackIn_184_1) {
                                                              break L96;
                                                            } else {
                                                              incrementValue$13 = var22;
                                                              var22++;
                                                              var21_ref_int__[incrementValue$13] = var23;
                                                              this.field_yb[var23] = var18;
                                                              break L96;
                                                            }
                                                          }
                                                          var23++;
                                                          if (var25 == 0) {
                                                            continue L94;
                                                          } else {
                                                            break L95;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L97: {
                                                      if (var19 != 0) {
                                                        var23_ref_String = param1[this.field_K.field_w];
                                                        break L97;
                                                      } else {
                                                        var23_ref_String = param1[var34[0]];
                                                        break L97;
                                                      }
                                                    }
                                                    this.field_w[var18] = new go(var23_ref_String, var34);
                                                    var18++;
                                                    if (var25 == 0) {
                                                      stackOut_167_0 = var18 ^ -1;
                                                      stackOut_167_1 = this.field_tb ^ -1;
                                                      stackIn_168_0 = stackOut_167_0;
                                                      stackIn_168_1 = stackOut_167_1;
                                                      continue L88;
                                                    } else {
                                                      break L84;
                                                    }
                                                  }
                                                } else {
                                                  break L86;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        L98: {
                                          if (stackIn_163_0 <= stackIn_163_1) {
                                            break L98;
                                          } else {
                                            this.field_tb = var33[var18];
                                            break L98;
                                          }
                                        }
                                        var18++;
                                        if (var25 == 0) {
                                          continue L85;
                                        } else {
                                          break L87;
                                        }
                                      }
                                    }
                                  }
                                  this.field_tb = this.field_tb + 1;
                                  this.field_w = new go[this.field_tb];
                                  var18 = 0;
                                  L99: while (true) {
                                    stackOut_167_0 = var18 ^ -1;
                                    stackOut_167_1 = this.field_tb ^ -1;
                                    stackIn_168_0 = stackOut_167_0;
                                    stackIn_168_1 = stackOut_167_1;
                                    L100: while (true) {
                                      if (stackIn_168_0 <= stackIn_168_1) {
                                        break L84;
                                      } else {
                                        var19 = 0;
                                        var20 = 0;
                                        stackOut_169_0 = 0;
                                        stackIn_192_0 = stackOut_169_0;
                                        stackIn_170_0 = stackOut_169_0;
                                        if (var25 != 0) {
                                          break L83;
                                        } else {
                                          var21 = stackIn_170_0;
                                          L101: while (true) {
                                            L102: {
                                              L103: {
                                                if ((var21 ^ -1) <= (var33.length ^ -1)) {
                                                  break L103;
                                                } else {
                                                  stackOut_172_0 = var33[var21];
                                                  stackOut_172_1 = var18;
                                                  stackIn_179_0 = stackOut_172_0;
                                                  stackIn_179_1 = stackOut_172_1;
                                                  stackIn_173_0 = stackOut_172_0;
                                                  stackIn_173_1 = stackOut_172_1;
                                                  if (var25 != 0) {
                                                    break L102;
                                                  } else {
                                                    L104: {
                                                      if (stackIn_173_0 != stackIn_173_1) {
                                                        break L104;
                                                      } else {
                                                        L105: {
                                                          if ((var21 ^ -1) != (this.field_K.field_w ^ -1)) {
                                                            break L105;
                                                          } else {
                                                            var19 = 1;
                                                            break L105;
                                                          }
                                                        }
                                                        var20++;
                                                        break L104;
                                                      }
                                                    }
                                                    var21++;
                                                    if (var25 == 0) {
                                                      continue L101;
                                                    } else {
                                                      break L103;
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_178_0 = var20 ^ -1;
                                              stackOut_178_1 = -1;
                                              stackIn_179_0 = stackOut_178_0;
                                              stackIn_179_1 = stackOut_178_1;
                                              break L102;
                                            }
                                            if (stackIn_179_0 != stackIn_179_1) {
                                              var34 = new int[var20];
                                              var29 = var34;
                                              var21_ref_int__ = var29;
                                              var22 = 0;
                                              var23 = 0;
                                              L106: while (true) {
                                                L107: {
                                                  if (var23 >= var33.length) {
                                                    break L107;
                                                  } else {
                                                    stackOut_183_0 = var33[var23];
                                                    stackOut_183_1 = var18;
                                                    stackIn_168_0 = stackOut_183_0;
                                                    stackIn_168_1 = stackOut_183_1;
                                                    stackIn_184_0 = stackOut_183_0;
                                                    stackIn_184_1 = stackOut_183_1;
                                                    if (var25 != 0) {
                                                      continue L100;
                                                    } else {
                                                      L108: {
                                                        if (stackIn_184_0 != stackIn_184_1) {
                                                          break L108;
                                                        } else {
                                                          incrementValue$13 = var22;
                                                          var22++;
                                                          var21_ref_int__[incrementValue$13] = var23;
                                                          this.field_yb[var23] = var18;
                                                          break L108;
                                                        }
                                                      }
                                                      var23++;
                                                      if (var25 == 0) {
                                                        continue L106;
                                                      } else {
                                                        break L107;
                                                      }
                                                    }
                                                  }
                                                }
                                                L109: {
                                                  if (var19 != 0) {
                                                    var23_ref_String = param1[this.field_K.field_w];
                                                    break L109;
                                                  } else {
                                                    var23_ref_String = param1[var34[0]];
                                                    break L109;
                                                  }
                                                }
                                                this.field_w[var18] = new go(var23_ref_String, var34);
                                                var18++;
                                                if (var25 == 0) {
                                                  continue L99;
                                                } else {
                                                  break L84;
                                                }
                                              }
                                            } else {
                                              break L86;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                throw new IllegalStateException("");
                              }
                            }
                          }
                          stackOut_191_0 = 0;
                          stackIn_192_0 = stackOut_191_0;
                          break L83;
                        }
                        var18 = stackIn_192_0;
                        L110: while (true) {
                          L111: {
                            if ((var18 ^ -1) <= (this.field_W ^ -1)) {
                              break L111;
                            } else {
                              stackOut_194_0 = this.field_K.field_w ^ -1;
                              stackIn_220_0 = stackOut_194_0;
                              stackIn_195_0 = stackOut_194_0;
                              if (var25 != 0) {
                                break L60;
                              } else {
                                L112: {
                                  L113: {
                                    if (stackIn_195_0 != (var18 ^ -1)) {
                                      break L113;
                                    } else {
                                      this.field_c[var18] = new int[]{this.field_K.field_G.field_s};
                                      if (var25 == 0) {
                                        break L112;
                                      } else {
                                        break L113;
                                      }
                                    }
                                  }
                                  var30 = this.field_K.field_G.field_q[this.field_K.field_B[var18]];
                                  var20 = 0;
                                  var21 = 1;
                                  L114: while (true) {
                                    L115: {
                                      L116: {
                                        if ((var21 ^ -1) <= (this.field_a[var18].length ^ -1)) {
                                          break L116;
                                        } else {
                                          stackOut_199_0 = this.field_a[var18][var21];
                                          stackIn_204_0 = stackOut_199_0;
                                          stackIn_200_0 = stackOut_199_0;
                                          if (var25 != 0) {
                                            break L115;
                                          } else {
                                            L117: {
                                              if (stackIn_200_0 == 0) {
                                                break L117;
                                              } else {
                                                var20++;
                                                break L117;
                                              }
                                            }
                                            var21++;
                                            if (var25 == 0) {
                                              continue L114;
                                            } else {
                                              break L116;
                                            }
                                          }
                                        }
                                      }
                                      array$14 = new int[var20];
                                      this.field_c[var18] = array$14;
                                      var21 = 0;
                                      stackOut_203_0 = 0;
                                      stackIn_204_0 = stackOut_203_0;
                                      break L115;
                                    }
                                    var22 = stackIn_204_0;
                                    var23 = 1;
                                    L118: while (true) {
                                      L119: {
                                        L120: {
                                          if (var23 >= this.field_a[var18].length) {
                                            break L120;
                                          } else {
                                            var24 = var30.field_t[var23 - 1];
                                            stackOut_206_0 = this.field_a[var18][var23] ^ -1;
                                            stackOut_206_1 = -1;
                                            stackIn_215_0 = stackOut_206_0;
                                            stackIn_215_1 = stackOut_206_1;
                                            stackIn_207_0 = stackOut_206_0;
                                            stackIn_207_1 = stackOut_206_1;
                                            if (var25 != 0) {
                                              break L119;
                                            } else {
                                              L121: {
                                                L122: {
                                                  if (stackIn_207_0 != stackIn_207_1) {
                                                    break L122;
                                                  } else {
                                                    if (var22 >= var24) {
                                                      break L121;
                                                    } else {
                                                      var22 = var24;
                                                      if (var25 == 0) {
                                                        break L121;
                                                      } else {
                                                        break L122;
                                                      }
                                                    }
                                                  }
                                                }
                                                L123: {
                                                  this.field_E[var18][-1 + var23] = var24;
                                                  if ((this.field_E[var18][-1 + var23] ^ -1) >= (this.field_E[var18][0] ^ -1)) {
                                                    break L123;
                                                  } else {
                                                    this.field_E[var18][0] = this.field_E[var18][var23 + -1];
                                                    break L123;
                                                  }
                                                }
                                                incrementValue$15 = var21;
                                                var21++;
                                                this.field_c[var18][incrementValue$15] = var23 - 1;
                                                break L121;
                                              }
                                              var23++;
                                              if (var25 == 0) {
                                                continue L118;
                                              } else {
                                                break L120;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_214_0 = var22 ^ -1;
                                        stackOut_214_1 = -1;
                                        stackIn_215_0 = stackOut_214_0;
                                        stackIn_215_1 = stackOut_214_1;
                                        break L119;
                                      }
                                      if (stackIn_215_0 >= stackIn_215_1) {
                                        break L112;
                                      } else {
                                        this.field_E[var18][6] = var22;
                                        break L112;
                                      }
                                    }
                                  }
                                }
                                var18++;
                                if (var25 == 0) {
                                  continue L110;
                                } else {
                                  break L111;
                                }
                              }
                            }
                          }
                          this.field_Cb = true;
                          this.field_D = 3;
                          break L82;
                        }
                      }
                    }
                    stackOut_219_0 = this.field_b;
                    stackIn_220_0 = stackOut_219_0 ? 1 : 0;
                    break L60;
                  }
                  L124: {
                    if (stackIn_220_0 == 0) {
                      break L124;
                    } else {
                      this.field_jb = ns.a(false, 2147483647, li.field_n);
                      this.l(0, 0);
                      break L124;
                    }
                  }
                  this.field_O = this.b((byte) 32);
                  this.f(-2);
                  this.field_xb = this.f((byte) -80);
                  this.field_F = false;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L125: {
            var17 = decompiledCaughtException;
            stackOut_224_0 = (RuntimeException) (var17);
            stackOut_224_1 = new StringBuilder().append("ha.<init>(").append(param0).append(',');
            stackIn_226_0 = stackOut_224_0;
            stackIn_226_1 = stackOut_224_1;
            stackIn_225_0 = stackOut_224_0;
            stackIn_225_1 = stackOut_224_1;
            if (param1 == null) {
              stackOut_226_0 = (RuntimeException) ((Object) stackIn_226_0);
              stackOut_226_1 = (StringBuilder) ((Object) stackIn_226_1);
              stackOut_226_2 = "null";
              stackIn_227_0 = stackOut_226_0;
              stackIn_227_1 = stackOut_226_1;
              stackIn_227_2 = stackOut_226_2;
              break L125;
            } else {
              stackOut_225_0 = (RuntimeException) ((Object) stackIn_225_0);
              stackOut_225_1 = (StringBuilder) ((Object) stackIn_225_1);
              stackOut_225_2 = "{...}";
              stackIn_227_0 = stackOut_225_0;
              stackIn_227_1 = stackOut_225_1;
              stackIn_227_2 = stackOut_225_2;
              break L125;
            }
          }
          L126: {
            stackOut_227_0 = (RuntimeException) ((Object) stackIn_227_0);
            stackOut_227_1 = ((StringBuilder) (Object) stackIn_227_1).append(stackIn_227_2).append(',').append(param2).append(',');
            stackIn_229_0 = stackOut_227_0;
            stackIn_229_1 = stackOut_227_1;
            stackIn_228_0 = stackOut_227_0;
            stackIn_228_1 = stackOut_227_1;
            if (param3 == null) {
              stackOut_229_0 = (RuntimeException) ((Object) stackIn_229_0);
              stackOut_229_1 = (StringBuilder) ((Object) stackIn_229_1);
              stackOut_229_2 = "null";
              stackIn_230_0 = stackOut_229_0;
              stackIn_230_1 = stackOut_229_1;
              stackIn_230_2 = stackOut_229_2;
              break L126;
            } else {
              stackOut_228_0 = (RuntimeException) ((Object) stackIn_228_0);
              stackOut_228_1 = (StringBuilder) ((Object) stackIn_228_1);
              stackOut_228_2 = "{...}";
              stackIn_230_0 = stackOut_228_0;
              stackIn_230_1 = stackOut_228_1;
              stackIn_230_2 = stackOut_228_2;
              break L126;
            }
          }
          L127: {
            stackOut_230_0 = (RuntimeException) ((Object) stackIn_230_0);
            stackOut_230_1 = ((StringBuilder) (Object) stackIn_230_1).append(stackIn_230_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            stackIn_232_0 = stackOut_230_0;
            stackIn_232_1 = stackOut_230_1;
            stackIn_231_0 = stackOut_230_0;
            stackIn_231_1 = stackOut_230_1;
            if (param11 == null) {
              stackOut_232_0 = (RuntimeException) ((Object) stackIn_232_0);
              stackOut_232_1 = (StringBuilder) ((Object) stackIn_232_1);
              stackOut_232_2 = "null";
              stackIn_233_0 = stackOut_232_0;
              stackIn_233_1 = stackOut_232_1;
              stackIn_233_2 = stackOut_232_2;
              break L127;
            } else {
              stackOut_231_0 = (RuntimeException) ((Object) stackIn_231_0);
              stackOut_231_1 = (StringBuilder) ((Object) stackIn_231_1);
              stackOut_231_2 = "{...}";
              stackIn_233_0 = stackOut_231_0;
              stackIn_233_1 = stackOut_231_1;
              stackIn_233_2 = stackOut_231_2;
              break L127;
            }
          }
          L128: {
            stackOut_233_0 = (RuntimeException) ((Object) stackIn_233_0);
            stackOut_233_1 = ((StringBuilder) (Object) stackIn_233_1).append(stackIn_233_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
            stackIn_235_0 = stackOut_233_0;
            stackIn_235_1 = stackOut_233_1;
            stackIn_234_0 = stackOut_233_0;
            stackIn_234_1 = stackOut_233_1;
            if (param15 == null) {
              stackOut_235_0 = (RuntimeException) ((Object) stackIn_235_0);
              stackOut_235_1 = (StringBuilder) ((Object) stackIn_235_1);
              stackOut_235_2 = "null";
              stackIn_236_0 = stackOut_235_0;
              stackIn_236_1 = stackOut_235_1;
              stackIn_236_2 = stackOut_235_2;
              break L128;
            } else {
              stackOut_234_0 = (RuntimeException) ((Object) stackIn_234_0);
              stackOut_234_1 = (StringBuilder) ((Object) stackIn_234_1);
              stackOut_234_2 = "{...}";
              stackIn_236_0 = stackOut_234_0;
              stackIn_236_1 = stackOut_234_1;
              stackIn_236_2 = stackOut_234_2;
              break L128;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_236_0), stackIn_236_2 + ')');
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            param2 = ia.a(param2, '_', 3, "");
            if (param1 == -26) {
              L1: {
                L2: {
                  var3 = nf.a(true, param2);
                  if ((param0.indexOf(param2) ^ -1) != 0) {
                    break L2;
                  } else {
                    if (0 == (param0.indexOf(var3) ^ -1)) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("ha.ID(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_q = "AnimationEvent";
        field_nb = "Loading graphics";
        field_pb = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
