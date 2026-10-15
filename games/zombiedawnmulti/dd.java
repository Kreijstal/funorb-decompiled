/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd implements dr {
    static String field_a;
    static ri field_g;
    static String field_b;
    static String field_e;
    static String field_c;
    static Boolean field_d;
    static ja[][] field_f;

    public static void a(boolean param0) {
        field_g = null;
        field_f = (ja[][]) null;
        field_c = null;
        field_e = null;
        field_a = null;
        field_d = null;
        if (!param0) {
          field_b = null;
          return;
        }
        int[] var2 = (int[]) null;
        dd.a((int[]) null, (byte) 46);
        field_b = null;
    }

    final static void a(boolean param0, int param1) {
        nc.a(param1 ^ -122, param0);
        if (param1 != 0) {
          return;
        }
        pm.a(false, param0);
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5 = hl.field_e;
          var1 = var5;
          if (param0 != 8) {
            field_e = (String) null;
          }
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "dd.C(" + param0 + ')');
        }
    }

    final static boolean a(int[] param0, byte param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        bb var4_ref_bb = null;
        int var4 = 0;
        bb var5 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (pi.field_a != vo.field_l) {
            return false;
          }
          var2_long = bl.a((byte) 94);
          if (param1 > -77) {
            return true;
          }
          if (od.field_Db != 0 &&
            fd.field_F < 0) {
            var4_ref_bb = (bb) (he.field_k.c(60));
            if (var4_ref_bb != null &&
              var4_ref_bb.field_j < var2_long) {
              var4_ref_bb.a(true);
              hd.field_q = var4_ref_bb.field_f.length;
              s.field_e.field_j = 0;
              for (var5_int = 0; hd.field_q > var5_int; var5_int++) {
                s.field_e.field_m[var5_int] = var4_ref_bb.field_f[var5_int];
              }
              k.field_k = jp.field_e;
              jp.field_e = ij.field_d;
              ij.field_d = op.field_i;
              op.field_i = var4_ref_bb.field_l;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("dd.F(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
        }
        stackIn_20_0 = fd.field_F;
        try {
          while (true) {
            if (stackIn_20_0 < 0) {
              s.field_e.field_j = 0;
              if (!fa.b(10, 1)) {
                return false;
              }
              fd.field_F = s.field_e.m(101);
              s.field_e.field_j = 0;
              hd.field_q = param0[fd.field_F];
            }
            if (!dd.a(0)) {
              return false;
            }
            if (od.field_Db == 0) {
              k.field_k = jp.field_e;
              jp.field_e = ij.field_d;
              ij.field_d = op.field_i;
              op.field_i = fd.field_F;
              fd.field_F = -1;
              return true;
            }
            var4 = od.field_Db;
            if (0.0 != la.field_n) {
              var4 = (int)((double)var4 + c.field_c.nextGaussian() * la.field_n);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new bb(var2_long + (long)var4, fd.field_F, new byte[hd.field_q]);
            for (var6 = 0; hd.field_q > var6; var6++) {
              var5.field_f[var6] = s.field_e.field_m[var6];
            }
            he.field_k.a(var5, false);
            fd.field_F = -1;
            stackIn_20_0 = fd.field_F;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("dd.F(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 == ~hd.field_q) {
          if (!fa.b(10, 1)) {
            return false;
          }
          hd.field_q = s.field_e.g(param0 + 31365);
          s.field_e.field_j = 0;
        }
        if (hd.field_q == -2) {
          if (!fa.b(param0 + 10, 2)) {
            return false;
          }
          hd.field_q = s.field_e.d((byte) 69);
          s.field_e.field_j = 0;
        }
        return fa.b(10, hd.field_q);
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        int var5 = 0;
        String[] var6 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String[] var7 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          ta.field_hb = oi.field_j;
          if (param3 != 255) {
            if (param3 < 100) {
              ai.field_g = p.a(-28, param2, param3);
            } else {
              if (param3 <= 105) {
                var7 = param1;
                jk.a(param0 ^ 0, var7);
                ai.field_g = kn.a(param1, param0 ^ -107);
              } else {
                ai.field_g = p.a(-28, param2, param3);
              }
            }
          } else {
            stackIn_4_0 = false;
            stackIn_5_1 = !(rj.field_J >= 13);
            ai.field_g = ij.a(stackIn_4_0, stackIn_5_1);
            var6 = (String[]) null;
            jk.a(0, (String[]) null);
          }
          if (param0 == 0) {
            return;
          }
          dd.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("dd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Please check if address is correct";
        field_b = "Draws even more zombies to you at the start of each match than Prepared. Equip both for the maximum number of minions.";
        field_f = new ja[5][];
        field_e = "Cancel";
        field_c = "For the zombie on the go.";
    }
}
