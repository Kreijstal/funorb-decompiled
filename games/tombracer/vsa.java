/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vsa extends dg {
    private faa[][] field_q;
    private int field_p;
    static vna field_m;
    private int field_r;
    private int field_s;
    private int field_n;
    private int field_t;
    private lpa field_o;

    final int k(byte param0) {
        if (param0 != -99) {
            ((vsa) this).field_q = null;
        }
        if (((vsa) this).field_h.j(param0 + 98)) {
            return 2;
        }
        int var2 = ((vsa) this).field_t;
        if (var2 != 0) {
        }
        return 3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var35 = null;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var25 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ufa.a(-76, param1);
              var7_int = 0;
              var8 = -param5 + param1;
              if (var8 < 0) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var9 = param1;
            var10 = -param1;
            var11 = var8;
            var12 = -var8;
            var13 = -1;
            var14 = -1;
            var35 = vaa.field_a[param0];
            var16 = param6 + -var8;
            nra.a((byte) -55, param4, var16, var35, param6 - param1);
            var17 = param6 - -var8;
            nra.a((byte) -55, param3, var17, var35, var16);
            nra.a((byte) -55, param4, param6 - -param1, var35, var17);
            L2: while (true) {
              if (var7_int >= var9) {
                break L0;
              } else {
                L3: {
                  var13 += 2;
                  var14 += 2;
                  var10 = var10 + var13;
                  var12 = var12 + var14;
                  if (0 > var12) {
                    break L3;
                  } else {
                    if (var11 >= 1) {
                      pqa.field_m[var11] = var7_int;
                      var11--;
                      var12 = var12 - (var11 << 1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var7_int++;
                  if (var10 >= 0) {
                    var9--;
                    var10 = var10 - (var9 << 1);
                    if (var9 >= var8) {
                      var30 = vaa.field_a[var9 + param0];
                      var26 = vaa.field_a[-var9 + param0];
                      var19 = var26;
                      var20 = param6 - -var7_int;
                      var21 = param6 - var7_int;
                      nra.a((byte) -55, param4, var20, var30, var21);
                      nra.a((byte) -55, param4, var20, var26, var21);
                      break L4;
                    } else {
                      var28 = vaa.field_a[param0 + var9];
                      var29 = vaa.field_a[-var9 + param0];
                      var20 = pqa.field_m[var9];
                      var21 = param6 - -var7_int;
                      var22 = -var7_int + param6;
                      var23 = param6 - -var20;
                      var24 = param6 + -var20;
                      nra.a((byte) -55, param4, var24, var28, var22);
                      nra.a((byte) -55, param3, var23, var28, var24);
                      nra.a((byte) -55, param4, var21, var28, var23);
                      nra.a((byte) -55, param4, var24, var29, var22);
                      nra.a((byte) -55, param3, var23, var29, var24);
                      nra.a((byte) -55, param4, var21, var29, var23);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                var31 = vaa.field_a[var7_int + param0];
                var32 = vaa.field_a[-var7_int + param0];
                var20 = var9 + param6;
                var21 = param6 - var9;
                if (var7_int < var8) {
                  L5: {
                    if (var7_int > var11) {
                      stackOut_19_0 = pqa.field_m[var7_int];
                      stackIn_20_0 = stackOut_19_0;
                      break L5;
                    } else {
                      stackOut_18_0 = var11;
                      stackIn_20_0 = stackOut_18_0;
                      break L5;
                    }
                  }
                  var22 = stackIn_20_0;
                  var23 = param6 - -var22;
                  var24 = param6 - var22;
                  nra.a((byte) -55, param4, var24, var31, var21);
                  nra.a((byte) -55, param3, var23, var31, var24);
                  nra.a((byte) -55, param4, var20, var31, var23);
                  nra.a((byte) -55, param4, var24, var32, var21);
                  nra.a((byte) -55, param3, var23, var32, var24);
                  nra.a((byte) -55, param4, var20, var32, var23);
                  continue L2;
                } else {
                  nra.a((byte) -55, param4, var20, var31, var21);
                  nra.a((byte) -55, param4, var20, var32, var21);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "vsa.H(" + param0 + 44 + param1 + 44 + 0 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final void a(uw param0, int param1) {
        try {
            super.a(param0, 85);
            if (param1 <= 82) {
                field_m = null;
            }
            ((vsa) this).field_q = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vsa.RA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void b(byte param0, int param1) {
        ((vsa) this).field_t = param1;
        if (param0 != 80) {
            Object var4 = null;
            ((vsa) this).a((uw) null, 105);
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (param0 instanceof lpa) {
                ((vsa) this).field_o = (lpa) (Object) param0;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("vsa.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
    }

    private final void a(boolean param0, faa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ((vsa) this).field_t;
              if (var3_int != 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = param1.field_b;
              if (var3_int != 0) {
                L3: {
                  if (var3_int == 1) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param1.field_f = new bua(1, 63);
                break L2;
              } else {
                param1.field_f = new bua(1, 62);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("vsa.L(").append(1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    vsa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        faa var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.h(19);
        if (((vsa) this).field_q == null) {
            return;
        }
        for (var2 = 0; ((vsa) this).field_p > var2; var2++) {
            for (var3 = 0; ((vsa) this).field_r > var3; var3++) {
                var4 = ((vsa) this).field_q[var2][var3];
                var5 = uja.field_c[var4.field_b];
                var4.field_e = dfa.a(-var4.field_e + var5, 2048, -31);
                var4.field_d = -var4.field_d;
            }
        }
        if (param0 < 0) {
            ((vsa) this).field_q = null;
        }
    }

    final static void a(cn param0, fia param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              hna.field_a = param1;
              aqa.field_c = "";
              af.field_b = param0;
              if (!oj.field_vb.startsWith("win")) {
                if (oj.field_vb.startsWith("linux")) {
                  aqa.field_c = aqa.field_c + "linux/";
                  break L1;
                } else {
                  if (!oj.field_vb.startsWith("mac")) {
                    break L1;
                  } else {
                    aqa.field_c = aqa.field_c + "macos/";
                    break L1;
                  }
                }
              } else {
                aqa.field_c = aqa.field_c + "windows/";
                break L1;
              }
            }
            L2: {
              if (hna.field_a.field_p) {
                aqa.field_c = aqa.field_c + "msjava/";
                break L2;
              } else {
                L3: {
                  if (oj.field_zb.startsWith("amd64")) {
                    break L3;
                  } else {
                    if (oj.field_zb.startsWith("x86_64")) {
                      break L3;
                    } else {
                      L4: {
                        if (oj.field_zb.startsWith("i386")) {
                          break L4;
                        } else {
                          if (oj.field_zb.startsWith("i486")) {
                            break L4;
                          } else {
                            if (oj.field_zb.startsWith("i586")) {
                              break L4;
                            } else {
                              if (oj.field_zb.startsWith("x86")) {
                                break L4;
                              } else {
                                if (oj.field_zb.startsWith("ppc")) {
                                  aqa.field_c = aqa.field_c + "ppc/";
                                  break L2;
                                } else {
                                  aqa.field_c = aqa.field_c + "universal/";
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                      aqa.field_c = aqa.field_c + "x86/";
                      break L2;
                    }
                  }
                }
                aqa.field_c = aqa.field_c + "x86_64/";
                break L2;
              }
            }
            var3_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("vsa.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          L6: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + -55 + 41);
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 29 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vsa.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(120, param1, param2);
              ((vsa) this).field_t = param2.b((byte) 44, 4);
              if (param0 >= 119) {
                break L1;
              } else {
                ((vsa) this).field_t = -32;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vsa.G(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final int o(byte param0) {
        int var2 = 68 / ((param0 - 56) / 43);
        return ((vsa) this).field_n;
    }

    final void d(int param0) {
        ac var4 = null;
        super.d(param0);
        if (!(((vsa) this).field_o == null)) {
            if (((vsa) this).field_o.d(false)) {
                ((vsa) this).field_n = uca.field_c.a(262144, 0) + -131072;
                ((vsa) this).field_s = -131072 + uca.field_c.a(262144, 0);
            }
        }
        fsa var2 = (fsa) (Object) ((vsa) this).field_h;
        if (var2 == null) {
            return;
        }
        hca var3 = var2.H(param0 ^ 117);
        if (!(var3 != null)) {
            return;
        }
        if (!(!var2.a((byte) 110, var3.e(param0 ^ -9649), var3.d(3), var3.a((byte) 55), var3.c(-40)))) {
            var4 = var3.n((byte) -56);
            if (!(var4 != null)) {
                return;
            }
            ((hf) (Object) var4).field_k = 2;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -59, param1);
            int var3_int = -50 / ((param0 - -8) / 40);
            param1.a((byte) 18, ((vsa) this).field_t, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vsa.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, uw param1) {
        try {
            if (((vsa) this).field_q == null) {
                int discarded$0 = -128;
                this.n();
            }
            super.b(param0 ^ param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vsa.WA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int p(byte param0) {
        if (param0 < 4) {
            int discarded$0 = ((vsa) this).o((byte) 99);
        }
        return ((vsa) this).field_s;
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 > 50) {
              L1: {
                if (null == ((vsa) this).field_q) {
                  break L1;
                } else {
                  var4_int = 0;
                  L2: while (true) {
                    if (((vsa) this).field_p <= var4_int) {
                      break L1;
                    } else {
                      var5 = 0;
                      L3: while (true) {
                        if (((vsa) this).field_r <= var5) {
                          var4_int++;
                          continue L2;
                        } else {
                          param2.a((byte) -125, param1, (fo) (Object) ((vsa) this).field_q[var4_int][var5]);
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("vsa.V(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    private final void n() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        faa var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        la var20 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          var20 = ((vsa) this).a(78);
          var3 = ((vsa) this).field_h.d(3);
          var4 = ((vsa) this).field_h.e(9648);
          var5 = ((vsa) this).field_h.c(-56);
          var6 = ((vsa) this).field_h.a((byte) 55);
          if (var5 < var6) {
            var5 = 2097152;
            break L0;
          } else {
            var6 = 2097152;
            break L0;
          }
        }
        ((vsa) this).field_r = var6 / 2097152;
        ((vsa) this).field_p = var5 / 2097152;
        ((vsa) this).field_q = new faa[((vsa) this).field_p][((vsa) this).field_r];
        var7 = -(var6 / 2) + var4 + 1048576;
        var9 = 1;
        var8 = 0;
        L1: while (true) {
          if (var8 >= ((vsa) this).field_r) {
            return;
          } else {
            var10 = 1048576 + (var3 - var5 / 2);
            var11 = 0;
            L2: while (true) {
              if (var11 >= ((vsa) this).field_p) {
                var7 = var7 + 2097152;
                var8++;
                continue L1;
              } else {
                L3: {
                  var12 = new faa();
                  ((vsa) this).field_q[var11][var8] = var12;
                  if (var11 <= 0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var11 >= -1 + ((vsa) this).field_p) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_13_0;
                  if (var8 <= 0) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L5;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L5;
                  }
                }
                L6: {
                  var15 = stackIn_16_0;
                  if (var8 >= ((vsa) this).field_r + -1) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L6;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L6;
                  }
                }
                L7: {
                  var16 = stackIn_19_0;
                  var17 = 0;
                  if (var13 == 0) {
                    break L7;
                  } else {
                    var17++;
                    break L7;
                  }
                }
                L8: {
                  if (var14 != 0) {
                    var17++;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var15 != 0) {
                    var17++;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var16 == 0) {
                    break L10;
                  } else {
                    var17++;
                    break L10;
                  }
                }
                L11: {
                  var18 = 0;
                  var12.field_c = (vsa) this;
                  if (var17 != 1) {
                    L12: {
                      L13: {
                        if (var14 == 0) {
                          break L13;
                        } else {
                          if (var13 == 0) {
                            break L13;
                          } else {
                            var18 = 512;
                            break L12;
                          }
                        }
                      }
                      var18 = 0;
                      break L12;
                    }
                    var12.field_b = 1;
                    break L11;
                  } else {
                    if (var15 == 0) {
                      L14: {
                        if (var14 != 0) {
                          var18 = -512;
                          break L14;
                        } else {
                          if (var16 != 0) {
                            var18 = 0;
                            break L14;
                          } else {
                            var18 = 512;
                            var12.field_b = 0;
                            break L11;
                          }
                        }
                      }
                      var12.field_b = 0;
                      break L11;
                    } else {
                      var18 = 1024;
                      var12.field_b = 0;
                      break L11;
                    }
                  }
                }
                var12.field_e = dfa.a(var18 + uja.field_c[var12.field_b], 2048, -54);
                var12.field_a = var7 + -var4;
                var12.field_d = var10 - var3;
                int discarded$1 = var20.e(true).a(100, 0);
                var10 = var10 + 2097152;
                this.a(true, var12);
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ((vsa) this).field_q) {
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (((vsa) this).field_p <= var4_int) {
                    break L1;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= ((vsa) this).field_r) {
                        var4_int++;
                        continue L2;
                      } else {
                        param1.a(param0, (fo) (Object) ((vsa) this).field_q[var4_int][var5], (byte) -33);
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (param2 >= 40) {
                break L4;
              } else {
                ((vsa) this).field_r = 57;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("vsa.FA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    public static void q(byte param0) {
        field_m = null;
    }

    vsa(int param0) {
        super(param0);
    }

    final static void c() {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        rha var6_ref_rha = null;
        int var7 = 0;
        byte[] var8 = null;
        rha var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        rha var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (oh.field_o == 0) {
                break L1;
              } else {
                L2: {
                  var2_long = bva.b((byte) -107);
                  var4 = oh.field_o;
                  if (0.0 != sua.field_J) {
                    var4 = (int)((double)var4 + lpa.field_p.nextGaussian() * sua.field_J);
                    if (0 <= var4) {
                      break L2;
                    } else {
                      var4 = 0;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (ql.field_k.field_h <= 0) {
                    break L3;
                  } else {
                    var18 = new byte[ql.field_k.field_h];
                    var16 = var18;
                    var14 = var16;
                    var11 = var14;
                    var8 = var11;
                    var19 = var8;
                    var6 = 0;
                    L4: while (true) {
                      if (var18.length <= var6) {
                        var6_ref_rha = new rha(var2_long + (long)var4, ql.field_k.field_h, var19);
                        jla.field_z.b((byte) -71, (vg) (Object) var6_ref_rha);
                        ql.field_k.field_h = 0;
                        break L3;
                      } else {
                        var8[var6] = ql.field_k.field_g[var6];
                        var6++;
                        continue L4;
                      }
                    }
                  }
                }
                var9 = (rha) (Object) jla.field_z.f(-80);
                var13 = var9;
                if (var13 == null) {
                  break L1;
                } else {
                  if (var13.field_f < var2_long) {
                    var13.p(117);
                    var10 = 0;
                    var6 = var10;
                    L5: while (true) {
                      if (var13.field_i <= var10) {
                        ql.field_k.field_h = var13.field_i;
                        break L1;
                      } else {
                        ql.field_k.field_g[var10] = var9.field_g[var10];
                        var10++;
                        continue L5;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            bl.a(0, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "vsa.F(" + 120 + 44 + 0 + 41);
        }
    }

    final static void a(int param0, jea param1) {
        jea var4 = null;
        jea var5 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        try {
            var4 = (jea) (Object) param1.field_J.f(-80);
            jea var2 = var4;
            while (var4 != null) {
                var4.field_K = 0;
                var4.field_O = 0;
                var4.field_T = 0;
                var4.field_t = 0;
                var5 = (jea) (Object) param1.field_J.e(112);
                var5 = var5;
            }
            param1.field_t = 0;
            if (param0 > -86) {
                field_m = null;
            }
            param1.field_T = 0;
            param1.field_O = 0;
            param1.field_K = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vsa.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new vna();
    }
}
