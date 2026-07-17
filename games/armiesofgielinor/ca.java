/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca implements uo {
    int field_b;
    int field_c;
    int field_d;
    static int[] field_a;
    static int[] field_h;
    int field_g;
    String field_e;
    static int[] field_f;
    static String field_i;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_i = null;
        field_h = null;
        if (param0 != 23582) {
            field_f = null;
        }
    }

    public final void a(int param0, bv param1, String param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 37) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2.equals((Object) (Object) "name")) {
                  if (0 < param0) {
                    ((ca) this).field_e = up.a(param1, param0, (byte) -115);
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (param2.equals((Object) (Object) "mf")) {
                    if (param0 <= 0) {
                      break L3;
                    } else {
                      ((ca) this).field_c = (int)tn.a(false, param0, param1);
                      break L2;
                    }
                  } else {
                    if (param2.equals((Object) (Object) "ownr")) {
                      if (0 < param0) {
                        ((ca) this).field_b = (int)tn.a(false, param0, param1);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      if (!param2.equals((Object) (Object) "tag")) {
                        if (param2.equals((Object) (Object) "god")) {
                          if (0 < param0) {
                            ((ca) this).field_g = (int)tn.a(false, param0, param1);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        if (param0 > 0) {
                          ((ca) this).field_d = (int)tn.a(false, param0, param1);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ca.B(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L4;
            }
          }
          L5: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 41);
        }
    }

    final static void a(java.awt.Component param0, int param1, hd param2, boolean param3, int param4, nm param5) {
        try {
            rc.a(22050, true, 10);
            l.field_a = rc.a(param2, param0, 0, 22050);
            mt.field_e = rc.a(param2, param0, 1, 1024);
            ig.field_n = new uv();
            ku.field_K = 1024;
            mt.field_e.b((hn) (Object) ig.field_n);
            lk.field_e = param5;
            lk.field_e.b(te.field_n, -120);
            l.field_a.b((hn) (Object) lk.field_e);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ca.F(" + (param0 != null ? "{...}" : "null") + 44 + 1024 + 44 + (param2 != null ? "{...}" : "null") + 44 + 1 + 44 + -115 + 44 + (param5 != null ? "{...}" : "null") + 44 + 22050 + 44 + 22050 + 41);
        }
    }

    final static long b(int param0) {
        if (param0 != 0) {
            ca.a(-47, true);
        }
        return -iq.field_h + vi.b(-53);
    }

    final static pf[] c(int param0) {
        if (param0 != 0) {
            pf[] discarded$0 = ca.c(-90);
        }
        return new pf[]{vn.field_j, ps.field_y, u.field_l};
    }

    final static void a(int param0, boolean param1) {
        L0: {
          if (gk.field_J > 0) {
            if (!bw.field_g) {
              break L0;
            } else {
              qn.d(0, 0, qn.field_l, ag.field_I.field_D);
              qc.field_c.b(param1, 20);
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (bd.field_r > 0) {
              break L2;
            } else {
              if (0 < rk.field_D) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          if (!vk.field_f) {
            break L1;
          } else {
            qn.d(0, 0, qn.field_l, ag.field_I.field_D);
            ta.field_R.b(param1, 20);
            break L1;
          }
        }
        L3: {
          if (param0 == 5295) {
            break L3;
          } else {
            ca.a(88);
            break L3;
          }
        }
    }

    ca() {
        ((ca) this).field_g = -1;
        ((ca) this).field_d = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_i = "Waiting for graphics";
    }
}
