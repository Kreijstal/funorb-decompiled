/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;
import java.applet.Applet;

final class va {
    private int field_b;
    private int field_d;
    int field_i;
    private int field_a;
    int field_h;
    int field_e;
    int field_g;
    private boolean field_c;
    private int field_f;

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int fieldTemp$8 = ((va) this).field_b + 1;
              ((va) this).field_b = ((va) this).field_b + 1;
              if (~fieldTemp$8 >= ~((va) this).field_f) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      if (!((va) this).field_c) {
                        break L4;
                      } else {
                        int fieldTemp$9 = ((va) this).field_g + 1;
                        ((va) this).field_g = ((va) this).field_g + 1;
                        if (~fieldTemp$9 < ~((va) this).field_a) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (((va) this).field_c) {
                      break L2;
                    } else {
                      int fieldTemp$10 = ((va) this).field_g - 1;
                      ((va) this).field_g = ((va) this).field_g - 1;
                      if (fieldTemp$10 >= ((va) this).field_a) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((va) this).field_g = ((va) this).field_d;
                  break L2;
                }
                ((va) this).field_b = 0;
                break L1;
              }
            }
            L5: {
              if (param0 >= 122) {
                break L5;
              } else {
                java.awt.Container discarded$11 = va.b((byte) -48);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "va.D(" + param0 + 41);
        }
    }

    final static java.awt.Container b(byte param0) {
        RuntimeException var1 = null;
        java.awt.Frame stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        java.applet.Applet stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.applet.Applet stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        java.awt.Frame stackOut_1_0 = null;
        try {
          L0: {
            if (null == sj.field_a) {
              if (param0 < -107) {
                stackOut_6_0 = hc.a(0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (java.awt.Container) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = sj.field_a;
              stackIn_2_0 = stackOut_1_0;
              return (java.awt.Container) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "va.A(" + param0 + 41);
        }
        return (java.awt.Container) (Object) stackIn_7_0;
    }

    final static byte[] a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        de var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_14_0 = null;
        byte[] stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_33_0 = null;
        byte[] stackOut_13_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            if (param0 < -106) {
              L1: {
                var2_ref = new de(param1);
                var3 = var2_ref.d((byte) -118);
                var4 = var2_ref.c(-38);
                if (var4 < 0) {
                  break L1;
                } else {
                  L2: {
                    if (m.field_z == 0) {
                      break L2;
                    } else {
                      if (~var4 >= ~m.field_z) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (var3 != 0) {
                    L3: {
                      var5 = var2_ref.c(-69);
                      if (var5 < 0) {
                        break L3;
                      } else {
                        L4: {
                          if (0 == m.field_z) {
                            break L4;
                          } else {
                            if (~var5 >= ~m.field_z) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            var6 = new byte[var5];
                            if (1 == var3) {
                              break L6;
                            } else {
                              var7 = (Object) (Object) cn.field_d;
                              synchronized (var7) {
                                L7: {
                                  cn.field_d.a(var6, var2_ref, -8);
                                  break L7;
                                }
                              }
                              if (ZombieDawn.field_J == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          int discarded$2 = 9;
                          int discarded$3 = lj.a(var6, var5, param1, var4);
                          break L5;
                        }
                        stackOut_33_0 = (byte[]) var6;
                        stackIn_34_0 = stackOut_33_0;
                        break L0;
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    var5_ref_byte__ = new byte[var4];
                    var2_ref.a(var4, 0, var5_ref_byte__, 11240);
                    stackOut_13_0 = (byte[]) var5_ref_byte__;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("va.B(").append(param0).append(44);
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
        return stackIn_34_0;
    }

    final static void a() {
        RuntimeException var1 = null;
        am var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        oh var5_ref = null;
        oh var6 = null;
        String var6_ref = null;
        String var7 = null;
        oh var7_ref = null;
        int var8 = 0;
        int stackIn_15_0 = 0;
        oh stackIn_58_0 = null;
        oh stackIn_68_0 = null;
        RuntimeException decompiledCaughtException = null;
        oh stackOut_57_0 = null;
        oh stackOut_66_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var1_ref = fj.field_g;
            var2 = var1_ref.d((byte) -126);
            if (var2 != 0) {
              if (var2 == 1) {
                L1: {
                  if (sf.field_j == null) {
                    sf.field_j = new pf(128);
                    ne.field_b = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var3 = var1_ref.a(true);
                  if (!var3.equals((Object) (Object) "")) {
                    break L2;
                  } else {
                    var3 = null;
                    break L2;
                  }
                }
                L3: {
                  var4_ref_String = var1_ref.a(true);
                  var5 = var1_ref.a(true);
                  var6 = hg.a(99, var4_ref_String);
                  if (var6 == null) {
                    var6 = hg.a(103, var5);
                    if (var6 == null) {
                      break L3;
                    } else {
                      sf.field_j.a(1, (long)fm.a((CharSequence) (Object) var4_ref_String, -117).hashCode(), (nb) (Object) var6);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (null == var6) {
                    var6 = new oh();
                    sf.field_j.a(1, (long)fm.a((CharSequence) (Object) var4_ref_String, -56).hashCode(), (nb) (Object) var6);
                    int fieldTemp$4 = ne.field_b;
                    ne.field_b = ne.field_b + 1;
                    var6.field_kb = fieldTemp$4;
                    eb.field_d.a(0, (le) (Object) var6);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null == var3) {
                    break L5;
                  } else {
                    var3 = var3.intern();
                    break L5;
                  }
                }
                var6.field_lb = var4_ref_String;
                var6.field_ib = var3;
                var6.b(-27598);
                var7_ref = (oh) (Object) eb.field_d.b((byte) 26);
                L6: while (true) {
                  L7: {
                    L8: {
                      L9: {
                        if (null == var7_ref) {
                          break L9;
                        } else {
                          stackOut_57_0 = (oh) var6;
                          stackIn_68_0 = stackOut_57_0;
                          stackIn_58_0 = stackOut_57_0;
                          if (var8 != 0) {
                            break L8;
                          } else {
                            if (!eh.a(stackIn_58_0, var7_ref, (byte) 20)) {
                              break L9;
                            } else {
                              var7_ref = (oh) (Object) eb.field_d.a(false);
                              if (var8 == 0) {
                                continue L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      L10: {
                        if (null != var7_ref) {
                          break L10;
                        } else {
                          eb.field_d.a(0, (le) (Object) var6);
                          if (var8 == 0) {
                            break L7;
                          } else {
                            break L10;
                          }
                        }
                      }
                      stackOut_66_0 = (oh) var7_ref;
                      stackIn_68_0 = stackOut_66_0;
                      break L8;
                    }
                    we.a((le) (Object) stackIn_68_0, 0, (le) (Object) var6);
                    break L7;
                  }
                  return;
                }
              } else {
                if (var2 != 2) {
                  if (var2 != 3) {
                    if (var2 != 4) {
                      int discarded$5 = 3;
                      ae.a((Throwable) null, 10331, "F1: " + cb.f());
                      p.a(1);
                      break L0;
                    } else {
                      w.field_b = 1;
                      var3 = var1_ref.a(true);
                      oo.field_T = var3.intern();
                      var4 = var1_ref.d((byte) -128);
                      rd.a(20348, var4);
                      return;
                    }
                  } else {
                    L11: {
                      if (w.field_b == 2) {
                        w.field_b = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    if (w.field_b == 1) {
                      w.field_b = 2;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              }
            } else {
              L13: {
                if (nk.field_a == null) {
                  nk.field_a = new pf(128);
                  ih.field_J = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var1_ref.d((byte) -119) != 1) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L14;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_15_0 = stackOut_12_0;
                  break L14;
                }
              }
              L15: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1_ref.a(true);
                if (var3_int != 0) {
                  String discarded$6 = var1_ref.a(true);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                var5_ref = pa.a(var4_ref_String, (byte) -66);
                var6_ref = var1_ref.a(true);
                var7 = fm.a((CharSequence) (Object) var4_ref_String, -115);
                if (var7 == null) {
                  var7 = var4_ref_String;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var5_ref != null) {
                  break L17;
                } else {
                  var5_ref = pa.a(var6_ref, (byte) -66);
                  if (var5_ref != null) {
                    nk.field_a.a(1, (long)var7.hashCode(), (nb) (Object) var5_ref);
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (var5_ref == null) {
                  var5_ref = new oh();
                  nk.field_a.a(1, (long)var7.hashCode(), (nb) (Object) var5_ref);
                  int fieldTemp$7 = ih.field_J;
                  ih.field_J = ih.field_J + 1;
                  var5_ref.field_kb = fieldTemp$7;
                  tp.field_m.a(0, (le) (Object) var5_ref);
                  break L18;
                } else {
                  break L18;
                }
              }
              var5_ref.field_lb = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "va.E(" + 1545 + 41);
        }
    }

    final static int a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_16_0 = false;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_15_0 = false;
        int stackOut_45_0 = 0;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (!on.b(-114)) {
                    break L3;
                  } else {
                    i.field_W.a(21657);
                    stackOut_5_0 = i.field_W.d(-127);
                    stackIn_16_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_6_0) {
                          var1_int = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (kg.field_i == 13) {
                        var2 = 1;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
                i.field_W.a((byte) -55, r.b(6199969, ha.field_b, ei.field_K), r.b(6199969, nc.field_j, hp.field_D));
                stackOut_15_0 = i.field_W.d(-124);
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              L5: {
                if (stackIn_16_0) {
                  var1_int = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  L8: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L8;
                    } else {
                      if (i.field_W.field_d >= 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L6;
                  } else {
                    if (pg.field_p != 2) {
                      cn.a((byte) 126);
                      if (var7 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                L9: {
                  var3 = qk.field_Kb[i.field_W.field_d];
                  if (var3 == 2) {
                    break L9;
                  } else {
                    if (var3 == 5) {
                      break L9;
                    } else {
                      break L6;
                    }
                  }
                }
                cn.a((byte) 80);
                break L6;
              }
              L10: {
                if (var3 != 0) {
                  break L10;
                } else {
                  if (2 != pg.field_p) {
                    break L10;
                  } else {
                    var4 = -ge.field_f + pd.a(-22826);
                    var6 = (int)((10999L - var4) / 1000L);
                    if (var6 > 0) {
                      break L10;
                    } else {
                      ti.a(5, 87, true);
                      var3 = 2;
                      break L10;
                    }
                  }
                }
              }
              stackOut_45_0 = var3;
              stackIn_46_0 = stackOut_45_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "va.C(" + 1 + 41);
        }
        return stackIn_46_0;
    }

    va(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            ((va) this).field_a = param2;
            ((va) this).field_d = param1;
            ((va) this).field_e = param0;
            ((va) this).field_i = param5;
            ((va) this).field_c = ((va) this).field_a > ((va) this).field_d ? true : false;
            ((va) this).field_g = ((va) this).field_d;
            ((va) this).field_f = param3;
            ((va) this).field_h = param4;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "va.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
    }
}
