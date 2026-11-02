/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class we extends qk {
    private int field_Ob;
    static String field_Rb;
    static String[] field_Sb;
    private int field_Vb;
    static Sprite field_Ub;
    private int field_Nb;
    static Sprite field_Tb;
    private Zombie field_Qb;
    private int field_Pb;

    final static String p(byte param0) {
        int var1 = 26 % ((31 - param0) / 38);
        if (fk.field_F == vh.field_c) {
          return field_Rb;
        }
        if (tk.field_a == vh.field_c) {
          return Point.field_k;
        }
        if (!gl.field_E.a(96)) {
          return Point.field_k;
        }
        return GameLoopApplet.field_B;
    }

    final void a(Camera param0, int param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        IntrusiveNode var7 = null;
        try {
          var3_int = param0.worldToScreenX(this.getX(true), (byte) -77);
          var4 = param0.worldToScreenY(this.getY(237239984), 0);
          Rasterizer.d(var3_int, var4, this.field_Vb, 255);
          Rasterizer.d(var3_int, var4, this.field_pb, 65535);
          if (this.field_Qb != null) {
            Rasterizer.e(var3_int, var4, param0.worldToScreenX(this.field_Qb.getX(true), (byte) -63), param0.worldToScreenY(this.field_Qb.getY(param1 ^ 237235572), 0), 16711680);
          }
          if (null != this.field_yb) {
            var5_int = param0.worldToScreenX(this.field_yb.getX(true), (byte) -81);
            var6 = param0.worldToScreenY(this.field_yb.getY(param1 + 237234924), param1 ^ 5060);
            Rasterizer.e(var3_int, var4, var5_int, var6, 16776960);
            bj.field_q.drawString(Integer.toString(this.field_yb.state), var5_int, var6 - 48, 16777215, 0);
          }
          if (param1 != 5060) {
            var7 = (IntrusiveNode) null;
            we.a((IntrusiveNode) null, 97, (IntrusiveNode) null);
          }
          Rasterizer.e(var3_int, var4, param0.worldToScreenX(this.targetX, (byte) -94), param0.worldToScreenY(this.targetY, param1 - 5060), 16711935);
          var5 = Integer.toString(this.state);
          bj.field_q.drawString(var5, var3_int, var4 - 48, 16777215, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("we.L(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void x(int param0) {
        field_Sb = null;
        field_Rb = null;
        field_Tb = null;
        field_Ub = null;
        if (param0 != 16777215) {
          field_Ub = (Sprite) null;
        }
    }

    final void l(byte param0) {
        if (param0 != 52) {
          field_Tb = (Sprite) null;
        }
        if (this.a(-117, this.field_Nb, false)) {
          this.m((byte) -123);
          this.z(param0 + 12399);
          return;
        }
        if (this.field_Qb == null) {
          this.y(3);
        } else {
          if (9 == this.field_Qb.state) {
            this.y(3);
          }
        }
        if (null != this.field_Qb) {
          return;
        }
        if (this.state == 0) {
          return;
        }
        this.setState(0, -6904);
    }

    final static boolean o(byte param0) {
        if (param0 != -80) {
          return true;
        }
        if (wo.field_xb == null) {
          return false;
        }
        if (null == wo.field_xb.c(true)) {
          return false;
        }
        return true;
    }

    final void g(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3;
        var3 = ZombieDawn.field_J;
        super.g(103);
        if (param0 <= 95) {
          return;
        }
        if (0 == this.state) {
          if (null != this.field_Qb) {
            this.b(false);
            return;
          }
          fieldTemp$3 = this.field_Ob;
          this.field_Ob = this.field_Ob + 1;
          if (fieldTemp$3 < 50) {
            return;
          }
          this.y(3);
          this.field_Ob = 0;
          return;
        }
        if (this.state != 1) {
          if (10 != this.state) {
            return;
          }
          this.field_N = this.field_N + 3;
          return;
        }
        fieldTemp$0 = this.field_Ob;
        this.field_Ob = this.field_Ob + 1;
        if (fieldTemp$0 < 50) {
          fieldTemp$1 = this.field_Pb;
          this.field_Pb = this.field_Pb + 1;
          if (fieldTemp$1 < 4) {
            return;
          }
          this.l((byte) 52);
          this.field_Pb = 0;
          return;
        }
        this.b(false);
        this.field_Ob = 0;
        fieldTemp$2 = this.field_Pb;
        this.field_Pb = this.field_Pb + 1;
        if (fieldTemp$2 < 4) {
          return;
        }
        this.l((byte) 52);
        this.field_Pb = 0;
        return;
    }

    we(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Ob = 0;
        this.field_Vb = -1;
        this.field_Nb = 125 + (int)(250.0 * Math.random());
        this.field_pb = this.field_Nb;
        this.field_Pb = pb.a(so.random, 4, 1);
    }

    final static void a(IntrusiveNode param0, int param1, IntrusiveNode param2) {
        try {
          if (null != param2.next) {
            param2.unlink(-27598);
          }
          param2.next = param0.next;
          if (param1 != 0) {
            we.w(112);
          }
          param2.previous = param0;
          param2.next.previous = param2;
          param2.previous.next = param2;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "we.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Zombie param0, byte param1) {
        try {
          param0.field_Bb = param0.field_Bb + 1;
          int var3_int = 114 / ((param1 + 3) / 58);
          this.field_Qb = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "we.PA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void o(int param0) {
        this.z(12451);
        if (param0 != -6253) {
          return;
        }
        super.o(param0 + 0);
    }

    private final void b(boolean param0) {
        if (this.field_Qb == null) {
          return;
        }
        if (!param0) {
          this.a(this.field_Qb.getX(true), (byte) -99, this.field_Qb.getY(237239984));
          return;
        }
        nc var3 = (nc) null;
        this.a((nc) null, (byte) -119);
        this.a(this.field_Qb.getX(true), (byte) -99, this.field_Qb.getY(237239984));
    }

    final void c(int param0, int param1, int param2) {
        if (param1 < 24) {
          this.field_Ob = -93;
        }
    }

    final void a(nc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -92 % ((-53 - param1) / 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("we.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void y(int param0) {
        Object var2;
        Object var3;
        int var4;
        int var5;
        Object var6;
        Zombie var6_ref;
        int var8;
        Path var9;
        Path var10;
        Path var17;
        var6 = null;
        var8 = ZombieDawn.field_J;
        this.getX(true);
        this.getY(237239984);
        if (this.field_yb != null) {
          this.field_yb.getX(true);
          this.field_yb.getY(237239984);
          this.field_yb = null;
          if (this.field_Qb != null) {
            this.z(param0 + 12448);
          }
          var2 = null;
          var3 = null;
          var4 = -1;
          var5 = -1;
          if (param0 != 3) {
            this.field_Nb = -9;
          }
          var6_ref = (Zombie) (this.a((byte) -74, this.field_Vb, 2));
          while (var6_ref != null) {
            if (var6_ref.state == 9) {
              var6_ref = (Zombie) (this.e((byte) 32));
              continue;
            }
            var9 = Js5Archive.field_e.navigation.findPath(true, this.getX(true), var6_ref.getY(237239984), var6_ref.getX(true), this.getY(237239984));
            if (var9 != null) {
              if (var6_ref.field_Bb == 0 && (!(var9.field_g <= var5) ||
                var5 == -1)) {
                var3 = var6_ref;
                var5 = var9.field_g;
              }
              if (!(var9.field_g <= var4) ||
                var4 == -1) {
                var4 = var9.field_g;
                var2 = var6_ref;
              }
            }
            var6_ref = (Zombie) (this.e((byte) 32));
          }
          if (var3 == null) {
            if (var2 != null) {
              this.a((Zombie) (var2), (byte) 110);
            } else {
              this.z(12451);
            }
          } else {
            this.a((Zombie) (var3), (byte) 108);
          }
        } else {
          if (this.field_Qb != null) {
            this.z(param0 + 12448);
          }
          var2 = null;
          var3 = null;
          var4 = -1;
          var5 = -1;
          if (param0 == 3) {
            var6_ref = (Zombie) (this.a((byte) -74, this.field_Vb, 2));
            while (var6_ref != null) {
              if (var6_ref.state == 9) {
                var6_ref = (Zombie) (this.e((byte) 32));
                continue;
              }
              var10 = Js5Archive.field_e.navigation.findPath(true, this.getX(true), var6_ref.getY(237239984), var6_ref.getX(true), this.getY(237239984));
              if (var10 != null) {
                if (var6_ref.field_Bb == 0 && (!(var10.field_g <= var5) ||
                  var5 == -1)) {
                  var3 = var6_ref;
                  var5 = var10.field_g;
                }
                if (!(var10.field_g <= var4) ||
                  var4 == -1) {
                  var4 = var10.field_g;
                  var2 = var6_ref;
                }
              }
              var6_ref = (Zombie) (this.e((byte) 32));
            }
          } else {
            this.field_Nb = -9;
            var6_ref = (Zombie) (this.a((byte) -74, this.field_Vb, 2));
            while (var6_ref != null) {
              if (var6_ref.state == 9) {
                var6_ref = (Zombie) (this.e((byte) 32));
                continue;
              }
              var17 = Js5Archive.field_e.navigation.findPath(true, this.getX(true), var6_ref.getY(237239984), var6_ref.getX(true), this.getY(237239984));
              if (var17 != null) {
                if (var6_ref.field_Bb == 0 && (!(var17.field_g <= var5) ||
                  var5 == -1)) {
                  var3 = var6_ref;
                  var5 = var17.field_g;
                }
                if (!(var17.field_g <= var4) ||
                  var4 == -1) {
                  var4 = var17.field_g;
                  var2 = var6_ref;
                }
              }
              var6_ref = (Zombie) (this.e((byte) 32));
            }
          }
          if (var3 != null) {
            this.a((Zombie) (var3), (byte) 108);
          } else {
            if (var2 == null) {
              this.z(12451);
            } else {
              this.a((Zombie) (var2), (byte) 110);
            }
          }
        }
        if (null != this.field_Qb) {
          this.b(false);
        }
    }

    final static void w(int param0) {
        if (rn.field_b != null) {
          rn.field_b.field_c = false;
          p.b(0, 27102);
          if (param0 > -45) {
            field_Tb = (Sprite) null;
            return;
          }
          return;
        }
        p.b(0, 27102);
        if (param0 <= -45) {
          return;
        }
        field_Tb = (Sprite) null;
    }

    private final void z(int param0) {
        if (param0 != 12451) {
          return;
        }
        if (null == this.field_Qb) {
          this.field_Qb = null;
          return;
        }
        this.field_Qb.field_Bb = this.field_Qb.field_Bb - 1;
        this.field_Qb = null;
    }

    static {
        field_Sb = new String[]{"mall", "powerplant", "precinct", "whitehouse", "carpark", "airport", "countryside", "genlab", "buckingham"};
    }
}
