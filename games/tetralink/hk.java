/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hk {
    static int field_a;
    static String[] field_b;
    static int field_d;
    static long field_c;

    final static void a() {
        if (fl.field_u != null) {
            fl.field_u.r(-128);
        }
        ko.field_q = new fn();
        mm.field_u.e((na) (Object) ko.field_q, -27667);
    }

    final static void a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        bh var17 = null;
        bh var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var15 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param1 <= -35) {
                break L1;
              } else {
                var16 = null;
                hk.a((byte[]) null, 72);
                break L1;
              }
            }
            var17 = new bh(param0);
            var18 = var17;
            var18.field_t = -2 + param0.length;
            vj.field_n = var18.e(127);
            gm.field_g = new boolean[vj.field_n];
            ga.field_a = new byte[vj.field_n][];
            sn.field_e = new int[vj.field_n];
            qa.field_x = new int[vj.field_n];
            je.field_h = new int[vj.field_n];
            i.field_t = new int[vj.field_n];
            jg.field_i = new byte[vj.field_n][];
            var18.field_t = -(vj.field_n * 8) + -7 + param0.length;
            wm.field_l = var18.e(127);
            mm.field_w = var18.e(127);
            var3 = 1 + (255 & var18.d((byte) -99));
            var4 = 0;
            L2: while (true) {
              if (var4 >= vj.field_n) {
                var4 = 0;
                L3: while (true) {
                  if (vj.field_n <= var4) {
                    var4 = 0;
                    L4: while (true) {
                      if (vj.field_n <= var4) {
                        var4 = 0;
                        L5: while (true) {
                          if (vj.field_n <= var4) {
                            var18.field_t = 3 - 3 * var3 + (param0.length - (7 + vj.field_n * 8));
                            ti.field_c = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var18.field_t = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (vj.field_n <= var4) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = je.field_h[var4];
                                      var6 = sn.field_e[var4];
                                      var7 = var6 * var5;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var8 = var19;
                                      ga.field_a[var4] = var25;
                                      var26 = new byte[var7];
                                      var24 = var26;
                                      var22 = var24;
                                      var20 = var22;
                                      var9 = var20;
                                      jg.field_i[var4] = var26;
                                      var10 = 0;
                                      var11 = var18.d((byte) -99);
                                      if ((1 & var11) == 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    byte dupTemp$2 = var18.g(-1772093437);
                                                    var9[var12] = dupTemp$2;
                                                    var13 = dupTemp$2;
                                                    stackOut_46_0 = var10;
                                                    stackIn_48_0 = stackOut_46_0;
                                                    stackIn_47_0 = stackOut_46_0;
                                                    if (var13 == -1) {
                                                      stackOut_48_0 = stackIn_48_0;
                                                      stackOut_48_1 = 0;
                                                      stackIn_49_0 = stackOut_48_0;
                                                      stackIn_49_1 = stackOut_48_1;
                                                      break L11;
                                                    } else {
                                                      stackOut_47_0 = stackIn_47_0;
                                                      stackOut_47_1 = 1;
                                                      stackIn_49_0 = stackOut_47_0;
                                                      stackIn_49_1 = stackOut_47_1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_49_0 | stackIn_49_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var18.g(-1772093437);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var5 <= var12) {
                                            if (0 != (2 & var11)) {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        byte dupTemp$3 = var18.g(-1772093437);
                                                        var9[var5 * var13 + var12] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_35_0 = var10;
                                                        stackIn_37_0 = stackOut_35_0;
                                                        stackIn_36_0 = stackOut_35_0;
                                                        if (var14 == -1) {
                                                          stackOut_37_0 = stackIn_37_0;
                                                          stackOut_37_1 = 0;
                                                          stackIn_38_0 = stackOut_37_0;
                                                          stackIn_38_1 = stackOut_37_1;
                                                          break L15;
                                                        } else {
                                                          stackOut_36_0 = stackIn_36_0;
                                                          stackOut_36_1 = 1;
                                                          stackIn_38_0 = stackOut_36_0;
                                                          stackIn_38_1 = stackOut_36_1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_38_0 | stackIn_38_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var13 * var5 + var12] = var18.g(-1772093437);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    gm.field_g[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  ti.field_c[var4] = var18.d(-1);
                                  if (ti.field_c[var4] != 0) {
                                    break L17;
                                  } else {
                                    ti.field_c[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            sn.field_e[var4] = var18.e(127);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        je.field_h[var4] = var18.e(127);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    i.field_t[var4] = var18.e(127);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                qa.field_x[var4] = var17.e(127);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var2;
            stackOut_52_1 = new StringBuilder().append("hk.B(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L18;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L18;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param1 + 41);
        }
    }

    public static void b() {
        field_b = null;
    }

    abstract byte[] b(int param0, int param1);

    abstract int a(int param0, int param1);

    abstract t a(int param0);

    static {
    }
}
