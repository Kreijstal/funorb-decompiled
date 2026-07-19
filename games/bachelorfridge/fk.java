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
            this.field_q = param2;
            this.field_r = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        aka stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        aka stackOut_3_0 = null;
        at stackOut_1_0 = null;
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
              stackOut_3_0 = new aka(param1, (fk) (this));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (at) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("fk.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (at) ((Object) stackIn_4_0);
        }
    }

    final static void d(int param0) {
        gk.field_d = 0;
        int var1 = -62 / ((58 - param0) / 51);
        bb.h(0);
    }

    final void a(op param0, int param1) {
        aga var3 = null;
        try {
            this.a(param0, (byte) -2);
            var3 = this.field_l.a(40, param0);
            var3.j(-113);
            int var4 = -119 / ((param1 - 12) / 35);
            var3.field_A = false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fk(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            this.field_k = param0.e((byte) 74);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if ((var2_int ^ -1) > -1) {
                    break;
                }
                this.field_o.a(dca.a((byte) 102, param0), true);
            }
            this.field_q = param0.b(16711935);
            this.field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
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
            var4 = (bga) ((Object) on.field_r.b((byte) 90));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  var2 = us.field_e.b((byte) 90);
                  if (param0 <= -12) {
                    break L2;
                  } else {
                    fk.d((byte) -20);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    qna.b(param1, 0);
                    var2 = us.field_e.c(0);
                    continue L3;
                  }
                }
              } else {
                nha.a(param1, var4, (byte) -85);
                var4 = (bga) ((Object) on.field_r.c(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "fk.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, lu param1) {
        if (param0 > -12) {
            return;
        }
        try {
            super.a((byte) -52, param1);
            param1.d(this.field_q, 0);
            param1.d(this.field_r, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fk.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        int var1 = 105 / ((param0 - -54) / 37);
        field_t = null;
        field_s = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 > 76) {
          L0: {
            if (-1 != (param1 ^ -1)) {
              break L0;
            } else {
              if (param3 != fb.field_p) {
                fb.field_p = param3;
                wia.field_e = true;
                ei.a(4, param2);
                break L0;
              } else {
                if (1 == param1) {
                  if (ri.field_c != param3) {
                    ri.field_c = param3;
                    wia.field_e = true;
                    ei.a(4, param2);
                    if ((param1 ^ -1) == -3) {
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
                    if ((param1 ^ -1) == -3) {
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
                  if ((param1 ^ -1) == -3) {
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
              if (ri.field_c == param3) {
                break L1;
              } else {
                ri.field_c = param3;
                wia.field_e = true;
                ei.a(4, param2);
                if ((param1 ^ -1) == -3) {
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
          if ((param1 ^ -1) == -3) {
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
          if (-1 == (param1 ^ -1)) {
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
              if (ri.field_c == param3) {
                if ((param1 ^ -1) == -3) {
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
                if ((param1 ^ -1) == -3) {
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
              if ((param1 ^ -1) == -3) {
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
                if (ri.field_c == param3) {
                  break L3;
                } else {
                  ri.field_c = param3;
                  wia.field_e = true;
                  ei.a(4, param2);
                  if ((param1 ^ -1) != -3) {
                    return;
                  } else {
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
                  }
                }
              }
            }
            if ((param1 ^ -1) == -3) {
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
        field_t = "Close";
    }
}
