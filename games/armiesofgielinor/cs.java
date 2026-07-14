/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs extends sf implements he {
    static String[] field_W;
    private kb field_ab;
    private fw field_gb;
    private fw field_Z;
    static kk[] field_db;
    private long field_fb;
    static int field_Y;
    static String field_X;
    static java.awt.Frame field_bb;
    static java.math.BigInteger field_cb;
    static String field_eb;

    cs(gk param0) {
        super(param0, 200, 200);
        ((cs) this).field_fb = vi.b(-95);
        kb var3 = new kb(ro.field_vb, (qo) null);
        var3.field_p = 50;
        var3.field_w = 100;
        var3.field_l = ((cs) this).field_l;
        var3.field_B = 0;
        var3.field_k = (kh) (Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((cs) this).a((byte) 10, var3);
        ((cs) this).field_ab = new kb(ro.field_vb, (qo) null);
        ((cs) this).field_ab.field_l = ((cs) this).field_l;
        ((cs) this).field_ab.field_B = 0;
        ((cs) this).field_ab.field_p = 20 + (var3.field_p + var3.field_w);
        ((cs) this).field_ab.field_w = 80;
        ((cs) this).field_ab.field_k = (kh) (Object) new lk(bv.field_t, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((cs) this).a((byte) 10, ((cs) this).field_ab);
        ((cs) this).field_Z = this.a(ui.field_e, -63, (qo) this);
        ((cs) this).field_gb = this.a(ge.field_m, -74, (qo) this);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        Object var7 = null;
        if (param4 == ((cs) this).field_Z) {
          this.n(10);
          if (param1 == 11) {
            return;
          } else {
            var7 = null;
            ((cs) this).a(-91, -43, 76, 119, (fw) null);
            return;
          }
        } else {
          if (param4 != ((cs) this).field_gb) {
            if (param1 != 11) {
              var7 = null;
              ((cs) this).a(-91, -43, 76, 119, (fw) null);
              return;
            } else {
              return;
            }
          } else {
            ck.b(-65);
            this.n(10);
            if (param1 == 11) {
              return;
            } else {
              var7 = null;
              ((cs) this).a(-91, -43, 76, 119, (fw) null);
              return;
            }
          }
        }
    }

    private final void n(int param0) {
        if (!((cs) this).field_L) {
            return;
        }
        if (param0 != 10) {
            field_db = null;
            ((cs) this).field_L = false;
            return;
        }
        ((cs) this).field_L = false;
    }

    public static void b(boolean param0) {
        field_bb = null;
        if (!param0) {
          cs.b(false);
          field_db = null;
          field_X = null;
          field_W = null;
          field_eb = null;
          field_cb = null;
          return;
        } else {
          field_db = null;
          field_X = null;
          field_W = null;
          field_eb = null;
          field_cb = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        long var5 = 0L;
        int var7 = 0;
        this.a(param0, param1, param2, param3);
        if (!lk.field_f) {
          var5 = vi.b(92) + -((cs) this).field_fb;
          var7 = (int)((10999L - var5) / 1000L);
          if (0 >= var7) {
            L0: {
              ck.b(-62);
              this.n(10);
              ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, tn.field_cb), 0);
              if (!((cs) this).field_L) {
                break L0;
              } else {
                if (null != wq.field_a) {
                  break L0;
                } else {
                  this.n(param0 ^ 32728);
                  ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), 0);
                  if (null != wq.field_a) {
                    if (!wq.field_a.field_k) {
                      return;
                    } else {
                      this.n(10);
                      ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), param0 ^ 32722);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (null != wq.field_a) {
              if (wq.field_a.field_k) {
                this.n(10);
                ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), param0 ^ 32722);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L1: {
              ((cs) this).field_ab.field_v = "" + var7;
              if (!((cs) this).field_L) {
                break L1;
              } else {
                if (null != wq.field_a) {
                  break L1;
                } else {
                  this.n(param0 ^ 32728);
                  ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), 0);
                  if (null != wq.field_a) {
                    if (wq.field_a.field_k) {
                      this.n(10);
                      ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), param0 ^ 32722);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (null != wq.field_a) {
              if (!wq.field_a.field_k) {
                return;
              } else {
                this.n(10);
                ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), param0 ^ 32722);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L2: {
            param3.f(param0 + -32721);
            var5 = vi.b(92) + -((cs) this).field_fb;
            var7 = (int)((10999L - var5) / 1000L);
            if (0 >= var7) {
              ck.b(-62);
              this.n(10);
              ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, tn.field_cb), 0);
              break L2;
            } else {
              ((cs) this).field_ab.field_v = "" + var7;
              break L2;
            }
          }
          if (((cs) this).field_L) {
            if (null == wq.field_a) {
              this.n(param0 ^ 32728);
              ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), 0);
              if (null != wq.field_a) {
                if (!wq.field_a.field_k) {
                  return;
                } else {
                  this.n(10);
                  ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), param0 ^ 32722);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (null != wq.field_a) {
                if (wq.field_a.field_k) {
                  this.n(10);
                  ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), param0 ^ 32722);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (null != wq.field_a) {
              if (wq.field_a.field_k) {
                this.n(10);
                ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), param0 ^ 32722);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = param1;
        if (99 != var5) {
          if (var5 != 98) {
            if (param3 != -12215) {
              var7 = null;
              boolean discarded$3 = ((cs) this).a((kb) null, 104, 'ﾑ', 60);
              return this.a(param0, param1, param2, -12215);
            } else {
              return this.a(param0, param1, param2, -12215);
            }
          } else {
            boolean discarded$4 = ((cs) this).field_Z.a(11, (kb) this);
            return true;
          }
        } else {
          boolean discarded$5 = ((cs) this).field_gb.a(11, (kb) this);
          return true;
        }
    }

    private final fw a(String param0, int param1, qo param2) {
        fw var4 = new fw(param0, param2);
        var4.field_k = (kh) (Object) new nu();
        int var5 = ((cs) this).field_w - 6;
        ((cs) this).field_w = ((cs) this).field_w + 38;
        var4.a(15, -30 + ((cs) this).field_l, var5, 8192, 30);
        ((cs) this).a((byte) 10, (kb) (Object) var4);
        ((cs) this).e(0);
        int var6 = 121 % ((1 - param1) / 62);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new String[]{"proj_aviansie_axe/aviansie_axe", "proj_arrow/proj_arrow", "proj_cannonball/proj_cannonball", "proj_dart/proj_dart", "proj_grenwall_spikes/proj_grenwall_spikes", "proj_rock/proj_catapultloadimpact", "proj_spear/spear"};
        field_db = new kk[field_W.length];
        field_X = "This item can only be used on a goblin priest.";
        field_cb = new java.math.BigInteger("65537");
        field_eb = "Performance";
    }
}
