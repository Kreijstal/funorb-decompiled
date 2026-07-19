/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends hs implements he {
    static int field_J;
    private no field_M;
    static int field_L;
    private fw field_K;

    final void a(int param0, int param1, byte param2, int param3) {
        kb var6 = null;
        super.a(param0, param1, (byte) -114, param3);
        if (param2 >= -82) {
          var6 = (kb) null;
          this.a(51, -1, -80, (kb) null);
          gl.field_e.b(mq.field_Nb, param0 - (-this.field_B + -4), 4 + (param1 + this.field_p) - -gl.field_e.field_H, 16777215, -1);
          return;
        } else {
          gl.field_e.b(mq.field_Nb, param0 - (-this.field_B + -4), 4 + (param1 + this.field_p) - -gl.field_e.field_H, 16777215, -1);
          return;
        }
    }

    wr(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (kh) null);
        this.field_M = new no(new lu(10000536), c.field_c, 0, 0, 140, 25);
        this.field_M.a((byte) -101, new sb());
        this.field_K = new fw(ro.field_kb, (qo) (this));
        this.field_C = new kb[]{(kb) ((Object) this.field_M), (kb) ((Object) this.field_K)};
        this.field_K.field_k = (kh) ((Object) new nu());
        this.e(0);
    }

    final void d(byte param0) {
        int var2 = 0;
        var2 = 250;
        if (param0 < 84) {
          this.field_M = (no) null;
          this.field_M.a(-var2 + this.field_l >> 1614630337, 140, -25 + (this.field_w - -20) >> -802366399, 8192, 25);
          this.field_K.a(10 + ((-var2 + this.field_l >> -2077435391) - -140), 100, 2 + (-30 + this.field_w + 20 >> 1107692097), 8192, 30);
          return;
        } else {
          this.field_M.a(-var2 + this.field_l >> 1614630337, 140, -25 + (this.field_w - -20) >> -802366399, 8192, 25);
          this.field_K.a(10 + ((-var2 + this.field_l >> -2077435391) - -140), 100, 2 + (-30 + this.field_w + 20 >> 1107692097), 8192, 30);
          return;
        }
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            bw.field_g = true;
            vu.field_Q.field_X = param1;
            var2_int = so.field_b.field_a;
            var3 = so.field_b.field_g;
            var4 = vu.field_Q.field_Z.a(param1, 272, vu.field_Q.field_pb);
            var5 = -(var4 / 2) + var3 / 2 - 103;
            if (param0 < 27) {
                field_J = -20;
            }
            qc.field_c.a(-(var5 * 2) + (-120 + var3), -20500, 320, var5, (var2_int + -320) / 2);
            qc.field_c.field_G = tq.a(11579568, false, qc.field_c.field_ob, 2105376, 3, 8421504);
            vu.field_Q.a(-20 + (qc.field_c.field_ob - 24), -20500, qc.field_c.field_gb + -48, 16, 24);
            td.field_g.a(24, -20500, 80, qc.field_c.field_ob + -20 - 24, 120);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wr.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (!(this.field_M.a(-918933630).a(false) == oo.field_g)) {
            return;
        }
        if (param1 != 11) {
            return;
        }
        try {
            ak.a(this.field_M.l(param1 ^ 35), this.field_M.m(-26458), this.field_M.a((byte) -77), 30);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wr.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 == 95) {
          if (param0 != 32) {
            if (param0 != 40) {
              if (param0 == 41) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_K.field_I = this.field_M.a(-918933630).a(false) == oo.field_g ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wr.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, aj param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        bv var8 = null;
        bv var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var8 = vl.field_n;
            var9 = var8;
            var9.h(32161, param2);
            var9.field_q = var9.field_q + 1;
            var4 = var9.field_q;
            var9.b(1, 1);
            var9.b(true, param1.field_s);
            var9.b(true, param1.field_n);
            var9.b(true, param1.field_q);
            var9.a((byte) -99, param1.field_k);
            var9.a((byte) -92, param1.field_m);
            var9.a((byte) -103, param1.field_o);
            var9.a((byte) -62, param1.field_r);
            var9.b(1, param1.field_l.length);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= param1.field_l.length) {
                    break L3;
                  } else {
                    var8.a((byte) -70, param1.field_l[var5]);
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 < -26) {
                    break L4;
                  } else {
                    var7 = (aj) null;
                    wr.a((byte) -126, (aj) null, 112);
                    break L4;
                  }
                }
                discarded$1 = var9.b((byte) -39, var4);
                var9.e(var9.field_q + -var4, 5930);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("wr.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    static {
    }
}
