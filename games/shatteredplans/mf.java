/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends ml {
    private fj field_s;
    static nq field_x;
    static boolean field_r;
    static String field_u;
    static nk[] field_o;
    static String[] field_w;
    static sq[] field_q;
    static String field_v;
    private boolean field_n;
    private String field_t;
    static boolean field_p;

    final static th a(int param0, int param1, bc param2, bc param3, int param4) {
        RuntimeException var5 = null;
        th stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vd.a(param1, param2, param0, 2)) {
            return null;
          }
          if (param4 > -83) {
            mf.e(87);
          }
          stackIn_7_0 = in.a(15, param3.a(param1, -1, param0));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("mf.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_0 = stackIn_11_0;
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_16_0 = stackIn_15_0;
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = stackIn_11_0;
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static lp a(qk[] param0, boolean param1) {
        int var3 = 0;
        lp var2 = null;
        int var4 = 0;
        lp var5 = null;
        lp stackIn_7_0 = null;
        lp stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5 = new lp(0, 0, 182, param0.length * rs.field_Cb.field_J);
          var2 = var5;
          for (var3 = 0; param0.length > var3; var3++) {
            param0[var3].a((byte) 119, 0, rs.field_Cb.field_J * var3);
            var5.a(param0[var3], 8);
          }
          if (param1) {
            stackIn_9_0 = var2;
            return stackIn_9_0;
          }
          stackIn_7_0 = (lp) null;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("mf.R(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(boolean param0, String param1) {
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_s.b(-11196, param1) == tj.field_b) {
            stackIn_4_0 = this.field_s.a(false, param1);
            return stackIn_4_0;
          }
          if (param0) {
            stackIn_7_0 = (String) null;
            return stackIn_7_0;
          }
          if (this.b(-11196, param1) == tj.field_b) {
            stackIn_12_0 = ab.field_d;
            return stackIn_12_0;
          }
          stackIn_14_0 = dn.field_g;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("mf.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final u b(int param0, String param1) {
        u stackIn_2_0 = null;
        u stackIn_8_0 = null;
        u stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ks var3 = null;
        RuntimeException var3_ref = null;
        try {
          if (this.field_s.b(param0, param1) == tj.field_b) {
            stackIn_2_0 = tj.field_b;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_t)) {
            var3 = os.a(202, param1);
            if (!var3.b(14)) {
              stackIn_8_0 = lm.field_d;
              return stackIn_8_0;
            }
            this.field_t = param1;
            this.field_n = var3.a(true);
          }
          if (!this.field_n) {
            stackIn_14_0 = tj.field_b;
          } else {
            stackIn_14_0 = p.field_g;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("mf.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 ||
            np.field_a == null) {
            ti.field_e = false;
          }
          if (param1) {
            if (0 < qa.field_t) {
              qa.field_t = qa.field_t - 1;
            } else {
              if (bc.field_b <= 0) {
                if (0 < ee.field_k) {
                  ee.field_k = ee.field_k - 1;
                }
              } else {
                bc.field_b = bc.field_b - 1;
              }
            }
          } else {
            if (np.field_a == null) {
              if (null == he.field_p) {
                ti.field_e = false;
                if (bc.field_b <= 0) {
                  if (0 >= ee.field_k) {
                    if (ed.field_f > qa.field_t) {
                      if (qa.field_t == 0) {
                        in.a((byte) -83);
                      }
                      qa.field_t = qa.field_t + 1;
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                  }
                } else {
                  bc.field_b = bc.field_b - 1;
                }
              } else {
                if (qa.field_t <= 0) {
                  if (ee.field_k <= 0) {
                    if (ed.field_f > bc.field_b) {
                      if (0 == bc.field_b) {
                        tc.a(true, true);
                      }
                      bc.field_b = bc.field_b + 1;
                    }
                  } else {
                    ee.field_k = ee.field_k - 1;
                  }
                } else {
                  qa.field_t = qa.field_t - 1;
                }
              }
            } else {
              if (0 < qa.field_t) {
                qa.field_t = qa.field_t - 1;
              } else {
                if (bc.field_b > 0) {
                  bc.field_b = bc.field_b - 1;
                } else {
                  if (ee.field_k < ed.field_f) {
                    if (0 == ee.field_k) {
                      tc.a(true, false);
                    }
                    ee.field_k = ee.field_k + 1;
                  }
                }
              }
            }
          }
          if (param0) {
            return;
          }
          field_q = (sq[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "mf.U(" + param0 + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        try {
          field_u = null;
          field_o = null;
          if (param0 != 0) {
            field_p = true;
          }
          field_x = null;
          field_w = null;
          field_q = null;
          field_v = null;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "mf.T(" + param0 + ')');
        }
    }

    mf(go param0, go param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_n = false;
        this.field_t = "";
        try {
          this.field_s = new fj(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mf.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5 = uo.field_h;
          var1 = var5;
          if (param0 <= 92) {
            mf.e(20);
          }
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "mf.O(" + param0 + ')');
        }
    }

    final static bi a(bc param0, String param1, String param2, boolean param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        Object stackIn_3_0 = null;
        bi stackIn_9_0 = null;
        bi stackIn_9_1 = null;
        byte[] stackIn_9_2 = null;
        bi stackIn_10_0;
        bi stackIn_10_1;
        Object stackIn_10_3;
        bi stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (!param0.a((byte) 96, param2, param1)) {
            param2 = param2 + ".jpg";
            if (!param0.a((byte) 127, param2, param1)) {
              stackIn_3_0 = null;
              return (bi) (stackIn_3_0);
            }
          }
          var5 = param0.a(true, param2, param1);
          var4 = var5;
          if (param3) {
            mf.a(false, true);
          }
          stackIn_9_0 = null;
          stackIn_9_1 = null;
          stackIn_9_2 = var5;
          if (null == bj.field_K) {
            stackIn_10_0 = null;
            stackIn_10_1 = null;
            stackIn_10_3 = tm.field_i;
          } else {
            stackIn_10_0 = null;
            stackIn_10_1 = null;
            stackIn_10_3 = bj.field_K;
          }
          stackIn_11_0 = new bi(stackIn_9_2, (java.awt.Component) (stackIn_10_3));
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("mf.S(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_15_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_15_0;
            stackIn_20_2 = "{...}";
          }
          stackIn_23_0 = stackIn_20_0;
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_24_0 = stackIn_23_0;
            stackIn_24_2 = "null";
          } else {
            stackIn_24_0 = stackIn_20_0;
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        mj var1_ref = null;
        fb var1_ref2 = null;
        RuntimeException var1_ref3 = null;
        int var2 = 0;
        mj var1_refLifetime1;
        var1 = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1_ref = (mj) (gr.field_p.d(0));
          if (param0 < 4) {
            mf.a(true, true);
          }
          while (var1_ref != null) {
            if (0 < var1_ref.field_Gb) {
              var1_ref.field_Gb = var1_ref.field_Gb - 1;
              if (var1_ref.field_Gb == 0) {
                var1_ref.field_Eb = 0;
                if (var1_ref.h(-122)) {
                  var1_ref.b((byte) -58);
                }
              }
            }
            var1_ref = (mj) (gr.field_p.a((byte) -71));
          }
          var1_ref2 = (fb) (kj.field_a.d(0));
          while (var1_ref2 != null) {
            if (0 < var1_ref2.field_Nb) {
              var1_ref2.field_Nb = var1_ref2.field_Nb - 1;
              if (var1_ref2.field_Nb == 0) {
                var1_ref2.field_hc = 0;
                if (var1_ref2.f((byte) -78)) {
                  var1_ref2.b((byte) -58);
                }
              }
            }
            var1_ref2 = (fb) (kj.field_a.a((byte) -71));
          }
          var1_refLifetime1 = (mj) (uo.field_a.d(0));
          while (var1_refLifetime1 != null) {
            if (var1_refLifetime1.field_Gb > 0) {
              var1_refLifetime1.field_Gb = var1_refLifetime1.field_Gb - 1;
              if (var1_refLifetime1.field_Gb != 0) {
                var1_refLifetime1 = (mj) (uo.field_a.a((byte) -71));
                continue;
              }
              var1_refLifetime1.field_Eb = 0;
              if (var1_refLifetime1.h(-96)) {
                var1_refLifetime1.b((byte) -108);
              }
            }
            var1_refLifetime1 = (mj) (uo.field_a.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref3), "mf.V(" + param0 + ')');
        }
    }

    final static int[] a(byte param0, int[] param1) {
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param1.length;
          var3 = new int[var2_int];
          if (param0 != 74) {
            mf.e(40);
          }
          var4 = 1;
          while (true) {
            if (var2_int <= var4) {
              stackIn_12_0 = var3;
              return stackIn_12_0;
            }
            var5 = var4;
            while (true) {
              var5--;
              if (0 <= var5 &&
                param1[var3[var5]] < param1[var4]) {
                var3[var5 + 1] = var3[var5];
                continue;
              }
              break;
            }
            var3[1 + var5] = var4;
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("mf.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_u = "You have offered a Non-Agression Pact to <%0>.";
        field_v = "READY";
        field_w = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
