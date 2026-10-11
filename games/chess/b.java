/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_h;
    static volatile boolean field_f;
    static int[] field_c;
    static String field_g;
    static km field_a;
    static bn field_e;
    static int field_d;
    static ta field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ln param6, boolean param7) {
        tl[][] stackIn_32_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        tl[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        tl var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        tl[] var16 = null;
        int[] var17 = null;
        tl[] var18 = null;
        int[] var19 = null;
        int var10Lifetime1;
        int var13_intLifetime1;
        int var10Lifetime2;
        var15 = Chess.field_G;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param4 <= param3) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (hd.field_n.length <= var9) {
                if (var8_int == 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                pk.field_g = true;
                decompiledFrameCompleted1 = false;
                break;
              }
              var19 = hd.field_n[var9];
              var17 = var19;
              var10_ref_int__ = var17;
              var11 = 0;
              var12 = 0;
              L18: while (true) {
                if (var19.length <= var12) {
                  if (var11 == 0 &&
                    qa.field_e != param3) {
                    break L18;
                  }
                  var8_int = 0;
                  for (var12 = 0; var19.length > var12; var12 += 2) {
                    var13_int = var19[var12];
                    if (var13_int != -1) {
                      if (var13_int < param3) {
                        bi.field_d[var13_int] = true;
                      }
                    } else {
                      d.field_Gb = true;
                    }
                  }
                  break L18;
                }
                var13_intLifetime1 = var19[var12];
                var14 = var10_ref_int__[var12 + 1];
                if (var13_intLifetime1 != -1) {
                  if (var13_intLifetime1 == param3 &&
                    var14 == param0) {
                    var11 = 1;
                  } else {
                    if (var13_intLifetime1 >= param3) {
                      break L18;
                    }
                    if ((255 & d.field_Jb[var13_intLifetime1]) != var14) {
                      break L18;
                    }
                  }
                } else {
                  if (var14 != wn.field_d[param5]) {
                    break L18;
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            stackIn_32_0 = ba.field_P;
            if (param3 == -1) {
              stackIn_33_1 = 1;
            } else {
              stackIn_33_1 = 4 + param3;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var16 = stackIn_32_0[stackIn_33_1];
            var18 = var16;
            var8 = var18;
            var9 = 1;
            if (param7) {
              if (param3 == -1) {
                for (var10 = 0; var10 < wn.field_d.length; var10++) {
                  if ((g.field_f[var10 / 8] & 1 << (var10 & 7)) != 0) {
                    var9 = 0;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                for (var10Lifetime2 = 0; var16.length - 1 > var10Lifetime2; var10Lifetime2++) {
                  if (0 == (fe.field_d[(var10Lifetime2 + param2) / 8] & 1 << (var10Lifetime2 + param2 & 7))) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param2 = param2 + (255 & wk.field_e[param3]);
              }
            }
            var10Lifetime1 = 0;
            var11 = 0;
            while (true) {
              stackIn_52_0 = var11;
              if (-1 != param3) {
                stackIn_53_1 = -1 + var18.length;
              } else {
                stackIn_53_1 = wn.field_d.length;
              }
              if (stackIn_52_0 >= stackIn_53_1) {
                if (var10Lifetime1 != 0) {
                  break;
                }
                for (var11 = 0; var11 < var18.length - 1; var11++) {
                  if (param3 != -1) {
                    d.field_Jb[param3] = (byte)var11;
                  } else {
                    param5 = var11;
                  }
                  b.a(param0, -56, param2, param3 + 1, param4, param5, param6, param7);
                  if (pk.field_g) {
                    return;
                  }
                }
                break;
              }
              if (param3 != -1) {
                d.field_Jb[param3] = (byte)var11;
              } else {
                param5 = var11;
              }
              if (param3 == -1 &&
                wn.field_d.length == 1) {
                var12 = 1;
              } else {
                var13 = var8[var11 + 1];
                if (param7) {
                  if (!var13.field_gb) {
                    if (var9 != 0) {
                      stackIn_77_0 = (var13.field_tb) ? 1 : 0;
                    } else {
                      stackIn_77_0 = 0;
                    }
                  } else {
                    stackIn_77_0 = 1;
                  }
                  var12 = stackIn_77_0;
                } else {
                  if (param3 == -1) {
                    stackIn_68_0 = (pd.field_Rb.field_hc != wn.field_d[var11]) ? 0 : 1;
                  } else {
                    stackIn_68_0 = (var11 != (pd.field_Rb.field_sc[param3] & 255)) ? 0 : 1;
                  }
                  var12 = stackIn_68_0;
                }
              }
              if (var12 != 0) {
                b.a(param0, -43, param2, param3 + 1, param4, param5, param6, param7);
                var10Lifetime1 = 1;
              }
              if (pk.field_g) {
                return;
              }
              var11++;
            }
          }
          if (param1 > -40) {
            field_c = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_100_0 = var8_ref;
          stackIn_100_1 = new StringBuilder().append("b.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (null == rm.field_R) {
          return;
        }
        kl.a(rm.field_R, (byte) -114);
        rm.field_R.a(oc.field_l, -3);
        if (!param0) {
          field_f = false;
        }
        rm.field_R = null;
        if (null != ch.field_gb) {
          ch.field_gb.c((byte) -103);
        }
        ja.field_h.requestFocus();
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_g = null;
        field_e = null;
        if (param0 != -17436) {
          field_b = (ta) null;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        p var16 = null;
        p var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = Chess.field_G;
        try {
          var16 = new p(param1);
          var17 = var16;
          var17.field_l = -2 + param1.length;
          h.field_n = var17.f(674914976);
          wm.field_b = new int[h.field_n];
          a.field_c = new int[h.field_n];
          gg.field_y = new byte[h.field_n][];
          in.field_c = new boolean[h.field_n];
          vk.field_d = new byte[h.field_n][];
          be.field_a = new int[h.field_n];
          field_c = new int[h.field_n];
          var17.field_l = -(8 * h.field_n) - 7 + param1.length;
          cd.field_p = var17.f(674914976);
          ek.field_a = var17.f(674914976);
          var3 = (var17.i(-127) & 255) + 1;
          for (var4 = 0; var4 < h.field_n; var4++) {
            be.field_a[var4] = var16.f(674914976);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < h.field_n; var4Lifetime1++) {
            a.field_c[var4Lifetime1] = var17.f(674914976);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < h.field_n; var4Lifetime2++) {
            wm.field_b[var4Lifetime2] = var17.f(674914976);
          }
          for (var4Lifetime3 = 0; h.field_n > var4Lifetime3; var4Lifetime3++) {
            field_c[var4Lifetime3] = var17.f(674914976);
          }
          var17.field_l = -(h.field_n * 8) - 7 + (param1.length - 3 * (-1 + var3));
          uh.field_r = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            uh.field_r[var4Lifetime4] = var17.k(1389913160);
            if (uh.field_r[var4Lifetime4] == 0) {
              uh.field_r[var4Lifetime4] = 1;
            }
          }
          var17.field_l = 0;
          var4Lifetime5 = 0;
          if (param0 <= 104) {
            return;
          }
          while (var4Lifetime5 < h.field_n) {
            var5 = wm.field_b[var4Lifetime5];
            var6 = field_c[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            vk.field_d[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            gg.field_y[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.i(-104);
            if ((1 & var11) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.g(0);
              }
              if (0 != (var11 & 2)) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.g(0);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_31_0 = var10;
                  if (var13 == -1) {
                    stackIn_32_1 = 0;
                  } else {
                    stackIn_32_1 = 1;
                  }
                  var10 = stackIn_31_0 | stackIn_32_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var5 * var13 + var12] = var17.g(0);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$0 = var17.g(0);
                    var9[var5 * var13 + var12] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_46_0 = var10;
                    if (var14 == -1) {
                      stackIn_47_1 = 0;
                    } else {
                      stackIn_47_1 = 1;
                    }
                    var10 = stackIn_46_0 | stackIn_47_1;
                  }
                }
              }
            }
            in.field_c[var4Lifetime5] = var10 != 0;
            var4Lifetime5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("b.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_10_0 = false;
        if (param1 != 104) {
          return true;
        }
        stackIn_10_0 = ((!(param0 < 65) &&
          !(param0 > 90)) ||
          (!(97 > param0) &&
          !(122 < param0)));
        return stackIn_10_0;
    }

    static {
        field_f = true;
        field_a = null;
        field_h = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_g = "Searching for opponents";
    }
}
