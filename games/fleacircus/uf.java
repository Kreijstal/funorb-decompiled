/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    private cg[] field_g;
    private af field_a;
    private java.math.BigInteger field_i;
    static dd field_f;
    static int[] field_b;
    static int[] field_e;
    private java.math.BigInteger field_d;
    private w field_m;
    static String field_l;
    private ni field_c;
    static int field_k;
    static int field_h;
    private fk field_j;

    final void a(int param0) {
        int var2;
        int var3;
        cg stackIn_11_0 = null;
        var3 = fleas.field_A ? 1 : 0;
        if (this.field_g == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_g.length) {
              var2 = 0;
              L1: while (true) {
                if (this.field_g.length <= var2) {
                  L2: {
                    if (param0 == -23608) {
                      break L2;
                    } else {
                      this.field_c = (ni) null;
                      break L2;
                    }
                  }
                  return;
                } else {
                  stackIn_11_0 = this.field_g[var2];
                  if (stackIn_11_0 != null) {
                    this.field_g[var2].b((byte) 123);
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (this.field_g[var2] != null) {
                this.field_g[var2].a(false);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final static StringBuilder a(int param0, StringBuilder param1, char param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param1.length();
            param1.setLength(param0);
            if (param3 < -117) {
              var5 = var4_int;
              L1: while (true) {
                if (var5 >= param0) {
                  stackIn_8_0 = (StringBuilder) (param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param1.setCharAt(var5, param2);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("uf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final boolean a(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        ni var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = fleas.field_A ? 1 : 0;
        if (this.field_c != null) {
          return true;
        } else {
          L0: {
            if (null != this.field_j) {
              break L0;
            } else {
              if (!this.field_m.a(-110)) {
                this.field_j = this.field_m.a(127, true, 255, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (this.field_j.field_q) {
            return false;
          } else {
            L1: {
              var10 = new ni(this.field_j.g(100));
              var10.field_i = 5;
              if (param0 < -127) {
                break L1;
              } else {
                field_k = 85;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = var10.e(false);
                var10.field_i = var10.field_i + 72 * var3;
                var13 = new byte[var10.field_k.length + -var10.field_i];
                var11 = var13;
                var4 = var11;
                var10.b(var4, 0, -65, var13.length);
                if (null == this.field_d) {
                  break L3;
                } else {
                  if (null == this.field_i) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_d, this.field_i);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if ((var5.length ^ -1) == -66) {
              var15 = kb.a(var10.field_k, -5 + var10.field_i + -var13.length, (byte) 122, 5);
              var7 = 0;
              L4: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  this.field_c = var10;
                  this.field_g = new cg[var3];
                  return true;
                } else {
                  if (var5[var7 + 1] != var15[var7]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final cg a(int param0, boolean param1, ah param2, ah param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        cg var9 = null;
        byte[] var13 = null;
        cg stackIn_9_0 = null;
        cg stackIn_12_0 = null;
        cg stackIn_14_0 = null;
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
            if (this.field_c != null) {
              L1: {
                if (param4 < 0) {
                  break L1;
                } else {
                  if (this.field_g.length <= param4) {
                    break L1;
                  } else {
                    if (null != this.field_g[param4]) {
                      stackIn_9_0 = this.field_g[param4];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      this.field_c.field_i = 72 * param4 - -6;
                      var6_int = this.field_c.c((byte) 127);
                      var7 = this.field_c.c((byte) -28);
                      var13 = new byte[64];
                      if (param0 == 28742) {
                        this.field_c.b(var13, 0, -64, 64);
                        var9 = new cg(param4, param2, param3, this.field_m, this.field_a, var6_int, var13, var7, param1);
                        this.field_g[param4] = var9;
                        stackIn_14_0 = (cg) (var9);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        stackIn_12_0 = (cg) null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
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
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("uf.B(").append(param0).append(',').append(param1).append(',');

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


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param4 + ')');
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

    uf(w param0, af param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void a(boolean param0) {
        field_l = null;
        if (!param0) {
            field_k = -71;
        }
        field_e = null;
        field_b = null;
        field_f = null;
    }

    private uf(w param0, af param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_i = param3;
            this.field_a = param1;
            this.field_d = param2;
            this.field_m = param0;
            if (!this.field_m.a(86)) {
                this.field_j = this.field_m.a(127, true, 255, 255, (byte) 0);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[150];
        field_b = new int[10];
        field_l = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
