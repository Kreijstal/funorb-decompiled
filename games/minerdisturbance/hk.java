/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    private int field_f;
    static ec field_i;
    private int field_b;
    private sd field_g;
    private qc field_h;
    static ea[] field_a;
    static String field_d;
    static int field_e;
    static String field_c;

    private final void a(int param0, bl param1) {
        if (param0 >= -47) {
          return;
        } else {
          L0: {
            if (param1 == null) {
              break L0;
            } else {
              param1.b(34);
              param1.a((byte) -120);
              ((hk) this).field_b = ((hk) this).field_b + param1.field_y;
              break L0;
            }
          }
          return;
        }
    }

    public static void d(int param0) {
        field_c = null;
        int var1 = -41 / ((param0 - 63) / 61);
        field_d = null;
        field_a = null;
        field_i = null;
    }

    final static int[] b(int param0) {
        if (param0 != 0) {
            return null;
        }
        return new int[8];
    }

    final static boolean a(int param0) {
        Object var1 = null;
        tm var1_ref = null;
        int var2 = 0;
        tm var3 = null;
        tm var4 = null;
        tm var5 = null;
        if (param0 == 27) {
          var1 = null;
          var2 = 0;
          if (ec.field_c.e((byte) 123)) {
            L0: {
              if (ok.field_b.e((byte) 123)) {
                break L0;
              } else {
                L1: {
                  var4 = (tm) (Object) ok.field_b.b(120);
                  if (var4.a(param0 + -19)) {
                    pi discarded$2 = ok.field_b.e(63854);
                    var2 = 1;
                    vc.a(109, cm.field_o, var4.field_s);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var1_ref = (tm) (Object) ok.field_b.b(96);
                break L0;
              }
            }
            L2: {
              if (var1_ref == null) {
                break L2;
              } else {
                if (var2 != 0) {
                  var1_ref.a(false);
                  break L2;
                } else {
                  if (fm.a((byte) 95)) {
                    fn.a(27, 228, 3);
                    return ak.a(-92);
                  } else {
                    return ak.a(-92);
                  }
                }
              }
            }
            if (fm.a((byte) 95)) {
              fn.a(27, 228, 3);
              return ak.a(-92);
            } else {
              return ak.a(-92);
            }
          } else {
            L3: {
              var3 = (tm) (Object) ec.field_c.b(81);
              if (var3.a(param0 ^ 19)) {
                pi discarded$3 = ec.field_c.e(63854);
                vc.a(-8, cm.field_o, var3.field_s);
                var2 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            var5 = (tm) (Object) ec.field_c.b(param0 + 92);
            if (var5 != null) {
              L4: {
                if (var2 != 0) {
                  var5.a(false);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (!fm.a((byte) 95)) {
                return ak.a(-92);
              } else {
                fn.a(27, 228, 3);
                return ak.a(-92);
              }
            } else {
              if (fm.a((byte) 95)) {
                fn.a(27, 228, 3);
                return ak.a(-92);
              } else {
                return ak.a(-92);
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0) {
        nb.field_i[oj.field_J].c(-1, mc.field_w);
        if (param0 >= -117) {
            field_e = 125;
        }
    }

    final Object a(long param0, byte param1) {
        oh var6 = null;
        bl var7 = null;
        Object var8 = null;
        Object var9 = null;
        var7 = (bl) (Object) ((hk) this).field_g.a(-94, param0);
        if (var7 != null) {
          if (param1 >= 56) {
            var9 = var7.f(-47);
            if (var9 != null) {
              if (var7.h(0)) {
                var6 = new oh(var9, var7.field_y);
                ((hk) this).field_g.a(var7.field_d, true, (pi) (Object) var6);
                ((hk) this).field_h.a((byte) -37, (al) (Object) var6);
                ((bl) (Object) var6).field_p = 0L;
                var7.b(34);
                var7.a((byte) -121);
                return var9;
              } else {
                ((hk) this).field_h.a((byte) -37, (al) (Object) var7);
                var7.field_p = 0L;
                return var9;
              }
            } else {
              var7.b(34);
              var7.a((byte) -95);
              ((hk) this).field_b = ((hk) this).field_b + var7.field_y;
              return null;
            }
          } else {
            field_c = null;
            var8 = var7.f(-47);
            if (var8 != null) {
              if (var7.h(0)) {
                var6 = new oh(var8, var7.field_y);
                ((hk) this).field_g.a(var7.field_d, true, (pi) (Object) var6);
                ((hk) this).field_h.a((byte) -37, (al) (Object) var6);
                ((bl) (Object) var6).field_p = 0L;
                var7.b(34);
                var7.a((byte) -121);
                return var8;
              } else {
                ((hk) this).field_h.a((byte) -37, (al) (Object) var7);
                var7.field_p = 0L;
                return var8;
              }
            } else {
              var7.b(34);
              var7.a((byte) -95);
              ((hk) this).field_b = ((hk) this).field_b + var7.field_y;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(Object param0, int param1, int param2, long param3) {
        oh var6 = null;
        bl var6_ref = null;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        if (((hk) this).field_f < param1) {
          throw new IllegalStateException();
        } else {
          this.a(-4924, param3);
          ((hk) this).field_b = ((hk) this).field_b - param1;
          L0: while (true) {
            if (-1 >= (((hk) this).field_b ^ -1)) {
              var6 = new oh(param0, param1);
              ((hk) this).field_g.a(param3, true, (pi) (Object) var6);
              ((hk) this).field_h.a((byte) -37, (al) (Object) var6);
              ((bl) (Object) var6).field_p = (long)param2;
              return;
            } else {
              var6_ref = (bl) (Object) ((hk) this).field_h.a(609);
              this.a(-127, var6_ref);
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, long param1) {
        Object var4 = null;
        bl var5 = null;
        var4 = null;
        if (param0 != -4924) {
          int[] discarded$2 = hk.b(34);
          var5 = (bl) (Object) ((hk) this).field_g.a(param0 + 4856, param1);
          this.a(param0 + 4846, var5);
          return;
        } else {
          var5 = (bl) (Object) ((hk) this).field_g.a(param0 + 4856, param1);
          this.a(param0 + 4846, var5);
          return;
        }
    }

    final static void c(int param0) {
        if (param0 > -94) {
          field_c = null;
          de.field_a.a((byte) -116, (fe) (Object) new qd());
          return;
        } else {
          de.field_a.a((byte) -116, (fe) (Object) new qd());
          return;
        }
    }

    private hk() throws Throwable {
        throw new Error();
    }

    final void a(int param0, long param1, Object param2) {
        if (param0 != 6565) {
            return;
        }
        this.a(param2, 1, 0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ec(3);
        field_c = "Go Back";
        field_e = 0;
        field_d = "Back";
    }
}
