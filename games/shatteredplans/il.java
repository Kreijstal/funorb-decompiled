/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class il extends jl {
    private oa field_ab;
    private int field_jb;
    private vg field_ib;
    private int field_db;
    static bi field_gb;
    private int field_Z;
    static String field_fb;
    static ob field_kb;
    static a field_bb;
    static String field_Y;
    static String field_lb;
    private int field_mb;
    private int field_X;
    static String field_hb;
    private cg field_eb;
    static float field_cb;

    private final void a(int param0, vg param1) {
        if (null == ((il) this).field_eb) {
          if (param1 != null) {
            param1.a(6 + ((il) this).field_db, param1.field_n, (byte) 121, 6, param1.field_x);
            ((il) this).field_eb = new cg(param1);
            ((il) this).b((byte) -97, (vg) (Object) ((il) this).field_eb);
            ((il) this).field_ib = null;
            if (param0 > -5) {
              boolean discarded$4 = ((il) this).k(-80);
              return;
            } else {
              return;
            }
          } else {
            ((il) this).field_eb = new cg();
            ((il) this).b((byte) -97, (vg) (Object) ((il) this).field_eb);
            ((il) this).field_ib = null;
            if (param0 <= -5) {
              return;
            } else {
              boolean discarded$5 = ((il) this).k(-80);
              return;
            }
          }
        } else {
          ((il) this).field_eb.b((byte) -124);
          if (param1 != null) {
            param1.a(6 + ((il) this).field_db, param1.field_n, (byte) 121, 6, param1.field_x);
            ((il) this).field_eb = new cg(param1);
            ((il) this).b((byte) -97, (vg) (Object) ((il) this).field_eb);
            ((il) this).field_ib = null;
            if (param0 <= -5) {
              return;
            } else {
              boolean discarded$6 = ((il) this).k(-80);
              return;
            }
          } else {
            ((il) this).field_eb = new cg();
            ((il) this).b((byte) -97, (vg) (Object) ((il) this).field_eb);
            ((il) this).field_ib = null;
            if (param0 <= -5) {
              return;
            } else {
              boolean discarded$7 = ((il) this).k(-80);
              return;
            }
          }
        }
    }

    il(tc param0, vg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_x, param1.field_n + param2 + 12);
        ((il) this).field_db = param2;
        ((il) this).field_mb = param4;
        ((il) this).field_jb = param3;
        ((il) this).field_X = param3;
        this.a(-75, param1);
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (((il) this).field_eb != null) {
            if (98 != param0) {
              if (param0 == 99) {
                boolean discarded$12 = ((il) this).field_eb.a((byte) -23, param3);
                return false;
              } else {
                return false;
              }
            } else {
              boolean discarded$13 = ((il) this).field_eb.a((byte) -60, param3);
              if (param0 != 99) {
                return false;
              } else {
                boolean discarded$14 = ((il) this).field_eb.a((byte) -23, param3);
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void h(byte param0) {
        if (param0 != 88) {
          il.h((byte) -12);
          field_hb = null;
          field_gb = null;
          field_Y = null;
          field_lb = null;
          field_kb = null;
          field_bb = null;
          field_fb = null;
          return;
        } else {
          field_hb = null;
          field_gb = null;
          field_Y = null;
          field_lb = null;
          field_kb = null;
          field_bb = null;
          field_fb = null;
          return;
        }
    }

    final void g(byte param0) {
        if (((il) this).field_ab == gs.field_j) {
          return;
        } else {
          ((il) this).field_Z = 0;
          ((il) this).field_ab = je.field_a;
          if (param0 > -100) {
            return;
          } else {
            this.a(-125, ((il) this).field_ib);
            ((il) this).field_eb.field_J = 0;
            ((il) this).field_ib = null;
            return;
          }
        }
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((il) this).field_ab) {
          if (gs.field_j != ((il) this).field_ab) {
            if (((il) this).field_ab == je.field_a) {
              ((il) this).field_Z = ((il) this).field_Z + 1;
              if (((il) this).field_Z + 1 != ((il) this).field_jb) {
                ((il) this).field_eb.field_J = (((il) this).field_Z << 1306723848) / ((il) this).field_jb;
                var2 = -108 % ((param0 - -23) / 52);
                return super.a((byte) 81);
              } else {
                ((il) this).field_eb.field_J = 256;
                ((il) this).field_ab = null;
                var2 = -108 % ((param0 - -23) / 52);
                return super.a((byte) 81);
              }
            } else {
              var2 = -108 % ((param0 - -23) / 52);
              return super.a((byte) 81);
            }
          } else {
            ((il) this).field_Z = ((il) this).field_Z + 1;
            if (((il) this).field_X == ((il) this).field_Z + 1) {
              ((il) this).field_ab = hd.field_s;
              ((il) this).b(-127, ((il) this).field_mb, 12 - -((il) this).field_ib.field_x, ((il) this).field_ib.field_n + ((il) this).field_db + 12);
              ((il) this).field_Z = 0;
              ((il) this).field_eb.field_J = 0;
              var2 = -108 % ((param0 - -23) / 52);
              return super.a((byte) 81);
            } else {
              ((il) this).field_eb.field_J = -((((il) this).field_Z << 1400059496) / ((il) this).field_X) + 256;
              var2 = -108 % ((param0 - -23) / 52);
              return super.a((byte) 81);
            }
          }
        } else {
          var2 = -108 % ((param0 - -23) / 52);
          return super.a((byte) 81);
        }
    }

    void b(vg param0, int param1) {
        int var3 = 0;
        var3 = 87 / ((51 - param1) / 57);
        ((il) this).field_ib = param0;
        if (hd.field_s != ((il) this).field_ab) {
          if (gs.field_j != ((il) this).field_ab) {
            ((il) this).field_ab = gs.field_j;
            ((il) this).field_Z = 0;
            return;
          } else {
            return;
          }
        } else {
          ((il) this).b(-55, ((il) this).field_mb, ((il) this).field_ib.field_x + 12, ((il) this).field_ib.field_n + ((il) this).field_db + 12);
          ((il) this).field_Z = 0;
          return;
        }
    }

    final void n(int param0) {
        if (null != ((il) this).field_ab) {
            if (!(((il) this).field_ab == je.field_a)) {
                ((il) this).b(12 - -((il) this).field_db + ((il) this).field_ib.field_n, 12 - -((il) this).field_ib.field_x, (byte) -109);
                this.a(-107, ((il) this).field_ib);
            }
            ((il) this).field_eb.field_J = 256;
            ((il) this).field_ab = null;
        }
        super.n(param0);
    }

    final static void a(int param0, int param1, int param2, bi param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ra.field_a) {
          if (ra.field_a.length != gf.field_b) {
            ra.field_a = new int[gf.field_b];
            var4 = param2 & 15;
            param2 = param2 >> 4;
            var5 = param0 & 15;
            param0 = param0 >> 4;
            var12 = param1;
            var13 = param3.field_z * param2 + param0;
            var14 = -gf.field_b + param3.field_z;
            var15 = -gf.field_k;
            L0: while (true) {
              if (0 <= var15) {
                return;
              } else {
                var16 = 0;
                var17 = -1 + gf.field_b;
                L1: while (true) {
                  if (0 > var17) {
                    var15++;
                    var13 = var13 + var14;
                    continue L0;
                  } else {
                    var6 = param3.field_B[var13];
                    var8 = var6 & 65280;
                    var7 = var6 & 16711935;
                    var10 = 267390960 & var5 * var7;
                    var11 = var5 * var8 & 1044480;
                    var9 = var11 | var10;
                    var8 = var16 + var9;
                    var7 = 267390960 & var8;
                    var16 = (var6 << -313753724) - var9;
                    var6 = var8 & 1044480;
                    var10 = -16711936 & var4 * var7;
                    var11 = 16711680 & var6 * var4;
                    var9 = var10 | var11;
                    gf.field_h[var12] = ra.field_a[var17] + var9 >> -810457816;
                    ra.field_a[var17] = (var8 << -1124030076) - var9;
                    var12++;
                    var13++;
                    var17--;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var4 = param2 & 15;
            param2 = param2 >> 4;
            var5 = param0 & 15;
            param0 = param0 >> 4;
            var12 = param1;
            var13 = param3.field_z * param2 + param0;
            var14 = -gf.field_b + param3.field_z;
            var15 = -gf.field_k;
            L2: while (true) {
              if (0 <= var15) {
                return;
              } else {
                var16 = 0;
                var17 = -1 + gf.field_b;
                L3: while (true) {
                  if (0 > var17) {
                    var15++;
                    var13 = var13 + var14;
                    continue L2;
                  } else {
                    var6 = param3.field_B[var13];
                    var8 = var6 & 65280;
                    var7 = var6 & 16711935;
                    var10 = 267390960 & var5 * var7;
                    var11 = var5 * var8 & 1044480;
                    var9 = var11 | var10;
                    var8 = var16 + var9;
                    var7 = 267390960 & var8;
                    var16 = (var6 << -313753724) - var9;
                    var6 = var8 & 1044480;
                    var10 = -16711936 & var4 * var7;
                    var11 = 16711680 & var6 * var4;
                    var9 = var10 | var11;
                    gf.field_h[var12] = ra.field_a[var17] + var9 >> -810457816;
                    ra.field_a[var17] = (var8 << -1124030076) - var9;
                    var12++;
                    var13++;
                    var17--;
                    continue L3;
                  }
                }
              }
            }
          }
        } else {
          ra.field_a = new int[gf.field_b];
          var4 = param2 & 15;
          param2 = param2 >> 4;
          var5 = param0 & 15;
          param0 = param0 >> 4;
          var12 = param1;
          var13 = param3.field_z * param2 + param0;
          var14 = -gf.field_b + param3.field_z;
          var15 = -gf.field_k;
          L4: while (true) {
            if (0 <= var15) {
              return;
            } else {
              var16 = 0;
              var17 = -1 + gf.field_b;
              L5: while (true) {
                if (0 > var17) {
                  var15++;
                  var13 = var13 + var14;
                  continue L4;
                } else {
                  var6 = param3.field_B[var13];
                  var8 = var6 & 65280;
                  var7 = var6 & 16711935;
                  var10 = 267390960 & var5 * var7;
                  var11 = var5 * var8 & 1044480;
                  var9 = var11 | var10;
                  var8 = var16 + var9;
                  var7 = 267390960 & var8;
                  var16 = (var6 << -313753724) - var9;
                  var6 = var8 & 1044480;
                  var10 = -16711936 & var4 * var7;
                  var11 = 16711680 & var6 * var4;
                  var9 = var10 | var11;
                  gf.field_h[var12] = ra.field_a[var17] + var9 >> -810457816;
                  ra.field_a[var17] = (var8 << -1124030076) - var9;
                  var12++;
                  var13++;
                  var17--;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final boolean k(int param0) {
        if (param0 != 0) {
            return true;
        }
        ((il) this).n(7489);
        return super.k(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Kick <%0> from this game";
        field_gb = null;
        field_lb = "Click to stop building fleets in this territory.";
        field_hb = "Accept NAP";
        field_Y = "WAITING FOR 1 PLAYER.";
    }
}
