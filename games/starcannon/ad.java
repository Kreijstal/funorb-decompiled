/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends kf {
    static int[] field_D;
    private String field_A;
    static int field_y;
    private qe field_F;
    private boolean field_E;
    private int field_B;
    static hl[] field_z;
    static ta field_C;
    private int field_w;
    private int field_x;

    ad(int param0, int param1, int param2, int param3, uj param4, boolean param5, int param6, int param7, qe param8, int param9, String param10) {
        super(param0, param1, param2, param3, (de) null, (qg) null);
        ((ad) this).field_E = param5 ? true : false;
        ((ad) this).field_w = param6;
        ((ad) this).field_x = param9;
        ((ad) this).field_A = param10;
        ((ad) this).field_B = param7;
        ((ad) this).field_F = param8;
        ((ad) this).field_t = param4;
        int var12 = ((ad) this).field_w + -((ad) this).field_B;
        int var13 = ((ad) this).field_F.a(param10, var12, ((ad) this).field_F.field_p) - -(((ad) this).field_B * 2);
        if (var13 > param3) {
            ((ad) this).a(param0, param2, (byte) 119, var13, param1);
        } else {
            var13 = param3;
        }
        int var14 = !((ad) this).field_E ? ((ad) this).field_B * 2 + ((ad) this).field_w : 0;
        ((ad) this).field_t.a(var14, param2 - (((ad) this).field_w - -(((ad) this).field_B * 3)), (byte) 116, -(2 * ((ad) this).field_B) + param3, (-param3 + var13 >> -102011359) + ((ad) this).field_B);
    }

    public static void f(byte param0) {
        field_D = null;
        if (param0 > -88) {
            field_C = null;
        }
        field_C = null;
        field_z = null;
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) hj.field_c;
                    // monitorenter hj.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (wg.field_b == hc.field_b) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var1
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        var2 = -107 % ((11 - param0) / 48);
                        lb.field_B = pe.field_e[wg.field_b];
                        StarCannon.field_E = ik.field_s[wg.field_b];
                        wg.field_b = 127 & wg.field_b + 1;
                        // monitorexit var1
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 < 10) {
            field_y = -37;
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    final String d(int param0) {
        int var2 = ((ad) this).field_t.field_h ? 1 : 0;
        ((ad) this).field_t.field_h = ((ad) this).field_h;
        String var3 = ((ad) this).field_t.d(param0);
        ((ad) this).field_t.field_h = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param1 + ((ad) this).field_s;
        int var6 = ((ad) this).field_j + param3;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        int var7 = ((ad) this).field_E ? -((ad) this).field_w + ((ad) this).field_i - ((ad) this).field_B * 2 : 0;
        int discarded$0 = ((ad) this).field_F.a(((ad) this).field_A, var7 + (var5 - -((ad) this).field_B), var6 - -((ad) this).field_B, -((ad) this).field_B + ((ad) this).field_w, -(2 * ((ad) this).field_B) + ((ad) this).field_f, ((ad) this).field_x, -1, ((ad) this).field_E ? 0 : 2, 1, ((ad) this).field_F.field_p);
    }

    final static void a(int param0, int[] param1, boolean param2) {
        int var3 = 0;
        lk var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        var10 = StarCannon.field_A;
        jh.field_c[param0] = param1;
        var3 = 0;
        var4 = a.field_b;
        var5_ref_int__ = param1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= var5_ref_int__.length) {
            L1: {
              L2: {
                var5 = var3 - -20 >> -1993116383;
                bj.field_c[param0] = -var5 + 320;
                bi.field_c[param0] = 320 - -var5;
                qi.field_a[param0] = -(param1.length * 15) + 272;
                b.field_c[param0] = 30;
                if (4 == param0) {
                  break L2;
                } else {
                  if (param0 == 5) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              qi.field_a[param0] = 400;
              bj.field_c[param0] = 100;
              break L1;
            }
            L3: {
              if (param2) {
                break L3;
              } else {
                field_y = 17;
                break L3;
              }
            }
            L4: {
              if (param0 != 3) {
                break L4;
              } else {
                qi.field_a[param0] = 400;
                break L4;
              }
            }
            L5: {
              if (-3 != (param0 ^ -1)) {
                break L5;
              } else {
                if (!wk.a(54)) {
                  var6 = bj.field_c[param0];
                  bj.field_c[param0] = 120;
                  bi.field_c[param0] = bi.field_c[param0] + (bj.field_c[param0] - var6);
                  qi.field_a[param0] = 350;
                  b.field_c[param0] = b.field_c[param0] + 10;
                  break L5;
                } else {
                  qi.field_a[param0] = 360 - -b.field_c[param0];
                  bj.field_c[param0] = 120;
                  break L5;
                }
              }
            }
            return;
          } else {
            L6: {
              var7 = var5_ref_int__[var6];
              var8 = mj.field_c[var7];
              if (19 != var7) {
                if (var7 != 20) {
                  L7: {
                    if (var8 == null) {
                      var8_ref = "ERROR: missing text";
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-13 == (var7 ^ -1)) {
                      break L8;
                    } else {
                      if ((var7 ^ -1) != -14) {
                        var9 = var4.a(var8_ref);
                        if (var9 > var3) {
                          break L6;
                        } else {
                          var6++;
                          continue L0;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  var9 = ak.field_e - -64 + 9;
                  if (var3 < var9) {
                    break L6;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  L9: {
                    var9 = var4.a(ec.field_d);
                    if (var3 < var9) {
                      var3 = var9;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    var9 = var4.a(fd.field_d);
                    if (var3 < var9) {
                      var3 = var9;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var9 = var4.a(gh.field_A);
                  if (var3 < var9) {
                    break L6;
                  } else {
                    var6++;
                    continue L0;
                  }
                }
              } else {
                L11: {
                  var9 = var4.a(cf.field_k);
                  if (var9 > var3) {
                    var3 = var9;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var9 = var4.a(fl.field_g);
                  if (var3 >= var9) {
                    break L12;
                  } else {
                    var3 = var9;
                    break L12;
                  }
                }
                var9 = var4.a(hg.field_D);
                if (var9 > var3) {
                  break L6;
                } else {
                  var6++;
                  continue L0;
                }
              }
            }
            var3 = var9;
            var6++;
            continue L0;
          }
        }
    }

    final static sk a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        var2 = param1.length();
        if (var2 == 0) {
          return qb.field_b;
        } else {
          if ((var2 ^ -1) < -64) {
            return ai.field_a;
          } else {
            L0: {
              if (param0 < -67) {
                break L0;
              } else {
                boolean discarded$2 = ad.e((byte) 85);
                break L0;
              }
            }
            var3 = 0;
            L1: while (true) {
              if (var3 < var2) {
                var4 = param1.charAt(var3);
                if (45 != var4) {
                  if (0 == sg.field_o.indexOf(var4)) {
                    return ra.field_t;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  L2: {
                    if (var3 == -1) {
                      break L2;
                    } else {
                      if (-1 + var2 == var3) {
                        break L2;
                      } else {
                        var3++;
                        continue L1;
                      }
                    }
                  }
                  return ra.field_t;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[8192];
    }
}
