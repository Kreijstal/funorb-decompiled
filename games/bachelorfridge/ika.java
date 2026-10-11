/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ika {
    static gba field_a;
    eaa field_b;
    int field_c;

    final static tk a(byte param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        tk stackIn_2_0 = null;
        tk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.e((byte) 118);
          var3 = param1.e((byte) 45);
          var4 = param1.e((byte) 80);
          if (param0 != 85) {
            stackIn_2_0 = (tk) null;
            return stackIn_2_0;
          }
          var5 = param1.e((byte) 61);
          var6 = param1.b(16711935);
          var7 = param1.b(16711935);
          var8 = param1.e((byte) 97);
          var9 = param1.b(16711935);
          var10 = param1.e((byte) 118);
          var11 = param1.e((byte) 83);
          var12 = param1.e((byte) 54);
          var13 = param1.e((byte) 102);
          var14 = param1.e((byte) 47);
          var15 = param1.e((byte) 124);
          var16 = param1.e((byte) 77);
          var17 = param1.e((byte) 45);
          var18 = param1.e((byte) 59);
          var19 = param1.b(16711935);
          stackIn_4_0 = new tk(var2_int, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ika.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        if (param6 < 0) {
          return;
        }
        var8 = param6 / 60;
        param6 = param6 % 60;
        if (0 != (4 & param1)) {
          var8 = var8 % 60;
        }
        var9 = param6 / 10;
        var10 = param6 % 10;
        if (param4 >= -52) {
          field_a = (gba) null;
        }
        var11 = var8 / 10;
        var12 = var8 % 10;
        if ((2 & param1) != 0) {
          ce.a(true, param3, param5, "" + var11, param2, true);
          param2 = param2 + (jha.field_g.a("" + var11) + (param0 + 2));
          ce.a(true, param3, param5, "" + var12, param2, true);
          param2 = param2 + (2 + (jha.field_g.a("" + var11) + param0));
          if ((param1 & 32) == 0) {
            ce.a(true, param3, param5, ":", param2, true);
          } else {
            if (0 == (param6 & 1)) {
              ce.a(true, param3, param5, ":", param2, true);
            }
          }
          param2 = param2 + (jha.field_g.a(":") + param0);
        }
        if ((1 & param1) != 0) {
          ce.a(true, param3, param5, "" + var9, param2, true);
          param2 = param2 + (param0 + jha.field_g.a("" + var9) + 2);
          ce.a(true, param3, param5, "" + var10, param2, true);
          param2 = param2 + (jha.field_g.a("" + var10) + param0 + 2);
        }
    }

    ika(byte[] param0) {
        this(new lu(param0));
    }

    final static void a(byte param0, il param1) {
        try {
          if (param0 != 18) {
            ika.a(70, -118, -128, -79, -74, -69, 108, -112);
          }
          jka.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ika.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          ika.a(124, 64, -125, -20, 67, -93, -14, 87);
          field_a = null;
          return;
        }
        field_a = null;
    }

    private ika(lu param0) {
        this.field_b = new eaa();
        try {
          this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ika.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(lu param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          this.field_c = param0.e((byte) 114);
          for (var3_int = param1; var3_int < this.field_c; var3_int++) {
            this.field_b.a(new ft(param0), true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ika.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
