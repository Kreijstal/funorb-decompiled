/*
 * Decompiled by CFR-JS 0.4.0.
 */
class le extends cf {
    private boolean field_C;
    String field_fb;
    int field_W;
    boolean field_B;
    static int field_D;
    int field_G;
    private int field_M;
    int field_sb;
    static bd field_xb;
    static ac field_ub;
    static int field_gb;
    private int field_O;
    int field_N;
    private bd[] field_V;
    private int field_U;
    private int field_ob;
    private int field_x;
    private bd field_P;
    int field_J;
    private bd field_cb;
    int field_L;
    int field_Q;
    bd field_pb;
    private int field_hb;
    vm field_ab;
    private bd[] field_Ab;
    static int field_eb;
    static int field_bb;
    private int field_w;
    int field_z;
    int field_zb;
    boolean field_S;
    private int field_E;
    boolean field_jb;
    private int field_wb;
    private String field_F;
    private int field_Z;
    private int field_kb;
    int field_X;
    bd[] field_Bb;
    boolean field_Db;
    int field_mb;
    vl field_I;
    boolean field_Eb;
    private boolean field_y;
    private int field_rb;
    private int field_db;
    private bd field_vb;
    private bd[] field_yb;
    private boolean field_Cb;
    private int field_H;
    private int field_A;
    bd[] field_nb;
    int field_R;
    int field_K;
    int field_qb;
    int field_ib;
    int field_T;
    int field_v;
    bd field_Y;
    private boolean field_lb;
    int field_tb;

    final void a(int param0, boolean param1) {
        int var3 = 44 / ((29 - param0) / 41);
        this.a(false, 0, param1, (byte) 82, true, si.field_e, false, 0, false, false, si.field_k);
    }

