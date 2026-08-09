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
        java.awt.Component var2;
        if (jc.field_P != hh.field_g) {
          if (hh.field_g == ei.field_d) {
            return dj.field_e;
          } else {
            if (wh.field_a.a(640)) {
              if (param0 <= 109) {
                var2 = (java.awt.Component) null;
                ij.a(-89, (java.awt.Component) null, 47, 123);
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
            kh stackIn_2_0 = null;
            kh stackIn_4_0 = null;
            jf stackIn_6_0 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = Class.forName("el");
                    if (param0 <= -49) {
                      var5 = (kh) (var4.newInstance());
                      var5.a(param1, param2, (byte) 68, param3);
                      stackIn_4_0 = (kh) (var5);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackIn_2_0 = (kh) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new jf();
                  ((kh) ((Object) var5_ref)).a(param1, param2, (byte) 68, param3);
                  stackIn_6_0 = (jf) (var5_ref);
                  return (kh) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var4_ref2);

                stackIn_9_1 = new StringBuilder().append("ij.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_i = null;
        if (param0 != 3) {
          return;
        } else {
          field_a = null;
          field_f = null;
          field_h = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(kc param0, byte param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        try {
          L0: {
            if (-1 != (3 & (param0.field_n | (param0.field_q | (param0.field_p | param0.field_o))) ^ -1)) {
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
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = 0;
                    L2: while (true) {
                      if (param0.field_p <= var8) {
                        var6 = var6 + (-param0.field_p + var2_int);
                        var7++;
                        continue L1;
                      } else {
                        incrementValue$0 = var6;
                        var6++;
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$0] = param0.field_r[incrementValue$1];
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("ij.D(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_h = new bk();
        field_a = new String[16];
        field_d = "Friends can be added in multiplayer<nbsp>games";
        field_e = 0;
        field_g = false;
        field_b = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_i = new nc();
    }
}
