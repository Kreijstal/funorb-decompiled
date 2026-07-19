/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wc extends hl {
    static int field_u;
    static int field_v;
    static String field_F;
    static int field_w;
    static boolean field_E;
    static String field_A;
    static ci field_B;
    static eb field_s;
    private static int[][] field_C;
    static int[][][] field_z;
    static String field_G;
    static boolean[] field_t;
    static String field_y;
    static boolean field_x;
    private static int[][] field_D;

    public static void b(boolean param0) {
        field_B = null;
        field_G = null;
        field_z = (int[][][]) null;
        field_C = (int[][]) null;
        if (!param0) {
            wc.b((byte) 81);
        }
        field_s = null;
        field_D = (int[][]) null;
        field_F = null;
        field_t = null;
        field_y = null;
        field_A = null;
    }

    wc(lh param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_C, -1, 2147483647, false);
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        try {
            if (param0 <= 58) {
                wc.b(false);
            }
            if (param3) {
                vj.a(param4.field_r + param2, param4.field_C, param4.field_y, (byte) 120, param4.field_u + param1);
            }
            super.a((byte) 127, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "wc.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Color param0, boolean param1, String param2, int param3, boolean param4) {
        boolean discarded$1 = false;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int decompiledRegionSelector2 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = ja.field_h.getGraphics();
                  if (li.field_f != null) {
                    break L2;
                  } else {
                    li.field_f = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param1) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, tm.field_c, em.field_O);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0 == null) {
                    param0 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (ga.field_a == null) {
                        ga.field_a = ja.field_h.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = ga.field_a.getGraphics();
                    var10.setColor(param0);
                    if (!param4) {
                      var10.drawRect(0, 0, 303, 33);
                      var10.fillRect(2, 2, 3 * param3, 30);
                      var10.setColor(java.awt.Color.black);
                      var10.drawRect(1, 1, 301, 31);
                      var10.fillRect(param3 * 3 + 2, 2, 300 - param3 * 3, 30);
                      var10.setFont(li.field_f);
                      var10.setColor(java.awt.Color.white);
                      var10.drawString(param2, (304 + -(6 * param2.length())) / 2, 22);
                      discarded$1 = var9.drawImage(ga.field_a, -152 + tm.field_c / 2, -18 + em.field_O / 2, (java.awt.image.ImageObserver) null);
                      decompiledRegionSelector0 = 1;
                      break L5;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = tm.field_c / 2 - 152;
                    var8 = -18 + em.field_O / 2;
                    var9.setColor(param0);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(var7 - -2, 2 + var8, param3 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, var8 - -1, 301, 31);
                    var9.fillRect(param3 * 3 + (var7 + 2), 2 + var8, 300 + -(3 * param3), 30);
                    var9.setFont(li.field_f);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param2, var7 - -((304 - 6 * param2.length()) / 2), var8 - -22);
                    decompiledRegionSelector0 = 1;
                    break L7;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L1;
                } else {
                  L8: {
                    if (gi.field_f == null) {
                      break L8;
                    } else {
                      var9.setFont(li.field_f);
                      var9.setColor(java.awt.Color.white);
                      var9.drawString(gi.field_f, tm.field_c / 2 + -(6 * gi.field_f.length() / 2), -26 + em.field_O / 2);
                      break L8;
                    }
                  }
                  decompiledRegionSelector1 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                ja.field_h.repaint();
                decompiledRegionSelector1 = 0;
                break L9;
              }
            }
            if (decompiledRegionSelector1 == 0) {
              decompiledRegionSelector2 = 0;
              break L0;
            } else {
              decompiledRegionSelector2 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5_ref);
            stackOut_21_1 = new StringBuilder().append("wc.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          L11: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L11;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector2 == 0) {
          return;
        } else {
          return;
        }
    }

    wc(int param0) {
        this(rb.field_b, param0);
    }

    final static void b(byte param0) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fd var4 = null;
        ak var4_ref = null;
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
        nk var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = Chess.field_G;
        try {
          L0: {
            L1: {
              var27 = tk.field_h;
              var2 = var27.i(param0 ^ 127);
              if (var2 != 0) {
                if ((var2 ^ -1) == -2) {
                  var3 = var27.f(674914976);
                  var4_ref = (ak) ((Object) nc.field_O.g(-18110));
                  L2: while (true) {
                    L3: {
                      if (var4_ref == null) {
                        break L3;
                      } else {
                        if (var3 == var4_ref.field_s) {
                          break L3;
                        } else {
                          var4_ref = (ak) ((Object) nc.field_O.a((byte) -102));
                          continue L2;
                        }
                      }
                    }
                    if (var4_ref != null) {
                      var4_ref.c(-2193);
                      break L1;
                    } else {
                      si.d(65280);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  fg.a((Throwable) null, (byte) -77, "HS1: " + tm.b((byte) -123));
                  si.d(param0 + 65325);
                  break L1;
                }
              } else {
                var3 = var27.f(674914976);
                var4 = (fd) ((Object) fb.field_L.g(-18110));
                L4: while (true) {
                  L5: {
                    if (var4 == null) {
                      break L5;
                    } else {
                      if (var3 == var4.field_j) {
                        break L5;
                      } else {
                        var4 = (fd) ((Object) fb.field_L.a((byte) -93));
                        continue L4;
                      }
                    }
                  }
                  if (var4 != null) {
                    L6: {
                      var5 = var27.i(-110);
                      if (var5 != 0) {
                        var6 = var4.field_k;
                        om.field_m[0].field_g = false;
                        om.field_m[0].field_d = ci.field_J;
                        var7 = var4.field_m;
                        om.field_m[0].field_h = null;
                        var8_int = 1;
                        L7: while (true) {
                          if (var8_int >= var5) {
                            var8 = new String[3][var6];
                            var9 = new String[3][var6];
                            var34 = new long[3][var6];
                            var35 = new int[3][var6 * var7];
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.i(param0 ^ 89);
                            if (-1 > (var18 ^ -1)) {
                              var19 = 0;
                              L8: while (true) {
                                if (var19 >= var18) {
                                  break L6;
                                } else {
                                  L9: {
                                    var20 = var27.i(-114);
                                    var21 = om.field_m[var20].field_d;
                                    var22 = var27.d((byte) 127);
                                    var24 = var27.field_l;
                                    if (var19 >= var6) {
                                      break L9;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = om.field_m[var20].field_h;
                                      var34[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L10: while (true) {
                                        if (var7 <= var25) {
                                          break L9;
                                        } else {
                                          incrementValue$3 = var15;
                                          var15++;
                                          var35[0][incrementValue$3] = var27.e((byte) -109);
                                          var25++;
                                          continue L10;
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var21 == null) {
                                      break L11;
                                    } else {
                                      if (!qd.a((byte) 13, var21)) {
                                        break L11;
                                      } else {
                                        var8[1][var13] = ci.field_J;
                                        var9[1][var13] = null;
                                        var34[1][var13] = var22;
                                        var27.field_l = var24;
                                        var13++;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var35[1][incrementValue$4] = var27.e((byte) -119);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var14 >= var6) {
                                      break L13;
                                    } else {
                                      if (om.field_m[var20].field_g) {
                                        break L13;
                                      } else {
                                        om.field_m[var20].field_g = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = om.field_m[var20].field_h;
                                        var34[2][var14] = var22;
                                        var27.field_l = var24;
                                        var14++;
                                        var25 = 0;
                                        L14: while (true) {
                                          if (var25 >= var7) {
                                            break L13;
                                          } else {
                                            incrementValue$5 = var17;
                                            var17++;
                                            var35[2][incrementValue$5] = var27.e((byte) -107);
                                            var25++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L8;
                                }
                              }
                            } else {
                              break L6;
                            }
                          } else {
                            L15: {
                              om.field_m[var8_int].field_d = var27.d(0);
                              om.field_m[var8_int].field_g = false;
                              if (1 != var27.i(param0 + -44)) {
                                om.field_m[var8_int].field_h = null;
                                break L15;
                              } else {
                                om.field_m[var8_int].field_h = var27.d(0);
                                break L15;
                              }
                            }
                            var8_int++;
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    var4.c(param0 ^ 2236);
                    break L1;
                  } else {
                    si.d(param0 ^ -65325);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            L16: {
              if (param0 == -45) {
                break L16;
              } else {
                field_v = -78;
                break L16;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "wc.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_C = new int[][]{new int[]{2, 19, 0, 19, 1, 0, 6, 19, 4, 0, 0, 0, 27, 19, 5, 0, 3, 0, 0, 0, 7, 0, 19, 0, 19, 0, 10, 19, 13, 20, 5, 26, 8}, new int[]{19, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 22, 19, 0, 19, 22, 22, 0, 26, 0, 0}, new int[]{19, 19, 19, 21, 0, 0, 19, 0, 21, 0, 0, 26, 0, 19, 0, 19, 0, 22, 0, 23, 19, 22, 23, 27, 26, 21, 22, 19, 26, 25, 19, 0, 20}, new int[]{20, 0, 0, 20, 21, 19, 0, 0, 0, 19, 0, 0, 0, 0, 0, 22, 19, 0, 0, 0, 0, 0, 0, 26, 0, 27, 25, 19, 20, 20, 19, 0, 21}, new int[]{0, 0, 19, 19, 20, 20, 0, 19, 23, 0, 0, 0, 0, 20, 0, 0, 0, 0, 22, 0, 0, 0, 19, 0, 21, 21, 22, 0, 21, 20, 21, 19, 19}, new int[]{19, 19, 0, 19, 20, 0, 19, 19, 23, 23, 19, 19, 19, 0, 22, 0, 19, 0, 0, 0, 19, 19, 21, 21, 0, 0, 25, 21, 24, 25, 21, 9, 19}, new int[]{20, 20, 0, 0, 0, 19, 0, 0, 0, 0, 0, 23, 23, 0, 20, 0, 0, 0, 0, 19, 0, 0, 27, 0, 0, 0, 19, 19, 0, 19, 26, 27, 21}, new int[]{0, 19, 0, 0, 0, 0, 0, 0, 19, 0, 23, 0, 20, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 19, 19, 0, 0, 19, 20, 19, 25, 21, 26}, new int[]{19, 0, 19, 0, 19, 0, 19, 0, 0, 23, 0, 19, 0, 19, 20, 0, 0, 19, 19, 19, 0, 21, 27, 0, 19, 25, 22, 22, 27, 0, 24, 21, 0}, new int[]{20, 0, 0, 19, 19, 20, 0, 19, 0, 19, 23, 0, 20, 0, 0, 19, 0, 0, 19, 0, 0, 0, 21, 0, 0, 19, 27, 0, 24, 24, 21, 24, 21}, new int[]{22, 19, 16, 0, 20, 20, 0, 22, 0, 0, 19, 0, 19, 25, 0, 22, 27, 0, 19, 0, 23, 0, 0, 0, 0, 19, 23, 20, 0, 0, 24, 0, 26}, new int[]{0, 0, 0, 0, 0, 19, 21, 21, 0, 19, 26, 22, 0, 0, 0, 22, 0, 0, 0, 0, 0, 0, 0, 0, 22, 22, 0, 0, 19, 19, 20, 24, 25}, new int[]{19, 0, 0, 19, 0, 16, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 19, 19, 0, 20, 20, 24, 19, 0, 19, 19}, new int[]{20, 12, 19, 20, 0, 0, 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22, 0, 22, 0, 27, 24, 24, 0, 24}, new int[]{20, 0, 0, 20, 19, 26, 0, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 22, 0, 0, 0, 19, 0, 0, 24, 24, 0}, new int[]{19, 21, 0, 23, 21, 0, 0, 18, 19, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 19, 0, 22, 0, 0, 19, 0, 0, 0, 20}, new int[]{0, 20, 0, 20, 16, 23, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 19, 16, 19, 0, 0, 20, 0, 20}, new int[]{14, 19, 22, 19, 21, 20, 20, 19, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 20, 0, 20, 20, 0, 19, 10}, new int[]{20, 0, 0, 20, 0, 20, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 19, 19, 19, 24, 24}, new int[]{19, 0, 22, 19, 20, 22, 19, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 21, 19, 0, 0, 0, 0, 19, 19, 0, 19, 0, 0}, new int[]{0, 0, 0, 22, 19, 0, 0, 19, 19, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 19, 25}, new int[]{0, 0, 19, 0, 0, 22, 0, 0, 19, 20, 0, 0, 0, 0, 22, 0, 0, 0, 0, 0, 0, 21, 27, 22, 0, 0, 0, 19, 0, 19, 20, 24, 0}, new int[]{19, 9, 0, 19, 0, 19, 21, 0, 20, 0, 26, 19, 0, 22, 0, 19, 0, 0, 0, 27, 22, 0, 19, 19, 20, 0, 0, 19, 0, 0, 0, 0, 19}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 21, 19, 0, 0, 19, 0, 19, 0, 0, 19, 19, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 24, 24}, new int[]{20, 0, 0, 19, 0, 21, 19, 19, 0, 0, 0, 19, 19, 20, 20, 0, 0, 0, 19, 0, 0, 19, 19, 20, 0, 19, 0, 0, 0, 20, 20, 0, 0}, new int[]{0, 0, 0, 0, 19, 0, 19, 21, 0, 0, 23, 0, 0, 0, 0, 0, 19, 19, 0, 0, 19, 0, 0, 22, 19, 0, 19, 0, 0, 19, 23, 19, 19}, new int[]{0, 17, 19, 0, 0, 0, 0, 0, 26, 19, 0, 23, 20, 19, 19, 19, 0, 0, 0, 19, 0, 0, 20, 22, 19, 0, 19, 0, 25, 0, 0, 0, 22}, new int[]{5, 19, 20, 20, 0, 19, 0, 21, 0, 19, 26, 0, 19, 0, 0, 0, 0, 0, 19, 0, 0, 20, 20, 0, 0, 0, 0, 21, 0, 0, 0, 21, 22}, new int[]{0, 0, 20, 20, 20, 0, 19, 0, 19, 20, 0, 0, 19, 0, 19, 17, 0, 0, 19, 0, 0, 0, 22, 22, 0, 0, 21, 0, 0, 19, 11, 22, 0}, new int[]{19, 22, 0, 0, 6, 0, 0, 19, 0, 20, 20, 23, 23, 0, 27, 21, 0, 20, 0, 9, 0, 19, 19, 0, 19, 21, 21, 19, 19, 21, 21, 21, 20}, new int[]{19, 0, 22, 19, 0, 21, 21, 0, 19, 19, 0, 0, 4, 20, 20, 21, 19, 0, 21, 21, 19, 0, 22, 0, 19, 0, 20, 19, 0, 19, 20, 0, 0}, new int[]{0, 20, 0, 0, 19, 21, 0, 22, 0, 22, 20, 19, 0, 0, 0, 19, 0, 0, 21, 0, 0, 0, 19, 19, 0, 19, 22, 22, 22, 20, 19, 0, 19}, new int[]{11, 19, 13, 0, 19, 22, 10, 19, 11, 19, 27, 19, 20, 0, 6, 19, 12, 21, 21, 19, 19, 0, 12, 20, 20, 26, 0, 8, 20, 0, 22, 19, 0}};
        field_y = "<%0> cannot join; the game is full.";
        field_F = "Game was finished before the first move.";
        field_A = "Cancel draw";
        field_u = -1;
        field_D = new int[][]{new int[]{1, 3, 5, 4, 1, 6, 3, 3, 2, 5, 3, 6, 1, 4, 3, 6, 1, 5, 3, 3, 1, 4, 3, 5, 2, 4, 3, 3, 1, 6, 5, 3, 2}, new int[]{4, 3, 3, 6, 5, 4, 3, 6, 4, 4, 3, 3, 5, 3, 6, 5, 3, 3, 4, 3, 6, 6, 3, 3, 4, 5, 3, 5, 3, 3, 4, 3, 3}, new int[]{4, 3, 9, 3, 6, 7, 3, 8, 3, 5, 6, 3, 4, 3, 5, 8, 3, 6, 5, 4, 6, 4, 3, 4, 3, 7, 5, 4, 3, 8, 5, 3, 7}, new int[]{5, 4, 3, 6, 4, 3, 3, 5, 3, 6, 6, 3, 4, 3, 3, 3, 5, 4, 5, 9, 6, 4, 3, 6, 3, 4, 4, 3, 5, 5, 6, 3, 3}, new int[]{2, 3, 4, 6, 5, 5, 6, 3, 6, 7, 5, 3, 8, 6, 4, 6, 3, 3, 5, 3, 4, 3, 5, 3, 4, 3, 6, 6, 3, 6, 3, 5, 1}, new int[]{5, 3, 7, 6, 3, 5, 3, 6, 3, 5, 6, 3, 10, 5, 3, 6, 4, 3, 3, 3, 5, 6, 5, 3, 4, 6, 3, 3, 6, 3, 5, 5, 3}, new int[]{6, 6, 3, 5, 5, 6, 3, 5, 3, 6, 3, 3, 5, 3, 6, 5, 4, 6, 5, 4, 3, 4, 6, 5, 6, 5, 3, 6, 4, 5, 4, 4, 6}, new int[]{4, 3, 7, 5, 6, 3, 3, 4, 3, 3, 3, 3, 5, 3, 6, 3, 3, 8, 3, 5, 3, 5, 6, 6, 3, 3, 3, 5, 5, 3, 6, 3, 6}, new int[]{1, 3, 9, 4, 5, 3, 4, 3, 3, 5, 6, 3, 4, 3, 6, 3, 12, 3, 3, 3, 6, 3, 5, 5, 3, 4, 3, 5, 4, 4, 3, 5, 2}, new int[]{4, 3, 6, 3, 4, 5, 4, 3, 6, 3, 4, 5, 3, 3, 6, 3, 3, 4, 5, 3, 3, 3, 9, 5, 5, 3, 6, 3, 4, 3, 3, 5, 3}, new int[]{3, 5, 3, 5, 3, 6, 3, 5, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 6, 5, 3, 4, 6, 3, 3, 3, 5}, new int[]{6, 3, 4, 3, 4, 3, 3, 5, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 5, 3, 4, 3, 3, 4, 3, 6, 4}, new int[]{2, 4, 5, 6, 3, 4, 3, 4, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 6, 3, 7, 5, 6, 4, 5, 2}, new int[]{3, 6, 4, 3, 3, 4, 5, 3, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 6, 5, 6, 3, 4, 3, 5, 4, 6}, new int[]{3, 4, 3, 5, 3, 4, 6, 5, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 6, 3, 6, 5, 3, 5, 3, 10, 3}, new int[]{6, 3, 6, 4, 3, 4, 3, 3, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 6, 5, 10, 5, 5, 5, 6, 3}, new int[]{2, 5, 3, 3, 4, 4, 4, 3, 4, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 3, 6, 3, 4, 6, 5, 3, 8, 2}, new int[]{4, 6, 3, 3, 3, 4, 3, 3, 5, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 3, 4, 4, 3, 5, 3, 5, 3}, new int[]{6, 3, 4, 3, 6, 5, 3, 4, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 8, 3, 4, 4, 3, 3, 4, 10, 4}, new int[]{3, 4, 5, 5, 3, 6, 4, 3, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 3, 6, 3, 5, 4, 7, 4, 5}, new int[]{1, 4, 6, 3, 3, 4, 3, 6, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 5, 3, 3, 5, 3, 3, 4, 3, 2}, new int[]{3, 4, 6, 3, 5, 3, 6, 3, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 3, 5, 3, 6, 3, 4, 4, 6}, new int[]{3, 6, 4, 3, 5, 3, 4, 5, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 5, 3, 6, 3, 4, 4, 5, 3, 6}, new int[]{3, 5, 4, 3, 3, 4, 3, 3, 4, 5, 3, 4, 3, 6, 10, 3, 6, 3, 5, 3, 4, 5, 10, 3, 5, 3, 5, 5, 6, 3, 4, 6, 5}, new int[]{2, 3, 5, 3, 5, 3, 3, 4, 3, 4, 6, 3, 5, 3, 4, 3, 3, 6, 3, 3, 4, 4, 3, 3, 5, 10, 5, 6, 4, 3, 3, 4, 2}, new int[]{4, 3, 3, 4, 3, 3, 4, 4, 3, 3, 3, 4, 3, 3, 4, 4, 3, 3, 5, 4, 6, 3, 5, 3, 6, 5, 5, 3, 6, 5, 4, 3, 6}, new int[]{3, 4, 6, 5, 3, 4, 3, 5, 3, 4, 4, 3, 4, 6, 4, 3, 4, 4, 6, 4, 4, 3, 4, 3, 4, 3, 5, 3, 5, 6, 5, 3, 7}, new int[]{3, 3, 4, 3, 5, 3, 3, 6, 3, 4, 3, 3, 4, 4, 3, 6, 3, 4, 3, 3, 5, 3, 6, 3, 4, 5, 3, 3, 4, 3, 3, 5, 4}, new int[]{1, 3, 3, 5, 3, 3, 4, 3, 4, 7, 4, 3, 6, 3, 3, 4, 4, 3, 6, 7, 4, 4, 3, 6, 3, 3, 3, 5, 3, 4, 3, 5, 1}, new int[]{3, 4, 7, 5, 3, 6, 6, 6, 4, 9, 5, 3, 5, 8, 4, 6, 3, 6, 3, 6, 4, 3, 5, 6, 7, 4, 6, 4, 3, 5, 6, 6, 3}, new int[]{4, 3, 3, 5, 3, 4, 4, 3, 4, 5, 6, 6, 4, 3, 4, 3, 3, 4, 9, 4, 3, 4, 3, 3, 5, 3, 5, 3, 7, 6, 4, 3, 5}, new int[]{8, 3, 5, 6, 3, 3, 4, 5, 8, 3, 4, 6, 3, 9, 5, 6, 4, 6, 4, 6, 5, 3, 5, 3, 3, 4, 5, 6, 5, 3, 4, 3, 4}, new int[]{2, 4, 6, 3, 1, 3, 4, 3, 1, 3, 3, 5, 2, 6, 3, 3, 2, 5, 3, 6, 2, 4, 3, 4, 1, 3, 5, 3, 1, 3, 6, 5, 2}};
        field_z = new int[][][]{field_D, field_C};
        field_G = "You can spectate this game";
        field_t = new boolean[64];
    }
}
