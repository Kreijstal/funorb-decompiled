/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    private kl field_a;
    private di field_d;
    static o field_b;
    private kl field_c;

    final ac b(byte param0, int param1) {
        byte[] var4 = null;
        ac var3 = (ac) (this.field_d.a((byte) 70, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param0 < 27) {
          return (ac) null;
        }
        if (param1 >= 32768) {
          var4 = this.field_a.a(param1 & 32767, 1, 1);
        } else {
          var4 = this.field_c.a(param1, 1, 1);
        }
        var3 = new ac();
        if (var4 != null) {
          var3.a(new va(var4), 72);
        }
        if (param1 >= 32768) {
          var3.d((byte) -127);
        }
        this.field_d.a((long)param1, 1, var3);
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = wizardrun.field_H;
        try {
          if (!param7) {
            return;
          }
          while (true) {
            param0--;
            if (0 > param0) {
              return;
            }
            var17 = param6;
            var10 = var17;
            var11 = param4;
            var12 = param3;
            var13 = param8;
            var14 = param9;
            var15 = 8355711 & var17[var11] >> 1;
            var10[var11] = (kl.b(var13, 33423632) >> 9) + ((kl.b(33423361, var12) >> 1) - (-kl.b(255, var14 >> 17) - var15));
            param3 = param3 + param1;
            param9 = param9 + param2;
            param4++;
            param8 = param8 + param5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        wj.field_E = 1000000000L / (long)param1;
        if (param0 != 91) {
          field_b = (o) null;
        }
    }

    final static void a(int param0) {
        if (!wi.field_J) {
          throw new IllegalStateException();
        }
        if (param0 != 19702) {
          field_b = (o) null;
        }
        if (aa.field_lb != null) {
          aa.field_lb.l(-27697);
        }
        String var1 = qf.c((byte) 77);
        r.field_b = new qc(var1, (String) null, true, false, false);
        u.field_A.b((ub) (td.field_f), (byte) 62);
        td.field_f.c(r.field_b, -114);
        td.field_f.g((byte) -3);
    }

    final static uh a(String param0, int param1, long param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        nh stackIn_5_0 = null;
        ka stackIn_7_0 = null;
        bb stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0L &&
            param0 != null) {
            stackIn_7_0 = new ka(param0, param4);
            return (uh) ((Object) stackIn_7_0);
          }
          if (param3) {
            stackIn_5_0 = new nh(param2, param4);
            return (uh) ((Object) stackIn_5_0);
          }
          if (param1 != 8355711) {
            field_b = (o) null;
          }
          stackIn_11_0 = new bb(param2, param4);
          return (uh) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("uk.G(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param2) {
          ed.d(0, 0, ed.field_h, ed.field_d, 0, 192);
        } else {
          ed.d();
        }
        od.a(param0 ^ 4, param2);
        if (param0 != -123) {
          field_b = (o) null;
        }
    }

    public static void a(byte param0) {
        if (param0 != -44) {
          uk.a(108);
        }
        field_b = null;
    }

    private uk() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, kl param1) {
        int var3 = 0;
        int var4 = 0;
        le var5 = null;
        int[] var6 = null;
        int var7 = 0;
        mg var8 = null;
        int var9 = 0;
        mg var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = wizardrun.field_H;
        try {
          var8 = new mg(param1.a(93, "", "logo.fo3d"));
          var10 = var8;
          var3 = var10.f(255);
          var10.l(19967);
          oh.field_a = ie.a(12, var10);
          cb.field_d = new int[var3][];
          ia.field_f = new le[var3];
          for (var4 = 0; var4 < var3; var4++) {
            ia.field_f[var4] = mh.a((byte) -117, var8);
          }
          var10.i((byte) -31);
          if (param0 <= 115) {
            uk.a((byte) -19);
          }
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5 = ia.field_f[var9];
            var5.a(6, (byte) 108, 6, 6, 1);
            var5.b(-109);
            var6 = new int[]{var5.field_g + var5.field_r >> 1, var5.field_D + var5.field_K >> 1, var5.field_E + var5.field_M >> 1};
            cb.field_d[var9] = var6;
            var5.a(-var6[2], -var6[1], -var6[0], 0);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("uk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
    }
}
