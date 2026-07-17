/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends htb {
    private int field_E;
    int field_F;
    private hma field_G;
    int field_C;

    final int a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((v) this).a(-12);
            return ((v) this).field_G.a((byte) -118);
        }
        return ((v) this).field_G.a((byte) -118);
    }

    final static phb[] b(boolean param0) {
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
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        int[] var25 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        byte[] var31 = null;
        byte[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        var8 = VoidHunters.field_G;
        var1 = new phb[mma.field_a];
        if (param0) {
          L0: {
            phb[] discarded$1 = v.b(true);
            var2 = 0;
            if (mma.field_a <= var2) {
              break L0;
            } else {
              L1: {
                var3 = hla.field_a[var2] * nhb.field_o[var2];
                var28 = sh.field_a[var2];
                if (!mk.field_o[var2]) {
                  var10 = new int[var3];
                  var30 = var10;
                  var6 = 0;
                  L2: while (true) {
                    if (var3 <= var6) {
                      var1[var2] = new phb(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var30);
                      break L1;
                    } else {
                      var10[var6] = rlb.field_d[dla.a((int) var28[var6], 255)];
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  var27 = hja.field_o[var2];
                  var19 = var27;
                  var15 = var19;
                  var11 = var15;
                  var9 = var11;
                  var5 = var9;
                  var29 = new int[var3];
                  var21 = var29;
                  var17 = var21;
                  var13 = var17;
                  var6_ref_int__ = var13;
                  var7 = 0;
                  L3: while (true) {
                    if (var3 <= var7) {
                      var1[var2] = (phb) (Object) new jva(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var29);
                      var2++;
                      break L1;
                    } else {
                      var6_ref_int__[var7] = knb.a(dla.a(var27[var7] << 24, -16777216), rlb.field_d[dla.a((int) var28[var7], 255)]);
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
              var2++;
              var2++;
              var2++;
              break L0;
            }
          }
          qqb.a(105);
          return var1;
        } else {
          var2 = 0;
          L4: while (true) {
            if (mma.field_a <= var2) {
              qqb.a(105);
              return var1;
            } else {
              var3 = hla.field_a[var2] * nhb.field_o[var2];
              var32 = sh.field_a[var2];
              if (!mk.field_o[var2]) {
                var10 = new int[var3];
                var34 = var10;
                var6 = 0;
                L5: while (true) {
                  if (var3 <= var6) {
                    var1[var2] = new phb(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var34);
                    var2++;
                    var2++;
                    continue L4;
                  } else {
                    var10[var6] = rlb.field_d[dla.a((int) var32[var6], 255)];
                    var6++;
                    continue L5;
                  }
                }
              } else {
                var31 = hja.field_o[var2];
                var23 = var31;
                var15 = var23;
                var11 = var15;
                var9 = var11;
                var5 = var9;
                var33 = new int[var3];
                var25 = var33;
                var17 = var25;
                var13 = var17;
                var6_ref_int__ = var13;
                var7 = 0;
                L6: while (true) {
                  if (var3 <= var7) {
                    var1[var2] = (phb) (Object) new jva(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var33);
                    var2++;
                    var2++;
                    continue L4;
                  } else {
                    var6_ref_int__[var7] = knb.a(dla.a(var31[var7] << 24, -16777216), rlb.field_d[dla.a((int) var32[var7], 255)]);
                    var7++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    final int a(int param0, int param1) {
        if (param0 <= -89) {
          if (0 <= param1) {
            if (param1 >= ((v) this).field_G.a((byte) 108)) {
              return -1;
            } else {
              return ((v) this).field_G.b(param1, (byte) 106);
            }
          } else {
            return -1;
          }
        } else {
          phb[] discarded$5 = v.b(false);
          if (0 <= param1) {
            if (param1 >= ((v) this).field_G.a((byte) 108)) {
              return -1;
            } else {
              return ((v) this).field_G.b(param1, (byte) 106);
            }
          } else {
            return -1;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, (byte) -67)) {
              L1: {
                var8_int = -((v) this).field_C + (-param1 + param0);
                var9 = -(((v) this).field_C * 2) + ((v) this).field_h;
                if (~var9 > ~var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = ((v) this).field_E * var8_int / var9;
                if (1 == param3) {
                  ((v) this).field_G.a((byte) -73, var8_int);
                  break L3;
                } else {
                  if (param3 != 2) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (((v) this).field_G.a((byte) -102) <= var12) {
                        if (0 > var11) {
                          return true;
                        } else {
                          ((v) this).field_G.a(var11, (byte) 70);
                          break L3;
                        }
                      } else {
                        var13 = ((v) this).field_G.b(var12, (byte) 106) - var8_int;
                        var13 = var13 * var13;
                        if (var13 >= var10) {
                          var12++;
                          var12++;
                          continue L4;
                        } else {
                          var11 = var12;
                          var10 = var13;
                          var12++;
                          var12++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_23_0 = 1;
              stackIn_24_0 = stackOut_23_0;
              return stackIn_24_0 != 0;
            } else {
              L5: {
                if (param6 < -17) {
                  break L5;
                } else {
                  int discarded$1 = ((v) this).e(-69);
                  break L5;
                }
              }
              stackOut_27_0 = 0;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var8;
            stackOut_29_1 = new StringBuilder().append("v.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_28_0 != 0;
    }

    final int e(int param0) {
        int var2 = -42 / ((param0 - -44) / 52);
        return ((v) this).field_E;
    }

    private v() throws Throwable {
        throw new Error();
    }

    static {
    }
}
