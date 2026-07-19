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
        if (null != this.field_l) {
          if (param0) {
            this.field_o = -4L;
            this.field_l.field_i = this.field_i;
            this.field_i.field_l = this.field_l;
            this.field_i = null;
            this.field_l = null;
            return;
          } else {
            this.field_l.field_i = this.field_i;
            this.field_i.field_l = this.field_l;
            this.field_i = null;
            this.field_l = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                field_m = (o) null;
                break L1;
              }
            }
            var9 = nk.field_N;
            var2 = var9.f(param0 + 257);
            if (-1 == (var2 ^ -1)) {
              var8 = (tc) ((Object) df.field_c.b((byte) 107));
              if (var8 == null) {
                ql.a(-78);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var4 = var9.f(255);
                  if (var4 != 0) {
                    var13 = new byte[var4];
                    var9.a(true, var4, var13, 0);
                    break L2;
                  } else {
                    var5 = null;
                    break L2;
                  }
                }
                var9.field_m = var9.field_m + 4;
                if (!var9.e(-6142)) {
                  ql.a(-97);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var8.a(false);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              if (-2 != (var2 ^ -1)) {
                rg.a((Throwable) null, "A1: " + ni.c(6), -562);
                ql.a(param0 ^ 117);
                return;
              } else {
                var3 = var9.i(param0 + 257);
                var4_ref_ie = (ie) ((Object) pa.field_e.b((byte) 61));
                L3: while (true) {
                  L4: {
                    if (var4_ref_ie == null) {
                      break L4;
                    } else {
                      if (var3 != var4_ref_ie.field_k) {
                        var4_ref_ie = (ie) ((Object) pa.field_e.d(8192));
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4_ref_ie == null) {
                    ql.a(-85);
                    decompiledRegionSelector0 = 0;
                    break L0;
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
          throw bd.a((Throwable) ((Object) var1), "rk.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
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
        field_j = new java.util.zip.CRC32();
    }
}
