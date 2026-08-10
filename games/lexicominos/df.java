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
          if (this.field_e) {
            break L0;
          } else {
            L1: {
              if (2 != this.field_g) {
                break L1;
              } else {
                if (this.field_c <= 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (fk.field_h != this.field_f) {
              L2: {
                if (param0 == -1) {
                  break L2;
                } else {
                  field_d = (String[]) null;
                  break L2;
                }
              }
              if ((vl.field_b ^ -1) != -3) {
                return 0;
              } else {
                if (dj.a((byte) 79, this.field_j)) {
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
        db[] var1;
        int var2;
        int var3;
        int[] var6;
        int var6_int;
        int var7;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          if (param0 == 91) {
            break L0;
          } else {
            field_d = (String[]) null;
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
            var20 = be.field_f[var2];
            if (me.field_w[var2]) {
              var22 = hl.field_o[var2];
              var16 = new int[var3];
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (db) ((Object) new pi(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var16));
                  var2++;
                  continue L1;
                } else {
                  var6[var7] = tb.a(vg.a(255, (int) var22[var7]) << 774833816, ci.field_b[vg.a(255, (int) var20[var7])]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var9 = new int[var3];
              var21 = var9;
              var6_int = 0;
              L3: while (true) {
                if (var6_int >= var3) {
                  var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var21);
                  var2++;
                  continue L1;
                } else {
                  var9[var6_int] = ci.field_b[vg.a(255, (int) var20[var6_int])];
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        db stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.c(param0, (byte) -89);
              if (param3 <= -36) {
                break L1;
              } else {
                df.a(true);
                break L1;
              }
            }
            var5 = param2.a(param1, -27964, var4_int);
            stackIn_3_0 = uh.a(param2, var4_int, (byte) -108, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("df.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    df(boolean param0) {
        this.field_c = rl.field_E;
        this.field_k = kc.field_c;
        this.field_g = kb.field_a;
        if (param0) {
            this.field_b = eb.field_d;
        } else {
            this.field_b = null;
        }
        this.field_i = fd.field_g;
        this.field_f = jf.field_P;
        this.field_j = gk.field_c;
        this.field_h = oe.field_b;
        this.field_e = tf.field_a;
    }

    static {
        field_d = new String[]{"Wordsmith", "Expert Wordsmith", "Master Wordsmith", "Virtuoso Wordsmith", "Combosmith", "Expert Combosmith", "Master Combosmith", "Virtuoso Combosmith", "Sequence Builder", "Expert Sequence Builder", "Master Sequence Builder", "Lexicominist", "Expert Lexicominist", "Master Lexicominist", "Virtuoso Lexicominist", "Stunning Recovery"};
        field_a = -1;
    }
}
