/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends gi {
    static String field_i;
    int field_j;
    static sb field_k;
    static he field_h;

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param0) {
          if (!param3) {
            L0: {
              field_i = null;
              if (param2) {
                var4 += 2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param1) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return kk.field_d[var4];
          } else {
            L2: {
              if (param2) {
                var4 += 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1) {
                var4++;
                break L3;
              } else {
                break L3;
              }
            }
            return kk.field_d[var4];
          }
        } else {
          var4 += 4;
          if (param3) {
            L4: {
              if (param2) {
                var4 += 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1) {
                var4++;
                break L5;
              } else {
                break L5;
              }
            }
            return kk.field_d[var4];
          } else {
            L6: {
              field_i = null;
              if (param2) {
                var4 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param1) {
                var4++;
                break L7;
              } else {
                break L7;
              }
            }
            return kk.field_d[var4];
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 != 0) {
          if ((param1 ^ -1) >= -1) {
            L0: {
              var2 = 2;
              if (-65536 <= param1) {
                break L0;
              } else {
                var2 += 16;
                param1 = param1 >> 16;
                break L0;
              }
            }
            L1: {
              if (-256 <= param1) {
                break L1;
              } else {
                param1 = param1 >> 8;
                var2 += 8;
                break L1;
              }
            }
            if (param0 < 3) {
              return -108;
            } else {
              L2: {
                if (-16 > param1) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 >= param1) {
                  break L3;
                } else {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L3;
                }
              }
              L4: {
                if (1 <= param1) {
                  break L4;
                } else {
                  param1 = param1 >> 1;
                  var2++;
                  break L4;
                }
              }
              return var2;
            }
          } else {
            L5: {
              var2 = 1;
              if (65535 >= param1) {
                break L5;
              } else {
                param1 = param1 >> 16;
                var2 += 16;
                break L5;
              }
            }
            L6: {
              if ((param1 ^ -1) >= -256) {
                break L6;
              } else {
                param1 = param1 >> 8;
                var2 += 8;
                break L6;
              }
            }
            L7: {
              if ((param1 ^ -1) >= -16) {
                break L7;
              } else {
                var2 += 4;
                param1 = param1 >> 4;
                break L7;
              }
            }
            L8: {
              if (3 < param1) {
                var2 += 2;
                param1 = param1 >> 2;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (-2 <= (param1 ^ -1)) {
                break L9;
              } else {
                param1 = param1 >> 1;
                var2++;
                break L9;
              }
            }
            return var2;
          }
        } else {
          return 0;
        }
    }

    public static void d(int param0) {
        if (param0 != 65535) {
          String discarded$2 = jl.a(false, true, false, false);
          field_k = null;
          field_i = null;
          field_h = null;
          return;
        } else {
          field_k = null;
          field_i = null;
          field_h = null;
          return;
        }
    }

    private jl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "(Including <%0>)";
    }
}
