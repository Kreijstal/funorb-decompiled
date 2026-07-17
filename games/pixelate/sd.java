/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ie {
    int field_O;
    static int[] field_Q;
    static String field_J;
    static ak field_P;
    static int field_K;
    static boolean field_N;
    static String field_M;
    static int field_L;
    static boolean field_I;

    public static void a(byte param0) {
        int var1 = 0;
        field_Q = null;
        field_M = null;
        field_J = null;
        field_P = null;
    }

    sd(ng param0) {
        super(param0.field_z, param0.field_p, param0.field_E, param0.field_C, (eb) null, (fn) null);
        try {
            param0.a(((sd) this).field_E, (byte) 89, 0, 0, ((sd) this).field_C);
            ((sd) this).field_O = 256;
            ((sd) this).field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sd.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param1 != 0) {
            return;
        }
        if (!(null != ((sd) this).field_H)) {
            return;
        }
        if (!(((sd) this).field_O != 0)) {
            return;
        }
        if (!(256 != ((sd) this).field_O)) {
            ((sd) this).field_H.a(param0 + ((sd) this).field_p, param1, param2 + ((sd) this).field_z, (byte) 122);
            return;
        }
        tf var7 = new tf(((sd) this).field_H.field_E, ((sd) this).field_H.field_C);
        h.a(-111, var7);
        int var6 = -5 % ((70 - param3) / 49);
        ((sd) this).field_H.a(0, param1, 0, (byte) -79);
        ia.a((byte) 92);
        var7.a(((sd) this).field_z + param2, ((sd) this).field_p + param0, ((sd) this).field_O);
    }

    final static String a(String param0, int param1, String[] param2) {
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
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_27_0 = null;
        Object stackOut_25_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (0 <= var6_int) {
                var5 = 2 + var6_int;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!ti.a(121, param0.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int + 2, var5);
                  if (!td.a(-128, (CharSequence) (Object) var7_ref_String)) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = na.a((CharSequence) (Object) var7_ref_String, (byte) -33);
                        var4 = var4 + (param2[var8].length() + var6_int + -var5);
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L4: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (0 <= var8) {
                    var5 = 2 + var8;
                    L5: while (true) {
                      L6: {
                        if (var5 >= var3_int) {
                          break L6;
                        } else {
                          if (!ti.a(112, param0.charAt(var5))) {
                            break L6;
                          } else {
                            var5++;
                            continue L5;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (!td.a(-105, (CharSequence) (Object) var9)) {
                        continue L4;
                      } else {
                        if (var3_int <= var5) {
                          continue L4;
                        } else {
                          if (62 == param0.charAt(var5)) {
                            var5++;
                            var10 = na.a((CharSequence) (Object) var9, (byte) -33);
                            StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                            StringBuilder discarded$4 = var6.append(param2[var10]);
                            var7 = var5;
                            continue L4;
                          } else {
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    StringBuilder discarded$5 = var6.append(param0.substring(var7));
                    if (param1 > 17) {
                      stackOut_27_0 = var6.toString();
                      stackIn_28_0 = stackOut_27_0;
                      break L0;
                    } else {
                      stackOut_25_0 = null;
                      stackIn_26_0 = stackOut_25_0;
                      return (String) (Object) stackIn_26_0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("sd.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          L8: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param1).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_28_0;
    }

    final static void a(byte param0, rh param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        pc var7 = null;
        pc var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var7 = aa.field_f;
            var8 = var7;
            var8.g(param2, 15514);
            var8.field_m = var8.field_m + 1;
            var4 = var8.field_m;
            var8.e(160, 1);
            var8.b(1276387944, param1.field_o);
            var8.b(1276387944, param1.field_t);
            var8.b(1276387944, param1.field_p);
            var8.d(param1.field_s, -93);
            var8.d(param1.field_v, -71);
            var8.d(param1.field_l, -40);
            var8.d(param1.field_n, -71);
            var8.e(160, param1.field_k.length);
            var5 = 0;
            L1: while (true) {
              if (param1.field_k.length <= var5) {
                L2: {
                  if (param0 < -37) {
                    break L2;
                  } else {
                    field_I = false;
                    break L2;
                  }
                }
                int discarded$1 = var8.b(var4, (byte) 86);
                var8.f(var8.field_m + -var4, -1);
                break L0;
              } else {
                var7.d(param1.field_k[var5], -123);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("sd.F(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    public sd() {
        super(0, 0, 0, 0, (eb) null, (fn) null);
        ((sd) this).field_O = 256;
    }

    final static void a(byte param0, byte[] param1) {
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
        we var17 = null;
        we var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var17 = new we(param1);
            var18 = var17;
            var18.field_m = -2 + param1.length;
            im.field_Qb = var18.a((byte) 97);
            gd.field_k = new byte[im.field_Qb][];
            rl.field_m = new boolean[im.field_Qb];
            gf.field_g = new int[im.field_Qb];
            ge.field_c = new int[im.field_Qb];
            fa.field_b = new int[im.field_Qb];
            e.field_b = new int[im.field_Qb];
            wo.field_f = new byte[im.field_Qb][];
            var18.field_m = -7 + (param1.length - 8 * im.field_Qb);
            tj.field_y = var18.a((byte) 38);
            jb.field_a = var18.a((byte) 46);
            var3 = 1 + (var18.f(255) & 255);
            var4 = 0;
            L1: while (true) {
              if (var4 >= im.field_Qb) {
                L2: {
                  if (param0 == -95) {
                    break L2;
                  } else {
                    var16 = null;
                    String discarded$3 = sd.a((String) null, 80, (String[]) null);
                    break L2;
                  }
                }
                var4 = 0;
                L3: while (true) {
                  if (var4 >= im.field_Qb) {
                    var4 = 0;
                    L4: while (true) {
                      if (im.field_Qb <= var4) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= im.field_Qb) {
                            var18.field_m = param1.length - (7 - (-(8 * im.field_Qb) - 3 * (-1 + var3)));
                            fl.field_g = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var18.field_m = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= im.field_Qb) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = gf.field_g[var4];
                                      var6 = ge.field_c[var4];
                                      var7 = var5 * var6;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var8 = var19;
                                      wo.field_f[var4] = var25;
                                      var26 = new byte[var7];
                                      var24 = var26;
                                      var22 = var24;
                                      var20 = var22;
                                      var9 = var20;
                                      gd.field_k[var4] = var26;
                                      var10 = 0;
                                      var11 = var18.f(255);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var5) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L11: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L10;
                                                    } else {
                                                      L12: {
                                                        byte dupTemp$4 = var18.a(0);
                                                        var9[var12 + var13 * var5] = dupTemp$4;
                                                        var14 = dupTemp$4;
                                                        stackOut_45_0 = var10;
                                                        stackIn_47_0 = stackOut_45_0;
                                                        stackIn_46_0 = stackOut_45_0;
                                                        if (var14 == -1) {
                                                          stackOut_47_0 = stackIn_47_0;
                                                          stackOut_47_1 = 0;
                                                          stackIn_48_0 = stackOut_47_0;
                                                          stackIn_48_1 = stackOut_47_1;
                                                          break L12;
                                                        } else {
                                                          stackOut_46_0 = stackIn_46_0;
                                                          stackOut_46_1 = 1;
                                                          stackIn_48_0 = stackOut_46_0;
                                                          stackIn_48_1 = stackOut_46_1;
                                                          break L12;
                                                        }
                                                      }
                                                      var10 = stackIn_48_0 | stackIn_48_1;
                                                      var13++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L13: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L9;
                                              } else {
                                                var8[var12 + var5 * var13] = var18.a(0);
                                                var13++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L14: while (true) {
                                          if (var7 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L15: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L16: {
                                                    byte dupTemp$5 = var18.a(bn.a((int) param0, -95));
                                                    var9[var12] = dupTemp$5;
                                                    var13 = dupTemp$5;
                                                    stackOut_29_0 = var10;
                                                    stackIn_31_0 = stackOut_29_0;
                                                    stackIn_30_0 = stackOut_29_0;
                                                    if (-1 == var13) {
                                                      stackOut_31_0 = stackIn_31_0;
                                                      stackOut_31_1 = 0;
                                                      stackIn_32_0 = stackOut_31_0;
                                                      stackIn_32_1 = stackOut_31_1;
                                                      break L16;
                                                    } else {
                                                      stackOut_30_0 = stackIn_30_0;
                                                      stackOut_30_1 = 1;
                                                      stackIn_32_0 = stackOut_30_0;
                                                      stackIn_32_1 = stackOut_30_1;
                                                      break L16;
                                                    }
                                                  }
                                                  var10 = stackIn_32_0 | stackIn_32_1;
                                                  var12++;
                                                  continue L15;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var18.a(0);
                                            var12++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                    rl.field_m[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  fl.field_g[var4] = var18.c((byte) 13);
                                  if (0 != fl.field_g[var4]) {
                                    break L17;
                                  } else {
                                    fl.field_g[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            ge.field_c[var4] = var18.a((byte) -116);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        gf.field_g[var4] = var18.a((byte) -14);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    e.field_b[var4] = var18.a((byte) -122);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                fa.field_b[var4] = var17.a((byte) 88);
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
            stackOut_52_1 = new StringBuilder().append("sd.E(").append(param0).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 41);
        }
    }

    final static void a(boolean param0, int param1) {
        pc var2 = aa.field_f;
        if (!param0) {
            return;
        }
        var2.g(param1, 15514);
        var2.e(160, 1);
        var2.e(160, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_Q = new int[64];
        for (var0 = 0; field_Q.length > var0; var0++) {
            field_Q[var0] = 256 / field_Q.length * (65793 * var0);
        }
        field_J = "Show players in <%0>'s game";
        field_M = "Create a free Account";
    }
}
