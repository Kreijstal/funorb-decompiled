/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    private ai field_d;
    private java.math.BigInteger field_e;
    static ri field_c;
    private qb field_i;
    static int field_g;
    private tn field_h;
    private k field_b;
    private cn[] field_f;
    private java.math.BigInteger field_a;

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeKeyListener(um.field_c);
            param0.removeFocusListener(um.field_c);
            qf.field_f = -1;
            int var2_int = -120 % ((param1 - 66) / 53);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "eq.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    eq(qb param0, ai param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final cn a(int param0, bq param1, int param2, bq param3, boolean param4) {
        cn stackIn_11_0 = null;
        cn stackIn_13_0 = null;
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
        cn var9 = null;
        CharSequence[] var10 = null;
        byte[] var14 = null;
        try {
          L0: {
            L1: {
              if (param2 == -15893) {
                break L1;
              } else {
                var10 = (CharSequence[]) null;
                eq.a((CharSequence[]) null, 8, 88, 1);
                break L1;
              }
            }
            if (null == this.field_b) {
              throw new RuntimeException();
            } else {
              L2: {
                if ((param0 ^ -1) > -1) {
                  break L2;
                } else {
                  if (this.field_f.length <= param0) {
                    break L2;
                  } else {
                    if (null == this.field_f[param0]) {
                      this.field_b.field_j = 6 + 72 * param0;
                      var6_int = this.field_b.i(-1478490344);
                      var7 = this.field_b.i(param2 + -1478474451);
                      var14 = new byte[64];
                      this.field_b.a(0, param2 ^ 9946, 64, var14);
                      var9 = new cn(param0, param3, param1, this.field_i, this.field_d, var6_int, var14, var7, param4);
                      this.field_f[param0] = var9;
                      stackIn_13_0 = (cn) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_11_0 = this.field_f[param0];
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
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("eq.F(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        CharSequence var7_ref_CharSequence = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              if (-2 == (param3 ^ -1)) {
                var10 = param0[param1];
                var4 = var10;
                if (var4 != null) {
                  stackIn_10_0 = var10.toString();
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param3 - -param1;
                var5 = 0;
                var6_int = param1;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param1;
                    L2: while (true) {
                      if (var4_int <= var7) {
                        if (param2 == 4) {
                          stackIn_29_0 = var6.toString();
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          stackIn_27_0 = (String) null;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 == null) {
                            discarded$0 = var6.append("null");
                            break L3;
                          } else {
                            discarded$1 = var6.append(var8);
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence != null) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      } else {
                        var5 += 4;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4_ref);

            stackIn_32_1 = new StringBuilder().append("eq.A(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L5;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                return stackIn_29_0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            eq.a(-117);
        }
    }

    private eq(qb param0, ai param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_d = param1;
            this.field_i = param0;
            this.field_e = param3;
            this.field_a = param2;
            if (!this.field_i.e(82)) {
              this.field_h = this.field_i.a(487989472, 255, true, 255, (byte) 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("eq.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
    }

    final boolean c(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        k var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != this.field_b) {
          return true;
        } else {
          L0: {
            if (null == this.field_h) {
              if (!this.field_i.e(54)) {
                this.field_h = this.field_i.a(487989472, 255, true, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (this.field_h.field_t) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new k(this.field_h.e(0));
                var10.field_j = 5;
                var3 = var10.g(31365);
                var10.field_j = var10.field_j + var3 * 72;
                var13 = new byte[var10.field_m.length - var10.field_j];
                var11 = var13;
                var4 = var11;
                var10.a(0, -6351, var13.length, var13);
                if (null == this.field_a) {
                  break L2;
                } else {
                  if (null == this.field_e) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_a, this.field_e);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length != 65) {
              throw new RuntimeException();
            } else {
              var15 = ho.a(4246, 5, var10.field_m, -var13.length + (var10.field_j + -5));
              var7 = 0;
              L3: while (true) {
                if (64 <= var7) {
                  if (param0 > -113) {
                    this.field_h = (tn) null;
                    this.field_b = var10;
                    this.field_f = new cn[var3];
                    return true;
                  } else {
                    this.field_b = var10;
                    this.field_f = new cn[var3];
                    return true;
                  }
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

    final void b(int param0) {
        cn stackIn_10_0 = null;
        int var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_f == null) {
          return;
        } else {
          var2 = param0;
          L0: while (true) {
            if (this.field_f.length <= var2) {
              var2 = 0;
              L1: while (true) {
                if (this.field_f.length <= var2) {
                  return;
                } else {
                  stackIn_10_0 = this.field_f[var2];
                  if (stackIn_10_0 != null) {
                    this.field_f[var2].b(-2);
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (this.field_f[var2] != null) {
                this.field_f[var2].c(90);
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

    static {
        field_g = 9;
    }
}
