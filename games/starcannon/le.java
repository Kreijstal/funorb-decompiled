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
          field_e = (rk) null;
        }
    }

    final static void a(String param0, int param1, int param2, ka param3, boolean param4, int param5, long param6, boolean param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            if (param5 != 22692) {
              field_d = (boolean[]) null;
            }
            se.field_p = new ia(param11);
            d.field_b = new ia(param2);
            sj.field_I = param9;
            qa.field_e = param4;
            r.field_d = param10;
            ce.field_b = param8;
            og.field_a = param3;
            gh.field_B = param6;
            bf.field_s = param12;
            kl.field_a = param0;
            ah.field_i = param7;
            jg.field_A = param1;
            pe.field_c = param13;
            if (null == og.field_a.field_c) {
              return;
            }
            try {
              mf.field_c = new td(og.field_a.field_c, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("le.F(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
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
        int var1 = 71 / ((param0 + 80) / 40);
    }

    final static boolean c(int param0) {
        if (param0 != 4) {
          field_a = -36;
          if (rk.field_d < 20) {
            return true;
          }
          if (!ai.a((byte) -76)) {
            return true;
          }
          if (jj.field_F <= 0) {
            return false;
          }
          if (!rb.e((byte) -72)) {
            return true;
          }
          return false;
        }
        if (rk.field_d < 20) {
          return true;
        }
        if (!ai.a((byte) -76)) {
          return true;
        }
        if (jj.field_F <= 0) {
          return false;
        }
        if (!rb.e((byte) -72)) {
          return true;
        }
        return false;
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
        int var4_int = 0;
        RuntimeException var4 = null;
        hl[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qb.a((byte) 116, param1, param0, param3)) {
            return null;
          }
          var4_int = 20 / ((-39 - param2) / 36);
          stackIn_4_0 = rg.i(104);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("le.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_a = 50;
        field_b = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
