/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vf extends hb {
    static String field_f;
    private wb field_g;

    final static void a(int param0, int param1, int param2, boolean param3, ln[] param4, Random param5, ln[] param6) {
        RuntimeException var7 = null;
        ln[][] var7_array = null;
        int[] var8 = null;
        int var9 = 0;
        pf var10_ref_pf = null;
        int var10 = 0;
        ln[] var11_ref_ln__ = null;
        int var11 = 0;
        int var12 = 0;
        ln var13 = null;
        fi[] var14 = null;
        int var15 = 0;
        fi var16 = null;
        ln[] var17_ref_ln__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ln var19_ref_ln = null;
        int var20 = 0;
        int var21 = 0;
        ln var22 = null;
        int var23 = 0;
        int[] var24 = null;
        ln[][] var25 = null;
        ln var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var21 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var25 = new ln[param1][];
            var7_array = var25;
            var29 = new int[param1];
            var28 = var29;
            var27 = var28;
            var24 = var27;
            var8 = var24;
            var9 = 0;
            L1: while (true) {
              if (var9 >= param1) {
                var9 = 0;
                L2: while (true) {
                  if (param1 <= var9) {
                    break L0;
                  } else {
                    var10 = 1 + var9;
                    L3: while (true) {
                      if (var10 >= param1) {
                        var9++;
                        continue L2;
                      } else {
                        var11 = qf.a((byte) 76, var29[var9], param5);
                        var12 = 0;
                        L4: while (true) {
                          L5: {
                            if (var29[var9] <= var12) {
                              break L5;
                            } else {
                              L6: {
                                var26 = var25[var9][(var12 + var11) % var29[var9]];
                                if (var26.field_x == var9) {
                                  var14 = var26.field_v;
                                  var15 = 0;
                                  L7: while (true) {
                                    if (var14.length <= var15) {
                                      break L6;
                                    } else {
                                      L8: {
                                        var16 = var14[var15];
                                        if (var16.field_k.field_x != var10) {
                                          break L8;
                                        } else {
                                          L9: {
                                            if (null != var26.field_D) {
                                              var17_ref_ln__ = var26.field_D;
                                              var18 = 0;
                                              L10: while (true) {
                                                if (var18 >= var17_ref_ln__.length) {
                                                  break L9;
                                                } else {
                                                  var19_ref_ln = var17_ref_ln__[var18];
                                                  if (var16.field_k == var19_ref_ln) {
                                                    break L8;
                                                  } else {
                                                    var18++;
                                                    continue L10;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                          var17 = 0;
                                          var18 = 0;
                                          var19 = 0;
                                          L11: while (true) {
                                            if (param6.length <= var19) {
                                              L12: {
                                                if (var17 <= var18) {
                                                  break L12;
                                                } else {
                                                  var19 = var17;
                                                  var17 = var18;
                                                  var18 = var19;
                                                  break L12;
                                                }
                                              }
                                              L13: {
                                                var19 = var18 / param0 + -(var17 / param0);
                                                if (var19 == 0) {
                                                  break L13;
                                                } else {
                                                  if (var18 < param0 * var19 + var17) {
                                                    var20 = var18;
                                                    var18 = var17 + var19 * param0;
                                                    var17 = -(param0 * var19) + var20;
                                                    break L13;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              var23 = 1 + var17;
                                              var20 = var23;
                                              L14: while (true) {
                                                if (var18 <= var23) {
                                                  var26.a((byte) -113, var16.field_k);
                                                  var16.field_k.a((byte) -111, var26);
                                                  break L5;
                                                } else {
                                                  L15: {
                                                    if (null != param6[var23]) {
                                                      if (param6[var23].field_p == var16.field_k.field_p) {
                                                        break L15;
                                                      } else {
                                                        if (param6[var23].field_p == var26.field_p) {
                                                          break L15;
                                                        } else {
                                                          if (!kp.a((byte) 96, param6[var23], var16.field_k, param2, var26)) {
                                                            break L8;
                                                          } else {
                                                            break L15;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                  var23++;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              L16: {
                                                if (null != param6[var19]) {
                                                  L17: {
                                                    if (var26.field_p == param6[var19].field_p) {
                                                      var17 = var19;
                                                      break L17;
                                                    } else {
                                                      break L17;
                                                    }
                                                  }
                                                  if (var16.field_k.field_p == param6[var19].field_p) {
                                                    var18 = var19;
                                                    break L16;
                                                  } else {
                                                    break L16;
                                                  }
                                                } else {
                                                  break L16;
                                                }
                                              }
                                              var19++;
                                              continue L11;
                                            }
                                          }
                                        }
                                      }
                                      var15++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              var12++;
                              continue L4;
                            }
                          }
                          var10++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              } else {
                var10_ref_pf = new pf();
                var11_ref_ln__ = param4;
                var12 = 0;
                L18: while (true) {
                  if (var11_ref_ln__.length <= var12) {
                    var7_array[var9] = new ln[var29[var9]];
                    int discarded$1 = var10_ref_pf.a((byte) 112, (oh[]) (Object) var25[var9]);
                    var9++;
                    continue L1;
                  } else {
                    var22 = var11_ref_ln__[var12];
                    var13 = var22;
                    var10_ref_pf.a((byte) -113, (oh) (Object) var22);
                    var8[var9] = var8[var9] + 1;
                    var12++;
                    continue L18;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var7;
            stackOut_58_1 = new StringBuilder().append("vf.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(1).append(44);
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param4 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L19;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L19;
            }
          }
          L20: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param5 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L20;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L20;
            }
          }
          L21: {
            stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(44);
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param6 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L21;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L21;
            }
          }
          throw r.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + 41);
        }
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ld var3_ref_ld = null;
        int var3 = 0;
        fk var4 = null;
        int var4_int = 0;
        byte[] var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        sl var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = sa.field_a;
              if (param0 == -117) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              var2 = var8.j(-121);
              if (0 != var2) {
                if (1 == var2) {
                  var3 = var8.a(16711680);
                  var4 = (fk) (Object) tr.field_vb.d(param0 + 117);
                  L3: while (true) {
                    L4: {
                      if (var4 == null) {
                        break L4;
                      } else {
                        if (var4.field_j == var3) {
                          break L4;
                        } else {
                          var4 = (fk) (Object) tr.field_vb.a((byte) -71);
                          continue L3;
                        }
                      }
                    }
                    if (var4 == null) {
                      q.g(-118);
                      return;
                    } else {
                      var4.b((byte) -122);
                      break L2;
                    }
                  }
                } else {
                  jq.a(-29901, (Throwable) null, "A1: " + w.a(16738));
                  q.g(-108);
                  break L2;
                }
              } else {
                var3_ref_ld = (ld) (Object) ua.field_d.d(0);
                if (var3_ref_ld == null) {
                  q.g(-96);
                  return;
                } else {
                  L5: {
                    var4_int = var8.j(param0 + -2);
                    if (var4_int != 0) {
                      var12 = new byte[var4_int];
                      var11 = var12;
                      var10 = var11;
                      var9 = var10;
                      var7 = var9;
                      var5 = var7;
                      var8.a(var4_int, 0, 17469032, var12);
                      break L5;
                    } else {
                      var5 = null;
                      break L5;
                    }
                  }
                  var8.field_j = var8.field_j + 4;
                  if (!var8.f((byte) 104)) {
                    q.g(param0 + 17);
                    return;
                  } else {
                    var3_ref_ld.field_l = true;
                    var3_ref_ld.field_o = var5;
                    var3_ref_ld.b((byte) -100);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "vf.D(" + param0 + 41);
        }
    }

    final oh a(boolean param0) {
        if (param0) {
            vf.d((byte) 82);
        }
        return (oh) (Object) ((vf) this).field_g.d(-115);
    }

    final static void a(int param0, sd param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 >= 119) {
              var6 = new int[4];
              var2 = var6;
              sn.a(var6, (byte) -76, param1);
              var4 = var6[0];
              var3 = 1;
              L1: while (true) {
                if (var3 >= 4) {
                  L2: {
                    if (var4 < 0) {
                      var4 = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  param1.field_x = var4;
                  break L0;
                } else {
                  L3: {
                    if (var6[var3] >= var4) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2_ref;
            stackOut_13_1 = new StringBuilder().append("vf.E(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final oh a(byte param0) {
        if (param0 < 99) {
            return null;
        }
        return (oh) (Object) ((vf) this).field_g.e(-31364);
    }

    final int b(byte param0) {
        if (param0 != -61) {
            ((vf) this).field_g = null;
        }
        return ((vf) this).field_g.c(-7432);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        eo.field_cb.field_j = 0;
        eo.field_cb.c(12, (byte) -128);
        eo.field_cb.e(11135, na.field_u.nextInt());
        eo.field_cb.e(11135, na.field_u.nextInt());
        eo.field_cb.c(param3, (byte) -85);
        eo.field_cb.c(param1, (byte) -123);
        eo.field_cb.d(param0, 255);
        eo.field_cb.a(jl.field_V, hr.field_a, (byte) -56);
        js.field_f.h(18, 255);
        int fieldTemp$0 = js.field_f.field_j + 1;
        js.field_f.field_j = js.field_f.field_j + 1;
        int var4 = fieldTemp$0;
        js.field_f.a(0, eo.field_cb.field_j, eo.field_cb.field_h, 22186);
        js.field_f.b(-var4 + js.field_f.field_j, (byte) 118);
    }

    public static void a() {
        field_f = null;
    }

    vf(wb param0) {
        try {
            ((vf) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "vf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Add name";
    }
}
