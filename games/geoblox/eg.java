/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends hf {
    int[] field_k;
    static cj field_p;
    int[] field_j;
    int[] field_g;
    int field_m;
    static dm[] field_q;
    cb[] field_i;
    static volatile int field_h;
    byte[][][] field_o;
    cb[] field_n;
    int field_f;
    static String field_l;

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
            field_l = null;
            field_p = null;
            field_l = null;
            return;
        }
        field_p = null;
        field_l = null;
    }

    final static int a(CharSequence param0, byte param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        if (2 <= param2) {
          if (-37 <= (param2 ^ -1)) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            if (param1 > 2) {
              var8 = 0;
              L0: while (true) {
                if ((var7 ^ -1) >= (var8 ^ -1)) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L1: {
                    L2: {
                      var9 = param0.charAt(var8);
                      if (var8 == 0) {
                        if (var9 == 45) {
                          var4 = 1;
                          var8++;
                          break L1;
                        } else {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param3) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (48 > var9) {
                          break L4;
                        } else {
                          if (var9 > 57) {
                            break L4;
                          } else {
                            var9 -= 48;
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (65 > var9) {
                          break L5;
                        } else {
                          if (90 < var9) {
                            break L5;
                          } else {
                            var9 -= 55;
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 97) {
                          break L6;
                        } else {
                          if (122 >= var9) {
                            var9 -= 87;
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if ((var9 ^ -1) > (param2 ^ -1)) {
                      L7: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = var6 * param2 + var9;
                      if (var6 != var10 / param2) {
                        throw new NumberFormatException();
                      } else {
                        var5 = 1;
                        var6 = var10;
                        break L1;
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                  var8++;
                  continue L0;
                }
              }
            } else {
              var11 = null;
              int discarded$1 = eg.a((CharSequence) null, (byte) 58, 6, false);
              var8 = 0;
              L8: while (true) {
                if ((var7 ^ -1) >= (var8 ^ -1)) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L9: {
                    L10: {
                      var9 = param0.charAt(var8);
                      if (var8 == 0) {
                        if (var9 == 45) {
                          var4 = 1;
                          var8++;
                          break L9;
                        } else {
                          if (var9 != 43) {
                            break L10;
                          } else {
                            if (!param3) {
                              break L10;
                            } else {
                              break L9;
                            }
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        if (48 > var9) {
                          break L12;
                        } else {
                          if (var9 > 57) {
                            break L12;
                          } else {
                            var9 -= 48;
                            break L11;
                          }
                        }
                      }
                      L13: {
                        if (65 > var9) {
                          break L13;
                        } else {
                          if (90 < var9) {
                            break L13;
                          } else {
                            var9 -= 55;
                            break L11;
                          }
                        }
                      }
                      L14: {
                        if (var9 < 97) {
                          break L14;
                        } else {
                          if (122 >= var9) {
                            var9 -= 87;
                            break L11;
                          } else {
                            break L14;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if ((var9 ^ -1) > (param2 ^ -1)) {
                      L15: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var10 = var6 * param2 + var9;
                      if (var6 != var10 / param2) {
                        throw new NumberFormatException();
                      } else {
                        var5 = 1;
                        var6 = var10;
                        break L9;
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                  var8++;
                  continue L8;
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param2);
          }
        } else {
          throw new IllegalArgumentException("" + param2);
        }
    }

    eg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
    }
}
