/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wsb {
    private int field_d;
    private int field_j;
    private ujb[] field_i;
    private int field_h;
    float field_g;
    String field_a;
    static dja field_e;
    static String field_c;
    static int field_f;
    static int field_b;

    final boolean a(byte param0) {
        ujb var2 = null;
        int var3 = 0;
        Object var4 = null;
        ujb var5 = null;
        var3 = VoidHunters.field_G;
        L0: while (true) {
          if (((wsb) this).field_h <= ((wsb) this).field_j) {
            if (param0 <= 85) {
              var4 = null;
              ((wsb) this).a((asb) null, (String) null, false, (String) null, (String) null);
              return true;
            } else {
              return true;
            }
          } else {
            var5 = ((wsb) this).field_i[((wsb) this).field_j];
            var2 = var5;
            if (!var5.field_f.b((byte) 123)) {
              this.a(var5, 0, (byte) 125);
              return false;
            } else {
              L1: {
                if (0 > var5.field_b) {
                  break L1;
                } else {
                  if (var5.field_f.c(68, var5.field_b)) {
                    break L1;
                  } else {
                    this.a(var2, var5.field_f.a(var5.field_b, 1045), (byte) 118);
                    return false;
                  }
                }
              }
              L2: {
                if (var5.field_e == null) {
                  break L2;
                } else {
                  if (var5.field_f.a(32171, var5.field_e)) {
                    break L2;
                  } else {
                    this.a(var2, var5.field_f.a(var5.field_e, -2118), (byte) 25);
                    return false;
                  }
                }
              }
              L3: {
                if (-1 >= (var5.field_b ^ -1)) {
                  break L3;
                } else {
                  if (var5.field_e != null) {
                    break L3;
                  } else {
                    if (var5.field_a == null) {
                      break L3;
                    } else {
                      if (var5.field_f.a(105)) {
                        break L3;
                      } else {
                        this.a(var2, var5.field_f.b(-107), (byte) 120);
                        return false;
                      }
                    }
                  }
                }
              }
              ((wsb) this).field_j = ((wsb) this).field_j + 1;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = param0 >>> -139758655;
        if (param1 != 1302374146) {
          return -70;
        } else {
          var2 = var2 | var2 >>> -1581314495;
          var2 = var2 | var2 >>> 1302374146;
          var2 = var2 | var2 >>> 637979588;
          var2 = var2 | var2 >>> -867754360;
          var2 = var2 | var2 >>> -641961200;
          return param0 & (var2 ^ -1);
        }
    }

    private final void a(String param0, byte param1, int param2, String param3, String param4, asb param5) {
        ujb[] var7 = null;
        ujb var7_ref = null;
        Object var8 = null;
        ujb var9 = null;
        ujb[] var10 = null;
        ujb var11 = null;
        L0: {
          if (((wsb) this).field_i.length > ((wsb) this).field_h) {
            break L0;
          } else {
            var10 = new ujb[((wsb) this).field_h * 2];
            var7 = var10;
            cua.a((Object[]) (Object) ((wsb) this).field_i, 0, (Object[]) (Object) var10, 0, ((wsb) this).field_h);
            ((wsb) this).field_i = var10;
            break L0;
          }
        }
        if (param1 != -62) {
          var8 = null;
          ((wsb) this).a((String) null, 126, (String) null, (asb) null);
          var9 = new ujb();
          var11 = var9;
          var7_ref = var11;
          var11.field_b = param2;
          var11.field_f = param5;
          var11.field_a = param0;
          var11.field_e = param3;
          var11.field_i = param4;
          ((wsb) this).field_h = ((wsb) this).field_h + 1;
          ((wsb) this).field_i[((wsb) this).field_h] = var9;
          return;
        } else {
          var9 = new ujb();
          var11 = var9;
          var7_ref = var11;
          var11.field_b = param2;
          var11.field_f = param5;
          var11.field_a = param0;
          var11.field_e = param3;
          var11.field_i = param4;
          ((wsb) this).field_h = ((wsb) this).field_h + 1;
          ((wsb) this).field_i[((wsb) this).field_h] = var9;
          return;
        }
    }

    final void a(asb param0, String param1, boolean param2, String param3, String param4) {
        this.a(param1, (byte) -62, -1, param3, param4, param0);
        if (param2) {
            field_b = -110;
        }
    }

    final void a(String param0, int param1, String param2, asb param3) {
        this.a(param0, (byte) -62, param1, (String) null, param2, param3);
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 > -102) {
            field_f = -17;
            field_e = null;
            return;
        }
        field_e = null;
    }

    wsb(int param0) {
        ((wsb) this).field_i = new ujb[16];
        ((wsb) this).field_d = param0;
    }

    private final void a(ujb param0, int param1, byte param2) {
        float var4 = 0.0f;
        int var5 = 0;
        var4 = (float)param1 / 100.0f + (float)(((wsb) this).field_j - -1);
        var5 = 40 % ((-27 - param2) / 40);
        ((wsb) this).field_g = (float)((wsb) this).field_d * var4 / (float)(1 + ((wsb) this).field_h);
        if (-1 == (param1 ^ -1)) {
          ((wsb) this).field_a = param0.field_i;
          return;
        } else {
          ((wsb) this).field_a = param0.field_a + " - " + param1 + "%";
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = (dja) (Object) new kfa();
        field_b = 200;
        field_f = field_b / 2;
        field_c = "Hull triangle";
    }
}
