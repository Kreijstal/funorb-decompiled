/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wo extends ah {
    static dn field_xb;
    static boolean field_wb;
    static int[] field_zb;
    boolean field_Ab;
    static ln field_yb;

    void a(wk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              bi.d(param0.a(this.a(true), (byte) -74), param0.a(this.f(param1 ^ 237235572), 0), this.field_pb, 16711680);
              if (param1 == 5060) {
                break L1;
              } else {
                field_xb = (dn) null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (this.field_ub <= var3_int) {
                break L0;
              } else {
                var4 = param0.a(this.field_jb[var3_int], (byte) -59);
                var5 = param0.a(this.field_gb[var3_int], 0);
                bi.b(-1 + var4, var5 - 1, 3, 3, 0);
                bi.a(var4, var5, 65280);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("wo.L(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static em v(int param0) {
        if (param0 != 6130) {
          return (em) null;
        } else {
          return new em(0, 0, se.field_j.field_p, 0, (io) null, se.field_j.field_s, se.field_j.field_m, se.field_j.field_p, se.field_j.field_p, se.field_j.field_o, se.field_j.field_f, false, true, 32768, 0);
        }
    }

    void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        wk var5 = null;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          stackOut_0_0 = 250;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!this.field_Ab) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        var2 = stackIn_3_0 * stackIn_3_1;
        if (param0 == 52) {
          this.field_pb = var2;
          if (0 == this.field_F) {
            if (!this.field_Ab) {
              var3 = 1;
              if (!this.a(-86, var2, this.field_Ab)) {
                this.field_Ab = false;
                if (3 != this.field_F) {
                  return;
                } else {
                  this.e(0, -6904);
                  return;
                }
              } else {
                if (!this.p(-125)) {
                  if (!this.field_Ab) {
                    if (-4 != (this.field_F ^ -1)) {
                      this.e(3, -6904);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_Ab = false;
                    return;
                  }
                } else {
                  if (var3 == 0) {
                    this.field_Ab = true;
                    return;
                  } else {
                    this.field_U = dc.a((byte) 18, this.field_db);
                    this.field_Ab = true;
                    return;
                  }
                }
              }
            } else {
              var3 = 0;
              if (!this.a(-86, var2, this.field_Ab)) {
                this.field_Ab = false;
                if (3 == this.field_F) {
                  this.e(0, -6904);
                  return;
                } else {
                  return;
                }
              } else {
                if (!this.p(-125)) {
                  if (!this.field_Ab) {
                    if (-4 == (this.field_F ^ -1)) {
                      return;
                    } else {
                      this.e(3, -6904);
                      return;
                    }
                  } else {
                    this.field_Ab = false;
                    return;
                  }
                } else {
                  if (var3 == 0) {
                    this.field_Ab = true;
                    return;
                  } else {
                    this.field_U = dc.a((byte) 18, this.field_db);
                    this.field_Ab = true;
                    return;
                  }
                }
              }
            }
          } else {
            var3 = 0;
            if (!this.a(-86, var2, this.field_Ab)) {
              this.field_Ab = false;
              if (3 != this.field_F) {
                return;
              } else {
                this.e(0, -6904);
                return;
              }
            } else {
              if (!this.p(-125)) {
                if (!this.field_Ab) {
                  if (-4 == (this.field_F ^ -1)) {
                    return;
                  } else {
                    this.e(3, -6904);
                    return;
                  }
                } else {
                  this.field_Ab = false;
                  return;
                }
              } else {
                if (var3 == 0) {
                  this.field_Ab = true;
                  return;
                } else {
                  this.field_U = dc.a((byte) 18, this.field_db);
                  this.field_Ab = true;
                  return;
                }
              }
            }
          }
        } else {
          var5 = (wk) null;
          this.a((wk) null, 77);
          this.field_pb = var2;
          if (0 == this.field_F) {
            if (!this.field_Ab) {
              var3 = 1;
              if (!this.a(-86, var2, this.field_Ab)) {
                this.field_Ab = false;
                if (3 != this.field_F) {
                  return;
                } else {
                  this.e(0, -6904);
                  return;
                }
              } else {
                if (!this.p(-125)) {
                  if (!this.field_Ab) {
                    if (-4 == (this.field_F ^ -1)) {
                      return;
                    } else {
                      this.e(3, -6904);
                      return;
                    }
                  } else {
                    this.field_Ab = false;
                    return;
                  }
                } else {
                  if (var3 == 0) {
                    this.field_Ab = true;
                    return;
                  } else {
                    this.field_U = dc.a((byte) 18, this.field_db);
                    this.field_Ab = true;
                    return;
                  }
                }
              }
            } else {
              L1: {
                var3 = 0;
                if (!this.a(-86, var2, this.field_Ab)) {
                  this.field_Ab = false;
                  if (3 == this.field_F) {
                    this.e(0, -6904);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (!this.p(-125)) {
                    if (this.field_Ab) {
                      this.field_Ab = false;
                      break L1;
                    } else {
                      if (-4 != (this.field_F ^ -1)) {
                        this.e(3, -6904);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    if (var3 == 0) {
                      this.field_Ab = true;
                      break L1;
                    } else {
                      this.field_U = dc.a((byte) 18, this.field_db);
                      this.field_Ab = true;
                      break L1;
                    }
                  }
                }
              }
              return;
            }
          } else {
            L2: {
              var3 = 0;
              if (!this.a(-86, var2, this.field_Ab)) {
                this.field_Ab = false;
                if (3 == this.field_F) {
                  this.e(0, -6904);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                if (!this.p(-125)) {
                  if (this.field_Ab) {
                    this.field_Ab = false;
                    break L2;
                  } else {
                    if (-4 != (this.field_F ^ -1)) {
                      this.e(3, -6904);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  if (var3 == 0) {
                    this.field_Ab = true;
                    break L2;
                  } else {
                    this.field_U = dc.a((byte) 18, this.field_db);
                    this.field_Ab = true;
                    break L2;
                  }
                }
              }
            }
            return;
          }
        }
    }

    wo(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        L0: {
          L1: {
            this.field_Ab = false;
            if (this.field_t == 2) {
              break L1;
            } else {
              if (4 == this.field_t) {
                break L1;
              } else {
                if ((this.field_t ^ -1) != -7) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_D = 143360;
          this.field_ub = 21;
          break L0;
        }
    }

    public static void w(int param0) {
        field_yb = null;
        field_zb = null;
        field_xb = null;
        if (param0 <= 34) {
            field_zb = (int[]) null;
        }
    }

    static {
        field_wb = false;
        field_zb = new int[8192];
    }
}
