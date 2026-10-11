/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static oh field_c;
    static int[] field_b;
    static ba field_a;

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
          java.net.URL var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param1.getCodeBase(), param0);
              var3 = of.a(param1, var3, false);
              ib.a(true, var3.toString(), param1, (byte) -25);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            if (param2 > -103) {
              field_a = (ba) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("gk.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 67) {
          String[] var2 = (String[]) null;
          gk.a((String[]) null, (byte) 65);
        }
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        jf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        la var13 = null;
        int var14 = 0;
        la var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = TrackController.field_F ? 1 : 0;
        try {
          var13 = ne.field_a;
          var15 = var13;
          var2 = var15.h(16383);
          var3 = (jf) (ei.field_m.b(param0 + 128));
          while (var3 != null) {
            if (~var3.field_m != ~var2) {
              var3 = (jf) (ei.field_m.a(10));
              continue;
            }
            break;
          }
          if (param0 != -126) {
            field_c = (oh) null;
          }
          if (var3 == null) {
            lj.a((byte) 116);
            return;
          }
          var4 = var15.h(16383);
          if (var4 != 0) {
            pf.field_C[0] = ue.field_a;
            var5 = var3.field_k;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              pf.field_C[var6_int] = var13.g(0);
            }
            tk.a(var4, -14032, var5);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              mf.a(14, var15);
              if (var6_intLifetime1 == 0) {
                sg.a(kf.field_c, var6_intLifetime1, ai.field_d, fe.field_Q, nh.field_a, -733);
              } else {
                sg.a(kf.field_c, var6_intLifetime1, ai.field_d, fe.field_Q, nh.field_a, -733);
              }
            }
            bj.a(0, var5);
            var6 = new String[2][var5];
            var19 = new int[2][4 * var5];
            var8 = oe.field_c;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = lf.field_Y[var9];
              var6[0][var10] = pf.field_C[var11];
              var19[0][var10 * 4] = g.field_u[var11];
              var19[0][1 + 4 * var10] = ii.field_q[var11];
              var19[0][4 * var10 + 2] = qf.field_a[var11];
              var19[0][3 + var10 * 4] = qi.field_b[var11];
              if (rb.a(false, pf.field_C[var11]) &&
                qf.field_a[var11] + ii.field_q[var11] + qi.field_b[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = lf.field_Y[var9Lifetime1 + var5];
              var6[1][var14] = pf.field_C[var11Lifetime1];
              var19[1][4 * var14] = g.field_u[var11Lifetime1];
              var19[1][var14 * 4 + 1] = ii.field_q[var11Lifetime1];
              var19[1][2 + var14 * 4] = qf.field_a[var11Lifetime1];
              var19[1][var14 * 4 + 3] = qi.field_b[var11Lifetime1];
              if (rb.a(false, pf.field_C[var11Lifetime1]) &&
                qf.field_a[var11Lifetime1] + ii.field_q[var11Lifetime1] + qi.field_b[var11Lifetime1] == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var14++;
              var9Lifetime1++;
            }
            var3.a(-61);
            return;
          }
          var3.a(-61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "gk.C(" + param0 + ')');
        }
    }

    final static void a(String[] args, byte param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != mc.field_H) {
            mc.field_H.field_N.a(args, (byte) -58);
          }
          if (param1 >= -24) {
            gk.a(117);
          }
          if (null != ne.field_d) {
            ne.field_d.field_I.a(args, (byte) -58);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("gk.D(");
          if (args == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = new int[16384];
        field_a = new ba();
    }
}
