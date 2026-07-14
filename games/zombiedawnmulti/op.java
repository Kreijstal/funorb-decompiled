/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends ae {
    static String field_l;
    static String field_o;
    private int field_p;
    static String field_n;
    private int field_q;
    static String field_k;
    static String field_j;
    static int field_i;
    static kb field_m;

    final void a(byte param0) {
        super.a((byte) -54);
        mi.field_Kb.a((br) this, false);
        if (param0 > -47) {
            field_l = null;
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 2) {
          if (!op.a(120)) {
            if (rn.field_f != null) {
              if (rn.field_f.field_e) {
                rn.a(param0 ^ -79);
                me.field_k.b(3016, (cf) (Object) new vm(me.field_k, hl.field_b));
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            boolean discarded$4 = me.field_k.a(jk.field_g, (byte) -27, fg.field_j, true);
            me.field_k.h((byte) -109);
            L0: while (true) {
              if (!ba.c(-1)) {
                return;
              } else {
                boolean discarded$5 = me.field_k.a(param0 + -2, pn.field_d, sj.field_p);
                continue L0;
              }
            }
          }
        } else {
          field_l = null;
          if (!op.a(120)) {
            if (rn.field_f != null) {
              if (!rn.field_f.field_e) {
                return;
              } else {
                rn.a(param0 ^ -79);
                me.field_k.b(3016, (cf) (Object) new vm(me.field_k, hl.field_b));
                return;
              }
            } else {
              return;
            }
          } else {
            boolean discarded$6 = me.field_k.a(jk.field_g, (byte) -27, fg.field_j, true);
            me.field_k.h((byte) -109);
            L1: while (true) {
              if (!ba.c(-1)) {
                return;
              } else {
                boolean discarded$7 = me.field_k.a(param0 + -2, pn.field_d, sj.field_p);
                continue L1;
              }
            }
          }
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (param2 != 4) {
          return null;
        } else {
          L0: {
            if (param1) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param3) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return t.field_f[var4];
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            Object var6 = null;
            ((op) this).a(-70, (qd) null);
        }
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          field_n = null;
          super.a(0, param1);
          ((op) this).field_p = param2;
          ((op) this).field_q = param3;
          return;
        } else {
          super.a(0, param1);
          ((op) this).field_p = param2;
          ((op) this).field_q = param3;
          return;
        }
    }

    private final static boolean a(int param0) {
        int var1 = 0;
        var1 = -19 / ((70 - param0) / 45);
        if (me.field_k != null) {
          if (me.field_k.j((byte) -122) == null) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, qd param1) {
        param1.b(((op) this).field_p, (byte) 127, ((op) this).field_q);
        if (param0 != 0) {
            ((op) this).field_p = -21;
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_l = null;
        field_m = null;
        field_j = null;
        field_n = null;
        if (param0 != -9) {
          boolean discarded$2 = op.a(-97);
          field_k = null;
          return;
        } else {
          field_k = null;
          return;
        }
    }

    op() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Disruptive behaviour";
        field_k = "Options";
        field_j = "Melt a zombie into a puddle of goo that will slow down humans. Makes humans a lot easier to catch.";
        field_l = "Please wait...";
        field_n = "<%0> is not a member, and cannot play with the current options.";
        field_i = -1;
    }
}
