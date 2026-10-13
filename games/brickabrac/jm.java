/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String field_l;
    int field_d;
    int field_h;
    byte[] field_c;
    int field_e;
    int field_j;
    int field_b;
    int field_a;
    static tq field_f;
    byte[] field_g;
    static String field_i;
    int field_k;

    final static nb a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          nb var5 = null;
          jo var5_ref = null;
          java.awt.Component var6 = null;
          nb stackIn_3_0 = null;
          jo stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 != -2414) {
              var6 = (java.awt.Component) null;
              jm.a((java.awt.Component) null, 85, -118, 37);
            }
            try {
              var4 = Class.forName("le");
              var5 = (nb) (var4.newInstance());
              var5.a(param0, param3, true, param1);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new jo();
              ((nb) ((Object) var5_ref)).a(param0, param3, true, param1);
              stackIn_5_0 = var5_ref;
              return (nb) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("jm.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        mm stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        boolean stackIn_3_5;
        boolean stackIn_4_6 = false;
        mh stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDeque var4 = null;
        Object var5 = null;
        mp var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        nn var16 = null;
        nn var17 = null;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          stackIn_3_0 = f.field_c.field_Qb;
          stackIn_3_1 = 2;
          stackIn_3_2 = param2 * (np.field_a * 3 + 6);
          stackIn_3_3 = np.field_a + 2;
          stackIn_3_4 = 22676;
          stackIn_3_5 = param0;
          stackIn_4_6 = (o.field_b == f.field_c.field_Qb);
          var3_int = ((mm) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_4_6) ? 1 : 0;
          var4 = f.field_c.field_Xb.field_bb;
          if (!param1) {
            return;
          }
          if (LevelMetadata.field_m != 2 &&
            LevelMetadata.field_m != 1) {
            f.field_c.field_eb = false;
            f.field_c.field_Qb.field_Qb.field_Mb = cm.field_t;
            jh.a(param1, f.field_c.field_Xb);
            return;
          }
          f.field_c.field_eb = true;
          f.field_c.field_Qb.field_Qb.field_Mb = null;
          var5 = null;
          var6 = (mp) (var4.first(-57));
          while (var6 != null) {
            var7 = 0;
            if (null == var6.field_bb) {
              var6.field_Xb = new mh(0L, vb.field_K);
              var6.a(var6.field_Xb, 0);
              var6.field_Yb = new mh(0L, vb.field_K);
              var6.a(var6.field_Yb, 0);
              var6.c(param1);
              var7 = 1;
            }
            var6.field_Ib = f.field_c.field_Xb.field_Ib;
            var6.field_Xb.a(np.field_a, 0, 0, var6.field_Ib, (byte) 64);
            var8 = 0;
            if (null != var6.field_Qb &&
              !var6.field_Qb.equals("")) {
              var6.field_Yb.field_wb = ok.field_g;
              var6.field_Yb.field_Y = 16737894;
              var8 = 1;
              var6.field_Yb.a(np.field_a, 0, 0, ok.field_g.canvasWidth + 3, (byte) 64);
            }
            var9 = 0;
            var10 = var6.field_Ib;
            if (var8 != 0) {
              var9 = ok.field_g.canvasWidth + 3;
              var10 = var10 - var9;
            }
            stackIn_20_0 = var6.field_Xb;
            if (0 < var10) {
              stackIn_21_1 = dh.a(var6.field_Xb.field_O, var6.field_Rb, var10);
            } else {
              stackIn_21_1 = var6.field_Rb;
            }
            stackIn_20_0.field_Mb = stackIn_21_1;
            stackIn_24_0 = (var6.field_Xb.field_Mb.equals(var6.field_Rb)) ? 0 : 1;
            var11 = stackIn_24_0;
            var6.field_Xb.a(np.field_a, 0, var9, var10, (byte) 64);
            if (var3_int == 0) {
              var6.field_C = np.field_a - var6.field_cb;
            }
            if (var7 != 0) {
              f.field_c.field_Xb.a((mh) (var5), 2, var6, 17290);
            }
            if (null != var6.field_Yb &&
              var6.field_Yb.field_kb) {
              ep.field_e = var6.field_Qb;
            } else {
              if (var6.field_Xb.field_kb &&
                var11 != 0) {
                ep.field_e = var6.field_Rb;
              }
            }
            if (var6.field_L != 0) {
              SpriteGeometry.a(-1, var6, f.field_c.field_Qb, (int[]) null, var6.field_ac, -1, (byte) -58, 0L, var6.field_Rb);
              var16 = bm.field_d;
              var13_ref_String = ng.field_e;
              var16.field_d.a(var13_ref_String, 7, (byte) 126);
              var17 = bm.field_d;
              var13 = tb.pressX;
              var14 = qo.pressY;
              var17.field_d.a(var14, -126, 0, 0, var13);
            }
            var5 = var6;
            var6 = (mp) (var4.next((byte) 116));
          }
          if (f.field_c.field_Tb.field_L != 0) {
            tn.field_m = new gq(f.field_c.field_Tb.field_Eb, f.field_c.field_Tb.field_db, f.field_c.field_Tb.field_Ib, f.field_c.field_Tb.field_cb, kg.field_e, ij.field_c, ad.field_l, ad.field_l);
            ij.field_d = 2;
          }
          if (0 == f.field_c.field_Wb.field_L) {
            return;
          }
          tn.field_m = new gq(f.field_c.field_Wb.field_Eb, f.field_c.field_Wb.field_db, f.field_c.field_Wb.field_Ib, f.field_c.field_Wb.field_cb, gn.field_A, ij.field_c, ad.field_l, ad.field_l);
          ij.field_d = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "jm.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static mb a(byte[] param0, byte param1) {
        mb var2 = null;
        RuntimeException var2_ref = null;
        mb stackIn_5_0 = null;
        mb stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 >= -7) {
            stackIn_5_0 = (mb) null;
            return stackIn_5_0;
          }
          var2 = new mb(param0, ag.field_K, dl.field_d, jh.field_b, gg.field_t, qp.field_c, cn.field_a);
          MotionWaypoint.d((byte) 96);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("jm.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(boolean param0, char param1) {
        if (!param0) {
          field_l = (String) null;
        }
        return String.valueOf(param1);
    }

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pe var4_ref_pe = null;
        pn var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        BitPacketBuffer var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var10 = jl.field_e;
          if (param0 != 22) {
            field_l = (String) null;
          }
          var2 = var10.readUnsignedByte(255);
          var3 = var10.readUnsignedByte(param0 + 233);
          if (var2 == 0) {
            var4_ref_pe = (pe) (ob.field_F.first(-37));
            if (var4_ref_pe == null) {
              hn.a((byte) 57);
              return;
            }
            var5_int = ga.field_j - var10.position;
            var12 = var4_ref_pe.field_m;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5_int) {
              var5_int = var12.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte(255) << (ik.a(3, var7) << 8));
            }
            var4_ref_pe.field_v = true;
            var4_ref_pe.unlink((byte) 111);
            return;
          }
          if (var2 == 1) {
            var4 = var10.readSignedSmart(-1342);
            var5 = (pn) (qa.field_t.first(-19));
            while (var5 != null) {
              if (var3 != var5.field_p ||
                var4 != var5.field_n) {
                var5 = (pn) (qa.field_t.next((byte) 116));
                continue;
              }
              break;
            }
            if (var5 != null) {
              var5.unlink((byte) 111);
              return;
            }
            hn.a((byte) 110);
            return;
          }
          rk.a("LR1: " + eq.c((byte) -96), (Throwable) null, 53);
          hn.a((byte) 52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "jm.D(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        field_f = null;
        field_i = null;
        field_l = null;
        if (param0 != 31) {
          field_l = (String) null;
        }
    }

    static {
        field_l = "The following settings need to be changed:  ";
        field_f = new tq();
        field_i = "Please enter your date of birth to enable chat:";
    }
}
