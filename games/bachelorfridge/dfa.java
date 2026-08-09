/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dfa {
    static int field_b;
    static int[] field_c;
    boolean field_a;

    final static void a(int param0, int param1, int param2, int param3, byte[] param4, int param5, sna param6, sna param7, int param8, sna param9) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            ge.field_F = -1L;
            mja.field_s = param4;
            kb.field_j = param5;
            ld.field_q = param4.length;
            fia.field_r = new byte[(7 + kb.field_j) / 8];
            ce.field_y = false;
            rv.field_n = null;
            pw.field_w = null;
            var10_int = 0;
            var11 = param3;
            L1: while (true) {
              if (mja.field_s.length <= var11) {
                L2: {
                  var10_int = (7 + var10_int) / 8;
                  sca.field_c = new byte[var10_int];
                  if (param9.field_z != null) {
                    break L2;
                  } else {
                    param9.field_z = new eaa();
                    break L2;
                  }
                }
                L3: {
                  aa.field_l = param9.field_z;
                  aa.field_l.d(99);
                  iga.field_c = new wma(param2);
                  wk.field_a = -1;
                  ui.field_q = -1;
                  hja.field_i = 0;
                  hc.field_J = 0;
                  if (null != param7.field_z) {
                    break L3;
                  } else {
                    param7.field_z = new eaa();
                    break L3;
                  }
                }
                L4: {
                  uma.field_M = param7.field_z;
                  uma.field_M.d(param3 + 91);
                  ola.field_g = new wma(param8);
                  if (null != param6.field_z) {
                    break L4;
                  } else {
                    param6.field_z = new eaa();
                    break L4;
                  }
                }
                bia.field_g = param6.field_z;
                bia.field_g.d(param3 + 92);
                wi.field_i = new wma(param1);
                wda.field_a = 0L;
                kla.field_x = param0;
                break L0;
              } else {
                var10_int = var10_int + (255 & mja.field_s[var11]);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var10);

            stackIn_14_1 = new StringBuilder().append("dfa.VB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param7 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int var4;
        var4 = BachelorFridge.field_y;
        if (0 != hp.field_c) {
          hp.field_c = 0;
          kj.b((byte) -88);
          if (param0 != 8) {
            this.field_a = true;
            return;
          } else {
            return;
          }
        } else {
          if (!hs.a(false, nga.field_i)) {
            lg.a(true, 0, param1);
            if (param0 == 8) {
              return;
            } else {
              this.field_a = true;
              return;
            }
          } else {
            lg.a(true, 8, param1);
            if (param0 == 8) {
              return;
            } else {
              this.field_a = true;
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
    }

    static {
        field_c = new int[4];
    }
}
