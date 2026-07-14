/*
 * Decompiled by CFR-JS 0.4.0.
 */
class af extends ta implements qh {
    private ng field_kb;
    static int field_ob;
    private boolean field_qb;
    static int field_jb;
    private boolean field_lb;
    private boolean field_nb;
    private ee field_pb;
    private boolean field_mb;

    final void d(boolean param0) {
        ((af) this).field_kb.a(0, 4210752, 2121792);
        ui var2 = new ui((af) this, ((af) this).field_pb, dg.field_E);
        var2.a(sh.field_h, 15, -14);
        if (param0) {
            lk var3 = (lk) null;
            boolean discarded$0 = ((af) this).a('9', (byte) -80, 48, (lk) null);
        }
        ((af) this).c((lk) (Object) var2, (byte) 110);
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        if (param1 >= -99) {
            ((af) this).d(true);
        }
        if (13 == param2) {
            ((af) this).s(-122);
            return true;
        }
        return this.a(param0, (byte) -106, param2, param3);
    }

    public void a(int param0, int param1, int param2, hl param3, int param4) {
        if (((af) this).field_qb) {
            gh.a(3, 31888);
            ((af) this).s(13);
        } else {
            pa.a(mk.g(-125), "tochangedisplayname.ws", -61);
        }
        int var6 = -72 % ((-62 - param1) / 32);
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Main.field_T;
        var3 = 0;
        var4 = qe.field_E;
        L0: while (true) {
          if (var3 >= me.field_a.length) {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_ob = -30;
                break L1;
              }
            }
            return -1;
          } else {
            var5 = wd.field_d[var3];
            if (-1 < (var5 ^ -1)) {
              var4 = var4 + sa.field_d;
              var3++;
              continue L0;
            } else {
              var6 = hj.a(false, true, me.field_a[var3]);
              var4 = var4 + e.field_i;
              var7 = -(var6 >> -1487873151) + dl.field_g;
              if (!vc.a(tl.field_b - -(a.field_o << -1632356223), param2, param0, var4, var7 + -tc.field_b, 0, var6 - -(tc.field_b << 1230477249))) {
                var4 = var4 + (e.field_i + ((a.field_o << -1916794559) + tl.field_b));
                var3++;
                continue L0;
              } else {
                return var5;
              }
            }
          }
        }
    }

    final void s(int param0) {
        int var2 = 0;
        var2 = 115 % ((param0 - -41) / 41);
        if (!((af) this).field_E) {
          return;
        } else {
          L0: {
            ((af) this).field_E = false;
            if (((af) this).field_lb) {
              ag.a(-9145);
              break L0;
            } else {
              if (((af) this).field_nb) {
                ff.b(-96);
                break L0;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    final static qj r(int param0) {
        if (param0 != 77) {
            return (qj) null;
        }
        return gh.field_k;
    }

    final static java.awt.Container t(int param0) {
        if (null != q.field_g) {
            return (java.awt.Container) (Object) q.field_g;
        }
        if (param0 != 3) {
            return (java.awt.Container) null;
        }
        return (java.awt.Container) (Object) mk.g(-120);
    }

    af(j param0, ee param1, String param2, boolean param3, boolean param4) {
        super(param0, (lk) (Object) new ui((af) null, param1, param2), 77, 10, 10);
        ((af) this).field_nb = param4 ? true : false;
        ((af) this).field_mb = false;
        ((af) this).field_lb = param3 ? true : false;
        ((af) this).field_pb = param1;
        ((af) this).field_qb = false;
        ((af) this).field_kb = new ng(13, 50, 274, 30, 15, 2113632, 4210752);
        ((af) this).field_kb.field_I = true;
        ((af) this).b((lk) (Object) ((af) this).field_kb, (byte) 118);
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 < 33) {
            CharSequence var5 = (CharSequence) null;
            int discarded$0 = af.a(-80, (CharSequence) null, (byte) 110);
        }
        if (param2) {
            var4 += 4;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        if (!(!param1)) {
            var4++;
        }
        return sb.field_b[var4];
    }

    final static void a(ee param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, kc[] param11, int param12, kc[] param13, int param14, int param15, ee param16, int param17, int param18, int param19, kc[] param20) {
        int var21 = 82 / ((-59 - param4) / 59);
        me.a(param0, param5, param16, param8, param3, param14, param9, new vg(param13), param12, param10, param2, param15, -26024, param17, param6, param7, new vg(param20), param18, param19, param1, new vg(param11));
    }

    final static int a(int param0, CharSequence param1, byte param2) {
        if (param2 != 54) {
            return -11;
        }
        return bd.a(true, param1, (byte) 122, param0);
    }

    final void a(String param0, byte param1, int param2) {
        int var5 = 0;
        ui var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ui stackIn_11_0 = null;
        ui stackIn_12_0 = null;
        ui stackIn_13_0 = null;
        String stackIn_13_1 = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ui stackOut_10_0 = null;
        ui stackOut_12_0 = null;
        String stackOut_12_1 = null;
        ui stackOut_11_0 = null;
        String stackOut_11_1 = null;
        var5 = Main.field_T;
        if (!((af) this).field_mb) {
          L0: {
            if (param1 == -109) {
              break L0;
            } else {
              qj discarded$3 = af.r(87);
              break L0;
            }
          }
          L1: {
            stackOut_4_0 = this;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (param2 != 256) {
              stackOut_6_0 = this;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          L2: {
            ((af) this).field_qb = stackIn_7_1 != 0;
            ((af) this).field_mb = true;
            ((af) this).field_kb.a(param1 + 109, 4210752, 8405024);
            var6 = new ui((af) this, ((af) this).field_pb, param0);
            if (param2 == 5) {
              var6.a(na.field_p, 11, -14);
              var6.a(pg.field_f, 17, -14);
              break L2;
            } else {
              if ((param2 ^ -1) != -257) {
                L3: {
                  stackOut_10_0 = (ui) var6;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (!((af) this).field_lb) {
                    stackOut_12_0 = (ui) (Object) stackIn_12_0;
                    stackOut_12_1 = uc.field_r;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L3;
                  } else {
                    stackOut_11_0 = (ui) (Object) stackIn_11_0;
                    stackOut_11_1 = tc.field_c;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L3;
                  }
                }
                ((ui) (Object) stackIn_13_0).a((String) (Object) stackIn_13_1, -1, -14);
                break L2;
              } else {
                hl discarded$4 = var6.a((pl) this, true, tc.field_c);
                break L2;
              }
            }
          }
          L4: {
            if (param2 != 3) {
              if (param2 == 4) {
                var6.a(s.field_a, 8, -14);
                ((af) this).c((lk) (Object) var6, (byte) 95);
                break L4;
              } else {
                if (-7 != (param2 ^ -1)) {
                  if (param2 == 9) {
                    hl discarded$5 = var6.a((pl) this, true, wf.field_a);
                    ((af) this).c((lk) (Object) var6, (byte) 95);
                    break L4;
                  } else {
                    ((af) this).c((lk) (Object) var6, (byte) 95);
                    break L4;
                  }
                } else {
                  var6.a(jh.field_a, 9, -14);
                  var6.a(s.field_a, 8, -14);
                  break L4;
                }
              }
            } else {
              var6.a(sk.field_a, 7, -14);
              ((af) this).c((lk) (Object) var6, (byte) 95);
              break L4;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = 0;
    }
}
