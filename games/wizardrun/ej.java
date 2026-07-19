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
        int fieldTemp$25 = 0;
        byte[][] fieldTemp$26 = null;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        byte[][] fieldTemp$30 = null;
        int fieldTemp$31 = 0;
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
                  fieldTemp$25 = dj.field_d - 1;
                  dj.field_d = dj.field_d - 1;
                  var2_ref_byte__ = wl.field_g[fieldTemp$25];
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
                  fieldTemp$26 = qh.field_a;
                  fieldTemp$27 = id.field_a - 1;
                  id.field_a = id.field_a - 1;
                  var2_ref_byte__ = fieldTemp$26[fieldTemp$27];
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
                    if (param0 == mj.field_a[var2]) {
                      if (0 < pe.field_C[var2]) {
                        pe.field_C[var2] = pe.field_C[var2] - 1;
                        var3 = th.field_a[var2][pe.field_C[var2] - 1];
                        th.field_a[var2][pe.field_C[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L2;
                      }
                    } else {
                      var2++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new byte[param0];
              }
            } else {
              field_e = (String) null;
              if (th.field_a != null) {
                var2 = 0;
                L3: while (true) {
                  if (mj.field_a.length <= var2) {
                    return new byte[param0];
                  } else {
                    if (param0 == mj.field_a[var2]) {
                      if (0 < pe.field_C[var2]) {
                        pe.field_C[var2] = pe.field_C[var2] - 1;
                        var3 = th.field_a[var2][pe.field_C[var2] - 1];
                        th.field_a[var2][pe.field_C[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L3;
                      }
                    } else {
                      var2++;
                      continue L3;
                    }
                  }
                }
              } else {
                return new byte[param0];
              }
            }
          } else {
            fieldTemp$28 = p.field_U - 1;
            p.field_U = p.field_U - 1;
            var2_ref_byte__ = ec.field_f[fieldTemp$28];
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
                fieldTemp$29 = dj.field_d - 1;
                dj.field_d = dj.field_d - 1;
                var2_ref_byte__ = wl.field_g[fieldTemp$29];
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
                fieldTemp$30 = qh.field_a;
                fieldTemp$31 = id.field_a - 1;
                id.field_a = id.field_a - 1;
                var2_ref_byte__ = fieldTemp$30[fieldTemp$31];
                qh.field_a[id.field_a] = null;
                return var2_ref_byte__;
              }
            }
          }
          if (param1 == 1) {
            if (th.field_a != null) {
              var2 = 0;
              L6: while (true) {
                if (mj.field_a.length > var2) {
                  if (param0 == mj.field_a[var2]) {
                    if (0 < pe.field_C[var2]) {
                      pe.field_C[var2] = pe.field_C[var2] - 1;
                      var3 = th.field_a[var2][pe.field_C[var2] - 1];
                      th.field_a[var2][pe.field_C[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L6;
                    }
                  } else {
                    var2++;
                    continue L6;
                  }
                } else {
                  return new byte[param0];
                }
              }
            } else {
              return new byte[param0];
            }
          } else {
            field_e = (String) null;
            if (th.field_a != null) {
              var2 = 0;
              L7: while (true) {
                if (mj.field_a.length > var2) {
                  if (param0 == mj.field_a[var2]) {
                    if (0 < pe.field_C[var2]) {
                      pe.field_C[var2] = pe.field_C[var2] - 1;
                      var3 = th.field_a[var2][pe.field_C[var2] - 1];
                      th.field_a[var2][pe.field_C[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L7;
                    }
                  } else {
                    var2++;
                    continue L7;
                  }
                } else {
                  return new byte[param0];
                }
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
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param2 <= 1) {
                if ((param2 ^ -1) == -2) {
                  stackOut_9_0 = param0 * var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (param1 == -1) {
                    stackOut_14_0 = var3_int;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackOut_12_0 = -47;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                L2: {
                  if (-1 != (param2 & 1 ^ -1)) {
                    var3_int = var3_int * param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param0 = param0 * param0;
                param2 = param2 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var3), "ej.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    static {
        field_b = new ga();
        field_e = "Loading music";
    }
}
