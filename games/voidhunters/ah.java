/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends rqa {
    static int[] field_o;

    final static void e() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            if (!wgb.field_g) {
              return;
            } else {
              mmb.field_d = new aja[hwa.field_r.length];
              var1_int = 0;
              L1: while (true) {
                if (mmb.field_d.length <= var1_int) {
                  mmb.field_d[30] = wba.a((byte) -62, og.field_r, oaa.field_j);
                  nkb.a(false, "Finished building sprites");
                  break L0;
                } else {
                  L2: {
                    if (null != hwa.field_r[var1_int]) {
                      mmb.field_d[var1_int] = og.field_r.a(hwa.field_r[var1_int], false);
                      var1_int++;
                      break L2;
                    } else {
                      var1_int++;
                      break L2;
                    }
                  }
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "ah.D(" + -17 + 41);
        }
    }

    ah(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a() {
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 < -119) {
              si.a(233, 62, param0[0].a(15));
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ah.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (0 < hcb.field_o) {
          if (null == efb.field_b) {
            L0: {
              int discarded$2 = 0;
              int discarded$3 = 0;
              psb.field_b = ob.a(0, bm.field_o, 640, 480);
              if (psb.field_b != null) {
                var2 = 2;
                qa.a((byte) 77, (java.awt.Canvas) (Object) psb.field_b);
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            }
            if (null == efb.field_b) {
              if (!vbb.field_p) {
                return;
              } else {
                wha.a(2, true, var2);
                return;
              }
            } else {
              return;
            }
          } else {
            L1: {
              psb.field_b = efb.field_b.a((byte) 124);
              mb.h(2, 117);
              if (psb.field_b != null) {
                var2 = 2;
                qa.a((byte) 77, (java.awt.Canvas) (Object) psb.field_b);
                break L1;
              } else {
                var2 = 3;
                break L1;
              }
            }
            if (null != efb.field_b) {
              return;
            } else {
              L2: {
                if (vbb.field_p) {
                  wha.a(2, true, var2);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          if (fda.e((byte) 120)) {
            var2 = 0;
            if (null != efb.field_b) {
              return;
            } else {
              L3: {
                if (vbb.field_p) {
                  wha.a(2, true, var2);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            var2 = 1;
            if (null == efb.field_b) {
              if (!vbb.field_p) {
                return;
              } else {
                wha.a(2, true, var2);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[4];
    }
}
