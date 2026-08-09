/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oda extends shb implements nea {
    static String field_t;
    shb[] field_u;

    final int c(int param0) {
        int var2;
        shb[] var3;
        int var4;
        shb var5;
        int var7;
        int var6;
        var7 = VoidHunters.field_G;
        var2 = 0;
        var3 = this.field_u;
        var4 = param0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.c(0);
              if (var6 > var2) {
                var2 = var6;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final String d(byte param0) {
        shb[] var2;
        int var3;
        shb var4;
        int var6;
        String var5;
        var6 = VoidHunters.field_G;
        if (this.field_u != null) {
          var2 = this.field_u;
          var3 = 0;
          L0: while (true) {
            if (var2.length <= var3) {
              if (param0 != 125) {
                return (String) null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.d((byte) 125);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1, int param2, shb param3) {
        RuntimeException runtimeException = null;
        shb[] var5 = null;
        int var6 = 0;
        shb var7 = null;
        int var8 = 0;
        shb[] var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            super.a(param0, param1, param2 ^ 0, param3);
            if (null == this.field_u) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = this.field_u;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  L2: {
                    if (param2 == -981) {
                      break L2;
                    } else {
                      field_t = (String) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var7 = var9[var6];
                    if (var7 != null) {
                      var7.a(param0 - -this.field_r, this.field_g + param1, -981, param3);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("oda.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void d(int param0);

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
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
              if (!param0) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            L2: {
              if (!this.a(param1, param2, (byte) -113, param3)) {
                break L2;
              } else {
                this.a(72, param2, param1, param3);
                this.a(false, param3, param1, param2);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("oda.JA(").append(param0).append(',');

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


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
        shb[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        shb var10 = null;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (this.field_u == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = this.field_u;
                var9 = 0;
                if (param1 == -6006) {
                  break L1;
                } else {
                  field_t = (String) null;
                  break L1;
                }
              }
              L2: while (true) {
                if (var9 >= var8.length) {
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var8[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.e((byte) -120)) {
                        break L3;
                      } else {
                        if (!var10.a(param0, -6006, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("oda.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final boolean a(int param0, shb param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        shb var5 = null;
        shb var6 = null;
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
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (null != this.field_u) {
              var4_int = param2;
              L1: while (true) {
                if (var4_int >= this.field_u.length) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = this.field_u[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.e((byte) -120)) {
                        break L2;
                      } else {
                        var4_int = var4_int + param0;
                        L3: while (true) {
                          if (var4_int >= this.field_u.length) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_u[var4_int];
                              if (var6 == null) {
                                break L4;
                              } else {
                                if (!var6.a(param2 + 0, param1)) {
                                  break L4;
                                } else {
                                  stackIn_13_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                            var4_int = var4_int + param0;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
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
          L5: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("oda.IA(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
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

    boolean a(int param0, int param1, shb param2, char param3) {
        shb[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        shb var7 = null;
        int var8 = 0;
        shb[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (null != this.field_u) {
              L1: {
                var9 = this.field_u;
                var5 = var9;
                if (param0 == -15834) {
                  break L1;
                } else {
                  this.field_u = (shb[]) null;
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var9.length <= var6) {
                  var5_int = param1;
                  if (-81 == (var5_int ^ -1)) {
                    L3: {
                      if (si.field_o[81]) {
                        stackIn_19_0 = this.a(param2, (byte) -63);
                        break L3;
                      } else {
                        stackIn_19_0 = this.b(param2, (byte) 39);
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  L4: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L4;
                    } else {
                      if (!var7.e((byte) -120)) {
                        break L4;
                      } else {
                        if (!var7.a(-15834, param1, param2, param3)) {
                          break L4;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var6++;
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
            var5_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5_ref);

            stackIn_22_1 = new StringBuilder().append("oda.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    final boolean a(shb param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        shb var5 = null;
        shb var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (this.field_u != null) {
              if (param1 > 34) {
                var4_int = this.field_u.length + -1;
                L1: while (true) {
                  if (-1 < (var4_int ^ -1)) {
                    stackIn_23_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var5 = this.field_u[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 == null) {
                        break L2;
                      } else {
                        if (var5.e((byte) -120)) {
                          var4_int = var4_int - param2;
                          L3: while (true) {
                            if (var4_int < 0) {
                              break L2;
                            } else {
                              L4: {
                                var6 = this.field_u[var4_int];
                                if (var6 != null) {
                                  if (var6.a(0, param0)) {
                                    stackIn_19_0 = 1;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                              var4_int = var4_int - param2;
                              continue L3;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4_int--;
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
          L5: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("oda.DA(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_23_0 != 0;
            }
          }
        }
    }

    private final shb g(byte param0) {
        shb[] var2;
        int var3;
        shb var4;
        int var5;
        shb[] var6;
        var5 = VoidHunters.field_G;
        if (null != this.field_u) {
          var6 = this.field_u;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 >= -102) {
                this.field_u = (shb[]) null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.e((byte) -120)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final boolean b(shb param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 39) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(1, param0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("oda.EA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.d(16777215);
    }

    oda(int param0, int param1, int param2, int param3, wwa param4) {
        super(param0, param1, param2, param3, param4, (sba) null);
    }

    public static void a(int param0) {
        field_t = null;
        if (param0 != 0) {
            oda.a(68);
        }
    }

    final boolean e(byte param0) {
        if (param0 != -120) {
            return false;
        }
        return this.g((byte) -127) != null ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        shb[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        shb var10 = null;
        int var11 = 0;
        shb[] var12 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (this.field_u != null) {
              var12 = this.field_u;
              var7 = var12;
              var8 = 62 / ((52 - param0) / 52);
              var9 = 0;
              L1: while (true) {
                if (var12.length <= var9) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (var10 != null) {
                      var10.a((byte) 118, this.field_g + param1, param2, this.field_r + param3, param4, param5);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var7_ref);

            stackIn_12_1 = new StringBuilder().append("oda.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, shb param1) {
        shb[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        shb var5 = null;
        int var6 = 0;
        shb[] var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var7 = this.field_u;
            var3 = var7;
            var4 = param0;
            L1: while (true) {
              if (var4 >= var7.length) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    if (var5.a(0, param1)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("oda.A(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        int var5;
        shb var6;
        int var7;
        L0: {
          var7 = VoidHunters.field_G;
          if (param1 != 0) {
            break L0;
          } else {
            if (this.field_q == null) {
              break L0;
            } else {
              this.field_q.a(-127, (shb) (this), param0, param3, true);
              break L0;
            }
          }
        }
        if (param2 >= 47) {
          L1: {
            if (this.field_u != null) {
              var5 = -1 + this.field_u.length;
              L2: while (true) {
                if ((var5 ^ -1) > -1) {
                  break L1;
                } else {
                  var6 = this.field_u[var5];
                  if (var6 != null) {
                    var6.b(param0 - -this.field_g, param1, 90, param3 - -this.field_r);
                    var5--;
                    continue L2;
                  } else {
                    var5--;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        shb var7 = null;
        int var8 = 0;
        int var9 = 0;
        shb[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            if (null == this.field_u) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var10 = this.field_u;
              var6 = 0;
              L1: while (true) {
                if (var10.length <= var6) {
                  L2: {
                    if (!param0) {
                      break L2;
                    } else {
                      this.a(9, 45, 27, 51, 117);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var10[var6];
                  discarded$3 = param1.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (param3 < var8) {
                      L4: {
                        if (var7 == null) {
                          discarded$4 = param1.append("null");
                          break L4;
                        } else {
                          var7.a(false, param2, param3 + 1, param1);
                          break L4;
                        }
                      }
                      var6++;
                      continue L1;
                    } else {
                      discarded$5 = param1.append(' ');
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("oda.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void f(byte param0) {
        shb[] var2;
        int var3;
        shb var4;
        int var5;
        shb[] var6;
        L0: {
          var5 = VoidHunters.field_G;
          if (param0 == -34) {
            break L0;
          } else {
            field_t = (String) null;
            break L0;
          }
        }
        var6 = this.field_u;
        var2 = var6;
        var3 = 0;
        L1: while (true) {
          if (var3 >= var6.length) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.f((byte) -34);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        shb[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        shb var10 = null;
        int var11 = 0;
        shb var12 = null;
        shb[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (null != this.field_u) {
              var13 = this.field_u;
              var8 = var13;
              var9 = 0;
              L1: while (true) {
                if (var13.length <= var9) {
                  if (param6 < -17) {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var12 = (shb) null;
                    this.b((shb) null, (byte) -24);
                    return false;
                  }
                } else {
                  L2: {
                    var10 = var13[var9];
                    if (var10 == null) {
                      break L2;
                    } else {
                      if (!var10.a(param0, param1 + this.field_g, param2, param3, param4, param5 + this.field_r, (byte) -116)) {
                        break L2;
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var9++;
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
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("oda.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final boolean a(shb param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -55) {
              stackIn_4_0 = this.a(param0, 100, 1);
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
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("oda.MA(");

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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_t = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
