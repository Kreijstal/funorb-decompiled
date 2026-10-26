/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ka {
    static Sprite[] field_a;

    final static String a(int param0) {
        if (param0 <= -94) {
          String var1 = "";
          if (vr.field_b != null) {
            var1 = vr.field_b.d(false);
          }
          if (var1.length() == 0) {
            var1 = ec.b((byte) -128);
          }
          if (var1.length() == 0) {
            var1 = vj.field_a;
          }
          return var1;
        }
        field_a = (Sprite[]) null;
        String var1Lifetime1 = "";
        if (vr.field_b != null) {
          var1Lifetime1 = vr.field_b.d(false);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = ec.b((byte) -128);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = vj.field_a;
        }
        return var1Lifetime1;
    }

    final static boolean a(byte param0, int[] param1) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (ca.field_f != wq.field_e) {
            return false;
          }
          if (param0 <= 75) {
            field_a = (Sprite[]) null;
          }
          var2_long = kh.a(-125);
          if (tj.field_m != 0 &&
            0 > ec.field_g) {
            m var4_ref_m = (m) (oo.field_T.first(268435455));
            if (var4_ref_m != null &&
              var2_long > var4_ref_m.field_e) {
              var4_ref_m.unlink(-123);
              ag.field_s = var4_ref_m.field_h.length;
              IntKeyLookup.incomingPacket.position = 0;
              for (int var5_int = 0; ag.field_s > var5_int; var5_int++) {
                IntKeyLookup.incomingPacket.payload[var5_int] = var4_ref_m.field_h[var5_int];
              }
              ScoreSubmission.field_l = kg.field_b;
              kg.field_b = hi.field_w;
              hi.field_w = qs.field_b;
              qs.field_b = var4_ref_m.field_i;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("ka.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
        int stackIn_19_0 = ec.field_g;
        try {
          while (true) {
            if (stackIn_19_0 < 0) {
              IntKeyLookup.incomingPacket.position = 0;
              if (!wo.a(1, true)) {
                return false;
              }
              ec.field_g = IntKeyLookup.incomingPacket.j((byte) -53);
              IntKeyLookup.incomingPacket.position = 0;
              ag.field_s = param1[ec.field_g];
            }
            if (!rm.a(0)) {
              return false;
            }
            if (tj.field_m == 0) {
              ScoreSubmission.field_l = kg.field_b;
              kg.field_b = hi.field_w;
              hi.field_w = qs.field_b;
              qs.field_b = ec.field_g;
              ec.field_g = -1;
              return true;
            }
            int var4 = tj.field_m;
            if (0.0 != wk.field_g) {
              var4 = (int)((double)var4 + vr.field_h.nextGaussian() * wk.field_g);
              if (0 > var4) {
                var4 = 0;
              }
            }
            m var5 = new m((long)var4 + var2_long, ec.field_g, new byte[ag.field_s]);
            for (int var6 = 0; ag.field_s > var6; var6++) {
              var5.field_h[var6] = IntKeyLookup.incomingPacket.payload[var6];
            }
            oo.field_T.addLast(88, var5);
            ec.field_g = -1;
            stackIn_19_0 = ec.field_g;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("ka.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static void a(int param0, long param1, String param2, int param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, int param10, int param11, rk param12, int param13) {
        try {
          String stackIn_17_2 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            IntKeyLookup.incomingPacket = new CipherPacketBuffer(param7);
            if (param0 != -31808) {
              return;
            }
            q.outgoingPacket = new CipherPacketBuffer(param3);
            ca.field_h = param4;
            ub.field_g = param11;
            HighscoreNameEntry.field_a = param5;
            ca.field_g = param2;
            ii.field_j = param12;
            sg.field_b = param10;
            ut.field_a = param8;
            fs.field_a = param1;
            ko.field_f = param13;
            te.field_h = param6;
            id.field_d = param9;
            if (null == ii.field_j.field_g) {
              return;
            }
            try {
              BitmapFontMetrics.field_g = new gh(ii.field_j.field_g, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              IOException var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_16_0 = var15_ref;
            StringBuilder stackIn_16_1 = new StringBuilder().append("ka.I(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            if (param12 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 == -126) {
          return;
        }
        field_a = (Sprite[]) null;
    }

    final static sa b(byte param0) {
        if (ao.field_b == null) {
          ao.field_b = new sa();
          ao.field_b.a(qo.field_b, 3);
          ao.field_b.field_o = 0;
          ao.field_b.field_i = 14;
          ao.field_b.field_d = 7697781;
          ao.field_b.field_l = 4;
          ao.field_b.field_j = 2763306;
          ao.field_b.field_e = 5;
          ao.field_b.field_f = 6;
          ao.field_b.field_b = oi.field_c;
          if (param0 > 98) {
            return ao.field_b;
          }
          return (sa) null;
        }
        if (param0 > 98) {
          return ao.field_b;
        }
        return (sa) null;
    }

    static {
    }
}
