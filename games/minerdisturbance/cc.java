/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cc extends kn {
    private hm field_I;
    boolean field_K;
    static String field_M;
    private int field_J;
    static int[] field_L;

    final void a(byte param0, int param1, int param2, int param3) {
        if (((cc) this).field_J != -1) {
          if (-257 > ((cc) this).field_J) {
            if (null != mn.field_t) {
              if (((cc) this).field_v <= mn.field_t.field_y) {
                if (mn.field_t.field_C < ((cc) this).field_q) {
                  mn.field_t = new ea(((cc) this).field_v, ((cc) this).field_q);
                  vb.a(mn.field_t, 127);
                  eh.d();
                  ((cc) this).b(21533, 0, 0);
                  super.a(param0, -param1 - ((cc) this).field_u, -param2 - ((cc) this).field_t, param3);
                  tk.b(true);
                  mn.field_t.f(((cc) this).field_u + param1, ((cc) this).field_t + param2, ((cc) this).field_J);
                  return;
                } else {
                  vb.a(mn.field_t, 127);
                  eh.d();
                  ((cc) this).b(21533, 0, 0);
                  super.a(param0, -param1 - ((cc) this).field_u, -param2 - ((cc) this).field_t, param3);
                  tk.b(true);
                  mn.field_t.f(((cc) this).field_u + param1, ((cc) this).field_t + param2, ((cc) this).field_J);
                  return;
                }
              } else {
                mn.field_t = new ea(((cc) this).field_v, ((cc) this).field_q);
                vb.a(mn.field_t, 127);
                eh.d();
                ((cc) this).b(21533, 0, 0);
                super.a(param0, -param1 - ((cc) this).field_u, -param2 - ((cc) this).field_t, param3);
                tk.b(true);
                mn.field_t.f(((cc) this).field_u + param1, ((cc) this).field_t + param2, ((cc) this).field_J);
                return;
              }
            } else {
              mn.field_t = new ea(((cc) this).field_v, ((cc) this).field_q);
              vb.a(mn.field_t, 127);
              eh.d();
              ((cc) this).b(21533, 0, 0);
              super.a(param0, -param1 - ((cc) this).field_u, -param2 - ((cc) this).field_t, param3);
              tk.b(true);
              mn.field_t.f(((cc) this).field_u + param1, ((cc) this).field_t + param2, ((cc) this).field_J);
              return;
            }
          } else {
            if (param3 != 0) {
              return;
            } else {
              ((cc) this).b(21533, ((cc) this).field_t + param2, ((cc) this).field_u + param1);
              super.a((byte) 4, param1, param2, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        L0: {
          dk.field_e = dk.field_e + 1;
          if (25 == dk.field_e) {
            dk.field_e = 0;
            break L0;
          } else {
            break L0;
          }
        }
        gl.field_u[dk.field_e] = rc.a(re.field_a[17], 100, oc.field_f);
        sa discarded$2 = mg.a(1963987425, gl.field_u[dk.field_e]);
        sd.field_c[dk.field_e] = param0;
        if (param1 != 136989569) {
          cc.a(25, 120);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 55) {
          return;
        } else {
          ((cc) this).a(param0, -101, -param1 + od.field_n >> 1, param1, ae.field_c - param0 >> 1);
          return;
        }
    }

    final fe m(int param0) {
        fe var2 = null;
        var2 = super.m(123);
        if (param0 > 107) {
          if (var2 != null) {
            return var2;
          } else {
            return (fe) this;
          }
        } else {
          ((cc) this).field_I = null;
          if (var2 != null) {
            return var2;
          } else {
            return (fe) this;
          }
        }
    }

    final static void a(byte param0) {
        cm var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        cm var6 = null;
        var5 = MinerDisturbance.field_ab;
        var6 = (cm) (Object) ce.field_a.b(94);
        var1 = var6;
        if (var1 != null) {
          var3 = tf.field_a;
          if (var3 >= 100) {
            if (var3 >= 250) {
              var2 = -123 - (-(var3 / 2) + -480) + -58;
              var4 = ce.field_d.c(ld.field_A[var6.field_s], 640);
              g.a(var2 + -10, 60, -var4 + 570, var4 + 60, (byte) 60, he.field_b);
              nj.field_c[var6.field_s].c(590, var2);
              ce.field_d.c(ld.field_A[var6.field_s], 582, var2 + ce.field_d.field_I, 1, -1);
              return;
            } else {
              var2 = 424;
              var4 = ce.field_d.c(ld.field_A[var6.field_s], 640);
              g.a(var2 + -10, 60, -var4 + 570, var4 + 60, (byte) 60, he.field_b);
              nj.field_c[var6.field_s].c(590, var2);
              ce.field_d.c(ld.field_A[var6.field_s], 582, var2 + ce.field_d.field_I, 1, -1);
              return;
            }
          } else {
            var2 = 480 + (32 + (-var3 / 2 - 38));
            var4 = ce.field_d.c(ld.field_A[var6.field_s], 640);
            g.a(var2 + -10, 60, -var4 + 570, var4 + 60, (byte) 60, he.field_b);
            nj.field_c[var6.field_s].c(590, var2);
            ce.field_d.c(ld.field_A[var6.field_s], 582, var2 + ce.field_d.field_I, 1, -1);
            return;
          }
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        field_M = null;
        field_L = null;
    }

    private final int f(byte param0) {
        int var2 = -108 / ((param0 - 53) / 58);
        return !((cc) this).field_K ? 0 : (Object) (Object) ((cc) this).field_I.e((byte) 83) == this ? 256 : 0;
    }

    boolean n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var2 = this.f((byte) 116);
        var3 = -((cc) this).field_J + var2;
        if (0 >= var3) {
          L0: {
            if (0 > var3) {
              ((cc) this).field_J = ((cc) this).field_J + (var3 + -15) / 16;
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != -4) {
            return true;
          } else {
            L1: {
              L2: {
                if (-1 != ((cc) this).field_J) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((cc) this).field_K) {
                      break L2;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L1;
            }
            return stackIn_24_0 != 0;
          }
        } else {
          L3: {
            ((cc) this).field_J = ((cc) this).field_J + (-1 + var3 - -8) / 8;
            if (0 > var3) {
              ((cc) this).field_J = ((cc) this).field_J + (var3 + -15) / 16;
              break L3;
            } else {
              break L3;
            }
          }
          if (param0 == -4) {
            if (((cc) this).field_J == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L4: {
                  if (((cc) this).field_K) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L4;
                  }
                }
                return stackIn_12_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    abstract void b(int param0, int param1, int param2);

    boolean a(boolean param0) {
        ((cc) this).field_J = this.f((byte) -86);
        if (!param0) {
          if (((cc) this).field_J == 0) {
            if (((cc) this).field_K) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    cc(hm param0, int param1, int param2) {
        super(-param1 + od.field_n >> 1, ae.field_c - param2 >> 1, param1, param2, (ad) null);
        try {
            ((cc) this).field_K = false;
            ((cc) this).field_J = 0;
            ((cc) this).field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "cc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Music: ";
    }
}
