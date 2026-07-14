/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static String field_p;
    static int field_d;
    static int field_f;
    static String field_g;
    static boolean field_b;
    static h field_e;
    private int field_l;
    static String field_i;
    static int field_a;
    static String[] field_m;
    static int[] field_h;
    private int field_c;
    private hb field_k;
    static a field_j;
    private q field_o;
    static boolean field_q;
    static gh field_n;

    private final void a(byte param0, int param1, Object param2, long param3) {
        bg var6 = null;
        le var6_ref = null;
        int var7 = 0;
        var7 = SteelSentinels.field_G;
        if (((nc) this).field_c >= param1) {
          this.a((byte) 117, param3);
          ((nc) this).field_l = ((nc) this).field_l - param1;
          L0: while (true) {
            if ((((nc) this).field_l ^ -1) <= -1) {
              if (param0 > -47) {
                field_e = null;
                var6_ref = new le(param2, param1);
                ((nc) this).field_o.a((ck) (Object) var6_ref, param3, false);
                ((nc) this).field_k.a((byte) 47, (kd) (Object) var6_ref);
                ((bg) (Object) var6_ref).field_w = 0L;
                return;
              } else {
                var6_ref = new le(param2, param1);
                ((nc) this).field_o.a((ck) (Object) var6_ref, param3, false);
                ((nc) this).field_k.a((byte) 47, (kd) (Object) var6_ref);
                ((bg) (Object) var6_ref).field_w = 0L;
                return;
              }
            } else {
              var6 = (bg) (Object) ((nc) this).field_k.a(12515);
              this.a(var6, -17389);
              continue L0;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_m = null;
        field_g = null;
        field_p = null;
        field_e = null;
        field_n = null;
        if (param0 <= 126) {
          var2 = null;
          ld discarded$2 = nc.a((byte[]) null, 57);
          field_j = null;
          field_h = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_h = null;
          field_i = null;
          return;
        }
    }

    private final void a(byte param0, long param1) {
        if (param0 != 117) {
            return;
        }
        bg var4 = (bg) (Object) ((nc) this).field_o.a(param1, (byte) -125);
        this.a(var4, param0 ^ -17306);
    }

    final Object a(long param0, int param1) {
        le var6 = null;
        Object var7 = null;
        bg var8 = null;
        Object var9 = null;
        Object var10 = null;
        var8 = (bg) (Object) ((nc) this).field_o.a(param0, (byte) -127);
        if (var8 != null) {
          if (param1 <= -30) {
            var10 = var8.d((byte) 125);
            if (var10 == null) {
              var8.b(4);
              var8.e(480);
              ((nc) this).field_l = ((nc) this).field_l + var8.field_z;
              return null;
            } else {
              if (var8.h(-29304)) {
                var6 = new le(var10, var8.field_z);
                ((nc) this).field_o.a((ck) (Object) var6, var8.field_j, false);
                ((nc) this).field_k.a((byte) 72, (kd) (Object) var6);
                ((bg) (Object) var6).field_w = 0L;
                var8.b(4);
                var8.e(480);
                return var10;
              } else {
                ((nc) this).field_k.a((byte) 50, (kd) (Object) var8);
                var8.field_w = 0L;
                return var10;
              }
            }
          } else {
            var7 = null;
            this.a((bg) null, -108);
            var9 = var8.d((byte) 125);
            if (var9 == null) {
              var8.b(4);
              var8.e(480);
              ((nc) this).field_l = ((nc) this).field_l + var8.field_z;
              return null;
            } else {
              if (var8.h(-29304)) {
                var6 = new le(var9, var8.field_z);
                ((nc) this).field_o.a((ck) (Object) var6, var8.field_j, false);
                ((nc) this).field_k.a((byte) 72, (kd) (Object) var6);
                ((bg) (Object) var6).field_w = 0L;
                var8.b(4);
                var8.e(480);
                return var9;
              } else {
                ((nc) this).field_k.a((byte) 50, (kd) (Object) var8);
                var8.field_w = 0L;
                return var9;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void a(bg param0, int param1) {
        Object var4 = null;
        L0: {
          if (param0 != null) {
            param0.b(param1 ^ -17385);
            param0.e(param1 + 17869);
            ((nc) this).field_l = ((nc) this).field_l + param0.field_z;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -17389) {
          var4 = null;
          nc.a((byte) -12, (java.applet.Applet) null);
          return;
        } else {
          return;
        }
    }

    final static ld a(byte[] param0, int param1) {
        ld var2 = null;
        Object var3 = null;
        if (param0 != null) {
          if (param1 != 7045) {
            var3 = null;
            nc.a((byte) 100, (java.applet.Applet) null);
            var2 = new ld(param0, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
            uh.a(param1 + 2279);
            return var2;
          } else {
            var2 = new ld(param0, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
            uh.a(param1 + 2279);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(String param0, String param1, int param2) {
        Object var4 = null;
        if (ch.field_O == null) {
          jd.field_kb = new pm(param0, param1, false, true, true);
          ci.field_a.c((lh) (Object) jd.field_kb, -22908735);
          if (param2 >= -37) {
            var4 = null;
            nc.a((byte) 60, (java.applet.Applet) null);
            return;
          } else {
            return;
          }
        } else {
          ch.field_O.m(105);
          jd.field_kb = new pm(param0, param1, false, true, true);
          ci.field_a.c((lh) (Object) jd.field_kb, -22908735);
          if (param2 < -37) {
            return;
          } else {
            var4 = null;
            nc.a((byte) 60, (java.applet.Applet) null);
            return;
          }
        }
    }

    final void a(long param0, Object param1, int param2) {
        this.a((byte) -109, param2, param1, param0);
    }

    nc(int param0) {
        this(param0, param0);
    }

    final static vc[] a(int param0, pn param1) {
        int[] var3 = null;
        vc[] var4 = null;
        int var5 = 0;
        vc var6 = null;
        int var7 = 0;
        wj var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var7 = SteelSentinels.field_G;
        if (!param1.b(-35)) {
          return new vc[]{};
        } else {
          var8 = param1.a(param0 ^ -30726);
          L0: while (true) {
            if (var8.field_a != 0) {
              if (-3 != (var8.field_a ^ -1)) {
                if (param0 != 38) {
                  return null;
                } else {
                  var12 = (int[]) var8.field_c;
                  var11 = var12;
                  var10 = var11;
                  var9 = var10;
                  var3 = var9;
                  var4 = new vc[var12.length >> 483645762];
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      return var4;
                    } else {
                      var6 = new vc();
                      var4[var5] = var6;
                      var6.field_a = var3[var5 << 207299170];
                      var6.field_g = var3[1 + (var5 << 390866402)];
                      var6.field_j = var3[(var5 << 397193986) + 2];
                      var6.field_i = var3[(var5 << -1336862142) + 3];
                      var5++;
                      continue L1;
                    }
                  }
                }
              } else {
                return new vc[]{};
              }
            } else {
              a.a((byte) 121, 10L);
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(ge.a(0, var2, param1), "_top");
                int var3 = 58 % ((-15 - param0) / 42);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private nc(int param0, int param1) {
        int var3 = 0;
        ((nc) this).field_k = new hb();
        ((nc) this).field_l = param0;
        ((nc) this).field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((nc) this).field_o = new q(var3);
            }
          } else {
            ((nc) this).field_o = new q(var3);
          }
        }
    }

    final static gk a(int param0, byte param1) {
        if (param0 < 35) {
          if (param1 >= -93) {
            return null;
          } else {
            return ie.field_d[param0];
          }
        } else {
          return bl.field_p[param0 - 35];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_d = 0;
        field_h = new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, -1, 7};
        field_p = "Unable to add name - system busy";
        field_m = new String[]{"speed_icons", "diff_icons", "map_icons"};
        field_i = "Email (Login):";
        field_q = false;
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
