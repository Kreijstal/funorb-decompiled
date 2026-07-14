/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ph extends qj implements ga {
    static String[] field_nb;
    private fa field_kb;
    private qe field_fb;
    static String field_gb;
    private boolean field_ib;
    static String field_mb;
    private boolean field_hb;
    private boolean field_jb;
    private boolean field_lb;

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        var3 = 1 << param2;
        if ((var3 & eb.field_c) == 0) {
          eb.field_c = eb.field_c | var3;
          if (!param1) {
            jg.field_H = jg.field_H | var3;
            pk.field_a.b(90, (rf) (Object) new wf(param2));
            if (!a.field_a) {
              if (wk.a(112)) {
                bh.field_e.b(86, (rf) (Object) new hb(param2, param0, ja.field_d, oe.field_a, il.field_i, rj.field_h));
                return;
              } else {
                hb discarded$2 = rh.a(param0, rj.field_h, ja.field_d, il.field_i, oe.field_a, -1893600464, 4, param2);
                return;
              }
            } else {
              return;
            }
          } else {
            ph.a(-49, false, 94);
            jg.field_H = jg.field_H | var3;
            pk.field_a.b(90, (rf) (Object) new wf(param2));
            if (!a.field_a) {
              if (wk.a(112)) {
                bh.field_e.b(86, (rf) (Object) new hb(param2, param0, ja.field_d, oe.field_a, il.field_i, rj.field_h));
                return;
              } else {
                hb discarded$3 = rh.a(param0, rj.field_h, ja.field_d, il.field_i, oe.field_a, -1893600464, 4, param2);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void o(int param0) {
        kj var2 = null;
        ((ph) this).field_kb.b(2121792, 2, 4210752);
        var2 = new kj((ph) this, ((ph) this).field_fb, cf.field_p);
        if (param0 < 121) {
          return;
        } else {
          var2.a(fd.field_b, 13759, 15);
          ((ph) this).c(20317, (uj) (Object) var2);
          return;
        }
    }

    public static void m(int param0) {
        field_mb = null;
        field_nb = null;
        field_gb = null;
        if (param0 != -1) {
            field_gb = null;
        }
    }

    final void n(int param0) {
        int var2 = 0;
        if (((ph) this).field_G) {
          ((ph) this).field_G = false;
          var2 = -21 / ((param0 - -47) / 42);
          if (!((ph) this).field_ib) {
            if (!((ph) this).field_lb) {
              return;
            } else {
              ng.h((byte) -58);
              return;
            }
          } else {
            vg.a(32083);
            return;
          }
        } else {
          return;
        }
    }

    public void a(dk param0, int param1, boolean param2, int param3, int param4) {
        if (((ph) this).field_hb) {
          fd.a(3, 0);
          ((ph) this).n(125);
          if (!param2) {
            return;
          } else {
            ph.a(-104, false, -124);
            return;
          }
        } else {
          ef.a("tochangedisplayname.ws", ll.b(90), 100);
          if (!param2) {
            return;
          } else {
            ph.a(-104, false, -124);
            return;
          }
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        if (param2 == -90) {
          if ((param3 ^ -1) == -14) {
            ((ph) this).n(108);
            return true;
          } else {
            return super.a(param0, param1, (byte) -90, param3);
          }
        } else {
          ((ph) this).field_jb = false;
          if ((param3 ^ -1) == -14) {
            ((ph) this).n(108);
            return true;
          } else {
            return super.a(param0, param1, (byte) -90, param3);
          }
        }
    }

    final void a(String param0, int param1, boolean param2) {
        kj var5 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kj stackIn_26_0 = null;
        kj stackIn_27_0 = null;
        kj stackIn_28_0 = null;
        String stackIn_28_1 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        kj stackOut_25_0 = null;
        kj stackOut_27_0 = null;
        String stackOut_27_1 = null;
        kj stackOut_26_0 = null;
        String stackOut_26_1 = null;
        if (((ph) this).field_jb) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param2) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          L1: {
            ((ph) this).field_jb = stackIn_6_1 != 0;
            stackOut_6_0 = this;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (param1 != 256) {
              stackOut_8_0 = this;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L1;
            } else {
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
          }
          ((ph) this).field_hb = stackIn_9_1 != 0;
          ((ph) this).field_kb.b(8405024, 2, 4210752);
          var5 = new kj((ph) this, ((ph) this).field_fb, param0);
          if ((param1 ^ -1) == -6) {
            var5.a(hd.field_i, 13759, 11);
            var5.a(bg.field_b, 13759, 17);
            if (3 == param1) {
              var5.a(kf.field_u, 13759, 7);
              ((ph) this).c(20317, (uj) (Object) var5);
              return;
            } else {
              if ((param1 ^ -1) == -5) {
                var5.a(s.field_d, 13759, 8);
                ((ph) this).c(20317, (uj) (Object) var5);
                return;
              } else {
                if ((param1 ^ -1) != -7) {
                  if ((param1 ^ -1) == -10) {
                    dk discarded$4 = var5.a((byte) 123, (qg) this, db.field_B);
                    ((ph) this).c(20317, (uj) (Object) var5);
                    return;
                  } else {
                    ((ph) this).c(20317, (uj) (Object) var5);
                    return;
                  }
                } else {
                  var5.a(dk.field_w, 13759, 9);
                  ((ph) this).c(20317, (uj) (Object) var5);
                  return;
                }
              }
            }
          } else {
            if (256 != param1) {
              L2: {
                stackOut_25_0 = (kj) var5;
                stackIn_27_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (((ph) this).field_ib) {
                  stackOut_27_0 = (kj) (Object) stackIn_27_0;
                  stackOut_27_1 = ma.field_g;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  break L2;
                } else {
                  stackOut_26_0 = (kj) (Object) stackIn_26_0;
                  stackOut_26_1 = dk.field_t;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  break L2;
                }
              }
              ((kj) (Object) stackIn_28_0).a(stackIn_28_1, 13759, -1);
              if (3 == param1) {
                var5.a(kf.field_u, 13759, 7);
                ((ph) this).c(20317, (uj) (Object) var5);
                return;
              } else {
                if ((param1 ^ -1) == -5) {
                  var5.a(s.field_d, 13759, 8);
                  ((ph) this).c(20317, (uj) (Object) var5);
                  return;
                } else {
                  if ((param1 ^ -1) != -7) {
                    if ((param1 ^ -1) == -10) {
                      dk discarded$5 = var5.a((byte) 123, (qg) this, db.field_B);
                      ((ph) this).c(20317, (uj) (Object) var5);
                      return;
                    } else {
                      ((ph) this).c(20317, (uj) (Object) var5);
                      return;
                    }
                  } else {
                    var5.a(dk.field_w, 13759, 9);
                    ((ph) this).c(20317, (uj) (Object) var5);
                    return;
                  }
                }
              }
            } else {
              dk discarded$6 = var5.a((byte) 88, (qg) this, ma.field_g);
              if (3 == param1) {
                var5.a(kf.field_u, 13759, 7);
                ((ph) this).c(20317, (uj) (Object) var5);
                return;
              } else {
                if ((param1 ^ -1) == -5) {
                  var5.a(s.field_d, 13759, 8);
                  ((ph) this).c(20317, (uj) (Object) var5);
                  return;
                } else {
                  if ((param1 ^ -1) != -7) {
                    if ((param1 ^ -1) == -10) {
                      dk discarded$7 = var5.a((byte) 123, (qg) this, db.field_B);
                      ((ph) this).c(20317, (uj) (Object) var5);
                      return;
                    } else {
                      ((ph) this).c(20317, (uj) (Object) var5);
                      return;
                    }
                  } else {
                    var5.a(dk.field_w, 13759, 9);
                    ((ph) this).c(20317, (uj) (Object) var5);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    ph(tc param0, qe param1, String param2, boolean param3, boolean param4) {
        super(param0, (uj) (Object) new kj((ph) null, param1, param2), 77, 10, 10);
        ((ph) this).field_hb = false;
        ((ph) this).field_jb = false;
        ((ph) this).field_lb = param4 ? true : false;
        ((ph) this).field_ib = param3 ? true : false;
        ((ph) this).field_fb = param1;
        ((ph) this).field_kb = new fa(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ph) this).field_kb.field_D = true;
        ((ph) this).a(true, (uj) (Object) ((ph) this).field_kb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "If you do nothing the game will revert to normal view in <%0> second.";
        field_mb = "Confirm Email:";
    }
}
