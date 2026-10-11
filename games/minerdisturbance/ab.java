/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static String field_c;
    static bg field_b;
    static String field_a;

    final static void a(int param0, int param1, wb param2) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        ld var7 = sn.field_c;
        ld var8 = var7;
        var8.d((byte) -82, param1);
        var8.field_o = var8.field_o + 1;
        int var4 = var8.field_o;
        var8.c(1, 25564);
        var8.b((byte) 121, param2.field_w);
        var8.b((byte) 124, param2.field_v);
        var8.b((byte) 124, param2.field_s);
        var8.a((byte) 120, param2.field_u);
        var8.a((byte) 80, param2.field_o);
        var8.a((byte) 108, param2.field_t);
        if (param0 != -20680) {
          return;
        }
        try {
          var8.a((byte) 93, param2.field_n);
          var8.c(param2.field_r.length, 25564);
          for (var5 = 0; var5 < param2.field_r.length; var5++) {
            var7.a((byte) 109, param2.field_r[var5]);
          }
          var8.e(-118, var4);
          var8.g(-1, -var4 + var8.field_o);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ab.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, int param1, boolean param2, long param3, boolean param4) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var6;
        int var7;
        int var8;
        StringBuilder var9;
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = MinerDisturbance.field_ab;
        if (!param4) {
          return (String) null;
        }
        var6 = 44;
        var7 = 46;
        if (param1 == 0) {
          var6 = 46;
          var7 = 44;
        }
        if (param1 == 2) {
          var7 = 160;
        }
        var8 = 0;
        if (param3 < 0L) {
          param3 = -param3;
          var8 = 1;
        }
        var9 = new StringBuilder(26);
        if (param0 > 0) {
          for (var10 = 0; var10 < param0; var10++) {
            var11 = (int)param3;
            param3 = param3 / 10L;
            discarded$1 = var9.append((char)(var11 + 48 - 10 * (int)param3));
          }
          discarded$0 = var9.append((char) var6);
        }
        var10Lifetime1 = 0;
        while (true) {
          var11Lifetime1 = (int)param3;
          param3 = param3 / 10L;
          discarded$2 = var9.append((char)(48 + (var11Lifetime1 - 10 * (int)param3)));
          if (param3 == 0L) {
            if (var8 != 0) {
              discarded$3 = var9.append('-');
            }
            return var9.reverse().toString();
          }
          if (!param2) {
            continue;
          }
          var10Lifetime1++;
          if (0 != var10Lifetime1 % 3) {
            continue;
          }
          discarded$4 = var9.append((char) var7);
        }
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = MinerDisturbance.field_ab;
        try {
          var5 = mg.field_e;
          var1 = var5;
          var2 = 0;
          if (param0 != -20707) {
            field_b = (bg) null;
          }
          var3 = var5.length;
          while (var2 < var3) {
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
          throw lj.a((Throwable) ((Object) var1_ref), "ab.A(" + param0 + ')');
        }
    }

    final static ci a(byte param0, int param1, java.awt.Component param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          ci var5 = null;
          vj var5_ref = null;
          wb var6 = null;
          ci stackIn_3_0 = null;
          vj stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("n");
              if (param0 >= -76) {
                var6 = (wb) null;
                ab.a(-60, -22, (wb) null);
              }
              var5 = (ci) (var4.newInstance());
              var5.a(param2, param3, 13961, param1);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new vj();
              ((ci) ((Object) var5_ref)).a(param2, param3, 13961, param1);
              stackIn_5_0 = var5_ref;
              return (ci) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("ab.G(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          kd.a((java.awt.Component) ((Object) param1), true);
          if (param0 != -13) {
            return;
          }
          dl.a((java.awt.Component) ((Object) param1), (byte) 73);
          if (null != pf.field_e) {
            pf.field_e.a((java.awt.Component) ((Object) param1), 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ab.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        if (param1 != 15952) {
          return 103;
        }
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    public static void b(int param0) {
        if (param0 != -14839) {
          ab.b(85);
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        field_c = null;
        field_b = new bg(4, 1, 1, 1);
        field_a = "to keep fullscreen or";
    }
}
