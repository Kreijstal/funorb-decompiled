/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uj {
    static ei field_a;
    static o[] field_b;
    kp[] field_c;

    final static void a(String param0, int param1, String param2) {
        if (gn.field_m != null) {
            gn.field_m.b(true);
        }
        un.field_k = new pe(param2, param0, false, true, true);
        hb.field_x.c((gm) (Object) un.field_k, param1 + 32115);
        if (param1 != -32082) {
            uj.a((byte) 16);
        }
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        kp var5 = null;
        int var6 = Torquing.field_u;
        kp[] var7 = ((uj) this).field_c;
        kp[] var3 = var7;
        if (param1 > -104) {
            return 123;
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(param0 >= var5.field_b.length)) {
                return var5.field_b[param0];
            }
            param0 = param0 - (var5.field_b.length - 1);
        }
        return 0;
    }

    final int b(int param0, byte param1) {
        kp var4 = null;
        int var5 = Torquing.field_u;
        int var3 = 0;
        if (param1 != 110) {
            return 110;
        }
        while (((uj) this).field_c.length > var3) {
            var4 = ((uj) this).field_c[var3];
            if (param0 < var4.field_b.length) {
                return var3;
            }
            param0 = param0 - (-1 + var4.field_b.length);
            var3++;
        }
        return ((uj) this).field_c.length;
    }

    final static int a(da param0, byte param1, da param2) {
        if (param1 != 75) {
            Object var4 = null;
            int discarded$0 = uj.a((da) null, (byte) 17, (da) null);
        }
        Object var5 = null;
        return na.a(param2, (String) null, -25978, param0, 0, false, 0);
    }

    final int b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((uj) this).field_c = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((uj) this).field_c == null) {
              break L2;
            } else {
              if (-1 <= (((uj) this).field_c.length ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = -((uj) this).field_c[0].field_c + ((uj) this).field_c[-1 + ((uj) this).field_c.length].field_a;
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

    final int a(int param0, int param1, String param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Torquing.field_u;
          if (param0 < -107) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var5 = 0;
        var6 = 0;
        var7 = param2.length();
        var8 = 0;
        L1: while (true) {
          if (var8 >= var7) {
            if ((var5 ^ -1) >= -1) {
              return 0;
            } else {
              return (-param1 + param3 << 1003063048) / var5;
            }
          } else {
            var9 = param2.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
              var8++;
              continue L1;
            } else {
              if (62 != var9) {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              } else {
                var6 = 0;
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    final int a(boolean param0) {
        int var2 = 0;
        kp[] var3 = null;
        int var4 = 0;
        kp var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Torquing.field_u;
          if (param0) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (((uj) this).field_c == null) {
            break L1;
          } else {
            var3 = ((uj) this).field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) 115);
                  if (var6 > var2) {
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
          }
        }
        return var2;
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        kp var6 = null;
        int var7 = 0;
        int var8 = Torquing.field_u;
        if (((uj) this).field_c != null) {
            // if_icmpeq L37
            // if_icmpgt L37
        } else {
            return -1;
        }
        if (!(((uj) this).field_c[-1 + ((uj) this).field_c.length].field_a >= param0)) {
            return -1;
        }
        if (!((((uj) this).field_c.length ^ -1) != -2)) {
            return ((uj) this).field_c[0].a((byte) -64, param2);
        }
        int var4 = 0;
        if (param1 > -14) {
            int discarded$0 = ((uj) this).a(-4, (byte) 109);
        }
        for (var5 = 0; var5 < ((uj) this).field_c.length; var5++) {
            var6 = ((uj) this).field_c[var5];
            if (var6.field_c <= param0) {
                if (!(var6.field_a < param0)) {
                    var7 = var6.a((byte) -64, param2);
                    if ((var7 ^ -1) == 0) {
                        return -1;
                    }
                    return var4 - -var7;
                }
            }
            var4 = var4 + (var6.field_b.length - 1);
        }
        return -1;
    }

    public static void a(byte param0) {
        if (param0 != -54) {
            uj.a((byte) -113);
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ei();
    }
}
