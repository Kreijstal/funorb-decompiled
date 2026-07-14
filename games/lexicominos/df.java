/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    private long field_f;
    static String[] field_d;
    int field_k;
    private boolean field_e;
    int field_g;
    private int field_c;
    private String field_j;
    static int field_a;
    String field_h;
    int field_i;
    int[] field_b;

    final int a(int param0) {
        L0: {
          if (((df) this).field_e) {
            break L0;
          } else {
            L1: {
              if (2 != ((df) this).field_g) {
                break L1;
              } else {
                if (((df) this).field_c <= 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (fk.field_h != ((df) this).field_f) {
              L2: {
                if (param0 == -1) {
                  break L2;
                } else {
                  field_d = null;
                  break L2;
                }
              }
              if ((vl.field_b ^ -1) != -3) {
                return 0;
              } else {
                if (dj.a((byte) 79, ((df) this).field_j)) {
                  return 1;
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    final static db[] a(byte param0) {
        db[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          if (param0 == 91) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        var1 = new db[th.field_t];
        var2 = 0;
        L1: while (true) {
          if (var2 >= th.field_t) {
            gk.a(12428);
            return var1;
          } else {
            var3 = pb.field_h[var2] * bd.field_m[var2];
            var21 = be.field_f[var2];
            if (me.field_w[var2]) {
              var23 = hl.field_o[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (db) (Object) new pi(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var24);
                  var2++;
                  continue L1;
                } else {
                  var6[var7] = tb.a(vg.a(255, (int) var23[var7]) << 774833816, ci.field_b[vg.a(255, (int) var21[var7])]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var9 = new int[var3];
              var22 = var9;
              var6_int = 0;
              L3: while (true) {
                if (var6_int >= var3) {
                  var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var22);
                  var2++;
                  continue L1;
                } else {
                  var9[var6_int] = ci.field_b[vg.a(255, (int) var21[var6_int])];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = 12;
        }
        field_d = null;
    }

    final static db a(String param0, String param1, sh param2, byte param3) {
        int var4 = param2.c(param0, (byte) -89);
        if (param3 > -36) {
            df.a(true);
        }
        int var5 = param2.a(param1, -27964, var4);
        return uh.a(param2, var4, (byte) -108, var5);
    }

    df(boolean param0) {
        ((df) this).field_c = rl.field_E;
        ((df) this).field_k = kc.field_c;
        ((df) this).field_g = kb.field_a;
        if (param0) {
            ((df) this).field_b = eb.field_d;
        } else {
            ((df) this).field_b = null;
        }
        ((df) this).field_i = fd.field_g;
        ((df) this).field_f = jf.field_P;
        ((df) this).field_j = gk.field_c;
        ((df) this).field_h = oe.field_b;
        ((df) this).field_e = tf.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Wordsmith", "Expert Wordsmith", "Master Wordsmith", "Virtuoso Wordsmith", "Combosmith", "Expert Combosmith", "Master Combosmith", "Virtuoso Combosmith", "Sequence Builder", "Expert Sequence Builder", "Master Sequence Builder", "Lexicominist", "Expert Lexicominist", "Master Lexicominist", "Virtuoso Lexicominist", "Stunning Recovery"};
        field_a = -1;
    }
}
