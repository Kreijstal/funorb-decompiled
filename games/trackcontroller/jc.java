/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    private kk field_b;
    static ba field_a;
    private id field_d;
    private kk field_e;
    static int field_c;
    private id field_f;

    final ik a(int[] param0, boolean param1, int param2) {
        if (-2 == (((jc) this).field_e.b(0) ^ -1)) {
          return this.b(0, 13242, param2, param0);
        } else {
          if (!param1) {
            if ((((jc) this).field_e.a(param2, (byte) -91) ^ -1) == -2) {
              return this.b(param2, 13242, 0, param0);
            } else {
              throw new RuntimeException();
            }
          } else {
            ((jc) this).field_d = null;
            if ((((jc) this).field_e.a(param2, (byte) -91) ^ -1) == -2) {
              return this.b(param2, 13242, 0, param0);
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    private final ik a(int param0, int param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        ik var8 = null;
        ml var9 = null;
        var5 = ((1879052287 & param1) << -103334972 | param1 >>> -2059411540) ^ param2;
        var5 = var5 | param1 << -849324368;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (ik) (Object) ((jc) this).field_f.a(param0 ^ -27322, var6);
        if (var8 != null) {
          return var8;
        } else {
          if (param3 != null) {
            if (0 < param3[0]) {
              L0: {
                var9 = (ml) (Object) ((jc) this).field_d.a(8434, var6);
                if (var9 != null) {
                  break L0;
                } else {
                  var9 = ml.a(((jc) this).field_b, param1, param2);
                  if (var9 != null) {
                    ((jc) this).field_d.a(false, var6, (fc) (Object) var9);
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param3);
              if (param0 == -19020) {
                if (var8 == null) {
                  return null;
                } else {
                  var9.a(-35);
                  ((jc) this).field_f.a(false, var6, (fc) (Object) var8);
                  return var8;
                }
              } else {
                ((jc) this).field_e = null;
                if (var8 == null) {
                  return null;
                } else {
                  var9.a(-35);
                  ((jc) this).field_f.a(false, var6, (fc) (Object) var8);
                  return var8;
                }
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var9 = (ml) (Object) ((jc) this).field_d.a(8434, var6);
              if (var9 != null) {
                break L1;
              } else {
                var9 = ml.a(((jc) this).field_b, param1, param2);
                if (var9 != null) {
                  ((jc) this).field_d.a(false, var6, (fc) (Object) var9);
                  break L1;
                } else {
                  return null;
                }
              }
            }
            var8 = var9.a(param3);
            if (param0 == -19020) {
              if (var8 == null) {
                return null;
              } else {
                var9.a(-35);
                ((jc) this).field_f.a(false, var6, (fc) (Object) var8);
                return var8;
              }
            } else {
              ((jc) this).field_e = null;
              if (var8 == null) {
                return null;
              } else {
                var9.a(-35);
                ((jc) this).field_f.a(false, var6, (fc) (Object) var8);
                return var8;
              }
            }
          }
        }
    }

    private final ik b(int param0, int param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        ik var8 = null;
        cc var11 = null;
        ik var12 = null;
        cc var13 = null;
        ik var14 = null;
        if (param1 == 13242) {
          var5 = (65533 & param0 << -2041583036 | param0 >>> -1254706804) ^ param2;
          var5 = var5 | param0 << -696603888;
          var6 = (long)var5;
          var8 = (ik) (Object) ((jc) this).field_f.a(param1 ^ 4936, var6);
          if (var8 == null) {
            if (param3 != null) {
              if ((param3[0] ^ -1) < -1) {
                var13 = cc.a(((jc) this).field_e, param0, param2);
                if (var13 == null) {
                  return null;
                } else {
                  L0: {
                    var14 = var13.b();
                    var8 = var14;
                    ((jc) this).field_f.a(false, var6, (fc) (Object) var8);
                    if (param3 != null) {
                      param3[0] = param3[0] - var14.field_j.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              var11 = cc.a(((jc) this).field_e, param0, param2);
              if (var11 == null) {
                return null;
              } else {
                L1: {
                  var12 = var11.b();
                  var8 = var12;
                  ((jc) this).field_f.a(false, var6, (fc) (Object) var8);
                  if (param3 != null) {
                    param3[0] = param3[0] - var12.field_j.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8;
              }
            }
          } else {
            return var8;
          }
        } else {
          return null;
        }
    }

    final ik a(int[] param0, int param1, int param2) {
        if (1 == ((jc) this).field_b.b(0)) {
            return this.a(param1 + 2059392520, 0, param2, param0);
        }
        if (param1 != -2059411540) {
            return null;
        }
        if (!(1 != ((jc) this).field_b.a(param2, (byte) -91))) {
            return this.a(param1 + 2059392520, param2, 0, param0);
        }
        throw new RuntimeException();
    }

    final static ic a(byte param0) {
        if (ok.field_D != null) {
          if (param0 < 71) {
            return null;
          } else {
            return ok.field_D;
          }
        } else {
          ok.field_D = new ic(fk.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, fk.field_a.field_G, -1, 2147483647, true);
          if (param0 < 71) {
            return null;
          } else {
            return ok.field_D;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 15 / ((-28 - param0) / 46);
    }

    final static String b(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_8_0 = null;
        String stackIn_18_0 = null;
        String stackOut_7_0 = null;
        String stackOut_17_0 = null;
        var5 = TrackController.field_F ? 1 : 0;
        if (param0 >= 66) {
          var6 = "(" + o.field_a + " " + u.field_o + " " + mc.field_L + ") " + uk.field_c;
          if (-1 > (hd.field_o ^ -1)) {
            var1 = var6 + ":";
            var2 = 0;
            L0: while (true) {
              if (var2 < hd.field_o) {
                L1: {
                  stackOut_7_0 = var1 + 32;
                  stackIn_18_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var7 = stackIn_8_0;
                        var3 = ne.field_a.field_j[var2] & 255;
                        var4 = var3 >> -580842620;
                        var3 = var3 & 15;
                        if (-11 < (var4 ^ -1)) {
                          break L3;
                        } else {
                          var4 += 55;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4 += 48;
                      break L2;
                    }
                    L4: {
                      L5: {
                        var8 = var7 + (char)var4;
                        if (10 <= var3) {
                          break L5;
                        } else {
                          var3 += 48;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 += 55;
                      break L4;
                    }
                    var1 = var8 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      stackOut_17_0 = (String) var1;
                      stackIn_18_0 = stackOut_17_0;
                      break L1;
                    }
                  }
                }
                return stackIn_18_0;
              } else {
                return var1;
              }
            }
          } else {
            return var6;
          }
        } else {
          return null;
        }
    }

    jc(kk param0, kk param1) {
        ((jc) this).field_d = new id(256);
        ((jc) this).field_f = new id(256);
        ((jc) this).field_e = param0;
        ((jc) this).field_b = param1;
    }

    static {
    }
}
