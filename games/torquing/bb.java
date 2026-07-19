/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb extends hn {
    private ln field_C;
    boolean field_D;
    private int field_B;

    abstract void b(int param0, int param1, byte param2);

    bb(ln param0, int param1, int param2) {
        super(qj.field_f - param1 >> -1801638975, -param2 + kn.field_h >> -533280063, param1, param2, (el) null);
        try {
            this.field_C = param0;
            this.field_D = false;
            this.field_B = 0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 != -25) {
          return;
        } else {
          this.a((byte) 127, qj.field_f - param0 >> -1691362975, -param2 + kn.field_h >> 535499489, param2, param0);
          return;
        }
    }

    boolean a(byte param0) {
        this.field_B = this.i(256);
        if (param0 > 114) {
          if (0 == this.field_B) {
            if (this.field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_D = false;
          if (0 == this.field_B) {
            if (this.field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final gm a(int param0) {
        gm var2 = super.a(param0 ^ param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (gm) (this);
    }

    private final int i(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 256) {
          L0: {
            this.field_C = (ln) null;
            if (this.field_D) {
              if (this.field_C.a(0) != this) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_12_0 = stackOut_8_0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (this.field_D) {
              if (this.field_C.a(0) != this) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var2 = this.i(256);
        var3 = var2 - this.field_B;
        if (-1 <= (var3 ^ -1)) {
          L0: {
            if (0 > var3) {
              this.field_B = this.field_B + (-16 + (var3 + 1)) / 16;
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != -7) {
            L1: {
              L2: {
                this.field_B = 80;
                if (-1 != (this.field_B ^ -1)) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (this.field_D) {
                      break L2;
                    } else {
                      stackOut_36_0 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_37_0 = 0;
              stackIn_38_0 = stackOut_37_0;
              break L1;
            }
            return stackIn_38_0 != 0;
          } else {
            L3: {
              L4: {
                if (-1 != (this.field_B ^ -1)) {
                  break L4;
                } else {
                  if (var2 != 0) {
                    break L4;
                  } else {
                    if (this.field_D) {
                      break L4;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L3;
                    }
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L3;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          L5: {
            this.field_B = this.field_B + (7 + var3) / 8;
            if (0 > var3) {
              this.field_B = this.field_B + (-16 + (var3 + 1)) / 16;
              break L5;
            } else {
              break L5;
            }
          }
          if (param0 != -7) {
            this.field_B = 80;
            if (-1 == (this.field_B ^ -1)) {
              if (var2 != 0) {
                return false;
              } else {
                L6: {
                  if (this.field_D) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L6;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L6;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (-1 == (this.field_B ^ -1)) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (this.field_D) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L7;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L7;
                  }
                }
                return stackIn_11_0 != 0;
              }
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        if (this.field_B != 0) {
          if (this.field_B >= 256) {
            if (param0 != 0) {
              return;
            } else {
              this.b(this.field_k + param2, param3 + this.field_w, (byte) -117);
              super.a(param0, (byte) -19, param2, param3);
              return;
            }
          } else {
            if (null != ue.field_b) {
              if (this.field_p <= ue.field_b.field_s) {
                if (this.field_o <= ue.field_b.field_t) {
                  if (param1 > -7) {
                    discarded$4 = this.a((byte) -26);
                    tm.a((byte) -109, ue.field_b);
                    ph.b();
                    this.b(0, 0, (byte) -127);
                    super.a(param0, (byte) -64, -param2 + -this.field_k, -this.field_w + -param3);
                    r.a(126);
                    ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
                    return;
                  } else {
                    tm.a((byte) -109, ue.field_b);
                    ph.b();
                    this.b(0, 0, (byte) -127);
                    super.a(param0, (byte) -64, -param2 + -this.field_k, -this.field_w + -param3);
                    r.a(126);
                    ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
                    return;
                  }
                } else {
                  ue.field_b = new t(this.field_p, this.field_o);
                  if (param1 > -7) {
                    discarded$5 = this.a((byte) -26);
                    tm.a((byte) -109, ue.field_b);
                    ph.b();
                    this.b(0, 0, (byte) -127);
                    super.a(param0, (byte) -64, -param2 + -this.field_k, -this.field_w + -param3);
                    r.a(126);
                    ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
                    return;
                  } else {
                    tm.a((byte) -109, ue.field_b);
                    ph.b();
                    this.b(0, 0, (byte) -127);
                    super.a(param0, (byte) -64, -param2 + -this.field_k, -this.field_w + -param3);
                    r.a(126);
                    ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
                    return;
                  }
                }
              } else {
                ue.field_b = new t(this.field_p, this.field_o);
                if (param1 > -7) {
                  discarded$6 = this.a((byte) -26);
                  tm.a((byte) -109, ue.field_b);
                  ph.b();
                  this.b(0, 0, (byte) -127);
                  super.a(param0, (byte) -64, -param2 + -this.field_k, -this.field_w + -param3);
                  r.a(126);
                  ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
                  return;
                } else {
                  tm.a((byte) -109, ue.field_b);
                  ph.b();
                  this.b(0, 0, (byte) -127);
                  super.a(param0, (byte) -64, -param2 + -this.field_k, -this.field_w + -param3);
                  r.a(126);
                  ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
                  return;
                }
              }
            } else {
              ue.field_b = new t(this.field_p, this.field_o);
              if (param1 > -7) {
                discarded$7 = this.a((byte) -26);
                tm.a((byte) -109, ue.field_b);
                ph.b();
                this.b(0, 0, (byte) -127);
                super.a(param0, (byte) -64, -param2 + -this.field_k, -this.field_w + -param3);
                r.a(126);
                ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
                return;
              } else {
                tm.a((byte) -109, ue.field_b);
                ph.b();
                this.b(0, 0, (byte) -127);
                super.a(param0, (byte) -64, -param2 + -this.field_k, -this.field_w + -param3);
                r.a(126);
                ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
    }
}
