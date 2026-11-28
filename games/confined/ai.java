/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ai extends em {
    private String field_j;
    private long field_h;
    static String field_g;
    static int field_i;

    final void a(PacketBuffer param0, byte param1) {
        try {
          param0.writeLong(this.field_h, (byte) -96);
          if (param1 < 47) {
            this.field_h = -58L;
          }
          param0.writeBase38String(11404, this.field_j);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ai.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ai(long param0, String param1) {
        try {
          this.field_h = param0;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ai.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    si b(byte param0) {
        int var2 = -9 % ((51 - param0) / 57);
        return DefaultTextWidgetRenderer.field_e;
    }

    final static int a(int param0, String param1, bn param2, boolean param3, int param4, int param5, bn param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        PacketBuffer stackIn_16_0 = null;
        String stackIn_17_1 = null;
        PacketBuffer stackIn_19_0 = null;
        String stackIn_20_1 = null;
        int stackIn_29_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Confined.field_J ? 1 : 0;
        try {
          var14 = param6.a(-120);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param2.a(-75);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (null == kl.field_G &&
            !ShockwaveBlast.a(false, (byte) 17)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (lk.field_d == si.field_g) {
            vh.field_a.position = 0;
            ca.field_o = null;
            if (param1 == null) {
              ByteStorage.field_c.position = 0;
              ByteStorage.field_c.writeInt(-106, AgeValidator.field_h.nextInt());
              ByteStorage.field_c.writeInt(-103, AgeValidator.field_h.nextInt());
              stackIn_16_0 = ByteStorage.field_c;
              if (!param6.b(0)) {
                stackIn_17_1 = "";
              } else {
                stackIn_17_1 = var14;
              }
              ((PacketBuffer) (Object) stackIn_16_0).writePrefixedString(stackIn_17_1, (byte) 112);
              stackIn_19_0 = ByteStorage.field_c;
              if (!param2.b(0)) {
                stackIn_20_1 = "";
              } else {
                stackIn_20_1 = var8;
              }
              ((PacketBuffer) (Object) stackIn_19_0).writePrefixedString(stackIn_20_1, (byte) 28);
              vh.field_a.writeByte(110, 16);
              vh.field_a.position = vh.field_a.position + 1;
              var9 = vh.field_a.position;
              jf.a(ByteStorage.field_c, hk.field_a, vh.field_a, 0, an.field_r);
              vh.field_a.backpatchByteLength(25859, vh.field_a.position - var9);
            } else {
              var9 = 0;
              if (param3) {
                var9 = var9 | 1;
              }
              ByteStorage.field_c.position = 0;
              ByteStorage.field_c.writeInt(-98, AgeValidator.field_h.nextInt());
              ByteStorage.field_c.writeInt(-114, AgeValidator.field_h.nextInt());
              ByteStorage.field_c.writePrefixedString(var14, (byte) 45);
              ByteStorage.field_c.writePrefixedString(var8, (byte) 105);
              var15 = (CharSequence) ((Object) param1);
              ByteStorage.field_c.writePrefixedString(ka.a(var15, 23617), (byte) 75);
              ByteStorage.field_c.writeShort(param0, 8);
              ByteStorage.field_c.writeByte(114, param4);
              ByteStorage.field_c.writeByte(117, var9);
              vh.field_a.writeByte(101, 18);
              vh.field_a.position = vh.field_a.position + 2;
              var10 = vh.field_a.position;
              var11_ref_StringLifetime4 = pa.a(ii.b(false), 59);
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              vh.field_a.writeString(var11_ref_StringLifetime4, 123);
              jf.a(ByteStorage.field_c, hk.field_a, vh.field_a, 0, an.field_r);
              vh.field_a.backpatchShortLength(-var10 + vh.field_a.position, -109);
            }
            tb.a(-1, 123);
            lk.field_d = dg.field_p;
          }
          if (dg.field_p == lk.field_d &&
            ProgressDialog.a(1, (byte) -119)) {
            var9Lifetime1 = e.field_c.readUnsignedByte(32);
            e.field_c.position = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              lk.field_d = LabeledWidgetContainer.field_M;
              TextLayout.field_g = new String[var9Lifetime1 - 100];
            } else {
              if (248 == var9Lifetime1) {
                gb.a((byte) -94, ii.b(false));
                PasswordValidator.field_k = oj.field_y;
                dc.d(115);
                sg.field_y = false;
                stackIn_29_0 = var9Lifetime1;
                return stackIn_29_0;
              }
              if (99 == var9Lifetime1) {
                ProgressDialog.a(lb.c(-30316), (byte) 16);
                ca.field_o = new Boolean(DraggableWidgetContainer.a((byte) -73, e.field_c));
                e.field_c.position = 0;
              } else {
                Confined.field_F = var9Lifetime1;
                field_i = -1;
                lk.field_d = rf.field_c;
              }
            }
          }
          if (lk.field_d == LabeledWidgetContainer.field_M) {
            var9Lifetime2 = 2;
            if (ProgressDialog.a(var9Lifetime2, (byte) -126)) {
              var10Lifetime1 = e.field_c.readUnsignedShort((byte) 25);
              e.field_c.position = 0;
              if (ProgressDialog.a(var10Lifetime1, (byte) 49)) {
                var11 = TextLayout.field_g.length;
                for (var12 = 0; var11 > var12; var12++) {
                  TextLayout.field_g[var12] = e.field_c.readPrefixedString((byte) 31);
                }
                dc.d(103);
                sg.field_y = false;
                stackIn_42_0 = var11 + 100;
                return stackIn_42_0;
              }
            }
          }
          if (lk.field_d == rf.field_c &&
            jc.a(-77)) {
            if (Confined.field_F == 255) {
              var9_ref_String = e.field_c.readNullableString((byte) 102);
              if (var9_ref_String != null) {
                ConfirmedEmailAvailabilityValidator.a(var9_ref_String, ii.b(false), -1);
              }
            } else {
              PasswordValidator.field_k = e.field_c.readString(true);
            }
            dc.d(106);
            sg.field_y = false;
            stackIn_52_0 = Confined.field_F;
            return stackIn_52_0;
          }
          if (param5 < 121) {
            stackIn_55_0 = 33;
            return stackIn_55_0;
          }
          if (kl.field_G == null) {
            if (sg.field_y) {
              if (LabeledWidgetContainer.h(112) <= 30000L) {
                PasswordValidator.field_k = ka.field_G;
              } else {
                PasswordValidator.field_k = HomingProjectile.field_S;
              }
              sg.field_y = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = nd.field_s;
            nd.field_s = ac.field_b;
            sg.field_y = true;
            ac.field_b = var9Lifetime3;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("ai.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    final static void a(BitmapFont param0, ji param1, int param2, int param3, int param4, int param5, int param6, int param7, ji param8, int param9, int param10, int param11, int param12, ji param13, int param14, int param15, int param16, BitmapFont param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          nl.a(param0, param7, param17, 2);
          ue.a(param5, param11, param2, param9, 243);
          ud.a(param15, (byte) -12, param18);
          var21_int = -30 % ((-19 - param12) / 55);
          pb.a(param13, (byte) -71, param8, param16, param10, param14);
          kc.a(13421772, param3, param1, param20);
          SingleChildWidgetContainer.a(param19, (byte) -18, param6, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("ai.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -12875) {
          BitmapFont var2 = (BitmapFont) null;
          ai.a((BitmapFont) null, (ji) null, -92, 60, -114, 84, 108, 23, (ji) null, 15, -93, 33, 98, (ji) null, 19, 105, -6, (BitmapFont) null, -59, -38, -101);
        }
        field_g = null;
    }

    static {
        field_g = "Change display name";
    }
}
