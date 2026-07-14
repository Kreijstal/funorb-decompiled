/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le extends IOException {
    static hl field_c;
    static String[] field_b;
    static int field_a;
    static boolean[] field_d;
    static rk field_e;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != -11434) {
            field_e = null;
        }
    }

    final static void a(String param0, int param1, int param2, ka param3, boolean param4, int param5, long param6, boolean param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            L0: {
              if (param5 == 22692) {
                break L0;
              } else {
                field_d = null;
                break L0;
              }
            }
            L1: {
              se.field_p = new ia(param11);
              d.field_b = new ia(param2);
              sj.field_I = param9;
              if (!param4) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              qa.field_e = stackIn_5_0 != 0;
              r.field_d = param10;
              ce.field_b = param8;
              og.field_a = param3;
              gh.field_B = param6;
              bf.field_s = param12;
              kl.field_a = param0;
              if (!param7) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            ah.field_i = stackIn_8_0 != 0;
            jg.field_A = param1;
            pe.field_c = param13;
            if (null != og.field_a.field_c) {
              try {
                mf.field_c = new td(og.field_a.field_c, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
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

    final static void b(int param0) {
        if (!gh.f(-23093)) {
            return;
        }
        ig.a((byte) 94, 4, false);
        int var1 = 71 / ((param0 - -80) / 40);
    }

    final static boolean c(int param0) {
        if (param0 == 4) {
          if (-21 >= (rk.field_d ^ -1)) {
            if (ai.a((byte) -76)) {
              if (jj.field_F > 0) {
                if (rb.e((byte) -72)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_a = -36;
          if (-21 >= (rk.field_d ^ -1)) {
            if (ai.a((byte) -76)) {
              if (jj.field_F > 0) {
                if (rb.e((byte) -72)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    le(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -4797) {
            return;
        }
        pk.field_c = param4;
        rg.field_D = param3;
        sg.field_e = param1;
        kf.field_v = param2;
    }

    final static hl[] a(int param0, int param1, byte param2, ue param3) {
        int var4 = 0;
        if (!qb.a((byte) 116, param1, param0, param3)) {
          return null;
        } else {
          var4 = 20 / ((-39 - param2) / 36);
          return rg.i(104);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 50;
        field_b = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
