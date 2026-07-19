/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    int field_b;
    byte[] field_F;
    int[][] field_q;
    byte field_E;
    int field_t;
    int field_x;
    int field_u;
    int field_l;
    static String field_y;
    int field_m;
    static ka[] field_w;
    byte[] field_f;
    int field_D;
    byte[][] field_g;
    int field_B;
    int[][] field_s;
    byte[] field_A;
    int[] field_i;
    int field_n;
    boolean[] field_v;
    int field_d;
    byte[] field_r;
    int field_G;
    byte[] field_j;
    int[] field_c;
    byte[] field_h;
    boolean[] field_H;
    int[] field_p;
    int field_C;
    int field_a;
    int field_k;
    int[] field_z;
    int[][] field_e;
    int field_o;

    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (14 > param1) {
              if (param0 == 66) {
                var3 = rb.field_c[param1];
                if ((var3 ^ -1) <= -1) {
                  if ((var3 ^ -1) > -7) {
                    var4 = kc.field_p[var3];
                    if (var4 < wa.field_sb[var3]) {
                      L1: {
                        wa.field_sb[var3] = var4;
                        if (-1 < (wa.field_sb[var3] ^ -1)) {
                          wh.a(param2, param1, -112);
                          wa.field_sb[var3] = var4;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      return;
                    } else {
                      L2: {
                        if (-1 < (wa.field_sb[var3] ^ -1)) {
                          wh.a(param2, param1, -112);
                          wa.field_sb[var3] = var4;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                field_y = (String) null;
                var3 = rb.field_c[param1];
                if ((var3 ^ -1) <= -1) {
                  if ((var3 ^ -1) > -7) {
                    var4 = kc.field_p[var3];
                    if (var4 < wa.field_sb[var3]) {
                      L3: {
                        wa.field_sb[var3] = var4;
                        if (-1 < (wa.field_sb[var3] ^ -1)) {
                          wh.a(param2, param1, -112);
                          wa.field_sb[var3] = var4;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        if (-1 < (wa.field_sb[var3] ^ -1)) {
                          wh.a(param2, param1, -112);
                          wa.field_sb[var3] = var4;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -117) {
                break L1;
              } else {
                ei.a(68);
                break L1;
              }
            }
            stackOut_2_0 = ci.a(10, param1, -18, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ei.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_w = null;
        if (param0 >= -35) {
            return;
        }
        field_y = null;
    }

    ei() {
        this.field_l = 0;
        this.field_D = 0;
        this.field_q = new int[6][258];
        this.field_j = new byte[256];
        this.field_F = new byte[18002];
        this.field_s = new int[6][258];
        this.field_v = new boolean[16];
        this.field_g = new byte[6][258];
        this.field_r = new byte[18002];
        this.field_H = new boolean[256];
        this.field_i = new int[6];
        this.field_z = new int[257];
        this.field_p = new int[256];
        this.field_A = new byte[4096];
        this.field_e = new int[6][258];
        this.field_c = new int[16];
    }

    static {
        field_y = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
