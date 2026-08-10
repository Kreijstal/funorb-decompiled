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
        int var3;
        sb var4;
        var3 = param0 + -1 & param2 >> -1286094081;
        if (param1 < 76) {
          var4 = (sb) null;
          oi.a(106, 18, (sb) null);
          return var3 + (param2 - -(param2 >>> -520357569)) % param0;
        } else {
          return var3 + (param2 - -(param2 >>> -520357569)) % param0;
        }
    }

    private final void a(byte param0) {
        rf[] var2;
        int var3;
        rf var4;
        int var5;
        rf[] var6;
        var5 = client.field_A ? 1 : 0;
        var6 = new rf[this.field_c.length * 2];
        var2 = var6;
        if (param0 <= 103) {
          return;
        } else {
          var3 = 0;
          L0: while (true) {
            if (this.field_c.length <= var3) {
              this.field_c = var2;
              return;
            } else {
              var4 = this.field_c[var3];
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
        rf stackIn_9_0 = null;
        rf stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        rf var5 = null;
        int var6 = 0;
        int var7 = 0;
        rf var8 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_a = (em) null;
                break L1;
              }
            }
            L2: {
              var4_int = param2.a(118);
              var8 = this.field_c[var4_int % this.field_c.length];
              var5 = var8;
              if (var5 == null) {
                break L2;
              } else {
                if (var4_int != var8.field_j) {
                  break L2;
                } else {
                  L3: {
                    if (!param1) {
                      this.field_c[var4_int % this.field_c.length] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackIn_9_0 = (rf) (var5);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L4: while (true) {
              L5: {
                if (!param1) {
                  break L5;
                } else {
                  if (this.field_c[var4_int % this.field_c.length] == null) {
                    break L5;
                  } else {
                    this.a((byte) 115);
                    continue L4;
                  }
                }
              }
              var5 = new rf(var4_int);
              var5.field_b = param2.d((byte) -102);
              var5.field_n = param2.d((byte) -79);
              var5.field_c = new byte[var5.field_b * var5.field_n];
              param2.j((byte) -108);
              var6 = 0;
              L6: while (true) {
                if (var5.field_c.length <= var6) {
                  L7: {
                    param2.k((byte) -128);
                    if (param1) {
                      this.field_c[var4_int % this.field_c.length] = var5;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  stackIn_21_0 = (rf) (var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5.field_c[var6] = (byte)param2.a(5, (byte) 75);
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
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("oi.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_21_0;
        }
    }

    final rf a(boolean param0, int param1) {
        rf var3;
        rf var4;
        if (!param0) {
          var3 = this.field_c[param1 % this.field_c.length];
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
          var4 = (rf) null;
          this.a((rf) null, (byte) -73);
          var3 = this.field_c[param1 % this.field_c.length];
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
        if (param0 != this.field_c[var3_int % this.field_c.length]) {
            throw new IllegalArgumentException();
        }
        if (param1 < 24) {
            return;
        }
        try {
            this.field_c[var3_int % this.field_c.length] = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "oi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    oi(int param0) {
        this.field_c = new rf[param0];
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 == 2) {
            return;
        }
        field_e = (String) null;
    }

    final void a(rf param0, int param1) {
        int var3_int = 0;
        int var4 = client.field_A ? 1 : 0;
        try {
            var3_int = param0.field_j;
            if (this.field_c[var3_int % this.field_c.length] != null && param0.field_j == this.field_c[var3_int % this.field_c.length].field_j) {
                throw new IllegalArgumentException();
            }
            while (null != this.field_c[var3_int % this.field_c.length]) {
                this.a((byte) 116);
            }
            if (param1 != 0) {
                oi.a(93, 98, -46);
            }
            this.field_c[var3_int % this.field_c.length] = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "oi.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
                oi.a(-93, 111, -125);
            }
            var3.a(true, param2.field_r);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "oi.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Winner!";
        field_d = new qm(7, 0, 1, 1);
        field_b = "Drawn";
    }
}
