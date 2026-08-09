/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class om extends qm implements he {
    static boolean field_u;
    qm field_w;
    static String field_v;
    static String field_x;

    void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -79 / ((param1 - -50) / 59);
            super.a(param0, 24, param2, param3);
            if (this.field_w == null) {
              break L0;
            } else {
              this.field_w.a(param0, 92, param2 + this.field_j, this.field_r + param3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var5);

            stackIn_5_1 = new StringBuilder().append("om.N(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(byte param0) {
        qm var3;
        L0: {
          if (null != this.field_w) {
            this.field_w.b((byte) -95);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -84) {
          var3 = (qm) null;
          this.a((qm) null, -36, 90, 38);
          return;
        } else {
          return;
        }
    }

    om(int param0, int param1, int param2, int param3, wo param4, bi param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5 == 0) {
              if (null != this.field_w) {
                this.field_w.a(param0, param1 - -this.field_j, this.field_r + param2, param3, param4, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("om.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(qm param0, boolean param1) {
        RuntimeException var3 = null;
        qm var4 = null;
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
              if (!param1) {
                break L1;
              } else {
                var4 = (qm) null;
                this.a(97, 105, (qm) null, 108, -78, 40, 121);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_w) {
                  break L3;
                } else {
                  if (this.field_w.e(-109)) {
                    break L3;
                  } else {
                    if (!this.field_w.a(true, param0)) {
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

            stackIn_10_1 = new StringBuilder().append("om.T(");

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
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
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
            L1: {
              if (null == this.field_w) {
                break L1;
              } else {
                if (!this.field_w.e(param1 + -19401)) {
                  break L1;
                } else {
                  if (this.field_w.a(param0, param1 ^ 0, param2, param3)) {
                    stackIn_5_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5_int = param0;
            if (var5_int == 80) {
              L2: {
                if (cp.field_k[81]) {
                  stackIn_11_0 = this.a(param2, false);
                  break L2;
                } else {
                  stackIn_11_0 = this.a(4, param2);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (param1 == 19279) {
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                field_v = (String) null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("om.AA(").append(param0).append(',').append(param1).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    qm d(byte param0) {
        qm var2;
        if (param0 >= 39) {
          var2 = this.field_w;
          if (var2 != null) {
            if (!var2.e(-111)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        } else {
          this.field_w = (qm) null;
          var2 = this.field_w;
          if (var2 != null) {
            if (!var2.e(-111)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(boolean param0, qm param1) {
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
              if (param0) {
                break L1;
              } else {
                this.a((byte) 61);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_w) {
                  break L3;
                } else {
                  if (!this.field_w.a(true, param1)) {
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

            stackIn_9_1 = new StringBuilder().append("om.P(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
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
              if (!param3) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_w) {
                  break L3;
                } else {
                  if (!this.field_w.a(param0 + this.field_r, param1, param2, false, param4 - -this.field_j, param5, param6)) {
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

            stackIn_9_1 = new StringBuilder().append("om.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (0 == param3) {
          if (this.field_i != null) {
            this.field_i.a(param0, false, param2, (qm) (this), true);
            if (this.field_w == null) {
              if (param1 >= -12) {
                this.field_w = (qm) null;
                return;
              } else {
                return;
              }
            } else {
              this.field_w.a(this.field_j + param0, (byte) -127, this.field_r + param2, param3);
              if (param1 >= -12) {
                this.field_w = (qm) null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (this.field_w == null) {
              if (param1 >= -12) {
                this.field_w = (qm) null;
                return;
              } else {
                return;
              }
            } else {
              this.field_w.a(this.field_j + param0, (byte) -127, this.field_r + param2, param3);
              if (param1 >= -12) {
                this.field_w = (qm) null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (this.field_w == null) {
            if (param1 >= -12) {
              this.field_w = (qm) null;
              return;
            } else {
              return;
            }
          } else {
            this.field_w.a(this.field_j + param0, (byte) -127, this.field_r + param2, param3);
            if (param1 >= -12) {
              this.field_w = (qm) null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(param4 + -8294);
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 > -107) {
          L0: {
            field_v = (String) null;
            if (this.d((byte) 47) == null) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.d((byte) 47) == null) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -85) {
              L1: {
                if (!this.a(0, param0, param3, param2)) {
                  break L1;
                } else {
                  this.a(param0, (byte) 125, param3, param2);
                  this.a(param3, param2, param0, -91);
                  break L1;
                }
              }
              stackIn_6_0 = (StringBuilder) (param3);
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
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("om.MA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
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
            if (param0 == 1) {
              L1: {
                L2: {
                  if (this.field_w == null) {
                    break L2;
                  } else {
                    if (!this.field_w.e(-115)) {
                      break L2;
                    } else {
                      if (!this.field_w.a(1, param1, param2, param3, param4, param5, param6)) {
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

            stackIn_11_1 = new StringBuilder().append("om.FB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param3 <= -26) {
                break L1;
              } else {
                this.field_w = (qm) null;
                break L1;
              }
            }
            discarded$3 = param0.append('\n');
            var5_int = 0;
            L2: while (true) {
              if (param2 < var5_int) {
                if (null == this.field_w) {
                  discarded$4 = param0.append("null");
                  break L0;
                } else {
                  this.field_w.a(1 + param2, -109, param1, param0);
                  return;
                }
              } else {
                discarded$5 = param0.append(' ');
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("om.V(");

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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int param0) {
        if (param0 == -8346) {
          if (this.field_w != null) {
            this.field_w.f(param0 + 8316);
            return;
          } else {
            return;
          }
        } else {
          field_v = (String) null;
          if (this.field_w == null) {
            return;
          } else {
            this.field_w.f(param0 + 8316);
            return;
          }
        }
    }

    public static void e(byte param0) {
        field_x = null;
        field_v = null;
        if (param0 != 122) {
            om.e((byte) 110);
        }
    }

    final int c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 <= 30) {
          L0: {
            this.field_w = (qm) null;
            if (null != this.field_w) {
              stackIn_8_0 = this.field_w.c((byte) 97);
              break L0;
            } else {
              stackIn_8_0 = 0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (null != this.field_w) {
              stackIn_4_0 = this.field_w.c((byte) 97);
              break L1;
            } else {
              stackIn_4_0 = 0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    String a(byte param0) {
        String var2;
        String var3;
        Hashtable var4;
        var2 = super.a((byte) -46);
        if (param0 <= -23) {
          if (null != this.field_w) {
            var3 = this.field_w.a((byte) -72);
            if (var3 != null) {
              return var3;
            } else {
              return var2;
            }
          } else {
            return var2;
          }
        } else {
          var4 = (Hashtable) null;
          this.a((StringBuilder) null, (Hashtable) null, 43, -106);
          if (null != this.field_w) {
            var3 = this.field_w.a((byte) -72);
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

    private final boolean a(int param0, qm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 7 / ((param0 - -63) / 46);
                if (null == this.field_w) {
                  break L2;
                } else {
                  if (this.field_w.e(-127)) {
                    break L2;
                  } else {
                    if (!this.field_w.a(true, param1)) {
                      break L2;
                    } else {
                      stackIn_5_0 = 1;
                      break L1;
                    }
                  }
                }
              }
              stackIn_5_0 = 0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("om.W(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_v = "Names should contain a maximum of 12 characters";
    }
}
