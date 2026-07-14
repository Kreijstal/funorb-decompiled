/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends qra {
    private int field_q;
    private int field_r;
    private int field_v;
    private int field_s;
    private int field_m;
    static String field_w;
    static int[] field_t;
    private cfa field_o;
    private int field_u;
    static sq field_n;
    private fv[][] field_p;

    public static void f(int param0) {
        field_t = null;
        field_w = null;
        if (param0 != 6153) {
            return;
        }
        field_n = null;
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 25) {
            return false;
        }
        if (((ab) this).field_v != 0) {
            // ifne L26
        } else {
            return false;
        }
        if (-85 != (param2 ^ -1)) {
            if (83 != param2) {
                return false;
            }
        }
        this.i(12721);
        return true;
    }

    ab(qh param0, v param1) {
        super(param0, param1);
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
        ((ab) this).field_r = -1;
        ((ab) this).field_v = 0;
        ((ab) this).field_o = ((ab) this).field_c.field_i;
        ((ab) this).field_o.field_g = new w();
        var3 = ((ab) this).field_o.a(-28958);
        ((ab) this).field_q = 3;
        ((ab) this).field_s = 1;
        ((ab) this).field_p = new fv[((ab) this).field_q][((ab) this).field_s];
        var4 = 0;
        var5 = aaa.a(false) - ((ab) this).field_q * 100 + (100 - (((ab) this).field_q + -1) * 20);
        var5 = var5 / 2 + 0;
        var6 = -50 + (koa.b(0) + 100) + (-(((ab) this).field_s * 100) + -(16 * (((ab) this).field_s + -1)));
        var6 = var6 / 2 + 16;
        var7 = 0;
        L0: while (true) {
          if (var7 >= ((ab) this).field_q) {
            this.h(0);
            er.b(1, 0);
          } else {
            var8 = 0;
            L1: while (true) {
              if (var8 >= ((ab) this).field_s) {
                var7++;
                continue L0;
              } else {
                if (var4 >= var3) {
                  ((ab) this).field_p[var7][var8] = null;
                  var8++;
                  continue L1;
                } else {
                  L2: {
                    var9 = var5;
                    var10 = var6;
                    if (-1 <= (var7 ^ -1)) {
                      break L2;
                    } else {
                      var9 = var9 + var7 * 120;
                      break L2;
                    }
                  }
                  L3: {
                    if (var8 <= 0) {
                      break L3;
                    } else {
                      var10 = var10 + 116 * var8;
                      break L3;
                    }
                  }
                  var11 = 100;
                  var9 = var9 - var11 / 2;
                  var12 = 100;
                  var10 = var10 - var12 / 2;
                  ((ab) this).field_p[var7][var8] = new fv((ab) this, var4, var9, var10, var11, var12);
                  var4++;
                  var8++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String var11_ref = null;
        int var11_int = 0;
        int var12 = 0;
        fv var12_ref_fv = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          la.field_j.a(0, 0);
          var3 = 0;
          var4 = ((ab) this).field_o.g(-1);
          if (((ab) this).field_h.d((byte) 63)) {
            break L0;
          } else {
            if (((ab) this).field_h.field_x == var4) {
              var3 = 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var5 = 160;
          var6 = aaa.a(false) / 2;
          var7 = koa.b(0) / 2;
          ura.a(-10985);
          var5 = 128;
          if (var4 < 0) {
            break L1;
          } else {
            L2: {
              var8 = (aaa.a(false) >> -427900127) + -(gg.field_f.a() >> -1329966719);
              var9 = (koa.b(0) >> 547907969) + -(gg.field_f.c() >> 744524545);
              gg.field_f.a(var8, var9);
              if (var3 == 0) {
                int discarded$5 = be.a(gl.a((byte) 83, cba.field_c, new String[1]).toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, 32 + var9, var8, 1, (byte) 60, gg.field_f.a());
                break L2;
              } else {
                L3: {
                  int discarded$6 = be.a(us.field_c.toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, var9 + 32, var8, 1, (byte) 60, gg.field_f.a());
                  var10 = (-((ab) this).field_o.c(-1) + 750) / 50 - -1;
                  if (-1 >= (var10 ^ -1)) {
                    break L3;
                  } else {
                    var10 = 0;
                    break L3;
                  }
                }
                int discarded$7 = be.a(gl.a((byte) 108, tla.field_h, new String[1]).toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, var9 + 200, var8, 1, (byte) 60, gg.field_f.a());
                break L2;
              }
            }
            var10 = 0;
            L4: while (true) {
              if (((ab) this).field_q <= var10) {
                break L1;
              } else {
                var11_int = 0;
                L5: while (true) {
                  if (var11_int >= ((ab) this).field_s) {
                    var10++;
                    continue L4;
                  } else {
                    var12_ref_fv = ((ab) this).field_p[var10][var11_int];
                    if (var12_ref_fv != null) {
                      L6: {
                        if (!this.a(true)) {
                          break L6;
                        } else {
                          if (var10 != ((ab) this).field_u) {
                            break L6;
                          } else {
                            if (var11_int == ((ab) this).field_m) {
                              tga.field_a.c(fm.a(false, wga.field_a[((ab) this).field_h.field_x]), var12_ref_fv.field_g, var12_ref_fv.field_j, var12_ref_fv.field_c, -22971, var12_ref_fv.field_i);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var12_ref_fv.a(1);
                      var11_int++;
                      continue L5;
                    } else {
                      var11_int++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        }
        L7: {
          var17 = 0;
          var8 = var17;
          if (param0 <= -50) {
            break L7;
          } else {
            ((ab) this).b(-64, false);
            break L7;
          }
        }
        L8: while (true) {
          if (((ab) this).field_c.field_H.length <= var17) {
            se.f((byte) -6);
            ((ab) this).d(-27142);
            return;
          } else {
            L9: {
              var9 = -(((ab) this).field_c.field_H.length * var5 / 2) + var6 - -(var5 * var17);
              var10 = -200 + var7;
              int discarded$8 = be.a(((ab) this).field_h.a(var17, false).toUpperCase(), 1, kn.field_p, wga.field_a[var17], 0, 32, 1, var10, var9, 1, (byte) 60, var5);
              if (!((ab) this).field_c.b((byte) 90, var17)) {
                var11 = cs.field_b;
                var12 = 8947848;
                break L9;
              } else {
                var13 = ((ab) this).field_c.field_H[var17].z(115);
                if (0 == (var13 ^ -1)) {
                  var14 = ((ab) this).field_c.field_c.field_b[var17];
                  var15 = ((ab) this).field_o.b((byte) 50);
                  if (var14 >= var15) {
                    if (var14 != var15) {
                      var12 = 12303291;
                      var11 = g.field_i;
                      break L9;
                    } else {
                      var12 = 16777215;
                      var11 = bp.field_o;
                      break L9;
                    }
                  } else {
                    var11 = cga.field_l;
                    var12 = 8947848;
                    break L9;
                  }
                } else {
                  var12 = 16777215;
                  var11_ref = sla.field_b[var13];
                  break L9;
                }
              }
            }
            int discarded$9 = be.a(var11.toUpperCase(), 1, kn.field_p, var12, 0, 32, 1, 32 + var10, var9, 1, (byte) 60, var5);
            var17++;
            continue L8;
          }
        }
    }

    final static boolean a(String param0, byte param1) {
        CharSequence var3 = null;
        if (param1 >= -4) {
            return false;
        }
        if (!ni.field_c) {
            return false;
        }
        if ((bta.field_q ^ -1) == -3) {
            if (null != mn.field_n) {
                var3 = (CharSequence) (Object) param0;
                if (mn.field_n.equals((Object) (Object) jd.a(1, var3))) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean b(int param0, int param1, byte param2) {
        fv var4 = null;
        if (this.a(true)) {
          L0: {
            if ((param1 ^ -1) > -1) {
              break L0;
            } else {
              if ((param0 ^ -1) > -1) {
                break L0;
              } else {
                if (((ab) this).field_q <= param1) {
                  break L0;
                } else {
                  if (param0 < ((ab) this).field_s) {
                    L1: {
                      var4 = ((ab) this).field_p[param1][param0];
                      if (param2 >= 78) {
                        break L1;
                      } else {
                        this.a(32, 41, (byte) 103);
                        break L1;
                      }
                    }
                    if (var4 != null) {
                      if (!((ab) this).field_o.a((byte) 119, var4.field_f)) {
                        return false;
                      } else {
                        ((ab) this).field_m = param0;
                        ((ab) this).field_u = param1;
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            return true;
        }
        return true;
    }

    final void a(int param0, boolean param1, int param2) {
        jha var5 = null;
        jha var6 = null;
        if (((ab) this).field_o.g(-1) == param0) {
            if (0 == (param2 ^ -1)) {
                var6 = ab.a(-9, gl.a((byte) 86, oba.field_n, new String[1]));
                iqa.field_c.a(0, var6);
                ((ab) this).field_o.a(param2, (byte) 112);
            } else {
                int var4 = ((ab) this).field_o.a(-108, param2);
                ((ab) this).field_o.a(param2, (byte) 119);
                this.h(0);
                var5 = ab.a(-58, gl.a((byte) 125, fva.field_b, new String[2]));
                iqa.field_c.a(0, var5);
            }
        }
        if (!param1) {
            boolean discarded$0 = ab.a(-52, 79, -8, 36, 97, 39, -99);
        }
    }

    private final void g(int param0) {
        if (!(((ab) this).field_v != 0)) {
            return;
        }
        if (!(!qma.field_c)) {
            if (this.a(sta.field_B, 25006, jba.field_j)) {
                if (!((hf.field_b ^ -1) != -2)) {
                    this.i(12721);
                }
            }
        }
        if (!(!((ab) this).field_h.g(param0, 2))) {
            this.a(0, -1, (byte) 56);
        }
        if (!(!((ab) this).field_h.g(0, 3))) {
            this.a(0, 1, (byte) 80);
        }
        if (((ab) this).field_h.g(0, 0)) {
            this.a(-1, 0, (byte) 51);
        }
        if (!(!((ab) this).field_h.g(0, 1))) {
            this.a(1, 0, (byte) 73);
        }
        if (!(!((ab) this).field_h.g(0, 4))) {
            this.i(12721);
        }
    }

    private final boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_n = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ab) this).field_h.d((byte) 98)) {
              break L2;
            } else {
              if (((ab) this).field_h.field_x != ((ab) this).field_o.g(-1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void i(int param0) {
        if (!(this.a(true))) {
            return;
        }
        int var2 = ((ab) this).field_p[((ab) this).field_u][((ab) this).field_m].field_f;
        if (!((ab) this).field_o.a((byte) 127, var2)) {
            return;
        }
        if (param0 != 12721) {
            return;
        }
        if (null != ((ab) this).field_f) {
            ((ab) this).field_f.c(var2, 1);
        } else {
            ((ab) this).field_o.a(var2, (byte) 102);
        }
    }

    final void a(int param0, boolean param1) {
        if (!(((ab) this).field_r <= 0)) {
            ((ab) this).field_r = ((ab) this).field_r - 1;
            return;
        }
        ((ab) this).field_o.d((byte) -124);
        if (param1) {
            if (this.a(true)) {
                this.g(param0 + -80);
            }
        }
        if (param0 != 80) {
            boolean discarded$0 = ((ab) this).e(-116);
        }
        if (!(!((ab) this).field_o.f(param0 ^ -28956))) {
            ((ab) this).field_r = 100;
        }
        if (param1) {
            ((ab) this).c(7);
        }
        ((ab) this).field_v = ((ab) this).field_v + 1;
        if (((ab) this).field_o.g(-1) == ((ab) this).field_h.field_x) {
            if (!(((ab) this).field_o.c(-1) <= 500)) {
                if ((750 - ((ab) this).field_o.c(-1)) % 50 == 0) {
                    ((ab) this).field_o.a((byte) -124);
                }
            }
        }
    }

    private final void h(int param0) {
        ((ab) this).field_m = param0;
        ((ab) this).field_u = 0;
    }

    final cfa b(byte param0) {
        int var2 = -72 / ((35 - param0) / 62);
        return ((ab) this).field_o;
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        fv var6 = null;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param1 == 25006) {
            break L0;
          } else {
            this.h(-51);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (((ab) this).field_q <= var4) {
            return false;
          } else {
            var5 = 0;
            L2: while (true) {
              if (((ab) this).field_s <= var5) {
                var4++;
                continue L1;
              } else {
                var6 = ((ab) this).field_p[var4][var5];
                if (var6 != null) {
                  if (var6.a(param0, false, param2)) {
                    return this.b(var5, var4, (byte) 122);
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param6 > 100) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param5 > param1) {
              break L2;
            } else {
              if (param1 > param4) {
                break L2;
              } else {
                if (param3 < param0) {
                  break L2;
                } else {
                  if (param3 > param2) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static jha a(int param0, String param1) {
        if (param0 >= -4) {
            ab.f(-54);
        }
        return new jha(1, (String) null, param1);
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        fv var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (!this.a(true)) {
          return;
        } else {
          L0: {
            var4 = 0;
            if (param2 >= 9) {
              break L0;
            } else {
              ((ab) this).field_v = 58;
              break L0;
            }
          }
          L1: while (true) {
            if (var4 != 0) {
              return;
            } else {
              L2: {
                ((ab) this).field_m = ((ab) this).field_m + param1;
                ((ab) this).field_u = ((ab) this).field_u + param0;
                if ((((ab) this).field_m ^ -1) <= -1) {
                  if (((ab) this).field_s > ((ab) this).field_m) {
                    break L2;
                  } else {
                    ((ab) this).field_m = 0;
                    break L2;
                  }
                } else {
                  ((ab) this).field_m = ((ab) this).field_s - 1;
                  break L2;
                }
              }
              L3: {
                if (((ab) this).field_u >= 0) {
                  if (((ab) this).field_u < ((ab) this).field_q) {
                    break L3;
                  } else {
                    ((ab) this).field_u = 0;
                    break L3;
                  }
                } else {
                  ((ab) this).field_u = -1 + ((ab) this).field_q;
                  break L3;
                }
              }
              var5 = ((ab) this).field_p[((ab) this).field_u][((ab) this).field_m];
              if (var5 != null) {
                if (((ab) this).field_o.a((byte) -64, var5.field_f)) {
                  var4 = 1;
                  continue L1;
                } else {
                  var4 = 0;
                  continue L1;
                }
              } else {
                var4 = 0;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
        field_t = new int[]{135, 230, 520};
    }
}
