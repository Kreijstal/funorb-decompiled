/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd extends jh {
    static t field_D;
    static o field_F;
    static boolean field_E;

    final static void a(byte param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == vk.field_E) {
                break L0;
              } else {
                L1: {
                  if ((param1 ^ -1) > -1) {
                    break L1;
                  } else {
                    if (w.field_cb != ef.field_a) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (-1 != (wa.field_d.field_n ^ -1)) {
                    break L2;
                  } else {
                    if (km.b(-1) > 10000L + ak.field_k) {
                      wa.field_d.f(-44, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param0 <= -48) {
                    break L3;
                  } else {
                    field_D = null;
                    break L3;
                  }
                }
                L4: {
                  if ((wa.field_d.field_n ^ -1) < -1) {
                    try {
                      L5: {
                        vk.field_E.a(0, wa.field_d.field_j, (byte) 47, wa.field_d.field_n);
                        ak.field_k = km.b(-1);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ih.b(true);
                        break L6;
                      }
                    }
                    wa.field_d.field_n = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
            wa.field_d.field_n = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean g(byte param0) {
        pm var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pm var5 = null;
        var4 = Torquing.field_u;
        var5 = (pm) (Object) ul.field_e.b(0);
        var1 = var5;
        if (var1 == null) {
          return false;
        } else {
          var2 = 0;
          var3 = 60 / ((param0 - -84) / 40);
          L0: while (true) {
            if (var1.field_l <= var2) {
              return true;
            } else {
              L1: {
                if (null != var5.field_u[var2]) {
                  if (var5.field_u[var2].field_a == 0) {
                    return false;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (null != var5.field_n[var2]) {
                  if (0 != var5.field_n[var2].field_a) {
                    break L2;
                  } else {
                    return false;
                  }
                } else {
                  var2++;
                  break L2;
                }
              }
              var2++;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
            return -110;
        }
        if (wa.field_f) {
            return -1;
        }
        if (dg.field_h > q.field_d) {
            return -1;
        }
        if (q.field_d < dg.field_h + cf.field_e) {
            return il.field_l;
        }
        return -1;
    }

    public static void h(int param0) {
        field_D = null;
        if (param0 > -26) {
            field_E = false;
            field_F = null;
            return;
        }
        field_F = null;
    }

    private jd(int param0, int param1, int param2, int param3, el param4, ca param5, gm param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((jd) this).field_C = param6;
    }

    final static void a(boolean param0, int param1) {
        q var2 = null;
        int var3 = 0;
        ni var4 = null;
        var3 = Torquing.field_u;
        var4 = (ni) (Object) vb.field_f.b(0);
        if (!param0) {
          boolean discarded$1 = jd.g((byte) -33);
          L0: while (true) {
            if (var4 == null) {
              var2 = qf.field_a.b(0);
              L1: while (true) {
                if (var2 != null) {
                  lc.b(0, param1);
                  var2 = qf.field_a.f(-24059);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              l.a(var4, param1, 1);
              var4 = (ni) (Object) vb.field_f.f(-24059);
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (var4 == null) {
              var2 = qf.field_a.b(0);
              L3: while (true) {
                if (var2 != null) {
                  lc.b(0, param1);
                  var2 = qf.field_a.f(-24059);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              l.a(var4, param1, 1);
              var4 = (ni) (Object) vb.field_f.f(-24059);
              continue L2;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        super.a(param0, param1, param2, (byte) 124, param4, param5);
        aj var8 = lp.field_d;
        if (var8 != null) {
            if (!((jd) this).a(param5, param2, param1, param0, 121)) {
                if (param3 > 109) {
                    return;
                }
                field_F = null;
                return;
            }
            if (((jd) this).field_t instanceof dm) {
                ((dm) (Object) ((jd) this).field_t).a(3139, var8, (jd) this);
                lp.field_d = null;
                if (param3 > 109) {
                    return;
                }
                field_F = null;
                return;
            }
            if (!(var8.field_t instanceof dm)) {
                if (param3 > 109) {
                    return;
                }
                field_F = null;
                return;
            }
            ((dm) (Object) var8.field_t).a(3139, var8, (jd) this);
            lp.field_d = null;
        }
        if (param3 > 109) {
            return;
        }
        field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = false;
    }
}
