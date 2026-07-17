/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends bh {
    static String[] field_n;
    static tb field_t;
    int field_s;
    int field_p;
    int field_q;
    static String field_u;
    int field_v;
    static nm field_w;
    int field_r;
    int field_o;

    final static hl a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        uf var8 = null;
        me var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_22_0 = null;
        int[] stackOut_21_0 = null;
        L0: {
          var7 = client.field_A ? 1 : 0;
          var8 = de.field_V;
          var3 = var8.d((byte) -99);
          mf.field_R = 127 & var3;
          if ((var3 & 128) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          fm.field_f = stackIn_3_0 != 0;
          tg.field_c = var8.d((byte) -71);
          fc.field_h = var8.f((byte) -108);
          if (mf.field_R != 2) {
            vl.field_k = 0;
            ic.field_a = 0;
            break L1;
          } else {
            vl.field_k = var8.e(3);
            ic.field_a = var8.h(65280);
            break L1;
          }
        }
        L2: {
          if (1 != var8.d((byte) -32)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          ad.field_x = var8.c((byte) -38);
          if (var4 == 0) {
            sa.field_B = ad.field_x;
            break L3;
          } else {
            sa.field_B = var8.c((byte) -38);
            break L3;
          }
        }
        L4: {
          if (mf.field_R == 1) {
            dh.field_d = var8.e(3);
            qm.field_e = var8.c((byte) -38);
            break L4;
          } else {
            if (mf.field_R != 4) {
              qm.field_e = null;
              dh.field_d = 0;
              break L4;
            } else {
              dh.field_d = var8.e(3);
              qm.field_e = var8.c((byte) -38);
              break L4;
            }
          }
        }
        if (!param1) {
          ib.field_pb = li.a(80, 0, (wl) (Object) var8);
          fa.field_q = null;
          return new hl(param1);
        } else {
          var5 = var8.e(3);
          try {
            L5: {
              L6: {
                var9 = wj.field_Qb.a(127, var5);
                ib.field_pb = var9.f((byte) -61);
                if (sa.field_B.equals((Object) (Object) oa.field_f)) {
                  stackOut_22_0 = null;
                  stackIn_23_0 = (int[]) (Object) stackOut_22_0;
                  break L6;
                } else {
                  stackOut_21_0 = var9.field_F;
                  stackIn_23_0 = stackOut_21_0;
                  break L6;
                }
              }
              fa.field_q = stackIn_23_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            qb.a((Throwable) (Object) var6, 16408, "CC1");
            ib.field_pb = null;
            fa.field_q = null;
            return new hl(param1);
          }
          return new hl(param1);
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                    if (param0 == 96) {
                      break L1;
                    } else {
                      ki.c((byte) 42);
                      break L1;
                    }
                  }
                  param1.getAppletContext().showDocument(gn.a(var2, param0 ^ -97, param1), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("ki.C(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(byte param0) {
        Object var2 = null;
        field_t = null;
        field_w = null;
        field_u = null;
        if (param0 != 22) {
          var2 = null;
          ki.a((byte) 121, (java.applet.Applet) null);
          field_n = null;
          return;
        } else {
          field_n = null;
          return;
        }
    }

    ki(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ki) this).field_v = param0;
        ((ki) this).field_o = param4;
        ((ki) this).field_q = param5;
        ((ki) this).field_s = param2;
        ((ki) this).field_p = param1;
        ((ki) this).field_r = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_u = "Any special items you earn will be given to both you and the player who gets your shapes!";
        field_t = new tb();
    }
}
