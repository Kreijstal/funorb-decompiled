/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    private bf field_d;
    static boolean[] field_c;
    static boolean field_b;
    private bf field_e;
    static String field_f;
    static long[] field_a;

    public static void b(byte param0) {
        field_c = null;
        field_f = null;
        if (param0 != 54) {
          field_c = (boolean[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final void c(int param0) {
        bf var2;
        int var3;
        String var4;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        while (true) {
          var2 = this.field_d.field_g;
          if (this.field_d != var2) {
            var2.a(7847);
            continue;
          }
          break;
        }
        this.field_e = null;
        if (param0 == 32) {
          return;
        }
        var4 = (String) null;
        dl.a((java.applet.Applet) null, 95, (String) null);
        return;
    }

    final bf a(boolean param0) {
        bf var2 = this.field_d.field_g;
        if (this.field_d == var2) {
          this.field_e = null;
          return null;
        }
        if (param0) {
          this.field_e = var2.field_g;
          return var2;
        }
        return (bf) null;
    }

    final bf c(byte param0) {
        bf var2 = null;
        bf var2Lifetime1;
        if (param0 != -75) {
          this.c(82);
          var2 = this.field_e;
          if (this.field_d == var2) {
            this.field_e = null;
            return null;
          }
          this.field_e = var2.field_g;
          return var2;
        }
        var2Lifetime1 = this.field_e;
        if (this.field_d == var2Lifetime1) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2Lifetime1.field_g;
        return var2Lifetime1;
    }

    final void a(bf param0, byte param1) {
        try {
          if (param0.field_e != null) {
            param0.a(7847);
          }
          param0.field_g = this.field_d;
          param0.field_e = this.field_d.field_e;
          param0.field_e.field_g = param0;
          int var3_int = 73 % ((param1 - 44) / 45);
          param0.field_g.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "dl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0) {
        bf var3 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = 0;
        bf var3Lifetime1;
        if (param0 < -68) {
          var3 = this.field_d.field_g;
          while (var3 != this.field_d) {
            var3 = var3.field_g;
            var2++;
          }
          return var2;
        }
        String var5 = (String) null;
        dl.a((java.applet.Applet) null, -12, (String) null);
        var3Lifetime1 = this.field_d.field_g;
        while (var3Lifetime1 != this.field_d) {
          var3Lifetime1 = var3Lifetime1.field_g;
          var2++;
        }
        return var2;
    }

    final static String a(java.applet.Applet param0, int param1, String param2) {
        try {
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
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
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            try {
              var3 = (String) (mf.a(param1 ^ -20969, "getcookies", param0));
              var4 = ma.a(127, ';', var3);
              var5 = 0;
              if (param1 != 14278) {
                field_c = (boolean[]) null;
              }
              while (var4.length > var5) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_8_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_8_0;
                }
                var5++;
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
            stackIn_16_1 = new StringBuilder().append("dl.G(");
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
            throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cj b(int param0) {
        if (param0 != 0) {
          return (cj) null;
        }
        if (di.field_a == ch.field_d) {
          throw new IllegalStateException();
        }
        if (f.field_i == ch.field_d) {
          ch.field_d = di.field_a;
          return cg.field_a;
        }
        return null;
    }

    public dl() {
        this.field_d = new bf();
        this.field_d.field_e = this.field_d;
        this.field_d.field_g = this.field_d;
    }

    final bf a(byte param0) {
        bf var2 = this.field_d.field_g;
        if (param0 != -120) {
          return (bf) null;
        }
        if (this.field_d != var2) {
          var2.a(7847);
          return var2;
        }
        return null;
    }

    final void a(int param0, bf param1) {
        try {
          if (null != param1.field_e) {
            param1.a(7847);
          }
          param1.field_g = this.field_d.field_g;
          if (param0 > -104) {
            field_a = (long[]) null;
          }
          param1.field_e = this.field_d;
          param1.field_e.field_g = param1;
          param1.field_g.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "dl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, ad param1) {
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          if (param0 != 11405) {
            field_b = false;
          }
          var2 = new le(param1.a("", "final_frame.jpg", 25), (java.awt.Component) ((Object) ie.field_e));
          var3 = var2.field_k;
          var4 = var2.field_j;
          vf.a((byte) 127);
          ki.field_H = new le(var3, var4 * 3 / 4);
          ki.field_H.e();
          var2.a(0, 0);
          dj.field_b = new le(var3, -ki.field_H.field_j + var4);
          dj.field_b.e();
          var2.a(0, -ki.field_H.field_j);
          dj.field_b.field_q = ki.field_H.field_j;
          tj.b(653);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "dl.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new boolean[112];
        field_b = false;
        field_a = new long[32];
        field_f = "Music: ";
    }
}
