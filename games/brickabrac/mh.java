/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends ba {
    boolean field_Lb;
    int field_X;
    int field_rb;
    jp[] field_D;
    int field_Fb;
    private int field_J;
    boolean field_Nb;
    boolean field_eb;
    int field_R;
    private int field_W;
    private int field_M;
    jp field_T;
    private int field_qb;
    int field_db;
    dh field_O;
    int field_S;
    private boolean field_Kb;
    int field_ub;
    int field_E;
    int field_Db;
    private int field_sb;
    private int field_yb;
    String field_Cb;
    static re field_H;
    boolean field_G;
    int field_Ob;
    int field_Q;
    jp field_K;
    int field_Ib;
    jp[] field_Gb;
    int field_U;
    jp[] field_pb;
    int field_cb;
    private boolean field_fb;
    int field_zb;
    int field_Y;
    int field_Eb;
    int field_L;
    static int[] field_F;
    boolean field_nb;
    static int field_gb;
    jp[] field_Ab;
    jp field_wb;
    boolean field_kb;
    vl field_bb;
    static mf field_lb;
    static tf field_ab;
    static jp field_ib;
    int field_N;
    String field_Mb;
    private int field_xb;
    int field_jb;
    static String field_Z;
    private boolean field_Bb;
    private int field_hb;
    int field_I;
    int field_V;
    static String field_mb;
    int field_vb;
    jp field_tb;
    int field_P;
    jp[] field_Jb;
    int field_C;
    static oe[] field_ob;
    jp field_Hb;

    mh(long param0, mh param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
        Object var15 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var13 = null;
          var14 = BrickABrac.field_J ? 1 : 0;
          if (param1 == 886229954) {
            break L0;
          } else {
            var15 = null;
            ((mh) this).a((byte) -43, (mh) null);
            break L0;
          }
        }
        L1: {
          if (0 >= ((mh) this).field_J) {
            var7 = ((mh) this).field_J >> 2;
            break L1;
          } else {
            var7 = -(-((mh) this).field_J >> 2);
            break L1;
          }
        }
        L2: {
          ((mh) this).field_P = ((mh) this).field_P + var7;
          ((mh) this).field_J = ((mh) this).field_J - var7;
          if (((mh) this).field_Db > 0) {
            var7 = -(-((mh) this).field_Db >> 2);
            break L2;
          } else {
            var7 = ((mh) this).field_Db >> 2;
            break L2;
          }
        }
        L3: {
          ((mh) this).field_zb = ((mh) this).field_zb + var7;
          ((mh) this).field_Db = ((mh) this).field_Db - var7;
          if (0 < ((mh) this).field_xb) {
            var7 = -(-((mh) this).field_xb >> 2);
            break L3;
          } else {
            var7 = ((mh) this).field_xb >> 2;
            break L3;
          }
        }
        L4: {
          ((mh) this).field_Ib = ((mh) this).field_Ib + var7;
          ((mh) this).field_xb = ((mh) this).field_xb - var7;
          if (((mh) this).field_C > 0) {
            var7 = -(-((mh) this).field_C >> 2);
            break L4;
          } else {
            var7 = ((mh) this).field_C >> 2;
            break L4;
          }
        }
        L5: {
          L6: {
            ((mh) this).field_C = ((mh) this).field_C - var7;
            ((mh) this).field_db = ((mh) this).field_zb + param4;
            ((mh) this).field_cb = ((mh) this).field_cb + var7;
            ((mh) this).field_Eb = param2 - -((mh) this).field_P;
            param5 = param5 & ((mh) this).field_eb;
            var8 = lb.field_i;
            var9 = lb.field_b;
            var10 = lb.field_f;
            var11 = lb.field_j;
            lb.d(((mh) this).field_Eb, ((mh) this).field_db, ((mh) this).field_Ib + ((mh) this).field_Eb, ((mh) this).field_cb + ((mh) this).field_db);
            var12 = 0;
            if (wc.field_d) {
              break L6;
            } else {
              if (!param5) {
                break L6;
              } else {
                if (ki.field_e == 0) {
                  break L6;
                } else {
                  if (lb.field_i > tb.field_fb) {
                    break L6;
                  } else {
                    if (lb.field_f <= tb.field_fb) {
                      break L6;
                    } else {
                      if (qo.field_O < lb.field_b) {
                        break L6;
                      } else {
                        if (lb.field_j <= qo.field_O) {
                          break L6;
                        } else {
                          ((mh) this).field_L = ki.field_e;
                          ((mh) this).field_U = -((mh) this).field_Eb + tb.field_fb;
                          ((mh) this).field_Ob = ki.field_e;
                          var12 = 1;
                          ((mh) this).field_yb = -((mh) this).field_db + qo.field_O;
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((mh) this).field_L = 0;
          if (0 == ki.field_e) {
            break L5;
          } else {
            ((mh) this).field_Ob = 0;
            break L5;
          }
        }
        L7: {
          L8: {
            stackOut_24_0 = this;
            stackIn_30_0 = stackOut_24_0;
            stackIn_25_0 = stackOut_24_0;
            if (qa.field_u) {
              break L8;
            } else {
              stackOut_25_0 = this;
              stackIn_30_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (lb.field_i > pq.field_k) {
                break L8;
              } else {
                stackOut_26_0 = this;
                stackIn_30_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (lb.field_f <= pq.field_k) {
                  break L8;
                } else {
                  stackOut_27_0 = this;
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (po.field_a < lb.field_b) {
                    break L8;
                  } else {
                    stackOut_28_0 = this;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (lb.field_j <= po.field_a) {
                      break L8;
                    } else {
                      stackOut_29_0 = this;
                      stackOut_29_1 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      break L7;
                    }
                  }
                }
              }
            }
          }
          stackOut_30_0 = this;
          stackOut_30_1 = 0;
          stackIn_31_0 = stackOut_30_0;
          stackIn_31_1 = stackOut_30_1;
          break L7;
        }
        L9: {
          ((mh) this).field_G = stackIn_31_1 != 0;
          if (0 == cb.field_q) {
            ((mh) this).field_Ob = 0;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          L11: {
            stackOut_34_0 = this;
            stackIn_38_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if (!((mh) this).field_G) {
              break L11;
            } else {
              stackOut_35_0 = this;
              stackIn_38_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (((mh) this).field_Ob != cb.field_q) {
                break L11;
              } else {
                stackOut_36_0 = this;
                stackIn_38_0 = stackOut_36_0;
                stackIn_37_0 = stackOut_36_0;
                if (!param5) {
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
          ((mh) this).field_kb = stackIn_39_1 != 0;
          if (((mh) this).field_bb == null) {
            break L12;
          } else {
            var13 = (Object) (Object) (mh) (Object) ((mh) this).field_bb.f(param1 ^ 886229954);
            L13: while (true) {
              if (var13 == null) {
                break L12;
              } else {
                ((mh) var13).a(((mh) var13).field_Ib, 886229954, ((mh) var13).field_Eb, ((mh) var13).field_cb, ((mh) var13).field_db, param5);
                var13 = (Object) (Object) (mh) (Object) ((mh) var13).field_bb.b(33);
                continue L13;
              }
            }
          }
        }
        L14: {
          if (((mh) var13).field_G) {
            qa.field_u = true;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          if (var12 == 0) {
            break L15;
          } else {
            wc.field_d = true;
            break L15;
          }
        }
        L16: {
          lb.e(var8, var9, var10, var11);
          if (((mh) var13).field_Ob == 0) {
            break L16;
          } else {
            if (((mh) var13).field_nb) {
              L17: {
                ((mh) this).field_zb = po.field_a - ((mh) var13).field_yb - param4;
                ((mh) this).field_P = -((mh) var13).field_U + pq.field_k - param2;
                if (0 > ((mh) var13).field_P) {
                  ((mh) this).field_P = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (((mh) var13).field_P <= -((mh) var13).field_Ib + param0) {
                  break L18;
                } else {
                  ((mh) this).field_P = -((mh) var13).field_Ib + param0;
                  break L18;
                }
              }
              L19: {
                if (((mh) var13).field_zb < 0) {
                  ((mh) this).field_zb = 0;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (-((mh) var13).field_cb + param3 < ((mh) var13).field_zb) {
                  ((mh) this).field_zb = param3 + -((mh) var13).field_cb;
                  break L20;
                } else {
                  break L20;
                }
              }
              ((mh) this).field_Db = 0;
              ((mh) this).field_Eb = param2 - -((mh) var13).field_P;
              ((mh) this).field_J = 0;
              ((mh) this).field_db = param4 - -((mh) var13).field_zb;
              break L16;
            } else {
              break L16;
            }
          }
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, boolean param8, int param9, boolean param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jp[] var17 = null;
        jp var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        int var24_int = 0;
        mh var24_ref = null;
        int var25 = 0;
        int var26 = 0;
        String var27 = null;
        String var28 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var24 = null;
          var26 = BrickABrac.field_J ? 1 : 0;
          ((mh) this).field_Eb = ((mh) this).field_P + param9;
          ((mh) this).field_db = param1 + ((mh) this).field_zb;
          var13 = -125 / ((param2 - 22) / 33);
          var12 = lb.field_i;
          var14 = lb.field_b;
          var15 = lb.field_f;
          var16 = lb.field_j;
          lb.d(((mh) this).field_Eb, ((mh) this).field_db, ((mh) this).field_Eb + ((mh) this).field_Ib, ((mh) this).field_db - -((mh) this).field_cb);
          if (!((mh) this).field_Kb) {
            L1: {
              param0 = ((mh) this).field_Nb;
              param4 = ((mh) this).field_kb;
              if (((mh) this).field_Ob == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            param6 = stackIn_5_0 != 0;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          param5 = param5 & ((mh) this).field_eb;
          var17 = ((mh) this).field_Jb;
          var18 = ((mh) this).field_wb;
          var19 = ((mh) this).field_X;
          var20 = 0;
          if (!param5) {
            L3: {
              if (((mh) this).field_I >= 0) {
                var19 = ((mh) this).field_I;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((mh) this).field_Ab != null) {
                var17 = ((mh) this).field_Ab;
                break L4;
              } else {
                break L4;
              }
            }
            if (((mh) this).field_Hb != null) {
              var18 = ((mh) this).field_Hb;
              break L2;
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          var21 = 0;
          if (!param4) {
            break L5;
          } else {
            L6: {
              if (((mh) this).field_Gb == null) {
                break L6;
              } else {
                var17 = ((mh) this).field_Gb;
                break L6;
              }
            }
            L7: {
              if (((mh) this).field_Y >= 0) {
                var19 = ((mh) this).field_Y;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((mh) this).field_sb != -2147483648) {
                var20 = ((mh) this).field_sb;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (null != ((mh) this).field_T) {
                var18 = ((mh) this).field_T;
                break L9;
              } else {
                break L9;
              }
            }
            if (((mh) this).field_M == -2147483648) {
              break L5;
            } else {
              var21 = ((mh) this).field_M;
              break L5;
            }
          }
        }
        L10: {
          if (!param6) {
            break L10;
          } else {
            L11: {
              if (null != ((mh) this).field_tb) {
                var18 = ((mh) this).field_tb;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (((mh) this).field_D == null) {
                break L12;
              } else {
                var17 = ((mh) this).field_D;
                break L12;
              }
            }
            L13: {
              if (-2147483648 != ((mh) this).field_E) {
                var21 = ((mh) this).field_E;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (((mh) this).field_Fb < 0) {
                break L14;
              } else {
                var19 = ((mh) this).field_Fb;
                break L14;
              }
            }
            if (((mh) this).field_ub != -2147483648) {
              var20 = ((mh) this).field_ub;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L15: {
          if (!param0) {
            break L15;
          } else {
            L16: {
              if (((mh) this).field_vb < 0) {
                break L16;
              } else {
                var19 = ((mh) this).field_vb;
                break L16;
              }
            }
            L17: {
              if (null == ((mh) this).field_K) {
                break L17;
              } else {
                var18 = ((mh) this).field_K;
                break L17;
              }
            }
            L18: {
              if (((mh) this).field_rb != -2147483648) {
                var20 = ((mh) this).field_rb;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (((mh) this).field_pb != null) {
                var17 = ((mh) this).field_pb;
                break L19;
              } else {
                break L19;
              }
            }
            if (-2147483648 == ((mh) this).field_N) {
              break L15;
            } else {
              var21 = ((mh) this).field_N;
              break L15;
            }
          }
        }
        L20: {
          var22 = ((mh) this).field_qb - -var20;
          var23 = ((mh) this).field_hb + var21;
          if (!((mh) this).field_Lb) {
            nh.a(((mh) this).field_Ib, ((mh) this).field_cb, -40, ((mh) this).field_Eb, var17, ((mh) this).field_db);
            break L20;
          } else {
            nh.a(param3, param7, -40, param9, var17, param1);
            break L20;
          }
        }
        L21: {
          if (var18 != null) {
            L22: {
              var24_int = var22 + ((mh) this).field_Eb;
              var25 = var23 + ((mh) this).field_db;
              if (1 != ((mh) this).field_S) {
                break L22;
              } else {
                var24_int = var24_int + (((mh) this).field_Ib - var18.field_x) / 2;
                break L22;
              }
            }
            L23: {
              if (2 != ((mh) this).field_S) {
                break L23;
              } else {
                var24_int = var24_int + (-var18.field_x + ((mh) this).field_Ib);
                break L23;
              }
            }
            L24: {
              if (1 == ((mh) this).field_Q) {
                var25 = var25 + (((mh) this).field_cb - var18.field_z) / 2;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (((mh) this).field_Q == 2) {
                var25 = var25 + (((mh) this).field_cb + -var18.field_z);
                break L25;
              } else {
                break L25;
              }
            }
            if (256 > ((mh) this).field_W) {
              var18.b(var24_int, var25, ((mh) this).field_W);
              break L21;
            } else {
              var18.c(var24_int, var25);
              break L21;
            }
          } else {
            break L21;
          }
        }
        L26: {
          if (null == ((mh) this).field_Mb) {
            break L26;
          } else {
            if (((mh) this).field_O != null) {
              L27: {
                var27 = ((mh) this).field_Mb;
                var28 = var27;
                var28 = var27;
                if (!param8) {
                  break L27;
                } else {
                  if (((mh) this).field_Cb == null) {
                    break L27;
                  } else {
                    var28 = var27 + ((mh) this).field_Cb;
                    break L27;
                  }
                }
              }
              L28: {
                if (((mh) this).field_O.c(var28) > -(((mh) this).field_V * 2) + ((mh) this).field_Ib) {
                  break L28;
                } else {
                  if (-1 >= var28.indexOf("<br>")) {
                    break L28;
                  } else {
                    L29: {
                      if (-2 != ((mh) this).field_Q) {
                        if (((mh) this).field_Q == 2) {
                          var23 = var23 + (-((mh) this).field_O.field_F + ((mh) this).field_cb + -((mh) this).field_O.field_P);
                          break L29;
                        } else {
                          break L29;
                        }
                      } else {
                        var23 = var23 + (((mh) this).field_cb + -((mh) this).field_O.field_F - ((mh) this).field_O.field_P) / 2;
                        break L29;
                      }
                    }
                    if (((mh) this).field_S != 0) {
                      if (((mh) this).field_S == 1) {
                        ((mh) this).field_O.b(var28, var22 + ((mh) this).field_V + ((mh) this).field_Eb + (-(((mh) this).field_V * 2) + ((mh) this).field_Ib) / 2, ((mh) this).field_db - (-var23 - ((mh) this).field_O.field_F), var19, -1, ((mh) this).field_jb);
                        break L26;
                      } else {
                        if (((mh) this).field_S != 2) {
                          int discarded$2 = ((mh) this).field_O.a(var28, var22 + (((mh) this).field_V + ((mh) this).field_Eb), var23 + ((mh) this).field_db, -(2 * ((mh) this).field_V) + ((mh) this).field_Ib, ((mh) this).field_cb, var19, -1, ((mh) this).field_jb, ((mh) this).field_S, ((mh) this).field_Q, ((mh) this).field_R);
                          break L26;
                        } else {
                          ((mh) this).field_O.a(var28, ((mh) this).field_Eb - -((mh) this).field_V - (-var22 - -(((mh) this).field_V * 2)) + ((mh) this).field_Ib, ((mh) this).field_db + (var23 + ((mh) this).field_O.field_F), var19, -1, ((mh) this).field_jb);
                          break L26;
                        }
                      }
                    } else {
                      ((mh) this).field_O.c(var28, var22 + (((mh) this).field_Eb + ((mh) this).field_V), ((mh) this).field_db + var23 - -((mh) this).field_O.field_F, var19, -1, ((mh) this).field_jb);
                      break L26;
                    }
                  }
                }
              }
              int discarded$3 = ((mh) this).field_O.a(var28, var22 + (((mh) this).field_V + ((mh) this).field_Eb), var23 + ((mh) this).field_db, -(((mh) this).field_V * 2) + ((mh) this).field_Ib, ((mh) this).field_cb, var19, -1, ((mh) this).field_jb, ((mh) this).field_S, ((mh) this).field_Q, ((mh) this).field_R);
              break L26;
            } else {
              break L26;
            }
          }
        }
        L30: {
          if (((mh) this).field_bb == null) {
            break L30;
          } else {
            var24_ref = (mh) (Object) ((mh) this).field_bb.d(-46);
            L31: while (true) {
              if (var24_ref == null) {
                break L30;
              } else {
                var24_ref.a(param0, var24_ref.field_db + var21, 89, var24_ref.field_Ib, param4, param5, param6, var24_ref.field_cb, param8, var20 + var24_ref.field_Eb, var24_ref.field_Bb);
                var24_ref = (mh) (Object) var24_ref.field_bb.a((byte) 116);
                continue L31;
              }
            }
          }
        }
        lb.e(var12, var14, var15, var16);
    }

    final void a(byte param0, mh param1) {
        RuntimeException var3 = null;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_75_0 = null;
        Object stackOut_76_0 = null;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        try {
          L0: {
            if (param0 <= -65) {
              L1: {
                if (param1 != null) {
                  L2: {
                    if (null == param1.field_Hb) {
                      break L2;
                    } else {
                      ((mh) this).field_Hb = param1.field_Hb;
                      break L2;
                    }
                  }
                  L3: {
                    if (null != param1.field_Cb) {
                      ((mh) this).field_Cb = param1.field_Cb;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (null == param1.field_K) {
                      break L4;
                    } else {
                      ((mh) this).field_K = param1.field_K;
                      break L4;
                    }
                  }
                  L5: {
                    if (param1.field_X == 0) {
                      break L5;
                    } else {
                      ((mh) this).field_X = param1.field_X;
                      break L5;
                    }
                  }
                  L6: {
                    if (param1.field_O == null) {
                      break L6;
                    } else {
                      ((mh) this).field_O = param1.field_O;
                      break L6;
                    }
                  }
                  L7: {
                    if (param1.field_Fb < 0) {
                      break L7;
                    } else {
                      ((mh) this).field_Fb = param1.field_Fb;
                      break L7;
                    }
                  }
                  L8: {
                    if (param1.field_vb < 0) {
                      break L8;
                    } else {
                      ((mh) this).field_vb = param1.field_vb;
                      break L8;
                    }
                  }
                  L9: {
                    if (param1.field_Jb != null) {
                      ((mh) this).field_Jb = param1.field_Jb;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param1.field_pb == null) {
                      break L10;
                    } else {
                      ((mh) this).field_pb = param1.field_pb;
                      break L10;
                    }
                  }
                  L11: {
                    if (param1.field_fb) {
                      ((mh) this).field_fb = param1.field_fb;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (param1.field_Y >= 0) {
                      ((mh) this).field_Y = param1.field_Y;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (param1.field_T == null) {
                      break L13;
                    } else {
                      ((mh) this).field_T = param1.field_T;
                      break L13;
                    }
                  }
                  L14: {
                    if (param1.field_V != 0) {
                      ((mh) this).field_V = param1.field_V;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (param1.field_eb) {
                      break L15;
                    } else {
                      ((mh) this).field_eb = param1.field_eb;
                      break L15;
                    }
                  }
                  L16: {
                    if (null != param1.field_Ab) {
                      ((mh) this).field_Ab = param1.field_Ab;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (!param1.field_Kb) {
                      break L17;
                    } else {
                      ((mh) this).field_Kb = param1.field_Kb;
                      break L17;
                    }
                  }
                  L18: {
                    if (null != param1.field_Gb) {
                      ((mh) this).field_Gb = param1.field_Gb;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (param1.field_R != 0) {
                      ((mh) this).field_R = param1.field_R;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (param1.field_wb != null) {
                      ((mh) this).field_wb = param1.field_wb;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (param1.field_Mb != null) {
                      ((mh) this).field_Mb = param1.field_Mb;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (!param1.field_Nb) {
                      break L22;
                    } else {
                      ((mh) this).field_Nb = param1.field_Nb;
                      break L22;
                    }
                  }
                  L23: {
                    if (null == param1.field_tb) {
                      break L23;
                    } else {
                      ((mh) this).field_tb = param1.field_tb;
                      break L23;
                    }
                  }
                  L24: {
                    if (param1.field_D == null) {
                      break L24;
                    } else {
                      ((mh) this).field_D = param1.field_D;
                      break L24;
                    }
                  }
                  L25: {
                    if (param1.field_Lb) {
                      ((mh) this).field_Lb = param1.field_Lb;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (param1.field_jb == 256) {
                      break L26;
                    } else {
                      ((mh) this).field_jb = param1.field_jb;
                      break L26;
                    }
                  }
                  L27: {
                    if (param1.field_I >= 0) {
                      ((mh) this).field_I = param1.field_I;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (param1.field_N != -2147483648) {
                      ((mh) this).field_N = param1.field_N;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (param1.field_S == 0) {
                      break L29;
                    } else {
                      ((mh) this).field_S = param1.field_S;
                      break L29;
                    }
                  }
                  L30: {
                    if (param1.field_rb == -2147483648) {
                      break L30;
                    } else {
                      ((mh) this).field_rb = param1.field_rb;
                      break L30;
                    }
                  }
                  L31: {
                    L32: {
                      stackOut_75_0 = this;
                      stackIn_78_0 = stackOut_75_0;
                      stackIn_76_0 = stackOut_75_0;
                      if (!((mh) this).field_fb) {
                        break L32;
                      } else {
                        stackOut_76_0 = this;
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_77_0 = stackOut_76_0;
                        if (!param1.field_Bb) {
                          break L32;
                        } else {
                          stackOut_77_0 = this;
                          stackOut_77_1 = 1;
                          stackIn_79_0 = stackOut_77_0;
                          stackIn_79_1 = stackOut_77_1;
                          break L31;
                        }
                      }
                    }
                    stackOut_78_0 = this;
                    stackOut_78_1 = 0;
                    stackIn_79_0 = stackOut_78_0;
                    stackIn_79_1 = stackOut_78_1;
                    break L31;
                  }
                  L33: {
                    ((mh) this).field_Bb = stackIn_79_1 != 0;
                    if (-2147483648 != param1.field_ub) {
                      ((mh) this).field_ub = param1.field_ub;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  L34: {
                    if (param1.field_nb) {
                      ((mh) this).field_nb = param1.field_nb;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    if (-2147483648 == param1.field_sb) {
                      break L35;
                    } else {
                      ((mh) this).field_sb = param1.field_sb;
                      break L35;
                    }
                  }
                  L36: {
                    if (param1.field_qb != 0) {
                      ((mh) this).field_qb = param1.field_qb;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (param1.field_Q != 0) {
                      ((mh) this).field_Q = param1.field_Q;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  L38: {
                    if (param1.field_hb == 0) {
                      break L38;
                    } else {
                      ((mh) this).field_hb = param1.field_hb;
                      break L38;
                    }
                  }
                  L39: {
                    if (param1.field_E == -2147483648) {
                      break L39;
                    } else {
                      ((mh) this).field_E = param1.field_E;
                      break L39;
                    }
                  }
                  if (param1.field_M == -2147483648) {
                    break L1;
                  } else {
                    ((mh) this).field_M = param1.field_M;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L40: {
            var3 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) var3;
            stackOut_100_1 = new StringBuilder().append("mh.T(").append(param0).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L40;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L40;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_103_0, stackIn_103_2 + ')');
        }
    }

    mh(long param0, mh param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    public static void c(byte param0) {
        field_Z = null;
        field_ab = null;
        field_ob = null;
        field_ib = null;
        field_H = null;
        field_F = null;
        if (param0 <= 60) {
          return;
        } else {
          field_mb = null;
          field_lb = null;
          return;
        }
    }

    final static boolean a(boolean param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        } else {
          if (!rk.a((byte) -95, param1)) {
            if (param1 != 45) {
              if (param1 != 160) {
                if (32 != param1) {
                  if (95 != param1) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var9 = 0;
        mh var10_ref_mh = null;
        int var11 = BrickABrac.field_J ? 1 : 0;
        int var5 = -((mh) this).field_zb;
        int var6 = var5 - ((mh) this).field_Db;
        int var7 = ((mh) this).field_cb;
        int var8 = ((mh) this).field_C + var7;
        if (!param3) {
            var9 = 0;
            var10_ref_mh = (mh) (Object) ((mh) this).field_bb.d(param2 ^ 2147483544);
            while (var10_ref_mh != null) {
                var10_ref_mh.field_Db = var9 + -var10_ref_mh.field_zb;
                var9 = var9 + (param1 + var10_ref_mh.field_cb + var10_ref_mh.field_C);
                var10_ref_mh = (mh) (Object) ((mh) this).field_bb.a((byte) 116);
            }
            var8 = -param1 + var9;
        }
        var9 = var8 - param0;
        if (!(var9 >= var6)) {
            var6 = var9;
        }
        if (!(0 <= var6)) {
            var6 = 0;
        }
        int var10 = -param0 + var7;
        if (!(var10 >= var5)) {
            var5 = var10;
        }
        if (0 > var5) {
            var5 = 0;
        }
        ((mh) this).field_Db = var5 + -var6;
        ((mh) this).field_C = -var7 + var8;
        ((mh) this).field_cb = var7;
        ((mh) this).field_zb = -var5;
        if (param2 != -2147483648) {
            mh.c((byte) -123);
        }
    }

    final void c(boolean param0) {
        mh var4 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (!(null == ((mh) this).field_bb)) {
            var4 = (mh) (Object) ((mh) this).field_bb.f(0);
            while (var4 != null) {
                var4.field_Kb = true;
                var4.c(true);
                var4 = (mh) (Object) var4.field_bb.b(118);
            }
        }
        if (!param0) {
            ((mh) this).field_R = -7;
        }
    }

    final void a(boolean param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        qa.field_u = stackIn_3_0 != 0;
        if (param1 != -15211) {
          return;
        } else {
          L1: {
            if (param0) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          wc.field_d = stackIn_7_0 != 0;
          this.a(lb.field_c, 886229954, 0, lb.field_d, 0, true);
          return;
        }
    }

    final void a(boolean param0, boolean param1) {
        this.a(false, 0, -109, lb.field_c, false, param0, false, lb.field_d, param1, 0, false);
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != 64) {
            ((mh) this).a(105, -91, -77, false);
        }
        ((mh) this).field_zb = param1;
        ((mh) this).field_cb = param0;
        ((mh) this).field_J = 0;
        ((mh) this).field_xb = 0;
        ((mh) this).field_C = 0;
        ((mh) this).field_Ib = param3;
        ((mh) this).field_Db = 0;
        ((mh) this).field_P = param2;
    }

    final void a(mh param0, int param1, mh param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
            if (param3 == 17290) {
              L1: {
                if (param0 != null) {
                  param2.field_zb = param1 + param0.field_zb + param0.field_cb;
                  param2.field_Db = param0.field_C + param0.field_Db;
                  break L1;
                } else {
                  param2.field_zb = 0;
                  param2.field_Db = 0;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("mh.CA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
    }

    final void a(mh param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (null == ((mh) this).field_bb) {
                ((mh) this).field_bb = new vl();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((mh) this).field_bb.a((nm) (Object) param0, (byte) 3);
              if (param1 == 0) {
                break L2;
              } else {
                this.a(-97, -100, 116, 23, -11, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("mh.P(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    protected mh() {
        ((mh) this).field_rb = -2147483648;
        ((mh) this).field_W = 256;
        ((mh) this).field_E = -2147483648;
        ((mh) this).field_sb = -2147483648;
        ((mh) this).field_M = -2147483648;
        ((mh) this).field_ub = -2147483648;
        ((mh) this).field_Y = -1;
        ((mh) this).field_Fb = -1;
        ((mh) this).field_fb = false;
        ((mh) this).field_eb = true;
        ((mh) this).field_jb = 256;
        ((mh) this).field_Bb = false;
        ((mh) this).field_vb = -1;
        ((mh) this).field_N = -2147483648;
        ((mh) this).field_I = -1;
    }

    mh(long param0, mh param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((mh) this).field_rb = -2147483648;
        ((mh) this).field_W = 256;
        ((mh) this).field_E = -2147483648;
        ((mh) this).field_sb = -2147483648;
        ((mh) this).field_M = -2147483648;
        ((mh) this).field_ub = -2147483648;
        ((mh) this).field_Y = -1;
        ((mh) this).field_Fb = -1;
        ((mh) this).field_fb = false;
        ((mh) this).field_eb = true;
        ((mh) this).field_jb = 256;
        ((mh) this).field_Bb = false;
        ((mh) this).field_vb = -1;
        ((mh) this).field_N = -2147483648;
        ((mh) this).field_I = -1;
        try {
          L0: {
            L1: {
              ((mh) this).field_zb = param3;
              ((mh) this).field_g = param0;
              ((mh) this).field_Ib = param4;
              ((mh) this).field_P = param2;
              ((mh) this).field_cb = param5;
              ((mh) this).a((byte) -67, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((mh) this).field_Mb = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("mh.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var4_int = 0;
        mh var4 = null;
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        int var3 = param1;
        if (((mh) this).field_Mb != null) {
            if (!(null == ((mh) this).field_O)) {
                var4_int = ((mh) this).field_O.b(((mh) this).field_Mb, param0);
                if (!(var3 >= var4_int)) {
                    var3 = var4_int;
                }
            }
        }
        if (!(((mh) this).field_wb == null)) {
            var4_int = ((mh) this).field_wb.field_x;
            if (!(var4_int <= var3)) {
                var3 = var4_int;
            }
        }
        if (((mh) this).field_bb != null) {
            var4 = (mh) (Object) ((mh) this).field_bb.d(-85);
            while (var4 != null) {
                var5 = var4.field_P + var4.field_Ib;
                if (var3 < var5) {
                    var3 = var5;
                }
                var4 = (mh) (Object) ((mh) this).field_bb.a((byte) 116);
            }
        }
        return var3;
    }

    final int g(int param0) {
        if (param0 < 59) {
            ((mh) this).field_N = -89;
        }
        return ((mh) this).a(2147483647, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new re(1);
        field_Z = "Game";
        field_gb = -1;
        field_mb = "Log in / Create account";
        field_F = new int[9000];
        field_ob = new oe[8];
        field_ab = new tf();
    }
}
