/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends li {
    static boolean field_r;
    int field_x;
    int field_n;
    int field_G;
    int field_C;
    int field_H;
    int field_y;
    int field_F;
    static String field_t;
    al field_K;
    static String field_u;
    gl field_p;
    int field_q;
    int field_A;
    int field_o;
    int field_s;
    int field_B;
    static String field_L;
    ae field_z;
    int field_I;
    ra field_J;
    int field_E;
    int field_w;
    int field_D;
    int field_v;

    final static wp a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        var2 = param0.length();
        if (-1 != (var2 ^ -1)) {
          if (var2 <= 63) {
            L0: {
              if (param1) {
                break L0;
              } else {
                var6 = null;
                pe.a((ud) null, 53);
                break L0;
              }
            }
            var3 = 0;
            L1: while (true) {
              if (var3 < var2) {
                var4 = param0.charAt(var3);
                if (var4 == 45) {
                  L2: {
                    if (var3 == 0) {
                      break L2;
                    } else {
                      if (-1 + var2 == var3) {
                        break L2;
                      } else {
                        var3++;
                        continue L1;
                      }
                    }
                  }
                  return bp.field_A;
                } else {
                  if (ke.field_d.indexOf(var4) == -1) {
                    return bp.field_A;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return cg.field_a;
          }
        } else {
          return ab.field_a;
        }
    }

    final void a(int param0) {
        ((pe) this).field_p = null;
        ((pe) this).field_z = null;
        ((pe) this).field_J = null;
        if (param0 > -93) {
            ((pe) this).field_q = -49;
        }
        ((pe) this).field_K = null;
    }

    final static void a(ud param0, int param1) {
        param0.field_z = new int[]{-1};
        if (param1 <= 82) {
            return;
        }
        param0.field_u = new char[]{(char)63};
    }

    public static void a(boolean param0) {
        field_u = null;
        if (!param0) {
            return;
        }
        field_L = null;
        field_t = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param4 > 10) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param3 < param5) {
              break L2;
            } else {
              if (param3 >= param6 + param5) {
                break L2;
              } else {
                if (param2 < param1) {
                  break L2;
                } else {
                  if (param2 >= param0 + param1) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    pe() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "red died";
        field_L = "You won! <br><%0>% of the level was <%1>";
        field_u = "Status";
        field_r = true;
    }
}
