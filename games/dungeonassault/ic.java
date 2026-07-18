/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends mc {
    static String field_A;
    static String field_z;
    static pp field_y;

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (0 < pb.field_G) {
          if (null != il.field_c) {
            L0: {
              cm.field_R = il.field_c.d(92);
              gk.a(2, (byte) 4);
              if (cm.field_R == null) {
                var2 = 3;
                break L0;
              } else {
                uk.a((java.awt.Canvas) (Object) cm.field_R, (byte) -124);
                var2 = 2;
                break L0;
              }
            }
            L1: {
              if (il.field_c != null) {
                break L1;
              } else {
                if (!wo.field_c) {
                  break L1;
                } else {
                  ae.a(param0, var2, -1);
                  return;
                }
              }
            }
            return;
          } else {
            L2: {
              cm.field_R = gh.a(0, -115, 0, 480, i.field_A, 640);
              if (cm.field_R == null) {
                var2 = 3;
                break L2;
              } else {
                uk.a((java.awt.Canvas) (Object) cm.field_R, (byte) -124);
                var2 = 2;
                break L2;
              }
            }
            L3: {
              if (il.field_c != null) {
                break L3;
              } else {
                if (!wo.field_c) {
                  break L3;
                } else {
                  ae.a(param0, var2, -1);
                  return;
                }
              }
            }
            return;
          }
        } else {
          if (ed.c(true)) {
            L4: {
              var2 = 0;
              if (il.field_c != null) {
                break L4;
              } else {
                if (!wo.field_c) {
                  break L4;
                } else {
                  ae.a(param0, var2, -1);
                  return;
                }
              }
            }
            return;
          } else {
            var2 = 1;
            if (il.field_c == null) {
              if (wo.field_c) {
                ae.a(param0, var2, -1);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    ic(int param0) {
        this(lp.field_C, param0);
    }

    public static void d(int param0) {
        field_A = null;
        field_z = null;
        field_y = null;
    }

    final static void a(int param0, int param1, String param2) {
        ac var3 = gh.field_i[param0];
        if (!(var3 != null)) {
            return;
        }
        try {
            var3.field_d = tp.a(kf.field_p, "idle", param2, -1998);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ic.EA(" + param0 + ',' + 27029 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(lm param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -444136767) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            stackOut_2_0 = cc.a('*', param0.field_w.length(), 10854);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ic.P(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private ic(se param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Empty Room";
        field_z = "The pillar in the centre of this room is covered in mouths that will shrill and screech if they sense any raiders.<br><br>When triggered, the <%detect> of all monsters in this dungeon is increased by 3.";
    }
}
