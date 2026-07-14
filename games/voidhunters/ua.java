/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        si.a(67, 62, param0[0].a(51));
        if (param1 > -119) {
            Object var4 = null;
            int discarded$0 = ua.a(false, (CharSequence) null, true, -5);
            return new nc((Object) (Object) "void");
        }
        return new nc((Object) (Object) "void");
    }

    ua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(boolean param0, CharSequence param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        if (-3 < (param3 ^ -1)) {
          throw new IllegalArgumentException("" + param3);
        } else {
          if (-37 <= (param3 ^ -1)) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            if (param2) {
              L0: {
                var7 = param1.length();
                var8 = 0;
                if (var7 <= var8) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      var9 = param1.charAt(var8);
                      if (-1 == (var8 ^ -1)) {
                        L3: {
                          if (var9 == 45) {
                            var4 = 1;
                            var8++;
                            break L3;
                          } else {
                            if (43 != var9) {
                              break L2;
                            } else {
                              if (param0) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        var8++;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                    L4: {
                      L5: {
                        if (48 > var9) {
                          break L5;
                        } else {
                          if (var9 <= 57) {
                            var9 -= 48;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 65) {
                          break L6;
                        } else {
                          if (var9 > 90) {
                            break L6;
                          } else {
                            var9 -= 55;
                            break L4;
                          }
                        }
                      }
                      L7: {
                        if (var9 < 97) {
                          break L7;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if ((param3 ^ -1) >= (var9 ^ -1)) {
                      throw new NumberFormatException();
                    } else {
                      L8: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var10 = var9 + var6 * param3;
                      if ((var6 ^ -1) != (var10 / param3 ^ -1)) {
                        throw new NumberFormatException();
                      } else {
                        var6 = var10;
                        var5 = 1;
                        break L1;
                      }
                    }
                  }
                  var8++;
                  var8++;
                  var8++;
                  var8++;
                  break L0;
                }
              }
              if (var5 == 0) {
                throw new NumberFormatException();
              } else {
                return var6;
              }
            } else {
              field_o = 6;
              var7 = param1.length();
              var8 = 0;
              L9: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L10: {
                    L11: {
                      var9 = param1.charAt(var8);
                      if (-1 == (var8 ^ -1)) {
                        if (var9 == 45) {
                          var4 = 1;
                          break L10;
                        } else {
                          if (43 != var9) {
                            break L11;
                          } else {
                            if (param0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if (48 > var9) {
                          break L13;
                        } else {
                          if (var9 <= 57) {
                            var9 -= 48;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (var9 < 65) {
                          break L14;
                        } else {
                          if (var9 > 90) {
                            break L14;
                          } else {
                            var9 -= 55;
                            break L12;
                          }
                        }
                      }
                      L15: {
                        if (var9 < 97) {
                          break L15;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L12;
                          } else {
                            break L15;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if ((param3 ^ -1) >= (var9 ^ -1)) {
                      throw new NumberFormatException();
                    } else {
                      L16: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var10 = var9 + var6 * param3;
                      if ((var6 ^ -1) != (var10 / param3 ^ -1)) {
                        throw new NumberFormatException();
                      } else {
                        var6 = var10;
                        var5 = 1;
                        break L10;
                      }
                    }
                  }
                  var8++;
                  continue L9;
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 1;
    }
}
