/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends tm {
    static String field_C;
    static String field_A;
    static String field_B;
    static int field_D;
    static nu field_F;
    static int field_E;

    jo(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static kg[] a(sj param0, int param1, String param2, String param3) {
        int var4 = param0.b(param2, -1);
        if (param1 != 17369) {
            jo.g(27);
        }
        int var5 = param0.a((byte) -121, param3, var4);
        return ua.a(var4, var5, param0, false);
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        hd var6 = null;
        int var7 = 0;
        int var8 = 0;
        tv var9 = null;
        L0: {
          var8 = Kickabout.field_G;
          if (pg.field_b < rb.field_Bb) {
            pg.field_b = pg.field_b + 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (na.field_Ab != ea.field_f.field_e) {
            c.field_c = c.field_c + (ea.field_f.field_e - na.field_Ab);
            na.field_Ab = ea.field_f.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        if (pg.field_b > 0) {
          L2: {
            eq.a(0);
            g.field_a.b(0, param0);
            if (null == la.field_a) {
              break L2;
            } else {
              if (iw.field_l) {
                boolean discarded$1 = la.field_a.a(g.field_a.field_T, 31947, g.field_a.field_F, param0);
                break L2;
              } else {
                la.field_a = null;
                break L2;
              }
            }
          }
          var4 = 52 / ((-26 - param3) / 46);
          var5_int = 0;
          L3: while (true) {
            if ((var5_int ^ -1) <= -6) {
              L4: {
                if (0 == uq.field_a.field_sb) {
                  break L4;
                } else {
                  ck.field_b = new rb(uq.field_a.field_F, uq.field_a.field_T, uq.field_a.field_q, uq.field_a.field_mb, param2, tv.field_e, ai.field_H, hl.field_f, dw.field_e, hs.field_d, ul.field_c, (String) null, 0L);
                  break L4;
                }
              }
              L5: {
                var9 = rb.a(param1, sh.field_c, (byte) 26, eb.field_b);
                if (var9 == null) {
                  break L5;
                } else {
                  bf.a(var9, (byte) -60);
                  break L5;
                }
              }
              L6: {
                var5 = fn.f(-3);
                if (var5 != null) {
                  sn.field_e = var5;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              var6 = mr.field_W[var5_int];
              if (var6 != null) {
                L7: {
                  if (var6.field_sb == 0) {
                    break L7;
                  } else {
                    kr.a(var6, true, var5_int);
                    break L7;
                  }
                }
                var7 = r.a(0, var5_int);
                av.field_b[var5_int].field_N = il.field_d[var7];
                ds.field_a[var5_int].field_E = tf.field_h[var7];
                var5_int++;
                continue L3;
              } else {
                var5_int++;
                continue L3;
              }
            }
          }
        } else {
          return;
        }
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
            field_F = null;
        }
        return new li((Object) (Object) nt.k(39));
    }

    public static void g(int param0) {
        field_C = null;
        field_F = null;
        if (param0 != 0) {
            return;
        }
        field_B = null;
        field_A = null;
    }

    final static boolean a(tf param0, boolean param1) {
        gn var2 = null;
        int var3 = 0;
        var3 = Kickabout.field_G;
        if (!param1) {
          var2 = param0.g(24009);
          L0: while (true) {
            L1: {
              if (!(var2 instanceof ak)) {
                break L1;
              } else {
                if (!(var2.field_d instanceof ak)) {
                  break L1;
                } else {
                  if (((ak) (Object) var2).a((byte) -56) < ((ak) (Object) var2.field_d).a((byte) -9)) {
                    return false;
                  } else {
                    var2 = var2.field_d;
                    continue L0;
                  }
                }
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Reject";
        field_B = "tournament";
        field_C = "The Final starts in <%0> seconds...";
        field_E = 0;
    }
}
