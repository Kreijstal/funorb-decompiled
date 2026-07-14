/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static am field_h;
    private db field_d;
    private db field_e;
    static String field_f;
    private fc field_b;
    static wb field_i;
    static int field_c;
    static lg field_g;
    private fc field_a;

    private final ko a(int param0, int param1, int[] param2, boolean param3) {
        int var5 = 0;
        long var6 = 0L;
        ko var8 = null;
        ko var8_ref = null;
        ha var9 = null;
        ko var10 = null;
        ha var11 = null;
        ko var12 = null;
        ha var20 = null;
        ko var21 = null;
        ha var23 = null;
        ko var24 = null;
        var5 = (param1 >>> -1881471156 | 65527 & param1 << 375687716) ^ param0;
        var5 = var5 | param1 << -1108238544;
        if (param3) {
          var6 = (long)var5;
          var8 = (ko) (Object) ((bn) this).field_a.a(var6, 0);
          if (var8 == null) {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                var23 = ha.a(((bn) this).field_d, param1, param0);
                if (var23 == null) {
                  return null;
                } else {
                  L0: {
                    var24 = var23.b();
                    var8_ref = var24;
                    ((bn) this).field_a.a(-22072, var6, (jb) (Object) var8_ref);
                    if (param2 != null) {
                      param2[0] = param2[0] - var24.field_k.length;
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
              var23 = ha.a(((bn) this).field_d, param1, param0);
              if (var23 == null) {
                return null;
              } else {
                L1: {
                  var24 = var23.b();
                  var8_ref = var24;
                  ((bn) this).field_a.a(-22072, var6, (jb) (Object) var8_ref);
                  if (param2 != null) {
                    param2[0] = param2[0] - var24.field_k.length;
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
          ((bn) this).field_a = null;
          var6 = (long)var5;
          var8 = (ko) (Object) ((bn) this).field_a.a(var6, 0);
          if (var8 == null) {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                var20 = ha.a(((bn) this).field_d, param1, param0);
                var9 = var20;
                if (var20 == null) {
                  return null;
                } else {
                  L2: {
                    var21 = var20.b();
                    var8_ref = var21;
                    ((bn) this).field_a.a(-22072, var6, (jb) (Object) var8_ref);
                    if (param2 != null) {
                      param2[0] = param2[0] - var21.field_k.length;
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
              var11 = ha.a(((bn) this).field_d, param1, param0);
              var9 = var11;
              if (var11 == null) {
                return null;
              } else {
                L3: {
                  var12 = var11.b();
                  var10 = var12;
                  var8_ref = var12;
                  ((bn) this).field_a.a(-22072, var6, (jb) (Object) var8_ref);
                  if (param2 != null) {
                    param2[0] = param2[0] - var12.field_k.length;
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

    final ko a(int param0, boolean param1, int[] param2) {
        if (((bn) this).field_e.a(122) != 1) {
          if (!param1) {
            if (1 == ((bn) this).field_e.a(param0, 0)) {
              return this.a(param0, -76, 0, param2);
            } else {
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        } else {
          return this.a(0, -101, param0, param2);
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        if (param0 != -3) {
          bn.a((byte) 80);
          field_f = null;
          field_i = null;
          return;
        } else {
          field_f = null;
          field_i = null;
          return;
        }
    }

    private final ko a(int param0, int param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        ko var8 = null;
        ko var8_ref = null;
        bl var9 = null;
        bl var9_ref = null;
        Object var10 = null;
        if (param1 < -20) {
          var5 = (param0 >>> 1867718860 | (536875007 & param0) << -1601173980) ^ param2;
          var5 = var5 | param0 << 640620720;
          var6 = (long)var5 ^ 4294967296L;
          var8 = (ko) (Object) ((bn) this).field_a.a(var6, 0);
          if (var8 == null) {
            if (param3 != null) {
              if ((param3[0] ^ -1) < -1) {
                L0: {
                  var9 = (bl) (Object) ((bn) this).field_b.a(var6, 0);
                  if (var9 == null) {
                    var9_ref = bl.a(((bn) this).field_e, param0, param2);
                    if (var9_ref != null) {
                      ((bn) this).field_b.a(-22072, var6, (jb) (Object) var9_ref);
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    break L0;
                  }
                }
                var8_ref = var9_ref.a(param3);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.a(false);
                  ((bn) this).field_a.a(-22072, var6, (jb) (Object) var8_ref);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (bl) (Object) ((bn) this).field_b.a(var6, 0);
                if (var9 == null) {
                  var9_ref = bl.a(((bn) this).field_e, param0, param2);
                  if (var9_ref != null) {
                    ((bn) this).field_b.a(-22072, var6, (jb) (Object) var9_ref);
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var8_ref = var9_ref.a(param3);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.a(false);
                ((bn) this).field_a.a(-22072, var6, (jb) (Object) var8_ref);
                return var8_ref;
              }
            }
          } else {
            return var8;
          }
        } else {
          var10 = null;
          ko discarded$1 = this.a(89, -15, (int[]) null, true);
          var5 = (param0 >>> 1867718860 | (536875007 & param0) << -1601173980) ^ param2;
          var5 = var5 | param0 << 640620720;
          var6 = (long)var5 ^ 4294967296L;
          var8 = (ko) (Object) ((bn) this).field_a.a(var6, 0);
          if (var8 == null) {
            if (param3 != null) {
              if ((param3[0] ^ -1) < -1) {
                L2: {
                  var9 = (bl) (Object) ((bn) this).field_b.a(var6, 0);
                  if (var9 == null) {
                    var9_ref = bl.a(((bn) this).field_e, param0, param2);
                    if (var9_ref != null) {
                      ((bn) this).field_b.a(-22072, var6, (jb) (Object) var9_ref);
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    break L2;
                  }
                }
                var8_ref = var9_ref.a(param3);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.a(false);
                  ((bn) this).field_a.a(-22072, var6, (jb) (Object) var8_ref);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L3: {
                var9 = (bl) (Object) ((bn) this).field_b.a(var6, 0);
                if (var9 == null) {
                  var9_ref = bl.a(((bn) this).field_e, param0, param2);
                  if (var9_ref != null) {
                    ((bn) this).field_b.a(-22072, var6, (jb) (Object) var9_ref);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8_ref = var9_ref.a(param3);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.a(false);
                ((bn) this).field_a.a(-22072, var6, (jb) (Object) var8_ref);
                return var8_ref;
              }
            }
          } else {
            return var8;
          }
        }
    }

    final ko a(int[] param0, boolean param1, int param2) {
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int[] stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int[] stackIn_3_3 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int[] stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int[] stackOut_1_3 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int[] stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int[] stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        if (-2 != (((bn) this).field_d.a(105) ^ -1)) {
          if (((bn) this).field_d.a(param2, 0) == 1) {
            return this.a(0, param2, param0, true);
          } else {
            if (param1) {
              return null;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          L0: {
            stackOut_1_0 = this;
            stackOut_1_1 = param2;
            stackOut_1_2 = 0;
            stackOut_1_3 = (int[]) param0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            stackIn_2_3 = stackOut_1_3;
            if (param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = (int[]) (Object) stackIn_3_3;
              stackOut_3_4 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              stackIn_4_4 = stackOut_3_4;
              break L0;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = stackIn_2_2;
              stackOut_2_3 = (int[]) (Object) stackIn_2_3;
              stackOut_2_4 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_4_4 = stackOut_2_4;
              break L0;
            }
          }
          return this.a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0);
        }
    }

    bn(db param0, db param1) {
        ((bn) this).field_b = new fc(256);
        ((bn) this).field_a = new fc(256);
        ((bn) this).field_e = param1;
        ((bn) this).field_d = param0;
    }

    static {
    }
}
