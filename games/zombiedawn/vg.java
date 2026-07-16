/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vg {
    static volatile int field_c;
    static int[][] field_a;
    oe[] field_b;

    final int a(int param0, int param1) {
        int var4 = 0;
        oe var5 = null;
        int var6 = ZombieDawn.field_J;
        int var3 = 24 / ((29 - param0) / 61);
        for (var4 = 0; var4 < ((vg) this).field_b.length; var4++) {
            var5 = ((vg) this).field_b[var4];
            if (param1 < var5.field_e.length) {
                return var4;
            }
            param1 = param1 - (-1 + var5.field_e.length);
        }
        return ((vg) this).field_b.length;
    }

    final int a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 98 % ((param0 - 46) / 56);
            if (null == ((vg) this).field_b) {
              break L1;
            } else {
              if (-1 <= (((vg) this).field_b.length ^ -1)) {
                break L1;
              } else {
                stackOut_2_0 = -((vg) this).field_b[0].field_b + ((vg) this).field_b[-1 + ((vg) this).field_b.length].field_g;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawn.field_J;
        var5 = 0;
        if (param3 > 15) {
          var6 = 0;
          var7 = param1.length();
          var8 = 0;
          L0: while (true) {
            if (var8 >= var7) {
              if (var5 <= 0) {
                return 0;
              } else {
                return (-param0 + param2 << -281590264) / var5;
              }
            } else {
              var9 = param1.charAt(var8);
              if (var9 != 60) {
                if (62 == var9) {
                  var6 = 0;
                  var8++;
                  continue L0;
                } else {
                  if (var6 == 0) {
                    if (var9 == 32) {
                      var5++;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              } else {
                var6 = 1;
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return 100;
        }
    }

    final int a(byte param0, int param1) {
        oe var5 = null;
        int var6 = ZombieDawn.field_J;
        oe[] var3 = ((vg) this).field_b;
        int var4 = 0;
        if (param0 != -72) {
            int discarded$0 = ((vg) this).a((byte) -52, 56);
        }
        while (var4 < var3.length) {
            var5 = var3[var4];
            if (param1 < var5.field_e.length) {
                return var5.field_e[param1];
            }
            param1 = param1 - (var5.field_e.length - 1);
            var4++;
        }
        return 0;
    }

    final int a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        oe var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ZombieDawn.field_J;
          if (param2) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          if (((vg) this).field_b == null) {
            break L1;
          } else {
            if (((vg) this).field_b.length == 0) {
              break L1;
            } else {
              if (((vg) this).field_b[0].field_b > param1) {
                break L1;
              } else {
                if (param1 <= ((vg) this).field_b[-1 + ((vg) this).field_b.length].field_g) {
                  if (-2 != (((vg) this).field_b.length ^ -1)) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (((vg) this).field_b.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((vg) this).field_b[var5];
                          if (var6.field_b > param1) {
                            break L3;
                          } else {
                            if (var6.field_g >= param1) {
                              var7 = var6.a(param0, 0);
                              if (0 != (var7 ^ -1)) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_e.length);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((vg) this).field_b[0].a(param0, 0);
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    final int b(byte param0) {
        int var2 = 0;
        oe[] var3 = null;
        int var4 = 0;
        oe var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        var2 = -1;
        if (param0 > 5) {
          L0: {
            if (null != ((vg) this).field_b) {
              var3 = ((vg) this).field_b;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a(-101);
                    if (var2 < var6) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return -97;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_c = 105;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
    }
}
