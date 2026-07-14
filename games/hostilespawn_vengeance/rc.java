/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static int field_d;
    private int[] field_f;
    static int field_e;
    static b field_c;
    static ub field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 != 8281) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    private rc() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        if (0 == param4) {
          return 0;
        } else {
          if (param3 == 17112) {
            param4 = param4 + param0;
            var7 = 0;
            var8 = param2;
            L0: while (true) {
              L1: {
                var9 = param1[var8];
                if ((var9 ^ -1) <= -1) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((rc) this).field_f[var7];
                  break L1;
                }
              }
              L2: {
                var10 = ((rc) this).field_f[var7];
                if (((rc) this).field_f[var7] >= 0) {
                  break L2;
                } else {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param4 > param0) {
                    var7 = 0;
                    break L2;
                  } else {
                    return 1 + var8 + -param2;
                  }
                }
              }
              L3: {
                if ((64 & var9) == 0) {
                  var7++;
                  break L3;
                } else {
                  var7 = ((rc) this).field_f[var7];
                  break L3;
                }
              }
              L4: {
                var10 = ((rc) this).field_f[var7];
                if (((rc) this).field_f[var7] >= 0) {
                  break L4;
                } else {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param4 > param0) {
                    var7 = 0;
                    break L4;
                  } else {
                    return 1 + var8 + -param2;
                  }
                }
              }
              L5: {
                if (-1 == (32 & var9 ^ -1)) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((rc) this).field_f[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((rc) this).field_f[var7];
                if (0 > ((rc) this).field_f[var7]) {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param0 < param4) {
                    var7 = 0;
                    break L6;
                  } else {
                    return 1 + var8 + -param2;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (-1 != (16 & var9 ^ -1)) {
                  var7 = ((rc) this).field_f[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((rc) this).field_f[var7];
                if (((rc) this).field_f[var7] < 0) {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param0 < param4) {
                    var7 = 0;
                    break L8;
                  } else {
                    return 1 + var8 + -param2;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if ((8 & var9) != 0) {
                  var7 = ((rc) this).field_f[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((rc) this).field_f[var7];
                if (((rc) this).field_f[var7] < 0) {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param0 < param4) {
                    var7 = 0;
                    break L10;
                  } else {
                    return 1 + var8 + -param2;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if ((4 & var9) != 0) {
                  var7 = ((rc) this).field_f[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((rc) this).field_f[var7];
                if (-1 >= (((rc) this).field_f[var7] ^ -1)) {
                  break L12;
                } else {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param0 < param4) {
                    var7 = 0;
                    break L12;
                  } else {
                    return 1 + var8 + -param2;
                  }
                }
              }
              L13: {
                if ((2 & var9) == 0) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((rc) this).field_f[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((rc) this).field_f[var7];
                if (((rc) this).field_f[var7] < 0) {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param0 < param4) {
                    var7 = 0;
                    break L14;
                  } else {
                    return 1 + var8 + -param2;
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if (0 != (1 & var9)) {
                  var7 = ((rc) this).field_f[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              var10 = ((rc) this).field_f[var7];
              if (0 <= ((rc) this).field_f[var7]) {
                var8++;
                continue L0;
              } else {
                param0++;
                param5[param0] = (byte)(var10 ^ -1);
                if (param4 > param0) {
                  var7 = 0;
                  var8++;
                  continue L0;
                } else {
                  return 1 + var8 + -param2;
                }
              }
            }
          } else {
            return -39;
          }
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        uj var3_ref_uj = null;
        int var3 = 0;
        m var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        en var9 = null;
        byte[] var38 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var9 = sc.field_g;
        var2 = var9.l(32270);
        if (var2 != 0) {
          if (var2 != 1) {
            ic.a((byte) -119, "A1: " + gf.a((byte) -122), (Throwable) null);
            le.c((byte) 117);
            if (param0 == 2) {
              return;
            } else {
              field_e = -123;
              return;
            }
          } else {
            var3 = var9.d(param0 ^ 8193);
            var4 = (m) (Object) wk.field_g.g(-90);
            L0: while (true) {
              if (var4 != null) {
                if (var3 == var4.field_o) {
                  if (var4 == null) {
                    le.c((byte) 60);
                    return;
                  } else {
                    var4.b(-80);
                    if (param0 == 2) {
                      return;
                    } else {
                      field_e = -123;
                      return;
                    }
                  }
                } else {
                  var4 = (m) (Object) wk.field_g.a(12684);
                  continue L0;
                }
              } else {
                if (var4 == null) {
                  le.c((byte) 60);
                  return;
                } else {
                  L1: {
                    var4.b(-80);
                    if (param0 == 2) {
                      break L1;
                    } else {
                      field_e = -123;
                      break L1;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          var3_ref_uj = (uj) (Object) ve.field_b.g(param0 ^ -65);
          if (var3_ref_uj == null) {
            le.c((byte) 51);
            return;
          } else {
            L2: {
              var4_int = var9.l(32270);
              if (-1 == (var4_int ^ -1)) {
                var5 = null;
                break L2;
              } else {
                var38 = new byte[var4_int];
                var9.a(var4_int, 0, var38, -18181);
                break L2;
              }
            }
            var9.field_i = var9.field_i + 4;
            if (!var9.c((byte) -4)) {
              le.c((byte) 119);
              return;
            } else {
              var3_ref_uj.field_j = true;
              var3_ref_uj.b(120);
              if (param0 == 2) {
                return;
              } else {
                field_e = -123;
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_b = 0;
        field_c = null;
    }
}
