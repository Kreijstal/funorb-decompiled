/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    private java.math.BigInteger field_g;
    static String field_d;
    static String[] field_f;
    private java.math.BigInteger field_i;
    private jq[] field_k;
    private wq field_b;
    static String field_e;
    private ih field_a;
    private da field_c;
    private kg field_h;
    static mb field_j;

    final void a(int param0) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (null == this.field_k) {
          return;
        } else {
          L0: {
            if (param0 > 42) {
              break L0;
            } else {
              this.field_i = (java.math.BigInteger) null;
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (this.field_k.length <= var2) {
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_k.length) {
                  return;
                } else {
                  if (null != this.field_k[var2]) {
                    this.field_k[var2].c(1);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != this.field_k[var2]) {
                this.field_k[var2].b(20312);
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

    co(ih param0, kg param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        ve var9;
        wq var11;
        byte[] var12;
        java.math.BigInteger var13;
        byte[] var14;
        byte[] var16;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (null == this.field_b) {
          L0: {
            if (null != this.field_c) {
              break L0;
            } else {
              if (this.field_a.a(2)) {
                return false;
              } else {
                this.field_c = this.field_a.a(-952050528, 255, (byte) 0, 255, true);
                break L0;
              }
            }
          }
          if (this.field_c.field_u) {
            return false;
          } else {
            L1: {
              L2: {
                var11 = new wq(this.field_c.c((byte) 56));
                var11.field_l = 5;
                var3 = var11.l(255);
                var11.field_l = var11.field_l + 72 * var3;
                var14 = new byte[var11.field_k.length + -var11.field_l];
                var12 = var14;
                var4 = var12;
                var11.a(0, var4, 127, var14.length);
                if (null == this.field_i) {
                  break L2;
                } else {
                  if (null != this.field_g) {
                    var13 = new java.math.BigInteger(var14);
                    var7_ref_java_math_BigInteger = var13.modPow(this.field_i, this.field_g);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if ((var5.length ^ -1) != -66) {
              throw new RuntimeException();
            } else {
              var16 = jd.a(var11.field_k, 5, -14970, var11.field_l + -var14.length + -5);
              var7 = 0;
              L3: while (true) {
                if (64 <= var7) {
                  L4: {
                    this.field_b = var11;
                    if (!param0) {
                      break L4;
                    } else {
                      var9 = (ve) null;
                      this.a(34, true, (ve) null, -60, (ve) null);
                      break L4;
                    }
                  }
                  this.field_k = new jq[var3];
                  return true;
                } else {
                  if (var16[var7] != var5[var7 - -1]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = (-640 + kp.field_a) / 2;
        int var3 = hj.field_Yb * hj.field_Yb;
        int var4 = -(param0 * param0) + var3;
        qa.field_w.a(lb.field_d + -120 - 4 - 90, 90, var2 - var4 * 199 / var3, 199, (byte) 64);
        ak.field_d.a(-4 + (lb.field_d + -120), 0, 438 * var4 / var3 + (202 + var2), 438, (byte) 64);
        if (param1) {
            field_e = (String) null;
        }
    }

    public static void b(int param0) {
        field_e = null;
        int var1 = -35 % ((param0 - 34) / 39);
        field_j = null;
        field_d = null;
        field_f = null;
    }

    final jq a(int param0, boolean param1, ve param2, int param3, ve param4) {
        jq stackIn_9_0 = null;
        jq stackIn_11_0 = null;
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
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        jq var10 = null;
        byte[] var14 = null;
        try {
          L0: {
            if (null != this.field_b) {
              L1: {
                if ((param3 ^ -1) > -1) {
                  break L1;
                } else {
                  if (param3 >= this.field_k.length) {
                    break L1;
                  } else {
                    if (null != this.field_k[param3]) {
                      stackIn_9_0 = this.field_k[param3];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      this.field_b.field_l = param3 * 72 - -6;
                      var6_int = -124 / ((param0 - -71) / 38);
                      var7 = this.field_b.e(255);
                      var8 = this.field_b.e(255);
                      var14 = new byte[64];
                      this.field_b.a(0, var14, 122, 64);
                      var10 = new jq(param3, param4, param2, this.field_a, this.field_h, var7, var14, var8, param1);
                      this.field_k[param3] = var10;
                      stackIn_11_0 = (jq) (var10);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
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

            stackIn_14_1 = new StringBuilder().append("co.C(").append(param0).append(',').append(param1).append(',');

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


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    private co(ih param0, kg param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_g = param3;
            this.field_i = param2;
            this.field_h = param1;
            this.field_a = param0;
            if (!this.field_a.a(2)) {
                this.field_c = this.field_a.a(-952050528, 255, (byte) 0, 255, true);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "co.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, vm param1) {
        try {
            fo.a(param1, 0);
            if (param0 >= -74) {
                field_d = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "co.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0) {
        if (param0 != -53) {
            field_j = (mb) null;
        }
        return lk.field_p + -nc.field_k;
    }

    static {
        field_e = "Hide lobby chat";
        field_d = "Hide players in <%0>'s game";
    }
}
