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
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ie var4_ref_ie = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        tc var8 = null;
        mg var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            var9 = nk.field_N;
            var2 = var9.f(255);
            if (var2 == 0) {
              var8 = (tc) (Object) df.field_c.b((byte) 107);
              if (var8 == null) {
                ql.a(-78);
                return;
              } else {
                L1: {
                  var4 = var9.f(255);
                  if (var4 != 0) {
                    var13 = new byte[var4];
                    var9.a(true, var4, var13, 0);
                    break L1;
                  } else {
                    var5 = null;
                    break L1;
                  }
                }
                var9.field_m = var9.field_m + 4;
                if (!var9.e(-6142)) {
                  ql.a(-97);
                  return;
                } else {
                  var8.a(false);
                  break L0;
                }
              }
            } else {
              if (var2 != 1) {
                int discarded$1 = 6;
                rg.a((Throwable) null, "A1: " + ni.c(), -562);
                ql.a(-117);
                return;
              } else {
                var3 = var9.i(255);
                var4_ref_ie = (ie) (Object) pa.field_e.b((byte) 61);
                L2: while (true) {
                  L3: {
                    if (var4_ref_ie == null) {
                      break L3;
                    } else {
                      if (~var3 != ~var4_ref_ie.field_k) {
                        var4_ref_ie = (ie) (Object) pa.field_e.d(8192);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "rk.F(" + -2 + 41);
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
