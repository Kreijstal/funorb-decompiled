/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lf {
    static ja[] field_c;
    static lf field_a;
    static int field_d;
    static th field_e;
    static String field_b;

    final static StringBuilder a(char param0, int param1, int param2, StringBuilder param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = param3.length();
        param3.setLength(param1);
        if (param2 != 0) {
          var7 = null;
          StringBuilder discarded$2 = lf.a('￝', 1, -128, (StringBuilder) null);
          var5 = var4;
          L0: while (true) {
            if (param1 <= var5) {
              return param3;
            } else {
              param3.setCharAt(var5, param0);
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = var4;
          L1: while (true) {
            if (param1 <= var5) {
              return param3;
            } else {
              param3.setCharAt(var5, param0);
              var5++;
              continue L1;
            }
          }
        }
    }

    final static void a(dm param0, boolean param1) {
        dm var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        param0.a(param1);
        var2 = (dm) (Object) cg.field_i.c(104);
        L0: while (true) {
          if (var2 != null) {
            if (var2.a((byte) -117, param0)) {
              var2 = (dm) (Object) cg.field_i.b(6);
              continue L0;
            } else {
              if (var2 != null) {
                vc.a((br) (Object) var2, (br) (Object) param0, param1);
                return;
              } else {
                cg.field_i.a((br) (Object) param0, false);
                return;
              }
            }
          } else {
            if (var2 != null) {
              vc.a((br) (Object) var2, (br) (Object) param0, param1);
              return;
            } else {
              cg.field_i.a((br) (Object) param0, false);
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
    }

    final static void a(boolean param0, int param1, long param2, int param3, int param4, int param5, go param6, int param7, boolean param8, int param9, int param10, int param11, String param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            if (param1 == -5989) {
              L0: {
                s.field_e = new ga(param11);
                ma.field_a = new ga(param10);
                tm.field_c = param12;
                if (!param8) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L0;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
              L1: {
                cm.field_e = stackIn_5_0 != 0;
                ok.field_m = param6;
                if (!param0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              gj.field_e = stackIn_8_0 != 0;
              dc.field_Hb = param3;
              jo.field_b = param13;
              rp.field_q = param7;
              lo.field_b = param5;
              v.field_f = param4;
              qa.field_i = param2;
              ff.field_s = param9;
              if (null != ok.field_m.field_s) {
                try {
                  bg.field_e = new of(ok.field_m.field_s, 64, 0);
                } catch (java.io.IOException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(ef param0, int param1) {
        int var2 = 0;
        ja var3 = null;
        if (null == of.field_k) {
          return;
        } else {
          var2 = param0.field_C - -param0.field_r;
          var3 = new ja(var2, var2);
          var3.a();
          of.field_k.c(0, param1, var2, var2);
          dl.field_h.b((byte) 119);
          of.field_k = var3;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new lf();
        field_e = new th();
        field_b = "Disguise";
    }
}
