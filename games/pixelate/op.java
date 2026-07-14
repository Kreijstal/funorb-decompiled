/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends de {
    private int field_v;
    private int field_r;
    static String field_w;
    static String field_t;
    static String field_q;
    static cb field_p;
    private int field_u;
    static int field_s;
    private int field_o;

    private final boolean a(boolean param0, int param1) {
        if (!param0) {
            ((op) this).field_o = 93;
        }
        return (jo.field_h & 1L << param1) > 0L ? true : false;
    }

    final static boolean g(int param0) {
        int var1 = -97 / ((55 - param0) / 62);
        return rj.field_F == qo.field_n ? true : false;
    }

    final static void b(int param0, int param1, boolean param2) {
        qe.field_u = param1;
        bb.field_b = param0;
        if (!param2) {
            field_w = null;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        for (var4 = 0; ud.field_I.length > var4; var4++) {
            ud.field_I[var4].c(-124);
        }
        super.a(param0, 3, param2);
        ((op) this).field_v = 0;
        ((op) this).field_r = 1;
    }

    final static tf[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        tf var9 = null;
        tf var10 = null;
        tf var11 = null;
        tf var12 = null;
        tf var13 = null;
        tf var14 = null;
        int[] var15 = null;
        tf var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var20 = t.field_k;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = t.field_j;
          var8 = t.field_d;
          var9 = new tf(param5, -(2 * param5) + param3);
          var9.c();
          t.g(0, 0, param5, -(2 * param5) + param3, param2, param0);
          var10 = new tf(param5, param5);
          var10.c();
          t.d(0, 0, param5, param5, param2);
          var11 = new tf(param1, param5);
          var11.c();
          t.d(0, 0, 16, param5, param2);
          var12 = new tf(param5, param5);
          var12.c();
          t.d(0, 0, param5, param5, param0);
          var13 = new tf(16, param5);
          var13.c();
          t.d(0, 0, 16, param5, param0);
          var14 = null;
          if (param4 > 0) {
            var16 = new tf(16, 16);
            var14 = var16;
            var16.c();
            t.d(0, 0, 16, 16, param4);
            break L0;
          } else {
            break L0;
          }
        }
        t.a(var20, var7, var8);
        return new tf[]{var10, var11, var10, var9, var14, var9, var12, var13, var12};
    }

    final void a(int param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param0 == -1) {
            if (((op) this).field_g.a(79)) {
              var4 = param2 ? 1 : 0;
              la.a(ti.field_t, 16, var4 != 0, -25528);
              break L0;
            } else {
              break L0;
            }
          } else {
            if (-2 == param0) {
              if (!param2) {
                break L0;
              } else {
                if (-2 == (ef.field_b ^ -1)) {
                  ((op) this).field_u = -8;
                  ((op) this).field_r = 3;
                  break L0;
                } else {
                  ((op) this).field_r = 2;
                  break L0;
                }
              }
            } else {
              if (-3 != (param0 ^ -1)) {
                L1: {
                  if (uo.field_j > 0) {
                    break L1;
                  } else {
                    if (!((op) this).field_g.a(74)) {
                      break L1;
                    } else {
                      if (-3 <= (param0 ^ -1)) {
                        break L1;
                      } else {
                        if (32 != ((op) this).field_k[param0]) {
                          break L1;
                        } else {
                          var4 = param0 - 3;
                          if (var4 < 10) {
                            break L1;
                          } else {
                            L2: {
                              var5 = 0;
                              var6 = te.field_Ib;
                              if (jg.a((byte) 105)) {
                                break L2;
                              } else {
                                var5 = 1;
                                var6 = ee.field_a;
                                break L2;
                              }
                            }
                            ii.a(param2, var5, 17, (byte) 71, var6);
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                super.a(param0, (byte) -128, param2);
                break L0;
              } else {
                if (!param2) {
                  break L0;
                } else {
                  if (1 != ef.field_b) {
                    ((op) this).field_v = 2;
                    break L0;
                  } else {
                    ((op) this).field_u = 8;
                    ((op) this).field_v = 3;
                    break L0;
                  }
                }
              }
            }
          }
        }
        L3: {
          if (param1 < -103) {
            break L3;
          } else {
            int discarded$1 = ((op) this).a(125, (byte) 57);
            break L3;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        gj.field_W[4].b(0, 45);
        ((op) this).d((byte) 50);
        ((op) this).b((byte) -71);
        if (param0 != 11) {
            return;
        }
        for (var2 = 0; ud.field_I.length > var2; var2++) {
            ud.field_I[var2].a(-25330);
        }
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            ((op) this).a(103, -99, false);
        }
        if ((param0 ^ -1) != -2) {
            if (2 != param0) {
                if ((param0 ^ -1) >= -3) {
                    return super.a(param0, false);
                }
                return 500;
            }
        }
        return lo.field_Jb - -hf.field_k;
    }

    final void f(int param0) {
        ((op) this).field_o = 0;
        int var2 = 23 / ((-16 - param0) / 43);
    }

    public static void f(byte param0) {
        field_t = null;
        field_q = null;
        int var1 = 3 % ((26 - param0) / 48);
        field_w = null;
        field_p = null;
    }

    final static void g(byte param0) {
        pm.field_h.field_h = 0;
        if (param0 != 68) {
            return;
        }
        pm.field_h.field_m = 0;
    }

    final int a(int param0, int param1) {
        L0: {
          if (param0 == -28071) {
            break L0;
          } else {
            op.f((byte) -35);
            break L0;
          }
        }
        L1: {
          if (1 == param1) {
            break L1;
          } else {
            if (2 != param1) {
              return super.a(-28071, param1);
            } else {
              break L1;
            }
          }
        }
        return rn.field_b;
    }

    final void c(byte param0) {
        if (param0 > -13) {
            ((op) this).field_v = 86;
        }
        la.a(0, 16, false, -25528);
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (param0 < -35) {
            break L0;
          } else {
            boolean discarded$1 = this.a(true, 60);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((ke.field_a ^ -1) != -99) {
              if ((ke.field_a ^ -1) == -100) {
                L3: {
                  if (98 != ke.field_a) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L3;
                  }
                }
                var2 = stackIn_12_0;
                break L2;
              } else {
                super.b(-72);
                break L1;
              }
            } else {
              L4: {
                if (98 != ke.field_a) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L4;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L4;
                }
              }
              var2 = stackIn_6_0;
              break L2;
            }
          }
          L5: {
            var3 = ((op) this).field_g.field_j;
            if (var3 == 0) {
              break L5;
            } else {
              if (-2 == var3) {
                break L5;
              } else {
                if ((var3 ^ -1) == -3) {
                  break L5;
                } else {
                  L6: {
                    L7: {
                      if (3 != var3) {
                        break L7;
                      } else {
                        if (var2 != 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var3 != 52) {
                      var4 = (-ip.field_A + 532) / 2;
                      if (var2 != 0) {
                        L8: {
                          ((op) this).field_g.a(false, -1 + var3);
                          if (((op) this).b(115, ((op) this).field_g.field_j) >= var4) {
                            break L8;
                          } else {
                            ((op) this).field_o = ((op) this).field_o - ip.field_A;
                            break L8;
                          }
                        }
                        if (0 > ((op) this).field_o) {
                          ((op) this).field_o = 0;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        L9: {
                          ((op) this).field_g.a(false, var3 + 1);
                          if (((op) this).b(69, ((op) this).field_g.field_j) <= var4) {
                            break L9;
                          } else {
                            ((op) this).field_o = ((op) this).field_o + ip.field_A;
                            break L9;
                          }
                        }
                        if (((op) this).field_o <= bh.field_k) {
                          break L1;
                        } else {
                          ((op) this).field_o = bh.field_k;
                          break L1;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  ((op) this).field_g.a(false, 0);
                  break L1;
                }
              }
            }
          }
          ((op) this).field_g.a(false, 0);
          break L1;
        }
    }

    final int b(int param0, int param1) {
        int var3 = 43 % ((-13 - param0) / 37);
        if (1 != param1) {
            if (param1 != 2) {
                if (-3 <= (param1 ^ -1)) {
                    return super.b(120, param1);
                }
                return (-3 + param1) * ip.field_A + (-((op) this).field_o + 184);
            }
            return 355;
        }
        return 150;
    }

    final int a(int param0, int param1, int param2) {
        if (param2 >= -110) {
            return -71;
        }
        int var4 = super.a(param0, param1, -112);
        if (2 < var4) {
            if (param1 >= 182) {
                // if_icmpge L47
            }
            var4 = -1;
        }
        return var4;
    }

    final int a(int param0, byte param1) {
        if (param1 != 90) {
            boolean discarded$0 = this.a(false, 70);
        }
        if (1 != param0) {
            if ((param0 ^ -1) != -3) {
                if (2 >= param0) {
                    return super.a(param0, (byte) 90);
                }
                return 300;
            }
        }
        return lo.field_Jb;
    }

    final void e(byte param0) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        ((op) this).field_o = ((op) this).field_o + ((op) this).field_u;
        ((op) this).field_o = ((op) this).field_o + ip.field_A * lp.field_i;
        if (((op) this).field_o < 0) {
            ((op) this).field_o = 0;
        }
        if (param0 > -64) {
            return;
        }
        if (!(bh.field_k >= ((op) this).field_o)) {
            ((op) this).field_o = bh.field_k;
        }
        if (!(0 <= ((op) this).field_u)) {
            ((op) this).field_u = ((op) this).field_u + 1;
        }
        ((op) this).field_v = 0;
        if (!(0 >= ((op) this).field_u)) {
            ((op) this).field_u = ((op) this).field_u - 1;
        }
        ((op) this).field_r = 0;
        super.e((byte) -100);
        int var2 = -4 < (((op) this).field_g.field_j ^ -1) ? -1 : -3 + ((op) this).field_g.field_j;
        for (var3 = 0; ud.field_I.length > var3; var3++) {
            ud.field_I[var3].a(var3 == var2 ? true : false, 20);
        }
    }

    final static void e(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != 260) {
            field_p = null;
        }
        ja.a();
        ai.field_x = 11;
        nk.field_d = new int[260];
        for (var1 = 0; var1 < 256; var1++) {
            var2 = 15.0;
            nk.field_d[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < nk.field_d.length) {
            nk.field_d[var5] = 255;
            var5++;
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ob stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        ob stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        ob stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        tf[] stackIn_19_0 = null;
        tf[] stackIn_20_0 = null;
        tf[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        ob stackOut_14_0 = null;
        String stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        ob stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        ob stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        tf[] stackOut_18_0 = null;
        tf[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        tf[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          if (param0 <= -116) {
            break L0;
          } else {
            ((op) this).field_o = 78;
            break L0;
          }
        }
        L1: {
          var4 = ((op) this).field_k[param2];
          if (-8 != var4) {
            if (var4 == 30) {
              L2: {
                if (0 == ((op) this).field_o) {
                  ((op) this).field_r = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              jm.field_i[((op) this).field_r].b(lo.field_Jb, 150);
              break L1;
            } else {
              if (-32 != var4) {
                if (var4 == 32) {
                  L3: {
                    t.f(0, 182, 640, 350);
                    var5 = -2 + param2;
                    var6 = ki.field_m + 32 + var5;
                    var7 = ((op) this).a(param2, (byte) 90);
                    var8 = ((op) this).a(param2, false);
                    var9 = var7 - -var8 >> -1911180895;
                    var10 = ((op) this).b(58, param2);
                    if (param1) {
                      fi.a(var9, -2 + var10, 35, oc.field_N);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    stackOut_14_0 = rk.field_e;
                    stackOut_14_1 = (String) var6;
                    stackOut_14_2 = var9;
                    stackOut_14_3 = var10 - -rk.field_e.field_w;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    if (!param1) {
                      stackOut_16_0 = (ob) (Object) stackIn_16_0;
                      stackOut_16_1 = (String) (Object) stackIn_16_1;
                      stackOut_16_2 = stackIn_16_2;
                      stackOut_16_3 = stackIn_16_3;
                      stackOut_16_4 = 2;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      break L4;
                    } else {
                      stackOut_15_0 = (ob) (Object) stackIn_15_0;
                      stackOut_15_1 = (String) (Object) stackIn_15_1;
                      stackOut_15_2 = stackIn_15_2;
                      stackOut_15_3 = stackIn_15_3;
                      stackOut_15_4 = 0;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      stackIn_17_4 = stackOut_15_4;
                      break L4;
                    }
                  }
                  L5: {
                    ((ob) (Object) stackIn_17_0).b(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, -1);
                    if (!this.a(true, param2 - 3)) {
                      break L5;
                    } else {
                      L6: {
                        stackOut_18_0 = ih.field_a;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (!param1) {
                          stackOut_20_0 = (tf[]) (Object) stackIn_20_0;
                          stackOut_20_1 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          break L6;
                        } else {
                          stackOut_19_0 = (tf[]) (Object) stackIn_19_0;
                          stackOut_19_1 = 1;
                          stackIn_21_0 = stackOut_19_0;
                          stackIn_21_1 = stackOut_19_1;
                          break L6;
                        }
                      }
                      ((tf) (Object) stackIn_21_0[stackIn_21_1]).b(var8, ((op) this).b(118, param2));
                      break L5;
                    }
                  }
                  t.c();
                  break L1;
                } else {
                  break L1;
                }
              } else {
                L7: {
                  if (bh.field_k != ((op) this).field_o) {
                    break L7;
                  } else {
                    ((op) this).field_v = 1;
                    break L7;
                  }
                }
                jm.field_i[((op) this).field_v - -4].b(lo.field_Jb, 355);
                break L1;
              }
            }
          } else {
            ((op) this).a(h.field_O, oc.field_N, (byte) 122, param1);
            break L1;
          }
        }
    }

    op(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        int var8 = 0;
        int[] var9 = new int[53];
        int[] var7 = var9;
        for (var8 = 0; var9.length > var8; var8++) {
            var9[var8] = 32;
        }
        var9[2] = 31;
        var9[1] = 30;
        var9[0] = 7;
        ((op) this).a(var9, (byte) -24);
        ((op) this).field_r = 0;
        ((op) this).field_v = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Status";
        field_q = "Remove friend";
    }
}
