/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hc extends hm {
    static int[] field_C;
    boolean field_z;
    private boolean field_B;
    boolean field_y;
    private boolean field_A;

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = EscapeVector.field_A;
            try {
              L0: {
                if (!an.field_a) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      if (!param0) {
                        var3 = (String) (sd.a(param1, "getcookies", -29155));
                        var4 = bb.a(-128, var3, ';');
                        var5 = 0;
                        L2: while (true) {
                          if (var4.length <= var5) {
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            L3: {
                              var6 = var4[var5].indexOf('=');
                              if ((var6 ^ -1) > -1) {
                                break L3;
                              } else {
                                if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                  break L3;
                                } else {
                                  stackIn_12_0 = 1;
                                  decompiledRegionSelector0 = 2;
                                  break L1;
                                }
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        stackIn_6_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
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
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      L5: {
                        if (null == param1.getParameter("tuhstatbut")) {
                          stackIn_19_0 = 0;
                          break L5;
                        } else {
                          stackIn_19_0 = 1;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector1 = 3;
                      break L0;
                    }
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref2);

                stackIn_22_1 = new StringBuilder().append("hc.IA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L6;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L6;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_6_0 != 0;
                } else {
                  return stackIn_12_0 != 0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 > 0) {
                break L1;
              } else {
                this.h(-2);
                break L1;
              }
            }
            L2: {
              if (!this.h(0)) {
                break L2;
              } else {
                L3: {
                  if ((param2 ^ -1) == -85) {
                    break L3;
                  } else {
                    if (83 != param2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.a(-19646, -1, -1, 1);
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackIn_9_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("hc.G(");

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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -14472) {
                break L1;
              } else {
                field_C = (int[]) null;
                break L1;
              }
            }
            L2: {
              super.a(param0 ^ 0, param1, param2, param3);
              if (-1 == (this.field_t ^ -1)) {
                break L2;
              } else {
                if (eb.field_K != this.field_t) {
                  L3: {
                    if (!this.a(dh.field_d, bj.field_y, param2, (byte) 97, param1)) {
                      break L3;
                    } else {
                      if (eb.field_K != 0) {
                        break L3;
                      } else {
                        this.a(-19646, bj.field_y - param1, -param2 + dh.field_d, this.field_t);
                        break L3;
                      }
                    }
                  }
                  this.a(bj.field_y, param2, dh.field_d, param1, param3, (byte) 15);
                  break L2;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("hc.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        try {
            int var7_int = -18 % ((param5 - -39) / 45);
            if (this.field_q != null) {
                if (!(!(this.field_q instanceof ne))) {
                    ((ne) ((Object) this.field_q)).a(param2, (hc) (this), param3, (byte) 114, param1, param0);
                }
            }
            this.field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hc.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(int param0, hm param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
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
              if (!this.field_y) {
                break L1;
              } else {
                if (!this.field_A) {
                  break L1;
                } else {
                  L2: {
                    param1.f(93);
                    this.field_B = true;
                    if (param0 == -4659) {
                      break L2;
                    } else {
                      this.field_z = true;
                      break L2;
                    }
                  }
                  L3: {
                    if (this.field_q == null) {
                      break L3;
                    } else {
                      if (!(this.field_q instanceof ql)) {
                        break L3;
                      } else {
                        ((ql) ((Object) this.field_q)).a(this.field_B, param0 ^ -4679, (hm) (this));
                        break L3;
                      }
                    }
                  }
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("hc.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    hc(String param0, db param1, wn param2) {
        super(param0, param1, param2);
        this.field_B = false;
        this.field_A = true;
        this.field_y = true;
    }

    final void f(int param0) {
        if (this.field_B) {
          this.field_B = false;
          if (null != this.field_q) {
            if (this.field_q instanceof ql) {
              ((ql) ((Object) this.field_q)).a(this.field_B, 117, (hm) (this));
              if (param0 <= 46) {
                field_C = (int[]) null;
                return;
              } else {
                return;
              }
            } else {
              if (param0 <= 46) {
                field_C = (int[]) null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 <= 46) {
              field_C = (int[]) null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 <= 46) {
            field_C = (int[]) null;
            return;
          } else {
            return;
          }
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        hm var6 = null;
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
              if (param0 == 0) {
                break L1;
              } else {
                var6 = (hm) null;
                this.a(-48, 8, (byte) 115, -28, 107, (hm) null, -53);
                break L1;
              }
            }
            L2: {
              if (this.a(param3, param1, param2, false)) {
                L3: {
                  this.a(param1, param2, param3, 1);
                  if (!this.field_z) {
                    break L3;
                  } else {
                    discarded$2 = param2.append(" active");
                    break L3;
                  }
                }
                if (!this.field_y) {
                  discarded$3 = param2.append(" disabled");
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackIn_10_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("hc.AA(").append(param0).append(',');

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


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    hc(String param0, wn param1) {
        this(param0, mb.field_g.field_o, param1);
    }

    final static int a(int param0, byte param1) {
        if (param1 <= 64) {
            hc.j(54);
            return ul.a(500, param0, 123);
        }
        return ul.a(500, param0, 123);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == -19646) {
          if (null != this.field_q) {
            if (!(this.field_q instanceof qb)) {
              return;
            } else {
              ((qb) ((Object) this.field_q)).a((hc) (this), param3, param1, 1, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_A = false;
          if (null != this.field_q) {
            if (!(this.field_q instanceof qb)) {
              return;
            } else {
              ((qb) ((Object) this.field_q)).a((hc) (this), param3, param1, 1, param2);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void j(int param0) {
        field_C = null;
        if (param0 != 1) {
            hc.j(-28);
        }
    }

    final boolean h(int param0) {
        if (param0 != 0) {
            this.field_y = false;
            return this.field_B;
        }
        return this.field_B;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
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
              if (!this.field_y) {
                break L1;
              } else {
                if (!this.a(param1, param3, param4, (byte) 83, param0)) {
                  break L1;
                } else {
                  L2: {
                    this.a(-4659, param5);
                    this.field_t = param6;
                    if (this.field_q == null) {
                      break L2;
                    } else {
                      if (this.field_q instanceof ne) {
                        ((ne) ((Object) this.field_q)).a(param4, (hc) (this), param1, param0, param6, (byte) 105, param3);
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              if (param2 == 3) {
                break L3;
              } else {
                hc.j(15);
                break L3;
              }
            }
            stackIn_11_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("hc.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    protected hc() {
        this.field_B = false;
        this.field_A = true;
        this.field_y = true;
        this.field_s = mb.field_g.field_b;
    }

    static {
        field_C = new int[128];
    }
}
