/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class q {
    static qi field_a;
    static uf field_d;
    static int field_c;
    static int[] field_b;

    final static String b(byte param0) {
        if (!(pf.field_d >= 2)) {
          return aj.field_d;
        }
        if (ml.field_a != null) {
          if (!ml.field_a.b((byte) -115)) {
            return rg.field_f;
          }
          return pb.field_d;
        }
        if (!ah.field_d.b((byte) -115)) {
          return in.field_d;
        }
        if (!ah.field_d.b("commonui", param0 ^ 54)) {
          return ge.field_a + " - " + ah.field_d.a("commonui", 0) + "%";
        }
        if (!am.field_d.b((byte) -63)) {
          return uf.field_d;
        }
        if (!am.field_d.b("commonui", 108)) {
          return wl.field_b + " - " + am.field_d.a("commonui", param0 - 118) + "%";
        }
        if (!ca.field_p.b((byte) -102)) {
          return g.field_l;
        }
        if (param0 != 118) {
          field_b = (int[]) null;
        }
        if (!ca.field_p.a((byte) -63)) {
          return uj.field_b + " - " + ca.field_p.a(param0 - 118) + "%";
        }
        return ng.field_b;
    }

    final static void a(String param0, ql param1, int param2, int param3, byte param4, int param5) {
        try {
          param1.a(param0, param3 + 1, 1 + param5, 8, -1, 114);
          if (param4 > -126) {
            th var7 = (th) null;
            q.a(-69, (th) null);
          }
          param1.b(param0, param3, param5, param2, -1);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "q.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        t var4 = null;
        int var4_int = 0;
        int var5 = 0;
        se var5_ref_se = null;
        int[] var6 = null;
        int var8 = 0;
        da var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = HoldTheLine.field_D;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9 = rd.field_e;
          var2 = var9.f((byte) -62);
          var3 = var9.f((byte) -86);
          if (0 == var2) {
            var4 = (t) (ih.field_j.b((byte) 100));
            if (var4 == null) {
              r.a(-28036);
              return;
            }
            var5 = -var9.field_l + ad.field_c;
            var11 = var4.field_m;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var7 < var5; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.f((byte) -110) << pk.a(var7 << 8, 768));
            }
            var4.d(0);
          } else {
            if (var2 == 1) {
              var4_int = var9.b((byte) -84);
              var5_ref_se = (se) (le.field_n.b((byte) 113));
              while (var5_ref_se != null) {
                if (~var3 != ~var5_ref_se.field_j ||
                  var5_ref_se.field_k != var4_int) {
                  var5_ref_se = (se) (le.field_n.c((byte) -42));
                  continue;
                }
                break;
              }
              if (var5_ref_se == null) {
                r.a(-28036);
                return;
              }
              var5_ref_se.d(0);
              decompiledFrameRemainder0 = false;
            }
            else {
              bl.a((Throwable) null, (byte) 59, "LR1: " + em.b(false));
              r.a(-28036);
            }
          }
          if (param0 != -24) {
            field_a = (qi) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "q.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 < 45) {
          q.a((byte) 104);
        }
        field_a = null;
    }

    final static void a(int param0, int param1) {
        da var2 = da.field_p;
        var2.c((byte) 33, param0);
        var2.f(111, 1);
        var2.f(111, 0);
        if (param1 < 41) {
          q.a((byte) 110);
        }
    }

    final static void a(int param0, th param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = HoldTheLine.field_D;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (ao.field_c != null) {
              try {
                ao.field_c.a(25971, 0L);
                ao.field_c.a(var6, 0);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            param1.a(24, 76, var2, 0);
            if (param0 < 25) {
              field_a = (qi) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("q.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new int[]{4, 4, 1};
    }
}
