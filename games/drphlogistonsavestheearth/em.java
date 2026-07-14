/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class em {
    static boolean field_b;
    mi[] field_a;
    static int field_e;
    static int field_d;
    static boolean field_c;

    final int a(int param0) {
        int var2 = 0;
        mi[] var3 = null;
        int var4 = 0;
        mi var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = -1;
          if (param0 == -17287) {
            break L0;
          } else {
            int discarded$2 = ((em) this).a(9, -34, -21);
            break L0;
          }
        }
        L1: {
          if (((em) this).field_a != null) {
            var3 = ((em) this).field_a;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) 112);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        mi var6 = null;
        int var7 = 0;
        int var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null != ((em) this).field_a) {
            // if_icmpeq L38
            // if_icmpgt L38
        } else {
            return -1;
        }
        if (param2 > ((em) this).field_a[((em) this).field_a.length + -1].field_b) {
            return -1;
        }
        if ((((em) this).field_a.length ^ -1) == -2) {
            return ((em) this).field_a[0].a(-21878, param0);
        }
        int var4 = param1;
        for (var5 = 0; var5 < ((em) this).field_a.length; var5++) {
            var6 = ((em) this).field_a[var5];
            if (param2 >= var6.field_e) {
                if (!(param2 > var6.field_b)) {
                    var7 = var6.a(-21878, param0);
                    if (!((var7 ^ -1) != 0)) {
                        return -1;
                    }
                    return var4 - -var7;
                }
            }
            var4 = var4 + (-1 + var6.field_a.length);
        }
        return -1;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        mi var4 = null;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var3 = 0; ((em) this).field_a.length > var3; var3++) {
            var4 = ((em) this).field_a[var3];
            if (param0 < var4.field_a.length) {
                return var3;
            }
            param0 = param0 - (-1 + var4.field_a.length);
        }
        if (param1 != -12280) {
            int discarded$0 = ((em) this).a(-67, -51);
        }
        return ((em) this).field_a.length;
    }

    final int a(int param0, int param1) {
        int var5 = 0;
        mi var6 = null;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var3 = 58 / ((19 - param0) / 48);
        mi[] var4 = ((em) this).field_a;
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            if (var6.field_a.length > param1) {
                return var6.field_a[param1];
            }
            param1 = param1 - (var6.field_a.length - 1);
        }
        return 0;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var5 = 0;
        var6 = 0;
        var7 = param1.length();
        var8 = 0;
        L0: while (true) {
          if (var8 >= var7) {
            if (var5 > param3) {
              return (-param2 + param0 << -217207480) / var5;
            } else {
              return 0;
            }
          } else {
            var9 = param1.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
              var8++;
              continue L0;
            } else {
              if (var9 != 62) {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var6 = 0;
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 20111) {
            break L0;
          } else {
            field_e = -56;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((em) this).field_a == null) {
              break L2;
            } else {
              if (((em) this).field_a.length <= 0) {
                break L2;
              } else {
                stackOut_4_0 = -((em) this).field_a[0].field_e + ((em) this).field_a[((em) this).field_a.length - 1].field_b;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 64;
        field_c = false;
        field_d = 100;
    }
}
