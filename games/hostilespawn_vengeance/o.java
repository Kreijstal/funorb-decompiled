/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends ql {
    private oc[] field_h;
    private oc field_m;
    static String field_l;
    private v field_d;
    static String field_j;
    private oc field_i;
    static sm field_n;
    private we[] field_f;
    static bd field_g;
    static boolean field_e;
    private v field_k;

    public static void g(int param0) {
        field_n = null;
        field_l = null;
        field_g = null;
        field_j = null;
        int var1 = -82 / ((-63 - param0) / 43);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var5 = null;
            int var4 = 0;
            java.net.URL var6 = null;
            int var2 = 67 / ((param0 - 27) / 42);
            try {
                var3 = param1.getDocumentBase().getFile();
                var5 = var3;
                var5 = var3;
                var4 = var3.indexOf('?');
                var5 = "reload.ws";
                if (-1 >= (var4 ^ -1)) {
                    var5 = var5 + var3.substring(var4);
                }
                var6 = new java.net.URL(param1.getCodeBase(), var5);
                param1.getAppletContext().showDocument(nj.a(param1, true, var6), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(int param0) {
        we[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        we var5 = null;
        int var6 = 0;
        we[] var7 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var3 = 118 % ((38 - param0) / 53);
        var7 = ((o) this).field_f;
        var2 = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5.field_d.field_e >= 0) {
              var5.a((byte) -46);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void e(int param0) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        int[] var9 = ln.field_a.field_v;
        int[] var8 = var9;
        int[] var7 = var8;
        int[] var6 = var7;
        int[] var5 = var6;
        int[] var2 = var5;
        ((o) this).field_i = new oc(var9[4], var9[5]);
        ((o) this).field_m = new oc(var9[8], var9[9]);
        ((o) this).field_h[0] = new oc(var9[10], var9[11]);
        ((o) this).field_h[1] = new oc(var9[12], var9[13]);
        for (var3 = param0; var3 < ((o) this).field_f.length; var3++) {
            ((o) this).field_f[var3] = new we(((o) this).field_h[var3]);
        }
        ((o) this).field_d = new v(we.field_h, 0, 0, 140);
        ((o) this).field_d.field_l = (((o) this).field_i.field_e + 4) * 24;
        ((o) this).field_d.field_d = (((o) this).field_i.field_g + -1) * 24;
        ((o) this).field_k = new v(ch.field_f, ((o) this).field_m.field_e * 24, (((o) this).field_m.field_g - -2) * 24);
        kd.a(14, param0 ^ 1);
        nh.field_E.a(-1, param0 + 8360, -1);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0;
        var3 = param0;
        L0: while (true) {
          L1: {
            if (el.field_j <= var3) {
              break L1;
            } else {
              if (mm.field_m[var3] != null) {
                if ((mm.field_m[var3].field_I ^ -1) < -1) {
                  L2: {
                    if ((mm.field_m[var3].field_i ^ -1) == -5) {
                      break L2;
                    } else {
                      if (24 == mm.field_m[var3].field_i) {
                        break L2;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  var2 = 1;
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
          L3: {
            if (var2 == 0) {
              ti.a(227, (byte) 113, 28);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        oc var3 = mm.field_m[0].field_j;
        if (!(param0 != (((o) this).field_d.field_a ^ -1))) {
            var2 = ih.a(var3, (byte) -126, ((o) this).field_i);
            if (var2 < 2) {
                ((o) this).field_d.field_a = 1;
            }
        }
        if (-1 == (((o) this).field_k.field_a ^ -1)) {
            var2 = ih.a(var3, (byte) -101, ((o) this).field_m);
            if (var2 < 2) {
                ((o) this).field_h[1].field_e = -1;
                ((o) this).field_k.field_a = 1;
            }
        }
        if (((o) this).field_h[0].field_g + -4 <= var3.field_g) {
            if (((o) this).field_h[0].field_g - -5 >= var3.field_g) {
                if (var3.field_e > -2 + ((o) this).field_h[0].field_e) {
                    if (var3.field_e < 6 + ((o) this).field_h[0].field_e) {
                        mf.a(false, 2);
                    }
                }
            }
        }
    }

    final void b(byte param0) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        oc var2 = mm.field_m[0].field_j;
        if (-2 == (((o) this).field_d.field_a ^ -1)) {
            if (4 + ((o) this).field_i.field_e <= var2.field_e) {
                ((o) this).field_d.field_a = 2;
            } else {
                ((o) this).field_d.e(-111);
            }
        }
        if (1 != ((o) this).field_k.field_a) {
            var3 = -18 / ((-48 - param0) / 38);
        } else {
            if (((o) this).field_k.field_d > var2.field_g * 24) {
                ((o) this).field_k.e(-116);
            } else {
                ((o) this).field_k.field_a = 2;
            }
            var3 = -18 / ((-48 - param0) / 38);
        }
    }

    final String a(boolean param0) {
        if (param0) {
            field_e = false;
        }
        return e.field_m;
    }

    public o() {
        ((o) this).field_h = new oc[2];
        ((o) this).field_f = new we[2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Find and destroy the spawn queen.";
        field_j = "Score: <%0>";
        field_e = true;
    }
}
