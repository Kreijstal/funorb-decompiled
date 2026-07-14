/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wv {
    static int[] field_a;

    final static boolean a(byte param0, char param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 <= -71) {
          if (param1 != 160) {
            if (param1 != 32) {
              if (95 != param1) {
                if (45 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          wv.a(false);
          if (param1 != 160) {
            if (param1 != 32) {
              if (95 != param1) {
                if (45 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param2 = gf.a('_', param2, param0, "");
        if (!param0) {
          var3 = ji.a(param2, (byte) 81);
          if (-1 == param1.indexOf(param2)) {
            if (0 != (param1.indexOf(var3) ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var4 = null;
          boolean discarded$2 = wv.a(true, (String) null, (String) null);
          var3 = ji.a(param2, (byte) 81);
          if (-1 != param1.indexOf(param2)) {
            return true;
          } else {
            L0: {
              if (0 == param1.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 24238) {
            field_a = null;
            lf.a(0, 0);
            return;
        }
        lf.a(0, 0);
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            boolean discarded$0 = wv.a((byte) 57, 'U');
        }
    }

    final static void a(byte param0, String param1, String param2) {
        Object var4 = null;
        if (hc.field_c == null) {
          no.field_a = new cv(param1, param2, false, true, true);
          if (param0 < 73) {
            var4 = null;
            boolean discarded$4 = wv.a(false, (String) null, (String) null);
            vi.field_y.b((byte) -119, (pk) (Object) no.field_a);
            return;
          } else {
            vi.field_y.b((byte) -119, (pk) (Object) no.field_a);
            return;
          }
        } else {
          hc.field_c.n(-7);
          no.field_a = new cv(param1, param2, false, true, true);
          if (param0 >= 73) {
            vi.field_y.b((byte) -119, (pk) (Object) no.field_a);
            return;
          } else {
            var4 = null;
            boolean discarded$5 = wv.a(false, (String) null, (String) null);
            vi.field_y.b((byte) -119, (pk) (Object) no.field_a);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