    final static void c(byte param0) {
        if (!(null == ag.field_t)) {
            ag.field_t.a(-98);
            ag.field_t = null;
        }
        if (param0 < 38) {
            field_ub = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((le) this).field_X = 0;
        ((le) this).field_z = 0;
        int var6 = -67 / ((50 - param3) / 45);
        ((le) this).field_ib = 0;
        ((le) this).field_tb = param4;
        ((le) this).field_qb = param1;
        ((le) this).field_N = 0;
        ((le) this).field_zb = param0;
        ((le) this).field_sb = param2;
    }

    private final void a(int param0, int param1, int param2, boolean param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
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
          var13 = null;
          var14 = HostileSpawn.field_I ? 1 : 0;
          if (((le) this).field_ib > 0) {
            var7 = -(-((le) this).field_ib >> 2);
            break L0;
          } else {
            var7 = ((le) this).field_ib >> 2;
            break L0;
          }
        }
        L1: {
          ((le) this).field_ib = ((le) this).field_ib - var7;
          ((le) this).field_tb = ((le) this).field_tb + var7;
          if (0 < ((le) this).field_z) {
            var7 = -(-((le) this).field_z >> 2);
            break L1;
          } else {
            var7 = ((le) this).field_z >> 2;
            break L1;
          }
        }
        L2: {
          ((le) this).field_z = ((le) this).field_z - var7;
          ((le) this).field_zb = ((le) this).field_zb + var7;
          if (((le) this).field_X <= 0) {
            var7 = ((le) this).field_X >> 2;
            break L2;
          } else {
            var7 = -(-((le) this).field_X >> 2);
            break L2;
          }
        }
        L3: {
          ((le) this).field_qb = ((le) this).field_qb + var7;
          ((le) this).field_X = ((le) this).field_X - var7;
          if (((le) this).field_N > 0) {
            var7 = -(-((le) this).field_N >> 2);
            break L3;
          } else {
            var7 = ((le) this).field_N >> 2;
            break L3;
          }
        }
        L4: {
          L5: {
            ((le) this).field_mb = ((le) this).field_zb + param2;
            param3 = param3 & ((le) this).field_jb;
            ((le) this).field_K = ((le) this).field_tb + param0;
            ((le) this).field_sb = ((le) this).field_sb + var7;
            ((le) this).field_N = ((le) this).field_N - var7;
            var8 = si.field_b;
            var9 = si.field_j;
            var10 = si.field_l;
            var11 = si.field_a;
            si.f(((le) this).field_K, ((le) this).field_mb, ((le) this).field_qb + ((le) this).field_K, ((le) this).field_sb + ((le) this).field_mb);
            var12 = 0;
            if (ob.field_n) {
              break L5;
            } else {
              if (!param3) {
                break L5;
              } else {
                if (pf.field_o == 0) {
                  break L5;
                } else {
                  if (si.field_b > ec.field_a) {
                    break L5;
                  } else {
                    if (si.field_l <= ec.field_a) {
                      break L5;
                    } else {
                      if (si.field_j > rc.field_b) {
                        break L5;
                      } else {
                        if (rc.field_b < si.field_a) {
                          var12 = 1;
                          ((le) this).field_E = -((le) this).field_mb + rc.field_b;
                          ((le) this).field_wb = ec.field_a - ((le) this).field_K;
                          ((le) this).field_W = pf.field_o;
                          ((le) this).field_Q = pf.field_o;
                          break L4;
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
          ((le) this).field_Q = 0;
          if (pf.field_o != 0) {
            ((le) this).field_W = 0;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          if (0 == ig.field_L) {
            ((le) this).field_W = 0;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            stackOut_27_0 = this;
            stackIn_33_0 = stackOut_27_0;
            stackIn_28_0 = stackOut_27_0;
            if (wc.field_u) {
              break L8;
            } else {
              stackOut_28_0 = this;
              stackIn_33_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (j.field_c < si.field_b) {
                break L8;
              } else {
                stackOut_29_0 = this;
                stackIn_33_0 = stackOut_29_0;
                stackIn_30_0 = stackOut_29_0;
                if (si.field_l <= j.field_c) {
                  break L8;
                } else {
                  stackOut_30_0 = this;
                  stackIn_33_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (si.field_j > rb.field_m) {
                    break L8;
                  } else {
                    stackOut_31_0 = this;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (rb.field_m >= si.field_a) {
                      break L8;
                    } else {
                      stackOut_32_0 = this;
                      stackOut_32_1 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      break L7;
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
          break L7;
        }
        L9: {
          L10: {
            ((le) this).field_Eb = stackIn_34_1 != 0;
            stackOut_34_0 = this;
            stackIn_38_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if (!((le) this).field_Eb) {
              break L10;
            } else {
              stackOut_35_0 = this;
              stackIn_38_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (ig.field_L != ((le) this).field_W) {
                break L10;
              } else {
                stackOut_36_0 = this;
                stackIn_38_0 = stackOut_36_0;
                stackIn_37_0 = stackOut_36_0;
                if (!param3) {
                  break L10;
                } else {
                  stackOut_37_0 = this;
                  stackOut_37_1 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  break L9;
                }
              }
            }
          }
          stackOut_38_0 = this;
          stackOut_38_1 = 0;
          stackIn_39_0 = stackOut_38_0;
          stackIn_39_1 = stackOut_38_1;
          break L9;
        }
        L11: {
          ((le) this).field_S = stackIn_39_1 != 0;
          if (((le) this).field_I != null) {
            var13 = (Object) (Object) (le) (Object) ((le) this).field_I.b((byte) 117);
            L12: while (true) {
              if (var13 == null) {
                break L11;
              } else {
                ((le) var13).a(((le) var13).field_K, ((le) var13).field_sb, ((le) var13).field_mb, param3, (byte) 48, ((le) var13).field_qb);
                var13 = (Object) (Object) (le) (Object) ((le) var13).field_I.a((byte) 110);
                continue L12;
              }
            }
          } else {
            break L11;
          }
        }
        L13: {
          if (!((le) var13).field_Eb) {
            break L13;
          } else {
            wc.field_u = true;
            break L13;
          }
        }
        L14: {
          if (var12 == 0) {
            break L14;
          } else {
            ob.field_n = true;
            break L14;
          }
        }
        L15: {
          si.d(var8, var9, var10, var11);
          if (((le) var13).field_W == 0) {
            break L15;
          } else {
            if (!((le) var13).field_Db) {
              break L15;
            } else {
              L16: {
                ((le) this).field_zb = -param2 + -((le) var13).field_E + rb.field_m;
                ((le) this).field_tb = j.field_c + (-((le) var13).field_wb + -param0);
                if (((le) var13).field_tb < 0) {
                  ((le) this).field_tb = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (((le) var13).field_zb >= 0) {
                  break L17;
                } else {
                  ((le) this).field_zb = 0;
                  break L17;
                }
              }
              L18: {
                if (((le) var13).field_tb <= -((le) var13).field_qb + param5) {
                  break L18;
                } else {
                  ((le) this).field_tb = -((le) var13).field_qb + param5;
                  break L18;
                }
              }
              L19: {
                ((le) this).field_K = param0 + ((le) var13).field_tb;
                ((le) this).field_z = 0;
                ((le) this).field_ib = 0;
                if (((le) var13).field_zb <= -((le) var13).field_sb + param1) {
                  break L19;
                } else {
                  ((le) this).field_zb = param1 - ((le) var13).field_sb;
                  break L19;
                }
              }
              ((le) this).field_mb = ((le) var13).field_zb + param2;
              break L15;
            }
          }
        }
    }

    private final void a(boolean param0, int param1, boolean param2, byte param3, boolean param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        bd[] var17 = null;
        bd var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        int var24_int = 0;
        le var24_ref = null;
        int var25 = 0;
        int var26 = 0;
        String var27 = null;
        String var28 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var24 = null;
          var26 = HostileSpawn.field_I ? 1 : 0;
          ((le) this).field_mb = param1 + ((le) this).field_zb;
          ((le) this).field_K = param7 - -((le) this).field_tb;
          var14 = -49 % ((param3 - -26) / 60);
          var12 = si.field_b;
          var13 = si.field_j;
          var15 = si.field_l;
          var16 = si.field_a;
          si.f(((le) this).field_K, ((le) this).field_mb, ((le) this).field_K + ((le) this).field_qb, ((le) this).field_mb - -((le) this).field_sb);
          if (((le) this).field_y) {
            break L0;
          } else {
            L1: {
              param0 = ((le) this).field_S;
              if (((le) this).field_W == 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            param9 = stackIn_4_0 != 0;
            param8 = ((le) this).field_Cb;
            break L0;
          }
        }
        L2: {
          param4 = param4 & ((le) this).field_jb;
          var17 = ((le) this).field_nb;
          var18 = ((le) this).field_Y;
          var19 = ((le) this).field_T;
          var20 = 0;
          var21 = 0;
          if (param4) {
            break L2;
          } else {
            L3: {
              if (null != ((le) this).field_yb) {
                var17 = ((le) this).field_yb;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == ((le) this).field_vb) {
                break L4;
              } else {
                var18 = ((le) this).field_vb;
                break L4;
              }
            }
            if (0 > ((le) this).field_H) {
              break L2;
            } else {
              var19 = ((le) this).field_H;
              break L2;
            }
          }
        }
        L5: {
          if (param0) {
            L6: {
              if (((le) this).field_O != -2147483648) {
                var20 = ((le) this).field_O;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((le) this).field_Z != -2147483648) {
                var21 = ((le) this).field_Z;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((le) this).field_pb == null) {
                break L8;
              } else {
                var18 = ((le) this).field_pb;
                break L8;
              }
            }
            L9: {
              if (null == ((le) this).field_Bb) {
                break L9;
              } else {
                var17 = ((le) this).field_Bb;
                break L9;
              }
            }
            if (((le) this).field_v >= 0) {
              var19 = ((le) this).field_v;
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L10: {
          if (param9) {
            L11: {
              if (((le) this).field_x == -2147483648) {
                break L11;
              } else {
                var21 = ((le) this).field_x;
                break L11;
              }
            }
            L12: {
              if (((le) this).field_A >= 0) {
                var19 = ((le) this).field_A;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (((le) this).field_kb != -2147483648) {
                var20 = ((le) this).field_kb;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (null != ((le) this).field_cb) {
                var18 = ((le) this).field_cb;
                break L14;
              } else {
                break L14;
              }
            }
            if (((le) this).field_Ab != null) {
              var17 = ((le) this).field_Ab;
              break L10;
            } else {
              break L10;
            }
          } else {
            break L10;
          }
        }
        L15: {
          if (param8) {
            L16: {
              if (((le) this).field_V == null) {
                break L16;
              } else {
                var17 = ((le) this).field_V;
                break L16;
              }
            }
            L17: {
              if (null != ((le) this).field_P) {
                var18 = ((le) this).field_P;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (((le) this).field_hb == -2147483648) {
                break L18;
              } else {
                var20 = ((le) this).field_hb;
                break L18;
              }
            }
            L19: {
              if (((le) this).field_M != -2147483648) {
                var21 = ((le) this).field_M;
                break L19;
              } else {
                break L19;
              }
            }
            if (((le) this).field_w >= 0) {
              var19 = ((le) this).field_w;
              break L15;
            } else {
              break L15;
            }
          } else {
            break L15;
          }
        }
        L20: {
          var22 = var20 + ((le) this).field_J;
          var23 = var21 + ((le) this).field_ob;
          if (!((le) this).field_B) {
            hm.a(((le) this).field_qb, var17, false, ((le) this).field_sb, ((le) this).field_mb, ((le) this).field_K);
            break L20;
          } else {
            hm.a(param5, var17, false, param10, param1, param7);
            break L20;
          }
        }
        L21: {
          if (var18 == null) {
            break L21;
          } else {
            L22: {
              var24_int = var22 + ((le) this).field_K;
              if (((le) this).field_U == 1) {
                var24_int = var24_int + (((le) this).field_qb - var18.field_u) / 2;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var25 = var23 + ((le) this).field_mb;
              if (((le) this).field_G != 1) {
                break L23;
              } else {
                var25 = var25 + (((le) this).field_sb + -var18.field_r) / 2;
                break L23;
              }
            }
            L24: {
              if (((le) this).field_U == 2) {
                var24_int = var24_int + (((le) this).field_qb + -var18.field_u);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (((le) this).field_G != 2) {
                break L25;
              } else {
                var25 = var25 + (-var18.field_r + ((le) this).field_sb);
                break L25;
              }
            }
            if (((le) this).field_db < 256) {
              var18.b(var24_int, var25, ((le) this).field_db);
              break L21;
            } else {
              var18.e(var24_int, var25);
              break L21;
            }
          }
        }
        L26: {
          if (((le) this).field_fb == null) {
            break L26;
          } else {
            if (((le) this).field_ab == null) {
              break L26;
            } else {
              L27: {
                var27 = ((le) this).field_fb;
                var28 = var27;
                var28 = var27;
                if (!param2) {
                  break L27;
                } else {
                  if (((le) this).field_F == null) {
                    break L27;
                  } else {
                    var28 = var27 + ((le) this).field_F;
                    break L27;
                  }
                }
              }
              L28: {
                if (((le) this).field_ab.a(var28) > -(2 * ((le) this).field_L) + ((le) this).field_qb) {
                  break L28;
                } else {
                  if (0 <= var28.indexOf("<br>")) {
                    break L28;
                  } else {
                    L29: {
                      if (((le) this).field_G == 1) {
                        var23 = var23 + (-((le) this).field_ab.field_y + (((le) this).field_sb - ((le) this).field_ab.field_F)) / 2;
                        break L29;
                      } else {
                        if (((le) this).field_G == 2) {
                          var23 = var23 + (-((le) this).field_ab.field_y + ((le) this).field_sb - ((le) this).field_ab.field_F);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (0 != ((le) this).field_U) {
                      if (((le) this).field_U == 1) {
                        ((le) this).field_ab.a(var28, (((le) this).field_qb + -(((le) this).field_L * 2)) / 2 + var22 + (((le) this).field_K - -((le) this).field_L), var23 + ((le) this).field_mb + ((le) this).field_ab.field_y, var19, -1, ((le) this).field_rb);
                        break L26;
                      } else {
                        if (((le) this).field_U == 2) {
                          ((le) this).field_ab.c(var28, ((le) this).field_K - (-((le) this).field_L - var22 - -(((le) this).field_L * 2)) + ((le) this).field_qb, ((le) this).field_mb + (var23 + ((le) this).field_ab.field_y), var19, -1, ((le) this).field_rb);
                          break L26;
                        } else {
                          int discarded$2 = ((le) this).field_ab.a(var28, var22 + (((le) this).field_L + ((le) this).field_K), var23 + ((le) this).field_mb, ((le) this).field_qb + -(((le) this).field_L * 2), ((le) this).field_sb, var19, -1, ((le) this).field_rb, ((le) this).field_U, ((le) this).field_G, ((le) this).field_R);
                          break L26;
                        }
                      }
                    } else {
                      ((le) this).field_ab.b(var28, var22 + ((le) this).field_K + ((le) this).field_L, ((le) this).field_ab.field_y + ((le) this).field_mb - -var23, var19, -1, ((le) this).field_rb);
                      break L26;
                    }
                  }
                }
              }
              int discarded$3 = ((le) this).field_ab.a(var28, ((le) this).field_K - -((le) this).field_L - -var22, ((le) this).field_mb - -var23, ((le) this).field_qb - 2 * ((le) this).field_L, ((le) this).field_sb, var19, -1, ((le) this).field_rb, ((le) this).field_U, ((le) this).field_G, ((le) this).field_R);
              break L26;
            }
          }
        }
        L30: {
          if (((le) this).field_I == null) {
            break L30;
          } else {
            var24_ref = (le) (Object) ((le) this).field_I.g(-24);
            L31: while (true) {
              if (var24_ref == null) {
                break L30;
              } else {
                var24_ref.a(param0, var21 + var24_ref.field_mb, param2, (byte) -88, param4, var24_ref.field_qb, var24_ref.field_lb, var24_ref.field_K - -var20, param8, param9, var24_ref.field_sb);
                var24_ref = (le) (Object) var24_ref.field_I.a(12684);
                continue L31;
              }
            }
          }
        }
        si.d(var12, var13, var15, var16);
    }

    public static void e() {
        field_xb = null;
        field_ub = null;
    }

    final void a(boolean param0, le param1) {
        try {
            if (((le) this).field_I == null) {
                ((le) this).field_I = new vl();
            }
            if (param0) {
                ((le) this).a(true, false);
            }
            ((le) this).field_I.a((am) (Object) param1, 92);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "le.KA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(le param0) {
        RuntimeException var3 = null;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_64_0 = null;
        Object stackOut_65_0 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  L3: {
                    if (null == param0.field_fb) {
                      break L3;
                    } else {
                      ((le) this).field_fb = param0.field_fb;
                      break L3;
                    }
                  }
                  L4: {
                    if (param0.field_yb == null) {
                      break L4;
                    } else {
                      ((le) this).field_yb = param0.field_yb;
                      break L4;
                    }
                  }
                  L5: {
                    if (param0.field_B) {
                      ((le) this).field_B = param0.field_B;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (null != param0.field_cb) {
                      ((le) this).field_cb = param0.field_cb;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (null == param0.field_Ab) {
                      break L7;
                    } else {
                      ((le) this).field_Ab = param0.field_Ab;
                      break L7;
                    }
                  }
                  L8: {
                    if (param0.field_H < 0) {
                      break L8;
                    } else {
                      ((le) this).field_H = param0.field_H;
                      break L8;
                    }
                  }
                  L9: {
                    if (param0.field_L == 0) {
                      break L9;
                    } else {
                      ((le) this).field_L = param0.field_L;
                      break L9;
                    }
                  }
                  L10: {
                    if (null == param0.field_ab) {
                      break L10;
                    } else {
                      ((le) this).field_ab = param0.field_ab;
                      break L10;
                    }
                  }
                  L11: {
                    if (null != param0.field_pb) {
                      ((le) this).field_pb = param0.field_pb;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (param0.field_F == null) {
                      break L12;
                    } else {
                      ((le) this).field_F = param0.field_F;
                      break L12;
                    }
                  }
                  L13: {
                    if (param0.field_A < 0) {
                      break L13;
                    } else {
                      ((le) this).field_A = param0.field_A;
                      break L13;
                    }
                  }
                  L14: {
                    if (null != param0.field_nb) {
                      ((le) this).field_nb = param0.field_nb;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (param0.field_V != null) {
                      ((le) this).field_V = param0.field_V;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (!param0.field_C) {
                      break L16;
                    } else {
                      ((le) this).field_C = param0.field_C;
                      break L16;
                    }
                  }
                  L17: {
                    if (param0.field_Cb) {
                      ((le) this).field_Cb = param0.field_Cb;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (null == param0.field_Bb) {
                      break L18;
                    } else {
                      ((le) this).field_Bb = param0.field_Bb;
                      break L18;
                    }
                  }
                  L19: {
                    if (null == param0.field_vb) {
                      break L19;
                    } else {
                      ((le) this).field_vb = param0.field_vb;
                      break L19;
                    }
                  }
                  L20: {
                    if (param0.field_T != 0) {
                      ((le) this).field_T = param0.field_T;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (param0.field_R != 0) {
                      ((le) this).field_R = param0.field_R;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (0 > param0.field_w) {
                      break L22;
                    } else {
                      ((le) this).field_w = param0.field_w;
                      break L22;
                    }
                  }
                  L23: {
                    if (!param0.field_y) {
                      break L23;
                    } else {
                      ((le) this).field_y = param0.field_y;
                      break L23;
                    }
                  }
                  L24: {
                    if (param0.field_jb) {
                      break L24;
                    } else {
                      ((le) this).field_jb = param0.field_jb;
                      break L24;
                    }
                  }
                  L25: {
                    if (param0.field_P == null) {
                      break L25;
                    } else {
                      ((le) this).field_P = param0.field_P;
                      break L25;
                    }
                  }
                  L26: {
                    if (256 == param0.field_rb) {
                      break L26;
                    } else {
                      ((le) this).field_rb = param0.field_rb;
                      break L26;
                    }
                  }
                  L27: {
                    if (param0.field_v < 0) {
                      break L27;
                    } else {
                      ((le) this).field_v = param0.field_v;
                      break L27;
                    }
                  }
                  L28: {
                    if (param0.field_Y != null) {
                      ((le) this).field_Y = param0.field_Y;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (param0.field_O == -2147483648) {
                      break L29;
                    } else {
                      ((le) this).field_O = param0.field_O;
                      break L29;
                    }
                  }
                  L30: {
                    L31: {
                      stackOut_64_0 = this;
                      stackIn_67_0 = stackOut_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      if (!((le) this).field_C) {
                        break L31;
                      } else {
                        stackOut_65_0 = this;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_66_0 = stackOut_65_0;
                        if (!param0.field_lb) {
                          break L31;
                        } else {
                          stackOut_66_0 = this;
                          stackOut_66_1 = 1;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          break L30;
                        }
                      }
                    }
                    stackOut_67_0 = this;
                    stackOut_67_1 = 0;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    break L30;
                  }
                  L32: {
                    ((le) this).field_lb = stackIn_68_1 != 0;
                    if (0 != param0.field_ob) {
                      ((le) this).field_ob = param0.field_ob;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  L33: {
                    if (0 != param0.field_G) {
                      ((le) this).field_G = param0.field_G;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  L34: {
                    if (param0.field_kb != -2147483648) {
                      ((le) this).field_kb = param0.field_kb;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    if (0 != param0.field_U) {
                      ((le) this).field_U = param0.field_U;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (-2147483648 != param0.field_M) {
                      ((le) this).field_M = param0.field_M;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (param0.field_x == -2147483648) {
                      break L37;
                    } else {
                      ((le) this).field_x = param0.field_x;
                      break L37;
                    }
                  }
                  L38: {
                    if (param0.field_Z == -2147483648) {
                      break L38;
                    } else {
                      ((le) this).field_Z = param0.field_Z;
                      break L38;
                    }
                  }
                  L39: {
                    if (param0.field_J != 0) {
                      ((le) this).field_J = param0.field_J;
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  L40: {
                    if (param0.field_hb != -2147483648) {
                      ((le) this).field_hb = param0.field_hb;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  if (!param0.field_Db) {
                    break L2;
                  } else {
                    ((le) this).field_Db = param0.field_Db;
                    break L1;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var3;
            stackOut_96_1 = new StringBuilder().append("le.JA(");
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L41;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L41;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + 44 + 7957 + 41);
        }
    }

    le(long param0, le param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(boolean param0, boolean param1) {
        wc.field_u = !param0 ? true : false;
        ob.field_n = !param0 ? true : false;
        this.a(0, si.field_k, 0, param1, (byte) 48, si.field_e);
    }

    private le(long param0, le param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((le) this).field_M = -2147483648;
        ((le) this).field_hb = -2147483648;
        ((le) this).field_x = -2147483648;
        ((le) this).field_Z = -2147483648;
        ((le) this).field_jb = true;
        ((le) this).field_w = -1;
        ((le) this).field_kb = -2147483648;
        ((le) this).field_rb = 256;
        ((le) this).field_A = -1;
        ((le) this).field_C = false;
        ((le) this).field_O = -2147483648;
        ((le) this).field_db = 256;
        ((le) this).field_lb = false;
        ((le) this).field_H = -1;
        ((le) this).field_v = -1;
        try {
          L0: {
            L1: {
              ((le) this).field_tb = param2;
              ((le) this).field_sb = param5;
              ((le) this).field_zb = param3;
              ((le) this).field_qb = param4;
              ((le) this).field_c = param0;
              int discarded$2 = 7957;
              this.a(param1);
              if (param6 == null) {
                break L1;
              } else {
                ((le) this).field_fb = param6;
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
            stackOut_4_1 = new StringBuilder().append("le.<init>(").append(param0).append(44);
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
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
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = 0;
    }
}
