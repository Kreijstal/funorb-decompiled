/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private int field_c;
    static int[] field_h;
    private int field_f;
    private int[] field_i;
    private int field_l;
    private boolean field_j;
    static String field_k;
    private boolean field_d;
    static vna field_b;
    static int[] field_g;
    private boolean field_a;
    static int[] field_e;

    final static int a(int param0) {
        if (param0 >= -41) {
            field_h = (int[]) null;
            return hg.field_f;
        }
        return hg.field_f;
    }

    private mg(int param0, int param1) {
        this(new int[]{param0, param0}, param1);
        this.field_c = param1;
    }

    final void a(int param0, kh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        kh var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param1.a((byte) 86, this.field_i.length, 4);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_i.length <= var3_int) {
                    break L3;
                  } else {
                    param1.a((byte) -25, this.field_i[var3_int], 12);
                    var3_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 == 15637) {
                    break L4;
                  } else {
                    var5 = (kh) null;
                    this.a(-109, (kh) null);
                    break L4;
                  }
                }
                param1.a((byte) -36, this.field_c, 12);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("mg.D(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            field_e = (int[]) null;
            return this.field_a;
        }
        return this.field_a;
    }

    mg(int[] param0) {
        this(param0, 0);
    }

    public static void e(int param0) {
        field_h = null;
        field_k = null;
        field_b = null;
        field_g = null;
        if (param0 != 9980) {
            return;
        }
        field_e = null;
    }

    public mg() {
        this(50);
    }

    final void d(int param0) {
        int discarded$2 = 0;
        int var3 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          this.field_a = false;
          if (param0 == 0) {
            break L0;
          } else {
            discarded$2 = mg.a(-118);
            break L0;
          }
        }
        L1: {
          if (this.field_d) {
            this.field_d = false;
            this.field_a = true;
            break L1;
          } else {
            break L1;
          }
        }
        if (this.field_j) {
          if ((this.field_f ^ -1) == 0) {
            this.field_a = true;
            this.field_f = 0;
            return;
          } else {
            this.field_a = false;
            return;
          }
        } else {
          if (-1 == this.field_f) {
            this.field_f = this.field_i[0];
            this.field_f = this.field_f - 1;
            if (-1 <= (this.field_f ^ -1)) {
              L2: while (true) {
                L3: {
                  this.field_l = this.field_l + 1;
                  if (this.field_i.length <= this.field_l) {
                    this.field_l = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_f = this.field_i[this.field_l];
                L4: while (true) {
                  L5: {
                    stackOut_31_0 = this;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (this.field_a) {
                      stackOut_33_0 = this;
                      stackOut_33_1 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      break L5;
                    } else {
                      stackOut_32_0 = this;
                      stackOut_32_1 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      break L5;
                    }
                  }
                  ((mg) (this)).field_a = stackIn_34_1 != 0;
                  if (-1 == (this.field_f ^ -1)) {
                    continue L2;
                  } else {
                    if (var3 != 0) {
                      continue L4;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            this.field_f = this.field_f - 1;
            if (-1 > (this.field_f ^ -1)) {
              return;
            } else {
              L6: while (true) {
                L7: {
                  this.field_l = this.field_l + 1;
                  if (this.field_i.length <= this.field_l) {
                    this.field_l = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.field_f = this.field_i[this.field_l];
                L8: while (true) {
                  L9: {
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (this.field_a) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L9;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L9;
                    }
                  }
                  ((mg) (this)).field_a = stackIn_20_1 != 0;
                  if (-1 == (this.field_f ^ -1)) {
                    continue L6;
                  } else {
                    if (var3 != 0) {
                      continue L8;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final int a(byte param0) {
        int discarded$2 = 0;
        if (null != this.field_i) {
          if (param0 != -94) {
            discarded$2 = mg.a(44);
            return jna.a(param0 + 104, this.field_i);
          } else {
            return jna.a(param0 + 104, this.field_i);
          }
        } else {
          return 0;
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_j) {
          return;
        } else {
          this.field_c = param1;
          if (!param0) {
            if (-1 > (param1 ^ -1)) {
              param1 = param1 % jna.a(10, this.field_i);
              var3 = 0;
              L0: while (true) {
                if (-1 > (param1 ^ -1)) {
                  this.d(0);
                  param1--;
                  if (!this.field_a) {
                    continue L0;
                  } else {
                    if (var4 == 0) {
                      L1: {
                        if (var3 != 0) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L1;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_36_0;
                      continue L0;
                    } else {
                      return;
                    }
                  }
                } else {
                  L2: {
                    stackOut_26_0 = this;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (var3 == 0) {
                      stackOut_28_0 = this;
                      stackOut_28_1 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L2;
                    } else {
                      stackOut_27_0 = this;
                      stackOut_27_1 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L2;
                    }
                  }
                  ((mg) (this)).field_d = stackIn_29_1 != 0;
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            this.field_l = 38;
            if (-1 > (param1 ^ -1)) {
              param1 = param1 % jna.a(10, this.field_i);
              var3 = 0;
              L3: while (true) {
                if (-1 > (param1 ^ -1)) {
                  this.d(0);
                  param1--;
                  if (!this.field_a) {
                    continue L3;
                  } else {
                    if (var4 == 0) {
                      L4: {
                        if (var3 != 0) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L4;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L4;
                        }
                      }
                      var3 = stackIn_19_0;
                      continue L3;
                    } else {
                      return;
                    }
                  }
                } else {
                  L5: {
                    stackOut_8_0 = this;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var3 == 0) {
                      stackOut_10_0 = this;
                      stackOut_10_1 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L5;
                    } else {
                      stackOut_9_0 = this;
                      stackOut_9_1 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L5;
                    }
                  }
                  ((mg) (this)).field_d = stackIn_11_1 != 0;
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          if (null != this.field_i) {
            if (0 >= this.field_i.length) {
              return 0;
            } else {
              return this.field_i[this.field_l];
            }
          } else {
            return 0;
          }
        } else {
          return 7;
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -53) {
          L0: {
            field_k = (String) null;
            if ((param2 & 34) == 0) {
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
            if ((param2 & 34) == 0) {
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

    final int b(int param0) {
        if (param0 != 12) {
            mg.e(6);
            return this.field_f;
        }
        return this.field_f;
    }

    private mg(int[] param0, int param1) {
        this.field_f = -1;
        try {
            this.field_c = param1;
            this.field_i = param0;
            this.field_j = 0 == this.a((byte) -94) ? true : false;
            this.a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mg(int param0, kh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
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
        var5 = TombRacer.field_G ? 1 : 0;
        this.field_f = -1;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var3_int = param1.b((byte) 44, 4);
                  this.field_i = new int[var3_int];
                  if (-10 > (param0 ^ -1)) {
                    break L3;
                  } else {
                    var4 = 0;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var4) {
                          this.field_c = param1.b((byte) 44, 8);
                          break L5;
                        } else {
                          this.field_i[var4] = param1.b((byte) 44, 8);
                          var4++;
                          if (var5 != 0) {
                            break L5;
                          } else {
                            continue L4;
                          }
                        }
                      }
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = 0;
                L6: while (true) {
                  if (var4 >= var3_int) {
                    this.field_c = param1.b((byte) 44, 12);
                    break L2;
                  } else {
                    this.field_i[var4] = param1.b((byte) 44, 12);
                    var4++;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      continue L6;
                    }
                  }
                }
              }
              this.a(false, this.field_c);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    mg(int param0) {
        this(param0, 0);
    }

    static {
        field_h = new int[1];
        field_k = "Room: <%0>/<%1>";
        field_g = new int[2];
        field_b = new vna();
        field_e = new int[8192];
    }
}
