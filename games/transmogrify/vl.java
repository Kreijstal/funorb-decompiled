/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vl extends fi {
    static wc field_C;
    static int field_y;
    static int[] field_G;
    static long field_B;
    static int field_A;
    private int field_z;
    private int field_D;
    private boolean field_I;
    private int field_H;
    private int field_E;
    private boolean field_F;

    public static void i(int param0) {
        field_G = null;
        field_C = null;
        if (param0 != 2147483647) {
            field_B = -119L;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                  var3 = -62 / ((param0 - 47) / 43);
                  param1.getAppletContext().showDocument(dh.a(param1, (byte) 59, var2), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("vl.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
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
              var8_int = super.b(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (!this.field_I) {
                  break L1;
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (this.b(param3, param6, param4 + 30385, param0, param5)) {
              L2: {
                if (param1 == 1) {
                  this.field_H = param5 + (-this.field_n + -param6);
                  b.field_i = (vl) (this);
                  this.field_E = -param3 + param0 + -this.field_p;
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_s = param1;
              stackIn_11_0 = 1;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_6_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("vl.O(").append(param0).append(',').append(param1).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final void a(byte param0) {
        super.a((byte) 127);
        this.field_v.a(-126, 0, 0, this.field_l, this.field_h);
        int var2 = -38 / ((74 - param0) / 49);
        this.field_D = this.field_p;
        this.field_z = this.field_n;
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
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
        try {
          L0: {
            if (param1 < -20) {
              L1: {
                if (this.a((byte) -108, param3, param2, param0)) {
                  this.a(param2, 84, param0, param3);
                  this.a(param2, param0, param3, false);
                  discarded$62 = param2.append(" revert=").append(this.field_F);
                  if (2147483647 == this.field_D) {
                    break L1;
                  } else {
                    if (2147483647 == this.field_z) {
                      break L1;
                    } else {
                      discarded$63 = param2.append(" to ").append(this.field_D).append(',').append(this.field_z);
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackIn_9_0 = (StringBuilder) (param2);
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
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("vl.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_s = 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "vl.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private vl(int param0, int param1, int param2, int param3, ui param4, ma param5, qg param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_D = 2147483647;
        this.field_z = 2147483647;
        try {
            this.field_I = param8 ? true : false;
            this.field_v = param6;
            this.field_F = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "vl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static String b(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_B = -34L;
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var2_int <= var4) {
                  break L3;
                } else {
                  var3[-var4 + -1 + var2_int] = param1.charAt(var4);
                  var4++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = new String(var3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("vl.C(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static uj a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        uj stackIn_11_0 = null;
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
              if (param0 == 42) {
                break L1;
              } else {
                field_y = -80;
                break L1;
              }
            }
            if (of.field_d != db.field_a) {
              L2: {
                if (db.field_a != gd.field_l) {
                  break L2;
                } else {
                  if (param1.equals(jh.field_g)) {
                    db.field_a = jh.field_n;
                    stackIn_11_0 = de.field_a;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              jh.field_g = param1;
              db.field_a = of.field_d;
              de.field_a = null;
              stackIn_9_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("vl.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (uj) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (uj) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_v instanceof lj)) {
                    break L3;
                  } else {
                    if (!((lj) ((Object) this.field_v)).field_t) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_s != 1) {
                  break L2;
                } else {
                  L4: {
                    L5: {
                      var5_int = oa.field_j + (-this.field_E - param3);
                      var6 = -this.field_H + bk.field_a - param0;
                      if (this.field_p != var5_int) {
                        break L5;
                      } else {
                        if (var6 != this.field_n) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_n = var6;
                    this.field_p = var5_int;
                    if (this.field_m instanceof eb) {
                      ((eb) ((Object) this.field_m)).a(param3, (vl) (this), param0, true);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (!this.field_F) {
                break L1;
              } else {
                L6: {
                  if (this.field_p == this.field_D) {
                    break L6;
                  } else {
                    L7: {
                      var5_int = this.field_D - this.field_p;
                      stackIn_15_0 = this;

                      stackIn_15_1 = this.field_p;

                      if (2 >= Math.abs(var5_int)) {
                        stackIn_17_0 = this;

                        if (-1 > (var5_int ^ -1)) {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_15_1;
                          stackIn_18_2 = 1;
                          break L7;
                        } else {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_15_1;
                          stackIn_18_2 = -1;
                          break L7;
                        }
                      } else {
                        stackIn_18_0 = this;
                        stackIn_18_1 = stackIn_15_1;
                        stackIn_18_2 = var5_int >> -1294336575;
                        break L7;
                      }
                    }
                    ((vl) (this)).field_p = stackIn_18_1 + stackIn_18_2;
                    break L6;
                  }
                }
                if (this.field_z != this.field_n) {
                  L8: {
                    var5_int = -this.field_n + this.field_z;
                    stackIn_23_0 = this;

                    stackIn_23_1 = this.field_n;

                    if ((Math.abs(var5_int) ^ -1) >= -3) {
                      stackIn_25_0 = this;

                      if ((var5_int ^ -1) >= -1) {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = -1;
                        break L8;
                      } else {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = 1;
                        break L8;
                      }
                    } else {
                      stackIn_26_0 = this;
                      stackIn_26_1 = stackIn_23_1;
                      stackIn_26_2 = var5_int >> 2026108673;
                      break L8;
                    }
                  }
                  ((vl) (this)).field_n = stackIn_26_1 + stackIn_26_2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("vl.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ')');
        }
    }

    static {
        field_G = new int[]{44, 40, 43, 45, 46, 40, 45, 40, 44, 40, 42, 49, 49, 49, 46, 40, 42, 49, 39};
    }
}
