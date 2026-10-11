/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv extends k {
    static String field_k;

    final int[] a(int param0, int param1) {
        if (param1 != 0) {
          return (int[]) null;
        }
        return jq.field_k;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = BachelorFridge.field_y;
        try {
          var5_int = param0 + param3;
          var6 = param1 + param2;
          if (param3 > dg.field_f) {
            stackIn_4_0 = param3;
          } else {
            stackIn_4_0 = dg.field_f;
          }
          var7 = stackIn_4_0;
          if (param1 <= dg.field_j) {
            stackIn_7_0 = dg.field_j;
          } else {
            stackIn_7_0 = param1;
          }
          var8 = stackIn_7_0;
          if (var5_int >= dg.field_h) {
            stackIn_10_0 = dg.field_h;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (dg.field_k <= var6) {
            stackIn_13_0 = dg.field_k;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (dg.field_f <= param3 &&
            param3 < dg.field_h) {
            var11 = dg.field_i * var8 + param3;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              dg.field_e[var11] = 16777215;
              var11 = var11 + dg.field_i * 2;
            }
          }
          if (param1 >= dg.field_j &&
            dg.field_k > var6) {
            var11Lifetime1 = dg.field_i * param1 + var7;
            var12Lifetime1 = 1 + (var9 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              dg.field_e[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= dg.field_f &&
            var5_int < dg.field_h) {
            var11Lifetime2 = dg.field_i * ((var5_int - param3 & 1) + var8) + var5_int;
            var12Lifetime2 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              dg.field_e[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + dg.field_i * 2;
            }
          }
          if (param4) {
            field_k = (String) null;
          }
          if (dg.field_j <= param1) {
            if (var6 >= dg.field_k) {
              return;
            }
            var11Lifetime3 = var6 * dg.field_i + var7 + (-param1 + var6 & 1);
            var12Lifetime3 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              dg.field_e[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var5), "uv.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public uv() {
        super(0, true);
    }

    final static boolean a(byte param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        bs var4_ref_bs = null;
        int var4 = 0;
        bs var5 = null;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          if (uca.field_a != eia.field_a) {
            return false;
          }
          var2_long = f.b((byte) 73);
          if (param0 < 113) {
            return false;
          }
          if (lca.field_s != 0 &&
            0 > hd.field_m) {
            var4_ref_bs = (bs) (mba.field_c.b((byte) 90));
            if (var4_ref_bs != null &&
              var2_long > var4_ref_bs.field_f) {
              var4_ref_bs.a(false);
              dw.field_f = var4_ref_bs.field_h.length;
              ig.field_m.field_g = 0;
              for (var5_int = 0; var5_int < dw.field_f; var5_int++) {
                ig.field_m.field_h[var5_int] = var4_ref_bs.field_h[var5_int];
              }
              f.field_b = ef.field_l;
              ef.field_l = bd.field_j;
              bd.field_j = ri.field_a;
              ri.field_a = var4_ref_bs.field_i;
              return true;
            }
          }
          while (true) {
            if (hd.field_m < 0) {
              ig.field_m.field_g = 0;
              if (!ii.b(1, 0)) {
                return false;
              }
              hd.field_m = ig.field_m.k(694);
              ig.field_m.field_g = 0;
              dw.field_f = param1[hd.field_m];
            }
            if (!u.d((byte) -67)) {
              return false;
            }
            if (0 == lca.field_s) {
              f.field_b = ef.field_l;
              ef.field_l = bd.field_j;
              bd.field_j = ri.field_a;
              ri.field_a = hd.field_m;
              hd.field_m = -1;
              return true;
            }
            var4 = lca.field_s;
            if (0.0 != nla.field_d) {
              var4 = (int)((double)var4 + ia.field_k.nextGaussian() * nla.field_d);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new bs(var2_long + (long)var4, hd.field_m, new byte[dw.field_f]);
            for (var6 = 0; var6 < dw.field_f; var6++) {
              var5.field_h[var6] = ig.field_m.field_h[var6];
            }
            mba.field_c.a(var5, true);
            hd.field_m = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("uv.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        try {
          sna.field_s = param2;
          eea.field_b = true;
          if (param0) {
            field_k = (String) null;
          }
          oq.field_b = new mf(gja.field_m, qia.field_a, param1, gfa.field_i, sna.field_s);
          gja.field_m.a((wj) (oq.field_b), (byte) 73);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uv.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 != -12) {
          field_k = (String) null;
        }
        field_k = null;
    }

    static {
        field_k = "This password contains repeated characters, and would be easy to guess";
    }
}
