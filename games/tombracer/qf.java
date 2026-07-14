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
        ((qf) this).field_h = ((qf) this).field_h + 1;
        ((qf) this).field_g[((qf) this).field_h] = (byte)var3;
        ((qf) this).field_h = ((qf) this).field_h + 1;
        ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> 288130152);
        if (param0 != 114) {
          field_k = null;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> 966747152);
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> 1944967576);
          return;
        } else {
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> 966747152);
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> 1944967576);
          return;
        }
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var4 = param3.indexOf(param2);
        L0: while (true) {
          if ((var4 ^ -1) == 0) {
            if (param0 != 966747152) {
              field_k = null;
              return param3;
            } else {
              return param3;
            }
          } else {
            param3 = param3.substring(0, var4) + param1 + param3.substring(var4 + param2.length());
            var4 = param3.indexOf(param2, param1.length() + var4);
            continue L0;
          }
        }
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
        ((qf) this).field_h = ((qf) this).field_h + 1;
        ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> -1327975528);
        if (param0 != 17133) {
          field_l = null;
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> 203947568);
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> -620773848);
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)var3;
          return;
        } else {
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> 203947568);
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)(var3 >> -620773848);
          ((qf) this).field_h = ((qf) this).field_h + 1;
          ((qf) this).field_g[((qf) this).field_h] = (byte)var3;
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
