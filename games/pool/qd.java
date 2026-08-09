/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private rn field_j;
    static String[] field_h;
    private java.math.BigInteger field_c;
    private no field_i;
    static int field_k;
    private java.math.BigInteger field_l;
    private ge field_a;
    static int field_g;
    private sp field_d;
    static String field_e;
    private up[] field_f;
    static of field_b;

    final static boolean a(int param0, char param1) {
        int stackIn_9_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (param1 == 160) {
                break L1;
              } else {
                if (param1 == 32) {
                  break L1;
                } else {
                  if (param1 == 95) {
                    break L1;
                  } else {
                    if (param1 != 45) {
                      stackIn_9_0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    final up a(boolean param0, np param1, int param2, byte param3, np param4) {
        up stackIn_10_0 = null;
        up stackIn_14_0 = null;
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
        up var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_a == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if ((param2 ^ -1) > -1) {
                  break L1;
                } else {
                  if (this.field_f.length <= param2) {
                    break L1;
                  } else {
                    if (this.field_f[param2] != null) {
                      stackIn_10_0 = this.field_f[param2];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      L2: {
                        this.field_a.field_v = 6 + param2 * 72;
                        var6_int = this.field_a.b(true);
                        var7 = this.field_a.b(true);
                        var13 = new byte[64];
                        this.field_a.a(0, (byte) -115, var13, 64);
                        var9 = new up(param2, param1, param4, this.field_i, this.field_j, var6_int, var13, var7, param0);
                        this.field_f[param2] = var9;
                        if (param3 == 0) {
                          break L2;
                        } else {
                          this.field_j = (rn) null;
                          break L2;
                        }
                      }
                      stackIn_14_0 = (up) (var9);
                      decompiledRegionSelector0 = 1;
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
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("qd.B(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        up stackIn_15_0 = null;
        var3 = Pool.field_O;
        if (this.field_f == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (this.field_f.length <= var2) {
              if (param0 == -46) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= this.field_f.length) {
                    return;
                  } else {
                    if (null != this.field_f[var2]) {
                      stackIn_15_0 = this.field_f[var2];
                      ((up) (Object) stackIn_15_0).c((byte) 7);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (this.field_f[var2] != null) {
                this.field_f[var2].c(param0 ^ -67);
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

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        int var1 = 127 % ((param0 - 15) / 58);
        field_e = null;
    }

    qd(no param0, rn param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        ge stackIn_13_0 = null;
        ge stackIn_13_1 = null;
        sp stackIn_13_2 = null;
        ge stackIn_14_0 = null;
        ge stackIn_14_1 = null;
        sp stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        ge var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        L0: {
          var8 = Pool.field_O;
          if (param0) {
            break L0;
          } else {
            qd.a((byte) 17, -69);
            break L0;
          }
        }
        if (null != this.field_a) {
          return true;
        } else {
          L1: {
            if (null != this.field_d) {
              break L1;
            } else {
              if (!this.field_i.b((byte) -125)) {
                this.field_d = this.field_i.a(255, 255, (byte) 0, true, -154018400);
                break L1;
              } else {
                return false;
              }
            }
          }
          if (!this.field_d.field_F) {
            L2: {
              stackIn_13_0 = null;

              stackIn_13_1 = null;

              stackIn_13_2 = this.field_d;

              if (param0) {
                stackIn_14_0 = null;
                stackIn_14_1 = null;
                stackIn_14_2 = (sp) ((Object) stackIn_13_2);
                stackIn_14_3 = 0;
                break L2;
              } else {
                stackIn_14_0 = null;
                stackIn_14_1 = null;
                stackIn_14_2 = (sp) ((Object) stackIn_13_2);
                stackIn_14_3 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = new ge(((sp) (Object) stackIn_14_2).b(stackIn_14_3 != 0));
                var10.field_v = 5;
                var3 = var10.g(-62);
                var10.field_v = var10.field_v + var3 * 72;
                var13 = new byte[-var10.field_v + var10.field_t.length];
                var11 = var13;
                var4 = var11;
                var10.a(0, (byte) -125, var4, var13.length);
                if (this.field_c == null) {
                  break L4;
                } else {
                  if (null != this.field_l) {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_c, this.field_l);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var5 = var4;
              break L3;
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var15 = jr.a(var10.field_v + (-var13.length + -5), (byte) -121, var10.field_t, 5);
              var7 = 0;
              L5: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  this.field_f = new up[var3];
                  this.field_a = var10;
                  return true;
                } else {
                  if (var15[var7] == var5[var7 + 1]) {
                    var7++;
                    continue L5;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final static void a(byte param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        int var3 = -32 / ((param0 - 16) / 57);
        var2.field_v = var2.field_v + 1;
        int var4 = var2.field_v;
        var2.a(2, false);
        var2.a(md.field_c, (byte) 0, 0, md.field_c.length);
        var2.a(pm.field_l, false);
        var2.a(mc.field_l, false);
        var2.a(ka.field_s, (byte) 0, 0, ka.field_s.length);
        var2.b(var2.field_v + -var4, true);
    }

    private qd(no param0, rn param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_c = param2;
              this.field_j = param1;
              this.field_i = param0;
              this.field_l = param3;
              if (this.field_i.b((byte) -125)) {
                break L1;
              } else {
                this.field_d = this.field_i.a(255, 255, (byte) 0, true, -154018400);
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

            stackIn_6_1 = new StringBuilder().append("qd.<init>(");

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
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_e = "Quit";
        field_g = 0;
        field_k = -1;
        field_h = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
