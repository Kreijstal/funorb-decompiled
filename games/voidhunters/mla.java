/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mla extends rqa {
    static llb field_q;
    static String field_o;
    static float[] field_s;
    static float[] field_p;
    static String field_r;

    final static asb a(boolean param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            ga var8 = null;
            asb stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            asb stackOut_12_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (gia.field_k.field_d == null) {
                    break L1;
                  } else {
                    cba.field_e = new gdb(gia.field_k.field_d, 5200, 0);
                    gia.field_k.field_d = null;
                    var6 = (Object) (Object) new fo(255, cba.field_e, new gdb(gia.field_k.field_t, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  if (null == cba.field_e) {
                    break L2;
                  } else {
                    L3: {
                      if (null == btb.field_d) {
                        btb.field_d = new gdb[gia.field_k.field_l.length];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (null == btb.field_d[param4]) {
                        btb.field_d[param4] = new gdb(gia.field_k.field_l[param4], 12000, 0);
                        gia.field_k.field_l[param4] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new fo(param4, cba.field_e, btb.field_d[param4], 2097152);
                    break L2;
                  }
                }
                L5: {
                  var8 = ho.field_a.a(param4, 5, (fo) var6, (fo) var7, param3);
                  if (param2 <= -48) {
                    break L5;
                  } else {
                    asb discarded$2 = mla.a(false, false, 36, false, -48, -32);
                    break L5;
                  }
                }
                stackOut_12_0 = new asb((fnb) (Object) var8, param0, param5);
                stackIn_13_0 = stackOut_12_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_13_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          mla.a(-123);
          field_q = null;
          field_o = null;
          field_r = null;
          field_p = null;
          field_s = null;
          return;
        } else {
          field_q = null;
          field_o = null;
          field_r = null;
          field_p = null;
          field_s = null;
          return;
        }
    }

    final static int a(String param0, ds param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            var3_int = param1.field_e;
            var5 = (CharSequence) (Object) param0;
            var4 = hi.a(var5, 96);
            param1.b((byte) 124, var4.length);
            param1.field_e = param1.field_e + eob.field_o.b(var4.length, var4, param1.field_h, 104, param1.field_e, 0);
            stackOut_2_0 = -var3_int + param1.field_e;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("mla.C(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + -113 + 41);
        }
        return stackIn_3_0;
    }

    mla(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
            oq.field_E = param0[0].a(93);
            if (param1 < -119) {
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
            stackOut_5_1 = new StringBuilder().append("mla.A(");
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_s = new float[16384];
        field_o = "Spinning blade";
        field_p = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
            field_p[var2] = (float)Math.sin(var0 * (double)var2);
            field_s[var2] = (float)Math.cos(var0 * (double)var2);
        }
        field_r = "This is your RuneScape clan if you have one.";
    }
}
