/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends jd {
    static String field_k;
    static ob field_g;
    static String[] field_h;
    static db field_i;
    static String field_f;
    private java.nio.ByteBuffer field_d;
    static String[] field_l;
    static int field_e;
    static String field_j;

    final static void a(String param0, bk param1, jb param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TetraLink.field_J;
          if (!param3) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (var7 >= param0.length()) {
            return;
          } else {
            L2: {
              var8 = param0.charAt(var7);
              if (var8 != 60) {
                break L2;
              } else {
                var6 = param1.field_j[0] + (var5 >> -117301816) + param2.b(param0.substring(0, var7));
                break L2;
              }
            }
            L3: {
              if (-1 == var6) {
                L4: {
                  if (var8 == 32) {
                    var5 = var5 + param4;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                param1.field_j[var7] = param1.field_j[0] + ((var5 >> 275886856) + param2.b(param0.substring(0, 1 + var7))) + -param2.a((char) var8);
                break L3;
              } else {
                param1.field_j[var7] = var6;
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final byte[] a(int param0) {
        byte[] var4 = new byte[((la) this).field_d.capacity()];
        byte[] var2 = var4;
        java.nio.Buffer discarded$0 = ((la) this).field_d.position(0);
        java.nio.ByteBuffer discarded$1 = ((la) this).field_d.get(var4);
        int var3 = -92 % ((29 - param0) / 63);
        return var4;
    }

    final static String a(long param0, boolean param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = TetraLink.field_J;
        if (!param1) {
            Object var12 = null;
            rj discarded$0 = la.a((String) null, -122);
        }
        if (param0 <= 0L) {
            return null;
        }
        if (6582952005840035281L <= param0) {
            return null;
        }
        if (param0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (-1L != (var4 ^ -1L)) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = nc.field_a[(int)(var7 + -(param0 * 37L))];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$1 = var6.append(var9);
        }
        StringBuilder discarded$2 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final void a(int param0, byte[] param1) {
        if (param0 != -10543) {
            field_f = null;
        }
        ((la) this).field_d = java.nio.ByteBuffer.allocateDirect(param1.length);
        java.nio.Buffer discarded$0 = ((la) this).field_d.position(0);
        java.nio.ByteBuffer discarded$1 = ((la) this).field_d.put(param1);
    }

    final static rj a(String param0, int param1) {
        if (oa.field_y.c(false)) {
            if (!param0.equals((Object) (Object) oa.field_y.a((byte) 72))) {
                oa.field_y = il.a(param0, 14781);
            }
        }
        if (param1 != 0) {
            return null;
        }
        return oa.field_y;
    }

    public static void c(int param0) {
        if (param0 != 37) {
            la.c(98);
        }
        field_k = null;
        field_j = null;
        field_l = null;
        field_h = null;
        field_i = null;
        field_g = null;
        field_f = null;
    }

    la() {
    }

    final static void d(int param0) {
        if (cd.field_c == null) {
          L0: {
            co.field_p = new String[11];
            co.field_p[7] = am.field_d;
            co.field_p[3] = lf.field_c;
            co.field_p[2] = bh.field_o;
            co.field_p[0] = pg.field_b;
            co.field_p[9] = jm.field_e;
            co.field_p[8] = ph.field_x;
            cd.field_c = new String[24];
            co.field_p[6] = fo.field_db;
            co.field_p[4] = lf.field_c;
            co.field_p[1] = lf.field_c;
            cd.field_c[18] = qk.field_a;
            cd.field_c[5] = am.field_d;
            cd.field_c[6] = vd.field_g;
            cd.field_c[15] = tg.field_c;
            cd.field_c[7] = pg.field_b;
            cd.field_c[23] = fa.field_a;
            cd.field_c[0] = gl.field_q;
            cd.field_c[8] = ci.field_A;
            cd.field_c[16] = ec.field_f;
            if (param0 < -106) {
              break L0;
            } else {
              String discarded$1 = la.a(126L, false);
              break L0;
            }
          }
          cd.field_c[2] = lm.field_l;
          cd.field_c[11] = cl.field_a;
          cd.field_c[19] = bo.field_h;
          cd.field_c[9] = kj.field_a;
          cd.field_c[4] = fo.field_db;
          cd.field_c[10] = field_f;
          cd.field_c[14] = en.field_M;
          cd.field_c[1] = dl.field_n;
          cd.field_c[17] = md.field_z;
          cd.field_c[3] = ph.field_x;
          cd.field_c[13] = ng.field_E;
          cd.field_c[12] = sd.field_ob;
          cd.field_c[21] = ka.field_g[1];
          cd.field_c[20] = ka.field_g[0];
          cd.field_c[22] = hl.field_ub;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"All scores", "My scores", "Best each"};
        field_k = "Loading models";
        field_f = "Offer draw";
        field_l = new String[]{"Turn time", "Rated game?", "Allow spectators?"};
        field_i = new db(9, 0, 4, 1);
        field_j = "Respect";
    }
}
