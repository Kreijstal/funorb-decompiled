/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sd extends cn {
    static String field_v;
    static int field_s;
    static bd field_w;
    static bd field_t;
    static boolean field_u;

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1 == 0) {
                break L0;
              } else {
                field_v = null;
                break L0;
              }
            }
            try {
              Object discarded$1 = a.a(bn.c(param1 + -1), new Object[1], "resizing", -13730);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_v = null;
        if (param0 != -822203935) {
            Object var2 = null;
            sd.a((fd) null, -34, (java.awt.Frame) null);
        }
        field_t = null;
        field_w = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == 2) {
            break L0;
          } else {
            field_u = true;
            break L0;
          }
        }
        var3 = 0;
        var4 = s.field_g;
        L1: while (true) {
          if (var3 >= hf.field_d.length) {
            return -1;
          } else {
            var5 = jf.field_b[var3];
            if (0 <= var5) {
              var6 = wb.a(111, true, hf.field_d[var3]);
              var7 = -(var6 >> 701548513) + wk.field_c;
              var4 = var4 + cl.field_l;
              if (uk.a(-jd.field_l + var7, param2, var6 + (jd.field_l << 159747617), var4, 124, param1, (ab.field_b << -1673181791) + eh.field_d)) {
                return var5;
              } else {
                var4 = var4 + (eh.field_d + cl.field_l + (ab.field_b << -822203935));
                var3++;
                continue L1;
              }
            } else {
              var4 = var4 + kb.field_d;
              var3++;
              continue L1;
            }
          }
        }
    }

    sd(int param0) {
        this(jd.field_s, param0);
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        if (param4) {
            ij.a(param3.field_x, param3.field_s, param3.field_m + param0, param3.field_v + param1, false);
        }
        super.a(param0, param1, param2, param3, param4);
    }

    sd(vm param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_y, -1, 2147483647, false);
    }

    final static void a(fd param0, int param1, java.awt.Frame param2) {
        kk var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        L0: while (true) {
          var3 = param0.a(7, param2);
          L1: while (true) {
            if (var3.field_f != 0) {
              if ((var3.field_f ^ -1) == -2) {
                L2: {
                  param2.setVisible(false);
                  param2.dispose();
                  if (param1 < -98) {
                    break L2;
                  } else {
                    var5 = null;
                    sd.a((fd) null, 120, (java.awt.Frame) null);
                    break L2;
                  }
                }
                return;
              } else {
                vj.a(100L, (byte) -49);
                continue L0;
              }
            } else {
              vj.a(10L, (byte) -49);
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Loading sound effects";
    }
}
