/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar {
    static String[] field_a;

    final static void a(boolean param0, om param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        rk[][] stackIn_33_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        rk[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        rk var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        rk[] var16 = null;
        int[] var17 = null;
        rk[] var18 = null;
        int[] var19 = null;
        int var10Lifetime1;
        int var13_intLifetime1;
        int var10Lifetime2;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param4 >= param6) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (br.field_bc.length <= var9) {
                if (var8_int == 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                dc.field_g = true;
                decompiledFrameCompleted1 = false;
                break;
              }
              var19 = br.field_bc[var9];
              var17 = var19;
              var10_ref_int__ = var17;
              var11 = 0;
              var12 = 0;
              L18: while (true) {
                if (var12 >= var19.length) {
                  if (var11 == 0 &&
                    cq.field_p != param4) {
                    break L18;
                  }
                  var8_int = 0;
                  for (var12 = 0; var19.length > var12; var12 += 2) {
                    var13_int = var19[var12];
                    if (var13_int != -1) {
                      if (param4 > var13_int) {
                        h.field_D[var13_int] = true;
                      }
                    } else {
                      lk.field_s = true;
                    }
                  }
                  break L18;
                }
                var13_intLifetime1 = var19[var12];
                var14 = var10_ref_int__[1 + var12];
                if (var13_intLifetime1 == -1) {
                  if (var14 != w.field_n[param3]) {
                    break L18;
                  }
                } else {
                  if (var13_intLifetime1 == param4 &&
                    var14 == param2) {
                    var11 = 1;
                  } else {
                    if (var13_intLifetime1 >= param4) {
                      break L18;
                    }
                    if (var14 != (qo.field_J[var13_intLifetime1] & 255)) {
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
            stackIn_33_0 = ab.field_A;
            if (param4 == -1) {
              stackIn_34_1 = 1;
            } else {
              stackIn_34_1 = param4 + 4;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var16 = stackIn_33_0[stackIn_34_1];
            var18 = var16;
            var8 = var18;
            var9 = 1;
            if (param0) {
              if (param4 == -1) {
                for (var10 = 0; w.field_n.length > var10; var10++) {
                  if ((rh.field_d[var10 / 8] & 1 << (var10 & 7)) != 0) {
                    var9 = 0;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                for (var10Lifetime2 = 0; -1 + var16.length > var10Lifetime2; var10Lifetime2++) {
                  if (0 == (lj.field_p[(var10Lifetime2 + param7) / 8] & 1 << (param7 + var10Lifetime2 & 7))) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param7 = param7 + (255 & jg.field_c[param4]);
              }
            }
            var10Lifetime1 = 0;
            var11 = 0;
            while (true) {
              stackIn_53_0 = ~var11;
              if (-1 == param4) {
                stackIn_54_1 = w.field_n.length;
              } else {
                stackIn_54_1 = var18.length - 1;
              }
              if (stackIn_53_0 <= ~stackIn_54_1) {
                if (var10Lifetime1 != 0) {
                  break;
                }
                for (var11 = 0; -1 + var18.length > var11; var11++) {
                  if (-1 != param4) {
                    qo.field_J[param4] = (byte)var11;
                  } else {
                    param3 = var11;
                  }
                  ar.a(param0, param1, param2, param3, 1 + param4, 0, param6, param7);
                  if (dc.field_g) {
                    return;
                  }
                }
                break;
              }
              if (param4 != -1) {
                qo.field_J[param4] = (byte)var11;
              } else {
                param3 = var11;
              }
              if (param4 == -1 &&
                w.field_n.length == 1) {
                var12 = 1;
              } else {
                var13 = var8[1 + var11];
                if (param0) {
                  if (!var13.field_Nb) {
                    if (var9 != 0) {
                      stackIn_78_0 = (var13.field_eb) ? 1 : 0;
                    } else {
                      stackIn_78_0 = 0;
                    }
                  } else {
                    stackIn_78_0 = 1;
                  }
                  var12 = stackIn_78_0;
                } else {
                  if (param4 != -1) {
                    stackIn_69_0 = ((255 & o.field_e.field_Tb[param4]) != var11) ? 0 : 1;
                  } else {
                    stackIn_69_0 = (o.field_e.field_jc != w.field_n[var11]) ? 0 : 1;
                  }
                  var12 = stackIn_69_0;
                }
              }
              if (var12 != 0) {
                ar.a(param0, param1, param2, param3, param4 + 1, 0, param6, param7);
                var10Lifetime1 = 1;
              }
              if (dc.field_g) {
                return;
              }
              var11++;
            }
          }
          if (param5 != 0) {
            ar.a(33);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_100_0 = var8_ref;
          stackIn_100_1 = new StringBuilder().append("ar.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 != 120) {
          return 9;
        }
        return af.field_u;
    }

    public static void a(int param0) {
        if (param0 != -1) {
          om var2 = (om) null;
          ar.a(true, (om) null, -103, -124, -112, 116, 82, 7);
        }
        field_a = null;
    }

    static {
    }
}
