/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ag extends cn {
    static wk[] field_o;
    static int field_u;
    static String field_t;
    static int[] field_r;
    static int field_s;
    static ka field_p;
    static int field_q;

    ag(int param0) {
        this(tj.field_e, param0);
    }

    public static void b(int param0) {
        field_t = null;
        field_o = null;
        if (param0 != 9) {
            return;
        }
        field_p = null;
        field_r = null;
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        try {
            if (!(!param3)) {
                ra.a(param1.field_z + param4, param1.field_x, param1.field_E, param1.field_o + param0, (byte) 116);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ag.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (param1) {
          if (!param0) {
            L0: {
              if (param2) {
                var4 += 2;
                break L0;
              } else {
                break L0;
              }
            }
            if (param3) {
              var4++;
              return tf.field_d[var4];
            } else {
              return tf.field_d[var4];
            }
          } else {
            L1: {
              var4 += 4;
              if (param2) {
                var4 += 2;
                break L1;
              } else {
                break L1;
              }
            }
            if (param3) {
              var4++;
              return tf.field_d[var4];
            } else {
              return tf.field_d[var4];
            }
          }
        } else {
          field_q = -53;
          if (param0) {
            L2: {
              var4 += 4;
              if (param2) {
                var4 += 2;
                break L2;
              } else {
                break L2;
              }
            }
            if (!param3) {
              return tf.field_d[var4];
            } else {
              var4++;
              return tf.field_d[var4];
            }
          } else {
            L3: {
              if (param2) {
                var4 += 2;
                break L3;
              } else {
                break L3;
              }
            }
            if (param3) {
              var4++;
              return tf.field_d[var4];
            } else {
              return tf.field_d[var4];
            }
          }
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if ((rd.field_b ^ -1) < -1) {
          if (null != ve.field_a) {
            L0: {
              wb.field_c = ve.field_a.b(param0 ^ -32476);
              wd.a(2, (byte) -31);
              if (null == wb.field_c) {
                var2 = 3;
                break L0;
              } else {
                var2 = 2;
                hg.a((byte) -93, wb.field_c);
                break L0;
              }
            }
            if (param0 == -4) {
              if (null == ve.field_a) {
                if (!ff.field_fb) {
                  return;
                } else {
                  cl.a(113, param1, var2);
                  return;
                }
              } else {
                return;
              }
            } else {
              field_t = (String) null;
              if (null == ve.field_a) {
                if (ff.field_fb) {
                  cl.a(113, param1, var2);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L1: {
              wb.field_c = hc.a(0, hb.field_i, 0, 480, 0, 640);
              if (null == wb.field_c) {
                var2 = 3;
                break L1;
              } else {
                var2 = 2;
                hg.a((byte) -93, wb.field_c);
                break L1;
              }
            }
            if (param0 == -4) {
              if (null == ve.field_a) {
                if (ff.field_fb) {
                  cl.a(113, param1, var2);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              field_t = (String) null;
              if (null == ve.field_a) {
                if (ff.field_fb) {
                  cl.a(113, param1, var2);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          if (ni.b(89)) {
            var2 = 0;
            if (param0 != -4) {
              field_t = (String) null;
              if (null == ve.field_a) {
                if (ff.field_fb) {
                  cl.a(113, param1, var2);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (null == ve.field_a) {
                if (!ff.field_fb) {
                  return;
                } else {
                  cl.a(113, param1, var2);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            var2 = 1;
            if (param0 == -4) {
              if (null == ve.field_a) {
                if (!ff.field_fb) {
                  return;
                } else {
                  cl.a(113, param1, var2);
                  return;
                }
              } else {
                return;
              }
            } else {
              field_t = (String) null;
              if (null == ve.field_a) {
                if (ff.field_fb) {
                  cl.a(113, param1, var2);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    ag(mi param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    final static int a(int param0, int param1) {
        if (-6 >= (param1 ^ -1)) {
          if (param1 <= 9) {
            if (param0 <= 15) {
              field_u = -95;
              return -4 + param1;
            } else {
              return -4 + param1;
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    static {
        field_u = 0;
        field_t = "Team Battle";
        field_r = new int[5];
    }
}
