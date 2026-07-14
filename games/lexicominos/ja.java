/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static int[] field_b;
    private na field_d;
    private sh field_a;
    private sh field_e;
    private na field_c;

    private final ke a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        ke var8 = null;
        ke var8_ref = null;
        ba var9 = null;
        Object var10 = null;
        ba var12 = null;
        ke var13 = null;
        ba var40 = null;
        ke var41 = null;
        ba var48 = null;
        ke var49 = null;
        var5 = param1 ^ (param3 << -1569186012 & 65521 | param3 >>> -673772724);
        var5 = var5 | param3 << -520029520;
        if (param2 == 4164) {
          var6 = (long)var5;
          var8 = (ke) (Object) ((ja) this).field_c.a(var6, (byte) 109);
          if (var8 == null) {
            if (param0 != null) {
              if (param0[0] > 0) {
                var48 = ba.a(((ja) this).field_a, param3, param1);
                if (var48 != null) {
                  var49 = var48.a();
                  var8_ref = var49;
                  ((ja) this).field_c.a((kd) (Object) var8_ref, (byte) -126, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var49.field_i.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var48 = ba.a(((ja) this).field_a, param3, param1);
              if (var48 != null) {
                var49 = var48.a();
                var8_ref = var49;
                ((ja) this).field_c.a((kd) (Object) var8_ref, (byte) -126, var6);
                if (param0 != null) {
                  param0[0] = param0[0] - var49.field_i.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          } else {
            return var8;
          }
        } else {
          var10 = null;
          ke discarded$1 = ((ja) this).a(-93, (int[]) null, true);
          var6 = (long)var5;
          var8 = (ke) (Object) ((ja) this).field_c.a(var6, (byte) 109);
          if (var8 == null) {
            if (param0 != null) {
              if (param0[0] > 0) {
                var40 = ba.a(((ja) this).field_a, param3, param1);
                var9 = var40;
                if (var40 != null) {
                  var41 = var40.a();
                  var8_ref = var41;
                  ((ja) this).field_c.a((kd) (Object) var8_ref, (byte) -126, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var41.field_i.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var12 = ba.a(((ja) this).field_a, param3, param1);
              var9 = var12;
              if (var12 != null) {
                var13 = var12.a();
                var8_ref = var13;
                ((ja) this).field_c.a((kd) (Object) var8_ref, (byte) -126, var6);
                if (param0 != null) {
                  param0[0] = param0[0] - var13.field_i.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          } else {
            return var8;
          }
        }
    }

    final static void b(byte param0) {
        ul var1 = null;
        ul var1_ref = null;
        L0: {
          var1 = (ul) (Object) pb.field_k.a(31334);
          if (var1 == null) {
            var1_ref = new ul();
            break L0;
          } else {
            break L0;
          }
        }
        var1_ref.a(lf.field_b, lf.field_e, 0, lf.field_a, lf.field_c, lf.field_f, lf.field_h, lf.field_g);
        if (param0 >= -110) {
          boolean discarded$2 = ja.a(112);
          vb.field_m.b(103, (kd) (Object) var1_ref);
          return;
        } else {
          vb.field_m.b(103, (kd) (Object) var1_ref);
          return;
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -2116060060) {
          L0: {
            field_b = null;
            if (qa.field_c.b(12)) {
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
            if (qa.field_c.b(12)) {
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

    final ke a(int param0, int[] param1, int param2) {
        if (1 != ((ja) this).field_a.b(param0 + 21)) {
          if (-2 == (((ja) this).field_a.a((byte) 119, param2) ^ -1)) {
            return this.a(param1, 0, 4164, param2);
          } else {
            if (param0 != -1) {
              field_b = null;
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          return this.a(param1, param2, 4164, 0);
        }
    }

    private final ke a(byte param0, String param1, int[] param2) {
        if (((ja) this).field_e.a("", (byte) -127)) {
          return this.a("", param2, param0 + 7135, param1);
        } else {
          if (param0 != -92) {
            return null;
          } else {
            return this.a(param1, param2, 7043, "");
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -36) {
            boolean discarded$0 = ja.a(-28);
        }
    }

    final ke a(int param0, int[] param1, boolean param2) {
        if (!param2) {
            Object var5 = null;
            ke discarded$1 = this.a((byte) -35, (String) null, (int[]) null);
            if (1 == ((ja) this).field_e.b(27)) {
                return this.a(param0, 0, (byte) -6, param1);
            }
            if (!((((ja) this).field_e.a((byte) -95, param0) ^ -1) != -2)) {
                return this.a(0, param0, (byte) -6, param1);
            }
            throw new RuntimeException();
        }
        if (1 == ((ja) this).field_e.b(27)) {
            return this.a(param0, 0, (byte) -6, param1);
        }
        if (!((((ja) this).field_e.a((byte) -95, param0) ^ -1) != -2)) {
            return this.a(0, param0, (byte) -6, param1);
        }
        throw new RuntimeException();
    }

    private final ke a(String param0, int[] param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        if (param2 == 7043) {
          var5 = ((ja) this).field_e.c(param0, (byte) -89);
          if (-1 >= (var5 ^ -1)) {
            var6 = ((ja) this).field_e.a(param3, param2 + -35007, var5);
            if ((var6 ^ -1) > -1) {
              return null;
            } else {
              return this.a(var6, var5, (byte) -6, param1);
            }
          } else {
            return null;
          }
        } else {
          ((ja) this).field_e = null;
          var5 = ((ja) this).field_e.c(param0, (byte) -89);
          if (-1 >= (var5 ^ -1)) {
            var6 = ((ja) this).field_e.a(param3, param2 + -35007, var5);
            if ((var6 ^ -1) > -1) {
              return null;
            } else {
              return this.a(var6, var5, (byte) -6, param1);
            }
          } else {
            return null;
          }
        }
    }

    private final ke a(int param0, int param1, byte param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        ke var8 = null;
        ke var8_ref = null;
        sd var9 = null;
        sd var9_ref = null;
        var5 = ((-268431361 & param1) << -2116060060 | param1 >>> -888382356) ^ param0;
        var5 = var5 | param1 << -1720709456;
        var6 = 4294967296L ^ (long)var5;
        var8 = (ke) (Object) ((ja) this).field_c.a(var6, (byte) 118);
        if (var8 == null) {
          if (param3 != null) {
            if (param3[0] > 0) {
              L0: {
                var9 = (sd) (Object) ((ja) this).field_d.a(var6, (byte) 122);
                if (var9 == null) {
                  var9_ref = sd.a(((ja) this).field_e, param1, param0);
                  if (var9_ref != null) {
                    ((ja) this).field_d.a((kd) (Object) var9_ref, (byte) -102, var6);
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  break L0;
                }
              }
              var8_ref = var9_ref.a(param3);
              if (param2 == -6) {
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.b((byte) -125);
                  ((ja) this).field_c.a((kd) (Object) var8_ref, (byte) -57, var6);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var9 = (sd) (Object) ((ja) this).field_d.a(var6, (byte) 122);
              if (var9 == null) {
                var9_ref = sd.a(((ja) this).field_e, param1, param0);
                if (var9_ref != null) {
                  ((ja) this).field_d.a((kd) (Object) var9_ref, (byte) -102, var6);
                  break L1;
                } else {
                  return null;
                }
              } else {
                break L1;
              }
            }
            var8_ref = var9_ref.a(param3);
            if (param2 == -6) {
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.b((byte) -125);
                ((ja) this).field_c.a((kd) (Object) var8_ref, (byte) -57, var6);
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          return var8;
        }
    }

    final ke a(byte param0, String param1) {
        if (param0 != -80) {
            return null;
        }
        return this.a((byte) -92, param1, (int[]) null);
    }

    ja(sh param0, sh param1) {
        ((ja) this).field_d = new na(256);
        ((ja) this).field_c = new na(256);
        ((ja) this).field_a = param0;
        ((ja) this).field_e = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{100, 2, 1, 6, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 4, 5, 20};
    }
}
