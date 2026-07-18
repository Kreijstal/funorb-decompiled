/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ek extends gi {
    int field_j;
    int field_k;
    static int field_h;
    static String field_q;
    static he[] field_l;
    static he[] field_t;
    int field_o;
    static he field_m;
    int field_r;
    static int field_n;
    int field_u;
    int field_s;
    static String field_p;
    int[] field_i;

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -40) {
              L1: {
                ue.field_b = 0;
                r.field_d = param2;
                if (r.field_d < 0) {
                  break L1;
                } else {
                  th.field_a[r.field_d].a(param1, (byte) 89);
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (0 == r.field_d) {
                    break L3;
                  } else {
                    if (r.field_d == -2) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                sc.a(-1, true, ad.field_q);
                break L2;
              }
              L4: {
                if (r.field_d != 11) {
                  break L4;
                } else {
                  qk.field_c = false;
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "ek.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            lh var2 = null;
            RuntimeException var2_ref = null;
            int stackIn_8_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_21_0 = 0;
            int stackIn_23_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_20_0 = 0;
            try {
              L0: {
                L1: {
                  if (null == de.field_q) {
                    de.field_q = pi.field_I.a(ml.field_n, ei.field_o, 105);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (de.field_q.field_b == 0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  L2: {
                    L3: {
                      long dupTemp$2 = la.a(false);
                      ck.field_e = dupTemp$2;
                      el.field_rb = dupTemp$2;
                      if (de.field_q.field_b != 1) {
                        break L3;
                      } else {
                        try {
                          L4: {
                            L5: {
                              uj.field_j = new qe((java.net.Socket) de.field_q.field_g, pi.field_I);
                              var2 = dh.field_N;
                              nj.field_p.field_j = 0;
                              if (!param1) {
                                stackOut_13_0 = -1;
                                stackIn_14_0 = stackOut_13_0;
                                break L5;
                              } else {
                                stackOut_11_0 = -2;
                                stackIn_14_0 = stackOut_11_0;
                                break L5;
                              }
                            }
                            l.field_q = stackIn_14_0;
                            gg.field_l = stackIn_14_0;
                            field_h = stackIn_14_0;
                            var2.field_j = 0;
                            tl.field_O = hh.field_b;
                            q.a(ci.field_W, lb.field_v, 26800, dc.field_e, (od) (Object) nj.field_p);
                            qj.a(-1, 14656);
                            decompiledRegionSelector0 = 0;
                            break L4;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L6: {
                            iOException = (IOException) (Object) decompiledCaughtException;
                            tl.field_O = sg.field_b;
                            if (!DrPhlogistonSavesTheEarth.field_D) {
                              decompiledRegionSelector0 = 0;
                              break L6;
                            } else {
                              decompiledRegionSelector0 = 1;
                              break L6;
                            }
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    tl.field_O = sg.field_b;
                    break L2;
                  }
                  if (param0) {
                    de.field_q = null;
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw ie.a((Throwable) (Object) var2_ref, "ek.A(" + param0 + ',' + param1 + ')');
            }
            return stackIn_23_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ek) this).field_k = param7;
              ((ek) this).field_j = param6;
              ((ek) this).field_s = param0;
              ((ek) this).field_i = param1;
              ((ek) this).field_o = param2;
              ((ek) this).field_r = param3;
              ((ek) this).field_u = param5;
              if (param4 >= 24) {
                break L1;
              } else {
                ek.a(41, false, 105);
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
            stackOut_3_1 = new StringBuilder().append("ek.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == el.field_sb) {
                break L1;
              } else {
                el.field_sb.h();
                break L1;
              }
            }
            if (param0 == -2) {
              L2: {
                if (k.field_J != null) {
                  k.field_J.h();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "ek.B(" + param0 + ')');
        }
    }

    public static void e(int param0) {
        try {
            field_l = null;
            field_t = null;
            field_q = null;
            field_m = null;
            int var1_int = -81 % ((param0 - -57) / 45);
            field_p = null;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ek.D(" + param0 + ')');
        }
    }

    ek() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = -1;
        field_h = -1;
        field_p = "to over <%0> great games";
        field_q = "World <%0>, Stage <%1>";
    }
}
