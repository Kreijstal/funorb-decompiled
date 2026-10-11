/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pg extends ub {
    static String field_I;
    static String field_H;
    static kg field_K;
    static int field_G;
    static String field_F;
    static gn field_J;
    static String[] field_L;

    final static void a(int param0, qk param1, boolean param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
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
        var19 = HoldTheLine.field_D;
        try {
          var5_int = qm.a((-param4 + param0) * param3, (byte) -100);
          var6 = param4 * 3;
          var7 = var5_int - 10;
          p.a(80);
          if (param1.field_l > 0 &&
            null != param1.field_r) {
            go.b(-92);
          }
          rb.field_t = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param1.field_J > var8)))) {
            var9 = param1.field_w[var8];
            var10 = param1.field_Q[var8];
            var11 = param1.field_P[var8];
            stackOut_10_0 = param2;
            stackIn_49_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var19 == 0) {
              if (stackIn_11_0) {
                var12 = gd.field_d[var9];
                var13 = om.field_p[var9];
                var14 = -var12 + gd.field_d[var10];
                var15 = gd.field_d[var11] - var12;
                var16 = -var13 + om.field_p[var10];
                var17 = om.field_p[var11] - var13;
              }
              if (!stackIn_11_0 ||
                !(var14 * var17 - var16 * var15 >= 0)) {
                var12Lifetime1 = ff.field_c[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = ff.field_c[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = ff.field_c[var11];
                    if (var14 != -2147483648) {
                      var15 = var13Lifetime1 + (var12Lifetime1 + var14) - var6;
                      stackIn_27_0 = qg.field_d.length - 1;
                      if (var7 < 0) {
                        stackIn_28_1 = var15 << -var7;
                      } else {
                        stackIn_28_1 = var15 >> var7;
                      }
                      var16 = stackIn_27_0 - stackIn_28_1;
                      var17 = qg.field_d[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_39_0 = -1;
                          stackIn_39_1 = ~var16;
                          if (stackIn_39_0 < stackIn_39_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = qg.field_d[var16];
                          continue;
                        }
                        stackIn_39_0Lifetime1 = var17;
                        stackIn_39_1Lifetime1 = var16 << 4;
                        var18 = stackIn_39_0Lifetime1 + stackIn_39_1Lifetime1;
                        al.field_b[var18] = var8;
                        qg.field_d[var16] = var17 + 1;
                        if (param1.field_l > 0 &&
                          param1.field_r != null) {
                          dupTemp$0 = param1.field_r[var8];
                          pk.field_I[dupTemp$0] = pk.field_I[dupTemp$0] + 1;
                        }
                        rb.field_t = rb.field_t + 1;
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
            stackIn_49_0 = 0;
          }
          if (stackIn_49_0 < param1.field_l &&
            null != param1.field_r) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= pk.field_I.length)) {
              var10Lifetime1 = pk.field_I[var9Lifetime1];
              pk.field_I[var9Lifetime1] = var8Lifetime1;
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
          stackIn_63_0 = var5;
          stackIn_63_1 = new StringBuilder().append("pg.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 &&
            param0 != ud.field_d) {
            if (1 != param0 &&
              o.a(param0, 2) == null) {
              kd.field_c = 80;
              if (HoldTheLine.field_D != 0) {
                ud.field_d = param0;
              }
            } else {
              ud.field_d = param0;
            }
          }
          if (~param0 == ~ma.field_k) {
            return;
          }
          ma.field_k = param0;
          if (param1 <= 91) {
            field_K = (kg) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "pg.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, byte param1, String param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          uk.b(-45);
          if (param1 < 82) {
            return;
          }
          ka.field_b.a(false);
          lh.field_a = new vg(ec.field_v, (String) null, ci.field_o, param3, param0);
          sm.field_c = new si(ka.field_b, lh.field_a);
          ka.field_b.a(sm.field_c, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("pg.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_H = null;
          field_F = null;
          if (param0 != 6) {
            field_L = (String[]) null;
          }
          field_K = null;
          field_L = null;
          field_I = null;
          field_J = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "pg.M(" + param0 + ')');
        }
    }

    final static int a(byte param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -10 % ((57 - param0) / 62);
          stackIn_1_0 = qe.a(0, param2, 0, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("pg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(gn param0, int param1) {
        try {
          vk[] array$0 = null;
          int stackIn_5_0 = 0;
          boolean stackIn_10_0 = false;
          int stackIn_19_0 = 0;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          boolean stackOut_9_0;
          byte[] var2 = null;
          RuntimeException var2_ref = null;
          String[] var3 = null;
          String[][] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          String var8 = null;
          IOException var9 = null;
          int var10 = 0;
          var10 = HoldTheLine.field_D;
          try {
            var2 = param0.a((byte) -96, "level_progression.txt");
            var3 = ik.a(var2, 0);
            var4 = new String[6][];
            var4[0] = e.a(var3, 0, "s1");
            var4[1] = e.a(var3, 0, "s2");
            var4[2] = e.a(var3, 0, "s3");
            var4[3] = e.a(var3, 0, "s4");
            var4[4] = e.a(var3, 0, "tutorial");
            var4[5] = e.a(var3, 0, "demolition");
            vf.field_v = false;
            tk.field_c = new vk[6][];
            pc.field_l = new int[6];
            var5 = 0;
            if (param1 >= -85) {
              pg.a((String) null, (byte) 88);
            }
            while (true) {
              stackIn_5_0 = -7;
              if (stackIn_5_0 < ~var5) {
                var6 = var4[var5].length;
                pc.field_l[var5] = var6;
                array$0 = new vk[var6];
                tk.field_c[var5] = array$0;
                stackIn_19_0 = 0;
                if (var10 == 0) {
                  var7 = stackIn_19_0;
                  while (var7 < var6) {
                    var8 = var4[var5][var7];
                    stackOut_9_0 = param0.a(var8, "", 23158);
                    stackIn_5_0 = stackOut_9_0 ? 1 : 0;
                    stackIn_10_0 = stackOut_9_0;
                    if (!stackIn_10_0) {
                      tk.field_c[var5][var7] = new vk(var8);
                    } else {
                      try {
                        tk.field_c[var5][var7] = lm.a(param0.a((byte) 125, var4[var5][var7]), (byte) 121);
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var9 = (IOException) (Object) decompiledCaughtException;
                        throw new RuntimeException((String) null);
                      }
                    }
                    var7++;
                  }
                  var5++;
                  continue;
                }
              } else {
                stackIn_19_0 = -117;
              }
              j.$cfr$intArgs$a$65e274601245(stackIn_19_0, ik.a(param0.a((byte) 58, "tutorial.txt"), 0));
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var2_ref;
            stackIn_24_1 = new StringBuilder().append("pg.D(");
            if (param0 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        jd var7 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          var7 = ig.field_q;
          if (null != var7 &&
            this.b(param3, (byte) -105, param0, param2, param5)) {
            if (this.field_t instanceof c) {
              ((c) (this.field_t)).a(var7, (byte) 122, this);
              ig.field_q = null;
              if (HoldTheLine.field_D == 0) {
                return;
              }
            }
            if (var7.field_t instanceof c) {
              ((c) (var7.field_t)).a(var7, (byte) 113, this);
              ig.field_q = null;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_19_0 = runtimeException;
          stackIn_19_1 = new StringBuilder().append("pg.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static sh a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        sh var6 = null;
        sh stackIn_7_0 = null;
        sh stackIn_10_0 = null;
        sh stackIn_15_0 = null;
        sh stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0 &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_10_0 = fo.field_k;
              return stackIn_10_0;
            }
            var3 = param0.substring(0, var2_int);
            var5 = -101 % ((param1 + 63) / 35);
            var4 = param0.substring(var2_int + 1);
            var6 = mm.a(var3, 34);
            if (var6 != null) {
              stackIn_15_0 = var6;
              return stackIn_15_0;
            }
            stackIn_17_0 = cd.a((byte) -118, var4);
            return stackIn_17_0;
          }
          stackIn_7_0 = tg.field_g;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("pg.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, gn param1, gn param2, gn param3) {
        mg discarded$2 = null;
        RuntimeException runtimeException = null;
        byte[] var4 = null;
        bm[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9_int = 0;
        hj var9 = null;
        int var10_int = 0;
        hj var10 = null;
        hj var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        hj var15 = null;
        int var16 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int[] stackIn_19_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = HoldTheLine.field_D;
        try {
          fb.field_i = param2;
          wj.field_n = param1;
          ef.field_c = param3;
          var4 = ef.field_c.a("", false, "font");
          var5 = oc.a("", fb.field_i, (byte) 32, "font");
          qf.a(param0 ^ param0, -1, var4);
          ni.field_a = ce.a(0, var4, var5, 1, 16777215, param0 - 30857);
          qf.a(param0 ^ 30865, 2, var4);
          nm.field_c = ce.a(0, var4, var5, 2, 16777215, 8);
          HoldTheLine.field_F = om.a("font12", ef.field_c, "", 8192, fb.field_i);
          var6 = nm.field_c.field_N[0];
          nm.field_c.field_N = new int[10][];
          nm.field_c.field_N[0] = var6;
          nm.field_c.field_N[1] = mf.a(1, (byte) 102, 14737632, var6);
          nm.field_c.field_N[2] = mf.a(1, (byte) 97, 16724736, var6);
          nm.field_c.field_N[3] = mf.a(8388608, (byte) 118, 16711680, var6);
          nm.field_c.field_N[4] = mf.a(4194304, (byte) 93, 16764672, var6);
          nm.field_c.field_N[5] = mf.a(1, (byte) 121, 16763904, var6);
          var7 = HoldTheLine.field_F.field_N[0];
          HoldTheLine.field_F.field_N = new int[13][];
          HoldTheLine.field_F.field_N[0] = var7;
          HoldTheLine.field_F.field_N[4] = mf.a(1, (byte) 98, 14737632, var7);
          HoldTheLine.field_F.field_N[5] = mf.a(1, (byte) 93, 16724736, var7);
          HoldTheLine.field_F.field_N[2] = mf.a(1, (byte) 109, 16724736, var7);
          HoldTheLine.field_F.field_N[1] = mf.a(1, (byte) 99, 16763904, var7);
          HoldTheLine.field_F.field_N[3] = mf.a(1, (byte) 114, 16777087, var7);
          HoldTheLine.field_F.field_N[6] = mf.a(12632256, (byte) 116, 8421504, var7);
          HoldTheLine.field_F.field_N[7] = mf.a(1, (byte) 123, 8421504, var7);
          HoldTheLine.field_F.field_N[8] = mf.a(1, (byte) 99, 1, var7);
          var8_int = 0;
          do {
            if (!(nc.field_j.length > var8_int)) {
              im.field_b = dl.a(fb.field_i, "logo", false, "");
              td.field_a = dl.a(fb.field_i, "logo_large", false, "");
              uk.field_a = new hj(im.field_b.field_s, im.field_b.field_y);
              break;
            }
            nm.field_c.field_N[6 + var8_int] = mf.a(1, (byte) 103, nc.field_j[var8_int], var6);
            HoldTheLine.field_F.field_N[var8_int + 9] = mf.a(1, (byte) 114, nc.field_j[var8_int], var7);
            var8_int++;
          } while (var16 == 0);
          var8_int = im.field_b.field_z.length;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8_int <= 0))) {
            var8_int--;
            stackIn_19_0 = uk.field_a.field_z;
            if (var16 == 0) {
              stackIn_16_1 = var8_int;
              if (im.field_b.field_z[var8_int] == 0) {
                stackIn_17_2 = 0;
              } else {
                stackIn_17_2 = 1;
              }
              stackIn_19_0[stackIn_16_1] = stackIn_17_2;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            rf.field_ab = dl.a(fb.field_i, "locked", false, "");
            kj.field_q = dl.a(wj.field_n, "basic", false, "locked");
            ra.field_hb = dl.a(fb.field_i, "loading", false, "");
            ai.field_c = dl.a(wj.field_n, "basic", false, "orbcoin");
            hf.field_j = new ah();
            qn.field_m = new bm[14];
            qn.field_m[0] = hc.a("", fb.field_i, -123, "keyboard_space");
            qn.field_m[1] = hc.a("", fb.field_i, -117, "keyboard_esc");
            qn.field_m[2] = hc.a("", fb.field_i, -120, "keyboard_right");
            qn.field_m[3] = hc.a("", fb.field_i, -123, "keyboard_left");
            qn.field_m[4] = hc.a("", fb.field_i, -120, "keyboard_down");
            qn.field_m[5] = hc.a("", fb.field_i, -123, "keyboard_up");
            qn.field_m[6] = hc.a("", fb.field_i, wb.a(param0, -30976), "keyboard_enter");
            qn.field_m[7] = hc.a("", fb.field_i, -118, "keyboard_ctrl");
            qn.field_m[8] = hc.a("", fb.field_i, wb.a(param0, -30951), "keyboard_alt");
            qn.field_m[9] = hc.a("", fb.field_i, -128, "keyboard_tab");
            qn.field_m[10] = hc.a("", fb.field_i, -118, "keyboard_q");
            qn.field_m[11] = hc.a("", fb.field_i, -121, "keyboard_a");
            qn.field_m[12] = hc.a("", fb.field_i, wb.a(param0, -30958), "keyboard_x");
            qn.field_m[13] = hc.a("", fb.field_i, -124, "keyboard_c");
            stackIn_19_0 = new int[qn.field_m.length];
          }
          var8 = stackIn_19_0;
          var9_int = 0;
          do {
            if (!(qn.field_m.length > var9_int)) {
              HoldTheLine.field_F.a(qn.field_m, var8);
              ka.field_f = new hj(32, 32);
              vb.a(-114, ka.field_f);
              kj.field_q.c(0, 0, 32, 32);
              ug.b(param0 ^ -30866);
              cm.field_d = dl.a(fb.field_i, "flag", false, "");
              kc.field_a = new va("benefits");
              rm.field_A = new uf("mb_template");
              jf.field_a = new uf("mb_buttonframe");
              bo.field_d = new uf("mb_logotext");
              nj.field_i = dl.a(fb.field_i, "menubar", false, "");
              on.field_t = dl.a(fb.field_i, "titlebar", false, "");
              de.field_O = dl.a(fb.field_i, "titlebar_divleft", false, "");
              dc.field_ab = dl.a(fb.field_i, "titlebar_divright", false, "");
              hh.field_e = dl.a(fb.field_i, "courseselect_bar", false, "");
              oi.field_a = new hj(20, 20);
              vb.a(-53, oi.field_a);
              break;
            }
            var8[var9_int] = 13;
            var9_int++;
          } while (var16 == 0);
          var9_int = 1;
          do {
            if (var9_int >= 19) {
              var9_int = 2;
              break;
            }
            var10_int = (2166 + var9_int * 44) / 17;
            var10_int = var10_int << 16 | (var10_int | var10_int << 8);
            tc.b(1, var9_int, 18, var10_int);
            var9_int++;
          } while (var16 == 0);
          do {
            if (var9_int >= 18) {
              tc.a(0, 0, 20, 20, 65793);
              ug.b(param0 ^ -30866);
              ol.field_i = new uf("win");
              sm.field_a = new uf("loss");
              nj.field_c = new uf[4];
              nj.field_c[0] = new uf("splash_s1");
              nj.field_c[1] = new uf("splash_s2");
              nj.field_c[2] = new uf("splash_s3");
              nj.field_c[3] = new uf("splash_s4");
              ha.field_o = new uf[3];
              ha.field_o[0] = new uf("wreath1");
              ha.field_o[1] = new uf("wreath2");
              ha.field_o[2] = new uf("wreath3");
              break;
            }
            var10_int = (77 * var9_int - 4) / 15;
            var10_int = var10_int | var10_int << 8 | var10_int << 16;
            tc.b(2, var9_int, 16, var10_int);
            var9_int++;
          } while (var16 == 0);
          var9 = dl.a(fb.field_i, "frame", false, "");
          qk.field_E = new hj[9];
          qk.field_E[0] = fj.a(0, 0, var9, 20, 0, 20);
          qk.field_E[1] = fj.a(0, 20, var9, 20, 0, 16);
          qk.field_E[2] = fj.a(0, 36, var9, 20, 0, 20);
          qk.field_E[3] = fj.a(0, 0, var9, 16, 20, 20);
          qk.field_E[4] = fj.a(0, 20, var9, 16, 20, 16);
          qk.field_E[5] = fj.a(0, 36, var9, 16, 20, 20);
          qk.field_E[6] = fj.a(0, 0, var9, 20, 36, 20);
          qk.field_E[7] = fj.a(0, 20, var9, 20, 36, 16);
          qk.field_E[8] = fj.a(0, 36, var9, 20, 36, 20);
          var10 = dl.a(fb.field_i, "frame_textured", false, "");
          var11 = dl.a(fb.field_i, "tarmac", false, "");
          var12 = 14;
          var13 = -(2 * var12) + var10.field_s;
          jc.field_h = new hj[9];
          var14 = var10.field_y - 2 * var12;
          jc.field_h[0] = fj.a(0, 0, var10, var12, 0, var12);
          jc.field_h[1] = fj.a(0, var12, var10, var12, 0, var13);
          jc.field_h[2] = fj.a(0, var12 + var13, var10, var12, 0, var12);
          jc.field_h[3] = fj.a(0, 0, var10, var14, var12, var12);
          jc.field_h[4] = var11;
          jc.field_h[5] = fj.a(0, var13 + var12, var10, var14, var12, var12);
          jc.field_h[6] = fj.a(wb.a(param0, 30865), 0, var10, var12, var14 + var12, var12);
          jc.field_h[7] = fj.a(0, var12, var10, var12, var14 + var12, var13);
          jc.field_h[8] = fj.a(0, var13 + var12, var10, var12, var12 + var14, var12);
          ua.field_b = new va("vehicle_select");
          oe.field_i = new va("vehicle_select_large");
          wn.field_f = kb.a("mine", (byte) -53);
          wb.field_d = hm.a(5499, "missile");
          ha.field_k = kb.a("powerup_red", (byte) -53);
          pk.field_O = kb.a("powerup_green", (byte) -53);
          na.field_q = kb.a("powerup_blue", (byte) -53);
          cf.field_u = kb.a("powerup_black", (byte) -53);
          ol.field_h = jd.a("s1_background", 1);
          fd.field_e = jd.a("s1_track", param0 ^ 30864);
          qb.field_b = jd.a("s1_tree20", 1);
          t.field_i = jd.a("s1_tree30", 1);
          cd.field_d = jd.a("s1_tree40", 1);
          ci.field_k = jd.a("s1_tree50", 1);
          ud.field_o = jd.a("s1_tree80", param0 ^ 30864);
          ub.field_A = ji.a("s1_standempty", (byte) -125);
          aj.field_c = ji.a("s1_standscattered", (byte) 81);
          jf.field_c = ji.a("s1_standfull", (byte) 106);
          ie.field_k = ji.a("s1_ad1", (byte) 97);
          sj.field_I = ji.a("s1_ad2", (byte) 87);
          ch.field_u = ji.a("s1_ad3", (byte) 86);
          bl.field_s = jd.a("s1_pa", 1);
          vh.field_i = jd.a("s1_tyreblack", 1);
          ae.field_b = jd.a("s1_tyrewhite", 1);
          ma.field_l = jd.a("s1_tyrered", param0 - 30864);
          h.field_b = ji.a("s1_bridge_top", (byte) -57);
          pd.field_h = ji.a("s1_bridge_side", (byte) -81);
          aj.field_a = jd.a("s1_bridge_support", param0 ^ 30864);
          kc.field_b = jd.a("s3_background", 1);
          ug.field_b = jd.a("s3_background2", 1);
          ha.field_i = jd.a("s3_background3", 1);
          om.field_i = jd.a("s3_rock20", param0 ^ 30864);
          en.field_e = jd.a("s3_rock30", param0 ^ 30864);
          q.field_d = jd.a("s3_rock40", 1);
          co.field_b = jd.a("s3_tree20", 1);
          tf.field_A = jd.a("s3_tree30", 1);
          uk.field_b = jd.a("s3_tree40", 1);
          ac.field_c = jd.a("s3_tree50", 1);
          ri.field_a = jd.a("s3_tree80", 1);
          ci.field_l = ji.a("s3_igloo", (byte) -76);
          fj.field_s = ji.a("s3_snowman", (byte) 88);
          lk.field_a = jd.a("s2_background", 1);
          hf.field_h = jd.a("s2_background2", 1);
          a.field_F = jd.a("s2_background3", 1);
          gh.field_a = ji.a("s2_bones1", (byte) 99);
          ag.field_r = ji.a("s2_bones2", (byte) -126);
          w.field_a = jd.a("s2_cacti20", 1);
          n.field_r = jd.a("s2_cacti30", param0 - 30864);
          tf.field_o = jd.a("s2_cacti40", 1);
          aa.field_q = jd.a("s2_tree30", 1);
          kc.field_d = jd.a("s2_tree40", 1);
          nd.field_c = jd.a("s2_tree50", 1);
          ig.field_t = uk.a("s2_well", false, param0 ^ 30968, true);
          n.field_j = jd.a("s2_tyre1", 1);
          mo.field_r = jd.a("s2_tyre2", 1);
          gi.field_J = ji.a("s2_wreckage1", (byte) -116);
          gk.field_b = ji.a("s2_wreckage2", (byte) 126);
          hg.field_Q = jd.a("s4_background", 1);
          gn.field_f = ji.a("s4_light1", (byte) -126);
          ai.field_b = ji.a("s4_light2", (byte) 91);
          um.field_e = ji.a("s4_crates", (byte) 74);
          we.field_p = ji.a("s4_drain", (byte) 92);
          lc.field_c = ji.a("s4_pa", (byte) 88);
          jo.field_a = jd.a("s4_tree20", 1);
          hm.field_b = jd.a("s4_tree30", 1);
          in.field_b = jd.a("s4_tree40", 1);
          ie.field_i = jd.a("s4_tree50", 1);
          lk.field_c = lb.b("vehicle_f1", (byte) -85);
          al.field_a = lb.b("vehicle_tourer", (byte) -113);
          rl.field_K = lb.b("vehicle_dragster", (byte) 125);
          jg.field_o = lb.b("vehicle_dunebuggy", (byte) -114);
          md.field_j = lb.b("vehicle_snowcat", (byte) 110);
          ei.field_a = lb.b("vehicle_snowmobile", (byte) 91);
          am.field_b = lb.b("vehicle_hatchback", (byte) -90);
          ud.field_h = lb.b("vehicle_suv", (byte) 72);
          field_K = hm.a(5499, "booster");
          jk.field_p = hm.a(5499, "slowdown");
          la.field_g = ji.a("oilslick", (byte) -98);
          wi.field_a = new kg("halloween_zombie");
          tn.field_b = new va("halloween_blood");
          var15 = j.a((byte) 81, 100, 13487565, 40);
          discarded$2 = new mg(var15, true, false);
          qk.field_f = new mg(rl.a(-5936, 0, var15, 10, var15), true, false);
          de.field_Q = sf.a(60, (byte) -108, 8355647);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_44_0 = runtimeException;
          stackIn_44_1 = new StringBuilder().append("pg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    private pg(int param0, int param1, int param2, int param3, dh param4, tb param5, n param6) {
        super(param0, param1, param2, param3, param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_B = param6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int b(int param0, int param1, int param2) {
        int stackIn_2_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        try {
          var4 = param2 >> 31;
          param2 = var4 ^ var4 + param2;
          if (param1 != 4805) {
            stackIn_2_0 = -90;
            return stackIn_2_0;
          }
          var4Lifetime1 = param0 >> 31;
          param0 = var4Lifetime1 ^ param0 + var4Lifetime1;
          if (param0 > param2) {
            var4Lifetime2 = param2;
            param2 = param0;
            param0 = var4Lifetime2;
          }
          var3_int = 0;
          if (param2 >= 32768) {
            if (param2 >= 1073741824) {
              var3_int += 16;
              param2 = param2 >> 16;
            }
            if (param2 >= 4194304) {
              var3_int += 8;
              param2 = param2 >> 8;
            }
            if (param2 >= 262144) {
              var3_int += 4;
              param2 = param2 >> 4;
            }
            if (param2 >= 65536) {
              param2 = param2 >> 2;
              var3_int += 2;
            }
            if (param2 >= 32768) {
              param2 = param2 >> 1;
              var3_int++;
            }
            param0 = param0 >> var3_int;
          }
          if (param2 > (param0 << 5)) {
            stackIn_29_0 = param2 << var3_int;
            return stackIn_29_0;
          }
          param2 = param2 * param2 + param0 * param0;
          if (param2 < 65536) {
            if (param2 < 256) {
              if (0 <= param2) {
                stackIn_53_0 = lg.field_j[param2] >> 12;
                return stackIn_53_0;
              }
              stackIn_51_0 = -1;
              return stackIn_51_0;
            }
            if (param2 < 4096) {
              if (1024 <= param2) {
                stackIn_48_0 = lg.field_j[param2 >> 4] >> 10;
                return stackIn_48_0;
              }
              stackIn_46_0 = lg.field_j[param2 >> 2] >> 11;
              return stackIn_46_0;
            }
            if (16384 <= param2) {
              stackIn_43_0 = lg.field_j[param2 >> 8] >> 8;
              return stackIn_43_0;
            }
            stackIn_41_0 = lg.field_j[param2 >> 6] >> 9;
            return stackIn_41_0;
          }
          if (param2 < 16777216) {
            if (param2 >= 1048576) {
              if (param2 < 4194304) {
                stackIn_95_0 = lg.field_j[param2 >> 14] >> 5;
                return stackIn_95_0;
              }
              stackIn_93_0 = lg.field_j[param2 >> 16] >> 4;
              return stackIn_93_0;
            }
            if (param2 < 262144) {
              stackIn_90_0 = lg.field_j[param2 >> 10] >> 7;
              return stackIn_90_0;
            }
            stackIn_88_0 = lg.field_j[param2 >> 12] >> 6;
            return stackIn_88_0;
          }
          if (param2 >= 268435456) {
            if (param2 >= 1073741824) {
              stackIn_69_0 = lg.field_j[param2 >> 24] << var3_int;
              return stackIn_69_0;
            }
            if (1 <= var3_int) {
              stackIn_67_0 = lg.field_j[param2 >> 22] << -1 + var3_int;
            } else {
              stackIn_67_0 = lg.field_j[param2 >> 22] >> 1 - var3_int;
            }
            return stackIn_67_0;
          }
          if (param2 < 67108864) {
            if (var3_int < 3) {
              stackIn_82_0 = lg.field_j[param2 >> 18] >> -var3_int + 3;
            } else {
              stackIn_82_0 = lg.field_j[param2 >> 18] << var3_int - 3;
            }
            return stackIn_82_0;
          }
          if (2 <= var3_int) {
            stackIn_77_0 = lg.field_j[param2 >> 20] << var3_int - 2;
          } else {
            stackIn_77_0 = lg.field_j[param2 >> 20] >> 2 - var3_int;
          }
          return stackIn_77_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "pg.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_I = "Updates will sent to the email address you've given";
        field_F = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_H = "Championship";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$87b210a2f664(boolean param0, int param1, String param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          uk.b(-45);
          if (param1 < 82) {
            return;
          }
          ka.field_b.a(false);
          lh.field_a = new vg(ec.field_v, (String) null, ci.field_o, param3, param0);
          sm.field_c = new si(ka.field_b, lh.field_a);
          ka.field_b.a(sm.field_c, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("pg.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }
}
