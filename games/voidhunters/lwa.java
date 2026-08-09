/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lwa extends llb {
    private llb field_wb;
    static String field_vb;
    static asb field_xb;

    final boolean a(boolean param0, boolean param1) {
        int stackIn_9_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            this.a(false, true);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              this.a(true, 1332);
              if (0 == pba.field_o) {
                break L3;
              } else {
                if (this.field_o == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (0 == this.field_wb.field_o) {
              stackIn_9_0 = 0;
              break L1;
            } else {
              break L2;
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static int e(byte param0) {
        if (param0 != 73) {
            field_vb = (String) null;
        }
        return mw.field_e;
    }

    public static void h(int param0) {
        if (param0 != 0) {
            return;
        }
        field_vb = null;
        field_xb = null;
    }

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_vb = (String) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (ub.field_f.length <= var2_int) {
                stackIn_11_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (ub.field_f[var2_int] == param0) {
                  stackIn_8_0 = var2_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var2_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "lwa.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_11_0;
        }
    }

    lwa(llb param0, llb param1, llb param2, llb param3, llb param4, llb param5) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        llb var8 = null;
        llb var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        llb var13 = null;
        llb var14 = null;
        int var15 = 0;
        llb var17 = null;
        try {
          L0: {
            var17 = new llb(0L, param1, cu.field_p.toUpperCase());
            var17.field_F = 1;
            this.field_wb = new llb(0L, param2);
            var8 = new llb(0L, param3);
            var9 = new llb(0L, param3, kw.field_Jb);
            var9.field_F = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (var12 >= skb.field_q.length) {
                var10 += 15;
                var17.a(0, 116, 20 + (var11 - -90), 0, 24);
                this.a(100, 23, var17.field_hb, 100, var10 + var17.field_G);
                this.field_wb.a(-20 + var17.field_hb, 8, 15, 5, 15);
                var8.a(0, 119, this.field_hb, var17.field_G, -var17.field_G + this.field_G);
                var9.a(0, 121, this.field_hb, 20, 15);
                var8.field_gb = uwa.a(11579568, var8.field_G, 2105376, 8421504, 119, 3);
                var17.b(-561, this.field_wb);
                var8.b(-561, var9);
                this.b(-561, var17);
                this.b(-561, var8);
                var10 = -(this.field_G >> -1278640639) + 240;
                this.field_L = 320 + -(this.field_hb >> 1290878017);
                break L0;
              } else {
                L2: {
                  var13 = new llb(0L, param3, pha.field_r[var12]);
                  var14 = new llb(0L, param3, skb.field_q[var12]);
                  var15 = param3.field_eb.b(skb.field_q[var12]);
                  if ((var15 ^ -1) >= (var11 ^ -1)) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var13.a(20, 121, 65, var10, 15);
                var14.a(90, 124, 640, var10, 15);
                var8.b(-561, var13);
                var10 += 30;
                var8.b(-561, var14);
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("lwa.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_vb = "Loading extra data";
    }
}
