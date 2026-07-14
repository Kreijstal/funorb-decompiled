/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uoa extends rna implements ntb {
    private int field_b;
    private int field_a;

    public final boolean a(byte param0, tv param1) {
        uoa var3 = null;
        int var4 = 0;
        var4 = -126 / ((param0 - 22) / 59);
        var3 = (uoa) (Object) param1;
        if (!super.a((byte) -48, param1)) {
          if (var3.field_a == var3.field_a) {
            if (var3.field_b != var3.field_b) {
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

    final static boolean a(int param0, int param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != 9) {
          L0: {
            boolean discarded$13 = uoa.a(14, -116, 46);
            if (0 == (256 & param1)) {
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
            if (0 == (256 & param1)) {
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

    final static void a(String param0, int param1, float param2) {
        dkb.field_b = param2;
        if (param1 != -1) {
            return;
        }
        mnb.field_g = param0;
    }

    final ucb a(pe param0, int param1) {
        if (param1 == 26964) {
            return null;
        }
        Object var4 = null;
        boolean discarded$0 = ((uoa) this).a((byte) -70, (tv) null);
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 == 0) {
          if (li.field_i) {
            mmb.field_d[param0].a(param4, param2, 0, 16777215 | param1 << -1670038792, 1);
            return;
          } else {
            return;
          }
        } else {
          boolean discarded$8 = uoa.a(125, 2, 96);
          if (!li.field_i) {
            return;
          } else {
            mmb.field_d[param0].a(param4, param2, 0, 16777215 | param1 << -1670038792, 1);
            return;
          }
        }
    }

    final void a(int param0, int[] param1, rsb param2) {
        if (param0 != 1) {
          ((uoa) this).field_a = 84;
          param2.field_e.a((byte) -45, ((uoa) this).field_b, ((uoa) this).field_a);
          return;
        } else {
          param2.field_e.a((byte) -45, ((uoa) this).field_b, ((uoa) this).field_a);
          return;
        }
    }

    final String a(int param0) {
        if (param0 != -1325) {
          return null;
        } else {
          return "Increment custom variable " + ((uoa) this).field_a + " by " + ((uoa) this).field_b;
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((uoa) this).field_a = param0.i(0, 32);
        ((uoa) this).field_b = param0.i(0, 32);
    }

    public final void b(byte param0, tv param1) {
        uoa var5 = null;
        uoa var6 = null;
        var5 = (uoa) (Object) param1;
        var6 = var5;
        super.b((byte) 79, param1);
        if (param0 < 54) {
          ((uoa) this).field_a = 86;
          var6.field_a = ((uoa) this).field_a;
          var6.field_b = ((uoa) this).field_b;
          return;
        } else {
          var6.field_a = ((uoa) this).field_a;
          var6.field_b = ((uoa) this).field_b;
          return;
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        if (param2 != -1) {
          ((uoa) this).field_b = param3;
          if (param1) {
            String discarded$6 = ((uoa) this).a(34);
            return;
          } else {
            return;
          }
        } else {
          ((uoa) this).field_a = param3;
          if (-1 > ((uoa) this).field_a) {
            ((uoa) this).field_a = 0;
            if (!param1) {
              return;
            } else {
              String discarded$7 = ((uoa) this).a(34);
              return;
            }
          } else {
            if (!param1) {
              return;
            } else {
              String discarded$8 = ((uoa) this).a(34);
              return;
            }
          }
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        uoa var5 = null;
        super.a(param0, -23);
        if (param1 <= -19) {
          L0: {
            var5 = (uoa) (Object) param0;
            var4 = 0;
            if (var5.field_a != var5.field_a) {
              var4 = 1;
              System.out.println("int index has changed. before=" + var5.field_a + ", now=" + var5.field_a);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var5.field_b != var5.field_b) {
              var4 = 1;
              System.out.println("int value_added has changed. before=" + var5.field_b + ", now=" + var5.field_b);
              break L1;
            } else {
              break L1;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionActionAddToCustomVariable has changed");
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
            return -14;
        }
        if (-1 == (param0 ^ -1)) {
            return ((uoa) this).field_a;
        }
        return ((uoa) this).field_b;
    }

    public final void b(faa param0, int param1) {
        Object var4 = null;
        super.b(param0, -118);
        param0.a(-632, ((uoa) this).field_a, 32);
        if (param1 > -109) {
          var4 = null;
          boolean discarded$2 = ((uoa) this).a((byte) 32, (tv) null);
          param0.a(-632, ((uoa) this).field_b, 32);
          return;
        } else {
          param0.a(-632, ((uoa) this).field_b, 32);
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 < 74) {
            return true;
        }
        return (33 & param1 ^ -1) != -1 ? true : false;
    }

    uoa() {
    }

    uoa(int param0, int param1) {
        ((uoa) this).field_b = param1;
        ((uoa) this).field_a = param0;
    }

    static {
    }
}
