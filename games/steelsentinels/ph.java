/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String field_d;
    static String field_c;
    static String field_b;
    static String field_a;
    static String field_f;
    static na[] field_e;

    public static void a(int param0) {
        if (param0 < 33) {
            return;
        }
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static void a(na param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        dd var6 = null;
        String var7 = null;
        dd var8 = null;
        String var9 = null;
        dd var10 = null;
        String var11 = null;
        dd var12 = null;
        String var13 = null;
        dd var14 = null;
        gh stackIn_1_0 = null;
        gh stackIn_2_0 = null;
        gh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        gh stackOut_0_0 = null;
        gh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        gh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = param0.field_m;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param0.field_k ^ -1) != -2) {
            stackOut_2_0 = (gh) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (gh) (Object) stackIn_1_0;
            stackOut_1_1 = param0.field_e;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          kk.a(stackIn_3_0, stackIn_3_1, param0.field_k, (int[]) null, param0.field_p, param0.field_d, 1073741824, param0.field_j, (kg) null);
          if ((param0.field_k ^ -1) != param1) {
            break L1;
          } else {
            if (kg.d((byte) 120)) {
              break L1;
            } else {
              if (nf.field_b != null) {
                break L1;
              } else {
                if (null != ni.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (uc.field_g) {
                      break L2;
                    } else {
                      var6 = an.field_i;
                      var7 = ml.field_d;
                      var6.field_j.a(2, 14, var7);
                      break L2;
                    }
                  }
                  var8 = an.field_i;
                  var9 = ei.field_u;
                  var8.field_j.a(2, 20, var9);
                  break L1;
                }
              }
            }
          }
        }
        L3: {
          if ((param0.field_k ^ -1) != -2) {
            break L3;
          } else {
            if (kg.d((byte) 37)) {
              break L3;
            } else {
              if (nf.field_b == null) {
                break L3;
              } else {
                if (param0.field_e != nf.field_b.j(-120)) {
                  break L3;
                } else {
                  L4: {
                    if (uc.field_g) {
                      break L4;
                    } else {
                      var10 = an.field_i;
                      var11 = qi.field_g;
                      var10.field_j.a(param1 + 3, 14, var11);
                      break L4;
                    }
                  }
                  var12 = an.field_i;
                  var13 = bl.field_g;
                  var12.field_j.a(2, 20, var13);
                  break L3;
                }
              }
            }
          }
        }
        an.field_i.a((byte) 64);
        an.field_i.a(false, (byte) -79);
        an.field_i.a(param0.field_l, -2, param0.field_k);
        an.field_i.c(-99);
        an.field_i.a(0, param0);
        var14 = an.field_i;
        var3 = oa.field_S;
        var4 = rj.field_j;
        var14.field_j.a(0, 0, var4, (byte) -97, var3);
    }

    final static boolean b(int param0) {
        if (param0 == 12412) {
          if (ve.field_a != null) {
            if (!ve.field_a.a((byte) -60)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_f = null;
          if (ve.field_a != null) {
            if (!ve.field_a.a((byte) -60)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        km.field_i = param0;
        if (param3 >= -62) {
            return;
        }
        se.field_e = param1;
        kj.field_I = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please try again in a few minutes.";
        field_a = "Players: ";
        field_b = "Open in popup window";
        field_f = "Try changing the '<%0>' setting.";
        field_d = "TOTAL: <img=24><col=<%1>><%0></col>";
    }
}
