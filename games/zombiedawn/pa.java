/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pa extends ga implements jf {
    static ul field_y;
    ga field_z;
    static String field_C;
    static va[] field_x;
    static int field_B;
    static String field_A;

    final static void a(int param0) {
        uf var1 = (uf) ((Object) rm.field_d.a(0));
        if (var1 == null) {
            throw new IllegalStateException();
        }
        bi.a(var1.field_p, var1.field_l, var1.field_i);
        bi.f(var1.field_j, var1.field_m, var1.field_h, var1.field_k);
        var1.field_p = null;
        ad.field_h.a(0, var1);
        if (param0 != -21189) {
            field_x = (va[]) null;
        }
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        StringBuilder discarded$30 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              discarded$28 = param2.append('\n');
              if (param3 == -10643) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int > param1) {
                L3: {
                  if (this.field_z != null) {
                    this.field_z.a(param0, param2, true, 1 + param1);
                    break L3;
                  } else {
                    discarded$29 = param2.append("null");
                    break L3;
                  }
                }
                break L0;
              } else {
                discarded$30 = param2.append(' ');
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pa.FA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        RuntimeException var5 = null;
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
              if (this.a(param0, param1, 11098, param3)) {
                this.a(param0, param3, 81, param1);
                this.a(param0, param3, param1, -10643);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2) {
                break L2;
              } else {
                field_A = (String) null;
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("pa.NA(");

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    void a(ga param0, byte param1, int param2, int param3) {
        try {
            super.a(param0, (byte) 116, param2, param3);
            if (!(this.field_z == null)) {
                this.field_z.a(param0, (byte) 100, param2 - -this.field_j, param3 - -this.field_k);
            }
            int var5_int = -88 / ((param1 - 46) / 42);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "pa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
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
              if (param5) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_z == null) {
                  break L3;
                } else {
                  if (!this.field_z.e(-17741)) {
                    break L3;
                  } else {
                    if (!this.field_z.a(param0, param1, param2, param3, param4, param5, param6)) {
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

            stackIn_10_1 = new StringBuilder().append("pa.OA(");

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
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static int a(ji param0, ji param1, byte param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -90) {
              var4 = (String) null;
              stackIn_4_0 = bg.a(105, 0, param1, (String) null, param0, 0, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 7;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("pa.W(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(95, param1, param2, param3, param4);
        int var6 = 116 % ((param0 - -23) / 48);
        this.b(true);
    }

    public static void d(byte param0) {
        field_C = null;
        field_A = null;
        field_x = null;
        int var1 = 114 / ((param0 - -38) / 40);
        field_y = null;
    }

    final static void a(String param0, boolean param1) {
        try {
            if (param1) {
                String var3 = (String) null;
                pa.a((String) null, (byte) -10);
            }
            ia.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "pa.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, ga param1) {
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
              if (param0 == 0) {
                break L1;
              } else {
                field_y = (ul) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_z) {
                  break L3;
                } else {
                  if (this.field_z.e(-17741)) {
                    break L3;
                  } else {
                    if (!this.field_z.a((byte) 68, param1)) {
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

            stackIn_10_1 = new StringBuilder().append("pa.U(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    String d(int param0) {
        String var4 = null;
        String var2 = super.d(95);
        int var3 = -23 % ((10 - param0) / 58);
        if (!(this.field_z == null)) {
            var4 = this.field_z.d(119);
            if (!(var4 == null)) {
                return var4;
            }
        }
        return var2;
    }

    final void c(byte param0) {
        if (param0 != 57) {
            field_x = (va[]) null;
        }
        if (!(null == this.field_z)) {
            this.field_z.c((byte) 57);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param3 == param1) {
            if (!(null == this.field_h)) {
                this.field_h.a(param3 ^ 16777215, true, param0, (ga) (this), param2);
            }
        }
        if (null != this.field_z) {
            this.field_z.a(param0 - -this.field_j, param1, this.field_k + param2, 0);
        }
    }

    final boolean e(int param0) {
        if (param0 != -17741) {
            ga var3 = (ga) null;
            this.a(-104, 60, -60, -9, -111, (ga) null);
        }
        return null != this.f(-6) ? true : false;
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
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
              if (null == this.field_z) {
                break L1;
              } else {
                if (!this.field_z.e(-17741)) {
                  break L1;
                } else {
                  if (!this.field_z.a(31, param1, param2, param3)) {
                    break L1;
                  } else {
                    stackIn_4_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            var5_int = param1;
            if (80 != var5_int) {
              var5_int = 45 % ((-83 - param0) / 32);
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L2: {
                if (!bo.field_p[81]) {
                  stackIn_9_0 = this.b(-49, param2);
                  break L2;
                } else {
                  stackIn_9_0 = this.a(0, param2);
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

            stackIn_14_1 = new StringBuilder().append("pa.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
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

    private final boolean b(int param0, ga param1) {
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
            if (param0 < -8) {
              L1: {
                L2: {
                  if (this.field_z == null) {
                    break L2;
                  } else {
                    if (this.field_z.e(-17741)) {
                      break L2;
                    } else {
                      if (!this.field_z.a((byte) 82, param1)) {
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
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("pa.HA(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    pa(int param0, int param1, int param2, int param3, io param4, sk param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    ga f(int param0) {
        if (param0 >= -2) {
            String var3 = (String) null;
            pa.a((String) null, true);
        }
        ga var2 = this.field_z;
        if (var2 == null) {
            return null;
        }
        if (!(!var2.e(-17741))) {
            return var2;
        }
        return null;
    }

    final static oh a(String param0, byte param1) {
        String var2 = null;
        oh var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        oh stackIn_9_0 = null;
        oh stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (nk.field_a != null) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var2 = fm.a(var6, -85);
                if (var2 == null) {
                  var2 = param0;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = (oh) ((Object) nk.field_a.a(93, (long)var2.hashCode()));
              if (param1 == -66) {
                L2: while (true) {
                  if (var3 != null) {
                    L3: {
                      var7 = (CharSequence) ((Object) var3.field_lb);
                      var4 = fm.a(var7, param1 ^ 44);
                      if (var4 != null) {
                        break L3;
                      } else {
                        var4 = var3.field_lb;
                        break L3;
                      }
                    }
                    if (!var4.equals(var2)) {
                      var3 = (oh) ((Object) nk.field_a.b((byte) -117));
                      continue L2;
                    } else {
                      stackIn_16_0 = (oh) (var3);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_9_0 = (oh) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("pa.V(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_16_0;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
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
              if (null != this.field_z) {
                this.field_z.a(this.field_k + param0, 39, param2, param3, this.field_j + param4, param5);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 > 1) {
                break L2;
              } else {
                field_B = -125;
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

            stackIn_8_1 = new StringBuilder().append("pa.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean a(byte param0, ga param1) {
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
              if (param0 > 67) {
                break L1;
              } else {
                this.a(-106, -102, 57, -16, -81);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_z == null) {
                  break L3;
                } else {
                  if (!this.field_z.a((byte) 105, param1)) {
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

            stackIn_9_1 = new StringBuilder().append("pa.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void b(boolean param0) {
        if (this.field_z != null) {
            this.field_z.a(true);
        }
        if (!param0) {
            this.e(-64);
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
            ji var3 = (ji) null;
            pa.a((ji) null, (ji) null, (byte) -97);
        }
        return this.field_z == null ? 0 : this.field_z.c(param0 ^ 0);
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        RuntimeException var8 = null;
        StringBuilder var9 = null;
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
              if (param1 == 1) {
                break L1;
              } else {
                var9 = (StringBuilder) null;
                this.a((Hashtable) null, 57, (StringBuilder) null, -16);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_z) {
                  break L3;
                } else {
                  if (!this.field_z.a(param0, param1 ^ 0, this.field_j + param2, param3, this.field_k + param4, param5, param6)) {
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

            stackIn_9_1 = new StringBuilder().append("pa.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    static {
        field_C = "QUAKE";
        field_B = 40;
        field_x = new va[]{};
        field_A = "Options";
    }
}
