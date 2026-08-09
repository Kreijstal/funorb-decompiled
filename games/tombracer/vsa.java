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
            this.field_q = (faa[][]) null;
        }
        if (this.field_h.j(param0 + 98)) {
            return 2;
        }
        int var2 = this.field_t;
        if (var2 != 0) {
        }
        return 3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        RuntimeException var7 = null;
        var25 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ufa.a(-76, param1);
              var7_int = param2;
              var8 = -param5 + param1;
              if (-1 < (var8 ^ -1)) {
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
                    if (-2 >= (var11 ^ -1)) {
                      pqa.field_m[var11] = var7_int;
                      var11--;
                      var12 = var12 - (var11 << 1918626241);
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
                    var10 = var10 - (var9 << -816375967);
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
                      stackIn_20_0 = pqa.field_m[var7_int];
                      break L5;
                    } else {
                      stackIn_20_0 = var11;
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
          throw tba.a((Throwable) ((Object) var7), "vsa.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(uw param0, int param1) {
        try {
            super.a(param0, 85);
            if (param1 <= 82) {
                field_m = (vna) null;
            }
            this.field_q = (faa[][]) null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(byte param0, int param1) {
        this.field_t = param1;
        if (param0 != 80) {
            uw var4 = (uw) null;
            this.a((uw) null, 105);
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (param0 instanceof lpa) {
                this.field_o = (lpa) ((Object) param0);
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
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("vsa.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, faa param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = this.field_t;
              if (-1 != (var3_int ^ -1)) {
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
            L4: {
              if (param0) {
                break L4;
              } else {
                this.n((byte) -52);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("vsa.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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
        if (this.field_q == null) {
            return;
        }
        for (var2 = 0; this.field_p > var2; var2++) {
            for (var3 = 0; this.field_r > var3; var3++) {
                var4 = this.field_q[var2][var3];
                var5 = uja.field_c[var4.field_b];
                var4.field_e = dfa.a(-var4.field_e + var5, 2048, -31);
                var4.field_d = -var4.field_d;
            }
        }
        if (param0 < 0) {
            this.field_q = (faa[][]) null;
        }
    }

    final static void a(cn param0, fia param1, int param2) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
            var3_int = -13 % ((9 - param2) / 41);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("vsa.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ',' + param2 + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 29 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        try {
            super.a(120, param1, param2);
            this.field_t = param2.b((byte) 44, 4);
            if (param0 < 119) {
                this.field_t = -32;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int o(byte param0) {
        int var2 = 68 / ((param0 - 56) / 43);
        return this.field_n;
    }

    final void d(int param0) {
        ac var4 = null;
        super.d(param0);
        if (!(this.field_o == null)) {
            if (this.field_o.d(false)) {
                this.field_n = uca.field_c.a(262144, 0) + -131072;
                this.field_s = -131072 + uca.field_c.a(262144, 0);
            }
        }
        fsa var2 = (fsa) ((Object) this.field_h);
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
            ((hf) ((Object) var4)).field_k = 2;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -59, param1);
            int var3_int = -50 / ((param0 - -8) / 40);
            param1.a((byte) 18, this.field_t, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, uw param1) {
        try {
            if (this.field_q == null) {
                this.n((byte) -128);
            }
            super.b(param0 ^ param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int p(byte param0) {
        if (param0 < 4) {
            this.o((byte) 99);
        }
        return this.field_s;
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 50) {
            return;
        }
        try {
            if (null != this.field_q) {
                for (var4_int = 0; this.field_p > var4_int; var4_int++) {
                    for (var5 = 0; this.field_r > var5; var5++) {
                        param2.a((byte) -125, param1, this.field_q[var4_int][var5]);
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void n(byte param0) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        faa var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        la var20;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          var20 = this.a(78);
          var3 = this.field_h.d(3);
          var4 = this.field_h.e(9648);
          var5 = this.field_h.c(-56);
          var6 = this.field_h.a((byte) 55);
          if (var5 < var6) {
            var5 = 2097152;
            break L0;
          } else {
            var6 = 2097152;
            break L0;
          }
        }
        this.field_r = var6 / 2097152;
        this.field_p = var5 / 2097152;
        this.field_q = new faa[this.field_p][this.field_r];
        var7 = -(var6 / 2) + var4 + 1048576;
        var9 = 123 % ((param0 - -16) / 56);
        var8 = 0;
        L1: while (true) {
          if (var8 >= this.field_r) {
            return;
          } else {
            var10 = 1048576 + (var3 - var5 / 2);
            var11 = 0;
            L2: while (true) {
              if (var11 >= this.field_p) {
                var7 = var7 + 2097152;
                var8++;
                continue L1;
              } else {
                L3: {
                  var12 = new faa();
                  this.field_q[var11][var8] = var12;
                  if ((var11 ^ -1) >= -1) {
                    stackIn_10_0 = 0;
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var11 >= -1 + this.field_p) {
                    stackIn_13_0 = 0;
                    break L4;
                  } else {
                    stackIn_13_0 = 1;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_13_0;
                  if (var8 <= 0) {
                    stackIn_16_0 = 0;
                    break L5;
                  } else {
                    stackIn_16_0 = 1;
                    break L5;
                  }
                }
                L6: {
                  var15 = stackIn_16_0;
                  if (var8 >= this.field_r + -1) {
                    stackIn_19_0 = 0;
                    break L6;
                  } else {
                    stackIn_19_0 = 1;
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
                  var12.field_c = (vsa) (this);
                  if ((var17 ^ -1) != -2) {
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
                var20.e(true).a(100, 0);
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
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == this.field_q) {
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (this.field_p <= var4_int) {
                    break L1;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= this.field_r) {
                        var4_int++;
                        continue L2;
                      } else {
                        param1.a(param0, this.field_q[var4_int][var5], (byte) -33);
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
                this.field_r = 57;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("vsa.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    public static void q(byte param0) {
        if (param0 >= -121) {
            return;
        }
        field_m = null;
    }

    vsa(int param0) {
        super(param0);
    }

    final static void c(byte param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
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
        byte[] var17 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 >= 107) {
              L1: {
                if (-1 == (oh.field_o ^ -1)) {
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
                    if ((ql.field_k.field_h ^ -1) >= -1) {
                      break L3;
                    } else {
                      var14 = new byte[ql.field_k.field_h];
                      var11 = var14;
                      var8 = var11;
                      var17 = var8;
                      var6 = 0;
                      L4: while (true) {
                        if (var14.length <= var6) {
                          var6_ref_rha = new rha(var2_long + (long)var4, ql.field_k.field_h, var17);
                          jla.field_z.b((byte) -71, var6_ref_rha);
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
                  var9 = (rha) ((Object) jla.field_z.f(-80));
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
              bl.a(param1, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "vsa.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, jea param1) {
        jea var4 = null;
        jea var5 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        try {
            var4 = (jea) ((Object) param1.field_J.f(-80));
            jea var2 = var4;
            while (var4 != null) {
                var4.field_K = 0;
                var4.field_O = 0;
                var4.field_T = 0;
                var4.field_t = 0;
                var5 = (jea) ((Object) param1.field_J.e(112));
                var5 = var5;
            }
            param1.field_t = 0;
            if (param0 > -86) {
                field_m = (vna) null;
            }
            param1.field_T = 0;
            param1.field_O = 0;
            param1.field_K = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vsa.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = new vna();
    }
}
