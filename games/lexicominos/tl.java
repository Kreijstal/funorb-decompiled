/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static ng field_h;
    int field_b;
    static float field_g;
    int field_f;
    int field_a;
    private int field_d;
    private int field_e;
    int field_c;

    final static void a(boolean param0, ng param1) {
        kd var2 = null;
        kd var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = param1.field_b;
        L0: while (true) {
          var3 = var2.field_f;
          var2.field_c = var3;
          var2 = var3;
          if (var2 != param1.field_b) {
            continue L0;
          } else {
            var2 = param1.field_b;
            L1: while (true) {
              var3 = var2.field_c;
              var3.field_f = var2;
              var2 = var3;
              if (param1.field_b != var2) {
                continue L1;
              } else {
                if (param0) {
                  var5 = null;
                  tl.a(true, (ng) null);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 3) {
            Object var2 = null;
            tl.a(false, (ng) null);
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (((tl) this).field_e != rf.a(param1, 47)) {
          L0: {
            ((tl) this).field_e = rf.a(param1, 47);
            ((tl) this).field_d = 1;
            if (20 < ((tl) this).field_d) {
              stackOut_20_0 = 3;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              stackOut_19_0 = 1;
              stackIn_21_0 = stackOut_19_0;
              break L0;
            }
          }
          var3 = stackIn_21_0 * param1;
          if (var3 > ((tl) this).field_f / tg.field_j) {
            var3 = ((tl) this).field_f / tg.field_j;
            if (param0 > 100) {
              return var3;
            } else {
              ((tl) this).field_e = -94;
              return var3;
            }
          } else {
            if (var3 < -((tl) this).field_f / tg.field_j) {
              var3 = -((tl) this).field_f / tg.field_j;
              if (param0 > 100) {
                return var3;
              } else {
                ((tl) this).field_e = -94;
                return var3;
              }
            } else {
              if (param0 > 100) {
                return var3;
              } else {
                ((tl) this).field_e = -94;
                return var3;
              }
            }
          }
        } else {
          L1: {
            ((tl) this).field_d = ((tl) this).field_d + 1;
            if (20 < ((tl) this).field_d) {
              stackOut_3_0 = 3;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0 * param1;
          if (var3 > ((tl) this).field_f / tg.field_j) {
            var3 = ((tl) this).field_f / tg.field_j;
            if (param0 > 100) {
              return var3;
            } else {
              ((tl) this).field_e = -94;
              return var3;
            }
          } else {
            if (var3 < -((tl) this).field_f / tg.field_j) {
              var3 = -((tl) this).field_f / tg.field_j;
              if (param0 > 100) {
                return var3;
              } else {
                ((tl) this).field_e = -94;
                return var3;
              }
            } else {
              if (param0 > 100) {
                return var3;
              } else {
                ((tl) this).field_e = -94;
                return var3;
              }
            }
          }
        }
    }

    final int a(byte param0) {
        if (param0 != -123) {
            return -123;
        }
        return ((tl) this).field_c * ((tl) this).field_b / ((tl) this).field_f;
    }

    tl(int param0, int param1) {
        ((tl) this).field_f = param0;
        ((tl) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ng();
    }
}
