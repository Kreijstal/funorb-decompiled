/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rm extends ck {
    private int field_R;
    private int field_M;
    static String field_J;
    private boolean field_Q;
    private long field_I;
    static boolean field_P;
    private int field_L;
    private int field_K;
    private boolean field_N;
    static int field_T;
    private long field_O;
    static String[] field_S;

    private final void l(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.g((byte) -90);
            if (param0 <= 49) {
              field_J = (String) null;
            }
            this.a(var2, (byte) -127);
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

    private final void s(int param0) {
        if (param0 != 32) {
          field_J = (String) null;
        }
        if (this.field_n instanceof jo) {
          ((jo) (this.field_n)).a(this, (byte) -127);
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
          if (this.field_K != -1) {
            var3_int = this.field_K - this.field_w.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (param1 >= -67) {
            this.field_I = -77L;
          }
          if (this.field_L == this.field_w.length()) {
            this.field_w = this.field_w + param0;
          } else {
            this.field_w = this.field_w.substring(0, this.field_L) + param0 + this.field_w.substring(this.field_L, this.field_w.length());
          }
          this.field_L = this.field_L + param0.length();
          this.field_M = this.field_L;
          this.n(4746);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("rm.V(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        int dupTemp$0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_I = kd.c(-2456);
          if (param3 < 55) {
            this.field_R = 21;
          }
          if (60 == param1) {
            return false;
          }
          if (62 == param1) {
            return false;
          }
          if (param1 >= 32 &&
            param1 <= 126) {
            if (this.field_L != this.field_M) {
              this.g((byte) -105);
            }
            if (this.field_K == -1 ||
              !(this.field_w.length() >= this.field_K)) {
              if (this.field_L < this.field_w.length()) {
                this.field_w = this.field_w.substring(0, this.field_L) + param1 + this.field_w.substring(this.field_L, this.field_w.length());
                this.field_L = this.field_L + 1;
                this.field_M = this.field_L;
              } else {
                this.field_w = this.field_w + param1;
                dupTemp$0 = this.field_w.length();
                this.field_L = dupTemp$0;
                this.field_M = dupTemp$0;
              }
              this.n(4746);
            }
            return true;
          }
          if (85 == param2) {
            if (this.field_M != this.field_L) {
              this.g((byte) -118);
              return true;
            }
            if (this.field_L > 0) {
              this.field_M = this.field_L - 1;
              this.g((byte) -93);
              return true;
            }
          } else {
            if (param2 == 101) {
              if (this.field_L != this.field_M) {
                this.g((byte) -117);
                return true;
              }
              if (this.field_L < this.field_w.length()) {
                this.field_M = this.field_L + 1;
                this.g((byte) 113);
                return true;
              }
            } else {
              if (param2 == 13) {
                this.p(61);
                return true;
              }
              if (param2 == 96) {
                if (0 < this.field_L) {
                  if (qk.field_e[82]) {
                    stackIn_47_1 = this.o(88);
                  } else {
                    stackIn_47_1 = this.field_L - 1;
                  }
                  this.a(stackIn_47_1, 6931);
                  return true;
                }
              } else {
                if (97 == param2) {
                  if (this.field_L < this.field_w.length()) {
                    if (!qk.field_e[82]) {
                      stackIn_41_1 = 1 + this.field_L;
                    } else {
                      stackIn_41_1 = this.f((byte) 116);
                    }
                    this.a(stackIn_41_1, 6931);
                    return true;
                  }
                } else {
                  if (param2 == 102) {
                    this.a(0, 6931);
                    return true;
                  }
                  if (param2 == 103) {
                    this.a(this.field_w.length(), 6931);
                    return true;
                  }
                  if (param2 == 84) {
                    this.s(32);
                    return true;
                  }
                  if (qk.field_e[82] &&
                    param2 == 65) {
                    this.i(0);
                    return true;
                  }
                  if (qk.field_e[82] &&
                    param2 == 66) {
                    this.h((byte) -86);
                    return true;
                  }
                  if (qk.field_e[82] &&
                    67 == param2) {
                    this.l(69);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("rm.W(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(String param0, boolean param1, byte param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 == null) {
            param0 = "";
          }
          this.field_w = param0;
          if (param2 < 2) {
            this.g((byte) -16);
          }
          var4_int = param0.length();
          if (-1 != this.field_K &&
            var4_int > this.field_K) {
            this.field_w = this.field_w.substring(0, this.field_K);
          }
          dupTemp$1 = this.field_w.length();
          this.field_M = dupTemp$1;
          this.field_L = dupTemp$1;
          if (!param1) {
            this.n(4746);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("rm.GA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void h(byte param0) {
        if (param0 >= -73) {
          return;
        }
        String var2 = this.k(82);
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(82))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void i(int param0) {
        if (param0 != 0) {
          field_S = (String[]) null;
        }
        this.h((byte) -89);
        this.g((byte) -111);
    }

    void n(int param0) {
        int discarded$0 = 0;
        if (this.field_n instanceof jo) {
          ((jo) (this.field_n)).a(this, 10000536);
        }
        if (param0 != 4746) {
          discarded$0 = this.o(99);
        }
    }

    final static int a(ec param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.c(true);
          if (var2_int == 255) {
            var2_int = ek.field_c;
          }
          if (param1 != 6065) {
            field_J = (String) null;
          }
          stackIn_5_0 = var2_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("rm.EA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int o(int param0) {
        int var2;
        int var3;
        var3 = DungeonAssault.field_K;
        if (this.field_L == 0) {
          return this.field_L;
        }
        if (param0 < 37) {
          this.field_O = 78L;
        }
        for (var2 = -1 + this.field_L; var2 > 0; var2--) {
          if (this.field_w.charAt(-1 + var2) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int stackIn_7_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9_int = 0;
        long var9 = 0L;
        try {
          var8_int = -112 / ((-80 - param5) / 35);
          if (!super.a(param0, param1, param2, param3, param4, (byte) -124, param6)) {
            return false;
          }
          if (!(this.field_o instanceof th)) {
            return false;
          }
          var9_int = ((th) ((Object) this.field_o)).a(16, param6, hj.field_S, param3, (lm) (this), eh.field_h);
          if (var9_int != -1) {
            stackIn_7_1 = var9_int;
          } else {
            stackIn_7_1 = 0;
          }
          this.a(stackIn_7_1, 6931);
          var9 = kd.c(-2456);
          stackIn_10_1 = !(-this.field_O + var9 >= 250L);
          this.field_N = stackIn_10_1;
          if (this.field_N) {
            this.field_M = this.o(88);
            this.field_L = this.f((byte) 99);
            if (this.field_L > 0 &&
              this.field_w.charAt(-1 + this.field_L) == 32) {
              this.field_L = this.field_L - 1;
            }
            this.field_R = this.field_L;
          }
          this.field_O = var9;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("rm.U(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        th var8 = null;
        long var6 = 0L;
        if (this.field_o != null &&
          param0 == 0) {
          this.field_o.a((byte) 34, (lm) (this), param1, param3, this.field_B);
          if (this.field_o instanceof th) {
            var8 = (th) ((Object) this.field_o);
            if (this.field_L != this.field_M) {
              var8.a(this.field_M, param1, param3, (lm) (this), 33, this.field_L);
            }
            var6 = kd.c(param2 - 2456);
            if ((-this.field_I + var6) % 1000L < 500L) {
              var8.a((lm) (this), this.field_L, param3, -1, param1);
            }
          }
        }
        if (param2 != 0) {
          this.j(31);
        }
    }

    final static int a(byte param0, CharSequence param1, char param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          var3_int = 0;
          var4 = param1.length();
          var5 = -123 / ((12 - param0) / 32);
          for (var6 = 0; var6 < var4; var6++) {
            if (param2 == param1.charAt(var6)) {
              var3_int++;
            }
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rm.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 82 % ((param0 + 32) / 54);
        if (this.field_M != this.field_L) {
          var3 = this.field_M < this.field_L ? this.field_M : this.field_L;
          var4 = this.field_M < this.field_L ? this.field_L : this.field_M;
          this.field_M = var3;
          this.field_L = var3;
          this.field_w = this.field_w.substring(0, var3) + this.field_w.substring(var4, this.field_w.length());
          this.n(4746);
        }
    }

    final static double a(byte param0, int param1, int param2, double param3, int param4) {
        double var6 = (double)param4 / (double)param2;
        double var8 = -((double)param1 * 0.02) + 0.1;
        int var12 = -29 / ((54 - param0) / 40);
        double var10 = 0.9 - 0.08 * (double)param1;
        double var13 = var6 * var10 + (param3 + var8);
        if (1.0 < var13) {
          var13 = 1.0;
        }
        return var13;
    }

    private final void a(int param0, int param1) {
        this.field_L = param0;
        if (param1 != 6931) {
          field_P = false;
        }
        if (!qk.field_e[81]) {
          this.field_M = this.field_L;
        }
    }

    public static void m(int param0) {
        field_S = null;
        field_J = null;
        if (param0 != 4) {
          field_P = false;
        }
    }

    private final int f(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = DungeonAssault.field_K;
        if (param0 <= 76) {
          this.l(39);
        }
        var2 = this.field_w.length();
        if (this.field_L == var2) {
          return this.field_L;
        }
        for (var3 = 1 + this.field_L; var2 > var3; var3++) {
          if (this.field_w.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        th var5 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.j(-24768);
          if (1 == this.field_y) {
            if (this.field_o instanceof th) {
              var5 = (th) ((Object) this.field_o);
              var6 = var5.a(16, param1, hj.field_S, param0, (lm) (this), eh.field_h);
              if (-1 != var6) {
                if (this.field_N &&
                  var6 < this.field_R &&
                  this.field_M < var6) {
                  var6 = this.field_R;
                }
                this.field_L = var6;
              }
            }
            this.field_I = kd.c(-2456);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "rm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    rm(String param0, pg param1, int param2) {
        super(param0, param1);
        this.field_R = -1;
        this.field_O = 0L;
        this.field_N = false;
        try {
          this.field_K = param2;
          this.field_o = hl.field_a.field_c;
          this.a(param0, true, (byte) 57);
          this.field_Q = true;
          this.field_I = kd.c(-2456);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "rm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void q(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ue var4_ref_ue = null;
        Object var5 = null;
        int var6 = 0;
        ub var8 = null;
        wj var9 = null;
        byte[] var13 = null;
        var6 = DungeonAssault.field_K;
        try {
          var9 = ra.field_c;
          if (param0 != -5705) {
            field_T = -87;
          }
          var2 = var9.c(true);
          if (var2 == 0) {
            var8 = (ub) (bg.field_s.e(-24172));
            if (var8 == null) {
              tl.a(-86);
              return;
            }
            var4 = var9.c(true);
            if (0 == var4) {
              var5 = null;
            } else {
              var13 = new byte[var4];
              var9.a((byte) -111, 0, var4, var13);
            }
            var9.field_o = var9.field_o + 4;
            if (!var9.d(true)) {
              tl.a(param0 ^ -5667);
              return;
            }
            var8.a(false);
          } else {
            if (var2 == 1) {
              var3 = var9.h(-107);
              var4_ref_ue = (ue) (qm.field_q.e(-24172));
              while (var4_ref_ue != null) {
                if (var4_ref_ue.field_k != var3) {
                  var4_ref_ue = (ue) (qm.field_q.a(4));
                  continue;
                }
                break;
              }
              if (var4_ref_ue != null) {
                var4_ref_ue.a(false);
                return;
              }
              tl.a(126);
              return;
            }
            sm.a((Throwable) null, 1, "A1: " + sj.l(192));
            tl.a(-85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "rm.CA(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        l var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ec var9;
        th var10;
        var8 = DungeonAssault.field_K;
        if (!this.field_Q) {
          this.field_A = 0;
          this.field_j = 0;
          return;
        }
        if (!(this.field_o instanceof th)) {
          return;
        }
        var10 = (th) ((Object) this.field_o);
        if (param0 != -24768) {
          var9 = (ec) null;
          rm.a((ec) null, -49);
        }
        var3 = var10.b(-2, (lm) (this));
        var4 = var3.c(-117);
        var5 = var10.c(param0 + 24772, (lm) (this));
        var6 = var10.a(param0 ^ -24774) >> 1;
        if (-var6 + var5 > var4) {
          this.field_j = 0;
          this.field_A = 0;
          return;
        }
        var7 = this.field_j + var3.a((byte) 86, this.field_L);
        if (var5 - var6 >= var7) {
          if (var7 < var6) {
            this.field_j = var6 + (-var7 + this.field_j);
          }
        } else {
          this.field_j = this.field_j - (-var5 + var6 + var7);
        }
        if (this.field_j > 0) {
          this.field_j = 0;
        } else {
          if (var6 - var5 > this.field_j) {
            this.field_j = var6 - var5;
          }
        }
        return;
    }

    final void p(int param0) {
        if (param0 <= 30) {
          rm.a((byte) 6, (CharSequence) null, 'ﾫ');
        }
        this.field_M = 0;
        this.field_w = "";
        this.field_L = 0;
        this.n(4746);
    }

    private final String k(int param0) {
        int var2 = this.field_L <= this.field_M ? this.field_L : this.field_M;
        if (param0 != 82) {
          return (String) null;
        }
        int var3 = this.field_M < this.field_L ? this.field_L : this.field_M;
        return this.field_w.substring(var2, var3);
    }

    final static void r(int param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var2 = DungeonAssault.field_K;
        try {
          ga.field_o = new cn[9];
          if (1 != hc.field_d) {
            if (hc.field_d != 2) {
              sj.field_db = dd.field_C;
            } else {
              sj.field_db = na.field_G;
            }
          } else {
            sj.field_db = hl.field_e;
          }
          if (param0 != 22362) {
            rm.q(124);
          }
          ga.field_o[0] = rc.a("", sb.field_a, "intro_01.jpg", (byte) 71);
          ga.field_o[1] = rc.a("", sb.field_a, "intro_03.jpg", (byte) 71);
          ga.field_o[2] = rc.a("", sb.field_a, "intro_02.jpg", (byte) 71);
          ga.field_o[3] = rc.a("", sb.field_a, "intro_04.jpg", (byte) 71);
          ga.field_o[4] = rc.a("", sb.field_a, "intro_05.jpg", (byte) 71);
          ga.field_o[5] = ga.field_o[4];
          ga.field_o[6] = rc.a("", sb.field_a, "intro_06.jpg", (byte) 71);
          ga.field_o[7] = rc.a("", sb.field_a, "intro_07.jpg", (byte) 71);
          ga.field_o[8] = rc.a("", sb.field_a, "intro_08.jpg", (byte) 71);
          jh.c();
          for (var1_int = 0; var1_int < ga.field_o.length; var1_int++) {
            ga.field_o[var1_int].e();
            gf.e(0, 0, gf.field_i, gf.field_c, 0);
            gf.e(1, 1, -2 + gf.field_i, -2 + gf.field_c, 0, 128);
          }
          jh.b();
          sg.field_b = rc.a("", sb.field_a, "logo.jpg", (byte) 71);
          ro.field_B = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "rm.G(" + param0 + ')');
        }
    }

    static {
        field_J = "Passive ability - <%0>";
        field_S = new String[]{"Defeat", "<%highlight>Your raider has failed!</col><br><br><%command>Seek another route or try again with another raider. Continue moving your party toward the hoard room.</col>"};
    }
}
