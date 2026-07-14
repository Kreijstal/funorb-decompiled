/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hda extends k {
    private int field_k;
    static int field_o;
    private int[] field_p;
    private int field_m;
    private int[] field_q;
    static String field_l;
    private int field_n;

    final static void a(byte param0, boolean param1) {
        if (param0 != -91) {
            hda.a((byte) 27, true);
        }
        if (null != jja.field_m) {
            gp.b(-25942, jja.field_m);
        }
        if (!(ms.field_u == null)) {
            ms.field_u.a((byte) -120, param1);
        }
        bga.a(param0 ^ 10043, param1);
        if (!(null == wt.field_n)) {
            wt.field_n.a(param1, 7802);
        }
        vja.a((byte) 88, param1);
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 == -71) {
            break L0;
          } else {
            hda.e(36);
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (var4 != 0) {
            if (-2 == (var4 ^ -1)) {
              ((hda) this).field_n = param1.e((byte) 119);
              break L1;
            } else {
              if (var4 == 2) {
                ((hda) this).field_m = param1.b(16711935);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            ((hda) this).field_k = param1.b(16711935);
            break L1;
          }
        }
    }

    public static void e(int param0) {
        int var1 = 7 % ((param0 - 52) / 62);
        field_l = null;
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = BachelorFridge.field_y;
          var15 = ((hda) this).field_j.a(param0, -1);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!((hda) this).field_j.field_m) {
            break L0;
          } else {
            var4 = tj.field_f[param0];
            if (0 == ((hda) this).field_m) {
              var5 = 0;
              var6 = 0;
              L1: while (true) {
                L2: {
                  if (var6 >= ((hda) this).field_k) {
                    break L2;
                  } else {
                    if (var4 >= ((hda) this).field_q[var6]) {
                      if (((hda) this).field_q[1 + var6] > var4) {
                        if (((hda) this).field_p[var6] <= var4) {
                          break L2;
                        } else {
                          var5 = 4096;
                          break L2;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
                bl.a(var15, 0, hh.field_d, var5);
                break L0;
              }
            } else {
              var5 = 0;
              L3: while (true) {
                if (var5 >= hh.field_d) {
                  break L0;
                } else {
                  L4: {
                    var6 = 0;
                    var7 = 0;
                    var8 = jq.field_k[var5];
                    var9 = ((hda) this).field_m;
                    if ((var9 ^ -1) != -2) {
                      if (2 != var9) {
                        if (var9 == 3) {
                          var6 = (var8 - var4 >> -1399522719) + 2048;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        var6 = (var8 - (-var4 + 4096) >> 46126977) + 2048;
                        break L4;
                      }
                    } else {
                      var6 = var8;
                      break L4;
                    }
                  }
                  var11 = 0;
                  var9 = var11;
                  L5: while (true) {
                    L6: {
                      if (var11 >= ((hda) this).field_k) {
                        break L6;
                      } else {
                        if (((hda) this).field_q[var11] <= var6) {
                          if (var6 < ((hda) this).field_q[1 + var11]) {
                            if (((hda) this).field_p[var11] > var6) {
                              var7 = 4096;
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            var11++;
                            continue L5;
                          }
                        } else {
                          var11++;
                          continue L5;
                        }
                      }
                    }
                    var15 = var14;
                    var15[var5] = var7;
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        L7: {
          if (param1 == 0) {
            break L7;
          } else {
            int[] discarded$1 = ((hda) this).a(-64, -61);
            break L7;
          }
        }
        return var3;
    }

    public hda() {
        super(0, true);
        ((hda) this).field_k = 10;
        ((hda) this).field_n = 2048;
        ((hda) this).field_m = 0;
    }

    private final void d(int param0) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        ((hda) this).field_q = new int[((hda) this).field_k + 1];
        int var2 = 0;
        ((hda) this).field_p = new int[((hda) this).field_k - -1];
        int var3 = 4096 / ((hda) this).field_k;
        if (param0 != 2048) {
            return;
        }
        int var4 = var3 * ((hda) this).field_n >> 517509420;
        for (var5 = 0; var5 < ((hda) this).field_k; var5++) {
            ((hda) this).field_q[var5] = var2;
            ((hda) this).field_p[var5] = var4 + var2;
            var2 = var2 + var3;
        }
        ((hda) this).field_q[((hda) this).field_k] = 4096;
        ((hda) this).field_p[((hda) this).field_k] = ((hda) this).field_p[0] + 4096;
    }

    final static void a(int param0, kia param1, boolean param2, int param3) {
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_l = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (kw.field_j != null) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    uka.a(1048576, param1, param3, param2, (byte) -112);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (null != uf.field_c) {
                        statePc = 7;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4 = (Object) (Object) lc.field_l;
                    // monitorenter lc.field_l
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        uf.field_c.a(-1, param3, (byte) -107);
                        if (param1 != uw.field_o) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var4
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        uf.field_c.b(true);
                        lc.field_l.c();
                        uw.field_o = param1;
                        if (uw.field_o == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        uf.field_c.a(uw.field_o, (byte) -115, param2);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        // monitorexit var4
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var5;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(byte param0) {
        if (param0 != -68) {
            return;
        }
        this.d(2048);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = -1;
    }
}
