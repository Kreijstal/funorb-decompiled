/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends hk {
    private dg field_F;
    static od field_I;
    private int field_G;
    static boolean field_H;
    static int field_E;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (!(-1 != (param0 ^ -1))) {
            return 0;
        }
        if (!(param0 >= -1)) {
            var2 = 1;
            if (param0 > 65535) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (-256 < param0) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (!(param0 <= 15)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (-4 > param0) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (!(-2 >= param0)) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!((param0 ^ -1) <= 65535)) {
            var2 += 16;
            param0 = param0 >> 16;
        }
        if ((param0 ^ -1) > 255) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (param1 != 66) {
            field_H = true;
        }
        if (-16 > param0) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (param0 < -4) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (-2 > param0) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    public static void f(int param0) {
        if (param0 > -114) {
            Object var2 = null;
            StringBuilder discarded$0 = td.a((CharSequence) null, (StringBuilder) null, -1, -77);
        }
        field_I = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        lh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dm var13 = null;
        dm var14 = null;
        dm var15 = null;
        var12 = Geoblox.field_C;
        super.a(param0, param1, (byte) -86, param3);
        if (0 == param3) {
          L0: {
            L1: {
              var5 = (((td) this).field_r >> -649339007) + (((td) this).field_v + param0);
              var7 = -74 % ((param2 - 1) / 43);
              var6 = param1 - (-((td) this).field_m - (((td) this).field_h >> -471639295));
              var9 = ((td) this).field_F.a((byte) -105);
              if (var9 == bf.field_g) {
                break L1;
              } else {
                if (si.field_n != var9) {
                  if (si.field_m != var9) {
                    if (var9 == kk.field_w) {
                      var15 = oa.field_e[1];
                      var15.c(-(var15.field_r >> -1719863487) + var5, var6 - (var15.field_m >> 2009440097), 256);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    var14 = oa.field_e[2];
                    var14.c(-(var14.field_r >> 1489383873) + var5, var6 - (var14.field_m >> -2129057855), 256);
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var13 = oa.field_e[0];
                var10 = var13.field_s << 1539250049;
                var11 = var13.field_o << 1598652321;
                if (null == da.field_b) {
                  break L3;
                } else {
                  if (var10 > da.field_b.field_r) {
                    break L3;
                  } else {
                    if (var11 > da.field_b.field_m) {
                      break L3;
                    } else {
                      Geoblox.a(1, da.field_b);
                      vb.c();
                      break L2;
                    }
                  }
                }
              }
              da.field_b = new dm(var10, var11);
              Geoblox.a(1, da.field_b);
              break L2;
            }
            var13.a(112, 144, var13.field_s << -972988668, var13.field_o << -1953583196, -((td) this).field_G << -867460086, 4096);
            id.a(true);
            da.field_b.c(-var13.field_s + var5, var6 - var13.field_o, 256);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, gd param1) {
        if (param0 != -348) {
            Object var3 = null;
            td.a(-67, (gd) null);
        }
        ja.a(false, kl.a(param1, 100, 96));
    }

    final static StringBuilder a(CharSequence param0, StringBuilder param1, int param2, int param3) {
        int var7 = 0;
        int var8 = Geoblox.field_C;
        if (param3 <= 23) {
            Object var9 = null;
            td.a(-80, (gd) null);
        }
        int var4 = param1.length();
        if ((param2 ^ -1) <= -1) {
            // if_icmplt L48
        } else {
            throw new StringIndexOutOfBoundsException("length=" + var4 + " startPos=" + param2);
        }
        int var5 = param0.length();
        if (-1 == (var5 ^ -1)) {
            return param1;
        }
        int var6 = param2 - -var5;
        if (!(var4 >= var6)) {
            param1.setLength(var6);
        }
        for (var7 = 0; var7 < var5; var7++) {
            param2++;
            param1.setCharAt(param2, param0.charAt(var7));
        }
        return param1;
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        ((td) this).field_G = ((td) this).field_G + 1;
        super.a(param0, param1, param2, param3);
    }

    final static void g(byte param0) {
        int var1 = -28 % ((param0 - 36) / 43);
        if (gb.field_f != -uf.field_a + 0) {
            if (250 - uf.field_a == gb.field_f) {
            }
        }
        gb.field_f = gb.field_f + 1;
    }

    final boolean a(byte param0, el param1) {
        if (param0 > -30) {
            ((td) this).a(89, -88, (byte) -40, -90);
        }
        return false;
    }

    final static void a(byte param0) {
        if (param0 != -93) {
            return;
        }
        md.field_a.a(ue.field_f, (byte) -70);
    }

    td(dg param0) {
        ((td) this).field_F = param0;
    }

    final String c(byte param0) {
        if (param0 != 69) {
            return null;
        }
        if (!(!((td) this).field_l)) {
            return ((td) this).field_F.c(-21666);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new od("");
    }
}
