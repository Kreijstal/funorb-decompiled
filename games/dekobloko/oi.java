/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    private rf[] field_c;
    static String field_e;
    static qm field_d;
    static em field_a;
    static String field_b;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        var3 = param0 + -1 & param2 >> 31;
        if (param1 < 76) {
          var4 = null;
          oi.a(106, 18, (sb) null);
          return var3 + (param2 - -(param2 >>> 31)) % param0;
        } else {
          return var3 + (param2 - -(param2 >>> 31)) % param0;
        }
    }

    private final void a(byte param0) {
        rf[] var2 = null;
        int var3 = 0;
        rf var4 = null;
        int var5 = 0;
        rf[] var6 = null;
        var5 = client.field_A ? 1 : 0;
        var6 = new rf[((oi) this).field_c.length * 2];
        var2 = var6;
        if (param0 <= 103) {
          return;
        } else {
          var3 = 0;
          L0: while (true) {
            if (((oi) this).field_c.length <= var3) {
              ((oi) this).field_c = var2;
              return;
            } else {
              var4 = ((oi) this).field_c[var3];
              if (var4 != null) {
                var2[var4.field_j % var6.length] = var4;
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final rf a(boolean param0, boolean param1, uf param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        rf var5 = null;
        int var6 = 0;
        int var7 = 0;
        rf var8 = null;
        rf var9 = null;
        rf stackIn_9_0 = null;
        rf stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        rf stackOut_8_0 = null;
        rf stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              var4_int = param2.a(118);
              var8 = ((oi) this).field_c[var4_int % ((oi) this).field_c.length];
              var5 = var8;
              if (var5 == null) {
                break L2;
              } else {
                if (var4_int != var8.field_j) {
                  break L2;
                } else {
                  L3: {
                    if (!param1) {
                      ((oi) this).field_c[var4_int % ((oi) this).field_c.length] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_8_0 = (rf) var5;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            }
            L4: while (true) {
              L5: {
                if (!param1) {
                  break L5;
                } else {
                  if (((oi) this).field_c[var4_int % ((oi) this).field_c.length] == null) {
                    break L5;
                  } else {
                    this.a((byte) 115);
                    continue L4;
                  }
                }
              }
              var9 = new rf(var4_int);
              var9.field_b = param2.d((byte) -102);
              var9.field_n = param2.d((byte) -79);
              var9.field_c = new byte[var9.field_b * var9.field_n];
              param2.j((byte) -108);
              var6 = 0;
              L6: while (true) {
                if (var9.field_c.length <= var6) {
                  L7: {
                    param2.k((byte) -128);
                    if (param1) {
                      ((oi) this).field_c[var4_int % ((oi) this).field_c.length] = var9;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  stackOut_20_0 = (rf) var9;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  var9.field_c[var6] = (byte)param2.a(5, (byte) 75);
                  var6++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("oi.F(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    final rf a(boolean param0, int param1) {
        rf var3 = null;
        Object var4 = null;
        if (!param0) {
          var3 = ((oi) this).field_c[param1 % ((oi) this).field_c.length];
          if (var3 != null) {
            if (var3.field_j != param1) {
              return null;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        } else {
          var4 = null;
          ((oi) this).a((rf) null, (byte) -73);
          var3 = ((oi) this).field_c[param1 % ((oi) this).field_c.length];
          if (var3 != null) {
            if (var3.field_j != param1) {
              return null;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void a(rf param0, byte param1) {
        int var3_int = param0.field_j;
        if (param0 != ((oi) this).field_c[var3_int % ((oi) this).field_c.length]) {
            throw new IllegalArgumentException();
        }
        if (param1 < 24) {
            return;
        }
        try {
            ((oi) this).field_c[var3_int % ((oi) this).field_c.length] = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "oi.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    oi(int param0) {
        ((oi) this).field_c = new rf[param0];
    }

    public static void a() {
        field_d = null;
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final void a(rf param0, int param1) {
        int var3_int = 0;
        int var4 = client.field_A ? 1 : 0;
        try {
            var3_int = param0.field_j;
            if (((oi) this).field_c[var3_int % ((oi) this).field_c.length] != null) {
                if (param0.field_j == ((oi) this).field_c[var3_int % ((oi) this).field_c.length].field_j) {
                    throw new IllegalArgumentException();
                }
            }
            while (null != ((oi) this).field_c[var3_int % ((oi) this).field_c.length]) {
                this.a((byte) 116);
            }
            if (param1 != 0) {
                int discarded$0 = oi.a(93, 98, -46);
            }
            ((oi) this).field_c[var3_int % ((oi) this).field_c.length] = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "oi.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, sb param2) {
        uf var3 = null;
        try {
            var3 = we.field_b;
            var3.f(param1, -4);
            var3.a(true, 2);
            var3.a(true, 0);
            if (param0 > -57) {
                int discarded$0 = oi.a(-93, 111, -125);
            }
            var3.a(true, param2.field_r);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "oi.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Winner!";
        field_d = new qm(7, 0, 1, 1);
        field_b = "Drawn";
    }
}
