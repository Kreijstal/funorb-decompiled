/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static nb field_a;
    static int field_b;

    final static int a(byte param0, CharSequence param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 0;
          if (param0 > -111) {
            field_b = 12;
          }
          var4 = param1.length();
          for (var5 = 0; var5 < var4; var5++) {
            if (param2 == param1.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("vs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -68) {
          return;
        }
        field_a = null;
    }

    final static boolean b(byte param0) {
        if (param0 != 9) {
          vs.a((byte) 108);
        }
        return ms.field_a;
    }

    final static boolean a(int[] param0, int param1) {
        int var6_int = 0;
        int var7 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        ub var5_ref_ub = null;
        int var5 = 0;
        ub var6 = null;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (kw.field_c != ga.field_j) {
            return false;
          }
          var4 = 96 / ((param1 + 72) / 53);
          var2_long = wq.a(-45);
          if (0 != jo.field_c &&
            lq.field_b < 0) {
            var5_ref_ub = (ub) (un.field_b.b(-99));
            if (var5_ref_ub != null &&
              var2_long > var5_ref_ub.field_m) {
              var5_ref_ub.b(false);
              gu.field_d = var5_ref_ub.field_k.length;
              ig.field_a.field_p = 0;
              for (var6_int = 0; var6_int < gu.field_d; var6_int++) {
                ig.field_a.field_n[var6_int] = var5_ref_ub.field_k[var6_int];
              }
              li.field_r = vb.field_I;
              vb.field_I = ur.field_Q;
              ur.field_Q = iw.field_a;
              iw.field_a = var5_ref_ub.field_l;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("vs.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
        stackIn_17_0 = lq.field_b;
        try {
          while (true) {
            if (stackIn_17_0 < 0) {
              ig.field_a.field_p = 0;
              if (!ju.b(-1, 1)) {
                return false;
              }
              lq.field_b = ig.field_a.i(255);
              ig.field_a.field_p = 0;
              gu.field_d = param0[lq.field_b];
            }
            if (!lt.a((byte) 119)) {
              return false;
            }
            if (jo.field_c == 0) {
              li.field_r = vb.field_I;
              vb.field_I = ur.field_Q;
              ur.field_Q = iw.field_a;
              iw.field_a = lq.field_b;
              lq.field_b = -1;
              return true;
            }
            var5 = jo.field_c;
            if (0.0 != au.field_k) {
              var5 = (int)((double)var5 + fd.field_d.nextGaussian() * au.field_k);
              if (var5 < 0) {
                var5 = 0;
              }
            }
            var6 = new ub((long)var5 + var2_long, lq.field_b, new byte[gu.field_d]);
            for (var7 = 0; gu.field_d > var7; var7++) {
              var6.field_k[var7] = ig.field_a.field_n[var7];
            }
            un.field_b.a((ms) (var6), (byte) 39);
            lq.field_b = -1;
            stackIn_17_0 = lq.field_b;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("vs.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new nb(0);
    }
}
