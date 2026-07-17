/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sm {
    static int field_b;
    static int field_a;
    static long[] field_c;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 30000) {
            sm.a(21);
        }
    }

    final static int b(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            wq var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_33_0 = 0;
            if (vd.field_f.field_i >= 4) {
              if (-1 != vd.field_f.field_f) {
                if (vd.field_f.field_f == -2) {
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
                    if (qj.field_j == 0) {
                      fc.field_e = ec.field_P.a(wk.field_k, (byte) 120, gd.field_a);
                      qj.field_j = qj.field_j + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (1 != qj.field_j) {
                      break L2;
                    } else {
                      if (fc.field_e.field_f == 2) {
                        stackOut_13_0 = on.a((byte) 41, -1);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (fc.field_e.field_f == 1) {
                          qj.field_j = qj.field_j + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (qj.field_j == 2) {
                      dm.field_d = new wh((java.net.Socket) fc.field_e.field_e, ec.field_P);
                      var2 = new wq(13);
                      c.a(vb.field_S, 12, nb.field_a, u.field_g, var2);
                      var2.a(-120, 15);
                      var2.a(fi.field_t, (byte) -79);
                      dm.field_d.a(var2.field_k, true, 13, 0);
                      qj.field_j = qj.field_j + 1;
                      ff.field_b = ue.a(false) - -30000L;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (qj.field_j != 3) {
                      break L4;
                    } else {
                      if (dm.field_d.d(10434) > 0) {
                        var1_int = dm.field_d.e(0);
                        if (var1_int != 0) {
                          stackOut_29_0 = on.a((byte) 90, var1_int);
                          stackIn_30_0 = stackOut_29_0;
                          return stackIn_30_0;
                        } else {
                          qj.field_j = qj.field_j + 1;
                          break L4;
                        }
                      } else {
                        if (~ff.field_b > ~ue.a(false)) {
                          stackOut_25_0 = on.a((byte) -85, -2);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (qj.field_j != 4) {
                    stackOut_35_0 = -1;
                    stackIn_36_0 = stackOut_35_0;
                    break L0;
                  } else {
                    vd.field_f.a((Object) (Object) dm.field_d, rd.field_a, 12);
                    dm.field_d = null;
                    qj.field_j = 0;
                    fc.field_e = null;
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    return stackIn_34_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return on.a((byte) -111, -3);
              }
              return stackIn_36_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = field_a;
        field_c = new long[32];
    }
}
