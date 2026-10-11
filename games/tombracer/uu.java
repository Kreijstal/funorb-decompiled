/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu implements bo {
    static ht field_a;
    static int field_c;
    private int field_b;

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
          return (ir.a(param1, param2, (byte) -80) | cga.a(param1, -54, param2) | er.c(param1, param2, 52)) & ss.a((byte) 61, param2, param1);
        }
        field_c = 33;
        return (ir.a(param1, param2, (byte) -80) | cga.a(param1, -54, param2) | er.c(param1, param2, 52)) & ss.a((byte) 61, param2, param1);
    }

    final static void a(int param0, byte param1, byte[] param2, java.math.BigInteger param3, uia param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
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
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var7_int = mt.a(param0, 0);
          if (pb.field_n == null) {
            pb.field_n = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          if (param1 != -81) {
            uu.a(25);
          }
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = pb.field_n.nextInt();
          }
          if (null == hf.field_d ||
            !(hf.field_d.field_g.length >= var7_int)) {
            hf.field_d = new uia(var7_int);
          }
          hf.field_d.field_h = 0;
          hf.field_d.a(param6, param2, param0, 61);
          hf.field_d.b(716148936, var7_int);
          hf.field_d.a((byte) -48, var13);
          if (ola.field_Bb == null ||
            !(100 <= ola.field_Bb.field_g.length)) {
            ola.field_Bb = new uia(100);
          }
          ola.field_Bb.field_h = 0;
          ola.field_Bb.i(10, param1 + 81);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            ola.field_Bb.a(var13[var11], (byte) 78);
            var11++;
          }
          ola.field_Bb.f(-1477662136, param0);
          ola.field_Bb.a(102, param3, param5);
          param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
          param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("uu.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void a(kh param0, byte param1) {
        try {
          param0.h((byte) 122);
          if (param1 != -19) {
            this.field_b = 121;
          }
          this.field_b = param0.b((byte) 44, 2);
          param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uu.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 <= 2) {
          return;
        }
        this.field_b = param1;
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 >= -56) {
          return false;
        }
        return pca.b(param1, 113, param0) & ag.b(-1, param0, param1);
    }

    final static void b(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (param0 != 12475) {
            return;
          }
          try {
            lb.a(-96, "resizing", di.a(111), new Object[]{new Integer(param1)});
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, kh param1) {
        try {
          if (param0 != 200) {
            kh var4 = (kh) null;
            this.a((kh) null, (byte) 46);
          }
          param1.i(8);
          param1.a((byte) -125, this.field_b, 2);
          param1.k(param0 ^ -1826190742);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uu.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 2507) {
            field_c = -64;
          }
          var5_int = 0;
          while (true) {
            if (c.field_g.length <= var5_int) {
              return;
            }
            param3 = c.field_g[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param3;
              param3--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param0 = aia.field_t[incrementValue$1];
              dupTemp$2 = param2[param0];
              dupTemp$3 = param4[dupTemp$2];
              param4[dupTemp$2] = dupTemp$3 + 1;
              aia.field_t[dupTemp$3] = param0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("uu.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
