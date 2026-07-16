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
        field_z = null;
        field_C = null;
        if (!param0) {
            wc.b((byte) 81);
        }
        field_s = null;
        field_D = null;
        field_F = null;
        field_t = null;
        field_y = null;
        field_A = null;
    }

    wc(lh param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_C, -1, 2147483647, false);
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        if (param0 <= 58) {
            wc.b(false);
        }
        if (param3) {
            vj.a(param4.field_r + param2, param4.field_C, param4.field_y, (byte) 120, param4.field_u + param1);
        }
        super.a((byte) 127, param1, param2, param3, param4);
    }

    final static void a(java.awt.Color param0, boolean param1, String param2, int param3, boolean param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = ja.field_h.getGraphics();
              if (li.field_f != null) {
                break L1;
              } else {
                li.field_f = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              }
            }
            L2: {
              if (param1) {
                var9.setColor(java.awt.Color.black);
                var9.fillRect(0, 0, tm.field_c, em.field_O);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == null) {
                param0 = new java.awt.Color(140, 17, 17);
                break L3;
              } else {
                break L3;
              }
            }
            try {
              L4: {
                L5: {
                  if (ga.field_a == null) {
                    ga.field_a = ja.field_h.createImage(304, 34);
                    break L5;
                  } else {
                    break L5;
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
                  boolean discarded$1 = var9.drawImage(ga.field_a, -152 + tm.field_c / 2, -18 + em.field_O / 2, (java.awt.image.ImageObserver) null);
                  break L4;
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L6: {
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
                break L6;
              }
            }
            L7: {
              if (gi.field_f == null) {
                break L7;
              } else {
                var9.setFont(li.field_f);
                var9.setColor(java.awt.Color.white);
                var9.drawString(gi.field_f, tm.field_c / 2 + -(6 * gi.field_f.length() / 2), -26 + em.field_O / 2);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var5 = (Exception) (Object) decompiledCaughtException;
            ja.field_h.repaint();
            break L8;
          }
        }
    }

    wc(int param0) {
        this(rb.field_b, param0);
    }

    final static void b(byte param0) {
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
        L0: {
          var26 = Chess.field_G;
          var27 = tk.field_h;
          var2 = var27.i(param0 ^ 127);
          if (var2 != 0) {
            if ((var2 ^ -1) == -2) {
              var3 = var27.f(674914976);
              var4_ref = (ak) (Object) nc.field_O.g(-18110);
              L1: while (true) {
                L2: {
                  if (var4_ref == null) {
                    break L2;
                  } else {
                    if ((var3 ^ -1) == (var4_ref.field_s ^ -1)) {
                      break L2;
                    } else {
                      var4_ref = (ak) (Object) nc.field_O.a((byte) -102);
                      continue L1;
                    }
                  }
                }
                if (var4_ref != null) {
                  var4_ref.c(-2193);
                  break L0;
                } else {
                  si.d(65280);
                  return;
                }
              }
            } else {
              fg.a((Throwable) null, (byte) -77, "HS1: " + tm.b((byte) -123));
              si.d(param0 + 65325);
              break L0;
            }
          } else {
            var3 = var27.f(674914976);
            var4 = (fd) (Object) fb.field_L.g(-18110);
            L3: while (true) {
              L4: {
                if (var4 == null) {
                  break L4;
                } else {
                  if (var3 == var4.field_j) {
                    break L4;
                  } else {
                    var4 = (fd) (Object) fb.field_L.a((byte) -93);
                    continue L3;
                  }
                }
              }
              if (var4 != null) {
                L5: {
                  var5 = var27.i(-110);
                  if (var5 != 0) {
                    var6 = var4.field_k;
                    om.field_m[0].field_g = false;
                    om.field_m[0].field_d = ci.field_J;
                    var7 = var4.field_m;
                    om.field_m[0].field_h = null;
                    var8_int = 1;
                    L6: while (true) {
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
                          L7: while (true) {
                            if (var19 >= var18) {
                              break L5;
                            } else {
                              L8: {
                                var20 = var27.i(-114);
                                var21 = om.field_m[var20].field_d;
                                var22 = var27.d((byte) 127);
                                var24 = var27.field_l;
                                if (var19 >= var6) {
                                  break L8;
                                } else {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = om.field_m[var20].field_h;
                                  var34[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L9: while (true) {
                                    if (var7 <= var25) {
                                      break L8;
                                    } else {
                                      int incrementValue$3 = var15;
                                      var15++;
                                      var35[0][incrementValue$3] = var27.e((byte) -109);
                                      var25++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (var21 == null) {
                                  break L10;
                                } else {
                                  if (!qd.a((byte) 13, var21)) {
                                    break L10;
                                  } else {
                                    var8[1][var13] = ci.field_J;
                                    var9[1][var13] = null;
                                    var34[1][var13] = var22;
                                    var27.field_l = var24;
                                    var13++;
                                    var25 = 0;
                                    L11: while (true) {
                                      if ((var7 ^ -1) >= (var25 ^ -1)) {
                                        break L10;
                                      } else {
                                        int incrementValue$4 = var16;
                                        var16++;
                                        var35[1][incrementValue$4] = var27.e((byte) -119);
                                        var25++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              }
                              L12: {
                                if (var14 >= var6) {
                                  break L12;
                                } else {
                                  if (om.field_m[var20].field_g) {
                                    break L12;
                                  } else {
                                    om.field_m[var20].field_g = true;
                                    var8[2][var14] = var21;
                                    var9[2][var14] = om.field_m[var20].field_h;
                                    var34[2][var14] = var22;
                                    var27.field_l = var24;
                                    var14++;
                                    var25 = 0;
                                    L13: while (true) {
                                      if (var25 >= var7) {
                                        break L12;
                                      } else {
                                        int incrementValue$5 = var17;
                                        var17++;
                                        var35[2][incrementValue$5] = var27.e((byte) -107);
                                        var25++;
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                              }
                              var19++;
                              continue L7;
                            }
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        L14: {
                          om.field_m[var8_int].field_d = var27.d(0);
                          om.field_m[var8_int].field_g = false;
                          if (1 != var27.i(param0 + -44)) {
                            om.field_m[var8_int].field_h = null;
                            break L14;
                          } else {
                            om.field_m[var8_int].field_h = var27.d(0);
                            break L14;
                          }
                        }
                        var8_int++;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                var4.c(param0 ^ 2236);
                break L0;
              } else {
                si.d(param0 ^ -65325);
                return;
              }
            }
          }
        }
        L15: {
          if (param0 == -45) {
            break L15;
          } else {
            field_v = -78;
            break L15;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new int[][]{new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33]};
        field_y = "<%0> cannot join; the game is full.";
        field_F = "Game was finished before the first move.";
        field_A = "Cancel draw";
        field_u = -1;
        field_D = new int[][]{new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33], new int[33]};
        field_z = new int[][][]{field_D, field_C};
        field_G = "You can spectate this game";
        field_t = new boolean[64];
    }
}
