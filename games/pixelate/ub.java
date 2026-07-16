/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class ub {
    static int field_a;

    final static String a(String param0, int param1, String param2, char param3) {
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
        var11 = Pixelate.field_H ? 1 : 0;
        var4 = param0.length();
        var5 = param2.length();
        var6 = var4;
        var7 = -1 + var5;
        if (0 != var7) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param0.indexOf((int) param3, var8_int);
            if ((var8_int ^ -1) <= -1) {
              var8_int++;
              var6 = var6 + var7;
              continue L0;
            } else {
              var13 = new StringBuilder(var6);
              var8 = var13;
              var9 = param1;
              L1: while (true) {
                var10 = param0.indexOf((int) param3, var9);
                if (0 > var10) {
                  StringBuilder discarded$6 = var13.append(param0.substring(var9));
                  return var13.toString();
                } else {
                  StringBuilder discarded$7 = var13.append(param0.substring(var9, var10));
                  StringBuilder discarded$8 = var13.append(param2);
                  var9 = var10 - -1;
                  continue L1;
                }
              }
            }
          }
        } else {
          var12 = new StringBuilder(var6);
          var9 = param1;
          L2: while (true) {
            var10 = param0.indexOf((int) param3, var9);
            if (0 > var10) {
              StringBuilder discarded$9 = var12.append(param0.substring(var9));
              return var12.toString();
            } else {
              StringBuilder discarded$10 = var12.append(param0.substring(var9, var10));
              StringBuilder discarded$11 = var12.append(param2);
              var9 = var10 - -1;
              continue L2;
            }
          }
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, String param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_44_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            var9 = Pixelate.field_H ? 1 : 0;
            var5 = param1.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (var7_int >= 0) {
                    if (0 <= param4) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                  break L2;
                } else {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (0 <= var7_int) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (-1 >= (var7_int ^ -1)) {
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
                } else {
                  break L3;
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
                if (param0 <= -40) {
                  break L6;
                } else {
                  field_a = -31;
                  break L6;
                }
              }
              L7: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (param4 <= 0) {
                  break L7;
                } else {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param4));
                  break L7;
                }
              }
              L8: {
                if (param2 == null) {
                  if (param3 == null) {
                    break L8;
                  } else {
                    if ((param3.length() ^ -1) >= -1) {
                      break L8;
                    } else {
                      StringBuilder discarded$12 = var7.append("/s=");
                      StringBuilder discarded$13 = var7.append(param3);
                      break L8;
                    }
                  }
                } else {
                  if (param3 == null) {
                    break L8;
                  } else {
                    if ((param3.length() ^ -1) >= -1) {
                      break L8;
                    } else {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param3);
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (var5.length() > var6) {
                  StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                } else {
                  StringBuilder discarded$17 = var7.append(47);
                  break L9;
                }
              }
              try {
                L10: {
                  stackOut_43_0 = new java.net.URL(param1, var7.toString());
                  stackIn_44_0 = stackOut_43_0;
                  break L10;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8 = (Exception) (Object) decompiledCaughtException;
                var8.printStackTrace();
                return param1;
              }
              return stackIn_44_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
