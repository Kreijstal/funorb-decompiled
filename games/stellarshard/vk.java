/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vk {
    static int field_b;
    uj[] field_a;
    static cg field_d;
    static String field_c;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, byte param5, int param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = stellarshard.field_B;
        while (true) {
            param8--;
            if (param8 < 0) {
                break;
            }
            var17 = param4;
            var10 = var17;
            var11 = param6;
            var12 = param7;
            var13 = param0;
            var14 = param2;
            var15 = (var17[var11] & 16711422) >> -1968481535;
            var10[var11] = var15 + ((sa.a(var13, 33423701) >> -1640011927) + (sa.a(var12, 33423361) >> 1247872321) + (sa.a(33520910, var14) >> -1728532623));
            param2 = param2 + param1;
            param7 = param7 + param9;
            param0 = param0 + param3;
            param6++;
        }
        if (param5 < 44) {
            vk.a((byte) -20);
        }
    }

    final int b(int param0, int param1) {
        int var4 = 0;
        uj var5 = null;
        int var6 = stellarshard.field_B;
        uj[] var7 = ((vk) this).field_a;
        uj[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5.field_a.length <= param0)) {
                return var5.field_a[param0];
            }
            param0 = param0 - (var5.field_a.length + -1);
        }
        var4 = -13 % ((param1 - -80) / 45);
        return 0;
    }

    final int a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 17201) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((vk) this).field_a) {
              break L2;
            } else {
              if (-1 > (((vk) this).field_a.length ^ -1)) {
                stackOut_6_0 = ((vk) this).field_a[((vk) this).field_a.length - 1].field_c - ((vk) this).field_a[0].field_b;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(String param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = stellarshard.field_B;
        var5 = 0;
        var6 = param1 ? 1 : 0;
        var7 = param0.length();
        var8 = 0;
        L0: while (true) {
          if (var7 <= var8) {
            if (var5 <= 0) {
              return 0;
            } else {
              return (param2 - param3 << 1616124776) / var5;
            }
          } else {
            var9 = param0.charAt(var8);
            if (var9 != 60) {
              if (62 != var9) {
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
            } else {
              var6 = 1;
              var8++;
              continue L0;
            }
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        uj var4 = null;
        int var5 = stellarshard.field_B;
        if (param0 <= 47) {
            return 15;
        }
        for (var3 = 0; ((vk) this).field_a.length > var3; var3++) {
            var4 = ((vk) this).field_a[var3];
            if (var4.field_a.length > param1) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_a.length);
        }
        return ((vk) this).field_a.length;
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        uj var6 = null;
        int var7 = 0;
        int var8 = stellarshard.field_B;
        if (null != ((vk) this).field_a) {
            // if_icmpeq L40
            // if_icmpgt L40
        } else {
            return -1;
        }
        if (param2 > ((vk) this).field_a[((vk) this).field_a.length + -1].field_c) {
            return -1;
        }
        if (!(-2 != (((vk) this).field_a.length ^ -1))) {
            return ((vk) this).field_a[0].a(param0, (byte) -127);
        }
        int var4 = 0;
        if (param1 != -53) {
            return -68;
        }
        for (var5 = 0; var5 < ((vk) this).field_a.length; var5++) {
            var6 = ((vk) this).field_a[var5];
            if (var6.field_b <= param2) {
                if (!(param2 > var6.field_c)) {
                    var7 = var6.a(param0, (byte) -125);
                    if (!(-1 != var7)) {
                        return -1;
                    }
                    return var4 - -var7;
                }
            }
            var4 = var4 + (var6.field_a.length + -1);
        }
        return -1;
    }

    final int a(boolean param0) {
        int var2 = 0;
        uj[] var3 = null;
        int var4 = 0;
        uj var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = stellarshard.field_B;
          if (!param0) {
            break L0;
          } else {
            var8 = null;
            vk.a(67, 4, 37, 82, (int[]) null, (byte) 83, 103, -77, 12, -12);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null != ((vk) this).field_a) {
            var3 = ((vk) this).field_a;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(83);
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

    final static void a(byte param0, boolean param1) {
        al.field_f.a(param1, true);
        int var2 = 101 % ((param0 - -86) / 33);
    }

    final static void a(byte param0, int param1) {
        int var3 = stellarshard.field_B;
        nf var4 = (nf) (Object) wb.field_f.b(-77);
        while (var4 != null) {
            ea.a(param1, var4, (byte) 80);
            var4 = (nf) (Object) wb.field_f.b((byte) 120);
        }
        if (param0 >= -104) {
            vk.a((byte) -101, false);
        }
        hk var5 = (hk) (Object) id.field_g.b(-91);
        while (var5 != null) {
            pd.a(param1, var5, 77);
            var5 = (hk) (Object) id.field_g.b((byte) -121);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 < 103) {
            vk.a((byte) 93);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_d = new cg();
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
