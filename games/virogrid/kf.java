/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    private DualLinkNode field_h;
    private DualLinkNode field_i;
    static int field_e;
    static int[] field_j;
    static il field_c;
    private long field_d;
    private int field_b;
    static SpriteWidget field_g;
    private DualLinkNode[] field_f;
    private int field_a;

    final DualLinkNode b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        DualLinkNode var2;
        int var3;
        DualLinkNode var4;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 == -1) {
          if (0 < this.field_b &&
            this.field_h != this.field_f[this.field_b - 1]) {
            var2 = this.field_h;
            this.field_h = var2.field_h;
            return var2;
          }
          do {
            if (this.field_b >= this.field_a) {
              return null;
            }
            fieldTemp$0 = this.field_b;
            this.field_b = this.field_b + 1;
            var4 = this.field_f[fieldTemp$0].field_h;
            var2 = var4;
          } while (var4 == this.field_f[this.field_b - 1]);
          this.field_h = var2.field_h;
          return var2;
        }
        kf.a(-101, -32);
        if (0 >= this.field_b) {
          do {
            if (this.field_b >= this.field_a) {
              return null;
            }
            fieldTemp$2 = this.field_b;
            this.field_b = this.field_b + 1;
            var4 = this.field_f[fieldTemp$2].field_h;
            var2 = var4;
          } while (var4 == this.field_f[this.field_b - 1]);
          this.field_h = var2.field_h;
          return var2;
        }
        if (this.field_h != this.field_f[this.field_b - 1]) {
          var2 = this.field_h;
          this.field_h = var2.field_h;
          return var2;
        }
        do {
          if (this.field_b >= this.field_a) {
            return null;
          }
          fieldTemp$1 = this.field_b;
          this.field_b = this.field_b + 1;
          var4 = this.field_f[fieldTemp$1].field_h;
          var2 = var4;
        } while (var4 == this.field_f[this.field_b - 1]);
        this.field_h = var2.field_h;
        return var2;
    }

    final static void a(int param0, int param1) {
        if (param1 != -1) {
          return;
        }
        BufferedSocket.field_r = param0;
    }

    final DualLinkNode a(boolean param0) {
        this.field_b = 0;
        if (!param0) {
          return (DualLinkNode) null;
        }
        return this.b(-1);
    }

    public static void a(int param0) {
        if (param0 == -1) {
          field_j = null;
          field_c = null;
          field_g = null;
          return;
        }
        kf.a(12);
        field_j = null;
        field_c = null;
        field_g = null;
    }

    final static void a(int param0, int param1, long param2, int param3, String param4, boolean param5) {
        int var7_int = 0;
        gk.field_g.g(param0, 8);
        gk.field_g.position = gk.field_g.position + 1;
        if (param3 < 4) {
          return;
        }
        try {
          var7_int = gk.field_g.position;
          gk.field_g.a((byte) -66, param2);
          gk.field_g.writeString(param4, (byte) -119);
          gk.field_g.a(param1, 55);
          gk.field_g.a(!param5 ? 0 : 1, 125);
          gk.field_g.b(-var7_int + gk.field_g.position, -1);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kf.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wg param4, wg param5) {
        try {
          ng.field_P = param1;
          hd.field_e = param3;
          IntrusiveDequeCursor.field_h = param5;
          tg.field_D = param4;
          dj.field_e = param2;
          if (param0 != 0) {
            kf.a((byte) -53);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kf.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 != 0) {
          field_e = -105;
          if (48 > param1) {
            return false;
          }
          if (param1 <= 57) {
            return true;
          }
          return false;
        }
        if (48 > param1) {
          return false;
        }
        if (param1 <= 57) {
          return true;
        }
        return false;
    }

    final DualLinkNode c(int param0) {
        DualLinkNode var3 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (this.field_i == null) {
          return null;
        }
        DualLinkNode var2 = this.field_f[(int)(this.field_d & (long)(-1 + this.field_a))];
        while (var2 != this.field_i) {
          if (~this.field_d == ~this.field_i.field_j) {
            var3 = this.field_i;
            this.field_i = this.field_i.field_h;
            return var3;
          }
          this.field_i = this.field_i.field_h;
        }
        if (param0 == 48) {
          this.field_i = null;
          return null;
        }
        return (DualLinkNode) null;
    }

    final DualLinkNode a(long param0, byte param1) {
        DualLinkNode var4;
        int var5_int;
        DualLinkNode var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        this.field_d = param0;
        var4 = this.field_f[(int)((long)(this.field_a - 1) & param0)];
        this.field_i = var4.field_h;
        while (true) {
          if (this.field_i == var4) {
            var5_int = 59 / ((43 - param1) / 33);
            this.field_i = null;
            return null;
          }
          if (this.field_i.field_j != param0) {
            this.field_i = this.field_i.field_h;
            continue;
          }
          break;
        }
        var5 = this.field_i;
        this.field_i = this.field_i.field_h;
        return var5;
    }

    final void a(long param0, DualLinkNode param1, int param2) {
        if (null != param1.field_k) {
          param1.c(92);
        }
        DualLinkNode var5 = this.field_f[(int)((long)(this.field_a - 1) & param0)];
        param1.field_h = var5;
        param1.field_k = var5.field_k;
        param1.field_k.field_h = param1;
        param1.field_h.field_k = param1;
        if (param2 != 30804) {
          return;
        }
        try {
          param1.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kf.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        int var2 = 0;
        bf var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        bf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          var4 = (bf) (IntrusiveNode.field_c.a((byte) -66));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 != -74) {
            kf.a((byte) -15);
          }
          for (var2 = 0; var1.field_n > var2; var2++) {
            if (var4.field_q[var2] != null &&
              var4.field_q[var2].field_a == 0) {
              return false;
            }
            if (var4.field_r[var2] != null &&
              0 == var4.field_r[var2].field_a) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "kf.D(" + param0 + ')');
        }
    }

    kf(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_b = 0;
        this.field_f = new DualLinkNode[param0];
        this.field_a = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_f[var2] = dupTemp$1;
          var3.field_h = var3;
          var3.field_k = var3;
        }
    }

    static {
    }
}
