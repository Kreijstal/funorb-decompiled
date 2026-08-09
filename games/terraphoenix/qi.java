/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    private h field_i;
    private nh field_d;
    private tb[] field_c;
    private java.math.BigInteger field_e;
    static boolean field_b;
    private java.math.BigInteger field_g;
    static boolean field_f;
    private dh field_h;
    private wh field_a;

    qi(h param0, wh param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final void a(int param0) {
        int var2;
        int var3;
        var3 = Terraphoenix.field_V;
        if (this.field_c != null) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_c.length) {
              var2 = param0;
              L1: while (true) {
                if (var2 >= this.field_c.length) {
                  return;
                } else {
                  if (null != this.field_c[var2]) {
                    this.field_c[var2].e((byte) -51);
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != this.field_c[var2]) {
                this.field_c[var2].d((byte) -21);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        dh var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Terraphoenix.field_V;
        if (this.field_h != null) {
          return true;
        } else {
          L0: {
            if (null != this.field_d) {
              break L0;
            } else {
              if (!this.field_i.d(-21)) {
                this.field_d = this.field_i.a(255, true, 255, (byte) 102, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (this.field_d.field_A) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new dh(this.field_d.b(param0));
                var10.field_k = 5;
                var3 = var10.a(-16384);
                var10.field_k = var10.field_k + var3 * 72;
                var13 = new byte[var10.field_i.length - var10.field_k];
                var11 = var13;
                var4 = var11;
                var10.a(var13.length, 0, 90, var13);
                if (this.field_g == null) {
                  break L2;
                } else {
                  if (null == this.field_e) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_e);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (-66 != (var5.length ^ -1)) {
              throw new RuntimeException();
            } else {
              var15 = tg.a(var10.field_i, var10.field_k - var13.length - 5, 5, 8);
              var7 = 0;
              L3: while (true) {
                if ((var7 ^ -1) <= -65) {
                  this.field_c = new tb[var3];
                  this.field_h = var10;
                  return true;
                } else {
                  if (var5[1 + var7] != var15[var7]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    private qi(h param0, wh param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_i = param0;
              this.field_g = param2;
              this.field_e = param3;
              this.field_a = param1;
              if (this.field_i.d(-21)) {
                break L1;
              } else {
                this.field_d = this.field_i.a(255, true, 255, (byte) 84, (byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("qi.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    final tb a(boolean param0, int param1, ua param2, ua param3, int param4) {
        tb stackIn_9_0 = null;
        tb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        tb var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_h != null) {
              L1: {
                if (-1 < (param1 ^ -1)) {
                  break L1;
                } else {
                  if (this.field_c.length > param1) {
                    if (null != this.field_c[param1]) {
                      stackIn_9_0 = this.field_c[param1];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        this.field_h.field_k = param1 * 72 - -6;
                        var6_int = this.field_h.f((byte) -107);
                        var7 = this.field_h.f((byte) -107);
                        var13 = new byte[64];
                        if (param4 >= 89) {
                          break L2;
                        } else {
                          this.field_g = (java.math.BigInteger) null;
                          break L2;
                        }
                      }
                      this.field_h.a(64, 0, 91, var13);
                      var9 = new tb(param1, param3, param2, this.field_i, this.field_a, var6_int, var13, var7, param0);
                      this.field_c[param1] = var9;
                      stackIn_13_0 = (tb) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("qi.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    static {
        field_f = false;
    }
}
