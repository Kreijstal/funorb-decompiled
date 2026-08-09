/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends gi {
    static rf field_i;
    static ge field_h;
    static qe field_j;

    public static void d(int param0) {
        if (param0 != 1) {
            field_j = (qe) null;
        }
        field_h = null;
        field_j = null;
        field_i = null;
    }

    final static short[] a(lh param0, byte param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4_int = param0.e(param2, (byte) 18);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (var4_int == param3.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = -84 % ((-44 - param1) / 46);
                var6 = param0.e(4, (byte) -122);
                var7 = (short)param0.e(16, (byte) 90);
                if ((var6 ^ -1) < -1) {
                  var8 = 0;
                  L4: while (true) {
                    if (var4_int <= var8) {
                      break L3;
                    } else {
                      param3[var8] = (short)(param0.e(var6, (byte) -107) + var7);
                      var8++;
                      continue L4;
                    }
                  }
                } else {
                  var8 = 0;
                  L5: while (true) {
                    if (var8 >= var4_int) {
                      break L3;
                    } else {
                      param3[var8] = (short)var7;
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
              stackIn_16_0 = (short[]) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("uj.C(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_16_0;
        }
    }

    final static int a(byte param0, int param1) {
        int var2;
        int var3;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          ea.field_a = null;
          hf.field_C = 0;
          tc.field_e = null;
          var2 = j.field_ib;
          j.field_ib = vc.field_e;
          p.field_a.field_c = p.field_a.field_c + 1;
          vc.field_e = var2;
          if ((param1 ^ -1) == -52) {
            p.field_a.field_h = 2;
            break L0;
          } else {
            if (param1 != 50) {
              p.field_a.field_h = 1;
              break L0;
            } else {
              p.field_a.field_h = 5;
              break L0;
            }
          }
        }
        L1: {
          if (p.field_a.field_c < 2) {
            break L1;
          } else {
            if ((param1 ^ -1) != -52) {
              break L1;
            } else {
              return 2;
            }
          }
        }
        L2: {
          if (-3 < (p.field_a.field_c ^ -1)) {
            break L2;
          } else {
            if (param1 == 50) {
              return 5;
            } else {
              break L2;
            }
          }
        }
        if (-5 < (p.field_a.field_c ^ -1)) {
          L3: {
            if (param0 == 85) {
              break L3;
            } else {
              field_h = (ge) null;
              break L3;
            }
          }
          return -1;
        } else {
          return 1;
        }
    }

    private uj() throws Throwable {
        throw new Error();
    }

    static {
    }
}
