/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rk extends wl {
    static java.util.zip.CRC32 field_j;
    rk field_l;
    static nk field_k;
    long field_o;
    rk field_i;
    static o field_m;
    static int field_n;

    final void b(boolean param0) {
        if (null != ((rk) this).field_l) {
          if (param0) {
            ((rk) this).field_o = -4L;
            ((rk) this).field_l.field_i = ((rk) this).field_i;
            ((rk) this).field_i.field_l = ((rk) this).field_l;
            ((rk) this).field_i = null;
            ((rk) this).field_l = null;
            return;
          } else {
            ((rk) this).field_l.field_i = ((rk) this).field_i;
            ((rk) this).field_i.field_l = ((rk) this).field_l;
            ((rk) this).field_i = null;
            ((rk) this).field_l = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4_ref = null;
        ie var4_ref_ie = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        tc var8 = null;
        mg var9 = null;
        byte[] var11 = null;
        var4_ref = null;
        var6 = wizardrun.field_H;
        if (param0 == -2) {
          var9 = nk.field_N;
          var2 = var9.f(param0 + 257);
          if (-1 == (var2 ^ -1)) {
            var8 = (tc) (Object) df.field_c.b((byte) 107);
            if (var8 == null) {
              ql.a(-78);
              return;
            } else {
              L0: {
                var4 = var9.f(255);
                if ((var4 ^ -1) != -1) {
                  var11 = new byte[var4];
                  var9.a(true, var4, var11, 0);
                  break L0;
                } else {
                  var5 = null;
                  break L0;
                }
              }
              var9.field_m = var9.field_m + 4;
              if (!var9.e(-6142)) {
                ql.a(-97);
                return;
              } else {
                var8.a(false);
                return;
              }
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              rg.a((Throwable) null, "A1: " + ni.c(6), -562);
              ql.a(param0 ^ 117);
              return;
            } else {
              var3 = var9.i(param0 + 257);
              var4_ref_ie = (ie) (Object) pa.field_e.b((byte) 61);
              L1: while (true) {
                if (var4_ref_ie == null) {
                  if (var4_ref_ie == null) {
                    ql.a(-85);
                    return;
                  } else {
                    var4_ref_ie.a(false);
                    return;
                  }
                } else {
                  if ((var3 ^ -1) != (var4_ref_ie.field_k ^ -1)) {
                    var4_ref_ie = (ie) (Object) pa.field_e.d(8192);
                    continue L1;
                  } else {
                    if (var4_ref_ie == null) {
                      ql.a(-85);
                      return;
                    } else {
                      var4_ref_ie.a(false);
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          field_m = null;
          var9 = nk.field_N;
          var2 = var9.f(param0 + 257);
          if (-1 == (var2 ^ -1)) {
            var8 = (tc) (Object) df.field_c.b((byte) 107);
            if (var8 == null) {
              ql.a(-78);
              return;
            } else {
              L2: {
                var4 = var9.f(255);
                if ((var4 ^ -1) != -1) {
                  var11 = new byte[var4];
                  var9.a(true, var4, var11, 0);
                  break L2;
                } else {
                  var5 = null;
                  break L2;
                }
              }
              var9.field_m = var9.field_m + 4;
              if (!var9.e(-6142)) {
                ql.a(-97);
                return;
              } else {
                var8.a(false);
                return;
              }
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              rg.a((Throwable) null, "A1: " + ni.c(6), -562);
              ql.a(param0 ^ 117);
              return;
            } else {
              var3 = var9.i(param0 + 257);
              var4_ref_ie = (ie) (Object) pa.field_e.b((byte) 61);
              L3: while (true) {
                if (var4_ref_ie != null) {
                  if ((var3 ^ -1) != (var4_ref_ie.field_k ^ -1)) {
                    var4_ref_ie = (ie) (Object) pa.field_e.d(8192);
                    continue L3;
                  } else {
                    if (var4_ref_ie == null) {
                      ql.a(-85);
                      return;
                    } else {
                      var4_ref_ie.a(false);
                      return;
                    }
                  }
                } else {
                  if (var4_ref_ie == null) {
                    ql.a(-85);
                    return;
                  } else {
                    var4_ref_ie.a(false);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    protected rk() {
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_m = null;
        field_j = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new java.util.zip.CRC32();
    }
}
