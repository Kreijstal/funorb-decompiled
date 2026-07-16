/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ni {
    private int field_o;
    private pc field_n;
    static sf field_l;
    static String field_m;

    final void k(int param0) {
        ((ih) this).field_o = param0 * ((ih) this).field_i;
    }

    final void m(int param0) {
        ((ih) this).field_i = (((ih) this).field_o - -7) / param0;
    }

    ih(byte[] param0) {
        super(param0);
    }

    final int f(byte param0) {
        if (param0 != 47) {
          ((ih) this).m(-38);
          int fieldTemp$4 = ((ih) this).field_i;
          ((ih) this).field_i = ((ih) this).field_i + 1;
          return ((ih) this).field_k[fieldTemp$4] - ((ih) this).field_n.a(995108848) & 255;
        } else {
          int fieldTemp$5 = ((ih) this).field_i;
          ((ih) this).field_i = ((ih) this).field_i + 1;
          return ((ih) this).field_k[fieldTemp$5] - ((ih) this).field_n.a(995108848) & 255;
        }
    }

    public static void j(int param0) {
        field_m = null;
        if (param0 != 8) {
            return;
        }
        field_l = null;
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = ((ih) this).field_i;
        ((ih) this).field_i = ((ih) this).field_i + 1;
        ((ih) this).field_k[fieldTemp$0] = (byte)(((ih) this).field_n.a(995108848) + param1);
        if (param0 != 8) {
            ((ih) this).field_n = null;
        }
    }

    final int b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var3 = ((ih) this).field_o >> 41183555;
        if (param1 == -87) {
          var4 = 8 + -(((ih) this).field_o & 7);
          var5 = 0;
          ((ih) this).field_o = ((ih) this).field_o + param0;
          L0: while (true) {
            if (var4 >= param0) {
              L1: {
                if (var4 == param0) {
                  var5 = var5 + (ek.field_d[var4] & ((ih) this).field_k[var3]);
                  break L1;
                } else {
                  var5 = var5 + (((ih) this).field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                  break L1;
                }
              }
              return var5;
            } else {
              int incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((ek.field_d[var4] & ((ih) this).field_k[incrementValue$2]) << param0 - var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ih.j(33);
          var4 = 8 + -(((ih) this).field_o & 7);
          var5 = 0;
          ((ih) this).field_o = ((ih) this).field_o + param0;
          L2: while (true) {
            if (var4 >= param0) {
              L3: {
                if (var4 == param0) {
                  var5 = var5 + (ek.field_d[var4] & ((ih) this).field_k[var3]);
                  break L3;
                } else {
                  var5 = var5 + (((ih) this).field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                  break L3;
                }
              }
              return var5;
            } else {
              int incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((ek.field_d[var4] & ((ih) this).field_k[incrementValue$3]) << param0 - var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final static void l(int param0) {
        if (param0 != 255) {
          field_l = null;
          af.a(ef.field_j, true, oa.field_o, (byte) 54);
          ud.field_c = true;
          return;
        } else {
          af.a(ef.field_j, true, oa.field_o, (byte) 54);
          ud.field_c = true;
          return;
        }
    }

    ih(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        if (param0 < 66) {
          ih.j(-43);
          var5 = 0;
          L0: while (true) {
            if (param1 <= var5) {
              return;
            } else {
              int fieldTemp$2 = ((ih) this).field_i;
              ((ih) this).field_i = ((ih) this).field_i + 1;
              param3[param2 + var5] = (byte)(((ih) this).field_k[fieldTemp$2] + -((ih) this).field_n.a(995108848));
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = 0;
          L1: while (true) {
            if (param1 <= var5) {
              return;
            } else {
              int fieldTemp$3 = ((ih) this).field_i;
              ((ih) this).field_i = ((ih) this).field_i + 1;
              param3[param2 + var5] = (byte)(((ih) this).field_k[fieldTemp$3] + -((ih) this).field_n.a(995108848));
              var5++;
              continue L1;
            }
          }
        }
    }

    final void a(int[] param0, byte param1) {
        ((ih) this).field_n = new pc(param0);
        if (param1 != 12) {
            ((ih) this).e(-95, -126);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Flea Circus";
    }
}
