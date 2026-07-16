/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static ff field_f;
    private qd field_j;
    private da field_a;
    private da field_c;
    static da field_e;
    static boolean field_g;
    private qd field_i;
    static String field_h;
    static int field_d;
    static int field_b;

    private final sh a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        sh var8 = null;
        ra var9 = null;
        ra var11 = null;
        sh var12 = null;
        ra var16 = null;
        sh var17 = null;
        ra var18 = null;
        sh var19 = null;
        ra var20 = null;
        sh var21 = null;
        var5 = param3 ^ (param2 >>> -225487636 | 65533 & param2 << 1936877700);
        var5 = var5 | param2 << 1264444880;
        var6 = (long)var5;
        var8 = (sh) (Object) ((me) this).field_i.a(true, var6);
        if (var8 == null) {
          if (param0 != null) {
            if (-1 > (param0[0] ^ -1)) {
              if (param1 == 1264444880) {
                var20 = ra.a(((me) this).field_a, param2, param3);
                if (var20 != null) {
                  var21 = var20.b();
                  var8 = var21;
                  ((me) this).field_i.a((byte) 76, (gg) (Object) var8, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var21.field_i.length;
                    return var8;
                  } else {
                    return var8;
                  }
                } else {
                  return null;
                }
              } else {
                ((me) this).field_c = null;
                var18 = ra.a(((me) this).field_a, param2, param3);
                if (var18 != null) {
                  var19 = var18.b();
                  var8 = var19;
                  ((me) this).field_i.a((byte) 76, (gg) (Object) var8, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var19.field_i.length;
                    return var8;
                  } else {
                    return var8;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            if (param1 == 1264444880) {
              var16 = ra.a(((me) this).field_a, param2, param3);
              if (var16 != null) {
                var17 = var16.b();
                var8 = var17;
                ((me) this).field_i.a((byte) 76, (gg) (Object) var8, var6);
                if (param0 != null) {
                  param0[0] = param0[0] - var17.field_i.length;
                  return var8;
                } else {
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              ((me) this).field_c = null;
              var11 = ra.a(((me) this).field_a, param2, param3);
              var9 = var11;
              if (var11 != null) {
                var12 = var11.b();
                var8 = var12;
                ((me) this).field_i.a((byte) 76, (gg) (Object) var8, var6);
                if (param0 != null) {
                  param0[0] = param0[0] - var12.field_i.length;
                  return var8;
                } else {
                  return var8;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return var8;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != 56) {
            return;
        }
        field_e = null;
        field_f = null;
    }

    final sh a(int[] param0, int param1, int param2) {
        if ((((me) this).field_c.a((byte) 89) ^ -1) == param1) {
            return this.a(0, param2, param0, (byte) -77);
        }
        if (!((((me) this).field_c.b(126, param2) ^ -1) != -2)) {
            return this.a(param2, 0, param0, (byte) -107);
        }
        throw new RuntimeException();
    }

    private final sh a(int param0, int param1, int[] param2, byte param3) {
        int var5 = 0;
        long var6 = 0L;
        sh var8 = null;
        sl var9 = null;
        var5 = param1 ^ (65524 & param0 << 1829117700 | param0 >>> 1496353484);
        var5 = var5 | param0 << -1126249680;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (sh) (Object) ((me) this).field_i.a(true, var6);
        if (var8 == null) {
          if (param2 != null) {
            if ((param2[0] ^ -1) < -1) {
              L0: {
                var9 = (sl) (Object) ((me) this).field_j.a(true, var6);
                if (var9 != null) {
                  break L0;
                } else {
                  var9 = sl.a(((me) this).field_c, param0, param1);
                  if (var9 != null) {
                    ((me) this).field_j.a((byte) 113, (gg) (Object) var9, var6);
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param2);
              if (var8 != null) {
                var9.c(10);
                if (param3 > -52) {
                  return null;
                } else {
                  ((me) this).field_i.a((byte) 40, (gg) (Object) var8, var6);
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var9 = (sl) (Object) ((me) this).field_j.a(true, var6);
              if (var9 != null) {
                break L1;
              } else {
                var9 = sl.a(((me) this).field_c, param0, param1);
                if (var9 != null) {
                  ((me) this).field_j.a((byte) 113, (gg) (Object) var9, var6);
                  break L1;
                } else {
                  return null;
                }
              }
            }
            var8 = var9.a(param2);
            if (var8 != null) {
              var9.c(10);
              if (param3 > -52) {
                return null;
              } else {
                ((me) this).field_i.a((byte) 40, (gg) (Object) var8, var6);
                return var8;
              }
            } else {
              return null;
            }
          }
        } else {
          return var8;
        }
    }

    final static void a(boolean param0) {
        L0: {
          if (-10001 >= (lk.field_e ^ -1)) {
            vk.a(255, (byte) 89, 0);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          if (-20001 < (lk.field_e ^ -1)) {
            L1: {
              if (-30001 >= (lk.field_e ^ -1)) {
                vk.a(253, (byte) 89, 2);
                break L1;
              } else {
                break L1;
              }
            }
            if ((lk.field_e ^ -1) > -40001) {
              L2: {
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                vk.a(252, (byte) 89, 3);
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            L4: {
              vk.a(254, (byte) 89, 1);
              if (-30001 >= (lk.field_e ^ -1)) {
                vk.a(253, (byte) 89, 2);
                break L4;
              } else {
                break L4;
              }
            }
            if ((lk.field_e ^ -1) > -40001) {
              L5: {
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              L6: {
                vk.a(252, (byte) 89, 3);
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          }
        } else {
          field_g = true;
          if (-20001 >= (lk.field_e ^ -1)) {
            L7: {
              vk.a(254, (byte) 89, 1);
              if (-30001 >= (lk.field_e ^ -1)) {
                vk.a(253, (byte) 89, 2);
                break L7;
              } else {
                break L7;
              }
            }
            if ((lk.field_e ^ -1) <= -40001) {
              L8: {
                vk.a(252, (byte) 89, 3);
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            } else {
              L9: {
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          } else {
            L10: {
              if (-30001 >= (lk.field_e ^ -1)) {
                vk.a(253, (byte) 89, 2);
                break L10;
              } else {
                break L10;
              }
            }
            if ((lk.field_e ^ -1) > -40001) {
              L11: {
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            } else {
              L12: {
                vk.a(252, (byte) 89, 3);
                if (50000 <= lk.field_e) {
                  vk.a(251, (byte) 89, 4);
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            }
          }
        }
    }

    final sh a(int param0, int param1, int[] param2) {
        if (param0 == 0) {
          if (1 == ((me) this).field_a.a((byte) 105)) {
            return this.a(param2, 1264444880, 0, param1);
          } else {
            if ((((me) this).field_a.b(12, param1) ^ -1) == -2) {
              return this.a(param2, 1264444880, param1, 0);
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          field_b = 6;
          if (1 == ((me) this).field_a.a((byte) 105)) {
            return this.a(param2, 1264444880, 0, param1);
          } else {
            if ((((me) this).field_a.b(12, param1) ^ -1) == -2) {
              return this.a(param2, 1264444880, param1, 0);
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    me(da param0, da param1) {
        ((me) this).field_j = new qd(256);
        ((me) this).field_i = new qd(256);
        ((me) this).field_c = param1;
        ((me) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ff(9, 0, 4, 1);
    }
}
