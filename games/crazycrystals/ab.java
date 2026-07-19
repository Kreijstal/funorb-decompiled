/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ab extends og {
    private int field_B;
    static ko field_z;
    static te field_D;
    private ol field_E;
    boolean field_C;
    static bf field_A;

    final qm b(boolean param0) {
        qm var2 = super.b(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (qm) (this);
    }

    final static void a(java.applet.Applet param0, long param1, String param2, int param3, String param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
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
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
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
              try {
                L0: {
                  L1: {
                    var7 = -75 / ((param3 - 32) / 56);
                    var9 = param0.getParameter("cookiehost");
                    var8 = var9;
                    var8 = var9;
                    var10 = param2 + "=" + param4 + "; version=1; path=/; domain=" + var9;
                    var8 = var10;
                    var8 = var10;
                    if (0L > param1) {
                      var8 = var10 + "; Discard;";
                      break L1;
                    } else {
                      var8 = var10 + "; Expires=" + sm.a(lo.a((byte) -25) + param1 * 1000L, (byte) 121) + "; Max-Age=" + param1;
                      break L1;
                    }
                  }
                  hi.a("document.cookie=\"" + var8 + "\"", param0, (byte) -79);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var6_ref);
                stackOut_7_1 = new StringBuilder().append("ab.B(");
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
              L3: {
                stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param2 == null) {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L3;
                } else {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L3;
                }
              }
              L4: {
                stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param4 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L4;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(boolean param0) {
        String var2 = null;
        field_D = null;
        if (param0) {
          var2 = (String) null;
          ab.a((java.applet.Applet) null, 11L, (String) null, 125, (String) null);
          field_z = null;
          field_A = null;
          return;
        } else {
          field_z = null;
          field_A = null;
          return;
        }
    }

    final static jp a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        jp var5 = null;
        String var6 = null;
        jp stackIn_4_0 = null;
        jp stackIn_8_0 = null;
        jp stackIn_13_0 = null;
        jp stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_7_0 = null;
        jp stackOut_14_0 = null;
        jp stackOut_12_0 = null;
        jp stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length()) {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackOut_7_0 = ma.field_m;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var3 = param0.substring(0, var2_int);
                      if (param1 <= -67) {
                        break L2;
                      } else {
                        var6 = (String) null;
                        ab.a((java.applet.Applet) null, -12L, (String) null, -98, (String) null);
                        break L2;
                      }
                    }
                    var4 = param0.substring(var2_int + 1);
                    var5 = jm.a(var3, true);
                    if (var5 == null) {
                      stackOut_14_0 = rd.a(true, var4);
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_12_0 = (jp) (var5);
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = f.field_d;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("ab.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        this.a(param0, oj.field_y - param2 >> -97648415, -param0 + pk.field_c >> 1239704033, param2, (byte) -52);
        int var4 = -89 % ((76 - param1) / 37);
    }

    abstract void b(int param0, int param1, int param2);

    ab(ol param0, int param1, int param2) {
        super(-param1 + oj.field_y >> -424193887, pk.field_c + -param2 >> -1839473087, param1, param2, (wo) null);
        try {
            this.field_C = false;
            this.field_E = param0;
            this.field_B = 0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param0 == 8) {
            break L0;
          } else {
            this.b(39, -23, 119);
            break L0;
          }
        }
        L1: {
          var2 = this.a(-124);
          var3 = var2 - this.field_B;
          if (var3 > 0) {
            this.field_B = this.field_B + (var3 + 7) / 8;
            break L1;
          } else {
            break L1;
          }
        }
        if (-1 < (var3 ^ -1)) {
          this.field_B = this.field_B + (1 + (var3 + -16)) / 16;
          if (-1 == (this.field_B ^ -1)) {
            if (var2 != 0) {
              return false;
            } else {
              L2: {
                if (this.field_C) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L2;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L2;
                }
              }
              return stackIn_21_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          if (-1 == (this.field_B ^ -1)) {
            if (var2 != 0) {
              return false;
            } else {
              L3: {
                if (this.field_C) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              return stackIn_12_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    boolean e(byte param0) {
        boolean discarded$7 = false;
        this.field_B = this.a(-109);
        if (param0 == 79) {
          if (this.field_B == 0) {
            if (this.field_C) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$7 = this.g((byte) 76);
          if (this.field_B == 0) {
            if (this.field_C) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= -100) {
          L0: {
            ab.c(false);
            if (!this.field_C) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (this.field_E.j(0) == this) {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 0;
                stackIn_12_0 = stackOut_9_0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!this.field_C) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (this.field_E.j(0) == this) {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 0;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (this.field_B != 0) {
          if (this.field_B >= 256) {
            if (-1 != (param3 ^ -1)) {
              return;
            } else {
              this.b(30, this.field_r + param2, this.field_j + param0);
              super.a(param0, (byte) -87, param2, param3);
              return;
            }
          } else {
            if (hp.field_g != null) {
              if (this.field_g <= hp.field_g.field_l) {
                if (hp.field_g.field_u >= this.field_f) {
                  em.a((byte) 38, hp.field_g);
                  kh.a();
                  this.b(30, 0, 0);
                  super.a(-this.field_j + -param0, (byte) -89, -this.field_r + -param2, param3);
                  lg.a(1);
                  if (param1 >= -12) {
                    return;
                  } else {
                    hp.field_g.f(this.field_r + param2, param0 + this.field_j, this.field_B);
                    return;
                  }
                } else {
                  hp.field_g = new dl(this.field_g, this.field_f);
                  em.a((byte) 38, hp.field_g);
                  kh.a();
                  this.b(30, 0, 0);
                  super.a(-this.field_j + -param0, (byte) -89, -this.field_r + -param2, param3);
                  lg.a(1);
                  if (param1 >= -12) {
                    return;
                  } else {
                    hp.field_g.f(this.field_r + param2, param0 + this.field_j, this.field_B);
                    return;
                  }
                }
              } else {
                hp.field_g = new dl(this.field_g, this.field_f);
                em.a((byte) 38, hp.field_g);
                kh.a();
                this.b(30, 0, 0);
                super.a(-this.field_j + -param0, (byte) -89, -this.field_r + -param2, param3);
                lg.a(1);
                if (param1 >= -12) {
                  return;
                } else {
                  hp.field_g.f(this.field_r + param2, param0 + this.field_j, this.field_B);
                  return;
                }
              }
            } else {
              hp.field_g = new dl(this.field_g, this.field_f);
              em.a((byte) 38, hp.field_g);
              kh.a();
              this.b(30, 0, 0);
              super.a(-this.field_j + -param0, (byte) -89, -this.field_r + -param2, param3);
              lg.a(1);
              if (param1 >= -12) {
                return;
              } else {
                hp.field_g.f(this.field_r + param2, param0 + this.field_j, this.field_B);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void f(byte param0) {
        if (param0 == -49) {
          if (null == qe.field_g) {
            if (td.field_b != null) {
              td.field_b.i((byte) 32);
              ck.m(0);
              return;
            } else {
              ck.m(0);
              return;
            }
          } else {
            qe.field_g.h(0);
            if (td.field_b != null) {
              td.field_b.i((byte) 32);
              ck.m(0);
              return;
            } else {
              ck.m(0);
              return;
            }
          }
        } else {
          field_D = (te) null;
          if (null != qe.field_g) {
            qe.field_g.h(0);
            if (td.field_b == null) {
              ck.m(0);
              return;
            } else {
              td.field_b.i((byte) 32);
              ck.m(0);
              return;
            }
          } else {
            if (td.field_b != null) {
              td.field_b.i((byte) 32);
              ck.m(0);
              return;
            } else {
              ck.m(0);
              return;
            }
          }
        }
    }

    static {
        field_D = null;
        field_A = new bf();
    }
}
