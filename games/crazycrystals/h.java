/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static int field_b;
    static int field_a;
    static int field_c;
    static dl[] field_d;

    final static void a(byte[] param0, boolean param1) {
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
        ng var16 = null;
        ng var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
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
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var15 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var16 = new ng(param0);
              var17 = var16;
              var17.field_f = -2 + param0.length;
              mg.field_a = var17.c((byte) -7);
              jm.field_a = new int[mg.field_a];
              uo.field_k = new int[mg.field_a];
              ng.field_g = new byte[mg.field_a][];
              rh.field_a = new boolean[mg.field_a];
              je.field_c = new int[mg.field_a];
              ui.field_c = new byte[mg.field_a][];
              uo.field_l = new int[mg.field_a];
              var17.field_f = param0.length - (7 - -(mg.field_a * 8));
              km.field_c = var17.c((byte) -7);
              if (param1) {
                break L1;
              } else {
                byte[] discarded$3 = h.a((byte) 24, 15);
                break L1;
              }
            }
            bo.field_o = var17.c((byte) -7);
            var3 = (255 & var17.h(255)) - -1;
            var4 = 0;
            L2: while (true) {
              if (mg.field_a <= var4) {
                var4 = 0;
                L3: while (true) {
                  if (mg.field_a <= var4) {
                    var4 = 0;
                    L4: while (true) {
                      if (mg.field_a <= var4) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= mg.field_a) {
                            var17.field_f = -(mg.field_a * 8) + -7 + (param0.length + -(var3 * 3) - -3);
                            gh.field_z = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var17.field_f = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (mg.field_a <= var4) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = uo.field_l[var4];
                                      var6 = je.field_c[var4];
                                      var7 = var5 * var6;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      ui.field_c[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      ng.field_g[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.h(255);
                                      if (0 == (1 & var11)) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var7 <= var12) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    byte dupTemp$4 = var17.d((byte) -113);
                                                    var9[var12] = dupTemp$4;
                                                    var13 = dupTemp$4;
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
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var8[var12] = var17.d((byte) 124);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var5 <= var12) {
                                            if (0 == (2 & var11)) {
                                              break L8;
                                            } else {
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
                                                        byte dupTemp$5 = var17.d((byte) 119);
                                                        var9[var13 * var5 + var12] = dupTemp$5;
                                                        var14 = dupTemp$5;
                                                        stackOut_34_0 = var10;
                                                        stackIn_36_0 = stackOut_34_0;
                                                        stackIn_35_0 = stackOut_34_0;
                                                        if (var14 == -1) {
                                                          stackOut_36_0 = stackIn_36_0;
                                                          stackOut_36_1 = 0;
                                                          stackIn_37_0 = stackOut_36_0;
                                                          stackIn_37_1 = stackOut_36_1;
                                                          break L15;
                                                        } else {
                                                          stackOut_35_0 = stackIn_35_0;
                                                          stackOut_35_1 = 1;
                                                          stackIn_37_0 = stackOut_35_0;
                                                          stackIn_37_1 = stackOut_35_1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_37_0 | stackIn_37_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var12 - -(var13 * var5)] = var17.d((byte) -33);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    rh.field_a[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  gh.field_z[var4] = var17.b(false);
                                  if (gh.field_z[var4] != 0) {
                                    break L17;
                                  } else {
                                    gh.field_z[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            je.field_c[var4] = var17.c((byte) -7);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        uo.field_l[var4] = var17.c((byte) -7);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    jm.field_a[var4] = var17.c((byte) -7);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                uo.field_k[var4] = var16.c((byte) -7);
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
            stackOut_52_1 = new StringBuilder().append("h.C(");
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
          throw dn.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 0) {
            h.a(-16);
        }
    }

    final synchronized static byte[] a(byte param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (so.field_e <= 0) {
              break L0;
            } else {
              int fieldTemp$4 = so.field_e - 1;
              so.field_e = so.field_e - 1;
              var2_ref_byte__ = mn.field_i[fieldTemp$4];
              mn.field_i[so.field_e] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param1 != 5000) {
            break L1;
          } else {
            if (je.field_e <= 0) {
              break L1;
            } else {
              byte[][] fieldTemp$5 = tg.field_e;
              int fieldTemp$6 = je.field_e - 1;
              je.field_e = je.field_e - 1;
              var2_ref_byte__ = fieldTemp$5[fieldTemp$6];
              tg.field_e[je.field_e] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param0 == 26) {
            break L2;
          } else {
            field_d = null;
            break L2;
          }
        }
        L3: {
          if (param1 != 30000) {
            break L3;
          } else {
            if (ed.field_z > 0) {
              int fieldTemp$7 = ed.field_z - 1;
              ed.field_z = ed.field_z - 1;
              var2_ref_byte__ = oc.field_a[fieldTemp$7];
              oc.field_a[ed.field_z] = null;
              return var2_ref_byte__;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (null == lp.field_a) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (~kk.field_e.length >= ~var2) {
                break L4;
              } else {
                L6: {
                  if (~kk.field_e[var2] != ~param1) {
                    break L6;
                  } else {
                    if (jd.field_K[var2] <= 0) {
                      break L6;
                    } else {
                      jd.field_K[var2] = jd.field_K[var2] - 1;
                      var3 = lp.field_a[var2][jd.field_K[var2] - 1];
                      lp.field_a[var2][jd.field_K[var2]] = null;
                      return var3;
                    }
                  }
                }
                var2++;
                continue L5;
              }
            }
          }
        }
        return new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        qd.a(-82, 50);
    }
}
