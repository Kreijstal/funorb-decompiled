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
            this.field_o = 93;
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
            field_w = (String) null;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        for (var4 = 0; ud.field_I.length > var4; var4++) {
            ud.field_I[var4].c(-124);
        }
        super.a(param0, 3, param2);
        this.field_v = 0;
        this.field_r = 1;
    }

    final static tf[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        tf var16 = null;
        int[] var18 = t.field_k;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = t.field_j;
        int var8 = t.field_d;
        tf var9 = new tf(param5, -(2 * param5) + param3);
        var9.c();
        t.g(0, 0, param5, -(2 * param5) + param3, param2, param0);
        tf var10 = new tf(param5, param5);
        var10.c();
        t.d(0, 0, param5, param5, param2);
        tf var11 = new tf(param1, param5);
        var11.c();
        t.d(0, 0, 16, param5, param2);
        tf var12 = new tf(param5, param5);
        var12.c();
        t.d(0, 0, param5, param5, param0);
        tf var13 = new tf(16, param5);
        var13.c();
        t.d(0, 0, 16, param5, param0);
        Object var14 = null;
        if (!(param4 <= 0)) {
            var16 = new tf(16, 16);
            var14 = var16;
            var16.c();
            t.d(0, 0, 16, 16, param4);
        }
        t.a(var18, var7, var8);
        return new tf[]{var10, var11, var10, var9, (tf) (var14), var9, var12, var13, var12};
    }

    final void a(int param0, byte param1, boolean param2) {
        int var7;
        int var4;
        int var5;
        String var6;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param0 == 0) {
            if (this.field_g.a(79)) {
              var4 = param2 ? 1 : 0;
              la.a(ti.field_t, 16, var4 != 0, -25528);
              break L0;
            } else {
              break L0;
            }
          } else {
            if (-2 == (param0 ^ -1)) {
              if (!param2) {
                break L0;
              } else {
                if (-2 == (ef.field_b ^ -1)) {
                  this.field_u = -8;
                  this.field_r = 3;
                  break L0;
                } else {
                  this.field_r = 2;
                  break L0;
                }
              }
            } else {
              if (-3 != (param0 ^ -1)) {
                L1: {
                  if (uo.field_j > 0) {
                    break L1;
                  } else {
                    if (!this.field_g.a(74)) {
                      break L1;
                    } else {
                      if (-3 <= (param0 ^ -1)) {
                        break L1;
                      } else {
                        if (32 != this.field_k[param0]) {
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
                    this.field_v = 2;
                    break L0;
                  } else {
                    this.field_u = 8;
                    this.field_v = 3;
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
            this.a(125, (byte) 57);
            break L3;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        gj.field_W[4].b(0, 45);
        this.d((byte) 50);
        this.b((byte) -71);
        if (param0 != 11) {
            return;
        }
        for (var2 = 0; ud.field_I.length > var2; var2++) {
            ud.field_I[var2].a(-25330);
        }
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            this.a(103, -99, false);
        }
        if ((param0 ^ -1) != -2 && 2 != param0) {
            if ((param0 ^ -1) >= -3) {
                return super.a(param0, false);
            }
            return 500;
        }
        return lo.field_Jb - -hf.field_k;
    }

    final void f(int param0) {
        this.field_o = 0;
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
        if (param0 != -28071) {
            op.f((byte) -35);
        }
        if (1 == param1 || 2 == param1) {
            return rn.field_b;
        }
        return super.a(-28071, param1);
    }

    final void c(byte param0) {
        if (param0 > -13) {
            this.field_v = 86;
        }
        la.a(0, 16, false, -25528);
    }

    final void b(int param0) {
        boolean discarded$0 = false;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (param0 < -35) {
            break L0;
          } else {
            discarded$0 = this.a(true, 60);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((ke.field_a ^ -1) != -99) {
              if ((ke.field_a ^ -1) == -100) {
                L3: {
                  if (98 != ke.field_a) {
                    stackIn_12_0 = 0;
                    break L3;
                  } else {
                    stackIn_12_0 = 1;
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
                  stackIn_6_0 = 0;
                  break L4;
                } else {
                  stackIn_6_0 = 1;
                  break L4;
                }
              }
              var2 = stackIn_6_0;
              break L2;
            }
          }
          L5: {
            var3 = this.field_g.field_j;
            if ((var3 ^ -1) == 0) {
              break L5;
            } else {
              if (-2 == (var3 ^ -1)) {
                break L5;
              } else {
                if ((var3 ^ -1) == -3) {
                  break L5;
                } else {
                  if (var3 == 0) {
                    if (var2 == 0) {
                      this.field_g.a(false, 3);
                      this.field_o = 0;
                      break L1;
                    } else {
                      this.field_g.a(false, 52);
                      this.field_o = bh.field_k;
                      break L1;
                    }
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
                      L8: {
                        if (var3 != 52) {
                          break L8;
                        } else {
                          if (var2 != 0) {
                            break L8;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L9: {
                        var4 = (-ip.field_A + 532) / 2;
                        if (var2 != 0) {
                          L10: {
                            this.field_g.a(false, -1 + var3);
                            if (this.b(115, this.field_g.field_j) >= var4) {
                              break L10;
                            } else {
                              this.field_o = this.field_o - ip.field_A;
                              break L10;
                            }
                          }
                          if (0 > this.field_o) {
                            this.field_o = 0;
                            break L9;
                          } else {
                            break L1;
                          }
                        } else {
                          L11: {
                            this.field_g.a(false, var3 + 1);
                            if (this.b(69, this.field_g.field_j) <= var4) {
                              break L11;
                            } else {
                              this.field_o = this.field_o + ip.field_A;
                              break L11;
                            }
                          }
                          if (this.field_o <= bh.field_k) {
                            break L9;
                          } else {
                            this.field_o = bh.field_k;
                            break L1;
                          }
                        }
                      }
                      break L1;
                    }
                    this.field_g.a(false, 0);
                    break L1;
                  }
                }
              }
            }
          }
          this.field_g.a(false, 0);
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
                return (-3 + param1) * ip.field_A + (-this.field_o + 184);
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
            if (param1 < 182 || (param1 ^ -1) < -351) {
                var4 = -1;
            }
        }
        return var4;
    }

    final int a(int param0, byte param1) {
        boolean discarded$0 = false;
        if (param1 != 90) {
            discarded$0 = this.a(false, 70);
        }
        if (1 != param0 && (param0 ^ -1) != -3) {
            if (2 >= param0) {
                return super.a(param0, (byte) 90);
            }
            return 300;
        }
        return lo.field_Jb;
    }

    final void e(byte param0) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        this.field_o = this.field_o + this.field_u;
        this.field_o = this.field_o + ip.field_A * lp.field_i;
        if (this.field_o < 0) {
            this.field_o = 0;
        }
        if (param0 > -64) {
            return;
        }
        if (!(bh.field_k >= this.field_o)) {
            this.field_o = bh.field_k;
        }
        if (!(0 <= this.field_u)) {
            this.field_u = this.field_u + 1;
        }
        this.field_v = 0;
        if (!(0 >= this.field_u)) {
            this.field_u = this.field_u - 1;
        }
        this.field_r = 0;
        super.e((byte) -100);
        int var2 = -4 < (this.field_g.field_j ^ -1) ? -1 : -3 + this.field_g.field_j;
        for (var3 = 0; ud.field_I.length > var3; var3++) {
            ud.field_I[var3].a(var3 == var2 ? true : false, 20);
        }
    }

    final static void e(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 260) {
                break L1;
              } else {
                field_p = (cb) null;
                break L1;
              }
            }
            ja.a();
            ai.field_x = 11;
            nk.field_d = new int[260];
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L3: while (true) {
                  if (var5 >= nk.field_d.length) {
                    break L0;
                  } else {
                    nk.field_d[var5] = 255;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var2 = 15.0;
                nk.field_d[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "op.B(" + param0 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        ob stackIn_16_0;
        String stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        ob stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        tf[] stackIn_20_0 = null;
        tf[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          if (param0 <= -116) {
            break L0;
          } else {
            this.field_o = 78;
            break L0;
          }
        }
        L1: {
          var4 = this.field_k[param2];
          if (-8 != (var4 ^ -1)) {
            if (var4 == 30) {
              L2: {
                if (0 == this.field_o) {
                  this.field_r = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              jm.field_i[this.field_r].b(lo.field_Jb, 150);
              break L1;
            } else {
              if (-32 != (var4 ^ -1)) {
                if (var4 == 32) {
                  L3: {
                    t.f(0, 182, 640, 350);
                    var5 = -2 + param2;
                    var6 = ki.field_m + ' ' + var5;
                    var7 = this.a(param2, (byte) 90);
                    var8 = this.a(param2, false);
                    var9 = var7 - -var8 >> -1911180895;
                    var10 = this.b(58, param2);
                    if (param1) {
                      fi.a(var9, -2 + var10, 35, oc.field_N);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    stackIn_16_0 = rk.field_e;

                    stackIn_16_1 = (String) (var6);

                    stackIn_16_2 = var9;

                    stackIn_16_3 = var10 - -rk.field_e.field_w;

                    if (!param1) {
                      stackIn_17_0 = (ob) ((Object) stackIn_16_0);
                      stackIn_17_1 = (String) ((Object) stackIn_16_1);
                      stackIn_17_2 = stackIn_16_2;
                      stackIn_17_3 = stackIn_16_3;
                      stackIn_17_4 = 2;
                      break L4;
                    } else {
                      stackIn_17_0 = (ob) ((Object) stackIn_16_0);
                      stackIn_17_1 = (String) ((Object) stackIn_16_1);
                      stackIn_17_2 = stackIn_16_2;
                      stackIn_17_3 = stackIn_16_3;
                      stackIn_17_4 = 0;
                      break L4;
                    }
                  }
                  L5: {
                    ((ob) (Object) stackIn_17_0).b(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, -1);
                    if (!this.a(true, param2 - 3)) {
                      break L5;
                    } else {
                      L6: {
                        stackIn_20_0 = ih.field_a;

                        if (!param1) {
                          stackIn_21_0 = (tf[]) ((Object) stackIn_20_0);
                          stackIn_21_1 = 0;
                          break L6;
                        } else {
                          stackIn_21_0 = (tf[]) ((Object) stackIn_20_0);
                          stackIn_21_1 = 1;
                          break L6;
                        }
                      }
                      ((tf) (Object) stackIn_21_0[stackIn_21_1]).b(var8, this.b(118, param2));
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
                  if (bh.field_k != this.field_o) {
                    break L7;
                  } else {
                    this.field_v = 1;
                    break L7;
                  }
                }
                jm.field_i[this.field_v - -4].b(lo.field_Jb, 355);
                break L1;
              }
            }
          } else {
            this.a(h.field_O, oc.field_N, (byte) 122, param1);
            break L1;
          }
        }
    }

    op(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        int[] var9 = null;
        int var8 = 0;
        try {
            var9 = new int[53];
            int[] var7 = var9;
            for (var8 = 0; var9.length > var8; var8++) {
                var9[var8] = 32;
            }
            var9[2] = 31;
            var9[1] = 30;
            var9[0] = 7;
            this.a(var9, (byte) -24);
            this.field_r = 0;
            this.field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "op.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "Status";
        field_q = "Remove friend";
    }
}
