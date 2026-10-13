/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ki {
    private String field_h;
    int field_m;
    static int field_a;
    static String field_g;
    vm field_n;
    static String field_o;
    static BlankScreen field_p;
    private int[] field_c;
    private oe[] field_b;
    private String[] field_j;
    boolean field_q;
    int field_l;
    static int pressedButton;
    static int[] field_i;
    static mf field_f;
    static RgbSprite[][] field_k;
    static int field_d;

    RgbSprite c(byte param0) {
        if (param0 > -74) {
          return (RgbSprite) null;
        }
        return kb.field_Ub[gb.field_n];
    }

    final oe[] a(int param0) {
        String var3 = null;
        String var2 = null;
        if (this.field_l < this.field_b.length) {
          var3 = this.field_j[this.field_c[this.field_l]];
          var2 = var3;
          if (BrickABrac.field_I.a(var2, "", (byte) -121)) {
            this.field_b[this.field_l] = l.field_m.a(var3, "", (byte) 122);
          }
          if (og.field_gc.a(var2, "", (byte) -121)) {
            this.field_b[this.field_l] = l.field_m.a((byte) 28, var3, "");
          }
          if (this.field_b[this.field_l] != null) {
            this.field_l = this.field_l + 1;
          }
        }
        if (param0 != 0) {
          field_f = (mf) null;
        }
        return this.field_b;
    }

    abstract void a(boolean param0, int param1, int param2, int param3, int param4);

    RgbSprite[] b(int param0) {
        if (param0 >= -12) {
          return (RgbSprite[]) null;
        }
        return im.field_a;
    }

    ki(int param0, String param1, String param2, int param3) {
        this(param0, param1, uc.a(param3, param2, (byte) -1));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        int var8;
        var9 = BrickABrac.field_J ? 1 : 0;
        if (param4 > param1) {
          if (param4 >= param5) {
            if (param5 > param1) {
              k.a(param2, param6, param1, Rasterizer2D.pixels, param4, param5, param0, param3, 0);
            } else {
              k.a(param3, param6, param5, Rasterizer2D.pixels, param4, param1, param0, param2, 0);
            }
          } else {
            k.a(param6, param2, param1, Rasterizer2D.pixels, param5, param4, param0, param3, 0);
          }
        } else {
          if (param5 > param1) {
            k.a(param3, param2, param4, Rasterizer2D.pixels, param5, param1, param0, param6, 0);
          } else {
            if (param4 < param5) {
              k.a(param2, param3, param4, Rasterizer2D.pixels, param1, param5, param0, param6, 0);
            } else {
              k.a(param6, param3, param5, Rasterizer2D.pixels, param1, param4, param0, param2, 0);
            }
          }
        }
        var8 = 88 % ((-60 - param7) / 62);
    }

    final void e(int param0) {
        if (!this.b((byte) -99)) {
          this.a(false);
        }
        if (param0 != 1) {
          String var3 = (String) null;
          ki.a((java.applet.Applet) null, 122, (String) null);
        }
    }

    RgbSprite[] a(byte param0, int param1) {
        int var3 = -89 % ((param0 - 65) / 49);
        return null;
    }

    abstract boolean a(boolean param0);

    abstract boolean b(byte param0);

    RgbSprite a(boolean param0, int param1) {
        if (param0) {
          return null;
        }
        field_g = (String) null;
        return null;
    }

    abstract void a(byte param0, int param1, int param2, int param3);

    public static void a(byte param0) {
        if (param0 != 7) {
          return;
        }
        field_o = null;
        field_i = null;
        field_p = null;
        field_g = null;
        field_k = (RgbSprite[][]) null;
        field_f = null;
    }

    final void d(int param0) {
        vm dupTemp$0 = null;
        int fieldTemp$1 = 0;
        if (this.field_n == null) {
          dupTemp$0 = vm.a(mh.field_lb, "", this.field_h);
          this.field_n = dupTemp$0;
          if (dupTemp$0 == null) {
            return;
          }
        }
        if (!m.field_f.a(param0 ^ -74, this.field_n, 22050, ji.field_a, l.field_m)) {
          return;
        }
        if (sk.field_H > 0) {
          fieldTemp$1 = sk.field_H - 1;
          sk.field_H = sk.field_H - 1;
          if (0 == fieldTemp$1) {
            m.field_f.a((byte) 118);
          }
        }
        this.field_q = true;
        if (param0 != 59) {
          this.a(-106);
        }
    }

    final static String a(java.applet.Applet param0, int param1, String param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_8_0 = null;
          Object stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = BrickABrac.field_J ? 1 : 0;
          try {
            try {
              if (param1 < 74) {
                ki.a((byte) 0);
              }
              var3 = (String) (ne.a("getcookies", -127, param0));
              var4 = qb.a((byte) 122, var3, ';');
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_8_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("ki.W(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int c(int param0) {
        if (param0 > -72) {
          this.a(57, false);
        }
        return 256;
    }

    abstract void a(int param0, byte param1, int param2, int param3, int param4);

    RgbSprite[] a(int param0, boolean param1) {
        if (param1) {
          return null;
        }
        return (RgbSprite[]) null;
    }

    private ki(int param0, String param1, String[] param2) {
        int var4_int = 0;
        try {
          this.field_h = param1;
          this.field_m = param0;
          this.field_j = param2;
          this.field_b = new oe[this.field_j.length];
          this.field_c = new int[this.field_j.length];
          for (var4_int = 0; this.field_c.length > var4_int; var4_int++) {
            this.field_c[var4_int] = var4_int;
          }
          ke.a(this.field_c, (byte) 39, hi.field_w);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ki.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Please select options in the following rows:  ";
        field_a = 1;
        field_o = "World select";
        pressedButton = 0;
        field_p = new BlankScreen();
        field_i = new int[5];
        field_d = 256;
    }
}
