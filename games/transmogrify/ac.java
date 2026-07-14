/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends kk {
    static ld field_n;
    private String field_i;
    static String field_h;
    static ti field_m;
    private String field_l;
    static long field_j;
    static String[] field_k;

    public static void a(byte param0) {
        field_h = null;
        if (param0 >= -75) {
          field_m = null;
          field_k = null;
          field_m = null;
          field_n = null;
          return;
        } else {
          field_k = null;
          field_m = null;
          field_n = null;
          return;
        }
    }

    final void a(byte param0, oa param1) {
        if (param0 >= -50) {
          ac.a((byte) -2);
          param1.a(((ac) this).field_l, 124);
          param1.a((byte) 118, ((ac) this).field_i);
          return;
        } else {
          param1.a(((ac) this).field_l, 124);
          param1.a((byte) 118, ((ac) this).field_i);
          return;
        }
    }

    final static si a(int param0, int param1, ci param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = param2.b((byte) -121, param0);
        var3 = var4;
        if (var4 != null) {
          if (param1 != 270) {
            field_j = -92L;
            return new si(var4);
          } else {
            return new si(var4);
          }
        } else {
          return null;
        }
    }

    final nk a(int param0) {
        if (param0 != -184) {
            Object var3 = null;
            si discarded$0 = ac.a(31, -57, (ci) null);
            return wh.field_I;
        }
        return wh.field_I;
    }

    final static String a(int param0, j param1) {
        Object var3 = null;
        if (param0 >= 13) {
          if (param1 != od.field_g) {
            if (wk.field_a != param1) {
              if (param1 != si.field_i) {
                return "Error:" + param1;
              } else {
                return "new_rack";
              }
            } else {
              return "carryover_rack";
            }
          } else {
            return "submission_rack";
          }
        } else {
          var3 = null;
          String discarded$4 = ac.a(-41, (j) null);
          if (param1 != od.field_g) {
            if (wk.field_a != param1) {
              if (param1 != si.field_i) {
                return "Error:" + param1;
              } else {
                return "new_rack";
              }
            } else {
              return "carryover_rack";
            }
          } else {
            return "submission_rack";
          }
        }
    }

    final static ti a(int param0, int param1, ci param2, boolean param3) {
        if (!param3) {
          if (!rl.a(param1, 0, param0, param2)) {
            return null;
          } else {
            return lk.a(true);
          }
        } else {
          field_j = -83L;
          if (!rl.a(param1, 0, param0, param2)) {
            return null;
          } else {
            return lk.a(true);
          }
        }
    }

    ac(String param0, String param1) {
        ((ac) this).field_i = param1;
        ((ac) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Cancel";
        field_m = new ti(270, 70);
        field_k = new String[]{"All scores", "My scores", "Best each"};
    }
}
