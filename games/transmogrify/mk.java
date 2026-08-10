/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mk extends aj {
    static ti field_y;
    boolean field_A;
    static String field_C;
    private int field_D;
    static int field_x;
    static int[] field_w;
    static ti[] field_B;
    static String field_E;
    private da field_z;

    boolean a(byte param0) {
        this.field_D = this.l(-18555);
        if (param0 == -97) {
          if (0 == this.field_D) {
            if (this.field_A) {
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

    boolean m(int param0) {
        int var2;
        int var3;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        L0: {
          var2 = this.l(-18555);
          var3 = -this.field_D + var2;
          if (var3 > param0) {
            this.field_D = this.field_D + (var3 - -8 + -1) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (0 <= var3) {
          if (0 == this.field_D) {
            if (0 != var2) {
              return false;
            } else {
              L1: {
                if (this.field_A) {
                  stackIn_19_0 = 0;
                  break L1;
                } else {
                  stackIn_19_0 = 1;
                  break L1;
                }
              }
              return stackIn_19_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          this.field_D = this.field_D + (var3 + -15) / 16;
          if (0 == this.field_D) {
            if (0 != var2) {
              return false;
            } else {
              L2: {
                if (this.field_A) {
                  stackIn_10_0 = 0;
                  break L2;
                } else {
                  stackIn_10_0 = 1;
                  break L2;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    private final int l(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (param0 != -18555) {
          L0: {
            field_y = (ti) null;
            if (this.field_A) {
              if (this.field_z.e((byte) 14) != this) {
                stackIn_12_0 = 0;
                break L0;
              } else {
                stackIn_12_0 = 256;
                break L0;
              }
            } else {
              stackIn_12_0 = 0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (this.field_A) {
              if (this.field_z.e((byte) 14) != this) {
                stackIn_6_0 = 0;
                break L1;
              } else {
                stackIn_6_0 = 256;
                break L1;
              }
            } else {
              stackIn_6_0 = 0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    final static uk a(int param0, String param1) {
        int var2_int = 0;
        String var3 = null;
        uk var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        uk stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 30 / ((param0 - 46) / 38);
            if (null != sj.field_u) {
              if (param1 != null) {
                if (0 != param1.length()) {
                  var7 = (CharSequence) ((Object) param1);
                  var3 = hj.a((byte) -126, var7);
                  if (var3 != null) {
                    var4 = (uk) ((Object) sj.field_u.a((long)var3.hashCode(), (byte) -72));
                    L1: while (true) {
                      if (var4 != null) {
                        var8 = (CharSequence) ((Object) var4.field_eb);
                        var5 = hj.a((byte) -128, var8);
                        if (var5.equals(var3)) {
                          stackIn_17_0 = (uk) (var4);
                          break L0;
                        } else {
                          var4 = (uk) ((Object) sj.field_u.a(-91));
                          continue L1;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("mk.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        return stackIn_17_0;
    }

    final static uj a(int param0, String param1, int param2) {
        uj var3 = null;
        RuntimeException var3_ref = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 242763393) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            var3 = new uj(false);
            var3.field_g = param2;
            var3.field_b = param1;
            stackIn_3_0 = (uj) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("mk.I(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    mk(da param0, int param1, int param2) {
        super(-param1 + cd.field_b >> -630955359, wj.field_h - param2 >> -566847295, param1, param2, (ui) null);
        try {
            this.field_D = 0;
            this.field_A = false;
            this.field_z = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        this.a(87, -param1 + wj.field_h >> -326895263, cd.field_b + -param0 >> 242763393, param0, param1);
        if (param2) {
            field_B = (ti[]) null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        var5 = -122 % ((param3 - 77) / 34);
        if (this.field_D != 0) {
          if (-257 < (this.field_D ^ -1)) {
            if (qk.field_c != null) {
              if (this.field_l <= qk.field_c.field_n) {
                if (qk.field_c.field_m < this.field_h) {
                  qk.field_c = new ti(this.field_l, this.field_h);
                  oj.a(qk.field_c, 256);
                  sb.c();
                  this.a(0, (byte) -81, 0);
                  super.a(-this.field_p + -param0, -this.field_n + -param1, param2, (byte) -93);
                  fi.c(true);
                  qk.field_c.e(param0 + this.field_p, param1 + this.field_n, this.field_D);
                  return;
                } else {
                  oj.a(qk.field_c, 256);
                  sb.c();
                  this.a(0, (byte) -81, 0);
                  super.a(-this.field_p + -param0, -this.field_n + -param1, param2, (byte) -93);
                  fi.c(true);
                  qk.field_c.e(param0 + this.field_p, param1 + this.field_n, this.field_D);
                  return;
                }
              } else {
                qk.field_c = new ti(this.field_l, this.field_h);
                oj.a(qk.field_c, 256);
                sb.c();
                this.a(0, (byte) -81, 0);
                super.a(-this.field_p + -param0, -this.field_n + -param1, param2, (byte) -93);
                fi.c(true);
                qk.field_c.e(param0 + this.field_p, param1 + this.field_n, this.field_D);
                return;
              }
            } else {
              qk.field_c = new ti(this.field_l, this.field_h);
              oj.a(qk.field_c, 256);
              sb.c();
              this.a(0, (byte) -81, 0);
              super.a(-this.field_p + -param0, -this.field_n + -param1, param2, (byte) -93);
              fi.c(true);
              qk.field_c.e(param0 + this.field_p, param1 + this.field_n, this.field_D);
              return;
            }
          } else {
            if (param2 != 0) {
              return;
            } else {
              this.a(this.field_n + param1, (byte) -106, param0 - -this.field_p);
              super.a(param0, param1, param2, (byte) -27);
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract void a(int param0, byte param1, int param2);

    final qg i(int param0) {
        qg var2;
        var2 = super.i(-120);
        if (var2 != null) {
          return var2;
        } else {
          if (param0 > -112) {
            field_w = (int[]) null;
            return (qg) (this);
          } else {
            return (qg) (this);
          }
        }
    }

    public static void n(int param0) {
        field_y = null;
        field_w = null;
        field_B = null;
        field_E = null;
        if (param0 > -23) {
            return;
        }
        field_C = null;
    }

    static {
        field_C = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_w = new int[8192];
        field_E = "Open in popup window";
    }
}
