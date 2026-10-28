/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    Sprite[] field_g;
    static String[] field_f;
    static Sprite field_c;
    static int field_h;
    static int field_a;
    static int[] field_j;
    static String field_e;
    static String field_i;
    Sprite field_d;
    int field_b;

    public static void b(int param0) {
        field_c = null;
        field_j = null;
        if (param0 <= 39) {
          field_j = (int[]) null;
        }
        field_e = null;
        field_i = null;
        field_f = null;
    }

    final boolean a(int param0) {
        if (null == this.field_g) {
          Sprite[] var2 = tk.a(false, kc.field_c);
          Sprite[] var3 = tk.a(false, HudMessage.field_k);
          if (var2 != null &&
            var3 != null) {
            this.field_g = this.a((byte) -28, var2, var3);
          }
        }
        if (param0 != 23389) {
          this.a(-100);
        }
        if (null == this.field_d) {
          this.field_d = tk.field_b.b(-100);
        }
        if (null == this.field_g) {
          return false;
        }
        if (null == this.field_d) {
          return false;
        }
        return true;
    }

    private final int a(int param0, Sprite param1, int param2, byte param3) {
        String stackIn_10_2 = null;
        try {
          int var5_int = this.a(param2, param0, param1, 5214);
          if (var5_int < 0) {
            int stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (param3 >= -88) {
            Sprite var6 = (Sprite) null;
            int discarded$1 = this.a(43, 80, (Sprite) null, 108);
          }
          int stackIn_6_0 = param1.pixels[var5_int];
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("p.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final Sprite a(Sprite param0, Sprite param1, byte param2) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (param2 != -48) {
            field_a = -34;
          }
          for (int var4_int = 0; param0.fullHeight > var4_int; var4_int++) {
            for (int var5 = 0; param0.fullWidth > var5; var5++) {
              int var6 = this.a(var5, param1, var4_int, (byte) -93);
              if (var6 == 0) {
                this.a(var4_int, 0, (byte) -128, param0, var5);
              }
            }
          }
          Sprite stackIn_12_0 = (Sprite) (param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("p.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    private final Sprite[] a(int param0, Sprite[] param1) {
        String stackIn_9_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          for (int var3_int = param0; var3_int < param1.length; var3_int++) {
            Sprite var4 = this.a(param0 + 0, param1[var3_int]);
            param1[var3_int] = var4;
          }
          Sprite[] stackIn_5_0 = (Sprite[]) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("p.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2, Sprite param3, int param4) {
        int var7 = -100 % ((param2 - 45) / 54);
        int var6_int = this.a(param0, param4, param3, 5214);
        if (0 > var6_int) {
          return;
        }
        try {
          param3.pixels[var6_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "p.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static Sprite a(byte param0, String param1, ResourceArchive param2, String param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          int var4_int = param2.b(-1, param3);
          int var5 = param2.a(var4_int, param1, true);
          if (param0 != 8) {
            String var6 = (String) null;
            p.a((byte) -89, (String) null, (ResourceArchive) null, (String) null);
          }
          Sprite stackIn_3_0 = CachedArchiveProvider.a(param2, true, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("p.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final Sprite[] a(byte param0, Sprite[] param1, Sprite[] param2) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          param2 = this.a(0, param2);
          if (param0 != -28) {
            this.field_d = (Sprite) null;
          }
          Sprite[] stackIn_3_0 = this.a(0, param1, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("p.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final Sprite[] a(int param0, Sprite[] param1, Sprite[] param2) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          for (int var4_int = param0; param1.length > var4_int; var4_int++) {
            Sprite var5 = this.a(param1[var4_int], param2[var4_int], (byte) -48);
            param1[var4_int] = var5;
          }
          Sprite[] stackIn_5_0 = (Sprite[]) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4;
          StringBuilder stackIn_8_1 = new StringBuilder().append("p.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final Sprite a(int param0, Sprite param1) {
        String stackIn_12_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int[] var7 = param1.pixels;
          int[] var3 = var7;
          for (int var4 = param0; var7.length > var4; var4++) {
            int var5 = var7[var4];
            var5 = (var5 != 0) ? 1 : 0;
            var7[var4] = var5;
          }
          Sprite stackIn_8_0 = (Sprite) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3_ref;
          StringBuilder stackIn_11_1 = new StringBuilder().append("p.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, Sprite param2, int param3) {
        String stackIn_21_2 = null;
        try {
          if (param1 < param2.offsetX) {
            int stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param2.offsetY > param0) {
            int stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          param1 = -param2.offsetX + param1;
          if (param2.width <= param1) {
            int stackIn_9_0 = -1;
            return stackIn_9_0;
          }
          if (param3 != 5214) {
            p.b(43);
          }
          param0 = param0 - param2.offsetY;
          if (param2.height <= param0) {
            int stackIn_15_0 = -1;
            return stackIn_15_0;
          }
          int var5_int = param0 * param2.width + param1;
          int stackIn_17_0 = var5_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var5;
          StringBuilder stackIn_20_1 = new StringBuilder().append("p.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    p() {
        this.field_b = 2917671;
    }

    static {
        field_f = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = 20;
        field_e = "to return to the normal view.";
        field_j = new int[]{15, 26};
    }
}
