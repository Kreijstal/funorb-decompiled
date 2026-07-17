/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class mj extends gh {
    static double field_Xb;
    static String field_ac;
    private gh[] field_Ub;
    static kg field_Sb;
    private gh[] field_Tb;
    int field_bc;
    private gh field_Wb;
    static int field_cc;
    static de field_Vb;
    static gh field_Zb;
    static ja field_Yb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((mj) this).field_zb = param3;
        ((mj) this).field_Lb = param1;
        ((mj) this).field_eb = param6;
        ((mj) this).field_Y = param4;
        if (param0 != 10) {
            return;
        }
        this.a(param2, param5, 0);
    }

    final static void a(ak param0, int param1, int param2, int param3) {
        try {
            cl.field_b = param1;
            int var4_int = 0;
            ok.field_c = param2;
            gl.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "mj.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + -89 + 41);
        }
    }

    final static String b(long param0, int param1) {
        pg.field_x.setTime(new Date(param0));
        int var3 = pg.field_x.get(7);
        int var4 = pg.field_x.get(5);
        int var5 = pg.field_x.get(2);
        int var6 = pg.field_x.get(1);
        if (param1 != 0) {
            return null;
        }
        int var7 = pg.field_x.get(11);
        int var8 = pg.field_x.get(12);
        int var9 = pg.field_x.get(13);
        return cf.field_t[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ee.field_jb[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    mj(long param0, gh param1, String[] param2, gh param3, gh[] param4, int param5) {
        super(param0, (gh) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        gh var9 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            ((mj) this).field_Ub = new gh[param2.length];
            ((mj) this).field_Wb = new gh(0L, param3);
            ((mj) this).field_Tb = param4;
            var8_int = 0;
            L1: while (true) {
              if (param2.length <= var8_int) {
                ((mj) this).a(((mj) this).field_Wb, 120);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    ((mj) this).field_bc = param5;
                    ((mj) this).field_Ub[param5].field_G = true;
                    break L0;
                  } else {
                    ((mj) this).field_Wb.a(param4[var11], 126);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new gh(0L, param1);
                var9.field_S = param2[var8_int];
                ((mj) this).field_Ub[var8_int] = var9;
                ((mj) this).a(var9, 124);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("mj.<init>(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param5 + 41);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = SteelSentinels.field_G;
        var4 = 0;
        L0: while (true) {
          if (((mj) this).field_Ub.length <= var4) {
            ((mj) this).field_Wb.a(0, param1, ((mj) this).field_Lb + -param1, 0, ((mj) this).field_zb);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (((mj) this).field_Tb.length <= var8) {
                return;
              } else {
                ((mj) this).field_Tb[var8].a(0, param0, -(2 * param0) + ((mj) this).field_Wb.field_Lb, param0, -(param0 * 2) + ((mj) this).field_Wb.field_zb);
                if (((mj) this).field_bc != var8) {
                  ((mj) this).field_Tb[var8].field_Y = ((mj) this).field_Tb[var8].field_Y + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = ((mj) this).field_zb * var4 / ((mj) this).field_Ub.length;
            var6 = (1 + var4) * ((mj) this).field_zb / ((mj) this).field_Ub.length;
            ((mj) this).field_Ub[var4].field_Y = var5;
            ((mj) this).field_Ub[var4].field_eb = 0;
            ((mj) this).field_Ub[var4].field_zb = var6 + -var5;
            ((mj) this).field_Ub[var4].field_Lb = param1;
            var4++;
            continue L0;
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  if (param0 == 49) {
                    var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                    param1.getAppletContext().showDocument(ge.a(param0 + -49, var2, param1), "_top");
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("mj.D(").append(param0).append(44);
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
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        field_Vb = null;
        field_Sb = null;
        field_Yb = null;
        field_Zb = null;
        field_ac = null;
    }

    final static void b(String param0, byte param1) {
        try {
            int var2_int = 46 % ((6 - param1) / 37);
            d.field_U = param0;
            hc.a(12, 0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "mj.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = 0;
        if (param0 == 10000) {
          L0: while (true) {
            if (((mj) this).field_Ub.length <= var2) {
              return;
            } else {
              if (var2 != ((mj) this).field_bc) {
                if (0 != ((mj) this).field_Ub[var2].field_Eb) {
                  ((mj) this).field_Ub[((mj) this).field_bc].field_G = false;
                  ((mj) this).field_Tb[((mj) this).field_bc].field_Y = ((mj) this).field_Tb[((mj) this).field_bc].field_Y + 10000;
                  ((mj) this).field_bc = var2;
                  ((mj) this).field_Ub[var2].field_G = true;
                  ((mj) this).field_Tb[var2].field_Y = ((mj) this).field_Tb[var2].field_Y - 10000;
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_9_0 = null;
        var16 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param2 > 32767) {
                param2 = 32767;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (~(1 + param3) >= ~fm.field_f[param0]) {
                if (param0 == 1) {
                  if (param2 < jh.field_a[param3]) {
                    jh.field_a[param3] = param2;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  if (param0 == 2) {
                    if (~param2 > ~jh.field_a[10 + param3]) {
                      jh.field_a[param3 + 10] = param2;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              } else {
                L3: {
                  fm.field_f[param0] = 1 + param3;
                  if (param0 != 0) {
                    break L3;
                  } else {
                    if (fm.field_f[param0] == fj.field_d) {
                      L4: {
                        if (ni.b(122)) {
                          stackOut_10_0 = td.field_ac;
                          stackIn_11_0 = stackOut_10_0;
                          break L4;
                        } else {
                          stackOut_9_0 = ee.field_k;
                          stackIn_11_0 = stackOut_9_0;
                          break L4;
                        }
                      }
                      L5: {
                        km.field_a = stackIn_11_0;
                        if (jc.field_f < 1) {
                          jc.field_f = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ln.field_g = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L6: {
                  if (param0 != 0) {
                    break L6;
                  } else {
                    if (10 != fm.field_f[param0]) {
                      break L6;
                    } else {
                      if (ni.b(38)) {
                        km.field_a = ra.field_b;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  if (1 == param0) {
                    jh.field_a[param3] = param2;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (param0 == 2) {
                  jh.field_a[param3 + 10] = param2;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L8: {
              if (!ni.b(85)) {
                mm.field_g.a(71, (byte) -117);
                mm.field_g.a((byte) 114, 10 * param0 + param3);
                mm.field_g.d(param2, 54);
                mm.field_g.b(true, param5);
                mm.field_g.b(true, param1);
                mm.field_g.b(true, param6);
                mm.field_g.b(true, param4);
                break L8;
              } else {
                jb.field_P = jb.field_P | 1 << 10 * param0 + param3;
                break L8;
              }
            }
            var8_array = d.field_T[10 * param0 + param3];
            var9 = bi.field_e[param3 + param0 * 10];
            var10 = 0;
            var11 = 0;
            var18 = var8_array;
            var13 = 0;
            L9: while (true) {
              if (var13 >= var18.length) {
                var19 = var9;
                var17 = 0;
                var13 = var17;
                L10: while (true) {
                  if (var19.length <= var17) {
                    ad.field_i = new int[var10];
                    vk.field_g = new int[var11];
                    var12 = 0;
                    var20 = var8_array;
                    var14 = 0;
                    L11: while (true) {
                      if (~var14 <= ~var20.length) {
                        var12 = 0;
                        var21 = var9;
                        var14 = 0;
                        L12: while (true) {
                          if (~var14 <= ~var21.length) {
                            L13: {
                              L14: {
                                if (var10 > 0) {
                                  break L14;
                                } else {
                                  if (var11 <= 0) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              vn.d(-106);
                              var12 = 0;
                              L15: while (true) {
                                if (va.field_k.length <= var12) {
                                  break L13;
                                } else {
                                  va.field_k[var12] = 0;
                                  var12++;
                                  continue L15;
                                }
                              }
                            }
                            break L0;
                          } else {
                            L16: {
                              var15 = var21[var14];
                              if (t.a(fe.field_D, var15, -20370)) {
                                break L16;
                              } else {
                                int incrementValue$2 = var12;
                                var12++;
                                vk.field_g[incrementValue$2] = var15;
                                break L16;
                              }
                            }
                            var14++;
                            continue L12;
                          }
                        }
                      } else {
                        L17: {
                          var15 = var20[var14];
                          if (!t.a(rn.field_D, var15, -20370)) {
                            int incrementValue$3 = var12;
                            var12++;
                            ad.field_i[incrementValue$3] = var15;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var14++;
                        continue L11;
                      }
                    }
                  } else {
                    L18: {
                      var14 = var19[var17];
                      if (!t.a(fe.field_D, var14, -20370)) {
                        var11++;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    var17++;
                    continue L10;
                  }
                }
              } else {
                L19: {
                  var14 = var18[var13];
                  if (!t.a(rn.field_D, var14, -20370)) {
                    var10++;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                var13++;
                continue L9;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var8, "mj.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + -65 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ac = "Private";
        field_Xb = Math.atan2(1.0, 0.0);
        field_Vb = new de("usename");
        field_Yb = new ja();
    }
}
