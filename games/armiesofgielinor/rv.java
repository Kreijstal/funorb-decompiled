/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv {
    static String field_a;
    static int[] field_b;

    final static java.net.URL a(String param0, String param1, int param2, int param3, java.net.URL param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_40_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0 = null;
            var9 = ArmiesOfGielinor.field_M ? 1 : 0;
            var5 = param4.getFile();
            var6 = param2;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (-1 >= (var7_int ^ -1)) {
                    if (0 > param3) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 > var7_int) {
                    break L2;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L3;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 > var7_int) {
                    break L3;
                  } else {
                    if (param0 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var7_int = var5.indexOf('/', 1 + var6);
                if (var7_int >= 0) {
                  if (param1 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if ((param3 ^ -1) < -1) {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param0 == null) {
                  break L7;
                } else {
                  if (param0.length() <= 0) {
                    break L7;
                  } else {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param0);
                    break L7;
                  }
                }
              }
              L8: {
                if (param1 == null) {
                  break L8;
                } else {
                  if (param1.length() > 0) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param1);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (var6 >= var5.length()) {
                  StringBuilder discarded$16 = var7.append(47);
                  break L9;
                } else {
                  StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                }
              }
              try {
                stackOut_39_0 = new java.net.URL(param4, var7.toString());
                stackIn_40_0 = stackOut_39_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return (java.net.URL) (Object) stackIn_40_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4_int = 0;
        vb var4 = null;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          if (gs.field_a) {
            L2: {
              if (null == ro.field_lb) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= ro.field_lb.length) {
                    break L2;
                  } else {
                    if (param3 == ro.field_lb[var4_int]) {
                      hh.field_d.d(param2, param1, 80, 40, (int)(64.0 * Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) + 128.0));
                      var4_int++;
                      continue L3;
                    } else {
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            vv.a(param2, -96, false, param3, us.a(param3, (byte) 87), param1);
            var4 = (vb) (Object) jf.field_C.field_pc.e((byte) 125);
            L4: while (true) {
              if (var4 == null) {
                break L1;
              } else {
                L5: {
                  if (param3 != var4.field_x) {
                    break L5;
                  } else {
                    var4.a(ug.field_b, 31785, true);
                    break L5;
                  }
                }
                var4 = (vb) (Object) jf.field_C.field_pc.a((byte) 123);
                continue L4;
              }
            }
          } else {
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "FROM ONLY";
    }
}
