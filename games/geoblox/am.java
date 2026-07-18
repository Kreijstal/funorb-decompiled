/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class am {
    static dm field_b;
    static ck field_d;
    private int[] field_c;
    static int[] field_a;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 49) {
            am.a((byte) 72);
        }
        field_a = null;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var3 = (((am) this).field_c.length >> 1) - 1;
        var4 = var3 & param1;
        L1: while (true) {
          var5 = ((am) this).field_c[1 + var4 + var4];
          if (-1 != var5) {
            if (((am) this).field_c[var4 - -var4] != param1) {
              var4 = var4 - -1 & var3;
              continue L1;
            } else {
              return var5;
            }
          } else {
            return -1;
          }
        }
    }

    final static rh a(int param0, int param1, boolean param2) {
        try {
            Object var6 = null;
            Object var7 = null;
            bj var8 = null;
            Object stackIn_2_0 = null;
            rh stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            rh stackOut_14_0 = null;
            Object stackOut_1_0 = null;
            try {
              L0: {
                if (param0 <= -49) {
                  L1: {
                    var6 = null;
                    if (ph.field_i.field_j != null) {
                      af.field_d = new sk(ph.field_i.field_j, 5200, 0);
                      ph.field_i.field_j = null;
                      var6 = (Object) (Object) new jh(255, af.field_d, new sk(ph.field_i.field_s, 12000, 0), 2097152);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    var7 = null;
                    if (af.field_d == null) {
                      break L2;
                    } else {
                      L3: {
                        if (je.field_h != null) {
                          break L3;
                        } else {
                          je.field_h = new sk[ph.field_i.field_r.length];
                          break L3;
                        }
                      }
                      L4: {
                        if (je.field_h[param1] != null) {
                          break L4;
                        } else {
                          je.field_h[param1] = new sk(ph.field_i.field_r[param1], 12000, 0);
                          ph.field_i.field_r[param1] = null;
                          break L4;
                        }
                      }
                      var7 = (Object) (Object) new jh(param1, af.field_d, je.field_h[param1], 2097152);
                      break L2;
                    }
                  }
                  L5: {
                    var8 = gb.field_b.a(param1, (byte) -9, false, (jh) var6, (jh) var7);
                    if (!param2) {
                      break L5;
                    } else {
                      var8.b(92);
                      break L5;
                    }
                  }
                  stackOut_14_0 = new rh((nh) (Object) var8, true, 1);
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (rh) (Object) stackIn_2_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    am(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (param0.length - -(param0.length >> 1) < var2_int) {
                ((am) this).field_c = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int + -1;
                        L4: while (true) {
                          if (((am) this).field_c[var4 + var4 + 1] == -1) {
                            ((am) this).field_c[var4 - -var4] = param0[var3];
                            ((am) this).field_c[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var4 - -1 & -1 + var2_int;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((am) this).field_c[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("am.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[12];
        field_d = new ck(12, 0, 1, 0);
    }
}
