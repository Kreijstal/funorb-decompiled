/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qn extends hl {
    int field_i;
    static boolean field_k;
    static pf[] field_l;
    int field_j;
    static bm[] field_m;
    static String field_n;

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (lk.field_h == null) {
                break L0;
              } else {
                L1: {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (d.field_f == ad.field_b) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (param1 != da.field_p.field_l) {
                    break L2;
                  } else {
                    if (~bb.b(-1) < ~(10000L + qf.field_l)) {
                      da.field_p.c((byte) 33, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (da.field_p.field_l > 0) {
                    {
                      L4: {
                        lk.field_h.a(da.field_p.field_l, da.field_p.field_i, 0, 1);
                        qf.field_l = bb.b(-1);
                        break L4;
                      }
                    }
                    da.field_p.field_l = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            da.field_p.field_l = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 >= -41) {
            field_l = null;
        }
        field_l = null;
        field_m = null;
    }

    private qn() throws Throwable {
        throw new Error();
    }

    final static lc a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        lc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        lc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == -7079) {
              stackOut_3_0 = new lc(param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (lc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("qn.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        Object var9 = null;
        ja var10 = null;
        ja var11 = null;
        ja var12 = null;
        ja var13 = null;
        float stackIn_31_0 = 0.0f;
        float stackIn_59_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float stackOut_58_0 = 0.0f;
        float stackOut_57_0 = 0.0f;
        float stackOut_30_0 = 0.0f;
        float stackOut_29_0 = 0.0f;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (!nd.field_e) {
                break L1;
              } else {
                nd.field_e = false;
                tn.a(param0 + -7);
                break L1;
              }
            }
            if (3 == bl.field_r.field_J) {
              wm.a(param1, false, 0);
              return;
            } else {
              ce.field_r = -1;
              if (mi.field_d == 7) {
                L2: {
                  ((ti) (Object) l.field_a[3]).g(0, cf.field_w);
                  if (!bl.field_r.field_U) {
                    break L2;
                  } else {
                    if (param2) {
                      break L2;
                    } else {
                      cc.a(bl.field_r.field_C[0].field_R, cf.field_w, vg.field_P, bl.field_r.field_ob, -122);
                      var3_int = 0;
                      L3: while (true) {
                        if (var3_int >= 4) {
                          if (bl.field_r.field_C[0].field_R >= 2) {
                            L4: {
                              pg.a(3, (byte) 102, true);
                              int fieldTemp$5 = kk.field_l - 1;
                              kk.field_l = kk.field_l - 1;
                              if (1 > fieldTemp$5) {
                                ek.field_x = 6;
                                wm.a(param1, false, 11);
                                break L4;
                              } else {
                                ek.field_x = 1;
                                dk.field_g = dk.field_g - 1;
                                wm.a(param1, false, 10);
                                break L4;
                              }
                            }
                            return;
                          } else {
                            L5: {
                              pg.a(2, (byte) 116, true);
                              if (param0 == 7) {
                                break L5;
                              } else {
                                var9 = null;
                                lc discarded$6 = qn.a((String) null, -40);
                                break L5;
                              }
                            }
                            L6: {
                              if (cf.field_w != ao.field_b) {
                                break L6;
                              } else {
                                if (hk.field_d == vg.field_P) {
                                  L7: {
                                    int fieldTemp$7 = hk.field_d + 1;
                                    hk.field_d = hk.field_d + 1;
                                    if (fieldTemp$7 != pc.field_l[ao.field_b]) {
                                      break L7;
                                    } else {
                                      hk.field_d = hk.field_d - 1;
                                      break L7;
                                    }
                                  }
                                  tn.a(0);
                                  h.b((byte) 121);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L8: {
                              var3_int = bl.field_r.field_ob;
                              kk.field_m[vg.field_P] = var3_int;
                              nj.field_d = bl.field_r.field_t;
                              hn.field_y = hn.field_y + var3_int;
                              ni.field_b = bl.field_r.field_hb;
                              cm.field_a = bl.field_r.field_y;
                              tn.field_c = bl.field_r.field_g;
                              ni.field_b = ni.field_b - 1;
                              tn.field_c = tn.field_c + 1;
                              cm.field_a = cm.field_a - (tn.field_c + hn.field_y);
                              nj.field_d = nj.field_d + ni.field_b;
                              int fieldTemp$8 = vg.field_P + 1;
                              vg.field_P = vg.field_P + 1;
                              if (fieldTemp$8 == pc.field_l[cf.field_w]) {
                                L9: {
                                  if (eg.field_a != 0) {
                                    break L9;
                                  } else {
                                    cc.a(kk.field_m, (byte) -89, cf.field_w);
                                    if (cf.field_w == ao.field_b) {
                                      if (3 > ao.field_b) {
                                        hk.field_d = 0;
                                        int fieldTemp$9 = ao.field_b + 1;
                                        ao.field_b = ao.field_b + 1;
                                        ce.field_r = fieldTemp$9;
                                        tn.a(0);
                                        h.b((byte) -125);
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                vg.field_P = 0;
                                ek.field_x = 2;
                                break L8;
                              } else {
                                dk.field_g = 3;
                                ek.field_x = 0;
                                break L8;
                              }
                            }
                            L10: {
                              L11: {
                                if (ek.field_x == 0) {
                                  break L11;
                                } else {
                                  if (1 != ek.field_x) {
                                    wm.a(param1, false, 11);
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              wm.a(param1, false, 10);
                              break L10;
                            }
                            break L0;
                          }
                        } else {
                          L12: {
                            var11 = bl.field_r.field_C[var3_int];
                            var13 = var11;
                            t.field_j[var3_int] = t.field_j[var3_int] + ub.field_C[var11.field_R];
                            if (var13.field_bc > bl.field_r.field_B) {
                              pe.field_g[var3_int] = var11.field_Pb;
                              break L12;
                            } else {
                              L13: {
                                if (var13.field_Ib <= var13.field_vb) {
                                  stackOut_58_0 = var13.field_Ib;
                                  stackIn_59_0 = stackOut_58_0;
                                  break L13;
                                } else {
                                  stackOut_57_0 = var13.field_vb;
                                  stackIn_59_0 = stackOut_57_0;
                                  break L13;
                                }
                              }
                              var5 = stackIn_59_0;
                              var6 = cd.a((wc[]) (Object) bl.field_r.field_sb, param0 ^ 6, var5);
                              var7 = (var6 + (float)var13.field_bc - 1.0f) / (float)bl.field_r.field_B;
                              if (0.0f == var7) {
                                pe.field_g[var3_int] = -1;
                                break L12;
                              } else {
                                pe.field_g[var3_int] = (int)((float)bl.field_r.field_ob / var7);
                                if (bl.field_r.field_ob + 1000 >= pe.field_g[var3_int]) {
                                  break L12;
                                } else {
                                  pe.field_g[var3_int] = -1;
                                  break L12;
                                }
                              }
                            }
                          }
                          var3_int++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                L14: {
                  bn.a(1, param0 + -121);
                  if (pj.b((byte) 102)) {
                    L15: {
                      if (0 != ii.field_c) {
                        break L15;
                      } else {
                        if (!ad.field_a) {
                          wm.a(param1, false, 12);
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    wm.a(param1, false, 9);
                    break L14;
                  } else {
                    if (0 != ii.field_c) {
                      wm.a(param1, false, 7);
                      break L14;
                    } else {
                      wm.a(param1, false, 3);
                      break L14;
                    }
                  }
                }
                return;
              } else {
                L16: {
                  L17: {
                    if (!bl.field_r.field_U) {
                      break L17;
                    } else {
                      if (!param2) {
                        L18: {
                          if (0 == mi.field_d) {
                            ek.field_x = 4;
                            var3_int = 0;
                            L19: while (true) {
                              if (var3_int >= 4) {
                                cc.a(bl.field_r.field_C[0].field_R, cf.field_w, vg.field_P, bl.field_r.field_ob, -126);
                                break L18;
                              } else {
                                L20: {
                                  var10 = bl.field_r.field_C[var3_int];
                                  var12 = var10;
                                  if (bl.field_r.field_B >= var12.field_bc) {
                                    L21: {
                                      if (var12.field_vb < var12.field_Ib) {
                                        stackOut_30_0 = var12.field_vb;
                                        stackIn_31_0 = stackOut_30_0;
                                        break L21;
                                      } else {
                                        stackOut_29_0 = var12.field_Ib;
                                        stackIn_31_0 = stackOut_29_0;
                                        break L21;
                                      }
                                    }
                                    var5 = stackIn_31_0;
                                    var6 = cd.a((wc[]) (Object) bl.field_r.field_sb, 1, var5);
                                    var7 = (-1.0f + ((float)var12.field_bc + var6)) / (float)bl.field_r.field_B;
                                    if (0.0f == var7) {
                                      pe.field_g[var3_int] = -1;
                                      break L20;
                                    } else {
                                      pe.field_g[var3_int] = (int)((float)bl.field_r.field_ob / var7);
                                      if (pe.field_g[var3_int] > bl.field_r.field_ob - -1000) {
                                        pe.field_g[var3_int] = -1;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  } else {
                                    pe.field_g[var3_int] = var10.field_Pb;
                                    break L20;
                                  }
                                }
                                var3_int++;
                                continue L19;
                              }
                            }
                          } else {
                            if (2 != mi.field_d) {
                              throw new RuntimeException();
                            } else {
                              ek.field_x = 5;
                              break L18;
                            }
                          }
                        }
                        wm.a(param1, false, 11);
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (pj.b((byte) 121)) {
                    L22: {
                      if (0 != ii.field_c) {
                        break L22;
                      } else {
                        if (!ad.field_a) {
                          wm.a(param1, false, 0);
                          break L16;
                        } else {
                          break L22;
                        }
                      }
                    }
                    wm.a(param1, false, 9);
                    break L16;
                  } else {
                    if (ii.field_c == 0) {
                      wm.a(param1, false, 0);
                      break L16;
                    } else {
                      wm.a(param1, false, 8);
                      break L16;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var3, "qn.D(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
