/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gra extends rqa {
    static String field_p;
    static int field_o;

    public static void e(byte param0) {
        int var1 = 116 / ((58 - param0) / 61);
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = 32;
          si.a(86, 62, param0[0].a(63));
          return new nc((Object) (Object) "void");
        } else {
          si.a(86, 62, param0[0].a(63));
          return new nc((Object) (Object) "void");
        }
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        if (param3 >= 2) {
          if (36 >= param3) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            if (param2 > 93) {
              var8 = 0;
              L0: while (true) {
                if (var7 > var8) {
                  L1: {
                    var9 = param0.charAt(var8);
                    if (var8 == 0) {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L1;
                        } else {
                          if (!param1) {
                            break L1;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L0;
                      }
                    } else {
                      break L1;
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
                      if (65 > var9) {
                        break L4;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    return false;
                  }
                  if (param3 > var9) {
                    L6: {
                      if (var4 == 0) {
                        break L6;
                      } else {
                        var9 = -var9;
                        break L6;
                      }
                    }
                    var10 = var9 + var6 * param3;
                    if (var6 != var10 / param3) {
                      return false;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L0;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return var5 != 0;
                }
              }
            } else {
              field_p = null;
              var8 = 0;
              L7: while (true) {
                if (var7 > var8) {
                  L8: {
                    var9 = param0.charAt(var8);
                    if (var8 == 0) {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L8;
                        } else {
                          if (!param1) {
                            break L8;
                          } else {
                            var8++;
                            continue L7;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L7;
                      }
                    } else {
                      break L8;
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
                      if (65 > var9) {
                        break L11;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var9 < 97) {
                        break L12;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                    return false;
                  }
                  if (param3 > var9) {
                    L13: {
                      if (var4 == 0) {
                        break L13;
                      } else {
                        var9 = -var9;
                        break L13;
                      }
                    }
                    var10 = var9 + var6 * param3;
                    if (var6 != var10 / param3) {
                      return false;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L7;
                    }
                  } else {
                    return false;
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

    gra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static phb a(asb param0, String param1, String param2, boolean param3) {
        int var4 = param0.b(param2, -124);
        int var5 = param0.a(param3, var4, param1);
        return ofb.a(var4, var5, param0, 2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Please enter your age in years";
        field_o = 1;
    }
}
