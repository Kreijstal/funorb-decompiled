/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static nk[] field_b;
    static int[] field_c;
    static String field_d;
    static pa[] field_a;

    protected aa() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          aa.b(-69);
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static void b(int param0) {
        String var2 = (String) null;
        ub.a(rt.field_e, (String) null, -117);
        if (param0 != 87) {
            field_d = (String) null;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        if (2 <= param1) {
          if (-37 <= (param1 ^ -1)) {
            var4 = 0;
            var5 = 0;
            if (param3 == -43) {
              var6 = 0;
              var7 = ((CharSequence) param2).length();
              var8 = 0;
              L0: while (true) {
                if (var7 > var8) {
                  L1: {
                    var9 = ((CharSequence) param2).charAt(var8);
                    if (var8 == 0) {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L1;
                        } else {
                          if (!param0) {
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
                        if (57 < var9) {
                          break L3;
                        } else {
                          var9 -= 48;
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (var9 > 90) {
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
                  if (param1 > var9) {
                    L6: {
                      if (var4 == 0) {
                        break L6;
                      } else {
                        var9 = -var9;
                        break L6;
                      }
                    }
                    var10 = param1 * var6 - -var9;
                    if (var6 == var10 / param1) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L0;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return var5 != 0;
                }
              }
            } else {
              field_c = (int[]) null;
              var6 = 0;
              var7 = ((CharSequence) param2).length();
              var8 = 0;
              L7: while (true) {
                if (var7 > var8) {
                  L8: {
                    var9 = ((CharSequence) param2).charAt(var8);
                    if (var8 == 0) {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L8;
                        } else {
                          if (!param0) {
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
                        if (57 < var9) {
                          break L10;
                        } else {
                          var9 -= 48;
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (var9 < 65) {
                        break L11;
                      } else {
                        if (var9 > 90) {
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
                  if (param1 > var9) {
                    L13: {
                      if (var4 == 0) {
                        break L13;
                      } else {
                        var9 = -var9;
                        break L13;
                      }
                    }
                    var10 = param1 * var6 - -var9;
                    if (var6 == var10 / param1) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L7;
                    } else {
                      return false;
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
            throw new IllegalArgumentException("" + param1);
          }
        } else {
          throw new IllegalArgumentException("" + param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nk[8];
        field_d = "Account created successfully!";
    }
}
