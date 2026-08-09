/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    private cn field_c;
    int[] field_h;
    String field_f;
    private cn field_b;
    int field_i;
    private int field_d;
    private se field_a;
    static boolean[] field_e;
    static int[] field_k;
    static String field_g;
    static cn field_j;

    final static boolean a(java.applet.Applet param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param1 == 1041792321) {
              if (ia.field_W == null) {
                if (null != ll.field_r) {
                  tp.a(param1 + -1041792311, 75.0f, i.field_s);
                  g.a(fi.d(false), param1 ^ 1041775506);
                  ll.field_r = null;
                  nf.d(0);
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (null == bl.field_t) {
                    if (null == np.field_A) {
                      if (kf.field_p == null) {
                        if (id.field_i != null) {
                          df.a((byte) 11, new ja(id.field_i.a("", "huffman", (byte) -110)));
                          id.field_i = null;
                          nf.d(0);
                          stackIn_22_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      } else {
                        tp.a(param1 ^ 1041792331, 92.0f, he.field_n);
                        g.a(fi.d(false), param1 ^ 1041775506);
                        vf.c((byte) 117);
                        kf.field_p = null;
                        nf.d(0);
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      tp.a(param1 ^ 1041792331, 84.0f, ib.field_i);
                      g.a(fi.d(false), 18131);
                      sl.a((byte) -97, param0);
                      bl.c((byte) -101);
                      gh.field_c = null;
                      np.field_A = null;
                      nf.d(param1 + -1041792321);
                      stackIn_15_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    tp.a(10, 80.0f, ik.field_a);
                    g.a(fi.d(false), 18131);
                    mi.a(-114);
                    tl.field_k = null;
                    bl.field_t = null;
                    nf.d(0);
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                ck.h(-116);
                tp.a(10, 75.0f, i.field_s);
                g.a(fi.d(false), param1 + -1041774190);
                ra.b(9);
                ia.field_W = null;
                nf.d(0);
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("tf.B(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L1;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0 != 0;
                  } else {
                    return stackIn_22_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        bp.a(param0, this.field_c, param2, (byte) 99);
        this.field_b.h(param2, param0);
        if (param1 != 32) {
            java.applet.Applet var5 = (java.applet.Applet) null;
            tf.a((java.applet.Applet) null, -18);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 1699) {
            this.field_f = (String) null;
        }
        this.b(param1 - (this.field_d >> 1041792321), param2 ^ 1667, param0 + -(this.field_i >> 1499939521));
    }

    tf(se param0, String param1, int[] param2) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        cn var7 = null;
        cn var8 = null;
        try {
          L0: {
            this.field_f = param1;
            this.field_a = param0;
            this.field_h = param2;
            jh.c();
            this.field_i = this.field_a.b(this.field_f);
            this.field_d = this.field_a.field_H + this.field_a.field_E;
            var7 = new cn(this.field_i, this.field_d);
            var8 = var7;
            var8.e();
            this.field_a.b(this.field_f, 0, this.field_a.field_H, 16777215, -1);
            this.field_b = te.a(this.field_i, this.field_d, this.field_h, 32, 32, 0.125);
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_b.field_B.length) {
                this.field_c = dd.a((byte) -112, 4, var8);
                jh.b();
                break L0;
              } else {
                L2: {
                  if (-1 != (var7.field_B[var5] ^ -1)) {
                    if (this.field_b.field_B[var5] != 0) {
                      break L2;
                    } else {
                      this.field_b.field_B[var5] = 65793;
                      break L2;
                    }
                  } else {
                    this.field_b.field_B[var5] = 0;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("tf.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_k = null;
        if (param0 != -1) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            tf.a((java.applet.Applet) null, 12);
        }
        field_j = null;
        field_e = null;
    }

    static {
        field_k = rb.b(8421504, 4210752, 64);
        field_g = "CLOSE";
    }
}
