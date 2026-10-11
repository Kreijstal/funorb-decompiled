/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    private int field_d;
    private int[] field_p;
    static String field_x;
    private int field_l;
    private int field_s;
    private int field_c;
    private ea field_r;
    static String field_e;
    private MinerDisturbance field_q;
    private int field_b;
    static bd field_t;
    private int field_f;
    private int[] field_g;
    static String field_z;
    static ea field_u;
    private boolean[] field_i;
    private int[] field_j;
    private int field_y;
    private ea field_h;
    boolean field_o;
    private int field_n;
    private int field_k;
    private int field_a;
    static ta field_m;
    private int field_v;
    static int field_w;

    private final void a(int param0, byte param1, int param2) {
        int stackIn_63_1 = 0;
        boolean stackIn_80_0 = false;
        int stackIn_102_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_135_2 = 0;
        boolean[] stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        boolean stackIn_138_2 = false;
        int var4;
        int var5;
        boolean[] var5_ref_boolean__;
        boolean[] var6;
        boolean[] var7;
        boolean[] var8;
        boolean[] var9;
        int var10;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime1Lifetime1;
        var10 = MinerDisturbance.field_ab;
        var4 = 0;
        if (param2 == -3) {
          this.field_q.a(3, 0);
          this.field_o = true;
          jc.a((0 != param0), param1 - 140, 4);
          return;
        }
        if (param2 == -5) {
          if (this.field_f == 0 &&
            !this.a(-7)) {
            for (var5 = 0; var5 < 21; var5++) {
              bn.field_b[var5] = qe.field_b[var5];
            }
            this.field_o = true;
            ke.field_V = true;
            this.field_q.h((byte) 78);
            wm.a(false);
            return;
          }
          this.field_y = 100;
          return;
        }
        if (param2 == -2) {
          this.field_j[21] = 2;
          if (ah.field_f != 0) {
            if (qe.field_b[2] &&
              qe.field_b[0] &&
              qe.field_b[16] &&
              qe.field_b[7] &&
              qe.field_b[6] &&
              qe.field_b[3]) {
              var5_ref_boolean__ = qe.field_b;
              var6 = qe.field_b;
              var7 = qe.field_b;
              var8 = qe.field_b;
              qe.field_b[3] = false;
              var9 = qe.field_b;
              this.field_j[0] = 2;
              this.field_f = 6;
              this.field_j[6] = 2;
              var5_ref_boolean__[2] = false;
              var8[7] = false;
              this.field_j[16] = 2;
              var4 = 1;
              this.field_j[2] = 2;
              var6[0] = false;
              var9[6] = false;
              this.field_j[7] = 2;
              this.field_j[3] = 2;
              var7[16] = false;
              ne.a(2, param1 + 76);
              return;
            }
          } else {
            if (this.field_f == 0 &&
              qe.field_b[2] &&
              qe.field_b[0] &&
              qe.field_b[3] &&
              qe.field_b[7] &&
              qe.field_b[6]) {
              var5_ref_boolean__ = qe.field_b;
              var6 = qe.field_b;
              var7 = qe.field_b;
              qe.field_b[6] = false;
              var8 = qe.field_b;
              this.field_j[2] = 2;
              this.field_f = 5;
              var8[7] = false;
              this.field_j[3] = 2;
              var6[0] = false;
              this.field_j[6] = 2;
              this.field_j[7] = 2;
              var5_ref_boolean__[2] = false;
              this.field_j[0] = 2;
              var4 = 1;
              var7[3] = false;
              ne.a(2, 39);
              return;
            }
          }
          if (!qe.field_b[3]) {
            this.field_j[3] = 2;
          }
          if (!qe.field_b[2]) {
            this.field_j[2] = 2;
          }
          if (!qe.field_b[6]) {
            this.field_j[6] = 2;
          }
          if (!qe.field_b[7]) {
            this.field_j[7] = 2;
          }
          if (!qe.field_b[0]) {
            this.field_j[0] = 2;
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 21; var5Lifetime1++) {
            if (var5Lifetime1 != 0 &&
              2 != var5Lifetime1 &&
              var5Lifetime1 != 6 &&
              var5Lifetime1 != 7 &&
              3 != var5Lifetime1 && (ah.field_f != 1 ||
              var5Lifetime1 != 16) && qe.field_b[var5Lifetime1]) {
              this.field_j[var5Lifetime1] = 2;
              qe.field_b[var5Lifetime1] = false;
              this.field_f = this.field_f + this.field_g[var5Lifetime1];
            }
          }
          kj.a(1, param1 - 22174);
          qe.field_b[7] = true;
          qe.field_b[2] = true;
          qe.field_b[3] = true;
          qe.field_b[0] = true;
          if (ah.field_f == 1) {
            stackIn_63_1 = 6;
          } else {
            stackIn_63_1 = 5;
          }
          this.field_f = stackIn_63_1;
          if (ah.field_f == 1) {
            if (!qe.field_b[16]) {
              this.field_j[16] = 2;
            }
            qe.field_b[16] = true;
          }
          qe.field_b[6] = true;
          for (var5Lifetime1Lifetime1 = 0; 21 > var5Lifetime1Lifetime1; var5Lifetime1Lifetime1++) {
            if (qe.field_b[var5Lifetime1Lifetime1]) {
              this.field_f = this.field_f - this.field_g[var5Lifetime1Lifetime1];
            }
          }
        } else {
          if (-4 != param2) {
            param2 = nb.field_g[ah.field_f][param2];
          } else {
            stackIn_80_0 = !(sc.field_b);
            sc.field_b = stackIn_80_0;
            d.field_c = true;
          }
        }
        if (param1 != 18) {
          this.a(-119, -15, -28, 91);
        }
        if (0 <= param2 &&
          21 > param2) {
          stackIn_102_0 = (this.field_g[param2] > this.field_f) ? 0 : 1;
          var5Lifetime2 = stackIn_102_0;
          if (param2 == 2 &&
            qe.field_b[19]) {
            this.field_j[19] = 2;
            var5Lifetime2 = 1;
            qe.field_b[19] = false;
            this.field_f = this.field_f + this.field_g[19];
          } else if (19 == param2 &&
            qe.field_b[2] &&
            this.field_f + this.field_g[2] >= this.field_g[19]) {
            var5Lifetime2 = 1;
            this.field_j[2] = 2;
            qe.field_b[2] = false;
            this.field_f = this.field_f + this.field_g[2];
          } else if (0 == param2 &&
            qe.field_b[1]) {
            this.field_j[1] = 2;
            var5Lifetime2 = 1;
            qe.field_b[1] = false;
            this.field_f = this.field_f + this.field_g[1];
          } else if (param2 == 1 &&
            qe.field_b[0] &&
            this.field_g[1] <= this.field_g[0] + this.field_f) {
            qe.field_b[0] = false;
            var5Lifetime2 = 1;
            this.field_j[0] = 2;
            this.field_f = this.field_f + this.field_g[0];
          } else {
            if (param2 == 12) {
              if (!qe.field_b[12]) {
                if (var5Lifetime2 != 0) {
                  kj.a(ne.a(false) * 2, -22156);
                }
              } else {
                kj.a(ne.a(false) / 2, -22156);
              }
            } else {
              if (param2 == 13) {
                if (!qe.field_b[13]) {
                  if (var5Lifetime2 != 0) {
                    kj.a(3 * ne.a(false), -22156);
                  }
                } else {
                  kj.a(ne.a(false) / 3, -22156);
                }
              }
            }
          }
          if (var5Lifetime2 != 0 ||
            qe.field_b[param2]) {
            stackIn_134_1 = this.field_f;
            if (qe.field_b[param2]) {
              stackIn_135_2 = this.field_g[param2];
            } else {
              stackIn_135_2 = -this.field_g[param2];
            }
            this.field_f = stackIn_134_1 + stackIn_135_2;
            var4 = 1;
            stackIn_137_0 = qe.field_b;
            stackIn_137_1 = param2;
            stackIn_138_2 = !(qe.field_b[param2]);
            stackIn_137_0[stackIn_137_1] = stackIn_138_2;
          }
          if (var4 != 0) {
            this.field_j[param2] = 2;
          }
        }
        ne.a(2, 63);
    }

    private final void a(boolean param0, byte param1, String param2, int param3, boolean param4, boolean param5, boolean param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vm var13 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        var12 = MinerDisturbance.field_ab;
        try {
          var13 = mm.field_a;
          var10 = this.field_v + param7;
          if (!param5) {
            var13.a(param2, var10 - 2, param3 + var13.field_I, 2829610, -1);
            var13.a(param2, var10 + 2, param3 + var13.field_I, 2829610, -1);
            var13.a(param2, var10, param3 + var13.field_I - 2, 2829610, -1);
            var13.a(param2, var10, var13.field_I + (param3 + 2), 2829610, -1);
            var13.a(param2, var10 - 1, var13.field_I + param3 - 1, 2829610, -1);
            var13.a(param2, 1 + var10, var13.field_I + param3 - 1, 2829610, -1);
            var13.a(param2, -1 + var10, var13.field_I + param3 + 1, 2829610, -1);
            var13.a(param2, 1 + var10, param3 - (-var13.field_I - 1), 2829610, -1);
          } else {
            var11 = 3355443;
            var13.a(param2, var10 - 2, var13.field_I + param3, var11, -1);
            var13.a(param2, var10 + 2, param3 + var13.field_I, var11, -1);
            var13.a(param2, var10, -2 + (var13.field_I + param3), var11, -1);
            var13.a(param2, var10, 2 + var13.field_I + param3, var11, -1);
            var13.a(param2, var10 - 1, var13.field_I + (param3 - 1), var11, -1);
            var13.a(param2, var10 + 1, param3 + (var13.field_I - 1), var11, -1);
            var13.a(param2, var10 - 1, 1 + (param3 + var13.field_I), var11, -1);
            var13.a(param2, 1 + var10, param3 - (-var13.field_I - 1), var11, -1);
          }
          if (param1 >= -97) {
            this.field_p = (int[]) null;
          }
          if (!param4 &&
            !param0) {
            if (!param5) {
              var13.a(param2, var10, var13.field_I + param3, 16437248, -1);
              return;
            }
            var13.a(param2, var10, var13.field_I + param3, 6776679, -1);
            return;
          }
          if (!param5) {
            var13.a(param2, var10, var13.field_I + param3, 15884837, -1);
          } else {
            if (param6) {
              var13.a(param2, var10, var13.field_I + param3, 13963537, -1);
            } else {
              var13.a(param2, var10, param3 + var13.field_I, 14013909, -1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_20_0 = var9;
          stackIn_20_1 = new StringBuilder().append("mc.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void c(int param0) {
        int var1;
        int var2;
        var2 = MinerDisturbance.field_ab;
        if (param0 > -68) {
          return;
        }
        wc.field_b = false;
        ic.field_i = null;
        if (gd.field_B) {
          sj.field_h.i((byte) -97);
        } else {
          var1 = a.field_d;
          if (var1 > 0) {
            if (1 != var1) {
              ic.field_i = oa.a((byte) -99, pb.field_A, new String[]{Integer.toString(var1)});
            } else {
              ic.field_i = qg.field_g;
            }
            ic.field_i = in.a(new CharSequence[]{(CharSequence) ((Object) ic.field_i), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) eb.field_a)}, -1);
          }
          sj.field_h.s(2121792);
          pb.a(53);
        }
    }

    private final boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = MinerDisturbance.field_ab;
        if (param0 != -7) {
          field_t = (bd) null;
        }
        var2 = 0;
        for (var3 = 0; var3 < 21; var3++) {
          if (qe.field_b[var3]) {
            var2 = var2 + this.field_g[var3];
          }
        }
        if (qe.field_b[12] &&
          qe.field_b[13]) {
          if (ne.a(false) != 6) {
            kj.a(6, -22156);
          }
        } else {
          if (!qe.field_b[12]) {
            if (qe.field_b[13] &&
              ne.a(false) != 3) {
              kj.a(3, -22156);
            }
          } else {
            if (2 != ne.a(false)) {
              kj.a(2, param0 ^ 22157);
            }
          }
        }
        if (ah.field_f == 0) {
          return (var2 != 5);
        }
        if (ah.field_f != 1) {
          return false;
        }
        return (var2 != 6);
    }

    private final void a(int param0, boolean param1, String param2, int param3, byte param4, boolean param5) {
        try {
          this.a(false, (byte) -103, param2, param0, param1, param5, false, param3);
          if (param4 != -66) {
            this.a(70, 121, 47, -17);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "mc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        field_x = null;
        field_u = null;
        field_m = null;
        if (param0 != -43) {
          mc.a((byte) -122);
        }
        field_t = null;
        field_z = null;
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var14 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_80_0 = false;
        int stackIn_81_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_110_0 = 0;
        boolean[] stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        boolean stackIn_123_2 = false;
        boolean[] stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        boolean stackIn_131_2 = false;
        int stackIn_204_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        var17 = MinerDisturbance.field_ab;
        if (this.field_o) {
          this.field_v = this.field_v - 32;
          if (this.field_v < -640) {
            this.field_q.field_Q = null;
            if (ke.field_V) {
              el.a(ah.field_f, param1 - 5624);
              fa.b(param1 + 15262);
            } else {
              fm.f((byte) 81);
            }
          }
          return;
        }
        this.field_c = this.field_c + 1;
        this.field_y = this.field_y - 1;
        if ((255 & this.field_c) < 80 &&
          0 == (this.field_c & 7)) {
          this.field_b = this.field_b + 1;
          if (5 == this.field_b) {
            this.field_b = 0;
          }
        }
        this.field_k = 30 + (int)(0.5 + Math.sin((double)(this.field_c >> 2)) * 30.0);
        var5 = wc.field_c[ah.field_f][0].field_A;
        var6 = wc.field_c[ah.field_f][0].field_x;
        var7 = 5;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        if (this.field_s == param3) {
          if (param2 == this.field_n) {
            stackIn_21_0 = (param0 != 0) ? 1 : 0;
          } else {
            stackIn_21_0 = 1;
          }
        } else {
          stackIn_21_0 = 1;
        }
        var11 = stackIn_21_0;
        this.field_n = param2;
        if (this.field_v >= 0) {
          this.field_s = param3;
        }
        if (var11 != 0 &&
          this.field_v >= 0) {
          this.field_a = -1;
          var12 = 3;
          if (ah.field_f == 1) {
            var12 = 4;
          }
          var13 = 0;
          while (true) {
            boolean decompiledFrameCompleted0 = true;
            if (var12 > var13) {
              for (var14 = 0; var14 < var7; var14++) {
                var15 = 40 + (this.field_v + var14 * (var6 + 16));
                var16 = 80 + var13 * (4 + var5);
                if (var15 < param3 &&
                  param3 < var15 + var6 &&
                  param2 > var16 &&
                  var16 + var5 > param2) {
                  var9 = 1;
                  this.field_l = -1;
                  this.field_a = var8;
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var8++;
              }
              if (decompiledFrameCompleted0) {
                var13++;
                continue;
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (449 < param2 &&
              475 > param2) {
              if (param3 > 37 &&
                169 > param3) {
                this.field_a = -3;
                var9 = 1;
              } else {
                if (param3 > 329 &&
                  param3 < 443) {
                  this.field_a = -4;
                  var9 = 1;
                } else {
                  if (445 < param3 &&
                    588 > param3) {
                    var9 = 1;
                    this.field_a = -5;
                    if ((!(param3 <= 39)) &&
                      (!(param3 >= kd.field_r.field_x + 39)) &&
                      (!(315 >= param2)) &&
                      (!(param2 >= 315 + kd.field_r.field_A))) {
                      this.field_a = -2;
                      var9 = 1;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                }
              }
            }
            if ((decompiledFrameRemainder0) && (param3 > 39 &&
              param3 < kd.field_r.field_x + 39 &&
              315 < param2 &&
              param2 < 315 + kd.field_r.field_A)) {
              this.field_a = -2;
              var9 = 1;
            }
            if (20 < this.field_a) {
              this.field_a = 20;
              break;
            }
            if (var9 == 0) {
              break;
            }
            if (param0 != 1) {
              break;
            }
            var10 = 1;
            break;
          }
        }
        for (var12Lifetime1 = 0; 21 >= var12Lifetime1; var12Lifetime1++) {
          if (0 != this.field_j[var12Lifetime1]) {
            if (this.field_j[var12Lifetime1] != 2) {
              this.field_p[var12Lifetime1] = this.field_p[var12Lifetime1] + 8;
              if (0 <= this.field_p[var12Lifetime1]) {
                this.field_j[var12Lifetime1] = 0;
              }
            } else {
              this.field_p[var12Lifetime1] = this.field_p[var12Lifetime1] - 8;
              if (var12Lifetime1 == 21) {
                if (this.field_p[var12Lifetime1] <= -kd.field_r.field_x) {
                  this.field_j[var12Lifetime1] = 1;
                  stackIn_130_0 = this.field_i;
                  stackIn_130_1 = var12Lifetime1;
                  stackIn_131_2 = !(this.field_i[var12Lifetime1]);
                  stackIn_130_0[stackIn_130_1] = stackIn_131_2;
                }
              } else {
                if (-this.field_d >= this.field_p[var12Lifetime1]) {
                  this.field_j[var12Lifetime1] = 1;
                  stackIn_122_0 = this.field_i;
                  stackIn_122_1 = var12Lifetime1;
                  stackIn_123_2 = !(this.field_i[var12Lifetime1]);
                  stackIn_122_0[stackIn_122_1] = stackIn_123_2;
                }
              }
            }
          } else {
            if (var12Lifetime1 < 21) {
              stackIn_80_0 = this.field_i[var12Lifetime1];
              if (qe.field_b[var12Lifetime1]) {
                stackIn_81_1 = 0;
              } else {
                stackIn_81_1 = 1;
              }
              if ((stackIn_80_0 ? 1 : 0) == stackIn_81_1) {
                this.field_j[var12Lifetime1] = 2;
              }
            }
            if (ah.field_f == 0) {
              if (qe.field_b[2] &&
                qe.field_b[0] &&
                qe.field_b[3] &&
                qe.field_b[7] &&
                qe.field_b[6]) {
                stackIn_92_0 = 0;
              } else {
                stackIn_92_0 = 1;
              }
              if (this.field_i[21]) {
                stackIn_95_1 = 0;
              } else {
                stackIn_95_1 = 1;
              }
              if (stackIn_92_0 != stackIn_95_1) {
                this.field_j[21] = 2;
              }
            }
            if (ah.field_f == 1) {
              if (qe.field_b[2] &&
                qe.field_b[0] &&
                qe.field_b[3] &&
                qe.field_b[7] &&
                qe.field_b[6] &&
                qe.field_b[16]) {
                stackIn_110_0 = 0;
              } else {
                stackIn_110_0 = 1;
              }
              if (stackIn_110_0 == (this.field_i[21] ? 1 : 0)) {
                this.field_j[21] = 2;
              }
            }
          }
        }
        var12Lifetime2 = 0;
        while (mm.b((byte) 108)) {
          if (13 == lj.field_t) {
            var10 = 1;
            this.field_a = -3;
          }
          if (lj.field_t == 96) {
            var12Lifetime2 = 1;
            if (this.field_a <= 0) {
              if (this.field_a < -2) {
                if (this.field_a == -3) {
                  this.field_a = -5;
                } else {
                  this.field_a = this.field_a + 1;
                }
              }
            } else {
              this.field_a = this.field_a - 1;
            }
          }
          if (97 == lj.field_t) {
            var12Lifetime2 = 1;
            if (this.field_a < -1 + nb.field_g[ah.field_f].length &&
              -2 < this.field_a) {
              this.field_a = this.field_a + 1;
            } else {
              if (this.field_a < -2) {
                if (-5 == this.field_a) {
                  this.field_a = -3;
                } else {
                  this.field_a = this.field_a - 1;
                }
              }
            }
          }
          if (99 == lj.field_t) {
            if (this.field_a >= 0 &&
              5 < -this.field_a + nb.field_g[ah.field_f].length) {
              this.field_a = this.field_a + 5;
              if (!(this.field_a < nb.field_g[ah.field_f].length - 1)) {
                this.field_a = nb.field_g[ah.field_f].length - 1;
              }
            } else if (this.field_a >= 0 &&
              -this.field_a + nb.field_g[ah.field_f].length <= 5) {
              this.field_l = this.field_a;
              this.field_a = -2;
            } else {
              if (0 > this.field_a &&
                this.field_a != -5) {
                this.field_a = this.field_a - 1;
              }
            }
            var12Lifetime2 = 1;
          }
          if (lj.field_t == 98) {
            if (this.field_a < 5) {
              if (this.field_a < 0) {
                if (this.field_a == -2) {
                  if (this.field_l >= 0) {
                    this.field_a = this.field_l;
                  } else {
                    this.field_a = 10;
                  }
                } else {
                  this.field_a = this.field_a + 1;
                }
              }
            } else {
              this.field_a = this.field_a - 5;
            }
            var12Lifetime2 = 1;
          }
          if (lj.field_t == 80) {
            var12Lifetime2 = 1;
            if (this.field_a >= 0 &&
              14 > this.field_a) {
              this.field_a = -5;
            } else {
              this.field_a = 0;
            }
          }
          if (lj.field_t != 84 &&
            lj.field_t != 83) {
            continue;
          }
          var10 = 1;
          var12Lifetime2 = 1;
        }
        if (var12Lifetime2 == 0) {
          stackIn_204_0 = (var11 != 0) ? 1 : 0;
        } else {
          stackIn_204_0 = 0;
        }
        var11Lifetime1 = stackIn_204_0;
        if (var10 != 0 &&
          this.field_a != -1) {
          this.a(param0, (byte) 18, this.field_a);
        }
        if (param1 != -5) {
          return;
        }
        this.field_v = this.field_v + 32;
        if (this.field_v > 0) {
          this.field_v = 0;
        }
        return;
    }

    final void b(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_56_0 = 0;
        vm stackIn_70_0;
        String stackIn_70_1;
        int stackIn_70_2;
        int stackIn_70_3;
        int stackIn_71_4 = 0;
        ea stackIn_73_0 = null;
        int stackIn_74_1 = 0;
        boolean stackIn_81_1 = false;
        Object stackIn_83_0;
        int stackIn_83_2;
        String stackIn_83_3;
        int stackIn_83_4;
        boolean stackIn_84_5 = false;
        Object stackIn_86_0;
        boolean stackIn_87_6 = false;
        int stackIn_89_1 = 0;
        boolean stackIn_90_2 = false;
        Object stackIn_92_0;
        StringBuilder stackIn_92_3;
        String stackIn_93_4 = null;
        int stackIn_95_1 = 0;
        boolean stackIn_96_2 = false;
        vm stackIn_155_0;
        String stackIn_155_1;
        int stackIn_155_2;
        int stackIn_155_3;
        int stackIn_155_4;
        int stackIn_156_5;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8_int;
        String var8;
        int var9_int;
        vm var9;
        int var10;
        int var11;
        int var12;
        int var13_int;
        Object var13;
        String var13_ref;
        vm var14;
        ea var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        ea var22;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8_intLifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        var20 = MinerDisturbance.field_ab;
        if (this.field_v != 0) {
          vh.field_a[ah.field_f].c(this.field_v, 0, 100);
        } else {
          if (this.field_c <= 40) {
            vh.field_a[ah.field_f].c(this.field_v, 0, 178 + (int)(60.0 * Math.sin((double)(this.field_c * 2)) + 18.0 * Math.cos((double)(3 * this.field_c))));
          } else {
            vh.field_a[ah.field_f].g(this.field_v, 0);
          }
        }
        qc.field_d.f(-(qc.field_d.field_x >> 1) + 320, this.field_v);
        if (this.field_v >= 0) {
          if (this.field_c > 40) {
            stackIn_10_0 = 30;
          } else {
            stackIn_10_0 = (int)(Math.sin((double)(this.field_c * 6)) * 20.0 + Math.cos((double)(this.field_c * 12)) * 14.0) + 35;
          }
          var2 = stackIn_10_0;
          var3 = 345 - (qc.field_d.field_x >> 1);
          var4 = 320 + (qc.field_d.field_x >> 1) - 25;
          while (var3 < var4) {
            eh.a(var3 << 4, this.field_v + 42 << 4, 800, var2, s.field_I);
            var3 += 50;
          }
          eh.a(var4 << 4, 42 + this.field_v << 4, 800, var2, s.field_I);
        }
        var2Lifetime1 = wc.field_c[ah.field_f][0].field_A;
        var3Lifetime1 = wc.field_c[ah.field_f][0].field_x;
        var4Lifetime1 = 5;
        var5 = 0;
        var6 = 3;
        if (ah.field_f == 1) {
          var6 = 4;
        }
        var7 = 0;
        L5: while (var6 > var7) {
          var8_int = 0;
          while (true) {
            if (var4Lifetime1 <= var8_int) {
              var7++;
              continue L5;
            }
            if (21 <= var5) {
              break;
            }
            var9_int = 40 + ((16 + var3Lifetime1) * var8_int + this.field_v);
            var10 = var7 * (var2Lifetime1 + 4) + 80;
            if (this.field_a == var5) {
              var11 = -var3Lifetime1 + pk.field_d.field_x >> 1;
              var12 = -var2Lifetime1 + pk.field_d.field_A >> 1;
              pk.field_d.f(var9_int - var11, var10 - var12);
            }
            var5++;
            var8_int++;
          }
          break;
        }
        var21 = 0;
        var5Lifetime1 = var21;
        var7Lifetime1 = 0;
        L9: while (var7Lifetime1 < var6) {
          var8_intLifetime1 = 0;
          while (true) {
            if (var8_intLifetime1 >= var4Lifetime1) {
              var7Lifetime1++;
              continue L9;
            }
            if (var21 >= 21) {
              break;
            }
            var9_intLifetime1 = nb.field_g[ah.field_f][var21];
            var10Lifetime1 = this.field_g[var9_intLifetime1];
            var11Lifetime1 = this.field_p[var9_intLifetime1];
            var12 = var11Lifetime1 + var3Lifetime1;
            var13_int = this.field_i[var9_intLifetime1] ? 1 : 0;
            var22 = wc.field_c[ah.field_f][var9_intLifetime1];
            var15 = te.field_e[ah.field_f][var9_intLifetime1];
            var16 = this.field_v + (var8_intLifetime1 * (16 + var3Lifetime1) + 40);
            var17 = 80 + var7Lifetime1 * (var2Lifetime1 + 4);
            var18 = -(var11Lifetime1 >> 1) + var16;
            if (this.field_f < var10Lifetime1) {
              if (var13_int == 0) {
                if (var9_intLifetime1 == 1 &&
                  qe.field_b[0] &&
                  this.field_f >= this.field_g[0]) {
                  stackIn_56_0 = 0;
                } else {
                  if (var9_intLifetime1 == 0 &&
                    qe.field_b[1]) {
                    stackIn_56_0 = 0;
                  } else {
                    if (var9_intLifetime1 == 19 &&
                      qe.field_b[2] &&
                      this.field_f >= this.field_g[2]) {
                      stackIn_56_0 = 0;
                    } else {
                      if (var9_intLifetime1 == 2) {
                        stackIn_56_0 = (!qe.field_b[19]) ? 1 : 0;
                      } else {
                        stackIn_56_0 = 1;
                      }
                    }
                  }
                }
              } else {
                stackIn_56_0 = 0;
              }
            } else {
              stackIn_56_0 = 0;
            }
            var19 = stackIn_56_0;
            if (var19 != 0) {
              var22.d(var18, var17, var12, var2Lifetime1, 100);
            } else {
              if (var13_int != 0) {
                var15.c(var18, var17, var12, var2Lifetime1);
                if (var21 == this.field_a) {
                  var15.e(var18, var17, var12, var2Lifetime1, this.field_k);
                }
              } else {
                var22.c(var18, var17, var12, var2Lifetime1);
                if (var21 == this.field_a) {
                  var22.e(var18, var17, var12, var2Lifetime1, this.field_k);
                }
              }
            }
            var21++;
            if (var13_int == 0) {
              this.field_h.g();
              eh.d();
              stackIn_70_0 = ce.field_d;
              stackIn_70_1 = Integer.toString(var10Lifetime1 * 100);
              stackIn_70_2 = 10;
              stackIn_70_3 = 17;
              if (var19 != 0) {
                stackIn_71_4 = 3355443;
              } else {
                stackIn_71_4 = 5710861;
              }
              ((vm) (Object) stackIn_70_0).a(stackIn_70_1, stackIn_70_2, stackIn_70_3, stackIn_71_4, -1);
              stackIn_73_0 = this.field_h;
              if (var19 != 0) {
                stackIn_74_1 = 6776679;
              } else {
                stackIn_74_1 = 16777215;
              }
              ((ea) (Object) stackIn_73_0).f(stackIn_74_1);
              bj.field_e.a((byte) -45);
              this.field_h.c(var18, var17, var12, var2Lifetime1);
            } else {
              gb.field_a.c(var18, var17, var12, var2Lifetime1);
            }
            var8_intLifetime1++;
          }
          break;
        }
        eh.b(this.field_v, 440, 640, 40, 4539717, 160);
        eh.a(this.field_v, 441, 640, 41, 10066329);
        stackIn_81_1 = (this.field_f == 0) && (this.field_c % 10 < 5);
        stackIn_83_0 = this;
        stackIn_83_2 = -123;
        stackIn_83_3 = sd.field_e;
        stackIn_83_4 = 450;
        stackIn_84_5 = (this.field_a == -5);
        stackIn_86_0 = this;
        stackIn_87_6 = (this.field_f != 0);
        this.a(stackIn_81_1, (byte) stackIn_83_2, stackIn_83_3, stackIn_83_4, stackIn_84_5, stackIn_87_6, false, 457);
        stackIn_89_1 = 450;
        stackIn_90_2 = (this.field_a == -4);
        stackIn_92_0 = this;
        stackIn_92_3 = new StringBuilder().append(gd.field_t);
        if (!sc.field_b) {
          stackIn_93_4 = ie.field_a;
        } else {
          stackIn_93_4 = gm.field_b;
        }
        this.a(stackIn_89_1, stackIn_90_2, ((StringBuilder) (Object) stackIn_92_3).append(stackIn_93_4).toString(), 315, (byte) -66, false);
        stackIn_95_1 = 450;
        stackIn_96_2 = (-3 == this.field_a);
        this.a(stackIn_95_1, stackIn_96_2, mn.field_v, 40, (byte) -66, false);
        if (0 == this.field_f) {
          a.field_a[this.field_b + 16].f(this.field_v + 590, -a.field_a[0].field_u - a.field_a[0].field_C + 480);
        }
        var7Lifetime2 = -this.field_v - 0;
        var8 = ta.field_f;
        if (this.field_i[21]) {
          var8 = se.field_L;
        }
        var9 = mm.field_a;
        this.field_r.g();
        kd.field_r.g(0, 0);
        var10Lifetime2 = 3 + (var9.field_E + var9.field_I);
        var9.a(var8, -2, 0, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10Lifetime2);
        var9.a(var8, 2, 0, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10Lifetime2);
        var9.a(var8, 0, -2, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10Lifetime2);
        var9.a(var8, 0, 2, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10Lifetime2);
        var9.a(var8, -1, -1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10Lifetime2);
        var9.a(var8, 1, -1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10Lifetime2);
        var9.a(var8, -1, 1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10Lifetime2);
        var9.a(var8, 1, 1, kd.field_r.field_x, kd.field_r.field_A, 2829610, -1, 1, 1, var10Lifetime2);
        if (this.field_a == -2) {
          var9.a(var8, 0, 0, kd.field_r.field_x, kd.field_r.field_A, 15884837, -1, 1, 1, var10Lifetime2);
        } else {
          var9.a(var8, 0, 0, kd.field_r.field_x, kd.field_r.field_A, 16437248, -1, 1, 1, var10Lifetime2);
        }
        var11Lifetime2 = -101 / ((-70 - param0) / 32);
        bj.field_e.a((byte) -45);
        this.field_r.c(39 + (var7Lifetime2 - (this.field_p[21] >> 1)), 315, kd.field_r.field_x + this.field_p[21], kd.field_r.field_A);
        g.a(316, 113, var7Lifetime2 + 190, 414, (byte) 83, he.field_b);
        g.a(391, 38, var7Lifetime2 + 39, 142, (byte) 109, he.field_b);
        if (this.field_v == 0) {
          var12 = -1;
          if (this.field_a >= 0 &&
            nb.field_g[ah.field_f].length > this.field_a) {
            var12 = nb.field_g[ah.field_f][this.field_a];
          }
          var13 = null;
          if (6 == var12) {
            tn.field_K[6].g(487, 326);
            var13_ref = vh.field_h[ah.field_f];
          } else {
            if (var12 != 0) {
              if (var12 == 2) {
                tn.field_K[2].g(487, 326);
                var13_ref = gl.field_x[ah.field_f];
              } else {
                if (var12 != 3) {
                  if (var12 != 7) {
                    if (var12 != 9) {
                      if (var12 != 1) {
                        if (var12 == 11) {
                          tn.field_K[11].g(487, 326);
                          var13_ref = tc.field_p;
                        } else {
                          if (8 != var12) {
                            if (4 == var12) {
                              tn.field_K[4].g(487, 326);
                              var13_ref = cl.field_M;
                            } else {
                              if (10 != var12) {
                                if (var12 == 5) {
                                  tn.field_K[5].g(487, 326);
                                  var13_ref = uf.field_u;
                                } else {
                                  if (var12 != 12) {
                                    if (var12 != 13) {
                                      if (14 != var12) {
                                        if (var12 != 15) {
                                          if (16 != var12) {
                                            if (17 != var12) {
                                              if (var12 != 18) {
                                                if (var12 == 19) {
                                                  tn.field_K[18].g(487, 326);
                                                  var13_ref = ck.field_e;
                                                } else {
                                                  if (20 == var12) {
                                                    tn.field_K[19].g(487, 326);
                                                    var13_ref = fm.field_K;
                                                  } else {
                                                    var13_ref = ne.field_R[ah.field_f];
                                                  }
                                                }
                                              } else {
                                                tn.field_K[17].g(487, 326);
                                                var13_ref = lm.field_I;
                                              }
                                            } else {
                                              tn.field_K[16].g(487, 326);
                                              var13_ref = nf.field_b;
                                            }
                                          } else {
                                            tn.field_K[15].g(487, 326);
                                            var13_ref = ol.field_d;
                                          }
                                        } else {
                                          tn.field_K[14].g(487, 326);
                                          var13_ref = jn.field_p;
                                        }
                                      } else {
                                        tn.field_K[13].g(487, 326);
                                        var13_ref = fd.field_kb[ah.field_f];
                                      }
                                    } else {
                                      tn.field_K[12].g(487, 326);
                                      var13_ref = qh.field_d;
                                    }
                                  } else {
                                    tn.field_K[12].g(487, 326);
                                    var13_ref = hh.field_c;
                                  }
                                }
                              } else {
                                tn.field_K[10].g(487, 326);
                                var13_ref = wc.field_d;
                              }
                            }
                          } else {
                            tn.field_K[8].g(487, 326);
                            var13_ref = ef.field_d;
                          }
                        }
                      } else {
                        tn.field_K[1].g(487, 326);
                        var13_ref = ig.field_d;
                      }
                    } else {
                      tn.field_K[9].g(487, 326);
                      var13_ref = mn.field_w[ah.field_f];
                    }
                  } else {
                    tn.field_K[7].g(487, 326);
                    var13_ref = ii.field_c;
                  }
                } else {
                  tn.field_K[3].g(487, 326);
                  var13_ref = ob.field_v;
                }
              }
            } else {
              tn.field_K[0].g(487, 326);
              var13_ref = hm.field_J[ah.field_f];
            }
          }
          if (var13_ref != null) {
            stackIn_155_0 = ce.field_d;
            stackIn_155_1 = var13_ref;
            stackIn_155_2 = 205;
            stackIn_155_3 = 327;
            stackIn_155_4 = 384;
            if (ne.field_R[ah.field_f] == var13_ref) {
              stackIn_156_5 = 0;
            } else {
              stackIn_156_5 = tn.field_K[13].field_x + 20;
            }
            ((vm) (Object) stackIn_155_0).a(stackIn_155_1, stackIn_155_2, stackIn_155_3, stackIn_155_4 - stackIn_156_5, 90, 3550242, -1, 3, 0, 0);
          }
          var14 = mm.field_a;
          if (var12 >= 0) {
            var14.c(oa.a((byte) -77, af.field_r, new String[]{Integer.toString(this.field_g[var12] * 100)}), 462, 418, 1, -1);
          }
          if (this.field_y > 0 &&
            this.field_y % 10 < 5) {
            var14.a(oa.a((byte) -73, ne.field_M, new String[]{Integer.toString(100 * this.field_f)}), 52 + var7Lifetime2, 418, 16711680, -1);
            return;
          }
          var14.a(oa.a((byte) -126, ne.field_M, new String[]{Integer.toString(this.field_f * 100)}), 52 + var7Lifetime2, 418, 1, -1);
        }
        return;
    }

    private final void a(boolean param0, byte param1) {
        if (!param0) {
          this.field_s = nk.field_w;
          this.field_n = gb.field_e;
          this.field_a = 0;
        } else {
          this.field_s = -1;
          this.field_n = -1;
        }
        if (param1 != 27) {
          this.field_f = 37;
        }
    }

    mc(MinerDisturbance param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        this.field_p = new int[22];
        this.field_i = new boolean[22];
        this.field_j = new int[22];
        this.field_a = 0;
        this.field_g = new int[]{1, 2, 1, 1, 3, 2, 1, 1, 2, 1, 2, 1, 2, 3, 1, 2, 1, 3, 1, 2, 3};
        this.field_v = -640;
        try {
          this.field_q = param0;
          this.field_f = 5;
          if (ah.field_f == 1) {
            this.field_f = 6;
          }
          kj.a(1, -22156);
          if (ah.field_f != cm.field_o) {
            for (var3_int = 0; var3_int < 21; var3_int++) {
              qe.field_b[var3_int] = false;
            }
          } else {
            var5 = 0;
            var3_int = var5;
            while (21 > var5) {
              qe.field_b[var5] = bn.field_b[var5];
              if (qe.field_b[var5]) {
                this.field_f = this.field_f - this.field_g[var5];
                if (var5 == 12) {
                  kj.a(2 * ne.a(false), -22156);
                }
                if (13 == var5) {
                  kj.a(ne.a(false) * 3, -22156);
                }
              }
              var5++;
            }
          }
          this.field_d = wc.field_c[ah.field_f][0].field_x;
          this.field_h = new ea(this.field_d, wc.field_c[ah.field_f][0].field_A);
          this.field_l = -1;
          this.field_y = 0;
          this.field_r = new ea(kd.field_r.field_x, kd.field_r.field_A);
          this.a(param1, (byte) 27);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("mc.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_z = "Nothing To Say";
        field_x = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Not yet achieved";
        field_t = new bd();
    }
}
