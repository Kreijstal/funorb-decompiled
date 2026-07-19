/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld extends gn {
    private int field_N;
    private pk field_L;
    static String field_M;
    boolean field_K;

    final na d(byte param0) {
        na var2 = super.d(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (na) (this);
    }

    private final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 != 0) {
          return 81;
        } else {
          L0: {
            if (!this.field_K) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              if (this.field_L.a(false) == this) {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 0;
                stackIn_6_0 = stackOut_3_0;
                break L0;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    public static void k(int param0) {
        if (param0 > -121) {
            return;
        }
        field_M = null;
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var2 = this.a(0);
        var3 = var2 + -this.field_N;
        if (0 >= var3) {
          L0: {
            if ((var3 ^ -1) > param0) {
              this.field_N = this.field_N + (-16 + var3 - -1) / 16;
              break L0;
            } else {
              break L0;
            }
          }
          if (0 == this.field_N) {
            if (var2 != 0) {
              return false;
            } else {
              L1: {
                if (this.field_K) {
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L1;
                } else {
                  stackOut_20_0 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  break L1;
                }
              }
              return stackIn_22_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          L2: {
            this.field_N = this.field_N + (var3 + 8 - 1) / 8;
            if ((var3 ^ -1) > param0) {
              this.field_N = this.field_N + (-16 + var3 - -1) / 16;
              break L2;
            } else {
              break L2;
            }
          }
          if (0 == this.field_N) {
            if (var2 != 0) {
              return false;
            } else {
              L3: {
                if (this.field_K) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L3;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean b(int param0, int param1, int param2, int param3) {
        if (!cd.field_a) {
          if (param1 == -1885069823) {
            if (hi.field_a) {
              return bg.a(param2, param0, -9614);
            } else {
              if (l.a(param0, param2, param1 ^ 1885069744)) {
                return true;
              } else {
                if (fn.field_K) {
                  return false;
                } else {
                  return ug.c(32, param3, param2);
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return bk.field_e.a(dg.field_e, tb.field_m, -81);
        }
    }

    final void a(int param0, byte param1, int param2) {
        this.a(param2, -param2 + bi.field_a >> -551099295, -118, -param0 + i.field_e >> -1885069823, param0);
        if (param1 <= 17) {
            this.field_L = (pk) null;
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                ke.field_g = param0;
                if (param2 == -1) {
                  try {
                    L1: {
                      L2: {
                        var3 = param1.getParameter("cookieprefix");
                        var4 = param1.getParameter("cookiehost");
                        var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                        if (param0.length() == 0) {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ii.a(-19149, "document.cookie=\"" + var5 + "\"", param1);
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3_ref = decompiledCaughtException;
                      break L3;
                    }
                  }
                  q.a(param1, 118);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) (var3_ref2);
                stackOut_10_1 = new StringBuilder().append("ld.J(");
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param0 == null) {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L4;
                } else {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L4;
                }
              }
              L5: {
                stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_N != 0) {
          if ((this.field_N ^ -1) <= -257) {
            if (0 != param3) {
              return;
            } else {
              this.b(this.field_w + param2, 117, this.field_t + param1);
              super.a(0, param1, param2, param3);
              return;
            }
          } else {
            if (null != ej.field_v) {
              if (this.field_F <= ej.field_v.field_u) {
                if (this.field_u > ej.field_v.field_E) {
                  ej.field_v = new oh(this.field_F, this.field_u);
                  sk.a((byte) 126, ej.field_v);
                  ra.a();
                  this.b(param0, 120, 0);
                  super.a(0, -param1 + -this.field_t, -this.field_w + -param2, param3);
                  dh.a(param0 ^ -581);
                  ej.field_v.a(this.field_t + param1, this.field_w + param2, this.field_N);
                  return;
                } else {
                  sk.a((byte) 126, ej.field_v);
                  ra.a();
                  this.b(param0, 120, 0);
                  super.a(0, -param1 + -this.field_t, -this.field_w + -param2, param3);
                  dh.a(param0 ^ -581);
                  ej.field_v.a(this.field_t + param1, this.field_w + param2, this.field_N);
                  return;
                }
              } else {
                ej.field_v = new oh(this.field_F, this.field_u);
                sk.a((byte) 126, ej.field_v);
                ra.a();
                this.b(param0, 120, 0);
                super.a(0, -param1 + -this.field_t, -this.field_w + -param2, param3);
                dh.a(param0 ^ -581);
                ej.field_v.a(this.field_t + param1, this.field_w + param2, this.field_N);
                return;
              }
            } else {
              ej.field_v = new oh(this.field_F, this.field_u);
              sk.a((byte) 126, ej.field_v);
              ra.a();
              this.b(param0, 120, 0);
              super.a(0, -param1 + -this.field_t, -this.field_w + -param2, param3);
              dh.a(param0 ^ -581);
              ej.field_v.a(this.field_t + param1, this.field_w + param2, this.field_N);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void i(int param0) {
        if (param0 != -21719) {
            field_M = (String) null;
            ma.field_g = false;
            return;
        }
        ma.field_g = false;
    }

    ld(pk param0, int param1, int param2) {
        super(i.field_e + -param1 >> 1282230881, bi.field_a + -param2 >> -2019620991, param1, param2, (kg) null);
        try {
            this.field_K = false;
            this.field_N = 0;
            this.field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean j(int param0) {
        if (param0 > -82) {
            return true;
        }
        return !oa.field_y.c(false) ? true : false;
    }

    boolean h(int param0) {
        if (param0 == 652390224) {
          this.field_N = this.a(0);
          if (-1 == (this.field_N ^ -1)) {
            if (this.field_K) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_M = (String) null;
          this.field_N = this.a(0);
          if (-1 == (this.field_N ^ -1)) {
            if (this.field_K) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    abstract void b(int param0, int param1, int param2);

    static {
        field_M = "<%2>'s turn - playing <%0> (<%1>)";
    }
}
