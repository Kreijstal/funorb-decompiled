/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    private vh field_f;
    static boolean field_a;
    private vh field_d;
    static rj field_b;
    static String field_e;
    static int[] field_c;

    final static void a(byte param0, String param1, String param2) {
        L0: {
          if (nb.field_b != null) {
            nb.field_b.h((byte) -126);
            break L0;
          } else {
            break L0;
          }
        }
        mb.field_s = new uh(param2, param1, false, true, true);
        if (param0 != -93) {
          field_e = null;
          bj.field_f.a((gl) (Object) mb.field_s, param0 + 12);
          return;
        } else {
          bj.field_f.a((gl) (Object) mb.field_s, param0 + 12);
          return;
        }
    }

    final int a(boolean param0) {
        int var2 = 0;
        vh var3 = null;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        var2 = 0;
        if (param0) {
          field_b = null;
          var3 = ((hl) this).field_f.field_o;
          L0: while (true) {
            if (((hl) this).field_f == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_o;
              continue L0;
            }
          }
        } else {
          var3 = ((hl) this).field_f.field_o;
          L1: while (true) {
            if (((hl) this).field_f == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_o;
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 <= 38) {
            hl.b(-70);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final vh a(byte param0) {
        vh var2 = null;
        if (param0 <= -28) {
          var2 = ((hl) this).field_f.field_o;
          if (((hl) this).field_f == var2) {
            return null;
          } else {
            var2.c((byte) 13);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static ci[] a(byte param0, int param1, int param2, int param3) {
        int var4 = -125 / ((param0 - -29) / 46);
        return be.a(80, param3, param1, 1, param2);
    }

    final void a(int param0, vh param1) {
        if (param1.field_i == null) {
          if (param0 != 11152) {
            ((hl) this).field_d = null;
            param1.field_o = ((hl) this).field_f;
            param1.field_i = ((hl) this).field_f.field_i;
            param1.field_i.field_o = param1;
            param1.field_o.field_i = param1;
            return;
          } else {
            param1.field_o = ((hl) this).field_f;
            param1.field_i = ((hl) this).field_f.field_i;
            param1.field_i.field_o = param1;
            param1.field_o.field_i = param1;
            return;
          }
        } else {
          param1.c((byte) 13);
          if (param0 == 11152) {
            param1.field_o = ((hl) this).field_f;
            param1.field_i = ((hl) this).field_f.field_i;
            param1.field_i.field_o = param1;
            param1.field_o.field_i = param1;
            return;
          } else {
            ((hl) this).field_d = null;
            param1.field_o = ((hl) this).field_f;
            param1.field_i = ((hl) this).field_f.field_i;
            param1.field_i.field_o = param1;
            param1.field_o.field_i = param1;
            return;
          }
        }
    }

    final static ci a(fa param0, int param1, byte param2, int param3) {
        int var4 = 0;
        var4 = -49 % ((param2 - 44) / 37);
        if (!vh.a(param3, param1, param0, true)) {
          return null;
        } else {
          return mc.a((byte) 113);
        }
    }

    public hl() {
        ((hl) this).field_f = new vh();
        ((hl) this).field_f.field_o = ((hl) this).field_f;
        ((hl) this).field_f.field_i = ((hl) this).field_f;
    }

    final vh a(int param0) {
        vh var2 = null;
        var2 = ((hl) this).field_d;
        if (var2 == ((hl) this).field_f) {
          ((hl) this).field_d = null;
          return null;
        } else {
          ((hl) this).field_d = var2.field_o;
          if (param0 != 6273) {
            field_b = null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final vh c(int param0) {
        vh var2 = null;
        var2 = ((hl) this).field_f.field_o;
        if (param0 == 8192) {
          if (((hl) this).field_f == var2) {
            ((hl) this).field_d = null;
            return null;
          } else {
            ((hl) this).field_d = var2.field_o;
            return var2;
          }
        } else {
          field_a = false;
          if (((hl) this).field_f == var2) {
            ((hl) this).field_d = null;
            return null;
          } else {
            ((hl) this).field_d = var2.field_o;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_b = new rj();
        field_e = "This entry doesn't match";
        field_c = new int[8192];
    }
}
