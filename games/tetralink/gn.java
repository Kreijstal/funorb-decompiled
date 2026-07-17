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
                Object var4 = null;
                boolean discarded$0 = ((gn) this).a(-79, 'Y', -110, (na) null);
            }
            ((gn) this).field_J.a((mc) (Object) param0, false);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "gn.BC(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            var8 = new tg(((gn) this).field_J);
            var9 = (na) (Object) var8.a(true);
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
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (na) (Object) var8.b((byte) -58);
                      continue L1;
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8_ref;
            stackOut_14_1 = new StringBuilder().append("gn.NA(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_13_0 != 0;
    }

    void a(na param0, int param1, int param2, boolean param3) {
        tg var5 = null;
        RuntimeException var5_ref = null;
        na var6 = null;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            super.a(param0, param1, param2, true);
            var5 = new tg(((gn) this).field_J);
            var6 = (na) (Object) var5.a(param3);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.a((byte) 95)) {
                    break L2;
                  } else {
                    var6.a(param0, ((gn) this).field_t + param1, param2 - -((gn) this).field_w, true);
                    var6 = (na) (Object) var5.b((byte) -58);
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
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("gn.MA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(byte param0, StringBuilder param1, int param2, Hashtable param3) {
        tg var5 = null;
        RuntimeException var5_ref = null;
        na var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
            var5 = new tg(((gn) this).field_J);
            var6 = (na) (Object) var5.a(true);
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                StringBuilder discarded$12 = param1.append(10);
                var7 = 0;
                L3: while (true) {
                  if (param2 < var7) {
                    StringBuilder discarded$13 = var6.a(param3, param1, 1 + param2, -372494750);
                    var6 = (na) (Object) var5.b((byte) -58);
                    continue L2;
                  } else {
                    StringBuilder discarded$14 = param1.append(32);
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
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("gn.CC(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final boolean c(int param0) {
        if (param0 != 3) {
            field_I = null;
        }
        return null != ((gn) this).d((byte) 5) ? true : false;
    }

    final boolean a(na param0, int param1) {
        tg var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            var3 = new tg(((gn) this).field_J);
            if (param1 == -384169950) {
              var4 = (na) (Object) var3.a(true);
              L1: while (true) {
                if (var4 == null) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (!var4.a(param0, -384169950)) {
                    var4 = (na) (Object) var3.b((byte) -58);
                    continue L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("gn.EB(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (param1 > 107) {
              if (((gn) this).field_J.b(true)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var3 = new tg(((gn) this).field_J);
                var4 = (na) (Object) var3.a(true);
                L1: while (true) {
                  if (var4 == null) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.c(3)) {
                        break L2;
                      } else {
                        var5 = new tg(((gn) this).field_J);
                        mc discarded$2 = var5.a(-106, (mc) (Object) var4);
                        var6 = (na) (Object) var5.b((byte) -58);
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param0, -384169950)) {
                              stackOut_15_0 = 1;
                              stackIn_16_0 = stackOut_15_0;
                              return stackIn_16_0 != 0;
                            } else {
                              var6 = (na) (Object) var5.b((byte) -58);
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (na) (Object) var3.b((byte) -58);
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("gn.WB(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
        return stackIn_20_0 != 0;
    }

    private final void g(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(((gn) this).field_J);
        na var3 = (na) (Object) var2.a(true);
        while (var3 != null) {
            var3.b((byte) 123);
            var3 = (na) (Object) var2.b((byte) -58);
        }
    }

    String e(int param0) {
        tg var2 = null;
        na var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = TetraLink.field_J;
          var2 = new tg(((gn) this).field_J);
          var3 = (na) (Object) var2.a(true);
          if (param0 == 0) {
            break L0;
          } else {
            ((gn) this).field_J = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.e(0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (na) (Object) var2.b((byte) -58);
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
        if (param3 == 0) {
            if (((gn) this).field_H != null) {
                ((gn) this).field_H.a((na) this, param1, param2, true, true);
            }
        }
        tg var5 = new tg(((gn) this).field_J);
        na var6 = (na) (Object) var5.b(param0 + 90);
        while (var6 != null) {
            var6.a(0, ((gn) this).field_t + param1, param2 - -((gn) this).field_w, param3);
            var6 = (na) (Object) var5.a((byte) -66);
        }
    }

    final int d(int param0) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        int var2 = 0;
        tg var3 = new tg(((gn) this).field_J);
        na var4 = (na) (Object) var3.a(true);
        while (var4 != null) {
            var5 = var4.d(-128);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (na) (Object) var3.b((byte) -58);
        }
        if (param0 > -114) {
            field_I = null;
        }
        return var2;
    }

    na d(byte param0) {
        tg var2 = null;
        na var3 = null;
        int var4 = 0;
        L0: {
          var4 = TetraLink.field_J;
          if (param0 == 5) {
            break L0;
          } else {
            ((gn) this).field_J = null;
            break L0;
          }
        }
        var2 = new tg(((gn) this).field_J);
        var3 = (na) (Object) var2.a(true);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.c(3)) {
              var3 = (na) (Object) var2.b((byte) -58);
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
        ((gn) this).field_J = new je();
    }

    final static void a(int param0, int param1, int param2, byte[] param3, int[] param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (var5_int >= ug.field_bb.length) {
                break L0;
              } else {
                param1 = ug.field_bb[var5_int];
                var6 = var5_int << 4;
                L2: while (true) {
                  int incrementValue$12 = param1;
                  param1--;
                  if (0 == incrementValue$12) {
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$13 = var6;
                    var6++;
                    param2 = lg.field_ab[incrementValue$13];
                    param4[param3[param2]] = param4[param3[param2]] + 1;
                    lg.field_ab[param4[param3[param2]]] = param2;
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
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("gn.EC(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final boolean d(na param0, int param1) {
        tg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        na var5 = null;
        tg var6 = null;
        na var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            if (((gn) this).field_J.b(true)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3 = new tg(((gn) this).field_J);
              var4 = 71 % ((-40 - param1) / 53);
              var5 = (na) (Object) var3.b(-55);
              L1: while (true) {
                if (var5 == null) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L2: {
                    if (!var5.c(3)) {
                      break L2;
                    } else {
                      var6 = new tg(((gn) this).field_J);
                      mc discarded$2 = var6.a(true, (mc) (Object) var5);
                      var7 = (na) (Object) var6.a((byte) -66);
                      L3: while (true) {
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (var7.a(param0, -384169950)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            var7 = (na) (Object) var6.a((byte) -66);
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var5 = (na) (Object) var3.a((byte) -66);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("gn.AC(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_17_0 != 0;
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        na var9 = null;
        int var10 = 0;
        Object var11 = null;
        tg var12 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var12 = new tg(((gn) this).field_J);
              if (param4 == -32738) {
                break L1;
              } else {
                var11 = null;
                boolean discarded$2 = ((gn) this).b((na) null, 58);
                break L1;
              }
            }
            var9 = (na) (Object) var12.a(true);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.a((byte) 95)) {
                    break L3;
                  } else {
                    if (var9.a(param0, param1 + ((gn) this).field_t, param2, param3 - -((gn) this).field_w, -32738, param5, param6)) {
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    } else {
                      var9 = (na) (Object) var12.b((byte) -58);
                      continue L2;
                    }
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("gn.PA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (((gn) this).a(param0, param2, param3 ^ -372494754, param1)) {
                ((gn) this).a(param3 + 372494636, param1, param0, param2);
                this.a((byte) 14, param1, param2, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 == -372494750) {
              stackOut_6_0 = (StringBuilder) param1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (StringBuilder) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("gn.WA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final void f(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(((gn) this).field_J);
        na var3 = (na) (Object) var2.a(true);
        while (var3 != null) {
            var3.f(-126);
            var3 = (na) (Object) var2.b((byte) -58);
        }
        if (param0 >= -63) {
            ((gn) this).field_J = null;
        }
    }

    public static void d(boolean param0) {
        field_I = null;
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        tg var7 = null;
        RuntimeException var7_ref = null;
        na var8 = null;
        int var9 = 0;
        Object var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var7 = new tg(((gn) this).field_J);
              if (!param1) {
                break L1;
              } else {
                var10 = null;
                ((gn) this).a((na) null, 63, -119, false);
                break L1;
              }
            }
            var8 = (na) (Object) var7.a(true);
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.a((byte) 95)) {
                    break L3;
                  } else {
                    var8.a(param0, false, param2, param3 + ((gn) this).field_w, param4, param5 + ((gn) this).field_t);
                    var8 = (na) (Object) var7.b((byte) -58);
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
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("gn.AB(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        tg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        na var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        boolean stackOut_17_0 = false;
        boolean stackOut_16_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (param2 == 1) {
              var5 = new tg(((gn) this).field_J);
              var8 = (na) (Object) var5.a(true);
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
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            return stackIn_11_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var8 = (na) (Object) var5.b((byte) -58);
                      continue L1;
                    }
                  }
                }
                var6 = param0;
                if (var6 == 80) {
                  L4: {
                    if (!sn.field_a[81]) {
                      stackOut_17_0 = ((gn) this).b(param3, param2 ^ 114);
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      stackOut_16_0 = ((gn) this).d(param3, -99);
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("gn.DB(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    static {
    }
}
