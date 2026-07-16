/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sl {
    static aa field_e;
    int field_h;
    private int field_k;
    int[][] field_i;
    int[][] field_d;
    byte[][] field_o;
    static int field_n;
    int field_l;
    static int field_j;
    private boolean field_g;
    private int field_c;
    int field_f;
    private int field_m;
    int field_b;
    int field_a;

    final void a(boolean param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = TrackController.field_F ? 1 : 0;
          if (param2) {
            break L0;
          } else {
            ((sl) this).field_f = -91;
            break L0;
          }
        }
        ((sl) this).field_m = ((sl) this).field_h / 5 % ri.field_H.length;
        var4 = ((sl) this).field_f;
        var5 = 0;
        L1: while (true) {
          if (((sl) this).field_o.length <= var5) {
            ((sl) this).a(467, (byte) -117, 229 + param1);
            return;
          } else {
            var6 = ((sl) this).field_a;
            var7 = 0;
            L2: while (true) {
              if (var7 >= ((sl) this).field_o[0].length) {
                var4 += 26;
                var5++;
                continue L1;
              } else {
                L3: {
                  ((sl) this).a(var6, var4, 0, (int) ((sl) this).field_o[var5][var7]);
                  var8 = -65 & ((sl) this).field_d[var5][var7];
                  if ((var8 ^ -1) > -8) {
                    break L3;
                  } else {
                    if (var8 >= 38) {
                      break L3;
                    } else {
                      ii.field_r[var8].e(var6, var4);
                      if ((((sl) this).field_d[var5][var7] & 64) != 0) {
                        ue.a(var6, var8, (byte) 91, var4);
                        var6 += 26;
                        var7++;
                        continue L2;
                      } else {
                        var6 += 26;
                        var7++;
                        continue L2;
                      }
                    }
                  }
                }
                if ((var8 ^ -1) == -39) {
                  L4: {
                    if (!param0) {
                      break L4;
                    } else {
                      if ((((sl) this).field_h % 30 ^ -1) <= -16) {
                        break L4;
                      } else {
                        ii.field_r[50].e(var6, var4);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var9 = ((sl) this).field_b / 3 % 4;
                    if (!ui.a(0, param2)) {
                      break L5;
                    } else {
                      if (-1 != (((sl) this).field_b ^ -1)) {
                        da.field_p[32 + ((sl) this).field_l][var9].e(var6, var4);
                        var6 += 26;
                        var7++;
                        continue L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  da.field_p[((sl) this).field_l][var9].e(var6, var4);
                  var6 += 26;
                  var7++;
                  continue L2;
                } else {
                  var6 += 26;
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(int[][] param0, byte param1, int[][] param2, byte[][] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TrackController.field_F ? 1 : 0;
          if (param3.length == 0) {
            ((sl) this).field_o = new byte[0][0];
            break L0;
          } else {
            ((sl) this).field_o = new byte[param3.length][param3[0].length];
            break L0;
          }
        }
        L1: {
          if (param1 == 50) {
            break L1;
          } else {
            ((sl) this).a(-69, 10, -15, -70);
            break L1;
          }
        }
        L2: {
          if (-1 != (param0.length ^ -1)) {
            ((sl) this).field_d = new int[param0.length][param0[0].length];
            break L2;
          } else {
            ((sl) this).field_d = new int[0][0];
            break L2;
          }
        }
        var5 = 0;
        L3: while (true) {
          if (var5 >= param3.length) {
            ((sl) this).field_i = new int[param2.length][param2[0].length];
            var5 = 0;
            L4: while (true) {
              if (var5 >= param2.length) {
                L5: {
                  if (((sl) this).field_g) {
                    var5 = 6;
                    var6 = 0;
                    var7 = 8;
                    var8 = 0;
                    var9 = 0;
                    L6: while (true) {
                      if (8 <= var9) {
                        ((sl) this).field_k = (5 - var6 - var5) * 13;
                        ((sl) this).field_c = (7 - var8 - var7) * 13;
                        break L5;
                      } else {
                        var10 = 0;
                        L7: while (true) {
                          if (-7 >= (var10 ^ -1)) {
                            var9++;
                            continue L6;
                          } else {
                            if (0 != param2[var9][var10]) {
                              var5 = Math.min(var5, var10);
                              var6 = Math.max(var6, var10);
                              var7 = Math.min(var7, var9);
                              var8 = Math.max(var8, var9);
                              var10++;
                              continue L7;
                            } else {
                              var10++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                return;
              } else {
                pd.a(param2[var5], 0, ((sl) this).field_i[var5], 0, param2[0].length);
                var5++;
                continue L4;
              }
            }
          } else {
            pd.a(param3[var5], 0, ((sl) this).field_o[var5], 0, param3[var5].length);
            pd.a(param0[var5], 0, ((sl) this).field_d[var5], 0, param0[var5].length);
            var5++;
            continue L3;
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 107) {
            Object var2 = null;
            nl discarded$0 = sl.a((Throwable) null, (String) null);
        }
    }

    void a(ea param0, int param1) {
        ((sl) this).a(param0.field_d, (byte) 50, param0.field_i, param0.field_o);
        if (param1 <= 36) {
            ((sl) this).field_f = 43;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          var5 = param3;
          if (-1 == (var5 ^ -1)) {
            break L0;
          } else {
            L1: {
              if (var5 == 1) {
                break L1;
              } else {
                if ((var5 ^ -1) == -3) {
                  break L1;
                } else {
                  if (4 != var5) {
                    if ((var5 ^ -1) != -4) {
                      if ((var5 ^ -1) != -7) {
                        if ((var5 ^ -1) == -6) {
                          ii.field_r[ki.field_c[((sl) this).field_m]].e(param0, param1);
                          break L0;
                        } else {
                          break L0;
                        }
                      } else {
                        ii.field_r[ki.field_c[((sl) this).field_m]].f(param0, param1);
                        break L0;
                      }
                    } else {
                      ii.field_r[ri.field_H[((sl) this).field_m]].e(param0, param1);
                      break L0;
                    }
                  } else {
                    ii.field_r[ri.field_H[((sl) this).field_m]].g(param0, param1);
                    break L0;
                  }
                }
              }
            }
            ii.field_r[param3].e(param0, param1);
            break L0;
          }
        }
        L2: {
          if (param2 == 0) {
            break L2;
          } else {
            ((sl) this).a(false, 1);
            break L2;
          }
        }
    }

    void a(boolean param0, int param1) {
        if (param1 < 72) {
            return;
        }
        ((sl) this).field_h = ((sl) this).field_h + 1;
    }

    final static th a(int param0, int param1) {
        th var2 = new th();
        if (param1 > -89) {
            return null;
        }
        fh.field_b.a((byte) -122, (fc) (Object) var2);
        nk.a(param0, -108);
        return var2;
    }

    final static void b(byte param0) {
        if (param0 != -51) {
            field_n = -45;
        }
    }

    final static nl a(Throwable param0, String param1) {
        nl var2 = null;
        if (!(param0 instanceof nl)) {
            var2 = new nl(param0, param1);
        } else {
            var2 = (nl) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        }
        return var2;
    }

    final void a(int param0, byte param1, int param2) {
        qj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qj var11 = null;
        var10 = TrackController.field_F ? 1 : 0;
        var11 = nd.field_L[4];
        var4 = var11;
        cl.a(nd.field_L, -10 + param0, 228, param2 - 10, 176, 4);
        if (param1 <= 0) {
          nd.field_L[4] = var11;
          ll.a(nd.field_F);
          ll.b(param0, param2, param0 + 156, param2 + 208);
          cl.a(nd.field_L, param0 - 10, 228, -10 + param2, 176, 4);
          var5 = ((sl) this).field_c + param2;
          var6 = 0;
          L0: while (true) {
            if (8 <= var6) {
              ll.b(nd.field_F);
              return;
            } else {
              var7 = param0 + ((sl) this).field_k;
              var8 = 0;
              L1: while (true) {
                if (-7 >= (var8 ^ -1)) {
                  var5 += 26;
                  var6++;
                  continue L0;
                } else {
                  var9 = ((sl) this).field_i[var6][var8];
                  if (var9 >= 7) {
                    if (var9 < 38) {
                      ii.field_r[var9].e(var7, var5);
                      var7 += 26;
                      var8++;
                      continue L1;
                    } else {
                      var7 += 26;
                      var8++;
                      continue L1;
                    }
                  } else {
                    var7 += 26;
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    sl(boolean param0, int param1, int param2) {
        ((sl) this).field_c = 0;
        ((sl) this).field_f = param2;
        ((sl) this).field_k = 0;
        ((sl) this).field_g = param0 ? true : false;
        ((sl) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new aa(8, 0, 4, 1);
    }
}
