/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends tfa implements lv {
    private int field_k;
    private int field_l;
    static String field_m;
    private int field_n;

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param1.length();
          if (param0 != 1) {
            field_m = (String) null;
          }
          while (var2_int < var3) {
            if (hf.a(param0 ^ 114, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (hf.a(param0 ^ 116, param1.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param1.charAt(var6);
            if (ov.a(param0 + 16, (char) var7)) {
              var8 = cp.a((byte) 0, (char) var7);
              if (0 != var8) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static Class a(Object param0, int param1) {
        RuntimeException var2 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_m = (String) null;
          }
          if (Integer.class.isInstance(param0)) {
            stackIn_5_0 = Integer.TYPE;
            return stackIn_5_0;
          }
          if (Byte.class.isInstance(param0)) {
            stackIn_8_0 = Byte.TYPE;
            return stackIn_8_0;
          }
          if (Short.class.isInstance(param0)) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (Long.class.isInstance(param0)) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (Boolean.class.isInstance(param0)) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (Float.class.isInstance(param0)) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (Double.class.isInstance(param0)) {
            stackIn_23_0 = Double.TYPE;
            return stackIn_23_0;
          }
          if (!Character.class.isInstance(param0)) {
            return null;
          }
          stackIn_27_0 = Character.TYPE;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("jd.F(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    jd(kda param0, ft param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, 32879, param1, una.field_g, param4 * param2 * param3, false);
        try {
          this.field_n = param4;
          this.field_l = param3;
          this.field_k = param2;
          this.field_j.a(true, (iva) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage3Dub(this.field_i, 0, this.d(120), this.field_k, this.field_l, this.field_n, 0, waa.a(this.field_f, 1383), 5121, param5, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, hs param1) {
        try {
          if (param0 != 7672) {
            this.field_k = 12;
          }
          super.a(param0 + 0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != 32242) {
          field_m = (String) null;
        }
    }

    final static String a(boolean param0) {
        int var3 = 0;
        String var1;
        String[] var2;
        String var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var1 = "";
        var2 = dra.field_b;
        if (param0) {
          return (String) null;
        }
        for (var3 = 0; var2.length > var3; var3++) {
          var4 = var2[var3];
          if (!var4.startsWith("Unused")) {
            var1 = var1 + var4 + "\n";
          }
        }
        return var1;
    }

    public final void b(byte param0) {
        if (param0 < 32) {
          CharSequence var3 = (CharSequence) null;
          jd.a(-106, (CharSequence) null);
        }
        super.b((byte) 56);
    }

    static {
        field_m = "Mobile mirrors";
    }
}
