/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static lg field_b;
    static String field_a;

    final static void a(byte[] param0, int param1) {
        byte dupTemp$2 = 0;
        byte dupTemp$3 = 0;
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
        de var16 = null;
        de var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = ZombieDawn.field_J;
        try {
          L0: {
            var16 = new de(param0);
            var17 = var16;
            var17.field_j = -2 + param0.length;
            t.field_h = var17.f(param1 + 2);
            bn.field_c = new int[t.field_h];
            uf.field_n = new int[t.field_h];
            sl.field_d = new int[t.field_h];
            ka.field_f = new byte[t.field_h][];
            vj.field_m = new byte[t.field_h][];
            jc.field_r = new boolean[t.field_h];
            bo.field_o = new int[t.field_h];
            var17.field_j = -7 + (param0.length + -(t.field_h * 8));
            gl.field_F = var17.f(2);
            kd.field_pb = var17.f(2);
            var3 = (255 & var17.d((byte) -125)) + 1;
            var4 = 0;
            L1: while (true) {
              if (var4 >= t.field_h) {
                var4 = 0;
                L2: while (true) {
                  if (t.field_h <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= t.field_h) {
                        var4 = param1;
                        L4: while (true) {
                          if (t.field_h <= var4) {
                            var17.field_j = -(t.field_h * 8) + -7 + param0.length - (var3 + -1) * 3;
                            j.field_a = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_j = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= t.field_h) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = bn.field_c[var4];
                                      var6 = uf.field_n[var4];
                                      var7 = var6 * var5;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      vj.field_m[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      ka.field_f[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.d((byte) -115);
                                      if (-1 != (1 & var11 ^ -1)) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if (-1 != (var11 & 2 ^ -1)) {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var5 <= var12) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        dupTemp$2 = var17.e((byte) 116);
                                                        var9[var13 * var5 + var12] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_44_0 = var10;
                                                        stackIn_46_0 = stackOut_44_0;
                                                        stackIn_45_0 = stackOut_44_0;
                                                        if (-1 == var14) {
                                                          stackOut_46_0 = stackIn_46_0;
                                                          stackOut_46_1 = 0;
                                                          stackIn_47_0 = stackOut_46_0;
                                                          stackIn_47_1 = stackOut_46_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_45_0 = stackIn_45_0;
                                                          stackOut_45_1 = 1;
                                                          stackIn_47_0 = stackOut_45_0;
                                                          stackIn_47_1 = stackOut_45_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_47_0 | stackIn_47_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.e((byte) 116);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (var7 <= var12) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    dupTemp$3 = var17.e((byte) 116);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_28_0 = var10;
                                                    stackIn_30_0 = stackOut_28_0;
                                                    stackIn_29_0 = stackOut_28_0;
                                                    if (0 == (var13 ^ -1)) {
                                                      stackOut_30_0 = stackIn_30_0;
                                                      stackOut_30_1 = 0;
                                                      stackIn_31_0 = stackOut_30_0;
                                                      stackIn_31_1 = stackOut_30_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_29_0 = stackIn_29_0;
                                                      stackOut_29_1 = 1;
                                                      stackIn_31_0 = stackOut_29_0;
                                                      stackIn_31_1 = stackOut_29_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_31_0 | stackIn_31_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.e((byte) 116);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    jc.field_r[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  j.field_a[var4] = var17.g(-1875);
                                  if (j.field_a[var4] != 0) {
                                    break L16;
                                  } else {
                                    j.field_a[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            uf.field_n[var4] = var17.f(2);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        bn.field_c[var4] = var17.f(2);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    bo.field_o[var4] = var17.f(2);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                sl.field_d[var4] = var16.f(2);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) (var2);
            stackOut_51_1 = new StringBuilder().append("rn.B(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -12637) {
            byte[] var2 = (byte[]) null;
            rn.a((byte[]) null, -33);
        }
    }

    static {
        field_a = "Create a free account to start using this feature";
        field_b = null;
    }
}
