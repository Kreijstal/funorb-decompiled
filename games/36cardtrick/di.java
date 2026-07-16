/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    int field_c;
    static rf field_d;
    int[] field_a;
    int field_b;

    final static byte[] a(byte[] param0, w param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Main.field_T;
        var4 = param1.g(param3, -1);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param1.g(3, -1);
            var6 = (byte)param1.g(8, -1);
            if (param2 == 17259) {
              break L2;
            } else {
              field_d = null;
              break L2;
            }
          }
          L3: {
            if ((var5 ^ -1) >= -1) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param0[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (byte)(param1.g(var5, -1) + var6);
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 74) {
            break L0;
          } else {
            ((di) this).field_c = -54;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((di) this).field_a) {
              break L2;
            } else {
              if (((di) this).field_a.length == 0) {
                break L2;
              } else {
                stackOut_4_0 = ((di) this).field_a[((di) this).field_a.length - 1];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Main.field_T;
          if (((di) this).field_a == null) {
            break L0;
          } else {
            if (0 == ((di) this).field_a.length) {
              break L0;
            } else {
              var3 = param0;
              L1: while (true) {
                if (var3 >= ((di) this).field_a.length) {
                  return -1 + ((di) this).field_a.length;
                } else {
                  if (param1 < ((di) this).field_a[var3] + ((di) this).field_a[var3 - 1] >> -3679423) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final static void a(wb param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var6 = param0.field_f;
          var7 = 0;
          var8 = 65536 / var6;
          param2 = param2 + param0.field_h;
          param5 = param5 + param0.field_c;
          var7 = var7 + param0.field_c * var8;
          var9 = 0;
          var6 = param0.field_b;
          var10 = param0.field_g;
          if (param2 >= vj.field_f) {
            break L0;
          } else {
            var11 = vj.field_f - param2;
            param2 = vj.field_f;
            var9 = var9 + var11;
            var10 = var10 - var11;
            break L0;
          }
        }
        L1: {
          if (var10 + param2 > vj.field_a) {
            var10 = -param2 + vj.field_a;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param5 < vj.field_h) {
            var11 = -param5 + vj.field_h;
            var7 = var7 + var8 * var11;
            param5 = vj.field_h;
            var9 = var9 + param0.field_g * var11;
            var6 = var6 - var11;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (vj.field_b < var6 + param5) {
            var6 = vj.field_b - param5;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var11 = -var10 + vj.field_l;
          var12 = -var10 + param0.field_g;
          var13 = param5 * vj.field_l + param2;
          q.a(vj.field_j, (byte) 122, param3, var13, var6, var10, var8, var7, param0.field_i, var9, var11, var12, param1);
          if (param4 == 13449) {
            break L4;
          } else {
            field_d = null;
            break L4;
          }
        }
    }

    final static void b(int param0) {
        if (null != pc.field_a) {
            pc.field_a.s(-94);
        }
        ti.field_e = new fh();
        vb.field_h.c((lk) (Object) ti.field_e, (byte) 57);
        if (param0 != 1) {
            Object var2 = null;
            di.a((wb) null, -23, -72, 49, -91, 49);
        }
    }

    final static nc a(String param0, int param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        nc var5 = null;
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length() != 0) {
              var2 = param0.indexOf((int) (char)param1);
              if ((var2 ^ -1) == 0) {
                return ec.field_j;
              } else {
                var3 = param0.substring(0, var2);
                var4 = param0.substring(var2 - -1);
                var5 = we.a(var3, 34);
                if (var5 != null) {
                  return var5;
                } else {
                  return n.b(var4, (byte) -117);
                }
              }
            } else {
              break L0;
            }
          }
        }
        return hc.field_b;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            di.b(-101);
        }
        field_d = null;
    }

    di(int param0, int param1, int param2) {
        ((di) this).field_a = new int[1 + param2];
        ((di) this).field_b = param0;
        ((di) this).field_c = param1;
    }

    final static boolean a(byte param0, w param1) {
        if (param0 >= -49) {
            Object var3 = null;
            di.a((wb) null, -19, -90, -105, -40, -114);
        }
        return 1 == param1.g(1, -1) ? true : false;
    }

    static {
    }
}
