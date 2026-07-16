/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends lq {
    private int[][] field_j;
    private qm[] field_p;
    static String field_m;
    ru[] field_k;
    int[] field_n;
    private int[] field_l;
    int field_o;
    private int[] field_i;

    final int d() {
        return 2;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        L0: {
          if (param2 == -85) {
            break L0;
          } else {
            ((jj) this).field_l = null;
            break L0;
          }
        }
        L1: {
          if ((param0 ^ -1) > -1) {
            break L1;
          } else {
            if (((jj) this).field_o <= param0) {
              break L1;
            } else {
              L2: {
                if (-1 < (param1 ^ -1)) {
                  break L2;
                } else {
                  if (256 >= param1) {
                    ((jj) this).field_l[param0] = param1;
                    return;
                  } else {
                    break L2;
                  }
                }
              }
              throw new IllegalArgumentException("Illegal volume: " + param1);
            }
          }
        }
        throw new IllegalArgumentException("Illegal midiplayer: " + param0);
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        var11 = Kickabout.field_G;
        var4 = 1;
        var5 = 0;
        L0: while (true) {
          if (((jj) this).field_l.length <= var5) {
            if (var4 == 0) {
              var5 = 0;
              var6_int = 0;
              L1: while (true) {
                if (var6_int >= ((jj) this).field_p.length) {
                  var12 = 0;
                  var6_int = var12;
                  L2: while (true) {
                    if (var12 >= ((jj) this).field_n.length) {
                      var16 = new int[((jj) this).field_o];
                      var15 = var16;
                      var14 = var15;
                      var13 = var14;
                      var6 = var13;
                      var7 = 0;
                      L3: while (true) {
                        if (var7 >= var16.length) {
                          if (var5 != 0) {
                            L4: {
                              if (!uh.field_o) {
                                stackOut_31_0 = param2;
                                stackIn_32_0 = stackOut_31_0;
                                break L4;
                              } else {
                                stackOut_30_0 = param2 << 645111105;
                                stackIn_32_0 = stackOut_30_0;
                                break L4;
                              }
                            }
                            L5: {
                              L6: {
                                var7 = stackIn_32_0;
                                if (((jj) this).field_j[0] == null) {
                                  break L6;
                                } else {
                                  if (var7 <= ((jj) this).field_j[0].length) {
                                    var8 = 0;
                                    L7: while (true) {
                                      if (((jj) this).field_j.length <= var8) {
                                        break L5;
                                      } else {
                                        dv.a(((jj) this).field_j[var8], 0, var7);
                                        var8++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var8 = 0;
                              L8: while (true) {
                                if (var8 >= ((jj) this).field_j.length) {
                                  break L5;
                                } else {
                                  ((jj) this).field_j[var8] = new int[var7];
                                  var8++;
                                  continue L8;
                                }
                              }
                            }
                            var8 = 0;
                            L9: while (true) {
                              if (var8 >= ((jj) this).field_p.length) {
                                L10: {
                                  if (uh.field_o) {
                                    param1 = param1 << 1;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var8 = 0;
                                L11: while (true) {
                                  if (var8 >= var7) {
                                    return;
                                  } else {
                                    var9 = 0;
                                    var10 = 0;
                                    L12: while (true) {
                                      if (((jj) this).field_j.length <= var10) {
                                        param0[var8 + param1] = param0[var8 + param1] + (var9 >> 2041165448);
                                        var8++;
                                        continue L11;
                                      } else {
                                        if (null != ((jj) this).field_p[var10]) {
                                          var9 = var9 + ((jj) this).field_j[var10][var8] * var16[var10];
                                          var10++;
                                          continue L12;
                                        } else {
                                          var10++;
                                          continue L12;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (((jj) this).field_p[var8] != null) {
                                  ((jj) this).field_k[var8].a(((jj) this).field_j[var8], param1, param2);
                                  var8++;
                                  continue L9;
                                } else {
                                  var8++;
                                  continue L9;
                                }
                              }
                            }
                          } else {
                            return;
                          }
                        } else {
                          var6[var7] = (((jj) this).field_i[var7] >> 2008699340) * ((jj) this).field_l[var7] / 256;
                          var7++;
                          continue L3;
                        }
                      }
                    } else {
                      if (-1 != (((jj) this).field_n[var12] ^ -1)) {
                        L13: {
                          ((jj) this).field_i[var12] = ((jj) this).field_i[var12] + ((jj) this).field_n[var12] * param2;
                          if ((((jj) this).field_i[var12] ^ -1) <= -1048577) {
                            ((jj) this).field_i[var12] = 1048576;
                            ((jj) this).field_n[var12] = 0;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        if (-1 <= (((jj) this).field_i[var12] ^ -1)) {
                          L14: {
                            ((jj) this).field_i[var12] = 0;
                            ((jj) this).field_n[var12] = 0;
                            if (((jj) this).field_p[var12] == null) {
                              break L14;
                            } else {
                              ((jj) this).field_k[var12].b(21404);
                              break L14;
                            }
                          }
                          ((jj) this).field_p[var12] = null;
                          var12++;
                          continue L2;
                        } else {
                          var12++;
                          continue L2;
                        }
                      } else {
                        var12++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if (((jj) this).field_p[var6_int] != null) {
                    var5++;
                    var6_int++;
                    continue L1;
                  } else {
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              ((jj) this).a(param2);
              return;
            }
          } else {
            if (((jj) this).field_l[var5] != 0) {
              var4 = 0;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final lq b() {
        return null;
    }

    final void a(boolean param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        L0: {
          if (-1 < (param4 ^ -1)) {
            break L0;
          } else {
            if (((jj) this).field_o <= param4) {
              break L0;
            } else {
              L1: {
                if (null != ((jj) this).field_p[param4]) {
                  ((jj) this).field_k[param4].b(21404);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((jj) this).field_p[param4] = param2;
                if (param2 != null) {
                  ((jj) this).field_n[param4] = param5;
                  ((jj) this).field_k[param4].d(-1, -1, param6);
                  ((jj) this).field_k[param4].a(param0, 19134, param2);
                  ((jj) this).field_k[param4].c(param1, 107342216);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param3 == -9017) {
                  break L3;
                } else {
                  field_m = null;
                  break L3;
                }
              }
              return;
            }
          }
        }
        throw new IllegalArgumentException("Illegal midiplayer: " + param4);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        for (var4 = param0; ((jj) this).field_k.length > var4; var4++) {
            ((jj) this).field_k[var4].b(param2, param1, (byte) -73);
        }
    }

    final static byte[] a(int param0, byte[] param1, byte param2, int param3) {
        byte[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        m var6 = null;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        L0: {
          var8 = Kickabout.field_G;
          var5 = 34 / ((param2 - -65) / 52);
          if (param3 <= 0) {
            var4 = param1;
            break L0;
          } else {
            var9 = new byte[param0];
            var4 = var9;
            var6_int = 0;
            L1: while (true) {
              if (param0 <= var6_int) {
                break L0;
              } else {
                var9[var6_int] = param1[param3 + var6_int];
                var6_int++;
                continue L1;
              }
            }
          }
        }
        var6 = new m();
        var6.a(true);
        var6.a((byte) 126, (long)(param0 * 8), var4);
        var7 = new byte[64];
        var6.a(var7, 21024, 0);
        return var7;
    }

    final void a(int param0) {
        int var2_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var4 = Kickabout.field_G;
        var2_int = 0;
        L0: while (true) {
          if (((jj) this).field_k.length <= var2_int) {
            var10 = new int[((jj) this).field_o];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var5 = var7;
            var2 = var5;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var10.length) {
                var6 = 0;
                var3 = var6;
                L2: while (true) {
                  if (((jj) this).field_n.length <= var6) {
                    return;
                  } else {
                    if (0 != ((jj) this).field_n[var6]) {
                      L3: {
                        ((jj) this).field_i[var6] = ((jj) this).field_i[var6] + param0 * ((jj) this).field_n[var6];
                        if ((((jj) this).field_i[var6] ^ -1) <= -1048577) {
                          ((jj) this).field_i[var6] = 1048576;
                          ((jj) this).field_n[var6] = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (((jj) this).field_i[var6] <= 0) {
                        L4: {
                          ((jj) this).field_i[var6] = 0;
                          ((jj) this).field_n[var6] = 0;
                          if (((jj) this).field_p[var6] == null) {
                            break L4;
                          } else {
                            ((jj) this).field_k[var6].b(21404);
                            break L4;
                          }
                        }
                        ((jj) this).field_p[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                var5[var3] = (((jj) this).field_i[var3] >> 24392780) * ((jj) this).field_l[var3] / 256;
                var3++;
                continue L1;
              }
            }
          } else {
            if (null != ((jj) this).field_p[var2_int]) {
              ((jj) this).field_k[var2_int].a(param0);
              var2_int++;
              continue L0;
            } else {
              var2_int++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        if (param0 > -77) {
            field_m = null;
        }
    }

    final lq c() {
        return null;
    }

    jj(int param0) {
        int var2 = 0;
        ((jj) this).field_o = 3;
        ((jj) this).field_o = param0;
        ((jj) this).field_l = new int[param0];
        for (var2 = 0; var2 < ((jj) this).field_l.length; var2++) {
            ((jj) this).field_l[var2] = 256;
        }
        ((jj) this).field_i = new int[((jj) this).field_o];
        ((jj) this).field_j = new int[((jj) this).field_o][];
        ((jj) this).field_k = new ru[((jj) this).field_o];
        ((jj) this).field_n = new int[((jj) this).field_o];
        ((jj) this).field_p = new qm[((jj) this).field_o];
        int var4 = 0;
        var2 = var4;
        while (var4 < ((jj) this).field_k.length) {
            if (var4 == 0) {
                ((jj) this).field_k[var4] = new ru();
            } else {
                ((jj) this).field_k[var4] = new ru(((jj) this).field_k[-1 + var4]);
            }
            ((jj) this).field_i[var4] = 1048576;
            var4++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "<%0> has left the lobby.";
    }
}
