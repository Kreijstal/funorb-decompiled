/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static boolean field_b;
    private int field_f;
    private wh field_j;
    static String field_e;
    static boolean field_g;
    private int field_i;
    private e field_c;
    static String field_d;
    static String field_a;
    static String field_h;

    private final void a(int param0, Object param1, long param2, int param3) {
        eg var6 = null;
        int var7 = 0;
        int var8 = 0;
        kk var9 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((io) this).field_i < param0) {
          throw new IllegalStateException();
        } else {
          this.a(param2, false);
          ((io) this).field_f = ((io) this).field_f - param0;
          L0: while (true) {
            if (-1 >= (((io) this).field_f ^ -1)) {
              var6 = new eg(param1, param0);
              ((io) this).field_j.a(param2, (byte) -19, (br) (Object) var6);
              ((io) this).field_c.a((qa) (Object) var6, (byte) 94);
              var7 = 91 / ((param3 - 82) / 44);
              ((kk) (Object) var6).field_l = 0L;
              return;
            } else {
              var9 = (kk) (Object) ((io) this).field_c.a(false);
              this.a(1, var9);
              continue L0;
            }
          }
        }
    }

    io(int param0) {
        this(param0, param0);
    }

    final static void a(int param0, cj param1, cj param2, cj param3, cj param4) {
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (fh.field_m == null) {
          sq.field_N = false;
          if (!nh.field_m) {
            if (!sh.field_L) {
              var5 = pd.field_e;
              var7 = null;
              wh.a(6, wj.field_g, 0, var5, (String) null);
              ke.field_j = ua.field_E;
              fh.field_m = ec.field_b;
              ec.field_b.field_xb = (8355711 & qq.field_f.field_xb >> 1246958529) + wj.field_g + -(8355711 & wj.field_g >> 1019345601);
              ec.field_b.field_Db = (8355711 & qq.field_f.field_Db >> -459961663) + (wj.field_g + -(8355711 & wj.field_g >> 1406665377));
              ec.field_b.field_ob = wj.field_g - (8355711 & wj.field_g >> -1895684351) + (qq.field_f.field_ob >> 1889487393 & param0);
              lj.field_v = new cj(0L, param3);
              nq.field_t = new cj(0L, param2);
              re.field_a = new cj(0L, (cj) null);
              br.field_c = new cj(0L, param1);
              ec.field_b = new cj(0L, param4);
              ec.field_b.field_yb = w.field_A;
              br.field_c.a((byte) 50, ec.field_b);
              ua.field_E = new cj(0L, ke.field_j);
              br.field_c.a((byte) 50, ua.field_E);
              dp.field_c = new cj(0L, qq.field_f, bg.field_o);
              jk.field_d = new cj(0L, qq.field_f);
              lj.field_v.a((byte) 50, nq.field_t);
              lj.field_v.a((byte) 50, re.field_a);
              re.field_a.a((byte) 50, br.field_c);
              re.field_a.a((byte) 50, dp.field_c);
              re.field_a.a((byte) 50, jk.field_d);
              return;
            } else {
              var5 = qd.field_v;
              var7 = null;
              wh.a(6, wj.field_g, 0, var5, (String) null);
              ke.field_j = ua.field_E;
              fh.field_m = ec.field_b;
              ec.field_b.field_xb = (8355711 & qq.field_f.field_xb >> 1246958529) + wj.field_g + -(8355711 & wj.field_g >> 1019345601);
              ec.field_b.field_Db = (8355711 & qq.field_f.field_Db >> -459961663) + (wj.field_g + -(8355711 & wj.field_g >> 1406665377));
              ec.field_b.field_ob = wj.field_g - (8355711 & wj.field_g >> -1895684351) + (qq.field_f.field_ob >> 1889487393 & param0);
              lj.field_v = new cj(0L, param3);
              nq.field_t = new cj(0L, param2);
              re.field_a = new cj(0L, (cj) null);
              br.field_c = new cj(0L, param1);
              ec.field_b = new cj(0L, param4);
              ec.field_b.field_yb = w.field_A;
              br.field_c.a((byte) 50, ec.field_b);
              ua.field_E = new cj(0L, ke.field_j);
              br.field_c.a((byte) 50, ua.field_E);
              dp.field_c = new cj(0L, qq.field_f, bg.field_o);
              jk.field_d = new cj(0L, qq.field_f);
              lj.field_v.a((byte) 50, nq.field_t);
              lj.field_v.a((byte) 50, re.field_a);
              re.field_a.a((byte) 50, br.field_c);
              re.field_a.a((byte) 50, dp.field_c);
              re.field_a.a((byte) 50, jk.field_d);
              return;
            }
          } else {
            var5 = t.field_a;
            var7 = null;
            wh.a(6, wj.field_g, 0, var5, (String) null);
            ke.field_j = ua.field_E;
            fh.field_m = ec.field_b;
            ec.field_b.field_xb = (8355711 & qq.field_f.field_xb >> 1246958529) + wj.field_g + -(8355711 & wj.field_g >> 1019345601);
            ec.field_b.field_Db = (8355711 & qq.field_f.field_Db >> -459961663) + (wj.field_g + -(8355711 & wj.field_g >> 1406665377));
            ec.field_b.field_ob = wj.field_g - (8355711 & wj.field_g >> -1895684351) + (qq.field_f.field_ob >> 1889487393 & param0);
            lj.field_v = new cj(0L, param3);
            nq.field_t = new cj(0L, param2);
            re.field_a = new cj(0L, (cj) null);
            br.field_c = new cj(0L, param1);
            ec.field_b = new cj(0L, param4);
            ec.field_b.field_yb = w.field_A;
            br.field_c.a((byte) 50, ec.field_b);
            ua.field_E = new cj(0L, ke.field_j);
            br.field_c.a((byte) 50, ua.field_E);
            dp.field_c = new cj(0L, qq.field_f, bg.field_o);
            jk.field_d = new cj(0L, qq.field_f);
            lj.field_v.a((byte) 50, nq.field_t);
            lj.field_v.a((byte) 50, re.field_a);
            re.field_a.a((byte) 50, br.field_c);
            re.field_a.a((byte) 50, dp.field_c);
            re.field_a.a((byte) 50, jk.field_d);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        Object var5 = null;
        oi.a((String) null, param2, (byte) -67, param1);
        if (param0 != -21113) {
            Object var4 = null;
            io.a(3, (cj) null, (cj) null, (cj) null, (cj) null);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 8) {
          field_e = null;
          field_h = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_h = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static boolean a(int param0, int param1, byte param2, nm param3) {
        Object var5 = null;
        if (param2 <= -72) {
          if (param0 > -48) {
            if (param0 > -48) {
              if (640.0f * param3.field_d > (float)param0) {
                if (param3.field_d * 480.0f <= (float)param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var5 = null;
          boolean discarded$4 = io.a(-88, -65, (byte) 96, (nm) null);
          if (param0 > -48) {
            if (param0 > -48) {
              if (640.0f * param3.field_d > (float)param0) {
                if (param3.field_d * 480.0f <= (float)param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    private final void a(long param0, boolean param1) {
        kk var4 = null;
        Object var5 = null;
        var4 = (kk) (Object) ((io) this).field_j.a(param0, 72);
        this.a(1, var4);
        if (param1) {
          var5 = null;
          io.a(-49, (cj) null, (cj) null, (cj) null, (cj) null);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, kk param1) {
        if (param0 != 1) {
          return;
        } else {
          L0: {
            if (param1 != null) {
              param1.a(true);
              param1.a(param0 ^ -4563);
              ((io) this).field_f = ((io) this).field_f + param1.field_t;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static bo[] a(boolean param0) {
        if (!param0) {
          return null;
        } else {
          return new bo[]{wp.field_b, l.field_c, wi.field_h};
        }
    }

    final void a(Object param0, long param1, int param2) {
        this.a(param2, param0, param1, -107);
    }

    private io(int param0, int param1) {
        int var3 = 0;
        ((io) this).field_c = new e();
        ((io) this).field_f = param0;
        ((io) this).field_i = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((io) this).field_j = new wh(var3);
            }
          } else {
            ((io) this).field_j = new wh(var3);
          }
        }
    }

    final Object a(byte param0, long param1) {
        Object var5 = null;
        eg var6 = null;
        kk var7 = null;
        if (param0 > 121) {
          var7 = (kk) (Object) ((io) this).field_j.a(param1, 64);
          if (var7 != null) {
            var5 = var7.e(-111);
            if (var5 == null) {
              var7.a(true);
              var7.a(-4564);
              ((io) this).field_f = ((io) this).field_f + var7.field_t;
              return null;
            } else {
              L0: {
                if (var7.f(1000)) {
                  var6 = new eg(var5, var7.field_t);
                  ((io) this).field_j.a(var7.field_e, (byte) -86, (br) (Object) var6);
                  ((io) this).field_c.a((qa) (Object) var6, (byte) 109);
                  ((kk) (Object) var6).field_l = 0L;
                  var7.a(true);
                  var7.a(-4564);
                  break L0;
                } else {
                  ((io) this).field_c.a((qa) (Object) var7, (byte) 106);
                  var7.field_l = 0L;
                  break L0;
                }
              }
              return var5;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "ESC - cancel this line";
        field_d = "Resigned";
        field_h = "Show all game chat";
        field_a = "This option cannot be combined with the current '<%0>' setting.";
    }
}
