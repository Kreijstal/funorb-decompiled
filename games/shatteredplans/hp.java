/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends me {
    static int[] field_k;
    static ub field_l;
    static fc field_m;
    static bc field_n;
    private int[] field_q;
    private int[] field_o;
    static int field_p;

    final int b(boolean param0) {
        if (param0) {
            hp.b((byte) -59);
        }
        return rs.field_Cb.field_J - -(((hp) this).field_o.length * cc.field_n);
    }

    final boolean a(dc param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ln[] var3_array = null;
        int var4 = 0;
        ln var5_ref_ln = null;
        int var5 = 0;
        int var6 = 0;
        ln[] var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, (byte) 94)) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= ((hp) this).field_i.length) {
                  var7 = param0.field_g.field_e;
                  var3_array = var7;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= var7.length) {
                      L3: {
                        if (param1 >= 23) {
                          break L3;
                        } else {
                          int discarded$1 = ((hp) this).b(false);
                          break L3;
                        }
                      }
                      var3_int = 0;
                      L4: while (true) {
                        if (((hp) this).field_i.length <= var3_int) {
                          var3_int = 0;
                          var4 = 0;
                          var5 = 0;
                          L5: while (true) {
                            if (((hp) this).field_o.length <= var5) {
                              if (var3_int == 0) {
                                stackOut_27_0 = 0;
                                stackIn_28_0 = stackOut_27_0;
                                return stackIn_28_0 != 0;
                              } else {
                                ((hp) this).field_g = new fs[var3_int];
                                var8 = 0;
                                var5 = var8;
                                L6: while (true) {
                                  if (var8 >= ((hp) this).field_i.length) {
                                    stackOut_35_0 = 1;
                                    stackIn_36_0 = stackOut_35_0;
                                    break L0;
                                  } else {
                                    L7: {
                                      if (((hp) this).field_o[var8] == var4) {
                                        var3_int--;
                                        ((hp) this).field_g[var3_int] = ((hp) this).field_i[var8];
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    var8++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              if ((param0.field_w & 1 << var5) == 0) {
                                L8: {
                                  if (50 > ((hp) this).field_o[var5]) {
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var5++;
                                continue L5;
                              } else {
                                ((hp) this).field_o[var5] = -1;
                                var5++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          ((hp) this).field_o[var3_int] = ((hp) this).field_o[var3_int] + ((hp) this).field_q[var3_int];
                          var3_int++;
                          continue L4;
                        }
                      }
                    } else {
                      L9: {
                        var5_ref_ln = var7[var4];
                        if (2 != var5_ref_ln.field_L) {
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  ((hp) this).field_q[var3_int] = 0;
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("hp.F(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L10;
            }
          }
          throw r.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param1 + ')');
        }
        return stackIn_36_0 != 0;
    }

    hp(fs[] param0) {
        super(param0);
        try {
            ((hp) this).field_o = new int[((hp) this).field_i.length];
            ((hp) this).field_q = new int[((hp) this).field_i.length];
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "hp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ob param1) {
        int var3_int = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            for (var3_int = 0; var3_int < ((hp) this).field_o.length; var3_int++) {
                param1.c(((hp) this).field_o[var3_int], (byte) -92);
            }
            int var4 = -49 % ((-72 - param0) / 45);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "hp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fs[] b(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var5_int = 0;
        fs[] var5 = null;
        int var6 = 0;
        double var6_double = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            field_m = null;
            break L0;
          }
        }
        if (null != ((hp) this).field_g) {
          return ((hp) this).field_g;
        } else {
          var2 = 0;
          var3 = 1.7976931348623157e+308;
          var5_int = 0;
          L1: while (true) {
            if (((hp) this).field_i.length <= var5_int) {
              if (var2 != 0) {
                var5 = new fs[var2];
                var6 = 0;
                L2: while (true) {
                  if (var6 >= ((hp) this).field_i.length) {
                    return var5;
                  } else {
                    if (((hp) this).field_q[var6] != 0) {
                      var7 = (double)(50 + -((hp) this).field_o[var6]) / (double)((hp) this).field_q[var6];
                      if (var3 == var7) {
                        var2--;
                        var5[var2] = ((hp) this).field_i[var6];
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new fs[]{};
              }
            } else {
              if (((hp) this).field_q[var5_int] != 0) {
                if (((hp) this).field_o[var5_int] != 0) {
                  var6_double = (double)(50 + -((hp) this).field_o[var5_int]) / (double)((hp) this).field_q[var5_int];
                  if (var6_double != var3) {
                    if (var3 > var6_double) {
                      var2 = 1;
                      var3 = var6_double;
                      var5_int++;
                      continue L1;
                    } else {
                      var5_int++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    var5_int++;
                    continue L1;
                  }
                } else {
                  var5_int++;
                  continue L1;
                }
              } else {
                var5_int++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                cr.field_d = param2;
                var3 = param1.getParameter("cookieprefix");
                var4 = param1.getParameter("cookiehost");
                var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                if (!(param2.length() != 0)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ll.a(param1, "document.cookie=\"" + var5 + "\"", (byte) 123);
                if (param0 <= 7) {
                    field_n = null;
                }
                h.a(-1, param1);
            } catch (RuntimeException runtimeException) {
                throw r.a((Throwable) (Object) runtimeException, "hp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_m = null;
        field_k = null;
        field_n = null;
        field_l = null;
        int var1 = 29 / ((param0 - 12) / 51);
    }

    final void a(ob param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (((hp) this).field_o.length <= var3_int) {
                L2: {
                  if (param1 == -109) {
                    break L2;
                  } else {
                    var5 = null;
                    hp.a((byte) 83, (java.applet.Applet) null, (String) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                ((hp) this).field_o[var3_int] = param0.g(-2852);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("hp.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, dc param1, kq param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        int[] var6 = null;
        int var7_int = 0;
        fs[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int[] var9 = null;
        int var10_int = 0;
        fs[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        qk[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var34 = new int[((hp) this).field_i.length];
            var29 = var34;
            var24 = var29;
            var18 = var24;
            var16 = var18;
            var36 = var16;
            var31 = var36;
            var26 = var31;
            var20 = var26;
            var4_array = var20;
            if (param0 <= -9) {
              var5 = 0;
              L1: while (true) {
                if (var34.length <= var5) {
                  var5 = 0;
                  var35 = ((hp) this).field_o;
                  var30 = var35;
                  var25 = var30;
                  var19 = var25;
                  var17 = var19;
                  var6 = var17;
                  var7_int = 0;
                  L2: while (true) {
                    if (var7_int >= var35.length) {
                      L3: {
                        if (var5 > 0) {
                          lh.a((byte) 35, var4_array, (int[]) ((hp) this).field_o.clone());
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var23 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[1]))};
                      var7 = new fs[((hp) this).field_i.length];
                      var38 = new int[((hp) this).field_i.length];
                      var33 = var38;
                      var28 = var33;
                      var22 = var28;
                      var8 = var22;
                      var37 = new int[((hp) this).field_i.length];
                      var32 = var37;
                      var27 = var32;
                      var21 = var27;
                      var9 = var21;
                      var10_int = 0;
                      L4: while (true) {
                        if (var10_int >= ((hp) this).field_i.length) {
                          L5: {
                            L6: {
                              var10 = ((hp) this).b(0);
                              if (null != ((hp) this).field_g) {
                                break L6;
                              } else {
                                if (var10.length == 0) {
                                  break L6;
                                } else {
                                  var12 = var10[0].field_x;
                                  var13 = (double)(-((hp) this).field_o[var12] + 50) / (double)((hp) this).field_q[var12];
                                  var11 = (int)Math.ceil(var13);
                                  break L5;
                                }
                              }
                            }
                            var11 = 0;
                            break L5;
                          }
                          param2.a(50, var7, var37, var38, var10, var23, (byte) -47, var11);
                          break L0;
                        } else {
                          var7[var10_int] = ((hp) this).field_i[var36[var10_int]];
                          var8[var10_int] = ((hp) this).field_o[var36[var10_int]];
                          var9[var10_int] = ((hp) this).field_q[var36[var10_int]];
                          var10_int++;
                          continue L4;
                        }
                      }
                    } else {
                      var8_int = var35[var7_int];
                      var5 = var5 + var8_int;
                      var7_int++;
                      continue L2;
                    }
                  }
                } else {
                  var34[var5] = var5;
                  var5++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("hp.I(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[]{800, 400, 200, 120, 80};
    }
}
