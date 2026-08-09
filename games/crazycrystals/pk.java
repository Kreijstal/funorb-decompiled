/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    private ld field_e;
    private ee[] field_a;
    private java.math.BigInteger field_h;
    private ng field_i;
    static String field_f;
    private ni field_d;
    private java.math.BigInteger field_g;
    static int field_c;
    private ob field_b;

    public static void b(int param0) {
        int var1 = -69 / ((46 - param0) / 43);
        field_f = null;
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        var3 = CrazyCrystals.field_B;
        if (this.field_a == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_a.length) {
              var2 = 0;
              L1: while (true) {
                if (this.field_a.length <= var2) {
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      this.field_d = (ni) null;
                      break L2;
                    }
                  }
                  return;
                } else {
                  if (null != this.field_a[var2]) {
                    this.field_a[var2].e(26);
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (null != this.field_a[var2]) {
                this.field_a[var2].c(117);
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

    final ee a(int param0, sp param1, boolean param2, int param3, sp param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ee var9 = null;
        byte[] var13 = null;
        ee stackIn_9_0 = null;
        ee stackIn_11_0 = null;
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
            if (this.field_i != null) {
              L1: {
                if ((param3 ^ -1) > -1) {
                  break L1;
                } else {
                  if (param3 >= this.field_a.length) {
                    break L1;
                  } else {
                    if (this.field_a[param3] != null) {
                      stackIn_9_0 = this.field_a[param3];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      this.field_i.field_f = 72 * param3 + 6;
                      var6_int = this.field_i.b((byte) 127);
                      var7 = this.field_i.b((byte) 126);
                      var13 = new byte[param0];
                      this.field_i.a(64, var13, (byte) 94, 0);
                      var9 = new ee(param3, param4, param1, this.field_b, this.field_d, var6_int, var13, var7, param2);
                      this.field_a[param3] = var9;
                      stackIn_11_0 = (ee) (var9);
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

            stackIn_14_1 = new StringBuilder().append("pk.A(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static boolean a(byte param0) {
        if (param0 != -56) {
            field_f = (String) null;
        }
        return ch.field_d.b(true);
    }

    pk(ob param0, ni param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(int param0, pp param1, byte param2) {
        md var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = tp.field_f;
              var3.d(8, param0);
              var3.a(true, 2);
              var3.a(true, 0);
              var3.a(true, param1.field_f);
              if (param2 == 113) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("pk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qp var4_ref_qp = null;
        Object var5 = null;
        int var6 = 0;
        w var8 = null;
        md var9 = null;
        byte[] var13 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param0 < -97) {
              L1: {
                var9 = kd.field_n;
                var2 = var9.h(255);
                if (-1 == (var2 ^ -1)) {
                  var8 = (w) ((Object) je.field_a.g(32073));
                  if (var8 != null) {
                    L2: {
                      var4 = var9.h(255);
                      if (0 != var4) {
                        var13 = new byte[var4];
                        var9.a(var4, var13, (byte) -120, 0);
                        break L2;
                      } else {
                        var5 = null;
                        break L2;
                      }
                    }
                    var9.field_f = var9.field_f + 4;
                    if (var9.g(-99)) {
                      var8.a(false);
                      break L1;
                    } else {
                      jj.a(4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    jj.a(4);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  if (-2 == (var2 ^ -1)) {
                    var3 = var9.b((byte) -114);
                    var4_ref_qp = (qp) ((Object) oi.field_a.g(32073));
                    L3: while (true) {
                      L4: {
                        if (var4_ref_qp == null) {
                          break L4;
                        } else {
                          if (var3 == var4_ref_qp.field_h) {
                            break L4;
                          } else {
                            var4_ref_qp = (qp) ((Object) oi.field_a.a(false));
                            continue L3;
                          }
                        }
                      }
                      if (var4_ref_qp == null) {
                        jj.a(4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var4_ref_qp.a(false);
                        break L1;
                      }
                    }
                  } else {
                    wp.a((Throwable) null, "A1: " + ug.a(-1815), 21862);
                    jj.a(4);
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "pk.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    private final boolean b(boolean param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        ng var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = CrazyCrystals.field_B;
        if (this.field_i != null) {
          return true;
        } else {
          L0: {
            if (null == this.field_e) {
              if (!this.field_b.c((byte) -64)) {
                this.field_e = this.field_b.a(true, 18303, 255, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_e.field_n) {
            L1: {
              L2: {
                var10 = new ng(this.field_e.e(113));
                var10.field_f = 5;
                var3 = var10.h(255);
                var10.field_f = var10.field_f + var3 * 72;
                var13 = new byte[-var10.field_f + var10.field_h.length];
                var11 = var13;
                var4 = var11;
                var10.a(var13.length, var13, (byte) 87, 0);
                if (this.field_g == null) {
                  break L2;
                } else {
                  if (null == this.field_h) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_h);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length == 65) {
              if (param0) {
                var15 = ac.a(var10.field_h, 5, -5 + (-var13.length + var10.field_f), (byte) -127);
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -65) {
                    this.field_a = new ee[var3];
                    this.field_i = var10;
                    return true;
                  } else {
                    if (var15[var7] != var5[var7 - -1]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return false;
          }
        }
    }

    private pk(ob param0, ni param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_g = param2;
              this.field_h = param3;
              this.field_d = param1;
              this.field_b = param0;
              if (this.field_b.c((byte) -69)) {
                break L1;
              } else {
                this.field_e = this.field_b.a(true, 18303, 255, 255, (byte) 0);
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

            stackIn_6_1 = new StringBuilder().append("pk.<init>(");

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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_f = "Passwords must be between 5 and 20 letters and numbers";
        field_c = 480;
    }
}
