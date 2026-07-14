/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends ma {
    static int field_n;
    static int field_m;
    static String field_o;
    static String field_q;
    static int[][] field_p;

    final static int g(int param0) {
        if (param0 < 11) {
            Object var2 = null;
            boolean discarded$0 = ci.a(56, (CharSequence) null, 112, false);
            return 1;
        }
        return 1;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = TorChallenge.field_F ? 1 : 0;
          if ((param0 ^ -1) > -3) {
            break L0;
          } else {
            if (36 >= param0) {
              var4 = 0;
              var5 = 0;
              var6 = 24 % ((80 - param2) / 46);
              var7 = 0;
              var8 = param1.length();
              var9 = 0;
              L1: while (true) {
                if (var9 >= var8) {
                  return var5 != 0;
                } else {
                  L2: {
                    var10 = param1.charAt(var9);
                    if (0 != var9) {
                      break L2;
                    } else {
                      if (45 == var10) {
                        var4 = 1;
                        var9++;
                        continue L1;
                      } else {
                        if (var10 != 43) {
                          break L2;
                        } else {
                          if (!param3) {
                            break L2;
                          } else {
                            var9++;
                            continue L1;
                          }
                        }
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (var10 < 48) {
                        break L4;
                      } else {
                        if (var10 > 57) {
                          break L4;
                        } else {
                          var10 -= 48;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var10 < 65) {
                        break L5;
                      } else {
                        if (var10 > 90) {
                          break L5;
                        } else {
                          var10 -= 55;
                          break L3;
                        }
                      }
                    }
                    if (97 > var10) {
                      return false;
                    } else {
                      if (122 >= var10) {
                        var10 -= 87;
                        break L3;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (param0 > var10) {
                    L6: {
                      if (var4 != 0) {
                        var10 = -var10;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var11 = var10 + var7 * param0;
                    if (var7 == var11 / param0) {
                      var5 = 1;
                      var7 = var11;
                      var9++;
                      continue L1;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    ci(dj param0) {
        super(param0);
    }

    final String a(String param0, byte param1) {
        if (((ci) this).a((byte) 24, param0) == lk.field_c) {
            return ue.field_l;
        }
        if (param1 == -24) {
            return null;
        }
        field_o = null;
        return null;
    }

    public static void f(int param0) {
        if (param0 <= 25) {
            field_o = null;
        }
        field_q = null;
        field_p = null;
        field_o = null;
    }

    final rj a(byte param0, String param1) {
        CharSequence var4 = (CharSequence) (Object) param1;
        if (!ei.a((byte) -117, var4)) {
            return lk.field_c;
        }
        if (param0 != 24) {
            int discarded$0 = ci.g(119);
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = qh.a(var5, (byte) -125);
        if (var3 > 0) {
            // if_icmpgt L65
        } else {
            return lk.field_c;
        }
        return tf.field_w;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_n = -1;
        field_o = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_p = new int[][]{new int[1], new int[6], new int[1], new int[1], new int[1], new int[1]};
    }
}
