/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hg {
    static og field_a;
    static String field_c;
    static kc field_e;
    static kc field_d;
    static volatile int field_b;

    final int a(long param0, int param1) {
        long var4 = this.a((byte) 52);
        if (-1L > (var4 ^ -1L)) {
            ao.a(var4, 1);
        }
        if (param1 != -1) {
            field_e = (kc) null;
        }
        return this.a(param0, (byte) -44);
    }

    final static String a(int param0, char param1) {
        if (param0 != 3) {
            field_a = (og) null;
        }
        return String.valueOf(param1);
    }

    final static void a(int param0, boolean param1, boolean param2) {
        String discarded$1 = null;
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
        dn stackIn_4_0 = null;
        dn stackIn_5_0 = null;
        dn stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kc stackIn_20_0 = null;
        kc stackIn_21_0 = null;
        kc stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        dn stackOut_3_0 = null;
        dn stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        dn stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        kc stackOut_19_0 = null;
        kc stackOut_21_0 = null;
        String stackOut_21_1 = null;
        kc stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                discarded$1 = hg.a(-89, '');
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = dd.field_c.field_Db;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (dd.field_h != dd.field_c.field_Db) {
                stackOut_5_0 = (dn) ((Object) stackIn_5_0);
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = (dn) ((Object) stackIn_4_0);
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              L4: {
                var3_int = ((dn) (Object) stackIn_6_0).a(stackIn_6_1 != 0, (byte) 98, ga.field_r - -2, 2, param0 * (ga.field_r * 3 + 6), param1) ? 1 : 0;
                var4 = dd.field_c.field_Eb.field_G;
                if ((jb.field_t ^ -1) == -3) {
                  break L4;
                } else {
                  if (jb.field_t != 1) {
                    dd.field_c.field_ub = false;
                    dd.field_c.field_Db.field_Hb.field_rb = hn.field_l;
                    fc.a((byte) -104, dd.field_c.field_Eb);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              dd.field_c.field_Db.field_Hb.field_rb = null;
              dd.field_c.field_ub = true;
              var5 = null;
              var6 = (wa) ((Object) var4.b(12623));
              L5: while (true) {
                if (var6 == null) {
                  L6: {
                    if (dd.field_c.field_Jb.field_U != 0) {
                      tc.field_A = new dh(dd.field_c.field_Jb.field_V, dd.field_c.field_Jb.field_nb, dd.field_c.field_Jb.field_x, dd.field_c.field_Jb.field_I, fh.field_a, ck.field_a, pg.field_c, pg.field_c);
                      vd.field_h = 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (dd.field_c.field_Lb.field_U == 0) {
                    break L3;
                  } else {
                    tc.field_A = new dh(dd.field_c.field_Lb.field_V, dd.field_c.field_Lb.field_nb, dd.field_c.field_Lb.field_x, dd.field_c.field_Lb.field_I, wd.field_i, ck.field_a, pg.field_c, pg.field_c);
                    vd.field_h = 3;
                    break L3;
                  }
                } else {
                  L7: {
                    var7 = 0;
                    if (var6.field_G != null) {
                      break L7;
                    } else {
                      var6.field_Jb = new kc(0L, qa.field_j);
                      var6.a(var6.field_Jb, 96);
                      var6.field_Mb = new kc(0L, qa.field_j);
                      var6.a(var6.field_Mb, 112);
                      var7 = 1;
                      var6.e((byte) 20);
                      break L7;
                    }
                  }
                  L8: {
                    var6.field_x = dd.field_c.field_Eb.field_x;
                    var6.field_Jb.a(var6.field_x, 0, 0, ga.field_r, (byte) -120);
                    var8 = 0;
                    if (var6.field_Gb == null) {
                      break L8;
                    } else {
                      if (!var6.field_Gb.equals("")) {
                        var6.field_Mb.field_eb = 16737894;
                        var6.field_Mb.field_W = eb.field_d;
                        var8 = 1;
                        var6.field_Mb.a(eb.field_d.field_n + 3, 0, 0, ga.field_r, (byte) -120);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    var9 = 0;
                    var10 = var6.field_x;
                    if (var8 == 0) {
                      break L9;
                    } else {
                      var9 = eb.field_d.field_n - -3;
                      var10 = var10 - var9;
                      break L9;
                    }
                  }
                  L10: {
                    stackOut_19_0 = var6.field_Jb;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (var10 > 0) {
                      stackOut_21_0 = (kc) ((Object) stackIn_21_0);
                      stackOut_21_1 = dj.a(var6.field_Jb.field_Z, var6.field_Cb, var10);
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      break L10;
                    } else {
                      stackOut_20_0 = (kc) ((Object) stackIn_20_0);
                      stackOut_20_1 = var6.field_Cb;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_22_0.field_rb = stackIn_22_1;
                    if (var6.field_Jb.field_rb.equals(var6.field_Cb)) {
                      stackOut_24_0 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      break L11;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L11;
                    }
                  }
                  L12: {
                    var11 = stackIn_25_0;
                    var6.field_Jb.a(var10, var9, 0, ga.field_r, (byte) -120);
                    if (var3_int != 0) {
                      break L12;
                    } else {
                      var6.field_B = ga.field_r + -var6.field_I;
                      break L12;
                    }
                  }
                  L13: {
                    if (var7 != 0) {
                      dd.field_c.field_Eb.a((byte) 125, (kc) (var5), var6, 2);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      if (null == var6.field_Mb) {
                        break L15;
                      } else {
                        if (var6.field_Mb.field_C) {
                          kh.field_c = var6.field_Gb;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (!var6.field_Jb.field_C) {
                      break L14;
                    } else {
                      if (var11 != 0) {
                        kh.field_c = var6.field_Cb;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L16: {
                    var5 = var6;
                    if (var6.field_U == 0) {
                      break L16;
                    } else {
                      ArcanistsMulti.a(-26335, (int[]) null, dd.field_c.field_Db, var6.field_Ib, 0L, -1, -1, var6.field_Cb, var6);
                      var16 = eo.field_c;
                      var13_ref_String = wl.field_M;
                      var16.field_l.a(7, var13_ref_String, (byte) -26);
                      var17 = eo.field_c;
                      var13 = pb.field_h;
                      var14 = ja.field_s;
                      var17.field_l.a(0, 0, -29466, var14, var13);
                      break L16;
                    }
                  }
                  var6 = (wa) ((Object) var4.a(0));
                  continue L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "hg.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract long a(byte param0);

    abstract int a(long param0, byte param1);

    final static void a(int param0, java.awt.Component param1) {
        int discarded$0 = 0;
        try {
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener(ch.field_a);
            if (param0 != 1) {
                discarded$0 = hg.a(36, -123);
            }
            param1.addFocusListener(ch.field_a);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "hg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
            if (-52 == (param1 ^ -1)) {
                return 2;
            }
        }
        if ((jl.field_c.field_i ^ -1) <= -3) {
            if (param1 == 50) {
                return 5;
            }
        }
        if (!(jl.field_c.field_i < 4)) {
            return 1;
        }
        if (param0 != 110) {
            field_e = (kc) null;
        }
        return -1;
    }

    final static int a(int param0, int param1) {
        String discarded$0 = null;
        if (param1 != -52) {
            discarded$0 = hg.a(87, '|');
        }
        return id.field_c[param0 & 2047];
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            return true;
        }
        return mk.field_O.b((byte) -52);
    }

    public static void b(byte param0) {
        if (param0 >= -97) {
            hg.a(48, true, false);
        }
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
        if (!(!tm.a(!param0 ? true : false))) {
            he.field_e.b((byte) -107, 1);
            we.a(0, (byte) 94);
        }
        ka.b(param0);
    }

    final static void a(eg param0, boolean param1, eg param2, byte param3) {
        try {
            if (param3 > -97) {
                field_b = 88;
            }
            ul.a(md.field_b, mi.field_A, nj.field_d, ml.field_S, hh.field_c, param1, j.field_f, th.field_k, 27874, hh.field_d, pg.field_c, vn.field_i);
            tl.field_a = qe.a(param2, "chatfilter", "lobby", 119);
            cf.field_b[2] = ag.field_A;
            cf.field_b[1] = u.field_d;
            cf.field_b[0] = nb.field_e;
            hj.a(ea.field_w, param0, 3896);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "hg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    abstract void a(int param0);

    static {
        field_c = "Create a free account to start using this feature";
        field_b = 0;
    }
}
