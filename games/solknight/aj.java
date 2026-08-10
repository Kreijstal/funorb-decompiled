/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    j field_h;
    mg field_k;
    static int[] field_o;
    int field_e;
    static byte[] field_t;
    int field_b;
    int field_q;
    j field_i;
    static int[] field_m;
    j field_r;
    static String[] field_s;
    private boolean field_c;
    private int field_l;
    j field_a;
    int field_d;
    static int field_p;
    int field_f;
    static int field_u;
    int field_j;
    int field_n;
    j field_g;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 1) {
            return;
        }
        mi.a(param6, param0, param2, param5, param3, param1);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_j + this.field_d;
              var6 = this.field_e - -this.field_q;
              var7 = this.field_f;
              if (0 != (var7 ^ -1)) {
                break L1;
              } else {
                var7 = this.field_k.field_s + this.field_k.field_F;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = mi.field_a >> -1653419774;
                var9 = this.field_k.b(param1);
                var10 = this.field_k.field_F + this.field_k.field_s;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (0 == (param1.indexOf("<br>") ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != kb.field_c) {
                  break L4;
                } else {
                  kb.field_c = new String[16];
                  break L4;
                }
              }
              L5: {
                if (var8 < var9) {
                  var13 = var9 / var8;
                  var12 = var8 + 2 * ((-1 + (var9 % var8 - -var13)) / var13);
                  break L5;
                } else {
                  var12 = var8;
                  break L5;
                }
              }
              var11 = this.field_k.a(param1, new int[]{var12}, kb.field_c);
              var9 = 0;
              var10 = var10 + var7 * (var11 - 1);
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  var14 = this.field_k.b(kb.field_c[var13]);
                  if ((var9 ^ -1) > (var14 ^ -1)) {
                    var9 = var14;
                    var13++;
                    continue L6;
                  } else {
                    var13++;
                    continue L6;
                  }
                }
              }
            }
            L7: {
              var12 = param2;
              if (var5_int + (var9 + var12) <= mi.field_a) {
                break L7;
              } else {
                var12 = -var9 + mi.field_a + -var5_int;
                break L7;
              }
            }
            L8: {
              if (param3 == 5101) {
                break L8;
              } else {
                field_m = (int[]) null;
                break L8;
              }
            }
            L9: {
              var13 = -this.field_k.field_m + param0 - -32;
              if (mi.field_d < var13 - (-var10 - var6)) {
                var13 = -var6 + (param0 - var10);
                break L9;
              } else {
                break L9;
              }
            }
            mi.g(var12, var13, var9 - -var5_int, var10 - -var6, this.field_b);
            mi.b(1 + var12, 1 + var13, var5_int + (var9 - 2), -2 + (var6 + var10), this.field_n);
            this.field_k.a(param1, var12 - -this.field_j, this.field_e + var13, var9, var10, this.field_l, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("aj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_k.b(param2);
              var6 = this.field_k.field_m - -this.field_k.field_s;
              var7 = param3;
              if (mi.field_a < var7 + (var5_int + 6)) {
                var7 = -6 + -var5_int + mi.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = -this.field_k.field_m + (param1 - -32);
              if (var8 + (var6 - -6) > mi.field_d) {
                var8 = -var6 + mi.field_d + -6;
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 <= -99) {
              mi.g(var7, var8, 6 + var5_int, var6 - -6, this.field_l);
              mi.b(var7 + 1, 1 + var8, var5_int - -4, 4 + var6, this.field_n);
              this.field_k.c(param2, var7 + 3, this.field_k.field_m + var8 + 3, this.field_l, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("aj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = 4 / ((-41 - param0) / 55);
              if (this.field_c) {
                this.a(param1, param3, param2, 5101);
                break L1;
              } else {
                this.a((byte) -123, param1, param3, param2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("aj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 126 % ((param0 - 40) / 51);
        mi.e(param3, param1, param5, param2, param4);
    }

    final void a(int param0, mg param1) {
        af var18 = null;
        ql var4 = null;
        o[] var5 = null;
        ui var17 = null;
        ui var19 = null;
        int var7_int = 0;
        ql var6 = null;
        ql var7 = null;
        we discarded$0 = null;
        sj discarded$1 = null;
        ql var8 = null;
        o[] var9 = null;
        o[] var10 = null;
        o dupTemp$2 = null;
        ql var11 = null;
        ql var12 = null;
        o var13 = null;
        ql var14 = null;
        ql var20 = null;
        int var15 = SolKnight.field_L ? 1 : 0;
        try {
            var18 = new af(param1, 2, 2, 2236962, 1, 1, 1, param1.field_s + param1.field_F + 2);
            this.field_a = (j) ((Object) var18);
            var18.field_o = 16777215;
            var4 = new ql();
            var18.a(var4, 6935);
            if (param0 <= 59) {
                String var16 = (String) null;
                this.a(-106, 26, -13, (String) null);
            }
            this.field_k = param1;
            this.field_f = -1;
            this.field_n = 5592405;
            var4.field_e = 11711154;
            this.field_j = 3;
            var4.field_m = 15658734;
            this.field_b = 15658734;
            this.field_e = 3;
            this.field_d = 3;
            this.field_q = 3;
            this.field_l = 15658734;
            var4.a((byte) -80, 0).d(-126, 15658734).a(mb.a(8947848, 10066329, 120, 7829367), (byte) 119);
            var4.a((byte) -68, 1).a(mb.a(11184810, 10066329, 114, 13421772), (byte) 119);
            var4.a((byte) -39, 3).a(mb.a(8947848, 7829367, 93, 10066329), (byte) 119).b(1, -119).a(1, (byte) 85);
            var5 = new o[9];
            var17 = new ui(32, 32);
            var19 = var17;
            for (var7_int = 0; var7_int < var19.field_v.length; var7_int++) {
                var17.field_v[var7_int] = 1077952576;
            }
            var5[4] = (o) ((Object) var19);
            var4.a((byte) -85, 4).a(0, true).a(var5, (byte) 119);
            var4.a((byte) -38, 5).a(je.a(0, (byte) -124, 65793, 0, 0), (byte) 119).a(0, true).d(-123, -1);
            this.field_i = (j) ((Object) var4);
            var6 = new ql(var4, true);
            var6.field_g = 0;
            var7 = new ql(var4, true);
            var7.field_g = 0;
            var7.a((byte) -94, ha.a(8947848, 118));
            var7.a((byte) -80, 1).a(ha.a(11184810, -96), (byte) 119).d(-128, 2236962);
            this.field_r = (j) ((Object) new td(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new we(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new sj(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new ql();
            var18.a(var8, 6935);
            var8.a((byte) -56, 0).a(mb.a(15658734, 7829367, 126, 10066329), (byte) 119).d(-120, 1118481).a(-1, 256);
            var8.a((byte) -85, 4).a(0, true).a(var5, (byte) 119);
            this.field_h = (j) ((Object) var8);
            var9 = new o[9];
            var9[4] = new o(2, 1);
            var10 = new o[9];
            var10[4] = new o(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_v = new int[]{6710886, 7829367};
            var10[4].field_v = new int[]{6710886, 7829367};
            var11 = new ql();
            var12 = new ql();
            var11.a((byte) -60, 0, var9);
            var12.a((byte) -60, 0, var10);
            var13 = new o(7, 4);
            var13.field_v = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new ql(var4, true);
            var14.a((byte) 103, var13.c());
            var13.e();
            var14 = new ql(var4, true);
            var14.a((byte) -93, var13.c());
            var13.e();
            var14 = new ql(var4, true);
            var14.a((byte) -86, var13.c());
            var13.e();
            var20 = new ql(var4, true);
            var20.a((byte) 94, var13);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "aj.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_s = null;
        field_m = null;
        field_t = null;
        if (param0 > -5) {
            field_o = (int[]) null;
        }
        field_o = null;
    }

    public aj() {
        this.field_c = true;
    }

    static {
        field_o = new int[8192];
        field_m = new int[12];
        field_s = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = new byte[520];
    }
}
