/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    static String field_d;
    static int field_c;
    static kc field_a;
    static boolean field_b;
    static int field_e;

    final static void a(boolean param0) {
        int var2 = 0;
        L0: {
          var2 = ArcanistsMulti.field_G ? 1 : 0;
          if (-1 <= ce.field_h) {
            if (-1 < sm.field_a) {
              sm.field_a = sm.field_a - 1;
              break L0;
            } else {
              if ((oo.field_y ^ -1) < -1) {
                oo.field_y = oo.field_y - 1;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            ce.field_h = ce.field_h - 1;
            break L0;
          }
        }
        L1: {
          if (param0) {
            break L1;
          } else {
            jo.a(19);
            break L1;
          }
        }
        L2: {
          if (ce.field_h > 0) {
            vc.a((byte) 37);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-1 <= (sm.field_a ^ -1)) {
            break L3;
          } else {
            ej.a(16, sm.field_a);
            break L3;
          }
        }
        L4: {
          if (oo.field_y > 0) {
            ej.a(16, oo.field_y);
            break L4;
          } else {
            break L4;
          }
        }
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = param0; var4 < param2; var4++) {
            var6[var4] = param1;
        }
        return new String(var6);
    }

    final static boolean a(wk param0, int param1) {
        int var2 = param0.e((byte) -88);
        int var3 = param1 != (var2 ^ -1) ? 0 : 1;
        return var3 != 0;
    }

    final static int a(int param0, byte param1, int param2) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = 0;
        int var4 = -83 % ((15 - param1) / 62);
        while (0 < param0) {
            var3 = param2 & 1 | var3 << -1784077215;
            param2 = param2 >>> 1;
            param0--;
        }
        return var3;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            int discarded$0 = jo.a(68, (byte) 21, -121);
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_d = "Lesson 1 of 7<br><br>Learn the basics of throwing fire in a safe and secure environment.<br><br>Use the Fire Ball spell to destroy all three targets.<br><br><br>* How to look around *<br>* Selecting a spell *<br>* Shooting spells *<br>* Use of accuracy *";
    }
}
