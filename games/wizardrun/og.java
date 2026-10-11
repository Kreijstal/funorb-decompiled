/*
 * Decompiled by CFR-JS 0.4.0.
 */
class og extends pl {
    private boolean field_F;
    private int field_L;
    private int field_H;
    private boolean field_Q;
    private long field_I;
    static qj field_N;
    static String field_P;
    static qj field_S;
    static String[] field_R;
    static int field_O;
    private int field_M;
    static String field_G;
    private int field_J;
    private long field_K;

    final void a(int param0, int param1, int param2, int param3) {
        qe var8 = null;
        long var6 = 0L;
        if (null != this.field_w &&
          param2 == 0) {
          this.field_w.a(param0, param3, (ub) (this), true, this.field_B);
          if (this.field_w instanceof qe) {
            var8 = (qe) ((Object) this.field_w);
            if (this.field_J != this.field_L) {
              var8.a(this.field_L, true, this.field_J, param3, param0, (ub) (this));
            }
            var6 = d.a((byte) 54);
            if ((-this.field_I + var6) % 1000L < 500L) {
              var8.a(param3, param0, (ub) (this), 0, this.field_L);
            }
          }
        }
        if (param1 != 0) {
          this.field_Q = true;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 > -69) {
          return;
        }
        field_O = param0;
        ee.field_r = param1;
    }

