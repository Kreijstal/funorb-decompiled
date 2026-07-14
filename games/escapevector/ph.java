/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    private int[] field_c;
    static fn field_b;
    static int field_a;

    final int a(byte[] param0, boolean param1, int param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        if (param4 == 0) {
          return 0;
        } else {
          var7 = 0;
          if (param1) {
            param4 = param4 + param2;
            var8 = param3;
            L0: while (true) {
              L1: {
                var9 = param5[var8];
                if (0 > var9) {
                  var7 = ((ph) this).field_c[var7];
                  break L1;
                } else {
                  var7++;
                  break L1;
                }
              }
              L2: {
                var10 = ((ph) this).field_c[var7];
                if (((ph) this).field_c[var7] >= 0) {
                  break L2;
                } else {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L2;
                  } else {
                    return -param3 + 1 + var8;
                  }
                }
              }
              L3: {
                if ((64 & var9) != 0) {
                  var7 = ((ph) this).field_c[var7];
                  break L3;
                } else {
                  var7++;
                  break L3;
                }
              }
              L4: {
                var10 = ((ph) this).field_c[var7];
                if (((ph) this).field_c[var7] < 0) {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L4;
                  } else {
                    return -param3 + 1 + var8;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (0 == (var9 & 32)) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((ph) this).field_c[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((ph) this).field_c[var7];
                if (0 > ((ph) this).field_c[var7]) {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L6;
                  } else {
                    return -param3 + 1 + var8;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if ((var9 & 16) == -1) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((ph) this).field_c[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((ph) this).field_c[var7];
                if (-1 <= ((ph) this).field_c[var7]) {
                  break L8;
                } else {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L8;
                  } else {
                    return -param3 + 1 + var8;
                  }
                }
              }
              L9: {
                if (-1 != (var9 & 8 ^ -1)) {
                  var7 = ((ph) this).field_c[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((ph) this).field_c[var7];
                if (((ph) this).field_c[var7] >= 0) {
                  break L10;
                } else {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L10;
                  } else {
                    return -param3 + 1 + var8;
                  }
                }
              }
              L11: {
                if ((var9 & 4) != -1) {
                  var7 = ((ph) this).field_c[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((ph) this).field_c[var7];
                if (-1 <= ((ph) this).field_c[var7]) {
                  break L12;
                } else {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L12;
                  } else {
                    return -param3 + 1 + var8;
                  }
                }
              }
              L13: {
                if (0 != (2 & var9)) {
                  var7 = ((ph) this).field_c[var7];
                  break L13;
                } else {
                  var7++;
                  break L13;
                }
              }
              L14: {
                var10 = ((ph) this).field_c[var7];
                if (-1 >= (((ph) this).field_c[var7] ^ -1)) {
                  break L14;
                } else {
                  param2++;
                  param0[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L14;
                  } else {
                    return -param3 + 1 + var8;
                  }
                }
              }
              L15: {
                if (-1 != (var9 & 1 ^ -1)) {
                  var7 = ((ph) this).field_c[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              var10 = ((ph) this).field_c[var7];
              if (((ph) this).field_c[var7] < 0) {
                param2++;
                param0[param2] = (byte)(var10 ^ -1);
                if (param4 > param2) {
                  var7 = 0;
                  var8++;
                  var8++;
                  continue L0;
                } else {
                  return -param3 + 1 + var8;
                }
              } else {
                var8++;
                var8++;
                continue L0;
              }
            }
          } else {
            return 81;
          }
        }
    }

    final static ed[] a(int param0, int param1, int param2, int param3) {
        if (param1 != 1) {
          ph.a((byte) 124);
          return ob.a(param2, param3, 1, 1, param0);
        } else {
          return ob.a(param2, param3, 1, 1, param0);
        }
    }

    private ph() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        if (param0 != 106) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fn(16, 6);
    }
}
