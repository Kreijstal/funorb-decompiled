/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class pg extends java.awt.Canvas {
    static mk field_a;
    private java.awt.Component field_d;
    static String[] field_e;
    static String field_c;
    static String field_b;

    public static void a() {
        field_c = null;
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final static int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (param1 == 1) {
                  stackOut_9_0 = param0 * var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_11_0 = var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                L2: {
                  if (0 != (1 & param1)) {
                    var3_int = var3_int * param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var3, "pg.D(" + param0 + 44 + param1 + 44 + -2 + 41);
        }
        return stackIn_12_0;
    }

    final static void a(byte param0, db param1, boolean param2, db param3, db param4) {
        try {
            if (param0 >= -96) {
                Object var6 = null;
                pg.a((byte) 43, (db) null, false, (db) null, (db) null);
            }
            int discarded$0 = 51;
            gk.field_e = lc.a("");
            gk.field_e.a(106, false);
            e.a(4, param1, param4, param3);
            int discarded$1 = -3121;
            hm.a();
            sg.field_b = tl.field_e;
            lc.field_c = tl.field_e;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "pg.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, int param3, un param4, int param5) {
        RuntimeException var6 = null;
        al[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        al[] var10 = null;
        gb var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_24_0 = null;
        java.awt.Frame stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        java.awt.Frame stackOut_25_0 = null;
        Object stackOut_23_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param4.b(5)) {
              L1: {
                if (param5 != 0) {
                  break L1;
                } else {
                  var10 = ri.a(param4, (byte) 27);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (param2 != var10[var8].field_i) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (java.awt.Frame) (Object) stackIn_7_0;
                  }
                }
              }
              var11 = param4.a(param2, param1, param5, param3, (byte) 4);
              L4: while (true) {
                if (0 != var11.field_a) {
                  var7 = (java.awt.Frame) var11.field_b;
                  if (var7 != null) {
                    var8 = 0;
                    if (2 != var11.field_a) {
                      stackOut_25_0 = (java.awt.Frame) var7;
                      stackIn_26_0 = stackOut_25_0;
                      break L0;
                    } else {
                      bo.a(param4, var7, 1);
                      stackOut_23_0 = null;
                      stackIn_24_0 = stackOut_23_0;
                      return (java.awt.Frame) (Object) stackIn_24_0;
                    }
                  } else {
                    stackOut_20_0 = null;
                    stackIn_21_0 = stackOut_20_0;
                    return (java.awt.Frame) (Object) stackIn_21_0;
                  }
                } else {
                  fh.a(true, 10L);
                  continue L4;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("pg.C(").append(112).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param5 + 41);
        }
        return stackIn_26_0;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((pg) this).field_d.update(param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "pg.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    pg(java.awt.Component param0) {
        try {
            ((pg) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "pg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((pg) this).field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "pg.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Teleroom", "Sacrifice", "Crystal Beyond", "Shufflesworth", "City", "Double Trouble", "Mining", "Bomb Tower", "The Pit", "Come Again Rock", "Which Way?", "Stop Pushing!"};
        field_c = "Create your own free Jagex account";
        field_b = "Play free version";
        field_a = new mk();
    }
}
