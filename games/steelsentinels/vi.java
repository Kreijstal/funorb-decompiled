/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends dl implements cg, ae, oj {
    static ql field_W;
    private oa field_U;
    static boolean field_db;
    static String field_Z;
    private bc field_cb;
    static String field_X;
    private bc field_Q;
    static wk field_R;
    private oa field_V;
    static wk[] field_gb;
    private bc field_eb;
    ij field_S;
    private bc field_hb;
    static int field_T;
    private bc field_Y;
    private ma field_fb;
    static String field_bb;
    private bc field_jb;
    private sb field_ib;
    static String field_P;
    static String field_ab;

    private final String j(int param0) {
        if (param0 > -22) {
            ((vi) this).field_jb = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean k(int param0) {
        if (!(this.h((byte) 35))) {
            return false;
        }
        int var2 = param0;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((vi) this).field_eb.field_y);
        } catch (NumberFormatException numberFormatException) {
        }
        return rl.a(((vi) this).field_cb.field_y, (vi) this, ((vi) this).field_hb.field_y, var2, ((vi) this).field_Y.field_y, ((vi) this).field_ib.field_T, true);
    }

    final static boolean l(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 13539) {
          if (!ni.b(param0 ^ 13551)) {
            if ((rd.field_b ^ -1) >= -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          vi.i(110);
          if (ni.b(param0 ^ 13551)) {
            return true;
          } else {
            L0: {
              if ((rd.field_b ^ -1) < -1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final void a(int param0, String param1) {
        bc var3 = null;
        String var4 = null;
        if (param0 != 20522) {
          field_R = null;
          var3 = ((vi) this).field_cb;
          var4 = param1;
          ((jf) (Object) var3).a(var4, param0 ^ 9143, false);
          return;
        } else {
          var3 = ((vi) this).field_cb;
          var4 = param1;
          ((jf) (Object) var3).a(var4, param0 ^ 9143, false);
          return;
        }
    }

    public vi() {
        super(0, 0, 496, 0, (qk) null);
        ((vi) this).field_cb = new bc("", (tn) null, 12);
        ((vi) this).field_Y = new bc("", (tn) null, 100);
        ((vi) this).field_jb = new bc("", (tn) null, 100);
        ((vi) this).field_hb = new bc("", (tn) null, 20);
        ((vi) this).field_Q = new bc("", (tn) null, 20);
        ((vi) this).field_eb = new bc("", (tn) null, 3);
        int var1 = 1;
        ((vi) this).field_ib = new sb("", (tn) null, var1 != 0);
        ((vi) this).field_U = new oa(lc.field_d, (tn) null);
        ((vi) this).field_V = new oa(hg.field_f, (tn) null);
        ((vi) this).field_cb.field_v = lc.field_i;
        ((vi) this).field_Y.field_v = bk.field_H;
        ((vi) this).field_jb.field_v = gi.field_v;
        ((vi) this).field_hb.field_v = ie.field_a;
        ((vi) this).field_Q.field_v = jb.field_W;
        ((vi) this).field_eb.field_v = wb.field_b;
        ((vi) this).field_ib.field_v = ug.field_K;
        ((vi) this).field_cb.a(true, (tl) (Object) new ei((jf) (Object) ((vi) this).field_cb));
        ((vi) this).field_Y.a(true, (tl) (Object) new ih((jf) (Object) ((vi) this).field_Y));
        ((vi) this).field_jb.a(true, (tl) (Object) new nm((jf) (Object) ((vi) this).field_jb, (jf) (Object) ((vi) this).field_Y));
        ((vi) this).field_hb.a(true, (tl) (Object) new vm((jf) (Object) ((vi) this).field_hb, (jf) (Object) ((vi) this).field_cb, (jf) (Object) ((vi) this).field_Y));
        ((vi) this).field_Q.a(true, (tl) (Object) new tk((jf) (Object) ((vi) this).field_Q, (jf) (Object) ((vi) this).field_hb));
        ((vi) this).field_eb.a(true, (tl) (Object) new eb((jf) (Object) ((vi) this).field_eb));
        ((vi) this).field_U.field_K = false;
        ((vi) this).field_U.field_p = (qk) (Object) new kh();
        ((vi) this).field_V.field_p = (qk) (Object) new bl();
        ((vi) this).field_cb.field_p = (qk) (Object) new ag(10000536);
        ((vi) this).field_jb.field_p = (qk) (Object) new ag(10000536);
        ((vi) this).field_Y.field_p = (qk) (Object) new ag(10000536);
        ((vi) this).field_eb.field_p = (qk) (Object) new ag(10000536);
        ((vi) this).field_ib.field_p = (qk) (Object) new s();
        ((vi) this).field_Q.field_p = (qk) (Object) new li(10000536);
        ((vi) this).field_hb.field_p = (qk) (Object) new li(10000536);
        String var2 = db.a(te.field_e, -95, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a((lh) (Object) ((vi) this).field_Y, 170, nc.field_i, var3, 126);
        var3 = var3 + (5 + this.a(var3, true, g.field_m, (lh) (Object) ((vi) this).field_jb, "", 20, 170));
        var3 = var3 + this.a((lh) (Object) ((vi) this).field_hb, 170, jh.field_c, var3, 126);
        var3 = var3 + (this.a(qb.field_N, 170, g.field_b, 12973, (lh) (Object) ((vi) this).field_Q, var3) - -5);
        var3 = var3 + (5 + this.a(bl.field_b, 170, cf.field_s, 12973, (lh) (Object) ((vi) this).field_cb, var3));
        var3 = var3 + this.a(var3, false, ee.field_L, (lh) (Object) ((vi) this).field_eb, 170);
        hc var4 = new hc(46, var3, ((vi) this).field_x + -90, 25, (lh) (Object) ((vi) this).field_ib, true, -120 + ((vi) this).field_x, 5, rc.field_m, 11579568, ic.field_cb);
        ((vi) this).a((lh) (Object) var4, -125);
        var3 = var3 + var4.field_E;
        cn var5 = new cn(tj.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, tj.field_e.field_G, -1, 2147483647, true);
        ((vi) this).field_fb = new ma(var2, (qk) (Object) var5);
        ((vi) this).field_fb.field_v = "";
        ((vi) this).field_fb.a(ph.field_b, 0, -55);
        ((vi) this).field_fb.a(ph.field_b, 1, -109);
        ((vi) this).field_fb.field_A = (tn) this;
        ((vi) this).field_fb.a(46, var3, -90 + ((vi) this).field_x, -1);
        var3 = var3 + (15 + ((vi) this).field_fb.field_E);
        ((vi) this).a((lh) (Object) ((vi) this).field_fb, -100);
        int var6 = 4;
        int var7 = 200;
        ((vi) this).field_U.a(-var7 + 496 >> -1939877151, (byte) -87, var3, var7, 40);
        ((vi) this).field_V.a(3 + var6, (byte) -86, var3 - -15, 60, 40);
        ((vi) this).field_V.field_A = (tn) this;
        ((vi) this).field_U.field_A = (tn) this;
        ((vi) this).a((lh) (Object) ((vi) this).field_U, -98);
        ((vi) this).a((lh) (Object) ((vi) this).field_V, -126);
        ((vi) this).field_S = new ij((oj) this);
        ((vi) this).field_S.a(60 + ((vi) this).field_cb.field_x + ((vi) this).field_cb.field_o, (byte) -87, ((vi) this).field_cb.field_z + 20, -((vi) this).field_cb.field_x + -((vi) this).field_cb.field_o + (((vi) this).field_x - 60), 150);
        ((vi) this).a((lh) (Object) ((vi) this).field_S, -125);
        ((vi) this).a(0, (byte) -80, 0, 496, var6 + 55 + var3);
    }

    private final int a(int param0, boolean param1, String param2, lh param3, int param4) {
        hc var8 = new hc(20, param0, param4 + 120, 25, param3, param1, 120, 3, tj.field_e, 16777215, param2);
        ((vi) this).a((lh) (Object) var8, -83);
        lk var7 = new lk(((qn) (Object) param3).a(param1));
        ((vi) this).a((lh) (Object) var7, -124);
        var7.a(3 + (var8.field_x + var8.field_o), (byte) -85, (var8.field_E - 15 >> 1489237601) + var8.field_z, 15, 15);
        return var8.field_E;
    }

    private final boolean h(byte param0) {
        if (this.a(-2, (qn) (Object) ((vi) this).field_cb)) {
          if (this.a(-2, (qn) (Object) ((vi) this).field_Y)) {
            if (this.a(-2, (qn) (Object) ((vi) this).field_jb)) {
              if (this.a(-2, (qn) (Object) ((vi) this).field_hb)) {
                if (this.a(-2, (qn) (Object) ((vi) this).field_Q)) {
                  if (this.a(-2, (qn) (Object) ((vi) this).field_eb)) {
                    if (param0 < 20) {
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
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final int a(int param0, boolean param1, String param2, lh param3, String param4, int param5, int param6) {
        ff var9 = null;
        hc var10 = null;
        var10 = new hc(20, param0, param6 + 120, 25, param3, false, 120, 3, tj.field_e, 16777215, param2);
        if (!param1) {
          return -83;
        } else {
          ((vi) this).a((lh) (Object) var10, -90);
          var9 = new ff(((qn) (Object) param3).a(false), param4, 126, var10.field_E + param0, param6 - -50, param5);
          var9.field_A = (tn) this;
          ((vi) this).a((lh) (Object) var9, -118);
          return var10.field_E - -var9.field_E;
        }
    }

    private final int a(String param0, int param1, String param2, int param3, lh param4, int param5) {
        if (param3 != 12973) {
          ((vi) this).field_Q = null;
          return this.a(param5, true, param0, param4, param2, 35, param1);
        } else {
          return this.a(param5, true, param0, param4, param2, 35, param1);
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_gb = null;
        field_X = null;
        field_P = null;
        field_R = null;
        field_bb = null;
        if (param0) {
          var2 = null;
          vi.a((byte) 115, true, (cm) null, (cm) null, (cm) null);
          field_ab = null;
          field_Z = null;
          field_W = null;
          return;
        } else {
          field_ab = null;
          field_Z = null;
          field_W = null;
          return;
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        Object var6 = null;
        super.a(param0, 95, param2, param3);
        if (param1 <= 56) {
          var6 = null;
          boolean discarded$2 = this.a(-51, (qn) null);
          ((vi) this).field_U.field_K = this.h((byte) 46);
          return;
        } else {
          ((vi) this).field_U.field_K = this.h((byte) 46);
          return;
        }
    }

    final static void i(int param0) {
        try {
            Class var5 = null;
            Class var2 = null;
            if (o.field_c) {
                return;
            }
            o.field_c = true;
            Class var4 = java.awt.Toolkit.class;
            Class var1 = var4;
            try {
                if (false) throw (IllegalAccessException) null;
                jd.field_rb = var4.getMethod("createCustomCursor", new Class[3]);
                int var3 = -25 / ((31 - param0) / 45);
                var5 = Class.forName("java.awt.image.BufferedImage");
                var2 = var5;
                hl.field_u = var5.getConstructor(new Class[3]);
                lc.field_h = var2.getField("TYPE_INT_ARGB").getInt((Object) null);
                nh.field_u = var5.getMethod("setRGB", new Class[7]);
            } catch (IllegalAccessException illegalAccessException) {
                jd.field_rb = null;
                return;
            } catch (ClassNotFoundException classNotFoundException) {
                jd.field_rb = null;
                return;
            } catch (NoSuchMethodException noSuchMethodException) {
                jd.field_rb = null;
                return;
            } catch (NoSuchFieldException noSuchFieldException) {
                jd.field_rb = null;
                return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6 = 0;
        var6 = -17 % ((param1 - -85) / 36);
        if (param3 != ((vi) this).field_V) {
          if (((vi) this).field_U == param3) {
            boolean discarded$2 = this.k(-1);
            return;
          } else {
            return;
          }
        } else {
          id.d((byte) -103);
          return;
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param1) {
            return ((vi) this).b(param3, 69);
          } else {
            if (-100 != (param1 ^ -1)) {
              return false;
            } else {
              return ((vi) this).b(-11963, param3);
            }
          }
        }
    }

    private final boolean a(int param0, qn param1) {
        tl var3 = null;
        vd var4 = null;
        var3 = param1.a(false);
        if (var3 != null) {
          if (param0 == -2) {
            var4 = var3.a((byte) 21);
            if (fa.field_d != var4) {
              if (nh.field_J == var4) {
                return false;
              } else {
                if (var4 == ka.field_S) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            field_Z = null;
            var4 = var3.a((byte) 21);
            if (fa.field_d != var4) {
              if (nh.field_J == var4) {
                return false;
              } else {
                if (var4 == ka.field_S) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final String m(int param0) {
        if (param0 != 170) {
            vi.a(true);
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, ma param2, int param3) {
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        if (param3 >= 124) {
          if (-1 != (param1 ^ -1)) {
            if ((param1 ^ -1) != -2) {
              if (param1 == 2) {
                mj.b("conduct.ws", (byte) -49);
                return;
              } else {
                return;
              }
            } else {
              mj.b("privacy.ws", (byte) -39);
              return;
            }
          } else {
            mj.b("terms.ws", (byte) 85);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1, cm param2, cm param3, cm param4) {
        gf.field_a = sf.a("", 16);
        if (param0 != -127) {
          return;
        } else {
          gf.field_a.a(param0 ^ -183, false);
          ci.a(param3, (byte) 99, param4, param2);
          ik.a(true);
          cb.field_j = mm.field_e;
          jn.field_b = mm.field_e;
          return;
        }
    }

    public final void a(byte param0) {
        ((ei) (Object) ((vi) this).field_cb.a(false)).d(param0 ^ 43);
        if (param0 != 86) {
            Object var3 = null;
            boolean discarded$0 = this.a(92, (qn) null);
        }
    }

    private final int a(lh param0, int param1, String param2, int param3, int param4) {
        hc var6 = null;
        Object var7 = null;
        var6 = new hc(20, param3, param1 + 120, 25, param0, false, 120, 3, tj.field_e, 16777215, param2);
        ((vi) this).a((lh) (Object) var6, -110);
        if (param4 != 126) {
          var7 = null;
          int discarded$2 = this.a(120, false, (String) null, (lh) null, (String) null, -28, -26);
          return var6.field_E;
        } else {
          return var6.field_E;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = false;
        field_X = "This game option is not available in rated games.";
        field_Z = "Decline invitation to <%0>'s game";
        field_bb = "Public";
        field_P = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_ab = "<%0> has dropped out.";
    }
}
