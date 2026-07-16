/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    private bb field_b;
    private rd[] field_e;
    static String field_c;
    static String field_a;
    static int field_d;

    final int a(boolean param0) {
        rd var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var2 = (rd) (Object) ((ee) this).field_b.c(1504642273);
            if (null != var2) {
              var2.c(2779);
              stackOut_6_0 = var2.field_k;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = -1;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "ee.D(" + param0 + 41);
        }
        return stackIn_9_0;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        pc var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        im var6 = null;
        String var7 = null;
        im var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_50_0 = false;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_49_0 = false;
        int stackOut_58_0 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1_ref = vi.field_o;
            var2 = var1_ref.f(255);
            if ((var2 ^ -1) == -1) {
              L1: {
                if (null != hq.field_q) {
                  break L1;
                } else {
                  hq.field_q = new vg(128);
                  aj.field_t = 0;
                  break L1;
                }
              }
              L2: {
                if (-2 != (var1_ref.f(255) ^ -1)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1_ref.h(5);
                  if (var3_int == 0) {
                    break L4;
                  } else {
                    var5 = var1_ref.h(5);
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var4_ref_String;
                break L3;
              }
              L5: {
                var6 = fh.a(var4_ref_String, -106);
                var7 = var1_ref.h(5);
                var8 = dh.a((CharSequence) (Object) var4_ref_String, (byte) 100);
                if (null != var8) {
                  break L5;
                } else {
                  var8 = var4_ref_String;
                  break L5;
                }
              }
              L6: {
                if (var6 == null) {
                  var6 = fh.a(var7, 69);
                  if (null == var6) {
                    break L6;
                  } else {
                    hq.field_q.a(false, (lm) (Object) var6, (long)var8.hashCode());
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (var6 == null) {
                  var6 = new im();
                  hq.field_q.a(false, (lm) (Object) var6, (long)var8.hashCode());
                  int fieldTemp$2 = aj.field_t;
                  aj.field_t = aj.field_t + 1;
                  var6.field_Kb = fieldTemp$2;
                  bq.field_b.a(22125, (fa) (Object) var6);
                  break L7;
                } else {
                  break L7;
                }
              }
              var6.field_Ib = var5;
              var6.field_Fb = var4_ref_String;
              var6.field_Gb = var7;
              return;
            } else {
              if (-2 != (var2 ^ -1)) {
                if (-3 == (var2 ^ -1)) {
                  L8: {
                    if (-2 == (gk.field_db ^ -1)) {
                      gk.field_db = 2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return;
                } else {
                  if (var2 != 3) {
                    if (4 != var2) {
                      jo.a(1, "F1: " + jm.b(-8), (Throwable) null);
                      if (param0 < -89) {
                        na.a(true);
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      gk.field_db = 1;
                      var3 = var1_ref.h(5);
                      qp.field_L = var3.intern();
                      var4 = var1_ref.f(255);
                      vm.b(var4, (byte) -113);
                      return;
                    }
                  } else {
                    L9: {
                      if (-3 == (gk.field_db ^ -1)) {
                        gk.field_db = 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                }
              } else {
                L10: {
                  if (null != vm.field_b) {
                    break L10;
                  } else {
                    vm.field_b = new vg(128);
                    f.field_q = 0;
                    break L10;
                  }
                }
                L11: {
                  var3 = var1_ref.h(5);
                  if (!var3.equals((Object) (Object) "")) {
                    break L11;
                  } else {
                    var3 = null;
                    break L11;
                  }
                }
                L12: {
                  var4_ref_String = var1_ref.h(5);
                  var5 = var1_ref.h(5);
                  var6 = re.a(var4_ref_String, -1);
                  if (null != var6) {
                    break L12;
                  } else {
                    var6 = re.a(var5, -1);
                    if (null != var6) {
                      vm.field_b.a(false, (lm) (Object) var6, (long)dh.a((CharSequence) (Object) var4_ref_String, (byte) 29).hashCode());
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (null == var6) {
                    var6 = new im();
                    vm.field_b.a(false, (lm) (Object) var6, (long)dh.a((CharSequence) (Object) var4_ref_String, (byte) 70).hashCode());
                    int fieldTemp$3 = f.field_q;
                    f.field_q = f.field_q + 1;
                    var6.field_Kb = fieldTemp$3;
                    vp.field_Hb.a(22125, (fa) (Object) var6);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (null == var3) {
                    break L14;
                  } else {
                    var3 = var3.intern();
                    break L14;
                  }
                }
                var6.field_Fb = var4_ref_String;
                var6.field_Nb = var3;
                var6.field_Gb = var5;
                var6.c(2779);
                var7_ref = (im) (Object) vp.field_Hb.c(1504642273);
                L15: while (true) {
                  L16: {
                    L17: {
                      L18: {
                        if (null == var7_ref) {
                          break L18;
                        } else {
                          stackOut_49_0 = hn.a((byte) 115, var6, var7_ref);
                          stackIn_60_0 = stackOut_49_0 ? 1 : 0;
                          stackIn_50_0 = stackOut_49_0;
                          if (var9 != 0) {
                            break L17;
                          } else {
                            if (!stackIn_50_0) {
                              break L18;
                            } else {
                              var7_ref = (im) (Object) vp.field_Hb.f(1504642273);
                              if (var9 == 0) {
                                continue L15;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        if (null != var7_ref) {
                          break L19;
                        } else {
                          vp.field_Hb.a(22125, (fa) (Object) var6);
                          if (var9 == 0) {
                            break L16;
                          } else {
                            break L19;
                          }
                        }
                      }
                      stackOut_58_0 = 95;
                      stackIn_60_0 = stackOut_58_0;
                      break L17;
                    }
                    jj.a((byte) stackIn_60_0, (fa) (Object) var7_ref, (fa) (Object) var6);
                    break L16;
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ee.C(" + param0 + 41);
        }
    }

    final void a(int param0) {
        if (param0 != -1) {
            return;
        }
        try {
            ((ee) this).field_b.e(77);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ee.G(" + param0 + 41);
        }
    }

    final int a(int param0, byte param1) {
        rd var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (rd) (Object) ((ee) this).field_b.c(1504642273);
              if (param1 < -14) {
                break L1;
              } else {
                rd discarded$2 = this.a(-71, -29, (byte) 37);
                break L1;
              }
            }
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                if ((var3.field_m ^ -1) > (param0 ^ -1)) {
                  var3.c(2779);
                  stackOut_9_0 = var3.field_k;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_11_0 = -1;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3_ref, "ee.F(" + param0 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            field_a = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ee.H(" + param0 + 41);
        }
    }

    private final rd a(int param0, int param1, byte param2) {
        Object var4 = null;
        int var5 = 0;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        try {
          L0: {
            var4 = null;
            var5 = 0;
            L1: while (true) {
              L2: {
                if ((var5 ^ -1) <= (((ee) this).field_e.length ^ -1)) {
                  break L2;
                } else {
                  if (!((ee) this).field_e[var5].b(0)) {
                    var4 = (Object) (Object) ((ee) this).field_e[var5];
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L3: {
                if (null != var4) {
                  break L3;
                } else {
                  var4 = (Object) (Object) new rd();
                  break L3;
                }
              }
              ((rd) var4).field_k = param1;
              ((rd) var4).field_m = param0;
              var5 = -104 / ((-22 - param2) / 50);
              stackOut_11_0 = var4;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (Object) (Object) decompiledCaughtException;
          throw aa.a((Throwable) var4, "ee.E(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return (rd) (Object) stackIn_12_0;
    }

    ee() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            ((ee) this).field_b = new bb();
            ((ee) this).field_e = new rd[10];
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var1_int >= 10) {
                    break L3;
                  } else {
                    ((ee) this).field_e[var1_int] = new rd();
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "ee.<init>()");
        }
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1_int = kb.field_N[param0];
            var2 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 >= kb.field_N.length) {
                    break L3;
                  } else {
                    var3 = kb.field_N[var2];
                    qb.a(nd.field_c, var2 << -1827091836, nd.field_c, var1_int, var3);
                    var1_int = var1_int + var3;
                    var2++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "ee.A(" + param0 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        try {
            ((ee) this).field_b.a(22125, (fa) (Object) this.a(param0, param2, (byte) 109));
            if (param1 != 0) {
                ((ee) this).a(-120, 48, 81);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ee.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Message game";
        field_a = "Please log in as a subscribing member to access this feature.";
    }
}
