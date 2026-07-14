/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends oj {
    static String[] field_A;
    int field_D;
    int field_z;
    int field_E;
    static at field_y;
    private int field_C;
    int field_B;
    static String field_F;

    final String a(byte param0, boolean param1) {
        if (!(!param1)) {
            System.out.println("Parasite event debug");
            System.out.println("Unit at " + ((md) this).field_D + "," + ((md) this).field_B);
            System.out.println("Takes over " + (((md) this).field_D + ((md) this).field_E) + "," + (((md) this).field_B - -((md) this).field_z));
            System.out.println("New owner " + ((md) this).field_C);
        }
        String var3 = "EventParasite: pos: (" + ((md) this).field_D + "," + ((md) this).field_B + "), d: (" + ((md) this).field_E + "," + ((md) this).field_z + ")+, owner: " + ((md) this).field_C;
        int var4 = 21 / ((53 - param0) / 51);
        return var3;
    }

    public static void d(byte param0) {
        field_A = null;
        field_y = null;
        field_F = null;
        if (param0 != 46) {
            field_F = null;
        }
    }

    final static wk[] g(int param0) {
        wk[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = new wk[iw.field_n];
        var2 = 0;
        L0: while (true) {
          if (iw.field_n <= var2) {
            rj.d((byte) 106);
            if (param0 < 1) {
              field_A = null;
              return var1;
            } else {
              return var1;
            }
          } else {
            var3 = qm.field_K[var2] * c.field_e[var2];
            var4 = vj.field_j[var2];
            var5 = new int[var3];
            var6 = 0;
            L1: while (true) {
              if (var3 <= var6) {
                var1[var2] = new wk(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var5);
                var2++;
                continue L0;
              } else {
                var5[var6] = qv.field_j[rn.a(255, (int) var4[var6])];
                var6++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        if (param1 > -84) {
            return false;
        }
        return ((md) this).a((byte) -39, param2, param0, true);
    }

    md(int param0, int param1, int param2, int param3, int param4) {
        ((md) this).field_z = param3 + param1;
        ((md) this).field_C = param4;
        ((md) this).field_E = param0 + param2;
        ((md) this).field_B = param1;
        ((md) this).field_D = param0;
        ((md) this).field_m = 7;
    }

    final void a(ha param0, int param1) {
        jd var4 = null;
        Object var6 = null;
        jd var7 = null;
        jd var8 = null;
        jd var9 = null;
        var7 = param0.c(((md) this).field_B, true, ((md) this).field_D);
        var4 = param0.c(((md) this).field_z, true, ((md) this).field_E);
        if (var4 != null) {
          if (null == var4.field_p) {
            var9 = var4.b(((md) this).field_C, -1);
            if (var7 != null) {
              if (var7.field_p != null) {
                if (var9 == null) {
                  if (var7 != null) {
                    var7.d(param1 ^ 26704);
                    if (var7.field_p == null) {
                      param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                      if (param1 == -26661) {
                        fl.a(param0, -126);
                        return;
                      } else {
                        var6 = null;
                        boolean discarded$19 = ((md) this).a((at) null, (byte) 109, (ic) null);
                        fl.a(param0, -126);
                        return;
                      }
                    } else {
                      var7.field_p.d(-128);
                      param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                      if (param1 == -26661) {
                        fl.a(param0, -126);
                        return;
                      } else {
                        var6 = null;
                        boolean discarded$20 = ((md) this).a((at) null, (byte) 109, (ic) null);
                        fl.a(param0, -126);
                        return;
                      }
                    }
                  } else {
                    if (param1 == -26661) {
                      fl.a(param0, -126);
                      return;
                    } else {
                      var6 = null;
                      boolean discarded$21 = ((md) this).a((at) null, (byte) 109, (ic) null);
                      fl.a(param0, -126);
                      return;
                    }
                  }
                } else {
                  var7.field_p.field_r.a(80, var9);
                  if (var7 != null) {
                    var7.d(param1 ^ 26704);
                    if (var7.field_p == null) {
                      param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                      if (param1 == -26661) {
                        fl.a(param0, -126);
                        return;
                      } else {
                        var6 = null;
                        boolean discarded$22 = ((md) this).a((at) null, (byte) 109, (ic) null);
                        fl.a(param0, -126);
                        return;
                      }
                    } else {
                      var7.field_p.d(-128);
                      param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                      if (param1 == -26661) {
                        fl.a(param0, -126);
                        return;
                      } else {
                        var6 = null;
                        boolean discarded$23 = ((md) this).a((at) null, (byte) 109, (ic) null);
                        fl.a(param0, -126);
                        return;
                      }
                    }
                  } else {
                    if (param1 == -26661) {
                      fl.a(param0, -126);
                      return;
                    } else {
                      var6 = null;
                      boolean discarded$24 = ((md) this).a((at) null, (byte) 109, (ic) null);
                      fl.a(param0, -126);
                      return;
                    }
                  }
                }
              } else {
                if (var7 != null) {
                  var7.d(param1 ^ 26704);
                  if (var7.field_p == null) {
                    param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                    if (param1 == -26661) {
                      fl.a(param0, -126);
                      return;
                    } else {
                      var6 = null;
                      boolean discarded$25 = ((md) this).a((at) null, (byte) 109, (ic) null);
                      fl.a(param0, -126);
                      return;
                    }
                  } else {
                    var7.field_p.d(-128);
                    param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                    if (param1 == -26661) {
                      fl.a(param0, -126);
                      return;
                    } else {
                      var6 = null;
                      boolean discarded$26 = ((md) this).a((at) null, (byte) 109, (ic) null);
                      fl.a(param0, -126);
                      return;
                    }
                  }
                } else {
                  if (param1 == -26661) {
                    fl.a(param0, -126);
                    return;
                  } else {
                    var6 = null;
                    boolean discarded$27 = ((md) this).a((at) null, (byte) 109, (ic) null);
                    fl.a(param0, -126);
                    return;
                  }
                }
              }
            } else {
              if (var7 != null) {
                var7.d(param1 ^ 26704);
                if (var7.field_p == null) {
                  param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                  if (param1 == -26661) {
                    fl.a(param0, -126);
                    return;
                  } else {
                    var6 = null;
                    boolean discarded$28 = ((md) this).a((at) null, (byte) 109, (ic) null);
                    fl.a(param0, -126);
                    return;
                  }
                } else {
                  var7.field_p.d(-128);
                  param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                  if (param1 == -26661) {
                    fl.a(param0, -126);
                    return;
                  } else {
                    var6 = null;
                    boolean discarded$29 = ((md) this).a((at) null, (byte) 109, (ic) null);
                    fl.a(param0, -126);
                    return;
                  }
                }
              } else {
                if (param1 == -26661) {
                  fl.a(param0, -126);
                  return;
                } else {
                  var6 = null;
                  boolean discarded$30 = ((md) this).a((at) null, (byte) 109, (ic) null);
                  fl.a(param0, -126);
                  return;
                }
              }
            }
          } else {
            var4.field_p.d(-116);
            var8 = var4.b(((md) this).field_C, -1);
            if (var7 != null) {
              L0: {
                if (var7.field_p == null) {
                  break L0;
                } else {
                  if (var8 == null) {
                    break L0;
                  } else {
                    var7.field_p.field_r.a(80, var8);
                    break L0;
                  }
                }
              }
              if (var7 != null) {
                var7.d(param1 ^ 26704);
                if (var7.field_p == null) {
                  param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                  if (param1 == -26661) {
                    fl.a(param0, -126);
                    return;
                  } else {
                    var6 = null;
                    boolean discarded$31 = ((md) this).a((at) null, (byte) 109, (ic) null);
                    fl.a(param0, -126);
                    return;
                  }
                } else {
                  var7.field_p.d(-128);
                  param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                  if (param1 == -26661) {
                    fl.a(param0, -126);
                    return;
                  } else {
                    var6 = null;
                    boolean discarded$32 = ((md) this).a((at) null, (byte) 109, (ic) null);
                    fl.a(param0, -126);
                    return;
                  }
                }
              } else {
                if (param1 == -26661) {
                  fl.a(param0, -126);
                  return;
                } else {
                  var6 = null;
                  boolean discarded$33 = ((md) this).a((at) null, (byte) 109, (ic) null);
                  fl.a(param0, -126);
                  return;
                }
              }
            } else {
              L1: {
                if (var7 != null) {
                  var7.d(param1 ^ 26704);
                  if (var7.field_p == null) {
                    param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                    break L1;
                  } else {
                    var7.field_p.d(-128);
                    param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (param1 == -26661) {
                fl.a(param0, -126);
                return;
              } else {
                var6 = null;
                boolean discarded$34 = ((md) this).a((at) null, (byte) 109, (ic) null);
                fl.a(param0, -126);
                return;
              }
            }
          }
        } else {
          if (var7 != null) {
            var7.d(param1 ^ 26704);
            if (var7.field_p == null) {
              param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
              if (param1 == -26661) {
                fl.a(param0, -126);
                return;
              } else {
                var6 = null;
                boolean discarded$35 = ((md) this).a((at) null, (byte) 109, (ic) null);
                fl.a(param0, -126);
                return;
              }
            } else {
              var7.field_p.d(-128);
              param0.field_Eb[param0.field_v * ((md) this).field_B + ((md) this).field_D].field_c = null;
              if (param1 == -26661) {
                fl.a(param0, -126);
                return;
              } else {
                var6 = null;
                boolean discarded$36 = ((md) this).a((at) null, (byte) 109, (ic) null);
                fl.a(param0, -126);
                return;
              }
            }
          } else {
            if (param1 == -26661) {
              fl.a(param0, -126);
              return;
            } else {
              var6 = null;
              boolean discarded$37 = ((md) this).a((at) null, (byte) 109, (ic) null);
              fl.a(param0, -126);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new at();
        field_F = "This game option has not yet been unlocked for use.";
    }
}
