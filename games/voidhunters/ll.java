/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ll extends rqa {
    static aja field_p;
    static boolean field_o;

    final static int a(int param0) {
        int var1 = 17 / ((param0 + 41) / 54);
        ho.field_a.a(0);
        if (!ff.field_o.e(0)) {
          return vq.g(-6269);
        }
        return 0;
    }

    ll(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = false;
          }
          stackIn_3_0 = new nc(frb.a(15, 75));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ll.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 == 1) {
          return;
        }
        field_o = false;
    }

    final static void e(byte param0) {
        File var1_ref = null;
        Object var1 = null;
        if (param0 != -120) {
          field_p = (aja) null;
        }
        try {
          var1_ref = lfb.a(ata.field_L, (byte) 34);
        } catch (Exception exception) {
        }
        if (var1_ref == null) {
          return;
        }
        Object var2 = asa.a(var1_ref, (byte) -48);
        if (var2 instanceof Hashtable) {
          wqb.field_e = (Hashtable) (var2);
          return;
        }
    }

    final static int a(boolean param0, byte param1) {
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        var5 = VoidHunters.field_G;
        try {
          ao.field_o = ao.field_o + 65536;
          while (jca.a(si.field_r, ao.field_o, (byte) 74) >= 65536) {
            ao.field_o = ao.field_o - si.field_r;
          }
          var2_int = -1;
          if (lqa.field_p != null) {
            var2_int = lqa.field_p.length;
          } else {
            if (via.field_a != null) {
              var2_int = via.field_a.length;
            }
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (si.field_s > otb.field_q) {
              otb.field_q = otb.field_q + 1;
              if (si.field_p < otb.field_q && (null == lqa.field_p ||
                null == lqa.field_p[pa.field_b])) {
                otb.field_q = otb.field_q - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (otb.field_q >= si.field_s &&
                  lqa.field_p[(pa.field_b + 1) % var2_int] == null) {
                  otb.field_q = otb.field_q - 1;
                }
              }
            }
            if (otb.field_q >= si.field_s) {
              otb.field_q = otb.field_q - si.field_s;
              if (!gt.field_q) {
                pa.field_b = pa.field_b - 1;
                if (pa.field_b < 0) {
                  pa.field_b = pa.field_b + var2_int;
                }
              } else {
                pa.field_b = pa.field_b + 1;
                if (var2_int <= pa.field_b) {
                  pa.field_b = pa.field_b - var2_int;
                }
              }
            }
            if (otb.field_q > si.field_p) {
              gt.field_q = true;
            }
          }
          if (so.field_e != null) {
            var3 = 357 - so.field_e.field_n / 2;
            var4 = 0;
            if (pba.field_o != 0 &&
              var3 < qs.field_a &&
              qs.field_a < var3 + so.field_e.field_p) {
              if (269 - so.field_e.field_q < oq.field_H &&
                269 > oq.field_H) {
                otb.field_q = si.field_s;
                gt.field_q = false;
                var4 = 1;
              }
              if (oq.field_H > 586 &&
                oq.field_H < 586 + so.field_e.field_q) {
                otb.field_q = si.field_s;
                var4 = 1;
                gt.field_q = true;
              }
            }
            if (var4 == 0 &&
              otb.field_q > si.field_p &&
              var3 < uia.field_b &&
              so.field_e.field_p + var3 > uia.field_b) {
              if (269 - so.field_e.field_q < kc.field_b &&
                kc.field_b < 269) {
                otb.field_q = si.field_p;
              }
              if (586 < kc.field_b &&
                kc.field_b < so.field_e.field_q + 586) {
                otb.field_q = si.field_p;
              }
            }
          }
          var3Lifetime1 = 13 % ((param1 + 42) / 37);
          if (!param0) {
            return 0;
          }
          nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
          if (nna.field_z.e((byte) -120)) {
            if (nna.field_z.field_j == 0) {
              stackIn_61_0 = 3;
              return stackIn_61_0;
            }
            if (nna.field_z.field_j == 1) {
              stackIn_65_0 = 2;
              return stackIn_65_0;
            }
          }
          stackIn_68_0 = 127;
          while (true) {
            if (!ata.e(stackIn_68_0)) {
              stackIn_82_0 = 0;
              return stackIn_82_0;
            }
            nna.field_z.a(false, 0);
            if (nna.field_z.e((byte) -127)) {
              if (0 == nna.field_z.field_j) {
                stackIn_74_0 = 3;
                return stackIn_74_0;
              }
              if (nna.field_z.field_j == 1) {
                stackIn_77_0 = 1;
                return stackIn_77_0;
              }
            }
            if (pma.field_o != 13) {
              stackIn_68_0 = 127;
              continue;
            }
            break;
          }
          stackIn_80_0 = 1;
          return stackIn_80_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "ll.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_o = true;
    }
}
