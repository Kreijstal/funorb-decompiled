/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static int field_c;
    static jp field_d;
    static mf field_a;
    static om field_f;
    static jp field_e;
    static jp field_b;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
        if (param0 > -68) {
          int[] var2 = (int[]) null;
          nl.a((int[]) null, (byte) -73);
          return;
        }
    }

    final static boolean a(int[] param0, byte param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        pg var4_ref_pg = null;
        int var4 = 0;
        pg var5 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (q.field_i != rf.field_b) {
            return false;
          }
          if (param1 != 64) {
            field_f = (om) null;
          }
          var2_long = ue.a(false);
          if (0 != ue.field_d &&
            ob.field_I < 0) {
            var4_ref_pg = (pg) (al.field_m.d(-124));
            if (var4_ref_pg != null &&
              var2_long > var4_ref_pg.field_j) {
              var4_ref_pg.b((byte) 111);
              ga.field_j = var4_ref_pg.field_l.length;
              jl.field_e.field_l = 0;
              for (var5_int = 0; ga.field_j > var5_int; var5_int++) {
                jl.field_e.field_k[var5_int] = var4_ref_pg.field_l[var5_int];
              }
              r.field_z = we.field_a;
              we.field_a = mh.field_gb;
              mh.field_gb = si.field_a;
              si.field_a = var4_ref_pg.field_r;
              return true;
            }
          }
          while (true) {
            if (0 > ob.field_I) {
              jl.field_e.field_l = 0;
              if (!vd.a(20, 1)) {
                return false;
              }
              ob.field_I = jl.field_e.d(true);
              jl.field_e.field_l = 0;
              ga.field_j = param0[ob.field_I];
            }
            if (!um.b((byte) -104)) {
              return false;
            }
            if (ue.field_d == 0) {
              r.field_z = we.field_a;
              we.field_a = mh.field_gb;
              mh.field_gb = si.field_a;
              si.field_a = ob.field_I;
              ob.field_I = -1;
              return true;
            }
            var4 = ue.field_d;
            if (0.0 != ej.field_J) {
              var4 = (int)((double)var4 + ji.field_e.nextGaussian() * ej.field_J);
              if (0 > var4) {
                var4 = 0;
              }
            }
            var5 = new pg(var2_long + (long)var4, ob.field_I, new byte[ga.field_j]);
            for (var6 = 0; ga.field_j > var6; var6++) {
              var5.field_l[var6] = jl.field_e.field_k[var6];
            }
            al.field_m.a(var5, (byte) 3);
            ob.field_I = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("nl.A(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, int param2, long param3, int param4) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        int var6;
        int var7;
        int var8;
        StringBuilder var9;
        int var10;
        int var11;
        int var12;
        StringBuilder var13;
        StringBuilder var14;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var10Lifetime3;
        int var11Lifetime3;
        var12 = BrickABrac.field_J ? 1 : 0;
        var6 = 44;
        var7 = 46;
        if (0 == param4) {
          var6 = 46;
          var7 = 44;
        }
        if (param4 == 2) {
          var7 = 160;
        }
        if (param0) {
          var8 = 0;
          if (param3 < 0L) {
            param3 = -param3;
            var8 = 1;
          }
          var14 = new StringBuilder(26);
          if (param2 > 0) {
            for (var10 = 0; param2 > var10; var10++) {
              var11 = (int)param3;
              param3 = param3 / 10L;
              discarded$1 = var14.append((char)(-((int)param3 * 10) + (48 + var11)));
            }
            discarded$0 = var14.append((char) var6);
          }
          var10Lifetime3 = 0;
          while (true) {
            var11Lifetime3 = (int)param3;
            param3 = param3 / 10L;
            discarded$2 = var14.append((char)(-(10 * (int)param3) + var11Lifetime3 + 48));
            if (param3 == 0L) {
              if (var8 == 0) {
                return var14.reverse().toString();
              }
              discarded$3 = var14.append('-');
              return var14.reverse().toString();
            }
            if (!param1) {
              continue;
            }
            var10Lifetime3++;
            if (var10Lifetime3 % 3 != 0) {
              continue;
            }
            discarded$4 = var14.append((char) var7);
          }
        }
        field_a = (mf) null;
        var8Lifetime1 = 0;
        if (param3 < 0L) {
          param3 = -param3;
          var8Lifetime1 = 1;
        }
        var13 = new StringBuilder(26);
        var9 = var13;
        if (param2 > 0) {
          for (var10Lifetime1 = 0; param2 > var10Lifetime1; var10Lifetime1++) {
            var11Lifetime1 = (int)param3;
            param3 = param3 / 10L;
            discarded$6 = var13.append((char)(-((int)param3 * 10) + (48 + var11Lifetime1)));
          }
          discarded$5 = var13.append((char) var6);
        }
        var10Lifetime2 = 0;
        while (true) {
          var11Lifetime2 = (int)param3;
          param3 = param3 / 10L;
          discarded$7 = var13.append((char)(-(10 * (int)param3) + var11Lifetime2 + 48));
          if (param3 == 0L) {
            if (var8Lifetime1 == 0) {
              return var13.reverse().toString();
            }
            discarded$8 = var13.append('-');
            return var13.reverse().toString();
          }
          if (!param1) {
            continue;
          }
          var10Lifetime2++;
          if (var10Lifetime2 % 3 != 0) {
            continue;
          }
          discarded$9 = var13.append((char) var7);
        }
    }

    static {
    }
}
