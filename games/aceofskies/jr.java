/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr extends wt {
    static String field_p;
    private int[][] field_s;
    static boolean field_u;
    private String[] field_q;
    static int[] field_n;
    private int[] field_o;
    static String field_r;
    int[] field_t;

    public static void a() {
        field_r = null;
        field_n = null;
        field_p = null;
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 32) {
            break L0;
          } else {
            boolean discarded$2 = jr.a((byte) 88);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ob.field_d < 10) {
              break L2;
            } else {
              if (13 > bl.field_c) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
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
        rb var17 = null;
        rb var18 = null;
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
        var15 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var17 = new rb(param0);
            var18 = var17;
            var18.field_g = param0.length + -2;
            to.field_t = var18.i((byte) 0);
            ji.field_b = new int[to.field_t];
            lh.field_a = new int[to.field_t];
            q.field_k = new boolean[to.field_t];
            lg.field_j = new int[to.field_t];
            ql.field_p = new byte[to.field_t][];
            fk.field_a = new byte[to.field_t][];
            ee.field_e = new int[to.field_t];
            var18.field_g = -(to.field_t * 8) + (-7 + param0.length);
            pu.field_a = var18.i((byte) 0);
            cc.field_i = var18.i((byte) 0);
            var3 = (var18.g(param1 ^ 7055) & 255) - -1;
            var4 = 0;
            L1: while (true) {
              if (to.field_t <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= to.field_t) {
                    L3: {
                      if (param1 == 7148) {
                        break L3;
                      } else {
                        var16 = null;
                        jr.a((byte[]) null, -128);
                        break L3;
                      }
                    }
                    var4 = 0;
                    L4: while (true) {
                      if (to.field_t <= var4) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= to.field_t) {
                            var18.field_g = param0.length + -7 + -(to.field_t * 8) - (-3 + 3 * var3);
                            ud.field_e = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var18.field_g = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= to.field_t) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = ji.field_b[var4];
                                      var6 = ee.field_e[var4];
                                      var7 = var5 * var6;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var8 = var19;
                                      fk.field_a[var4] = var25;
                                      var26 = new byte[var7];
                                      var24 = var26;
                                      var22 = var24;
                                      var20 = var22;
                                      var9 = var20;
                                      ql.field_p[var4] = var26;
                                      var10 = 0;
                                      var11 = var18.g(param1 ^ 7088);
                                      if (0 == (var11 & 1)) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var7 <= var12) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    byte dupTemp$2 = var18.d(id.a(param1, 7148));
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
                                            var8[var12] = var18.d(param1 + -7148);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var12 >= var5) {
                                            if ((var11 & 2) == 0) {
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
                                                        byte dupTemp$3 = var18.d(0);
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
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var13 * var5 + var12] = var18.d(0);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    q.field_k[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  ud.field_e[var4] = var18.g((byte) -107);
                                  if (ud.field_e[var4] == 0) {
                                    ud.field_e[var4] = 1;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            ee.field_e[var4] = var18.i((byte) 0);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        ji.field_b[var4] = var18.i((byte) 0);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    lg.field_j[var4] = var18.i((byte) 0);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                lh.field_a[var4] = var17.i((byte) 0);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var2;
            stackOut_52_1 = new StringBuilder().append("jr.B(");
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
          throw pn.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + param1 + ')');
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (!(null != ((jr) this).field_q)) {
            return "";
        }
        StringBuilder discarded$8 = var6.append(((jr) this).field_q[0]);
        if (param0 != 1) {
            Object var5 = null;
            jr.a((byte[]) null, 105);
        }
        for (var3 = 1; ((jr) this).field_q.length > var3; var3++) {
            StringBuilder discarded$9 = var2.append("...");
            StringBuilder discarded$10 = var6.append(((jr) this).field_q[var3]);
        }
        return var2.toString();
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (!param0) {
            return;
        }
        if (null != ((jr) this).field_t) {
            for (var2 = 0; var2 < ((jr) this).field_t.length; var2++) {
                ((jr) this).field_t[var2] = vo.a(((jr) this).field_t[var2], 32768);
            }
        }
    }

    private final void a(rb param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ej var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                ((jr) this).field_q = ee.a((byte) 10, '<', param0.h(-17883));
                break L1;
              } else {
                if (param2 == 2) {
                  var4_int = param0.g(-61);
                  ((jr) this).field_t = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      ((jr) this).field_t[var5] = param0.i((byte) 0);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (3 != param2) {
                    if (param2 != 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param0.g(82);
                    ((jr) this).field_o = new int[var4_int];
                    ((jr) this).field_s = new int[var4_int][];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param0.i((byte) 0);
                          var7 = ks.a(var6, -28228);
                          if (var7 != null) {
                            ((jr) this).field_o[var5] = var6;
                            ((jr) this).field_s[var5] = new int[var7.field_c];
                            var8 = 0;
                            L5: while (true) {
                              if (var7.field_c <= var8) {
                                break L4;
                              } else {
                                ((jr) this).field_s[var5][var8] = param0.i((byte) 0);
                                var8++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("jr.G(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + -112 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, rb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.g(99);
              if (var3_int == 0) {
                L2: {
                  if (param0 > 99) {
                    break L2;
                  } else {
                    field_n = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                this.a(param1, -112, var3_int);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("jr.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    jr() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[16384];
        field_r = "Please wait...";
        field_p = "Invalid password.";
    }
}
