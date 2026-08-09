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
        field_n = (int[][]) null;
        int var1 = 53 / ((-81 - param0) / 33);
        field_e = null;
        field_b = null;
        field_f = null;
    }

    abstract void a(int param0, int param1);

    final static int a(int param0, byte param1, boolean param2, CharSequence param3) {
        int stackIn_7_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (-3 < (param0 ^ -1)) {
                break L1;
              } else {
                if ((param0 ^ -1) >= -37) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  if (param1 >= 125) {
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var7) {
                        if (var5 == 0) {
                          throw new NumberFormatException();
                        } else {
                          stackIn_41_0 = var6;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        L3: {
                          L4: {
                            var9 = param3.charAt(var8);
                            if (-1 == (var8 ^ -1)) {
                              if (45 == var9) {
                                var4_int = 1;
                                break L3;
                              } else {
                                if (var9 != 43) {
                                  break L4;
                                } else {
                                  if (!param2) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            L6: {
                              if (var9 < 48) {
                                break L6;
                              } else {
                                if (57 < var9) {
                                  break L6;
                                } else {
                                  var9 -= 48;
                                  break L5;
                                }
                              }
                            }
                            L7: {
                              if (var9 < 65) {
                                break L7;
                              } else {
                                if (var9 > 90) {
                                  break L7;
                                } else {
                                  var9 -= 55;
                                  break L5;
                                }
                              }
                            }
                            L8: {
                              if (var9 < 97) {
                                break L8;
                              } else {
                                if (var9 > 122) {
                                  break L8;
                                } else {
                                  var9 -= 87;
                                  break L5;
                                }
                              }
                            }
                            throw new NumberFormatException();
                          }
                          if (param0 > var9) {
                            L9: {
                              if (var4_int == 0) {
                                break L9;
                              } else {
                                var9 = -var9;
                                break L9;
                              }
                            }
                            var10 = var9 + var6 * param0;
                            if (var6 == var10 / param0) {
                              var6 = var10;
                              var5 = 1;
                              break L3;
                            } else {
                              throw new NumberFormatException();
                            }
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_7_0 = -79;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var4);

            stackIn_44_1 = new StringBuilder().append("hd.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L10;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L10;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_41_0;
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_l = new jc();
        field_f = new km(640, 480);
    }
}
