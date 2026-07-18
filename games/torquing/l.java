/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static String field_b;
    static String field_c;
    static String field_a;
    static byte[][][] field_d;

    final static void a(int param0, qp param1, int param2) {
        df var5 = null;
        int var4 = 0;
        try {
            var5 = wa.field_d;
            var5.f(param2 ^ 117, param0);
            var5.field_n = var5.field_n + 1;
            var4 = var5.field_n;
            var5.b(90, param2);
            var5.b(90, param1.field_p);
            var5.b(90, param1.field_m);
            var5.b((byte) 60, param1.field_l);
            var5.b((byte) 60, param1.field_k);
            var5.b((byte) 60, param1.field_q);
            var5.b((byte) 60, param1.field_n);
            int discarded$0 = var5.a(var4, true);
            var5.c((byte) 48, var5.field_n + -var4);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "l.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static tl a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6 = 0;
        if (param2 == 0) {
            var6 = param1;
            if (1 == var6) {
                param2 = 1000;
            }
        }
        return new tl(param0, param5, param4, param1, param2);
    }

    public static void a() {
        field_d = null;
        int var1 = 0;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        fj var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new fj(param1);
              var3 = var9.i((byte) -101);
              var4 = var9.c((byte) -102);
              if (0 > var4) {
                break L1;
              } else {
                L2: {
                  if (0 == ee.field_v) {
                    break L2;
                  } else {
                    if (var4 <= ee.field_v) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (0 == var3) {
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5 = var11;
                  var9.a(48, var4, var17, 0);
                  stackOut_20_0 = (byte[]) var5;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L3: {
                    var5_int = var9.c((byte) -108);
                    if (var5_int < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (ee.field_v == 0) {
                          break L4;
                        } else {
                          if (var5_int > ee.field_v) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var16 = new byte[var5_int];
                        var14 = var16;
                        var12 = var14;
                        var10 = var12;
                        var6 = var10;
                        if (var3 == 1) {
                          int discarded$2 = 9;
                          int discarded$3 = fc.a(var6, var5_int, param1, var4);
                          break L5;
                        } else {
                          var7 = (Object) (Object) wo.field_d;
                          synchronized (var7) {
                            L6: {
                              wo.field_d.a((byte) -67, var9, var16);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackOut_18_0 = (byte[]) var6;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("l.B(").append(0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final static void a(ni param0) {
        df var5 = null;
        int var4 = 0;
        try {
            var5 = wa.field_d;
            df var3 = var5;
            var5.f(127, 6);
            var5.field_n = var5.field_n + 1;
            var4 = var5.field_n;
            var5.b(90, 1);
            if (param0.field_j != null) {
                var5.b(90, param0.field_j.length);
                var5.a(param0.field_j.length, 0, param0.field_j, (byte) -58);
            } else {
                var5.b(90, 0);
            }
            int discarded$0 = var5.a(var4, true);
            var5.field_n = var5.field_n - 4;
            param0.field_k = var5.c((byte) -88);
            var5.c((byte) 48, -var4 + var5.field_n);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "l.D(" + (param0 != null ? "{...}" : "null") + ',' + 6 + ',' + 1 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 >= param5) {
          if (param4 + param5 > param3) {
            if (param6 <= param1) {
              if (param1 >= param0 + param6) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading fonts";
        field_a = "GRAPHICS: ";
        field_b = "Updates will sent to the email address you've given";
    }
}
