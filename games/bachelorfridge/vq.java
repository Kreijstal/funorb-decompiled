/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq extends ana {
    static sna field_v;
    static int field_w;
    private sm field_x;

    public static void e(byte param0) {
        if (param0 < 53) {
            vq.a((byte) 89, false);
            field_v = null;
            return;
        }
        field_v = null;
    }

    final static void a(byte param0, boolean param1) {
        ut.field_m.a(param1, param0 + 1537025669);
        if (param0 != -64) {
            vq.e((byte) -127);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -60) {
              stackOut_3_0 = dj.a(false, -15437, param1);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("vq.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        if (this.field_m.a((byte) -106)) {
          return false;
        } else {
          if (100 != this.field_l) {
            fieldTemp$2 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if (-1 >= (fieldTemp$2 ^ -1)) {
              L0: {
                if (75 == this.field_l) {
                  this.c(false);
                  break L0;
                } else {
                  break L0;
                }
              }
              return false;
            } else {
              this.b(false);
              var2 = -79 / ((71 - param0) / 47);
              return true;
            }
          } else {
            wf.a(53, (byte) 126);
            fieldTemp$3 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if (-1 >= (fieldTemp$3 ^ -1)) {
              if (75 != this.field_l) {
                return false;
              } else {
                this.c(false);
                return false;
              }
            } else {
              this.b(false);
              var2 = -79 / ((71 - param0) / 47);
              return true;
            }
          }
        }
    }

    private final void c(boolean param0) {
        oha discarded$2 = null;
        oha discarded$3 = null;
        Object var3 = null;
        iv var3_ref = null;
        int var5 = 0;
        aga var7 = null;
        ad var8 = null;
        aga var9 = null;
        ad var10 = null;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (!param0) {
          var9 = this.field_x.field_l.a(25, this.field_q.field_h);
          if (var9.i(-97)) {
            return;
          } else {
            var3_ref = (iv) ((Object) this.field_x.field_o.b((byte) 90));
            discarded$2 = al.a(118, this.field_x.field_k);
            L0: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var9, this.field_q.field_h, 12);
                var10 = var3_ref.field_h.a(-27449, this.field_q);
                this.a(27799, new taa(this.field_q, var10));
                this.a(27799, new cb(var10, 6));
                this.a(27799, new wn(var10, kna.field_g[5], 24831));
                var3_ref = (iv) ((Object) this.field_x.field_o.c(0));
                continue L0;
              }
            }
          }
        } else {
          this.field_x = (sm) null;
          var7 = this.field_x.field_l.a(25, this.field_q.field_h);
          if (var7.i(-97)) {
            return;
          } else {
            var3_ref = (iv) ((Object) this.field_x.field_o.b((byte) 90));
            discarded$3 = al.a(118, this.field_x.field_k);
            L1: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var7, this.field_q.field_h, 12);
                var8 = var3_ref.field_h.a(-27449, this.field_q);
                this.a(27799, new taa(this.field_q, var8));
                this.a(27799, new cb(var8, 6));
                this.a(27799, new wn(var8, kna.field_g[5], 24831));
                var3_ref = (iv) ((Object) this.field_x.field_o.c(0));
                continue L1;
              }
            }
          }
        }
    }

    vq(gj param0, sm param1) {
        super(param0, param1);
        try {
            this.field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(boolean param0) {
        if (param0) {
            field_w = 77;
        }
    }

    static {
    }
}
