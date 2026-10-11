/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dv implements ap {
    dn field_d;
    static je field_m;
    String field_c;
    static RgbSprite field_k;
    static String field_i;
    static String field_g;
    je field_s;
    static String field_r;
    private NodeDeque field_j;
    BitmapFont field_t;
    private int field_l;
    dp field_o;
    private je field_q;
    private String[] field_e;
    private boolean field_f;
    private int field_n;
    private rq field_b;
    private String field_h;
    private int field_p;
    private int field_a;

    private final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        je var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_d.field_Jb.a(this.a(param0, param1, (byte) -68), param2 + 368);
          if (~this.field_d.field_Jb.field_fb.b(false) < param2) {
            this.field_d.field_Jb.field_fb.a(0);
          }
          var4_int = 5;
          var5 = (je) (this.field_d.field_Jb.field_fb.first((byte) 107));
          while (var5 != null) {
            var5.field_ab = var4_int;
            var4_int = var4_int + this.field_l;
            var5 = (je) (this.field_d.field_Jb.field_fb.next((byte) 123));
          }
          this.field_d.field_Jb.field_ob = var4_int;
          this.field_d.field_Jb.field_ab = this.field_d.field_ob - var4_int;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "dv.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    abstract boolean a(String param0, boolean param1);

    final static String a(String param0, int param1, String param2, String param3) {
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4 = param0.indexOf(param2);
        if (param1 > -45) {
          field_g = (String) null;
        }
        while (-1 != var4) {
          param0 = param0.substring(0, var4) + param3 + param0.substring(var4 + param2.length());
          var4 = param0.indexOf(param2, param3.length() + var4);
        }
        return param0;
    }

    void b(int param0) {
        int var6 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        if (!(this.field_q.field_ob + this.field_q.field_ab <= 0)) {
          SoftwareRaster.b(this.field_q.field_V, this.field_q.field_D, this.field_d.field_S, this.field_q.field_ob, 5592405, 230);
          SoftwareRaster.b(this.field_d.field_gb + this.field_d.field_V, this.field_q.field_D, this.field_d.field_S, this.field_q.field_ob, 5592405, 230);
          SoftwareRaster.b(this.field_d.field_V, this.field_q.field_D, this.field_d.field_gb, this.field_d.field_ab, 5592405, 230);
          SoftwareRaster.b(this.field_d.field_V, this.field_d.field_ob + this.field_d.field_D, this.field_d.field_gb, this.field_o.field_D + (-this.field_d.field_D - this.field_d.field_ob), 5592405, 230);
          SoftwareRaster.b(this.field_d.field_V, this.field_o.field_ob + this.field_o.field_D, this.field_d.field_gb, -this.field_o.field_ob + this.field_q.field_ob - this.field_o.field_ab, 5592405, 230);
          SoftwareRaster.b(this.field_d.field_V, this.field_d.field_D, this.field_d.field_gb, this.field_d.field_ob, 2236962, 240);
          SoftwareRaster.b(this.field_o.field_V, this.field_o.field_D, this.field_o.field_gb, this.field_o.field_ob, 2236962, 240);
          var2 = this.field_q.field_ab + 256;
          if (var2 < 0) {
            var2 = 0;
          }
          SoftwareRaster.b(this.field_q.field_V, this.field_q.field_D + this.field_q.field_ob, this.field_q.field_gb, -this.field_q.field_ob + (-this.field_q.field_D + dt.field_a), 0, var2 >> 1);
          var3 = 5 + this.field_q.field_ab + this.field_q.field_ob;
          for (var4 = 0; var4 < 6; var4++) {
            SoftwareRaster.e(0, var3, bn.field_b, 0, var4 << 5);
            var3--;
          }
          this.field_q.b(0 == (8 & this.field_n) ? true : false, 20);
        }
        var2Lifetime1 = 126 / ((13 - param0) / 33);
        if (this.field_e != null &&
          this.field_f) {
          var3Lifetime1 = this.field_q.field_ob + this.field_q.field_ab;
          this.field_s.field_ab = var3Lifetime1;
          this.field_s.b(false, 20);
          var3Lifetime1 = var3Lifetime1 + (this.field_l + 5);
          var6 = 0;
          var4Lifetime1 = var6;
          while (this.field_e.length > var6) {
            this.field_t.b(this.field_e[var6], 10 + this.field_s.field_V, var3Lifetime1, 13421772, -1);
            var3Lifetime1 = var3Lifetime1 + this.field_l;
            var6++;
          }
        }
    }

    abstract void a(byte param0);

    private final je a(byte param0, int param1) {
        int var4 = -63 % ((param0 + 36) / 61);
        je var3 = new je(0L, (je) null);
        var3.field_G = ak.b(param1, 5);
        return var3;
    }

    public static void c(byte param0) {
        field_k = null;
        field_r = null;
        field_m = null;
        int var1 = -8 % ((-2 - param0) / 34);
        field_g = null;
        field_i = null;
    }

    private final void a(String param0, int param1) {
        rq var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (rq) (this.field_j.first((byte) 90));
          if (var3 == null ||
            !param0.equals(var3.field_l)) {
            this.field_j.a(750, new rq(param0));
          }
          if (param1 < 37) {
            this.field_d = (dn) null;
          }
          if (this.field_j.b(false) > 30) {
            this.field_j.c((byte) -123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("dv.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, boolean param1) {
        int var4 = 0;
        int var3;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_f &&
          this.field_p > 0) {
          this.field_p = this.field_p - 1;
          this.field_q.field_ab = -200 * (this.field_p * this.field_p) / 225;
        } else {
          if (!this.field_f &&
            this.field_q.field_ab + 200 > 0) {
            this.field_q.field_ab = this.field_q.field_ab - 28;
          }
        }
        if (!this.field_o.q(0).equals(this.field_h) ||
          this.field_o.o(93) != this.field_a) {
          this.field_h = this.field_o.q(0);
          this.field_a = this.field_o.o(-29);
          this.field_e = this.b(true);
          if (null != this.field_e &&
            this.field_e.length == 0) {
            this.field_e = null;
          }
          if (null != this.field_e) {
            var3 = 0;
            for (var4 = 0; var4 < this.field_e.length; var4++) {
              var5 = this.field_t.a(this.field_e[var4]);
              if (var3 < var5) {
                var3 = var5;
              }
            }
            this.field_s.field_gb = var3 + 20;
            this.field_s.field_ob = 15 + this.field_e.length * this.field_l;
          }
        }
        this.field_n = this.field_n + 1;
        if (param0 > -58) {
          return;
        }
        this.field_q.a(true, param1);
        this.field_d.a(this.field_l, true, el.field_d * (2 * this.field_l), false);
        this.field_o.m(0);
    }

    final static void a(boolean param0) {
        int var2;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if ((rd.field_j.battlefield.field_C & 1 << rd.field_j.field_q) != 0) {
          il.field_t[10] = np.field_Jb;
        } else {
          if ((~rd.field_j.battlefield.field_e & rd.field_j.battlefield.field_C) == 0) {
            il.field_t[10] = uu.field_c;
          } else {
            il.field_t[10] = dm.field_O;
          }
        }
        if (!param0) {
          field_i = (String) null;
        }
    }

    private final void a(String param0, int param1, int param2) {
        int var7 = 0;
        int var4_int = 0;
        String[] var5 = null;
        String[] var6 = null;
        String var8 = null;
        NodeDeque var9 = null;
        rq var10 = null;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = -10 + (this.field_d.field_gb - 15);
          var5 = dj.a(-100, '\n', param0);
          var6 = var5;
          if (param2 > -25) {
            return;
          }
          for (var7 = 0; var6.length > var7; var7++) {
            var8 = var6[var7];
            if (var4_int <= this.field_t.a(var8)) {
              var9 = this.a(var8, var4_int, (byte) -98);
              var10 = (rq) (var9.first((byte) 123));
              while (var10 != null) {
                this.a(param1, var10.field_l, -257);
                var10 = (rq) (var9.next((byte) 123));
              }
            } else {
              this.a(param1, var8, -257);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("dv.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final NodeDeque a(String param0, int param1, byte param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        NodeDeque stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        NodeDeque var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != -98) {
            this.field_h = (String) null;
          }
          var4 = new NodeDeque();
          while (param0 != null) {
            boolean decompiledFrameRemainder0 = true;
            var5 = this.field_t.a(param0);
            var6 = param0;
            if (param1 < var5) {
              var7 = -1 + param0.length();
              while (var7 > 0) {
                if (var5 > param1 ||
                  param0.charAt(var7) != 32) {
                  incrementValue$0 = var7;
                  var7--;
                  var5 = var5 - this.field_t.a(param0.charAt(incrementValue$0));
                  continue;
                }
                break;
              }
              if (var7 == 0) {
                var5 = this.field_t.a(param0);
                var7 = param0.length() - 1;
                while (param1 < var5) {
                  incrementValue$1 = var7;
                  var7--;
                  var5 = var5 - this.field_t.a(param0.charAt(incrementValue$1));
                }
              }
              var6 = param0.substring(0, var7);
              param0 = param0.substring(1 + var7);
              decompiledFrameRemainder0 = false;
            }
            else {
              param0 = null;
            }
            var4.a((byte) -119, (IntrusiveNode) (new rq(var6)));
          }
          stackIn_21_0 = var4;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_24_0 = var4_ref;
          stackIn_24_1 = new StringBuilder().append("dv.N(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final je a(int param0, int param1, int param2) {
        je var4 = new je(0L, (je) null);
        var4.field_G = tn.a(true, param1, param2);
        if (param0 != 5592405) {
          this.field_d = (dn) null;
        }
        return var4;
    }

    final void a(Object param0, int param1) {
        try {
          int var3_int = 43 % ((45 - param1) / 56);
          this.a(-1, param0 == null ? "null" : param0.toString());
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "dv.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final je a(int param0, String param1, byte param2) {
        je var4 = null;
        RuntimeException var4_ref = null;
        je stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -68) {
            field_k = (RgbSprite) null;
          }
          var4 = new je(0L, (je) null, param1);
          var4.field_N = param0;
          var4.field_Z = this.field_t;
          var4.a(this.field_l, -20500, this.field_t.a(var4.field_X), 0, 5);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("dv.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        if (param0 != -31501) {
          return false;
        }
        return this.field_f;
    }

    final void a(int param0, String param1) {
        try {
          this.a(param1, 13421772, param0 ^ 90);
          if (param0 != -1) {
            this.field_a = 92;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "dv.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String[] b(boolean param0);

    private final void b(byte param0) {
        boolean stackIn_3_1 = false;
        stackIn_3_1 = !(this.field_f);
        this.field_f = stackIn_3_1;
        if (!this.field_f) {
          if (null != this.field_q) {
            this.field_q.b(3, (je) null);
          }
        } else {
          this.field_p = 15;
          if (this.field_q != null) {
            this.field_q.b(~param0, this.field_o);
          }
        }
        if (param0 != -4) {
          field_r = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param3 != -66) {
          return;
        }
        if (param15 > param0) {
          if (param8 > param15) {
            TelepopEvent.a(SoftwareRaster.field_d, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
          } else {
            if (param8 > param0) {
              TelepopEvent.a(SoftwareRaster.field_d, param5, param12, param13, param4, param9, param10, param1, param6, param14, param8, param15, param11, true, param2, param0, param7);
            } else {
              TelepopEvent.a(SoftwareRaster.field_d, param1, param4, param13, param12, param9, param6, param5, param10, param14, param0, param15, param2, true, param11, param8, param7);
            }
          }
        } else {
          if (param8 <= param0) {
            if (param8 > param15) {
              TelepopEvent.a(SoftwareRaster.field_d, param9, param12, param4, param13, param5, param10, param1, param7, param2, param8, param0, param11, true, param14, param15, param6);
            } else {
              TelepopEvent.a(SoftwareRaster.field_d, param1, param13, param4, param12, param5, param7, param9, param10, param2, param15, param0, param14, true, param11, param8, param6);
            }
          } else {
            TelepopEvent.a(SoftwareRaster.field_d, param9, param4, param12, param13, param1, param6, param5, param7, param11, param0, param8, param2, true, param14, param15, param10);
          }
        }
    }

    boolean a(int param0, char param1, int param2) {
        IntrusiveNode stackIn_25_1 = null;
        je var5;
        int var6;
        String var7;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != -30847) {
          dv.a(false);
        }
        if (96 == param1) {
          this.b((byte) -4);
          return true;
        }
        if (!this.field_f) {
          return false;
        }
        if (84 != param2) {
          if (98 == param2) {
            if (null == this.field_b ||
              this.field_b.next != this.field_j.sentinel) {
              if (this.field_b == null) {
                stackIn_25_1 = this.field_j.first((byte) 119);
              } else {
                stackIn_25_1 = this.field_b.next;
              }
              this.field_b = (rq) (stackIn_25_1);
              if (this.field_b != null) {
                this.field_o.a(this.field_b.field_l, (byte) 45);
              }
            }
          } else {
            if (param2 == 99) {
              if (this.field_b != null &&
                this.field_j.sentinel != this.field_b.previous) {
                this.field_b = (rq) (this.field_b.previous);
                this.field_o.a(this.field_b.field_l, (byte) 45);
              }
            } else {
              if (80 == param2) {
                this.a((byte) 122);
              } else {
                this.field_o.a(param2, param0 + 4721, param1);
              }
            }
          }
        } else {
          var7 = this.field_o.q(0);
          if (var7.length() <= 0) {
            return true;
          }
          this.a(this.field_c + var7, 5635925, param0 + 30734);
          var5 = (je) (this.field_d.field_Jb.field_fb.d((byte) -81));
          if (!this.a(var7, true)) {
            var5.field_N = 16733525;
          }
          this.field_o.a(true);
          this.a(var7, param0 + 30943);
          this.field_b = null;
        }
        return true;
    }

    private final je a(boolean param0, int param1) {
        je var3 = new je();
        var3.field_G = tn.a(param0, 0, param1);
        return var3;
    }

    dv(BitmapFont param0, hd param1) {
        int var3_int = 0;
        je var4 = null;
        je var5 = null;
        je var6 = null;
        je var7 = null;
        je var8 = null;
        je var9 = null;
        je var10 = null;
        je var11 = null;
        je var12 = null;
        ll var13 = null;
        je var14 = null;
        je var15 = null;
        this.field_c = "# ";
        this.field_j = new NodeDeque();
        this.field_e = null;
        this.field_f = false;
        this.field_n = 0;
        this.field_p = 0;
        try {
          this.field_t = param0;
          this.field_l = this.field_t.field_H + this.field_t.field_L;
          var3_int = this.field_l + 4;
          var4 = this.a(true, 65793);
          var5 = var4;
          var6 = var4;
          var7 = var4;
          var8 = this.a(5592405, 7829367, 2236962);
          var9 = this.a(5592405, 65793, 65793);
          var10 = this.a(5592405, 3355443, 65793);
          var11 = this.a((byte) 71, 2263074);
          var12 = this.a(5592405, 2236962, 65793);
          this.field_q = new je(0L, var5);
          this.field_q.a(200, -20500, bn.field_b, -200, 0);
          var13 = new ll(0L, var8, var8, var9, var10);
          var14 = new je();
          var14.field_fb = new NodeDeque();
          this.field_d = new dn(0L, var14, var6, var13);
          this.field_d.field_Jb.field_fb = new NodeDeque();
          this.field_d.a(5, false, this.field_q.field_gb - 10, 0, 15, 5, 185 - var3_int);
          this.field_q.a(this.field_d, 71);
          var15 = new je();
          var15.field_Z = this.field_t;
          var15.field_N = 13421772;
          var15.field_F = 5;
          var15.field_z = 2;
          this.field_o = new dp(0L, var7, var11, var15);
          this.field_o.b(this.field_d.field_ab - (-this.field_d.field_ob - 5), 0, this.field_d.field_gb, var3_int, this.field_d.field_S);
          this.field_o.a(param1, 176);
          this.field_q.a(this.field_o, 87);
          this.field_s = new je(0L, var12);
          this.field_s.field_S = 0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "dv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Discard";
        field_i = "Mana";
        field_g = "0.0";
        field_k = null;
    }
}
