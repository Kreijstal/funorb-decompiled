/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hf extends hl {
    private int field_F;
    private long field_M;
    static int field_I;
    private int field_N;
    private int field_L;
    private long field_O;
    private int field_K;
    static qk field_H;
    private boolean field_J;
    private boolean field_G;

    void k(int param0) {
        if (param0 != 64) {
          this.b(true);
        }
        if (this.field_k instanceof pi) {
          ((pi) (this.field_k)).a(this, 12891);
        }
    }

    private final void b(boolean param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.f((byte) -56);
            this.a(var2, (byte) 127);
            if (param0) {
              this.b(true);
            }
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

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int[] param9, int param10) {
        int var11_int = 0;
        int var12 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        CharSequence var16 = null;
        var15 = Main.field_T;
        try {
          for (var11_int = -param1; 0 > var11_int; var11_int++) {
            for (var12 = -param8; var12 < 0; var12++) {
              incrementValue$0 = param5;
              param5++;
              param3 = param4[incrementValue$0] & 255;
              if (param3 == 0) {
                param6++;
              } else {
                var13 = param9[param6];
                var14 = 256 - param3;
                incrementValue$1 = param6;
                param6++;
                param9[incrementValue$1] = bc.a(-16711936, bc.a(param2, 16711935) * param3 + bc.a(16711935, var13) * var14) + bc.a(var14 * bc.a(var13, 65280) + param3 * bc.a(param2, 65280), 16711680) >> 8;
              }
            }
            param6 = param6 + param7;
            param5 = param5 + param0;
          }
          if (param10 < 124) {
            var16 = (CharSequence) null;
            hf.a((CharSequence) null, (byte) 65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_15_0 = var11;
          stackIn_15_1 = new StringBuilder().append("hf.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param10).append(')').toString());
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if (this.field_K != -1) {
          var3_int = this.field_K - this.field_r.length();
          if (0 <= var3_int) {
            return;
          }
          param0 = param0.substring(0, var3_int);
        }
        if (this.field_N != this.field_r.length()) {
          this.field_r = this.field_r.substring(0, this.field_N) + param0 + this.field_r.substring(this.field_N, this.field_r.length());
        } else {
          this.field_r = this.field_r + param0;
        }
        this.field_N = this.field_N + param0.length();
        if (param1 != 127) {
          return;
        }
        try {
          this.field_F = this.field_N;
          this.k(param1 ^ 63);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hf.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void n(int param0) {
        this.field_N = 0;
        int var2 = -99 / ((-22 - param0) / 40);
        this.field_F = 0;
        this.field_r = "";
        this.k(64);
    }

    hf(String param0, pl param1, int param2) {
        super(param0, param1);
        this.field_O = 0L;
        this.field_L = -1;
        this.field_G = false;
        try {
          this.field_v = pj.field_a.field_r;
          this.field_K = param2;
          this.a(param0, -18845, true);
          this.field_J = true;
          this.field_M = id.a(39);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        int stackIn_8_1 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        lk var10 = null;
        try {
          if (param3 >= -14) {
            var10 = (lk) null;
            this.a('k', (byte) 63, -72, (lk) null);
          }
          if (!super.a(param0, param1, param2, -83, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_v instanceof ne)) {
            return false;
          }
          var8_int = ((ne) ((Object) this.field_v)).a(eg.field_b, param1, -10989, param0, (lk) (this), ij.field_e);
          if (-1 == var8_int) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = var8_int;
          }
          this.a(stackIn_8_1, 72);
          var8_long = id.a(117);
          stackIn_11_1 = !(250L <= var8_long - this.field_O);
          this.field_G = stackIn_11_1;
          if (this.field_G) {
            this.field_F = this.m(-1);
            this.field_N = this.j(-98);
            if (0 < this.field_N &&
              this.field_r.charAt(this.field_N - 1) == 32) {
              this.field_N = this.field_N - 1;
            }
            this.field_L = this.field_N;
          }
          this.field_O = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("hf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 == null) {
            param0 = "";
          }
          this.field_r = param0;
          var4_int = param0.length();
          if (param1 != -18845) {
            this.field_L = -96;
          }
          if (this.field_K != -1 &&
            var4_int > this.field_K) {
            this.field_r = this.field_r.substring(0, this.field_K);
          }
          dupTemp$2 = this.field_r.length();
          this.field_F = dupTemp$2;
          this.field_N = dupTemp$2;
          if (!param2) {
            this.k(64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("hf.HA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        int dupTemp$0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_M = id.a(93);
          if (param0 == 60) {
            return false;
          }
          if (param0 == 62) {
            return false;
          }
          if (param0 >= 32 &&
            param0 <= 126) {
            if (this.field_N != this.field_F) {
              this.f((byte) -56);
            }
            if (-1 == this.field_K ||
              !(this.field_r.length() >= this.field_K)) {
              if (this.field_N < this.field_r.length()) {
                this.field_r = this.field_r.substring(0, this.field_N) + param0 + this.field_r.substring(this.field_N, this.field_r.length());
                this.field_N = this.field_N + 1;
                this.field_F = this.field_N;
              } else {
                this.field_r = this.field_r + param0;
                dupTemp$0 = this.field_r.length();
                this.field_N = dupTemp$0;
                this.field_F = dupTemp$0;
              }
              this.k(64);
            }
            return true;
          }
          if (param2 == 85) {
            if (this.field_N != this.field_F) {
              this.f((byte) -56);
              return true;
            }
            if (this.field_N > 0) {
              this.field_F = -1 + this.field_N;
              this.f((byte) -56);
              return true;
            }
          } else {
            if (param2 == 101) {
              if (this.field_F != this.field_N) {
                this.f((byte) -56);
                return true;
              }
              if (this.field_N < this.field_r.length()) {
                this.field_F = 1 + this.field_N;
                this.f((byte) -56);
                return true;
              }
            } else {
              if (param2 == 13) {
                this.n(121);
                return true;
              }
              if (param2 != 96) {
                if (param2 == 97) {
                  if (this.field_N < this.field_r.length()) {
                    if (ge.field_c[82]) {
                      stackIn_47_1 = this.j(-117);
                    } else {
                      stackIn_47_1 = 1 + this.field_N;
                    }
                    this.a(stackIn_47_1, 80);
                    return true;
                  }
                } else {
                  if (param2 == 102) {
                    this.a(0, 104);
                    return true;
                  }
                  if (param2 == 103) {
                    this.a(this.field_r.length(), 72);
                    return true;
                  }
                  if (param2 == 84) {
                    this.i(17091);
                    return true;
                  }
                  if (ge.field_c[82] &&
                    param2 == 65) {
                    this.l(11514);
                    return true;
                  }
                  if (ge.field_c[82] &&
                    param2 == 66) {
                    this.a(true);
                    return true;
                  }
                  if (ge.field_c[82] &&
                    param2 == 67) {
                    this.b(false);
                    return true;
                  }
                }
              } else {
                if (this.field_N > 0) {
                  if (ge.field_c[82]) {
                    stackIn_18_1 = this.m(-1);
                  } else {
                    stackIn_18_1 = -1 + this.field_N;
                  }
                  this.a(stackIn_18_1, 104);
                  return true;
                }
              }
            }
          }
          if (param1 >= -99) {
            this.field_O = 77L;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_78_0 = var5;
          stackIn_78_1 = new StringBuilder().append("hf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        this.field_N = param0;
        if (!ge.field_c[81]) {
          this.field_F = this.field_N;
        }
        if (param1 <= 68) {
          this.a(-21, -53);
        }
    }

    private final void a(boolean param0) {
        String var2 = this.h(121);
        if (!param0) {
          this.a(93, -60, 36, -119);
        }
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(88))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(int param0, int param1, lk param2, int param3) {
        int var6 = 0;
        ne var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 != 3) {
            this.field_L = -18;
          }
          super.a(param0, param1, param2, param3 + 0);
          this.e((byte) -120);
          if (this.field_x == 1) {
            if (this.field_v instanceof ne) {
              var7 = (ne) ((Object) this.field_v);
              var6 = var7.a(eg.field_b, param0, -10989, param1, (lk) (this), ij.field_e);
              if (-1 != var6) {
                if (this.field_G &&
                  this.field_L > var6 &&
                  this.field_F < var6) {
                  var6 = this.field_L;
                }
                this.field_N = var6;
              }
            }
            this.field_M = id.a(57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("hf.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 36) {
            stackIn_4_0 = ha.a(param0, param1 ^ -30737, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hf.JA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int m(int param0) {
        int var2;
        int var3;
        var3 = Main.field_T;
        if (this.field_N == 0) {
          return this.field_N;
        }
        for (var2 = this.field_N + param0; 0 < var2; var2--) {
          if (this.field_r.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final int j(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Main.field_T;
        if (param0 >= -96) {
          return -15;
        }
        var2 = this.field_r.length();
        if (var2 == this.field_N) {
          return this.field_N;
        }
        for (var3 = this.field_N + 1; var3 < var2; var3++) {
          if (this.field_r.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final String h(int param0) {
        int var2 = -69 / ((param0 - 13) / 38);
        int var3 = this.field_F >= this.field_N ? this.field_N : this.field_F;
        int var4 = this.field_F < this.field_N ? this.field_N : this.field_F;
        return this.field_r.substring(var3, var4);
    }

    final void a(int param0, int param1, int param2, int param3) {
        ne var8 = null;
        long var6 = 0L;
        if (null != this.field_v &&
          0 == param3) {
          this.field_v.a(param0, (lk) (this), 11447, param1, this.field_B);
          if (this.field_v instanceof ne) {
            var8 = (ne) ((Object) this.field_v);
            if (this.field_F != this.field_N) {
              var8.a((lk) (this), (byte) 67, param1, param0, this.field_N, this.field_F);
            }
            var6 = id.a(62);
            if ((-this.field_M + var6) % 1000L < 500L) {
              var8.a(param0, this.field_N, param1, (byte) 55, (lk) (this));
            }
          }
        }
        if (param2 != -1) {
          field_I = 9;
        }
    }

    private final void e(byte param0) {
        mj var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ne var9;
        var8 = Main.field_T;
        if (!this.field_J) {
          this.field_m = 0;
          this.field_l = 0;
          return;
        }
        if (!(this.field_v instanceof ne)) {
          return;
        }
        if (param0 > -74) {
          return;
        }
        var9 = (ne) ((Object) this.field_v);
        var3 = var9.a((byte) -96, (lk) (this));
        var4 = var3.b((byte) -5);
        var5 = var9.a((lk) (this), 0);
        var6 = var9.a(-1) >> 1;
        if (var5 - var6 > var4) {
          this.field_l = 0;
          this.field_m = 0;
        } else {
          var7 = this.field_l + var3.a(true, this.field_N);
          if (var7 > var5 - var6) {
            this.field_l = -var7 + (-var6 + var5) + this.field_l;
          } else {
            if (var7 < var6) {
              this.field_l = var6 - var7 + this.field_l;
            }
          }
          if (this.field_l <= 0) {
            if (-var5 + var6 > this.field_l) {
              this.field_l = var6 - var5;
            }
          } else {
            this.field_l = 0;
          }
        }
    }

    private final void i(int param0) {
        if (param0 != 17091) {
          return;
        }
        if (this.field_k instanceof pi) {
          ((pi) (this.field_k)).a(-1, this);
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -56) {
          this.field_O = 28L;
        }
        if (this.field_F != this.field_N) {
          var2 = this.field_F < this.field_N ? this.field_F : this.field_N;
          var3 = this.field_N > this.field_F ? this.field_N : this.field_F;
          this.field_F = var2;
          this.field_N = var2;
          this.field_r = this.field_r.substring(0, var2) + this.field_r.substring(var3, this.field_r.length());
          this.k(param0 ^ -120);
        }
    }

    private final void l(int param0) {
        if (param0 != 11514) {
          return;
        }
        this.a(true);
        this.f((byte) -56);
    }

    public static void o(int param0) {
        field_H = null;
        if (param0 != -31141) {
          CharSequence var2 = (CharSequence) null;
          hf.a((CharSequence) null, (byte) 102);
        }
    }

    static {
    }
}
