/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa {
    private di[] field_b;
    private uf field_f;
    private rb field_j;
    static ka field_e;
    private java.math.BigInteger field_h;
    private java.math.BigInteger field_i;
    static int field_g;
    static pe field_k;
    private vb field_c;
    private db field_d;
    static int[] field_a;

    oa(vb param0, rb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final di a(int param0, la param1, boolean param2, byte param3, la param4) {
        di stackIn_9_0 = null;
        di stackIn_13_0 = null;
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
        di var9 = null;
        byte[] var13 = null;
        try {
          L0: {
            if (this.field_f == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if ((param0 ^ -1) > -1) {
                  break L1;
                } else {
                  if (param0 >= this.field_b.length) {
                    break L1;
                  } else {
                    if (this.field_b[param0] == null) {
                      L2: {
                        if (param3 == 15) {
                          break L2;
                        } else {
                          this.a(87);
                          break L2;
                        }
                      }
                      this.field_f.field_q = 6 + 72 * param0;
                      var6_int = this.field_f.i(param3 ^ 41);
                      var7 = this.field_f.i(97);
                      var13 = new byte[64];
                      this.field_f.a(84, var13, 64, 0);
                      var9 = new di(param0, param1, param4, this.field_c, this.field_j, var6_int, var13, var7, param2);
                      this.field_b[param0] = var9;
                      stackIn_13_0 = (di) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_9_0 = this.field_b[param0];
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

            stackIn_16_1 = new StringBuilder().append("oa.F(").append(param0).append(',');

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


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    public static void b(int param0) {
        if (param0 < 78) {
          field_a = (int[]) null;
          field_k = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_k = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static bf a(boolean param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        Random var8 = null;
        pa var9 = null;
        lh var10 = null;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          var9 = id.field_b;
          var3 = var9.j(-98);
          if (0 == (128 & var3)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          o.field_m = stackIn_3_0 != 0;
          uk.field_L = 127 & var3;
          ih.field_K = var9.j(-85);
          ik.field_b = var9.k(-123);
          if (uk.field_L != 2) {
            hc.field_O = 0;
            hf.field_e = 0;
            break L1;
          } else {
            hc.field_O = var9.c(false);
            hf.field_e = var9.g(0);
            break L1;
          }
        }
        L2: {
          if (param1) {
            break L2;
          } else {
            var8 = (Random) null;
            oa.a((byte) -112, 80, (Random) null);
            break L2;
          }
        }
        L3: {
          if (1 != var9.j(-111)) {
            stackIn_11_0 = 0;
            break L3;
          } else {
            stackIn_11_0 = 1;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_11_0;
          vc.field_f = var9.b(false);
          if (var4 == 0) {
            lk.field_b = vc.field_f;
            break L4;
          } else {
            lk.field_b = var9.b(false);
            break L4;
          }
        }
        L5: {
          if (-2 == (uk.field_L ^ -1)) {
            var9.c(false);
            var9.b(false);
            break L5;
          } else {
            if ((uk.field_L ^ -1) == -5) {
              var9.c(false);
              var9.b(false);
              break L5;
            } else {
              break L5;
            }
          }
        }
        if (!param0) {
          td.field_q = kk.a(var9, -77, 80);
          eb.field_k = null;
          return new bf(param0);
        } else {
          var5 = var9.c(false);
          try {
            L6: {
              L7: {
                var10 = ie.field_a.a(var5, (byte) -104);
                td.field_q = var10.b(true);
                if (lk.field_b.equals(mf.field_a)) {
                  stackIn_24_0 = null;
                  break L7;
                } else {
                  stackIn_24_0 = var10.field_x;
                  break L7;
                }
              }
              eb.field_k = stackIn_24_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L8: {
              var6 = (Exception) (Object) decompiledCaughtException;
              td.a("CC1", (Throwable) ((Object) var6), (byte) -80);
              eb.field_k = null;
              td.field_q = null;
              break L8;
            }
          }
          return new bf(param0);
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        di stackIn_10_0 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (this.field_b != null) {
          var2 = 0;
          L0: while (true) {
            if (this.field_b.length <= var2) {
              var2 = 0;
              L1: while (true) {
                if (this.field_b.length <= var2) {
                  if (param0 >= -94) {
                    oa.a(true, false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  stackIn_10_0 = this.field_b[var2];
                  if (stackIn_10_0 != null) {
                    this.field_b[var2].c(-91);
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if (this.field_b[var2] != null) {
                this.field_b[var2].a((byte) -112);
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

    final boolean a(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        int var7;
        int var8;
        byte[] var9;
        uf var10;
        byte[] var11;
        byte[] var13;
        byte[] var14;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        java.math.BigInteger var12;
        byte[] var15;
        byte[] var17;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (this.field_f != null) {
          return true;
        } else {
          L0: {
            if (null == this.field_d) {
              if (!this.field_c.b((byte) 100)) {
                this.field_d = this.field_c.a(true, 255, 255, (byte) 0, 101);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_d.field_v) {
            var10 = new uf(this.field_d.e(2));
            var10.field_q = 5;
            var3 = var10.j(-87);
            var10.field_q = var10.field_q + 72 * var3;
            var13 = new byte[-var10.field_q + var10.field_m.length];
            var11 = var13;
            var4 = var11;
            var10.a(param0 + 12048, var4, var13.length, 0);
            if (this.field_i != null) {
              if (this.field_h != null) {
                var12 = new java.math.BigInteger(var13);
                var7_ref_java_math_BigInteger = var12.modPow(this.field_i, this.field_h);
                var5 = var7_ref_java_math_BigInteger.toByteArray();
                if ((var5.length ^ -1) != -66) {
                  throw new RuntimeException();
                } else {
                  var17 = qc.a(var10.field_m, -5 + (-var13.length + var10.field_q), (byte) -66, 5);
                  var7 = 0;
                  if (param0 == -11982) {
                    L1: while (true) {
                      if (-65 < (var7 ^ -1)) {
                        if (var17[var7] == var5[var7 - -1]) {
                          var7++;
                          continue L1;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        this.field_b = new di[var3];
                        this.field_f = var10;
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                var5 = var4;
                if ((var5.length ^ -1) != -66) {
                  throw new RuntimeException();
                } else {
                  var15 = qc.a(var10.field_m, -5 + (-var13.length + var10.field_q), (byte) -66, 5);
                  var9 = var15;
                  var7 = 0;
                  if (param0 == -11982) {
                    L2: while (true) {
                      if (-65 < (var7 ^ -1)) {
                        if (var15[var7] == var5[var7 - -1]) {
                          var7++;
                          continue L2;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        this.field_b = new di[var3];
                        this.field_f = var10;
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              var5 = var4;
              if ((var5.length ^ -1) != -66) {
                throw new RuntimeException();
              } else {
                var14 = qc.a(var10.field_m, -5 + (-var13.length + var10.field_q), (byte) -66, 5);
                var9 = var14;
                var7 = 0;
                if (param0 == -11982) {
                  L3: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var14[var7] == var5[var7 - -1]) {
                        var7++;
                        continue L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      this.field_b = new di[var3];
                      this.field_f = var10;
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (-1 <= (param1 ^ -1)) {
              throw new IllegalArgumentException();
            } else {
              if (i.a(17004, param1)) {
                stackIn_7_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param1 >> 949195872);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  if (param0 <= -72) {
                    break L1;
                  } else {
                    field_g = 77;
                    break L1;
                  }
                }
                var3_int = -2147483648 + -(int)(4294967296L % (long)param1);
                L2: while (true) {
                  var4 = param2.nextInt();
                  if (var3_int <= var4) {
                    continue L2;
                  } else {
                    stackIn_13_0 = v.d(-110, var4, param1);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("oa.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_13_0;
        }
    }

    private oa(vb param0, rb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              this.field_i = param2;
              this.field_h = param3;
              this.field_c = param0;
              this.field_j = param1;
              if (this.field_c.b((byte) 100)) {
                break L1;
              } else {
                this.field_d = this.field_c.a(true, 255, 255, (byte) 0, 71);
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

            stackIn_6_1 = new StringBuilder().append("oa.<init>(");

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
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_g = -1;
        field_e = new ka(160, 160);
        field_a = new int[]{416, 433, 180, 39};
    }
}
