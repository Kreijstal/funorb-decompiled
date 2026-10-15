/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends km {
    private lc field_u;
    static String field_x;
    static jp[] field_z;
    static jp field_r;
    static int[] field_v;
    private lc field_t;
    static int field_y;
    static int field_w;
    static boolean field_s;

    final void a(int param0, int param1, char param2) {
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -120) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_h.field_j >= 0) {
          if (param1 != 98 &&
            param1 != 99) {
            if (param1 == 96) {
              if (1 == this.field_h.field_j) {
                this.field_h.a(false, 2);
              } else {
                if ((this.field_h.field_j == 2)) {
                  this.field_h.a(false, 1);
                }
              }
            } else {
              if ((param1 == 97)) {
                if (this.field_h.field_j == 2) {
                  this.field_h.a(false, 1);
                } else {
                  if ((this.field_h.field_j == 1)) {
                    this.field_h.a(false, 2);
                  }
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_h.field_j == 0) {
              this.field_h.a(false, 1);
            } else {
              this.field_h.a(false, 0);
            }
          }
        } else {
          this.field_h.a(false, 0);
        }

    }

    final boolean a(int param0, boolean param1, byte param2) {
        int var4;
        int var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = this.field_m[param0].field_f;
        var5 = var4;
        if (var5 != 40) {
          if (var5 != 41) {
            return super.a(param0, param1, (byte) 123);
          }
          if (this.field_h.a((byte) 113)) {
            ng.a(param1, 54, 15);
          }
        } else {
          if (this.field_h.a((byte) 113)) {
            ng.a(param1, param2 - 54, 13);
          }
        }
        if (param2 == 123) {
          return false;
        }
        field_x = (String) null;
        return false;
    }

    public static void f(int param0) {
        field_r = null;
        field_v = null;
        field_x = null;
        if (param0 != 14529) {
          field_z = (jp[]) null;
        }
        field_z = null;
    }

    final void b(boolean param0) {
        int dupTemp$0 = 0;
        int var4 = 0;
        String stackIn_7_0 = null;
        int var2;
        int var3;
        q var5;
        String var5_ref;
        int var6;
        q var7;
        q var8;
        q var9;
        String var10;
        q var11;
        q var12;
        int var3Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (!param0) {
          return;
        }
        var2 = 0;
        for (var3 = 0; 1 > var3; var3++) {
          var7 = this.field_m[var3];
          var9 = var7;
          if (var9.field_f == 8) {
            stackIn_7_0 = this.e((byte) 81);
          } else {
            stackIn_7_0 = ag.field_D[var7.field_f];
          }
          var10 = stackIn_7_0;
          var5_ref = var10;
          dupTemp$0 = nn.field_g.c(var10) + 30;
          var9.field_j = dupTemp$0;
          var2 = var2 + dupTemp$0;
          if (var3 > 0) {
            var2 += 10;
          }
        }
        var3Lifetime1 = (640 - var2) / 2;
        for (var4 = 0; var4 < 1; var4++) {
          var11 = this.field_m[var4];
          var11.field_c = var3Lifetime1;
          var11.field_a = this.b(var4, 1);
          var11.field_d = this.b((byte) -112, var4);
          var3Lifetime1 = var3Lifetime1 + (var11.field_j + 10);
        }
        var8 = this.field_m[1];
        var12 = var8;
        var8.field_j = hq.field_s[0].field_x + 60;
        var12.field_d = var12.field_j;
        var12.field_c = (600 - 2 * var12.field_j) / 2;
        var12.field_a = (523 - var12.field_d) / 2;
        var5 = this.field_m[2];
        var5.field_a = var12.field_a;
        var5.field_d = var12.field_d;
        var5.field_c = 340;
        var5.field_j = var12.field_j;
        return;
    }

    ol() {
        super(16, 180, 460, 402, 35, ag.field_L);
        this.field_u = new lc((km) (this), this.field_m[1], 1, 0);
        this.field_t = new lc((km) (this), this.field_m[2], 2, 1);
    }

    final void b(byte param0) {
        super.b((byte) -56);
        al.a(this.field_a, 19);
        im.a(550, 5, 243, 5, 140, (byte) -91, 45);
        this.a(0);
        this.field_u.a((byte) 105);
        this.field_t.a((byte) 116);
        if (param0 >= -14) {
          field_z = (jp[]) null;
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, -118);
        this.field_u.b((byte) -75);
        this.field_t.b((byte) -75);
        if (param2 > -52) {
          field_r = (jp) null;
        }
    }

    static {
        field_x = "Message lobby";
        field_v = new int[4];
        field_y = 10;
        field_s = true;
    }
}
