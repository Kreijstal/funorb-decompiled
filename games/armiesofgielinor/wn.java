/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends ih {
    private boolean field_cb;
    private int[] field_fb;
    private int field_ib;
    static je field_kb;
    static String field_db;
    static String field_gb;
    private int[] field_S;
    static String[] field_eb;
    static mq field_jb;
    private vk field_hb;
    static String field_bb;

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int >= param1 &&
            var3_int <= 12) {
            var4 = k.a(param0, false);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!rs.a(var4.charAt(0), (byte) -111) &&
                !rs.a(var4.charAt(var4.length() - 1), (byte) -74)) {
                var5 = 0;
                for (var6 = 0; var6 < param0.length(); var6++) {
                  var7 = param0.charAt(var6);
                  if (rs.a((char) var7, (byte) -42)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (2 <= var5 &&
                    !param2) {
                    return false;
                  }
                }
                if (var5 <= 0) {
                  return true;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("wn.AB(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (-1 == param1) {
          this.field_ib = param0;
          return;
        }
        super.a(param0, param1, (byte) -28);
        this.field_S[param1] = param0 << 12;
        if (param2 > -13) {
          um var5 = (um) null;
          this.a(true, (byte) 40, true, (um) null);
        }
    }

    public wn() {
        this.field_fb = new int[16];
        this.field_ib = 256;
        this.field_S = new int[16];
        this.k(3933);
    }

    final static void a(int param0, RgbSprite[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != null &&
            param2 > 0) {
            var6_int = param1[0].canvasWidth;
            var7 = param1[2].canvasWidth;
            var8 = param1[1].canvasWidth;
            param1[0].b(param3, param4, param0);
            param1[2].b(-var7 + param2 + param3, param4, param0);
            SoftwareRaster.b(an.field_H);
            SoftwareRaster.b(var6_int + param3, param4, param3 + param2 - var7, param1[1].canvasHeight + param4);
            if (param5 != -3225) {
              wn.a(true);
            }
            var9 = var6_int + param3;
            var10 = -var7 + param2 + param3;
            for (param3 = var9; var10 > param3; param3 = param3 + var8) {
              param1[1].b(param3, param4, param0);
            }
            SoftwareRaster.a(an.field_H);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("wn.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 != 52) {
          CharSequence var2 = (CharSequence) null;
          wn.a((CharSequence) null, -50, false);
        }
        field_kb = null;
        field_jb = null;
        field_eb = null;
        field_bb = null;
        field_db = null;
        field_gb = null;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = this.i(4096);
          this.f(-87, this.field_ib * var4_int >> 8);
          super.b(param0, param1, param2);
          if (!this.field_cb) {
            var5 = 1;
            for (var6 = 0; var6 < 16; var6++) {
              var7 = this.field_fb[var6];
              if (0 != var7) {
                this.field_S[var6] = this.field_S[var6] + var7 * param2;
                var8 = this.field_hb.field_a[var6];
                stackIn_10_0 = (var7 <= 0) ? 0 : 1;
                if (this.field_S[var6] >> 12 >= var8) {
                  stackIn_13_1 = 0;
                } else {
                  stackIn_13_1 = 1;
                }
                if ((stackIn_10_0 ^ stackIn_13_1) != 0) {
                  this.field_fb[var6] = 0;
                  this.field_S[var6] = var8 << 12;
                } else {
                  var5 = 0;
                }
                super.a(this.field_S[var6] >> 12, var6, (byte) -123);
              }
            }
            if (var5 != 0) {
              this.field_cb = true;
            }
          }
          this.f(-54, var4_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("wn.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized void a(int param0, vk param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_hb = param1;
          if (param2 != -20751) {
            field_kb = (je) null;
          }
          for (var4_int = 0; 16 > var4_int; var4_int++) {
            this.c(param0, var4_int, -128, this.field_hb.field_a[var4_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("wn.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized void c(int param0, int param1, int param2, int param3) {
        this.field_cb = false;
        if (null == this.field_hb) {
          this.field_hb = new vk();
        }
        this.field_hb.field_a[param1] = param3;
        if (param2 >= -126) {
          this.a(82, -42, (byte) 31);
        }
        int var5 = this.field_S[param1];
        int var6 = (this.field_hb.field_a[param1] << 12) - var5;
        int var7 = 0;
        int var8 = 0;
        if (var6 < 0) {
          var6 = -var6;
          var8 = 1;
        }
        if (var6 > 0) {
          var7 = (1 + var6) / (param0 + 1);
        }
        this.field_fb[param1] = var8 != 0 ? -var7 : var7;
    }

    wn(ih param0) {
        super(param0);
        this.field_fb = new int[16];
        this.field_ib = 256;
        this.field_S = new int[16];
        try {
          this.k(3933);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        if (32 >= te.field_n) {
          jf.b(0, 99);
        } else {
          var1 = te.field_n % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          jf.b(te.field_n - var1, 108);
        }
        if (!param0) {
          field_jb = (mq) null;
        }
    }

    final synchronized void a(boolean param0, byte param1, boolean param2, um param3) {
        try {
          if (param1 > -78) {
            this.field_hb = (vk) null;
          }
          this.k(3933);
          super.a(param0, (byte) -110, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "wn.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(byte param0, int param1, vk param2) {
        int var4_int = 0;
        try {
          var4_int = param1 * rc.field_d / 1000;
          int var5 = 58 / ((9 - param0) / 36);
          this.a(var4_int, param2, -20751);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "wn.BB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var2 = 0; var2 < 16; var2++) {
          this.field_S[var2] = 1048576;
        }
        if (param0 != 3933) {
          RgbSprite[] var4 = (RgbSprite[]) null;
          wn.a(47, (RgbSprite[]) null, 67, -125, 49, -47);
        }
        super.a(256, -1, (byte) -20);
    }

    static {
        field_gb = "Move here";
        field_eb = new String[]{"tutorial.lev", "tutorial2.lev"};
        field_bb = "This unit cannot use ranged weapons.";
    }
}
