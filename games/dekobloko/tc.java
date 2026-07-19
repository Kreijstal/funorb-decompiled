/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends w {
    static byte[][] field_Nb;
    private w field_Vb;
    static w field_Ub;
    private w[] field_Rb;
    static ck field_Tb;
    static String field_Qb;
    int field_Pb;
    private w[] field_Sb;
    static w field_Ob;

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_8_0 = false;
        var3 = client.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_Rb.length <= var2) {
                break L2;
              } else {
                stackOut_2_0 = var2 ^ -1;
                stackIn_9_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 == (this.field_Pb ^ -1)) {
                      break L3;
                    } else {
                      if (0 != this.field_Rb[var2].field_ob) {
                        this.field_Rb[this.field_Pb].field_ab = false;
                        this.field_Sb[this.field_Pb].field_vb = this.field_Sb[this.field_Pb].field_vb + 10000;
                        this.field_Pb = var2;
                        this.field_Rb[var2].field_ab = true;
                        this.field_Sb[var2].field_vb = this.field_Sb[var2].field_vb - 10000;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_8_0 = param0;
            stackIn_9_0 = stackOut_8_0 ? 1 : 0;
            break L1;
          }
          if (stackIn_9_0 != 0) {
            this.a(-26, true, -12);
            return;
          } else {
            return;
          }
        }
    }

    public static void h(byte param0) {
        if (param0 <= 83) {
            return;
        }
        field_Nb = (byte[][]) null;
        field_Ob = null;
        field_Tb = null;
        field_Qb = null;
        field_Ub = null;
    }

    tc(long param0, w param1, String[] param2, w param3, w[] param4, int param5) {
        super(param0, (w) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        w var9 = null;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            this.field_Rb = new w[param2.length];
            this.field_Vb = new w(0L, param3);
            this.field_Sb = param4;
            var8_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param2.length <= var8_int) {
                    break L3;
                  } else {
                    var9 = new w(0L, param1);
                    var9.field_Y = param2[var8_int];
                    this.field_Rb[var8_int] = var9;
                    this.a(var9, -16834);
                    var8_int++;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.a(this.field_Vb, -16834);
                break L2;
              }
              var8_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var8_int >= param4.length) {
                      break L6;
                    } else {
                      this.field_Vb.a(param4[var8_int], -16834);
                      var8_int++;
                      if (var10 != 0) {
                        break L5;
                      } else {
                        if (var10 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  this.field_Pb = param5;
                  this.field_Rb[param5].field_ab = true;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var8);
            stackOut_12_1 = new StringBuilder().append("tc.<init>(").append(param0).append(',');
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
              break L7;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L7;
            }
          }
          L8: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          L9: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          L10: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        if (param1) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_Rb.length) {
              this.field_Vb.a(this.field_mb, 0, param2, -param2 + this.field_N, 0);
              var4 = 0;
              L1: while (true) {
                if (var4 < this.field_Sb.length) {
                  this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                  if (var7 == 0) {
                    L2: {
                      if (var4 == this.field_Pb) {
                        break L2;
                      } else {
                        this.field_Sb[var4].field_vb = this.field_Sb[var4].field_vb + 10000;
                        break L2;
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var5 = var4 * this.field_mb / this.field_Rb.length;
              var6 = this.field_mb * (var4 - -1) / this.field_Rb.length;
              this.field_Rb[var4].field_vb = var5;
              this.field_Rb[var4].field_Ib = 0;
              this.field_Rb[var4].field_mb = var6 + -var5;
              this.field_Rb[var4].field_N = param2;
              var4++;
              if (var7 != 0) {
                var4 = 0;
                L3: while (true) {
                  if (var4 < this.field_Sb.length) {
                    this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                    if (var7 == 0) {
                      L4: {
                        if (var4 == this.field_Pb) {
                          break L4;
                        } else {
                          this.field_Sb[var4].field_vb = this.field_Sb[var4].field_vb + 10000;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        } else {
          this.a(-2, -35, 12, -28, 52, 1, -110);
          var4 = 0;
          L5: while (true) {
            if (var4 >= this.field_Rb.length) {
              this.field_Vb.a(this.field_mb, 0, param2, -param2 + this.field_N, 0);
              var4 = 0;
              L6: while (true) {
                if (var4 < this.field_Sb.length) {
                  this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                  if (var7 == 0) {
                    L7: {
                      if (var4 == this.field_Pb) {
                        break L7;
                      } else {
                        this.field_Sb[var4].field_vb = this.field_Sb[var4].field_vb + 10000;
                        break L7;
                      }
                    }
                    var4++;
                    continue L6;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var5 = var4 * this.field_mb / this.field_Rb.length;
              var6 = this.field_mb * (var4 - -1) / this.field_Rb.length;
              this.field_Rb[var4].field_vb = var5;
              this.field_Rb[var4].field_Ib = 0;
              this.field_Rb[var4].field_mb = var6 + -var5;
              this.field_Rb[var4].field_N = param2;
              var4++;
              if (var7 == 0) {
                continue L5;
              } else {
                var4 = 0;
                L8: while (true) {
                  if (var4 < this.field_Sb.length) {
                    this.field_Sb[var4].a(this.field_Vb.field_mb + -(2 * param0), 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
                    if (var7 == 0) {
                      L9: {
                        if (var4 == this.field_Pb) {
                          break L9;
                        } else {
                          this.field_Sb[var4].field_vb = this.field_Sb[var4].field_vb + 10000;
                          break L9;
                        }
                      }
                      var4++;
                      continue L8;
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
    }

    final static w g(byte param0) {
        if (param0 != 98) {
            return (w) null;
        }
        return dm.a((byte) 108);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 >= -44) {
          this.a(4, true, -41);
          this.field_N = param0;
          this.field_mb = param2;
          this.field_vb = param5;
          this.field_Ib = param1;
          this.a(param3, true, param4);
          return;
        } else {
          this.field_N = param0;
          this.field_mb = param2;
          this.field_vb = param5;
          this.field_Ib = param1;
          this.a(param3, true, param4);
          return;
        }
    }

    final static int a(int param0, hl param1) {
        w discarded$2 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = ij.field_c;
                if (-3 == (param1.field_m ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (4 != param1.field_m) {
                      break L3;
                    } else {
                      var2_int = ul.field_c[param1.field_m];
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param1.field_r != uc.field_g) {
                      break L4;
                    } else {
                      var2_int = tl.field_q[param1.field_m];
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2_int = ul.field_c[param1.field_m];
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (!param1.field_j) {
                  break L5;
                } else {
                  var2_int = ij.field_c;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                L7: {
                  if (param1.field_i != 0) {
                    break L7;
                  } else {
                    if (-1 == (param1.field_n ^ -1)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var2_int = ul.field_c[param1.field_m];
                if (var3 == 0) {
                  break L1;
                } else {
                  break L6;
                }
              }
              var2_int = tl.field_q[param1.field_m];
              break L1;
            }
            L8: {
              if (param0 == 4636) {
                break L8;
              } else {
                discarded$2 = tc.g((byte) 85);
                break L8;
              }
            }
            stackOut_16_0 = var2_int;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("tc.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    static {
    }
}
