/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lf {
    static int field_c;
    static String field_b;
    static volatile int field_a;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 == -19864) {
          if (param5 <= param1) {
            if (param5 + param4 > param1) {
              if (param6 <= param2) {
                if (param6 - -param3 <= param2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            gk var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_34_0 = 0;
            if (4 <= lg.field_n.field_b) {
              if (-1 != lg.field_n.field_a) {
                if (lg.field_n.field_a == -2) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (ii.field_T != 0) {
                      break L1;
                    } else {
                      kd.field_a = rk.field_g.a(fi.field_d, 0, oh.field_c);
                      ii.field_T = ii.field_T + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (ii.field_T != 1) {
                      break L2;
                    } else {
                      if (2 == kd.field_a.field_g) {
                        stackOut_13_0 = dh.a(true, -1);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (kd.field_a.field_g != 1) {
                          break L2;
                        } else {
                          ii.field_T = ii.field_T + 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (ii.field_T == 2) {
                      pg.field_a = new id((java.net.Socket) kd.field_a.field_b, rk.field_g);
                      var2 = new gk(13);
                      qi.a(fl.field_d, var2, fa.field_q, false, rb.field_eb);
                      var2.b(15, -49152);
                      var2.a(-803539344, mk.field_f);
                      pg.field_a.a(var2.field_g, 0, (byte) 93, 13);
                      ii.field_T = ii.field_T + 1;
                      wi.field_f = 30000L + pf.a(0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (ii.field_T == 3) {
                      if (pg.field_a.c(72) <= 0) {
                        if (wi.field_f < pf.a(0)) {
                          stackOut_30_0 = dh.a(true, -2);
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = pg.field_a.a(-16840);
                        if (0 != var1_int) {
                          stackOut_25_0 = dh.a(true, var1_int);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        } else {
                          ii.field_T = ii.field_T + 1;
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (ii.field_T == 4) {
                    lg.field_n.a(-105, jf.field_i, (Object) (Object) pg.field_a);
                    kd.field_a = null;
                    pg.field_a = null;
                    ii.field_T = 0;
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return dh.a(true, -3);
              }
              return stackIn_35_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        hb var2 = null;
        var2 = gf.field_c;
        var2.b(true, param1);
        var2.b(1, -49152);
        var2.b(0, param0 + -74349);
        if (param0 != 25197) {
          field_a = -114;
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "More suggestions";
        field_a = 0;
    }
}
