/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static mh field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            CharSequence var2 = (CharSequence) null;
            jd.a((byte) -52, true, (CharSequence) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        eq var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param2 == -14970) {
              L1: {
                if (0 < param1) {
                  var8 = new byte[param3];
                  var4 = var8;
                  var5_int = 0;
                  L2: while (true) {
                    if (param3 <= var5_int) {
                      break L1;
                    } else {
                      var8[var5_int] = param0[param1 + var5_int];
                      var5_int++;
                      continue L2;
                    }
                  }
                } else {
                  var4 = param0;
                  break L1;
                }
              }
              var5 = new eq();
              var5.b((byte) 99);
              var5.a(var4, 540, (long)(param3 * 8));
              var6 = new byte[64];
              var5.a(var6, param2 ^ -14860, 0);
              stackIn_10_0 = (byte[]) (var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("jd.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (bd.a(param2, 0, param1)) {
              var3_int = 0;
              L1: while (true) {
                if (param2.length() <= var3_int) {
                  if (param0 >= 111) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    field_b = (String) null;
                    return true;
                  }
                } else {
                  if (!mh.a(true, param2.charAt(var3_int))) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("jd.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    static {
    }
}
