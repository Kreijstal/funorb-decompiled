/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    char[][] field_c;
    byte field_e;
    static mk field_a;
    byte field_f;
    static int field_d;
    static int field_g;
    static int field_b;

    final static Object a(boolean param0, byte[] param1, int param2) {
        qe var3 = null;
        if (param1 == null) {
            return null;
        }
        if (!((param1.length ^ -1) >= param2)) {
            var3 = new qe();
            ((hd) (Object) var3).a(param2 + 13, param1);
            return (Object) (Object) var3;
        }
        if (param0) {
            return (Object) (Object) rl.a(1, param1);
        }
        return (Object) (Object) param1;
    }

    public static void a(byte param0) {
        if (param0 > -34) {
            return;
        }
        field_a = null;
    }

    kh(byte[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 3;
        ((kh) this).field_f = param0[1];
        ((kh) this).field_e = param0[2];
        ((kh) this).field_c = new char[40][21];
        for (var3 = 0; -41 < (var3 ^ -1); var3++) {
            for (var4 = 0; (var4 ^ -1) > -22; var4++) {
                ((kh) this).field_c[var3][var4] = (char)param0[var2];
                var2++;
            }
        }
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (rl.field_e == null) {
              break L1;
            } else {
              if (rl.field_e.length < param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          rl.field_e = new int[param1 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == jl.field_b) {
              break L3;
            } else {
              if (param1 > jl.field_b.length) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          jl.field_b = new int[param1 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (null == kk.field_b) {
              break L5;
            } else {
              if (param1 <= kk.field_b.length) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          kk.field_b = new int[param1 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (hg.field_q == null) {
              break L7;
            } else {
              if (param1 <= hg.field_q.length) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          hg.field_q = new int[param1 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (vh.field_i == null) {
              break L9;
            } else {
              if (vh.field_i.length >= param1) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          vh.field_i = new int[2 * param1];
          break L8;
        }
        L10: {
          L11: {
            if (null == uj.field_a) {
              break L11;
            } else {
              if (uj.field_a.length < param1) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          uj.field_a = new int[2 * param1];
          break L10;
        }
        L12: {
          if (param2 == 26721) {
            break L12;
          } else {
            kh.a(-42, -43, 83);
            break L12;
          }
        }
        L13: {
          L14: {
            if (mh.field_y == null) {
              break L14;
            } else {
              if (param0 + param1 > mh.field_y.length) {
                break L14;
              } else {
                break L13;
              }
            }
          }
          mh.field_y = new int[(param1 + param0) * 2];
          break L13;
        }
        L15: {
          L16: {
            if (null == se.field_d) {
              break L16;
            } else {
              if (se.field_d.length >= param1) {
                break L15;
              } else {
                break L16;
              }
            }
          }
          se.field_d = new boolean[param1 * 2];
          break L15;
        }
        lc.field_u = -2147483648;
        ok.field_L = -2147483648;
        ak.field_f = 2147483647;
        ea.field_a = 2147483647;
        qh.field_D = 0;
    }

    static {
    }
}
