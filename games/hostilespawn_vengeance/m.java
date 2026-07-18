/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class m extends am {
    static bm field_n;
    static String field_j;
    static String field_r;
    static String field_k;
    byte[] field_i;
    int field_o;
    static int field_q;
    static int field_h;
    static boolean field_l;
    static String[] field_m;
    static String field_p;

    public static void b() {
        field_n = null;
        field_m = null;
        field_k = null;
        field_p = null;
        field_r = null;
        field_j = null;
    }

    final static boolean c(int param0) {
        int var1 = 0;
        var1 = -81 / ((param0 - -27) / 63);
        if (null != nb.field_F) {
          if (null == nb.field_F.k(0)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, boolean param1, fd param2, int param3, int param4, int param5, int param6, int param7, int param8, long param9, String param10, int param11, int param12, boolean param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            Object var16 = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  sc.field_g = new en(param7);
                  s.field_b = new en(param4);
                  fh.field_b = param8;
                  uj.field_k = param2;
                  vi.field_l = param9;
                  uc.field_d = param10;
                  if (param11 < -22) {
                    break L1;
                  } else {
                    var16 = null;
                    m.a(90, false, (fd) null, 122, -120, -27, -1, 13, 18, -21L, (String) null, 69, -50, true);
                    break L1;
                  }
                }
                L2: {
                  le.field_bb = param12;
                  cb.field_c = param3;
                  og.field_c = param0;
                  rl.field_b = param5;
                  ea.field_c = param6;
                  if (!param13) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  wc.field_g = stackIn_5_0 != 0;
                  if (!param1) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                sd.field_u = stackIn_8_0 != 0;
                if (uj.field_k.field_q == null) {
                  break L0;
                } else {
                  {
                    L4: {
                      q.field_b = new bn(uj.field_k.field_q, 64, 0);
                      break L4;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) var15_ref;
                stackOut_13_1 = new StringBuilder().append("m.B(").append(param0).append(',').append(param1).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param2 == null) {
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
              L6: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param10 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static long a() {
        return -bb.field_c + hn.a((byte) 80);
    }

    private m() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "<col=ffffff>Plasma<nbsp>cannon</col><br>The plasma cannon is the pinnacle of military technology. The plasma ball that this weapon fires explodes in a short-ranged ß-ray blast that can boil targets even through walls.";
        field_k = "Aha! A magnetically accelerated projectile weapon or \"railgun\".";
        field_j = "It's quiet<nbsp>... too quiet. That must mean it's completely safe.";
        field_n = new bm();
        field_m = new String[]{"All scores", "My scores", "Best each"};
        field_h = 50;
        field_p = "Well these rockets would be useful if I had a rocket launcher.";
    }
}
