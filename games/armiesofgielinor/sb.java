/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends rb implements fb, rp {
    en field_j;
    static int[] field_g;
    static je field_i;
    static String field_f;
    static PacketBuffer field_h;
    static int field_d;
    static kl field_e;

    public final void b(fn param0, int param1) {
        try {
          int var3_int = -12 / ((-80 - param1) / 33);
          this.a(127);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sb.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, gh param1) {
        if (param0 > -82) {
          return;
        }
        try {
          this.a(125);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sb.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_e = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0) {
          String var2 = (String) null;
          sb.a((String) null, (byte) -81);
        }
    }

    public sb() {
    }

    final String b(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_j.l(97);
          var3 = this.field_j.m(-26458);
          if (param0 != -71) {
            this.c(-41);
          }
          var4 = this.field_j.a((byte) -77);
          var5 = ActionSpell.b(true);
          if (var4 >= 1890 &&
            var4 <= var5 - 3) {
            if (dt.a(var4, -24375, var3, var2_int)) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
          } else {
            stackIn_6_0 = fo.a(4800, cv.field_r, new String[]{"1890", Integer.toString(-3 + var5)});
            return stackIn_6_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return StateChangeEvent.field_z;
    }

    final static rn a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        rn stackIn_4_0 = null;
        rn stackIn_8_0 = null;
        rn stackIn_18_0 = null;
        rn stackIn_21_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_4_0 = hv.field_N;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = el.field_e;
            return stackIn_8_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var2_int - 1 == var3) {
                stackIn_18_0 = ov.field_h;
                return stackIn_18_0;
              }
            } else {
              if (ew.field_c.indexOf(var4) == -1) {
                stackIn_21_0 = ov.field_h;
                return stackIn_21_0;
              }
            }
          }
          if (param1 == -107) {
            return null;
          }
          var6 = (String) null;
          sb.a((String) null, (byte) -62);
          stackIn_26_0 = null;
          return (rn) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("sb.P(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final gu c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gu stackIn_2_0 = null;
        gu stackIn_5_0 = null;
        gu stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_j.l(50);
          var3 = this.field_j.m(-26458);
          var4 = this.field_j.a((byte) -77);
          var5 = ActionSpell.b(true);
          if (var4 < 1890) {
            stackIn_2_0 = rn.field_e;
            return stackIn_2_0;
          }
          var6 = 26 % ((param0 - 56) / 32);
          if (var4 > -3 + var5) {
            stackIn_5_0 = rn.field_e;
            return stackIn_5_0;
          }
          if (!dt.a(var4, -24375, var3, var2_int)) {
            stackIn_8_0 = rn.field_e;
            return stackIn_8_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return rn.field_e;
        }
        return oo.field_g;
    }

    public final boolean b(int param0) {
        if (param0 <= 12) {
          field_g = (int[]) null;
        }
        return this.field_j.k(-22339);
    }

    public final void a(fn param0, int param1) {
        try {
          if (param1 != 80) {
            field_h = (PacketBuffer) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sb.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = 2;
        field_f = "You currently have an ongoing mission at this location.<br><Br>You are on turn <col=ffff00><%0></col>. <br><br>Do you wish to resume this mission or do you want to abort it and restart?";
        field_g = new int[]{166};
    }
}
