/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uq {
    static fe field_a;
    static String field_b;
    static int field_d;
    int field_e;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -6872) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(uh param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        nk[][] stackIn_32_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        nk[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        nk var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        nk[] var16 = null;
        int[] var17 = null;
        nk[] var18 = null;
        int[] var19 = null;
        int var10Lifetime1;
        int var13_intLifetime1;
        int var10Lifetime2;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param4 >= param1) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (gr.field_W.length <= var9) {
                if (var8_int == 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                gd.field_r = true;
                decompiledFrameCompleted1 = false;
                break;
              }
              var19 = gr.field_W[var9];
              var17 = var19;
              var10_ref_int__ = var17;
              var11 = 0;
              var12 = 0;
              L18: while (true) {
                if (var12 >= var19.length) {
                  if (var11 == 0 &&
                    ol.field_A != param4) {
                    break L18;
                  }
                  var8_int = 0;
                  for (var12 = 0; var19.length > var12; var12 += 2) {
                    var13_int = var19[var12];
                    if (var13_int != -1) {
                      if (var13_int < param4) {
                        mn.field_t[var13_int] = true;
                      }
                    } else {
                      ng.field_a = true;
                    }
                  }
                  break L18;
                }
                var13_intLifetime1 = var19[var12];
                var14 = var10_ref_int__[var12 + 1];
                if (var13_intLifetime1 == -1) {
                  if (rc.field_a[param6] != var14) {
                    break L18;
                  }
                } else {
                  if (var13_intLifetime1 == param4 &&
                    param5 == var14) {
                    var11 = 1;
                  } else {
                    if (var13_intLifetime1 >= param4) {
                      break L18;
                    }
                    if ((e.field_c[var13_intLifetime1] & 255) != var14) {
                      break L18;
                    }
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
            stackIn_32_0 = mg.field_S;
            if (param4 == -1) {
              stackIn_33_1 = 1;
            } else {
              stackIn_33_1 = 4 + param4;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var16 = stackIn_32_0[stackIn_33_1];
            var18 = var16;
            var8 = var18;
            var9 = 1;
            if (param7) {
              if (param4 == -1) {
                for (var10 = 0; var10 < rc.field_a.length; var10++) {
                  if ((qc.field_w[var10 / 8] & 1 << (var10 & 7)) != 0) {
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
                  if (0 == (dj.field_a[(var10Lifetime2 + param3) / 8] & 1 << (var10Lifetime2 + param3 & 7))) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param3 = param3 + (255 & kr.field_c[param4]);
              }
            }
            var10Lifetime1 = 0;
            var11 = 0;
            while (true) {
              if (-1 != param4) {
                stackIn_52_0 = -1 + var18.length;
              } else {
                stackIn_52_0 = rc.field_a.length;
              }
              if (stackIn_52_0 <= var11) {
                if (var10Lifetime1 != 0) {
                  break;
                }
                for (var11 = 0; var11 < -1 + var18.length; var11++) {
                  if (param4 != -1) {
                    e.field_c[param4] = (byte)var11;
                  } else {
                    param6 = var11;
                  }
                  uq.a(param0, param1, 20473, param3, param4 + 1, param5, param6, param7);
                  if (gd.field_r) {
                    return;
                  }
                }
                break;
              }
              if (-1 != param4) {
                e.field_c[param4] = (byte)var11;
              } else {
                param6 = var11;
              }
              if (param4 == -1 &&
                rc.field_a.length == 1) {
                var12 = 1;
              } else {
                var13 = var8[var11 + 1];
                if (param7) {
                  if (!var13.field_V) {
                    if (var9 != 0) {
                      stackIn_76_0 = (var13.field_lb) ? 1 : 0;
                    } else {
                      stackIn_76_0 = 0;
                    }
                  } else {
                    stackIn_76_0 = 1;
                  }
                  var12 = stackIn_76_0;
                } else {
                  if (param4 == -1) {
                    stackIn_67_0 = (rc.field_a[var11] != gd.field_j.field_uc) ? 0 : 1;
                  } else {
                    stackIn_67_0 = (var11 != (255 & gd.field_j.field_fc[param4])) ? 0 : 1;
                  }
                  var12 = stackIn_67_0;
                }
              }
              if (var12 != 0) {
                uq.a(param0, param1, param2 ^ 0, param3, 1 + param4, param5, param6, param7);
                var10Lifetime1 = 1;
              }
              if (gd.field_r) {
                return;
              }
              var11++;
            }
          }
          if (param2 != 20473) {
            field_a = (fe) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_98_0 = var8_ref;
          stackIn_98_1 = new StringBuilder().append("uq.B(");
          if (param0 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_d = 24;
        field_b = "<col=ee9d32>Items - Blocks 1/2</col>";
        field_c = "You need a rating of <%1> to play with the current options.";
    }
}
