/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    private ki field_a;
    private te field_b;
    static boolean[] field_d;
    private ki field_e;
    private te field_c;

    private final qp a(String param0, int param1, int[] param2) {
        if (param1 >= 16) {
          if (((og) this).field_a.b((byte) -125, "")) {
            return this.a(45, "", param2, param0);
          } else {
            return this.a(88, param0, param2, "");
          }
        } else {
          ((og) this).field_c = null;
          if (((og) this).field_a.b((byte) -125, "")) {
            return this.a(45, "", param2, param0);
          } else {
            return this.a(88, param0, param2, "");
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
            field_d = null;
        }
    }

    final qp b(int param0, String param1) {
        if (param0 != 0) {
            ((og) this).field_a = null;
            return this.a(-2, param1, (int[]) null);
        }
        return this.a(-2, param1, (int[]) null);
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -5) {
          L0: {
            og.a(true);
            if (-25 != oh.field_e) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-25 != oh.field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final qp a(int param0, String param1) {
        int var3 = 91 / ((param0 - -31) / 58);
        return this.a(param1, 80, (int[]) null);
    }

    private final qp a(String param0, int param1, int[] param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((og) this).field_e.a(0, param3);
        if (var5 >= param1) {
          var6 = ((og) this).field_e.a(var5, param0, (byte) 127);
          if (-1 < (var6 ^ -1)) {
            return null;
          } else {
            return this.a(param2, param1 ^ 1026562700, var5, var6);
          }
        } else {
          return null;
        }
    }

    private final qp a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        qp var8 = null;
        qp var8_ref = null;
        ae var9 = null;
        Object var10 = null;
        qp var11 = null;
        ae var12 = null;
        qp var13 = null;
        ae var21 = null;
        qp var22 = null;
        ae var24 = null;
        qp var25 = null;
        var5 = ((-2147479553 & param2) << -83507708 | param2 >>> 1026562700) ^ param3;
        if (param1 == 1026562700) {
          var5 = var5 | param2 << 1307620880;
          var6 = (long)var5;
          var8 = (qp) (Object) ((og) this).field_c.a(param1 ^ 1026562803, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (param0[0] > 0) {
                var24 = ae.a(((og) this).field_e, param2, param3);
                if (var24 == null) {
                  return null;
                } else {
                  L0: {
                    var25 = var24.b();
                    var8_ref = var25;
                    ((og) this).field_c.a((ms) (Object) var8_ref, -1, var6);
                    if (param0 != null) {
                      param0[0] = param0[0] - var25.field_p.length;
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
              var24 = ae.a(((og) this).field_e, param2, param3);
              if (var24 == null) {
                return null;
              } else {
                L1: {
                  var25 = var24.b();
                  var8_ref = var25;
                  ((og) this).field_c.a((ms) (Object) var8_ref, -1, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var25.field_p.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8_ref;
              }
            }
          }
        } else {
          var10 = null;
          qp discarded$2 = this.a((String) null, -18, (int[]) null, (String) null);
          var5 = var5 | param2 << 1307620880;
          var6 = (long)var5;
          var8 = (qp) (Object) ((og) this).field_c.a(param1 ^ 1026562803, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (param0[0] > 0) {
                var21 = ae.a(((og) this).field_e, param2, param3);
                var9 = var21;
                if (var21 == null) {
                  return null;
                } else {
                  L2: {
                    var22 = var21.b();
                    var8_ref = var22;
                    ((og) this).field_c.a((ms) (Object) var8_ref, -1, var6);
                    if (param0 != null) {
                      param0[0] = param0[0] - var22.field_p.length;
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
              var12 = ae.a(((og) this).field_e, param2, param3);
              var9 = var12;
              if (var12 == null) {
                return null;
              } else {
                L3: {
                  var13 = var12.b();
                  var11 = var13;
                  var8_ref = var13;
                  ((og) this).field_c.a((ms) (Object) var8_ref, -1, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var13.field_p.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8_ref;
              }
            }
          }
        }
    }

    private final qp a(int param0, int param1, boolean param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        qp var8 = null;
        qp var8_ref = null;
        q var9 = null;
        q var9_ref = null;
        var5 = param0 ^ (param1 >>> 2055614412 | (1342181375 & param1) << -1105354012);
        var5 = var5 | param1 << -1109391440;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (qp) (Object) ((og) this).field_c.a(127, var6);
        if (var8 != null) {
          return var8;
        } else {
          if (param3 != null) {
            if (-1 > (param3[0] ^ -1)) {
              L0: {
                var9 = (q) (Object) ((og) this).field_b.a(118, var6);
                if (var9 == null) {
                  var9_ref = q.a(((og) this).field_a, param1, param0);
                  if (var9_ref != null) {
                    ((og) this).field_b.a((ms) (Object) var9_ref, -1, var6);
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
                var9_ref.b(param2);
                ((og) this).field_c.a((ms) (Object) var8_ref, -1, var6);
                return var8_ref;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var9 = (q) (Object) ((og) this).field_b.a(118, var6);
              if (var9 == null) {
                var9_ref = q.a(((og) this).field_a, param1, param0);
                if (var9_ref != null) {
                  ((og) this).field_b.a((ms) (Object) var9_ref, -1, var6);
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
              var9_ref.b(param2);
              ((og) this).field_c.a((ms) (Object) var8_ref, -1, var6);
              return var8_ref;
            }
          }
        }
    }

    private final qp a(int param0, String param1, int[] param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = ((og) this).field_a.a(0, param1);
        if (param0 >= 33) {
          if (var5 >= 0) {
            var6 = ((og) this).field_a.a(var5, param3, (byte) 127);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(var6, var5, false, param2);
            }
          } else {
            return null;
          }
        } else {
          boolean discarded$5 = og.a(30);
          if (var5 >= 0) {
            var6 = ((og) this).field_a.a(var5, param3, (byte) 127);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(var6, var5, false, param2);
            }
          } else {
            return null;
          }
        }
    }

    final qp a(int param0, int[] param1, int param2) {
        if (((og) this).field_e.b(true) == -2) {
          return this.a(param1, 1026562700, 0, param0);
        } else {
          if (-2 != ((og) this).field_e.a((byte) -65, param0)) {
            if (param2 != 10709) {
              return null;
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a(param1, param2 + 1026551991, param0, 0);
          }
        }
    }

    private final qp a(int param0, String param1, int[] param2) {
        if (param0 == -2) {
          if (((og) this).field_e.b((byte) 116, "")) {
            return this.a(param1, 0, param2, "");
          } else {
            return this.a("", 0, param2, param1);
          }
        } else {
          return null;
        }
    }

    final qp b(int param0, int[] param1, int param2) {
        if ((((og) this).field_a.b(true) ^ -1) != -2) {
          if (1 != ((og) this).field_a.a((byte) -65, param2)) {
            if (param0 > -65) {
              ((og) this).field_a = null;
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a(0, param2, false, param1);
          }
        } else {
          return this.a(param2, 0, false, param1);
        }
    }

    og(ki param0, ki param1) {
        ((og) this).field_b = new te(256);
        ((og) this).field_c = new te(256);
        ((og) this).field_a = param1;
        ((og) this).field_e = param0;
    }

    static {
    }
}
