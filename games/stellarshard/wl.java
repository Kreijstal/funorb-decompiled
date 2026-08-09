/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl extends tb {
    private oa field_Q;
    private int field_bb;
    static boolean field_ab;
    static volatile int field_R;
    private rd field_X;
    private int field_U;
    private int field_V;
    private int field_Z;
    private rj field_Y;
    static String field_W;
    private int field_S;
    static String field_T;
    static int[] field_P;

    boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (this.field_Q != null) {
                L1: {
                  if (param1 != 98) {
                    break L1;
                  } else {
                    this.field_Q.a(-2147483648, param3);
                    break L1;
                  }
                }
                L2: {
                  if (-100 == (param1 ^ -1)) {
                    this.field_Q.a(param0 ^ -2147453991, param3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("wl.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final void i(int param0) {
        if (!(this.field_X == null)) {
            if (!(this.field_X == cj.field_b)) {
                this.a(12 + this.field_Y.field_p, (byte) -68, 12 + (this.field_Z - -this.field_Y.field_t));
                this.c(9, this.field_Y);
            }
            this.field_X = null;
            this.field_Q.field_A = 256;
        }
        super.i(param0);
    }

    final static void l(int param0) {
        o.field_g = null;
        pd.field_g = null;
        qh.field_g = false;
        if (param0 != -12128) {
          field_ab = false;
          bb.field_k = null;
          fb.field_e = null;
          return;
        } else {
          bb.field_k = null;
          fb.field_e = null;
          return;
        }
    }

    final void j(int param0) {
        if (this.field_X == hj.field_d) {
          return;
        } else {
          this.field_U = 0;
          this.field_X = cj.field_b;
          if (param0 != -21) {
            return;
          } else {
            this.c(-94, this.field_Y);
            this.field_Q.field_A = 0;
            this.field_Y = null;
            return;
          }
        }
    }

    final static void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        String var4 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ie.field_r = false;
              ck.field_db = false;
              if (param1 == -8440) {
                break L1;
              } else {
                var4 = (String) null;
                wl.a(-111, -58, (String) null);
                break L1;
              }
            }
            L2: {
              if (ei.field_G == null) {
                break L2;
              } else {
                if (!ei.field_G.field_G) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 1;
                    if (8 == param0) {
                      L4: {
                        if (!gk.field_a) {
                          param2 = dd.field_f;
                          break L4;
                        } else {
                          param2 = ce.field_g;
                          break L4;
                        }
                      }
                      param0 = 2;
                      af.field_r.b(va.field_a, 15);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (-11 != (param0 ^ -1)) {
                      break L5;
                    } else {
                      var3_int = 0;
                      pi.a(false);
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int != 0) {
                      L7: {
                        if (!ie.field_r) {
                          break L7;
                        } else {
                          param2 = h.a(oa.field_F, 0, new String[]{param2});
                          break L7;
                        }
                      }
                      L8: {
                        if (!ak.field_a) {
                          break L8;
                        } else {
                          param2 = sj.field_E;
                          break L8;
                        }
                      }
                      ei.field_G.a(param2, param0, param1 + 8517);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if ((param0 ^ -1) == -257) {
                    break L2;
                  } else {
                    if (param0 == 10) {
                      break L2;
                    } else {
                      if (!gk.field_a) {
                        af.field_r.e((byte) 41);
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            runtimeException = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (runtimeException);

            stackIn_27_1 = new StringBuilder().append("wl.EB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    boolean d(boolean param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        var3 = stellarshard.field_B;
        if (!param0) {
          this.i(-92);
          if (this.field_X != null) {
            if (hj.field_d == this.field_X) {
              fieldTemp$4 = this.field_U + 1;
              this.field_U = this.field_U + 1;
              if (this.field_V == fieldTemp$4) {
                this.field_X = fj.field_i;
                this.a(this.field_S, 12 - -this.field_Y.field_p, (byte) -97, this.field_Z + 12 + this.field_Y.field_t);
                this.field_Q.field_A = 0;
                this.field_U = 0;
                return super.d(true);
              } else {
                this.field_Q.field_A = -((this.field_U << -1645066808) / this.field_V) + 256;
                return super.d(true);
              }
            } else {
              if (cj.field_b == this.field_X) {
                fieldTemp$5 = this.field_U + 1;
                this.field_U = this.field_U + 1;
                if (this.field_bb == fieldTemp$5) {
                  this.field_Q.field_A = 256;
                  this.field_X = null;
                  return super.d(true);
                } else {
                  this.field_Q.field_A = (this.field_U << 1225620520) / this.field_bb;
                  return super.d(true);
                }
              } else {
                return super.d(true);
              }
            }
          } else {
            return super.d(true);
          }
        } else {
          if (this.field_X != null) {
            if (hj.field_d == this.field_X) {
              fieldTemp$6 = this.field_U + 1;
              this.field_U = this.field_U + 1;
              if (this.field_V == fieldTemp$6) {
                this.field_X = fj.field_i;
                this.a(this.field_S, 12 - -this.field_Y.field_p, (byte) -97, this.field_Z + 12 + this.field_Y.field_t);
                this.field_Q.field_A = 0;
                this.field_U = 0;
                return super.d(true);
              } else {
                this.field_Q.field_A = -((this.field_U << -1645066808) / this.field_V) + 256;
                return super.d(true);
              }
            } else {
              if (cj.field_b == this.field_X) {
                fieldTemp$7 = this.field_U + 1;
                this.field_U = this.field_U + 1;
                if (this.field_bb == fieldTemp$7) {
                  this.field_Q.field_A = 256;
                  this.field_X = null;
                  return super.d(true);
                } else {
                  this.field_Q.field_A = (this.field_U << 1225620520) / this.field_bb;
                  return super.d(true);
                }
              } else {
                return super.d(true);
              }
            }
          } else {
            return super.d(true);
          }
        }
    }

    public static void k(int param0) {
        int var1 = -94 / ((-26 - param0) / 49);
        field_W = null;
        field_T = null;
        field_P = null;
    }

    void b(rj param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        rj var4 = null;
        try {
          L0: {
            L1: {
              this.field_Y = param0;
              if (fj.field_i == this.field_X) {
                this.a(this.field_S, this.field_Y.field_p + 12, (byte) -97, this.field_Z + (12 - -this.field_Y.field_t));
                this.field_U = 0;
                break L1;
              } else {
                if (hj.field_d != this.field_X) {
                  this.field_U = 0;
                  this.field_X = hj.field_d;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param1 == 23143) {
              break L0;
            } else {
              var4 = (rj) null;
              this.b((rj) null, 17);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("wl.I(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    wl(ei param0, rj param1, int param2, int param3, int param4) {
        super(param0, param1.field_p + 12, 12 + param2 + param1.field_t);
        try {
            this.field_S = param4;
            this.field_bb = param3;
            this.field_V = param3;
            this.field_Z = param2;
            this.c(16, param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "wl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean h(int param0) {
        this.i(3642);
        if (param0 < 98) {
            this.field_Q = (oa) null;
            return super.h(106);
        }
        return super.h(106);
    }

    private final void c(int param0, rj param1) {
        try {
            int var3_int = -55 % ((param0 - -47) / 47);
            if (this.field_Q != null) {
                this.field_Q.c(20);
            }
            if (param1 == null) {
                this.field_Q = new oa();
            } else {
                param1.b(param1.field_p, 6, 6 + this.field_Z, param1.field_t, 23987);
                this.field_Q = new oa(param1);
            }
            this.b(4, this.field_Q);
            this.field_Y = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "wl.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static pf a(int param0, int param1) {
        if (param0 != 1) {
            return (pf) null;
        }
        return na.a(1, 255, param1, false, false, true);
    }

    static {
        field_R = 0;
        field_ab = false;
        field_W = "Please wait...";
        field_T = "Log in / Create account";
        field_P = new int[8192];
    }
}
