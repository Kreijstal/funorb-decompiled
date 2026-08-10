/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ee extends el implements ql {
    static String field_y;
    static dm field_A;
    tf field_z;
    static String[] field_x;
    static int[] field_B;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        gb var8 = null;
        RuntimeException var8_ref = null;
        el var9_ref_el = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Geoblox.field_C;
        try {
          L0: {
            var8 = new gb(this.field_z);
            var9_ref_el = (el) ((Object) var8.c((byte) 88));
            L1: while (true) {
              L2: {
                if (var9_ref_el == null) {
                  break L2;
                } else {
                  if (!var9_ref_el.a(118)) {
                    break L2;
                  } else {
                    if (var9_ref_el.a(param0 + this.field_m, 60, this.field_v + param2, param3, param4, param5, param6)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9_ref_el = (el) ((Object) var8.a((byte) 109));
                      continue L1;
                    }
                  }
                }
              }
              var9 = -13 / ((-3 - param1) / 38);
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8_ref);

            stackIn_13_1 = new StringBuilder().append("ee.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
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
            if (param0 == 0) {
              L1: {
                if (this.a(param1, param3, 10095, param2)) {
                  this.a(param3, param2, 34, param1);
                  this.a(param2, param1, -3188, param3);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = (StringBuilder) (param1);
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

            stackIn_10_1 = new StringBuilder().append("ee.PA(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        int var2 = 0;
        gb var3 = new gb(this.field_z);
        el var4 = (el) ((Object) var3.c((byte) 88));
        if (param0 < 82) {
            field_y = (String) null;
        }
        while (var4 != null) {
            var5 = var4.d((byte) 91);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (el) ((Object) var3.a((byte) 110));
        }
        return var2;
    }

    final boolean e(byte param0) {
        if (param0 != 54) {
            StringBuilder var3 = (StringBuilder) null;
            this.a((Hashtable) null, (StringBuilder) null, -120, -15);
        }
        return null != this.f((byte) -99) ? true : false;
    }

    final boolean a(int param0, el param1) {
        RuntimeException var3 = null;
        el var4 = null;
        gb var5 = null;
        el var6 = null;
        int var7 = 0;
        gb var8 = null;
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
        var7 = Geoblox.field_C;
        try {
          L0: {
            if (!this.field_z.c(13519)) {
              L1: {
                var8 = new gb(this.field_z);
                var4 = (el) ((Object) var8.d(1));
                if (param0 == 7305) {
                  break L1;
                } else {
                  field_B = (int[]) null;
                  break L1;
                }
              }
              L2: while (true) {
                if (var4 == null) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.e((byte) 54)) {
                      var5 = new gb(this.field_z);
                      var5.a(var4, (byte) 123);
                      var6 = (el) ((Object) var5.c(26));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a((byte) -39, param1)) {
                            var6 = (el) ((Object) var5.c(26));
                            continue L4;
                          } else {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (el) ((Object) var8.c(26));
                  continue L2;
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
          L5: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("ee.AB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
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

    void a(boolean param0, int param1, el param2, int param3) {
        RuntimeException runtimeException = null;
        gb var5 = null;
        el var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new gb(this.field_z);
            var6 = (el) ((Object) var5.c((byte) 88));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.a(122)) {
                    break L2;
                  } else {
                    var6.a(false, this.field_m + param1, param2, this.field_v + param3);
                    var6 = (el) ((Object) var5.a((byte) 123));
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
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ee.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var8 = Geoblox.field_C;
        if (param3 == 0) {
            if (!(this.field_q == null)) {
                this.field_q.a(param0, -9, param1, true, (el) (this));
            }
        }
        int var6 = -58 % ((param2 - 1) / 43);
        gb var5 = new gb(this.field_z);
        el var7 = (el) ((Object) var5.d(1));
        while (var7 != null) {
            var7.a(this.field_v + param0, param1 - -this.field_m, (byte) 93, param3);
            var7 = (el) ((Object) var5.c(26));
        }
    }

    public static void e(int param0) {
        if (param0 != 14078) {
            return;
        }
        field_x = null;
        field_y = null;
        field_B = null;
        field_A = null;
    }

    final String c(byte param0) {
        gb var2;
        el var3;
        String var4;
        L0: {
          var2 = new gb(this.field_z);
          if (param0 == 69) {
            break L0;
          } else {
            field_A = (dm) null;
            break L0;
          }
        }
        var3 = (el) ((Object) var2.c((byte) 88));
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 69);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (el) ((Object) var2.a((byte) 111));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    private final void g(byte param0) {
        gb var2 = new gb(this.field_z);
        el var3 = (el) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            var3.c(116);
            var3 = (el) ((Object) var2.a((byte) 108));
        }
        int var4 = 71 / ((param0 - 57) / 51);
    }

    final boolean a(el param0, int param1) {
        gb var3 = null;
        RuntimeException var3_ref = null;
        el var4 = null;
        gb var5 = null;
        el var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            if (!this.field_z.c(13519)) {
              var3 = new gb(this.field_z);
              if (param1 <= -75) {
                var4 = (el) ((Object) var3.c((byte) 88));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (var4.e((byte) 54)) {
                        var5 = new gb(this.field_z);
                        var5.a((byte) 56, var4);
                        var6 = (el) ((Object) var5.a((byte) 114));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a((byte) -56, param0)) {
                              var6 = (el) ((Object) var5.a((byte) 114));
                              continue L3;
                            } else {
                              stackIn_15_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    var4 = (el) ((Object) var3.a((byte) 109));
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
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
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("ee.RA(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final void d(int param0) {
        int var4 = Geoblox.field_C;
        gb var2 = new gb(this.field_z);
        if (param0 > -122) {
            field_B = (int[]) null;
        }
        el var3 = (el) ((Object) var2.c((byte) 88));
        while (var3 != null) {
            var3.d(-126);
            var3 = (el) ((Object) var2.a((byte) 121));
        }
    }

    ee(int param0, int param1, int param2, int param3, dh param4) {
        super(param0, param1, param2, param3, param4, (bb) null);
        this.field_z = new tf();
    }

    final boolean a(byte param0, el param1) {
        gb var3 = null;
        RuntimeException var3_ref = null;
        el var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            var3 = new gb(this.field_z);
            if (param0 < -30) {
              var4 = (el) ((Object) var3.c((byte) 88));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!var4.a((byte) -123, param1)) {
                    var4 = (el) ((Object) var3.a((byte) 125));
                    continue L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
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
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ee.UA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) -21, param3, param4);
        if (param2 >= -6) {
            this.c((byte) 85);
        }
        this.g((byte) 123);
    }

    final void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        gb var7 = null;
        el var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Geoblox.field_C;
        try {
          L0: {
            var7 = new gb(this.field_z);
            var8 = (el) ((Object) var7.c((byte) 88));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.a(122)) {
                    break L2;
                  } else {
                    var8.a(param0 - -this.field_v, param1, true, param3, this.field_m + param4, param5);
                    var8 = (el) ((Object) var7.a((byte) 109));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param2) {
                  break L3;
                } else {
                  this.c((byte) -6);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("ee.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        el var8 = null;
        gb var9 = null;
        int stackIn_10_0 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var9 = new gb(this.field_z);
              if (param1 == 13) {
                break L1;
              } else {
                this.d(-77);
                break L1;
              }
            }
            var8 = (el) ((Object) var9.c((byte) 88));
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.a(120)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var8.e((byte) 54)) {
                        break L4;
                      } else {
                        if (var8.a(param0, 13, param2, param3)) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var8 = (el) ((Object) var9.a((byte) 110));
                    continue L2;
                  }
                }
              }
              var6 = param0;
              if (-81 == (var6 ^ -1)) {
                L5: {
                  if (!kj.field_o[81]) {
                    stackIn_17_0 = this.a(param3, -96);
                    break L5;
                  } else {
                    stackIn_17_0 = this.a(7305, param3);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("ee.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_17_0;
        }
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        el var6 = null;
        int var7 = 0;
        int var8 = 0;
        el var9 = null;
        gb var10 = null;
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
        var8 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var10 = new gb(this.field_z);
              var6 = (el) ((Object) var10.c((byte) 88));
              if (param2 == -3188) {
                break L1;
              } else {
                var9 = (el) null;
                this.a(true, 26, (el) null, 23);
                break L1;
              }
            }
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param1.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param3 < var7) {
                    var6.a(0, param1, param0, param3 + 1);
                    var6 = (el) ((Object) var10.a((byte) 125));
                    continue L2;
                  } else {
                    discarded$4 = param1.append(' ');
                    var7++;
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

            stackIn_11_1 = new StringBuilder().append("ee.FB(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    el f(byte param0) {
        gb var2;
        el var3;
        int var4;
        L0: {
          var4 = Geoblox.field_C;
          if (param0 < -60) {
            break L0;
          } else {
            field_y = (String) null;
            break L0;
          }
        }
        var2 = new gb(this.field_z);
        var3 = (el) ((Object) var2.c((byte) 88));
        L1: while (true) {
          if (var3 != null) {
            if (var3.e((byte) 54)) {
              return var3;
            } else {
              var3 = (el) ((Object) var2.a((byte) 121));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void b(byte param0, el param1) {
        try {
            this.field_z.a(-113, param1);
            if (param0 >= -60) {
                field_A = (dm) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ee.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, el param5, int param6) {
        RuntimeException var8 = null;
        el var9 = null;
        int var10 = 0;
        gb var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var11 = new gb(this.field_z);
              if (param3 == -1) {
                break L1;
              } else {
                this.a(-119, -117, (byte) 87, 105, 63);
                break L1;
              }
            }
            var9 = (el) ((Object) var11.c((byte) 88));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.a(127)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.e((byte) 54)) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1, param2, param3 + 0, param4, param5, param6)) {
                          break L4;
                        } else {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (el) ((Object) var11.a((byte) 124));
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
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("ee.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    static {
        field_y = "To server list";
        field_x = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_B = new int[]{1, 2, 0, 3, 6, 5, 4};
    }
}
