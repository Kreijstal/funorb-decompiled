/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af extends km {
    static char[] field_B;
    static int field_u;
    static Boolean field_r;
    static jp[] field_A;
    private String[] field_E;
    static String[] field_s;
    private NodeDeque field_C;
    int[] field_t;
    private NodeDeque field_v;
    static jp field_D;
    private int[] field_y;
    private NodeDeque[] field_z;
    private int field_x;
    private int field_w;

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        super.advanceScreen(updateFlag, inputEnabled, -89);
        nf.field_Y = -1;
        i var4 = (i) (this.field_C.first(-117));
        if (obfuscationGuard > -52) {
          field_u = 41;
        }
        while (var4 != null) {
          var4.a(-127);
          var4 = (i) (this.field_C.next((byte) 116));
        }
        var4 = (i) (this.field_v.first(-113));
        while (var4 != null) {
          var4.a(-128);
          if (var4.field_p == 0) {
            var4.c(1);
          }
          var4 = (i) (this.field_v.next((byte) 116));
        }
    }

    final void drawScreen(byte obfuscationGuard) {
        int var13 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        bi stackIn_19_0 = null;
        String stackIn_20_1 = null;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        i var15;
        Object var16;
        i var17;
        int var11Lifetime1;
        var16 = null;
        var14 = BrickABrac.field_J ? 1 : 0;
        super.drawScreen((byte) -104);
        im.a(550, 5, 88, 5, 140, (byte) -72, 45);
        MovingBody.a((byte) 98, 560, 80, 140, 228);
        var17 = (i) (this.field_C.first(-94));
        while (var17 != null) {
          var17.a((byte) 103);
          var17 = (i) (this.field_C.next((byte) 116));
        }
        var15 = (i) (this.field_v.first(-43));
        while (var15 != null) {
          var15.a((byte) 107);
          var15 = (i) (this.field_v.next((byte) 116));
        }
        sc.b(-81);
        im.a(146, 5, 146, 5, 233, (byte) -87, 45);
        im.a(399, 5, 146, 5, 233, (byte) -107, 196);
        if (nf.field_P != -1) {
          stackIn_9_0 = nf.field_P;
        } else {
          stackIn_9_0 = nf.field_Y;
        }
        var3 = stackIn_9_0;
        if (obfuscationGuard >= -14) {
          return;
        }
        var4 = ob.field_D.field_P + ob.field_D.field_B;
        var5 = nn.field_g.field_B + nn.field_g.field_P;
        if (-1 != var3) {
          stackIn_17_0 = (!eo.a(this.field_t, var3, (byte) -75)) ? 0 : 1;
          var6 = stackIn_17_0;
          nn.field_g.c(field_s[var3], 209, nn.field_g.field_B + 246, 1, -1);
          stackIn_19_0 = nn.field_g;
          if (var6 == 0) {
            stackIn_20_1 = po.field_c;
          } else {
            stackIn_20_1 = gi.field_s;
          }
          ((bi) (Object) stackIn_19_0).c(stackIn_20_1, 209, 2 * var5 + 246 + 2, 2, -1);
          if (var6 != 0) {
            si.field_c[var3].a(54, 242);
          } else {
            vq.field_F.c(54, 242);
          }
          var7 = 246 + 5 * var5 / 2;
          var8 = var7 + var5;
          var9 = var7 - (-(7 * var4) + ob.field_D.field_F);
          var10 = ob.field_D.a(rd.a(mp.field_bc[var3], new String[]{nl.a(true, true, 0, (long)dp.field_r[var3], cd.field_e)}, (byte) 103), this.field_y, this.field_E);
          for (var11 = 0; var11 < var10; var11++) {
            ob.field_D.c(this.field_E[var11], 209, var8, 2, -1);
            var8 = var8 + var4;
          }
          ob.field_D.c(mq.field_c + Brick.field_D[var3], 209, var9 + (-(2 * ob.field_D.field_P) - nj.field_z.field_C / 2), 2, -1);
          ob.field_D.c(fl.field_m, 209, -nn.field_g.field_P + var9, 2, -1);
          var11Lifetime1 = ob.field_D.c(fl.field_m) + 209;
          var12 = -(nj.field_z.field_z / 2) + var9;
          for (var13 = 0; fq.field_e[var3] > var13; var13++) {
            nj.field_z.a(var11Lifetime1, var12);
            var11Lifetime1 = var11Lifetime1 + nj.field_z.field_D / 3;
          }
        } else {
          nn.field_g.c(jo.field_h, 209, 246 + nn.field_g.field_B, 2, -1);
          if (og.h(-26090)) {
            var6 = 246 + var5 * 3;
            ob.field_D.c(na.field_N, 209, var6, 2, -1);
          }
        }
        al.a(this.field_a, 19);
        this.a(0);
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        int var5 = 66 % ((38 - param3) / 57);
        if (param1) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        return gn.field_D[var4];
    }

    final void a(int param0, int param1, char param2) {
        int var5;
        jp var6;
        boolean decompiledFrameRemainder0 = true;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (this.field_h.field_j < 0) {
          this.field_h.a(false, 2);
        } else {
          if (0 == this.field_h.field_j) {
            if (param1 != 98 &&
              99 != param1) {
              if (((param1 == 96 ||
                param1 == 97)) && (!(!this.a((byte) 106, 1)))) {
                this.field_h.a(false, 1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_h.a(false, 2);
            }
          } else {
            if (this.field_h.field_j == 1) {
              if (param1 != 98 &&
                param1 != 99) {
                if (((param1 == 96 ||
                  param1 == 97)) && (!(!this.a((byte) 121, 0)))) {
                  this.field_h.a(false, 0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_h.a(false, 2);
              }
            } else {
              if (this.field_h.field_j != 2) {
                if (this.field_h.field_j == 3) {
                  if (param1 != 97 &&
                    96 != param1) {
                    if ((98 == param1 ||
                      param1 == 99)) {
                      if (!this.a((byte) 124, 0)) {
                        this.field_h.a(false, 1);
                      } else {
                        this.field_h.a(false, 0);
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.field_h.a(false, 2);
                  }
                }
              } else {
                if (param1 != 97 &&
                  param1 != 96) {
                  if ((param1 == 98 ||
                    param1 == 99)) {
                    if (!this.a((byte) 103, 0)) {
                      this.field_h.a(false, 1);
                    } else {
                      this.field_h.a(false, 0);
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (this.field_m.length == 4) {
                    this.field_h.a(false, 3);
                  }
                }
              }
            }
          }
        }
        if (param0 != -120) {
          var6 = (jp) null;
          af.a((jp) null, -23, 26, 101, 46, -121, -33, (jp) null, 118, (jp) null, -100);
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 118) {
            field_B = (char[]) null;
          }
          stackIn_5_0 = (jf.a(0, param1) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("af.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    abstract boolean a(int param0, byte param1);

    public static void f(byte param0) {
        field_A = null;
        if (param0 >= -92) {
          return;
        }
        field_D = null;
        field_r = null;
        field_s = null;
        field_B = null;
    }

    final static void a(jp param0, int param1, int param2, int param3, int param4, int param5, int param6, jp param7, int param8, jp param9, int param10) {
        if (param5 != 0) {
          return;
        }
        try {
          param7.d((5 * param2 >> 16) + param1 + (param4 - param7.field_x) / 2, param10);
          if (param8 == 1) {
            lb.a(100 / param8 << 4, 1600, 64, 128, sq.field_b);
            lb.a(200 / param8 << 4, 800, 48, 192, sq.field_b);
            lb.a(300 / param8 << 4, 1920, 64, 128, sq.field_b);
            lb.a(370 / param8 << 4, 2720, 48, 128, sq.field_b);
            lb.a(480 / param8 << 4, 1120, 48, 192, sq.field_b);
          }
          param9.c(-(220 / param8) + (10 * param2 >> 16) + (param1 + (param4 - param9.field_x) / 2), -param9.field_z + (480 + 37 / param8));
          param0.c(param1 + ((param4 - param0.field_x) / 2 + (20 * param2 >> 16)) - 5 / param8, 480 - param0.field_z);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "af.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ')');
        }
    }

    af(int param0, int[] param1) {
        super(param0, 38, 460, 402, 35, param1);
        int var3_int = 0;
        this.field_E = new String[24];
        this.field_C = new NodeDeque();
        this.field_v = new NodeDeque();
        try {
          this.field_z = new NodeDeque[1 + field_s.length / 16];
          for (var3_int = 0; this.field_z.length > var3_int; var3_int++) {
            this.field_z[var3_int] = new NodeDeque();
          }
          this.field_y = new int[]{373};
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "af.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
          field_D = (jp) null;
        }
        return this.field_p;
    }

    final void d(byte param0) {
        this.g((byte) -121);
        if (param0 != 79) {
          this.field_E = (String[]) null;
        }
    }

    private final void g(byte param0) {
        if (param0 > -42) {
          return;
        }
        this.a(32367, this.field_C);
        this.a(32367, this.field_v);
    }

    final boolean a(byte param0, int param1) {
        int var3 = this.field_m[param1].field_f;
        if (var3 == 44 &&
          this.field_w == 0) {
          return false;
        }
        if (var3 == 45 &&
          this.field_x - 1 <= this.field_w) {
          return false;
        }
        if (param0 < 80) {
          field_u = -122;
          return true;
        }
        return true;
    }

    final void a(boolean param0, int param1, int param2) {
        int var5 = 0;
        int fieldTemp$0 = 0;
        int var4;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, 2, 110);
        this.field_w = 0;
        this.field_x = 0;
        nf.field_Y = -1;
        nf.field_P = -1;
        this.field_z[this.field_x].clear((byte) -114);
        if (param2 <= 96) {
          return;
        }
        var4 = 0;
        for (var5 = 0; var5 < field_s.length; var5++) {
          if (!this.a(var5, (byte) 38)) {
            this.field_z[this.field_x].addLast(new kq(var5), (byte) 3);
            var4++;
            if (var4 == 16) {
              var4 = 0;
              fieldTemp$0 = this.field_x + 1;
              this.field_x = this.field_x + 1;
              this.field_z[fieldTemp$0].clear((byte) -46);
            }
          }
        }
        if (!this.field_z[this.field_x].isEmpty(false)) {
          this.field_x = this.field_x + 1;
        }
        this.a(2, 0, this.field_z[this.field_w]);
        return;
    }

    private final void a(int param0, int param1, NodeDeque param2) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        i var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kq var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          nf.field_P = -1;
          var4_int = 640 * param1;
          this.a(32367, this.field_v);
          var5 = (i) (this.field_C.removeFirst(3));
          while (var5 != null) {
            var5.field_x = -1;
            var5.field_p = -var4_int;
            this.field_v.addLast(var5, (byte) 3);
            var5 = (i) (this.field_C.removeFirst(3));
          }
          var6 = 82;
          var7 = (24 + var6 * 2) / param0;
          var8 = 150;
          var9 = (kq) (param2.first(-74));
          var10 = 0;
          while (var9 != null) {
            this.field_C.addLast(cn.a(-var4_int, var8, 32, this, 32, var10, var4_int + var7, var9.field_p, param0 - 1), (byte) 3);
            rk.field_Qb = rk.field_Qb | 1 << var10;
            var9 = (kq) (param2.next((byte) 116));
            var10++;
            if (var10 != 8) {
              var7 += 56;
              continue;
            }
            var8 += 35;
            var7 = (80 + var6 * 2) / 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("af.RA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(int param0, NodeDeque param1) {
        int var4 = 0;
        i var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != 32367) {
            this.field_C = (NodeDeque) null;
          }
          var5 = (i) (param1.removeFirst(param0 - 32364));
          while (var5 != null) {
            var5.c(1);
            var5 = (i) (param1.removeFirst(3));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("af.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var5;
        int var6;
        int var7;
        q var8;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param2 != 123) {
          return false;
        }
        var8 = this.field_m[param0];
        var5 = var8.field_f;
        var6 = var5;
        if (var6 != 44) {
          if (45 != var6) {
            return super.a(param0, param1, (byte) 123);
          }
          if (this.field_h.a((byte) 113) &&
            this.a((byte) 90, param0) &&
            rk.field_Qb == 0) {
            fieldTemp$0 = this.field_w + 1;
            this.field_w = this.field_w + 1;
            if (fieldTemp$0 >= this.field_x) {
              this.field_w = this.field_x - 1;
            }
            this.a(2, 1, this.field_z[this.field_w]);
            if (!this.a((byte) 86, 1)) {
              this.field_h.a(false, 0);
            }
            return true;
          }
        } else {
          if (this.field_h.a((byte) 113) &&
            this.a((byte) 86, param0)) {
            if (rk.field_Qb != 0) {
              return false;
            }
            fieldTemp$1 = this.field_w - 1;
            this.field_w = this.field_w - 1;
            if (fieldTemp$1 < 0) {
              this.field_w = 0;
            }
            this.a(2, -1, this.field_z[this.field_w]);
            if (!this.a((byte) 83, 0)) {
              this.field_h.a(false, 1);
            }
            return true;
          }
        }
        return false;
    }

    final void b(boolean param0) {
        int dupTemp$0 = 0;
        int var6 = 0;
        String stackIn_7_0 = null;
        q var3;
        int var4;
        int var5;
        q var6_ref_q;
        String var7;
        int var8;
        q var9;
        String var10;
        q var11;
        int var5Lifetime1;
        var8 = BrickABrac.field_J ? 1 : 0;
        var9 = this.field_m[0];
        var9.field_a = 145;
        var9.field_c = 50;
        var9.field_j = 25;
        var9.field_d = 78;
        if (!param0) {
          this.a((byte) 110, 75);
        }
        var3 = this.field_m[1];
        var3.field_c = -5 - (var9.field_j - 595);
        var3.field_a = var9.field_a;
        var3.field_d = var9.field_d;
        var3.field_j = var9.field_j;
        var4 = 0;
        for (var5 = 2; this.field_m.length > var5; var5++) {
          var6_ref_q = this.field_m[var5];
          if (var6_ref_q.field_f == 8) {
            stackIn_7_0 = this.e((byte) 105);
          } else {
            stackIn_7_0 = ag.field_D[var6_ref_q.field_f];
          }
          var10 = stackIn_7_0;
          var7 = var10;
          dupTemp$0 = 30 + nn.field_g.c(var10);
          var6_ref_q.field_j = dupTemp$0;
          var4 = var4 + dupTemp$0;
          if (var5 > 3) {
            var4 += 10;
          }
        }
        var5Lifetime1 = (640 - var4) / 2;
        for (var6 = 2; var6 < this.field_m.length; var6++) {
          var11 = this.field_m[var6];
          var11.field_c = var5Lifetime1;
          var11.field_a = this.b(var6, 1);
          var11.field_d = this.b((byte) -7, var6);
          var5Lifetime1 = var5Lifetime1 + (10 + var11.field_j);
        }
    }

    static {
        field_B = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_s = new String[]{"Brick Destroyer", "Brick Assassin", "Brick Slayer", "Chip Away at the Stone", "Stone Idol", "Stone Circle", "Stone Mason", "Another Brick in the Wall", "Follow the Yellow Brick Road", "Bounce Master Junior", "Bounce Master Senior", "Master Builder", "Bricking It", "Chip Off the Old Brick", "Brick Me (Baby) One More Time", "Gone with the Brick", "Rentabrick", "The House That Jack Built", "Blow Our House Down", "Stone Cold Crazy", "Dry Stone Wall", "Stone Destroyer", "Somewhere Over the Rainbow", "Fierce Brickster", "Expert Brickster", "Master Brickster", "Comeback Kid", "Reluctant Charger", "Crazy Fool", "Brickicide", "Glutton for Punishment", "And Still You Did Not Learn", "It's So Easy", "Too Much of a Good Thing", "Covent Garden", "Marble Arch", "Nelson's Column", "Tower of London", "Buckingham Palace", "Brick Crusher", "Romancing the Brick", "Ghost in the Brick"};
    }
}
