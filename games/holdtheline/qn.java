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
            IOException iOException = null;
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
                    if ((bb.b(-1) ^ -1L) < (10000L + qf.field_l ^ -1L)) {
                      da.field_p.c((byte) 33, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((da.field_p.field_l ^ -1) < -1) {
                    try {
                      lk.field_h.a(da.field_p.field_l, da.field_p.field_i, 0, 1);
                      qf.field_l = bb.b(-1);
                    } catch (java.io.IOException decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    iOException = (IOException) (Object) decompiledCaughtException;
                    r.a(-28036);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                da.field_p.field_l = 0;
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
        if (param1 != -7079) {
            return null;
        }
        return new lc(param0);
    }

    final static void a(int param0, boolean param1, boolean param2) {
        int var3 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        Object var9 = null;
        ja var10 = null;
        ja var11 = null;
        ja var12 = null;
        ja var13 = null;
        float stackIn_29_0 = 0.0f;
        float stackIn_56_0 = 0.0f;
        float stackOut_55_0 = 0.0f;
        float stackOut_54_0 = 0.0f;
        float stackOut_28_0 = 0.0f;
        float stackOut_27_0 = 0.0f;
        L0: {
          var8 = HoldTheLine.field_D;
          if (!nd.field_e) {
            break L0;
          } else {
            nd.field_e = false;
            tn.a(param0 + -7);
            break L0;
          }
        }
        if (3 == bl.field_r.field_J) {
          wm.a(param1, false, 0);
          return;
        } else {
          ce.field_r = -1;
          if (-8 == (mi.field_d ^ -1)) {
            L1: {
              ((ti) (Object) l.field_a[3]).g(0, cf.field_w);
              if (!bl.field_r.field_U) {
                break L1;
              } else {
                if (param2) {
                  break L1;
                } else {
                  cc.a(bl.field_r.field_C[0].field_R, cf.field_w, vg.field_P, bl.field_r.field_ob, -122);
                  var3 = 0;
                  L2: while (true) {
                    if (-5 >= (var3 ^ -1)) {
                      if (bl.field_r.field_C[0].field_R >= 2) {
                        L3: {
                          pg.a(3, (byte) 102, true);
                          kk.field_l = kk.field_l - 1;
                          if (1 > kk.field_l - 1) {
                            ek.field_x = 6;
                            wm.a(param1, false, 11);
                            break L3;
                          } else {
                            ek.field_x = 1;
                            dk.field_g = dk.field_g - 1;
                            wm.a(param1, false, 10);
                            break L3;
                          }
                        }
                        return;
                      } else {
                        L4: {
                          pg.a(2, (byte) 116, true);
                          if (param0 == 7) {
                            break L4;
                          } else {
                            var9 = null;
                            lc discarded$1 = qn.a((String) null, -40);
                            break L4;
                          }
                        }
                        L5: {
                          if (cf.field_w != ao.field_b) {
                            break L5;
                          } else {
                            if (hk.field_d == vg.field_P) {
                              L6: {
                                hk.field_d = hk.field_d + 1;
                                if (hk.field_d + 1 != pc.field_l[ao.field_b]) {
                                  break L6;
                                } else {
                                  hk.field_d = hk.field_d - 1;
                                  break L6;
                                }
                              }
                              tn.a(0);
                              h.b((byte) 121);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L7: {
                          var3 = bl.field_r.field_ob;
                          kk.field_m[vg.field_P] = var3;
                          nj.field_d = bl.field_r.field_t;
                          hn.field_y = hn.field_y + var3;
                          ni.field_b = bl.field_r.field_hb;
                          cm.field_a = bl.field_r.field_y;
                          tn.field_c = bl.field_r.field_g;
                          ni.field_b = ni.field_b - 1;
                          tn.field_c = tn.field_c + 1;
                          cm.field_a = cm.field_a - (tn.field_c + hn.field_y);
                          nj.field_d = nj.field_d + ni.field_b;
                          vg.field_P = vg.field_P + 1;
                          if (vg.field_P + 1 == pc.field_l[cf.field_w]) {
                            L8: {
                              if (eg.field_a != 0) {
                                break L8;
                              } else {
                                cc.a(kk.field_m, (byte) -89, cf.field_w);
                                if (cf.field_w == ao.field_b) {
                                  if (3 > ao.field_b) {
                                    hk.field_d = 0;
                                    ao.field_b = ao.field_b + 1;
                                    ce.field_r = ao.field_b + 1;
                                    tn.a(0);
                                    h.b((byte) -125);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            }
                            vg.field_P = 0;
                            ek.field_x = 2;
                            break L7;
                          } else {
                            dk.field_g = 3;
                            ek.field_x = 0;
                            break L7;
                          }
                        }
                        L9: {
                          L10: {
                            if (ek.field_x == 0) {
                              break L10;
                            } else {
                              if (1 != ek.field_x) {
                                wm.a(param1, false, 11);
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          wm.a(param1, false, 10);
                          break L9;
                        }
                        return;
                      }
                    } else {
                      var11 = bl.field_r.field_C[var3];
                      var13 = var11;
                      t.field_j[var3] = t.field_j[var3] + ub.field_C[var11.field_R];
                      if (var13.field_bc > bl.field_r.field_B) {
                        pe.field_g[var3] = var11.field_Pb;
                        var3++;
                        continue L2;
                      } else {
                        L11: {
                          if (var13.field_Ib <= var13.field_vb) {
                            stackOut_55_0 = var13.field_Ib;
                            stackIn_56_0 = stackOut_55_0;
                            break L11;
                          } else {
                            stackOut_54_0 = var13.field_vb;
                            stackIn_56_0 = stackOut_54_0;
                            break L11;
                          }
                        }
                        L12: {
                          var5 = stackIn_56_0;
                          var6 = cd.a((wc[]) (Object) bl.field_r.field_sb, param0 ^ 6, var5);
                          var7 = (var6 + (float)var13.field_bc - 1.0f) / (float)bl.field_r.field_B;
                          if (0.0f == var7) {
                            break L12;
                          } else {
                            pe.field_g[var3] = (int)((float)bl.field_r.field_ob / var7);
                            if (bl.field_r.field_ob + 1000 < pe.field_g[var3]) {
                              break L12;
                            } else {
                              var3++;
                              continue L2;
                            }
                          }
                        }
                        pe.field_g[var3] = -1;
                        var3++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            L13: {
              bn.a(1, param0 + -121);
              if (pj.b((byte) 102)) {
                L14: {
                  if (0 != ii.field_c) {
                    break L14;
                  } else {
                    if (!ad.field_a) {
                      wm.a(param1, false, 12);
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                wm.a(param1, false, 9);
                break L13;
              } else {
                if (0 != ii.field_c) {
                  wm.a(param1, false, 7);
                  break L13;
                } else {
                  wm.a(param1, false, 3);
                  break L13;
                }
              }
            }
            return;
          } else {
            L15: {
              L16: {
                if (!bl.field_r.field_U) {
                  break L16;
                } else {
                  if (!param2) {
                    L17: {
                      if (0 == mi.field_d) {
                        ek.field_x = 4;
                        var3 = 0;
                        L18: while (true) {
                          if (var3 >= 4) {
                            cc.a(bl.field_r.field_C[0].field_R, cf.field_w, vg.field_P, bl.field_r.field_ob, -126);
                            break L17;
                          } else {
                            var10 = bl.field_r.field_C[var3];
                            var12 = var10;
                            if (bl.field_r.field_B >= var12.field_bc) {
                              L19: {
                                if (var12.field_vb < var12.field_Ib) {
                                  stackOut_28_0 = var12.field_vb;
                                  stackIn_29_0 = stackOut_28_0;
                                  break L19;
                                } else {
                                  stackOut_27_0 = var12.field_Ib;
                                  stackIn_29_0 = stackOut_27_0;
                                  break L19;
                                }
                              }
                              L20: {
                                var5 = stackIn_29_0;
                                var6 = cd.a((wc[]) (Object) bl.field_r.field_sb, 1, var5);
                                var7 = (-1.0f + ((float)var12.field_bc + var6)) / (float)bl.field_r.field_B;
                                if (0.0f == var7) {
                                  break L20;
                                } else {
                                  pe.field_g[var3] = (int)((float)bl.field_r.field_ob / var7);
                                  if (pe.field_g[var3] > bl.field_r.field_ob - -1000) {
                                    break L20;
                                  } else {
                                    var3++;
                                    continue L18;
                                  }
                                }
                              }
                              pe.field_g[var3] = -1;
                              var3++;
                              continue L18;
                            } else {
                              pe.field_g[var3] = var10.field_Pb;
                              var3++;
                              continue L18;
                            }
                          }
                        }
                      } else {
                        if (2 != mi.field_d) {
                          throw new RuntimeException();
                        } else {
                          ek.field_x = 5;
                          break L17;
                        }
                      }
                    }
                    wm.a(param1, false, 11);
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              if (pj.b((byte) 121)) {
                L21: {
                  if (0 != ii.field_c) {
                    break L21;
                  } else {
                    if (!ad.field_a) {
                      wm.a(param1, false, 0);
                      break L15;
                    } else {
                      break L21;
                    }
                  }
                }
                wm.a(param1, false, 9);
                break L15;
              } else {
                if (ii.field_c == 0) {
                  wm.a(param1, false, 0);
                  break L15;
                } else {
                  wm.a(param1, false, 8);
                  break L15;
                }
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
