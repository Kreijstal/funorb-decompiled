/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends me {
    int field_j;
    byte[] field_i;
    int field_l;
    int field_k;
    boolean field_m;

    final vk a(ng param0) {
        ((vk) this).field_i = param0.a(((vk) this).field_i, (byte) -128);
        ((vk) this).field_j = param0.a((byte) -128, ((vk) this).field_j);
        if (((vk) this).field_k == ((vk) this).field_l) {
          ((vk) this).field_l = param0.a(((vk) this).field_k, (byte) 101);
          ((vk) this).field_k = param0.a(((vk) this).field_k, (byte) 101);
          return (vk) this;
        } else {
          L0: {
            ((vk) this).field_k = param0.a(((vk) this).field_k, (byte) 101);
            ((vk) this).field_l = param0.a(((vk) this).field_l, (byte) 101);
            if (((vk) this).field_k != ((vk) this).field_l) {
              break L0;
            } else {
              ((vk) this).field_k = ((vk) this).field_k - 1;
              break L0;
            }
          }
          return (vk) this;
        }
    }

    vk(int param0, int param1) {
        ((vk) this).field_j = param0;
        ((vk) this).field_i = new byte[param1];
        ((vk) this).field_k = 0;
        ((vk) this).field_l = param1;
    }

    vk(int param0, byte[] param1, int param2, int param3) {
        ((vk) this).field_j = param0;
        ((vk) this).field_i = param1;
        ((vk) this).field_k = param2;
        ((vk) this).field_l = param3;
    }

    vk(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((vk) this).field_j = param0;
        ((vk) this).field_i = param1;
        ((vk) this).field_k = param2;
        ((vk) this).field_l = param3;
        ((vk) this).field_m = param4 ? true : false;
    }
}
