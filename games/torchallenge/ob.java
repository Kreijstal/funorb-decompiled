/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static String[] field_a;
    static int[][] field_c;
    static int[] field_b;

    final static void a(int param0, int param1, int param2) {
        int var3 = param1;
        pa.field_x = pa.field_x + var3;
        if (!bh.field_p) {
          kj.field_B.a(new bk(param0, var3, ac.field_d, ae.field_z, pa.field_x, pd.field_c + tf.field_o), -66);
        }
        pd.field_c = pd.field_c + var3;
        if (param2 == -7756) {
          return;
        }
        field_b = (int[]) null;
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var3 = new java.net.URL(param1.getCodeBase(), param0);
              if (param2 != 43) {
                field_a = (String[]) null;
              }
              var3 = mc.a(var3, param2 ^ -44, param1);
              u.a(param1, true, -107, var3.toString());
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ob.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
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
        if (qf.field_a != null) {
          qf.field_a.a((byte) 94);
          qf.field_a = null;
        }
    }

    final static void a(int param0, uf param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          ia.field_j = param1.c(false) << 5;
          var2_int = param1.j(-109);
          ti.field_e = 1835008 & var2_int << 18;
          if (param0 >= -30) {
            ob.a(127, -50, -88);
          }
          ia.field_j = ia.field_j + (var2_int >> 3);
          ti.field_e = ti.field_e + (param1.c(false) << 2);
          var2_intLifetime1 = param1.j(-86);
          ti.field_e = ti.field_e + (var2_intLifetime1 >> 6);
          uc.field_U = var2_intLifetime1 << 15 & 2064384;
          uc.field_U = uc.field_U + (param1.j(-126) << 7);
          var2_intLifetime2 = param1.j(-123);
          jf.field_sb = var2_intLifetime2 << 16 & 65536;
          uc.field_U = uc.field_U + (var2_intLifetime2 >> 1);
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
