/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uta implements sia {
    private static String[] field_l;
    private static String[] field_f;
    il field_m;
    static String field_n;
    String field_t;
    private int field_k;
    iv field_a;
    jea field_p;
    sw field_o;
    static nh field_d;
    static String field_e;
    private jea field_i;
    private vna field_s;
    private int field_h;
    private boolean field_j;
    private int field_c;
    private String[] field_b;
    private gka field_g;
    private String field_r;
    private int field_q;

    private final void a(boolean param0, String param1) {
        if (!param0) {
            ((uta) this).field_h = -36;
        }
        gka var3 = (gka) (Object) ((uta) this).field_s.f(-80);
        if (var3 != null) {
            // ifne L68
        }
        ((uta) this).field_s.a((byte) 88, (vg) (Object) new gka(param1));
        if (!(((uta) this).field_s.a((byte) -16) <= 30)) {
            vg discarded$0 = ((uta) this).field_s.c((byte) 22);
        }
    }

    private final void a(int param0, String param1, int param2) {
        int var4 = 0;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        vna var9 = null;
        gka var10 = null;
        int var11 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var4 = -10 + ((uta) this).field_a.field_G - 15;
          var5 = rga.a(32287, param1, '\n');
          if (param0 == 24219) {
            break L0;
          } else {
            boolean discarded$2 = ((uta) this).a(-59);
            break L0;
          }
        }
        var6 = var5;
        var7 = 0;
        L1: while (true) {
          if (var7 >= var6.length) {
            return;
          } else {
            var8 = var6[var7];
            if (var4 <= ((uta) this).field_m.b(var8)) {
              var9 = this.a(var4, true, var8);
              var10 = (gka) (Object) var9.f(param0 ^ -24277);
              L2: while (true) {
                if (var10 != null) {
                  this.b(var10.field_h, param2, 230);
                  var10 = (gka) (Object) var9.e(param0 ^ 24289);
                  continue L2;
                } else {
                  var7++;
                  continue L1;
                }
              }
            } else {
              this.b(var8, param2, param0 + -23989);
              var7++;
              continue L1;
            }
          }
        }
    }

    private final vna a(int param0, boolean param1, String param2) {
        vna var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        var4 = new vna();
        L0: while (true) {
          if (param2 == null) {
            if (param1) {
              return var4;
            } else {
              return null;
            }
          } else {
            L1: {
              var5 = ((uta) this).field_m.b(param2);
              var6 = param2;
              if (var5 > param0) {
                var7 = -1 + param2.length();
                L2: while (true) {
                  L3: {
                    if (var7 <= 0) {
                      break L3;
                    } else {
                      L4: {
                        if (var5 > param0) {
                          break L4;
                        } else {
                          if (32 == param2.charAt(var7)) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var7--;
                      var5 = var5 - ((uta) this).field_m.a(param2.charAt(var7));
                      continue L2;
                    }
                  }
                  if (var7 == 0) {
                    var5 = ((uta) this).field_m.b(param2);
                    var7 = param2.length() + -1;
                    L5: while (true) {
                      if (var5 <= param0) {
                        var6 = param2.substring(0, var7);
                        param2 = param2.substring(var7 + 1);
                        break L1;
                      } else {
                        var7--;
                        var5 = var5 - ((uta) this).field_m.a(param2.charAt(var7));
                        continue L5;
                      }
                    }
                  } else {
                    var9 = param2.substring(0, var7);
                    param2 = param2.substring(var7 + 1);
                    var4.b((byte) -128, (vg) (Object) new gka(var9));
                    continue L0;
                  }
                }
              } else {
                param2 = null;
                break L1;
              }
            }
            var4.b((byte) -128, (vg) (Object) new gka(var6));
            continue L0;
          }
        }
    }

    abstract String[] a(boolean param0);

    public static void c(int param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_n = null;
        field_l = null;
        if (param0 != 0) {
            field_n = null;
        }
    }

    private final jea a(int param0, byte param1, int param2) {
        jea var4 = new jea(0L, (jea) null);
        int var5 = 39 / ((-89 - param1) / 36);
        var4.field_w = sva.a(param2, param0, 4);
        return var4;
    }

    private final jea a(int param0, int param1) {
        int var4 = -128 / ((-18 - param0) / 61);
        jea var3 = new jea(0L, (jea) null);
        var3.field_w = eca.a(4, param1);
        return var3;
    }

    public final boolean a(int param0) {
        if (param0 != -2) {
            return true;
        }
        return ((uta) this).field_j;
    }

    public void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            uta.c(24);
        }
        if (!((((uta) this).field_i.field_t + ((uta) this).field_i.field_T ^ -1) >= -1)) {
            bea.c(((uta) this).field_i.field_q, ((uta) this).field_i.field_A, ((uta) this).field_a.field_qb, ((uta) this).field_i.field_t, 5592405, 230);
            bea.c(((uta) this).field_a.field_q + ((uta) this).field_a.field_G, ((uta) this).field_i.field_A, ((uta) this).field_a.field_qb, ((uta) this).field_i.field_t, 5592405, 230);
            bea.c(((uta) this).field_a.field_q, ((uta) this).field_i.field_A, ((uta) this).field_a.field_G, ((uta) this).field_a.field_T, 5592405, 230);
            bea.c(((uta) this).field_a.field_q, ((uta) this).field_a.field_A - -((uta) this).field_a.field_t, ((uta) this).field_a.field_G, -((uta) this).field_a.field_t + -((uta) this).field_a.field_A + ((uta) this).field_o.field_A, 5592405, 230);
            bea.c(((uta) this).field_a.field_q, ((uta) this).field_o.field_t + ((uta) this).field_o.field_A, ((uta) this).field_a.field_G, ((uta) this).field_i.field_t - ((uta) this).field_o.field_T - ((uta) this).field_o.field_t, 5592405, 230);
            bea.c(((uta) this).field_a.field_q, ((uta) this).field_a.field_A, ((uta) this).field_a.field_G, ((uta) this).field_a.field_t, 2236962, 240);
            bea.c(((uta) this).field_o.field_q, ((uta) this).field_o.field_A, ((uta) this).field_o.field_G, ((uta) this).field_o.field_t, 2236962, 240);
            var2 = ((uta) this).field_i.field_T + 256;
            if (!((var2 ^ -1) <= -1)) {
                var2 = 0;
            }
            bea.c(((uta) this).field_i.field_q, ((uta) this).field_i.field_t + ((uta) this).field_i.field_A, ((uta) this).field_i.field_G, -((uta) this).field_i.field_t + qf.field_i + -((uta) this).field_i.field_A, 0, var2 >> -859749791);
            var3 = ((uta) this).field_i.field_t + (((uta) this).field_i.field_T - -5);
            for (var4 = 0; 6 > var4; var4++) {
                bea.c(0, var3, mma.field_a, 0, var4 << -173144219);
                var3--;
            }
            ((uta) this).field_i.b(100, (((uta) this).field_h & 8) == 0 ? true : false);
        }
        if (((uta) this).field_b != null) {
            if (!(!((uta) this).field_j)) {
                var2 = ((uta) this).field_i.field_t + ((uta) this).field_i.field_T;
                ((uta) this).field_p.field_T = var2;
                ((uta) this).field_p.b(74, false);
                var2 = var2 + (5 + ((uta) this).field_k);
                var6 = 0;
                var3 = var6;
                while (((uta) this).field_b.length > var6) {
                    ((uta) this).field_m.c(((uta) this).field_b[var6], ((uta) this).field_p.field_q + 10, var2, 13421772, -1);
                    var2 = var2 + ((uta) this).field_k;
                    var6++;
                }
            }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param2 != ns.field_g) {
            ht.field_Fb = new int[param2];
            for (var3 = 0; var3 < param2; var3++) {
                ht.field_Fb[var3] = (var3 << -1794479700) / param2;
            }
            ooa.field_g = 32 * param2;
            una.field_b = -1 + param2;
            ns.field_g = param2;
        }
        if (param0 != 0) {
            return;
        }
        if (param1 != qda.field_i) {
            if (param1 == ns.field_g) {
                sj.field_b = ht.field_Fb;
            } else {
                sj.field_b = new int[param1];
                for (var3 = 0; param1 > var3; var3++) {
                    sj.field_b[var3] = (var3 << -1499956788) / param1;
                }
            }
            hba.field_b = -1 + param1;
            qda.field_i = param1;
        }
    }

    private final jea a(byte param0, int param1) {
        jea var3 = new jea();
        if (param0 <= 80) {
            Object var4 = null;
            this.a(true, (String) null);
        }
        var3.field_w = sva.a(param1, 0, 4);
        return var3;
    }

    private final jea a(String param0, int param1, int param2) {
        jea var4 = new jea(0L, (jea) null, param0);
        if (param1 != 16733525) {
            return null;
        }
        var4.field_H = ((uta) this).field_m;
        var4.field_ib = param2;
        var4.a(((uta) this).field_m.b(var4.field_r), ((uta) this).field_k, -23776, 0, 5);
        return var4;
    }

    public boolean a(byte param0, char param1, int param2) {
        jea var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        vg stackIn_19_1 = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        vg stackOut_18_1 = null;
        Object stackOut_17_0 = null;
        vg stackOut_17_1 = null;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 == -72) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        if (96 == param1) {
          this.d(2);
          return true;
        } else {
          if (((uta) this).field_j) {
            L1: {
              if (84 != param2) {
                if (param2 != 98) {
                  if (99 == param2) {
                    if (((uta) this).field_g == null) {
                      break L1;
                    } else {
                      if (((uta) this).field_s.field_e != ((uta) this).field_g.field_e) {
                        ((uta) this).field_g = (gka) (Object) ((uta) this).field_g.field_e;
                        ((uta) this).field_o.a((byte) 74, ((uta) this).field_g.field_h);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    if (param2 != 80) {
                      boolean discarded$1 = ((uta) this).field_o.a(param2, param0 + -19624, param1);
                      break L1;
                    } else {
                      ((uta) this).e(param0 + 21375);
                      break L1;
                    }
                  }
                } else {
                  L2: {
                    if (((uta) this).field_g == null) {
                      break L2;
                    } else {
                      if (((uta) this).field_g.field_a != ((uta) this).field_s.field_e) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    stackOut_16_0 = this;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (null != ((uta) this).field_g) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = ((uta) this).field_g.field_a;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L3;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = ((uta) this).field_s.f(-80);
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      break L3;
                    }
                  }
                  ((uta) this).field_g = (gka) (Object) stackIn_19_1;
                  if (((uta) this).field_g == null) {
                    break L1;
                  } else {
                    ((uta) this).field_o.a((byte) 12, ((uta) this).field_g.field_h);
                    break L1;
                  }
                }
              } else {
                var7 = ((uta) this).field_o.e((byte) -124);
                if ((var7.length() ^ -1) < -1) {
                  L4: {
                    this.a(24219, ((uta) this).field_t + var7, 5635925);
                    var5 = (jea) (Object) ((uta) this).field_a.field_tb.field_J.b(3);
                    if (!((uta) this).a(var7, (byte) -112)) {
                      var5.field_ib = 16733525;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((uta) this).field_o.d((byte) -113);
                  this.a(true, var7);
                  ((uta) this).field_g = null;
                  break L1;
                } else {
                  return true;
                }
              }
            }
            return true;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, String param1) {
        this.a(24219, param1, 13421772);
        int var3 = 22 / ((param0 - 82) / 40);
    }

    final void a(byte param0, Object param1) {
        if (param0 > -15) {
            field_f = null;
        }
        ((uta) this).a(126, param1 != null ? param1.toString() : "null");
    }

    abstract void e(int param0);

    abstract boolean a(String param0, byte param1);

    private final void d(int param0) {
        ((uta) this).field_j = !((uta) this).field_j ? true : false;
        if (param0 != 2) {
            ((uta) this).a(false, false);
        }
        if (((uta) this).field_j) {
            ((uta) this).field_q = 15;
            // if_acmpeq L92
            ((uta) this).field_i.a(param0 ^ -112, (jea) (Object) ((uta) this).field_o);
        } else {
            if (!(null == ((uta) this).field_i)) {
                ((uta) this).field_i.a(param0 ^ -125, (jea) null);
            }
        }
    }

    public final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = TombRacer.field_G ? 1 : 0;
            if (!((uta) this).field_j) {
              break L1;
            } else {
              if ((((uta) this).field_q ^ -1) < -1) {
                ((uta) this).field_q = ((uta) this).field_q - 1;
                ((uta) this).field_i.field_T = ((uta) this).field_q * (((uta) this).field_q * -200) / 225;
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (((uta) this).field_j) {
            break L0;
          } else {
            if ((((uta) this).field_i.field_T - -200 ^ -1) < -1) {
              ((uta) this).field_i.field_T = ((uta) this).field_i.field_T - 28;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          L3: {
            if (!((uta) this).field_o.e((byte) -117).equals((Object) (Object) ((uta) this).field_r)) {
              break L3;
            } else {
              if (((uta) this).field_o.j(-1320) != ((uta) this).field_c) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          L4: {
            ((uta) this).field_r = ((uta) this).field_o.e((byte) -121);
            ((uta) this).field_c = ((uta) this).field_o.j(-1320);
            ((uta) this).field_b = ((uta) this).a(false);
            if (((uta) this).field_b == null) {
              break L4;
            } else {
              if (-1 == (((uta) this).field_b.length ^ -1)) {
                ((uta) this).field_b = null;
                break L4;
              } else {
                break L4;
              }
            }
          }
          if (null == ((uta) this).field_b) {
            break L2;
          } else {
            var3 = 0;
            var4 = 0;
            L5: while (true) {
              if (var4 >= ((uta) this).field_b.length) {
                ((uta) this).field_p.field_G = 20 + var3;
                ((uta) this).field_p.field_t = ((uta) this).field_b.length * ((uta) this).field_k + 15;
                break L2;
              } else {
                var5 = ((uta) this).field_m.b(((uta) this).field_b[var4]);
                if (var3 < var5) {
                  var3 = var5;
                  var4++;
                  continue L5;
                } else {
                  var4++;
                  continue L5;
                }
              }
            }
          }
        }
        ((uta) this).field_h = ((uta) this).field_h + 1;
        ((uta) this).field_i.c(83, param1);
        ((uta) this).field_a.b(param0, 0, ((uta) this).field_k * 2 * pg.field_y, ((uta) this).field_k);
        ((uta) this).field_o.h((byte) 87);
    }

    final static bb a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param2 != 0) {
            field_f = null;
        }
        bb var5 = (bb) (Object) mg.field_b.f(-80);
        while (var5 != null) {
            if (!(param1 != var5.field_n)) {
                return var5;
            }
            var5 = (bb) (Object) mg.field_b.e(126);
        }
        bb var5_ref = new bb();
        var5_ref.field_j = param3;
        var5_ref.field_i = param4;
        var5_ref.field_n = param1;
        mg.field_b.b((byte) -48, (vg) (Object) var5_ref);
        pc.a(false, param0, var5_ref);
        return var5_ref;
    }

    private final void b(String param0, int param1, int param2) {
        int var6 = TombRacer.field_G ? 1 : 0;
        ((uta) this).field_a.field_tb.b(param2 ^ -155, this.a(param0, 16733525, param1));
        if ((((uta) this).field_a.field_tb.field_J.a((byte) -16) ^ -1) < -257) {
            vg discarded$0 = ((uta) this).field_a.field_tb.field_J.c(-106);
        }
        int var4 = 5;
        jea var5 = (jea) (Object) ((uta) this).field_a.field_tb.field_J.f(-80);
        while (var5 != null) {
            var5.field_T = var4;
            var4 = var4 + ((uta) this).field_k;
            var5 = (jea) (Object) ((uta) this).field_a.field_tb.field_J.e(116);
        }
        if (param2 != 230) {
            ((uta) this).field_i = null;
        }
        ((uta) this).field_a.field_tb.field_t = var4;
        ((uta) this).field_a.field_tb.field_T = -var4 + ((uta) this).field_a.field_t;
    }

    uta(il param0, fia param1) {
        ((uta) this).field_t = "# ";
        ((uta) this).field_s = new vna();
        ((uta) this).field_j = false;
        ((uta) this).field_h = 0;
        ((uta) this).field_b = null;
        ((uta) this).field_q = 0;
        ((uta) this).field_m = param0;
        ((uta) this).field_k = ((uta) this).field_m.field_w + ((uta) this).field_m.field_k;
        int var3 = 4 + ((uta) this).field_k;
        jea var4 = this.a((byte) 104, 65793);
        jea var5 = var4;
        jea var6 = var4;
        jea var7 = var4;
        jea var8 = this.a(7829367, (byte) 31, 2236962);
        jea var9 = this.a(65793, (byte) 21, 65793);
        jea var10 = this.a(3355443, (byte) -126, 65793);
        jea var11 = this.a(-91, 2263074);
        jea var12 = this.a(2236962, (byte) -125, 65793);
        ((uta) this).field_i = new jea(0L, var5);
        ((uta) this).field_i.a(mma.field_a, 200, -23776, -200, 0);
        oj var13 = new oj(0L, var8, var8, var9, var10);
        jea var14 = new jea();
        var14.field_J = new vna();
        ((uta) this).field_a = new iv(0L, var14, var6, var13);
        ((uta) this).field_a.field_tb.field_J = new vna();
        ((uta) this).field_a.a(((uta) this).field_i.field_G + -10, 0, (byte) 127, 5, 15, -var3 + 185, 5);
        ((uta) this).field_i.b(-128, (jea) (Object) ((uta) this).field_a);
        jea var15 = new jea();
        var15.field_H = ((uta) this).field_m;
        var15.field_ib = 13421772;
        var15.field_S = 5;
        var15.field_V = 2;
        ((uta) this).field_o = new sw(0L, var7, var11, var15);
        ((uta) this).field_o.b(((uta) this).field_a.field_G, 127, ((uta) this).field_a.field_T + ((uta) this).field_a.field_t + 5, var3, ((uta) this).field_a.field_qb);
        ((uta) this).field_o.a(param1, (byte) -127);
        ((uta) this).field_i.b(-126, (jea) (Object) ((uta) this).field_o);
        ((uta) this).field_p = new jea(0L, var12);
        ((uta) this).field_p.field_qb = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[2];
        field_l[1] = "Lava";
        field_l[0] = "Normal";
        field_n = "Death penalty <%0>";
        field_f = new String[9];
        field_f[4] = "Room: Windy";
        field_f[5] = "Room: Lights Out";
        field_f[7] = "Flip";
        field_f[2] = "Weapon Jammed";
        field_f[8] = "Tremors";
        field_f[6] = "Monsters";
        field_f[0] = "Slow Player";
        field_f[3] = "Difficulty Up";
        field_f[1] = "Invert Controls";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
