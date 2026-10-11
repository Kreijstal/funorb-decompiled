/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends DualNode {
    char[] field_F;
    String field_D;
    static rf field_G;
    int[] field_C;
    char[] field_z;
    int[] field_A;
    static SceneWidget field_E;
    static int field_y;
    boolean field_B;

    final void a(int param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = SteelSentinels.obfuscationControl;
        int var3_intLifetime1;
        try {
          while (true) {
            var3_int = param1.f((byte) -107);
            if (0 == var3_int) {
              break;
            }
            this.a(param1, var3_int, (byte) -123);
          }
          var3_intLifetime1 = -10 % ((-28 - param0) / 36);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "mn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() >= hl.field_o) {
            if (param1.length() > hf.field_e) {
              return true;
            }
            if (param0 != -30157) {
              mn.g(59);
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("mn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = SteelSentinels.obfuscationControl;
        int var2Lifetime1;
        if (this.field_A != null) {
          for (var2 = 0; var2 < this.field_A.length; var2++) {
            this.field_A[var2] = vn.a(this.field_A[var2], 32768);
          }
        }
        if (param0 != -3) {
          this.field_F = (char[]) null;
        }
        if (null != this.field_C) {
          var4 = 0;
          var2Lifetime1 = var4;
          while (var4 < this.field_C.length) {
            this.field_C[var4] = vn.a(this.field_C[var4], 32768);
            var4++;
          }
        }
    }

    private final void a(PacketBuffer param0, int param1, byte param2) {
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4_intLifetime1;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (1 == param1) {
            this.field_D = param0.h(1);
          } else {
            if (param1 == 2) {
              var4_int = param0.f((byte) -59);
              this.field_C = new int[var4_int];
              this.field_z = new char[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_C[var5] = param0.c((byte) -60);
                var6 = param0.d((byte) -2);
                stackIn_16_0 = this.field_z;
                stackIn_16_1 = var5;
                if (var6 != 0) {
                  stackIn_17_2 = eh.a((byte) -71, (byte) var6);
                } else {
                  stackIn_17_2 = 0;
                }
                stackIn_16_0[stackIn_16_1] = (char) stackIn_17_2;
              }
            } else {
              if (param1 == 3) {
                var4_int = param0.f((byte) -66);
                this.field_F = new char[var4_int];
                this.field_A = new int[var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  this.field_A[var5] = param0.c((byte) -60);
                  var6 = param0.d((byte) -2);
                  stackIn_8_0 = this.field_F;
                  stackIn_8_1 = var5;
                  if (0 != var6) {
                    stackIn_9_2 = eh.a((byte) -71, (byte) var6);
                  } else {
                    stackIn_9_2 = 0;
                  }
                  stackIn_8_0[stackIn_8_1] = (char) stackIn_9_2;
                }
              } else {
                if (param1 == 4) {
                  this.field_B = true;
                }
              }
            }
          }
          var4_intLifetime1 = -16 % ((param2 - 46) / 58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("mn.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_G = null;
        field_E = null;
        if (param0 != 1) {
          field_E = (SceneWidget) null;
        }
    }

    final static java.awt.Frame a(int param0, int param1, pn param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_28_0 = null;
        java.awt.Frame stackIn_34_0 = null;
        Object stackIn_40_0 = null;
        java.awt.Frame stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        vc[] var10 = null;
        wj var11 = null;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (!param2.b(-98)) {
            return null;
          }
          if (0 == param4) {
            var10 = nc.a(38, param2);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (param3 == var10[var8].field_a &&
                var10[var8].field_g == param1 && ((param5 == 0 ||
                var10[var8].field_i == param5) &&
                (var7_int == 0 ||
                !(var10[var8].field_j <= param4)))) {
                var7_int = 1;
                param4 = var10[var8].field_j;
              }
            }
            if (var7_int == 0) {
              stackIn_28_0 = null;
              return (java.awt.Frame) (stackIn_28_0);
            }
          }
          var11 = param2.a(param1, param5, param4, param3, 6);
          while (0 == var11.field_a) {
            a.a((byte) 127, 10L);
          }
          if (param0 != 22230) {
            stackIn_34_0 = (java.awt.Frame) null;
            return stackIn_34_0;
          }
          var7 = (java.awt.Frame) (var11.field_c);
          if (var7 == null) {
            return null;
          }
          if (var11.field_a != 2) {
            stackIn_42_0 = var7;
            return stackIn_42_0;
          }
          ok.a(-1, param2, var7);
          stackIn_40_0 = null;
          return (java.awt.Frame) (stackIn_40_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_45_0 = var6_ref;
          stackIn_45_1 = new StringBuilder().append("mn.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    mn() {
        this.field_B = false;
    }

    static {
        field_G = new rf();
        field_y = 0;
    }
}
