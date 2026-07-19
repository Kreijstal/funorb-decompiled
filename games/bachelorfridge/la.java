/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends bca {
    static vr field_s;
    static int field_r;
    int field_t;
    int field_q;

    final static void a(int param0, pia param1) {
        int var2_int = 0;
        int var3 = 0;
        try {
            lo.field_b = param1;
            if (param0 != 3) {
                la.d(-39);
            }
            var2_int = 1000;
            var3 = 6 + (lo.field_b.field_B + lo.field_b.field_F);
            if (1 == (var3 & 1)) {
                var3++;
            }
            sca.field_a = new kv(var2_int, var3);
            ap.field_c = new kv(var2_int, var3);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 != 2) {
            pia var2 = (pia) null;
            la.a(109, (pia) null);
        }
    }

    la(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        aga discarded$14 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              discarded$14 = this.field_l.a(78, param0);
              stackOut_0_0 = this;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param0.e(this.field_q, this.field_t, -11066)) {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            ((la) (this)).field_p = stackIn_3_1 != 0;
            var3_int = -82 % ((param1 - 12) / 35);
            if (!this.field_p) {
              param0.b((byte) 103, 35, this.field_q, this.field_t);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("la.E(");
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (-1 <= (dm.field_f ^ -1)) {
          if (bp.e(param1 ^ -29917)) {
            L0: {
              var2 = 0;
              if (qt.field_l != null) {
                break L0;
              } else {
                if (ai.field_e) {
                  tfa.a(var2, param1 ^ 3, param0);
                  break L0;
                } else {
                  if (param1 == 2) {
                    return;
                  } else {
                    field_r = -88;
                    return;
                  }
                }
              }
            }
            if (param1 == 2) {
              return;
            } else {
              field_r = -88;
              return;
            }
          } else {
            L1: {
              var2 = 1;
              if (qt.field_l != null) {
                break L1;
              } else {
                if (ai.field_e) {
                  tfa.a(var2, param1 ^ 3, param0);
                  break L1;
                } else {
                  if (param1 == 2) {
                    return;
                  } else {
                    field_r = -88;
                    return;
                  }
                }
              }
            }
            if (param1 == 2) {
              return;
            } else {
              field_r = -88;
              return;
            }
          }
        } else {
          if (null != qt.field_l) {
            kga.field_c = qt.field_l.c((byte) -91);
            fga.a(2, (byte) -2);
            if (kga.field_c != null) {
              nl.a(kga.field_c, (byte) 92);
              var2 = 2;
              if (qt.field_l == null) {
                L2: {
                  if (ai.field_e) {
                    tfa.a(var2, param1 ^ 3, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param1 == 2) {
                  return;
                } else {
                  field_r = -88;
                  return;
                }
              } else {
                if (param1 == 2) {
                  return;
                } else {
                  field_r = -88;
                  return;
                }
              }
            } else {
              var2 = 3;
              if (qt.field_l == null) {
                L3: {
                  if (ai.field_e) {
                    tfa.a(var2, param1 ^ 3, param0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param1 == 2) {
                  return;
                } else {
                  field_r = -88;
                  return;
                }
              } else {
                if (param1 == 2) {
                  return;
                } else {
                  field_r = -88;
                  return;
                }
              }
            }
          } else {
            kga.field_c = mfa.a(true, 640, 0, 480, ju.field_r, 0);
            if (kga.field_c != null) {
              L4: {
                nl.a(kga.field_c, (byte) 92);
                var2 = 2;
                if (qt.field_l != null) {
                  break L4;
                } else {
                  if (ai.field_e) {
                    tfa.a(var2, param1 ^ 3, param0);
                    break L4;
                  } else {
                    if (param1 != 2) {
                      field_r = -88;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param1 != 2) {
                field_r = -88;
                return;
              } else {
                return;
              }
            } else {
              L5: {
                var2 = 3;
                if (qt.field_l != null) {
                  break L5;
                } else {
                  if (ai.field_e) {
                    tfa.a(var2, param1 ^ 3, param0);
                    break L5;
                  } else {
                    if (param1 != 2) {
                      field_r = -88;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param1 != 2) {
                field_r = -88;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(byte param0, lu param1) {
        try {
            super.a((byte) -48, param1);
            param1.d(this.field_q, 0);
            if (param0 >= -12) {
                this.field_t = -45;
            }
            param1.d(this.field_t, 0);
            param1.d(this.field_p ? 1 : 0, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "la.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        dca stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dca stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                field_s = (vr) null;
                break L1;
              }
            }
            stackOut_2_0 = new dca(param1, (la) (this), this.field_p);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("la.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (at) ((Object) stackIn_3_0);
    }

    la(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            this.field_k = param0.e((byte) 100);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (-1 < (var2_int ^ -1)) {
                    break;
                }
                this.field_o.a(dca.a((byte) 102, param0), true);
            }
            this.field_q = param0.b(16711935);
            this.field_t = param0.b(16711935);
            this.field_p = 1 == param0.b(16711935) ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "la.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = -1;
    }
}
