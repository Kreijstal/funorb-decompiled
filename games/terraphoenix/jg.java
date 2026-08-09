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
            try {
              L0: {
                L1: {
                  if (param0 == 30) {
                    break L1;
                  } else {
                    field_kb = (h) null;
                    break L1;
                  }
                }
                L2: {
                  var6 = null;
                  var7 = null;
                  if (mc.field_b.field_r != null) {
                    ad.field_x = new ak(mc.field_b.field_r, 5200, 0);
                    mc.field_b.field_r = null;
                    var6 = new ua(255, ad.field_x, new ak(mc.field_b.field_q, 12000, 0), 2097152);
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
                    var7 = new ua(param4, ad.field_x, wb.field_b[param4], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = i.field_a.a(param2, param4, (ua) (var6), (ua) (var7), 115);
                  if (param3) {
                    var8.c((byte) 2);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackIn_17_0 = new fa(var8, param5, param1);
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_17_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_kb = (h) null;
          field_kb = null;
          field_jb = null;
          field_hb = null;
          field_ib = null;
          return;
        } else {
          field_kb = null;
          field_jb = null;
          field_hb = null;
          field_ib = null;
          return;
        }
    }

    final void a(gl param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, -31);
              if (param1 <= -21) {
                break L1;
              } else {
                jg.a(46, 78, false, false, -28, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jg.O(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    jg(d param0, gl param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        field_jb = new String[]{"", "", "We believe that we could modify the alien's armoured suits to fit our soldiers and provide them with much better protection against the aliens' weapons.", "By implanting a shield module within a suit of battle armour a much better form of protection could be created to keep our soldiers alive."};
        field_ib = new ci(540, 140);
    }
}
