/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class an extends hh {
    static String field_C;
    static String field_D;
    static int field_w;
    static String field_y;
    private pi[] field_B;
    static String[] field_F;
    static int field_E;
    private pi field_A;
    static String field_x;
    static String field_z;

    final pi a(int param0, byte param1) {
        if (param1 > -81) {
            Object var4 = null;
            ((an) this).a(65, (cn[]) null, -101);
        }
        pi dupTemp$0 = new pi();
        ((an) this).field_B[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, cn param1) {
        pi[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        pi[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var7 = ((an) this).field_B;
            var3 = var7;
            if (param0 == 47) {
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_d = param1;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("an.HA(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static String a(int param0, byte param1, int param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                stackOut_2_0 = ng.field_K;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (String) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            param3 = stackIn_3_0;
            int discarded$3 = 255;
            stackOut_3_0 = ln.a(param2, ib.a((byte) -126, param0, param3));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("an.C(").append(param0).append(44).append(-109).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    public static void c() {
        field_y = null;
        field_z = null;
        field_x = null;
        field_C = null;
        field_F = null;
        field_D = null;
    }

    an(an param0, boolean param1) {
        this();
        try {
            param0.a(0, (an) this, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "an.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, qg param8) {
        try {
            of.field_d = param4;
            ri.field_b = param0;
            ng.field_I = param6;
            lk.field_T = param3;
            kn.field_f = param8;
            bf.field_k = param1;
            j.field_J = param5;
            pj.field_a = param7;
            hb.field_a = (bb) (Object) new tp();
            na.field_y = new cc(param8);
            bl.field_r = new je(hb.field_a, na.field_y);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "an.EA(" + param0 + 44 + param1 + 44 + -69 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 44 + param7 + 44 + (param8 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        pi var7 = null;
        pi var9 = null;
        Object var10 = null;
        ck var11 = null;
        pi var12 = null;
        pi var13 = null;
        pi var14 = null;
        pi var15 = null;
        lm stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        lm stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof ck) {
                stackOut_2_0 = (lm) param1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (lm) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (ck) (Object) stackIn_3_0;
              int discarded$2 = 0;
              d.a(param1.field_q + param2, param1.field_s + (param1.field_v + param3), param1.field_x + param2 + param1.field_q, param1.field_v + param3);
              if (var11 == null) {
                break L2;
              } else {
                param4 = param4 & var11.field_B;
                break L2;
              }
            }
            L3: {
              var7 = ((an) this).field_B[0];
              ((an) this).field_A.b(0);
              var7.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
              if (var11 != null) {
                L4: {
                  if (!var11.field_E) {
                    break L4;
                  } else {
                    var12 = ((an) this).field_B[1];
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
                      break L4;
                    }
                  }
                }
                if (!var11.field_u) {
                  break L3;
                } else {
                  L5: {
                    var13 = ((an) this).field_B[3];
                    if (var11.field_y == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9 = ((an) this).field_B[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (param1.a((byte) 20)) {
                var14 = ((an) this).field_B[5];
                if (var14 == null) {
                  break L6;
                } else {
                  var14.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (param4) {
                break L7;
              } else {
                var15 = ((an) this).field_B[4];
                if (var15 != null) {
                  var15.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              ((an) this).field_A.a(0, param1, param3, param2, (an) this);
              int discarded$3 = 1;
              ti.c();
              if (param0 == 34) {
                break L8;
              } else {
                var10 = null;
                ((an) this).a(117, (cn[]) null, 121);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("an.B(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, cn[] param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (((an) this).field_B[var4_int] == null) {
                ((an) this).field_B[var4_int] = new pi();
            }
            int var5 = -96 % ((-66 - param2) / 49);
            ((an) this).field_B[param0].field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "an.FA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(cn[] param0, int param1) {
        pi[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        pi[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var7 = ((an) this).field_B;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_e = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("an.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, an param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pi var5 = null;
        pi var6 = null;
        int var7 = 0;
        pi stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        pi stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pi stackIn_9_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        pi stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pi stackOut_8_2 = null;
        pi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        pi stackOut_7_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              super.a((byte) 127, (hh) (Object) param1);
              if (param2) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((an) this).field_B[var4_int];
                      if (var5 == null) {
                        param1.field_B[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param1.field_B[var4_int];
                          stackOut_6_0 = (pi) var5;
                          stackOut_6_1 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var6 != null) {
                            stackOut_8_0 = (pi) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (pi) var6;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L4;
                          } else {
                            pi dupTemp$25 = new pi();
                            param1.field_B[var4_int] = dupTemp$25;
                            stackOut_7_0 = (pi) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (pi) dupTemp$25;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L4;
                          }
                        }
                        ((pi) (Object) stackIn_9_0).a(stackIn_9_1 != 0, stackIn_9_2);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                cj.a((Object[]) (Object) ((an) this).field_B, 0, (Object[]) (Object) param1.field_B, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("an.E(").append(0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    public an() {
        ((an) this).field_B = new pi[6];
        ((an) this).field_A = new pi();
        pi dupTemp$0 = new pi();
        ((an) this).field_B[0] = dupTemp$0;
        pi var1 = dupTemp$0;
        var1.b(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "You gain an additional 1 Renown per hour.";
        field_D = "When entering a trap room, the only choice is to continue. The trap must first attempt to detect a raider by rolling it's Detect against a raider's Sneak. If the raider is detected, they must then attempt to Dodge (against the trap's Snare). If the raider fails both rolls, the trap is triggered.";
        field_y = "TRAP";
        field_F = new String[]{"First Strike", "The <%0> has a penchant for wildly charging into combat; such is the speed of his attack, he is guaranteed the first strike even against the most watchful of adversaries."};
        field_z = "Player names can be up to 12 letters, numbers and underscores";
        field_x = "Vampires have an eternal thirst for raider blood; they're strong, fast and very hard to kill.<br><br>Each time this monster kills, its <%attack> and <%defence> increase by 1.";
    }
}
