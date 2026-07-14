/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends wh {
    static int field_l;
    private java.nio.ByteBuffer field_g;
    static String field_f;
    static String field_h;
    static int field_i;
    static String field_k;
    static String field_e;
    static String field_j;

    tl() {
    }

    final static void a(float param0, boolean param1, float param2) {
        if (!param1) {
          L0: {
            if (jk.field_c == 2) {
              break L0;
            } else {
              if (1 != wn.field_C) {
                L1: {
                  lj.field_r = lj.field_r + param0;
                  if (-2 == (jk.field_c ^ -1)) {
                    jk.field_c = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (lj.field_r >= 116.0f) {
                    break L2;
                  } else {
                    if ((jk.field_c ^ -1) != -3) {
                      lj.field_r = 116.0f;
                      break L2;
                    } else {
                      cf.field_c = cf.field_c + param2;
                      if (lj.field_r > 295.0f) {
                        lj.field_r = 295.0f;
                        if (!dc.field_Y[25]) {
                          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                          gb.c((byte) -44);
                          ce.field_E = id.field_r;
                          return;
                        } else {
                          cf.field_c = 3.1415927410125732f;
                          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                          gb.c((byte) -44);
                          ce.field_E = id.field_r;
                          return;
                        }
                      } else {
                        if (dc.field_Y[25]) {
                          cf.field_c = 3.1415927410125732f;
                          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                          gb.c((byte) -44);
                          ce.field_E = id.field_r;
                          return;
                        } else {
                          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                          gb.c((byte) -44);
                          ce.field_E = id.field_r;
                          return;
                        }
                      }
                    }
                  }
                }
                cf.field_c = cf.field_c + param2;
                if (lj.field_r <= 295.0f) {
                  if (dc.field_Y[25]) {
                    cf.field_c = 3.1415927410125732f;
                    vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                    vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                    gb.c((byte) -44);
                    ce.field_E = id.field_r;
                    return;
                  } else {
                    vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                    vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                    gb.c((byte) -44);
                    ce.field_E = id.field_r;
                    return;
                  }
                } else {
                  lj.field_r = 295.0f;
                  if (dc.field_Y[25]) {
                    cf.field_c = 3.1415927410125732f;
                    vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                    vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                    gb.c((byte) -44);
                    ce.field_E = id.field_r;
                    return;
                  } else {
                    vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                    vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                    gb.c((byte) -44);
                    ce.field_E = id.field_r;
                    return;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1) {
        ((tl) this).field_g = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$12 = ((tl) this).field_g.position(0);
        java.nio.ByteBuffer discarded$19 = ((tl) this).field_g.put(param0);
        if (param1 != -4) {
            byte[] discarded$20 = ((tl) this).b(105);
        }
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 < 73) {
          ((tl) this).field_g = null;
          var3 = new byte[((tl) this).field_g.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$8 = ((tl) this).field_g.position(0);
          java.nio.ByteBuffer discarded$9 = ((tl) this).field_g.get(var3);
          return var3;
        } else {
          var3 = new byte[((tl) this).field_g.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$10 = ((tl) this).field_g.position(0);
          java.nio.ByteBuffer discarded$11 = ((tl) this).field_g.get(var3);
          return var3;
        }
    }

    public static void b(byte param0) {
        int var1 = -62 % ((param0 - 26) / 42);
        field_k = null;
        field_j = null;
        field_h = null;
        field_e = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Player";
        field_h = "Name";
        field_k = "Ignore";
        field_j = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
