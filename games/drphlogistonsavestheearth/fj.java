/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends gi {
    int field_h;
    static volatile int field_j;
    static String[] field_i;

    public static void d(int param0) {
        field_i = null;
        if (param0 <= 33) {
            field_i = null;
        }
    }

    final static void e(int param0) {
        if (param0 < 90) {
            field_j = -14;
        }
    }

    fj(int param0) {
        ((fj) this).field_h = param0;
    }

    final static void a(int param0, rf param1, byte param2, rf param3) {
        ol.field_h = param0;
        uj.field_i = param3;
        cj.field_a = param1;
        if (param2 <= 104) {
            field_i = null;
            a.a(wj.field_c / 2, wj.field_k / 2, (byte) 101);
            fa.a(false, param3.field_L - -param3.field_S, param1.field_L, param1.field_S + param1.field_L, param3.field_L);
            return;
        }
        a.a(wj.field_c / 2, wj.field_k / 2, (byte) 101);
        fa.a(false, param3.field_L - -param3.field_S, param1.field_L, param1.field_S + param1.field_L, param3.field_L);
    }

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 >= 2) {
          if (36 >= param0) {
            var4 = 0;
            if (param2 >= 77) {
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
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
                      var9 = param1.charAt(var8);
                      if ((var8 ^ -1) == -1) {
                        if (45 == var9) {
                          var4 = 1;
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
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (var9 <= 57) {
                            var9 -= 48;
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 65) {
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
                        if (97 > var9) {
                          break L6;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (var9 < param0) {
                      L7: {
                        if (var4 == 0) {
                          break L7;
                        } else {
                          var9 = -var9;
                          break L7;
                        }
                      }
                      var10 = param0 * var6 - -var9;
                      if (var10 / param0 == var6) {
                        var5 = 1;
                        var6 = var10;
                        break L1;
                      } else {
                        throw new NumberFormatException();
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
              field_j = 100;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
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
                      var9 = param1.charAt(var8);
                      if ((var8 ^ -1) == -1) {
                        if (45 == var9) {
                          var4 = 1;
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
                        if (var9 < 48) {
                          break L12;
                        } else {
                          if (var9 <= 57) {
                            var9 -= 48;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (var9 < 65) {
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
                        if (97 > var9) {
                          break L14;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L11;
                          } else {
                            break L14;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (var9 < param0) {
                      L15: {
                        if (var4 == 0) {
                          break L15;
                        } else {
                          var9 = -var9;
                          break L15;
                        }
                      }
                      var10 = param0 * var6 - -var9;
                      if (var10 / param0 == var6) {
                        var5 = 1;
                        var6 = var10;
                        break L9;
                      } else {
                        throw new NumberFormatException();
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
            throw new IllegalArgumentException("" + param0);
          }
        } else {
          throw new IllegalArgumentException("" + param0);
        }
    }

    final static a f(int param0) {
        if (param0 != 36) {
            field_i = null;
            return new a(nf.e((byte) 127), mj.b((byte) 114));
        }
        return new a(nf.e((byte) 127), mj.b((byte) 114));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Earth", "Earth", "Earth", "Space", "Space", "Space", "Arkab", "Arkab", "Arkab"};
        field_j = 0;
    }
}
