/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends ka {
    static boolean field_r;
    static int field_t;
    static char field_p;
    static ds field_u;
    static String field_s;
    static ap field_q;

    hg(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 6);
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10, boolean param11) {
        so.a(0, param8, 16777215, param9, param2, param6, param11, param5, param0, param4, param10, param1, param7, param3);
    }

    final int a(int param0, int param1, fs param2) {
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln[] var8_ref_ln__ = null;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        ln[] var12 = null;
        int var13 = 0;
        ln var14 = null;
        int var15 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var15 = ShatteredPlansClient.field_F ? 1 : 0;
          var4 = param2.field_x;
          if (((hg) this).field_n == param2) {
            break L0;
          } else {
            if (((hg) this).field_n.field_h[var4]) {
              break L0;
            } else {
              if ((1 << var4 & ((hg) this).field_g.field_w) != 0) {
                return 0;
              } else {
                var5 = ((hg) this).field_g.field_v[((hg) this).field_g.field_m[-1 + ((hg) this).field_g.field_r]];
                if (param2 == var5) {
                  return 1;
                } else {
                  var6 = param1;
                  var7 = 0;
                  var8_ref_ln__ = ((hg) this).field_g.field_g.field_e;
                  var9 = 0;
                  L1: while (true) {
                    if (var8_ref_ln__.length <= var9) {
                      if (var7 * 2 < var6) {
                        return -1;
                      } else {
                        L2: {
                          var8 = lc.a(param1 + 12330, (1 << ((hg) this).field_g.field_r) - 1 ^ ((hg) this).field_g.field_w);
                          if (var8 * var6 >= var7) {
                            break L2;
                          } else {
                            if (((hg) this).field_g.field_D[((hg) this).field_n.field_x] > ((hg) this).field_g.field_D[var4] * var8) {
                              return 4;
                            } else {
                              break L2;
                            }
                          }
                        }
                        L3: {
                          if (var5 != ((hg) this).field_n) {
                            stackOut_31_0 = -2;
                            stackIn_32_0 = stackOut_31_0;
                            break L3;
                          } else {
                            stackOut_30_0 = -3;
                            stackIn_32_0 = stackOut_30_0;
                            break L3;
                          }
                        }
                        return stackIn_32_0;
                      }
                    } else {
                      var10 = var8_ref_ln__[var9];
                      if (var10.field_y == ((hg) this).field_n) {
                        var11 = 0;
                        var12 = var10.field_D;
                        var13 = 0;
                        L4: while (true) {
                          if (var13 >= var12.length) {
                            if (var11 != 0) {
                              var7 = var7 + var10.field_x;
                              var9++;
                              continue L1;
                            } else {
                              var9++;
                              continue L1;
                            }
                          } else {
                            var14 = var12[var13];
                            if (var14.field_y == param2) {
                              var11 = 1;
                              var6 = var6 + var14.field_x;
                              var13++;
                              continue L4;
                            } else {
                              var13++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        var9++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var2 = 0; ((hg) this).field_g.field_r > var2; var2++) {
            ((hg) this).field_b[var2] = ((hg) this).a(0, 0, ((hg) this).field_g.field_v[var2]);
        }
        if (param0 != -18484) {
            hg.a(-92, true, -31, false, 87, 112, -41, 4, true, false, 96, false);
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_u = null;
        field_q = null;
        field_s = null;
    }

    final int[] b(int param0) {
        int var2 = -114 % ((-48 - param0) / 61);
        return new int[]{17, 18};
    }

    final static String a(boolean param0, nf param1) {
        String var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param0) {
          L0: {
            var2 = null;
            if (param1.field_d == null) {
              break L0;
            } else {
              L1: {
                var5 = param1.field_d;
                var2 = var5;
                var2 = var5;
                if (-2 == (param1.field_c ^ -1)) {
                  var2 = "<img=0>" + var5;
                  break L1;
                } else {
                  break L1;
                }
              }
              if ((param1.field_c ^ -1) != -3) {
                break L0;
              } else {
                var2 = "<img=1>" + var2;
                break L0;
              }
            }
          }
          L2: {
            var3 = "";
            if ((param1.field_n ^ -1) == -3) {
              if (!param1.field_h) {
                L3: {
                  if (-1 != param1.field_l) {
                    break L3;
                  } else {
                    if (-1 == param1.field_e) {
                      var3 = re.a(fj.field_q, 4371, new String[1]);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var3 = re.a(cf.field_M, 4371, new String[1]);
                break L2;
              } else {
                break L2;
              }
            } else {
              L4: {
                if (param1.field_n != 0) {
                  break L4;
                } else {
                  if (!je.field_e) {
                    break L4;
                  } else {
                    var3 = "[" + ds.field_a + "] ";
                    break L4;
                  }
                }
              }
              L5: {
                if ((param1.field_n ^ -1) == -2) {
                  var3 = "[" + re.a(he.field_q, 4371, new String[1]) + "] ";
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if ((param1.field_n ^ -1) != -5) {
                  break L6;
                } else {
                  if (wf.field_m != null) {
                    var3 = "[" + wf.field_m + "] ";
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (param1.field_n == 3) {
                  var3 = "[#" + param1.field_o + "] ";
                  break L7;
                } else {
                  break L7;
                }
              }
              if (param1.field_h) {
                break L2;
              } else {
                var3 = var3 + var2 + ": ";
                break L2;
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    public final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          if (((hg) this).field_g.field_o.field_i) {
            if (((hg) this).field_n.field_m.e(27650)) {
              ((hg) this).a(false, param0 ^ 6898);
              break L0;
            } else {
              break L0;
            }
          } else {
            if (!((hg) this).field_n.field_i.g(param0 ^ 80)) {
              break L0;
            } else {
              ((hg) this).a(false, -6861);
              break L0;
            }
          }
        }
        L1: {
          var2 = ((hg) this).field_g.field_m[((hg) this).field_g.field_r - 1];
          if (param0 == -63) {
            break L1;
          } else {
            field_q = null;
            break L1;
          }
        }
        var3 = ((hg) this).field_g.field_D[var2];
        var4 = 0;
        L2: while (true) {
          if (var4 >= ((hg) this).field_g.field_r) {
            L3: {
              if (!((hg) this).c((byte) -116)) {
                break L3;
              } else {
                ((hg) this).g(-18484);
                var4 = 0;
                L4: while (true) {
                  if (((hg) this).field_g.field_r <= var4) {
                    break L3;
                  } else {
                    if (((hg) this).field_b[var4] < 0) {
                      L5: {
                        var5 = ((hg) this).field_g.field_v[var4];
                        if (((hg) this).field_c[var4] < -1) {
                          break L5;
                        } else {
                          L6: {
                            var9 = ((hg) this).field_b[var4];
                            if (var9 == -1) {
                              var6 = 7;
                              break L6;
                            } else {
                              if (1 != var9) {
                                if (var9 != -3) {
                                  var6 = -1;
                                  break L6;
                                } else {
                                  var7 = ((hg) this).field_g.field_m[-1 + ((hg) this).field_g.field_r];
                                  var6 = 9;
                                  var8 = ((hg) this).field_g.field_m[-2 + ((hg) this).field_g.field_r];
                                  if (var7 == ((hg) this).field_n.field_x) {
                                    break L6;
                                  } else {
                                    if (var7 != var4) {
                                      if (((hg) this).field_g.field_D[var7] * 2 > ((hg) this).field_g.field_D[var8] * 3) {
                                        var6 = 8;
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              } else {
                                var6 = 8;
                                break L6;
                              }
                            }
                          }
                          if (var6 == -1) {
                            break L5;
                          } else {
                            ((hg) this).field_j.a(0, (byte) -118, var5, ((hg) this).field_n, var6);
                            ((hg) this).field_c[var4] = rg.a(6, 3, (byte) 118);
                            break L5;
                          }
                        }
                      }
                      ((hg) this).field_j.a((byte) -63, ((hg) this).field_n, var5);
                      var4++;
                      continue L4;
                    } else {
                      var4++;
                      continue L4;
                    }
                  }
                }
              }
            }
            return;
          } else {
            ((hg) this).field_c[var4] = ((hg) this).field_c[var4] - 1;
            if (var2 != var4) {
              if (((hg) this).field_g.field_D[var4] * 2 < var3) {
                ((hg) this).field_i[var4] = 0;
                var4++;
                continue L2;
              } else {
                ((hg) this).field_i[var4] = ((hg) this).field_i[var4] - 1;
                var4++;
                continue L2;
              }
            } else {
              ((hg) this).field_i[var4] = 3;
              var4++;
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = '/';
        field_u = new ds(3);
        field_s = "<%0> points per turn";
    }
}
