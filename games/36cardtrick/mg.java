/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static kc[] field_j;
    short[] field_g;
    short[] field_N;
    short[] field_J;
    private boolean field_L;
    short[] field_a;
    short[] field_l;
    short[] field_p;
    int field_s;
    short[] field_I;
    short[] field_H;
    int[] field_w;
    int[] field_F;
    int field_u;
    short[] field_t;
    short[] field_v;
    short[] field_n;
    short[] field_d;
    short[] field_k;
    int[] field_h;
    short field_c;
    short field_M;
    short[] field_Q;
    int[] field_o;
    int field_i;
    int field_f;
    int[] field_P;
    static String field_K;
    short[] field_O;
    static int field_q;
    int[] field_G;
    short[] field_B;
    short field_C;
    int[] field_x;
    short[] field_r;
    int field_e;
    byte[] field_D;
    int[] field_m;
    int field_z;
    short[] field_b;
    byte field_E;
    int[] field_y;

    private final void a(int param0) {
        ((mg) this).field_L = false;
        int var2 = -31 / ((-56 - param0) / 59);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Main.field_T;
        for (var5 = 0; ((mg) this).field_C > var5; var5++) {
            ((mg) this).field_r[var5] = (short)(((mg) this).field_r[var5] + param1);
            ((mg) this).field_b[var5] = (short)(((mg) this).field_b[var5] + param2);
            ((mg) this).field_O[var5] = (short)(((mg) this).field_O[var5] + param3);
        }
        if (param0) {
            field_K = null;
        }
        this.a(99);
    }

    final static void a(int param0, boolean param1) {
    }

    final static void a() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Main.field_T;
        if (0 <= h.field_F) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (75 <= h.field_F) {
              break L0;
            } else {
              var5 = (h.field_F << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (h.field_F > 200) {
              var5 = (-h.field_F + 250 << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            dl.a(88, id.field_e);
            jb.b();
            vj.d();
            de.b(33);
            if (var5 >= 256) {
              break L2;
            } else {
              vj.a(0, 0, vj.field_l, vj.field_g, 0, 256 - var5);
              break L2;
            }
          }
          L3: {
            gg.a(14756);
            if (h.field_F < 150) {
              id.field_e.c(var3, var4);
              break L3;
            } else {
              sg.field_d.e(15 + var3, 10 + var4, var5);
              break L3;
            }
          }
          L4: {
            var6 = h.field_F - 125;
            if (0 >= var6) {
              break L4;
            } else {
              if (var6 >= 50) {
                break L4;
              } else {
                if (var6 >= 20) {
                  if (var6 < 30) {
                    rc.field_i.b(var3, var4, 256);
                    break L4;
                  } else {
                    var7 = (12800 + -(var6 * 256)) / 20;
                    rc.field_i.b(var3, var4, var7);
                    break L4;
                  }
                } else {
                  var7 = 256 * var6 / 20;
                  rc.field_i.b(var3, var4, var7);
                  break L4;
                }
              }
            }
          }
          L5: {
            var6 = h.field_F + -140;
            if (0 >= var6) {
              break L5;
            } else {
              L6: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                  break L6;
                } else {
                  break L6;
                }
              }
              qg.field_z.e(15 + var3, 10 + var4, var7 * var5 >> 8);
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void c() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          L0: {
            L1: {
              cj.field_l = new int[]{105, 151, 380, 418, 411, 373, 368, 368, 368, 368, 368};
              nk.field_a = new int[]{217, 216, 34, 263, 347, 148, 149, 149, 149, 104, 62};
              fh.field_G = new int[][]{new int[9], new int[5], new int[1], new int[1], new int[2], new int[2], new int[1], new int[1], new int[1], new int[2], new int[2]};
              kb.field_b = new int[]{36, 36, 64, 64, 36, 36, 36, 36, 36, 36, 36};
              ia.field_c = new kc[22];
              var1_int = qa.field_b.a(bk.field_c[3]);
              var2 = qa.field_b.a(bk.field_c[4]);
              if (var1_int >= var2) {
                break L1;
              } else {
                var1_int = var2;
                break L1;
              }
            }
            t.field_i = -80 + (207 + var1_int) >> 1;
            var1_int = 0;
            L2: while (true) {
              if (var1_int > 14) {
                var1_int = 15;
                L3: while (true) {
                  if (var1_int > 21) {
                    gf.field_e.a(200);
                    break L0;
                  } else {
                    ia.field_c[var1_int] = new kc(120, 31);
                    ia.field_c[var1_int].c();
                    vj.c(0, 0, 207, 34, 6962948);
                    vj.g(2, 2, 118, 29);
                    field_j[4].b(0, 0);
                    var7 = bk.field_c[var1_int];
                    var3 = qa.field_b.a(var7);
                    var4 = 120 + -var3 >> 1;
                    a.a(16777214, var7, -1, var4, 16777215, 23);
                    var1_int++;
                    continue L3;
                  }
                }
              } else {
                L4: {
                  L5: {
                    ia.field_c[var1_int] = new kc(207, 34);
                    ia.field_c[var1_int].c();
                    vj.c(0, 0, 207, 34, 6962948);
                    vj.g(4, 4, 203, 30);
                    field_j[4].b(0, 0);
                    var6 = bk.field_c[var1_int];
                    var3 = qa.field_b.a(var6);
                    var4 = -var3 + 207 >> 1;
                    if (var1_int == 3) {
                      break L5;
                    } else {
                      if (4 != var1_int) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var4 = -var3 + t.field_i;
                  break L4;
                }
                a.a(16777214, var6, -1, var4, 16777215, 23);
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "mg.B(" + 96 + 41);
        }
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        uh var4_ref_uh = null;
        long var4 = 0L;
        int var5 = 0;
        ad var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
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
        w var27 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = Main.field_T;
        try {
          L0: {
            L1: {
              var27 = rd.field_j;
              var2 = var27.f(-121);
              if (var2 != 0) {
                if (1 != var2) {
                  int discarded$7 = 92;
                  k.a((Throwable) null, (byte) -101, "HS1: " + aj.a());
                  mc.a((byte) -126);
                  break L1;
                } else {
                  var3 = var27.d((byte) 72);
                  var4 = var27.d(true);
                  var6 = (ad) (Object) od.field_b.a((byte) 74);
                  L2: while (true) {
                    L3: {
                      if (var6 == null) {
                        break L3;
                      } else {
                        if (var6.field_p == var3) {
                          break L3;
                        } else {
                          var6 = (ad) (Object) od.field_b.b((byte) -122);
                          continue L2;
                        }
                      }
                    }
                    if (var6 != null) {
                      var6.field_h = var4;
                      var6.c(83);
                      break L1;
                    } else {
                      mc.a((byte) -125);
                      return;
                    }
                  }
                }
              } else {
                var3 = var27.d((byte) 72);
                var4_ref_uh = (uh) (Object) tl.field_a.a((byte) 74);
                L4: while (true) {
                  L5: {
                    if (var4_ref_uh == null) {
                      break L5;
                    } else {
                      if (var3 == var4_ref_uh.field_g) {
                        break L5;
                      } else {
                        var4_ref_uh = (uh) (Object) tl.field_a.b((byte) -119);
                        continue L4;
                      }
                    }
                  }
                  if (var4_ref_uh == null) {
                    mc.a((byte) -127);
                    return;
                  } else {
                    L6: {
                      var5 = var27.f(-120);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        var6_int = var4_ref_uh.field_k;
                        c.field_w[0].field_d = false;
                        c.field_w[0].field_f = null;
                        var7 = var4_ref_uh.field_h;
                        c.field_w[0].field_e = ri.field_c;
                        var8_int = 1;
                        L7: while (true) {
                          if (var8_int >= var5) {
                            String[][] dupTemp$8 = new String[3][var6_int];
                            var4_ref_uh.field_m = dupTemp$8;
                            var8 = dupTemp$8;
                            var9 = new String[3][var6_int];
                            long[][] dupTemp$9 = new long[3][var6_int];
                            var4_ref_uh.field_j = dupTemp$9;
                            var10 = dupTemp$9;
                            int[][] dupTemp$10 = new int[3][var6_int * var7];
                            var4_ref_uh.field_q = dupTemp$10;
                            var11 = dupTemp$10;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.f(-126);
                            if (var18 <= 0) {
                              break L6;
                            } else {
                              var19 = 0;
                              L8: while (true) {
                                if (var19 >= var18) {
                                  break L6;
                                } else {
                                  L9: {
                                    var20 = var27.f(121);
                                    var21 = c.field_w[var20].field_e;
                                    var22 = var27.d(true);
                                    var24 = var27.field_i;
                                    if (var6_int <= var19) {
                                      break L9;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = c.field_w[var20].field_f;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L10: while (true) {
                                        if (var7 <= var25) {
                                          break L9;
                                        } else {
                                          int incrementValue$11 = var15;
                                          var15++;
                                          var11[0][incrementValue$11] = var27.e((byte) 126);
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
                                      if (rc.a(true, var21)) {
                                        var8[1][var13] = ri.field_c;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var27.field_i = var24;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            int incrementValue$12 = var16;
                                            var16++;
                                            var11[1][incrementValue$12] = var27.e((byte) 125);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var6_int <= var14) {
                                      break L13;
                                    } else {
                                      if (!c.field_w[var20].field_d) {
                                        c.field_w[var20].field_d = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = c.field_w[var20].field_f;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var27.field_i = var24;
                                        var25 = 0;
                                        L14: while (true) {
                                          if (var25 >= var7) {
                                            break L13;
                                          } else {
                                            int incrementValue$13 = var17;
                                            var17++;
                                            var11[2][incrementValue$13] = var27.e((byte) 124);
                                            var25++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L8;
                                }
                              }
                            }
                          } else {
                            L15: {
                              c.field_w[var8_int].field_e = var27.c(false);
                              c.field_w[var8_int].field_d = false;
                              if (var27.f(56) == 1) {
                                c.field_w[var8_int].field_f = var27.c(false);
                                break L15;
                              } else {
                                c.field_w[var8_int].field_f = null;
                                break L15;
                              }
                            }
                            var8_int++;
                            continue L7;
                          }
                        }
                      }
                    }
                    var4_ref_uh.field_o = true;
                    var4_ref_uh.c(104);
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "mg.F(" + -127 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = Main.field_T;
        int var6 = 0;
        if (param2 != -6670) {
            ((mg) this).a(-1, -111, -21, -90, 53);
        }
        while (((mg) this).field_C > var6) {
            ((mg) this).field_r[var6] = (short)(((mg) this).field_r[var6] * param4 / param3);
            ((mg) this).field_b[var6] = (short)(((mg) this).field_b[var6] * param0 / param3);
            ((mg) this).field_O[var6] = (short)(((mg) this).field_O[var6] * param1 / param3);
            var6++;
        }
        this.a(param2 ^ -6671);
    }

    public static void b(int param0) {
        field_j = null;
        field_K = null;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Main.field_T;
        if (!((mg) this).field_L) {
          ((mg) this).field_L = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((mg) this).field_C) {
              L1: {
                ((mg) this).field_s = var3;
                ((mg) this).field_i = var7;
                ((mg) this).field_u = var6;
                ((mg) this).field_f = var5;
                ((mg) this).field_e = var2;
                ((mg) this).field_z = var4;
                if (param0 >= 110) {
                  break L1;
                } else {
                  ((mg) this).a(false, -125, -90, -67);
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var9 = ((mg) this).field_r[var8];
                var10 = ((mg) this).field_b[var8];
                var11 = ((mg) this).field_O[var8];
                if (var2 > var9) {
                  var2 = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10 >= var3) {
                  break L3;
                } else {
                  var3 = var10;
                  break L3;
                }
              }
              L4: {
                if (var6 < var10) {
                  var6 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var9 <= var5) {
                  break L5;
                } else {
                  var5 = var9;
                  break L5;
                }
              }
              L6: {
                if (var7 < var11) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    mg() {
        ((mg) this).field_L = false;
        ((mg) this).field_E = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Create a free Account";
    }
}
