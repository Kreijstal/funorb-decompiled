/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends be {
    int[] field_C;
    String field_H;
    static String[] field_z;
    char[] field_G;
    static int field_B;
    boolean field_D;
    int[] field_E;
    static int field_A;
    char[] field_y;
    static int field_F;

    final static void f(byte param0) {
        if (param0 > -68) {
            ac.f((byte) 55);
        }
        kk.field_n = 0;
        cg.a(true);
    }

    final static ck[] a(int param0, String param1, String param2, ji param3) {
        int var4 = param3.b(-1, param1);
        int var5 = param3.a(var4, 13030, param2);
        if (param0 != 0) {
            ac.g((byte) 24);
        }
        return si.a(var5, var4, param3, (byte) -46);
    }

    final void a(byte param0, wl param1) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        if (param0 != -4) {
            ((ac) this).field_H = null;
        }
        while (true) {
            var3 = param1.d((byte) -60);
            if (var3 == 0) {
                break;
            }
            this.a(var3, param1, -127);
        }
    }

    public static void g(byte param0) {
        if (param0 != -17) {
            ac.g((byte) -64);
        }
        field_z = null;
    }

    private final void a(int param0, wl param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char stackIn_7_2 = 0;
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
        char[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char stackOut_6_2 = 0;
        char[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        char stackOut_5_2 = 0;
        L0: {
          var7 = client.field_A ? 1 : 0;
          if (param0 == 1) {
            ((ac) this).field_H = param1.c((byte) -38);
            break L0;
          } else {
            if (-3 != (param0 ^ -1)) {
              if (3 == param0) {
                var4 = param1.d((byte) -37);
                ((ac) this).field_E = new int[var4];
                ((ac) this).field_y = new char[var4];
                var5 = 0;
                L1: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    L2: {
                      ((ac) this).field_E[var5] = param1.e(3);
                      var6 = param1.g((byte) -107);
                      stackOut_13_0 = ((ac) this).field_y;
                      stackOut_13_1 = var5;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (-1 == (var6 ^ -1)) {
                        stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = (char)0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L2;
                      } else {
                        stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = jb.a((byte) var6, (byte) 88);
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L2;
                      }
                    }
                    stackIn_16_0[stackIn_16_1] = stackIn_16_2;
                    var5++;
                    continue L1;
                  }
                }
              } else {
                if (-5 != (param0 ^ -1)) {
                  break L0;
                } else {
                  ((ac) this).field_D = true;
                  break L0;
                }
              }
            } else {
              var4 = param1.d((byte) -47);
              ((ac) this).field_G = new char[var4];
              ((ac) this).field_C = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  L4: {
                    ((ac) this).field_C[var5] = param1.e(3);
                    var6 = param1.g((byte) -99);
                    stackOut_4_0 = ((ac) this).field_G;
                    stackOut_4_1 = var5;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (0 == var6) {
                      stackOut_6_0 = (char[]) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = (char)0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L4;
                    } else {
                      stackOut_5_0 = (char[]) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = jb.a((byte) var6, (byte) 78);
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L4;
                    }
                  }
                  stackIn_7_0[stackIn_7_1] = stackIn_7_2;
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
        var4 = 8 % ((2 - param2) / 44);
    }

    final void c(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = client.field_A ? 1 : 0;
        if (param0 != -1) {
            return;
        }
        if (!(((ac) this).field_E == null)) {
            for (var2 = 0; var2 < ((ac) this).field_E.length; var2++) {
                ((ac) this).field_E[var2] = de.b(((ac) this).field_E[var2], 32768);
            }
        }
        if (((ac) this).field_C != null) {
            var4 = 0;
            var2 = var4;
            while (var4 < ((ac) this).field_C.length) {
                ((ac) this).field_C[var4] = de.b(((ac) this).field_C[var4], 32768);
                var4++;
            }
        }
    }

    ac() {
        ((ac) this).field_D = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new String[]{"Master Challenge: prove your prowess", "Unlock 4 more vibrant and varied themes", "Large bucket: grow shapes to the limit", "Use special items in multiplayer...", "...to turn things around spectacularly!", "Loads of extra Achievements", null, null};
        field_B = 480;
    }
}
