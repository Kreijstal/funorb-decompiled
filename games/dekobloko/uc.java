/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static hm field_e;
    static boolean field_a;
    static long field_g;
    static af field_c;
    static int field_d;
    static String field_f;
    static String field_b;

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          return;
        }
        field_b = null;
        field_c = null;
        field_f = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param0) {
          hk.b();
        } else {
          hk.a(0, 0, hk.field_j, hk.field_i, 0, 192);
        }
        if (param2 <= 39) {
          return;
        }
        cg.a(param0, 91);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        if (!param1) {
          field_b = (String) null;
        }
        si.a(kf.field_O, param2, nk.field_b, hn.field_a, param0, (byte) -41, param3);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, ve param6, boolean param7) {
        qd[][] stackIn_4_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        qd[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qd var13_ref_qd = null;
        int var14 = 0;
        int var15 = 0;
        qd[] var16 = null;
        qd[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int var10_intLifetime1;
        int var13Lifetime1;
        var15 = client.field_A ? 1 : 0;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (param5 <= param2) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (bc.field_D.length <= var9) {
                if (var8_int == 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                ve.field_ac = true;
                decompiledFrameCompleted0 = false;
                break;
              }
              var19 = bc.field_D[var9];
              var18 = var19;
              var10 = var18;
              var11 = 0;
              var12 = 0;
              L3: while (true) {
                if (var12 >= var19.length) {
                  if (var11 == 0 &&
                    param2 != j.field_b) {
                    break L3;
                  }
                  var8_int = 0;
                  for (var12 = 0; var12 < var19.length; var12 += 2) {
                    var13 = var19[var12];
                    if (var13 == -1) {
                      gd.field_b = true;
                    } else {
                      if (var13 < param2) {
                        rd.field_c[var13] = true;
                      }
                    }
                  }
                  break L3;
                }
                var13Lifetime1 = var19[var12];
                var14 = var10[1 + var12];
                if (var13Lifetime1 == -1) {
                  if (b.field_P[param0] != var14) {
                    break L3;
                  }
                } else {
                  if (param2 == var13Lifetime1 &&
                    param4 == var14) {
                    var11 = 1;
                  } else {
                    if (param2 <= var13Lifetime1) {
                      break L3;
                    }
                    if ((km.field_D[var13Lifetime1] & 255) != var14) {
                      break L3;
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
            stackIn_4_0 = qa.field_v;
            if (param2 != -1) {
              stackIn_5_1 = param2 + 4;
            } else {
              stackIn_5_1 = 1;
            }
            var16 = stackIn_4_0[stackIn_5_1];
            var17 = var16;
            var8 = var17;
            var9 = 1;
            if (param1) {
              if (param2 != -1) {
                for (var10_int = 0; var16.length - 1 > var10_int; var10_int++) {
                  if (0 == (v.field_a[(param3 + var10_int) / 8] & 1 << (7 & param3 + var10_int))) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param3 = param3 + (255 & rb.field_k[param2]);
              } else {
                var10_int = 0;
                while (!(b.field_P.length <= var10_int)) {
                  if ((kk.field_l[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
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
              stackIn_21_0 = var11;
              if (param2 != -1) {
                stackIn_22_1 = -1 + var17.length;
              } else {
                stackIn_22_1 = b.field_P.length;
              }
              if (stackIn_21_0 >= stackIn_22_1) {
                if (var10_intLifetime1 != 0) {
                  break;
                }
                for (var11 = 0; var11 < -1 + var17.length; var11++) {
                  if (-1 == param2) {
                    param0 = var11;
                  } else {
                    km.field_D[param2] = (byte)var11;
                  }
                  uc.a(param0, param1, 1 + param2, param3, param4, param5, param6, false);
                  if (ve.field_ac) {
                    return;
                  }
                }
                break;
              }
              if (param2 != -1) {
                km.field_D[param2] = (byte)var11;
              } else {
                param0 = var11;
              }
              if (param2 == -1 &&
                b.field_P.length == 1) {
                var12 = 1;
              } else {
                var13_ref_qd = var8[1 + var11];
                if (param1) {
                  if (!var13_ref_qd.field_ab) {
                    if (var9 != 0) {
                      stackIn_46_0 = (var13_ref_qd.field_Hb) ? 1 : 0;
                    } else {
                      stackIn_46_0 = 0;
                    }
                  } else {
                    stackIn_46_0 = 1;
                  }
                  var12 = stackIn_46_0;
                } else {
                  if (param2 != -1) {
                    stackIn_37_0 = (var11 != (255 & cd.field_m.field_kc[param2])) ? 0 : 1;
                  } else {
                    stackIn_37_0 = (cd.field_m.field_mc != b.field_P[var11]) ? 0 : 1;
                  }
                  var12 = stackIn_37_0;
                }
              }
              if (var12 != 0) {
                uc.a(param0, param1, param2 + 1, param3, param4, param5, param6, false);
                var10_intLifetime1 = 1;
              }
              if (ve.field_ac) {
                return;
              }
              var11++;
            }
          }
          if (param7) {
            field_b = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_94_0 = var8_ref;
          stackIn_94_1 = new StringBuilder().append("uc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_94_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_a = true;
        field_c = new af();
        field_f = "Accept";
        field_b = "Lobby";
    }
}
