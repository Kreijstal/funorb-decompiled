/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterable {
    int field_d;
    static String field_b;
    br[] field_a;
    static boolean field_c;
    private br field_e;

    final br a(long param0, int param1) {
        br var4 = null;
        int var5 = 0;
        br var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.field_a[(int)(param0 & (long)(-1 + this.field_d))];
        this.field_e = var4.field_d;
        var5 = -79 / ((param1 - -3) / 54);
        L0: while (true) {
          if (var4 != this.field_e) {
            if (var7 == 0) {
              if (param0 != this.field_e.field_e) {
                this.field_e = this.field_e.field_d;
                continue L0;
              } else {
                var6 = this.field_e;
                this.field_e = this.field_e.field_d;
                return var6;
              }
            } else {
              return null;
            }
          } else {
            this.field_e = null;
            return null;
          }
        }
    }

    final void a(long param0, byte param1, br param2) {
        br var5 = null;
        try {
            if (!(null == param2.field_b)) {
                param2.a(true);
            }
            var5 = this.field_a[(int)(param0 & (long)(this.field_d + -1))];
            param2.field_d = var5;
            param2.field_b = var5.field_b;
            param2.field_b.field_d = param2;
            param2.field_e = param0;
            if (param1 > 0) {
                this.field_e = (br) null;
            }
            param2.field_d.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static fc a(byte[] param0, int param1) {
        fc discarded$2 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        fc stackIn_4_0 = null;
        fc stackIn_10_0 = null;
        fc stackIn_13_0 = null;
        fc stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_14_0 = null;
        fc stackOut_12_0 = null;
        fc stackOut_9_0 = null;
        fc stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -12) {
                break L1;
              } else {
                var3 = (byte[]) null;
                discarded$2 = wh.a((byte[]) null, -96);
                break L1;
              }
            }
            var2_int = ql.a(true, 0, param0);
            if ((var2_int ^ -1) != -4) {
              if (-5 == (var2_int ^ -1)) {
                stackOut_14_0 = nn.a(-99, param0);
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (-6 == (var2_int ^ -1)) {
                  stackOut_12_0 = jg.a(30270, param0);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var2_int == 6) {
                    stackOut_9_0 = gi.a(param0, -115);
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_3_0 = ee.a(param0, true);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("wh.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new up((wh) (this)));
    }

    public static void a(boolean param0) {
        fc discarded$0 = null;
        if (param0) {
            byte[] var2 = (byte[]) null;
            discarded$0 = wh.a((byte[]) null, -107);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, String param3, String param4) {
        ec.field_b.field_vb = param4;
        ec.field_b.field_wb = param3;
        ec.field_b.field_M = param1;
        ec.field_b.field_zb = ec.field_b.field_zb + ua.field_E.field_zb;
        ua.field_E.field_x = ua.field_E.field_x + ua.field_E.field_zb;
        if (param0 != 6) {
            return;
        }
        try {
            ua.field_E.field_zb = param2;
            ec.field_b.field_zb = ec.field_b.field_zb - ua.field_E.field_zb;
            ua.field_E.field_x = ua.field_E.field_x - ua.field_E.field_zb;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static ja a(int param0, double param1, int param2) {
        ja var5 = null;
        ja var6 = null;
        int var7 = 0;
        int var8 = 0;
        ja var9 = null;
        var9 = new ja(640, 75);
        var9.a();
        oo.a(0, 5, 640, 55, 16777215, 1);
        var5 = new ja(640, 75);
        var5.a();
        ff.field_r.b(sm.field_g[param2], 320, 65, 53248, 1);
        var6 = new ja(640, 75);
        var6.a();
        var7 = (int)(param1 * 640.0);
        if (param0 < 26) {
          return (ja) null;
        } else {
          var8 = (int)(75.0 * param1);
          var5.c((-var7 + 640) / 2, 0, var7, var8);
          var9.e(0, 0);
          var6.g(16777215);
          var6.g(16777215);
          var6.g(1);
          var6.g(1);
          dl.field_h.b((byte) 96);
          return var6;
        }
    }

    wh(int param0) {
        br dupTemp$0 = null;
        br var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_a = new br[param0];
        this.field_d = param0;
        int var2 = 0;
        while (param0 > var2) {
            dupTemp$0 = new br();
            var3 = dupTemp$0;
            this.field_a[var2] = dupTemp$0;
            var3.field_d = var3;
            var3.field_b = var3;
            var2++;
            if (var4 != 0) {
                return;
            }
        }
    }

    static {
        field_c = false;
        field_b = "Miasma";
    }
}
