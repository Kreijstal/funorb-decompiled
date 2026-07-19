/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sma {
    static String field_d;
    static joa field_e;
    int[] field_b;
    static en field_c;
    private int[] field_f;
    private ff field_a;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        this.field_f = new int[this.field_a.field_P];
        this.field_b = new int[this.field_a.field_P];
        if (param0 < -43) {
          var2 = 0;
          L0: while (true) {
            if (var2 < this.field_b.length) {
              this.field_b[var2] = var2;
              this.field_f[var2] = var2;
              var2++;
              if (var3 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        int var1 = 67 / ((-44 - param0) / 54);
        field_d = null;
    }

    final static int a(String param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var8_int = 0;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        byte stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_22_0 = 0;
        byte stackOut_33_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 28893) {
                break L1;
              } else {
                sma.a(47);
                break L1;
              }
            }
            if (!hna.field_a.field_c) {
              stackOut_5_0 = -1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!gj.field_d.containsKey(param0)) {
                var10 = eba.a((byte) 38, param0);
                if (var10 != null) {
                  var3 = aqa.field_c + var10;
                  if (af.field_b.a(var3, "", param1 + -28893)) {
                    if (af.field_b.c(var3, -122)) {
                      var15 = af.field_b.a(var3, (byte) 117, "");
                      var13 = var15;
                      var4 = var13;
                      var5 = null;
                      try {
                        L2: {
                          var11 = iba.a(var10, (byte) -94);
                          break L2;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
                        stackOut_22_0 = -1;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      }
                      L3: {
                        if (var4 == null) {
                          break L3;
                        } else {
                          if (var11 != null) {
                            L4: {
                              L5: {
                                L6: {
                                  L7: {
                                    var6 = 1;
                                    var14 = vj.a(var11, (byte) -86);
                                    var12 = var14;
                                    var7 = var12;
                                    if (var7 == null) {
                                      break L7;
                                    } else {
                                      if (var14.length == var15.length) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var6 = 0;
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                                var8_int = 0;
                                L8: while (true) {
                                  if (var14.length <= var8_int) {
                                    break L5;
                                  } else {
                                    stackOut_33_0 = var15[var8_int];
                                    stackIn_40_0 = stackOut_33_0;
                                    stackIn_34_0 = stackOut_33_0;
                                    if (var9 != 0) {
                                      break L4;
                                    } else {
                                      L9: {
                                        if (stackIn_34_0 != var14[var8_int]) {
                                          var6 = 0;
                                          if (var9 == 0) {
                                            break L5;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var8_int++;
                                      if (var9 == 0) {
                                        continue L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_39_0 = var6;
                              stackIn_40_0 = stackOut_39_0;
                              break L4;
                            }
                            L10: {
                              if (stackIn_40_0 != 0) {
                                break L10;
                              } else {
                                try {
                                  L11: {
                                    discarded$1 = hna.field_a.a(var15, var11, true);
                                    break L11;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  var8 = decompiledCaughtException;
                                  stackOut_43_0 = -1;
                                  stackIn_44_0 = stackOut_43_0;
                                  return stackIn_44_0;
                                }
                                break L10;
                              }
                            }
                            mj.a(param0, var11, 1);
                            stackOut_45_0 = 100;
                            stackIn_46_0 = stackOut_45_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_47_0 = -1;
                      stackIn_48_0 = stackOut_47_0;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      stackOut_17_0 = af.field_b.a(var3, true);
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_14_0 = -1;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_8_0 = 100;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L12: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var2);
            stackOut_49_1 = new StringBuilder().append("sma.A(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L12;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_46_0;
                  } else {
                    return stackIn_48_0;
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        hca[] var10 = null;
        hca var11 = null;
        hca[] var12 = null;
        hca var13 = null;
        hca[] var14 = null;
        hca var15 = null;
        hca var17 = null;
        boolean stackIn_11_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_43_0 = false;
        int stackIn_59_0 = 0;
        boolean stackIn_74_0 = false;
        int stackIn_90_0 = 0;
        int stackOut_89_0 = 0;
        boolean stackOut_73_0 = false;
        int stackOut_58_0 = 0;
        boolean stackOut_42_0 = false;
        int stackOut_26_0 = 0;
        boolean stackOut_10_0 = false;
        var9 = TombRacer.field_G ? 1 : 0;
        this.field_b = new int[this.field_a.field_H.length];
        this.field_f = new int[this.field_a.field_H.length];
        var2 = 0;
        L0: while (true) {
          if (this.field_a.field_H.length <= var2) {
            if (!param0) {
              var2 = 0;
              L1: while (true) {
                if (this.field_f.length > var2) {
                  var3 = -1;
                  var4 = 0;
                  var14 = this.field_a.field_H;
                  if (var9 == 0) {
                    var6 = 0;
                    L2: while (true) {
                      L3: {
                        if (var14.length <= var6) {
                          stackOut_89_0 = -1;
                          stackIn_90_0 = stackOut_89_0;
                          break L3;
                        } else {
                          var15 = var14[var6];
                          var17 = var15;
                          var17 = var15;
                          stackOut_73_0 = this.field_a.f((byte) -83, var15.A(0));
                          stackIn_90_0 = stackOut_73_0 ? 1 : 0;
                          stackIn_74_0 = stackOut_73_0;
                          if (var9 != 0) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                if (!stackIn_74_0) {
                                  break L5;
                                } else {
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                if (-1 == this.field_f[var15.A(0)]) {
                                  break L6;
                                } else {
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var8 = var15.e(false) + var15.j(false);
                              if (var3 == -1) {
                                var4 = var8;
                                var3 = var15.A(0);
                                break L4;
                              } else {
                                if (var4 < var8) {
                                  var4 = var8;
                                  var3 = var15.A(0);
                                  break L4;
                                } else {
                                  if (var4 != var8) {
                                    break L4;
                                  } else {
                                    if (this.field_a.field_c.field_b[var15.A(0)] < this.field_a.field_c.field_b[var3]) {
                                      var4 = var8;
                                      var3 = var15.A(0);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                            var6++;
                            continue L2;
                          }
                        }
                      }
                      L7: {
                        if (stackIn_90_0 != var3) {
                          this.field_b[var2] = var3;
                          this.field_f[var3] = var2;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var2++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            this.field_b[var2] = -1;
            this.field_f[var2] = -1;
            var2++;
            if (var9 == 0) {
              if (var9 == 0) {
                continue L0;
              } else {
                if (!param0) {
                  var2 = 0;
                  L8: while (true) {
                    if (this.field_f.length > var2) {
                      var3 = -1;
                      var4 = 0;
                      var12 = this.field_a.field_H;
                      if (var9 == 0) {
                        var6 = 0;
                        L9: while (true) {
                          L10: {
                            if (var12.length <= var6) {
                              stackOut_58_0 = -1;
                              stackIn_59_0 = stackOut_58_0;
                              break L10;
                            } else {
                              var13 = var12[var6];
                              var15 = var13;
                              var17 = var15;
                              var15 = var13;
                              stackOut_42_0 = this.field_a.f((byte) -83, var13.A(0));
                              stackIn_59_0 = stackOut_42_0 ? 1 : 0;
                              stackIn_43_0 = stackOut_42_0;
                              if (var9 != 0) {
                                break L10;
                              } else {
                                L11: {
                                  L12: {
                                    if (!stackIn_43_0) {
                                      break L12;
                                    } else {
                                      if (var9 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (-1 == this.field_f[var13.A(0)]) {
                                      break L13;
                                    } else {
                                      if (var9 == 0) {
                                        break L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var8 = var13.e(false) + var13.j(false);
                                  if (var3 == -1) {
                                    var4 = var8;
                                    var3 = var13.A(0);
                                    break L11;
                                  } else {
                                    if (var4 < var8) {
                                      var4 = var8;
                                      var3 = var13.A(0);
                                      break L11;
                                    } else {
                                      if (var4 != var8) {
                                        break L11;
                                      } else {
                                        if (this.field_a.field_c.field_b[var13.A(0)] < this.field_a.field_c.field_b[var3]) {
                                          var4 = var8;
                                          var3 = var13.A(0);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                                var6++;
                                continue L9;
                              }
                            }
                          }
                          L14: {
                            if (stackIn_59_0 != var3) {
                              this.field_b[var2] = var3;
                              this.field_f[var3] = var2;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var2++;
                          if (var9 == 0) {
                            continue L8;
                          } else {
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              var2 = 0;
              L15: while (true) {
                if (this.field_f.length > var2) {
                  var3 = -1;
                  var4 = 0;
                  var10 = this.field_a.field_H;
                  if (var9 == 0) {
                    var6 = 0;
                    L16: while (true) {
                      L17: {
                        if (var10.length <= var6) {
                          stackOut_26_0 = -1;
                          stackIn_27_0 = stackOut_26_0;
                          break L17;
                        } else {
                          var11 = var10[var6];
                          var13 = var11;
                          var15 = var13;
                          var13 = var11;
                          stackOut_10_0 = this.field_a.f((byte) -83, var11.A(0));
                          stackIn_27_0 = stackOut_10_0 ? 1 : 0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var9 != 0) {
                            break L17;
                          } else {
                            L18: {
                              L19: {
                                if (!stackIn_11_0) {
                                  break L19;
                                } else {
                                  if (var9 == 0) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              L20: {
                                if (-1 == this.field_f[var11.A(0)]) {
                                  break L20;
                                } else {
                                  if (var9 == 0) {
                                    break L18;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              var8 = var11.e(false) + var11.j(false);
                              if (var3 == -1) {
                                var4 = var8;
                                var3 = var11.A(0);
                                break L18;
                              } else {
                                if (var4 < var8) {
                                  var4 = var8;
                                  var3 = var11.A(0);
                                  break L18;
                                } else {
                                  if (var4 != var8) {
                                    break L18;
                                  } else {
                                    if (this.field_a.field_c.field_b[var11.A(0)] < this.field_a.field_c.field_b[var3]) {
                                      var4 = var8;
                                      var3 = var11.A(0);
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                            var6++;
                            continue L16;
                          }
                        }
                      }
                      L21: {
                        if (stackIn_27_0 != var3) {
                          this.field_b[var2] = var3;
                          this.field_f[var3] = var2;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var2++;
                      if (var9 == 0) {
                        continue L15;
                      } else {
                        return;
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
    }

    sma(ff param0) {
        try {
            this.field_a = param0;
            this.a((byte) -54);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sma.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Exploiting a bug";
        field_e = new joa();
    }
}
