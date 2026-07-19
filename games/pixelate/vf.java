/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_c;
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 > -104) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            vf.a((java.applet.Applet) null, 33);
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param0 == -37) {
              var5 = sc.field_i;
              var1 = var5;
              var2 = 0;
              var3 = var5.length;
              L1: while (true) {
                if (var2 >= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$40 = var2;
                  var2++;
                  var5[incrementValue$40] = 0;
                  incrementValue$41 = var2;
                  var2++;
                  var5[incrementValue$41] = 0;
                  incrementValue$42 = var2;
                  var2++;
                  var5[incrementValue$42] = 0;
                  incrementValue$43 = var2;
                  var2++;
                  var5[incrementValue$43] = 0;
                  incrementValue$44 = var2;
                  var2++;
                  var5[incrementValue$44] = 0;
                  incrementValue$45 = var2;
                  var2++;
                  var5[incrementValue$45] = 0;
                  incrementValue$46 = var2;
                  var2++;
                  var5[incrementValue$46] = 0;
                  incrementValue$47 = var2;
                  var2++;
                  var5[incrementValue$47] = 0;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "vf.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_14_0 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (dd.a(param1, (byte) 122)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var2 = wh.field_r;
                  var3 = 0;
                  if (param0 == -3) {
                    break L1;
                  } else {
                    field_c = (String) null;
                    break L1;
                  }
                }
                L2: while (true) {
                  if (var3 >= var2.length) {
                    var6 = uh.field_b;
                    var2 = var6;
                    var7 = 0;
                    var3 = var7;
                    L3: while (true) {
                      if (var7 >= var6.length) {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var6[var7];
                        if (param1 == var4) {
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var2[var3];
                    if (var4 == param1) {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "vf.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                return stackIn_25_0 != 0;
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        bb var4 = null;
        Object var5 = null;
        im var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wi var17 = null;
        wi var18 = null;
        gp stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        gp stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        gp stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        ak stackIn_19_0 = null;
        ak stackIn_20_0 = null;
        ak stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        gp stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        gp stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        gp stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        ak stackOut_18_0 = null;
        ak stackOut_20_0 = null;
        String stackOut_20_1 = null;
        ak stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = v.field_e.field_Gb;
              stackOut_1_1 = param0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (bj.field_d != v.field_e.field_Gb) {
                stackOut_3_0 = (gp) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (gp) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((gp) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0, 2, 3 * (fq.field_q + 2) * param2, param1 ^ param1, 2 + fq.field_q) ? 1 : 0;
                var4 = v.field_e.field_Fb.field_L;
                if (2 == gk.field_db) {
                  break L3;
                } else {
                  if (1 == gk.field_db) {
                    break L3;
                  } else {
                    v.field_e.field_Gb.field_Ib.field_cb = mk.field_c;
                    v.field_e.field_rb = false;
                    wd.a(v.field_e.field_Fb, false);
                    break L2;
                  }
                }
              }
              v.field_e.field_rb = true;
              v.field_e.field_Gb.field_Ib.field_cb = null;
              var5 = null;
              var6 = (im) ((Object) var4.c(1504642273));
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (-1 == (v.field_e.field_Ib.field_P ^ -1)) {
                      break L5;
                    } else {
                      he.field_f = new ve(v.field_e.field_Ib.field_tb, v.field_e.field_Ib.field_gb, v.field_e.field_Ib.field_K, v.field_e.field_Ib.field_nb, dp.field_p, po.field_c, mg.field_h, mg.field_h);
                      il.field_e = 2;
                      break L5;
                    }
                  }
                  if (v.field_e.field_Hb.field_P != 0) {
                    he.field_f = new ve(v.field_e.field_Hb.field_tb, v.field_e.field_Hb.field_gb, v.field_e.field_Hb.field_K, v.field_e.field_Hb.field_nb, uf.field_f, po.field_c, mg.field_h, mg.field_h);
                    il.field_e = 3;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (null != var6.field_L) {
                      break L6;
                    } else {
                      var6.field_Pb = new ak(0L, ak.field_T);
                      var6.a(var6.field_Pb, (byte) 26);
                      var6.field_Ob = new ak(0L, ak.field_T);
                      var6.a(var6.field_Ob, (byte) 26);
                      var6.h(-257);
                      var7 = 1;
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_K = v.field_e.field_Fb.field_K;
                    var6.field_Pb.a(0, fq.field_q, 0, param1 ^ 256, var6.field_K);
                    var8 = 0;
                    if (null == var6.field_Gb) {
                      break L7;
                    } else {
                      if (!var6.field_Gb.equals("")) {
                        var6.field_Ob.field_y = 16737894;
                        var6.field_Ob.field_H = dk.field_e;
                        var6.field_Ob.a(0, fq.field_q, 0, param1 + 256, dk.field_e.field_A + 3);
                        var8 = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_K;
                    if (var8 != 0) {
                      var9 = dk.field_e.field_A - -3;
                      var10 = var10 - var9;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_18_0 = var6.field_Pb;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (0 >= var10) {
                      stackOut_20_0 = (ak) ((Object) stackIn_20_0);
                      stackOut_20_1 = var6.field_Fb;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L9;
                    } else {
                      stackOut_19_0 = (ak) ((Object) stackIn_19_0);
                      stackOut_19_1 = jl.a(var6.field_Pb.field_Db, var6.field_Fb, var10);
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_21_0.field_cb = stackIn_21_1;
                    if (var6.field_Pb.field_cb.equals(var6.field_Fb)) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L10;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_24_0;
                    var6.field_Pb.a(0, fq.field_q, var9, param1 + 256, var10);
                    if (var3_int != 0) {
                      break L11;
                    } else {
                      var6.field_Z = fq.field_q - var6.field_nb;
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 != 0) {
                      v.field_e.field_Fb.a(var6, 2, -1, (ak) (var5));
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (var6.field_Ob == null) {
                        break L14;
                      } else {
                        if (var6.field_Ob.field_W) {
                          up.field_o = var6.field_Gb;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Pb.field_W) {
                      break L13;
                    } else {
                      if (var11 == 0) {
                        break L13;
                      } else {
                        up.field_o = var6.field_Fb;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (var6.field_P != 0) {
                      em.a(var6.field_Fb, 0L, var6.field_Ib, -1, var6, -163, v.field_e.field_Gb, (int[]) null, -1);
                      var17 = eg.field_n;
                      var13_ref_String = k.field_n;
                      var17.field_b.a(var13_ref_String, (byte) -107, 7);
                      var18 = eg.field_n;
                      var13 = uo.field_a;
                      var14 = ji.field_c;
                      var18.field_b.b(0, var13, 43, var14, 0);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var5 = var6;
                  var6 = (im) ((Object) var4.f(1504642273));
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "vf.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 == 3279) {
                        break L2;
                      } else {
                        field_c = (String) null;
                        break L2;
                      }
                    }
                    L3: {
                      var2 = param0.getDocumentBase().getFile();
                      var4 = var2;
                      var4 = var2;
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if ((var3 ^ -1) > -1) {
                        break L3;
                      } else {
                        var4 = var4 + var2.substring(var3);
                        break L3;
                      }
                    }
                    var5 = new java.net.URL(param0.getCodeBase(), var4);
                    param0.getAppletContext().showDocument(lg.a(false, param0, var5), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) (var2_ref2);
                stackOut_8_1 = new StringBuilder().append("vf.D(");
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L5;
                } else {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L5;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Kick <%0> from this game";
        field_c = "Click";
        field_a = "Connection lost. <%0>";
    }
}
