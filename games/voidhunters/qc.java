/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc implements kd {
    private int field_e;
    String field_c;
    kw field_p;
    private llb field_m;
    llb field_o;
    no field_n;
    soa field_h;
    private ij field_i;
    static ri field_g;
    static llb field_q;
    private String[] field_d;
    private int field_l;
    private boolean field_j;
    private ila field_k;
    private int field_f;
    private String field_a;
    private int field_b;

    private final llb b(int param0, int param1, String param2) {
        llb var4 = new llb((long)param1, (llb) null, param2);
        var4.field_eb = ((qc) this).field_n;
        var4.field_Y = param0;
        var4.a(5, param1 + 124, ((qc) this).field_n.b(var4.field_R), 0, ((qc) this).field_e);
        return var4;
    }

    private final void a(int param0, int param1, String param2) {
        int var6 = VoidHunters.field_G;
        ((qc) this).field_h.field_wb.b(-561, this.b(param1, 0, param2));
        if (!(param0 <= (((qc) this).field_h.field_wb.field_lb.c(3) ^ -1))) {
            ksa discarded$0 = ((qc) this).field_h.field_wb.field_lb.a(true);
        }
        int var4 = 5;
        llb var5 = (llb) (Object) ((qc) this).field_h.field_wb.field_lb.d(0);
        while (var5 != null) {
            var5.field_K = var4;
            var4 = var4 + ((qc) this).field_e;
            var5 = (llb) (Object) ((qc) this).field_h.field_wb.field_lb.a((byte) 30);
        }
        ((qc) this).field_h.field_wb.field_G = var4;
        ((qc) this).field_h.field_wb.field_K = -var4 + ((qc) this).field_h.field_G;
    }

    final boolean c(int param0) {
        if (param0 != 13462) {
            ((qc) this).b((byte) -120);
        }
        return ((qc) this).field_j;
    }

    final void a(byte param0, String param1) {
        this.a(param1, false, 13421772);
        if (param0 < 65) {
            Object var4 = null;
            ((qc) this).a((byte) -84, (String) null);
        }
    }

    private final ij a(int param0, byte param1, String param2) {
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        int var5 = -120 / ((-80 - param1) / 41);
        ij var4 = new ij();
        while (param2 != null) {
            var6 = ((qc) this).field_n.b(param2);
            var7 = param2;
            if (param0 >= var6) {
                param2 = null;
            } else {
                var8 = -1 + param2.length();
                while (var8 > 0) {
                    if (var6 <= param0) {
                        // if_icmpeq L111
                    }
                    var8--;
                    var6 = var6 - ((qc) this).field_n.a(param2.charAt(var8));
                }
                if (-1 == (var8 ^ -1)) {
                    var6 = ((qc) this).field_n.b(param2);
                    var8 = param2.length() - 1;
                    while (param0 < var6) {
                        var8--;
                        var6 = var6 - ((qc) this).field_n.a(param2.charAt(var8));
                    }
                }
                var7 = param2.substring(0, var8);
                param2 = param2.substring(var8 + 1);
            }
            var4.b(-10258, (ksa) (Object) new ila(var7));
        }
        return var4;
    }

    public static void a(byte param0) {
        field_q = null;
        if (param0 < 16) {
            return;
        }
        field_g = null;
    }

    abstract String[] d(int param0);

    private final void a(String param0, int param1) {
        ila var3 = (ila) (Object) ((qc) this).field_i.d(0);
        int var4 = -50 / ((74 - param1) / 41);
        if (var3 != null) {
            // ifeq L45
        } else {
            ((qc) this).field_i.a((ksa) (Object) new ila(param0), (byte) -55);
        }
        if (!(((qc) this).field_i.c(3) <= 30)) {
            ksa discarded$0 = ((qc) this).field_i.c((byte) -115);
        }
    }

    void b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = 59 / ((param0 - 44) / 43);
        if (((qc) this).field_m.field_K + ((qc) this).field_m.field_G > 0) {
            dma.e(((qc) this).field_m.field_M, ((qc) this).field_m.field_u, ((qc) this).field_h.field_L, ((qc) this).field_m.field_G, 5592405, 230);
            dma.e(((qc) this).field_h.field_hb + ((qc) this).field_h.field_M, ((qc) this).field_m.field_u, ((qc) this).field_h.field_L, ((qc) this).field_m.field_G, 5592405, 230);
            dma.e(((qc) this).field_h.field_M, ((qc) this).field_m.field_u, ((qc) this).field_h.field_hb, ((qc) this).field_h.field_K, 5592405, 230);
            dma.e(((qc) this).field_h.field_M, ((qc) this).field_h.field_G + ((qc) this).field_h.field_u, ((qc) this).field_h.field_hb, -((qc) this).field_h.field_G + ((qc) this).field_p.field_u + -((qc) this).field_h.field_u, 5592405, 230);
            dma.e(((qc) this).field_h.field_M, ((qc) this).field_p.field_G + ((qc) this).field_p.field_u, ((qc) this).field_h.field_hb, -((qc) this).field_p.field_G + (((qc) this).field_m.field_G + -((qc) this).field_p.field_K), 5592405, 230);
            dma.e(((qc) this).field_h.field_M, ((qc) this).field_h.field_u, ((qc) this).field_h.field_hb, ((qc) this).field_h.field_G, 2236962, 240);
            dma.e(((qc) this).field_p.field_M, ((qc) this).field_p.field_u, ((qc) this).field_p.field_hb, ((qc) this).field_p.field_G, 2236962, 240);
            var3 = ((qc) this).field_m.field_K + 256;
            if (0 > var3) {
                var3 = 0;
            }
            dma.e(((qc) this).field_m.field_M, ((qc) this).field_m.field_G + ((qc) this).field_m.field_u, ((qc) this).field_m.field_hb, -((qc) this).field_m.field_G + fua.field_p - ((qc) this).field_m.field_u, 0, var3 >> -474883743);
            var4 = 5 + (((qc) this).field_m.field_G + ((qc) this).field_m.field_K);
            for (var5 = 0; 6 > var5; var5++) {
                dma.g(0, var4, rda.field_p, 0, var5 << 901490853);
                var4--;
            }
            ((qc) this).field_m.b(-1 == (8 & ((qc) this).field_b ^ -1) ? true : false, 111);
        }
        if (((qc) this).field_d != null) {
            if (((qc) this).field_j) {
                var3 = ((qc) this).field_m.field_G + ((qc) this).field_m.field_K;
                ((qc) this).field_o.field_K = var3;
                ((qc) this).field_o.b(false, 43);
                var3 = var3 + (((qc) this).field_e - -5);
                var7 = 0;
                var4 = var7;
                while (((qc) this).field_d.length > var7) {
                    ((qc) this).field_n.c(((qc) this).field_d[var7], ((qc) this).field_o.field_M + 10, var3, 13421772, -1);
                    var3 = var3 + ((qc) this).field_e;
                    var7++;
                }
            }
        }
    }

    private final llb a(byte param0, int param1, int param2) {
        if (param0 > -57) {
            ((qc) this).field_d = null;
        }
        llb var4 = new llb(0L, (llb) null);
        var4.field_gb = va.a(-26998, param1, param2);
        return var4;
    }

    abstract boolean a(int param0, String param1);

    abstract void a(int param0);

    final static asb b(int param0) {
        if (param0 != 0) {
            field_q = null;
        }
        return pj.a((byte) 52, qw.field_e.field_a);
    }

    private final llb a(int param0, int param1) {
        if (param0 != 4) {
            return null;
        }
        llb var3 = new llb(0L, (llb) null);
        var3.field_gb = prb.a(true, param1);
        return var3;
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param1 > 73) {
          L0: {
            L1: {
              if (!((qc) this).field_j) {
                break L1;
              } else {
                if (0 < ((qc) this).field_f) {
                  ((qc) this).field_f = ((qc) this).field_f - 1;
                  ((qc) this).field_m.field_K = ((qc) this).field_f * -200 * ((qc) this).field_f / 225;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (((qc) this).field_j) {
              break L0;
            } else {
              if (0 < 200 + ((qc) this).field_m.field_K) {
                ((qc) this).field_m.field_K = ((qc) this).field_m.field_K - 28;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L2: {
            L3: {
              if (((qc) this).field_p.l(-14453).equals((Object) (Object) ((qc) this).field_a)) {
                if (((qc) this).field_p.j(0) == ((qc) this).field_l) {
                  break L2;
                } else {
                  ((qc) this).field_a = ((qc) this).field_p.l(-14453);
                  ((qc) this).field_l = ((qc) this).field_p.j(0);
                  ((qc) this).field_d = ((qc) this).d(-85);
                  if (((qc) this).field_d == null) {
                    break L3;
                  } else {
                    if (-1 != (((qc) this).field_d.length ^ -1)) {
                      break L3;
                    } else {
                      ((qc) this).field_d = null;
                      break L3;
                    }
                  }
                }
              } else {
                ((qc) this).field_a = ((qc) this).field_p.l(-14453);
                ((qc) this).field_l = ((qc) this).field_p.j(0);
                ((qc) this).field_d = ((qc) this).d(-85);
                if (((qc) this).field_d == null) {
                  break L3;
                } else {
                  if (-1 != (((qc) this).field_d.length ^ -1)) {
                    break L3;
                  } else {
                    ((qc) this).field_d = null;
                    break L3;
                  }
                }
              }
            }
            if (((qc) this).field_d == null) {
              break L2;
            } else {
              var3 = 0;
              var4 = 0;
              L4: while (true) {
                if (((qc) this).field_d.length <= var4) {
                  ((qc) this).field_o.field_hb = 20 + var3;
                  ((qc) this).field_o.field_G = 15 + ((qc) this).field_e * ((qc) this).field_d.length;
                  break L2;
                } else {
                  var5 = ((qc) this).field_n.b(((qc) this).field_d[var4]);
                  if (var3 < var5) {
                    var3 = var5;
                    var4++;
                    continue L4;
                  } else {
                    var4++;
                    continue L4;
                  }
                }
              }
            }
          }
          ((qc) this).field_b = ((qc) this).field_b + 1;
          ((qc) this).field_m.a(param0, 1332);
          ((qc) this).field_h.a(2 * (((qc) this).field_e * tcb.field_o), true, ((qc) this).field_e, 0);
          ((qc) this).field_p.f((byte) -6);
          return;
        } else {
          return;
        }
    }

    private final void a(String param0, boolean param1, int param2) {
        int var4 = 0;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        ij var9 = null;
        ila var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        var4 = ((qc) this).field_h.field_hb + -25;
        var5 = up.a((byte) -67, '\n', param0);
        var6 = var5;
        if (!param1) {
          var7 = 0;
          L0: while (true) {
            if (var6.length <= var7) {
              return;
            } else {
              var8 = var6[var7];
              if (var4 <= ((qc) this).field_n.b(var8)) {
                var9 = this.a(var4, (byte) -128, var8);
                var10 = (ila) (Object) var9.d(0);
                L1: while (true) {
                  if (var10 != null) {
                    this.a(-257, param2, var10.field_d);
                    var10 = (ila) (Object) var9.a((byte) 26);
                    continue L1;
                  } else {
                    var7++;
                    continue L0;
                  }
                }
              } else {
                this.a(-257, param2, var8);
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final llb a(int param0, byte param1) {
        int var3 = -103 / ((param1 - -68) / 35);
        llb var4 = new llb();
        var4.field_gb = va.a(-26998, 0, param0);
        return var4;
    }

    private final void a(boolean param0) {
        ((qc) this).field_j = !((qc) this).field_j ? true : false;
        if (!((qc) this).field_j) {
            // if_acmpeq L72
            ((qc) this).field_m.a(false, (llb) null);
        } else {
            ((qc) this).field_f = 15;
            if (!(null == ((qc) this).field_m)) {
                ((qc) this).field_m.a(false, (llb) (Object) ((qc) this).field_p);
            }
        }
        if (!param0) {
            field_g = null;
        }
    }

    boolean a(int param0, char param1, int param2) {
        llb var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        ksa stackIn_18_1 = null;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        ksa stackOut_17_1 = null;
        Object stackOut_16_0 = null;
        ksa stackOut_16_1 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (param2 == -40) {
            break L0;
          } else {
            llb discarded$2 = this.a(77, (byte) 52);
            break L0;
          }
        }
        if (96 == param1) {
          this.a(true);
          return true;
        } else {
          if (!((qc) this).field_j) {
            return false;
          } else {
            L1: {
              if (-85 != (param0 ^ -1)) {
                if (param0 != 98) {
                  if (99 != param0) {
                    if (param0 != 80) {
                      boolean discarded$3 = ((qc) this).field_p.a(param0, -1, param1);
                      break L1;
                    } else {
                      ((qc) this).a(-35);
                      break L1;
                    }
                  } else {
                    if (null == ((qc) this).field_k) {
                      break L1;
                    } else {
                      if (((qc) this).field_i.field_a != ((qc) this).field_k.field_a) {
                        ((qc) this).field_k = (ila) (Object) ((qc) this).field_k.field_a;
                        ((qc) this).field_p.a(((qc) this).field_k.field_d, -114);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  L2: {
                    if (((qc) this).field_k == null) {
                      break L2;
                    } else {
                      if (((qc) this).field_i.field_a != ((qc) this).field_k.field_c) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    stackOut_15_0 = this;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (null != ((qc) this).field_k) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = ((qc) this).field_k.field_c;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L3;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = ((qc) this).field_i.d(param2 + 40);
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      break L3;
                    }
                  }
                  ((qc) this).field_k = (ila) (Object) stackIn_18_1;
                  if (null == ((qc) this).field_k) {
                    break L1;
                  } else {
                    ((qc) this).field_p.a(((qc) this).field_k.field_d, -121);
                    break L1;
                  }
                }
              } else {
                var7 = ((qc) this).field_p.l(-14453);
                if ((var7.length() ^ -1) < -1) {
                  L4: {
                    this.a(((qc) this).field_c + var7, false, 5635925);
                    var5 = (llb) (Object) ((qc) this).field_h.field_wb.field_lb.b((byte) 127);
                    if (!((qc) this).a(-10278, var7)) {
                      var5.field_Y = 16733525;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((qc) this).field_p.a(true);
                  this.a(var7, param2 ^ 122);
                  ((qc) this).field_k = null;
                  break L1;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
    }

    final void a(Object param0, int param1) {
        if (param1 >= -16) {
            return;
        }
        ((qc) this).a((byte) 115, param0 != null ? param0.toString() : "null");
    }

    qc(no param0, eab param1) {
        ((qc) this).field_c = "# ";
        ((qc) this).field_i = new ij();
        ((qc) this).field_d = null;
        ((qc) this).field_f = 0;
        ((qc) this).field_j = false;
        ((qc) this).field_b = 0;
        ((qc) this).field_n = param0;
        ((qc) this).field_e = ((qc) this).field_n.field_k + ((qc) this).field_n.field_A;
        int var3 = ((qc) this).field_e + 4;
        llb var4 = this.a(65793, (byte) 79);
        llb var5 = var4;
        llb var6 = var4;
        llb var7 = var4;
        llb var8 = this.a((byte) -59, 7829367, 2236962);
        llb var9 = this.a((byte) -91, 65793, 65793);
        llb var10 = this.a((byte) -63, 3355443, 65793);
        llb var11 = this.a(4, 2263074);
        llb var12 = this.a((byte) -105, 2236962, 65793);
        ((qc) this).field_m = new llb(0L, var5);
        ((qc) this).field_m.a(0, 16, rda.field_p, -200, 200);
        pjb var13 = new pjb(0L, var8, var8, var9, var10);
        llb var14 = new llb();
        var14.field_lb = new ij();
        ((qc) this).field_h = new soa(0L, var14, var6, var13);
        ((qc) this).field_h.field_wb.field_lb = new ij();
        ((qc) this).field_h.a(((qc) this).field_m.field_hb + -10, 0, -1, -var3 + 185, 5, 5, 15);
        ((qc) this).field_m.b(-561, (llb) (Object) ((qc) this).field_h);
        llb var15 = new llb();
        var15.field_Y = 13421772;
        var15.field_t = 5;
        var15.field_eb = ((qc) this).field_n;
        var15.field_v = 2;
        ((qc) this).field_p = new kw(0L, var7, var11, var15);
        ((qc) this).field_p.a(((qc) this).field_h.field_hb, ((qc) this).field_h.field_L, var3, ((qc) this).field_h.field_G + (((qc) this).field_h.field_K - -5), true);
        ((qc) this).field_p.a(-20640, param1);
        ((qc) this).field_m.b(-561, (llb) (Object) ((qc) this).field_p);
        ((qc) this).field_o = new llb(0L, var12);
        ((qc) this).field_o.field_L = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ri(15, 0, 1, 0);
    }
}
