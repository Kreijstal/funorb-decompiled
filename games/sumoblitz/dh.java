/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends wp {
    private long field_L;
    private int field_I;
    static float[] field_N;
    private boolean field_G;
    private int field_E;
    private long field_J;
    private int field_F;
    static float[] field_M;
    private int field_K;
    private boolean field_O;
    static int[] field_H;

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_7_1 = 0;
        int stackIn_8_2 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (param1 >= -42) {
            this.field_G = true;
          }
          if (!super.a(param0, -128, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_w instanceof de)) {
            return false;
          }
          var8_int = ((de) ((Object) this.field_w)).a(param4, (pk) (this), ko.field_p, pi.field_e, -4059, param6);
          stackIn_7_1 = 124;
          if (-1 != var8_int) {
            stackIn_8_2 = var8_int;
          } else {
            stackIn_8_2 = 0;
          }
          this.a(stackIn_7_1, stackIn_8_2);
          var8_long = wq.a(-17);
          stackIn_11_1 = !(250L <= var8_long - this.field_L);
          this.field_G = stackIn_11_1;
          if (this.field_G) {
            this.field_E = this.g(14236);
            this.field_F = this.d(true);
            if (this.field_F > 0 &&
              this.field_m.charAt(this.field_F - 1) == 32) {
              this.field_F = this.field_F - 1;
            }
            this.field_K = this.field_F;
          }
          this.field_L = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("dh.R(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        if (param0 < 84) {
          this.field_I = 55;
        }
        this.field_F = param1;
        if (!hw.field_b[81]) {
          this.field_E = this.field_F;
        }
    }

    final static int b(int param0, int param1, boolean param2) {
        if (param2) {
          field_N = (float[]) null;
        }
        int var3 = param0 >>> 31;
        return (var3 + param0) / param1 - var3;
    }

    public static void j(int param0) {
        field_H = null;
        field_M = null;
        field_N = null;
        if (param0 != 82) {
          field_N = (float[]) null;
        }
    }

    private final String k(int param0) {
        if (param0 > -99) {
          this.field_G = true;
        }
        int var2 = this.field_E < this.field_F ? this.field_E : this.field_F;
        int var3 = this.field_F > this.field_E ? this.field_F : this.field_E;
        return this.field_m.substring(var2, var3);
    }

    private final void h(int param0) {
        try {
          String var2 = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.h((byte) -80);
            this.a(true, var2);
          } catch (Exception exception) {
          }
          if (param0 != -1) {
            this.field_O = true;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param0) {
            this.field_L = -107L;
          }
          if (this.field_I != -1) {
            var3_int = this.field_I - this.field_m.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_F == this.field_m.length()) {
            this.field_m = this.field_m + param1;
          } else {
            this.field_m = this.field_m.substring(0, this.field_F) + param1 + this.field_m.substring(this.field_F, this.field_m.length());
          }
          this.field_F = this.field_F + param1.length();
          this.field_E = this.field_F;
          this.g((byte) 88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("dh.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final int g(int param0) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_F == 0) {
          return this.field_F;
        }
        if (param0 != 14236) {
          return 31;
        }
        for (var2 = -1 + this.field_F; var2 > 0; var2--) {
          if (this.field_m.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    dh(String param0, qm param1, int param2) {
        super(param0, param1);
        this.field_L = 0L;
        this.field_G = false;
        this.field_K = -1;
        try {
          this.field_I = param2;
          this.field_w = ks.field_x.field_j;
          this.a(true, param0, (byte) 118);
          this.field_O = true;
          this.field_J = wq.a(-9);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, String param1, byte param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          this.field_m = param1;
          var4_int = param1.length();
          if (this.field_I != -1 &&
            var4_int > this.field_I) {
            this.field_m = this.field_m.substring(0, this.field_I);
          }
          dupTemp$1 = this.field_m.length();
          this.field_E = dupTemp$1;
          this.field_F = dupTemp$1;
          if (!param0) {
            this.g((byte) 103);
          }
          if (param2 < 3) {
            field_N = (float[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("dh.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_56_1 = 0;
        int stackIn_57_2 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_J = wq.a(-6);
          if (param1 == 60) {
            return false;
          }
          if (62 == param1) {
            return false;
          }
          if (param2 <= 9) {
            return false;
          }
          if (32 <= param1 &&
            126 >= param1) {
            if (this.field_F != this.field_E) {
              this.h((byte) -71);
            }
            if (-1 == this.field_I ||
              !(this.field_m.length() >= this.field_I)) {
              if (this.field_F >= this.field_m.length()) {
                this.field_m = this.field_m + param1;
                dupTemp$0 = this.field_m.length();
                this.field_F = dupTemp$0;
                this.field_E = dupTemp$0;
              } else {
                this.field_m = this.field_m.substring(0, this.field_F) + param1 + this.field_m.substring(this.field_F, this.field_m.length());
                this.field_F = this.field_F + 1;
                this.field_E = this.field_F;
              }
              this.g((byte) 124);
            }
            return true;
          }
          if (param3 == 85) {
            if (this.field_F != this.field_E) {
              this.h((byte) 122);
              return true;
            }
            if (0 < this.field_F) {
              this.field_E = -1 + this.field_F;
              this.h((byte) 127);
              return true;
            }
          } else {
            if (101 != param3) {
              if (param3 == 13) {
                this.i(-1);
                return true;
              }
              if (96 == param3) {
                if (this.field_F > 0) {
                  stackIn_56_1 = 127;
                  if (hw.field_b[82]) {
                    stackIn_57_2 = this.g(14236);
                  } else {
                    stackIn_57_2 = -1 + this.field_F;
                  }
                  this.a(stackIn_56_1, stackIn_57_2);
                  return true;
                }
              } else {
                if (param3 != 97) {
                  if (param3 == 102) {
                    this.a(93, 0);
                    return true;
                  }
                  if (param3 == 103) {
                    this.a(121, this.field_m.length());
                    return true;
                  }
                  if (param3 == 84) {
                    this.e((byte) -106);
                    return true;
                  }
                  if (hw.field_b[82] &&
                    param3 == 65) {
                    this.f(96);
                    return true;
                  }
                  if (hw.field_b[82] &&
                    param3 == 66) {
                    this.e(false);
                    return true;
                  }
                  if (hw.field_b[82] &&
                    param3 == 67) {
                    this.h(-1);
                    return true;
                  }
                } else {
                  if (this.field_F < this.field_m.length()) {
                    stackIn_26_1 = 111;
                    if (!hw.field_b[82]) {
                      stackIn_27_2 = this.field_F + 1;
                    } else {
                      stackIn_27_2 = this.d(true);
                    }
                    this.a(stackIn_26_1, stackIn_27_2);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_F != this.field_E) {
                this.h((byte) 123);
                return true;
              }
              if (this.field_F < this.field_m.length()) {
                this.field_E = this.field_F + 1;
                this.h((byte) -69);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_82_0 = var5;
          stackIn_82_1 = new StringBuilder().append("dh.KA(");
          if (param0 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void h(byte param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_F != this.field_E) {
          var2 = this.field_E >= this.field_F ? this.field_F : this.field_E;
          var3 = this.field_E < this.field_F ? this.field_F : this.field_E;
          this.field_F = var2;
          this.field_E = var2;
          this.field_m = this.field_m.substring(0, var2) + this.field_m.substring(var3, this.field_m.length());
          this.g((byte) 81);
        }
        var2Lifetime1 = -67 / ((85 - param0) / 37);
    }

    private final void e(byte param0) {
        if (this.field_o instanceof pw) {
          ((pw) (this.field_o)).a(this, -66);
        }
        if (param0 != -106) {
          this.g((byte) -55);
        }
    }

    private final void f(int param0) {
        if (param0 != 96) {
          return;
        }
        this.e(false);
        this.h((byte) 123);
    }

    private final void f(byte param0) {
        ag var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        de var9;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (!this.field_O) {
          this.field_s = 0;
          this.field_n = 0;
          return;
        }
        if (!(this.field_w instanceof de)) {
          return;
        }
        var9 = (de) ((Object) this.field_w);
        var3 = var9.b(-3, (pk) (this));
        var4 = var3.a((byte) -15);
        if (param0 != -44) {
          field_H = (int[]) null;
        }
        var5 = var9.a(param0 ^ -120, (pk) (this));
        var6 = var9.a(14763) >> 1;
        if (-var6 + var5 > var4) {
          this.field_n = 0;
          this.field_s = 0;
          return;
        }
        var7 = this.field_s + var3.a((byte) 113, this.field_F);
        if (-var6 + var5 >= var7) {
          if (var6 > var7) {
            this.field_s = -var7 + var6 + this.field_s;
          }
        } else {
          this.field_s = -var7 - (-var5 + (var6 - this.field_s));
        }
        if (this.field_s <= 0) {
          if (var6 - var5 > this.field_s) {
            this.field_s = -var5 + var6;
          }
        } else {
          this.field_s = 0;
        }
        return;
    }

    final void i(int param0) {
        this.field_F = 0;
        this.field_E = 0;
        this.field_m = "";
        this.g((byte) 104);
        if (param0 != -1) {
          this.field_O = true;
        }
    }

    private final void e(boolean param0) {
        String var2 = this.k(-115);
        if (!(var2.length() <= 0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(-116))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0) {
          this.f((byte) -38);
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        de var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, 62, param2, param3);
          var5_int = 109 % ((-25 - param1) / 45);
          this.f((byte) -44);
          if (this.field_l == 1) {
            if (this.field_w instanceof de) {
              var6 = (de) ((Object) this.field_w);
              var7 = var6.a(param0, (pk) (this), ko.field_p, pi.field_e, -4059, param3);
              if (var7 != -1) {
                if (this.field_G &&
                  this.field_K > var7 &&
                  this.field_E < var7) {
                  var7 = this.field_K;
                }
                this.field_F = var7;
              }
            }
            this.field_J = wq.a(-93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("dh.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        de var8 = null;
        long var6 = 0L;
        int discarded$0 = 0;
        if (null != this.field_w &&
          param3 == 0) {
          this.field_w.a((pk) (this), param1, 5592405, this.field_x, param0);
          if (this.field_w instanceof de) {
            var8 = (de) ((Object) this.field_w);
            if (this.field_F != this.field_E) {
              var8.a(param0, this.field_E, 0, this.field_F, (pk) (this), param1);
            }
            var6 = wq.a(-6);
            if (500L > (-this.field_J + var6) % 1000L) {
              var8.a(1, param0, param1, this.field_F, (pk) (this));
            }
          }
        }
        if (param2 >= -35) {
          discarded$0 = this.d(false);
        }
    }

    private final int d(boolean param0) {
        int var2;
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (!param0) {
          this.f((byte) -32);
        }
        var2 = this.field_m.length();
        if (this.field_F == var2) {
          return this.field_F;
        }
        for (var3 = this.field_F + 1; var2 > var3; var3++) {
          if (32 != this.field_m.charAt(var3 - 1)) {
            continue;
          }
          break;
        }
        return var3;
    }

    void g(byte param0) {
        if (this.field_o instanceof pw) {
          ((pw) (this.field_o)).a(this, (byte) -128);
        }
        if (param0 <= 78) {
          dh.j(5);
        }
    }

    static {
        int var2 = 0;
        field_N = new float[16384];
        field_M = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
          field_N[var2] = (float)Math.sin(var0 * (double)var2);
          field_M[var2] = (float)Math.cos((double)var2 * var0);
        }
        field_H = new int[2];
    }
}
