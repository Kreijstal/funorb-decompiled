/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh {
    static String field_f;
    static String[] field_b;
    static int field_g;
    static boolean field_e;
    static String field_h;
    static String field_d;
    static String field_a;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        if (vg.field_a == 13) {
          kf.a(-87);
          return true;
        } else {
          if (102 == vg.field_a) {
            tl.field_Fb.n(-70);
            return true;
          } else {
            if (param0 >= 1) {
              if (null != tl.field_Fb) {
                if (!tl.field_Fb.b((byte) -63, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              boolean discarded$7 = vh.a(-29, -66, -74);
              if (null != tl.field_Fb) {
                if (!tl.field_Fb.b((byte) -63, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_h = null;
        field_f = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        try {
            int var2 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var2 = 94 / ((16 - param1) / 37);
              if (lj.field_a == null) {
                break L0;
              } else {
                L1: {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (tb.field_f == ik.field_e) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (qn.field_U.field_l != 0) {
                    break L2;
                  } else {
                    if (~(10000L + ta.field_t) > ~ud.a(2)) {
                      qn.field_U.f(param0, -105);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (qn.field_U.field_l > 0) {
                    {
                      L4: {
                        lj.field_a.a(0, qn.field_U.field_l, (byte) -92, qn.field_U.field_o);
                        ta.field_t = ud.a(2);
                        break L4;
                      }
                    }
                    qn.field_U.field_l = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            qn.field_U.field_l = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 41) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            stackOut_2_0 = jj.field_e.a("", 30045, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("vh.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "2D MODE";
        field_h = "Set up new game";
        field_a = "You have been removed from <%0>'s game.";
        field_d = "Options";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
