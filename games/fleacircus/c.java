/*
 * Decompiled by CFR-JS 0.4.0.
 */
class c extends bb {
    private long field_L;
    private int field_N;
    static boolean field_U;
    static long field_P;
    private int field_M;
    private long field_Q;
    static int field_S;
    private int field_O;
    private boolean field_T;
    private boolean field_R;
    private int field_K;

    private final void q(int param0) {
        String var2 = this.p(0);
        if (param0 <= 82) {
          this.field_O = -105;
        }
        if (!(0 >= var2.length())) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.p(0))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_K != this.field_M) {
          var2 = this.field_M <= this.field_K ? this.field_M : this.field_K;
          var3 = this.field_M > this.field_K ? this.field_M : this.field_K;
          this.field_M = var2;
          this.field_K = var2;
          this.field_i = this.field_i.substring(0, var2) + this.field_i.substring(var3, this.field_i.length());
          this.i(-1);
        }
        if (param0) {
          this.field_R = true;
        }
    }

    final static void o(int param0) {
        ij.field_H = null;
        of.field_d = (byte[][]) null;
        if (param0 != -28210) {
          field_S = 0;
        }
        vg.field_I = null;
        rd.field_d = null;
        ob.field_a = null;
        b.field_b = null;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        long var6;
        eg var8;
        if (!param2) {
          this.field_O = -50;
        }
        if (null != this.field_p &&
          param3 == 0) {
          this.field_p.a(-74, param1, this.field_D, (qa) (this), param0);
          if (this.field_p instanceof eg) {
            var8 = (eg) ((Object) this.field_p);
            if (this.field_M != this.field_K) {
              var8.a((qa) (this), this.field_M, param0, this.field_K, -30298, param1);
            }
            var6 = lj.a((byte) -27);
            if ((var6 - this.field_Q) % 1000L < 500L) {
              var8.a(param0, 0, (qa) (this), this.field_M, param1);
            }
          }
        }
    }

    final void r(int param0) {
        this.field_M = 0;
        this.field_K = 0;
        this.field_i = "";
        this.i(-1);
        if (param0 != 32) {
          field_U = false;
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != ~this.field_O) {
            var3_int = this.field_O - this.field_i.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_M != this.field_i.length()) {
            this.field_i = this.field_i.substring(0, this.field_M) + param1 + this.field_i.substring(this.field_M, this.field_i.length());
          } else {
            this.field_i = this.field_i + param1;
          }
          this.field_M = this.field_M + param1.length();
          this.field_K = this.field_M;
          this.i(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("c.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int stackIn_5_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a(param0, param1, param2, param3, param4, param5, param6) &&
            this.field_p instanceof eg) {
            var8_int = ((eg) ((Object) this.field_p)).a(kc.field_b, (qa) (this), (byte) 97, param6, param0, ag.field_f);
            if (-1 == var8_int) {
              stackIn_5_1 = 0;
            } else {
              stackIn_5_1 = var8_int;
            }
            this.a(stackIn_5_1, -57);
            var8_long = lj.a((byte) -93);
            stackIn_8_1 = !(var8_long - this.field_L >= 250L);
            this.field_R = stackIn_8_1;
            if (this.field_R) {
              this.field_K = this.j(127);
              this.field_M = this.l(32);
              if (this.field_M > 0 &&
                32 == this.field_i.charAt(-1 + this.field_M)) {
                this.field_M = this.field_M - 1;
              }
              this.field_N = this.field_M;
            }
            this.field_L = var8_long;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("c.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void n(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            if (param0 != -1) {
              this.field_N = 63;
            }
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.c(false);
            this.a(param0 + 1, var2);
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

    c(String param0, kd param1, int param2) {
        super(param0, param1);
        this.field_N = -1;
        this.field_R = false;
        this.field_L = 0L;
        try {
          this.field_p = nf.field_M.field_l;
          this.field_O = param2;
          this.a(true, (byte) -78, param0);
          this.field_T = true;
          this.field_Q = lj.a((byte) -19);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "c.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void m(int param0) {
        ne var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        qa var9;
        eg var10;
        var8 = fleas.field_A ? 1 : 0;
        if (!this.field_T) {
          this.field_n = 0;
          this.field_r = 0;
          return;
        }
        if (!(this.field_p instanceof eg)) {
          return;
        }
        var10 = (eg) ((Object) this.field_p);
        var3 = var10.a((qa) (this), (byte) -35);
        var4 = var3.b((byte) 97);
        if (param0 <= 89) {
          var9 = (qa) null;
          this.a(11, 11, (qa) null, '*');
        }
        var5 = var10.b((qa) (this), (byte) -67);
        var6 = var10.a((byte) 127) >> 1;
        if (var4 < var5 - var6) {
          this.field_r = 0;
          this.field_n = 0;
          return;
        }
        var7 = this.field_r + var3.c(-1, this.field_M);
        if (var5 - var6 >= var7) {
          if (var7 < var6) {
            this.field_r = this.field_r + (var6 - var7);
          }
        } else {
          this.field_r = this.field_r - (-var5 + var6) - var7;
        }
        if (this.field_r <= 0) {
          if (this.field_r < -var5 + var6) {
            this.field_r = -var5 + var6;
          }
        } else {
          this.field_r = 0;
        }
        return;
    }

    private final void k(int param0) {
        if (param0 != -14) {
          return;
        }
        this.q(param0 ^ -97);
        this.c(false);
    }

    private final int j(int param0) {
        int var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        if (0 == this.field_M) {
          return this.field_M;
        }
        var2 = -1 + this.field_M;
        if (param0 <= 79) {
          this.r(-57);
        }
        while (var2 > 0) {
          if (this.field_i.charAt(var2 - 1) != 32) {
            var2--;
            continue;
          }
          break;
        }
        return var2;
    }

    final void a(boolean param0, byte param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          if (param1 > -39) {
            this.i(125);
          }
          this.field_i = param2;
          var4_int = param2.length();
          if (-1 != this.field_O &&
            this.field_O < var4_int) {
            this.field_i = this.field_i.substring(0, this.field_O);
          }
          dupTemp$2 = this.field_i.length();
          this.field_K = dupTemp$2;
          this.field_M = dupTemp$2;
          if (!param0) {
            this.i(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("c.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 > -27) {
          discarded$0 = this.j(-45);
        }
        this.field_M = param0;
        if (!ei.field_H[81]) {
          this.field_K = this.field_M;
        }
    }

    private final void d(byte param0) {
        if (param0 <= 88) {
          return;
        }
        if (this.field_s instanceof nk) {
          ((nk) (this.field_s)).a(-31825, this);
        }
    }

    void i(int param0) {
        if (this.field_s instanceof nk) {
          ((nk) (this.field_s)).b(param0 ^ -41, this);
        }
        if (param0 != -1) {
          field_U = true;
        }
    }

    private final String p(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        int var2 = this.field_M <= this.field_K ? this.field_M : this.field_K;
        int var3 = this.field_M > this.field_K ? this.field_M : this.field_K;
        return this.field_i.substring(var2, var3);
    }

    final static void a(int param0, byte param1, int param2, dd[] param3, int param4, int param5, fa param6, dd[] param7, int param8, int param9, boolean param10, int param11) {
        try {
          ib.a(param0, param9, param6, param3, param7, param2, 0, param8, param4, param2, param9, param5, param11, param10, param6);
          if (param1 <= 66) {
            field_P = 53L;
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "c.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        int var6 = 0;
        eg var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, (byte) -93);
          if (param3 >= -85) {
            this.field_N = 68;
          }
          this.m(127);
          if (this.field_v == 1) {
            if (this.field_p instanceof eg) {
              var7 = (eg) ((Object) this.field_p);
              var6 = var7.a(kc.field_b, (qa) (this), (byte) 80, param1, param0, ag.field_f);
              if (var6 != -1) {
                if (this.field_R &&
                  this.field_N > var6 &&
                  this.field_K < var6) {
                  var6 = this.field_N;
                }
                this.field_M = var6;
              }
            }
            this.field_Q = lj.a((byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_Q = lj.a((byte) -37);
          if (param0 != -2) {
            return true;
          }
          if (param3 != 60 &&
            62 != param3) {
            if (param3 >= 32 &&
              126 >= param3) {
              if (this.field_K != this.field_M) {
                this.c(false);
              }
              if (this.field_O != -1 &&
                this.field_i.length() >= this.field_O) {
                return true;
              }
              if (this.field_M >= this.field_i.length()) {
                this.field_i = this.field_i + param3;
                dupTemp$0 = this.field_i.length();
                this.field_M = dupTemp$0;
                this.field_K = dupTemp$0;
              } else {
                this.field_i = this.field_i.substring(0, this.field_M) + param3 + this.field_i.substring(this.field_M, this.field_i.length());
                this.field_M = this.field_M + 1;
                this.field_K = this.field_M;
              }
              this.i(-1);
              return true;
            }
            if (85 == param1) {
              if (this.field_M != this.field_K) {
                this.c(false);
                return true;
              }
              if (0 < this.field_M) {
                this.field_K = -1 + this.field_M;
                this.c(false);
                return true;
              }
            } else {
              if (param1 == 101) {
                if (this.field_M != this.field_K) {
                  this.c(false);
                  return true;
                }
                if (this.field_M < this.field_i.length()) {
                  this.field_K = this.field_M + 1;
                  this.c(false);
                  return true;
                }
              } else {
                if (param1 == 13) {
                  this.r(32);
                  return true;
                }
                if (param1 != 96) {
                  if (param1 != 97) {
                    if (102 == param1) {
                      this.a(0, -47);
                      return true;
                    }
                    if (103 == param1) {
                      this.a(this.field_i.length(), -92);
                      return true;
                    }
                    if (param1 == 84) {
                      this.d((byte) 115);
                      return true;
                    }
                    if (ei.field_H[82] &&
                      65 == param1) {
                      this.k(-14);
                      return true;
                    }
                    if (ei.field_H[82] &&
                      param1 == 66) {
                      this.q(105);
                      return true;
                    }
                    if (ei.field_H[82] &&
                      param1 == 67) {
                      this.n(-1);
                      return true;
                    }
                  } else {
                    if (this.field_M < this.field_i.length()) {
                      if (!ei.field_H[82]) {
                        stackIn_40_1 = this.field_M + 1;
                      } else {
                        stackIn_40_1 = this.l(32);
                      }
                      this.a(stackIn_40_1, -72);
                      return true;
                    }
                  }
                } else {
                  if (this.field_M > 0) {
                    if (ei.field_H[82]) {
                      stackIn_32_1 = this.j(param0 ^ -100);
                    } else {
                      stackIn_32_1 = this.field_M - 1;
                    }
                    this.a(stackIn_32_1, -127);
                    return true;
                  }
                }
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("c.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int l(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        var2 = this.field_i.length();
        if (var2 == this.field_M) {
          return this.field_M;
        }
        if (param0 != 32) {
          return -60;
        }
        for (var3 = this.field_M + 1; var3 < var2; var3++) {
          if (this.field_i.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    static {
        field_S = 0;
    }
}
