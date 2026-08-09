/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        eg var16 = null;
        var15 = Pool.field_O;
        try {
          L0: {
            L1: {
              param0.a();
              var2_int = 32767;
              var3 = 32767;
              var4 = 32767;
              var5 = -32768;
              if (param1 == -23109) {
                break L1;
              } else {
                var16 = (eg) null;
                d.a((eg) null, -11);
                break L1;
              }
            }
            var6 = -32768;
            var7 = -32768;
            var8 = new int[][]{param0.field_N, param0.field_v, param0.field_X};
            var9 = 0;
            L2: while (true) {
              if (var9 >= param0.field_K) {
                param0.field_S = (short)var6;
                param0.field_D = (short)var2_int;
                param0.field_w = (short)var5;
                param0.field_y = (short)var3;
                param0.field_x = (short)var7;
                param0.field_V = (short)var4;
                break L0;
              } else {
                L3: {
                  L4: {
                    if (param0.field_Q == null) {
                      break L4;
                    } else {
                      if (-3 == (param0.field_Q[var9] ^ -1)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var10 = 0;
                  L5: while (true) {
                    if (3 <= var10) {
                      break L3;
                    } else {
                      L6: {
                        var11 = var8[var10][var9];
                        var12 = param0.field_g[var11];
                        var13 = param0.field_Y[var11];
                        if ((var12 ^ -1) > (var2_int ^ -1)) {
                          var2_int = var12;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (var5 >= var12) {
                          break L7;
                        } else {
                          var5 = var12;
                          break L7;
                        }
                      }
                      L8: {
                        if (var6 < var13) {
                          var6 = var13;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        var14 = param0.field_q[var11];
                        if (var3 > var13) {
                          var3 = var13;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (var7 < var14) {
                          var7 = var14;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (var14 < var4) {
                          var4 = var14;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var10++;
                      continue L5;
                    }
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("d.B(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, boolean param2) {
        of stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        of stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_3_2 = 0;
        vh stackIn_19_0 = null;
        vh stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              stackIn_2_0 = cp.field_c.field_Sb;

              stackIn_2_1 = param2;

              if (cp.field_c.field_Sb != pf.field_c) {
                stackIn_3_0 = (of) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = (of) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((of) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0, 2, (byte) 115, ad.field_x + 2, param0 * (3 * ad.field_x - -6)) ? 1 : 0;
                var4 = cp.field_c.field_Mb.field_T;
                if (th.field_a == 2) {
                  break L3;
                } else {
                  if (-2 == (th.field_a ^ -1)) {
                    break L3;
                  } else {
                    cp.field_c.field_pb = false;
                    cp.field_c.field_Sb.field_Sb.field_nb = o.field_A;
                    mq.a(cp.field_c.field_Mb, (byte) 109);
                    break L2;
                  }
                }
              }
              cp.field_c.field_pb = true;
              cp.field_c.field_Sb.field_Sb.field_nb = null;
              var5_ref = null;
              var6 = (eo) ((Object) var4.c((byte) -127));
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (0 == cp.field_c.field_Ob.field_R) {
                      break L5;
                    } else {
                      sm.field_C = new aj(cp.field_c.field_Ob.field_sb, cp.field_c.field_Ob.field_ib, cp.field_c.field_Ob.field_gb, cp.field_c.field_Ob.field_Db, qf.field_l, wa.field_qb, uo.field_Lb, uo.field_Lb);
                      ne.field_m = 2;
                      break L5;
                    }
                  }
                  if (cp.field_c.field_Qb.field_R == 0) {
                    break L2;
                  } else {
                    sm.field_C = new aj(cp.field_c.field_Qb.field_sb, cp.field_c.field_Qb.field_ib, cp.field_c.field_Qb.field_gb, cp.field_c.field_Qb.field_Db, jj.field_R, wa.field_qb, uo.field_Lb, uo.field_Lb);
                    ne.field_m = 3;
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (var6.field_T == null) {
                      var6.field_Pb = new vh(0L, ge.field_s);
                      var6.a(-99, var6.field_Pb);
                      var6.field_Ob = new vh(0L, ge.field_s);
                      var6.a(-120, var6.field_Ob);
                      var6.d((byte) -127);
                      var7 = 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_gb = cp.field_c.field_Mb.field_gb;
                    var6.field_Pb.b(0, 2147483647, 0, var6.field_gb, ad.field_x);
                    var8 = 0;
                    if (var6.field_Sb == null) {
                      break L7;
                    } else {
                      if (!var6.field_Sb.equals("")) {
                        var6.field_Ob.field_K = 16737894;
                        var6.field_Ob.field_hb = oi.field_o;
                        var8 = 1;
                        var6.field_Ob.b(0, 2147483647, 0, oi.field_o.field_w + 3, ad.field_x);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_gb;
                    if (var8 == 0) {
                      break L8;
                    } else {
                      var9 = oi.field_o.field_w + 3;
                      var10 = var10 - var9;
                      break L8;
                    }
                  }
                  L9: {
                    stackIn_19_0 = var6.field_Pb;

                    if (-1 <= (var10 ^ -1)) {
                      stackIn_20_0 = (vh) ((Object) stackIn_19_0);
                      stackIn_20_1 = var6.field_Zb;
                      break L9;
                    } else {
                      stackIn_20_0 = (vh) ((Object) stackIn_19_0);
                      stackIn_20_1 = lr.a(var6.field_Pb.field_I, var6.field_Zb, var10);
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_20_0.field_nb = stackIn_20_1;
                    if (var6.field_Pb.field_nb.equals(var6.field_Zb)) {
                      stackIn_23_0 = 0;
                      break L10;
                    } else {
                      stackIn_23_0 = 1;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_23_0;
                    var6.field_Pb.b(0, 2147483647, var9, var10, ad.field_x);
                    if (var3_int == 0) {
                      var6.field_Cb = ad.field_x - var6.field_Db;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 == 0) {
                      break L12;
                    } else {
                      cp.field_c.field_Mb.a((vh) (var5_ref), 2, var6, -41);
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (var6.field_Ob == null) {
                        break L14;
                      } else {
                        if (var6.field_Ob.field_W) {
                          kk.field_B = var6.field_Sb;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Pb.field_W) {
                      break L13;
                    } else {
                      if (var11 != 0) {
                        kk.field_B = var6.field_Zb;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (0 == var6.field_R) {
                      break L15;
                    } else {
                      dr.a(var6.field_Zb, -1, 0L, -1, cp.field_c.field_Sb, var6.field_Yb, 32540, var6, (int[]) null);
                      var16 = vl.field_m;
                      var13_ref_String = tp.field_f;
                      var16.field_n.a(var13_ref_String, 17130, 7);
                      var17 = vl.field_m;
                      var13 = lq.field_W;
                      var14 = ua.field_o;
                      var17.field_n.c(0, 0, var13, 0, var14);
                      break L15;
                    }
                  }
                  var5_ref = var6;
                  var6 = (eo) ((Object) var4.f((byte) -5));
                  continue L4;
                }
              }
            }
            var5 = 46 / ((-55 - param1) / 44);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "d.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(kh param0, int param1, ge param2, boolean param3) {
        kh stackIn_6_0 = null;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kh stackIn_10_0 = null;
        kh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        kh stackIn_13_0 = null;
        kh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        kh stackIn_16_0 = null;
        kh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        kh stackIn_19_0 = null;
        kh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        kh stackIn_22_0 = null;
        kh stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param3) {
                param0.field_mc = param2.g(-67);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_Nb = param2.g(-70);
              param0.field_ac = param2.g(-124);
              var4_int = param2.g(-124);
              var5 = 36 / ((63 - param1) / 46);
              stackIn_6_0 = (kh) (param0);

              if ((128 & var4_int) == 0) {
                stackIn_7_0 = (kh) ((Object) stackIn_6_0);
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = (kh) ((Object) stackIn_6_0);
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                stackIn_7_0.field_Qb = stackIn_7_1 != 0;
                stackIn_10_0 = (kh) (param0);

                if (!param0.field_Qb) {
                  break L4;
                } else {
                  stackIn_10_0 = (kh) ((Object) stackIn_10_0);

                  if (param0.field_mc >= param0.field_Nb) {
                    break L4;
                  } else {
                    stackIn_11_0 = (kh) ((Object) stackIn_10_0);
                    stackIn_11_1 = 1;
                    break L3;
                  }
                }
              }
              stackIn_11_0 = (kh) ((Object) stackIn_10_0);
              stackIn_11_1 = 0;
              break L3;
            }
            L5: {
              stackIn_11_0.field_ic = stackIn_11_1 != 0;
              stackIn_13_0 = (kh) (param0);

              if ((32 & var4_int) == 0) {
                stackIn_14_0 = (kh) ((Object) stackIn_13_0);
                stackIn_14_1 = 0;
                break L5;
              } else {
                stackIn_14_0 = (kh) ((Object) stackIn_13_0);
                stackIn_14_1 = 1;
                break L5;
              }
            }
            L6: {
              stackIn_14_0.field_wc = stackIn_14_1 != 0;
              stackIn_16_0 = (kh) (param0);

              if ((8 & var4_int) == 0) {
                stackIn_17_0 = (kh) ((Object) stackIn_16_0);
                stackIn_17_1 = 0;
                break L6;
              } else {
                stackIn_17_0 = (kh) ((Object) stackIn_16_0);
                stackIn_17_1 = 1;
                break L6;
              }
            }
            L7: {
              stackIn_17_0.field_Dc = stackIn_17_1 != 0;
              stackIn_19_0 = (kh) (param0);

              if ((var4_int & 64) == 0) {
                stackIn_20_0 = (kh) ((Object) stackIn_19_0);
                stackIn_20_1 = 0;
                break L7;
              } else {
                stackIn_20_0 = (kh) ((Object) stackIn_19_0);
                stackIn_20_1 = 1;
                break L7;
              }
            }
            L8: {
              stackIn_20_0.field_ec = stackIn_20_1 != 0;
              stackIn_22_0 = (kh) (param0);

              if (-1 == (var4_int & 16 ^ -1)) {
                stackIn_23_0 = (kh) ((Object) stackIn_22_0);
                stackIn_23_1 = 1;
                break L8;
              } else {
                stackIn_23_0 = (kh) ((Object) stackIn_22_0);
                stackIn_23_1 = 2;
                break L8;
              }
            }
            L9: {
              stackIn_23_0.field_Yb = stackIn_23_1;
              if (0 == (4 & var4_int)) {
                stackIn_26_0 = 0;
                break L9;
              } else {
                stackIn_26_0 = 1;
                break L9;
              }
            }
            L10: {
              var6 = stackIn_26_0;
              param2.a(0, (byte) -127, param0.field_tc, param0.field_tc.length);
              if ((var4_int & 2) == 0) {
                stackIn_29_0 = 0;
                break L10;
              } else {
                stackIn_29_0 = 1;
                break L10;
              }
            }
            L11: {
              var7 = stackIn_29_0;
              param0.field_pc = param2.d(-1034);
              param0.field_sc = rl.a((byte) -95) + -(long)param2.b(true);
              if (var6 != 0) {
                param0.field_qc = param2.b(true);
                break L11;
              } else {
                param0.field_qc = -1;
                break L11;
              }
            }
            L12: {
              param0.field_Zb = param2.h(-412303328);
              var8 = param2.field_v;
              param0.field_Ob = param2.j(-57);
              if (var7 == 0) {
                param0.field_bc = null;
                break L12;
              } else {
                param2.field_v = var8;
                param0.field_bc = new String[param0.field_mc];
                var9 = 0;
                L13: while (true) {
                  if (param0.field_mc <= var9) {
                    break L12;
                  } else {
                    param0.field_bc[var9] = param2.j(-72);
                    var9++;
                    continue L13;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var4);

            stackIn_40_1 = new StringBuilder().append("d.D(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L14;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L15;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L15;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_41_0), stackIn_44_2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
