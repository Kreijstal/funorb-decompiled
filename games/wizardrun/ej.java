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
        int fieldTemp$3 = 0;
        byte[][] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        byte[][] fieldTemp$12 = null;
        int fieldTemp$13 = 0;
        int dupTemp$14 = 0;
        byte[][] arrayValue$15 = null;
        int dupTemp$16 = 0;
        byte[][] arrayValue$17 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        if ((param0 ^ -1) == -101) {
          if (0 >= p.field_U) {
            L0: {
              if (param0 != 5000) {
                break L0;
              } else {
                if (dj.field_d <= 0) {
                  break L0;
                } else {
                  fieldTemp$3 = dj.field_d - 1;
                  dj.field_d = dj.field_d - 1;
                  var2_ref_byte__ = wl.field_g[fieldTemp$3];
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
                  fieldTemp$4 = qh.field_a;
                  fieldTemp$5 = id.field_a - 1;
                  id.field_a = id.field_a - 1;
                  var2_ref_byte__ = fieldTemp$4[fieldTemp$5];
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
                        dupTemp$6 = pe.field_C[var2] - 1;
                        arrayValue$7 = th.field_a[var2];
                        pe.field_C[var2] = dupTemp$6;
                        var3 = arrayValue$7[dupTemp$6];
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
                        dupTemp$8 = pe.field_C[var2] - 1;
                        arrayValue$9 = th.field_a[var2];
                        pe.field_C[var2] = dupTemp$8;
                        var3 = arrayValue$9[dupTemp$8];
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
            fieldTemp$10 = p.field_U - 1;
            p.field_U = p.field_U - 1;
            var2_ref_byte__ = ec.field_f[fieldTemp$10];
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
                fieldTemp$11 = dj.field_d - 1;
                dj.field_d = dj.field_d - 1;
                var2_ref_byte__ = wl.field_g[fieldTemp$11];
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
                fieldTemp$12 = qh.field_a;
                fieldTemp$13 = id.field_a - 1;
                id.field_a = id.field_a - 1;
                var2_ref_byte__ = fieldTemp$12[fieldTemp$13];
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
                      dupTemp$14 = pe.field_C[var2] - 1;
                      arrayValue$15 = th.field_a[var2];
                      pe.field_C[var2] = dupTemp$14;
                      var3 = arrayValue$15[dupTemp$14];
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
                      dupTemp$16 = pe.field_C[var2] - 1;
                      arrayValue$17 = th.field_a[var2];
                      pe.field_C[var2] = dupTemp$16;
                      var3 = arrayValue$17[dupTemp$16];
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
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param2 <= 1) {
                if ((param2 ^ -1) == -2) {
                  stackIn_11_0 = param0 * var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (param1 == -1) {
                    stackIn_16_0 = var3_int;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_14_0 = -47;
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
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    static {
        field_b = new ga();
        field_e = "Loading music";
    }
}
