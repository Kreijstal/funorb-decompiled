/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends ug {
    float[] field_f;
    float[] field_e;
    float[] field_i;
    static pj field_k;
    static int field_h;
    static le field_g;
    static kj field_j;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var1 = sb.field_r.field_C - -sb.field_r.field_D;
        var2 = 0;
        L0: while (true) {
          if (5 <= var2) {
            L1: {
              ac.field_a.a((byte) 118);
              if (param0 < -78) {
                break L1;
              } else {
                var5 = null;
                float discarded$2 = wg.a((float[]) null, (byte) -105);
                break L1;
              }
            }
            ck.field_b = -1;
            return;
          } else {
            L2: {
              fd.field_o[var2] = false;
              m.field_e[var2] = 272;
              th.field_o[var2] = 30 + (var1 + (pl.field_e.field_D + pl.field_e.field_C) * pl.field_e.a(th.field_n[var2], -57 + m.field_e[var2]));
              if (-138 >= (th.field_o[var2] ^ -1)) {
                break L2;
              } else {
                th.field_o[var2] = 137;
                break L2;
              }
            }
            sl.field_k[var2] = -(m.field_e[var2] / 2) + 320;
            si.field_v[var2] = 240 - th.field_o[var2] / 2;
            vh.field_E[var2] = new le(m.field_e[var2], th.field_o[var2]);
            vh.field_E[var2].e();
            lb.a(0, m.field_e[var2], (byte) -128, wc.field_e, 0, th.field_o[var2]);
            int discarded$3 = pl.field_e.a(th.field_n[var2], 57, 15, m.field_e[var2] + -72, th.field_o[var2] + -30, 1, -1, 0, 0, pl.field_e.field_C + pl.field_e.field_D);
            sb.field_r.b(lb.field_A, 57, th.field_o[var2] + -15, 1, 6579300);
            var3 = var2;
            if (0 != var3) {
              if (3 != var3) {
                if (var3 == 4) {
                  qi.field_K[1].d(15, 15, 32, 32);
                  qi.field_K[2].d(15, 47, 32, 32);
                  qi.field_K[3].d(15, 79, 32, 32);
                  var2++;
                  continue L0;
                } else {
                  if (-2 == (var3 ^ -1)) {
                    ak.field_t[1].c(15, 15);
                    ak.field_t[2].c(15, 47);
                    tl.field_b.c(15, 79);
                    var2++;
                    continue L0;
                  } else {
                    if ((var3 ^ -1) == -3) {
                      ge.h(15, 15, 42, 106);
                      wc.field_h.c(15, 15);
                      hb.field_m[4][0].c(15, 47);
                      ak.field_t[4].c(15, 79);
                      var2++;
                      continue L0;
                    } else {
                      var2++;
                      continue L0;
                    }
                  }
                }
              } else {
                qi.field_K[0].d(15, 15, 32, 32);
                qi.field_K[0].d(15, 47, 32, 32);
                qi.field_K[0].d(15, 79, 32, 32);
                var2++;
                continue L0;
              }
            } else {
              nh.field_f[0][0][0].c(15, 15);
              ak.field_t[0].c(15, 47);
              ak.field_t[0].c(15, 79);
              var2++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(int param0, int param1, ad param2, int param3) {
        if (param3 != -3) {
            field_g = null;
        }
        byte[] var5 = param2.b(255, param1, param0);
        byte[] var4 = var5;
        if (var5 == null) {
            return false;
        }
        ol.a(var5, -83);
        return true;
    }

    final static float a(float[] param0, byte param1) {
        if (param1 <= 113) {
            Object var3 = null;
            String discarded$0 = wg.a(false, (CharSequence) null, 26);
        }
        return param0[1] * param0[1] + param0[0] * param0[0];
    }

    final static void a(String param0, java.applet.Applet param1, String param2, int param3, long param4) {
        try {
            String var9 = null;
            String var7 = null;
            String var10 = null;
            try {
                var9 = param1.getParameter("cookiehost");
                var7 = var9;
                var7 = var9;
                var10 = param0 + "=" + param2 + "; version=1; path=/; domain=" + var9;
                var7 = var10;
                var7 = var10;
                if ((param4 ^ -1L) > -1L) {
                    var7 = var10 + "; Discard;";
                } else {
                    var7 = var10 + "; Expires=" + ha.a((byte) 126, 1000L * param4 + pf.a(0)) + "; Max-Age=" + param4;
                }
                mf.a(true, param1, "document.cookie=\"" + var7 + "\"");
            } catch (Throwable throwable) {
            }
            if (param3 != -26372) {
                Object var8 = null;
                boolean discarded$0 = wg.a(-106, -61, (ad) null, -79);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        jh.field_C.c((byte) 73, (we) (Object) new lb());
        if (param0 != -1) {
            Object var2 = null;
            float discarded$0 = wg.a((float[]) null, (byte) -21);
        }
    }

    final void e(int param0) {
        float var2 = ((wg) this).field_e[0];
        float var3 = ((wg) this).field_e[1];
        wj.a(((wg) this).field_e, -110, vj.a(uh.a(((wg) this).field_f, 0.00009999999747378752f, (byte) 40), (byte) -2, ac.a(((wg) this).field_i, 117, ((wg) this).field_e)));
        ((wg) this).field_i[0] = var2;
        ((wg) this).field_i[1] = var3;
        if (param0 >= -81) {
            field_h = 28;
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var4 = 0;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        String var3 = pc.a((byte) -123, param0, param1);
        if (var3 != null) {
            return var3;
        }
        for (var4 = 0; param1.length() > var4; var4++) {
            if (!(vb.a((byte) 110, param1.charAt(var4)))) {
                return kd.field_b;
            }
        }
        if (param2 == 17212) {
            return null;
        }
        return null;
    }

    final static int a(boolean param0, CharSequence param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var3 = 0;
        var4 = param1.length();
        if (!param0) {
          var5 = 0;
          L0: while (true) {
            if (var5 >= var4) {
              return var3;
            } else {
              if (param2 == param1.charAt(var5)) {
                var3++;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return 16;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_k = null;
        field_g = null;
        field_j = null;
    }

    wg(float param0, float param1) {
        ((wg) this).field_e = new float[2];
        ((wg) this).field_f = new float[2];
        ((wg) this).field_i = new float[2];
        ((wg) this).field_i[0] = param0;
        ((wg) this).field_e[0] = param0;
        ((wg) this).field_i[1] = param1;
        ((wg) this).field_e[1] = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new pj();
    }
}
