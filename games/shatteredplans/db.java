/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static int field_f;
    static bi field_a;
    static boolean field_b;
    private df field_e;
    static String field_d;
    private df field_c;

    final int c(byte param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        df var3 = ((db) this).field_e.field_h;
        int var4 = -48 / ((param0 - -34) / 39);
        while (var3 != ((db) this).field_e) {
            var2++;
            var3 = var3.field_h;
        }
        return var2;
    }

    public static void d(int param0) {
        if (param0 != 31992) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static int a(int param0, int param1) {
        if (param0 <= 26) {
            field_d = null;
        }
        int var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return param1 & ~var2;
    }

    final df b(int param0) {
        df var2 = ((db) this).field_c;
        if (param0 != 32) {
            return null;
        }
        if (!(var2 != ((db) this).field_e)) {
            ((db) this).field_c = null;
            return null;
        }
        ((db) this).field_c = var2.field_h;
        return var2;
    }

    final void b(byte param0) {
        df var2 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        while (true) {
            var2 = ((db) this).field_e.field_h;
            if (var2 == ((db) this).field_e) {
                break;
            }
            var2.a(16);
        }
        ((db) this).field_c = null;
        if (param0 < 23) {
            field_f = -54;
        }
    }

    final df a(int param0) {
        df var2 = ((db) this).field_e.field_h;
        if (((db) this).field_e == var2) {
            return null;
        }
        var2.a(16);
        int var3 = 32 / ((49 - param0) / 38);
        return var2;
    }

    final boolean a(byte param0) {
        if (param0 != 25) {
            return true;
        }
        return ((db) this).field_e.field_h == ((db) this).field_e ? true : false;
    }

    final void a(df param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_j) {
                param0.a(16);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_h = ((db) this).field_e;
              param0.field_j = ((db) this).field_e.field_j;
              param0.field_j.field_h = param0;
              param0.field_h.field_j = param0;
              if (param1 == 32) {
                break L2;
              } else {
                ((db) this).field_e = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("db.J(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final df c(int param0) {
        df var2 = ((db) this).field_e.field_h;
        if (!(((db) this).field_e != var2)) {
            ((db) this).field_c = null;
            return null;
        }
        ((db) this).field_c = var2.field_h;
        if (param0 >= -126) {
            Object var3 = null;
            int discarded$0 = db.a(95, (nq) null, (String) null, (String[]) null, 64);
        }
        return var2;
    }

    final static int a(int param0, nq param1, String param2, String[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1.c(param2);
              if (param4 == 3) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              if (var5_int > param0) {
                break L2;
              } else {
                if (-1 == param2.indexOf("<br>")) {
                  param3[0] = (String) (Object) param3;
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L2;
                }
              }
            }
            var6 = (-1 + param0 + var5_int) / param0;
            param0 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param2.length();
            var9 = 0;
            L3: while (true) {
              if (var9 >= var8) {
                L4: {
                  if (var7 < var8) {
                    int incrementValue$2 = var6;
                    var6++;
                    param3[incrementValue$2] = param2.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_22_0 = var6;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param2.charAt(var9);
                    if (32 == var10) {
                      break L6;
                    } else {
                      if (45 == var10) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param2.substring(var7, 1 + var9).trim();
                  var12 = param1.c(var11);
                  if (var12 >= param0) {
                    var7 = 1 + var9;
                    int incrementValue$3 = var6;
                    var6++;
                    param3[incrementValue$3] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (var10 != 62) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("db.D(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param4 + ')');
        }
        return stackIn_23_0;
    }

    public db() {
        ((db) this).field_e = new df();
        ((db) this).field_e.field_h = ((db) this).field_e;
        ((db) this).field_e.field_j = ((db) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "C: Hide Chat";
    }
}
