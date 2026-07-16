/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static ga field_b;
    static java.applet.Applet field_a;
    static String field_e;
    static int field_d;
    static int field_c;

    public static void a(byte param0) {
        if (param0 != -43) {
          field_d = -126;
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if ((param0 ^ -1) == -101) {
          if (0 >= p.field_U) {
            L0: {
              if (param0 != 5000) {
                break L0;
              } else {
                if (dj.field_d <= 0) {
                  break L0;
                } else {
                  int fieldTemp$14 = dj.field_d - 1;
                  dj.field_d = dj.field_d - 1;
                  var2_ref_byte__ = wl.field_g[fieldTemp$14];
                  wl.field_g[dj.field_d] = null;
                  return var2_ref_byte__;
                }
              }
            }
            L1: {
              if ((param0 ^ -1) != -30001) {
                break L1;
              } else {
                if ((id.field_a ^ -1) >= -1) {
                  break L1;
                } else {
                  byte[][] fieldTemp$15 = qh.field_a;
                  int fieldTemp$16 = id.field_a - 1;
                  id.field_a = id.field_a - 1;
                  var2_ref_byte__ = fieldTemp$15[fieldTemp$16];
                  qh.field_a[id.field_a] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (param1 == 1) {
              if (th.field_a != null) {
                var2 = 0;
                L2: while (true) {
                  if (mj.field_a.length <= var2) {
                    return new byte[param0];
                  } else {
                    if (param0 != mj.field_a[var2]) {
                      var2++;
                      var2++;
                      continue L2;
                    } else {
                      if (0 < pe.field_C[var2]) {
                        pe.field_C[var2] = pe.field_C[var2] - 1;
                        var3 = th.field_a[var2][pe.field_C[var2] - 1];
                        th.field_a[var2][pe.field_C[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                return new byte[param0];
              }
            } else {
              field_e = null;
              if (th.field_a != null) {
                var2 = 0;
                L3: while (true) {
                  if (mj.field_a.length <= var2) {
                    return new byte[param0];
                  } else {
                    if (param0 != mj.field_a[var2]) {
                      var2++;
                      var2++;
                      continue L3;
                    } else {
                      if (0 < pe.field_C[var2]) {
                        pe.field_C[var2] = pe.field_C[var2] - 1;
                        var3 = th.field_a[var2][pe.field_C[var2] - 1];
                        th.field_a[var2][pe.field_C[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                return new byte[param0];
              }
            }
          } else {
            int fieldTemp$17 = p.field_U - 1;
            p.field_U = p.field_U - 1;
            var2_ref_byte__ = ec.field_f[fieldTemp$17];
            ec.field_f[p.field_U] = null;
            return var2_ref_byte__;
          }
        } else {
          L4: {
            if (param0 != 5000) {
              break L4;
            } else {
              if (dj.field_d <= 0) {
                break L4;
              } else {
                int fieldTemp$18 = dj.field_d - 1;
                dj.field_d = dj.field_d - 1;
                var2_ref_byte__ = wl.field_g[fieldTemp$18];
                wl.field_g[dj.field_d] = null;
                return var2_ref_byte__;
              }
            }
          }
          L5: {
            if ((param0 ^ -1) != -30001) {
              break L5;
            } else {
              if ((id.field_a ^ -1) >= -1) {
                break L5;
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
          if (param1 == 1) {
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
            field_e = null;
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
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        var3 = 1;
        L0: while (true) {
          if (param2 <= 1) {
            if ((param2 ^ -1) == -2) {
              return param0 * var3;
            } else {
              if (param1 != -1) {
                return -47;
              } else {
                return var3;
              }
            }
          } else {
            L1: {
              if (-1 != (param2 & 1 ^ -1)) {
                var3 = var3 * param0;
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ga();
        field_e = "Loading music";
    }
}
