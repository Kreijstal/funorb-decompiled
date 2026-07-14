/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc extends to {
    private hc field_w;
    private int field_u;
    private String field_A;
    private boolean field_y;
    static String field_v;
    private int field_z;
    private int field_x;

    final static int a(String param0, byte param1) {
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        Throwable var9 = null;
        int var9_int = 0;
        int var10 = 0;
        String var11 = null;
        File var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = AceOfSkies.field_G ? 1 : 0;
                    if (bm.field_I.field_q) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return -1;
                }
                case 2: {
                    if (!vg.field_j.containsKey((Object) (Object) param0)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return 100;
                }
                case 4: {
                    var11 = ob.a(param0, (byte) -18);
                    if (var11 == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return -1;
                }
                case 7: {
                    var3 = bl.field_g + var11;
                    if (rj.field_b.a(var3, -126, "")) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return -1;
                }
                case 9: {
                    if (rj.field_b.c(var3, -14012)) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return rj.field_b.a(var3, (byte) -79);
                }
                case 11: {
                    var19 = rj.field_b.a(var3, (byte) -71, "");
                    var17 = var19;
                    var15 = var17;
                    var13 = var15;
                    var4 = var13;
                    var6 = -26 / ((param1 - -35) / 33);
                    var5 = null;
                    var12 = qc.a(true, var11);
                    if (var4 == null) {
                        statePc = 27;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var12 != null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return -1;
                }
                case 14: {
                    var7 = 1;
                    var20 = ee.a(true, var12);
                    var18 = var20;
                    var16 = var18;
                    var14 = var16;
                    var8 = var14;
                    if (var8 == null) {
                        statePc = 21;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var19.length != var20.length) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var9_int = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var20.length <= var9_int) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var19[var9_int] == var20[var9_int]) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var7 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 20: {
                    var9_int++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 21: {
                    var7 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        if (var7 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        vn.a(0, var12, param0);
                        return 100;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        boolean discarded$1 = bm.field_I.a(var12, var19, true);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    vn.a(0, var12, param0);
                    return 100;
                }
                case 26: {
                    var9 = caughtException;
                    return -1;
                }
                case 27: {
                    return -1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void j(int param0) {
        field_v = null;
        if (param0 != 14912) {
            field_v = (String) null;
        }
    }

    final String c(byte param0) {
        int var2 = 0;
        String var3 = null;
        ea stackIn_2_0 = null;
        ea stackIn_3_0 = null;
        ea stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ea stackIn_6_0 = null;
        ea stackIn_7_0 = null;
        ea stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ea stackOut_5_0 = null;
        ea stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ea stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ea stackOut_1_0 = null;
        ea stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ea stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var2 = ((bc) this).field_s.field_g ? 1 : 0;
        ((bc) this).field_s.field_g = ((bc) this).field_g;
        if (param0 >= -41) {
          L0: {
            field_v = (String) null;
            var3 = ((bc) this).field_s.c((byte) -75);
            stackOut_5_0 = ((bc) this).field_s;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var2 == 0) {
              stackOut_7_0 = (ea) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (ea) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((ea) (Object) stackIn_8_0).field_g = stackIn_8_1 != 0;
          return var3;
        } else {
          L1: {
            var3 = ((bc) this).field_s.c((byte) -75);
            stackOut_1_0 = ((bc) this).field_s;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (var2 == 0) {
              stackOut_3_0 = (ea) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ea) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((ea) (Object) stackIn_4_0).field_g = stackIn_4_1 != 0;
          return var3;
        }
    }

    bc(int param0, int param1, int param2, int param3, ea param4, boolean param5, int param6, int param7, hc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ir) null, (no) null);
        ((bc) this).field_x = param6;
        ((bc) this).field_z = param7;
        ((bc) this).field_A = param10;
        ((bc) this).field_u = param9;
        ((bc) this).field_y = param5 ? true : false;
        ((bc) this).field_w = param8;
        ((bc) this).field_s = param4;
        int var12 = -((bc) this).field_z + ((bc) this).field_x;
        int var13 = ((bc) this).field_w.a(param10, var12, ((bc) this).field_w.field_I) - -(2 * ((bc) this).field_z);
        if (var13 > param3) {
            ((bc) this).a(var13, param0, param1, param2, (byte) 123);
        } else {
            var13 = param3;
        }
        int var14 = ((bc) this).field_y ? 0 : ((bc) this).field_x - -(((bc) this).field_z * 2);
        ((bc) this).field_s.a(param3 - 2 * ((bc) this).field_z, var14, ((bc) this).field_z + (var13 - param3 >> -1964588735), param2 - (((bc) this).field_x - -(((bc) this).field_z * 3)), (byte) 124);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        hc stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        hc stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        hc stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        hc stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        hc stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        hc stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        var5 = ((bc) this).field_p + param3;
        if (param0 >= 64) {
          var6 = ((bc) this).field_h + param2;
          this.a((byte) 108, param1, param2, param3);
          if (0 != param1) {
            return;
          } else {
            L0: {
              if (!((bc) this).field_y) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = -((bc) this).field_x + ((bc) this).field_q + -(2 * ((bc) this).field_z);
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_6_0;
              stackOut_6_0 = ((bc) this).field_w;
              stackOut_6_1 = ((bc) this).field_A;
              stackOut_6_2 = ((bc) this).field_z + var7 + var5;
              stackOut_6_3 = var6 - -((bc) this).field_z;
              stackOut_6_4 = -((bc) this).field_z + ((bc) this).field_x;
              stackOut_6_5 = -(2 * ((bc) this).field_z) + ((bc) this).field_n;
              stackOut_6_6 = ((bc) this).field_u;
              stackOut_6_7 = -1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_8_4 = stackOut_6_4;
              stackIn_8_5 = stackOut_6_5;
              stackIn_8_6 = stackOut_6_6;
              stackIn_8_7 = stackOut_6_7;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              stackIn_7_6 = stackOut_6_6;
              stackIn_7_7 = stackOut_6_7;
              if (!((bc) this).field_y) {
                stackOut_8_0 = (hc) (Object) stackIn_8_0;
                stackOut_8_1 = (String) (Object) stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = stackIn_8_4;
                stackOut_8_5 = stackIn_8_5;
                stackOut_8_6 = stackIn_8_6;
                stackOut_8_7 = stackIn_8_7;
                stackOut_8_8 = 2;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                stackIn_9_5 = stackOut_8_5;
                stackIn_9_6 = stackOut_8_6;
                stackIn_9_7 = stackOut_8_7;
                stackIn_9_8 = stackOut_8_8;
                break L1;
              } else {
                stackOut_7_0 = (hc) (Object) stackIn_7_0;
                stackOut_7_1 = (String) (Object) stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = stackIn_7_4;
                stackOut_7_5 = stackIn_7_5;
                stackOut_7_6 = stackIn_7_6;
                stackOut_7_7 = stackIn_7_7;
                stackOut_7_8 = 0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                stackIn_9_5 = stackOut_7_5;
                stackIn_9_6 = stackOut_7_6;
                stackIn_9_7 = stackOut_7_7;
                stackIn_9_8 = stackOut_7_8;
                break L1;
              }
            }
            int discarded$1 = ((hc) (Object) stackIn_9_0).a((String) (Object) stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, ((bc) this).field_w.field_I);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Connection lost. <%0>";
    }
}
