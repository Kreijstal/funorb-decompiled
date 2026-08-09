/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    private ji field_g;
    private uf field_f;
    private sd field_h;
    private java.math.BigInteger field_e;
    private java.math.BigInteger field_c;
    private bj[] field_d;
    static String field_a;
    private qc field_b;

    final static boolean b(int param0) {
        if (param0 != 255) {
            return false;
        }
        if (null == vl.field_n) {
            return false;
        }
        nb.a(-2, vl.field_n);
        vl.field_n.a(0, ka.field_i);
        vl.field_n = null;
        return true;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_10_0 = 0;
        L0: {
          if (param1 == 97) {
            break L0;
          } else {
            field_a = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (65 > param0) {
                break L3;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (97 > param0) {
                break L4;
              } else {
                if (param0 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackIn_10_0 = 0;
            break L1;
          }
          stackIn_10_0 = 1;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    public static void a(int param0) {
        if (param0 < 8) {
            return;
        }
        field_a = null;
    }

    em(ji param0, uf param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final bj a(int param0, byte param1, boolean param2, jh param3, jh param4) {
        bj stackIn_9_0 = null;
        bj stackIn_13_0 = null;
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
        bj var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_b == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if ((param0 ^ -1) > -1) {
                  break L1;
                } else {
                  if (this.field_d.length > param0) {
                    if (null == this.field_d[param0]) {
                      L2: {
                        this.field_b.field_f = 6 + 72 * param0;
                        var6_int = this.field_b.a((byte) -108);
                        var7 = this.field_b.a((byte) -55);
                        var13 = new byte[64];
                        if (param1 == -9) {
                          break L2;
                        } else {
                          this.field_h = (sd) null;
                          break L2;
                        }
                      }
                      this.field_b.b(29915, 64, var13, 0);
                      var9 = new bj(param0, param4, param3, this.field_g, this.field_f, var6_int, var13, var7, param2);
                      this.field_d[param0] = var9;
                      stackIn_13_0 = (bj) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_9_0 = this.field_d[param0];
                      decompiledRegionSelector0 = 0;
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
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("em.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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

            if (param4 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        bj stackIn_16_0 = null;
        var3 = Geoblox.field_C;
        if (null == this.field_d) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (this.field_d.length <= var2) {
              L1: {
                if (param0 == -65) {
                  break L1;
                } else {
                  em.a('', 15);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_d.length) {
                  return;
                } else {
                  if (null != this.field_d[var2]) {
                    stackIn_16_0 = this.field_d[var2];
                    ((bj) (Object) stackIn_16_0).b((byte) -38);
                    var2++;
                    continue L2;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              }
            } else {
              if (this.field_d[var2] != null) {
                this.field_d[var2].a(6924);
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

    final boolean b(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        qc var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Geoblox.field_C;
        if (null != this.field_b) {
          return true;
        } else {
          L0: {
            if (this.field_h == null) {
              if (this.field_g.g(20)) {
                return false;
              } else {
                this.field_h = this.field_g.a((byte) 0, 255, -21, 255, true);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (param0 > 121) {
            if (this.field_h.field_u) {
              return false;
            } else {
              L1: {
                L2: {
                  var10 = new qc(this.field_h.e(397));
                  var10.field_f = 5;
                  var3 = var10.c((byte) 34);
                  var10.field_f = var10.field_f + var3 * 72;
                  var13 = new byte[var10.field_j.length + -var10.field_f];
                  var11 = var13;
                  var4 = var11;
                  var10.b(29915, var13.length, var13, 0);
                  if (this.field_c == null) {
                    break L2;
                  } else {
                    if (this.field_e != null) {
                      var12 = new java.math.BigInteger(var13);
                      var7_ref_java_math_BigInteger = var12.modPow(this.field_c, this.field_e);
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
              if (-66 != (var5.length ^ -1)) {
                throw new RuntimeException();
              } else {
                var15 = wh.a(-var13.length + var10.field_f - 5, 5, var10.field_j, 8);
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -65) {
                    this.field_b = var10;
                    this.field_d = new bj[var3];
                    return true;
                  } else {
                    if (var15[var7] != var5[1 + var7]) {
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
            return false;
          }
        }
    }

    private em(ji param0, uf param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_e = param3;
              this.field_f = param1;
              this.field_g = param0;
              if (this.field_g.g(20)) {
                break L1;
              } else {
                this.field_h = this.field_g.a((byte) 0, 255, -21, 255, true);
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

            stackIn_6_1 = new StringBuilder().append("em.<init>(");

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 53) {
                break L1;
              } else {
                em.a(26);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0.length() < wg.field_m) {
                  break L2;
                } else {
                  if (param0.length() <= bm.field_j) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_7_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("em.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    static {
        field_a = "Replay tutorial";
    }
}
