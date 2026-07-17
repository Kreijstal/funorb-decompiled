/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class am extends q {
    int field_k;
    static String field_q;
    static String field_j;
    om field_r;
    static boolean field_n;
    boolean field_p;
    am[] field_m;
    tp field_l;
    static String field_o;

    void d(byte param0) {
        int var2 = 0;
        var2 = -68 / ((-63 - param0) / 62);
        if (!((am) this).field_p) {
          ((am) this).field_r.b(-103);
          ((am) this).field_r = null;
          return;
        } else {
          ((am) this).field_l.c(111);
          ((am) this).field_l = null;
          return;
        }
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 >= -104) {
            return;
        }
        field_o = null;
        field_j = null;
    }

    void a(byte param0) {
        if (param0 <= 123) {
            field_o = null;
        }
    }

    int[][] a(int param0, int param1) {
        if (param0 != -29116) {
            return null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    final int[] b(int param0, int param1, int param2) {
        if (param0 == 0) {
          if (((am) this).field_m[param1].field_p) {
            return ((am) this).field_m[param1].a((byte) 98, param2);
          } else {
            return ((am) this).field_m[param1].a(-29116, param2)[0];
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        var2 = Torquing.field_u;
        int fieldTemp$2 = fh.field_r + 1;
        fh.field_r = fh.field_r + 1;
        if (100 != fieldTemp$2) {
          if (35 <= fh.field_r) {
            if (fh.field_r > -71) {
              if (4 < -35 + fh.field_r + -35) {
                vc.field_d = vc.field_d - 4;
                return;
              } else {
                vc.field_d = vc.field_d + 4;
                return;
              }
            } else {
              nn.field_e = nn.field_e - pp.field_a;
              return;
            }
          } else {
            ub.field_E = ub.field_E + ra.field_c;
            tj.field_l = tj.field_l + ll.field_g;
            return;
          }
        } else {
          hj.field_b = true;
          cq.field_w = null;
          jb.field_b = null;
          hj.field_c = null;
          of.field_l = null;
          nh.field_l = null;
          la.field_j = null;
          return;
        }
    }

    void a(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (((am) this).field_k != 255) {
            stackOut_2_0 = ((am) this).field_k;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (!((am) this).field_p) {
          ((am) this).field_r = new om(var4, param2, param0);
          if (param1 == 17749) {
            return;
          } else {
            ((am) this).a((byte) -76);
            return;
          }
        } else {
          ((am) this).field_l = new tp(var4, param2, param0);
          if (param1 == 17749) {
            return;
          } else {
            ((am) this).a((byte) -76);
            return;
          }
        }
    }

    int[] a(byte param0, int param1) {
        if (param0 < 86) {
            return null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    final int[][] c(int param0, int param1, int param2) {
        int[] var4 = null;
        int[][] var5 = null;
        int[] var6 = null;
        if (param0 == 24066) {
          if (((am) this).field_m[param2].field_p) {
            var6 = ((am) this).field_m[param2].a((byte) 112, param1);
            var4 = var6;
            var5 = new int[3][];
            var5[0] = var6;
            var5[1] = var6;
            var5[2] = var6;
            return var5;
          } else {
            return ((am) this).field_m[param2].a(param0 + -53182, param1);
          }
        } else {
          field_n = true;
          if (((am) this).field_m[param2].field_p) {
            var6 = ((am) this).field_m[param2].a((byte) 112, param1);
            var4 = var6;
            var5 = new int[3][];
            var5[0] = var6;
            var5[1] = var6;
            var5[2] = var6;
            return var5;
          } else {
            return ((am) this).field_m[param2].a(param0 + -53182, param1);
          }
        }
    }

    void a(fj param0, int param1, int param2) {
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
              if (param1 == 35) {
                break L1;
              } else {
                field_n = false;
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
            stackOut_3_1 = new StringBuilder().append("am.H(");
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
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    int e(byte param0) {
        if (param0 < 26) {
            ((am) this).field_l = null;
            return -1;
        }
        return -1;
    }

    int f(byte param0) {
        if (param0 <= 22) {
            int discarded$0 = ((am) this).e((byte) -66);
            return -1;
        }
        return -1;
    }

    am(int param0, boolean param1) {
        ((am) this).field_m = new am[param0];
        ((am) this).field_p = param1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Names cannot contain consecutive spaces";
        field_j = "Orb coins: <%0>";
        field_o = "MUSIC:";
    }
}
