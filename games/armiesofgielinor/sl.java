/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_a;
    int field_d;
    int field_e;
    byte[] field_c;
    int field_h;
    int field_g;
    static String field_i;
    boolean field_f;
    int[] field_j;
    private int field_b;

    final boolean a(int param0, int param1, bv param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
            if (null != this.field_c) {
              param2.a(0, param0, this.field_b, this.field_c);
              if (param1 == -1) {
                L1: {
                  this.field_b = this.field_b + param0;
                  if (this.field_b < this.field_c.length) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("sl.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    final void a(int param0, vh param1) {
        try {
            this.b(8, param1);
            param1.a(this.field_c, param0, this.field_c.length, 104);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0, vh param1) {
        int var3_int = 0;
        int var4 = 0;
        vh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        vh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.b(1, this.field_g);
              param1.b(param0 + -7, this.field_e);
              param1.b(true, this.field_d);
              stackIn_3_0 = (vh) (param1);

              stackIn_3_1 = 1;

              if (this.field_f) {
                stackIn_4_0 = (vh) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 1;
                break L1;
              } else {
                stackIn_4_0 = (vh) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 0;
                break L1;
              }
            }
            L2: {
              ((vh) (Object) stackIn_4_0).b(stackIn_4_1 != 0, stackIn_4_2);
              if (this.field_j == null) {
                param1.b(1, 0);
                break L2;
              } else {
                param1.b(1, this.field_j.length);
                var3_int = 0;
                L3: while (true) {
                  if (this.field_j.length <= var3_int) {
                    break L2;
                  } else {
                    param1.a((byte) -74, this.field_j[var3_int]);
                    var3_int++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              param1.b(1, this.field_h);
              param1.a((byte) -72, this.field_c.length);
              if (param0 == 8) {
                break L4;
              } else {
                sl.a(25);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("sl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        int var1 = -54 % ((param0 - -65) / 39);
    }

    sl(vh param0, int param1, boolean param2) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          L0: {
            L1: {
              this.field_b = -1;
              this.field_g = param0.k(0);
              this.field_e = param0.k(0);
              this.field_d = param0.e((byte) -104);
              stackIn_3_0 = this;

              if (-2 != (param0.e((byte) -104) ^ -1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((sl) (this)).field_f = stackIn_4_1 != 0;
              if (param1 <= 7) {
                break L2;
              } else {
                L3: {
                  var4_int = param0.k(0);
                  if (var4_int <= 0) {
                    break L3;
                  } else {
                    this.field_j = new int[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= this.field_j.length) {
                        break L3;
                      } else {
                        this.field_j[var5] = param0.i(1);
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
                if (param1 <= 8) {
                  break L2;
                } else {
                  this.field_h = param0.k(0);
                  break L2;
                }
              }
            }
            L5: {
              L6: {
                var4_int = param0.i(1);
                if ((var4_int ^ -1) <= -100001) {
                  break L6;
                } else {
                  if ((var4_int ^ -1) >= -1) {
                    break L6;
                  } else {
                    this.field_c = new byte[var4_int];
                    if (param2) {
                      this.field_b = 0;
                      break L5;
                    } else {
                      this.field_b = -1;
                      param0.a(0, var4_int, 0, this.field_c);
                      break L5;
                    }
                  }
                }
              }
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("sl.<init>(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    sl(int param0, int param1, ha param2, int param3, boolean param4) {
        vh var7 = null;
        try {
            this.field_e = param1;
            this.field_g = param0;
            this.field_b = -1;
            var7 = new vh(30000);
            param2.a(var7, -25771, param2.field_K.field_w);
            this.field_c = var7.g((byte) -82);
            this.field_h = param2.field_e;
            this.field_f = param4 ? true : false;
            this.field_d = param3;
            this.field_j = new int[param2.field_H.length];
            vm.a(param2.field_H, 0, this.field_j, 0, param2.field_H.length);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sl.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = "Elixirs to improve the abilities of your units.";
        field_i = "Rating";
    }
}
