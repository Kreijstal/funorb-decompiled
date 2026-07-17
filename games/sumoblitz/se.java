/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se {
    static String field_b;
    static String field_c;
    static int field_d;
    static String field_a;

    final static int a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        var2 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            boolean discarded$12 = rf.field_a.a(wr.field_F, ha.field_b, true, -1);
            rf.field_a.h(-90);
            L1: while (true) {
              if (!wd.c(-96)) {
                if (iu.field_e == -1) {
                  if (lc.field_A) {
                    stackOut_9_0 = 3;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    if (vm.field_c == ad.field_p) {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      if (ut.field_o.a(true)) {
                        if (nw.field_e != ad.field_p) {
                          stackOut_21_0 = -1;
                          stackIn_22_0 = stackOut_21_0;
                          break L0;
                        } else {
                          stackOut_19_0 = 2;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    }
                  }
                } else {
                  var1_int = iu.field_e;
                  rd.a(-1, -15);
                  stackOut_5_0 = var1_int;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                boolean discarded$13 = rf.field_a.a(np.field_c, tg.field_a, true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "se.K(" + 19886 + 41);
        }
        return stackIn_22_0;
    }

    abstract nb a(byte param0);

    final static String a(CharSequence[] param0, int param1, int param2) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_11_0 = null;
        String stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (0 == param2) {
              stackOut_5_0 = "";
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              if (param2 == 1) {
                var10 = param0[0];
                var4 = var10;
                if (var4 == null) {
                  stackOut_11_0 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  return ((Object) (Object) var10).toString();
                }
              } else {
                var4_int = param2;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (var7 >= var4_int) {
                        stackOut_25_0 = var6.toString();
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            StringBuilder discarded$5 = var6.append(var8);
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append("null");
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence != null) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      } else {
                        var5 += 4;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4_ref;
            stackOut_27_1 = new StringBuilder().append("se.M(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + 0 + 44 + param2 + 44 + 14156 + 41);
        }
        return stackIn_26_0;
    }

    abstract void a(fs param0, byte param1);

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        if (!oj.a(param1, 13836, param2)) {
            return false;
        }
        if (((param1 & 36864) != 0 ? true : false) | dk.a(param1, (byte) -107, param2) | tq.a(param2, true, param1)) {
            return true;
        }
        return (lg.a(param1, -22, param2) | ((8192 & param1) != 0 ? true : false) | mb.a(true, param2, param1)) & ((param2 & 55) == 0 ? true : false);
    }

    public static void b() {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_c = "Please try again in a few minutes.";
        field_a = "Score";
    }
}
