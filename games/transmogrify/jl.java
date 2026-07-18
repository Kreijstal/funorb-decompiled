/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends wf {
    int field_n;
    int field_i;
    int field_g;
    static int field_o;
    int field_k;
    int field_h;
    int field_m;
    static ti field_l;
    static int field_j;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              sb.d(param0, param1, 1 + param3, 10000536);
              sb.d(param0, param1 - -param4, 1 + param3, 12105912);
              var5_int = 1;
              var6 = param4;
              if (sb.field_e > param1 - -var5_int) {
                var5_int = -param1 + sb.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (sb.field_f >= param1 + var6) {
                break L2;
              } else {
                var6 = -param1 + sb.field_f;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = 152 - -(48 * var7 / param4);
                var9 = var8 | (var8 << 16 | var8 << 8);
                sb.field_h[param0 + (param1 - -var7) * sb.field_c] = var9;
                sb.field_h[sb.field_c * (var7 + param1) + param0 - -param3] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var5, "jl.C(" + param0 + ',' + param1 + ',' + 13612 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        oi var4_ref_oi = null;
        int var4 = 0;
        jl var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        hj var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = nf.field_l;
              var2 = var9.d((byte) 78);
              var3 = var9.d((byte) 106);
              if (var2 != 0) {
                if (var2 != 1) {
                  int discarded$4 = 48;
                  d.a((Throwable) null, 46, "LR1: " + ik.q());
                  int discarded$5 = 1;
                  pc.a();
                  break L1;
                } else {
                  var4 = var9.k(128);
                  var5 = (jl) (Object) ll.field_T.a((byte) -95);
                  L2: while (true) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        L4: {
                          if (var5.field_m != var3) {
                            break L4;
                          } else {
                            if (var4 == var5.field_i) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 = (jl) (Object) ll.field_T.a(true);
                        continue L2;
                      }
                    }
                    if (var5 == null) {
                      int discarded$6 = 1;
                      pc.a();
                      return;
                    } else {
                      var5.c(5);
                      break L1;
                    }
                  }
                }
              } else {
                var4_ref_oi = (oi) (Object) qd.field_d.a((byte) -95);
                if (var4_ref_oi == null) {
                  int discarded$7 = 1;
                  pc.a();
                  return;
                } else {
                  L5: {
                    var5_int = -var9.field_h + tg.field_a;
                    var13 = var4_ref_oi.field_m;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5_int <= var13.length << 2) {
                      break L5;
                    } else {
                      var5_int = var13.length << 2;
                      break L5;
                    }
                  }
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5_int) {
                      var4_ref_oi.c(5);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) 126) << (vg.c(var7, 3) << 8));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "jl.B(" + 1 + ')');
        }
    }

    public static void a() {
        field_l = null;
    }

    private jl() throws Throwable {
        throw new Error();
    }

    final static void a(java.awt.Component param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param0.addMouseListener((java.awt.event.MouseListener) (Object) hi.field_e);
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hi.field_e);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) hi.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("jl.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
    }
}
