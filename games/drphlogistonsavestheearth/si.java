/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class si extends vg implements ba {
    static db field_A;
    vg field_z;
    static he[] field_G;
    static nh field_F;
    static boolean[] field_C;
    static vj field_E;
    static int field_B;
    static he field_D;

    void i(int param0) {
        if (param0 != 0) {
          L0: {
            field_G = (he[]) null;
            if (null != this.field_z) {
              this.field_z.e((byte) 38);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != this.field_z) {
              this.field_z.e((byte) 38);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 > 63) {
              L1: {
                if (null == this.field_z) {
                  break L1;
                } else {
                  if (!this.field_z.a(true)) {
                    break L1;
                  } else {
                    if (this.field_z.a(param0, param1, param2, 74)) {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5_int = param0;
              if (var5_int != 80) {
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L2: {
                  if (ck.field_f[81]) {
                    stackIn_13_0 = this.a(0, param2);
                    break L2;
                  } else {
                    stackIn_13_0 = this.a(param2, 6);
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("si.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, vg param4, int param5, int param6) {
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
              if (param2 > 43) {
                break L1;
              } else {
                si.f(-83);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_z) {
                  break L3;
                } else {
                  if (!this.field_z.a(true)) {
                    break L3;
                  } else {
                    if (!this.field_z.a(param0, param1, (byte) 113, param3, param4, param5, param6)) {
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

            stackIn_10_1 = new StringBuilder().append("si.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_7_0 != 0;
    }

    String e(int param0) {
        String var2;
        String var3;
        var2 = super.e(-93);
        if (null != this.field_z) {
          var3 = this.field_z.e(-71);
          if (var3 == null) {
            if (param0 <= -39) {
              return var2;
            } else {
              field_B = 63;
              return var2;
            }
          } else {
            return var3;
          }
        } else {
          if (param0 <= -39) {
            return var2;
          } else {
            field_B = 63;
            return var2;
          }
        }
    }

    vg h(int param0) {
        int var2;
        vg var3;
        var2 = -51 % ((-28 - param0) / 57);
        var3 = this.field_z;
        if (var3 != null) {
          if (!var3.a(true)) {
            return null;
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
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
              if (param3 > 113) {
                break L1;
              } else {
                field_E = (vj) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_z) {
                  break L3;
                } else {
                  if (!this.field_z.a(param0, param1, param2, (byte) 123, param4, param5 - -this.field_o, this.field_m + param6)) {
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

            stackIn_9_1 = new StringBuilder().append("si.JA(").append(param0).append(',');

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
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param1 == 0) {
          if (this.field_l != null) {
            this.field_l.a(true, param2 + 143, (vg) (this), param3, param0);
            if (param2 != -21) {
              L0: {
                field_G = (he[]) null;
                if (null != this.field_z) {
                  this.field_z.a(this.field_o + param0, param1, (byte) -21, this.field_m + param3);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                if (null != this.field_z) {
                  this.field_z.a(this.field_o + param0, param1, (byte) -21, this.field_m + param3);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            if (param2 != -21) {
              L2: {
                field_G = (he[]) null;
                if (null != this.field_z) {
                  this.field_z.a(this.field_o + param0, param1, (byte) -21, this.field_m + param3);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (null != this.field_z) {
                  this.field_z.a(this.field_o + param0, param1, (byte) -21, this.field_m + param3);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        } else {
          if (param2 != -21) {
            L4: {
              field_G = (he[]) null;
              if (null != this.field_z) {
                this.field_z.a(this.field_o + param0, param1, (byte) -21, this.field_m + param3);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            L5: {
              if (null != this.field_z) {
                this.field_z.a(this.field_o + param0, param1, (byte) -21, this.field_m + param3);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    private final boolean a(vg param0, int param1) {
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
              if (param1 == 6) {
                break L1;
              } else {
                field_B = -60;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_z) {
                  break L3;
                } else {
                  if (this.field_z.a(true)) {
                    break L3;
                  } else {
                    if (!this.field_z.a(false, param0)) {
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

            stackIn_10_1 = new StringBuilder().append("si.O(");

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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
            if (param3 == -10612) {
              L1: {
                if (this.a(param1, param2, param0, 92)) {
                  this.a(param2, (byte) 89, param0, param1);
                  this.a(10, param2, param0, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = (StringBuilder) (param2);
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

            stackIn_10_1 = new StringBuilder().append("si.WA(").append(param0).append(',');

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 3) {
          L0: {
            field_F = (nh) null;
            if (null == this.field_z) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = this.field_z.d(3);
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null == this.field_z) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = this.field_z.d(3);
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    si(int param0, int param1, int param2, int param3, cg param4, fd param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            discarded$3 = param1.append((char)param0);
            var5_int = 0;
            L1: while (true) {
              if (param2 < var5_int) {
                if (this.field_z == null) {
                  discarded$4 = param1.append("null");
                  break L0;
                } else {
                  this.field_z.a(param2 - -1, param3, param1, -10612);
                  return;
                }
              } else {
                discarded$5 = param1.append(' ');
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("si.L(").append(param0).append(',');

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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    final void c(byte param0) {
        int var2;
        if (this.field_z != null) {
          this.field_z.c((byte) -93);
          var2 = -113 / ((-10 - param0) / 51);
          return;
        } else {
          var2 = -113 / ((-10 - param0) / 51);
          return;
        }
    }

    final static void f(int param0) {
        cj.field_h = new he[8];
        cj.field_h[4] = od.field_k;
        cj.field_h[2] = ri.field_b;
        cj.field_h[1] = re.field_d;
        cj.field_h[0] = fa.field_o;
        if (param0 != 10) {
          return;
        } else {
          cj.field_h[5] = qc.field_a;
          cj.field_h[6] = p.field_e;
          cj.field_h[3] = of.field_x;
          cj.field_h[7] = c.field_a[0];
          return;
        }
    }

    private final boolean a(int param0, vg param1) {
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
                field_D = (he) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_z) {
                  break L3;
                } else {
                  if (this.field_z.a(true)) {
                    break L3;
                  } else {
                    if (!this.field_z.a(false, param1)) {
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

            stackIn_10_1 = new StringBuilder().append("si.K(").append(param0).append(',');

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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return null != this.h(115) ? true : false;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        vg var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -128);
              if (param3 <= -127) {
                break L1;
              } else {
                var6 = (vg) null;
                this.a(22, (vg) null, -5, (byte) 124, 57, 35, -88);
                break L1;
              }
            }
            if (null != this.field_z) {
              this.field_z.a(param0, param1 - -this.field_o, this.field_m + param2, (byte) -128);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("si.I(");

            if (param0 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(0);
    }

    public static void g(int param0) {
        field_F = null;
        field_C = null;
        field_E = null;
        if (param0 != 6714) {
          si.f(94);
          field_A = null;
          field_D = null;
          field_G = null;
          return;
        } else {
          field_A = null;
          field_D = null;
          field_G = null;
          return;
        }
    }

    void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
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
              if (!param5) {
                break L1;
              } else {
                this.a(-71, 74, (byte) -81, 61);
                break L1;
              }
            }
            if (null != this.field_z) {
              this.field_z.a(param0 - -this.field_o, this.field_m + param1, param2, param3, param4, false);
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

            stackIn_8_1 = new StringBuilder().append("si.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(boolean param0, vg param1) {
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
            if (!param0) {
              L1: {
                L2: {
                  if (this.field_z == null) {
                    break L2;
                  } else {
                    if (!this.field_z.a(param0, param1)) {
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

            stackIn_10_1 = new StringBuilder().append("si.M(").append(param0).append(',');

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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    static {
        field_A = new db(2);
        field_C = new boolean[]{false, false, false, false};
    }
}
