/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss {
    static int field_j;
    static hd field_c;
    static String field_f;
    static String field_i;
    static String[] field_a;
    static String field_h;
    static String field_g;
    static ak field_b;
    static String field_e;
    static String field_d;

    public static void a(byte param0) {
        boolean discarded$2 = false;
        field_b = null;
        field_i = null;
        field_f = null;
        if (param0 != -90) {
          discarded$2 = ss.a((byte) -76, 109, 26, -32);
          field_g = null;
          field_d = null;
          field_e = null;
          field_a = null;
          field_h = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          field_e = null;
          field_a = null;
          field_h = null;
          field_c = null;
          return;
        }
    }

    final static void a(String param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ql.a(false, param0, param2, 3960);
              if (param1 < -114) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ss.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 == 88) {
          if (null != wi.field_v) {
            if (!wi.field_v.a((byte) -52)) {
              if (null != ck.field_b) {
                if (!ck.field_b.h((byte) 37)) {
                  if (!br.a(param0 ^ 62)) {
                    if (ni.a(param3, param2, param1, -20859)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  ck.field_b = null;
                  da.b(85);
                  return true;
                }
              } else {
                if (!br.a(param0 ^ 62)) {
                  if (ni.a(param3, param2, param1, -20859)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              da.b(param0 ^ 21);
              return true;
            }
          } else {
            if (null != ck.field_b) {
              if (!ck.field_b.h((byte) 37)) {
                if (!br.a(param0 ^ 62)) {
                  if (ni.a(param3, param2, param1, -20859)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                ck.field_b = null;
                da.b(85);
                return true;
              }
            } else {
              if (!br.a(param0 ^ 62)) {
                if (ni.a(param3, param2, param1, -20859)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return true;
        }
    }

    static {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_f = "leagues";
        field_g = "resigned";
        field_i = "Drag your players from the grid to fill slot <%0> and slot <%1> on the pitch.<br>Click ready when done.";
        field_e = "Total: ";
        field_d = "You need to play 1 more rated game to unlock this option.";
        field_h = "Unable to add friend - system busy";
    }
}
