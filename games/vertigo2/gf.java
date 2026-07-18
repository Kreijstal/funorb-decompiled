/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gf implements Iterator {
    static boolean field_g;
    private li field_i;
    private el field_a;
    static sq field_f;
    private li field_c;
    private int field_b;
    static tj field_h;
    static volatile int field_e;
    static int field_d;

    public final void remove() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((gf) this).field_c != null) {
              ((gf) this).field_c.c(2);
              ((gf) this).field_c = null;
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "gf.remove()");
        }
    }

    final static boolean a(boolean param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        Throwable var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (!param0) {
              break L0;
            } else {
              int discarded$3 = gf.b(16, 44, -77);
              break L0;
            }
          }
          var1 = (Object) (Object) kb.field_a;
          synchronized (var1) {
            L1: {
              if (ah.field_l == rq.field_B) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                de.field_f = wm.field_j[rq.field_B];
                ji.field_r = af.field_F[rq.field_B];
                rq.field_B = 127 & rq.field_B + 1;
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1_ref, "gf.D(" + param0 + ')');
        }
    }

    public final boolean hasNext() {
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (((gf) this).field_a.field_f[((gf) this).field_b - 1] != ((gf) this).field_i) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: while (true) {
                if (~((gf) this).field_b <= ~((gf) this).field_a.field_c) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    int fieldTemp$2 = ((gf) this).field_b;
                    ((gf) this).field_b = ((gf) this).field_b + 1;
                    if (((gf) this).field_a.field_f[fieldTemp$2].field_c != ((gf) this).field_a.field_f[-1 + ((gf) this).field_b]) {
                      break L2;
                    } else {
                      ((gf) this).field_i = ((gf) this).field_a.field_f[-1 + ((gf) this).field_b];
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((gf) this).field_i = ((gf) this).field_a.field_f[((gf) this).field_b + -1].field_c;
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "gf.hasNext()");
        }
        return stackIn_14_0 != 0;
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -99) {
                break L1;
              } else {
                this.a(-22);
                break L1;
              }
            }
            ((gf) this).field_i = ((gf) this).field_a.field_f[0].field_c;
            ((gf) this).field_b = 1;
            ((gf) this).field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "gf.A(" + param0 + ')');
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -41) {
                break L1;
              } else {
                boolean discarded$2 = gf.a(false);
                break L1;
              }
            }
            L2: {
              L3: {
                if (qb.field_d == null) {
                  break L3;
                } else {
                  if (null == qb.field_d.k(0)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "gf.F(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static int b(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param2 == -28631) {
              L1: {
                if (param0 != 1) {
                  break L1;
                } else {
                  if (ti.a(param1, false)) {
                    stackOut_9_0 = 29;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_11_0 = ni.field_b[param0];
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_1_0 = -21;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var3, "gf.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    public final Object next() {
        li var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        li stackIn_5_0 = null;
        li stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_4_0 = null;
        li stackOut_10_0 = null;
        Object stackOut_13_0 = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (((gf) this).field_i != ((gf) this).field_a.field_f[-1 + ((gf) this).field_b]) {
              var1 = ((gf) this).field_i;
              ((gf) this).field_i = var1.field_c;
              ((gf) this).field_c = var1;
              stackOut_4_0 = (li) var1;
              stackIn_5_0 = stackOut_4_0;
              return (Object) (Object) stackIn_5_0;
            } else {
              L1: while (true) {
                L2: {
                  if (~((gf) this).field_a.field_c >= ~((gf) this).field_b) {
                    break L2;
                  } else {
                    int fieldTemp$2 = ((gf) this).field_b;
                    ((gf) this).field_b = ((gf) this).field_b + 1;
                    var1 = ((gf) this).field_a.field_f[fieldTemp$2].field_c;
                    if (var1 != ((gf) this).field_a.field_f[-1 + ((gf) this).field_b]) {
                      ((gf) this).field_c = var1;
                      ((gf) this).field_i = var1.field_c;
                      stackOut_10_0 = (li) var1;
                      stackIn_11_0 = stackOut_10_0;
                      return (Object) (Object) stackIn_11_0;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_13_0 = null;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1_ref, "gf.next()");
        }
        return stackIn_14_0;
    }

    final static boolean a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_49_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_97_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_48_0 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 28) {
                break L1;
              } else {
                boolean discarded$4 = gf.a((byte) -67);
                break L1;
              }
            }
            L2: {
              var3_int = 1;
              if (nb.field_z) {
                break L2;
              } else {
                if (null != gk.field_c) {
                  break L2;
                } else {
                  var3_int = 0;
                  break L2;
                }
              }
            }
            L3: {
              if (ui.field_g != 0) {
                break L3;
              } else {
                if (null == sj.field_d) {
                  break L3;
                } else {
                  var3_int = 0;
                  break L3;
                }
              }
            }
            L4: {
              if (ui.field_g != 2) {
                break L4;
              } else {
                if (dh.a((byte) 127)) {
                  break L4;
                } else {
                  var3_int = 0;
                  break L4;
                }
              }
            }
            if (de.field_f != 84) {
              if (de.field_f != 85) {
                var4 = ji.field_r;
                if (p.a(376, (char) var4)) {
                  L5: {
                    if (var3_int == 0) {
                      break L5;
                    } else {
                      if (fb.field_D.length() >= 80) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            StringBuilder discarded$5 = fb.field_D.append((char) var4);
                            var5 = 485;
                            var6 = qe.field_V;
                            var6 = jk.a(15709, var6);
                            if (ui.field_g != 2) {
                              break L7;
                            } else {
                              L8: {
                                L9: {
                                  var7 = Vertigo2.a(new String[1], di.field_B, -117);
                                  var8 = Vertigo2.a(new String[1], af.field_L, 15);
                                  var9 = cg.field_f.c(var7);
                                  var10 = cg.field_f.c(var8);
                                  if (var10 >= var9) {
                                    break L9;
                                  } else {
                                    var5 = var5 - var9;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var5 = var5 - var10;
                                break L8;
                              }
                              if (var11 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L10: {
                            var7 = "";
                            if (ui.field_g == 0) {
                              L11: {
                                if (gd.field_j != null) {
                                  break L11;
                                } else {
                                  if (fq.field_i) {
                                    var7 = "[" + fb.field_A + "] ";
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (gd.field_j == null) {
                                break L10;
                              } else {
                                L12: {
                                  L13: {
                                    if (!ar.field_t) {
                                      break L13;
                                    } else {
                                      if (null != v.field_a) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var7 = "[" + Vertigo2.a(new String[1], ie.field_Rb, -112) + "] ";
                                  if (var11 == 0) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                }
                                var7 = "[" + v.field_a + "] ";
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          var7 = var7 + var6 + ": ";
                          var5 = var5 - cg.field_f.c(var7);
                          break L6;
                        }
                        if (cg.field_f.c(fb.field_D.toString()) > var5) {
                          StringBuilder discarded$6 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_97_0 = 1;
                  stackIn_98_0 = stackOut_97_0;
                  return stackIn_98_0 != 0;
                } else {
                  stackOut_99_0 = 0;
                  stackIn_100_0 = stackOut_99_0;
                  break L0;
                }
              } else {
                L14: {
                  if (var3_int == 0) {
                    break L14;
                  } else {
                    if (0 >= fb.field_D.length()) {
                      break L14;
                    } else {
                      StringBuilder discarded$7 = w.a(true, ' ', fb.field_D.length() + -1, fb.field_D);
                      break L14;
                    }
                  }
                }
                stackOut_59_0 = 1;
                stackIn_60_0 = stackOut_59_0;
                return stackIn_60_0 != 0;
              }
            } else {
              L15: {
                L16: {
                  if (var3_int != 0) {
                    break L16;
                  } else {
                    if (ui.field_g == 0) {
                      break L15;
                    } else {
                      fb.h(0);
                      if (var11 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                L17: {
                  if (0 >= fb.field_D.length()) {
                    break L17;
                  } else {
                    L18: {
                      var4_ref_String = fb.field_D.toString();
                      if (!wn.a(var4_ref_String, 0)) {
                        break L18;
                      } else {
                        dh.a((byte) -123, pd.field_b, 2, (String) null, 0, (String) null);
                        dh.a((byte) -7, ch.field_f, 2, (String) null, 0, (String) null);
                        if (var11 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      var5 = ui.field_g;
                      if (var5 != 0) {
                        break L19;
                      } else {
                        if (gd.field_j != null) {
                          var5 = 1;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (ab.a(0, var5) != 2) {
                        break L20;
                      } else {
                        cf.a(var5, 1, param0, (byte) 118);
                        break L20;
                      }
                    }
                    tf.a(ui.field_g, ea.field_b, -117, var4_ref_String, param1, -1);
                    break L17;
                  }
                }
                fb.h(0);
                break L15;
              }
              stackOut_48_0 = 1;
              stackIn_49_0 = stackOut_48_0;
              return stackIn_49_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var3, "gf.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_100_0 != 0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_h = null;
              if (param0 < -11) {
                break L1;
              } else {
                field_e = -67;
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "gf.E(" + param0 + ')');
        }
    }

    gf(el param0) {
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
        ((gf) this).field_c = null;
        try {
          L0: {
            ((gf) this).field_a = param0;
            this.a(-120);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gf.<init>(");
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
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
        field_f = new sq();
        field_e = 0;
        field_h = new tj();
        field_d = -1;
    }
}
