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
        return (qm) this;
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
                stackOut_7_0 = (RuntimeException) var6_ref;
                stackOut_7_1 = new StringBuilder().append("ab.B(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L2;
                }
              }
              L3: {
                stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param2 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L3;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L3;
                }
              }
              L4: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param3).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param4 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L4;
                }
              }
              throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(boolean param0) {
        field_D = null;
        field_z = null;
        field_A = null;
    }

    final static jp a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        jp var5 = null;
        jp stackIn_4_0 = null;
        jp stackIn_8_0 = null;
        jp stackIn_11_0 = null;
        jp stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_7_0 = null;
        jp stackOut_12_0 = null;
        jp stackOut_10_0 = null;
        jp stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
                    return stackIn_8_0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int + 1);
                    var5 = jm.a(var3, true);
                    if (var5 == null) {
                      stackOut_12_0 = rd.a(true, var4);
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      stackOut_10_0 = (jp) var5;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = f.field_d;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("ab.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + -114 + 41);
        }
        return stackIn_13_0;
    }

    final void a(int param0, byte param1, int param2) {
        ((ab) this).a(param0, oj.field_y - param2 >> 1, -param0 + pk.field_c >> 1, param2, (byte) -52);
        int var4 = -89 % ((76 - param1) / 37);
    }

    abstract void b(int param0, int param1, int param2);

    ab(ol param0, int param1, int param2) {
        super(-param1 + oj.field_y >> 1, pk.field_c + -param2 >> 1, param1, param2, (wo) null);
        try {
            ((ab) this).field_C = false;
            ((ab) this).field_E = param0;
            ((ab) this).field_B = 0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ab.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (param0 == 8) {
          L0: {
            var2 = this.a(-124);
            var3 = var2 - ((ab) this).field_B;
            if (var3 > 0) {
              ((ab) this).field_B = ((ab) this).field_B + (var3 + 7) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if (var3 >= 0) {
            L1: {
              L2: {
                if (((ab) this).field_B != 0) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((ab) this).field_C) {
                      break L2;
                    } else {
                      stackOut_34_0 = 1;
                      stackIn_36_0 = stackOut_34_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_35_0 = 0;
              stackIn_36_0 = stackOut_35_0;
              break L1;
            }
            return stackIn_36_0 != 0;
          } else {
            L3: {
              L4: {
                ((ab) this).field_B = ((ab) this).field_B + (1 + (var3 + -16)) / 16;
                if (((ab) this).field_B != 0) {
                  break L4;
                } else {
                  if (var2 != 0) {
                    break L4;
                  } else {
                    if (((ab) this).field_C) {
                      break L4;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L3;
                    }
                  }
                }
              }
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L3;
            }
            return stackIn_30_0 != 0;
          }
        } else {
          L5: {
            ((ab) this).b(39, -23, 119);
            var2 = this.a(-124);
            var3 = var2 - ((ab) this).field_B;
            if (var3 > 0) {
              ((ab) this).field_B = ((ab) this).field_B + (var3 + 7) / 8;
              break L5;
            } else {
              break L5;
            }
          }
          if (var3 < 0) {
            ((ab) this).field_B = ((ab) this).field_B + (1 + (var3 + -16)) / 16;
            if (((ab) this).field_B == 0) {
              if (var2 == 0) {
                L6: {
                  if (((ab) this).field_C) {
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
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (((ab) this).field_B == 0) {
              if (var2 == 0) {
                L7: {
                  if (((ab) this).field_C) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L7;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L7;
                  }
                }
                return stackIn_12_0 != 0;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    boolean e(byte param0) {
        ((ab) this).field_B = this.a(-109);
        if (param0 == 79) {
          if (((ab) this).field_B == 0) {
            if (((ab) this).field_C) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$7 = ((ab) this).g((byte) 76);
          if (((ab) this).field_B == 0) {
            if (((ab) this).field_C) {
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
            if (!((ab) this).field_C) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if ((Object) (Object) ((ab) this).field_E.j(0) == this) {
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
            if (!((ab) this).field_C) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if ((Object) (Object) ((ab) this).field_E.j(0) == this) {
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
        if (((ab) this).field_B != 0) {
          if (((ab) this).field_B >= 256) {
            if (param3 != 0) {
              return;
            } else {
              ((ab) this).b(30, ((ab) this).field_r + param2, ((ab) this).field_j + param0);
              super.a(param0, (byte) -87, param2, param3);
              return;
            }
          } else {
            if (hp.field_g != null) {
              if (((ab) this).field_g <= hp.field_g.field_l) {
                if (hp.field_g.field_u >= ((ab) this).field_f) {
                  em.a((byte) 38, hp.field_g);
                  kh.a();
                  ((ab) this).b(30, 0, 0);
                  super.a(-((ab) this).field_j + -param0, (byte) -89, -((ab) this).field_r + -param2, param3);
                  lg.a(1);
                  if (param1 >= -12) {
                    return;
                  } else {
                    hp.field_g.f(((ab) this).field_r + param2, param0 + ((ab) this).field_j, ((ab) this).field_B);
                    return;
                  }
                } else {
                  hp.field_g = new dl(((ab) this).field_g, ((ab) this).field_f);
                  em.a((byte) 38, hp.field_g);
                  kh.a();
                  ((ab) this).b(30, 0, 0);
                  super.a(-((ab) this).field_j + -param0, (byte) -89, -((ab) this).field_r + -param2, param3);
                  lg.a(1);
                  if (param1 >= -12) {
                    return;
                  } else {
                    hp.field_g.f(((ab) this).field_r + param2, param0 + ((ab) this).field_j, ((ab) this).field_B);
                    return;
                  }
                }
              } else {
                hp.field_g = new dl(((ab) this).field_g, ((ab) this).field_f);
                em.a((byte) 38, hp.field_g);
                kh.a();
                ((ab) this).b(30, 0, 0);
                super.a(-((ab) this).field_j + -param0, (byte) -89, -((ab) this).field_r + -param2, param3);
                lg.a(1);
                if (param1 >= -12) {
                  return;
                } else {
                  hp.field_g.f(((ab) this).field_r + param2, param0 + ((ab) this).field_j, ((ab) this).field_B);
                  return;
                }
              }
            } else {
              hp.field_g = new dl(((ab) this).field_g, ((ab) this).field_f);
              em.a((byte) 38, hp.field_g);
              kh.a();
              ((ab) this).b(30, 0, 0);
              super.a(-((ab) this).field_j + -param0, (byte) -89, -((ab) this).field_r + -param2, param3);
              lg.a(1);
              if (param1 >= -12) {
                return;
              } else {
                hp.field_g.f(((ab) this).field_r + param2, param0 + ((ab) this).field_j, ((ab) this).field_B);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void f(byte param0) {
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
          if (td.field_b == null) {
            ck.m(0);
            return;
          } else {
            td.field_b.i((byte) 32);
            ck.m(0);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = null;
        field_A = new bf();
    }
}
