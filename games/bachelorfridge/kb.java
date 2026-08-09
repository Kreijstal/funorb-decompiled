/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    private qfa field_d;
    static int field_h;
    private vm field_i;
    private fp[] field_a;
    private java.math.BigInteger field_f;
    private ea field_k;
    private java.math.BigInteger field_b;
    private lu field_c;
    static qia field_e;
    static int field_g;
    static int field_j;

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 26) {
            kb.a(-88);
        }
    }

    final boolean a(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        lu var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = BachelorFridge.field_y;
        if (null != this.field_c) {
          return true;
        } else {
          L0: {
            if (this.field_d == null) {
              if (!this.field_i.b(20)) {
                this.field_d = this.field_i.a(255, 255, 123, (byte) 0, true);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (this.field_d.field_n) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new lu(this.field_d.d((byte) -65));
                var10.field_g = 5;
                var3 = var10.b(param0 + 16711924);
                var10.field_g = var10.field_g + 72 * var3;
                var13 = new byte[-var10.field_g + var10.field_h.length];
                var11 = var13;
                var4 = var11;
                var10.a(var4, var13.length, 128, 0);
                if (null == this.field_b) {
                  break L2;
                } else {
                  if (null == this.field_f) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_b, this.field_f);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if ((var5.length ^ -1) != -66) {
              throw new RuntimeException();
            } else {
              var15 = ln.a(-5 + (var10.field_g + -var13.length), var10.field_h, 5, 8);
              var7 = 0;
              L3: while (true) {
                if (var7 >= 64) {
                  L4: {
                    this.field_c = var10;
                    if (param0 == 11) {
                      break L4;
                    } else {
                      this.b((byte) -34);
                      break L4;
                    }
                  }
                  this.field_a = new fp[var3];
                  return true;
                } else {
                  if (var15[var7] == var5[var7 - -1]) {
                    var7++;
                    continue L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          }
        }
    }

    final fp a(boolean param0, int param1, ta param2, ta param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fp var9 = null;
        byte[] var13 = null;
        fp stackIn_9_0 = null;
        fp stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != this.field_c) {
              L1: {
                if ((param1 ^ -1) > -1) {
                  break L1;
                } else {
                  if (param1 < this.field_a.length) {
                    if (null != this.field_a[param1]) {
                      stackIn_9_0 = this.field_a[param1];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      this.field_c.field_g = param1 * 72 - -6;
                      var6_int = this.field_c.f(81);
                      var7 = this.field_c.f(-121);
                      var13 = new byte[param4];
                      this.field_c.a(var13, 64, 128, 0);
                      var9 = new fp(param1, param2, param3, this.field_i, this.field_k, var6_int, var13, var7, param0);
                      this.field_a[param1] = var9;
                      stackIn_11_0 = (fp) (var9);
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
          L2: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("kb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    private kb(vm param0, ea param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_b = param2;
              this.field_f = param3;
              this.field_k = param1;
              this.field_i = param0;
              if (this.field_i.b(20)) {
                break L1;
              } else {
                this.field_d = this.field_i.a(255, 255, 126, (byte) 0, true);
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

            stackIn_6_1 = new StringBuilder().append("kb.<init>(");

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var4 = BachelorFridge.field_y;
        if (this.field_a != null) {
          var3 = 14 % ((-16 - param0) / 51);
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_a.length) {
              var5 = 0;
              var2 = var5;
              L1: while (true) {
                if (this.field_a.length <= var5) {
                  return;
                } else {
                  if (this.field_a[var5] != null) {
                    this.field_a[var5].c(14075);
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != this.field_a[var2]) {
                this.field_a[var2].e(62);
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

    kb(vm param0, ea param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    static {
        field_e = new qia();
        field_g = 0;
    }
}
