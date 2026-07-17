/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b implements fe {
    private int field_c;
    private int field_m;
    private ok field_g;
    private int field_i;
    static int field_f;
    private int field_n;
    private int field_b;
    static ve field_a;
    private int field_o;
    private int field_e;
    private int field_p;
    private int field_d;
    private int field_h;
    private int field_l;
    static String field_k;
    static String field_j;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        fa var12 = null;
        fj stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        fj stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof fa) {
                stackOut_2_0 = (fj) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (fj) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var12 = (fa) (Object) stackIn_3_0;
              if (var12 == null) {
                break L2;
              } else {
                param2 = param2 & var12.field_L;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (param2) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              fn.e(param1 + param3.field_q, param3.field_m + param4, param3.field_F, param3.field_z, ((b) this).field_c);
              var8 = param3.field_q + (param1 + ((b) this).field_h);
              if (param0 < -97) {
                break L4;
              } else {
                var11 = null;
                ((b) this).a((byte) 21, -47, false, (fj) null, -45);
                break L4;
              }
            }
            L5: {
              var9 = param3.field_m + (param4 + ((b) this).field_m);
              fn.d(var8, var9, ((b) this).field_i, ((b) this).field_d, 5592405);
              fn.e(var8, var9, ((b) this).field_i, ((b) this).field_d, var7);
              if (!var12.field_O) {
                break L5;
              } else {
                fn.f(var8, var9, ((b) this).field_i + var8, var9 + ((b) this).field_d, 1);
                fn.f(((b) this).field_i + var8, var9, var8, var9 + ((b) this).field_d, 1);
                break L5;
              }
            }
            L6: {
              if (null == ((b) this).field_g) {
                break L6;
              } else {
                var10 = ((b) this).field_i + ((b) this).field_h + ((b) this).field_l;
                int discarded$1 = ((b) this).field_g.a(param3.field_B, param1 + param3.field_q + var10, ((b) this).field_o + (param3.field_m + param4), param3.field_F - (((b) this).field_l + var10), param3.field_z - (((b) this).field_l << 1), ((b) this).field_b, ((b) this).field_n, ((b) this).field_e, ((b) this).field_p, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("b.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
        }
    }

    final static int a(boolean param0, int param1, byte param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (2 > param1) {
                break L1;
              } else {
                if (param1 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_38_0 = var6;
                        stackIn_39_0 = stackOut_38_0;
                        break L0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param3.charAt(var8);
                          if (0 == var8) {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L3;
                            } else {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (var9 < 48) {
                              break L6;
                            } else {
                              if (var9 > 57) {
                                break L6;
                              } else {
                                var9 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (65 > var9) {
                              break L7;
                            } else {
                              if (90 < var9) {
                                break L7;
                              } else {
                                var9 -= 55;
                                break L5;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 97) {
                              break L8;
                            } else {
                              if (var9 > 122) {
                                break L8;
                              } else {
                                var9 -= 87;
                                break L5;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 >= param1) {
                          throw new NumberFormatException();
                        } else {
                          L9: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = param1 * var6 + var9;
                          if (var6 == var10 / param1) {
                            var6 = var10;
                            var5 = 1;
                            break L3;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("b.D(").append(1).append(44).append(param1).append(44).append(16).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param3 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 41);
        }
        return stackIn_39_0;
    }

    final static String a(String[] args, String param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.length();
              var4 = var3_int;
              if (param2 == 1177) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int >= 0) {
                var5 = var6_int + 2;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3_int) {
                      break L4;
                    } else {
                      int discarded$5 = -58;
                      if (!hc.a(param1.charAt(var5))) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(2 + var6_int, var5);
                  if (!vl.a((CharSequence) (Object) var7_ref_String, -182)) {
                    continue L2;
                  } else {
                    if (var5 >= var3_int) {
                      continue L2;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L2;
                      } else {
                        var5++;
                        var8 = cc.a(true, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (args[var8].length() - (-var6_int + var5));
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var5 = 0;
                var7 = 0;
                L5: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (0 <= var8) {
                    var5 = var8 + 2;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          int discarded$6 = -58;
                          if (!hc.a(param1.charAt(var5))) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param1.substring(2 + var8, var5);
                      if (vl.a((CharSequence) (Object) var9, param2 + -1359)) {
                        if (var3_int <= var5) {
                          continue L5;
                        } else {
                          if (param1.charAt(var5) != 62) {
                            continue L5;
                          } else {
                            var5++;
                            var10 = cc.a(true, (CharSequence) (Object) var9);
                            StringBuilder discarded$7 = var6.append(param1.substring(var7, var8));
                            StringBuilder discarded$8 = var6.append(args[var10]);
                            var7 = var5;
                            continue L5;
                          }
                        }
                      } else {
                        continue L5;
                      }
                    }
                  } else {
                    StringBuilder discarded$9 = var6.append(param1.substring(var7));
                    stackOut_26_0 = var6.toString();
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("b.B(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (args == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
        return stackIn_27_0;
    }

    final static void a(df param0, int param1, kg param2, int param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            var14 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                var18 = (Object) (Object) new dg();
                ((dg) var18).field_r = param2.c(32);
                ((dg) var18).field_t = param2.f((byte) 67);
                ((dg) var18).field_q = new bc[((dg) var18).field_r];
                ((dg) var18).field_u = new int[((dg) var18).field_r];
                ((dg) var18).field_o = new int[((dg) var18).field_r];
                ((dg) var18).field_s = new byte[((dg) var18).field_r][][];
                ((dg) var18).field_m = new bc[((dg) var18).field_r];
                ((dg) var18).field_v = new int[((dg) var18).field_r];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= ((dg) var18).field_r) {
                    af.field_cb.a((rk) var18, (byte) -82);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            L5: {
                              var6_int = param2.c(32);
                              if (0 == var6_int) {
                                break L5;
                              } else {
                                if (var6_int == 1) {
                                  break L5;
                                } else {
                                  if (var6_int == 2) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (3 == var6_int) {
                                        break L6;
                                      } else {
                                        if (var6_int != 4) {
                                          break L4;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var20 = param2.d(true);
                                    var21 = param2.d(true);
                                    var9 = param2.c(32);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L7: while (true) {
                                      if (var11_int >= var9) {
                                        L8: {
                                          var24 = new byte[var9][];
                                          var23 = var24;
                                          var22 = var23;
                                          var19 = var22;
                                          var11 = var19;
                                          if (3 != var6_int) {
                                            break L8;
                                          } else {
                                            var12_int = 0;
                                            L9: while (true) {
                                              if (var12_int >= var9) {
                                                break L8;
                                              } else {
                                                var13 = param2.f((byte) 112);
                                                var11[var12_int] = new byte[var13];
                                                param2.a(0, (byte) 87, var13, var24[var12_int]);
                                                var12_int++;
                                                continue L9;
                                              }
                                            }
                                          }
                                        }
                                        ((dg) var18).field_o[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L10: while (true) {
                                          if (~var9 >= ~var17) {
                                            ((dg) var18).field_q[var5] = param0.a((byte) -107, pi.a((byte) 81, var20), var12, var21);
                                            ((dg) var18).field_s[var5] = var24;
                                            break L3;
                                          } else {
                                            var12[var17] = pi.a((byte) 94, var10[var17]);
                                            var17++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param2.d(true);
                                        var11_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L11: {
                              var15 = param2.d(true);
                              var16 = param2.d(true);
                              var9 = 0;
                              if (var6_int != 1) {
                                break L11;
                              } else {
                                var9 = param2.f((byte) 118);
                                break L11;
                              }
                            }
                            ((dg) var18).field_o[var5] = var6_int;
                            ((dg) var18).field_v[var5] = var9;
                            ((dg) var18).field_m[var5] = param0.a(0, pi.a((byte) 98, var15), var16);
                            break L4;
                          }
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((dg) var18).field_u[var5] = -1;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((dg) var18).field_u[var5] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        ((dg) var18).field_u[var5] = -5;
                        break L16;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) var4;
                stackOut_34_1 = new StringBuilder().append("b.E(");
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param0 == null) {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L17;
                } else {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L17;
                }
              }
              L18: {
                stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44).append(-85).append(44);
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param2 == null) {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L18;
                } else {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L18;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_a = null;
        field_k = null;
        field_j = null;
    }

    b(ok param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((b) this).field_e = 1;
        ((b) this).field_p = 1;
        try {
            ((b) this).field_o = param2;
            ((b) this).field_d = param7;
            ((b) this).field_l = param1;
            ((b) this).field_h = param5;
            ((b) this).field_g = param0;
            ((b) this).field_i = param8;
            ((b) this).field_b = param3;
            ((b) this).field_c = param9;
            ((b) this).field_m = param6;
            ((b) this).field_n = param4;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "b.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_a = new ve();
        field_j = "Look out for <col=FFFFFF>extra life</col> power-ups!";
    }
}
