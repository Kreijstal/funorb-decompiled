/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    private ra field_a;
    private rb field_d;
    private java.math.BigInteger field_c;
    private ef field_f;
    private java.math.BigInteger field_b;
    private eh field_g;
    private t[] field_e;

    final boolean a(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        rb var9;
        byte[] var10;
        java.math.BigInteger var11;
        byte[] var12;
        byte[] var14;
        if (this.field_d != null) {
          return true;
        } else {
          L0: {
            if (null != this.field_a) {
              break L0;
            } else {
              if (!this.field_g.b((byte) -50)) {
                this.field_a = this.field_g.a(255, 255, -28612, true, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (this.field_a.field_r) {
            return false;
          } else {
            var9 = new rb(this.field_a.f(0));
            var9.field_g = 5;
            var3 = var9.j(7909);
            var9.field_g = var9.field_g + 72 * var3;
            if (param0 == -6) {
              L1: {
                L2: {
                  var12 = new byte[var9.field_f.length + -var9.field_g];
                  var10 = var12;
                  var4 = var10;
                  var9.a(var12.length, (byte) 88, var12, 0);
                  if (null == this.field_b) {
                    break L2;
                  } else {
                    if (this.field_c == null) {
                      break L2;
                    } else {
                      var11 = new java.math.BigInteger(var12);
                      var7_ref_java_math_BigInteger = var11.modPow(this.field_b, this.field_c);
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
                var14 = bd.a(-5 + -var12.length + var9.field_g, var9.field_f, (byte) 93, 5);
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -65) {
                    this.field_e = new t[var3];
                    this.field_d = var9;
                    return true;
                  } else {
                    if (var5[1 + var7] == var14[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
            } else {
              return true;
            }
          }
        }
    }

    jc(eh param0, ef param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final t a(boolean param0, int param1, uf param2, int param3, uf param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        t var9 = null;
        byte[] var13 = null;
        t stackIn_9_0 = null;
        t stackIn_12_0 = null;
        t stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == this.field_d) {
              throw new RuntimeException();
            } else {
              L1: {
                if (0 > param3) {
                  break L1;
                } else {
                  if (param3 >= this.field_e.length) {
                    break L1;
                  } else {
                    if (param1 < -61) {
                      if (null == this.field_e[param3]) {
                        this.field_d.field_g = 72 * param3 - -6;
                        var6_int = this.field_d.f((byte) -83);
                        var7 = this.field_d.f((byte) -118);
                        var13 = new byte[64];
                        this.field_d.a(64, (byte) 88, var13, 0);
                        var9 = new t(param3, param2, param4, this.field_g, this.field_f, var6_int, var13, var7, param0);
                        this.field_e[param3] = var9;
                        stackIn_14_0 = (t) (var9);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackIn_12_0 = this.field_e[param3];
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      stackIn_9_0 = (t) null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("jc.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            jc.b(77);
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        t stackIn_16_0 = null;
        L0: {
          var3 = StarCannon.field_A;
          if (param0 == -71) {
            break L0;
          } else {
            this.a(85);
            break L0;
          }
        }
        if (this.field_e == null) {
          return;
        } else {
          var2 = 0;
          L1: while (true) {
            if (this.field_e.length <= var2) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_e.length) {
                  return;
                } else {
                  if (null != this.field_e[var2]) {
                    stackIn_16_0 = this.field_e[var2];
                    ((t) (Object) stackIn_16_0).d((byte) -12);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (this.field_e[var2] != null) {
                this.field_e[var2].b(0);
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    private jc(eh param0, ef param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_c = param3;
            this.field_g = param0;
            this.field_b = param2;
            this.field_f = param1;
            if (!this.field_g.b((byte) -114)) {
                this.field_a = this.field_g.a(255, 255, -28612, true, (byte) 0);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
