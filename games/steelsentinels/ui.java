/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends ug {
    static IndexedSprite[] field_V;
    int field_R;
    static boolean field_T;
    static u field_U;
    static String field_W;
    static String field_S;
    static boolean field_G;

    public static void h(int param0) {
        field_U = null;
        field_V = null;
        if (param0 == -13) {
          field_W = null;
          field_S = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        ui.a(20, (CharSequence) null);
        field_W = null;
        field_S = null;
    }

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (jd.a(param1.charAt(var2_int), -33)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (jd.a(param1.charAt(-1 + var3), -33)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < param0) {
            return null;
          }
          if (var4 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param1.charAt(var6);
            if (qh.a((byte) -30, (char) var7)) {
              var8 = sg.a((byte) 115, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (0 != var5.length()) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("ui.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    ui(lh param0) {
        super(param0.field_o, param0.field_z, param0.field_x, param0.field_E, (qk) null, (tn) null);
        try {
          param0.a(0, (byte) -101, 0, this.field_x, this.field_E);
          this.field_J = param0;
          this.field_R = 256;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        if (this.field_J == null) {
          return;
        }
        if (0 == this.field_R) {
          return;
        }
        if (this.field_R == 256) {
          this.field_J.a(param0 + this.field_z, (byte) -117, param2 + this.field_o, param3);
          return;
        }
        RgbSprite var6 = new RgbSprite(this.field_J.field_x, this.field_J.field_E);
        if (param1 <= -99) {
          q.a(var6, (byte) -90);
          this.field_J.a(0, (byte) -128, 0, param3);
          tk.$cfr$intArgs$f$20d51497949f(114);
          var6.b(this.field_o + param2, this.field_z + param0, this.field_R);
          return;
        }
    }

    final static int a(boolean param0) {
        if (param0) {
          return -12;
        }
        return al.field_d;
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = mm.field_g;
        var2.writeCipheredOpcode(param0, (byte) -117);
        var2.writeByte((byte) 111, 1);
        var2.writeByte((byte) 119, param1);
    }

    public ui() {
        super(0, 0, 0, 0, (qk) null, (tn) null);
        this.field_R = 256;
    }

    static {
        field_W = "<%0> is not on your ignore list.";
        field_S = "<%0>:<%1><%2>";
        field_G = false;
    }
}
