/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends kd {
    int field_o;
    int field_u;
    int field_j;
    int field_E;
    static String field_t;
    static db field_n;
    int field_i;
    ke field_w;
    wj field_p;
    int field_y;
    static String field_A;
    int field_x;
    int field_k;
    int field_m;
    static String field_D;
    int field_q;
    rc field_r;
    int field_v;
    int field_B;
    int field_s;
    cc field_C;
    int field_l;
    int field_z;
    int field_h;
    int field_F;

    public static void a(int param0) {
        field_A = null;
        field_D = null;
        if (param0 != 29152) {
            return;
        }
        field_t = null;
        field_n = null;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            k.b();
            gl.field_e = new int[260];
            sb.field_d = 11;
            var1_int = 0;
            L1: while (true) {
              L2: {
                if (var1_int >= 256) {
                  if (param0 <= -51) {
                    break L2;
                  } else {
                    field_n = (db) null;
                    break L2;
                  }
                } else {
                  var2 = 15.0;
                  gl.field_e[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                  var1_int++;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              var1_int = 256;
              L3: while (true) {
                if (var1_int >= gl.field_e.length) {
                  break L0;
                } else {
                  gl.field_e[var1_int] = 255;
                  var1_int++;
                  if (var4 == 0) {
                    continue L3;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "cb.C(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        ug.field_m = 0;
        nc.field_p = null;
        af.field_b = false;
        vf.field_r = -1;
        if (param0 != -52) {
          field_n = (db) null;
          bf.field_g = -1;
          return;
        } else {
          bf.field_g = -1;
          return;
        }
    }

    final static boolean a(byte param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_19_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        if (!param1) {
          if (oj.field_j[param3] >= oj.field_j[param2]) {
            if (oj.field_j[param3] > oj.field_j[param2]) {
              return false;
            } else {
              if (we.field_g[param3] < we.field_g[param2]) {
                return true;
              } else {
                if (we.field_g[param2] >= we.field_g[param3]) {
                  if (param0 < 13) {
                    cb.b(73);
                    var4 = hl.field_N[param3] + oc.field_a[param3] + l.field_D[param3];
                    var5 = hl.field_N[param2] + oc.field_a[param2] + l.field_D[param2];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param3 >= param2) {
                            stackOut_55_0 = 0;
                            stackIn_56_0 = stackOut_55_0;
                            break L0;
                          } else {
                            stackOut_54_0 = 1;
                            stackIn_56_0 = stackOut_54_0;
                            break L0;
                          }
                        }
                        return stackIn_56_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = hl.field_N[param3] + oc.field_a[param3] + l.field_D[param3];
                    var5 = hl.field_N[param2] + oc.field_a[param2] + l.field_D[param2];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param3 >= param2) {
                            stackOut_46_0 = 0;
                            stackIn_47_0 = stackOut_46_0;
                            break L1;
                          } else {
                            stackOut_45_0 = 1;
                            stackIn_47_0 = stackOut_45_0;
                            break L1;
                          }
                        }
                        return stackIn_47_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          if (we.field_g[param2] <= we.field_g[param3]) {
            if (we.field_g[param3] > we.field_g[param2]) {
              return false;
            } else {
              if (oj.field_j[param2] > oj.field_j[param3]) {
                return true;
              } else {
                if (oj.field_j[param3] <= oj.field_j[param2]) {
                  if (param0 < 13) {
                    cb.b(73);
                    var4 = hl.field_N[param3] + oc.field_a[param3] + l.field_D[param3];
                    var5 = hl.field_N[param2] + oc.field_a[param2] + l.field_D[param2];
                    if (var4 >= var5) {
                      if (var5 >= var4) {
                        if (param3 >= param2) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = hl.field_N[param3] + oc.field_a[param3] + l.field_D[param3];
                    var5 = hl.field_N[param2] + oc.field_a[param2] + l.field_D[param2];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param3 >= param2) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            break L2;
                          } else {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            break L2;
                          }
                        }
                        return stackIn_19_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
          cb.a(-98);
          this.field_r = null;
          this.field_C = null;
          this.field_p = null;
          this.field_w = null;
          return;
        } else {
          this.field_r = null;
          this.field_C = null;
          this.field_p = null;
          this.field_w = null;
          return;
        }
    }

    cb() {
    }

    static {
        field_A = "Use this alternative as your account name";
        field_D = "1 of 4";
    }
}
