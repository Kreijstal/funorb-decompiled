/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static int field_a;
    static String[] field_c;
    static int field_b;

    final static void a(int param0, ka param1, java.math.BigInteger param2, java.math.BigInteger param3, byte[] param4, int param5, int param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = stellarshard.field_B;
        try {
          var7_int = rj.a((byte) -12, param5);
          if (null == wb.field_a) {
            wb.field_a = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = wb.field_a.nextInt();
          }
          if (null == a.field_b ||
            !(a.field_b.field_r.length >= var7_int)) {
            a.field_b = new ka(var7_int);
          }
          a.field_b.field_k = 0;
          a.field_b.a(param5, param6, (byte) -13, param4);
          if (param0 != -13791) {
            return;
          }
          a.field_b.a(var7_int, -18920);
          a.field_b.a((byte) 12, var13);
          if (null == kl.field_r ||
            !(kl.field_r.field_r.length >= 100)) {
            kl.field_r = new ka(100);
          }
          kl.field_r.field_k = 0;
          kl.field_r.a(false, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            kl.field_r.b(0, var13[var11]);
            var11++;
          }
          kl.field_r.c(param5, param0 + 13664);
          kl.field_r.a(false, param2, param3);
          param1.a(kl.field_r.field_k, 0, (byte) -13, kl.field_r.field_r);
          param1.a(a.field_b.field_k, 0, (byte) -13, a.field_b.field_r);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("rl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = stellarshard.field_B;
        try {
          if (param1 < ~rk.field_f) {
            var3_int = 0;
            if (of.field_F) {
              of.field_F = false;
              var3_int = 1;
            }
            ph.a(cd.h(-1064120735), 2, qf.field_a, ia.l(50), var3_int != 0);
          } else {
            if (gh.b((byte) 105)) {
              if (eg.field_d == 0) {
                vc.a((byte) -121, param2, false);
                pd.a(param0, 0, 0, (byte) -24);
              } else {
                i.a(param0, param1 - 101);
              }
            } else {
              ti.d();
              n.a(240, (byte) -41, 320);
              pd.a(param0, 0, 0, (byte) -80);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("rl.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -84) {
          field_a = 111;
        }
        field_c = null;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          String var3 = null;
          java.net.URL var4 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          try {
            try {
              var4 = param0.getCodeBase();
              var3 = lk.a(param0, var4, 118).getFile();
              sh.a(new Object[]{"home", var3 + "home.ws"}, false, "updatelinks", param0);
              sh.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, false, "updatelinks", param0);
              sh.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, false, "updatelinks", param0);
              sh.a(new Object[]{"options", var3 + "options.ws"}, false, "updatelinks", param0);
              sh.a(new Object[]{"terms", var3 + "terms.ws"}, false, "updatelinks", param0);
              sh.a(new Object[]{"privacy", var3 + "privacy.ws"}, false, "updatelinks", param0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (param1 != 15) {
              field_a = -78;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("rl.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(CharSequence param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        try {
          var2_int = param0.length();
          var3 = 0;
          if (param1 <= 54) {
            stackIn_3_0 = 65;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = (var3 << 5) - var3 + bf.a(-8250, param0.charAt(var4));
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("rl.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_a = 2;
    }
}
