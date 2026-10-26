/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu extends vo {
    static boolean pointerMoved;
    private bm field_f;
    static String field_g;
    static String field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, Sprite[] param6, int param7, int param8, int param9, Sprite[] param10, int param11, int param12, BitmapFont param13, Sprite[] param14, BitmapFont param15, int param16, int param17, int param18, int param19, int param20) {
        String stackIn_6_2 = null;
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        try {
          Aircraft.a(param20, param0, param15, param18, new mg(param14), param8, param7, param4, param2, param13, (byte) 106, new mg(param10), param12, param17, param9, param11, param19, new mg(param6), param1, param5, param16);
          if (param3 != -28265) {
            uu.e(99);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var21 = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var21;
          StringBuilder stackIn_5_1 = new StringBuilder().append("uu.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          StringBuilder stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param14 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param15 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final pt a(String param0, int param1) {
        pt stackIn_12_0 = null;
        String stackIn_16_2 = null;
        try {
          if (param1 != 8192) {
            field_h = (String) null;
          }
          if (this.field_f instanceof mc) {
            sp var3 = ((mc) ((Object) this.field_f)).a(0);
            if (var3 != null &&
              var3.b(true) != fd.field_a) {
              pt stackIn_8_0 = bt.field_a;
              return stackIn_8_0;
            }
          }
          if (param0.equals(this.field_f.field_f)) {
            stackIn_12_0 = fd.field_a;
          } else {
            stackIn_12_0 = bt.field_a;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var3_ref;
          StringBuilder stackIn_15_1 = new StringBuilder().append("uu.DA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    uu(bm param0, bm param1) {
        super(param0);
        try {
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "uu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 8405) {
          BitmapFont var2 = (BitmapFont) null;
          uu.a(43, -66, -29, -19, -97, -21, (Sprite[]) null, -106, -7, 118, (Sprite[]) null, 107, 7, (BitmapFont) null, (Sprite[]) null, (BitmapFont) null, -45, -26, 109, -56, -123);
        }
    }

    final String a(String param0, byte param1) {
        String stackIn_18_2 = null;
        try {
          if (param1 != 72) {
            String var4 = (String) null;
            this.a((String) null, (byte) -99);
          }
          if (this.field_f instanceof mc) {
            sp var3 = ((mc) ((Object) this.field_f)).a(param1 ^ 72);
            if (var3 != null) {
              if (var3.b(true) == fd.field_a &&
                !param0.equals(this.field_f.field_f)) {
                String stackIn_8_0 = rp.field_c;
                return stackIn_8_0;
              }
              String stackIn_10_0 = var3.a(true);
              return stackIn_10_0;
            }
          }
          if (param0.equals(this.field_f.field_f)) {
            return null;
          }
          String stackIn_14_0 = rp.field_c;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var3_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("uu.EA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        pointerMoved = false;
        field_h = "Type your age in years";
        field_g = "Checking";
    }
}
