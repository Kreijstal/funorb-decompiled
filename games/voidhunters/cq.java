/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends ksa implements ntb {
    int field_f;
    int field_d;
    int field_g;
    int field_e;

    public final void b(byte param0, tv param1) {
        cq var5 = null;
        cq var5_ref = null;
        cq var6 = null;
        cq var8 = null;
        cq var11 = null;
        var5 = null;
        if (param0 < 54) {
          ((cq) this).field_g = 98;
          var5_ref = (cq) (Object) param1;
          var6 = var5_ref;
          var5 = var6;
          var6.field_g = var5.field_g;
          var6.field_e = var5.field_e;
          var6.field_f = var5.field_f;
          var6.field_d = var5.field_d;
          return;
        } else {
          var11 = (cq) (Object) param1;
          var5 = var11;
          var8 = var11;
          var8.field_g = var11.field_g;
          var8.field_e = var11.field_e;
          var8.field_f = var11.field_f;
          var8.field_d = var11.field_d;
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        if (param2 == -98) {
          if (((cq) this).field_f <= param1) {
            if (param0 >= ((cq) this).field_g) {
              if (param1 < ((cq) this).field_f + ((cq) this).field_e) {
                if (param0 >= ((cq) this).field_g - -((cq) this).field_d) {
                  return false;
                } else {
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
          return true;
        }
    }

    public final void a(faa param0, boolean param1) {
        ((cq) this).field_f = param0.i(0, 32);
        ((cq) this).field_g = param0.i(0, 32);
        ((cq) this).field_e = param0.i(0, 32);
        ((cq) this).field_d = param0.i(0, 32);
        if (param1) {
            boolean discarded$0 = ((cq) this).a(64, 118, (byte) 59);
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        cq var5 = null;
        L0: {
          var5 = (cq) (Object) param0;
          var4 = 0;
          if (var5.field_f != var5.field_f) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.field_f + ", now=" + var5.field_f);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var5.field_g != var5.field_g) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.field_g + ", now=" + var5.field_g);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var5.field_e == var5.field_e) {
            break L2;
          } else {
            var4 = 1;
            System.out.println("int width has changed. before=" + var5.field_e + ", now=" + var5.field_e);
            break L2;
          }
        }
        L3: {
          if (var5.field_d == var5.field_d) {
            break L3;
          } else {
            System.out.println("int height has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            var4 = 1;
            break L3;
          }
        }
        if (param1 >= -19) {
          return;
        } else {
          L4: {
            if (var4 == 0) {
              break L4;
            } else {
              System.out.println("This instance of MapZone has changed");
              break L4;
            }
          }
          return;
        }
    }

    public final void b(faa param0, int param1) {
        Object var4 = null;
        param0.a(-632, ((cq) this).field_f, 32);
        param0.a(-632, ((cq) this).field_g, 32);
        param0.a(-632, ((cq) this).field_e, 32);
        if (param1 > -109) {
          var4 = null;
          ((cq) this).a(-77, 104, (lta) null);
          param0.a(-632, ((cq) this).field_d, 32);
          return;
        } else {
          param0.a(-632, ((cq) this).field_d, 32);
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        cq var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var3 = (cq) (Object) param1;
        var4 = 86 % ((param0 - 22) / 59);
        if (var3.field_f == var3.field_f) {
          if (var3.field_g == var3.field_g) {
            if (var3.field_e == var3.field_e) {
              if (var3.field_d != var3.field_d) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, lta param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var4 = param2.a(((cq) this).field_f, (byte) 126);
        var5 = param2.b(true, ((cq) this).field_g);
        if (param0 != 32) {
          var8 = null;
          ((cq) this).b((faa) null, 76);
          var6 = param2.a(((cq) this).field_e + ((cq) this).field_f, (byte) 125);
          var7 = param2.b(true, ((cq) this).field_d + ((cq) this).field_g);
          ga.a(64, false, var4, var5, -var5 + var7, -var4 + var6, param1);
          uv.a(112, var4, -var5 + var7, var5, param1, -var4 + var6);
          return;
        } else {
          var6 = param2.a(((cq) this).field_e + ((cq) this).field_f, (byte) 125);
          var7 = param2.b(true, ((cq) this).field_d + ((cq) this).field_g);
          ga.a(64, false, var4, var5, -var5 + var7, -var4 + var6, param1);
          uv.a(112, var4, -var5 + var7, var5, param1, -var4 + var6);
          return;
        }
    }

    cq() {
    }

    cq(int param0, int param1) {
        ((cq) this).field_d = 65536;
        ((cq) this).field_f = param0;
        ((cq) this).field_g = param1;
        ((cq) this).field_e = 65536;
    }

    static {
    }
}
