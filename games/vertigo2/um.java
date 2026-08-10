/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class um extends iq implements dq {
    static String field_H;
    static qg field_E;
    static ee field_F;
    static String field_C;
    iq[] field_G;
    static String field_D;

    void a(boolean param0, int param1, int param2, int param3) {
        int var5;
        iq var6;
        int var7;
        ur stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        ur stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (!param0) {
          L0: {
            if (param1 != 0) {
              break L0;
            } else {
              if (this.field_B != null) {
                L1: {
                  stackIn_7_0 = this.field_B;

                  stackIn_7_1 = 1;

                  stackIn_7_2 = param2;

                  if (param0) {
                    stackIn_8_0 = (ur) ((Object) stackIn_7_0);
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = stackIn_7_2;
                    stackIn_8_3 = 0;
                    break L1;
                  } else {
                    stackIn_8_0 = (ur) ((Object) stackIn_7_0);
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = stackIn_7_2;
                    stackIn_8_3 = 1;
                    break L1;
                  }
                }
                ((ur) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2, stackIn_8_3 != 0, (iq) (this), param3);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (null == this.field_G) {
              break L2;
            } else {
              var5 = -1 + this.field_G.length;
              L3: while (true) {
                if (var5 < 0) {
                  break L2;
                } else {
                  var6 = this.field_G[var5];
                  if (var6 != null) {
                    var6.a(false, param1, param2 + this.field_o, this.field_t + param3);
                    var5--;
                    continue L3;
                  } else {
                    var5--;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, iq param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        iq var5 = null;
        iq var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_G == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = this.field_G.length - 1;
              L1: while (true) {
                if (0 > var4_int) {
                  if (param0 >= 90) {
                    stackIn_21_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    this.f(-89);
                    return false;
                  }
                } else {
                  L2: {
                    var5 = this.field_G[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.f(67)) {
                        break L2;
                      } else {
                        var4_int = var4_int - param2;
                        L3: while (true) {
                          if (0 > var4_int) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_G[var4_int];
                              if (var6 != null) {
                                if (!var6.a((byte) 116, param1)) {
                                  break L4;
                                } else {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L4;
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

            stackIn_24_1 = new StringBuilder().append("um.I(").append(param0).append(',');

            if (param1 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
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

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var9 = 0;
        iq var10 = null;
        int var11 = 0;
        iq var12 = null;
        iq[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (null != this.field_G) {
              L1: {
                var13 = this.field_G;
                var9 = 0;
                if (param5 <= -107) {
                  break L1;
                } else {
                  var12 = (iq) null;
                  this.a(-62, 27, -12, -87, -46, (byte) -68, (iq) null);
                  break L1;
                }
              }
              L2: while (true) {
                if (var13.length <= var9) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var13[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.a(param0, param1 - -this.field_o, this.field_t + param2, param3, param4, (byte) -128, param6)) {
                        break L3;
                      } else {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
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
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("um.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final int c(byte param0) {
        int var2;
        iq[] var3;
        int var4;
        iq var5;
        int var7;
        int var6;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          var2 = 0;
          var3 = this.field_G;
          if (param0 <= -97) {
            break L0;
          } else {
            field_H = (String) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.c((byte) -121);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, iq param6) {
        iq[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        iq var10_ref_iq = null;
        int var10 = 0;
        int var11 = 0;
        iq[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (null == this.field_G) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_G;
              var8 = var12;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var12.length) {
                  var10 = 29 / ((param5 - -87) / 35);
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var10_ref_iq = var12[var9];
                    if (var10_ref_iq == null) {
                      break L2;
                    } else {
                      if (!var10_ref_iq.f(111)) {
                        break L2;
                      } else {
                        if (!var10_ref_iq.a(param0, param1, param2, param3, param4, (byte) 120, param6)) {
                          break L2;
                        } else {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("um.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final String a(boolean param0) {
        iq[] var2;
        int var3;
        iq var4;
        int var6;
        iq[] var7;
        String var5;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (this.field_G != null) {
          var7 = this.field_G;
          var2 = var7;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var7.length) {
              if (param0) {
                field_F = (ee) null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var7[var3];
              if (var4 != null) {
                var5 = var4.a(false);
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

    final static void h(int param0) {
        gg var1 = null;
        int var2 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ri.field_r.b();
              mh.field_d.b();
              eh.field_c = eh.field_c - 1;
              if (eh.field_c == param0) {
                eh.field_c = 200;
                var1 = (gg) ((Object) fm.field_b.a((byte) 100));
                L2: while (true) {
                  if (var1 == null) {
                    if (ro.field_b != null) {
                      var1 = (gg) ((Object) ro.field_b.a((byte) 100));
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_q.b(86)) {
                              var1.c(2);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (gg) ((Object) ro.field_b.b(96));
                          continue L3;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (!var1.field_q.b(param0 + 91)) {
                        var1.c(2);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var1 = (gg) ((Object) fm.field_b.b(104));
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              L7: {
                if (qc.field_v == null) {
                  break L7;
                } else {
                  stackIn_19_0 = qc.field_v.g(-26083);
                  if (!stackIn_19_0) {
                    fo.field_e = null;
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              break L6;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref), "um.Q(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(!param0 ? true : false);
    }

    public static void a(int param0) {
        field_D = null;
        field_C = null;
        if (param0 <= 6) {
            return;
        }
        field_F = null;
        field_E = null;
        field_H = null;
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
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
            if (param2 == -79) {
              L1: {
                if (this.a(param3, -1, param1, param0)) {
                  this.a(param0, param3, true, param1);
                  this.a(param0, true, param3, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = (StringBuilder) (param3);
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

            stackIn_10_1 = new StringBuilder().append("um.FA(");

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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final void a(Hashtable param0, boolean param1, StringBuilder param2, int param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        int var6 = 0;
        iq var7 = null;
        int var8 = 0;
        int var9 = 0;
        iq[] var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_G != null) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_H = (String) null;
                  break L1;
                }
              }
              var10 = this.field_G;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var10.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var10[var6];
                  discarded$4 = param2.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (var8 > param3) {
                      L4: {
                        if (var7 == null) {
                          discarded$5 = param2.append("null");
                          break L4;
                        } else {
                          var7.a(param0, param3 - -1, (byte) -79, param2);
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      discarded$6 = param2.append(' ');
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("um.K(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final iq a(byte param0) {
        iq[] var2;
        int var3;
        int var4;
        iq var5;
        int var6;
        iq[] var7;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (this.field_G != null) {
          var7 = this.field_G;
          var2 = var7;
          var3 = 29 / ((param0 - 26) / 32);
          var4 = 0;
          L0: while (true) {
            if (var4 < var7.length) {
              var5 = var7[var4];
              if (var5 != null) {
                if (var5.f(28)) {
                  return var5;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final boolean f(int param0) {
        if (param0 <= 3) {
            this.f(-7);
        }
        return null != this.a((byte) -78) ? true : false;
    }

    final void d(byte param0) {
        iq[] var2;
        int var3;
        iq var4;
        int var5;
        iq[] var7;
        iq var6;
        var5 = Vertigo2.field_L ? 1 : 0;
        var7 = this.field_G;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var7.length <= var3) {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                var6 = (iq) null;
                this.a(101, -56, -30, -66, -25, (byte) -87, (iq) null);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.d((byte) 2);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(iq param0, byte param1) {
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
              if (param1 > 94) {
                break L1;
              } else {
                field_F = (ee) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(1, param0, (byte) -127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("um.P(");

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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    void a(byte param0, int param1, int param2, iq param3) {
        iq[] var5 = null;
        int var6 = 0;
        iq var7 = null;
        int var8 = 0;
        iq[] var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            super.a((byte) 49, param1, param2, param3);
            if (param0 > 6) {
              if (null == this.field_G) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var9 = this.field_G;
                var5 = var9;
                var6 = 0;
                L1: while (true) {
                  if (var9.length <= var6) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      var7 = var9[var6];
                      if (var7 != null) {
                        var7.a((byte) 46, this.field_o + param1, this.field_t + param2, param3);
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5_ref);

            stackIn_15_1 = new StringBuilder().append("um.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, long param1) {
        if (-1L <= (param1 ^ -1L)) {
            return;
        }
        if (!param0) {
            field_C = (String) null;
        }
        if ((param1 % 10L ^ -1L) != -1L) {
            an.a(param1, false);
        } else {
            an.a(-1L + param1, false);
            an.a(1L, false);
        }
    }

    private final boolean b(byte param0, iq param1) {
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
              if (param0 > 1) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(110, param1, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("um.O(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(byte param0, iq param1) {
        iq[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        iq var5 = null;
        int var6 = 0;
        iq[] var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 116) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            var7 = this.field_G;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    if (!var5.a((byte) 116, param1)) {
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

            stackIn_14_1 = new StringBuilder().append("um.DA(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    um(int param0, int param1, int param2, int param3, ur param4) {
        super(param0, param1, param2, param3, param4, (uf) null);
    }

    private final boolean a(int param0, iq param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        iq var5 = null;
        iq var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (null != this.field_G) {
              L1: {
                var4_int = 0;
                if (param2 <= -1) {
                  break L1;
                } else {
                  field_F = (ee) null;
                  break L1;
                }
              }
              L2: while (true) {
                if (this.field_G.length <= var4_int) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_G[var4_int];
                    if (null == var5) {
                      break L3;
                    } else {
                      if (!var5.f(65)) {
                        break L3;
                      } else {
                        var4_int = var4_int + param0;
                        L4: while (true) {
                          if (var4_int >= this.field_G.length) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_G[var4_int];
                              if (null != var6) {
                                if (!var6.a((byte) 116, param1)) {
                                  break L5;
                                } else {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var4_int = var4_int + param0;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
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
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("um.L(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        iq[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        iq var7 = null;
        int var8 = 0;
        iq[] var9 = null;
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
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_G != null) {
              L1: {
                if (param1 == 13) {
                  break L1;
                } else {
                  field_C = (String) null;
                  break L1;
                }
              }
              var9 = this.field_G;
              var5 = var9;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var9.length) {
                  var5_int = param2;
                  if (var5_int == 80) {
                    L3: {
                      if (!cr.field_eb[81]) {
                        stackIn_19_0 = this.a(param3, (byte) 121);
                        break L3;
                      } else {
                        stackIn_19_0 = this.b((byte) 104, param3);
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
                      if (!var7.f(param1 ^ 87)) {
                        break L4;
                      } else {
                        if (!var7.a(param0, 13, param2, param3)) {
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

            stackIn_22_1 = new StringBuilder().append("um.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
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

    abstract void b(boolean param0);

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        iq[] var7 = null;
        int var8 = 0;
        iq var9 = null;
        int var10 = 0;
        iq[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_G == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var11 = this.field_G;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var11.length) {
                  L2: {
                    if (param1 == 46) {
                      break L2;
                    } else {
                      this.a(true, -8, 46, -97);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 != null) {
                      var9.a(param0, (byte) 46, param2 - -this.field_o, this.field_t + param3, param4, param5);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("um.HA(");

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
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_H = "Match by...";
        field_C = "Year";
        field_D = "Show game chat from my friends";
    }
}
