/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends gb {
    static int field_A;
    static boolean field_v;
    static int[] field_x;
    String field_y;
    boolean field_w;
    char[] field_u;
    static String field_C;
    int[] field_z;
    int[] field_t;
    char[] field_D;

    public static void f(int param0) {
        if (param0 != 0) {
            return;
        }
        field_C = null;
        field_x = null;
    }

    final static int c(byte param0) {
        if (param0 > -83) {
            return -42;
        }
        return wh.field_k;
    }

    private final void a(bh param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char stackIn_16_2 = 0;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char stackOut_15_2 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char stackOut_14_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        L0: {
          var7 = TetraLink.field_J;
          if (param2 == 0) {
            break L0;
          } else {
            ((qa) this).g(-10);
            break L0;
          }
        }
        L1: {
          if (param1 == 1) {
            ((qa) this).field_y = param0.g((byte) 81);
            break L1;
          } else {
            if (param1 != 2) {
              if ((param1 ^ -1) != -4) {
                if (-5 == (param1 ^ -1)) {
                  ((qa) this).field_w = true;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var4 = param0.d((byte) -99);
                ((qa) this).field_t = new int[var4];
                ((qa) this).field_u = new char[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    L3: {
                      ((qa) this).field_t[var5] = param0.e(127);
                      var6 = param0.g(-1772093437);
                      stackOut_13_0 = ((qa) this).field_u;
                      stackOut_13_1 = var5;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (0 == var6) {
                        stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = (char)0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L3;
                      } else {
                        stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = mk.a((byte) -13, (byte) var6);
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L3;
                      }
                    }
                    stackIn_16_0[stackIn_16_1] = stackIn_16_2;
                    var5++;
                    continue L2;
                  }
                }
              }
            } else {
              var4 = param0.d((byte) -99);
              ((qa) this).field_D = new char[var4];
              ((qa) this).field_z = new int[var4];
              var5 = 0;
              L4: while (true) {
                if (var5 >= var4) {
                  break L1;
                } else {
                  L5: {
                    ((qa) this).field_z[var5] = param0.e(param2 + 127);
                    var6 = param0.g(-1772093437);
                    stackOut_6_0 = ((qa) this).field_D;
                    stackOut_6_1 = var5;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (-1 != (var6 ^ -1)) {
                      stackOut_8_0 = (char[]) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = mk.a((byte) -13, (byte) var6);
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      break L5;
                    } else {
                      stackOut_7_0 = (char[]) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = 0;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      break L5;
                    }
                  }
                  stackIn_9_0[stackIn_9_1] = (char) stackIn_9_2;
                  var5++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          param2 = um.a(param2, '_', false, "");
          if (param0 == 16732) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = dj.a(108, param2);
            if (-1 != param1.indexOf(param2)) {
              break L2;
            } else {
              if (0 == (param1.indexOf(var3) ^ -1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static oh[] a(String param0, int param1, ah param2, String param3) {
        int var4 = param2.a(param1, param0);
        int var5 = param2.a(var4, false, param3);
        return h.a(var4, var5, false, param2);
    }

    final static void b(byte param0) {
        if (!(hd.field_u != null)) {
            return;
        }
        oa.a((byte) -119, (java.awt.Canvas) (Object) hd.field_u);
        hd.field_u.a((byte) 52, nd.field_Pb);
        hd.field_u = null;
        if (hn.field_M != null) {
            hn.field_M.a((byte) 36);
        }
        uh.field_b.requestFocus();
        if (param0 < 21) {
            field_A = -4;
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = TetraLink.field_J;
        if (!(((qa) this).field_t == null)) {
            for (var2 = 0; ((qa) this).field_t.length > var2; var2++) {
                ((qa) this).field_t[var2] = mc.a(((qa) this).field_t[var2], 32768);
            }
        }
        if (param0 != 32768) {
            qa.b((byte) 15);
        }
        if (!(null == ((qa) this).field_z)) {
            var4 = 0;
            var2 = var4;
            while (var4 < ((qa) this).field_z.length) {
                ((qa) this).field_z[var4] = mc.a(((qa) this).field_z[var4], 32768);
                var4++;
            }
        }
    }

    final void a(bh param0, int param1) {
        int var3 = 0;
        int var4 = TetraLink.field_J;
        while (true) {
            var3 = param0.d((byte) -99);
            if (-1 == (var3 ^ -1)) {
                break;
            }
            this.a(param0, var3, param1 ^ 0);
        }
        if (param1 != 0) {
            ((qa) this).g(109);
        }
    }

    qa() {
        ((qa) this).field_w = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Waiting for graphics";
    }
}
