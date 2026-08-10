/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static double field_b;
    int[] field_c;
    int field_f;
    int field_a;
    static String field_d;
    static String field_e;

    final int a(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (this.field_c == null) {
                break L1;
              } else {
                if (0 != this.field_c.length) {
                  stackIn_7_0 = this.field_c[this.field_c.length + -1];
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 65;
        }
    }

    final static void b(int param0) {
        if (gj.field_a != null) {
            if (!(gj.field_a.h())) {
                return;
            }
        }
        gj.field_a = li.a(ke.field_h[5], 100, 96);
        int var1 = 39 / ((param0 - -87) / 39);
        na.a((byte) 125, gj.field_a);
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        byte[] var5;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (null == this.field_c) {
            break L0;
          } else {
            if (-1 == (this.field_c.length ^ -1)) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (this.field_c.length <= var3) {
                  L2: {
                    if (param0 == 0) {
                      break L2;
                    } else {
                      var5 = (byte[]) null;
                      be.a((byte[]) null, (byte) 88);
                      break L2;
                    }
                  }
                  return this.field_c.length + -1;
                } else {
                  if (this.field_c[var3 + -1] + this.field_c[var3] >> -177902559 > param1) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_d = null;
        field_e = null;
    }

    final static void a(gk param0, java.math.BigInteger param1, int param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = vb.a(105, param4);
              if (pb.field_b != null) {
                break L1;
              } else {
                pb.field_b = new java.security.SecureRandom();
                break L1;
              }
            }
            var14 = new int[4];
            var13 = var14;
            var8 = var13;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (jk.field_z == null) {
                      break L4;
                    } else {
                      if (var7_int > jk.field_z.field_g.length) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  jk.field_z = new gk(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    jk.field_z.field_h = 0;
                    jk.field_z.b(param6, param4, -2, param3);
                    jk.field_z.a(true, var7_int);
                    jk.field_z.a(30350, var14);
                    if (null == MonkeyPuzzle2.field_A) {
                      break L6;
                    } else {
                      if (MonkeyPuzzle2.field_A.field_g.length < 100) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  MonkeyPuzzle2.field_A = new gk(100);
                  break L5;
                }
                MonkeyPuzzle2.field_A.field_h = 0;
                MonkeyPuzzle2.field_A.b(10, -49152);
                var12 = 0;
                var9 = var12;
                L7: while (true) {
                  if ((var12 ^ -1) <= -5) {
                    L8: {
                      if (param2 < -76) {
                        break L8;
                      } else {
                        var11 = (byte[]) null;
                        be.a((gk) null, (java.math.BigInteger) null, 116, -40, -47, (java.math.BigInteger) null, (byte[]) null);
                        break L8;
                      }
                    }
                    MonkeyPuzzle2.field_A.c(param4, 83);
                    MonkeyPuzzle2.field_A.a((byte) -127, param1, param5);
                    param0.b(MonkeyPuzzle2.field_A.field_g, MonkeyPuzzle2.field_A.field_h, -2, 0);
                    param0.b(jk.field_z.field_g, jk.field_z.field_h, -2, 0);
                    break L0;
                  } else {
                    MonkeyPuzzle2.field_A.a(-803539344, var14[var12]);
                    var12++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = pb.field_b.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("be.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param6 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ')');
        }
    }

    final static String a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -122 % ((18 - param1) / 45);
            stackIn_1_0 = sc.a(param0, param0.length, 94, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("be.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static ad a(boolean param0, boolean param1, int param2, int param3, boolean param4) {
        if (param2 != 13271) {
            byte[] var6 = (byte[]) null;
            be.a((gk) null, (java.math.BigInteger) null, -19, 70, -21, (java.math.BigInteger) null, (byte[]) null);
        }
        return em.a(false, param3, param4, param1, !param0 ? 0 : 1, 50);
    }

    be(int param0, int param1, int param2) {
        this.field_a = param0;
        this.field_c = new int[1 + param2];
        this.field_f = param1;
    }

    static {
        field_b = Math.atan2(0.0, 1.0);
        field_e = "Email (Login):";
    }
}
