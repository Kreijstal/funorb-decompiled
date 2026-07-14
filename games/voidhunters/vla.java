/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vla extends dqa implements en, oo {
    static String field_E;
    private htb field_x;
    private boolean field_B;
    private htb field_A;
    private String field_v;
    private uf field_G;
    private boolean field_F;
    private boolean field_w;
    static String field_C;
    private uf field_y;
    private htb field_z;

    final void a(byte param0, String param1) {
        if (param0 != 9) {
            return;
        }
        uf var3 = ((vla) this).field_y;
        String var4 = param1;
        var3.a(false, param0 ^ 9, var4);
        ((vla) this).field_G.e(82);
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (param0 == 11) {
          L0: {
            if (((vla) this).field_x != param3) {
              if (param3 == ((vla) this).field_z) {
                kga.a(70);
                break L0;
              } else {
                if (param3 != ((vla) this).field_A) {
                  break L0;
                } else {
                  if (!((vla) this).field_B) {
                    if (!((vla) this).field_w) {
                      vsb.e(-24248);
                      break L0;
                    } else {
                      to.e((byte) -91);
                      break L0;
                    }
                  } else {
                    qj.a((byte) 127);
                    break L0;
                  }
                }
              }
            } else {
              this.d(-1);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(((vla) this).field_v == null)) {
            int discarded$0 = loa.field_o.a(((vla) this).field_v, ((vla) this).field_g + (param0 - -20), 15 + (param3 + ((vla) this).field_r), -40 + ((vla) this).field_h, ((vla) this).field_f, 16777215, -1, 1, 0, loa.field_o.field_k);
        }
        if (!(((vla) this).field_z == null)) {
            dma.h(param0 + 10, param3 + 134, -20 + ((vla) this).field_h, 4210752);
        }
        super.b(param0, param1, 58, param3);
        if (param2 < 47) {
            Object var6 = null;
            ((vla) this).a((uf) null, (byte) 79);
        }
    }

    final void i(byte param0) {
        ((vla) this).field_y.e(82);
        if (param0 != -29) {
            ((vla) this).field_x = null;
        }
        ((vla) this).field_G.e(82);
    }

    private final void d(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            ((vla) this).a((uf) null, (byte) -20);
        }
        if (!tj.f((byte) -21)) {
            // if_icmpge L79
            // ifgt L60
        } else {
            cda.a(-41, ((vla) this).field_G.field_j, ((vla) this).field_y.field_j);
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (-99 == (param1 ^ -1)) {
            return ((vla) this).a(param2, 0);
        }
        if (param1 == 99) {
            return ((vla) this).a(true, param2);
        }
        return false;
    }

    final String a(int param0) {
        if (!(null != ((vla) this).field_y.field_j)) {
            return "";
        }
        if (param0 != 30) {
            return null;
        }
        return ((vla) this).field_y.field_j;
    }

    vla(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (wwa) null);
        vva var6 = null;
        no var7 = null;
        String var8 = null;
        khb var9 = null;
        sca var12 = null;
        sca var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_15_0 = null;
        htb stackIn_15_1 = null;
        htb stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        htb stackIn_16_1 = null;
        htb stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        htb stackIn_17_1 = null;
        htb stackIn_17_2 = null;
        String stackIn_17_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_14_0 = null;
        htb stackOut_14_1 = null;
        htb stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        htb stackOut_16_1 = null;
        htb stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        htb stackOut_15_1 = null;
        htb stackOut_15_2 = null;
        String stackOut_15_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((vla) this).field_w = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param3) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((vla) this).field_F = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param2) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((vla) this).field_B = stackIn_9_1 != 0;
          ((vla) this).field_v = param1;
          if (!((vla) this).field_B) {
            break L3;
          } else {
            L4: {
              if (((vla) this).field_F) {
                break L4;
              } else {
                if (!((vla) this).field_w) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((vla) this).field_y = (uf) (Object) new tga(param0, (sba) this, 100);
          ((vla) this).field_G = (uf) (Object) new tga("", (sba) this, 20);
          if (((vla) this).field_B) {
            ((vla) this).field_x = new htb(kj.field_p, (sba) null);
            ((vla) this).field_A = new htb(vda.field_q, (sba) null);
            ((vla) this).field_y.field_x = false;
            break L5;
          } else {
            L6: {
              ((vla) this).field_x = new htb(jmb.field_s, (sba) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (((vla) this).field_w) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = cjb.field_a;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = vab.field_a;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new htb(stackIn_17_3, (sba) null);
            ((vla) this).field_A = stackIn_17_1;
            if (!((vla) this).field_F) {
              break L5;
            } else {
              ((vla) this).field_z = new htb(gqb.field_b, (sba) this);
              break L5;
            }
          }
        }
        L7: {
          ((vla) this).field_y.field_q = (wwa) (Object) new io(10000536);
          ((vla) this).field_G.field_q = (wwa) (Object) new kpb(10000536);
          var6 = new vva();
          ((vla) this).field_x.field_q = (wwa) (Object) var6;
          if (null == ((vla) this).field_A) {
            break L7;
          } else {
            ((vla) this).field_A.field_q = (wwa) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((vla) this).field_y.field_p = sja.field_j;
          if (((vla) this).field_z == null) {
            break L8;
          } else {
            ((vla) this).field_z.field_q = (wwa) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (((vla) this).field_z == null) {
            break L9;
          } else {
            ((vla) this).field_z.field_p = tt.field_a;
            break L9;
          }
        }
        L10: {
          if (((vla) this).field_B) {
            ((vla) this).field_A.field_p = ewa.field_o;
            break L10;
          } else {
            if (!((vla) this).field_w) {
              ((vla) this).field_A.field_q = (wwa) (Object) new meb();
              break L10;
            } else {
              ((vla) this).field_A.field_p = dqa.field_u;
              ((vla) this).field_A.field_q = (wwa) (Object) new meb();
              break L10;
            }
          }
        }
        L11: {
          ((vla) this).field_r = 15;
          var7 = loa.field_o;
          if (null == ((vla) this).field_v) {
            break L11;
          } else {
            ((vla) this).field_r = ((vla) this).field_r + (var7.b(((vla) this).field_v, ((vla) this).field_h + -40, var7.field_k) + 5);
            break L11;
          }
        }
        L12: {
          var8 = rg.field_a;
          var9 = gib.a(19314, vpa.b((byte) -86));
          if (up.field_o != var9) {
            if (var9 != hha.field_p) {
              break L12;
            } else {
              var8 = ula.field_o;
              break L12;
            }
          } else {
            var8 = fj.field_a;
            break L12;
          }
        }
        L13: {
          var12 = new sca(10, ((vla) this).field_r, ((vla) this).field_h + -20, 25, (shb) (Object) ((vla) this).field_y, false, 80, 3, var7, 16777215, var8);
          ((vla) this).b(-18756, (shb) (Object) new sca(10, ((vla) this).field_r, ((vla) this).field_h + -20, 25, (shb) (Object) ((vla) this).field_y, false, 80, 3, var7, 16777215, var8));
          ((vla) this).field_r = ((vla) this).field_r + (((shb) (Object) var12).field_f - -5);
          var13 = new sca(10, ((vla) this).field_r, -20 + ((vla) this).field_h, 25, (shb) (Object) ((vla) this).field_G, false, 80, 3, var7, 16777215, dpa.field_q);
          ((vla) this).b(-18756, (shb) (Object) new sca(10, ((vla) this).field_r, -20 + ((vla) this).field_h, 25, (shb) (Object) ((vla) this).field_G, false, 80, 3, var7, 16777215, dpa.field_q));
          ((vla) this).field_r = ((vla) this).field_r + (((shb) (Object) var13).field_f - -5);
          ((vla) this).field_x.field_l = (sba) this;
          if (((vla) this).field_z == null) {
            break L13;
          } else {
            ((vla) this).field_z.field_l = (sba) this;
            break L13;
          }
        }
        L14: {
          if (((vla) this).field_A == null) {
            break L14;
          } else {
            ((vla) this).field_A.field_l = (sba) this;
            break L14;
          }
        }
        L15: {
          if (null == ((vla) this).field_z) {
            ((vla) this).field_x.a(8, ((vla) this).field_h - 16, 30, 1, ((vla) this).field_r);
            ((vla) this).field_r = ((vla) this).field_r + 35;
            break L15;
          } else {
            ((vla) this).field_x.a(85, ((vla) this).field_h - 95, 30, 1, ((vla) this).field_r);
            ((vla) this).field_r = ((vla) this).field_r + 60;
            break L15;
          }
        }
        L16: {
          if (null == ((vla) this).field_z) {
            break L16;
          } else {
            ((vla) this).field_z.a(8, -16 + ((vla) this).field_h, 30, 1, ((vla) this).field_r);
            ((vla) this).field_r = ((vla) this).field_r + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((vla) this).field_A) {
            break L17;
          } else {
            L18: {
              if (((vla) this).field_B) {
                break L18;
              } else {
                if (!((vla) this).field_w) {
                  ((vla) this).field_A.a(8, 40, 20, 1, ((vla) this).field_r);
                  ((vla) this).field_r = ((vla) this).field_r + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((vla) this).field_A.a(8, -10 + (-6 + ((vla) this).field_h), 30, 1, ((vla) this).field_r);
            ((vla) this).field_r = ((vla) this).field_r + 35;
            break L17;
          }
        }
        L19: {
          ((vla) this).a(0, ((vla) this).field_h, 3 + ((vla) this).field_r, 1, 0);
          ((vla) this).b(-18756, (shb) (Object) ((vla) this).field_x);
          if (((vla) this).field_z == null) {
            break L19;
          } else {
            ((vla) this).b(-18756, (shb) (Object) ((vla) this).field_z);
            break L19;
          }
        }
        L20: {
          if (null == ((vla) this).field_A) {
            break L20;
          } else {
            ((vla) this).b(-18756, (shb) (Object) ((vla) this).field_A);
            break L20;
          }
        }
    }

    public static void e(int param0) {
        if (param0 != 3) {
            return;
        }
        field_E = null;
        field_C = null;
    }

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var2 = param1.length();
        int var3 = 0;
        if (param0 <= 105) {
            vla.e(30);
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3 = aea.a(-125, param1.charAt(var4)) + (-var3 + (var3 << -2095977691));
        }
        return var3;
    }

    public final void a(uf param0, byte param1) {
        if (param1 != 100) {
            this.d(-74);
        }
    }

    public final void a(int param0, uf param1) {
        if (param0 != -12409) {
            Object var4 = null;
            int discarded$0 = vla.a((byte) -119, (CharSequence) null);
        }
        if (param1 == ((vla) this).field_y) {
            boolean discarded$1 = ((vla) this).field_G.a(param0 ^ -12409, (shb) this);
        }
        if (!(param1 != ((vla) this).field_G)) {
            this.d(-1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Hull block";
    }
}
