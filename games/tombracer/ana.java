/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ana extends nv {
    static caa field_o;
    private int field_n;
    private iu field_r;
    private int field_q;
    private int field_p;

    private final int b(int param0, int param1) {
        if (param0 >= -20) {
            return 49;
        }
        return param1 / 8 >> 2082632048;
    }

    public final void m(int param0) {
        int var2 = 0;
        if (((ana) this).field_k) {
          return;
        } else {
          L0: {
            super.m(82);
            var2 = -79 % ((28 - param0) / 49);
            if (!((ana) this).field_f) {
              ((ana) this).e(false);
              break L0;
            } else {
              if (((ana) this).b(true).o((byte) -82)) {
                this.a((byte) -115, ((ana) this).field_p);
                break L0;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            ((ana) this).field_p = 110;
        }
        return param0;
    }

    final int a(int param0, ep param1, up param2) {
        if (param0 != 25940) {
            ((ana) this).field_q = 56;
        }
        int var4 = param1.i(-1);
        return ((ana) this).a(var4, var4, param2, param1.d(3), (byte) -36, param1.e(9648));
    }

    final void a(boolean param0, fsa param1) {
        super.a(param0, param1);
        this.b(0);
        param1.a(26492, true, 1);
        param1.a(param0, 35);
        param1.b((byte) 112, 8);
        param1.a(true, (byte) 109, 2);
    }

    final int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          var21 = TombRacer.field_G ? 1 : 0;
          if (param4 > 79) {
            break L0;
          } else {
            ((ana) this).field_r = null;
            break L0;
          }
        }
        if (2 == param3) {
          if (null != ((ana) this).field_r) {
            nm.a(((ana) this).field_r, (byte) 89);
            var7 = 0;
            var8 = param5 - (param0 / 2 - -((ana) this).field_g.d(3) + -(((ana) this).field_g.c(-15) / 2));
            var9 = -((ana) this).field_g.e(9648) + ((ana) this).field_g.a((byte) 55) / 2 + (param2 - param1 / 2);
            var10 = param0 + var8;
            var11 = var9 - -param1;
            var12 = this.b(-105, var8);
            var13 = this.b(-127, var9);
            var14 = this.b(-68, 7 + var10);
            var15 = this.b(-73, 8 + (var11 - 1));
            var16 = 64;
            var17 = var13;
            L1: while (true) {
              if (var17 > var15) {
                pfa.a(1);
                return var7;
              } else {
                var18 = ((ana) this).field_r.field_m * var17 + var12;
                var19 = var12;
                L2: while (true) {
                  if (var14 < var19) {
                    var17++;
                    continue L1;
                  } else {
                    if ((var18 ^ -1) <= -1) {
                      if (var18 < bea.field_l.length) {
                        if (((ana) this).field_q <= bea.field_l[var18]) {
                          L3: {
                            if (var13 == var17) {
                              break L3;
                            } else {
                              if (var17 == var15) {
                                break L3;
                              } else {
                                if (var19 == var12) {
                                  break L3;
                                } else {
                                  if (var14 != var19) {
                                    var7 = var7 + var16;
                                    var18++;
                                    var19++;
                                    continue L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                          var20 = jqa.a(var9 >> -1380671440, 1, 8 * var17, var17 * 8 + 8, var11 >> -740645968, 0, 8 * var19, var10 >> 1260955504, 8 + var19 * 8, var8 >> -409295376);
                          var7 = var7 + var20;
                          var18++;
                          var19++;
                          continue L2;
                        } else {
                          var18++;
                          var19++;
                          continue L2;
                        }
                      } else {
                        var18++;
                        var19++;
                        continue L2;
                      }
                    } else {
                      var18++;
                      var19++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((ana) this).k(2);
        }
        return 3;
    }

    ana(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((ana) this).field_q = 240;
        ((ana) this).field_n = 2621440;
        ((ana) this).field_p = 255;
        if (-5 >= (param0.field_E ^ -1)) {
            ((ana) this).field_n = param1.b((byte) 44, 10) << -1821334192;
        }
    }

    final static StringBuilder a(int param0, char param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var4 = param3.length();
        param3.setLength(param0);
        if (param2 != -11) {
            Object var7 = null;
            StringBuilder discarded$0 = ana.a(101, 'ﾘ', -14, (StringBuilder) null);
        }
        for (var5 = var4; param0 > var5; var5++) {
            param3.setCharAt(var5, param1);
        }
        return param3;
    }

    public static void d(boolean param0) {
        field_o = null;
        if (!param0) {
            Object var2 = null;
            StringBuilder discarded$0 = ana.a(101, 'ﾥ', 42, (StringBuilder) null);
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) 59, ((ana) this).field_n >> 1936665904, 10);
        if (param0) {
            Object var4 = null;
            ((ana) this).a(true, (kh) null);
        }
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7 = 0;
        if (param2.field_j == 1) {
            var7 = et.b(param0, param1, -48) / 2;
            this.a(param3, (byte) 90, param2.field_b, var7, param5);
        }
        var7 = -5 / ((param4 - 62) / 52);
        return 0;
    }

    final void k(int param0) {
        int[] var2 = null;
        int var3_int = 0;
        hca var3 = null;
        int var4 = 0;
        Object var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((ana) this).field_r == null) {
          return;
        } else {
          if (!((ana) this).field_f) {
            return;
          } else {
            L0: {
              var8 = ((ana) this).field_r.field_r;
              var7 = var8;
              var6 = var7;
              var2 = var6;
              if (param0 == 5418) {
                break L0;
              } else {
                var5 = null;
                ((ana) this).a(true, (kh) null);
                break L0;
              }
            }
            var3_int = -1 + var8.length;
            L1: while (true) {
              if (var3_int < 0) {
                L2: {
                  if ((((ana) this).field_n ^ -1) < -1) {
                    var3 = ((ana) this).m((byte) 19);
                    this.a(var3.d(3), (byte) 86, 10, ((ana) this).field_n, var3.e(param0 ^ 12442));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              } else {
                L3: {
                  if (var8[var3_int] >= ((ana) this).field_p) {
                    break L3;
                  } else {
                    var6[var3_int] = var6[var3_int] + 8;
                    break L3;
                  }
                }
                if (var8[var3_int] > ((ana) this).field_p) {
                  var6[var3_int] = ((ana) this).field_p;
                  var3_int--;
                  continue L1;
                } else {
                  var3_int--;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final int a(int param0, up param1, pc param2) {
        if (param0 > -85) {
            Object var10 = null;
            int discarded$0 = ((ana) this).a(26, (up) null, (pc) null);
        }
        int var4 = param2.field_d - ((ana) this).field_g.d(3) + ((ana) this).field_g.c(-67) / 2;
        int var5 = param2.field_e - (((ana) this).field_g.d(3) + -(((ana) this).field_g.c(-63) / 2));
        int var6 = param2.field_k + -((ana) this).field_g.e(9648) - -(((ana) this).field_g.a((byte) 55) / 2);
        int var7 = param2.field_a + (-((ana) this).field_g.e(9648) - -(((ana) this).field_g.a((byte) 55) / 2));
        int var8 = param1.field_b;
        if (!(-11 < (var8 ^ -1))) {
            var8 = 9;
        }
        int var9 = var8 * sl.field_e.length / 10;
        nm.a(((ana) this).field_r, (byte) 110);
        iha.a(var4 / 8 >> -1807295760, var6 / 8 >> -167885584, var5 / 8 >> -1108005776, var7 / 8 >> -537920880, 2, var9, sl.field_e);
        pfa.a(1);
        return 0;
    }

    final void e(boolean param0) {
        if (param0) {
            return;
        }
        this.a((byte) -125, 0);
    }

    private final void b(int param0) {
        int var2 = ((ana) this).field_g.c(param0 + -21) >> -1497250736;
        int var3 = ((ana) this).field_g.a((byte) 55) >> -206665488;
        if (param0 != 0) {
            return;
        }
        if (!((ana) this).b(true).o((byte) -82)) {
            ((ana) this).field_p = 255;
        } else {
            ((ana) this).field_p = 128;
        }
        ((ana) this).field_r = null;
        if (var2 >= 32) {
            if (-33 >= var3) {
                if (-1025 > var2) {
                    if (!((var3 ^ -1) <= -1025)) {
                        ((ana) this).field_r = new iu(var2 / 8, var3 / 8);
                        this.a((byte) -117, ((ana) this).field_f ? 255 : 0);
                    }
                }
            }
        }
    }

    ana(la param0, boolean param1) {
        super(param0, param1);
        ((ana) this).field_q = 240;
        ((ana) this).field_n = 2621440;
        ((ana) this).field_p = 255;
    }

    private final void a(byte param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        if (!(null != ((ana) this).field_r)) {
            return;
        }
        if (((ana) this).b(true).o((byte) -82)) {
            param1 = param1 / 2;
        }
        int[] var6 = ((ana) this).field_r.field_r;
        int[] var3 = var6;
        int var4 = -1 + var6.length;
        if (param0 >= -93) {
            field_o = null;
        }
        while (var4 >= 0) {
            var3[var4] = param1;
            var4--;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = -106 % ((-24 - param1) / 60);
        if (null == ((ana) this).field_r) {
            return;
        }
    }

    static {
    }
}
