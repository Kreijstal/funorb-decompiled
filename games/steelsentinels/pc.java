/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends IntrusiveNode {
    em field_v;
    IntrusiveNode field_u;
    static String field_r;
    static fm field_p;
    int field_t;
    static String field_s;
    static String field_o;
    static SceneWidget field_q;
    static boolean field_w;

    final static int e(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2Lifetime1;
        var3 = SteelSentinels.obfuscationControl;
        try {
          var1_int = 0;
          for (var2 = 0; var2 < fe.field_D.length; var2++) {
            var1_int = var1_int + mm.a((byte) 101, fe.field_D[var2]);
          }
          if (param0 < 115) {
            stackIn_6_0 = -66;
            return stackIn_6_0;
          }
          var4 = 0;
          var2Lifetime1 = var4;
          while (rn.field_D.length > var4) {
            var1_int = var1_int + mm.a((byte) 112, rn.field_D[var4]);
            var4++;
          }
          stackIn_11_0 = var1_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "pc.D(" + param0 + ')');
        }
    }

    final static void a(int param0, RgbSprite[] param1, int param2, BitmapFont param3, int param4, int param5, int param6, int param7, int param8, RgbSprite[] param9, int param10, int param11, int param12, int param13, int param14, int param15, BitmapFont param16, int param17, RgbSprite[] param18, int param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          vk.a(param14, param13, param5, param6, param10, param7, new ak(param18), (byte) -115, param16, param11, new ak(param9), param19, param15, param2, param0, param12, param4, param17, param3, new ak(param1), param8);
          if (param20 < 2) {
            field_p = (fm) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("pc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_q = null;
        int var1 = -124 / ((62 - param0) / 37);
        field_o = null;
        field_p = null;
        field_r = null;
    }

    final static void d(int param0) {
        if (sb.field_bb.field_i != jn.field_c) {
          va.field_b = va.field_b + (-jn.field_c + sb.field_bb.field_i);
          jn.field_c = sb.field_bb.field_i;
        }
        if (!(wa.field_p <= 0)) {
          wa.field_p = wa.field_p - 1;
        }
        if (param0 >= -17) {
          return;
        }
        if (!(0 >= wa.field_p)) {
          nn.a(false);
        }
    }

    pc(em param0, IntrusiveNode param1) {
        try {
          this.field_v = param0;
          this.field_t = param0.f();
          this.field_u = param1;
          this.field_v.e(this.field_t * lb.field_ac + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Invite more players, or alternatively try changing the following settings:  ";
        field_p = new fm(8, 0, 4, 1);
        field_s = "This password contains repeated characters, and would be easy to guess";
        field_o = "Match by...";
    }
}
