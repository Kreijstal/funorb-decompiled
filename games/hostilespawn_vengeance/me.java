/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class me extends wb {
    private jn field_fb;
    private int field_cb;
    private int field_db;
    private int field_hb;
    private int field_gb;
    private int field_eb;
    private ag field_bb;
    private je field_ab;
    static bd[] field_ib;

    final void o(int param0) {
        if (bf.field_j == this.field_ab) {
          return;
        }
        this.field_gb = 0;
        this.field_ab = u.field_d;
        this.a(this.field_bb, -9797);
        this.field_bb = null;
        if (param0 == 20) {
          this.field_fb.field_D = 0;
          return;
        }
        this.field_bb = (ag) null;
        this.field_fb.field_D = 0;
    }

    void b(ag param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 110) {
            this.field_bb = (ag) null;
          }
          boolean decompiledFrameRemainder0 = true;
          this.field_bb = param0;
          if (this.field_ab != oa.field_k) {
            if (this.field_ab != bf.field_j) {
              this.field_ab = bf.field_j;
              this.field_gb = 0;
              decompiledFrameRemainder0 = !(HostileSpawn.field_I);
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          this.a(this.field_eb, 12 + this.field_bb.field_s, 88, this.field_bb.field_x + 12 + this.field_cb);
          this.field_gb = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("me.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 != -56) {
          me.f((byte) 91);
          field_ib = null;
          return;
        }
        field_ib = null;
    }

    final static boolean a(boolean param0, int param1) {
        try {
          long dupTemp$1 = 0L;
          en var2 = null;
          IOException var2_ref = null;
          int stackIn_11_0 = 0;
          Throwable decompiledCaughtException = null;
          if (null == oa.field_l) {
            oa.field_l = uj.field_k.a(uc.field_d, 101, cb.field_c);
          }
          if (param1 < 87) {
            return true;
          }
          if (oa.field_l.field_f == 0) {
            return false;
          }
          dupTemp$1 = hn.a((byte) 80);
          gf.field_h = dupTemp$1;
          bb.field_c = dupTemp$1;
          if (oa.field_l.field_f != 1) {
            rc.field_a = sg.field_c;
          } else {
            try {
              ag.field_t = new td((java.net.Socket) (oa.field_l.field_c), uj.field_k);
              s.field_b.field_i = 0;
              var2 = sc.field_g;
              stackIn_11_0 = (param0) ? -2 : -1;
              bj.field_f = stackIn_11_0;
              ae.field_u = stackIn_11_0;
              ne.field_o = stackIn_11_0;
              rc.field_a = sa.field_c;
              var2.field_i = 0;
              hm.a(og.field_c, rl.field_b, s.field_b, ea.field_c, 4122);
              mb.d(-1, -22370);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (IOException) (Object) decompiledCaughtException;
              rc.field_a = sg.field_c;
              if (!HostileSpawn.field_I) {
                oa.field_l = null;
                return true;
              }
              rc.field_a = sg.field_c;
              oa.field_l = null;
              return true;
            }
          }
          oa.field_l = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean l(int param0) {
        int fieldTemp$7 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        ag var4;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 65393) {
          var4 = (ag) null;
          this.b((ag) null, (byte) 96);
          if (this.field_ab == null) {
            return super.l(65393);
          }
          if (bf.field_j != this.field_ab) {
            if (this.field_ab == u.field_d) {
              fieldTemp$7 = this.field_gb + 1;
              this.field_gb = this.field_gb + 1;
              if (this.field_db == fieldTemp$7) {
                this.field_fb.field_D = 256;
                this.field_ab = null;
              } else {
                this.field_fb.field_D = (this.field_gb << 8) / this.field_db;
                if (var3 != 0) {
                  this.field_fb.field_D = 256;
                  this.field_ab = null;
                }
              }
            }
            return super.l(65393);
          }
          fieldTemp$4 = this.field_gb + 1;
          this.field_gb = this.field_gb + 1;
          if (fieldTemp$4 != this.field_hb) {
            this.field_fb.field_D = 256 - (this.field_gb << 8) / this.field_hb;
            if (var3 != 0 &&
              this.field_ab == u.field_d) {
              fieldTemp$6 = this.field_gb + 1;
              this.field_gb = this.field_gb + 1;
              if (this.field_db != fieldTemp$6) {
                this.field_fb.field_D = (this.field_gb << 8) / this.field_db;
              }
              this.field_fb.field_D = 256;
              this.field_ab = null;
            }
            return super.l(65393);
          }
          this.field_ab = oa.field_k;
          this.a(this.field_eb, 12 + this.field_bb.field_s, 121, this.field_bb.field_x + this.field_cb + 12);
          this.field_gb = 0;
          this.field_fb.field_D = 0;
          if (var3 == 0) {
            return super.l(65393);
          }
          this.field_fb.field_D = 256 - (this.field_gb << 8) / this.field_hb;
          if (this.field_ab != u.field_d) {
            return super.l(65393);
          }
          fieldTemp$5 = this.field_gb + 1;
          this.field_gb = this.field_gb + 1;
          if (this.field_db != fieldTemp$5) {
            this.field_fb.field_D = (this.field_gb << 8) / this.field_db;
          }
          this.field_fb.field_D = 256;
          this.field_ab = null;
          return super.l(65393);
        }
        if (this.field_ab == null) {
          return super.l(65393);
        }
        if (bf.field_j != this.field_ab) {
          if (this.field_ab != u.field_d) {
            return super.l(65393);
          }
          fieldTemp$0 = this.field_gb + 1;
          this.field_gb = this.field_gb + 1;
          if (this.field_db != fieldTemp$0) {
            this.field_fb.field_D = (this.field_gb << 8) / this.field_db;
            if (var3 == 0) {
              return super.l(65393);
            }
          }
          this.field_fb.field_D = 256;
          this.field_ab = null;
          return super.l(65393);
        }
        fieldTemp$1 = this.field_gb + 1;
        this.field_gb = this.field_gb + 1;
        if (fieldTemp$1 != this.field_hb) {
          this.field_fb.field_D = 256 - (this.field_gb << 8) / this.field_hb;
          if (var3 == 0) {
            return super.l(65393);
          }
          if (this.field_ab != u.field_d) {
            return super.l(65393);
          }
          fieldTemp$2 = this.field_gb + 1;
          this.field_gb = this.field_gb + 1;
          if (this.field_db != fieldTemp$2) {
            this.field_fb.field_D = (this.field_gb << 8) / this.field_db;
          }
          this.field_fb.field_D = 256;
          this.field_ab = null;
          return super.l(65393);
        }
        this.field_ab = oa.field_k;
        this.a(this.field_eb, 12 + this.field_bb.field_s, 121, this.field_bb.field_x + this.field_cb + 12);
        this.field_gb = 0;
        this.field_fb.field_D = 0;
        if (var3 == 0) {
          return super.l(65393);
        }
        this.field_fb.field_D = 256 - (this.field_gb << 8) / this.field_hb;
        if (this.field_ab != u.field_d) {
          return super.l(65393);
        }
        fieldTemp$3 = this.field_gb + 1;
        this.field_gb = this.field_gb + 1;
        if (this.field_db != fieldTemp$3) {
          this.field_fb.field_D = (this.field_gb << 8) / this.field_db;
        }
        this.field_fb.field_D = 256;
        this.field_ab = null;
        return super.l(65393);
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.setFocusTraversalKeysEnabled(false);
          int var2_int = -39 / ((param1 - 44) / 60);
          param0.addKeyListener(nj.field_c);
          param0.addFocusListener(nj.field_c);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "me.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 != -15953) {
          return false;
        }
        this.m(-92);
        return super.j(-15953);
    }

    final void m(int param0) {
        if (null != this.field_ab) {
          if (this.field_ab != u.field_d) {
            this.a(this.field_bb.field_s + 12, 15767, this.field_bb.field_x + 12 + this.field_cb);
            this.a(this.field_bb, -9797);
          } else {
            this.field_fb.field_D = 256;
            this.field_ab = null;
            if (param0 > 0) {
              field_ib = (bd[]) null;
              super.m(-3);
              return;
            }
            super.m(-3);
            return;
          }
          this.field_fb.field_D = 256;
          this.field_ab = null;
          if (param0 > 0) {
            field_ib = (bd[]) null;
            super.m(-3);
            return;
          }
          super.m(-3);
          return;
        }
        if (param0 <= 0) {
          super.m(-3);
          return;
        }
        field_ib = (bd[]) null;
        super.m(-3);
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (null != this.field_fb) {
            if (param2 == 98) {
              this.field_fb.a((byte) -109, param1);
            }
            if (param2 != 99) {
              return false;
            }
            this.field_fb.a((byte) -73, param1);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("me.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(ag param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9797) {
            this.j(1);
          }
          if (this.field_fb != null) {
            this.field_fb.b(121);
          }
          if (param0 != null) {
            param0.a(param0.field_s, 6 + this.field_cb, 0, 6, param0.field_x);
            this.field_fb = new jn(param0);
            if (HostileSpawn.field_I) {
              this.field_fb = new jn();
            }
          } else {
            this.field_fb = new jn();
          }
          this.a(51448, this.field_fb);
          this.field_bb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("me.T(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        try {
          Object stackIn_6_0 = null;
          Throwable decompiledCaughtException = null;
          int var2_int = 0;
          RuntimeException var2 = null;
          int var3 = 0;
          Object var4 = null;
          bd var5 = null;
          int[] var6 = null;
          int var7_int = 0;
          Object var7 = null;
          java.awt.Cursor var7_ref = null;
          Object var8 = null;
          IllegalAccessException var8_ref = null;
          InstantiationException var8_ref2 = null;
          java.lang.reflect.InvocationTargetException var8_ref3 = null;
          int var9 = 0;
          Object var10 = null;
          var9 = HostileSpawn.field_I ? 1 : 0;
          try {
            if (param1 == qm.field_R) {
              return;
            }
            var2_int = 15;
            qm.field_R = param1;
            var3 = 15;
            if (null == wa.field_q) {
              stackIn_6_0 = se.field_h;
            } else {
              stackIn_6_0 = wa.field_q;
            }
            var4 = stackIn_6_0;
            if (0 == param1) {
              ((java.awt.Canvas) (var4)).setCursor((java.awt.Cursor) null);
              return;
            }
            if (!cc.a((byte) -102)) {
              return;
            }
            if (param0 <= 83) {
              field_ib = (bd[]) null;
            }
            var5 = ee.field_d[-1 + param1];
            var6 = new int[var5.field_D.length];
            var7_int = 0;
            while (var6.length > var7_int) {
              if (0 != var5.field_D[var7_int]) {
                var6[var7_int] = ll.a(var5.field_D[var7_int], -16777216);
                if (var9 != 0) {
                  var6[var7_int] = 0;
                }
              } else {
                var6[var7_int] = 0;
              }
              var7_int++;
              if (var9 == 0) {
                continue;
              }
              break;
            }
            var7 = null;
            try {
              var10 = od.field_F.newInstance(new Object[]{new Integer(var5.field_z), new Integer(var5.field_A), new Integer(le.field_eb)});
              var8 = var10;
              aa.field_e.invoke(var8, new Object[]{new Integer(0), new Integer(0), new Integer(var5.field_z), new Integer(var5.field_A), var6, new Integer(0), new Integer(var5.field_z)});
              var7_ref = (java.awt.Cursor) (kh.field_eb.invoke((Object) (((java.awt.Canvas) (var4)).getToolkit()), new Object[]{var10, new java.awt.Point(var2_int, var3), "FunOrb Custom Cursor"}));
            } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = (IllegalAccessException) (Object) decompiledCaughtException;
              kh.field_eb = null;
            } catch (java.lang.InstantiationException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var8_ref2 = (InstantiationException) (Object) decompiledCaughtException;
              throw new RuntimeException();
            } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var8_ref3 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
              throw new RuntimeException();
            }
            ((java.awt.Canvas) (var4)).setCursor(var7_ref);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            throw wg.a((Throwable) ((Object) var2), "me.Q(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    me(gg param0, ag param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_s, param2 + 12 + param1.field_x);
        try {
          this.field_eb = param4;
          this.field_cb = param2;
          this.field_db = param3;
          this.field_hb = param3;
          this.a(param1, -9797);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
