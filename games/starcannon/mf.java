/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static String field_b;
    static String field_e;
    static ig field_a;
    static int field_d;
    static td field_c;

    final static tk a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            tk var5 = null;
            mg var5_ref = null;
            tk stackIn_3_0 = null;
            mg stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param3 == -21880) {
                        break L2;
                      } else {
                        field_d = 25;
                        break L2;
                      }
                    }
                    var4 = Class.forName("jd");
                    var5 = (tk) (var4.newInstance());
                    var5.a(param3 ^ 28897, param0, param1, param2);
                    stackIn_3_0 = (tk) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new mg();
                  ((tk) ((Object) var5_ref)).a(-9623, param0, param1, param2);
                  stackIn_5_0 = (mg) (var5_ref);
                  return (tk) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("mf.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              qc.a((java.awt.Component) ((Object) param1), (byte) 69);
              oi.a((java.awt.Component) ((Object) param1), 0);
              if (null != qj.field_eb) {
                qj.field_eb.a(205, (java.awt.Component) ((Object) param1));
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("mf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0 != 23675) {
            mf.a(1);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(byte param0) {
        java.awt.Component var2;
        if (!ai.field_c) {
          throw new IllegalStateException();
        } else {
          sh.field_t = true;
          if (param0 != -58) {
            var2 = (java.awt.Component) null;
            mf.a(24, (java.awt.Component) null, 34, 123);
            ma.a(false, param0 + 58);
            bl.field_a = 0;
            return;
          } else {
            ma.a(false, param0 + 58);
            bl.field_a = 0;
            return;
          }
        }
    }

    static {
        field_e = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_b = "End Game";
    }
}
