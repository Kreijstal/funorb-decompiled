/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    private fi[] field_j;
    static int field_l;
    private gi field_a;
    private cb field_m;
    private java.math.BigInteger field_k;
    static wk field_e;
    private qa field_h;
    private java.math.BigInteger field_b;
    static gh field_i;
    private vk field_g;
    static cm field_d;
    static String[] field_f;
    static wk[] field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_e = (wk) null;
                break L1;
              }
            }
            var11 = param7;
            L2: while (true) {
              if (var11 >= param8 + param7) {
                break L0;
              } else {
                var9_int = (param1 + -param4) * (-param7 + var11) / param8 + param4;
                var10 = param3 + (-param7 + var11) * (-param3 + param5) / param8;
                pb.c(param6, var11, param0, var9_int, var10);
                var11++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var9), "ta.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 < -44) {
            break L0;
          } else {
            ta.a((byte) 65);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == kc.field_y) {
              break L2;
            } else {
              if (!kc.field_y.d((byte) 76)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean b(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        gi var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = SteelSentinels.field_G;
        if (this.field_a != null) {
          return true;
        } else {
          L0: {
            if (null == this.field_h) {
              if (this.field_g.c(105)) {
                return false;
              } else {
                this.field_h = this.field_g.a((byte) 0, 255, 255, true, (byte) 112);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (this.field_h.field_z) {
            return false;
          } else {
            var10 = new gi(this.field_h.d((byte) -65));
            var10.field_p = 5;
            var3 = var10.f((byte) -103);
            var10.field_p = var10.field_p + var3 * 72;
            var13 = new byte[-var10.field_p + var10.field_t.length];
            var11 = var13;
            var4 = var11;
            var10.a(0, var4, 28, var13.length);
            if (param0 == 64) {
              L1: {
                L2: {
                  if (null == this.field_b) {
                    break L2;
                  } else {
                    if (this.field_k != null) {
                      var12 = new java.math.BigInteger(var13);
                      var7_ref_java_math_BigInteger = var12.modPow(this.field_b, this.field_k);
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
              if ((var5.length ^ -1) == -66) {
                var15 = co.a((byte) -37, -5 + var10.field_p - var13.length, 5, var10.field_t);
                var7 = 0;
                L3: while (true) {
                  if (-65 >= (var7 ^ -1)) {
                    this.field_j = new fi[var3];
                    this.field_a = var10;
                    return true;
                  } else {
                    if (var5[1 + var7] == var15[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              return false;
            }
          }
        }
    }

    final fi a(rc param0, byte param1, boolean param2, rc param3, int param4) {
        fi stackIn_10_0 = null;
        fi stackIn_14_0 = null;
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
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fi var9 = null;
        rc var10 = null;
        byte[] var14 = null;
        try {
          L0: {
            if (null == this.field_a) {
              throw new RuntimeException();
            } else {
              L1: {
                if ((param4 ^ -1) > -1) {
                  break L1;
                } else {
                  if (this.field_j.length > param4) {
                    if (null != this.field_j[param4]) {
                      stackIn_10_0 = this.field_j[param4];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        this.field_a.field_p = 6 + param4 * 72;
                        if (param1 > 91) {
                          break L2;
                        } else {
                          var10 = (rc) null;
                          this.a((rc) null, (byte) 104, true, (rc) null, 114);
                          break L2;
                        }
                      }
                      var6_int = this.field_a.i(0);
                      var7 = this.field_a.i(0);
                      var14 = new byte[64];
                      this.field_a.a(0, var14, 28, 64);
                      var9 = new fi(param4, param3, param0, this.field_g, this.field_m, var6_int, var14, var7, param2);
                      this.field_j[param4] = var9;
                      stackIn_14_0 = (fi) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("ta.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != -35) {
            return;
        }
        field_f = null;
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        fi stackIn_13_0 = null;
        var3 = SteelSentinels.field_G;
        if (null != this.field_j) {
          if (!param0) {
            var2 = 0;
            L0: while (true) {
              if (var2 >= this.field_j.length) {
                var2 = 0;
                L1: while (true) {
                  if (this.field_j.length <= var2) {
                    return;
                  } else {
                    stackIn_13_0 = this.field_j[var2];
                    if (stackIn_13_0 != null) {
                      this.field_j[var2].c((byte) -97);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (this.field_j[var2] != null) {
                  this.field_j[var2].d(-119);
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
        } else {
          return;
        }
    }

    private ta(vk param0, cb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_m = param1;
            this.field_b = param2;
            this.field_g = param0;
            this.field_k = param3;
            if (!this.field_g.c(15)) {
                this.field_h = this.field_g.a((byte) 0, 255, 255, true, (byte) 72);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    ta(vk param0, cb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    static {
    }
}
