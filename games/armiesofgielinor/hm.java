/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    cm field_g;
    private int field_k;
    int field_j;
    int[] field_a;
    static String field_e;
    int field_c;
    static String[] field_i;
    int[] field_b;
    int[] field_d;
    static jl field_h;
    static int[] field_l;
    static je field_f;

    public static void b(int param0) {
        field_f = null;
        field_l = null;
        field_e = null;
        field_i = null;
        field_h = null;
        if (param0 == 0) {
            return;
        }
        field_f = (je) null;
    }

    hm(vh param0, boolean param1) {
        this();
        int discarded$0 = 0;
        try {
            discarded$0 = this.a(param0, -2, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(mo param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -5) {
                break L1;
              } else {
                hm.a(-8, 127, -35, 78, 58, -62, -122);
                break L1;
              }
            }
            L2: {
              L3: {
                var2_int = ni.field_d;
                if (param0.field_b != 2) {
                  break L3;
                } else {
                  L4: {
                    if (!param0.field_f) {
                      break L4;
                    } else {
                      var2_int = ni.field_d;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (0 != param0.field_a) {
                      break L5;
                    } else {
                      if (param0.field_e != 0) {
                        break L5;
                      } else {
                        var2_int = ag.field_A[param0.field_b];
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var2_int = fm.field_d[param0.field_b];
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if ((param0.field_b ^ -1) == -5) {
                  break L6;
                } else {
                  L7: {
                    if ((oh.field_H ^ -1L) == (param0.field_n ^ -1L)) {
                      break L7;
                    } else {
                      var2_int = fm.field_d[param0.field_b];
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var2_int = ag.field_A[param0.field_b];
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L6;
                  }
                }
              }
              var2_int = fm.field_d[param0.field_b];
              break L2;
            }
            stackOut_15_0 = var2_int;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var2);
            stackOut_17_1 = new StringBuilder().append("hm.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final int a(byte param0) {
        int discarded$2 = 0;
        if (param0 <= 44) {
          discarded$2 = this.a((byte) 121);
          return -this.field_k + this.field_c;
        } else {
          return -this.field_k + this.field_c;
        }
    }

    final boolean a(int param0, byte param1) {
        if (this.a((byte) 57) < param0) {
          return false;
        } else {
          this.field_k = this.field_k + param0;
          if (param1 != 103) {
            field_l = (int[]) null;
            return true;
          } else {
            return true;
          }
        }
    }

    final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = at.field_c.length;
        var3 = this.field_j + this.field_c;
        var4 = param0;
        L0: while (true) {
          if (var4 < var2) {
            var5 = at.field_c[var4];
            var3 = var3 - var5;
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var6 == 0) {
              if (stackIn_5_0 > var3) {
                return var4;
              } else {
                var4++;
                continue L0;
              }
            } else {
              return stackIn_4_0;
            }
          } else {
            return var2;
          }
        }
    }

    private final int a(vh param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param0.k(param1 + 2);
            if (9 >= var4_int) {
              L1: {
                if ((var4_int ^ -1) <= param1) {
                  L2: {
                    L3: {
                      L4: {
                        if (-6 < (var4_int ^ -1)) {
                          break L4;
                        } else {
                          if (!param2) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var6 = 0;
                      L5: while (true) {
                        if (this.field_a.length <= var6) {
                          break L3;
                        } else {
                          this.field_a[var6] = param0.k(0);
                          var6++;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (var8 == 0) {
                              continue L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    var6 = 0;
                    break L2;
                  }
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (this.field_d.length <= var6) {
                          break L8;
                        } else {
                          this.field_d[var6] = param0.e((byte) -104);
                          var10 = -136;
                          var9 = this.field_d[var6] ^ -1;
                          if (var8 != 0) {
                            if (var9 <= var10) {
                              break L1;
                            } else {
                              L9: while (true) {
                                this.field_b[var6] = param0.e((byte) -104);
                                var6++;
                                if (var8 == 0) {
                                  if (7 <= var6) {
                                    break L1;
                                  } else {
                                    continue L9;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L10: {
                              if (var9 <= var10) {
                                this.field_d[var6] = -1;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var6++;
                            if (var8 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      this.field_c = param0.i(1);
                      var6 = 0;
                      L11: while (true) {
                        if (7 <= var6) {
                          break L1;
                        } else {
                          this.field_b[var6] = param0.e((byte) -104);
                          var6++;
                          if (var8 == 0) {
                            continue L11;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L12: {
                L13: {
                  var5 = -1;
                  if (6 <= var4_int) {
                    break L13;
                  } else {
                    var5 = param0.k(0);
                    this.field_k = 0;
                    this.field_j = 0;
                    var6 = 0;
                    L14: while (true) {
                      if (var6 >= var5) {
                        if (var8 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      } else {
                        var7 = at.field_c[var6];
                        this.field_j = this.field_j + var7;
                        var6++;
                        if (var8 != 0) {
                          break L12;
                        } else {
                          continue L14;
                        }
                      }
                    }
                  }
                }
                this.field_k = param0.i(1);
                this.field_j = param0.i(1);
                this.field_g.a(var4_int, param0, -115);
                break L12;
              }
              stackOut_34_0 = var4_int;
              stackIn_35_0 = stackOut_34_0;
              break L0;
            } else {
              throw new RuntimeException("Unrecognized version: " + var4_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var4);
            stackOut_36_1 = new StringBuilder().append("hm.F(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L15;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L15;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_35_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        as.field_E.a(param5, -20500, param6, param2, param4);
        if (qd.field_I == null) {
          if (param0 == -1) {
            return;
          } else {
            field_i = (String[]) null;
            return;
          }
        } else {
          qd.field_I.b(param1, param3, param5, -kn.field_z + param1, param5, param0 ^ 6518);
          if (param0 == -1) {
            return;
          } else {
            field_i = (String[]) null;
            return;
          }
        }
    }

    private hm() {
        int var1 = 0;
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_k = 0;
        this.field_a = new int[135];
        this.field_b = new int[7];
        this.field_c = 0;
        this.field_j = 0;
        this.field_d = new int[5];
        var1 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (5 <= var1) {
                break L2;
              } else {
                this.field_d[var1] = -1;
                var1++;
                if (var2 != 0) {
                  break L1;
                } else {
                  if (var2 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var1 = 0;
            break L1;
          }
          L3: while (true) {
            if (135 <= var1) {
              this.field_g = new cm();
              return;
            } else {
              this.field_a[var1] = 0;
              var1++;
              if (var2 == 0) {
                continue L3;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        field_i = new String[]{"Full health", "1/2 health", "1/3 health", "1/4 health", "1/5 health", "1/6 health"};
        field_e = "Are You Sure?";
        field_l = new int[]{0, 0, 536870912, 553634816, 544700415};
        field_h = new jl();
    }
}
