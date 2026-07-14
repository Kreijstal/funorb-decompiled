/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class mj extends pi {
    static int[] field_n;
    static fj field_o;
    int field_r;
    static int field_p;
    int field_q;

    final static void a(boolean param0, bj param1, int param2, bj param3, bj param4) {
        wm.field_f = al.a(-10218, "");
        if (param2 < 34) {
          return;
        } else {
          wm.field_f.a(false, false);
          jf.a(param1, param3, (byte) 18, param4);
          im.a((byte) 79);
          bd.field_h = mc.field_t;
          ic.field_l = mc.field_t;
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 > -96) {
            return;
        }
        field_o = null;
        field_n = null;
    }

    final static java.net.URL a(String param0, int param1, boolean param2, String param3, java.net.URL param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_43_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_42_0 = null;
            var9 = MinerDisturbance.field_ab;
            var5 = param4.getFile();
            var6 = 0;
            if (!param2) {
              L0: while (true) {
                L1: {
                  L2: {
                    if (var5.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (0 > var7_int) {
                        break L2;
                      } else {
                        if (-1 < (param1 ^ -1)) {
                          break L1;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L0;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                      break L3;
                    } else {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5.regionMatches(var6, "/p=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
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
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (var5.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param0 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                    if (param1 <= 0) {
                      break L7;
                    } else {
                      StringBuilder discarded$10 = var7.append("/l=");
                      StringBuilder discarded$11 = var7.append(Integer.toString(param1));
                      break L7;
                    }
                  }
                  L8: {
                    if (param3 == null) {
                      break L8;
                    } else {
                      if ((param3.length() ^ -1) < -1) {
                        StringBuilder discarded$12 = var7.append("/p=");
                        StringBuilder discarded$13 = var7.append(param3);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (param0 == null) {
                      break L9;
                    } else {
                      if ((param0.length() ^ -1) < -1) {
                        StringBuilder discarded$14 = var7.append("/s=");
                        StringBuilder discarded$15 = var7.append(param0);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var6 < var5.length()) {
                      StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                      break L10;
                    } else {
                      StringBuilder discarded$17 = var7.append(47);
                      break L10;
                    }
                  }
                  try {
                    stackOut_42_0 = new java.net.URL(param4, var7.toString());
                    stackIn_43_0 = stackOut_42_0;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return stackIn_43_0;
                  }
                }
                var6 = var7_int;
                continue L0;
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

    private mj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
    }
}
