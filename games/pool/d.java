/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class d {
    static eg field_b;
    static qq field_d;
    static dd[] field_a;
    static vh field_e;
    static vh field_c;
    static vh field_f;

    public static void a(byte param0) {
        int var1 = -51 / ((param0 - -42) / 53);
        field_f = null;
        field_b = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static void a(eg param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        L0: {
          var15 = Pool.field_O;
          param0.a();
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          if (param1 == -23109) {
            break L0;
          } else {
            var16 = null;
            d.a((eg) null, -11);
            break L0;
          }
        }
        var6 = -32768;
        var7 = -32768;
        var8 = new int[][]{param0.field_N, param0.field_v, param0.field_X};
        var9 = 0;
        L1: while (true) {
          if (var9 >= param0.field_K) {
            param0.field_S = (short)var6;
            param0.field_D = (short)var2;
            param0.field_w = (short)var5;
            param0.field_y = (short)var3;
            param0.field_x = (short)var7;
            param0.field_V = (short)var4;
            return;
          } else {
            L2: {
              if (param0.field_Q == null) {
                break L2;
              } else {
                if (-3 != (param0.field_Q[var9] ^ -1)) {
                  break L2;
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
            var10 = 0;
            L3: while (true) {
              if (3 > var10) {
                L4: {
                  var11 = var8[var10][var9];
                  var12 = param0.field_g[var11];
                  var13 = param0.field_Y[var11];
                  if (var12 < var2) {
                    var2 = var12;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 >= var12) {
                    break L5;
                  } else {
                    var5 = var12;
                    break L5;
                  }
                }
                L6: {
                  if (var6 < var13) {
                    var6 = var13;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var14 = param0.field_q[var11];
                  if (var3 > var13) {
                    var3 = var13;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var7 < var14) {
                    var7 = var14;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (var14 < var4) {
                  var4 = var14;
                  var10++;
                  continue L3;
                } else {
                  var10++;
                  continue L3;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1, boolean param2) {
        int var3 = 0;
        ko var4 = null;
        Object var5_ref = null;
        int var5 = 0;
        eo var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        kn var16 = null;
        kn var17 = null;
        of stackIn_1_0 = null;
        boolean stackIn_1_1 = false;
        of stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        of stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_3_2 = 0;
        vh stackIn_18_0 = null;
        vh stackIn_19_0 = null;
        vh stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_23_0 = 0;
        of stackOut_0_0 = null;
        boolean stackOut_0_1 = false;
        of stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        of stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        int stackOut_1_2 = 0;
        vh stackOut_17_0 = null;
        vh stackOut_19_0 = null;
        String stackOut_19_1 = null;
        vh stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          stackOut_0_0 = cp.field_c.field_Sb;
          stackOut_0_1 = param2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (cp.field_c.field_Sb != pf.field_c) {
            stackOut_2_0 = (of) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (of) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ((of) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0, 2, (byte) 115, ad.field_x + 2, param0 * (3 * ad.field_x - -6)) ? 1 : 0;
            var4 = cp.field_c.field_Mb.field_T;
            if (th.field_a == 2) {
              break L2;
            } else {
              if (-2 == (th.field_a ^ -1)) {
                break L2;
              } else {
                cp.field_c.field_pb = false;
                cp.field_c.field_Sb.field_Sb.field_nb = o.field_A;
                mq.a(cp.field_c.field_Mb, (byte) 109);
                break L1;
              }
            }
          }
          cp.field_c.field_pb = true;
          cp.field_c.field_Sb.field_Sb.field_nb = null;
          var5_ref = null;
          var6 = (eo) (Object) var4.c((byte) -127);
          L3: while (true) {
            if (var6 == null) {
              L4: {
                if (0 == cp.field_c.field_Ob.field_R) {
                  break L4;
                } else {
                  sm.field_C = new aj(cp.field_c.field_Ob.field_sb, cp.field_c.field_Ob.field_ib, cp.field_c.field_Ob.field_gb, cp.field_c.field_Ob.field_Db, qf.field_l, wa.field_qb, uo.field_Lb, uo.field_Lb);
                  ne.field_m = 2;
                  break L4;
                }
              }
              if (cp.field_c.field_Qb.field_R == 0) {
                break L1;
              } else {
                sm.field_C = new aj(cp.field_c.field_Qb.field_sb, cp.field_c.field_Qb.field_ib, cp.field_c.field_Qb.field_gb, cp.field_c.field_Qb.field_Db, jj.field_R, wa.field_qb, uo.field_Lb, uo.field_Lb);
                ne.field_m = 3;
                break L1;
              }
            } else {
              L5: {
                var7 = 0;
                if (var6.field_T == null) {
                  var6.field_Pb = new vh(0L, ge.field_s);
                  var6.a(-99, var6.field_Pb);
                  var6.field_Ob = new vh(0L, ge.field_s);
                  var6.a(-120, var6.field_Ob);
                  var6.d((byte) -127);
                  var7 = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var6.field_gb = cp.field_c.field_Mb.field_gb;
                var6.field_Pb.b(0, 2147483647, 0, var6.field_gb, ad.field_x);
                var8 = 0;
                if (var6.field_Sb == null) {
                  break L6;
                } else {
                  if (!var6.field_Sb.equals((Object) (Object) "")) {
                    var6.field_Ob.field_K = 16737894;
                    var6.field_Ob.field_hb = oi.field_o;
                    var8 = 1;
                    var6.field_Ob.b(0, 2147483647, 0, oi.field_o.field_w + 3, ad.field_x);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                var9 = 0;
                var10 = var6.field_gb;
                if (var8 == 0) {
                  break L7;
                } else {
                  var9 = oi.field_o.field_w + 3;
                  var10 = var10 - var9;
                  break L7;
                }
              }
              L8: {
                stackOut_17_0 = var6.field_Pb;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (-1 <= (var10 ^ -1)) {
                  stackOut_19_0 = (vh) (Object) stackIn_19_0;
                  stackOut_19_1 = var6.field_Zb;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L8;
                } else {
                  stackOut_18_0 = (vh) (Object) stackIn_18_0;
                  stackOut_18_1 = lr.a(var6.field_Pb.field_I, var6.field_Zb, var10);
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  break L8;
                }
              }
              L9: {
                stackIn_20_0.field_nb = stackIn_20_1;
                if (var6.field_Pb.field_nb.equals((Object) (Object) var6.field_Zb)) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L9;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  break L9;
                }
              }
              L10: {
                var11 = stackIn_23_0;
                var6.field_Pb.b(0, 2147483647, var9, var10, ad.field_x);
                if (var3 == 0) {
                  var6.field_Cb = ad.field_x - var6.field_Db;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var7 == 0) {
                  break L11;
                } else {
                  cp.field_c.field_Mb.a((vh) var5_ref, 2, (vh) (Object) var6, -41);
                  break L11;
                }
              }
              L12: {
                L13: {
                  if (var6.field_Ob == null) {
                    break L13;
                  } else {
                    if (var6.field_Ob.field_W) {
                      kk.field_B = var6.field_Sb;
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (!var6.field_Pb.field_W) {
                  break L12;
                } else {
                  if (var11 != 0) {
                    kk.field_B = var6.field_Zb;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L14: {
                if (0 == var6.field_R) {
                  break L14;
                } else {
                  dr.a(var6.field_Zb, -1, 0L, -1, cp.field_c.field_Sb, var6.field_Yb, 32540, (vh) (Object) var6, (int[]) null);
                  var16 = vl.field_m;
                  var13_ref_String = tp.field_f;
                  var16.field_n.a(var13_ref_String, 17130, 7);
                  var17 = vl.field_m;
                  var13 = lq.field_W;
                  var14 = ua.field_o;
                  var17.field_n.c(0, 0, var13, 0, var14);
                  break L14;
                }
              }
              var5_ref = (Object) (Object) var6;
              var6 = (eo) (Object) var4.f((byte) -5);
              continue L3;
            }
          }
        }
        var5 = 46 / ((-55 - param1) / 44);
    }

    final static void a(kh param0, int param1, ge param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kh stackIn_4_0 = null;
        kh stackIn_5_0 = null;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_7_0 = null;
        kh stackIn_8_0 = null;
        kh stackIn_9_0 = null;
        kh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        kh stackIn_11_0 = null;
        kh stackIn_12_0 = null;
        kh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        kh stackIn_14_0 = null;
        kh stackIn_15_0 = null;
        kh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        kh stackIn_17_0 = null;
        kh stackIn_18_0 = null;
        kh stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        kh stackIn_20_0 = null;
        kh stackIn_21_0 = null;
        kh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        kh stackOut_3_0 = null;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        kh stackOut_6_0 = null;
        kh stackOut_7_0 = null;
        kh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        kh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        kh stackOut_10_0 = null;
        kh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        kh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        kh stackOut_13_0 = null;
        kh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        kh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        kh stackOut_16_0 = null;
        kh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        kh stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        kh stackOut_19_0 = null;
        kh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        kh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var10 = Pool.field_O;
          if (param3) {
            param0.field_mc = param2.g(-67);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          param0.field_Nb = param2.g(-70);
          param0.field_ac = param2.g(-124);
          var4 = param2.g(-124);
          var5 = 36 / ((63 - param1) / 46);
          stackOut_3_0 = (kh) param0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((128 & var4) == 0) {
            stackOut_5_0 = (kh) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (kh) (Object) stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          L3: {
            stackIn_6_0.field_Qb = stackIn_6_1 != 0;
            stackOut_6_0 = (kh) param0;
            stackIn_9_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (!param0.field_Qb) {
              break L3;
            } else {
              stackOut_7_0 = (kh) (Object) stackIn_7_0;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (param0.field_mc >= param0.field_Nb) {
                break L3;
              } else {
                stackOut_8_0 = (kh) (Object) stackIn_8_0;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L2;
              }
            }
          }
          stackOut_9_0 = (kh) (Object) stackIn_9_0;
          stackOut_9_1 = 0;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          break L2;
        }
        L4: {
          stackIn_10_0.field_ic = stackIn_10_1 != 0;
          stackOut_10_0 = (kh) param0;
          stackIn_12_0 = stackOut_10_0;
          stackIn_11_0 = stackOut_10_0;
          if ((32 & var4) == 0) {
            stackOut_12_0 = (kh) (Object) stackIn_12_0;
            stackOut_12_1 = 0;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            break L4;
          } else {
            stackOut_11_0 = (kh) (Object) stackIn_11_0;
            stackOut_11_1 = 1;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            break L4;
          }
        }
        L5: {
          stackIn_13_0.field_wc = stackIn_13_1 != 0;
          stackOut_13_0 = (kh) param0;
          stackIn_15_0 = stackOut_13_0;
          stackIn_14_0 = stackOut_13_0;
          if ((8 & var4) == 0) {
            stackOut_15_0 = (kh) (Object) stackIn_15_0;
            stackOut_15_1 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            break L5;
          } else {
            stackOut_14_0 = (kh) (Object) stackIn_14_0;
            stackOut_14_1 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            break L5;
          }
        }
        L6: {
          stackIn_16_0.field_Dc = stackIn_16_1 != 0;
          stackOut_16_0 = (kh) param0;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if ((var4 & 64) == 0) {
            stackOut_18_0 = (kh) (Object) stackIn_18_0;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L6;
          } else {
            stackOut_17_0 = (kh) (Object) stackIn_17_0;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L6;
          }
        }
        L7: {
          stackIn_19_0.field_ec = stackIn_19_1 != 0;
          stackOut_19_0 = (kh) param0;
          stackIn_21_0 = stackOut_19_0;
          stackIn_20_0 = stackOut_19_0;
          if (-1 == (var4 & 16 ^ -1)) {
            stackOut_21_0 = (kh) (Object) stackIn_21_0;
            stackOut_21_1 = 1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            break L7;
          } else {
            stackOut_20_0 = (kh) (Object) stackIn_20_0;
            stackOut_20_1 = 2;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            break L7;
          }
        }
        L8: {
          stackIn_22_0.field_Yb = stackIn_22_1;
          if (0 == (4 & var4)) {
            stackOut_24_0 = 0;
            stackIn_25_0 = stackOut_24_0;
            break L8;
          } else {
            stackOut_23_0 = 1;
            stackIn_25_0 = stackOut_23_0;
            break L8;
          }
        }
        L9: {
          var6 = stackIn_25_0;
          param2.a(0, (byte) -127, param0.field_tc, param0.field_tc.length);
          if ((var4 & 2) == 0) {
            stackOut_27_0 = 0;
            stackIn_28_0 = stackOut_27_0;
            break L9;
          } else {
            stackOut_26_0 = 1;
            stackIn_28_0 = stackOut_26_0;
            break L9;
          }
        }
        L10: {
          var7 = stackIn_28_0;
          param0.field_pc = param2.d(-1034);
          param0.field_sc = rl.a((byte) -95) + -(long)param2.b(true);
          if (var6 != 0) {
            param0.field_qc = param2.b(true);
            break L10;
          } else {
            param0.field_qc = -1;
            break L10;
          }
        }
        L11: {
          param0.field_Zb = param2.h(-412303328);
          var8 = param2.field_v;
          param0.field_Ob = param2.j(-57);
          if (var7 == 0) {
            param0.field_bc = null;
            break L11;
          } else {
            param2.field_v = var8;
            param0.field_bc = new String[param0.field_mc];
            var9 = 0;
            L12: while (true) {
              if (param0.field_mc <= var9) {
                break L11;
              } else {
                param0.field_bc[var9] = param2.j(-72);
                var9++;
                continue L12;
              }
            }
          }
        }
    }

    static {
    }
}
