/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ju {
    static wk[][] field_a;
    ts[] field_b;
    static int[] field_c;

    final int a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -76 / ((param0 - 74) / 32);
            if (((ju) this).field_b == null) {
              break L1;
            } else {
              if (0 >= ((ju) this).field_b.length) {
                break L1;
              } else {
                stackOut_2_0 = ((ju) this).field_b[-1 + ((ju) this).field_b.length].field_c - ((ju) this).field_b[0].field_n;
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

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ts var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((ju) this).field_b == null) {
            break L0;
          } else {
            if (0 == ((ju) this).field_b.length) {
              break L0;
            } else {
              if (((ju) this).field_b[0].field_n <= param1) {
                if (param1 <= ((ju) this).field_b[((ju) this).field_b.length + param2].field_c) {
                  if (-2 != (((ju) this).field_b.length ^ -1)) {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (((ju) this).field_b.length <= var5) {
                        return -1;
                      } else {
                        L2: {
                          var6 = ((ju) this).field_b[var5];
                          if (param1 < var6.field_n) {
                            break L2;
                          } else {
                            if (param1 > var6.field_c) {
                              break L2;
                            } else {
                              var7 = var6.a(param0, (byte) 29);
                              if (0 == (var7 ^ -1)) {
                                return -1;
                              } else {
                                return var4 - -var7;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_i.length);
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    return ((ju) this).field_b[0].a(param0, (byte) 29);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final static int a(bv param0, int param1, int param2, int param3, byte param4, int param5) {
        if (param4 > -121) {
            Object var7 = null;
            int discarded$0 = ju.a((bv) null, 120, 29, -83, (byte) -93, 59);
        }
        int var6 = param0.g(-106, 1);
        if (0 == var6) {
            return (param5 ^ -1) >= -1 ? 0 : param0.g(-109, param5);
        }
        if (1 != var6) {
            throw new IllegalStateException();
        }
        return param0.g(95, param3) - -param1;
    }

    final static int a(int param0, int param1, CharSequence param2) {
        if (param0 != 0) {
            ju.a(-112);
        }
        return ob.a(param1, true, param2, 0);
    }

    final int a(boolean param0) {
        int var2 = 0;
        ts[] var3 = null;
        int var4 = 0;
        ts var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = -1;
          if (((ju) this).field_b == null) {
            break L0;
          } else {
            var3 = ((ju) this).field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(0);
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
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            field_a = null;
            break L2;
          }
        }
        return var2;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        ts var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ts[] var7 = ((ju) this).field_b;
        ts[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5.field_i.length <= param1)) {
                return var5.field_i[param1];
            }
            param1 = param1 - (-1 + var5.field_i.length);
        }
        if (param0 != -66) {
            int discarded$0 = ((ju) this).a(true);
            return 0;
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        ts var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var3 = param0; ((ju) this).field_b.length > var3; var3++) {
            var4 = ((ju) this).field_b[var3];
            if (!(var4.field_i.length <= param1)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_i.length);
        }
        return ((ju) this).field_b.length;
    }

    public static void a(int param0) {
        if (param0 >= -111) {
            Object var2 = null;
            int discarded$0 = ju.a(-42, 6, (CharSequence) null);
        }
        field_c = null;
        field_a = null;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = 0;
        var6 = 0;
        var7 = param1.length();
        var8 = param0;
        L0: while (true) {
          if (var7 <= var8) {
            if ((var5 ^ -1) < -1) {
              return (-param3 + param2 << -1853594840) / var5;
            } else {
              return 0;
            }
          } else {
            var9 = param1.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
              var8++;
              continue L0;
            } else {
              if (var9 == 62) {
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
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
