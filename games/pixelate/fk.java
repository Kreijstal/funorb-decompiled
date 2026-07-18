/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends de {
    static String field_q;
    private int field_r;
    static tf[] field_s;
    static int field_o;
    static String field_p;

    public static void e(int param0) {
        int var1 = 41;
        field_p = null;
        field_s = null;
        field_q = null;
    }

    fk(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((fk) this).field_r = 0;
    }

    final void a(int param0, int param1, boolean param2) {
        ((fk) this).field_r = 0;
        super.a(param0, 1, param2);
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (((fk) this).c(-123, 0)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (((fk) this).c(-119, 2)) {
            stackOut_5_0 = 2;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (param0 <= -35) {
          L2: {
            if (((fk) this).field_g.c((byte) 35)) {
              break L2;
            } else {
              L3: {
                if (ke.field_a == 96) {
                  if (var2 >= ((fk) this).field_g.field_j) {
                    ((fk) this).field_g.a(false, var3);
                    break L3;
                  } else {
                    ((fk) this).field_g.a(false, ((fk) this).field_g.field_j + -1);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if (ke.field_a != 97) {
                  break L4;
                } else {
                  L5: {
                    if (((fk) this).field_g.field_j < 0) {
                      break L5;
                    } else {
                      if (~((fk) this).field_g.field_j > ~var3) {
                        ((fk) this).field_g.a(false, ((fk) this).field_g.field_j - -1);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((fk) this).field_g.a(false, var2);
                  break L4;
                }
              }
              L6: {
                if (ke.field_a == 98) {
                  break L6;
                } else {
                  if (ke.field_a != 99) {
                    break L2;
                  } else {
                    break L6;
                  }
                }
              }
              if (((fk) this).field_g.field_j == -1) {
                ((fk) this).field_g.a(false, 1);
                break L2;
              } else {
                break L2;
              }
            }
          }
          ((fk) this).field_g.b((byte) -71);
          return;
        } else {
          return;
        }
    }

    final static id a(byte param0, String[] param1) {
        id var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        id stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        id stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new id(false);
            var2.field_f = param1;
            var3 = 72 % ((-2 - param0) / 58);
            stackOut_0_0 = (id) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("fk.B(").append(param0).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void b(boolean param0, boolean param1) {
        int var3 = 0;
        ((fk) this).field_r = ((fk) this).field_r + 1;
        if (param0) {
            int discarded$0 = ((fk) this).a(-73, (byte) -53);
        }
        if (!param1) {
            if (ln.field_m.length - 1 == ((fk) this).field_r) {
                var3 = ke.field_a;
                ke.field_a = 96;
                ((fk) this).field_g.a(84, 1);
                ke.field_a = var3;
            }
        }
    }

    final int b(int param0, int param1) {
        int var3 = 14 / ((param0 - -13) / 37);
        return ((fk) this).field_d;
    }

    final void a(byte param0, boolean param1, int param2) {
        if (1 != param2) {
            super.a((byte) 35, oc.field_W, param1, param2);
        } else {
            ((fk) this).a(param1, true);
        }
        if (param0 > -116) {
            ((fk) this).b(-71);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != 90) {
            return 61;
        }
        return param0 * 180 + ((fk) this).field_m;
    }

    final void e(byte param0) {
        super.e((byte) -107);
        if (!(((fk) this).field_r != 3)) {
            cf.field_u.a((byte) 21);
        }
        if (!(((fk) this).field_r != 7)) {
            jf.field_c.b(300);
        }
        if (param0 > -64) {
            field_s = null;
        }
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            ((fk) this).field_r = 79;
        }
        return ((fk) this).a(param0, (byte) 90) - -140;
    }

    final boolean c(int param0, int param1) {
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 < -112) {
          L0: {
            L1: {
              L2: {
                if (param1 != 0) {
                  break L2;
                } else {
                  if (((fk) this).field_r == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (2 != param1) {
                  break L3;
                } else {
                  if (~((fk) this).field_r == ~(-1 + ln.field_m.length)) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L0;
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return false;
        }
    }

    final void a(int param0) {
        jj var2 = null;
        int var3 = 0;
        ob var4 = null;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        dd var8 = null;
        int var8_int = 0;
        hd var9 = null;
        int var9_int = 0;
        kk var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_29_0 = 0;
        jj[] stackIn_30_0 = null;
        jj[] stackIn_31_0 = null;
        jj[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        jj[] stackOut_29_0 = null;
        jj[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        jj[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        if (param0 == 11) {
          L0: {
            var2 = rg.field_e;
            var3 = hn.field_d;
            rg.field_e = rj.field_C[0];
            hn.field_d = 0;
            gj.field_W[1].b(0, 45);
            ((fk) this).d((byte) 59);
            ((fk) this).b((byte) -71);
            var4 = rk.field_e;
            var5 = qj.field_e;
            var6 = var5.field_w + (var5.field_z + 1);
            var7 = 200;
            if (((fk) this).field_r != 0) {
              if (1 == ((fk) this).field_r) {
                var7 = var7 + var5.a(ln.field_m[((fk) this).field_r][0], 50, var7, 540, 400, 16777215, 0, 0, 0, var6) * var6;
                var8 = new dd(3, 3, 0, 0, 0, 262144, 0, 0, new hh[0]);
                var9 = new hd(var8);
                var10 = new kk(var9, 320, 350);
                var10.a(0, 0, 0, (byte) -68, 0);
                var9.field_r[8] = (byte) 2;
                var9.field_r[3] = (byte) 2;
                var9.field_r[2] = (byte) 1;
                var9.field_r[7] = (byte) 1;
                t.f(0, 0, 640, 389);
                var10.a(false);
                t.c();
                break L0;
              } else {
                if (((fk) this).field_r != 2) {
                  if (((fk) this).field_r == 3) {
                    var7 = var7 + var6 * var5.a(ln.field_m[((fk) this).field_r][0], 50, var7, 270, 400, 16777215, 0, 0, 0, var6);
                    var7 += 10;
                    var7 = var7 + var6 * var5.a(ln.field_m[((fk) this).field_r][1], 50, var7, 540, 400, 16777215, 0, 0, 0, var6);
                    cf.field_u.c(2);
                    var8_int = 3;
                    L1: while (true) {
                      if (0 > var8_int) {
                        break L0;
                      } else {
                        L2: {
                          if (var8_int % 2 != -1) {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            break L2;
                          } else {
                            stackOut_27_0 = 20;
                            stackIn_29_0 = stackOut_27_0;
                            break L2;
                          }
                        }
                        L3: {
                          var9_int = stackIn_29_0;
                          stackOut_29_0 = rj.field_C;
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_30_0 = stackOut_29_0;
                          if (-3 <= var8_int) {
                            stackOut_31_0 = (jj[]) (Object) stackIn_31_0;
                            stackOut_31_1 = 3;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            break L3;
                          } else {
                            stackOut_30_0 = (jj[]) (Object) stackIn_30_0;
                            stackOut_30_1 = 2;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_32_1 = stackOut_30_1;
                            break L3;
                          }
                        }
                        ((tf) (Object) stackIn_32_0[stackIn_32_1].field_f[var8_int % 2]).b(340 - -(55 * var8_int), var9_int + 170);
                        var8_int--;
                        continue L1;
                      }
                    }
                  } else {
                    if (4 == ((fk) this).field_r) {
                      var7 = var7 + var6 * var5.a(ln.field_m[((fk) this).field_r][0], 260, var7, 270, 400, 16777215, 0, 0, 0, var6);
                      var7 += 10;
                      var7 = var7 + var6 * var5.a(ln.field_m[((fk) this).field_r][1], 260, var7, 270, 400, 16777215, 0, 0, 0, var6);
                      var8_int = 0;
                      L4: while (true) {
                        if (var8_int >= 8) {
                          ug.field_q.c((byte) 50);
                          break L0;
                        } else {
                          rj.field_C[var8_int].field_a[1].f(280 - -(30 * var8_int), 350);
                          rj.field_C[var8_int].field_a[0].f(var8_int * 30 + 270, 340);
                          var8_int++;
                          continue L4;
                        }
                      }
                    } else {
                      if (((fk) this).field_r == 5) {
                        var7 = var7 + var6 * var5.a(ln.field_m[((fk) this).field_r][0], 50, var7 - 10, 380, 150, 16777215, 0, 0, 1, var6);
                        qo.field_v.b(470, 160);
                        break L0;
                      } else {
                        if (6 != ((fk) this).field_r) {
                          if (((fk) this).field_r != 7) {
                            break L0;
                          } else {
                            L5: {
                              var7 += 10;
                              var7 = var7 + var6 * var5.a(ln.field_m[((fk) this).field_r][0], 50, var7, 540, 150, 16777215, 0, 0, 0, var6);
                              var8_int = 70;
                              jf.field_c.a((byte) -8);
                              var4.a(ln.field_m[((fk) this).field_r][1], var8_int, 314, 0, -1);
                              var9_int = 2;
                              if (640 + -var8_int <= uf.field_d) {
                                break L5;
                              } else {
                                if (-var8_int + 470 >= uf.field_d) {
                                  break L5;
                                } else {
                                  if (314 <= bg.field_k) {
                                    break L5;
                                  } else {
                                    if (bg.field_k <= 290) {
                                      break L5;
                                    } else {
                                      var9_int++;
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            var4.c(ln.field_m[((fk) this).field_r][var9_int], -var8_int + 640, 314, 0, -1);
                            break L0;
                          }
                        } else {
                          var7 = var7 + var6 * var5.a(ln.field_m[((fk) this).field_r][0], 50, var7, 540, 150, 16777215, 0, 0, 0, var6);
                          t.f(0, 0, 640, 389);
                          g.field_r.a(false);
                          an.field_b.a(false);
                          cg.field_H.c((byte) 119);
                          lj.field_g.a(55, 0, 0);
                          f.field_a.a(60, 0, 0);
                          t.c();
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  var8_int = 290;
                  var9_int = 41;
                  var10_int = 30;
                  var11 = 50;
                  var7 += 30;
                  var4.c(ln.field_m[((fk) this).field_r][0], var8_int, var7 - 3, 0, -1);
                  var5.b(ln.field_m[((fk) this).field_r][4], (var11 >> 1) + var8_int - (-var10_int - pk.field_c[0].field_A), -4 + var7, 16777215, 0);
                  pk.field_c[0].b(var8_int + var10_int, -pk.field_c[0].field_B + var7);
                  pk.field_c[1].b(var11 + var10_int + (var8_int + pk.field_c[0].field_A), var7 + -pk.field_c[1].field_B);
                  var7 = var7 + var9_int;
                  var4.c(ln.field_m[((fk) this).field_r][1], var8_int, 2 + var7, 0, -1);
                  var5.b(ln.field_m[((fk) this).field_r][4], (var11 >> 1) + (pk.field_c[0].field_A + var8_int) + var10_int, -4 + var7, 16777215, 0);
                  no.field_p[0].b(var10_int + var8_int, var7 + -no.field_p[0].field_B);
                  no.field_p[1].b(var11 + (var10_int + var8_int) - -pk.field_c[0].field_A, -no.field_p[1].field_B + var7);
                  var7 = var7 + var9_int;
                  var4.c(ln.field_m[((fk) this).field_r][2], var8_int, var7 - -2, 0, -1);
                  no.field_p[2].b(var8_int - -var10_int, -no.field_p[0].field_B + var7);
                  var7 = var7 + var9_int;
                  var4.c(ln.field_m[((fk) this).field_r][3], var8_int, 4 + var7, 0, -1);
                  no.field_p[3].b(var8_int - -var10_int, -no.field_p[0].field_B + var7);
                  var12 = 6;
                  rj.field_C[var12].field_f[0].b(70, 160);
                  rj.field_C[var12].field_f[1].b(470, 300);
                  break L0;
                }
              }
            } else {
              var7 = var7 + var5.a(ln.field_m[((fk) this).field_r][0], 50, var7, 270, 400, 16777215, 0, 0, 0, var6) * var6;
              var7 += 10;
              var7 = var7 + var6 * var5.a(ln.field_m[((fk) this).field_r][1], 50, var7, 270, 400, 16777215, 0, 0, 0, var6);
              cf.field_C.a(false);
              te.field_Qb.a(50, 0, 0);
              break L0;
            }
          }
          var4.b(pk.field_d[((fk) this).field_r], 320, 180, 0, -1);
          var5.c(mj.a(4067, ((fk) this).field_r), 590, 375, 16777215, 0);
          hn.field_d = var3;
          rg.field_e = var2;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        ((fk) this).field_r = ((fk) this).field_r - 1;
        if (!param0) {
            if (((fk) this).field_r == 0) {
                var3 = ke.field_a;
                ke.field_a = 97;
                ((fk) this).field_g.a(param1 + -14, 1);
                ke.field_a = var3;
            }
        }
        if (param1 != 97) {
            field_s = null;
        }
    }

    final void c(byte param0) {
        if (param0 >= -13) {
            ((fk) this).b(-19);
        }
        la.a(((fk) this).field_l, nc.field_a, false, -25528);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "<%0>'s game";
        field_p = "Sound: ";
    }
}
