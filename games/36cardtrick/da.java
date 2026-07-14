/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    private qk field_f;
    static boolean field_b;
    private vb field_a;
    static String[] field_c;
    private qk field_e;
    private vb field_d;

    private final ib a(byte param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        ib var8 = null;
        ib var8_ref = null;
        uj var9 = null;
        uj var11 = null;
        ib var12 = null;
        uj var16 = null;
        ib var17 = null;
        uj var18 = null;
        ib var19 = null;
        uj var20 = null;
        ib var21 = null;
        var5 = param2 ^ (param3 >>> -1703274388 | 65520 & param3 << -199808284);
        var5 = var5 | param3 << -211883632;
        var6 = (long)var5;
        var8 = (ib) ((da) this).field_d.a(false, var6);
        if (var8 != null) {
          return var8;
        } else {
          if (param1 != null) {
            if (param1[0] > 0) {
              if (param0 >= 100) {
                var20 = uj.a(((da) this).field_f, param3, param2);
                if (var20 != null) {
                  var21 = var20.a();
                  var8_ref = var21;
                  ((da) this).field_d.a(var6, (byte) 44, (qb) (Object) var8_ref);
                  if (param1 != null) {
                    param1[0] = param1[0] - ((ib) var21).field_h.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                da.a(60);
                var18 = uj.a(((da) this).field_f, param3, param2);
                if (var18 != null) {
                  var19 = var18.a();
                  var8_ref = var19;
                  ((da) this).field_d.a(var6, (byte) 44, (qb) (Object) var8_ref);
                  if (param1 != null) {
                    param1[0] = param1[0] - ((ib) var19).field_h.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            if (param0 >= 100) {
              var16 = uj.a(((da) this).field_f, param3, param2);
              if (var16 != null) {
                var17 = var16.a();
                var8_ref = var17;
                ((da) this).field_d.a(var6, (byte) 44, (qb) (Object) var8_ref);
                if (param1 != null) {
                  param1[0] = param1[0] - ((ib) var17).field_h.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              da.a(60);
              var11 = uj.a(((da) this).field_f, param3, param2);
              var9 = var11;
              if (var11 != null) {
                var12 = var11.a();
                var8_ref = var12;
                ((da) this).field_d.a(var6, (byte) 44, (qb) (Object) var8_ref);
                if (param1 != null) {
                  param1[0] = param1[0] - ((ib) var12).field_h.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final ib a(int param0, int param1, int param2) {
        if (param1 != -1703274388) {
          ib discarded$2 = ((da) this).b(-108, 0, 54);
          return this.a((byte) 113, (int[]) null, param0, param2);
        } else {
          return this.a((byte) 113, (int[]) null, param0, param2);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -1703274388) {
            da.a(-86);
        }
    }

    final ib b(int param0, int param1, int param2) {
        int[] var5 = null;
        if (param2 != -14888) {
          var5 = (int[]) null;
          ib discarded$2 = this.a((byte) 18, (int[]) null, -97, 96);
          return this.a(0, (int[]) null, param1, param0);
        } else {
          return this.a(0, (int[]) null, param1, param0);
        }
    }

    private final ib a(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        ib var8 = null;
        ib var8_ref = null;
        ig var9 = null;
        ig var9_ref = null;
        var5 = param2 ^ (param3 >>> 1670603980 | (param3 & -1610608641) << -1901073084);
        var5 = var5 | param3 << -1113209232;
        var6 = 4294967296L ^ (long)var5;
        var8 = (ib) ((da) this).field_d.a(false, var6);
        if (var8 != null) {
          return var8;
        } else {
          if (param1 != null) {
            if ((param1[0] ^ -1) < -1) {
              var9 = (ig) ((da) this).field_a.a(false, var6);
              if (param0 == 0) {
                L0: {
                  if (var9_ref != null) {
                    break L0;
                  } else {
                    var9_ref = ig.a(((da) this).field_e, param3, param2);
                    if (var9_ref != null) {
                      ((da) this).field_a.a(var6, (byte) 124, (qb) (Object) var9_ref);
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
                var8_ref = var9_ref.a(param1);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.c(104);
                  ((da) this).field_d.a(var6, (byte) 118, (qb) (Object) var8_ref);
                  return var8_ref;
                }
              } else {
                L1: {
                  field_b = true;
                  if (var9 != null) {
                    break L1;
                  } else {
                    var9_ref = ig.a(((da) this).field_e, param3, param2);
                    if (var9_ref != null) {
                      ((da) this).field_a.a(var6, (byte) 124, (qb) (Object) var9_ref);
                      break L1;
                    } else {
                      return null;
                    }
                  }
                }
                var8_ref = var9_ref.a(param1);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.c(104);
                  ((da) this).field_d.a(var6, (byte) 118, (qb) (Object) var8_ref);
                  return var8_ref;
                }
              }
            } else {
              return null;
            }
          } else {
            var9 = (ig) ((da) this).field_a.a(false, var6);
            if (param0 == 0) {
              L2: {
                if (var9_ref != null) {
                  break L2;
                } else {
                  var9_ref = ig.a(((da) this).field_e, param3, param2);
                  if (var9_ref != null) {
                    ((da) this).field_a.a(var6, (byte) 124, (qb) (Object) var9_ref);
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param1);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c(104);
                ((da) this).field_d.a(var6, (byte) 118, (qb) (Object) var8_ref);
                return var8_ref;
              }
            } else {
              L3: {
                field_b = true;
                if (var9 != null) {
                  break L3;
                } else {
                  var9_ref = ig.a(((da) this).field_e, param3, param2);
                  if (var9_ref != null) {
                    ((da) this).field_a.a(var6, (byte) 124, (qb) (Object) var9_ref);
                    break L3;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param1);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c(104);
                ((da) this).field_d.a(var6, (byte) 118, (qb) (Object) var8_ref);
                return var8_ref;
              }
            }
          }
        }
    }

    da(qk param0, qk param1) {
        ((da) this).field_a = new vb(256);
        ((da) this).field_d = new vb(256);
        ((da) this).field_e = param1;
        ((da) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
    }
}
