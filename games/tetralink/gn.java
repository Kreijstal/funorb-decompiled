/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gn extends na implements nf {
    static hl field_I;
    je field_J;

    final void c(na param0, int param1) {
        try {
            if (param1 != 10) {
                na var4 = (na) null;
                this.a(-79, 'Y', -110, (na) null);
            }
            this.field_J.a(param0, false);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "gn.BC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, na param1, int param2, int param3, int param4, int param5, int param6) {
        tg var8 = null;
        RuntimeException var8_ref = null;
        na var9 = null;
        int var10 = 0;
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
        var10 = TetraLink.field_J;
        try {
          L0: {
            var8 = new tg(this.field_J);
            var9 = (na) ((Object) var8.a(true));
            if (param0 == -19137) {
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.a((byte) 95)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var9.c(param0 ^ -19140)) {
                          break L3;
                        } else {
                          if (var9.a(-19137, param1, param2, param3, param4, param5, param6)) {
                            stackIn_10_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (na) ((Object) var8.b((byte) -58));
                      continue L1;
                    }
                  }
                }
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
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
            var8_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8_ref);

            stackIn_16_1 = new StringBuilder().append("gn.NA(").append(param0).append(',');

            if (param1 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    void a(na param0, int param1, int param2, boolean param3) {
        tg var5 = null;
        na var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            super.a(param0, param1, param2, true);
            var5 = new tg(this.field_J);
            var6 = (na) ((Object) var5.a(param3));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.a((byte) 95)) {
                    break L2;
                  } else {
                    var6.a(param0, this.field_t + param1, param2 - -this.field_w, true);
                    var6 = (na) ((Object) var5.b((byte) -58));
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

            stackIn_8_1 = new StringBuilder().append("gn.MA(");

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
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        tg var5 = null;
        na var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 14) {
                break L1;
              } else {
                gn.d(true);
                break L1;
              }
            }
            var5 = new tg(this.field_J);
            var6 = (na) ((Object) var5.a(true));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param1.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param2 < var7) {
                    var6.a(param3, param1, 1 + param2, -372494750);
                    var6 = (na) ((Object) var5.b((byte) -58));
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
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("gn.CC(").append(param0).append(',');

            if (param1 == null) {
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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 != 3) {
            field_I = (hl) null;
        }
        return null != this.d((byte) 5) ? true : false;
    }

    final boolean a(na param0, int param1) {
        tg var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
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
        var5 = TetraLink.field_J;
        try {
          L0: {
            var3 = new tg(this.field_J);
            if (param1 == -384169950) {
              var4 = (na) ((Object) var3.a(true));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!var4.a(param0, -384169950)) {
                    var4 = (na) ((Object) var3.b((byte) -58));
                    continue L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("gn.EB(");

            if (param0 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
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

    final boolean b(na param0, int param1) {
        tg var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        tg var5 = null;
        na var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (param1 > 107) {
              if (this.field_J.b(true)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = new tg(this.field_J);
                var4 = (na) ((Object) var3.a(true));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_20_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.c(3)) {
                        break L2;
                      } else {
                        var5 = new tg(this.field_J);
                        var5.a(-106, var4);
                        var6 = (na) ((Object) var5.b((byte) -58));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param0, -384169950)) {
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var6 = (na) ((Object) var5.b((byte) -58));
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (na) ((Object) var3.b((byte) -58));
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3_ref);

            stackIn_23_1 = new StringBuilder().append("gn.WB(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    private final void g(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(this.field_J);
        na var3 = (na) ((Object) var2.a(true));
        while (var3 != null) {
            var3.b((byte) 123);
            var3 = (na) ((Object) var2.b((byte) -58));
        }
        if (param0 <= 39) {
            this.field_J = (je) null;
        }
    }

    String e(int param0) {
        tg var2;
        na var3;
        String var4;
        int var5;
        L0: {
          var5 = TetraLink.field_J;
          var2 = new tg(this.field_J);
          var3 = (na) ((Object) var2.a(true));
          if (param0 == 0) {
            break L0;
          } else {
            this.field_J = (je) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.e(0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (na) ((Object) var2.b((byte) -58));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 67 % ((-61 - param2) / 51);
        super.a(param0, param1, 15, param3, param4);
        this.g(55);
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = TetraLink.field_J;
        if (param0 != 0) {
            return;
        }
        if (-1 == (param3 ^ -1) && this.field_H != null) {
            this.field_H.a((na) (this), param1, param2, true, true);
        }
        tg var5 = new tg(this.field_J);
        na var6 = (na) ((Object) var5.b(param0 + 90));
        while (var6 != null) {
            var6.a(0, this.field_t + param1, param2 - -this.field_w, param3);
            var6 = (na) ((Object) var5.a((byte) -66));
        }
    }

    final int d(int param0) {
        int var2;
        tg var3;
        na var4;
        int var5;
        int var6;
        var6 = TetraLink.field_J;
        var2 = 0;
        var3 = new tg(this.field_J);
        var4 = (na) ((Object) var3.a(true));
        L0: while (true) {
          if (var4 == null) {
            L1: {
              if (param0 <= -114) {
                break L1;
              } else {
                field_I = (hl) null;
                break L1;
              }
            }
            return var2;
          } else {
            L2: {
              var5 = var4.d(-128);
              if (var2 < var5) {
                var2 = var5;
                break L2;
              } else {
                break L2;
              }
            }
            var4 = (na) ((Object) var3.b((byte) -58));
            continue L0;
          }
        }
    }

    na d(byte param0) {
        tg var2;
        na var3;
        int var4;
        L0: {
          var4 = TetraLink.field_J;
          if (param0 == 5) {
            break L0;
          } else {
            this.field_J = (je) null;
            break L0;
          }
        }
        var2 = new tg(this.field_J);
        var3 = (na) ((Object) var2.a(true));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.c(3)) {
              var3 = (na) ((Object) var2.b((byte) -58));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    gn(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4, (dn) null);
        this.field_J = new je();
    }

    final static void a(int param0, int param1, int param2, byte[] param3, int[] param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (var5_int >= ug.field_bb.length) {
                break L0;
              } else {
                param1 = ug.field_bb[var5_int];
                var6 = var5_int << 1329856036;
                L2: while (true) {
                  incrementValue$5 = param1;
                  param1--;
                  if (0 == incrementValue$5) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param2 = lg.field_ab[incrementValue$6];
                    dupTemp$7 = param3[param2];
                    dupTemp$8 = param4[dupTemp$7];
                    param4[dupTemp$7] = dupTemp$8 + 1;
                    lg.field_ab[dupTemp$8] = param2;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("gn.EC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    final boolean d(na param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        na var5 = null;
        tg var6 = null;
        na var7 = null;
        int var8 = 0;
        tg var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            if (this.field_J.b(true)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = new tg(this.field_J);
              var4 = 71 % ((-40 - param1) / 53);
              var5 = (na) ((Object) var9.b(-55));
              L1: while (true) {
                if (var5 == null) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (!var5.c(3)) {
                      break L2;
                    } else {
                      var6 = new tg(this.field_J);
                      var6.a(true, var5);
                      var7 = (na) ((Object) var6.a((byte) -66));
                      L3: while (true) {
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (var7.a(param0, -384169950)) {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var7 = (na) ((Object) var6.a((byte) -66));
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var5 = (na) ((Object) var9.a((byte) -66));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("gn.AC(");

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
          throw oi.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        na var9 = null;
        int var10 = 0;
        na var11 = null;
        tg var12 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var12 = new tg(this.field_J);
              if (param4 == -32738) {
                break L1;
              } else {
                var11 = (na) null;
                this.b((na) null, 58);
                break L1;
              }
            }
            var9 = (na) ((Object) var12.a(true));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.a((byte) 95)) {
                    break L3;
                  } else {
                    if (var9.a(param0, param1 + this.field_t, param2, param3 - -this.field_w, -32738, param5, param6)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9 = (na) ((Object) var12.b((byte) -58));
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
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("gn.PA(");

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
          throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
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
            L1: {
              if (this.a(param0, param2, param3 ^ -372494754, param1)) {
                this.a(param3 + 372494636, param1, param0, param2);
                this.a((byte) 14, param1, param2, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 == -372494750) {
              stackIn_7_0 = (StringBuilder) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("gn.WA(");

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void f(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(this.field_J);
        na var3 = (na) ((Object) var2.a(true));
        while (var3 != null) {
            var3.f(-126);
            var3 = (na) ((Object) var2.b((byte) -58));
        }
        if (param0 >= -63) {
            this.field_J = (je) null;
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
            field_I = (hl) null;
        }
        field_I = null;
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        tg var7 = null;
        na var8 = null;
        int var9 = 0;
        na var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var7 = new tg(this.field_J);
              if (!param1) {
                break L1;
              } else {
                var10 = (na) null;
                this.a((na) null, 63, -119, false);
                break L1;
              }
            }
            var8 = (na) ((Object) var7.a(true));
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.a((byte) 95)) {
                    break L3;
                  } else {
                    var8.a(param0, false, param2, param3 + this.field_w, param4, param5 + this.field_t);
                    var8 = (na) ((Object) var7.b((byte) -58));
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
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("gn.AB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        na var8 = null;
        tg var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (param2 == 1) {
              var9 = new tg(this.field_J);
              var8 = (na) ((Object) var9.a(true));
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.a((byte) 95)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var8.c(3)) {
                          break L3;
                        } else {
                          if (var8.a(param0, param1, 1, param3)) {
                            stackIn_11_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var8 = (na) ((Object) var9.b((byte) -58));
                      continue L1;
                    }
                  }
                }
                var6 = param0;
                if (var6 == 80) {
                  L4: {
                    if (!sn.field_a[81]) {
                      stackIn_18_0 = this.b(param3, param2 ^ 114);
                      break L4;
                    } else {
                      stackIn_18_0 = this.d(param3, -99);
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
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
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("gn.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    static {
    }
}
