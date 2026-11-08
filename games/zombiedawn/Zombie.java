/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class Zombie extends Mover {
    static int field_pb;
    private int field_Eb;
    private int field_ub;
    boolean field_cb;
    private boolean field_ob;
    private nc field_rb;
    private Path field_yb;
    int field_fb;
    int field_sb;
    int field_Bb;
    static int field_Db;
    private int field_mb;
    private int field_xb;
    private boolean field_tb;
    boolean field_qb;
    int field_bb;
    private Human field_wb;
    private int field_Ab;
    static Sprite[][] field_Fb;
    private Point field_lb;
    boolean field_hb;
    private int field_jb;
    private int field_ib;
    private int field_vb;
    private boolean field_eb;
    private int field_zb;
    int field_gb;
    private int field_db;
    int field_Gb;
    private int field_Cb;
    private int field_kb;
    static int[] field_nb;

    private final void q(int param0) {
        int var2;
        var2 = pb.a(so.random, 50, param0 ^ 0);
        if (var2 == param0 &&
          Math.abs(this.field_K + this.velocityX) < Math.abs(this.field_I) &&
          Math.abs(this.field_R + this.velocityY) < Math.abs(this.field_M)) {
          this.velocityX = this.velocityX + this.field_K;
          this.velocityY = this.velocityY + this.field_R;
        } else {
          if (var2 == 2 &&
            Math.abs(this.velocityX - this.field_K) > Math.abs(this.field_E) &&
            Math.abs(this.velocityY - this.field_R) > Math.abs(this.field_ab)) {
            this.velocityY = this.velocityY - this.field_R;
            this.velocityX = this.velocityX - this.field_K;
          }
        }
    }

    final boolean p(byte param0) {
        boolean discarded$0 = false;
        if (this.n((byte) 25)) {
          return false;
        }
        this.setState(15, -6904);
        if (param0 != 6) {
          discarded$0 = this.o((byte) -114);
          return true;
        }
        return true;
    }

    private final String n(int param0) {
        if (param0 >= -26) {
          this.b(true);
        }
        return "";
    }

    final boolean t(int param0) {
        if (this.n((byte) 25)) {
          return false;
        }
        if (param0 <= 14) {
          return true;
        }
        this.setState(14, -6904);
        return true;
    }

    final void a(int param0, Camera param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ZombieDawn.field_J;
        try {
          if (this.field_J) {
            return;
          }
          var3_int = param1.worldToScreenX(this.getX(true), (byte) -75) - 24;
          var4 = param1.worldToScreenY(this.getY(237239984), param0) - 48;
          if (this.field_cb) {
            DualLinkNode.field_k[0].b(var3_int, var4, 128, 16711680);
          } else {
            if (this.field_tb) {
              DualLinkNode.field_k[0].drawTransparent(var3_int, var4);
            } else {
              if (this.field_qb) {
                DualLinkNode.field_k[0].e(var3_int, var4, 96);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kd.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void u(int param0) {
        if (param0 >= -99) {
          this.field_eb = true;
        }
        if (this.o((byte) -22)) {
          this.field_U = tp.$cfr$intArgs$b$3010b50b2764(59, 70 + pb.a(so.random, 2, 1));
        } else {
          this.field_U = tp.$cfr$intArgs$b$3010b50b2764(37, pb.a(so.random, 2, 1) + 72);
        }
    }

    private final void A(int param0) {
        boolean stackIn_15_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_65_0 = 0;
        boolean stackOut_14_0;
        Object var2;
        int var3;
        int var4;
        int var5;
        LevelNavigation var6;
        int var7;
        WorldObject var8;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        Zombie var15;
        Object var16;
        Human var16_ref;
        int var12Lifetime1;
        int var13Lifetime1;
        int stackIn_65_0Lifetime1;
        var16 = null;
        var14 = ZombieDawn.field_J;
        int fieldTemp$0 = this.field_vb;
        this.field_vb = this.field_vb + 1;
        if (fieldTemp$0 < 5) {
          return;
        }
        this.field_vb = 0;
        if (this.field_V) {
          return;
        }
        if (Js5Archive.field_e.field_q == 7 &&
          Js5Archive.field_e.field_h == 0 &&
          this.field_u >= 11 &&
          this.field_B < 6 &&
          this.field_B > 8) {
          return;
        }
        var2 = null;
        var6 = Js5Archive.field_e.navigation;
        var7 = 1;
        if (!this.i((byte) -126)) {
          var7 = var7 | 2;
        }
        var8 = this.a((byte) -74, 80, var7);
        while (var8 != null) {
          stackOut_14_0 = var8 instanceof Human;
          stackIn_65_0 = stackOut_14_0 ? 1 : 0;
          stackIn_15_0 = stackOut_14_0;
          if (stackIn_15_0) {
            var5 = this.field_s;
            var16_ref = (Human) (var8);
            if (var16_ref.state != 18 &&
              var16_ref.state != 20 &&
              !var16_ref.field_V &&
              var6.a(var16_ref.getY(237239984), this.getY(237239984), var16_ref.getX(true), this.getX(true), 125) != -1) {
              if (400 > var5) {
                this.field_wb = var16_ref;
                var16_ref.r(20);
                this.setState(8, -6904);
                this.field_zb = 70;
                this.field_kb = (var16_ref.getX(true) - this.getX(true)) / 2;
                this.field_mb = (var16_ref.getY(237239984) - this.getY(237239984)) / 2;
                if (var16_ref.t(10) &&
                  this.o((byte) -128)) {
                  this.field_Cb = 0;
                  return;
                }
                if (!var16_ref.t(10) &&
                  !this.o((byte) 112)) {
                  this.field_Cb = 4;
                  return;
                }
                this.field_Cb = 8;
                return;
              }
              var2 = var16_ref;
            }
          } else {
            if (var8 instanceof Zombie) {
              var15 = (Zombie) (var8);
              if (this.field_fb == -1) {
                stackIn_21_0 = 0;
              } else {
                stackIn_21_0 = this.field_fb;
              }
              var10 = stackIn_21_0;
              if (-1 != var15.field_fb) {
                stackIn_24_0 = var15.field_fb;
              } else {
                stackIn_24_0 = 0;
              }
              var11 = stackIn_24_0;
              if (~var10 != ~var11) {
                if (var15.field_ob) {
                  var8 = this.e((byte) 32);
                  continue;
                }
                if ((5 == var15.state ||
                  var15.state == 6 ||
                  4 == var15.state) &&
                  !var15.field_V) {
                  var3 = var15.getX(true) - this.getX(true);
                  var4 = var15.getY(237239984) - this.getY(237239984);
                  var5 = var4 * var4 + var3 * var3;
                  if (529 > var5 &&
                    var6.a(var15.getY(237239984), this.getY(237239984), var15.getX(true), this.getX(true), 106) != -1) {
                    this.setState(21, -6904);
                    this.field_zb = 50;
                    if (!var15.field_ob) {
                      var15.setState(21, -6904);
                      if (0 >= var3) {
                        var15.field_S = 1;
                        this.field_S = 3;
                      } else {
                        var15.field_S = 3;
                        this.field_S = 1;
                      }
                      var15.field_zb = 50;
                    }
                    var12 = var15.field_y + (var3 << 15);
                    var13 = var15.field_x + (var4 << 15);
                    if (var6.a(var13 >> 16, var15.getY(237239984), var12 >> 16, var15.getX(true), 120) == -1) {
                      var15.targetX = var15.getX(true);
                      var15.targetY = var15.getY(237239984);
                    } else {
                      var15.targetY = var13 >> 16;
                      var15.targetX = var12 >> 16;
                    }
                    var13Lifetime1 = this.field_x - (var4 << 15);
                    var12Lifetime1 = this.field_y - (var3 << 15);
                    if (var6.a(var13Lifetime1 >> 16, this.getY(237239984), var12Lifetime1 >> 16, this.getX(true), 108) == -1) {
                      this.targetY = this.field_x >> 16;
                      this.targetX = this.field_y >> 16;
                    } else {
                      this.targetY = var13Lifetime1 >> 16;
                      this.targetX = var12Lifetime1 >> 16;
                    }
                    return;
                  }
                }
              }
            }
          }
          var8 = this.e((byte) 32);
        }
        stackIn_65_0Lifetime1 = param0;
        if (stackIn_65_0Lifetime1 >= -81) {
          this.C(-127);
        }
        if (var2 != null &&
          this.state != 7 &&
          this.field_Eb == 0 &&
          !this.field_ob) {
          this.targetX = ((Human) (var2)).getX(true);
          this.targetY = ((Human) (var2)).getY(237239984);
          this.moveToward(0, 114688);
          this.setState(7, -6904);
          this.field_Eb = 0;
          this.field_wb = (Human) (var2);
        }
        return;
    }

    final void a(byte param0, Camera param1) {
        Sprite stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_37_2 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        var8 = ZombieDawn.field_J;
        try {
          if (this.field_J) {
            return;
          }
          var3_int = param1.worldToScreenX(this.getX(true), (byte) -112) - 24;
          var4 = param1.worldToScreenY(this.getY(237239984), 0) - 48;
          if (this.state == 8) {
            ki.a((byte) -99, md.field_vb);
            Rasterizer.clear();
            DualLinkNode.field_k[cg.field_d[8] + this.field_G + this.field_Cb].drawTransparent(0, 0);
            pa.a(-21189);
            ho.a(md.field_vb, this.o((byte) -83), this.field_fb, -128);
            md.field_vb.drawTransparent(this.field_kb + var3_int, var4 + this.field_mb);
            return;
          }
          if (param0 > -76) {
            field_Fb = (Sprite[][]) null;
          }
          if (this.field_tb &&
            5 == this.state ||
            this.state == 7) {
            lb.field_eb[7].e(param1.worldToScreenX(this.field_jb, (byte) -72), param1.worldToScreenY(this.field_ib, 0), this.field_ub);
          }
          if (Mover.field_Q) {
            bj.field_q.drawString(this.n(-30), var3_int, var4, 16777215, 0);
            if (5 == this.state ||
              12 == this.state) {
              this.a(param1, -1);
            }
          }
          if (null != this.field_U) {
            if (this.field_U.isSamplePositionOutOfRange()) {
              this.field_U = null;
            } else {
              this.field_U.h(pj.a(var4, 68, var3_int));
            }
          }
          if (var3_int >= -48 &&
            -48 <= var4 &&
            qj.field_d >= var3_int &&
            me.field_Bb >= var4) {
            if (this.state != 17) {
              stackIn_36_0 = DualLinkNode.field_k[1];
              stackIn_36_1 = 12;
              if (this.field_S == 3) {
                stackIn_37_2 = -5 + var3_int;
              } else {
                stackIn_37_2 = var3_int;
              }
              so.drawTransparent(stackIn_36_0, stackIn_36_1 + stackIn_37_2, var4 + 43);
            }
            var5 = cg.field_d[this.state] + this.field_G;
            if (this.field_ob &&
              var5 < 14) {
              var5 += 49;
            }
            if (this.field_eb) {
              var5 = 30;
            }
            ki.a((byte) -100, md.field_vb);
            Rasterizer.clear();
            if (this.field_S != 3) {
              ad.field_g[this.field_t][var5].drawTransparent(3, 3);
            } else {
              ad.field_g[this.field_t][var5].drawMirrored(3, 3);
            }
            ho.a(md.field_vb, this.o((byte) -101), this.field_fb, -111);
            if (0 < this.field_Ab) {
              if (this.field_Ab == 2) {
                so.a(0, 0, 54, 54, 16755200);
                so.a(0, 0, 54, 54, 16711680);
              } else {
                so.a(0, 0, 54, 54, 16742144);
              }
            }
            pa.a(-21189);
            if (this.field_bb > 0) {
              var6 = 72;
              if (this.field_bb / 2 < 24) {
                var6 = this.field_bb / 2 + 48;
              } else {
                if (this.field_bb > 952) {
                  var6 = 48 + (-this.field_bb + 1000) / 2;
                }
              }
              md.field_vb.drawScaledWithOpacity(-((-48 + var6) / 2) + var3_int, var4 - (-48 + var6), var6, var6, 128);
            }
            if (0 >= this.field_Z) {
              if (this.field_eb &&
                0L == (tp.field_p & 1L)) {
                md.field_vb.drawSilhouette(-3 + var3_int, -3 + var4, 16777215);
              } else {
                md.field_vb.drawTransparent(var3_int - 3, var4 - 3);
              }
            } else {
              md.field_vb.drawTransparentWithOpacity(var3_int - 3, -3 + var4, 142);
            }
            if (kc.field_Q) {
              pc.field_k.drawStringCentered(s.a(1938762664, "<%0>,<%1>", new String[]{Integer.toString(this.field_B), Integer.toString(this.field_u)}), 24 + var3_int, var4 - 5, 16777215, 0);
            }
            if (nk.field_d) {
              var6Lifetime1 = param1.worldToScreenX(this.getX(true), (byte) -96);
              var7 = param1.worldToScreenY(this.getY(237239984), 0);
              Rasterizer.drawCircleOutline(var6Lifetime1, var7, 3, 16711935);
            }
            if (b.field_h) {
              pc.field_k.drawStringCentered(s.a(1938762664, "<%0>", new String[]{Integer.toString(this.field_gb)}), var3_int + 24, var4 - 5, 16777215, 0);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_75_0 = var3;
          stackIn_75_1 = new StringBuilder().append("kd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    final void z(int param0) {
        int fieldTemp$0 = this.field_Ab;
        this.field_Ab = this.field_Ab - 1;
        if (fieldTemp$0 > 0 ||
          this.state == 9) {
          return;
        }
        if (param0 != 0) {
          field_Db = -60;
        }
        if (this.state == 8 &&
          null != this.field_wb) {
          this.field_wb.q(118);
        }
        this.setState(9, param0 - 6904);
        this.l((byte) -124);
    }

    private final boolean o(byte param0) {
        int var2 = -105 / ((69 - param0) / 41);
        return this.field_t == 0 ? true : false;
    }

    private final void l(byte param0) {
        if (0 < this.field_bb) {
          this.field_bb = 0;
        }
        if (param0 >= -118) {
          this.s(-3);
        }
    }

    final boolean C(int param0) {
        if (this.n((byte) 25)) {
          return false;
        }
        if (this.field_ob) {
          return false;
        }
        this.setState(19, -6904);
        if (param0 <= -57) {
          return true;
        }
        return false;
    }

    final void setState(int param0, int param1) {
        int var4;
        var4 = ZombieDawn.field_J;
        if (this.state == 9) {
          return;
        }
        super.setState(param0, param1);
        if (7 != this.state) {
          if (9 == this.state &&
            !this.field_J) {
            this.field_U = kh.a(66, false);
          }
        } else {
          if (this.o((byte) 112)) {
            this.field_U = tp.$cfr$intArgs$b$3010b50b2764(37, 15);
          } else {
            this.field_U = tp.$cfr$intArgs$b$3010b50b2764(89, 25);
          }
        }
    }

    final void a(Path param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            !param0.isEmpty((byte) -118)) {
            this.field_db = 0;
            this.field_lb = (Point) (param0.e(0));
            this.field_yb = param0;
            this.field_ub = 0;
            if (null != this.field_lb) {
              this.field_ib = this.field_lb.y - 30;
              this.field_jb = this.field_lb.x - 12;
            }
            if (!param1) {
              return;
            }
            if (!this.n((byte) 25)) {
              this.B(-122);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("kd.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void f(byte param0) {
        this.field_J = true;
        if (param0 != -85) {
          this.field_yb = (Path) null;
        }
        this.setState(22, -6904);
        if (null != this.field_wb) {
          this.field_wb.q(119);
        }
    }

    private final void s(int param0) {
        boolean stackIn_13_0 = false;
        int stackIn_30_0 = 0;
        boolean stackOut_12_0;
        LevelNavigation var2;
        Object var3;
        Object var4;
        IntrusiveNode var5;
        Human var6;
        Path var7;
        int var8;
        int stackIn_30_0Lifetime1;
        var8 = ZombieDawn.field_J;
        if (this.field_V) {
          return;
        }
        if (4 == this.state ||
          this.state == 5 ||
          this.state == 6) {
          if (this.field_fb != 2 &&
            pb.a(so.random, 2, 1) != 0) {
            return;
          }
          var2 = Js5Archive.field_e.navigation;
          var3 = null;
          var4 = null;
          var5 = Js5Archive.field_e.zombies.sentinel.previous;
          while (var5 != Js5Archive.field_e.zombies.sentinel) {
            stackOut_12_0 = var5 instanceof Human;
            stackIn_30_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (stackIn_13_0) {
              var6 = (Human) (var5);
              if (var6.state != 18 &&
                var6.state != 20) {
                var7 = var2.findPath(true, this.getX(true), var6.getY(237239984), var6.getX(true), this.getY(237239984));
                if (var7 != null) {
                  if (this.state == 4 &&
                    pb.a(so.random, 2, param0 - 17303) != 0) {
                    var5 = var5.previous;
                    continue;
                  }
                  if (var4 == null ||
                    !(((Path) (var4)).field_g <= var7.field_g)) {
                    var4 = var7;
                    var3 = var6;
                  }
                }
              }
            }
            var5 = var5.previous;
          }
          if (var3 != null) {
            this.a((Path) (var4), true);
          }
        }
        stackIn_30_0Lifetime1 = param0;
        if (stackIn_30_0Lifetime1 != 17304) {
          this.q((byte) -65);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6;
        int var7;
        boolean stackIn_13_0 = false;
        int var6Lifetime1;
        int var6Lifetime2;
        if (param1 > param0) {
          var6 = param1;
          param1 = param0;
          param0 = var6;
        }
        if (param2 < param3) {
          var6Lifetime1 = param3;
          param3 = param2;
          param2 = var6Lifetime1;
        }
        if (param4) {
          return true;
        }
        var6Lifetime2 = this.getX(true);
        var7 = -24 + this.getY(237239984);
        stackIn_13_0 = (param1 < var6Lifetime2) && (param0 > var6Lifetime2) && (param3 < var7) && (var7 < param2);
        return stackIn_13_0;
    }

    private final void a(Camera param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        IntrusiveNode var7 = null;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        var8 = ZombieDawn.field_J;
        try {
          var3_int = param0.worldToScreenX(this.getX(true), (byte) -105);
          var4 = param0.worldToScreenY(this.getY(param1 ^ -237239985), 0);
          var5 = param0.worldToScreenX(this.targetX, (byte) -112);
          var6 = param0.worldToScreenY(this.targetY, 0);
          if (param1 != -1) {
            this.field_qb = true;
          }
          this.a(var4, 0, var3_int, var6, var5);
          if (null == this.field_yb) {
            return;
          }
          var7 = this.field_yb.b((byte) 26);
          while (var7 instanceof Point) {
            var3_intLifetime1 = var5;
            var4Lifetime1 = var6;
            var5 = param0.worldToScreenX(((Point) (var7)).x, (byte) -90);
            var6 = param0.worldToScreenY(((Point) (var7)).y, 0);
            this.a(var4Lifetime1, 0, var3_intLifetime1, var6, var5);
            var7 = var7.previous;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("kd.KA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_Fb = (Sprite[][]) null;
        if (param0 != 54) {
          field_nb = (int[]) null;
        }
        field_nb = null;
    }

    final boolean y(int param0) {
        Camera var3;
        if (param0 < 97) {
          var3 = (Camera) null;
          this.a((byte) 118, (Camera) null);
        }
        this.speedScale = 8;
        if (5 == this.state) {
          this.moveToward(0, 57344);
        } else {
          if (7 == this.state) {
            this.moveToward(0, 114688);
          }
        }
        return true;
    }

    final boolean i(byte param0) {
        if (param0 != -126) {
          this.field_vb = 16;
        }
        return 0 == this.field_fb ? true : false;
    }

    final void k(byte param0) {
        if (null != this.field_wb) {
          this.field_wb.field_kb = true;
        }
        int var2 = -123 % ((param0 + 31) / 37);
    }

    final boolean n(byte param0) {
        boolean stackIn_16_0 = false;
        if (param0 != 25) {
          this.field_Cb = 21;
        }
        stackIn_16_0 = (this.state == 8) || (this.state == 9) || (this.state == 22) || (this.state == 12) || (this.state == 7) || (13 == this.state) || (this.state == 14) || (this.state == 15) || (this.state == 17) || (19 == this.state) || (this.field_V);
        return stackIn_16_0;
    }

    final void v(int param0) {
        if (param0 != -23221) {
          this.field_Ab = -49;
        }
        this.field_ob = true;
    }

    final void q(byte param0) {
        if (param0 > -91) {
          return;
        }
        this.field_tb = false;
        this.unlinkSecondary((byte) -67);
    }

    final boolean m(byte param0) {
        if (0 < this.field_Ab) {
          return false;
        }
        this.field_Ab = 2;
        int var2 = 99 % ((param0 - 57) / 47);
        return true;
    }

    final void k(int param0) {
        this.z(param0);
    }

    Zombie(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, 57344);
        this.field_ub = 0;
        this.field_sb = 200;
        this.field_rb = null;
        this.field_ob = false;
        this.field_bb = 0;
        this.field_tb = false;
        this.field_xb = 0;
        this.field_Bb = 0;
        this.field_zb = 0;
        this.field_wb = null;
        this.field_hb = false;
        this.field_mb = 0;
        this.field_cb = false;
        this.field_Ab = 0;
        this.field_gb = 0;
        this.field_kb = 0;
        this.field_Gb = 0;
        this.velocityY = 0;
        this.velocityX = 0;
        this.field_fb = param3;
        this.field_vb = pb.a(so.random, 5, 1);
        this.field_db = pb.a(so.random, 120, 1);
        if (this.field_fb != 0) {
          this.field_gb = pb.a(so.random, this.field_sb, 1);
        }
    }

    final boolean x(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 < 24) {
          return true;
        }
        stackIn_6_0 = (!this.field_ob) && (this.state != 9);
        return stackIn_6_0;
    }

    final void c(int param0, int param1, int param2) {
        if (this.n((byte) 25) &&
          this.state != 7) {
          return;
        }
        int var4 = 120;
        int var5 = -this.getX(true) + param2;
        int var6 = -this.getY(237239984) + param1;
        double var7 = (double)var4 / (double)so.b(var6 * var6 + var5 * var5);
        this.targetX = -(int)(var7 * (double)var5) + this.getX(true);
        this.targetY = -(int)(var7 * (double)var6) + this.getY(237239984);
        int var9 = this.field_S;
        this.moveToward(param0 ^ param0, 401408);
        this.field_S = var9;
        this.setState(12, -6904);
    }

    Zombie(int param0, int param1, boolean param2, int param3) {
        this(param0, param1, param2 ? 0 : 1, param3);
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_3 = 0;
        stackIn_2_1 = param0;
        stackIn_2_2 = param1;
        if (!param2) {
          stackIn_3_3 = 1;
        } else {
          stackIn_3_3 = 0;
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        if (param2) {
          this.C(-72);
        }
        if (this.field_V) {
          return;
        }
        this.targetY = param0;
        this.targetX = param1;
        this.moveToward(0, 28672);
        this.setState(6, -6904);
    }

    final void b(boolean param0) {
        if (this.field_bb <= 0) {
        }
        if (!param0) {
          return;
        }
        this.field_bb = 1000;
        this.field_ob = false;
    }

    final void j(byte param0) {
        if (param0 != 82) {
          this.field_ib = -106;
        }
        if (null == this.field_lb) {
          return;
        }
        this.field_yb = Js5Archive.field_e.navigation.findPath(true, this.getX(true), this.field_lb.y, this.field_lb.x, this.getY(237239984));
    }

    final boolean o(int param0) {
        if (this.n((byte) 25)) {
          return false;
        }
        if (param0 <= 33) {
          this.f((byte) -56);
        }
        this.setState(17, -6904);
        return true;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 0) {
          this.a(-104, -36, -28, 47, -27);
        }
        int var6 = 16711935;
        Rasterizer.drawLine(param2, param0, param4, param3, var6);
        Rasterizer.fillCircle(param4, param3, 1, var6);
    }

    final void r(int param0) {
        this.field_tb = true;
        this.field_ub = 0;
        if (param0 != -31340) {
          this.A(56);
        }
    }

    final void B(int param0) {
        Point var2;
        int var3;
        if (null != this.field_yb &&
          !this.field_yb.isEmpty((byte) -122)) {
          var2 = (Point) (this.field_yb.removeLast(29));
          this.targetX = var2.x;
          this.targetY = var2.y;
          var3 = -39 / ((-49 - param0) / 54);
          this.setState(5, -6904);
          this.moveToward(0, 57344);
          return;
        }
        this.field_yb = null;
        this.field_lb = null;
        this.setState(4, -6904);
    }

    final void j(int param0) {
        super.j(87);
        if (param0 < 66) {
          this.field_Bb = 8;
        }
        this.setState(4, -6904);
        this.q((byte) -125);
    }

    final void g(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_89_0 = 0;
        GameWorld stackIn_119_0;
        int stackIn_119_1;
        Human stackIn_119_2;
        int stackIn_119_3;
        boolean stackIn_119_4;
        Point stackIn_120_5 = null;
        boolean stackOut_10_0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        kc var8;
        va var9;
        int stackIn_21_0Lifetime1;
        var7 = ZombieDawn.field_J;
        var9 = this.m(91);
        this.d(this.state, -26109);
        if (this.field_bb > 0) {
          fieldTemp$0 = this.field_bb - 1;
          this.field_bb = this.field_bb - 1;
          if (fieldTemp$0 > 0) {
          }
        }
        if (0 < this.field_fb) {
          fieldTemp$1 = this.field_gb - 1;
          this.field_gb = this.field_gb - 1;
          if (fieldTemp$1 < 0) {
            this.field_gb = this.field_sb;
            this.s(17304);
          }
        }
        if (!this.field_eb) {
          var8 = (kc) (rg.field_J.c((byte) 34));
          while (var8 != null) {
            stackOut_10_0 = var8.a(113, this);
            stackIn_21_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (stackIn_11_0) {
              if (this.field_Ab > 0) {
                fieldTemp$2 = this.field_Gb - 1;
                this.field_Gb = this.field_Gb - 1;
                if (fieldTemp$2 <= 0) {
                  this.field_Gb = 12;
                  this.field_Ab = this.field_Ab - 1;
                }
              }
              if (0 >= this.field_Ab) {
                this.field_Gb = 0;
                this.field_eb = true;
                kh.a(95, false);
                this.z(0);
                ck.a(-13, 6836);
              }
            }
            var8 = (kc) (rg.field_J.a((byte) 116));
          }
        }
        stackIn_21_0Lifetime1 = param0;
        if (stackIn_21_0Lifetime1 <= 95) {
          this.s(16);
        }
        if (this.state != 4) {
          if (this.state == 5) {
            if (this.field_Eb > 0) {
              this.field_Eb = this.field_Eb - 1;
            }
            boolean decompiledFrameRemainder1 = true;
            this.q(1);
            this.g((byte) -127);
            if (var9 != null) {
              if (var9.field_h * this.velocityX >= 0 &&
                0 <= var9.field_i * this.velocityY && (0 != var9.field_h ||
                var9.field_i != 0)) {
                this.field_xb = this.field_xb + 1;
                if (!(2250 >= this.field_xb)) {
                  Js5Archive.field_e.a(240, 15, (byte) -23);
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                this.field_xb = 0;
              }
            }
            if (this.h((byte) -126) ||
              this.velocityX == 0 &&
              this.velocityY == 0) {
              this.B(123);
            }
            if (this.field_tb &&
              this.field_ub < 128) {
              this.field_ub = this.field_ub + 8;
            }
            this.A(-128);
          } else {
            if (6 == this.state) {
              if (this.field_Eb > 0) {
                this.field_Eb = this.field_Eb - 1;
              }
              this.g((byte) 64);
              if (this.h((byte) -100) ||
                0 == this.velocityX &&
                this.velocityY == 0) {
                this.setState(4, -6904);
              }
              this.A(-96);
            } else {
              if (this.state == 21) {
                fieldTemp$3 = this.field_zb - 1;
                this.field_zb = this.field_zb - 1;
                if (fieldTemp$3 <= 0) {
                  this.field_zb = 35;
                  this.setState(4, -6904);
                  this.j((byte) 82);
                  this.B(41);
                }
                var3 = 16384;
                if (this.targetY > (this.field_x >> 16)) {
                  this.field_x = this.field_x + var3;
                } else {
                  if (this.targetY < (this.field_x >> 16)) {
                    this.field_x = this.field_x - var3;
                  }
                }
                if (this.field_y >> 16 >= this.targetX) {
                  if (this.targetX < this.field_y >> 16) {
                    this.field_y = this.field_y - var3;
                  }
                } else {
                  this.field_y = this.field_y + var3;
                }
              } else {
                if (this.state == 7) {
                  regionExit1: {
                    if (this.field_wb.state != 18 &&
                      this.field_wb.state != 20) {
                      fieldTemp$4 = this.field_Eb;
                      this.field_Eb = this.field_Eb + 1;
                      if (fieldTemp$4 <= 60 &&
                        !this.field_wb.field_V) {
                        if ((this.field_wb.state == 1 ||
                          2 == this.field_wb.state)) {
                          var3 = this.field_wb.getX(true);
                          var4 = this.field_wb.getY(237239984);
                          var5 = -var3 + this.getX(true);
                          var6 = this.getY(237239984) - var4;
                          if (var6 * var6 + var5 * var5 <= 6410 &&
                            Js5Archive.field_e.navigation.a(var4, this.getY(237239984), var3, this.getX(true), 114) != -1) {
                            this.targetY = var4;
                            this.targetX = var3;
                            this.moveToward(0, 114688);
                          } else {
                            this.j((byte) 82);
                            this.B(-128);
                          }
                        }
                        break regionExit1;
                      }
                    }
                    this.field_wb = null;
                    this.j((byte) 82);
                    this.B(-118);
                  }
                  this.g((byte) 44);
                  this.A(-88);
                } else {
                  if (this.state == 8) {
                    this.field_ob = false;
                    if ((this.field_G == 0 ||
                      2 == this.field_G) && 0 == this.field_N) {
                      var3 = 0;
                      if (0 == pb.a(so.random, 3, 1)) {
                        if (this.field_wb.t(10)) {
                          var3 = 40 + pb.a(so.random, 4, 1);
                        } else {
                          var3 = 37 + pb.a(so.random, 3, 1);
                        }
                      } else {
                        var3 = pb.a(so.random, 5, 1) + 30;
                      }
                      this.field_U = tp.$cfr$intArgs$b$3010b50b2764(71, var3);
                    }
                    fieldTemp$5 = this.field_zb - 1;
                    this.field_zb = this.field_zb - 1;
                    if (0 >= fieldTemp$5) {
                      this.field_wb.o(-6253);
                      stackIn_119_0 = Js5Archive.field_e;
                      stackIn_119_1 = this.field_fb;
                      stackIn_119_2 = this.field_wb;
                      stackIn_119_3 = 60;
                      stackIn_119_4 = this.field_tb;
                      if (null == this.field_yb) {
                        stackIn_120_5 = null;
                      } else {
                        stackIn_120_5 = this.field_lb;
                      }
                      ((GameWorld) (Object) stackIn_119_0).a(stackIn_119_1, stackIn_119_2, (byte) stackIn_119_3, stackIn_119_4, stackIn_120_5);
                      this.field_wb = null;
                      this.setState(4, -6904);
                      if (null != this.field_lb) {
                        this.a(Js5Archive.field_e.navigation.findPath(true, this.getX(true), this.field_lb.y, this.field_lb.x, this.getY(237239984)), true);
                      }
                    } else {
                      if (this.field_zb == 30) {
                        Js5Archive.field_e.a(this.field_wb.getY(237239984), false, 118, this.field_wb.getX(true));
                      }
                    }
                  } else {
                    if (this.state != 9) {
                      if (this.state == 12) {
                        this.field_ob = false;
                        this.g((byte) 23);
                        stackIn_89_0 = (Js5Archive.field_e.navigation.isWalkable(false, this.getY(237239984), this.getX(true), true)) ? 0 : 1;
                        var3 = stackIn_89_0;
                        if (var3 != 0) {
                          this.field_y = this.field_y - this.velocityX;
                          var3 = 0;
                          this.field_x = this.field_x - this.velocityY;
                          if (this.velocityX != 0 &&
                            Js5Archive.field_e.navigation.isWalkable(false, this.getY(237239984), this.field_y + this.velocityX >> 16, true)) {
                            this.velocityY = 0;
                            this.targetY = this.field_x >> 16;
                            this.field_y = this.field_y + this.velocityX;
                          } else {
                            if (0 != this.velocityY &&
                              Js5Archive.field_e.navigation.isWalkable(false, this.velocityY + this.field_x >> 16, this.field_y >> 16, true)) {
                              this.targetX = this.field_y >> 16;
                              this.field_x = this.field_x + this.velocityY;
                              this.velocityX = 0;
                            } else {
                              var3 = 1;
                            }
                          }
                        }
                        if (var3 != 0 ||
                          this.h((byte) -11)) {
                          this.j((byte) 82);
                          this.B(27);
                        }
                      } else {
                        if (this.state == 13) {
                          if (this.field_ob) {
                            this.field_G = 2;
                          }
                          if (2 == this.field_G) {
                            this.field_G = 0;
                            this.field_ob = false;
                            Js5Archive.field_e.b(0, this.getY(237239984), true, this.getX(true));
                            this.setState(4, -6904);
                          }
                        } else {
                          if (14 == this.state) {
                            this.field_ob = false;
                            this.field_S = 1;
                            if (this.field_G == 4) {
                              Js5Archive.field_e.zombies.addFirst(0, new vb(this.getX(true), this.getY(237239984), this.field_t));
                              this.setState(4, -6904);
                              this.field_db = 2;
                            }
                          } else {
                            if (this.state == 15) {
                              if (this.field_G == 4) {
                                this.field_N = this.field_N - 1;
                                this.field_ob = false;
                                if (null != this.field_rb) {
                                  if (this.field_rb.field_m != this.getX(true)) {
                                    this.field_rb.field_m = this.getX(true);
                                    this.field_rb.field_q = this.getY(237239984);
                                  }
                                } else {
                                  this.field_rb = new nc(this.getX(true), -30 + this.getY(237239984));
                                  Js5Archive.field_e.field_e.addFirst(0, this.field_rb);
                                }
                                if (this.field_rb.c(123)) {
                                  this.field_rb.unlink(-27598);
                                  this.field_rb = null;
                                  this.setState(4, -6904);
                                }
                              }
                            } else {
                              if (17 == this.state) {
                                if (this.field_G == 3 &&
                                  this.field_N == 0) {
                                  Js5Archive.field_e.c(this.getX(true), 54, this.getY(237239984));
                                }
                                if (this.field_G == 7) {
                                  Js5Archive.field_e.a(this, true);
                                }
                              } else {
                                if (this.state == 19 &&
                                  5 == this.field_G) {
                                  this.field_ob = true;
                                  this.l((byte) -121);
                                  this.setState(4, -6904);
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (this.field_Gb != 0) {
                        this.field_y = this.field_y + (this.field_Gb << 16);
                      }
                      if (this.field_G == 5) {
                        Js5Archive.field_e.a(this.getY(237239984), this.field_eb, 111, this.getX(true));
                        Js5Archive.field_e.a(this, true);
                        if (this.field_rb != null) {
                          this.field_rb.c((byte) -64);
                          this.field_rb.unlink(-27598);
                          this.field_rb = null;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          if (this.field_ob &&
            this.field_G < 2) {
            this.field_N = this.field_N + 3;
          }
          if (0 < this.field_db) {
            this.field_db = this.field_db - 1;
          }
          if (this.field_Eb > 0) {
            this.field_Eb = this.field_Eb - 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_db != 1 && (!(this.speedScale > 4) ||
            this.field_ob)) {
            if ((this.field_db == 0)) {
              this.field_db = 60 + pb.a(so.random, 60, 1);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var3 = this.getX(true) - (-pb.a(so.random, 48, 1) + 24);
            var4 = this.getY(237239984) + (pb.a(so.random, 48, 1) - 24);
            if (Js5Archive.field_e.navigation.isWalkable(false, var4, var3, true)) {
              this.a(var4, var3, false);
            } else {
              this.field_db = this.field_db + 1;
            }
          }
          this.A(-108);
        }
    }

    final boolean p(int param0) {
        if (this.n((byte) 25)) {
          return false;
        }
        this.setState(13, -6904);
        if (param0 != 11312) {
          this.field_ub = -65;
          return true;
        }
        return true;
    }

    static {
        field_Db = -1;
        field_Fb = new Sprite[10][];
        field_nb = new int[10];
    }
}
