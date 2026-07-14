/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    long field_c;
    static String field_a;
    static int field_d;
    static boolean[] field_f;
    private jc field_e;
    static ia field_g;
    static String field_b;

    final static java.net.URL a(java.net.URL param0, String param1, String param2, int param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            int var8 = 0;
            Exception var9 = null;
            java.net.URL stackIn_41_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_40_0 = null;
            var5 = param0.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 > var7_int) {
                    break L1;
                  } else {
                    if (param4 < 0) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    }
                  }
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int < 0) {
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
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int ^ -1) > -1) {
                    break L3;
                  } else {
                    if (param1 != null) {
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
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 - -1);
                if ((var7_int ^ -1) <= -1) {
                  if (param2 != null) {
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
                var8 = -76 % ((param3 - 88) / 32);
                StringBuilder discarded$13 = var7.append(var5.substring(0, var6));
                if (-1 <= (param4 ^ -1)) {
                  break L6;
                } else {
                  StringBuilder discarded$14 = var7.append("/l=");
                  StringBuilder discarded$15 = var7.append(Integer.toString(param4));
                  break L6;
                }
              }
              L7: {
                if (param1 != null) {
                  if (param1.length() < -1) {
                    StringBuilder discarded$16 = var7.append("/p=");
                    StringBuilder discarded$17 = var7.append(param1);
                    if (param2 == null) {
                      break L7;
                    } else {
                      if (-1 <= (param2.length() ^ -1)) {
                        break L7;
                      } else {
                        StringBuilder discarded$18 = var7.append("/s=");
                        StringBuilder discarded$19 = var7.append(param2);
                        break L7;
                      }
                    }
                  } else {
                    if (param2 == null) {
                      break L7;
                    } else {
                      if (-1 >= param2.length()) {
                        break L7;
                      } else {
                        StringBuilder discarded$20 = var7.append("/s=");
                        StringBuilder discarded$21 = var7.append(param2);
                        break L7;
                      }
                    }
                  }
                } else {
                  if (param2 == null) {
                    break L7;
                  } else {
                    if (-1 <= (param2.length() ^ -1)) {
                      break L7;
                    } else {
                      StringBuilder discarded$22 = var7.append("/s=");
                      StringBuilder discarded$23 = var7.append(param2);
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (var5.length() <= var6) {
                  StringBuilder discarded$24 = var7.append(47);
                  break L8;
                } else {
                  StringBuilder discarded$25 = var7.append(var5.substring(var6, var5.length()));
                  break L8;
                }
              }
              try {
                stackOut_40_0 = new java.net.URL(param0, var7.toString());
                stackIn_41_0 = stackOut_40_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return (java.net.URL) (Object) stackIn_41_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 1) {
            return;
        }
        field_b = null;
        field_g = null;
        field_a = null;
    }

    protected final void finalize() throws Throwable {
        ((vj) this).field_e.a(-25160, ((vj) this).field_c);
        this.finalize();
    }

    vj(jc param0, long param1, int param2) {
        ((vj) this).field_c = param1;
        ((vj) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = "Player";
        field_f = new boolean[8];
        field_g = new ia();
        field_b = "Password: ";
    }
}
