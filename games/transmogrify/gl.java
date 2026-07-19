/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends fi {
    static pg field_B;
    static String field_C;
    static String field_z;
    static int field_D;
    static int field_y;
    int field_A;

    public gl() {
        super(0, 0, 0, 0, (ui) null, (ma) null);
        this.field_A = 256;
    }

    gl(qg param0) {
        super(param0.field_p, param0.field_n, param0.field_l, param0.field_h, (ui) null, (ma) null);
        try {
            param0.a(-128, 0, 0, this.field_l, this.field_h);
            this.field_v = param0;
            this.field_A = 256;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_C = null;
        field_z = null;
        field_B = null;
        if (param0 != 2483) {
            gl.j(-39);
        }
    }

    final static void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2, byte[] param3, oa param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = ta.a(0, param5);
              if (null == i.field_a) {
                i.field_a = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var12 = new int[4];
            var11 = var12;
            var8 = var11;
            var9 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if ((var9 ^ -1) <= -5) {
                      break L5;
                    } else {
                      var8[var9] = i.field_a.nextInt();
                      var9++;
                      if (var10 != 0) {
                        break L4;
                      } else {
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (pg.field_b == null) {
                    break L4;
                  } else {
                    if (var7_int <= pg.field_b.field_g.length) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                pg.field_b = new oa(var7_int);
                break L3;
              }
              L6: {
                L7: {
                  pg.field_b.field_h = 0;
                  pg.field_b.a((byte) -10, param3, param5, param6);
                  pg.field_b.h(-30190, var7_int);
                  pg.field_b.a(var12, 111);
                  if (kd.field_c == null) {
                    break L7;
                  } else {
                    if ((kd.field_c.field_g.length ^ -1) > -101) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                kd.field_c = new oa(100);
                break L6;
              }
              kd.field_c.field_h = 0;
              kd.field_c.f(6389, 10);
              var9 = 0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (4 <= var9) {
                      break L10;
                    } else {
                      kd.field_c.a(-119, var12[var9]);
                      var9++;
                      if (var10 != 0) {
                        break L9;
                      } else {
                        if (var10 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  kd.field_c.c(param5, -159688920);
                  kd.field_c.a(param2, -119, param1);
                  param4.a((byte) -29, kd.field_c.field_g, kd.field_c.field_h, 0);
                  param4.a((byte) -108, pg.field_b.field_g, pg.field_b.field_h, 0);
                  break L9;
                }
                if (param0 < -116) {
                  break L0;
                } else {
                  field_B = (pg) null;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var7);
            stackOut_26_1 = new StringBuilder().append("gl.A(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          L12: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L12;
            }
          }
          L13: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L13;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L13;
            }
          }
          L14: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param4 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L14;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L14;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var6 = 0;
        ti var7 = null;
        if (0 == param2) {
          if (this.field_v == null) {
            return;
          } else {
            if (this.field_A == 0) {
              return;
            } else {
              if (256 == this.field_A) {
                this.field_v.a(param0 - -this.field_p, this.field_n + param1, param2, (byte) -12);
                return;
              } else {
                var6 = -59 / ((77 - param3) / 34);
                var7 = new ti(this.field_v.field_l, this.field_v.field_h);
                oj.a(var7, 256);
                this.field_v.a(0, 0, param2, (byte) -117);
                fi.c(true);
                var7.e(this.field_p + param0, this.field_n + param1, this.field_A);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void j(int param0) {
        if (param0 == 31107) {
          L0: {
            if (null != re.field_h) {
              re.field_h.d();
              break L0;
            } else {
              break L0;
            }
          }
          if (u.field_a != null) {
            u.field_a.d();
            return;
          } else {
            return;
          }
        } else {
          L1: {
            field_B = (pg) null;
            if (null != re.field_h) {
              re.field_h.d();
              break L1;
            } else {
              break L1;
            }
          }
          if (u.field_a == null) {
            return;
          } else {
            u.field_a.d();
            return;
          }
        }
    }

    static {
        field_z = "Just play";
        field_C = "This entry doesn't match";
        field_D = 0;
    }
}
