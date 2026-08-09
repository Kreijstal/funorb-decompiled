/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends fi {
    static String field_B;
    private qj field_D;
    static String field_A;
    static String field_z;
    static int field_C;
    static int field_y;

    public static void i(int param0) {
        field_z = null;
        if (param0 != 0) {
            return;
        }
        field_A = null;
        field_B = null;
    }

    final static void a(boolean param0, byte param1, java.awt.Canvas param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        java.awt.Canvas var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((bi.field_L ^ -1) <= -11) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 0;
                    if (!kb.field_l) {
                      break L3;
                    } else {
                      kb.field_l = false;
                      var3_int = 1;
                      break L3;
                    }
                  }
                  jk.a(gj.field_a, (byte) -119, be.b(71), mh.b(100), var3_int != 0);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (!ki.b(true)) {
                sb.c();
                ub.a(320, 240, (byte) 116);
                ah.a(0, 0, (byte) 110, param2);
                break L1;
              } else {
                L4: {
                  if (gl.field_y == 0) {
                    break L4;
                  } else {
                    ng.a(false, param2);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                ec.a(false, param0, -124);
                ah.a(0, 0, (byte) 104, param2);
                if (var4 == 0) {
                  break L1;
                } else {
                  sb.c();
                  ub.a(320, 240, (byte) 116);
                  ah.a(0, 0, (byte) 110, param2);
                  break L1;
                }
              }
            }
            if (param1 > 63) {
              break L0;
            } else {
              var5 = (java.awt.Canvas) null;
              da.a(false, (byte) -103, (java.awt.Canvas) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("da.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    public da() {
        super(0, 0, cd.field_b, wj.field_h, (ui) null, (ma) null);
        this.field_D = new qj();
    }

    final mk e(byte param0) {
        int var5 = Transmogrify.field_A ? 1 : 0;
        int var2 = -31 % ((param0 - -59) / 47);
        tl var3 = new tl(this.field_D);
        mk var4 = (mk) ((Object) var3.c(-101));
        do {
            if (var4 == null) {
                return null;
            }
            if (!(!var4.field_A)) {
                return var4;
            }
            var4 = (mk) ((Object) var3.a(405142401));
        } while (var5 == 0);
        return null;
    }

    final void k(int param0) {
        tl var2 = null;
        mk var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    var2 = new tl(this.field_D);
                    if (param0 == 31410) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_B = (String) null;
                    statePc = 10;
                    continue stateLoop;
                }
                case 2: {
                    var3 = (mk) ((Object) var2.c(-121));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != null) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_v = null;
                    return;
                }
                case 6: {
                    var3.field_A = false;
                    var3 = (mk) ((Object) var2.a(param0 ^ 405111091));
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_v = null;
                    return;
                }
                case 10: {
                    var3 = (mk) ((Object) var2.c(-121));
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var3 != null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_v = null;
                    return;
                }
                case 14: {
                    var3.field_A = false;
                    var3 = (mk) ((Object) var2.a(param0 ^ 405111091));
                    if (var4 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_v = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final qg d(byte param0) {
        int var5 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(this.field_D);
        int var4 = 71 % ((51 - param0) / 48);
        mk var3 = (mk) ((Object) var2.c(-116));
        do {
            if (var3 == null) {
                return null;
            }
            if (var3.field_A) {
                return var3.i(-116);
            }
            var3 = (mk) ((Object) var2.a(405142401));
        } while (var5 == 0);
        return null;
    }

    final void l(int param0) {
        tl var2;
        mk var3;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = new tl(this.field_D);
        var3 = (mk) ((Object) var2.c(-116));
        if (param0 != 0) {
          field_A = (String) null;
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (!var3.m(0)) {
                    break L1;
                  } else {
                    var3.c(param0 ^ 5);
                    break L1;
                  }
                }
                var3 = (mk) ((Object) var2.a(param0 ^ 405142401));
                if (var4 == 0) {
                  continue L0;
                } else {
                  this.field_v = (qg) ((Object) this.e((byte) -107));
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_v = (qg) ((Object) this.e((byte) -107));
              return;
            }
          }
        } else {
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (!var3.m(0)) {
                    break L3;
                  } else {
                    var3.c(param0 ^ 5);
                    break L3;
                  }
                }
                var3 = (mk) ((Object) var2.a(param0 ^ 405142401));
                if (var4 == 0) {
                  continue L2;
                } else {
                  this.field_v = (qg) ((Object) this.e((byte) -107));
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_v = (qg) ((Object) this.e((byte) -107));
              return;
            }
          }
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = tg.a(-54, false, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("da.D(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int statePc = 0;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        int var8 = 0;
        tl var9 = null;
        tl var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    if (this.field_q == null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_q.a(param0, param1, true, (byte) 126, (qg) (this));
                    statePc = 9;
                    continue stateLoop;
                }
                case 2: {
                    var9 = new tl(this.field_D);
                    var6 = (qg) ((Object) var9.a((byte) 62));
                    var7 = -24 % ((param3 - 77) / 34);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var6 != null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    var6.a(param0 - -this.field_p, this.field_n + param1, param2, (byte) -95);
                    var6 = (qg) ((Object) var9.b(-29339));
                    if (var8 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (var8 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    var10 = new tl(this.field_D);
                    var5 = var10;
                    var6 = (qg) ((Object) var10.a((byte) 62));
                    var7 = -24 % ((param3 - 77) / 34);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var6 != null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    var6.a(param0 - -this.field_p, this.field_n + param1, param2, (byte) -95);
                    var6 = (qg) ((Object) var10.b(-29339));
                    if (var8 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    if (var8 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void j(int param0) {
        tl var2;
        mk var3;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (param0 > 124) {
          var2 = new tl(this.field_D);
          var3 = (mk) ((Object) var2.c(-120));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (var3.a((byte) -97)) {
                    var3.c(5);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (mk) ((Object) var2.a(405142401));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_y = -112;
          var2 = new tl(this.field_D);
          var3 = (mk) ((Object) var2.c(-120));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (var3.a((byte) -97)) {
                    var3.c(5);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (mk) ((Object) var2.a(405142401));
                if (var4 == 0) {
                  continue L2;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void b(qg param0, byte param1) {
        mk var3 = null;
        try {
            if (!(param0 instanceof mk)) {
                throw new IllegalArgumentException();
            }
            var3 = (mk) ((Object) param0);
            if (param1 != -71) {
                field_C = 1;
            }
            this.field_D.a((wf) (var3), (byte) 33);
            var3.field_A = true;
            var3.a((qg) (this), param1 + 51);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "da.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_A = "Create";
        field_C = 0;
        field_B = "Log in";
        field_z = "Submit";
        field_y = 0;
    }
}
