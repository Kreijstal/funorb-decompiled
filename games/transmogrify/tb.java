/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static int field_a;
    static kg field_c;
    static ti field_e;
    static int[] field_d;
    static ti[] field_b;

    final static void a(kk param0, int param1, boolean param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        Object var8 = null;
        mf.field_c[0] = d.field_c.nextInt();
        mf.field_c[1] = d.field_c.nextInt();
        mf.field_c[3] = (int)fd.field_g;
        mf.field_c[2] = (int)(fd.field_g >> 1345868064);
        d.field_d.field_h = 0;
        d.field_d.a(-96, mf.field_c[0]);
        d.field_d.a(-124, mf.field_c[1]);
        d.field_d.a(-105, mf.field_c[2]);
        d.field_d.a(-103, mf.field_c[3]);
        gb.a(d.field_d, true);
        d.field_d.c(param1, -159688920);
        param0.a((byte) -115, d.field_d);
        ff.field_D.field_h = 0;
        if (param3) {
          L0: {
            ff.field_D.f(6389, 18);
            ff.field_D.field_h = ff.field_D.field_h + 2;
            var5 = ff.field_D.field_h;
            ff.field_D.a(-102, cl.field_w);
            ff.field_D.b(1908720528, qb.field_k);
            var6 = 0;
            if (wd.field_g) {
              var6 = var6 | 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (kc.field_D) {
              var6 = var6 | 4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param2) {
              var6 = var6 | 8;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null == e.field_I) {
              break L3;
            } else {
              var6 = var6 | 16;
              break L3;
            }
          }
          if (param4 >= 25) {
            L4: {
              ff.field_D.f(6389, var6);
              var7 = wk.a(ha.b(99), (byte) -45);
              if (var7 == null) {
                var7 = "";
                break L4;
              } else {
                break L4;
              }
            }
            ff.field_D.a(-116, var7);
            if (e.field_I != null) {
              ff.field_D.a(e.field_I, 127);
              bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -116, d.field_d);
              ff.field_D.b(-120, ff.field_D.field_h - var5);
              rb.a(-1, -377);
              return;
            } else {
              bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -116, d.field_d);
              ff.field_D.b(-120, ff.field_D.field_h - var5);
              rb.a(-1, -377);
              return;
            }
          } else {
            L5: {
              var8 = null;
              tb.a((kk) null, -124, true, true, 31);
              ff.field_D.f(6389, var6);
              var7 = wk.a(ha.b(99), (byte) -45);
              if (var7 == null) {
                var7 = "";
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              ff.field_D.a(-116, var7);
              if (e.field_I == null) {
                break L6;
              } else {
                ff.field_D.a(e.field_I, 127);
                break L6;
              }
            }
            bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -116, d.field_d);
            ff.field_D.b(-120, ff.field_D.field_h - var5);
            rb.a(-1, -377);
            return;
          }
        } else {
          L7: {
            ff.field_D.f(6389, 16);
            ff.field_D.field_h = ff.field_D.field_h + 2;
            var5 = ff.field_D.field_h;
            ff.field_D.a(-102, cl.field_w);
            ff.field_D.b(1908720528, qb.field_k);
            var6 = 0;
            if (wd.field_g) {
              var6 = var6 | 1;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (kc.field_D) {
              var6 = var6 | 4;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (param2) {
              var6 = var6 | 8;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (null == e.field_I) {
              break L10;
            } else {
              var6 = var6 | 16;
              break L10;
            }
          }
          if (param4 < 25) {
            L11: {
              var8 = null;
              tb.a((kk) null, -124, true, true, 31);
              ff.field_D.f(6389, var6);
              var7 = wk.a(ha.b(99), (byte) -45);
              if (var7 == null) {
                var7 = "";
                break L11;
              } else {
                break L11;
              }
            }
            ff.field_D.a(-116, var7);
            if (e.field_I == null) {
              bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -116, d.field_d);
              ff.field_D.b(-120, ff.field_D.field_h - var5);
              rb.a(-1, -377);
              return;
            } else {
              ff.field_D.a(e.field_I, 127);
              bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -116, d.field_d);
              ff.field_D.b(-120, ff.field_D.field_h - var5);
              rb.a(-1, -377);
              return;
            }
          } else {
            L12: {
              ff.field_D.f(6389, var6);
              var7 = wk.a(ha.b(99), (byte) -45);
              if (var7 == null) {
                var7 = "";
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              ff.field_D.a(-116, var7);
              if (e.field_I == null) {
                break L13;
              } else {
                ff.field_D.a(e.field_I, 127);
                break L13;
              }
            }
            bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -116, d.field_d);
            ff.field_D.b(-120, ff.field_D.field_h - var5);
            rb.a(-1, -377);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        fl.field_c = param1 ? true : false;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        hi.a(0, var4, var2, var3, param0);
    }

    static {
    }
}
