/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dk extends uj {
    static String field_x;
    boolean field_u;
    private boolean field_y;
    private boolean field_v;
    static String field_t;
    boolean field_z;
    static String field_w;

    void a(int param0, int param1, uj param2, int param3) {
        uj var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(102, param1, param2, param3);
              if (0 == this.field_l) {
                break L1;
              } else {
                if (this.field_l != te.field_b) {
                  L2: {
                    if (!this.a(param3, param1, la.field_c, pe.field_d, -12790)) {
                      break L2;
                    } else {
                      if (te.field_b != 0) {
                        break L2;
                      } else {
                        this.a(la.field_c + -param3, 67, -param1 + pe.field_d, this.field_l);
                        break L2;
                      }
                    }
                  }
                  this.a(la.field_c, param3, param1, param2, (byte) -22, pe.field_d);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 > 27) {
                break L3;
              } else {
                var6 = (uj) null;
                this.a(-120, (uj) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("dk.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_g && this.field_g instanceof ga) {
            ((ga) ((Object) this.field_g)).a((dk) (this), param2, false, param3, param0);
        }
        if (param1 <= 59) {
            uj var6 = (uj) null;
            this.a(86, 45, (uj) null, -120);
        }
    }

    final void b(byte param0) {
        if (this.field_v) {
            this.field_v = false;
            if (null != this.field_g) {
                if (!(!(this.field_g instanceof ei))) {
                    ((ei) ((Object) this.field_g)).a((byte) -119, (uj) (this), this.field_v);
                }
            }
        }
        if (param0 > -72) {
            StringBuilder var3 = (StringBuilder) null;
            this.a((Hashtable) null, (StringBuilder) null, (byte) 61, -47);
        }
    }

    public static void a(int param0) {
        if (param0 >= -76) {
            return;
        }
        field_t = null;
        field_w = null;
        field_x = null;
    }

    dk(String param0, qg param1) {
        this(param0, eh.field_j.field_d, param1);
    }

    boolean a(int param0, uj param1) {
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
              if (!this.field_u) {
                break L1;
              } else {
                if (!this.field_y) {
                  break L1;
                } else {
                  L2: {
                    param1.b((byte) -100);
                    this.field_v = true;
                    if (null == this.field_g) {
                      break L2;
                    } else {
                      if (!(this.field_g instanceof ei)) {
                        break L2;
                      } else {
                        ((ei) ((Object) this.field_g)).a((byte) -119, (uj) (this), this.field_v);
                        break L2;
                      }
                    }
                  }
                  if (param0 == 0) {
                    stackIn_11_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_v = true;
                    return true;
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("dk.PA(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 < -117) {
            break L0;
          } else {
            dk.a((byte) -26, 'y');
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (param1 != 45) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    dk(String param0, de param1, qg param2) {
        super(param0, param1, param2);
        this.field_y = true;
        this.field_v = false;
        this.field_u = true;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (u.a(param1 ^ 9566, param0)) {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var10 = gj.field_d;
                var8 = var10;
                var5 = var8;
                var2 = var5;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var10.length) {
                    L2: {
                      var11 = ea.field_c;
                      var9 = var11;
                      var6 = var9;
                      var2 = var6;
                      if (param1 == 90) {
                        break L2;
                      } else {
                        field_t = (String) null;
                        break L2;
                      }
                    }
                    var7 = 0;
                    var3 = var7;
                    L3: while (true) {
                      if (var11.length <= var7) {
                        stackIn_24_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var11[var7];
                        if (var4 == param0) {
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var10[var3];
                    if (var4 == param0) {
                      stackIn_12_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
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
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "dk.TA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_24_0 != 0;
              }
            }
          }
        }
    }

    boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
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
            L1: {
              if (!this.field_u) {
                break L1;
              } else {
                if (this.a(param3, param2, param1, param5, param4 ^ 12799)) {
                  L2: {
                    this.a(0, param0);
                    this.field_l = param6;
                    if (this.field_g == null) {
                      break L2;
                    } else {
                      if (!(this.field_g instanceof ke)) {
                        break L2;
                      } else {
                        ((ke) ((Object) this.field_g)).a(param3, param2, param6, param5, param1, (dk) (this), (byte) -103);
                        break L2;
                      }
                    }
                  }
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param4 == -11) {
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("dk.G(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static byte[] a(byte param0, Object param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        kk var5 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 38 % ((param0 - 4) / 47);
            if (param1 != null) {
              if (!(param1 instanceof byte[])) {
                if (!(param1 instanceof kk)) {
                  throw new IllegalArgumentException();
                } else {
                  var5 = (kk) (param1);
                  stackIn_11_0 = var5.a(4208);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var4 = (byte[]) (param1);
                if (param2) {
                  stackIn_8_0 = rg.a((byte) 10, var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = (byte[]) (var4);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("dk.VA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param0, 0, param1, param3)) {
                L2: {
                  this.a(param0, param1, param3, 19103);
                  if (this.field_z) {
                    discarded$2 = param1.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (this.field_u) {
                  break L1;
                } else {
                  discarded$3 = param1.append(" disabled");
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param2 == 39) {
              stackIn_11_0 = (StringBuilder) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_9_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("dk.SA(");

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
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
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
              if (!this.d(true)) {
                break L1;
              } else {
                L2: {
                  if (84 == param3) {
                    break L2;
                  } else {
                    if (param3 == 83) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                this.a(-1, 111, -1, 1);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            if (param2 == -90) {
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              field_w = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("dk.EA(");

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
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final boolean d(boolean param0) {
        if (!param0) {
            field_t = (String) null;
        }
        return this.field_v;
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
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
              if (null == this.field_g) {
                break L1;
              } else {
                if (!(this.field_g instanceof ke)) {
                  break L1;
                } else {
                  ((ke) ((Object) this.field_g)).a((dk) (this), param2, param5, 78, param1, param0);
                  break L1;
                }
              }
            }
            L2: {
              this.field_l = 0;
              if (param4 == -22) {
                break L2;
              } else {
                this.field_u = true;
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

            stackIn_8_1 = new StringBuilder().append("dk.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    protected dk() {
        this.field_y = true;
        this.field_v = false;
        this.field_u = true;
        this.field_o = eh.field_j.field_t;
    }

    static {
        field_x = "You have <%0> unread messages!";
        field_t = "Back";
        field_w = "To Customer Support";
    }
}
