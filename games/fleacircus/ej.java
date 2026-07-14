/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_b;
    static ok[] field_a;
    private ag field_e;
    private rh field_f;
    static int[] field_c;
    private rh field_d;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        param1 = param1 * 16;
        param0 = param0 * 16;
        param5 = param5 * 16;
        param4 = param4 * 16;
        gb.g(param4, param1, param0, param5, 16711680, param2 + 96);
        gb.e(param4, param1, param0, param5, 16711680, param2 + 128);
        int var6 = 1 / ((17 - param3) / 34);
    }

    final aj a(int param0, int param1) {
        aj var3 = null;
        aj var3_ref = null;
        byte[] var4 = null;
        var3 = (aj) ((ej) this).field_e.a((byte) -92, (long)param1);
        if (var3 == null) {
          L0: {
            if (param1 < 32768) {
              var4 = ((ej) this).field_d.a(1, (byte) 124, param1);
              break L0;
            } else {
              var4 = ((ej) this).field_f.a(1, (byte) 123, 32767 & param1);
              break L0;
            }
          }
          var3_ref = new aj();
          if (var4 == null) {
            if (param1 >= param0) {
              var3_ref.h(0);
              ((ej) this).field_e.a((Object) (Object) var3_ref, (byte) -122, (long)param1);
              return var3_ref;
            } else {
              ((ej) this).field_e.a((Object) (Object) var3_ref, (byte) -122, (long)param1);
              return var3_ref;
            }
          } else {
            var3_ref.a(new ni(var4), 4);
            if (param1 < param0) {
              ((ej) this).field_e.a((Object) (Object) var3_ref, (byte) -122, (long)param1);
              return var3_ref;
            } else {
              var3_ref.h(0);
              ((ej) this).field_e.a((Object) (Object) var3_ref, (byte) -122, (long)param1);
              return var3_ref;
            }
          }
        } else {
          return var3;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        j.field_f = wi.field_p.field_b;
        if (-1 == (fleas.field_E ^ -1)) {
          if (tj.field_a >= 15) {
            if (!qh.c((byte) 55)) {
              if (-1 > (wc.field_q ^ -1)) {
                L0: {
                  var1 = tj.field_a;
                  if (tj.field_a >= nl.field_c[fleas.field_E].length) {
                    var1 = -1 + nl.field_c[fleas.field_E].length;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = hf.field_e.length * var1 / ia.field_m[fleas.field_E].length;
                if (param0 != -39) {
                  return;
                } else {
                  k.a(0, hf.field_e[var2]);
                  lk.field_D.field_k = false;
                  si.field_y.field_k = true;
                  c.field_U = false;
                  uc.b((byte) 84);
                  rg.b(4);
                  em.field_b = 6000;
                  fb.field_e = new int[100];
                  oa.field_n = true;
                  pg.field_f = -60;
                  qh.field_y = -250;
                  jk.field_l = 0;
                  lj.field_c = new int[100];
                  mg.field_d = -1;
                  nc.field_a = new int[100];
                  uf.field_h = 0;
                  mh.field_u = 1;
                  var3 = 0;
                  L1: while (true) {
                    if (100 <= var3) {
                      return;
                    } else {
                      nc.field_a[var3] = -1000;
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                bj.field_m = bc.field_V;
                oa.a(7, false, -72);
                return;
              }
            } else {
              bj.field_m = bc.field_V;
              oa.a(7, false, -72);
              return;
            }
          } else {
            L2: {
              var1 = tj.field_a;
              if (tj.field_a >= nl.field_c[fleas.field_E].length) {
                var1 = -1 + nl.field_c[fleas.field_E].length;
                break L2;
              } else {
                break L2;
              }
            }
            var2 = hf.field_e.length * var1 / ia.field_m[fleas.field_E].length;
            if (param0 != -39) {
              return;
            } else {
              k.a(0, hf.field_e[var2]);
              lk.field_D.field_k = false;
              si.field_y.field_k = true;
              c.field_U = false;
              uc.b((byte) 84);
              rg.b(4);
              em.field_b = 6000;
              fb.field_e = new int[100];
              oa.field_n = true;
              pg.field_f = -60;
              qh.field_y = -250;
              jk.field_l = 0;
              lj.field_c = new int[100];
              mg.field_d = -1;
              nc.field_a = new int[100];
              uf.field_h = 0;
              mh.field_u = 1;
              var3 = 0;
              L3: while (true) {
                if (100 <= var3) {
                  return;
                } else {
                  nc.field_a[var3] = -1000;
                  var3++;
                  continue L3;
                }
              }
            }
          }
        } else {
          L4: {
            var1 = tj.field_a;
            if (tj.field_a >= nl.field_c[fleas.field_E].length) {
              var1 = -1 + nl.field_c[fleas.field_E].length;
              break L4;
            } else {
              break L4;
            }
          }
          var2 = hf.field_e.length * var1 / ia.field_m[fleas.field_E].length;
          if (param0 != -39) {
            return;
          } else {
            k.a(0, hf.field_e[var2]);
            lk.field_D.field_k = false;
            si.field_y.field_k = true;
            c.field_U = false;
            uc.b((byte) 84);
            rg.b(4);
            em.field_b = 6000;
            fb.field_e = new int[100];
            oa.field_n = true;
            pg.field_f = -60;
            qh.field_y = -250;
            jk.field_l = 0;
            lj.field_c = new int[100];
            mg.field_d = -1;
            nc.field_a = new int[100];
            uf.field_h = 0;
            mh.field_u = 1;
            var3 = 0;
            L5: while (true) {
              if (100 <= var3) {
                return;
              } else {
                nc.field_a[var3] = -1000;
                var3++;
                continue L5;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        ak.field_a.d((qa) (Object) new rb(), 26034);
        if (param0 != 16) {
            ej.a(17);
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1) {
            return;
        }
        field_c = null;
    }

    private ej() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You are unable to access this level yet.";
        field_a = new ok[15];
        field_c = new int[8192];
    }
}
