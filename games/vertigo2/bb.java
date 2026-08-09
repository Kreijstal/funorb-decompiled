/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends ji {
    static String field_G;
    private int field_E;
    static fg field_F;
    private int field_D;
    static String field_y;
    private int field_C;
    private int field_B;
    private int[] field_z;

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        int[][] var19;
        int[] var21;
        int[] var24;
        int[] var25;
        int[][] var27;
        int[] var29;
        int[] var32;
        int[] var33;
        int[][] var38;
        int[] var39;
        int[] var40;
        int[] var41;
        L0: {
          var16 = Vertigo2.field_L ? 1 : 0;
          var27 = this.field_v.a(param1, param0 ^ 3778);
          var19 = var27;
          var17 = var19;
          var3 = var17;
          if (!this.field_v.field_c) {
            break L0;
          } else {
            var38 = this.c(0, 3, param1);
            var39 = var38[0];
            var40 = var38[1];
            var41 = var38[2];
            var29 = var27[0];
            var21 = var29;
            var8 = var21;
            var32 = var27[1];
            var24 = var32;
            var9 = var24;
            var33 = var27[2];
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L1: while (true) {
              if (we.field_M <= var11) {
                break L0;
              } else {
                L2: {
                  var13 = var39[var11];
                  var12 = -this.field_z[0] + var13;
                  if ((var12 ^ -1) <= -1) {
                    break L2;
                  } else {
                    var29 = var27[0];
                    var32 = var27[1];
                    var40 = var38[1];
                    var41 = var38[2];
                    var12 = -var12;
                    break L2;
                  }
                }
                var29 = var27[0];
                var32 = var27[1];
                var40 = var38[1];
                var41 = var38[2];
                if (var12 <= this.field_B) {
                  L3: {
                    var29 = var27[0];
                    var32 = var27[1];
                    var40 = var38[1];
                    var41 = var38[2];
                    var14 = var40[var11];
                    var12 = -this.field_z[1] + var14;
                    if (-1 >= (var12 ^ -1)) {
                      break L3;
                    } else {
                      var12 = -var12;
                      break L3;
                    }
                  }
                  if (var12 > this.field_B) {
                    var29[var11] = var13;
                    var32[var11] = var14;
                    var10[var11] = var41[var11];
                    var11++;
                    continue L1;
                  } else {
                    L4: {
                      var15 = var41[var11];
                      var12 = var15 - this.field_z[2];
                      if (0 <= var12) {
                        break L4;
                      } else {
                        var12 = -var12;
                        break L4;
                      }
                    }
                    if (var12 > this.field_B) {
                      var29[var11] = var13;
                      var32[var11] = var14;
                      var33[var11] = var15;
                      var11++;
                      continue L1;
                    } else {
                      var8[var11] = var13 * this.field_E >> -1198369652;
                      var9[var11] = this.field_C * var14 >> 503917004;
                      var10[var11] = var15 * this.field_D >> -845927732;
                      var11++;
                      continue L1;
                    }
                  }
                } else {
                  var29[var11] = var13;
                  var9[var11] = var40[var11];
                  var10[var11] = var41[var11];
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
        if (param0 == -3780) {
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = param1;
              if (var5 == 0) {
                this.field_B = param2.a((byte) -11);
                break L1;
              } else {
                if (1 == var5) {
                  this.field_D = param2.a((byte) -11);
                  break L1;
                } else {
                  if (var5 != 2) {
                    if (-4 == (var5 ^ -1)) {
                      this.field_E = param2.a((byte) -11);
                      break L1;
                    } else {
                      if ((var5 ^ -1) == -5) {
                        var4_int = param2.m(0);
                        this.field_z[2] = b.a(var4_int >> 1641018380, 0);
                        this.field_z[1] = b.a(var4_int >> -2131951836, 4080);
                        this.field_z[0] = b.a(16711680, var4_int) << 1913666116;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    this.field_C = param2.a((byte) -11);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                this.field_z = (int[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("bb.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    public bb() {
        super(1, false);
        this.field_D = 4096;
        this.field_E = 4096;
        this.field_C = 4096;
        this.field_B = 409;
        this.field_z = new int[3];
    }

    public static void b(byte param0) {
        field_G = null;
        field_F = null;
        field_y = null;
        if (param0 != 76) {
            field_F = (fg) null;
        }
    }

    final static void a(boolean param0, tn param1) {
        int var2_int = 0;
        tn var3 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (null == param1.field_d) {
            return;
        }
        if (param1.field_o != 0 || -1 != (param1.field_m ^ -1)) {
            for (var2_int = 0; var2_int < no.field_d; var2_int++) {
                var3 = eo.field_l[var2_int];
                if (var3.field_s == 2 && param1.field_o == var3.field_o && param1.field_m == var3.field_m) {
                    return;
                }
            }
        }
        if (!(null == param1.field_f)) {
            uo.field_d = param1.field_a;
            jo.field_b = param1.field_s;
            tg.field_a = param1.field_b;
            fj.field_lb = param1.field_f;
        }
        if (param0) {
            return;
        }
        try {
            in.a(param1, 640);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "bb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = "Previous";
        field_G = "Waiting for animations";
    }
}
