/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends bh {
    static String field_t;
    int field_r;
    static ui[][] field_u;
    static int[] field_o;
    boolean field_s;
    int[] field_q;
    static String field_n;
    static String field_p;

    public static void a(int param0) {
        field_u = null;
        field_p = null;
        field_t = null;
        field_o = null;
        field_n = null;
        if (param0 != 13820388) {
            field_u = null;
        }
    }

    final static void c(byte param0) {
        tj var1 = null;
        ve var1_ref = null;
        int var2 = 0;
        Object var5 = null;
        var2 = client.field_A ? 1 : 0;
        var1 = (tj) (Object) i.field_b.c((byte) -53);
        L0: while (true) {
          if (var1 == null) {
            var1_ref = (ve) (Object) h.field_b.c((byte) 26);
            L1: while (true) {
              if (var1_ref == null) {
                var1 = (tj) (Object) oc.field_b.c((byte) 50);
                L2: while (true) {
                  if (var1 == null) {
                    if (param0 == 123) {
                      return;
                    } else {
                      var5 = null;
                      fm discarded$1 = sb.a(-113L, (String) null, false, (String) null, 29);
                      return;
                    }
                  } else {
                    if (0 < var1.field_Qb) {
                      var1.field_Qb = var1.field_Qb - 1;
                      if ((var1.field_Qb ^ -1) != -1) {
                        var1 = (tj) (Object) oc.field_b.d(true);
                        continue L2;
                      } else {
                        var1.field_hc = 0;
                        if (!var1.g((byte) 59)) {
                          var1 = (tj) (Object) oc.field_b.d(true);
                          continue L2;
                        } else {
                          var1.b((byte) 101);
                          var1 = (tj) (Object) oc.field_b.d(true);
                          continue L2;
                        }
                      }
                    } else {
                      var1 = (tj) (Object) oc.field_b.d(true);
                      continue L2;
                    }
                  }
                }
              } else {
                if (var1_ref.field_Rb > 0) {
                  var1_ref.field_Rb = var1_ref.field_Rb - 1;
                  if (-1 == (var1_ref.field_Rb ^ -1)) {
                    var1_ref.field_oc = 0;
                    if (!var1_ref.i((byte) 115)) {
                      var1_ref = (ve) (Object) h.field_b.d(true);
                      continue L1;
                    } else {
                      var1_ref.b((byte) 113);
                      var1_ref = (ve) (Object) h.field_b.d(true);
                      continue L1;
                    }
                  } else {
                    var1_ref = (ve) (Object) h.field_b.d(true);
                    continue L1;
                  }
                } else {
                  var1_ref = (ve) (Object) h.field_b.d(true);
                  continue L1;
                }
              }
            }
          } else {
            if ((var1.field_Qb ^ -1) >= -1) {
              var1 = (tj) (Object) i.field_b.d(true);
              continue L0;
            } else {
              var1.field_Qb = var1.field_Qb - 1;
              if (-1 != (var1.field_Qb ^ -1)) {
                var1 = (tj) (Object) i.field_b.d(true);
                continue L0;
              } else {
                var1.field_hc = 0;
                if (var1.g((byte) 111)) {
                  var1.b((byte) 112);
                  var1 = (tj) (Object) i.field_b.d(true);
                  continue L0;
                } else {
                  var1 = (tj) (Object) i.field_b.d(true);
                  continue L0;
                }
              }
            }
          }
        }
    }

    final static fm a(long param0, String param1, boolean param2, String param3, int param4) {
        if ((long)param4 != param0) {
          if (param2) {
            return (fm) (Object) new qa(param0, param1);
          } else {
            return (fm) (Object) new wk(param0, param1);
          }
        } else {
          if (param3 == null) {
            if (param2) {
              return (fm) (Object) new qa(param0, param1);
            } else {
              return (fm) (Object) new wk(param0, param1);
            }
          } else {
            return (fm) (Object) new ob(param3, param1);
          }
        }
    }

    sb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Secret achievement";
        field_o = new int[]{10076391, 4944180, 14961707, 16178128, 13820388};
        field_u = new ui[8][4];
        field_n = "Players: <%0>/<%1>";
        field_p = "Show players in <%0>'s game";
    }
}
