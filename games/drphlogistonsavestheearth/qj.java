/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qj {
    static he[] field_a;
    static vi field_e;
    static sa field_b;
    static int[] field_d;
    static int field_c;
    static he field_f;

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener((java.awt.event.KeyListener) (Object) ji.field_c);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) ji.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("qj.F(").append(-53).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final static Boolean a(int param0) {
        Boolean var1 = oe.field_a;
        oe.field_a = null;
        return var1;
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        L0: {
          uh.field_r.d(param2, param1);
          if (param0) {
            L1: {
              var4 = k.field_L % uh.field_r.field_y * 2;
              if (var4 >= uh.field_r.field_y) {
                var4 = uh.field_r.field_y + -var4 - -uh.field_r.field_y;
                break L1;
              } else {
                break L1;
              }
            }
            if (var4 >= 10) {
              if (var4 <= -40 + uh.field_r.field_y) {
                ee.a(80, 0, param1, param2, -99, 0, 30, var4, uh.field_r);
                break L0;
              } else {
                var4 = uh.field_r.field_y + -40;
                ee.a(80, 0, param1, param2, -99, 0, 30, var4, uh.field_r);
                break L0;
              }
            } else {
              var4 = 10;
              ee.a(80, 0, param1, param2, -99, 0, 30, var4, uh.field_r);
              break L0;
            }
          } else {
            break L0;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == uj.field_j) {
                break L0;
              } else {
                L1: {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (tl.field_O == ik.field_d) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (nj.field_p.field_j != 0) {
                    break L2;
                  } else {
                    if (la.a(false) > 10000L + ck.field_e) {
                      nj.field_p.d(param0, -18392);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (nj.field_p.field_j > 0) {
                    {
                      L4: {
                        uj.field_j.a(nj.field_p.field_j, -30537, nj.field_p.field_h, 0);
                        ck.field_e = la.a(false);
                        break L4;
                      }
                    }
                    nj.field_p.field_j = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            nj.field_p.field_j = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_f = null;
        field_e = null;
        field_a = null;
        int var1 = 1;
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = 0; var4 < param0; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new vi();
        field_b = new sa(7, 0, 1, 1);
        field_c = 0;
    }
}
