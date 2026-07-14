/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends wf {
    static bi field_s;
    static String field_v;
    static int field_w;
    static String field_r;
    static qr field_x;
    static long field_o;
    static String field_p;
    static boolean field_u;
    static boolean[] field_t;
    static boolean[] field_q;

    final static void a(int param0, sq param1) {
        sq var3 = null;
        sq var2 = null;
        if (param0 != 1) {
            return;
        }
        if (null != hm.field_q) {
            var3 = !hm.field_q.field_k ? hm.field_q : hm.field_q.field_l;
            var2 = var3;
            if (!(var2 == null)) {
                ge.field_i = ge.field_i + 1;
                js.field_b[ge.field_i] = var3;
            }
        }
        lp.a(param0 + 1546006976, param1);
    }

    ac(ln param0, int[] param1, boolean[] param2, me param3) {
        super(param0);
        int var5_int = 0;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        ln[] var9 = null;
        ((ac) this).field_j = 0;
        var5_int = 0;
        L0: while (true) {
          if (4 <= var5_int) {
            L1: {
              if (-1 >= (((ac) this).field_j ^ -1)) {
                break L1;
              } else {
                ((ac) this).field_j = -((ac) this).field_j;
                break L1;
              }
            }
            L2: {
              if (!(param3 instanceof ui)) {
                break L2;
              } else {
                if (36 != ((ac) this).field_n.field_p) {
                  break L2;
                } else {
                  ((ac) this).field_j = ((ac) this).field_j + 50;
                  break L2;
                }
              }
            }
            ((ac) this).field_i = 0;
            var9 = param0.field_D;
            var5 = var9;
            var6 = 0;
            L3: while (true) {
              if (var6 >= var9.length) {
                L4: {
                  if (!param0.field_u) {
                    break L4;
                  } else {
                    if ((((ac) this).field_i ^ -1) >= -2) {
                      break L4;
                    } else {
                      ((ac) this).field_i = ((ac) this).field_i / 2;
                      break L4;
                    }
                  }
                }
                L5: {
                  if (((ac) this).field_i != 0) {
                    break L5;
                  } else {
                    ((ac) this).field_i = 1;
                    break L5;
                  }
                }
              } else {
                var7 = var9[var6];
                if (null != var7.field_y) {
                  if (var7.field_y != param0.field_y) {
                    if (!param2[var7.field_y.field_x]) {
                      ((ac) this).field_i = ((ac) this).field_i + var7.field_x;
                      var6++;
                      continue L3;
                    } else {
                      var6++;
                      continue L3;
                    }
                  } else {
                    var6++;
                    continue L3;
                  }
                } else {
                  var6++;
                  continue L3;
                }
              }
            }
          } else {
            ((ac) this).field_j = ((ac) this).field_j + param0.field_G[var5_int] * param1[var5_int];
            var5_int++;
            continue L0;
          }
        }
    }

    public static void e(int param0) {
        field_t = null;
        field_s = null;
        field_r = null;
        field_q = null;
        field_p = null;
        int var1 = -126 / ((33 - param0) / 37);
        field_x = null;
        field_v = null;
    }

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 15) {
          L0: {
            L1: {
              if (lg.field_e == null) {
                break L1;
              } else {
                if (!lg.field_e.f((byte) -99)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Don't mind";
        field_v = "<br><br><%PROJECT_ENERGY> - In the Classic rules, a <%project_energy> does not destroy a <%project_metal> in the target system. Instead, the bomb will destroy half the fleets in the system but leave the net in place. It will also prevent fleets leaving the system as normal.";
        field_p = "Month";
        field_t = new boolean[]{false, false, false, true, true, true, true, true, true, false, false, false, false, true, true, true, false, true, true, true, false, false, false, false, true, true, false, true, true, false, true, true, false, false, true, false, true, false, true, false, true, false, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, false, false, true, true, false, true, true, true, true, true, true, true, true, true, true, false, true, false, true, false, true, false, true, false, true, false, false, false, true, true, false, true, true, false, true, true, false, false, false, true, true, true, false, true, true, true, false, false, false, false, false, true, true, true, true, true, true, false, false};
    }
}
