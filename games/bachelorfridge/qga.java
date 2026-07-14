/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qga extends td {
    static String field_q;
    static kv field_r;
    static int[] field_p;
    static String field_s;

    qga(int param0, aga param1, nq param2) {
        super(param0, param1);
        ((qga) this).field_j = param2;
    }

    private final boolean a(op param0, int param1, aga param2, ct param3, byte param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        var8 = 0;
        L0: while (true) {
          if (param6 <= var8) {
            if (param4 != -90) {
              return false;
            } else {
              return false;
            }
          } else {
            if (this.a(param1 + -var8, param5 - param6 - -var8, param2, true, param3, param0)) {
              return true;
            } else {
              if (this.a(param1 - -var8, param6 + (param5 - var8), param2, true, param3, param0)) {
                return true;
              } else {
                if (!this.a(-param6 + (param1 - -var8), var8 + param5, param2, true, param3, param0)) {
                  if (!this.a(param1 - -param6 - var8, -var8 + param5, param2, true, param3, param0)) {
                    var8++;
                    continue L0;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    private final boolean a(op param0, int param1, int param2, aga param3, int param4) {
        int var6 = 0;
        if ((param2 ^ -1) <= -1) {
          if (param2 < param0.field_z) {
            if (param1 >= 0) {
              if (param1 < param0.field_B) {
                if (param3.a(param0.field_a[param2][param1].field_n, false)) {
                  if (null != param0.field_a[param2][param1].field_l) {
                    return false;
                  } else {
                    var6 = 24 % ((-15 - param4) / 32);
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final boolean a(int param0, int param1, aga param2, boolean param3, ct param4, op param5) {
        if (!(this.a(param5, param0, param1, param2, 79))) {
            return false;
        }
        if (!param3) {
            Object var8 = null;
            ii discarded$0 = ((qga) this).a((op) null, 4);
        }
        param4.field_o.a((bw) (Object) new bj(new nq(param2), param1, param0), param3);
        return true;
    }

    final ii a(op param0, int param1) {
        ct var4 = null;
        aga var5 = null;
        int var6 = 0;
        iv var7 = null;
        int var8 = 0;
        Object var9 = null;
        aga var10 = null;
        aga var11 = null;
        aga var12 = null;
        var8 = BachelorFridge.field_y;
        var10 = ((qga) this).field_h.a(77, param0);
        var4 = new ct(((qga) this).field_g, new nq(var10));
        if (param1 == 3) {
          var12 = ((qga) this).field_j.a(79, param0);
          var5 = var12;
          if (var12 != null) {
            if (!var12.i(param1 + -109)) {
              var6 = 1;
              L0: while (true) {
                if (8 > var6) {
                  if (this.a(param0, var10.field_J, var12, var4, (byte) -90, var10.field_x, var6)) {
                    var7 = new iv(((qga) this).field_j, false, 1, 20, 0);
                    var4.field_o.a((bw) (Object) var7, true);
                    return (ii) (Object) var4;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  return (ii) (Object) var4;
                }
              }
            } else {
              return (ii) (Object) new ew(new nq(var10));
            }
          } else {
            return (ii) (Object) new ew(new nq(var10));
          }
        } else {
          var9 = null;
          boolean discarded$1 = this.a((op) null, -99, -115, (aga) null, -106);
          var11 = ((qga) this).field_j.a(79, param0);
          var5 = var11;
          if (var11 != null) {
            if (!var11.i(param1 + -109)) {
              var6 = 1;
              L1: while (true) {
                if (8 > var6) {
                  if (this.a(param0, var10.field_J, var11, var4, (byte) -90, var10.field_x, var6)) {
                    var7 = new iv(((qga) this).field_j, false, 1, 20, 0);
                    var4.field_o.a((bw) (Object) var7, true);
                    return (ii) (Object) var4;
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  return (ii) (Object) var4;
                }
              }
            } else {
              return (ii) (Object) new ew(new nq(var10));
            }
          } else {
            return (ii) (Object) new ew(new nq(var10));
          }
        }
    }

    public static void c(byte param0) {
        field_s = null;
        field_r = null;
        field_p = null;
        if (param0 >= -42) {
            field_r = null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "<%0> is not on your friend list.";
        field_s = "Delete";
        field_p = new int[]{50, 7, 7, 5, 6, 6, 6, 7, 6};
    }
}
