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
                  if (jk.field_c == 1) {
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
                    if (jk.field_c != 2) {
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((tl) this).field_g = java.nio.ByteBuffer.allocateDirect(param0.length);
              java.nio.Buffer discarded$9 = ((tl) this).field_g.position(0);
              java.nio.ByteBuffer discarded$10 = ((tl) this).field_g.put(param0);
              if (param1 == -4) {
                break L1;
              } else {
                byte[] discarded$11 = ((tl) this).b(105);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tl.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
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

    public static void b() {
        int var1 = 0;
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
