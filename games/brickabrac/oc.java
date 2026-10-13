/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class oc extends IntrusiveNode {
    int field_r;
    ep field_j;
    static jg field_k;
    int field_n;
    int field_s;
    static String[] field_v;
    boolean field_q;
    String field_A;
    int field_t;
    static TextFont field_m;
    static long field_p;
    static String field_u;
    int field_o;
    ub field_l;
    static int[] field_y;
    static RgbSprite field_x;
    int field_B;
    uh field_i;
    String field_z;
    int field_w;

    final void e(int param0) {
        if (param0 != 1) {
          return;
        }
        this.a(this.field_s, this.field_o, this.field_w, (byte) -119, this.field_t);
    }

    void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        try {
          this.field_n = 0;
          if (param4 != 19223) {
            field_y = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "oc.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3, int param4) {
        this.field_s = param0;
        if (param3 == -119) {
          this.field_t = param4;
          this.field_w = param2;
          this.field_o = param1;
          return;
        }
        this.a(28, 90, 95, (byte) 89, -101);
        this.field_t = param4;
        this.field_w = param2;
        this.field_o = param1;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = this.e((byte) -79);
        var5_int = param2;
        while (var5_int <= var4) {
          this.a(param1, param0, var5_int, (byte) -11);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = BlankScreen.d((byte) 63);
        if (var5 == null) {
          return;
        }
        bj.field_T.a(true, ad.field_j, b.field_a, var5);
    }

    final static void a(int param0, int param1, int param2, PlayerBoard param3, MultiplayerMatch param4, byte param5) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var6_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        try {
          if (param4.playerCount == 1) {
            if (r.field_A) {
              stackIn_8_0 = (ka.a((byte) 88)) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
          } else {
            stackIn_8_0 = 0;
          }
          var6_int = stackIn_8_0;
          stackIn_11_0 = var6_int;
          if (8 != ga.field_i &&
            ga.field_i != 9) {
            stackIn_13_1 = 0;
          } else {
            stackIn_13_1 = 1;
          }
          var6_intLifetime1 = stackIn_11_0 & stackIn_13_1;
          var7 = MembershipBenefitsScreen.field_x - SpriteGeometry.field_v;
          gg.field_p[param1].drawTransparent(param2, param0);
          if (var6_intLifetime1 != 0) {
            gg.field_p[param1].f(param2, param0, 64 + (sa.a(200 * var7, -4097) >> 10));
          }
          param2 += 7;
          param0--;
          var8 = LevelPackSelectScreen.field_r.width + param2 - 5;
          Rasterizer2D.fillRectangle(var8, param0 + 1, 4, LevelPackSelectScreen.field_r.height - 2, 16777215);
          if (param5 <= 106) {
            oc.a(120, (TextFont) null);
          }
          var9 = param3.field_cb[param1] >> 8;
          var10 = LevelPackSelectScreen.field_r.height + (param0 - 1);
          if (var9 > 0) {
            stackIn_22_0 = (var9 <= 3) ? var9 : 3;
            var11 = stackIn_22_0;
            Rasterizer2D.fillRectangle(var8, var10 - var11, 4, var11, 16735667);
            var10 -= 3;
          }
          if (var9 > 3) {
            if (var9 > 7) {
              stackIn_27_0 = 4;
            } else {
              stackIn_27_0 = -3 + var9;
            }
            var11Lifetime1 = stackIn_27_0;
            Rasterizer2D.fillRectangle(var8, -var11Lifetime1 + var10, 4, var11Lifetime1, 15876234);
            var10 -= 4;
          }
          if (7 < var9) {
            if (var9 > 13) {
              stackIn_32_0 = 6;
            } else {
              stackIn_32_0 = -7 + var9;
            }
            var11Lifetime2 = stackIn_32_0;
            Rasterizer2D.fillRectangle(var8, -var11Lifetime2 + var10, 4, var11Lifetime2, 15410040);
            var10 -= 6;
          }
          if (var9 > 13) {
            if (var9 <= 20) {
              stackIn_38_0 = -13 + var9;
            } else {
              stackIn_38_0 = 7;
            }
            var11Lifetime3 = stackIn_38_0;
            Rasterizer2D.fillRectangle(var8, var10 - var11Lifetime3, 4, var11Lifetime3, 13245286);
          }
          if (var9 >= 20) {
            Rasterizer2D.fillRectangleAlpha(var8, param0 + LevelPackSelectScreen.field_r.height - 21, 4, 20, 16777215, (sa.a(200 * MembershipBenefitsScreen.field_x, -4097) >> 10) + 64);
          }
          LevelPackSelectScreen.field_r.drawTransparent(param2, param0);
          if (var6_intLifetime1 != 0) {
            LevelPackSelectScreen.field_r.f(param2, param0, (sa.a(400 * var7, -4097) >> 10) + 64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_48_0 = var6;
          stackIn_48_1 = new StringBuilder().append("oc.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param4 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param5).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(0, new Hashtable(), 24, new StringBuilder()).toString();
    }

    final boolean a(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        dn var8;
        dn var9;
        dn var10;
        dn var11;
        dn var12;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        int var6Lifetime6;
        int var6Lifetime7;
        int var6Lifetime8;
        int var6Lifetime9;
        int var6Lifetime10;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var6Lifetime1Lifetime3;
        int var6Lifetime2Lifetime1;
        int var6Lifetime2Lifetime2;
        int var6Lifetime2Lifetime3;
        int var6Lifetime2Lifetime4;
        var7 = BrickABrac.field_J ? 1 : 0;
        this.a(this, (byte) 0, param1, param0);
        var5 = this.f(-123) ? 1 : 0;
        if (!param3) {
          if (var5 == 0) {
            var6 = -57 % ((56 - param2) / 43);
            hj.field_Pb = cb.heldButton;
            ka.a(this.d(15), 22546);
            return param3;
          }
          if (ki.pressedButton == 0) {
            var6Lifetime6 = -57 % ((56 - param2) / 43);
            hj.field_Pb = cb.heldButton;
            ka.a(this.d(15), 22546);
            return param3;
          }
          this.b(false);
          if (var7 == 0) {
            var6Lifetime7 = -57 % ((56 - param2) / 43);
            hj.field_Pb = cb.heldButton;
            ka.a(this.d(15), 22546);
            return param3;
          }
          if (0 != GameplayAudioEvent.mouseWheelDelta &&
            var5 != 0) {
            this.a(GameplayAudioEvent.mouseWheelDelta, pq.pointerX, param0, -127, po.pointerY, this, param1);
          }
          if (ki.pressedButton != 0) {
            if (this.a(this, tb.pressX, param1, param0, ki.pressedButton, qo.pressY, 0)) {
              param3 = false;
            }
            this.b(false);
          }
          if (0 != cb.heldButton) {
            var6Lifetime8 = -57 % ((56 - param2) / 43);
            hj.field_Pb = cb.heldButton;
            ka.a(this.d(15), 22546);
            return param3;
          }
          if (hj.field_Pb == 0) {
            var6Lifetime9 = -57 % ((56 - param2) / 43);
            hj.field_Pb = cb.heldButton;
            ka.a(this.d(15), 22546);
            return param3;
          }
          this.a(po.pointerY, pq.pointerX, param0, this, 19223, param1);
          var8 = gd.field_c;
          if (var8 != null) {
            if (var8.field_i instanceof em) {
              ((em) (var8.field_i)).a(-24178, var8, (jb) null);
            }
            gd.field_c = null;
          }
          var6Lifetime10 = -57 % ((56 - param2) / 43);
          hj.field_Pb = cb.heldButton;
          ka.a(this.d(15), 22546);
          return param3;
        }
        if (0 != GameplayAudioEvent.mouseWheelDelta) {
          if (var5 == 0) {
            regionExit1: {
              if (ki.pressedButton != 0) {
                if (this.a(this, tb.pressX, param1, param0, ki.pressedButton, qo.pressY, 0)) {
                  param3 = false;
                  if (var7 == 0) {
                    break regionExit1;
                  }
                }
                if (0 == cb.heldButton &&
                  hj.field_Pb != 0) {
                  this.a(po.pointerY, pq.pointerX, param0, this, 19223, param1);
                  var9 = gd.field_c;
                  if (var9 != null) {
                    if (!(var9.field_i instanceof em)) {
                      gd.field_c = null;
                    } else {
                      ((em) (var9.field_i)).a(-24178, var9, (jb) null);
                      gd.field_c = null;
                    }
                  }
                }
                var6Lifetime1 = -57 % ((56 - param2) / 43);
                hj.field_Pb = cb.heldButton;
                ka.a(this.d(15), 22546);
                return param3;
              }
            }
            if (0 != cb.heldButton) {
              var6Lifetime1Lifetime1 = -57 % ((56 - param2) / 43);
              hj.field_Pb = cb.heldButton;
              ka.a(this.d(15), 22546);
              return param3;
            }
            if (hj.field_Pb == 0) {
              var6Lifetime1Lifetime2 = -57 % ((56 - param2) / 43);
              hj.field_Pb = cb.heldButton;
              ka.a(this.d(15), 22546);
              return param3;
            }
            this.a(po.pointerY, pq.pointerX, param0, this, 19223, param1);
            var10 = gd.field_c;
            if (var10 != null) {
              if (var10.field_i instanceof em) {
                ((em) (var10.field_i)).a(-24178, var10, (jb) null);
              }
              gd.field_c = null;
            }
            var6Lifetime1Lifetime3 = -57 % ((56 - param2) / 43);
            hj.field_Pb = cb.heldButton;
            ka.a(this.d(15), 22546);
            return param3;
          }
          this.a(GameplayAudioEvent.mouseWheelDelta, pq.pointerX, param0, -127, po.pointerY, this, param1);
        }
        regionExit2: {
          if (ki.pressedButton != 0) {
            if (this.a(this, tb.pressX, param1, param0, ki.pressedButton, qo.pressY, 0)) {
              param3 = false;
              if (var7 == 0) {
                break regionExit2;
              }
            }
            if (var5 == 0) {
              if (0 != cb.heldButton) {
                var6Lifetime2 = -57 % ((56 - param2) / 43);
                hj.field_Pb = cb.heldButton;
                ka.a(this.d(15), 22546);
                return param3;
              }
              if (hj.field_Pb == 0) {
                var6Lifetime2Lifetime1 = -57 % ((56 - param2) / 43);
                hj.field_Pb = cb.heldButton;
                ka.a(this.d(15), 22546);
                return param3;
              }
              this.a(po.pointerY, pq.pointerX, param0, this, 19223, param1);
              var11 = gd.field_c;
              if (var11 == null) {
                var6Lifetime2Lifetime2 = -57 % ((56 - param2) / 43);
                hj.field_Pb = cb.heldButton;
                ka.a(this.d(15), 22546);
                return param3;
              }
              if (!(var11.field_i instanceof em)) {
                gd.field_c = null;
                var6Lifetime2Lifetime3 = -57 % ((56 - param2) / 43);
                hj.field_Pb = cb.heldButton;
                ka.a(this.d(15), 22546);
                return param3;
              }
              ((em) (var11.field_i)).a(-24178, var11, (jb) null);
              gd.field_c = null;
              var6Lifetime2Lifetime4 = -57 % ((56 - param2) / 43);
              hj.field_Pb = cb.heldButton;
              ka.a(this.d(15), 22546);
              return param3;
            }
            this.b(false);
          }
        }
        if (0 != cb.heldButton) {
          var6Lifetime3 = -57 % ((56 - param2) / 43);
          hj.field_Pb = cb.heldButton;
          ka.a(this.d(15), 22546);
          return param3;
        }
        if (hj.field_Pb == 0) {
          var6Lifetime4 = -57 % ((56 - param2) / 43);
          hj.field_Pb = cb.heldButton;
          ka.a(this.d(15), 22546);
          return param3;
        }
        this.a(po.pointerY, pq.pointerX, param0, this, 19223, param1);
        var12 = gd.field_c;
        if (var12 != null) {
          if (var12.field_i instanceof em) {
            ((em) (var12.field_i)).a(-24178, var12, (jb) null);
          }
          gd.field_c = null;
        }
        var6Lifetime5 = -57 % ((56 - param2) / 43);
        hj.field_Pb = cb.heldButton;
        ka.a(this.d(15), 22546);
        return param3;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= -125) {
            return false;
          }
          this.field_j = (ep) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("oc.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, TextFont param1) {
        try {
          wp.field_c = param1;
          bq.field_b = new ck();
          bj.field_P = new ck();
          if (param0 != 1) {
            oc.c(16);
          }
          ff.field_d = new NodeDeque();
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "oc.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        if (param2 != 0) {
          if (param3 == -11) {
            return;
          }
          this.a(5, -67, -79, true);
          return;
        }
        if (null == this.field_l) {
          if (param3 == -11) {
            return;
          }
          this.a(5, -67, -79, true);
          return;
        }
        this.field_l.a(true, param3 - 20607, param1, this, param0);
        if (param3 == -11) {
          return;
        }
        this.a(5, -67, -79, true);
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 24) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param3, 1595637992, param0, param1)) {
            this.a(param1, param0, 0, param3);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("oc.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1595637992) {
            this.field_w = -128;
          }
          if (!param3.containsKey(this)) {
            param3.put(this, this);
            return true;
          }
          discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("oc.EA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, boolean param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.f(-86)) {
          var4 = param1;
          if (var4 == 80) {
            return this.a(true, this);
          }
          if (param2) {
            return false;
          }
          field_p = -38L;
          return false;
        }
        if (this.a(param1, (byte) 110, this, param0)) {
          return true;
        }
        var4Lifetime1 = param1;
        if (var4Lifetime1 == 80) {
          return this.a(true, this);
        }
        if (param2) {
          return false;
        }
        field_p = -38L;
        return false;
    }

    int e(byte param0) {
        int var2 = 88 / ((-17 - param0) / 43);
        return 0;
    }

    boolean f(int param0) {
        if (param0 > -49) {
          return false;
        }
        return false;
    }

    final static void c(byte param0) {
        if (param0 >= -12) {
          oc.a(89, -103, -10, (PlayerBoard) null, (MultiplayerMatch) null, (byte) 67);
          o.field_d = 0;
          return;
        }
        o.field_d = 0;
    }

    final static void a(tg param0, byte param1, java.awt.Canvas param2) {
        try {
          sj.field_f = new ie();
          sj.field_f.b(0, 9, 128);
          tq.a(22050, true, sj.field_f, param0, 1024, (java.awt.Component) ((Object) param2));
          if (param1 != 60) {
            field_y = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "oc.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_x = null;
        field_u = null;
        field_y = null;
        if (param0 == -14711) {
          field_v = null;
          field_m = null;
          field_k = null;
          return;
        }
        field_p = 65L;
        field_v = null;
        field_m = null;
        field_k = null;
    }

    boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param5, param3, param2, 3, param1)) {
            this.field_n = param4;
          }
          if (param6 == 0) {
            return false;
          }
          this.e((byte) -99);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("oc.MA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 110) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("oc.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int d(byte param0) {
        if (param0 != -59) {
          return 73;
        }
        return 1;
    }

    boolean a(boolean param0, oc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oc.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void b(boolean param0) {
        if (param0) {
          oc.c(-57);
        }
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_w).append(" ").append(this.field_t).append("x").append(this.field_s);
          if (null != this.field_A) {
            discarded$1 = param3.append(" text=\"").append(this.field_A).append('"');
          }
          if (this.field_q) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.f(-102)) {
            discarded$3 = param3.append(" focused");
          }
          if (param2 != 0) {
            this.a((Hashtable) null, 44, -5, (StringBuilder) null);
          }
          if (this.field_l != null) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.field_l instanceof oc)) {
              discarded$5 = param3.append(this.field_l);
              if (var6 != 0) {
                param3 = this.a(param1 + 1, param0, 24, param3);
              }
            } else {
              param3 = this.a(param1 + 1, param0, 24, param3);
            }
          }
          if (null != this.field_i) {
            discarded$6 = param3.append(" listener=");
            if (!(this.field_i instanceof oc)) {
              discarded$7 = param3.append(this.field_i);
              if (var6 != 0) {
                param3 = this.a(1 + param1, param0, 24, param3);
              }
            } else {
              param3 = this.a(1 + param1, param0, 24, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("oc.LA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    oc(String param0, uh param1) {
        this(param0, bj.field_T.field_i, param1);
    }

    void a(oc param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 0) {
            field_u = (String) null;
          }
          var5_int = this.a(po.pointerY, param3, param2, 3, pq.pointerX) ? 1 : 0;
          if ((this.field_q ? 1 : 0) != var5_int) {
            stackIn_7_1 = (var5_int != 0);
            this.field_q = stackIn_7_1;
            if (null != this.field_i) {
              if (!(this.field_i instanceof vk)) {
                return;
              }
              ((vk) (this.field_i)).a(-6932, this, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("oc.WA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 3) {
          return false;
        }
        if (this.field_o + param2 > param4) {
          return false;
        }
        if (param0 < param1 + this.field_w) {
          return false;
        }
        if (param4 >= this.field_t + param2 + this.field_o) {
          return false;
        }
        if (param0 < this.field_s + (this.field_w + param1)) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, long param2, int param3, boolean param4, String param5) {
        int var7_int = 0;
        BitPacketBuffer stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          k.field_h.writeCipheredOpcode(-13413, param1);
          k.field_h.position = k.field_h.position + 1;
          var7_int = k.field_h.position;
          k.field_h.writeLong(-23054, param2);
          k.field_h.writeCp1252String(param5, param3 - 2);
          k.field_h.writeByte(31, param0);
          stackIn_2_0 = k.field_h;
          stackIn_2_1 = -105;
          if (!param4) {
            stackIn_3_2 = 0;
          } else {
            stackIn_3_2 = 1;
          }
          ((BitPacketBuffer) (Object) stackIn_2_0).writeByte(stackIn_2_1, stackIn_3_2);
          k.field_h.backfillByteLength((byte) 114, -var7_int + k.field_h.position);
          if (param3 != 1) {
            field_k = (jg) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("oc.VA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    String d(int param0) {
        if (param0 < 6) {
          this.a(-58, (byte) -3, (oc) null, '*');
          if (this.field_q) {
            return this.field_z;
          }
          return null;
        }
        if (this.field_q) {
          return this.field_z;
        }
        return null;
    }

    protected oc() {
        this.field_r = 0;
        this.field_B = 0;
    }

    oc(String param0, ub param1, uh param2) {
        qe var4 = null;
        this.field_r = 0;
        this.field_B = 0;
        try {
          this.field_A = param0;
          this.field_i = param2;
          this.field_l = param1;
          if (this.field_l instanceof qe) {
            var4 = (qe) ((Object) this.field_l);
            this.field_t = var4.b(this, 31);
            this.field_s = var4.a(this, 46695);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "oc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    oc(int param0, int param1, int param2, int param3, ub param4, uh param5) {
        this.field_r = 0;
        this.field_B = 0;
        try {
          this.field_o = param0;
          this.field_t = param2;
          this.field_i = param5;
          this.field_l = param4;
          this.field_w = param1;
          this.field_s = param3;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "oc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_u = "Brick Extension";
        field_y = new int[]{44, 45, 8, 3};
    }
}
