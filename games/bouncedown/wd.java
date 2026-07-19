/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wd extends lk {
    static boolean field_x;
    private boolean field_A;
    boolean field_y;
    boolean field_z;
    private boolean field_w;

    void a(int param0, int param1, int param2, lk param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1, param2, param3);
              if (-1 == (this.field_u ^ -1)) {
                break L1;
              } else {
                if (this.field_u == n.field_m) {
                  break L1;
                } else {
                  L2: {
                    if (!this.c(uc.field_C, 0, param2, param1, ll.field_y)) {
                      break L2;
                    } else {
                      if (-1 == (n.field_m ^ -1)) {
                        this.a(ll.field_y - param2, uc.field_C - param1, (byte) -127, this.field_u);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.a(ll.field_y, param1, param3, param2, 34, uc.field_C);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("wd.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        boolean discarded$2 = false;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_y) {
                break L1;
              } else {
                if (this.c(param3, param4 + -28455, param6, param2, param5)) {
                  L2: {
                    discarded$2 = this.a(param1, false);
                    this.field_u = param0;
                    if (this.field_n == null) {
                      break L2;
                    } else {
                      if (!(this.field_n instanceof cc)) {
                        break L2;
                      } else {
                        ((cc) ((Object) this.field_n)).a(74, (wd) (this), param3, param2, param6, param5, param0);
                        break L2;
                      }
                    }
                  }
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param4 == 28455) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var8);
            stackOut_13_1 = new StringBuilder().append("wd.IA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    wd(String param0, fc param1, sk param2) {
        super(param0, param1, param2);
        this.field_y = true;
        this.field_A = false;
        this.field_w = true;
    }

    final void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        try {
            if (param4 != 34) {
                this.field_z = true;
            }
            if (null != this.field_n) {
                if (!(!(this.field_n instanceof cc))) {
                    ((cc) ((Object) this.field_n)).a(param3, param5, (wd) (this), -53, param0, param1);
                }
            }
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "wd.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_11_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_10_0 = null;
        StringBuilder stackOut_1_0 = null;
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
        try {
          L0: {
            if (param1) {
              L1: {
                if (!this.a(param2, param3, (byte) 14, param0)) {
                  break L1;
                } else {
                  L2: {
                    this.a(param0, param3, param2, 32362);
                    if (this.field_z) {
                      discarded$4 = param3.append(" active");
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (!this.field_y) {
                    discarded$5 = param3.append(" disabled");
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_10_0 = (StringBuilder) (param3);
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (StringBuilder) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("wd.HA(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          L4: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_11_0;
        }
    }

    boolean a(lk param0, boolean param1) {
        RuntimeException var3 = null;
        lk var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!this.field_y) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_w) {
                L1: {
                  param0.c((byte) 102);
                  if (!param1) {
                    break L1;
                  } else {
                    var4 = (lk) null;
                    this.a(-13, 60, -58, (lk) null);
                    break L1;
                  }
                }
                L2: {
                  this.field_A = true;
                  if (this.field_n == null) {
                    break L2;
                  } else {
                    if (this.field_n instanceof dc) {
                      ((dc) ((Object) this.field_n)).a(-78, this.field_A, (lk) (this));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("wd.PA(");
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -14565) {
                break L1;
              } else {
                this.a(22, 87, (byte) -62, 99);
                break L1;
              }
            }
            if (!this.e(1)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param2 == 84) {
                  break L2;
                } else {
                  if (-84 == (param2 ^ -1)) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
              this.a(-1, -1, (byte) -119, 1);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("wd.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 < -71) {
          if (0 != param0) {
            if ((param0 ^ -1) < -1) {
              L0: {
                var2 = 1;
                if (-65536 > (param0 ^ -1)) {
                  var2 += 16;
                  param0 = param0 >> 16;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if ((param0 ^ -1) < -256) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((param0 ^ -1) >= -4) {
                  break L3;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L3;
                }
              }
              L4: {
                if ((param0 ^ -1) < -2) {
                  var2++;
                  param0 = param0 >> 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              return var2;
            } else {
              L5: {
                var2 = 2;
                if (65535 < (param0 ^ -1)) {
                  param0 = param0 >> 16;
                  var2 += 16;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (-256 <= param0) {
                  break L6;
                } else {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L6;
                }
              }
              L7: {
                if ((param0 ^ -1) > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (3 >= (param0 ^ -1)) {
                  break L8;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L8;
                }
              }
              L9: {
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            }
          } else {
            return 0;
          }
        } else {
          field_x = false;
          if (0 != param0) {
            if ((param0 ^ -1) < -1) {
              L10: {
                var2 = 1;
                if (-65536 > (param0 ^ -1)) {
                  var2 += 16;
                  param0 = param0 >> 16;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if ((param0 ^ -1) < -256) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (param0 > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if ((param0 ^ -1) >= -4) {
                  break L13;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L13;
                }
              }
              L14: {
                if ((param0 ^ -1) < -2) {
                  var2++;
                  param0 = param0 >> 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              return var2;
            } else {
              L15: {
                var2 = 2;
                if (65535 < (param0 ^ -1)) {
                  param0 = param0 >> 16;
                  var2 += 16;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (-256 <= param0) {
                  break L16;
                } else {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L16;
                }
              }
              L17: {
                if ((param0 ^ -1) > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (3 >= (param0 ^ -1)) {
                  break L18;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L18;
                }
              }
              L19: {
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              return var2;
            }
          } else {
            return 0;
          }
        }
    }

    final void c(byte param0) {
        if (param0 >= 80) {
          if (this.field_A) {
            this.field_A = false;
            if (this.field_n != null) {
              if (!(this.field_n instanceof dc)) {
                return;
              } else {
                ((dc) ((Object) this.field_n)).a(-70, this.field_A, (lk) (this));
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_w = true;
          if (this.field_A) {
            this.field_A = false;
            if (this.field_n != null) {
              if (!(this.field_n instanceof dc)) {
                return;
              } else {
                ((dc) ((Object) this.field_n)).a(-70, this.field_A, (lk) (this));
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean e(int param0) {
        if (param0 != 1) {
            this.field_z = false;
            return this.field_A;
        }
        return this.field_A;
    }

    void a(int param0, int param1, byte param2, int param3) {
        lk var6 = null;
        L0: {
          if (null == this.field_n) {
            break L0;
          } else {
            if (this.field_n instanceof rc) {
              ((rc) ((Object) this.field_n)).a((byte) 110, param0, param3, param1, (wd) (this));
              break L0;
            } else {
              if (param2 < -77) {
                return;
              } else {
                var6 = (lk) null;
                this.a(-122, -33, 38, (lk) null);
                return;
              }
            }
          }
        }
        if (param2 >= -77) {
          var6 = (lk) null;
          this.a(-122, -33, 38, (lk) null);
          return;
        } else {
          return;
        }
    }

    wd(String param0, sk param1) {
        this(param0, ma.field_m.field_b, param1);
    }

    protected wd() {
        this.field_y = true;
        this.field_A = false;
        this.field_w = true;
        this.field_j = ma.field_m.field_l;
    }

    static {
        field_x = true;
    }
}