    private final int g(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = wizardrun.field_H;
        var2 = this.field_k.length();
        if (this.field_L == var2) {
          return this.field_L;
        }
        if (param0 < 19) {
          return 50;
        }
        for (var3 = 1 + this.field_L; var3 < var2; var3++) {
          if (this.field_k.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    og(String param0, ce param1, int param2) {
        super(param0, param1);
        this.field_Q = false;
        this.field_M = -1;
        this.field_K = 0L;
        try {
          this.field_w = kc.field_H.field_b;
          this.field_H = param2;
          this.a(-1, true, param0);
          this.field_F = true;
          this.field_I = d.a((byte) 94);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        int dupTemp$0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_70_1 = 0;
        int stackIn_71_2 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_I = d.a((byte) 99);
          if (param0 != 60 &&
            param0 != 62) {
            if (param2 >= -96) {
              return false;
            }
            if (param0 >= 32 &&
              param0 <= 126) {
              if (this.field_J != this.field_L) {
                this.g(-110);
              }
              if (this.field_H != -1 &&
                this.field_k.length() >= this.field_H) {
                return true;
              }
              if (this.field_L >= this.field_k.length()) {
                this.field_k = this.field_k + param0;
                dupTemp$0 = this.field_k.length();
                this.field_L = dupTemp$0;
                this.field_J = dupTemp$0;
              } else {
                this.field_k = this.field_k.substring(0, this.field_L) + param0 + this.field_k.substring(this.field_L, this.field_k.length());
                this.field_L = this.field_L + 1;
                this.field_J = this.field_L;
              }
              this.i((byte) -84);
              return true;
            }
            if (param1 != 85) {
              if (param1 != 101) {
                if (param1 == 13) {
                  this.e(true);
                  return true;
                }
                if (96 == param1) {
                  if (0 < this.field_L) {
                    stackIn_70_1 = 27;
                    if (hi.field_p[82]) {
                      stackIn_71_2 = this.d(31823);
                    } else {
                      stackIn_71_2 = -1 + this.field_L;
                    }
                    this.a((byte) stackIn_70_1, stackIn_71_2);
                    return true;
                  }
                } else {
                  if (param1 != 97) {
                    if (param1 == 102) {
                      this.a((byte) 10, 0);
                      return true;
                    }
                    if (param1 == 103) {
                      this.a((byte) 92, this.field_k.length());
                      return true;
                    }
                    if (param1 == 84) {
                      this.h(0);
                      return true;
                    }
                    if (hi.field_p[82] &&
                      param1 == 65) {
                      this.j((byte) 75);
                      return true;
                    }
                    if (hi.field_p[82] &&
                      param1 == 66) {
                      this.f(false);
                      return true;
                    }
                    if (hi.field_p[82] &&
                      param1 == 67) {
                      this.h((byte) 126);
                      return true;
                    }
                  } else {
                    if (this.field_L < this.field_k.length()) {
                      stackIn_41_1 = -127;
                      if (!hi.field_p[82]) {
                        stackIn_42_2 = 1 + this.field_L;
                      } else {
                        stackIn_42_2 = this.g((byte) 24);
                      }
                      this.a((byte) stackIn_41_1, stackIn_42_2);
                      return true;
                    }
                  }
                }
              } else {
                if (this.field_L != this.field_J) {
                  this.g(76);
                  return true;
                }
                if (this.field_L < this.field_k.length()) {
                  this.field_J = 1 + this.field_L;
                  this.g(-73);
                  return true;
                }
              }
            } else {
              if (this.field_J != this.field_L) {
                this.g(-92);
                return true;
              }
              if (this.field_L > 0) {
                this.field_J = -1 + this.field_L;
                this.g(31);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("og.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
        }
    }

    private final void b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_H != -1) {
            var3_int = this.field_H - this.field_k.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_L != this.field_k.length()) {
            this.field_k = this.field_k.substring(0, this.field_L) + param0 + this.field_k.substring(this.field_L, this.field_k.length());
          } else {
            this.field_k = this.field_k + param0;
          }
          this.field_L = this.field_L + param0.length();
          if (param1 <= 76) {
            this.a((byte) -42, -84);
          }
          this.field_J = this.field_L;
          this.i((byte) -122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("og.KA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    void i(byte param0) {
        if (this.field_s instanceof fj) {
          ((fj) (this.field_s)).a(this, 5);
        }
        if (param0 >= -59) {
          this.field_Q = true;
        }
    }

    final static void a(ai param0, int param1, int param2) {
        mg var8 = null;
        mg var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = wizardrun.field_H;
        try {
          var8 = n.field_b;
          var9 = var8;
          var9.c((byte) -105, param1);
          var9.field_m = var9.field_m + 1;
          var4 = var9.field_m;
          var9.b((byte) 11, 1);
          var9.b(-1947079288, param0.field_i);
          var9.b(-1947079288, param0.field_t);
          var9.b(-1947079288, param0.field_o);
          var9.f(param0.field_k, 613003928);
          var9.f(param0.field_l, 613003928);
          var9.f(param0.field_m, 613003928);
          var9.f(param0.field_p, 613003928);
          var9.b((byte) 11, param0.field_q.length);
          var5 = 0;
          int var6 = -49 / ((param2 - 44) / 56);
          while (param0.field_q.length > var5) {
            var8.f(param0.field_q[var5], 613003928);
            var5++;
          }
          var9.e(var4, -1182887024);
          var9.a(-var4 + var9.field_m, -87);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "og.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        int var8_intLifetime1;
        try {
          if (super.a(param0, (byte) -83, param2, param3, param4, param5, param6) &&
            this.field_w instanceof qe) {
            var8_int = ((qe) ((Object) this.field_w)).a(9397, pg.field_n, param0, (ub) (this), param3, fi.field_B);
            stackIn_5_1 = -118;
            if (-1 == var8_int) {
              stackIn_6_2 = 0;
            } else {
              stackIn_6_2 = var8_int;
            }
            this.a((byte) stackIn_5_1, stackIn_6_2);
            var8_long = d.a((byte) 42);
            stackIn_9_1 = !(var8_long - this.field_K >= 250L);
            this.field_Q = stackIn_9_1;
            if (this.field_Q) {
              this.field_J = this.d(31823);
              this.field_L = this.g((byte) 113);
              if (this.field_L > 0 &&
                this.field_k.charAt(-1 + this.field_L) == 32) {
                this.field_L = this.field_L - 1;
              }
              this.field_M = this.field_L;
            }
            this.field_K = var8_long;
            return true;
          }
          var8_intLifetime1 = -66 % ((param1 - 12) / 36);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("og.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void e(boolean param0) {
        this.field_J = 0;
        this.field_L = 0;
        this.field_k = "";
        if (!param0) {
          return;
        }
        this.i((byte) -81);
    }

    void a(int param0, int param1, int param2, ub param3) {
        qe var7 = null;
        int var6 = 0;
        try {
          super.a(param0 + 0, param1, param2, param3);
          this.e(param0 ^ param0);
          if (this.field_q == 1) {
            if (this.field_w instanceof qe) {
              var7 = (qe) ((Object) this.field_w);
              var6 = var7.a(9397, pg.field_n, param2, (ub) (this), param1, fi.field_B);
              if (var6 != -1) {
                if (this.field_Q && var6 < this.field_M &&
                  var6 > this.field_J) {
                  var6 = this.field_M;
                }
                this.field_L = var6;
              }
            }
            this.field_I = d.a((byte) 44);
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "og.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void k(byte param0) {
        field_S = null;
        field_G = null;
        if (param0 != 37) {
          ai var2 = (ai) null;
          og.a((ai) null, 98, 109);
        }
        field_N = null;
        field_R = null;
        field_P = null;
    }

    private final int d(int param0) {
        int var2;
        int var3;
        var3 = wizardrun.field_H;
        if (this.field_L == 0) {
          return this.field_L;
        }
        if (param0 != 31823) {
          field_O = -60;
        }
        for (var2 = this.field_L - 1; 0 < var2; var2--) {
          if (this.field_k.charAt(-1 + var2) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void h(int param0) {
        if (param0 != 0) {
          this.a(59, -78, 27, 72);
        }
        if (this.field_s instanceof fj) {
          ((fj) (this.field_s)).a(param0 ^ -117, this);
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 10 % ((-48 - param0) / 44);
        this.field_L = param1;
        if (!hi.field_p[81]) {
          this.field_J = this.field_L;
        }
    }

    private final String f(int param0) {
        if (param0 != -12938) {
          this.field_J = 68;
        }
        int var2 = this.field_L > this.field_J ? this.field_J : this.field_L;
        int var3 = this.field_L > this.field_J ? this.field_L : this.field_J;
        return this.field_k.substring(var2, var3);
    }

    private final void e(int param0) {
        af var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        qe var9;
        var8 = wizardrun.field_H;
        if (!this.field_F) {
          this.field_j = 0;
          this.field_i = 0;
          return;
        }
        if (param0 != 0) {
          this.field_K = 13L;
        }
        if (!(this.field_w instanceof qe)) {
          return;
        }
        var9 = (qe) ((Object) this.field_w);
        var3 = var9.a((ub) (this), (byte) 78);
        var4 = var3.a(-127);
        var5 = var9.a((ub) (this), param0 - 106);
        var6 = var9.a((byte) 62) >> 1;
        if (var4 < var5 - var6) {
          this.field_i = 0;
          this.field_j = 0;
          return;
        }
        var7 = this.field_i + var3.a(62, this.field_L);
        if (var5 - var6 >= var7) {
          if (var6 > var7) {
            this.field_i = this.field_i + var6 - var7;
          }
        } else {
          this.field_i = var5 + (-var6 - var7) + this.field_i;
        }
        if (this.field_i > 0) {
          this.field_i = 0;
        } else {
          if (this.field_i < var6 - var5) {
            this.field_i = var6 - var5;
          }
        }
        return;
    }

    private final void f(boolean param0) {
        String var2 = this.f(-12938);
        if (param0) {
          return;
        }
        if (!(var2.length() <= 0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.f(-12938))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_k = param2;
          var4_int = param2.length();
          if (this.field_H != param0 &&
            this.field_H < var4_int) {
            this.field_k = this.field_k.substring(0, this.field_H);
          }
          dupTemp$1 = this.field_k.length();
          this.field_J = dupTemp$1;
          this.field_L = dupTemp$1;
          if (!param1) {
            this.i((byte) -94);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("og.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_J != this.field_L) {
          var2 = this.field_L > this.field_J ? this.field_J : this.field_L;
          var3 = this.field_L <= this.field_J ? this.field_J : this.field_L;
          this.field_L = var2;
          this.field_J = var2;
          this.field_k = this.field_k.substring(0, var2) + this.field_k.substring(var3, this.field_k.length());
          this.i((byte) -115);
        }
        var2Lifetime1 = 47 / ((param0 + 20) / 43);
    }

    private final void h(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            if (param0 < 1) {
              this.field_J = -125;
            }
            this.g(-125);
            this.b(var2, 84);
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

    private final void j(byte param0) {
        if (param0 != 75) {
          this.a(-59, 57, 98, 61);
        }
        this.f(false);
        this.g(param0 - 145);
    }

    static {
        field_O = -1;
        field_G = "Main Menu";
        field_P = "Move left and right";
    }
}
