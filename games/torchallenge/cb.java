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

    final static void a() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) te.field_b;
        synchronized (var1) {
          L0: {
            sj.field_L = sj.field_L + 1;
            wh.field_e = jc.field_h;
            kc.field_u = bj.field_c;
            ph.field_d = qb.field_g;
            ek.field_P = ua.field_c;
            ua.field_c = false;
            vb.field_n = e.field_o;
            ik.field_a = aa.field_a;
            ci.field_m = ll.field_g;
            e.field_o = 0;
            break L0;
          }
        }
    }

    public static void b() {
        field_c = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_d = null;
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
              if (lh.field_s <= 0) {
                break L2;
              } else {
                var4 = (Object) (Object) ea.field_g[lh.field_s];
                break L2;
              }
            }
            L3: {
              if (param2 > 87) {
                break L3;
              } else {
                field_f = null;
                break L3;
              }
            }
            L4: {
              if (var4 == null) {
                break L4;
              } else {
                int discarded$4 = 79;
                var5 = ue.a(((qe) var4).field_o, param3, ((qe) var4).field_H, param1);
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
                            if (var12.field_F == 4) {
                              L7: {
                                dg.a(var12.field_o, dg.field_T[var12.field_F], var12.field_V, 1, 25, var12.field_y, var12.field_H, param1, (byte) -72, param3);
                                if (nj.field_g != 0) {
                                  break L7;
                                } else {
                                  sd.a(121);
                                  break L7;
                                }
                              }
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        sd.a(122);
                        return;
                      } else {
                        sd.a(123);
                        return;
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
                          if (var11.field_F == 4) {
                            int discarded$5 = 25;
                            int discarded$6 = 1;
                            uc.a(var11.field_y, var11.field_o, var11.field_H, param1, 1, var11.field_V, param3, dg.field_T[var9.field_F]);
                            return;
                          } else {
                            break L8;
                          }
                        }
                      }
                      sd.a(122);
                      return;
                    } else {
                      sd.a(121);
                      return;
                    }
                  }
                } else {
                  sd.a(126);
                  return;
                }
              } else {
                L9: {
                  if (null == ea.field_g[var7]) {
                    var7++;
                    break L9;
                  } else {
                    var10 = ea.field_g[var7];
                    if (4 == var10.field_F) {
                      int discarded$7 = 79;
                      var6 = ue.a(var10.field_o, param3, var10.field_H, param1);
                      if (var6 < 0) {
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
                      var7++;
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
          var4 = (Object) (Object) decompiledCaughtException;
          throw oj.a((Throwable) var4, "cb.C(" + 25 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
        field_d = "Members";
        field_g = -1;
        field_a = "Waiting for sound effects";
        field_f = null;
    }
}
