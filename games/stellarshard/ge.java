/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends lk {
    private boolean field_o;
    static th field_m;
    static String field_l;
    static int[] field_n;
    private String field_k;

    ge(ae param0) {
        super(param0);
        this.field_o = false;
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.addMouseListener(sf.field_c);
        if (param1 > -16) {
          return;
        }
        try {
          param0.addMouseMotionListener(sf.field_c);
          param0.addFocusListener(sf.field_c);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ge.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(byte param0, CharSequence[] param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        CharSequence var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = stellarshard.field_B;
        try {
          if (param3 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param3 == 1) {
            var10 = param1[param2];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param3 + param2;
          var5 = 0;
          if (param0 != -50) {
            field_n = (int[]) null;
          }
          for (var6_int = param2; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param2; var7 < var4_int; var7++) {
            var8 = param1[var7];
            if (var8 == null) {
              discarded$0 = var6.append("null");
            } else {
              discarded$1 = var6.append(var8);
            }
          }
          stackIn_24_0 = var6.toString();
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("ge.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        field_l = null;
        field_n = null;
        if (param0) {
          field_m = (th) null;
        }
    }

    final cg a(byte param0, String param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        cg stackIn_2_0 = null;
        cg stackIn_10_0 = null;
        cg stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!lc.a(var4, 72)) {
            stackIn_2_0 = qj.field_c;
            return stackIn_2_0;
          }
          if (param0 <= 10) {
            this.field_k = (String) null;
          }
          if (!param1.equals(this.field_k)) {
            var3 = sg.a((byte) -127, param1);
            if (var3 != null &&
              var3.field_e == null) {
              this.field_o = var3.field_f;
              this.field_k = param1;
            } else {
              stackIn_10_0 = vk.field_d;
              return stackIn_10_0;
            }
          }
          if (this.field_o) {
            stackIn_15_0 = lg.field_c;
          } else {
            stackIn_15_0 = qj.field_c;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ge.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final String b(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ml var4_ref_ml = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = of.a(var5, (byte) 113);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_k)) {
            var4_ref_ml = sg.a((byte) -124, param1);
            if (var4_ref_ml == null) {
              return null;
            }
            if (null != var4_ref_ml.field_e) {
              return null;
            }
            this.field_k = param1;
            this.field_o = var4_ref_ml.field_f;
          }
          if (!this.field_o) {
            stackIn_14_0 = jb.field_p;
            return stackIn_14_0;
          }
          var4 = -120 / ((20 - param0) / 40);
          stackIn_16_0 = rh.field_c;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ge.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (param0) {
          return;
        }
        this.field_k = null;
    }

    static {
        field_m = new th();
        field_l = "This password is part of your Player Name, and would be easy to guess";
    }
}
