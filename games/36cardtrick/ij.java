/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static bk field_h;
    static String[] field_a;
    static String field_d;
    static boolean field_g;
    static nc field_i;
    static int field_e;
    static int[] field_c;
    static String field_b;
    static vg field_f;

    final static String a(byte param0) {
        Object var2 = null;
        if (jc.field_P != hh.field_g) {
          if (hh.field_g == ei.field_d) {
            return dj.field_e;
          } else {
            if (wh.field_a.a(640)) {
              if (param0 <= 109) {
                var2 = null;
                kh discarded$2 = ij.a(-89, (java.awt.Component) null, 47, 123);
                return ng.field_y;
              } else {
                return ng.field_y;
              }
            } else {
              return dj.field_e;
            }
          }
        } else {
          return ji.field_b;
        }
    }

    final static kh a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            kh var5 = null;
            jf var5_ref = null;
            Object stackIn_2_0 = null;
            kh stackIn_4_0 = null;
            jf stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            kh stackOut_3_0 = null;
            Object stackOut_1_0 = null;
            jf stackOut_5_0 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              try {
                var4 = Class.forName("el");
                if (param0 <= -49) {
                  var5 = (kh) var4.newInstance();
                  var5.a(param1, param2, (byte) 68, param3);
                  stackOut_3_0 = (kh) var5;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (kh) (Object) stackIn_2_0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new jf();
                ((kh) (Object) var5_ref).a(param1, param2, (byte) 68, param3);
                stackOut_5_0 = (jf) var5_ref;
                stackIn_6_0 = stackOut_5_0;
                return (kh) (Object) stackIn_6_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var4_ref2;
                stackOut_7_1 = new StringBuilder().append("ij.B(").append(param0).append(44);
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
                  break L0;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L0;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_c = null;
        field_i = null;
        field_a = null;
        field_f = null;
        field_h = null;
        field_b = null;
        field_d = null;
    }

    final static void a(kc param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            if ((3 & (param0.field_n | (param0.field_q | (param0.field_p | param0.field_o)))) != 0) {
              var2_int = (3 & param0.field_q) + param0.field_p;
              var3 = param0.field_o + (3 & param0.field_n);
              var2_int = 4 - (3 & var2_int) + var2_int;
              if (param1 >= 113) {
                var3 = var3 - (3 & var3) - -4;
                var4 = new int[var2_int * var3];
                var5 = 0;
                var6 = (3 & param0.field_q) - -((param0.field_n & 3) * var2_int);
                var7 = 0;
                L1: while (true) {
                  if (param0.field_o <= var7) {
                    param0.field_n = param0.field_n & -4;
                    param0.field_p = var2_int;
                    param0.field_r = var4;
                    param0.field_o = var3;
                    param0.field_q = param0.field_q & -4;
                    break L0;
                  } else {
                    var8 = 0;
                    L2: while (true) {
                      if (param0.field_p <= var8) {
                        var6 = var6 + (-param0.field_p + var2_int);
                        var7++;
                        continue L1;
                      } else {
                        int incrementValue$2 = var6;
                        var6++;
                        int incrementValue$3 = var5;
                        var5++;
                        var4[incrementValue$2] = param0.field_r[incrementValue$3];
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("ij.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new bk();
        field_a = new String[16];
        field_d = "Friends can be added in multiplayer<nbsp>games";
        field_e = 0;
        field_g = false;
        field_b = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_i = new nc();
    }
}
