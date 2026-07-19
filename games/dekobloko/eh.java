/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eh {
    int field_g;
    int[] field_f;
    int field_i;
    java.awt.Image field_c;
    static jc field_b;
    static boolean[][] field_h;
    static String field_e;
    static String field_d;
    static ni field_j;
    static int field_a;

    final void a(byte param0) {
        if (param0 > -82) {
            this.a((byte) 23);
        }
        hk.a(this.field_f, this.field_g, this.field_i);
    }

    abstract void a(int param0, byte param1, int param2, java.awt.Component param3);

    final static void a(byte param0, byte[] param1) {
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
        wl var16 = null;
        wl var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
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
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            var16 = new wl(param1);
            var17 = var16;
            var17.field_n = -2 + param1.length;
            ec.field_g = var17.e(3);
            da.field_d = new boolean[ec.field_g];
            sg.field_d = new int[ec.field_g];
            fh.field_a = new int[ec.field_g];
            tm.field_a = new int[ec.field_g];
            hc.field_c = new int[ec.field_g];
            pd.field_e = new byte[ec.field_g][];
            tc.field_Nb = new byte[ec.field_g][];
            var17.field_n = -(ec.field_g * 8) + (param1.length - 7);
            ed.field_f = var17.e(3);
            i.field_d = var17.e(3);
            var3 = 1 + (var17.d((byte) -104) & 255);
            var4 = 0;
            L1: while (true) {
              if (var4 >= ec.field_g) {
                var4 = 0;
                L2: while (true) {
                  if (ec.field_g <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= ec.field_g) {
                        var4 = 0;
                        L4: while (true) {
                          if (ec.field_g <= var4) {
                            var17.field_n = -(3 * (var3 + -1)) + (param1.length - (7 + ec.field_g * 8));
                            mb.field_d = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (~var3 >= ~var4) {
                                var17.field_n = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (ec.field_g <= var4) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = tm.field_a[var4];
                                      var6 = hc.field_c[var4];
                                      var7 = var5 * var6;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      tc.field_Nb[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      pd.field_e[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.d((byte) -35);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var5 <= var12) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        dupTemp$2 = var17.g((byte) -115);
                                                        var9[var12 + var13 * var5] = dupTemp$2;
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
                                                var8[var13 * var5 + var12] = var17.g((byte) -124);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (~var7 >= ~var12) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    dupTemp$3 = var17.g((byte) -119);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_28_0 = var10;
                                                    stackIn_30_0 = stackOut_28_0;
                                                    stackIn_29_0 = stackOut_28_0;
                                                    if (var13 == -1) {
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
                                            }
                                          } else {
                                            var8[var12] = var17.g((byte) -127);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    da.field_d[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  mb.field_d[var4] = var17.h(65280);
                                  if (0 == mb.field_d[var4]) {
                                    mb.field_d[var4] = 1;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            hc.field_c[var4] = var17.e(3);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        tm.field_a[var4] = var17.e(3);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    fh.field_a[var4] = var17.e(qm.b(-72, -69));
                    var4++;
                    continue L2;
                  }
                }
              } else {
                sg.field_d[var4] = var16.e(qm.b(-72, -69));
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
            stackOut_51_1 = new StringBuilder().append("eh.M(").append(-72).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
        }
    }

    abstract void a(byte param0, java.awt.Graphics param1, int param2, int param3);

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_h = (boolean[][]) null;
        field_b = null;
        field_j = null;
        if (param0 != 24744) {
            eh.a(125);
        }
    }

    static {
        field_b = new jc();
        field_e = "Shape feedback:";
    }
}
