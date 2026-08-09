/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends dk {
    static dd field_E;
    static el field_G;
    static String field_H;
    private vc field_I;
    static int[] field_F;

    final static void d(byte param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (ge.field_d == null) {
                break L0;
              } else {
                try {
                  L1: {
                    ge.field_d.a(-107, 0L);
                    ge.field_d.a(ae.field_a.field_i, ae.field_a.field_k, 24, (byte) -23);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (param0 >= -9) {
                    return;
                  } else {
                    ae.field_a.field_i = ae.field_a.field_i + 24;
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            if (param0 >= -9) {
              return;
            } else {
              ae.field_a.field_i = ae.field_a.field_i + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public f() {
        super(0, 0, ll.field_m, ca.field_Q, (ch) null, (kd) null);
        this.field_I = new vc();
    }

    final void d(boolean param0) {
        we var2;
        db var3;
        int var4;
        we var5;
        we var6;
        var4 = fleas.field_A ? 1 : 0;
        if (param0) {
          var5 = new we(this.field_I);
          var3 = (db) ((Object) var5.b(78));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (var3.a(-71)) {
                    var3.c(-1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (db) ((Object) var5.c(-6144));
                if (var4 == 0) {
                  continue L0;
                } else {
                  this.field_A = (qa) ((Object) this.l(-75));
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_A = (qa) ((Object) this.l(-75));
              return;
            }
          }
        } else {
          this.field_I = (vc) null;
          var6 = new we(this.field_I);
          var2 = var6;
          var3 = (db) ((Object) var6.b(78));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (var3.a(-71)) {
                    var3.c(-1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (db) ((Object) var6.c(-6144));
                if (var4 == 0) {
                  continue L2;
                } else {
                  this.field_A = (qa) ((Object) this.l(-75));
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_A = (qa) ((Object) this.l(-75));
              return;
            }
          }
        }
    }

    final void i(int param0) {
        we var2 = null;
        db var3 = null;
        int var4 = 0;
        we var5 = null;
        we var6 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    if (param0 < -55) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_G = (el) null;
                    statePc = 10;
                    continue stateLoop;
                }
                case 2: {
                    var5 = new we(this.field_I);
                    var2 = var5;
                    var3 = (db) ((Object) var5.b(84));
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
                    this.field_A = null;
                    return;
                }
                case 6: {
                    var3.field_G = false;
                    var3 = (db) ((Object) var5.c(-6144));
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
                    this.field_A = null;
                    return;
                }
                case 10: {
                    var6 = new we(this.field_I);
                    var2 = var6;
                    var3 = (db) ((Object) var6.b(84));
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
                    this.field_A = null;
                    return;
                }
                case 14: {
                    var3.field_G = false;
                    var3 = (db) ((Object) var6.c(-6144));
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
                    this.field_A = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void k(int param0) {
        we var2;
        db var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        if (param0 < -54) {
          var2 = new we(this.field_I);
          var3 = (db) ((Object) var2.b(120));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (!var3.j(112)) {
                    break L1;
                  } else {
                    var3.c(-1);
                    break L1;
                  }
                }
                var3 = (db) ((Object) var2.c(-6144));
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
          this.d(false);
          var2 = new we(this.field_I);
          var3 = (db) ((Object) var2.b(120));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (!var3.j(112)) {
                    break L3;
                  } else {
                    var3.c(-1);
                    break L3;
                  }
                }
                var3 = (db) ((Object) var2.c(-6144));
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

    final db l(int param0) {
        int var5 = fleas.field_A ? 1 : 0;
        int var2 = 112 % ((-10 - param0) / 51);
        we var3 = new we(this.field_I);
        db var4 = (db) ((Object) var3.b(127));
        do {
            if (var4 == null) {
                return null;
            }
            if (var4.field_G) {
                return var4;
            }
            var4 = (db) ((Object) var3.c(-6144));
        } while (var5 == 0);
        return null;
    }

    final void b(qa param0, byte param1) {
        db var3 = null;
        try {
            if (!(param0 instanceof db)) {
                throw new IllegalArgumentException();
            }
            var3 = (db) ((Object) param0);
            this.field_I.b(true, var3);
            if (param1 != -35) {
                field_G = (el) null;
            }
            var3.field_G = true;
            var3.a((qa) (this), -53);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "f.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void j(int param0) {
        field_E = null;
        if (param0 != -7409) {
          field_G = (el) null;
          field_G = null;
          field_F = null;
          field_H = null;
          return;
        } else {
          field_G = null;
          field_F = null;
          field_H = null;
          return;
        }
    }

    final qa a(int param0) {
        we var2;
        db var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        var2 = new we(this.field_I);
        var3 = (db) ((Object) var2.b(-59));
        if (param0 != 0) {
          field_E = (dd) null;
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_G) {
                return var3.i(-257);
              } else {
                var3 = (db) ((Object) var2.c(-6144));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (var3 != null) {
              if (var3.field_G) {
                return var3.i(-257);
              } else {
                var3 = (db) ((Object) var2.c(-6144));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = fleas.field_A ? 1 : 0;
                    if (null == this.field_p) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_p.a(-117, param1, true, (qa) (this), param0);
                    statePc = 15;
                    continue stateLoop;
                }
                case 2: {
                    var5 = new we(this.field_I);
                    var6 = (qa) ((Object) var5.a((byte) 106));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var6 != null) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param2) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    f.j(69);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 8: {
                    var6.b(this.field_z + param0, this.field_y + param1, true, param3);
                    var6 = (qa) ((Object) var5.a(true));
                    if (var7 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    if (var7 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (param2) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    f.j(69);
                    return;
                }
                case 13: {
                    return;
                }
                case 15: {
                    var5 = new we(this.field_I);
                    var6 = (qa) ((Object) var5.a((byte) 106));
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var6 == null) {
                        statePc = 25;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var6.b(this.field_z + param0, this.field_y + param1, true, param3);
                    var6 = (qa) ((Object) var5.a(true));
                    if (var7 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    if (var7 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (param2) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    f.j(69);
                    return;
                }
                case 23: {
                    return;
                }
                case 25: {
                    if (param2) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    f.j(69);
                    return;
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_H = "Unpacking graphics";
        field_F = new int[10];
    }
}
