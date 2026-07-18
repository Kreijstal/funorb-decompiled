/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j implements Iterator {
    static float field_i;
    private l field_f;
    static int field_e;
    private l field_d;
    static boolean field_g;
    private int field_c;
    static mg[] field_k;
    static e field_h;
    static int field_l;
    static int field_b;
    static String field_a;
    private gk field_j;

    public static void b(int param0) {
        try {
            field_k = null;
            int var1_int = 97 % ((-32 - param0) / 44);
            field_a = null;
            field_h = null;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "j.B(" + param0 + ')');
        }
    }

    public final boolean hasNext() {
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (((j) this).field_j.field_h[((j) this).field_c + -1] != ((j) this).field_d) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: while (true) {
                L2: {
                  if (~((j) this).field_c <= ~((j) this).field_j.field_a) {
                    break L2;
                  } else {
                    int fieldTemp$2 = ((j) this).field_c;
                    ((j) this).field_c = ((j) this).field_c + 1;
                    if (((j) this).field_j.field_h[fieldTemp$2].field_f == ((j) this).field_j.field_h[-1 + ((j) this).field_c]) {
                      ((j) this).field_d = ((j) this).field_j.field_h[-1 + ((j) this).field_c];
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      ((j) this).field_d = ((j) this).field_j.field_h[((j) this).field_c + -1].field_f;
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "j.hasNext()");
        }
        return stackIn_12_0 != 0;
    }

    public final Object next() {
        l var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        l stackIn_3_0 = null;
        l stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_8_0 = null;
        Object stackOut_11_0 = null;
        l stackOut_2_0 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (((j) this).field_d == ((j) this).field_j.field_h[-1 + ((j) this).field_c]) {
              L1: while (true) {
                L2: {
                  if (~((j) this).field_c <= ~((j) this).field_j.field_a) {
                    break L2;
                  } else {
                    int fieldTemp$2 = ((j) this).field_c;
                    ((j) this).field_c = ((j) this).field_c + 1;
                    var1 = ((j) this).field_j.field_h[fieldTemp$2].field_f;
                    if (var1 != ((j) this).field_j.field_h[((j) this).field_c + -1]) {
                      ((j) this).field_d = var1.field_f;
                      ((j) this).field_f = var1;
                      stackOut_8_0 = (l) var1;
                      stackIn_9_0 = stackOut_8_0;
                      return (Object) (Object) stackIn_9_0;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              var1 = ((j) this).field_d;
              ((j) this).field_d = var1.field_f;
              ((j) this).field_f = var1;
              stackOut_2_0 = (l) var1;
              stackIn_3_0 = stackOut_2_0;
              return (Object) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1_ref, "j.next()");
        }
        return stackIn_12_0;
    }

    final static gh a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        gh var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        gh stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        gh stackOut_21_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == oa.field_h) {
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  if (0 != param1.length()) {
                    var2 = c.a((CharSequence) (Object) param1, true);
                    if (null == var2) {
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      return (gh) (Object) stackIn_14_0;
                    } else {
                      if (param0 == 0) {
                        var3 = (gh) (Object) oa.field_h.a((long)var2.hashCode(), (byte) 82);
                        L2: while (true) {
                          L3: {
                            if (null == var3) {
                              break L3;
                            } else {
                              var4 = c.a((CharSequence) (Object) var3.field_Hb, true);
                              if (!var4.equals((Object) (Object) var2)) {
                                var3 = (gh) (Object) oa.field_h.c(48);
                                if (var5 == 0) {
                                  continue L2;
                                } else {
                                  break L3;
                                }
                              } else {
                                stackOut_21_0 = (gh) var3;
                                stackIn_22_0 = stackOut_21_0;
                                return stackIn_22_0;
                              }
                            }
                          }
                          stackOut_24_0 = null;
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        }
                      } else {
                        stackOut_16_0 = null;
                        stackIn_17_0 = stackOut_16_0;
                        return (gh) (Object) stackIn_17_0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_8_0 = null;
            stackIn_9_0 = stackOut_8_0;
            return (gh) (Object) stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2_ref;
            stackOut_26_1 = new StringBuilder().append("j.E(").append(param0).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return (gh) (Object) stackIn_25_0;
    }

    private final void a(boolean param0) {
        if (param0) {
            return;
        }
        try {
            ((j) this).field_d = ((j) this).field_j.field_h[0].field_f;
            ((j) this).field_c = 1;
            ((j) this).field_f = null;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "j.A(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        try {
            vc.a(false, param0, -16113);
            if (param1 > -124) {
                j.a(true, 95);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "j.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static hh a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hh stackIn_5_0 = null;
        hh stackIn_8_0 = null;
        hh stackIn_16_0 = null;
        int stackIn_26_0 = 0;
        hh stackIn_34_0 = null;
        Object stackIn_38_0 = null;
        hh stackIn_52_0 = null;
        hh stackIn_58_0 = null;
        Object stackIn_62_0 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_4_0 = null;
        hh stackOut_15_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        hh stackOut_33_0 = null;
        Object stackOut_37_0 = null;
        hh stackOut_51_0 = null;
        hh stackOut_57_0 = null;
        Object stackOut_61_0 = null;
        hh stackOut_7_0 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_4_0 = a.field_H;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (var2_int <= 64) {
                if (param0.charAt(0) == 34) {
                  if (param0.charAt(-1 + var2_int) != 34) {
                    stackOut_15_0 = jj.field_f;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      L2: {
                        if (-1 + var2_int <= var4) {
                          break L2;
                        } else {
                          L3: {
                            L4: {
                              var5 = param0.charAt(var4);
                              if (var5 != 92) {
                                break L4;
                              } else {
                                L5: {
                                  if (var3 != 0) {
                                    stackOut_25_0 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    break L5;
                                  } else {
                                    stackOut_23_0 = 1;
                                    stackIn_26_0 = stackOut_23_0;
                                    break L5;
                                  }
                                }
                                var3 = stackIn_26_0;
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L6: {
                              if (34 != var5) {
                                break L6;
                              } else {
                                if (var3 != 0) {
                                  break L6;
                                } else {
                                  stackOut_33_0 = jj.field_f;
                                  stackIn_34_0 = stackOut_33_0;
                                  return stackIn_34_0;
                                }
                              }
                            }
                            var3 = 0;
                            break L3;
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_38_0 = stackOut_37_0;
                      return (hh) (Object) stackIn_38_0;
                    }
                  }
                } else {
                  var3 = 0;
                  var4 = param1;
                  L7: while (true) {
                    L8: {
                      if (~var2_int >= ~var4) {
                        break L8;
                      } else {
                        L9: {
                          L10: {
                            var5 = param0.charAt(var4);
                            if (var5 != 46) {
                              break L10;
                            } else {
                              L11: {
                                if (var4 == 0) {
                                  break L11;
                                } else {
                                  if (~(-1 + var2_int) == ~var4) {
                                    break L11;
                                  } else {
                                    if (var3 == 0) {
                                      var3 = 1;
                                      if (var6 == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              stackOut_51_0 = jj.field_f;
                              stackIn_52_0 = stackOut_51_0;
                              return stackIn_52_0;
                            }
                          }
                          if (nf.field_b.indexOf(var5) != -1) {
                            var3 = 0;
                            break L9;
                          } else {
                            stackOut_57_0 = jj.field_f;
                            stackIn_58_0 = stackOut_57_0;
                            return stackIn_58_0;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    stackOut_61_0 = null;
                    stackIn_62_0 = stackOut_61_0;
                    break L0;
                  }
                }
              } else {
                stackOut_7_0 = cb.field_a;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var2;
            stackOut_63_1 = new StringBuilder().append("j.F(");
            stackIn_66_0 = stackOut_63_0;
            stackIn_66_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L12;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L12;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + ',' + param1 + ')');
        }
        return (hh) (Object) stackIn_62_0;
    }

    public final void remove() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((j) this).field_f) {
              throw new IllegalStateException();
            } else {
              ((j) this).field_f.a(false);
              ((j) this).field_f = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "j.remove()");
        }
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                j.a(true, -78);
                break L1;
              }
            }
            L2: {
              L3: {
                if (dj.field_n < 20) {
                  break L3;
                } else {
                  if (!me.b(9)) {
                    break L3;
                  } else {
                    L4: {
                      if (mf.field_h <= 0) {
                        break L4;
                      } else {
                        if (md.a(11265)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L2;
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "j.D(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    j(gk param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((j) this).field_f = null;
        try {
          L0: {
            ((j) this).field_j = param0;
            this.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("j.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_a = "Rankings";
    }
}
