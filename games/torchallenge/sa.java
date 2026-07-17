/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static volatile boolean field_c;
    static String field_b;
    static int field_a;

    final static void a(int param0) {
        if (param0 != 0) {
            sa.a(41);
        }
    }

    final static String a(boolean param0) {
        if (li.field_K < 2) {
          return ta.field_Ab;
        } else {
          if (null != rj.field_f) {
            if (!rj.field_f.b(-7957)) {
              return ol.field_f;
            } else {
              return sd.field_g;
            }
          } else {
            if (!sl.field_a.b(-7957)) {
              return uk.field_K;
            } else {
              if (!sl.field_a.b(5, "commonui")) {
                return ra.field_m + " - " + sl.field_a.a(112, "commonui") + "%";
              } else {
                if (!gf.field_p.b(-7957)) {
                  return wf.field_a;
                } else {
                  if (!gf.field_p.b(5, "commonui")) {
                    return ij.field_x + " - " + gf.field_p.a(125, "commonui") + "%";
                  } else {
                    if (jl.field_b.b(-7957)) {
                      if (!jl.field_b.b((byte) 79)) {
                        return bk.field_l + " - " + jl.field_b.c(126) + "%";
                      } else {
                        return lh.field_y;
                      }
                    } else {
                      return wa.field_qb;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a() {
        field_b = null;
    }

    final static void a(byte param0, int param1, eh param2) {
        pa var5 = null;
        int var4 = 0;
        try {
            var5 = dk.field_s;
            var5.d(25, 6);
            var5.field_q = var5.field_q + 1;
            var4 = var5.field_q;
            if (param0 < 11) {
                field_c = false;
            }
            var5.d(1, (byte) 122);
            if (null == param2.field_i) {
                var5.d(0, (byte) 122);
            } else {
                var5.d(param2.field_i.length, (byte) 122);
                var5.a(param2.field_i.length, 0, param2.field_i, -16384);
            }
            int discarded$0 = var5.b(var4, 14430);
            var5.field_q = var5.field_q - 4;
            param2.field_j = var5.i(67);
            var5.a(var5.field_q - var4, -112);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "sa.A(" + param0 + 44 + 6 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (param1 < 0) {
            param1 = param1 >>> 16;
            var2 += 16;
            break L0;
          } else {
            if (param1 < 65536) {
              break L0;
            } else {
              L1: {
                param1 = param1 >>> 16;
                var2 += 16;
                if (param1 >= 256) {
                  var2 += 8;
                  param1 = param1 >>> 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 >= 16) {
                  param1 = param1 >>> 4;
                  var2 += 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (param0 > 59) {
                L3: {
                  if (4 <= param1) {
                    var2 += 2;
                    param1 = param1 >>> 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 >= 1) {
                    var2++;
                    param1 = param1 >>> 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return var2 + param1;
              } else {
                L5: {
                  String discarded$2 = sa.a(true);
                  if (4 <= param1) {
                    var2 += 2;
                    param1 = param1 >>> 2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param1 >= 1) {
                    var2++;
                    param1 = param1 >>> 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return var2 + param1;
              }
            }
          }
        }
        L7: {
          if (param1 >= 256) {
            var2 += 8;
            param1 = param1 >>> 8;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (param1 >= 16) {
            param1 = param1 >>> 4;
            var2 += 4;
            break L8;
          } else {
            break L8;
          }
        }
        if (param0 <= 59) {
          L9: {
            String discarded$3 = sa.a(true);
            if (4 <= param1) {
              var2 += 2;
              param1 = param1 >>> 2;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param1 >= 1) {
              var2++;
              param1 = param1 >>> 1;
              break L10;
            } else {
              break L10;
            }
          }
          return var2 + param1;
        } else {
          L11: {
            if (4 <= param1) {
              var2 += 2;
              param1 = param1 >>> 2;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (param1 >= 1) {
              var2++;
              param1 = param1 >>> 1;
              break L12;
            } else {
              break L12;
            }
          }
          return var2 + param1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
    }
}
