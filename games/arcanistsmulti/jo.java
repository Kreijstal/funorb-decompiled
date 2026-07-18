/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    static String field_d;
    static int field_c;
    static kc field_a;
    static boolean field_b;
    static int field_e;

    final static void a(boolean param0) {
        int var2 = 0;
        L0: {
          var2 = ArcanistsMulti.field_G ? 1 : 0;
          if (ce.field_h <= 0) {
            if (sm.field_a > 0) {
              sm.field_a = sm.field_a - 1;
              break L0;
            } else {
              if (oo.field_y > 0) {
                oo.field_y = oo.field_y - 1;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            ce.field_h = ce.field_h - 1;
            break L0;
          }
        }
        L1: {
          if (ce.field_h > 0) {
            vc.a((byte) 37);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (sm.field_a <= 0) {
            break L2;
          } else {
            ej.a(16, sm.field_a);
            break L2;
          }
        }
        L3: {
          if (oo.field_y > 0) {
            ej.a(16, oo.field_y);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    final static boolean a(wk param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param0.e((byte) -88);
              if (var2_int == 1) {
                stackOut_2_0 = 1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("jo.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = 0;
            L1: while (true) {
              if (0 >= param0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = param2 & 1 | var3_int << 1;
                param2 = param2 >>> 1;
                param0--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "jo.B(" + param0 + ',' + -73 + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_d = "Lesson 1 of 7<br><br>Learn the basics of throwing fire in a safe and secure environment.<br><br>Use the Fire Ball spell to destroy all three targets.<br><br><br>* How to look around *<br>* Selecting a spell *<br>* Shooting spells *<br>* Use of accuracy *";
    }
}
