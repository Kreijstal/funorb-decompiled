/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    private int field_f;
    String field_b;
    static boolean field_a;
    private int field_h;
    private we[] field_c;
    float field_d;
    static int[] field_g;
    private int field_e;

    final boolean a(int param0) {
        int var3 = 0;
        we var5 = null;
        we var6 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 2189) {
          ((jp) this).field_b = null;
          L0: while (true) {
            if (((jp) this).field_f > ((jp) this).field_e) {
              var6 = ((jp) this).field_c[((jp) this).field_e];
              if (var6.field_c.a((byte) 82)) {
                L1: {
                  if (var6.field_d < 0) {
                    break L1;
                  } else {
                    if (!var6.field_c.a(11894, var6.field_d)) {
                      this.a(var6.field_c.b(var6.field_d, (byte) 73), var6, (byte) -89);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var6.field_b == null) {
                    break L2;
                  } else {
                    if (var6.field_c.a(28979, var6.field_b)) {
                      break L2;
                    } else {
                      this.a(var6.field_c.a(var6.field_b, (byte) -126), var6, (byte) -75);
                      return false;
                    }
                  }
                }
                L3: {
                  if (var6.field_d >= 0) {
                    break L3;
                  } else {
                    if (null != var6.field_b) {
                      break L3;
                    } else {
                      if (var6.field_j == null) {
                        break L3;
                      } else {
                        if (var6.field_c.d(-27927)) {
                          break L3;
                        } else {
                          this.a(var6.field_c.a(0), var6, (byte) -88);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((jp) this).field_e = ((jp) this).field_e + 1;
                continue L0;
              } else {
                this.a(0, var6, (byte) -126);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((jp) this).field_f > ((jp) this).field_e) {
              var5 = ((jp) this).field_c[((jp) this).field_e];
              if (var5.field_c.a((byte) 82)) {
                L5: {
                  if (var5.field_d < 0) {
                    break L5;
                  } else {
                    if (!var5.field_c.a(11894, var5.field_d)) {
                      this.a(var5.field_c.b(var5.field_d, (byte) 73), var5, (byte) -89);
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var5.field_b == null) {
                    break L6;
                  } else {
                    if (var5.field_c.a(28979, var5.field_b)) {
                      break L6;
                    } else {
                      this.a(var5.field_c.a(var5.field_b, (byte) -126), var5, (byte) -75);
                      return false;
                    }
                  }
                }
                L7: {
                  if (var5.field_d >= 0) {
                    break L7;
                  } else {
                    if (null != var5.field_b) {
                      break L7;
                    } else {
                      if (var5.field_j == null) {
                        break L7;
                      } else {
                        if (var5.field_c.d(-27927)) {
                          break L7;
                        } else {
                          this.a(var5.field_c.a(0), var5, (byte) -88);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((jp) this).field_e = ((jp) this).field_e + 1;
                continue L4;
              } else {
                this.a(0, var5, (byte) -126);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, wk[] param3, int param4, int param5) {
        if (param5 != -8991) {
          field_g = null;
          param3[0].g(param0, param1, param4);
          param3[1].b(param3[1].field_y + param0, param1, -(param3[2].field_y << -1362163231) + param2, param3[2].field_v, param4);
          param3[2].g(-param3[2].field_y + (param2 + param0), param1, param4);
          return;
        } else {
          param3[0].g(param0, param1, param4);
          param3[1].b(param3[1].field_y + param0, param1, -(param3[2].field_y << -1362163231) + param2, param3[2].field_v, param4);
          param3[2].g(-param3[2].field_y + (param2 + param0), param1, param4);
          return;
        }
    }

    final static void a(vh param0, int param1) {
        la.field_d = param0.e((byte) -104) << 721562789;
        int var2 = param0.k(0);
        rt.field_D = (var2 & 7) << 1026024594;
        la.field_d = la.field_d + (var2 >> -137564637);
        rt.field_D = rt.field_D + (param0.e((byte) -104) << 1261039714);
        var2 = param0.k(0);
        nk.field_m = 2064384 & var2 << 638124015;
        rt.field_D = rt.field_D + (var2 >> 1838881158);
        nk.field_m = nk.field_m + (param0.k(0) << 733537511);
        int var3 = 16 % ((param1 - -45) / 34);
        var2 = param0.k(0);
        ov.field_e = (1 & var2) << 126026960;
        nk.field_m = nk.field_m + (var2 >> -67324479);
        ov.field_e = ov.field_e + param0.e((byte) -104);
    }

    private final void a(int param0, we param1, byte param2) {
        float var4 = 0.0f;
        var4 = (float)(((jp) this).field_e - -1) + (float)param0 / 100.0f;
        if (param0 == 0) {
          ((jp) this).field_b = param1.field_e;
          if (param2 <= -64) {
            ((jp) this).field_d = (float)((jp) this).field_h * var4 / (float)(1 + ((jp) this).field_f);
            return;
          } else {
            boolean discarded$2 = ((jp) this).a(8);
            ((jp) this).field_d = (float)((jp) this).field_h * var4 / (float)(1 + ((jp) this).field_f);
            return;
          }
        } else {
          ((jp) this).field_b = param1.field_j + " - " + param0 + "%";
          if (param2 <= -64) {
            ((jp) this).field_d = (float)((jp) this).field_h * var4 / (float)(1 + ((jp) this).field_f);
            return;
          } else {
            boolean discarded$3 = ((jp) this).a(8);
            ((jp) this).field_d = (float)((jp) this).field_h * var4 / (float)(1 + ((jp) this).field_f);
            return;
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (qn.field_l >= param2 + param0) {
            return param0;
        }
        if (!((param0 + param1 - param2 ^ -1) > param3)) {
            return -param2 + (param1 + param0);
        }
        return -param2 + qn.field_l;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 < -74) {
            return;
        }
        jp.a((byte) 0);
    }

    private jp() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[128];
    }
}
