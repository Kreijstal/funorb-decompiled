/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wfb {
    int field_p;
    int field_u;
    int[][] field_A;
    qjb field_c;
    int field_n;
    int field_a;
    kma field_e;
    boolean field_r;
    lsb[] field_o;
    boolean field_k;
    lja field_x;
    boolean field_s;
    int field_i;
    mua field_g;
    int field_q;
    int field_y;
    int field_h;
    int field_b;
    int[][] field_w;
    aqa field_t;
    int field_z;
    private int field_j;
    boolean field_f;
    int field_B;
    int[] field_v;
    boolean field_m;
    int field_l;
    int field_d;

    final void a(int param0, boolean param1) {
        ((wfb) this).field_z = param0;
        if (!param1) {
            ((wfb) this).a((byte) -121, -90);
        }
        ((wfb) this).field_p = lw.a((byte) -73, ((wfb) this).field_u) * ((wfb) this).field_z;
    }

    final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        var2 = ((wfb) this).field_a;
        if (var2 == 0) {
          return 14100520;
        } else {
          if (var2 != 1) {
            if (var2 == 2) {
              return 14120488;
            } else {
              if (var2 != 3) {
                if (4 == var2) {
                  return 14100652;
                } else {
                  if (var2 == 5) {
                    return 4839208;
                  } else {
                    if (var2 != 6) {
                      L0: {
                        if (param0 == 14951) {
                          break L0;
                        } else {
                          int discarded$1 = ((wfb) this).a(-100);
                          break L0;
                        }
                      }
                      return 16711935;
                    } else {
                      return 9382103;
                    }
                  }
                }
              } else {
                return 14474460;
              }
            }
          } else {
            return 2640343;
          }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var6 = 0;
        int var5 = VoidHunters.field_G;
        ((wfb) this).field_b = ((wfb) this).field_b << param0;
        ((wfb) this).field_i = ((wfb) this).field_i << param0;
        for (var4 = 0; var4 < ((wfb) this).field_v.length; var4++) {
            ((wfb) this).field_v[var4] = ((wfb) this).field_v[var4] << param0;
        }
        if (param1 <= 57) {
            int discarded$0 = ((wfb) this).a(8);
        }
        if (((wfb) this).field_o != null) {
            var6 = 0;
            var4 = var6;
            while (((wfb) this).field_o.length > var6) {
                ((wfb) this).field_o[var6].field_b = ((wfb) this).field_o[var6].field_b << param0;
                ((wfb) this).field_o[var6].field_c = ((wfb) this).field_o[var6].field_c << param0;
                var6++;
            }
        }
        if (!(!param2)) {
            this.a(true);
        }
        this.a((byte) 110);
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 > 85) {
            break L0;
          } else {
            var5 = null;
            ((wfb) this).a(-102, (lsb) null);
            break L0;
          }
        }
        ((wfb) this).field_l = 0;
        var2 = 0;
        L1: while (true) {
          if (((wfb) this).field_v.length <= var2) {
            return;
          } else {
            var3 = ar.a(((wfb) this).field_v[var2], (byte) 109, ((wfb) this).field_v[var2 - -1]);
            if (var3 > ((wfb) this).field_l) {
              ((wfb) this).field_l = var3;
              var2 += 2;
              continue L1;
            } else {
              var2 += 2;
              continue L1;
            }
          }
        }
    }

    final void a(byte param0, int param1) {
        ((wfb) this).field_j = param1 + 1;
        if (param0 >= -100) {
            int discarded$0 = ((wfb) this).b(-15);
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        ((wfb) this).field_u = 0;
        for (var2 = 0; ((wfb) this).field_v.length - 2 > var2; var2 += 2) {
            var3 = ((wfb) this).field_v[var2];
            var4 = ((wfb) this).field_v[1 + var2];
            var5 = ((wfb) this).field_v[var2 + 2];
            var6 = ((wfb) this).field_v[var2 - -3];
            ((wfb) this).field_u = ((wfb) this).field_u + (-(var5 * var4) + var6 * var3);
        }
        ((wfb) this).field_u = ((wfb) this).field_u / 2;
        if (-1 == ((wfb) this).field_u) {
            ((wfb) this).field_u = 1;
        }
        if (-1 > ((wfb) this).field_u) {
            ((wfb) this).field_u = 2147483647;
        }
        ((wfb) this).field_p = lw.a((byte) -73, ((wfb) this).field_u) * ((wfb) this).field_z;
    }

    final void a(int param0, int param1) {
        ((wfb) this).field_u = ((wfb) this).field_u >> param1;
        ((wfb) this).field_p = lw.a((byte) -73, ((wfb) this).field_u) * ((wfb) this).field_z;
        if (param0 < 100) {
            ((wfb) this).field_A = null;
        }
    }

    final int b(int param0) {
        if (param0 != -1) {
            this.a((byte) 101);
        }
        return -1 + ((wfb) this).field_j;
    }

    final void a(int param0, lsb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        lsb[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_int = 34 / ((-69 - param0) / 44);
              if (null != ((wfb) this).field_o) {
                var4 = new lsb[((wfb) this).field_o.length + 1];
                var5 = 0;
                L2: while (true) {
                  if (((wfb) this).field_o.length <= var5) {
                    var4[((wfb) this).field_o.length] = param1;
                    ((wfb) this).field_o = var4;
                    break L1;
                  } else {
                    var4[var5] = ((wfb) this).field_o[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ((wfb) this).field_o = new lsb[1];
                ((wfb) this).field_o[0] = param1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("wfb.F(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    wfb(int[] param0, int param1, int param2) {
        ((wfb) this).field_f = false;
        ((wfb) this).field_h = 256;
        ((wfb) this).field_r = false;
        try {
            ((wfb) this).field_v = param0;
            ((wfb) this).field_i = param2;
            ((wfb) this).field_s = false;
            ((wfb) this).field_z = 256;
            ((wfb) this).field_y = 0;
            ((wfb) this).field_B = 256;
            ((wfb) this).field_d = 0;
            ((wfb) this).field_q = 256;
            ((wfb) this).field_b = param1;
            this.a(true);
            this.a((byte) 121);
            ((wfb) this).field_k = true;
            ((wfb) this).field_a = 6;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "wfb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
    }
}
