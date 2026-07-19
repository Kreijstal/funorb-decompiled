/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lga extends rj {
    private vna field_D;
    static int[][] field_z;
    static cn field_B;
    private bm field_A;
    private String[] field_C;

    private final bm a(int param0, int param1, byte param2) {
        bm var4 = null;
        bm var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var4 = (bm) ((Object) this.field_D.f(param2 ^ 92));
        if (param2 == -20) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (param1 < var5.field_g) {
                            break L4;
                          } else {
                            if (var5.field_l > param0) {
                              break L4;
                            } else {
                              if (var5.field_j + var5.field_g <= param1) {
                                break L4;
                              } else {
                                if (var5.field_l - -var5.field_i >= param0) {
                                  return var4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        var5 = var5.field_k;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var4 = (bm) ((Object) this.field_D.e(122));
                  break L2;
                }
                if (var6 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return (bm) null;
        }
    }

    String d(byte param0) {
        int var2 = 0;
        if (null != this.field_A) {
          if (this.field_C != null) {
            if (this.field_C.length <= this.field_A.field_h) {
              return null;
            } else {
              var2 = 16 % ((-58 - param0) / 60);
              return this.field_C[this.field_A.field_h];
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    lga(String param0, isa param1) {
        super(param0, (qc) null);
        this.field_A = null;
        try {
            this.field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (null == this.field_C) {
                    break L3;
                  } else {
                    if (param1 < this.field_C.length) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var7 = new String[param1 - -1];
                  var4 = var7;
                  if (this.field_C == null) {
                    break L4;
                  } else {
                    var5 = 0;
                    L5: while (true) {
                      if (this.field_C.length <= var5) {
                        break L4;
                      } else {
                        var7[var5] = this.field_C[var5];
                        var5++;
                        if (var6 != 0) {
                          break L1;
                        } else {
                          if (var6 == 0) {
                            continue L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_C = var7;
                break L2;
              }
              this.field_C[param1] = param0;
              break L1;
            }
            L6: {
              if (param2 == 0) {
                break L6;
              } else {
                this.a((byte) -100, 15, 61, -76, -74);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4_ref);
            stackOut_15_1 = new StringBuilder().append("lga.V(");
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
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1 + 0, param2, param3);
              this.field_A = null;
              if (this.field_f) {
                var5_int = -param0 + (jba.field_j + -this.field_i);
                var6 = sta.field_B + -param3 - this.field_n;
                this.field_A = this.a(var6, var5_int, (byte) -20);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 2097152) {
                break L2;
              } else {
                field_z = (int[][]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("lga.A(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void b(int param0) {
        int var2 = 0;
        oaa var3 = null;
        bja var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        Object var17 = null;
        oaa var17_ref = null;
        String var21 = null;
        bja var22 = null;
        kha var23 = null;
        bm var24 = null;
        Object var25 = null;
        String var26 = null;
        bja var27 = null;
        kha var28 = null;
        bm var29 = null;
        oaa var30 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        var17 = null;
        var25 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        if (param0 == 18758) {
          this.field_D = new vna();
          var2 = 0;
          var30 = (oaa) ((Object) this.field_r);
          var27 = var30.a((ae) (this), 14157);
          L0: while (true) {
            var5 = this.field_o.indexOf("<hotspot=", var2);
            stackOut_26_0 = -1;
            stackOut_26_1 = var5;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            L1: while (true) {
              if (stackIn_27_0 != stackIn_27_1) {
                var7 = this.field_o.indexOf(">", var5);
                var26 = this.field_o.substring(9 + var5, var7);
                var7 = Integer.parseInt(var26);
                var2 = this.field_o.indexOf("</hotspot>", var5);
                var8 = var27.a(var5, 0);
                var9 = var27.a(var2, 0);
                var10 = null;
                if (var16 == 0) {
                  var11 = var8;
                  L2: while (true) {
                    if (var9 < var11) {
                      continue L0;
                    } else {
                      var28 = var27.field_c[var11];
                      stackOut_33_0 = var8;
                      stackOut_33_1 = var11;
                      stackIn_27_0 = stackOut_33_0;
                      stackIn_27_1 = stackOut_33_1;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      if (var16 != 0) {
                        continue L1;
                      } else {
                        L3: {
                          if (stackIn_34_0 != stackIn_34_1) {
                            stackOut_36_0 = var28.field_c[0];
                            stackIn_37_0 = stackOut_36_0;
                            break L3;
                          } else {
                            stackOut_35_0 = var27.a((byte) -59, var5);
                            stackIn_37_0 = stackOut_35_0;
                            break L3;
                          }
                        }
                        L4: {
                          var13 = stackIn_37_0;
                          if (var11 != var9) {
                            if (var28 == null) {
                              stackOut_41_0 = 0;
                              stackIn_42_0 = stackOut_41_0;
                              break L4;
                            } else {
                              stackOut_40_0 = var28.field_c[-1 + var28.field_c.length];
                              stackIn_42_0 = stackOut_40_0;
                              break L4;
                            }
                          } else {
                            stackOut_38_0 = var27.a((byte) -59, var2);
                            stackIn_42_0 = stackOut_38_0;
                            break L4;
                          }
                        }
                        L5: {
                          var14 = stackIn_42_0;
                          var29 = new bm(var7, var13, var28.field_d, var14 - var13, Math.max(var30.a((byte) -90), var28.field_b - var28.field_d));
                          if (var10 != null) {
                            ((bm) (var10)).field_k = var29;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_D.b((byte) -46, var29);
                        var10 = var29;
                        var11++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          this.a((byte) -56, -23, 29, 43, 2);
          this.field_D = new vna();
          var2 = 0;
          var17_ref = (oaa) ((Object) this.field_r);
          var3 = var17_ref;
          var22 = var17_ref.a((ae) (this), 14157);
          var4 = var22;
          L6: while (true) {
            var5 = this.field_o.indexOf("<hotspot=", var2);
            stackOut_2_0 = -1;
            stackOut_2_1 = var5;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            L7: while (true) {
              if (stackIn_3_0 != stackIn_3_1) {
                var7 = this.field_o.indexOf(">", var5);
                var21 = this.field_o.substring(9 + var5, var7);
                var7 = Integer.parseInt(var21);
                var2 = this.field_o.indexOf("</hotspot>", var5);
                var8 = var22.a(var5, 0);
                var9 = var22.a(var2, 0);
                var10 = null;
                if (var16 == 0) {
                  var11 = var8;
                  L8: while (true) {
                    if (var9 < var11) {
                      continue L6;
                    } else {
                      var23 = var22.field_c[var11];
                      stackOut_10_0 = var8;
                      stackOut_10_1 = var11;
                      stackIn_3_0 = stackOut_10_0;
                      stackIn_3_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (var16 != 0) {
                        continue L7;
                      } else {
                        L9: {
                          if (stackIn_11_0 != stackIn_11_1) {
                            stackOut_13_0 = var23.field_c[0];
                            stackIn_14_0 = stackOut_13_0;
                            break L9;
                          } else {
                            stackOut_12_0 = var22.a((byte) -59, var5);
                            stackIn_14_0 = stackOut_12_0;
                            break L9;
                          }
                        }
                        L10: {
                          var13 = stackIn_14_0;
                          if (var11 != var9) {
                            if (var23 == null) {
                              stackOut_18_0 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              break L10;
                            } else {
                              stackOut_17_0 = var23.field_c[-1 + var23.field_c.length];
                              stackIn_19_0 = stackOut_17_0;
                              break L10;
                            }
                          } else {
                            stackOut_15_0 = var22.a((byte) -59, var2);
                            stackIn_19_0 = stackOut_15_0;
                            break L10;
                          }
                        }
                        L11: {
                          var14 = stackIn_19_0;
                          var24 = new bm(var7, var13, var23.field_d, var14 - var13, Math.max(var17_ref.a((byte) -90), var23.field_b - var23.field_d));
                          if (var10 != null) {
                            ((bm) (var10)).field_k = var24;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        this.field_D.b((byte) -46, var24);
                        var10 = var24;
                        var11++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        boolean discarded$2 = false;
        int var5 = 0;
        int var6 = 0;
        bm var7 = null;
        ae var8 = null;
        super.b(param0, param1, param2, -118);
        var5 = param2 - this.field_i;
        var6 = -this.field_n + param0;
        if (param3 <= -40) {
          var7 = this.a(var6, var5, (byte) -20);
          if (var7 != null) {
            if (this.field_h != null) {
              ((tma) ((Object) this.field_h)).a((lga) (this), var7.field_h, 30846, param1);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var8 = (ae) null;
          discarded$2 = this.a((ae) null, false);
          var7 = this.a(var6, var5, (byte) -20);
          if (var7 != null) {
            if (this.field_h == null) {
              return;
            } else {
              ((tma) ((Object) this.field_h)).a((lga) (this), var7.field_h, 30846, param1);
              return;
            }
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        oaa var5 = null;
        bm var6 = null;
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = (oaa) ((Object) this.field_r);
          var6 = this.field_A;
          if (var6 == null) {
            return;
          } else {
            var7 = var5.a((ae) (this), param0, (byte) 119);
            var8 = var5.a(param1, (ae) (this), (byte) -49);
            L0: while (true) {
              nn.a(-2 + (var7 + var6.field_g), -2 + (var8 + var6.field_l), var6.field_i - -2, 2 + var6.field_j, false);
              var6 = var6.field_k;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    final static nma a(uia param0, byte param1) {
        RuntimeException var2 = null;
        nma stackIn_2_0 = null;
        nma stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nma stackOut_3_0 = null;
        nma stackOut_1_0 = null;
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
            if (param1 <= -86) {
              stackOut_3_0 = new nma(param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.a(-32768), param0.h(255));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nma) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("lga.O(");
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(18758);
    }

    final static oc a(cn param0, String param1, String param2, boolean param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        oc stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        oc stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oc stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        oc stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param3) {
              var5 = param0.a(param2, (byte) 115, param1);
              var4 = var5;
              if (var5 != null) {
                stackOut_6_0 = new oc(var5);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (oc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4_ref);
            stackOut_8_1 = new StringBuilder().append("lga.U(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (oc) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (!param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("lga.S(");
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.a((byte) -31, param2, ((oaa) ((Object) this.field_r)).b((byte) 105, (ae) (this)), param3, param0);
        if (param1 == -120) {
          return;
        } else {
          field_B = (cn) null;
          return;
        }
    }

    public static void a(byte param0) {
        field_z = (int[][]) null;
        if (param0 != -123) {
            return;
        }
        field_B = null;
    }

    final static boolean b(boolean param0) {
        nma discarded$2 = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        uia var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == rla.field_D) {
                rla.field_D = cna.a(4, 128);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                var5 = (uia) null;
                discarded$2 = lga.a((uia) null, (byte) 82);
                break L2;
              }
            }
            if (rla.field_D.field_g) {
              var10 = rb.field_o;
              var8 = var10;
              var6 = var8;
              var1 = var6;
              var11 = rla.field_D.field_f;
              var9 = var11;
              var7 = var9;
              var2 = var7;
              var3 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (-9 >= (var3 ^ -1)) {
                      break L5;
                    } else {
                      var6[var3] = fh.a(var10[var3], var11[var3]);
                      var3++;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var1 = pq.field_e;
                  var2 = rla.field_D.field_f;
                  break L4;
                }
                var3 = 0;
                L6: while (true) {
                  L7: {
                    L8: {
                      if (8 <= var3) {
                        break L8;
                      } else {
                        var1[var3] = sea.c(var1[var3], var2[var3] ^ -1);
                        var3++;
                        if (var4 != 0) {
                          break L7;
                        } else {
                          if (var4 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    rla.field_D = null;
                    break L7;
                  }
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                }
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "lga.M(" + param0 + ')');
        }
        return stackIn_21_0 != 0;
    }

    static {
    }
}
