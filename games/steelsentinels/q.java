/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class q implements Iterable {
    static ul field_m;
    int field_e;
    static ic field_f;
    static int field_h;
    static float field_l;
    private ck field_b;
    static String field_a;
    static String field_g;
    static gh field_d;
    static int field_i;
    static String field_c;
    static String field_k;
    ck[] field_j;

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -126) {
          field_f = null;
          field_f = null;
          field_m = null;
          field_a = null;
          field_c = null;
          field_k = null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_m = null;
          field_a = null;
          field_c = null;
          field_k = null;
          field_g = null;
          return;
        }
    }

    final static boolean a(byte param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        if (param3) {
          if (ok.field_d[param2] > ok.field_d[param1]) {
            return true;
          } else {
            if (ok.field_d[param1] <= ok.field_d[param2]) {
              if (eb.field_u[param1] < eb.field_u[param2]) {
                return true;
              } else {
                if (eb.field_u[param1] <= eb.field_u[param2]) {
                  var4 = mb.field_T[param1] + ne.field_G[param1] + jm.field_r[param1];
                  var5 = jm.field_r[param2] + ne.field_G[param2] - -mb.field_T[param2];
                  var6 = -10 % ((-27 - param0) / 47);
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var4 > var5) {
                      return false;
                    } else {
                      if (param2 <= param1) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          if (eb.field_u[param1] < eb.field_u[param2]) {
            return true;
          } else {
            if (eb.field_u[param1] <= eb.field_u[param2]) {
              if (ok.field_d[param2] <= ok.field_d[param1]) {
                if (ok.field_d[param1] <= ok.field_d[param2]) {
                  var4 = mb.field_T[param1] + ne.field_G[param1] + jm.field_r[param1];
                  var5 = jm.field_r[param2] + ne.field_G[param2] - -mb.field_T[param2];
                  var6 = -10 % ((-27 - param0) / 47);
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L0: {
                        if (param2 <= param1) {
                          stackOut_38_0 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          break L0;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L0;
                        }
                      }
                      return stackIn_39_0 != 0;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new l((q) this);
    }

    final void a(ck param0, long param1, boolean param2) {
        ck var5 = null;
        ck var6 = null;
        ck var7 = null;
        ck var8 = null;
        ck var9 = null;
        if (!param2) {
          if (param0.field_i != null) {
            param0.b(4);
            var8 = ((q) this).field_j[(int)((long)(((q) this).field_e - 1) & param1)];
            var5 = var8;
            param0.field_i = var8.field_i;
            param0.field_k = var5;
            param0.field_i.field_k = param0;
            param0.field_k.field_i = param0;
            param0.field_j = param1;
            return;
          } else {
            var9 = ((q) this).field_j[(int)((long)(((q) this).field_e - 1) & param1)];
            var5 = var9;
            param0.field_i = var9.field_i;
            param0.field_k = var5;
            param0.field_i.field_k = param0;
            param0.field_k.field_i = param0;
            param0.field_j = param1;
            return;
          }
        } else {
          field_a = null;
          if (param0.field_i == null) {
            var6 = ((q) this).field_j[(int)((long)(((q) this).field_e - 1) & param1)];
            var5 = var6;
            param0.field_i = var6.field_i;
            param0.field_k = var5;
            param0.field_i.field_k = param0;
            param0.field_k.field_i = param0;
            param0.field_j = param1;
            return;
          } else {
            param0.b(4);
            var7 = ((q) this).field_j[(int)((long)(((q) this).field_e - 1) & param1)];
            var5 = var7;
            param0.field_i = var7.field_i;
            param0.field_k = var5;
            param0.field_i.field_k = param0;
            param0.field_k.field_i = param0;
            param0.field_j = param1;
            return;
          }
        }
    }

    final ck a(long param0, byte param1) {
        ck var4 = null;
        ck var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        var4 = ((q) this).field_j[(int)(param0 & (long)(-1 + ((q) this).field_e))];
        ((q) this).field_b = var4.field_k;
        if (param1 <= -118) {
          L0: while (true) {
            if (var4 != ((q) this).field_b) {
              if ((((q) this).field_b.field_j ^ -1L) == (param0 ^ -1L)) {
                var5 = ((q) this).field_b;
                ((q) this).field_b = ((q) this).field_b.field_k;
                return var5;
              } else {
                ((q) this).field_b = ((q) this).field_b.field_k;
                continue L0;
              }
            } else {
              ((q) this).field_b = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(wk param0, byte param1) {
        jl.a(false);
        if (param1 >= -60) {
          field_g = null;
          pb.a(param0.field_E, param0.field_z, param0.field_B);
          return;
        } else {
          pb.a(param0.field_E, param0.field_z, param0.field_B);
          return;
        }
    }

    q(int param0) {
        int var2 = 0;
        ck var3 = null;
        ((q) this).field_e = param0;
        ((q) this).field_j = new ck[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            var3 = new ck();
            ((q) this).field_j[var2] = new ck();
            var3.field_k = var3;
            var3.field_i = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        L0: {
          gh.field_Jb = param3;
          if ((vb.field_g ^ -1) != param2) {
            break L0;
          } else {
            if (qj.field_q[98] != null) {
              pc discarded$7 = ia.a(6940, qj.field_q[98]);
              break L0;
            } else {
              vb.field_g = param0;
              pm.field_U = 0;
              if (d.a(vb.field_g, param2 ^ -1)) {
                L1: {
                  var4 = 0;
                  if (12 != vb.field_g) {
                    break L1;
                  } else {
                    var4 = -1;
                    break L1;
                  }
                }
                i.field_e[vb.field_g].a(param1, var4, -63);
                if (12 == vb.field_g) {
                  le.a((byte) -114, param1);
                  if (0 != vb.field_g) {
                    return;
                  } else {
                    L2: {
                      if (null != qj.field_q[96]) {
                        pc discarded$8 = ia.a(6940, qj.field_q[96]);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return;
                  }
                } else {
                  if (0 != vb.field_g) {
                    return;
                  } else {
                    L3: {
                      if (null != qj.field_q[96]) {
                        pc discarded$9 = ia.a(6940, qj.field_q[96]);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  }
                }
              } else {
                if (0 != vb.field_g) {
                  return;
                } else {
                  L4: {
                    if (null != qj.field_q[96]) {
                      pc discarded$10 = ia.a(6940, qj.field_q[96]);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        vb.field_g = param0;
        pm.field_U = 0;
        if (d.a(vb.field_g, param2 ^ -1)) {
          L5: {
            var4 = 0;
            if (12 != vb.field_g) {
              break L5;
            } else {
              var4 = -1;
              break L5;
            }
          }
          i.field_e[vb.field_g].a(param1, var4, -63);
          if (12 == vb.field_g) {
            le.a((byte) -114, param1);
            if (0 != vb.field_g) {
              return;
            } else {
              L6: {
                if (null != qj.field_q[96]) {
                  pc discarded$11 = ia.a(6940, qj.field_q[96]);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          } else {
            if (0 != vb.field_g) {
              return;
            } else {
              L7: {
                if (null != qj.field_q[96]) {
                  pc discarded$12 = ia.a(6940, qj.field_q[96]);
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        } else {
          if (0 != vb.field_g) {
            return;
          } else {
            L8: {
              if (null != qj.field_q[96]) {
                pc discarded$13 = ia.a(6940, qj.field_q[96]);
                break L8;
              } else {
                break L8;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Engineering";
        field_a = "<%0><br><%1> <times> <%2>";
        field_c = "Create unrated game";
        field_k = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
