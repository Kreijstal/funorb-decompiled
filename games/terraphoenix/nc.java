/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static dh field_c;
    static int[] field_a;
    static String field_b;

    final static String[] a(int param0, String param1, char param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param1);
            var3_int = ld.a(param2, var10, 124);
            var4 = new String[var3_int - -1];
            var5 = 0;
            var6 = 0;
            if (param0 == 14352) {
              var7 = 0;
              L1: while (true) {
                if (var3_int <= var7) {
                  var4[var3_int] = param1.substring(var6);
                  stackIn_11_0 = (String[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    if (param2 == param1.charAt(var8)) {
                      incrementValue$1 = var5;
                      var5++;
                      var4[incrementValue$1] = param1.substring(var6, var8);
                      var6 = var8 + 1;
                      var7++;
                      continue L1;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (String[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("nc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void b(int param0) {
        ji var2;
        if (!ei.field_R) {
          throw new IllegalStateException();
        } else {
          wd.field_b = true;
          if (param0 != 0) {
            var2 = (ji) null;
            nc.a((ji) null, -19, -66);
            nb.a(false, (byte) -126);
            q.field_Jb = 0;
            return;
          } else {
            nb.a(false, (byte) -126);
            q.field_Jb = 0;
            return;
          }
        }
    }

    final static void a(ji param0, int param1, int param2) {
        uc var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = di.field_l;
            var3.k(-17410, param2);
            var3.i(param0.field_i, 0);
            var3.h(-1564407352, param0.field_h);
            if (param1 >= 36) {
              break L0;
            } else {
              nc.a(78);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("nc.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_c = new dh(256);
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = new int[]{1, 3, 0, 2, 1, 0, 0, 3, 2, 2, 2, 2, 2, 3, 3, 3, 5, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 5, 4, 3, 2, 2, 3, 3, 3, 3, 3, 2, 2, 3, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3};
    }
}
