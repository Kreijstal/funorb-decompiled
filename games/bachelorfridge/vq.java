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
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("vq.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (((vq) this).field_m.a((byte) -106)) {
          return false;
        } else {
          if (100 != ((vq) this).field_l) {
            int fieldTemp$2 = ((vq) this).field_l - 1;
            ((vq) this).field_l = ((vq) this).field_l - 1;
            if (fieldTemp$2 >= 0) {
              L0: {
                if (75 == ((vq) this).field_l) {
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
            int fieldTemp$3 = ((vq) this).field_l - 1;
            ((vq) this).field_l = ((vq) this).field_l - 1;
            if (fieldTemp$3 >= 0) {
              if (75 != ((vq) this).field_l) {
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
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var6 = ((vq) this).field_x.field_l.a(25, ((vq) this).field_q.field_h);
        if (!(!var6.i(-97))) {
            return;
        }
        iv var3 = (iv) (Object) ((vq) this).field_x.field_o.b((byte) 90);
        oha discarded$6 = al.a(118, ((vq) this).field_x.field_k);
        while (var3 != null) {
            var3.a(var6, ((vq) this).field_q.field_h, 12);
            var4 = var3.field_h.a(-27449, ((vq) this).field_q);
            ((vq) this).a(27799, (at) (Object) new taa(((vq) this).field_q, var4));
            ((vq) this).a(27799, (at) (Object) new cb(var4, 6));
            ((vq) this).a(27799, (at) (Object) new wn(var4, kna.field_g[5], 24831));
            var3 = (iv) (Object) ((vq) this).field_x.field_o.c(0);
        }
    }

    vq(gj param0, sm param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((vq) this).field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b(boolean param0) {
    }

    static {
    }
}
