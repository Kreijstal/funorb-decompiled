/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kha {
    static String field_a;
    int field_d;
    int[] field_c;
    int field_b;

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            ((kha) this).field_d = -57;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((kha) this).field_c == null) {
              break L2;
            } else {
              if (0 == ((kha) this).field_c.length) {
                break L2;
              } else {
                stackOut_4_0 = ((kha) this).field_c[-1 + ((kha) this).field_c.length];
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

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((kha) this).field_c == null) {
          return 0;
        } else {
          if (0 != ((kha) this).field_c.length) {
            var3 = 1;
            L0: while (true) {
              if (var3 >= ((kha) this).field_c.length) {
                L1: {
                  if (param1 == -1) {
                    break L1;
                  } else {
                    field_a = null;
                    break L1;
                  }
                }
                return -1 + ((kha) this).field_c.length;
              } else {
                if (param0 >= ((kha) this).field_c[var3 - 1] - -((kha) this).field_c[var3] >> 1614274689) {
                  var3++;
                  continue L0;
                } else {
                  return var3 + -1;
                }
              }
            }
          } else {
            return 0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_a = null;
        }
    }

    final static java.awt.Frame a(fia param0, int param1, int param2, int param3, int param4, int param5) {
        dh[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        dh[] var10 = null;
        naa var11 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param0.a((byte) 69)) {
          L0: {
            if (param4 != 0) {
              break L0;
            } else {
              var10 = af.a(66, param0);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (var10[var8].field_a == param5) {
                      if (param2 == var10[var8].field_c) {
                        L2: {
                          if (-1 == (param1 ^ -1)) {
                            break L2;
                          } else {
                            if (var10[var8].field_b == param1) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (var10[var8].field_d > param4) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        var7_int = 1;
                        param4 = var10[var8].field_d;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            }
          }
          var11 = param0.a(param4, param1, param2, (byte) 66, param5);
          L4: while (true) {
            if (var11.field_b != 0) {
              var7 = (java.awt.Frame) var11.field_f;
              if (var7 != null) {
                if (param3 == 10) {
                  if ((var11.field_b ^ -1) != -3) {
                    return var7;
                  } else {
                    vf.a(31637, param0, var7);
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              vja.a(0, 10L);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    kha(int param0, int param1, int param2) {
        ((kha) this).field_b = param1;
        ((kha) this).field_d = param0;
        ((kha) this).field_c = new int[param2 + 1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "500+";
    }
}
