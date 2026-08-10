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
        int var2;
        var2 = -68 / ((-63 - param0) / 62);
        if (!this.field_p) {
          this.field_r.b(-103);
          this.field_r = null;
          return;
        } else {
          this.field_l.c(111);
          this.field_l = null;
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
            field_o = (String) null;
        }
    }

    int[][] a(int param0, int param1) {
        if (param0 != -29116) {
            return (int[][]) null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    final int[] b(int param0, int param1, int param2) {
        if (param0 == 0) {
          if (this.field_m[param1].field_p) {
            return this.field_m[param1].a((byte) 98, param2);
          } else {
            return this.field_m[param1].a(-29116, param2)[0];
          }
        } else {
          return (int[]) null;
        }
    }

    final static void a(int param0) {
        int var2;
        var2 = Torquing.field_u;
        int fieldTemp$1 = fh.field_r + 1;
        fh.field_r = fh.field_r + 1;
        if (100 == fieldTemp$1) {
          hj.field_b = true;
          cq.field_w = null;
          jb.field_b = null;
          hj.field_c = null;
          of.field_l = null;
          nh.field_l = null;
          la.field_j = null;
          if (param0 < 53) {
            am.c((byte) 72);
            return;
          } else {
            return;
          }
        } else {
          if (35 > fh.field_r) {
            ub.field_E = ub.field_E + ra.field_c;
            tj.field_l = tj.field_l + ll.field_g;
            if (param0 < 53) {
              am.c((byte) 72);
              return;
            } else {
              return;
            }
          } else {
            if ((fh.field_r ^ -1) <= -71) {
              nn.field_e = nn.field_e - pp.field_a;
              if (param0 < 53) {
                am.c((byte) 72);
                return;
              } else {
                return;
              }
            } else {
              if (4 <= (-35 + fh.field_r + -35 ^ -1)) {
                vc.field_d = vc.field_d + 4;
                if (param0 >= 53) {
                  return;
                } else {
                  am.c((byte) 72);
                  return;
                }
              } else {
                vc.field_d = vc.field_d - 4;
                if (param0 >= 53) {
                  return;
                } else {
                  am.c((byte) 72);
                  return;
                }
              }
            }
          }
        }
    }

    void a(int param0, int param1, int param2) {
        int var4;
        int stackIn_3_0 = 0;
        L0: {
          if (this.field_k != 255) {
            stackIn_3_0 = this.field_k;
            break L0;
          } else {
            stackIn_3_0 = param2;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (!this.field_p) {
          this.field_r = new om(var4, param2, param0);
          if (param1 == 17749) {
            return;
          } else {
            this.a((byte) -76);
            return;
          }
        } else {
          this.field_l = new tp(var4, param2, param0);
          if (param1 == 17749) {
            return;
          } else {
            this.a((byte) -76);
            return;
          }
        }
    }

    int[] a(byte param0, int param1) {
        if (param0 < 86) {
            return (int[]) null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    final int[][] c(int param0, int param1, int param2) {
        int[] var4;
        int[][] var5;
        int[] var6;
        if (param0 == 24066) {
          if (this.field_m[param2].field_p) {
            var6 = this.field_m[param2].a((byte) 112, param1);
            var4 = var6;
            var5 = new int[3][];
            var5[0] = var6;
            var5[1] = var6;
            var5[2] = var6;
            return var5;
          } else {
            return this.field_m[param2].a(param0 + -53182, param1);
          }
        } else {
          field_n = true;
          if (this.field_m[param2].field_p) {
            var6 = this.field_m[param2].a((byte) 112, param1);
            var4 = var6;
            var5 = new int[3][];
            var5[0] = var6;
            var5[1] = var6;
            var5[2] = var6;
            return var5;
          } else {
            return this.field_m[param2].a(param0 + -53182, param1);
          }
        }
    }

    void a(fj param0, int param1, int param2) {
        try {
            if (param1 != 35) {
                field_n = false;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "am.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    int e(byte param0) {
        if (param0 < 26) {
            this.field_l = (tp) null;
            return -1;
        }
        return -1;
    }

    int f(byte param0) {
        if (param0 <= 22) {
            this.e((byte) -66);
            return -1;
        }
        return -1;
    }

    am(int param0, boolean param1) {
        this.field_m = new am[param0];
        this.field_p = param1 ? true : false;
    }

    static {
        field_q = "Names cannot contain consecutive spaces";
        field_j = "Orb coins: <%0>";
        field_o = "MUSIC:";
    }
}
