/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wh extends ji {
    private int field_E;
    static String field_B;
    static String field_A;
    static u[] field_F;
    static ri field_D;
    int field_C;
    int[] field_y;
    int field_z;

    final static u a(r param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        r var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 4080) {
              break L0;
            } else {
              var5 = (r) null;
              wh.a((r) null, 40, -33, -13);
              break L0;
            }
          }
          if (hq.a(124, param3, param2, param0)) {
            return mc.a((byte) 9);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("wh.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                this.field_E = param2.a((byte) -11);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                this.g(-43);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("wh.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != -117) {
            this.field_C = -85;
        }
        return this.field_E;
    }

    int[][] b(int param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int[][] var3;
        int[] var4;
        int[] var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          var14 = this.field_v.a(param1, -2);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (this.field_v.field_c) {
            if (this.g(param0 ^ -27930)) {
              L1: {
                var4 = var14[0];
                var5 = var14[1];
                var6 = var14[2];
                stackIn_6_0 = this.field_z;

                if (this.field_C != aa.field_Vb) {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = this.field_C * param1 / aa.field_Vb;
                  break L1;
                } else {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = param1;
                  break L1;
                }
              }
              var7 = stackIn_7_0 * stackIn_7_1;
              if (this.field_z != we.field_M) {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= we.field_M) {
                    break L0;
                  } else {
                    var9 = var8 * this.field_z / we.field_M;
                    var10 = this.field_y[var9 + var7];
                    var6[var8] = b.a(var10, 255) << 705897668;
                    var5[var8] = b.a(var10, 65280) >> 888140964;
                    var4[var8] = b.a(16711680, var10) >> -1962352852;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= we.field_M) {
                    break L0;
                  } else {
                    incrementValue$0 = var7;
                    var7++;
                    var9 = this.field_y[incrementValue$0];
                    var6[var8] = b.a(4080, var9 << 210777636);
                    var5[var8] = b.a(4080, var9 >> 1200750756);
                    var4[var8] = b.a(var9, 16711680) >> 1228696108;
                    var8++;
                    continue L3;
                  }
                }
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (param0 == -3780) {
            break L4;
          } else {
            field_F = (u[]) null;
            break L4;
          }
        }
        return var3;
    }

    public static void h(int param0) {
        field_F = null;
        field_B = null;
        field_D = null;
        field_A = null;
        if (param0 != 9724) {
            wh.h(21);
        }
    }

    public wh() {
        super(0, false);
        this.field_E = -1;
    }

    final boolean g(int param0) {
        i var2 = null;
        if (null != this.field_y) {
            return true;
        }
        if (param0 != 25562) {
            field_D = (ri) null;
        }
        if (-1 >= (this.field_E ^ -1)) {
            var2 = 0 > b.field_i ? i.a(nk.field_Hb, this.field_E) : i.a(nk.field_Hb, b.field_i, this.field_E);
            var2.a();
            this.field_y = var2.d();
            this.field_z = var2.field_h;
            this.field_C = var2.field_i;
            return true;
        }
        return false;
    }

    final void f(int param0) {
        if (param0 != 2) {
            return;
        }
        super.f(param0 ^ 0);
        this.field_y = null;
    }

    static {
        field_A = "The account name you use to access RuneScape and other Jagex.com games";
        field_B = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_D = null;
    }
}
