/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    int field_f;
    static String field_t;
    int[][] field_r;
    byte[] field_v;
    byte[] field_n;
    byte[][] field_c;
    int[] field_B;
    byte[] field_e;
    int field_I;
    boolean[] field_l;
    byte[] field_d;
    int[] field_y;
    static byte[] field_C;
    int field_i;
    int field_j;
    static int field_m;
    byte[] field_o;
    int field_b;
    int field_q;
    int field_L;
    int[] field_u;
    int field_g;
    int field_z;
    int field_E;
    int field_a;
    int[] field_h;
    byte field_K;
    int field_x;
    byte[] field_s;
    int[][] field_k;
    int[][] field_H;
    int field_w;
    int field_J;
    int field_F;
    boolean[] field_p;

    public static void b(byte param0) {
        field_t = null;
        if (param0 != 75) {
            return;
        }
        field_C = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        cq.field_u = new int[vs.field_e.length];
        var1 = 0;
        L0: while (true) {
          if (var1 >= vs.field_e.length) {
            L1: {
              if (param0 > 79) {
                break L1;
              } else {
                nk.a((byte) 84);
                break L1;
              }
            }
            var1 = 0;
            L2: while (true) {
              if (var1 >= ef.field_c) {
                return;
              } else {
                var2 = 0;
                L3: while (true) {
                  if (ks.field_y <= var2) {
                    var1++;
                    continue L2;
                  } else {
                    var3 = cq.field_u[var1 * ks.field_y + var2];
                    if (1 == var3) {
                      L4: {
                        var3 = 7;
                        if (!ta.field_L) {
                          break L4;
                        } else {
                          var3 = 4;
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          if (0 == var2) {
                            break L6;
                          } else {
                            if ((cq.field_u[-1 + (var2 + var1 * ks.field_y)] ^ -1) == -2) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var3 = 1;
                        break L5;
                      }
                      L7: {
                        L8: {
                          if (-1 + ks.field_y == var2) {
                            break L8;
                          } else {
                            if (1 == cq.field_u[1 + var2 + var1 * ks.field_y]) {
                              break L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var3 = 1;
                        break L7;
                      }
                      L9: {
                        L10: {
                          if (var1 == 0) {
                            break L10;
                          } else {
                            if (cq.field_u[var2 + ks.field_y * (var1 - 1)] != 1) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var3 = 1;
                        break L9;
                      }
                      L11: {
                        L12: {
                          if (-1 + ef.field_c == var1) {
                            break L12;
                          } else {
                            if (cq.field_u[(var1 - -1) * ks.field_y + var2] == 1) {
                              break L12;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var3 = 1;
                        break L11;
                      }
                      cq.field_u[var1 * ks.field_y + var2] = var3;
                      var2++;
                      continue L3;
                    } else {
                      var2++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            cq.field_u[var1] = va.field_G[vs.field_e[var1].field_h];
            var1++;
            continue L0;
          }
        }
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = be.a(-127, param1, param0);
          if (param2 <= -34) {
            break L0;
          } else {
            nk.b((byte) -25);
            break L0;
          }
        }
        if (var3 != null) {
          return var3;
        } else {
          var4 = 0;
          L1: while (true) {
            if (var4 < param1.length()) {
              if (wg.a(param1.charAt(var4), -3904)) {
                var4++;
                continue L1;
              } else {
                return od.field_h;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static wk[] a(int param0, byte param1, int param2, kl param3) {
        if (!kp.a(false, param0, param3, param2)) {
            return null;
        }
        if (param1 != 28) {
            return null;
        }
        return se.a((byte) 32);
    }

    nk() {
        ((nk) this).field_l = new boolean[16];
        ((nk) this).field_c = new byte[6][258];
        ((nk) this).field_o = new byte[4096];
        ((nk) this).field_y = new int[6];
        ((nk) this).field_u = new int[256];
        ((nk) this).field_i = 0;
        ((nk) this).field_n = new byte[256];
        ((nk) this).field_H = new int[6][258];
        ((nk) this).field_d = new byte[18002];
        ((nk) this).field_s = new byte[18002];
        ((nk) this).field_r = new int[6][258];
        ((nk) this).field_B = new int[257];
        ((nk) this).field_h = new int[16];
        ((nk) this).field_q = 0;
        ((nk) this).field_k = new int[6][258];
        ((nk) this).field_p = new boolean[256];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "TAB - hide chat temporarily";
    }
}
