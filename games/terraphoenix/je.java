/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static String field_b;
    static int[] field_a;

    final static String a(int param0, String param1, String param2, char param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = Terraphoenix.field_V;
        var4 = param2.length();
        var5 = param1.length();
        if (param0 >= 54) {
          var6 = var4;
          var7 = -1 + var5;
          if (0 != var7) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param2.indexOf((int) param3, var8_int);
              if (0 <= var8_int) {
                var8_int++;
                var6 = var6 + var7;
                continue L0;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L1: while (true) {
                  var10 = param2.indexOf((int) param3, var9);
                  if (-1 >= (var10 ^ -1)) {
                    StringBuilder discarded$13 = var13.append(param2.substring(var9, var10));
                    StringBuilder discarded$14 = var13.append(param1);
                    var9 = 1 + var10;
                    continue L1;
                  } else {
                    StringBuilder discarded$15 = var13.append(param2.substring(var9));
                    return var13.toString();
                  }
                }
              }
            }
          } else {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param2.indexOf((int) param3, var9);
              if (-1 >= (var10 ^ -1)) {
                StringBuilder discarded$16 = var12.append(param2.substring(var9, var10));
                StringBuilder discarded$17 = var12.append(param1);
                var9 = 1 + var10;
                continue L2;
              } else {
                StringBuilder discarded$18 = var12.append(param2.substring(var9));
                return var12.toString();
              }
            }
          }
        } else {
          int discarded$19 = je.a(-16, 65);
          var6 = var4;
          var7 = -1 + var5;
          if (0 != var7) {
            var8_int = 0;
            L3: while (true) {
              var8_int = param2.indexOf((int) param3, var8_int);
              if (0 <= var8_int) {
                var8_int++;
                var6 = var6 + var7;
                continue L3;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L4: while (true) {
                  var10 = param2.indexOf((int) param3, var9);
                  if (-1 >= (var10 ^ -1)) {
                    StringBuilder discarded$20 = var8.append(param2.substring(var9, var10));
                    StringBuilder discarded$21 = var8.append(param1);
                    var9 = 1 + var10;
                    continue L4;
                  } else {
                    StringBuilder discarded$22 = var8.append(param2.substring(var9));
                    return var8.toString();
                  }
                }
              }
            }
          } else {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              var10 = param2.indexOf((int) param3, var9);
              if (-1 >= (var10 ^ -1)) {
                StringBuilder discarded$23 = var8.append(param2.substring(var9, var10));
                StringBuilder discarded$24 = var8.append(param1);
                var9 = 1 + var10;
                continue L5;
              } else {
                StringBuilder discarded$25 = var8.append(param2.substring(var9));
                return var8.toString();
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 <= -63) {
          var2 = 0;
          if (0 <= param1) {
            if ((param1 ^ -1) <= -65537) {
              L0: {
                param1 = param1 >>> 16;
                var2 += 16;
                if (256 <= param1) {
                  var2 += 8;
                  param1 = param1 >>> 8;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if ((param1 ^ -1) > -17) {
                  break L1;
                } else {
                  param1 = param1 >>> 4;
                  var2 += 4;
                  break L1;
                }
              }
              L2: {
                if ((param1 ^ -1) > -5) {
                  break L2;
                } else {
                  param1 = param1 >>> 2;
                  var2 += 2;
                  break L2;
                }
              }
              L3: {
                if (param1 >= 1) {
                  var2++;
                  param1 = param1 >>> 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              return param1 + var2;
            } else {
              L4: {
                if (256 <= param1) {
                  var2 += 8;
                  param1 = param1 >>> 8;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if ((param1 ^ -1) > -17) {
                  break L5;
                } else {
                  param1 = param1 >>> 4;
                  var2 += 4;
                  break L5;
                }
              }
              L6: {
                if ((param1 ^ -1) > -5) {
                  break L6;
                } else {
                  param1 = param1 >>> 2;
                  var2 += 2;
                  break L6;
                }
              }
              L7: {
                if (param1 >= 1) {
                  var2++;
                  param1 = param1 >>> 1;
                  break L7;
                } else {
                  break L7;
                }
              }
              return param1 + var2;
            }
          } else {
            L8: {
              param1 = param1 >>> 16;
              var2 += 16;
              if (256 <= param1) {
                var2 += 8;
                param1 = param1 >>> 8;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((param1 ^ -1) > -17) {
                break L9;
              } else {
                param1 = param1 >>> 4;
                var2 += 4;
                break L9;
              }
            }
            L10: {
              if ((param1 ^ -1) > -5) {
                break L10;
              } else {
                param1 = param1 >>> 2;
                var2 += 2;
                break L10;
              }
            }
            L11: {
              if (param1 >= 1) {
                var2++;
                param1 = param1 >>> 1;
                break L11;
              } else {
                break L11;
              }
            }
            return param1 + var2;
          }
        } else {
          return -121;
        }
    }

    final static fh a(int param0) {
        if (df.field_K != null) {
          if (param0 != 5) {
            field_a = null;
            return df.field_K;
          } else {
            return df.field_K;
          }
        } else {
          df.field_K = new fh();
          df.field_K.a(qk.field_e, (byte) -106);
          df.field_K.field_b = ra.field_l;
          df.field_K.field_u = 2763306;
          df.field_K.field_k = 4;
          df.field_K.field_v = 6;
          df.field_K.field_r = 7697781;
          df.field_K.field_p = 14;
          df.field_K.field_o = 5;
          df.field_K.field_m = 0;
          if (param0 == 5) {
            return df.field_K;
          } else {
            field_a = null;
            return df.field_K;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -110) {
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
        field_b = "Abort mission";
    }
}
