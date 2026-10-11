/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_c;
    static String field_a;
    static String field_b;
    static int field_d;

    final static void a(int param0, int param1, qb param2, int param3, byte param4, int param5, int param6, boolean param7) {
        vu[][] stackIn_4_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        vu[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vu var13_ref_vu = null;
        int var14 = 0;
        int var15 = 0;
        vu[] var16 = null;
        vu[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int var10_intLifetime1;
        int var13Lifetime1;
        var15 = Kickabout.field_G;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (param6 >= param1) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (var9 >= la.field_k.length) {
                if (var8_int == 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                tt.field_c = true;
                decompiledFrameCompleted0 = false;
                break;
              }
              var19 = la.field_k[var9];
              var18 = var19;
              var10 = var18;
              var11 = 0;
              var12 = 0;
              L3: while (true) {
                if (var19.length <= var12) {
                  if (var11 == 0 &&
                    param6 != ss.field_j) {
                    break L3;
                  }
                  for (var12 = 0; var12 < var19.length; var12 += 2) {
                    var13 = var19[var12];
                    if (var13 == -1) {
                      ee.field_e = true;
                    } else {
                      if (var13 < param6) {
                        m.field_f[var13] = true;
                      }
                    }
                  }
                  var8_int = 0;
                  break L3;
                }
                var13Lifetime1 = var19[var12];
                var14 = var10[1 + var12];
                if (-1 != var13Lifetime1) {
                  if (var13Lifetime1 == param6 &&
                    param5 == var14) {
                    var11 = 1;
                  } else {
                    if (var13Lifetime1 >= param6) {
                      break L3;
                    }
                    if (var14 != (hm.field_G[var13Lifetime1] & 255)) {
                      break L3;
                    }
                  }
                } else {
                  if (rn.field_d[param3] != var14) {
                    break L3;
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
            stackIn_4_0 = rf.field_c;
            if (param6 == -1) {
              stackIn_5_1 = 1;
            } else {
              stackIn_5_1 = 4 + param6;
            }
            var16 = stackIn_4_0[stackIn_5_1];
            var17 = var16;
            var8 = var17;
            var9 = 1;
            if (param7) {
              if (param6 != -1) {
                for (var10_int = 0; -1 + var16.length > var10_int; var10_int++) {
                  if (0 == (rf.field_d[(var10_int + param0) / 8] & 1 << (7 & param0 + var10_int))) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param0 = param0 + (255 & rp.field_x[param6]);
              } else {
                var10_int = 0;
                while (!(var10_int >= rn.field_d.length)) {
                  if ((er.field_h[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
                    var10_int++;
                    continue;
                  }
                  var9 = 0;
                  break;
                }
              }
            }
            var10_intLifetime1 = 0;
            var11 = 0;
            while (true) {
              if (param6 != -1) {
                stackIn_22_0 = -1 + var17.length;
              } else {
                stackIn_22_0 = rn.field_d.length;
              }
              if (stackIn_22_0 <= var11) {
                if (var10_intLifetime1 != 0) {
                  break;
                }
                for (var11 = 0; -1 + var17.length > var11; var11++) {
                  if (param6 != -1) {
                    hm.field_G[param6] = (byte)var11;
                  } else {
                    param3 = var11;
                  }
                  pl.a(param0, param1, param2, param3, (byte) -120, param5, param6 + 1, param7);
                  if (tt.field_c) {
                    return;
                  }
                }
                break;
              }
              if (param6 == -1) {
                param3 = var11;
              } else {
                hm.field_G[param6] = (byte)var11;
              }
              if (param6 == -1 &&
                rn.field_d.length == 1) {
                var12 = 1;
              } else {
                var13_ref_vu = var8[var11 + 1];
                if (param7) {
                  if (!var13_ref_vu.field_I) {
                    if (var9 != 0) {
                      stackIn_46_0 = (var13_ref_vu.field_lb) ? 1 : 0;
                    } else {
                      stackIn_46_0 = 0;
                    }
                  } else {
                    stackIn_46_0 = 1;
                  }
                  var12 = stackIn_46_0;
                } else {
                  if (param6 != -1) {
                    stackIn_37_0 = ((uv.field_i.field_Eb[param6] & 255) != var11) ? 0 : 1;
                  } else {
                    stackIn_37_0 = (rn.field_d[var11] != uv.field_i.field_bc) ? 0 : 1;
                  }
                  var12 = stackIn_37_0;
                }
              }
              if (var12 != 0) {
                pl.a(param0, param1, param2, param3, (byte) -125, param5, 1 + param6, param7);
                var10_intLifetime1 = 1;
              }
              if (tt.field_c) {
                return;
              }
              var11++;
            }
          }
          if (param4 > -118) {
            field_c = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_103_0 = var8_ref;
          stackIn_103_1 = new StringBuilder().append("pl.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 20177) {
          field_a = (String) null;
        }
    }

    static {
        field_c = "Names can only contain letters, numbers, spaces and underscores";
        field_a = "Age:";
        field_b = "Private";
    }
}
