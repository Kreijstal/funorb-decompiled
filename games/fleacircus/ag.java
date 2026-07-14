/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ag {
    private li field_b;
    private int field_g;
    private wf field_c;
    static String field_e;
    private int field_d;
    static int field_f;
    static volatile boolean field_a;

    final void a(Object param0, byte param1, long param2) {
        this.a(1, param2, param0, -127);
        if (param1 != -122) {
            field_a = true;
        }
    }

    private final void a(int param0, long param1, Object param2, int param3) {
        cb var6_ref_cb = null;
        int var8 = fleas.field_A ? 1 : 0;
        if (!(param0 <= ((ag) this).field_g)) {
            throw new IllegalStateException();
        }
        this.a(param1, (byte) 94);
        ((ag) this).field_d = ((ag) this).field_d - param0;
        while (((ag) this).field_d < 0) {
            var6_ref_cb = (cb) (Object) ((ag) this).field_c.d(-27593);
            this.a(var6_ref_cb, 28);
        }
        int var6 = -125 % ((48 - param3) / 46);
        pj var7 = new pj(param2, param0);
        ((ag) this).field_b.a(param1, (lh) (Object) var7, (byte) 43);
        ((ag) this).field_c.a(-99, (pa) (Object) var7);
        ((cb) (Object) var7).field_j = 0L;
    }

    private final void a(long param0, byte param1) {
        if (param1 != 94) {
            return;
        }
        cb var4 = (cb) (Object) ((ag) this).field_b.a(true, param0);
        this.a(var4, 13);
    }

    private ag() throws Throwable {
        throw new Error();
    }

    final static rh a(boolean param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        try {
            ah var6 = null;
            IOException var6_ref = null;
            ah var7 = null;
            cg var8 = null;
            rh stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            rh stackOut_14_0 = null;
            try {
              L0: {
                var6 = null;
                var7 = null;
                if (null != mh.field_x.field_q) {
                  rd.field_c = new k(mh.field_x.field_q, 5200, 0);
                  mh.field_x.field_q = null;
                  var6 = new ah(255, rd.field_c, new k(mh.field_x.field_t, 12000, 0), 2097152);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (rd.field_c == null) {
                  break L1;
                } else {
                  L2: {
                    if (mc.field_c != null) {
                      break L2;
                    } else {
                      mc.field_c = new k[mh.field_x.field_l.length];
                      break L2;
                    }
                  }
                  L3: {
                    if (mc.field_c[param1] != null) {
                      break L3;
                    } else {
                      mc.field_c[param1] = new k(mh.field_x.field_l[param1], 12000, 0);
                      mh.field_x.field_l[param1] = null;
                      break L3;
                    }
                  }
                  var7 = new ah(param1, rd.field_c, mc.field_c[param1], 2097152);
                  break L1;
                }
              }
              L4: {
                if (param5 == 1) {
                  break L4;
                } else {
                  ag.a(7);
                  break L4;
                }
              }
              L5: {
                var8 = gf.field_e.a(28742, param2, var7, var6, param1);
                if (param0) {
                  var8.c(param5 + -78);
                  break L5;
                } else {
                  break L5;
                }
              }
              stackOut_14_0 = new rh((gi) (Object) var8, param4, param3);
              stackIn_15_0 = stackOut_14_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_15_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final Object a(byte param0, long param1) {
        int var5 = 0;
        Object var6 = null;
        pj var7 = null;
        cb var8 = null;
        var8 = (cb) (Object) ((ag) this).field_b.a(true, param1);
        var5 = 60 / ((-15 - param0) / 34);
        if (var8 != null) {
          var6 = var8.g(5);
          if (var6 == null) {
            var8.c(-1);
            var8.e(30);
            ((ag) this).field_d = ((ag) this).field_d + var8.field_r;
            return null;
          } else {
            L0: {
              if (var8.c((byte) -52)) {
                var7 = new pj(var6, var8.field_r);
                ((ag) this).field_b.a(var8.field_c, (lh) (Object) var7, (byte) 43);
                ((ag) this).field_c.a(-36, (pa) (Object) var7);
                ((cb) (Object) var7).field_j = 0L;
                var8.c(-1);
                var8.e(90);
                break L0;
              } else {
                ((ag) this).field_c.a(-123, (pa) (Object) var8);
                var8.field_j = 0L;
                break L0;
              }
            }
            return var6;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_f = 5;
            field_e = null;
            return;
        }
        field_e = null;
    }

    private final void a(cb param0, int param1) {
        L0: {
          if (param0 != null) {
            param0.c(-1);
            param0.e(-118);
            ((ag) this).field_d = ((ag) this).field_d + param0.field_r;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 <= 3) {
          field_e = null;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_a = false;
    }
}
