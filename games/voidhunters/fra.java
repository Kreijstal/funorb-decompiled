/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fra {
    static String field_c;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 2147483647) {
            fra.a(52);
        }
    }

    final static boolean a(int[] param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_28_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        var16 = VoidHunters.field_G;
        var4 = 2147483647;
        var5 = -2147483648;
        var6 = 2147483647;
        var7 = -2147483648;
        var8 = 0;
        L0: while (true) {
          if (var8 >= param0.length) {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                fra.a(25);
                break L1;
              }
            }
            if (em.a(5220, var5, param1, var7, param3, var4, var6)) {
              var8 = param3;
              var9 = param1;
              var10 = param3 + -(var4 - -var5 >> -1474575423);
              var11 = -(var6 + var7 >> -694688287) + param1;
              if (Math.abs(var10) < Math.abs(var11)) {
                if (0 >= var10) {
                  L2: {
                    var8 = var8 - (var5 + -var4);
                    var10 = 0;
                    var17 = 0;
                    var11 = var17;
                    if (var17 >= param0.length) {
                      break L2;
                    } else {
                      L3: {
                        var12 = param0[var17];
                        var13 = param0[1 + var17];
                        var14 = param0[(2 + var17) % param0.length];
                        var15 = param0[(var17 - -3) % param0.length];
                        if (-1 == ng.a(8, param1, (byte) 93, param3, var14, var8, var13, var12, var15, var9)) {
                          var17 += 2;
                          break L3;
                        } else {
                          var10++;
                          break L3;
                        }
                      }
                      var17 += 2;
                      var17 += 2;
                      var17 += 2;
                      break L2;
                    }
                  }
                  L4: {
                    if (var10 % 2 != 1) {
                      stackOut_56_0 = 0;
                      stackIn_57_0 = stackOut_56_0;
                      break L4;
                    } else {
                      stackOut_55_0 = 1;
                      stackIn_57_0 = stackOut_55_0;
                      break L4;
                    }
                  }
                  return stackIn_57_0 != 0;
                } else {
                  L5: {
                    var8 = var8 + (var5 - var4);
                    var10 = 0;
                    var17 = 0;
                    var11 = var17;
                    if (var17 >= param0.length) {
                      break L5;
                    } else {
                      L6: {
                        var12 = param0[var17];
                        var13 = param0[1 + var17];
                        var14 = param0[(2 + var17) % param0.length];
                        var15 = param0[(var17 - -3) % param0.length];
                        if (-1 == ng.a(8, param1, (byte) 93, param3, var14, var8, var13, var12, var15, var9)) {
                          var17 += 2;
                          break L6;
                        } else {
                          var10++;
                          break L6;
                        }
                      }
                      var17 += 2;
                      var17 += 2;
                      var17 += 2;
                      break L5;
                    }
                  }
                  L7: {
                    if (var10 % 2 != 1) {
                      stackOut_47_0 = 0;
                      stackIn_48_0 = stackOut_47_0;
                      break L7;
                    } else {
                      stackOut_46_0 = 1;
                      stackIn_48_0 = stackOut_46_0;
                      break L7;
                    }
                  }
                  return stackIn_48_0 != 0;
                }
              } else {
                if ((var11 ^ -1) >= -1) {
                  L8: {
                    var9 = var9 - (var7 - var6);
                    var10 = 0;
                    var17 = 0;
                    var11 = var17;
                    if (var17 >= param0.length) {
                      break L8;
                    } else {
                      L9: {
                        var12 = param0[var17];
                        var13 = param0[1 + var17];
                        var14 = param0[(2 + var17) % param0.length];
                        var15 = param0[(var17 - -3) % param0.length];
                        if (-1 == ng.a(8, param1, (byte) 93, param3, var14, var8, var13, var12, var15, var9)) {
                          var17 += 2;
                          break L9;
                        } else {
                          var10++;
                          break L9;
                        }
                      }
                      var17 += 2;
                      var17 += 2;
                      var17 += 2;
                      break L8;
                    }
                  }
                  L10: {
                    if (var10 % 2 != 1) {
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L10;
                    } else {
                      stackOut_35_0 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      break L10;
                    }
                  }
                  return stackIn_37_0 != 0;
                } else {
                  L11: {
                    var9 = var9 + (-var6 + var7);
                    var10 = 0;
                    var17 = 0;
                    var11 = var17;
                    if (var17 >= param0.length) {
                      break L11;
                    } else {
                      L12: {
                        var12 = param0[var17];
                        var13 = param0[1 + var17];
                        var14 = param0[(2 + var17) % param0.length];
                        var15 = param0[(var17 - -3) % param0.length];
                        if (-1 == ng.a(8, param1, (byte) 93, param3, var14, var8, var13, var12, var15, var9)) {
                          var17 += 2;
                          break L12;
                        } else {
                          var10++;
                          break L12;
                        }
                      }
                      var17 += 2;
                      var17 += 2;
                      var17 += 2;
                      break L11;
                    }
                  }
                  L13: {
                    if (var10 % 2 != 1) {
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      break L13;
                    } else {
                      stackOut_26_0 = 1;
                      stackIn_28_0 = stackOut_26_0;
                      break L13;
                    }
                  }
                  return stackIn_28_0 != 0;
                }
              }
            } else {
              return false;
            }
          } else {
            L14: {
              var9 = param0[var8];
              if (var5 < var9) {
                var5 = var9;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var10 = param0[1 + var8];
              if (var9 >= var4) {
                break L15;
              } else {
                var4 = var9;
                break L15;
              }
            }
            L16: {
              if (var10 > var7) {
                var7 = var10;
                break L16;
              } else {
                break L16;
              }
            }
            if (var6 > var10) {
              var6 = var10;
              var8 += 2;
              continue L0;
            } else {
              var8 += 2;
              continue L0;
            }
          }
        }
    }

    final static int a(byte param0) {
        int var1 = -17 / ((-44 - param0) / 49);
        return sea.a(-19) - seb.a(27546) / 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 1;
        field_b = 50;
        field_c = "This option cannot be combined with the current '<%0>' setting.";
    }
}
