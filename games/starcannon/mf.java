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
            tk var5 = null;
            mg var5_ref = null;
            tk stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            tk stackOut_2_0 = null;
            try {
              L0: {
                if (param3 == -21880) {
                  break L0;
                } else {
                  field_d = 25;
                  break L0;
                }
              }
              var4 = Class.forName("jd");
              var5 = (tk) var4.newInstance();
              var5.a(param3 ^ 28897, param0, param1, param2);
              stackOut_2_0 = (tk) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (!param0) {
          return;
        } else {
          L0: {
            qc.a((java.awt.Component) (Object) param1, (byte) 69);
            oi.a((java.awt.Component) (Object) param1, 0);
            if (null != qj.field_eb) {
              qj.field_eb.a(205, (java.awt.Component) (Object) param1);
              break L0;
            } else {
              break L0;
            }
          }
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
        Object var2 = null;
        if (!ai.field_c) {
          throw new IllegalStateException();
        } else {
          sh.field_t = true;
          if (param0 != -58) {
            var2 = null;
            tk discarded$2 = mf.a(24, (java.awt.Component) null, 34, 123);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_b = "End Game";
    }
}
