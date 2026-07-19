/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fd extends uw {
    private long[] field_h;
    private int field_f;
    private long field_l;
    static String field_i;
    static long field_k;
    private long field_e;
    private long field_j;
    static Random field_d;
    private int field_g;

    final void b(byte param0) {
        boolean discarded$2 = false;
        String var3 = null;
        L0: {
          if ((this.field_e ^ -1L) < (this.field_l ^ -1L)) {
            this.field_l = this.field_l + (-this.field_l + this.field_e);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 105) {
          var3 = (String) null;
          discarded$2 = fd.a((js) null, (String) null, true, (String) null, (String) null, -8, -120);
          this.field_j = 0L;
          return;
        } else {
          this.field_j = 0L;
          return;
        }
    }

    final static boolean a(js param0, String param1, boolean param2, String param3, String param4, int param5, int param6) {
        RuntimeException var7 = null;
        uk var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
              if (param6 == 0) {
                break L1;
              } else {
                fd.c(127);
                break L1;
              }
            }
            if (hm.field_a != nw.field_e) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var8 = new uk(rf.field_a, param0);
                rf.field_a.a((byte) 111, var8);
                if (fh.c(param6 ^ -123)) {
                  var8.f(true);
                  break L2;
                } else {
                  L3: {
                    if (!param2) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L3;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L3;
                    }
                  }
                  dv.field_b = stackIn_10_0 != 0;
                  vr.field_G = param1;
                  in.field_C = param3;
                  eg.field_l = null;
                  nw.field_e = ad.field_p;
                  bi.field_d = param4;
                  lq.field_d = param5;
                  if (!Sumoblitz.field_L) {
                    break L2;
                  } else {
                    var8.f(true);
                    break L2;
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var7);
            stackOut_16_1 = new StringBuilder().append("fd.H(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          L6: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    public static void c(int param0) {
        field_i = null;
        int var1 = 121 % ((75 - param0) / 32);
        field_d = null;
    }

    private final long a(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_5_0 = 0L;
        long stackIn_7_0 = 0L;
        long stackIn_11_0 = 0L;
        long stackIn_13_0 = 0L;
        long stackIn_20_0 = 0L;
        long stackIn_22_0 = 0L;
        long stackIn_26_0 = 0L;
        long stackIn_28_0 = 0L;
        long stackIn_35_0 = 0L;
        long stackIn_37_0 = 0L;
        long stackIn_41_0 = 0L;
        long stackIn_43_0 = 0L;
        long stackIn_49_0 = 0L;
        long stackIn_51_0 = 0L;
        long stackIn_55_0 = 0L;
        long stackIn_57_0 = 0L;
        long stackOut_54_0 = 0L;
        long stackOut_56_0 = 0L;
        long stackOut_48_0 = 0L;
        long stackOut_50_0 = 0L;
        long stackOut_40_0 = 0L;
        long stackOut_42_0 = 0L;
        long stackOut_34_0 = 0L;
        long stackOut_36_0 = 0L;
        long stackOut_25_0 = 0L;
        long stackOut_27_0 = 0L;
        long stackOut_19_0 = 0L;
        long stackOut_21_0 = 0L;
        long stackOut_10_0 = 0L;
        long stackOut_12_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_6_0 = 0L;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 - this.field_j;
        this.field_j = var2;
        if ((var4 ^ -1L) < 4999999999L) {
          if (var4 < 5000000000L) {
            this.field_h[this.field_g] = var4;
            this.field_g = (1 + this.field_g) % 10;
            if (-2 >= (this.field_f ^ -1)) {
              var6 = 0L;
              if (param0 < 49) {
                this.field_e = -118L;
                var8 = 1;
                L0: while (true) {
                  L1: {
                    L2: {
                      if (var8 > this.field_f) {
                        break L2;
                      } else {
                        stackOut_54_0 = var6 + this.field_h[(10 + (this.field_g - var8)) % 10];
                        stackIn_57_0 = stackOut_54_0;
                        stackIn_55_0 = stackOut_54_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          var6 = stackIn_55_0;
                          var8++;
                          if (var9 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    stackOut_56_0 = var6 / (long)this.field_f;
                    stackIn_57_0 = stackOut_56_0;
                    break L1;
                  }
                  return stackIn_57_0;
                }
              } else {
                var8 = 1;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var8 > this.field_f) {
                        break L5;
                      } else {
                        stackOut_48_0 = var6 + this.field_h[(10 + (this.field_g - var8)) % 10];
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (var9 != 0) {
                          break L4;
                        } else {
                          var6 = stackIn_49_0;
                          var8++;
                          if (var9 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    stackOut_50_0 = var6 / (long)this.field_f;
                    stackIn_51_0 = stackOut_50_0;
                    break L4;
                  }
                  return stackIn_51_0;
                }
              }
            } else {
              this.field_f = this.field_f + 1;
              var6 = 0L;
              if (param0 < 49) {
                this.field_e = -118L;
                var8 = 1;
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var8 > this.field_f) {
                        break L8;
                      } else {
                        stackOut_40_0 = var6 + this.field_h[(10 + (this.field_g - var8)) % 10];
                        stackIn_43_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (var9 != 0) {
                          break L7;
                        } else {
                          var6 = stackIn_41_0;
                          var8++;
                          if (var9 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackOut_42_0 = var6 / (long)this.field_f;
                    stackIn_43_0 = stackOut_42_0;
                    break L7;
                  }
                  return stackIn_43_0;
                }
              } else {
                var8 = 1;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var8 > this.field_f) {
                        break L11;
                      } else {
                        stackOut_34_0 = var6 + this.field_h[(10 + (this.field_g - var8)) % 10];
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        if (var9 != 0) {
                          break L10;
                        } else {
                          var6 = stackIn_35_0;
                          var8++;
                          if (var9 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_36_0 = var6 / (long)this.field_f;
                    stackIn_37_0 = stackOut_36_0;
                    break L10;
                  }
                  return stackIn_37_0;
                }
              }
            }
          } else {
            var6 = 0L;
            if (param0 >= 49) {
              var8 = 1;
              L12: while (true) {
                L13: {
                  L14: {
                    if (var8 > this.field_f) {
                      break L14;
                    } else {
                      stackOut_25_0 = var6 + this.field_h[(10 + (this.field_g - var8)) % 10];
                      stackIn_28_0 = stackOut_25_0;
                      stackIn_26_0 = stackOut_25_0;
                      if (var9 != 0) {
                        break L13;
                      } else {
                        var6 = stackIn_26_0;
                        var8++;
                        if (var9 == 0) {
                          continue L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  stackOut_27_0 = var6 / (long)this.field_f;
                  stackIn_28_0 = stackOut_27_0;
                  break L13;
                }
                return stackIn_28_0;
              }
            } else {
              this.field_e = -118L;
              var8 = 1;
              L15: while (true) {
                L16: {
                  L17: {
                    if (var8 > this.field_f) {
                      break L17;
                    } else {
                      stackOut_19_0 = var6 + this.field_h[(10 + (this.field_g - var8)) % 10];
                      stackIn_22_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var9 != 0) {
                        break L16;
                      } else {
                        var6 = stackIn_20_0;
                        var8++;
                        if (var9 == 0) {
                          continue L15;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  stackOut_21_0 = var6 / (long)this.field_f;
                  stackIn_22_0 = stackOut_21_0;
                  break L16;
                }
                return stackIn_22_0;
              }
            }
          }
        } else {
          var6 = 0L;
          if (param0 < 49) {
            this.field_e = -118L;
            var8 = 1;
            L18: while (true) {
              L19: {
                L20: {
                  if (var8 > this.field_f) {
                    break L20;
                  } else {
                    stackOut_10_0 = var6 + this.field_h[(10 + (this.field_g - var8)) % 10];
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var9 != 0) {
                      break L19;
                    } else {
                      var6 = stackIn_11_0;
                      var8++;
                      if (var9 == 0) {
                        continue L18;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
                stackOut_12_0 = var6 / (long)this.field_f;
                stackIn_13_0 = stackOut_12_0;
                break L19;
              }
              return stackIn_13_0;
            }
          } else {
            var8 = 1;
            L21: while (true) {
              L22: {
                L23: {
                  if (var8 > this.field_f) {
                    break L23;
                  } else {
                    stackOut_4_0 = var6 + this.field_h[(10 + (this.field_g - var8)) % 10];
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L22;
                    } else {
                      var6 = stackIn_5_0;
                      var8++;
                      if (var9 == 0) {
                        continue L21;
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                stackOut_6_0 = var6 / (long)this.field_f;
                stackIn_7_0 = stackOut_6_0;
                break L22;
              }
              return stackIn_7_0;
            }
          }
        }
    }

    final static int b(int param0) {
        if (param0 == 3878) {
          if (oj.a(false)) {
            if (null == pu.field_e.e((byte) 54)) {
              return -1;
            } else {
              return pu.field_e.e((byte) 54).field_v;
            }
          } else {
            return -1;
          }
        } else {
          return 25;
        }
    }

    final long a(byte param0) {
        this.field_l = this.field_l + this.a(62);
        if (!((this.field_l ^ -1L) <= (this.field_e ^ -1L))) {
            return (this.field_e + -this.field_l) / 1000000L;
        }
        int var2 = -94 / ((param0 - 42) / 37);
        return 0L;
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            this.b((byte) 73);
            break L0;
          }
        }
        if ((this.field_l ^ -1L) <= (this.field_e ^ -1L)) {
          var4 = 0;
          L1: while (true) {
            this.field_e = this.field_e + param1;
            var4++;
            stackOut_5_0 = var4 ^ -1;
            stackIn_6_0 = stackOut_5_0;
            L2: while (true) {
              L3: {
                if (stackIn_6_0 <= -11) {
                  break L3;
                } else {
                  if (this.field_l > this.field_e) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_8_0 = (this.field_l < this.field_e ? -1 : (this.field_l == this.field_e ? 0 : 1));
              stackIn_6_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (var5 != 0) {
                continue L2;
              } else {
                L4: {
                  if (stackIn_9_0 > 0) {
                    this.field_e = this.field_l;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return var4;
              }
            }
          }
        } else {
          this.field_j = this.field_j + (this.field_e - this.field_l);
          this.field_l = this.field_l + (this.field_e + -this.field_l);
          this.field_e = this.field_e + param1;
          return 1;
        }
    }

    fd() {
        this.field_f = 1;
        this.field_h = new long[10];
        this.field_l = 0L;
        this.field_e = 0L;
        this.field_j = 0L;
        this.field_g = 0;
        this.field_l = System.nanoTime();
        this.field_e = System.nanoTime();
    }

    static {
        field_i = "Click";
        field_k = 0L;
        field_d = new Random();
    }
}
