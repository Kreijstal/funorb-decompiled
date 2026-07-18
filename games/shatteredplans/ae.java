/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static hk field_f;
    static String field_g;
    static String field_d;
    static int[] field_a;
    static String[] field_e;
    static String[] field_c;
    static boolean field_b;
    static int field_h;

    final static vk c(int param0) {
        return jp.field_Bb;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        jr var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        sl var28 = null;
        Object var29 = null;
        wj var29_ref = null;
        long[][] var36 = null;
        int[][] var37 = null;
        RuntimeException decompiledCaughtException = null;
        var29 = null;
        var27 = null;
        var26 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var28 = sa.field_a;
              var2 = var28.j(-56);
              if (0 == var2) {
                var3 = var28.f(-20976);
                var4 = (jr) (Object) i.field_n.d(0);
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var3 != var4.field_j) {
                        var4 = (jr) (Object) i.field_n.a((byte) -71);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4 != null) {
                    L4: {
                      var5 = var28.j(-77);
                      if (0 == var5) {
                        break L4;
                      } else {
                        var6 = var4.field_i;
                        rf.field_j[0].field_b = null;
                        rf.field_j[0].field_d = ln.field_o;
                        var7 = var4.field_k;
                        rf.field_j[0].field_a = false;
                        var8_int = 1;
                        L5: while (true) {
                          if (var5 <= var8_int) {
                            var8 = new String[3][var6];
                            var9 = new String[3][var6];
                            var36 = new long[3][var6];
                            var37 = new int[3][var7 * var6];
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.j(-56);
                            if (var18 <= 0) {
                              break L4;
                            } else {
                              var19 = 0;
                              L6: while (true) {
                                if (var19 >= var18) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.j(-115);
                                    var21 = rf.field_j[var20].field_d;
                                    var22 = var28.d(105);
                                    var24 = var28.field_j;
                                    if (var19 < var6) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = rf.field_j[var20].field_b;
                                      var36[0][var12] = var22;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L7;
                                        } else {
                                          int incrementValue$3 = var15;
                                          var15++;
                                          var37[0][incrementValue$3] = var28.a(16711680);
                                          var25++;
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L9: {
                                    if (var21 == null) {
                                      break L9;
                                    } else {
                                      if (jp.a(var21, (byte) -105)) {
                                        var8[1][var13] = ln.field_o;
                                        var9[1][var13] = null;
                                        var36[1][var13] = var22;
                                        var13++;
                                        var28.field_j = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            int incrementValue$4 = var16;
                                            var16++;
                                            var37[1][incrementValue$4] = var28.a(16711680);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var14 >= var6) {
                                      break L11;
                                    } else {
                                      if (!rf.field_j[var20].field_a) {
                                        rf.field_j[var20].field_a = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = rf.field_j[var20].field_b;
                                        var36[2][var14] = var22;
                                        var28.field_j = var24;
                                        var14++;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var25 >= var7) {
                                            break L11;
                                          } else {
                                            int incrementValue$5 = var17;
                                            var17++;
                                            var37[2][incrementValue$5] = var28.a(16711680);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            L13: {
                              rf.field_j[var8_int].field_d = var28.e(-1);
                              rf.field_j[var8_int].field_a = false;
                              if (var28.j(-78) != 1) {
                                rf.field_j[var8_int].field_b = null;
                                break L13;
                              } else {
                                rf.field_j[var8_int].field_b = var28.e(-1);
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var4.b((byte) -58);
                    break L1;
                  } else {
                    q.g(-125);
                    return;
                  }
                }
              } else {
                if (1 == var2) {
                  var3 = var28.f(-20976);
                  var29_ref = (wj) (Object) wd.field_P.d(0);
                  L14: while (true) {
                    L15: {
                      if (var29_ref == null) {
                        break L15;
                      } else {
                        if (var29_ref.field_h == var3) {
                          break L15;
                        } else {
                          var27 = (Object) (Object) (wj) (Object) wd.field_P.a((byte) -71);
                          continue L14;
                        }
                      }
                    }
                    if (var27 != null) {
                      ((wj) var27).b((byte) -63);
                      break L1;
                    } else {
                      q.g(-112);
                      return;
                    }
                  }
                } else {
                  jq.a(-29901, (Throwable) null, "HS1: " + w.a(16738));
                  q.g(-100);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ae.A(" + 104 + ')');
        }
    }

    final static int[] a(int param0) {
        int var1 = 125 % ((-3 - param0) / 43);
        return new int[8];
    }

    public static void b(int param0) {
        field_e = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_d = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = 19;
        var2 = (Object) (Object) pd.field_j;
        synchronized (var2) {
          L0: {
            ql.field_q = ql.field_q + 1;
            rf.field_n = v.field_d;
            pd.field_k = aj.field_f;
            bb.field_b = rf.field_i;
            r.field_d = kh.field_Lb;
            kh.field_Lb = false;
            je.field_d = vh.field_c;
            nh.field_p = lc.field_c;
            td.field_P = el.field_e;
            vh.field_c = 0;
            break L0;
          }
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) im.field_c);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) im.field_c);
            qn.field_c = -1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ae.G(" + (param0 != null ? "{...}" : "null") + ',' + 18014 + ')');
        }
    }

    final static bi[] a(int param0, String param1, bc param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        bi[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var4_int = param2.a(122, param1);
            var5 = param2.a(var4_int, (byte) 106, param3);
            var6 = -106 / ((-22 - param0) / 53);
            stackOut_0_0 = ch.a(var5, (byte) 87, param2, var4_int);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("ae.E(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You are offering an unrated rematch.";
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = new int[256];
    }
}
