/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private si field_e;
    private int field_c;
    static int field_a;
    static boolean field_d;
    private uh field_b;
    static int[] field_h;
    private int field_f;
    static String field_g;

    private final void a(int param0, long param1) {
        vi var4 = null;
        Object var5 = null;
        vi var6 = null;
        if (param0 != 0) {
          var5 = null;
          la.a((ji) null, 118);
          vi dupTemp$4 = (vi) (Object) ((la) this).field_e.a(param1, (byte) -37);
          var6 = dupTemp$4;
          var4 = dupTemp$4;
          this.a(-124, var6);
          return;
        } else {
          vi dupTemp$5 = (vi) (Object) ((la) this).field_e.a(param1, (byte) -37);
          var6 = dupTemp$5;
          var4 = dupTemp$5;
          this.a(-124, var6);
          return;
        }
    }

    final Object a(long param0, byte param1) {
        Object var5 = null;
        ua var6 = null;
        vi var7 = null;
        var7 = (vi) (Object) ((la) this).field_e.a(param0, (byte) -37);
        if (var7 != null) {
          L0: {
            var5 = var7.c(-1);
            if (param1 < -9) {
              break L0;
            } else {
              Object discarded$1 = ((la) this).a(69L, (byte) -13);
              break L0;
            }
          }
          if (var5 == null) {
            var7.b((byte) 119);
            var7.e((byte) 92);
            ((la) this).field_c = ((la) this).field_c + var7.field_y;
            return null;
          } else {
            L1: {
              if (var7.g((byte) -83)) {
                var6 = new ua(var5, var7.field_y);
                ((la) this).field_e.a(var7.field_i, false, (bh) (Object) var6);
                ((la) this).field_b.a((byte) 4, (be) (Object) var6);
                ((vi) (Object) var6).field_r = 0L;
                var7.b((byte) 106);
                var7.e((byte) 125);
                break L1;
              } else {
                ((la) this).field_b.a((byte) 4, (be) (Object) var7);
                var7.field_r = 0L;
                break L1;
              }
            }
            return var5;
          }
        } else {
          return null;
        }
    }

    final void a(Object param0, long param1, int param2) {
        this.a(param1, (byte) 77, 1, param0);
        if (param2 < 3) {
            this.a(94, -31L);
        }
    }

    private final void a(long param0, byte param1, int param2, Object param3) {
        vi var6 = null;
        ua var6_ref = null;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        if (param2 > ((la) this).field_f) {
          throw new IllegalStateException();
        } else {
          this.a(param1 + -77, param0);
          ((la) this).field_c = ((la) this).field_c - param2;
          L0: while (true) {
            if (((la) this).field_c >= 0) {
              var6_ref = new ua(param3, param2);
              ((la) this).field_e.a(param0, false, (bh) (Object) var6_ref);
              ((la) this).field_b.a((byte) 4, (be) (Object) var6_ref);
              if (param1 != 77) {
                la.a((byte) -109);
                ((vi) (Object) var6_ref).field_r = 0L;
                return;
              } else {
                ((vi) (Object) var6_ref).field_r = 0L;
                return;
              }
            } else {
              var6 = (vi) (Object) ((la) this).field_b.a((byte) 67);
              this.a(-122, var6);
              continue L0;
            }
          }
        }
    }

    la(int param0) {
        this(param0, param0);
    }

    final static void a(ji param0, int param1) {
        w var5 = null;
        w var6 = null;
        w var10 = null;
        w var11 = null;
        w var12 = null;
        a.field_p = id.a(param0, "display_name_changed", "basic", param1 ^ 24181);
        k.field_b = new s(0L, id.field_N, o.field_h, fl.field_e);
        ge.field_f = new s(0L, id.field_N, mf.field_V, wk.field_o);
        tb.field_c = new w(0L, (w) null);
        jc.field_c = new w(0L, ua.field_H);
        jc.field_c.field_X = 1;
        tc.field_Ub = new w(0L, fh.field_g, cb.field_h);
        cf.field_d = new w(0L, dd.field_k, qj.field_e);
        jc.field_d = new w(0L, df.field_ab);
        tb.field_c.a(jc.field_c, -16834);
        tb.field_c.a(tc.field_Ub, -16834);
        tb.field_c.a(cf.field_d, -16834);
        tb.field_c.a((w) (Object) k.field_b, param1 ^ -16309);
        tb.field_c.a(jc.field_d, -16834);
        k.field_b.field_Rb.field_Rb.a(param1 ^ -32262, ua.field_H);
        k.field_b.field_Rb.field_Rb.field_W = 1;
        if (param1 != 32373) {
          la.a((byte) 92);
          var5 = k.field_b.field_Rb.field_Rb;
          var6 = var5;
          var5 = var6;
          var6.field_X = 1;
          ge.field_f.field_Rb.field_Rb.a(param1 + -32488, ua.field_H);
          ge.field_f.field_Rb.field_Rb.field_W = 1;
          var12 = ge.field_f.field_Rb.field_Rb;
          var12.field_X = 1;
          return;
        } else {
          var5 = k.field_b.field_Rb.field_Rb;
          var10 = var5;
          var10.field_X = 1;
          ge.field_f.field_Rb.field_Rb.a(param1 + -32488, ua.field_H);
          ge.field_f.field_Rb.field_Rb.field_W = 1;
          var11 = ge.field_f.field_Rb.field_Rb;
          var11.field_X = 1;
          return;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_h = null;
        if (param0 < 36) {
            Object var2 = null;
            la.a((ji) null, 120);
        }
    }

    private final void a(int param0, vi param1) {
        if (param0 > -111) {
          return;
        } else {
          L0: {
            if (param1 != null) {
              param1.b((byte) 105);
              param1.e((byte) 76);
              ((la) this).field_c = ((la) this).field_c + param1.field_y;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    private la(int param0, int param1) {
        int var3 = 0;
        ((la) this).field_b = new uh();
        ((la) this).field_f = param0;
        ((la) this).field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((la) this).field_e = new si(var3);
              return;
            }
          } else {
            ((la) this).field_e = new si(var3);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_g = "End Game";
        field_h = new int[128];
    }
}
