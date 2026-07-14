/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class bi extends ai {
    static String[] field_l;
    static tg field_j;
    static String field_i;
    static int field_g;
    static int field_h;
    static String field_k;

    private bi() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_l = null;
        field_j = null;
        field_i = null;
        if (param0) {
            field_j = null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              Object discarded$1 = ac.a(true, new Object[1], vi.b(param0 ^ param0), "resizing");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL a(java.net.URL param0, byte param1, int param2, String param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_45_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_44_0 = null;
            var9 = Bounce.field_N;
            var5 = param0.getFile();
            var6 = 0;
            if (param1 < -6) {
              L0: while (true) {
                L1: {
                  if (var5.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if (0 > var7_int) {
                      break L1;
                    } else {
                      if ((param2 ^ -1) <= -1) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                    break L2;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L3: {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (-1 < (var7_int ^ -1)) {
                      break L3;
                    } else {
                      if (param3 == null) {
                        var6 = var7_int;
                        continue L0;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (0 <= var7_int) {
                    if (param4 != null) {
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
                  StringBuilder discarded$13 = var7.append(var5.substring(0, var6));
                  if (0 < param2) {
                    StringBuilder discarded$14 = var7.append("/l=");
                    StringBuilder discarded$15 = var7.append(Integer.toString(param2));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param3 != null) {
                    if (-1 > (param3.length() ^ -1)) {
                      StringBuilder discarded$16 = var7.append("/p=");
                      StringBuilder discarded$17 = var7.append(param3);
                      if (param4 == null) {
                        break L7;
                      } else {
                        if (param4.length() <= 0) {
                          break L7;
                        } else {
                          StringBuilder discarded$18 = var7.append("/s=");
                          StringBuilder discarded$19 = var7.append(param4);
                          break L7;
                        }
                      }
                    } else {
                      if (param4 == null) {
                        break L7;
                      } else {
                        if (param4.length() <= 0) {
                          break L7;
                        } else {
                          StringBuilder discarded$20 = var7.append("/s=");
                          StringBuilder discarded$21 = var7.append(param4);
                          break L7;
                        }
                      }
                    }
                  } else {
                    if (param4 == null) {
                      break L7;
                    } else {
                      if (param4.length() <= 0) {
                        break L7;
                      } else {
                        StringBuilder discarded$22 = var7.append("/s=");
                        StringBuilder discarded$23 = var7.append(param4);
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  if (var6 < var5.length()) {
                    StringBuilder discarded$24 = var7.append(var5.substring(var6, var5.length()));
                    break L8;
                  } else {
                    StringBuilder discarded$25 = var7.append(47);
                    break L8;
                  }
                }
                try {
                  stackOut_44_0 = new java.net.URL(param0, var7.toString());
                  stackIn_45_0 = stackOut_44_0;
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  return param0;
                }
                return stackIn_45_0;
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new tg(540, 140);
        field_k = "Log in";
        field_i = "Just play";
    }
}
