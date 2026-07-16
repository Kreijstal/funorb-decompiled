/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends mo {
    static boolean field_o;
    private it[] field_k;
    private int field_h;
    static int field_n;
    private up[][] field_i;
    private int[][] field_j;
    private int[][] field_m;
    private gt[] field_f;
    static boolean field_g;
    private boolean field_l;

    final boolean a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        var3 = ((wl) this).field_k[param1].field_p;
        var4 = 0;
        L0: while (true) {
          if (-5 >= (var4 ^ -1)) {
            if (!param0) {
              return true;
            } else {
              String discarded$1 = ((wl) this).toString();
              return true;
            }
          } else {
            if (param1 == ((wl) this).field_m[var3][var4]) {
              if (-1 == ((wl) this).field_j[var3][var4]) {
                return false;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(ml param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var5 = Kickabout.field_G;
        for (var3 = 0; 2 > var3; var3++) {
            for (var4 = 0; -5 < (var4 ^ -1); var4++) {
                ((wl) this).field_j[var3][var4] = param0.l(4, 59) - 1;
            }
        }
        ((wl) this).field_h = param0.l(8, 59);
        param0.l((byte) 112);
        var3 = 0;
        if (param1) {
            field_g = true;
        }
        while (2 > var3) {
            var6 = 0;
            var4 = var6;
            while (-5 < (var6 ^ -1)) {
                ((wl) this).field_i[var3][var6].a(112, (iw) (Object) param0);
                var6++;
            }
            var3++;
        }
        param0.p(-104);
    }

    public final String toString() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        var4 = Kickabout.field_G;
        var5 = new StringBuilder("AgentLineup");
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((wl) this).field_k.length) {
            return var5.toString();
          } else {
            L1: {
              StringBuilder discarded$89 = var5.append("\t" + var2 + "=");
              if (((wl) this).a(-83, var2)) {
                break L1;
              } else {
                StringBuilder discarded$90 = var5.append(".");
                break L1;
              }
            }
            StringBuilder discarded$91 = var5.append("[");
            var3 = 0;
            L2: while (true) {
              if (4 <= var3) {
                StringBuilder discarded$92 = var5.append(" ]");
                var2++;
                continue L0;
              } else {
                if (((wl) this).field_m[((wl) this).field_k[var2].field_p][var3] == var2) {
                  StringBuilder discarded$93 = var5.append(" " + var3 + "=" + ((wl) this).field_j[((wl) this).field_k[var2].field_p][var3]);
                  var3++;
                  continue L2;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final boolean a(int param0, gr param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          if (((wl) this).field_l) {
            break L0;
          } else {
            if (!param1.field_i[param0].c(-2)) {
              break L0;
            } else {
              return false;
            }
          }
        }
        L1: {
          if (((wl) this).field_l) {
            break L1;
          } else {
            if (!param1.a((byte) -113, param0)) {
              break L1;
            } else {
              return false;
            }
          }
        }
        L2: {
          if (param3 == 4) {
            break L2;
          } else {
            field_g = false;
            break L2;
          }
        }
        var5 = ((wl) this).field_k[param2].field_p;
        var6 = 0;
        L3: while (true) {
          if (var6 >= 4) {
            return true;
          } else {
            if (((wl) this).field_m[var5][var6] == param2) {
              if (param0 == ((wl) this).field_j[var5][var6]) {
                return false;
              } else {
                var6++;
                continue L3;
              }
            } else {
              var6++;
              continue L3;
            }
          }
        }
    }

    final void a(gr param0, up[] param1, byte param2, int param3, int param4) {
        int var7 = Kickabout.field_G;
        int var6 = 0;
        if (param2 > -70) {
            Object var8 = null;
            ((wl) this).a((byte) -51, (mo) null);
        }
        while (-10 < (var6 ^ -1)) {
            if (!(!this.a(var6, param0, param4, 4))) {
                ((wl) this).a(var6 - -1 << -1206570558 | param3, 0, param0, param1, param4);
                return;
            }
            var6++;
        }
    }

    final void a(int param0, int param1, gr param2, up[] param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        up var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        up var13 = null;
        up stackIn_21_0 = null;
        Object stackOut_20_0 = null;
        up stackOut_19_0 = null;
        L0: {
          var11 = Kickabout.field_G;
          var6 = ((wl) this).field_k[param4].field_p;
          if (param1 == 0) {
            break L0;
          } else {
            var12 = null;
            ((wl) this).a((byte) 13, (mo) null);
            break L0;
          }
        }
        L1: {
          if (-1 == param0) {
            ((wl) this).field_h = ((wl) this).field_h ^ 1 << param4;
            break L1;
          } else {
            if (1 != (param0 ^ -1)) {
              var7 = 3 & param0;
              var8 = (param0 >> -721346462) + -1;
              if ((((wl) this).field_m[var6][var7] ^ -1) == (param4 ^ -1)) {
                if (0 < (var8 ^ -1)) {
                  return;
                } else {
                  if (9 > var8) {
                    L2: {
                      if ((var8 ^ -1) == 0) {
                        stackOut_20_0 = null;
                        stackIn_21_0 = (up) (Object) stackOut_20_0;
                        break L2;
                      } else {
                        stackOut_19_0 = param2.field_i[var8];
                        stackIn_21_0 = stackOut_19_0;
                        break L2;
                      }
                    }
                    L3: {
                      var13 = stackIn_21_0;
                      var9 = var13;
                      if (0 == (var8 ^ -1)) {
                        break L3;
                      } else {
                        if (!((wl) this).field_l) {
                          if (var13.c(-2)) {
                            return;
                          } else {
                            if (param2.a((byte) 79, var8)) {
                              return;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          var9 = param3[var8];
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (-1 == var8) {
                        ((wl) this).field_i[var6][var7].b((byte) -7);
                        break L4;
                      } else {
                        var10 = 0;
                        L5: while (true) {
                          if (-5 >= (var10 ^ -1)) {
                            ((wl) this).field_i[var6][var7].a((byte) -90, var9);
                            break L4;
                          } else {
                            L6: {
                              if ((((wl) this).field_m[var6][var10] ^ -1) != (param4 ^ -1)) {
                                break L6;
                              } else {
                                if ((((wl) this).field_j[var6][var10] ^ -1) != (var8 ^ -1)) {
                                  break L6;
                                } else {
                                  ((wl) this).field_j[var6][var10] = ((wl) this).field_j[var6][var7];
                                  ((wl) this).field_i[var6][var10].a((byte) -101, ((wl) this).field_i[var6][var7]);
                                  break L6;
                                }
                              }
                            }
                            var10++;
                            continue L5;
                          }
                        }
                      }
                    }
                    ((wl) this).field_j[var6][var7] = var8;
                    ((wl) this).field_h = ((wl) this).field_h & (1 << param4 ^ -1);
                    break L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (!((wl) this).a(false, param4)) {
                var7 = 0;
                L7: while (true) {
                  if (4 <= var7) {
                    break L1;
                  } else {
                    L8: {
                      if ((((wl) this).field_m[var6][var7] ^ -1) != (param4 ^ -1)) {
                        break L8;
                      } else {
                        if ((((wl) this).field_j[var6][var7] ^ -1) == 0) {
                          ((wl) this).a(param2, param3, (byte) -78, var7, param4);
                          ((wl) this).field_h = ((wl) this).field_h & (1 << param4 ^ -1);
                          break L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var7++;
                    continue L7;
                  }
                }
              } else {
                break L1;
              }
            }
          }
        }
    }

    final void a(byte param0, mo param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        wl var3 = (wl) (Object) param1;
        if (param0 > -52) {
            ((wl) this).field_m = null;
        }
        for (var4 = 0; -3 < (var4 ^ -1); var4++) {
            for (var5 = 0; (var5 ^ -1) > -5; var5++) {
                ((wl) this).field_i[var4][var5].a((byte) -90, var3.field_i[var4][var5]);
                ((wl) this).field_j[var4][var5] = var3.field_j[var4][var5];
            }
        }
        ((wl) this).field_h = var3.field_h;
    }

    final boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -80) {
          L0: {
            L1: {
              if (!((wl) this).field_f[param1].d(3511)) {
                break L1;
              } else {
                if ((1 << param1 & ((wl) this).field_h) == 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    wl(boolean param0, it[] param1, gt[] param2, int[][] param3, int[][] param4, up[][] param5) {
        ((wl) this).field_f = param2;
        ((wl) this).field_k = param1;
        ((wl) this).field_j = param4;
        ((wl) this).field_m = param3;
        ((wl) this).field_i = param5;
        ((wl) this).field_l = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
        field_n = 0;
        field_g = false;
    }
}
