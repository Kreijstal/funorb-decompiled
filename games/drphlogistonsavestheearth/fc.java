/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        int var1 = -91 % ((param0 - 3) / 48);
        field_b = null;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if ((param3 ^ -1) <= -3) {
          if ((param3 ^ -1) >= -37) {
            var4 = 0;
            var5 = 0;
            if (param1 == -44) {
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L0: while (true) {
                if (var7 > var8) {
                  L1: {
                    var9 = param2.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L1;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L0;
                      } else {
                        if (var9 != 43) {
                          break L1;
                        } else {
                          if (!param0) {
                            break L1;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                    }
                  }
                  L2: {
                    L3: {
                      if (var9 < 48) {
                        break L3;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (90 < var9) {
                          break L4;
                        } else {
                          var9 -= 55;
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (122 < var9) {
                          break L5;
                        } else {
                          var9 -= 87;
                          break L2;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 >= param3) {
                    return false;
                  } else {
                    L6: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = var6 * param3 - -var9;
                    if (var6 != var10 / param3) {
                      return false;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L0;
                    }
                  }
                } else {
                  return var5 != 0;
                }
              }
            } else {
              var12 = null;
              fc.a(92, (nl) null, 82);
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L7: while (true) {
                if (var7 > var8) {
                  L8: {
                    var9 = param2.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L8;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L7;
                      } else {
                        if (var9 != 43) {
                          break L8;
                        } else {
                          if (!param0) {
                            break L8;
                          } else {
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (var9 < 48) {
                        break L10;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var9 < 65) {
                        break L11;
                      } else {
                        if (90 < var9) {
                          break L11;
                        } else {
                          var9 -= 55;
                          break L9;
                        }
                      }
                    }
                    L12: {
                      if (var9 < 97) {
                        break L12;
                      } else {
                        if (122 < var9) {
                          break L12;
                        } else {
                          var9 -= 87;
                          break L9;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 >= param3) {
                    return false;
                  } else {
                    L13: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var10 = var6 * param3 - -var9;
                    if (var6 != var10 / param3) {
                      return false;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L7;
                    }
                  }
                } else {
                  return var5 != 0;
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param3);
          }
        } else {
          throw new IllegalArgumentException("" + param3);
        }
    }

    final static void a(int param0, nl param1, int param2) {
        int var4 = 0;
        lh var5 = null;
        var5 = nj.field_p;
        var5.d(param2, -18392);
        var5.field_j = var5.field_j + 1;
        var4 = var5.field_j;
        var5.c(1, (byte) -126);
        var5.c(param1.field_j, (byte) -95);
        var5.b((byte) -63, param1.field_l);
        var5.a(param1.field_h, (byte) 122);
        var5.a(param1.field_p, (byte) -2);
        if (param0 > -1) {
          fc.a(113);
          var5.a(param1.field_q, (byte) -117);
          var5.a(param1.field_k, (byte) 104);
          int discarded$2 = var5.d(var4, (byte) 9);
          var5.b(var5.field_j + -var4, (byte) 87);
          return;
        } else {
          var5.a(param1.field_q, (byte) -117);
          var5.a(param1.field_k, (byte) 104);
          int discarded$3 = var5.d(var4, (byte) 9);
          var5.b(var5.field_j + -var4, (byte) 87);
          return;
        }
    }

    static {
    }
}
