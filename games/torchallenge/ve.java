/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static ka[] field_b;
    static wl field_a;
    static sl field_c;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (param0 > 49) {
          if (0 == param1) {
            var3 = sh.field_r;
          } else {
            if (1 != param1) {
              return;
            }
            var3 = nk.field_h;
          }
          if (param2 * 7 >> 3 <= var3) {
            if (0 == param1) {
              vk.a(param2, (byte) 87);
              return;
            }
            if (1 != param1) {
              return;
            }
            nb.b(param2, -1);
            return;
          }
          var4 = var3 % (param2 >> 3);
          var5 = (param2 >> 3) + (var3 - var4);
          var6 = -(param2 >> 3 << 3) + param2;
          if (var6 >= param2 - var5) {
            var5 = param2;
          }
          if (0 == param1) {
            vk.a(var5, (byte) 106);
            return;
          }
          if (param1 != 1) {
            return;
          }
          nb.b(var5, -1);
          return;
        }
        ve.a(34, 8, 89);
        if (0 == param1) {
          var3Lifetime1 = sh.field_r;
          if (param2 * 7 >> 3 <= var3Lifetime1) {
            if (0 == param1) {
              vk.a(param2, (byte) 87);
              return;
            }
            if (1 != param1) {
              return;
            }
            nb.b(param2, -1);
            return;
          }
          var4Lifetime1 = var3Lifetime1 % (param2 >> 3);
          var5Lifetime1 = (param2 >> 3) + (var3Lifetime1 - var4Lifetime1);
          var6Lifetime1 = -(param2 >> 3 << 3) + param2;
          if (var6Lifetime1 >= param2 - var5Lifetime1) {
            var5Lifetime1 = param2;
          }
          if (0 == param1) {
            vk.a(var5Lifetime1, (byte) 106);
            return;
          }
          if (param1 != 1) {
            return;
          }
          nb.b(var5Lifetime1, -1);
          return;
        }
        if (1 != param1) {
          return;
        }
        var3Lifetime2 = nk.field_h;
        if (param2 * 7 >> 3 <= var3Lifetime2) {
          if (0 == param1) {
            vk.a(param2, (byte) 87);
            return;
          }
          if (1 != param1) {
            return;
          }
          nb.b(param2, -1);
          return;
        }
        var4Lifetime2 = var3Lifetime2 % (param2 >> 3);
        var5Lifetime2 = (param2 >> 3) + (var3Lifetime2 - var4Lifetime2);
        var6Lifetime2 = -(param2 >> 3 << 3) + param2;
        if (var6Lifetime2 >= param2 - var5Lifetime2) {
          var5Lifetime2 = param2;
        }
        if (0 == param1) {
          vk.a(var5Lifetime2, (byte) 106);
          return;
        }
        if (param1 != 1) {
          return;
        }
        nb.b(var5Lifetime2, -1);
        return;
    }

    public static void a(int param0) {
        int var1 = 26 % ((-23 - param0) / 43);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_c = new sl();
    }
}
