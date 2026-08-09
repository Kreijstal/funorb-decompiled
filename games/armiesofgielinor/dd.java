/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    private vo field_b;
    private java.math.BigInteger field_h;
    static String field_g;
    static wk field_k;
    private bm[] field_i;
    private bp field_d;
    private jf field_c;
    private vh field_f;
    private java.math.BigInteger field_j;
    static boolean field_a;
    static int field_e;

    final bm a(boolean param0, bc param1, int param2, int param3, bc param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        bm var9 = null;
        byte[] var13 = null;
        bm stackIn_8_0 = null;
        bm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != this.field_f) {
              L1: {
                if ((param2 ^ -1) > -1) {
                  break L1;
                } else {
                  if (this.field_i.length > param2) {
                    if (this.field_i[param2] == null) {
                      this.field_f.field_q = 72 * param2 + 6;
                      var6_int = this.field_f.i(1);
                      var7 = this.field_f.i(1);
                      var13 = new byte[64];
                      this.field_f.a(param3, 64, 0, var13);
                      var9 = new bm(param2, param1, param4, this.field_d, this.field_b, var6_int, var13, var7, param0);
                      this.field_i[param2] = var9;
                      stackIn_10_0 = (bm) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_8_0 = this.field_i[param2];
                      decompiledRegionSelector0 = 0;
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
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("dd.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static String a(int param0, int param1) {
        if (param1 != 82) {
            return (String) null;
        }
        if (param0 < 10000) {
            return Integer.toString(param0);
        }
        if ((param0 ^ -1) > -1000001) {
            return Integer.toString(param0 / 1000) + "K";
        }
        if (-1000000001 < (param0 ^ -1)) {
            return Integer.toString(param0 / 1000000) + "M";
        }
        return "A Billion";
    }

    final static int a(boolean param0) {
        if ((f.field_E ^ -1) <= -3) {
          L0: {
            if (!param0) {
              break L0;
            } else {
              field_a = false;
              break L0;
            }
          }
          L1: {
            if (0 == og.field_m) {
              if (ps.field_u.a((byte) 82)) {
                if (ps.field_u.a(28979, "commonui")) {
                  if (!sk.field_M.a((byte) 82)) {
                    return 50;
                  } else {
                    if (!sk.field_M.a(28979, "commonui")) {
                      return 60;
                    } else {
                      if (h.field_g.a((byte) 82)) {
                        if (!h.field_g.d(-27927)) {
                          return 80;
                        } else {
                          break L1;
                        }
                      } else {
                        return 70;
                      }
                    }
                  }
                } else {
                  return 40;
                }
              } else {
                return 20;
              }
            } else {
              L2: {
                if (nf.field_Nb != null) {
                  if (nf.field_Nb.a((byte) 82)) {
                    if (nf.field_Nb.a((byte) -128, "")) {
                      if (nf.field_Nb.a(28979, "")) {
                        break L2;
                      } else {
                        return 29;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L2;
                }
              }
              if (ps.field_u.a((byte) 82)) {
                if (!ps.field_u.a(28979, "commonui")) {
                  return 57;
                } else {
                  if (!sk.field_M.a((byte) 82)) {
                    return 71;
                  } else {
                    if (sk.field_M.a(28979, "commonui")) {
                      if (!h.field_g.a((byte) 82)) {
                        return 82;
                      } else {
                        if (!h.field_g.d(-27927)) {
                          return 86;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      return 80;
                    }
                  }
                }
              } else {
                return 43;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_i == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (this.field_i.length <= var2) {
              L1: {
                if (param0 == 18199) {
                  break L1;
                } else {
                  dd.b(30);
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= this.field_i.length) {
                  return;
                } else {
                  if (this.field_i[var4] != null) {
                    this.field_i[var4].b(-26132);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (null != this.field_i[var2]) {
                this.field_i[var2].d(-71);
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

    dd(bp param0, vo param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void b(int param0) {
        if (param0 > -9) {
            return;
        }
        field_k = null;
        field_g = null;
    }

    final boolean a(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        vh var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == this.field_f) {
          L0: {
            if (null == this.field_c) {
              if (this.field_d.d(param0 + 86)) {
                return false;
              } else {
                this.field_c = this.field_d.a(255, false, 255, (byte) 0, true);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (this.field_c.field_x) {
            return false;
          } else {
            var10 = new vh(this.field_c.d((byte) 43));
            if (param0 == 14) {
              L1: {
                L2: {
                  var10.field_q = 5;
                  var3 = var10.k(0);
                  var10.field_q = var10.field_q + var3 * 72;
                  var13 = new byte[var10.field_o.length - var10.field_q];
                  var11 = var13;
                  var4 = var11;
                  var10.a(0, var13.length, 0, var13);
                  if (null == this.field_h) {
                    break L2;
                  } else {
                    if (null == this.field_j) {
                      break L2;
                    } else {
                      var12 = new java.math.BigInteger(var13);
                      var7_ref_java_math_BigInteger = var12.modPow(this.field_h, this.field_j);
                      var5 = var7_ref_java_math_BigInteger.toByteArray();
                      break L1;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if ((var5.length ^ -1) == -66) {
                var15 = ua.a(-18423, -5 + (var10.field_q + -var13.length), var10.field_o, 5);
                var7 = 0;
                L3: while (true) {
                  if (-65 >= (var7 ^ -1)) {
                    this.field_i = new bm[var3];
                    this.field_f = var10;
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
              } else {
                throw new RuntimeException();
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private dd(bp param0, vo param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_d = param0;
            this.field_b = param1;
            this.field_h = param2;
            this.field_j = param3;
            if (!this.field_d.d(119)) {
                this.field_c = this.field_d.a(255, false, 255, (byte) 0, true);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Equipment";
        field_e = 0;
    }
}
