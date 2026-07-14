/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends rna implements ntb {
    private int field_b;
    private int field_c;
    static String field_a;

    final static void d(int param0) {
        if (!(efb.field_b == null)) {
            efb.field_b.field_b = false;
        }
        mb.h(param0, param0 + 101);
    }

    final int a(int param0, int param1) {
        if (param1 < -100) {
          if (param0 == 0) {
            return ((cf) this).field_b;
          } else {
            return ((cf) this).field_c;
          }
        } else {
          field_a = null;
          if (param0 == 0) {
            return ((cf) this).field_b;
          } else {
            return ((cf) this).field_c;
          }
        }
    }

    public static void c(int param0) {
        field_a = null;
        int var1 = -42 / ((param0 - 27) / 47);
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        cf var5 = null;
        L0: {
          super.a(param0, -87);
          var5 = (cf) (Object) param0;
          var4 = 0;
          if (var5.field_b == var5.field_b) {
            break L0;
          } else {
            var4 = 1;
            System.out.println("int index has changed. before=" + var5.field_b + ", now=" + var5.field_b);
            break L0;
          }
        }
        L1: {
          if (var5.field_c == var5.field_c) {
            break L1;
          } else {
            System.out.println("int label has changed. before=" + var5.field_c + ", now=" + var5.field_c);
            var4 = 1;
            break L1;
          }
        }
        if (param1 >= -19) {
          return;
        } else {
          L2: {
            if (var4 != 0) {
              System.out.println("This instance of MissionActionSetCustomVariableLabel has changed");
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final String a(int param0) {
        String var2 = null;
        String var2_ref = null;
        if (param0 != -1325) {
          L0: {
            field_a = null;
            var2 = Integer.toString(((cf) this).field_c);
            if (((cf) this).field_c < 0) {
              break L0;
            } else {
              if (((cf) this).field_c >= pu.field_c.length) {
                break L0;
              } else {
                var2_ref = pu.field_c[((cf) this).field_c];
                break L0;
              }
            }
          }
          return "Set label of custom variable " + ((cf) this).field_b + " to " + var2_ref;
        } else {
          L1: {
            var2 = Integer.toString(((cf) this).field_c);
            if (((cf) this).field_c < 0) {
              break L1;
            } else {
              if (((cf) this).field_c >= pu.field_c.length) {
                break L1;
              } else {
                var2_ref = pu.field_c[((cf) this).field_c];
                break L1;
              }
            }
          }
          return "Set label of custom variable " + ((cf) this).field_b + " to " + var2_ref;
        }
    }

    final void a(int param0, int[] param1, rsb param2) {
        et var6 = null;
        et var7 = null;
        et var9 = null;
        if (param0 != 1) {
          L0: {
            ((cf) this).field_c = 117;
            var6 = param2.field_e.c(-1, ((cf) this).field_b);
            var7 = var6;
            var6 = var7;
            if (var7 != null) {
              var7.field_b = ((cf) this).field_c;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var6 = param2.field_e.c(-1, ((cf) this).field_b);
            var9 = var6;
            if (var9 != null) {
              var9.field_b = ((cf) this).field_c;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -111);
        param0.a(-632, ((cf) this).field_b, 32);
        param0.a(-632, ((cf) this).field_c, 32);
        if (param1 >= -109) {
            cf.c(48);
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        Object var6 = null;
        if (param2 == 0) {
          ((cf) this).field_b = param3;
          if ((((cf) this).field_b ^ -1) > -1) {
            ((cf) this).field_b = 0;
            if (param1) {
              var6 = null;
              ucb discarded$8 = ((cf) this).a((pe) null, -77);
              return;
            } else {
              return;
            }
          } else {
            if (param1) {
              var6 = null;
              ucb discarded$9 = ((cf) this).a((pe) null, -77);
              return;
            } else {
              return;
            }
          }
        } else {
          ((cf) this).field_c = param3;
          if (((cf) this).field_c < 0) {
            ((cf) this).field_c = (((cf) this).field_c - -pu.field_c.length) % pu.field_c.length;
            if (!param1) {
              return;
            } else {
              var6 = null;
              ucb discarded$10 = ((cf) this).a((pe) null, -77);
              return;
            }
          } else {
            if (!param1) {
              return;
            } else {
              var6 = null;
              ucb discarded$11 = ((cf) this).a((pe) null, -77);
              return;
            }
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((cf) this).field_b = param0.i(0, 32);
        ((cf) this).field_c = param0.i(0, 32);
    }

    public final boolean a(byte param0, tv param1) {
        cf var3 = null;
        int var4 = 0;
        var4 = -11 % ((22 - param0) / 59);
        var3 = (cf) (Object) param1;
        if (!super.a((byte) 96, param1)) {
          if (var3.field_b == var3.field_b) {
            if (var3.field_c != var3.field_c) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    cf() {
    }

    cf(int param0, int param1) {
        ((cf) this).field_b = param0;
        ((cf) this).field_c = param1;
    }

    final static void b(int param0) {
        msa.field_s = brb.f((byte) 62);
        qn.field_h = new ida();
        lva.e((byte) 117);
        if (param0 != 32) {
            cf.b(3);
        }
    }

    public final void b(byte param0, tv param1) {
        cf var5 = null;
        cf var5_ref = null;
        cf var6 = null;
        cf var8 = null;
        cf var11 = null;
        var5 = null;
        if (param0 <= 54) {
          field_a = null;
          var5_ref = (cf) (Object) param1;
          var6 = var5_ref;
          var5 = var6;
          super.b((byte) 110, param1);
          var6.field_c = var5.field_c;
          var6.field_b = var5.field_b;
          return;
        } else {
          var11 = (cf) (Object) param1;
          var5 = var11;
          var8 = var11;
          super.b((byte) 110, param1);
          var8.field_c = var11.field_c;
          var8.field_b = var11.field_b;
          return;
        }
    }

    final ucb a(pe param0, int param1) {
        if (param1 == 26964) {
            return null;
        }
        ((cf) this).field_c = -111;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You need to be in the main menu or sandbox mode to load ships";
    }
}
