/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends w {
    private int field_Nb;
    private w field_Sb;
    private w field_Vb;
    static long[] field_Ub;
    private w field_Wb;
    static String field_Xb;
    static boolean field_Qb;
    private w field_Rb;
    static String field_Ob;
    static String field_Zb;
    private w field_Pb;
    private w field_Tb;
    static int field_Yb;

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param1 == 88) {
          L0: {
            var5 = 0;
            var6 = -((jd) this).field_Tb.field_N + ((jd) this).field_Pb.field_N;
            if (0 < var6) {
              var7 = ((jd) this).field_Tb.field_Ib;
              var8 = -param2 + param3;
              var5 = (var7 * var8 - -(var6 / 2)) / var6;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param0) {
            L1: {
              if (var5 > param3 - param2) {
                var5 = param3 + -param2;
                break L1;
              } else {
                break L1;
              }
            }
            if (var5 >= 0) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L2: {
              if (-1 < (var5 ^ -1)) {
                var5 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            if (var5 <= -param2 + param3) {
              return var5;
            } else {
              var5 = -param2 + param3;
              return var5;
            }
          }
        } else {
          return -14;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        an.a(param1, 0, var3, param0, var2);
        return var3;
    }

    final boolean i(byte param0) {
        if (-1 != ((jd) this).field_Sb.field_ob) {
          ((jd) this).field_Nb = 20;
          return true;
        } else {
          if (((jd) this).field_Sb.field_gb == 0) {
            if (param0 != 7) {
              boolean discarded$4 = ((jd) this).g((byte) -98);
              return false;
            } else {
              return false;
            }
          } else {
            L0: {
              if (-1 < ((jd) this).field_Nb) {
                ((jd) this).field_Nb = ((jd) this).field_Nb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 != (((jd) this).field_Nb ^ -1)) {
              if (param0 == 7) {
                return false;
              } else {
                boolean discarded$5 = ((jd) this).g((byte) -98);
                return false;
              }
            } else {
              ((jd) this).field_Nb = 3;
              return true;
            }
          }
        }
    }

    final boolean g(byte param0) {
        if (param0 < -59) {
          if (((jd) this).field_Wb.field_ob != 0) {
            ((jd) this).field_Nb = 20;
            return true;
          } else {
            if (((jd) this).field_Wb.field_gb != 0) {
              if (0 >= ((jd) this).field_Nb) {
                if (-1 == (((jd) this).field_Nb ^ -1)) {
                  if (((jd) this).field_Tb.field_pb - -((jd) this).field_Tb.field_Mb > pm.field_f) {
                    ((jd) this).field_Nb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                ((jd) this).field_Nb = ((jd) this).field_Nb - 1;
                if (-1 == (((jd) this).field_Nb ^ -1)) {
                  if (((jd) this).field_Tb.field_pb - -((jd) this).field_Tb.field_Mb > pm.field_f) {
                    ((jd) this).field_Nb = 3;
                    return true;
                  } else {
                    return false;
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
          ((jd) this).field_Tb = null;
          if (((jd) this).field_Wb.field_ob != 0) {
            ((jd) this).field_Nb = 20;
            return true;
          } else {
            if (((jd) this).field_Wb.field_gb != 0) {
              if (0 < ((jd) this).field_Nb) {
                ((jd) this).field_Nb = ((jd) this).field_Nb - 1;
                if (-1 == (((jd) this).field_Nb ^ -1)) {
                  if (((jd) this).field_Tb.field_pb - -((jd) this).field_Tb.field_Mb > pm.field_f) {
                    ((jd) this).field_Nb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (-1 == (((jd) this).field_Nb ^ -1)) {
                  if (((jd) this).field_Tb.field_pb - -((jd) this).field_Tb.field_Mb <= pm.field_f) {
                    return false;
                  } else {
                    ((jd) this).field_Nb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((jd) this).field_mb = param4;
        ((jd) this).field_Ib = param7;
        ((jd) this).field_vb = param0;
        ((jd) this).field_N = param2;
        int var9 = 91 / ((73 - param1) / 40);
        ((jd) this).a(param6, param3, -91, param5);
    }

    final static void g(int param0) {
        tj var3 = null;
        int var2 = client.field_A ? 1 : 0;
        if (param0 <= 4) {
            return;
        }
        fj.field_h = false;
        cd.field_m = null;
        g.field_N = null;
        if (!(null == i.field_b)) {
            i.field_b.c(120);
            i.field_b = null;
        }
        ob.field_i = null;
        if (null != h.field_b) {
            h.field_b.c(118);
            h.field_b = null;
            tg.field_b = null;
            if (!(oc.field_b == null)) {
                oc.field_b.c(113);
                oc.field_b = null;
            }
            hn.field_h = null;
            if (!(ob.field_i == null)) {
                var3 = (tj) (Object) ob.field_i.c(-9443);
                while (var3 != null) {
                    var3.e((byte) 69);
                    var3 = (tj) (Object) ob.field_i.b(-123);
                }
                ob.field_i = null;
                return;
            }
            return;
        }
        tg.field_b = null;
        if (!(oc.field_b == null)) {
            oc.field_b.c(113);
            oc.field_b = null;
        }
        hn.field_h = null;
        if (!(ob.field_i == null)) {
            var3 = (tj) (Object) ob.field_i.c(-9443);
            while (var3 != null) {
                var3.e((byte) 69);
                var3 = (tj) (Object) ob.field_i.b(-123);
            }
            ob.field_i = null;
            return;
        }
    }

    final boolean h(byte param0) {
        if (!(0 == ((jd) this).field_Vb.field_ob)) {
            ((jd) this).field_Nb = 20;
            return true;
        }
        if ((((jd) this).field_Vb.field_gb ^ -1) == -1) {
            if (param0 < 67) {
                ((jd) this).field_Wb = null;
                return false;
            }
            return false;
        }
        if (!(-1 <= (((jd) this).field_Nb ^ -1))) {
            ((jd) this).field_Nb = ((jd) this).field_Nb - 1;
        }
        if (((jd) this).field_Nb != 0) {
            if (param0 < 67) {
                ((jd) this).field_Wb = null;
                return false;
            }
            return false;
        }
        ((jd) this).field_Nb = 3;
        return true;
    }

    public static void e(int param0) {
        if (param0 != 32) {
            return;
        }
        field_Zb = null;
        field_Ub = null;
        field_Ob = null;
        field_Xb = null;
    }

    jd(long param0, w param1, w param2, w param3, w param4) {
        super(param0, (w) null);
        ((jd) this).field_Sb = new w(0L, param1);
        ((jd) this).field_Vb = new w(0L, param2);
        ((jd) this).a(((jd) this).field_Sb, -16834);
        ((jd) this).a(((jd) this).field_Vb, -16834);
        ((jd) this).field_Pb = new w(0L, (w) null);
        ((jd) this).a(((jd) this).field_Pb, -16834);
        ((jd) this).field_Wb = new w(0L, param3);
        ((jd) this).field_Rb = new w(0L, param3);
        w var9 = ((jd) this).field_Wb;
        w var10 = var9;
        ((jd) this).field_Rb.field_Gb = true;
        var10.field_Gb = true;
        ((jd) this).field_Pb.a(((jd) this).field_Wb, -16834);
        ((jd) this).field_Pb.a(((jd) this).field_Rb, -16834);
        ((jd) this).field_Tb = new w(0L, param4);
        ((jd) this).field_Tb.field_U = true;
        ((jd) this).field_Pb.a(((jd) this).field_Tb, -16834);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        w var18 = null;
        w var19 = null;
        w var20 = null;
        w stackIn_12_0 = null;
        w stackIn_12_1 = null;
        w stackIn_12_2 = null;
        w stackIn_13_0 = null;
        w stackIn_13_1 = null;
        w stackIn_13_2 = null;
        w stackIn_14_0 = null;
        w stackIn_14_1 = null;
        w stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        w stackIn_18_0 = null;
        w stackIn_18_1 = null;
        w stackIn_18_2 = null;
        w stackIn_19_0 = null;
        w stackIn_19_1 = null;
        w stackIn_19_2 = null;
        w stackIn_20_0 = null;
        w stackIn_20_1 = null;
        w stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        w stackOut_17_0 = null;
        w stackOut_17_1 = null;
        w stackOut_17_2 = null;
        w stackOut_19_0 = null;
        w stackOut_19_1 = null;
        w stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        w stackOut_18_0 = null;
        w stackOut_18_1 = null;
        w stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        w stackOut_11_0 = null;
        w stackOut_11_1 = null;
        w stackOut_11_2 = null;
        w stackOut_13_0 = null;
        w stackOut_13_1 = null;
        w stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        w stackOut_12_0 = null;
        w stackOut_12_1 = null;
        w stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          if (((jd) this).field_N < 2 * ((jd) this).field_mb) {
            var6 = ((jd) this).field_N / 2;
            var5 = ((jd) this).field_N / 2;
            break L0;
          } else {
            var6 = -((jd) this).field_mb + ((jd) this).field_N;
            var5 = ((jd) this).field_mb;
            break L0;
          }
        }
        var7 = var6 - var5;
        var8 = var7;
        if (0 >= param1) {
          L1: {
            var9 = param1 - param0;
            var10 = -var8 + var7;
            var11 = 0;
            if (-1 <= (var9 ^ -1)) {
              break L1;
            } else {
              var11 = (param3 * var10 + var9 / 2) / var9;
              break L1;
            }
          }
          L2: {
            var12 = var11 - -(var8 / 2);
            var15 = ((jd) this).field_Sb;
            var15.field_mb = ((jd) this).field_mb;
            var14 = 103 % ((param2 - -29) / 46);
            var15.field_N = var5;
            var15.field_Ib = 0;
            var15.field_vb = 0;
            var16 = ((jd) this).field_Vb;
            var16.field_Ib = var6;
            var16.field_mb = ((jd) this).field_mb;
            var16.field_N = ((jd) this).field_N - var6;
            var16.field_vb = 0;
            var17 = ((jd) this).field_Pb;
            var17.field_N = var7;
            var17.field_mb = ((jd) this).field_mb;
            var17.field_vb = 0;
            var17.field_Ib = var5;
            var18 = ((jd) this).field_Wb;
            var18.field_vb = 0;
            var18.field_N = var12;
            var18.field_Ib = 0;
            var18.field_mb = ((jd) this).field_mb;
            var19 = ((jd) this).field_Rb;
            var19.field_Ib = var12;
            var19.field_vb = 0;
            var19.field_N = -var12 + var7;
            var19.field_mb = ((jd) this).field_mb;
            var20 = ((jd) this).field_Tb;
            var20.field_mb = ((jd) this).field_mb;
            var20.field_N = var8;
            var20.field_Ib = var11;
            stackOut_17_0 = ((jd) this).field_Sb;
            stackOut_17_1 = ((jd) this).field_Vb;
            stackOut_17_2 = ((jd) this).field_Pb;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_19_2 = stackOut_17_2;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            if (param1 <= param0) {
              stackOut_19_0 = (w) (Object) stackIn_19_0;
              stackOut_19_1 = (w) (Object) stackIn_19_1;
              stackOut_19_2 = (w) (Object) stackIn_19_2;
              stackOut_19_3 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              stackIn_20_3 = stackOut_19_3;
              break L2;
            } else {
              stackOut_18_0 = (w) (Object) stackIn_18_0;
              stackOut_18_1 = (w) (Object) stackIn_18_1;
              stackOut_18_2 = (w) (Object) stackIn_18_2;
              stackOut_18_3 = 1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_20_3 = stackOut_18_3;
              break L2;
            }
          }
          stackIn_20_2.field_Hb = stackIn_20_3 != 0;
          stackIn_20_1.field_Hb = stackIn_20_3 != 0;
          stackIn_20_0.field_Hb = stackIn_20_3 != 0;
          var20.field_vb = 0;
          return;
        } else {
          L3: {
            var8 = var8 * param0 / param1;
            if (((jd) this).field_mb > var8) {
              var8 = ((jd) this).field_mb;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var7 >= var8) {
              break L4;
            } else {
              var8 = var7;
              break L4;
            }
          }
          L5: {
            var9 = param1 - param0;
            var10 = -var8 + var7;
            var11 = 0;
            if (-1 <= (var9 ^ -1)) {
              break L5;
            } else {
              var11 = (param3 * var10 + var9 / 2) / var9;
              break L5;
            }
          }
          L6: {
            var12 = var11 - -(var8 / 2);
            var15 = ((jd) this).field_Sb;
            var15.field_mb = ((jd) this).field_mb;
            var14 = 103 % ((param2 - -29) / 46);
            var15.field_N = var5;
            var15.field_Ib = 0;
            var15.field_vb = 0;
            var16 = ((jd) this).field_Vb;
            var16.field_Ib = var6;
            var16.field_mb = ((jd) this).field_mb;
            var16.field_N = ((jd) this).field_N - var6;
            var16.field_vb = 0;
            var17 = ((jd) this).field_Pb;
            var17.field_N = var7;
            var17.field_mb = ((jd) this).field_mb;
            var17.field_vb = 0;
            var17.field_Ib = var5;
            var18 = ((jd) this).field_Wb;
            var18.field_vb = 0;
            var18.field_N = var12;
            var18.field_Ib = 0;
            var18.field_mb = ((jd) this).field_mb;
            var19 = ((jd) this).field_Rb;
            var19.field_Ib = var12;
            var19.field_vb = 0;
            var19.field_N = -var12 + var7;
            var19.field_mb = ((jd) this).field_mb;
            var20 = ((jd) this).field_Tb;
            var20.field_mb = ((jd) this).field_mb;
            var20.field_N = var8;
            var20.field_Ib = var11;
            stackOut_11_0 = ((jd) this).field_Sb;
            stackOut_11_1 = ((jd) this).field_Vb;
            stackOut_11_2 = ((jd) this).field_Pb;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_13_2 = stackOut_11_2;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            if (param1 <= param0) {
              stackOut_13_0 = (w) (Object) stackIn_13_0;
              stackOut_13_1 = (w) (Object) stackIn_13_1;
              stackOut_13_2 = (w) (Object) stackIn_13_2;
              stackOut_13_3 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              stackIn_14_3 = stackOut_13_3;
              break L6;
            } else {
              stackOut_12_0 = (w) (Object) stackIn_12_0;
              stackOut_12_1 = (w) (Object) stackIn_12_1;
              stackOut_12_2 = (w) (Object) stackIn_12_2;
              stackOut_12_3 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              stackIn_14_3 = stackOut_12_3;
              break L6;
            }
          }
          stackIn_14_2.field_Hb = stackIn_14_3 != 0;
          stackIn_14_1.field_Hb = stackIn_14_3 != 0;
          stackIn_14_0.field_Hb = stackIn_14_3 != 0;
          var20.field_vb = 0;
          return;
        }
    }

    jd(long param0, jd param1) {
        this(param0, param1.field_Sb, param1.field_Vb, param1.field_Wb, param1.field_Tb);
    }

    final boolean f(int param0) {
        if (((jd) this).field_Rb.field_ob == param0) {
          if (-1 != (((jd) this).field_Rb.field_gb ^ -1)) {
            L0: {
              if (((jd) this).field_Nb > 0) {
                ((jd) this).field_Nb = ((jd) this).field_Nb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((jd) this).field_Nb == 0) {
              if (pm.field_f < ((jd) this).field_Tb.field_F + (((jd) this).field_Tb.field_N + ((jd) this).field_Tb.field_Mb + ((jd) this).field_Tb.field_pb)) {
                return false;
              } else {
                ((jd) this).field_Nb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((jd) this).field_Nb = 20;
          return true;
        }
    }

    final boolean j(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -2) {
          L0: {
            ((jd) this).a(58, -105, -107, 34);
            if (-1 == ((jd) this).field_Tb.field_gb) {
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
            if (-1 == ((jd) this).field_Tb.field_gb) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Zb = "Buying or selling an account";
        field_Ub = new long[32];
        field_Xb = "Orb points: ";
        field_Ob = "To Highscores";
    }
}
