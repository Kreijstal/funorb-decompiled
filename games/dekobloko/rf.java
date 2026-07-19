/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    byte[] field_c;
    int field_m;
    int field_j;
    int field_n;
    int field_b;
    int field_l;
    static qm field_k;
    int field_e;
    static String field_p;
    static String field_h;
    static int field_o;
    static String field_i;
    static int field_f;
    static int field_g;
    static int field_a;
    static int field_d;

    final static dh[] a(int param0, uf param1) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        dh[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        dh var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        dh[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        dh[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.a(8, (byte) 80);
            if (var2_int <= 0) {
              var3 = param1.a(12, (byte) 77);
              var4 = new dh[var3];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3) {
                  stackOut_10_0 = (dh[]) (var4);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    if (wg.a(param1, (byte) 26)) {
                      var6 = new dh();
                      discarded$12 = param1.a(24, (byte) 40);
                      discarded$13 = param1.a(24, (byte) 73);
                      var6.field_a = param1.a(24, (byte) 42);
                      discarded$14 = param1.a(9, (byte) 98);
                      discarded$15 = param1.a(12, (byte) 77);
                      discarded$16 = param1.a(12, (byte) 86);
                      discarded$17 = param1.a(12, (byte) 108);
                      var4[var5] = var6;
                      break L2;
                    } else {
                      var6_int = param1.a(ma.a(var5 + -1, (byte) 49), (byte) 118);
                      var4[var5] = var4[var6_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (dh[]) ((Object) stackIn_3_0);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("rf.D(").append(122).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(int param0, boolean param1, float param2, String param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (null == pk.field_v) {
                pk.field_v = new qn(ah.field_c, ed.field_d);
                ah.field_c.a((byte) -107, pk.field_v);
                break L1;
              } else {
                break L1;
              }
            }
            pk.field_v.a(param1, param2, 4210752, param3);
            hk.b();
            cg.a(true, 118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("rf.A(").append(12).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_p = null;
        field_h = null;
        field_k = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null == ik.field_f) {
            break L0;
          } else {
            var1 = ik.field_f;
            synchronized (var1) {
              L1: {
                ik.field_f = null;
                break L1;
              }
            }
            break L0;
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(f.field_r);
            param1.removeFocusListener(f.field_r);
            wi.field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "rf.F(" + 12 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 == 0) {
            var2 = qk.field_i;
        }
        if (param1 == 1) {
            var2 = wh.field_d;
        }
        if (param1 == 2) {
            var2 = wl.field_o;
        }
        return var2;
    }

    final static void a(String[] args, int param1, int param2, int param3, int param4, java.applet.Applet param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              wf.field_n = param5.getParameter("overxgames");
              if (wf.field_n == null) {
                wf.field_n = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              jm.field_u = param5.getParameter("overxachievements");
              if (jm.field_u == null) {
                jm.field_u = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param5.getParameter("currency");
              if (var6 == null) {
                rb.field_m = 2;
                break L3;
              } else {
                if (!be.a((byte) 98, (CharSequence) ((Object) var6))) {
                  rb.field_m = 2;
                  break L3;
                } else {
                  rb.field_m = cb.a((byte) -33, (CharSequence) ((Object) var6));
                  break L3;
                }
              }
            }
            w.field_Fb = 180;
            o.field_d = 16694016;
            qn.field_lb = 0;
            vi.field_z = new ck[args.length];
            var7 = 0;
            L4: while (true) {
              if (var7 >= args.length) {
                dl.field_K = args;
                break L0;
              } else {
                vi.field_z[var7] = new ck(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var6_ref);
            stackOut_17_1 = new StringBuilder().append("rf.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (args == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(0).append(',').append(180).append(',').append(-94).append(',').append(16694016).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    rf(int param0) {
        this.field_j = param0;
    }

    static {
        field_k = new qm(14, 0, 4, 1);
        field_p = "Unpacking sound effects";
        field_i = "When you match pieces, the machine transforms them into solid shapes.";
        field_h = "Show game chat from my friends";
        field_a = 2;
        field_f = 0;
    }
}
