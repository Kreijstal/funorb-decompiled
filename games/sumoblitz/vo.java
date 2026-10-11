/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends ao implements ai {
    private int field_Q;
    private boolean field_K;
    private int field_C;
    private boolean field_A;
    private wp field_F;
    private wp field_M;
    private wp field_N;
    private int field_R;
    private jh field_H;
    static int field_I;
    private wp field_J;
    int field_G;
    private int field_O;
    private wp field_P;
    private boolean field_B;
    private int field_L;
    int field_D;
    int field_E;

    final void a(int param0, int param1) {
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 0) {
          return;
        }
        if (param1 < 0) {
          this.field_D = 0;
        } else {
          if (param1 > 65536) {
            this.field_D = 65536;
          } else {
            this.field_D = param1;
          }
        }
        this.f(-1840);
    }

    private final void a(byte param0, int param1) {
        int var3 = 106 / ((-25 - param0) / 52);
        this.b(param1, (byte) 122);
        if (this.field_o instanceof nc) {
          ((nc) (this.field_o)).a(this, -6772, this.field_D, this.field_G);
        }
    }

    final static long a(CharSequence param0, int param1) {
        int var5 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              90 >= var6) {
              var2_long = var2_long + (long)(var6 - 64);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(1 + (var6 - 97));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-48 + (27 + var6));
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          if (param1 != 7441) {
            field_I = -23;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("vo.AA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final static bo a(boolean param0, byte[] param1) {
        bo var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        Object stackIn_2_0 = null;
        bo stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (bo) (stackIn_2_0);
          }
          if (param0) {
            var3 = (CharSequence) null;
            vo.a((CharSequence) null, 104);
          }
          var2 = new bo(param1, er.field_h, av.field_C, vg.field_k, we.field_B, iv.field_l, ag.field_d);
          tl.a((byte) -60);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("vo.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void b(int param0, byte param1) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        int var3 = -36 / ((param1 - 50) / 41);
        if (0 > param0) {
          this.field_G = 0;
        } else {
          if (param0 <= 65536) {
            this.field_G = param0;
          } else {
            this.field_G = 65536;
          }
        }
        this.e((byte) 100);
    }

    private final void a(byte param0) {
        if (param0 != -121) {
          this.a(100, false);
        }
        int var2 = this.field_N == null ? this.field_P.field_r : this.field_N.field_r + this.field_N.field_q;
        int var3 = null != this.field_J ? this.field_J.field_r - this.field_H.field_q : this.field_P.field_q + this.field_P.field_r - this.field_H.field_q;
        this.b(var3 > var2 ? (this.field_H.field_r - var2 << 16) / (var3 - var2) : 0, (byte) -6);
    }

    final static ki b(int param0, int param1) {
        ki stackIn_7_0 = null;
        if (param1 != -1) {
          return (ki) null;
        }
        if (ha.field_g == null &&
          param0 != -1) {
          stackIn_7_0 = ng.a(1, -117, true, param0, false, true);
        } else {
          stackIn_7_0 = ha.field_g;
        }
        return stackIn_7_0;
    }

    private final void a(int param0, byte param1) {
        this.a(0, param0);
        if (param1 != -125) {
          return;
        }
        if (this.field_o instanceof nc) {
          ((nc) (this.field_o)).a(this, -6772, this.field_D, this.field_D);
        }
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 >= -1) {
            return false;
          }
          if ((param1 <= 0 ||
            128 <= param1) &&
            (param1 < 160 ||
            255 < param1)) {
            if (param1 == 0) {
              return false;
            }
            var6 = uk.field_lb;
            var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
              var4 = var6[var3];
              if (param1 == var4) {
                return true;
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "vo.V(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(pk param0, byte param1) {
        jh var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 61) {
            this.b(-73, (byte) 11);
          }
          var3 = this.field_H;
          if (var3 == null) {
            return false;
          }
          if (!((pk) ((Object) var3)).a(param0, (byte) 61)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("vo.Q(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var7 = 0;
        byte[] var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 != 710) {
            var8 = (byte[]) null;
            vo.a(true, (byte[]) null);
          }
          if (param0 == 1) {
            if (!this.field_B) {
              return;
            }
            if (this.field_K &&
              this.field_F == param2) {
              this.a(-this.field_E + this.field_D, (byte) -125);
              return;
            }
            if (this.field_K &&
              param2 == this.field_M) {
              this.a(this.field_E + this.field_D, (byte) -125);
              return;
            }
            if (this.field_A &&
              param2 == this.field_N) {
              this.a((byte) -78, this.field_G - this.field_Q);
              return;
            }
            if (this.field_A &&
              this.field_J == param2) {
              this.a((byte) 48, this.field_Q + this.field_G);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("vo.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void g(int param0) {
        int var2 = this.field_F != null ? this.field_F.field_v + this.field_F.field_p : this.field_P.field_v;
        int var3 = null != this.field_M ? this.field_M.field_v - this.field_H.field_p : -this.field_H.field_p + this.field_P.field_v + this.field_P.field_p;
        this.a(0, var3 <= var2 ? 0 : (this.field_H.field_v - var2 << 16) / (-var2 + var3));
        if (param0 != -2066408880) {
          this.field_H = (jh) null;
        }
    }

    private final void a(boolean param0, int param1) {
        wp stackIn_3_0 = null;
        boolean stackIn_5_1 = false;
        wp stackIn_9_0 = null;
        boolean stackIn_11_1 = false;
        wp stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        wp stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        stackIn_3_0 = this.field_P;
        stackIn_5_1 = (param0) || (this.field_K);
        stackIn_3_0.field_x = stackIn_5_1;
        if (this.field_H.field_y instanceof wp) {
          stackIn_9_0 = (wp) (this.field_H.field_y);
          stackIn_11_1 = (param0) || (this.field_K);
          stackIn_9_0.field_x = stackIn_11_1;
        }
        if (param1 > -126) {
          this.field_O = -95;
        }
        if (this.field_N != null) {
          stackIn_17_0 = this.field_N;
          stackIn_18_1 = (!param0) ? false : true;
          stackIn_17_0.field_x = stackIn_18_1;
        }
        if (null != this.field_J) {
          stackIn_23_0 = this.field_J;
          stackIn_24_1 = (!param0) ? false : true;
          stackIn_23_0.field_x = stackIn_24_1;
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          super.a(param0, -123, param2, param3);
          var5_int = 4 / ((param1 + 25) / 45);
          if ((!(this.field_H.field_y instanceof wp) ||
            ((wp) (this.field_H.field_y)).field_x) && this.field_H.field_l == 1) {
            if (!this.field_A) {
              this.e((byte) 110);
            } else {
              var6 = this.field_G;
              this.a((byte) -121);
              if (var6 != this.field_G &&
                this.field_o instanceof nc) {
                ((nc) (this.field_o)).a(this.field_G, this.field_G, this, false);
              }
            }
            if (!this.field_K) {
              this.f(-1840);
            } else {
              var6Lifetime2 = this.field_D;
              this.g(-2066408880);
              if (this.field_D != var6Lifetime2 &&
                this.field_o instanceof nc) {
                ((nc) (this.field_o)).a(this.field_D, this.field_G, this, false);
              }
            }
          }
          if (this.field_P.field_x &&
            this.field_P.field_B == 1) {
            if (this.field_K) {
              if (!this.field_A) {
                if ((this.field_H.field_p >> 1) + param3 + this.field_H.field_v < pi.field_e) {
                  this.a(this.field_O + this.field_D, (byte) -125);
                } else {
                  this.a(this.field_D - this.field_O, (byte) -125);
                }
              } else {
                var6Lifetime1 = -(this.field_H.field_q >> 1) + (-this.field_H.field_r - this.field_r - param0 + ko.field_p);
                var7 = -param3 + (pi.field_e - this.field_v) - (this.field_H.field_v + (this.field_H.field_p >> 1));
                if (Math.abs(var7) > Math.abs(var6Lifetime1)) {
                  if (var7 > 0) {
                    this.a(this.field_O + this.field_D, (byte) -125);
                  } else {
                    this.a(this.field_D - this.field_O, (byte) -125);
                  }
                } else {
                  if (var6Lifetime1 <= 0) {
                    this.a((byte) -109, -this.field_C + this.field_G);
                  } else {
                    this.a((byte) 27, this.field_C + this.field_G);
                  }
                }
              }
            } else {
              if (this.field_A) {
                if (ko.field_p <= this.field_H.field_r + param0 + (this.field_H.field_q >> 1)) {
                  this.a((byte) 116, this.field_G - this.field_C);
                } else {
                  this.a((byte) -79, this.field_G + this.field_C);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_41_0 = var5;
          stackIn_41_1 = new StringBuilder().append("vo.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void e(byte param0) {
        int var2 = null == this.field_N ? this.field_P.field_r : this.field_N.field_r + this.field_N.field_q;
        if (param0 <= 89) {
          return;
        }
        int var3 = null == this.field_J ? this.field_P.field_r + this.field_P.field_q - this.field_H.field_q : this.field_J.field_r - this.field_H.field_q;
        this.field_H.field_r = ((-var2 + var3) * this.field_G >> 16) + var2;
    }

    final void b(int param0, int param1, int param2) {
        int var5 = 0;
        int var4 = 34 % ((59 - param2) / 45);
        if (param0 >= param1) {
          this.field_H.a(91, this.field_H.field_r, this.field_H.field_v, this.field_H.field_p, this.field_P.field_q);
          this.a(false, -127);
        } else {
          var5 = param0 * this.field_P.field_q / param1;
          if (var5 < this.field_L) {
            var5 = this.field_L;
          }
          this.field_H.a(106, this.field_H.field_r, this.field_H.field_v, this.field_H.field_p, var5);
          this.a(true, -127);
        }
        this.e((byte) 100);
    }

    private final void a(int param0, boolean param1) {
        wp stackIn_3_0 = null;
        boolean stackIn_5_1 = false;
        wp stackIn_12_0 = null;
        boolean stackIn_14_1 = false;
        wp stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        wp stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        stackIn_3_0 = this.field_P;
        stackIn_5_1 = (param1) || (this.field_A);
        stackIn_3_0.field_x = stackIn_5_1;
        if (param0 != 8206) {
          return;
        }
        if (this.field_H.field_y instanceof wp) {
          stackIn_12_0 = (wp) (this.field_H.field_y);
          stackIn_14_1 = (param1) || (this.field_A);
          stackIn_12_0.field_x = stackIn_14_1;
        }
        if (null != this.field_F) {
          stackIn_18_0 = this.field_F;
          stackIn_19_1 = (!param1) ? false : true;
          stackIn_18_0.field_x = stackIn_19_1;
        }
        if (null != this.field_M) {
          stackIn_23_0 = this.field_M;
          stackIn_24_1 = (!param1) ? false : true;
          stackIn_23_0.field_x = stackIn_24_1;
        }
    }

    private final void f(int param0) {
        int var2 = null == this.field_F ? this.field_P.field_v : this.field_F.field_v + this.field_F.field_p;
        int var3 = this.field_M != null ? -this.field_H.field_p + this.field_M.field_v : -this.field_H.field_p + (this.field_P.field_p + this.field_P.field_v);
        this.field_H.field_v = ((-var2 + var3) * this.field_D >> 16) + var2;
        if (param0 != -1840) {
          this.field_P = (wp) null;
        }
    }

    final void e(boolean param0) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_N != null) {
          this.field_N.field_v = -this.field_N.field_p + this.field_p >> 1;
          this.field_N.field_r = 0;
          this.field_P.field_r = this.field_N.field_q + this.field_N.field_r;
        } else {
          this.field_P.field_r = 0;
        }
        if (null == this.field_J) {
          this.field_P.field_q = this.field_q - this.field_P.field_r;
        } else {
          this.field_J.field_r = this.field_q - this.field_J.field_q;
          this.field_J.field_v = this.field_p - this.field_J.field_p >> 1;
          this.field_P.field_q = this.field_q + (-this.field_P.field_r - this.field_J.field_q);
        }
        this.e((byte) 125);
        if (this.field_F != null) {
          this.field_F.field_v = 0;
          this.field_F.field_r = -this.field_F.field_q + this.field_q >> 1;
          this.field_P.field_v = this.field_F.field_p + this.field_F.field_v;
        } else {
          this.field_P.field_v = 0;
        }
        if (this.field_M == null) {
          this.field_P.field_p = -this.field_P.field_v + this.field_p;
        } else {
          this.field_M.field_v = -this.field_M.field_p + this.field_p;
          this.field_M.field_r = -this.field_M.field_q + this.field_q >> 1;
          this.field_P.field_p = -this.field_M.field_p + (-this.field_P.field_v + this.field_p);
        }
        this.f(-1840);
        if (!this.field_K) {
          this.field_H.field_v = 0;
          this.field_H.field_p = this.field_P.field_p;
        }
        if (!this.field_A) {
          this.field_H.field_r = 0;
          this.field_H.field_q = this.field_P.field_q;
        }
        this.field_H.c(param0);
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 < param1) {
          var4 = param2 * this.field_P.field_p / param1;
          if (var4 < this.field_R) {
            var4 = this.field_R;
          }
          this.field_H.a(-95, this.field_H.field_r, this.field_H.field_v, var4, this.field_H.field_q);
          this.a(8206, true);
        } else {
          this.field_H.a(-49, this.field_H.field_r, this.field_H.field_v, this.field_P.field_p, this.field_H.field_q);
          this.a(8206, false);
        }
        this.f(-1840);
        if (param0 < 2) {
          this.e((byte) 53);
        }
    }

    vo(int param0, int param1, int param2, int param3, mh param4, mh param5, mh param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        jh dupTemp$0 = null;
        wp dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_Q = 1024;
        this.field_R = 0;
        this.field_O = 8192;
        this.field_L = 0;
        this.field_B = true;
        this.field_E = 1024;
        this.field_D = 32768;
        this.field_C = 8192;
        this.field_G = 32768;
        try {
          this.field_x = new pk[6];
          dupTemp$0 = new jh(param0, param1, param7, param8, (mh) null, (qm) null, new wp(0, 0, param7, param8, param6, (qm) null), false, false);
          this.field_H = dupTemp$0;
          this.field_x[0] = (pk) ((Object) dupTemp$0);
          dupTemp$1 = new wp(param0, param1, param7, param8, param5, (qm) null);
          this.field_P = dupTemp$1;
          this.field_x[1] = (pk) ((Object) dupTemp$1);
          this.field_L = param9;
          this.field_R = param10;
          stackIn_4_1 = (param12);
          this.field_K = stackIn_4_1;
          stackIn_7_1 = (param11);
          this.field_A = stackIn_7_1;
          this.b(param13, (byte) 7);
          this.a(0, param14);
          this.a(96, param0, param1, param3, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("vo.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    private final int h(int param0) {
        int var2 = 57 % ((param0 + 47) / 43);
        return (this.field_H.field_p << 16) / this.field_P.field_p;
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.a(param0, param1, (byte) 27, param3)) {
            return true;
          }
          if (this.field_B &&
            this.field_H.d(-1)) {
            if (param3 == 98) {
              this.a(this.field_D - this.field_E, (byte) -125);
              return true;
            }
            if (param3 == 99) {
              this.a(this.field_E + this.field_D, (byte) -125);
              return true;
            }
            if (param3 == 96) {
              this.a((byte) -124, -this.field_Q + this.field_G);
              return true;
            }
            if (param3 == 97) {
              this.a((byte) -122, this.field_G + this.field_Q);
              return true;
            }
            if (param3 == 104) {
              this.a(this.field_D - this.h(123), (byte) -125);
              return true;
            }
            if (param3 == 105) {
              this.a(this.field_D + this.h(-111), (byte) -125);
              return true;
            }
            if (param3 == 102) {
              if (this.field_K &&
                hw.field_b[82]) {
                this.a(0, (byte) -125);
                return true;
              }
              if (this.field_A) {
                this.a((byte) 123, 0);
                return true;
              }
            } else {
              if (103 == param3) {
                if (this.field_K &&
                  hw.field_b[82]) {
                  this.a(65536, (byte) -125);
                  return true;
                }
                if (this.field_A) {
                  this.a((byte) 123, 65536);
                  return true;
                }
              }
            }
          }
          if (param2 <= 9) {
            this.a(true, 89);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_50_0 = var5;
          stackIn_50_1 = new StringBuilder().append("vo.KA(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_I = -1;
    }
}
