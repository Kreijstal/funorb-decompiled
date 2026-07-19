/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ji {
    static String field_D;
    private int field_y;
    private int field_A;
    static String field_z;
    private int field_B;
    static String field_E;
    static int field_C;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ed var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        var15 = this.field_x.a(param0, (byte) 100);
        var14 = var15;
        var13 = var14;
        var3 = var13;
        if (this.field_x.field_i) {
          var4 = lf.field_y[param0];
          var5 = -2048 + var4 >> -511034079;
          var6 = 0;
          L0: while (true) {
            if (we.field_M > var6) {
              L1: {
                var8 = rh.field_O[var6];
                var9 = -2048 + var8 >> 1820967265;
                if (this.field_y != 0) {
                  var10 = var5 * var5 + var9 * var9 >> 1507776620;
                  var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
                  var7 = (int)((double)(this.field_B * var7) * 3.141592653589793);
                  break L1;
                } else {
                  var7 = (var8 + -var4) * this.field_B;
                  break L1;
                }
              }
              var7 = var7 - (var7 & -4096);
              if (-1 != (this.field_A ^ -1)) {
                L2: {
                  if (2 == this.field_A) {
                    L3: {
                      var7 -= 2048;
                      if ((var7 ^ -1) <= -1) {
                        break L3;
                      } else {
                        var7 = -var7;
                        break L3;
                      }
                    }
                    var7 = -var7 + 2048 << 1093880449;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var15[var6] = var7;
                var6++;
                continue L0;
              } else {
                var7 = 4096 + eh.field_b[255 & var7 >> 801663396] >> 784473153;
                var15[var6] = var7;
                var6++;
                continue L0;
              }
            } else {
              if (param1 <= 91) {
                var12 = (ed) null;
                this.a((byte) 122, -56, (ed) null);
                return var3;
              } else {
                return var3;
              }
            }
          }
        } else {
          if (param1 <= 91) {
            var12 = (ed) null;
            this.a((byte) 122, -56, (ed) null);
            return var3;
          } else {
            return var3;
          }
        }
    }

    final static void a(int param0, byte param1, be param2) {
        mi var3 = uh.field_Wb;
        var3.j(param0, 118);
        if (param1 < 116) {
            return;
        }
        try {
            var3.f(2, 126);
            var3.f(0, 79);
            var3.f(param2.field_r, 89);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ec.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 38 % ((27 - param4) / 37);
        ap.field_e = param1;
        cj.field_D = param0;
        ua.field_e = param3;
        ib.field_a = param2;
    }

    public ec() {
        super(0, true);
        this.field_y = 0;
        this.field_A = 0;
        this.field_B = 1;
    }

    final void a(int param0) {
        if (param0 >= -98) {
            ec.b((byte) 102);
            uk.d((byte) 106);
            return;
        }
        uk.d((byte) 106);
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ed var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 110) {
                break L1;
              } else {
                var6 = (ed) null;
                this.a((byte) 103, -106, (ed) null);
                break L1;
              }
            }
            var4_int = param1;
            if (0 != var4_int) {
              if (var4_int == 1) {
                this.field_A = param2.h(-11);
                return;
              } else {
                if (var4_int != 3) {
                  break L0;
                } else {
                  this.field_B = param2.h(param0 ^ -101);
                  return;
                }
              }
            } else {
              this.field_y = param2.h(-11);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("ec.C(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public static void b(byte param0) {
        field_E = null;
        field_z = null;
        field_D = null;
        if (param0 != 60) {
            field_z = (String) null;
        }
    }

    static {
        field_D = "Loading models";
        field_z = "RuneScape clan";
        field_C = 0;
        field_E = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
