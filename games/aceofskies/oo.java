/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oo extends dg implements dn {
    static Sprite field_W;
    private ss field_bb;
    private boolean field_cb;
    private BitmapFont field_U;
    private boolean field_V;
    static int[] menuRowSpacing;
    private boolean field_X;
    static IntrusiveDeque field_T;
    static SpriteData[] backgroundSpriteData;
    private boolean field_Z;

    final void l(int param0) {
        if (param0 >= 82) {
          this.field_bb.a(4210752, 2121792, (byte) 61);
          jn var2 = new jn(this, this.field_U, ek.field_x);
          var2.a(15, (byte) -57, ag.field_o);
          this.d(var2, -30244);
          return;
        }
        this.field_bb = (ss) null;
        this.field_bb.a(4210752, 2121792, (byte) 61);
        jn var2Lifetime1 = new jn(this, this.field_U, ek.field_x);
        var2Lifetime1.a(15, (byte) -57, ag.field_o);
        this.d(var2Lifetime1, -30244);
    }

    public void a(int param0, mi param1, int param2, int param3, byte param4) {
        String stackIn_7_2 = null;
        try {
          int var6_int = 80 % ((param4 + 27) / 61);
          if (!this.field_X) {
            vi.a((byte) 103, "tochangedisplayname.ws", bm.m(125));
            return;
          }
          oi.a(3, 20665);
          this.h((byte) -64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oo.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void h(byte param0) {
        int var2 = -58 % ((72 - param0) / 35);
        if (!this.field_z) {
          return;
        }
        this.field_z = false;
        if (this.field_cb) {
          un.a(-21);
          return;
        }
        if (!this.field_V) {
          return;
        }
        aa.b(87);
    }

    public static void g(byte param0) {
        if (param0 != 105) {
          return;
        }
        menuRowSpacing = null;
        field_T = null;
        field_W = null;
        backgroundSpriteData = null;
    }

    oo(lt param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new jn((oo) null, param1, param2), 77, 10, 10);
        try {
          this.field_U = param1;
          this.field_V = param4 ? true : false;
          this.field_Z = false;
          this.field_X = false;
          this.field_cb = param3 ? true : false;
          this.field_bb = new ss(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_bb.field_u = true;
          this.a(this.field_bb, 1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "oo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        String stackIn_9_2 = null;
        try {
          if (13 == param1) {
            this.h((byte) 125);
            return true;
          }
          int var5_int = 48 % ((param0 + 53) / 33);
          boolean stackIn_5_0 = super.a(23, param1, param2, param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("oo.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, String param2) {
        String stackIn_14_3;
        String stackIn_28_2 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.field_Z) {
            return;
          }
          boolean stackIn_7_1 = (256 == param1);
          this.field_X = stackIn_7_1;
          this.field_Z = true;
          this.field_bb.a(4210752, 8405024, (byte) -81);
          int var5 = 85 / ((1 - param0) / 52);
          jn var7 = new jn(this, this.field_U, param2);
          jn var4 = var7;
          if (param1 != 5) {
            if (param1 != 256) {
              jn stackIn_13_0 = var7;
              int stackIn_13_1 = -1;
              int stackIn_13_2 = 124;
              if (this.field_cb) {
                stackIn_14_3 = hg.field_z;
              } else {
                stackIn_14_3 = Bullet.field_j;
              }
              ((jn) (Object) stackIn_13_0).a(stackIn_13_1, (byte) stackIn_13_2, stackIn_14_3);
            } else {
              var7.a((no) (this), 17547, hg.field_z);
            }
          } else {
            var7.a(11, (byte) 113, ln.field_a);
            var7.a(17, (byte) -120, mb.field_s);
          }
          if (param1 == 3) {
            var7.a(7, (byte) 75, lu.field_a);
          } else {
            if (param1 == 4) {
              var7.a(8, (byte) 101, mh.field_n);
            } else {
              if (param1 == 6) {
                var7.a(9, (byte) -124, ao.field_d);
              } else {
                if (param1 == 9) {
                  var7.a((no) (this), 17547, vn.field_g);
                }
              }
            }
          }
          this.d(var7, -30244);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var4_ref;
          StringBuilder stackIn_27_1 = new StringBuilder().append("oo.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_W = new Sprite(270, 70);
        menuRowSpacing = new int[8];
    }
}
