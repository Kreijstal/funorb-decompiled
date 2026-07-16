/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static String field_a;
    static int field_c;
    static long field_b;
    private ah field_d;
    static bk field_f;
    private ah field_g;
    static String field_e;

    final int b(byte param0) {
        int var2 = 0;
        ah var3 = null;
        int var4 = 0;
        var4 = stellarshard.field_B;
        var2 = 0;
        var3 = ((al) this).field_d.field_m;
        if (param0 == -7) {
          L0: while (true) {
            if (((al) this).field_d == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_m;
              continue L0;
            }
          }
        } else {
          field_c = -85;
          L1: while (true) {
            if (((al) this).field_d == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_m;
              continue L1;
            }
          }
        }
    }

    final ah a(byte param0) {
        ah var2 = null;
        var2 = ((al) this).field_d.field_m;
        if (param0 >= 57) {
          if (var2 == ((al) this).field_d) {
            return null;
          } else {
            var2.c((byte) 36);
            return var2;
          }
        } else {
          field_e = null;
          if (var2 == ((al) this).field_d) {
            return null;
          } else {
            var2.c((byte) 36);
            return var2;
          }
        }
    }

    final void a(byte param0, ah param1) {
        if (param1.field_l == null) {
          param1.field_l = ((al) this).field_d.field_l;
          param1.field_m = ((al) this).field_d;
          if (param0 < 122) {
            ah discarded$2 = ((al) this).a(-109);
            param1.field_l.field_m = param1;
            param1.field_m.field_l = param1;
            return;
          } else {
            param1.field_l.field_m = param1;
            param1.field_m.field_l = param1;
            return;
          }
        } else {
          param1.c((byte) 36);
          param1.field_l = ((al) this).field_d.field_l;
          param1.field_m = ((al) this).field_d;
          if (param0 >= 122) {
            param1.field_l.field_m = param1;
            param1.field_m.field_l = param1;
            return;
          } else {
            ah discarded$3 = ((al) this).a(-109);
            param1.field_l.field_m = param1;
            param1.field_m.field_l = param1;
            return;
          }
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
    }

    final ah a(int param0) {
        ah var2 = null;
        if (param0 <= -94) {
          var2 = ((al) this).field_g;
          if (var2 == ((al) this).field_d) {
            ((al) this).field_g = null;
            return null;
          } else {
            ((al) this).field_g = var2.field_m;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void b(boolean param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = stellarshard.field_B;
        var7 = gg.field_h;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        var2 = 0;
        if (!param0) {
          var3 = var7.length;
          L0: while (true) {
            if (var3 > var2) {
              int incrementValue$40 = var2;
              var2++;
              var5[incrementValue$40] = 0;
              int incrementValue$41 = var2;
              var2++;
              var5[incrementValue$41] = 0;
              int incrementValue$42 = var2;
              var2++;
              var5[incrementValue$42] = 0;
              int incrementValue$43 = var2;
              var2++;
              var5[incrementValue$43] = 0;
              int incrementValue$44 = var2;
              var2++;
              var5[incrementValue$44] = 0;
              int incrementValue$45 = var2;
              var2++;
              var5[incrementValue$45] = 0;
              int incrementValue$46 = var2;
              var2++;
              var5[incrementValue$46] = 0;
              int incrementValue$47 = var2;
              var2++;
              var5[incrementValue$47] = 0;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_e = null;
          var3 = var7.length;
          L1: while (true) {
            if (var3 > var2) {
              int incrementValue$48 = var2;
              var2++;
              var5[incrementValue$48] = 0;
              int incrementValue$49 = var2;
              var2++;
              var5[incrementValue$49] = 0;
              int incrementValue$50 = var2;
              var2++;
              var5[incrementValue$50] = 0;
              int incrementValue$51 = var2;
              var2++;
              var5[incrementValue$51] = 0;
              int incrementValue$52 = var2;
              var2++;
              var5[incrementValue$52] = 0;
              int incrementValue$53 = var2;
              var2++;
              var5[incrementValue$53] = 0;
              int incrementValue$54 = var2;
              var2++;
              var5[incrementValue$54] = 0;
              int incrementValue$55 = var2;
              var2++;
              var5[incrementValue$55] = 0;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final ah a(boolean param0) {
        ah var2 = null;
        var2 = ((al) this).field_d.field_m;
        if (var2 != ((al) this).field_d) {
          if (param0) {
            return null;
          } else {
            ((al) this).field_g = var2.field_m;
            return var2;
          }
        } else {
          ((al) this).field_g = null;
          return null;
        }
    }

    public al() {
        ((al) this).field_d = new ah();
        ((al) this).field_d.field_l = ((al) this).field_d;
        ((al) this).field_d.field_m = ((al) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_e = "Username: ";
    }
}
