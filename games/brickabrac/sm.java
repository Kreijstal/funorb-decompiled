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
            int stackIn_15_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_34_0 = 0;
            if (-5 >= (vd.field_f.field_i ^ -1)) {
              if (-1 != vd.field_f.field_f) {
                if (vd.field_f.field_f != -2) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (param0 == (qj.field_j ^ -1)) {
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
                      if ((fc.field_e.field_f ^ -1) == -3) {
                        stackOut_14_0 = on.a((byte) 41, -1);
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (-2 == (fc.field_e.field_f ^ -1)) {
                          qj.field_j = qj.field_j + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (-3 == (qj.field_j ^ -1)) {
                      dm.field_d = new wh((java.net.Socket) (fc.field_e.field_e), ec.field_P);
                      var2 = new wq(13);
                      c.a(vb.field_S, 12, nb.field_a, u.field_g, var2);
                      var2.a(param0 ^ 119, 15);
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
                      if (-1 > (dm.field_d.d(10434) ^ -1)) {
                        var1_int = dm.field_d.e(0);
                        if (var1_int != 0) {
                          stackOut_30_0 = on.a((byte) 90, var1_int);
                          stackIn_31_0 = stackOut_30_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          qj.field_j = qj.field_j + 1;
                          break L4;
                        }
                      } else {
                        if ((ff.field_b ^ -1L) > (ue.a(false) ^ -1L)) {
                          stackOut_26_0 = on.a((byte) -85, -2);
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if ((qj.field_j ^ -1) != -5) {
                    stackOut_36_0 = -1;
                    stackIn_37_0 = stackOut_36_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    vd.field_f.a(dm.field_d, rd.field_a, 12);
                    dm.field_d = null;
                    qj.field_j = 0;
                    fc.field_e = null;
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return on.a((byte) -111, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_27_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_31_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_35_0;
                    } else {
                      return stackIn_37_0;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = 0;
        field_b = field_a;
        field_c = new long[32];
    }
}
