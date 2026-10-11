/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static int field_c;
    private NodeDeque[] field_b;
    static String[] field_a;
    static RgbSprite[] field_d;

    final String[] a(int param0) {
        int var4_int = 0;
        String[] array$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int var7 = 0;
        int incrementValue$1 = 0;
        int var2;
        String[][] var3;
        String[] var4;
        int var5;
        bb var5_ref_bb;
        int var6;
        u var7_ref_u;
        int var8;
        int var6Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = param0;
        var3 = new String[this.field_b.length][];
        for (var4_int = 0; this.field_b.length > var4_int; var4_int++) {
          array$2 = new String[this.field_b[var4_int].b(false)];
          var3[var4_int] = array$2;
          var5_ref_bb = new bb(this.field_b[var4_int]);
          var6 = 0;
          var7_ref_u = (u) (var5_ref_bb.c(50));
          while (var7_ref_u != null) {
            var2++;
            incrementValue$3 = var6;
            var6++;
            var3[var4_int][incrementValue$3] = var7_ref_u.field_m.a(param0 - 124);
            var7_ref_u = (u) (var5_ref_bb.b(param0 ^ 50));
          }
        }
        var4 = new String[var2 + this.field_b.length];
        var5 = 0;
        for (var6Lifetime1 = 0; this.field_b.length > var6Lifetime1; var6Lifetime1++) {
          incrementValue$0 = var5;
          var5++;
          var4[incrementValue$0] = "player [" + var6Lifetime1 + "]";
          for (var7 = 0; var3[var6Lifetime1].length > var7; var7++) {
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = var3[var6Lifetime1][var7];
          }
        }
        return var4;
    }

    final void a(byte param0) {
        int var3 = 0;
        NodeDeque var4 = null;
        bb var5 = null;
        u var6 = null;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeDeque[] var8 = this.field_b;
        NodeDeque[] var2 = var8;
        for (var3 = 0; var8.length > var3; var3++) {
          var4 = var8[var3];
          var5 = new bb(var4);
          var6 = (u) (var5.c(50));
          while (var6 != null) {
            if (var6.field_m instanceof up) {
              var6.unlink(87);
            }
            var6 = (u) (var5.b(50));
          }
        }
        if (param0 < 4) {
          field_c = -58;
        }
    }

    final static int a(int param0, int param1, int[] param2, boolean param3) {
        int var4_int = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 >= -10 &&
            param0 >= -10 &&
            244 >= param1 &&
            244 >= param0) {
            for (var4_int = 5; var4_int >= 0; var4_int--) {
              var5 = nd.field_d[var4_int];
              if (bc.field_j[var5].length <= param2[var5]) {
                param2[var5] = 0;
              }
              if (param2[var5] > -1) {
                if (bc.field_j[var5][param2[var5]].a(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                  stackIn_19_0 = var5;
                  return stackIn_19_0;
                }
              } else {
                if (lt.field_h[var5].b(dp.field_Vb[var5][0], dp.field_Vb[var5][1], param1, param0)) {
                  stackIn_16_0 = var5;
                  return stackIn_16_0;
                }
              }
            }
            if (param3) {
              field_d = (RgbSprite[]) null;
            }
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_7_0 = -2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("tt.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        bb var3 = new bb(this.field_b[param1]);
        if (param0 != 244) {
          return;
        }
        u var4 = (u) (var3.c(50));
        while (var4 != null) {
          if (var4.field_m instanceof up) {
            var4.unlink(-115);
          }
          var4 = (u) (var3.b(50));
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
          tt.a(true);
        }
    }

    final boolean a(byte param0, int param1) {
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        bb var3 = new bb(this.field_b[param1]);
        if (param0 > -49) {
          return false;
        }
        u var4 = (u) (var3.c(50));
        while (var4 != null) {
          if (var4.field_m.c(-128)) {
            return true;
          }
          var4 = (u) (var3.b(50));
        }
        return false;
    }

    final boolean a(int param0, int param1) {
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        bb var3 = new bb(this.field_b[param0]);
        u var4 = (u) (var3.c(50));
        if (param1 > -46) {
          this.a(85, 104);
        }
        while (var4 != null) {
          if (var4.field_m.b(0)) {
            return true;
          }
          var4 = (u) (var3.b(50));
        }
        return false;
    }

    tt(int param0) {
        int var2 = 0;
        this.field_b = new NodeDeque[param0];
        for (var2 = 0; var2 < this.field_b.length; var2++) {
          this.field_b[var2] = new NodeDeque();
        }
    }

    final void a(lv param0, byte param1, int param2) {
        try {
          this.field_b[param2].addFirst(750, new u(param0));
          if (param1 < 81) {
            field_a = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "tt.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
