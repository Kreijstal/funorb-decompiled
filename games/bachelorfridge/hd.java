/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends oha {
    private int field_p;
    static int field_m;
    private int field_o;
    private int field_n;
    static String field_r;
    int field_q;

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -2) {
            break L0;
          } else {
            this.field_p = -128;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-2 < (this.field_n ^ -1)) {
              break L2;
            } else {
              if (0 > this.field_p) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    hd(int param0, int param1, int param2, String param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        super(4, param0, param1, param2, 0, param11);
        try {
            this.field_p = param8;
            this.field_f = param3;
            this.field_o = param6;
            this.field_q = param5;
            this.field_k = param4;
            this.field_n = param9;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
            field_r = (String) null;
        }
        if (-18 == (this.field_o ^ -1)) {
            return 3;
        }
        if (this.field_p == 0 && this.field_n == 0) {
            return 1;
        }
        if ((this.field_p ^ -1) != -2 || 1 != this.field_n) {
            if (this.c((byte) -96)) {
                return 0;
            }
            throw new IllegalStateException("This special doesn't have a defined range. Fix it.");
        }
        return 2;
    }

    final static byte[] a(byte[] param0, pf param1, byte param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_19_0 = null;
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
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var4_int = param1.d(param3, (byte) -108);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (var4_int != param0.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new byte[var4_int];
                break L1;
              }
              var5 = param1.d(3, (byte) 87);
              var6 = (byte)param1.d(8, (byte) -117);
              if (param2 > 89) {
                L3: {
                  if (0 < var5) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param0[var7] = (byte)(param1.d(var5, (byte) 48) + var6);
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
                        param0[var7] = (byte)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (byte[]) (param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_10_0 = (byte[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("hd.J(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_19_0;
        }
    }

    public static void d(int param0) {
        field_r = null;
        if (param0 != 1) {
            field_m = 97;
        }
    }

    private final boolean c(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -96) {
            break L0;
          } else {
            field_r = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_p != 0) {
              break L2;
            } else {
              if (this.field_n != 7) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        field_r = "Play free version";
        field_m = -1;
    }
}
