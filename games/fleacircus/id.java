/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id {
    static int field_c;
    static int[] field_h;
    static String field_j;
    static char field_b;
    private int[] field_a;
    private int field_e;
    static String field_i;
    static int field_g;
    private boolean field_d;
    private int field_f;

    final static boolean a(boolean param0, boolean param1) {
        try {
            IOException var2 = null;
            ih var4 = null;
            ih var5 = null;
            int stackIn_13_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return false;
                    }
                    case 2: {
                        if (gg.field_e == null) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        gg.field_e = af.field_f.a(be.field_b, (byte) 32, a.field_d);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (0 == gg.field_e.field_b) {
                            statePc = 7;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return false;
                    }
                    case 8: {
                        jd.field_n = lj.a((byte) -47);
                        ug.field_d = lj.a((byte) -47);
                        if (1 == gg.field_e.field_b) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        rh.field_k = wb.field_q;
                        gg.field_e = null;
                        return true;
                    }
                    case 10: {
                        try {
                            sg.field_h = new td((java.net.Socket) gg.field_e.field_e, af.field_f);
                            ud.field_b.field_i = 0;
                            var4 = ae.field_a;
                            var5 = var4;
                            rh.field_k = d.field_O;
                            var5.field_i = 0;
                            if (!param1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = -2;
                            stackIn_13_0 = stackOut_11_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = -1;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            hc.field_j = stackIn_13_0;
                            rj.field_k = stackIn_13_0;
                            vi.field_a = stackIn_13_0;
                            ob.a(cj.field_b, j.field_g, (byte) -127, bb.field_E, (ni) (Object) ud.field_b);
                            dk.b((byte) 41, -1);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        gg.field_e = null;
                        return true;
                    }
                    case 15: {
                        var2 = (IOException) (Object) caughtException;
                        rh.field_k = wb.field_q;
                        gg.field_e = null;
                        return true;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        if (bh.field_t == 10) {
          re.a(-17634);
          bh.field_t = 11;
          if (param0) {
            return;
          } else {
            rj.field_m = true;
            return;
          }
        } else {
          if (lk.a(-109)) {
            if (param0) {
              return;
            } else {
              rj.field_m = true;
              return;
            }
          } else {
            re.a(-17634);
            bh.field_t = 11;
            if (param0) {
              return;
            } else {
              rj.field_m = true;
              return;
            }
          }
        }
    }

    private final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (!param1) {
          field_j = null;
          var3 = ((id) this).field_a.length;
          L0: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (((id) this).field_d) {
                if (0 != var3) {
                  var3 = var3 * ((id) this).field_f;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              } else {
                var3 = var3 + ((id) this).field_f;
                continue L0;
              }
            }
          }
        } else {
          var3 = ((id) this).field_a.length;
          L1: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (((id) this).field_d) {
                if (0 != var3) {
                  var3 = var3 * ((id) this).field_f;
                  continue L1;
                } else {
                  var3 = 1;
                  continue L1;
                }
              } else {
                var3 = var3 + ((id) this).field_f;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (((id) this).field_e >= param0) {
          L0: {
            if (param0 >= ((id) this).field_a.length) {
              this.a(0, param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (param2 > -126) {
            int discarded$4 = ((id) this).b(-106);
            ((id) this).field_a[param0] = param1;
            return;
          } else {
            ((id) this).field_a[param0] = param1;
            return;
          }
        } else {
          L1: {
            ((id) this).field_e = param0;
            if (param0 >= ((id) this).field_a.length) {
              this.a(0, param0);
              break L1;
            } else {
              break L1;
            }
          }
          if (param2 <= -126) {
            ((id) this).field_a[param0] = param1;
            return;
          } else {
            int discarded$5 = ((id) this).b(-106);
            ((id) this).field_a[param0] = param1;
            return;
          }
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 > ((id) this).field_e) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1) {
            this.a(-40, -13, 81);
            return ((id) this).field_a[param0];
          } else {
            return ((id) this).field_a[param0];
          }
        }
    }

    final void b(int param0, int param1) {
        if (param0 == 1) {
          if (0 <= param1) {
            if (((id) this).field_e >= param1) {
              if (((id) this).field_e != param1) {
                dm.a(((id) this).field_a, 1 + param1, ((id) this).field_a, param1, -param1 + ((id) this).field_e);
                ((id) this).field_e = ((id) this).field_e - 1;
                return;
              } else {
                ((id) this).field_e = ((id) this).field_e - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          this.a(-59, -73, 120);
          if (0 <= param1) {
            if (((id) this).field_e >= param1) {
              if (((id) this).field_e == param1) {
                ((id) this).field_e = ((id) this).field_e - 1;
                return;
              } else {
                dm.a(((id) this).field_a, 1 + param1, ((id) this).field_a, param1, -param1 + ((id) this).field_e);
                ((id) this).field_e = ((id) this).field_e - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    final static ob a(String param0, int param1) {
        int var2 = 0;
        String[] var3 = null;
        int var5 = 0;
        ob var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        String var11 = null;
        String[] var12 = null;
        String[] var13 = null;
        String var14 = null;
        var8 = fleas.field_A ? 1 : 0;
        if (param1 == 31592) {
          var2 = param0.length();
          if (var2 == 0) {
            return tf.field_H;
          } else {
            if (var2 > 255) {
              return hg.field_i;
            } else {
              var12 = m.a('.', 114, param0);
              var3 = var12;
              if ((var12.length ^ -1) > -3) {
                return tf.field_H;
              } else {
                var13 = var12;
                var5 = 0;
                L0: while (true) {
                  if (var13.length > var5) {
                    var14 = var13[var5];
                    var7 = bj.a(param1 + -31656, var14);
                    if (var7 != null) {
                      return var7;
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    return oa.a(var3[var12.length - 1], -23);
                  }
                }
              }
            }
          }
        } else {
          field_h = null;
          var2 = param0.length();
          if (var2 == 0) {
            return tf.field_H;
          } else {
            if (var2 > 255) {
              return hg.field_i;
            } else {
              var9 = m.a('.', 114, param0);
              var3 = var9;
              if ((var9.length ^ -1) > -3) {
                return tf.field_H;
              } else {
                var10 = var9;
                var5 = 0;
                L1: while (true) {
                  if (var10.length > var5) {
                    var11 = var10[var5];
                    var7 = bj.a(param1 + -31656, var11);
                    if (var7 != null) {
                      return var7;
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    return oa.a(var3[var9.length - 1], -23);
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a(param1, true)];
        int[] var3 = var4;
        dm.a(((id) this).field_a, 0, var4, param0, ((id) this).field_a.length);
        ((id) this).field_a = var4;
    }

    final void a(byte param0, int param1) {
        this.a(((id) this).field_e - -1, param1, -127);
        int var3 = 56 / ((param0 - -33) / 51);
    }

    final int b(int param0) {
        if (param0 != 0) {
            id.a(true);
            return 1 + ((id) this).field_e;
        }
        return 1 + ((id) this).field_e;
    }

    final static boolean a(int param0) {
        if (param0 != -5935) {
            return false;
        }
        return wi.field_f == ui.field_kb ? true : false;
    }

    private id() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        int var1 = 33 / ((-80 - param0) / 42);
        field_i = null;
        field_j = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[150];
        field_j = "This password contains your email address, and would be easy to guess";
        field_g = 0;
    }
}
