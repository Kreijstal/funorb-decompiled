/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class hg {
    static og field_a;
    static String field_c;
    static kc field_e;
    static kc field_d;
    static volatile int field_b;

    final int a(long param0, int param1) {
        long var4 = ((hg) this).a((byte) 52);
        if (var4 > 0L) {
            ao.a(var4, 1);
        }
        if (param1 != -1) {
            field_e = null;
        }
        return ((hg) this).a(param0, (byte) -44);
    }

    final static String a(int param0, char param1) {
        return String.valueOf(param1);
    }

    final static void a(int param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        vn var4 = null;
        Object var5 = null;
        wa var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ne var16 = null;
        ne var17 = null;
        dn stackIn_2_0 = null;
        dn stackIn_3_0 = null;
        dn stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kc stackIn_18_0 = null;
        kc stackIn_19_0 = null;
        kc stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        dn stackOut_1_0 = null;
        dn stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        dn stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        kc stackOut_17_0 = null;
        kc stackOut_19_0 = null;
        String stackOut_19_1 = null;
        kc stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = dd.field_c.field_Db;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (dd.field_h != dd.field_c.field_Db) {
                stackOut_3_0 = (dn) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (dn) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((dn) (Object) stackIn_4_0).a(stackIn_4_1 != 0, (byte) 98, ga.field_r - -2, 2, param0 * (ga.field_r * 3 + 6), param1) ? 1 : 0;
                var4 = dd.field_c.field_Eb.field_G;
                if (jb.field_t == 2) {
                  break L3;
                } else {
                  if (jb.field_t != 1) {
                    dd.field_c.field_ub = false;
                    dd.field_c.field_Db.field_Hb.field_rb = hn.field_l;
                    fc.a((byte) -104, dd.field_c.field_Eb);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              dd.field_c.field_Db.field_Hb.field_rb = null;
              dd.field_c.field_ub = true;
              var5 = null;
              var6 = (wa) (Object) var4.b(12623);
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (dd.field_c.field_Jb.field_U != 0) {
                      tc.field_A = new dh(dd.field_c.field_Jb.field_V, dd.field_c.field_Jb.field_nb, dd.field_c.field_Jb.field_x, dd.field_c.field_Jb.field_I, fh.field_a, ck.field_a, pg.field_c, pg.field_c);
                      vd.field_h = 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (dd.field_c.field_Lb.field_U == 0) {
                    break L2;
                  } else {
                    tc.field_A = new dh(dd.field_c.field_Lb.field_V, dd.field_c.field_Lb.field_nb, dd.field_c.field_Lb.field_x, dd.field_c.field_Lb.field_I, wd.field_i, ck.field_a, pg.field_c, pg.field_c);
                    vd.field_h = 3;
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (var6.field_G != null) {
                      break L6;
                    } else {
                      var6.field_Jb = new kc(0L, qa.field_j);
                      var6.a(var6.field_Jb, 96);
                      var6.field_Mb = new kc(0L, qa.field_j);
                      var6.a(var6.field_Mb, 112);
                      var7 = 1;
                      var6.e((byte) 20);
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_x = dd.field_c.field_Eb.field_x;
                    var6.field_Jb.a(var6.field_x, 0, 0, ga.field_r, (byte) -120);
                    var8 = 0;
                    if (var6.field_Gb == null) {
                      break L7;
                    } else {
                      if (!var6.field_Gb.equals((Object) (Object) "")) {
                        var6.field_Mb.field_eb = 16737894;
                        var6.field_Mb.field_W = eb.field_d;
                        var8 = 1;
                        var6.field_Mb.a(eb.field_d.field_n + 3, 0, 0, ga.field_r, (byte) -120);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_x;
                    if (var8 == 0) {
                      break L8;
                    } else {
                      var9 = eb.field_d.field_n - -3;
                      var10 = var10 - var9;
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_17_0 = var6.field_Jb;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var10 > 0) {
                      stackOut_19_0 = (kc) (Object) stackIn_19_0;
                      stackOut_19_1 = dj.a(var6.field_Jb.field_Z, var6.field_Cb, var10);
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L9;
                    } else {
                      stackOut_18_0 = (kc) (Object) stackIn_18_0;
                      stackOut_18_1 = var6.field_Cb;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_20_0.field_rb = stackIn_20_1;
                    if (var6.field_Jb.field_rb.equals((Object) (Object) var6.field_Cb)) {
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      break L10;
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_23_0;
                    var6.field_Jb.a(var10, var9, 0, ga.field_r, (byte) -120);
                    if (var3_int != 0) {
                      break L11;
                    } else {
                      var6.field_B = ga.field_r + -var6.field_I;
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 != 0) {
                      dd.field_c.field_Eb.a((byte) 125, (kc) var5, (kc) (Object) var6, 2);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (null == var6.field_Mb) {
                        break L14;
                      } else {
                        if (var6.field_Mb.field_C) {
                          kh.field_c = var6.field_Gb;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Jb.field_C) {
                      break L13;
                    } else {
                      if (var11 != 0) {
                        kh.field_c = var6.field_Cb;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L15: {
                    var5 = (Object) (Object) var6;
                    if (var6.field_U == 0) {
                      break L15;
                    } else {
                      ArcanistsMulti.a(-26335, (int[]) null, dd.field_c.field_Db, var6.field_Ib, 0L, -1, -1, var6.field_Cb, (kc) (Object) var6);
                      var16 = eo.field_c;
                      var13_ref_String = wl.field_M;
                      var16.field_l.a(7, var13_ref_String, (byte) -26);
                      var17 = eo.field_c;
                      var13 = pb.field_h;
                      var14 = ja.field_s;
                      var17.field_l.a(0, 0, -29466, var14, var13);
                      break L15;
                    }
                  }
                  var6 = (wa) (Object) var4.a(0);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "hg.C(" + param0 + ',' + param1 + ',' + false + ')');
        }
    }

    abstract long a(byte param0);

    abstract int a(long param0, byte param1);

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener((java.awt.event.KeyListener) (Object) ch.field_a);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) ch.field_a);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "hg.H(" + 1 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0, int param1) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        uh.field_m = 0;
        td.field_E = null;
        field_a = null;
        int var2 = ed.field_Hb;
        ed.field_Hb = qe.field_h;
        if (param1 == 51) {
            jl.field_c.field_o = 2;
        } else {
            if (param1 != 50) {
                jl.field_c.field_o = 1;
            } else {
                jl.field_c.field_o = 5;
            }
        }
        jl.field_c.field_i = jl.field_c.field_i + 1;
        qe.field_h = var2;
        if (jl.field_c.field_i >= 2) {
            if (param1 == 51) {
                return 2;
            }
        }
        if (jl.field_c.field_i >= 2) {
            if (param1 == 50) {
                return 5;
            }
        }
        if (!(jl.field_c.field_i < 4)) {
            return 1;
        }
        return -1;
    }

    final static int a(int param0, int param1) {
        return id.field_c[param0 & 2047];
    }

    final static boolean b(int param0) {
        return mk.field_O.b((byte) -52);
    }

    public static void b(byte param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static void a(boolean param0) {
        u.b(6);
        if (!(on.field_c == null)) {
            qm.a(on.field_c, (byte) 91);
        }
        mh.g((byte) 45);
        ng.a((byte) -23);
        ba.b(11670);
        if (!(!tm.a(true))) {
            he.field_e.b((byte) -107, 1);
            we.a(0, (byte) 94);
        }
        ka.b(false);
    }

    final static void a(eg param0, boolean param1, eg param2, byte param3) {
        try {
            ul.a(md.field_b, mi.field_A, nj.field_d, ml.field_S, hh.field_c, true, j.field_f, (dj) (Object) th.field_k, 27874, hh.field_d, pg.field_c, vn.field_i);
            tl.field_a = qe.a(param2, "chatfilter", "lobby", 119);
            cf.field_b[2] = ag.field_A;
            cf.field_b[1] = u.field_d;
            cf.field_b[0] = nb.field_e;
            hj.a((dj) (Object) ea.field_w, param0, 3896);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "hg.F(" + (param0 != null ? "{...}" : "null") + ',' + true + ',' + (param2 != null ? "{...}" : "null") + ',' + -103 + ')');
        }
    }

    abstract void a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Create a free account to start using this feature";
        field_b = 0;
    }
}
