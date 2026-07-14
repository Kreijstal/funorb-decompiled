/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class tg {
    static int[] field_a;
    static volatile int field_b;

    final static boolean a(byte param0) {
        if (param0 != 49) {
            boolean discarded$0 = tg.a((byte) -3);
            return mc.field_c.a(-26);
        }
        return mc.field_c.a(-26);
    }

    public static void b(byte param0) {
        if (param0 != 0) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static java.net.URL a(java.net.URL param0, int param1, String param2, String param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_46_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_45_0 = null;
            var9 = stellarshard.field_B;
            var5 = param0.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 > var7_int) {
                    break L1;
                  } else {
                    if (param1 >= 0) {
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
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 <= var7_int) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L3;
                } else {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int ^ -1) <= -1) {
                    if (param2 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L3;
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
                if (-1 >= (var7_int ^ -1)) {
                  if (param3 != null) {
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
                if (param4 == 30403) {
                  break L6;
                } else {
                  field_b = -126;
                  break L6;
                }
              }
              L7: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$13 = var7.append(var5.substring(0, var6));
                if (-1 <= (param1 ^ -1)) {
                  break L7;
                } else {
                  StringBuilder discarded$14 = var7.append("/l=");
                  StringBuilder discarded$15 = var7.append(Integer.toString(param1));
                  break L7;
                }
              }
              L8: {
                if (param2 != null) {
                  if (param2.length() < -1) {
                    StringBuilder discarded$16 = var7.append("/p=");
                    StringBuilder discarded$17 = var7.append(param2);
                    if (param3 == null) {
                      break L8;
                    } else {
                      if (-1 <= (param3.length() ^ -1)) {
                        break L8;
                      } else {
                        StringBuilder discarded$18 = var7.append("/s=");
                        StringBuilder discarded$19 = var7.append(param3);
                        break L8;
                      }
                    }
                  } else {
                    if (param3 == null) {
                      break L8;
                    } else {
                      if (-1 >= param3.length()) {
                        break L8;
                      } else {
                        StringBuilder discarded$20 = var7.append("/s=");
                        StringBuilder discarded$21 = var7.append(param3);
                        break L8;
                      }
                    }
                  }
                } else {
                  if (param3 == null) {
                    break L8;
                  } else {
                    if (-1 <= (param3.length() ^ -1)) {
                      break L8;
                    } else {
                      StringBuilder discarded$22 = var7.append("/s=");
                      StringBuilder discarded$23 = var7.append(param3);
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (var6 >= var5.length()) {
                  StringBuilder discarded$24 = var7.append(47);
                  break L9;
                } else {
                  StringBuilder discarded$25 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                }
              }
              try {
                stackOut_45_0 = new java.net.URL(param0, var7.toString());
                stackIn_46_0 = stackOut_45_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_46_0;
              }
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
        field_b = 0;
        field_a = new int[128];
    }
}
