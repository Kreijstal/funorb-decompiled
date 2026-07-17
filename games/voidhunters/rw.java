/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rw extends le {
    private short[] field_m;
    boolean field_s;
    int field_j;
    int field_o;
    int field_k;
    static float field_n;
    private short[] field_t;
    private int field_i;
    static int field_q;
    int field_r;
    private byte[] field_p;
    static asb field_l;

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          var2 = 25;
          if (((rw) this).field_k <= 0) {
            if (((rw) this).field_m == null) {
              break L0;
            } else {
              if (((rw) this).field_m.length == ((rw) this).field_r) {
                ((rw) this).field_t = new short[((rw) this).field_r];
                var3 = 0;
                L1: while (true) {
                  if (((rw) this).field_r <= var3) {
                    break L0;
                  } else {
                    ((rw) this).field_t[var3] = (short)(int)Math.pow(2.0, (double)var3);
                    var3++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            ((rw) this).field_t = new short[((rw) this).field_r];
            ((rw) this).field_m = new short[((rw) this).field_r];
            var3 = 0;
            L2: while (true) {
              if (((rw) this).field_r <= var3) {
                break L0;
              } else {
                ((rw) this).field_m[var3] = (short)(int)(4096.0 * Math.pow((double)((float)((rw) this).field_k / 4096.0f), (double)var3));
                ((rw) this).field_t[var3] = (short)(int)Math.pow(2.0, (double)var3);
                var3++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = ((rw) this).field_o * sj.field_p[param1];
              if (param0 == ((rw) this).field_r) {
                L2: {
                  var8 = ((rw) this).field_t[0] << 12;
                  var9 = ((rw) this).field_m[0];
                  var12 = var8 * ((rw) this).field_j >> 12;
                  var13 = var8 * ((rw) this).field_o >> 12;
                  var11 = var5 * var8 >> 12;
                  var15 = var11 >> 12;
                  var16 = var15 + 1;
                  if (~var13 < ~var16) {
                    break L2;
                  } else {
                    var16 = 0;
                    break L2;
                  }
                }
                var11 = var11 & 4095;
                var14 = ocb.field_h[var11];
                var17 = ((rw) this).field_p[255 & var15] & 255;
                var18 = 255 & ((rw) this).field_p[255 & var16];
                if (((rw) this).field_s) {
                  var10 = 0;
                  L3: while (true) {
                    if (~hob.field_d >= ~var10) {
                      break L1;
                    } else {
                      var4_int = grb.field_l[var10] * ((rw) this).field_j;
                      var6 = this.a(var18, var17, var12, var4_int * var8 >> 12, var14, var11, (byte) -34);
                      var6 = var9 * var6 >> 12;
                      param2[var10] = 2048 + (var6 >> 1);
                      var10++;
                      continue L3;
                    }
                  }
                } else {
                  var10 = 0;
                  L4: while (true) {
                    if (hob.field_d <= var10) {
                      break L1;
                    } else {
                      var4_int = ((rw) this).field_j * grb.field_l[var10];
                      var6 = this.a(var18, var17, var12, var4_int * var8 >> 12, var14, var11, (byte) -34);
                      param2[var10] = var9 * var6 >> 12;
                      var10++;
                      continue L4;
                    }
                  }
                }
              } else {
                L5: {
                  L6: {
                    var9 = ((rw) this).field_m[0];
                    if (var9 > 8) {
                      break L6;
                    } else {
                      if (var9 < -8) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L7: {
                    var8 = ((rw) this).field_t[0] << 12;
                    var13 = ((rw) this).field_o * var8 >> 12;
                    var11 = var8 * var5 >> 12;
                    var12 = ((rw) this).field_j * var8 >> 12;
                    var15 = var11 >> 12;
                    var16 = 1 + var15;
                    if (~var16 > ~var13) {
                      break L7;
                    } else {
                      var16 = 0;
                      break L7;
                    }
                  }
                  var11 = var11 & 4095;
                  var14 = ocb.field_h[var11];
                  var17 = 255 & ((rw) this).field_p[255 & var15];
                  var18 = ((rw) this).field_p[255 & var16] & 255;
                  var10 = 0;
                  L8: while (true) {
                    if (var10 >= hob.field_d) {
                      break L5;
                    } else {
                      var4_int = grb.field_l[var10] * ((rw) this).field_j;
                      var6 = this.a(var18, var17, var12, var4_int * var8 >> 12, var14, var11, (byte) -34);
                      param2[var10] = var9 * var6 >> 12;
                      var10++;
                      continue L8;
                    }
                  }
                }
                var7 = 1;
                L9: while (true) {
                  if (var7 >= ((rw) this).field_r) {
                    break L1;
                  } else {
                    L10: {
                      L11: {
                        var9 = ((rw) this).field_m[var7];
                        if (8 < var9) {
                          break L11;
                        } else {
                          if (var9 < -8) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L12: {
                        var8 = ((rw) this).field_t[var7] << 12;
                        var12 = ((rw) this).field_j * var8 >> 12;
                        var11 = var5 * var8 >> 12;
                        var13 = var8 * ((rw) this).field_o >> 12;
                        var15 = var11 >> 12;
                        var16 = 1 + var15;
                        var11 = var11 & 4095;
                        if (~var13 >= ~var16) {
                          var16 = 0;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        var14 = ocb.field_h[var11];
                        var17 = ((rw) this).field_p[var15 & 255] & 255;
                        var18 = ((rw) this).field_p[255 & var16] & 255;
                        if (!((rw) this).field_s) {
                          break L13;
                        } else {
                          if (((rw) this).field_r + -1 != var7) {
                            break L13;
                          } else {
                            var10 = 0;
                            L14: while (true) {
                              if (~hob.field_d >= ~var10) {
                                break L10;
                              } else {
                                var4_int = ((rw) this).field_j * grb.field_l[var10];
                                var6 = this.a(var18, var17, var12, var8 * var4_int >> 12, var14, var11, (byte) -34);
                                var6 = (var9 * var6 >> 12) + param2[var10];
                                param2[var10] = 2048 - -(var6 >> 1);
                                var10++;
                                continue L14;
                              }
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L15: while (true) {
                        if (~var10 <= ~hob.field_d) {
                          break L10;
                        } else {
                          var4_int = grb.field_l[var10] * ((rw) this).field_j;
                          var6 = this.a(var18, var17, var12, var8 * var4_int >> 12, var14, var11, (byte) -34);
                          param2[var10] = param2[var10] + (var6 * var9 >> 12);
                          var10++;
                          continue L15;
                        }
                      }
                    }
                    var7++;
                    continue L9;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4;
            stackOut_37_1 = new StringBuilder().append("rw.C(").append(param0).append(44).append(param1).append(44);
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
              break L16;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L16;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        ((rw) this).field_p = ihb.a((byte) 95, ((rw) this).field_i);
        this.d(-80);
        var2 = ((rw) this).field_r - 1;
        if (param0 < -35) {
          L0: while (true) {
            L1: {
              if (var2 < 1) {
                break L1;
              } else {
                L2: {
                  var3 = ((rw) this).field_m[var2];
                  if (var3 > 8) {
                    break L2;
                  } else {
                    if (var3 < -8) {
                      break L2;
                    } else {
                      ((rw) this).field_r = ((rw) this).field_r - 1;
                      var2--;
                      continue L0;
                    }
                  }
                }
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public rw() {
        super(0, true);
        ((rw) this).field_o = 4;
        ((rw) this).field_j = 4;
        ((rw) this).field_s = true;
        ((rw) this).field_i = 0;
        ((rw) this).field_r = 4;
        ((rw) this).field_k = 1638;
        ((rw) this).field_p = new byte[512];
    }

    final void a(int param0, int param1, ds param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (0 != var4_int) {
                if (1 == var4_int) {
                  ((rw) this).field_r = param2.e((byte) -96);
                  break L1;
                } else {
                  if (2 != var4_int) {
                    if (var4_int != 3) {
                      if (4 == var4_int) {
                        ((rw) this).field_i = param2.e((byte) -92);
                        break L1;
                      } else {
                        if (var4_int == 5) {
                          ((rw) this).field_j = param2.e((byte) -111);
                          break L1;
                        } else {
                          if (var4_int != 6) {
                            break L1;
                          } else {
                            ((rw) this).field_o = param2.e((byte) -95);
                            break L1;
                          }
                        }
                      }
                    } else {
                      int dupTemp$1 = param2.e((byte) -106);
                      ((rw) this).field_o = dupTemp$1;
                      ((rw) this).field_j = dupTemp$1;
                      break L1;
                    }
                  } else {
                    ((rw) this).field_k = param2.a(true);
                    if (((rw) this).field_k < 0) {
                      ((rw) this).field_m = new short[((rw) this).field_r];
                      var4_int = 0;
                      L2: while (true) {
                        if (~((rw) this).field_r >= ~var4_int) {
                          break L1;
                        } else {
                          ((rw) this).field_m[var4_int] = (short)param2.a(true);
                          var4_int++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                L3: {
                  stackOut_12_0 = this;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (param2.e((byte) -127) != 1) {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L3;
                  } else {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L3;
                  }
                }
                ((rw) this).field_s = stackIn_15_1 != 0;
                break L1;
              }
            }
            L4: {
              if (param1 <= -60) {
                break L4;
              } else {
                ((rw) this).field_k = -4;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("rw.F(").append(param0).append(44).append(param1).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var18 = VoidHunters.field_G;
          var13 = param3 >> 12;
          var12 = 1 + var13;
          var13 = var13 & 255;
          if (~var12 > ~param2) {
            break L0;
          } else {
            var12 = 0;
            break L0;
          }
        }
        L1: {
          param3 = param3 & 4095;
          var12 = var12 & 255;
          var11 = param3 + -4096;
          var10 = -4096 + param5;
          var14 = ((rw) this).field_p[var13 - -param1] & 3;
          var15 = ocb.field_h[param3];
          if (var14 > 1) {
            L2: {
              if (var14 != 2) {
                stackOut_9_0 = -param5 + -param3;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = -param5 + param3;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            var8 = stackIn_10_0;
            break L1;
          } else {
            L3: {
              if (var14 == 0) {
                stackOut_5_0 = param3 + param5;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = -param3 + param5;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            var8 = stackIn_6_0;
            break L1;
          }
        }
        L4: {
          var14 = 3 & ((rw) this).field_p[var12 + param1];
          if (var14 <= 1) {
            L5: {
              if (0 == var14) {
                stackOut_18_0 = var11 - -param5;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = -var11 + param5;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var9 = stackIn_19_0;
            break L4;
          } else {
            L6: {
              if (var14 != 2) {
                stackOut_14_0 = -param5 + -var11;
                stackIn_15_0 = stackOut_14_0;
                break L6;
              } else {
                stackOut_13_0 = -param5 + var11;
                stackIn_15_0 = stackOut_13_0;
                break L6;
              }
            }
            var9 = stackIn_15_0;
            break L4;
          }
        }
        L7: {
          var14 = ((rw) this).field_p[param0 + var13] & 3;
          var16 = var8 + ((-var8 + var9) * var15 >> 12);
          if (var14 <= 1) {
            L8: {
              if (var14 == 0) {
                stackOut_27_0 = param3 + var10;
                stackIn_28_0 = stackOut_27_0;
                break L8;
              } else {
                stackOut_26_0 = var10 - param3;
                stackIn_28_0 = stackOut_26_0;
                break L8;
              }
            }
            var8 = stackIn_28_0;
            break L7;
          } else {
            L9: {
              if (var14 != 2) {
                stackOut_23_0 = -var10 + -param3;
                stackIn_24_0 = stackOut_23_0;
                break L9;
              } else {
                stackOut_22_0 = param3 - var10;
                stackIn_24_0 = stackOut_22_0;
                break L9;
              }
            }
            var8 = stackIn_24_0;
            break L7;
          }
        }
        L10: {
          var14 = 3 & ((rw) this).field_p[param0 + var12];
          if (var14 > 1) {
            L11: {
              if (2 != var14) {
                stackOut_36_0 = -var10 + -var11;
                stackIn_37_0 = stackOut_36_0;
                break L11;
              } else {
                stackOut_35_0 = var11 - var10;
                stackIn_37_0 = stackOut_35_0;
                break L11;
              }
            }
            var9 = stackIn_37_0;
            break L10;
          } else {
            L12: {
              if (0 == var14) {
                stackOut_32_0 = var11 + var10;
                stackIn_33_0 = stackOut_32_0;
                break L12;
              } else {
                stackOut_31_0 = var10 + -var11;
                stackIn_33_0 = stackOut_31_0;
                break L12;
              }
            }
            var9 = stackIn_33_0;
            break L10;
          }
        }
        var17 = var8 - -(var15 * (var9 - var8) >> 12);
        return (param4 * (-var16 + var17) >> 12) + var16;
    }

    public static void e(byte param0) {
        field_l = null;
        int var1 = -1;
    }

    final int[] a(int param0, boolean param1) {
        int[] var5 = ((rw) this).field_f.a((byte) 127, param0);
        int[] var3 = var5;
        if (((rw) this).field_f.field_e) {
            ((rw) this).a(1, param0, var5);
        }
        if (!param1) {
            Object var4 = null;
            ((rw) this).a(-38, 6, (ds) null);
        }
        return var5;
    }

    final static void a(boolean param0, byte param1) {
        pi.a((byte) -121, true, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 1.0f;
        field_q = 0;
    }
}
