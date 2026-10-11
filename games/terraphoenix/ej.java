/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ej extends eb {
    private long field_P;
    private int field_L;
    static int field_V;
    static String field_R;
    static String field_N;
    private boolean field_W;
    private long field_Q;
    private int field_T;
    private boolean field_O;
    private int field_K;
    private int field_U;
    static jh field_M;
    static int field_S;

    private final void a(byte param0, int param1) {
        if (param0 == 19) {
          this.field_K = param1;
          if (!bh.field_e[81]) {
            this.field_T = this.field_K;
          }
          return;
        }
        this.field_Q = -34L;
        this.field_K = param1;
        if (!bh.field_e[81]) {
          this.field_T = this.field_K;
        }
    }

    private final void g(int param0) {
        if (param0 == -18369) {
          this.h(-1);
          this.i((byte) 71);
          return;
        }
        field_M = (jh) null;
        this.h(-1);
        this.i((byte) 71);
    }

    public static void m(int param0) {
        field_R = null;
        field_N = null;
        if (param0 != 14653) {
          ej.f((byte) 110);
          field_M = null;
          return;
        }
        field_M = null;
    }

    final static String f(byte param0) {
        if (param0 != -30) {
          ej.g((byte) -11);
          return fg.field_e;
        }
        return fg.field_e;
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -3) {
            return;
          }
          if (this.field_U != -1) {
            var3_int = this.field_U - this.field_o.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_K != this.field_o.length()) {
            this.field_o = this.field_o.substring(0, this.field_K) + param0 + this.field_o.substring(this.field_K, this.field_o.length());
          } else {
            this.field_o = this.field_o + param0;
          }
          this.field_K = this.field_K + param0.length();
          this.field_T = this.field_K;
          this.i(124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ej.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    void i(int param0) {
        if (this.field_r instanceof pa) {
          ((pa) (this.field_r)).a(this, (byte) 83);
        }
        if (param0 >= 121) {
          return;
        }
        ej.f((byte) 77);
    }

    private final void n(int param0) {
        if (param0 > -69) {
          field_M = (jh) null;
          if (this.field_r instanceof pa) {
            ((pa) (this.field_r)).a(this, false);
            return;
          }
          return;
        }
        if (!(this.field_r instanceof pa)) {
          return;
        }
        ((pa) (this.field_r)).a(this, false);
    }

    final static void a(int param0, int param1, dh param2, int param3, int param4) {
        java.awt.Canvas var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          param2.i(12, param1 + 25544);
          param2.h(-1564407352, 17);
          param2.h(-1564407352, param0);
          param2.h(param1 ^ 1564382701, param4);
          if (param1 != -25563) {
            var6 = (java.awt.Canvas) null;
            ej.a(-21, (java.awt.Canvas) null);
            param2.i(param3, 24);
          } else {
            param2.i(param3, 24);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ej.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void j(byte param0) {
        ld var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        w var10;
        int var7Lifetime1;
        var8 = Terraphoenix.field_V;
        if (!this.field_W) {
          this.field_v = 0;
          this.field_y = 0;
          return;
        }
        if (!(this.field_l instanceof w)) {
          return;
        }
        var10 = (w) ((Object) this.field_l);
        var3 = var10.a((gl) (this), -19302);
        var4 = var3.b(0);
        var5 = var10.a(28889, (gl) (this));
        var6 = var10.a(8233) >> 1;
        if (var5 - var6 > var4) {
          this.field_y = 0;
          this.field_v = 0;
          return;
        }
        if (param0 > 81) {
          var7 = this.field_y + var3.a(this.field_K, 0);
          if (var5 - var6 < var7) {
            this.field_y = this.field_y - (var7 + (-var5 + var6));
          } else {
            if (var7 < var6) {
              this.field_y = var6 - (var7 - this.field_y);
            }
          }
          if (this.field_y > 0) {
            this.field_y = 0;
            return;
          }
          if (this.field_y >= -var5 + var6) {
            return;
          }
          this.field_y = var6 - var5;
          return;
        }
        var9 = (String) null;
        this.a(false, (byte) -128, (String) null);
        var7Lifetime1 = this.field_y + var3.a(this.field_K, 0);
        if (var5 - var6 < var7Lifetime1) {
          this.field_y = this.field_y - (var7Lifetime1 + (-var5 + var6));
        } else {
          if (var7Lifetime1 < var6) {
            this.field_y = var6 - (var7Lifetime1 - this.field_y);
          }
        }
        if (this.field_y > 0) {
          this.field_y = 0;
          return;
        }
        if (this.field_y >= -var5 + var6) {
          return;
        }
        this.field_y = var6 - var5;
        return;
    }

    private final void i(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -110 % ((param0 + 9) / 63);
        if (this.field_T != this.field_K) {
          var3 = this.field_T >= this.field_K ? this.field_K : this.field_T;
          var4 = this.field_K > this.field_T ? this.field_K : this.field_T;
          this.field_K = var3;
          this.field_T = var3;
          this.field_o = this.field_o.substring(0, var3) + this.field_o.substring(var4, this.field_o.length());
          this.i(126);
        }
    }

    private final String j(int param0) {
        int var3 = 0;
        int var2 = this.field_T < this.field_K ? this.field_T : this.field_K;
        int var3Lifetime1;
        if (param0 == -18031) {
          var3 = this.field_T < this.field_K ? this.field_K : this.field_T;
          return this.field_o.substring(var2, var3);
        }
        dh var4 = (dh) null;
        ej.a(-116, -28, (dh) null, 31, 71);
        var3Lifetime1 = this.field_T < this.field_K ? this.field_K : this.field_T;
        return this.field_o.substring(var2, var3Lifetime1);
    }

    private final int o(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Terraphoenix.field_V;
        var2 = this.field_o.length();
        if (var2 == this.field_K) {
          return this.field_K;
        }
        for (var3 = this.field_K + param0; var2 > var3; var3++) {
          if (this.field_o.charAt(var3 - 1) == 32) {
            return var3;
          }
        }
        return var3;
    }

    final void a(boolean param0, byte param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_o = param2;
          var4_int = param2.length();
          if (-1 != this.field_U &&
            this.field_U < var4_int) {
            this.field_o = this.field_o.substring(0, this.field_U);
          }
          if (param1 >= -117) {
            field_S = -91;
          }
          dupTemp$1 = this.field_o.length();
          this.field_T = dupTemp$1;
          this.field_K = dupTemp$1;
          if (param0) {
            return;
          }
          this.i(122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ej.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void h(int param0) {
        String var2 = this.j(-18031);
        if (!(~var2.length() >= param0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j(-18031))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(gl param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        w var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 25) {
            ej.m(-23);
          }
          super.a(param0, param1, param2, 86);
          this.j((byte) 105);
          if (this.field_j != 1) {
            return;
          }
          if (this.field_l instanceof w) {
            var7 = (w) ((Object) this.field_l);
            var6 = var7.a(ef.field_j, -3477, jb.field_b, (gl) (this), param1, param2);
            if (var6 != -1) {
              if (this.field_O &&
                var6 < this.field_L &&
                this.field_T < var6) {
                var6 = this.field_L;
              }
              this.field_K = var6;
            }
          }
          this.field_P = ll.a(1000);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ej.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6;
        w var8;
        if (this.field_l == null) {
          if (param1 < -106) {
            return;
          }
          this.field_T = -91;
          return;
        }
        if (param2 != 0) {
          if (param1 < -106) {
            return;
          }
          this.field_T = -91;
          return;
        }
        this.field_l.a(param3, (gl) (this), param0, -24381, this.field_A);
        if (!(this.field_l instanceof w)) {
          if (param1 < -106) {
            return;
          }
          this.field_T = -91;
          return;
        }
        var8 = (w) ((Object) this.field_l);
        if (this.field_K != this.field_T) {
          var8.b(0, param3, param0, (gl) (this), this.field_K, this.field_T);
        }
        var6 = ll.a(1000);
        if ((var6 - this.field_P) % 1000L < 500L) {
          var8.a(this.field_K, param3, (gl) (this), param0, -32135);
        }
        if (param1 < -106) {
          return;
        }
        this.field_T = -91;
        return;
    }

    private final void h(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          int var3 = 0;
          try {
            var3 = -54 % ((0 - param0) / 62);
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.i((byte) -91);
            this.a(var2, (byte) -3);
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

    ej(String param0, sc param1, int param2) {
        super(param0, param1);
        this.field_L = -1;
        this.field_O = false;
        this.field_Q = 0L;
        try {
          this.field_l = vc.field_c.field_i;
          this.field_U = param2;
          this.a(true, (byte) -120, param0);
          this.field_W = true;
          this.field_P = ll.a(1000);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        this.field_o = "";
        this.field_K = 0;
        this.field_T = 0;
        if (param0 == -1) {
          this.i(122);
          return;
        }
        gl var3 = (gl) null;
        this.a(false, 4, -51, -52, -78, (gl) null, 121);
        this.i(122);
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
          if (param0 != -12966) {
            ej.g((byte) -119);
          }
          if (11 == q.field_Jb) {
            ta.a(54);
          }
          pg.a(ed.field_d, da.field_f, ad.field_e, 101);
          ia.a(0, param1, 0, (byte) 116);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ej.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a(param0, param1, param2, param3, param4, param5, param6) &&
            this.field_l instanceof w) {
            var8_int = ((w) ((Object) this.field_l)).a(ef.field_j, -3477, jb.field_b, (gl) (this), param2, param3);
            stackIn_5_1 = 19;
            if (var8_int != -1) {
              stackIn_6_2 = var8_int;
            } else {
              stackIn_6_2 = 0;
            }
            this.a((byte) stackIn_5_1, stackIn_6_2);
            var8_long = ll.a(1000);
            stackIn_9_1 = !(250L <= -this.field_Q + var8_long);
            this.field_O = stackIn_9_1;
            if (this.field_O) {
              this.field_T = this.l(-1);
              this.field_K = this.o(1);
              if (this.field_K > 0 &&
                32 == this.field_o.charAt(this.field_K - 1)) {
                this.field_K = this.field_K - 1;
              }
              this.field_L = this.field_K;
            }
            this.field_Q = var8_long;
            return true;
          }
          if (!param0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_25_0 = var8;
          stackIn_25_1 = new StringBuilder().append("ej.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(')').toString());
        }
    }

    private final int l(int param0) {
        int var2;
        int var3;
        var3 = Terraphoenix.field_V;
        if (~this.field_K == param0) {
          return this.field_K;
        }
        for (var2 = this.field_K - 1; 0 < var2; var2--) {
          if (this.field_o.charAt(var2 - 1) == 32) {
            return var2;
          }
        }
        return var2;
    }

    final static String g(byte param0) {
        if (kj.field_f == null) {
          return "";
        }
        int var1 = -71 / ((67 - param0) / 55);
        return kj.field_f;
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_66_1 = 0;
        int stackIn_67_2 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_P = ll.a(1000);
          if (60 == param0) {
            return false;
          }
          if (param0 == 62) {
            return false;
          }
          if (param2 != 30) {
            this.h(121);
          }
          if (param0 >= 32 &&
            param0 <= 126) {
            if (this.field_T != this.field_K) {
              this.i((byte) 62);
            }
            if (this.field_U == -1 ||
              !(this.field_o.length() >= this.field_U)) {
              if (this.field_K < this.field_o.length()) {
                this.field_o = this.field_o.substring(0, this.field_K) + param0 + this.field_o.substring(this.field_K, this.field_o.length());
                this.field_K = this.field_K + 1;
                this.field_T = this.field_K;
              } else {
                this.field_o = this.field_o + param0;
                dupTemp$0 = this.field_o.length();
                this.field_K = dupTemp$0;
                this.field_T = dupTemp$0;
              }
              this.i(127);
            }
            return true;
          }
          if (param3 == 85) {
            if (this.field_K != this.field_T) {
              this.i((byte) -82);
              return true;
            }
            if (this.field_K > 0) {
              this.field_T = this.field_K - 1;
              this.i((byte) 72);
              return true;
            }
          } else {
            if (param3 != 101) {
              if (param3 == 13) {
                this.k(-1);
                return true;
              }
              if (param3 != 96) {
                if (param3 == 97) {
                  if (this.field_K < this.field_o.length()) {
                    stackIn_66_1 = 19;
                    if (bh.field_e[82]) {
                      stackIn_67_2 = this.o(1);
                    } else {
                      stackIn_67_2 = 1 + this.field_K;
                    }
                    this.a((byte) stackIn_66_1, stackIn_67_2);
                    return true;
                  }
                } else {
                  if (param3 == 102) {
                    this.a((byte) 19, 0);
                    return true;
                  }
                  if (param3 == 103) {
                    this.a((byte) 19, this.field_o.length());
                    return true;
                  }
                  if (param3 == 84) {
                    this.n(-79);
                    return true;
                  }
                  if (bh.field_e[82] &&
                    param3 == 65) {
                    this.g(param2 ^ -18399);
                    return true;
                  }
                  if (bh.field_e[82] &&
                    param3 == 66) {
                    this.h(param2 - 31);
                    return true;
                  }
                  if (bh.field_e[82] &&
                    67 == param3) {
                    this.h((byte) -85);
                    return true;
                  }
                }
              } else {
                if (this.field_K > 0) {
                  stackIn_37_1 = 19;
                  if (!bh.field_e[82]) {
                    stackIn_38_2 = -1 + this.field_K;
                  } else {
                    stackIn_38_2 = this.l(-1);
                  }
                  this.a((byte) stackIn_37_1, stackIn_38_2);
                  return true;
                }
              }
            } else {
              if (this.field_T != this.field_K) {
                this.i((byte) -102);
                return true;
              }
              if (this.field_K < this.field_o.length()) {
                this.field_T = this.field_K + 1;
                this.i((byte) -102);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("ej.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_V = 162;
        field_R = "Waiting for levels";
        field_N = "Confirm Password: ";
    }
}
