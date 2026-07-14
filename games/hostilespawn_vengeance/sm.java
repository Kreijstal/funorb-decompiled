/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sm {
    static int field_g;
    int[] field_f;
    int field_e;
    static bd field_h;
    java.awt.Image field_c;
    static String field_a;
    static bd field_d;
    static bd field_i;
    int field_b;

    abstract void a(int param0, byte param1, int param2, java.awt.Graphics param3);

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    final void b(byte param0) {
        si.a(((sm) this).field_f, ((sm) this).field_b, ((sm) this).field_e);
        int var2 = -15 % ((param0 - 49) / 57);
    }

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        field_i = null;
        if (param0 != -102) {
            return;
        }
        field_d = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == -11003) {
            break L0;
          } else {
            sm.a((byte) 109);
            break L0;
          }
        }
        L1: {
          if (qi.field_J < param2) {
            qi.field_J = param2;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var3 = 366;
          var4 = 614;
          si.c(var4 + 4, 70 + var3, 12, 12, 0);
          if (-1 > (param1 ^ -1)) {
            L3: {
              if (param1 * 4 >= param2) {
                if (param2 <= param1 * 2) {
                  stackOut_11_0 = 128;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 64;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              } else {
                stackOut_8_0 = 32;
                stackIn_12_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_12_0;
              var6 = var5 + -1 & sg.field_i;
              if (var5 / 2 <= var6) {
                var6 = var5 - var6;
                break L4;
              } else {
                break L4;
              }
            }
            si.a(var4 - -4, 70 + var3, 12, 12, 16776960, var6 * 256 / var5);
            break L2;
          } else {
            break L2;
          }
        }
        HostileSpawn.field_J[0].e(var4, var3);
        var5 = var3 + 64;
        var6 = param2;
        var7 = var3;
        L5: while (true) {
          if (var7 <= -var6 + var5) {
            L6: {
              var7 = var7 - HostileSpawn.field_J[2].field_A;
              if (param1 <= param2) {
                break L6;
              } else {
                param1 = param2;
                break L6;
              }
            }
            HostileSpawn.field_J[2].e(var4, var7);
            si.a(7 + var4, 1 + var5 - param1, 6, param1, 16776960, 128);
            return;
          } else {
            var7 = var7 - HostileSpawn.field_J[1].field_A;
            HostileSpawn.field_J[1].e(var4, var7);
            continue L5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Find the console that activates the lift.";
    }
}
