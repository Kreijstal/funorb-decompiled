/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fn extends fw {
    static int field_M;
    private int field_O;
    private int field_L;
    static int[] field_Q;
    private int field_V;
    private long field_T;
    private int field_R;
    private long field_U;
    private boolean field_P;
    static String field_S;
    private boolean field_N;

    private final String o(int param0) {
        if (param0 >= -58) {
          return (String) null;
        }
        int var2 = this.field_O > this.field_L ? this.field_L : this.field_O;
        int var3 = this.field_O > this.field_L ? this.field_O : this.field_L;
        return this.field_v.substring(var2, var3);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 == this.field_O) {
          return this.field_O;
        }
        var2 = -1 + this.field_O;
        var3 = -88 / ((param0 - 11) / 55);
        while (0 < var2) {
          if (this.field_v.charAt(var2 - 1) != 32) {
            var2--;
            continue;
          }
          break;
        }
        return var2;
    }

    private final void b(boolean param0) {
        this.a((byte) -53);
        if (!param0) {
          this.field_V = 32;
        }
        this.j(1000);
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 1000) {
          return;
        }
        if (this.field_L != this.field_O) {
          var2 = this.field_O > this.field_L ? this.field_L : this.field_O;
          var3 = this.field_O <= this.field_L ? this.field_L : this.field_O;
          this.field_L = var2;
          this.field_O = var2;
          this.field_v = this.field_v.substring(0, var2) + this.field_v.substring(var3, this.field_v.length());
          this.d((byte) -123);
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        pm var5 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.l(param0 - 32722);
          if (1 == this.field_q) {
            if (this.field_k instanceof pm) {
              var5 = (pm) ((Object) this.field_k);
              var6 = var5.a((kb) (this), sm.field_d, 113, param2, ko.field_b, param1);
              if (var6 != -1) {
                if (this.field_P &&
                  this.field_V > var6 &&
                  var6 > this.field_L) {
                  var6 = this.field_V;
                }
                this.field_O = var6;
              }
            }
            this.field_U = vi.b(98);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fn.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void n(int param0) {
        if (param0 >= -46) {
          return;
        }
        if (this.field_x instanceof fb) {
          ((fb) (this.field_x)).a(this, 80);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != -27934) {
            field_M = -84;
          }
          if (param1 == null) {
            param1 = "";
          }
          this.field_v = param1;
          var4_int = param1.length();
          if (this.field_R != -1 &&
            var4_int > this.field_R) {
            this.field_v = this.field_v.substring(0, this.field_R);
          }
          dupTemp$1 = this.field_v.length();
          this.field_L = dupTemp$1;
          this.field_O = dupTemp$1;
          if (!param0) {
            this.d((byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("fn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var5 = null;
        js var6 = null;
        int var8 = 0;
        String var9 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9 = "";
          if (43 == param1) {
            param1 = 77;
          }
          if (param2 != -32596) {
            return;
          }
          if (!param0) {
            if (param1 == 16) {
              param1 = 78;
            }
            if (param1 == 25) {
              param1 = 79;
            }
            if (param1 == 48) {
              param1 = 80;
            }
            if (param1 == 85) {
              param1 = 89;
            }
          }
          if (param1 == 76) {
            bn.field_a = new kk[SpellAreaSelection.field_m[param1].length];
            bn.field_a[0] = SpellAreaSelection.field_k[param1][0];
          }
          for (var4 = 1; var4 < SpellAreaSelection.field_m[param1].length; var4++) {
            if (null == SpellAreaSelection.field_k[param1][var4]) {
              var5 = SpellAreaSelection.field_m[param1][var4];
              var6 = hs.a(var5, param2 ^ -32697, var9);
              if (var6 != null) {
                if (th.a(var6, -17900)) {
                  nh.field_D[param1] = true;
                }
                if (null != var6.field_p) {
                  for (var7 = 0; var7 < var6.field_O; var7++) {
                    if (var6.field_p[var7] == 2) {
                      var6.field_q[var7] = 0;
                      var6.field_o[var7] = 0;
                      var6.field_r[var7] = 0;
                    }
                  }
                }
                SpellAreaSelection.field_k[param1][var4] = var6.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
                if (param1 == 76) {
                  bn.field_a[var4] = SpellAreaSelection.field_k[param1][var4];
                }
                if (0 == ((gd) (SpellAreaSelection.field_k[param1][var4])).field_I) {
                  SpellAreaSelection.field_k[param1] = null;
                }
              }
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "fn.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_1 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_U = vi.b(-82);
          if (param3 != -12215) {
            return true;
          }
          if (param2 != 60 &&
            param2 != 62) {
            if (param2 >= 32 &&
              param2 <= 126) {
              if (this.field_O != this.field_L) {
                this.j(1000);
              }
              if (this.field_R == -1 ||
                !(this.field_v.length() >= this.field_R)) {
                if (this.field_O >= this.field_v.length()) {
                  this.field_v = this.field_v + param2;
                  dupTemp$0 = this.field_v.length();
                  this.field_O = dupTemp$0;
                  this.field_L = dupTemp$0;
                } else {
                  this.field_v = this.field_v.substring(0, this.field_O) + param2 + this.field_v.substring(this.field_O, this.field_v.length());
                  this.field_O = this.field_O + 1;
                  this.field_L = this.field_O;
                }
                this.d((byte) -123);
              }
              return true;
            }
            if (85 == param1) {
              if (this.field_L != this.field_O) {
                this.j(1000);
                return true;
              }
              if (0 >= this.field_O) {
                return false;
              }
              this.field_L = -1 + this.field_O;
              this.j(1000);
              return true;
            }
            if (param1 == 101) {
              if (this.field_L != this.field_O) {
                this.j(1000);
                return true;
              }
              if (this.field_O < this.field_v.length()) {
                this.field_L = 1 + this.field_O;
                this.j(1000);
                return true;
              }
            } else {
              if (param1 == 13) {
                this.k(98);
                return true;
              }
              if (param1 != 96) {
                if (param1 != 97) {
                  if (param1 == 102) {
                    this.a(0, (byte) -59);
                    return true;
                  }
                  if (103 == param1) {
                    this.a(this.field_v.length(), (byte) -59);
                    return true;
                  }
                  if (param1 == 84) {
                    this.n(-92);
                    return true;
                  }
                  if (br.field_f[82] &&
                    param1 == 65) {
                    this.b(true);
                    return true;
                  }
                  if (br.field_f[82] &&
                    param1 == 66) {
                    this.a((byte) -53);
                    return true;
                  }
                  if (br.field_f[82] &&
                    67 == param1) {
                    this.f((byte) -104);
                    return true;
                  }
                } else {
                  if (this.field_O < this.field_v.length()) {
                    if (!br.field_f[82]) {
                      stackIn_34_1 = this.field_O + 1;
                    } else {
                      stackIn_34_1 = this.p(-97);
                    }
                    this.a(stackIn_34_1, (byte) -59);
                    return true;
                  }
                }
              } else {
                if (this.field_O > 0) {
                  if (br.field_f[82]) {
                    stackIn_27_1 = this.e((byte) 81);
                  } else {
                    stackIn_27_1 = -1 + this.field_O;
                  }
                  this.a(stackIn_27_1, (byte) -59);
                  return true;
                }
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_82_0 = var5;
          stackIn_82_1 = new StringBuilder().append("fn.F(");
          if (param0 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, RgbSprite param3) {
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RgbSprite var16 = null;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param3.i();
          var4_int = 0;
          var5 = param3.field_y / 2;
          if (param0 != 8678) {
            var16 = (RgbSprite) null;
            fn.a(-106, -71, -114, (RgbSprite) null);
          }
          var6 = param3.field_v / 2;
          stackIn_6_0 = (var5 >= var6) ? var6 : var5;
          var7 = stackIn_6_0;
          for (var8 = 0; param3.field_v > var8; var8++) {
            for (var9 = 0; param3.field_y > var9; var9++) {
              var10 = (int)Math.sqrt((double)((var9 - var5) * (var9 - var5) + (var8 - var6) * (-var6 + var8)));
              if (param2 <= var10) {
                var10 = -(param1 * (-param2 + var10) / (-param2 + var7)) + param1;
              } else {
                var10 = param1;
              }
              if (0 < var10) {
                var11 = param3.field_B[var4_int];
                if (var11 == 1) {
                  var11 = 0;
                }
                var12 = (var11 & 16711680) + (var10 << 16);
                var13 = (var11 & 65280) + (var10 << 8);
                if (var12 > 16711680) {
                  var12 = 16711680;
                }
                var14 = (var11 & 255) + var10;
                if (var13 > 65280) {
                  var13 = 65280;
                }
                if (255 < var14) {
                  var14 = 255;
                }
                param3.field_B[var4_int] = oe.c(oe.c(var12, var13), var14);
              }
              var4_int++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_32_0 = var4;
          stackIn_32_1 = new StringBuilder().append("fn.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    fn(String param0, qo param1, int param2) {
        super(param0, param1);
        this.field_T = 0L;
        this.field_P = false;
        this.field_V = -1;
        try {
          this.field_k = t.field_c.field_w;
          this.field_R = param2;
          this.a(true, param0, -27934);
          this.field_N = true;
          this.field_U = vi.b(-83);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        this.field_O = 0;
        this.field_L = 0;
        this.field_v = "";
        int var2 = 26 % ((33 - param0) / 36);
        this.d((byte) -126);
    }

    private final void l(int param0) {
        int discarded$0 = 0;
        ju var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        pm var9;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.field_N) {
          this.field_r = 0;
          this.field_z = 0;
          return;
        }
        if (!(this.field_k instanceof pm)) {
          return;
        }
        var9 = (pm) ((Object) this.field_k);
        var3 = var9.a(-100, (kb) (this));
        if (param0 != 0) {
          discarded$0 = this.e((byte) -33);
        }
        var4 = var3.a(false);
        var5 = var9.b(66, (kb) (this));
        var6 = var9.a(true) >> 1;
        if (-var6 + var5 > var4) {
          this.field_z = 0;
          this.field_r = 0;
          return;
        }
        var7 = this.field_r + var3.a((byte) -66, this.field_O);
        if (var5 - var6 < var7) {
          this.field_r = this.field_r - var7 - var6 + var5;
        } else {
          if (var7 < var6) {
            this.field_r = this.field_r + (-var7 + var6);
          }
        }
        if (this.field_r <= 0) {
          if (var6 - var5 > this.field_r) {
            this.field_r = var6 - var5;
          }
        } else {
          this.field_r = 0;
        }
        return;
    }

    void d(byte param0) {
        if (this.field_x instanceof fb) {
          ((fb) (this.field_x)).b(this, 111);
        }
        if (param0 >= -114) {
          this.field_R = -53;
        }
    }

    private final void a(byte param0) {
        String var2 = this.o(param0 ^ 108);
        if (param0 != -53) {
          return;
        }
        if (0 < var2.length()) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.o(-74))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(int param0, byte param1) {
        this.field_O = param0;
        if (!br.field_f[81]) {
          this.field_L = this.field_O;
        }
        if (param1 != -59) {
          this.n(-104);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int stackIn_9_1 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (param3 <= 103) {
            return false;
          }
          if (!super.a(param0, param1, param2, 119, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_k instanceof pm)) {
            return false;
          }
          var8_int = ((pm) ((Object) this.field_k)).a((kb) (this), sm.field_d, 87, param2, ko.field_b, param1);
          if (var8_int != -1) {
            stackIn_9_1 = var8_int;
          } else {
            stackIn_9_1 = 0;
          }
          this.a(stackIn_9_1, (byte) -59);
          var8_long = vi.b(39);
          stackIn_12_1 = !(-this.field_T + var8_long >= 250L);
          this.field_P = stackIn_12_1;
          if (this.field_P) {
            this.field_L = this.e((byte) -85);
            this.field_O = this.p(-89);
            if (this.field_O > 0 &&
              this.field_v.charAt(this.field_O - 1) == 32) {
              this.field_O = this.field_O - 1;
            }
            this.field_V = this.field_O;
          }
          this.field_T = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_24_0 = var8;
          stackIn_24_1 = new StringBuilder().append("fn.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void m(int param0) {
        if (param0 != 32) {
          field_Q = (int[]) null;
        }
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        pm var8 = null;
        long var6 = 0L;
        if (param2 > -82) {
          return;
        }
        if (this.field_k != null &&
          param3 == 0) {
          this.field_k.a((kb) (this), param0, -128, this.field_I, param1);
          if (this.field_k instanceof pm) {
            var8 = (pm) ((Object) this.field_k);
            if (this.field_O != this.field_L) {
              var8.a(-21259, this.field_O, this.field_L, (kb) (this), param1, param0);
            }
            var6 = vi.b(-126);
            if ((var6 - this.field_U) % 1000L < 500L) {
              var8.a(param1, 1024, param0, (kb) (this), this.field_O);
            }
          }
        }
    }

    private final void f(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          kb var3 = null;
          try {
            if (param0 != -104) {
              var3 = (kb) null;
              this.a((kb) null, -59, 'x', 71);
            }
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.j(param0 + 1104);
            this.a(var2, (byte) -114);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_R != -1) {
            var3_int = this.field_R - this.field_v.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_O != this.field_v.length()) {
            this.field_v = this.field_v.substring(0, this.field_O) + param0 + this.field_v.substring(this.field_O, this.field_v.length());
          } else {
            this.field_v = this.field_v + param0;
          }
          this.field_O = this.field_O + param0.length();
          this.field_L = this.field_O;
          if (param1 > -78) {
            this.field_L = 91;
            this.d((byte) -126);
          } else {
            this.d((byte) -126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("fn.BA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int p(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 > -10) {
          return -64;
        }
        var2 = this.field_v.length();
        if (this.field_O == var2) {
          return this.field_O;
        }
        for (var3 = this.field_O + 1; var3 < var2; var3++) {
          if (this.field_v.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    static {
        field_M = 9;
        field_Q = new int[]{-1, -1, 4, 5, -1, -1, -1, 2, 0, 1, -1, 3, 6, 6, 8, 9};
        field_S = "Sacrifice";
    }
}
