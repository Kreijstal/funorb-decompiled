/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hj extends td {
    static sna field_p;

    final static cj a(byte param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        lc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        lc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -55 % ((-47 - param0) / 55);
            stackOut_0_0 = new lc(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("hj.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
        return (cj) (Object) stackIn_1_0;
    }

    final static nea b(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        eaa var4 = null;
        Object var5 = null;
        Object var6 = null;
        nea var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        ik var17 = null;
        String var18 = null;
        int var19 = 0;
        Object stackIn_3_0 = null;
        sga stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        sga stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        sga stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        nea stackIn_12_0 = null;
        sna stackIn_33_0 = null;
        sna stackIn_35_0 = null;
        sna stackIn_36_0 = null;
        String stackIn_36_1 = null;
        sna stackIn_37_0 = null;
        sna stackIn_39_0 = null;
        sna stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_44_0 = 0;
        Object stackIn_91_0 = null;
        Object stackIn_104_0 = null;
        RuntimeException decompiledCaughtException = null;
        sga stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        sga stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        sga stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        nea stackOut_11_0 = null;
        sna stackOut_32_0 = null;
        sna stackOut_35_0 = null;
        String stackOut_35_1 = null;
        sna stackOut_33_0 = null;
        String stackOut_33_1 = null;
        sna stackOut_36_0 = null;
        sna stackOut_39_0 = null;
        String stackOut_39_1 = null;
        sna stackOut_37_0 = null;
        String stackOut_37_1 = null;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        sna stackOut_90_0 = null;
        Object stackOut_103_0 = null;
        Object stackOut_2_0 = null;
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                stackOut_4_0 = rba.field_a.field_xb;
                stackOut_4_1 = rg.field_h - -2;
                stackOut_4_2 = 2;
                stackOut_4_3 = (rg.field_h * 3 + 6) * param1;
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_7_2 = stackOut_4_2;
                stackIn_7_3 = stackOut_4_3;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                if (bga.field_m != rba.field_a.field_xb) {
                  stackOut_7_0 = (sga) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  stackIn_8_4 = stackOut_7_4;
                  break L1;
                } else {
                  stackOut_5_0 = (sga) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = stackIn_5_3;
                  stackOut_5_4 = 1;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  stackIn_8_2 = stackOut_5_2;
                  stackIn_8_3 = stackOut_5_3;
                  stackIn_8_4 = stackOut_5_4;
                  break L1;
                }
              }
              L2: {
                var3_int = ((sga) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4 != 0, param2, true) ? 1 : 0;
                var4 = rba.field_a.field_wb.field_z;
                var5 = null;
                if (um.field_c != 2) {
                  L3: {
                    L4: {
                      kg.field_d.field_Z = fo.field_b;
                      ov.field_d.field_u = false;
                      if (um.field_c != 1) {
                        break L4;
                      } else {
                        rba.field_a.field_xb.field_wb.field_Z = ek.field_m;
                        if (var19 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    rba.field_a.field_xb.field_wb.field_Z = ema.field_Ab;
                    break L3;
                  }
                  nn.a((byte) -126, rba.field_a.field_wb);
                  break L2;
                } else {
                  ov.field_d.field_u = true;
                  kg.field_d.field_Z = lga.a(true, new String[1], qg.field_c);
                  rba.field_a.field_xb.field_wb.field_Z = null;
                  var6 = null;
                  var7 = (nea) (Object) var4.b((byte) 90);
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (null == var7) {
                          break L7;
                        } else {
                          var8 = 0;
                          stackOut_11_0 = (nea) var7;
                          stackIn_91_0 = (Object) (Object) stackOut_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          if (var19 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_12_0.field_z == null) {
                                var7.field_Db = new sna(0L, gi.field_c);
                                var7.a(~param0, var7.field_Db);
                                var7.field_Eb = new sna(0L, wv.field_l);
                                var7.a(-1, var7.field_Eb);
                                var7.field_zb = new sna(0L, gi.field_c);
                                var7.a(-1, var7.field_zb);
                                var7.field_Eb.field_N = 2;
                                var8 = 1;
                                var7.d((byte) 121);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              L10: {
                                var7.field_sb = rba.field_a.field_wb.field_sb;
                                var9 = 0;
                                if (var7.field_vb == null) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var7.field_vb != sja.field_gb) {
                                      break L11;
                                    } else {
                                      var10 = 52224;
                                      var11 = 6750054;
                                      if (var19 == 0) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var10 = 13421568;
                                  var11 = 16777062;
                                  if (var19 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var10 = 13369344;
                              var11 = 16737894;
                              break L9;
                            }
                            L12: {
                              var12 = 0;
                              if (var7.field_Ab == null) {
                                break L12;
                              } else {
                                if (var7.field_Ab.equals((Object) (Object) "")) {
                                  break L12;
                                } else {
                                  var7.field_zb.field_ab = var11;
                                  var7.field_zb.field_v = ln.field_x;
                                  var12 = 1;
                                  var7.field_zb.a(rg.field_h, 31407, 3 + ln.field_x.field_n, 0, var9);
                                  break L12;
                                }
                              }
                            }
                            L13: {
                              var7.field_Eb.field_gb = var10;
                              var7.field_Db.field_gb = var10;
                              var7.field_Eb.field_w = var11;
                              var7.field_Db.field_w = var11;
                              var7.field_Eb.field_G = var11;
                              var7.field_Db.field_G = var11;
                              var7.field_Eb.field_ab = var11;
                              var7.field_Db.field_ab = var11;
                              var13 = 0;
                              var14 = -82 + var7.field_sb;
                              if (var12 == 0) {
                                break L13;
                              } else {
                                var13 = ln.field_x.field_n + 3;
                                var14 = var14 - var13;
                                break L13;
                              }
                            }
                            L14: {
                              stackOut_32_0 = var7.field_Db;
                              stackIn_35_0 = stackOut_32_0;
                              stackIn_33_0 = stackOut_32_0;
                              if (var14 > 0) {
                                stackOut_35_0 = (sna) (Object) stackIn_35_0;
                                stackOut_35_1 = po.a(var7.field_Db.field_jb, var7.field_xb, var14);
                                stackIn_36_0 = stackOut_35_0;
                                stackIn_36_1 = stackOut_35_1;
                                break L14;
                              } else {
                                stackOut_33_0 = (sna) (Object) stackIn_33_0;
                                stackOut_33_1 = var7.field_xb;
                                stackIn_36_0 = stackOut_33_0;
                                stackIn_36_1 = stackOut_33_1;
                                break L14;
                              }
                            }
                            L15: {
                              stackIn_36_0.field_Z = stackIn_36_1;
                              var7.field_Db.a(rg.field_h, param0 + 31407, var14, var13, var9);
                              stackOut_36_0 = var7.field_Eb;
                              stackIn_39_0 = stackOut_36_0;
                              stackIn_37_0 = stackOut_36_0;
                              if (null != var7.field_vb) {
                                stackOut_39_0 = (sna) (Object) stackIn_39_0;
                                stackOut_39_1 = var7.field_vb;
                                stackIn_40_0 = stackOut_39_0;
                                stackIn_40_1 = stackOut_39_1;
                                break L15;
                              } else {
                                stackOut_37_0 = (sna) (Object) stackIn_37_0;
                                stackOut_37_1 = aka.field_y;
                                stackIn_40_0 = stackOut_37_0;
                                stackIn_40_1 = stackOut_37_1;
                                break L15;
                              }
                            }
                            L16: {
                              stackIn_40_0.field_Z = stackIn_40_1;
                              var7.field_Eb.a(rg.field_h, 31407, 80, var7.field_sb - 80, var9);
                              if (var7.field_Db.field_Z.equals((Object) (Object) var7.field_xb)) {
                                stackOut_43_0 = 0;
                                stackIn_44_0 = stackOut_43_0;
                                break L16;
                              } else {
                                stackOut_41_0 = 1;
                                stackIn_44_0 = stackOut_41_0;
                                break L16;
                              }
                            }
                            L17: {
                              var15 = stackIn_44_0;
                              var9 = var9 + rg.field_h;
                              if (var3_int != 0) {
                                break L17;
                              } else {
                                var7.field_hb = var9 - var7.field_p;
                                break L17;
                              }
                            }
                            L18: {
                              if (var8 != 0) {
                                rba.field_a.field_wb.a(false, (sna) (Object) var7, (sna) var6, 2);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              L20: {
                                var6 = (Object) (Object) var7;
                                if (null == var7.field_zb) {
                                  break L20;
                                } else {
                                  if (!var7.field_zb.field_T) {
                                    break L20;
                                  } else {
                                    jja.field_m = var7.field_Ab;
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              L21: {
                                if (0 != var7.field_R) {
                                  break L21;
                                } else {
                                  if (!var7.field_Db.field_T) {
                                    break L19;
                                  } else {
                                    if (var15 != 0) {
                                      jja.field_m = var7.field_xb;
                                      if (var19 == 0) {
                                        break L19;
                                      } else {
                                        break L21;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              L22: {
                                var16 = var7.field_xb;
                                mna.a(-1, (int[]) null, 0L, (String) null, var16, -1, -123, rba.field_a.field_xb, (sna) (Object) var7);
                                if (var7.field_vb == null) {
                                  break L22;
                                } else {
                                  if (sha.a((byte) -24, ms.field_u.field_j)) {
                                    break L22;
                                  } else {
                                    if (!hl.field_I) {
                                      L23: {
                                        if (!sea.field_j) {
                                          var17 = ms.field_u;
                                          var18 = lga.a(true, new String[1], jv.field_m);
                                          var17.field_a.a(var18, true, 8);
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      var17 = ms.field_u;
                                      var18 = lga.a(true, new String[1], lga.field_i);
                                      var17.field_a.a(var18, true, 18);
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                              var5 = (Object) (Object) var7;
                              break L19;
                            }
                            var7 = (nea) (Object) var4.c(0);
                            if (var19 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      L24: {
                        if (rba.field_a.field_Ab.field_R != 0) {
                          wh.field_p = new oa(rba.field_a.field_Ab.field_D, rba.field_a.field_Ab.field_M, rba.field_a.field_Ab.field_sb, rba.field_a.field_Ab.field_p, uea.field_g, kha.field_i, qs.field_m, qs.field_m);
                          vaa.field_f = 0;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      stackOut_90_0 = rba.field_a.field_yb;
                      stackIn_91_0 = (Object) (Object) stackOut_90_0;
                      break L6;
                    }
                    L25: {
                      if (((sna) (Object) stackIn_91_0).field_R != 0) {
                        wh.field_p = new oa(rba.field_a.field_yb.field_D, rba.field_a.field_yb.field_M, rba.field_a.field_yb.field_sb, rba.field_a.field_yb.field_p, vc.field_f, kha.field_i, qs.field_m, qs.field_m);
                        vaa.field_f = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    break L2;
                  }
                }
              }
              stackOut_103_0 = var5;
              stackIn_104_0 = stackOut_103_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (nea) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "hj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (nea) (Object) stackIn_104_0;
    }

    hj(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        l var4 = null;
        l stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            var3 = ((hj) this).field_h.a(15, param0);
            var4 = new l(((hj) this).field_g, new nq(var3));
            stackOut_3_0 = (l) var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("hj.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_4_0;
    }

    public static void c(byte param0) {
        try {
            field_p = null;
            if (param0 >= -80) {
                field_p = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hj.D(" + param0 + ')');
        }
    }

    static {
    }
}
