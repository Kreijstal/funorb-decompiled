/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static int field_h;
    static boolean field_f;
    static IndexedSprite[] field_a;
    static RgbSprite field_b;
    static String field_d;
    static String field_i;
    static tc field_c;
    static boolean field_e;
    static int field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int var10_int = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        var17 = SteelSentinels.obfuscationControl;
        try {
          var10_int = -128 / ((24 - param3) / 54);
          while (true) {
            param7--;
            if (param7 < 0) {
              return;
            }
            var11 = param6;
            var12 = param5;
            var13 = param1;
            var14 = param8;
            var15 = param2;
            var16 = var11[var12] >> 1 & 8355711;
            var11[var12] = ec.a(255, var15 >> 17) + ec.a(16711680, var13 >> 1) - (-(ec.a(33423850, var14) >> 9) - var16);
            param8 = param8 + param0;
            param5++;
            param2 = param2 + param4;
            param1 = param1 + param9;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_7_0 = var10;
          stackIn_7_1 = new StringBuilder().append("lc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
          field_d = (String) null;
        }
        ma.a(true, (byte) -99, kf.field_o, bl.field_f);
        nm.field_p = true;
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 1) {
          lc.a(3);
        }
        field_b = null;
        field_d = null;
        field_i = null;
    }

    final static void a(int param0, int param1, hk param2, int param3, int param4, int param5, int param6, boolean param7) {
        qh[][] stackIn_38_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        qh[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        qh var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        hk var16 = null;
        qh[] var17 = null;
        int[] var18 = null;
        qh[] var19 = null;
        int[] var20 = null;
        int var10Lifetime1;
        int var13_intLifetime1;
        var15 = SteelSentinels.obfuscationControl;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (param4 >= param3) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (m.field_b.length <= var9) {
                if (var8_int == 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                ng.field_k = true;
                decompiledFrameCompleted0 = false;
                break;
              }
              var20 = m.field_b[var9];
              var18 = var20;
              var10_ref_int__ = var18;
              var11 = 0;
              var12 = 0;
              scanLoop1: while (true) {
                if (var20.length <= var12) {
                  if (var11 == 0 &&
                    param4 != be.field_a) {
                    break scanLoop1;
                  }
                  for (var12 = 0; var20.length > var12; var12 += 2) {
                    var13_int = var20[var12];
                    if (var13_int != -1) {
                      if (var13_int < param4) {
                        m.field_h[var13_int] = true;
                      }
                    } else {
                      PacketBuffer.field_u = true;
                    }
                  }
                  var8_int = 0;
                  break scanLoop1;
                }
                var13_intLifetime1 = var20[var12];
                var14 = var10_ref_int__[var12 + 1];
                if (var13_intLifetime1 == -1) {
                  if (var14 != jg.field_l[param1]) {
                    break scanLoop1;
                  }
                } else {
                  if (var13_intLifetime1 == param4 &&
                    var14 == param0) {
                    var11 = 1;
                  } else {
                    if (var13_intLifetime1 >= param4) {
                      break scanLoop1;
                    }
                    if ((255 & dl.field_O[var13_intLifetime1]) != var14) {
                      break scanLoop1;
                    }
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_38_0 = un.field_h;
            if (param4 != -1) {
              stackIn_39_1 = 4 + param4;
            } else {
              stackIn_39_1 = 1;
            }
            var17 = stackIn_38_0[stackIn_39_1];
            var19 = var17;
            var8 = var19;
            var9 = 1;
            if (param7) {
              if (param4 != -1) {
                for (var10 = 0; var17.length - 1 > var10; var10++) {
                  if (0 == (ti.field_s[(var10 + param6) / 8] & 1 << (var10 + param6 & 7))) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param6 = param6 + (wb.field_j[param4] & 255);
              } else {
                var10 = 0;
                while (!(var10 >= jg.field_l.length)) {
                  if ((rb.field_i[var10 / 8] & 1 << (7 & var10)) == 0) {
                    var10++;
                    continue;
                  }
                  var9 = 0;
                  break;
                }
              }
            }
            var10Lifetime1 = 0;
            var11 = 0;
            while (true) {
              if (param4 == -1) {
                stackIn_57_0 = jg.field_l.length;
              } else {
                stackIn_57_0 = var19.length - 1;
              }
              if (stackIn_57_0 <= var11) {
                if (var10Lifetime1 != 0) {
                  break;
                }
                for (var11 = 0; var11 < -1 + var19.length; var11++) {
                  if (param4 != -1) {
                    dl.field_O[param4] = (byte)var11;
                  } else {
                    param1 = var11;
                  }
                  lc.a(param0, param1, param2, param3, 1 + param4, -120, param6, param7);
                  if (ng.field_k) {
                    return;
                  }
                }
                break;
              }
              if (param4 == -1) {
                param1 = var11;
              } else {
                dl.field_O[param4] = (byte)var11;
              }
              if (-1 == param4 &&
                jg.field_l.length == 1) {
                var12 = 1;
              } else {
                var13 = var8[var11 + 1];
                if (!param7) {
                  if (param4 != -1) {
                    stackIn_81_0 = ((255 & nf.field_b.field_Sb[param4]) != var11) ? 0 : 1;
                  } else {
                    stackIn_81_0 = (jg.field_l[var11] != nf.field_b.field_Ub) ? 0 : 1;
                  }
                  var12 = stackIn_81_0;
                } else {
                  if (!var13.field_G) {
                    if (var9 != 0) {
                      stackIn_73_0 = (var13.field_T) ? 1 : 0;
                    } else {
                      stackIn_73_0 = 0;
                    }
                  } else {
                    stackIn_73_0 = 1;
                  }
                  var12 = stackIn_73_0;
                }
              }
              if (var12 != 0) {
                var10Lifetime1 = 1;
                lc.a(param0, param1, param2, param3, 1 + param4, -120, param6, param7);
              }
              if (ng.field_k) {
                return;
              }
              var11++;
            }
          }
          if (param5 >= -83) {
            var16 = (hk) null;
            lc.a(112, 77, (hk) null, 38, -87, 68, 43, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_103_0 = var8_ref;
          stackIn_103_1 = new StringBuilder().append("lc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_f = false;
        field_d = "Create";
        field_i = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = null;
        field_g = 2;
    }
}
