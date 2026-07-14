/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nc {
    static Random field_c;
    static String field_e;
    static String field_d;
    static String field_a;
    private java.util.zip.Inflater field_b;

    final static void a(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        lb var4_ref_lb = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        lb var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = StarCannon.field_A;
        fb.field_l = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        if (param0 == -1196777214) {
          var1 = ci.field_g.length;
          var23 = new int[var1];
          var22 = var23;
          var21 = var22;
          var20 = var21;
          var2 = var20;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var1) {
              L1: {
                var3 = fb.field_l[9] >> 685164136;
                var4 = fb.field_l[10] >> 1857367560;
                var5 = fb.field_l[11] >> -1715870424;
                var6 = qb.field_h << 160947684;
                var7 = 0;
                var8 = qf.a(var6, (byte) -112) >> 661181768;
                var9 = ue.b(var6, param0 ^ -1196777089) >> 1088470216;
                if (pe.field_d == 0) {
                  break L1;
                } else {
                  if (0 == la.field_c) {
                    break L1;
                  } else {
                    var9 = -128;
                    var8 = 240 - la.field_c;
                    var7 = -320 + pe.field_d;
                    break L1;
                  }
                }
              }
              var10 = 256.0 / Math.sqrt((double)(var7 * var7 + var8 * var8 + var9 * var9));
              var9 = (int)((double)var9 * var10);
              var8 = (int)((double)var8 * var10);
              var7 = (int)((double)var7 * var10);
              var12 = -var3 + var7;
              var13 = var8 - var4;
              var14 = -var5 + var9;
              var10 = 256.0 / Math.sqrt((double)(var13 * var13 + var12 * var12 - -(var14 * var14)));
              var13 = (int)((double)var13 * var10);
              var14 = (int)((double)var14 * var10);
              var12 = (int)((double)var12 * var10);
              var15 = 0;
              L2: while (true) {
                if (ci.field_g.length <= var15) {
                  return;
                } else {
                  var16 = 0;
                  var17_int = 1;
                  L3: while (true) {
                    if (ci.field_g.length <= var17_int) {
                      var23[var16] = -2147483648;
                      var17 = ci.field_g[var16];
                      lj.a(var16, 8710);
                      var18 = 0;
                      L4: while (true) {
                        if ((var18 ^ -1) <= -4) {
                          sh.a(false, false, 88, la.field_d, var17, fb.field_l, true);
                          kb.a(var9, param0 ^ -1196711933, var12, var17, var14, var8, var7, var13);
                          var15++;
                          continue L2;
                        } else {
                          la.field_d[var18] = la.field_d[var18] + ck.field_h[var15][var18];
                          var18++;
                          continue L4;
                        }
                      }
                    } else {
                      if (var23[var16] < var23[var17_int]) {
                        var16 = var17_int;
                        var17_int++;
                        continue L3;
                      } else {
                        var17_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              var4_ref_lb = ci.field_g[var3];
              var4_ref_lb.c((byte) -3);
              lj.a(var3, 8710);
              var5 = var4_ref_lb.field_p + var4_ref_lb.field_M >> 763282721;
              var6 = var4_ref_lb.field_w + var4_ref_lb.field_F >> 712320257;
              var7 = var4_ref_lb.field_k + var4_ref_lb.field_v >> -995638655;
              var8 = fb.field_l[9] >> -1354974814;
              var9 = fb.field_l[10] >> 359226978;
              var10_int = fb.field_l[11] >> -1196777214;
              var11 = var10_int * la.field_d[5] + (var9 * la.field_d[4] + var8 * la.field_d[3]) >> 1004298990;
              var12 = var10_int * la.field_d[8] + (la.field_d[7] * var9 + var8 * la.field_d[6]) >> 741644430;
              var13 = la.field_d[11] * var10_int + (var8 * la.field_d[9] + var9 * la.field_d[10]) >> -2035616498;
              var2[var3] = var5 * var11 + var6 * var12 + var7 * var13 >> 1930995568;
              var3++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public nc() {
        this(-1, 1000000, 1000000);
    }

    final static id a(byte param0, id param1, int[] param2) {
        id var3 = new id(0, 0, 0);
        var3.field_b = param1.field_b;
        var3.field_k = param1.field_k;
        var3.field_m = param2;
        var3.field_g = param1.field_g;
        if (param0 >= -60) {
            int discarded$0 = nc.a(false, -94);
        }
        var3.field_e = param1.field_e;
        var3.field_f = param1.field_f;
        var3.field_h = param1.field_h;
        var3.field_n = param1.field_n;
        return var3;
    }

    final void a(rb param0, boolean param1, byte[] param2) {
        try {
            if (-32 == (param0.field_f[param0.field_g] ^ -1)) {
                // if_icmpne L47
            } else {
                throw new RuntimeException("");
            }
            if (!(null != ((nc) this).field_b)) {
                ((nc) this).field_b = new java.util.zip.Inflater(true);
            }
            try {
                ((nc) this).field_b.setInput(param0.field_f, 10 + param0.field_g, -10 + (-param0.field_g - (8 - param0.field_f.length)));
                int discarded$2 = ((nc) this).field_b.inflate(param2);
                // if_icmpeq L170
                field_a = null;
            } catch (Exception exception) {
                ((nc) this).field_b.reset();
                throw new RuntimeException("");
            }
            ((nc) this).field_b.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        ck.field_f = ck.field_f + 65536;
        L0: while (true) {
          if (-65537 < (fk.a(ck.field_f, kk.field_e, (byte) -117) ^ -1)) {
            L1: {
              var2 = -1;
              if (og.field_d == null) {
                if (null == pa.field_I) {
                  break L1;
                } else {
                  var2 = pa.field_I.length;
                  break L1;
                }
              } else {
                var2 = og.field_d.length;
                break L1;
              }
            }
            L2: {
              if (param1 != (var2 ^ -1)) {
                L3: {
                  if (rk.field_a < kk.field_c) {
                    rk.field_a = rk.field_a + 1;
                    if (kk.field_a < rk.field_a) {
                      if (null != og.field_d) {
                        L4: {
                          if (null == og.field_d[ag.field_o]) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        rk.field_a = rk.field_a - 1;
                        break L3;
                      } else {
                        rk.field_a = rk.field_a - 1;
                        break L3;
                      }
                    } else {
                      if (kk.field_c > rk.field_a) {
                        break L3;
                      } else {
                        if (null != og.field_d[(ag.field_o - -1) % var2]) {
                          break L3;
                        } else {
                          rk.field_a = rk.field_a - 1;
                          break L3;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (rk.field_a >= kk.field_c) {
                    od.field_i = ag.field_o;
                    rk.field_a = rk.field_a - kk.field_c;
                    if (cc.field_j) {
                      ag.field_o = ag.field_o + 1;
                      if (var2 <= ag.field_o) {
                        ag.field_o = ag.field_o - var2;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      ag.field_o = ag.field_o - 1;
                      if (0 > ag.field_o) {
                        ag.field_o = ag.field_o + var2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                if (rk.field_a > kk.field_a) {
                  cc.field_j = true;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L6: {
              if (ge.field_b != null) {
                L7: {
                  var3 = -(ge.field_b.field_q / 2) + 357;
                  var4 = 0;
                  if (kg.field_a == 0) {
                    break L7;
                  } else {
                    if (var3 >= kc.field_Q) {
                      break L7;
                    } else {
                      if (ge.field_b.field_v + var3 <= kc.field_Q) {
                        break L7;
                      } else {
                        L8: {
                          if (269 - ge.field_b.field_u >= rg.field_B) {
                            break L8;
                          } else {
                            if ((rg.field_B ^ -1) > -270) {
                              cc.field_j = false;
                              var4 = 1;
                              rk.field_a = kk.field_c;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if ((rg.field_B ^ -1) >= -587) {
                          break L7;
                        } else {
                          if (rg.field_B < 586 + ge.field_b.field_u) {
                            cc.field_j = true;
                            rk.field_a = kk.field_c;
                            var4 = 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  break L6;
                } else {
                  if (kk.field_a >= rk.field_a) {
                    break L6;
                  } else {
                    if (var3 >= la.field_c) {
                      break L6;
                    } else {
                      if (la.field_c < var3 - -ge.field_b.field_v) {
                        if (269 - ge.field_b.field_u >= pe.field_d) {
                          if ((pe.field_d ^ -1) >= -587) {
                            break L6;
                          } else {
                            if (586 + ge.field_b.field_u <= pe.field_d) {
                              break L6;
                            } else {
                              rk.field_a = kk.field_a;
                              break L6;
                            }
                          }
                        } else {
                          if ((pe.field_d ^ -1) >= -587) {
                            break L6;
                          } else {
                            if (586 + ge.field_b.field_u <= pe.field_d) {
                              break L6;
                            } else {
                              rk.field_a = kk.field_a;
                              break L6;
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            L9: {
              if (!param0) {
                break L9;
              } else {
                L10: {
                  ea.field_a.a(td.a(rg.field_B, kc.field_Q, true), td.a(pe.field_d, la.field_c, true), -104);
                  if (!ea.field_a.g(0)) {
                    break L10;
                  } else {
                    if (ea.field_a.field_k == 0) {
                      return 3;
                    } else {
                      if (1 == ea.field_a.field_k) {
                        return 2;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                L11: while (true) {
                  if (!ad.e((byte) 93)) {
                    break L9;
                  } else {
                    L12: {
                      ea.field_a.b(0, param1 + -101);
                      if (ea.field_a.g(0)) {
                        if (-1 == (ea.field_a.field_k ^ -1)) {
                          return 3;
                        } else {
                          if (ea.field_a.field_k == -2) {
                            return 1;
                          } else {
                            break L12;
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                    if (-14 == lb.field_B) {
                      return 1;
                    } else {
                      continue L11;
                    }
                  }
                }
              }
            }
            return 0;
          } else {
            fk.field_a = fk.field_a + 1;
            ck.field_f = ck.field_f - kk.field_e;
            continue L0;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var4 = StarCannon.field_A;
        int var2 = param1.charAt(0);
        for (var3 = 1; param1.length() > var3; var3++) {
            if (!(var2 == param1.charAt(var3))) {
                return false;
            }
        }
        var3 = -5 / ((param0 - 19) / 63);
        return true;
    }

    public static void b(byte param0) {
        field_e = null;
        field_d = null;
        int var1 = -4 % ((param0 - -55) / 54);
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0) {
        if (param0 < 45) {
            return;
        }
        int var1 = ii.a(6940);
        int var2 = wc.d(20);
        u.field_c.a(-qf.field_g + p.field_g, (qf.field_g << 1054150273) + var1, 122, nd.field_m + -qc.field_g, var2 - -(qc.field_g << 1765643553));
        bg.b(1000);
    }

    private nc(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Password is valid";
        field_d = "Unpacking music";
        field_e = "Fullscreen";
        field_c = new Random();
    }
}
