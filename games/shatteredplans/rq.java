/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rq implements iq {
    static String field_c;
    static int[] field_j;
    static int field_i;
    static int field_e;
    static qr field_b;
    private nq field_f;
    static bc field_g;
    static String field_h;
    private int field_a;
    private int field_d;

    public static void b(int param0) {
        field_c = null;
        if (param0 >= -47) {
            return;
        }
        try {
            field_h = null;
            field_g = null;
            field_j = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "rq.B(" + param0 + ')');
        }
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.field_k) {
                  break L2;
                } else {
                  if (!param0.f(1)) {
                    stackOut_7_0 = 2188450;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 3249872;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_8_0;
              int discarded$2 = ((rq) this).field_f.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_s + "</u>", param1 - -param0.field_m, param3 - -param0.field_q, param0.field_x, param0.field_n, var6_int, -1, ((rq) this).field_a, ((rq) this).field_d, ((rq) this).field_f.field_q + ((rq) this).field_f.field_J);
              if (!param0.f(1)) {
                break L3;
              } else {
                L4: {
                  L5: {
                    var7 = ((rq) this).field_f.c(param0.field_s);
                    var8 = ((rq) this).field_f.field_J + ((rq) this).field_f.field_q;
                    var9 = param0.field_m + param1;
                    if (((rq) this).field_a != 2) {
                      break L5;
                    } else {
                      var9 = var9 + (-var7 + param0.field_x);
                      if (var11 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (((rq) this).field_a == 1) {
                    var9 = var9 + (-var7 + param0.field_x >> 1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  L7: {
                    var10 = param0.field_q + param3;
                    if (((rq) this).field_d == 2) {
                      break L7;
                    } else {
                      if (((rq) this).field_d == 1) {
                        var10 = var10 + (-var8 + param0.field_n >> 1);
                        if (var11 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  var10 = var10 + (param0.field_n - var8);
                  break L6;
                }
                dd.a(var8, 1, var7 + 4, -2 + var9, var10 + 2);
                break L3;
              }
            }
            L8: {
              if (param4 == 12) {
                break L8;
              } else {
                ve discarded$3 = rq.a(true, -120, true);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("rq.E(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static bi[] a(int param0) {
        bi[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        bi[] stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        bi[] stackOut_13_0 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1 = new bi[en.field_c];
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 >= en.field_c) {
                    break L3;
                  } else {
                    var3 = mc.field_s[var2] * cm.field_g[var2];
                    var4 = hd.field_q[var2];
                    var5 = new int[var3];
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      var6 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (~var6 <= ~var3) {
                              break L6;
                            } else {
                              var5[var6] = eo.field_fb[we.a(255, (int) var4[var6])];
                              var6++;
                              if (var7 != 0) {
                                break L5;
                              } else {
                                if (var7 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var1[var2] = new bi(tk.field_y, eg.field_t, cf.field_H[var2], sj.field_a[var2], mc.field_s[var2], cm.field_g[var2], var5);
                          var2++;
                          break L5;
                        }
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = param0 + param0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              pd.a(stackIn_13_0);
              stackOut_13_0 = (bi[]) var1;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "rq.C(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    final static ve a(boolean param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        pf var4 = null;
        Object var5 = null;
        Object var6 = null;
        ve var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        fc var17 = null;
        String var18 = null;
        int var19 = 0;
        ub stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        ub stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        ub stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_21_0 = 0;
        qr stackIn_44_0 = null;
        qr stackIn_46_0 = null;
        qr stackIn_47_0 = null;
        String stackIn_47_1 = null;
        qr stackIn_48_0 = null;
        qr stackIn_50_0 = null;
        qr stackIn_51_0 = null;
        String stackIn_51_1 = null;
        int stackIn_55_0 = 0;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        ub stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        ub stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        ub stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        qr stackOut_43_0 = null;
        qr stackOut_46_0 = null;
        String stackOut_46_1 = null;
        qr stackOut_44_0 = null;
        String stackOut_44_1 = null;
        qr stackOut_47_0 = null;
        qr stackOut_50_0 = null;
        String stackOut_50_1 = null;
        qr stackOut_48_0 = null;
        String stackOut_48_1 = null;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        Object stackOut_101_0 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = d.field_a.field_Db;
              stackOut_1_1 = param1 * ((cr.field_c + 2) * 3);
              stackOut_1_2 = cr.field_c + 2;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (hp.field_l != d.field_a.field_Db) {
                stackOut_4_0 = (ub) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                break L1;
              } else {
                stackOut_2_0 = (ub) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                break L1;
              }
            }
            L2: {
              var3_int = ((ub) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3 != 0, -103, param2, 2) ? 1 : 0;
              var4 = d.field_a.field_Eb.field_M;
              if (param0) {
                break L2;
              } else {
                field_e = 100;
                break L2;
              }
            }
            L3: {
              L4: {
                var5 = null;
                if (2 == po.field_b) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      cg.field_A.field_s = false;
                      rj.field_p.field_z = ea.field_d;
                      if (po.field_b != 1) {
                        break L6;
                      } else {
                        d.field_a.field_Db.field_zb.field_z = km.field_X;
                        if (var19 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    d.field_a.field_Db.field_zb.field_z = tb.field_c;
                    break L5;
                  }
                  L7: {
                    if (param0) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L7;
                    } else {
                      stackOut_18_0 = 1;
                      stackIn_21_0 = stackOut_18_0;
                      break L7;
                    }
                  }
                  fj.a(stackIn_21_0 != 0, d.field_a.field_Eb);
                  if (var19 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              cg.field_A.field_s = true;
              rj.field_p.field_z = re.a(af.field_b, 4371, new String[1]);
              d.field_a.field_Db.field_zb.field_z = null;
              var6 = null;
              var7 = (ve) (Object) var4.d(0);
              L8: while (true) {
                L9: {
                  L10: {
                    if (var7 == null) {
                      break L10;
                    } else {
                      var8 = 0;
                      if (var19 != 0) {
                        break L9;
                      } else {
                        L11: {
                          if (null != var7.field_M) {
                            break L11;
                          } else {
                            var7.field_Cb = new qr(0L, ek.field_E);
                            var7.a(4, var7.field_Cb);
                            var7.field_Fb = new qr(0L, oj.field_zb);
                            var7.a(4, var7.field_Fb);
                            var7.field_Db = new qr(0L, ek.field_E);
                            var7.a(4, var7.field_Db);
                            var7.field_Fb.field_y = 2;
                            var8 = 1;
                            var7.e((byte) -125);
                            break L11;
                          }
                        }
                        L12: {
                          L13: {
                            var7.field_K = d.field_a.field_Eb.field_K;
                            var9 = 0;
                            if (var7.field_xb != null) {
                              break L13;
                            } else {
                              var10 = 13369344;
                              var11 = 16737894;
                              if (var19 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (jo.field_d != var7.field_xb) {
                              break L14;
                            } else {
                              var11 = 6750054;
                              var10 = 52224;
                              if (var19 == 0) {
                                break L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                          var10 = 13421568;
                          var11 = 16777062;
                          break L12;
                        }
                        L15: {
                          var12 = 0;
                          if (var7.field_Bb == null) {
                            break L15;
                          } else {
                            if (var7.field_Bb.equals((Object) (Object) "")) {
                              break L15;
                            } else {
                              var7.field_Db.field_pb = ke.field_i;
                              var7.field_Db.field_jb = var11;
                              var7.field_Db.a(ke.field_i.field_o + 3, cr.field_c, (byte) 88, var9, 0);
                              var12 = 1;
                              break L15;
                            }
                          }
                        }
                        L16: {
                          var7.field_Fb.field_x = var10;
                          var7.field_Cb.field_x = var10;
                          var7.field_Fb.field_jb = var11;
                          var7.field_Cb.field_jb = var11;
                          var7.field_Fb.field_qb = var11;
                          var7.field_Cb.field_qb = var11;
                          var7.field_Fb.field_ab = var11;
                          var7.field_Cb.field_ab = var11;
                          var13 = 0;
                          var14 = -2 + var7.field_K - 80;
                          if (var12 == 0) {
                            break L16;
                          } else {
                            var13 = 3 + ke.field_i.field_o;
                            var14 = var14 - var13;
                            break L16;
                          }
                        }
                        L17: {
                          stackOut_43_0 = var7.field_Cb;
                          stackIn_46_0 = stackOut_43_0;
                          stackIn_44_0 = stackOut_43_0;
                          if (var14 > 0) {
                            stackOut_46_0 = (qr) (Object) stackIn_46_0;
                            stackOut_46_1 = nq.a(var7.field_Cb.field_nb, var7.field_Ab, var14);
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            break L17;
                          } else {
                            stackOut_44_0 = (qr) (Object) stackIn_44_0;
                            stackOut_44_1 = var7.field_Ab;
                            stackIn_47_0 = stackOut_44_0;
                            stackIn_47_1 = stackOut_44_1;
                            break L17;
                          }
                        }
                        L18: {
                          stackIn_47_0.field_z = stackIn_47_1;
                          var7.field_Cb.a(var14, cr.field_c, (byte) 110, var9, var13);
                          stackOut_47_0 = var7.field_Fb;
                          stackIn_50_0 = stackOut_47_0;
                          stackIn_48_0 = stackOut_47_0;
                          if (null != var7.field_xb) {
                            stackOut_50_0 = (qr) (Object) stackIn_50_0;
                            stackOut_50_1 = var7.field_xb;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            break L18;
                          } else {
                            stackOut_48_0 = (qr) (Object) stackIn_48_0;
                            stackOut_48_1 = jj.field_p;
                            stackIn_51_0 = stackOut_48_0;
                            stackIn_51_1 = stackOut_48_1;
                            break L18;
                          }
                        }
                        L19: {
                          stackIn_51_0.field_z = stackIn_51_1;
                          var7.field_Fb.a(80, cr.field_c, (byte) 109, var9, -80 + var7.field_K);
                          if (var7.field_Cb.field_z.equals((Object) (Object) var7.field_Ab)) {
                            stackOut_54_0 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            break L19;
                          } else {
                            stackOut_52_0 = 1;
                            stackIn_55_0 = stackOut_52_0;
                            break L19;
                          }
                        }
                        L20: {
                          var15 = stackIn_55_0;
                          var9 = var9 + cr.field_c;
                          if (var3_int != 0) {
                            break L20;
                          } else {
                            var7.field_gb = -var7.field_mb + var9;
                            break L20;
                          }
                        }
                        L21: {
                          if (var8 == 0) {
                            break L21;
                          } else {
                            d.field_a.field_Eb.a(2, (qr) var6, (qr) (Object) var7, (byte) 98);
                            break L21;
                          }
                        }
                        L22: {
                          L23: {
                            L24: {
                              if (var7.field_Db == null) {
                                break L24;
                              } else {
                                if (var7.field_Db.field_L) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            L25: {
                              if (var7.field_rb == 0) {
                                break L25;
                              } else {
                                L26: {
                                  var16 = var7.field_Ab;
                                  tp.a((int[]) null, 0L, (String) null, var16, 293, d.field_a.field_Db, (qr) (Object) var7, -1, -1);
                                  if (null == var7.field_xb) {
                                    break L26;
                                  } else {
                                    if (fs.a(62, hp.field_m.field_k)) {
                                      break L26;
                                    } else {
                                      if (!bg.field_g) {
                                        L27: {
                                          if (!ae.field_b) {
                                            var17 = hp.field_m;
                                            var18 = re.a(tk.field_B, 4371, new String[1]);
                                            var17.field_j.a(1, 8, var18);
                                            break L27;
                                          } else {
                                            break L27;
                                          }
                                        }
                                        var17 = hp.field_m;
                                        var18 = re.a(se.field_e, 4371, new String[1]);
                                        var17.field_j.a(1, 18, var18);
                                        break L26;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                                var5 = (Object) (Object) var7;
                                if (var19 == 0) {
                                  break L22;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            if (!var7.field_Cb.field_L) {
                              break L22;
                            } else {
                              if (var15 == 0) {
                                break L22;
                              } else {
                                dn.field_k = var7.field_Ab;
                                if (var19 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          dn.field_k = var7.field_Bb;
                          break L22;
                        }
                        var6 = (Object) (Object) var7;
                        var7 = (ve) (Object) var4.a((byte) -71);
                        if (var19 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  if (d.field_a.field_Fb.field_rb == 0) {
                    break L9;
                  } else {
                    lg.field_e = new jp(d.field_a.field_Fb.field_B, d.field_a.field_Fb.field_N, d.field_a.field_Fb.field_K, d.field_a.field_Fb.field_mb, km.field_A, h.field_v, ii.field_u, ii.field_u);
                    ia.field_b = 0;
                    break L9;
                  }
                }
                if (0 == d.field_a.field_yb.field_rb) {
                  break L3;
                } else {
                  lg.field_e = new jp(d.field_a.field_yb.field_B, d.field_a.field_yb.field_N, d.field_a.field_yb.field_K, d.field_a.field_yb.field_mb, on.field_f, h.field_v, ii.field_u, ii.field_u);
                  ia.field_b = 1;
                  break L3;
                }
              }
            }
            stackOut_101_0 = var5;
            stackIn_102_0 = stackOut_101_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "rq.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (ve) (Object) stackIn_102_0;
    }

    public rq() {
        try {
            ((rq) this).field_f = gn.field_u;
            ((rq) this).field_a = 1;
            ((rq) this).field_d = 1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "rq.<init>()");
        }
    }

    rq(nq param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((rq) this).field_f = param0;
            ((rq) this).field_a = param1;
            ((rq) this).field_d = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rq.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                mg.field_C = false;
                var1_int = -1 / ((-28 - param0) / 57);
                tl.field_z = null;
                if (!el.field_b) {
                  break L2;
                } else {
                  ji.field_G.p(-7011);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var2 = tf.field_n;
                if (var2 <= 0) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (1 == var2) {
                        break L5;
                      } else {
                        tl.field_z = re.a(ia.field_M, 4371, new String[1]);
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    tl.field_z = kf.field_h;
                    break L4;
                  }
                  tl.field_z = lr.a(88, new CharSequence[3]);
                  break L3;
                }
              }
              ji.field_G.i((byte) -104);
              ig.a(7655);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "rq.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_e = 0;
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_h = "Waiting for fonts";
        field_c = "Fleets lost";
    }
}
