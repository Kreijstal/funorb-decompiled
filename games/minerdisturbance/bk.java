/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk {
    static String field_b;
    private ij[] field_a;
    private nm field_e;
    private sb field_d;
    private java.math.BigInteger field_f;
    private ee field_h;
    private java.math.BigInteger field_g;
    private ch field_c;

    final ij a(int param0, uh param1, boolean param2, int param3, uh param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ij var9 = null;
        byte[] var13 = null;
        ij stackIn_8_0 = null;
        ij stackIn_10_0 = null;
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
            if (this.field_d != null) {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 >= this.field_a.length) {
                    break L1;
                  } else {
                    if (this.field_a[param0] == null) {
                      this.field_d.field_o = 6 + 72 * param0;
                      var6_int = this.field_d.b((byte) 76);
                      var7 = this.field_d.b((byte) 33);
                      var13 = new byte[64];
                      this.field_d.a(var13, (byte) -120, param3, 64);
                      var9 = new ij(param0, param1, param4, this.field_c, this.field_e, var6_int, var13, var7, param2);
                      this.field_a[param0] = var9;
                      stackIn_10_0 = (ij) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_8_0 = this.field_a[param0];
                      decompiledRegionSelector0 = 0;
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
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("bk.C(").append(param0).append(',');

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
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    bk(ch param0, nm param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(byte param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        sb var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = MinerDisturbance.field_ab;
        if (null == this.field_d) {
          L0: {
            if (null == this.field_h) {
              if (!this.field_c.d((byte) -111)) {
                this.field_h = this.field_c.a((byte) 0, -21, true, 255, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_h.field_C) {
            L1: {
              L2: {
                var10 = new sb(this.field_h.c((byte) -115));
                var10.field_o = 5;
                var3 = var10.d((byte) -54);
                var10.field_o = var10.field_o + var3 * 72;
                var13 = new byte[var10.field_u.length + -var10.field_o];
                var11 = var13;
                var4 = var11;
                var10.a(var4, (byte) -120, 0, var13.length);
                if (this.field_g == null) {
                  break L2;
                } else {
                  if (this.field_f == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_f);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              L3: {
                var15 = wb.a(-5 + -var13.length + var10.field_o, 5, var10.field_u, 18738);
                if (param0 == 16) {
                  break L3;
                } else {
                  this.field_c = (ch) null;
                  break L3;
                }
              }
              var7 = 0;
              L4: while (true) {
                if ((var7 ^ -1) <= -65) {
                  this.field_d = var10;
                  this.field_a = new ij[var3];
                  return true;
                } else {
                  if (var15[var7] != var5[var7 + 1]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void b(byte param0) {
        int var1 = -111 / ((param0 - -51) / 58);
        field_b = null;
    }

    final void a(int param0) {
        int var2;
        int var3;
        ij stackIn_10_0 = null;
        var3 = MinerDisturbance.field_ab;
        if (null != this.field_a) {
          var2 = param0;
          L0: while (true) {
            if (var2 >= this.field_a.length) {
              var2 = 0;
              L1: while (true) {
                if (this.field_a.length <= var2) {
                  return;
                } else {
                  stackIn_10_0 = this.field_a[var2];
                  if (stackIn_10_0 != null) {
                    this.field_a[var2].c(param0 ^ 0);
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (this.field_a[var2] != null) {
                this.field_a[var2].b((byte) 40);
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

    final static void a(byte param0, int param1) {
        try {
            IOException iOException = null;
            int var2 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == ci.field_i) {
                break L0;
              } else {
                L1: {
                  if (0 > param1) {
                    break L1;
                  } else {
                    if (pb.field_c == qd.field_Q) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  var2 = -19 % ((-8 - param0) / 45);
                  if (sn.field_c.field_o != 0) {
                    break L2;
                  } else {
                    if (10000L + ck.field_d < sf.a((byte) 116)) {
                      sn.field_c.d((byte) -69, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 > (sn.field_c.field_o ^ -1)) {
                    try {
                      L4: {
                        ci.field_i.a((byte) 124, sn.field_c.field_u, sn.field_c.field_o, 0);
                        ck.field_d = sf.a((byte) 115);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        si.a(-95);
                        break L5;
                      }
                    }
                    sn.field_c.field_o = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            sn.field_c.field_o = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private bk(ch param0, nm param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_c = param0;
              this.field_e = param1;
              this.field_f = param3;
              if (this.field_c.d((byte) -111)) {
                break L1;
              } else {
                this.field_h = this.field_c.a((byte) 0, -21, true, 255, 255);
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

            stackIn_6_1 = new StringBuilder().append("bk.<init>(");

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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_b = "Passwords can only contain letters and numbers";
    }
}
