/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends dc {
    private dg field_gb;
    static int[] field_eb;
    static String field_db;
    static int field_bb;
    private String field_lb;
    static mg[][] field_fb;
    static int[] field_jb;
    private String field_kb;
    private boolean field_ib;
    static String field_hb;
    private boolean field_cb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, 22, param2);
        on.field_b.c(((vc) this).field_lb, param2 + (((vc) this).field_g >> 1), 103 + param0, 16777215, -1);
        if (param1 >= 8) {
          if (((vc) this).field_kb != null) {
            df.b(20 + param2, 113 + param0, 260, 8421504);
            int discarded$2 = on.field_b.a(((vc) this).field_kb, param2 - -20, param0 + 128, 260, 100, 16777215, -1, 1, 0, on.field_b.field_H);
            return;
          } else {
            return;
          }
        } else {
          vc.g((byte) 3);
          if (((vc) this).field_kb == null) {
            return;
          } else {
            df.b(20 + param2, 113 + param0, 260, 8421504);
            int discarded$3 = on.field_b.a(((vc) this).field_kb, param2 - -20, param0 + 128, 260, 100, 16777215, -1, 1, 0, on.field_b.field_H);
            return;
          }
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        mi.a((String) null, param1, param0, true);
        if (param2 != -16113) {
            vc.a(true, true, -42);
        }
    }

    public static void g(byte param0) {
        field_db = null;
        field_eb = null;
        field_hb = null;
        if (param0 < 57) {
            return;
        }
        field_fb = null;
        field_jb = null;
    }

    final void a(float param0, boolean param1, boolean param2, String param3) {
        RuntimeException var5 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (((vc) this).field_cb != param2) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (!param2) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((vc) this).field_cb = stackIn_5_1 != 0;
                if (!((vc) this).field_cb) {
                  ((vc) this).field_gb.d(4210752, 2113632, 123);
                  if (!((vc) this).field_ib) {
                    break L1;
                  } else {
                    ((vc) this).field_gb.field_z = false;
                    break L1;
                  }
                } else {
                  ((vc) this).field_gb.d(4210752, 8405024, 125);
                  ((vc) this).field_gb.field_z = true;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            ((vc) this).field_lb = param3;
            ((vc) this).field_gb.field_C = (int)(param0 / 100.0f * 65536.0f);
            if (!param1) {
              break L0;
            } else {
              vc.g((byte) 54);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("vc.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    vc(je param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((vc) this).field_kb = param1;
            if (null != ((vc) this).field_kb) {
                var3_int = on.field_b.a(((vc) this).field_kb, 260, on.field_b.field_H);
                ((vc) this).c(150 - -var3_int, 120, 300);
            }
            ((vc) this).field_gb = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
            ((vc) this).field_gb.field_z = true;
            ((vc) this).field_cb = false;
            ((vc) this).field_ib = false;
            ((vc) this).a((fi) (Object) ((vc) this).field_gb, (byte) -78);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "vc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void k(int param0) {
        ((vc) this).field_ib = true;
        ((vc) this).field_gb.field_z = false;
        int var2 = -44 / ((param0 - -54) / 59);
    }

    final static void h(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) pm.field_l;
        synchronized (var1) {
          L0: {
            j.field_e = hc.field_d;
            ng.field_Q = ng.field_Q + 1;
            nl.field_u = ka.field_i;
            hk.field_Jb = sm.field_a;
            w.field_J = wg.field_a;
            wg.field_a = false;
            oi.field_g = we.field_g;
            ii.field_b = ei.field_f;
            a.field_y = hk.field_Mb;
            we.field_g = 0;
            break L0;
          }
        }
    }

    final static rm a(eh param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rm stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        rm stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.a(-1, param2);
              var5 = param0.a(-60, var4_int, param1);
              if (param3 > 23) {
                break L1;
              } else {
                field_hb = null;
                break L1;
              }
            }
            stackOut_2_0 = bd.a(var5, var4_int, -2071, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("vc.Q(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = new int[]{1, 1, 1, 3, 2, 1, 1, 2, 5, 1};
        field_db = "You cannot move";
    }
}
