/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static ae[][] field_b;
    static int[] field_e;
    static String field_d;
    static fc field_a;
    static int field_c;

    final static boolean a(byte param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (-1 == param1) {
          return true;
        } else {
          if (param0 > -68) {
            L0: {
              boolean discarded$11 = on.a((byte) 50, 2);
              if (-1 == (to.field_c & 1 << param1)) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if (-1 == (to.field_c & 1 << param1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static void a(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, mp param7, mp param8, int param9, byte param10, int param11, mp param12, int param13, int param14, cc param15, int param16, int param17, int param18, int param19) {
        if (param10 != 24) {
          boolean discarded$1 = on.a((byte) 31, -11);
          hd.field_f = param0;
          oc.field_s = param15;
          t.a(param17, param3, param4, param18, (byte) 89);
          aq.a(param12, (byte) -122, param19, param9);
          ni.a((byte) 107, param6, param2, param1, param7, param8);
          af.a(param11, param16, (byte) 122);
          ug.a((byte) -113, param5, param14, param13);
          return;
        } else {
          hd.field_f = param0;
          oc.field_s = param15;
          t.a(param17, param3, param4, param18, (byte) 89);
          aq.a(param12, (byte) -122, param19, param9);
          ni.a((byte) 107, param6, param2, param1, param7, param8);
          af.a(param11, param16, (byte) 122);
          ug.a((byte) -113, param5, param14, param13);
          return;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_e = null;
        field_b = null;
        if (!param0) {
          var2 = null;
          on.a((cc) null, -20, -80, 55, -39, 122, -59, (mp) null, (mp) null, 108, (byte) -25, -117, (mp) null, 111, 97, (cc) null, 20, -31, 110, 20);
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static s a(int param0, int param1, int param2, byte param3, int param4) {
        s var5 = null;
        s var5_ref = null;
        int var6 = 0;
        s var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        var5 = (s) (Object) wg.field_i.a((byte) 100);
        L0: while (true) {
          if (var5 == null) {
            var7 = new s();
            var5_ref = var7;
            var7.field_q = param2;
            if (param3 <= 70) {
              return null;
            } else {
              var5_ref.field_o = param0;
              var5_ref.field_p = param4;
              wg.field_i.a((li) (Object) var5_ref, false);
              mm.a(param1, var5_ref, (byte) 108);
              return var5_ref;
            }
          } else {
            if (var5.field_p != param4) {
              var5 = (s) (Object) wg.field_i.b(99);
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    final static void a(int param0) {
        if (!pm.field_a) {
          if (param0 != 9110) {
            field_e = null;
            return;
          } else {
            return;
          }
        } else {
          bm.g(0);
          if (param0 == 9110) {
            return;
          } else {
            field_e = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Hide lobby chat";
        field_b = new ae[30][1];
        field_a = new fc(4096, 4096, 4096, false, true, false, false, 0, 0);
        field_c = 0;
    }
}
