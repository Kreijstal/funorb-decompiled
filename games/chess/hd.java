/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hd {
    int field_a;
    int field_m;
    int field_k;
    int field_h;
    int field_j;
    int field_i;
    static jc field_l;
    static km field_f;
    static String field_e;
    static ci field_c;
    static int[][] field_n;
    static ci field_b;
    static ta field_g;
    static int field_d;

    public static void a(byte param0) {
        field_l = null;
        field_c = null;
        field_g = null;
        field_n = null;
        int var1 = 53 / ((-81 - param0) / 33);
        field_e = null;
        field_b = null;
        field_f = null;
    }

    abstract void a(int param0, int param1);

    final static int a(int param0, byte param1, boolean param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Chess.field_G;
          if (-3 < (param0 ^ -1)) {
            break L0;
          } else {
            if ((param0 ^ -1) >= -37) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param3.length();
              if (param1 >= 125) {
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var7) {
                    if (var5 == 0) {
                      throw new NumberFormatException();
                    } else {
                      return var6;
                    }
                  } else {
                    L2: {
                      var9 = param3.charAt(var8);
                      if (-1 == (var8 ^ -1)) {
                        if (45 == var9) {
                          var4 = 1;
                          var8++;
                          continue L1;
                        } else {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param2) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
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
                          if (57 < var9) {
                            break L4;
                          } else {
                            var9 -= 48;
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 65) {
                          break L5;
                        } else {
                          if (var9 > 90) {
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
                          if (var9 > 122) {
                            break L6;
                          } else {
                            var9 -= 87;
                            break L3;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (param0 > var9) {
                      L7: {
                        if (var4 == 0) {
                          break L7;
                        } else {
                          var9 = -var9;
                          break L7;
                        }
                      }
                      var10 = var9 + var6 * param0;
                      if (var6 == var10 / param0) {
                        var6 = var10;
                        var5 = 1;
                        var8++;
                        continue L1;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              } else {
                return -79;
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new jc();
        field_f = new km(640, 480);
    }
}
