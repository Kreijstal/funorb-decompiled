/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends dg {
    private sea field_p;
    private int field_q;
    private int field_o;
    private bt[] field_s;
    private lca[][] field_r;
    static String field_m;
    static jua field_t;
    private int field_u;
    static byte[] field_n;

    final static kg a(cn param0, cn param1, boolean param2, String param3, String param4) {
        int var5 = param0.b(param3, -7768);
        if (param2) {
            field_n = null;
        }
        int var6 = param0.a(true, param4, var5);
        return sv.a(param1, var5, param0, 24876, var6);
    }

    final void a(int param0, uw param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (!(((oo) this).field_r == null)) {
            for (var4 = 0; var4 < ((oo) this).field_o; var4++) {
                for (var5 = 0; ((oo) this).field_q > var5; var5++) {
                    param1.a(param0, (fo) (Object) ((oo) this).field_r[var4][var5], (byte) -33);
                }
            }
        }
        if (!(null == ((oo) this).field_s)) {
            var7 = 0;
            var4 = var7;
            while (var7 < ((oo) this).field_s.length) {
                param1.a(2, (fo) (Object) ((oo) this).field_s[var7], (byte) -33);
                var7++;
            }
        }
        if (param2 <= 40) {
            field_m = null;
        }
    }

    final int m(byte param0) {
        if (param0 >= -63) {
            return -82;
        }
        return 0;
    }

    private final void k(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lca var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        la var17 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          if (param0 == -3440) {
            break L0;
          } else {
            ((oo) this).field_r = null;
            break L0;
          }
        }
        var17 = ((oo) this).a(param0 + 3494);
        var3 = ((oo) this).field_h.d(3);
        var4 = ((oo) this).field_h.e(9648);
        ((oo) this).field_o = ((oo) this).field_h.c(param0 ^ 3403) / dba.field_a;
        ((oo) this).field_q = ((oo) this).field_h.a((byte) 55) / dba.field_a;
        ((oo) this).field_r = new lca[((oo) this).field_o][((oo) this).field_q];
        var5 = -(((oo) this).field_h.a((byte) 55) / 2) + (var4 - -(dba.field_a / 2));
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((oo) this).field_q) {
            return;
          } else {
            var7 = var3 - ((oo) this).field_h.c(-60) / 2 + dba.field_a / 2;
            var8 = 0;
            L2: while (true) {
              if (((oo) this).field_o <= var8) {
                var5 = var5 + dba.field_a;
                var6++;
                continue L1;
              } else {
                L3: {
                  var9 = new lca();
                  ((oo) this).field_r[var8][var6] = var9;
                  if (var8 <= 0) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var10 = stackIn_9_0;
                  if (var8 >= ((oo) this).field_o + -1) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var11 = stackIn_12_0;
                  if (-1 <= (var6 ^ -1)) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                L6: {
                  var12 = stackIn_15_0;
                  if (((oo) this).field_q - 1 <= var6) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L6;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L6;
                  }
                }
                L7: {
                  var13 = stackIn_18_0;
                  var14 = 0;
                  if (var10 != 0) {
                    var14++;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var11 == 0) {
                    break L8;
                  } else {
                    var14++;
                    break L8;
                  }
                }
                L9: {
                  if (var12 == 0) {
                    break L9;
                  } else {
                    var14++;
                    break L9;
                  }
                }
                L10: {
                  if (var13 == 0) {
                    break L10;
                  } else {
                    var14++;
                    break L10;
                  }
                }
                L11: {
                  var15 = 0;
                  if (var14 == 4) {
                    var9.field_f = 2;
                    break L11;
                  } else {
                    if (3 == var14) {
                      var9.field_f = 0;
                      if (var12 == 0) {
                        var15 = 1024;
                        break L11;
                      } else {
                        if (var13 == 0) {
                          var15 = 0;
                          break L11;
                        } else {
                          if (var11 == 0) {
                            var15 = -512;
                            break L11;
                          } else {
                            var15 = 512;
                            break L11;
                          }
                        }
                      }
                    } else {
                      if (var14 != 2) {
                        var9.field_f = 2;
                        break L11;
                      } else {
                        L12: {
                          L13: {
                            if (var10 != 0) {
                              break L13;
                            } else {
                              if (var12 == 0) {
                                var15 = 512;
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (var10 != 0) {
                              break L14;
                            } else {
                              if (var13 == 0) {
                                var15 = 0;
                                var9.field_f = 1;
                                break L11;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (var11 != 0) {
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          if (var11 != 0) {
                            break L12;
                          } else {
                            var9.field_f = 1;
                            break L11;
                          }
                        }
                        var9.field_f = 1;
                        break L11;
                      }
                    }
                  }
                }
                var9.field_c = var17.e(true).a(100, param0 + 3440);
                var9.field_a = (oo) this;
                var9.field_e = dfa.a(var15 + tfa.field_d[var9.field_f], 2048, -78);
                var9.field_d = -var4 + var5;
                var9.field_b = var7 - var3;
                var7 = var7 + dba.field_a;
                var8++;
                continue L2;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
            field_m = null;
        }
        return param1 / (1 << param0) * param3;
    }

    oo(int param0) {
        super(param0);
        ((oo) this).field_u = 20;
    }

    final int k(byte param0) {
        if (param0 != -99) {
            return -7;
        }
        return 2;
    }

    final void b(int param0, uw param1) {
        if (!(((oo) this).field_r != null)) {
            this.k(-3440);
        }
        if (!(null != ((oo) this).field_s)) {
            this.i(-20687);
        }
        super.b(param0, param1);
    }

    final void a(byte param0, int param1, uw param2) {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 50) {
            int discarded$0 = ((oo) this).k((byte) -70);
        }
        if (((oo) this).field_r != null) {
            for (var4 = 0; ((oo) this).field_o > var4; var4++) {
                for (var5 = 0; ((oo) this).field_q > var5; var5++) {
                    param2.a((byte) -100, param1, (fo) (Object) ((oo) this).field_r[var4][var5]);
                }
            }
        }
        if (!(null == ((oo) this).field_s)) {
            var7 = 0;
            var4 = var7;
            while (var7 < ((oo) this).field_s.length) {
                param2.a((byte) -88, 2, (fo) (Object) ((oo) this).field_s[var7]);
                var7++;
            }
        }
    }

    public static void j(int param0) {
        field_n = null;
        field_m = null;
        int var1 = 93 / ((-49 - param0) / 61);
        field_t = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6 = 23 % ((param4 - -38) / 47);
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        lca var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.h(106);
        if (((oo) this).field_r == null) {
            return;
        }
        if (param0 < 0) {
            return;
        }
        for (var2 = 0; ((oo) this).field_o > var2; var2++) {
            for (var3 = 0; ((oo) this).field_q > var3; var3++) {
                var4 = ((oo) this).field_r[var2][var3];
                var5 = tfa.field_d[var4.field_f];
                var4.field_e = dfa.a(var5 + -var4.field_e, 2048, -102);
                var4.field_b = -var4.field_b;
            }
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          var6 = 8 + param3 + 8 + (param2 - -487);
          v.field_i.a(var6 + -6, -6 + era.field_e.field_t, -23776, 3, 3);
          var7 = -5 + v.field_i.field_t;
          if (param1 == -104) {
            break L0;
          } else {
            int discarded$1 = oo.a(-101, -90, 0, -88);
            break L0;
          }
        }
        L1: {
          sua.field_K.a(2 + (485 + param2 - -param3), param5, param1 + -23672, var7 + -param5, 5);
          pq.field_g.a(-param2 + sua.field_K.field_G - mka.field_b.field_G, param5, -23776, 0, param2);
          var7 = var7 - (2 + param5);
          mka.field_b.a(mka.field_b.field_G, param5, -23776, 0, param2 - -pq.field_g.field_G);
          ne.field_d.a(param3 + (2 + param2) + 485, 2, (byte) 127, 5, param3, -5 + var7, 5);
          if (apa.field_c == null) {
            break L1;
          } else {
            apa.field_c.a((byte) -31, ne.field_d.field_G, ne.field_d.field_t, ne.field_d.field_qb, ne.field_d.field_T);
            break L1;
          }
        }
        var8 = era.field_e.field_G - (param2 + var6);
        var9 = var8 / 2;
        var10 = var9 + (param0 - -param2);
        var11 = 0;
        var12 = 0;
        L2: while (true) {
          if (var12 >= 6) {
            return;
          } else {
            L3: {
              if (var12 >= 5) {
                break L3;
              } else {
                if (null != wba.field_p[var12]) {
                  break L3;
                } else {
                  var12++;
                  continue L2;
                }
              }
            }
            var13 = 3 + var11 * (era.field_e.field_t + -6 - -2) / (gka.field_g - -1);
            var11++;
            var7 = -2 + (3 + var11 * (era.field_e.field_t + -6 - -2) / (1 + gka.field_g)) - var13;
            if (var12 >= 5) {
              ara.field_ub.a(var8, var7, -23776, var13, var6);
              var12++;
              continue L2;
            } else {
              wba.field_p[var12].a(var8, var7, -23776, var13, var6);
              bt.field_c[var12].a(var9 + -param2, var7, -23776, 0, param2);
              oka.field_y[var12].a(param0, -param4 + (var7 + -param4), -23776, param4, var9);
              kva.field_p[var12].a(-var10 + (var8 + -param2), -param4 + (var7 - param4), -23776, param4, var10);
              var12++;
              continue L2;
            }
          }
        }
    }

    oo(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        ((oo) this).field_u = 20;
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (((oo) this).field_p == null) {
            ((oo) this).field_s = new bt[]{};
            return;
        }
        ((oo) this).field_s = new bt[((oo) this).field_p.c(3)];
        if (param0 != -20687) {
            return;
        }
        for (var2 = 0; var2 < ((oo) this).field_s.length; var2++) {
            ((oo) this).field_s[var2] = new bt();
            ((oo) this).field_s[var2].field_a = (oo) this;
            ((oo) this).field_s[var2].field_e = ((oo) this).field_p.b(45, var2);
        }
    }

    final void d(int param0) {
        w var2 = null;
        int var3_int = 0;
        fsa var3 = null;
        hca var4 = null;
        ac var5 = null;
        int var6 = 0;
        w var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        super.d(param0 ^ 0);
        if (((oo) this).field_s != null) {
          var7 = (w) (Object) ((oo) this).a(47).field_G;
          var2 = var7;
          if (var2 == null) {
            return;
          } else {
            L0: {
              if (0 < ((oo) this).field_u) {
                ((oo) this).field_u = ((oo) this).field_u - 1;
                break L0;
              } else {
                ((oo) this).field_u = uca.field_c.a(100, 0) + 50;
                var3_int = uca.field_c.a(((oo) this).field_s.length, param0 ^ -1);
                if (((oo) this).field_s[var3_int].field_e.a(0)) {
                  fla discarded$2 = var2.a(new fm(24, ((oo) this).field_s[var3_int].b((byte) -123), ((oo) this).field_s[var3_int].c((byte) 94), ((oo) this).field_s[var3_int].e((byte) -112)), param0 + -57);
                  break L0;
                } else {
                  fla discarded$3 = var7.a(new fm(23, ((oo) this).field_s[var3_int].b((byte) -83), ((oo) this).field_s[var3_int].c((byte) 122), ((oo) this).field_s[var3_int].e((byte) -107)), param0 + -57);
                  break L0;
                }
              }
            }
            var3 = (fsa) (Object) ((oo) this).field_h;
            if (var3 == null) {
              return;
            } else {
              L1: {
                var4 = var3.H(3);
                if (param0 == -1) {
                  break L1;
                } else {
                  ((oo) this).field_q = -26;
                  break L1;
                }
              }
              if (var4 != null) {
                L2: {
                  if (var3.a((byte) 110, var4.e(param0 ^ -9649), var4.d(3), var4.a((byte) 55), var4.c(-30))) {
                    var5 = var4.n((byte) -98);
                    if (var5 == null) {
                      return;
                    } else {
                      ((hf) (Object) var5).field_k = 1;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final ka a(boolean param0, lca param1) {
        int var3 = 0;
        Object var4 = null;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var4 = null;
            ((oo) this).a((byte) -92, -110, (uw) null);
            break L0;
          }
        }
        L1: {
          var3 = param1.field_f;
          if (var3 == -1) {
            break L1;
          } else {
            if (1 == var3) {
              if ((param1.field_c ^ -1) > -51) {
                return df.field_J[42];
              } else {
                return df.field_J[43];
              }
            } else {
              if (-3 != var3) {
                break L1;
              } else {
                return df.field_J[44];
              }
            }
          }
        }
        if ((param1.field_c ^ -1) > -51) {
          return df.field_J[40];
        } else {
          return df.field_J[41];
        }
    }

    final int f(byte param0) {
        int var2 = 94 / ((param0 - 15) / 45);
        return -1;
    }

    final void a(uw param0, int param1) {
        super.a(param0, 118);
        if (param1 <= 82) {
            return;
        }
        ((oo) this).field_r = null;
        ((oo) this).field_s = null;
    }

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
        if (param0 instanceof sea) {
            ((oo) this).field_p = (sea) (Object) param0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Status";
    }
}
