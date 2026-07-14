/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_e;
    static String field_a;
    static nc field_b;
    static String field_d;
    static ff field_c;
    static String[] field_g;
    static e field_f;

    final static int a(qc param0, int param1, sd param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = SolKnight.field_L ? 1 : 0;
          if (param2 == null) {
            break L0;
          } else {
            if (null == param2.field_i) {
              break L0;
            } else {
              if (param0 == null) {
                break L0;
              } else {
                if (param0.field_m == param2.field_o) {
                  var4 = param0.field_r.length;
                  var5 = param2.field_i[param1].length / var4;
                  var6 = param3;
                  L1: while (true) {
                    if (var5 <= var6) {
                      return -1;
                    } else {
                      if ((param0.field_n ^ -1L) == (param2.field_m[param1][var6] ^ -1L)) {
                        if (kj.a(param2.field_n[param1][var6], (byte) -109)) {
                          var7 = 0;
                          L2: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (param0.field_r[var7] == param2.field_i[param1][var7 + var4 * var6]) {
                                var6 = var6;
                                var7++;
                                continue L2;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        int var1 = -55 % ((param0 - 62) / 40);
        field_a = null;
        field_b = null;
        field_g = null;
    }

    final static long a(CharSequence param0, byte param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          var2 = 0L;
          if (param1 == 44) {
            break L0;
          } else {
            ti.a((byte) 25);
            break L0;
          }
        }
        var4 = param0.length();
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var4 <= var5) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 > 90) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(1 - (-var6 + 65));
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (var6 > 122) {
                      break L5;
                    } else {
                      var2 = var2 + (long)(-97 + (var6 + 1));
                      break L3;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (57 >= var6) {
                    var2 = var2 + (long)(27 - (-var6 - -48));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if ((var2 ^ -1L) <= -177917621779460414L) {
                break L2;
              } else {
                var5++;
                continue L1;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (var2 % 37L != 0L) {
                break L7;
              } else {
                if (0L == var2) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    final static void a(byte param0) {
        il.field_c.field_l = 0;
        int var1 = -8 / ((param0 - -58) / 63);
        il.field_c.field_c = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "CONGRATULATIONS!";
        field_d = "Highscores";
        field_b = new nc();
        field_c = new ff(4, 1, 1, 1);
        field_g = new String[]{"By rating", "By win percentage"};
    }
}
