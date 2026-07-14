/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qr extends hm {
    static nk[] field_A;
    int field_I;
    private int field_E;
    boolean field_s;
    private int field_X;
    int field_N;
    bi field_Z;
    private int field_D;
    int field_x;
    int field_V;
    bi field_ob;
    int field_w;
    int field_kb;
    int field_t;
    int field_hb;
    int field_y;
    bi field_pb;
    int field_ub;
    int field_Y;
    private int field_tb;
    boolean field_r;
    int field_G;
    bi field_U;
    nq field_nb;
    int field_T;
    bi[] field_lb;
    bi field_fb;
    pf field_M;
    bi[] field_vb;
    int field_J;
    int field_W;
    String field_u;
    int field_jb;
    int field_gb;
    int field_rb;
    private int field_O;
    private boolean field_ib;
    private boolean field_H;
    private int field_cb;
    private int field_S;
    bi[] field_wb;
    int field_qb;
    int field_K;
    bi[] field_F;
    boolean field_P;
    bi[] field_sb;
    int field_B;
    int field_Q;
    static String field_R;
    private int field_eb;
    boolean field_bb;
    private boolean field_C;
    boolean field_v;
    String field_z;
    int field_db;
    int field_mb;
    int field_ab;
    boolean field_L;

    final static String a(String param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = ShatteredPlansClient.field_F ? 1 : 0;
          var4 = param0.length();
          if (param1 < -15) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        var5 = param3.length();
        var6 = param2.length();
        if (-1 == (var5 ^ -1)) {
          throw new IllegalArgumentException("Key cannot have zero length");
        } else {
          L1: {
            var7 = var4;
            var8 = -var5 + var6;
            if (0 != var8) {
              var9_int = 0;
              L2: while (true) {
                var9_int = param0.indexOf(param3, var9_int);
                if (var9_int < 0) {
                  break L1;
                } else {
                  var7 = var7 + var8;
                  var9_int = var9_int + var5;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          L3: while (true) {
            var11 = param0.indexOf(param3, var10);
            if ((var11 ^ -1) > -1) {
              StringBuilder discarded$3 = var9.append(param0.substring(var10));
              return var9.toString();
            } else {
              StringBuilder discarded$4 = var9.append(param0.substring(var10, var11));
              StringBuilder discarded$5 = var9.append(param2);
              var10 = var11 - -var5;
              continue L3;
            }
          }
        }
    }

    final static dc a(int param0, int param1, String[] param2, vr param3, int param4, int param5) {
        try {
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            jn var10 = null;
            int var10_int = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            dc var15 = null;
            hs var16 = null;
            vl var17 = null;
            pc var18 = null;
            dc stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            dc stackOut_15_0 = null;
            L0: {
              var14 = ShatteredPlansClient.field_F ? 1 : 0;
              var15 = new dc(param0, param3, param4, param2);
              var7 = param2.length;
              var8 = var7 * md.field_J[param5];
              if (param1 == 50) {
                break L0;
              } else {
                qr.a(false, (byte) 41);
                break L0;
              }
            }
            var9 = 0;
            L1: while (true) {
              if (50 > var9) {
                try {
                  L2: {
                    L3: {
                      var10_int = lr.a((byte) 27);
                      var11 = var8 * 100 / 45;
                      var12 = (int)Math.sqrt((double)var11);
                      var13 = param4;
                      if (var13 != 0) {
                        if ((var13 ^ -1) == -3) {
                          break L3;
                        } else {
                          if (1 == var13) {
                            var17 = new vl(var10_int, var15.field_v.length);
                            var15.field_g = var17.a((byte) -128);
                            break L2;
                          } else {
                            if ((var13 ^ -1) != -4) {
                              throw new RuntimeException("Cannot generate map for unknown gametype " + param4);
                            } else {
                              var18 = new pc(var12, var12, var10_int, var8, var15.field_v.length);
                              var15.field_g = var18.a((byte) -127);
                              break L2;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    var16 = new hs(var12, var12, var10_int, var8, var15.field_v.length);
                    var15.field_g = var16.a((byte) -126);
                    break L2;
                  }
                  var15.field_g.a(var15.field_v, param3, param1 + -46);
                  var15.e(param1 + -50);
                  var15.b(param1 + -151);
                  stackOut_15_0 = (dc) var15;
                  stackIn_16_0 = stackOut_15_0;
                } catch (jn decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_16_0;
                }
                continue L1;
              } else {
                return null;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, byte param1) {
        int var4_int = 0;
        qr var4 = null;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = 0;
        if (null != ((qr) this).field_z) {
            if (((qr) this).field_nb != null) {
                var4_int = ((qr) this).field_nb.c(((qr) this).field_z, param0);
                if (var4_int > var3) {
                    var3 = var4_int;
                }
            }
        }
        if (null != ((qr) this).field_pb) {
            var4_int = ((qr) this).field_pb.field_o;
            if (var4_int > var3) {
                var3 = var4_int;
            }
        }
        if (param1 >= -56) {
            this.a(false, false, true, 31, 106, -74, false, -100, false, false, -72);
        }
        if (!(null == ((qr) this).field_M)) {
            var4 = (qr) (Object) ((qr) this).field_M.d(0);
            while (var4 != null) {
                var5 = var4.field_hb + var4.field_K;
                if (!(var3 >= var5)) {
                    var3 = var5;
                }
                var4 = (qr) (Object) ((qr) this).field_M.a((byte) -71);
            }
        }
        return var3;
    }

    final void a(int param0, qr param1) {
        L0: {
          if (null == ((qr) this).field_M) {
            ((qr) this).field_M = new pf();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 4) {
          return;
        } else {
          ((qr) this).field_M.a((byte) -113, (oh) (Object) param1);
          return;
        }
    }

    final void a(int param0, qr param1, qr param2, byte param3) {
        if (param1 != null) {
            param2.field_db = param1.field_mb + (param1.field_db - -param0);
            param2.field_w = param1.field_w - -param1.field_gb;
        } else {
            param2.field_w = 0;
            param2.field_db = 0;
        }
        if (param3 < 38) {
            ((qr) this).field_s = false;
        }
    }

    final void b(boolean param0, int param1) {
        this.a(false, true, false, 0, 0, -2147483648, false, gf.field_k, false, param0, gf.field_b);
        int var3 = 114 % ((param1 - 25) / 62);
    }

    final static void a(boolean param0, byte param1) {
        jb.a(param0, (byte) -27);
        if (param1 <= 107) {
            Object var3 = null;
            dc discarded$0 = qr.a(46, -4, (String[]) null, (vr) null, -66, -4);
        }
        mj.a(0, param0);
    }

    final void a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qr var10_ref_qr = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          var5 = -((qr) this).field_db;
          var6 = var5 + -((qr) this).field_w;
          var7 = ((qr) this).field_mb;
          var8 = var7 - -((qr) this).field_gb;
          if (param2) {
            break L0;
          } else {
            var9 = 0;
            var10_ref_qr = (qr) (Object) ((qr) this).field_M.d(0);
            L1: while (true) {
              if (var10_ref_qr == null) {
                var8 = -param3 + var9;
                break L0;
              } else {
                var10_ref_qr.field_w = -var10_ref_qr.field_db + var9;
                var9 = var9 + (var10_ref_qr.field_mb - -var10_ref_qr.field_gb - -param3);
                var10_ref_qr = (qr) (Object) ((qr) this).field_M.a((byte) -71);
                continue L1;
              }
            }
          }
        }
        var9 = var8 - param0;
        if (!param1) {
          return;
        } else {
          L2: {
            if (var6 <= var9) {
              break L2;
            } else {
              var6 = var9;
              break L2;
            }
          }
          L3: {
            if ((var6 ^ -1) > -1) {
              var6 = 0;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            var10 = -param0 + var7;
            if (var5 > var10) {
              var5 = var10;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (-1 >= (var5 ^ -1)) {
              break L5;
            } else {
              var5 = 0;
              break L5;
            }
          }
          ((qr) this).field_mb = var7;
          ((qr) this).field_w = var5 + -var6;
          ((qr) this).field_db = -var5;
          ((qr) this).field_gb = -var7 + var8;
          return;
        }
    }

    final void e(byte param0) {
        qr var4 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(((qr) this).field_M == null)) {
            var4 = (qr) (Object) ((qr) this).field_M.f(3725);
            while (var4 != null) {
                var4.field_H = true;
                var4.e((byte) -123);
                var4 = (qr) (Object) var4.field_M.b(-125);
            }
        }
        if (param0 >= -122) {
            ((qr) this).field_pb = null;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        qr var14_ref = null;
        int var15 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var14 = null;
          var15 = ShatteredPlansClient.field_F ? 1 : 0;
          if (0 >= ((qr) this).field_cb) {
            var7 = ((qr) this).field_cb >> -713030942;
            break L0;
          } else {
            var7 = -(-((qr) this).field_cb >> -1856382302);
            break L0;
          }
        }
        L1: {
          ((qr) this).field_cb = ((qr) this).field_cb - var7;
          ((qr) this).field_hb = ((qr) this).field_hb + var7;
          if ((((qr) this).field_w ^ -1) < -1) {
            var7 = -(-((qr) this).field_w >> -695197470);
            break L1;
          } else {
            var7 = ((qr) this).field_w >> 1441558562;
            break L1;
          }
        }
        L2: {
          ((qr) this).field_db = ((qr) this).field_db + var7;
          ((qr) this).field_w = ((qr) this).field_w - var7;
          var8 = 92 / ((-17 - param4) / 43);
          if (0 < ((qr) this).field_S) {
            var7 = -(-((qr) this).field_S >> -1573206430);
            break L2;
          } else {
            var7 = ((qr) this).field_S >> 1086523490;
            break L2;
          }
        }
        L3: {
          ((qr) this).field_K = ((qr) this).field_K + var7;
          ((qr) this).field_S = ((qr) this).field_S - var7;
          if (0 < ((qr) this).field_gb) {
            var7 = -(-((qr) this).field_gb >> 1184728578);
            break L3;
          } else {
            var7 = ((qr) this).field_gb >> -1535081822;
            break L3;
          }
        }
        L4: {
          L5: {
            ((qr) this).field_gb = ((qr) this).field_gb - var7;
            param3 = param3 & ((qr) this).field_s;
            ((qr) this).field_B = param0 + ((qr) this).field_hb;
            ((qr) this).field_mb = ((qr) this).field_mb + var7;
            ((qr) this).field_N = ((qr) this).field_db + param1;
            var9 = gf.field_i;
            var10 = gf.field_a;
            var11 = gf.field_l;
            var12 = gf.field_f;
            gf.i(((qr) this).field_B, ((qr) this).field_N, ((qr) this).field_B - -((qr) this).field_K, ((qr) this).field_N - -((qr) this).field_mb);
            var13 = 0;
            if (us.field_c) {
              break L5;
            } else {
              if (!param3) {
                break L5;
              } else {
                if (je.field_d == 0) {
                  break L5;
                } else {
                  if (gf.field_i > nh.field_p) {
                    break L5;
                  } else {
                    if (gf.field_l <= nh.field_p) {
                      break L5;
                    } else {
                      if (td.field_P < gf.field_a) {
                        break L5;
                      } else {
                        if (td.field_P >= gf.field_f) {
                          break L5;
                        } else {
                          ((qr) this).field_Q = -((qr) this).field_B + nh.field_p;
                          var13 = 1;
                          ((qr) this).field_X = -((qr) this).field_N + td.field_P;
                          ((qr) this).field_rb = je.field_d;
                          ((qr) this).field_ub = je.field_d;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L6: {
            if (je.field_d != 0) {
              ((qr) this).field_ub = 0;
              break L6;
            } else {
              break L6;
            }
          }
          ((qr) this).field_rb = 0;
          break L4;
        }
        L7: {
          if (-1 == (rf.field_n ^ -1)) {
            ((qr) this).field_ub = 0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          L9: {
            stackOut_27_0 = this;
            stackIn_33_0 = stackOut_27_0;
            stackIn_28_0 = stackOut_27_0;
            if (pa.field_j) {
              break L9;
            } else {
              stackOut_28_0 = this;
              stackIn_33_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (gf.field_i > pd.field_k) {
                break L9;
              } else {
                stackOut_29_0 = this;
                stackIn_33_0 = stackOut_29_0;
                stackIn_30_0 = stackOut_29_0;
                if (gf.field_l <= pd.field_k) {
                  break L9;
                } else {
                  stackOut_30_0 = this;
                  stackIn_33_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (gf.field_a > bb.field_b) {
                    break L9;
                  } else {
                    stackOut_31_0 = this;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (gf.field_f <= bb.field_b) {
                      break L9;
                    } else {
                      stackOut_32_0 = this;
                      stackOut_32_1 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      break L8;
                    }
                  }
                }
              }
            }
          }
          stackOut_33_0 = this;
          stackOut_33_1 = 0;
          stackIn_34_0 = stackOut_33_0;
          stackIn_34_1 = stackOut_33_1;
          break L8;
        }
        L10: {
          L11: {
            ((qr) this).field_v = stackIn_34_1 != 0;
            stackOut_34_0 = this;
            stackIn_38_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if (!((qr) this).field_v) {
              break L11;
            } else {
              stackOut_35_0 = this;
              stackIn_38_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (((qr) this).field_ub != rf.field_n) {
                break L11;
              } else {
                stackOut_36_0 = this;
                stackIn_38_0 = stackOut_36_0;
                stackIn_37_0 = stackOut_36_0;
                if (!param3) {
                  break L11;
                } else {
                  stackOut_37_0 = this;
                  stackOut_37_1 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  break L10;
                }
              }
            }
          }
          stackOut_38_0 = this;
          stackOut_38_1 = 0;
          stackIn_39_0 = stackOut_38_0;
          stackIn_39_1 = stackOut_38_1;
          break L10;
        }
        L12: {
          ((qr) this).field_L = stackIn_39_1 != 0;
          if (null != ((qr) this).field_M) {
            var14_ref = (qr) (Object) ((qr) this).field_M.f(3725);
            L13: while (true) {
              if (var14_ref == null) {
                break L12;
              } else {
                var14_ref.a(var14_ref.field_B, var14_ref.field_N, var14_ref.field_K, param3, -93, var14_ref.field_mb);
                var14_ref = (qr) (Object) var14_ref.field_M.b(-125);
                continue L13;
              }
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (var14_ref.field_v) {
            pa.field_j = true;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          if (var13 != 0) {
            us.field_c = true;
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          gf.d(var9, var10, var11, var12);
          if (var14_ref.field_ub == 0) {
            break L16;
          } else {
            if (var14_ref.field_P) {
              L17: {
                ((qr) this).field_db = -param1 + (bb.field_b - var14_ref.field_X);
                ((qr) this).field_hb = -param0 + -var14_ref.field_Q + pd.field_k;
                if (var14_ref.field_hb >= 0) {
                  break L17;
                } else {
                  ((qr) this).field_hb = 0;
                  break L17;
                }
              }
              L18: {
                if (var14_ref.field_hb <= param2 - var14_ref.field_K) {
                  break L18;
                } else {
                  ((qr) this).field_hb = -var14_ref.field_K + param2;
                  break L18;
                }
              }
              L19: {
                if (var14_ref.field_db < 0) {
                  ((qr) this).field_db = 0;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                ((qr) this).field_cb = 0;
                if (var14_ref.field_db <= -var14_ref.field_mb + param5) {
                  break L20;
                } else {
                  ((qr) this).field_db = param5 - var14_ref.field_mb;
                  break L20;
                }
              }
              ((qr) this).field_B = param0 - -var14_ref.field_hb;
              ((qr) this).field_w = 0;
              ((qr) this).field_N = param1 + var14_ref.field_db;
              break L16;
            } else {
              break L16;
            }
          }
        }
    }

    final static void f(int param0) {
        ha.field_a = null;
        if (param0 > -40) {
            field_R = null;
        }
        rm.field_a = null;
    }

    final void a(qr param0, boolean param1) {
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        Object stackIn_100_0 = null;
        Object stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        Object stackOut_97_0 = null;
        Object stackOut_98_0 = null;
        Object stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            L1: {
              if (null != param0.field_z) {
                ((qr) this).field_z = param0.field_z;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0.field_r) {
                break L2;
              } else {
                ((qr) this).field_r = param0.field_r;
                break L2;
              }
            }
            L3: {
              if (null != param0.field_Z) {
                ((qr) this).field_Z = param0.field_Z;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param0.field_s) {
                ((qr) this).field_s = param0.field_s;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0.field_bb) {
                ((qr) this).field_bb = param0.field_bb;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 == (param0.field_kb ^ -1)) {
                break L6;
              } else {
                ((qr) this).field_kb = param0.field_kb;
                break L6;
              }
            }
            L7: {
              if (param0.field_lb != null) {
                ((qr) this).field_lb = param0.field_lb;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param0.field_wb != null) {
                ((qr) this).field_wb = param0.field_wb;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param0.field_H) {
                ((qr) this).field_H = param0.field_H;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if ((param0.field_I ^ -1) != -257) {
                ((qr) this).field_I = param0.field_I;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param0.field_qb >= 0) {
                ((qr) this).field_qb = param0.field_qb;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if ((param0.field_jb ^ -1) <= -1) {
                ((qr) this).field_jb = param0.field_jb;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (param0.field_C) {
                ((qr) this).field_C = param0.field_C;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (null != param0.field_u) {
                ((qr) this).field_u = param0.field_u;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (null != param0.field_ob) {
                ((qr) this).field_ob = param0.field_ob;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (-1 >= (param0.field_W ^ -1)) {
                ((qr) this).field_W = param0.field_W;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if ((param0.field_ab ^ -1) <= -1) {
                ((qr) this).field_ab = param0.field_ab;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (null == param0.field_vb) {
                break L18;
              } else {
                ((qr) this).field_vb = param0.field_vb;
                break L18;
              }
            }
            L19: {
              if (null != param0.field_F) {
                ((qr) this).field_F = param0.field_F;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (null != param0.field_pb) {
                ((qr) this).field_pb = param0.field_pb;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (param0.field_fb == null) {
                break L21;
              } else {
                ((qr) this).field_fb = param0.field_fb;
                break L21;
              }
            }
            L22: {
              if (param0.field_Y == 0) {
                break L22;
              } else {
                ((qr) this).field_Y = param0.field_Y;
                break L22;
              }
            }
            L23: {
              if (param0.field_U != null) {
                ((qr) this).field_U = param0.field_U;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (0 == param0.field_x) {
                break L24;
              } else {
                ((qr) this).field_x = param0.field_x;
                break L24;
              }
            }
            L25: {
              if (null == param0.field_nb) {
                break L25;
              } else {
                ((qr) this).field_nb = param0.field_nb;
                break L25;
              }
            }
            L26: {
              if (null == param0.field_sb) {
                break L26;
              } else {
                ((qr) this).field_sb = param0.field_sb;
                break L26;
              }
            }
            L27: {
              if (2147483647 == (param0.field_V ^ -1)) {
                break L27;
              } else {
                ((qr) this).field_V = param0.field_V;
                break L27;
              }
            }
            L28: {
              if (-2147483648 == param0.field_T) {
                break L28;
              } else {
                ((qr) this).field_T = param0.field_T;
                break L28;
              }
            }
            L29: {
              if (0 == param0.field_y) {
                break L29;
              } else {
                ((qr) this).field_y = param0.field_y;
                break L29;
              }
            }
            L30: {
              if (param0.field_t == -2147483648) {
                break L30;
              } else {
                ((qr) this).field_t = param0.field_t;
                break L30;
              }
            }
            L31: {
              if (-2147483648 != param0.field_O) {
                ((qr) this).field_O = param0.field_O;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if (-1 != (param0.field_E ^ -1)) {
                ((qr) this).field_E = param0.field_E;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (0 == param0.field_tb) {
                break L33;
              } else {
                ((qr) this).field_tb = param0.field_tb;
                break L33;
              }
            }
            L34: {
              if (!param0.field_P) {
                break L34;
              } else {
                ((qr) this).field_P = param0.field_P;
                break L34;
              }
            }
            L35: {
              if (0 != param0.field_G) {
                ((qr) this).field_G = param0.field_G;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if ((param0.field_J ^ -1) == 2147483647) {
                break L36;
              } else {
                ((qr) this).field_J = param0.field_J;
                break L36;
              }
            }
            L37: {
              if ((param0.field_D ^ -1) != 2147483647) {
                ((qr) this).field_D = param0.field_D;
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              L39: {
                stackOut_97_0 = this;
                stackIn_100_0 = stackOut_97_0;
                stackIn_98_0 = stackOut_97_0;
                if (!((qr) this).field_C) {
                  break L39;
                } else {
                  stackOut_98_0 = this;
                  stackIn_100_0 = stackOut_98_0;
                  stackIn_99_0 = stackOut_98_0;
                  if (!param0.field_ib) {
                    break L39;
                  } else {
                    stackOut_99_0 = this;
                    stackOut_99_1 = 1;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_101_1 = stackOut_99_1;
                    break L38;
                  }
                }
              }
              stackOut_100_0 = this;
              stackOut_100_1 = 0;
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              break L38;
            }
            ((qr) this).field_ib = stackIn_101_1 != 0;
            break L0;
          }
        }
        L40: {
          if (!param1) {
            break L40;
          } else {
            ((qr) this).a(true, -124);
            break L40;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        ((qr) this).field_db = param3;
        ((qr) this).field_hb = param4;
        if (param2 <= 38) {
            ((qr) this).field_F = null;
        }
        ((qr) this).field_gb = 0;
        ((qr) this).field_cb = 0;
        ((qr) this).field_w = 0;
        ((qr) this).field_K = param0;
        ((qr) this).field_mb = param1;
        ((qr) this).field_S = 0;
    }

    final static void a(int[] param0, byte[] param1, byte[] param2, String[][] param3, String[] param4, int param5, String[][] param6, bc param7, bc param8, int param9, bc param10, bi[][] param11, int param12, boolean param13, bi[][] param14) {
        int var15 = 87 / ((40 - param12) / 61);
        Object var17 = null;
        Object var16 = null;
        ga.a((nk[]) null, param5, param10, (int[]) null, param11, param4, param9, param7, param1, param3, param8, param2, param13, param6, 16384, param0, param14);
    }

    qr(long param0, qr param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final int e(boolean param0) {
        if (param0) {
            ((qr) this).a(55, true, true, 26);
        }
        return ((qr) this).a(2147483647, (byte) -93);
    }

    final void a(boolean param0, int param1) {
        us.field_c = !param0 ? true : false;
        pa.field_j = !param0 ? true : false;
        if (param1 != -20429) {
            ((qr) this).field_z = null;
        }
        this.a(0, 0, gf.field_b, true, -98, gf.field_k);
    }

    private final void a(boolean param0, boolean param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        bi[] var16 = null;
        bi var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        qr var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var23 = null;
          var25 = ShatteredPlansClient.field_F ? 1 : 0;
          ((qr) this).field_B = param3 + ((qr) this).field_hb;
          ((qr) this).field_N = param4 - -((qr) this).field_db;
          var12 = gf.field_i;
          var13 = gf.field_a;
          var14 = gf.field_l;
          var15 = gf.field_f;
          gf.i(((qr) this).field_B, ((qr) this).field_N, ((qr) this).field_B - -((qr) this).field_K, ((qr) this).field_mb + ((qr) this).field_N);
          param1 = param1 & ((qr) this).field_s;
          if (param5 == -2147483648) {
            break L0;
          } else {
            qr.a((int[]) null, (byte[]) null, (byte[]) null, (String[][]) null, (String[]) null, 117, (String[][]) null, (bc) null, (bc) null, 119, (bc) null, (bi[][]) null, 82, false, (bi[][]) null);
            break L0;
          }
        }
        L1: {
          if (!((qr) this).field_H) {
            L2: {
              param6 = ((qr) this).field_bb;
              param8 = ((qr) this).field_L;
              if (((qr) this).field_ub == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            param2 = stackIn_7_0 != 0;
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          var16 = ((qr) this).field_F;
          var17 = ((qr) this).field_pb;
          var18 = ((qr) this).field_x;
          var19 = 0;
          if (!param1) {
            L4: {
              if (((qr) this).field_ob == null) {
                break L4;
              } else {
                var17 = ((qr) this).field_ob;
                break L4;
              }
            }
            L5: {
              if ((((qr) this).field_W ^ -1) > -1) {
                break L5;
              } else {
                var18 = ((qr) this).field_W;
                break L5;
              }
            }
            if (((qr) this).field_wb != null) {
              var16 = ((qr) this).field_wb;
              break L3;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L6: {
          var20 = 0;
          if (param8) {
            L7: {
              if (((qr) this).field_D != -2147483648) {
                var19 = ((qr) this).field_D;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null != ((qr) this).field_fb) {
                var17 = ((qr) this).field_fb;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((qr) this).field_lb != null) {
                var16 = ((qr) this).field_lb;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (((qr) this).field_jb >= 0) {
                var18 = ((qr) this).field_jb;
                break L10;
              } else {
                break L10;
              }
            }
            if (-2147483648 == ((qr) this).field_O) {
              break L6;
            } else {
              var20 = ((qr) this).field_O;
              break L6;
            }
          } else {
            break L6;
          }
        }
        L11: {
          if (param2) {
            L12: {
              if (0 <= ((qr) this).field_qb) {
                var18 = ((qr) this).field_qb;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (null != ((qr) this).field_vb) {
                var16 = ((qr) this).field_vb;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (((qr) this).field_U != null) {
                var17 = ((qr) this).field_U;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (((qr) this).field_t == -2147483648) {
                break L15;
              } else {
                var19 = ((qr) this).field_t;
                break L15;
              }
            }
            if (((qr) this).field_J != 2147483647) {
              var20 = ((qr) this).field_J;
              break L11;
            } else {
              break L11;
            }
          } else {
            break L11;
          }
        }
        L16: {
          if (!param6) {
            break L16;
          } else {
            L17: {
              if (2147483647 == ((qr) this).field_V) {
                break L17;
              } else {
                var19 = ((qr) this).field_V;
                break L17;
              }
            }
            L18: {
              if ((((qr) this).field_T ^ -1) != 2147483647) {
                var20 = ((qr) this).field_T;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (null == ((qr) this).field_sb) {
                break L19;
              } else {
                var16 = ((qr) this).field_sb;
                break L19;
              }
            }
            L20: {
              if (null == ((qr) this).field_Z) {
                break L20;
              } else {
                var17 = ((qr) this).field_Z;
                break L20;
              }
            }
            if ((((qr) this).field_ab ^ -1) > -1) {
              break L16;
            } else {
              var18 = ((qr) this).field_ab;
              break L16;
            }
          }
        }
        L21: {
          var21 = ((qr) this).field_E + var19;
          var22 = ((qr) this).field_tb + var20;
          if (((qr) this).field_r) {
            em.a(param7, param10, 7, param4, var16, param3);
            break L21;
          } else {
            em.a(((qr) this).field_mb, ((qr) this).field_K, 7, ((qr) this).field_N, var16, ((qr) this).field_B);
            break L21;
          }
        }
        L22: {
          if (var17 != null) {
            L23: {
              var23_int = ((qr) this).field_B + var21;
              if ((((qr) this).field_y ^ -1) == -2) {
                var23_int = var23_int + (-var17.field_o + ((qr) this).field_K) / 2;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var24 = var22 + ((qr) this).field_N;
              if (1 == ((qr) this).field_G) {
                var24 = var24 + (((qr) this).field_mb - var17.field_p) / 2;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (((qr) this).field_y == 2) {
                var23_int = var23_int + (-var17.field_o + ((qr) this).field_K);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if ((((qr) this).field_G ^ -1) == -3) {
                var24 = var24 + (-var17.field_p + ((qr) this).field_mb);
                break L26;
              } else {
                break L26;
              }
            }
            if (256 > ((qr) this).field_eb) {
              var17.a(var23_int, var24, ((qr) this).field_eb);
              break L22;
            } else {
              var17.f(var23_int, var24);
              break L22;
            }
          } else {
            break L22;
          }
        }
        L27: {
          if (null == ((qr) this).field_z) {
            break L27;
          } else {
            if (null != ((qr) this).field_nb) {
              L28: {
                var26 = ((qr) this).field_z;
                var27 = var26;
                var27 = var26;
                if (!param9) {
                  break L28;
                } else {
                  if (((qr) this).field_u != null) {
                    var27 = var26 + ((qr) this).field_u;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                if (((qr) this).field_nb.c(var27) > -(2 * ((qr) this).field_kb) + ((qr) this).field_K) {
                  break L29;
                } else {
                  if ((var27.indexOf("<br>") ^ -1) > -1) {
                    L30: {
                      if ((((qr) this).field_G ^ -1) == -2) {
                        var22 = var22 + (-((qr) this).field_nb.field_q + ((qr) this).field_mb + -((qr) this).field_nb.field_J) / 2;
                        break L30;
                      } else {
                        if (2 == ((qr) this).field_G) {
                          var22 = var22 + (-((qr) this).field_nb.field_J + (-((qr) this).field_nb.field_q + ((qr) this).field_mb));
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                    }
                    if (-1 != (((qr) this).field_y ^ -1)) {
                      if (-2 == (((qr) this).field_y ^ -1)) {
                        ((qr) this).field_nb.a(var27, var21 + ((qr) this).field_B + ((qr) this).field_kb - -((((qr) this).field_K - ((qr) this).field_kb * 2) / 2), ((qr) this).field_N + var22 + ((qr) this).field_nb.field_J, var18, -1, ((qr) this).field_I);
                        break L27;
                      } else {
                        if (((qr) this).field_y != 2) {
                          int discarded$2 = ((qr) this).field_nb.a(var27, ((qr) this).field_kb + ((qr) this).field_B - -var21, var22 + ((qr) this).field_N, ((qr) this).field_K + -(2 * ((qr) this).field_kb), ((qr) this).field_mb, var18, -1, ((qr) this).field_I, ((qr) this).field_y, ((qr) this).field_G, ((qr) this).field_Y);
                          break L27;
                        } else {
                          ((qr) this).field_nb.c(var27, ((qr) this).field_K + (-(((qr) this).field_kb * 2) + var21) + (((qr) this).field_B + ((qr) this).field_kb), var22 + (((qr) this).field_N - -((qr) this).field_nb.field_J), var18, -1, ((qr) this).field_I);
                          break L27;
                        }
                      }
                    } else {
                      ((qr) this).field_nb.d(var27, var21 + (((qr) this).field_B + ((qr) this).field_kb), ((qr) this).field_nb.field_J + var22 + ((qr) this).field_N, var18, -1, ((qr) this).field_I);
                      break L27;
                    }
                  } else {
                    break L29;
                  }
                }
              }
              int discarded$3 = ((qr) this).field_nb.a(var27, var21 + (((qr) this).field_kb + ((qr) this).field_B), ((qr) this).field_N - -var22, ((qr) this).field_K - 2 * ((qr) this).field_kb, ((qr) this).field_mb, var18, -1, ((qr) this).field_I, ((qr) this).field_y, ((qr) this).field_G, ((qr) this).field_Y);
              break L27;
            } else {
              break L27;
            }
          }
        }
        L31: {
          if (null == ((qr) this).field_M) {
            break L31;
          } else {
            var23_ref = (qr) (Object) ((qr) this).field_M.d(0);
            L32: while (true) {
              if (var23_ref == null) {
                break L31;
              } else {
                var23_ref.a(var23_ref.field_ib, param1, param2, var23_ref.field_B - -var19, var20 + var23_ref.field_N, -2147483648, param6, var23_ref.field_mb, param8, param9, var23_ref.field_K);
                var23_ref = (qr) (Object) var23_ref.field_M.a((byte) -71);
                continue L32;
              }
            }
          }
        }
        gf.d(var12, var13, var14, var15);
    }

    final static void a(bc param0, byte param1) {
        bi var6 = new bi(param0.a(true, "", "final_frame.jpg"), (java.awt.Component) (Object) tm.field_i);
        int var3 = var6.field_z;
        int var4 = var6.field_w;
        wh.a(false);
        if (param1 <= 22) {
            Object var5 = null;
            dc discarded$0 = qr.a(-15, 122, (String[]) null, (vr) null, -98, -12);
        }
        qa.field_q = new bi(var3, 3 * var4 / 4);
        qa.field_q.e();
        var6.c(0, 0);
        ak.field_z = new bi(var3, -qa.field_q.field_w + var4);
        ak.field_z.e();
        var6.c(0, -qa.field_q.field_w);
        ak.field_z.field_x = qa.field_q.field_w;
        ln.f((byte) 85);
    }

    qr(long param0, qr param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    public static void e(int param0) {
        field_A = null;
        if (param0 != -14115) {
            return;
        }
        field_R = null;
    }

    protected qr() {
        ((qr) this).field_W = -1;
        ((qr) this).field_T = -2147483648;
        ((qr) this).field_I = 256;
        ((qr) this).field_D = -2147483648;
        ((qr) this).field_qb = -1;
        ((qr) this).field_V = -2147483648;
        ((qr) this).field_jb = -1;
        ((qr) this).field_O = -2147483648;
        ((qr) this).field_J = -2147483648;
        ((qr) this).field_ib = false;
        ((qr) this).field_s = true;
        ((qr) this).field_C = false;
        ((qr) this).field_eb = 256;
        ((qr) this).field_ab = -1;
        ((qr) this).field_t = -2147483648;
    }

    qr(long param0, qr param1, int param2, int param3, int param4, int param5, String param6) {
        ((qr) this).field_W = -1;
        ((qr) this).field_T = -2147483648;
        ((qr) this).field_I = 256;
        ((qr) this).field_D = -2147483648;
        ((qr) this).field_qb = -1;
        ((qr) this).field_V = -2147483648;
        ((qr) this).field_jb = -1;
        ((qr) this).field_O = -2147483648;
        ((qr) this).field_J = -2147483648;
        ((qr) this).field_ib = false;
        ((qr) this).field_s = true;
        ((qr) this).field_C = false;
        ((qr) this).field_eb = 256;
        ((qr) this).field_ab = -1;
        ((qr) this).field_t = -2147483648;
        ((qr) this).field_K = param4;
        ((qr) this).field_hb = param2;
        ((qr) this).field_mb = param5;
        ((qr) this).field_b = param0;
        ((qr) this).field_db = param3;
        ((qr) this).a(param1, false);
        if (param6 != null) {
            ((qr) this).field_z = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Checking";
    }
}
