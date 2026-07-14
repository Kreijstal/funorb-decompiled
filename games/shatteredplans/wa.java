/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_i;
    int field_a;
    int field_g;
    static String[][] field_d;
    int field_e;
    static bi field_b;
    wa field_c;
    int field_h;
    int field_f;

    final void a(int param0, int param1, int param2, int param3, wa param4, int param5, byte param6) {
        if (param6 == -34) {
          ((wa) this).field_h = param5;
          ((wa) this).field_g = param1;
          ((wa) this).field_c = param4;
          ((wa) this).field_f = param3;
          ((wa) this).field_e = param0;
          ((wa) this).field_a = param2;
          if (-1 < ((wa) this).field_h) {
            throw new RuntimeException();
          } else {
            if (-1 == ((wa) this).field_f) {
              if (0 == ((wa) this).field_a) {
                if (((wa) this).field_e != 0) {
                  if (((wa) this).field_h != 1) {
                    throw new RuntimeException();
                  } else {
                    return;
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          wa.a((byte) -86, false, true);
          ((wa) this).field_h = param5;
          ((wa) this).field_g = param1;
          ((wa) this).field_c = param4;
          ((wa) this).field_f = param3;
          ((wa) this).field_e = param0;
          ((wa) this).field_a = param2;
          if (-1 < ((wa) this).field_h) {
            throw new RuntimeException();
          } else {
            if (-1 == ((wa) this).field_f) {
              if (0 == ((wa) this).field_a) {
                if (((wa) this).field_e != 0) {
                  if (((wa) this).field_h != 1) {
                    throw new RuntimeException();
                  } else {
                    return;
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        int var3 = 123 / ((param0 - 33) / 54);
        Object var4 = null;
        jm.a((String) null, param2, (byte) -110, param1);
    }

    public static void a(int param0) {
        if (param0 != 27094) {
          field_i = null;
          field_b = null;
          field_i = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_i = null;
          field_d = null;
          return;
        }
    }

    final void b(int param0) {
        ((wa) this).field_c = qq.field_D;
        qq.field_D = (wa) this;
        int var2 = 111 % ((param0 - -71) / 45);
    }

    wa() {
        ((wa) this).field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Average number of fleets committed to each operation.";
    }
}
