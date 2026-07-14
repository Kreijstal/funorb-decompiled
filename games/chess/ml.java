/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static rk field_g;
    static ci field_f;
    static long field_d;
    private int[] field_c;
    private int field_e;
    private boolean field_b;
    static String field_h;
    private int field_a;

    final static void a(java.applet.Applet param0, byte param1) {
        CharSequence var3 = null;
        String var2 = param0.getParameter("username");
        if (var2 != null) {
            var3 = (CharSequence) (Object) var2;
            if (0L == jl.a(var3, false)) {
                return;
            }
            if (param1 != -43) {
                field_h = null;
            }
            return;
        }
    }

    final static short[] a(short[] param0, int param1, nk param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Chess.field_G;
          var4 = param2.e(20, param1);
          if (param3 > 40) {
            break L0;
          } else {
            var9 = null;
            ml.a((java.applet.Applet) null, (byte) 24);
            break L0;
          }
        }
        if (var4 != 0) {
          L1: {
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0.length != var4) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            param0 = new short[var4];
            break L1;
          }
          L3: {
            var5 = param2.e(127, 4);
            var6 = (short)param2.e(22, 16);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param0[var7] = (short)(param2.e(29, var5) + var6);
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Chess.field_G;
        var3 = ((ml) this).field_c.length;
        if (param1 == -1) {
          L0: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (!((ml) this).field_b) {
                var3 = var3 + ((ml) this).field_a;
                continue L0;
              } else {
                if (-1 != (var3 ^ -1)) {
                  var3 = var3 * ((ml) this).field_a;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 7;
        }
    }

    final static void a(byte param0, ld param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Chess.field_G;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            var2 = 0;
            L1: while (true) {
              if (qf.field_c <= var2) {
                L2: {
                  pj.field_f[param1.b(2)] = pj.field_f[param1.b(2)] + 1;
                  var2 = 0;
                  if (param0 > 3) {
                    break L2;
                  } else {
                    field_f = null;
                    break L2;
                  }
                }
                var3 = 0;
                L3: while (true) {
                  if (var3 >= qf.field_c) {
                    qf.field_c = var2;
                    qf.field_c = qf.field_c + 1;
                    ik.field_i[qf.field_c] = param1;
                    return;
                  } else {
                    L4: {
                      if (param1.field_k != ik.field_i[var3].field_k) {
                        break L4;
                      } else {
                        var4 = ik.field_i[var3].b(2);
                        if (pj.field_f[var4] <= fh.field_b) {
                          break L4;
                        } else {
                          pj.field_f[var4] = pj.field_f[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      }
                    }
                    var2++;
                    ik.field_i[var2] = ik.field_i[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (param1.field_k == ik.field_i[var2].field_k) {
                  pj.field_f[ik.field_i[var2].b(2)] = pj.field_f[ik.field_i[var2].b(2)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            pj.field_f[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, km[] param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Chess.field_G;
        if (param1 != null) {
            if (0 >= param4) {
                return;
            }
            var5 = param1[0].field_v;
            var6 = param1[2].field_v;
            var7 = param1[1].field_v;
            param1[0].b(param2, param0);
            param1[2].b(param2 + (param4 - var6), param0);
            wb.b(o.field_d);
            wb.e(var5 + param2, param0, param4 + (param2 - var6), param1[1].field_u + param0);
            if (param3 > -125) {
                return;
            }
            var8 = var5 + param2;
            var9 = -var6 + param2 + param4;
            param2 = var8;
            while (param2 < var9) {
                param1[1].b(param2, param0);
                param2 = param2 + var7;
            }
            wb.a(o.field_d);
            return;
        }
    }

    final int c(int param0, int param1) {
        if (param1 != 1) {
            Object var4 = null;
            ml.a((java.applet.Applet) null, (byte) 91);
        }
        if (((ml) this).field_e < param0) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((ml) this).field_c[param0];
    }

    private final void d(int param0, int param1) {
        int[] var4 = new int[this.b(param1, -1)];
        int[] var3 = var4;
        ne.a(((ml) this).field_c, 0, var4, 0, ((ml) this).field_c.length);
        if (param0 != 19840) {
            field_f = null;
        }
        ((ml) this).field_c = var4;
    }

    final static void a(String param0, ln param1, byte param2, boolean param3) {
        dh var9 = null;
        String var10 = null;
        String var12 = null;
        dh var13 = null;
        String var14 = null;
        dh var11 = null;
        ja.a(0L, (String) null, (byte) -103, ci.field_zb, -1, (ci) (Object) param1, (int[]) null, param1.g((byte) -82), (String) null);
        if (param1.field_Vb) {
            if ((param1.field_Mb ^ -1) != -3) {
                // if_icmple L54
            } else {
                var9 = pi.field_d;
                var10 = oc.a(sl.field_h, new String[1], (byte) -43);
                var9.field_b.a((byte) -12, var10, 10);
            }
        }
        pi.field_d.b((byte) -97);
        if (!param3) {
        } else {
            if (cn.field_g != pi.field_d.field_d) {
                var11 = pi.field_d;
                var12 = oc.a(tm.field_b, new String[1], (byte) -71);
                var11.field_b.a((byte) -12, var12, 15);
            } else {
                var13 = pi.field_d;
                var14 = oc.a(qc.field_c, new String[1], (byte) -54);
                var13.field_b.a((byte) -12, var14, 16);
            }
        }
        int var5 = -10 / ((34 - param2) / 47);
        dh var15 = pi.field_d;
        int var6 = re.field_m;
        int var7 = ag.field_f;
        var15.field_b.a(true, var6, 0, var7, 0);
    }

    private final void a(boolean param0, int param1, int param2) {
        if (((ml) this).field_e < param1) {
            ((ml) this).field_e = param1;
        }
        if (((ml) this).field_c.length <= param1) {
            this.d(19840, param1);
        }
        ((ml) this).field_c[param1] = param2;
        if (!param0) {
            ((ml) this).field_c = null;
        }
    }

    final static void a(int param0) {
        sg.field_c.setLength(param0);
        vk.field_g = 0;
    }

    final void a(int param0, byte param1) {
        this.a(true, ((ml) this).field_e - -1, param0);
        int var3 = 77 / ((param1 - 0) / 42);
    }

    final void a(int param0, int param1) {
        L0: {
          if (param0 < (param1 ^ -1)) {
            break L0;
          } else {
            if (((ml) this).field_e >= param1) {
              L1: {
                if (((ml) this).field_e == param1) {
                  break L1;
                } else {
                  ne.a(((ml) this).field_c, param1 + 1, ((ml) this).field_c, param1, ((ml) this).field_e + -param1);
                  break L1;
                }
              }
              ((ml) this).field_e = ((ml) this).field_e - 1;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    final int a(boolean param0) {
        if (!param0) {
            return 127;
        }
        return 1 + ((ml) this).field_e;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != -122) {
            field_f = null;
        }
        field_h = null;
        field_f = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var3 = i.a(param2, param0);
        if (param1.indexOf(param0) != -1) {
          return true;
        } else {
          if (param1.indexOf(var3) == -1) {
            L0: {
              L1: {
                if (param1.startsWith(param0)) {
                  break L1;
                } else {
                  if (param1.startsWith(var3)) {
                    break L1;
                  } else {
                    if (param1.endsWith(param0)) {
                      break L1;
                    } else {
                      if (!param1.endsWith(var3)) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
            return stackIn_11_0 != 0;
          } else {
            return true;
          }
        }
    }

    final static boolean a(int param0, um param1) {
        if (param0 != 0) {
            Object var3 = null;
            short[] discarded$0 = ml.a((short[]) null, 52, (nk) null, 27);
        }
        return param1.b((byte) -40);
    }

    private ml() throws Throwable {
        throw new Error();
    }

    static {
    }
}
