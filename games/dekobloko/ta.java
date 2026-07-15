/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static qm field_a;
    static boolean field_f;
    private String field_e;
    private boolean field_j;
    private boolean field_c;
    static hn field_i;
    static String field_g;
    static int field_d;
    static dd field_k;
    static int field_b;
    static String field_h;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        field_h = null;
        field_k = null;
        field_g = null;
    }

    final static int a(CharSequence param0, int param1) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var2 = -43 / ((param1 - -74) / 38);
        int var3 = param0.length();
        int var4 = 0;
        for (var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << -397216347) + (-var4 - -j.a(param0.charAt(var5), (byte) 28));
        }
        return var4;
    }

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 <= -22) {
            break L0;
          } else {
            ta.a(false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-21 < (ca.field_vb ^ -1)) {
              break L2;
            } else {
              if (!t.i((byte) 124)) {
                break L2;
              } else {
                L3: {
                  if (-1 <= (bb.field_e ^ -1)) {
                    break L3;
                  } else {
                    if (bd.d((byte) 31)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static boolean a(ji param0, ji param1, int param2, ji param3) {
        if (!param0.a((byte) 121)) {
          return false;
        } else {
          if (param0.a("commonui", (byte) -101)) {
            L0: {
              if (!param1.a((byte) 121)) {
                break L0;
              } else {
                if (!param1.a("commonui", (byte) -117)) {
                  break L0;
                } else {
                  L1: {
                    if (!param3.a((byte) 121)) {
                      break L1;
                    } else {
                      if (param3.a("button.gif", (byte) -34)) {
                        L2: {
                          if (param2 == -21) {
                            break L2;
                          } else {
                            field_h = null;
                            break L2;
                          }
                        }
                        return true;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return false;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final static ck[] a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            ck[] discarded$0 = ta.a(false, 17, -88, -29, -62);
        }
        return ca.a(param3, 1, param4, 1, 1, false, param2, param1, 3);
    }

    final void a(int param0, boolean param1) {
        ((ta) this).field_j = true;
        ((ta) this).field_c = param1 ? true : false;
        if (param0 != -21) {
            ta.a(false);
        }
    }

    final boolean b(int param0) {
        if (param0 != -3348) {
            return false;
        }
        return ((ta) this).field_c;
    }

    final boolean a(int param0) {
        if (param0 < 49) {
            return false;
        }
        return ((ta) this).field_j;
    }

    ta(String param0) {
        ((ta) this).field_j = false;
        ((ta) this).field_c = false;
        ((ta) this).field_e = param0;
    }

    final String b(byte param0) {
        if (param0 < 59) {
            ((ta) this).field_j = true;
        }
        return ((ta) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = null;
        field_g = "Fullscreen mode";
        field_d = 0;
        field_a = new qm(1, 2, 2, 0);
        field_h = "Auto-respond to <%0>";
    }
}
