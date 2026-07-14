/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        ((an) this).field_B[param0] = new pi();
        return new pi();
    }

    final void a(byte param0, cn param1) {
        pi[] var3 = null;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        pi[] var7 = null;
        var6 = DungeonAssault.field_K;
        var7 = ((an) this).field_B;
        var3 = var7;
        if (param0 == 47) {
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_d = param1;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static String a(int param0, byte param1, int param2, String param3) {
        if (param1 != -109) {
            an.c(26);
        }
        param3 = param3 != null ? param3 : ng.field_K;
        return ln.a(param2, ib.a((byte) -126, param0, param3), 255);
    }

    public static void c(int param0) {
        field_y = null;
        field_z = null;
        if (param0 != -13023) {
            field_y = null;
        }
        field_x = null;
        field_C = null;
        field_F = null;
        field_D = null;
    }

    an(an param0, boolean param1) {
        this();
        param0.a(0, (an) this, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, qg param8) {
        of.field_d = param4;
        ri.field_b = param0;
        ng.field_I = param6;
        lk.field_T = param3;
        kn.field_f = param8;
        if (param2 >= -55) {
            field_w = -6;
        }
        bf.field_k = param1;
        j.field_J = param5;
        pj.field_a = param7;
        hb.field_a = (bb) (Object) new tp();
        na.field_y = new cc(param8);
        bl.field_r = new je(hb.field_a, na.field_y);
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        pi var7 = null;
        pi var9 = null;
        Object var10 = null;
        ck var11 = null;
        pi var12 = null;
        pi var13 = null;
        pi var14 = null;
        pi var15 = null;
        lm stackIn_3_0 = null;
        lm stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof ck) {
            stackOut_2_0 = (lm) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (lm) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (ck) (Object) stackIn_3_0;
          d.a(param1.field_q + param2, param1.field_s + (param1.field_v + param3), param1.field_x + param2 + param1.field_q, param1.field_v + param3, false);
          if (var11 == null) {
            break L1;
          } else {
            param4 = param4 & var11.field_B;
            break L1;
          }
        }
        L2: {
          var7 = ((an) this).field_B[0];
          ((an) this).field_A.b(0);
          var7.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
          if (var11 != null) {
            L3: {
              if (!var11.field_E) {
                break L3;
              } else {
                var12 = ((an) this).field_B[1];
                if (var12 == null) {
                  break L3;
                } else {
                  var12.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
                  break L3;
                }
              }
            }
            if (!var11.field_u) {
              break L2;
            } else {
              L4: {
                var13 = ((an) this).field_B[3];
                if (-1 == (var11.field_y ^ -1)) {
                  break L4;
                } else {
                  if (var13 != null) {
                    var13.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var9 = ((an) this).field_B[2];
              if (var9 == null) {
                break L2;
              } else {
                var9.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (param1.a((byte) 20)) {
            var14 = ((an) this).field_B[5];
            if (var14 == null) {
              break L5;
            } else {
              var14.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (param4) {
            break L6;
          } else {
            var15 = ((an) this).field_B[4];
            if (var15 != null) {
              var15.a(param1, (byte) 100, ((an) this).field_A, param3, (an) this, param2);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          ((an) this).field_A.a(0, param1, param3, param2, (an) this);
          ti.c(true);
          if (param0 == 34) {
            break L7;
          } else {
            var10 = null;
            ((an) this).a(117, (cn[]) null, 121);
            break L7;
          }
        }
    }

    final void a(int param0, cn[] param1, int param2) {
        int var4 = param0;
        if (((an) this).field_B[var4] == null) {
            ((an) this).field_B[var4] = new pi();
        }
        int var5 = -96 % ((-66 - param2) / 49);
        ((an) this).field_B[param0].field_e = param1;
    }

    final void a(cn[] param0, int param1) {
        pi[] var3 = null;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        pi[] var7 = null;
        var6 = DungeonAssault.field_K;
        var7 = ((an) this).field_B;
        var3 = var7;
        var4 = param1;
        L0: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_e = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, an param1, boolean param2) {
        int var4 = 0;
        pi var5 = null;
        pi var6 = null;
        int var7 = 0;
        pi stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pi stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pi stackIn_10_2 = null;
        pi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        pi stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        pi stackOut_9_2 = null;
        pi stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pi stackOut_8_2 = null;
        L0: {
          var7 = DungeonAssault.field_K;
          if (param0 == 0) {
            break L0;
          } else {
            an.c(98);
            break L0;
          }
        }
        L1: {
          super.a((byte) 127, (hh) (Object) param1);
          if (param2) {
            var4 = 0;
            L2: while (true) {
              if (-7 >= (var4 ^ -1)) {
                break L1;
              } else {
                var5 = ((an) this).field_B[var4];
                if (var5 == null) {
                  param1.field_B[var4] = null;
                  var4++;
                  continue L2;
                } else {
                  L3: {
                    var6 = param1.field_B[var4];
                    stackOut_7_0 = (pi) var5;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var6 != null) {
                      stackOut_9_0 = (pi) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = (pi) var6;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L3;
                    } else {
                      param1.field_B[var4] = new pi();
                      stackOut_8_0 = (pi) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = new pi();
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L3;
                    }
                  }
                  ((pi) (Object) stackIn_10_0).a(stackIn_10_1 != 0, stackIn_10_2);
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            cj.a((Object[]) (Object) ((an) this).field_B, 0, (Object[]) (Object) param1.field_B, 0, 6);
            break L1;
          }
        }
    }

    public an() {
        ((an) this).field_B = new pi[6];
        ((an) this).field_A = new pi();
        ((an) this).field_B[0] = new pi();
        pi var1 = new pi();
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
