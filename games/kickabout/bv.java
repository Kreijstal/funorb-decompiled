/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        CharSequence var4 = (CharSequence) (Object) param0;
        if (!ih.a(var4, true)) {
            return jt.field_Bb;
        }
        if (param1 != -5) {
            return null;
        }
        if (!(param0.equals((Object) (Object) ((bv) this).field_k))) {
            var3 = cp.a(param1 + -86, param0);
            if (var3 == null) {
                return en.field_p;
            }
            if (null == var3.field_d) {
                ((bv) this).field_k = param0;
                ((bv) this).field_j = var3.field_g;
                return !((bv) this).field_j ? jt.field_Bb : he.field_yb;
            }
            return en.field_p;
        }
        return !((bv) this).field_j ? jt.field_Bb : he.field_yb;
    }

    final void c(byte param0) {
        if (param0 <= 70) {
            return;
        }
        ((bv) this).field_k = null;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        wn var4 = null;
        CharSequence var5 = null;
        L0: {
          if (param0 == 25) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        var5 = (CharSequence) (Object) param1;
        var3 = hk.a(var5, false);
        if (var3 != null) {
          return var3;
        } else {
          L1: {
            if (!param1.equals((Object) (Object) ((bv) this).field_k)) {
              var4 = cp.a(-37, param1);
              if (var4 != null) {
                if (var4.field_d == null) {
                  ((bv) this).field_k = param1;
                  ((bv) this).field_j = var4.field_g;
                  break L1;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!((bv) this).field_j) {
            return se.field_B;
          } else {
            return Kickabout.field_I;
          }
        }
    }

    final static void a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, he param5, np param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        uv var12 = null;
        if (param3 < 90) {
          return;
        } else {
          el.a((hd) (Object) param5, false, param6, -1, param5.field_Rb, (int[]) null, param5.field_Ab, param5.field_Nb, -1);
          wi.field_v.a(true, 0);
          wi.field_v.a(0, -116, (int[]) null);
          wi.field_v.b(-80);
          var12 = wi.field_v;
          var8 = param1;
          var9 = param0;
          var10 = param4;
          var11 = param2;
          var12.field_j.a(0, var10, var8, var9, var11);
          return;
        }
    }

    bv(ga param0) {
        super(param0);
        ((bv) this).field_j = false;
    }

    final static void a(int param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            if (param0 != 0) {
                return;
            }
            if (!(!bu.field_h.startsWith("win"))) {
                if (!(!fv.a((byte) -92, param1))) {
                    return;
                }
            }
            try {
                param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                bd.a("MGR1: " + param1, (Throwable) null, 1);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ob param0, int param1, int param2) {
        if (param1 != 256) {
            Object var4 = null;
            bv.a((java.applet.Applet) null, (String) null, (byte) 46);
        }
        ui.g(0).a(param2, (byte) 15, param0);
    }

    public static void g(int param0) {
        field_m = null;
        field_o = null;
        field_p = null;
        if (param0 > -29) {
            field_l = null;
        }
        field_n = null;
        field_l = null;
    }

    final static void a(boolean param0, int[] param1, int param2) {
        ea[] var3 = null;
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
        double[] var25 = null;
        int[] var26 = null;
        double[] var27 = null;
        int[] var28 = null;
        double[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        double[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        double[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        double[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        double[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        double stackIn_21_2 = 0.0;
        double[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        double[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        double[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        double stackIn_24_2 = 0.0;
        double[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        double[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        double stackOut_20_2 = 0.0;
        double[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        double stackOut_19_2 = 0.0;
        double[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        double[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        double stackOut_23_2 = 0.0;
        double[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        double stackOut_22_2 = 0.0;
        var22 = Kickabout.field_G;
        mh.field_j = param1;
        sc.field_D = param1.length;
        hh.field_d = param2;
        var23 = new ea[256];
        var3 = var23;
        var4_int = 0;
        L0: while (true) {
          L1: {
            if (var4_int >= 256) {
              break L1;
            } else {
              var23[var4_int] = new ea();
              var4_int++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var4 = null;
            var32 = new double[256];
            var29 = var32;
            var27 = var29;
            var25 = var27;
            var5 = var25;
            var6 = 0.0;
            var8 = 0;
            var9 = 0;
            if (param0) {
              break L2;
            } else {
              field_n = null;
              break L2;
            }
          }
          var10 = 0;
          var11 = 0;
          var12 = 0;
          bb.field_Mb = new int[sc.field_D];
          var13 = 0;
          var11 = 0;
          L3: while (true) {
            L4: {
              if (var11 >= 33) {
                break L4;
              } else {
                var12 = 0;
                L5: while (true) {
                  L6: {
                    if (var12 >= 33) {
                      break L6;
                    } else {
                      var13 = 0;
                      L7: while (true) {
                        L8: {
                          if (var13 >= 33) {
                            break L8;
                          } else {
                            ao.field_i[var11][var12][var13] = 0;
                            ra.field_F[var11][var12][var13] = 0;
                            tf.field_g[var11][var12][var13] = 0;
                            gm.field_fb[var11][var12][var13] = 0;
                            uc.field_C[var11][var12][var13] = 0.0;
                            var13++;
                            if (0 == 0) {
                              continue L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var12++;
                        if (0 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var11++;
                  if (0 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
            }
            wp.a(uc.field_C, ao.field_i, ra.field_F, 121, gm.field_fb, tf.field_g);
            ld.a(ao.field_i, gm.field_fb, uc.field_C, ra.field_F, tf.field_g, false);
            var14 = var23[0];
            var23[0].field_k = 0;
            var15 = var23[0];
            var15.field_i = 0;
            var14.field_c = 0;
            var16 = var23[0];
            var23[0].field_e = 32;
            var17 = var23[0];
            var10 = 0;
            var17.field_d = 32;
            var16.field_l = 32;
            var8 = 1;
            L9: while (true) {
              L10: {
                if (var8 >= hh.field_d) {
                  break L10;
                } else {
                  L11: {
                    L12: {
                      if (-1 == (tr.a(var23[var8], false, var23[var10]) ^ -1)) {
                        break L12;
                      } else {
                        L13: {
                          stackOut_18_0 = (double[]) var5;
                          stackOut_18_1 = var10;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          if (1 >= var23[var10].field_h) {
                            stackOut_20_0 = (double[]) (Object) stackIn_20_0;
                            stackOut_20_1 = stackIn_20_1;
                            stackOut_20_2 = 0.0;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            stackIn_21_2 = stackOut_20_2;
                            break L13;
                          } else {
                            stackOut_19_0 = (double[]) (Object) stackIn_19_0;
                            stackOut_19_1 = stackIn_19_1;
                            stackOut_19_2 = er.a((byte) 108, var23[var10]);
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            stackIn_21_2 = stackOut_19_2;
                            break L13;
                          }
                        }
                        L14: {
                          stackIn_21_0[stackIn_21_1] = stackIn_21_2;
                          stackOut_21_0 = (double[]) var5;
                          stackOut_21_1 = var8;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_23_1 = stackOut_21_1;
                          stackIn_22_0 = stackOut_21_0;
                          stackIn_22_1 = stackOut_21_1;
                          if (var23[var8].field_h > 1) {
                            stackOut_23_0 = (double[]) (Object) stackIn_23_0;
                            stackOut_23_1 = stackIn_23_1;
                            stackOut_23_2 = er.a((byte) 108, var23[var8]);
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            stackIn_24_2 = stackOut_23_2;
                            break L14;
                          } else {
                            stackOut_22_0 = (double[]) (Object) stackIn_22_0;
                            stackOut_22_1 = stackIn_22_1;
                            stackOut_22_2 = 0.0;
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_24_1 = stackOut_22_1;
                            stackIn_24_2 = stackOut_22_2;
                            break L14;
                          }
                        }
                        stackIn_24_0[stackIn_24_1] = stackIn_24_2;
                        if (0 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var8--;
                    var5[var10] = 0.0;
                    break L11;
                  }
                  var10 = 0;
                  var6 = var32[0];
                  var12 = 1;
                  L15: while (true) {
                    L16: {
                      if (var8 < var12) {
                        break L16;
                      } else {
                        L17: {
                          if (var6 < var32[var12]) {
                            var6 = var32[var12];
                            var10 = var12;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var12++;
                        if (0 == 0) {
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (var6 <= 0.0) {
                        hh.field_d = var8 + 1;
                        if (0 == 0) {
                          break L10;
                        } else {
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var8++;
                    if (0 == 0) {
                      continue L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              var34 = new int[256];
              var31 = var34;
              var28 = var31;
              var26 = var28;
              var18 = var26;
              var33 = new int[35937];
              var30 = var33;
              var24 = var30;
              var12 = 0;
              L19: while (true) {
                L20: {
                  if (var12 >= hh.field_d) {
                    break L20;
                  } else {
                    L21: {
                      L22: {
                        av.a(var12, 1, var33, var23[var12]);
                        var9 = fr.a(var23[var12], ao.field_i, true);
                        if (-1 == (var9 ^ -1)) {
                          break L22;
                        } else {
                          var19 = fr.a(var23[var12], ra.field_F, true) / var9 & 255;
                          var20 = fr.a(var23[var12], tf.field_g, true) / var9 & 255;
                          var21 = fr.a(var23[var12], gm.field_fb, param0) / var9 & 255;
                          var18[var12] = var21 + (var19 << 39986832) + (var20 << 329803688);
                          if (0 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var34 = var31;
                      var34[var12] = 0;
                      break L21;
                    }
                    var12++;
                    if (0 == 0) {
                      continue L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var8 = 0;
                L23: while (true) {
                  L24: {
                    if (sc.field_D <= var8) {
                      break L24;
                    } else {
                      param1[var8] = var18[qj.b(var24[bb.field_Mb[var8]], 255)];
                      var8++;
                      if (0 == 0) {
                        continue L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
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
