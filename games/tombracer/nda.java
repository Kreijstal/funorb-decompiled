/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nda {
    static String field_d;
    private cn field_b;
    private cn field_c;
    private ji field_e;
    private ji field_a;

    final u a(String param0, byte param1, String param2) {
        if (param1 != 52) {
            return null;
        }
        return this.a(false, param2, param0, (int[]) null);
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_d = null;
    }

    private final u a(String param0, byte param1, int[] param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 == -59) {
          var5 = ((nda) this).field_c.b(param3, -7768);
          if (var5 <= -1) {
            var6 = ((nda) this).field_c.a(true, param0, var5);
            if (-1 > var6) {
              return null;
            } else {
              return this.a(var6, param2, (byte) 101, var5);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final u a(boolean param0, String param1, String param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((nda) this).field_b.b(param2, -7768);
        if ((var5 ^ -1) <= -1) {
          if (!param0) {
            var6 = ((nda) this).field_b.a(true, param1, var5);
            if (0 > var6) {
              return null;
            } else {
              return this.a(59, var5, var6, param3);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final u a(int param0, int[] param1, byte param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        u var8 = null;
        u var8_ref = null;
        fg var9 = null;
        fg var9_ref = null;
        var5 = param0 ^ (param3 >>> -202621108 | 65528 & param3 << 1641965124);
        var5 = var5 | param3 << 1744040880;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (u) (Object) ((nda) this).field_a.a((byte) -127, var6);
        if (var8 == null) {
          if (param1 != null) {
            if (param1[0] > 0) {
              L0: {
                var9 = (fg) (Object) ((nda) this).field_e.a((byte) -114, var6);
                if (var9 == null) {
                  var9_ref = fg.a(((nda) this).field_c, param3, param0);
                  if (var9_ref != null) {
                    ((nda) this).field_e.a(var6, 124, (vg) (Object) var9_ref);
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  break L0;
                }
              }
              if (param2 > 56) {
                var8_ref = var9_ref.a(param1);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.p(113);
                  ((nda) this).field_a.a(var6, 121, (vg) (Object) var8_ref);
                  return var8_ref;
                }
              } else {
                ((nda) this).field_e = null;
                var8_ref = var9_ref.a(param1);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.p(113);
                  ((nda) this).field_a.a(var6, 121, (vg) (Object) var8_ref);
                  return var8_ref;
                }
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var9 = (fg) (Object) ((nda) this).field_e.a((byte) -114, var6);
              if (var9 == null) {
                var9_ref = fg.a(((nda) this).field_c, param3, param0);
                if (var9_ref != null) {
                  ((nda) this).field_e.a(var6, 124, (vg) (Object) var9_ref);
                  break L1;
                } else {
                  return null;
                }
              } else {
                break L1;
              }
            }
            if (param2 > 56) {
              var8_ref = var9_ref.a(param1);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.p(113);
                ((nda) this).field_a.a(var6, 121, (vg) (Object) var8_ref);
                return var8_ref;
              }
            } else {
              ((nda) this).field_e = null;
              var8_ref = var9_ref.a(param1);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.p(113);
                ((nda) this).field_a.a(var6, 121, (vg) (Object) var8_ref);
                return var8_ref;
              }
            }
          }
        } else {
          return var8;
        }
    }

    final u a(byte param0, int[] param1, int param2) {
        int var4 = 0;
        var4 = -119 % ((65 - param0) / 35);
        if (((nda) this).field_c.c(4) != -2) {
          if (-2 == ((nda) this).field_c.a((byte) 66, param2)) {
            return this.a(0, param1, (byte) 83, param2);
          } else {
            throw new RuntimeException();
          }
        } else {
          return this.a(param2, param1, (byte) 101, 0);
        }
    }

    final u a(String param0, int param1, String param2) {
        if (param1 < 11) {
          field_d = null;
          return this.a(param0, (byte) -59, (int[]) null, param2);
        } else {
          return this.a(param0, (byte) -59, (int[]) null, param2);
        }
    }

    final u a(int param0, int[] param1, int param2) {
        if (((nda) this).field_b.c(param2 + 4) != 1) {
          if (((nda) this).field_b.a((byte) -96, param0) == 1) {
            return this.a(param2 + 115, param0, 0, param1);
          } else {
            if (param2 != 0) {
              return null;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return this.a(param2 ^ 52, 0, param0, param1);
        }
    }

    private final u a(int param0, int param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        u var8 = null;
        u var8_ref = null;
        vma var9 = null;
        u var10 = null;
        vma var11 = null;
        u var12 = null;
        vma var20 = null;
        u var21 = null;
        vma var23 = null;
        u var24 = null;
        var5 = (param1 >>> 1549777548 | (-805302273 & param1) << -320438268) ^ param2;
        var5 = var5 | param1 << 2079305392;
        if (param0 >= 45) {
          var6 = (long)var5;
          var8 = (u) (Object) ((nda) this).field_a.a((byte) -110, var6);
          if (var8 == null) {
            if (param3 != null) {
              if (-1 > (param3[0] ^ -1)) {
                var23 = vma.a(((nda) this).field_b, param1, param2);
                if (var23 == null) {
                  return null;
                } else {
                  L0: {
                    var24 = var23.a();
                    var8_ref = var24;
                    ((nda) this).field_a.a(var6, 103, (vg) (Object) var8_ref);
                    if (param3 != null) {
                      param3[0] = param3[0] - var24.field_i.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              var23 = vma.a(((nda) this).field_b, param1, param2);
              if (var23 == null) {
                return null;
              } else {
                L1: {
                  var24 = var23.a();
                  var8_ref = var24;
                  ((nda) this).field_a.a(var6, 103, (vg) (Object) var8_ref);
                  if (param3 != null) {
                    param3[0] = param3[0] - var24.field_i.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8_ref;
              }
            }
          } else {
            return var8;
          }
        } else {
          ((nda) this).field_e = null;
          var6 = (long)var5;
          var8 = (u) (Object) ((nda) this).field_a.a((byte) -110, var6);
          if (var8 == null) {
            if (param3 != null) {
              if (-1 > (param3[0] ^ -1)) {
                var20 = vma.a(((nda) this).field_b, param1, param2);
                var9 = var20;
                if (var20 == null) {
                  return null;
                } else {
                  L2: {
                    var21 = var20.a();
                    var8_ref = var21;
                    ((nda) this).field_a.a(var6, 103, (vg) (Object) var8_ref);
                    if (param3 != null) {
                      param3[0] = param3[0] - var21.field_i.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              var11 = vma.a(((nda) this).field_b, param1, param2);
              var9 = var11;
              if (var11 == null) {
                return null;
              } else {
                L3: {
                  var12 = var11.a();
                  var10 = var12;
                  var8_ref = var12;
                  ((nda) this).field_a.a(var6, 103, (vg) (Object) var8_ref);
                  if (param3 != null) {
                    param3[0] = param3[0] - var12.field_i.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8_ref;
              }
            }
          } else {
            return var8;
          }
        }
    }

    nda(cn param0, cn param1) {
        ((nda) this).field_e = new ji(256);
        ((nda) this).field_a = new ji(256);
        ((nda) this).field_c = param1;
        ((nda) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invalid password.";
    }
}
