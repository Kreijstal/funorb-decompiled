/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn extends nv {
    static String field_o;
    private boolean field_q;
    private boolean field_s;
    static String field_u;
    static boolean field_n;
    private int field_r;
    static jea field_t;
    private int field_p;

    final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17_int = 0;
        ffa[] var17 = null;
        ffa[] var18 = null;
        int var19 = 0;
        ffa var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hr var27 = null;
        hr var28 = null;
        ffa stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        ffa stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        ffa stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        ffa stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        ffa stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        ffa stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        ffa stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        ffa stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        ffa stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        ffa stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        ffa stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        ffa stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        L0: {
          var26 = TombRacer.field_G ? 1 : 0;
          var2 = ((bn) this).field_g.d(3);
          if (param0 == 5418) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        L1: {
          var3 = ((bn) this).field_g.e(param0 + 4230);
          var4 = ((bn) this).field_g.c(param0 + -5487);
          var5 = ((bn) this).field_g.a((byte) 55);
          var7 = ((bn) this).field_p << 16;
          var8 = ((bn) this).field_r << 16;
          var9 = var4 >> 17;
          var10 = var5 >> 17;
          var11 = et.b(var10, var9, -1);
          var12 = ((bn) this).o((byte) 46).a(8192, 0);
          var13 = hua.a((byte) 98, var12 >> 2);
          var14 = bua.a(0, var12 >> 2);
          var16 = ((bn) this).field_g.P(0);
          if (((bn) this).field_q) {
            var17_int = 1 + ((bn) this).o((byte) 46).a(5, 0);
            var28 = ((bn) this).b(true).a(var13 * var11 / var17_int + var2, var3 + var11 * var14 / var17_int, (byte) 100, var16);
            var28.a(false, 2, 3, 4, 20);
            var28.b(param0 ^ 5392, -(var14 * (((bn) this).field_p - -((bn) this).field_r)), -(var13 * (((bn) this).field_p - -((bn) this).field_r)) / var17_int);
            break L1;
          } else {
            var17_int = 1 + ((bn) this).o((byte) 46).a(5, 0);
            var27 = ((bn) this).b(true).a(var2, var3, (byte) 100, var16);
            var27.a(false, 2, 3, 4, 25);
            var27.b(param0 + -5361, var14 * ((bn) this).field_r / var17_int, ((bn) this).field_r * var13 / var17_int);
            break L1;
          }
        }
        var17 = ((bn) this).b(true).field_u.b(var3, -1, var2, var4, var5);
        var18 = var17;
        var19 = 0;
        L2: while (true) {
          if (var19 >= var18.length) {
            return;
          } else {
            var20 = var18[var19];
            if ((Object) (Object) ((bn) this).field_g != (Object) (Object) var20) {
              if (!((bn) this).field_g.a(var20, true)) {
                var21 = var20.d(3);
                var22 = var20.e(9648);
                if (((bn) this).field_g.a((byte) 110, var22, var21, var20.a((byte) 55), var20.c(-40))) {
                  var23 = var21 - var2 >> 16;
                  var24 = -var3 + var22 >> 16;
                  var25 = ira.a(var24, var23, 124);
                  if (var25 <= var11) {
                    if (var25 != 0) {
                      L3: {
                        var6 = (var25 << 16) / var11;
                        var6 = -gqa.a(var6, (byte) 24, var8 - var7) + var8;
                        var6 = za.a(var7, (byte) 74, var8, var6);
                        if (!((bn) this).field_q) {
                          break L3;
                        } else {
                          var6 = -var6;
                          break L3;
                        }
                      }
                      L4: {
                        if (!((bn) this).field_q) {
                          break L4;
                        } else {
                          if (ua.a(var6, param0 ^ -5442) > var25 << 16) {
                            L5: {
                              stackOut_26_0 = (ffa) var20;
                              stackOut_26_1 = param0 + -5313;
                              stackOut_26_2 = 0;
                              stackIn_28_0 = stackOut_26_0;
                              stackIn_28_1 = stackOut_26_1;
                              stackIn_28_2 = stackOut_26_2;
                              stackIn_27_0 = stackOut_26_0;
                              stackIn_27_1 = stackOut_26_1;
                              stackIn_27_2 = stackOut_26_2;
                              if (((bn) this).field_s) {
                                stackOut_28_0 = (ffa) (Object) stackIn_28_0;
                                stackOut_28_1 = stackIn_28_1;
                                stackOut_28_2 = stackIn_28_2;
                                stackOut_28_3 = 2;
                                stackIn_29_0 = stackOut_28_0;
                                stackIn_29_1 = stackOut_28_1;
                                stackIn_29_2 = stackOut_28_2;
                                stackIn_29_3 = stackOut_28_3;
                                break L5;
                              } else {
                                stackOut_27_0 = (ffa) (Object) stackIn_27_0;
                                stackOut_27_1 = stackIn_27_1;
                                stackOut_27_2 = stackIn_27_2;
                                stackOut_27_3 = 1;
                                stackIn_29_0 = stackOut_27_0;
                                stackIn_29_1 = stackOut_27_1;
                                stackIn_29_2 = stackOut_27_2;
                                stackIn_29_3 = stackOut_27_3;
                                break L5;
                              }
                            }
                            boolean discarded$2 = ((ffa) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2 != 0, stackIn_29_3, -var24 << 16, -var23 << 16, 0);
                            var19++;
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        stackOut_22_0 = (ffa) var20;
                        stackOut_22_1 = 114;
                        stackOut_22_2 = 0;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        if (!((bn) this).field_s) {
                          stackOut_24_0 = (ffa) (Object) stackIn_24_0;
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = stackIn_24_2;
                          stackOut_24_3 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          stackIn_25_3 = stackOut_24_3;
                          break L6;
                        } else {
                          stackOut_23_0 = (ffa) (Object) stackIn_23_0;
                          stackOut_23_1 = stackIn_23_1;
                          stackOut_23_2 = stackIn_23_2;
                          stackOut_23_3 = 2;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          stackIn_25_2 = stackOut_23_2;
                          stackIn_25_3 = stackOut_23_3;
                          break L6;
                        }
                      }
                      boolean discarded$3 = ((ffa) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2 != 0, stackIn_25_3, var24 * var6 / var25, var6 * var23 / var25, 0);
                      var19++;
                      continue L2;
                    } else {
                      var19++;
                      continue L2;
                    }
                  } else {
                    var19++;
                    continue L2;
                  }
                } else {
                  var19++;
                  continue L2;
                }
              } else {
                var19++;
                continue L2;
              }
            } else {
              var19++;
              continue L2;
            }
          }
        }
    }

    public static void d(boolean param0) {
        field_u = null;
        field_o = null;
        field_t = null;
    }

    final int a(boolean param0) {
        if (param0) {
            return 61;
        }
        return 27;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 72, ((bn) this).field_q ? 1 : 0, 1);
            param1.a((byte) 32, ((bn) this).field_r, 4);
            param1.a((byte) -127, ((bn) this).field_p, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bn.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            return true;
        }
        return true;
    }

    bn(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((bn) this).field_r = 2;
        ((bn) this).field_q = true;
        ((bn) this).field_p = 1;
        try {
            ((bn) this).field_q = param1.b((byte) 44, 1) == 1 ? true : false;
            ((bn) this).field_r = param1.b((byte) 44, 4);
            ((bn) this).field_p = param1.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return 77;
        }
        return param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Quit";
        field_o = "Pistols";
    }
}
