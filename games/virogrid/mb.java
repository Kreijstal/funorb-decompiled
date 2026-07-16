/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mb extends dc {
    private int field_lb;
    static int[][] field_db;
    static int[] field_bb;
    private int field_jb;
    static String field_eb;
    static String field_mb;
    private int field_cb;
    private int field_hb;
    private int field_nb;
    private fi field_ib;
    private on field_fb;
    static String field_gb;
    private kn field_kb;

    boolean f(int param0) {
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 != 3) {
          ((mb) this).field_lb = -93;
          if (null != ((mb) this).field_fb) {
            if (dk.field_e != ((mb) this).field_fb) {
              if (vf.field_b == ((mb) this).field_fb) {
                int fieldTemp$4 = ((mb) this).field_jb + 1;
                ((mb) this).field_jb = ((mb) this).field_jb + 1;
                if (((mb) this).field_hb != fieldTemp$4) {
                  ((mb) this).field_kb.field_H = (((mb) this).field_jb << -894494360) / ((mb) this).field_hb;
                  return super.f(3);
                } else {
                  ((mb) this).field_fb = null;
                  ((mb) this).field_kb.field_H = 256;
                  return super.f(3);
                }
              } else {
                return super.f(3);
              }
            } else {
              int fieldTemp$5 = ((mb) this).field_jb + 1;
              ((mb) this).field_jb = ((mb) this).field_jb + 1;
              if (fieldTemp$5 == ((mb) this).field_cb) {
                ((mb) this).field_fb = lm.field_e;
                ((mb) this).a(((mb) this).field_lb + (12 - -((mb) this).field_ib.field_m), param0 ^ 3, ((mb) this).field_nb, 12 + ((mb) this).field_ib.field_g);
                ((mb) this).field_kb.field_H = 0;
                ((mb) this).field_jb = 0;
                return super.f(3);
              } else {
                ((mb) this).field_kb.field_H = 256 + -((((mb) this).field_jb << -1750507768) / ((mb) this).field_cb);
                return super.f(3);
              }
            }
          } else {
            return super.f(3);
          }
        } else {
          if (null != ((mb) this).field_fb) {
            if (dk.field_e != ((mb) this).field_fb) {
              if (vf.field_b == ((mb) this).field_fb) {
                int fieldTemp$6 = ((mb) this).field_jb + 1;
                ((mb) this).field_jb = ((mb) this).field_jb + 1;
                if (((mb) this).field_hb != fieldTemp$6) {
                  ((mb) this).field_kb.field_H = (((mb) this).field_jb << -894494360) / ((mb) this).field_hb;
                  return super.f(3);
                } else {
                  ((mb) this).field_fb = null;
                  ((mb) this).field_kb.field_H = 256;
                  return super.f(3);
                }
              } else {
                return super.f(3);
              }
            } else {
              int fieldTemp$7 = ((mb) this).field_jb + 1;
              ((mb) this).field_jb = ((mb) this).field_jb + 1;
              if (fieldTemp$7 == ((mb) this).field_cb) {
                ((mb) this).field_fb = lm.field_e;
                ((mb) this).a(((mb) this).field_lb + (12 - -((mb) this).field_ib.field_m), param0 ^ 3, ((mb) this).field_nb, 12 + ((mb) this).field_ib.field_g);
                ((mb) this).field_kb.field_H = 0;
                ((mb) this).field_jb = 0;
                return super.f(3);
              } else {
                ((mb) this).field_kb.field_H = 256 + -((((mb) this).field_jb << -1750507768) / ((mb) this).field_cb);
                return super.f(3);
              }
            }
          } else {
            return super.f(3);
          }
        }
    }

    void b(fi param0, byte param1) {
        Object var4 = null;
        ((mb) this).field_ib = param0;
        if (((mb) this).field_fb != lm.field_e) {
          if (((mb) this).field_fb == dk.field_e) {
            if (param1 != -53) {
              var4 = null;
              boolean discarded$3 = ((mb) this).a((fi) null, '￈', 62, -58);
              return;
            } else {
              return;
            }
          } else {
            ((mb) this).field_jb = 0;
            ((mb) this).field_fb = dk.field_e;
            if (param1 == -53) {
              return;
            } else {
              var4 = null;
              boolean discarded$4 = ((mb) this).a((fi) null, '￈', 62, -58);
              return;
            }
          }
        } else {
          ((mb) this).a(((mb) this).field_ib.field_m + (12 + ((mb) this).field_lb), param1 ^ -53, ((mb) this).field_nb, ((mb) this).field_ib.field_g + 12);
          ((mb) this).field_jb = 0;
          if (param1 == -53) {
            return;
          } else {
            var4 = null;
            boolean discarded$5 = ((mb) this).a((fi) null, '￈', 62, -58);
            return;
          }
        }
    }

    final static String a(boolean param0, char param1) {
        if (!param0) {
            java.applet.Applet discarded$0 = mb.g((byte) -40);
            return String.valueOf(param1);
        }
        return String.valueOf(param1);
    }

    final void j(int param0) {
        if (null == ((mb) this).field_fb) {
            super.j(param0);
            return;
        }
        if (((mb) this).field_fb != vf.field_b) {
            ((mb) this).c(((mb) this).field_ib.field_m + 12 - -((mb) this).field_lb, 120, 12 - -((mb) this).field_ib.field_g);
            this.c(6, ((mb) this).field_ib);
        } else {
            ((mb) this).field_kb.field_H = 256;
            ((mb) this).field_fb = null;
            super.j(param0);
            return;
        }
        ((mb) this).field_kb.field_H = 256;
        ((mb) this).field_fb = null;
        super.j(param0);
    }

    final void i(int param0) {
        if (((mb) this).field_fb != dk.field_e) {
          ((mb) this).field_jb = 0;
          ((mb) this).field_fb = vf.field_b;
          this.c(6, ((mb) this).field_ib);
          if (param0 <= 43) {
            return;
          } else {
            ((mb) this).field_kb.field_H = 0;
            ((mb) this).field_ib = null;
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int param0, fi param1) {
        if (param0 == 6) {
          if (((mb) this).field_kb == null) {
            if (param1 != null) {
              param1.a(param1.field_m, true, 6 - -((mb) this).field_lb, 6, param1.field_g);
              ((mb) this).field_kb = new kn(param1);
              ((mb) this).a((fi) (Object) ((mb) this).field_kb, (byte) -78);
              ((mb) this).field_ib = null;
              return;
            } else {
              ((mb) this).field_kb = new kn();
              ((mb) this).a((fi) (Object) ((mb) this).field_kb, (byte) -78);
              ((mb) this).field_ib = null;
              return;
            }
          } else {
            ((mb) this).field_kb.a(false);
            if (param1 != null) {
              param1.a(param1.field_m, true, 6 - -((mb) this).field_lb, 6, param1.field_g);
              ((mb) this).field_kb = new kn(param1);
              ((mb) this).a((fi) (Object) ((mb) this).field_kb, (byte) -78);
              ((mb) this).field_ib = null;
              return;
            } else {
              ((mb) this).field_kb = new kn();
              ((mb) this).a((fi) (Object) ((mb) this).field_kb, (byte) -78);
              ((mb) this).field_ib = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    mb(je param0, fi param1, int param2, int param3, int param4) {
        super(param0, param1.field_g + 12, param2 + (12 - -param1.field_m));
        ((mb) this).field_hb = param3;
        ((mb) this).field_cb = param3;
        ((mb) this).field_lb = param2;
        ((mb) this).field_nb = param4;
        this.c(6, param1);
    }

    public static void h(byte param0) {
        field_bb = null;
        field_gb = null;
        field_mb = null;
        if (param0 < 118) {
          field_db = null;
          field_eb = null;
          field_db = null;
          return;
        } else {
          field_eb = null;
          field_db = null;
          return;
        }
    }

    final static void a(int param0, byte param1, mg[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Virogrid.field_F ? 1 : 0;
          if (param2 == null) {
            break L0;
          } else {
            if (0 < param0) {
              var5 = param2[0].field_u;
              var6 = param2[2].field_u;
              var7 = param2[1].field_u;
              param2[0].d(param3, param4);
              param2[2].d(-var6 + param0 + param3, param4);
              df.b(od.field_m);
              df.h(param3 - -var5, param4, -var6 + param0 + param3, param2[1].field_z + param4);
              if (param1 != -117) {
                return;
              } else {
                var8 = param3 + var5;
                var9 = param0 + (param3 + -var6);
                param3 = var8;
                L1: while (true) {
                  if (var9 <= param3) {
                    df.a(od.field_m);
                    return;
                  } else {
                    param2[1].d(param3, param4);
                    param3 = param3 + var7;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void i(byte param0) {
        mi.field_d = sh.field_qb.h(-118);
        if (param0 < 42) {
            return;
        }
        CharSequence var2 = (CharSequence) (Object) mi.field_d;
        wn.field_n = c.a(var2, true);
    }

    final static java.applet.Applet g(byte param0) {
        int var1 = 114 / ((param0 - -37) / 43);
        if (ai.field_a != null) {
            return ai.field_a;
        }
        return (java.applet.Applet) (Object) jj.field_n;
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        int var5 = 0;
        var5 = 32 % ((-75 - param3) / 36);
        if (super.a(param0, param1, param2, -117)) {
          return true;
        } else {
          if (((mb) this).field_kb != null) {
            L0: {
              if ((param2 ^ -1) == -99) {
                boolean discarded$4 = ((mb) this).field_kb.a(param0, -8515);
                break L0;
              } else {
                break L0;
              }
            }
            if ((param2 ^ -1) == -100) {
              boolean discarded$5 = ((mb) this).field_kb.a(param0, -8515);
              return false;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(byte param0) {
        ((mb) this).j(-4236);
        int var2 = 32 % ((param0 - 50) / 33);
        return super.a((byte) -71);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = "Blue";
        field_gb = "Please enter your age in years";
        field_mb = "Create a free account to start using this feature";
    }
}
