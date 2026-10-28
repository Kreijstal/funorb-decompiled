/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb extends bj {
    static String field_O;
    static java.applet.Applet field_P;
    static IntrusiveDeque field_L;
    static int field_H;
    private int field_N;
    static String field_J;
    static String field_K;
    static int[] field_R;
    private tb field_Q;
    boolean field_G;
    static String field_I;

    boolean j(int param0) {
        if (param0 != -13907) {
          return false;
        }
        int var2 = this.k(-1);
        int var3 = var2 - this.field_N;
        if (0 < var3) {
          this.field_N = this.field_N + (8 + var3 - 1) / 8;
        }
        if (var3 < 0) {
          this.field_N = this.field_N + (1 + (var3 - 16)) / 16;
        }
        boolean stackIn_12_0 = (0 == this.field_N) && (0 == var2) && (!this.field_G);
        return stackIn_12_0;
    }

    final hm a(boolean param0) {
        hm var2 = super.a(param0);
        if (var2 != null) {
          return var2;
        }
        return (hm) (this);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (0 == this.field_N) {
          return;
        }
        if (this.field_N >= 256) {
          if (param2 != 0) {
            return;
          }
          this.b(this.field_j + param0, param3 + this.field_k, (byte) 89);
          super.a(param0, (byte) 87, param2, param3);
          return;
        }
        if (Minimap.field_r == null ||
          !(Minimap.field_r.width >= this.field_g) ||
          !(this.field_x <= Minimap.field_r.height)) {
          Minimap.field_r = new Sprite(this.field_g, this.field_x);
        }
        eo.a(Minimap.field_r, (byte) -76);
        SoftwareRasterizer.d();
        this.b(0, 0, (byte) 87);
        super.a(-this.field_j - param0, (byte) 118, param2, -this.field_k - param3);
        if (param1 <= 85) {
          field_L = (IntrusiveDeque) null;
        }
        dl.a((byte) 125);
        Minimap.field_r.d(this.field_k + param3, this.field_j + param0, this.field_N);
    }

    final static void a(int param0, int param1, int param2, IndexedSprite param3, int param4, int param5) {
        String stackIn_36_2 = null;
        int var20 = EscapeVector.obfuscationControl;
        try {
          if (param2 != 4163) {
            String var21 = (String) null;
            bb.a(-7, (String) null, 'ﾱ');
          }
          int var6_int = (param5 - param1 << 8) / param3.field_a;
          param0 = param0 + param3.field_f;
          param4 = param4 + param3.field_i;
          int var7 = var6_int * param3.field_f + (param1 << 8);
          int var8 = param4 * SoftwareRasterizer.width + param0;
          int var9 = 0;
          int var10 = param3.field_d;
          int var11 = param3.field_g;
          int var12 = -var11 + SoftwareRasterizer.width;
          int var13 = 0;
          if (SoftwareRasterizer.clipTop > param4) {
            int var14 = SoftwareRasterizer.clipTop - param4;
            var10 = var10 - var14;
            var8 = var8 + SoftwareRasterizer.width * var14;
            param4 = SoftwareRasterizer.clipTop;
            var9 = var9 + var14 * var11;
          }
          if (param4 + var10 > SoftwareRasterizer.clipBottom) {
            var10 = var10 - (var10 + param4 - SoftwareRasterizer.clipBottom);
          }
          if (param0 < SoftwareRasterizer.clipLeft) {
            int var14Lifetime1 = -param0 + SoftwareRasterizer.clipLeft;
            var8 = var8 + var14Lifetime1;
            var7 = var7 + var6_int * var14Lifetime1;
            param0 = SoftwareRasterizer.clipLeft;
            var11 = var11 - var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
          }
          if (var11 + param0 > SoftwareRasterizer.clipRight) {
            int var14Lifetime2 = -SoftwareRasterizer.clipRight + var11 + param0;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param4 = -var10; 0 > param4; param4++) {
              int var14Lifetime3 = var7;
              for (param0 = -var11; 0 > param0; param0++) {
                int var15 = var14Lifetime3 >> 8;
                int var16 = 256 - var15;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 < 0) {
                  var8++;
                  var9++;
                } else {
                  int incrementValue$0 = var9;
                  var9++;
                  int var17 = param3.field_l[param3.field_k[incrementValue$0] & 255];
                  if (var17 != 0) {
                    if (255 >= var15) {
                      int var18 = SoftwareRasterizer.pixels[var8];
                      int var19 = 16711935 & var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8;
                      SoftwareRasterizer.pixels[var8] = (ae.a(ae.a(var17, 65280) * var15 + var16 * ae.a(var18, 65280), 16711906) >> 8) + var19;
                    } else {
                      SoftwareRasterizer.pixels[var8] = var17;
                    }
                  }
                  var8++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_35_0 = var6;
          StringBuilder stackIn_35_1 = new StringBuilder().append("bb.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        String stackIn_9_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (param0 != -23466) {
            return;
          }
          while (true) {
            param3--;
            if (0 > param3) {
              return;
            }
            int[] var9 = param4;
            int[] var5 = var9;
            int var6 = param1;
            int var7 = param2;
            var9[var6] = ae.a(var9[var6] >> 1, 8355711) + var7;
            param1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("bb.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void h(byte param0) {
        if (param0 != 127) {
          field_H = -93;
        }
        field_P = null;
        field_L = null;
        field_R = null;
        field_I = null;
        field_J = null;
        field_O = null;
        field_K = null;
    }

    bb(tb param0, int param1, int param2) {
        super(dm.field_h - param1 >> 1, r.field_B - param2 >> 1, param1, param2, (db) null);
        try {
          this.field_G = false;
          this.field_N = 0;
          this.field_Q = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void b(int param0, int param1, byte param2);

    private final int k(int param0) {
        if (param0 != -1) {
          field_J = (String) null;
        }
        return this.field_G ? this.field_Q.n(0) != this ? 0 : 256 : 0;
    }

    final static String[] a(int param0, String param1, char param2) {
        int var8 = 0;
        String stackIn_14_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          CharSequence var11 = (CharSequence) ((Object) param1);
          int var3_int = un.a(var11, 4277, param2);
          String[] var4 = new String[var3_int + 1];
          if (param0 > -127) {
            String var10 = (String) null;
            bb.a(119, (String) null, 'e');
          }
          int var5 = 0;
          int var6 = 0;
          for (int var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param1.charAt(var8) != param2; var8++) {
            }
            int incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param1.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param1.substring(var6);
          String[] stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("bb.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(byte param0) {
        int var2 = -106 / ((param0 - 7) / 55);
        this.field_N = this.k(-1);
        boolean stackIn_4_0 = (this.field_N == 0) && (!this.field_G);
        return stackIn_4_0;
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 255) {
          field_K = (String) null;
        }
        this.a(param2, -param1 + r.field_B >> 1, -param2 + dm.field_h >> 1, true, param1);
    }

    static {
        field_O = "Back";
        field_H = 0;
        field_J = "Cancel";
        field_R = new int[]{1, 160};
        field_K = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_I = "to keep fullscreen or";
    }
}
