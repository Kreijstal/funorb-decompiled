/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends nk {
    byte field_y;
    int field_x;
    fj field_z;
    static String field_A;

    public static void c(int param0) {
        field_A = null;
        if (param0 != 0) {
            field_A = null;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        if (param0 >= -103) {
          field_A = null;
          return wi.a(0, 0, param1.length, param1);
        } else {
          return wi.a(0, 0, param1.length, param1);
        }
    }

    final static int d(byte param0) {
        if (param0 != -97) {
            Object var2 = null;
            ae discarded$0 = ac.a((String) null, -50);
            return jl.field_S;
        }
        return jl.field_S;
    }

    final byte[] c(byte param0) {
        if (param0 > 102) {
          if (!((ac) this).field_r) {
            if (((ac) this).field_z.field_j.length + -((ac) this).field_y > ((ac) this).field_z.field_n) {
              throw new RuntimeException();
            } else {
              return ((ac) this).field_z.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          ((ac) this).field_z = null;
          if (!((ac) this).field_r) {
            if (((ac) this).field_z.field_j.length + -((ac) this).field_y > ((ac) this).field_z.field_n) {
              throw new RuntimeException();
            } else {
              return ((ac) this).field_z.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final static ae a(String param0, int param1) {
        Object var2 = null;
        Object var3 = null;
        ae var3_ref = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        var3 = null;
        var5 = Torquing.field_u;
        if (null != ed.field_c) {
          L0: {
            var7 = (CharSequence) (Object) param0;
            var2 = (Object) (Object) hf.a(var7, 102);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (Object) (Object) var7;
              break L0;
            }
          }
          if (param1 == 0) {
            var3_ref = (ae) (Object) ed.field_c.a((long)((String) var2).hashCode(), param1 + -56);
            L1: while (true) {
              if (var3_ref != null) {
                L2: {
                  var8 = (CharSequence) (Object) var3_ref.field_ob;
                  var4 = hf.a(var8, param1 ^ 118);
                  if (var4 == null) {
                    var4 = var3_ref.field_ob;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!var4.equals(var2)) {
                  var3_ref = (ae) (Object) ed.field_c.b(-1);
                  continue L1;
                } else {
                  return var3_ref;
                }
              } else {
                return null;
              }
            }
          } else {
            field_A = null;
            var3_ref = (ae) (Object) ed.field_c.a((long)((String) var2).hashCode(), param1 + -56);
            L3: while (true) {
              if (var3_ref != null) {
                L4: {
                  var9 = (CharSequence) (Object) var3_ref.field_ob;
                  var4 = hf.a(var9, param1 ^ 118);
                  if (var4 == null) {
                    var4 = var3_ref.field_ob;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (!var4.equals(var2)) {
                  var3_ref = (ae) (Object) ed.field_c.b(-1);
                  continue L3;
                } else {
                  return var3_ref;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final int b(int param0) {
        if (param0 < 91) {
            ((ac) this).field_x = -38;
            if (!(((ac) this).field_z != null)) {
                return 0;
            }
            return 100 * ((ac) this).field_z.field_n / (((ac) this).field_z.field_j.length - ((ac) this).field_y);
        }
        if (!(((ac) this).field_z != null)) {
            return 0;
        }
        return 100 * ((ac) this).field_z.field_n / (((ac) this).field_z.field_j.length - ((ac) this).field_y);
    }

    ac() {
    }

    final static boolean a(fj param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var2 = param0.i((byte) -101);
          if ((var2 ^ -1) == -2) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param1 != 28066) {
          var4 = null;
          boolean discarded$2 = ac.a((fj) null, -59);
          return var3 != 0;
        } else {
          return var3 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Loading music";
    }
}
