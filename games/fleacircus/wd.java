/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wd {
    static wh field_b;
    static vg field_a;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a() {
        lh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        hi var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (hi) (Object) bf.field_e.c((byte) 47);
            L1: while (true) {
              if (var4 == null) {
                var2 = rj.field_i.c((byte) 47);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    ki.a(4, 1);
                    var2 = rj.field_i.b((byte) -105);
                    continue L2;
                  }
                }
              } else {
                int discarded$2 = 1;
                sc.a(4, var4);
                var4 = (hi) (Object) bf.field_e.b((byte) -105);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "wd.D(" + -29250 + ',' + 4 + ')');
        }
    }

    final static void a(boolean param0, int param1, kc param2, int param3, boolean param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              ue.field_a[0] = jj.field_R.nextInt();
              ue.field_a[1] = jj.field_R.nextInt();
              ue.field_a[2] = (int)(ug.field_a >> 32);
              sd.field_i.field_i = 0;
              ue.field_a[3] = (int)ug.field_a;
              sd.field_i.a(ue.field_a[0], (byte) -23);
              sd.field_i.a(ue.field_a[1], (byte) -100);
              sd.field_i.a(ue.field_a[2], (byte) -96);
              var5_int = 0;
              sd.field_i.a(ue.field_a[3], (byte) -104);
              int discarded$1 = -113;
              lc.a(sd.field_i);
              sd.field_i.b((byte) 99, param3);
              param2.a(sd.field_i, (byte) -100);
              ud.field_b.field_i = 0;
              if (param0) {
                ud.field_b.a(-11, 18);
                break L1;
              } else {
                ud.field_b.a(-11, 16);
                break L1;
              }
            }
            L2: {
              ud.field_b.field_i = ud.field_b.field_i + 2;
              var6 = ud.field_b.field_i;
              ud.field_b.a(pc.field_j, (byte) -125);
              ud.field_b.a(-108, c.field_P);
              var7 = 0;
              if (!va.field_m) {
                break L2;
              } else {
                var7 = var7 | 1;
                break L2;
              }
            }
            L3: {
              if (!bk.field_e) {
                break L3;
              } else {
                var7 = var7 | 4;
                break L3;
              }
            }
            L4: {
              if (!param4) {
                break L4;
              } else {
                var7 = var7 | 8;
                break L4;
              }
            }
            L5: {
              if (wc.field_p == null) {
                break L5;
              } else {
                var7 = var7 | 16;
                break L5;
              }
            }
            L6: {
              ud.field_b.a(-11, var7);
              var8 = w.a(0, rl.a((byte) -75));
              if (var8 == null) {
                var8 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              ud.field_b.a(116, var8);
              if (null != wc.field_p) {
                ud.field_b.a(wc.field_p, (byte) -87);
                break L7;
              } else {
                break L7;
              }
            }
            cg.a(fj.field_c, -111, sd.field_i, (ni) (Object) ud.field_b, de.field_k);
            ud.field_b.a((byte) 119, -var6 + ud.field_b.field_i);
            dk.b((byte) 41, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(-120).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
    }

    final static String a(byte param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hh.field_c.setTime(new Date(param1));
        var3 = hh.field_c.get(7);
        if (param0 > -7) {
          return null;
        } else {
          var4 = hh.field_c.get(5);
          var5 = hh.field_c.get(2);
          var6 = hh.field_c.get(1);
          var7 = hh.field_c.get(11);
          var8 = hh.field_c.get(12);
          var9 = hh.field_c.get(13);
          return th.field_m[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + md.field_P[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new wh("usename");
    }
}
