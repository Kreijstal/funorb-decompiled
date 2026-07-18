/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bv extends jd {
    private String field_k;
    static String field_p;
    static String field_m;
    static rk[] field_l;
    static String field_o;
    private boolean field_j;
    static String field_n;

    final rv a(String param0, int param1) {
        wn var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rv stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        rv stackIn_12_0 = null;
        rv stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        rv stackOut_11_0 = null;
        rv stackOut_16_0 = null;
        rv stackOut_15_0 = null;
        Object stackOut_4_0 = null;
        rv stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param0;
            int discarded$5 = 1;
            if (ih.a(var4)) {
              if (param1 == -5) {
                L1: {
                  if (!param0.equals((Object) (Object) ((bv) this).field_k)) {
                    L2: {
                      var3 = cp.a(param1 + -86, param0);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (null == var3.field_d) {
                          ((bv) this).field_k = param0;
                          ((bv) this).field_j = var3.field_g;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_11_0 = en.field_p;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (((bv) this).field_j) {
                    stackOut_16_0 = he.field_yb;
                    stackIn_17_0 = stackOut_16_0;
                    break L3;
                  } else {
                    stackOut_15_0 = jt.field_Bb;
                    stackIn_17_0 = stackOut_15_0;
                    break L3;
                  }
                }
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (rv) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = jt.field_Bb;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("bv.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final void c(byte param0) {
        if (param0 <= 70) {
            return;
        }
        ((bv) this).field_k = null;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wn var4 = null;
        CharSequence var5 = null;
        String stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        Object stackOut_11_0 = null;
        String stackOut_17_0 = null;
        String stackOut_15_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 25) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            var5 = (CharSequence) (Object) param1;
            int discarded$2 = 0;
            var3 = hk.a(var5);
            if (var3 != null) {
              stackOut_4_0 = (String) var3;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                if (!param1.equals((Object) (Object) ((bv) this).field_k)) {
                  var4 = cp.a(-37, param1);
                  if (var4 != null) {
                    if (var4.field_d == null) {
                      ((bv) this).field_k = param1;
                      ((bv) this).field_j = var4.field_g;
                      break L2;
                    } else {
                      stackOut_11_0 = null;
                      stackIn_12_0 = stackOut_11_0;
                      return (String) (Object) stackIn_12_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (((bv) this).field_j) {
                stackOut_17_0 = Kickabout.field_I;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                stackOut_15_0 = se.field_B;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("bv.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    final static void a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            try {
                lu.field_t = param1;
                try {
                    if (param2 != 15) {
                        Object var6 = null;
                        bv.a((java.applet.Applet) null, (String) null, (byte) 80);
                    }
                    var7 = param0.getParameter("cookieprefix");
                    var5 = var7;
                    var5 = var7;
                    var4 = param0.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var8 = var7 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                    var5 = var8;
                    var5 = var8;
                    if (0 == param1.length()) {
                        var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    mm.a("document.cookie=\"" + var5 + "\"", param0, (byte) -19);
                } catch (Throwable throwable) {
                }
                nt.a(param0, (byte) 99);
            } catch (RuntimeException runtimeException) {
                throw nb.a((Throwable) (Object) runtimeException, "bv.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, he param5, np param6) {
        uv var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            el.a((hd) (Object) param5, false, param6, -1, param5.field_Rb, (int[]) null, param5.field_Ab, param5.field_Nb, -1);
            wi.field_v.a(true, 0);
            wi.field_v.a(0, -116, (int[]) null);
            wi.field_v.b(-80);
            var7 = wi.field_v;
            var8 = param1;
            var9 = param0;
            var10 = 0;
            var11 = 0;
            var7.field_j.a(0, var10, var8, var9, var11);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "bv.C(" + param0 + ',' + param1 + ',' + 0 + ',' + 95 + ',' + 0 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    bv(ga param0) {
        super(param0);
        ((bv) this).field_j = false;
    }

    final static void a(int param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                L1: {
                  if (bu.field_h.startsWith("win")) {
                    if (fv.a((byte) -92, param1)) {
                      return;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                {
                  L2: {
                    param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var4_ref;
                stackOut_11_1 = new StringBuilder().append("bv.G(").append(0).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              L5: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param3 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ob param0, int param1, int param2) {
        try {
            ui.g(0).a(param2, (byte) 15, param0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "bv.J(" + (param0 != null ? "{...}" : "null") + ',' + 256 + ',' + param2 + ')');
        }
    }

    public static void g() {
        field_m = null;
        field_o = null;
        field_p = null;
        field_n = null;
        field_l = null;
    }

    final static void a(boolean param0, int[] param1) {
        RuntimeException var3 = null;
        int var4_int = 0;
        Object var4 = null;
        double[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ea var14 = null;
        ea var15 = null;
        ea var16 = null;
        ea var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        ea[] var23 = null;
        int[] var24 = null;
        int var25 = 0;
        ea[] var26 = null;
        double[] var27 = null;
        int[] var28 = null;
        double[] var29 = null;
        int[] var30 = null;
        double[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        double[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        double[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        double[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        double[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        double stackIn_19_2 = 0.0;
        double[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        double[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        double[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        double stackIn_22_2 = 0.0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        double[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        double stackOut_18_2 = 0.0;
        double[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        double stackOut_17_2 = 0.0;
        double[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        double[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        double stackOut_21_2 = 0.0;
        double[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        double stackOut_20_2 = 0.0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var22 = Kickabout.field_G;
        try {
          L0: {
            mh.field_j = param1;
            sc.field_D = param1.length;
            hh.field_d = 255;
            var23 = new ea[256];
            var26 = var23;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= 256) {
                var4 = null;
                var34 = new double[256];
                var31 = var34;
                var29 = var31;
                var27 = var29;
                var5 = var27;
                var6 = 0.0;
                var8 = 0;
                var9 = 0;
                var10 = 0;
                var11 = 0;
                var12 = 0;
                bb.field_Mb = new int[sc.field_D];
                var13 = 0;
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 33) {
                    wp.a(uc.field_C, ao.field_i, ra.field_F, 121, gm.field_fb, tf.field_g);
                    int discarded$5 = 0;
                    ld.a(ao.field_i, gm.field_fb, uc.field_C, ra.field_F, tf.field_g);
                    var14 = var26[0];
                    var26[0].field_k = 0;
                    var15 = var26[0];
                    var15.field_i = 0;
                    var14.field_c = 0;
                    var16 = var26[0];
                    var26[0].field_e = 32;
                    var17 = var26[0];
                    var10 = 0;
                    var17.field_d = 32;
                    var16.field_l = 32;
                    var8 = 1;
                    L3: while (true) {
                      L4: {
                        if (var8 >= hh.field_d) {
                          break L4;
                        } else {
                          L5: {
                            if (tr.a(var26[var8], false, var26[var10]) == 0) {
                              var8--;
                              var5[var10] = 0.0;
                              break L5;
                            } else {
                              L6: {
                                stackOut_16_0 = (double[]) var5;
                                stackOut_16_1 = var10;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                if (1 >= var26[var10].field_h) {
                                  stackOut_18_0 = (double[]) (Object) stackIn_18_0;
                                  stackOut_18_1 = stackIn_18_1;
                                  stackOut_18_2 = 0.0;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  stackIn_19_2 = stackOut_18_2;
                                  break L6;
                                } else {
                                  stackOut_17_0 = (double[]) (Object) stackIn_17_0;
                                  stackOut_17_1 = stackIn_17_1;
                                  stackOut_17_2 = er.a((byte) 108, var26[var10]);
                                  stackIn_19_0 = stackOut_17_0;
                                  stackIn_19_1 = stackOut_17_1;
                                  stackIn_19_2 = stackOut_17_2;
                                  break L6;
                                }
                              }
                              L7: {
                                stackIn_19_0[stackIn_19_1] = stackIn_19_2;
                                stackOut_19_0 = (double[]) var5;
                                stackOut_19_1 = var8;
                                stackIn_21_0 = stackOut_19_0;
                                stackIn_21_1 = stackOut_19_1;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                if (var26[var8].field_h > 1) {
                                  stackOut_21_0 = (double[]) (Object) stackIn_21_0;
                                  stackOut_21_1 = stackIn_21_1;
                                  stackOut_21_2 = er.a((byte) 108, var26[var8]);
                                  stackIn_22_0 = stackOut_21_0;
                                  stackIn_22_1 = stackOut_21_1;
                                  stackIn_22_2 = stackOut_21_2;
                                  break L7;
                                } else {
                                  stackOut_20_0 = (double[]) (Object) stackIn_20_0;
                                  stackOut_20_1 = stackIn_20_1;
                                  stackOut_20_2 = 0.0;
                                  stackIn_22_0 = stackOut_20_0;
                                  stackIn_22_1 = stackOut_20_1;
                                  stackIn_22_2 = stackOut_20_2;
                                  break L7;
                                }
                              }
                              stackIn_22_0[stackIn_22_1] = stackIn_22_2;
                              break L5;
                            }
                          }
                          var10 = 0;
                          var6 = var34[0];
                          var12 = 1;
                          L8: while (true) {
                            if (var8 < var12) {
                              if (var6 <= 0.0) {
                                hh.field_d = var8 + 1;
                                break L4;
                              } else {
                                var8++;
                                continue L3;
                              }
                            } else {
                              L9: {
                                if (var6 < var34[var12]) {
                                  var6 = var34[var12];
                                  var10 = var12;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var12++;
                              continue L8;
                            }
                          }
                        }
                      }
                      var36 = new int[256];
                      var33 = var36;
                      var30 = var33;
                      var28 = var30;
                      var18 = var28;
                      var35 = new int[35937];
                      var32 = var35;
                      var24 = var32;
                      var12 = 0;
                      L10: while (true) {
                        if (var12 >= hh.field_d) {
                          var8 = 0;
                          L11: while (true) {
                            if (sc.field_D <= var8) {
                              break L0;
                            } else {
                              param1[var8] = var18[qj.b(var24[bb.field_Mb[var8]], 255)];
                              var8++;
                              continue L11;
                            }
                          }
                        } else {
                          L12: {
                            av.a(var12, 1, var35, var26[var12]);
                            int discarded$6 = 1;
                            var9 = fr.a(var26[var12], ao.field_i);
                            if (var9 == 0) {
                              var36[var12] = 0;
                              break L12;
                            } else {
                              int discarded$7 = 1;
                              var19 = fr.a(var26[var12], ra.field_F) / var9 & 255;
                              int discarded$8 = 1;
                              var20 = fr.a(var26[var12], tf.field_g) / var9 & 255;
                              int discarded$9 = 1;
                              var21 = fr.a(var26[var12], gm.field_fb) / var9 & 255;
                              var18[var12] = var21 + (var19 << 16) + (var20 << 8);
                              break L12;
                            }
                          }
                          var12++;
                          continue L10;
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L13: while (true) {
                      if (var12 >= 33) {
                        var11++;
                        continue L2;
                      } else {
                        var25 = 0;
                        var13 = var25;
                        L14: while (true) {
                          if (var25 >= 33) {
                            var12++;
                            continue L13;
                          } else {
                            ao.field_i[var11][var12][var25] = 0;
                            ra.field_F[var11][var12][var25] = 0;
                            tf.field_g[var11][var12][var25] = 0;
                            gm.field_fb[var11][var12][var25] = 0;
                            uc.field_C[var11][var12][var25] = 0.0;
                            var25++;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var23[var4_int] = new ea();
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var3;
            stackOut_44_1 = new StringBuilder().append("bv.K(").append(true).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L15;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L15;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + 255 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "To Customer Support";
        field_o = "Quit to website";
        field_n = "to the Qualifying Round";
        field_m = "<%0>'s game";
    }
}
