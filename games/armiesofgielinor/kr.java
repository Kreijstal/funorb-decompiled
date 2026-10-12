/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr extends oj {
    static int[] field_F;
    static dm field_E;
    static wk field_z;
    static int[][] field_y;
    int[] field_B;
    static cv field_C;
    static rk field_G;
    static bo field_D;
    int field_I;
    private boolean field_A;
    static boolean field_J;
    int field_H;

    final String a(byte param0, boolean param1) {
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        String stackIn_49_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          boolean decompiledFrameCompleted1 = true;
          if (param1) {
            System.out.println("Move event debug");
            System.out.println("Unit at " + this.field_H + "," + this.field_I);
            var3_int = 0;
            while (var3_int < this.field_B.length) {
              var4 = this.field_B[var3_int];
              stackIn_38_0 = -2;
              stackIn_38_1 = ~var4;
              if (var6 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_38_0 == stackIn_38_1 &&
                var6 == 0) {
                System.out.println("North");
                decompiledFrameRemainder2 = false;
              } else {
                if ((var4 != 2) &&
                  (decompiledFrameRemainder0 = (0 != var4 ||
                  var6 != 0))) {
                  decompiledFrameRemainder1 = (3 != var4);
                  decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                System.out.println("South");
                decompiledFrameRemainder2 = false;
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                System.out.println("East");
                decompiledFrameRemainder2 = false;
              }
              if (decompiledFrameRemainder2) {
                System.out.println("West");
              }
              var3_int++;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_38_0 = -3;
            stackIn_38_1 = (param0 - 53) / 51;
          }
          boolean decompiledFrameCompleted0 = true;
          var4Lifetime1 = stackIn_38_0 / stackIn_38_1;
          var3 = "EventMove: start: (" + this.field_H + ", " + this.field_I + ")" + "\n";
          if (null != this.field_B) {
            var3 = var3 + "footsteps[" + this.field_B.length + "]: (";
            var5 = 0;
            while (var5 < this.field_B.length) {
              var3 = var3 + this.field_B[var5];
              var5++;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              var3 = var3 + ")";
            }
          }
          stackIn_49_0 = var3;
          return stackIn_49_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "kr.C(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("kr.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(kl param0, boolean param1, kl param2, kl param3) {
        int stackIn_23_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk var4 = null;
        RuntimeException var4_ref = null;
        ru[] var5 = null;
        ru[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ru[] var10 = null;
        wk var10_ref = null;
        int var11_int = 0;
        wk var11 = null;
        wk var12 = null;
        int var13 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          t.field_d = fk.a("frame_top", (byte) -124, param2, "commonui");
          ip.field_c = fk.a("frame_bottom", (byte) -125, param2, "commonui");
          gt.field_e = ic.a("jagex_logo_grey", (byte) 51, "commonui", param2);
          bb.field_b = fk.a("button", (byte) -124, param2, "commonui");
          db.field_a = ac.a(param2, "validation", (byte) -4, "commonui");
          gl.field_e = (ka) ((Object) it.a("arezzo12", param2, param3, (byte) -87, "commonui"));
          ArmiesOfGielinor.field_J = (ka) ((Object) it.a("arezzo14", param2, param3, (byte) -87, "commonui"));
          bv.field_t = (ka) ((Object) it.a("arezzo14bold", param2, param3, (byte) -87, "commonui"));
          var4 = new wk(param0.a("", 45, "button.gif"), (java.awt.Component) ((Object) si.field_b));
          if (param1) {
            kr.g(90);
          }
          pv.a("commonui", "dropdown", param2, 24914);
          var5 = lo.a("screen_options", -28106, "commonui", param2);
          oa.field_H = new ru[4];
          dq.field_e = new ru[4];
          tg.field_b = new ru[4];
          var6 = new ru[][]{oa.field_H, dq.field_e, tg.field_b};
          var7 = new int[4][];
          var7[0] = var5[0].field_j;
          var8 = 1;
          do {
            if (var8 >= var7.length) {
              var8 = var5[0].field_k[0];
              var7[2][var8] = 16777215;
              var7[1][var8] = 2394342;
              var7[3][var8] = 4767999;
              break;
            }
            var7[var8] = (int[]) ((Object) var7[0].clone());
            var8++;
          } while (var13 == 0);
          var9 = 0;
          L4: while (true) {
            if (var9 < 3) {
              var10 = var6[var9];
              stackIn_23_0 = 0;
              if (var13 != 0) {
                break L4;
              }
              var11_int = stackIn_23_0;
              while (var10.length > var11_int) {
                var10[var11_int] = vf.a(var7[var11_int], -13546, var5[var9]);
                var11_int++;
              }
              var9++;
              continue L4;
            }
            var9 = var4.field_v;
            rq.a((byte) -56);
            var4.b();
            stackIn_23_0 = 0;
            break;
          }
          qn.c(stackIn_23_0, 0, qn.field_l, qn.field_g);
          var10_ref = new wk(var9, var9);
          var10_ref.b();
          var4.f(0, 0);
          var11 = new wk(var9, var9);
          var11.b();
          var4.f(-var4.field_y + var9, 0);
          var12 = new wk(-(var9 * 2) + var4.field_y, var9);
          var12.b();
          var4.f(-var9, 0);
          rf.b(-18862);
          bb.field_b = new wk[]{var10_ref, var12, var11};
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("kr.D(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final void a(ha param0, int param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_146_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ne var5 = null;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ne var9 = null;
        int var10_int = 0;
        ne var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (this.field_A) {
            return;
          }
          this.field_A = true;
          var3_int = this.field_H;
          var4 = this.field_I;
          if (param1 != -26661) {
            field_J = false;
          }
          var5 = param0.field_Eb[this.field_H + this.field_I * param0.field_v];
          var6 = var5.field_c;
          if (null == var6) {
            return;
          }
          var7 = 0;
          if (param0.field_Eb[this.field_H + param0.field_v * this.field_I].field_h != 6 &&
            param0.field_Eb[this.field_H + param0.field_v * this.field_I].field_h != 4 &&
            param0.field_Eb[this.field_I * param0.field_v + this.field_H].field_h != 10) {
            stackIn_19_0 = 0;
          } else {
            stackIn_19_0 = 1;
          }
          var8 = stackIn_19_0;
          var9_int = 0;
          while (this.field_B.length > var9_int) {
            var10_int = this.field_B[var9_int];
            switch ((var12 == 0
              || var10_int == 1
              || var10_int == 3
              ) ? var10_int : -1) {
              case 1:
                var4--;
                if (var12 == 0) {
                  break;
                }
              case 2:
                var4++;
                if (var12 == 0) {
                  break;
                }
              case 0:
                var3_int++;
                if (var12 == 0) {
                  break;
                }
              case 3:
                var3_int--;
              default:
                break;
            }
            boolean decompiledFrameRemainder0 = true;
            var10 = param0.field_Eb[var4 * param0.field_v + var3_int];
            var11 = var10.field_h;
            if (62 != var6.field_N ||
              var11 != 2 ||
              this.field_B.length != 1) {
              if (29 == var6.field_N) {
                if (var11 == 3) {
                  param0.b((byte) 10, 0, var3_int, var4);
                  var7 = 1;
                  decompiledFrameRemainder0 = (var12 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (param0.field_K != null)) &&
                  (decompiledFrameRemainder0 = (var11 == 7 ||
                  var11 == 11)) &&
                  (decompiledFrameRemainder0 = !(!var6.c(false))) &&
                  (decompiledFrameRemainder0 = !(var10.a(var6.field_O, (byte) 91))) &&
                  (decompiledFrameRemainder0 = (var10.field_a != -1))) {
                  var7 = 1;
                  param0.b((byte) 127, 1, var3_int, var4);
                  decompiledFrameRemainder0 = (var12 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (var6.field_N == 40 &&
                  0 == var11) {
                  var7 = 1;
                  param0.b((byte) 6, 3, var3_int, var4);
                  decompiledFrameRemainder0 = (var12 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (this.field_w.field_N == 73) &&
                  (var8 != 0)) {
                  if (var11 == 0) {
                    param0.b((byte) -59, 4, var3_int, var4);
                    var7 = 1;
                  }
                  if (var11 == 1) {
                    param0.b((byte) -100, 10, var3_int, var4);
                    var7 = 1;
                    if (var12 != 0) {
                      param0.b((byte) 113, 0, var3_int, var4);
                      var7 = 1;
                    }
                  }
                }
              }
            } else {
              param0.b((byte) 113, 0, var3_int, var4);
              var7 = 1;
            }
            var9_int++;
            if (var12 == 0) {
              continue;
            }
            break;
          }
          var9 = param0.field_Eb[param0.field_v * var4 + var3_int];
          if (var6.field_N != 39) {
            if (var6.field_J != var3_int ||
              var6.field_w != var4) {
              boolean decompiledSharedTail0 = !(!var6.field_bb);
              if (!decompiledSharedTail0) {
                var5.field_c = null;
                var5.field_m = var5.e(10);
                decompiledSharedTail0 = (var12 != 0);
              }
              if (decompiledSharedTail0) {
                var6.field_bb = false;
                this.field_w.field_bb = false;
                param0.a(8288, this.field_w);
              }
              this.field_w.field_w = var4;
              this.field_w.field_J = var3_int;
              this.field_w.a((byte) 106);
              var10 = var9;
              if (var6.p(-75)) {
                var7 = 3;
              }
              if (!var10.e((byte) -118) ||
                ~var10.field_a != ~this.field_w.field_O) {
                var10.field_c = this.field_w;
                if (!(0 >= var7)) {
                  param0.a(var4, var3_int, 0, var7);
                  if (var12 != 0) {
                    this.field_w.field_G = true;
                    this.field_w.field_S = true;
                    this.field_w.d(-109);
                    param0.m(0, this.field_w.field_O);
                  }
                }
              } else {
                this.field_w.field_G = true;
                this.field_w.field_S = true;
                this.field_w.d(-109);
                param0.m(0, this.field_w.field_O);
              }
              if (var7 > 0) {
                param0.a(this.field_I, this.field_H, param1 + 26661, var7);
                nk.a((byte) 101);
              }
              if (var12 != 0) {
                var6.field_s = true;
                var9.field_c = var6.b(false);
                var9.field_c.field_J = var3_int;
                var9.field_c.field_w = var4;
                var9.field_c.a((byte) -35);
                var9.field_c.field_s = true;
                param0.a(param1 ^ -18501, var9.field_c);
              }
            }
          } else {
            var6.field_s = true;
            var9.field_c = var6.b(false);
            var9.field_c.field_J = var3_int;
            var9.field_c.field_w = var4;
            var9.field_c.a((byte) -35);
            var9.field_c.field_s = true;
            param0.a(param1 ^ -18501, var9.field_c);
          }
          this.field_w.field_s = true;
          fl.a(param0, param1 ^ 26718);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_145_0 = var3;
          stackIn_145_1 = new StringBuilder().append("kr.G(");
          if (param0 == null) {
            stackIn_146_2 = "null";
          } else {
            stackIn_146_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_145_0), ((StringBuilder) (Object) stackIn_145_1).append(stackIn_146_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_F = null;
          field_z = null;
          field_E = null;
          field_G = null;
          if (param0 != 29333) {
            kr.g(-45);
          }
          field_C = null;
          field_D = null;
          field_y = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "kr.B(" + param0 + ')');
        }
    }

    kr(int param0, int param1, int[] param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_A = false;
        try {
          this.field_H = param0;
          this.field_m = 0;
          this.field_B = param2;
          this.field_I = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("kr.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_y = new int[29][];
        field_F = new int[]{1000, 1150, 850, 1300, 700};
        field_J = true;
        field_D = new bo();
        gb.a(24, 0, 180, 460, 160, 465, new int[]{32, 31, 47, 1, 25, 30, 40, 35, 5, 48, 19, 16}, -59);
        gb.a(30, 23, 180, 460, 160, 320, new int[]{3, 53, 54, 4, 7}, -52);
        bt.a(26);
        gb.a(30, 1, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 9}, -90);
        gb.a(30, 24, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 50, 9}, -43);
        gb.a(30, 2, 180, 460, 100, 400, new int[]{2, 43, 5, 10, 11, 13}, -75);
        gb.a(30, 19, 180, 460, 100, 170, new int[]{45, 42}, -115);
        gb.a(30, 25, 180, 460, 100, 170, new int[]{52, 51}, -54);
        gb.a(30, 3, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 12, 13}, -41);
        gb.a(30, 4, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 5, 13}, -86);
        gb.a(30, 6, 180, 460, 400, 460, new int[]{20, 8}, -115);
        gb.a(30, 26, 180, 460, 400, 460, new int[]{20, 8}, -51);
        gb.a(30, 27, 180, 460, 400, 460, new int[]{20, 8}, -111);
        gb.a(30, 28, 180, 460, 400, 460, new int[]{20, 8}, -117);
        gb.a(30, 12, 60, 580, 440, 470, new int[]{41, 24, 44, 7}, -114);
        gb.a(30, 13, 60, 580, 440, 470, new int[]{7}, -78);
        gb.a(30, 20, 60, 580, 440, 470, new int[]{41, 24, 44, 7}, -95);
        vt.a(-120);
        gb.a(30, 8, 280, 360, 438, 440, new int[]{20, 8}, -119);
        gb.a(30, 9, 280, 360, 438, 440, new int[]{7}, -27);
        gb.a(30, 10, 180, 460, 400, 460, new int[]{20, 21}, -70);
        gb.a(30, 11, 100, 540, 100, 400, new int[]{7}, -52);
        gb.a(30, 15, 180, 460, 100, 400, new int[]{}, -102);
        gb.a(30, 14, 180, 460, 120, 350, new int[]{17, 18, 36, 37, 38, 6, 7}, -96);
        gb.a(30, 16, 532, 633, 390, 420, new int[]{39}, -36);
        gb.a(30, 17, 180, 460, 100, 400, new int[]{2, 17, 18, 36, 37, 38, 43}, -63);
        gb.a(30, 18, 60, 580, 440, 470, new int[]{41, 24, 44, 7}, -87);
        df.a(-20);
    }
}
