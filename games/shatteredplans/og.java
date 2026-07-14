/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og implements iq {
    static int[] field_c;
    static bg field_b;
    static String field_a;

    final static uj a(int param0, mn param1, fs param2, dc param3, int param4) {
        if (param4 < -69) {
          if ((param0 ^ -1) == -3) {
            return (uj) (Object) new cj(param3, param2, param1);
          } else {
            if (4 != param0) {
              if (5 != param0) {
                if ((param0 ^ -1) != -7) {
                  if (param0 == 7) {
                    return (uj) (Object) new ma(param3, param2, param1);
                  } else {
                    L0: {
                      if (param0 == 0) {
                        break L0;
                      } else {
                        if (1 == param0) {
                          break L0;
                        } else {
                          return (uj) (Object) new ka(param3, param2, param1, param0);
                        }
                      }
                    }
                    return (uj) (Object) new j(param3, param2, param1, param0);
                  }
                } else {
                  return (uj) (Object) new hg(param3, param2, param1);
                }
              } else {
                return (uj) (Object) new rj(param3, param2, param1);
              }
            } else {
              return (uj) (Object) new sc(param3, param2, param1);
            }
          }
        } else {
          field_b = null;
          if ((param0 ^ -1) == -3) {
            return (uj) (Object) new cj(param3, param2, param1);
          } else {
            if (4 != param0) {
              if (5 != param0) {
                if ((param0 ^ -1) != -7) {
                  if (param0 == 7) {
                    return (uj) (Object) new ma(param3, param2, param1);
                  } else {
                    if (param0 != 0) {
                      if (1 == param0) {
                        return (uj) (Object) new j(param3, param2, param1, param0);
                      } else {
                        return (uj) (Object) new ka(param3, param2, param1, param0);
                      }
                    } else {
                      return (uj) (Object) new j(param3, param2, param1, param0);
                    }
                  }
                } else {
                  return (uj) (Object) new hg(param3, param2, param1);
                }
              } else {
                return (uj) (Object) new rj(param3, param2, param1);
              }
            } else {
              return (uj) (Object) new sc(param3, param2, param1);
            }
          }
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_b = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null == pd.field_j) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) pd.field_j;
                    // monitorenter pd.field_j
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        pd.field_j = null;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -1) {
            field_a = null;
        }
    }

    final static void a(int param0, boolean param1) {
        le.field_e.a(0, param0, (byte) -66);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        bi var8 = null;
        var6 = param0.field_m + param1;
        if (param4 == 12) {
          L0: {
            var7 = param3 + param0.field_q;
            rg.a((byte) -73, var7, param0.field_n, var6, param0.field_x);
            var8 = lp.field_w[1];
            if (!(param0 instanceof kg)) {
              break L0;
            } else {
              if (((kg) (Object) param0).field_z) {
                var8.c(1 + (var6 + (param0.field_x - var8.field_o >> -1620406015)), (-var8.field_p + param0.field_n >> 2074811361) + 1 + var7, 256);
                break L0;
              } else {
                if (!param0.f(param4 ^ 13)) {
                  return;
                } else {
                  dd.a(-4 + param0.field_n, 1, -4 + param0.field_x, var6 + 2, 2 + var7);
                  return;
                }
              }
            }
          }
          if (param0.f(param4 ^ 13)) {
            dd.a(-4 + param0.field_n, 1, -4 + param0.field_x, var6 + 2, 2 + var7);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, ln[] param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = -117 % ((param0 - -84) / 33);
        var5 = 0;
        if (param1.length > var5) {
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new bg("email");
        field_a = "Rules: Classic";
    }
}
