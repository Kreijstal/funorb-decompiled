/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    int field_l;
    int field_k;
    static String field_c;
    static tk field_b;
    static vh field_f;
    static String field_m;
    static String[] field_a;
    private int field_g;
    static int field_e;
    boolean field_h;
    boolean field_j;
    int field_d;
    static dd field_i;

    final boolean a(byte param0, int param1, al param2) {
        if (param0 == -8) {
          if (((df) this).field_h) {
            if (param2.field_l[((df) this).field_g].field_s) {
              if (param1 != ((df) this).field_g) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static String a(byte param0) {
        if ((sf.field_y ^ -1) > -3) {
          return kg.field_q;
        } else {
          if (null != wh.field_a) {
            if (!wh.field_a.d(84)) {
              return ir.field_b;
            } else {
              return ud.field_F;
            }
          } else {
            if (!uj.field_d.d(101)) {
              return rp.field_c;
            } else {
              if (!uj.field_d.a("commonui", 0)) {
                return oj.field_t + " - " + uj.field_d.a(100, "commonui") + "%";
              } else {
                if (!vf.field_nb.d(-127)) {
                  return gh.field_Q;
                } else {
                  if (param0 == 84) {
                    if (!vf.field_nb.a("commonui", 0)) {
                      return kb.field_a + " - " + vf.field_nb.a(100, "commonui") + "%";
                    } else {
                      if (rg.field_r.d(66)) {
                        if (!rg.field_r.c(-63)) {
                          return cf.field_c + " - " + rg.field_r.b(0) + "%";
                        } else {
                          return cl.field_j;
                        }
                      } else {
                        return de.field_e;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, pq param1, al param2) {
        long var4 = 0L;
        long var6 = 0L;
        int[] var8_ref_int__ = null;
        long var8 = 0L;
        int[] var10 = null;
        pq var11 = null;
        L0: {
          if (((df) this).field_h) {
            var11 = param2.field_l[((df) this).field_g];
            var4 = (long)param1.field_g + -(long)var11.field_g;
            var6 = -(long)var11.field_k + (long)param1.field_k;
            var4 = var4 >> 8;
            var6 = var6 >> 8;
            break L0;
          } else {
            var10 = param2.field_e[((df) this).field_g];
            var8_ref_int__ = var10;
            var4 = -(long)var10[0] + (long)param1.field_g;
            var4 = var4 >> 8;
            var6 = (long)param1.field_k + -(long)var10[1];
            var6 = var6 >> 8;
            break L0;
          }
        }
        var8 = bm.a(-119, var4 * var4 + var6 * var6);
        if (-2147483648L <= var8) {
          if (var8 <= 2147483647L) {
            if (param0 != 1763073386) {
              field_e = 62;
              ((df) this).field_l = (int)var8;
              return;
            } else {
              ((df) this).field_l = (int)var8;
              return;
            }
          } else {
            throw new IllegalStateException("dist too big when checking for visibility.");
          }
        } else {
          throw new IllegalStateException("dist too big when checking for visibility.");
        }
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 < 82) {
          String discarded$2 = df.a((byte) -85);
          field_a = null;
          field_c = null;
          field_i = null;
          field_f = null;
          field_m = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_i = null;
          field_f = null;
          field_m = null;
          return;
        }
    }

    final void a(int param0, boolean param1, boolean param2) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((df) this).field_h = stackIn_3_1 != 0;
        if (!param2) {
          ((df) this).field_g = -112;
          ((df) this).field_g = param0;
          return;
        } else {
          ((df) this).field_g = param0;
          return;
        }
    }

    final int a(al param0, pq param1, int param2) {
        int[] var4 = null;
        int[] var5 = null;
        pq var7 = null;
        int[] var8 = null;
        pq var9 = null;
        int[] var10 = null;
        if (param2 == -6661) {
          if (((df) this).field_h) {
            var9 = param0.field_l[((df) this).field_g];
            return 8191 & tj.c(var9.field_g - param1.field_g >> -1483681046, var9.field_k - param1.field_k >> 1763073386, 4096);
          } else {
            var10 = param0.field_e[((df) this).field_g];
            var5 = var10;
            var4 = var5;
            return 8191 & tj.c(var10[0] - param1.field_g >> 209920874, -param1.field_k + var10[1] >> 509324874, 4096);
          }
        } else {
          field_i = null;
          if (((df) this).field_h) {
            var7 = param0.field_l[((df) this).field_g];
            return 8191 & tj.c(var7.field_g - param1.field_g >> -1483681046, var7.field_k - param1.field_k >> 1763073386, 4096);
          } else {
            var8 = param0.field_e[((df) this).field_g];
            var5 = var8;
            var4 = var5;
            return 8191 & tj.c(var8[0] - param1.field_g >> 209920874, -param1.field_k + var8[1] >> 509324874, 4096);
          }
        }
    }

    final int a(int param0) {
        if (param0 != 1048576) {
            return -61;
        }
        return dn.a(lh.a(((df) this).field_l, (byte) -112, ((df) this).field_h ? 1048576L : 524288L), false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = "Passwords must be between 5 and 20 letters and numbers";
        field_m = "Cancel rematch";
    }
}
