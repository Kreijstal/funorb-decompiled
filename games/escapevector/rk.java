/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static hh field_c;
    static hj field_e;
    private ed[] field_a;
    private ed[] field_f;
    private fn[] field_g;
    static ce[] field_d;
    static boolean field_b;

    private final ed a(byte param0, int param1, ed param2, ed param3, ed param4) {
        ed stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fn var9 = null;
        fn var10 = null;
        ed var11 = null;
        fn var12 = null;
        fn var13 = null;
        try {
          L0: {
            L1: {
              var6_int = (param3.field_A + -param2.field_A) / 2;
              var7 = (-param2.field_z + param3.field_z) / 2;
              var12 = new fn(var6_int, var7);
              var6_int = -param2.field_A + (param3.field_A - var6_int);
              var7 = -param2.field_z + (param3.field_z - var7);
              var9 = new fn(var6_int, var7);
              var13 = rc.a(param1, (byte) 120, var9, var12);
              var10 = this.a(param1, param2.field_z, -29295, param2.field_A);
              if (param0 > 21) {
                break L1;
              } else {
                rk.a(104);
                break L1;
              }
            }
            var11 = new ed(var10.field_c, var10.field_b);
            em.a(oi.field_M);
            var11.g();
            param4.e(-var13.field_c, -var13.field_b);
            md.field_D.a(124);
            em.b(oi.field_M);
            stackIn_3_0 = (ed) (var11);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("rk.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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

            if (param4 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    private final fn a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        L0: {
          var5 = param3;
          var6 = param1;
          if (param0 == 16384) {
            var6 = param3;
            var5 = param1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-32769 != (param0 ^ -1)) {
            break L1;
          } else {
            var6 = param1;
            var5 = param3;
            break L1;
          }
        }
        L2: {
          if ((param0 ^ -1) == -49153) {
            var6 = param3;
            var5 = param1;
            break L2;
          } else {
            break L2;
          }
        }
        if (param2 != -29295) {
          this.field_g = (fn[]) null;
          return new fn(var5, var6);
        } else {
          return new fn(var5, var6);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 < 120) {
            rk.a(53);
        }
    }

    final ed a(int param0, int param1) {
        if (param1 != 0) {
          if (-16385 != (param1 ^ -1)) {
            if (param0 <= -63) {
              if (-32769 == (param1 ^ -1)) {
                return this.field_f[2];
              } else {
                if (-49153 != (param1 ^ -1)) {
                  return null;
                } else {
                  return this.field_f[3];
                }
              }
            } else {
              rk.a(26, -60, 78);
              if (-32769 == (param1 ^ -1)) {
                return this.field_f[2];
              } else {
                if (-49153 != (param1 ^ -1)) {
                  return null;
                } else {
                  return this.field_f[3];
                }
              }
            }
          } else {
            return this.field_f[1];
          }
        } else {
          return this.field_f[0];
        }
    }

    private final fn a(ed param0, int param1, ed param2, fn param3) {
        ed discarded$0 = null;
        fn stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fn var9 = null;
        ed var10 = null;
        try {
          L0: {
            L1: {
              var5_int = param2.field_A;
              var6 = param2.field_z;
              if (param1 == -1) {
                break L1;
              } else {
                var10 = (ed) null;
                discarded$0 = this.a((ed) null, 124, 55);
                break L1;
              }
            }
            L2: {
              var7 = param3.field_c;
              var8 = param3.field_b;
              if (param0 != null) {
                L3: {
                  if (-1 >= (param3.field_c ^ -1)) {
                    break L3;
                  } else {
                    var5_int = var5_int + -param3.field_c;
                    break L3;
                  }
                }
                L4: {
                  if ((param3.field_b ^ -1) <= -1) {
                    break L4;
                  } else {
                    var6 = var6 + -param3.field_b;
                    break L4;
                  }
                }
                L5: {
                  var7 = var5_int - param0.field_A;
                  var8 = -param0.field_z + var6;
                  if (-1 >= (param3.field_c ^ -1)) {
                    var7 = var7 - param3.field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (-1 >= (param3.field_b ^ -1)) {
                  var8 = var8 - param3.field_b;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var9 = new fn(var7, var8);
            stackIn_15_0 = (fn) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("rk.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ')');
        }
        return stackIn_15_0;
    }

    final fn a(byte param0, int param1) {
        if (-1 == (param1 ^ -1)) {
            return this.field_g[0];
        }
        if (!(16384 != param1)) {
            return this.field_g[1];
        }
        if (!(-32769 != (param1 ^ -1))) {
            return this.field_g[2];
        }
        int var3 = 6 % ((-71 - param0) / 35);
        if (!(param1 != 49152)) {
            return this.field_g[3];
        }
        return null;
    }

    private final ed a(ed param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ed var4 = null;
        int var5 = 0;
        int var6 = 0;
        ed stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_A;
              if (param0.field_z > var3_int) {
                var3_int = param0.field_z;
                break L1;
              } else {
                break L1;
              }
            }
            var4 = new ed(var3_int, var3_int);
            var5 = (var3_int + -param0.field_A) / 2;
            var6 = (-param0.field_z + var3_int) / param1;
            em.a(oi.field_M);
            var4.g();
            param0.e(var5, var6);
            md.field_D.a(param1 ^ 126);
            em.b(oi.field_M);
            stackIn_4_0 = (ed) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("rk.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final ed a(boolean param0, int param1) {
        if (param0) {
            field_e = (hj) null;
            if (0 == param1) {
                return this.field_a[0];
            }
            if (!(-16385 != (param1 ^ -1))) {
                return this.field_a[1];
            }
            if (-32769 == (param1 ^ -1)) {
                return this.field_a[2];
            }
            if (!(49152 != param1)) {
                return this.field_a[3];
            }
            return null;
        }
        if (0 == param1) {
            return this.field_a[0];
        }
        if (!(-16385 != (param1 ^ -1))) {
            return this.field_a[1];
        }
        if (-32769 == (param1 ^ -1)) {
            return this.field_a[2];
        }
        if (!(49152 != param1)) {
            return this.field_a[3];
        }
        return null;
    }

    rk(ed param0, ed param1, fn param2) {
        int var4_int = 0;
        int var5 = 0;
        fn var6 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            this.field_a = new ed[sc.field_h.length];
            this.field_f = new ed[sc.field_h.length];
            this.field_g = new fn[sc.field_h.length];
            var4_int = 0;
            L1: while (true) {
              if (this.field_a.length <= var4_int) {
                break L0;
              } else {
                var5 = sc.field_h[var4_int];
                this.field_a[var4_int] = this.a(param0, -67, var5);
                this.field_f[var4_int] = this.a(param1, -53, var5);
                var6 = this.a(param1, -1, param0, param2);
                this.field_g[var4_int] = rc.a(var5, (byte) 124, var6, param2);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("rk.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 11710) {
            return;
        }
        rn.field_e = param1;
        ng.field_nb = param0;
    }

    private final ed a(ed param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ed var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ed var10 = null;
        ed var11 = null;
        ed stackIn_5_0 = null;
        ed stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var4_int = 4096;
              var5 = this.a(param0, 2);
              if (param1 <= -37) {
                var6 = var5.field_A;
                var7 = var5.field_z;
                var8 = var6 / 2;
                var9 = var7 / 2;
                var10 = new ed(var6, var7);
                em.a(oi.field_M);
                var10.g();
                var5.a(var8, (byte) 34, var4_int, param2, var9);
                md.field_D.a(124);
                em.b(oi.field_M);
                var11 = this.a((byte) 100, param2, param0, var5, var10);
                stackIn_7_0 = (ed) (var11);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (ed) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("rk.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
    }
}
