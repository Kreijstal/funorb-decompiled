/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wp implements si {
    static ql field_g;
    static String field_h;
    static String[] field_f;
    static String field_b;
    static int field_d;
    static int field_c;
    static dd field_a;
    static String field_e;

    final static byte[] a(int param0, byte[] param1) {
        ge var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_31_0 = null;
        byte[] stackOut_11_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              var2 = new ge(param1);
              var3 = var2.g(-72);
              var4 = var2.b(true);
              if (0 > var4) {
                break L1;
              } else {
                L2: {
                  if (sb.field_b == 0) {
                    break L2;
                  } else {
                    if (var4 > sb.field_b) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param0 != var3) {
                  L3: {
                    var5 = var2.b(true);
                    if (var5 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (0 == sb.field_b) {
                          break L4;
                        } else {
                          if (var5 > sb.field_b) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var6 = new byte[var5];
                        if (1 == var3) {
                          int discarded$2 = rh.a(var6, var5, param1, var4, 9);
                          break L5;
                        } else {
                          var7 = (Object) (Object) db.field_Qb;
                          synchronized (var7) {
                            L6: {
                              db.field_Qb.a(var6, true, var2);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackOut_31_0 = (byte[]) var6;
                      stackIn_32_0 = stackOut_31_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var5_ref_byte__ = new byte[var4];
                  var2.a(0, (byte) -121, var5_ref_byte__, var4);
                  stackOut_11_0 = (byte[]) var5_ref_byte__;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2_ref;
            stackOut_33_1 = new StringBuilder().append("wp.A(").append(param0).append(',');
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L7;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_32_0;
    }

    final static eo a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ko var4 = null;
        Object var5 = null;
        Object var6_ref = null;
        int var6 = 0;
        eo var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        kn var17 = null;
        String var18 = null;
        of stackIn_1_0 = null;
        boolean stackIn_1_1 = false;
        of stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        of stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        vh stackIn_28_0 = null;
        vh stackIn_30_0 = null;
        vh stackIn_31_0 = null;
        String stackIn_31_1 = null;
        vh stackIn_32_0 = null;
        vh stackIn_34_0 = null;
        vh stackIn_35_0 = null;
        String stackIn_35_1 = null;
        int stackIn_39_0 = 0;
        Object stackIn_88_0 = null;
        RuntimeException decompiledCaughtException = null;
        of stackOut_0_0 = null;
        boolean stackOut_0_1 = false;
        of stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        of stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        int stackOut_1_2 = 0;
        vh stackOut_27_0 = null;
        vh stackOut_30_0 = null;
        String stackOut_30_1 = null;
        vh stackOut_28_0 = null;
        String stackOut_28_1 = null;
        vh stackOut_31_0 = null;
        vh stackOut_34_0 = null;
        String stackOut_34_1 = null;
        vh stackOut_32_0 = null;
        String stackOut_32_1 = null;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        Object stackOut_87_0 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = aj.field_Mb.field_Sb;
              stackOut_0_1 = param0;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (aj.field_Mb.field_Sb != pf.field_c) {
                stackOut_3_0 = (of) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_1_0 = (of) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              var3_int = ((of) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0, 2, (byte) 80, 2 + ad.field_x, (ad.field_x - -2) * (3 * param1)) ? 1 : 0;
              var4 = aj.field_Mb.field_Mb.field_T;
              var5 = null;
              if (2 != th.field_a) {
                L3: {
                  ud.field_J.field_pb = false;
                  ba.field_sb.field_nb = cl.field_j;
                  if (th.field_a == 1) {
                    aj.field_Mb.field_Sb.field_Sb.field_nb = ri.field_Q;
                    break L3;
                  } else {
                    aj.field_Mb.field_Sb.field_Sb.field_nb = o.field_A;
                    break L3;
                  }
                }
                mq.a(aj.field_Mb.field_Mb, (byte) 109);
                break L2;
              } else {
                ud.field_J.field_pb = true;
                ba.field_sb.field_nb = nr.a(new String[1], -1, ei.field_w);
                aj.field_Mb.field_Sb.field_Sb.field_nb = null;
                var6_ref = null;
                var7 = (eo) (Object) var4.c((byte) 60);
                L4: while (true) {
                  if (null == var7) {
                    L5: {
                      if (0 == aj.field_Mb.field_Ob.field_R) {
                        break L5;
                      } else {
                        sm.field_C = new aj(aj.field_Mb.field_Ob.field_sb, aj.field_Mb.field_Ob.field_ib, aj.field_Mb.field_Ob.field_gb, aj.field_Mb.field_Ob.field_Db, cq.field_f, wa.field_qb, uo.field_Lb, uo.field_Lb);
                        ne.field_m = 0;
                        break L5;
                      }
                    }
                    L6: {
                      if (aj.field_Mb.field_Qb.field_R != 0) {
                        sm.field_C = new aj(aj.field_Mb.field_Qb.field_sb, aj.field_Mb.field_Qb.field_ib, aj.field_Mb.field_Qb.field_gb, aj.field_Mb.field_Qb.field_Db, vk.field_O, wa.field_qb, uo.field_Lb, uo.field_Lb);
                        ne.field_m = 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    break L2;
                  } else {
                    L7: {
                      var8 = 0;
                      if (var7.field_T == null) {
                        var7.field_Pb = new vh(0L, ge.field_s);
                        var7.a(94, var7.field_Pb);
                        var7.field_Nb = new vh(0L, tm.field_d);
                        var7.a(-103, var7.field_Nb);
                        var7.field_Ob = new vh(0L, ge.field_s);
                        var7.a(-120, var7.field_Ob);
                        var7.field_Nb.field_Fb = 2;
                        var7.d((byte) -127);
                        var8 = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var7.field_gb = aj.field_Mb.field_Mb.field_gb;
                      var9 = 0;
                      if (var7.field_Wb != null) {
                        if (cm.field_J != var7.field_Wb) {
                          var10 = 13421568;
                          var11 = 16777062;
                          break L8;
                        } else {
                          var11 = 6750054;
                          var10 = 52224;
                          break L8;
                        }
                      } else {
                        var11 = 16737894;
                        var10 = 13369344;
                        break L8;
                      }
                    }
                    L9: {
                      var12 = 0;
                      if (var7.field_Sb == null) {
                        break L9;
                      } else {
                        if (!var7.field_Sb.equals((Object) (Object) "")) {
                          var7.field_Ob.field_hb = oi.field_o;
                          var7.field_Ob.field_K = var11;
                          var12 = 1;
                          var7.field_Ob.b(var9, 2147483647, 0, 3 + oi.field_o.field_w, ad.field_x);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var7.field_Nb.field_Bb = var11;
                      var7.field_Pb.field_Bb = var11;
                      vh fieldTemp$1 = var7.field_Pb;
                      var7.field_Nb.field_P = var11;
                      fieldTemp$1.field_P = var11;
                      var7.field_Nb.field_N = var10;
                      var7.field_Pb.field_N = var10;
                      var7.field_Nb.field_K = var11;
                      var7.field_Pb.field_K = var11;
                      var13 = 0;
                      var14 = -80 + (var7.field_gb - 2);
                      if (var12 != 0) {
                        var13 = oi.field_o.field_w + 3;
                        var14 = var14 - var13;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      stackOut_27_0 = var7.field_Pb;
                      stackIn_30_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var14 <= 0) {
                        stackOut_30_0 = (vh) (Object) stackIn_30_0;
                        stackOut_30_1 = var7.field_Zb;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L11;
                      } else {
                        stackOut_28_0 = (vh) (Object) stackIn_28_0;
                        stackOut_28_1 = lr.a(var7.field_Pb.field_I, var7.field_Zb, var14);
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        break L11;
                      }
                    }
                    L12: {
                      stackIn_31_0.field_nb = stackIn_31_1;
                      var7.field_Pb.b(var9, 2147483647, var13, var14, ad.field_x);
                      stackOut_31_0 = var7.field_Nb;
                      stackIn_34_0 = stackOut_31_0;
                      stackIn_32_0 = stackOut_31_0;
                      if (null != var7.field_Wb) {
                        stackOut_34_0 = (vh) (Object) stackIn_34_0;
                        stackOut_34_1 = var7.field_Wb;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        break L12;
                      } else {
                        stackOut_32_0 = (vh) (Object) stackIn_32_0;
                        stackOut_32_1 = we.field_j;
                        stackIn_35_0 = stackOut_32_0;
                        stackIn_35_1 = stackOut_32_1;
                        break L12;
                      }
                    }
                    L13: {
                      stackIn_35_0.field_nb = stackIn_35_1;
                      var7.field_Nb.b(var9, 2147483647, var7.field_gb + -80, 80, ad.field_x);
                      if (var7.field_Pb.field_nb.equals((Object) (Object) var7.field_Zb)) {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        break L13;
                      } else {
                        stackOut_36_0 = 1;
                        stackIn_39_0 = stackOut_36_0;
                        break L13;
                      }
                    }
                    L14: {
                      var15 = stackIn_39_0;
                      var9 = var9 + ad.field_x;
                      if (var3_int != 0) {
                        break L14;
                      } else {
                        var7.field_Cb = -var7.field_Db + var9;
                        break L14;
                      }
                    }
                    L15: {
                      if (var8 == 0) {
                        break L15;
                      } else {
                        aj.field_Mb.field_Mb.a((vh) var6_ref, 2, (vh) (Object) var7, -78);
                        break L15;
                      }
                    }
                    L16: {
                      L17: {
                        var6_ref = (Object) (Object) var7;
                        if (null == var7.field_Ob) {
                          break L17;
                        } else {
                          if (!var7.field_Ob.field_W) {
                            break L17;
                          } else {
                            kk.field_B = var7.field_Sb;
                            break L16;
                          }
                        }
                      }
                      if (0 != var7.field_R) {
                        var16 = var7.field_Zb;
                        dr.a((String) null, -1, 0L, -1, aj.field_Mb.field_Sb, var16, 32540, (vh) (Object) var7, (int[]) null);
                        var5 = (Object) (Object) var7;
                        if (var7.field_Wb == null) {
                          break L16;
                        } else {
                          if (fj.a(vl.field_m.field_m, (byte) -101)) {
                            break L16;
                          } else {
                            if (ea.field_z) {
                              break L16;
                            } else {
                              L18: {
                                if (hr.field_y) {
                                  break L18;
                                } else {
                                  var17 = vl.field_m;
                                  var18 = nr.a(new String[1], -1, rp.field_a);
                                  var17.field_n.a(var18, 17130, 8);
                                  break L18;
                                }
                              }
                              var17 = vl.field_m;
                              var18 = nr.a(new String[1], -1, hq.field_e);
                              var17.field_n.a(var18, 17130, 18);
                              break L16;
                            }
                          }
                        }
                      } else {
                        if (!var7.field_Pb.field_W) {
                          break L16;
                        } else {
                          if (var15 != 0) {
                            kk.field_B = var7.field_Zb;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    var7 = (eo) (Object) var4.f((byte) -5);
                    continue L4;
                  }
                }
              }
            }
            var6 = -31 / ((param2 - 31) / 62);
            stackOut_87_0 = var5;
            stackIn_88_0 = stackOut_87_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "wp.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (eo) (Object) stackIn_88_0;
    }

    final static ea a(int param0, int param1, byte param2, int param3) {
        ea var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ea stackIn_12_0 = null;
        ea stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_11_0 = null;
        ea stackOut_15_0 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            L1: {
              var4 = (ea) (Object) rc.field_c.c((byte) -82);
              if (param2 > 27) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var4) {
                    break L4;
                  } else {
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (param0 == var4.field_s) {
                        stackOut_11_0 = (ea) var4;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0;
                      } else {
                        var4 = (ea) (Object) rc.field_c.f((byte) -5);
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                var4 = new ea();
                var4.field_o = param1;
                var4.field_s = param0;
                rc.field_c.b((byte) -114, (ma) (Object) var4);
                wb.a(var4, param3, (byte) -96);
                break L3;
              }
              stackOut_15_0 = (ea) var4;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4_ref, "wp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    final static od a(int param0, sj param1, byte param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        od var7 = null;
        Object stackIn_2_0 = null;
        od stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var6 = nj.a(param3, param1, param0, false, param4, param5);
            if (null != var6) {
              L1: {
                var7 = new od();
                var7.field_b = var6;
                java.awt.Component discarded$3 = var7.field_b.add((java.awt.Component) (Object) var7);
                var7.setBounds(0, 0, param0, param3);
                var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
                if (param2 == 0) {
                  break L1;
                } else {
                  field_f = null;
                  break L1;
                }
              }
              var7.requestFocus();
              stackOut_6_0 = (od) var7;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (od) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref;
            stackOut_8_1 = new StringBuilder().append("wp.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_h = null;
              field_e = null;
              field_g = null;
              field_b = null;
              if (param0 == 0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            field_f = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "wp.D(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Members";
        field_b = "Return to Main Menu";
        field_g = new ql();
        field_c = 50;
        field_e = "Type your email address again to make sure it's correct";
    }
}
