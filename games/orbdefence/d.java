/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class d extends ca {
    int field_i;
    static boolean field_g;
    static boolean field_k;
    static String field_h;
    static int field_j;
    int field_f;

    final static void b() {
        if (!(bm.field_d == null)) {
            bm.field_d.l(-113);
        }
        if (!(na.field_c == null)) {
            na.field_c.p(1);
        }
        int discarded$0 = 104;
        pf.a();
    }

    final static int d() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            mg var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_30_0 = 0;
            if (kg.field_h.field_b >= 4) {
              if (-1 == kg.field_h.field_n) {
                return 3;
              } else {
                if (-2 != kg.field_h.field_n) {
                  return 1;
                } else {
                  return 4;
                }
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (mc.field_j != 0) {
                      break L1;
                    } else {
                      cf.field_a = lh.field_b.a(ta.field_z, 0, fm.field_c);
                      mc.field_j = mc.field_j + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (mc.field_j != 1) {
                      break L2;
                    } else {
                      if (cf.field_a.field_a == 2) {
                        stackOut_13_0 = kk.a(-30179, -1);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (1 != cf.field_a.field_a) {
                          break L2;
                        } else {
                          mc.field_j = mc.field_j + 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (2 != mc.field_j) {
                      break L3;
                    } else {
                      dd.field_A = new cb((java.net.Socket) cf.field_a.field_g, lh.field_b);
                      var2 = new mg(13);
                      nl.a(20994, hc.field_f, tk.field_m, var2, s.field_x);
                      var2.a(15, -49);
                      var2.b(m.field_b, -1);
                      dd.field_A.a((byte) 30, var2.field_j, 0, 13);
                      mc.field_j = mc.field_j + 1;
                      n.field_b = 30000L + ji.b(-75);
                      break L3;
                    }
                  }
                  L4: {
                    if (mc.field_j != 3) {
                      break L4;
                    } else {
                      if (dd.field_A.b((byte) 101) > 0) {
                        var1_int = dd.field_A.a(true);
                        if (var1_int != 0) {
                          stackOut_26_0 = kk.a(-30179, var1_int);
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        } else {
                          mc.field_j = mc.field_j + 1;
                          break L4;
                        }
                      } else {
                        if (~ji.b(103) >= ~n.field_b) {
                          break L4;
                        } else {
                          stackOut_22_0 = kk.a(-30179, -2);
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    }
                  }
                  if (4 != mc.field_j) {
                    stackOut_32_0 = -1;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    kg.field_h.a((Object) (Object) dd.field_A, 20, il.field_a);
                    dd.field_A = null;
                    cf.field_a = null;
                    mc.field_j = 0;
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return kk.a(-30179, -3);
              }
              return stackIn_33_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_h = null;
    }

    final static void c(byte param0) {
        ck.field_j = new rf();
        kg.field_j.a(false, (pj) (Object) ck.field_j);
        if (param0 >= -65) {
            field_h = null;
        }
    }

    private d() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
        field_h = "Norb Strength<br><%0>";
        field_k = true;
    }
}
