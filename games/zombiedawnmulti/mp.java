/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class mp {
    static ak field_b;
    static String field_a;
    static String field_c;
    td[] field_e;
    static String field_d;

    final int a(int param0, int param1) {
        td[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        td var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = ((mp) this).field_e;
            if (param0 == 52224) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 <= ~var3.length) {
                      break L3;
                    } else {
                      var5 = var3[var4];
                      stackOut_6_0 = ~param1;
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0 <= ~var5.field_e.length) {
                          param1 = param1 - (var5.field_e.length - 1);
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_10_0 = var5.field_e[param1];
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = -3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3_ref, "mp.C(" + param0 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4_int = 0;
        try {
            pm.field_R.field_j = 0;
            pm.field_R.a(-108, 12);
            pm.field_R.b(-114, c.field_c.nextInt());
            pm.field_R.b(-118, c.field_c.nextInt());
            pm.field_R.a(123, param2);
            pm.field_R.a(-67, param1);
            pm.field_R.a(param3, (byte) -128);
            pm.field_R.a(tp.field_v, -2628, gn.field_L);
            ma.field_a.b((byte) -35, 18);
            int fieldTemp$0 = ma.field_a.field_j + 1;
            ma.field_a.field_j = ma.field_a.field_j + 1;
            var4_int = fieldTemp$0;
            ma.field_a.a(pm.field_R.field_m, pm.field_R.field_j, 0, 126);
            ma.field_a.e(72, -var4_int + ma.field_a.field_j);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mp.I(" + 0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -111) {
                break L1;
              } else {
                mp.a(68);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((mp) this).field_e == null) {
                  break L3;
                } else {
                  if (((mp) this).field_e.length > 0) {
                    stackOut_9_0 = ((mp) this).field_e[((mp) this).field_e.length - 1].field_h - ((mp) this).field_e[0].field_d;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "mp.A(" + param0 + 41);
        }
        return stackIn_10_0;
    }

    final static ml a(int param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        th var4 = null;
        Object var5 = null;
        Object var6 = null;
        ml var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        jb var17 = null;
        String var18 = null;
        int var19 = 0;
        tq stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_2_2 = false;
        int stackIn_2_3 = 0;
        tq stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_4_3 = 0;
        tq stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        cj stackIn_32_0 = null;
        cj stackIn_34_0 = null;
        cj stackIn_35_0 = null;
        String stackIn_35_1 = null;
        cj stackIn_36_0 = null;
        cj stackIn_38_0 = null;
        cj stackIn_39_0 = null;
        String stackIn_39_1 = null;
        int stackIn_43_0 = 0;
        Object stackIn_101_0 = null;
        RuntimeException decompiledCaughtException = null;
        tq stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        boolean stackOut_1_2 = false;
        int stackOut_1_3 = 0;
        tq stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        boolean stackOut_4_2 = false;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        tq stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        boolean stackOut_2_2 = false;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        cj stackOut_31_0 = null;
        cj stackOut_34_0 = null;
        String stackOut_34_1 = null;
        cj stackOut_32_0 = null;
        String stackOut_32_1 = null;
        cj stackOut_35_0 = null;
        cj stackOut_38_0 = null;
        String stackOut_38_1 = null;
        cj stackOut_36_0 = null;
        String stackOut_36_1 = null;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        Object stackOut_100_0 = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = eg.field_B.field_Jb;
              stackOut_1_1 = 2;
              stackOut_1_2 = param1;
              stackOut_1_3 = 2 + jk.field_f;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_4_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (eg.field_B.field_Jb != vc.field_d) {
                stackOut_4_0 = (tq) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                break L1;
              } else {
                stackOut_2_0 = (tq) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                stackIn_5_4 = stackOut_2_4;
                break L1;
              }
            }
            L2: {
              var3_int = ((tq) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, (jk.field_f * 3 + 6) * param0, -106) ? 1 : 0;
              var4 = eg.field_B.field_Ib.field_Cb;
              var5 = null;
              if (2 != ge.field_zb) {
                L3: {
                  L4: {
                    pa.field_O.field_Z = false;
                    dp.field_b.field_wb = op.field_l;
                    if (1 != ge.field_zb) {
                      break L4;
                    } else {
                      eg.field_B.field_Jb.field_Jb.field_wb = rg.field_D;
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  eg.field_B.field_Jb.field_Jb.field_wb = hj.field_e;
                  break L3;
                }
                ob.a(eg.field_B.field_Ib, 41);
                break L2;
              } else {
                pa.field_O.field_Z = true;
                dp.field_b.field_wb = vl.a(kg.field_m, new String[1], 2);
                eg.field_B.field_Jb.field_Jb.field_wb = null;
                var6 = null;
                var7 = (ml) (Object) var4.c(42);
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var7 == null) {
                        break L7;
                      } else {
                        var8 = 0;
                        if (var19 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (null != var7.field_Cb) {
                              break L8;
                            } else {
                              var7.field_Ib = new cj(0L, m.field_x);
                              var7.a((byte) 50, var7.field_Ib);
                              var7.field_Fb = new cj(0L, wc.field_H);
                              var7.a((byte) 50, var7.field_Fb);
                              var7.field_Gb = new cj(0L, m.field_x);
                              var7.a((byte) 50, var7.field_Gb);
                              var7.field_Fb.field_R = 2;
                              var7.f(-128);
                              var8 = 1;
                              break L8;
                            }
                          }
                          L9: {
                            L10: {
                              var7.field_zb = eg.field_B.field_Ib.field_zb;
                              var9 = 0;
                              if (var7.field_Nb != null) {
                                break L10;
                              } else {
                                var10 = 13369344;
                                var11 = 16737894;
                                if (var19 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var7.field_Nb != ta.field_ob) {
                                break L11;
                              } else {
                                var11 = 6750054;
                                var10 = 52224;
                                if (var19 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var10 = 13421568;
                            var11 = 16777062;
                            break L9;
                          }
                          L12: {
                            var12 = 0;
                            if (var7.field_Kb == null) {
                              break L12;
                            } else {
                              if (!var7.field_Kb.equals((Object) (Object) "")) {
                                var7.field_Gb.field_rb = pa.field_T;
                                var7.field_Gb.field_ob = var11;
                                var7.field_Gb.a(jk.field_f, var9, 3 + pa.field_T.field_z, 0, -3344);
                                var12 = 1;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            var7.field_Fb.field_ob = var11;
                            var7.field_Ib.field_ob = var11;
                            var7.field_Fb.field_M = var10;
                            var7.field_Ib.field_M = var10;
                            var7.field_Fb.field_Db = var11;
                            var7.field_Ib.field_Db = var11;
                            var7.field_Fb.field_xb = var11;
                            var7.field_Ib.field_xb = var11;
                            var13 = 0;
                            var14 = -80 + (var7.field_zb + -2);
                            if (var12 != 0) {
                              var13 = 3 + pa.field_T.field_z;
                              var14 = var14 - var13;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            stackOut_31_0 = var7.field_Ib;
                            stackIn_34_0 = stackOut_31_0;
                            stackIn_32_0 = stackOut_31_0;
                            if (0 >= var14) {
                              stackOut_34_0 = (cj) (Object) stackIn_34_0;
                              stackOut_34_1 = var7.field_Hb;
                              stackIn_35_0 = stackOut_34_0;
                              stackIn_35_1 = stackOut_34_1;
                              break L14;
                            } else {
                              stackOut_32_0 = (cj) (Object) stackIn_32_0;
                              stackOut_32_1 = fm.a(var7.field_Ib.field_yb, var7.field_Hb, var14);
                              stackIn_35_0 = stackOut_32_0;
                              stackIn_35_1 = stackOut_32_1;
                              break L14;
                            }
                          }
                          L15: {
                            stackIn_35_0.field_wb = stackIn_35_1;
                            var7.field_Ib.a(jk.field_f, var9, var14, var13, -3344);
                            stackOut_35_0 = var7.field_Fb;
                            stackIn_38_0 = stackOut_35_0;
                            stackIn_36_0 = stackOut_35_0;
                            if (var7.field_Nb != null) {
                              stackOut_38_0 = (cj) (Object) stackIn_38_0;
                              stackOut_38_1 = var7.field_Nb;
                              stackIn_39_0 = stackOut_38_0;
                              stackIn_39_1 = stackOut_38_1;
                              break L15;
                            } else {
                              stackOut_36_0 = (cj) (Object) stackIn_36_0;
                              stackOut_36_1 = pi.field_c;
                              stackIn_39_0 = stackOut_36_0;
                              stackIn_39_1 = stackOut_36_1;
                              break L15;
                            }
                          }
                          L16: {
                            stackIn_39_0.field_wb = stackIn_39_1;
                            var7.field_Fb.a(jk.field_f, var9, 80, -80 + var7.field_zb, -3344);
                            if (var7.field_Ib.field_wb.equals((Object) (Object) var7.field_Hb)) {
                              stackOut_42_0 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              break L16;
                            } else {
                              stackOut_40_0 = 1;
                              stackIn_43_0 = stackOut_40_0;
                              break L16;
                            }
                          }
                          L17: {
                            var15 = stackIn_43_0;
                            var9 = var9 + jk.field_f;
                            if (var3_int == 0) {
                              var7.field_I = var9 - var7.field_z;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (var8 != 0) {
                              eg.field_B.field_Ib.a(2, (cj) (Object) var7, 1300, (cj) var6);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            L20: {
                              L21: {
                                if (var7.field_Gb == null) {
                                  break L21;
                                } else {
                                  if (var7.field_Gb.field_L) {
                                    break L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              L22: {
                                if (var7.field_T != 0) {
                                  break L22;
                                } else {
                                  if (!var7.field_Ib.field_L) {
                                    break L19;
                                  } else {
                                    if (var15 != 0) {
                                      ui.field_j = var7.field_Hb;
                                      if (var19 == 0) {
                                        break L19;
                                      } else {
                                        break L22;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              L23: {
                                var16 = var7.field_Hb;
                                ve.a(0L, param2 + 315, (String) null, eg.field_B.field_Jb, var16, (cj) (Object) var7, -1, (int[]) null, -1);
                                if (var7.field_Nb == null) {
                                  break L23;
                                } else {
                                  if (cq.a(pk.field_b.field_f, -124)) {
                                    break L23;
                                  } else {
                                    if (nh.field_m) {
                                      break L23;
                                    } else {
                                      L24: {
                                        if (sh.field_L) {
                                          break L24;
                                        } else {
                                          var17 = pk.field_b;
                                          var18 = vl.a(jk.field_i, new String[1], 2);
                                          var17.field_j.a((byte) -118, var18, 8);
                                          break L24;
                                        }
                                      }
                                      var17 = pk.field_b;
                                      var18 = vl.a(field_c, new String[1], param2 ^ -117);
                                      var17.field_j.a((byte) -118, var18, 18);
                                      break L23;
                                    }
                                  }
                                }
                              }
                              var5 = (Object) (Object) var7;
                              if (var19 == 0) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                            ui.field_j = var7.field_Kb;
                            break L19;
                          }
                          var6 = (Object) (Object) var7;
                          var7 = (ml) (Object) var4.b(6);
                          if (var19 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (eg.field_B.field_Gb.field_T == 0) {
                      break L6;
                    } else {
                      gi.field_i = new dk(eg.field_B.field_Gb.field_w, eg.field_B.field_Gb.field_qb, eg.field_B.field_Gb.field_zb, eg.field_B.field_Gb.field_z, ud.field_Z, kd.field_a, vo.field_m, vo.field_m);
                      ic.field_e = 0;
                      break L6;
                    }
                  }
                  L25: {
                    if (eg.field_B.field_Hb.field_T == 0) {
                      break L25;
                    } else {
                      gi.field_i = new dk(eg.field_B.field_Hb.field_w, eg.field_B.field_Hb.field_qb, eg.field_B.field_Hb.field_zb, eg.field_B.field_Hb.field_z, fe.field_Q, kd.field_a, vo.field_m, vo.field_m);
                      ic.field_e = 1;
                      break L25;
                    }
                  }
                  break L2;
                }
              }
            }
            L26: {
              if (param2 == -119) {
                break L26;
              } else {
                ml discarded$1 = mp.a(81, true, (byte) -50);
                break L26;
              }
            }
            stackOut_100_0 = var5;
            stackIn_101_0 = stackOut_100_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "mp.G(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return (ml) (Object) stackIn_101_0;
    }

    final int a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            var6 = 0;
            var7 = param0.length();
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var8 <= ~var7) {
                    break L3;
                  } else {
                    var9 = param0.charAt(var8);
                    stackOut_3_0 = 60;
                    stackOut_3_1 = var9;
                    stackIn_22_0 = stackOut_3_0;
                    stackIn_22_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 != stackIn_4_1) {
                            break L5;
                          } else {
                            var6 = 1;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var9 != 62) {
                            break L6;
                          } else {
                            var6 = 0;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (var6 != 0) {
                          break L4;
                        } else {
                          if (32 != var9) {
                            break L4;
                          } else {
                            var5_int++;
                            break L4;
                          }
                        }
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_21_0 = -1;
                stackOut_21_1 = ~var5_int;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L2;
              }
              if (stackIn_22_0 > stackIn_22_1) {
                stackOut_24_0 = (param3 + -param2 << 8) / var5_int;
                stackIn_25_0 = stackOut_24_0;
                return stackIn_25_0;
              } else {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("mp.F(");
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_27_0;
    }

    final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        td var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -126) {
                break L1;
              } else {
                int discarded$2 = ((mp) this).b(-6);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~((mp) this).field_e.length >= ~var3_int) {
                    break L4;
                  } else {
                    var4 = ((mp) this).field_e[var3_int];
                    stackOut_6_0 = ~param1;
                    stackIn_16_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (stackIn_7_0 > ~var4.field_e.length) {
                        stackOut_12_0 = var3_int;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      } else {
                        param1 = param1 - (var4.field_e.length + -1);
                        var3_int++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_15_0 = ((mp) this).field_e.length;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "mp.E(" + param0 + 44 + param1 + 41);
        }
        return stackIn_16_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 12) {
            return;
        }
        try {
            field_b = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mp.H(" + param0 + 41);
        }
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        td[] var3 = null;
        int var4 = 0;
        td var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -1;
              if (param0 >= 20) {
                break L1;
              } else {
                ((mp) this).field_e = null;
                break L1;
              }
            }
            L2: {
              if (null != ((mp) this).field_e) {
                var3 = ((mp) this).field_e;
                var4 = 0;
                L3: while (true) {
                  if (~var3.length >= ~var4) {
                    break L2;
                  } else {
                    L4: {
                      var5 = var3[var4];
                      if (null == var5) {
                        break L4;
                      } else {
                        var6 = var5.a(-27328);
                        if (var6 > var2_int) {
                          var2_int = var6;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var4++;
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_15_0 = var2_int;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "mp.B(" + param0 + 41);
        }
        return stackIn_16_0;
    }

    final int a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        td var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((mp) this).field_e) {
                break L1;
              } else {
                if (((mp) this).field_e.length == 0) {
                  break L1;
                } else {
                  if (param2 >= ((mp) this).field_e[0].field_d) {
                    if (param1 <= 0) {
                      if (((mp) this).field_e[((mp) this).field_e.length - 1].field_h >= param2) {
                        if (1 == ((mp) this).field_e.length) {
                          stackOut_19_0 = ((mp) this).field_e[0].a(false, param0);
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          var4_int = 0;
                          var5 = 0;
                          L2: while (true) {
                            L3: {
                              L4: {
                                if (~var5 <= ~((mp) this).field_e.length) {
                                  break L4;
                                } else {
                                  var6 = ((mp) this).field_e[var5];
                                  stackOut_23_0 = param2;
                                  stackIn_39_0 = stackOut_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  if (var8 != 0) {
                                    break L3;
                                  } else {
                                    L5: {
                                      if (stackIn_24_0 < var6.field_d) {
                                        break L5;
                                      } else {
                                        if (~param2 < ~var6.field_h) {
                                          break L5;
                                        } else {
                                          var7 = var6.a(false, param0);
                                          if (-1 == var7) {
                                            stackOut_33_0 = -1;
                                            stackIn_34_0 = stackOut_33_0;
                                            return stackIn_34_0;
                                          } else {
                                            stackOut_35_0 = var4_int - -var7;
                                            stackIn_36_0 = stackOut_35_0;
                                            return stackIn_36_0;
                                          }
                                        }
                                      }
                                    }
                                    var4_int = var4_int + (-1 + var6.field_e.length);
                                    var5++;
                                    if (var8 == 0) {
                                      continue L2;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                              stackOut_38_0 = -1;
                              stackIn_39_0 = stackOut_38_0;
                              break L3;
                            }
                            break L0;
                          }
                        }
                      } else {
                        stackOut_14_0 = -1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      }
                    } else {
                      stackOut_11_0 = -76;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_8_0 = -1;
            stackIn_9_0 = stackOut_8_0;
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "mp.D(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_39_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for <%0> to start the game...";
        field_c = "Send private Quick Chat to <%0>";
        field_b = new ak();
        field_d = "Open in popup window";
    }
}
