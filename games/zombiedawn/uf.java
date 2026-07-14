/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends le {
    int field_l;
    int field_h;
    int field_k;
    int field_m;
    static int[] field_n;
    int[] field_p;
    static int[] field_o;
    int field_i;
    int field_j;

    final void a(int param0, byte param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        ((uf) this).field_h = param3;
        ((uf) this).field_j = param6;
        ((uf) this).field_l = param2;
        ((uf) this).field_i = param7;
        ((uf) this).field_m = param0;
        ((uf) this).field_k = param4;
        ((uf) this).field_p = param5;
        if (param1 != -29) {
            ((uf) this).field_p = null;
        }
    }

    public static void a(int param0) {
        if (param0 > -17) {
            field_n = null;
            field_n = null;
            field_o = null;
            return;
        }
        field_n = null;
        field_o = null;
    }

    final static int a(int param0, int param1) {
        L0: {
          if (param1 == 12832) {
            break L0;
          } else {
            uf.a(-45);
            break L0;
          }
        }
        if (((long)param0 ^ -1L) <= -65537L) {
          if (((long)param0 ^ -1L) > -16777217L) {
            if (((long)param0 ^ -1L) > -1048577L) {
              if (((long)param0 ^ -1L) <= -262145L) {
                return fo.field_a[param0 >> 134291244] >> 2011158982;
              } else {
                return fo.field_a[param0 >> -1570979094] >> 1068834599;
              }
            } else {
              if (-4194305L < ((long)param0 ^ -1L)) {
                return fo.field_a[param0 >> -1950894642] >> -486797179;
              } else {
                return fo.field_a[param0 >> 29300272] >> -963688860;
              }
            }
          } else {
            if (((long)param0 ^ -1L) <= -268435457L) {
              if (((long)param0 ^ -1L) <= -1073741825L) {
                return fo.field_a[param0 >> 768133944];
              } else {
                return fo.field_a[param0 >> -1316965162] >> -1550157759;
              }
            } else {
              if ((long)param0 < 67108864L) {
                return fo.field_a[param0 >> 1981898386] >> 2125788387;
              } else {
                return fo.field_a[param0 >> -1643216172] >> 709401602;
              }
            }
          }
        } else {
          if (256L <= (long)param0) {
            if ((long)param0 >= 4096L) {
              if (-16385L < ((long)param0 ^ -1L)) {
                return fo.field_a[param0 >> 1057038982] >> -1360169079;
              } else {
                return fo.field_a[param0 >> 1861873864] >> -1273087256;
              }
            } else {
              if ((long)param0 < 1024L) {
                return fo.field_a[param0 >> 198716194] >> 358742443;
              } else {
                return fo.field_a[param0 >> -50109884] >> -1062905878;
              }
            }
          } else {
            if (param0 >= 0) {
              return fo.field_a[param0] >> -1519921492;
            } else {
              return -1;
            }
          }
        }
    }

    uf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[16384];
    }
}
