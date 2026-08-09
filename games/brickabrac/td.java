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
            return (jp) null;
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
            throw qb.a((Throwable) ((Object) runtimeException), "td.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
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
            if (!(!this.b((byte) -125))) {
                mc.field_f.c(param2, param3);
            }
            return;
        }
        lb.g(param2, param3, 153, 238, 16777215, 11184810);
        if (!(!this.b((byte) -125))) {
            mc.field_f.c(param2, param3);
        }
    }

    public static void f(int param0) {
        field_w = null;
        field_v = null;
        field_t = null;
        field_r = null;
        if (param0 != 0) {
            field_u = 41;
            field_s = null;
            return;
        }
        field_s = null;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!this.b((byte) -92)) {
            lb.g(param4, param2, 640, 480, hh.field_c[param3], 10792131);
        } else {
            var6 = ge.a(this.field_m, param3, -20777);
            if (!(var6.a((byte) -84, param3, this.field_m))) {
                pi.a(se.field_k, var6, param3, 1, (byte) 18, 0);
                var6.a(this.field_m, param3, (byte) 78);
            }
            ko.a(-91, -7, pb.field_j, param1, var6.field_p, param3, 640, 1, param4, param2, cp.field_I);
        }
        if (!param0) {
            field_v = (mh) null;
            return;
        }
    }

    final static int a(vl[] param0, byte[] param1, kq param2, vl param3, ga param4, int param5) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5 == 10792131) {
              stackIn_4_0 = dq.a(param0, true, new wq(param1), param3, param2, param4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 21;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("td.I(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_20_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final jp[] a(int param0, boolean param1) {
        if (!param1) {
            return (jp[]) null;
        }
        return np.field_c[-1 + param0];
    }

    final jp[] a(byte param0, int param1) {
        int var3 = -91 / ((65 - param0) / 49);
        return kg.field_a[param1 - 1];
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!this.b((byte) -120)) {
            lb.g(param2, param0, 306, 480, hh.field_c[param3], 10792131);
        } else {
            var6 = kd.a(this.field_m, param3, (byte) -111);
            if (!(var6.a((byte) -84, param3, this.field_m))) {
                pi.a(bn.field_p, var6, param3, 2, (byte) 119, -14);
                var6.a(this.field_m, param3, (byte) 78);
            }
            ko.a(-113, -14, cg.field_q, param4, var6.field_p, param3, 306, 2, param2, param0, gq.field_Sb);
        }
        if (param1 >= -84) {
            field_v = (mh) null;
            return;
        }
    }

    final static void g(int param0) {
        fo var1 = null;
        int var2 = 0;
        int var3 = 0;
        fo var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = new fo(new int[]{(int)ue.a(false)});
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
          throw qb.a((Throwable) ((Object) var1_ref), "td.M(" + param0 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
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
                    ne.a(new Object[]{"home", var3 + "home.ws"}, 111, param1, "updatelinks");
                    ne.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, 76, param1, "updatelinks");
                    ne.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, 88, param1, "updatelinks");
                    ne.a(new Object[]{"options", var3 + "options.ws"}, 98, param1, "updatelinks");
                    ne.a(new Object[]{"terms", var3 + "terms.ws"}, 109, param1, "updatelinks");
                    ne.a(new Object[]{"privacy", var3 + "privacy.ws"}, 113, param1, "updatelinks");
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
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("td.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_s = new int[]{8, 23};
        field_r = "Owner";
        field_u = 83;
    }
}
