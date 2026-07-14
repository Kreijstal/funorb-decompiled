/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static String field_b;
    private int[] field_a;
    static la field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 < 42) {
            qa.a(101);
        }
    }

    final static void b(int param0) {
        wb.field_g = null;
        af.field_a = null;
        if (param0 != 0) {
            qa.b(-30);
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        if ((param0 ^ -1) != param1) {
          var7 = 0;
          param0 = param0 + param3;
          var8 = param4;
          L0: while (true) {
            L1: {
              var9 = param2[var8];
              if (-1 < var9) {
                var7 = ((qa) this).field_a[var7];
                break L1;
              } else {
                var7++;
                break L1;
              }
            }
            L2: {
              var10 = ((qa) this).field_a[var7];
              if (-1 > ((qa) this).field_a[var7]) {
                param3++;
                param5[param3] = (byte)(var10 ^ -1);
                if (param3 < param0) {
                  var7 = 0;
                  break L2;
                } else {
                  return var8 - (-1 + param4);
                }
              } else {
                break L2;
              }
            }
            L3: {
              if ((var9 & 64) == -1) {
                var7++;
                break L3;
              } else {
                var7 = ((qa) this).field_a[var7];
                break L3;
              }
            }
            L4: {
              var10 = ((qa) this).field_a[var7];
              if (-1 > ((qa) this).field_a[var7]) {
                param3++;
                param5[param3] = (byte)(var10 ^ -1);
                if (param0 > param3) {
                  var7 = 0;
                  break L4;
                } else {
                  return var8 - (-1 + param4);
                }
              } else {
                break L4;
              }
            }
            L5: {
              if ((var9 & 32) == 0) {
                var7++;
                break L5;
              } else {
                var7 = ((qa) this).field_a[var7];
                break L5;
              }
            }
            L6: {
              var10 = ((qa) this).field_a[var7];
              if (((qa) this).field_a[var7] >= 0) {
                break L6;
              } else {
                param3++;
                param5[param3] = (byte)(var10 ^ -1);
                if (param3 < param0) {
                  var7 = 0;
                  break L6;
                } else {
                  return var8 - (-1 + param4);
                }
              }
            }
            L7: {
              if ((var9 & 16) != 0) {
                var7 = ((qa) this).field_a[var7];
                break L7;
              } else {
                var7++;
                break L7;
              }
            }
            L8: {
              var10 = ((qa) this).field_a[var7];
              if (((qa) this).field_a[var7] < 0) {
                param3++;
                param5[param3] = (byte)var10;
                if (param3 < param0) {
                  var7 = 0;
                  break L8;
                } else {
                  return var8 - (-1 + param4);
                }
              } else {
                break L8;
              }
            }
            L9: {
              if (-1 != (var9 & 8)) {
                var7 = ((qa) this).field_a[var7];
                break L9;
              } else {
                var7++;
                break L9;
              }
            }
            L10: {
              var10 = ((qa) this).field_a[var7];
              if (-1 >= (((qa) this).field_a[var7] ^ -1)) {
                break L10;
              } else {
                param3++;
                param5[param3] = (byte)(var10 ^ -1);
                if (param0 > param3) {
                  var7 = 0;
                  break L10;
                } else {
                  return var8 - (-1 + param4);
                }
              }
            }
            L11: {
              if ((var9 & 4) != 0) {
                var7 = ((qa) this).field_a[var7];
                break L11;
              } else {
                var7++;
                break L11;
              }
            }
            L12: {
              var10 = ((qa) this).field_a[var7];
              if (((qa) this).field_a[var7] >= 0) {
                break L12;
              } else {
                param3++;
                param5[param3] = (byte)(var10 ^ -1);
                if (param0 > param3) {
                  var7 = 0;
                  break L12;
                } else {
                  return var8 - (-1 + param4);
                }
              }
            }
            L13: {
              if (0 == (var9 & 2)) {
                var7++;
                break L13;
              } else {
                var7 = ((qa) this).field_a[var7];
                break L13;
              }
            }
            L14: {
              var10 = ((qa) this).field_a[var7];
              if (-1 < (((qa) this).field_a[var7] ^ -1)) {
                param3++;
                param5[param3] = (byte)var10;
                if (param0 > param3) {
                  var7 = 0;
                  break L14;
                } else {
                  return var8 - (-1 + param4);
                }
              } else {
                break L14;
              }
            }
            L15: {
              if (-1 != (var9 & 1)) {
                var7 = ((qa) this).field_a[var7];
                break L15;
              } else {
                var7++;
                break L15;
              }
            }
            var10 = ((qa) this).field_a[var7];
            if (((qa) this).field_a[var7] < 0) {
              param3++;
              param5[param3] = (byte)(var10 ^ -1);
              if (param3 >= param0) {
                return var8 - (-1 + param4);
              } else {
                var7 = 0;
                var8++;
                continue L0;
              }
            } else {
              var8++;
              continue L0;
            }
          }
        } else {
          return 0;
        }
    }

    private qa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unpacking animations";
    }
}
