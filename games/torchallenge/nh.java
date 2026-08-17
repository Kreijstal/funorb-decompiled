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
        RuntimeException var4_ref = null;
        int var5 = 0;
        ng stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new ng(param0, param2);
              var4.field_q = (j) ((Object) new cl());
              var5 = -6 + this.field_l;
              this.field_l = this.field_l + 38;
              var4.a((byte) 117, 15, 30, -16 + this.field_p - 14, var5);
              if (param1 == 2) {
                break L1;
              } else {
                field_cb = (sl) null;
                break L1;
              }
            }
            this.a(0, var4);
            this.b((byte) 112);
            stackIn_3_0 = (ng) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("nh.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
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
          nh.a(true, 5, 82, -78);
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
        int stackIn_26_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        int var4;
        int var5;
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
                            stackIn_26_0 = 0;
                            break L0;
                          } else {
                            stackIn_26_0 = 1;
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
                            stackIn_53_0 = 0;
                            break L1;
                          } else {
                            stackIn_53_0 = 1;
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
                            stackIn_44_0 = 0;
                            break L2;
                          } else {
                            stackIn_44_0 = 1;
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
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                field_db = (int[]) null;
                break L1;
              }
            }
            if (param0 == this.field_gb) {
              this.e(param4);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("nh.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    nh(si param0, ll param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ee var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (dj.field_P != param1) {
                if (de.field_b == param1) {
                  this.field_l = this.field_l + 10;
                  var3 = uc.field_T;
                  if (!nh.g((byte) 94)) {
                    break L1;
                  } else {
                    this.field_l = this.field_l + 20;
                    var3 = hd.field_g;
                    break L1;
                  }
                } else {
                  if (tj.field_d != param1) {
                    break L1;
                  } else {
                    var3 = jd.field_d;
                    this.field_l = this.field_l + 30;
                    break L1;
                  }
                }
              } else {
                var3 = d.field_z;
                break L1;
              }
            }
            var4 = new ee((String) (var3), (gg) null);
            var4.field_m = 0;
            var4.field_i = 50;
            var4.field_p = this.field_p;
            var4.field_l = 80;
            var4.field_q = (j) ((Object) new bc(ug.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(0, var4);
            this.field_gb = this.a(ab.field_n, 2, (gg) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("nh.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    public static void l(int param0) {
        field_hb = null;
        field_eb = null;
        field_ib = null;
        field_cb = null;
        if (param0 != -25725) {
          field_eb = (uf) null;
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
        if (!(this.field_K)) {
            return;
        }
        this.field_K = param0 ? true : false;
    }

    static {
        field_hb = new int[]{0, 3, 3, 3, 2, 1, 3, 3};
        field_ib = "Error connecting to server. Please try using a different server.";
        field_fb = "Cancel";
        field_db = new int[]{468, 6, 168, 40};
        field_cb = new sl();
        field_bb = 5;
    }
}
