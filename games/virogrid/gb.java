/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends tg {
    static jf field_H;
    private nd field_I;
    int field_K;
    private int field_G;
    int field_J;
    static int[] field_F;
    static int field_N;
    static String field_L;
    static String field_M;

    final static void c(byte param0) {
        if (param0 != -44) {
          return;
        } else {
          nk.field_K = si.a(vm.field_d, new double[]{0.0, 0.0, 0.0}, new double[]{0.0, 1.0, 0.0});
          pe.field_j = si.b(nk.field_K);
          return;
        }
    }

    public static void e(int param0) {
        field_H = null;
        if (param0 <= 112) {
          gb.a(-40, -4, false, -93);
          field_M = null;
          field_L = null;
          field_F = null;
          return;
        } else {
          field_M = null;
          field_L = null;
          field_F = null;
          return;
        }
    }

    final static boolean g(boolean param0) {
        if (!param0) {
            return false;
        }
        return ak.b(-31609);
    }

    final int a(int param0, int param1) {
        if ((param1 ^ -1) <= param0) {
          if (param1 >= this.field_I.a(false)) {
            return -1;
          } else {
            return this.field_I.a(param1, (byte) -104);
          }
        } else {
          return -1;
        }
    }

    final int d(byte param0) {
        if (param0 >= -19) {
            return 121;
        }
        return this.field_I.a(false);
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_24_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -this.field_J + param6 - param3;
                var9 = -(this.field_J * 2) + this.field_g;
                if (var9 >= var8_int) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if (0 > var8_int) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * this.field_G / var9;
                if (-2 != (param1 ^ -1)) {
                  if (2 == param1) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_I.a(param2) <= var12) {
                        if ((var11 ^ -1) > -1) {
                          break L3;
                        } else {
                          this.field_I.a((byte) 99, var11);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + this.field_I.a(var12, (byte) -18);
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var10 = var13;
                            var11 = var12;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  this.field_I.b(-1, var8_int);
                  break L3;
                }
              }
              stackIn_22_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var8);

            stackIn_27_1 = new StringBuilder().append("gb.NA(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0 != 0;
        } else {
          return stackIn_24_0 != 0;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        L0: {
          bd.field_e = param1;
          hm.field_c = param3;
          we.field_l = 0;
          if (!mf.a(param0 ^ -95, hm.field_c)) {
            break L0;
          } else {
            var4 = 0;
            al.field_j[hm.field_c].a((byte) 119, var4, param2);
            break L0;
          }
        }
        L1: {
          if (3 == (hm.field_c ^ -1)) {
            em.field_c = 84.0f;
            ec.field_z = 3.1415927410125732f;
            jk.field_c = 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != -2) {
          field_H = (jf) null;
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 2147483647) {
            this.field_G = 123;
            return this.field_G;
        }
        return this.field_G;
    }

    private gb() throws Throwable {
        throw new Error();
    }

    static {
        field_L = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_N = 9;
        field_M = "Players: <%0>/<%1>";
    }
}
