/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sm implements el {
    private long field_c;
    static String field_a;
    static int field_b;
    static String field_d;

    public final rf a(int param0) {
        if (!(!((sm) this).c(-107))) {
            return re.field_s;
        }
        if (param0 != 17124) {
            sm.a(false, true);
            if ((td.b(param0 + -16996) ^ -1L) > (((sm) this).field_c + 350L ^ -1L)) {
                return of.field_f;
            }
            return ((sm) this).d(-76);
        }
        if ((td.b(param0 + -16996) ^ -1L) > (((sm) this).field_c + 350L ^ -1L)) {
            return of.field_f;
        }
        return ((sm) this).d(-76);
    }

    public final String b(int param0) {
        int var2 = 103 / ((param0 - -35) / 59);
        if (((sm) this).c(95)) {
            return null;
        }
        if ((350L + ((sm) this).field_c ^ -1L) < (td.b(128) ^ -1L)) {
            return null;
        }
        return ((sm) this).a((byte) 125);
    }

    final static int a(int param0, int param1, dk[] param2, int param3) {
        dk[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        dk var7 = null;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        if (param2 != null) {
          var4 = param2;
          var6 = -90 % ((param1 - -58) / 32);
          var5 = 0;
          L0: while (true) {
            if (var4.length <= var5) {
              return -1;
            } else {
              var7 = var4[var5];
              if (var7 != null) {
                if (!var7.a((byte) 65, param3, param0)) {
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  return var7.field_c;
                }
              } else {
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return -1;
        }
    }

    public final void a(boolean param0) {
        ((sm) this).field_c = td.b(128);
        if (param0) {
            field_b = -44;
        }
    }

    abstract rf d(int param0);

    public static void b(boolean param0) {
        field_a = null;
        if (!param0) {
            sm.a(false, false);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(qd param0, int param1, boolean param2) {
        c var3 = om.field_c;
        var3.a(param1, param2);
        var3.field_m = var3.field_m + 1;
        int var4 = var3.field_m;
        var3.f(1, -123);
        var3.f(param0.field_m, -123);
        var3.f(param0.field_h, -123);
        var3.a((byte) 124, param0.field_k);
        var3.a((byte) 127, param0.field_i);
        var3.a((byte) 125, param0.field_j);
        var3.a((byte) 127, param0.field_g);
        int discarded$0 = var3.c(var4, -76);
        var3.e(86, var3.field_m - var4);
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        pk stackIn_17_0 = null;
        pk stackIn_18_0 = null;
        pk stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        pk stackIn_50_0 = null;
        pk stackIn_51_0 = null;
        pk stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        pk stackOut_49_0 = null;
        pk stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        pk stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        pk stackOut_16_0 = null;
        pk stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        pk stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var3 = EscapeVector.field_A;
        if (!param0) {
          if (s.field_x > 0) {
            if (km.field_n == null) {
              L0: {
                df.field_d = al.a(640, -16493, g.field_r, 480, 0, 0);
                if (null != df.field_d) {
                  var2 = 2;
                  rc.a((java.awt.Canvas) (Object) df.field_d, true);
                  break L0;
                } else {
                  var2 = 3;
                  break L0;
                }
              }
              L1: {
                if (null != km.field_n) {
                  break L1;
                } else {
                  if (!e.field_d) {
                    break L1;
                  } else {
                    sn.a(var2, 0, param1);
                    return;
                  }
                }
              }
              return;
            } else {
              L2: {
                stackOut_49_0 = km.field_n;
                stackIn_51_0 = stackOut_49_0;
                stackIn_50_0 = stackOut_49_0;
                if (param0) {
                  stackOut_51_0 = (pk) (Object) stackIn_51_0;
                  stackOut_51_1 = 0;
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  break L2;
                } else {
                  stackOut_50_0 = (pk) (Object) stackIn_50_0;
                  stackOut_50_1 = 1;
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  break L2;
                }
              }
              L3: {
                df.field_d = ((pk) (Object) stackIn_52_0).a(stackIn_52_1 != 0);
                ue.b(2, (byte) 101);
                if (null != df.field_d) {
                  var2 = 2;
                  rc.a((java.awt.Canvas) (Object) df.field_d, true);
                  break L3;
                } else {
                  var2 = 3;
                  break L3;
                }
              }
              L4: {
                if (null != km.field_n) {
                  break L4;
                } else {
                  if (!e.field_d) {
                    break L4;
                  } else {
                    sn.a(var2, 0, param1);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (aj.b(-104)) {
              var2 = 0;
              if (null == km.field_n) {
                if (e.field_d) {
                  sn.a(var2, 0, param1);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L5: {
                var2 = 1;
                if (null != km.field_n) {
                  break L5;
                } else {
                  if (!e.field_d) {
                    break L5;
                  } else {
                    sn.a(var2, 0, param1);
                    return;
                  }
                }
              }
              return;
            }
          }
        } else {
          field_a = null;
          if (s.field_x > 0) {
            if (km.field_n == null) {
              L6: {
                df.field_d = al.a(640, -16493, g.field_r, 480, 0, 0);
                if (null != df.field_d) {
                  var2 = 2;
                  rc.a((java.awt.Canvas) (Object) df.field_d, true);
                  break L6;
                } else {
                  var2 = 3;
                  break L6;
                }
              }
              if (null == km.field_n) {
                if (e.field_d) {
                  sn.a(var2, 0, param1);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L7: {
                stackOut_16_0 = km.field_n;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (param0) {
                  stackOut_18_0 = (pk) (Object) stackIn_18_0;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L7;
                } else {
                  stackOut_17_0 = (pk) (Object) stackIn_17_0;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L7;
                }
              }
              L8: {
                df.field_d = ((pk) (Object) stackIn_19_0).a(stackIn_19_1 != 0);
                ue.b(2, (byte) 101);
                if (null != df.field_d) {
                  var2 = 2;
                  rc.a((java.awt.Canvas) (Object) df.field_d, true);
                  break L8;
                } else {
                  var2 = 3;
                  break L8;
                }
              }
              if (null == km.field_n) {
                if (e.field_d) {
                  sn.a(var2, 0, param1);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (aj.b(-104)) {
              var2 = 0;
              if (null == km.field_n) {
                if (e.field_d) {
                  sn.a(var2, 0, param1);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              var2 = 1;
              if (null == km.field_n) {
                if (e.field_d) {
                  sn.a(var2, 0, param1);
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

    final static void b(byte param0) {
        jh.a(true, kl.field_o, false, mf.field_b);
        if (param0 > -45) {
            return;
        }
        ha.field_a = true;
    }

    abstract String a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = "Loading graphics";
    }
}
