/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends ki {
    static mh field_t;
    static String field_r;
    static String field_w;
    static int[] field_s;
    static int field_u;
    static mh field_v;

    final jp a(boolean param0, int param1) {
        if (!param0) {
            return null;
        }
        return uj.field_e[-1 + param1];
    }

    td(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
            uj.field_e = new jp[2];
            np.field_c = new jp[2][];
            kg.field_a = new jp[2][];
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "td.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final boolean b(byte param0) {
        if (param0 > -91) {
            return true;
        }
        if (pb.field_j == null) {
            return false;
        }
        if (null == cp.field_I) {
            return false;
        }
        if (null == se.field_k) {
            return false;
        }
        if (mc.field_f == null) {
            return false;
        }
        return true;
    }

    final boolean a(boolean param0) {
        if (!i.field_m.a("volcanic", -28138)) {
            return false;
        }
        pb.field_j = pl.a("volcanic", "volcanic_near", (byte) -127, i.field_m);
        cp.field_I = pl.a("volcanic", "volcanic_mid", (byte) -73, i.field_m);
        se.field_k = pl.a("volcanic", "volcanic_far", (byte) -125, i.field_m);
        mc.field_f = pl.a("volcanic", "volcanic_small", (byte) -77, i.field_m);
        cg.field_q = jh.a(0, pb.field_j);
        gq.field_Sb = jh.a(0, cp.field_I);
        bn.field_p = jh.a(0, se.field_k);
        kg.field_a[0] = cr.a("volcanic", i.field_m, "volcanic_caps", 2);
        np.field_c[0] = cr.a("volcanic", i.field_m, "volcanic_segs", 2);
        uj.field_e[0] = pl.a("volcanic", "volcanic_centre", (byte) -67, i.field_m);
        kg.field_a[1] = ig.a(kg.field_a[0], false);
        np.field_c[1] = ig.a(np.field_c[0], param0);
        uj.field_e[1] = pl.a(-16371, uj.field_e[0]);
        return true;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 9 / ((param0 - -28) / 43);
        if (param1 > -1) {
            lb.g(param2, param3, 153, 238, hh.field_c[param1], 10792131);
            if (!(!((td) this).b((byte) -125))) {
                mc.field_f.c(param2, param3);
            }
            return;
        }
        lb.g(param2, param3, 153, 238, 16777215, 11184810);
        if (!(!((td) this).b((byte) -125))) {
            mc.field_f.c(param2, param3);
        }
    }

    public static void f(int param0) {
        field_w = null;
        field_v = null;
        field_t = null;
        field_r = null;
        field_s = null;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!((td) this).b((byte) -92)) {
            lb.g(param4, param2, 640, 480, hh.field_c[param3], 10792131);
        } else {
            var6 = ge.a(((td) this).field_m, param3, -20777);
            if (!(var6.a((byte) -84, param3, ((td) this).field_m))) {
                pi.a(se.field_k, var6, param3, 1, (byte) 18, 0);
                var6.a(((td) this).field_m, param3, (byte) 78);
            }
            ko.a(-91, -7, pb.field_j, param1, var6.field_p, param3, 640, 1, param4, param2, cp.field_I);
        }
        if (!param0) {
            field_v = null;
            return;
        }
    }

    final static int a(vl[] param0, byte[] param1, kq param2, vl param3, ga param4, int param5) {
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            stackOut_2_0 = dq.a(param0, true, new wq(param1), param3, param2, param4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("td.I(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 10792131 + 41);
        }
        return stackIn_3_0;
    }

    final jp[] a(int param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return np.field_c[-1 + param0];
    }

    final jp[] a(byte param0, int param1) {
        int var3 = -91 / ((65 - param0) / 49);
        return kg.field_a[param1 - 1];
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!((td) this).b((byte) -120)) {
            lb.g(param2, param0, 306, 480, hh.field_c[param3], 10792131);
        } else {
            var6 = kd.a(((td) this).field_m, param3, (byte) -111);
            if (!(var6.a((byte) -84, param3, ((td) this).field_m))) {
                pi.a(bn.field_p, var6, param3, 2, (byte) 119, -14);
                var6.a(((td) this).field_m, param3, (byte) 78);
            }
            ko.a(-113, -14, cg.field_q, param4, var6.field_p, param3, 306, 2, param2, param0, gq.field_Sb);
        }
        if (param1 >= -84) {
            field_v = null;
            return;
        }
    }

    final static void g(int param0) {
        fo var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        fo var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = new fo(new int[1]);
            var1 = var4;
            var2 = param0;
            L1: while (true) {
              if (var2 >= mh.field_F.length) {
                break L0;
              } else {
                mh.field_F[var2] = var4.b(101);
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1_ref, "td.M(" + param0 + 41);
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      if (!param0) {
                        break L2;
                      } else {
                        td.g(-95);
                        break L2;
                      }
                    }
                    var3 = hg.a(param1, var4, -1).getFile();
                    Object discarded$6 = ne.a(new Object[2], 111, param1, "updatelinks");
                    Object discarded$7 = ne.a(new Object[2], 76, param1, "updatelinks");
                    Object discarded$8 = ne.a(new Object[2], 88, param1, "updatelinks");
                    Object discarded$9 = ne.a(new Object[2], 98, param1, "updatelinks");
                    Object discarded$10 = ne.a(new Object[2], 109, param1, "updatelinks");
                    Object discarded$11 = ne.a(new Object[2], 113, param1, "updatelinks");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref;
                stackOut_6_1 = new StringBuilder().append("td.A(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
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
        field_s = new int[]{8, 23};
        field_r = "Owner";
        field_u = 83;
    }
}
