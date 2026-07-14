/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static boolean[] field_d;
    static volatile int field_e;
    static ld[] field_a;
    static sf field_c;
    static he[] field_b;

    final static void a(int param0, int param1, int param2, vk param3) {
        if (param0 != -27610) {
            return;
        }
        if (param3 == null) {
            return;
        }
        od.a(-1630758008, ag.a(param3, 100, param1, param2));
    }

    final static java.net.URL a(String param0, int param1, java.net.URL param2, int param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_41_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_40_0 = null;
            var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var5 = param2.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (-1 >= (var7_int ^ -1)) {
                    if (param1 >= 0) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                  break L2;
                } else {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int >= 0) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L3;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 <= var7_int) {
                    if (param0 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 + 1);
                if (0 <= var7_int) {
                  if (param4 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if ((param1 ^ -1) < param3) {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param1));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param0 == null) {
                  break L7;
                } else {
                  if ((param0.length() ^ -1) >= -1) {
                    break L7;
                  } else {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param0);
                    break L7;
                  }
                }
              }
              L8: {
                if (param4 == null) {
                  break L8;
                } else {
                  if ((param4.length() ^ -1) < -1) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param4);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (var5.length() > var6) {
                  StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                } else {
                  StringBuilder discarded$17 = var7.append(47);
                  break L9;
                }
              }
              try {
                stackOut_40_0 = new java.net.URL(param2, var7.toString());
                stackIn_41_0 = stackOut_40_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_41_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte[] param0, byte param1, int param2) {
        if (param1 < 120) {
            return 87;
        }
        return ml.a(param0, 0, param2, false);
    }

    final static boolean a(boolean param0, int[] param1) {
        long var2 = 0L;
        wk var4_ref_wk = null;
        int var4 = 0;
        int var5_int = 0;
        wk var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (tl.field_O != ik.field_d) {
          return false;
        } else {
          L0: {
            var2 = la.a(param0);
            if (-1 == lc.field_v) {
              break L0;
            } else {
              if (-1 <= dj.field_N) {
                break L0;
              } else {
                var4_ref_wk = (wk) (Object) og.field_f.h(-11151);
                if (var4_ref_wk == null) {
                  break L0;
                } else {
                  if ((var4_ref_wk.field_k ^ -1L) > (var2 ^ -1L)) {
                    var4_ref_wk.a(-16175);
                    gf.field_C = var4_ref_wk.field_j.length;
                    dh.field_N.field_j = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (var5_int >= gf.field_C) {
                        l.field_q = gg.field_l;
                        gg.field_l = ek.field_h;
                        ek.field_h = t.field_b;
                        t.field_b = var4_ref_wk.field_n;
                        return true;
                      } else {
                        dh.field_N.field_h[var5_int] = var4_ref_wk.field_j[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          L2: while (true) {
            L3: {
              if (-1 < (dj.field_N ^ -1)) {
                dh.field_N.field_j = 0;
                if (!jd.a(1, 5929)) {
                  return false;
                } else {
                  dj.field_N = dh.field_N.e((byte) 121);
                  dh.field_N.field_j = 0;
                  gf.field_C = param1[dj.field_N];
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (!li.d(-29427)) {
              return false;
            } else {
              if (lc.field_v == 0) {
                l.field_q = gg.field_l;
                gg.field_l = ek.field_h;
                ek.field_h = t.field_b;
                t.field_b = dj.field_N;
                dj.field_N = -1;
                return true;
              } else {
                L4: {
                  var4 = lc.field_v;
                  if (0.0 != cm.field_G) {
                    var4 = (int)((double)var4 + cm.field_M.nextGaussian() * cm.field_G);
                    if (-1 < (var4 ^ -1)) {
                      var4 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                var5 = new wk((long)var4 + var2, dj.field_N, new byte[gf.field_C]);
                var6 = 0;
                L5: while (true) {
                  if (var6 >= gf.field_C) {
                    og.field_f.a((gi) (Object) var5, 255);
                    dj.field_N = -1;
                    continue L2;
                  } else {
                    var5.field_j[var6] = dh.field_N.field_h[var6];
                    var6++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) ji.field_c;
                    // monitorenter ji.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (vb.field_l != rc.field_g) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var2 = 96 / ((param0 - -57) / 37);
                        di.field_c = ac.field_f[rc.field_g];
                        sj.field_g = na.field_a[rc.field_g];
                        rc.field_g = rc.field_g + 1 & 127;
                        // monitorexit var1_ref
                        stackOut_4_0 = 1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 111) {
            field_a = null;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_d = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false, false, false, false, false, true, true, true, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        field_a = new ld[13];
        field_b = new he[1];
    }
}
