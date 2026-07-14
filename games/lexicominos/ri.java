/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ri implements ma {
    static oc field_c;
    private long field_a;
    static String field_f;
    static db field_b;
    static String field_d;
    static int field_e;

    public final sc b(byte param0) {
        if (!((ri) this).a(-104)) {
          if (rf.c(0) < ((ri) this).field_a - -350L) {
            return jj.field_e;
          } else {
            if (param0 <= 114) {
              String discarded$2 = ((ri) this).b(34);
              return ((ri) this).b(true);
            } else {
              return ((ri) this).b(true);
            }
          }
        } else {
          return rc.field_a;
        }
    }

    public final void a(boolean param0) {
        ((ri) this).field_a = rf.c(0);
        if (!param0) {
            Object var3 = null;
            Object discarded$0 = ri.a(123, (byte[]) null, true);
        }
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        bh var3 = null;
        if (param1 != null) {
          if (param0 < param1.length) {
            var3 = new bh();
            ((nl) (Object) var3).a(param1, true);
            return (Object) (Object) var3;
          } else {
            if (param2) {
              return (Object) (Object) ld.a(param0 + -30, param1);
            } else {
              return (Object) (Object) param1;
            }
          }
        } else {
          return null;
        }
    }

    public static void c(byte param0) {
        field_d = null;
        if (param0 != 117) {
          ri.c((byte) 46);
          field_b = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    public final String a(byte param0) {
        int var2 = 0;
        var2 = 6 / ((34 - param0) / 42);
        if (!((ri) this).a(110)) {
          if (rf.c(0) < ((ri) this).field_a - -350L) {
            return null;
          } else {
            return ((ri) this).b(66);
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, boolean param1, kb param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        l.field_F[0] = q.field_a.nextInt();
        l.field_F[1] = q.field_a.nextInt();
        l.field_F[2] = (int)(ti.field_M >> 685562592);
        of.field_a.field_h = 0;
        l.field_F[3] = (int)ti.field_M;
        of.field_a.f(l.field_F[0], param3 ^ 32335);
        of.field_a.f(l.field_F[1], -32287);
        of.field_a.f(l.field_F[2], -32287);
        of.field_a.f(l.field_F[3], -32287);
        ed.a(93, of.field_a);
        of.field_a.e(89, param4);
        param2.a(of.field_a, 7895);
        ed.field_q.field_h = 0;
        if (param1) {
          L0: {
            ed.field_q.c(18, -1);
            ed.field_q.field_h = ed.field_q.field_h + 2;
            var5 = ed.field_q.field_h;
            ed.field_q.f(bk.field_a, -32287);
            ed.field_q.a(fa.field_a, (byte) 37);
            var6 = 0;
            if (hl.field_F) {
              var6 = var6 | 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (qb.field_c) {
              var6 = var6 | 4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param0) {
              var6 = var6 | 8;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null == og.field_b) {
              break L3;
            } else {
              var6 = var6 | 16;
              break L3;
            }
          }
          L4: {
            ed.field_q.c(var6, -1);
            var7 = pg.a(kk.c(-14047), (byte) -28);
            if (var7 != null) {
              break L4;
            } else {
              var7 = "";
              break L4;
            }
          }
          ed.field_q.a(var7, (byte) 0);
          if (null != og.field_b) {
            ed.field_q.a((byte) -38, og.field_b);
            wc.a(wb.field_m, (wf) (Object) ed.field_q, re.field_T, (byte) 111, of.field_a);
            ed.field_q.b(-var5 + ed.field_q.field_h, (byte) 26);
            if (param3 == -82) {
              kc.a(-1, -1);
              return;
            } else {
              field_f = null;
              kc.a(-1, -1);
              return;
            }
          } else {
            wc.a(wb.field_m, (wf) (Object) ed.field_q, re.field_T, (byte) 111, of.field_a);
            ed.field_q.b(-var5 + ed.field_q.field_h, (byte) 26);
            if (param3 == -82) {
              kc.a(-1, -1);
              return;
            } else {
              field_f = null;
              kc.a(-1, -1);
              return;
            }
          }
        } else {
          L5: {
            ed.field_q.c(16, -1);
            ed.field_q.field_h = ed.field_q.field_h + 2;
            var5 = ed.field_q.field_h;
            ed.field_q.f(bk.field_a, -32287);
            ed.field_q.a(fa.field_a, (byte) 37);
            var6 = 0;
            if (hl.field_F) {
              var6 = var6 | 1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (qb.field_c) {
              var6 = var6 | 4;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (param0) {
              var6 = var6 | 8;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (null == og.field_b) {
              break L8;
            } else {
              var6 = var6 | 16;
              break L8;
            }
          }
          L9: {
            ed.field_q.c(var6, -1);
            var7 = pg.a(kk.c(-14047), (byte) -28);
            if (var7 != null) {
              break L9;
            } else {
              var7 = "";
              break L9;
            }
          }
          ed.field_q.a(var7, (byte) 0);
          if (null != og.field_b) {
            ed.field_q.a((byte) -38, og.field_b);
            wc.a(wb.field_m, (wf) (Object) ed.field_q, re.field_T, (byte) 111, of.field_a);
            ed.field_q.b(-var5 + ed.field_q.field_h, (byte) 26);
            if (param3 == -82) {
              kc.a(-1, -1);
              return;
            } else {
              field_f = null;
              kc.a(-1, -1);
              return;
            }
          } else {
            wc.a(wb.field_m, (wf) (Object) ed.field_q, re.field_T, (byte) 111, of.field_a);
            ed.field_q.b(-var5 + ed.field_q.field_h, (byte) 26);
            if (param3 == -82) {
              kc.a(-1, -1);
              return;
            } else {
              field_f = null;
              kc.a(-1, -1);
              return;
            }
          }
        }
    }

    abstract sc b(boolean param0);

    abstract String b(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This game has been updated! Please reload this page.";
        field_c = new oc();
        field_d = "Create a free Account";
    }
}
