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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_g = java.nio.ByteBuffer.allocateDirect(param0.length);
              this.field_g.position(0);
              this.field_g.put(param0);
              if (param1 == -4) {
                break L1;
              } else {
                this.b(105);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("tl.E(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final byte[] b(int param0) {
        byte[] var2;
        byte[] var3;
        if (param0 < 73) {
          this.field_g = (java.nio.ByteBuffer) null;
          var3 = new byte[this.field_g.capacity()];
          var2 = var3;
          this.field_g.position(0);
          this.field_g.get(var3);
          return var3;
        } else {
          var3 = new byte[this.field_g.capacity()];
          var2 = var3;
          this.field_g.position(0);
          this.field_g.get(var3);
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
        field_f = "Player";
        field_h = "Name";
        field_k = "Ignore";
        field_j = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
