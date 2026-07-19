/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uea extends bob {
    private vv field_r;
    private vv[] field_q;
    static String field_p;

    final vv a(int param0, int param1) {
        if (param1 != -1) {
            uea.a((byte) -96);
        }
        vv dupTemp$0 = new vv();
        this.field_q[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(int param0, phb[] param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (null == this.field_q[var4_int]) {
                this.field_q[var4_int] = new vv();
            }
            if (param2 != 15486) {
                this.field_q = (vv[]) null;
            }
            this.field_q[param0].field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "uea.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static uma a(ds param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        uma stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        uma stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 50 / ((param1 - -28) / 55);
            stackOut_0_0 = new uma(param0.a(true), param0.a(true), param0.a(true), param0.a(true), param0.c((byte) -81), param0.c((byte) -45), param0.e((byte) -119));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("uea.Q(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void c(int param0) {
        faa var2 = bk.field_w;
        faa var1 = var2;
        bk.field_w = im.field_q;
        im.field_q = var2;
        if (!(null != bk.field_w)) {
            bk.field_w = new faa(1048576);
        }
        if (param0 != 9487) {
            field_p = (String) null;
        }
    }

    private final void a(uea param0, int param1, boolean param2) {
        vv dupTemp$17 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        vv var5 = null;
        vv var6 = null;
        int var7 = 0;
        vv stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        vv stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        vv stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        vv stackIn_9_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        vv stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        vv stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        vv stackOut_8_2 = null;
        vv stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        vv stackOut_7_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              super.a(param1 + -130, param0);
              if (!param2) {
                cua.a(this.field_q, 0, param0.field_q, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_q[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L4: {
                          var6 = param0.field_q[var4_int];
                          stackOut_6_0 = (vv) (var5);
                          stackOut_6_1 = 105;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var6 != null) {
                            stackOut_8_0 = (vv) ((Object) stackIn_8_0);
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (vv) (var6);
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L4;
                          } else {
                            dupTemp$17 = new vv();
                            param0.field_q[var4_int] = dupTemp$17;
                            stackOut_7_0 = (vv) ((Object) stackIn_7_0);
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (vv) (dupTemp$17);
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L4;
                          }
                        }
                        ((vv) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2);
                        break L3;
                      } else {
                        param0.field_q[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            L5: {
              if (param1 == 6) {
                break L5;
              } else {
                this.field_r = (vv) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("uea.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 != -18) {
            uea.a((byte) 52, true, false, 58);
        }
    }

    final void a(phb[] param0, byte param1) {
        vv[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        vv var5 = null;
        int var6 = 0;
        vv[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == -54) {
              var7 = this.field_q;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_b = param0;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("uea.N(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dla stackIn_9_0 = null;
        dla stackIn_10_0 = null;
        dla stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        dla stackOut_8_0 = null;
        dla stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        dla stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          if (param0 == 88) {
            break L0;
          } else {
            field_p = (String) null;
            break L0;
          }
        }
        L1: {
          var4 = 0;
          if (-1 == param3) {
            amb.a(-30428, param2);
            break L1;
          } else {
            if (param3 == -2) {
              dma.a();
              wna.field_e = true;
              break L1;
            } else {
              if (param1) {
                amb.a(-30428, false);
                lo.field_a[param3].c((byte) 65);
                break L1;
              } else {
                L2: {
                  if (null != wca.field_b) {
                    break L2;
                  } else {
                    wca.field_b = new dla();
                    break L2;
                  }
                }
                var4 = 1;
                if (null == wca.field_b) {
                  lo.field_a[param3].c((byte) 65);
                  break L1;
                } else {
                  L3: {
                    stackOut_8_0 = wca.field_b;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (0 != (lo.field_a[param3].a(noa.field_q, pk.field_o, 6868) ^ -1)) {
                      stackOut_10_0 = (dla) ((Object) stackIn_10_0);
                      stackOut_10_1 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L3;
                    } else {
                      stackOut_9_0 = (dla) ((Object) stackIn_9_0);
                      stackOut_9_1 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L3;
                    }
                  }
                  ((dla) (Object) stackIn_11_0).a(stackIn_11_1 != 0, (byte) 55);
                  lo.field_a[param3].c((byte) 65);
                  break L1;
                }
              }
            }
          }
        }
        L4: {
          if (var4 != 0) {
            break L4;
          } else {
            wca.field_b = null;
            break L4;
          }
        }
        L5: {
          var5 = 1;
          var6 = 13421772;
          if (li.field_i) {
            var7 = 3;
            pj.a(og.field_r, de.a(var7, 300), nma.field_b[var7], -125, var6, ip.field_p.width, pk.field_o, var5, noa.field_q, ip.field_p.height);
            break L5;
          } else {
            break L5;
          }
        }
    }

    final void a(int param0, phb param1) {
        vv[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        vv var5 = null;
        int var6 = 0;
        phb[] var7 = null;
        vv[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 32460) {
                break L1;
              } else {
                var7 = (phb[]) null;
                this.a((phb[]) null, (byte) -127);
                break L1;
              }
            }
            var8 = this.field_q;
            var3 = var8;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var8.length) {
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_e = param1;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("uea.S(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        vv var7 = null;
        int var8 = 0;
        vv var10 = null;
        htb var11 = null;
        vv var12 = null;
        vv var13 = null;
        vv var14 = null;
        vv var15 = null;
        shb stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        shb stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof htb) {
                stackOut_2_0 = (shb) (param1);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (shb) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var11 = (htb) ((Object) stackIn_3_0);
              qca.a(param1.field_h + param2 - -param1.field_g, param3 + param1.field_r + param1.field_f, param2 + param1.field_g, true, param3 + param1.field_r);
              if (var11 == null) {
                break L2;
              } else {
                param4 = param4 & var11.field_x;
                break L2;
              }
            }
            L3: {
              var8 = 14 % ((param0 - -27) / 35);
              var7 = this.field_q[0];
              this.field_r.a(120);
              var7.a(this.field_r, param2, param1, param3, -2879, (uea) (this));
              if (var11 != null) {
                L4: {
                  if (var11.field_u) {
                    var12 = this.field_q[1];
                    if (var12 != null) {
                      var12.a(this.field_r, param2, param1, param3, -2879, (uea) (this));
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var11.field_e) {
                  L5: {
                    var13 = this.field_q[3];
                    if (var11.field_n == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(this.field_r, param2, param1, param3, -2879, (uea) (this));
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var10 = this.field_q[2];
                  if (var10 == null) {
                    break L3;
                  } else {
                    var10.a(this.field_r, param2, param1, param3, -2879, (uea) (this));
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (param1.e((byte) -120)) {
                var14 = this.field_q[5];
                if (var14 != null) {
                  var14.a(this.field_r, param2, param1, param3, -2879, (uea) (this));
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (param4) {
                break L7;
              } else {
                var15 = this.field_q[4];
                if (var15 == null) {
                  break L7;
                } else {
                  var15.a(this.field_r, param2, param1, param3, -2879, (uea) (this));
                  break L7;
                }
              }
            }
            this.field_r.a((uea) (this), false, param2, param1, param3);
            bia.a((byte) 124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var6);
            stackOut_30_1 = new StringBuilder().append("uea.A(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public uea() {
        this.field_q = new vv[6];
        this.field_r = new vv();
        vv dupTemp$0 = new vv();
        this.field_q[0] = dupTemp$0;
        vv var1 = dupTemp$0;
        var1.a(120);
    }

    uea(uea param0, boolean param1) {
        this();
        try {
            param0.a((uea) (this), 6, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "uea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_p = "Buying or selling an account";
    }
}
