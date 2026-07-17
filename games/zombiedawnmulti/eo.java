/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static String field_b;
    static String field_c;
    static String[] field_e;
    static volatile long field_d;
    static String field_a;

    final static boolean a(int param0, boolean param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null == ej.field_n) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (sj.field_p != 9) {
          if (sj.field_p == 10) {
            if (var3 != 0) {
              return false;
            } else {
              q.a(13151);
              return true;
            }
          } else {
            if (11 != sj.field_p) {
              return false;
            } else {
              if (vh.field_Hb) {
                if (fh.field_n == 2) {
                  int discarded$10 = 2;
                  if (!pd.a(da.field_c, v.field_a)) {
                    return false;
                  } else {
                    if (fh.field_n == 2) {
                      L1: {
                        int discarded$11 = 88;
                        if (ob.d()) {
                          var4 = null;
                          kb.a(mi.field_Gb, v.field_a, 15, (String) null, fh.field_n, 29602);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      return true;
                    } else {
                      if (var3 != 0) {
                        return false;
                      } else {
                        L2: {
                          int discarded$12 = 88;
                          if (ob.d()) {
                            var4 = null;
                            kb.a(mi.field_Gb, v.field_a, 15, (String) null, fh.field_n, 29602);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        return true;
                      }
                    }
                  }
                } else {
                  if (fh.field_n == 2) {
                    L3: {
                      int discarded$13 = 88;
                      if (ob.d()) {
                        var4 = null;
                        kb.a(mi.field_Gb, v.field_a, 15, (String) null, fh.field_n, 29602);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return true;
                  } else {
                    if (var3 != 0) {
                      return false;
                    } else {
                      L4: {
                        int discarded$14 = 88;
                        if (ob.d()) {
                          var4 = null;
                          kb.a(mi.field_Gb, v.field_a, 15, (String) null, fh.field_n, 29602);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return true;
                    }
                  }
                }
              } else {
                return false;
              }
            }
          }
        } else {
          if (tn.a(bq.field_f, ld.field_Kb, (byte) -81, en.field_c, tb.field_t)) {
            if (en.field_c == 2) {
              return na.a(tb.field_t, (byte) -46, bq.field_f, ld.field_Kb, en.field_c);
            } else {
              if (var3 != 0) {
                return false;
              } else {
                return na.a(tb.field_t, (byte) -46, bq.field_f, ld.field_Kb, en.field_c);
              }
            }
          } else {
            if (sj.field_p == 10) {
              if (var3 != 0) {
                return false;
              } else {
                q.a(13151);
                return true;
              }
            } else {
              if (11 == sj.field_p) {
                if (vh.field_Hb) {
                  if (fh.field_n == 2) {
                    int discarded$15 = 2;
                    if (pd.a(da.field_c, v.field_a)) {
                      if (fh.field_n == 2) {
                        L5: {
                          int discarded$16 = 88;
                          if (ob.d()) {
                            var4 = null;
                            kb.a(mi.field_Gb, v.field_a, 15, (String) null, fh.field_n, 29602);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        return true;
                      } else {
                        if (var3 != 0) {
                          return false;
                        } else {
                          L6: {
                            int discarded$17 = 88;
                            if (ob.d()) {
                              var4 = null;
                              kb.a(mi.field_Gb, v.field_a, 15, (String) null, fh.field_n, 29602);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          return true;
                        }
                      }
                    } else {
                      return false;
                    }
                  } else {
                    if (fh.field_n == 2) {
                      L7: {
                        int discarded$18 = 88;
                        if (ob.d()) {
                          var4 = null;
                          kb.a(mi.field_Gb, v.field_a, 15, (String) null, fh.field_n, 29602);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      return true;
                    } else {
                      if (var3 != 0) {
                        return false;
                      } else {
                        L8: {
                          int discarded$19 = 88;
                          if (ob.d()) {
                            var4 = null;
                            kb.a(mi.field_Gb, v.field_a, 15, (String) null, fh.field_n, 29602);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        return true;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) um.field_c);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) um.field_c);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "eo.C(" + (param0 != null ? "{...}" : "null") + 44 + 11 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        rp.field_l.a(param6, param2, param5, param4, -3344);
        if (mj.field_Ib == null) {
          if (param3 != -10) {
            eo.a(114, -96, -86, -58, 125, -101, 21);
            return;
          } else {
            return;
          }
        } else {
          mj.field_Ib.a(-ti.field_Y + param0, param6, param3 ^ 77, param1, param0, param6);
          if (param3 == -10) {
            return;
          } else {
            eo.a(114, -96, -86, -58, 125, -101, 21);
            return;
          }
        }
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        int var1 = 24;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Open new routes for your zombies to attack from.";
        field_a = "Month";
        field_d = 0L;
    }
}
