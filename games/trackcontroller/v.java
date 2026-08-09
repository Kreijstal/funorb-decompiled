/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v implements eh {
    static int field_f;
    static String field_d;
    static long field_a;
    private long field_b;
    static boolean field_e;
    static int[] field_g;
    static String field_c;

    final static void e(int param0) {
        if (ge.field_D) {
          bc.field_d = true;
          if (param0 != 6) {
            return;
          } else {
            wg.a(param0 + -107, true);
            rl.field_N = 0;
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        la var12 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -31) {
                break L1;
              } else {
                var12 = (la) null;
                v.a(-84, (short[]) null, (la) null, 49);
                break L1;
              }
            }
            L2: {
              var4_int = param3.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (-1 != (var7 ^ -1)) {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param3.indexOf((int) param0, var8_int);
                  if ((var8_int ^ -1) <= -1) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param3.indexOf((int) param0, var9);
              if (-1 >= (var10 ^ -1)) {
                discarded$0 = var8.append(param3.substring(var9, var10));
                var9 = 1 + var10;
                discarded$1 = var8.append(param2);
                continue L4;
              } else {
                discarded$2 = var8.append(param3.substring(var9));
                stackIn_14_0 = var8.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("v.S(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    abstract ud f(int param0);

    public final void a(int param0) {
        int var2 = 68 / ((-9 - param0) / 50);
        this.field_b = qg.a(false);
    }

    public final ud a(byte param0) {
        if (this.b(24685)) {
            return c.field_a;
        }
        if (!(qg.a(false) >= this.field_b - -350L)) {
            return lh.field_x;
        }
        int var2 = 35 / ((param0 - 55) / 49);
        return this.f(38);
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    public final String c(int param0) {
        if (!this.b(24685)) {
          if (qg.a(false) >= 350L + this.field_b) {
            if (param0 != 15914) {
              this.field_b = 72L;
              return this.b((byte) 22);
            } else {
              return this.b((byte) 22);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract String b(byte param0);

    final static short[] a(int param0, short[] param1, la param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_3_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 >= 26) {
              var4_int = param2.d(0, param0);
              if (0 != var4_int) {
                L1: {
                  L2: {
                    if (param1 == null) {
                      break L2;
                    } else {
                      if (var4_int != param1.length) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param1 = new short[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param2.d(0, 4);
                  var6 = (short)param2.d(0, 16);
                  if (-1 <= (var5 ^ -1)) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param1[var7] = (short)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param1[var7] = (short)(var6 + param2.d(0, var5));
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (short[]) (param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_3_0 = (short[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("v.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    static {
        field_d = "Just play";
        field_a = 0L;
        field_g = new int[]{6, 6, 9, 9, 18, 18};
        field_c = "Loading fonts";
    }
}
