/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo {
    static String field_d;
    static dn field_f;
    static int field_e;
    static int field_b;
    static String field_c;
    static int[] field_a;
    static String field_g;

    final static void a(int param0, byte param1, long param2) {
        ab var4 = null;
        int var5 = 0;
        var4 = he.field_e;
        var4.b((byte) -75, param0);
        var4.field_g = var4.field_g + 1;
        var5 = var4.field_g;
        var4.f(6, (byte) -32);
        if (param1 >= -61) {
          field_e = -61;
          var4.a(param2, (byte) 72);
          var4.b(var4.field_g - var5, (byte) 43);
          return;
        } else {
          var4.a(param2, (byte) 72);
          var4.b(var4.field_g - var5, (byte) 43);
          return;
        }
    }

    final static void a(int param0, int param1) {
        on.field_h = (param1 & 48) >> 4;
        if (on.field_h > 2) {
            on.field_h = 2;
            ra.field_m = (param1 & 13) >> 2;
            if (ra.field_m <= 2) {
                hd.field_b = param1 & 3;
                if (!(hd.field_b <= 2)) {
                    hd.field_b = 2;
                }
                return;
            }
            ra.field_m = 2;
            hd.field_b = param1 & 3;
            if (!(hd.field_b <= 2)) {
                hd.field_b = 2;
            }
            return;
        }
        ra.field_m = (param1 & 13) >> 2;
        if (ra.field_m > 2) {
            ra.field_m = 2;
            hd.field_b = param1 & 3;
            if (!(hd.field_b <= 2)) {
                hd.field_b = 2;
            }
            return;
        }
        hd.field_b = param1 & 3;
        if (!(hd.field_b <= 2)) {
            hd.field_b = 2;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        int var4 = 0;
        jf.field_a.field_g = 0;
        jf.field_a.f(12, (byte) -45);
        jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
        jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
        jf.field_a.f(param0, (byte) -10);
        if (param3 >= -125) {
          qo.a(5, 14, 54, (byte) 68);
          jf.field_a.f(param1, (byte) -50);
          jf.field_a.c(param2, (byte) -66);
          jf.field_a.a(q.field_K, (byte) 98, nl.field_Jb);
          he.field_e.b((byte) -25, 18);
          int fieldTemp$2 = he.field_e.field_g + 1;
          he.field_e.field_g = he.field_e.field_g + 1;
          var4 = fieldTemp$2;
          he.field_e.a(jf.field_a.field_j, 0, (byte) -86, jf.field_a.field_g);
          he.field_e.b(he.field_e.field_g + -var4, (byte) 43);
          return;
        } else {
          jf.field_a.f(param1, (byte) -50);
          jf.field_a.c(param2, (byte) -66);
          jf.field_a.a(q.field_K, (byte) 98, nl.field_Jb);
          he.field_e.b((byte) -25, 18);
          int fieldTemp$3 = he.field_e.field_g + 1;
          he.field_e.field_g = he.field_e.field_g + 1;
          var4 = fieldTemp$3;
          he.field_e.a(jf.field_a.field_j, 0, (byte) -86, jf.field_a.field_g);
          he.field_e.b(he.field_e.field_g + -var4, (byte) 43);
          return;
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2 = rl.a(be.a(param1, false), 29424);
              if (param0 >= 67) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = qo.a((byte) -47, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (String) var2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("qo.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (hn.a(param0, 17769)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var6 = ih.field_c;
                var2 = var6;
                var3 = param1;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = eh.field_f;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 == param0) {
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0 != 0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param0 == var4) {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "qo.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Mouse over an icon for details";
        field_b = 50;
        field_d = "<%0> has dropped out.";
        field_a = new int[]{19, 20, 21, 22, 23, 24, 51, 60, 52};
        field_g = "You can join this game";
    }
}
