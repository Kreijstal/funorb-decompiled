/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends IntrusiveNode {
    String[][] field_r;
    int field_s;
    static String field_i;
    int field_n;
    static String field_q;
    int field_l;
    boolean field_v;
    static int field_t;
    int field_j;
    int[][] field_u;
    static RgbSprite field_o;
    static int field_p;
    int field_m;
    int field_k;

    public static void a(byte param0) {
        field_q = null;
        field_o = null;
        if (param0 > -52) {
          return;
        }
        field_i = null;
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = 255 & param1;
        if (param0 >= 0) {
          return '￪';
        }
        if (0 == var2) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 < 128) {
          return (char)var2;
        }
        if (var2 < 160) {
          var3 = ai.cp1252Extensions[-128 + var2];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
          return (char)var2;
        }
        return (char)var2;
    }

    final static void a(boolean param0, byte param1) {
        LevelSequence var3;
        if (param1 < -118) {
          if (null != ep.field_e) {
            pg.a(false, ep.field_e);
          }
          if (bm.field_d != null) {
            bm.field_d.a((byte) -126, param0);
          }
          MembershipBenefitsScreen.a(param0, false);
          if (null != CircleBody.field_p) {
            CircleBody.field_p.a(true, param0);
          }
          eh.a(param0, true);
          return;
        }
        var3 = (LevelSequence) null;
        cq.a(103, true, 42, (LevelSequence) null);
        if (null != ep.field_e) {
          pg.a(false, ep.field_e);
        }
        if (bm.field_d != null) {
          bm.field_d.a((byte) -126, param0);
        }
        MembershipBenefitsScreen.a(param0, false);
        if (null != CircleBody.field_p) {
          CircleBody.field_p.a(true, param0);
        }
        eh.a(param0, true);
        return;
    }

    final static void a(int param0, boolean param1, int param2, LevelSequence param3) {
        String[] array$0 = null;
        String[] var5 = null;
        String[] stackIn_2_0 = null;
        String[] stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        String stackIn_3_3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          array$0 = new String[1];
          stackIn_2_0 = array$0;
          stackIn_2_1 = array$0;
          stackIn_2_2 = 0;
          if (tb.field_cb == null) {
            stackIn_3_3 = we.field_c;
          } else {
            stackIn_3_3 = tb.field_cb;
          }
          stackIn_2_1[stackIn_2_2] = stackIn_3_3;
          var5 = stackIn_2_0;
          DelegatingCanvas.field_c = 13;
          fp.field_z = 57;
          og.field_Wb = 3;
          ep.field_i = 23;
          hg.field_e = 51550 + (hi.field_w.nextInt(92) << 16);
          tm.field_g = 11;
          qm.field_a = 40;
          ek.field_kb = 72;
          ck.a((byte) 66);
          r.field_A = be.field_a;
          if (!r.field_A) {
            hd.a(true);
            BitPacketBuffer.field_q = jj.field_d;
          } else {
            if (param3.pack.packId != 0) {
              hd.a(true);
              BitPacketBuffer.field_q = jj.field_d;
            } else {
              if (param2 > 0) {
                hd.a(true);
                BitPacketBuffer.field_q = jj.field_d;
              }
            }
          }
          if (param0 != 16727) {
            field_t = 49;
          }
          oa.field_Sb = rd.a(param3.pack.metadata[param2].attributeByte, (byte) 19);
          sk.a(var5, param2, param3, 1, param1, -12665);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("cq.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    cq() {
    }

    static {
        field_q = "Kick <%0> from this game";
        field_i = "Names can only contain letters, numbers, spaces and underscores";
    }
}
