/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i {
    static String field_b;
    static ho field_i;
    static ll[] field_g;
    static vn field_e;
    static int field_f;
    static String field_h;
    static ll[] field_a;
    tn field_c;
    static int field_d;

    final static qb a(boolean param0) {
        int var5_int = 0;
        byte[] var17 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var8 = null;
        Object var3 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0) {
          return (qb) null;
        }
        int var1 = jg.field_p[0] * ho.field_i[0];
        byte[] var16 = ln.field_I[0];
        if (!dn.field_Ib[0]) {
          var8 = new int[var1];
          for (var5_int = 0; var5_int < var1; var5_int++) {
            var8[var5_int] = ph.field_c[dg.a((int) var16[var5_int], 255)];
          }
          var3 = new qb(pb.field_g, gn.field_a, hl.field_l[0], be.field_d[0], jg.field_p[0], ho.field_i[0], var8);
        } else {
          var17 = vi.field_O[0];
          var13 = new int[var1];
          var11 = var13;
          var5 = var11;
          for (var6 = 0; var6 < var1; var6++) {
            var5[var6] = fj.b(dg.a(255, (int) var17[var6]) << 24, ph.field_c[dg.a((int) var16[var6], 255)]);
          }
          var3 = new od(pb.field_g, gn.field_a, hl.field_l[0], be.field_d[0], jg.field_p[0], ho.field_i[0], var13);
        }
        dk.a(-18229);
        return (qb) (var3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = param4;
        this.field_c.a(param0, param2, var7, var6, 0, param3, param1);
        lj.field_j.a(ec.field_d.field_x, 0, 0, ga.field_r, (byte) -120);
        p.field_d.a(-80 + (-2 + ec.field_d.field_x) - (nn.field_p + 2), 0, 2 + ga.field_r, 18, (byte) -120);
        nk.field_n.a(nn.field_p + 82, ec.field_d.field_x - (nn.field_p + 2) - 80, ga.field_r + 2, 18, (byte) -120);
        nl.field_Gb.a(20, 2, ec.field_d.field_I - ga.field_r - 2 - 20, ec.field_d.field_x, 2 + ga.field_r + 20, 0, -16624, nn.field_p);
        dd.field_c.a(2, 20, nn.field_p, false);
    }

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        field_e = null;
        if (param0 != 6) {
          return;
        }
        field_b = null;
        field_a = null;
        field_g = null;
    }

    final static void a(ll param0, int param1, int param2, byte param3, nf param4, qb param5, int param6) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        try {
          if (param0 == null) {
            return;
          }
          param2 = param2 + param5.field_x;
          param1 = param1 + param5.field_o;
          var7_int = param2 + param4.field_y * param1;
          var8 = 0;
          var9 = param5.field_y;
          var10 = param5.field_q;
          var11 = -var10 + param4.field_y;
          var12 = param6;
          if (param1 < 0) {
            var13 = -param1 + 0;
            var9 = var9 - var13;
            param1 = 0;
            var7_int = var7_int + param4.field_y * var13;
            var8 = var8 + var13 * var10;
          }
          if (param2 < 0) {
            var13Lifetime1 = -param2 + 0;
            param2 = 0;
            var11 = var11 + var13Lifetime1;
            var10 = var10 - var13Lifetime1;
            var8 = var8 + var13Lifetime1;
            var12 = var12 + var13Lifetime1;
            var7_int = var7_int + var13Lifetime1;
          }
          if (param4.field_H - 1 < var9 + param1) {
            var9 = var9 - (var9 + (param1 + (-param4.field_H + 1)));
          }
          if (param4.field_y - 1 < param2 + var10) {
            var13Lifetime2 = param2 + var10 - (-1 + param4.field_y);
            var10 = var10 - var13Lifetime2;
            var11 = var11 + var13Lifetime2;
            var12 = var12 + var13Lifetime2;
          }
          if (var10 > 0 &&
            0 < var9) {
            fc.a(var7_int, param5.field_A, var11, 6725, var8, var12, param3, param0.field_m, var10, var9);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_20_0 = var7;
          stackIn_20_1 = new StringBuilder().append("i.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!bj.g(false)) {
            if (ka.field_m != null &&
              ka.field_m.field_e) {
              u.b(param0 ^ 6);
              pm.field_e.b(new qn(pm.field_e, vi.field_C), 15637);
            }
            return;
          }
          if (param0 != 0) {
            i.a((byte) -47);
          }
          pm.field_e.a(df.field_y, vi.field_L, true, (byte) -88);
          pm.field_e.i(4);
          while (ib.b(false)) {
            pm.field_e.a(ed.field_Bb, (byte) 33, vn.field_d);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "i.G(" + param0 + ')');
        }
    }

    final static void a(wk param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          Exception var3 = null;
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            var6 = new byte[param1];
            var2 = var6;
            if (pg.field_f != null) {
              try {
                pg.field_f.a(0L, -97);
                pg.field_f.a(-13848, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param0.a(var2, 0, (byte) -86, 24);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param0.a(var2, 0, (byte) -86, 24);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("i.B(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        lo.field_q = 200;
        int var1 = 63 % ((-66 - param0) / 47);
        vh.field_n = false;
    }

    i(String param0, kc param1) {
        String[] var3 = null;
        kc[] var4 = null;
        try {
          var3 = new String[]{param0, u.field_d, lm.field_g};
          var4 = new kc[]{param1, ec.field_d, (kc) ((Object) dd.field_c)};
          this.field_c = new tn(0L, ub.field_c, var3, mn.field_t, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "i.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "You have been removed from <%0>'s game.";
        field_h = "Wands:";
        field_e = new vn();
    }
}
