/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb extends hn {
    private ln field_C;
    boolean field_D;
    private int field_B;

    abstract void b(int param0, int param1, byte param2);

    bb(ln param0, int param1, int param2) {
        super(qj.field_f - param1 >> 1, -param2 + kn.field_h >> 1, param1, param2, (el) null);
        try {
            ((bb) this).field_C = param0;
            ((bb) this).field_D = false;
            ((bb) this).field_B = 0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 != -25) {
          return;
        } else {
          ((bb) this).a((byte) 127, qj.field_f - param0 >> 1, -param2 + kn.field_h >> 1, param2, param0);
          return;
        }
    }

    boolean a(byte param0) {
        ((bb) this).field_B = this.i(256);
        if (param0 > 114) {
          if (0 == ((bb) this).field_B) {
            if (((bb) this).field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((bb) this).field_D = false;
          if (0 == ((bb) this).field_B) {
            if (((bb) this).field_D) {
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
        return (gm) this;
    }

    private final int i(int param0) {
        return !((bb) this).field_D ? 0 : (Object) (Object) ((bb) this).field_C.a(0) == this ? 256 : 0;
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
        var3 = var2 - ((bb) this).field_B;
        if (var3 <= 0) {
          L0: {
            if (0 > var3) {
              ((bb) this).field_B = ((bb) this).field_B + (-16 + (var3 + 1)) / 16;
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != -7) {
            L1: {
              L2: {
                ((bb) this).field_B = 80;
                if (-1 != ((bb) this).field_B) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((bb) this).field_D) {
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
                if (-1 != ((bb) this).field_B) {
                  break L4;
                } else {
                  if (var2 != 0) {
                    break L4;
                  } else {
                    if (((bb) this).field_D) {
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
            ((bb) this).field_B = ((bb) this).field_B + (7 + var3) / 8;
            if (0 > var3) {
              ((bb) this).field_B = ((bb) this).field_B + (-16 + (var3 + 1)) / 16;
              break L5;
            } else {
              break L5;
            }
          }
          if (param0 != -7) {
            ((bb) this).field_B = 80;
            if (((bb) this).field_B == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L6: {
                  if (((bb) this).field_D) {
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
            if (((bb) this).field_B == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (((bb) this).field_D) {
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
        if (((bb) this).field_B != 0) {
          if (((bb) this).field_B >= 256) {
            if (param0 != 0) {
              return;
            } else {
              ((bb) this).b(((bb) this).field_k + param2, param3 + ((bb) this).field_w, (byte) -117);
              super.a(param0, (byte) -19, param2, param3);
              return;
            }
          } else {
            if (null != ue.field_b) {
              if (((bb) this).field_p <= ue.field_b.field_s) {
                if (((bb) this).field_o <= ue.field_b.field_t) {
                  if (param1 > -7) {
                    boolean discarded$4 = ((bb) this).a((byte) -26);
                    tm.a((byte) -109, ue.field_b);
                    ph.b();
                    ((bb) this).b(0, 0, (byte) -127);
                    super.a(param0, (byte) -64, -param2 + -((bb) this).field_k, -((bb) this).field_w + -param3);
                    r.a(126);
                    ue.field_b.e(param3 + ((bb) this).field_w, ((bb) this).field_k + param2, ((bb) this).field_B);
                    return;
                  } else {
                    tm.a((byte) -109, ue.field_b);
                    ph.b();
                    ((bb) this).b(0, 0, (byte) -127);
                    super.a(param0, (byte) -64, -param2 + -((bb) this).field_k, -((bb) this).field_w + -param3);
                    r.a(126);
                    ue.field_b.e(param3 + ((bb) this).field_w, ((bb) this).field_k + param2, ((bb) this).field_B);
                    return;
                  }
                } else {
                  ue.field_b = new t(((bb) this).field_p, ((bb) this).field_o);
                  if (param1 > -7) {
                    boolean discarded$5 = ((bb) this).a((byte) -26);
                    tm.a((byte) -109, ue.field_b);
                    ph.b();
                    ((bb) this).b(0, 0, (byte) -127);
                    super.a(param0, (byte) -64, -param2 + -((bb) this).field_k, -((bb) this).field_w + -param3);
                    r.a(126);
                    ue.field_b.e(param3 + ((bb) this).field_w, ((bb) this).field_k + param2, ((bb) this).field_B);
                    return;
                  } else {
                    tm.a((byte) -109, ue.field_b);
                    ph.b();
                    ((bb) this).b(0, 0, (byte) -127);
                    super.a(param0, (byte) -64, -param2 + -((bb) this).field_k, -((bb) this).field_w + -param3);
                    r.a(126);
                    ue.field_b.e(param3 + ((bb) this).field_w, ((bb) this).field_k + param2, ((bb) this).field_B);
                    return;
                  }
                }
              } else {
                ue.field_b = new t(((bb) this).field_p, ((bb) this).field_o);
                if (param1 > -7) {
                  boolean discarded$6 = ((bb) this).a((byte) -26);
                  tm.a((byte) -109, ue.field_b);
                  ph.b();
                  ((bb) this).b(0, 0, (byte) -127);
                  super.a(param0, (byte) -64, -param2 + -((bb) this).field_k, -((bb) this).field_w + -param3);
                  r.a(126);
                  ue.field_b.e(param3 + ((bb) this).field_w, ((bb) this).field_k + param2, ((bb) this).field_B);
                  return;
                } else {
                  tm.a((byte) -109, ue.field_b);
                  ph.b();
                  ((bb) this).b(0, 0, (byte) -127);
                  super.a(param0, (byte) -64, -param2 + -((bb) this).field_k, -((bb) this).field_w + -param3);
                  r.a(126);
                  ue.field_b.e(param3 + ((bb) this).field_w, ((bb) this).field_k + param2, ((bb) this).field_B);
                  return;
                }
              }
            } else {
              ue.field_b = new t(((bb) this).field_p, ((bb) this).field_o);
              if (param1 > -7) {
                boolean discarded$7 = ((bb) this).a((byte) -26);
                tm.a((byte) -109, ue.field_b);
                ph.b();
                ((bb) this).b(0, 0, (byte) -127);
                super.a(param0, (byte) -64, -param2 + -((bb) this).field_k, -((bb) this).field_w + -param3);
                r.a(126);
                ue.field_b.e(param3 + ((bb) this).field_w, ((bb) this).field_k + param2, ((bb) this).field_B);
                return;
              } else {
                tm.a((byte) -109, ue.field_b);
                ph.b();
                ((bb) this).b(0, 0, (byte) -127);
                super.a(param0, (byte) -64, -param2 + -((bb) this).field_k, -((bb) this).field_w + -param3);
                r.a(126);
                ue.field_b.e(param3 + ((bb) this).field_w, ((bb) this).field_k + param2, ((bb) this).field_B);
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
