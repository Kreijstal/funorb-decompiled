/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static am field_f;
    static int[] field_e;
    static int field_a;
    static String field_d;
    static String field_c;
    static pj field_b;

    final static int a(int param0, CharSequence param1, int param2) {
        if (param2 != -1) {
            return 38;
        }
        return wk.a(90, param0, param1, true);
    }

    final static int a(int param0, int param1, CharSequence param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param1 < 2) {
            break L0;
          } else {
            if (param1 > 36) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                if (param0 == 90) {
                  break L1;
                } else {
                  field_d = null;
                  break L1;
                }
              }
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (var8 == 0) {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param3) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
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
                        if (90 >= var9) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param1 > var9) {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = param1 * var6 + var9;
                    if (var10 / param1 != var6) {
                      throw new NumberFormatException();
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param1);
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
            field_c = null;
        }
        field_e = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new am();
        field_e = new int[8192];
        field_a = -1;
        field_c = "Orb points: <%0>";
        field_b = new pj();
    }
}
