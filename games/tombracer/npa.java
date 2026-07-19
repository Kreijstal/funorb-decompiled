/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class npa {
    private int field_i;
    private boolean field_g;
    static nl field_f;
    private ji field_h;
    private af field_e;
    private int field_c;
    private nf field_b;
    private int field_d;
    private ffa[] field_a;

    npa(boolean param0, int param1) {
        this(5, param0, param1);
    }

    final void a(ffa param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        q var5 = null;
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
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 72) {
                break L1;
              } else {
                this.field_g = false;
                break L1;
              }
            }
            var5 = (q) ((Object) this.field_e.a(-128, (long)param0.a(true)));
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                if (var4 == 0) {
                  L3: {
                    if (param0 != var5.a((byte) -128)) {
                      break L3;
                    } else {
                      var5.p(100);
                      var5.c(-7975);
                      ft.a(var5, -201);
                      break L3;
                    }
                  }
                  var5 = (q) ((Object) this.field_e.b((byte) 27));
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("npa.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final ffa[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1) {
          return (ffa[]) null;
        } else {
          return this.a(-1 + (param3 / 2 + param2), -(param3 / 2) + param2, -1 + (param0 + param4 / 2), (byte) -102, -(param4 / 2) + param0);
        }
    }

    final ffa[] a(byte param0, ffa param1) {
        RuntimeException var3 = null;
        ffa[] stackIn_2_0 = null;
        ffa[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ffa[] stackOut_3_0 = null;
        ffa[] stackOut_1_0 = null;
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
            if (param0 == -26) {
              stackOut_3_0 = this.b(param1.e(9648), -1, param1.d(3), param1.c(-48), param1.a((byte) 55));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ffa[]) null;
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
            stackOut_5_1 = new StringBuilder().append("npa.K(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final ffa[] a(int param0, int param1, int param2, int param3, int param4) {
        int fieldTemp$1 = 0;
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        int var9 = 0;
        ffa var10 = null;
        int var11 = 0;
        int var12 = 0;
        boolean stackIn_2_0 = false;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        boolean stackIn_9_0 = false;
        ffa stackIn_11_0 = null;
        ffa stackIn_14_0 = null;
        boolean stackOut_1_0 = false;
        Object stackOut_4_0 = null;
        boolean stackOut_8_0 = false;
        ffa stackOut_10_0 = null;
        ffa stackOut_13_0 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        this.field_b.a(-2147483648, (byte) 7, 32, 2147483647, param1 >> this.field_c, param2 >> this.field_c, param3 >> this.field_c, param0 >> this.field_c, 2147483647, -2147483648);
        this.field_d = param4;
        L0: while (true) {
          stackOut_1_0 = this.field_b.field_d;
          stackIn_2_0 = stackOut_1_0;
          L1: while (true) {
            if (!stackIn_2_0) {
              var6 = this.field_b.b((byte) 75);
              var7 = this.field_b.b(2);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var12 == 0) {
                var8 = (q) ((Object) ((npa) (this)).field_h.a((byte) -119, (long)ira.a(var6, var7, (byte) 36)));
                L2: while (true) {
                  if (var8 == null) {
                    this.field_b.d(113);
                    if (var12 == 0) {
                      continue L0;
                    } else {
                      return this.b(0);
                    }
                  } else {
                    stackOut_8_0 = var8.a(var6, var7, true);
                    stackIn_2_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var12 != 0) {
                      continue L1;
                    } else {
                      L3: {
                        if (!stackIn_9_0) {
                          break L3;
                        } else {
                          var9 = 1;
                          stackOut_10_0 = var8.a((byte) -80);
                          stackIn_11_0 = stackOut_10_0;
                          L4: while (true) {
                            var10 = stackIn_11_0;
                            var11 = 0;
                            L5: while (true) {
                              L6: {
                                if (var11 >= this.field_d) {
                                  break L6;
                                } else {
                                  stackOut_13_0 = (ffa) (var10);
                                  stackIn_11_0 = stackOut_13_0;
                                  stackIn_14_0 = stackOut_13_0;
                                  if (var12 != 0) {
                                    continue L4;
                                  } else {
                                    L7: {
                                      if (stackIn_14_0 != this.field_a[var11]) {
                                        break L7;
                                      } else {
                                        var9 = 0;
                                        if (var12 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var11++;
                                    continue L5;
                                  }
                                }
                              }
                              if (var9 != 0) {
                                fieldTemp$1 = this.field_d;
                                this.field_d = this.field_d + 1;
                                this.field_a[fieldTemp$1] = var8.a((byte) -96);
                                if (this.field_a.length > this.field_d) {
                                  break L3;
                                } else {
                                  return this.b(0);
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      var8 = (q) ((Object) this.field_h.b(-128));
                      continue L2;
                    }
                  }
                }
              } else {
                return this.b(0);
              }
            } else {
              return this.b(0);
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        if (param0 == 2) {
          if (0 > param1) {
            return (-31 + (param1 >> this.field_c)) / 32;
          } else {
            return (param1 >> this.field_c) / 32;
          }
        } else {
          return 112;
        }
    }

    private final ffa[] a(int param0, int param1, int param2, byte param3, int param4) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        q var12 = null;
        int var13 = 0;
        ffa var14 = null;
        int var15 = 0;
        int var16 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        boolean stackIn_13_0 = false;
        ffa stackIn_16_0 = null;
        ffa stackIn_19_0 = null;
        int stackIn_39_0 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        boolean stackIn_45_0 = false;
        ffa stackIn_48_0 = null;
        ffa stackIn_51_0 = null;
        int stackOut_6_0 = 0;
        Object stackOut_8_0 = null;
        boolean stackOut_12_0 = false;
        ffa stackOut_15_0 = null;
        ffa stackOut_18_0 = null;
        int stackOut_38_0 = 0;
        Object stackOut_40_0 = null;
        boolean stackOut_44_0 = false;
        ffa stackOut_47_0 = null;
        ffa stackOut_50_0 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        var6 = this.a(2, param1);
        if (param3 < -46) {
          var7 = this.a(2, param4);
          var8 = this.a(2, param0);
          var9 = this.a(2, param2);
          this.field_d = 0;
          var10 = var6;
          L0: while (true) {
            if (var8 >= var10) {
              var11 = var7;
              L1: while (true) {
                stackOut_6_0 = var11;
                stackIn_7_0 = stackOut_6_0;
                L2: while (true) {
                  if (stackIn_7_0 > var9) {
                    var10++;
                    if (var16 == 0) {
                      continue L0;
                    } else {
                      return this.b(0);
                    }
                  } else {
                    stackOut_8_0 = this;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var16 == 0) {
                      var12 = (q) ((Object) ((npa) (this)).field_h.a((byte) -80, (long)ira.a(var10, var11, (byte) -124)));
                      L3: while (true) {
                        if (var12 == null) {
                          var11++;
                          continue L1;
                        } else {
                          stackOut_12_0 = var12.a(var10, var11, true);
                          stackIn_7_0 = stackOut_12_0 ? 1 : 0;
                          stackIn_13_0 = stackOut_12_0;
                          if (var16 != 0) {
                            continue L2;
                          } else {
                            L4: {
                              if (stackIn_13_0) {
                                var13 = 1;
                                stackOut_15_0 = var12.a((byte) -75);
                                stackIn_16_0 = stackOut_15_0;
                                L5: while (true) {
                                  var14 = stackIn_16_0;
                                  var15 = 0;
                                  L6: while (true) {
                                    L7: {
                                      if (var15 >= this.field_d) {
                                        break L7;
                                      } else {
                                        stackOut_18_0 = this.field_a[var15];
                                        stackIn_16_0 = stackOut_18_0;
                                        stackIn_19_0 = stackOut_18_0;
                                        if (var16 != 0) {
                                          continue L5;
                                        } else {
                                          L8: {
                                            if (stackIn_19_0 == var14) {
                                              var13 = 0;
                                              if (var16 == 0) {
                                                break L7;
                                              } else {
                                                break L8;
                                              }
                                            } else {
                                              break L8;
                                            }
                                          }
                                          var15++;
                                          continue L6;
                                        }
                                      }
                                    }
                                    if (var13 != 0) {
                                      fieldTemp$2 = this.field_d;
                                      this.field_d = this.field_d + 1;
                                      this.field_a[fieldTemp$2] = var12.a((byte) -71);
                                      if (this.field_d < this.field_a.length) {
                                        break L4;
                                      } else {
                                        return this.b(0);
                                      }
                                    } else {
                                      var12 = (q) ((Object) this.field_h.b(-106));
                                      continue L3;
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                            var12 = (q) ((Object) this.field_h.b(-106));
                            continue L3;
                          }
                        }
                      }
                    } else {
                      return this.b(0);
                    }
                  }
                }
              }
            } else {
              return this.b(0);
            }
          }
        } else {
          this.field_i = -110;
          var7 = this.a(2, param4);
          var8 = this.a(2, param0);
          var9 = this.a(2, param2);
          this.field_d = 0;
          var10 = var6;
          L9: while (true) {
            if (var8 >= var10) {
              var11 = var7;
              L10: while (true) {
                stackOut_38_0 = var11;
                stackIn_39_0 = stackOut_38_0;
                L11: while (true) {
                  if (stackIn_39_0 > var9) {
                    var10++;
                    if (var16 == 0) {
                      continue L9;
                    } else {
                      return this.b(0);
                    }
                  } else {
                    stackOut_40_0 = this;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_41_0 = stackOut_40_0;
                    if (var16 == 0) {
                      var12 = (q) ((Object) ((npa) (this)).field_h.a((byte) -80, (long)ira.a(var10, var11, (byte) -124)));
                      L12: while (true) {
                        if (var12 == null) {
                          var11++;
                          continue L10;
                        } else {
                          stackOut_44_0 = var12.a(var10, var11, true);
                          stackIn_39_0 = stackOut_44_0 ? 1 : 0;
                          stackIn_45_0 = stackOut_44_0;
                          if (var16 != 0) {
                            continue L11;
                          } else {
                            L13: {
                              if (stackIn_45_0) {
                                var13 = 1;
                                stackOut_47_0 = var12.a((byte) -75);
                                stackIn_48_0 = stackOut_47_0;
                                L14: while (true) {
                                  var14 = stackIn_48_0;
                                  var15 = 0;
                                  L15: while (true) {
                                    L16: {
                                      if (var15 >= this.field_d) {
                                        break L16;
                                      } else {
                                        stackOut_50_0 = this.field_a[var15];
                                        stackIn_48_0 = stackOut_50_0;
                                        stackIn_51_0 = stackOut_50_0;
                                        if (var16 != 0) {
                                          continue L14;
                                        } else {
                                          L17: {
                                            if (stackIn_51_0 == var14) {
                                              var13 = 0;
                                              if (var16 == 0) {
                                                break L16;
                                              } else {
                                                break L17;
                                              }
                                            } else {
                                              break L17;
                                            }
                                          }
                                          var15++;
                                          continue L15;
                                        }
                                      }
                                    }
                                    if (var13 != 0) {
                                      fieldTemp$3 = this.field_d;
                                      this.field_d = this.field_d + 1;
                                      this.field_a[fieldTemp$3] = var12.a((byte) -71);
                                      if (this.field_d < this.field_a.length) {
                                        break L13;
                                      } else {
                                        return this.b(0);
                                      }
                                    } else {
                                      var12 = (q) ((Object) this.field_h.b(-106));
                                      if (var16 == 0) {
                                        continue L12;
                                      } else {
                                        var11++;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L13;
                              }
                            }
                            var12 = (q) ((Object) this.field_h.b(-106));
                            continue L12;
                          }
                        }
                      }
                    } else {
                      return this.b(0);
                    }
                  }
                }
              }
            } else {
              return this.b(0);
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 != -2147483648) {
            return;
        }
        field_f = null;
    }

    private final ffa[] b(int param0) {
        ffa[] var2 = new ffa[this.field_d];
        lua.a(this.field_a, param0, var2, 0, this.field_d);
        return var2;
    }

    final void b(ffa param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        q var9 = null;
        q var10 = null;
        int var11 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_17_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_19_0 = 0;
        boolean stackOut_16_0 = false;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = this.a(2, param0.d(param1 + -7070) - param0.c(-55) / 2);
            var4 = this.a(2, param0.e(9648) - param0.a((byte) 55) / 2);
            if (param1 == 7073) {
              var5 = this.a(param1 + -7071, -1 + param0.d(3) + param0.c(-58) / 2);
              var6 = this.a(2, param0.e(param1 + 2575) - (-(param0.a((byte) 55) / 2) + 1));
              var7 = var3_int;
              L1: while (true) {
                stackOut_4_0 = var5;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    if (stackIn_5_0 < var7) {
                      break L3;
                    } else {
                      if (var11 == 0) {
                        var8 = var4;
                        L4: while (true) {
                          L5: {
                            if (var6 < var8) {
                              break L5;
                            } else {
                              stackOut_10_0 = this.field_g;
                              stackIn_5_0 = stackOut_10_0 ? 1 : 0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var11 != 0) {
                                continue L2;
                              } else {
                                L6: {
                                  L7: {
                                    if (!stackIn_11_0) {
                                      break L7;
                                    } else {
                                      if (!param0.a(32 << this.field_c, (gma) null, 113, 32 << this.field_c, var8 * 32 + 16 << this.field_c, (ffa) null, 32 * var7 + 16 << this.field_c, 0)) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var9 = (q) ((Object) this.field_e.a(-121, (long)param0.a(true)));
                                  L8: while (true) {
                                    L9: {
                                      if (var9 == null) {
                                        stackOut_19_0 = var7;
                                        stackIn_20_0 = stackOut_19_0;
                                        break L9;
                                      } else {
                                        stackOut_16_0 = var9.a(var8, var7, param0, 123);
                                        stackIn_20_0 = stackOut_16_0 ? 1 : 0;
                                        stackIn_17_0 = stackOut_16_0;
                                        if (var11 != 0) {
                                          break L9;
                                        } else {
                                          if (stackIn_17_0) {
                                            break L6;
                                          } else {
                                            var9 = (q) ((Object) this.field_e.b((byte) 35));
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    var10 = vw.a(stackIn_20_0, param0, var8, true);
                                    this.field_e.a(param1 ^ -7074, var10, (long)param0.a(true));
                                    this.field_h.a((long)var10.hashCode(), 115, var10);
                                    break L6;
                                  }
                                }
                                var8++;
                                if (var11 == 0) {
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var7++;
                          if (var11 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("npa.H(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final ffa[] a(pc param0, byte param1) {
        RuntimeException var3 = null;
        ffa[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ffa[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -4) {
                break L1;
              } else {
                this.field_b = (nf) null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param0.field_e, param0.field_d, param0.field_k, param0.field_a, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("npa.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(ffa param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        int var9 = 0;
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
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = this.a(2, param0.d(3) - param0.c(-14) / 2);
            var5 = -25 / ((param1 - 13) / 51);
            var4 = this.a(2, param0.e(9648) - param0.a((byte) 55) / 2);
            var6 = this.a(2, -1 + param0.d(3) - -(param0.c(-51) / 2));
            var7 = this.a(2, -1 + (param0.e(9648) + param0.a((byte) 55) / 2));
            var8 = (q) ((Object) this.field_e.a(-120, (long)param0.a(true)));
            L1: while (true) {
              if (var8 == null) {
                break L0;
              } else {
                if (var9 == 0) {
                  L2: {
                    if (var8.a((byte) -76) != param0) {
                      break L2;
                    } else {
                      if (!var8.a(var7, var6, var4, var3_int, -98)) {
                        var8.p(104);
                        var8.c(-7975);
                        ft.a(var8, -201);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var8 = (q) ((Object) this.field_e.b((byte) 119));
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("npa.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 32) {
          L0: {
            npa.c(-128);
            if (wt.field_d != gsa.field_y) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (wt.field_d != gsa.field_y) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private npa(int param0, boolean param1, int param2) {
        this.field_b = new nf();
        this.field_a = new ffa[128];
        this.field_i = 1 << param0;
        this.field_h = new ji(this.field_i);
        this.field_e = new af(this.field_i);
        this.field_g = param1 ? true : false;
        this.field_c = param2;
    }

    static {
        field_f = new nl("");
    }
}
