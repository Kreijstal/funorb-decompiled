/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rva extends ae implements tpa {
    static int[] field_u;
    static jpa field_v;
    ae[] field_w;

    private final ae a(int param0) {
        ae[] var2;
        int var3;
        ae var4;
        int var5;
        ae[] var7;
        StringBuilder var6;
        var5 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_w) {
          var7 = this.field_w;
          var2 = var7;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var7.length) {
              if (param0 >= -10) {
                var6 = (StringBuilder) null;
                this.a((Hashtable) null, 73, -34, (StringBuilder) null);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var7[var3];
              if (var4 != null) {
                if (var4.b((byte) -34)) {
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

    final boolean a(ae param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ae var5 = null;
        ae var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        ae stackIn_8_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == this.field_w) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = this.field_w.length - 1;
              L1: while (true) {
                if ((var4_int ^ -1) > -1) {
                  if (param1 == -14) {
                    stackIn_21_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    field_u = (int[]) null;
                    return false;
                  }
                } else {
                  var5 = this.field_w[var4_int];
                  stackIn_8_0 = (ae) (var5);
                  L2: {
                    if (stackIn_8_0 == null) {
                      break L2;
                    } else {
                      if (!var5.b((byte) -34)) {
                        break L2;
                      } else {
                        var4_int = var4_int - param2;
                        L3: while (true) {
                          if (-1 < (var4_int ^ -1)) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_w[var4_int];
                              if (var6 == null) {
                                break L4;
                              } else {
                                if (!var6.a(param0, false)) {
                                  break L4;
                                } else {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                            var4_int = var4_int - param2;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int--;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("rva.UA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        ae[] var7 = null;
        int var8 = 0;
        ae var9 = null;
        int var10 = 0;
        ae var11 = null;
        ae[] var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == this.field_w) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 59) {
                  break L1;
                } else {
                  var11 = (ae) null;
                  this.a(103, (ae) null, -84);
                  break L1;
                }
              }
              var12 = this.field_w;
              var7 = var12;
              var8 = 0;
              L2: while (true) {
                if (var8 >= var12.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var12[var8];
                    if (var9 != null) {
                      var9.a((byte) 59, param1, param2, this.field_i + param3, this.field_n + param4, param5);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("rva.Q(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        ae[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ae var7 = null;
        int var8 = 0;
        ae[] var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_w == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = this.field_w;
                var5 = var9;
                if (param3) {
                  break L1;
                } else {
                  this.a(true);
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var9.length <= var6) {
                  var5_int = param2;
                  if (80 == var5_int) {
                    L3: {
                      if (oj.field_tb[81]) {
                        stackIn_20_0 = this.a(param1, 1);
                        break L3;
                      } else {
                        stackIn_20_0 = this.a((byte) 43, param1);
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
                      if (!var7.b((byte) -34)) {
                        break L4;
                      } else {
                        if (!var7.a(param0, param1, param2, true)) {
                          break L4;
                        } else {
                          stackIn_13_0 = 1;
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5_ref);

            stackIn_23_1 = new StringBuilder().append("rva.P(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            Class var2 = (Class) null;
            rva.a((Class) null, (byte) -126);
        }
        field_u = null;
        field_v = null;
    }

    final void f(byte param0) {
        ae[] var2;
        int var3;
        int var4;
        ae var5;
        int var6;
        ae[] var7;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = this.field_w;
        var2 = var7;
        var3 = 99 / ((param0 - -38) / 60);
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.f((byte) -128);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    abstract void a(byte param0);

    final String d(byte param0) {
        ae[] var2;
        int var3;
        ae var4;
        int var6;
        ae[] var7;
        String var5;
        var6 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_w) {
          var7 = this.field_w;
          var2 = var7;
          var3 = 0;
          L0: while (true) {
            if (var7.length <= var3) {
              var3 = 103 % ((param0 - -58) / 60);
              return null;
            } else {
              var4 = var7[var3];
              if (var4 != null) {
                var5 = var4.d((byte) 4);
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

    void a(int param0, int param1, int param2, int param3) {
        int var5;
        ae var6;
        int var7;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 != param3) {
            break L0;
          } else {
            if (this.field_r == null) {
              break L0;
            } else {
              this.field_r.a((ae) (this), param0, 16777215, param1, true);
              break L0;
            }
          }
        }
        L1: {
          if (null == this.field_w) {
            break L1;
          } else {
            var5 = this.field_w.length - 1;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = this.field_w[var5];
                if (var6 != null) {
                  var6.a(this.field_i + param0, this.field_n + param1, 0, param3);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        int var6 = 0;
        ae var7 = null;
        int var8 = 0;
        int var9 = 0;
        ae[] var10 = null;
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
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_w == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var10 = this.field_w;
                if (param2 > 121) {
                  break L1;
                } else {
                  field_v = (jpa) null;
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var6 >= var10.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var10[var6];
                  discarded$4 = param3.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (param1 < var8) {
                      L4: {
                        if (var7 == null) {
                          discarded$5 = param3.append("null");
                          break L4;
                        } else {
                          var7.a(1 + param1, param0, param3, 0);
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      discarded$6 = param3.append(' ');
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

            stackIn_18_1 = new StringBuilder().append("rva.TA(");

            if (param0 == null) {
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


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, ae param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ae var5 = null;
        ae var6 = null;
        int var7 = 0;
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
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_w == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = param2;
              L1: while (true) {
                if (var4_int >= this.field_w.length) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = this.field_w[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (var5.b((byte) -34)) {
                        var4_int = var4_int + param0;
                        L3: while (true) {
                          if (var4_int >= this.field_w.length) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_w[var4_int];
                              if (var6 == null) {
                                break L4;
                              } else {
                                if (var6.a(param1, false)) {
                                  stackIn_16_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var4_int = var4_int + param0;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("rva.AB(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
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

    rva(int param0, int param1, int param2, int param3, isa param4) {
        super(param0, param1, param2, param3, param4, (qc) null);
    }

    final int a(boolean param0) {
        int var2;
        ae[] var3;
        int var4;
        ae var5;
        int var7;
        int var6;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = this.field_w;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_v = (jpa) null;
                break L1;
              }
            }
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a(false);
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

    final boolean b(byte param0) {
        if (param0 != -34) {
            this.a((byte) 29);
        }
        return this.a(-49) != null ? true : false;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
              if (!this.a((byte) -122, param0, param1, param2)) {
                break L1;
              } else {
                this.a(1, param2, param1, param0);
                this.a(param1, param0, 123, param2);
                break L1;
              }
            }
            L2: {
              if (param3 == 0) {
                break L2;
              } else {
                this.field_w = (ae[]) null;
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("rva.R(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final static String a(Class param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
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
              if (param1 < -44) {
                break L1;
              } else {
                field_v = (jpa) null;
                break L1;
              }
            }
            if (!param0.isArray()) {
              stackIn_6_0 = param0.getName().substring(1 + param0.getName().lastIndexOf("."));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = rva.a(param0.getComponentType(), (byte) -57) + "[]";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("rva.VA(");

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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final boolean a(byte param0, ae param1) {
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
              if (param0 == 43) {
                break L1;
              } else {
                this.field_w = (ae[]) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(1, param1, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("rva.CB(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    boolean a(ae param0, boolean param1) {
        ae[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ae var5 = null;
        int var6 = 0;
        ae[] var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.b((byte) -65);
                break L1;
              }
            }
            var7 = this.field_w;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    if (!var5.a(param0, param1)) {
                      break L3;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("rva.S(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        ae[] var5 = null;
        int var6 = 0;
        ae var7 = null;
        int var8 = 0;
        ae[] var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (null == this.field_w) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = this.field_w;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 != null) {
                      var7.a(this.field_i + param0, 2097152, param2, param3 - -this.field_n);
                      break L2;
                    } else {
                      break L2;
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
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5_ref);

            stackIn_13_1 = new StringBuilder().append("rva.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(ae param0, int param1) {
        RuntimeException var3 = null;
        ae var4 = null;
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
              if (param1 == 1) {
                break L1;
              } else {
                var4 = (ae) null;
                this.a(-74, -77, 93, 125, (ae) null, -41, 108);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, (byte) -14, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("rva.BB(");

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) 88);
    }

    boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        ae[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ae var10 = null;
        int var11 = 0;
        ae[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_w != null) {
              L1: {
                if (param6 == -1) {
                  break L1;
                } else {
                  this.field_w = (ae[]) null;
                  break L1;
                }
              }
              var12 = this.field_w;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.b((byte) -34)) {
                        break L3;
                      } else {
                        if (var10.a(param0, param1, param2, param3, param4, param5, param6 + 0)) {
                          stackIn_13_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var9++;
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
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8_ref);

            stackIn_19_1 = new StringBuilder().append("rva.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        ae[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ae var10 = null;
        int var11 = 0;
        ae var12 = null;
        ae[] var13 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_w == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 >= 70) {
                  break L1;
                } else {
                  var12 = (ae) null;
                  this.a((ae) null, 84);
                  break L1;
                }
              }
              var13 = this.field_w;
              var8 = var13;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var13.length) {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var13[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (var10.a(123, this.field_i + param1, this.field_n + param2, param3, param4, param5, param6)) {
                        stackIn_13_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L3;
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
            stackIn_19_0 = (RuntimeException) (var8_ref);

            stackIn_19_1 = new StringBuilder().append("rva.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    static {
        field_u = new int[8192];
    }
}
