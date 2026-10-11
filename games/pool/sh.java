/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends ud {
    static String field_N;
    static boolean[] field_Q;
    static int[] field_O;
    int field_T;
    static iq field_P;
    static String field_S;
    static String field_R;

    final static void h(int param0) {
        ma.field_h = null;
        if (param0 != -1) {
          field_S = (String) null;
        }
        v.field_b = (byte[][]) null;
        rc.field_f = null;
        ih.field_d = null;
        pd.field_a = null;
        el.field_I = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, kh param4, int param5, int param6, boolean param7) {
        uo[][] stackIn_4_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        uo[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        uo var13_ref_uo = null;
        int var14 = 0;
        int var15 = 0;
        uo[] var16 = null;
        uo[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int var10_intLifetime1;
        int var13Lifetime1;
        int var10_intLifetime2;
        var15 = Pool.field_O;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param5 >= param1) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (var9 >= we.field_m.length) {
                if (var8_int == 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                qk.field_b = true;
                decompiledFrameCompleted1 = false;
                break;
              }
              var19 = we.field_m[var9];
              var18 = var19;
              var10 = var18;
              var11 = 0;
              var12 = 0;
              L3: while (true) {
                if (var19.length <= var12) {
                  if (var11 == 0 &&
                    dr.field_c != param5) {
                    break L3;
                  }
                  for (var12 = 0; var19.length > var12; var12 += 2) {
                    var13 = var19[var12];
                    if (-1 != var13) {
                      if (var13 < param5) {
                        gf.field_b[var13] = true;
                      }
                    } else {
                      ln.field_p = true;
                    }
                  }
                  var8_int = 0;
                  break L3;
                }
                var13Lifetime1 = var19[var12];
                var14 = var10[var12 + 1];
                if (-1 != var13Lifetime1) {
                  if (var13Lifetime1 == param5 &&
                    var14 == param2) {
                    var11 = 1;
                  } else {
                    if (param5 <= var13Lifetime1) {
                      break L3;
                    }
                    if ((255 & dk.field_j[var13Lifetime1]) != var14) {
                      break L3;
                    }
                  }
                } else {
                  if (dg.field_T[param6] != var14) {
                    break L3;
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
            stackIn_4_0 = mc.field_f;
            if (param5 == -1) {
              stackIn_5_1 = 1;
            } else {
              stackIn_5_1 = 4 + param5;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var16 = stackIn_4_0[stackIn_5_1];
            var17 = var16;
            var8 = var17;
            var9 = 1;
            if (param7) {
              if (param5 == -1) {
                for (var10_int = 0; var10_int < dg.field_T.length; var10_int++) {
                  if ((md.field_c[var10_int / 8] & 1 << (7 & var10_int)) != 0) {
                    var9 = 0;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                for (var10_intLifetime2 = 0; -1 + var16.length > var10_intLifetime2; var10_intLifetime2++) {
                  if ((ka.field_s[(param0 + var10_intLifetime2) / 8] & 1 << (var10_intLifetime2 + param0 & 7)) == 0) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param0 = param0 + (255 & qf.field_j[param5]);
              }
            }
            var10_intLifetime1 = 0;
            var11 = 0;
            while (true) {
              if (param5 == -1) {
                stackIn_25_0 = dg.field_T.length;
              } else {
                stackIn_25_0 = -1 + var17.length;
              }
              if (stackIn_25_0 <= var11) {
                if (var10_intLifetime1 != 0) {
                  break;
                }
                for (var11 = 0; var11 < var17.length - 1; var11++) {
                  if (param5 != -1) {
                    dk.field_j[param5] = (byte)var11;
                  } else {
                    param6 = var11;
                  }
                  sh.a(param0, param1, param2, false, param4, 1 + param5, param6, param7);
                  if (qk.field_b) {
                    return;
                  }
                }
                break;
              }
              if (param5 == -1) {
                param6 = var11;
              } else {
                dk.field_j[param5] = (byte)var11;
              }
              if (param5 == -1 &&
                dg.field_T.length == 1) {
                var12 = 1;
              } else {
                var13_ref_uo = var8[var11 + 1];
                if (param7) {
                  if (!var13_ref_uo.field_Ib) {
                    if (var9 != 0) {
                      stackIn_49_0 = (var13_ref_uo.field_pb) ? 1 : 0;
                    } else {
                      stackIn_49_0 = 0;
                    }
                  } else {
                    stackIn_49_0 = 1;
                  }
                  var12 = stackIn_49_0;
                } else {
                  if (param5 == -1) {
                    stackIn_40_0 = (em.field_L.field_Nb != dg.field_T[var11]) ? 0 : 1;
                  } else {
                    stackIn_40_0 = ((em.field_L.field_tc[param5] & 255) != var11) ? 0 : 1;
                  }
                  var12 = stackIn_40_0;
                }
              }
              if (var12 != 0) {
                var10_intLifetime1 = 1;
                sh.a(param0, param1, param2, false, param4, param5 + 1, param6, param7);
              }
              if (qk.field_b) {
                return;
              }
              var11++;
            }
          }
          if (param3) {
            field_Q = (boolean[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_106_0 = var8_ref;
          stackIn_106_1 = new StringBuilder().append("sh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static boolean h(byte param0) {
        int var1 = 26 % ((-52 - param0) / 32);
        return sm.field_C != null ? true : false;
    }

    public static void g(byte param0) {
        field_R = null;
        field_P = null;
        field_O = null;
        field_N = null;
        if (param0 != 118) {
          byte[] var2 = (byte[]) null;
          sh.a((byte) 52, (byte[]) null, -94);
        }
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
          return;
        }
        if (this.field_L == null) {
          return;
        }
        int var5 = 53 % ((-42 - param1) / 53);
        if (this.field_T == 0) {
          return;
        }
        if (this.field_T == 256) {
          this.field_L.a(param0, (byte) -128, param2 + this.field_C, this.field_D + param3);
          return;
        }
        dd var6 = new dd(this.field_L.field_l, this.field_L.field_y);
        kj.a(110, var6);
        this.field_L.a(param0, (byte) -126, 0, 0);
        oc.a(118);
        var6.a(param2 + this.field_C, this.field_D + param3, this.field_T);
    }

    public sh() {
        super(0, 0, 0, 0, (fp) null, (cc) null);
        this.field_T = 256;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 + (param1 + param0) <= qh.field_f) {
          return param3 + param1;
        }
        if (~(-param0 + param1) <= param2) {
          return -param0 + param1;
        }
        return qh.field_f - param0;
    }

    sh(ei param0) {
        super(param0.field_C, param0.field_D, param0.field_l, param0.field_y, (fp) null, (cc) null);
        try {
          param0.a(this.field_l, 0, this.field_y, false, 0);
          this.field_T = 256;
          this.field_L = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(di param0, byte param1, di param2) {
        try {
          rl.field_c = param2;
          bm.field_k = param0;
          if (param1 != -32) {
            field_N = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sh.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(byte param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 25) {
            sh.a(-81, 49, -78, -118);
          }
          stackIn_3_0 = sg.a(-116, param2, param1, (byte) 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, int param4, byte param5, int param6, int param7, boolean param8, int param9, boolean param10, boolean param11) {
        if (param5 != -12) {
          kh var13 = (kh) null;
          sh.a(-82, 16, -99, true, (kh) null, -40, 16, false);
        }
        rn.a(param1, param6, param11, param3, param10, param8, param2, param0, 16777215, param9, param4, param7, -124, 16777215);
    }

    static {
        field_N = "You can spectate this game";
        field_O = new int[]{2, 20, 21, 49, 6, 5, 3, 9};
        field_S = "From only <%0>/month";
        field_R = "Wants to draw.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$a4481b60e878(boolean param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7, boolean param8, int param9, boolean param10, boolean param11) {
        if (param5 != -12) {
          kh var13 = (kh) null;
          sh.a(-82, 16, -99, true, (kh) null, -40, 16, false);
        }
        rn.a(param1, param6, param11, param3, param10, param8, param2, param0, 16777215, param9, param4, param7, -124, 16777215);
    }
}
