/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vf {
    static String field_c;
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5 = sc.field_i;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1_ref, "vf.E(" + -37 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_13_0 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (dd.a(param1, (byte) 122)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var6 = wh.field_r;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var6.length) {
                    var7 = uh.field_b;
                    var2 = var7;
                    var8 = 0;
                    var3 = var8;
                    L2: while (true) {
                      if (var8 >= var7.length) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      } else {
                        var4 = var7[var8];
                        if (param1 == var4) {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (var4 == param1) {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "vf.A(" + -3 + ',' + param1 + ')');
        }
        return stackIn_24_0 != 0;
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
                stackOut_3_0 = (gp) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (gp) (Object) stackIn_2_0;
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
                var3_int = ((gp) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0, 2, 3 * (fq.field_q + 2) * param2, 0, 2 + fq.field_q) ? 1 : 0;
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
              var6 = (im) (Object) var4.c(1504642273);
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (v.field_e.field_Ib.field_P == 0) {
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
                    var6.field_Pb.a(0, fq.field_q, 0, 256, var6.field_K);
                    var8 = 0;
                    if (null == var6.field_Gb) {
                      break L7;
                    } else {
                      if (!var6.field_Gb.equals((Object) (Object) "")) {
                        var6.field_Ob.field_y = 16737894;
                        var6.field_Ob.field_H = dk.field_e;
                        var6.field_Ob.a(0, fq.field_q, 0, 256, dk.field_e.field_A + 3);
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
                      stackOut_20_0 = (ak) (Object) stackIn_20_0;
                      stackOut_20_1 = var6.field_Fb;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L9;
                    } else {
                      stackOut_19_0 = (ak) (Object) stackIn_19_0;
                      stackOut_19_1 = jl.a(var6.field_Pb.field_Db, var6.field_Fb, var10);
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_21_0.field_cb = stackIn_21_1;
                    if (var6.field_Pb.field_cb.equals((Object) (Object) var6.field_Fb)) {
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
                    var6.field_Pb.a(0, fq.field_q, var9, 256, var10);
                    if (var3_int != 0) {
                      break L11;
                    } else {
                      var6.field_Z = fq.field_q - var6.field_nb;
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 != 0) {
                      v.field_e.field_Fb.a((ak) (Object) var6, 2, -1, (ak) var5);
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
                      em.a(var6.field_Fb, 0L, var6.field_Ib, -1, (ak) (Object) var6, -163, v.field_e.field_Gb, (int[]) null, -1);
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
                  var5 = (Object) (Object) var6;
                  var6 = (im) (Object) var4.f(1504642273);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "vf.B(" + param0 + ',' + 0 + ',' + param2 + ')');
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
                      var2 = param0.getDocumentBase().getFile();
                      var4 = var2;
                      var4 = var2;
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if (var3 < 0) {
                        break L2;
                      } else {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      }
                    }
                    var5 = new java.net.URL(param0.getCodeBase(), var4);
                    param0.getAppletContext().showDocument(lg.a(false, param0, var5), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("vf.D(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
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
              throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 3279 + ')');
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
        field_b = "Kick <%0> from this game";
        field_c = "Click";
        field_a = "Connection lost. <%0>";
    }
}
