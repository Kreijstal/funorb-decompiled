/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_d;
    static wl field_c;
    static la field_e;
    static int field_f;
    static String field_b;
    static String field_a;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var11 = Torquing.field_u;
        try {
          var6_int = 72 % ((param1 + 9) / 50);
          if (qk.field_p >= param0 &&
            j.field_q <= param5) {
            if (param4 < kn.field_e) {
              param4 = kn.field_e;
              var7 = 0;
            } else {
              if (qg.field_z < param4) {
                var7 = 0;
                param4 = qg.field_z;
              } else {
                var7 = 1;
              }
            }
            if (param2 < kn.field_e) {
              var8 = 0;
              param2 = kn.field_e;
            } else {
              if (qg.field_z < param2) {
                param2 = qg.field_z;
                var8 = 0;
              } else {
                var8 = 1;
              }
            }
            if (param0 < j.field_q) {
              param0 = j.field_q;
            } else {
              incrementValue$0 = param0;
              param0++;
              di.a(param4, (byte) -101, param3, qd.field_a[incrementValue$0], param2);
            }
            if (qk.field_p < param5) {
              param5 = qk.field_p;
            } else {
              incrementValue$1 = param5;
              param5--;
              di.a(param4, (byte) 113, param3, qd.field_a[incrementValue$1], param2);
            }
            if (var7 != 0 &&
              var8 != 0) {
              for (var9 = param0; var9 <= param5; var9++) {
                var13 = qd.field_a[var9];
                var12 = var13;
                var10 = var12;
                var13[param2] = param3;
                var10[param4] = param3;
              }
            } else {
              if (var7 != 0) {
                for (var9 = param0; var9 <= param5; var9++) {
                  qd.field_a[var9][param4] = param3;
                }
              } else {
                if (var8 == 0) {
                  return;
                }
                for (var9 = param0; param5 >= var9; var9++) {
                  qd.field_a[var9][param2] = param3;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "vd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          field_a = (String) null;
        }
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        df var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        qp var11 = null;
        df var12 = null;
        int[] var13 = null;
        nh var14 = null;
        nh var15 = null;
        int[] var16 = null;
        var8 = Torquing.field_u;
        try {
          var12 = kj.field_d;
          if (param0 != 27912) {
            field_b = (String) null;
          }
          var2 = var12.i((byte) -101);
          if (var2 == 0) {
            var10 = kb.a((byte) -84);
            var16 = var10;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((fj) ((Object) var5)).i((byte) -101);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((fj) ((Object) var5)).c((byte) -65);
            }
            var14 = (nh) (to.field_q.b(0));
            if (var14 == null) {
              ih.b(true);
              return;
            }
            var14.field_r = var3;
            var14.field_n = true;
            var14.field_m = var16[0];
            var14.f(0);
            return;
          }
          if (var2 != 1) {
            if (2 != var2) {
              nn.a("A1: " + me.a(-1), (Throwable) null, param0 - 37870);
              ih.b(true);
            } else {
              var15 = (nh) (to.field_q.b(param0 - 27912));
              if (var15 == null) {
                ih.b(true);
                return;
              }
              var15.field_r = kb.a((byte) -91);
              var15.field_m = var15.field_r[0];
              var15.field_n = true;
              var15.f(0);
            }
          } else {
            var11 = (qp) (tl.field_p.b(0));
            if (var11 == null) {
              ih.b(true);
              return;
            }
            var11.f(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "vd.A(" + param0 + ')');
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Torquing.field_u;
        try {
          var3 = lk.a(param2, 23, param1);
          if (param0 >= -92) {
            field_a = (String) null;
          }
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          var4 = 0;
          while (true) {
            if (var4 >= param1.length()) {
              return null;
            }
            if (co.a(-112, param1.charAt(var4))) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_12_0 = wc.field_s;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("vd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = "Continue";
        field_f = -2147483648;
        field_a = "Guide <col=2>Torquing</col> to the flag across the maze of platforms. Be careful not to run out of time or fall to your doom!";
    }
}
