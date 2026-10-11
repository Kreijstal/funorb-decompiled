/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static ae field_c;
    static String[] field_e;
    static String field_d;
    static int field_b;
    static String field_a;

    final static boolean a(byte param0, char param1) {
        if (param0 != 121) {
          field_e = (String[]) null;
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          if (param1 < 97) {
            return false;
          }
          if (122 >= param1) {
            return true;
          }
          return false;
        }
        if (param1 >= 65) {
          if (param1 <= 90) {
            return true;
          }
          if (param1 < 97) {
            return false;
          }
          if (122 >= param1) {
            return true;
          }
          return false;
        }
        if (param1 < 97) {
          return false;
        }
        if (122 >= param1) {
          return true;
        }
        return false;
    }

    final static boolean a(int param0, char param1) {
        if (param0 <= 115) {
          field_d = (String) null;
          if (160 == param1) {
            return true;
          }
          if (param1 == 32) {
            return true;
          }
          if (param1 == 95) {
            return true;
          }
          if (param1 != 45) {
            return false;
          }
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (param1 == 95) {
          return true;
        }
        if (param1 != 45) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_e = null;
        if (param0 >= -21) {
          ra.a(-11);
        }
    }

    final static void a(int param0, byte param1) {
        int var3;
        var3 = MinerDisturbance.field_ab;
        if (1 == param0) {
          ke.field_X[21] = true;
        } else {
          if (param0 == 6) {
            ke.field_X[14] = true;
          } else {
            if (16 == param0) {
              ke.field_X[0] = true;
            }
          }
        }
        if (param1 == -59) {
          return;
        }
        ra.a(120, (byte) -99);
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -38) {
            stackIn_4_0 = bi.a(false, false, param1);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ra.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_c = new ae();
        field_d = "This password contains repeated characters, and would be easy to guess";
        field_a = "Names cannot contain consecutive spaces";
    }
}
