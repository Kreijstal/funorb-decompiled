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
              param1.setFocusTraversalKeysEnabled(false);
              param1.addKeyListener((java.awt.event.KeyListener) (Object) ji.field_c);
              param1.addFocusListener((java.awt.event.FocusListener) (Object) ji.field_c);
              if (param0 < -18) {
                break L1;
              } else {
                field_f = null;
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
            stackOut_3_1 = new StringBuilder().append("qj.F(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
                  if (param1 == 14656) {
                    break L2;
                  } else {
                    field_b = null;
                    break L2;
                  }
                }
                L3: {
                  if (nj.field_p.field_j != 0) {
                    break L3;
                  } else {
                    if (la.a(false) > 10000L + ck.field_e) {
                      nj.field_p.d(param0, param1 ^ -32408);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (nj.field_p.field_j > 0) {
                    {
                      L5: {
                        uj.field_j.a(nj.field_p.field_j, -30537, nj.field_p.field_h, 0);
                        ck.field_e = la.a(false);
                        break L5;
                      }
                    }
                    nj.field_p.field_j = 0;
                    break L4;
                  } else {
                    break L4;
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
            var6[var4] = param1;
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
