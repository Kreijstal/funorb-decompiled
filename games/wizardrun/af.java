/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af {
    static String[] field_c;
    static String field_b;
    static o field_a;
    fg[] field_d;
    static int field_e;

    final int a(int param0, String param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = wizardrun.field_H;
        try {
          if (param2 != 6454) {
            stackIn_3_0 = 111;
            return stackIn_3_0;
          }
          var5_int = 0;
          var6 = 0;
          var7 = param1.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param1.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 != 62) {
                if (var6 == 0 &&
                  32 == var9) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (0 >= var5_int) {
            stackIn_23_0 = 0;
            return stackIn_23_0;
          }
          stackIn_21_0 = (-param0 + param3 << 8) / var5_int;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("af.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 78) {
            field_e = 119;
          }
          stackIn_3_0 = ga.a(param0, 10, 58, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("af.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0) {
        int var4 = 0;
        int var2;
        fg[] var3;
        fg var5;
        int var7;
        int var6;
        var7 = wizardrun.field_H;
        if (param0 > -109) {
          af.a(false);
        }
        var2 = -1;
        if (null != this.field_d) {
          var3 = this.field_d;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a(0);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        fg var5 = null;
        int var6 = wizardrun.field_H;
        fg[] var7 = this.field_d;
        fg[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (param1 < var5.field_e.length) {
            return var5.field_e[param1];
          }
          param1 = param1 - (-1 + var5.field_e.length);
        }
        if (param0 != 62) {
          field_c = (String[]) null;
          return 0;
        }
        return 0;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          CharSequence var2 = (CharSequence) null;
          af.a((CharSequence) null, (byte) 104);
        }
        field_b = null;
        field_a = null;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        fg var6 = null;
        int var7 = 0;
        int var8 = wizardrun.field_H;
        if (this.field_d == null ||
          this.field_d.length == 0 ||
          param2 < this.field_d[0].field_a) {
          return -1;
        }
        if (!(this.field_d[-1 + this.field_d.length].field_b >= param2)) {
          return -1;
        }
        if (this.field_d.length == 1) {
          return this.field_d[0].a(-1, param0);
        }
        if (param1 <= 104) {
          return -9;
        }
        int var4 = 0;
        for (var5 = 0; var5 < this.field_d.length; var5++) {
          var6 = this.field_d[var5];
          if (var6.field_a <= param2 &&
            param2 <= var6.field_b) {
            var7 = var6.a(-1, param0);
            if (-1 == var7) {
              return -1;
            }
            return var7 + var4;
          }
          var4 = var4 + (var6.field_e.length - 1);
        }
        return -1;
    }

    final int a(byte param0, int param1) {
        fg var4 = null;
        int var5 = wizardrun.field_H;
        int var3 = 0;
        if (param0 < 86) {
          CharSequence var6 = (CharSequence) null;
          af.a((CharSequence) null, (byte) -48);
        }
        while (var3 < this.field_d.length) {
          var4 = this.field_d[var3];
          if (param1 < var4.field_e.length) {
            return var3;
          }
          param1 = param1 - (-1 + var4.field_e.length);
          var3++;
        }
        return this.field_d.length;
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 <= 1) {
          return -35;
        }
        if (this.field_d != null &&
          this.field_d.length > 0) {
          stackIn_6_0 = this.field_d[-1 + this.field_d.length].field_b - this.field_d[0].field_a;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    static {
        field_b = "You have not yet submitted";
        field_c = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = 20;
    }
}
