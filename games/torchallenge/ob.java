/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static String[] field_a;
    static int[][] field_c;
    static int[] field_b;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        L0: {
          var3 = param1;
          pa.field_x = pa.field_x + var3;
          if (!bh.field_p) {
            kj.field_B.a(new bk(param0, var3, ac.field_d, ae.field_z, pa.field_x, pd.field_c - -tf.field_o), -66);
            break L0;
          } else {
            break L0;
          }
        }
        pd.field_c = pd.field_c + var3;
        if (param2 != -7756) {
          field_b = (int[]) null;
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var3 = new java.net.URL(param1.getCodeBase(), param0);
                    if (param2 == 43) {
                      break L1;
                    } else {
                      field_a = (String[]) null;
                      break L1;
                    }
                  }
                  var3 = mc.a(var3, param2 ^ -44, param1);
                  u.a(param1, true, -107, var3.toString());
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var3_ref2);
                stackOut_6_1 = new StringBuilder().append("ob.C(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              L3: {
                stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 887316838) {
            return;
        }
        field_a = null;
        field_c = (int[][]) null;
    }

    final static void b(int param0) {
        if (param0 > -85) {
            return;
        }
        if (!(qf.field_a == null)) {
            qf.field_a.a((byte) 94);
            qf.field_a = null;
        }
    }

    final static void a(int param0, uf param1) {
        int var2_int = 0;
        try {
            ia.field_j = param1.c(false) << -1018871611;
            var2_int = param1.j(-109);
            ti.field_e = 1835008 & var2_int << 357802706;
            if (param0 >= -30) {
                ob.a(127, -50, -88);
            }
            ia.field_j = ia.field_j + (var2_int >> 875719427);
            ti.field_e = ti.field_e + (param1.c(false) << -460180766);
            var2_int = param1.j(-86);
            ti.field_e = ti.field_e + (var2_int >> 887316838);
            uc.field_U = var2_int << 1330872399 & 2064384;
            uc.field_U = uc.field_U + (param1.j(-126) << 482469703);
            var2_int = param1.j(-123);
            jf.field_sb = var2_int << -271097840 & 65536;
            uc.field_U = uc.field_U + (var2_int >> 82801281);
            jf.field_sb = jf.field_sb + param1.c(false);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ob.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_b = new int[]{6, 433, 180, 39};
        field_c = new int[10][2];
    }
}
