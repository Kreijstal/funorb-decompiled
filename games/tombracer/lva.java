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
        int var2;
        int var3;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 < this.field_x) {
            this.field_q = new short[this.field_n];
            this.field_r = new short[this.field_n];
            var2 = 0;
            L1: while (true) {
              if (this.field_n <= var2) {
                break L0;
              } else {
                this.field_q[var2] = (short)(int)(Math.pow((double)((float)this.field_x / 4096.0f), (double)var2) * 4096.0);
                this.field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L1;
              }
            }
          } else {
            if (null == this.field_q) {
              break L0;
            } else {
              if (this.field_q.length != this.field_n) {
                break L0;
              } else {
                this.field_r = new short[this.field_n];
                var2 = 0;
                L2: while (true) {
                  if (this.field_n <= var2) {
                    break L0;
                  } else {
                    this.field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
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
        int dupTemp$0 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (-1 != (var4_int ^ -1)) {
                if (1 != var4_int) {
                  if ((var4_int ^ -1) != -3) {
                    if (-4 == (var4_int ^ -1)) {
                      dupTemp$0 = param1.h(255);
                      this.field_w = dupTemp$0;
                      this.field_u = dupTemp$0;
                      break L1;
                    } else {
                      if ((var4_int ^ -1) != -5) {
                        if (5 == var4_int) {
                          this.field_u = param1.h(255);
                          break L1;
                        } else {
                          if (-7 != (var4_int ^ -1)) {
                            break L1;
                          } else {
                            this.field_w = param1.h(255);
                            break L1;
                          }
                        }
                      } else {
                        this.field_z = param1.h(255);
                        break L1;
                      }
                    }
                  } else {
                    this.field_x = param1.b(false);
                    if (-1 >= (this.field_x ^ -1)) {
                      break L1;
                    } else {
                      this.field_q = new short[this.field_n];
                      var4_int = 0;
                      L2: while (true) {
                        if (var4_int >= this.field_n) {
                          break L1;
                        } else {
                          this.field_q[var4_int] = (short)param1.b(false);
                          var4_int++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  this.field_n = param1.h(255);
                  break L1;
                }
              } else {
                L3: {
                  stackIn_15_0 = this;

                  if (param1.h(255) != 1) {
                    stackIn_16_0 = this;
                    stackIn_16_1 = 0;
                    break L3;
                  } else {
                    stackIn_16_0 = this;
                    stackIn_16_1 = 1;
                    break L3;
                  }
                }
                ((lva) (this)).field_s = stackIn_16_1 != 0;
                break L1;
              }
            }
            L4: {
              if (param0 == 107) {
                break L4;
              } else {
                this.field_u = -71;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var4);

            stackIn_31_1 = new StringBuilder().append("lva.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
        uia var20 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = sj.field_b[param2] * this.field_w;
              if (-2 != (this.field_n ^ -1)) {
                L2: {
                  L3: {
                    var9 = this.field_q[0];
                    if ((var9 ^ -1) < -9) {
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
                    var8 = this.field_r[0] << -973322228;
                    var12 = this.field_u * var8 >> 769815052;
                    var11 = var5 * var8 >> -488072148;
                    var13 = this.field_w * var8 >> -541816724;
                    var15 = var11 >> 697473132;
                    var16 = 1 + var15;
                    var11 = var11 & 4095;
                    if (var13 <= var16) {
                      var16 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var18 = 255 & this.field_p[255 & var16];
                  var17 = this.field_p[var15 & 255] & 255;
                  var14 = pba.field_b[var11];
                  var10 = 0;
                  L5: while (true) {
                    if (ns.field_g <= var10) {
                      break L2;
                    } else {
                      var4_int = this.field_u * ht.field_Fb[var10];
                      var6 = this.a(var17, false, var14, var11, var8 * var4_int >> 1782175724, var12, var18);
                      param0[var10] = var6 * var9 >> 1965694156;
                      var10++;
                      continue L5;
                    }
                  }
                }
                var7 = 1;
                L6: while (true) {
                  if (this.field_n <= var7) {
                    break L1;
                  } else {
                    L7: {
                      L8: {
                        var9 = this.field_q[var7];
                        if ((var9 ^ -1) < -9) {
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
                        var8 = this.field_r[var7] << -1484201140;
                        var12 = var8 * this.field_u >> -1962821908;
                        var11 = var8 * var5 >> 791864492;
                        var13 = this.field_w * var8 >> 959129612;
                        var15 = var11 >> -1090151316;
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
                        var18 = this.field_p[255 & var16] & 255;
                        var17 = this.field_p[255 & var15] & 255;
                        var14 = pba.field_b[var11];
                        if (!this.field_s) {
                          break L10;
                        } else {
                          if (this.field_n + -1 == var7) {
                            var10 = 0;
                            L11: while (true) {
                              if (ns.field_g <= var10) {
                                break L7;
                              } else {
                                var4_int = this.field_u * ht.field_Fb[var10];
                                var6 = this.a(var17, false, var14, var11, var8 * var4_int >> -1115609108, var12, var18);
                                var6 = (var6 * var9 >> 1811384652) + param0[var10];
                                param0[var10] = (var6 >> 1789871265) + 2048;
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
                          var4_int = this.field_u * ht.field_Fb[var10];
                          var6 = this.a(var17, false, var14, var11, var4_int * var8 >> -973656244, var12, var18);
                          param0[var10] = param0[var10] + (var9 * var6 >> 2027859756);
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
                  var8 = this.field_r[0] << -2065260724;
                  var9 = this.field_q[0];
                  var12 = var8 * this.field_u >> 1942397100;
                  var11 = var8 * var5 >> 89401164;
                  var13 = this.field_w * var8 >> -1388217204;
                  var15 = var11 >> -1894182836;
                  var16 = 1 + var15;
                  if (var16 >= var13) {
                    var16 = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var11 = var11 & 4095;
                var17 = this.field_p[255 & var15] & 255;
                var14 = pba.field_b[var11];
                var18 = this.field_p[var16 & 255] & 255;
                if (!this.field_s) {
                  var10 = 0;
                  L14: while (true) {
                    if (var10 >= ns.field_g) {
                      break L1;
                    } else {
                      var4_int = ht.field_Fb[var10] * this.field_u;
                      var6 = this.a(var17, false, var14, var11, var4_int * var8 >> 450044812, var12, var18);
                      param0[var10] = var9 * var6 >> -809375316;
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
                      var4_int = ht.field_Fb[var10] * this.field_u;
                      var6 = this.a(var17, false, var14, var11, var4_int * var8 >> -1888172212, var12, var18);
                      var6 = var6 * var9 >> 1930719308;
                      param0[var10] = 2048 - -(var6 >> -1023230719);
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
                var20 = (uia) null;
                this.a((byte) 111, (uia) null, 5);
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var4);

            stackIn_44_1 = new StringBuilder().append("lva.I(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L17;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L17;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ',' + param2 + ')');
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
        int stackIn_7_0 = 0;
        L0: {
          if (param1 == -21) {
            break L0;
          } else {
            field_v = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (hh.a(param0, (byte) 5, param2)) {
              break L2;
            } else {
              if (!upa.a(param2, 0, param0)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          this.field_p = pca.a(this.field_z, (byte) 109);
          if (param0 == 116) {
            break L0;
          } else {
            this.b((byte) 55);
            break L0;
          }
        }
        this.c(0);
        var2 = this.field_n - 1;
        L1: while (true) {
          L2: {
            if (var2 < 1) {
              break L2;
            } else {
              var3 = this.field_q[var2];
              if (-9 > (var3 ^ -1)) {
                break L2;
              } else {
                if (7 >= (var3 ^ -1)) {
                  this.field_n = this.field_n - 1;
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
        int[] var4 = this.field_i.a((byte) -119, param1);
        int[] var3 = var4;
        if (param0 != 1) {
            this.field_q = (short[]) null;
        }
        if (!(!this.field_i.field_d)) {
            this.a(var4, param0 + -2, param1);
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
            lva.a(param0, 1 + var5, param2, param3 + 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lva.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        var18 = TombRacer.field_G ? 1 : 0;
        if (!param1) {
          L0: {
            var13 = param4 >> -902739956;
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
            var14 = 3 & this.field_p[param0 + var13];
            if (var14 > 1) {
              L2: {
                if ((var14 ^ -1) == -3) {
                  stackIn_12_0 = param4 + -param3;
                  break L2;
                } else {
                  stackIn_12_0 = -param4 + -param3;
                  break L2;
                }
              }
              var8 = stackIn_12_0;
              break L1;
            } else {
              L3: {
                if (0 == var14) {
                  stackIn_8_0 = param3 + param4;
                  break L3;
                } else {
                  stackIn_8_0 = -param4 + param3;
                  break L3;
                }
              }
              var8 = stackIn_8_0;
              break L1;
            }
          }
          L4: {
            var14 = 3 & this.field_p[var12 + param0];
            if (var14 > 1) {
              L5: {
                if (2 == var14) {
                  stackIn_21_0 = var11 + -param3;
                  break L5;
                } else {
                  stackIn_21_0 = -param3 + -var11;
                  break L5;
                }
              }
              var9 = stackIn_21_0;
              break L4;
            } else {
              L6: {
                if (-1 != (var14 ^ -1)) {
                  stackIn_17_0 = -var11 + param3;
                  break L6;
                } else {
                  stackIn_17_0 = param3 + var11;
                  break L6;
                }
              }
              var9 = stackIn_17_0;
              break L4;
            }
          }
          L7: {
            var16 = var8 - -((var9 - var8) * var15 >> 1632800428);
            var14 = this.field_p[var13 + param6] & 3;
            if (1 >= var14) {
              L8: {
                if (-1 == (var14 ^ -1)) {
                  stackIn_30_0 = param4 + var10;
                  break L8;
                } else {
                  stackIn_30_0 = -param4 + var10;
                  break L8;
                }
              }
              var8 = stackIn_30_0;
              break L7;
            } else {
              L9: {
                if (2 != var14) {
                  stackIn_26_0 = -var10 + -param4;
                  break L9;
                } else {
                  stackIn_26_0 = -var10 + param4;
                  break L9;
                }
              }
              var8 = stackIn_26_0;
              break L7;
            }
          }
          L10: {
            var14 = this.field_p[param6 + var12] & 3;
            if ((var14 ^ -1) >= -2) {
              L11: {
                if (0 != var14) {
                  stackIn_39_0 = -var11 + var10;
                  break L11;
                } else {
                  stackIn_39_0 = var11 + var10;
                  break L11;
                }
              }
              var9 = stackIn_39_0;
              break L10;
            } else {
              L12: {
                if (2 == var14) {
                  stackIn_35_0 = -var10 + var11;
                  break L12;
                } else {
                  stackIn_35_0 = -var11 - var10;
                  break L12;
                }
              }
              var9 = stackIn_35_0;
              break L10;
            }
          }
          var17 = ((-var8 + var9) * var15 >> 2051106956) + var8;
          return var16 - -(param2 * (-var16 + var17) >> -387161428);
        } else {
          return -28;
        }
    }

    public lva() {
        super(0, true);
        this.field_s = true;
        this.field_z = 0;
        this.field_x = 1638;
        this.field_n = 4;
        this.field_p = new byte[512];
        this.field_u = 4;
        this.field_w = 4;
    }

    static {
        field_o = "Click or press F10 to open Quick Chat";
        field_y = "Arrow";
        field_v = "You cannot join this game - it is in progress";
    }
}
