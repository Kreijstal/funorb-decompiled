/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kj extends jk {
    static int field_G;
    static String field_E;
    static le field_F;
    private pj field_D;

    final void b(byte param0, we param1) {
        rh var3 = null;
        try {
            if (!(param1 instanceof rh)) {
                throw new IllegalArgumentException();
            }
            if (param0 >= -32) {
                field_F = null;
            }
            var3 = (rh) (Object) param1;
            ((kj) this).field_D.a((ug) (Object) var3, (byte) 13);
            var3.field_z = true;
            boolean discarded$0 = var3.a((we) this, false);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "kj.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public kj() {
        super(0, 0, tf.field_b, uj.field_l, (ml) null, (of) null);
        ((kj) this).field_D = new pj();
    }

    final static void a(boolean param0, int param1) {
        jk.field_u = jk.field_u + uj.field_h;
        if (!(jk.field_u >= 0)) {
            ck.field_b = -1;
        }
        if (jk.field_u > 30) {
            if (0 <= ck.field_b) {
                if (param0) {
                    uj.field_h = uj.field_h * -1;
                    jk.field_u = 30;
                }
            }
        }
    }

    final static le a(int param0, ad param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        le stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        le stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 17196) {
                break L1;
              } else {
                var5 = null;
                le discarded$9 = kj.a(4, (ad) null, 48, 57);
                break L1;
              }
            }
            int discarded$10 = -3;
            if (wg.a(param3, param0, param1)) {
              stackOut_5_0 = od.b(param2 + -17093);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("kj.DA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final void k(int param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((kj) this).field_D);
        rh var3 = (rh) (Object) var2.a((byte) -37);
        while (var3 != null) {
            var3.field_z = false;
            var3 = (rh) (Object) var2.a(true);
        }
        if (param0 <= 43) {
            return;
        }
        ((kj) this).field_v = null;
    }

    final we a(int param0) {
        ck var2 = null;
        rh var3 = null;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -1) {
          var2 = new ck(((kj) this).field_D);
          var3 = (rh) (Object) var2.a((byte) -37);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_z) {
                return var3.a(true);
              } else {
                var3 = (rh) (Object) var2.a(true);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static boolean m() {
        i var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        i var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (i) (Object) ua.field_v.a((byte) -117);
            var1 = var4;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_e) {
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L2: {
                    if (null != var4.field_k[var2]) {
                      if (var4.field_k[var2].field_g == 0) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4.field_s[var2] != null) {
                      if (0 == var4.field_s[var2].field_g) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1_ref, "kj.B(" + 0 + 41);
        }
        return stackIn_21_0 != 0;
    }

    public static void d() {
        int var1 = -86;
        field_E = null;
        field_F = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 30) {
            Object var8 = null;
            ((kj) this).b((byte) -88, (we) null);
        }
        if (((kj) this).field_h != null) {
            ((kj) this).field_h.a(true, (we) this, param2, param3, 55);
        }
        ck var5 = new ck(((kj) this).field_D);
        we var6 = (we) (Object) var5.b((byte) -103);
        while (var6 != null) {
            var6.a(30, param1, ((kj) this).field_e + param2, param3 - -((kj) this).field_r);
            var6 = (we) (Object) var5.a(param0 + -3733);
        }
    }

    final void a(boolean param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!param0) {
            field_F = null;
        }
        ck var2 = new ck(((kj) this).field_D);
        rh var3 = (rh) (Object) var2.a((byte) -37);
        while (var3 != null) {
            if (!(!var3.b(false))) {
                var3.c(-19822);
            }
            var3 = (rh) (Object) var2.a(true);
        }
    }

    final void l(int param0) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var4 = -104 / ((75 - param0) / 44);
        ck var2 = new ck(((kj) this).field_D);
        rh var3 = (rh) (Object) var2.a((byte) -37);
        while (var3 != null) {
            if (var3.k(-23913)) {
                var3.c(-19822);
            }
            var3 = (rh) (Object) var2.a(true);
        }
        ((kj) this).field_v = (we) (Object) ((kj) this).j(-73);
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, String param6, long param7, boolean param8, int param9, int param10, byte param11, int param12, md param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                L1: {
                  MonkeyPuzzle2.field_D = new hb(5000);
                  gf.field_c = new hb(5000);
                  pj.field_g = param13;
                  j.field_a = param10;
                  if (!param2) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  mb.field_c = stackIn_3_0 != 0;
                  if (!param8) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  me.field_e = stackIn_6_0 != 0;
                  od.field_l = param7;
                  kc.field_c = param4;
                  mk.field_h = param5;
                  rl.field_a = param0;
                  di.field_d = param6;
                  cg.field_g = param12;
                  id.field_m = param1;
                  if (null == pj.field_g.field_x) {
                    break L3;
                  } else {
                    {
                      L4: {
                        hj.field_D = new ch(pj.field_g.field_x, 64, 0);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var15_ref;
                stackOut_11_1 = new StringBuilder().append("kj.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(5000).append(44).append(param4).append(44).append(param5).append(44);
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param6 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param7).append(44).append(param8).append(44).append(5000).append(44).append(param10).append(44).append(-111).append(44).append(param12).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param13 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rh j(int param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((kj) this).field_D);
        rh var3 = (rh) (Object) var2.a((byte) -37);
        while (var3 != null) {
            if (!(!var3.field_z)) {
                return var3;
            }
            var3 = (rh) (Object) var2.a(true);
        }
        if (param0 <= -32) {
            return null;
        }
        ((kj) this).a(false);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Connection timed out. Please try using a different server.";
    }
}
