/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jk extends we implements ga {
    static int field_B;
    static int field_A;
    static gk field_z;
    static li[] field_C;
    static a field_x;
    static String[] field_y;
    static int field_u;
    we field_v;
    static int field_w;

    String a(byte param0) {
        String var3 = null;
        String var2 = super.a(param0);
        if (this.field_v != null) {
            var3 = this.field_v.a((byte) 54);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(we param0, boolean param1) {
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
              if (!param1) {
                break L1;
              } else {
                this.e(109);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_v == null) {
                  break L3;
                } else {
                  if (!this.field_v.a(param0, param1)) {
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

            stackIn_9_1 = new StringBuilder().append("jk.AA(");

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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    we a(int param0) {
        we var2 = this.field_v;
        if (var2 != null && var2.b((byte) 72)) {
            return var2;
        }
        if (param0 == -1) {
            return null;
        }
        field_x = (a) null;
        return null;
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            field_C = (li[]) null;
        }
        return null != this.a(-1) ? true : false;
    }

    void i(int param0) {
        if (param0 != -2) {
            field_u = 112;
        }
        if (this.field_v != null) {
            this.field_v.g(-1);
        }
    }

    private final boolean a(byte param0, we param1) {
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
              if (param0 < -18) {
                break L1;
              } else {
                field_C = (li[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_v == null) {
                  break L3;
                } else {
                  if (this.field_v.b((byte) 74)) {
                    break L3;
                  } else {
                    if (!this.field_v.a(param1, false)) {
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

            stackIn_10_1 = new StringBuilder().append("jk.G(").append(param0).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param2, (byte) -122, param3, param1)) {
                break L1;
              } else {
                this.a(param2, param3, param1, -37);
                this.b(param2, -25844, param1, param3);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                jk.a(44, true, 113);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jk.T(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    private final boolean a(int param0, we param1) {
        RuntimeException var3 = null;
        we var4 = null;
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
              if (param0 < -11) {
                break L1;
              } else {
                var4 = (we) null;
                this.a(-19, -80, (we) null, 5, 102, 80);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_v) {
                  break L3;
                } else {
                  if (this.field_v.b((byte) 79)) {
                    break L3;
                  } else {
                    if (!this.field_v.a(param1, false)) {
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

            stackIn_10_1 = new StringBuilder().append("jk.K(").append(param0).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    jk(int param0, int param1, int param2, int param3, ml param4, of param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
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
              if (param3 == -1625) {
                break L1;
              } else {
                field_B = -20;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_v) {
                  break L3;
                } else {
                  if (!this.field_v.a(this.field_e + param0, param1, param2, -1625, param4, param5, param6 - -this.field_r)) {
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

            stackIn_9_1 = new StringBuilder().append("jk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (-1 == (param1 ^ -1) && null != this.field_h) {
            this.field_h.a(true, (we) (this), param2, param3, 20);
        }
        if (param0 != 30) {
            return;
        }
        if (this.field_v != null) {
            this.field_v.a(30, param1, this.field_e + param2, this.field_r + param3);
        }
    }

    final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$22 = param2.append('\n');
              if (param1 == -25844) {
                break L1;
              } else {
                field_A = 50;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int > param3) {
                L3: {
                  if (null == this.field_v) {
                    discarded$23 = param2.append("null");
                    break L3;
                  } else {
                    this.field_v.a(false, param2, param0, param3 + 1);
                    break L3;
                  }
                }
                break L0;
              } else {
                discarded$24 = param2.append(' ');
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

            stackIn_12_1 = new StringBuilder().append("jk.J(");

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
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        field_y = null;
        if (param0 != 77) {
            return;
        }
        field_z = null;
        field_x = null;
        field_C = null;
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -14);
              if (param3 <= -13) {
                break L1;
              } else {
                this.a(24);
                break L1;
              }
            }
            L2: {
              if (this.field_v != null) {
                this.field_v.a(param0, param1 - -this.field_e, this.field_r + param2, (byte) -86);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jk.E(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            return -59;
        }
        return this.field_v == null ? 0 : this.field_v.f(param0 ^ 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(-2);
    }

    final void e(int param0) {
        if (param0 != 13104) {
            this.a(49, -102, 107, 123);
        }
        if (null != this.field_v) {
            this.field_v.e(param0 ^ 0);
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
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
              if (this.field_v == null) {
                break L1;
              } else {
                if (!this.field_v.b((byte) 126)) {
                  break L1;
                } else {
                  if (this.field_v.a(param0, param1, param2, 124)) {
                    stackIn_5_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5_int = param2;
            if (80 == var5_int) {
              L2: {
                if (dl.field_c[81]) {
                  stackIn_11_0 = this.a((byte) -94, param0);
                  break L2;
                } else {
                  stackIn_11_0 = this.a(-12, param0);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var5_int = 9 % ((37 - param3) / 50);
              stackIn_13_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("jk.V(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        boolean discarded$1 = false;
        we var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_v) {
                break L1;
              } else {
                this.field_v.a(param0 + this.field_e, param1, param2, param3, 0, this.field_r + param5);
                break L1;
              }
            }
            L2: {
              if (param4 == 0) {
                break L2;
              } else {
                var8 = (we) null;
                discarded$1 = this.a((byte) -34, (we) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("jk.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        String[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        String[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        String stackIn_78_2 = null;
        String[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        String stackIn_85_2 = null;
        int stackIn_91_0 = 0;
        String stackIn_91_1 = null;
        int stackIn_92_0 = 0;
        String stackIn_92_1 = null;
        int stackIn_92_2 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              wd.field_g = true;
              ud.field_b = param2;
              if (0 != ud.field_b) {
                if (-2 != (ud.field_b ^ -1)) {
                  if ((ud.field_b ^ -1) == -3) {
                    var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[]{"<br><%0><br>"}, pd.field_h, true), true, vi.field_b);
                    var4 = -1;
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        if (var5 >= var3_int) {
                          break L3;
                        } else {
                          if ("<%0>".equals(vi.field_b[var5])) {
                            var4 = var5;
                            break L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      }
                      if ((var4 ^ -1) == 0) {
                        throw new IllegalStateException();
                      } else {
                        wi.field_b = new String[var4];
                        gl.a(vi.field_b, 0, wi.field_b, 0, var4);
                        ud.field_e = new String[-1 + var3_int + -var4];
                        gl.a(vi.field_b, 1 + var4, ud.field_e, 0, var3_int + -var4 - 1);
                        var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[]{"<br><%0><br>"}, wa.field_d, true), true, vi.field_b);
                        var4 = -1;
                        var5 = 0;
                        L4: while (true) {
                          L5: {
                            if (var3_int <= var5) {
                              break L5;
                            } else {
                              if ("<%0>".equals(vi.field_b[var5])) {
                                var4 = var5;
                                break L5;
                              } else {
                                var5++;
                                continue L4;
                              }
                            }
                          }
                          if (0 == (var4 ^ -1)) {
                            throw new IllegalStateException();
                          } else {
                            L6: {
                              uj.field_c = new String[var4];
                              gl.a(vi.field_b, 0, uj.field_c, 0, var4);
                              re.field_a = new String[var3_int - (var4 - -1)];
                              gl.a(vi.field_b, 1 + var4, re.field_a, 0, -1 + var3_int + -var4);
                              if (uj.field_c.length > wi.field_b.length) {
                                stackIn_67_0 = uj.field_c.length;
                                break L6;
                              } else {
                                stackIn_67_0 = wi.field_b.length;
                                break L6;
                              }
                            }
                            L7: {
                              var5 = stackIn_67_0;
                              if (ud.field_e.length >= re.field_a.length) {
                                stackIn_70_0 = ud.field_e.length;
                                break L7;
                              } else {
                                stackIn_70_0 = re.field_a.length;
                                break L7;
                              }
                            }
                            var6 = stackIn_70_0;
                            var7 = var6 + (var5 + 7);
                            gh.field_a = new int[var7];
                            pl.field_k = new String[var7];
                            var8 = 0;
                            L8: while (true) {
                              if (var8 >= var7) {
                                bi.field_B = new int[2];
                                pl.field_k[0] = qb.field_d;
                                gh.field_a[1] = 0;
                                pl.field_k[1] = jf.field_p;
                                gh.field_a[3] = 1;
                                pl.field_k[4] = sk.field_F;
                                bi.field_B[1] = 2;
                                pl.field_k[2] = ua.field_y;
                                bi.field_B[0] = 5;
                                pl.field_k[3] = uf.field_c;
                                pl.field_k[5] = "";
                                var8 = 0;
                                L9: while (true) {
                                  if (var5 <= var8) {
                                    pl.field_k[6 - -var5] = null;
                                    gh.field_a[var5 + 6] = -2;
                                    var8 = 0;
                                    L10: while (true) {
                                      if (var6 <= var8) {
                                        fb.field_n = pf.a(0);
                                        break L1;
                                      } else {
                                        stackIn_82_0 = pl.field_k;
                                        stackIn_82_1 = var8 + 7 + var5;
                                        stackIn_82_2 = re.field_a.length;
                                        stackIn_82_3 = var8;
                                        L11: {




                                          if (stackIn_82_2 <= stackIn_82_3) {
                                            stackIn_82_0 = (String[]) ((Object) stackIn_82_0);

                                            stackIn_85_2 = "";
                                            break L11;
                                          } else {
                                            stackIn_82_0 = (String[]) ((Object) stackIn_82_0);

                                            stackIn_85_2 = re.field_a[var8];
                                            break L11;
                                          }
                                        }
                                        stackIn_82_0[stackIn_82_1] = stackIn_85_2;
                                        var8++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    L12: {
                                      stackIn_77_0 = pl.field_k;

                                      stackIn_77_1 = var8 + 6;

                                      if (0 <= -var5 + var8 + uj.field_c.length) {
                                        stackIn_78_0 = (String[]) ((Object) stackIn_77_0);
                                        stackIn_78_1 = stackIn_77_1;
                                        stackIn_78_2 = uj.field_c[uj.field_c.length + var8 - var5];
                                        break L12;
                                      } else {
                                        stackIn_78_0 = (String[]) ((Object) stackIn_77_0);
                                        stackIn_78_1 = stackIn_77_1;
                                        stackIn_78_2 = "";
                                        break L12;
                                      }
                                    }
                                    stackIn_78_0[stackIn_78_1] = stackIn_78_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                gh.field_a[var8] = -1;
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (ud.field_b != 3) {
                      if ((ud.field_b ^ -1) != -5) {
                        if (ud.field_b == 5) {
                          var3_int = aa.a(fe.field_a, rk.field_h, mg.field_r, true, vi.field_b);
                          var4 = 3 + var3_int;
                          gh.field_a = new int[var4];
                          pl.field_k = new String[var4];
                          var5 = 0;
                          L13: while (true) {
                            if (var4 <= var5) {
                              bi.field_B = new int[2];
                              var5 = 0;
                              L14: while (true) {
                                if (var5 >= var3_int) {
                                  pl.field_k[var4 - 3] = "";
                                  pl.field_k[var4 + -2] = j.field_b;
                                  gh.field_a[var4 + -2] = 0;
                                  bi.field_B[0] = 3;
                                  pl.field_k[var4 - 1] = db.field_e;
                                  gh.field_a[-1 + var4] = 1;
                                  bi.field_B[1] = 5;
                                  break L1;
                                } else {
                                  pl.field_k[var5] = vi.field_b[var5];
                                  var5++;
                                  continue L14;
                                }
                              }
                            } else {
                              gh.field_a[var5] = -1;
                              var5++;
                              continue L13;
                            }
                          }
                        } else {
                          throw new IllegalArgumentException();
                        }
                      } else {
                        var3_int = aa.a(fe.field_a, rk.field_h, pd.field_e, true, vi.field_b);
                        var4 = var3_int + 2;
                        pl.field_k = new String[var4];
                        gh.field_a = new int[var4];
                        var5 = 0;
                        L15: while (true) {
                          if (var4 <= var5) {
                            bi.field_B = new int[1];
                            var5 = 0;
                            L16: while (true) {
                              if (var3_int <= var5) {
                                pl.field_k[-2 + var4] = "";
                                pl.field_k[-1 + var4] = db.field_e;
                                gh.field_a[-1 + var4] = 0;
                                bi.field_B[0] = 5;
                                break L1;
                              } else {
                                pl.field_k[var5] = vi.field_b[var5];
                                var5++;
                                continue L16;
                              }
                            }
                          } else {
                            gh.field_a[var5] = -1;
                            var5++;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      L17: {
                        if (rc.field_k.field_q) {
                          var3_int = aa.a(fe.field_a, rk.field_h, uc.field_d, true, vi.field_b);
                          break L17;
                        } else {
                          var3_int = aa.a(fe.field_a, rk.field_h, ld.field_b, true, vi.field_b);
                          break L17;
                        }
                      }
                      var4 = 2 - -var3_int;
                      gh.field_a = new int[var4];
                      pl.field_k = new String[var4];
                      var5 = 0;
                      L18: while (true) {
                        if (var5 >= var4) {
                          bi.field_B = new int[1];
                          var5 = 0;
                          L19: while (true) {
                            if (var3_int <= var5) {
                              pl.field_k[var4 + -2] = "";
                              pl.field_k[var4 + -1] = db.field_e;
                              gh.field_a[-1 + var4] = 0;
                              bi.field_B[0] = 5;
                              break L1;
                            } else {
                              pl.field_k[var5] = vi.field_b[var5];
                              var5++;
                              continue L19;
                            }
                          }
                        } else {
                          gh.field_a[var5] = -1;
                          var5++;
                          continue L18;
                        }
                      }
                    }
                  }
                } else {
                  var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
                  var4 = var3_int + 2;
                  pl.field_k = new String[var4];
                  gh.field_a = new int[var4];
                  var5 = 0;
                  L20: while (true) {
                    if (var4 <= var5) {
                      bi.field_B = new int[1];
                      var5 = 0;
                      L21: while (true) {
                        if (var5 >= var3_int) {
                          pl.field_k[-2 + var4] = "";
                          pl.field_k[-1 + var4] = db.field_e;
                          gh.field_a[var4 + -1] = 0;
                          bi.field_B[0] = 5;
                          break L1;
                        } else {
                          pl.field_k[var5] = vi.field_b[var5];
                          var5++;
                          continue L21;
                        }
                      }
                    } else {
                      gh.field_a[var5] = -1;
                      var5++;
                      continue L20;
                    }
                  }
                }
              } else {
                var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
                var4 = 3 - -var3_int;
                gh.field_a = new int[var4];
                pl.field_k = new String[var4];
                var5 = 0;
                L22: while (true) {
                  if (var4 <= var5) {
                    bi.field_B = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var5 >= var3_int) {
                        pl.field_k[-3 + var4] = "";
                        pl.field_k[var4 - 2] = qd.field_d;
                        gh.field_a[-2 + var4] = 0;
                        bi.field_B[0] = 4;
                        pl.field_k[-1 + var4] = db.field_e;
                        gh.field_a[-1 + var4] = 1;
                        bi.field_B[1] = 5;
                        break L1;
                      } else {
                        pl.field_k[var5] = vi.field_b[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    gh.field_a[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            sj.field_f.field_i = bi.field_B.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= pl.field_k.length) {
                L25: {
                  if ((ud.field_b ^ -1) != -3) {
                    break L25;
                  } else {
                    var10 = wi.field_b;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var10.length <= var5) {
                        var4_ref_String__ = ud.field_e;
                        var5 = 0;
                        L27: while (true) {
                          if (var5 >= var4_ref_String__.length) {
                            break L25;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = hh.a((byte) -126, var12, false);
                            if ((var3_int ^ -1) > (var7 ^ -1)) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        var11 = var10[var5];
                        var7 = hh.a((byte) -109, var11, false);
                        if ((var7 ^ -1) < (var3_int ^ -1)) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  }
                }
                h.field_b = -(var3_int >> 47297697) + (jc.field_b - -var3_int);
                sc.field_g = jc.field_b + -(var3_int >> -1788205887);
                fd.field_s = (ud.field_a + vf.field_b << -144221503) * sj.field_f.field_i;
                if (param0 < -92) {
                  var4 = 0;
                  L28: while (true) {
                    if (pl.field_k.length <= var4) {
                      fb.field_k = -(fd.field_s >> 1811966177) + fl.field_b;
                      ja.field_A = new int[pl.field_k.length][];
                      var4 = 0;
                      var5 = fb.field_k;
                      L29: while (true) {
                        if (pl.field_k.length <= var4) {
                          L30: {
                            if ((ud.field_b ^ -1) == -3) {
                              sj.field_f.a(-1, -1, 0, param1);
                              break L30;
                            } else {
                              sj.field_f.a(0, q.a(p.field_a, (byte) -36, ei.field_a), 0, param1);
                              break L30;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L31: {
                            var6 = gh.field_a[var4];
                            if (var6 < 0) {
                              var5 = var5 + gi.field_a;
                              break L31;
                            } else {
                              var7 = hh.a((byte) -115, pl.field_k[var4], true);
                              var8 = jc.field_b - (var7 >> 1881197345);
                              var5 = var5 + ud.field_a;
                              ja.field_A[var4] = new int[4];
                              ja.field_A[var4][0] = -pl.field_h + var8;
                              ja.field_A[var4][1] = var5;
                              ja.field_A[var4][2] = (pl.field_h << 387895873) + var7;
                              var5 = var5 + ((vf.field_b << 369803937) + (ud.field_a + hb.field_n));
                              ja.field_A[var4][3] = hb.field_n - -(vf.field_b << 1498607393);
                              break L31;
                            }
                          }
                          var4++;
                          continue L29;
                        }
                      }
                    } else {
                      L32: {
                        stackIn_112_0 = fd.field_s;

                        if ((gh.field_a[var4] ^ -1) <= -1) {
                          stackIn_113_0 = stackIn_112_0;
                          stackIn_113_1 = hb.field_n;
                          break L32;
                        } else {
                          stackIn_113_0 = stackIn_112_0;
                          stackIn_113_1 = gi.field_a;
                          break L32;
                        }
                      }
                      fd.field_s = stackIn_113_0 + stackIn_113_1;
                      var4++;
                      continue L28;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L33: {
                  stackIn_91_0 = -108;

                  stackIn_91_1 = pl.field_k[var4];

                  if (gh.field_a[var4] < 0) {
                    stackIn_92_0 = stackIn_91_0;
                    stackIn_92_1 = (String) ((Object) stackIn_91_1);
                    stackIn_92_2 = 0;
                    break L33;
                  } else {
                    stackIn_92_0 = stackIn_91_0;
                    stackIn_92_1 = (String) ((Object) stackIn_91_1);
                    stackIn_92_2 = 1;
                    break L33;
                  }
                }
                var5 = hh.a((byte) stackIn_92_0, stackIn_92_1, stackIn_92_2 != 0);
                if (var3_int < var5) {
                  var3_int = var5;
                  var4++;
                  continue L24;
                } else {
                  var4++;
                  continue L24;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), "jk.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        we var9 = null;
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
              if (param6 < -109) {
                break L1;
              } else {
                var9 = (we) null;
                discarded$1 = this.a((byte) -23, (we) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_v) {
                  break L3;
                } else {
                  if (!this.field_v.b((byte) 43)) {
                    break L3;
                  } else {
                    if (!this.field_v.a(param0, param1, param2, param3, param4, param5, -127)) {
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

            stackIn_10_1 = new StringBuilder().append("jk.F(").append(param0).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_B = 0;
        field_A = 3;
        field_y = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_C = new li[field_A];
        field_u = 0;
        field_w = 0;
    }
}
