/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends lj {
    static pe field_C;
    static int field_B;

    private bf(String param0, ui param1, ma param2) {
        super(param0, param1, param2);
        ((bf) this).field_q = vi.field_e.field_b;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ((bf) this).field_y = !((bf) this).field_y ? true : false;
        int var5 = 87 % ((param0 - 50) / 45);
        super.a((byte) -126, param1, param2, param3);
    }

    final static kk a(String param0, byte param1, boolean param2, String param3) {
        long var4 = 0L;
        String var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        L0: {
          var4 = 0L;
          var6 = null;
          if ((param0.indexOf('@') ^ -1) == 0) {
            var8 = (CharSequence) (Object) param0;
            var4 = uk.b(117, var8);
            break L0;
          } else {
            var6 = param0;
            break L0;
          }
        }
        if (param1 < 24) {
          var7 = null;
          kk discarded$2 = bf.a((String) null, (byte) -101, true, (String) null);
          return dk.a(var6, var4, param2, param3, 103);
        } else {
          return dk.a(var6, var4, param2, param3, 103);
        }
    }

    private bf(String param0, ma param1) {
        this(param0, vi.field_e.field_d, param1);
        ((bf) this).field_q = vi.field_e.field_b;
    }

    public static void a(byte param0) {
        field_C = null;
        if (param0 != 16) {
            bf.a((byte) 39);
        }
    }

    bf(String param0, ma param1, boolean param2) {
        this(param0, param1);
        ((bf) this).field_y = param2 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
    }
}
