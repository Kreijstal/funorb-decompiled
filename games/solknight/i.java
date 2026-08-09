/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends si {
    private nc field_L;
    static long field_H;
    static qh field_J;
    static int field_K;
    static String[] field_I;

    final void c(boolean param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(this.field_L);
        if (param0) {
            return;
        }
        kf var3 = (kf) ((Object) var2.a((byte) 94));
        do {
            if (var3 == null) {
                this.field_G = (rc) ((Object) this.d((byte) 115));
                return;
            }
            if (var4 != 0) {
                return;
            }
            if (var3.h(1784)) {
                var3.c(10);
            }
            var3 = (kf) ((Object) var2.c(122));
        } while (var4 == 0);
        this.field_G = (rc) ((Object) this.d((byte) 115));
    }

    public static void a(byte param0) {
        field_J = null;
        field_I = null;
        if (param0 == 30) {
            return;
        }
        i.a((byte) -67);
    }

    final rc h(int param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != 0) {
            return (rc) null;
        }
        ck var2 = new ck(this.field_L);
        kf var3 = (kf) ((Object) var2.a((byte) 84));
        do {
            if (var3 == null) {
                return null;
            }
            if (!(!var3.field_J)) {
                return var3.d((byte) -48);
            }
            var3 = (kf) ((Object) var2.c(param0 ^ 113));
        } while (var4 == 0);
        return null;
    }

    final void b(rc param0, int param1) {
        kf var4 = null;
        try {
            if (!(param0 instanceof kf)) {
                throw new IllegalArgumentException();
            }
            int var3_int = 63 % ((18 - param1) / 59);
            var4 = (kf) ((Object) param0);
            this.field_L.a(-3024, var4);
            var4.field_J = true;
            var4.a(-1463, (rc) (this));
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "i.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        ck var2 = null;
        kf var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    var2 = new ck(this.field_L);
                    var3 = (kf) ((Object) var2.a((byte) 109));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 == null) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3.field_J = false;
                    var3 = (kf) ((Object) var2.c(117));
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 == 1) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    field_I = (String[]) null;
                    this.field_G = null;
                    return;
                }
                case 7: {
                    this.field_G = null;
                    return;
                }
                case 9: {
                    if (param0 != 1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_G = null;
                    return;
                }
                case 11: {
                    field_I = (String[]) null;
                    this.field_G = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        ck var8 = null;
        ck var9 = null;
        ck var10 = null;
        ck var11 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    if (null == this.field_w) {
                        statePc = 19;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_w.a((byte) 125, param0, true, param2, (rc) (this));
                    if (param3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.h(-93);
                    statePc = 11;
                    continue stateLoop;
                }
                case 3: {
                    var8 = new ck(this.field_L);
                    var5 = var8;
                    var6 = (rc) ((Object) var8.a(param3 ^ -25119));
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var6 != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    var6.a(param0 - -this.field_j, param1, this.field_m + param2, param3 ^ 0);
                    var6 = (rc) ((Object) var8.b(640));
                    if (var7 == 0) {
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
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 11: {
                    var9 = new ck(this.field_L);
                    var5 = var9;
                    var6 = (rc) ((Object) var9.a(param3 ^ -25119));
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var6 != null) {
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
                    var6.a(param0 - -this.field_j, param1, this.field_m + param2, param3 ^ 0);
                    var6 = (rc) ((Object) var9.b(640));
                    if (var7 == 0) {
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
                    if (var7 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 19: {
                    if (param3 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.h(-93);
                    statePc = 28;
                    continue stateLoop;
                }
                case 21: {
                    var10 = new ck(this.field_L);
                    var6 = (rc) ((Object) var10.a(param3 ^ -25119));
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var6 != null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    var6.a(param0 - -this.field_j, param1, this.field_m + param2, param3 ^ 0);
                    var6 = (rc) ((Object) var10.b(640));
                    if (var7 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                case 26: {
                    if (var7 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return;
                }
                case 28: {
                    var11 = new ck(this.field_L);
                    var5 = var11;
                    var6 = (rc) ((Object) var11.a(param3 ^ -25119));
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var6 != null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    var6.a(param0 - -this.field_j, param1, this.field_m + param2, param3 ^ 0);
                    var6 = (rc) ((Object) var11.b(640));
                    if (var7 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return;
                }
                case 33: {
                    if (var7 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final kf d(byte param0) {
        ck var2;
        kf var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = new ck(this.field_L);
        var3 = (kf) ((Object) var2.a((byte) 92));
        if (param0 < 81) {
          field_I = (String[]) null;
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_J) {
                var3 = (kf) ((Object) var2.c(121));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (var3 != null) {
              if (!var3.field_J) {
                var3 = (kf) ((Object) var2.c(121));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void d(boolean param0) {
        ck var2;
        kf var3;
        int var4;
        boolean stackIn_8_0 = false;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = new ck(this.field_L);
        var3 = (kf) ((Object) var2.a((byte) -66));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackIn_8_0 = var3.e((byte) 124);

                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_8_0) {
                      var3.c(10);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3 = (kf) ((Object) var2.c(119));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_8_0 = param0;
            break L1;
          }
          if (stackIn_8_0) {
            return;
          } else {
            this.field_L = (nc) null;
            return;
          }
        }
    }

    public i() {
        super(0, 0, og.field_f, wc.field_e, (j) null, (dg) null);
        this.field_L = new nc();
    }

    final static void a(byte param0, long param1) {
        if (param1 <= 0L) {
          return;
        } else {
          if (param1 % 10L != 0L) {
            lc.a(2767, param1);
            if (param0 >= 11) {
              return;
            } else {
              field_I = (String[]) null;
              return;
            }
          } else {
            lc.a(2767, param1 - 1L);
            lc.a(2767, 1L);
            if (!SolKnight.field_L) {
              if (param0 >= 11) {
                return;
              } else {
                field_I = (String[]) null;
                return;
              }
            } else {
              lc.a(2767, param1);
              if (param0 >= 11) {
                return;
              } else {
                field_I = (String[]) null;
                return;
              }
            }
          }
        }
    }

    static {
        field_J = new qh();
    }
}
