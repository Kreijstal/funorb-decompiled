/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends am {
    static byte[][] field_t;
    private int field_s;
    private int field_w;
    private int field_u;
    static dq field_v;

    public lk() {
        super(1, false);
        ((lk) this).field_s = 4096;
        ((lk) this).field_w = 4096;
        ((lk) this).field_u = 4096;
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        if (param2 != null) {
          L0: {
            var3 = param2.length();
            if ((var3 ^ -1) > -2) {
              break L0;
            } else {
              if (var3 <= 12) {
                L1: {
                  var4 = hf.a(param2, 116);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (-2 >= (var4.length() ^ -1)) {
                      L2: {
                        if (ra.a(var4.charAt(0), 252)) {
                          break L2;
                        } else {
                          if (!ra.a(var4.charAt(var4.length() - 1), 252)) {
                            var5 = 0;
                            var6 = 0;
                            L3: while (true) {
                              if ((var6 ^ -1) <= (param2.length() ^ -1)) {
                                L4: {
                                  if (param1 > 16) {
                                    break L4;
                                  } else {
                                    field_v = null;
                                    break L4;
                                  }
                                }
                                if ((var5 ^ -1) < -1) {
                                  return cc.field_b;
                                } else {
                                  return null;
                                }
                              } else {
                                L5: {
                                  var7 = param2.charAt(var6);
                                  if (ra.a((char) var7, 252)) {
                                    var5++;
                                    break L5;
                                  } else {
                                    var5 = 0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (-3 < (var5 ^ -1)) {
                                    break L6;
                                  } else {
                                    if (param0) {
                                      break L6;
                                    } else {
                                      return am.field_q;
                                    }
                                  }
                                }
                                var6++;
                                continue L3;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      return cc.field_b;
                    } else {
                      break L1;
                    }
                  }
                }
                return ml.field_b;
              } else {
                break L0;
              }
            }
          }
          return ml.field_b;
        } else {
          return ml.field_b;
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[][] var23 = null;
        int[][] var28 = null;
        int[][] var32 = null;
        int[][] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        L0: {
          var15 = Torquing.field_u;
          var33 = ((lk) this).field_r.a(15142, param1);
          var28 = var33;
          var23 = var28;
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (param0 == -29116) {
            break L0;
          } else {
            lk.b(-110);
            break L0;
          }
        }
        L1: {
          if (!((lk) this).field_r.field_b) {
            break L1;
          } else {
            var32 = ((lk) this).c(24066, param1, 0);
            var34 = var32[0];
            var36 = var32[1];
            var35 = var32[2];
            var8 = var33[0];
            var9 = var33[1];
            var10 = var33[2];
            var11 = 0;
            L2: while (true) {
              if (ci.field_c <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var34[var11];
                  var13 = var35[var11];
                  var14 = var36[var11];
                  if (var12 != var13) {
                    break L3;
                  } else {
                    if (var14 == var13) {
                      var8[var11] = var12 * ((lk) this).field_s >> 231991564;
                      var9[var11] = var13 * ((lk) this).field_u >> -779194964;
                      var10[var11] = ((lk) this).field_w * var14 >> 1629208556;
                      var11++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var8[var11] = ((lk) this).field_s;
                var9[var11] = ((lk) this).field_u;
                var10[var11] = ((lk) this).field_w;
                var11++;
                continue L2;
              }
            }
          }
        }
        return var3;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            lk.b(60);
        }
        field_t = null;
        field_v = null;
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Torquing.field_u;
          var4 = param2;
          if ((var4 ^ -1) != -1) {
            if (1 != var4) {
              if (-3 != (var4 ^ -1)) {
                break L0;
              } else {
                ((lk) this).field_w = param0.i(param1 ^ 7059);
                break L0;
              }
            } else {
              ((lk) this).field_u = param0.i(7088);
              break L0;
            }
          } else {
            ((lk) this).field_s = param0.i(7088);
            break L0;
          }
        }
        L1: {
          if (param1 == 35) {
            break L1;
          } else {
            int discarded$1 = lk.a('ﾻ', -28);
            break L1;
          }
        }
    }

    final static int a(char param0, int param1) {
        if (param1 != 97) {
            return -54;
        }
        if (param0 >= 48) {
            if (57 >= param0) {
                return param0 - 48;
            }
        }
        if (param0 >= 97) {
            if (param0 <= 122) {
                return 10 - (97 + -param0);
            }
        }
        if (65 <= param0) {
            if (param0 <= 90) {
                return param0 + -65 + 36;
            }
        }
        return param0 != 43 ? 63 : 62;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new byte[50][];
    }
}
