/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static td field_c;
    static byte[][] field_a;
    private int[] field_b;

    final static void a(int param0, byte[] param1) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        da var11 = null;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        var10 = HoldTheLine.field_D;
        try {
          if (param1 == null) {
            return;
          }
          if (64 != param1.length) {
            throw new RuntimeException();
          }
          var11 = new da(0);
          var11.field_i = param1;
          var11.field_l = 0;
          var11.e(true);
          stackIn_8_0 = (var11.h(1, 7) != 1) ? 0 : 1;
          var3 = stackIn_8_0;
          stackIn_11_0 = (var11.h(1, 7) != 1) ? 0 : 1;
          var4 = stackIn_11_0;
          stackIn_14_0 = (var11.h(1, 7) != 1) ? 0 : 1;
          var5 = stackIn_14_0;
          if (var3 == 0 &&
            nd.field_e) {
            ad.field_a = true;
          }
          if (var4 == 0 &&
            ij.field_l) {
            ad.field_a = true;
          }
          if (var5 == 0 &&
            on.field_s) {
            ad.field_a = true;
          }
          nd.field_e = nd.field_e & var3 != 0;
          ij.field_l = ij.field_l & var4 != 0;
          on.field_s = on.field_s & var5 != 0;
          var6 = var11.h(4, 7);
          var7 = 4 * ao.field_b + hk.field_d;
          if (var6 >= var7) {
            hk.field_d = 3 & var6;
            ao.field_b = var6 >> 2;
          } else {
            ad.field_a = true;
          }
          for (var8 = 1; var8 < 4; var8++) {
            ug.a(var11, var8, 0, (byte) 102);
          }
          for (var8Lifetime1 = 1; 4 > var8Lifetime1; var8Lifetime1++) {
            for (var9 = 0; 4 > var9; var9++) {
              ug.a(var11, var9, var8Lifetime1, (byte) 100);
            }
          }
          var9Lifetime1 = 117 % ((20 - param0) / 61);
          for (var8Lifetime2 = 0; 4 > var8Lifetime2; var8Lifetime2++) {
            ma.a(false, var11, var8Lifetime2);
          }
          var11.l(-34);
          h.b((byte) -115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("j.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, ib param3, int param4, String param5, int param6, int param7, int param8) {
        kl.field_v = param3;
        fh.field_g = param7;
        ee.field_n = param8;
        rd.field_g = param0;
        a.field_H = param6;
        wd.field_r = param2;
        pe.field_c = param5;
        lg.field_e = param4;
        ce.field_n = (wj) ((Object) new ag());
        lk.field_d = new qb(param3);
        if (param1 != 24) {
          return;
        }
        try {
          ra.field_Z = new ci(ce.field_n, lk.field_d);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "j.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static hj a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var9 = 0;
        int var4;
        int var5;
        hj var6;
        float var8;
        float var10;
        float var11;
        int var13;
        float var12;
        var13 = HoldTheLine.field_D;
        var4 = 1 + 2 * param3;
        var5 = param3 + param1;
        if (param0 < 40) {
          j.a((byte) 50, -35, -90, -15);
        }
        var6 = new hj(var4, var5);
        for (var7 = 5; var5 > var7; var7++) {
          if (param1 < var7) {
            var8 = (float)Math.sqrt((double)(-((-param1 + var7) * (var7 - param1)) + param3 * param3));
          } else {
            var8 = (float)(var7 * param3) / (float)param1;
          }
          for (var9 = -param3; var9 <= param3; var9++) {
            var10 = (float)var9 / var8;
            var11 = 1.0f - Math.abs(var10);
            if (!(0.0f >= var11)) {
              var12 = var11;
              var6.field_z[var9 + (var7 * var4 + param3)] = lk.a(var12, -1, param2);
            }
          }
        }
        return var6;
    }

    final static void a(byte param0, String[] param1) {
        int var4 = 0;
        ei var2 = null;
        ji var3 = null;
        int var5 = 0;
        byte[] var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          rc.field_c = param1;
          if (param0 > -34) {
            var6 = (byte[]) null;
            j.a(-20, (byte[]) null);
          }
          if (rc.field_c.length == 0) {
            mm.field_a = null;
            return;
          }
          kn.field_a = 0;
          jf.a(4);
          var2 = new ei();
          var3 = gd.f(-117);
          while (var3 != null) {
            var2.a(var3, (byte) 6);
            var3 = gd.f(-117);
          }
          mm.field_a = new ji[var2.field_e];
          for (var4 = 0; var4 < var2.field_e; var4++) {
            mm.field_a[var4] = (ji) (var2.field_b[var4]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("j.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          String var2 = (String) null;
          j.a(68, -126, -46, (ib) null, 23, (String) null, 42, -14, 45);
        }
        field_c = null;
        field_a = (byte[][]) null;
    }

    final static void b(int param0) {
        if (param0 <= 32) {
          return;
        }
        String var2 = (String) null;
        ag.a((String) null, false, ij.field_k);
    }

    final int a(int param0, boolean param1, int param2, byte[] param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = HoldTheLine.field_D;
        try {
          if (0 == param0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = 0;
          if (!param1) {
            var12 = (String[]) null;
            j.$cfr$intArgs$a$65e274601245(-53, (String[]) null);
          }
          param0 = param0 + param2;
          var8 = param5;
          L3: while (true) {
            var9 = param4[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$0 = this.field_b[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param2;
              param2++;
              param3[incrementValue$1] = (byte)(~var10);
              if (param2 >= param0) {
                break L3;
              }
              var7_int = 0;
            }
            if ((64 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$2 = this.field_b[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param3[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param0 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 != (32 & var9)) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_b[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param2;
              param2++;
              param3[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 >= param0) {
                break L3;
              }
              var7_int = 0;
            }
            if ((16 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$6 = this.field_b[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param2;
              param2++;
              param3[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param2 >= param0) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 == (8 & var9)) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$8 = this.field_b[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param3[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param2 >= param0) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 4) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_b[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param3[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param0 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((2 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_b[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param3[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param2 >= param0) {
                return var8 - (-1 + param5);
              }
              var7_int = 0;
            }
            if (0 != (var9 & 1)) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_b[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param2;
              param2++;
              param3[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param0 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_66_0 = var8 - (-1 + param5);
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("j.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param5).append(')').toString());
        }
    }

    private j() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0) {
        try {
          int var1 = 89 % ((param0 + 70) / 52);
          if (null != ao.field_c) {
            try {
              ao.field_c.a(25971, 0L);
              ao.field_c.a((byte) 125, 24, rd.field_e.field_l, rd.field_e.field_i);
            } catch (Exception exception) {
            }
          }
          rd.field_e.field_l = rd.field_e.field_l + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new byte[1000][];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$65e274601245(int param0, String[] param1) {
        int var4 = 0;
        ei var2 = null;
        ji var3 = null;
        int var5 = 0;
        byte[] var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          rc.field_c = param1;
          if (param0 > -34) {
            var6 = (byte[]) null;
            j.a(-20, (byte[]) null);
          }
          if (rc.field_c.length == 0) {
            mm.field_a = null;
            return;
          }
          kn.field_a = 0;
          jf.a(4);
          var2 = new ei();
          var3 = gd.f(-117);
          while (var3 != null) {
            var2.a(var3, (byte) 6);
            var3 = gd.f(-117);
          }
          mm.field_a = new ji[var2.field_e];
          for (var4 = 0; var4 < var2.field_e; var4++) {
            mm.field_a[var4] = (ji) (var2.field_b[var4]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("j.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }
}
