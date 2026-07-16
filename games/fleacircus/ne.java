/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ne {
    static rh field_a;
    pi[] field_c;
    static int[] field_b;
    static fh field_d;

    final int a(int param0, String param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = fleas.field_A ? 1 : 0;
        var5 = 0;
        var6 = 0;
        var7 = param1.length();
        var8 = param2;
        L0: while (true) {
          if (var7 <= var8) {
            if (0 >= var5) {
              return 0;
            } else {
              return (param3 + -param0 << 1573935784) / var5;
            }
          } else {
            var9 = param1.charAt(var8);
            if (var9 != 60) {
              if (var9 != 62) {
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
              } else {
                var6 = 0;
                var8++;
                continue L0;
              }
            } else {
              var6 = 1;
              var8++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -84) {
            ne.a((byte) 82);
        }
        field_a = null;
        field_b = null;
    }

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ne) this).field_c) {
              break L2;
            } else {
              if ((((ne) this).field_c.length ^ -1) >= -1) {
                break L2;
              } else {
                stackOut_4_0 = ((ne) this).field_c[-1 + ((ne) this).field_c.length].field_c - ((ne) this).field_c[0].field_a;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        pi var4 = null;
        int var5 = fleas.field_A ? 1 : 0;
        if (param1 != -1) {
            return 33;
        }
        for (var3 = 0; var3 < ((ne) this).field_c.length; var3++) {
            var4 = ((ne) this).field_c[var3];
            if (param0 < var4.field_d.length) {
                return var3;
            }
            param0 = param0 - (var4.field_d.length + -1);
        }
        return ((ne) this).field_c.length;
    }

    final int b(byte param0) {
        int var2 = 0;
        pi[] var3 = null;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          if (param0 == 97) {
            break L0;
          } else {
            int discarded$2 = ((ne) this).a(false);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (((ne) this).field_c != null) {
            var3 = ((ne) this).field_c;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b((byte) -42);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        pi var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          if (null == ((ne) this).field_c) {
            break L0;
          } else {
            if (((ne) this).field_c.length == 0) {
              break L0;
            } else {
              if (((ne) this).field_c[0].field_a > param1) {
                break L0;
              } else {
                if (((ne) this).field_c[-1 + ((ne) this).field_c.length].field_c < param1) {
                  return -1;
                } else {
                  if ((((ne) this).field_c.length ^ -1) != -2) {
                    var4 = 0;
                    if (param2 < -104) {
                      var5 = 0;
                      L1: while (true) {
                        if (var5 >= ((ne) this).field_c.length) {
                          return -1;
                        } else {
                          L2: {
                            var6 = ((ne) this).field_c[var5];
                            if (var6.field_a > param1) {
                              break L2;
                            } else {
                              if (param1 > var6.field_c) {
                                break L2;
                              } else {
                                var7 = var6.a(6759, param0);
                                if ((var7 ^ -1) != 0) {
                                  return var4 - -var7;
                                } else {
                                  return -1;
                                }
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_d.length);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return -97;
                    }
                  } else {
                    return ((ne) this).field_c[0].a(6759, param0);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int c(int param0, int param1) {
        int var4 = 0;
        pi var5 = null;
        int var6 = fleas.field_A ? 1 : 0;
        pi[] var7 = ((ne) this).field_c;
        pi[] var3 = var7;
        if (param0 != -1) {
            field_a = null;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (param1 < var5.field_d.length) {
                return var5.field_d[param1];
            }
            param1 = param1 - (-1 + var5.field_d.length);
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[256];
        field_d = new fh(0, 2, 2, 1);
    }
}
