/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_a;
    private tg field_e;
    static cf field_c;
    private vj field_h;
    static he[] field_g;
    static byte[] field_b;
    private vj field_d;
    private tg field_f;

    final static void a(byte param0) {
        sg.field_a = false;
        oi.field_c = false;
        sf.a(-1, 11649);
        lc.field_h = pj.field_D;
        fk.field_q = pj.field_D;
        if (param0 == -107) {
          return;
        }
        field_g = (he[]) null;
    }

    private final vk a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        vk var8 = null;
        tk var9 = null;
        vk stackIn_5_0 = null;
        Object stackIn_18_0 = null;
        vk stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk var8Lifetime1;
        try {
          var5_int = (param1 >>> 12 | (4095 & param1) << 4) ^ param0;
          var5_int = var5_int | param1 << 16;
          if (param3 >= -88) {
            cf.a((byte) -46);
          }
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (vk) (this.field_f.a(true, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param2 != null &&
            0 >= param2[0]) {
            return null;
          }
          var9 = (tk) (this.field_e.a(true, var6));
          if (var9 == null) {
            var9 = tk.a(this.field_h, param1, param0);
            if (var9 == null) {
              return null;
            }
            this.field_e.a(var9, var6, -1);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            stackIn_18_0 = null;
            return (vk) (stackIn_18_0);
          }
          var9.a(-16175);
          this.field_f.a(var8Lifetime1, var6, -1);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("cf.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0) {
            field_g = (he[]) null;
          }
          uc.b();
          b.field_m = 11;
          fc.field_b = new int[260];
          for (var1_int = 0; 256 > var1_int; var1_int++) {
            var2 = 15.0;
            fc.field_b[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < fc.field_b.length) {
            fc.field_b[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "cf.E(" + param0 + ')');
        }
    }

    private final vk b(int param0, int param1, int[] param2, int param3) {
        vk discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        vk var8 = null;
        kb var9 = null;
        int[] var10 = null;
        vk var11 = null;
        vk stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        vk stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk var8Lifetime1;
        try {
          var5_int = param3 ^ (param0 >>> 12 | (param0 & 536875007) << 4);
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int;
          var8 = (vk) (this.field_f.a(true, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param1 != -609592560) {
            var10 = (int[]) null;
            discarded$1 = this.b(-34, -12, (int[]) null, 51);
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_8_0 = null;
            return (vk) (stackIn_8_0);
          }
          var9 = kb.a(this.field_d, param0, param3);
          if (var9 == null) {
            return null;
          }
          var11 = var9.a();
          var8Lifetime1 = var11;
          this.field_f.a(var8Lifetime1, var6, -1);
          if (param2 != null) {
            param2[0] = param2[0] - var11.field_i.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("cf.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_g = null;
        if (param0 > -60) {
          field_b = (byte[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final vk a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        vk stackIn_5_0 = null;
        vk stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 256) {
            var5 = (int[]) null;
            this.a((int[]) null, -91, -63);
          }
          if (this.field_h.b(param0 - 16288) == 1) {
            stackIn_5_0 = this.a(param1, 0, param2, -106);
            return stackIn_5_0;
          }
          if (this.field_h.a(param1, (byte) 127) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(0, param1, param2, -93);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("cf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    cf(vj param0, vj param1) {
        this.field_e = new tg(256);
        this.field_f = new tg(256);
        try {
          this.field_h = param1;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final vk a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        vk stackIn_3_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d.b(-16032) == 1) {
            stackIn_3_0 = this.b(0, -609592560, param0, param1);
            return stackIn_3_0;
          }
          if (this.field_d.a(param1, (byte) 127) != param2) {
            throw new RuntimeException();
          }
          stackIn_7_0 = this.b(param1, -609592560, param0, 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("cf.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = "Confirm Password: ";
    }
}
