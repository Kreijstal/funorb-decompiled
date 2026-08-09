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
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            StringBuilder stackIn_12_1 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
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
                stackIn_9_0 = (RuntimeException) (var6_ref);

                stackIn_9_1 = new StringBuilder().append("ab.B(");

                if (param0 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              L3: {


                stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L3;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(boolean param0) {
        String var2;
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length()) {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackIn_8_0 = ma.field_m;
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
                      stackIn_15_0 = rd.a(true, var4);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_13_0 = (jp) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = f.field_d;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("ab.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
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
        int var2;
        int var3;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
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
                  stackIn_21_0 = 0;
                  break L2;
                } else {
                  stackIn_21_0 = 1;
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
                  stackIn_12_0 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = 1;
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
          this.g((byte) 76);
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
        if (param0 >= -100) {
          L0: {
            ab.c(false);
            if (!this.field_C) {
              stackIn_12_0 = 0;
              break L0;
            } else {
              if (this.field_E.j(0) == this) {
                stackIn_12_0 = 256;
                break L0;
              } else {
                stackIn_12_0 = 0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!this.field_C) {
              stackIn_6_0 = 0;
              break L1;
            } else {
              if (this.field_E.j(0) == this) {
                stackIn_6_0 = 256;
                break L1;
              } else {
                stackIn_6_0 = 0;
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
