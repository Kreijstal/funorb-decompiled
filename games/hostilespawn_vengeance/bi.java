/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static String field_e;
    static bm field_d;
    static bd field_b;
    static ub field_a;
    static String field_g;
    static String field_f;
    static gb field_h;
    static String[] field_c;

    final static void a(int param0, int param1, int[] param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oj var8 = null;
        Object var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (~rc.field_e >= ~var4_int) {
                break L0;
              } else {
                var8 = re.field_n[var4_int];
                var5 = (int)(24.0 * ((double)(-1 + var8.field_j.field_e) + var8.field_l.field_f)) + -param3;
                var6 = -param0 + (int)(24.0 * (var8.field_l.field_a + (double)var8.field_j.field_g));
                if (var5 < -96) {
                  var4_int++;
                  var4_int++;
                  continue L1;
                } else {
                  if (var6 < -96) {
                    var4_int++;
                    var4_int++;
                    continue L1;
                  } else {
                    if (var5 > 736) {
                      var4_int++;
                      continue L1;
                    } else {
                      if (var6 <= 576) {
                        L2: {
                          var9 = null;
                          var10 = var8.field_i;
                          if (var10 != 16) {
                            if (var10 != 229) {
                              if (17 != var10) {
                                if (227 != var10) {
                                  if (var10 != 226) {
                                    if (var10 != 228) {
                                      if (232 != var10) {
                                        break L2;
                                      } else {
                                        var9 = (Object) (Object) ta.field_jb;
                                        break L2;
                                      }
                                    } else {
                                      var9 = (Object) (Object) tb.field_I;
                                      break L2;
                                    }
                                  } else {
                                    var9 = (Object) (Object) rh.field_x;
                                    break L2;
                                  }
                                } else {
                                  var9 = (Object) (Object) fk.field_c;
                                  break L2;
                                }
                              } else {
                                var9 = (Object) (Object) d.field_s;
                                break L2;
                              }
                            } else {
                              var9 = (Object) (Object) lm.field_y;
                              break L2;
                            }
                          } else {
                            var9 = (Object) (Object) ee.field_g;
                            break L2;
                          }
                        }
                        if (var9 == null) {
                          var4_int++;
                          continue L1;
                        } else {
                          L3: {
                            var7 = 128;
                            if ((Object) (Object) ta.field_jb == var9) {
                              var6 += 10;
                              var5 += 10;
                              if (var8.field_e < 240) {
                                break L3;
                              } else {
                                var9 = (Object) (Object) wg.field_zb;
                                break L3;
                              }
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            if (var8.field_e < 0) {
                              var7 = (384000 - -(128 * var8.field_e)) / 3000;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((bd) var9).a(true, var7, (int)var8.field_c, var5, var6);
                          var4_int++;
                          continue L1;
                        }
                      } else {
                        var4_int++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var4;
            stackOut_47_1 = new StringBuilder().append("bi.B(").append(param0).append(',').append(-457).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L5;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_h = null;
    }

    final static void a(p param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        bd stackIn_1_0 = null;
        double stackIn_1_1 = 0.0;
        double stackIn_1_2 = 0.0;
        int stackIn_1_3 = 0;
        bd stackIn_2_0 = null;
        double stackIn_2_1 = 0.0;
        double stackIn_2_2 = 0.0;
        int stackIn_2_3 = 0;
        bd stackIn_3_0 = null;
        double stackIn_3_1 = 0.0;
        double stackIn_3_2 = 0.0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        bd stackOut_0_0 = null;
        double stackOut_0_1 = 0.0;
        double stackOut_0_2 = 0.0;
        int stackOut_0_3 = 0;
        bd stackOut_2_0 = null;
        double stackOut_2_1 = 0.0;
        double stackOut_2_2 = 0.0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        bd stackOut_1_0 = null;
        double stackOut_1_1 = 0.0;
        double stackOut_1_2 = 0.0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4_int = Math.min(param0.field_e, 90);
              var4_int = (3 * var4_int - var4_int * var4_int / 60) % te.field_G.length;
              stackOut_0_0 = te.field_G[var4_int];
              stackOut_0_1 = (double)param1;
              stackOut_0_2 = (double)param2;
              stackOut_0_3 = 0;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              if (param0.field_f) {
                stackOut_2_0 = (bd) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 128;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                break L1;
              } else {
                stackOut_1_0 = (bd) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                break L1;
              }
            }
            ((bd) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0, (double)stackIn_3_4 + param0.field_c, 128);
            if (param3 <= -4) {
              break L0;
            } else {
              var5 = null;
              bi.a((p) null, 117, 10, -118);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("bi.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Finally! I must be nearly at the exit now.";
        field_d = new bm();
        field_a = new ub();
        field_c = new String[]{"Civilian", "Draftee", "Rookie", "Technician", "Squaddie", "Engineer", "Sergeant", "Marine", "Commando", "Elite Soldier", "Lone Wolf", "Elite Wolf", "Hero of the UFE", "Elite Hero", "Slayer of the Spawn", "Slayer Elite", "Scourge of the Spawn", "Scourge Elite", "Spirit of the Hammerhead", "Spirit of Vengeance"};
        field_f = "Total aliens killed: <col=ffffff><%0>";
    }
}
