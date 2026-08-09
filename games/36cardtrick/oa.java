/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static volatile boolean field_d;
    static int[] field_a;
    static String field_b;
    static String field_c;
    static int[] field_e;

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        int stackIn_25_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int var4;
        int var5;
        if (!param2) {
          if (db.field_l[param1] >= db.field_l[param3]) {
            if (db.field_l[param1] <= db.field_l[param3]) {
              if (p.field_n[param3] > p.field_n[param1]) {
                return true;
              } else {
                if (p.field_n[param3] >= p.field_n[param1]) {
                  if (param0 != -29680) {
                    field_a = (int[]) null;
                    var4 = ij.field_c[param1] + (q.field_h[param1] + mj.field_b[param1]);
                    var5 = ij.field_c[param3] + mj.field_b[param3] + q.field_h[param3];
                    if (var4 >= var5) {
                      if (var5 >= var4) {
                        if (param3 <= param1) {
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
                    var4 = ij.field_c[param1] + (q.field_h[param1] + mj.field_b[param1]);
                    var5 = ij.field_c[param3] + mj.field_b[param3] + q.field_h[param3];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param3 <= param1) {
                            stackIn_25_0 = 0;
                            break L0;
                          } else {
                            stackIn_25_0 = 1;
                            break L0;
                          }
                        }
                        return stackIn_25_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (p.field_n[param1] >= p.field_n[param3]) {
            if (p.field_n[param1] <= p.field_n[param3]) {
              if (db.field_l[param1] >= db.field_l[param3]) {
                if (db.field_l[param1] <= db.field_l[param3]) {
                  if (param0 == -29680) {
                    var4 = ij.field_c[param1] + (q.field_h[param1] + mj.field_b[param1]);
                    var5 = ij.field_c[param3] + mj.field_b[param3] + q.field_h[param3];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param3 <= param1) {
                            stackIn_52_0 = 0;
                            break L1;
                          } else {
                            stackIn_52_0 = 1;
                            break L1;
                          }
                        }
                        return stackIn_52_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    field_a = (int[]) null;
                    var4 = ij.field_c[param1] + (q.field_h[param1] + mj.field_b[param1]);
                    var5 = ij.field_c[param3] + mj.field_b[param3] + q.field_h[param3];
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param3 <= param1) {
                            stackIn_43_0 = 0;
                            break L2;
                          } else {
                            stackIn_43_0 = 1;
                            break L2;
                          }
                        }
                        return stackIn_43_0 != 0;
                      }
                    } else {
                      return true;
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
          } else {
            return true;
          }
        }
    }

    final static void a(java.awt.Component param0, int param1, byte param2, le param3, boolean param4) {
        gd.a(param1, param4, 10);
        wd.field_e = gd.a(param3, param0, 0, 22050);
        cb.field_g = gd.a(param3, param0, 1, 1024);
        bg.field_tb = new qj();
        if (param2 <= 66) {
            return;
        }
        try {
            cb.field_g.b(bg.field_tb);
            sh.field_e = new qj();
            wd.field_e.b(sh.field_e);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "oa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 109) {
            return;
        }
        field_e = null;
    }

    static {
        field_a = new int[8192];
        field_b = "Just play";
        field_e = new int[8192];
        field_c = "Click";
        field_d = false;
    }
}
