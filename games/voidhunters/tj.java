/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends ara implements ntb {
    private int field_n;
    private int field_j;
    static String field_r;
    static int field_q;
    private int field_i;
    int field_o;
    private int field_l;
    static String[] field_k;
    private int field_p;
    private int field_m;

    final int a(ml param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 2147483647;
            if (param1 == 3) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param0.field_g.length) {
                  stackOut_18_0 = var3_int;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var5 = param0.field_g[var4];
                    var6 = param0.field_g[var4 - -1];
                    var7 = param0.field_g[(2 + var4) % param0.field_g.length];
                    var8 = param0.field_g[(var4 - -3) % param0.field_g.length];
                    if (var7 <= var5) {
                      var5 += 512;
                      var7 -= 512;
                      break L2;
                    } else {
                      var5 -= 512;
                      var7 += 512;
                      break L2;
                    }
                  }
                  L3: {
                    if (var8 > var6) {
                      var6 -= 512;
                      var8 += 512;
                      break L3;
                    } else {
                      var8 -= 512;
                      var6 += 512;
                      break L3;
                    }
                  }
                  var9 = ng.a(8, -this.field_h + this.field_e, (byte) 89, -this.field_f + this.field_d, var7, this.field_d, var6, var5, var8, this.field_e);
                  if (0 != (var9 ^ -1)) {
                    L4: {
                      if (var9 < var3_int) {
                        var3_int = var9;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4 += 2;
                    continue L1;
                  } else {
                    var4 += 2;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 88;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("tj.V(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    final void a(int param0, byte param1) {
        if (param1 > -94) {
            pe var4 = (pe) null;
            this.a((byte) 43, (pe) null);
        }
        this.field_l = param0;
    }

    public static void g(int param0) {
        field_r = null;
        int var1 = -35 % ((param0 - -84) / 39);
        field_k = null;
    }

    final int c(byte param0) {
        if (param0 <= 36) {
            return 21;
        }
        return this.field_j;
    }

    final void a(byte param0, pe param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        anb var3_ref = null;
        int var4 = 0;
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
        anb var15 = null;
        anb var16 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        Object var3_ref2 = null;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 93) {
                break L1;
              } else {
                this.field_j = -51;
                break L1;
              }
            }
            L2: {
              L3: {
                this.field_o = this.field_o - 1;
                if (-1 < (this.field_o ^ -1)) {
                  this.b(param0 ^ -3929);
                  if ((this.field_m ^ -1) == -7) {
                    param1.a(0, gib.field_a, this.field_p, this.field_n, false, this.field_d, this.field_e);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (3 == this.field_m) {
                    break L3;
                  } else {
                    if (this.field_m != 5) {
                      param1.a(10, this.field_e, this.field_d, 0, 11184895, 1, 5);
                      if ((this.field_m ^ -1) != -2) {
                        if (this.field_m == 6) {
                          L4: {
                            var3_ref2 = null;
                            if (-1 < (this.field_l ^ -1)) {
                              var16 = param1.a(true, this.field_e, this.field_d, this.field_p);
                              var3_ref = var16;
                              if (var16 == null) {
                                break L4;
                              } else {
                                L5: {
                                  var4 = 0;
                                  var5 = -this.field_d + var16.field_d;
                                  var6 = var16.field_e + -this.field_e;
                                  if (ar.a(var5, (byte) 111, var6) < cab.field_p / 2) {
                                    if (!param1.a(var16, param0 ^ 39)) {
                                      var4 = 1;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                                if (var4 == 0) {
                                  var3_ref = null;
                                  break L4;
                                } else {
                                  this.field_l = var16.field_l;
                                  break L4;
                                }
                              }
                            } else {
                              L6: {
                                var15 = param1.d((byte) -27, this.field_l);
                                var3_ref = var15;
                                if (var15 == null) {
                                  break L6;
                                } else {
                                  if (param1.a(var15, -76)) {
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              this.field_l = -1;
                              break L4;
                            }
                          }
                          L7: {
                            if (var3_ref != null) {
                              var4 = var3_ref.field_k.field_r;
                              var5 = var3_ref.field_k.field_n;
                              break L7;
                            } else {
                              var4 = this.field_d + (iea.field_d * fc.a(this.field_i, (byte) 28) >> -1278657432);
                              var5 = this.field_e + (iea.field_d * eu.a(this.field_i, 70) >> 559906504);
                              break L7;
                            }
                          }
                          var6 = var4 + -this.field_d >> 747133094;
                          var7 = var5 - this.field_e >> -402247130;
                          var8 = ar.a(var6, (byte) 120, var7);
                          if ((var8 ^ -1) < -1) {
                            var6 = var6 * la.field_k / var8;
                            var7 = var7 * la.field_k / var8;
                            var9 = var6 - this.field_f;
                            var10 = -this.field_h + var7;
                            var11 = ar.a(var9, (byte) 111, var10);
                            if (0 < var11) {
                              var12 = var9 * iea.field_d / var11;
                              this.field_f = this.field_f + var12;
                              var13 = var10 * iea.field_d / var11;
                              this.field_h = this.field_h + var13;
                              break L3;
                            } else {
                              this.field_e = this.field_e + this.field_h;
                              this.field_d = this.field_d + this.field_f;
                              break L2;
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        this.field_f = this.field_f + (np.field_o * fc.a(this.field_i, (byte) 89) >> 1945337136);
                        this.field_h = this.field_h + (np.field_o * eu.a(this.field_i, 96) >> 1141720400);
                        var3_int = 128;
                        param1.a(20, this.field_e, this.field_d, var3_int, param0 + 11184802, 1, 10);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.field_e = this.field_e + this.field_h;
              this.field_d = this.field_d + this.field_f;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("tj.CA(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
    }

    final void b(int param0, byte param1) {
        this.field_n = param0;
        if (param1 != 47) {
            this.field_o = -66;
        }
    }

    final void a(int param0, lta param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_int = param1.a(this.field_d, (byte) 127);
              var4 = param1.b(true, this.field_e);
              if (param0 == this.field_m) {
                var5 = param1.a(this.field_d - this.field_f, (byte) 123);
                var6 = param1.b(true, -this.field_h + this.field_e);
                c.a(var6, var5, var3_int, var4, -16777216, 16776977);
                break L1;
              } else {
                if (-5 != (this.field_m ^ -1)) {
                  if ((this.field_m ^ -1) != -4) {
                    if (2 == this.field_m) {
                      ena.a(var4, param1.field_a * 400.0f, param0 + -106, var3_int, 65280);
                      break L1;
                    } else {
                      if (this.field_m != 5) {
                        if (1 == this.field_m) {
                          kq.a(2400.0f * param1.field_a, (byte) 96, var4, 65280, var3_int);
                          ena.a(var4, 1600.0f * param1.field_a, -110, var3_int, 65280);
                          break L1;
                        } else {
                          if (6 == this.field_m) {
                            kq.a(1200.0f * param1.field_a, (byte) 80, var4, 16776960, var3_int);
                            if ((this.field_l ^ -1) > -1) {
                              var5 = cab.field_p / 2 >> -1899314136;
                              var6 = 0;
                              L2: while (true) {
                                if ((var6 ^ -1) <= -9) {
                                  break L1;
                                } else {
                                  var7 = (int)((float)(var5 * (fc.a(this.field_o + var6 << 1783446309, (byte) 33) >> 423143112)) * param1.field_a) + var3_int;
                                  var8 = (int)((float)((eu.a(this.field_o + var6 << 402066693, 62) >> -1291582136) * var5) * param1.field_a) + var4;
                                  hha.a(var3_int, (byte) 66, var7, var4, 65280, var8, 23);
                                  var6++;
                                  continue L2;
                                }
                              }
                            } else {
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        ena.a(var4, param1.field_a * 400.0f, -100, var3_int, 65280);
                        break L1;
                      }
                    }
                  } else {
                    L3: {
                      var5 = param1.a(-this.field_f + this.field_d, (byte) 112);
                      var6 = param1.b(true, this.field_e - this.field_h);
                      var7 = qpb.a(false, this.field_p, 13894143);
                      var8 = 255 * this.field_j / hrb.field_a;
                      kra.a(var7, 3, 16994, var4, var8 >> -1114096927, var3_int, var5, var6);
                      if (0 >= this.field_i) {
                        break L3;
                      } else {
                        jj.a(var7, (byte) 7, var4, Math.max(3.0f, (float)var8 * (11.0f * param1.field_a)), var8 >> 762269377, var3_int);
                        jj.a(var7, (byte) 7, var4, Math.max(2.0f, 8.0f * param1.field_a * (float)var8), var8, var3_int);
                        break L3;
                      }
                    }
                    jj.a(var7, (byte) 7, var6, Math.max(2.0f, param1.field_a * 8.0f * (float)var8), var8 >> 502021857, var5);
                    jj.a(var7, (byte) 7, var6, Math.max(1.0f, (float)var8 * (param1.field_a * 4.0f)), var8, var5);
                    hha.a(var3_int, (byte) 66, var5, var4, var7, var6, var8);
                    break L1;
                  }
                } else {
                  var5 = param1.a(-this.field_f + this.field_d, (byte) 119);
                  var6 = param1.b(true, this.field_e - this.field_h);
                  c.a(var6, var5, var3_int, var4, param0 ^ -16777216, 16746632);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("tj.BA(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final int b(boolean param0) {
        if (param0) {
            this.field_i = -104;
        }
        return this.field_n;
    }

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -111);
            param0.a(-632, this.field_i, 32);
            param0.a(-632, this.field_o, 32);
            param0.a(-632, this.field_p, 32);
            if (param1 > -109) {
                faa var4 = (faa) null;
                this.a((faa) null, true);
            }
            param0.a(-632, this.field_n, 32);
            param0.a(-632, this.field_m, 32);
            param0.a(-632, this.field_l, 32);
            param0.a(-632, this.field_j, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            this.field_i = param0.i(0, 32);
            this.field_o = param0.i(0, 32);
            this.field_p = param0.i(0, 32);
            if (param1) {
                field_r = (String) null;
            }
            this.field_n = param0.i(0, 32);
            this.field_m = param0.i(0, 32);
            this.field_l = param0.i(0, 32);
            this.field_j = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tj.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        int var3 = -117 % ((param0 - 63) / 42);
        this.field_p = param1;
    }

    final static boolean f(byte param0) {
        if (param0 != -21) {
            field_r = (String) null;
        }
        return tla.field_c;
    }

    final int d(byte param0) {
        if (param0 != -119) {
            return 84;
        }
        return this.field_l;
    }

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_e = this.field_e - this.field_h;
        this.field_d = this.field_d - this.field_f;
        int var4 = -this.field_d + param1;
        if (param2 <= 87) {
            discarded$0 = this.d((byte) -40);
        }
        int var5 = -this.field_e + param0;
        this.field_f = var4;
        this.field_h = var5;
        this.field_d = this.field_d + this.field_f;
        this.field_e = this.field_e + this.field_h;
        this.field_i = this.field_i | 1;
    }

    public final void b(byte param0, tv param1) {
        tj var5 = null;
        tj var6 = null;
        try {
            var5 = (tj) ((Object) param1);
            var6 = var5;
            super.b((byte) 103, param1);
            var6.field_o = this.field_o;
            var6.field_p = this.field_p;
            var6.field_l = this.field_l;
            var6.field_i = this.field_i;
            var6.field_j = this.field_j;
            var6.field_m = this.field_m;
            if (param0 <= 54) {
                this.field_i = -107;
            }
            var6.field_n = this.field_n;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_j = param0;
        if (param1 <= 50) {
            field_r = (String) null;
        }
    }

    final void f(int param0) {
        if (param0 != -24805) {
            return;
        }
        this.field_i = this.field_i | 1;
    }

    public final boolean a(byte param0, tv param1) {
        tj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -41 / ((param0 - 22) / 59);
                var3 = (tj) ((Object) param1);
                if (super.a((byte) -121, param1)) {
                  break L2;
                } else {
                  if (this.field_i != var3.field_i) {
                    break L2;
                  } else {
                    if (this.field_o != var3.field_o) {
                      break L2;
                    } else {
                      if (this.field_p != var3.field_p) {
                        break L2;
                      } else {
                        if (this.field_n != var3.field_n) {
                          break L2;
                        } else {
                          if (this.field_m != var3.field_m) {
                            break L2;
                          } else {
                            if (this.field_l != var3.field_l) {
                              break L2;
                            } else {
                              if (var3.field_j == this.field_j) {
                                stackOut_10_0 = 0;
                                stackIn_11_0 = stackOut_10_0;
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("tj.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final int e(int param0) {
        if (param0 != 512) {
            this.field_p = -93;
        }
        return this.field_p;
    }

    final int d(int param0) {
        if (param0 <= 100) {
            field_r = (String) null;
        }
        return this.field_d;
    }

    final void a(int param0, ml param1, sfa param2) {
        int var4_int = 0;
        if (this.field_m != 3) {
            if (!((this.field_m ^ -1) == -5)) {
                if (fra.a(param1.field_g, this.field_e, 2, this.field_d)) {
                    param2.a(this.field_e, param1, (tj) (this), (byte) 61, this.field_d);
                }
                return;
            }
        }
        try {
            if (param0 != 24158) {
                field_k = (String[]) null;
            }
            var4_int = this.a(param1, 3);
            this.a(false, param2, param1, var4_int);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int e(byte param0) {
        int discarded$0 = 0;
        if (param0 != -107) {
            discarded$0 = this.e((byte) -9);
        }
        return this.field_e;
    }

    final int g(byte param0) {
        if (param0 != -104) {
            field_k = (String[]) null;
        }
        return this.field_m;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        tj var5 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              var5 = (tj) ((Object) param0);
              super.a(param0, -106);
              var4 = 0;
              if (var5.field_i != this.field_i) {
                var4 = 1;
                System.out.println("int angle has changed. before=" + var5.field_i + ", now=" + this.field_i);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_o == var5.field_o) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int life has changed. before=" + var5.field_o + ", now=" + this.field_o);
                break L2;
              }
            }
            L3: {
              if (this.field_p != var5.field_p) {
                System.out.println("int fired_team has changed. before=" + var5.field_p + ", now=" + this.field_p);
                var4 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_n == var5.field_n) {
                break L4;
              } else {
                System.out.println("int fired_player has changed. before=" + var5.field_n + ", now=" + this.field_n);
                var4 = 1;
                break L4;
              }
            }
            L5: {
              if (this.field_m != var5.field_m) {
                var4 = 1;
                System.out.println("int type has changed. before=" + var5.field_m + ", now=" + this.field_m);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1 < -19) {
                break L6;
              } else {
                this.field_l = -123;
                break L6;
              }
            }
            L7: {
              if (this.field_l != var5.field_l) {
                System.out.println("int target_body has changed. before=" + var5.field_l + ", now=" + this.field_l);
                var4 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_j != var5.field_j) {
                var4 = 1;
                System.out.println("int damage has changed. before=" + var5.field_j + ", now=" + this.field_j);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (var4 != 0) {
                System.out.println("This instance of Projectile has changed");
                break L9;
              } else {
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("tj.F(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
    }

    final boolean c(int param0) {
        if (!(-4 != (this.field_m ^ -1))) {
            return true;
        }
        if (param0 < 82) {
            this.field_i = 82;
            return false;
        }
        return false;
    }

    tj() {
    }

    tj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_d = param0;
        this.field_n = param7;
        this.field_e = param1;
        this.field_j = 5;
        this.field_o = param5;
        this.field_h = param3;
        this.field_f = param2;
        this.field_l = -1;
        this.field_i = param4;
        this.field_m = param8;
        this.field_p = param6;
        this.field_j = param9;
        if (-2 == (fra.field_a ^ -1)) {
            this.field_j = this.field_j * ed.field_o;
        }
    }

    final void a(boolean param0, sfa param1, ml param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1) <= -2147483648) {
                break L1;
              } else {
                var5_int = (param3 * this.field_f >> -1356091928) + (-this.field_f + this.field_d);
                var6 = (this.field_h * param3 >> -272284216) + -this.field_h + this.field_e;
                param1.a(var6, param2, (tj) (this), (byte) 61, var5_int);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                this.field_n = 12;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("tj.J(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    static {
        field_r = "Player names can be up to 12 letters, numbers and underscores";
        field_q = 16384;
    }
}
