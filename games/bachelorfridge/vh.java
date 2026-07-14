/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends ana {
    static kv field_x;
    private ir field_v;
    static sna field_y;
    static String field_w;

    private final void d(int param0) {
        if (param0 < 75) {
            vh.a((byte[]) null, (int[]) null, (byte[]) null, (ee[]) null, 91, (int[]) null, true, (vr) null, (kv[][]) null, (String[][]) null, 21, (String[]) null, 37, (vr) null, (String[]) null, (kv[][]) null, (vr) null, (String[][]) null, 2);
        }
    }

    public static void e(byte param0) {
        if (param0 != -3) {
          vh.e((byte) -54);
          field_y = null;
          field_x = null;
          field_w = null;
          return;
        } else {
          field_y = null;
          field_x = null;
          field_w = null;
          return;
        }
    }

    final static void a(byte[] param0, int[] param1, byte[] param2, ee[] param3, int param4, int[] param5, boolean param6, vr param7, kv[][] param8, String[][] param9, int param10, String[] param11, int param12, vr param13, String[] param14, kv[][] param15, vr param16, String[][] param17, int param18) {
        if (param18 != 22914) {
            return;
        }
        Object var20 = null;
        ei.a(param3, 1, param7, param9, (String[]) null, param17, param6, param15, param14, false, param13, param5, param12, param0, param1, param11, param16, param8, param2, param10);
    }

    private final void e(int param0) {
        iv var3 = null;
        int var6 = 0;
        aga var7 = null;
        ad var8 = null;
        ad var9 = null;
        ad var10 = null;
        ad var11 = null;
        var6 = BachelorFridge.field_y;
        var7 = ((vh) this).field_v.field_l.a(77, ((vh) this).field_q.field_h);
        if (!var7.i(111)) {
          var3 = (iv) (Object) ((vh) this).field_v.field_o.b((byte) 90);
          oha discarded$1 = al.a(param0 + 88, ((vh) this).field_v.field_k);
          if (param0 == 0) {
            var8 = ((vh) this).field_v.field_l.a(-27449, ((vh) this).field_q);
            ((vh) this).field_q.field_fb.a((bw) (Object) new vt(((vh) this).field_q, var8), true);
            L0: while (true) {
              if (var3 == null) {
                return;
              } else {
                var3.a(var7, ((vh) this).field_q.field_h, 12);
                var9 = var3.field_h.a(-27449, ((vh) this).field_q);
                var9.b(param0 ^ -1, 6);
                var9.a(24831, 17, kna.field_g[40]);
                var3 = (iv) (Object) ((vh) this).field_v.field_o.c(param0 ^ 0);
                continue L0;
              }
            }
          } else {
            vh.a((byte[]) null, (int[]) null, (byte[]) null, (ee[]) null, -84, (int[]) null, true, (vr) null, (kv[][]) null, (String[][]) null, 83, (String[]) null, 45, (vr) null, (String[]) null, (kv[][]) null, (vr) null, (String[][]) null, -71);
            var10 = ((vh) this).field_v.field_l.a(-27449, ((vh) this).field_q);
            ((vh) this).field_q.field_fb.a((bw) (Object) new vt(((vh) this).field_q, var10), true);
            L1: while (true) {
              if (var3 == null) {
                return;
              } else {
                var3.a(var7, ((vh) this).field_q.field_h, 12);
                var11 = var3.field_h.a(-27449, ((vh) this).field_q);
                var11.b(param0 ^ -1, 6);
                var11.a(24831, 17, kna.field_g[40]);
                var3 = (iv) (Object) ((vh) this).field_v.field_o.c(param0 ^ 0);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        ((vh) this).field_l = ((vh) this).field_l - 1;
        if ((((vh) this).field_l - 1 ^ -1) <= -1) {
          if (25 != ((vh) this).field_l) {
            return false;
          } else {
            jja.a(192, -1, 5);
            this.e(0);
            return false;
          }
        } else {
          var2 = 59 / ((param0 - 71) / 47);
          this.d(93);
          return true;
        }
    }

    final static void a(int param0, String[] param1, int param2, int param3, int param4, java.applet.Applet param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          pg.field_q = param5.getParameter("overxgames");
          if (pg.field_q == null) {
            pg.field_q = "0";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          td.field_l = param5.getParameter("overxachievements");
          if (null == td.field_l) {
            td.field_l = "0";
            break L1;
          } else {
            break L1;
          }
        }
        var6 = param5.getParameter("currency");
        if (var6 == null) {
          lk.field_q = 2;
          bha.field_o = param3;
          dp.field_q = param2;
          rl.field_q = param0;
          taa.field_m = new kv[param1.length];
          var7 = param4;
          L2: while (true) {
            if (param1.length <= var7) {
              iaa.field_b = param1;
              return;
            } else {
              taa.field_m[var7] = new kv(317, 34);
              var7++;
              continue L2;
            }
          }
        } else {
          if (!vn.a((byte) 127, (CharSequence) (Object) var6)) {
            lk.field_q = 2;
            bha.field_o = param3;
            dp.field_q = param2;
            rl.field_q = param0;
            taa.field_m = new kv[param1.length];
            var7 = param4;
            L3: while (true) {
              if (param1.length <= var7) {
                iaa.field_b = param1;
                return;
              } else {
                taa.field_m[var7] = new kv(317, 34);
                var7++;
                continue L3;
              }
            }
          } else {
            lk.field_q = pd.a((byte) 47, (CharSequence) (Object) var6);
            bha.field_o = param3;
            dp.field_q = param2;
            rl.field_q = param0;
            taa.field_m = new kv[param1.length];
            var7 = param4;
            L4: while (true) {
              if (param1.length <= var7) {
                iaa.field_b = param1;
                return;
              } else {
                taa.field_m[var7] = new kv(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        }
    }

    vh(gj param0, ir param1) {
        super(param0, (bca) (Object) param1);
        ((vh) this).field_v = param1;
    }

    static {
    }
}
