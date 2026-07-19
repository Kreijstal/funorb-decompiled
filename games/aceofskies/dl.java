/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends rb {
    static jb field_p;
    private int field_q;
    private fc field_l;
    static pa[] field_n;
    static long field_o;
    static vd[] field_m;

    public static void l(byte param0) {
        field_m = null;
        field_n = null;
        field_p = null;
        if (param0 <= 91) {
            dl.l((byte) -94);
        }
    }

    final void g(int param0, int param1) {
        int fieldTemp$2 = 0;
        if (param0 < 35) {
          return;
        } else {
          fieldTemp$2 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$2] = (byte)(this.field_l.b(256) + param1);
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                field_o = 102L;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (param1 <= var5_int) {
                break L0;
              } else {
                fieldTemp$5 = this.field_g;
                this.field_g = this.field_g + 1;
                param0[param2 + var5_int] = (byte)(this.field_f[fieldTemp$5] + -this.field_l.b(256));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("dl.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void j(int param0) {
        this.field_q = 8 * this.field_g;
        int var2 = -79 / ((-15 - param0) / 44);
    }

    final void m(byte param0) {
        this.field_g = (this.field_q + 7) / 8;
        if (param0 <= 33) {
            field_n = (pa[]) null;
        }
    }

    dl(byte[] param0) {
        super(param0);
    }

    final static String k(byte param0) {
        String discarded$2 = null;
        String discarded$3 = null;
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var6 = "(" + ga.field_l + " " + kg.field_b + " " + hi.field_w + ") " + qs.field_b;
        var1 = var6;
        if (ag.field_s > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (ag.field_s > var2) {
              L1: {
                var7 = var1 + ' ';
                var3 = nm.field_c.field_f[var2] & 255;
                var4 = var3 >> 1380495364;
                if (var4 >= 10) {
                  var4 += 55;
                  break L1;
                } else {
                  var4 += 48;
                  break L1;
                }
              }
              L2: {
                var3 = var3 & 15;
                if (-11 >= (var3 ^ -1)) {
                  var3 += 55;
                  break L2;
                } else {
                  var3 += 48;
                  break L2;
                }
              }
              var8 = var7 + (char)var4;
              var1 = var8 + (char)var3;
              var2++;
              continue L0;
            } else {
              if (param0 != 65) {
                discarded$2 = dl.k((byte) -78);
                return var1;
              } else {
                return var1;
              }
            }
          }
        } else {
          if (param0 != 65) {
            discarded$3 = dl.k((byte) -78);
            return var1;
          } else {
            return var1;
          }
        }
    }

    final void a(boolean param0, int[] param1) {
        try {
            if (!param0) {
                int[] var4 = (int[]) null;
                this.a(true, (int[]) null);
            }
            this.field_l = new fc(param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "dl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dl(int param0) {
        super(param0);
    }

    final int j(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 > -1) {
          field_p = (jb) null;
          fieldTemp$4 = this.field_g;
          this.field_g = this.field_g + 1;
          return 255 & this.field_f[fieldTemp$4] - this.field_l.b(256);
        } else {
          fieldTemp$5 = this.field_g;
          this.field_g = this.field_g + 1;
          return 255 & this.field_f[fieldTemp$5] - this.field_l.b(256);
        }
    }

    final int b(byte param0, int param1) {
        int incrementValue$0 = 0;
        int var7 = AceOfSkies.field_G ? 1 : 0;
        int var3 = this.field_q >> 947512803;
        int var4 = 8 - (this.field_q & 7);
        int var6 = 97 / ((17 - param0) / 60);
        this.field_q = this.field_q + param1;
        int var5 = 0;
        while (param1 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((kp.field_f[var4] & this.field_f[incrementValue$0]) << param1 + -var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 == var4) {
            var5 = var5 + (kp.field_f[var4] & this.field_f[var3]);
        } else {
            var5 = var5 + (this.field_f[var3] >> -param1 + var4 & kp.field_f[param1]);
        }
        return var5;
    }

    static {
        field_p = new jb();
    }
}
