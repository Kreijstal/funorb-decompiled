/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nj {
    static int field_a;

    final static void a(int param0) {
        int var1 = (kh.field_Mb + -640) / 2;
        int var2 = ed.field_f * ed.field_f;
        int var3 = var2 - qa.field_t * qa.field_t;
        ia.field_j.a(199, -124 + (gf.field_k + -90), (byte) 49, 90, -(199 * var3 / var2) + var1);
        se.field_i.a(param0, gf.field_k - 124, (byte) 56, 0, var1 + (202 + var3 * 438 / var2));
    }

    final static String a(String param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        sl var6 = null;
        CharSequence var7 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        String stackOut_16_0 = null;
        String stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        String stackOut_21_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            var7 = (CharSequence) (Object) param0;
            if (gb.a((byte) -118, var7)) {
              if (po.field_b == 2) {
                if (!jp.a(param0, (byte) -105)) {
                  if (da.a(-30106, param0)) {
                    stackOut_11_0 = re.a(tr.field_pb, 4371, new String[1]);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    L1: {
                      if (r.field_c < 100) {
                        break L1;
                      } else {
                        if (es.field_m <= 0) {
                          stackOut_16_0 = hd.field_p;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L2: {
                      if (param2 <= -57) {
                        break L2;
                      } else {
                        var5 = null;
                        String discarded$1 = nj.a((String) null, -114, (byte) -20);
                        break L2;
                      }
                    }
                    if (r.field_c < 200) {
                      if (ti.a(param0, true)) {
                        stackOut_25_0 = re.a(go.field_G, 4371, new String[1]);
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      } else {
                        var6 = js.field_f;
                        var6.h(param1, 255);
                        var6.field_j = var6.field_j + 1;
                        var4 = var6.field_j;
                        var6.c(0, (byte) -58);
                        var6.a(param0, (byte) 0);
                        var6.b(-var4 + var6.field_j, (byte) 118);
                        stackOut_27_0 = null;
                        stackIn_28_0 = stackOut_27_0;
                        break L0;
                      }
                    } else {
                      stackOut_21_0 = hd.field_p;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0;
                    }
                  }
                } else {
                  stackOut_7_0 = wb.field_f;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = of.field_c;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = tm.field_j;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("nj.D(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L3;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 44 + param2 + 41);
        }
        return (String) (Object) stackIn_28_0;
    }

    final static void a(float param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              il.field_cb = param0;
              pc.field_r = param2;
              if (param1 == 2) {
                break L1;
              } else {
                field_a = 17;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nj.B(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        var1 = 0;
        fa.field_X = null;
        if (ck.field_a != null) {
          cg.field_C = er.field_j;
          uq.field_j = ck.field_a;
          uq.field_j.field_jb = -1;
          er.field_j = null;
          uq.field_j.field_qb = -1;
          ck.field_a = null;
          sg.field_Ab = null;
          hd.field_m = null;
          mb.field_n = null;
          cb.field_l = null;
          sr.field_h = true;
          return;
        } else {
          sg.field_Ab = null;
          hd.field_m = null;
          mb.field_n = null;
          cb.field_l = null;
          sr.field_h = true;
          return;
        }
    }

    static {
    }
}
