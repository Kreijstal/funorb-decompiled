/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends ph {
    private df field_O;
    int field_G;
    static int field_N;
    static vi field_M;
    static int[] field_K;
    int field_H;
    static bd field_I;
    static bd field_L;
    private int field_J;
    static int field_P;

    final int a(byte param0) {
        if (param0 != 65) {
            return 117;
        }
        return ((tb) this).field_O.b(-25);
    }

    final int j(int param0) {
        if (param0 != 11884) {
            field_I = null;
            return ((tb) this).field_J;
        }
        return ((tb) this).field_J;
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (param1 == -24224) {
          if (param0 != null) {
            var3 = param0.length();
            if (1 <= var3) {
              if ((var3 ^ -1) >= -13) {
                var4 = mf.a(false, param0);
                if (var4 == null) {
                  return hm.field_n;
                } else {
                  if ((var4.length() ^ -1) <= -2) {
                    L0: {
                      if (rg.a((byte) -109, var4.charAt(0))) {
                        break L0;
                      } else {
                        if (rg.a((byte) -109, var4.charAt(-1 + var4.length()))) {
                          break L0;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param0.length() <= var6) {
                              if (var5 > 0) {
                                return ui.field_g;
                              } else {
                                return null;
                              }
                            } else {
                              L2: {
                                var7 = param0.charAt(var6);
                                if (!rg.a((byte) -109, (char) var7)) {
                                  var5 = 0;
                                  break L2;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                              if (-3 < (var5 ^ -1)) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param2) {
                                  return mm.field_k;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return ui.field_g;
                  } else {
                    return hm.field_n;
                  }
                }
              } else {
                return hm.field_n;
              }
            } else {
              return hm.field_n;
            }
          } else {
            return hm.field_n;
          }
        } else {
          return null;
        }
    }

    private tb() throws Throwable {
        throw new Error();
    }

    final static void f(byte param0) {
        if (null != wa.field_q) {
          v.a(8, (java.awt.Canvas) (Object) wa.field_q);
          wa.field_q.a(true, gf.field_b);
          if (param0 >= -84) {
            L0: {
              tb.e((byte) -36);
              wa.field_q = null;
              if (ie.field_c != null) {
                ie.field_c.c(73);
                break L0;
              } else {
                break L0;
              }
            }
            se.field_h.requestFocus();
            return;
          } else {
            L1: {
              wa.field_q = null;
              if (ie.field_c != null) {
                ie.field_c.c(73);
                break L1;
              } else {
                break L1;
              }
            }
            se.field_h.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        field_K = null;
        field_I = null;
        field_L = null;
        field_M = null;
        if (param0 <= 47) {
            field_L = null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -((tb) this).field_G + (-param1 + param0);
            var9 = ((tb) this).field_s + -(((tb) this).field_G * 2);
            if (var9 < var8) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 <= var8) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          var8 = var8 * ((tb) this).field_J / var9;
          if ((param6 ^ -1) != -2) {
            if ((param6 ^ -1) == -3) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((tb) this).field_O.b(-25) <= var12) {
                  if ((var11 ^ -1) > -1) {
                    return true;
                  } else {
                    ((tb) this).field_O.a(var11, (byte) 35);
                    return true;
                  }
                } else {
                  var13 = ((tb) this).field_O.a(var12, -2262) - var8;
                  var13 = var13 * var13;
                  if (var10 > var13) {
                    var11 = var12;
                    var10 = var13;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((tb) this).field_O.b(true, var8);
            return true;
          }
        } else {
          return false;
        }
    }

    final int a(int param0, int param1) {
        if (0 <= param0) {
          if (((tb) this).field_O.b(param1 + 24559) > param0) {
            if (param1 != -24584) {
              field_L = null;
              return ((tb) this).field_O.a(param0, param1 ^ 26834);
            } else {
              return ((tb) this).field_O.a(param0, param1 ^ 26834);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 0;
        field_K = new int[8192];
    }
}
