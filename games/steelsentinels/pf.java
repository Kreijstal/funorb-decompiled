/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf implements qk {
    private int field_q;
    private int field_l;
    static String field_f;
    static int[] field_j;
    private int field_i;
    static wk field_b;
    private int field_k;
    private int field_e;
    static String field_r;
    private int field_a;
    static int field_n;
    private int field_o;
    private int field_p;
    static String field_m;
    private int field_d;
    private int field_g;
    private int field_h;
    private mi field_c;

    public static void a(boolean param0) {
        field_r = null;
        field_b = null;
        field_j = null;
        field_f = null;
        field_m = null;
        if (!param0) {
            field_j = null;
        }
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        sb var12 = null;
        lh stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        lh stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof sb)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (lh) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (lh) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (sb) (Object) stackIn_3_0;
          if (var12 != null) {
            param3 = param3 & var12.field_K;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          pb.a(param0 - -param1.field_o, param1.field_z + param4, param1.field_x, param1.field_E, ((pf) this).field_l);
          if (param3) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        var8 = ((pf) this).field_p + (param1.field_o + param0);
        var9 = ((pf) this).field_k + param1.field_z + param4;
        pb.e(var8, var9, ((pf) this).field_e, ((pf) this).field_h, 5592405);
        pb.a(var8, var9, ((pf) this).field_e, ((pf) this).field_h, var7);
        if (!var12.field_T) {
          if (param2 != -30) {
            L3: {
              var11 = null;
              pf.a((java.applet.Applet) null, -4);
              if (null != ((pf) this).field_c) {
                var10 = ((pf) this).field_e + ((pf) this).field_p - -((pf) this).field_a;
                int discarded$4 = ((pf) this).field_c.a(param1.field_y, var10 + (param1.field_o + param0), param4 - -param1.field_z - -((pf) this).field_i, param1.field_x - ((pf) this).field_a - var10, param1.field_E - (((pf) this).field_a << 1472222209), ((pf) this).field_q, ((pf) this).field_g, ((pf) this).field_o, ((pf) this).field_d, 0);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null != ((pf) this).field_c) {
                var10 = ((pf) this).field_e + ((pf) this).field_p - -((pf) this).field_a;
                int discarded$5 = ((pf) this).field_c.a(param1.field_y, var10 + (param1.field_o + param0), param4 - -param1.field_z - -((pf) this).field_i, param1.field_x - ((pf) this).field_a - var10, param1.field_E - (((pf) this).field_a << 1472222209), ((pf) this).field_q, ((pf) this).field_g, ((pf) this).field_o, ((pf) this).field_d, 0);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          pb.d(var8, var9, ((pf) this).field_e + var8, var9 - -((pf) this).field_h, 1);
          pb.d(var8 - -((pf) this).field_e, var9, var8, var9 + ((pf) this).field_h, 1);
          if (param2 == -30) {
            L5: {
              if (null != ((pf) this).field_c) {
                var10 = ((pf) this).field_e + ((pf) this).field_p - -((pf) this).field_a;
                int discarded$6 = ((pf) this).field_c.a(param1.field_y, var10 + (param1.field_o + param0), param4 - -param1.field_z - -((pf) this).field_i, param1.field_x - ((pf) this).field_a - var10, param1.field_E - (((pf) this).field_a << 1472222209), ((pf) this).field_q, ((pf) this).field_g, ((pf) this).field_o, ((pf) this).field_d, 0);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            L6: {
              var11 = null;
              pf.a((java.applet.Applet) null, -4);
              if (null != ((pf) this).field_c) {
                var10 = ((pf) this).field_e + ((pf) this).field_p - -((pf) this).field_a;
                int discarded$7 = ((pf) this).field_c.a(param1.field_y, var10 + (param1.field_o + param0), param4 - -param1.field_z - -((pf) this).field_i, param1.field_x - ((pf) this).field_a - var10, param1.field_E - (((pf) this).field_a << 1472222209), ((pf) this).field_q, ((pf) this).field_g, ((pf) this).field_o, ((pf) this).field_d, 0);
                break L6;
              } else {
                break L6;
              }
            }
            return;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            try {
                var2 = param0.getDocumentBase().getFile();
                var3 = var2.indexOf((int) (char)param1);
                var4 = "reload.ws";
                if (!(0 > var3)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(ge.a(0, var5, param0), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        int var2 = 89 % ((param1 - 62) / 38);
        return wi.a(param0, (byte) 118) != null ? true : false;
    }

    pf(mi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((pf) this).field_o = 1;
        ((pf) this).field_d = 1;
        ((pf) this).field_p = param5;
        ((pf) this).field_h = param7;
        ((pf) this).field_k = param6;
        ((pf) this).field_g = param4;
        ((pf) this).field_q = param3;
        ((pf) this).field_i = param2;
        ((pf) this).field_e = param8;
        ((pf) this).field_l = param9;
        ((pf) this).field_c = param0;
        ((pf) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[5];
        field_f = "Connection lost - attempting to reconnect";
        field_r = "<%1> was destroyed within <%0>'s core containment explosion";
        field_m = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
