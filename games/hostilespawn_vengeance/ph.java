/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ph extends ag {
    static String field_y;
    boolean field_D;
    private boolean field_C;
    boolean field_A;
    static String field_z;
    static gb field_F;
    static String field_B;
    private boolean field_E;

    final static jj a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        jj stackIn_11_0 = null;
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
              if (param1 <= -76) {
                break L1;
              } else {
                field_z = (String) null;
                break L1;
              }
            }
            if (ti.field_b != ki.field_f) {
              L2: {
                if (ee.field_b != ki.field_f) {
                  break L2;
                } else {
                  if (param0.equals(uh.field_g)) {
                    ki.field_f = e.field_q;
                    stackIn_11_0 = nl.field_a;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              nl.field_a = null;
              ki.field_f = ti.field_b;
              uh.field_g = param0;
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

            stackIn_14_1 = new StringBuilder().append("ph.IB(");

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
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jj) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jj) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        try {
            if (this.field_p != null) {
                if (!(!(this.field_p instanceof hl))) {
                    ((hl) ((Object) this.field_p)).a(param3, (byte) 127, param0, (ph) (this), param2, param1);
                }
            }
            this.field_r = param5;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ph.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.field_D) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_E) {
                L1: {
                  param1.c((byte) -93);
                  this.field_C = true;
                  if (param0 < 0) {
                    break L1;
                  } else {
                    this.field_C = false;
                    break L1;
                  }
                }
                L2: {
                  if (null == this.field_p) {
                    break L2;
                  } else {
                    if (this.field_p instanceof ah) {
                      ((ah) ((Object) this.field_p)).a(this.field_C, (ag) (this), -111);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_12_0 = 1;
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
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ph.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
          if (this.field_p != null) {
            if (!(this.field_p instanceof qk)) {
              return;
            } else {
              ((qk) ((Object) this.field_p)).a(param3, param2, param0, (ph) (this), (byte) -118);
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_D = true;
          if (this.field_p == null) {
            return;
          } else {
            L0: {
              if (this.field_p instanceof qk) {
                ((qk) ((Object) this.field_p)).a(param3, param2, param0, (ph) (this), (byte) -118);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2 + param2, param3);
            if (-1 != (this.field_r ^ -1)) {
                if (this.field_r == ig.field_L) {
                    return;
                }
                if (this.b(rb.field_m, j.field_c, 255, param1, param3) && ig.field_L == 0) {
                    this.a(rb.field_m - param1, true, j.field_c - param3, this.field_r);
                }
                this.a(j.field_c, param1, param3, rb.field_m, param0, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ph.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ph(String param0, mh param1) {
        this(param0, gf.field_e.field_e, param1);
    }

    final static void h(int param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 1048576) {
                    break L1;
                  } else {
                    ph.h(-49);
                    break L1;
                  }
                }
                L2: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 == null) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        var2 = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                        ca.field_d = 1 + (int)(var3.longValue() / 1048576L);
                        decompiledRegionSelector0 = 0;
                        break L3;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var2_ref = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L4;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean g(int param0) {
        if (param0 != -9015) {
            return false;
        }
        return this.field_C;
    }

    ph(String param0, nn param1, mh param2) {
        super(param0, param1, param2);
        this.field_D = true;
        this.field_C = false;
        this.field_E = true;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        ag var6 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param3, param2, false, param1)) {
                break L1;
              } else {
                L2: {
                  this.a(param2, param1, param3, -112);
                  if (this.field_A) {
                    discarded$2 = param3.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!this.field_D) {
                  discarded$3 = param3.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 >= 73) {
                break L3;
              } else {
                var6 = (ag) null;
                this.a(79, 19, 55, -17, (byte) -121, (ag) null, 29);
                break L3;
              }
            }
            stackIn_10_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ph.IA(").append(param0).append(',');

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
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final void c(byte param0) {
        int var2;
        if (this.field_C) {
          this.field_C = false;
          if (this.field_p != null) {
            if (!(this.field_p instanceof ah)) {
              var2 = -61 / ((param0 - -27) / 39);
              return;
            } else {
              ((ah) ((Object) this.field_p)).a(this.field_C, (ag) (this), -112);
              var2 = -61 / ((param0 - -27) / 39);
              return;
            }
          } else {
            var2 = -61 / ((param0 - -27) / 39);
            return;
          }
        } else {
          var2 = -61 / ((param0 - -27) / 39);
          return;
        }
    }

    public static void i(int param0) {
        field_F = null;
        field_z = null;
        if (param0 != 84) {
          field_B = (String) null;
          field_B = null;
          field_y = null;
          return;
        } else {
          field_B = null;
          field_y = null;
          return;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
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
            if (param4 == 110) {
              if (!this.field_D) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (this.b(param3, param0, param4 ^ 145, param2, param1)) {
                  L1: {
                    this.a((byte) -125, param5);
                    this.field_r = param6;
                    if (null == this.field_p) {
                      break L1;
                    } else {
                      if (this.field_p instanceof hl) {
                        ((hl) ((Object) this.field_p)).a(param3, param0, param6, param1, 115, (ph) (this), param2);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("ph.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    protected ph() {
        this.field_D = true;
        this.field_C = false;
        this.field_E = true;
        this.field_h = gf.field_e.field_d;
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.g(-9015)) {
                break L1;
              } else {
                L2: {
                  if (param2 == 84) {
                    break L2;
                  } else {
                    if (param2 != 83) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(-1, true, -1, 1);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            if (param0 == 274) {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ph.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    static {
        field_y = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_B = "Get back to the lift before the reactor explodes!";
        field_z = "Charges: ";
    }
}
