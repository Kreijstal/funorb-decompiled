/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_g;
    private bh[] field_h;
    private int field_d;
    static String field_e;
    private int field_f;
    static String field_j;
    static long field_a;
    static w field_i;
    static ck field_b;
    static String field_l;
    private bh field_k;
    private bh field_c;

    final static void a(ck[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if ((param1 ^ -1) < -1) {
                  L2: {
                    var5_int = param0[0].field_K;
                    var6 = param0[2].field_K;
                    if (param3 == -1) {
                      break L2;
                    } else {
                      field_g = (String) null;
                      break L2;
                    }
                  }
                  var7 = param0[1].field_K;
                  param0[0].c(param4, param2);
                  param0[2].c(param4 - -param1 - var6, param2);
                  hk.b(kh.field_e);
                  hk.f(var5_int + param4, param2, param4 + (param1 - var6), param2 + param0[1].field_C);
                  var8 = var5_int + param4;
                  var9 = -var6 + param4 + param1;
                  param4 = var8;
                  L3: while (true) {
                    L4: {
                      if (param4 >= var9) {
                        hk.a(kh.field_e);
                        break L4;
                      } else {
                        param0[1].c(param4, param2);
                        param4 = param4 + var7;
                        if (var10 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("ng.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 > -26) {
            return;
        }
        field_j = null;
        field_b = null;
        field_l = null;
        field_e = null;
    }

    final void a(long param0, int param1, bh param2) {
        bh var5 = null;
        try {
            if (!(null == param2.field_a)) {
                param2.b((byte) 116);
            }
            var5 = this.field_h[(int)((long)(this.field_f + param1) & param0)];
            param2.field_a = var5.field_a;
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final bh a(long param0, int param1) {
        bh var4 = null;
        bh var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        var6 = client.field_A ? 1 : 0;
        var4 = this.field_h[(int)((long)(this.field_f - 1) & param0)];
        this.field_k = var4.field_b;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_k == var4) {
                break L2;
              } else {
                stackOut_2_0 = ((this.field_k.field_i ^ -1L) < (param0 ^ -1L) ? -1 : ((this.field_k.field_i ^ -1L) == (param0 ^ -1L) ? 0 : 1));
                stackIn_7_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 != 0) {
                    this.field_k = this.field_k.field_b;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    var5 = this.field_k;
                    this.field_k = this.field_k.field_b;
                    return var5;
                  }
                }
              }
            }
            this.field_k = null;
            stackOut_6_0 = param1;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          }
          if (stackIn_7_0 >= 48) {
            return null;
          } else {
            return (bh) null;
          }
        }
    }

    final static jc a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ck[] var7 = null;
        jc stackIn_3_0 = null;
        jc stackIn_6_0 = null;
        jc stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        jc stackIn_26_0 = null;
        jc stackIn_41_0 = null;
        jc stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        jc stackOut_25_0 = null;
        jc stackOut_12_0 = null;
        jc stackOut_40_0 = null;
        jc stackOut_44_0 = null;
        jc stackOut_5_0 = null;
        jc stackOut_2_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) >= -65) {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    var7 = (ck[]) null;
                    ng.a((ck[]) null, 38, -12, 7, -118);
                    break L1;
                  }
                }
                if (param1.charAt(0) == 34) {
                  if (param1.charAt(var2_int + -1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L2: while (true) {
                      if (var2_int + -1 > var4) {
                        L3: {
                          L4: {
                            var5 = param1.charAt(var4);
                            if (var5 == 92) {
                              L5: {
                                if (var3 != 0) {
                                  stackOut_21_0 = 0;
                                  stackIn_22_0 = stackOut_21_0;
                                  break L5;
                                } else {
                                  stackOut_20_0 = 1;
                                  stackIn_22_0 = stackOut_20_0;
                                  break L5;
                                }
                              }
                              var3 = stackIn_22_0;
                              if (var6 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                stackOut_25_0 = be.field_x;
                                stackIn_26_0 = stackOut_25_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          var3 = 0;
                          break L3;
                        }
                        var4++;
                        continue L2;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_12_0 = be.field_x;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  L7: while (true) {
                    if (var2_int > var4) {
                      L8: {
                        L9: {
                          var5 = param1.charAt(var4);
                          if (46 == var5) {
                            L10: {
                              if (0 == var4) {
                                break L10;
                              } else {
                                if (var4 == -1 + var2_int) {
                                  break L10;
                                } else {
                                  if (var3 == 0) {
                                    var3 = 1;
                                    if (var6 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            stackOut_40_0 = be.field_x;
                            stackIn_41_0 = stackOut_40_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L9;
                          }
                        }
                        if (-1 != nm.field_Pb.indexOf(var5)) {
                          var3 = 0;
                          break L8;
                        } else {
                          stackOut_44_0 = be.field_x;
                          stackIn_45_0 = stackOut_44_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                      var4++;
                      continue L7;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackOut_5_0 = ga.field_e;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = hm.field_a;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("ng.B(").append(param0).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L11;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_41_0;
                } else {
                  return stackIn_45_0;
                }
              }
            }
          }
        }
    }

    final bh a(byte param0) {
        bh discarded$0 = null;
        this.field_d = 0;
        if (param0 != 126) {
            discarded$0 = this.b((byte) 112);
            return this.b((byte) 49);
        }
        return this.b((byte) 49);
    }

    final bh b(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        bh var4 = null;
        bh var5 = null;
        bh var8 = null;
        bh var9 = null;
        var3 = client.field_A ? 1 : 0;
        if ((this.field_d ^ -1) >= -1) {
          if (param0 >= 37) {
            L0: while (true) {
              if (this.field_f > this.field_d) {
                fieldTemp$2 = this.field_d;
                this.field_d = this.field_d + 1;
                var4 = this.field_h[fieldTemp$2].field_b;
                var9 = var4;
                if (var4 != this.field_h[-1 + this.field_d]) {
                  this.field_c = var9.field_b;
                  return var9;
                } else {
                  if (var3 == 0) {
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
            return (bh) null;
          }
        } else {
          if (this.field_h[-1 + this.field_d] == this.field_c) {
            if (param0 >= 37) {
              L1: while (true) {
                if (this.field_f > this.field_d) {
                  fieldTemp$3 = this.field_d;
                  this.field_d = this.field_d + 1;
                  var4 = this.field_h[fieldTemp$3].field_b;
                  var5 = var4;
                  if (var4 != this.field_h[-1 + this.field_d]) {
                    this.field_c = var5.field_b;
                    return var5;
                  } else {
                    if (var3 == 0) {
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (bh) null;
            }
          } else {
            var8 = this.field_c;
            this.field_c = var8.field_b;
            return var8;
          }
        }
    }

    ng(int param0) {
        bh dupTemp$2 = null;
        int var2 = 0;
        bh var3 = null;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        this.field_d = 0;
        this.field_f = param0;
        this.field_h = new bh[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$2 = new bh();
            var3 = dupTemp$2;
            this.field_h[var2] = dupTemp$2;
            var3.field_b = var3;
            var3.field_a = var3;
            var2++;
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        field_e = "Please check if address is correct";
        field_g = "Stage";
        field_j = "This password is part of your Player Name, and would be easy to guess";
        field_l = "Waiting for graphics";
    }
}
