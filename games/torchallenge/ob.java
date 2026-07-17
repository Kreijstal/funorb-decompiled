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
            kj.field_B.a((da) (Object) new bk(param0, var3, ac.field_d, ae.field_z, pa.field_x, pd.field_c - -tf.field_o), -66);
            break L0;
          } else {
            break L0;
          }
        }
        pd.field_c = pd.field_c + var3;
        if (param2 != -7756) {
          field_b = null;
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
            Throwable decompiledCaughtException = null;
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
              try {
                L0: {
                  var3 = new java.net.URL(param1.getCodeBase(), param0);
                  var3 = mc.a(var3, -1, param1);
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
              L1: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var3_ref2;
                stackOut_4_1 = new StringBuilder().append("ob.C(");
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
              throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + 43 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
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
            ia.field_j = param1.c(false) << 5;
            var2_int = param1.j(-109);
            ti.field_e = 1835008 & var2_int << 18;
            if (param0 >= -30) {
                ob.a(127, -50, -88);
            }
            ia.field_j = ia.field_j + (var2_int >> 3);
            ti.field_e = ti.field_e + (param1.c(false) << 2);
            var2_int = param1.j(-86);
            ti.field_e = ti.field_e + (var2_int >> 6);
            uc.field_U = var2_int << 15 & 2064384;
            uc.field_U = uc.field_U + (param1.j(-126) << 7);
            var2_int = param1.j(-123);
            jf.field_sb = var2_int << 16 & 65536;
            uc.field_U = uc.field_U + (var2_int >> 1);
            jf.field_sb = jf.field_sb + param1.c(false);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ob.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_b = new int[]{6, 433, 180, 39};
        field_c = new int[10][2];
    }
}
