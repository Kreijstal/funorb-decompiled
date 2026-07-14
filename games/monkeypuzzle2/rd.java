/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends wj {
    static char field_p;
    static te field_o;
    private rj field_n;

    final static le[] a(String param0, ad param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != 0) {
          rd.c(false);
          var4 = param1.c(param3, (byte) -105);
          var5 = param1.a(param0, var4, -28459);
          return tj.a(var5, param1, var4, (byte) -126);
        } else {
          var4 = param1.c(param3, (byte) -105);
          var5 = param1.a(param0, var4, -28459);
          return tj.a(var5, param1, var4, (byte) -126);
        }
    }

    public static void e(int param0) {
        if (param0 != 10396) {
            field_p = 'ﾳ';
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static ai a(int param0, ad param1, int param2, int param3) {
        if (!wg.a(param2, param0, param1, -3)) {
            return null;
        }
        if (param3 != 1896) {
            return null;
        }
        return ee.k(15090);
    }

    rd(rj param0, rj param1) {
        super(param0);
        ((rd) this).field_n = param1;
    }

    final String a(int param0, String param1) {
        Object var4 = null;
        kf var5 = null;
        kf var6 = null;
        if (param0 == 1) {
          if (((rd) this).field_n instanceof ag) {
            var6 = ((ag) (Object) ((rd) this).field_n).a(-105);
            if (var6 != null) {
              if (var6.b(false) == wj.field_i) {
                if (param1.equals((Object) (Object) ((rd) this).field_n.field_s)) {
                  return var6.b((byte) 66);
                } else {
                  return ad.field_k;
                }
              } else {
                return var6.b((byte) 66);
              }
            } else {
              if (param1.equals((Object) (Object) ((rd) this).field_n.field_s)) {
                return null;
              } else {
                return ad.field_k;
              }
            }
          } else {
            if (param1.equals((Object) (Object) ((rd) this).field_n.field_s)) {
              return null;
            } else {
              return ad.field_k;
            }
          }
        } else {
          var4 = null;
          le[] discarded$1 = rd.a((String) null, (ad) null, 78, (String) null);
          if (((rd) this).field_n instanceof ag) {
            var5 = ((ag) (Object) ((rd) this).field_n).a(-105);
            if (var5 != null) {
              if (var5.b(false) == wj.field_i) {
                if (param1.equals((Object) (Object) ((rd) this).field_n.field_s)) {
                  return var5.b((byte) 66);
                } else {
                  return ad.field_k;
                }
              } else {
                return var5.b((byte) 66);
              }
            } else {
              if (param1.equals((Object) (Object) ((rd) this).field_n.field_s)) {
                return null;
              } else {
                return ad.field_k;
              }
            }
          } else {
            if (param1.equals((Object) (Object) ((rd) this).field_n.field_s)) {
              return null;
            } else {
              return ad.field_k;
            }
          }
        }
    }

    final static void c(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (we.field_n == null) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) we.field_n;
                    // monitorenter we.field_n
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        we.field_n = null;
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    if (!param0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = null;
                    le[] discarded$4 = rd.a((String) null, (ad) null, -96, (String) null);
                    statePc = 5;
                    continue stateLoop;
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
                    if (param0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var3 = null;
                    le[] discarded$5 = rd.a((String) null, (ad) null, -96, (String) null);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final na a(String param0, int param1) {
        kf var3 = null;
        na stackIn_5_0 = null;
        na stackIn_15_0 = null;
        na stackIn_22_0 = null;
        na stackOut_21_0 = null;
        na stackOut_20_0 = null;
        na stackOut_14_0 = null;
        na stackOut_13_0 = null;
        na stackOut_4_0 = null;
        na stackOut_3_0 = null;
        if (((rd) this).field_n instanceof ag) {
          var3 = ((ag) (Object) ((rd) this).field_n).a(81);
          if (var3 == null) {
            if (param1 != 3917) {
              return null;
            } else {
              L0: {
                if (!param0.equals((Object) (Object) ((rd) this).field_n.field_s)) {
                  stackOut_21_0 = ol.field_h;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  stackOut_20_0 = wj.field_i;
                  stackIn_22_0 = stackOut_20_0;
                  break L0;
                }
              }
              return stackIn_22_0;
            }
          } else {
            if (var3.b(false) == wj.field_i) {
              if (param1 != 3917) {
                return null;
              } else {
                L1: {
                  if (!param0.equals((Object) (Object) ((rd) this).field_n.field_s)) {
                    stackOut_14_0 = ol.field_h;
                    stackIn_15_0 = stackOut_14_0;
                    break L1;
                  } else {
                    stackOut_13_0 = wj.field_i;
                    stackIn_15_0 = stackOut_13_0;
                    break L1;
                  }
                }
                return stackIn_15_0;
              }
            } else {
              return ol.field_h;
            }
          }
        } else {
          if (param1 != 3917) {
            return null;
          } else {
            L2: {
              if (!param0.equals((Object) (Object) ((rd) this).field_n.field_s)) {
                stackOut_4_0 = ol.field_h;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = wj.field_i;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new te(0, 2, 2, 1);
    }
}
