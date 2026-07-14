/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends df implements vb {
    private ro field_D;
    static String field_H;
    private String[] field_K;
    static String field_I;
    static String field_G;
    static byte[] field_E;
    private ag[] field_J;
    static lg field_F;

    final static void a(int param0, int param1) {
        try {
            try {
                Object discarded$0 = ei.a("resizing", cd.e(113), (byte) 114, new Object[1]);
            } catch (Throwable throwable) {
            }
            if (param1 != 0) {
                li.a(-52, 47);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        this.a((byte) -109, param1, param2, param3);
        if (param2 != 0) {
            return;
        }
        dj var5 = ia.field_c;
        if (param0 >= -52) {
            Object var6 = null;
            boolean discarded$0 = ((li) this).a((qm) null, (byte) -28, 'ￒ', -66);
        }
        if (!(null == ((li) this).field_K)) {
            int discarded$1 = var5.a(ji.field_f, ((li) this).field_n + param1, param3 - -((li) this).field_j, ((li) this).field_v, 20, 16777215, -1, 0, 0, var5.field_C + var5.field_m);
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        if (!(!this.a(param0, (byte) -124, param2, param3))) {
            return true;
        }
        if (param1 >= -120) {
            ((li) this).field_D = null;
        }
        if (param3 == -99) {
            return ((li) this).a(param0, 9555);
        }
        if (-100 == param3) {
            return ((li) this).b(2, param0);
        }
        return false;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ArcanistsMulti.field_G ? 1 : 0;
          if (an.field_f <= 0) {
            break L0;
          } else {
            if ((an.field_j ^ -1) < -1) {
              var1 = wk.field_l.field_w;
              var2 = wk.field_l.field_n;
              var3 = km.field_e.field_n;
              var4 = -var3 + an.field_f;
              var5 = km.field_e.field_w;
              var6 = -var5 + an.field_j;
              var7 = an.field_f - var1;
              var8 = an.field_j - var1;
              km.field_e.c(0, 0);
              km.field_e.e(var4, 0);
              km.field_e.d(0, var6);
              if (param0 > 68) {
                km.field_e.a(var4, var6);
                de.h(var3, 0, var4, an.field_j);
                var9 = var3;
                L1: while (true) {
                  if (var4 <= var9) {
                    de.h(0, var5, an.field_f, var6);
                    var9 = var5;
                    L2: while (true) {
                      if (var9 >= var6) {
                        de.a();
                        return;
                      } else {
                        hk.field_k.c(0, var9);
                        hk.field_k.e(var7, var9);
                        var9 = var9 + var2;
                        continue L2;
                      }
                    }
                  } else {
                    wk.field_l.c(var9, 0);
                    wk.field_l.d(var9, var8);
                    var9 = var9 + var2;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 1313) {
            return;
        }
        field_G = null;
        field_H = null;
        field_E = null;
        field_I = null;
        field_F = null;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (((li) this).field_K.length <= var6) {
            if (param0) {
              L1: {
                if (((li) this).field_J[((li) this).field_K.length] == param4) {
                  ((li) this).field_D.a((byte) -7);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            if (((li) this).field_J[var6] == param4) {
              ((li) this).field_D.a(((li) this).field_K[var6], 90);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    li(ro param0) {
        super(0, 0, 0, 0, (pf) null);
        ((li) this).field_D = param0;
    }

    final void a(String[] param0, byte param1) {
        int var4_int = 0;
        int var5 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        ((li) this).field_B.c(109);
        if (param0 != null) {
            // if_icmpeq L29
        } else {
            ((li) this).field_K = null;
            return;
        }
        int var3 = param0.length;
        ((li) this).field_K = new String[var3];
        for (var4_int = 0; var4_int < var3; var4_int++) {
            ((li) this).field_K[var4_int] = qo.a((byte) 80, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
        }
        gm var4 = new gm(ia.field_c, 0, 1);
        ((li) this).field_J = new ag[var3 - -1];
        for (var5 = 0; var5 < var3; var5++) {
            ((li) this).field_J[var5] = new ag(((li) this).field_K[var5], (wc) this);
            ((li) this).field_J[var5].field_r = (pf) (Object) var4;
            ((li) this).field_J[var5].field_q = si.field_q;
            ((li) this).field_J[var5].a(15, var5 * 16 + 20, 80, 0, -80);
            ((li) this).c(-82, (qm) (Object) ((li) this).field_J[var5]);
        }
        int var6 = 11 / ((6 - param1) / 42);
        ((li) this).field_J[var3] = new ag(pc.field_d, (wc) this);
        ((li) this).field_J[var3].field_r = (pf) (Object) var4;
        ((li) this).field_J[var3].a(15, (1 + var3) * 16 + 20, 100, 0, -60);
        ((li) this).c(-87, (qm) (Object) ((li) this).field_J[var3]);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Shortcut Reference";
        field_I = "Casting ";
        field_G = "to keep fullscreen or";
        field_E = new byte[]{(byte)7, (byte)10, (byte)2};
    }
}
