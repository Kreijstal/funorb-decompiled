/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends pl {
    int field_G;
    int field_O;
    int field_L;
    int field_J;
    static boolean field_Q;
    int field_K;
    static int field_H;
    static int[] field_I;
    int field_M;
    static String field_P;
    static String field_F;
    static long field_N;

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          sg.field_b = new o[6][];
          ok.field_e = new o[6][5][];
          bd.field_c = new o[6];
          ok.field_e[0][0] = pe.a("", mi.field_E, "monster00", 110);
          ok.field_e[0][1] = pe.a("", mi.field_E, "monster01", 125);
          ok.field_e[0][2] = pe.a("", mi.field_E, "monster02", 121);
          ok.field_e[0][4] = pe.a("", mi.field_E, "monster04", 94);
          sg.field_b[0] = pe.a("", mi.field_E, "level1blocks", 110);
          bd.field_c[0] = vg.a(15, "level1background", mi.field_E, "");
          bd.field_c[1] = vg.a(15, "level2background", mi.field_E, "");
          sg.field_b[1] = pe.a("", mi.field_E, "level2blocks", 122);
          ok.field_e[1][0] = pe.a("", mi.field_E, "monster10", 97);
          ok.field_e[1][1] = pe.a("", mi.field_E, "monster11", 121);
          ok.field_e[1][2] = pe.a("", mi.field_E, "monster12", 96);
          ok.field_e[1][3] = pe.a("", mi.field_E, "monster13", 115);
          ok.field_e[1][4] = pe.a("", mi.field_E, "monster14", 112);
          bd.field_c[2] = vg.a(15, "level3background", mi.field_E, "");
          sg.field_b[2] = pe.a("", mi.field_E, "level3blocks", 102);
          ok.field_e[2][0] = pe.a("", mi.field_E, "monster20", 89);
          ok.field_e[2][1] = pe.a("", mi.field_E, "monster21", 124);
          ok.field_e[2][2] = pe.a("", mi.field_E, "monster22", 118);
          ok.field_e[2][3] = pe.a("", mi.field_E, "monster23", 97);
          ok.field_e[2][4] = pe.a("", mi.field_E, "monster24", 119);
          bd.field_c[3] = vg.a(15, "level4background", mi.field_E, "");
          sg.field_b[3] = pe.a("", mi.field_E, "level4blocks", 90);
          ok.field_e[3][0] = pe.a("", mi.field_E, "monster30", 111);
          ok.field_e[3][1] = pe.a("", mi.field_E, "monster31", 104);
          ok.field_e[3][2] = pe.a("", mi.field_E, "monster32", 118);
          ok.field_e[3][4] = pe.a("", mi.field_E, "monster34", 105);
          bd.field_c[4] = vg.a(15, "level5background", mi.field_E, "");
          sg.field_b[4] = pe.a("", mi.field_E, "level5blocks", 92);
          ok.field_e[4][0] = pe.a("", mi.field_E, "monster40", 125);
          if (param0 > -27) {
            ug.$cfr$intArgs$a$c8d31f67c1d5(false, -19, 6, -5, (le) null);
          }
          ok.field_e[4][1] = pe.a("", mi.field_E, "monster41", 91);
          ok.field_e[4][2] = pe.a("", mi.field_E, "monster42", 119);
          ok.field_e[4][3] = pe.a("", mi.field_E, "monster43", 121);
          ok.field_e[4][4] = pe.a("", mi.field_E, "monster44", 114);
          bd.field_c[5] = vg.a(15, "level6background", mi.field_E, "");
          sg.field_b[5] = pe.a("", mi.field_E, "level6blocks", 93);
          ok.field_e[5][0] = pe.a("", mi.field_E, "monster50", 107);
          ok.field_e[5][1] = pe.a("", mi.field_E, "monster52", 115);
          ok.field_e[5][2] = pe.a("", mi.field_E, "monster51", 90);
          ok.field_e[5][3] = pe.a("", mi.field_E, "monster53", 98);
          ok.field_e[5][4] = pe.a("", mi.field_E, "monster54", 107);
          hh.field_eb = pe.a("", mi.field_E, "monster55", 110);
          h.field_j = pe.a("", mi.field_E, "monster56", 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ug.EA(" + param0 + ')');
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        int var13 = 0;
        var13 = wizardrun.field_H;
        try {
          var8_int = 11 / ((param1 - 12) / 36);
          if (!super.a(param0, (byte) 69, param2, param3, param4, param5, param6)) {
            return false;
          }
          boolean decompiledFrameCompleted0 = true;
          var9 = -param0 - this.field_o + (-this.field_J + param2);
          var10 = param5 + (-this.field_L - param3) - this.field_l;
          if ((var9 * var9 + var10 * var10) < (this.field_G * this.field_G)) {
            var11 = Math.atan2((double)var10, (double)var9) - fb.field_b;
            if (var11 < 0.0) {
              var11 = var11 - 3.141592653589793 / (double)this.field_O;
              if ((var13 != 0) &&
                (var11 > 0.0)) {
                var11 = var11 + 3.141592653589793 / (double)this.field_O;
              }
            } else {
              if (var11 > 0.0) {
                var11 = var11 + 3.141592653589793 / (double)this.field_O;
              }
            }
            this.field_M = (int)(var11 * (double)this.field_O / 6.283185307179586);
            while (this.field_M >= this.field_O) {
              this.field_M = this.field_M - this.field_O;
              if (var13 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (var13 == 0) {
                continue;
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              do {
                if (this.field_M >= 0) {
                  break;
                }
                this.field_M = this.field_M + this.field_O;
              } while (var13 == 0);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("ug.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, int param2, int param3, le param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_39_0Lifetime1;
        int stackIn_39_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = wizardrun.field_H;
        try {
          var5_int = dj.a(false, 3 * (param2 - param3));
          var6 = 3 * param3;
          var7 = -10 + var5_int;
          vj.b(0);
          if (0 < param4.field_n &&
            null != param4.field_x) {
            of.c(45);
          }
          kg.field_c = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_N > var8)))) {
            var9 = param4.field_p[var8];
            var10 = param4.field_C[var8];
            var11 = param4.field_I[var8];
            stackOut_9_0 = param0;
            stackIn_49_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = nl.field_A[var9];
                var13 = d.field_c[var9];
                var14 = -var12 + nl.field_A[var10];
                var15 = -var12 + nl.field_A[var11];
                var16 = -var13 + d.field_c[var10];
                var17 = d.field_c[var11] - var13;
              }
              if (!stackIn_10_0 ||
                !(var14 * var17 - var16 * var15 >= 0)) {
                var12Lifetime1 = dl.field_a[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = dl.field_a[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = dl.field_a[var11];
                    if (-2147483648 != var14) {
                      var15 = var14 + (var13Lifetime1 + var12Lifetime1) - var6;
                      if (var7 >= 0) {
                        stackIn_28_0 = var15 >> var7;
                      } else {
                        stackIn_28_0 = var15 << -var7;
                      }
                      var16 = -stackIn_28_0 + (id.field_b.length - 1);
                      var17 = id.field_b[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_39_0 = ~var16;
                          stackIn_39_1 = -1;
                          if (stackIn_39_0 > stackIn_39_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = id.field_b[var16];
                          continue;
                        }
                        stackIn_39_0Lifetime1 = var16 << 4;
                        stackIn_39_1Lifetime1 = var17;
                        var18 = stackIn_39_0Lifetime1 + stackIn_39_1Lifetime1;
                        cb.field_e[var18] = var8;
                        id.field_b[var16] = var17 + 1;
                        if (0 < param4.field_n &&
                          param4.field_x != null) {
                          dupTemp$0 = param4.field_x[var8];
                          t.field_a[dupTemp$0] = t.field_a[dupTemp$0] + 1;
                        }
                        kg.field_c = kg.field_c + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_49_0 = param1;
          }
          if (stackIn_49_0 != 11) {
            field_H = -15;
          }
          if (param4.field_n > 0 &&
            null != param4.field_x) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(t.field_a.length <= var9Lifetime1)) {
              var10Lifetime1 = t.field_a[var9Lifetime1];
              t.field_a[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_68_0 = var5;
          stackIn_68_1 = new StringBuilder().append("ug.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -13542) {
            ug.d(-125);
          }
          field_F = null;
          field_I = null;
          field_P = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ug.DA(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, String param3, java.awt.Color param4) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        Throwable decompiledCaughtException = null;
        java.awt.Graphics var5 = null;
        Exception var5_ref = null;
        RuntimeException var5_ref2 = null;
        java.awt.Graphics var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        try {
          try {
            var5 = wizardrun.field_G.getGraphics();
            if (null == mh.field_ob) {
              mh.field_ob = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param1) {
              var5.setColor(java.awt.Color.black);
              var5.fillRect(0, 0, rg.field_R, rg.field_P);
            }
            if (null == param4) {
              param4 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (hg.field_b == null) {
                hg.field_b = wizardrun.field_G.createImage(304, 34);
              }
              var6 = hg.field_b.getGraphics();
              var6.setColor(param4);
              if (param0 != 10487) {
                ug.a(106, false, -93, (String) null, (java.awt.Color) null);
              }
              var6.drawRect(0, 0, 303, 33);
              var6.fillRect(2, 2, param2 * 3, 30);
              var6.setColor(java.awt.Color.black);
              var6.drawRect(1, 1, 301, 31);
              var6.fillRect(param2 * 3 + 2, 2, -(param2 * 3) + 300, 30);
              var6.setFont(mh.field_ob);
              var6.setColor(java.awt.Color.white);
              var6.drawString(param3, (-(6 * param3.length()) + 304) / 2, 22);
              var5.drawImage(hg.field_b, rg.field_R / 2 - 152, -18 + rg.field_P / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              var7 = rg.field_R / 2 - 152;
              var8 = -18 + rg.field_P / 2;
              var5.setColor(param4);
              var5.drawRect(var7, var8, 303, 33);
              var5.fillRect(2 + var7, 2 + var8, param2 * 3, 30);
              var5.setColor(java.awt.Color.black);
              var5.drawRect(var7 + 1, 1 + var8, 301, 31);
              var5.fillRect(var7 + 2 + 3 * param2, 2 + var8, -(3 * param2) + 300, 30);
              var5.setFont(mh.field_ob);
              var5.setColor(java.awt.Color.white);
              var5.drawString(param3, var7 + (304 - param3.length() * 6) / 2, 22 + var8);
            }
            if (gi.field_e != null) {
              var5.setFont(mh.field_ob);
              var5.setColor(java.awt.Color.white);
              var5.drawString(gi.field_e, rg.field_R / 2 - gi.field_e.length() * 6 / 2, rg.field_P / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (Exception) (Object) decompiledCaughtException;
            wizardrun.field_G.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_31_0 = var5_ref2;
          stackIn_31_1 = new StringBuilder().append("ug.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private ug() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ug.<init>()");
        }
    }

    static {
        field_Q = false;
        field_P = "the health bar down to nothing.";
        field_F = "Password is valid";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c8d31f67c1d5(boolean param0, int param1, int param2, int param3, le param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_39_0Lifetime1;
        int stackIn_39_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = wizardrun.field_H;
        try {
          var5_int = dj.a(false, 3 * (param2 - param3));
          var6 = 3 * param3;
          var7 = -10 + var5_int;
          vj.b(0);
          if (0 < param4.field_n &&
            null != param4.field_x) {
            of.c(45);
          }
          kg.field_c = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_N > var8)))) {
            var9 = param4.field_p[var8];
            var10 = param4.field_C[var8];
            var11 = param4.field_I[var8];
            stackOut_9_0 = param0;
            stackIn_49_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = nl.field_A[var9];
                var13 = d.field_c[var9];
                var14 = -var12 + nl.field_A[var10];
                var15 = -var12 + nl.field_A[var11];
                var16 = -var13 + d.field_c[var10];
                var17 = d.field_c[var11] - var13;
              }
              if (!stackIn_10_0 ||
                !(var14 * var17 - var16 * var15 >= 0)) {
                var12Lifetime1 = dl.field_a[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = dl.field_a[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = dl.field_a[var11];
                    if (-2147483648 != var14) {
                      var15 = var14 + (var13Lifetime1 + var12Lifetime1) - var6;
                      if (var7 >= 0) {
                        stackIn_28_0 = var15 >> var7;
                      } else {
                        stackIn_28_0 = var15 << -var7;
                      }
                      var16 = -stackIn_28_0 + (id.field_b.length - 1);
                      var17 = id.field_b[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_39_0 = ~var16;
                          stackIn_39_1 = -1;
                          if (stackIn_39_0 > stackIn_39_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = id.field_b[var16];
                          continue;
                        }
                        stackIn_39_0Lifetime1 = var16 << 4;
                        stackIn_39_1Lifetime1 = var17;
                        var18 = stackIn_39_0Lifetime1 + stackIn_39_1Lifetime1;
                        cb.field_e[var18] = var8;
                        id.field_b[var16] = var17 + 1;
                        if (0 < param4.field_n &&
                          param4.field_x != null) {
                          dupTemp$0 = param4.field_x[var8];
                          t.field_a[dupTemp$0] = t.field_a[dupTemp$0] + 1;
                        }
                        kg.field_c = kg.field_c + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_49_0 = param1;
          }
          if (stackIn_49_0 != 11) {
            field_H = -15;
          }
          if (param4.field_n > 0 &&
            null != param4.field_x) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(t.field_a.length <= var9Lifetime1)) {
              var10Lifetime1 = t.field_a[var9Lifetime1];
              t.field_a[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_68_0 = var5;
          stackIn_68_1 = new StringBuilder().append("ug.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
        }
    }
}
