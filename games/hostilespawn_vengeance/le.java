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
        le var13_ref = null;
        int var14 = 0;
        Object var15 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        L0: {
          var13 = null;
          var14 = HostileSpawn.field_I ? 1 : 0;
          if (((le) this).field_ib > 0) {
            var7 = -(-((le) this).field_ib >> -862971454);
            break L0;
          } else {
            var7 = ((le) this).field_ib >> 718157282;
            break L0;
          }
        }
        L1: {
          ((le) this).field_ib = ((le) this).field_ib - var7;
          ((le) this).field_tb = ((le) this).field_tb + var7;
          if (0 < ((le) this).field_z) {
            var7 = -(-((le) this).field_z >> 246720034);
            break L1;
          } else {
            var7 = ((le) this).field_z >> 275754498;
            break L1;
          }
        }
        L2: {
          ((le) this).field_z = ((le) this).field_z - var7;
          ((le) this).field_zb = ((le) this).field_zb + var7;
          if (((le) this).field_X <= 0) {
            var7 = ((le) this).field_X >> -1417812030;
            break L2;
          } else {
            var7 = -(-((le) this).field_X >> 1905627266);
            break L2;
          }
        }
        L3: {
          ((le) this).field_qb = ((le) this).field_qb + var7;
          ((le) this).field_X = ((le) this).field_X - var7;
          if (param4 == 48) {
            break L3;
          } else {
            var15 = null;
            this.a((le) null, 87);
            break L3;
          }
        }
        L4: {
          if (-1 > (((le) this).field_N ^ -1)) {
            var7 = -(-((le) this).field_N >> 2124894978);
            break L4;
          } else {
            var7 = ((le) this).field_N >> 2099082242;
            break L4;
          }
        }
        L5: {
          L6: {
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
              break L6;
            } else {
              if (!param3) {
                break L6;
              } else {
                if (pf.field_o == 0) {
                  break L6;
                } else {
                  if (si.field_b > ec.field_a) {
                    break L6;
                  } else {
                    if (si.field_l <= ec.field_a) {
                      break L6;
                    } else {
                      if (si.field_j > rc.field_b) {
                        break L6;
                      } else {
                        if (rc.field_b < si.field_a) {
                          var12 = 1;
                          ((le) this).field_E = -((le) this).field_mb + rc.field_b;
                          ((le) this).field_wb = ec.field_a - ((le) this).field_K;
                          ((le) this).field_W = pf.field_o;
                          ((le) this).field_Q = pf.field_o;
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((le) this).field_Q = 0;
          if (-1 != (pf.field_o ^ -1)) {
            ((le) this).field_W = 0;
            break L5;
          } else {
            break L5;
          }
        }
        L7: {
          if (0 == ig.field_L) {
            ((le) this).field_W = 0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          L9: {
            stackOut_29_0 = this;
            stackIn_35_0 = stackOut_29_0;
            stackIn_30_0 = stackOut_29_0;
            if (wc.field_u) {
              break L9;
            } else {
              stackOut_30_0 = this;
              stackIn_35_0 = stackOut_30_0;
              stackIn_31_0 = stackOut_30_0;
              if (j.field_c < si.field_b) {
                break L9;
              } else {
                stackOut_31_0 = this;
                stackIn_35_0 = stackOut_31_0;
                stackIn_32_0 = stackOut_31_0;
                if (si.field_l <= j.field_c) {
                  break L9;
                } else {
                  stackOut_32_0 = this;
                  stackIn_35_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if (si.field_j > rb.field_m) {
                    break L9;
                  } else {
                    stackOut_33_0 = this;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_34_0 = stackOut_33_0;
                    if (rb.field_m >= si.field_a) {
                      break L9;
                    } else {
                      stackOut_34_0 = this;
                      stackOut_34_1 = 1;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      break L8;
                    }
                  }
                }
              }
            }
          }
          stackOut_35_0 = this;
          stackOut_35_1 = 0;
          stackIn_36_0 = stackOut_35_0;
          stackIn_36_1 = stackOut_35_1;
          break L8;
        }
        L10: {
          L11: {
            ((le) this).field_Eb = stackIn_36_1 != 0;
            stackOut_36_0 = this;
            stackIn_40_0 = stackOut_36_0;
            stackIn_37_0 = stackOut_36_0;
            if (!((le) this).field_Eb) {
              break L11;
            } else {
              stackOut_37_0 = this;
              stackIn_40_0 = stackOut_37_0;
              stackIn_38_0 = stackOut_37_0;
              if (ig.field_L != ((le) this).field_W) {
                break L11;
              } else {
                stackOut_38_0 = this;
                stackIn_40_0 = stackOut_38_0;
                stackIn_39_0 = stackOut_38_0;
                if (!param3) {
                  break L11;
                } else {
                  stackOut_39_0 = this;
                  stackOut_39_1 = 1;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  break L10;
                }
              }
            }
          }
          stackOut_40_0 = this;
          stackOut_40_1 = 0;
          stackIn_41_0 = stackOut_40_0;
          stackIn_41_1 = stackOut_40_1;
          break L10;
        }
        L12: {
          ((le) this).field_S = stackIn_41_1 != 0;
          if (((le) this).field_I != null) {
            var13_ref = (le) (Object) ((le) this).field_I.b((byte) 117);
            L13: while (true) {
              if (var13_ref == null) {
                break L12;
              } else {
                var13_ref.a(var13_ref.field_K, var13_ref.field_sb, var13_ref.field_mb, param3, (byte) 48, var13_ref.field_qb);
                var13_ref = (le) (Object) var13_ref.field_I.a((byte) 110);
                continue L13;
              }
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (!var13_ref.field_Eb) {
            break L14;
          } else {
            wc.field_u = true;
            break L14;
          }
        }
        L15: {
          if (var12 == 0) {
            break L15;
          } else {
            ob.field_n = true;
            break L15;
          }
        }
        L16: {
          si.d(var8, var9, var10, var11);
          if (var13_ref.field_W == 0) {
            break L16;
          } else {
            if (!var13_ref.field_Db) {
              break L16;
            } else {
              L17: {
                ((le) this).field_zb = -param2 + -var13_ref.field_E + rb.field_m;
                ((le) this).field_tb = j.field_c + (-var13_ref.field_wb + -param0);
                if ((var13_ref.field_tb ^ -1) > -1) {
                  ((le) this).field_tb = 0;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if ((var13_ref.field_zb ^ -1) <= -1) {
                  break L18;
                } else {
                  ((le) this).field_zb = 0;
                  break L18;
                }
              }
              L19: {
                if (var13_ref.field_tb <= -var13_ref.field_qb + param5) {
                  break L19;
                } else {
                  ((le) this).field_tb = -var13_ref.field_qb + param5;
                  break L19;
                }
              }
              L20: {
                ((le) this).field_K = param0 + var13_ref.field_tb;
                ((le) this).field_z = 0;
                ((le) this).field_ib = 0;
                if (var13_ref.field_zb <= -var13_ref.field_sb + param1) {
                  break L20;
                } else {
                  ((le) this).field_zb = param1 - var13_ref.field_sb;
                  break L20;
                }
              }
              ((le) this).field_mb = var13_ref.field_zb + param2;
              break L16;
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
              if (2147483647 != (((le) this).field_O ^ -1)) {
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
            if (((le) this).field_v <= -1) {
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
              if (2147483647 == ((le) this).field_x) {
                break L11;
              } else {
                var21 = ((le) this).field_x;
                break L11;
              }
            }
            L12: {
              if (-1 >= ((le) this).field_A) {
                var19 = ((le) this).field_A;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (2147483647 != ((le) this).field_kb) {
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
              if (2147483647 == (((le) this).field_hb ^ -1)) {
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
              if (-2 != (((le) this).field_G ^ -1)) {
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
            if (-257 < (((le) this).field_db ^ -1)) {
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
                      if (-2 == ((le) this).field_G) {
                        var23 = var23 + (-((le) this).field_ab.field_y + (((le) this).field_sb - ((le) this).field_ab.field_F)) / 2;
                        break L29;
                      } else {
                        if (-3 == ((le) this).field_G) {
                          var23 = var23 + (-((le) this).field_ab.field_y + ((le) this).field_sb - ((le) this).field_ab.field_F);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (0 != ((le) this).field_U) {
                      if (((le) this).field_U == -2) {
                        ((le) this).field_ab.a(var28, (((le) this).field_qb + -(((le) this).field_L * 2)) / 2 + var22 + (((le) this).field_K - -((le) this).field_L), var23 + ((le) this).field_mb + ((le) this).field_ab.field_y, var19, -1, ((le) this).field_rb);
                        break L26;
                      } else {
                        if (-3 == ((le) this).field_U) {
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

    public static void e(int param0) {
        field_xb = null;
        field_ub = null;
        if (param0 != -3354) {
            field_gb = 4;
        }
    }

    final void a(boolean param0, le param1) {
        if (((le) this).field_I == null) {
            ((le) this).field_I = new vl();
        }
        if (param0) {
            ((le) this).a(true, false);
        }
        ((le) this).field_I.a((am) (Object) param1, 92);
    }

    private final void a(le param0, int param1) {
        Object var4 = null;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackOut_64_0 = null;
        Object stackOut_65_0 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            L1: {
              if (null == param0.field_fb) {
                break L1;
              } else {
                ((le) this).field_fb = param0.field_fb;
                break L1;
              }
            }
            L2: {
              if (param0.field_yb == null) {
                break L2;
              } else {
                ((le) this).field_yb = param0.field_yb;
                break L2;
              }
            }
            L3: {
              if (param0.field_B) {
                ((le) this).field_B = param0.field_B;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null != param0.field_cb) {
                ((le) this).field_cb = param0.field_cb;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == param0.field_Ab) {
                break L5;
              } else {
                ((le) this).field_Ab = param0.field_Ab;
                break L5;
              }
            }
            L6: {
              if (param0.field_H < 0) {
                break L6;
              } else {
                ((le) this).field_H = param0.field_H;
                break L6;
              }
            }
            L7: {
              if (-1 == (param0.field_L ^ -1)) {
                break L7;
              } else {
                ((le) this).field_L = param0.field_L;
                break L7;
              }
            }
            L8: {
              if (null == param0.field_ab) {
                break L8;
              } else {
                ((le) this).field_ab = param0.field_ab;
                break L8;
              }
            }
            L9: {
              if (null != param0.field_pb) {
                ((le) this).field_pb = param0.field_pb;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param0.field_F == null) {
                break L10;
              } else {
                ((le) this).field_F = param0.field_F;
                break L10;
              }
            }
            L11: {
              if (-1 < (param0.field_A ^ -1)) {
                break L11;
              } else {
                ((le) this).field_A = param0.field_A;
                break L11;
              }
            }
            L12: {
              if (null != param0.field_nb) {
                ((le) this).field_nb = param0.field_nb;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (param0.field_V != null) {
                ((le) this).field_V = param0.field_V;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (!param0.field_C) {
                break L14;
              } else {
                ((le) this).field_C = param0.field_C;
                break L14;
              }
            }
            L15: {
              if (param0.field_Cb) {
                ((le) this).field_Cb = param0.field_Cb;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (null == param0.field_Bb) {
                break L16;
              } else {
                ((le) this).field_Bb = param0.field_Bb;
                break L16;
              }
            }
            L17: {
              if (null == param0.field_vb) {
                break L17;
              } else {
                ((le) this).field_vb = param0.field_vb;
                break L17;
              }
            }
            L18: {
              if (-1 != (param0.field_T ^ -1)) {
                ((le) this).field_T = param0.field_T;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (param0.field_R != 0) {
                ((le) this).field_R = param0.field_R;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (0 > param0.field_w) {
                break L20;
              } else {
                ((le) this).field_w = param0.field_w;
                break L20;
              }
            }
            L21: {
              if (!param0.field_y) {
                break L21;
              } else {
                ((le) this).field_y = param0.field_y;
                break L21;
              }
            }
            L22: {
              if (param0.field_jb) {
                break L22;
              } else {
                ((le) this).field_jb = param0.field_jb;
                break L22;
              }
            }
            L23: {
              if (param0.field_P == null) {
                break L23;
              } else {
                ((le) this).field_P = param0.field_P;
                break L23;
              }
            }
            L24: {
              if (256 == param0.field_rb) {
                break L24;
              } else {
                ((le) this).field_rb = param0.field_rb;
                break L24;
              }
            }
            L25: {
              if ((param0.field_v ^ -1) > -1) {
                break L25;
              } else {
                ((le) this).field_v = param0.field_v;
                break L25;
              }
            }
            L26: {
              if (param0.field_Y != null) {
                ((le) this).field_Y = param0.field_Y;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (param0.field_O == -2147483648) {
                break L27;
              } else {
                ((le) this).field_O = param0.field_O;
                break L27;
              }
            }
            L28: {
              L29: {
                stackOut_64_0 = this;
                stackIn_67_0 = stackOut_64_0;
                stackIn_65_0 = stackOut_64_0;
                if (!((le) this).field_C) {
                  break L29;
                } else {
                  stackOut_65_0 = this;
                  stackIn_67_0 = stackOut_65_0;
                  stackIn_66_0 = stackOut_65_0;
                  if (!param0.field_lb) {
                    break L29;
                  } else {
                    stackOut_66_0 = this;
                    stackOut_66_1 = 1;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    break L28;
                  }
                }
              }
              stackOut_67_0 = this;
              stackOut_67_1 = 0;
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              break L28;
            }
            L30: {
              ((le) this).field_lb = stackIn_68_1 != 0;
              if (0 != param0.field_ob) {
                ((le) this).field_ob = param0.field_ob;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (0 != param0.field_G) {
                ((le) this).field_G = param0.field_G;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if ((param0.field_kb ^ -1) != 2147483647) {
                ((le) this).field_kb = param0.field_kb;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (0 != param0.field_U) {
                ((le) this).field_U = param0.field_U;
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              if (-2147483648 != param0.field_M) {
                ((le) this).field_M = param0.field_M;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (2147483647 == (param0.field_x ^ -1)) {
                break L35;
              } else {
                ((le) this).field_x = param0.field_x;
                break L35;
              }
            }
            L36: {
              if ((param0.field_Z ^ -1) == 2147483647) {
                break L36;
              } else {
                ((le) this).field_Z = param0.field_Z;
                break L36;
              }
            }
            L37: {
              if (param0.field_J != -1) {
                ((le) this).field_J = param0.field_J;
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              if (2147483647 != param0.field_hb) {
                ((le) this).field_hb = param0.field_hb;
                break L38;
              } else {
                break L38;
              }
            }
            if (!param0.field_Db) {
              break L0;
            } else {
              ((le) this).field_Db = param0.field_Db;
              break L0;
            }
          }
        }
        L39: {
          if (param1 == 7957) {
            break L39;
          } else {
            var4 = null;
            ((le) this).a(false, (le) null);
            break L39;
          }
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
        ((le) this).field_tb = param2;
        ((le) this).field_sb = param5;
        ((le) this).field_zb = param3;
        ((le) this).field_qb = param4;
        ((le) this).field_c = param0;
        this.a(param1, 7957);
        if (param6 != null) {
            ((le) this).field_fb = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = 0;
    }
}
