/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ki extends pn {
    private int field_ab;
    static String field_V;
    private int field_cb;
    private ga field_W;
    private wl field_U;
    private mh field_Y;
    private int field_T;
    private int field_db;
    private int field_Z;
    static String field_bb;
    static int[] field_X;

    final boolean e(byte param0) {
        this.f((byte) -48);
        if (param0 != 28) {
          this.field_U = (wl) null;
        }
        return super.e((byte) 28);
    }

    final void l(int param0) {
        if (this.field_U == j.field_h) {
          return;
        }
        this.field_U = dn.field_I;
        this.field_cb = 0;
        this.a(this.field_W, (byte) -98);
        this.field_Y.field_H = 0;
        this.field_W = null;
        if (param0 != -7476) {
          this.field_cb = -54;
        }
    }

    void b(int param0, ga param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 20) {
            field_bb = (String) null;
          }
          this.field_W = param1;
          if (sj.field_c != this.field_U) {
            if (this.field_U != j.field_h) {
              this.field_U = j.field_h;
              this.field_cb = 0;
            }
          } else {
            this.a(false, this.field_W.field_n + 12 + this.field_db, 12 + this.field_W.field_i, this.field_ab);
            this.field_cb = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ki.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (43 != var9 ||
                !param3))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (param0 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param0 + var9;
                if (var10 / param0 != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (param2 != -123) {
              ki.g((byte) -94);
            }
            stackIn_43_0 = var5;
            return stackIn_43_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("ki.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(ga param0, byte param1) {
        try {
          if (this.field_Y != null) {
            this.field_Y.b(-27598);
          }
          int var3_int = -45 / ((-21 - param1) / 52);
          if (param0 == null) {
            this.field_Y = new mh();
          } else {
            param0.a(-73, 6 + this.field_db, 6, param0.field_i, param0.field_n);
            this.field_Y = new mh(param0);
          }
          this.a(this.field_Y, 10);
          this.field_W = null;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ki.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(-122, param1, param2, param3)) {
            return true;
          }
          var5_int = 8 % ((param0 + 83) / 32);
          if (this.field_Y != null) {
            if (98 == param1) {
              this.field_Y.a((byte) 121, param2);
            }
            if (99 == param1) {
              this.field_Y.a((byte) 82, param2);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ki.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, vn param1) {
        hk.i(1584);
        if (param0 >= -76) {
          return;
        }
        try {
          bi.a(param1.field_z, param1.field_r, param1.field_q);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ki.EB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(byte param0) {
        if (this.field_U != null) {
          if (this.field_U != dn.field_I) {
            this.a((byte) 105, this.field_W.field_n + (12 + this.field_db), this.field_W.field_i + 12);
            this.a(this.field_W, (byte) 94);
          }
          this.field_U = null;
          this.field_Y.field_H = 256;
        }
        int var2 = -96 % ((param0 - 22) / 59);
        super.f((byte) -58);
    }

    ki(dn param0, ga param1, int param2, int param3, int param4) {
        super(param0, param1.field_i + 12, 12 + (param2 + param1.field_n));
        try {
          this.field_ab = param4;
          this.field_db = param2;
          this.field_T = param3;
          this.field_Z = param3;
          this.a(param1, (byte) -104);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean j(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var3;
        var3 = ZombieDawn.field_J;
        if (this.field_U != null) {
          if (this.field_U == j.field_h) {
            fieldTemp$4 = this.field_cb + 1;
            this.field_cb = this.field_cb + 1;
            if (this.field_Z != fieldTemp$4) {
              this.field_Y.field_H = -((this.field_cb << 8) / this.field_Z) + 256;
            } else {
              this.field_U = sj.field_c;
              this.a(false, this.field_W.field_n + 12 + this.field_db, 12 + this.field_W.field_i, this.field_ab);
              this.field_cb = 0;
              this.field_Y.field_H = 0;
            }
          } else {
            if (dn.field_I == this.field_U) {
              fieldTemp$5 = this.field_cb + 1;
              this.field_cb = this.field_cb + 1;
              if (this.field_T == fieldTemp$5) {
                this.field_Y.field_H = 256;
                this.field_U = null;
              } else {
                this.field_Y.field_H = (this.field_cb << 8) / this.field_T;
              }
            }
          }
        }
        if (param0 == 2634) {
          return super.j(2634);
        }
        return true;
    }

    public static void g(byte param0) {
        if (param0 < 41) {
          vn var2 = (vn) null;
          ki.a((byte) 10, (vn) null);
        }
        field_V = null;
        field_bb = null;
        field_X = null;
    }

    static {
        field_bb = "Cancel";
        field_X = new int[]{-1, 160, 342, 435};
    }
}
