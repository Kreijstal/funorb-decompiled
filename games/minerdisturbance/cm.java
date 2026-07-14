/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends pi {
    static ae field_p;
    int field_s;
    static int field_r;
    static int field_o;
    static int field_q;
    static int field_n;

    final static void a(byte param0, boolean param1, int param2, hn param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        v.field_b[0] = dk.field_a.nextInt();
        v.field_b[1] = dk.field_a.nextInt();
        rf.field_c.field_o = 0;
        v.field_b[2] = (int)(gd.field_s >> -2078212512);
        v.field_b[3] = (int)gd.field_s;
        rf.field_c.a((byte) 81, v.field_b[0]);
        rf.field_c.a((byte) 125, v.field_b[1]);
        rf.field_c.a((byte) 119, v.field_b[2]);
        rf.field_c.a((byte) 114, v.field_b[3]);
        ij.a(true, rf.field_c);
        rf.field_c.b((byte) 125, param2);
        param3.a(rf.field_c, (byte) -87);
        sn.field_c.field_o = 0;
        if (param1) {
          L0: {
            sn.field_c.c(18, 25564);
            sn.field_c.field_o = sn.field_c.field_o + 2;
            var5 = sn.field_c.field_o;
            sn.field_c.a((byte) 106, mh.field_c);
            sn.field_c.b(-1, bj.field_a);
            var6 = 0;
            if (v.field_e) {
              var6 = var6 | 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (ei.field_L) {
              var6 = var6 | 4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!param4) {
              break L2;
            } else {
              var6 = var6 | 8;
              break L2;
            }
          }
          L3: {
            if (ag.field_d == null) {
              break L3;
            } else {
              var6 = var6 | 16;
              break L3;
            }
          }
          sn.field_c.c(var6, 25564);
          if (param0 == 6) {
            L4: {
              var7 = ag.a(bm.c(-90), true);
              if (var7 == null) {
                var7 = "";
                break L4;
              } else {
                break L4;
              }
            }
            sn.field_c.b(23446, var7);
            if (null == ag.field_d) {
              jg.a(kc.field_b, param0 + -108, rf.field_c, ph.field_g, (sb) (Object) sn.field_c);
              sn.field_c.b(sn.field_c.field_o - var5, param0 + -506270862);
              bk.a((byte) -64, -1);
              return;
            } else {
              sn.field_c.a(8, ag.field_d);
              jg.a(kc.field_b, param0 + -108, rf.field_c, ph.field_g, (sb) (Object) sn.field_c);
              sn.field_c.b(sn.field_c.field_o - var5, param0 + -506270862);
              bk.a((byte) -64, -1);
              return;
            }
          } else {
            return;
          }
        } else {
          L5: {
            sn.field_c.c(16, 25564);
            sn.field_c.field_o = sn.field_c.field_o + 2;
            var5 = sn.field_c.field_o;
            sn.field_c.a((byte) 106, mh.field_c);
            sn.field_c.b(-1, bj.field_a);
            var6 = 0;
            if (v.field_e) {
              var6 = var6 | 1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (ei.field_L) {
              var6 = var6 | 4;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!param4) {
              break L7;
            } else {
              var6 = var6 | 8;
              break L7;
            }
          }
          L8: {
            if (ag.field_d == null) {
              break L8;
            } else {
              var6 = var6 | 16;
              break L8;
            }
          }
          sn.field_c.c(var6, 25564);
          if (param0 == 6) {
            L9: {
              var7 = ag.a(bm.c(-90), true);
              if (var7 == null) {
                var7 = "";
                break L9;
              } else {
                break L9;
              }
            }
            sn.field_c.b(23446, var7);
            if (null == ag.field_d) {
              jg.a(kc.field_b, param0 + -108, rf.field_c, ph.field_g, (sb) (Object) sn.field_c);
              sn.field_c.b(sn.field_c.field_o - var5, param0 + -506270862);
              bk.a((byte) -64, -1);
              return;
            } else {
              sn.field_c.a(8, ag.field_d);
              jg.a(kc.field_b, param0 + -108, rf.field_c, ph.field_g, (sb) (Object) sn.field_c);
              sn.field_c.b(sn.field_c.field_o - var5, param0 + -506270862);
              bk.a((byte) -64, -1);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            field_o = -3;
            return rd.a((byte) 27, bm.c(-118));
        }
        return rd.a((byte) 27, bm.c(-118));
    }

    cm(int param0) {
        ((cm) this).field_s = param0;
    }

    final static void e(int param0) {
        ld var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        if (param0 != 24683) {
          return;
        } else {
          var1 = sn.field_c;
          L0: while (true) {
            if (!ub.a(14921)) {
              return;
            } else {
              var1.d((byte) -51, 8);
              var1.field_o = var1.field_o + 1;
              var2 = var1.field_o + 1;
              pj.a((byte) 119, var1);
              sn.field_c.g(-1, var1.field_o + -var2);
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 18) {
            field_p = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ae();
        field_n = 0;
    }
}
