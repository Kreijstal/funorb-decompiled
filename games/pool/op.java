/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class op {
    static int field_h;
    static int[][] field_a;
    static String field_g;
    static java.awt.Frame field_e;
    static int[] field_d;
    vj[] field_b;
    static String field_c;
    static int field_f;

    final int a(int param0) {
        int var2 = 0;
        vj[] var3 = null;
        int var4 = 0;
        vj var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var2 = param0;
          if (null != ((op) this).field_b) {
            var3 = ((op) this).field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(param0 + -56);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var2;
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        vj var5 = null;
        vj[] var6 = ((op) this).field_b;
        vj[] var3 = var6;
        if (param1 > -35) {
            return -23;
        }
        for (var4 = 0; var4 < var6.length; var4++) {
            var5 = var6[var4];
            if (var5.field_h.length > param0) {
                return var5.field_h[param0];
            }
            param0 = param0 - (-1 + var5.field_h.length);
        }
        return 0;
    }

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 66) {
            break L0;
          } else {
            int discarded$2 = ((op) this).a((byte) 123);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((op) this).field_b) {
              break L2;
            } else {
              if ((((op) this).field_b.length ^ -1) >= -1) {
                break L2;
              } else {
                stackOut_4_0 = -((op) this).field_b[0].field_e + ((op) this).field_b[((op) this).field_b.length + -1].field_i;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        vj var4 = null;
        for (var3 = param1; ((op) this).field_b.length > var3; var3++) {
            var4 = ((op) this).field_b[var3];
            if (var4.field_h.length > param0) {
                return var3;
            }
            param0 = param0 - (var4.field_h.length - 1);
        }
        return ((op) this).field_b.length;
    }

    final int a(int param0, byte param1, String param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Pool.field_O;
        var5 = 0;
        var6 = 0;
        var7 = param2.length();
        if (param1 == 105) {
          var8 = 0;
          L0: while (true) {
            if (var8 >= var7) {
              if (0 < var5) {
                return (param3 + -param0 << -1634496760) / var5;
              } else {
                return 0;
              }
            } else {
              var9 = param2.charAt(var8);
              if (var9 != 60) {
                if (var9 == 62) {
                  var6 = 0;
                  var8++;
                  continue L0;
                } else {
                  if (var6 == 0) {
                    if (var9 == 32) {
                      var5++;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    continue L0;
                  }
                }
              } else {
                var6 = 1;
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return -67;
        }
    }

    final static float[] a(int param0, int[] param1, int param2) {
        int var4 = 0;
        float[] var6 = new float[param1.length];
        float[] var3 = var6;
        if (param2 < 61) {
            Object var5 = null;
            op.a((int[]) null, -54, (int[]) null, -45, (int[]) null, (byte) 22, 22, (int[]) null, (int[]) null, (byte) 2, (int[]) null);
        }
        for (var4 = 0; param1.length > var4; var4++) {
            var6[var4] = de.a(-1, param0, param1[var4]);
        }
        return var6;
    }

    final static void a(int[] param0, int param1, int[] param2, int param3, int[] param4, byte param5, int param6, int[] param7, int[] param8, byte param9, int[] param10) {
        int var11 = 0;
        int var12 = 0;
        ro var13 = null;
        ro var14 = null;
        ro var15 = null;
        ro var15_ref = null;
        int var16 = 0;
        int var17 = 0;
        ro var18 = null;
        ro var19 = null;
        ro var20 = null;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          L1: {
            if (hr.field_c == null) {
              break L1;
            } else {
              if (param1 > hr.field_c.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          kg.a(param1, (byte) 49);
          break L0;
        }
        var11 = 0;
        L2: while (true) {
          if (param1 <= var11) {
            L3: {
              var11 = 0;
              var12 = 0;
              var13 = null;
              var18 = hr.field_c[0];
              var15 = var18;
              var15 = var18;
              var14 = var18;
              var19 = hr.field_c[1];
              var15 = var19;
              var15 = var19;
              var18.a((byte) 60, var19);
              if (-1 != param9) {
                break L3;
              } else {
                if (-1 == param5) {
                  var20 = hr.field_c[-1 + param1];
                  var13 = var20;
                  var20.a((byte) 60, var18);
                  var18.a(var20, -16875);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (param9 != 0) {
                  break L5;
                } else {
                  if (param5 != 0) {
                    break L5;
                  } else {
                    stackOut_13_0 = param1 + 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
              }
              stackOut_14_0 = param1;
              stackIn_15_0 = stackOut_14_0;
              break L4;
            }
            var16 = stackIn_15_0;
            var17 = param3;
            L6: while (true) {
              if (var17 >= var16) {
                return;
              } else {
                L7: {
                  if (param1 > var17) {
                    var15_ref = hr.field_c[var17];
                    break L7;
                  } else {
                    var15_ref = hr.field_c[var17 % param1];
                    break L7;
                  }
                }
                L8: {
                  if (param1 > 1 + var17) {
                    var15_ref.a((byte) 60, hr.field_c[1 + var17]);
                    var15_ref.a(var14, -16875);
                    break L8;
                  } else {
                    if (0 != param9) {
                      break L8;
                    } else {
                      if (param5 == 0) {
                        var15_ref.a((byte) 60, hr.field_c[0]);
                        var15_ref.a(var14, param3 ^ -16876);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  if (var14.b(var15_ref, 24)) {
                    break L9;
                  } else {
                    L10: {
                      if ((var14.field_r & 240) == 0) {
                        L11: {
                          L12: {
                            if (var15_ref.field_i != 0) {
                              break L12;
                            } else {
                              if (0 == var15_ref.field_k) {
                                ne.field_q = var14.field_f;
                                di.field_h = var14.field_m;
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          ne.field_q = var15_ref.field_i;
                          di.field_h = var15_ref.field_k;
                          break L11;
                        }
                        var12 = 0;
                        break L10;
                      } else {
                        var12 = 2;
                        break L10;
                      }
                    }
                    L13: {
                      if (0 == (15 & var14.field_r)) {
                        var11 = 0;
                        if (var13 == null) {
                          ng.field_w = var14.field_f;
                          fr.field_u = var14.field_m;
                          break L13;
                        } else {
                          fr.field_u = var14.field_k;
                          ng.field_w = var14.field_i;
                          break L13;
                        }
                      } else {
                        var11 = 2;
                        break L13;
                      }
                    }
                    bo.a(var14.field_j[0], param6, (byte) 19, var14.field_h[1], var14.field_q[1], var14.field_q[0], var14.field_h[0], (byte) var11, var14.field_j[1], param7, (byte) var12);
                    break L9;
                  }
                }
                var13 = var14;
                var14 = var15_ref;
                var17++;
                continue L6;
              }
            }
          } else {
            hr.field_c[var11].a(param8[var11], param10[var11], param2[var11], param0[var11], (byte) 120, param4);
            var11++;
            continue L2;
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        vj var6 = null;
        int var7 = 0;
        int var8 = Pool.field_O;
        if (((op) this).field_b != null) {
            // if_icmpeq L39
            // if_icmpgt L39
        } else {
            return -1;
        }
        if (((op) this).field_b[param2 + ((op) this).field_b.length].field_i < param0) {
            return -1;
        }
        if (!(-2 != (((op) this).field_b.length ^ -1))) {
            return ((op) this).field_b[0].a(-109, param1);
        }
        int var4 = 0;
        for (var5 = 0; ((op) this).field_b.length > var5; var5++) {
            var6 = ((op) this).field_b[var5];
            if (param0 >= var6.field_e) {
                if (var6.field_i >= param0) {
                    var7 = var6.a(-111, param1);
                    if (var7 == -1) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (-1 + var6.field_h.length);
        }
        return -1;
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 0) {
            field_c = null;
        }
        field_g = null;
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Hide game chat";
        field_g = "Asking to join <%0>'s game...";
        field_h = 0;
        field_d = new int[]{3456, 3456};
    }
}
