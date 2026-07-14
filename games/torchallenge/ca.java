/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static String field_c;
    static int[][] field_a;
    private int[] field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 32) {
            ca.a(-32);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        if (0 == param3) {
          return 0;
        } else {
          if (param0 == 25790) {
            var7 = 0;
            param3 = param3 + param2;
            var8 = param1;
            L0: while (true) {
              L1: {
                var9 = param5[var8];
                if (-1 >= (var9 ^ -1)) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((ca) this).field_b[var7];
                  break L1;
                }
              }
              L2: {
                var10 = ((ca) this).field_b[var7];
                if (((ca) this).field_b[var7] < 0) {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param2 < param3) {
                    var7 = 0;
                    break L2;
                  } else {
                    return -param1 + 1 + var8;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (-1 == (64 & var9 ^ -1)) {
                  var7++;
                  break L3;
                } else {
                  var7 = ((ca) this).field_b[var7];
                  break L3;
                }
              }
              L4: {
                var10 = ((ca) this).field_b[var7];
                if (0 > ((ca) this).field_b[var7]) {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param2 < param3) {
                    var7 = 0;
                    break L4;
                  } else {
                    return -param1 + 1 + var8;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (-1 != (var9 & 32 ^ -1)) {
                  var7 = ((ca) this).field_b[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((ca) this).field_b[var7];
                if (((ca) this).field_b[var7] < 0) {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param3 > param2) {
                    var7 = 0;
                    break L6;
                  } else {
                    return -param1 + 1 + var8;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if ((16 & var9) != 0) {
                  var7 = ((ca) this).field_b[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((ca) this).field_b[var7];
                if (((ca) this).field_b[var7] >= 0) {
                  break L8;
                } else {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param2 < param3) {
                    var7 = 0;
                    break L8;
                  } else {
                    return -param1 + 1 + var8;
                  }
                }
              }
              L9: {
                if (0 != (var9 & 8)) {
                  var7 = ((ca) this).field_b[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((ca) this).field_b[var7];
                if (-1 >= (((ca) this).field_b[var7] ^ -1)) {
                  break L10;
                } else {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param3 > param2) {
                    var7 = 0;
                    break L10;
                  } else {
                    return -param1 + 1 + var8;
                  }
                }
              }
              L11: {
                if (-1 != (var9 & 4 ^ -1)) {
                  var7 = ((ca) this).field_b[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((ca) this).field_b[var7];
                if (((ca) this).field_b[var7] >= 0) {
                  break L12;
                } else {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param3 > param2) {
                    var7 = 0;
                    break L12;
                  } else {
                    return -param1 + 1 + var8;
                  }
                }
              }
              L13: {
                if ((2 & var9) == 0) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((ca) this).field_b[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((ca) this).field_b[var7];
                if (((ca) this).field_b[var7] < 0) {
                  param2++;
                  param4[param2] = (byte)(var10 ^ -1);
                  if (param2 < param3) {
                    var7 = 0;
                    break L14;
                  } else {
                    return -param1 + 1 + var8;
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if ((1 & var9) != 0) {
                  var7 = ((ca) this).field_b[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              var10 = ((ca) this).field_b[var7];
              if (((ca) this).field_b[var7] >= 0) {
                var8++;
                continue L0;
              } else {
                param2++;
                param4[param2] = (byte)(var10 ^ -1);
                if (param2 < param3) {
                  var7 = 0;
                  var8++;
                  continue L0;
                } else {
                  return -param1 + 1 + var8;
                }
              }
            }
          } else {
            return 2;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        CharSequence var3 = null;
        var2 = param0.getParameter("username");
        if (var2 != null) {
          var3 = (CharSequence) (Object) var2;
          if (-1L == (lg.a(var3, -1) ^ -1L)) {
            return;
          } else {
            L0: {
              if (param1 <= -101) {
                break L0;
              } else {
                ca.a(1);
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private ca() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Orb coins: <%0>";
        field_a = new int[][]{null, null, null, null, new int[2], new int[2], new int[2]};
    }
}
