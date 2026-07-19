/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends htb {
    private int field_E;
    int field_F;
    private hma field_G;
    int field_C;

    final int a(int param0) {
        int discarded$0 = 0;
        if (param0 != 0) {
            discarded$0 = this.a(-12);
            return this.field_G.a((byte) -118);
        }
        return this.field_G.a((byte) -118);
    }

    final static phb[] b(boolean param0) {
        phb[] discarded$1 = null;
        phb[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        int[] var26 = null;
        var8 = VoidHunters.field_G;
        var1 = new phb[mma.field_a];
        if (param0) {
          discarded$1 = v.b(true);
          var2 = 0;
          L0: while (true) {
            if (mma.field_a <= var2) {
              qqb.a(105);
              return var1;
            } else {
              var3 = hla.field_a[var2] * nhb.field_o[var2];
              var23 = sh.field_a[var2];
              if (!mk.field_o[var2]) {
                var10 = new int[var3];
                var24 = var10;
                var6 = 0;
                L1: while (true) {
                  if (var3 <= var6) {
                    var1[var2] = new phb(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var24);
                    var2++;
                    continue L0;
                  } else {
                    var10[var6] = rlb.field_d[dla.a((int) var23[var6], 255)];
                    var6++;
                    continue L1;
                  }
                }
              } else {
                var15 = hja.field_o[var2];
                var11 = var15;
                var9 = var11;
                var5 = var9;
                var17 = new int[var3];
                var13 = var17;
                var6_ref_int__ = var13;
                var7 = 0;
                L2: while (true) {
                  if (var3 <= var7) {
                    var1[var2] = (phb) ((Object) new jva(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var17));
                    var2++;
                    continue L0;
                  } else {
                    var6_ref_int__[var7] = knb.a(dla.a(var15[var7] << 1833694456, -16777216), rlb.field_d[dla.a((int) var23[var7], 255)]);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          var2 = 0;
          L3: while (true) {
            if (mma.field_a <= var2) {
              qqb.a(105);
              return var1;
            } else {
              var3 = hla.field_a[var2] * nhb.field_o[var2];
              var25 = sh.field_a[var2];
              if (!mk.field_o[var2]) {
                var10 = new int[var3];
                var26 = var10;
                var6 = 0;
                L4: while (true) {
                  if (var3 <= var6) {
                    var1[var2] = new phb(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var26);
                    var2++;
                    continue L3;
                  } else {
                    var10[var6] = rlb.field_d[dla.a((int) var25[var6], 255)];
                    var6++;
                    continue L4;
                  }
                }
              } else {
                var15 = hja.field_o[var2];
                var11 = var15;
                var9 = var11;
                var5 = var9;
                var17 = new int[var3];
                var13 = var17;
                var6_ref_int__ = var13;
                var7 = 0;
                L5: while (true) {
                  if (var3 <= var7) {
                    var1[var2] = (phb) ((Object) new jva(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var17));
                    var2++;
                    continue L3;
                  } else {
                    var6_ref_int__[var7] = knb.a(dla.a(var15[var7] << 1833694456, -16777216), rlb.field_d[dla.a((int) var25[var7], 255)]);
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    final int a(int param0, int param1) {
        phb[] discarded$5 = null;
        if (param0 <= -89) {
          if (0 <= param1) {
            if (param1 >= this.field_G.a((byte) 108)) {
              return -1;
            } else {
              return this.field_G.b(param1, (byte) 106);
            }
          } else {
            return -1;
          }
        } else {
          discarded$5 = v.b(false);
          if (0 <= param1) {
            if (param1 >= this.field_G.a((byte) 108)) {
              return -1;
            } else {
              return this.field_G.b(param1, (byte) 106);
            }
          } else {
            return -1;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int discarded$1 = 0;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, (byte) -67)) {
              L1: {
                var8_int = -this.field_C + (-param1 + param0);
                var9 = -(this.field_C * 2) + this.field_h;
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if ((var8_int ^ -1) > -1) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = this.field_E * var8_int / var9;
                if (1 == param3) {
                  this.field_G.a((byte) -73, var8_int);
                  break L3;
                } else {
                  if (-3 != (param3 ^ -1)) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_G.a((byte) -102) <= var12) {
                        if (0 > var11) {
                          return true;
                        } else {
                          this.field_G.a(var11, (byte) 70);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = this.field_G.b(var12, (byte) 106) - var8_int;
                          var13 = var13 * var13;
                          if (var13 >= var10) {
                            break L5;
                          } else {
                            var11 = var12;
                            var10 = var13;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
              stackOut_21_0 = 1;
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L6: {
                if (param6 < -17) {
                  break L6;
                } else {
                  discarded$1 = this.e(-69);
                  break L6;
                }
              }
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var8);
            stackOut_27_1 = new StringBuilder().append("v.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0 != 0;
        } else {
          return stackIn_26_0 != 0;
        }
    }

    final int e(int param0) {
        int var2 = -42 / ((param0 - -44) / 52);
        return this.field_E;
    }

    private v() throws Throwable {
        throw new Error();
    }

    static {
    }
}
