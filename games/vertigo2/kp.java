/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kp extends d {
    private int field_N;
    private int field_O;
    private boolean field_J;
    private boolean field_I;
    private int field_K;
    private long field_H;
    private int field_L;
    private long field_M;
    static int field_P;

    final void a(boolean param0, int param1, int param2, int param3) {
        qa var5;
        long var6;
        long var6Lifetime1;
        if (this.field_B == null) {
          if (!param0) {
            return;
          }
          this.field_K = -119;
          return;
        }
        if (0 != param1) {
          if (!param0) {
            return;
          }
          this.field_K = -119;
          return;
        }
        this.field_B.a(this.field_F, param2, true, (iq) (this), param3);
        if (!(this.field_B instanceof qa)) {
          if (!param0) {
            return;
          }
          this.field_K = -119;
          return;
        }
        var5 = (qa) ((Object) this.field_B);
        if (this.field_K == this.field_L) {
          var6 = gk.a(126);
          if (500L > (var6 - this.field_M) % 1000L) {
            var5.a(-94, this.field_K, param2, (iq) (this), param3);
          }
          if (!param0) {
            return;
          }
          this.field_K = -119;
          return;
        }
        var5.a((iq) (this), this.field_K, param0, this.field_L, param3, param2);
        var6Lifetime1 = gk.a(126);
        if (500L > (var6Lifetime1 - this.field_M) % 1000L) {
          var5.a(-94, this.field_K, param2, (iq) (this), param3);
        }
        if (!param0) {
          return;
        }
        this.field_K = -119;
        return;
    }

    private final String h(int param0) {
        String discarded$0 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 == 0) {
          if (this.field_L >= this.field_K) {
            stackIn_4_0 = this.field_K;
          } else {
            stackIn_4_0 = this.field_L;
          }
          var2 = stackIn_4_0;
          if (this.field_K <= this.field_L) {
            stackIn_7_0 = this.field_L;
          } else {
            stackIn_7_0 = this.field_K;
          }
          var3 = stackIn_7_0;
          return this.field_w.substring(var2, var3);
        }
        discarded$0 = this.h(36);
        if (this.field_L >= this.field_K) {
          stackIn_11_0 = this.field_K;
        } else {
          stackIn_11_0 = this.field_L;
        }
        var2Lifetime1 = stackIn_11_0;
        if (this.field_K <= this.field_L) {
          stackIn_14_0 = this.field_L;
        } else {
          stackIn_14_0 = this.field_K;
        }
        var3Lifetime1 = stackIn_14_0;
        return this.field_w.substring(var2Lifetime1, var3Lifetime1);
    }

    private final int k(int param0) {
        String discarded$2 = null;
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var3Lifetime1;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -27539) {
          var2 = this.field_w.length();
          if (var2 == this.field_K) {
            return this.field_K;
          }
          for (var3 = 1 + this.field_K; var2 > var3; var3++) {
            if (this.field_w.charAt(var3 - 1) == 32) {
              return var3;
            }
          }
          return var3;
        }
        discarded$2 = this.h(-55);
        var2Lifetime1 = this.field_w.length();
        if (var2Lifetime1 == this.field_K) {
          return this.field_K;
        }
        for (var3Lifetime1 = 1 + this.field_K; var2Lifetime1 > var3Lifetime1; var3Lifetime1++) {
          if (this.field_w.charAt(var3Lifetime1 - 1) == 32) {
            return var3Lifetime1;
          }
        }
        return var3Lifetime1;
    }

    private final void b(boolean param0) {
        ro var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        qa var9;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (!this.field_J) {
          this.field_u = 0;
          this.field_y = 0;
          return;
        }
        if (!param0) {
          return;
        }
        if (!(this.field_B instanceof qa)) {
          return;
        }
        var9 = (qa) ((Object) this.field_B);
        var3 = var9.b((iq) (this), 64);
        var4 = var3.a(8783);
        var5 = var9.a(-1, (iq) (this));
        var6 = var9.a((byte) -91) >> 1;
        if (var4 < var5 - var6) {
          this.field_y = 0;
          this.field_u = 0;
          return;
        }
        var7 = this.field_u + var3.b(this.field_K, 118);
        if (var7 > -var6 + var5) {
          this.field_u = this.field_u + (var5 - var6) - var7;
        } else {
          if (var7 < var6) {
            this.field_u = var6 - (var7 - this.field_u);
          }
        }
        if (this.field_u > 0) {
          this.field_u = 0;
          return;
        }
        if (this.field_u >= -var5 + var6) {
          return;
        }
        this.field_u = var6 - var5;
        return;
    }

    private final void m(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_K != this.field_L) {
          var2 = this.field_K <= this.field_L ? this.field_K : this.field_L;
          var3 = this.field_L < this.field_K ? this.field_K : this.field_L;
          this.field_L = var2;
          this.field_K = var2;
          this.field_w = this.field_w.substring(0, var2) + this.field_w.substring(var3, this.field_w.length());
          this.h((byte) 34);
        }
        var2Lifetime1 = 55 / ((-22 - param0) / 32);
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if (-1 != this.field_N) {
          var3_int = this.field_N - this.field_w.length();
          if (var3_int >= 0) {
            return;
          }
          param0 = param0.substring(0, var3_int);
        }
        if (this.field_K != this.field_w.length()) {
          this.field_w = this.field_w.substring(0, this.field_K) + param0 + this.field_w.substring(this.field_K, this.field_w.length());
        } else {
          this.field_w = this.field_w + param0;
        }
        if (param1 <= 80) {
          return;
        }
        try {
          this.field_K = this.field_K + param0.length();
          this.field_L = this.field_K;
          this.h((byte) 32);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "kp.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        this.field_L = 0;
        this.field_w = "";
        this.field_K = param0;
        this.h((byte) 103);
    }

    void h(byte param0) {
        if (this.field_v instanceof ih) {
          ((ih) (this.field_v)).a(-122, this);
        }
        if (param0 >= 16) {
          return;
        }
        this.g((byte) -96);
    }

    private final void a(int param0, byte param1) {
        this.field_K = param0;
        if (param1 >= -84) {
          this.a(true, -70, -56, -82);
          if (!cr.field_eb[81]) {
            this.field_L = this.field_K;
            return;
          }
          return;
        }
        if (cr.field_eb[81]) {
          return;
        }
        this.field_L = this.field_K;
    }

    private final void e(byte param0) {
        this.f((byte) -127);
        this.m(55);
        if (param0 <= 0) {
          this.field_N = -70;
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            param0 = "";
          }
          this.field_w = param0;
          if (param1 >= -71) {
            var5 = (String) null;
            this.a((String) null, -67, false);
          }
          var4_int = param0.length();
          if (-1 != this.field_N &&
            var4_int > this.field_N) {
            this.field_w = this.field_w.substring(0, this.field_N);
          }
          dupTemp$1 = this.field_w.length();
          this.field_L = dupTemp$1;
          this.field_K = dupTemp$1;
          if (param2) {
            return;
          }
          this.h((byte) 29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("kp.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int stackIn_7_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (param5 > -107) {
            this.field_O = 102;
          }
          if (super.a(param0, param1, param2, param3, param4, (byte) -111, param6) &&
            this.field_B instanceof qa) {
            var8_int = ((qa) ((Object) this.field_B)).a(ed.field_n, param2, 101, param1, (iq) (this), gb.field_d);
            if (var8_int == -1) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = var8_int;
            }
            this.a(stackIn_7_1, (byte) -126);
            var8_long = gk.a(44);
            stackIn_10_1 = !(-this.field_H + var8_long >= 250L);
            this.field_I = stackIn_10_1;
            if (this.field_I) {
              this.field_L = this.l(44);
              this.field_K = this.k(-27539);
              if (this.field_K > 0 &&
                32 == this.field_w.charAt(-1 + this.field_K)) {
                this.field_K = this.field_K - 1;
              }
              this.field_O = this.field_K;
            }
            this.field_H = var8_long;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("kp.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, iq param3) {
        qa var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a((byte) 31, param1, param2, param3);
          if (param0 < 6) {
            return;
          }
          this.b(true);
          if (this.field_A != 1) {
            return;
          }
          if (this.field_B instanceof qa) {
            var5 = (qa) ((Object) this.field_B);
            var6 = var5.a(ed.field_n, param2, 106, param1, (iq) (this), gb.field_d);
            if (var6 != -1) {
              if (this.field_I &&
                this.field_O > var6 &&
                var6 > this.field_L) {
                var6 = this.field_O;
              }
              this.field_K = var6;
            }
          }
          this.field_M = gk.a(57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_17_0 = var5_ref;
          stackIn_17_1 = new StringBuilder().append("kp.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        int dupTemp$0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_70_1 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 13) {
            this.field_O = -111;
          }
          this.field_M = gk.a(77);
          if (param0 == 60) {
            return false;
          }
          if (param0 == 62) {
            return false;
          }
          if (param0 >= 32 &&
            param0 <= 126) {
            if (this.field_K != this.field_L) {
              this.m(-126);
            }
            if (this.field_N == -1 ||
              !(this.field_w.length() >= this.field_N)) {
              if (this.field_K < this.field_w.length()) {
                this.field_w = this.field_w.substring(0, this.field_K) + param0 + this.field_w.substring(this.field_K, this.field_w.length());
                this.field_K = this.field_K + 1;
                this.field_L = this.field_K;
              } else {
                this.field_w = this.field_w + param0;
                dupTemp$0 = this.field_w.length();
                this.field_K = dupTemp$0;
                this.field_L = dupTemp$0;
              }
              this.h((byte) 26);
            }
            return true;
          }
          if (param2 != 85) {
            if (param2 != 101) {
              if (param2 == 13) {
                this.j(0);
                return true;
              }
              if (param2 != 96) {
                if (param2 == 97) {
                  if (this.field_K < this.field_w.length()) {
                    if (!cr.field_eb[82]) {
                      stackIn_70_1 = this.field_K + 1;
                    } else {
                      stackIn_70_1 = this.k(-27539);
                    }
                    this.a(stackIn_70_1, (byte) -117);
                    return true;
                  }
                } else {
                  if (param2 == 102) {
                    this.a(0, (byte) -127);
                    return true;
                  }
                  if (param2 == 103) {
                    this.a(this.field_w.length(), (byte) -116);
                    return true;
                  }
                  if (param2 == 84) {
                    this.g((byte) 100);
                    return true;
                  }
                  if (cr.field_eb[82] &&
                    param2 == 65) {
                    this.e((byte) 35);
                    return true;
                  }
                  if (cr.field_eb[82] &&
                    param2 == 66) {
                    this.f((byte) -127);
                    return true;
                  }
                  if (cr.field_eb[82] &&
                    param2 == 67) {
                    this.i((byte) -35);
                    return true;
                  }
                }
              } else {
                if (this.field_K > 0) {
                  if (!cr.field_eb[82]) {
                    stackIn_41_1 = -1 + this.field_K;
                  } else {
                    stackIn_41_1 = this.l(-128);
                  }
                  this.a(stackIn_41_1, (byte) -116);
                  return true;
                }
              }
            } else {
              if (this.field_K != this.field_L) {
                this.m(-95);
                return true;
              }
              if (this.field_K < this.field_w.length()) {
                this.field_L = 1 + this.field_K;
                this.m(48);
                return true;
              }
            }
          } else {
            if (this.field_L != this.field_K) {
              this.m(111);
              return true;
            }
            if (this.field_K > 0) {
              this.field_L = this.field_K - 1;
              this.m(-69);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_78_0 = var5;
          stackIn_78_1 = new StringBuilder().append("kp.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    private final int l(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (this.field_K == 0) {
          return this.field_K;
        }
        var2 = 22 % ((-64 - param0) / 62);
        for (var3 = this.field_K - 1; 0 < var3; var3--) {
          if (this.field_w.charAt(-1 + var3) == 32) {
            return var3;
          }
        }
        return var3;
    }

    kp(String param0, uf param1, int param2) {
        super(param0, param1);
        this.field_O = -1;
        this.field_H = 0L;
        this.field_I = false;
        try {
          this.field_B = eb.field_c.field_c;
          this.field_N = param2;
          this.a(param0, -103, true);
          this.field_J = true;
          this.field_M = gk.a(117);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "kp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void i(int param0) {
        if (pm.field_a) {
          bi.d(bi.field_d, bi.field_f, -bi.field_d + bi.field_i, bi.field_c - bi.field_f);
          ql.field_L.b(false, param0 ^ 0);
          if (param0 != 0) {
            kp.i(-128);
            return;
          }
          return;
        }
        if (param0 == 0) {
          return;
        }
        kp.i(-128);
    }

    private final void i(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            if (param0 != -35) {
              this.field_H = -44L;
            }
            this.m(-59);
            this.a(var2, (byte) 100);
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

    private final void g(byte param0) {
        if (this.field_v instanceof ih) {
          ((ih) (this.field_v)).a((byte) 58, this);
        }
        if (param0 == 100) {
          return;
        }
        this.e((byte) -20);
    }

    private final void f(byte param0) {
        try {
          String var2 = this.h(0);
          if (param0 == -127) {
            if (!(0 >= var2.length())) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(0))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
          this.f((byte) 37);
          if (!(0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(0))), (java.awt.datatransfer.ClipboardOwner) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
