/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    private boolean field_o;
    static String[] field_p;
    static java.awt.Image field_j;
    int field_t;
    int field_w;
    int field_n;
    int field_g;
    static String field_m;
    static String field_s;
    static int field_q;
    static int field_l;
    int field_d;
    qk field_c;
    int field_a;
    mi field_v;
    qk field_x;
    qk field_h;
    static String field_i;
    int field_b;
    qk field_u;
    static wg field_e;
    private int field_k;
    static ul field_r;
    qk field_f;

    final void a(int param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_o) {
                this.a(param1, param0, (byte) -22, param2);
                break L1;
              } else {
                this.a((byte) 102, param2, param0, param1);
                break L1;
              }
            }
            if (param3 == 15658734) {
              break L0;
            } else {
              this.field_k = -127;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ll.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        pb.c(param2, param6, param0, param3, param5, param4);
        if (param1 != 5939) {
            field_i = (String) null;
        }
    }

    private final void a(byte param0, int param1, int param2, String param3) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
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
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var5_int = this.field_g + this.field_d;
              var6 = this.field_w + this.field_a;
              var7 = this.field_b;
              if ((var7 ^ -1) != 0) {
                break L1;
              } else {
                var7 = this.field_v.field_F + this.field_v.field_G;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = pb.field_c >> -198527966;
                var9 = this.field_v.c(param3);
                var10 = this.field_v.field_G + this.field_v.field_F;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if ((param3.indexOf("<br>") ^ -1) == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (t.field_b == null) {
                  t.field_b = new String[16];
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var9 > var8) {
                  var13 = var9 / var8;
                  var12 = (-1 + var13 + var9 % var8) / var13 * 2 + var8;
                  break L5;
                } else {
                  var12 = var8;
                  break L5;
                }
              }
              var11 = this.field_v.a(param3, new int[]{var12}, t.field_b);
              var10 = var10 + (var11 + -1) * var7;
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = this.field_v.c(t.field_b[var13]);
                    if (var9 < var14) {
                      var9 = var14;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var13++;
                  continue L6;
                }
              }
            }
            L8: {
              var12 = param2;
              if (pb.field_c < var5_int + (var12 - -var9)) {
                var12 = -var9 + (pb.field_c - var5_int);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + (param1 - this.field_v.field_U);
              if (var10 + (var13 + var6) <= pb.field_j) {
                break L9;
              } else {
                var13 = -var6 + -var10 + param1;
                break L9;
              }
            }
            pb.h(var12, var13, var5_int + var9, var10 - -var6, this.field_t);
            pb.a(1 + var12, var13 + 1, -2 + var5_int + var9, var10 + (var6 - 2), this.field_n);
            this.field_v.a(param3, this.field_g + var12, this.field_a + var13, var9, var10, this.field_k, -1, 0, 0, var7);
            if (param0 == 102) {
              break L0;
            } else {
              field_j = (java.awt.Image) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("ll.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    private final void a(String param0, int param1, byte param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
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
              var5_int = this.field_v.c(param0);
              var6 = this.field_v.field_U - -this.field_v.field_F;
              var7 = param1;
              if (var7 + var5_int + 6 <= pb.field_c) {
                break L1;
              } else {
                var7 = -6 + (-var5_int + pb.field_c);
                break L1;
              }
            }
            L2: {
              var8 = -this.field_v.field_U + param3 + 32;
              if (var8 - -var6 + 6 > pb.field_j) {
                var8 = -var6 + pb.field_j + -6;
                break L2;
              } else {
                break L2;
              }
            }
            if (param2 == -22) {
              pb.h(var7, var8, 6 + var5_int, 6 + var6, this.field_k);
              pb.a(var7 - -1, var8 - -1, var5_int - -4, var6 + 4, this.field_n);
              this.field_v.b(param0, var7 - -3, this.field_v.field_U + var8 - -3, this.field_k, -1);
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
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ll.F(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, mi param1) {
        int var7_int = 0;
        wa var19 = null;
        int var15 = SteelSentinels.field_G;
        cn var17 = new cn(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_G - -param1.field_F));
        this.field_h = (qk) ((Object) var17);
        var17.field_k = 16777215;
        wa var4 = new wa();
        var17.a(var4, -3);
        this.field_v = param1;
        var4.field_e = 15658734;
        this.field_d = 3;
        this.field_w = 3;
        this.field_t = 15658734;
        this.field_n = 5592405;
        this.field_b = -1;
        this.field_k = 15658734;
        this.field_a = 3;
        this.field_g = 3;
        var4.field_c = 11711154;
        var4.a(-25088, 0).a((byte) -107, 15658734).a(1, al.a(8947848, (byte) 112, 7829367, 10066329));
        var4.a(-25088, 1).a(1, al.a(11184810, (byte) 123, 13421772, 10066329));
        var4.a(-25088, 3).a(1, al.a(8947848, (byte) 116, 10066329, 7829367)).a(true, 1).a(1, 120);
        wk[] var5 = new wk[9];
        ek var16 = new ek(32, 32);
        ek var18 = var16;
        for (var7_int = 0; var18.field_E.length > var7_int; var7_int++) {
            var16.field_E[var7_int] = 1077952576;
        }
        var5[4] = (wk) ((Object) var18);
        var4.a(-25088, 4).a(true, (byte) 125).a(1, var5);
        var4.a(-25088, 5).a(1, hf.a(0, 65793, 0, 0, true)).a(true, (byte) 126).a((byte) -118, -1);
        this.field_f = (qk) ((Object) var4);
        wa var6 = new wa(var4, true);
        var6.field_a = 0;
        wa var7 = new wa(var4, true);
        var7.field_a = 0;
        var7.a(false, sl.a(8947848, 2));
        var7.a(-25088, 1).a(1, sl.a(11184810, 2)).a((byte) -120, 2236962);
        this.field_x = (qk) ((Object) new pf(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
        b discarded$0 = new b(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        qg discarded$1 = new qg(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        wa var8 = new wa();
        var17.a(var8, -3);
        var8.a(-25088, 0).a(1, al.a(15658734, (byte) 118, 10066329, 7829367)).a((byte) -96, 1118481).b(1, -1);
        var8.a(-25088, 4).a(true, (byte) 125).a(1, var5);
        this.field_c = (qk) ((Object) var8);
        wk[] var9 = new wk[9];
        wk[] var10 = new wk[9];
        var9[4] = new wk(2, 1);
        var10[4] = new wk(1, 2);
        wk dupTemp$2 = var9[4];
        dupTemp$2.field_E = new int[]{6710886, 7829367};
        var10[4].field_E = new int[]{6710886, 7829367};
        wa var11 = new wa();
        wa var12 = new wa();
        var11.a(var9, false, 0);
        var12.a(var10, false, 0);
        wk var13 = new wk(7, 4);
        var13.field_E = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        wa var14 = new wa(var4, true);
        if (param0 <= 110) {
            return;
        }
        try {
            var14.a(var13.g(), (byte) 88);
            var13.c();
            var14 = new wa(var4, true);
            var14.a(var13.g(), (byte) 88);
            var13.c();
            var14 = new wa(var4, true);
            var14.a(var13.g(), (byte) 88);
            var13.c();
            var19 = new wa(var4, true);
            var19.a(var13, (byte) 88);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ll.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 <= 51) {
          return;
        } else {
          field_e = null;
          field_j = null;
          field_m = null;
          field_s = null;
          field_r = null;
          field_p = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        pb.d(param4, param0, param5, param1, param2);
        if (param3 > -53) {
            this.a(14, -110, -118, (byte) 18, -35, -121);
        }
    }

    public ll() {
        this.field_o = true;
    }

    static {
        field_p = new String[]{"Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Unleashes an EMP on all nearby sentinels.", "Gives you the ability to target your enemies.<br>Hold <col=ffffff>'ALT'</col> to target.<br>Power-up lasts for <col=ffffff>30 seconds</col>.", "Gives you missile defences for <col=ffffff>30 seconds</col>.", "Quickly disrupts any target lock on your sentinel. Lasts for <col=ffffff>30 seconds</col>.", "Gradually repairs your sentinel's damage.<br>Lasts <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Scans and tracks the movement of sentinels and projectiles for <col=ffffff>30 seconds</col>.", "Rockets and missiles reload faster for <col=ffffff>30 seconds</col>.", "Reduces the energy drain of plasma weapons for <col=ffffff>30 seconds</col>.", "Teleports you to a different point on the map.<br>Press <col=ffffff>'F2'</col> to fire.<br><col=ffffff>One use only</col>.", "Increases the power of laser weapons for <col=ffffff>30 seconds</col>.", "Recharges your shields when you take damage.<br>Lasts <col=ffffff>30 seconds</col>.", "Protects you from the energy-sapping effects of EMP.<br>Lasts <col=ffffff>30 seconds</col>.", "Increases your sentinel's jumping ability.<br>Lasts <col=ffffff>30 seconds</col>.", "Increases your sentinel's flight ability.<br>Lasts <col=ffffff>30 seconds</col>.", "Gives your sentinel the ability to be invisible when not engaged in combat.<br>Lasts <col=ffffff>30 seconds</col>.", "Increases your sentinel's ability to fire while on the ground.<br>Lasts <col=ffffff>30 seconds</col>.", "Reduces kinetic damage on your sentinel.<br>Lasts <col=ffffff>30 seconds</col>.", "Reduces explosive damage on your sentinel.<br>Lasts <col=ffffff>30 seconds</col>.", "<This should never be seen>", "Light missiles and rockets reload very fast for <col=ffffff>30 seconds</col>.", "Boosts your sentinel's health.", "Gives your sentinel unlimited energy for <col=ffffff>30 seconds</col>.", "Protects your sentinel from all damage for <col=ffffff>30 seconds</col>.", "Boosts the ground speed of your sentinel for <col=ffffff>30 seconds</col>.", "Gives your sentinel the benefits of reinforced, reactive, energised and EMP armour for <col=ffffff>30 seconds</col>.", "All weapons are four times more powerful for <col=ffffff>30 seconds</col>.", "All weapons have EMP effects for <col=ffffff>30 seconds</col>.", "Gives you the MGFN technology that increases your score over time.<br>Lasts until your sentinel is destroyed.", "Heavy rocket strike from above.", "Gives you an extra respawn."};
        field_q = 256;
        field_m = "MAX";
    }
}
