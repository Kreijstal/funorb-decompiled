/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends tm {
    static String field_D;
    static String field_E;
    static String field_B;
    static int[] field_A;
    static double[][][] field_C;

    public static void g(int param0) {
        field_D = null;
        if (param0 == 220) {
          field_E = null;
          field_A = null;
          field_B = null;
          field_C = (double[][][]) null;
          return;
        }
        field_E = (String) null;
        field_E = null;
        field_A = null;
        field_B = null;
        field_C = (double[][][]) null;
    }

    uc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int h(byte param0) {
        if (param0 > -7) {
          return -31;
        }
        return -nb.field_k + so.field_e;
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 84) {
            field_E = (String) null;
          }
          stackIn_3_0 = new li(hm.a((byte) 120, param1[0].b(-30368)));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int h(int param0) {
        int var1 = (int)(nj.a(-109) % 1440L) - 1000;
        if (var1 > 0) {
          return 256 - (var1 % 220 << 8) / 220;
        }
        if (param0 >= 9) {
          return -1;
        }
        field_C = (double[][][]) null;
        return -1;
    }

    final static void a(tf param0, int param1) {
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        gn var2 = null;
        RuntimeException var2_ref = null;
        gn var3 = null;
        tf var5 = null;
        var4 = Kickabout.field_G;
        try {
          if (ia.field_c) {
            ov.a(param0, 0);
            return;
          }
          stackIn_7_0 = -27054;
          while (!kk.a(stackIn_7_0, param0)) {
            var2 = param0.g(24009);
            while (var2 instanceof ak) {
              if (var2.field_d instanceof ak) {
                var3 = var2.field_d;
                if (((ak) (var2)).a((byte) -13) > ((ak) (var3)).a((byte) 124)) {
                  var2.c((byte) -109);
                  pa.a(var2, var3, (byte) 126);
                }
                var2 = var3;
                continue;
              }
              break;
            }
            stackIn_7_0 = -27054;
          }
          if (param1 == -22488) {
            return;
          }
          var5 = (tf) null;
          uc.a((tf) null, 81);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("uc.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(long param0, int param1, int param2) {
        ml var4 = or.field_d;
        var4.b(param1, (byte) -94);
        var4.field_n = var4.field_n + 1;
        int var5 = var4.field_n;
        var4.a(108, 6);
        if (param2 >= 119) {
          var4.a(param0, -1781890008);
          var4.c(62, var4.field_n - var5);
          return;
        }
    }

    final static void g(byte param0) {
        ou.a(0);
        hk.field_G = true;
        if (param0 != -54) {
          return;
        }
        po.field_f = true;
        wd.field_l.k(103);
        ku.a(ul.field_a, 4, false);
    }

    static {
        field_D = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_B = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_C = new double[33][33][33];
        field_A = new int[256];
    }
}
