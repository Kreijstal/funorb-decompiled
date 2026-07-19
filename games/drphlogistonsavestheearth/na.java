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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param2.field_tb - param0.field_tb;
              if (param2.field_qb != rc.field_e) {
                if (null != param2.field_qb) {
                  break L1;
                } else {
                  var3_int += 200;
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (param0.field_qb == rc.field_e) {
                var3_int += 200;
                break L2;
              } else {
                if (null == param0.field_qb) {
                  var3_int -= 200;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 == -95) {
                break L3;
              } else {
                field_b = (String) null;
                break L3;
              }
            }
            L4: {
              if (-1 <= (var3_int ^ -1)) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("na.F(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    abstract void a(java.awt.Graphics param0, int param1, int param2, int param3);

    final static vj a(boolean param0, int param1, boolean param2, boolean param3, boolean param4, int param5) {
        try {
            vj discarded$2 = null;
            Object var6 = null;
            Object var7 = null;
            de var8 = null;
            vj stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            vj stackOut_12_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (param4) {
                    break L1;
                  } else {
                    discarded$2 = na.a(false, -5, true, true, true, -73);
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  if (null == oi.field_e.field_d) {
                    break L2;
                  } else {
                    uj.field_h = new ge(oi.field_e.field_d, 5200, 0);
                    oi.field_e.field_d = null;
                    var6 = new ik(255, uj.field_h, new ge(oi.field_e.field_b, 12000, 0), 2097152);
                    break L2;
                  }
                }
                L3: {
                  if (uj.field_h == null) {
                    break L3;
                  } else {
                    L4: {
                      if (rc.field_d != null) {
                        break L4;
                      } else {
                        rc.field_d = new ge[oi.field_e.field_c.length];
                        break L4;
                      }
                    }
                    L5: {
                      if (null != rc.field_d[param1]) {
                        break L5;
                      } else {
                        rc.field_d[param1] = new ge(oi.field_e.field_c[param1], 12000, 0);
                        oi.field_e.field_c[param1] = null;
                        break L5;
                      }
                    }
                    var7 = new ik(param1, uj.field_h, rc.field_d[param1], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = fl.field_a.a(param1, param2, (ik) (var6), (ik) (var7), (byte) 75);
                  if (!param3) {
                    break L6;
                  } else {
                    var8.f(107);
                    break L6;
                  }
                }
                stackOut_12_0 = new vj(var8, param0, param5);
                stackIn_13_0 = stackOut_12_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_13_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        boolean discarded$2 = false;
        hg var2 = null;
        if (param0 != -33) {
          var2 = (hg) null;
          discarded$2 = na.a((hg) null, (byte) -50, (hg) null);
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
          wj.a(this.field_e, this.field_f, this.field_g);
          return;
        } else {
          wj.a(this.field_e, this.field_f, this.field_g);
          return;
        }
    }

    abstract void a(int param0, int param1, byte param2, java.awt.Component param3);

    static {
        field_d = "Click";
        field_a = new char[128];
        field_b = "Weapon unavailable";
    }
}
