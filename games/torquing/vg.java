/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends eh {
    static fj field_k;
    static int field_j;
    private boolean field_m;
    static int field_o;
    private double[] field_n;
    static volatile int field_l;

    final static byte[] a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_66_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            var2_int = param0.length();
            var4 = -97 % ((-62 - param1) / 48);
            var3 = new byte[var2_int];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                stackOut_66_0 = (byte[]) (var3);
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var6 = param0.charAt(var5);
                      if (var6 <= 0) {
                        break L4;
                      } else {
                        if (var6 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 160) {
                        break L5;
                      } else {
                        if (255 < var6) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var6 == 8364) {
                      var3[var5] = (byte)-128;
                      break L2;
                    } else {
                      if (var6 != 8218) {
                        if (var6 == 402) {
                          var3[var5] = (byte)-125;
                          break L2;
                        } else {
                          if (var6 != 8222) {
                            if (8230 != var6) {
                              if (var6 != 8224) {
                                if (var6 == 8225) {
                                  var3[var5] = (byte)-121;
                                  break L2;
                                } else {
                                  if (var6 != 710) {
                                    if (var6 != 8240) {
                                      if (var6 == 352) {
                                        var3[var5] = (byte)-118;
                                        break L2;
                                      } else {
                                        if (8249 != var6) {
                                          if (338 == var6) {
                                            var3[var5] = (byte)-116;
                                            break L2;
                                          } else {
                                            if (var6 != 381) {
                                              if (var6 != 8216) {
                                                if (8217 == var6) {
                                                  var3[var5] = (byte)-110;
                                                  break L2;
                                                } else {
                                                  if (var6 != 8220) {
                                                    if (var6 != 8221) {
                                                      if (var6 == 8226) {
                                                        var3[var5] = (byte)-107;
                                                        break L2;
                                                      } else {
                                                        if (var6 == 8211) {
                                                          var3[var5] = (byte)-106;
                                                          break L2;
                                                        } else {
                                                          if (8212 != var6) {
                                                            if (var6 != 732) {
                                                              if (8482 != var6) {
                                                                if (var6 != 353) {
                                                                  if (var6 == 8250) {
                                                                    var3[var5] = (byte)-101;
                                                                    break L2;
                                                                  } else {
                                                                    if (var6 == 339) {
                                                                      var3[var5] = (byte)-100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var6 == 382) {
                                                                        var3[var5] = (byte)-98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var6 == 376) {
                                                                          var3[var5] = (byte)-97;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var5] = (byte)63;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var5] = (byte)-102;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var3[var5] = (byte)-103;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var3[var5] = (byte)-104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var5] = (byte)-105;
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var3[var5] = (byte)-108;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var5] = (byte)-109;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var3[var5] = (byte)-111;
                                                break L2;
                                              }
                                            } else {
                                              var3[var5] = (byte)-114;
                                              break L2;
                                            }
                                          }
                                        } else {
                                          var3[var5] = (byte)-117;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      var3[var5] = (byte)-119;
                                      break L2;
                                    }
                                  } else {
                                    var3[var5] = (byte)-120;
                                    break L2;
                                  }
                                }
                              } else {
                                var3[var5] = (byte)-122;
                                break L2;
                              }
                            } else {
                              var3[var5] = (byte)-123;
                              break L2;
                            }
                          } else {
                            var3[var5] = (byte)-124;
                            break L2;
                          }
                        }
                      } else {
                        var3[var5] = (byte)-126;
                        break L2;
                      }
                    }
                  }
                  var3[var5] = (byte)var6;
                  break L2;
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var2);
            stackOut_68_1 = new StringBuilder().append("vg.A(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L6;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ',' + param1 + ')');
        }
        return stackIn_67_0;
    }

    final void e(int param0) {
        this.field_m = true;
        this.b(0, this.field_h.field_g[this.field_c]);
        if (param0 <= 43) {
            this.field_n = (double[]) null;
        }
    }

    final static sm a(sm[] param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sm[] var6 = null;
        int var7_int = 0;
        sm[] var7 = null;
        int var8 = 0;
        sm var8_ref_sm = null;
        sm var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        sm[] var17 = null;
        sm var18 = null;
        sm var19 = null;
        sm stackIn_3_0 = null;
        sm stackIn_49_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sm stackOut_48_0 = null;
        sm stackOut_2_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var16 = Torquing.field_u;
        try {
          L0: {
            var2_int = 2147483647;
            var3 = -2147483648;
            var4 = 2147483647;
            var5 = -2147483648;
            if (param1 >= 11) {
              var17 = param0;
              var6 = var17;
              var7_int = 0;
              L1: while (true) {
                if (var17.length <= var7_int) {
                  var18 = new sm(var3 - var2_int, -var4 + var5, 0);
                  var19 = var18;
                  var18.field_k = param0[0].field_k;
                  var19.field_g = var4;
                  var19.field_a = var2_int;
                  var7 = param0;
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7.length) {
                      stackOut_48_0 = (sm) (var19);
                      stackIn_49_0 = stackOut_48_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        var9 = var7[var8];
                        var10 = 0;
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 640;
                        var12 = var12 - var19.field_a;
                        var15 = 480;
                        var13 = var13 - var19.field_g;
                        var11 = var11 - var9.field_g;
                        var10 = var10 - var9.field_a;
                        if (var11 < 0) {
                          var15 = var15 + var11;
                          var13 = var13 - var11;
                          var11 = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if ((var10 ^ -1) > -1) {
                          var12 = var12 - var10;
                          var14 = var14 + var10;
                          var10 = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if ((var13 ^ -1) > -1) {
                          var11 = var11 - var13;
                          var15 = var15 + var13;
                          var13 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (-1 >= (var12 ^ -1)) {
                          break L6;
                        } else {
                          var14 = var14 + var12;
                          var10 = var10 - var12;
                          var12 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (-var10 + var9.field_c < var14) {
                          var14 = -var10 + var9.field_c;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (var15 > -var11 + var9.field_d) {
                          var15 = var9.field_d - var11;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (var14 > var19.field_c - var12) {
                          var14 = -var12 + var19.field_c;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (-var13 + var19.field_d < var15) {
                          var15 = -var13 + var19.field_d;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      if ((var14 ^ -1) < -1) {
                        L11: {
                          if (var15 > 0) {
                            oc.a((byte) 0, 0, var12 + var19.field_c * var13, var19.field_l, var15, -var14 + var9.field_c, -var14 + var19.field_c, var14, var11 * var9.field_c - -var10, var9.field_l);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var8++;
                        continue L2;
                      } else {
                        var8++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  L12: {
                    var8_ref_sm = var17[var7_int];
                    if (var8_ref_sm.field_g + var8_ref_sm.field_d <= var5) {
                      break L12;
                    } else {
                      var5 = var8_ref_sm.field_g - -var8_ref_sm.field_d;
                      break L12;
                    }
                  }
                  L13: {
                    if (var3 < var8_ref_sm.field_a - -var8_ref_sm.field_c) {
                      var3 = var8_ref_sm.field_a - -var8_ref_sm.field_c;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (var4 > var8_ref_sm.field_g) {
                      var4 = var8_ref_sm.field_g;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  if (var8_ref_sm.field_a < var2_int) {
                    var2_int = var8_ref_sm.field_a;
                    var7_int++;
                    continue L1;
                  } else {
                    var7_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = (sm) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("vg.C(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L15;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L15;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_49_0;
        }
    }

    final void a(double param0, double param1, int param2, double param3) {
        double var8 = -param3 + this.field_g[0];
        double var10 = -param0 + this.field_g[param2];
        double var12 = this.field_g[2] - param1;
        double var14 = 5120.0 / Math.sqrt(var12 * var12 + (var8 * var8 + var10 * var10));
        this.field_n[1] = this.field_n[1] + var10 * var14;
        this.field_n[0] = this.field_n[0] + var14 * var8;
        this.field_n[2] = this.field_n[2] + var14 * var12;
    }

    final sg a(int param0, hc param1) {
        RuntimeException var3 = null;
        int var4_int = 0;
        kh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        tl[] var8 = null;
        tl[] var9 = null;
        int stackIn_17_0 = 0;
        sg stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        sg stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            var8 = param1.field_q;
            var9 = var8;
            param1.d(-18916);
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= var8.length) {
                L2: {
                  var4 = param1.a(-100, true);
                  this.field_h = new sg(3 + var9.length);
                  this.field_h.a(0, var4);
                  this.field_h.a(1, tp.field_a);
                  if (param0 < -52) {
                    break L2;
                  } else {
                    this.e(19);
                    break L2;
                  }
                }
                this.field_c = 1;
                this.field_h.a(var9.length - -2, param1.c(-20561));
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var9.length) {
                    L4: {
                      if (param1.field_k == null) {
                        break L4;
                      } else {
                        this.field_h.a(0, param1.field_k);
                        break L4;
                      }
                    }
                    L5: {
                      if (0 < var9.length) {
                        if (null == var9[0].field_d) {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L5;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_17_0 = stackOut_14_0;
                          break L5;
                        }
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_17_0 = stackOut_12_0;
                        break L5;
                      }
                    }
                    var5 = stackIn_17_0;
                    this.field_a = param1;
                    var6 = 0;
                    L6: while (true) {
                      if (var9.length <= var6) {
                        L7: {
                          this.a(param1.f(50), 18910);
                          this.b(1);
                          if (var5 != 0) {
                            param1.field_k = this.field_h.a(0);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        stackOut_23_0 = this.field_h;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      } else {
                        var9[var6].field_a = param1;
                        var9[var6].field_h = this.field_h;
                        var9[var6].e((byte) -91);
                        var6++;
                        continue L6;
                      }
                    }
                  } else {
                    this.field_h.a(2 - -var5, var9[var5].d(-2));
                    var9[var5].field_c = var5 + 2;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var8[var4_int].d(-2).field_q.field_r = 0;
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("vg.J(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final static boolean d(int param0) {
        if (param0 != 0) {
            field_l = 85;
        }
        return ff.field_a;
    }

    final void a(boolean param0, int[] param1) {
        try {
            param1[2] = this.field_f[2];
            param1[0] = this.field_f[0];
            if (!param0) {
                field_l = -37;
            }
            param1[1] = this.field_f[1];
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "vg.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, kh param1) {
        try {
            if (param0 != 0) {
                field_k = (fj) null;
            }
            if (!(!this.field_m)) {
                param1 = this.a(-1, param1);
            }
            this.field_h.a(this.field_c, param1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "vg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final double a(double[] param0, boolean param1, double param2, boolean param3, int param4, boolean param5) {
        RuntimeException var8 = null;
        Object stackIn_1_0 = null;
        double stackIn_1_1 = 0.0;
        double[] stackIn_1_2 = null;
        boolean stackIn_1_3 = false;
        int stackIn_1_4 = 0;
        boolean stackIn_1_5 = false;
        boolean stackIn_1_6 = false;
        double stackIn_1_7 = 0.0;
        Object stackIn_2_0 = null;
        double stackIn_2_1 = 0.0;
        double[] stackIn_2_2 = null;
        boolean stackIn_2_3 = false;
        int stackIn_2_4 = 0;
        boolean stackIn_2_5 = false;
        boolean stackIn_2_6 = false;
        double stackIn_2_7 = 0.0;
        Object stackIn_3_0 = null;
        double stackIn_3_1 = 0.0;
        double[] stackIn_3_2 = null;
        boolean stackIn_3_3 = false;
        int stackIn_3_4 = 0;
        boolean stackIn_3_5 = false;
        boolean stackIn_3_6 = false;
        double stackIn_3_7 = 0.0;
        double stackIn_3_8 = 0.0;
        double stackIn_4_0 = 0.0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        double stackOut_0_1 = 0.0;
        double[] stackOut_0_2 = null;
        boolean stackOut_0_3 = false;
        int stackOut_0_4 = 0;
        boolean stackOut_0_5 = false;
        boolean stackOut_0_6 = false;
        double stackOut_0_7 = 0.0;
        Object stackOut_2_0 = null;
        double stackOut_2_1 = 0.0;
        double[] stackOut_2_2 = null;
        boolean stackOut_2_3 = false;
        int stackOut_2_4 = 0;
        boolean stackOut_2_5 = false;
        boolean stackOut_2_6 = false;
        double stackOut_2_7 = 0.0;
        double stackOut_2_8 = 0.0;
        Object stackOut_1_0 = null;
        double stackOut_1_1 = 0.0;
        double[] stackOut_1_2 = null;
        boolean stackOut_1_3 = false;
        int stackOut_1_4 = 0;
        boolean stackOut_1_5 = false;
        boolean stackOut_1_6 = false;
        double stackOut_1_7 = 0.0;
        double stackOut_1_8 = 0.0;
        double stackOut_3_0 = 0.0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackOut_0_1 = param2;
              stackOut_0_2 = (double[]) (param0);
              stackOut_0_3 = param3;
              stackOut_0_4 = -6076;
              stackOut_0_5 = param1;
              stackOut_0_6 = param5;
              stackOut_0_7 = 30.0;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_2_4 = stackOut_0_4;
              stackIn_2_5 = stackOut_0_5;
              stackIn_2_6 = stackOut_0_6;
              stackIn_2_7 = stackOut_0_7;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              stackIn_1_4 = stackOut_0_4;
              stackIn_1_5 = stackOut_0_5;
              stackIn_1_6 = stackOut_0_6;
              stackIn_1_7 = stackOut_0_7;
              if (this.field_m) {
                stackOut_2_0 = this;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = (double[]) ((Object) stackIn_2_2);
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = stackIn_2_6;
                stackOut_2_7 = stackIn_2_7;
                stackOut_2_8 = 1.0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                stackIn_3_5 = stackOut_2_5;
                stackIn_3_6 = stackOut_2_6;
                stackIn_3_7 = stackOut_2_7;
                stackIn_3_8 = stackOut_2_8;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = (double[]) ((Object) stackIn_1_2);
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = stackIn_1_4;
                stackOut_1_5 = stackIn_1_5;
                stackOut_1_6 = stackIn_1_6;
                stackOut_1_7 = stackIn_1_7;
                stackOut_1_8 = 0.0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                stackIn_3_5 = stackOut_1_5;
                stackIn_3_6 = stackOut_1_6;
                stackIn_3_7 = stackOut_1_7;
                stackIn_3_8 = stackOut_1_8;
                break L1;
              }
            }
            ((vg) (this)).field_g = hl.a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_3_6, stackIn_3_7, stackIn_3_8, this.field_a, this.field_g, this.field_n);
            this.field_n[param4] = 0.0;
            this.field_n[1] = 0.0;
            this.field_n[2] = 0.0;
            this.c(param4 ^ 0);
            this.field_h.a(this.field_h.field_g[this.field_c], this.field_f);
            stackOut_3_0 = ap.a(this.field_g, 0, re.field_d, 0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("vg.L(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    private final kh a(int param0, kh param1) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        kh stackIn_2_0 = null;
        kh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_3_0 = null;
        kh stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -1) {
              var3 = new kh(new rm(new rm[]{param1.field_l, gb.field_c.field_l}, 2));
              stackOut_3_0 = (kh) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (kh) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("vg.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void d(byte param0) {
        if (param0 >= -75) {
            return;
        }
        field_k = null;
    }

    final static la a(int param0, int param1) {
        if (param0 != -27646) {
            return (la) null;
        }
        return hc.a(false, true, param1, 8505, false, 1);
    }

    private final void a(double[] param0, int param1) {
        double[] var5 = null;
        double[] var4 = null;
        boolean discarded$0 = false;
        try {
            this.field_m = false;
            dk.a(param0, 0, this.field_g, 0, this.field_g.length);
            var5 = this.field_n;
            double[] var3 = var5;
            var4 = this.field_n;
            this.field_n[2] = 0.0;
            var4[1] = 0.0;
            var5[0] = 0.0;
            discarded$0 = he.a(this.field_a, 0.08, this.field_g, 16777215, 30.0);
            this.c(param1 ^ param1);
            this.field_h.a(tp.field_a, this.field_f);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "vg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final lm a(byte param0) {
        if (param0 > -24) {
            vg.d((byte) -59);
        }
        return (lm) ((Object) new ej(this.field_g[0], this.field_g[1], this.field_g[2], 30.0));
    }

    vg() {
        this.field_n = new double[3];
    }

    static {
        field_l = 0;
    }
}
