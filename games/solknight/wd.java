/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd {
    static String field_b;
    static int field_a;
    static volatile int field_d;
    static int field_c;

    final static void b(int param0) {
        int fieldTemp$7 = 0;
        jd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 8) {
              var1 = id.field_c;
              L1: while (true) {
                if (!ec.e(param0 ^ 7697789)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var1.e(8, -2147483648);
                  fieldTemp$7 = var1.field_m + 1;
                  var1.field_m = var1.field_m + 1;
                  var2 = fieldTemp$7;
                  db.a(var1, (byte) -115);
                  id.field_c.b(1, -var2 + var1.field_m);
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "wd.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract ha c(int param0);

    abstract byte[] a(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        if (param0 == 0) {
          stackOut_3_0 = 0;
          stackIn_5_0 = stackOut_3_0;
          L0: while (true) {
            param2--;
            if (stackIn_5_0 > param2) {
              return;
            } else {
              try {
                L1: {
                  var9 = param4;
                  var5_array = var9;
                  var6 = param1;
                  var7 = param3;
                  var9[var6] = var7 - -fi.a(var9[var6] >> -978865983, 8355711);
                  param1++;
                  if (var8 == 0) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var5 = decompiledCaughtException;
                  stackOut_11_0 = (RuntimeException) (var5);
                  stackOut_11_1 = new StringBuilder().append("wd.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (param4 == null) {
                    stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackOut_13_2 = "null";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L2;
                  } else {
                    stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackOut_12_2 = "{...}";
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L2;
                  }
                }
                throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
              }
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static pc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        pc var6 = null;
        pc stackIn_4_0 = null;
        pc stackIn_7_0 = null;
        pc stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pc stackOut_10_0 = null;
        pc stackOut_6_0 = null;
        pc stackOut_3_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var3 = 27 / ((param1 - -77) / 33);
                  var2_int = param0.indexOf('@');
                  if (var2_int != -1) {
                    var4 = param0.substring(0, var2_int);
                    var5 = param0.substring(1 + var2_int);
                    var6 = ad.b((byte) -126, var4);
                    if (var6 != null) {
                      stackOut_10_0 = (pc) (var6);
                      stackIn_11_0 = stackOut_10_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return ne.a(var5, 62);
                    }
                  } else {
                    stackOut_6_0 = h.field_a;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = gb.field_h;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("wd.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 == 8355711) {
            return;
        }
        field_a = -50;
    }

    abstract int a(int param0, byte param1);

    static {
        field_d = 0;
        field_b = "Email address is unavailable";
        field_a = 0;
    }
}
