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
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var7 = -75 / ((param3 - 32) / 56);
                var9 = param0.getParameter("cookiehost");
                var8 = var9;
                var8 = var9;
                var10 = param2 + "=" + param4 + "; version=1; path=/; domain=" + var9;
                var8 = var10;
                var8 = var10;
                if (0L > param1) {
                  var8 = var10 + "; Discard;";
                  break L0;
                } else {
                  var8 = var10 + "; Expires=" + sm.a(lo.a((byte) -25) + param1 * 1000L, (byte) 121) + "; Max-Age=" + param1;
                  break L0;
                }
              }
              hi.a("document.cookie=\"" + var8 + "\"", param0, (byte) -79);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(boolean param0) {
        Object var2 = null;
        field_D = null;
        if (param0) {
          var2 = null;
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
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        jp var5 = null;
        Object var6 = null;
        var4 = param0;
        if (param0 != null) {
          if (0 != param0.length()) {
            var2 = param0.indexOf('@');
            if (var2 == -1) {
              return ma.field_m;
            } else {
              var3 = param0.substring(0, var2);
              if (param1 <= -67) {
                var4 = param0.substring(var2 + 1);
                var5 = jm.a(var3, true);
                if (var5 != null) {
                  return var5;
                } else {
                  return rd.a(true, var4);
                }
              } else {
                var6 = null;
                ab.a((java.applet.Applet) null, -12L, (String) null, -98, (String) null);
                var4 = param0.substring(var2 + 1);
                var5 = jm.a(var3, true);
                if (var5 != null) {
                  return var5;
                } else {
                  return rd.a(true, var4);
                }
              }
            }
          } else {
            return f.field_d;
          }
        } else {
          return f.field_d;
        }
    }

    final void a(int param0, byte param1, int param2) {
        ((ab) this).a(param0, oj.field_y - param2 >> -97648415, -param0 + pk.field_c >> 1239704033, param2, (byte) -52);
        int var4 = -89 % ((76 - param1) / 37);
    }

    abstract void b(int param0, int param1, int param2);

    ab(ol param0, int param1, int param2) {
        super(-param1 + oj.field_y >> -424193887, pk.field_c + -param2 >> -1839473087, param1, param2, (wo) null);
        ((ab) this).field_C = false;
        ((ab) this).field_E = param0;
        ((ab) this).field_B = 0;
    }

    boolean g(byte param0) {
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
          if (-1 < var3) {
            L1: {
              L2: {
                ((ab) this).field_B = ((ab) this).field_B + (1 + (var3 + -16)) / 16;
                if (-1 != ((ab) this).field_B) {
                  break L2;
                } else {
                  if (var2 != -1) {
                    break L2;
                  } else {
                    if (((ab) this).field_C) {
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
                if (-1 != ((ab) this).field_B) {
                  break L4;
                } else {
                  if (var2 != 0) {
                    break L4;
                  } else {
                    if (((ab) this).field_C) {
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
          if (-1 < var3) {
            ((ab) this).field_B = ((ab) this).field_B + (1 + (var3 + -16)) / 16;
            if (-1 == (((ab) this).field_B ^ -1)) {
              if (var2 != 0) {
                return false;
              } else {
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
              }
            } else {
              return false;
            }
          } else {
            if (-1 == ((ab) this).field_B) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (((ab) this).field_C) {
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
            if (-1 != (param3 ^ -1)) {
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
          field_D = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = null;
        field_A = new bf();
    }
}
