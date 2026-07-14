/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gp {
    int[] field_C;
    char[] field_u;
    boolean field_y;
    static String field_E;
    int[] field_z;
    static cr field_A;
    static String field_w;
    static String field_t;
    String field_D;
    static cr field_x;
    char[] field_v;

    private final void a(int param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char stackIn_13_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        char stackOut_18_2 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        char stackOut_12_2 = 0;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        char stackOut_11_2 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param0 == 6267) {
          L0: {
            if (param1 != 1) {
              if (-3 == (param1 ^ -1)) {
                var4 = param2.h(-11);
                ((ud) this).field_v = new char[var4];
                ((ud) this).field_C = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    L2: {
                      ((ud) this).field_C[var5] = param2.a((byte) -11);
                      var6 = param2.g(88);
                      stackOut_16_0 = ((ud) this).field_v;
                      stackOut_16_1 = var5;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (var6 != 0) {
                        stackOut_18_0 = (char[]) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = mn.a((byte) var6, 93);
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L2;
                      } else {
                        stackOut_17_0 = (char[]) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 0;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L2;
                      }
                    }
                    stackIn_19_0[stackIn_19_1] = (char) stackIn_19_2;
                    var5++;
                    continue L1;
                  }
                }
              } else {
                if (param1 == 3) {
                  var4 = param2.h(-11);
                  ((ud) this).field_z = new int[var4];
                  ((ud) this).field_u = new char[var4];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var4) {
                      break L0;
                    } else {
                      L4: {
                        ((ud) this).field_z[var5] = param2.a((byte) -11);
                        var6 = param2.g(112);
                        stackOut_10_0 = ((ud) this).field_u;
                        stackOut_10_1 = var5;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var6 == 0) {
                          stackOut_12_0 = (char[]) (Object) stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = (char)0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          break L4;
                        } else {
                          stackOut_11_0 = (char[]) (Object) stackIn_11_0;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = mn.a((byte) var6, -48);
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          break L4;
                        }
                      }
                      stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  if (4 != param1) {
                    break L0;
                  } else {
                    ((ud) this).field_y = true;
                    break L0;
                  }
                }
              }
            } else {
              ((ud) this).field_D = param2.f(param0 ^ 6395);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(ed param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            ud.b((byte) -4);
            break L0;
          }
        }
        L1: while (true) {
          var3 = param0.h(-11);
          if (0 != var3) {
            this.a(6267, var3, param0);
            continue L1;
          } else {
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_w = null;
        field_E = null;
        field_t = null;
        field_A = null;
        field_x = null;
        if (param0 != -37) {
            ud.b((byte) -106);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 89) {
            ud.b((byte) -113);
        }
        if (!(((ud) this).field_z == null)) {
            for (var2 = 0; ((ud) this).field_z.length > var2; var2++) {
                ((ud) this).field_z[var2] = om.a(((ud) this).field_z[var2], 32768);
            }
        }
        if (!(((ud) this).field_C == null)) {
            var4 = 0;
            var2 = var4;
            while (((ud) this).field_C.length > var4) {
                ((ud) this).field_C[var4] = om.a(((ud) this).field_C[var4], 32768);
                var4++;
            }
        }
    }

    ud() {
        ((ud) this).field_y = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Names can only contain letters, numbers, spaces and underscores";
        field_t = "<%0> would need a rating of <%1> to play with the current options.";
        field_E = "Show all private chat";
    }
}
