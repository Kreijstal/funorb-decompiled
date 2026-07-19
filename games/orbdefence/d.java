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

    final static void b(byte param0) {
        if (param0 > -31) {
          return;
        } else {
          L0: {
            if (bm.field_d != null) {
              bm.field_d.l(-113);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (na.field_c != null) {
              na.field_c.p(1);
              break L1;
            } else {
              break L1;
            }
          }
          pf.a(104);
          return;
        }
    }

    final static int d(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            mg var2 = null;
            int stackIn_17_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_16_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_33_0 = 0;
            if (param0 <= -86) {
              if (kg.field_h.field_b >= 4) {
                if (-1 == kg.field_h.field_n) {
                  return 3;
                } else {
                  if (-2 == kg.field_h.field_n) {
                    return 4;
                  } else {
                    return 1;
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
                      if ((mc.field_j ^ -1) != -2) {
                        break L2;
                      } else {
                        if (-3 == (cf.field_a.field_a ^ -1)) {
                          stackOut_16_0 = kk.a(-30179, -1);
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
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
                        dd.field_A = new cb((java.net.Socket) (cf.field_a.field_g), lh.field_b);
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
                            stackOut_29_0 = kk.a(-30179, var1_int);
                            stackIn_30_0 = stackOut_29_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            mc.field_j = mc.field_j + 1;
                            break L4;
                          }
                        } else {
                          if ((ji.b(103) ^ -1L) >= (n.field_b ^ -1L)) {
                            break L4;
                          } else {
                            stackOut_25_0 = kk.a(-30179, -2);
                            stackIn_26_0 = stackOut_25_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    if (4 != mc.field_j) {
                      stackOut_35_0 = -1;
                      stackIn_36_0 = stackOut_35_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      kg.field_h.a(dd.field_A, 20, il.field_a);
                      dd.field_A = null;
                      cf.field_a = null;
                      mc.field_j = 0;
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var1 = (IOException) (Object) decompiledCaughtException;
                  return kk.a(-30179, -3);
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_26_0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return stackIn_30_0;
                    } else {
                      if (decompiledRegionSelector0 == 3) {
                        return stackIn_34_0;
                      } else {
                        return stackIn_36_0;
                      }
                    }
                  }
                }
              }
            } else {
              return 21;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 >= -117) {
            return;
        }
        field_h = null;
    }

    final static void c(byte param0) {
        ck.field_j = new rf();
        kg.field_j.a(false, ck.field_j);
        if (param0 >= -65) {
            field_h = (String) null;
        }
    }

    private d() throws Throwable {
        throw new Error();
    }

    static {
        field_g = false;
        field_h = "Norb Strength<br><%0>";
        field_k = true;
    }
}
