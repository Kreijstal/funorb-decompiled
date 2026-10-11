/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nda extends rqa {
    static int field_q;
    static java.awt.Image field_p;
    static String field_o;

    public static void a(int param0) {
        field_p = null;
        if (param0 != 0) {
          nda.a(48, false);
          field_o = null;
          return;
        }
        field_o = null;
    }

    nda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(124, 62, param0[0].a(93));
          if (param1 > -119) {
            nda.a(-23);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nda.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        llb stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        llb stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        llb stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        llb stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        llb stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        llb stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        llb stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        llb stackIn_46_0 = null;
        boolean stackIn_47_1 = false;
        llb stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        llb stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        llb stackIn_66_0 = null;
        boolean stackIn_67_1 = false;
        llb stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        llb stackIn_79_0 = null;
        boolean stackIn_80_1 = false;
        llb stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        llb stackIn_88_0 = null;
        boolean stackIn_89_1 = false;
        llb stackIn_92_0 = null;
        boolean stackIn_93_1 = false;
        if (param0 < -111) {
          qca.a(dma.field_g + 640 >> 1, dma.field_j, dma.field_g - 640 >> 1, true, 0);
          if (0 < lia.field_b) {
            if (null != kl.field_c) {
              kl.field_c.c(tb.field_a.field_L, 0);
            }
            stackIn_66_0 = tb.field_a;
            stackIn_67_1 = (param1) && (!bv.field_d);
            ((llb) (Object) stackIn_66_0).b(stackIn_67_1, -109);
            stackIn_70_0 = bqa.field_d;
            stackIn_71_1 = (param1) && (!bv.field_d);
            ((llb) (Object) stackIn_70_0).b(stackIn_71_1, 113);
          }
          if (!(nf.field_a <= 0) ||
            !(tba.field_p <= 0)) {
            if (null == kl.field_c) {
              stackIn_79_0 = rga.field_g;
              stackIn_80_1 = (param1) && (!wo.field_o);
              ((llb) (Object) stackIn_79_0).b(stackIn_80_1, 101);
              stackIn_83_0 = vva.field_r;
              stackIn_84_1 = (param1) && (!wo.field_o);
              ((llb) (Object) stackIn_83_0).b(stackIn_84_1, 101);
            } else {
              kl.field_c.c(rga.field_g.field_L, 0);
              stackIn_88_0 = rga.field_g;
              stackIn_89_1 = (param1) && (!wo.field_o);
              ((llb) (Object) stackIn_88_0).b(stackIn_89_1, 101);
              stackIn_92_0 = vva.field_r;
              stackIn_93_1 = (param1) && (!wo.field_o);
              ((llb) (Object) stackIn_92_0).b(stackIn_93_1, 101);
            }
          }
        } else {
          field_p = (java.awt.Image) null;
          qca.a(dma.field_g + 640 >> 1, dma.field_j, dma.field_g - 640 >> 1, true, 0);
          if (0 < lia.field_b) {
            if (null != kl.field_c) {
              kl.field_c.c(tb.field_a.field_L, 0);
            }
            stackIn_9_0 = tb.field_a;
            stackIn_10_1 = (param1) && (!bv.field_d);
            ((llb) (Object) stackIn_9_0).b(stackIn_10_1, -109);
            stackIn_13_0 = bqa.field_d;
            stackIn_14_1 = (param1) && (!bv.field_d);
            ((llb) (Object) stackIn_13_0).b(stackIn_14_1, 113);
          }
          if (nf.field_a > 0) {
            if (null == kl.field_c) {
              stackIn_20_0 = rga.field_g;
              stackIn_21_1 = (param1) && (!wo.field_o);
              ((llb) (Object) stackIn_20_0).b(stackIn_21_1, 101);
              stackIn_24_0 = vva.field_r;
              stackIn_25_1 = (param1) && (!wo.field_o);
              ((llb) (Object) stackIn_24_0).b(stackIn_25_1, 101);
            } else {
              kl.field_c.c(rga.field_g.field_L, 0);
              stackIn_29_0 = rga.field_g;
              stackIn_30_1 = (param1) && (!wo.field_o);
              ((llb) (Object) stackIn_29_0).b(stackIn_30_1, 101);
              stackIn_33_0 = vva.field_r;
              stackIn_34_1 = (param1) && (!wo.field_o);
              ((llb) (Object) stackIn_33_0).b(stackIn_34_1, 101);
            }
          } else {
            if (tba.field_p > 0) {
              if (null == kl.field_c) {
                stackIn_42_0 = rga.field_g;
                stackIn_43_1 = (param1) && (!wo.field_o);
                ((llb) (Object) stackIn_42_0).b(stackIn_43_1, 101);
                stackIn_46_0 = vva.field_r;
                stackIn_47_1 = (param1) && (!wo.field_o);
                ((llb) (Object) stackIn_46_0).b(stackIn_47_1, 101);
              } else {
                kl.field_c.c(rga.field_g.field_L, 0);
                stackIn_51_0 = rga.field_g;
                stackIn_52_1 = (param1) && (!wo.field_o);
                ((llb) (Object) stackIn_51_0).b(stackIn_52_1, 101);
                stackIn_55_0 = vva.field_r;
                stackIn_56_1 = (param1) && (!wo.field_o);
                ((llb) (Object) stackIn_55_0).b(stackIn_56_1, 101);
              }
            }
          }
        }
        bia.a((byte) 124);
    }

    static {
        field_q = 0;
        field_o = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
