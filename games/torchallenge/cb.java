/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static String field_d;
    static int[][] field_c;
    static int[] field_e;
    static int field_g;
    static boolean[][][] field_b;
    static String field_a;
    static ka field_f;

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = te.field_b;
        synchronized (var1) {
          L0: {
            L1: {
              sj.field_L = sj.field_L + 1;
              wh.field_e = jc.field_h;
              kc.field_u = bj.field_c;
              ph.field_d = qb.field_g;
              ek.field_P = ua.field_c;
              ua.field_c = false;
              vb.field_n = e.field_o;
              ik.field_a = aa.field_a;
              if (param0 == 30210) {
                break L1;
              } else {
                cb.a(71, 118, (byte) -25, 29);
                break L1;
              }
            }
            ci.field_m = ll.field_g;
            e.field_o = 0;
            break L0;
          }
        }
    }

    public static void b(int param0) {
        field_c = (int[][]) null;
        field_b = (boolean[][][]) null;
        field_e = null;
        if (param0 != -9386) {
          return;
        } else {
          field_f = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qe var9 = null;
        qe var10 = null;
        qe var11 = null;
        qe var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = null;
              var5 = -1;
              if (ea.field_g.length > lh.field_s) {
                break L1;
              } else {
                lh.field_s = -1;
                break L1;
              }
            }
            L2: {
              if ((lh.field_s ^ -1) >= -1) {
                break L2;
              } else {
                var4 = ea.field_g[lh.field_s];
                break L2;
              }
            }
            L3: {
              if (param2 > 87) {
                break L3;
              } else {
                field_f = (ka) null;
                break L3;
              }
            }
            L4: {
              if (var4 == null) {
                break L4;
              } else {
                var5 = ue.a(((qe) (var4)).field_o, param3, ((qe) (var4)).field_H, param1, (byte) 79);
                break L4;
              }
            }
            var7 = 0;
            L5: while (true) {
              if (ea.field_g.length <= var7) {
                if (lh.field_s >= 0) {
                  if (hc.field_Q) {
                    if (hc.field_Q) {
                      if (ea.field_g.length > lh.field_s) {
                        L6: {
                          var12 = ea.field_g[lh.field_s];
                          if (var12 == null) {
                            break L6;
                          } else {
                            if ((var12.field_F ^ -1) == -5) {
                              L7: {
                                dg.a(var12.field_o, dg.field_T[var12.field_F], var12.field_V, 1, param0, var12.field_y, var12.field_H, param1, (byte) -72, param3);
                                if (nj.field_g != 0) {
                                  break L7;
                                } else {
                                  sd.a(121);
                                  break L7;
                                }
                              }
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        sd.a(122);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        sd.a(123);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (ea.field_g.length > lh.field_s) {
                      L8: {
                        var9 = ea.field_g[lh.field_s];
                        var11 = var9;
                        if (var11 == null) {
                          break L8;
                        } else {
                          if ((var11.field_F ^ -1) == -5) {
                            uc.a(var11.field_y, var11.field_o, var11.field_H, param1, 1, var11.field_V, param3, dg.field_T[var9.field_F], true, param0);
                            return;
                          } else {
                            break L8;
                          }
                        }
                      }
                      sd.a(122);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      sd.a(121);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  sd.a(126);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L9: {
                  if (null == ea.field_g[var7]) {
                    break L9;
                  } else {
                    var10 = ea.field_g[var7];
                    if (4 == var10.field_F) {
                      var6 = ue.a(var10.field_o, param3, var10.field_H, param1, (byte) 79);
                      if (-1 < (var6 ^ -1)) {
                        break L9;
                      } else {
                        if (var5 <= var6) {
                          break L9;
                        } else {
                          if (0 < var5) {
                            var5 = var6;
                            lh.field_s = var10.field_y;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                var7++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) (var4), "cb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    static {
        field_b = new boolean[][][]{new boolean[][]{new boolean[]{false, true, true, true, true, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{true, true, true, true, true, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, true, true, true, true, false}, new boolean[]{false, true, true, true, true}, new boolean[]{true, true, true, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, true, true, true}, new boolean[]{false}}, new boolean[][]{new boolean[]{true, true, true, true, true, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{true, true, false, true, true, true}, new boolean[]{false}, new boolean[]{false, false, false, true, true, true}}};
        field_d = "Members";
        field_g = -1;
        field_a = "Waiting for sound effects";
        field_f = null;
    }
}
