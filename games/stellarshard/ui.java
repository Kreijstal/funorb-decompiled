/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ui extends g {
    private int field_E;
    private ei field_H;
    boolean field_G;
    static pb field_F;
    static li field_C;
    static String field_D;
    static String field_B;

    final void a(int param0, byte param1, int param2, int param3) {
        if (((ui) this).field_E != 0) {
          if (((ui) this).field_E >= 256) {
            if (param0 != 0) {
              return;
            } else {
              ((ui) this).b(param1 ^ -58, param2 + ((ui) this).field_k, param3 + ((ui) this).field_w);
              super.a(param0, (byte) -57, param2, param3);
              return;
            }
          } else {
            if (rj.field_s != null) {
              if (((ui) this).field_p <= rj.field_s.field_v) {
                if (((ui) this).field_t <= rj.field_s.field_y) {
                  hj.a(rj.field_s, 1);
                  ti.d();
                  ((ui) this).b(param1 + 58, 0, 0);
                  super.a(param0, param1, -((ui) this).field_k + -param2, -((ui) this).field_w + -param3);
                  id.b((byte) -58);
                  rj.field_s.e(param3 + ((ui) this).field_w, param2 - -((ui) this).field_k, ((ui) this).field_E);
                  return;
                } else {
                  rj.field_s = new pb(((ui) this).field_p, ((ui) this).field_t);
                  hj.a(rj.field_s, 1);
                  ti.d();
                  ((ui) this).b(param1 + 58, 0, 0);
                  super.a(param0, param1, -((ui) this).field_k + -param2, -((ui) this).field_w + -param3);
                  id.b((byte) -58);
                  rj.field_s.e(param3 + ((ui) this).field_w, param2 - -((ui) this).field_k, ((ui) this).field_E);
                  return;
                }
              } else {
                rj.field_s = new pb(((ui) this).field_p, ((ui) this).field_t);
                hj.a(rj.field_s, 1);
                ti.d();
                ((ui) this).b(param1 + 58, 0, 0);
                super.a(param0, param1, -((ui) this).field_k + -param2, -((ui) this).field_w + -param3);
                id.b((byte) -58);
                rj.field_s.e(param3 + ((ui) this).field_w, param2 - -((ui) this).field_k, ((ui) this).field_E);
                return;
              }
            } else {
              rj.field_s = new pb(((ui) this).field_p, ((ui) this).field_t);
              hj.a(rj.field_s, 1);
              ti.d();
              ((ui) this).b(param1 + 58, 0, 0);
              super.a(param0, param1, -((ui) this).field_k + -param2, -((ui) this).field_w + -param3);
              id.b((byte) -58);
              rj.field_s.e(param3 + ((ui) this).field_w, param2 - -((ui) this).field_k, ((ui) this).field_E);
              return;
            }
          }
        } else {
          return;
        }
    }

    private final int a(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          if (!((ui) this).field_G) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if ((Object) (Object) ((ui) this).field_H.d((byte) -120) == this) {
              stackOut_3_0 = 256;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        return stackIn_5_0;
    }

    public static void e(byte param0) {
        field_B = null;
        field_F = null;
        field_C = null;
        field_D = null;
    }

    abstract void b(int param0, int param1, int param2);

    boolean d(boolean param0) {
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
        if (param0) {
          L0: {
            var2 = this.a(0);
            var3 = var2 - ((ui) this).field_E;
            if (var3 > 0) {
              ((ui) this).field_E = ((ui) this).field_E + (8 + (var3 + -1)) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if (var3 < 0) {
            L1: {
              L2: {
                ((ui) this).field_E = ((ui) this).field_E + (var3 - 15) / 16;
                if (0 != ((ui) this).field_E) {
                  break L2;
                } else {
                  if (0 != var2) {
                    break L2;
                  } else {
                    if (((ui) this).field_G) {
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
                if (0 != ((ui) this).field_E) {
                  break L4;
                } else {
                  if (0 != var2) {
                    break L4;
                  } else {
                    if (((ui) this).field_G) {
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
            field_B = null;
            var2 = this.a(0);
            var3 = var2 - ((ui) this).field_E;
            if (var3 > 0) {
              ((ui) this).field_E = ((ui) this).field_E + (8 + (var3 + -1)) / 8;
              break L5;
            } else {
              break L5;
            }
          }
          if (var3 < 0) {
            ((ui) this).field_E = ((ui) this).field_E + (var3 - 15) / 16;
            if (0 == ((ui) this).field_E) {
              if (0 != var2) {
                return false;
              } else {
                L6: {
                  if (((ui) this).field_G) {
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
            if (0 == ((ui) this).field_E) {
              if (0 != var2) {
                return false;
              } else {
                L7: {
                  if (((ui) this).field_G) {
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

    final rj a(byte param0) {
        rj var2 = super.a(param0);
        if (var2 != null) {
            return var2;
        }
        return (rj) this;
    }

    boolean h(int param0) {
        if (param0 > 98) {
          ((ui) this).field_E = this.a(0);
          if (((ui) this).field_E == 0) {
            if (((ui) this).field_G) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    ui(ei param0, int param1, int param2) {
        super(ml.field_b + -param1 >> 1, -param2 + vf.field_F >> 1, param1, param2, (uk) null);
        try {
            ((ui) this).field_E = 0;
            ((ui) this).field_H = param0;
            ((ui) this).field_G = false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ui.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, byte param1, int param2) {
        ((ui) this).b(param0, ml.field_b - param0 >> 1, vf.field_F + -param2 >> 1, param2, 23987);
        if (param1 > -4) {
            field_B = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new li(12, 0, 1, 0);
        field_D = "Checking";
        field_B = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
