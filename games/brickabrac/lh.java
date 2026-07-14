/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lh extends km {
    static String field_r;
    static String field_t;
    static tg field_s;

    lh(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void f(byte param0) {
        field_t = null;
        if (param0 >= -64) {
            mh discarded$0 = lh.f(72);
            field_s = null;
            field_r = null;
            return;
        }
        field_s = null;
        field_r = null;
    }

    final void g(int param0) {
        q var2 = null;
        q var4 = null;
        q var5 = null;
        var2 = ((lh) this).field_m[0];
        if (param0 <= 34) {
          field_t = null;
          var4 = ((lh) this).field_m[((lh) this).field_h.field_r + -1];
          im.a(30 + (-((lh) this).field_j + ((lh) this).field_l), 0, -var2.field_a + var4.field_d + (var4.field_a + 30), 0, -15 + var2.field_a, (byte) -88, -15 + ((lh) this).field_j);
          return;
        } else {
          var5 = ((lh) this).field_m[((lh) this).field_h.field_r + -1];
          im.a(30 + (-((lh) this).field_j + ((lh) this).field_l), 0, -var2.field_a + var5.field_d + (var5.field_a + 30), 0, -15 + var2.field_a, (byte) -88, -15 + ((lh) this).field_j);
          return;
        }
    }

    final static mh f(int param0) {
        if (param0 <= 94) {
            field_t = null;
            return f.field_c.field_Xb;
        }
        return f.field_c.field_Xb;
    }

    final static java.net.URL a(String param0, byte param1, String param2, int param3, java.net.URL param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_40_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0;
            L0: {
              var9 = BrickABrac.field_J ? 1 : 0;
              var5 = param4.getFile();
              var6 = 0;
              if (param1 == 60) {
                break L0;
              } else {
                lh.f((byte) 78);
                break L0;
              }
            }
            L1: while (true) {
              L2: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (var7_int < 0) {
                    break L2;
                  } else {
                    if (0 <= param3) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L1;
                    } else {
                      var6 = var7_int;
                      continue L1;
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
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int < 0) {
                    break L3;
                  } else {
                    var6 = var7_int;
                    continue L1;
                  }
                }
              }
              L4: {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (0 <= var7_int) {
                    if (param0 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L1;
                    } else {
                      var6 = var7_int;
                      continue L1;
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
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                var7_int = var5.indexOf('/', 1 + var6);
                if ((var7_int ^ -1) <= -1) {
                  if (param2 == null) {
                    var6 = var7_int;
                    continue L1;
                  } else {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L1;
                  }
                } else {
                  break L5;
                }
              }
              L7: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (0 < param3) {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param0 == null) {
                  break L8;
                } else {
                  if (-1 <= param0.length()) {
                    break L8;
                  } else {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param0);
                    break L8;
                  }
                }
              }
              L9: {
                if (param2 == null) {
                  break L9;
                } else {
                  if (-1 < param2.length()) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param2);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (var6 >= var5.length()) {
                  StringBuilder discarded$16 = var7.append(47);
                  break L10;
                } else {
                  StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                  break L10;
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

    int b(int param0, int param1) {
        int var3 = super.b(param0, param1);
        if (param0 == -1 + ((lh) this).field_h.field_r) {
            var3 = var3 + ((lh) this).field_q / 2;
        }
        return var3;
    }

    final static int g(byte param0) {
        if (param0 != -44) {
            return 92;
        }
        return ki.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Account created successfully!";
        field_t = "Level <%0>";
    }
}
