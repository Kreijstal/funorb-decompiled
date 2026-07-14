/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends am {
    static String field_L;
    static boolean field_K;
    static String field_J;
    static nf[] field_M;

    public static void g(byte param0) {
        field_M = null;
        field_J = null;
        field_L = null;
        if (param0 < 57) {
            s.g((byte) -22);
        }
    }

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        qe var7 = null;
        super.a(-51, param1, param2, param3, param4, param5);
        var7 = rk.field_k;
        if (param0 <= -18) {
          if (var7 != null) {
            if (((s) this).a(param2, (byte) 123, param5, param4, param1)) {
              if (!(((s) this).field_t instanceof sn)) {
                if (!(var7.field_t instanceof sn)) {
                  return;
                } else {
                  ((sn) (Object) var7.field_t).a((s) this, var7, (byte) 105);
                  rk.field_k = null;
                  return;
                }
              } else {
                ((sn) (Object) ((s) this).field_t).a((s) this, var7, (byte) 105);
                rk.field_k = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_J = null;
          if (var7 != null) {
            if (((s) this).a(param2, (byte) 123, param5, param4, param1)) {
              if (!(((s) this).field_t instanceof sn)) {
                if (!(var7.field_t instanceof sn)) {
                  return;
                } else {
                  ((sn) (Object) var7.field_t).a((s) this, var7, (byte) 105);
                  rk.field_k = null;
                  return;
                }
              } else {
                ((sn) (Object) ((s) this).field_t).a((s) this, var7, (byte) 105);
                rk.field_k = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void h(int param0) {
        int var2 = 0;
        pe var3_ref_pe = null;
        int var3 = 0;
        gg var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        hb var9 = null;
        byte[] var13 = null;
        var6 = Confined.field_J ? 1 : 0;
        var9 = e.field_c;
        var2 = var9.c(32);
        if (param0 != var2) {
          if (1 == var2) {
            var3 = var9.f((byte) 36);
            var4 = (gg) (Object) gj.field_b.a(-117);
            L0: while (true) {
              if (var4 == null) {
                if (var4 == null) {
                  dc.d(116);
                  return;
                } else {
                  var4.a(true);
                  return;
                }
              } else {
                if (var4.field_o != var3) {
                  var4 = (gg) (Object) gj.field_b.d(2123);
                  continue L0;
                } else {
                  if (var4 == null) {
                    dc.d(116);
                    return;
                  } else {
                    var4.a(true);
                    return;
                  }
                }
              }
            }
          } else {
            mb.a("A1: " + ui.a(10), true, (Throwable) null);
            dc.d(116);
            return;
          }
        } else {
          var3_ref_pe = (pe) (Object) gh.field_e.a(param0 + 38);
          if (var3_ref_pe == null) {
            dc.d(111);
            return;
          } else {
            L1: {
              var4_int = var9.c(32);
              if (var4_int == 0) {
                var5 = null;
                break L1;
              } else {
                var13 = new byte[var4_int];
                var9.a(0, (byte) 115, var4_int, var13);
                break L1;
              }
            }
            var9.field_n = var9.field_n + 4;
            if (!var9.e(4)) {
              dc.d(119);
              return;
            } else {
              var3_ref_pe.a(true);
              return;
            }
          }
        }
    }

    private s(int param0, int param1, int param2, int param3, fe param4, uk param5, fj param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((s) this).field_H = param6;
    }

    final static int a(bn param0, bn param1, byte param2) {
        Object var4 = null;
        if (param2 >= -84) {
          s.g((byte) 110);
          var4 = null;
          return ai.a(0, (String) null, param0, false, 0, 126, param1);
        } else {
          var4 = null;
          return ai.a(0, (String) null, param0, false, 0, 126, param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "S";
        field_J = "Close";
        field_K = false;
    }
}
