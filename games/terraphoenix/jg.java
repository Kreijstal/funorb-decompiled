/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jg extends al {
    static ci field_ib;
    static h field_kb;
    static String[] field_jb;
    static ci field_hb;
    static int field_gb;

    final static fa a(int param0, int param1, boolean param2, boolean param3, int param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            tb var8 = null;
            fa stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            fa stackOut_16_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 30) {
                    break L1;
                  } else {
                    field_kb = null;
                    break L1;
                  }
                }
                L2: {
                  var6 = null;
                  var7 = null;
                  if (mc.field_b.field_r != null) {
                    ad.field_x = new ak(mc.field_b.field_r, 5200, 0);
                    mc.field_b.field_r = null;
                    var6 = (Object) (Object) new ua(255, ad.field_x, new ak(mc.field_b.field_q, 12000, 0), 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (ad.field_x == null) {
                    break L3;
                  } else {
                    L4: {
                      if (null == wb.field_b) {
                        wb.field_b = new ak[mc.field_b.field_s.length];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (null == wb.field_b[param4]) {
                        wb.field_b[param4] = new ak(mc.field_b.field_s[param4], 12000, 0);
                        mc.field_b.field_s[param4] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7 = (Object) (Object) new ua(param4, ad.field_x, wb.field_b[param4], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = i.field_a.a(param2, param4, (ua) var6, (ua) var7, 115);
                  if (param3) {
                    var8.c((byte) 2);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_16_0 = new fa((uj) (Object) var8, param5, param1);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_17_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(boolean param0) {
        field_kb = null;
        field_jb = null;
        field_hb = null;
        field_ib = null;
    }

    final void a(gl param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -31);
              if (param1 <= -21) {
                break L1;
              } else {
                fa discarded$2 = jg.a(46, 78, false, false, -28, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jg.O(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    jg(d param0, gl param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = new String[]{"", "", "We believe that we could modify the alien's armoured suits to fit our soldiers and provide them with much better protection against the aliens' weapons.", "By implanting a shield module within a suit of battle armour a much better form of protection could be created to keep our soldiers alive."};
        field_ib = new ci(540, 140);
    }
}
