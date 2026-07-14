/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends hg {
    int field_g;
    static String field_l;
    static te field_k;
    static int field_h;
    int field_i;
    static boolean field_j;

    public static void d(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 29152) {
            field_l = null;
        }
    }

    final static void e(int param0) {
        if (mj.field_d != 0) {
          de.field_j = true;
          if (param0 == -46) {
            if (20 > mj.field_d) {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          } else {
            rl.e(-10);
            if (20 > mj.field_d) {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          }
        } else {
          sj.a(8192, (byte) 51);
          de.field_j = true;
          if (param0 != -46) {
            rl.e(-10);
            if (20 <= mj.field_d) {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          } else {
            if (20 > mj.field_d) {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              de.field_j = false;
              if (mj.field_d >= 1000) {
                da.field_c.a((byte) -75);
                return;
              } else {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              }
            }
          }
        }
    }

    final static boolean a(int param0, byte param1, boolean param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        if (-3 >= (param0 ^ -1)) {
          if (param0 <= 36) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L0: while (true) {
              if (var7 > var8) {
                L1: {
                  var9 = param3.charAt(var8);
                  if (var8 != 0) {
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
                        if (!param2) {
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
                      if (var9 > 57) {
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
                      if (90 >= var9) {
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
                if (var9 >= param0) {
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
                  var10 = var6 * param0 + var9;
                  if (var10 / param0 == var6) {
                    var5 = 1;
                    var6 = var10;
                    var8++;
                    continue L0;
                  } else {
                    return false;
                  }
                }
              } else {
                if (param1 > 20) {
                  return var5 != 0;
                } else {
                  return false;
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

    private rl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Out of fuel!";
        field_j = false;
    }
}
