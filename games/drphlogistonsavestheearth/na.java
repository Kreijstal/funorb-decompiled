/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class na {
    java.awt.Image field_h;
    static String field_d;
    static char[] field_a;
    int field_f;
    int[] field_e;
    static String field_b;
    static he field_c;
    int field_g;

    final static boolean b(int param0) {
        if (param0 != -1) {
            na.a((byte) 110);
            return sg.field_a;
        }
        return sg.field_a;
    }

    final static boolean a(hg param0, byte param1, hg param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var3 = param2.field_tb - param0.field_tb;
          if (param2.field_qb != rc.field_e) {
            if (null != param2.field_qb) {
              break L0;
            } else {
              // wide iinc 3 200
              break L0;
            }
          } else {
            // wide iinc 3 -200
            break L0;
          }
        }
        if (param0.field_qb == rc.field_e) {
          // wide iinc 3 200
          if (param1 == -95) {
            L1: {
              if (-1 <= var3) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                break L1;
              } else {
                stackOut_25_0 = 1;
                stackIn_27_0 = stackOut_25_0;
                break L1;
              }
            }
            return stackIn_27_0 != 0;
          } else {
            L2: {
              field_b = null;
              if (-1 >= var3) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L2;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L2;
              }
            }
            return stackIn_23_0 != 0;
          }
        } else {
          if (null != param0.field_qb) {
            L3: {
              if (param1 == -95) {
                break L3;
              } else {
                field_b = null;
                break L3;
              }
            }
            L4: {
              if (-1 <= var3) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              } else {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L4;
              }
            }
            return stackIn_17_0 != 0;
          } else {
            L5: {
              // wide iinc 3 -200
              if (param1 == -95) {
                break L5;
              } else {
                field_b = null;
                break L5;
              }
            }
            L6: {
              if (-1 >= var3) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L6;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L6;
              }
            }
            return stackIn_11_0 != 0;
          }
        }
    }

    abstract void a(java.awt.Graphics param0, int param1, int param2, int param3);

    final static vj a(boolean param0, int param1, boolean param2, boolean param3, boolean param4, int param5) {
        try {
            ik var6 = null;
            IOException var6_ref = null;
            ik var7 = null;
            de var8 = null;
            vj stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            vj stackOut_12_0 = null;
            try {
              L0: {
                var6 = null;
                if (param4) {
                  break L0;
                } else {
                  vj discarded$2 = na.a(false, -5, true, true, true, -73);
                  break L0;
                }
              }
              L1: {
                var7 = null;
                if (null == oi.field_e.field_d) {
                  break L1;
                } else {
                  uj.field_h = new ge(oi.field_e.field_d, 5200, 0);
                  oi.field_e.field_d = null;
                  var6 = new ik(255, uj.field_h, new ge(oi.field_e.field_b, 12000, 0), 2097152);
                  break L1;
                }
              }
              L2: {
                if (uj.field_h == null) {
                  break L2;
                } else {
                  L3: {
                    if (rc.field_d != null) {
                      break L3;
                    } else {
                      rc.field_d = new ge[oi.field_e.field_c.length];
                      break L3;
                    }
                  }
                  L4: {
                    if (null != rc.field_d[param1]) {
                      break L4;
                    } else {
                      rc.field_d[param1] = new ge(oi.field_e.field_c[param1], 12000, 0);
                      oi.field_e.field_c[param1] = null;
                      break L4;
                    }
                  }
                  var7 = new ik(param1, uj.field_h, rc.field_d[param1], 2097152);
                  break L2;
                }
              }
              L5: {
                var8 = fl.field_a.a(param1, param2, var6, var7, (byte) 75);
                if (!param3) {
                  break L5;
                } else {
                  var8.f(107);
                  break L5;
                }
              }
              stackOut_12_0 = new vj((wd) (Object) var8, param0, param5);
              stackIn_13_0 = stackOut_12_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_13_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != -33) {
          var2 = null;
          boolean discarded$2 = na.a((hg) null, (byte) -50, (hg) null);
          field_b = null;
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final void a(int param0) {
        if (param0 < 94) {
          na.a((byte) -78);
          wj.a(((na) this).field_e, ((na) this).field_f, ((na) this).field_g);
          return;
        } else {
          wj.a(((na) this).field_e, ((na) this).field_f, ((na) this).field_g);
          return;
        }
    }

    abstract void a(int param0, int param1, byte param2, java.awt.Component param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Click";
        field_a = new char[128];
        field_b = "Weapon unavailable";
    }
}
