/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rha implements ntb {
    int field_b;
    int field_e;
    int field_c;
    int field_a;
    static int field_d;

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        rha var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var3 = 79 / ((param0 - 22) / 59);
        var4 = (rha) (Object) param1;
        if (var4.field_a == var4.field_a) {
          if (var4.field_e == var4.field_e) {
            if (var4.field_b == var4.field_b) {
              if (var4.field_c != var4.field_c) {
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

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          if (ob.field_j > param1) {
            break L0;
          } else {
            if (param1 <= mt.field_o) {
              param4 = ksa.a(31123, lua.field_c, hab.field_i, param4);
              param3 = ksa.a(31123, lua.field_c, hab.field_i, param3);
              sk.a(-105, param4, param1, param3, param2);
              break L0;
            } else {
              if (param0 <= -18) {
                return;
              } else {
                rha.a(72, 80, 26, 93, -92);
                return;
              }
            }
          }
        }
        if (param0 > -18) {
          rha.a(72, 80, 26, 93, -92);
          return;
        } else {
          return;
        }
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((rha) this).field_a, 32);
        param0.a(-632, ((rha) this).field_e, 8);
        param0.a(-632, 1 + ((rha) this).field_b, 8);
        param0.a(-632, 1 + ((rha) this).field_c, 8);
        if (param1 >= -109) {
            Object var4 = null;
            boolean discarded$0 = ((rha) this).a((byte) -115, (tv) null);
        }
    }

    final static float a(float param0, float param1, int param2, float param3, byte param4) {
        float[] var5 = null;
        float[] var6 = null;
        if (param4 <= 53) {
          return 0.2956068813800812f;
        } else {
          var6 = cn.field_a[param2];
          var5 = var6;
          return param3 * var6[1] + var6[0] * param1 + param0 * var6[2];
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var6 = null;
        rha var6_ref = null;
        rha var7 = null;
        var6 = null;
        if (param1 > -19) {
          L0: {
            ((rha) this).field_e = 92;
            var6_ref = (rha) (Object) param0;
            var4 = 0;
            if (var6_ref.field_a != var6_ref.field_a) {
              var4 = 1;
              System.out.println("int tick has changed. before=" + var6_ref.field_a + ", now=" + var6_ref.field_a);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var6_ref.field_e != var6_ref.field_e) {
              var4 = 1;
              System.out.println("int string_id has changed. before=" + var6_ref.field_e + ", now=" + var6_ref.field_e);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var6_ref.field_b != var6_ref.field_b) {
              var4 = 1;
              System.out.println("int a_id has changed. before=" + var6_ref.field_b + ", now=" + var6_ref.field_b);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var6_ref.field_c != var6_ref.field_c) {
              var4 = 1;
              System.out.println("int b_id has changed. before=" + var6_ref.field_c + ", now=" + var6_ref.field_c);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var4 != 0) {
              System.out.println("This instance of Message has changed");
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          L5: {
            var7 = (rha) (Object) param0;
            var4 = 0;
            if (var7.field_a != ((rha) var6).field_a) {
              var4 = 1;
              System.out.println("int tick has changed. before=" + var7.field_a + ", now=" + ((rha) var6).field_a);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (((rha) var6).field_e != var7.field_e) {
              var4 = 1;
              System.out.println("int string_id has changed. before=" + var7.field_e + ", now=" + ((rha) var6).field_e);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (var7.field_b != ((rha) var6).field_b) {
              var4 = 1;
              System.out.println("int a_id has changed. before=" + var7.field_b + ", now=" + ((rha) var6).field_b);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (((rha) var6).field_c != var7.field_c) {
              var4 = 1;
              System.out.println("int b_id has changed. before=" + var7.field_c + ", now=" + ((rha) var6).field_c);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (var4 != 0) {
              System.out.println("This instance of Message has changed");
              break L9;
            } else {
              break L9;
            }
          }
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        rha var5 = null;
        rha var6 = null;
        var5 = (rha) (Object) param1;
        var6 = var5;
        var6.field_a = var5.field_a;
        var6.field_e = var5.field_e;
        if (param0 <= 54) {
          return;
        } else {
          var6.field_b = var5.field_b;
          var6.field_c = var5.field_c;
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        ((rha) this).field_a = param0.i(0, 32);
        ((rha) this).field_e = param0.i(0, 8);
        if (param1) {
          return;
        } else {
          ((rha) this).field_b = param0.i(0, 8) - 1;
          ((rha) this).field_c = -1 + param0.i(0, 8);
          return;
        }
    }

    rha() {
    }

    rha(int param0, int param1, int param2) {
        ((rha) this).field_e = param0;
        ((rha) this).field_c = param2;
        ((rha) this).field_b = param1;
    }

    static {
    }
}
