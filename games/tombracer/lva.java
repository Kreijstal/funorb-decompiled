/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lva extends ci {
    private short[] field_r;
    int field_w;
    int field_n;
    boolean field_s;
    private byte[] field_p;
    int field_z;
    static nh[] field_m;
    static String field_o;
    static String field_v;
    static String field_y;
    static jea field_t;
    int field_x;
    int field_u;
    private short[] field_q;

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (0 < ((lva) this).field_x) {
            ((lva) this).field_q = new short[((lva) this).field_n];
            ((lva) this).field_r = new short[((lva) this).field_n];
            var2 = 0;
            L1: while (true) {
              if (((lva) this).field_n <= var2) {
                break L0;
              } else {
                ((lva) this).field_q[var2] = (short)(int)(Math.pow((double)((float)((lva) this).field_x / 4096.0f), (double)var2) * 4096.0);
                ((lva) this).field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L1;
              }
            }
          } else {
            if (null == ((lva) this).field_q) {
              break L0;
            } else {
              if (((lva) this).field_q.length != ((lva) this).field_n) {
                break L0;
              } else {
                ((lva) this).field_r = new short[((lva) this).field_n];
                var2 = 0;
                L2: while (true) {
                  if (((lva) this).field_n <= var2) {
                    break L0;
                  } else {
                    ((lva) this).field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
                    var2++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if (1 != var4_int) {
                  if (var4_int != 2) {
                    if (var4_int == 3) {
                      int dupTemp$1 = param1.h(255);
                      ((lva) this).field_w = dupTemp$1;
                      ((lva) this).field_u = dupTemp$1;
                      break L1;
                    } else {
                      if (var4_int != 4) {
                        if (5 == var4_int) {
                          ((lva) this).field_u = param1.h(255);
                          break L1;
                        } else {
                          if (var4_int != 6) {
                            break L1;
                          } else {
                            ((lva) this).field_w = param1.h(255);
                            break L1;
                          }
                        }
                      } else {
                        ((lva) this).field_z = param1.h(255);
                        break L1;
                      }
                    }
                  } else {
                    ((lva) this).field_x = param1.b(false);
                    if (((lva) this).field_x >= 0) {
                      break L1;
                    } else {
                      ((lva) this).field_q = new short[((lva) this).field_n];
                      var4_int = 0;
                      L2: while (true) {
                        if (var4_int >= ((lva) this).field_n) {
                          break L1;
                        } else {
                          ((lva) this).field_q[var4_int] = (short)param1.b(false);
                          var4_int++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  ((lva) this).field_n = param1.h(255);
                  break L1;
                }
              } else {
                L3: {
                  stackOut_13_0 = this;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (param1.h(255) != 1) {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L3;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L3;
                  }
                }
                ((lva) this).field_s = stackIn_16_1 != 0;
                break L1;
              }
            }
            L4: {
              if (param0 == 107) {
                break L4;
              } else {
                ((lva) this).field_u = -71;
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
            stackOut_29_1 = new StringBuilder().append("lva.A(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ')');
        }
    }

    final void a(int[] param0, int param1, int param2) {
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
        Object var20 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = sj.field_b[param2] * ((lva) this).field_w;
              if (((lva) this).field_n != 1) {
                L2: {
                  L3: {
                    var9 = ((lva) this).field_q[0];
                    if (var9 > 8) {
                      break L3;
                    } else {
                      if (var9 >= -8) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var8 = ((lva) this).field_r[0] << 12;
                    var12 = ((lva) this).field_u * var8 >> 12;
                    var11 = var5 * var8 >> 12;
                    var13 = ((lva) this).field_w * var8 >> 12;
                    var15 = var11 >> 12;
                    var16 = 1 + var15;
                    var11 = var11 & 4095;
                    if (var13 <= var16) {
                      var16 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var18 = 255 & ((lva) this).field_p[255 & var16];
                  var17 = ((lva) this).field_p[var15 & 255] & 255;
                  var14 = pba.field_b[var11];
                  var10 = 0;
                  L5: while (true) {
                    if (ns.field_g <= var10) {
                      break L2;
                    } else {
                      var4_int = ((lva) this).field_u * ht.field_Fb[var10];
                      var6 = this.a(var17, false, var14, var11, var8 * var4_int >> 12, var12, var18);
                      param0[var10] = var6 * var9 >> 12;
                      var10++;
                      continue L5;
                    }
                  }
                }
                var7 = 1;
                L6: while (true) {
                  if (((lva) this).field_n <= var7) {
                    break L1;
                  } else {
                    L7: {
                      L8: {
                        var9 = ((lva) this).field_q[var7];
                        if (var9 > 8) {
                          break L8;
                        } else {
                          if (var9 < -8) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        var8 = ((lva) this).field_r[var7] << 12;
                        var12 = var8 * ((lva) this).field_u >> 12;
                        var11 = var8 * var5 >> 12;
                        var13 = ((lva) this).field_w * var8 >> 12;
                        var15 = var11 >> 12;
                        var16 = var15 - -1;
                        var11 = var11 & 4095;
                        if (var16 >= var13) {
                          var16 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        var18 = ((lva) this).field_p[255 & var16] & 255;
                        var17 = ((lva) this).field_p[255 & var15] & 255;
                        var14 = pba.field_b[var11];
                        if (!((lva) this).field_s) {
                          break L10;
                        } else {
                          if (((lva) this).field_n + -1 == var7) {
                            var10 = 0;
                            L11: while (true) {
                              if (ns.field_g <= var10) {
                                break L7;
                              } else {
                                var4_int = ((lva) this).field_u * ht.field_Fb[var10];
                                var6 = this.a(var17, false, var14, var11, var8 * var4_int >> 12, var12, var18);
                                var6 = (var6 * var9 >> 12) + param0[var10];
                                param0[var10] = (var6 >> 1) + 2048;
                                var10++;
                                continue L11;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      var10 = 0;
                      L12: while (true) {
                        if (var10 >= ns.field_g) {
                          break L7;
                        } else {
                          var4_int = ((lva) this).field_u * ht.field_Fb[var10];
                          var6 = this.a(var17, false, var14, var11, var4_int * var8 >> 12, var12, var18);
                          param0[var10] = param0[var10] + (var9 * var6 >> 12);
                          var10++;
                          continue L12;
                        }
                      }
                    }
                    var7++;
                    continue L6;
                  }
                }
              } else {
                L13: {
                  var8 = ((lva) this).field_r[0] << 12;
                  var9 = ((lva) this).field_q[0];
                  var12 = var8 * ((lva) this).field_u >> 12;
                  var11 = var8 * var5 >> 12;
                  var13 = ((lva) this).field_w * var8 >> 12;
                  var15 = var11 >> 12;
                  var16 = 1 + var15;
                  if (var16 >= var13) {
                    var16 = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var11 = var11 & 4095;
                var17 = ((lva) this).field_p[255 & var15] & 255;
                var14 = pba.field_b[var11];
                var18 = ((lva) this).field_p[var16 & 255] & 255;
                if (!((lva) this).field_s) {
                  var10 = 0;
                  L14: while (true) {
                    if (var10 >= ns.field_g) {
                      break L1;
                    } else {
                      var4_int = ht.field_Fb[var10] * ((lva) this).field_u;
                      var6 = this.a(var17, false, var14, var11, var4_int * var8 >> 12, var12, var18);
                      param0[var10] = var9 * var6 >> 12;
                      var10++;
                      continue L14;
                    }
                  }
                } else {
                  var10 = 0;
                  L15: while (true) {
                    if (ns.field_g <= var10) {
                      break L1;
                    } else {
                      var4_int = ht.field_Fb[var10] * ((lva) this).field_u;
                      var6 = this.a(var17, false, var14, var11, var4_int * var8 >> 12, var12, var18);
                      var6 = var6 * var9 >> 12;
                      param0[var10] = 2048 - -(var6 >> 1);
                      var10++;
                      continue L15;
                    }
                  }
                }
              }
            }
            L16: {
              if (param1 == -1) {
                break L16;
              } else {
                var20 = null;
                ((lva) this).a((byte) 111, (uia) null, 5);
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var4;
            stackOut_42_1 = new StringBuilder().append("lva.I(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L17;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L17;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 >= -34) {
            lva.d((byte) 124);
        }
        field_o = null;
        field_m = null;
        field_y = null;
        field_t = null;
        field_v = null;
    }

    final static boolean a(int param0, byte param1, int param2) {
        return hh.a(param0, (byte) 5, param2) || upa.a(param2, 0, param0);
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          ((lva) this).field_p = pca.a(((lva) this).field_z, (byte) 109);
          if (param0 == 116) {
            break L0;
          } else {
            ((lva) this).b((byte) 55);
            break L0;
          }
        }
        this.c(0);
        var2 = ((lva) this).field_n - 1;
        L1: while (true) {
          L2: {
            if (var2 < 1) {
              break L2;
            } else {
              var3 = ((lva) this).field_q[var2];
              if (var3 > 8) {
                break L2;
              } else {
                if (var3 >= -8) {
                  ((lva) this).field_n = ((lva) this).field_n - 1;
                  var2--;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = ((lva) this).field_i.a((byte) -119, param1);
        int[] var3 = var4;
        if (param0 != 1) {
            ((lva) this).field_q = null;
        }
        if (!(!((lva) this).field_i.field_d)) {
            ((lva) this).a(var4, param0 + -2, param1);
        }
        return var4;
    }

    final static void a(g[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        if (!(param1 < param2)) {
            return;
        }
        try {
            var4_int = param1;
            var5 = po.a(param2, var4_int, param1, (byte) -65, param0);
            lva.a(param0, param1, -1 + var5, param3);
            lva.a(param0, 1 + var5, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lva.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
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
          var18 = TombRacer.field_G ? 1 : 0;
          var13 = param4 >> 12;
          var12 = 1 + var13;
          var13 = var13 & 255;
          param4 = param4 & 4095;
          if (param5 > var12) {
            break L0;
          } else {
            var12 = 0;
            break L0;
          }
        }
        L1: {
          var10 = -4096 + param3;
          var12 = var12 & 255;
          var11 = -4096 + param4;
          var15 = pba.field_b[param4];
          var14 = 3 & ((lva) this).field_p[param0 + var13];
          if (var14 > 1) {
            L2: {
              if (var14 == 2) {
                stackOut_9_0 = param4 + -param3;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = -param4 + -param3;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            var8 = stackIn_10_0;
            break L1;
          } else {
            L3: {
              if (0 == var14) {
                stackOut_5_0 = param3 + param4;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = -param4 + param3;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            var8 = stackIn_6_0;
            break L1;
          }
        }
        L4: {
          var14 = 3 & ((lva) this).field_p[var12 + param0];
          if (var14 > 1) {
            L5: {
              if (2 == var14) {
                stackOut_18_0 = var11 + -param3;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = -param3 + -var11;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var9 = stackIn_19_0;
            break L4;
          } else {
            L6: {
              if (var14 != 0) {
                stackOut_14_0 = -var11 + param3;
                stackIn_15_0 = stackOut_14_0;
                break L6;
              } else {
                stackOut_13_0 = param3 + var11;
                stackIn_15_0 = stackOut_13_0;
                break L6;
              }
            }
            var9 = stackIn_15_0;
            break L4;
          }
        }
        L7: {
          var16 = var8 - -((var9 - var8) * var15 >> 12);
          var14 = ((lva) this).field_p[var13 + param6] & 3;
          if (1 >= var14) {
            L8: {
              if (var14 == 0) {
                stackOut_27_0 = param4 + var10;
                stackIn_28_0 = stackOut_27_0;
                break L8;
              } else {
                stackOut_26_0 = -param4 + var10;
                stackIn_28_0 = stackOut_26_0;
                break L8;
              }
            }
            var8 = stackIn_28_0;
            break L7;
          } else {
            L9: {
              if (2 != var14) {
                stackOut_23_0 = -var10 + -param4;
                stackIn_24_0 = stackOut_23_0;
                break L9;
              } else {
                stackOut_22_0 = -var10 + param4;
                stackIn_24_0 = stackOut_22_0;
                break L9;
              }
            }
            var8 = stackIn_24_0;
            break L7;
          }
        }
        L10: {
          var14 = ((lva) this).field_p[param6 + var12] & 3;
          if (var14 <= 1) {
            L11: {
              if (0 != var14) {
                stackOut_36_0 = -var11 + var10;
                stackIn_37_0 = stackOut_36_0;
                break L11;
              } else {
                stackOut_35_0 = var11 + var10;
                stackIn_37_0 = stackOut_35_0;
                break L11;
              }
            }
            var9 = stackIn_37_0;
            break L10;
          } else {
            L12: {
              if (2 == var14) {
                stackOut_32_0 = -var10 + var11;
                stackIn_33_0 = stackOut_32_0;
                break L12;
              } else {
                stackOut_31_0 = -var11 - var10;
                stackIn_33_0 = stackOut_31_0;
                break L12;
              }
            }
            var9 = stackIn_33_0;
            break L10;
          }
        }
        var17 = ((-var8 + var9) * var15 >> 12) + var8;
        return var16 - -(param2 * (-var16 + var17) >> 12);
    }

    public lva() {
        super(0, true);
        ((lva) this).field_s = true;
        ((lva) this).field_z = 0;
        ((lva) this).field_x = 1638;
        ((lva) this).field_n = 4;
        ((lva) this).field_p = new byte[512];
        ((lva) this).field_u = 4;
        ((lva) this).field_w = 4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Click or press F10 to open Quick Chat";
        field_y = "Arrow";
        field_v = "You cannot join this game - it is in progress";
    }
}
