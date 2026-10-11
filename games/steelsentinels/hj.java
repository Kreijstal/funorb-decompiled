/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends IntrusiveNode {
    int field_D;
    int field_B;
    int field_I;
    static PacketBuffer field_H;
    int field_M;
    static int field_F;
    int field_O;
    static int field_w;
    int field_K;
    int field_r;
    int field_L;
    sk field_q;
    int field_y;
    em field_A;
    int field_p;
    static String field_u;
    int field_t;
    int field_x;
    int field_C;
    bj field_E;
    int field_v;
    ca field_N;
    static String field_s;
    int field_o;
    int field_z;
    int field_J;

    public static void e(int param0) {
        field_s = null;
        field_u = null;
        if (param0 != 0) {
          return;
        }
        field_H = null;
    }

    final static RgbSprite[] a(byte param0, RgbSprite param1) {
        RgbSprite[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        RgbSprite[] var4 = null;
        RgbSprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new RgbSprite[9];
          var2 = var4;
          if (param0 != 26) {
            var3 = (int[]) null;
            hj.a(87, false, (int[]) null, (int[]) null);
          }
          var4[4] = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("hj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0, m param1) {
        if (param0 <= 26) {
          return;
        }
        try {
          ob.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "hj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        this.field_A = null;
        this.field_N = null;
        if (param0 != 4096) {
          return;
        }
        this.field_q = null;
        this.field_E = null;
    }

    final static ArticulatedPart a(int param0, boolean param1, int[] param2, int[] param3) {
        int var9 = 0;
        ArticulatedPart stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        ArticulatedPart stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ArticulatedPart var6 = null;
        ArticulatedPart var7 = null;
        int var8 = 0;
        int var10 = 0;
        var10 = SteelSentinels.obfuscationControl;
        try {
          if (param3 == null) {
            return null;
          }
          if (param3.length == 0) {
            return null;
          }
          var4_int = 0;
          var5 = param3[var4_int++];
          if (param0 != -24809) {
            stackIn_8_0 = (ArticulatedPart) null;
            return stackIn_8_0;
          }
          var6 = NodeDeque.a(var5, (byte) 67);
          if (var6 != null &&
            var6.field_Q == 1) {
            var7 = new ArticulatedPart(var6, param1);
            var4_int = var7.a(var4_int, param3, param1, 0);
            for (var9 = 0; var9 < 8; var9++) {
              param2[var9] = -1;
            }
            var8 = var4_int;
            var4_int = var8;
            while (true) {
              if (param3.length <= var4_int) {
                stackIn_24_0 = var7;
                return stackIn_24_0;
              }
              if (-var8 + var4_int < 8) {
                param2[-var8 + var4_int] = param3[var4_int];
                var4_int++;
                continue;
              }
              break;
            }
            dh.a("Too much data", (byte) 121);
            stackIn_21_0 = null;
            return (ArticulatedPart) (stackIn_21_0);
          }
          dh.a(db.a("Chassis not correct id: ID=<%0>", -43, new String[]{Integer.toString(var5)}), (byte) 120);
          stackIn_13_0 = null;
          return (ArticulatedPart) (stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("hj.D(").append(param0).append(',').append(param1).append(',');
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
          throw ci.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          try {
            if (!pn.field_w.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (true) {
              if (param1.length() <= var3) {
                if (param0 != -9062) {
                  field_s = (String) null;
                }
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                return true;
              }
              if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("hj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    hj() {
    }

    static {
        field_w = 4096;
        field_u = "Scamming";
    }
}
