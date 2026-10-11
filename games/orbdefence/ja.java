/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    private ml field_f;
    private int field_c;
    private int field_g;
    static String field_d;
    static String field_b;
    private int field_a;
    private int field_i;
    private int field_j;
    static boolean field_e;
    private int field_h;

    private final boolean e(int param0, int param1) {
        int var3 = -15 % ((param1 - 65) / 58);
        if (this.field_a == 3) {
          if (param0 == 0 &&
            na.field_a == 0) {
            return false;
          }
          if (param0 == 2) {
            if (oa.field_i.length - 1 != na.field_a) {
              return true;
            }
            return false;
          }
        }
        return true;
    }

    private final void c(byte param0) {
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (ob.field_K == 41) {
          cj.a(110);
        }
        if (this.field_a == 2 &&
          !n.b((byte) -98)) {
          if (ob.field_K == 96) {
            if (0 < this.field_f.field_h) {
              if (this.field_f.field_h != 3) {
                this.field_f.a(0, this.field_f.field_h - 1);
                if (var3 != 0) {
                  this.field_f.a(0, 2);
                }
              }
            } else {
              this.field_f.a(0, 2);
            }
          }
          if (97 == ob.field_K) {
            if (this.field_f.field_h >= 2) {
              if (this.field_f.field_h == 2) {
                this.field_f.a(0, 0);
                if (var3 != 0) {
                  this.field_f.a(0, this.field_f.field_h + 1);
                }
              }
            } else {
              this.field_f.a(0, this.field_f.field_h + 1);
            }
          }
          if (ob.field_K == 99) {
            if (!(this.field_f.field_h >= 0) ||
              !(this.field_f.field_h <= 2)) {
              this.field_f.a(0, dm.field_e);
              if (var3 != 0) {
                this.field_f.a(0, 3);
              }
            } else {
              this.field_f.a(0, 3);
            }
          }
          if (ob.field_K == 98) {
            if (this.field_f.field_h == 3) {
              this.field_f.a(0, dm.field_e);
              if (var3 != 0) {
                this.field_f.a(0, 3);
              }
            } else {
              this.field_f.a(0, 3);
            }
          }
          this.field_f.d(0);
          return;
        }
        if (param0 < 94) {
          return;
        }
        if (this.field_a == 3) {
          this.field_f.d((byte) 101);
          if (ob.field_K != 96 &&
            97 != ob.field_K) {
            return;
          }
          while (!this.e(this.field_f.field_h, -58)) {
            this.field_f.d((byte) -123);
            if (var3 == 0) {
              continue;
            }
            break;
          }
          return;
        }
        if (this.field_a == 7) {
          this.field_f.d((byte) -114);
          return;
        }
        this.field_f.e((byte) -74);
        if (ob.field_K == 98 ||
          ob.field_K == 99) {
          while (!this.e(this.field_f.field_h, -30)) {
            this.field_f.e((byte) -74);
            if (var3 != 0) {
              break;
            }
          }
        }

    }

    private final void a(boolean param0) {
        hj stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_16_3;
        hj stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_3;
        hj stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_29_3;
        hj stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_3;
        hj stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_41_3;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        var2 = this.a((byte) -12);
        var3 = 123;
        var4 = 123;
        var5 = 394;
        var6 = 284;
        var7 = 0;
        ul.d(var3 + var7, var7 + var4, -(var7 * 2) + var5, -(2 * var7) + var6, var2);
        var7++;
        ul.d(var3 + var7, var4 + var7, var5 - var7 * 2, -(2 * var7) + var6, var2);
        var7++;
        if (param0) {
          this.b(false);
        }
        ul.d(var7 + var3, var4 + var7, var5 - var7 * 2, var6 - var7 * 2, 0);
        var7++;
        var8 = var7 + var4;
        do {
          if ((-var7 + (var4 + var6)) <= var8) {
            this.a(-29253, lc.field_u);
            var8 = 100;
            break;
          }
          ul.a(var7 + var3, var8, var5 - var7 * 2, 2232627);
          ul.f(var7 + var3, var8, var5 - var7 * 2, 0, 128);
          var8++;
        } while (var11 == 0);
        var9 = 60;
        var8 = var8 + (-20 + var9 * 3 / 2);
        if (this.field_f.field_h == 0) {
          hi.field_g[0].e(340, var8, 255);
        }
        var10 = qb.b((byte) 123) ? 1 : 0;
        if (this.field_f.field_h == 1) {
          stackIn_15_0 = hi.field_g[1];
          stackIn_15_1 = 340;
          stackIn_15_2 = var8;
          if (var10 == 0) {
            stackIn_16_3 = 255;
          } else {
            stackIn_16_3 = 64;
          }
          ((hj) (Object) stackIn_15_0).e(stackIn_15_1, stackIn_15_2, stackIn_16_3);
        }
        if (this.field_f.field_h == 2) {
          stackIn_21_0 = hi.field_g[2];
          stackIn_21_1 = 340;
          stackIn_21_2 = var8;
          if (var10 == 0) {
            stackIn_22_3 = 255;
          } else {
            stackIn_22_3 = 64;
          }
          ((hj) (Object) stackIn_21_0).e(stackIn_21_1, stackIn_21_2, stackIn_22_3);
        }
        if (this.field_f.field_h == 3) {
          stackIn_27_0 = hi.field_g[3];
          stackIn_27_1 = 340;
          stackIn_27_2 = var8;
          if ((8 & lb.field_g) != 0 &&
            var10 == 0) {
            stackIn_29_3 = 255;
          } else {
            stackIn_29_3 = 64;
          }
          ((hj) (Object) stackIn_27_0).e(stackIn_27_1, stackIn_27_2, stackIn_29_3);
        }
        if (this.field_f.field_h == 4) {
          stackIn_34_0 = hi.field_g[4];
          stackIn_34_1 = 340;
          stackIn_34_2 = var8;
          if (0 != (4194304 & lb.field_g) &&
            var10 == 0) {
            stackIn_35_3 = 255;
          } else {
            stackIn_35_3 = 64;
          }
          ((hj) (Object) stackIn_34_0).e(stackIn_34_1, stackIn_34_2, stackIn_35_3);
        }
        if (this.field_f.field_h == 5) {
          stackIn_40_0 = hi.field_g[5];
          stackIn_40_1 = 340;
          stackIn_40_2 = var8;
          if (0 != (4194304 & lb.field_g) &&
            var10 == 0) {
            stackIn_41_3 = 255;
          } else {
            stackIn_41_3 = 64;
          }
          ((hj) (Object) stackIn_40_0).e(stackIn_40_1, stackIn_40_2, stackIn_41_3);
        }
        return;
    }

    private final int b(int param0, byte param1) {
        if (this.field_a == 2 &&
          !n.b((byte) -120)) {
          if (param0 < 3) {
            return -6 + wd.field_o[this.field_a];
          }
          return -6 + (wd.field_o[this.field_a] + ek.field_e[this.field_a]);
        }
        if (2 == this.field_a &&
          n.b((byte) 108)) {
          return -6 + (ek.field_e[this.field_a] * param0 + wd.field_o[this.field_a]);
        }
        if (this.field_a == 3) {
          return wd.field_o[this.field_a] - 32;
        }
        if (4 != this.field_a &&
          this.field_a != 5) {
          if (param1 < 12) {
            field_e = false;
          }
          if (this.field_a == 8) {
            if (param0 == 0) {
              return 140;
            }
            if (param0 == 1) {
              return 178;
            }
            if (param0 == 2) {
              return 216;
            }
            if (param0 == 3) {
              return 254;
            }
            if (4 == param0) {
              return 292;
            }
            if (param0 == 5) {
              return 330;
            }
            if (param0 == 6) {
              return 368;
            }
            if (vh.field_q[this.field_a][param0] == 5) {
              return 415;
            }
          }
          return wd.field_o[this.field_a] + param0 * ek.field_e[this.field_a];
        }
        if (vh.field_q[this.field_a].length <= 1) {
          return -4 + (ek.field_e[this.field_a] * param0 + 430);
        }
        return 382 - (-((ek.field_e[this.field_a] + 12) * param0) + 4);
    }

    private final int a(int param0, byte param1) {
        if (param1 < 105) {
          field_e = false;
        }
        return 30;
    }

    final void a(byte param0, int param1, boolean param2) {
        if (this.field_f.field_h != -1) {
          param1 = this.field_f.field_h;
        }
        this.field_f.a(param1, this.a(vl.field_d, -21016, ua.field_a), 0, param2);
        int var4 = 14 % ((param0 + 59) / 40);
    }

    public static void c(int param0) {
        field_b = null;
        field_d = null;
        int var1 = 95 / ((param0 + 25) / 33);
    }

    final void b(boolean param0) {
        boolean stackIn_13_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int var2;
        int var3;
        var3 = OrbDefence.field_D ? 1 : 0;
        mj.c(-21108);
        if (param0) {
          field_e = false;
        }
        if (this.field_j > 0) {
          this.field_j = this.field_j - 1;
        }
        if (100 > lc.field_o) {
          lc.field_o = lc.field_o + 1;
        }
        if (this.field_a == 7) {
          stackIn_13_0 = !(ki.d(-116));
          var2 = wd.a(stackIn_13_0, false);
          if (var2 == 3) {
            if (mg.field_k != null) {
              lb.a(true);
            }
            tl.a((byte) -102, uj.b((byte) -120));
          }
          if (1 == var2) {
            rh.a((byte) 119, 0, false);
          }
          if (var2 != 2) {
            return;
          }
          rh.a((byte) -117, 0, true);
          return;
        }
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!nf.e(32722)))) {
          stackIn_37_0 = -14;
          stackIn_37_1 = ~ob.field_K;
          if (var3 == 0) {
            if (stackIn_37_0 == stackIn_37_1) {
              if (this.field_a != 1) {
                if (this.field_a == 6) {
                  continue;
                }
                rh.a((byte) 111, bk.field_e, false);
                continue;
              }
              rh.a((byte) -74, -1, false);
              gk.a(mh.field_a[44], (byte) -11);
              stackIn_32_0 = (tc.field_b > 0) ? 0 : 7;
              bk.field_e = stackIn_32_0;
              continue;
            }
            this.c((byte) 126);
            if (this.field_f.field_h == -1) {
              continue;
            }
            this.a(this.field_f.field_h, false, false);
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          this.field_f.a(this.a(bg.field_c, -21016, ig.field_fb), -1, this.a(vl.field_d, -21016, ua.field_a));
          stackIn_37_0 = this.field_f.field_h;
          stackIn_37_1 = -1;
        }
        if (stackIn_37_0 != stackIn_37_1) {
          this.a(this.field_f.field_h, param0, true);
        }
        if (0 != gi.field_e) {
          this.field_i = ig.field_fb;
          this.field_c = bg.field_c;
        }
        return;
    }

    private final int c(int param0, int param1) {
        if (this.field_a == 2 &&
          !n.b((byte) -95)) {
          if (3 > param1) {
            return im.field_a[this.field_a] + 200 * param1;
          }
          return 200 + im.field_a[this.field_a];
        }
        if (this.field_a == 2 &&
          n.b((byte) 47)) {
          return im.field_a[this.field_a] - 100;
        }
        if (this.field_a == 3) {
          return 200 * param1 + 20;
        }
        if (this.field_a == 4 ||
          5 == this.field_a) {
          return 120;
        }
        if (this.field_a == 8 &&
          param1 <= 3) {
          return im.field_a[this.field_a] - 100;
        }
        if (param0 != -29187) {
          return -35;
        }
        return im.field_a[this.field_a];
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(f.a(param1, var2, -114), "_top");
              if (param0 > -96) {
                var3 = (java.applet.Applet) null;
                ja.a(106, (java.applet.Applet) null);
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("ja.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4;
        int var5;
        int var6;
        boolean stackIn_14_0 = false;
        var6 = OrbDefence.field_D ? 1 : 0;
        if (param1 != -21016) {
          discarded$1 = this.c(-111, -21);
        }
        var4 = 0;
        while (var4 < vh.field_q[this.field_a].length) {
          var5 = this.b(var4, (byte) 53);
          stackIn_14_0 = this.e(var4, 126);
          if (var6 != 0) {
            return stackIn_14_0 ? 1 : 0;
          }
          if (stackIn_14_0 &&
            this.c(-29187, var4) <= param2 &&
            param2 < this.d(param1 ^ 21067, var4) &&
            param0 >= var5 &&
            param0 < this.a(var4, (byte) 117) + var5) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    private final void a(int param0, boolean param1, boolean param2) {
        int stackIn_76_0 = 0;
        int stackIn_81_0 = 0;
        boolean stackIn_86_0 = false;
        int stackIn_91_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_204_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var9 = OrbDefence.field_D ? 1 : 0;
        var4 = vh.field_q[this.field_a][param0];
        if (this.field_f.a((byte) -1)) {
          gk.a(mh.field_a[0], (byte) -11);
          if ((var9 != 0) &&
            (~this.field_g != ~var4)) {
            this.field_g = var4;
            gk.a(mh.field_a[30], (byte) -11);
          }
        } else {
          if (~this.field_g != ~var4) {
            this.field_g = var4;
            gk.a(mh.field_a[30], (byte) -11);
          }
        }
        L2: {
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder22 = true;
          boolean decompiledFrameRemainder21 = true;
          boolean decompiledFrameRemainder20 = true;
          boolean decompiledFrameRemainder19 = true;
          boolean decompiledFrameRemainder18 = true;
          boolean decompiledFrameRemainder17 = true;
          boolean decompiledFrameRemainder16 = true;
          boolean decompiledFrameRemainder15 = true;
          boolean decompiledFrameRemainder14 = true;
          boolean decompiledFrameRemainder13 = true;
          boolean decompiledFrameRemainder12 = true;
          boolean decompiledFrameRemainder11 = true;
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder2 = true;
          var6 = var4;
          if (var6 != 0) {
            decompiledFrameRemainder2 = (var6 != 19 ||
              var9 != 0);
            if (((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder2 = (20 != var6)) &&
              (decompiledFrameRemainder2 = (var6 != 21)) &&
              (decompiledFrameRemainder2 = (var6 != 22)) &&
              (decompiledFrameRemainder2 = (var6 != 23)) &&
              (decompiledFrameRemainder2 = (24 != var6 ||
              var9 != 0))) &&
              (decompiledFrameRemainder4 = (var6 != 26)) &&
              (decompiledFrameRemainder5 = (var6 != 25 ||
              var9 != 0)) &&
              (decompiledFrameRemainder6 = (var6 != 1)) &&
              (decompiledFrameRemainder7 = (5 != var6 ||
              var9 != 0)) &&
              (decompiledFrameRemainder8 = (var6 != 16)) &&
              (decompiledFrameRemainder9 = (var6 != 14 ||
              var9 != 0)) &&
              (decompiledFrameRemainder10 = (var6 != 3 ||
              var9 != 0)) &&
              (decompiledFrameRemainder11 = (var6 != 6 ||
              var9 != 0)) &&
              (decompiledFrameRemainder12 = (2 != var6 ||
              var9 != 0)) &&
              (decompiledFrameRemainder13 = (var6 != 12)) &&
              (decompiledFrameRemainder14 = (var6 != 13)) &&
              (decompiledFrameRemainder15 = (var6 != 4)) &&
              (decompiledFrameRemainder16 = (7 != var6)) &&
              (decompiledFrameRemainder17 = (var6 != 8 ||
              var9 != 0)) &&
              (decompiledFrameRemainder18 = (var6 != 9)) &&
              (decompiledFrameRemainder19 = (var6 != 10)) &&
              (decompiledFrameRemainder20 = (15 != var6)) &&
              (decompiledFrameRemainder21 = (var6 != 17)) &&
              (decompiledFrameRemainder22 = (var6 != 18 ||
              var9 != 0))) {
              if (var6 != 11) {
                break L2;
              }
              decompiledFrameRemainder3 = (var9 != 0);
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            rh.a((byte) -115, 8, param2);
            bk.field_e = this.field_a;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            boolean decompiledFrameRemainder1 = true;
            if (var4 == 22) {
              decompiledFrameRemainder1 = (0 == (lb.field_g & 8));
              if ((decompiledFrameRemainder1) &&
                (var9 == 0)) {
                break L2;
              }
            }
            if ((decompiledFrameRemainder1) && ((23 == var4 ||
              var4 == 24) && 0 == (lb.field_g & 4194304))) {
              break L2;
            }
            if (var4 >= 20 &&
              0 >= tc.field_b &&
              var9 == 0) {
              break L2;
            }
            gk.a(mh.field_a[44], (byte) -11);
            kj.field_x = null;
            mm.field_A = null;
            il.field_f = new nk(-19 + var4);
            rh.a((byte) -79, -1, param2);
            stackIn_76_0 = (0 < tc.field_b) ? 0 : 7;
            bk.field_e = stackIn_76_0;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            gk.a(mh.field_a[44], (byte) -11);
            kj.field_x = null;
            mm.field_A = null;
            il.field_f = new nk(0);
            rh.a((byte) 117, -1, param2);
            stackIn_81_0 = (tc.field_b > 0) ? 0 : 7;
            bk.field_e = stackIn_81_0;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            stackIn_86_0 = !(df.field_f);
            df.field_f = stackIn_86_0;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            gk.a(mh.field_a[44], (byte) -11);
            rh.a((byte) -24, -1, param2);
            stackIn_91_0 = (tc.field_b <= 0) ? 7 : 0;
            bk.field_e = stackIn_91_0;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder3)) {
            var5 = 12;
            if (~var5 != ~bl.field_p) {
              hi.a(ee.field_b[var5], 2, false, 1, true, 2);
            }
            bl.field_p = var5;
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            if (bk.field_e != 7) {
              rh.a((byte) -128, 0, param2);
              if (var9 == 0) {
                break L2;
              }
            }
            rh.a((byte) 118, 7, param2);
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            rh.a((byte) 114, 7, param2);
            dm.field_f = 0;
            lb.field_g = 0;
            pe.field_b.a(false);
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            rh.a((byte) 110, 4, param2);
            bk.field_e = this.field_a;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            na.field_a = 0;
            rh.a((byte) 127, 3, param2);
            bk.field_e = this.field_a;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            rh.a((byte) -80, bk.field_e, param2);
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            rh.a((byte) -45, 2, param2);
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder3)) {
            if (this.field_f.c(-119)) {
              ce.a(0, (byte) -127);
              gk.a(mh.field_a[0], (byte) -11);
            }
            if (this.field_f.b(false)) {
              ce.a(256, (byte) -119);
              gk.a(mh.field_a[0], (byte) -11);
            }
            if (this.field_f.e(106)) {
              id.a(74);
              gk.a(mh.field_a[0], (byte) -11);
            }
            if (this.field_f.b((byte) 127)) {
              ph.b(!param1);
              gk.a(mh.field_a[0], (byte) -11);
            }
            if (!this.field_f.c((byte) 126)) {
              break L2;
            }
            var6Lifetime3 = aa.field_c + 128 + 9;
            var7 = (-var6Lifetime3 + this.c(-29187, param0) + this.d(-118, param0) >> 1) + (aa.field_c + 8);
            var8 = ua.field_a - var7 << 1;
            if (var8 <= 0) {
              ce.a(0, (byte) -118);
              if (var9 != 0) {
                if (var8 >= 256) {
                  ce.a(256, (byte) -127);
                  ce.a(var8, (byte) -118);
                } else {
                  ce.a(var8, (byte) -118);
                }
              }
            } else {
              if (var8 >= 256) {
                ce.a(256, (byte) -127);
                if (var9 != 0) {
                  ce.a(var8, (byte) -118);
                }
              } else {
                ce.a(var8, (byte) -118);
              }
            }
            if (0 >= this.field_j) {
              gk.a(mh.field_a[0], (byte) -11);
              this.field_j = 25;
            }
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder3)) {
            if (this.field_f.c(-121)) {
              ia.b(0, -23235);
            }
            if (this.field_f.b(param1)) {
              ia.b(256, -23235);
            }
            if (this.field_f.e(100)) {
              kj.i(117);
            }
            if (this.field_f.b((byte) 125)) {
              gk.b(2);
            }
            if (!this.field_f.c((byte) -21)) {
              break L2;
            }
            var6Lifetime2 = 9 + (aa.field_c + 128);
            var7Lifetime1 = 8 + (-var6Lifetime2 + (this.c(-29187, param0) + this.d(-95, param0)) >> 1) + aa.field_c;
            var8Lifetime1 = ua.field_a - var7Lifetime1 << 1;
            if (var8Lifetime1 > 0) {
              if (var8Lifetime1 < 256) {
                ia.b(var8Lifetime1, -23235);
                if (var9 != 0) {
                  ia.b(256, -23235);
                  ia.b(0, -23235);
                }
              } else {
                ia.b(256, -23235);
                if (var9 != 0) {
                  ia.b(0, -23235);
                }
              }
            } else {
              ia.b(0, -23235);
            }
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            if (null == mg.field_k) {
              var6Lifetime1 = param2 ? 1 : 0;
              ud.a(8, bk.field_d, var6Lifetime1 != 0, ob.field_I.field_B + ob.field_I.field_E, 6, 6, ob.field_I, ob.field_I.field_E, (byte) 5, 320, 240, qc.field_f);
              if (var9 == 0) {
                break L2;
              }
            }
            lb.a(true);
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder3)) {
            if (bl.field_p != 12) {
              hi.a(ee.field_b[12], 2, false, 1, true, 2);
            }
            bl.field_p = 12;
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            boolean decompiledFrameRemainder0 = true;
            gk.a(mh.field_a[45], (byte) -11);
            if (!n.b((byte) 73)) {
              il.field_f.c(-1);
              kj.field_x = null;
              if (dm.field_f == 0) {
                rh.a((byte) -7, 2, param2);
                decompiledFrameRemainder0 = (var9 != 0);
              }
              if (decompiledFrameRemainder0) {
                rh.a((byte) 125, 5, param2);
                if (var9 != 0) {
                  if (wf.field_c.field_e[0].field_d > 0) {
                    rh.a((byte) 38, 6, param2);
                    rh.a((byte) -25, 0, param2);
                  } else {
                    rh.a((byte) -25, 0, param2);
                  }
                }
              }
            } else {
              if (wf.field_c.field_e[0].field_d > 0) {
                rh.a((byte) 38, 6, param2);
                if (var9 != 0) {
                  rh.a((byte) -25, 0, param2);
                }
              } else {
                rh.a((byte) -25, 0, param2);
              }
            }
            stackIn_182_0 = (tc.field_b > 0) ? 0 : 7;
            bk.field_e = stackIn_182_0;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            dm.field_e = 0;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            dm.field_e = 1;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            dm.field_e = 2;
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            if (this.field_a == 4 ||
              2 == this.field_a ||
              this.field_a == 8) {
              pi.a(this.field_a, 19741, this.field_a);
              if (var9 == 0) {
                break L2;
              }
            }
            if (6 != this.field_a) {
              break L2;
            }
            stackIn_204_0 = (dm.field_f == 0) ? 2 : 5;
            pi.a(stackIn_204_0, 19741, 6);
            if (var9 == 0) {
              break L2;
            }
          }
          if ((decompiledFrameRemainder22) &&
            (decompiledFrameRemainder3)) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            if (!this.e(param0, -114)) {
              break L2;
            }
            na.field_a = na.field_a - 1;
            if (this.e(param0, -44)) {
              break L2;
            }
            this.field_f.field_h = 2;
            if (var9 == 0) {
              break L2;
            }
          }
          if (decompiledFrameRemainder3) {
            if (!this.field_f.a((byte) -1)) {
              break L2;
            }
            if (!this.e(param0, 126)) {
              break L2;
            }
            na.field_a = na.field_a + 1;
            if (this.e(param0, 125)) {
              break L2;
            }
            this.field_f.field_h = 0;
            if (var9 == 0) {
              break L2;
            }
          }
          if (this.field_f.a((byte) -1)) {
            if (mg.field_k != null) {
              lb.a(!param1);
            }
            ja.a(-99, uj.b((byte) -120));
          }
        }
        if (param1) {
          this.field_j = 123;
        }
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        if (param1 <= 8) {
          this.field_f = (ml) null;
        }
        if (7 == this.field_a) {
          var3 = -1;
        }
        if (this.field_a == 0 &&
          this.field_f.field_h != -1) {
          var3 = this.field_f.field_h;
        }
        if (this.field_a == 1 &&
          this.field_f.field_h != -1 &&
          kf.field_c != -1) {
          var3 = this.field_f.field_h;
        }
        if (3 == this.field_a) {
          var3 = 2;
        }
        this.field_f.a(var3, this.a(vl.field_d, -21016, ua.field_a), 0, param0);
        this.field_h = -1;
        if (this.field_a == 7) {
          vk.a(0, param0);
        }
    }

    private final void a(int param0) {
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        String stackIn_96_0 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        sc var10_ref_sc = null;
        int var11_int = 0;
        gj var11 = null;
        String[] var12 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        String var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int[] var32 = null;
        String var9Lifetime1;
        int var10Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var26Lifetime1;
        int var18Lifetime2Lifetime1;
        int var19Lifetime2Lifetime1;
        var28 = OrbDefence.field_D ? 1 : 0;
        var3 = this.a((byte) -12);
        var4 = 123;
        var5 = 108;
        var6 = 394;
        if (wj.field_m == 2) {
          var6 += 20;
          var4 -= 10;
        }
        var7 = 280;
        if (wj.field_m == 3) {
          var4 -= 10;
          var6 += 20;
        }
        var2 = 0;
        if (param0 <= 34) {
          this.field_i = -11;
        }
        ul.d(var2 + var4, var2 + var5, -(var2 * 2) + var6, -(var2 * 2) + var7, var3);
        var2++;
        ul.d(var4 + var2, var2 + var5, -(var2 * 2) + var6, var7 - var2 * 2, var3);
        var2++;
        ul.d(var4 + var2, var2 + var5, -(2 * var2) + var6, -(2 * var2) + var7, 0);
        var2++;
        var8_int = var2 + var5;
        while (var5 - (-var7 + var2) > var8_int) {
          ul.f(var2 + var4, var8_int, var6 - 2 * var2, 0, 128);
          var8_int++;
          if (var28 == 0) {
            continue;
          }
          break;
        }
        var8 = df.field_a;
        if (dm.field_e == 1) {
          var8 = hh.field_e;
        }
        if (2 == dm.field_e) {
          var8 = bk.field_c;
        }
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder3 = true;
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameCompleted1 = true;
        this.a(-29253, var8);
        if (!n.b((byte) 67)) {
          var9_int = 0;
          while (var9_int < 6) {
            var10 = 0;
            var11_int = 0;
            stackIn_51_0 = -1;
            stackIn_51_1 = ~var9_int;
            if (var28 != 0) {
              decompiledFrameCompleted1 = false;
              break;
            }
            if (stackIn_51_0 == stackIn_51_1) {
              var11_int = 160;
              var10 = 75;
            }
            if (var9_int == 1) {
              var11_int = 240;
              var10 = 75;
            }
            if (var9_int == 2) {
              var11_int = 320;
              var10 = 75;
            }
            if (var9_int == 3) {
              var11_int = 160;
              var10 = 565;
            }
            if (var9_int == 4) {
              var11_int = 240;
              var10 = 565;
            }
            if (5 == var9_int) {
              var11_int = 320;
              var10 = 565;
            }
            var11_int -= 30;
            var10 -= 40;
            if ((n.b((byte) 74) ||
              !(tc.field_b > 0)) && var9_int > 0) {
              me.field_n.d(var10 + 8, var11_int);
            }
            if (~n.field_a != ~var9_int) {
              hi.field_g[var9_int].e(var10, var11_int, 80, 60, 255);
              if (!(var10 > ua.field_a) &&
                !(vl.field_d < var11_int) &&
                !(ua.field_a >= (var10 + 80)) &&
                !((60 + var11_int) <= vl.field_d) &&
                of.field_G == 1) {
                kj.field_x = null;
                n.field_a = var9_int;
              }
            } else {
              hg.field_ab.e(var10, var11_int - 5, 192);
              hi.field_g[var9_int].e(var10, var11_int, 80, 60, 255);
            }
            ob.field_I.c(gb.field_g[var9_int], 40 + var10, var11_int + 70, 16777215, 0);
            var9_int++;
          }
        }
        if ((decompiledFrameCompleted1) &&
          (decompiledFrameRemainder2 = !(n.b((byte) -99))) &&
          (decompiledFrameRemainder1 = (kj.field_x == null))) {
          stackIn_51_0 = 1;
          stackIn_51_1 = 3;
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1)) {
          kj.field_x = fh.a(stackIn_51_0, stackIn_51_1, n.field_a, 10, (byte) -38);
        }
        if (decompiledFrameRemainder2) {
          boolean decompiledFrameRemainder0 = true;
          var10_ref_sc = ob.field_I;
          var11 = kj.field_x;
          if (!var11.field_h) {
            var9 = ql.field_f;
            decompiledFrameRemainder0 = (var28 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null == var11.field_i) {
              var9 = pg.field_b;
              decompiledFrameRemainder0 = (var28 != 0);
            }
            if (decompiledFrameRemainder0) {
              var9 = oa.field_a;
              var12 = var11.field_i[dm.field_e];
              var32 = var11.field_l[dm.field_e];
              var14 = oc.a(dm.field_e, -1, mm.field_A, var11);
              var10_ref_sc.a("10. ");
              var15 = jd.field_c.field_H + 140;
              var16 = 310;
              var17 = 320;
              var15 -= 20;
              var18 = 128;
              var19 = 512;
              var20 = 28900 - (jd.field_c.field_H / 2 + (240 - var15)) * (240 + (-var15 + jd.field_c.field_H / 2));
              var21 = 128;
              if (var20 > 0) {
                var21 = (int)Math.sqrt((double)var20);
              }
              var18Lifetime1 = -var21 + var17;
              var19Lifetime1 = 320 + var21;
              var22 = 16777215;
              if (~var2 == ~var14) {
                var22 = 16759807;
              }
              var10_ref_sc.b(bg.field_d, var18Lifetime1, var15, var22, -1);
              var10_ref_sc.c(nh.field_e, var16 + (var19Lifetime1 - 320) / 4, var15, var22, -1);
              var10_ref_sc.a(we.field_F, var19Lifetime1, var15, var22, -1);
              var15 += 20;
              var2 = 0;
              while (var2 < 10) {
                var18Lifetime2 = 128;
                var19Lifetime2 = 512;
                var20Lifetime1 = 28900 - (-var15 + 240 + jd.field_c.field_H / 2) * (jd.field_c.field_H / 2 + (-var15 + 240));
                var21Lifetime1 = 128;
                stackIn_93_0 = -1;
                stackIn_93_1 = ~var20Lifetime1;
                if (var28 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_93_0 > stackIn_93_1) {
                  var21Lifetime1 = (int)Math.sqrt((double)var20Lifetime1);
                }
                var18Lifetime2Lifetime1 = var17 - var21Lifetime1;
                var19Lifetime2Lifetime1 = 320 + var21Lifetime1;
                if (null != var12[var2]) {
                  var22Lifetime1 = 16777215;
                  var23 = var32[var2];
                  var24 = var12[var2];
                  if (var2 == var14) {
                    ul.a(var18Lifetime2Lifetime1 - 30, -12 + var15, -var18Lifetime2Lifetime1 + (60 + var19Lifetime2Lifetime1), 16, 6, 16759807, 64);
                    var22Lifetime1 = 16759807;
                  }
                  boolean decompiledFrameRemainder4 = true;
                  jd.field_c.a(1 + var2 + ". ", var18Lifetime2Lifetime1 - 1, var15, 0, 0);
                  jd.field_c.b(var24, var18Lifetime2Lifetime1 - 1, var15, 0, 0);
                  jd.field_c.a(1 + var2 + ". ", var18Lifetime2Lifetime1, -1 + var15, 0, 0);
                  jd.field_c.b(var24, var18Lifetime2Lifetime1, var15 - 1, 0, 0);
                  jd.field_c.a(var2 + 1 + ". ", var18Lifetime2Lifetime1, var15, var22Lifetime1, -1);
                  jd.field_c.b(var24, var18Lifetime2Lifetime1, var15, var22Lifetime1, -1);
                  var25 = var23 % 105;
                  if (var25 >= 100) {
                    var26 = 0;
                    while ((var25 - 99) > var26) {
                      hg.field_ab.a(-11 + var16 + ((var19Lifetime2Lifetime1 - 320) / 4 + (8 * (100 - (var25 - 2 * var26)) + (int)(Math.sin((double)var2 + 0.005 * (double)ji.b(-78)) * 8.0))), var15 - 14);
                      var26++;
                    }
                    jd.field_c.c(this.b(var25, -70), (-320 + var19Lifetime2Lifetime1) / 4 + var16, var15 - 1, 0, 0);
                    jd.field_c.c(this.b(var25, -86), var16 + ((var19Lifetime2Lifetime1 - 320) / 4 - 1), var15, 0, 0);
                    jd.field_c.c(this.b(var25, -75), (var19Lifetime2Lifetime1 - 320) / 4 + var16, var15, var22Lifetime1, -1);
                    decompiledFrameRemainder4 = false;
                  }
                  else {
                    if (var25 < 100 &&
                      0 < var25) {
                      var26Lifetime1 = 11 + (-1 + var25) / 11 * 11;
                      var27 = jc.field_f[n.field_a][-1 + var26Lifetime1];
                      ab.field_g[12 * var27].a(-11 + (var19Lifetime2Lifetime1 - 320) / 4 - (-var16 - (int)(8.0 * Math.sin(0.005 * (double)ji.b(122) + (double)var2))), var15 - 16);
                      jd.field_c.c(this.b(var25, -114), var16 + (var19Lifetime2Lifetime1 - 320) / 4, var15 - 1, 0, 0);
                      jd.field_c.c(this.b(var25, -124), -1 + var16 + (-320 + var19Lifetime2Lifetime1) / 4, var15, 0, 0);
                      jd.field_c.c(this.b(var25, -81), var16 + (-320 + var19Lifetime2Lifetime1) / 4, var15, var22Lifetime1, -1);
                    } else {
                      jd.field_c.c(this.b(var25, -126), -1 + (var16 + (-320 + var19Lifetime2Lifetime1) / 4), var15, 0, 0);
                      jd.field_c.c(this.b(var25, -80), (-320 + var19Lifetime2Lifetime1) / 4 + var16, -1 + var15, 0, 0);
                      jd.field_c.c(this.b(var25, -75), var16 + (-320 + var19Lifetime2Lifetime1) / 4, var15, var22Lifetime1, -1);
                    }
                  }
                  jd.field_c.a(this.a(var23 / 105, -1001), var19Lifetime2Lifetime1 - 1, var15, 0, 0);
                  jd.field_c.a(this.a(var23 / 105, -1001), var19Lifetime2Lifetime1, var15 - 1, 0, 0);
                  jd.field_c.a(this.a(var23 / 105, -1001), var19Lifetime2Lifetime1, var15, var22Lifetime1, -1);
                  var9 = "";
                }
                var15 += 20;
                var2++;
              }
              if ((decompiledFrameCompleted0) &&
                (il.field_f != null &&
                var14 == -1 &&
                ~n.field_a == ~il.field_f.field_b)) {
                ul.a(148, var15 - 12, 344, 16, 6, 16759807, 64);
                jd.field_c.b(gb.field_h, 168, var15, 16759807, -1);
                jd.field_c.c(this.b(wf.field_c.field_x, -88), 348, var15, 16759807, -1);
                jd.field_c.a(this.a(wf.field_c.field_e[0].field_d, -1001), 462, var15, 16759807, -1);
              }
            }
          }
          if (decompiledFrameCompleted0) {
            decompiledFrameRemainder3 = (var28 != 0);
          }
        }
        if ((decompiledFrameRemainder3) &&
          (decompiledFrameCompleted0)) {
          var9 = oa.field_a;
        }
        if (decompiledFrameCompleted0) {
          stackIn_93_0 = ob.field_I.field_H;
          stackIn_93_1 = 240;
        }
        var10Lifetime1 = stackIn_93_0 + stackIn_93_1;
        ob.field_I.c(var9, 320, var10Lifetime1, 16777215, -1);
        if (!n.b((byte) -92)) {
          stackIn_96_0 = h.field_L;
        } else {
          stackIn_96_0 = qk.field_a;
        }
        var9Lifetime1 = stackIn_96_0;
        jd.field_c.c(var9Lifetime1, 320, 220 + ob.field_I.field_H + 140, 16777215, -1);
    }

    private final void a(byte param0, boolean param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_102_0 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sc var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var18Lifetime1;
        var19 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 16) {
          this.a(true, (byte) 123);
        }
        var4 = this.b(param2, (byte) 24);
        var5 = this.c(param0 ^ -29203, param2);
        var6 = this.d(-97, param2);
        var7 = vh.field_q[this.field_a][param2];
        var8 = jg.field_n[var7];
        if (var8 == null) {
          var8 = "ERROR: missing text";
        }
        var9 = -var5 + this.d(param0 - 128, param2);
        var10 = this.a(param2, (byte) 123);
        if (param1) {
        }
        if (var7 >= 8 &&
          10 >= var7 &&
          dm.field_e != param2) {
        }
        stackIn_13_0 = (param1) ? 16759807 : 16777215;
        var11 = stackIn_13_0;
        var12 = ob.field_I;
        var13 = -var12.field_B + (-bk.field_d[0].field_t + (var10 - bk.field_d[6].field_t)) - var12.field_H;
        var13Lifetime1 = -16;
        if (var7 != 12 &&
          var7 != 13) {
          var14 = 1;
          if (var7 == 20 && (!(tc.field_b > 0) ||
            n.b((byte) 120))) {
            var14 = 0;
          }
          if (var7 == 21 && (!(tc.field_b > 0) ||
            n.b((byte) 49))) {
            var14 = 0;
          }
          if (22 == var7 && (0 == (lb.field_g & 8) ||
            !(tc.field_b > 0) ||
            n.b((byte) 118))) {
            var14 = 0;
          }
          if (23 == var7 && ((4194304 & lb.field_g) == 0 ||
            !(tc.field_b > 0) ||
            n.b((byte) 59))) {
            var14 = 0;
          }
          if (var7 == 24 && ((lb.field_g & 4194304) == 0 ||
            !(tc.field_b > 0) ||
            n.b((byte) 43))) {
            var14 = 0;
          }
          boolean decompiledFrameRemainder1 = true;
          var15 = 32;
          if (var7 < 19 ||
            var7 > 24) {
            if (16777215 == var11) {
              cb.field_a.a(param0 - 56);
              cc.field_t.c(var8.toLowerCase(), (var9 >> 1) + var5, bk.field_d[0].field_t + (var4 + (cc.field_t.field_H + (var13Lifetime1 >> 1))), 0, -1);
              vj.field_b.d();
              decompiledFrameRemainder1 = (var19 != 0);
            }
            if (decompiledFrameRemainder1) {
              cc.field_t.c(var8.toLowerCase(), (var9 >> 1) + var5, (var13Lifetime1 >> 1) + (bk.field_d[0].field_t + (cc.field_t.field_H + var4)), 1, -1);
              if (var11 == 16777215) {
                ul.e(2, 2, 10 + var5, var4 - 1, var6 + (-var5 - 20), var15);
              }
              if (var11 != 16777215 ||
                var19 != 0) {
                ul.e(10, 2, var5 + 10, var4 - 1, -20 - var5 + var6, var15);
              }
              cb.field_a.a(param0 - 56);
              cc.field_t.c(var8.toLowerCase(), (var9 >> 1) + var5, bk.field_d[0].field_t + (var4 + (cc.field_t.field_H + (var13Lifetime1 >> 1))), 0, -1);
              vj.field_b.d();
            }
          }
          if ((decompiledFrameRemainder1) && (!(var7 < 19) &&
            !(var7 > 24) || var19 != 0)) {
            var5 = 150;
            if (var11 == 16777215) {
              cb.field_a.a(param0 ^ -56);
              cc.field_t.b(var8.toLowerCase(), var5, (var13Lifetime1 >> 1) + bk.field_d[0].field_t + (var4 + cc.field_t.field_H), 0, -1);
              vj.field_b.d();
              if (var19 != 0) {
                cc.field_t.b(var8.toLowerCase(), var5, (var13Lifetime1 >> 1) + (cc.field_t.field_H + (var4 + bk.field_d[0].field_t)), 1, -1);
                if (16777215 != var11) {
                  ul.e(10, 2, -10 + var5, -1 + var4, -20 + (var6 - var5), var15);
                }
                ul.e(2, 2, -10 + var5, var4 - 1, -20 + (-var5 + var6), var15);
                cb.field_a.a(-40);
                cc.field_t.b(var8.toLowerCase(), var5, var4 + cc.field_t.field_H - (-bk.field_d[0].field_t - (var13Lifetime1 >> 1)), 0, -1);
                vj.field_b.d();
              }
            } else {
              cc.field_t.b(var8.toLowerCase(), var5, (var13Lifetime1 >> 1) + (cc.field_t.field_H + (var4 + bk.field_d[0].field_t)), 1, -1);
              ul.e(10, 2, -10 + var5, -1 + var4, -20 + (var6 - var5), var15);
              if (16777215 == var11 ||
                var19 != 0) {
                ul.e(2, 2, -10 + var5, var4 - 1, -20 + (-var5 + var6), var15);
              }
              cb.field_a.a(-40);
              cc.field_t.b(var8.toLowerCase(), var5, var4 + cc.field_t.field_H - (-bk.field_d[0].field_t - (var13Lifetime1 >> 1)), 0, -1);
              vj.field_b.d();
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (var14 == 0) {
            if (!(tc.field_b > 0) ||
              n.b((byte) -117)) {
              me.field_n.a(8 + cc.field_t.a(var8.toLowerCase()) + var5, -4 + var4);
              decompiledFrameRemainder0 = (var11 == 16759807);
              if (decompiledFrameRemainder0) {
                jd.field_c.a(of.field_I, 340, 210, 160, 80, 16711680, 0, 1, 1, 18);
                decompiledFrameRemainder0 = (var19 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              al.field_d.a(var5 + (cc.field_t.a(var8.toLowerCase()) + 8), var4 - 4);
              if (var11 == 16759807) {
                var16 = 2;
                if (var7 == 22) {
                  var16 = 3;
                  if (var19 != 0 && (var7 == 23 ||
                    24 == var7)) {
                    var16 = 22;
                  }
                } else {
                  if (var7 == 23 ||
                    24 == var7) {
                    var16 = 22;
                  }
                }
                jd.field_c.a(t.a(-415993727, new String[]{gj.field_j[var16]}, wl.field_b), 340, 210, 160, 80, 16711680, -1, 1, 1, 18);
              }
            }
          }
        }
        if (var7 == 12 ||
          var7 == 13 || var19 != 0) {
          var5 -= 8;
          var14Lifetime1 = 128 + aa.field_c + 9;
          var15Lifetime1 = var5 + (-var14Lifetime1 + var9 >> 1);
          var16 = 32;
          if (var11 != 16777215) {
            cc.field_t.a(var8.toLowerCase(), var5 + (var9 >> 1), (var13Lifetime1 >> 1) + (var4 + cc.field_t.field_H + bk.field_d[0].field_t), 1, -1);
            ul.e(10, 2, 10 + var5, -1 + var4, -20 + var6 - var5, var16);
            cb.field_a.a(-40);
            cc.field_t.a(var8.toLowerCase(), (var9 >> 1) + var5, bk.field_d[0].field_t + cc.field_t.field_H + (var4 + (var13Lifetime1 >> 1)), 0, -1);
            vj.field_b.d();
          }
          if (var11 == 16777215 ||
            var19 != 0) {
            cb.field_a.a(param0 ^ -56);
            cc.field_t.a(var8.toLowerCase(), (var9 >> 1) + var5, bk.field_d[0].field_t + cc.field_t.field_H + (var4 + (var13Lifetime1 >> 1)), 0, -1);
            vj.field_b.d();
          }
          var15Lifetime1 = var15Lifetime1 + (aa.field_c + 16);
          var17 = 0;
          var18 = var15Lifetime1;
          while (true) {
            if (var18 < (128 + var15Lifetime1)) {
              stackIn_99_0 = 0;
              stackIn_99_1 = var17;
              if (var19 == 0) {
                if (stackIn_99_0 == stackIn_99_1) {
                  ul.h(-2 + var18, -var17 - 2 - 1 + (var4 + var10 / 2), 12, var17 * 2 + 6, 3351108);
                } else {
                  ul.h(var18, -1 + var4 + var10 / 2 - 2 - var17, 10, 6 + var17 * 2, 3351108);
                }
                if (var17 == 3) {
                  ul.h(var18 + 22, -var17 - 3 + (var4 + var10 / 2), 12, 2 * var17 + 6, 3351108);
                } else {
                  ul.h(var18 + 22, -var17 - 2 + (-1 + var10 / 2 + var4), 10, var17 * 2 + 6, 3351108);
                }
                ul.h(var18, -var17 + var10 / 2 + (var4 - 1), 8, 2 + var17 * 2, var11);
                ul.h(var18 + 24, -var17 + (-1 + var4 + var10 / 2), 8, var17 * 2 + 2, var11);
                ul.h(var18 + 12, -2 + (-1 + var10 / 2 + var4), 8, 6, 3351108);
                ul.h(var18 + 14, var4 + var10 / 2 - 1, 4, 2, var11);
                var17++;
                var18 += 32;
                continue;
              }
            } else {
              stackIn_99_0 = var7;
              stackIn_99_1 = 12;
            }
            break;
          }
          if (stackIn_99_0 != stackIn_99_1) {
            stackIn_102_0 = ij.field_g;
          } else {
            stackIn_102_0 = ck.field_f;
          }
          var18Lifetime1 = stackIn_102_0;
          ul.h(-2 + (var15Lifetime1 + (var18Lifetime1 >> 1)) - 2, 3 + (var4 - 2), 8, 4 + (-6 + var10), 3351108);
          ul.h(var15Lifetime1 - (-(var18Lifetime1 >> 1) + 2), 3 + var4, 4, -6 + var10, var11);
        }
    }

    private final String a(int param0, int param1) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        String var3Lifetime1;
        String var3Lifetime2;
        String var6Lifetime1;
        String var6Lifetime2;
        var5 = OrbDefence.field_D ? 1 : 0;
        var3 = "";
        var6 = var3;
        var3Lifetime1 = var6;
        var6Lifetime1 = var3Lifetime1;
        var3Lifetime2 = var6Lifetime1;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (param0 < 1000))) {
          var4 = param0 % 1000;
          var6Lifetime2 = var4 + var3Lifetime2;
          var3Lifetime2 = var6Lifetime2;
          var3Lifetime2 = var6Lifetime2;
          var3Lifetime2 = var6Lifetime2;
          param0 = param0 / 1000;
          stackIn_10_0 = 10;
          stackIn_10_1 = var4;
          if (var5 == 0) {
            if (stackIn_10_0 > stackIn_10_1) {
              var3Lifetime2 = ck.field_k + "00" + var6Lifetime2;
            } else if (100 > var4) {
              var3Lifetime2 = ck.field_k + "0" + var3Lifetime2;
            } else {
              var3Lifetime2 = ck.field_k + var3Lifetime2;
            }
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = param1;
          stackIn_10_1 = -1001;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          this.field_j = 107;
        }
        return param0 + var3Lifetime2;
    }

    private final int d(int param0, int param1) {
        if (param0 >= -92) {
          ja.c(-40);
        }
        if (this.field_a == 2 &&
          !n.b((byte) 68)) {
          return this.c(-29187, param1) + 180;
        }
        if (this.field_a == 2 &&
          n.b((byte) 68)) {
          return vb.field_g[this.field_a] + 100;
        }
        if (this.field_a == 3) {
          return this.c(-29187, param1) + 200;
        }
        if (this.field_a != 4 &&
          this.field_a != 5) {
          return vb.field_g[this.field_a];
        }
        return 400 + this.c(-29187, param1);
    }

    private final int a(byte param0) {
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_51_0 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        long var15 = 0L;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var13Lifetime1;
        int var15_intLifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        var20 = OrbDefence.field_D ? 1 : 0;
        var2 = 2228258;
        if (1 != this.field_a) {
          ul.h(0, 240, 640, 240, 4456516);
          var3 = 5;
          var4 = 0;
          do {
            if (var4 >= 640) {
              var4 = 240;
              break;
            }
            ul.b(var4, 240, 240, var2);
            var4 = var4 + var3;
          } while (var20 == 0);
          do {
            if (var4 >= 480) {
              var4 = 240;
              break;
            }
            ul.a(0, var4, 640, var2);
            var4 = var4 + var3;
          } while (var20 == 0);
          do {
            if (var4 >= 480) {
              var4 = 0;
              ul.d(var4, var4, -(var4 * 2) + 640, -(2 * var4) + 480, 9737364);
              var4++;
              ul.d(var4, var4, 640 - 2 * var4, -(2 * var4) + 480, 9737364);
              var4++;
              ul.d(var4, var4, -(var4 * 2) + 640, -(var4 * 2) + 480, 9737364);
              var4++;
              ul.d(var4, var4, -(var4 * 2) + 640, 480 - 2 * var4, 0);
              var4++;
              ul.d(var4, var4, -(2 * var4) + 640, -(2 * var4) + 480, 5789784);
              var4++;
              break;
            }
            ul.f(0, var4, 640, 0, (480 - var4) * 256 / 240);
            var4++;
          } while (var20 == 0);
          ul.d(var4, var4, -(2 * var4) + 640, 480 - 2 * var4, 0);
        }
        var3 = 4000;
        var3 = (4000 * lc.field_o + 3695 * (-lc.field_o + 100)) / 100;
        ul.f(320, 240, var3 * 215 / 4000, 0);
        ul.b(5112, 3832, var3, 256, ql.field_b);
        var4 = 300 * lc.field_o / 100 + 3200;
        if (param0 != -12) {
          this.field_i = -86;
        }
        var5 = 320;
        var6 = 240;
        var7 = 120 * var4 / 3200;
        var8 = var4 * 100 / 3200;
        var9 = var4 * 3 / 4;
        var10 = var7 * var7;
        var11 = var8 * var8;
        var12 = var9 * var9 >>> 8;
        var14 = 0;
        var15_int = -var7;
        boolean decompiledNaturalLoopExit1 = false;
        while (!(decompiledNaturalLoopExit1 = (var15_int >= 0))) {
          var13 = var14;
          stackIn_31_0 = var12 * (var10 - (1 + var15_int) * (1 + var15_int));
          if (var20 == 0) {
            var16 = stackIn_31_0;
            while ((var10 * var14 * var14) < var16) {
              var14++;
            }
            var17 = var15_int + (var7 + (10 + (var6 - (var4 >> 4))));
            var18 = -52 * (var7 + var15_int) / (var7 + var8) + 60;
            ul.f(-var13 + var5, var17, 2 * var13, 16777215, var18);
            km.a(var18, 121, 16777215, var17, -var14 + var5, 0, var14 - var13);
            km.a(0, 80, 16777215, var17, var5 + var13, var18, -var13 + var14);
            var15_int++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit1) {
          stackIn_31_0 = 0;
        }
        var15_intLifetime1 = stackIn_31_0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var15_intLifetime1 >= var8))) {
          var13Lifetime1 = var14;
          stackIn_40_0 = (var11 - (1 + var15_intLifetime1) * (1 + var15_intLifetime1)) * var12;
          if (var20 == 0) {
            var16Lifetime1 = stackIn_40_0;
            while (var14 * (var14 * var11) > var16Lifetime1) {
              var14--;
            }
            var17Lifetime1 = var15_intLifetime1 + 10 + (var6 - (var4 >> 4) + var7);
            var18Lifetime1 = (var7 + var15_intLifetime1) * -52 / (var7 + var8) + 60;
            ul.f(-var14 + var5, var17Lifetime1, var14 * 2, 16777215, var18Lifetime1);
            km.a(var18Lifetime1, 125, 16777215, var17Lifetime1, -var13Lifetime1 + var5, 0, var13Lifetime1 - var14);
            km.a(0, param0 + 90, 16777215, var17Lifetime1, var14 + var5, var18Lifetime1, var13Lifetime1 - var14);
            var15_intLifetime1++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_40_0 = -2;
        }
        if (stackIn_40_0 != ~this.field_a) {
          var15 = ji.b(121);
          ul.e(6, 6, 634, 474);
          var17Lifetime2 = 10;
          while (var17Lifetime2 < 540) {
            stackIn_51_0 = var17Lifetime2;
            if (var20 != 0) {
              return stackIn_51_0;
            }
            if (stackIn_51_0 < 120 ||
              var17Lifetime2 > 440) {
              var5Lifetime1 = (int)((double)var17Lifetime2 + Math.cos(0.0001 * (double)var15 + (double)var17Lifetime2) * 32.0);
              var6Lifetime1 = (int)(80.0 * Math.sin((double)var17Lifetime2 + 0.0003 * (double)var15));
              var6Lifetime1 += 480;
              var18Lifetime2 = 0;
              var19 = (int)(((double)var15 * 0.01 + (double)var17Lifetime2) % (double)wh.field_a[var18Lifetime2]);
              ab.field_g[var19 + var18Lifetime2 * 12].c(var5Lifetime1, var6Lifetime1);
            }
            var17Lifetime2 += 64;
          }
          ul.c();
        }
        return var2;
    }

    private final void b(int param0) {
        int stackIn_15_0 = 0;
        boolean stackIn_18_0 = false;
        sc stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_26_0 = 0;
        boolean stackIn_60_0 = false;
        int stackIn_67_0 = 0;
        boolean stackOut_17_0;
        boolean stackOut_59_0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        long var12_long = 0L;
        double var12_double = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var16_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int var12Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        int var12Lifetime1Lifetime3;
        int var13Lifetime2Lifetime1;
        int var14Lifetime1Lifetime1;
        int var15Lifetime1Lifetime1;
        int var15Lifetime1Lifetime2;
        var20 = OrbDefence.field_D ? 1 : 0;
        var3 = this.a((byte) -12);
        var4 = 53;
        var5 = 108;
        var6 = 534;
        var7 = 284;
        var2 = 0;
        ul.d(var2 + var4, var2 + var5, -(2 * var2) + var6, -(2 * var2) + var7, var3);
        var2++;
        ul.d(var2 + var4, var5 + var2, var6 - var2 * 2, -(var2 * 2) + var7, var3);
        var2++;
        ul.d(var2 + var4, var2 + var5, -(var2 * 2) + var6, var7 - var2 * 2, 0);
        var2++;
        var8 = var2 + var5;
        do {
          if (var8 >= (-var2 + var7 + var5)) {
            this.a(-29253, hi.field_l);
            var8 = 18;
            break;
          }
          ul.f(var2 + var4, var8, var6 - var2 * 2, 0, 128);
          var8++;
        } while (var20 == 0);
        if (2 <= na.field_a) {
          var8 = 20;
        }
        var9 = new String[50];
        var22 = new int[50];
        var21 = var22;
        var10 = var21;
        var11 = 0;
        boolean decompiledNaturalLoopExit1 = false;
        while (!(decompiledNaturalLoopExit1 = (var11 >= 50))) {
          var10[var11] = var6 - 24;
          stackIn_15_0 = 5;
          if (var20 == 0) {
            if (stackIn_15_0 == na.field_a) {
              var10[var11] = var10[var11] - 64;
            }
            var11++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit1) {
          var11 = jd.field_c.a(t.a(-415993727, new String[]{"          "}, oa.field_i[na.field_a]), var22, var9);
          stackIn_15_0 = 0;
        }
        var12 = stackIn_15_0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var11 <= var12))) {
          stackOut_17_0 = var9[var12].startsWith("<b>");
          stackIn_26_0 = stackOut_17_0 ? 1 : 0;
          stackIn_18_0 = stackOut_17_0;
          if (var20 == 0) {
            if (!stackIn_18_0) {
              stackIn_21_0 = jd.field_c;
              stackIn_21_1 = var9[var12];
              stackIn_21_2 = 12 + var4;
              if (na.field_a == 5) {
                stackIn_22_3 = 64;
              } else {
                stackIn_22_3 = 0;
              }
              ((sc) (Object) stackIn_21_0).b(stackIn_21_1, stackIn_21_2 + stackIn_22_3, var8 * (-(var11 / 2) + var12) + var7 / 2 + var5, 16777215, 0);
            } else {
              ob.field_I.b(var9[var12], var4 + 12, (var12 - var11 / 2) * var8 + (var5 + var7 / 2), 16777215, 0);
            }
            var12++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_26_0 = param0;
        }
        if (stackIn_26_0 > -74) {
          field_d = (String) null;
        }
        ob.field_I.c(oa.a(oa.field_i.length, (byte) -2, na.field_a + 1), 555, 380, 16777215, -1);
        if (na.field_a != 0) {
          if (na.field_a != 1) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (na.field_a == 2) {
              var12Lifetime1 = 80;
              var13 = 165;
              var2 = 0;
              while (var2 < 5) {
                if (var20 != 0) {
                  return;
                }
                boolean decompiledFrameRemainder0 = true;
                if (var2 > 4 && (n.b((byte) -75) ||
                  !(tc.field_b > 0))) {
                  var13 = var13 + var8 * 2;
                  me.field_n.a(var12Lifetime1, -40 + var13);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  hf.field_g[0 + 7 * var2].d(var12Lifetime1, var13);
                  hf.field_g[2 + 7 * var2].a(-92, var12Lifetime1 + 20, 12 + var13, 10000, 2048);
                  var14 = var13;
                  if (var2 == 2) {
                    var13 -= 4;
                  }
                  if (var2 == 3) {
                    var13 -= 6;
                  }
                  if (4 == var2) {
                    var13 -= 8;
                  }
                  hf.field_g[var2 * 7 + 1].d(var12Lifetime1, var13);
                  var13 = var14 + 2 * var8;
                }
                var2++;
              }
              decompiledFrameRemainder1 = (var20 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (na.field_a == 3) {
                var12Lifetime1Lifetime1 = 10 + var4;
                var13Lifetime1 = 170;
                var2 = 0;
                while (var2 < 4) {
                  ab.field_g[var2 * 12].d(var12Lifetime1Lifetime1, var13Lifetime1);
                  var13Lifetime1 = var13Lifetime1 + var8 * 2;
                  var2++;
                  if (var20 != 0) {
                    return;
                  }
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (na.field_a == 4) {
                  var12Lifetime1Lifetime2 = var4 + 10;
                  var13Lifetime2 = 170;
                  var2 = 4;
                  while (8 > var2) {
                    if (var20 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (var2 < 8 ||
                      !n.b((byte) 93) &&
                      !(tc.field_b <= 0)) {
                      ab.field_g[12 * var2].d(var12Lifetime1Lifetime2, var13Lifetime2);
                      var13Lifetime2 = var13Lifetime2 + var8 * 2;
                    } else {
                      var13Lifetime2 = var13Lifetime2 + 2 * var8;
                      me.field_n.a(var12Lifetime1Lifetime2 + 9, -36 + var13Lifetime2);
                    }
                    var2++;
                  }
                  if ((decompiledFrameCompleted1) &&
                    (decompiledFrameRemainder1 = (var20 != 0))) {
                    var12Lifetime1Lifetime2 = 10 + var4;
                    var13Lifetime2Lifetime1 = 170;
                    var2 = 0;
                    decompiledFrameRemainder1 = !(var2 >= 4);
                    if (decompiledFrameRemainder1) {
                      ab.field_g[var2 * 12].d(var12Lifetime1Lifetime2, var13Lifetime2Lifetime1);
                      var13Lifetime2Lifetime1 = var13Lifetime2Lifetime1 + var8 * 2;
                      var2++;
                      return;
                    }
                  }
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameCompleted1)) {
                  if (na.field_a != 5) {
                    if (na.field_a != 6) {
                      return;
                    }
                    var12Lifetime1Lifetime3 = 20 + var4;
                    var13Lifetime3 = 155;
                    var2 = 9;
                    while (true) {
                      if (10 >= var2) {
                        stackOut_59_0 = n.b((byte) 42);
                        stackIn_67_0 = stackOut_59_0 ? 1 : 0;
                        stackIn_60_0 = stackOut_59_0;
                        if (var20 == 0) {
                          if (stackIn_60_0 ||
                            !(0 < tc.field_b)) {
                            var13Lifetime3 = var13Lifetime3 + var8 * 2;
                            me.field_n.a(var12Lifetime1Lifetime3, -40 + var13Lifetime3);
                          } else {
                            ab.field_g[var2 * 12].d(var12Lifetime1Lifetime3 - 8, var13Lifetime3);
                            var13Lifetime3 = var13Lifetime3 + var8 * 2;
                          }
                          var2++;
                          continue;
                        }
                      } else {
                        var13Lifetime3 = 295;
                        stackIn_67_0 = 5;
                      }
                      break;
                    }
                    var2 = stackIn_67_0;
                    while (6 >= var2) {
                      if (var20 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (!n.b((byte) -96) &&
                        tc.field_b > 0) {
                        if (var2 != 6) {
                          hf.field_g[0 + 7 * var2].d(var12Lifetime1Lifetime3, var13Lifetime3);
                        } else {
                          hf.field_g[0 + 7 * var2].d(16 + var12Lifetime1Lifetime3, var13Lifetime3);
                          hf.field_g[0 + var2 * 7].d(var12Lifetime1Lifetime3 - 16, var13Lifetime3);
                        }
                        hf.field_g[2 + 7 * var2].a(-89, var12Lifetime1Lifetime3 + 20, var13Lifetime3 + 12, 38000, 2048);
                        var14Lifetime1 = var13Lifetime3;
                        if (2 == var2) {
                          var13Lifetime3 -= 4;
                        }
                        if (var2 == 3) {
                          var13Lifetime3 -= 6;
                        }
                        if (var2 == 4) {
                          var13Lifetime3 -= 8;
                        }
                        if (var2 == 6) {
                          var15 = 200;
                          var16 = var12Lifetime1Lifetime3;
                          var17 = 6 + var13Lifetime3;
                          var18 = 32 + var12Lifetime1Lifetime3;
                          var19 = var13Lifetime3 + 6;
                          ul.f(-1 + var16, var17, var18 - 1, var19, 11176191, var15);
                          ul.f(var16 + 1, var17, 1 + var18, var19, 11176191, var15);
                          ul.f(var16, var17 - 1, var18, -1 + var19, 11176191, var15);
                          ul.f(var16, 1 + var17, var18, var19 + 1, 11176191, var15);
                          ul.f(var16, var17, var18, var19, 16777215, var15);
                          hf.field_g[1 + var2 * 7].d(16 + var12Lifetime1Lifetime3, var13Lifetime3);
                          hf.field_g[var2 * 7 + 1].d(-16 + var12Lifetime1Lifetime3, var13Lifetime3);
                        } else {
                          hf.field_g[1 + 7 * var2].d(var12Lifetime1Lifetime3, var13Lifetime3);
                        }
                        var13Lifetime3 = var14Lifetime1 + 2 * var8;
                      } else {
                        var13Lifetime3 = var13Lifetime3 + 2 * var8;
                        me.field_n.a(var12Lifetime1Lifetime3, var13Lifetime3 - 40);
                      }
                      var2++;
                    }
                    if (decompiledFrameCompleted0) {
                      decompiledFrameRemainder1 = (var20 != 0);
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameCompleted0)) {
                    var12_long = ji.b(-65);
                    var14Lifetime1Lifetime1 = 95;
                    var15Lifetime1 = 190;
                    var16_double = -Math.abs(Math.sin(0.005 * (double)var12_long + (double)var2));
                    ul.i(var14Lifetime1Lifetime1, (int)((double)var15Lifetime1 + var16_double * 5.0), 16, 16742399, 64);
                    ul.i(var14Lifetime1Lifetime1, (int)((double)var15Lifetime1 + var16_double * 4.0), 15, 16751103, 96);
                    ul.i(var14Lifetime1Lifetime1, (int)((double)var15Lifetime1 + var16_double * 3.0), 14, 16759807, 128);
                    ul.i(var14Lifetime1Lifetime1, (int)((double)var15Lifetime1 + 2.0 * var16_double), 13, 16768511, 192);
                    ul.f(var14Lifetime1Lifetime1, var15Lifetime1, 12, 16777215);
                    ul.f(var14Lifetime1Lifetime1, (int)((double)var15Lifetime1 + var16_double * 2.0), 6, 16768511);
                    ul.f(var14Lifetime1Lifetime1, (int)(3.0 * var16_double + (double)var15Lifetime1), 5, 16759807);
                    ul.f(var14Lifetime1Lifetime1, (int)(4.0 * var16_double + (double)var15Lifetime1), 4, 16751103);
                    ul.f(var14Lifetime1Lifetime1, (int)(5.0 * var16_double + (double)var15Lifetime1), 3, 16742399);
                    var14Lifetime1Lifetime1 = 80;
                    var15Lifetime1Lifetime1 = 240;
                    hf.field_g[0].d(var14Lifetime1Lifetime1, var15Lifetime1Lifetime1);
                    hf.field_g[2].a(-89, 20 + var14Lifetime1Lifetime1, 12 + var15Lifetime1Lifetime1, 10000, 2048);
                    hf.field_g[1].d(var14Lifetime1Lifetime1, var15Lifetime1Lifetime1);
                    var16Lifetime1 = (int)(Math.sin((double)var12_long * 0.01) * 48.0) + 64;
                    ul.a(15 + var14Lifetime1Lifetime1 << 4, 2 + var15Lifetime1Lifetime1 << 4, var16Lifetime1, 255, ki.field_f);
                    var14Lifetime1Lifetime1 = 85 + (int)(Math.sin(0.003 * (double)var12_long) * 8.0);
                    var15Lifetime1Lifetime2 = 312 - Math.abs((int)(4.0 * Math.sin(0.0065 * (double)var12_long)));
                    ab.field_g[0].a(var14Lifetime1Lifetime1, var15Lifetime1Lifetime2);
                    return;
                  }
                }
              }
            }
          } else {
            var12_double = (double)ji.b(-128) * 0.0025;
            hg.field_ab.e((int)(88.0 * Math.cos(var12_double)) + 370, 114 + (int)(Math.sin(1.9 * var12_double) * 4.0), 10);
            var12_double = var12_double + 0.15;
            hg.field_ab.e(370 + (int)(Math.cos(var12_double) * 98.0), (int)(Math.sin(1.9 * var12_double) * 4.0) + 114, 30);
            var12_double = var12_double + 0.15;
            hg.field_ab.e(370 + (int)(108.0 * Math.cos(var12_double)), 114 + (int)(4.0 * Math.sin(1.9 * var12_double)), 50);
            var12_double = var12_double + 0.15;
            hg.field_ab.e((int)(118.0 * Math.cos(var12_double)) + 370, 114 + (int)(Math.sin(1.9 * var12_double) * 4.0), 70);
            var12_double = var12_double + 0.15;
            hg.field_ab.c((int)(128.0 * Math.cos(var12_double)) + 370, (int)(Math.sin(var12_double * 1.9) * 4.0) + 114);
          }
        }
        return;
    }

    private final String b(int param0, int param1) {
        int discarded$0 = 0;
        if (param0 == 100) {
          return bi.field_d;
        }
        if (param0 == 101) {
          return oe.field_q;
        }
        if (param0 == 102) {
          return cc.field_r;
        }
        if (param1 > -65) {
          discarded$0 = this.d(-118, -13);
        }
        if (param0 == 103) {
          return nb.field_o;
        }
        if (param0 == 104) {
          return mg.field_h;
        }
        return Integer.toString(param0);
    }

    final void b(byte param0) {
        int discarded$0 = 0;
        sc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        boolean stackIn_36_2 = false;
        boolean stackIn_37_3 = false;
        boolean stackIn_40_4 = false;
        sc stackIn_42_0 = null;
        boolean stackIn_42_1 = false;
        boolean stackIn_43_2 = false;
        boolean stackIn_46_3 = false;
        sc stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        boolean stackIn_49_2 = false;
        boolean stackIn_52_3 = false;
        boolean stackIn_57_0 = false;
        int stackIn_60_1 = 0;
        boolean stackIn_61_2 = false;
        int stackIn_64_0 = 0;
        boolean stackOut_56_0;
        int var2 = 0;
        hj var3_ref_hj = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var2Lifetime4;
        int var3Lifetime2;
        boolean decompiledFrameRemainder1 = true;
        var10 = OrbDefence.field_D ? 1 : 0;
        if (this.field_a == 0) {
          if (fk.field_b.field_o != 640) {
            var3_ref_hj = fk.field_b.f();
            var3_ref_hj.e();
            var3_ref_hj.d();
            fk.field_b.b(0, 0, 16711935);
            ul.e(5, 5, 0, 0, 640, 128);
            fk.field_b.c(0, 0);
            cb.field_a.a(-40);
            fk.field_b = var3_ref_hj;
          }
          var3 = this.a((byte) -12);
          var4 = im.field_a[this.field_a];
          var5 = wd.field_o[this.field_a] - 24;
          var6 = vb.field_g[this.field_a] - im.field_a[this.field_a];
          var7 = 48 + vh.field_q[this.field_a].length * ek.field_e[this.field_a] - 16;
          var2 = 0;
          var8 = lc.field_o * 255 / 100;
          ul.g(var2 + var4, var2 + var5, -(var2 * 2) + var6, -(2 * var2) + var7, var3, var8);
          var2++;
          ul.g(var4 + var2, var2 + var5, -(2 * var2) + var6, var7 - var2 * 2, var3, var8);
          var2++;
          ul.g(var2 + var4, var5 + var2, -(var2 * 2) + var6, -(2 * var2) + var7, 0, var8);
          var2++;
          var9 = var5 + var2;
          while (true) {
            if ((-var2 + (var7 + var5)) > var9) {
              ul.c(var2 + var4, var9, -(2 * var2) + var6, 2232627, var8);
              var9++;
              if (var10 == 0) {
                continue;
              }
            } else {
              fk.field_b.e(10, lc.field_o - 65, 255 * lc.field_o / 100);
              wj.b((byte) 124);
            }
            break;
          }
          decompiledFrameRemainder1 = (var10 != 0);
        }
        if ((decompiledFrameRemainder1) &&
          (1 == this.field_a)) {
          var2Lifetime4 = this.a((byte) -12);
          im.field_a[this.field_a] = im.field_a[0];
          vb.field_g[this.field_a] = vb.field_g[0];
          var3Lifetime2 = im.field_a[this.field_a];
          var4Lifetime1 = wd.field_o[this.field_a] - 24;
          var5Lifetime1 = -im.field_a[this.field_a] + vb.field_g[this.field_a];
          var6Lifetime1 = 48 + vh.field_q[this.field_a].length * ek.field_e[this.field_a];
          var7Lifetime1 = 0;
          var8Lifetime1 = lc.field_o * 255 / 100;
          ul.g(var3Lifetime2 + var7Lifetime1, var4Lifetime1 + var7Lifetime1, -(var7Lifetime1 * 2) + var5Lifetime1, var6Lifetime1 - 2 * var7Lifetime1, var2Lifetime4, var8Lifetime1);
          var7Lifetime1++;
          ul.g(var7Lifetime1 + var3Lifetime2, var4Lifetime1 + var7Lifetime1, -(var7Lifetime1 * 2) + var5Lifetime1, -(2 * var7Lifetime1) + var6Lifetime1, var2Lifetime4, var8Lifetime1);
          var7Lifetime1++;
          ul.g(var3Lifetime2 + var7Lifetime1, var7Lifetime1 + var4Lifetime1, var5Lifetime1 - 2 * var7Lifetime1, -(var7Lifetime1 * 2) + var6Lifetime1, 0, var8Lifetime1);
          var7Lifetime1++;
          var9Lifetime1 = var7Lifetime1 + var4Lifetime1;
          while (true) {
            if (-var7Lifetime1 + var6Lifetime1 + var4Lifetime1 > var9Lifetime1) {
              ul.c(var3Lifetime2 + var7Lifetime1, var9Lifetime1, var5Lifetime1 - var7Lifetime1 * 2, 2232627, var8Lifetime1);
              var9Lifetime1++;
              if (var10 == 0) {
                continue;
              }
            } else {
              fk.field_b.e(10, 35, 255);
            }
            break;
          }
          wj.b((byte) 124);
        }
        boolean decompiledFrameRemainder0 = true;
        vj.field_b.d();
        ul.d();
        cb.field_a.a(-40);
        if (this.field_a == 8) {
          this.a(false);
          decompiledFrameRemainder0 = (var10 != 0);
        }
        if (decompiledFrameRemainder0) {
          if (this.field_a == 2) {
            this.a(120);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (3 == this.field_a) {
              this.b(-95);
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (4 != this.field_a) {
                if (this.field_a == 5) {
                  this.a((byte) 127, true);
                  decompiledFrameRemainder0 = (var10 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if ((6 != this.field_a) &&
                    (decompiledFrameRemainder0 = (this.field_a == 7))) {
                    fm.a(241);
                    return;
                  }
                  if (decompiledFrameRemainder0) {
                    discarded$0 = this.a((byte) -12);
                    wd.field_o[this.field_a] = 230;
                    il.field_f.field_i = wf.field_c.field_e[0].field_d;
                    var2Lifetime1 = ob.field_I.field_H + 160;
                    var3Lifetime1 = ob.field_I.field_B + (ob.field_I.field_E + 4);
                    ob.field_I.c(fh.field_b, 320, var2Lifetime1, 16777215, -1);
                    stackIn_36_0 = ob.field_I;
                    stackIn_36_1 = -113;
                    stackIn_36_2 = false;
                    stackIn_37_3 = (0 != il.field_f.field_i);
                    stackIn_40_4 = (dm.field_f != 0);
                    ((sc) (Object) stackIn_36_0).c(sa.$cfr$intArgs$a$c7de0d339b2a(stackIn_36_1, stackIn_36_2, stackIn_37_3, stackIn_40_4), 320, var3Lifetime1 + var2Lifetime1, 16777215, -1);
                    stackIn_42_0 = ob.field_I;
                    stackIn_42_1 = false;
                    stackIn_43_2 = (dm.field_f != 0);
                    stackIn_46_3 = (0 != il.field_f.field_i);
                    ((sc) (Object) stackIn_42_0).c(sd.a(stackIn_42_1, stackIn_43_2, stackIn_46_3, 30775), 320, var2Lifetime1 + 5 * var3Lifetime1 + 30, 16777215, -1);
                    stackIn_48_0 = ob.field_I;
                    stackIn_48_1 = -14189;
                    stackIn_49_2 = (il.field_f.field_i != 0);
                    stackIn_52_3 = (dm.field_f != 0);
                    ((sc) (Object) stackIn_48_0).c(tj.a(stackIn_48_1, stackIn_49_2, stackIn_52_3, false), 320, 60 + 8 * var3Lifetime1 + var2Lifetime1, 16777215, -1);
                    if (var10 != 0) {
                      this.a((byte) 125, false);
                    }
                  }
                }
              } else {
                this.a((byte) 125, false);
              }
            }
          }
        }
        vj.field_b.d();
        var2Lifetime2 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!(this.field_f.field_i > var2Lifetime2)))) {
          stackOut_56_0 = this.e(var2Lifetime2, 126);
          stackIn_64_0 = stackOut_56_0 ? 1 : 0;
          stackIn_57_0 = stackOut_56_0;
          if (var10 == 0) {
            if (stackIn_57_0) {
              stackIn_60_1 = 16;
              stackIn_61_2 = (~var2Lifetime2 == ~this.field_f.field_h);
              this.a((byte) stackIn_60_1, stackIn_61_2, var2Lifetime2);
            }
            var2Lifetime2++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          cb.field_a.a(-40);
          stackIn_64_0 = -91 % ((-83 - param0) / 34);
        }
        var2Lifetime3 = stackIn_64_0;
        vj.field_b.e(0, 0, 255 * lc.field_o / 100);
        return;
    }

    private final void a(byte param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_82_0 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        boolean[] var10 = null;
        boolean[] var11 = null;
        boolean[] var12 = null;
        boolean[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        String var20 = null;
        Object var21_ref = null;
        hj var21_ref_hj = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        String var20Lifetime1;
        int var3Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var22Lifetime1;
        int var23Lifetime1;
        var24 = OrbDefence.field_D ? 1 : 0;
        var4 = this.a((byte) -12);
        var5 = 53;
        var6 = 108;
        var7 = 534;
        var8 = 312;
        var3 = 0;
        ul.d(var5 + var3, var3 + var6, -(var3 * 2) + var7, -(2 * var3) + var8, var4);
        var3++;
        ul.d(var3 + var5, var3 + var6, -(2 * var3) + var7, -(2 * var3) + var8, var4);
        var3++;
        ul.d(var5 + var3, var6 + var3, var7 - var3 * 2, var8 - var3 * 2, 0);
        var3++;
        var9_int = var3 + var6;
        while (var8 + (var6 - var3) > var9_int) {
          ul.f(var3 + var5, var9_int, -(var3 * 2) + var7, 0, 192);
          var9_int++;
          if (var24 == 0) {
            continue;
          }
          break;
        }
        var9 = wc.field_b;
        if (param1) {
          var9 = field_d;
        }
        this.a(-29253, var9);
        var10 = new boolean[]{false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, true, true, true, true, false};
        var11 = new boolean[]{true, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        var12 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false};
        var13 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true};
        var5Lifetime1 = 102;
        var14 = 120;
        var15 = 0;
        if (param1) {
          stackIn_8_0 = dm.field_f;
        } else {
          stackIn_8_0 = lb.field_g;
        }
        var16 = stackIn_8_0;
        var17 = -1;
        var18 = ok.a(0, false) ? 1 : 0;
        var19 = 0;
        if (param0 < 115) {
          field_e = true;
        }
        var20_int = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!(var20_int < gj.field_j.length)))) {
          var21_ref = null;
          stackIn_61_0 = -1;
          stackIn_61_1 = ~(var16 & 1 << var20_int);
          if (var24 == 0) {
            boolean decompiledFrameRemainder2 = true;
            if (stackIn_61_0 != stackIn_61_1) {
              var21_ref_hj = bd.field_o[var20_int];
            } else {
              decompiledFrameRemainder2 = !(param1);
              if (decompiledFrameRemainder2) {
                if (var12[var20_int] ||
                  var13[var20_int] &&
                  var18 == 0) {
                  var19++;
                  decompiledFrameRemainder2 = false;
                }
                else {
                  if (tc.field_b <= 0 &&
                    var10[var20_int]) {
                    var21_ref_hj = me.field_n;
                  } else {
                    var21_ref_hj = al.field_d;
                  }
                }
              }
            }
            if (decompiledFrameRemainder2) {
              var22 = var5Lifetime1;
              var23 = var14;
              if (var12[var20_int] ||
                var13[var20_int] &&
                var18 == 0) {
                var23 = 120;
                if (var19 > 0) {
                  var22 = 482;
                } else {
                  var22 = 64;
                }
                var19++;
              }
              if (var22 <= ua.field_a &&
                (var22 + 32) >= ua.field_a &&
                vl.field_d >= var23 &&
                vl.field_d <= (32 + var23)) {
                ul.a(var22 + 16 << 4, 16 + var23 << 4, 384, 255, ki.field_f);
                var17 = var20_int;
              }
              var21_ref_hj.a(var22, var23);
              if (var22 <= this.field_i &&
                this.field_i <= (32 + var22) &&
                this.field_c >= var23 &&
                var23 + 32 >= this.field_c) {
                if (this.field_h != var20_int) {
                  this.field_h = var20_int;
                } else {
                  this.field_h = -1;
                }
                this.field_i = -1;
              }
              if (this.field_h == var20_int) {
                ul.a(16 + var22 << 4, 16 + var23 << 4, 384, 255, ki.field_f);
              }
              if (!var12[var20_int]) {
                var5Lifetime1 += 38;
                if (522 < var5Lifetime1) {
                  var15 += 32;
                  var5Lifetime1 = 83;
                  var14 = 120 + var15;
                }
              }
            }
            var20_int++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_61_0 = 0;
          stackIn_61_1 = this.field_h;
        }
        if (stackIn_61_0 <= stackIn_61_1) {
          var17 = this.field_h;
        }
        if (var17 == -1) {
          ob.field_I.c(kd.field_f, 320, 264, 16777215, -1);
          if (!n.b((byte) 62)) {
            return;
          }
          ob.field_I.c(qk.field_a, 320, 32 + (3 * ob.field_I.field_H + 232), 16777215, -1);
          if (var24 == 0) {
            return;
          }
        }
        var14Lifetime1 = 220;
        var5Lifetime2 = 470;
        ob.field_I.c(dj.field_e, var5Lifetime2 - 1, var14Lifetime1, 0, 0);
        ob.field_I.c(dj.field_e, var5Lifetime2, -1 + var14Lifetime1, 0, 0);
        ob.field_I.c(dj.field_e, var5Lifetime2, var14Lifetime1, 11154431, -1);
        var14Lifetime1 += 24;
        var20 = Integer.toString(100 * wd.field_D[var17]);
        if (var11[var17] &&
          (var16 & 1 << var17) == 0) {
          var20 = OrbDefence.field_E;
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder0 = true;
        ob.field_I.c(var20, -1 + var5Lifetime2, var14Lifetime1, 0, 0);
        ob.field_I.c(var20, var5Lifetime2, -1 + var14Lifetime1, 0, 0);
        ob.field_I.c(var20, var5Lifetime2, var14Lifetime1, 16777215, -1);
        var5Lifetime2 = 470;
        var14Lifetime1 = 280;
        ob.field_I.c(nf.field_n, -1 + var5Lifetime2, var14Lifetime1, 0, 0);
        ob.field_I.c(nf.field_n, var5Lifetime2, -1 + var14Lifetime1, 0, 0);
        ob.field_I.c(nf.field_n, var5Lifetime2, var14Lifetime1, 11154431, -1);
        if (var11[var17] &&
          0 == (var16 & 1 << var17)) {
          var14Lifetime1 += 32;
          ob.field_I.c(var20, var5Lifetime2 - 1, var14Lifetime1, 0, 0);
          ob.field_I.c(var20, var5Lifetime2, var14Lifetime1 - 1, 0, 0);
          ob.field_I.c(var20, var5Lifetime2, var14Lifetime1, 16777215, -1);
          decompiledFrameRemainder0 = (var24 != 0);
        }
        if (decompiledFrameRemainder0) {
          var5Lifetime2 = var5Lifetime2 - (ba.field_e.field_o / 2 + (-1 + wd.field_D[var17]) * ba.field_e.field_o / 6);
          var3Lifetime1 = 0;
          while (!(wd.field_D[var17] <= var3Lifetime1)) {
            ba.field_e.c(var5Lifetime2, 12 + var14Lifetime1);
            var5Lifetime2 = var5Lifetime2 + ba.field_e.field_o / 3;
            var3Lifetime1++;
            if (var24 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          ((1 << var17 & var16) != 0)) {
          stackIn_82_0 = 1;
          decompiledFrameRemainder1 = false;
        }
        if (decompiledFrameRemainder1) {
          stackIn_82_0 = 0;
        }
        var21 = stackIn_82_0;
        var14Lifetime2 = 220;
        var5Lifetime3 = 170;
        if (var21 != 0) {
          ob.field_I.c(cb.field_g, -1 + var5Lifetime3, var14Lifetime2, 0, 0);
          ob.field_I.c(cb.field_g, var5Lifetime3, var14Lifetime2 - 1, 0, 0);
          ob.field_I.c(cb.field_g, var5Lifetime3, var14Lifetime2, 2293572, -1);
        }
        if (var21 == 0 ||
          var24 != 0) {
          ob.field_I.c(hc.field_k, var5Lifetime3 - 1, var14Lifetime2, 0, 0);
          ob.field_I.c(hc.field_k, var5Lifetime3, -1 + var14Lifetime2, 0, 0);
          ob.field_I.c(hc.field_k, var5Lifetime3, var14Lifetime2, 16720452, -1);
        }
        var22Lifetime1 = 160;
        var20Lifetime1 = va.field_b[var17];
        var14Lifetime2 += 10;
        if (var11[var17] &&
          (1 << var17 & var16) == 0) {
          var20Lifetime1 = od.field_h;
        }
        ob.field_I.a(var20Lifetime1, -1 + var5Lifetime3 - var22Lifetime1 / 2, 8 + var14Lifetime2, var22Lifetime1, 480, 0, 0, 1, 0, ob.field_I.field_H);
        ob.field_I.a(var20Lifetime1, var5Lifetime3 - var22Lifetime1 / 2, 8 + var14Lifetime2 - 1, var22Lifetime1, 480, 0, 0, 1, 0, ob.field_I.field_H);
        ob.field_I.a(var20Lifetime1, var5Lifetime3 - var22Lifetime1 / 2, 8 + var14Lifetime2, var22Lifetime1, 480, 16777215, -1, 1, 0, ob.field_I.field_H);
        var14Lifetime3 = 350;
        var5Lifetime4 = 320;
        ob.field_I.c(gj.field_j[var17], var5Lifetime4 - 1, var14Lifetime3, 0, 0);
        ob.field_I.c(gj.field_j[var17], var5Lifetime4, -1 + var14Lifetime3, 0, 0);
        ob.field_I.c(gj.field_j[var17], var5Lifetime4, var14Lifetime3, 16777215, -1);
        var23Lifetime1 = 200;
        if (var21 != 0) {
          bd.field_o[var17].c(256, var23Lifetime1);
          if (var24 != 0) {
            if (tc.field_b <= 0 &&
              var10[var17]) {
              me.field_n.c(256, var23Lifetime1);
              al.field_d.c(256, var23Lifetime1);
            } else {
              al.field_d.c(256, var23Lifetime1);
            }
          }
        } else {
          if (tc.field_b <= 0 &&
            var10[var17]) {
            me.field_n.c(256, var23Lifetime1);
            if (var24 != 0) {
              al.field_d.c(256, var23Lifetime1);
            }
          } else {
            al.field_d.c(256, var23Lifetime1);
          }
        }
        var23Lifetime1 = var23Lifetime1 + ob.field_I.field_H;
        return;
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        vj.field_b.d();
        if (param0 != -29253) {
          return;
        }
        try {
          param1 = param1.toUpperCase();
          var3_int = cc.field_t.a(param1);
          cc.field_t.c(param1, 320, 96, 1, -1);
          ul.e(5, 5, -(var3_int / 2) + 315, 59, 10 + var3_int, 42);
          cc.field_t.c(param1, 320, 96, 0, -1);
          cb.field_a.a(-40);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ja.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ja(int param0) {
        this.field_i = -1;
        this.field_h = -1;
        this.field_a = param0;
        this.field_f = new ml(vh.field_q[param0].length);
        fe.a(true);
    }

    static {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_d = "ACHIEVEMENTS THIS GAME";
    }
}
