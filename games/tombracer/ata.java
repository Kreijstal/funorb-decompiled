/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ata extends rra {
    private int field_i;
    private int field_h;
    private int field_f;
    private int field_g;

    final void a(int param0, int param1, int param2) {
        int var4 = param2 * this.field_i >> -928868756;
        int var5 = this.field_f * param2 >> -1416016884;
        int var6 = param0 * this.field_h >> -1680996148;
        int var7 = param0 * this.field_g >> -252064148;
        cca.a(var7, var5, this.field_c, var6, 936441872, var4);
        int var8 = 127 % ((55 - param1) / 37);
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = this.field_i * param0 >> 1637429676;
        var5 = this.field_f * param0 >> 1172633036;
        if (!param2) {
          return;
        } else {
          var6 = param1 * this.field_h >> 495955404;
          var7 = this.field_g * param1 >> -787381556;
          lo.a(var5, this.field_d, var7, var4, var6, param2, this.field_b);
          return;
        }
    }

    ata(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_g = param3;
        this.field_i = param0;
        this.field_h = param1;
        this.field_f = param2;
    }

    final static String b(int param0) {
        String var1 = null;
        String[] var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var1 = "";
        if (param0 > -16) {
          return (String) null;
        } else {
          var2 = rf.field_c;
          var3 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var3 >= var2.length) {
                  break L2;
                } else {
                  var4 = var2[var3];
                  stackOut_3_0 = var1 + var4 + "\n";
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    var1 = stackIn_4_0;
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_5_0 = (String) (var1);
              stackIn_6_0 = stackOut_5_0;
              break L1;
            }
            return stackIn_6_0;
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param1 * this.field_i >> 951052972;
        var5 = param1 * this.field_f >> 2081271788;
        if (param0 > -117) {
          this.a((byte) -12, 75, -53);
          var6 = this.field_h * param2 >> -235318868;
          var7 = this.field_g * param2 >> -659960020;
          tl.a((byte) -71, var4, var6, var5, var7, this.field_d, this.field_c, this.field_b);
          return;
        } else {
          var6 = this.field_h * param2 >> -235318868;
          var7 = this.field_g * param2 >> -659960020;
          tl.a((byte) -71, var4, var6, var5, var7, this.field_d, this.field_c, this.field_b);
          return;
        }
    }

    static {
    }
}
