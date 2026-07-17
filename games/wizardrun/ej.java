/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static ga field_b;
    static java.applet.Applet field_a;
    static String field_e;
    static int field_d;
    static int field_c;

    public static void a() {
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0 == 100) {
          if (0 >= p.field_U) {
            L0: {
              if (param0 != 5000) {
                break L0;
              } else {
                if (dj.field_d <= 0) {
                  break L0;
                } else {
                  int fieldTemp$18 = dj.field_d - 1;
                  dj.field_d = dj.field_d - 1;
                  var2_ref_byte__ = wl.field_g[fieldTemp$18];
                  wl.field_g[dj.field_d] = null;
                  return var2_ref_byte__;
                }
              }
            }
            L1: {
              if (param0 != 30000) {
                break L1;
              } else {
                if (id.field_a <= 0) {
                  break L1;
                } else {
                  byte[][] fieldTemp$19 = qh.field_a;
                  int fieldTemp$20 = id.field_a - 1;
                  id.field_a = id.field_a - 1;
                  var2_ref_byte__ = fieldTemp$19[fieldTemp$20];
                  qh.field_a[id.field_a] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (th.field_a != null) {
              var2 = 0;
              if (mj.field_a.length > var2) {
                if (param0 == mj.field_a[var2]) {
                  if (0 < pe.field_C[var2]) {
                    pe.field_C[var2] = pe.field_C[var2] - 1;
                    var3 = th.field_a[var2][pe.field_C[var2] - 1];
                    th.field_a[var2][pe.field_C[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param0];
                  }
                } else {
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  return new byte[param0];
                }
              } else {
                return new byte[param0];
              }
            } else {
              return new byte[param0];
            }
          } else {
            int fieldTemp$21 = p.field_U - 1;
            p.field_U = p.field_U - 1;
            var2_ref_byte__ = ec.field_f[fieldTemp$21];
            ec.field_f[p.field_U] = null;
            return var2_ref_byte__;
          }
        } else {
          if (param0 == 5000) {
            if (dj.field_d <= 0) {
              if (param0 == 30000) {
                if (id.field_a <= 0) {
                  if (th.field_a != null) {
                    var2 = 0;
                    if (mj.field_a.length > var2) {
                      if (param0 == mj.field_a[var2]) {
                        if (0 >= pe.field_C[var2]) {
                          var2++;
                          var2++;
                          var2++;
                          var2++;
                          return new byte[param0];
                        } else {
                          pe.field_C[var2] = pe.field_C[var2] - 1;
                          var3 = th.field_a[var2][pe.field_C[var2] - 1];
                          th.field_a[var2][pe.field_C[var2]] = null;
                          return var3;
                        }
                      } else {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        return new byte[param0];
                      }
                    } else {
                      return new byte[param0];
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  byte[][] fieldTemp$22 = qh.field_a;
                  int fieldTemp$23 = id.field_a - 1;
                  id.field_a = id.field_a - 1;
                  var2_ref_byte__ = fieldTemp$22[fieldTemp$23];
                  qh.field_a[id.field_a] = null;
                  return var2_ref_byte__;
                }
              } else {
                if (th.field_a != null) {
                  var2 = 0;
                  if (mj.field_a.length > var2) {
                    if (param0 == mj.field_a[var2]) {
                      if (0 < pe.field_C[var2]) {
                        pe.field_C[var2] = pe.field_C[var2] - 1;
                        var3 = th.field_a[var2][pe.field_C[var2] - 1];
                        th.field_a[var2][pe.field_C[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        return new byte[param0];
                      }
                    } else {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      return new byte[param0];
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  return new byte[param0];
                }
              }
            } else {
              int fieldTemp$24 = dj.field_d - 1;
              dj.field_d = dj.field_d - 1;
              var2_ref_byte__ = wl.field_g[fieldTemp$24];
              wl.field_g[dj.field_d] = null;
              return var2_ref_byte__;
            }
          } else {
            L2: {
              if (param0 != 30000) {
                break L2;
              } else {
                if (id.field_a <= 0) {
                  break L2;
                } else {
                  byte[][] fieldTemp$25 = qh.field_a;
                  int fieldTemp$26 = id.field_a - 1;
                  id.field_a = id.field_a - 1;
                  var2_ref_byte__ = fieldTemp$25[fieldTemp$26];
                  qh.field_a[id.field_a] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (th.field_a != null) {
              var2 = 0;
              if (mj.field_a.length > var2) {
                if (param0 == mj.field_a[var2]) {
                  if (0 < pe.field_C[var2]) {
                    pe.field_C[var2] = pe.field_C[var2] - 1;
                    var3 = th.field_a[var2][pe.field_C[var2] - 1];
                    th.field_a[var2][pe.field_C[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param0];
                  }
                } else {
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  return new byte[param0];
                }
              } else {
                return new byte[param0];
              }
            } else {
              return new byte[param0];
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        var4 = wizardrun.field_H;
        try {
          var3_int = 1;
          L0: while (true) {
            if (param2 <= 1) {
              if (param2 == 1) {
                stackOut_9_0 = param0 * var3_int;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                return var3_int;
              }
            } else {
              L1: {
                if ((param2 & 1) != 0) {
                  var3_int = var3_int * param0;
                  break L1;
                } else {
                  break L1;
                }
              }
              param0 = param0 * param0;
              param2 = param2 >> 1;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "ej.A(" + param0 + 44 + -1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ga();
        field_e = "Loading music";
    }
}
