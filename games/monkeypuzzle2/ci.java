/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static oe field_a;
    static int[] field_c;
    static int field_b;
    static le field_d;

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -2865) {
                break L1;
              } else {
                ci.b((byte) -111);
                break L1;
              }
            }
            ge.h(80, 0, 560, 480);
            var1_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var1_int ^ -1) <= -17) {
                    break L4;
                  } else {
                    var2 = -pe.field_d[1 + var1_int].field_e[0] + pe.field_d[var1_int].field_e[0];
                    var3 = -pe.field_d[1 + var1_int].field_e[1] + pe.field_d[var1_int].field_e[1];
                    var4 = (int)(65535.0 * (be.field_b - Math.atan2((double)var3, (double)var2) - 1.5707963267948966) / 6.283185307179586);
                    dj.field_a[0].a(dj.field_a[0].field_m << -1924125949, 0, (int)pe.field_d[var1_int].field_e[0] << -1905716796, (int)pe.field_d[var1_int].field_e[1] << -1960037916, var4, 4096);
                    var1_int++;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ge.h(0, 0, 640, 480);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "ci.C(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6) {
        if (param0 != 30380) {
            return;
        }
        try {
            b.field_j[param4] = param5;
            fl.field_a[param4] = param1;
            tj.field_c[param4] = param2;
            i.field_r[param4] = param6;
            mc.field_b[param4] = param3;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ci.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    public static void b(byte param0) {
        field_d = null;
        int var1 = -69 % ((-87 - param0) / 32);
        field_a = null;
        field_c = null;
    }

    final static boolean a(byte param0) {
        if (param0 != 78) {
            ci.b((byte) -103);
            return v.field_c;
        }
        return v.field_c;
    }

    static {
        field_c = new int[8192];
        field_a = null;
    }
}
