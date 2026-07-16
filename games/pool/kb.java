/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kb {
    static int[] field_d;
    static String field_f;
    static String field_b;
    static vh field_h;
    static String field_a;
    static int field_e;
    static String field_c;
    static vh field_i;
    static int[] field_g;

    final static int a(int param0, ke param1, ke param2) {
        if (param0 != 9539) {
          kb.a((byte) -60);
          return ih.a((String) null, (byte) 107, 0, false, param2, param1, 0);
        } else {
          return ih.a((String) null, (byte) 107, 0, false, param2, param1, 0);
        }
    }

    abstract void b(byte param0);

    final int a(long param0, byte param1) {
        long var4 = 0L;
        if (param1 != 39) {
          L0: {
            int discarded$2 = ((kb) this).a(1L, (byte) 114);
            var4 = ((kb) this).a(31);
            if (0L < var4) {
              cf.a(param1 ^ -124, var4);
              break L0;
            } else {
              break L0;
            }
          }
          return ((kb) this).b(param0, (byte) 113);
        } else {
          L1: {
            var4 = ((kb) this).a(31);
            if (0L < var4) {
              cf.a(param1 ^ -124, var4);
              break L1;
            } else {
              break L1;
            }
          }
          return ((kb) this).b(param0, (byte) 113);
        }
    }

    final static void a(byte param0, nb param1) {
        int var2 = 59 % ((param0 - -75) / 33);
        qf.field_d.a((kd) (Object) param1);
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_b = null;
        field_i = null;
        if (param0 != 111) {
            int discarded$0 = kb.a(-28, (ke) null, (ke) null);
        }
    }

    abstract long a(int param0);

    final static re a(boolean param0, String param1, int param2, String param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var4 = 0L;
        if (param2 != -5790) {
          L0: {
            L1: {
              field_f = null;
              var6 = null;
              if (0 != (param1.indexOf('@') ^ -1)) {
                break L1;
              } else {
                var7 = (CharSequence) (Object) param1;
                var4 = td.a((byte) 52, var7);
                if (Pool.field_O == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (Object) (Object) param1;
            break L0;
          }
          return bi.a(var4, param2 + -10805, param3, param0, (String) var6);
        } else {
          L2: {
            L3: {
              var6 = null;
              if (0 != (param1.indexOf('@') ^ -1)) {
                break L3;
              } else {
                var8 = (CharSequence) (Object) param1;
                var4 = td.a((byte) 52, var8);
                if (Pool.field_O == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var6 = (Object) (Object) param1;
            break L2;
          }
          return bi.a(var4, param2 + -10805, param3, param0, (String) var6);
        }
    }

    abstract int b(long param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You are offering a rematch.";
        field_d = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_a = "Loading fonts";
        field_b = "You need to play 1 more rated game to unlock this option.";
        field_c = "Secret achievement";
    }
}
