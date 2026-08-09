/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ch extends ei implements lj {
    static hj field_K;
    ko field_F;
    static String field_L;
    static int field_G;
    static int[] field_J;
    static int field_H;
    static int field_I;
    static int[] field_M;

    final boolean d(int param0) {
        int var2 = 22 / ((7 - param0) / 48);
        return null != this.f((byte) 117) ? true : false;
    }

    ei f(byte param0) {
        aa var2;
        int var3;
        ei var4;
        var3 = 90 / ((param0 - 51) / 61);
        var2 = new aa(this.field_F);
        var4 = (ei) ((Object) var2.b((byte) -92));
        L0: while (true) {
          if (var4 != null) {
            if (!var4.d(83)) {
              var4 = (ei) ((Object) var2.b(-87));
              continue L0;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(ei param0, byte param1) {
        aa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ei var5 = null;
        int stackIn_4_0 = 0;
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
            var3 = new aa(this.field_F);
            var4 = -98 / ((param1 - -43) / 47);
            var5 = (ei) ((Object) var3.b((byte) -92));
            L1: while (true) {
              if (var5 == null) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var5.a(param0, (byte) 72)) {
                  var5 = (ei) ((Object) var3.b(-125));
                  continue L1;
                } else {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("ch.M(");

            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    private final void a(byte param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        aa var5 = null;
        int var6 = 0;
        ei var7 = null;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            var5 = new aa(this.field_F);
            var6 = 16 / ((22 - param0) / 49);
            var7 = (ei) ((Object) var5.b((byte) -92));
            L1: while (true) {
              if (var7 == null) {
                break L0;
              } else {
                discarded$3 = param1.append('\n');
                var8 = 0;
                L2: while (true) {
                  if (param2 < var8) {
                    var7.a(param1, 1 + param2, param3, 104);
                    var7 = (ei) ((Object) var5.b(-88));
                    continue L1;
                  } else {
                    discarded$4 = param1.append(' ');
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5_ref);

            stackIn_9_1 = new StringBuilder().append("ch.OA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        aa var8 = null;
        RuntimeException var8_ref = null;
        ei var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              var8 = new aa(this.field_F);
              if (param2) {
                break L1;
              } else {
                field_H = 45;
                break L1;
              }
            }
            var9 = (ei) ((Object) var8.b((byte) -92));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(-109)) {
                    break L3;
                  } else {
                    if (var9.a(param0, param1 - -this.field_C, true, param3, param4, this.field_D + param5, param6)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9 = (ei) ((Object) var8.b(-119));
                      continue L2;
                    }
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("ch.AA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        aa var5 = null;
        ei var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = Pool.field_O;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new aa(this.field_F);
            var6 = (ei) ((Object) var5.b((byte) -92));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(-107)) {
                    break L2;
                  } else {
                    var6.a(param0, param1 ^ 0, param2 - -this.field_C, this.field_D + param3);
                    var6 = (ei) ((Object) var5.b(-89));
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("ch.S(");

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
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        aa var7 = null;
        ei var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              var7 = new aa(this.field_F);
              var8 = (ei) ((Object) var7.b((byte) -92));
              if (param4 > 62) {
                break L1;
              } else {
                field_I = 75;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.b(-128)) {
                    break L3;
                  } else {
                    var8.a(param0 - -this.field_C, param1, this.field_D + param2, param3, (byte) 94, param5);
                    var8 = (ei) ((Object) var7.b(-82));
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7_ref);

            stackIn_9_1 = new StringBuilder().append("ch.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void d(byte param0) {
        int var4 = Pool.field_O;
        aa var2 = new aa(this.field_F);
        ei var3 = (ei) ((Object) var2.b((byte) -92));
        if (param0 != 99) {
            field_J = (int[]) null;
        }
        while (var3 != null) {
            var3.d((byte) 99);
            var3 = (ei) ((Object) var2.b(-90));
        }
    }

    final static void a(boolean param0, oj param1, int param2) {
        oq stackIn_2_0 = null;
        oq stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        oq stackIn_5_0 = null;
        oq stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        oq var6 = null;
        oq var7 = null;
        try {
          L0: {
            L1: {
              var6 = ej.field_j;
              var7 = var6;
              var7.b(false, param2);
              var7.field_v = var7.field_v + 1;
              var4 = var7.field_v;
              var7.a(1, false);
              var7.a((byte) -81, param1.field_B);
              var7.a((byte) -81, param1.field_l);
              var7.a((byte) -81, param1.field_p);
              var7.a(true, param1.field_n);
              stackIn_2_0 = (oq) (var7);

              if (param0) {
                stackIn_3_0 = (oq) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (oq) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            L2: {
              ((oq) (Object) stackIn_3_0).a(stackIn_3_1 != 0, param1.field_x);
              stackIn_5_0 = (oq) (var7);

              if (param0) {
                stackIn_6_0 = (oq) ((Object) stackIn_5_0);
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = (oq) ((Object) stackIn_5_0);
                stackIn_6_1 = 1;
                break L2;
              }
            }
            ((oq) (Object) stackIn_6_0).a(stackIn_6_1 != 0, param1.field_A);
            var7.a(true, param1.field_v);
            var7.a(param1.field_z.length, param0);
            var5 = 0;
            L3: while (true) {
              if (param1.field_z.length <= var5) {
                var7.d(-1, var4);
                var7.b(-var4 + var7.field_v, true);
                break L0;
              } else {
                var6.a(true, param1.field_z[var5]);
                var5++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ch.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param0 == 0 && this.field_z != null) {
            this.field_z.a(true, param2, (byte) 105, param3, (ei) (this));
        }
        aa var5 = new aa(this.field_F);
        ei var6 = (ei) ((Object) var5.a(0));
        while (var6 != null) {
            var6.a(param0, (byte) 92, param2 + this.field_C, this.field_D + param3);
            var6 = (ei) ((Object) var5.c((byte) -71));
        }
        int var7 = 69 / ((-42 - param1) / 53);
    }

    final boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        aa var8 = null;
        RuntimeException var8_ref = null;
        ei var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              var8 = new aa(this.field_F);
              if (param4 < -126) {
                break L1;
              } else {
                this.g(-115);
                break L1;
              }
            }
            var9 = (ei) ((Object) var8.b((byte) -92));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(-116)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.d(-122)) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, (byte) -127, param5, param6)) {
                          break L4;
                        } else {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (ei) ((Object) var8.b(-103));
                    continue L2;
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("ch.WA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void a(boolean param0, ei param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_F.b((byte) -123, param1);
              if (param0) {
                break L1;
              } else {
                field_I = -128;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ch.RA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void g(int param0) {
        aa var2 = new aa(this.field_F);
        if (param0 != 22555) {
            Hashtable var4 = (Hashtable) null;
            this.a((StringBuilder) null, -32, (Hashtable) null, 81);
        }
        ei var3 = (ei) ((Object) var2.b((byte) -92));
        while (var3 != null) {
            var3.e((byte) -119);
            var3 = (ei) ((Object) var2.b(-94));
        }
    }

    String e(int param0) {
        String var4 = null;
        int var5 = Pool.field_O;
        aa var2 = new aa(this.field_F);
        ei var3 = (ei) ((Object) var2.b((byte) -92));
        while (var3 != null) {
            var4 = var3.e(-76);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (ei) ((Object) var2.b(-115));
        }
        if (param0 <= -10) {
            return null;
        }
        field_K = (hj) null;
        return null;
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g(22555);
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = Pool.field_O;
        int var2 = 0;
        aa var3 = new aa(this.field_F);
        if (param0 <= 33) {
            CharSequence var7 = (CharSequence) null;
            ch.a(false, (CharSequence) null);
        }
        ei var4 = (ei) ((Object) var3.b((byte) -92));
        while (var4 != null) {
            var5 = var4.c(38);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ei) ((Object) var3.b(-122));
        }
        return var2;
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        aa var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        ei var8 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          L0: {
            var5 = new aa(this.field_F);
            var8 = (ei) ((Object) var5.b((byte) -92));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b(-115)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.d(109)) {
                        break L3;
                      } else {
                        if (var8.a(param0, param1, false, param3)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var8 = (ei) ((Object) var5.b(-80));
                    continue L1;
                  }
                }
              }
              var6 = param1;
              if (-81 != (var6 ^ -1)) {
                if (!param2) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_17_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L4: {
                  if (!vj.field_c[81]) {
                    stackIn_14_0 = this.b(param3, 0);
                    break L4;
                  } else {
                    stackIn_14_0 = this.a(param3, 3);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5_ref);

            stackIn_22_1 = new StringBuilder().append("ch.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
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
              if (!this.b(param1, param2, param0, -1)) {
                break L1;
              } else {
                this.a(1, param2, param0, param1);
                this.a((byte) -54, param0, param1, param2);
                break L1;
              }
            }
            L2: {
              if (param3 >= 13) {
                break L2;
              } else {
                this.d(-124);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ch.EA(");

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
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    ch(int param0, int param1, int param2, int param3, fp param4) {
        super(param0, param1, param2, param3, param4, (cc) null);
        this.field_F = new ko();
    }

    final static String a(boolean param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = sl.a(param0, td.a((byte) 52, param1));
              if (!param0) {
                break L1;
              } else {
                field_J = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackIn_5_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("ch.QA(").append(param0).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(ei param0, int param1) {
        RuntimeException var3 = null;
        ei var4 = null;
        aa var5 = null;
        ei var6 = null;
        int var7 = 0;
        Hashtable var8 = null;
        aa var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          L0: {
            if (this.field_F.c(0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 3) {
                  break L1;
                } else {
                  var8 = (Hashtable) null;
                  this.a((byte) 29, (StringBuilder) null, -124, (Hashtable) null);
                  break L1;
                }
              }
              var9 = new aa(this.field_F);
              var4 = (ei) ((Object) var9.a(0));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.d(-108)) {
                      var5 = new aa(this.field_F);
                      var5.a(var4, param1 ^ -123);
                      var6 = (ei) ((Object) var5.c((byte) -71));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param0, (byte) 73)) {
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (ei) ((Object) var5.c((byte) -71));
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (ei) ((Object) var9.c((byte) -71));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("ch.JA(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                field_H = 62;
                break L1;
              }
            }
            if (!param1) {
              stackIn_6_0 = dq.field_f.b(param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = gj.field_R.b(param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ch.IA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void f(int param0) {
        field_M = null;
        field_L = null;
        field_K = null;
        field_J = null;
        if (param0 != 2) {
            field_K = (hj) null;
        }
    }

    final boolean b(ei param0, int param1) {
        aa var3 = null;
        RuntimeException var3_ref = null;
        ei var4 = null;
        aa var5 = null;
        ei var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          L0: {
            if (!this.field_F.c(param1)) {
              var3 = new aa(this.field_F);
              var4 = (ei) ((Object) var3.b((byte) -92));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (var4.d(-112)) {
                      var5 = new aa(this.field_F);
                      var5.a(var4, false);
                      var6 = (ei) ((Object) var5.b(-90));
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (var6.a(param0, (byte) -108)) {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (ei) ((Object) var5.b(-90));
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var4 = (ei) ((Object) var3.b(param1 ^ -123));
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ch.NA(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    static {
        field_L = "New Game";
        field_K = new hj(13, 0, 1, 0);
        field_J = new int[]{1, 1, 2, 2, 5, 3, 1, 2, 3, 2, 5, 5, 3, 2, 10, 5, 5, 3, 5, 10, 3, 2, 3, 5, 3, 5, 2};
        field_M = new int[8192];
    }
}
