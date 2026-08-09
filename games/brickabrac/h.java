/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class h extends oc implements sd {
    oc field_E;
    static boolean[] field_D;
    static String[] field_F;
    static tp[] field_C;

    public static void f(byte param0) {
        field_C = null;
        field_F = null;
        if (param0 > -82) {
            String var2 = (String) null;
            h.a((String) null, false);
        }
        field_D = null;
    }

    private final boolean b(boolean param0, oc param1) {
        RuntimeException var3 = null;
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
            if (param0) {
              L1: {
                L2: {
                  if (this.field_E == null) {
                    break L2;
                  } else {
                    if (this.field_E.f(-124)) {
                      break L2;
                    } else {
                      if (!this.field_E.a(true, param1)) {
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
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("h.KB(").append(param0).append(',');

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
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final static void a(int param0, int param1) {
        l var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ki.field_d = param1;
              if (param0 == 13894) {
                break L1;
              } else {
                h.a(-92, -23);
                break L1;
              }
            }
            var2 = (l) ((Object) wd.field_v.d(param0 ^ -13940));
            L2: while (true) {
              if (var2 == null) {
                L3: {
                  if (jc.field_M != null) {
                    var2 = (l) ((Object) jc.field_M.d(param0 + -13977));
                    L4: while (true) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        stackIn_14_0 = var2.field_n.b(0);
                        L5: {
                          if (stackIn_14_0) {
                            var2.field_j.e(var2.field_i * ki.field_d - -128 >> -134713560);
                            break L5;
                          } else {
                            var2.b((byte) 111);
                            break L5;
                          }
                        }
                        var2 = (l) ((Object) jc.field_M.a((byte) 116));
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L6: {
                  if (!var2.field_n.b(0)) {
                    var2.b((byte) 111);
                    break L6;
                  } else {
                    var2.field_j.e(ki.field_d * var2.field_i + 128 >> -577644792);
                    break L6;
                  }
                }
                var2 = (l) ((Object) wd.field_v.a((byte) 116));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2_ref), "h.V(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_E == null) {
                break L1;
              } else {
                if (!this.field_E.f(-127)) {
                  break L1;
                } else {
                  if (!this.field_E.a(param0, (byte) 110, param2, param3)) {
                    break L1;
                  } else {
                    stackIn_4_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            var5_int = param0;
            if (-81 != (var5_int ^ -1)) {
              if (param1 == 110) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                field_C = (tp[]) null;
                return false;
              }
            } else {
              L2: {
                if (pe.field_l[81]) {
                  stackIn_9_0 = this.a(param2, (byte) -35);
                  break L2;
                } else {
                  stackIn_9_0 = this.b(true, param2);
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
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("h.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    h(int param0, int param1, int param2, int param3, ub param4, uh param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String d(int param0) {
        String var3 = null;
        if (param0 <= 6) {
            field_C = (tp[]) null;
        }
        String var2 = super.d(66);
        if (null != this.field_E) {
            var3 = this.field_E.d(61);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) -19);
    }

    final void b(boolean param0) {
        if (!(null == this.field_E)) {
            this.field_E.b(param0);
        }
        if (param0) {
            this.f(-98);
        }
    }

    final int e(byte param0) {
        int var2 = 100 / ((-17 - param0) / 43);
        return this.field_E != null ? this.field_E.e((byte) -71) : 0;
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 24) {
              L1: {
                if (this.a(param3, param2 ^ 1595638000, param0, param1)) {
                  this.a(param1, param0, param2 + -24, param3);
                  this.a(param3, true, param1, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("h.UA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    void a(oc param0, byte param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (null != this.field_E) {
                this.field_E.a(param0, (byte) 0, param2 + this.field_o, param3 + this.field_w);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "h.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        RuntimeException var8 = null;
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
              if (param3 <= -125) {
                break L1;
              } else {
                this.e((byte) 12);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_E) {
                  break L3;
                } else {
                  if (!this.field_E.f(-83)) {
                    break L3;
                  } else {
                    if (!this.field_E.a(param0, param1, param2, -126, param4, param5, param6)) {
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
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("h.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (null != this.field_E) {
                this.field_E.a(param0, param1, this.field_w + param2, param3, 19223, this.field_o + param5);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param4 == 19223) {
                break L2;
              } else {
                field_C = (tp[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("h.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, byte[] param3, int[] param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param2 == 114) {
                break L1;
              } else {
                field_F = (String[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int >= fi.field_w.length) {
                break L0;
              } else {
                param0 = fi.field_w[var5_int];
                var6 = var5_int << 1887129444;
                L3: while (true) {
                  incrementValue$5 = param0;
                  param0--;
                  if (0 == incrementValue$5) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param1 = ek.field_jb[incrementValue$6];
                    dupTemp$7 = param3[param1];
                    dupTemp$8 = param4[dupTemp$7];
                    param4[dupTemp$7] = dupTemp$8 + 1;
                    ek.field_jb[dupTemp$8] = param1;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("h.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    final void a(StringBuilder param0, boolean param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            discarded$3 = param0.append('\n');
            var5_int = 0;
            L1: while (true) {
              if (param3 < var5_int) {
                if (param1) {
                  L2: {
                    if (this.field_E == null) {
                      discarded$4 = param0.append("null");
                      break L2;
                    } else {
                      this.field_E.a(1 + param3, param2, 24, param0);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                discarded$5 = param0.append(' ');
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("h.JB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0, oc param1) {
        RuntimeException var3 = null;
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
            if (param0) {
              L1: {
                L2: {
                  if (this.field_E == null) {
                    break L2;
                  } else {
                    if (!this.field_E.a(true, param1)) {
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
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("h.CA(").append(param0).append(',');

            if (param1 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        if (-1 == (param2 ^ -1)) {
            if (!(null == this.field_l)) {
                this.field_l.a(true, -20618, param1, (oc) (this), param0);
            }
        }
        if (!(null == this.field_E)) {
            this.field_E.a(this.field_w + param0, param1 + this.field_o, param2, (byte) -11);
        }
        if (param3 != -11) {
            field_C = (tp[]) null;
        }
    }

    oc h(byte param0) {
        boolean discarded$0 = false;
        oc var2 = this.field_E;
        if (param0 != 25) {
            oc var3 = (oc) null;
            discarded$0 = this.b(true, (oc) null);
        }
        if (var2 == null) {
            return null;
        }
        if (!var2.f(-95)) {
            return null;
        }
        return var2;
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, boolean param5, int param6) {
        if (param3 > -122) {
            return true;
        }
        if (gp.a(-4858)) {
            hc.a(param5, -7812, param4, param1);
            if (bm.field_d != null && bm.field_d.a(-2, param1, param6, param0, param5)) {
                cr.f((byte) -124);
                param5 = false;
            }
            wp.a(124, param1, param5);
            vo.a(param2, param5, 124);
            param5 = false;
        }
        return param5;
    }

    private final boolean a(oc param0, byte param1) {
        RuntimeException var3 = null;
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
              if (param1 == -35) {
                break L1;
              } else {
                field_C = (tp[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_E == null) {
                  break L3;
                } else {
                  if (this.field_E.f(-117)) {
                    break L3;
                  } else {
                    if (!this.field_E.a(true, param0)) {
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

            stackIn_10_1 = new StringBuilder().append("h.GB(");

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
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
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
              if (param6 == 0) {
                break L1;
              } else {
                this.h((byte) -11);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_E == null) {
                  break L3;
                } else {
                  if (!this.field_E.a(param0, param1, this.field_o + param2, param3 + this.field_w, param4, param5, 0)) {
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
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("h.MA(");

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
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(byte param0) {
        if (param0 > -7) {
            field_D = (boolean[]) null;
        }
        if (this.field_E != null) {
            this.field_E.e(1);
        }
    }

    final boolean f(int param0) {
        if (param0 >= -49) {
            return true;
        }
        return null != this.h((byte) 25) ? true : false;
    }

    final static lo a(String param0, boolean param1) {
        lo stackIn_3_0 = null;
        lo stackIn_6_0 = null;
        lo stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        lo stackIn_24_0 = null;
        lo stackIn_37_0 = null;
        lo stackIn_42_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) >= -65) {
                if (param0.charAt(0) == 34) {
                  if (param0.charAt(var2_int - 1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (-1 + var2_int > var4) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (92 == var5) {
                            L3: {
                              if (var3 != 0) {
                                stackIn_20_0 = 0;
                                break L3;
                              } else {
                                stackIn_20_0 = 1;
                                break L3;
                              }
                            }
                            var3 = stackIn_20_0;
                            break L2;
                          } else {
                            L4: {
                              if (var5 != 34) {
                                break L4;
                              } else {
                                if (var3 != 0) {
                                  break L4;
                                } else {
                                  stackIn_24_0 = wg.field_c;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_11_0 = wg.field_c;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var3 = param1 ? 1 : 0;
                  var4 = 0;
                  L5: while (true) {
                    if (var4 < var2_int) {
                      L6: {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                          if (-1 == qa.field_v.indexOf(var5)) {
                            stackIn_42_0 = wg.field_c;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L6;
                          }
                        } else {
                          L7: {
                            if (-1 == (var4 ^ -1)) {
                              break L7;
                            } else {
                              if (-1 + var2_int == var4) {
                                break L7;
                              } else {
                                if (var3 != 0) {
                                  break L7;
                                } else {
                                  var3 = 1;
                                  break L6;
                                }
                              }
                            }
                          }
                          stackIn_37_0 = wg.field_c;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L5;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackIn_6_0 = pi.field_r;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = la.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var2);

            stackIn_48_1 = new StringBuilder().append("h.W(");

            if (param0 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L8;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_37_0;
                } else {
                  return stackIn_42_0;
                }
              }
            }
          }
        }
    }

    final static void g(byte param0) {
        bn.field_q = new mh(0L, (mh) null);
        if (param0 != -24) {
            return;
        }
        if (vd.field_e) {
            bn.field_q.a(dn.field_N, 0);
        }
        bn.field_q.a(vn.field_A, 0);
        ap.field_b = new vj(fi.field_u, bn.field_q);
        fe.field_gb = new mh(0L, (mh) null);
        fe.field_gb.a(ap.field_b.field_d, 0);
        fe.field_gb.a(jf.field_k, 0);
        cg.b(param0 + 44);
    }

    static {
    }
}
