/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo extends vh {
    private vh field_Nb;
    static vh field_Lb;
    vh field_Pb;
    static int field_Qb;
    static String field_Ob;
    static vh[] field_Mb;

    final int a(int param0, int param1, int param2) {
        if (param0 != 0) {
            return -21;
        }
        int var4 = -param1;
        int var5 = -param1;
        if (null != ((uo) this).field_Nb) {
            var4 = ((uo) this).field_Nb.b(true);
        }
        if (((uo) this).field_Pb != null) {
            var5 = ((uo) this).field_Pb.b(true);
        }
        return var5 + (param2 - -var4) + param1 - -param2;
    }

    uo(long param0, vh param1, vh param2, vh param3, dd param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((uo) this).field_Nb = new vh(0L, param2);
            ((uo) this).field_Nb.field_hb = param4;
            ((uo) this).a(-99, ((uo) this).field_Nb);
        }
        if (param5 != null) {
            ((uo) this).field_Pb = new vh(0L, param3, param5);
            ((uo) this).a(92, ((uo) this).field_Pb);
        }
        ((uo) this).d((byte) -125);
    }

    final static void f(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        oq var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        tq var11 = null;
        i var12 = null;
        oq var13 = null;
        tq var14 = null;
        L0: {
          var8 = Pool.field_O;
          var13 = kn.field_e;
          var2 = var13.g(-94);
          if (param0 < -102) {
            break L0;
          } else {
            uo.f(44);
            break L0;
          }
        }
        L1: {
          if (0 != var2) {
            if ((var2 ^ -1) == -2) {
              var12 = (i) (Object) ue.field_b.c((byte) -19);
              if (var12 != null) {
                var12.a((byte) -117);
                break L1;
              } else {
                dn.c(-69);
                return;
              }
            } else {
              if (2 == var2) {
                var14 = (tq) (Object) hb.field_j.c((byte) -112);
                if (var14 == null) {
                  dn.c(-81);
                  return;
                } else {
                  var14.field_l = ek.a(117);
                  var14.field_s = true;
                  var14.a((byte) -117);
                  break L1;
                }
              } else {
                tc.a((Throwable) null, "A1: " + t.a(99), -8555);
                dn.c(84);
                break L1;
              }
            }
          } else {
            var10 = ek.a(121);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((ge) (Object) var5).g(-101);
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                var11 = (tq) (Object) hb.field_j.c((byte) 77);
                if (var11 == null) {
                  dn.c(-107);
                  return;
                } else {
                  var11.field_l = var3;
                  var11.field_s = true;
                  var11.a((byte) -117);
                  break L1;
                }
              } else {
                var9[var7] = ((ge) (Object) var5).b(true);
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    public static void f(byte param0) {
        field_Ob = null;
        if (param0 != -102) {
            uo.c(true);
        }
        field_Mb = null;
        field_Lb = null;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        ((uo) this).b(param6, 2147483647, param0, param5, param3);
        this.a(param4, (byte) -97, param2);
        if (!param1) {
            this.a(-47, (byte) 126, 26);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = -param0;
          if (((uo) this).field_Nb == null) {
            break L0;
          } else {
            var4 = ((uo) this).field_Nb.b(true);
            break L0;
          }
        }
        L1: {
          var5 = -param0;
          if (((uo) this).field_Pb != null) {
            var5 = ((uo) this).field_Pb.a(-100, -param2 + (-param0 + ((uo) this).field_gb + (-param2 + -var4)));
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = param2 + (param0 + var4 + (param2 - -var5));
          if (var6 <= ((uo) this).field_gb) {
            break L2;
          } else {
            var5 = var5 + (((uo) this).field_gb + -var6);
            var6 = ((uo) this).field_gb;
            break L2;
          }
        }
        L3: {
          if (-2 != (((uo) this).field_Fb ^ -1)) {
            break L3;
          } else {
            param2 = param2 + (-var6 + ((uo) this).field_gb) / 2;
            break L3;
          }
        }
        L4: {
          if (2 != ((uo) this).field_Fb) {
            break L4;
          } else {
            param2 = param2 + (-var6 + ((uo) this).field_gb);
            break L4;
          }
        }
        L5: {
          if (((uo) this).field_Nb == null) {
            break L5;
          } else {
            ((uo) this).field_Nb.b(0, 2147483647, param2, var4, ((uo) this).field_Db);
            ((uo) this).field_Nb.field_cb = ((uo) this).field_cb;
            break L5;
          }
        }
        L6: {
          if (((uo) this).field_Pb != null) {
            L7: {
              ((uo) this).field_Pb.b(0, 2147483647, param0 + param2 + var4, var5, ((uo) this).field_Db);
              if (((uo) this).field_Nb != null) {
                ((uo) this).field_Pb.field_Fb = 0;
                break L7;
              } else {
                ((uo) this).field_Pb.field_Fb = ((uo) this).field_Fb;
                break L7;
              }
            }
            ((uo) this).field_Pb.field_cb = ((uo) this).field_cb;
            break L6;
          } else {
            break L6;
          }
        }
        L8: {
          if (param1 <= -78) {
            break L8;
          } else {
            ((uo) this).field_Pb = null;
            break L8;
          }
        }
    }

    final static void c(boolean param0) {
        aa var1 = null;
        lk var2 = null;
        if (!ne.field_r.c(0)) {
          L0: {
            var1 = new aa(ne.field_r);
            var2 = (lk) (Object) var1.b((byte) -92);
            if (var2.field_v) {
              var2.field_q = 16;
              break L0;
            } else {
              break L0;
            }
          }
          L1: while (true) {
            if (var2 == null) {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  uo.f((byte) 125);
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (!var2.field_v) {
                  break L3;
                } else {
                  if ((var2.field_p ^ -1) <= -231) {
                    var2.a((byte) -117);
                    break L3;
                  } else {
                    var2 = (lk) (Object) var1.b(-117);
                    continue L1;
                  }
                }
              }
              var2 = (lk) (Object) var1.b(-117);
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = "<%0>: Ball-in-hand!";
        field_Qb = -1;
    }
}
