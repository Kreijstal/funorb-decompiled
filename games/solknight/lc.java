/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends gg {
    int field_o;
    static jh field_m;
    int field_q;
    static String field_l;
    int field_i;
    int field_n;
    static int field_h;
    static gb field_k;
    static volatile long field_s;
    int field_j;
    static nc field_t;
    static boolean field_u;
    static int field_p;
    int field_r;

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (param1.length() > var2) {
            var3 = param1.charAt(var2);
            if (ec.a((char) var3, false)) {
              var2++;
              var2++;
              var2++;
              continue L0;
            } else {
              if (!gh.a((char) var3, (byte) -124)) {
                return true;
              } else {
                var2++;
                var2++;
                continue L0;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
            field_s = -117L;
            return og.field_b;
        }
        return og.field_b;
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 >= -44) {
          var2 = null;
          hd discarded$2 = lc.a((da) null, 54, (String) null, (String) null, (da) null);
          field_t = null;
          field_l = null;
          field_k = null;
          field_m = null;
          return;
        } else {
          field_t = null;
          field_l = null;
          field_k = null;
          field_m = null;
          return;
        }
    }

    final static hd a(da param0, int param1, String param2, String param3, da param4) {
        int var5 = 0;
        int var6 = 0;
        if (param1 != 1) {
          lc.a(113);
          var5 = param0.c(74, param3);
          var6 = param0.a(param2, -1, var5);
          return sk.a((byte) -105, param0, var6, var5, param4);
        } else {
          var5 = param0.c(74, param3);
          var6 = param0.a(param2, -1, var5);
          return sk.a((byte) -105, param0, var6, var5, param4);
        }
    }

    final static void a(int param0, int param1, String param2, le param3, mg param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        var5 = 0;
        var6 = -1;
        if (param0 >= 110) {
          var7 = 1;
          if (param2.length() > var7) {
            L0: {
              var8 = param2.charAt(var7);
              if (60 != var8) {
                break L0;
              } else {
                var6 = param3.field_c[0] + (var5 >> 736013096) - -param4.b(param2.substring(0, var7));
                break L0;
              }
            }
            if (var6 == -1) {
              L1: {
                if (32 != var8) {
                  break L1;
                } else {
                  var5 = var5 + param1;
                  break L1;
                }
              }
              L2: {
                param3.field_c[var7] = (var5 >> 614037416) + param3.field_c[0] - (-param4.b(param2.substring(0, 1 + var7)) + param4.a((char) var8));
                if (var8 != 62) {
                  var7++;
                  break L2;
                } else {
                  var6 = -1;
                  var7++;
                  break L2;
                }
              }
              var7++;
              var7++;
              return;
            } else {
              L3: {
                param3.field_c[var7] = var6;
                if (var8 != 62) {
                  var7++;
                  break L3;
                } else {
                  var6 = -1;
                  var7++;
                  break L3;
                }
              }
              var7++;
              var7++;
              return;
            }
          } else {
            return;
          }
        } else {
          field_u = true;
          var7 = 1;
          L4: while (true) {
            if (param2.length() <= var7) {
              return;
            } else {
              L5: {
                var8 = param2.charAt(var7);
                if (60 != var8) {
                  break L5;
                } else {
                  var6 = param3.field_c[0] + (var5 >> 736013096) - -param4.b(param2.substring(0, var7));
                  break L5;
                }
              }
              L6: {
                if (var6 != -1) {
                  param3.field_c[var7] = var6;
                  break L6;
                } else {
                  L7: {
                    if (32 != var8) {
                      break L7;
                    } else {
                      var5 = var5 + param1;
                      break L7;
                    }
                  }
                  param3.field_c[var7] = (var5 >> 614037416) + param3.field_c[0] - (-param4.b(param2.substring(0, 1 + var7)) + param4.a((char) var8));
                  break L6;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                var7++;
                continue L4;
              } else {
                var7++;
                var7++;
                continue L4;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, hi param3) {
        fh.field_b = param1;
        if (param0 != 5292) {
            return;
        }
        he.field_c = param3;
        pg.field_b = param2;
    }

    final static void a(int param0, long param1) {
        InterruptedException interruptedException = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            Thread.sleep(param1);
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L1;
          }
        }
        if (param0 != 2767) {
          var4 = null;
          lc.a(14, 1, (String) null, (le) null, (mg) null);
          return;
        } else {
          return;
        }
    }

    private lc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0L;
        field_h = 2621440;
        field_t = new nc();
    }
}
