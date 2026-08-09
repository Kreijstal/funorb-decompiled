/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ec extends fi implements ja {
    static String field_y;
    static float field_z;
    fi field_x;
    static String field_D;
    static String field_A;
    static km field_C;

    final boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5 == 0) {
              L1: {
                L2: {
                  if (this.field_x == null) {
                    break L2;
                  } else {
                    if (!this.field_x.f(true)) {
                      break L2;
                    } else {
                      if (!this.field_x.a(param0, param1, param2, param3, param4, param5 + 0, param6)) {
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("ec.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    String d(int param0) {
        String var2;
        String var3;
        var2 = super.d(41);
        if (param0 >= 35) {
          if (this.field_x != null) {
            var3 = this.field_x.d(38);
            if (var3 == null) {
              return var2;
            } else {
              return var3;
            }
          } else {
            return var2;
          }
        } else {
          field_C = (km) null;
          if (this.field_x != null) {
            var3 = this.field_x.d(38);
            if (var3 == null) {
              return var2;
            } else {
              return var3;
            }
          } else {
            return var2;
          }
        }
    }

    public static void a(int param0) {
        field_C = null;
        field_D = null;
        field_A = null;
        field_y = null;
        if (param0 != -3298) {
            field_D = (String) null;
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_x == null) {
                break L1;
              } else {
                if (!this.field_x.f(true)) {
                  break L1;
                } else {
                  if (!this.field_x.a(param0, param1, param2, -124)) {
                    break L1;
                  } else {
                    stackIn_4_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            var5_int = -96 % ((-75 - param3) / 36);
            var6 = param2;
            if (-81 != (var6 ^ -1)) {
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L2: {
                if (!dc.field_Y[81]) {
                  stackIn_9_0 = this.a((byte) -67, param0);
                  break L2;
                } else {
                  stackIn_9_0 = this.a(param0, true);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ec.AA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final boolean f(boolean param0) {
        if (!param0) {
            return false;
        }
        return null != this.g(!param0 ? true : false) ? true : false;
    }

    private final boolean a(fi param0, boolean param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        fi var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var4 = (fi) null;
                discarded$1 = this.a((byte) -30, (fi) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_x == null) {
                  break L3;
                } else {
                  if (this.field_x.f(true)) {
                    break L3;
                  } else {
                    if (!this.field_x.a(param0, -8515)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ec.WA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -8515) {
                break L1;
              } else {
                this.d(-27);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_x == null) {
                  break L3;
                } else {
                  if (!this.field_x.a(param0, -8515)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ec.G(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 118) {
                break L1;
              } else {
                var6 = (StringBuilder) null;
                this.a((Hashtable) null, (byte) 94, 63, (StringBuilder) null);
                break L1;
              }
            }
            L2: {
              if (this.a(param0, param2, 34, param3)) {
                this.a(param2, param0, (byte) 126, param3);
                this.a(param0, param3, 8651, param2);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ec.MA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    private final boolean a(byte param0, fi param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        fi var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -50) {
                break L1;
              } else {
                var4 = (fi) null;
                discarded$1 = this.a((byte) 59, (fi) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_x == null) {
                  break L3;
                } else {
                  if (this.field_x.f(true)) {
                    break L3;
                  } else {
                    if (!this.field_x.a(param1, -8515)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ec.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    ec(int param0, int param1, int param2, int param3, ol param4, cd param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        if (!param1) {
            return;
        }
        super.a(param0, param1, param2, param3, param4);
        this.e(-37);
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$4 = null;
        boolean discarded$5 = false;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        fi var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          discarded$4 = param1.append('\n');
          var5_int = 0;
          L0: while (true) {
            if (param3 < var5_int) {
              L1: {
                if (param2 == 8651) {
                  break L1;
                } else {
                  var7 = (fi) null;
                  discarded$5 = this.a((fi) null, true);
                  break L1;
                }
              }
              if (this.field_x != null) {
                this.field_x.a(param0, (byte) 122, param3 + 1, param1);
                return;
              } else {
                discarded$6 = param1.append("null");
                return;
              }
            } else {
              discarded$7 = param1.append(' ');
              var5_int++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ec.AB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        L0: {
          if (param3 != 0) {
            break L0;
          } else {
            if (this.field_w != null) {
              this.field_w.a(param1, (fi) (this), true, param2, -23294);
              break L0;
            } else {
              if (param0 == 37) {
                L1: {
                  if (this.field_x != null) {
                    this.field_x.a((byte) 37, param1 + this.field_l, param2 + this.field_u, param3);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  field_y = (String) null;
                  if (this.field_x != null) {
                    this.field_x.a((byte) 37, param1 + this.field_l, param2 + this.field_u, param3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            }
          }
        }
        if (param0 != 37) {
          L3: {
            field_y = (String) null;
            if (this.field_x != null) {
              this.field_x.a((byte) 37, param1 + this.field_l, param2 + this.field_u, param3);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (this.field_x != null) {
              this.field_x.a((byte) 37, param1 + this.field_l, param2 + this.field_u, param3);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2) {
              L1: {
                L2: {
                  if (null == this.field_x) {
                    break L2;
                  } else {
                    if (!this.field_x.a(param0, param1, false, param3 - -this.field_l, param4, param5 - -this.field_u, param6)) {
                      break L2;
                    } else {
                      stackIn_7_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_7_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("ec.NA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final void c(int param0) {
        boolean discarded$4 = false;
        fi var3;
        if (param0 != -1) {
          L0: {
            var3 = (fi) null;
            discarded$4 = this.a((fi) null, true);
            if (this.field_x != null) {
              this.field_x.c(-1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_x != null) {
              this.field_x.c(-1);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, 122, param2, param3);
              if (param1 > 113) {
                break L1;
              } else {
                this.field_x = (fi) null;
                break L1;
              }
            }
            if (null == this.field_x) {
              break L0;
            } else {
              this.field_x.a(this.field_l + param0, 117, param2, this.field_u + param3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ec.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
    }

    fi g(boolean param0) {
        fi var2 = null;
        if (param0) {
            field_D = (String) null;
            var2 = this.field_x;
            if (var2 == null) {
                return null;
            }
            if (!(!var2.f(true))) {
                return var2;
            }
            return null;
        }
        var2 = this.field_x;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.f(true))) {
            return var2;
        }
        return null;
    }

    final int b(byte param0) {
        fi var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -39) {
          L0: {
            var3 = (fi) null;
            this.a((fi) null, 66);
            if (this.field_x == null) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = this.field_x.b((byte) -39);
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_x == null) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = this.field_x.b((byte) -39);
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param5 >= 73) {
                break L1;
              } else {
                ec.a(-26);
                break L1;
              }
            }
            if (this.field_x != null) {
              this.field_x.a(param0, param1, param2 - -this.field_l, param3, param4 - -this.field_u, 84);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("ec.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void e(int param0) {
        boolean discarded$1 = false;
        fi var3;
        L0: {
          if (null != this.field_x) {
            this.field_x.d(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -2) {
          var3 = (fi) null;
          discarded$1 = this.a((byte) -16, (fi) null);
          return;
        } else {
          return;
        }
    }

    static {
        field_D = "Enter name of friend to delete from list";
        field_y = "<%0>'s turn";
        field_A = "This password contains your Player Name, and would be easy to guess";
    }
}
