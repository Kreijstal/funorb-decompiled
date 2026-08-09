/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    private String field_b;
    static String[] field_c;
    private boolean field_g;
    static of field_a;
    static String field_f;
    static String field_e;
    static int field_d;

    final String a(byte param0) {
        if (param0 >= -48) {
            return (String) null;
        }
        return this.field_b;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            this.field_b = (String) null;
            return this.field_g;
        }
        return this.field_g;
    }

    hb(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_b = param0;
              if (null != this.field_b) {
                break L1;
              } else {
                this.field_b = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            ((hb) (this)).field_g = stackIn_6_1 != 0;
            if (0 != this.field_b.length()) {
              break L0;
            } else {
              this.field_g = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("hb.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    hb(String param0) {
        this(param0, false);
    }

    final static String c(int param0) {
        String var1;
        var1 = "";
        if (param0 != -8927) {
          L0: {
            hb.b(75);
            if (ao.field_c != null) {
              var1 = ao.field_c.e(false);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != var1.length()) {
              break L1;
            } else {
              var1 = bd.a(6);
              break L1;
            }
          }
          L2: {
            if (var1.length() != 0) {
              break L2;
            } else {
              var1 = pm.field_a;
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (ao.field_c != null) {
              var1 = ao.field_c.e(false);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 != var1.length()) {
              break L4;
            } else {
              var1 = bd.a(6);
              break L4;
            }
          }
          L5: {
            if (var1.length() != 0) {
              break L5;
            } else {
              var1 = pm.field_a;
              break L5;
            }
          }
          return var1;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 >= -107) {
            field_f = (String) null;
        }
    }

    static {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = new of(1);
        field_f = "Please select an option in the '<%0>' row.";
        field_e = "<%0> has dropped out.";
    }
}
