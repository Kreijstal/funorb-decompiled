/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class npa {
    private int field_i;
    private boolean field_g;
    static nl field_f;
    private ji field_h;
    private af field_e;
    private int field_c;
    private nf field_b;
    private int field_d;
    private ffa[] field_a;

    npa(boolean param0, int param1) {
        this(5, param0, param1);
    }

    final void a(ffa param0, byte param1) {
        int var4 = 0;
        q var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 <= 72) {
            this.field_g = false;
          }
          var5 = (q) (this.field_e.a(-128, (long)param0.a(true)));
          while (var5 != null) {
            if (param0 == var5.a((byte) -128)) {
              var5.p(100);
              var5.c(-7975);
              ft.a(var5, -201);
            }
            var5 = (q) (this.field_e.b((byte) 27));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("npa.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final ffa[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1) {
          return (ffa[]) null;
        }
        return this.a(-1 + (param3 / 2 + param2), -(param3 / 2) + param2, -1 + (param0 + param4 / 2), (byte) -102, -(param4 / 2) + param0);
    }

    final ffa[] a(byte param0, ffa param1) {
        RuntimeException var3 = null;
        ffa[] stackIn_2_0 = null;
        ffa[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -26) {
            stackIn_4_0 = this.b(param1.e(9648), -1, param1.d(3), param1.c(-48), param1.a((byte) 55));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ffa[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("npa.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final ffa[] a(int param0, int param1, int param2, int param3, int param4) {
        int var11 = 0;
        int fieldTemp$0 = 0;
        int var6;
        int var7;
        q var8;
        int var9;
        ffa var10;
        int var12;
        var12 = TombRacer.field_G ? 1 : 0;
        this.field_b.a(-2147483648, (byte) 7, 32, 2147483647, param1 >> this.field_c, param2 >> this.field_c, param3 >> this.field_c, param0 >> this.field_c, 2147483647, -2147483648);
        this.field_d = param4;
        while (!this.field_b.field_d) {
          var6 = this.field_b.b((byte) 75);
          var7 = this.field_b.b(2);
          var8 = (q) (this.field_h.a((byte) -119, (long)ira.a(var6, var7, (byte) 36)));
          while (var8 != null) {
            if (var8.a(var6, var7, true)) {
              var9 = 1;
              var10 = var8.a((byte) -80);
              for (var11 = 0; var11 < this.field_d; var11++) {
                if (var10 != this.field_a[var11]) {
                  continue;
                }
                var9 = 0;
                break;
              }
              if (var9 != 0) {
                fieldTemp$0 = this.field_d;
                this.field_d = this.field_d + 1;
                this.field_a[fieldTemp$0] = var8.a((byte) -96);
                if (this.field_a.length <= this.field_d) {
                  return this.b(0);
                }
              }
            }
            var8 = (q) (this.field_h.b(-128));
          }
          this.field_b.d(113);
        }
        return this.b(0);
    }

    private final int a(int param0, int param1) {
        if (param0 != 2) {
          return 112;
        }
        if (0 > param1) {
          return (-31 + (param1 >> this.field_c)) / 32;
        }
        return (param1 >> this.field_c) / 32;
    }

    private final ffa[] a(int param0, int param1, int param2, byte param3, int param4) {
        int var10 = 0;
        int var11 = 0;
        int var15 = 0;
        int fieldTemp$0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        q var12;
        int var13;
        ffa var14;
        int var16;
        var16 = TombRacer.field_G ? 1 : 0;
        var6 = this.a(2, param1);
        if (param3 >= -46) {
          this.field_i = -110;
        }
        var7 = this.a(2, param4);
        var8 = this.a(2, param0);
        var9 = this.a(2, param2);
        this.field_d = 0;
        for (var10 = var6; var8 >= var10; var10++) {
          for (var11 = var7; var11 <= var9; var11++) {
            var12 = (q) (this.field_h.a((byte) -80, (long)ira.a(var10, var11, (byte) -124)));
            while (var12 != null) {
              if (var12.a(var10, var11, true)) {
                var13 = 1;
                var14 = var12.a((byte) -75);
                for (var15 = 0; var15 < this.field_d; var15++) {
                  if (this.field_a[var15] != var14) {
                    continue;
                  }
                  var13 = 0;
                  break;
                }
                if (var13 != 0) {
                  fieldTemp$0 = this.field_d;
                  this.field_d = this.field_d + 1;
                  this.field_a[fieldTemp$0] = var12.a((byte) -71);
                  if (this.field_d >= this.field_a.length) {
                    return this.b(0);
                  }
                }
              }
              var12 = (q) (this.field_h.b(-106));
            }
          }
        }
        return this.b(0);
    }

    public static void c(int param0) {
        if (param0 != -2147483648) {
          return;
        }
        field_f = null;
    }

    private final ffa[] b(int param0) {
        ffa[] var2 = new ffa[this.field_d];
        lua.a(this.field_a, param0, var2, 0, this.field_d);
        return var2;
    }

    final void b(ffa param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        q var9 = null;
        q var10 = null;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = this.a(2, param0.d(param1 - 7070) - param0.c(-55) / 2);
          var4 = this.a(2, param0.e(9648) - param0.a((byte) 55) / 2);
          if (param1 != 7073) {
            return;
          }
          var5 = this.a(param1 - 7071, -1 + param0.d(3) + param0.c(-58) / 2);
          var6 = this.a(2, param0.e(param1 + 2575) - (-(param0.a((byte) 55) / 2) + 1));
          for (var7 = var3_int; var5 >= var7; var7++) {
            for (var8 = var4; var6 >= var8; var8++) {
              boolean decompiledFrameCompleted0 = true;
              if (!this.field_g ||
                param0.a(32 << this.field_c, (gma) null, 113, 32 << this.field_c, var8 * 32 + 16 << this.field_c, (ffa) null, 32 * var7 + 16 << this.field_c, 0)) {
                var9 = (q) (this.field_e.a(-121, (long)param0.a(true)));
                while (var9 != null) {
                  if (var9.a(var8, var7, param0, 123)) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var9 = (q) (this.field_e.b((byte) 35));
                }
                if (decompiledFrameCompleted0) {
                  var10 = vw.a(var7, param0, var8, true);
                  this.field_e.a(param1 ^ -7074, var10, (long)param0.a(true));
                  this.field_h.a((long)var10.hashCode(), 115, var10);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("npa.H(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final ffa[] a(pc param0, byte param1) {
        RuntimeException var3 = null;
        ffa[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -4) {
            this.field_b = (nf) null;
          }
          stackIn_3_0 = this.a(param0.field_e, param0.field_d, param0.field_k, param0.field_a, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("npa.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ffa param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = this.a(2, param0.d(3) - param0.c(-14) / 2);
          var5 = -25 / ((param1 - 13) / 51);
          var4 = this.a(2, param0.e(9648) - param0.a((byte) 55) / 2);
          var6 = this.a(2, -1 + param0.d(3) + param0.c(-51) / 2);
          var7 = this.a(2, -1 + (param0.e(9648) + param0.a((byte) 55) / 2));
          var8 = (q) (this.field_e.a(-120, (long)param0.a(true)));
          while (var8 != null) {
            if (var8.a((byte) -76) == param0 &&
              !var8.a(var7, var6, var4, var3_int, -98)) {
              var8.p(104);
              var8.c(-7975);
              ft.a(var8, -201);
            }
            var8 = (q) (this.field_e.b((byte) 119));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("npa.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 32) {
          npa.c(-128);
        }
        return wt.field_d == gsa.field_y ? true : false;
    }

    private npa(int param0, boolean param1, int param2) {
        this.field_b = new nf();
        this.field_a = new ffa[128];
        this.field_i = 1 << param0;
        this.field_h = new ji(this.field_i);
        this.field_e = new af(this.field_i);
        this.field_g = param1 ? true : false;
        this.field_c = param2;
    }

    static {
        field_f = new nl("");
    }
}
