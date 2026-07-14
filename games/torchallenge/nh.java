/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends v implements sg {
    static int field_jb;
    private ng field_gb;
    static int[] field_hb;
    static String field_fb;
    static String field_ib;
    static sl field_cb;
    static uf field_eb;
    static int[] field_db;
    static int field_bb;

    private final ng a(String param0, int param1, gg param2) {
        ng var4 = null;
        int var5 = 0;
        var4 = new ng(param0, param2);
        var4.field_q = (j) (Object) new cl();
        var5 = -6 + ((nh) this).field_l;
        ((nh) this).field_l = ((nh) this).field_l + 38;
        var4.a((byte) 117, 15, 30, -16 + ((nh) this).field_p - 14, var5);
        if (param1 != 2) {
          field_cb = null;
          ((nh) this).a(0, (ee) (Object) var4);
          ((nh) this).b((byte) 112);
          return var4;
        } else {
          ((nh) this).a(0, (ee) (Object) var4);
          ((nh) this).b((byte) 112);
          return var4;
        }
    }

    private final static boolean g(byte param0) {
        if (param0 > 84) {
          if (null != tf.field_h) {
            if (!tf.field_h.c(-1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$8 = nh.a(true, 5, 82, -78);
          if (null != tf.field_h) {
            if (!tf.field_h.c(-1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_26_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        if (!param0) {
          if (bj.field_b[param2] < bj.field_b[param3]) {
            return true;
          } else {
            if (bj.field_b[param2] <= bj.field_b[param3]) {
              if (bg.field_Q[param2] >= bg.field_Q[param3]) {
                if (bg.field_Q[param2] <= bg.field_Q[param3]) {
                  if (param1 != 0) {
                    nh.l(19);
                    var4 = ea.field_a[param2] + (rk.field_p[param2] - -cb.field_e[param2]);
                    var5 = cb.field_e[param3] + (rk.field_p[param3] - -ea.field_a[param3]);
                    if (var4 >= var5) {
                      if (var5 >= var4) {
                        if (param2 >= param3) {
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
                    var4 = ea.field_a[param2] + (rk.field_p[param2] - -cb.field_e[param2]);
                    var5 = cb.field_e[param3] + (rk.field_p[param3] - -ea.field_a[param3]);
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param2 >= param3) {
                            stackOut_25_0 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            break L0;
                          } else {
                            stackOut_24_0 = 1;
                            stackIn_26_0 = stackOut_24_0;
                            break L0;
                          }
                        }
                        return stackIn_26_0 != 0;
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
          }
        } else {
          if (bg.field_Q[param2] >= bg.field_Q[param3]) {
            if (bg.field_Q[param2] > bg.field_Q[param3]) {
              return false;
            } else {
              if (bj.field_b[param2] >= bj.field_b[param3]) {
                if (bj.field_b[param3] >= bj.field_b[param2]) {
                  if (param1 == 0) {
                    var4 = ea.field_a[param2] + (rk.field_p[param2] - -cb.field_e[param2]);
                    var5 = cb.field_e[param3] + (rk.field_p[param3] - -ea.field_a[param3]);
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param2 >= param3) {
                            stackOut_52_0 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            break L1;
                          } else {
                            stackOut_51_0 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            break L1;
                          }
                        }
                        return stackIn_53_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    nh.l(19);
                    var4 = ea.field_a[param2] + (rk.field_p[param2] - -cb.field_e[param2]);
                    var5 = cb.field_e[param3] + (rk.field_p[param3] - -ea.field_a[param3]);
                    if (var4 >= var5) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param2 >= param3) {
                            stackOut_43_0 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            break L2;
                          } else {
                            stackOut_42_0 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            break L2;
                          }
                        }
                        return stackIn_44_0 != 0;
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
            }
          } else {
            return true;
          }
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
          L0: {
            field_db = null;
            if (param0 == ((nh) this).field_gb) {
              this.e(param4);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 == ((nh) this).field_gb) {
              this.e(param4);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    nh(si param0, ll param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        ee var6 = null;
        Object var7 = null;
        ee var8 = null;
        String var9 = null;
        ee var10 = null;
        ee var11 = null;
        var7 = null;
        if (dj.field_P != param1) {
          if (de.field_b == param1) {
            L0: {
              ((nh) this).field_l = ((nh) this).field_l + 10;
              var3 = uc.field_T;
              if (!nh.g((byte) 94)) {
                break L0;
              } else {
                ((nh) this).field_l = ((nh) this).field_l + 20;
                var3 = hd.field_g;
                break L0;
              }
            }
            var11 = new ee(var3, (gg) null);
            var11.field_m = 0;
            var11.field_i = 50;
            var11.field_p = ((nh) this).field_p;
            var11.field_l = 80;
            var11.field_q = (j) (Object) new bc(ug.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((nh) this).a(0, var11);
            ((nh) this).field_gb = this.a(ab.field_n, 2, (gg) this);
          } else {
            if (tj.field_d == param1) {
              var9 = jd.field_d;
              var3 = var9;
              var3 = var9;
              ((nh) this).field_l = ((nh) this).field_l + 30;
              var10 = new ee(var9, (gg) null);
              var10.field_m = 0;
              var10.field_i = 50;
              var10.field_p = ((nh) this).field_p;
              var10.field_l = 80;
              var10.field_q = (j) (Object) new bc(ug.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((nh) this).a(0, var10);
              ((nh) this).field_gb = this.a(ab.field_n, 2, (gg) this);
            } else {
              var8 = new ee((String) var7, (gg) null);
              var8.field_m = 0;
              var8.field_i = 50;
              var8.field_p = ((nh) this).field_p;
              var8.field_l = 80;
              var8.field_q = (j) (Object) new bc(ug.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((nh) this).a(0, var8);
              ((nh) this).field_gb = this.a(ab.field_n, 2, (gg) this);
            }
          }
        } else {
          var5 = d.field_z;
          var6 = new ee(var5, (gg) null);
          var6.field_m = 0;
          var6.field_i = 50;
          var6.field_p = ((nh) this).field_p;
          var6.field_l = 80;
          var6.field_q = (j) (Object) new bc(ug.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((nh) this).a(0, var6);
          ((nh) this).field_gb = this.a(ab.field_n, 2, (gg) this);
        }
    }

    public static void l(int param0) {
        field_hb = null;
        field_eb = null;
        field_ib = null;
        field_cb = null;
        if (param0 != -25725) {
          field_eb = null;
          field_fb = null;
          field_db = null;
          return;
        } else {
          field_fb = null;
          field_db = null;
          return;
        }
    }

    private final void e(boolean param0) {
        if (!(((nh) this).field_K)) {
            return;
        }
        ((nh) this).field_K = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = new int[]{0, 3, 3, 3, 2, 1, 3, 3};
        field_ib = "Error connecting to server. Please try using a different server.";
        field_fb = "Cancel";
        field_db = new int[]{468, 6, 168, 40};
        field_cb = new sl();
        field_bb = 5;
    }
}
