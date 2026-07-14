/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class be implements hc {
    private tf field_m;
    vg field_k;
    static hd field_q;
    hu field_d;
    private hd field_l;
    hd field_j;
    private int field_f;
    np field_g;
    String field_a;
    static tf field_i;
    private String[] field_c;
    private boolean field_h;
    private int field_b;
    private int field_n;
    private lj field_o;
    private String field_p;
    private int field_e;

    private final void a(int param0, String param1, byte param2) {
        int var4 = 0;
        String[] var5 = null;
        String[] var6 = null;
        int var7 = 0;
        String var8 = null;
        tf var9 = null;
        lj var10 = null;
        int var11 = 0;
        L0: {
          var11 = Kickabout.field_G;
          var4 = -15 + (-10 + ((be) this).field_g.field_q);
          if (param2 == -122) {
            break L0;
          } else {
            be.d((byte) 97);
            break L0;
          }
        }
        var5 = wr.a(param1, 2, '\n');
        var6 = var5;
        var7 = 0;
        L1: while (true) {
          if (var7 >= var6.length) {
            return;
          } else {
            var8 = var6[var7];
            if (((be) this).field_d.a(var8) < var4) {
              this.a(31779, param0, var8);
              var7++;
              continue L1;
            } else {
              var9 = this.b(0, var8, var4);
              var10 = (lj) (Object) var9.g(24009);
              L2: while (true) {
                if (var10 != null) {
                  this.a(31779, param0, var10.field_i);
                  var10 = (lj) (Object) var9.c(33);
                  continue L2;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var5 = Kickabout.field_G;
        if ((((be) this).field_l.field_mb + ((be) this).field_l.field_J ^ -1) < -1) {
            on.a(((be) this).field_l.field_F, ((be) this).field_l.field_T, ((be) this).field_g.field_s, ((be) this).field_l.field_mb, 5592405, 230);
            on.a(((be) this).field_g.field_F - -((be) this).field_g.field_q, ((be) this).field_l.field_T, ((be) this).field_g.field_s, ((be) this).field_l.field_mb, 5592405, 230);
            on.a(((be) this).field_g.field_F, ((be) this).field_l.field_T, ((be) this).field_g.field_q, ((be) this).field_g.field_J, 5592405, 230);
            on.a(((be) this).field_g.field_F, ((be) this).field_g.field_mb + ((be) this).field_g.field_T, ((be) this).field_g.field_q, -((be) this).field_g.field_mb + -((be) this).field_g.field_T + ((be) this).field_k.field_T, 5592405, 230);
            on.a(((be) this).field_g.field_F, ((be) this).field_k.field_mb + ((be) this).field_k.field_T, ((be) this).field_g.field_q, -((be) this).field_k.field_mb + (((be) this).field_l.field_mb - ((be) this).field_k.field_J), 5592405, 230);
            on.a(((be) this).field_g.field_F, ((be) this).field_g.field_T, ((be) this).field_g.field_q, ((be) this).field_g.field_mb, 2236962, 240);
            on.a(((be) this).field_k.field_F, ((be) this).field_k.field_T, ((be) this).field_k.field_q, ((be) this).field_k.field_mb, 2236962, 240);
            var2 = 256 + ((be) this).field_l.field_J;
            if (!((var2 ^ -1) <= -1)) {
                var2 = 0;
            }
            on.a(((be) this).field_l.field_F, ((be) this).field_l.field_T - -((be) this).field_l.field_mb, ((be) this).field_l.field_q, -((be) this).field_l.field_mb + vc.field_B + -((be) this).field_l.field_T, 0, var2 >> 1034905985);
            var3 = 5 + (((be) this).field_l.field_mb + ((be) this).field_l.field_J);
            for (var4 = 0; 6 > var4; var4++) {
                on.c(0, var3, f.field_d, 0, var4 << -1774521947);
                var3--;
            }
            ((be) this).field_l.a(127, 0 == (((be) this).field_n & 8) ? true : false);
        }
        var2 = 20 / ((50 - param0) / 45);
        if (null != ((be) this).field_c) {
            if (!(!((be) this).field_h)) {
                var3 = ((be) this).field_l.field_J - -((be) this).field_l.field_mb;
                ((be) this).field_j.field_J = var3;
                ((be) this).field_j.a(78, false);
                var3 = var3 + (5 + ((be) this).field_f);
                var6 = 0;
                var4 = var6;
                while (((be) this).field_c.length > var6) {
                    ((be) this).field_d.a(((be) this).field_c[var6], 10 + ((be) this).field_j.field_F, var3, 13421772, -1);
                    var3 = var3 + ((be) this).field_f;
                    var6++;
                }
            }
        }
    }

    private final tf b(int param0, String param1, int param2) {
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = Kickabout.field_G;
        if (param0 != 0) {
            Object var9 = null;
            hd discarded$0 = this.a(92, (String) null, -8);
        }
        tf var4 = new tf();
        while (param1 != null) {
            var5 = ((be) this).field_d.a(param1);
            var6 = param1;
            if (var5 <= param2) {
                param1 = null;
            } else {
                var7 = param1.length() - 1;
                while (0 < var7) {
                    if (param2 >= var5) {
                        // if_icmpeq L123
                    }
                    var7--;
                    var5 = var5 - ((be) this).field_d.a(param1.charAt(var7));
                }
                if (var7 == 0) {
                    var5 = ((be) this).field_d.a(param1);
                    var7 = -1 + param1.length();
                    while (param2 < var5) {
                        var7--;
                        var5 = var5 - ((be) this).field_d.a(param1.charAt(var7));
                    }
                }
                var6 = param1.substring(0, var7);
                param1 = param1.substring(var7 + 1);
            }
            var4.a((gn) (Object) new lj(var6), param0 ^ 3);
        }
        return var4;
    }

    abstract boolean a(String param0, boolean param1);

    private final hd a(int param0, int param1) {
        if (param0 != 4) {
            return null;
        }
        hd var3 = new hd(0L, (hd) null);
        var3.field_R = sp.a((byte) 26, param1);
        return var3;
    }

    abstract String[] b(byte param0);

    private final void a(int param0, int param1, String param2) {
        int var6 = Kickabout.field_G;
        ((be) this).field_g.field_Ab.a((byte) -109, this.a(param1, param2, -73));
        if (!(256 >= ((be) this).field_g.field_Ab.field_jb.a(false))) {
            gn discarded$0 = ((be) this).field_g.field_Ab.field_jb.b((byte) 125);
        }
        int var4 = 5;
        hd var5 = (hd) (Object) ((be) this).field_g.field_Ab.field_jb.g(24009);
        while (var5 != null) {
            var5.field_J = var4;
            var4 = var4 + ((be) this).field_f;
            var5 = (hd) (Object) ((be) this).field_g.field_Ab.field_jb.c(param0 + -31746);
        }
        if (param0 != 31779) {
            ((be) this).field_p = null;
        }
        ((be) this).field_g.field_Ab.field_mb = var4;
        ((be) this).field_g.field_Ab.field_J = -var4 + ((be) this).field_g.field_mb;
    }

    public final boolean a(byte param0) {
        if (param0 < 63) {
            hd discarded$0 = this.a(40, -60, 5);
        }
        return ((be) this).field_h;
    }

    public boolean a(int param0, int param1, char param2) {
        hd var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        gn stackIn_26_1 = null;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        gn stackOut_25_1 = null;
        Object stackOut_24_0 = null;
        gn stackOut_24_1 = null;
        var6 = Kickabout.field_G;
        if (param0 == 11516) {
          if (param2 == 96) {
            this.c((byte) -23);
            return true;
          } else {
            if (!((be) this).field_h) {
              return false;
            } else {
              L0: {
                if (param1 != 84) {
                  if (-99 == (param1 ^ -1)) {
                    L1: {
                      if (((be) this).field_o == null) {
                        break L1;
                      } else {
                        if (((be) this).field_m.field_c != ((be) this).field_o.field_d) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                    L2: {
                      stackOut_23_0 = this;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (null == ((be) this).field_o) {
                        stackOut_25_0 = this;
                        stackOut_25_1 = ((be) this).field_m.g(param0 ^ 28981);
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        break L2;
                      } else {
                        stackOut_24_0 = this;
                        stackOut_24_1 = ((be) this).field_o.field_d;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        break L2;
                      }
                    }
                    ((be) this).field_o = (lj) (Object) stackIn_26_1;
                    if (((be) this).field_o == null) {
                      break L0;
                    } else {
                      ((be) this).field_k.b(((be) this).field_o.field_i, param0 ^ -30330);
                      break L0;
                    }
                  } else {
                    if ((param1 ^ -1) != -100) {
                      if (-81 != (param1 ^ -1)) {
                        boolean discarded$1 = ((be) this).field_k.a(param1, param2, param0 ^ 12183);
                        break L0;
                      } else {
                        ((be) this).b(72);
                        break L0;
                      }
                    } else {
                      if (((be) this).field_o == null) {
                        break L0;
                      } else {
                        if (((be) this).field_m.field_c != ((be) this).field_o.field_b) {
                          ((be) this).field_o = (lj) (Object) ((be) this).field_o.field_b;
                          ((be) this).field_k.b(((be) this).field_o.field_i, -23174);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  var7 = ((be) this).field_k.j((byte) -16);
                  if (-1 > (var7.length() ^ -1)) {
                    L3: {
                      this.a(5635925, ((be) this).field_a + var7, (byte) -122);
                      var5 = (hd) (Object) ((be) this).field_g.field_Ab.field_jb.d(param0 ^ -4021);
                      if (!((be) this).a(var7, true)) {
                        var5.field_y = 16733525;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((be) this).field_k.k(param0 ^ -26138);
                    this.a(var7, 30);
                    ((be) this).field_o = null;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(String param0, int param1) {
        lj var3 = (lj) (Object) ((be) this).field_m.g(24009);
        if (var3 != null) {
            // ifne L54
        }
        ((be) this).field_m.a(0, (gn) (Object) new lj(param0));
        if (!(((be) this).field_m.a(false) <= param1)) {
            gn discarded$0 = ((be) this).field_m.h(-124);
        }
    }

    private final hd a(int param0, String param1, int param2) {
        hd var4 = new hd(0L, (hd) null, param1);
        var4.field_X = ((be) this).field_d;
        var4.field_y = param0;
        var4.a(true, ((be) this).field_d.a(var4.field_E), 5, 0, ((be) this).field_f);
        if (param2 > 0) {
            Object var5 = null;
            ((be) this).a((String) null, (byte) -100);
        }
        return var4;
    }

    final void a(String param0, byte param1) {
        this.a(13421772, param0, (byte) -122);
        if (param1 != 94) {
            ((be) this).field_e = 33;
        }
    }

    private final hd b(int param0, int param1) {
        hd var3 = new hd();
        var3.field_R = ih.a(param0, param1 ^ param1, 0);
        return var3;
    }

    private final hd a(int param0, int param1, int param2) {
        if (param1 != 200) {
            ((be) this).field_o = null;
        }
        hd var4 = new hd(0L, (hd) null);
        var4.field_R = ih.a(param0, param1 + -200, param2);
        return var4;
    }

    abstract void b(int param0);

    public static void d(byte param0) {
        field_i = null;
        if (param0 >= -9) {
            return;
        }
        field_q = null;
    }

    final void a(int param0, Object param1) {
        if (param0 > -49) {
            ((be) this).field_b = -72;
        }
        ((be) this).a(param1 == null ? "null" : param1.toString(), (byte) 94);
    }

    final static boolean e(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var1 = bk.a(2);
          var2 = qi.a(false);
          if (param0 >= 45) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (var1 != 9) {
                break L3;
              } else {
                if (var2 >= 28) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if ((var1 ^ -1) != -11) {
                break L4;
              } else {
                if ((var2 ^ -1) < -12) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    private final void c(byte param0) {
        ((be) this).field_h = !((be) this).field_h ? true : false;
        if (!((be) this).field_h) {
            // if_acmpeq L75
            ((be) this).field_l.a(param0 ^ -100, (hd) null);
        } else {
            ((be) this).field_e = 15;
            if (!(((be) this).field_l == null)) {
                ((be) this).field_l.a(-95, (hd) (Object) ((be) this).field_k);
            }
        }
        if (param0 != -23) {
            ((be) this).field_a = null;
        }
    }

    public final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          if (param0 == -25) {
            break L0;
          } else {
            ((be) this).field_p = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((be) this).field_h) {
              break L2;
            } else {
              if (0 < ((be) this).field_e) {
                ((be) this).field_e = ((be) this).field_e - 1;
                ((be) this).field_l.field_J = ((be) this).field_e * -200 * ((be) this).field_e / 225;
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (((be) this).field_h) {
            break L1;
          } else {
            if (-1 > (200 + ((be) this).field_l.field_J ^ -1)) {
              ((be) this).field_l.field_J = ((be) this).field_l.field_J - 28;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          L4: {
            if (!((be) this).field_k.j((byte) -16).equals((Object) (Object) ((be) this).field_p)) {
              break L4;
            } else {
              if (((be) this).field_k.j(-1) == ((be) this).field_b) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            ((be) this).field_p = ((be) this).field_k.j((byte) -16);
            ((be) this).field_b = ((be) this).field_k.j(-1);
            ((be) this).field_c = ((be) this).b((byte) -86);
            if (null == ((be) this).field_c) {
              break L5;
            } else {
              if (0 != ((be) this).field_c.length) {
                break L5;
              } else {
                ((be) this).field_c = null;
                break L5;
              }
            }
          }
          if (null != ((be) this).field_c) {
            var3 = 0;
            var4 = 0;
            L6: while (true) {
              if (var4 >= ((be) this).field_c.length) {
                ((be) this).field_j.field_q = var3 - -20;
                ((be) this).field_j.field_mb = ((be) this).field_c.length * ((be) this).field_f + 15;
                break L3;
              } else {
                var5 = ((be) this).field_d.a(((be) this).field_c[var4]);
                if (var3 < var5) {
                  var3 = var5;
                  var4++;
                  continue L6;
                } else {
                  var4++;
                  continue L6;
                }
              }
            }
          } else {
            break L3;
          }
        }
        ((be) this).field_n = ((be) this).field_n + 1;
        ((be) this).field_l.b(0, param1);
        ((be) this).field_g.a(((be) this).field_f, id.field_v * (((be) this).field_f * 2), true, 0);
        ((be) this).field_k.b(11570);
    }

    be(hu param0, bu param1) {
        ((be) this).field_a = "# ";
        ((be) this).field_m = new tf();
        ((be) this).field_h = false;
        ((be) this).field_n = 0;
        ((be) this).field_c = null;
        ((be) this).field_e = 0;
        ((be) this).field_d = param0;
        ((be) this).field_f = ((be) this).field_d.field_G + ((be) this).field_d.field_p;
        int var3 = ((be) this).field_f + 4;
        hd var4 = this.b(65793, 186);
        hd var5 = var4;
        hd var6 = var4;
        hd var7 = var4;
        hd var8 = this.a(2236962, 200, 7829367);
        hd var9 = this.a(65793, 200, 65793);
        hd var10 = this.a(65793, 200, 3355443);
        hd var11 = this.a(4, 2263074);
        hd var12 = this.a(65793, 200, 2236962);
        ((be) this).field_l = new hd(0L, var5);
        ((be) this).field_l.a(true, f.field_d, 0, -200, 200);
        na var13 = new na(0L, var8, var8, var9, var10);
        hd var14 = new hd();
        var14.field_jb = new tf();
        ((be) this).field_g = new np(0L, var14, var6, var13);
        ((be) this).field_g.field_Ab.field_jb = new tf();
        ((be) this).field_g.a(0, 94, -var3 + 185, 5, 5, -10 + ((be) this).field_l.field_q, 15);
        ((be) this).field_l.a((byte) -118, (hd) (Object) ((be) this).field_g);
        hd var15 = new hd();
        var15.field_y = 13421772;
        var15.field_D = 5;
        var15.field_B = 2;
        var15.field_X = ((be) this).field_d;
        ((be) this).field_k = new vg(0L, var7, var11, var15);
        ((be) this).field_k.a(-630, ((be) this).field_g.field_s, 5 + (((be) this).field_g.field_J + ((be) this).field_g.field_mb), var3, ((be) this).field_g.field_q);
        ((be) this).field_k.a(param1, -17421);
        ((be) this).field_l.a((byte) -119, (hd) (Object) ((be) this).field_k);
        ((be) this).field_j = new hd(0L, var12);
        ((be) this).field_j.field_s = 0;
    }

    static {
    }
}
