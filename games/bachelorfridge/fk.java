/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends bca {
    int field_q;
    static kv field_s;
    static String field_t;
    int field_r;

    fk(int param0, nq param1, int param2, int param3) {
        super(param0, param1);
        try {
            ((fk) this).field_q = param2;
            ((fk) this).field_r = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fk.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        aka stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        aka stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 5) {
              stackOut_3_0 = new aka(param1, (fk) this);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (at) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("fk.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return (at) (Object) stackIn_4_0;
    }

    final static void d(int param0) {
        gk.field_d = 0;
        int var1 = -62 / ((58 - param0) / 51);
        bb.h(0);
    }

    final void a(op param0, int param1) {
        aga var3 = null;
        try {
            ((fk) this).a(param0, (byte) -2);
            var3 = ((fk) this).field_l.a(40, param0);
            var3.j(-113);
            int var4 = -119 / ((param1 - 12) / 35);
            var3.field_A = false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fk.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    fk(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            ((fk) this).field_k = param0.e((byte) 74);
            ((fk) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (var2_int < 0) {
                    break;
                }
                ((fk) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
            }
            ((fk) this).field_q = param0.b(16711935);
            ((fk) this).field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void c(int param0, int param1) {
        bw var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        bga var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (bga) (Object) on.field_r.b((byte) 90);
            L1: while (true) {
              if (var4 == null) {
                var2 = us.field_e.b((byte) 90);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    int discarded$8 = 0;
                    int discarded$9 = 6;
                    qna.b();
                    var2 = us.field_e.c(0);
                    continue L2;
                  }
                }
              } else {
                nha.a(6, var4, (byte) -85);
                var4 = (bga) (Object) on.field_r.c(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "fk.B(" + -60 + 44 + 6 + 41);
        }
    }

    final void a(byte param0, lu param1) {
        if (param0 > -12) {
            return;
        }
        try {
            super.a((byte) -52, param1);
            param1.d(((fk) this).field_q, 0);
            param1.d(((fk) this).field_r, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fk.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void e() {
        int var1 = 52;
        field_t = null;
        field_s = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 > 76) {
          L0: {
            if (param1 != 0) {
              break L0;
            } else {
              if (param3 != fb.field_p) {
                fb.field_p = param3;
                wia.field_e = true;
                ei.a(4, param2);
                break L0;
              } else {
                if (1 == param1) {
                  if (~ri.field_c != ~param3) {
                    ri.field_c = param3;
                    wia.field_e = true;
                    ei.a(4, param2);
                    if (param1 == 2) {
                      if (param3 == fj.field_g) {
                        return;
                      } else {
                        wia.field_e = true;
                        fj.field_g = param3;
                        ei.a(4, param2);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (param1 == 2) {
                      if (param3 == fj.field_g) {
                        return;
                      } else {
                        wia.field_e = true;
                        fj.field_g = param3;
                        ei.a(4, param2);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param1 == 2) {
                    if (param3 == fj.field_g) {
                      return;
                    } else {
                      wia.field_e = true;
                      fj.field_g = param3;
                      ei.a(4, param2);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L1: {
            if (1 != param1) {
              break L1;
            } else {
              if (~ri.field_c == ~param3) {
                break L1;
              } else {
                ri.field_c = param3;
                wia.field_e = true;
                ei.a(4, param2);
                if (param1 == 2) {
                  if (param3 == fj.field_g) {
                    return;
                  } else {
                    wia.field_e = true;
                    fj.field_g = param3;
                    ei.a(4, param2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (param1 == 2) {
            if (param3 == fj.field_g) {
              return;
            } else {
              wia.field_e = true;
              fj.field_g = param3;
              ei.a(4, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          fk.d((byte) 22);
          if (param1 == 0) {
            L2: {
              if (param3 != fb.field_p) {
                fb.field_p = param3;
                wia.field_e = true;
                ei.a(4, param2);
                break L2;
              } else {
                break L2;
              }
            }
            if (1 == param1) {
              if (~ri.field_c == ~param3) {
                if (param1 == 2) {
                  if (param3 == fj.field_g) {
                    return;
                  } else {
                    wia.field_e = true;
                    fj.field_g = param3;
                    ei.a(4, param2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ri.field_c = param3;
                wia.field_e = true;
                ei.a(4, param2);
                if (param1 == 2) {
                  if (param3 != fj.field_g) {
                    wia.field_e = true;
                    fj.field_g = param3;
                    ei.a(4, param2);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (param1 == 2) {
                if (param3 == fj.field_g) {
                  return;
                } else {
                  wia.field_e = true;
                  fj.field_g = param3;
                  ei.a(4, param2);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L3: {
              if (1 != param1) {
                break L3;
              } else {
                if (~ri.field_c == ~param3) {
                  break L3;
                } else {
                  ri.field_c = param3;
                  wia.field_e = true;
                  ei.a(4, param2);
                  if (param1 == 2) {
                    L4: {
                      if (param3 == fj.field_g) {
                        break L4;
                      } else {
                        wia.field_e = true;
                        fj.field_g = param3;
                        ei.a(4, param2);
                        break L4;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param1 == 2) {
              if (param3 == fj.field_g) {
                return;
              } else {
                wia.field_e = true;
                fj.field_g = param3;
                ei.a(4, param2);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void d(byte param0) {
        dg.field_j = mm.field_D;
        dg.field_k = eia.field_d;
        int var1 = -34 % ((-63 - param0) / 42);
        dg.field_h = tq.field_r;
        dg.field_f = jf.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Close";
    }
}
