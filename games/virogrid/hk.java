/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends km {
    static long field_Kb;
    static int field_Jb;
    static String field_Ib;
    static int field_Hb;
    static String field_Gb;
    private km field_Nb;
    static volatile int field_Mb;
    static String field_Eb;
    km field_Fb;
    static boolean[] field_Lb;
    static e field_Ob;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, mg[] param8, byte param9, mg[] param10, boolean param11, int param12, String param13, e param14) {
        wm.a(new wg(param8), oe.field_f, param3, qg.field_w, param5, param1, param0, param5, na.field_Hb, param12, param7, param4, new wg(param10), param14, param14, sf.field_I, param9 + -118, la.field_k, param12, jf.field_o);
        fe.a((byte) 45, param11, param2, param6, param13);
        if (param9 != 118) {
            Object var16 = null;
            hk.a(104, -22, 108, 67, 68, -43, true, 54, (mg[]) null, (byte) 44, (mg[]) null, false, 44, (String) null, (e) null);
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = -param2;
          if (null == ((hk) this).field_Nb) {
            break L0;
          } else {
            var4 = ((hk) this).field_Nb.c((byte) 83);
            break L0;
          }
        }
        L1: {
          var5 = -param2;
          if (((hk) this).field_Fb == null) {
            break L1;
          } else {
            var5 = ((hk) this).field_Fb.a(-param2 + (-var4 + -param0) + ((hk) this).field_K + -param0, (byte) 71);
            break L1;
          }
        }
        L2: {
          var6 = param2 + (param0 - -var4 - (-var5 + -param0));
          if (((hk) this).field_K >= var6) {
            break L2;
          } else {
            var5 = var5 + (-var6 + ((hk) this).field_K);
            var6 = ((hk) this).field_K;
            break L2;
          }
        }
        L3: {
          if (1 != ((hk) this).field_lb) {
            break L3;
          } else {
            param0 = param0 + (((hk) this).field_K + -var6) / 2;
            break L3;
          }
        }
        L4: {
          if (-3 != (((hk) this).field_lb ^ -1)) {
            break L4;
          } else {
            param0 = param0 + (((hk) this).field_K + -var6);
            break L4;
          }
        }
        L5: {
          if (null != ((hk) this).field_Nb) {
            ((hk) this).field_Nb.a(param0, ((hk) this).field_ub, var4, (byte) -100, 0);
            ((hk) this).field_Nb.field_D = ((hk) this).field_D;
            break L5;
          } else {
            break L5;
          }
        }
        if (null == ((hk) this).field_Fb) {
          if (param1 >= -51) {
            this.b(25, -10, -111);
            return;
          } else {
            return;
          }
        } else {
          ((hk) this).field_Fb.a(var4 + param0 - -param2, ((hk) this).field_ub, var5, (byte) -96, 0);
          if (((hk) this).field_Nb == null) {
            ((hk) this).field_Fb.field_lb = ((hk) this).field_lb;
            ((hk) this).field_Fb.field_D = ((hk) this).field_D;
            if (param1 < -51) {
              return;
            } else {
              this.b(25, -10, -111);
              return;
            }
          } else {
            ((hk) this).field_Fb.field_lb = 0;
            ((hk) this).field_Fb.field_D = ((hk) this).field_D;
            if (param1 < -51) {
              return;
            } else {
              this.b(25, -10, -111);
              return;
            }
          }
        }
    }

    public static void d(boolean param0) {
        if (param0) {
            hk.d(true);
            field_Ib = null;
            field_Lb = null;
            field_Gb = null;
            field_Ob = null;
            field_Eb = null;
            return;
        }
        field_Ib = null;
        field_Lb = null;
        field_Gb = null;
        field_Ob = null;
        field_Eb = null;
    }

    final int c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = -param1;
        if (param0 > -76) {
          return -30;
        } else {
          L0: {
            if (((hk) this).field_Nb == null) {
              break L0;
            } else {
              var4 = ((hk) this).field_Nb.c((byte) 70);
              break L0;
            }
          }
          L1: {
            var5 = -param1;
            if (((hk) this).field_Fb == null) {
              break L1;
            } else {
              var5 = ((hk) this).field_Fb.c((byte) 56);
              break L1;
            }
          }
          return param2 + (param1 + param2) - (-var4 + -var5);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 != 2) {
          field_Ob = null;
          ((hk) this).a(param1, param5, param0, (byte) -47, param3);
          this.b(param6, -94, param4);
          return;
        } else {
          ((hk) this).a(param1, param5, param0, (byte) -47, param3);
          this.b(param6, -94, param4);
          return;
        }
    }

    hk(long param0, km param1, km param2, km param3, mg param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((hk) this).field_Nb = new km(0L, param2);
            ((hk) this).field_Nb.field_qb = param4;
            ((hk) this).a(0, ((hk) this).field_Nb);
        }
        if (param5 != null) {
            ((hk) this).field_Fb = new km(0L, param3, param5);
            ((hk) this).a(0, ((hk) this).field_Fb);
        }
        ((hk) this).b((byte) 42);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = 0;
        field_Ib = "Rated game";
        field_Gb = "Next";
        field_Mb = 0;
        field_Eb = "Private";
        field_Hb = 0;
    }
}
