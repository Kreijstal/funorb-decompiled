/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    private int field_j;
    private int field_b;
    private boolean field_d;
    private int field_e;
    mg[] field_k;
    private int field_l;
    mg field_c;
    static hh field_f;
    static String field_g;
    static km field_a;
    static km field_m;
    static String field_i;
    private int field_h;
    static uk field_n;

    final void a(int param0) {
        ((jj) this).field_h = 256;
        if (param0 != 31749) {
            return;
        }
        ((jj) this).field_j = 0;
        ((jj) this).field_l = 0;
        ((jj) this).field_b = 0;
        ((jj) this).field_e = -1;
        ((jj) this).field_k = null;
        ((jj) this).field_c = null;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 55) {
            field_g = null;
        }
        field_g = null;
        field_i = null;
        field_f = null;
        field_m = null;
    }

    final jj a(int param0, mg[] param1) {
        ((jj) this).field_k = param1;
        if (param0 != -8779) {
            return null;
        }
        return (jj) this;
    }

    final void a(int param0, jj param1) {
        param1.field_e = ((jj) this).field_e;
        param1.field_k = ((jj) this).field_k;
        param1.field_b = ((jj) this).field_b;
        param1.field_c = ((jj) this).field_c;
        param1.field_d = ((jj) this).field_d;
        param1.field_l = ((jj) this).field_l;
        if (param0 != 13598) {
            return;
        }
        param1.field_j = ((jj) this).field_j;
        param1.field_h = ((jj) this).field_h;
    }

    final static mg[] a(String param0, eh param1, boolean param2, String param3) {
        int var4 = param1.a(-1, param0);
        int var5 = param1.a(-57, var4, param3);
        if (param2) {
            return null;
        }
        return tm.a(param1, var4, 4, var5);
    }

    final jj a(boolean param0, int param1) {
        ((jj) this).field_d = param0 ? true : false;
        if (param1 != 0) {
            field_i = null;
        }
        return (jj) this;
    }

    final static void a(int param0, km param1, byte[] param2, int param3, km param4, int param5, int param6, int param7, int param8, km param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Virogrid.field_F ? 1 : 0;
        hh.field_d = -1L;
        lk.field_Pb = param2;
        la.field_l = param8;
        vb.field_h = param2.length;
        kn.field_E = new byte[(7 + la.field_l) / param3];
        la.field_h = null;
        ld.field_c = false;
        wl.field_d = null;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (var11 >= lk.field_Pb.length) {
            L1: {
              var10 = (var10 + 7) / 8;
              pm.field_p = new byte[var10];
              if (param9.field_W != null) {
                break L1;
              } else {
                param9.field_W = new p();
                break L1;
              }
            }
            L2: {
              ci.field_o = param9.field_W;
              ci.field_o.a(false);
              ti.field_i = new kf(param7);
              ea.field_a = 0;
              nh.field_c = -1;
              sb.field_i = -1;
              wl.field_b = 0;
              if (null == param1.field_W) {
                param1.field_W = new p();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              te.field_f = param1.field_W;
              te.field_f.a(false);
              ma.field_c = new kf(param5);
              if (null != param4.field_W) {
                break L3;
              } else {
                param4.field_W = new p();
                break L3;
              }
            }
            qm.field_Mb = param4.field_W;
            qm.field_Mb.a(false);
            ah.field_h = new kf(param0);
            fn.field_c = param6;
            d.field_Eb = 0L;
            return;
          } else {
            var10 = var10 + (lk.field_Pb[var11] & 255);
            var11++;
            continue L0;
          }
        }
    }

    final jj a(int param0, int param1) {
        ((jj) this).field_l = param0;
        if (param1 < 123) {
            ((jj) this).field_h = 36;
        }
        return (jj) this;
    }

    final jj b(boolean param0, int param1) {
        ((jj) this).field_b = param1;
        if (!param0) {
            jj.a((byte) -66);
        }
        return (jj) this;
    }

    final void a(fi param0, int param1, nl param2, int param3, int param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        e stackIn_19_0 = null;
        String stackIn_19_1 = null;
        e stackIn_20_0 = null;
        String stackIn_20_1 = null;
        e stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        e stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        e stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        e stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        e stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        e stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        e stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        e stackOut_18_0 = null;
        String stackOut_18_1 = null;
        e stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        e stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        e stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        e stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        e stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        e stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        e stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        e stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        L0: {
          tm.a(param4 - -param0.field_l, param3 + param0.field_u, false, param0.field_g, param0.field_m, ((jj) this).field_k);
          if (null != ((jj) this).field_c) {
            L1: {
              var6_int = param0.field_l + (param4 + ((jj) this).field_j);
              if (param2.field_j == 1) {
                var6_int = var6_int + (param0.field_g + -((jj) this).field_c.field_u) / 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = ((jj) this).field_l + param3 - -param0.field_u;
              if (1 == param2.field_k) {
                var7 = var7 + (param0.field_m + -((jj) this).field_c.field_z) / 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((param2.field_j ^ -1) == -3) {
                var6_int = var6_int + (-((jj) this).field_c.field_u + param0.field_g);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-3 != (param2.field_k ^ -1)) {
                break L4;
              } else {
                var7 = var7 + (param0.field_m + -((jj) this).field_c.field_z);
                break L4;
              }
            }
            ((jj) this).field_c.d(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        L5: {
          var6 = param2.c(param0, 218479361);
          if (var6 == null) {
            break L5;
          } else {
            if (param2.field_i == null) {
              break L5;
            } else {
              if (0 <= ((jj) this).field_b) {
                L6: {
                  stackOut_18_0 = param2.field_i;
                  stackOut_18_1 = (String) var6;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  if (2147483647 != (((jj) this).field_j ^ -1)) {
                    stackOut_20_0 = (e) (Object) stackIn_20_0;
                    stackOut_20_1 = (String) (Object) stackIn_20_1;
                    stackOut_20_2 = ((jj) this).field_j;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    break L6;
                  } else {
                    stackOut_19_0 = (e) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = 0;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    break L6;
                  }
                }
                L7: {
                  stackOut_21_0 = (e) (Object) stackIn_21_0;
                  stackOut_21_1 = (String) (Object) stackIn_21_1;
                  stackOut_21_2 = stackIn_21_2 + param4 - (-param0.field_l + -param2.field_p);
                  stackOut_21_3 = param2.field_n;
                  stackOut_21_4 = param0.field_u;
                  stackOut_21_5 = param3;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_23_4 = stackOut_21_4;
                  stackIn_23_5 = stackOut_21_5;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  stackIn_22_3 = stackOut_21_3;
                  stackIn_22_4 = stackOut_21_4;
                  stackIn_22_5 = stackOut_21_5;
                  if (-2147483648 == ((jj) this).field_l) {
                    stackOut_23_0 = (e) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = stackIn_23_3;
                    stackOut_23_4 = stackIn_23_4;
                    stackOut_23_5 = stackIn_23_5;
                    stackOut_23_6 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    stackIn_24_4 = stackOut_23_4;
                    stackIn_24_5 = stackOut_23_5;
                    stackIn_24_6 = stackOut_23_6;
                    break L7;
                  } else {
                    stackOut_22_0 = (e) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = stackIn_22_3;
                    stackOut_22_4 = stackIn_22_4;
                    stackOut_22_5 = stackIn_22_5;
                    stackOut_22_6 = ((jj) this).field_l;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    stackIn_24_5 = stackOut_22_5;
                    stackIn_24_6 = stackOut_22_6;
                    break L7;
                  }
                }
                L8: {
                  stackOut_24_0 = (e) (Object) stackIn_24_0;
                  stackOut_24_1 = (String) (Object) stackIn_24_1;
                  stackOut_24_2 = stackIn_24_2;
                  stackOut_24_3 = stackIn_24_3 + (stackIn_24_4 + (stackIn_24_5 + stackIn_24_6));
                  stackOut_24_4 = -param2.field_d + (param0.field_g - param2.field_p);
                  stackOut_24_5 = param0.field_m - (param2.field_n - -param2.field_r);
                  stackOut_24_6 = ((jj) this).field_b;
                  stackOut_24_7 = ((jj) this).field_e;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  stackIn_26_3 = stackOut_24_3;
                  stackIn_26_4 = stackOut_24_4;
                  stackIn_26_5 = stackOut_24_5;
                  stackIn_26_6 = stackOut_24_6;
                  stackIn_26_7 = stackOut_24_7;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  stackIn_25_3 = stackOut_24_3;
                  stackIn_25_4 = stackOut_24_4;
                  stackIn_25_5 = stackOut_24_5;
                  stackIn_25_6 = stackOut_24_6;
                  stackIn_25_7 = stackOut_24_7;
                  if (((jj) this).field_h != -2147483648) {
                    stackOut_26_0 = (e) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3;
                    stackOut_26_4 = stackIn_26_4;
                    stackOut_26_5 = stackIn_26_5;
                    stackOut_26_6 = stackIn_26_6;
                    stackOut_26_7 = stackIn_26_7;
                    stackOut_26_8 = ((jj) this).field_h;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    stackIn_27_3 = stackOut_26_3;
                    stackIn_27_4 = stackOut_26_4;
                    stackIn_27_5 = stackOut_26_5;
                    stackIn_27_6 = stackOut_26_6;
                    stackIn_27_7 = stackOut_26_7;
                    stackIn_27_8 = stackOut_26_8;
                    break L8;
                  } else {
                    stackOut_25_0 = (e) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3;
                    stackOut_25_4 = stackIn_25_4;
                    stackOut_25_5 = stackIn_25_5;
                    stackOut_25_6 = stackIn_25_6;
                    stackOut_25_7 = stackIn_25_7;
                    stackOut_25_8 = 256;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    stackIn_27_4 = stackOut_25_4;
                    stackIn_27_5 = stackOut_25_5;
                    stackIn_27_6 = stackOut_25_6;
                    stackIn_27_7 = stackOut_25_7;
                    stackIn_27_8 = stackOut_25_8;
                    break L8;
                  }
                }
                int discarded$1 = ((e) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param2.field_j, param2.field_k, param2.field_f);
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        L9: {
          if (param1 == 2) {
            break L9;
          } else {
            ((jj) this).field_l = 118;
            break L9;
          }
        }
    }

    final jj a(byte param0, int param1) {
        ((jj) this).field_j = param1;
        if (param0 != 64) {
            return null;
        }
        return (jj) this;
    }

    final jj b(int param0, int param1) {
        if (param1 != -26973) {
            field_m = null;
        }
        ((jj) this).field_e = param0;
        return (jj) this;
    }

    final void a(int param0, nl param1, byte param2, jj param3, fi param4, int param5) {
        if (((jj) this).field_d) {
            param3.a(param4, 2, param1, param0, param5);
            param3.a(31749);
        }
        if (!(((jj) this).field_c == null)) {
            param3.field_c = ((jj) this).field_c;
        }
        if (!(-2147483648 == ((jj) this).field_j)) {
            param3.field_j = ((jj) this).field_j;
        }
        if (-1 <= ((jj) this).field_b) {
            param3.field_b = ((jj) this).field_b;
        }
        if (!(((jj) this).field_k == null)) {
            param3.field_k = ((jj) this).field_k;
        }
        if (!((((jj) this).field_l ^ -1) == 2147483647)) {
            param3.field_l = ((jj) this).field_l;
        }
        if (!(((jj) this).field_e < -1)) {
            param3.field_e = ((jj) this).field_e;
        }
        if (param2 != -12) {
            return;
        }
        if ((((jj) this).field_h ^ -1) != 2147483647) {
            param3.field_h = ((jj) this).field_h;
        }
    }

    jj() {
        ((jj) this).field_b = -2;
        ((jj) this).field_l = -2147483648;
        ((jj) this).field_e = -2;
        ((jj) this).field_k = null;
        ((jj) this).field_d = false;
        ((jj) this).field_j = -2147483648;
        ((jj) this).field_c = null;
        ((jj) this).field_h = -2147483648;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new hh();
        field_i = "Use this alternative as your account name";
        field_n = null;
    }
}
