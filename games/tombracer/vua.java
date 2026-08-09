/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vua extends qr {
    static jpa field_y;
    static String field_z;
    static String field_C;
    static int field_B;
    static String[] field_D;
    static nh field_A;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 70) {
              L1: {
                L2: {
                  if (!this.a(param6, param1, -123, param3, param2)) {
                    break L2;
                  } else {
                    if (!super.a(119, param1, param2, param3, param4, param5, param6)) {
                      break L2;
                    } else {
                      stackIn_7_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_7_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("vua.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 == 0) {
          if (null != this.field_r) {
            this.field_r.a((ae) (this), param0, 16777215, param1, true);
            if (param2 == 0) {
              if (-1 != (this.field_m ^ -1)) {
                if (this.field_p != 0) {
                  afa.field_c.a((byte) 125, this.field_p + this.field_n + param1, param0 + this.field_i, this.field_n + param1, this.field_i + (param0 + this.field_m));
                  this.field_x.a(param0 + this.field_i, this.field_n + param1, param2 ^ 0, param3);
                  afa.field_c.a((byte) 38);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (param2 == 0) {
              if (-1 != (this.field_m ^ -1)) {
                if (this.field_p != 0) {
                  afa.field_c.a((byte) 125, this.field_p + this.field_n + param1, param0 + this.field_i, this.field_n + param1, this.field_i + (param0 + this.field_m));
                  this.field_x.a(param0 + this.field_i, this.field_n + param1, param2 ^ 0, param3);
                  afa.field_c.a((byte) 38);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (param2 == 0) {
            if (-1 != (this.field_m ^ -1)) {
              if (this.field_p == 0) {
                return;
              } else {
                afa.field_c.a((byte) 125, this.field_p + this.field_n + param1, param0 + this.field_i, this.field_n + param1, this.field_i + (param0 + this.field_m));
                this.field_x.a(param0 + this.field_i, this.field_n + param1, param2 ^ 0, param3);
                afa.field_c.a((byte) 38);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_A = null;
        field_D = null;
        field_y = null;
        field_z = null;
        if (param0 != -4) {
          vua.a((byte) -41);
          field_C = null;
          return;
        } else {
          field_C = null;
          return;
        }
    }

    final void c(int param0) {
        this.field_x.c((byte) -47);
        if (param0 <= 91) {
            this.c(75);
        }
    }

    final static boolean e(int param0, int param1, int param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_16_0 = false;
        int stackIn_16_1 = 0;
        int stackIn_20_0 = 0;
        if (we.b(param0, param1, 2048)) {
          if (param2 == 13650) {
            L0: {
              stackIn_15_0 = o.a(-1, param1, param0);

              if ((45056 & param0) == 0) {
                stackIn_16_0 = stackIn_15_0;
                stackIn_16_1 = 0;
                break L0;
              } else {
                stackIn_16_0 = stackIn_15_0;
                stackIn_16_1 = 1;
                break L0;
              }
            }
            if (stackIn_16_0 | stackIn_16_1 != 0 | mpa.a(false, param1, param0)) {
              return true;
            } else {
              L1: {
                if ((param1 & 55) != 0) {
                  stackIn_20_0 = 0;
                  break L1;
                } else {
                  stackIn_20_0 = 1;
                  break L1;
                }
              }
              return stackIn_20_0 != 0 & (cra.a(param1, param2 ^ -13642, param0) | wq.b(param1, param0, 8000));
            }
          } else {
            L2: {
              field_A = (nh) null;
              stackIn_5_0 = o.a(-1, param1, param0);

              if ((45056 & param0) == 0) {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = stackIn_5_0;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            if (stackIn_6_0 | stackIn_6_1 != 0 | mpa.a(false, param1, param0)) {
              return true;
            } else {
              L3: {
                if ((param1 & 55) != 0) {
                  stackIn_10_0 = 0;
                  break L3;
                } else {
                  stackIn_10_0 = 1;
                  break L3;
                }
              }
              return stackIn_10_0 != 0 & (cra.a(param1, param2 ^ -13642, param0) | wq.b(param1, param0, 8000));
            }
          }
        } else {
          return false;
        }
    }

    vua(int param0, int param1, int param2, int param3, isa param4, ae param5) {
        super(param0, param1, param2, param3, param4, (qc) null);
        try {
            this.field_x = param5;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vua.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = "If you can't take the heat, don't practise your backstroke in the lagoons of lava. I heard Arnie met his end here.";
        field_B = -1;
        field_D = new String[]{"<%0> was punctured", "<%0> was popped", "<%0> got the point", "<%0> served as an impromptu dartboard", "<%0> didn't judge the timings correctly"};
        field_z = "Spectate";
    }
}
