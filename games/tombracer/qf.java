/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends uia {
    static da field_j;
    static String field_l;
    static nh[] field_k;
    static int field_i;

    final void a(byte param0, float param1) {
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$6 = ((qf) this).field_h;
        ((qf) this).field_h = ((qf) this).field_h + 1;
        ((qf) this).field_g[fieldTemp$6] = (byte)var3;
        int fieldTemp$7 = ((qf) this).field_h;
        ((qf) this).field_h = ((qf) this).field_h + 1;
        ((qf) this).field_g[fieldTemp$7] = (byte)(var3 >> 8);
        if (param0 != 114) {
          field_k = null;
          int fieldTemp$8 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$8] = (byte)(var3 >> 16);
          int fieldTemp$9 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$9] = (byte)(var3 >> 24);
          return;
        } else {
          int fieldTemp$10 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$10] = (byte)(var3 >> 16);
          int fieldTemp$11 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$11] = (byte)(var3 >> 24);
          return;
        }
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var4 = param3.indexOf(param2);
        while (var4 != -1) {
            param3 = param3.substring(0, var4) + param1 + param3.substring(var4 + param2.length());
            var4 = param3.indexOf(param2, param1.length() + var4);
        }
        return param3;
    }

    public static void g(byte param0) {
        field_j = null;
        if (param0 != -93) {
            qf.g((byte) -23);
            field_k = null;
            field_l = null;
            return;
        }
        field_k = null;
        field_l = null;
    }

    qf(int param0) {
        super(param0);
    }

    final void a(int param0, float param1) {
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$7 = ((qf) this).field_h;
        ((qf) this).field_h = ((qf) this).field_h + 1;
        ((qf) this).field_g[fieldTemp$7] = (byte)(var3 >> 24);
        if (param0 != 17133) {
          field_l = null;
          int fieldTemp$8 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$8] = (byte)(var3 >> 16);
          int fieldTemp$9 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$9] = (byte)(var3 >> 8);
          int fieldTemp$10 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$10] = (byte)var3;
          return;
        } else {
          int fieldTemp$11 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$11] = (byte)(var3 >> 16);
          int fieldTemp$12 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$12] = (byte)(var3 >> 8);
          int fieldTemp$13 = ((qf) this).field_h;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[fieldTemp$13] = (byte)var3;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Sound: ";
    }
}
